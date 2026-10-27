package com.bykv.vk.openvk.component.video.j.r;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class r implements com.bykv.vk.openvk.component.video.api.j, com.bykv.vk.openvk.component.video.j.r.cw.ae, com.bykv.vk.openvk.component.video.j.r.cw.InterfaceC0176cw, com.bykv.vk.openvk.component.video.j.r.cw.j, com.bykv.vk.openvk.component.video.j.r.cw.m, com.bykv.vk.openvk.component.video.j.r.cw.r, com.bykv.vk.openvk.component.video.j.r.cw.up, com.bykv.vk.openvk.component.video.j.r.cw.xt, com.bytedance.sdk.component.utils.l.j {
    private static final java.util.concurrent.atomic.AtomicInteger j = null;

    /* renamed from: s, reason: collision with root package name */
    private static final android.util.SparseIntArray f1697s = null;
    private boolean a;
    private volatile com.bykv.vk.openvk.component.video.j.r.cw ae;
    private boolean av;
    private volatile boolean az;
    private final com.bykv.vk.openvk.component.video.j.r.r.j c;
    private java.lang.String ch;
    private android.view.SurfaceHolder cw;
    private final java.lang.Runnable ed;
    private boolean f;
    private boolean g;
    private java.util.concurrent.atomic.AtomicBoolean gq;
    private volatile boolean gx;
    private boolean h;
    private long i;
    private long jy;
    private long kt;

    /* renamed from: l, reason: collision with root package name */
    private final java.util.List<java.lang.ref.WeakReference<com.bykv.vk.openvk.component.video.api.j.InterfaceC0173j>> f1698l;
    private volatile int la;

    /* renamed from: m, reason: collision with root package name */
    private boolean f1699m;
    private long mi;

    /* renamed from: n, reason: collision with root package name */
    private long f1700n;
    private long nd;
    private boolean oq;

    /* renamed from: p, reason: collision with root package name */
    private com.bykv.vk.openvk.component.video.api.cw.r f1701p;
    private boolean qv;

    /* renamed from: r, reason: collision with root package name */
    private int f1702r;
    private boolean rh;
    private java.util.concurrent.atomic.AtomicBoolean rn;
    private long tj;
    private final boolean tl;
    private android.view.Surface uf;
    private int up;

    /* renamed from: v, reason: collision with root package name */
    private java.util.ArrayList<java.lang.Runnable> f1703v;
    private volatile int vl;

    /* renamed from: w, reason: collision with root package name */
    private long f1704w;
    private java.util.concurrent.atomic.AtomicBoolean wq;
    private volatile com.bytedance.sdk.component.utils.l ws;

    /* renamed from: x, reason: collision with root package name */
    private int f1705x;
    private android.graphics.SurfaceTexture xt;


















    class j implements java.lang.Runnable {
        private boolean cw;
        final /* synthetic */ com.bykv.vk.openvk.component.video.j.r.r j;
        private long xt;

        j(com.bykv.vk.openvk.component.video.j.r.r r1) {
                r0 = this;
                r0.j = r1
                r0.<init>()
                return
        }

        public void j(long r1) {
                r0 = this;
                r0.xt = r1
                return
        }

        public void j(boolean r1) {
                r0 = this;
                r0.cw = r1
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r5 = this;
                com.bykv.vk.openvk.component.video.j.r.r r0 = r5.j
                com.bykv.vk.openvk.component.video.j.r.cw r0 = com.bykv.vk.openvk.component.video.j.r.r.j(r0)
                if (r0 == 0) goto L29
                boolean r0 = r5.cw     // Catch: java.lang.Throwable -> L22
                if (r0 != 0) goto L24
                com.bykv.vk.openvk.component.video.j.r.r r0 = r5.j     // Catch: java.lang.Throwable -> L22
                com.bykv.vk.openvk.component.video.j.r.cw r0 = com.bykv.vk.openvk.component.video.j.r.r.j(r0)     // Catch: java.lang.Throwable -> L22
                long r0 = r0.g()     // Catch: java.lang.Throwable -> L22
                com.bykv.vk.openvk.component.video.j.r.r r2 = r5.j     // Catch: java.lang.Throwable -> L22
                long r3 = r5.xt     // Catch: java.lang.Throwable -> L22
                long r0 = java.lang.Math.max(r3, r0)     // Catch: java.lang.Throwable -> L22
                com.bykv.vk.openvk.component.video.j.r.r.r(r2, r0)     // Catch: java.lang.Throwable -> L22
                goto L24
            L22:
                goto L29
            L24:
                com.bykv.vk.openvk.component.video.j.r.r r0 = r5.j     // Catch: java.lang.Throwable -> L22
                com.bykv.vk.openvk.component.video.j.r.r.qv(r0)     // Catch: java.lang.Throwable -> L22
            L29:
                com.bykv.vk.openvk.component.video.j.r.r r0 = r5.j
                com.bytedance.sdk.component.utils.l r0 = com.bykv.vk.openvk.component.video.j.r.r.tl(r0)
                if (r0 == 0) goto L3e
                com.bykv.vk.openvk.component.video.j.r.r r0 = r5.j
                com.bytedance.sdk.component.utils.l r0 = com.bykv.vk.openvk.component.video.j.r.r.tl(r0)
                r1 = 100
                r2 = 0
                r0.sendEmptyMessageDelayed(r1, r2)
            L3e:
                return
        }
    }

    static {
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 0
            r0.<init>(r1)
            com.bykv.vk.openvk.component.video.j.r.r.j = r0
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            com.bykv.vk.openvk.component.video.j.r.r.f1697s = r0
            return
    }

    public r(java.lang.String r7) {
            r6 = this;
            r6.<init>()
            r0 = 0
            r6.f1702r = r0
            r6.f1699m = r0
            r1 = 0
            r6.ae = r1
            r6.tl = r0
            r6.g = r0
            r2 = 201(0xc9, float:2.82E-43)
            r6.vl = r2
            r2 = -1
            r6.jy = r2
            r6.az = r0
            r6.av = r0
            r2 = 0
            r6.i = r2
            r4 = -9223372036854775808
            r6.f1704w = r4
            r6.mi = r2
            r6.kt = r2
            r6.tj = r2
            r6.f1705x = r0
            java.lang.String r4 = "0"
            r6.ch = r4
            java.util.concurrent.CopyOnWriteArrayList r4 = new java.util.concurrent.CopyOnWriteArrayList
            r4.<init>()
            r6.f1698l = r4
            r6.f1701p = r1
            r6.h = r0
            r4 = 200(0xc8, float:2.8E-43)
            r6.la = r4
            java.util.concurrent.atomic.AtomicBoolean r4 = new java.util.concurrent.atomic.AtomicBoolean
            r4.<init>(r0)
            r6.gq = r4
            java.util.concurrent.atomic.AtomicBoolean r4 = new java.util.concurrent.atomic.AtomicBoolean
            r4.<init>(r0)
            r6.rn = r4
            java.util.concurrent.atomic.AtomicBoolean r4 = new java.util.concurrent.atomic.AtomicBoolean
            r4.<init>(r0)
            r6.wq = r4
            r6.uf = r1
            com.bykv.vk.openvk.component.video.j.r.r$1 r4 = new com.bykv.vk.openvk.component.video.j.r.r$1
            r4.<init>(r6)
            r6.ed = r4
            com.bykv.vk.openvk.component.video.j.r.r$j r4 = new com.bykv.vk.openvk.component.video.j.r.r$j
            r4.<init>(r6)
            r6.c = r4
            r6.f1700n = r2
            r6.nd = r2
            r6.rh = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "mda_"
            r0.<init>(r2)
            r0.append(r7)
            java.lang.String r7 = "_"
            r0.append(r7)
            java.util.concurrent.atomic.AtomicInteger r7 = com.bykv.vk.openvk.component.video.j.r.r.j
            r2 = 1
            int r7 = r7.addAndGet(r2)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.j(r7, r1)
            return
    }

    private void a() {
            r3 = this;
            android.util.SparseIntArray r0 = com.bykv.vk.openvk.component.video.j.r.r.f1697s
            int r1 = r3.f1705x
            int r1 = r0.get(r1)
            int r2 = r3.f1705x
            int r1 = r1 + 1
            r0.put(r2, r1)
            return
    }

    static /* synthetic */ int ae(com.bykv.vk.openvk.component.video.j.r.r r0) {
            int r0 = r0.f1702r
            return r0
    }

    private void ch() {
            r2 = this;
            java.lang.String r0 = "CSJ_VIDEO_MEDIA"
            java.lang.String r1 = "releaseMediaPlayer: "
            com.bykv.vk.openvk.component.video.api.m.cw.j(r0, r1)
            com.bykv.vk.openvk.component.video.j.r.cw r0 = r2.ae
            if (r0 != 0) goto Lc
            goto L3a
        Lc:
            com.bykv.vk.openvk.component.video.j.r.cw r0 = r2.ae     // Catch: java.lang.Throwable -> L11
            r0.vl()     // Catch: java.lang.Throwable -> L11
        L11:
            com.bykv.vk.openvk.component.video.j.r.cw r0 = r2.ae
            r1 = 0
            r0.j(r1)
            com.bykv.vk.openvk.component.video.j.r.cw r0 = r2.ae
            r0.j(r1)
            com.bykv.vk.openvk.component.video.j.r.cw r0 = r2.ae
            r0.j(r1)
            com.bykv.vk.openvk.component.video.j.r.cw r0 = r2.ae
            r0.j(r1)
            com.bykv.vk.openvk.component.video.j.r.cw r0 = r2.ae
            r0.j(r1)
            com.bykv.vk.openvk.component.video.j.r.cw r0 = r2.ae
            r0.j(r1)
            com.bykv.vk.openvk.component.video.j.r.cw r0 = r2.ae
            r0.j(r1)
            com.bykv.vk.openvk.component.video.j.r.cw r0 = r2.ae     // Catch: java.lang.Throwable -> L3a
            r0.qv()     // Catch: java.lang.Throwable -> L3a
        L3a:
            return
    }

    static /* synthetic */ long cw(com.bykv.vk.openvk.component.video.j.r.r r0, long r1) {
            r0.f1704w = r1
            return r1
    }

    static /* synthetic */ boolean cw(com.bykv.vk.openvk.component.video.j.r.r r0) {
            boolean r0 = r0.av
            return r0
    }

    static /* synthetic */ boolean cw(com.bykv.vk.openvk.component.video.j.r.r r0, boolean r1) {
            r0.gx = r1
            return r1
    }

    private void f() {
            r3 = this;
            r0 = 0
            r3.i = r0
            r2 = 0
            r3.f1702r = r2
            r3.mi = r0
            r3.av = r2
            r0 = -9223372036854775808
            r3.f1704w = r0
            return
    }

    static /* synthetic */ void g(com.bykv.vk.openvk.component.video.j.r.r r0) {
            r0.la()
            return
    }

    private void gq() {
            r1 = this;
            java.util.ArrayList<java.lang.Runnable> r0 = r1.f1703v
            if (r0 == 0) goto L10
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            goto L10
        Lb:
            java.util.ArrayList<java.lang.Runnable> r0 = r1.f1703v
            r0.clear()
        L10:
            return
    }

    private void h() {
            r2 = this;
            boolean r0 = r2.oq
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r2.oq = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.ArrayList<java.lang.Runnable> r1 = r2.f1703v
            r0.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r1.run()
            goto L13
        L23:
            java.util.ArrayList<java.lang.Runnable> r0 = r2.f1703v
            r0.clear()
            r0 = 0
            r2.oq = r0
            return
    }

    static /* synthetic */ int j(com.bykv.vk.openvk.component.video.j.r.r r0, int r1) {
            r0.vl = r1
            return r1
    }

    static /* synthetic */ long j(com.bykv.vk.openvk.component.video.j.r.r r0, long r1) {
            r0.mi = r1
            return r1
    }

    static /* synthetic */ com.bykv.vk.openvk.component.video.j.r.cw j(com.bykv.vk.openvk.component.video.j.r.r r0) {
            com.bykv.vk.openvk.component.video.j.r.cw r0 = r0.ae
            return r0
    }

    static /* synthetic */ com.bykv.vk.openvk.component.video.j.r.cw j(com.bykv.vk.openvk.component.video.j.r.r r0, com.bykv.vk.openvk.component.video.j.r.cw r1) {
            r0.ae = r1
            return r1
    }

    static /* synthetic */ com.bytedance.sdk.component.utils.l j(com.bykv.vk.openvk.component.video.j.r.r r0, com.bytedance.sdk.component.utils.l r1) {
            r0.ws = r1
            return r1
    }

    static /* synthetic */ java.lang.String j(com.bykv.vk.openvk.component.video.j.r.r r0, java.lang.String r1) {
            r0.ch = r1
            return r1
    }

    private void j(long r9, long r11) {
            r8 = this;
            java.util.List<java.lang.ref.WeakReference<com.bykv.vk.openvk.component.video.api.j$j>> r0 = r8.f1698l
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            if (r1 == 0) goto L28
            java.lang.Object r2 = r1.get()
            if (r2 == 0) goto L28
            java.lang.Object r1 = r1.get()
            r2 = r1
            com.bykv.vk.openvk.component.video.api.j$j r2 = (com.bykv.vk.openvk.component.video.api.j.InterfaceC0173j) r2
            r3 = r8
            r4 = r9
            r6 = r11
            r2.j(r3, r4, r6)
            goto L2a
        L28:
            r4 = r9
            r6 = r11
        L2a:
            r9 = r4
            r11 = r6
            goto L6
        L2d:
            return
    }

    static /* synthetic */ void j(com.bykv.vk.openvk.component.video.j.r.r r0, int r1, int r2) {
            r0.xt(r1, r2)
            return
    }

    static /* synthetic */ void j(com.bykv.vk.openvk.component.video.j.r.r r0, long r1, long r3) {
            r0.j(r1, r3)
            return
    }

    private void j(java.lang.Runnable r2) {
            r1 = this;
            java.util.ArrayList<java.lang.Runnable> r0 = r1.f1703v     // Catch: java.lang.Throwable -> Lc
            if (r0 != 0) goto Le
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lc
            r0.<init>()     // Catch: java.lang.Throwable -> Lc
            r1.f1703v = r0     // Catch: java.lang.Throwable -> Lc
            goto Le
        Lc:
            r2 = move-exception
            goto L14
        Le:
            java.util.ArrayList<java.lang.Runnable> r0 = r1.f1703v     // Catch: java.lang.Throwable -> Lc
            r0.add(r2)     // Catch: java.lang.Throwable -> Lc
            return
        L14:
            java.lang.String r0 = "CSJ_VIDEO_MEDIA"
            java.lang.String r2 = r2.getMessage()
            com.bykv.vk.openvk.component.video.api.m.cw.cw(r0, r2)
            return
    }

    private void j(java.lang.String r3) throws java.lang.Throwable {
            r2 = this;
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r3)
            com.bykv.vk.openvk.component.video.j.r.cw r3 = r2.ae
            java.io.FileDescriptor r1 = r0.getFD()
            r3.j(r1)
            r0.close()
            return
    }

    private void j(java.lang.String r4, android.os.Looper r5) {
            r3 = this;
            r0 = 0
            r3.f1705x = r0
            r0 = 1
            if (r5 == 0) goto L10
            r3.az = r0
            com.bytedance.sdk.component.utils.l r4 = new com.bytedance.sdk.component.utils.l
            r4.<init>(r5, r3)
            r3.ws = r4
            goto L2c
        L10:
            com.bytedance.sdk.component.utils.l r5 = r3.ws
            if (r5 != 0) goto L2c
            com.bytedance.sdk.component.oq.xt.j r5 = com.bytedance.sdk.component.oq.xt.j.j()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "csj_"
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            com.bytedance.sdk.component.utils.l r4 = r5.j(r3, r4)
            r3.ws = r4
        L2c:
            r3.rh = r0
            r3.v()
            return
    }

    private boolean j(int r3, int r4) {
            r2 = this;
            r0 = -1010(0xfffffffffffffc0e, float:NaN)
            r1 = 1
            if (r3 == r0) goto L1b
            r0 = -1007(0xfffffffffffffc11, float:NaN)
            if (r3 == r0) goto L1b
            r0 = -1004(0xfffffffffffffc14, float:NaN)
            if (r3 == r0) goto L1b
            r0 = -110(0xffffffffffffff92, float:NaN)
            if (r3 == r0) goto L1b
            r0 = 100
            if (r3 == r0) goto L1b
            r0 = 200(0xc8, float:2.8E-43)
            if (r3 == r0) goto L1b
            r3 = 0
            goto L1c
        L1b:
            r3 = 1
        L1c:
            if (r4 == r1) goto L27
            r0 = 700(0x2bc, float:9.81E-43)
            if (r4 == r0) goto L27
            r0 = 800(0x320, float:1.121E-42)
            if (r4 == r0) goto L27
            return r3
        L27:
            return r1
    }

    static /* synthetic */ boolean j(com.bykv.vk.openvk.component.video.j.r.r r0, boolean r1) {
            r0.av = r1
            return r1
    }

    static /* synthetic */ boolean jy(com.bykv.vk.openvk.component.video.j.r.r r0) {
            boolean r0 = r0.az
            return r0
    }

    private void l() {
            r5 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r5.tj
            long r0 = r0 - r2
            java.util.List<java.lang.ref.WeakReference<com.bykv.vk.openvk.component.video.api.j$j>> r2 = r5.f1698l
            java.util.Iterator r2 = r2.iterator()
        Ld:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2b
            java.lang.Object r3 = r2.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            if (r3 == 0) goto Ld
            java.lang.Object r4 = r3.get()
            if (r4 == 0) goto Ld
            java.lang.Object r3 = r3.get()
            com.bykv.vk.openvk.component.video.api.j$j r3 = (com.bykv.vk.openvk.component.video.api.j.InterfaceC0173j) r3
            r3.j(r5, r0)
            goto Ld
        L2b:
            r0 = 1
            r5.f1699m = r0
            return
    }

    private void la() {
            r1 = this;
            java.util.ArrayList<java.lang.Runnable> r0 = r1.f1703v
            if (r0 == 0) goto Le
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            goto Le
        Lb:
            r1.h()
        Le:
            return
    }

    static /* synthetic */ long m(com.bykv.vk.openvk.component.video.j.r.r r2) {
            long r0 = r2.i
            return r0
    }

    static /* synthetic */ java.util.List oq(com.bykv.vk.openvk.component.video.j.r.r r0) {
            java.util.List<java.lang.ref.WeakReference<com.bykv.vk.openvk.component.video.api.j$j>> r0 = r0.f1698l
            return r0
    }

    private void p() {
            r2 = this;
            com.bytedance.sdk.component.utils.l r0 = r2.ws
            if (r0 == 0) goto Le
            com.bytedance.sdk.component.utils.l r0 = r2.ws
            com.bykv.vk.openvk.component.video.j.r.r$9 r1 = new com.bykv.vk.openvk.component.video.j.r.r$9
            r1.<init>(r2)
            r0.post(r1)
        Le:
            return
    }

    static /* synthetic */ long qv(com.bykv.vk.openvk.component.video.j.r.r r2) {
            long r0 = r2.jy
            return r0
    }

    static /* synthetic */ long r(com.bykv.vk.openvk.component.video.j.r.r r2) {
            long r0 = r2.mi
            return r0
    }

    static /* synthetic */ long r(com.bykv.vk.openvk.component.video.j.r.r r0, long r1) {
            r0.jy = r1
            return r1
    }

    static /* synthetic */ boolean r(com.bykv.vk.openvk.component.video.j.r.r r0, boolean r1) {
            r0.h = r1
            return r1
    }

    private void s() {
            r2 = this;
            com.bytedance.sdk.component.utils.l r0 = r2.ws
            if (r0 == 0) goto L13
            android.os.Looper r1 = r0.getLooper()
            if (r1 != 0) goto Lb
            goto L13
        Lb:
            com.bykv.vk.openvk.component.video.j.r.r$8 r1 = new com.bykv.vk.openvk.component.video.j.r.r$8
            r1.<init>(r2)
            r0.post(r1)
        L13:
            return
    }

    static /* synthetic */ com.bytedance.sdk.component.utils.l tl(com.bykv.vk.openvk.component.video.j.r.r r0) {
            com.bytedance.sdk.component.utils.l r0 = r0.ws
            return r0
    }

    static /* synthetic */ int up(com.bykv.vk.openvk.component.video.j.r.r r0) {
            int r0 = r0.la
            return r0
    }

    private void v() {
            r2 = this;
            com.bytedance.sdk.component.utils.l r0 = r2.ws
            if (r0 == 0) goto Le
            com.bytedance.sdk.component.utils.l r0 = r2.ws
            com.bykv.vk.openvk.component.video.j.r.r$12 r1 = new com.bykv.vk.openvk.component.video.j.r.r$12
            r1.<init>(r2)
            r0.post(r1)
        Le:
            return
    }

    static /* synthetic */ void vl(com.bykv.vk.openvk.component.video.j.r.r r0) {
            r0.v()
            return
    }

    private void x() {
            r1 = this;
            com.bykv.vk.openvk.component.video.j.r.r$2 r0 = new com.bykv.vk.openvk.component.video.j.r.r$2
            r0.<init>(r1)
            r1.xt(r0)
            return
    }

    static /* synthetic */ long xt(com.bykv.vk.openvk.component.video.j.r.r r2) {
            long r0 = r2.f1704w
            return r0
    }

    static /* synthetic */ long xt(com.bykv.vk.openvk.component.video.j.r.r r0, long r1) {
            r0.i = r1
            return r1
    }

    private void xt(int r14, int r15) {
            r13 = this;
            r15 = 701(0x2bd, float:9.82E-43)
            r0 = 2
            r1 = 1
            java.lang.String r2 = "bufferCount = "
            r3 = 0
            r4 = 2147483647(0x7fffffff, float:NaN)
            java.lang.String r5 = "CSJ_VIDEO_MEDIA"
            if (r14 != r15) goto L4d
            long r14 = android.os.SystemClock.elapsedRealtime()
            r13.f1700n = r14
            int r14 = r13.f1702r
            int r14 = r14 + r1
            r13.f1702r = r14
            java.util.List<java.lang.ref.WeakReference<com.bykv.vk.openvk.component.video.api.j$j>> r14 = r13.f1698l
            java.util.Iterator r14 = r14.iterator()
        L1f:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L3d
            java.lang.Object r15 = r14.next()
            java.lang.ref.WeakReference r15 = (java.lang.ref.WeakReference) r15
            if (r15 == 0) goto L1f
            java.lang.Object r6 = r15.get()
            if (r6 == 0) goto L1f
            java.lang.Object r15 = r15.get()
            com.bykv.vk.openvk.component.video.api.j$j r15 = (com.bykv.vk.openvk.component.video.api.j.InterfaceC0173j) r15
            r15.j(r13, r4, r3, r3)
            goto L1f
        L3d:
            int r14 = r13.f1702r
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.Object[] r15 = new java.lang.Object[r0]
            r15[r3] = r2
            r15[r1] = r14
            com.bykv.vk.openvk.component.video.api.m.cw.j(r5, r15)
            return
        L4d:
            r15 = 702(0x2be, float:9.84E-43)
            r6 = 3
            if (r14 != r15) goto La9
            long r14 = r13.f1700n
            r7 = 0
            int r9 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r9 <= 0) goto L68
            long r14 = r13.nd
            long r9 = android.os.SystemClock.elapsedRealtime()
            long r11 = r13.f1700n
            long r9 = r9 - r11
            long r14 = r14 + r9
            r13.nd = r14
            r13.f1700n = r7
        L68:
            java.util.List<java.lang.ref.WeakReference<com.bykv.vk.openvk.component.video.api.j$j>> r14 = r13.f1698l
            java.util.Iterator r14 = r14.iterator()
        L6e:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L8c
            java.lang.Object r15 = r14.next()
            java.lang.ref.WeakReference r15 = (java.lang.ref.WeakReference) r15
            if (r15 == 0) goto L6e
            java.lang.Object r7 = r15.get()
            if (r7 == 0) goto L6e
            java.lang.Object r15 = r15.get()
            com.bykv.vk.openvk.component.video.api.j$j r15 = (com.bykv.vk.openvk.component.video.api.j.InterfaceC0173j) r15
            r15.j(r13, r4)
            goto L6e
        L8c:
            int r14 = r13.f1702r
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            long r7 = r13.nd
            java.lang.Long r15 = java.lang.Long.valueOf(r7)
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r3] = r2
            r4[r1] = r14
            java.lang.String r14 = " mBufferTotalTime = "
            r4[r0] = r14
            r4[r6] = r15
            com.bykv.vk.openvk.component.video.api.m.cw.j(r5, r4)
            return
        La9:
            boolean r15 = r13.rh
            if (r15 == 0) goto Ld2
            if (r14 != r6) goto Ld2
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "hasPendingPauseCommand:"
            r14.<init>(r15)
            boolean r15 = r13.gx
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            com.bykv.vk.openvk.component.video.api.m.cw.j(r5, r14)
            r13.la()
            r13.l()
            boolean r14 = r13.h
            r13.j(r14)
            java.lang.String r14 = "onRenderStart"
            com.bykv.vk.openvk.component.video.api.m.cw.j(r5, r14)
        Ld2:
            return
    }

    private void xt(long r2) {
            r1 = this;
            com.bykv.vk.openvk.component.video.j.r.r$j r0 = r1.c
            r0.j(r2)
            boolean r2 = r1.a
            if (r2 == 0) goto Lf
            com.bykv.vk.openvk.component.video.j.r.r$j r2 = r1.c
            r1.xt(r2)
            return
        Lf:
            com.bykv.vk.openvk.component.video.api.cw.r r2 = r1.f1701p
            boolean r2 = r1.xt(r2)
            if (r2 == 0) goto L1d
            com.bykv.vk.openvk.component.video.j.r.r$j r2 = r1.c
            r1.xt(r2)
            return
        L1d:
            com.bykv.vk.openvk.component.video.j.r.r$j r2 = r1.c
            r1.j(r2)
            return
    }

    private void xt(java.lang.Runnable r2) {
            r1 = this;
            if (r2 == 0) goto L14
            boolean r0 = r1.az()
            if (r0 == 0) goto L9
            goto L14
        L9:
            boolean r0 = r1.qv
            if (r0 != 0) goto L11
            r2.run()
            return
        L11:
            r1.j(r2)
        L14:
            return
    }

    private boolean xt(com.bykv.vk.openvk.component.video.api.cw.r r1) {
            r0 = this;
            if (r1 == 0) goto La
            boolean r1 = r1.ae()
            if (r1 == 0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    static /* synthetic */ boolean xt(com.bykv.vk.openvk.component.video.j.r.r r0, boolean r1) {
            r0.g = r1
            return r1
    }

    @Override // com.bykv.vk.openvk.component.video.api.j
    public android.view.SurfaceHolder ae() {
            r1 = this;
            android.view.SurfaceHolder r0 = r1.cw
            return r0
    }

    @Override // com.bykv.vk.openvk.component.video.api.j
    public long av() {
            r5 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L19
            boolean r0 = r5.av
            if (r0 == 0) goto L16
            long r0 = r5.mi
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L16
            long r2 = r5.i
            long r2 = r2 + r0
            return r2
        L16:
            long r0 = r5.i
            return r0
        L19:
            long r0 = r5.nd
            return r0
    }

    @Override // com.bykv.vk.openvk.component.video.api.j
    public boolean az() {
            r1 = this;
            boolean r0 = r1.qv
            return r0
    }

    @Override // com.bykv.vk.openvk.component.video.api.j
    public void cw() {
            r2 = this;
            java.lang.String r0 = "CSJ_VIDEO_MEDIA"
            java.lang.String r1 = "pause: from outer"
            com.bykv.vk.openvk.component.video.api.m.cw.j(r0, r1)
            boolean r0 = r2.az()
            if (r0 == 0) goto Le
            goto L61
        Le:
            com.bytedance.sdk.component.utils.l r0 = r2.ws
            if (r0 == 0) goto L61
            com.bytedance.sdk.component.utils.l r0 = r2.ws
            r1 = 100
            r0.removeMessages(r1)
            r0 = 1
            r2.gx = r0
            boolean r0 = r2.rh
            r1 = 101(0x65, float:1.42E-43)
            if (r0 != 0) goto L42
            boolean r0 = r2.f
            if (r0 != 0) goto L38
            com.bykv.vk.openvk.component.video.api.cw.r r0 = r2.f1701p
            boolean r0 = r2.xt(r0)
            if (r0 == 0) goto L2f
            goto L38
        L2f:
            com.bykv.vk.openvk.component.video.j.r.r$16 r0 = new com.bykv.vk.openvk.component.video.j.r.r$16
            r0.<init>(r2)
            r2.j(r0)
            return
        L38:
            com.bytedance.sdk.component.utils.l r0 = r2.ws
            if (r0 == 0) goto L61
            com.bytedance.sdk.component.utils.l r0 = r2.ws
            r0.sendEmptyMessage(r1)
            return
        L42:
            boolean r0 = r2.f1699m
            if (r0 != 0) goto L58
            com.bykv.vk.openvk.component.video.api.cw.r r0 = r2.f1701p
            boolean r0 = r2.xt(r0)
            if (r0 == 0) goto L4f
            goto L58
        L4f:
            com.bykv.vk.openvk.component.video.j.r.r$17 r0 = new com.bykv.vk.openvk.component.video.j.r.r$17
            r0.<init>(r2)
            r2.j(r0)
            return
        L58:
            com.bytedance.sdk.component.utils.l r0 = r2.ws
            if (r0 == 0) goto L61
            com.bytedance.sdk.component.utils.l r0 = r2.ws
            r0.sendEmptyMessage(r1)
        L61:
            return
    }

    @Override // com.bykv.vk.openvk.component.video.j.r.cw.m
    public void cw(com.bykv.vk.openvk.component.video.j.r.cw r3) {
            r2 = this;
            java.util.List<java.lang.ref.WeakReference<com.bykv.vk.openvk.component.video.api.j$j>> r3 = r2.f1698l
            java.util.Iterator r3 = r3.iterator()
        L6:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r3.next()
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            if (r0 == 0) goto L6
            java.lang.Object r1 = r0.get()
            if (r1 == 0) goto L6
            java.lang.Object r0 = r0.get()
            com.bykv.vk.openvk.component.video.api.j$j r0 = (com.bykv.vk.openvk.component.video.api.j.InterfaceC0173j) r0
            r1 = 1
            r0.j(r2, r1)
            goto L6
        L25:
            return
    }

    @Override // com.bykv.vk.openvk.component.video.api.j
    public void cw(boolean r2) {
            r1 = this;
            boolean r0 = r1.az()
            if (r0 == 0) goto L7
            return
        L7:
            com.bykv.vk.openvk.component.video.j.r.cw r0 = r1.ae
            r0.up(r2)
            return
    }

    @Override // com.bykv.vk.openvk.component.video.api.j
    public boolean g() {
            r2 = this;
            int r0 = r2.vl
            r1 = 209(0xd1, float:2.93E-43)
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // com.bykv.vk.openvk.component.video.api.j
    public int i() {
            r1 = this;
            int r0 = r1.f1702r
            return r0
    }

    @Override // com.bykv.vk.openvk.component.video.api.j
    public void j() {
            r5 = this;
            boolean r0 = r5.az()
            if (r0 == 0) goto L7
            goto L5b
        L7:
            com.bykv.vk.openvk.component.video.j.r.cw r0 = r5.ae
            if (r0 != 0) goto Lc
            goto L5b
        Lc:
            int r0 = r5.vl
            r1 = 206(0xce, float:2.89E-43)
            r2 = 1
            if (r0 == r1) goto L38
            r5.f()
            r0 = 0
            r5.gx = r0
            com.bykv.vk.openvk.component.video.j.r.r$j r0 = r5.c
            r0.j(r2)
            r0 = 0
            r5.xt(r0)
            com.bytedance.sdk.component.utils.l r0 = r5.ws
            if (r0 == 0) goto L38
            com.bytedance.sdk.component.utils.l r0 = r5.ws
            java.lang.Runnable r1 = r5.ed
            r0.removeCallbacks(r1)
            com.bytedance.sdk.component.utils.l r0 = r5.ws
            java.lang.Runnable r1 = r5.ed
            int r3 = r5.la
            long r3 = (long) r3
            r0.postDelayed(r1, r3)
        L38:
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.gq
            r0.set(r2)
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.rn
            boolean r0 = r0.get()
            if (r0 != 0) goto L4d
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.wq
            boolean r0 = r0.get()
            if (r0 == 0) goto L5b
        L4d:
            com.bytedance.sdk.component.utils.l r0 = r5.ws
            if (r0 == 0) goto L5b
            com.bytedance.sdk.component.utils.l r0 = r5.ws
            com.bykv.vk.openvk.component.video.j.r.r$13 r1 = new com.bykv.vk.openvk.component.video.j.r.r$13
            r1.<init>(r5)
            r0.post(r1)
        L5b:
            return
    }

    @Override // com.bykv.vk.openvk.component.video.api.j
    public void j(float r2) {
            r1 = this;
            com.bykv.vk.openvk.component.video.api.xt r0 = new com.bykv.vk.openvk.component.video.api.xt     // Catch: java.lang.Throwable -> Le
            r0.<init>()     // Catch: java.lang.Throwable -> Le
            r0.j(r2)     // Catch: java.lang.Throwable -> Le
            com.bykv.vk.openvk.component.video.j.r.cw r2 = r1.ae     // Catch: java.lang.Throwable -> Le
            r2.j(r0)     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r2 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r2)
            throw r0
    }

    @Override // com.bykv.vk.openvk.component.video.api.j
    public void j(int r1) {
            r0 = this;
            r0.up = r1
            return
    }

    @Override // com.bykv.vk.openvk.component.video.api.j
    public void j(long r3) {
            r2 = this;
            boolean r0 = r2.az()
            if (r0 == 0) goto L7
            goto L1a
        L7:
            int r0 = r2.vl
            r1 = 207(0xcf, float:2.9E-43)
            if (r0 == r1) goto L1b
            int r0 = r2.vl
            r1 = 206(0xce, float:2.89E-43)
            if (r0 == r1) goto L1b
            int r0 = r2.vl
            r1 = 209(0xd1, float:2.93E-43)
            if (r0 != r1) goto L1a
            goto L1b
        L1a:
            return
        L1b:
            com.bykv.vk.openvk.component.video.j.r.r$4 r0 = new com.bykv.vk.openvk.component.video.j.r.r$4
            r0.<init>(r2, r3)
            r2.xt(r0)
            return
    }

    @Override // com.bykv.vk.openvk.component.video.api.j
    public void j(android.graphics.SurfaceTexture r2) {
            r1 = this;
            boolean r0 = r1.az()
            if (r0 == 0) goto L7
            return
        L7:
            r1.xt = r2
            r0 = 1
            r1.xt(r0)
            com.bykv.vk.openvk.component.video.j.r.r$5 r0 = new com.bykv.vk.openvk.component.video.j.r.r$5
            r0.<init>(r1, r2)
            r1.xt(r0)
            return
    }

    public void j(android.os.Message r19) {
            r18 = this;
            r1 = r18
            r0 = r19
            int r2 = r1.vl
            int r3 = r0.what
            com.bykv.vk.openvk.component.video.j.r.cw r4 = r1.ae
            if (r4 == 0) goto L26b
            int r4 = r0.what
            java.lang.String r7 = "CSJ_VIDEO_MEDIA"
            r8 = 205(0xcd, float:2.87E-43)
            r9 = 202(0xca, float:2.83E-43)
            r10 = 203(0xcb, float:2.84E-43)
            r11 = 201(0xc9, float:2.82E-43)
            r12 = 208(0xd0, float:2.91E-43)
            r13 = 209(0xd1, float:2.93E-43)
            r14 = 206(0xce, float:2.89E-43)
            r15 = 207(0xcf, float:2.9E-43)
            r5 = 1
            switch(r4) {
                case 100: goto L1e6;
                case 101: goto L19d;
                case 102: goto L194;
                case 103: goto L162;
                case 104: goto L14b;
                case 105: goto L12e;
                case 106: goto L111;
                case 107: goto L6f;
                case 108: goto L24;
                case 109: goto L24;
                case 110: goto L4f;
                case 111: goto L26;
                default: goto L24;
            }
        L24:
            goto L26b
        L26:
            java.lang.Object r0 = r0.obj     // Catch: java.lang.Throwable -> L26b
            android.graphics.SurfaceTexture r0 = (android.graphics.SurfaceTexture) r0     // Catch: java.lang.Throwable -> L26b
            android.view.Surface r2 = new android.view.Surface     // Catch: java.lang.Throwable -> L26b
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L26b
            r1.uf = r2     // Catch: java.lang.Throwable -> L26b
            com.bykv.vk.openvk.component.video.j.r.cw r0 = r1.ae     // Catch: java.lang.Throwable -> L26b
            android.view.Surface r2 = r1.uf     // Catch: java.lang.Throwable -> L26b
            r0.j(r2)     // Catch: java.lang.Throwable -> L26b
            com.bykv.vk.openvk.component.video.j.r.cw r0 = r1.ae     // Catch: java.lang.Throwable -> L26b
            r0.xt(r5)     // Catch: java.lang.Throwable -> L26b
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.wq     // Catch: java.lang.Throwable -> L26b
            r0.set(r5)     // Catch: java.lang.Throwable -> L26b
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.gq     // Catch: java.lang.Throwable -> L26b
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L26b
            if (r0 == 0) goto L26b
            r1.la()     // Catch: java.lang.Throwable -> L26b
            goto L26b
        L4f:
            java.lang.Object r0 = r0.obj     // Catch: java.lang.Throwable -> L26b
            android.view.SurfaceHolder r0 = (android.view.SurfaceHolder) r0     // Catch: java.lang.Throwable -> L26b
            com.bykv.vk.openvk.component.video.j.r.cw r2 = r1.ae     // Catch: java.lang.Throwable -> L26b
            r2.j(r0)     // Catch: java.lang.Throwable -> L26b
            com.bykv.vk.openvk.component.video.j.r.cw r0 = r1.ae     // Catch: java.lang.Throwable -> L26b
            r0.xt(r5)     // Catch: java.lang.Throwable -> L26b
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.rn     // Catch: java.lang.Throwable -> L26b
            r0.set(r5)     // Catch: java.lang.Throwable -> L26b
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.gq     // Catch: java.lang.Throwable -> L26b
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L26b
            if (r0 == 0) goto L26b
            r1.la()     // Catch: java.lang.Throwable -> L26b
            goto L26b
        L6f:
            r1.f()
            int r4 = r1.vl
            if (r4 == r11) goto L7a
            int r4 = r1.vl
            if (r4 != r10) goto L1f3
        L7a:
            java.lang.Object r0 = r0.obj     // Catch: java.lang.Throwable -> L26b
            com.bykv.vk.openvk.component.video.api.cw.r r0 = (com.bykv.vk.openvk.component.video.api.cw.r) r0     // Catch: java.lang.Throwable -> L26b
            java.lang.String r2 = r0.up()     // Catch: java.lang.Throwable -> L26b
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L26b
            if (r2 == 0) goto L8f
            java.lang.String r2 = com.bykv.vk.openvk.component.video.api.cw.j()     // Catch: java.lang.Throwable -> L26b
            r0.j(r2)     // Catch: java.lang.Throwable -> L26b
        L8f:
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L26b
            java.lang.String r3 = r0.up()     // Catch: java.lang.Throwable -> L26b
            java.lang.String r4 = r0.i()     // Catch: java.lang.Throwable -> L26b
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L26b
            boolean r3 = r2.exists()     // Catch: java.lang.Throwable -> L26b
            if (r3 == 0) goto Lbd
            r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L26b
            boolean r0 = com.bykv.vk.openvk.component.video.api.cw.xt()     // Catch: java.lang.Throwable -> L26b
            if (r0 == 0) goto Lb3
            java.lang.String r0 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L26b
            r1.j(r0)     // Catch: java.lang.Throwable -> L26b
            goto L10d
        Lb3:
            com.bykv.vk.openvk.component.video.j.r.cw r0 = r1.ae     // Catch: java.lang.Throwable -> L26b
            java.lang.String r2 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L26b
            r0.j(r2)     // Catch: java.lang.Throwable -> L26b
            goto L10d
        Lbd:
            r0.av()     // Catch: java.lang.Throwable -> L26b
            int r2 = r0.xt     // Catch: java.lang.Throwable -> L26b
            r3 = 23
            if (r2 != r5) goto Ld7
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L26b
            if (r2 >= r3) goto Ld7
            com.bykv.vk.openvk.component.video.j.r.cw r2 = r1.ae     // Catch: java.lang.Throwable -> L26b
            java.lang.String r3 = r0.av()     // Catch: java.lang.Throwable -> L26b
            r2.j(r3)     // Catch: java.lang.Throwable -> L26b
            r0.av()     // Catch: java.lang.Throwable -> L26b
            goto L10d
        Ld7:
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L26b
            if (r2 < r3) goto Le4
            com.bykv.vk.openvk.component.video.j.r.cw r2 = r1.ae     // Catch: java.lang.Throwable -> L26b
            r2.j(r0)     // Catch: java.lang.Throwable -> L26b
            r0.av()     // Catch: java.lang.Throwable -> L26b
            goto L10d
        Le4:
            com.bykv.vk.openvk.component.video.j.xt.m.j r2 = com.bykv.vk.openvk.component.video.j.xt.m.j.j()     // Catch: java.lang.Throwable -> L26b
            java.lang.String r0 = r2.xt(r0)     // Catch: java.lang.Throwable -> L26b
            if (r0 == 0) goto L108
            boolean r2 = com.bykv.vk.openvk.component.video.api.cw.xt()     // Catch: java.lang.Throwable -> L26b
            if (r2 == 0) goto L108
            java.lang.String r2 = "file"
            boolean r2 = r0.startsWith(r2)     // Catch: java.lang.Throwable -> L26b
            if (r2 == 0) goto L108
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch: java.lang.Throwable -> L26b
            java.lang.String r0 = r0.getPath()     // Catch: java.lang.Throwable -> L26b
            r1.j(r0)     // Catch: java.lang.Throwable -> L26b
            goto L10d
        L108:
            com.bykv.vk.openvk.component.video.j.r.cw r2 = r1.ae     // Catch: java.lang.Throwable -> L26b
            r2.j(r0)     // Catch: java.lang.Throwable -> L26b
        L10d:
            r1.vl = r9     // Catch: java.lang.Throwable -> L26b
            goto L26b
        L111:
            int r4 = r1.vl
            if (r4 == r14) goto L11d
            int r4 = r1.vl
            if (r4 == r15) goto L11d
            int r4 = r1.vl
            if (r4 != r13) goto L1f3
        L11d:
            com.bykv.vk.openvk.component.video.j.r.cw r2 = r1.ae     // Catch: java.lang.Throwable -> L26b
            java.lang.Object r0 = r0.obj     // Catch: java.lang.Throwable -> L26b
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L26b
            long r3 = r0.longValue()     // Catch: java.lang.Throwable -> L26b
            int r0 = r1.up     // Catch: java.lang.Throwable -> L26b
            r2.j(r3, r0)     // Catch: java.lang.Throwable -> L26b
            goto L26b
        L12e:
            int r0 = r1.vl
            if (r0 == r8) goto L142
            int r0 = r1.vl
            if (r0 == r14) goto L142
            int r0 = r1.vl
            if (r0 == r12) goto L142
            int r0 = r1.vl
            if (r0 == r15) goto L142
            int r0 = r1.vl
            if (r0 != r13) goto L1f3
        L142:
            com.bykv.vk.openvk.component.video.j.r.cw r0 = r1.ae     // Catch: java.lang.Throwable -> L26b
            r0.m()     // Catch: java.lang.Throwable -> L26b
            r1.vl = r12     // Catch: java.lang.Throwable -> L26b
            goto L26b
        L14b:
            int r0 = r1.vl
            if (r0 == r9) goto L153
            int r0 = r1.vl
            if (r0 != r12) goto L1f3
        L153:
            com.bykv.vk.openvk.component.video.j.r.cw r0 = r1.ae     // Catch: java.lang.Throwable -> L15a
            r0.tl()     // Catch: java.lang.Throwable -> L15a
            goto L26b
        L15a:
            r0 = move-exception
            java.lang.String r2 = "OP_PREPARE_ASYNC error: "
            com.bykv.vk.openvk.component.video.api.m.cw.cw(r7, r2, r0)
            goto L26b
        L162:
            r1.ch()     // Catch: java.lang.Throwable -> L166
            goto L16c
        L166:
            r0 = move-exception
            java.lang.String r2 = "OP_RELEASE error: "
            com.bykv.vk.openvk.component.video.api.m.cw.cw(r7, r2, r0)
        L16c:
            java.util.List<java.lang.ref.WeakReference<com.bykv.vk.openvk.component.video.api.j$j>> r0 = r1.f1698l
            java.util.Iterator r0 = r0.iterator()
        L172:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L190
            java.lang.Object r2 = r0.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            if (r2 == 0) goto L172
            java.lang.Object r3 = r2.get()
            if (r3 == 0) goto L172
            java.lang.Object r2 = r2.get()
            com.bykv.vk.openvk.component.video.api.j$j r2 = (com.bykv.vk.openvk.component.video.api.j.InterfaceC0173j) r2
            r2.cw(r1)
            goto L172
        L190:
            r1.vl = r10
            goto L26b
        L194:
            com.bykv.vk.openvk.component.video.j.r.cw r0 = r1.ae     // Catch: java.lang.Throwable -> L26b
            r0.vl()     // Catch: java.lang.Throwable -> L26b
            r1.vl = r11     // Catch: java.lang.Throwable -> L26b
            goto L26b
        L19d:
            boolean r0 = r1.av
            if (r0 == 0) goto L1a8
            long r6 = r1.i
            long r8 = r1.mi
            long r6 = r6 + r8
            r1.i = r6
        L1a8:
            r0 = 0
            r1.av = r0
            r6 = 0
            r1.mi = r6
            r6 = -9223372036854775808
            r1.f1704w = r6
            int r4 = r1.vl
            if (r4 == r14) goto L1bf
            int r4 = r1.vl
            if (r4 == r15) goto L1bf
            int r4 = r1.vl
            if (r4 != r13) goto L1f3
        L1bf:
            com.bykv.vk.openvk.component.video.j.r.cw r2 = r1.ae     // Catch: java.lang.Throwable -> L26b
            r2.ae()     // Catch: java.lang.Throwable -> L26b
            r1.vl = r15     // Catch: java.lang.Throwable -> L26b
            r1.gx = r0     // Catch: java.lang.Throwable -> L26b
            java.util.List<java.lang.ref.WeakReference<com.bykv.vk.openvk.component.video.api.j$j>> r0 = r1.f1698l     // Catch: java.lang.Throwable -> L26b
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L26b
        L1ce:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L26b
            if (r2 == 0) goto L26b
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L26b
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch: java.lang.Throwable -> L26b
            if (r2 == 0) goto L1ce
            java.lang.Object r3 = r2.get()     // Catch: java.lang.Throwable -> L26b
            if (r3 == 0) goto L1ce
            r2.get()     // Catch: java.lang.Throwable -> L26b
            goto L1ce
        L1e6:
            int r0 = r1.vl
            if (r0 == r8) goto L240
            int r0 = r1.vl
            if (r0 == r15) goto L240
            int r0 = r1.vl
            if (r0 != r13) goto L1f3
            goto L240
        L1f3:
            r0 = 200(0xc8, float:2.8E-43)
            r1.vl = r0
            boolean r0 = r1.g
            if (r0 != 0) goto L26b
            com.bykv.vk.openvk.component.video.api.cw.xt r0 = new com.bykv.vk.openvk.component.video.api.cw.xt
            r4 = 308(0x134, float:4.32E-43)
            r0.<init>(r4, r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = ","
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            r0.j(r2)
            java.util.List<java.lang.ref.WeakReference<com.bykv.vk.openvk.component.video.api.j$j>> r2 = r1.f1698l
            java.util.Iterator r2 = r2.iterator()
        L21f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L23d
            java.lang.Object r3 = r2.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            if (r3 == 0) goto L21f
            java.lang.Object r4 = r3.get()
            if (r4 == 0) goto L21f
            java.lang.Object r3 = r3.get()
            com.bykv.vk.openvk.component.video.api.j$j r3 = (com.bykv.vk.openvk.component.video.api.j.InterfaceC0173j) r3
            r3.j(r1, r0)
            goto L21f
        L23d:
            r1.g = r5
            return
        L240:
            com.bykv.vk.openvk.component.video.j.r.cw r0 = r1.ae     // Catch: java.lang.Throwable -> L26b
            r0.up()     // Catch: java.lang.Throwable -> L26b
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L26b
            r1.tj = r2     // Catch: java.lang.Throwable -> L26b
            r1.vl = r14     // Catch: java.lang.Throwable -> L26b
            long r2 = r1.jy     // Catch: java.lang.Throwable -> L26b
            r16 = 0
            int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r0 <= 0) goto L262
            com.bykv.vk.openvk.component.video.j.r.cw r0 = r1.ae     // Catch: java.lang.Throwable -> L26b
            long r2 = r1.jy     // Catch: java.lang.Throwable -> L26b
            int r4 = r1.up     // Catch: java.lang.Throwable -> L26b
            r0.j(r2, r4)     // Catch: java.lang.Throwable -> L26b
            r2 = -1
            r1.jy = r2     // Catch: java.lang.Throwable -> L26b
        L262:
            com.bykv.vk.openvk.component.video.api.cw.r r0 = r1.f1701p     // Catch: java.lang.Throwable -> L26b
            if (r0 == 0) goto L26b
            boolean r0 = r1.h     // Catch: java.lang.Throwable -> L26b
            r1.j(r0)     // Catch: java.lang.Throwable -> L26b
        L26b:
            return
    }

    @Override // com.bykv.vk.openvk.component.video.api.j
    public void j(android.view.SurfaceHolder r2) {
            r1 = this;
            boolean r0 = r1.az()
            if (r0 == 0) goto L7
            return
        L7:
            r1.cw = r2
            r0 = 1
            r1.xt(r0)
            com.bykv.vk.openvk.component.video.j.r.r$6 r0 = new com.bykv.vk.openvk.component.video.j.r.r$6
            r0.<init>(r1, r2)
            r1.xt(r0)
            return
    }

    @Override // com.bykv.vk.openvk.component.video.api.j
    public void j(com.bykv.vk.openvk.component.video.api.cw.r r2) {
            r1 = this;
            boolean r0 = r1.az()
            if (r0 == 0) goto L7
            return
        L7:
            r1.f1701p = r2
            if (r2 == 0) goto L1a
            boolean r0 = r1.rh
            if (r0 == 0) goto L17
            boolean r0 = r2.ae()
            if (r0 != 0) goto L17
            r0 = 1
            goto L18
        L17:
            r0 = 0
        L18:
            r1.rh = r0
        L1a:
            com.bykv.vk.openvk.component.video.j.r.r$7 r0 = new com.bykv.vk.openvk.component.video.j.r.r$7
            r0.<init>(r1, r2)
            r1.xt(r0)
            return
    }

    @Override // com.bykv.vk.openvk.component.video.api.j
    public void j(com.bykv.vk.openvk.component.video.api.j.InterfaceC0173j r3) {
            r2 = this;
            if (r3 != 0) goto L3
            goto L1d
        L3:
            java.util.List<java.lang.ref.WeakReference<com.bykv.vk.openvk.component.video.api.j$j>> r0 = r2.f1698l
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            if (r1 == 0) goto L9
            java.lang.Object r1 = r1.get()
            if (r1 != r3) goto L9
        L1d:
            return
        L1e:
            java.util.List<java.lang.ref.WeakReference<com.bykv.vk.openvk.component.video.api.j$j>> r0 = r2.f1698l
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r3)
            r0.add(r1)
            return
    }

    @Override // com.bykv.vk.openvk.component.video.j.r.cw.xt
    public void j(com.bykv.vk.openvk.component.video.j.r.cw r3) {
            r2 = this;
            r3 = 209(0xd1, float:2.93E-43)
            r2.vl = r3
            android.util.SparseIntArray r3 = com.bykv.vk.openvk.component.video.j.r.r.f1697s
            int r0 = r2.f1705x
            r3.delete(r0)
            com.bytedance.sdk.component.utils.l r3 = r2.ws
            if (r3 == 0) goto L16
            com.bytedance.sdk.component.utils.l r3 = r2.ws
            java.lang.Runnable r0 = r2.ed
            r3.removeCallbacks(r0)
        L16:
            java.util.List<java.lang.ref.WeakReference<com.bykv.vk.openvk.component.video.api.j$j>> r3 = r2.f1698l
            java.util.Iterator r3 = r3.iterator()
        L1c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3a
            java.lang.Object r0 = r3.next()
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            if (r0 == 0) goto L1c
            java.lang.Object r1 = r0.get()
            if (r1 == 0) goto L1c
            java.lang.Object r0 = r0.get()
            com.bykv.vk.openvk.component.video.api.j$j r0 = (com.bykv.vk.openvk.component.video.api.j.InterfaceC0173j) r0
            r0.j(r2)
            goto L1c
        L3a:
            return
    }

    @Override // com.bykv.vk.openvk.component.video.j.r.cw.j
    public void j(com.bykv.vk.openvk.component.video.j.r.cw r3, int r4) {
            r2 = this;
            com.bykv.vk.openvk.component.video.j.r.cw r0 = r2.ae
            if (r0 == r3) goto L5
            goto L29
        L5:
            java.util.List<java.lang.ref.WeakReference<com.bykv.vk.openvk.component.video.api.j$j>> r3 = r2.f1698l
            java.util.Iterator r3 = r3.iterator()
        Lb:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L29
            java.lang.Object r0 = r3.next()
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            if (r0 == 0) goto Lb
            java.lang.Object r1 = r0.get()
            if (r1 == 0) goto Lb
            java.lang.Object r0 = r0.get()
            com.bykv.vk.openvk.component.video.api.j$j r0 = (com.bykv.vk.openvk.component.video.api.j.InterfaceC0173j) r0
            r0.xt(r2, r4)
            goto Lb
        L29:
            return
    }

    @Override // com.bykv.vk.openvk.component.video.j.r.cw.ae
    public void j(com.bykv.vk.openvk.component.video.j.r.cw r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            java.util.List<java.lang.ref.WeakReference<com.bykv.vk.openvk.component.video.api.j$j>> r1 = r0.f1698l
            java.util.Iterator r1 = r1.iterator()
        L6:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L24
            java.lang.Object r4 = r1.next()
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
            if (r4 == 0) goto L6
            java.lang.Object r5 = r4.get()
            if (r5 == 0) goto L6
            java.lang.Object r4 = r4.get()
            com.bykv.vk.openvk.component.video.api.j$j r4 = (com.bykv.vk.openvk.component.video.api.j.InterfaceC0173j) r4
            r4.j(r0, r2, r3)
            goto L6
        L24:
            return
    }

    @Override // com.bykv.vk.openvk.component.video.api.j
    public void j(boolean r3) {
            r2 = this;
            boolean r0 = r2.az()
            if (r0 == 0) goto L7
            return
        L7:
            com.bytedance.sdk.component.utils.l r0 = r2.ws
            if (r0 != 0) goto L13
            java.lang.String r3 = "CSJ_VIDEO_MEDIA"
            java.lang.String r0 = "quietPlay set opHandler is null"
            com.bykv.vk.openvk.component.video.api.m.cw.j(r3, r0)
            return
        L13:
            com.bytedance.sdk.component.utils.l r0 = r2.ws
            com.bykv.vk.openvk.component.video.j.r.r$10 r1 = new com.bykv.vk.openvk.component.video.j.r.r$10
            r1.<init>(r2, r3)
            r0.post(r1)
            return
    }

    @Override // com.bykv.vk.openvk.component.video.api.j
    public void j(boolean r2, long r3, boolean r5) {
            r1 = this;
            boolean r0 = r1.az()
            if (r0 == 0) goto L7
            goto L56
        L7:
            r1.v()
            r1.h = r5
            r0 = 0
            r1.gx = r0
            r1.j(r5)
            if (r2 == 0) goto L1a
            r1.jy = r3
            r1.x()
            goto L1d
        L1a:
            r1.xt(r3)
        L1d:
            com.bytedance.sdk.component.utils.l r2 = r1.ws
            if (r2 == 0) goto L32
            com.bytedance.sdk.component.utils.l r2 = r1.ws
            java.lang.Runnable r3 = r1.ed
            r2.removeCallbacks(r3)
            com.bytedance.sdk.component.utils.l r2 = r1.ws
            java.lang.Runnable r3 = r1.ed
            int r4 = r1.la
            long r4 = (long) r4
            r2.postDelayed(r3, r4)
        L32:
            java.util.concurrent.atomic.AtomicBoolean r2 = r1.gq
            r3 = 1
            r2.set(r3)
            java.util.concurrent.atomic.AtomicBoolean r2 = r1.rn
            boolean r2 = r2.get()
            if (r2 != 0) goto L48
            java.util.concurrent.atomic.AtomicBoolean r2 = r1.wq
            boolean r2 = r2.get()
            if (r2 == 0) goto L56
        L48:
            com.bytedance.sdk.component.utils.l r2 = r1.ws
            if (r2 == 0) goto L56
            com.bytedance.sdk.component.utils.l r2 = r1.ws
            com.bykv.vk.openvk.component.video.j.r.r$14 r3 = new com.bykv.vk.openvk.component.video.j.r.r$14
            r3.<init>(r1)
            r2.post(r3)
        L56:
            return
    }

    @Override // com.bykv.vk.openvk.component.video.j.r.cw.InterfaceC0176cw
    public boolean j(com.bykv.vk.openvk.component.video.j.r.cw r3, int r4, int r5) {
            r2 = this;
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "what="
            r3.<init>(r0)
            r3.append(r4)
            java.lang.String r0 = "extra="
            r3.append(r0)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "CSJ_VIDEO_MEDIA"
            com.bykv.vk.openvk.component.video.api.m.cw.cw(r0, r3)
            r2.a()
            r3 = 200(0xc8, float:2.8E-43)
            r2.vl = r3
            com.bytedance.sdk.component.utils.l r3 = r2.ws
            if (r3 == 0) goto L2d
            com.bytedance.sdk.component.utils.l r3 = r2.ws
            java.lang.Runnable r0 = r2.ed
            r3.removeCallbacks(r0)
        L2d:
            boolean r3 = r2.j(r4, r5)
            if (r3 == 0) goto L36
            r2.s()
        L36:
            java.util.concurrent.atomic.AtomicBoolean r3 = r2.gq
            boolean r3 = r3.get()
            r0 = 1
            if (r3 != 0) goto L40
            return r0
        L40:
            java.util.concurrent.atomic.AtomicBoolean r3 = r2.gq
            r1 = 0
            r3.set(r1)
            com.bykv.vk.openvk.component.video.api.cw.xt r3 = new com.bykv.vk.openvk.component.video.api.cw.xt
            r3.<init>(r4, r5)
            java.util.List<java.lang.ref.WeakReference<com.bykv.vk.openvk.component.video.api.j$j>> r4 = r2.f1698l
            java.util.Iterator r4 = r4.iterator()
        L51:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L6f
            java.lang.Object r5 = r4.next()
            java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5
            if (r5 == 0) goto L51
            java.lang.Object r1 = r5.get()
            if (r1 == 0) goto L51
            java.lang.Object r5 = r5.get()
            com.bykv.vk.openvk.component.video.api.j$j r5 = (com.bykv.vk.openvk.component.video.api.j.InterfaceC0173j) r5
            r5.j(r2, r3)
            goto L51
        L6f:
            return r0
    }

    @Override // com.bykv.vk.openvk.component.video.api.j
    public boolean jy() {
            r2 = this;
            int r0 = r2.vl
            r1 = 206(0xce, float:2.89E-43)
            if (r0 == r1) goto L14
            com.bytedance.sdk.component.utils.l r0 = r2.ws
            if (r0 == 0) goto L1a
            com.bytedance.sdk.component.utils.l r0 = r2.ws
            r1 = 100
            boolean r0 = r0.hasMessages(r1)
            if (r0 == 0) goto L1a
        L14:
            boolean r0 = r2.gx
            if (r0 != 0) goto L1a
            r0 = 1
            return r0
        L1a:
            r0 = 0
            return r0
    }

    public int kt() {
            r1 = this;
            boolean r0 = r1.az()
            if (r0 == 0) goto L9
            r0 = 203(0xcb, float:2.84E-43)
            return r0
        L9:
            int r0 = r1.vl
            return r0
    }

    @Override // com.bykv.vk.openvk.component.video.api.j
    public boolean m() {
            r1 = this;
            boolean r0 = r1.f1699m
            return r0
    }

    @Override // com.bykv.vk.openvk.component.video.api.j
    public long mi() {
            r4 = this;
            boolean r0 = r4.az()
            r1 = 0
            if (r0 == 0) goto L9
            return r1
        L9:
            int r0 = r4.vl
            r3 = 206(0xce, float:2.89E-43)
            if (r0 == r3) goto L15
            int r0 = r4.vl
            r3 = 207(0xcf, float:2.9E-43)
            if (r0 != r3) goto L1c
        L15:
            com.bykv.vk.openvk.component.video.j.r.cw r0 = r4.ae     // Catch: java.lang.Throwable -> L1c
            long r0 = r0.g()     // Catch: java.lang.Throwable -> L1c
            return r0
        L1c:
            return r1
    }

    @Override // com.bykv.vk.openvk.component.video.api.j
    public boolean oq() {
            r1 = this;
            boolean r0 = r1.tj()
            if (r0 != 0) goto L15
            boolean r0 = r1.jy()
            if (r0 != 0) goto L15
            boolean r0 = r1.ws()
            if (r0 == 0) goto L13
            goto L15
        L13:
            r0 = 0
            return r0
        L15:
            r0 = 1
            return r0
    }

    @Override // com.bykv.vk.openvk.component.video.api.j
    public int qv() {
            r1 = this;
            com.bykv.vk.openvk.component.video.j.r.cw r0 = r1.ae
            if (r0 == 0) goto L11
            boolean r0 = r1.az()
            if (r0 != 0) goto L11
            com.bykv.vk.openvk.component.video.j.r.cw r0 = r1.ae
            int r0 = r0.jy()
            return r0
        L11:
            r0 = 0
            return r0
    }

    @Override // com.bykv.vk.openvk.component.video.api.j
    public void r() {
            r1 = this;
            boolean r0 = r1.az()
            if (r0 == 0) goto L7
            return
        L7:
            com.bykv.vk.openvk.component.video.j.r.r$3 r0 = new com.bykv.vk.openvk.component.video.j.r.r$3
            r0.<init>(r1)
            r1.xt(r0)
            return
    }

    public boolean tj() {
            r2 = this;
            int r0 = r2.vl
            r1 = 205(0xcd, float:2.87E-43)
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // com.bykv.vk.openvk.component.video.api.j
    public android.graphics.SurfaceTexture tl() {
            r1 = this;
            android.graphics.SurfaceTexture r0 = r1.xt
            return r0
    }

    @Override // com.bykv.vk.openvk.component.video.api.j
    public void up() {
            r2 = this;
            boolean r0 = r2.az()
            if (r0 == 0) goto L7
            goto L29
        L7:
            r0 = 1
            r2.qv = r0
            r2.gq()
            com.bytedance.sdk.component.utils.l r0 = r2.ws
            if (r0 == 0) goto L29
            com.bytedance.sdk.component.utils.l r0 = r2.ws     // Catch: java.lang.Throwable -> L26
            r1 = 0
            r0.removeCallbacksAndMessages(r1)     // Catch: java.lang.Throwable -> L26
            com.bykv.vk.openvk.component.video.j.r.cw r0 = r2.ae     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L22
            com.bytedance.sdk.component.utils.l r0 = r2.ws     // Catch: java.lang.Throwable -> L26
            r1 = 103(0x67, float:1.44E-43)
            r0.sendEmptyMessage(r1)     // Catch: java.lang.Throwable -> L26
        L22:
            r2.s()
            return
        L26:
            r2.s()
        L29:
            return
    }

    @Override // com.bykv.vk.openvk.component.video.api.j
    public int vl() {
            r1 = this;
            com.bykv.vk.openvk.component.video.j.r.cw r0 = r1.ae
            if (r0 == 0) goto L11
            boolean r0 = r1.az()
            if (r0 != 0) goto L11
            com.bykv.vk.openvk.component.video.j.r.cw r0 = r1.ae
            int r0 = r0.ws()
            return r0
        L11:
            r0 = 0
            return r0
    }

    @Override // com.bykv.vk.openvk.component.video.api.j
    public long w() {
            r5 = this;
            long r0 = r5.kt
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L9
            return r0
        L9:
            int r0 = r5.vl
            r1 = 206(0xce, float:2.89E-43)
            if (r0 == r1) goto L15
            int r0 = r5.vl
            r1 = 207(0xcf, float:2.9E-43)
            if (r0 != r1) goto L1d
        L15:
            com.bykv.vk.openvk.component.video.j.r.cw r0 = r5.ae     // Catch: java.lang.Throwable -> L1d
            long r0 = r0.oq()     // Catch: java.lang.Throwable -> L1d
            r5.kt = r0     // Catch: java.lang.Throwable -> L1d
        L1d:
            long r0 = r5.kt
            return r0
    }

    @Override // com.bykv.vk.openvk.component.video.api.j
    public boolean ws() {
            r2 = this;
            int r0 = r2.vl
            r1 = 207(0xcf, float:2.9E-43)
            if (r0 == r1) goto La
            boolean r0 = r2.gx
            if (r0 == 0) goto L1a
        La:
            com.bytedance.sdk.component.utils.l r0 = r2.ws
            if (r0 == 0) goto L1a
            com.bytedance.sdk.component.utils.l r0 = r2.ws
            r1 = 100
            boolean r0 = r0.hasMessages(r1)
            if (r0 != 0) goto L1a
            r0 = 1
            return r0
        L1a:
            r0 = 0
            return r0
    }

    @Override // com.bykv.vk.openvk.component.video.api.j
    public void xt() {
            r2 = this;
            boolean r0 = r2.az()
            if (r0 == 0) goto L7
            goto L1b
        L7:
            com.bytedance.sdk.component.utils.l r0 = r2.ws
            if (r0 == 0) goto L1b
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.gq
            r1 = 1
            r0.set(r1)
            com.bytedance.sdk.component.utils.l r0 = r2.ws
            com.bykv.vk.openvk.component.video.j.r.r$15 r1 = new com.bykv.vk.openvk.component.video.j.r.r$15
            r1.<init>(r2)
            r0.post(r1)
        L1b:
            return
    }

    @Override // com.bykv.vk.openvk.component.video.api.j
    public void xt(int r2) {
            r1 = this;
            boolean r0 = r1.az()
            if (r0 == 0) goto L7
            return
        L7:
            r1.la = r2
            return
    }

    @Override // com.bykv.vk.openvk.component.video.j.r.cw.up
    public void xt(com.bykv.vk.openvk.component.video.j.r.cw r5) {
            r4 = this;
            boolean r5 = r4.az()
            if (r5 == 0) goto L8
            goto L9f
        L8:
            r5 = 205(0xcd, float:2.87E-43)
            r4.vl = r5
            com.bykv.vk.openvk.component.video.api.cw.r r5 = r4.f1701p     // Catch: java.lang.Throwable -> L27
            if (r5 == 0) goto L28
            float r5 = r5.az()     // Catch: java.lang.Throwable -> L27
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L28
            com.bykv.vk.openvk.component.video.api.xt r0 = new com.bykv.vk.openvk.component.video.api.xt     // Catch: java.lang.Throwable -> L27
            r0.<init>()     // Catch: java.lang.Throwable -> L27
            r0.j(r5)     // Catch: java.lang.Throwable -> L27
            com.bykv.vk.openvk.component.video.j.r.cw r5 = r4.ae     // Catch: java.lang.Throwable -> L27
            r5.j(r0)     // Catch: java.lang.Throwable -> L27
            goto L28
        L27:
        L28:
            com.bytedance.sdk.component.utils.l r5 = r4.ws
            java.lang.String r0 = "CSJ_VIDEO_MEDIA"
            if (r5 == 0) goto L49
            boolean r5 = r4.gx
            if (r5 == 0) goto L36
            r4.p()
            goto L49
        L36:
            java.lang.String r5 = "onPrepared op_Start"
            com.bykv.vk.openvk.component.video.api.m.cw.cw(r0, r5)
            com.bytedance.sdk.component.utils.l r5 = r4.ws
            com.bytedance.sdk.component.utils.l r1 = r4.ws
            r2 = 100
            r3 = -1
            android.os.Message r1 = r1.obtainMessage(r2, r3, r3)
            r5.sendMessage(r1)
        L49:
            android.util.SparseIntArray r5 = com.bykv.vk.openvk.component.video.j.r.r.f1697s
            int r1 = r4.f1705x
            r5.delete(r1)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r1 = "onPrepared:"
            r5.<init>(r1)
            boolean r1 = r4.rh
            r5.append(r1)
            java.lang.String r1 = " "
            r5.append(r1)
            boolean r1 = r4.f
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            com.bykv.vk.openvk.component.video.api.m.cw.cw(r0, r5)
            boolean r5 = r4.rh
            if (r5 != 0) goto L7b
            boolean r5 = r4.f
            if (r5 != 0) goto L7b
            r4.l()
            r5 = 1
            r4.f = r5
        L7b:
            java.util.List<java.lang.ref.WeakReference<com.bykv.vk.openvk.component.video.api.j$j>> r5 = r4.f1698l
            java.util.Iterator r5 = r5.iterator()
        L81:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L9f
            java.lang.Object r0 = r5.next()
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            if (r0 == 0) goto L81
            java.lang.Object r1 = r0.get()
            if (r1 == 0) goto L81
            java.lang.Object r0 = r0.get()
            com.bykv.vk.openvk.component.video.api.j$j r0 = (com.bykv.vk.openvk.component.video.api.j.InterfaceC0173j) r0
            r0.xt(r4)
            goto L81
        L9f:
            return
    }

    @Override // com.bykv.vk.openvk.component.video.api.j
    public void xt(boolean r3) {
            r2 = this;
            boolean r0 = r2.az()
            if (r0 == 0) goto L7
            goto L21
        L7:
            r2.a = r3
            com.bykv.vk.openvk.component.video.j.r.cw r0 = r2.ae
            if (r0 == 0) goto L13
            com.bykv.vk.openvk.component.video.j.r.cw r0 = r2.ae
            r0.j(r3)
            return
        L13:
            com.bytedance.sdk.component.utils.l r0 = r2.ws
            if (r0 == 0) goto L21
            com.bytedance.sdk.component.utils.l r0 = r2.ws
            com.bykv.vk.openvk.component.video.j.r.r$11 r1 = new com.bykv.vk.openvk.component.video.j.r.r$11
            r1.<init>(r2, r3)
            r0.post(r1)
        L21:
            return
    }

    @Override // com.bykv.vk.openvk.component.video.j.r.cw.r
    public boolean xt(com.bykv.vk.openvk.component.video.j.r.cw r5, int r6, int r7) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "what,extra:"
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r1 = ","
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "CSJ_VIDEO_MEDIA"
            com.bykv.vk.openvk.component.video.api.m.cw.cw(r1, r0)
            com.bykv.vk.openvk.component.video.j.r.cw r0 = r4.ae
            r1 = 0
            if (r0 == r5) goto L21
            return r1
        L21:
            r5 = -1004(0xfffffffffffffc14, float:NaN)
            if (r7 != r5) goto L4e
            com.bykv.vk.openvk.component.video.api.cw.xt r5 = new com.bykv.vk.openvk.component.video.api.cw.xt
            r5.<init>(r6, r7)
            java.util.List<java.lang.ref.WeakReference<com.bykv.vk.openvk.component.video.api.j$j>> r0 = r4.f1698l
            java.util.Iterator r0 = r0.iterator()
        L30:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L4e
            java.lang.Object r2 = r0.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            if (r2 == 0) goto L30
            java.lang.Object r3 = r2.get()
            if (r3 == 0) goto L30
            java.lang.Object r2 = r2.get()
            com.bykv.vk.openvk.component.video.api.j$j r2 = (com.bykv.vk.openvk.component.video.api.j.InterfaceC0173j) r2
            r2.j(r4, r5)
            goto L30
        L4e:
            r4.xt(r6, r7)
            return r1
    }
}
