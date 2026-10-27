package com.danikula.videocache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
class o {
    private static final org.slf4j.c i = null;
    private static final int j = 1;
    private final com.danikula.videocache.q a;
    private final com.danikula.videocache.d b;
    private final java.lang.Object c;
    private final java.lang.Object d;
    private final java.util.concurrent.atomic.AtomicInteger e;
    private volatile java.lang.Thread f;
    private volatile boolean g;
    private volatile int h;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class b implements java.lang.Runnable {
        final /* synthetic */ com.danikula.videocache.o a;

        private b(com.danikula.videocache.o r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ b(com.danikula.videocache.o r1, com.danikula.videocache.o.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                com.danikula.videocache.o r0 = r1.a
                com.danikula.videocache.o.a(r0)
                return
        }
    }

    static {
            java.lang.String r0 = "ProxyCache"
            org.slf4j.c r0 = org.slf4j.d.j(r0)
            com.danikula.videocache.o.i = r0
            return
    }

    public o(com.danikula.videocache.q r2, com.danikula.videocache.d r3) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.c = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.d = r0
            r0 = -1
            r1.h = r0
            java.lang.Object r2 = com.danikula.videocache.n.d(r2)
            com.danikula.videocache.q r2 = (com.danikula.videocache.q) r2
            r1.a = r2
            java.lang.Object r2 = com.danikula.videocache.n.d(r3)
            com.danikula.videocache.d r2 = (com.danikula.videocache.d) r2
            r1.b = r2
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r2.<init>()
            r1.e = r2
            return
    }

    static /* synthetic */ void a(com.danikula.videocache.o r0) {
            r0.k()
            return
    }

    private void b() throws com.danikula.videocache.ProxyCacheException {
            r4 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r4.e
            int r0 = r0.get()
            r1 = 1
            if (r0 >= r1) goto La
            return
        La:
            java.util.concurrent.atomic.AtomicInteger r1 = r4.e
            r2 = 0
            r1.set(r2)
            com.danikula.videocache.ProxyCacheException r1 = new com.danikula.videocache.ProxyCacheException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error reading source "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " times"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
    }

    private void c() {
            r4 = this;
            com.danikula.videocache.q r0 = r4.a     // Catch: com.danikula.videocache.ProxyCacheException -> L6
            r0.close()     // Catch: com.danikula.videocache.ProxyCacheException -> L6
            return
        L6:
            r0 = move-exception
            com.danikula.videocache.ProxyCacheException r1 = new com.danikula.videocache.ProxyCacheException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error closing source "
            r2.append(r3)
            com.danikula.videocache.q r3 = r4.a
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            r4.h(r1)
            return
    }

    private boolean d() {
            r1 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r0 = r0.isInterrupted()
            if (r0 != 0) goto L11
            boolean r0 = r1.g
            if (r0 == 0) goto Lf
            goto L11
        Lf:
            r0 = 0
            return r0
        L11:
            r0 = 1
            return r0
    }

    private void e(long r1, long r3) {
            r0 = this;
            r0.f(r1, r3)
            java.lang.Object r1 = r0.c
            monitor-enter(r1)
            java.lang.Object r2 = r0.c     // Catch: java.lang.Throwable -> Ld
            r2.notifyAll()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }

    private void i() {
            r1 = this;
            r0 = 100
            r1.h = r0
            int r0 = r1.h
            r1.g(r0)
            return
    }

    private void k() {
            r8 = this;
            r0 = -1
            r2 = 0
            com.danikula.videocache.d r4 = r8.b     // Catch: java.lang.Throwable -> L41
            long r2 = r4.available()     // Catch: java.lang.Throwable -> L41
            com.danikula.videocache.q r4 = r8.a     // Catch: java.lang.Throwable -> L41
            r4.a(r2)     // Catch: java.lang.Throwable -> L41
            com.danikula.videocache.q r4 = r8.a     // Catch: java.lang.Throwable -> L41
            long r0 = r4.length()     // Catch: java.lang.Throwable -> L41
            r4 = 8192(0x2000, float:1.148E-41)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L41
        L19:
            com.danikula.videocache.q r5 = r8.a     // Catch: java.lang.Throwable -> L41
            int r5 = r5.read(r4)     // Catch: java.lang.Throwable -> L41
            r6 = -1
            if (r5 == r6) goto L45
            java.lang.Object r6 = r8.d     // Catch: java.lang.Throwable -> L41
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L41
            boolean r7 = r8.d()     // Catch: java.lang.Throwable -> L33
            if (r7 == 0) goto L35
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L33
        L2c:
            r8.c()
            r8.e(r2, r0)
            return
        L33:
            r4 = move-exception
            goto L43
        L35:
            com.danikula.videocache.d r7 = r8.b     // Catch: java.lang.Throwable -> L33
            r7.a(r4, r5)     // Catch: java.lang.Throwable -> L33
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L33
            long r5 = (long) r5
            long r2 = r2 + r5
            r8.e(r2, r0)     // Catch: java.lang.Throwable -> L41
            goto L19
        L41:
            r4 = move-exception
            goto L4c
        L43:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L33
            throw r4     // Catch: java.lang.Throwable -> L41
        L45:
            r8.n()     // Catch: java.lang.Throwable -> L41
            r8.i()     // Catch: java.lang.Throwable -> L41
            goto L2c
        L4c:
            java.util.concurrent.atomic.AtomicInteger r5 = r8.e     // Catch: java.lang.Throwable -> L55
            r5.incrementAndGet()     // Catch: java.lang.Throwable -> L55
            r8.h(r4)     // Catch: java.lang.Throwable -> L55
            goto L2c
        L55:
            r4 = move-exception
            r8.c()
            r8.e(r2, r0)
            throw r4
    }

    private synchronized void l() throws com.danikula.videocache.ProxyCacheException {
            r4 = this;
            monitor-enter(r4)
            java.lang.Thread r0 = r4.f     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L13
            java.lang.Thread r0 = r4.f     // Catch: java.lang.Throwable -> L11
            java.lang.Thread$State r0 = r0.getState()     // Catch: java.lang.Throwable -> L11
            java.lang.Thread$State r1 = java.lang.Thread.State.TERMINATED     // Catch: java.lang.Throwable -> L11
            if (r0 == r1) goto L13
            r0 = 1
            goto L14
        L11:
            r0 = move-exception
            goto L49
        L13:
            r0 = 0
        L14:
            boolean r1 = r4.g     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto L47
            com.danikula.videocache.d r1 = r4.b     // Catch: java.lang.Throwable -> L11
            boolean r1 = r1.isCompleted()     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto L47
            if (r0 != 0) goto L47
            java.lang.Thread r0 = new java.lang.Thread     // Catch: java.lang.Throwable -> L11
            com.danikula.videocache.o$b r1 = new com.danikula.videocache.o$b     // Catch: java.lang.Throwable -> L11
            r2 = 0
            r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> L11
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11
            r2.<init>()     // Catch: java.lang.Throwable -> L11
            java.lang.String r3 = "Source reader for "
            r2.append(r3)     // Catch: java.lang.Throwable -> L11
            com.danikula.videocache.q r3 = r4.a     // Catch: java.lang.Throwable -> L11
            r2.append(r3)     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L11
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L11
            r4.f = r0     // Catch: java.lang.Throwable -> L11
            java.lang.Thread r0 = r4.f     // Catch: java.lang.Throwable -> L11
            r0.start()     // Catch: java.lang.Throwable -> L11
        L47:
            monitor-exit(r4)
            return
        L49:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            throw r0
    }

    private void n() throws com.danikula.videocache.ProxyCacheException {
            r6 = this;
            java.lang.Object r0 = r6.d
            monitor-enter(r0)
            boolean r1 = r6.d()     // Catch: java.lang.Throwable -> L1f
            if (r1 != 0) goto L21
            com.danikula.videocache.d r1 = r6.b     // Catch: java.lang.Throwable -> L1f
            long r1 = r1.available()     // Catch: java.lang.Throwable -> L1f
            com.danikula.videocache.q r3 = r6.a     // Catch: java.lang.Throwable -> L1f
            long r3 = r3.length()     // Catch: java.lang.Throwable -> L1f
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L21
            com.danikula.videocache.d r1 = r6.b     // Catch: java.lang.Throwable -> L1f
            r1.complete()     // Catch: java.lang.Throwable -> L1f
            goto L21
        L1f:
            r1 = move-exception
            goto L23
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            return
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            throw r1
    }

    private void o() throws com.danikula.videocache.ProxyCacheException {
            r4 = this;
            java.lang.Object r0 = r4.c
            monitor-enter(r0)
            java.lang.Object r1 = r4.c     // Catch: java.lang.Throwable -> Lc java.lang.InterruptedException -> Le
            r2 = 1000(0x3e8, double:4.94E-321)
            r1.wait(r2)     // Catch: java.lang.Throwable -> Lc java.lang.InterruptedException -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r1 = move-exception
            goto L17
        Le:
            r1 = move-exception
            com.danikula.videocache.ProxyCacheException r2 = new com.danikula.videocache.ProxyCacheException     // Catch: java.lang.Throwable -> Lc
            java.lang.String r3 = "Waiting source data is interrupted!"
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> Lc
            throw r2     // Catch: java.lang.Throwable -> Lc
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }

    protected void f(long r4, long r6) {
            r3 = this;
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 != 0) goto L9
            r4 = 100
            goto L11
        L9:
            float r4 = (float) r4
            float r5 = (float) r6
            float r4 = r4 / r5
            r5 = 1120403456(0x42c80000, float:100.0)
            float r4 = r4 * r5
            int r4 = (int) r4
        L11:
            int r5 = r3.h
            if (r4 == r5) goto L17
            r5 = 1
            goto L18
        L17:
            r5 = 0
        L18:
            if (r2 < 0) goto L1f
            if (r5 == 0) goto L1f
            r3.g(r4)
        L1f:
            r3.h = r4
            return
    }

    protected void g(int r1) {
            r0 = this;
            return
    }

    protected final void h(java.lang.Throwable r3) {
            r2 = this;
            boolean r0 = r3 instanceof com.danikula.videocache.InterruptedProxyCacheException
            if (r0 == 0) goto Lc
            org.slf4j.c r3 = com.danikula.videocache.o.i
            java.lang.String r0 = "ProxyCache is interrupted"
            r3.debug(r0)
            return
        Lc:
            org.slf4j.c r0 = com.danikula.videocache.o.i
            java.lang.String r1 = "ProxyCache error"
            r0.error(r1, r3)
            return
    }

    public int j(byte[] r6, long r7, int r9) throws com.danikula.videocache.ProxyCacheException {
            r5 = this;
            com.danikula.videocache.p.a(r6, r7, r9)
        L3:
            com.danikula.videocache.d r0 = r5.b
            boolean r0 = r0.isCompleted()
            if (r0 != 0) goto L25
            com.danikula.videocache.d r0 = r5.b
            long r0 = r0.available()
            long r2 = (long) r9
            long r2 = r2 + r7
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L25
            boolean r0 = r5.g
            if (r0 != 0) goto L25
            r5.l()
            r5.o()
            r5.b()
            goto L3
        L25:
            com.danikula.videocache.d r0 = r5.b
            int r6 = r0.b(r6, r7, r9)
            com.danikula.videocache.d r7 = r5.b
            boolean r7 = r7.isCompleted()
            if (r7 == 0) goto L3e
            int r7 = r5.h
            r8 = 100
            if (r7 == r8) goto L3e
            r5.h = r8
            r5.g(r8)
        L3e:
            return r6
    }

    public void m() {
            r4 = this;
            java.lang.Object r0 = r4.d
            monitor-enter(r0)
            org.slf4j.c r1 = com.danikula.videocache.o.i     // Catch: java.lang.Throwable -> L28
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28
            r2.<init>()     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = "Shutdown proxy for "
            r2.append(r3)     // Catch: java.lang.Throwable -> L28
            com.danikula.videocache.q r3 = r4.a     // Catch: java.lang.Throwable -> L28
            r2.append(r3)     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L28
            r1.debug(r2)     // Catch: java.lang.Throwable -> L28
            r1 = 1
            r4.g = r1     // Catch: java.lang.Throwable -> L28 com.danikula.videocache.ProxyCacheException -> L2a
            java.lang.Thread r1 = r4.f     // Catch: java.lang.Throwable -> L28 com.danikula.videocache.ProxyCacheException -> L2a
            if (r1 == 0) goto L2c
            java.lang.Thread r1 = r4.f     // Catch: java.lang.Throwable -> L28 com.danikula.videocache.ProxyCacheException -> L2a
            r1.interrupt()     // Catch: java.lang.Throwable -> L28 com.danikula.videocache.ProxyCacheException -> L2a
            goto L2c
        L28:
            r1 = move-exception
            goto L37
        L2a:
            r1 = move-exception
            goto L32
        L2c:
            com.danikula.videocache.d r1 = r4.b     // Catch: java.lang.Throwable -> L28 com.danikula.videocache.ProxyCacheException -> L2a
            r1.close()     // Catch: java.lang.Throwable -> L28 com.danikula.videocache.ProxyCacheException -> L2a
            goto L35
        L32:
            r4.h(r1)     // Catch: java.lang.Throwable -> L28
        L35:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            return
        L37:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            throw r1
    }
}
