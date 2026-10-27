package org.apache.commons.net.io;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class d extends java.io.BufferedReader {
    private static final char d = '\n';
    private static final char e = '\r';
    private static final int f = 46;
    private boolean a;
    private boolean b;
    private boolean c;

    public d(java.io.Reader r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1
            r0.a = r1
            r1 = 0
            r0.b = r1
            return
    }

    @Override // java.io.BufferedReader, java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r3 = this;
            java.lang.Object r0 = r3.lock
            monitor-enter(r0)
            boolean r1 = r3.b     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
        L7:
            int r1 = r3.read()     // Catch: java.lang.Throwable -> Lf
            r2 = -1
            if (r1 == r2) goto L11
            goto L7
        Lf:
            r1 = move-exception
            goto L19
        L11:
            r1 = 1
            r3.b = r1     // Catch: java.lang.Throwable -> Lf
            r1 = 0
            r3.a = r1     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    @Override // java.io.BufferedReader, java.io.Reader
    public int read() throws java.io.IOException {
            r8 = this;
            java.lang.Object r0 = r8.lock
            monitor-enter(r0)
            boolean r1 = r8.b     // Catch: java.lang.Throwable -> La
            r2 = -1
            if (r1 == 0) goto Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r2
        La:
            r1 = move-exception
            goto L62
        Lc:
            int r1 = super.read()     // Catch: java.lang.Throwable -> La
            r3 = 1
            if (r1 != r2) goto L17
            r8.b = r3     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r2
        L17:
            boolean r4 = r8.a     // Catch: java.lang.Throwable -> La
            r5 = 10
            r6 = 13
            r7 = 0
            if (r4 == 0) goto L52
            r8.a = r7     // Catch: java.lang.Throwable -> La
            r4 = 46
            if (r1 != r4) goto L52
            r1 = 2
            r8.mark(r1)     // Catch: java.lang.Throwable -> La
            int r1 = super.read()     // Catch: java.lang.Throwable -> La
            if (r1 != r2) goto L34
            r8.b = r3     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r4
        L34:
            if (r1 != r4) goto L38
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r1
        L38:
            if (r1 != r6) goto L4d
            int r1 = super.read()     // Catch: java.lang.Throwable -> La
            if (r1 != r2) goto L45
            r8.reset()     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r4
        L45:
            if (r1 != r5) goto L4d
            r8.a = r3     // Catch: java.lang.Throwable -> La
            r8.b = r3     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r2
        L4d:
            r8.reset()     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r4
        L52:
            boolean r2 = r8.c     // Catch: java.lang.Throwable -> La
            if (r2 == 0) goto L5c
            r8.c = r7     // Catch: java.lang.Throwable -> La
            if (r1 != r5) goto L5c
            r8.a = r3     // Catch: java.lang.Throwable -> La
        L5c:
            if (r1 != r6) goto L60
            r8.c = r3     // Catch: java.lang.Throwable -> La
        L60:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r1
        L62:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    @Override // java.io.Reader
    public int read(char[] r3) throws java.io.IOException {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            int r3 = r2.read(r3, r0, r1)
            return r3
    }

    @Override // java.io.BufferedReader, java.io.Reader
    public int read(char[] r6, int r7, int r8) throws java.io.IOException {
            r5 = this;
            r0 = 1
            if (r8 >= r0) goto L5
            r6 = 0
            return r6
        L5:
            java.lang.Object r0 = r5.lock
            monitor-enter(r0)
            int r1 = r5.read()     // Catch: java.lang.Throwable -> L11
            r2 = -1
            if (r1 != r2) goto L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r2
        L11:
            r6 = move-exception
            goto L28
        L13:
            r3 = r7
        L14:
            int r4 = r3 + 1
            char r1 = (char) r1     // Catch: java.lang.Throwable -> L11
            r6[r3] = r1     // Catch: java.lang.Throwable -> L11
            int r8 = r8 + r2
            if (r8 <= 0) goto L25
            int r1 = r5.read()     // Catch: java.lang.Throwable -> L11
            if (r1 != r2) goto L23
            goto L25
        L23:
            r3 = r4
            goto L14
        L25:
            int r4 = r4 - r7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r4
        L28:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r6
    }

    @Override // java.io.BufferedReader
    public java.lang.String readLine() throws java.io.IOException {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r4.lock
            monitor-enter(r1)
        L8:
            int r2 = r4.read()     // Catch: java.lang.Throwable -> L24
            r3 = -1
            if (r2 == r3) goto L2b
            r3 = 10
            if (r2 != r3) goto L26
            boolean r3 = r4.a     // Catch: java.lang.Throwable -> L24
            if (r3 == 0) goto L26
            int r2 = r0.length()     // Catch: java.lang.Throwable -> L24
            int r2 = r2 + (-1)
            r3 = 0
            java.lang.String r0 = r0.substring(r3, r2)     // Catch: java.lang.Throwable -> L24
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            return r0
        L24:
            r0 = move-exception
            goto L38
        L26:
            char r2 = (char) r2     // Catch: java.lang.Throwable -> L24
            r0.append(r2)     // Catch: java.lang.Throwable -> L24
            goto L8
        L2b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            java.lang.String r0 = r0.toString()
            int r1 = r0.length()
            if (r1 != 0) goto L37
            r0 = 0
        L37:
            return r0
        L38:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            throw r0
    }
}
