package com.beizi.ad.internal.i;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
class l {
    private final com.beizi.ad.internal.i.o a;

    /* renamed from: b, reason: collision with root package name */
    private final com.beizi.ad.internal.i.a f6989b;

    /* renamed from: c, reason: collision with root package name */
    private final java.lang.Object f6990c;

    /* renamed from: d, reason: collision with root package name */
    private final java.lang.Object f6991d;

    /* renamed from: e, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicInteger f6992e;

    /* renamed from: f, reason: collision with root package name */
    private volatile java.lang.Thread f6993f;

    /* renamed from: g, reason: collision with root package name */
    private volatile boolean f6994g;

    /* renamed from: h, reason: collision with root package name */
    private volatile int f6995h;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.beizi.ad.internal.i.l$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class a implements java.lang.Runnable {
        final /* synthetic */ com.beizi.ad.internal.i.l a;

        private a(com.beizi.ad.internal.i.l r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ a(com.beizi.ad.internal.i.l r1, com.beizi.ad.internal.i.l.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                com.beizi.ad.internal.i.l r0 = r1.a
                com.beizi.ad.internal.i.l.a(r0)
                return
        }
    }

    public l(com.beizi.ad.internal.i.o r2, com.beizi.ad.internal.i.a r3) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.f6990c = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.f6991d = r0
            r0 = -1
            r1.f6995h = r0
            java.lang.Object r2 = com.beizi.ad.internal.i.k.a(r2)
            com.beizi.ad.internal.i.o r2 = (com.beizi.ad.internal.i.o) r2
            r1.a = r2
            java.lang.Object r2 = com.beizi.ad.internal.i.k.a(r3)
            com.beizi.ad.internal.i.a r2 = (com.beizi.ad.internal.i.a) r2
            r1.f6989b = r2
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r2.<init>()
            r1.f6992e = r2
            return
    }

    static /* synthetic */ void a(com.beizi.ad.internal.i.l r0) {
            r0.e()
            return
    }

    private void b() throws com.beizi.ad.internal.i.m {
            r4 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r4.f6992e
            int r0 = r0.get()
            r1 = 1
            if (r0 >= r1) goto La
            return
        La:
            java.util.concurrent.atomic.AtomicInteger r1 = r4.f6992e
            r2 = 0
            r1.set(r2)
            com.beizi.ad.internal.i.m r1 = new com.beizi.ad.internal.i.m
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

    private void b(long r1, long r3) {
            r0 = this;
            r0.a(r1, r3)
            java.lang.Object r1 = r0.f6990c
            monitor-enter(r1)
            java.lang.Object r2 = r0.f6990c     // Catch: java.lang.Throwable -> Ld
            r2.notifyAll()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }

    private synchronized void c() throws com.beizi.ad.internal.i.m {
            r4 = this;
            monitor-enter(r4)
            java.lang.Thread r0 = r4.f6993f     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L13
            java.lang.Thread r0 = r4.f6993f     // Catch: java.lang.Throwable -> L11
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
            boolean r1 = r4.f6994g     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto L47
            com.beizi.ad.internal.i.a r1 = r4.f6989b     // Catch: java.lang.Throwable -> L11
            boolean r1 = r1.d()     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto L47
            if (r0 != 0) goto L47
            java.lang.Thread r0 = new java.lang.Thread     // Catch: java.lang.Throwable -> L11
            com.beizi.ad.internal.i.l$a r1 = new com.beizi.ad.internal.i.l$a     // Catch: java.lang.Throwable -> L11
            r2 = 0
            r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> L11
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11
            r2.<init>()     // Catch: java.lang.Throwable -> L11
            java.lang.String r3 = "Source reader for "
            r2.append(r3)     // Catch: java.lang.Throwable -> L11
            com.beizi.ad.internal.i.o r3 = r4.a     // Catch: java.lang.Throwable -> L11
            r2.append(r3)     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L11
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L11
            r4.f6993f = r0     // Catch: java.lang.Throwable -> L11
            java.lang.Thread r0 = r4.f6993f     // Catch: java.lang.Throwable -> L11
            r0.start()     // Catch: java.lang.Throwable -> L11
        L47:
            monitor-exit(r4)
            return
        L49:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            throw r0
    }

    private void d() throws com.beizi.ad.internal.i.m {
            r4 = this;
            java.lang.Object r0 = r4.f6990c
            monitor-enter(r0)
            java.lang.Object r1 = r4.f6990c     // Catch: java.lang.Throwable -> Lc java.lang.InterruptedException -> Le
            r2 = 1000(0x3e8, double:4.94E-321)
            r1.wait(r2)     // Catch: java.lang.Throwable -> Lc java.lang.InterruptedException -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r1 = move-exception
            goto L17
        Le:
            r1 = move-exception
            com.beizi.ad.internal.i.m r2 = new com.beizi.ad.internal.i.m     // Catch: java.lang.Throwable -> Lc
            java.lang.String r3 = "Waiting source data is interrupted!"
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> Lc
            throw r2     // Catch: java.lang.Throwable -> Lc
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }

    private void e() {
            r8 = this;
            r0 = -1
            r1 = 0
            com.beizi.ad.internal.i.a r2 = r8.f6989b     // Catch: java.lang.Throwable -> L4c
            int r1 = r2.a()     // Catch: java.lang.Throwable -> L4c
            com.beizi.ad.internal.i.o r2 = r8.a     // Catch: java.lang.Throwable -> L4c
            r2.a(r1)     // Catch: java.lang.Throwable -> L4c
            com.beizi.ad.internal.i.o r2 = r8.a     // Catch: java.lang.Throwable -> L4c
            int r2 = r2.a()     // Catch: java.lang.Throwable -> L4c
            r3 = 8192(0x2000, float:1.148E-41)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L41
        L17:
            com.beizi.ad.internal.i.o r4 = r8.a     // Catch: java.lang.Throwable -> L41
            int r4 = r4.a(r3)     // Catch: java.lang.Throwable -> L41
            if (r4 == r0) goto L45
            java.lang.Object r5 = r8.f6991d     // Catch: java.lang.Throwable -> L41
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L41
            boolean r6 = r8.h()     // Catch: java.lang.Throwable -> L32
            if (r6 == 0) goto L34
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L32
        L29:
            r8.i()
            long r0 = (long) r1
            long r2 = (long) r2
            r8.b(r0, r2)
            return
        L32:
            r0 = move-exception
            goto L43
        L34:
            com.beizi.ad.internal.i.a r6 = r8.f6989b     // Catch: java.lang.Throwable -> L32
            r6.a(r3, r4)     // Catch: java.lang.Throwable -> L32
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L32
            int r1 = r1 + r4
            long r4 = (long) r1
            long r6 = (long) r2
            r8.b(r4, r6)     // Catch: java.lang.Throwable -> L41
            goto L17
        L41:
            r0 = move-exception
            goto L4f
        L43:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L32
            throw r0     // Catch: java.lang.Throwable -> L41
        L45:
            r8.g()     // Catch: java.lang.Throwable -> L41
            r8.f()     // Catch: java.lang.Throwable -> L41
            goto L29
        L4c:
            r2 = move-exception
            r0 = r2
            r2 = -1
        L4f:
            java.util.concurrent.atomic.AtomicInteger r3 = r8.f6992e     // Catch: java.lang.Throwable -> L58
            r3.incrementAndGet()     // Catch: java.lang.Throwable -> L58
            r8.a(r0)     // Catch: java.lang.Throwable -> L58
            goto L29
        L58:
            r0 = move-exception
            r8.i()
            long r3 = (long) r1
            long r1 = (long) r2
            r8.b(r3, r1)
            throw r0
    }

    private void f() {
            r1 = this;
            r0 = 100
            r1.f6995h = r0
            int r0 = r1.f6995h
            r1.a(r0)
            return
    }

    private void g() throws com.beizi.ad.internal.i.m {
            r3 = this;
            java.lang.Object r0 = r3.f6991d
            monitor-enter(r0)
            boolean r1 = r3.h()     // Catch: java.lang.Throwable -> L1d
            if (r1 != 0) goto L1f
            com.beizi.ad.internal.i.a r1 = r3.f6989b     // Catch: java.lang.Throwable -> L1d
            int r1 = r1.a()     // Catch: java.lang.Throwable -> L1d
            com.beizi.ad.internal.i.o r2 = r3.a     // Catch: java.lang.Throwable -> L1d
            int r2 = r2.a()     // Catch: java.lang.Throwable -> L1d
            if (r1 != r2) goto L1f
            com.beizi.ad.internal.i.a r1 = r3.f6989b     // Catch: java.lang.Throwable -> L1d
            r1.c()     // Catch: java.lang.Throwable -> L1d
            goto L1f
        L1d:
            r1 = move-exception
            goto L21
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r1
    }

    private boolean h() {
            r1 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r0 = r0.isInterrupted()
            if (r0 != 0) goto L11
            boolean r0 = r1.f6994g
            if (r0 == 0) goto Lf
            goto L11
        Lf:
            r0 = 0
            return r0
        L11:
            r0 = 1
            return r0
    }

    private void i() {
            r4 = this;
            com.beizi.ad.internal.i.o r0 = r4.a     // Catch: com.beizi.ad.internal.i.m -> L6
            r0.b()     // Catch: com.beizi.ad.internal.i.m -> L6
            return
        L6:
            r0 = move-exception
            com.beizi.ad.internal.i.m r1 = new com.beizi.ad.internal.i.m
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error closing source "
            r2.append(r3)
            com.beizi.ad.internal.i.o r3 = r4.a
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            r4.a(r1)
            return
    }

    public int a(byte[] r6, long r7, int r9) throws com.beizi.ad.internal.i.m {
            r5 = this;
            com.beizi.ad.internal.i.n.a(r6, r7, r9)
        L3:
            com.beizi.ad.internal.i.a r0 = r5.f6989b
            boolean r0 = r0.d()
            if (r0 != 0) goto L26
            com.beizi.ad.internal.i.a r0 = r5.f6989b
            int r0 = r0.a()
            long r0 = (long) r0
            long r2 = (long) r9
            long r2 = r2 + r7
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L26
            boolean r0 = r5.f6994g
            if (r0 != 0) goto L26
            r5.c()
            r5.d()
            r5.b()
            goto L3
        L26:
            com.beizi.ad.internal.i.a r0 = r5.f6989b
            int r6 = r0.a(r6, r7, r9)
            com.beizi.ad.internal.i.a r7 = r5.f6989b
            boolean r7 = r7.d()
            if (r7 == 0) goto L3f
            int r7 = r5.f6995h
            r8 = 100
            if (r7 == r8) goto L3f
            r5.f6995h = r8
            r5.a(r8)
        L3f:
            return r6
    }

    public void a() {
            r2 = this;
            java.lang.Object r0 = r2.f6991d
            monitor-enter(r0)
            r1 = 1
            r2.f6994g = r1     // Catch: java.lang.Throwable -> L10 com.beizi.ad.internal.i.m -> L12
            java.lang.Thread r1 = r2.f6993f     // Catch: java.lang.Throwable -> L10 com.beizi.ad.internal.i.m -> L12
            if (r1 == 0) goto L14
            java.lang.Thread r1 = r2.f6993f     // Catch: java.lang.Throwable -> L10 com.beizi.ad.internal.i.m -> L12
            r1.interrupt()     // Catch: java.lang.Throwable -> L10 com.beizi.ad.internal.i.m -> L12
            goto L14
        L10:
            r1 = move-exception
            goto L1f
        L12:
            r1 = move-exception
            goto L1a
        L14:
            com.beizi.ad.internal.i.a r1 = r2.f6989b     // Catch: java.lang.Throwable -> L10 com.beizi.ad.internal.i.m -> L12
            r1.b()     // Catch: java.lang.Throwable -> L10 com.beizi.ad.internal.i.m -> L12
            goto L1d
        L1a:
            r2.a(r1)     // Catch: java.lang.Throwable -> L10
        L1d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r1
    }

    protected void a(int r1) {
            r0 = this;
            return
    }

    protected void a(long r4, long r6) {
            r3 = this;
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 != 0) goto L9
            r4 = 100
            goto Lf
        L9:
            r0 = 100
            long r4 = r4 * r0
            long r4 = r4 / r6
            int r4 = (int) r4
        Lf:
            int r5 = r3.f6995h
            if (r4 == r5) goto L15
            r5 = 1
            goto L16
        L15:
            r5 = 0
        L16:
            if (r2 < 0) goto L1d
            if (r5 == 0) goto L1d
            r3.a(r4)
        L1d:
            r3.f6995h = r4
            return
    }

    protected final void a(java.lang.Throwable r1) {
            r0 = this;
            return
    }
}
