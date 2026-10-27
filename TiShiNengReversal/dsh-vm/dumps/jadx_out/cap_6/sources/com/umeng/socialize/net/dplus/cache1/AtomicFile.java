package com.umeng.socialize.net.dplus.cache1;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class AtomicFile {
    private final java.io.File a;
    private final java.io.File b;

    public AtomicFile(java.io.File r3) {
            r2 = this;
            r2.<init>()
            r2.a = r3
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r3.getPath()
            r1.append(r3)
            java.lang.String r3 = ".bak"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            r2.b = r0
            return
    }

    private static void a(java.io.File r3, java.io.File r4) throws java.io.IOException {
            java.lang.System.currentTimeMillis()
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L2d
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L2d
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L2a
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L2a
            r4 = 8192(0x2000, float:1.148E-41)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L1d
        L12:
            int r0 = r1.read(r4)     // Catch: java.lang.Throwable -> L1d
            if (r0 <= 0) goto L20
            r2 = 0
            r3.write(r4, r2, r0)     // Catch: java.lang.Throwable -> L1d
            goto L12
        L1d:
            r4 = move-exception
        L1e:
            r0 = r1
            goto L2f
        L20:
            r1.close()
            r3.close()
            java.lang.System.currentTimeMillis()
            return
        L2a:
            r4 = move-exception
            r3 = r0
            goto L1e
        L2d:
            r4 = move-exception
            r3 = r0
        L2f:
            if (r0 == 0) goto L34
            r0.close()
        L34:
            if (r3 == 0) goto L39
            r3.close()
        L39:
            throw r4
    }

    static boolean a(java.io.FileOutputStream r1) {
            if (r1 == 0) goto L12
            java.io.FileDescriptor r1 = r1.getFD()     // Catch: java.io.IOException -> La
            r1.sync()     // Catch: java.io.IOException -> La
            goto L12
        La:
            r1 = move-exception
            java.lang.String r0 = com.umeng.socialize.utils.UmengText.CACHE.CACHEFILE
            com.umeng.socialize.utils.SLog.error(r0, r1)
            r1 = 0
            return r1
        L12:
            r1 = 1
            return r1
    }

    public void delete() {
            r1 = this;
            java.io.File r0 = r1.a
            r0.delete()
            java.io.File r0 = r1.b
            r0.delete()
            return
    }

    public void failWrite(java.io.FileOutputStream r2) {
            r1 = this;
            if (r2 == 0) goto L1b
            a(r2)
            r2.close()     // Catch: java.io.IOException -> L15
            java.io.File r2 = r1.a     // Catch: java.io.IOException -> L15
            r2.delete()     // Catch: java.io.IOException -> L15
            java.io.File r2 = r1.b     // Catch: java.io.IOException -> L15
            java.io.File r0 = r1.a     // Catch: java.io.IOException -> L15
            r2.renameTo(r0)     // Catch: java.io.IOException -> L15
            return
        L15:
            r2 = move-exception
            java.lang.String r0 = com.umeng.socialize.utils.UmengText.CACHE.CACHEFILE
            com.umeng.socialize.utils.SLog.error(r0, r2)
        L1b:
            return
    }

    public void finishWrite(java.io.FileOutputStream r2) {
            r1 = this;
            if (r2 == 0) goto L14
            a(r2)
            r2.close()     // Catch: java.io.IOException -> Le
            java.io.File r2 = r1.b     // Catch: java.io.IOException -> Le
            r2.delete()     // Catch: java.io.IOException -> Le
            return
        Le:
            r2 = move-exception
            java.lang.String r0 = com.umeng.socialize.utils.UmengText.CACHE.CACHEFILE
            com.umeng.socialize.utils.SLog.error(r0, r2)
        L14:
            return
    }

    public java.io.File getBaseFile() {
            r1 = this;
            java.io.File r0 = r1.a
            return r0
    }

    public java.io.FileInputStream openRead() throws java.io.FileNotFoundException {
            r2 = this;
            java.io.File r0 = r2.b
            boolean r0 = r0.exists()
            if (r0 == 0) goto L14
            java.io.File r0 = r2.a
            r0.delete()
            java.io.File r0 = r2.b
            java.io.File r1 = r2.a
            r0.renameTo(r1)
        L14:
            java.io.FileInputStream r0 = new java.io.FileInputStream
            java.io.File r1 = r2.a
            r0.<init>(r1)
            return r0
    }

    public byte[] readFully() throws java.io.IOException {
            r6 = this;
            java.io.FileInputStream r0 = r6.openRead()
            int r1 = r0.available()     // Catch: java.lang.Throwable -> L29
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L29
            r2 = 0
            r3 = 0
        Lc:
            int r4 = r1.length     // Catch: java.lang.Throwable -> L29
            int r4 = r4 - r3
            int r4 = r0.read(r1, r3, r4)     // Catch: java.lang.Throwable -> L29
            if (r4 > 0) goto L18
            r0.close()
            return r1
        L18:
            int r3 = r3 + r4
            int r4 = r0.available()     // Catch: java.lang.Throwable -> L29
            int r5 = r1.length     // Catch: java.lang.Throwable -> L29
            int r5 = r5 - r3
            if (r4 <= r5) goto Lc
            int r4 = r4 + r3
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L29
            java.lang.System.arraycopy(r1, r2, r4, r2, r3)     // Catch: java.lang.Throwable -> L29
            r1 = r4
            goto Lc
        L29:
            r1 = move-exception
            r0.close()
            throw r1
    }

    public java.io.FileOutputStream startWrite(boolean r4) throws java.io.IOException {
            r3 = this;
            java.io.File r0 = r3.a
            boolean r0 = r0.exists()
            if (r0 == 0) goto L32
            java.io.File r0 = r3.b
            boolean r0 = r0.exists()
            if (r0 != 0) goto L2d
            java.io.File r0 = r3.a
            java.io.File r1 = r3.b
            boolean r0 = r0.renameTo(r1)
            if (r0 != 0) goto L25
            java.io.File r0 = r3.a
            java.util.Objects.toString(r0)
            java.io.File r0 = r3.b
            java.util.Objects.toString(r0)
            goto L32
        L25:
            java.io.File r0 = r3.b
            java.io.File r1 = r3.a
            a(r0, r1)
            goto L32
        L2d:
            java.io.File r0 = r3.a
            r0.delete()
        L32:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.io.FileNotFoundException -> L3a
            java.io.File r1 = r3.a     // Catch: java.io.FileNotFoundException -> L3a
            r0.<init>(r1, r4)     // Catch: java.io.FileNotFoundException -> L3a
            return r0
        L3a:
            r0 = move-exception
            java.io.File r1 = r3.a
            java.io.File r1 = r1.getParentFile()
            boolean r1 = r1.mkdirs()
            if (r1 != 0) goto L4c
            java.lang.String r1 = com.umeng.socialize.utils.UmengText.CACHE.CACHEFILE
            com.umeng.socialize.utils.SLog.error(r1, r0)
        L4c:
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.io.FileNotFoundException -> L54
            java.io.File r2 = r3.a     // Catch: java.io.FileNotFoundException -> L54
            r1.<init>(r2, r4)     // Catch: java.io.FileNotFoundException -> L54
            goto L5a
        L54:
            java.lang.String r4 = com.umeng.socialize.utils.UmengText.CACHE.CACHEFILE
            com.umeng.socialize.utils.SLog.error(r4, r0)
            r1 = 0
        L5a:
            return r1
    }
}
