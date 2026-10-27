package org.apache.commons.net.telnet;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class l extends java.io.OutputStream {
    private final org.apache.commons.net.telnet.e a;
    private final boolean b;
    private boolean c;

    l(org.apache.commons.net.telnet.e r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.b = r0
            r0 = 0
            r1.c = r0
            r1.a = r2
            return
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.telnet.e r0 = r1.a
            r0.R0()
            return
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.telnet.e r0 = r1.a
            r0.S0()
            return
    }

    @Override // java.io.OutputStream
    public void write(int r6) throws java.io.IOException {
            r5 = this;
            org.apache.commons.net.telnet.e r0 = r5.a
            monitor-enter(r0)
            r1 = 255(0xff, float:3.57E-43)
            r6 = r6 & r1
            org.apache.commons.net.telnet.e r2 = r5.a     // Catch: java.lang.Throwable -> L20
            r3 = 0
            boolean r2 = r2.o0(r3)     // Catch: java.lang.Throwable -> L20
            if (r2 == 0) goto L59
            boolean r2 = r5.c     // Catch: java.lang.Throwable -> L20
            r4 = 10
            if (r2 == 0) goto L22
            org.apache.commons.net.telnet.e r2 = r5.a     // Catch: java.lang.Throwable -> L20
            r2.q0(r4)     // Catch: java.lang.Throwable -> L20
            if (r6 != r4) goto L22
            r5.c = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            return
        L20:
            r6 = move-exception
            goto L6d
        L22:
            r2 = 13
            if (r6 == r4) goto L48
            if (r6 == r2) goto L3f
            if (r6 == r1) goto L32
            org.apache.commons.net.telnet.e r1 = r5.a     // Catch: java.lang.Throwable -> L20
            r1.q0(r6)     // Catch: java.lang.Throwable -> L20
            r5.c = r3     // Catch: java.lang.Throwable -> L20
            goto L6b
        L32:
            org.apache.commons.net.telnet.e r6 = r5.a     // Catch: java.lang.Throwable -> L20
            r6.q0(r1)     // Catch: java.lang.Throwable -> L20
            org.apache.commons.net.telnet.e r6 = r5.a     // Catch: java.lang.Throwable -> L20
            r6.q0(r1)     // Catch: java.lang.Throwable -> L20
            r5.c = r3     // Catch: java.lang.Throwable -> L20
            goto L6b
        L3f:
            org.apache.commons.net.telnet.e r6 = r5.a     // Catch: java.lang.Throwable -> L20
            r6.q0(r2)     // Catch: java.lang.Throwable -> L20
            r6 = 1
            r5.c = r6     // Catch: java.lang.Throwable -> L20
            goto L6b
        L48:
            boolean r1 = r5.c     // Catch: java.lang.Throwable -> L20
            if (r1 != 0) goto L51
            org.apache.commons.net.telnet.e r1 = r5.a     // Catch: java.lang.Throwable -> L20
            r1.q0(r2)     // Catch: java.lang.Throwable -> L20
        L51:
            org.apache.commons.net.telnet.e r1 = r5.a     // Catch: java.lang.Throwable -> L20
            r1.q0(r6)     // Catch: java.lang.Throwable -> L20
            r5.c = r3     // Catch: java.lang.Throwable -> L20
            goto L6b
        L59:
            if (r6 != r1) goto L66
            org.apache.commons.net.telnet.e r2 = r5.a     // Catch: java.lang.Throwable -> L20
            r2.q0(r6)     // Catch: java.lang.Throwable -> L20
            org.apache.commons.net.telnet.e r6 = r5.a     // Catch: java.lang.Throwable -> L20
            r6.q0(r1)     // Catch: java.lang.Throwable -> L20
            goto L6b
        L66:
            org.apache.commons.net.telnet.e r1 = r5.a     // Catch: java.lang.Throwable -> L20
            r1.q0(r6)     // Catch: java.lang.Throwable -> L20
        L6b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            return
        L6d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            throw r6
    }

    @Override // java.io.OutputStream
    public void write(byte[] r3) throws java.io.IOException {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            r2.write(r3, r0, r1)
            return
    }

    @Override // java.io.OutputStream
    public void write(byte[] r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            org.apache.commons.net.telnet.e r0 = r2.a
            monitor-enter(r0)
        L3:
            int r1 = r5 + (-1)
            if (r5 <= 0) goto L13
            int r5 = r4 + 1
            r4 = r3[r4]     // Catch: java.lang.Throwable -> L11
            r2.write(r4)     // Catch: java.lang.Throwable -> L11
            r4 = r5
            r5 = r1
            goto L3
        L11:
            r3 = move-exception
            goto L15
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r3
    }
}
