package com.bxkj.student.run.app.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class SportTrailView extends android.view.View {

    /* renamed from: l, reason: collision with root package name */
    public static final int f1245l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f1246m = 10;
    private android.graphics.Paint a;
    private android.graphics.Point b;
    private android.graphics.Bitmap c;
    private android.graphics.Paint d;
    private android.graphics.Paint e;
    private android.graphics.Bitmap f;
    private android.graphics.Rect g;
    private int h;
    private int i;
    private android.graphics.Path j;
    private float[] k;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.animation.ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ android.graphics.PathMeasure a;
        final /* synthetic */ java.util.List b;
        final /* synthetic */ float c;
        final /* synthetic */ com.bxkj.student.run.app.utils.SportTrailView.b d;
        final /* synthetic */ com.bxkj.student.run.app.utils.SportTrailView e;

        a(com.bxkj.student.run.app.utils.SportTrailView r1, android.graphics.PathMeasure r2, java.util.List r3, float r4, com.bxkj.student.run.app.utils.SportTrailView.b r5) {
                r0 = this;
                r0.e = r1
                r0.a = r2
                r0.b = r3
                r0.c = r4
                r0.d = r5
                r0.<init>()
                return
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator r6) {
                r5 = this;
                java.lang.Object r6 = r6.getAnimatedValue()
                java.lang.Float r6 = (java.lang.Float) r6
                float r6 = r6.floatValue()
                android.graphics.PathMeasure r0 = r5.a
                com.bxkj.student.run.app.utils.SportTrailView r1 = r5.e
                float[] r1 = com.bxkj.student.run.app.utils.SportTrailView.a(r1)
                r2 = 0
                r0.getPosTan(r6, r1, r2)
                r0 = 0
                int r1 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r1 != 0) goto L3b
                com.bxkj.student.run.app.utils.SportTrailView r1 = r5.e
                android.graphics.Path r1 = com.bxkj.student.run.app.utils.SportTrailView.b(r1)
                java.util.List r2 = r5.b
                r3 = 0
                java.lang.Object r2 = r2.get(r3)
                android.graphics.Point r2 = (android.graphics.Point) r2
                int r2 = r2.x
                float r2 = (float) r2
                java.util.List r4 = r5.b
                java.lang.Object r3 = r4.get(r3)
                android.graphics.Point r3 = (android.graphics.Point) r3
                int r3 = r3.y
                float r3 = (float) r3
                r1.moveTo(r2, r3)
            L3b:
                android.graphics.PathMeasure r1 = r5.a
                com.bxkj.student.run.app.utils.SportTrailView r2 = r5.e
                android.graphics.Path r2 = com.bxkj.student.run.app.utils.SportTrailView.b(r2)
                r3 = 1
                r1.getSegment(r0, r6, r2, r3)
                com.bxkj.student.run.app.utils.SportTrailView r0 = r5.e
                r0.invalidate()
                float r0 = r5.c
                int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r6 != 0) goto L59
                com.bxkj.student.run.app.utils.SportTrailView$b r6 = r5.d
                if (r6 == 0) goto L59
                r6.onFinish()
            L59:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        void onFinish();
    }

    static {
            r0 = 252(0xfc, float:3.53E-43)
            r1 = 0
            r2 = 124(0x7c, float:1.74E-43)
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            com.bxkj.student.run.app.utils.SportTrailView.f1245l = r0
            return
    }

    public SportTrailView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public SportTrailView(android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public SportTrailView(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 2
            float[] r1 = new float[r1]
            r0.k = r1
            r0.e()
            return
    }

    static /* bridge */ /* synthetic */ float[] a(com.bxkj.student.run.app.utils.SportTrailView r0) {
            float[] r0 = r0.k
            return r0
    }

    static /* bridge */ /* synthetic */ android.graphics.Path b(com.bxkj.student.run.app.utils.SportTrailView r0) {
            android.graphics.Path r0 = r0.j
            return r0
    }

    private void e() {
            r2 = this;
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r2.d = r0
            int r1 = com.bxkj.student.run.app.utils.SportTrailView.f1245l
            r0.setColor(r1)
            android.graphics.Paint r0 = r2.d
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r1)
            android.graphics.Paint r0 = r2.d
            r1 = 1092616192(0x41200000, float:10.0)
            r0.setStrokeWidth(r1)
            android.graphics.Paint r0 = r2.d
            r1 = 1
            r0.setAntiAlias(r1)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r2.e = r0
            r0.setAntiAlias(r1)
            android.graphics.Paint r0 = r2.e
            r0.setFilterBitmap(r1)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r2.a = r0
            r0.setAntiAlias(r1)
            android.graphics.Paint r0 = r2.a
            r0.setFilterBitmap(r1)
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r2.j = r0
            return
    }

    public void c() {
            r2 = this;
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r2.j = r0
            android.graphics.Bitmap r0 = r2.f
            r1 = 0
            if (r0 == 0) goto L11
            r0.recycle()
            r2.f = r1
        L11:
            android.graphics.Bitmap r0 = r2.c
            if (r0 == 0) goto L1a
            r0.recycle()
            r2.c = r1
        L1a:
            r2.invalidate()
            return
    }

    public void d(java.util.List<android.graphics.Point> r11, @androidx.annotation.DrawableRes int r12, @androidx.annotation.DrawableRes int r13, com.bxkj.student.run.app.utils.SportTrailView.b r14) {
            r10 = this;
            int r0 = r11.size()
            r1 = 1
            if (r0 > r1) goto Lb
            r14.onFinish()
            return
        Lb:
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r2 = 0
            r3 = 0
        L12:
            int r4 = r11.size()
            if (r3 >= r4) goto L48
            if (r3 != 0) goto L30
            java.lang.Object r4 = r11.get(r3)
            android.graphics.Point r4 = (android.graphics.Point) r4
            int r4 = r4.x
            float r4 = (float) r4
            java.lang.Object r5 = r11.get(r3)
            android.graphics.Point r5 = (android.graphics.Point) r5
            int r5 = r5.y
            float r5 = (float) r5
            r0.moveTo(r4, r5)
            goto L45
        L30:
            java.lang.Object r4 = r11.get(r3)
            android.graphics.Point r4 = (android.graphics.Point) r4
            int r4 = r4.x
            float r4 = (float) r4
            java.lang.Object r5 = r11.get(r3)
            android.graphics.Point r5 = (android.graphics.Point) r5
            int r5 = r5.y
            float r5 = (float) r5
            r0.lineTo(r4, r5)
        L45:
            int r3 = r3 + 1
            goto L12
        L48:
            android.graphics.PathMeasure r6 = new android.graphics.PathMeasure
            r6.<init>(r0, r2)
            float r8 = r6.getLength()
            android.content.Context r0 = r10.getContext()
            r3 = 1098907648(0x41800000, float:16.0)
            int r0 = com.bxkj.student.run.app.utils.r.a(r0, r3)
            float r0 = (float) r0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 >= 0) goto L64
            r14.onFinish()
            return
        L64:
            android.content.res.Resources r0 = r10.getResources()
            android.graphics.Bitmap r13 = android.graphics.BitmapFactory.decodeResource(r0, r13)
            r10.f = r13
            android.graphics.Point r13 = new android.graphics.Point
            java.lang.Object r0 = r11.get(r2)
            android.graphics.Point r0 = (android.graphics.Point) r0
            int r0 = r0.x
            java.lang.Object r3 = r11.get(r2)
            android.graphics.Point r3 = (android.graphics.Point) r3
            int r3 = r3.y
            r13.<init>(r0, r3)
            r10.b = r13
            com.amap.api.maps.model.BitmapDescriptor r12 = com.amap.api.maps.model.BitmapDescriptorFactory.fromResource(r12)
            android.graphics.Bitmap r12 = r12.getBitmap()
            r10.c = r12
            r12 = 2
            float[] r12 = new float[r12]
            r13 = 0
            r12[r2] = r13
            r12[r1] = r8
            android.animation.ValueAnimator r12 = android.animation.ValueAnimator.ofFloat(r12)
            r0 = 3000(0xbb8, double:1.482E-320)
            r12.setDuration(r0)
            android.view.animation.AccelerateDecelerateInterpolator r13 = new android.view.animation.AccelerateDecelerateInterpolator
            r13.<init>()
            r12.setInterpolator(r13)
            com.bxkj.student.run.app.utils.SportTrailView$a r4 = new com.bxkj.student.run.app.utils.SportTrailView$a
            r5 = r10
            r7 = r11
            r9 = r14
            r4.<init>(r5, r6, r7, r8, r9)
            r12.addUpdateListener(r4)
            r12.start()
            return
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r8) {
            r7 = this;
            super.onDraw(r8)
            android.graphics.Path r0 = r7.j
            android.graphics.Paint r1 = r7.d
            r8.drawPath(r0, r1)
            android.graphics.Bitmap r0 = r7.f
            r1 = 0
            if (r0 == 0) goto L41
            android.graphics.Rect r2 = r7.g
            if (r2 == 0) goto L41
            int r0 = r0.getWidth()
            android.graphics.Bitmap r2 = r7.f
            int r2 = r2.getHeight()
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>()
            float[] r4 = r7.k
            r5 = 0
            r5 = r4[r5]
            float r0 = (float) r0
            float r6 = r5 - r0
            r3.left = r6
            float r5 = r5 + r0
            r3.right = r5
            r0 = 1
            r0 = r4[r0]
            float r2 = (float) r2
            float r4 = r0 - r2
            r3.top = r4
            float r0 = r0 + r2
            r3.bottom = r0
            android.graphics.Bitmap r0 = r7.f
            android.graphics.Paint r2 = r7.e
            r8.drawBitmap(r0, r1, r3, r2)
        L41:
            android.graphics.Bitmap r0 = r7.c
            if (r0 == 0) goto L7c
            android.graphics.Point r2 = r7.b
            if (r2 == 0) goto L7c
            android.graphics.Rect r2 = r7.g
            if (r2 != 0) goto L73
            int r0 = r0.getWidth()
            int r0 = r0 / 2
            android.graphics.Bitmap r2 = r7.c
            int r2 = r2.getHeight()
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r7.g = r3
            android.graphics.Point r4 = r7.b
            int r5 = r4.x
            int r6 = r5 - r0
            r3.left = r6
            int r5 = r5 + r0
            r3.right = r5
            int r0 = r4.y
            int r2 = r0 - r2
            r3.top = r2
            r3.bottom = r0
        L73:
            android.graphics.Bitmap r0 = r7.c
            android.graphics.Rect r2 = r7.g
            android.graphics.Paint r3 = r7.a
            r8.drawBitmap(r0, r1, r2, r3)
        L7c:
            return
    }
}
