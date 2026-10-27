package master.flame.danmaku.ui.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"NewApi"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class DanmakuTextureView extends android.view.TextureView implements master.flame.danmaku.controller.f, master.flame.danmaku.controller.g, android.view.TextureView.SurfaceTextureListener {
    public static final java.lang.String n = "DanmakuTextureView";
    private static final int o = 50;
    private static final int p = 1000;
    private master.flame.danmaku.controller.c.d a;
    private android.os.HandlerThread b;
    private master.flame.danmaku.controller.c c;
    private boolean d;
    private boolean e;
    private master.flame.danmaku.controller.f.a f;
    private float g;
    private float h;
    private master.flame.danmaku.ui.widget.a i;
    private boolean j;
    private boolean k;
    protected int l;
    private java.util.LinkedList<java.lang.Long> m;

    public DanmakuTextureView(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1
            r0.e = r1
            r0.k = r1
            r1 = 0
            r0.l = r1
            r0.r()
            return
    }

    public DanmakuTextureView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 1
            r0.e = r1
            r0.k = r1
            r1 = 0
            r0.l = r1
            r0.r()
            return
    }

    public DanmakuTextureView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 1
            r0.e = r1
            r0.k = r1
            r1 = 0
            r0.l = r1
            r0.r()
            return
    }

    private float p() {
            r6 = this;
            long r0 = v4.c.b()
            java.util.LinkedList<java.lang.Long> r2 = r6.m
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            r2.addLast(r3)
            java.util.LinkedList<java.lang.Long> r2 = r6.m
            java.lang.Object r2 = r2.peekFirst()
            java.lang.Long r2 = (java.lang.Long) r2
            r3 = 0
            if (r2 != 0) goto L19
            return r3
        L19:
            long r4 = r2.longValue()
            long r0 = r0 - r4
            float r0 = (float) r0
            java.util.LinkedList<java.lang.Long> r1 = r6.m
            int r1 = r1.size()
            r2 = 50
            if (r1 <= r2) goto L2e
            java.util.LinkedList<java.lang.Long> r1 = r6.m
            r1.removeFirst()
        L2e:
            int r1 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r1 <= 0) goto L3d
            java.util.LinkedList<java.lang.Long> r1 = r6.m
            int r1 = r1.size()
            int r1 = r1 * 1000
            float r1 = (float) r1
            float r1 = r1 / r0
            return r1
        L3d:
            return r3
    }

    @android.annotation.TargetApi(11)
    private void r() {
            r2 = this;
            r0 = 2
            r1 = 0
            r2.setLayerType(r0, r1)
            r0 = 0
            r2.setOpaque(r0)
            r1 = 1
            r2.setWillNotCacheDrawing(r1)
            r2.setDrawingCacheEnabled(r0)
            r2.setWillNotDraw(r1)
            r2.setSurfaceTextureListener(r2)
            master.flame.danmaku.controller.d.f(r1, r1)
            master.flame.danmaku.ui.widget.a r0 = master.flame.danmaku.ui.widget.a.j(r2)
            r2.i = r0
            return
    }

    private void s() {
            r3 = this;
            master.flame.danmaku.controller.c r0 = r3.c
            if (r0 != 0) goto L13
            master.flame.danmaku.controller.c r0 = new master.flame.danmaku.controller.c
            int r1 = r3.l
            android.os.Looper r1 = r3.q(r1)
            boolean r2 = r3.k
            r0.<init>(r1, r3, r2)
            r3.c = r0
        L13:
            return
    }

    private synchronized void u() {
            r2 = this;
            monitor-enter(r2)
            master.flame.danmaku.controller.c r0 = r2.c     // Catch: java.lang.Throwable -> Lc
            r1 = 0
            if (r0 == 0) goto Le
            r0.O()     // Catch: java.lang.Throwable -> Lc
            r2.c = r1     // Catch: java.lang.Throwable -> Lc
            goto Le
        Lc:
            r0 = move-exception
            goto L1c
        Le:
            android.os.HandlerThread r0 = r2.b     // Catch: java.lang.Throwable -> Lc
            r2.b = r1     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto L1a
            r0.join()     // Catch: java.lang.Throwable -> Lc java.lang.InterruptedException -> L17
        L17:
            r0.quit()     // Catch: java.lang.Throwable -> Lc
        L1a:
            monitor-exit(r2)
            return
        L1c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r0
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
    public synchronized void clear() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.l()     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L9
            monitor-exit(r1)
            return
        L9:
            android.graphics.Canvas r0 = r1.lockCanvas()     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L18
            master.flame.danmaku.controller.d.a(r0)     // Catch: java.lang.Throwable -> L16
            r1.unlockCanvasAndPost(r0)     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r0 = move-exception
            goto L1a
        L18:
            monitor-exit(r1)
            return
        L1a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            throw r0
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
            r0.j = r1
            return
    }

    @Override // master.flame.danmaku.controller.f
    public void g(master.flame.danmaku.danmaku.parser.a r2, master.flame.danmaku.danmaku.model.android.DanmakuContext r3) {
            r1 = this;
            r1.s()
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
            r2.k = r0
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
            r2.k = r0
            master.flame.danmaku.controller.c r1 = r2.c
            if (r1 != 0) goto L8
            return
        L8:
            r1.E(r0)
            return
    }

    @Override // master.flame.danmaku.controller.g
    public synchronized long i() {
            r11 = this;
            monitor-enter(r11)
            boolean r0 = r11.d     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L9
            monitor-exit(r11)
            r0 = 0
            return r0
        L9:
            long r0 = v4.c.b()     // Catch: java.lang.Throwable -> L35
            boolean r2 = r11.isShown()     // Catch: java.lang.Throwable -> L35
            if (r2 != 0) goto L17
            monitor-exit(r11)
            r0 = -1
            return r0
        L17:
            android.graphics.Canvas r2 = r11.lockCanvas()     // Catch: java.lang.Throwable -> L35
            if (r2 == 0) goto L7c
            master.flame.danmaku.controller.c r3 = r11.c     // Catch: java.lang.Throwable -> L35
            if (r3 == 0) goto L75
            u4.a$c r3 = r3.x(r2)     // Catch: java.lang.Throwable -> L35
            boolean r4 = r11.j     // Catch: java.lang.Throwable -> L35
            if (r4 == 0) goto L75
            java.util.LinkedList<java.lang.Long> r4 = r11.m     // Catch: java.lang.Throwable -> L35
            if (r4 != 0) goto L37
            java.util.LinkedList r4 = new java.util.LinkedList     // Catch: java.lang.Throwable -> L35
            r4.<init>()     // Catch: java.lang.Throwable -> L35
            r11.m = r4     // Catch: java.lang.Throwable -> L35
            goto L37
        L35:
            r0 = move-exception
            goto L83
        L37:
            v4.c.b()     // Catch: java.lang.Throwable -> L35
            java.util.Locale r4 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L35
            java.lang.String r5 = "fps %.2f,time:%d s,cache:%d,miss:%d"
            float r6 = r11.p()     // Catch: java.lang.Throwable -> L35
            java.lang.Float r6 = java.lang.Float.valueOf(r6)     // Catch: java.lang.Throwable -> L35
            long r7 = r11.getCurrentTime()     // Catch: java.lang.Throwable -> L35
            r9 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 / r9
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L35
            long r8 = r3.r     // Catch: java.lang.Throwable -> L35
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> L35
            long r9 = r3.s     // Catch: java.lang.Throwable -> L35
            java.lang.Long r3 = java.lang.Long.valueOf(r9)     // Catch: java.lang.Throwable -> L35
            r9 = 4
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L35
            r10 = 0
            r9[r10] = r6     // Catch: java.lang.Throwable -> L35
            r6 = 1
            r9[r6] = r7     // Catch: java.lang.Throwable -> L35
            r6 = 2
            r9[r6] = r8     // Catch: java.lang.Throwable -> L35
            r6 = 3
            r9[r6] = r3     // Catch: java.lang.Throwable -> L35
            java.lang.String r3 = java.lang.String.format(r4, r5, r9)     // Catch: java.lang.Throwable -> L35
            master.flame.danmaku.controller.d.d(r2, r3)     // Catch: java.lang.Throwable -> L35
        L75:
            boolean r3 = r11.d     // Catch: java.lang.Throwable -> L35
            if (r3 == 0) goto L7c
            r11.unlockCanvasAndPost(r2)     // Catch: java.lang.Throwable -> L35
        L7c:
            long r2 = v4.c.b()     // Catch: java.lang.Throwable -> L35
            long r2 = r2 - r0
            monitor-exit(r11)
            return r2
        L83:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L35
            throw r0
    }

    @Override // android.view.View, master.flame.danmaku.controller.f, master.flame.danmaku.controller.g
    public boolean isHardwareAccelerated() {
            r1 = this;
            r0 = 0
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
            boolean r0 = r1.k
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
            r1.k = r0
            master.flame.danmaku.controller.c r0 = r1.c
            if (r0 != 0) goto L8
            return
        L8:
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

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture r1, int r2, int r3) {
            r0 = this;
            r1 = 1
            r0.d = r1
            return
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public synchronized boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture r1) {
            r0 = this;
            monitor-enter(r0)
            r1 = 0
            r0.d = r1     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            r1 = 1
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture r1, int r2, int r3) {
            r0 = this;
            master.flame.danmaku.controller.c r1 = r0.c
            if (r1 == 0) goto L7
            r1.J(r2, r3)
        L7:
            return
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture r1) {
            r0 = this;
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            master.flame.danmaku.ui.widget.a r0 = r1.i
            boolean r0 = r0.k(r2)
            if (r0 != 0) goto Ld
            boolean r2 = super.onTouchEvent(r2)
            return r2
        Ld:
            return r0
    }

    @Override // master.flame.danmaku.controller.f
    public void pause() {
            r1 = this;
            master.flame.danmaku.controller.c r0 = r1.c
            if (r0 == 0) goto L7
            r0.L()
        L7:
            return
    }

    protected synchronized android.os.Looper q(int r3) {
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

    @Override // master.flame.danmaku.controller.f
    public void release() {
            r1 = this;
            r1.stop()
            java.util.LinkedList<java.lang.Long> r0 = r1.m
            if (r0 == 0) goto La
            r0.clear()
        La:
            return
    }

    @Override // master.flame.danmaku.controller.f
    public void resume() {
            r1 = this;
            master.flame.danmaku.controller.c r0 = r1.c
            if (r0 == 0) goto L10
            boolean r0 = r0.H()
            if (r0 == 0) goto L10
            master.flame.danmaku.controller.c r0 = r1.c
            r0.U()
            return
        L10:
            master.flame.danmaku.controller.c r0 = r1.c
            if (r0 != 0) goto L17
            r1.t()
        L17:
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
            r0.l = r1
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
            r2.s()
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
            r0.u()
            return
    }

    public void t() {
            r0 = this;
            r0.stop()
            r0.start()
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
}
