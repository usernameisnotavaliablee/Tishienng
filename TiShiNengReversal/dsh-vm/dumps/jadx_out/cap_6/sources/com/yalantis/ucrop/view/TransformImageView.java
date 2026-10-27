package com.yalantis.ucrop.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class TransformImageView extends android.widget.ImageView {
    private static final java.lang.String p = "TransformImageView";

    /* renamed from: q, reason: collision with root package name */
    private static final int f46q = 8;
    private static final int r = 2;
    private static final int s = 9;
    protected final float[] a;
    protected final float[] b;
    private final float[] c;
    protected android.graphics.Matrix d;
    protected int e;
    protected int f;
    protected com.yalantis.ucrop.view.TransformImageView.b g;
    private float[] h;
    private float[] i;
    protected boolean j;
    protected boolean k;
    private int l;
    private java.lang.String m;
    private java.lang.String n;
    private com.yalantis.ucrop.model.b o;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements e3.b {
        final /* synthetic */ com.yalantis.ucrop.view.TransformImageView a;

        a(com.yalantis.ucrop.view.TransformImageView r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // e3.b
        public void a(@androidx.annotation.NonNull android.graphics.Bitmap r2, @androidx.annotation.NonNull com.yalantis.ucrop.model.b r3, @androidx.annotation.NonNull java.lang.String r4, @androidx.annotation.Nullable java.lang.String r5) {
                r1 = this;
                com.yalantis.ucrop.view.TransformImageView r0 = r1.a
                com.yalantis.ucrop.view.TransformImageView.a(r0, r4)
                com.yalantis.ucrop.view.TransformImageView r4 = r1.a
                com.yalantis.ucrop.view.TransformImageView.b(r4, r5)
                com.yalantis.ucrop.view.TransformImageView r4 = r1.a
                com.yalantis.ucrop.view.TransformImageView.c(r4, r3)
                com.yalantis.ucrop.view.TransformImageView r3 = r1.a
                r4 = 1
                r3.j = r4
                r3.setImageBitmap(r2)
                return
        }

        @Override // e3.b
        public void onFailure(@androidx.annotation.NonNull java.lang.Exception r2) {
                r1 = this;
                com.yalantis.ucrop.view.TransformImageView r0 = r1.a
                com.yalantis.ucrop.view.TransformImageView$b r0 = r0.g
                if (r0 == 0) goto L9
                r0.b(r2)
            L9:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        void a();

        void b(@androidx.annotation.NonNull java.lang.Exception r1);

        void c(float r1);

        void d(float r1);
    }

    public TransformImageView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public TransformImageView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public TransformImageView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 8
            float[] r1 = new float[r1]
            r0.a = r1
            r1 = 2
            float[] r1 = new float[r1]
            r0.b = r1
            r1 = 9
            float[] r1 = new float[r1]
            r0.c = r1
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r0.d = r1
            r1 = 0
            r0.j = r1
            r0.k = r1
            r0.l = r1
            r0.g()
            return
    }

    static /* synthetic */ java.lang.String a(com.yalantis.ucrop.view.TransformImageView r0, java.lang.String r1) {
            r0.m = r1
            return r1
    }

    static /* synthetic */ java.lang.String b(com.yalantis.ucrop.view.TransformImageView r0, java.lang.String r1) {
            r0.n = r1
            return r1
    }

    static /* synthetic */ com.yalantis.ucrop.model.b c(com.yalantis.ucrop.view.TransformImageView r0, com.yalantis.ucrop.model.b r1) {
            r0.o = r1
            return r1
    }

    private void n() {
            r3 = this;
            android.graphics.Matrix r0 = r3.d
            float[] r1 = r3.a
            float[] r2 = r3.h
            r0.mapPoints(r1, r2)
            android.graphics.Matrix r0 = r3.d
            float[] r1 = r3.b
            float[] r2 = r3.i
            r0.mapPoints(r1, r2)
            return
    }

    public float d(@androidx.annotation.NonNull android.graphics.Matrix r5) {
            r4 = this;
            r0 = 1
            float r0 = r4.f(r5, r0)
            double r0 = (double) r0
            r2 = 0
            float r5 = r4.f(r5, r2)
            double r2 = (double) r5
            double r0 = java.lang.Math.atan2(r0, r2)
            r2 = 4633260481411531256(0x404ca5dc1a63c1f8, double:57.29577951308232)
            double r0 = r0 * r2
            double r0 = -r0
            float r5 = (float) r0
            return r5
    }

    public float e(@androidx.annotation.NonNull android.graphics.Matrix r7) {
            r6 = this;
            r0 = 0
            float r0 = r6.f(r7, r0)
            double r0 = (double) r0
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = java.lang.Math.pow(r0, r2)
            r4 = 3
            float r7 = r6.f(r7, r4)
            double r4 = (double) r7
            double r2 = java.lang.Math.pow(r4, r2)
            double r0 = r0 + r2
            double r0 = java.lang.Math.sqrt(r0)
            float r7 = (float) r0
            return r7
    }

    protected float f(@androidx.annotation.NonNull android.graphics.Matrix r2, @androidx.annotation.IntRange(from = 0, to = 9) int r3) {
            r1 = this;
            float[] r0 = r1.c
            r2.getValues(r0)
            float[] r2 = r1.c
            r2 = r2[r3]
            return r2
    }

    protected void g() {
            r1 = this;
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.MATRIX
            r1.setScaleType(r0)
            return
    }

    public float getCurrentAngle() {
            r1 = this;
            android.graphics.Matrix r0 = r1.d
            float r0 = r1.d(r0)
            return r0
    }

    public float getCurrentScale() {
            r1 = this;
            android.graphics.Matrix r0 = r1.d
            float r0 = r1.e(r0)
            return r0
    }

    public com.yalantis.ucrop.model.b getExifInfo() {
            r1 = this;
            com.yalantis.ucrop.model.b r0 = r1.o
            return r0
    }

    public java.lang.String getImageInputPath() {
            r1 = this;
            java.lang.String r0 = r1.m
            return r0
    }

    public java.lang.String getImageOutputPath() {
            r1 = this;
            java.lang.String r0 = r1.n
            return r0
    }

    public int getMaxBitmapSize() {
            r1 = this;
            int r0 = r1.l
            if (r0 > 0) goto Le
            android.content.Context r0 = r1.getContext()
            int r0 = com.yalantis.ucrop.util.a.b(r0)
            r1.l = r0
        Le:
            int r0 = r1.l
            return r0
    }

    @androidx.annotation.Nullable
    public android.graphics.Bitmap getViewBitmap() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.getDrawable()
            if (r0 == 0) goto L1a
            android.graphics.drawable.Drawable r0 = r1.getDrawable()
            boolean r0 = r0 instanceof com.yalantis.ucrop.util.d
            if (r0 != 0) goto Lf
            goto L1a
        Lf:
            android.graphics.drawable.Drawable r0 = r1.getDrawable()
            com.yalantis.ucrop.util.d r0 = (com.yalantis.ucrop.util.d) r0
            android.graphics.Bitmap r0 = r0.a()
            return r0
        L1a:
            r0 = 0
            return r0
    }

    protected void h() {
            r6 = this;
            android.graphics.drawable.Drawable r0 = r6.getDrawable()
            if (r0 != 0) goto L7
            goto L44
        L7:
            int r1 = r0.getIntrinsicWidth()
            float r1 = (float) r1
            int r0 = r0.getIntrinsicHeight()
            float r0 = (float) r0
            int r2 = (int) r1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = (int) r0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r2
            r2 = 1
            r4[r2] = r3
            java.lang.String r3 = "Image size: [%d:%d]"
            java.lang.String.format(r3, r4)
            android.graphics.RectF r3 = new android.graphics.RectF
            r4 = 0
            r3.<init>(r4, r4, r1, r0)
            float[] r0 = com.yalantis.ucrop.util.g.b(r3)
            r6.h = r0
            float[] r0 = com.yalantis.ucrop.util.g.a(r3)
            r6.i = r0
            r6.k = r2
            com.yalantis.ucrop.view.TransformImageView$b r0 = r6.g
            if (r0 == 0) goto L44
            r0.a()
        L44:
            return
    }

    public void i(float r2, float r3, float r4) {
            r1 = this;
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L1c
            android.graphics.Matrix r0 = r1.d
            r0.postRotate(r2, r3, r4)
            android.graphics.Matrix r2 = r1.d
            r1.setImageMatrix(r2)
            com.yalantis.ucrop.view.TransformImageView$b r2 = r1.g
            if (r2 == 0) goto L1c
            android.graphics.Matrix r3 = r1.d
            float r3 = r1.d(r3)
            r2.d(r3)
        L1c:
            return
    }

    public void j(float r2, float r3, float r4) {
            r1 = this;
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L1c
            android.graphics.Matrix r0 = r1.d
            r0.postScale(r2, r2, r3, r4)
            android.graphics.Matrix r2 = r1.d
            r1.setImageMatrix(r2)
            com.yalantis.ucrop.view.TransformImageView$b r2 = r1.g
            if (r2 == 0) goto L1c
            android.graphics.Matrix r3 = r1.d
            float r3 = r1.e(r3)
            r2.c(r3)
        L1c:
            return
    }

    public void k(float r3, float r4) {
            r2 = this;
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 != 0) goto Lb
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 == 0) goto La
            goto Lb
        La:
            return
        Lb:
            android.graphics.Matrix r0 = r2.d
            r0.postTranslate(r3, r4)
            android.graphics.Matrix r3 = r2.d
            r2.setImageMatrix(r3)
            return
    }

    protected void l(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull android.graphics.Matrix r2) {
            r0 = this;
            r1 = 2
            r0.f(r2, r1)
            r1 = 5
            r0.f(r2, r1)
            r0.e(r2)
            r0.d(r2)
            return
    }

    public void m(@androidx.annotation.NonNull android.net.Uri r7, @androidx.annotation.Nullable android.net.Uri r8) throws java.lang.Exception {
            r6 = this;
            int r3 = r6.getMaxBitmapSize()
            android.content.Context r0 = r6.getContext()
            com.yalantis.ucrop.view.TransformImageView$a r5 = new com.yalantis.ucrop.view.TransformImageView$a
            r5.<init>(r6)
            r4 = r3
            r1 = r7
            r2 = r8
            com.yalantis.ucrop.util.a.d(r0, r1, r2, r3, r4, r5)
            return
    }

    @Override // android.view.View
    protected void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            super.onLayout(r2, r3, r4, r5, r6)
            r3 = r2
            r2 = r1
            if (r3 != 0) goto L11
            boolean r3 = r2.j
            if (r3 == 0) goto L10
            boolean r3 = r2.k
            if (r3 != 0) goto L10
            goto L11
        L10:
            return
        L11:
            int r3 = r1.getPaddingLeft()
            int r4 = r1.getPaddingTop()
            int r5 = r1.getWidth()
            int r6 = r1.getPaddingRight()
            int r5 = r5 - r6
            int r6 = r1.getHeight()
            int r0 = r1.getPaddingBottom()
            int r6 = r6 - r0
            int r5 = r5 - r3
            r2.e = r5
            int r6 = r6 - r4
            r2.f = r6
            r1.h()
            return
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(android.graphics.Bitmap r2) {
            r1 = this;
            com.yalantis.ucrop.util.d r0 = new com.yalantis.ucrop.util.d
            r0.<init>(r2)
            r1.setImageDrawable(r0)
            return
    }

    @Override // android.widget.ImageView
    public void setImageMatrix(android.graphics.Matrix r2) {
            r1 = this;
            super.setImageMatrix(r2)
            android.graphics.Matrix r0 = r1.d
            r0.set(r2)
            r1.n()
            return
    }

    public void setMaxBitmapSize(int r1) {
            r0 = this;
            r0.l = r1
            return
    }

    @Override // android.widget.ImageView
    public void setScaleType(android.widget.ImageView.ScaleType r2) {
            r1 = this;
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.MATRIX
            if (r2 != r0) goto L7
            super.setScaleType(r2)
        L7:
            return
    }

    public void setTransformImageListener(com.yalantis.ucrop.view.TransformImageView.b r1) {
            r0 = this;
            r0.g = r1
            return
    }
}
