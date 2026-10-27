package com.huawei.hms.scankit.drawable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class ScanDrawable extends android.graphics.drawable.Drawable implements android.graphics.drawable.Animatable {
    private static final android.view.animation.Interpolator A = null;
    private static final int[] x = null;
    private static final android.view.animation.Interpolator y = null;
    private static final android.view.animation.Interpolator z = null;
    private final android.animation.ValueAnimator a;
    private final android.animation.ValueAnimator b;
    private final android.graphics.Matrix c;
    private final android.graphics.Paint d;
    private final android.graphics.Paint e;
    private final android.graphics.ColorMatrix f;
    private final android.graphics.Matrix g;
    private final android.graphics.Rect h;
    private final android.graphics.Rect i;
    private final android.graphics.Rect j;
    private final android.graphics.Rect k;
    private int l;
    private int m;
    private float n;
    private boolean o;
    private float p;
    private int q;
    private com.huawei.hms.scankit.p.y5 r;
    private float s;
    private boolean t;
    private android.graphics.Bitmap u;
    private android.graphics.Bitmap v;
    private android.animation.AnimatorSet w;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.animation.ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ com.huawei.hms.scankit.drawable.ScanDrawable a;

        a(com.huawei.hms.scankit.drawable.ScanDrawable r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator r5) {
                r4 = this;
                com.huawei.hms.scankit.drawable.ScanDrawable r5 = r4.a
                android.animation.ValueAnimator r5 = com.huawei.hms.scankit.drawable.ScanDrawable.a(r5)
                java.lang.Object r5 = r5.getAnimatedValue()
                java.lang.Float r5 = (java.lang.Float) r5
                float r5 = r5.floatValue()
                com.huawei.hms.scankit.drawable.ScanDrawable r0 = r4.a
                android.graphics.Rect r1 = com.huawei.hms.scankit.drawable.ScanDrawable.b(r0)
                int r1 = r1.top
                com.huawei.hms.scankit.drawable.ScanDrawable r2 = r4.a
                android.graphics.Rect r2 = com.huawei.hms.scankit.drawable.ScanDrawable.b(r2)
                int r2 = r2.height()
                float r2 = (float) r2
                android.view.animation.Interpolator r3 = com.huawei.hms.scankit.drawable.ScanDrawable.a()
                float r3 = r3.getInterpolation(r5)
                float r2 = r2 * r3
                int r2 = (int) r2
                int r1 = r1 + r2
                com.huawei.hms.scankit.drawable.ScanDrawable.a(r0, r1)
                r0 = 1053240066(0x3ec72b02, float:0.389)
                int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r1 >= 0) goto L48
                com.huawei.hms.scankit.drawable.ScanDrawable r1 = r4.a
                android.view.animation.Interpolator r2 = com.huawei.hms.scankit.drawable.ScanDrawable.b()
                float r5 = r5 / r0
                float r5 = r2.getInterpolation(r5)
                com.huawei.hms.scankit.drawable.ScanDrawable.a(r1, r5)
                goto L5d
            L48:
                com.huawei.hms.scankit.drawable.ScanDrawable r1 = r4.a
                android.view.animation.Interpolator r2 = com.huawei.hms.scankit.drawable.ScanDrawable.c()
                float r5 = r5 - r0
                r0 = 1058826879(0x3f1c6a7f, float:0.611)
                float r5 = r5 / r0
                float r5 = r2.getInterpolation(r5)
                r0 = 1065353216(0x3f800000, float:1.0)
                float r0 = r0 - r5
                com.huawei.hms.scankit.drawable.ScanDrawable.a(r1, r0)
            L5d:
                com.huawei.hms.scankit.drawable.ScanDrawable r5 = r4.a
                r5.invalidateSelf()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends android.animation.AnimatorListenerAdapter {
        final /* synthetic */ com.huawei.hms.scankit.drawable.ScanDrawable a;

        b(com.huawei.hms.scankit.drawable.ScanDrawable r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(android.animation.Animator r2) {
                r1 = this;
                super.onAnimationRepeat(r2)
                com.huawei.hms.scankit.drawable.ScanDrawable r2 = r1.a
                boolean r0 = com.huawei.hms.scankit.drawable.ScanDrawable.c(r2)
                r0 = r0 ^ 1
                com.huawei.hms.scankit.drawable.ScanDrawable.a(r2, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends android.animation.AnimatorListenerAdapter {
        final /* synthetic */ com.huawei.hms.scankit.drawable.ScanDrawable a;

        c(com.huawei.hms.scankit.drawable.ScanDrawable r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(android.animation.Animator r4) {
                r3 = this;
                super.onAnimationRepeat(r4)
                com.huawei.hms.scankit.drawable.ScanDrawable r4 = r3.a
                android.animation.ValueAnimator r4 = com.huawei.hms.scankit.drawable.ScanDrawable.a(r4)
                java.lang.Object r4 = r4.getAnimatedValue()
                java.lang.Float r4 = (java.lang.Float) r4
                float r4 = r4.floatValue()
                r0 = 1056964608(0x3f000000, float:0.5)
                float r4 = r4 - r0
                float r4 = java.lang.Math.abs(r4)
                com.huawei.hms.scankit.drawable.ScanDrawable r1 = r3.a
                boolean r2 = com.huawei.hms.scankit.drawable.ScanDrawable.d(r1)
                r2 = r2 ^ 1
                com.huawei.hms.scankit.drawable.ScanDrawable.b(r1, r2)
                com.huawei.hms.scankit.drawable.ScanDrawable r1 = r3.a
                boolean r1 = com.huawei.hms.scankit.drawable.ScanDrawable.d(r1)
                if (r1 == 0) goto L44
                r1 = 1051931443(0x3eb33333, float:0.35)
                int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                if (r4 <= 0) goto L3b
                com.huawei.hms.scankit.drawable.ScanDrawable r4 = r3.a
                r0 = 0
                com.huawei.hms.scankit.drawable.ScanDrawable.b(r4, r0)
                return
            L3b:
                com.huawei.hms.scankit.drawable.ScanDrawable r4 = r3.a
                float r0 = com.huawei.hms.scankit.p.n6.a(r0)
                com.huawei.hms.scankit.drawable.ScanDrawable.b(r4, r0)
            L44:
                return
        }
    }

    static {
            r0 = 13625597(0xcfe8fd, float:1.9093528E-38)
            r1 = 357325(0x573cd, float:5.00719E-40)
            int[] r0 = new int[]{r0, r1}
            com.huawei.hms.scankit.drawable.ScanDrawable.x = r0
            com.huawei.hms.scankit.p.b1 r0 = new com.huawei.hms.scankit.p.b1
            r1 = 1053609165(0x3ecccccd, float:0.4)
            r2 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r1, r2, r1, r3)
            com.huawei.hms.scankit.drawable.ScanDrawable.y = r0
            com.huawei.hms.scankit.p.b1 r0 = new com.huawei.hms.scankit.p.b1
            r4 = 1060320051(0x3f333333, float:0.7)
            r0.<init>(r1, r2, r4, r3)
            com.huawei.hms.scankit.drawable.ScanDrawable.z = r0
            com.huawei.hms.scankit.p.b1 r0 = new com.huawei.hms.scankit.p.b1
            r4 = 1048576000(0x3e800000, float:0.25)
            r0.<init>(r4, r2, r1, r3)
            com.huawei.hms.scankit.drawable.ScanDrawable.A = r0
            return
    }

    public ScanDrawable() {
            r2 = this;
            r2.<init>()
            r0 = 2
            float[] r1 = new float[r0]
            r1 = {x0072: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            r2.a = r1
            float[] r0 = new float[r0]
            r0 = {x007a: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            r2.b = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r2.c = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r2.d = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r2.e = r0
            android.graphics.ColorMatrix r0 = new android.graphics.ColorMatrix
            r0.<init>()
            r2.f = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r2.g = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.h = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.i = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.j = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.k = r0
            r0 = 1056964608(0x3f000000, float:0.5)
            r2.n = r0
            r0 = 0
            r2.o = r0
            r0 = 0
            r2.p = r0
            r0 = 1
            r2.t = r0
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            r2.w = r0
            r2.d()
            return
    }

    public ScanDrawable(android.content.res.Resources r1) {
            r0 = this;
            r0.<init>()
            r0.a(r1)
            return
    }

    static /* synthetic */ float a(com.huawei.hms.scankit.drawable.ScanDrawable r0, float r1) {
            r0.p = r1
            return r1
    }

    static /* synthetic */ int a(com.huawei.hms.scankit.drawable.ScanDrawable r0, int r1) {
            r0.q = r1
            return r1
    }

    static /* synthetic */ android.animation.ValueAnimator a(com.huawei.hms.scankit.drawable.ScanDrawable r0) {
            android.animation.ValueAnimator r0 = r0.b
            return r0
    }

    static /* synthetic */ android.view.animation.Interpolator a() {
            android.view.animation.Interpolator r0 = com.huawei.hms.scankit.drawable.ScanDrawable.y
            return r0
    }

    private void a(android.content.res.Resources r9) {
            r8 = this;
            if (r9 != 0) goto L3
            return
        L3:
            int r0 = com.huawei.hms.scankit.R.drawable.scankit_scan_light
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeResource(r9, r0)
            int r1 = r0.getWidth()
            int r1 = r1 * 2
            int r2 = r0.getHeight()
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r1, r2, r3)
            r8.v = r1
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>()
            android.graphics.Bitmap r1 = r8.v
            r2.setBitmap(r1)
            android.graphics.Paint r7 = new android.graphics.Paint
            r7.<init>()
            android.graphics.BitmapShader r1 = new android.graphics.BitmapShader
            android.graphics.Shader$TileMode r3 = android.graphics.Shader.TileMode.MIRROR
            r1.<init>(r0, r3, r3)
            r7.setShader(r1)
            int r1 = r0.getWidth()
            int r1 = r1 * 2
            float r5 = (float) r1
            int r0 = r0.getHeight()
            int r0 = r0 * 2
            float r6 = (float) r0
            r3 = 0
            r4 = 0
            r2.drawRect(r3, r4, r5, r6, r7)
            int r0 = com.huawei.hms.scankit.R.drawable.scankit_scan_tail
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeResource(r9, r0)
            r8.u = r0
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r9 = r9.density
            r8.s = r9
            return
    }

    private void a(android.graphics.Canvas r10) {
            r9 = this;
            android.graphics.Bitmap r0 = r9.v
            if (r0 == 0) goto L105
            int r0 = r0.getWidth()
            if (r0 == 0) goto L105
            android.graphics.Bitmap r0 = r9.v
            int r0 = r0.getHeight()
            if (r0 == 0) goto L105
            float r0 = r9.p
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 * r1
            android.animation.ValueAnimator r1 = r9.a
            java.lang.Object r1 = r1.getAnimatedValue()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            float r2 = r9.n
            float r1 = r1 * r2
            float r0 = r0 + r1
            r1 = 1069547520(0x3fc00000, float:1.5)
            float r1 = r1 - r0
            r2 = 1028443341(0x3d4ccccd, float:0.05)
            float r1 = r1 * r2
            android.graphics.ColorMatrix r2 = r9.f
            r3 = 1065353216(0x3f800000, float:1.0)
            float r4 = r1 + r3
            r5 = 20
            float[] r5 = new float[r5]
            r6 = 0
            r5[r6] = r3
            r7 = 1
            r5[r7] = r1
            r7 = 2
            r5[r7] = r1
            r7 = 3
            r5[r7] = r1
            r7 = 4
            r8 = 0
            r5[r7] = r8
            r7 = 5
            r5[r7] = r1
            r7 = 6
            r5[r7] = r4
            r7 = 7
            r5[r7] = r1
            r7 = 8
            r5[r7] = r1
            r7 = 9
            r5[r7] = r8
            r7 = 10
            r5[r7] = r1
            r7 = 11
            r5[r7] = r1
            r7 = 12
            r5[r7] = r4
            r4 = 13
            r5[r4] = r1
            r1 = 14
            r5[r1] = r8
            r1 = 15
            r5[r1] = r8
            r1 = 16
            r5[r1] = r8
            r1 = 17
            r5[r1] = r8
            r1 = 18
            r5[r1] = r3
            r1 = 19
            r5[r1] = r8
            r2.set(r5)
            android.graphics.Paint r1 = r9.e
            android.graphics.ColorMatrixColorFilter r2 = new android.graphics.ColorMatrixColorFilter
            android.graphics.ColorMatrix r3 = r9.f
            r2.<init>(r3)
            r1.setColorFilter(r2)
            int r1 = r9.l
            float r1 = (float) r1
            r2 = 1045220557(0x3e4ccccd, float:0.2)
            float r0 = r0 * r2
            r2 = 1053609165(0x3ecccccd, float:0.4)
            float r0 = r0 + r2
            float r1 = r1 * r0
            int r0 = (int) r1
            boolean r1 = r9.o
            if (r1 == 0) goto Lb7
            int r1 = r9.q
            int r2 = r1 + r0
            int r1 = r1 - r0
            android.graphics.Rect r0 = r9.h
            android.graphics.Rect r3 = r9.getBounds()
            int r3 = r3.right
            r0.set(r6, r2, r3, r1)
            goto Lc7
        Lb7:
            int r1 = r9.q
            int r2 = r1 - r0
            int r1 = r1 + r0
            android.graphics.Rect r0 = r9.h
            android.graphics.Rect r3 = r9.getBounds()
            int r3 = r3.right
            r0.set(r6, r2, r3, r1)
        Lc7:
            android.graphics.Matrix r0 = r9.g
            android.graphics.Rect r1 = r9.h
            int r1 = r1.width()
            float r1 = (float) r1
            android.graphics.Bitmap r2 = r9.v
            int r2 = r2.getWidth()
            float r2 = (float) r2
            float r1 = r1 / r2
            android.graphics.Rect r2 = r9.h
            int r2 = r2.height()
            float r2 = (float) r2
            android.graphics.Bitmap r3 = r9.v
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r2 = r2 / r3
            r0.setScale(r1, r2)
            android.graphics.Matrix r0 = r9.g
            android.graphics.Rect r1 = r9.h
            int r2 = r1.left
            float r2 = (float) r2
            int r1 = r1.top
            float r1 = (float) r1
            r0.postTranslate(r2, r1)
            android.graphics.Bitmap r0 = r9.v
            android.graphics.Matrix r1 = r9.g
            android.graphics.Paint r2 = r9.e
            r10.drawBitmap(r0, r1, r2)
            android.graphics.Matrix r10 = r9.g
            r10.reset()
        L105:
            return
    }

    private void a(android.graphics.Canvas r5, android.graphics.Rect r6) {
            r4 = this;
            android.graphics.Bitmap r0 = r4.u
            if (r0 == 0) goto L4a
            int r0 = r0.getWidth()
            if (r0 == 0) goto L4a
            android.graphics.Bitmap r0 = r4.u
            int r0 = r0.getHeight()
            if (r0 == 0) goto L4a
            android.graphics.Matrix r0 = r4.c
            int r1 = r6.width()
            float r1 = (float) r1
            android.graphics.Bitmap r2 = r4.u
            int r2 = r2.getWidth()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.height()
            float r2 = (float) r2
            android.graphics.Bitmap r3 = r4.u
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r2 = r2 / r3
            r0.setScale(r1, r2)
            android.graphics.Matrix r0 = r4.c
            int r1 = r6.left
            float r1 = (float) r1
            int r6 = r6.top
            float r6 = (float) r6
            r0.postTranslate(r1, r6)
            android.graphics.Bitmap r6 = r4.u
            android.graphics.Matrix r0 = r4.c
            android.graphics.Paint r1 = r4.d
            r5.drawBitmap(r6, r0, r1)
            android.graphics.Matrix r5 = r4.c
            r5.reset()
        L4a:
            return
    }

    private void a(android.graphics.Rect r26) {
            r25 = this;
            r0 = r25
            r1 = r26
            int r2 = r1.height()
            if (r2 != 0) goto Lb
            return
        Lb:
            android.graphics.Rect r2 = r0.k
            r2.set(r1)
            android.graphics.Rect r2 = r0.k
            int r3 = r1.height()
            float r3 = (float) r3
            r4 = 1036831949(0x3dcccccd, float:0.1)
            float r3 = r3 * r4
            int r3 = (int) r3
            r4 = 0
            r2.inset(r4, r3)
            int r2 = r1.height()
            float r2 = (float) r2
            r3 = 1043878380(0x3e3851ec, float:0.18)
            float r2 = r2 * r3
            int r2 = (int) r2
            r0.l = r2
            int r2 = r1.height()
            float r2 = (float) r2
            r3 = 1052266988(0x3eb851ec, float:0.36)
            float r2 = r2 * r3
            int r2 = (int) r2
            r0.m = r2
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>(r1)
            int r1 = r1.width()
            float r1 = (float) r1
            r2 = 1045220557(0x3e4ccccd, float:0.2)
            float r1 = r1 * r2
            int r1 = (int) r1
            r7.inset(r1, r4)
            float r1 = r0.s
            r2 = 0
            r3 = 981668463(0x3a83126f, float:0.001)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 != 0) goto L59
            goto L5c
        L59:
            float r1 = r1 * r1
            float r3 = r3 / r1
        L5c:
            int r1 = r7.width()
            float r1 = (float) r1
            float r3 = r3 * r1
            int r1 = r7.height()
            float r1 = (float) r1
            float r3 = r3 * r1
            int r8 = (int) r3
            com.huawei.hms.scankit.p.b6 r1 = new com.huawei.hms.scankit.p.b6
            r2 = 500(0x1f4, double:2.47E-321)
            r1.<init>(r8, r2)
            r2 = 1051260355(0x3ea8f5c3, float:0.33)
            r3 = 1065353216(0x3f800000, float:1.0)
            com.huawei.hms.scankit.p.b6 r9 = r1.b(r2, r3)
            android.view.animation.LinearInterpolator r16 = new android.view.animation.LinearInterpolator
            r16.<init>()
            r12 = 0
            r14 = 100
            r10 = 0
            r11 = -1
            com.huawei.hms.scankit.p.b6 r17 = r9.a(r10, r11, r12, r14, r16)
            android.view.animation.LinearInterpolator r24 = new android.view.animation.LinearInterpolator
            r24.<init>()
            r20 = 400(0x190, double:1.976E-321)
            r22 = 500(0x1f4, double:2.47E-321)
            r18 = -1
            r19 = 0
            com.huawei.hms.scankit.p.b6 r6 = r17.a(r18, r19, r20, r22, r24)
            com.huawei.hms.scankit.p.y5 r5 = new com.huawei.hms.scankit.p.y5
            float r1 = r0.s
            r2 = 1073741824(0x40000000, float:2.0)
            float r9 = r1 * r2
            int[] r10 = com.huawei.hms.scankit.drawable.ScanDrawable.x
            r5.<init>(r6, r7, r8, r9, r10)
            r0.r = r5
            return
    }

    static /* synthetic */ boolean a(com.huawei.hms.scankit.drawable.ScanDrawable r0, boolean r1) {
            r0.o = r1
            return r1
    }

    static /* synthetic */ float b(com.huawei.hms.scankit.drawable.ScanDrawable r0, float r1) {
            r0.n = r1
            return r1
    }

    static /* synthetic */ android.graphics.Rect b(com.huawei.hms.scankit.drawable.ScanDrawable r0) {
            android.graphics.Rect r0 = r0.k
            return r0
    }

    static /* synthetic */ android.view.animation.Interpolator b() {
            android.view.animation.Interpolator r0 = com.huawei.hms.scankit.drawable.ScanDrawable.z
            return r0
    }

    private void b(android.graphics.Canvas r3) {
            r2 = this;
            com.huawei.hms.scankit.p.y5 r0 = r2.r
            if (r0 != 0) goto L5
            return
        L5:
            android.graphics.Rect r1 = r2.i
            r0.a(r3, r1)
            return
    }

    static /* synthetic */ boolean b(com.huawei.hms.scankit.drawable.ScanDrawable r0, boolean r1) {
            r0.t = r1
            return r1
    }

    static /* synthetic */ android.view.animation.Interpolator c() {
            android.view.animation.Interpolator r0 = com.huawei.hms.scankit.drawable.ScanDrawable.A
            return r0
    }

    static /* synthetic */ boolean c(com.huawei.hms.scankit.drawable.ScanDrawable r0) {
            boolean r0 = r0.o
            return r0
    }

    private void d() {
            r5 = this;
            r5.f()
            r5.e()
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            r5.w = r0
            android.animation.ValueAnimator r1 = r5.b
            android.animation.ValueAnimator r2 = r5.a
            r3 = 2
            android.animation.Animator[] r3 = new android.animation.Animator[r3]
            r4 = 0
            r3[r4] = r1
            r1 = 1
            r3[r1] = r2
            r0.playTogether(r3)
            return
    }

    static /* synthetic */ boolean d(com.huawei.hms.scankit.drawable.ScanDrawable r0) {
            boolean r0 = r0.t
            return r0
    }

    private void e() {
            r3 = this;
            android.animation.ValueAnimator r0 = r3.a
            android.view.animation.LinearInterpolator r1 = new android.view.animation.LinearInterpolator
            r1.<init>()
            r0.setInterpolator(r1)
            android.animation.ValueAnimator r0 = r3.a
            r1 = 2
            r0.setRepeatMode(r1)
            android.animation.ValueAnimator r0 = r3.a
            r1 = -1
            r0.setRepeatCount(r1)
            android.animation.ValueAnimator r0 = r3.a
            r1 = 500(0x1f4, double:2.47E-321)
            r0.setDuration(r1)
            android.animation.ValueAnimator r0 = r3.a
            r1 = 200(0xc8, double:9.9E-322)
            r0.setStartDelay(r1)
            android.animation.ValueAnimator r0 = r3.a
            com.huawei.hms.scankit.drawable.ScanDrawable$c r1 = new com.huawei.hms.scankit.drawable.ScanDrawable$c
            r1.<init>(r3)
            r0.addListener(r1)
            return
    }

    private void f() {
            r3 = this;
            android.animation.ValueAnimator r0 = r3.b
            r1 = 2000(0x7d0, double:9.88E-321)
            r0.setDuration(r1)
            android.animation.ValueAnimator r0 = r3.b
            android.view.animation.LinearInterpolator r1 = new android.view.animation.LinearInterpolator
            r1.<init>()
            r0.setInterpolator(r1)
            android.animation.ValueAnimator r0 = r3.b
            r1 = -1
            r0.setRepeatCount(r1)
            android.animation.ValueAnimator r0 = r3.b
            r1 = 2
            r0.setRepeatMode(r1)
            android.animation.ValueAnimator r0 = r3.b
            com.huawei.hms.scankit.drawable.ScanDrawable$a r1 = new com.huawei.hms.scankit.drawable.ScanDrawable$a
            r1.<init>(r3)
            r0.addUpdateListener(r1)
            android.animation.ValueAnimator r0 = r3.b
            com.huawei.hms.scankit.drawable.ScanDrawable$b r1 = new com.huawei.hms.scankit.drawable.ScanDrawable$b
            r1.<init>(r3)
            r0.addListener(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r6) {
            r5 = this;
            boolean r0 = r5.isRunning()
            if (r0 == 0) goto L79
            if (r6 == 0) goto L79
            boolean r0 = r5.o
            r1 = 1056964608(0x3f000000, float:0.5)
            r2 = 0
            if (r0 != 0) goto L40
            int r0 = r5.q
            int r3 = r5.m
            float r3 = (float) r3
            float r4 = r5.p
            float r3 = r3 * r4
            float r3 = r3 * r1
            int r1 = (int) r3
            int r1 = r0 - r1
            android.graphics.Rect r3 = r5.i
            android.graphics.Rect r4 = r5.getBounds()
            int r4 = r4.right
            r3.set(r2, r0, r4, r1)
            int r0 = r5.q
            int r1 = r5.m
            float r1 = (float) r1
            float r3 = r5.p
            float r1 = r1 * r3
            int r1 = (int) r1
            int r1 = r0 - r1
            android.graphics.Rect r3 = r5.j
            android.graphics.Rect r4 = r5.getBounds()
            int r4 = r4.right
            r3.set(r2, r0, r4, r1)
            goto L6e
        L40:
            int r0 = r5.q
            int r3 = r5.m
            float r3 = (float) r3
            float r4 = r5.p
            float r3 = r3 * r4
            float r3 = r3 * r1
            int r1 = (int) r3
            int r1 = r1 + r0
            android.graphics.Rect r3 = r5.i
            android.graphics.Rect r4 = r5.getBounds()
            int r4 = r4.right
            r3.set(r2, r0, r4, r1)
            int r0 = r5.q
            int r1 = r5.m
            float r1 = (float) r1
            float r3 = r5.p
            float r1 = r1 * r3
            int r1 = (int) r1
            int r1 = r1 + r0
            android.graphics.Rect r3 = r5.j
            android.graphics.Rect r4 = r5.getBounds()
            int r4 = r4.right
            r3.set(r2, r0, r4, r1)
        L6e:
            android.graphics.Rect r0 = r5.j
            r5.a(r6, r0)
            r5.b(r6)
            r5.a(r6)
        L79:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            r0 = -3
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(android.content.res.Resources r1, org.xmlpull.v1.XmlPullParser r2, android.util.AttributeSet r3, android.content.res.Resources.Theme r4) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
            r0 = this;
            if (r1 == 0) goto Lc
            if (r2 == 0) goto Lc
            if (r3 == 0) goto Lc
            r0.a(r1)
            super.inflate(r1, r2, r3, r4)
        Lc:
            return
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
            r1 = this;
            android.animation.AnimatorSet r0 = r1.w
            boolean r0 = r0.isRunning()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect r1) {
            r0 = this;
            if (r1 != 0) goto L3
            return
        L3:
            super.onBoundsChange(r1)
            r0.a(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r1) {
            r0 = this;
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r1) {
            r0 = this;
            return
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
            r1 = this;
            boolean r0 = r1.isRunning()
            if (r0 == 0) goto L7
            return
        L7:
            r0 = 0
            r1.o = r0
            r0 = 1
            r1.t = r0
            android.graphics.Rect r0 = r1.getBounds()
            r1.a(r0)
            android.animation.AnimatorSet r0 = r1.w
            r0.start()
            return
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
            r1 = this;
            boolean r0 = r1.isRunning()
            if (r0 == 0) goto Le
            android.animation.AnimatorSet r0 = r1.w
            r0.end()
            r0 = 0
            r1.r = r0
        Le:
            return
    }
}
