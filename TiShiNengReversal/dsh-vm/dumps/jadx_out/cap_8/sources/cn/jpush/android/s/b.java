package cn.jpush.android.s;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b implements android.view.View.OnTouchListener {
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private int f1882b;

    /* renamed from: c, reason: collision with root package name */
    private int f1883c;

    /* renamed from: d, reason: collision with root package name */
    private long f1884d;

    /* renamed from: e, reason: collision with root package name */
    private android.view.View f1885e;

    /* renamed from: f, reason: collision with root package name */
    private cn.jpush.android.s.b.a f1886f;

    /* renamed from: g, reason: collision with root package name */
    private int f1887g;

    /* renamed from: h, reason: collision with root package name */
    private int f1888h;

    /* renamed from: i, reason: collision with root package name */
    private float f1889i;

    /* renamed from: j, reason: collision with root package name */
    private float f1890j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f1891k;
    private int l;
    private java.lang.Object m;
    private android.view.VelocityTracker n;
    private float o;
    private float p;
    private int q;





    public interface a {
        void a(android.view.View r1, java.lang.Object r2);

        boolean a(java.lang.Object r1);
    }

    public b(cn.jpush.android.u.b r3, java.lang.Object r4, int r5, cn.jpush.android.s.b.a r6) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.f1887g = r0
            r2.f1888h = r0
            android.view.View r3 = r3.e()
            android.content.Context r0 = r3.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r1 = r0.getScaledTouchSlop()
            r2.a = r1
            int r1 = r0.getScaledMinimumFlingVelocity()
            int r1 = r1 * 16
            r2.f1882b = r1
            int r0 = r0.getScaledMaximumFlingVelocity()
            r2.f1883c = r0
            r0 = 500(0x1f4, double:2.47E-321)
            r2.f1884d = r0
            r2.f1885e = r3
            r2.q = r5
            r2.m = r4
            r2.f1886f = r6
            return
    }

    private void a(float r9, float r10, android.animation.AnimatorListenerAdapter r11) {
            r8 = this;
            java.lang.String r1 = "InAppSWTouchListener"
            float r4 = r8.a()     // Catch: java.lang.Throwable -> L54
            float r5 = r9 - r4
            android.view.View r9 = r8.f1885e     // Catch: java.lang.Throwable -> L54
            float r6 = r9.getAlpha()     // Catch: java.lang.Throwable -> L54
            float r7 = r10 - r6
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L54
            r9.<init>()     // Catch: java.lang.Throwable -> L54
            java.lang.String r10 = "animateTo, beginTranslation: "
            r9.append(r10)     // Catch: java.lang.Throwable -> L54
            r9.append(r4)     // Catch: java.lang.Throwable -> L54
            java.lang.String r10 = ", translationDiff: "
            r9.append(r10)     // Catch: java.lang.Throwable -> L54
            r9.append(r5)     // Catch: java.lang.Throwable -> L54
            java.lang.String r10 = ", beginAlpha: , alphaDiff: "
            r9.append(r10)     // Catch: java.lang.Throwable -> L54
            r9.append(r7)     // Catch: java.lang.Throwable -> L54
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L54
            cn.jpush.android.helper.Logger.i(r1, r9)     // Catch: java.lang.Throwable -> L54
            r9 = 2
            float[] r9 = new float[r9]     // Catch: java.lang.Throwable -> L54
            r9 = {x0074: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array     // Catch: java.lang.Throwable -> L54
            android.animation.ValueAnimator r9 = android.animation.ValueAnimator.ofFloat(r9)     // Catch: java.lang.Throwable -> L54
            if (r9 == 0) goto L5a
            long r2 = r8.f1884d     // Catch: java.lang.Throwable -> L54
            r9.setDuration(r2)     // Catch: java.lang.Throwable -> L54
            cn.jpush.android.s.b$2 r2 = new cn.jpush.android.s.b$2     // Catch: java.lang.Throwable -> L54
            r3 = r8
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L54
            r9.addUpdateListener(r2)     // Catch: java.lang.Throwable -> L54
            if (r11 == 0) goto L57
            r9.addListener(r11)     // Catch: java.lang.Throwable -> L54
            goto L57
        L54:
            r0 = move-exception
            r9 = r0
            goto L5b
        L57:
            r9.start()     // Catch: java.lang.Throwable -> L54
        L5a:
            return
        L5b:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "[animateTo] failed"
            r10.append(r11)
            java.lang.String r9 = r9.getMessage()
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            cn.jpush.android.helper.Logger.w(r1, r9)
            return
    }

    static /* synthetic */ void a(cn.jpush.android.s.b r0) {
            r0.c()
            return
    }

    static /* synthetic */ cn.jpush.android.s.b.a b(cn.jpush.android.s.b r0) {
            cn.jpush.android.s.b$a r0 = r0.f1886f
            return r0
    }

    static /* synthetic */ android.view.View c(cn.jpush.android.s.b r0) {
            android.view.View r0 = r0.f1885e
            return r0
    }

    private void c() {
            r5 = this;
            android.view.View r0 = r5.f1885e     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L38
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()     // Catch: java.lang.Throwable -> L36
            android.view.View r1 = r5.f1885e     // Catch: java.lang.Throwable -> L36
            r1.getHeight()     // Catch: java.lang.Throwable -> L36
            android.view.View r1 = r5.f1885e     // Catch: java.lang.Throwable -> L36
            int r1 = r1.getWidth()     // Catch: java.lang.Throwable -> L36
            r2 = 1
            int[] r2 = new int[]{r1, r2}     // Catch: java.lang.Throwable -> L36
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofInt(r2)     // Catch: java.lang.Throwable -> L36
            long r3 = r5.f1884d     // Catch: java.lang.Throwable -> L36
            android.animation.ValueAnimator r2 = r2.setDuration(r3)     // Catch: java.lang.Throwable -> L36
            cn.jpush.android.s.b$3 r3 = new cn.jpush.android.s.b$3     // Catch: java.lang.Throwable -> L36
            r3.<init>(r5, r0, r1)     // Catch: java.lang.Throwable -> L36
            r2.addListener(r3)     // Catch: java.lang.Throwable -> L36
            cn.jpush.android.s.b$4 r1 = new cn.jpush.android.s.b$4     // Catch: java.lang.Throwable -> L36
            r1.<init>(r5, r0)     // Catch: java.lang.Throwable -> L36
            r2.addUpdateListener(r1)     // Catch: java.lang.Throwable -> L36
            r2.start()     // Catch: java.lang.Throwable -> L36
            return
        L36:
            r0 = move-exception
            goto L39
        L38:
            return
        L39:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[performDismiss] failed."
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "InAppSWTouchListener"
            cn.jpush.android.helper.Logger.w(r1, r0)
            return
    }

    static /* synthetic */ java.lang.Object d(cn.jpush.android.s.b r0) {
            java.lang.Object r0 = r0.m
            return r0
    }

    protected float a() {
            r1 = this;
            android.view.View r0 = r1.f1885e
            float r0 = r0.getTranslationY()
            return r0
    }

    protected void a(float r2) {
            r1 = this;
            android.view.View r0 = r1.f1885e
            r0.setTranslationY(r2)
            return
    }

    protected void a(boolean r4) {
            r3 = this;
            int r0 = r3.f1888h
            if (r4 == 0) goto L5
            int r0 = -r0
        L5:
            float r0 = (float) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[startDismissAnimationY] dismissTop: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ", viewHeight: "
            r1.append(r4)
            int r4 = r3.f1888h
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r1 = "InAppSWTouchListener"
            cn.jpush.android.helper.Logger.d(r1, r4)
            cn.jpush.android.s.b$1 r4 = new cn.jpush.android.s.b$1
            r4.<init>(r3)
            r1 = 0
            r3.a(r0, r1, r4)
            return
    }

    protected void b() {
            r3 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            r2 = 0
            r3.a(r2, r0, r1)
            return
    }

    protected void b(float r2) {
            r1 = this;
            android.view.View r0 = r1.f1885e
            r0.setAlpha(r2)
            return
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
            r8 = this;
            r9 = 0
            float r0 = r8.p     // Catch: java.lang.Throwable -> L15
            r1 = 0
            r10.offsetLocation(r1, r0)     // Catch: java.lang.Throwable -> L15
            int r0 = r8.f1888h     // Catch: java.lang.Throwable -> L15
            r2 = 2
            if (r0 >= r2) goto L18
            android.view.View r0 = r8.f1885e     // Catch: java.lang.Throwable -> L15
            int r0 = r0.getHeight()     // Catch: java.lang.Throwable -> L15
            r8.f1888h = r0     // Catch: java.lang.Throwable -> L15
            goto L18
        L15:
            r10 = move-exception
            goto L14d
        L18:
            int r0 = r10.getActionMasked()     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L12b
            r3 = 0
            r4 = 1
            if (r0 == r4) goto Ld8
            r5 = 3
            if (r0 == r2) goto L40
            if (r0 == r5) goto L29
            goto L167
        L29:
            android.view.VelocityTracker r10 = r8.n     // Catch: java.lang.Throwable -> L15
            if (r10 != 0) goto L2f
            goto L167
        L2f:
            r10.recycle()     // Catch: java.lang.Throwable -> L15
            r8.n = r3     // Catch: java.lang.Throwable -> L15
            r8.o = r1     // Catch: java.lang.Throwable -> L15
            r8.p = r1     // Catch: java.lang.Throwable -> L15
            r8.f1889i = r1     // Catch: java.lang.Throwable -> L15
            goto L127
        L3c:
            r8.f1891k = r9     // Catch: java.lang.Throwable -> L15
            goto L167
        L40:
            android.view.VelocityTracker r0 = r8.n     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L46
            goto L167
        L46:
            r0.addMovement(r10)     // Catch: java.lang.Throwable -> L15
            float r0 = r10.getRawX()     // Catch: java.lang.Throwable -> L15
            float r2 = r8.f1889i     // Catch: java.lang.Throwable -> L15
            float r0 = r0 - r2
            float r2 = r10.getRawY()     // Catch: java.lang.Throwable -> L15
            float r3 = r8.f1890j     // Catch: java.lang.Throwable -> L15
            float r2 = r2 - r3
            float r3 = java.lang.Math.abs(r2)     // Catch: java.lang.Throwable -> L15
            int r6 = r8.a     // Catch: java.lang.Throwable -> L15
            float r6 = (float) r6     // Catch: java.lang.Throwable -> L15
            r7 = 1073741824(0x40000000, float:2.0)
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 <= 0) goto Lb0
            float r0 = java.lang.Math.abs(r0)     // Catch: java.lang.Throwable -> L15
            float r3 = java.lang.Math.abs(r2)     // Catch: java.lang.Throwable -> L15
            float r3 = r3 / r7
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto Lb0
            int r0 = r8.q     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L7b
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L83
            goto L167
        L7b:
            if (r0 != r4) goto L83
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 >= 0) goto L83
            goto L167
        L83:
            r8.f1891k = r4     // Catch: java.lang.Throwable -> L15
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L8c
            int r0 = r8.a     // Catch: java.lang.Throwable -> L15
            goto L8f
        L8c:
            int r0 = r8.a     // Catch: java.lang.Throwable -> L15
            int r0 = -r0
        L8f:
            r8.l = r0     // Catch: java.lang.Throwable -> L15
            android.view.View r0 = r8.f1885e     // Catch: java.lang.Throwable -> L15
            android.view.ViewParent r0 = r0.getParent()     // Catch: java.lang.Throwable -> L15
            r0.requestDisallowInterceptTouchEvent(r4)     // Catch: java.lang.Throwable -> L15
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r10)     // Catch: java.lang.Throwable -> L15
            int r10 = r10.getActionIndex()     // Catch: java.lang.Throwable -> L15
            int r10 = r10 << 8
            r10 = r10 | r5
            r0.setAction(r10)     // Catch: java.lang.Throwable -> L15
            android.view.View r10 = r8.f1885e     // Catch: java.lang.Throwable -> L15
            r10.onTouchEvent(r0)     // Catch: java.lang.Throwable -> L15
            r0.recycle()     // Catch: java.lang.Throwable -> L15
        Lb0:
            boolean r10 = r8.f1891k     // Catch: java.lang.Throwable -> L15
            if (r10 == 0) goto L167
            r8.p = r2     // Catch: java.lang.Throwable -> L15
            int r10 = r8.l     // Catch: java.lang.Throwable -> L15
            float r10 = (float) r10     // Catch: java.lang.Throwable -> L15
            float r10 = r2 - r10
            r8.a(r10)     // Catch: java.lang.Throwable -> L15
            float r10 = java.lang.Math.abs(r2)     // Catch: java.lang.Throwable -> L15
            float r10 = r10 * r7
            int r0 = r8.f1888h     // Catch: java.lang.Throwable -> L15
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L15
            float r10 = r10 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r10 = r0 - r10
            float r10 = java.lang.Math.min(r0, r10)     // Catch: java.lang.Throwable -> L15
            float r10 = java.lang.Math.max(r1, r10)     // Catch: java.lang.Throwable -> L15
            r8.b(r10)     // Catch: java.lang.Throwable -> L15
            return r4
        Ld8:
            android.view.VelocityTracker r0 = r8.n     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto Lde
            goto L167
        Lde:
            float r0 = r10.getRawY()     // Catch: java.lang.Throwable -> L15
            float r5 = r8.f1889i     // Catch: java.lang.Throwable -> L15
            float r0 = r0 - r5
            android.view.VelocityTracker r5 = r8.n     // Catch: java.lang.Throwable -> L15
            r5.addMovement(r10)     // Catch: java.lang.Throwable -> L15
            android.view.VelocityTracker r10 = r8.n     // Catch: java.lang.Throwable -> L15
            r5 = 1000(0x3e8, float:1.401E-42)
            r10.computeCurrentVelocity(r5)     // Catch: java.lang.Throwable -> L15
            float r10 = java.lang.Math.abs(r0)     // Catch: java.lang.Throwable -> L15
            int r5 = r8.f1888h     // Catch: java.lang.Throwable -> L15
            int r5 = r5 / r2
            float r2 = (float) r5     // Catch: java.lang.Throwable -> L15
            int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r10 <= 0) goto L109
            boolean r10 = r8.f1891k     // Catch: java.lang.Throwable -> L15
            if (r10 == 0) goto L109
            int r10 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r10 >= 0) goto L107
            r10 = 1
            goto L10b
        L107:
            r10 = 0
            goto L10b
        L109:
            r10 = 0
            r4 = 0
        L10b:
            if (r4 == 0) goto L111
            r8.a(r10)     // Catch: java.lang.Throwable -> L15
            goto L118
        L111:
            boolean r10 = r8.f1891k     // Catch: java.lang.Throwable -> L15
            if (r10 == 0) goto L118
            r8.b()     // Catch: java.lang.Throwable -> L15
        L118:
            android.view.VelocityTracker r10 = r8.n     // Catch: java.lang.Throwable -> L15
            if (r10 == 0) goto L11f
            r10.recycle()     // Catch: java.lang.Throwable -> L15
        L11f:
            r8.n = r3     // Catch: java.lang.Throwable -> L15
            r8.o = r1     // Catch: java.lang.Throwable -> L15
            r8.p = r1     // Catch: java.lang.Throwable -> L15
            r8.f1889i = r1     // Catch: java.lang.Throwable -> L15
        L127:
            r8.f1890j = r1     // Catch: java.lang.Throwable -> L15
            goto L3c
        L12b:
            float r0 = r10.getRawX()     // Catch: java.lang.Throwable -> L15
            r8.f1889i = r0     // Catch: java.lang.Throwable -> L15
            float r0 = r10.getRawY()     // Catch: java.lang.Throwable -> L15
            r8.f1890j = r0     // Catch: java.lang.Throwable -> L15
            cn.jpush.android.s.b$a r0 = r8.f1886f     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L14c
            java.lang.Object r1 = r8.m     // Catch: java.lang.Throwable -> L15
            boolean r0 = r0.a(r1)     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L14c
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()     // Catch: java.lang.Throwable -> L15
            r8.n = r0     // Catch: java.lang.Throwable -> L15
            r0.addMovement(r10)     // Catch: java.lang.Throwable -> L15
        L14c:
            return r9
        L14d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onTouch error."
            r0.append(r1)
            java.lang.String r10 = r10.getMessage()
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            java.lang.String r0 = "InAppSWTouchListener"
            cn.jpush.android.helper.Logger.w(r0, r10)
        L167:
            return r9
    }
}
