package org.apache.commons.net.telnet;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class h extends java.io.BufferedInputStream implements java.lang.Runnable {
    private static final int o = -1;
    private static final int p = -2;

    /* renamed from: q, reason: collision with root package name */
    static final int f62q = 0;
    static final int r = 1;
    static final int s = 2;
    static final int t = 3;
    static final int u = 4;
    static final int v = 5;
    static final int w = 6;
    static final int x = 7;
    static final int y = 8;
    static final int z = 9;
    private boolean a;
    private volatile boolean b;
    private boolean c;
    private int d;
    private int e;
    private int f;
    private int g;
    private final int[] h;
    private final org.apache.commons.net.telnet.e i;
    private final java.lang.Thread j;
    private java.io.IOException k;
    private final int[] l;
    private int m;
    private volatile boolean n;

    h(java.io.InputStream r2, org.apache.commons.net.telnet.e r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r0)
            return
    }

    h(java.io.InputStream r1, org.apache.commons.net.telnet.e r2, boolean r3) {
            r0 = this;
            r0.<init>(r1)
            r1 = 512(0x200, float:7.17E-43)
            int[] r1 = new int[r1]
            r0.l = r1
            r1 = 0
            r0.m = r1
            r0.i = r2
            r0.d = r1
            r2 = 1
            r0.b = r2
            r0.a = r1
            r2 = 2049(0x801, float:2.871E-42)
            int[] r2 = new int[r2]
            r0.h = r2
            r0.e = r1
            r0.f = r1
            r0.g = r1
            r2 = 0
            r0.k = r2
            r0.c = r1
            r0.n = r1
            if (r3 == 0) goto L32
            java.lang.Thread r1 = new java.lang.Thread
            r1.<init>(r0)
            r0.j = r1
            return
        L32:
            r0.j = r2
            return
    }

    private boolean a(int r7) throws java.lang.InterruptedException {
            r6 = this;
            int[] r0 = r6.h
            monitor-enter(r0)
            int r1 = r6.g     // Catch: java.lang.Throwable -> L23
            r2 = 0
            r3 = 1
            if (r1 != 0) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            int r4 = r6.g     // Catch: java.lang.Throwable -> L23
            int[] r5 = r6.h     // Catch: java.lang.Throwable -> L23
            int r5 = r5.length     // Catch: java.lang.Throwable -> L23
            int r5 = r5 - r3
            if (r4 < r5) goto L2f
            boolean r4 = r6.n     // Catch: java.lang.Throwable -> L23
            if (r4 == 0) goto L27
            int[] r4 = r6.h     // Catch: java.lang.Throwable -> L23
            r4.notify()     // Catch: java.lang.Throwable -> L23
            int[] r4 = r6.h     // Catch: java.lang.Throwable -> L23 java.lang.InterruptedException -> L25
            r4.wait()     // Catch: java.lang.Throwable -> L23 java.lang.InterruptedException -> L25
            goto Lc
        L23:
            r7 = move-exception
            goto L51
        L25:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L23
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = "Queue is full! Cannot process another character."
            r7.<init>(r1)     // Catch: java.lang.Throwable -> L23
            throw r7     // Catch: java.lang.Throwable -> L23
        L2f:
            boolean r4 = r6.c     // Catch: java.lang.Throwable -> L23
            if (r4 == 0) goto L3c
            boolean r4 = r6.n     // Catch: java.lang.Throwable -> L23
            if (r4 == 0) goto L3c
            int[] r4 = r6.h     // Catch: java.lang.Throwable -> L23
            r4.notify()     // Catch: java.lang.Throwable -> L23
        L3c:
            int[] r4 = r6.h     // Catch: java.lang.Throwable -> L23
            int r5 = r6.f     // Catch: java.lang.Throwable -> L23
            r4[r5] = r7     // Catch: java.lang.Throwable -> L23
            int r7 = r6.g     // Catch: java.lang.Throwable -> L23
            int r7 = r7 + r3
            r6.g = r7     // Catch: java.lang.Throwable -> L23
            int r5 = r5 + r3
            r6.f = r5     // Catch: java.lang.Throwable -> L23
            int r7 = r4.length     // Catch: java.lang.Throwable -> L23
            if (r5 < r7) goto L4f
            r6.f = r2     // Catch: java.lang.Throwable -> L23
        L4f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return r1
        L51:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r7
    }

    private int b(boolean r7) throws java.io.IOException {
            r6 = this;
        L0:
            if (r7 != 0) goto La
            int r0 = super.available()
            if (r0 != 0) goto La
            r7 = -2
            return r7
        La:
            int r0 = super.read()
            if (r0 >= 0) goto L12
            r7 = -1
            return r7
        L12:
            r0 = r0 & 255(0xff, float:3.57E-43)
            org.apache.commons.net.telnet.e r1 = r6.i
            monitor-enter(r1)
            org.apache.commons.net.telnet.e r2 = r6.i     // Catch: java.lang.Throwable -> L11e
            r2.Z()     // Catch: java.lang.Throwable -> L11e
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11e
            org.apache.commons.net.telnet.e r1 = r6.i
            r1.G0(r0)
            int r1 = r6.d
            r2 = 240(0xf0, float:3.36E-43)
            r3 = 6
            r4 = 255(0xff, float:3.57E-43)
            r5 = 0
            switch(r1) {
                case 0: goto Lf8;
                case 1: goto Lc9;
                case 2: goto Lb4;
                case 3: goto L9f;
                case 4: goto L8a;
                case 5: goto L75;
                case 6: goto L5e;
                case 7: goto L2d;
                case 8: goto L5b;
                case 9: goto L2e;
                default: goto L2d;
            }
        L2d:
            return r0
        L2e:
            if (r0 == r2) goto L43
            if (r0 == r4) goto L33
            goto L40
        L33:
            int r1 = r6.m
            int[] r2 = r6.l
            int r4 = r2.length
            if (r1 >= r4) goto L40
            int r4 = r1 + 1
            r6.m = r4
            r2[r1] = r0
        L40:
            r6.d = r3
            goto L0
        L43:
            org.apache.commons.net.telnet.e r1 = r6.i
            monitor-enter(r1)
            org.apache.commons.net.telnet.e r0 = r6.i     // Catch: java.lang.Throwable -> L58
            int[] r2 = r6.l     // Catch: java.lang.Throwable -> L58
            int r3 = r6.m     // Catch: java.lang.Throwable -> L58
            r0.d0(r2, r3)     // Catch: java.lang.Throwable -> L58
            org.apache.commons.net.telnet.e r0 = r6.i     // Catch: java.lang.Throwable -> L58
            r0.S0()     // Catch: java.lang.Throwable -> L58
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L58
            r6.d = r5
            goto L0
        L58:
            r7 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L58
            throw r7
        L5b:
            if (r0 != 0) goto Lf8
            goto L0
        L5e:
            if (r0 == r4) goto L70
            int r1 = r6.m
            int[] r2 = r6.l
            int r4 = r2.length
            if (r1 >= r4) goto L6d
            int r4 = r1 + 1
            r6.m = r4
            r2[r1] = r0
        L6d:
            r6.d = r3
            goto L0
        L70:
            r0 = 9
            r6.d = r0
            goto L0
        L75:
            org.apache.commons.net.telnet.e r1 = r6.i
            monitor-enter(r1)
            org.apache.commons.net.telnet.e r2 = r6.i     // Catch: java.lang.Throwable -> L87
            r2.c0(r0)     // Catch: java.lang.Throwable -> L87
            org.apache.commons.net.telnet.e r0 = r6.i     // Catch: java.lang.Throwable -> L87
            r0.S0()     // Catch: java.lang.Throwable -> L87
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L87
            r6.d = r5
            goto L0
        L87:
            r7 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L87
            throw r7
        L8a:
            org.apache.commons.net.telnet.e r1 = r6.i
            monitor-enter(r1)
            org.apache.commons.net.telnet.e r2 = r6.i     // Catch: java.lang.Throwable -> L9c
            r2.b0(r0)     // Catch: java.lang.Throwable -> L9c
            org.apache.commons.net.telnet.e r0 = r6.i     // Catch: java.lang.Throwable -> L9c
            r0.S0()     // Catch: java.lang.Throwable -> L9c
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9c
            r6.d = r5
            goto L0
        L9c:
            r7 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9c
            throw r7
        L9f:
            org.apache.commons.net.telnet.e r1 = r6.i
            monitor-enter(r1)
            org.apache.commons.net.telnet.e r2 = r6.i     // Catch: java.lang.Throwable -> Lb1
            r2.f0(r0)     // Catch: java.lang.Throwable -> Lb1
            org.apache.commons.net.telnet.e r0 = r6.i     // Catch: java.lang.Throwable -> Lb1
            r0.S0()     // Catch: java.lang.Throwable -> Lb1
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb1
            r6.d = r5
            goto L0
        Lb1:
            r7 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb1
            throw r7
        Lb4:
            org.apache.commons.net.telnet.e r1 = r6.i
            monitor-enter(r1)
            org.apache.commons.net.telnet.e r2 = r6.i     // Catch: java.lang.Throwable -> Lc6
            r2.e0(r0)     // Catch: java.lang.Throwable -> Lc6
            org.apache.commons.net.telnet.e r0 = r6.i     // Catch: java.lang.Throwable -> Lc6
            r0.S0()     // Catch: java.lang.Throwable -> Lc6
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc6
            r6.d = r5
            goto L0
        Lc6:
            r7 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc6
            throw r7
        Lc9:
            if (r0 == r2) goto Lf4
            switch(r0) {
                case 250: goto Lee;
                case 251: goto Le9;
                case 252: goto Le4;
                case 253: goto Ldf;
                case 254: goto Lda;
                case 255: goto Ld7;
                default: goto Lce;
            }
        Lce:
            r6.d = r5
            org.apache.commons.net.telnet.e r1 = r6.i
            r1.a0(r0)
            goto L0
        Ld7:
            r6.d = r5
            return r0
        Lda:
            r0 = 5
            r6.d = r0
            goto L0
        Ldf:
            r0 = 4
            r6.d = r0
            goto L0
        Le4:
            r0 = 3
            r6.d = r0
            goto L0
        Le9:
            r0 = 2
            r6.d = r0
            goto L0
        Lee:
            r6.m = r5
            r6.d = r3
            goto L0
        Lf4:
            r6.d = r5
            goto L0
        Lf8:
            if (r0 != r4) goto Lff
            r0 = 1
            r6.d = r0
            goto L0
        Lff:
            r7 = 13
            if (r0 != r7) goto L11b
            org.apache.commons.net.telnet.e r7 = r6.i
            monitor-enter(r7)
            org.apache.commons.net.telnet.e r1 = r6.i     // Catch: java.lang.Throwable -> L113
            boolean r1 = r1.m0(r5)     // Catch: java.lang.Throwable -> L113
            if (r1 == 0) goto L115
            r1 = 8
            r6.d = r1     // Catch: java.lang.Throwable -> L113
            goto L117
        L113:
            r0 = move-exception
            goto L119
        L115:
            r6.d = r5     // Catch: java.lang.Throwable -> L113
        L117:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L113
            return r0
        L119:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L113
            throw r0
        L11b:
            r6.d = r5
            return r0
        L11e:
            r7 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11e
            throw r7
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public int available() throws java.io.IOException {
            r3 = this;
            int[] r0 = r3.h
            monitor-enter(r0)
            boolean r1 = r3.n     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto Ld
            int r1 = r3.g     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = move-exception
            goto L16
        Ld:
            int r1 = r3.g     // Catch: java.lang.Throwable -> Lb
            int r2 = super.available()     // Catch: java.lang.Throwable -> Lb
            int r1 = r1 + r2
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    void c() {
            r3 = this;
            java.lang.Thread r0 = r3.j
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
            r3.b = r0
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            int r0 = r0.getPriority()
            r1 = 1
            int r0 = r0 + r1
            r2 = 10
            if (r0 <= r2) goto L18
            r0 = 10
        L18:
            java.lang.Thread r2 = r3.j
            r2.setPriority(r0)
            java.lang.Thread r0 = r3.j
            r0.setDaemon(r1)
            java.lang.Thread r0 = r3.j
            r0.start()
            r3.n = r1
            return
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            super.close()
            int[] r0 = r2.h
            monitor-enter(r0)
            r1 = 1
            r2.a = r1     // Catch: java.lang.Throwable -> L1b
            r2.b = r1     // Catch: java.lang.Throwable -> L1b
            java.lang.Thread r1 = r2.j     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L1d
            boolean r1 = r1.isAlive()     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L1d
            java.lang.Thread r1 = r2.j     // Catch: java.lang.Throwable -> L1b
            r1.interrupt()     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r1 = move-exception
            goto L24
        L1d:
            int[] r1 = r2.h     // Catch: java.lang.Throwable -> L1b
            r1.notifyAll()     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return
        L24:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r1
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws java.io.IOException {
            r7 = this;
            int[] r0 = r7.h
            monitor-enter(r0)
        L3:
            java.io.IOException r1 = r7.k     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L98
            int r1 = r7.g     // Catch: java.lang.Throwable -> L14
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L7a
            boolean r1 = r7.a     // Catch: java.lang.Throwable -> L14
            r4 = -1
            if (r1 == 0) goto L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return r4
        L14:
            r1 = move-exception
            goto L9c
        L17:
            boolean r1 = r7.n     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L32
            int[] r1 = r7.h     // Catch: java.lang.Throwable -> L14
            r1.notify()     // Catch: java.lang.Throwable -> L14
            r7.c = r3     // Catch: java.lang.Throwable -> L14 java.lang.InterruptedException -> L2a
            int[] r1 = r7.h     // Catch: java.lang.Throwable -> L14 java.lang.InterruptedException -> L2a
            r1.wait()     // Catch: java.lang.Throwable -> L14 java.lang.InterruptedException -> L2a
            r7.c = r2     // Catch: java.lang.Throwable -> L14 java.lang.InterruptedException -> L2a
            goto L3
        L2a:
            java.io.InterruptedIOException r1 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = "Fatal thread interruption during read."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L14
            throw r1     // Catch: java.lang.Throwable -> L14
        L32:
            r7.c = r3     // Catch: java.lang.Throwable -> L14
            r1 = 1
        L35:
            int r1 = r7.b(r1)     // Catch: java.lang.Throwable -> L14 java.io.InterruptedIOException -> L60
            r5 = -2
            if (r1 >= 0) goto L40
            if (r1 == r5) goto L40
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return r1
        L40:
            if (r1 == r5) goto L4c
            r7.a(r1)     // Catch: java.lang.Throwable -> L14 java.lang.InterruptedException -> L46
            goto L4c
        L46:
            boolean r1 = r7.b     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L4c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return r4
        L4c:
            int r1 = super.available()     // Catch: java.lang.Throwable -> L14
            if (r1 <= 0) goto L5d
            int r1 = r7.g     // Catch: java.lang.Throwable -> L14
            int[] r5 = r7.h     // Catch: java.lang.Throwable -> L14
            int r5 = r5.length     // Catch: java.lang.Throwable -> L14
            int r5 = r5 - r3
            if (r1 < r5) goto L5b
            goto L5d
        L5b:
            r1 = 0
            goto L35
        L5d:
            r7.c = r2     // Catch: java.lang.Throwable -> L14
            goto L3
        L60:
            r1 = move-exception
            int[] r2 = r7.h     // Catch: java.lang.Throwable -> L14
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L14
            r7.k = r1     // Catch: java.lang.Throwable -> L73
            int[] r1 = r7.h     // Catch: java.lang.Throwable -> L73
            r1.notifyAll()     // Catch: java.lang.Throwable -> L73
            int[] r1 = r7.h     // Catch: java.lang.Throwable -> L73 java.lang.InterruptedException -> L75
            r5 = 100
            r1.wait(r5)     // Catch: java.lang.Throwable -> L73 java.lang.InterruptedException -> L75
            goto L75
        L73:
            r1 = move-exception
            goto L78
        L75:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L73
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return r4
        L78:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L73
            throw r1     // Catch: java.lang.Throwable -> L14
        L7a:
            int[] r4 = r7.h     // Catch: java.lang.Throwable -> L14
            int r5 = r7.e     // Catch: java.lang.Throwable -> L14
            r6 = r4[r5]     // Catch: java.lang.Throwable -> L14
            int r5 = r5 + r3
            r7.e = r5     // Catch: java.lang.Throwable -> L14
            int r4 = r4.length     // Catch: java.lang.Throwable -> L14
            if (r5 < r4) goto L88
            r7.e = r2     // Catch: java.lang.Throwable -> L14
        L88:
            int r1 = r1 - r3
            r7.g = r1     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L96
            boolean r1 = r7.n     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L96
            int[] r1 = r7.h     // Catch: java.lang.Throwable -> L14
            r1.notify()     // Catch: java.lang.Throwable -> L14
        L96:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return r6
        L98:
            r2 = 0
            r7.k = r2     // Catch: java.lang.Throwable -> L14
            throw r1     // Catch: java.lang.Throwable -> L14
        L9c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] r3) throws java.io.IOException {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            int r3 = r2.read(r3, r0, r1)
            return r3
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] r5, int r6, int r7) throws java.io.IOException {
            r4 = this;
            r0 = 1
            if (r7 >= r0) goto L5
            r5 = 0
            return r5
        L5:
            int[] r0 = r4.h
            monitor-enter(r0)
            int r1 = r4.g     // Catch: java.lang.Throwable -> L2a
            if (r7 <= r1) goto Ld
            r7 = r1
        Ld:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            int r0 = r4.read()
            r1 = -1
            if (r0 != r1) goto L16
            return r1
        L16:
            r2 = r6
        L17:
            int r3 = r2 + 1
            byte r0 = (byte) r0
            r5[r2] = r0
            int r7 = r7 + r1
            if (r7 <= 0) goto L28
            int r0 = r4.read()
            if (r0 != r1) goto L26
            goto L28
        L26:
            r2 = r3
            goto L17
        L28:
            int r3 = r3 - r6
            return r3
        L2a:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            throw r5
    }

    @Override // java.lang.Runnable
    public void run() {
            r6 = this;
        L0:
            r0 = 0
            r1 = 1
            boolean r2 = r6.b     // Catch: java.io.IOException -> L12
            if (r2 != 0) goto L50
            int r2 = r6.b(r1)     // Catch: java.io.IOException -> L12 java.lang.RuntimeException -> L22 java.io.InterruptedIOException -> L26
            if (r2 >= 0) goto Ld
            goto L50
        Ld:
            boolean r2 = r6.a(r2)     // Catch: java.io.IOException -> L12 java.lang.InterruptedException -> L14
            goto L1a
        L12:
            r2 = move-exception
            goto L45
        L14:
            boolean r2 = r6.b     // Catch: java.io.IOException -> L12
            if (r2 == 0) goto L19
            goto L50
        L19:
            r2 = 0
        L1a:
            if (r2 == 0) goto L0
            org.apache.commons.net.telnet.e r2 = r6.i     // Catch: java.io.IOException -> L12
            r2.Y0()     // Catch: java.io.IOException -> L12
            goto L0
        L22:
            super.close()     // Catch: java.io.IOException -> L12
            goto L50
        L26:
            r2 = move-exception
            int[] r3 = r6.h     // Catch: java.io.IOException -> L12
            monitor-enter(r3)     // Catch: java.io.IOException -> L12
            r6.k = r2     // Catch: java.lang.Throwable -> L39
            int[] r2 = r6.h     // Catch: java.lang.Throwable -> L39
            r2.notifyAll()     // Catch: java.lang.Throwable -> L39
            int[] r2 = r6.h     // Catch: java.lang.Throwable -> L39 java.lang.InterruptedException -> L3b
            r4 = 100
            r2.wait(r4)     // Catch: java.lang.Throwable -> L39 java.lang.InterruptedException -> L3b
            goto L41
        L39:
            r2 = move-exception
            goto L43
        L3b:
            boolean r2 = r6.b     // Catch: java.lang.Throwable -> L39
            if (r2 == 0) goto L41
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L39
            goto L50
        L41:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L39
            goto L0
        L43:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L39
            throw r2     // Catch: java.io.IOException -> L12
        L45:
            int[] r3 = r6.h
            monitor-enter(r3)
            r6.k = r2     // Catch: java.lang.Throwable -> L63
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L63
            org.apache.commons.net.telnet.e r2 = r6.i
            r2.Y0()
        L50:
            int[] r2 = r6.h
            monitor-enter(r2)
            r6.b = r1     // Catch: java.lang.Throwable -> L60
            r6.a = r1     // Catch: java.lang.Throwable -> L60
            int[] r1 = r6.h     // Catch: java.lang.Throwable -> L60
            r1.notify()     // Catch: java.lang.Throwable -> L60
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L60
            r6.n = r0
            return
        L60:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L60
            throw r0
        L63:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L63
            throw r0
    }
}
