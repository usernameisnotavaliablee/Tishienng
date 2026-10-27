package com.bxkj.student.run.app.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class RecordPathView extends android.view.View {
    private android.content.Context a;
    private android.graphics.Paint b;
    private android.graphics.Paint c;
    private android.graphics.Path d;
    private android.graphics.Path e;
    private android.graphics.PathMeasure f;
    private android.graphics.PathMeasure g;
    private boolean h;
    private float i;
    private android.graphics.Bitmap j;
    private android.graphics.Bitmap k;

    /* renamed from: l, reason: collision with root package name */
    private android.graphics.Bitmap f1232l;

    /* renamed from: m, reason: collision with root package name */
    private android.graphics.Canvas f1233m;

    /* renamed from: n, reason: collision with root package name */
    private float[] f1234n;

    /* renamed from: o, reason: collision with root package name */
    private float[] f1235o;

    /* renamed from: p, reason: collision with root package name */
    private float[] f1236p;

    /* renamed from: q, reason: collision with root package name */
    private float f1237q;

    /* renamed from: r, reason: collision with root package name */
    private long f1238r;

    /* renamed from: s, reason: collision with root package name */
    private java.util.ArrayList<com.bxkj.student.run.app.utils.q.a> f1239s;

    /* renamed from: t, reason: collision with root package name */
    private com.bxkj.student.run.app.utils.RecordPathView.d f1240t;

    /* renamed from: u, reason: collision with root package name */
    private int f1241u;

    /* renamed from: v, reason: collision with root package name */
    private int f1242v;

    /* renamed from: w, reason: collision with root package name */
    float f1243w;

    /* renamed from: x, reason: collision with root package name */
    float f1244x;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.animation.ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ com.bxkj.student.run.app.utils.RecordPathView a;

        a(com.bxkj.student.run.app.utils.RecordPathView r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator r2) {
                r1 = this;
                com.bxkj.student.run.app.utils.RecordPathView r0 = r1.a
                java.lang.Object r2 = r2.getAnimatedValue()
                java.lang.Float r2 = (java.lang.Float) r2
                float r2 = r2.floatValue()
                com.bxkj.student.run.app.utils.RecordPathView.b(r0, r2)
                com.bxkj.student.run.app.utils.RecordPathView r2 = r1.a
                com.bxkj.student.run.app.utils.RecordPathView.c(r2)
                com.bxkj.student.run.app.utils.RecordPathView r2 = r1.a
                r2.invalidate()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements android.animation.Animator.AnimatorListener {
        final /* synthetic */ com.bxkj.student.run.app.utils.RecordPathView a;

        b(com.bxkj.student.run.app.utils.RecordPathView r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator r1) {
                r0 = this;
                return
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r1) {
                r0 = this;
                com.bxkj.student.run.app.utils.RecordPathView r1 = r0.a
                com.bxkj.student.run.app.utils.RecordPathView$d r1 = com.bxkj.student.run.app.utils.RecordPathView.a(r1)
                if (r1 == 0) goto L11
                com.bxkj.student.run.app.utils.RecordPathView r1 = r0.a
                com.bxkj.student.run.app.utils.RecordPathView$d r1 = com.bxkj.student.run.app.utils.RecordPathView.a(r1)
                r1.a()
            L11:
                return
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(android.animation.Animator r1) {
                r0 = this;
                return
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r1) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements android.animation.TypeEvaluator {
        final /* synthetic */ com.bxkj.student.run.app.utils.RecordPathView a;

        c(com.bxkj.student.run.app.utils.RecordPathView r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.TypeEvaluator
        public java.lang.Object evaluate(float r1, java.lang.Object r2, java.lang.Object r3) {
                r0 = this;
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface d {
        void a();
    }

    public RecordPathView(android.content.Context r3) {
            r2 = this;
            r2.<init>(r3)
            r0 = 0
            r2.h = r0
            r0 = 2
            float[] r1 = new float[r0]
            r2.f1234n = r1
            float[] r1 = new float[r0]
            r2.f1235o = r1
            float[] r0 = new float[r0]
            r2.f1236p = r0
            r0 = 0
            r2.f1237q = r0
            r2.a = r3
            r2.f()
            return
    }

    public RecordPathView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            r3 = 0
            r1.h = r3
            r3 = 2
            float[] r0 = new float[r3]
            r1.f1234n = r0
            float[] r0 = new float[r3]
            r1.f1235o = r0
            float[] r3 = new float[r3]
            r1.f1236p = r3
            r3 = 0
            r1.f1237q = r3
            r1.a = r2
            r1.f()
            return
    }

    public RecordPathView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r2 = 0
            r0.h = r2
            r2 = 2
            float[] r3 = new float[r2]
            r0.f1234n = r3
            float[] r3 = new float[r2]
            r0.f1235o = r3
            float[] r2 = new float[r2]
            r0.f1236p = r2
            r2 = 0
            r0.f1237q = r2
            r0.a = r1
            r0.f()
            return
    }

    static /* bridge */ /* synthetic */ com.bxkj.student.run.app.utils.RecordPathView.d a(com.bxkj.student.run.app.utils.RecordPathView r0) {
            com.bxkj.student.run.app.utils.RecordPathView$d r0 = r0.f1240t
            return r0
    }

    static /* bridge */ /* synthetic */ void b(com.bxkj.student.run.app.utils.RecordPathView r0, float r1) {
            r0.f1237q = r1
            return
    }

    static /* bridge */ /* synthetic */ void c(com.bxkj.student.run.app.utils.RecordPathView r0) {
            r0.d()
            return
    }

    private void d() {
            r7 = this;
            float r0 = r7.f1237q
            float r1 = r7.i
            float r0 = r0 * r1
            java.util.ArrayList<com.bxkj.student.run.app.utils.q$a> r1 = r7.f1239s
            int r1 = r1.size()
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
        L10:
            if (r4 >= r1) goto L2a
            java.util.ArrayList<com.bxkj.student.run.app.utils.q$a> r6 = r7.f1239s
            java.lang.Object r6 = r6.get(r4)
            com.bxkj.student.run.app.utils.q$a r6 = (com.bxkj.student.run.app.utils.q.a) r6
            float r6 = r6.e()
            float r5 = r5 + r6
            int r6 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r6 <= 0) goto L27
            r7.f1241u = r4
            float r5 = r5 - r0
            goto L2b
        L27:
            int r4 = r4 + 1
            goto L10
        L2a:
            r5 = 0
        L2b:
            android.graphics.Path r0 = r7.d
            r0.reset()
            android.graphics.PathMeasure r0 = new android.graphics.PathMeasure
            java.util.ArrayList<com.bxkj.student.run.app.utils.q$a> r1 = r7.f1239s
            int r4 = r7.f1241u
            java.lang.Object r1 = r1.get(r4)
            com.bxkj.student.run.app.utils.q$a r1 = (com.bxkj.student.run.app.utils.q.a) r1
            android.graphics.Path r1 = r1.d()
            r0.<init>(r1, r3)
            java.util.ArrayList<com.bxkj.student.run.app.utils.q$a> r1 = r7.f1239s
            int r4 = r7.f1241u
            java.lang.Object r1 = r1.get(r4)
            com.bxkj.student.run.app.utils.q$a r1 = (com.bxkj.student.run.app.utils.q.a) r1
            float r1 = r1.e()
            float r1 = r1 - r5
            android.graphics.Path r4 = r7.d
            r5 = 1
            r0.getSegment(r2, r1, r4, r5)
            android.graphics.PathMeasure r0 = new android.graphics.PathMeasure
            android.graphics.Path r1 = r7.d
            r0.<init>(r1, r3)
            r7.g = r0
            float r1 = r0.getLength()
            float[] r2 = r7.f1236p
            r3 = 0
            r0.getPosTan(r1, r2, r3)
            return
    }

    private void f() {
            r3 = this;
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r3.b = r0
            r1 = 1
            r0.setAntiAlias(r1)
            android.graphics.Paint r0 = r3.b
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r2)
            android.graphics.Paint r0 = r3.b
            r2 = 1092616192(0x41200000, float:10.0)
            r0.setStrokeWidth(r2)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r3.c = r0
            r0.setAntiAlias(r1)
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r3.d = r0
            android.content.Context r0 = r3.a
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131689681(0x7f0f00d1, float:1.9008384E38)
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeResource(r0, r1)
            r3.j = r0
            android.content.Context r0 = r3.a
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131690091(0x7f0f026b, float:1.9009216E38)
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeResource(r0, r1)
            r3.k = r0
            return
    }

    private void g() {
            r5 = this;
            com.bxkj.student.run.app.utils.RecordPathView$c r0 = new com.bxkj.student.run.app.utils.RecordPathView$c
            r0.<init>(r5)
            r1 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            android.graphics.PathMeasure r3 = r5.f
            float r3 = r3.getLength()
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r2
            r1 = 1
            r4[r1] = r3
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofObject(r0, r4)
            long r1 = r5.f1238r
            r0.setDuration(r1)
            android.view.animation.AccelerateDecelerateInterpolator r1 = new android.view.animation.AccelerateDecelerateInterpolator
            r1.<init>()
            r0.setInterpolator(r1)
            com.bxkj.student.run.app.utils.RecordPathView$a r1 = new com.bxkj.student.run.app.utils.RecordPathView$a
            r1.<init>(r5)
            r0.addUpdateListener(r1)
            com.bxkj.student.run.app.utils.RecordPathView$b r1 = new com.bxkj.student.run.app.utils.RecordPathView$b
            r1.<init>(r5)
            r0.addListener(r1)
            r0.start()
            return
    }

    public void e() {
            r2 = this;
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r2.d = r0
            android.graphics.Bitmap r0 = r2.j
            r1 = 0
            if (r0 == 0) goto L11
            r0.recycle()
            r2.j = r1
        L11:
            android.graphics.Bitmap r0 = r2.k
            if (r0 == 0) goto L1a
            r0.recycle()
            r2.k = r1
        L1a:
            r2.invalidate()
            return
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r10) {
            r9 = this;
            super.onDraw(r10)
            java.util.ArrayList<com.bxkj.student.run.app.utils.q$a> r0 = r9.f1239s
            if (r0 == 0) goto L105
            int r0 = r0.size()
            if (r0 != 0) goto Lf
            goto L105
        Lf:
            float r0 = r9.f1237q
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L19
            goto L105
        L19:
            android.graphics.Bitmap r0 = r9.f1232l
            if (r0 != 0) goto L36
            int r0 = r9.getMeasuredWidth()
            int r2 = r9.getMeasuredHeight()
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r2, r3)
            r9.f1232l = r0
            android.graphics.Canvas r0 = new android.graphics.Canvas
            android.graphics.Bitmap r2 = r9.f1232l
            r0.<init>(r2)
            r9.f1233m = r0
        L36:
            android.graphics.Canvas r0 = r9.f1233m
            r0.save()
            int r0 = r9.f1241u
            int r2 = r9.f1242v
            r3 = 1092616192(0x41200000, float:10.0)
            r4 = 1
            if (r0 <= r2) goto La8
            if (r2 <= 0) goto La8
            int r2 = r2 - r4
        L47:
            int r0 = r9.f1241u
            if (r2 >= r0) goto La8
            java.util.ArrayList<com.bxkj.student.run.app.utils.q$a> r0 = r9.f1239s
            java.lang.Object r0 = r0.get(r2)
            com.bxkj.student.run.app.utils.q$a r0 = (com.bxkj.student.run.app.utils.q.a) r0
            android.graphics.Paint r5 = r9.b
            int r6 = r0.a()
            r5.setColor(r6)
            android.graphics.Paint r5 = r9.b
            android.graphics.Shader r6 = r0.f()
            r5.setShader(r6)
            android.graphics.Paint r5 = r9.b
            r5.setStrokeWidth(r3)
            android.graphics.Paint r5 = r9.b
            android.graphics.Paint$Style r6 = android.graphics.Paint.Style.STROKE
            r5.setStyle(r6)
            android.graphics.Canvas r5 = r9.f1233m
            android.graphics.Path r6 = r0.d()
            android.graphics.Paint r7 = r9.b
            r5.drawPath(r6, r7)
            android.graphics.Paint r5 = r9.b
            r6 = 0
            r5.setShader(r6)
            android.graphics.Paint r5 = r9.b
            r5.setStrokeWidth(r1)
            android.graphics.Paint r5 = r9.b
            android.graphics.Paint$Style r6 = android.graphics.Paint.Style.FILL_AND_STROKE
            r5.setStyle(r6)
            android.graphics.Canvas r5 = r9.f1233m
            android.graphics.Point r6 = r0.b()
            int r6 = r6.x
            float r6 = (float) r6
            android.graphics.Point r0 = r0.b()
            int r0 = r0.y
            float r0 = (float) r0
            r7 = 1084227584(0x40a00000, float:5.0)
            android.graphics.Paint r8 = r9.b
            r5.drawCircle(r6, r0, r7, r8)
            int r2 = r2 + 1
            goto L47
        La8:
            android.graphics.Canvas r0 = r9.f1233m
            r0.restore()
            android.graphics.Bitmap r0 = r9.f1232l
            android.graphics.Paint r1 = r9.c
            r2 = 0
            r10.drawBitmap(r0, r2, r2, r1)
            android.graphics.Paint r0 = r9.b
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r1)
            android.graphics.Paint r0 = r9.b
            java.util.ArrayList<com.bxkj.student.run.app.utils.q$a> r1 = r9.f1239s
            int r2 = r9.f1241u
            java.lang.Object r1 = r1.get(r2)
            com.bxkj.student.run.app.utils.q$a r1 = (com.bxkj.student.run.app.utils.q.a) r1
            android.graphics.Shader r1 = r1.f()
            r0.setShader(r1)
            android.graphics.Paint r0 = r9.b
            r0.setStrokeWidth(r3)
            android.graphics.Path r0 = r9.d
            android.graphics.Paint r1 = r9.b
            r10.drawPath(r0, r1)
            android.graphics.Bitmap r0 = r9.k
            float[] r1 = r9.f1236p
            r2 = 0
            r1 = r1[r2]
            int r2 = r0.getWidth()
            int r2 = r2 / 2
            float r2 = (float) r2
            float r1 = r1 - r2
            float[] r2 = r9.f1236p
            r2 = r2[r4]
            android.graphics.Bitmap r3 = r9.k
            int r3 = r3.getHeight()
            int r3 = r3 / 2
            float r3 = (float) r3
            float r2 = r2 - r3
            android.graphics.Paint r3 = r9.c
            r10.drawBitmap(r0, r1, r2, r3)
            int r10 = r9.f1242v
            int r0 = r9.f1241u
            if (r10 == r0) goto L105
            r9.f1242v = r0
        L105:
            return
    }

    public void setOnAnimEnd(com.bxkj.student.run.app.utils.RecordPathView.d r1) {
            r0 = this;
            r0.f1240t = r1
            return
    }

    public void setPath(com.bxkj.student.run.app.utils.q r4) {
            r3 = this;
            if (r4 != 0) goto L3
            goto L4c
        L3:
            boolean r0 = r3.h
            if (r0 != 0) goto L4c
            float r0 = r4.d()
            r3.i = r0
            long r0 = r4.c()
            r3.f1238r = r0
            java.util.ArrayList r0 = r4.e()
            r3.f1239s = r0
            android.graphics.Path r4 = r4.f()
            r3.e = r4
            android.graphics.PathMeasure r4 = new android.graphics.PathMeasure
            android.graphics.Path r0 = r3.e
            r1 = 0
            r4.<init>(r0, r1)
            r3.f = r4
            r0 = 0
            float[] r1 = r3.f1234n
            r2 = 0
            r4.getPosTan(r0, r1, r2)
            android.graphics.PathMeasure r4 = r3.f
            float r0 = r4.getLength()
            float[] r1 = r3.f1235o
            r4.getPosTan(r0, r1, r2)
            java.util.ArrayList<com.bxkj.student.run.app.utils.q$a> r4 = r3.f1239s
            if (r4 == 0) goto L4c
            int r4 = r4.size()
            if (r4 != 0) goto L46
            goto L4c
        L46:
            r3.g()
            r4 = 1
            r3.h = r4
        L4c:
            return
    }
}
