package cn.jiguang.commons.L;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class p {
    public p() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(java.io.Closeable r0) {
            if (r0 == 0) goto L5
            r0.close()     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public static byte[] a(byte[] r6) {
            if (r6 == 0) goto L44
            int r0 = r6.length
            if (r0 != 0) goto L6
            goto L44
        L6:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r6)
            r6 = 0
            java.util.zip.GZIPInputStream r2 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L39
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L39
            r6 = 256(0x100, float:3.59E-43)
            byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> L25
        L1a:
            int r3 = r2.read(r6)     // Catch: java.lang.Throwable -> L25
            if (r3 < 0) goto L27
            r4 = 0
            r0.write(r6, r4, r3)     // Catch: java.lang.Throwable -> L25
            goto L1a
        L25:
            r6 = move-exception
            goto L35
        L27:
            byte[] r6 = r0.toByteArray()     // Catch: java.lang.Throwable -> L25
            a(r0)
            a(r1)
            a(r2)
            return r6
        L35:
            r5 = r2
            r2 = r6
            r6 = r5
            goto L3a
        L39:
            r2 = move-exception
        L3a:
            a(r0)
            a(r1)
            a(r6)
            throw r2
        L44:
            return r6
    }
}
