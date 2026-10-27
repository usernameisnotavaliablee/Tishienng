package com.kuaishou.weapon.p0;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class d {
    public static final int a = 2048;
    public static final java.lang.String b = ".gz";

    public d() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a(java.io.InputStream r5, java.io.OutputStream r6) {
            java.util.zip.GZIPOutputStream r0 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L21
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L21
            r6 = 2048(0x800, float:2.87E-42)
            byte[] r1 = new byte[r6]     // Catch: java.lang.Throwable -> L15
        L9:
            r2 = 0
            int r3 = r5.read(r1, r2, r6)     // Catch: java.lang.Throwable -> L15
            r4 = -1
            if (r3 == r4) goto L17
            r0.write(r1, r2, r3)     // Catch: java.lang.Throwable -> L15
            goto L9
        L15:
            goto L22
        L17:
            r0.flush()     // Catch: java.lang.Throwable -> L15
            r0.finish()     // Catch: java.lang.Throwable -> L15
            r0.close()     // Catch: java.lang.Throwable -> L15
            return
        L21:
            r0 = 0
        L22:
            if (r0 == 0) goto L28
            r0.close()     // Catch: java.lang.Exception -> L28
        L28:
            return
    }

    public static byte[] a(byte[] r3) {
            r0 = 0
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L2a
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L2a
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L27
            r3.<init>()     // Catch: java.lang.Throwable -> L27
            a(r1, r3)     // Catch: java.lang.Throwable -> L22
            byte[] r0 = r3.toByteArray()     // Catch: java.lang.Throwable -> L22
            r3.flush()     // Catch: java.lang.Throwable -> L22
            r3.close()     // Catch: java.lang.Throwable -> L22
            r1.close()     // Catch: java.lang.Throwable -> L22
            r3.close()     // Catch: java.lang.Exception -> L1e
        L1e:
            r1.close()     // Catch: java.lang.Exception -> L3a
            goto L3a
        L22:
            r2 = r0
            r0 = r3
            r3 = r2
            goto L2d
        L27:
            r3 = r0
            goto L2d
        L2a:
            r3 = r0
            r1 = r3
        L2d:
            if (r0 == 0) goto L34
            r0.close()     // Catch: java.lang.Exception -> L33
            goto L34
        L33:
        L34:
            if (r1 == 0) goto L39
            r1.close()     // Catch: java.lang.Exception -> L39
        L39:
            r0 = r3
        L3a:
            return r0
    }

    public static void b(java.io.InputStream r5, java.io.OutputStream r6) {
            r0 = 0
            java.util.zip.GZIPInputStream r1 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26
            r5 = 2048(0x800, float:2.87E-42)
            byte[] r0 = new byte[r5]     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L19
        La:
            r2 = 0
            int r3 = r1.read(r0, r2, r5)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L19
            r4 = -1
            if (r3 == r4) goto L1b
            r6.write(r0, r2, r3)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L19
            goto La
        L16:
            r5 = move-exception
            r0 = r1
            goto L28
        L19:
            goto L22
        L1b:
            r1.close()     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L19
            r1.close()     // Catch: java.lang.Exception -> L34
            return
        L22:
            r0 = r1
            goto L2e
        L24:
            r5 = move-exception
            goto L28
        L26:
            goto L2e
        L28:
            if (r0 == 0) goto L2d
            r0.close()     // Catch: java.lang.Exception -> L2d
        L2d:
            throw r5
        L2e:
            if (r0 == 0) goto L34
            r0.close()     // Catch: java.lang.Exception -> L34
        L34:
            return
    }

    public static byte[] b(byte[] r3) {
            r0 = 0
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L27
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L27
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L25
            r2.<init>()     // Catch: java.lang.Throwable -> L25
            b(r1, r2)     // Catch: java.lang.Throwable -> L22
            byte[] r3 = r2.toByteArray()     // Catch: java.lang.Throwable -> L22
            r2.flush()     // Catch: java.lang.Throwable -> L22
            r2.close()     // Catch: java.lang.Throwable -> L22
            r1.close()     // Catch: java.lang.Throwable -> L22
            r2.close()     // Catch: java.lang.Exception -> L1e
        L1e:
            r1.close()     // Catch: java.lang.Exception -> L33
            goto L33
        L22:
            r0 = r2
            goto L29
        L25:
            goto L29
        L27:
            r1 = r0
        L29:
            if (r0 == 0) goto L30
            r0.close()     // Catch: java.lang.Exception -> L2f
            goto L30
        L2f:
        L30:
            if (r1 == 0) goto L33
            goto L1e
        L33:
            return r3
    }
}
