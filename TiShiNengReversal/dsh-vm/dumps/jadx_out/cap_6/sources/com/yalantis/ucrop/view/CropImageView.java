package com.yalantis.ucrop.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class CropImageView extends com.yalantis.ucrop.view.TransformImageView {
    public static final int F = 0;
    public static final int G = 500;
    public static final float H = 10.0f;
    public static final float I = 0.0f;
    public static final float J = 0.0f;
    private float A;
    private float B;
    private int C;
    private int D;
    private long E;
    private final android.graphics.RectF t;
    private final android.graphics.Matrix u;
    private float v;
    private float w;
    private e3.c x;
    private java.lang.Runnable y;
    private java.lang.Runnable z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a implements java.lang.Runnable {
        private final java.lang.ref.WeakReference<com.yalantis.ucrop.view.CropImageView> a;
        private final long b;
        private final long c;
        private final float d;
        private final float e;
        private final float f;
        private final float g;
        private final float h;
        private final float i;
        private final boolean j;

        public a(com.yalantis.ucrop.view.CropImageView r2, long r3, float r5, float r6, float r7, float r8, float r9, float r10, boolean r11) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.a = r0
                r1.b = r3
                long r2 = java.lang.System.currentTimeMillis()
                r1.c = r2
                r1.d = r5
                r1.e = r6
                r1.f = r7
                r1.g = r8
                r1.h = r9
                r1.i = r10
                r1.j = r11
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r8 = this;
                java.lang.ref.WeakReference<com.yalantis.ucrop.view.CropImageView> r0 = r8.a
                java.lang.Object r0 = r0.get()
                com.yalantis.ucrop.view.CropImageView r0 = (com.yalantis.ucrop.view.CropImageView) r0
                if (r0 != 0) goto Lb
                goto L72
            Lb:
                long r1 = java.lang.System.currentTimeMillis()
                long r3 = r8.b
                long r5 = r8.c
                long r1 = r1 - r5
                long r1 = java.lang.Math.min(r3, r1)
                float r1 = (float) r1
                float r2 = r8.f
                long r3 = r8.b
                float r3 = (float) r3
                r4 = 0
                float r2 = com.yalantis.ucrop.util.b.c(r1, r4, r2, r3)
                float r3 = r8.g
                long r5 = r8.b
                float r5 = (float) r5
                float r3 = com.yalantis.ucrop.util.b.c(r1, r4, r3, r5)
                float r5 = r8.i
                long r6 = r8.b
                float r6 = (float) r6
                float r4 = com.yalantis.ucrop.util.b.b(r1, r4, r5, r6)
                long r5 = r8.b
                float r5 = (float) r5
                int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r1 >= 0) goto L72
                float[] r1 = r0.b
                r5 = 0
                r5 = r1[r5]
                float r6 = r8.d
                float r5 = r5 - r6
                float r2 = r2 - r5
                r5 = 1
                r1 = r1[r5]
                float r5 = r8.e
                float r1 = r1 - r5
                float r3 = r3 - r1
                r0.k(r2, r3)
                boolean r1 = r8.j
                if (r1 != 0) goto L69
                float r1 = r8.h
                float r1 = r1 + r4
                android.graphics.RectF r2 = com.yalantis.ucrop.view.CropImageView.o(r0)
                float r2 = r2.centerX()
                android.graphics.RectF r3 = com.yalantis.ucrop.view.CropImageView.o(r0)
                float r3 = r3.centerY()
                r0.C(r1, r2, r3)
            L69:
                boolean r1 = r0.u()
                if (r1 != 0) goto L72
                r0.post(r8)
            L72:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class b implements java.lang.Runnable {
        private final java.lang.ref.WeakReference<com.yalantis.ucrop.view.CropImageView> a;
        private final long b;
        private final long c;
        private final float d;
        private final float e;
        private final float f;
        private final float g;

        public b(com.yalantis.ucrop.view.CropImageView r3, long r4, float r6, float r7, float r8, float r9) {
                r2 = this;
                r2.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r3)
                r2.a = r0
                long r0 = java.lang.System.currentTimeMillis()
                r2.c = r0
                r2.b = r4
                r2.d = r6
                r2.e = r7
                r2.f = r8
                r2.g = r9
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r7 = this;
                java.lang.ref.WeakReference<com.yalantis.ucrop.view.CropImageView> r0 = r7.a
                java.lang.Object r0 = r0.get()
                com.yalantis.ucrop.view.CropImageView r0 = (com.yalantis.ucrop.view.CropImageView) r0
                if (r0 != 0) goto Lb
                return
            Lb:
                long r1 = java.lang.System.currentTimeMillis()
                long r3 = r7.b
                long r5 = r7.c
                long r1 = r1 - r5
                long r1 = java.lang.Math.min(r3, r1)
                float r1 = (float) r1
                float r2 = r7.e
                long r3 = r7.b
                float r3 = (float) r3
                r4 = 0
                float r2 = com.yalantis.ucrop.util.b.b(r1, r4, r2, r3)
                long r3 = r7.b
                float r3 = (float) r3
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 >= 0) goto L38
                float r1 = r7.d
                float r1 = r1 + r2
                float r2 = r7.f
                float r3 = r7.g
                r0.C(r1, r2, r3)
                r0.post(r7)
                return
            L38:
                r0.y()
                return
        }
    }

    public CropImageView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public CropImageView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public CropImageView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.t = r1
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r0.u = r1
            r1 = 1092616192(0x41200000, float:10.0)
            r0.w = r1
            r1 = 0
            r0.z = r1
            r1 = 0
            r0.C = r1
            r0.D = r1
            r1 = 500(0x1f4, double:2.47E-321)
            r0.E = r1
            return
    }

    static /* synthetic */ android.graphics.RectF o(com.yalantis.ucrop.view.CropImageView r0) {
            android.graphics.RectF r0 = r0.t
            return r0
    }

    private float[] p() {
            r6 = this;
            android.graphics.Matrix r0 = r6.u
            r0.reset()
            android.graphics.Matrix r0 = r6.u
            float r1 = r6.getCurrentAngle()
            float r1 = -r1
            r0.setRotate(r1)
            float[] r0 = r6.a
            int r1 = r0.length
            float[] r0 = java.util.Arrays.copyOf(r0, r1)
            android.graphics.RectF r1 = r6.t
            float[] r1 = com.yalantis.ucrop.util.g.b(r1)
            android.graphics.Matrix r2 = r6.u
            r2.mapPoints(r0)
            android.graphics.Matrix r2 = r6.u
            r2.mapPoints(r1)
            android.graphics.RectF r0 = com.yalantis.ucrop.util.g.d(r0)
            android.graphics.RectF r1 = com.yalantis.ucrop.util.g.d(r1)
            float r2 = r0.left
            float r3 = r1.left
            float r2 = r2 - r3
            float r3 = r0.top
            float r4 = r1.top
            float r3 = r3 - r4
            float r4 = r0.right
            float r5 = r1.right
            float r4 = r4 - r5
            float r0 = r0.bottom
            float r1 = r1.bottom
            float r0 = r0 - r1
            r1 = 0
            int r5 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r5 <= 0) goto L48
            goto L49
        L48:
            r2 = 0
        L49:
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 <= 0) goto L4e
            goto L4f
        L4e:
            r3 = 0
        L4f:
            int r5 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r5 >= 0) goto L54
            goto L55
        L54:
            r4 = 0
        L55:
            int r5 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r5 >= 0) goto L5a
            goto L5b
        L5a:
            r0 = 0
        L5b:
            r1 = 4
            float[] r1 = new float[r1]
            r5 = 0
            r1[r5] = r2
            r2 = 1
            r1[r2] = r3
            r2 = 2
            r1[r2] = r4
            r2 = 3
            r1[r2] = r0
            android.graphics.Matrix r0 = r6.u
            r0.reset()
            android.graphics.Matrix r0 = r6.u
            float r2 = r6.getCurrentAngle()
            r0.setRotate(r2)
            android.graphics.Matrix r0 = r6.u
            r0.mapPoints(r1)
            return r1
    }

    private void q() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.getDrawable()
            if (r0 != 0) goto L7
            return
        L7:
            int r1 = r0.getIntrinsicWidth()
            float r1 = (float) r1
            int r0 = r0.getIntrinsicHeight()
            float r0 = (float) r0
            r2.r(r1, r0)
            return
    }

    private void r(float r3, float r4) {
            r2 = this;
            android.graphics.RectF r0 = r2.t
            float r0 = r0.width()
            float r0 = r0 / r3
            android.graphics.RectF r1 = r2.t
            float r1 = r1.width()
            float r1 = r1 / r4
            float r0 = java.lang.Math.min(r0, r1)
            android.graphics.RectF r1 = r2.t
            float r1 = r1.height()
            float r1 = r1 / r4
            android.graphics.RectF r4 = r2.t
            float r4 = r4.height()
            float r4 = r4 / r3
            float r3 = java.lang.Math.min(r1, r4)
            float r3 = java.lang.Math.min(r0, r3)
            r2.B = r3
            float r4 = r2.w
            float r3 = r3 * r4
            r2.A = r3
            return
    }

    private void z(float r6, float r7) {
            r5 = this;
            android.graphics.RectF r0 = r5.t
            float r0 = r0.width()
            android.graphics.RectF r1 = r5.t
            float r1 = r1.height()
            android.graphics.RectF r2 = r5.t
            float r2 = r2.width()
            float r2 = r2 / r6
            android.graphics.RectF r3 = r5.t
            float r3 = r3.height()
            float r3 = r3 / r7
            float r2 = java.lang.Math.max(r2, r3)
            float r6 = r6 * r2
            float r0 = r0 - r6
            r6 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r6
            android.graphics.RectF r3 = r5.t
            float r4 = r3.left
            float r0 = r0 + r4
            float r7 = r7 * r2
            float r1 = r1 - r7
            float r1 = r1 / r6
            float r6 = r3.top
            float r1 = r1 + r6
            android.graphics.Matrix r6 = r5.d
            r6.reset()
            android.graphics.Matrix r6 = r5.d
            r6.postScale(r2, r2)
            android.graphics.Matrix r6 = r5.d
            r6.postTranslate(r0, r1)
            android.graphics.Matrix r6 = r5.d
            r5.setImageMatrix(r6)
            return
    }

    protected void A(float r9, float r10, float r11, long r12) {
            r8 = this;
            float r0 = r8.getMaxScale()
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto Lc
            float r9 = r8.getMaxScale()
        Lc:
            float r4 = r8.getCurrentScale()
            float r5 = r9 - r4
            com.yalantis.ucrop.view.CropImageView$b r0 = new com.yalantis.ucrop.view.CropImageView$b
            r1 = r8
            r6 = r10
            r7 = r11
            r2 = r12
            r0.<init>(r1, r2, r4, r5, r6, r7)
            r1.z = r0
            r8.post(r0)
            return
    }

    public void B(float r3) {
            r2 = this;
            android.graphics.RectF r0 = r2.t
            float r0 = r0.centerX()
            android.graphics.RectF r1 = r2.t
            float r1 = r1.centerY()
            r2.C(r3, r0, r1)
            return
    }

    public void C(float r2, float r3, float r4) {
            r1 = this;
            float r0 = r1.getMaxScale()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L10
            float r0 = r1.getCurrentScale()
            float r2 = r2 / r0
            r1.j(r2, r3, r4)
        L10:
            return
    }

    public void D(float r3) {
            r2 = this;
            android.graphics.RectF r0 = r2.t
            float r0 = r0.centerX()
            android.graphics.RectF r1 = r2.t
            float r1 = r1.centerY()
            r2.E(r3, r0, r1)
            return
    }

    public void E(float r2, float r3, float r4) {
            r1 = this;
            float r0 = r1.getMinScale()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L10
            float r0 = r1.getCurrentScale()
            float r2 = r2 / r0
            r1.j(r2, r3, r4)
        L10:
            return
    }

    @androidx.annotation.Nullable
    public e3.c getCropBoundsChangeListener() {
            r1 = this;
            e3.c r0 = r1.x
            return r0
    }

    public float getMaxScale() {
            r1 = this;
            float r0 = r1.A
            return r0
    }

    public float getMinScale() {
            r1 = this;
            float r0 = r1.B
            return r0
    }

    public float getTargetAspectRatio() {
            r1 = this;
            float r0 = r1.v
            return r0
    }

    @Override // com.yalantis.ucrop.view.TransformImageView
    protected void h() {
            r8 = this;
            super.h()
            android.graphics.drawable.Drawable r0 = r8.getDrawable()
            if (r0 != 0) goto La
            goto L6a
        La:
            int r1 = r0.getIntrinsicWidth()
            float r1 = (float) r1
            int r0 = r0.getIntrinsicHeight()
            float r0 = (float) r0
            float r2 = r8.v
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L1f
            float r2 = r1 / r0
            r8.v = r2
        L1f:
            int r2 = r8.e
            float r4 = (float) r2
            float r5 = r8.v
            float r4 = r4 / r5
            int r4 = (int) r4
            int r6 = r8.f
            if (r4 <= r6) goto L3b
            float r4 = (float) r6
            float r4 = r4 * r5
            int r4 = (int) r4
            int r2 = r2 - r4
            int r2 = r2 / 2
            android.graphics.RectF r5 = r8.t
            float r7 = (float) r2
            int r4 = r4 + r2
            float r2 = (float) r4
            float r4 = (float) r6
            r5.set(r7, r3, r2, r4)
            goto L47
        L3b:
            int r6 = r6 - r4
            int r6 = r6 / 2
            android.graphics.RectF r5 = r8.t
            float r7 = (float) r6
            float r2 = (float) r2
            int r4 = r4 + r6
            float r4 = (float) r4
            r5.set(r3, r7, r2, r4)
        L47:
            r8.r(r1, r0)
            r8.z(r1, r0)
            e3.c r0 = r8.x
            if (r0 == 0) goto L56
            float r1 = r8.v
            r0.a(r1)
        L56:
            com.yalantis.ucrop.view.TransformImageView$b r0 = r8.g
            if (r0 == 0) goto L6a
            float r1 = r8.getCurrentScale()
            r0.c(r1)
            com.yalantis.ucrop.view.TransformImageView$b r0 = r8.g
            float r1 = r8.getCurrentAngle()
            r0.d(r1)
        L6a:
            return
    }

    @Override // com.yalantis.ucrop.view.TransformImageView
    public void j(float r4, float r5, float r6) {
            r3 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r1 <= 0) goto L18
            float r1 = r3.getCurrentScale()
            float r1 = r1 * r4
            float r2 = r3.getMaxScale()
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L18
            super.j(r4, r5, r6)
            return
        L18:
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L2d
            float r0 = r3.getCurrentScale()
            float r0 = r0 * r4
            float r1 = r3.getMinScale()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L2d
            super.j(r4, r5, r6)
        L2d:
            return
    }

    public void s() {
            r1 = this;
            java.lang.Runnable r0 = r1.y
            r1.removeCallbacks(r0)
            java.lang.Runnable r0 = r1.z
            r1.removeCallbacks(r0)
            return
    }

    public void setCropBoundsChangeListener(@androidx.annotation.Nullable e3.c r1) {
            r0 = this;
            r0.x = r1
            return
    }

    public void setCropRect(android.graphics.RectF r6) {
            r5 = this;
            float r0 = r6.width()
            float r1 = r6.height()
            float r0 = r0 / r1
            r5.v = r0
            android.graphics.RectF r0 = r5.t
            float r1 = r6.left
            int r2 = r5.getPaddingLeft()
            float r2 = (float) r2
            float r1 = r1 - r2
            float r2 = r6.top
            int r3 = r5.getPaddingTop()
            float r3 = (float) r3
            float r2 = r2 - r3
            float r3 = r6.right
            int r4 = r5.getPaddingRight()
            float r4 = (float) r4
            float r3 = r3 - r4
            float r6 = r6.bottom
            int r4 = r5.getPaddingBottom()
            float r4 = (float) r4
            float r6 = r6 - r4
            r0.set(r1, r2, r3, r6)
            r5.q()
            r5.y()
            return
    }

    public void setImageToWrapCropBounds(boolean r14) {
            r13 = this;
            boolean r0 = r13.k
            if (r0 == 0) goto Lb6
            boolean r0 = r13.u()
            if (r0 != 0) goto Lb6
            float[] r0 = r13.b
            r1 = 0
            r6 = r0[r1]
            r2 = 1
            r7 = r0[r2]
            float r10 = r13.getCurrentScale()
            android.graphics.RectF r0 = r13.t
            float r0 = r0.centerX()
            float r0 = r0 - r6
            android.graphics.RectF r3 = r13.t
            float r3 = r3.centerY()
            float r3 = r3 - r7
            android.graphics.Matrix r4 = r13.u
            r4.reset()
            android.graphics.Matrix r4 = r13.u
            r4.setTranslate(r0, r3)
            float[] r4 = r13.a
            int r5 = r4.length
            float[] r4 = java.util.Arrays.copyOf(r4, r5)
            android.graphics.Matrix r5 = r13.u
            r5.mapPoints(r4)
            boolean r12 = r13.v(r4)
            if (r12 == 0) goto L57
            float[] r0 = r13.p()
            r1 = r0[r1]
            r3 = 2
            r3 = r0[r3]
            float r1 = r1 + r3
            float r1 = -r1
            r2 = r0[r2]
            r3 = 3
            r0 = r0[r3]
            float r2 = r2 + r0
            float r3 = -r2
            r0 = 0
            r8 = r1
            r11 = 0
        L55:
            r9 = r3
            goto L8f
        L57:
            android.graphics.RectF r4 = new android.graphics.RectF
            android.graphics.RectF r5 = r13.t
            r4.<init>(r5)
            android.graphics.Matrix r5 = r13.u
            r5.reset()
            android.graphics.Matrix r5 = r13.u
            float r8 = r13.getCurrentAngle()
            r5.setRotate(r8)
            android.graphics.Matrix r5 = r13.u
            r5.mapRect(r4)
            float[] r5 = r13.a
            float[] r5 = com.yalantis.ucrop.util.g.c(r5)
            float r8 = r4.width()
            r1 = r5[r1]
            float r8 = r8 / r1
            float r1 = r4.height()
            r2 = r5[r2]
            float r1 = r1 / r2
            float r1 = java.lang.Math.max(r8, r1)
            float r1 = r1 * r10
            float r1 = r1 - r10
            r8 = r0
            r11 = r1
            goto L55
        L8f:
            if (r14 == 0) goto L9f
            com.yalantis.ucrop.view.CropImageView$a r2 = new com.yalantis.ucrop.view.CropImageView$a
            long r4 = r13.E
            r3 = r13
            r2.<init>(r3, r4, r6, r7, r8, r9, r10, r11, r12)
            r3.y = r2
            r13.post(r2)
            return
        L9f:
            r3 = r13
            r13.k(r8, r9)
            if (r12 != 0) goto Lb7
            float r10 = r10 + r11
            android.graphics.RectF r14 = r3.t
            float r14 = r14.centerX()
            android.graphics.RectF r0 = r3.t
            float r0 = r0.centerY()
            r13.C(r10, r14, r0)
            return
        Lb6:
            r3 = r13
        Lb7:
            return
    }

    public void setImageToWrapCropBoundsAnimDuration(@androidx.annotation.IntRange(from = 100) long r4) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L9
            r3.E = r4
            return
        L9:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Animation duration cannot be negative value."
            r4.<init>(r5)
            throw r4
    }

    public void setMaxResultImageSizeX(@androidx.annotation.IntRange(from = 10) int r1) {
            r0 = this;
            r0.C = r1
            return
    }

    public void setMaxResultImageSizeY(@androidx.annotation.IntRange(from = 10) int r1) {
            r0 = this;
            r0.D = r1
            return
    }

    public void setMaxScaleMultiplier(float r1) {
            r0 = this;
            r0.w = r1
            return
    }

    public void setTargetAspectRatio(float r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.getDrawable()
            if (r0 != 0) goto L9
            r2.v = r3
            return
        L9:
            r1 = 0
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L1c
            int r3 = r0.getIntrinsicWidth()
            float r3 = (float) r3
            int r0 = r0.getIntrinsicHeight()
            float r0 = (float) r0
            float r3 = r3 / r0
            r2.v = r3
            goto L1e
        L1c:
            r2.v = r3
        L1e:
            e3.c r3 = r2.x
            if (r3 == 0) goto L27
            float r0 = r2.v
            r3.a(r0)
        L27:
            return
    }

    public void t(@androidx.annotation.NonNull android.graphics.Bitmap.CompressFormat r15, int r16, @androidx.annotation.Nullable e3.a r17) {
            r14 = this;
            r14.s()
            r0 = 0
            r14.setImageToWrapCropBounds(r0)
            com.yalantis.ucrop.model.c r4 = new com.yalantis.ucrop.model.c
            android.graphics.RectF r1 = r14.t
            float[] r2 = r14.a
            android.graphics.RectF r2 = com.yalantis.ucrop.util.g.d(r2)
            float r3 = r14.getCurrentScale()
            float r5 = r14.getCurrentAngle()
            r4.<init>(r1, r2, r3, r5)
            com.yalantis.ucrop.model.a r5 = new com.yalantis.ucrop.model.a
            int r7 = r14.C
            int r8 = r14.D
            java.lang.String r11 = r14.getImageInputPath()
            java.lang.String r12 = r14.getImageOutputPath()
            com.yalantis.ucrop.model.b r13 = r14.getExifInfo()
            r9 = r15
            r10 = r16
            r6 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            com.yalantis.ucrop.task.a r1 = new com.yalantis.ucrop.task.a
            android.content.Context r2 = r14.getContext()
            android.graphics.Bitmap r3 = r14.getViewBitmap()
            r6 = r17
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.Void[] r15 = new java.lang.Void[r0]
            r1.execute(r15)
            return
    }

    protected boolean u() {
            r1 = this;
            float[] r0 = r1.a
            boolean r0 = r1.v(r0)
            return r0
    }

    protected boolean v(float[] r3) {
            r2 = this;
            android.graphics.Matrix r0 = r2.u
            r0.reset()
            android.graphics.Matrix r0 = r2.u
            float r1 = r2.getCurrentAngle()
            float r1 = -r1
            r0.setRotate(r1)
            int r0 = r3.length
            float[] r3 = java.util.Arrays.copyOf(r3, r0)
            android.graphics.Matrix r0 = r2.u
            r0.mapPoints(r3)
            android.graphics.RectF r0 = r2.t
            float[] r0 = com.yalantis.ucrop.util.g.b(r0)
            android.graphics.Matrix r1 = r2.u
            r1.mapPoints(r0)
            android.graphics.RectF r3 = com.yalantis.ucrop.util.g.d(r3)
            android.graphics.RectF r0 = com.yalantis.ucrop.util.g.d(r0)
            boolean r3 = r3.contains(r0)
            return r3
    }

    public void w(float r3) {
            r2 = this;
            android.graphics.RectF r0 = r2.t
            float r0 = r0.centerX()
            android.graphics.RectF r1 = r2.t
            float r1 = r1.centerY()
            r2.i(r3, r0, r1)
            return
    }

    protected void x(@androidx.annotation.NonNull android.content.res.TypedArray r4) {
            r3 = this;
            int r0 = com.yalantis.ucrop.R.styleable.ucrop_UCropView_ucrop_aspect_ratio_x
            r1 = 0
            float r0 = r4.getFloat(r0, r1)
            float r0 = java.lang.Math.abs(r0)
            int r2 = com.yalantis.ucrop.R.styleable.ucrop_UCropView_ucrop_aspect_ratio_y
            float r4 = r4.getFloat(r2, r1)
            float r4 = java.lang.Math.abs(r4)
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 == 0) goto L22
            int r2 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r2 != 0) goto L1e
            goto L22
        L1e:
            float r0 = r0 / r4
            r3.v = r0
            return
        L22:
            r3.v = r1
            return
    }

    public void y() {
            r1 = this;
            r0 = 1
            r1.setImageToWrapCropBounds(r0)
            return
    }
}
