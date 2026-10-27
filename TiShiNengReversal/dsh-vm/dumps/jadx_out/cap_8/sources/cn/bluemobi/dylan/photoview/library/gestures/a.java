package cn.bluemobi.dylan.photoview.library.gestures;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a implements cn.bluemobi.dylan.photoview.library.gestures.d {

    /* renamed from: h, reason: collision with root package name */
    private static final java.lang.String f182h = "CupcakeGestureDetector";
    protected cn.bluemobi.dylan.photoview.library.gestures.e a;

    /* renamed from: b, reason: collision with root package name */
    float f183b;

    /* renamed from: c, reason: collision with root package name */
    float f184c;

    /* renamed from: d, reason: collision with root package name */
    final float f185d;

    /* renamed from: e, reason: collision with root package name */
    final float f186e;

    /* renamed from: f, reason: collision with root package name */
    private android.view.VelocityTracker f187f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f188g;

    public a(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            android.view.ViewConfiguration r2 = android.view.ViewConfiguration.get(r2)
            int r0 = r2.getScaledMinimumFlingVelocity()
            float r0 = (float) r0
            r1.f186e = r0
            int r2 = r2.getScaledTouchSlop()
            float r2 = (float) r2
            r1.f185d = r2
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.gestures.d
    public void a(cn.bluemobi.dylan.photoview.library.gestures.e r1) {
            r0 = this;
            r0.a = r1
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.gestures.d
    public boolean b() {
            r1 = this;
            boolean r0 = r1.f188g
            return r0
    }

    @Override // cn.bluemobi.dylan.photoview.library.gestures.d
    public boolean c() {
            r1 = this;
            r0 = 0
            return r0
    }

    float d(android.view.MotionEvent r1) {
            r0 = this;
            float r1 = r1.getX()
            return r1
    }

    float e(android.view.MotionEvent r1) {
            r0 = this;
            float r1 = r1.getY()
            return r1
    }

    @Override // cn.bluemobi.dylan.photoview.library.gestures.d
    public boolean onTouchEvent(android.view.MotionEvent r12) {
            r11 = this;
            int r0 = r12.getAction()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Laf
            r3 = 0
            if (r0 == r2) goto L5c
            r4 = 2
            if (r0 == r4) goto L1e
            r12 = 3
            if (r0 == r12) goto L13
            goto Ld4
        L13:
            android.view.VelocityTracker r12 = r11.f187f
            if (r12 == 0) goto Ld4
            r12.recycle()
            r11.f187f = r3
            goto Ld4
        L1e:
            float r0 = r11.d(r12)
            float r3 = r11.e(r12)
            float r4 = r11.f183b
            float r4 = r0 - r4
            float r5 = r11.f184c
            float r5 = r3 - r5
            boolean r6 = r11.f188g
            if (r6 != 0) goto L46
            float r6 = r4 * r4
            float r7 = r5 * r5
            float r6 = r6 + r7
            double r6 = (double) r6
            double r6 = java.lang.Math.sqrt(r6)
            float r8 = r11.f185d
            double r8 = (double) r8
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 < 0) goto L44
            r1 = 1
        L44:
            r11.f188g = r1
        L46:
            boolean r1 = r11.f188g
            if (r1 == 0) goto Ld4
            cn.bluemobi.dylan.photoview.library.gestures.e r1 = r11.a
            r1.e(r4, r5)
            r11.f183b = r0
            r11.f184c = r3
            android.view.VelocityTracker r0 = r11.f187f
            if (r0 == 0) goto Ld4
            r0.addMovement(r12)
            goto Ld4
        L5c:
            boolean r0 = r11.f188g
            if (r0 == 0) goto La5
            android.view.VelocityTracker r0 = r11.f187f
            if (r0 == 0) goto La5
            float r0 = r11.d(r12)
            r11.f183b = r0
            float r0 = r11.e(r12)
            r11.f184c = r0
            android.view.VelocityTracker r0 = r11.f187f
            r0.addMovement(r12)
            android.view.VelocityTracker r12 = r11.f187f
            r0 = 1000(0x3e8, float:1.401E-42)
            r12.computeCurrentVelocity(r0)
            android.view.VelocityTracker r12 = r11.f187f
            float r12 = r12.getXVelocity()
            android.view.VelocityTracker r0 = r11.f187f
            float r0 = r0.getYVelocity()
            float r1 = java.lang.Math.abs(r12)
            float r4 = java.lang.Math.abs(r0)
            float r1 = java.lang.Math.max(r1, r4)
            float r4 = r11.f186e
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 < 0) goto La5
            cn.bluemobi.dylan.photoview.library.gestures.e r1 = r11.a
            float r4 = r11.f183b
            float r5 = r11.f184c
            float r12 = -r12
            float r0 = -r0
            r1.c(r4, r5, r12, r0)
        La5:
            android.view.VelocityTracker r12 = r11.f187f
            if (r12 == 0) goto Ld4
            r12.recycle()
            r11.f187f = r3
            goto Ld4
        Laf:
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r11.f187f = r0
            if (r0 == 0) goto Lbb
            r0.addMovement(r12)
            goto Lc6
        Lbb:
            i.b r0 = i.a.a()
            java.lang.String r3 = "CupcakeGestureDetector"
            java.lang.String r4 = "Velocity tracker is null"
            r0.i(r3, r4)
        Lc6:
            float r0 = r11.d(r12)
            r11.f183b = r0
            float r12 = r11.e(r12)
            r11.f184c = r12
            r11.f188g = r1
        Ld4:
            return r2
    }
}
