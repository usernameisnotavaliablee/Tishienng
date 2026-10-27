package org.apache.commons.net.io;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class l {
    public static final int a = 1024;

    private l() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a(java.io.Closeable r0) {
            if (r0 == 0) goto L5
            r0.close()     // Catch: java.io.IOException -> L5
        L5:
            return
    }

    public static void b(java.net.Socket r0) {
            if (r0 == 0) goto L5
            r0.close()     // Catch: java.io.IOException -> L5
        L5:
            return
    }

    public static final long c(java.io.Reader r1, java.io.Writer r2) throws org.apache.commons.net.io.CopyStreamException {
            r0 = 1024(0x400, float:1.435E-42)
            long r1 = d(r1, r2, r0)
            return r1
    }

    public static final long d(java.io.Reader r6, java.io.Writer r7, int r8) throws org.apache.commons.net.io.CopyStreamException {
            r3 = -1
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            long r6 = e(r0, r1, r2, r3, r5)
            return r6
    }

    public static final long e(java.io.Reader r11, java.io.Writer r12, int r13, long r14, org.apache.commons.net.io.c r16) throws org.apache.commons.net.io.CopyStreamException {
            if (r13 <= 0) goto L3
            goto L5
        L3:
            r13 = 1024(0x400, float:1.435E-42)
        L5:
            char[] r13 = new char[r13]
            r0 = 0
            r1 = r0
        La:
            int r6 = r11.read(r13)     // Catch: java.io.IOException -> L34
            r0 = -1
            if (r6 == r0) goto L51
            if (r6 != 0) goto L37
            int r0 = r11.read()     // Catch: java.io.IOException -> L34
            if (r0 >= 0) goto L1a
            goto L51
        L1a:
            r12.write(r0)     // Catch: java.io.IOException -> L34
            r12.flush()     // Catch: java.io.IOException -> L34
            r3 = 1
            long r6 = r1 + r3
            if (r16 == 0) goto L32
            r8 = 1
            r9 = r14
            r5 = r16
            r5.c(r6, r8, r9)     // Catch: java.io.IOException -> L2e
            goto L32
        L2e:
            r0 = move-exception
            r11 = r0
            r1 = r6
            goto L52
        L32:
            r1 = r6
            goto La
        L34:
            r0 = move-exception
            r11 = r0
            goto L52
        L37:
            r0 = 0
            r12.write(r13, r0, r6)     // Catch: java.io.IOException -> L34
            r12.flush()     // Catch: java.io.IOException -> L34
            long r3 = (long) r6
            long r1 = r1 + r3
            if (r16 == 0) goto L4e
            r7 = r14
            r3 = r16
            r4 = r1
            r3.c(r4, r6, r7)     // Catch: java.io.IOException -> L4a
            goto L4f
        L4a:
            r0 = move-exception
            r11 = r0
            r1 = r4
            goto L52
        L4e:
            r4 = r1
        L4f:
            r1 = r4
            goto La
        L51:
            return r1
        L52:
            org.apache.commons.net.io.CopyStreamException r12 = new org.apache.commons.net.io.CopyStreamException
            java.lang.String r13 = "IOException caught while copying."
            r12.<init>(r13, r1, r11)
            throw r12
    }

    public static final long f(java.io.InputStream r1, java.io.OutputStream r2) throws org.apache.commons.net.io.CopyStreamException {
            r0 = 1024(0x400, float:1.435E-42)
            long r1 = g(r1, r2, r0)
            return r1
    }

    public static final long g(java.io.InputStream r6, java.io.OutputStream r7, int r8) throws org.apache.commons.net.io.CopyStreamException {
            r3 = -1
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            long r6 = h(r0, r1, r2, r3, r5)
            return r6
    }

    public static final long h(java.io.InputStream r7, java.io.OutputStream r8, int r9, long r10, org.apache.commons.net.io.c r12) throws org.apache.commons.net.io.CopyStreamException {
            r6 = 1
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r12
            long r7 = i(r0, r1, r2, r3, r5, r6)
            return r7
    }

    public static final long i(java.io.InputStream r11, java.io.OutputStream r12, int r13, long r14, org.apache.commons.net.io.c r16, boolean r17) throws org.apache.commons.net.io.CopyStreamException {
            if (r13 <= 0) goto L3
            goto L5
        L3:
            r13 = 1024(0x400, float:1.435E-42)
        L5:
            byte[] r13 = new byte[r13]
            r0 = 0
            r1 = r0
        La:
            int r6 = r11.read(r13)     // Catch: java.io.IOException -> L23
            r0 = -1
            if (r6 == r0) goto L56
            if (r6 != 0) goto L3a
            int r0 = r11.read()     // Catch: java.io.IOException -> L23
            if (r0 >= 0) goto L1a
            goto L56
        L1a:
            r12.write(r0)     // Catch: java.io.IOException -> L23
            if (r17 == 0) goto L26
            r12.flush()     // Catch: java.io.IOException -> L23
            goto L26
        L23:
            r0 = move-exception
            r11 = r0
            goto L57
        L26:
            r3 = 1
            long r6 = r1 + r3
            if (r16 == 0) goto L38
            r8 = 1
            r9 = r14
            r5 = r16
            r5.c(r6, r8, r9)     // Catch: java.io.IOException -> L34
            goto L38
        L34:
            r0 = move-exception
            r11 = r0
            r1 = r6
            goto L57
        L38:
            r1 = r6
            goto La
        L3a:
            r0 = 0
            r12.write(r13, r0, r6)     // Catch: java.io.IOException -> L23
            if (r17 == 0) goto L43
            r12.flush()     // Catch: java.io.IOException -> L23
        L43:
            long r3 = (long) r6
            long r1 = r1 + r3
            if (r16 == 0) goto L53
            r7 = r14
            r3 = r16
            r4 = r1
            r3.c(r4, r6, r7)     // Catch: java.io.IOException -> L4f
            goto L54
        L4f:
            r0 = move-exception
            r11 = r0
            r1 = r4
            goto L57
        L53:
            r4 = r1
        L54:
            r1 = r4
            goto La
        L56:
            return r1
        L57:
            org.apache.commons.net.io.CopyStreamException r12 = new org.apache.commons.net.io.CopyStreamException
            java.lang.String r13 = "IOException caught while copying."
            r12.<init>(r13, r1, r11)
            throw r12
    }
}
