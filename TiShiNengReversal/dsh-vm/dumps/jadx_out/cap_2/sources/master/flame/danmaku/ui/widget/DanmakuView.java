package master.flame.danmaku.ui.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class DanmakuView extends android.view.View implements master.flame.danmaku.controller.f, master.flame.danmaku.controller.g {
    public static final java.lang.String v = "DanmakuView";
    private static final int w = 50;
    private static final int x = 1000;
    private master.flame.danmaku.controller.c.d a;
    private android.os.HandlerThread b;
    private master.flame.danmaku.controller.c c;
    private boolean d;
    private boolean e;
    private master.flame.danmaku.controller.f.a f;
    private float g;
    private float h;
    private android.view.View.OnClickListener i;
    private master.flame.danmaku.ui.widget.a j;
    private boolean k;
    private boolean l;
    protected int m;
    private java.lang.Object n;
    private boolean o;
    private boolean p;
    private long q;
    private java.util.LinkedList<java.lang.Long> r;
    private boolean s;
    private int t;
    private java.lang.Runnable u;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements java.lang.Runnable {
        final /* synthetic */ master.flame.danmaku.ui.widget.DanmakuView a;

        a(master.flame.danmaku.ui.widget.DanmakuView r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                master.flame.danmaku.ui.widget.DanmakuView r0 = r3.a
                master.flame.danmaku.controller.c r0 = master.flame.danmaku.ui.widget.DanmakuView.p(r0)
                if (r0 != 0) goto L9
                return
            L9:
                master.flame.danmaku.ui.widget.DanmakuView r0 = r3.a
                master.flame.danmaku.ui.widget.DanmakuView.r(r0)
                master.flame.danmaku.ui.widget.DanmakuView r0 = r3.a
                int r0 = master.flame.danmaku.ui.widget.DanmakuView.q(r0)
                r1 = 4
                if (r0 > r1) goto L33
                master.flame.danmaku.ui.widget.DanmakuView r0 = r3.a
                boolean r0 = master.flame.danmaku.ui.widget.DanmakuView.s(r0)
                if (r0 == 0) goto L20
                goto L33
            L20:
                master.flame.danmaku.ui.widget.DanmakuView r0 = r3.a
                master.flame.danmaku.controller.c r0 = master.flame.danmaku.ui.widget.DanmakuView.p(r0)
                master.flame.danmaku.ui.widget.DanmakuView r1 = r3.a
                int r1 = master.flame.danmaku.ui.widget.DanmakuView.q(r1)
                int r1 = r1 * 100
                long r1 = (long) r1
                r0.postDelayed(r3, r1)
                return
            L33:
                master.flame.danmaku.ui.widget.DanmakuView r0 = r3.a
                master.flame.danmaku.controller.c r0 = master.flame.danmaku.ui.widget.DanmakuView.p(r0)
                r0.U()
                return
        }
    }

    public DanmakuView(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r2 = 1
            r1.e = r2
            r1.l = r2
            r2 = 0
            r1.m = r2
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.n = r0
            r1.o = r2
            r1.p = r2
            r1.t = r2
            master.flame.danmaku.ui.widget.DanmakuView$a r2 = new master.flame.danmaku.ui.widget.DanmakuView$a
            r2.<init>(r1)
            r1.u = r2
            r1.v()
            return
    }

    public DanmakuView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 1
            r0.e = r1
            r0.l = r1
            r1 = 0
            r0.m = r1
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r0.n = r2
            r0.o = r1
            r0.p = r1
            r0.t = r1
            master.flame.danmaku.ui.widget.DanmakuView$a r1 = new master.flame.danmaku.ui.widget.DanmakuView$a
            r1.<init>(r0)
            r0.u = r1
            r0.v()
            return
    }

    public DanmakuView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 1
            r0.e = r1
            r0.l = r1
            r1 = 0
            r0.m = r1
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r0.n = r2
            r0.o = r1
            r0.p = r1
            r0.t = r1
            master.flame.danmaku.ui.widget.DanmakuView$a r1 = new master.flame.danmaku.ui.widget.DanmakuView$a
            r1.<init>(r0)
            r0.u = r1
            r0.v()
            return
    }

    private synchronized void B() {
            r2 = this;
            monitor-enter(r2)
            master.flame.danmaku.controller.c r0 = r2.c     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L7
            monitor-exit(r2)
            return
        L7:
            r1 = 0
            r2.c = r1     // Catch: java.lang.Throwable -> L13
            r2.C()     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L15
            r0.O()     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r0 = move-exception
            goto L23
        L15:
            android.os.HandlerThread r0 = r2.b     // Catch: java.lang.Throwable -> L13
            r2.b = r1     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L21
            r0.join()     // Catch: java.lang.Throwable -> L13 java.lang.InterruptedException -> L1e
        L1e:
            r0.quit()     // Catch: java.lang.Throwable -> L13
        L21:
            monitor-exit(r2)
            return
        L23:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L13
            throw r0
    }

    private void C() {
            r2 = this;
            java.lang.Object r0 = r2.n
            monitor-enter(r0)
            r1 = 1
            r2.o = r1     // Catch: java.lang.Throwable -> Ld
            java.lang.Object r1 = r2.n     // Catch: java.lang.Throwable -> Ld
            r1.notifyAll()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    static /* synthetic */ master.flame.danmaku.controller.c p(master.flame.danmaku.ui.widget.DanmakuView r0) {
            master.flame.danmaku.controller.c r0 = r0.c
            return r0
    }

    static /* synthetic */ int q(master.flame.danmaku.ui.widget.DanmakuView r0) {
            int r0 = r0.t
            return r0
    }

    static /* synthetic */ int r(master.flame.danmaku.ui.widget.DanmakuView r2) {
            int r0 = r2.t
            int r1 = r0 + 1
            r2.t = r1
            return r0
    }

    static /* synthetic */ boolean s(master.flame.danmaku.ui.widget.DanmakuView r0) {
            boolean r0 = super.isShown()
            return r0
    }

    private float t() {
            r6 = this;
            long r0 = v4.c.b()
            java.util.LinkedList<java.lang.Long> r2 = r6.r
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            r2.addLast(r3)
            java.util.LinkedList<java.lang.Long> r2 = r6.r
            java.lang.Object r2 = r2.peekFirst()
            java.lang.Long r2 = (java.lang.Long) r2
            r3 = 0
            if (r2 != 0) goto L19
            return r3
        L19:
            long r4 = r2.longValue()
            long r0 = r0 - r4
            float r0 = (float) r0
            java.util.LinkedList<java.lang.Long> r1 = r6.r
            int r1 = r1.size()
            r2 = 50
            if (r1 <= r2) goto L2e
            java.util.LinkedList<java.lang.Long> r1 = r6.r
            r1.removeFirst()
        L2e:
            int r1 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r1 <= 0) goto L3d
            java.util.LinkedList<java.lang.Long> r1 = r6.r
            int r1 = r1.size()
            int r1 = r1 * 1000
            float r1 = (float) r1
            float r1 = r1 / r0
            return r1
        L3d:
            return r3
    }

    private void v() {
            r2 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            long r0 = r0.getId()
            r2.q = r0
            r0 = 0
            r2.setBackgroundColor(r0)
            r2.setDrawingCacheBackgroundColor(r0)
            r1 = 1
            master.flame.danmaku.controller.d.f(r1, r0)
            master.flame.danmaku.ui.widget.a r0 = master.flame.danmaku.ui.widget.a.j(r2)
            r2.j = r0
            return
    }

    private void w() {
            r4 = this;
            boolean r0 = r4.l
            if (r0 != 0) goto L5
            goto L38
        L5:
            r4.y()
            java.lang.Object r0 = r4.n
            monitor-enter(r0)
        Lb:
            boolean r1 = r4.o     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L34
            master.flame.danmaku.controller.c r1 = r4.c     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L34
            java.lang.Object r1 = r4.n     // Catch: java.lang.Throwable -> L1b java.lang.InterruptedException -> L1d
            r2 = 200(0xc8, double:9.9E-322)
            r1.wait(r2)     // Catch: java.lang.Throwable -> L1b java.lang.InterruptedException -> L1d
            goto Lb
        L1b:
            r1 = move-exception
            goto L39
        L1d:
            boolean r1 = r4.l     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L34
            master.flame.danmaku.controller.c r1 = r4.c     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L34
            boolean r1 = r1.I()     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L2c
            goto L34
        L2c:
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L1b
            r1.interrupt()     // Catch: java.lang.Throwable -> L1b
            goto Lb
        L34:
            r1 = 0
            r4.o = r1     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
        L38:
            return
        L39:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r1
    }

    private void x() {
            r1 = this;
            r0 = 1
            r1.s = r0
            r1.w()
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    private void y() {
            r1 = this;
            r0 = 1
            r1.p = r0
            r1.postInvalidateOnAnimation()
            return
    }

    private void z() {
            r3 = this;
            master.flame.danmaku.controller.c r0 = r3.c
            if (r0 != 0) goto L13
            master.flame.danmaku.controller.c r0 = new master.flame.danmaku.controller.c
            int r1 = r3.m
            android.os.Looper r1 = r3.u(r1)
            boolean r2 = r3.l
            r0.<init>(r1, r3, r2)
            r3.c = r0
        L13:
            return
    }

    public void A() {
            r0 = this;
            r0.stop()
            r0.start()
            return
    }

    @Override // master.flame.danmaku.controller.f
    public void a(master.flame.danmaku.danmaku.model.d r2) {
            r1 = this;
            master.flame.danmaku.controller.c r0 = r1.c
            if (r0 == 0) goto L7
            r0.t(r2)
        L7:
            return
    }

    @Override // master.flame.danmaku.controller.f
    public void b(master.flame.danmaku.danmaku.model.d r2, boolean r3) {
            r1 = this;
            master.flame.danmaku.controller.c r0 = r1.c
            if (r0 == 0) goto L7
            r0.G(r2, r3)
        L7:
            return
    }

    @Override // master.flame.danmaku.controller.f
    public void c(boolean r2) {
            r1 = this;
            master.flame.danmaku.controller.c r0 = r1.c
            if (r0 == 0) goto L7
            r0.S(r2)
        L7:
            return
    }

    @Override // master.flame.danmaku.controller.g
    public void clear() {
            r5 = this;
            boolean r0 = r5.l()
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r5.l
            if (r0 == 0) goto L1e
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            long r0 = r0.getId()
            long r2 = r5.q
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L1a
            goto L1e
        L1a:
            r5.x()
            return
        L1e:
            r0 = 1
            r5.s = r0
            r5.y()
            return
    }

    @Override // master.flame.danmaku.controller.f, master.flame.danmaku.controller.g
    public boolean d() {
            r1 = this;
            boolean r0 = r1.e
            return r0
    }

    @Override // master.flame.danmaku.controller.f
    public void e() {
            r1 = this;
            master.flame.danmaku.controller.c r0 = r1.c
            if (r0 == 0) goto L7
            r0.T()
        L7:
            return
    }

    @Override // master.flame.danmaku.controller.f
    public void f(boolean r1) {
            r0 = this;
            r0.k = r1
            return
    }

    @Override // master.flame.danmaku.controller.f
    public void g(master.flame.danmaku.danmaku.parser.a r2, master.flame.danmaku.danmaku.model.android.DanmakuContext r3) {
            r1 = this;
            r1.z()
            master.flame.danmaku.controller.c r0 = r1.c
            r0.X(r3)
            master.flame.danmaku.controller.c r3 = r1.c
            r3.Y(r2)
            master.flame.danmaku.controller.c r2 = r1.c
            master.flame.danmaku.controller.c$d r3 = r1.a
            r2.W(r3)
            master.flame.danmaku.controller.c r2 = r1.c
            r2.M()
            return
    }

    @Override // master.flame.danmaku.controller.f
    public master.flame.danmaku.danmaku.model.android.DanmakuContext getConfig() {
            r1 = this;
            master.flame.danmaku.controller.c r0 = r1.c
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            master.flame.danmaku.danmaku.model.android.DanmakuContext r0 = r0.z()
            return r0
    }

    @Override // master.flame.danmaku.controller.f
    public long getCurrentTime() {
            r2 = this;
            master.flame.danmaku.controller.c r0 = r2.c
            if (r0 == 0) goto L9
            long r0 = r0.A()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // master.flame.danmaku.controller.f
    public master.flame.danmaku.danmaku.model.m getCurrentVisibleDanmakus() {
            r1 = this;
            master.flame.danmaku.controller.c r0 = r1.c
            if (r0 == 0) goto L9
            master.flame.danmaku.danmaku.model.m r0 = r0.B()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // master.flame.danmaku.controller.f
    public master.flame.danmaku.controller.f.a getOnDanmakuClickListener() {
            r1 = this;
            master.flame.danmaku.controller.f$a r0 = r1.f
            return r0
    }

    @Override // master.flame.danmaku.controller.f
    public android.view.View getView() {
            r0 = this;
            return r0
    }

    @Override // master.flame.danmaku.controller.f
    public float getXOff() {
            r1 = this;
            float r0 = r1.g
            return r0
    }

    @Override // master.flame.danmaku.controller.f
    public float getYOff() {
            r1 = this;
            float r0 = r1.h
            return r0
    }

    @Override // master.flame.danmaku.controller.f
    public long h() {
            r2 = this;
            r0 = 0
            r2.l = r0
            master.flame.danmaku.controller.c r0 = r2.c
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            r1 = 1
            long r0 = r0.E(r1)
            return r0
    }

    @Override // master.flame.danmaku.controller.f
    public void hide() {
            r2 = this;
            r0 = 0
            r2.l = r0
            master.flame.danmaku.controller.c r1 = r2.c
            if (r1 != 0) goto L8
            return
        L8:
            r1.E(r0)
            return
    }

    @Override // master.flame.danmaku.controller.g
    public long i() {
            r4 = this;
            boolean r0 = r4.d
            if (r0 != 0) goto L7
            r0 = 0
            return r0
        L7:
            boolean r0 = r4.isShown()
            if (r0 != 0) goto L10
            r0 = -1
            return r0
        L10:
            long r0 = v4.c.b()
            r4.w()
            long r2 = v4.c.b()
            long r2 = r2 - r0
            return r2
    }

    @Override // android.view.View, master.flame.danmaku.controller.f, master.flame.danmaku.controller.g
    @android.annotation.SuppressLint({"NewApi"})
    public boolean isHardwareAccelerated() {
            r1 = this;
            boolean r0 = super.isHardwareAccelerated()
            return r0
    }

    @Override // master.flame.danmaku.controller.f
    public boolean isPaused() {
            r1 = this;
            master.flame.danmaku.controller.c r0 = r1.c
            if (r0 == 0) goto L9
            boolean r0 = r0.I()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // master.flame.danmaku.controller.f
    public boolean isPrepared() {
            r1 = this;
            master.flame.danmaku.controller.c r0 = r1.c
            if (r0 == 0) goto Lc
            boolean r0 = r0.H()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @Override // android.view.View, master.flame.danmaku.controller.f
    public boolean isShown() {
            r1 = this;
            boolean r0 = r1.l
            if (r0 == 0) goto Lc
            boolean r0 = super.isShown()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @Override // master.flame.danmaku.controller.f
    public void j(java.lang.Long r2) {
            r1 = this;
            r0 = 1
            r1.l = r0
            r0 = 0
            r1.s = r0
            master.flame.danmaku.controller.c r0 = r1.c
            if (r0 != 0) goto Lb
            return
        Lb:
            r0.Z(r2)
            return
    }

    @Override // master.flame.danmaku.controller.f
    public void k() {
            r1 = this;
            master.flame.danmaku.controller.c r0 = r1.c
            if (r0 == 0) goto L7
            r0.v()
        L7:
            return
    }

    @Override // master.flame.danmaku.controller.g
    public boolean l() {
            r1 = this;
            boolean r0 = r1.d
            return r0
    }

    @Override // master.flame.danmaku.controller.f
    public void m(java.lang.Long r2) {
            r1 = this;
            master.flame.danmaku.controller.c r0 = r1.c
            if (r0 == 0) goto L7
            r0.V(r2)
        L7:
            return
    }

    @Override // master.flame.danmaku.controller.f
    public void n(master.flame.danmaku.controller.f.a r1, float r2, float r3) {
            r0 = this;
            r0.f = r1
            r0.g = r2
            r0.h = r3
            return
    }

    @Override // master.flame.danmaku.controller.f
    public void o(boolean r1) {
            r0 = this;
            r0.e = r1
            return
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r9) {
            r8 = this;
            boolean r0 = r8.l
            if (r0 != 0) goto Lc
            boolean r0 = r8.p
            if (r0 != 0) goto Lc
            super.onDraw(r9)
            return
        Lc:
            boolean r0 = r8.s
            r1 = 0
            if (r0 == 0) goto L17
            master.flame.danmaku.controller.d.a(r9)
            r8.s = r1
            goto L68
        L17:
            master.flame.danmaku.controller.c r0 = r8.c
            if (r0 == 0) goto L68
            u4.a$c r0 = r0.x(r9)
            boolean r2 = r8.k
            if (r2 == 0) goto L68
            java.util.LinkedList<java.lang.Long> r2 = r8.r
            if (r2 != 0) goto L2e
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            r8.r = r2
        L2e:
            java.util.Locale r2 = java.util.Locale.getDefault()
            float r3 = r8.t()
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            long r4 = r8.getCurrentTime()
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r6
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            long r5 = r0.r
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            long r6 = r0.s
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r1] = r3
            r3 = 1
            r6[r3] = r4
            r3 = 2
            r6[r3] = r5
            r3 = 3
            r6[r3] = r0
            java.lang.String r0 = "fps %.2f,time:%d s,cache:%d,miss:%d"
            java.lang.String r0 = java.lang.String.format(r2, r0, r6)
            master.flame.danmaku.controller.d.d(r9, r0)
        L68:
            r8.p = r1
            r8.C()
            return
    }

    @Override // android.view.View
    protected void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            super.onLayout(r2, r3, r4, r5, r6)
            r2 = r1
            master.flame.danmaku.controller.c r0 = r2.c
            if (r0 == 0) goto Ld
            int r5 = r5 - r3
            int r6 = r6 - r4
            r0.J(r5, r6)
        Ld:
            r3 = 1
            r2.d = r3
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            master.flame.danmaku.ui.widget.a r0 = r1.j
            boolean r0 = r0.k(r2)
            if (r0 != 0) goto Ld
            boolean r2 = super.onTouchEvent(r2)
            return r2
        Ld:
            return r0
    }

    @Override // master.flame.danmaku.controller.f
    public void pause() {
            r2 = this;
            master.flame.danmaku.controller.c r0 = r2.c
            if (r0 == 0) goto Le
            java.lang.Runnable r1 = r2.u
            r0.removeCallbacks(r1)
            master.flame.danmaku.controller.c r0 = r2.c
            r0.L()
        Le:
            return
    }

    @Override // master.flame.danmaku.controller.f
    public void release() {
            r1 = this;
            r1.stop()
            java.util.LinkedList<java.lang.Long> r0 = r1.r
            if (r0 == 0) goto La
            r0.clear()
        La:
            return
    }

    @Override // master.flame.danmaku.controller.f
    public void resume() {
            r2 = this;
            master.flame.danmaku.controller.c r0 = r2.c
            if (r0 == 0) goto L15
            boolean r0 = r0.H()
            if (r0 == 0) goto L15
            r0 = 0
            r2.t = r0
            master.flame.danmaku.controller.c r0 = r2.c
            java.lang.Runnable r1 = r2.u
            r0.post(r1)
            return
        L15:
            master.flame.danmaku.controller.c r0 = r2.c
            if (r0 != 0) goto L1c
            r2.A()
        L1c:
            return
    }

    @Override // master.flame.danmaku.controller.f
    public void setCallback(master.flame.danmaku.controller.c.d r2) {
            r1 = this;
            r1.a = r2
            master.flame.danmaku.controller.c r0 = r1.c
            if (r0 == 0) goto L9
            r0.W(r2)
        L9:
            return
    }

    @Override // master.flame.danmaku.controller.f
    public void setDrawingThreadType(int r1) {
            r0 = this;
            r0.m = r1
            return
    }

    @Override // master.flame.danmaku.controller.f
    public void setOnDanmakuClickListener(master.flame.danmaku.controller.f.a r1) {
            r0 = this;
            r0.f = r1
            return
    }

    @Override // master.flame.danmaku.controller.f
    public void show() {
            r1 = this;
            r0 = 0
            r1.j(r0)
            return
    }

    @Override // master.flame.danmaku.controller.f
    public void start() {
            r2 = this;
            r0 = 0
            r2.start(r0)
            return
    }

    @Override // master.flame.danmaku.controller.f
    public void start(long r3) {
            r2 = this;
            master.flame.danmaku.controller.c r0 = r2.c
            if (r0 != 0) goto L8
            r2.z()
            goto Lc
        L8:
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
        Lc:
            master.flame.danmaku.controller.c r0 = r2.c
            r1 = 1
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            android.os.Message r3 = r0.obtainMessage(r1, r3)
            r3.sendToTarget()
            return
    }

    @Override // master.flame.danmaku.controller.f
    public void stop() {
            r0 = this;
            r0.B()
            return
    }

    @Override // master.flame.danmaku.controller.f
    public void toggle() {
            r1 = this;
            boolean r0 = r1.d
            if (r0 == 0) goto L19
            master.flame.danmaku.controller.c r0 = r1.c
            if (r0 != 0) goto Lc
            r1.start()
            return
        Lc:
            boolean r0 = r0.I()
            if (r0 == 0) goto L16
            r1.resume()
            return
        L16:
            r1.pause()
        L19:
            return
    }

    protected synchronized android.os.Looper u(int r3) {
            r2 = this;
            monitor-enter(r2)
            android.os.HandlerThread r0 = r2.b     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto Le
            r0.quit()     // Catch: java.lang.Throwable -> Lc
            r0 = 0
            r2.b = r0     // Catch: java.lang.Throwable -> Lc
            goto Le
        Lc:
            r3 = move-exception
            goto L46
        Le:
            r0 = 1
            if (r3 == r0) goto L40
            r0 = 2
            if (r3 == r0) goto L1c
            r0 = 3
            if (r3 == r0) goto L19
            r3 = 0
            goto L1d
        L19:
            r3 = 19
            goto L1d
        L1c:
            r3 = -8
        L1d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc
            r0.<init>()     // Catch: java.lang.Throwable -> Lc
            java.lang.String r1 = "DFM Handler Thread #"
            r0.append(r1)     // Catch: java.lang.Throwable -> Lc
            r0.append(r3)     // Catch: java.lang.Throwable -> Lc
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lc
            android.os.HandlerThread r1 = new android.os.HandlerThread     // Catch: java.lang.Throwable -> Lc
            r1.<init>(r0, r3)     // Catch: java.lang.Throwable -> Lc
            r2.b = r1     // Catch: java.lang.Throwable -> Lc
            r1.start()     // Catch: java.lang.Throwable -> Lc
            android.os.HandlerThread r3 = r2.b     // Catch: java.lang.Throwable -> Lc
            android.os.Looper r3 = r3.getLooper()     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return r3
        L40:
            android.os.Looper r3 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return r3
        L46:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r3
    }
}
