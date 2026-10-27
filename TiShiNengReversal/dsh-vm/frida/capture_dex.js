/*
 * capture_dex.js —— 在 360 把解密好的 dex 交给类加载器时截流落盘
 * 钩子: dalvik.system.InMemoryDexClassLoader 构造器 (ByteBuffer / ByteBuffer[])
 *       dalvik.system.DexFile.openInMemoryDexFile (若可见)
 * 落盘: /data/data/com.bxkj.student/files/dexcap/ (root 后 adb pull)
 */
Java.perform(function () {
    var wrote = 0;
    var dir = '/data/data/com.bxkj.student/files/dexcap';
    try {
        var F = Java.use('java.io.File').$new(dir);
        if (!F.exists()) F.mkdirs();
    } catch (e) { console.log('[CAP] mkdir err: ' + e); }

    function save(buf, tag) {
        try {
            var dup = buf.duplicate();
            var size = dup.remaining();
            var arr = Java.array('byte', size);
            dup.get(arr);
            var p = dir + '/cap_' + tag + '_' + (wrote++) + '_sz' + size + '.dex';
            var fos = Java.use('java.io.FileOutputStream').$new(p);
            fos.write(arr);
            fos.close();
            console.log('[CAP] saved ' + p + ' size=' + size);
        } catch (e) { console.log('[CAP ERR] ' + e); }
    }

    try {
        var IDCL = Java.use('dalvik.system.InMemoryDexClassLoader');
        IDCL.$init.overload('java.nio.ByteBuffer', 'java.lang.ClassLoader').implementation = function (buf, cl) {
            console.log('[IDCL] ByteBuffer ctor hit');
            save(buf, 'idcl_bb');
            return this.$init(buf, cl);
        };
        IDCL.$init.overload('[Ljava.nio.ByteBuffer;', 'java.lang.ClassLoader').implementation = function (bufs, cl) {
            console.log('[IDCL] ByteBuffer[] ctor hit n=' + bufs.length);
            for (var i = 0; i < bufs.length; i++) save(bufs[i], 'idcl_arr' + i);
            return this.$init(bufs, cl);
        };
        console.log('[CAP] InMemoryDexClassLoader hooked');
    } catch (e) { console.log('[CAP] IDCL hook skip: ' + e); }

    try {
        var DF = Java.use('dalvik.system.DexFile');
        DF.openInMemoryDexFile.overload('java.nio.ByteBuffer', 'java.lang.ClassLoader').implementation = function (buf, cl) {
            console.log('[DF] openInMemoryDexFile hit');
            save(buf, 'df_mem');
            return this.openInMemoryDexFile(buf, cl);
        };
        console.log('[CAP] DexFile.openInMemoryDexFile hooked');
    } catch (e) { console.log('[CAP] DF hook skip: ' + e); }

    // loadClass 日志 (只记业务/壳相关类)
    try {
        var CL = Java.use('java.lang.ClassLoader');
        CL.loadClass.overload('java.lang.String').implementation = function (name) {
            if (name && (name.indexOf('com.bxkj') >= 0 || name.indexOf('com.acse') >= 0 ||
                         name.indexOf('com.tianyu') >= 0 || name.indexOf('com.stub') >= 0)) {
                console.log('[LOAD] ' + name);
            }
            return this.loadClass(name);
        };
    } catch (e) { console.log('[CAP] loadClass hook skip: ' + e); }

    console.log('[CAP] all hooks installed, dir=' + dir);
});
