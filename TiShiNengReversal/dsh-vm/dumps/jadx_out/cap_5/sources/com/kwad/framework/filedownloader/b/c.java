package com.kwad.framework.filedownloader.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c implements com.kwad.framework.filedownloader.b.a {
    private final com.kwad.framework.filedownloader.b.b amJ;
    private final com.kwad.framework.filedownloader.b.d amK;
    private final long amL;
    private volatile java.util.List<java.lang.Integer> amM;
    private java.util.concurrent.atomic.AtomicInteger amN;
    private volatile java.lang.Thread amO;
    private android.os.Handler handler;


    public c() {
            r3 = this;
            r3.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r3.amM = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            r3.amN = r0
            com.kwad.framework.filedownloader.b.b r0 = new com.kwad.framework.filedownloader.b.b
            r0.<init>()
            r3.amJ = r0
            com.kwad.framework.filedownloader.b.d r0 = new com.kwad.framework.filedownloader.b.d
            r0.<init>()
            r3.amK = r0
            com.kwad.framework.filedownloader.f.e r0 = com.kwad.framework.filedownloader.f.e.zB()
            long r0 = r0.apF
            r3.amL = r0
            android.os.HandlerThread r0 = new android.os.HandlerThread
            java.lang.String r1 = "RemitHandoverToDB"
            java.lang.String r1 = com.kwad.framework.filedownloader.f.f.bG(r1)
            r2 = 10
            r0.<init>(r1, r2)
            r0.start()
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r0 = r0.getLooper()
            com.kwad.framework.filedownloader.b.c$1 r2 = new com.kwad.framework.filedownloader.b.c$1
            r2.<init>(r3)
            r1.<init>(r0, r2)
            r3.handler = r1
            return
    }

    static /* synthetic */ java.lang.Thread a(com.kwad.framework.filedownloader.b.c r0) {
            java.lang.Thread r0 = r0.amO
            return r0
    }

    static /* synthetic */ java.lang.Thread a(com.kwad.framework.filedownloader.b.c r0, java.lang.Thread r1) {
            r1 = 0
            r0.amO = r1
            return r1
    }

    static /* synthetic */ void a(com.kwad.framework.filedownloader.b.c r0, int r1) {
            r0.bI(r1)
            return
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicInteger b(com.kwad.framework.filedownloader.b.c r0) {
            java.util.concurrent.atomic.AtomicInteger r0 = r0.amN
            return r0
    }

    private void bI(int r3) {
            r2 = this;
            com.kwad.framework.filedownloader.b.d r0 = r2.amK
            com.kwad.framework.filedownloader.b.b r1 = r2.amJ
            com.kwad.framework.filedownloader.d.c r1 = r1.bD(r3)
            r0.b(r1)
            com.kwad.framework.filedownloader.b.b r0 = r2.amJ
            java.util.List r0 = r0.bE(r3)
            com.kwad.framework.filedownloader.b.d r1 = r2.amK
            r1.bF(r3)
            java.util.Iterator r3 = r0.iterator()
        L1a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r3.next()
            com.kwad.framework.filedownloader.d.a r0 = (com.kwad.framework.filedownloader.d.a) r0
            com.kwad.framework.filedownloader.b.d r1 = r2.amK
            r1.a(r0)
            goto L1a
        L2c:
            return
    }

    private boolean bJ(int r2) {
            r1 = this;
            java.util.List<java.lang.Integer> r0 = r1.amM
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = r0.contains(r2)
            if (r2 != 0) goto Le
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }

    private void bK(int r2) {
            r1 = this;
            android.os.Handler r0 = r1.handler
            r0.removeMessages(r2)
            java.util.concurrent.atomic.AtomicInteger r0 = r1.amN
            int r0 = r0.get()
            if (r0 != r2) goto L1d
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r1.amO = r2
            android.os.Handler r2 = r1.handler
            r0 = 0
            r2.sendEmptyMessage(r0)
            java.util.concurrent.locks.LockSupport.park()
            return
        L1d:
            r1.bI(r2)
            return
    }

    static /* synthetic */ java.util.List c(com.kwad.framework.filedownloader.b.c r0) {
            java.util.List<java.lang.Integer> r0 = r0.amM
            return r0
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void a(int r2, int r3, long r4) {
            r1 = this;
            com.kwad.framework.filedownloader.b.b r0 = r1.amJ
            r0.a(r2, r3, r4)
            boolean r0 = r1.bJ(r2)
            if (r0 == 0) goto Lc
            return
        Lc:
            com.kwad.framework.filedownloader.b.d r0 = r1.amK
            r0.a(r2, r3, r4)
            return
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void a(int r8, long r9, java.lang.String r11, java.lang.String r12) {
            r7 = this;
            com.kwad.framework.filedownloader.b.b r0 = r7.amJ
            r1 = r8
            r2 = r9
            r4 = r11
            r5 = r12
            r0.a(r1, r2, r4, r5)
            boolean r8 = r7.bJ(r1)
            if (r8 == 0) goto L10
            return
        L10:
            r6 = r5
            r5 = r4
            r3 = r2
            r2 = r1
            com.kwad.framework.filedownloader.b.d r1 = r7.amK
            r1.a(r2, r3, r5, r6)
            return
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void a(int r10, java.lang.String r11, long r12, long r14, int r16) {
            r9 = this;
            com.kwad.framework.filedownloader.b.b r0 = r9.amJ
            r1 = r10
            r2 = r11
            r3 = r12
            r5 = r14
            r7 = r16
            r0.a(r1, r2, r3, r5, r7)
            boolean r0 = r9.bJ(r10)
            if (r0 == 0) goto L12
            return
        L12:
            com.kwad.framework.filedownloader.b.d r1 = r9.amK
            r2 = r10
            r3 = r11
            r4 = r12
            r6 = r14
            r8 = r16
            r1.a(r2, r3, r4, r6, r8)
            return
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void a(int r2, java.lang.Throwable r3) {
            r1 = this;
            com.kwad.framework.filedownloader.b.b r0 = r1.amJ
            r0.a(r2, r3)
            boolean r0 = r1.bJ(r2)
            if (r0 == 0) goto Lc
            return
        Lc:
            com.kwad.framework.filedownloader.b.d r0 = r1.amK
            r0.a(r2, r3)
            return
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void a(int r2, java.lang.Throwable r3, long r4) {
            r1 = this;
            com.kwad.framework.filedownloader.b.b r0 = r1.amJ
            r0.a(r2, r3, r4)
            boolean r0 = r1.bJ(r2)
            if (r0 == 0) goto Le
            r1.bK(r2)
        Le:
            com.kwad.framework.filedownloader.b.d r0 = r1.amK
            r0.a(r2, r3, r4)
            java.util.List<java.lang.Integer> r3 = r1.amM
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.remove(r2)
            return
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void a(com.kwad.framework.filedownloader.d.a r2) {
            r1 = this;
            com.kwad.framework.filedownloader.b.b r0 = r1.amJ
            r0.a(r2)
            int r0 = r2.getId()
            boolean r0 = r1.bJ(r0)
            if (r0 == 0) goto L10
            return
        L10:
            com.kwad.framework.filedownloader.b.d r0 = r1.amK
            r0.a(r2)
            return
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void b(int r2, long r3) {
            r1 = this;
            com.kwad.framework.filedownloader.b.b r0 = r1.amJ
            r0.b(r2, r3)
            boolean r0 = r1.bJ(r2)
            if (r0 == 0) goto Lc
            return
        Lc:
            com.kwad.framework.filedownloader.b.d r0 = r1.amK
            r0.b(r2, r3)
            return
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void b(com.kwad.framework.filedownloader.d.c r2) {
            r1 = this;
            com.kwad.framework.filedownloader.b.b r0 = r1.amJ
            r0.b(r2)
            int r0 = r2.getId()
            boolean r0 = r1.bJ(r0)
            if (r0 == 0) goto L10
            return
        L10:
            com.kwad.framework.filedownloader.b.d r0 = r1.amK
            r0.b(r2)
            return
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void bC(int r4) {
            r3 = this;
            android.os.Handler r0 = r3.handler
            long r1 = r3.amL
            r0.sendEmptyMessageDelayed(r4, r1)
            return
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final com.kwad.framework.filedownloader.d.c bD(int r2) {
            r1 = this;
            com.kwad.framework.filedownloader.b.b r0 = r1.amJ
            com.kwad.framework.filedownloader.d.c r2 = r0.bD(r2)
            return r2
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final java.util.List<com.kwad.framework.filedownloader.d.a> bE(int r2) {
            r1 = this;
            com.kwad.framework.filedownloader.b.b r0 = r1.amJ
            java.util.List r2 = r0.bE(r2)
            return r2
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void bF(int r2) {
            r1 = this;
            com.kwad.framework.filedownloader.b.b r0 = r1.amJ
            r0.bF(r2)
            boolean r0 = r1.bJ(r2)
            if (r0 == 0) goto Lc
            return
        Lc:
            com.kwad.framework.filedownloader.b.d r0 = r1.amK
            r0.bF(r2)
            return
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final boolean bG(int r2) {
            r1 = this;
            com.kwad.framework.filedownloader.b.d r0 = r1.amK
            r0.bG(r2)
            com.kwad.framework.filedownloader.b.b r0 = r1.amJ
            boolean r2 = r0.bG(r2)
            return r2
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void bH(int r2) {
            r1 = this;
            com.kwad.framework.filedownloader.b.b r0 = r1.amJ
            r0.bH(r2)
            boolean r0 = r1.bJ(r2)
            if (r0 == 0) goto Lc
            return
        Lc:
            com.kwad.framework.filedownloader.b.d r0 = r1.amK
            r0.bH(r2)
            return
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void c(int r3, long r4) {
            r2 = this;
            com.kwad.framework.filedownloader.b.b r0 = r2.amJ
            r0.c(r3, r4)
            boolean r0 = r2.bJ(r3)
            if (r0 == 0) goto L27
            android.os.Handler r0 = r2.handler
            r0.removeMessages(r3)
            java.util.concurrent.atomic.AtomicInteger r0 = r2.amN
            int r0 = r0.get()
            if (r0 != r3) goto L2c
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r2.amO = r0
            android.os.Handler r0 = r2.handler
            r1 = 0
            r0.sendEmptyMessage(r1)
            java.util.concurrent.locks.LockSupport.park()
        L27:
            com.kwad.framework.filedownloader.b.d r0 = r2.amK
            r0.c(r3, r4)
        L2c:
            java.util.List<java.lang.Integer> r4 = r2.amM
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.remove(r3)
            return
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void clear() {
            r1 = this;
            com.kwad.framework.filedownloader.b.b r0 = r1.amJ
            r0.clear()
            com.kwad.framework.filedownloader.b.d r0 = r1.amK
            r0.clear()
            return
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void d(int r2, long r3) {
            r1 = this;
            com.kwad.framework.filedownloader.b.b r0 = r1.amJ
            r0.d(r2, r3)
            boolean r0 = r1.bJ(r2)
            if (r0 == 0) goto Le
            r1.bK(r2)
        Le:
            com.kwad.framework.filedownloader.b.d r0 = r1.amK
            r0.d(r2, r3)
            java.util.List<java.lang.Integer> r3 = r1.amM
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.remove(r2)
            return
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void t(int r2, int r3) {
            r1 = this;
            com.kwad.framework.filedownloader.b.b r0 = r1.amJ
            r0.t(r2, r3)
            boolean r0 = r1.bJ(r2)
            if (r0 == 0) goto Lc
            return
        Lc:
            com.kwad.framework.filedownloader.b.d r0 = r1.amK
            r0.t(r2, r3)
            return
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final com.kwad.framework.filedownloader.b.a.InterfaceC0111a xT() {
            r3 = this;
            com.kwad.framework.filedownloader.b.d r0 = r3.amK
            com.kwad.framework.filedownloader.b.b r1 = r3.amJ
            android.util.SparseArray<com.kwad.framework.filedownloader.d.c> r2 = r1.amG
            android.util.SparseArray<java.util.List<com.kwad.framework.filedownloader.d.a>> r1 = r1.amH
            com.kwad.framework.filedownloader.b.a$a r0 = r0.a(r2, r1)
            return r0
    }
}
