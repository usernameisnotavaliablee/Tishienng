/*
 * memscan.js —— 纯 native 内存扫描 dump（无 Java bridge，规避 360 DisableVerifier 崩溃）。
 * 策略：1) hook art::ClassLinker::DefineClass，首次定义业务类时立即全内存扫 dex；
 *       2) 早期多时间点扫描兜底（360 加载 dex 后可能很快抹掉魔数）。
 */
(function () {
    var seen = {};
    var seq = 0;

    function isDexMagic(b, i) {
        return b[i] === 0x64 && b[i+1] === 0x65 && b[i+2] === 0x78 && b[i+3] === 0x0a &&
               b[i+4] === 0x30 && b[i+5] === 0x33 &&
               (b[i+6] === 0x35 || b[i+6] === 0x37 || b[i+6] === 0x38 || b[i+6] === 0x39);
    }

    function scan(tag) {
        var ranges = Process.enumerateRanges('r--');
        send({ type: 'log', msg: '[MEMSCAN:' + tag + '] scanning ' + ranges.length + ' ranges' });
        ranges.forEach(function (r) {
            if (r.size < 0x1000) return;
            var CHUNK = 0x400000;
            for (var off = 0; off < r.size; off += CHUNK) {
                var len = Math.min(CHUNK, r.size - off);
                var addr = r.base.add(off);
                var u8;
                try {
                    u8 = new Uint8Array(Memory.readByteArray(addr, len));
                } catch (e) { continue; }
                for (var i = 0; i + 0x70 <= u8.length; i++) {
                    if (isDexMagic(u8, i)) {
                        var da = addr.add(i);
                        var key = da.toString();
                        if (seen[key]) continue;
                        var fileSize, headerSize, endianTag;
                        try {
                            fileSize = da.add(32).readU32();
                            headerSize = da.add(36).readU32();
                            endianTag = da.add(40).readU32();
                        } catch (e) { continue; }
                        if (fileSize > 0x100 && fileSize < 0x8000000 &&
                            headerSize > 0 && headerSize < fileSize &&
                            endianTag === 0x12345678) {
                            seen[key] = true;
                            try {
                                var buf = Memory.readByteArray(da, fileSize);
                                send({ type: 'dex', idx: seq, addr: key, size: fileSize, headerSize: headerSize }, buf);
                                send({ type: 'log', msg: '[MEMSCAN:' + tag + '] FOUND dex @' + key + ' size=' + fileSize });
                                seq++;
                            } catch (e) {
                                send({ type: 'log', msg: '[MEMSCAN:' + tag + '] read err ' + e });
                            }
                        }
                    }
                }
            }
        });
        send({ type: 'scan_done', tag: tag, count: seq });
    }

    var triggered = false;
    function triggerScan() {
        if (triggered) return;
        triggered = true;
        scan('trigger');
    }

    // 1) DefineClass 钩子：定义业务类时立即扫描
    var defClass = Module.findExportByName('libart.so',
        '_ZN3art11ClassLinker11DefineClassEPNS_6ThreadEPKcmNS_6HandleINS_6mirror11ClassLoaderEEERKNS_7DexFileERKNS_3dex8ClassDefE');
    if (defClass) {
        Interceptor.attach(defClass, {
            onEnter: function (args) {
                try {
                    var desc = args[1].readUtf8String();
                    if (desc && (desc.indexOf('bxkj') >= 0 || desc.indexOf('acse') >= 0 || desc.indexOf('tianyu') >= 0)) {
                        send({ type: 'log', msg: '[MEMSCAN] DefineClass trigger: ' + desc });
                        triggerScan();
                    }
                } catch (e) {}
            }
        });
        send({ type: 'log', msg: '[MEMSCAN] hooked ClassLinker::DefineClass' });
    } else {
        send({ type: 'log', msg: '[MEMSCAN] DefineClass symbol not found' });
    }

    // 2) 早期多时间点扫描
    [1200, 2200, 3200, 4500, 6000, 8000, 11000, 15000, 21000, 30000].forEach(function (ms) {
        setTimeout(function () { if (!triggered) scan('t+' + ms); }, ms);
    });
    send({ type: 'log', msg: '[MEMSCAN] armed' });
})();
