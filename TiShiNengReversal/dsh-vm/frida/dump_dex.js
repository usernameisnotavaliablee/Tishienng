/*
 * dump_dex.js —— 全内存扫 dex 魔数并 dump（native，无 Java，无 hook，避免 360 崩溃）。
 * 经诊断确认：真 dex 位于 rwx 匿名区，T+5s 左右仍在内存（此后被 360 抹掉）。
 * 用 native libc write 直接落盘到 app files 目录，避免 send 大 payload。
 */
(function () {
    var pOpen = Module.getExportByName('libc.so', 'open');
    var pWrite = Module.getExportByName('libc.so', 'write');
    var pClose = Module.getExportByName('libc.so', 'close');
    var openFn = new NativeFunction(pOpen, 'int', ['pointer', 'int', 'int']);
    var writeFn = new NativeFunction(pWrite, 'long', ['int', 'pointer', 'long']);
    var closeFn = new NativeFunction(pClose, 'int', ['int']);

    var DIR = '/data/data/com.bxkj.student/files/dexcap/';
    var seen = {};
    var seq = 0;

    function writeDex(addr, size) {
        var name = DIR + 'cap_' + (seq++) + '_sz' + size + '.dex';
        var nameBuf = Memory.allocUtf8String(name);
        var fd = openFn(nameBuf, 0x241, 0x1a0); // O_WRONLY|O_CREAT|O_TRUNC, 0640
        if (fd < 0) { send({ type: 'log', msg: '[DUMP] open fail ' + name + ' fd=' + fd }); return; }
        var off = 0;
        var CHUNK = 0x100000; // 1MB
        while (off < size) {
            var len = Math.min(CHUNK, size - off);
            var src = addr.add(off);
            var wr = writeFn(fd, src, len);
            if (wr < 0) { send({ type: 'log', msg: '[DUMP] write fail ' + name }); break; }
            off += wr;
        }
        closeFn(fd);
        send({ type: 'log', msg: '[DUMP] wrote ' + name + ' size=' + size });
    }

    function isMagic(b, i) {
        return b[i] === 0x64 && b[i+1] === 0x65 && b[i+2] === 0x78 && b[i+3] === 0x0a &&
               b[i+4] === 0x30 && b[i+5] === 0x33 &&
               (b[i+6] === 0x35 || b[i+6] === 0x37 || b[i+6] === 0x38 || b[i+6] === 0x39);
    }

    function scan(tag) {
        var ranges = Process.enumerateRanges('r--');
        var cand = ranges.filter(function (r) {
            if (r.size < 0x1000 || r.size > 0x8000000) return false; // 跳过超大堆/小段
            if (r.file && r.file.path && r.file.path.indexOf('memfd') < 0 && r.file.path.indexOf('dex') < 0) return false; // 跳过文件映射
            return true;
        });
        send({ type: 'log', msg: '[SCAN:' + tag + '] ranges=' + ranges.length + ' candidates=' + cand.length });
        cand.forEach(function (r) {
            var CHUNK = 0x400000;
            for (var off = 0; off < r.size; off += CHUNK) {
                var len = Math.min(CHUNK, r.size - off);
                var base = r.base.add(off);
                var u8;
                try { u8 = new Uint8Array(Memory.readByteArray(base, len)); } catch (e) { continue; }
                for (var i = 0; i + 0x70 <= u8.length; i++) {
                    if (isMagic(u8, i)) {
                        var da = base.add(i);
                        var key = da.toString();
                        if (seen[key]) continue;
                        var fileSize = 0, headerSize = 0, endian = 0;
                        try {
                            fileSize = da.add(32).readU32();
                            headerSize = da.add(36).readU32();
                            endian = da.add(40).readU32();
                        } catch (e) { continue; }
                        if (fileSize > 0x100 && fileSize < 0x8000000 && headerSize > 0 && headerSize < fileSize) {
                            seen[key] = true;
                            send({ type: 'log', msg: '[SCAN:' + tag + '] FOUND dex @' + key + ' fileSize=' + fileSize + ' header=' + headerSize + ' endian=0x' + endian.toString(16) + ' prot=' + r.protection + ' file=' + (r.file ? r.file.path : 'anon') });
                            writeDex(da, fileSize);
                        }
                    }
                }
            }
        });
        send({ type: 'log', msg: '[SCAN:' + tag + '] done, total=' + seq });
    }

    [500, 1500, 3000, 5000, 8000, 12000, 18000, 26000].forEach(function (ms) {
        setTimeout(function () { scan('t+' + ms); }, ms);
    });
    send({ type: 'log', msg: '[DUMP] armed' });
})();
