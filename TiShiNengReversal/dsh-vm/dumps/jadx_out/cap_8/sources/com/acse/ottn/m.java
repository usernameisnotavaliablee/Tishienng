package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class m extends android.view.animation.Animation {
    public static final boolean q = false;
    public static final java.util.WeakHashMap<android.view.View, com.acse.ottn.m> r = null;
    public final java.lang.ref.WeakReference<android.view.View> a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Camera f2463b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2464c;

    /* renamed from: d, reason: collision with root package name */
    public float f2465d;

    /* renamed from: e, reason: collision with root package name */
    public float f2466e;

    /* renamed from: f, reason: collision with root package name */
    public float f2467f;

    /* renamed from: g, reason: collision with root package name */
    public float f2468g;

    /* renamed from: h, reason: collision with root package name */
    public float f2469h;

    /* renamed from: i, reason: collision with root package name */
    public float f2470i;

    /* renamed from: j, reason: collision with root package name */
    public float f2471j;

    /* renamed from: k, reason: collision with root package name */
    public float f2472k;
    public float l;
    public float m;
    public final android.graphics.RectF n;
    public final android.graphics.RectF o;
    public final android.graphics.Matrix p;

    static {
            java.lang.String r0 = android.os.Build.VERSION.SDK
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = r0.intValue()
            r1 = 11
            if (r0 >= r1) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            com.acse.ottn.m.q = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            com.acse.ottn.m.r = r0
            return
    }

    public m(android.view.View r3) {
            r2 = this;
            r2.<init>()
            android.graphics.Camera r0 = new android.graphics.Camera
            r0.<init>()
            r2.f2463b = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.f2465d = r0
            r2.f2471j = r0
            r2.f2472k = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r2.n = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r2.o = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r2.p = r0
            r0 = 0
            r2.setDuration(r0)
            r0 = 1
            r2.setFillAfter(r0)
            r3.setAnimation(r2)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            r2.a = r0
            return
    }

    public static com.acse.ottn.m a(android.view.View r3) {
            java.util.WeakHashMap<android.view.View, com.acse.ottn.m> r0 = com.acse.ottn.m.r
            java.lang.Object r1 = r0.get(r3)
            com.acse.ottn.m r1 = (com.acse.ottn.m) r1
            if (r1 == 0) goto L12
            android.view.animation.Animation r2 = r3.getAnimation()
            if (r1 == r2) goto L11
            goto L12
        L11:
            return r1
        L12:
            com.acse.ottn.m r1 = new com.acse.ottn.m
            r1.<init>(r3)
            r0.put(r3, r1)
            return r1
    }

    public float a() {
            r1 = this;
            float r0 = r1.f2465d
            return r0
    }

    public void a(float r2) {
            r1 = this;
            float r0 = r1.f2465d
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L15
            r1.f2465d = r2
            java.lang.ref.WeakReference<android.view.View> r2 = r1.a
            java.lang.Object r2 = r2.get()
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L15
            r2.invalidate()
        L15:
            return
    }

    public void a(int r3) {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.a
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            int r1 = r0.getScrollY()
            r0.scrollTo(r3, r1)
        L11:
            return
    }

    public final void a(android.graphics.Matrix r9, android.view.View r10) {
            r8 = this;
            int r0 = r10.getWidth()
            float r0 = (float) r0
            int r10 = r10.getHeight()
            float r10 = (float) r10
            boolean r1 = r8.f2464c
            r2 = 1073741824(0x40000000, float:2.0)
            if (r1 == 0) goto L13
            float r3 = r8.f2466e
            goto L15
        L13:
            float r3 = r0 / r2
        L15:
            if (r1 == 0) goto L1a
            float r1 = r8.f2467f
            goto L1c
        L1a:
            float r1 = r10 / r2
        L1c:
            float r2 = r8.f2468g
            float r4 = r8.f2469h
            float r5 = r8.f2470i
            r6 = 0
            int r7 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r7 != 0) goto L2f
            int r7 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r7 != 0) goto L2f
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 == 0) goto L4c
        L2f:
            android.graphics.Camera r6 = r8.f2463b
            r6.save()
            r6.rotateX(r2)
            r6.rotateY(r4)
            float r2 = -r5
            r6.rotateZ(r2)
            r6.getMatrix(r9)
            r6.restore()
            float r2 = -r3
            float r4 = -r1
            r9.preTranslate(r2, r4)
            r9.postTranslate(r3, r1)
        L4c:
            float r2 = r8.f2471j
            float r4 = r8.f2472k
            r5 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r6 != 0) goto L5a
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 == 0) goto L6e
        L5a:
            r9.postScale(r2, r4)
            float r3 = r3 / r0
            float r3 = -r3
            float r2 = r2 * r0
            float r2 = r2 - r0
            float r3 = r3 * r2
            float r1 = r1 / r10
            float r0 = -r1
            float r4 = r4 * r10
            float r4 = r4 - r10
            float r0 = r0 * r4
            r9.postTranslate(r3, r0)
        L6e:
            float r10 = r8.l
            float r0 = r8.m
            r9.postTranslate(r10, r0)
            return
    }

    public final void a(android.graphics.RectF r4, android.view.View r5) {
            r3 = this;
            int r0 = r5.getWidth()
            float r0 = (float) r0
            int r1 = r5.getHeight()
            float r1 = (float) r1
            r2 = 0
            r4.set(r2, r2, r0, r1)
            android.graphics.Matrix r0 = r3.p
            r0.reset()
            r3.a(r0, r5)
            android.graphics.Matrix r0 = r3.p
            r0.mapRect(r4)
            int r0 = r5.getLeft()
            float r0 = (float) r0
            int r5 = r5.getTop()
            float r5 = (float) r5
            r4.offset(r0, r5)
            float r5 = r4.right
            float r0 = r4.left
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r1 >= 0) goto L34
            r4.right = r0
            r4.left = r5
        L34:
            float r5 = r4.bottom
            float r0 = r4.top
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r1 >= 0) goto L40
            r4.top = r5
            r4.bottom = r0
        L40:
            return
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float r2, android.view.animation.Transformation r3) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r2 = r1.a
            java.lang.Object r2 = r2.get()
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L16
            float r0 = r1.f2465d
            r3.setAlpha(r0)
            android.graphics.Matrix r3 = r3.getMatrix()
            r1.a(r3, r2)
        L16:
            return
    }

    public float b() {
            r1 = this;
            float r0 = r1.f2466e
            return r0
    }

    public void b(float r2) {
            r1 = this;
            boolean r0 = r1.f2464c
            if (r0 == 0) goto Lc
            float r0 = r1.f2466e
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb
            goto Lc
        Lb:
            return
        Lc:
            r1.p()
            r0 = 1
            r1.f2464c = r0
            r1.f2466e = r2
            r1.o()
            return
    }

    public void b(int r3) {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.a
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            int r1 = r0.getScrollX()
            r0.scrollTo(r1, r3)
        L11:
            return
    }

    public float c() {
            r1 = this;
            float r0 = r1.f2467f
            return r0
    }

    public void c(float r2) {
            r1 = this;
            boolean r0 = r1.f2464c
            if (r0 == 0) goto Lc
            float r0 = r1.f2467f
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb
            goto Lc
        Lb:
            return
        Lc:
            r1.p()
            r0 = 1
            r1.f2464c = r0
            r1.f2467f = r2
            r1.o()
            return
    }

    public float d() {
            r1 = this;
            float r0 = r1.f2470i
            return r0
    }

    public void d(float r2) {
            r1 = this;
            float r0 = r1.f2470i
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Le
            r1.p()
            r1.f2470i = r2
            r1.o()
        Le:
            return
    }

    public float e() {
            r1 = this;
            float r0 = r1.f2468g
            return r0
    }

    public void e(float r2) {
            r1 = this;
            float r0 = r1.f2468g
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Le
            r1.p()
            r1.f2468g = r2
            r1.o()
        Le:
            return
    }

    public float f() {
            r1 = this;
            float r0 = r1.f2469h
            return r0
    }

    public void f(float r2) {
            r1 = this;
            float r0 = r1.f2469h
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Le
            r1.p()
            r1.f2469h = r2
            r1.o()
        Le:
            return
    }

    public float g() {
            r1 = this;
            float r0 = r1.f2471j
            return r0
    }

    public void g(float r2) {
            r1 = this;
            float r0 = r1.f2471j
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Le
            r1.p()
            r1.f2471j = r2
            r1.o()
        Le:
            return
    }

    public float h() {
            r1 = this;
            float r0 = r1.f2472k
            return r0
    }

    public void h(float r2) {
            r1 = this;
            float r0 = r1.f2472k
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Le
            r1.p()
            r1.f2472k = r2
            r1.o()
        Le:
            return
    }

    public int i() {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.a
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            int r0 = r0.getScrollX()
            return r0
    }

    public void i(float r2) {
            r1 = this;
            float r0 = r1.l
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Le
            r1.p()
            r1.l = r2
            r1.o()
        Le:
            return
    }

    public int j() {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.a
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            int r0 = r0.getScrollY()
            return r0
    }

    public void j(float r2) {
            r1 = this;
            float r0 = r1.m
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Le
            r1.p()
            r1.m = r2
            r1.o()
        Le:
            return
    }

    public float k() {
            r1 = this;
            float r0 = r1.l
            return r0
    }

    public void k(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.a
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L13
            int r0 = r0.getLeft()
            float r0 = (float) r0
            float r2 = r2 - r0
            r1.i(r2)
        L13:
            return
    }

    public float l() {
            r1 = this;
            float r0 = r1.m
            return r0
    }

    public void l(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.a
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L13
            int r0 = r0.getTop()
            float r0 = (float) r0
            float r2 = r2 - r0
            r1.j(r2)
        L13:
            return
    }

    public float m() {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.a
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            int r0 = r0.getLeft()
            float r0 = (float) r0
            float r1 = r2.l
            float r0 = r0 + r1
            return r0
    }

    public float n() {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.a
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            int r0 = r0.getTop()
            float r0 = (float) r0
            float r1 = r2.m
            float r0 = r0 + r1
            return r0
    }

    public final void o() {
            r7 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r7.a
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L44
            android.view.ViewParent r1 = r0.getParent()
            if (r1 != 0) goto L11
            goto L44
        L11:
            android.graphics.RectF r1 = r7.o
            r7.a(r1, r0)
            android.graphics.RectF r2 = r7.n
            r1.union(r2)
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            float r2 = r1.left
            double r2 = (double) r2
            double r2 = java.lang.Math.floor(r2)
            int r2 = (int) r2
            float r3 = r1.top
            double r3 = (double) r3
            double r3 = java.lang.Math.floor(r3)
            int r3 = (int) r3
            float r4 = r1.right
            double r4 = (double) r4
            double r4 = java.lang.Math.ceil(r4)
            int r4 = (int) r4
            float r1 = r1.bottom
            double r5 = (double) r1
            double r5 = java.lang.Math.ceil(r5)
            int r1 = (int) r5
            r0.invalidate(r2, r3, r4, r1)
        L44:
            return
    }

    public final void p() {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.a
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto Lf
            android.graphics.RectF r1 = r2.n
            r2.a(r1, r0)
        Lf:
            return
    }
}
