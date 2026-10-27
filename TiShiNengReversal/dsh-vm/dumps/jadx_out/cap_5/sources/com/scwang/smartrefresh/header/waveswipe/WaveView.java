package com.scwang.smartrefresh.header.waveswipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class WaveView extends android.view.View implements android.view.ViewTreeObserver.OnPreDrawListener {
    private static final int A = -1728053248;
    private static final float[][] B = null;
    private static final float[][] C = null;
    private static final float[][] D = null;
    private static final long u = 500;
    private static final long v = 500;
    private static final long w = 500;
    private static final int x = 200;
    private static final int y = 1000;
    private static final float z = 0.2f;
    private float a;
    private android.graphics.Paint b;
    private android.graphics.Path c;
    private android.graphics.Path d;
    private android.graphics.Path e;
    private android.graphics.Path f;
    private android.graphics.RectF g;
    private int h;
    private float i;
    private int j;
    private boolean k;
    private boolean l;
    private int m;
    private android.animation.ValueAnimator n;
    private android.animation.ValueAnimator o;
    private android.animation.ValueAnimator p;
    private android.animation.ValueAnimator q;
    private android.animation.ValueAnimator r;
    private android.animation.ValueAnimator s;
    private android.animation.ValueAnimator.AnimatorUpdateListener t;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.animation.ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ com.scwang.smartrefresh.header.waveswipe.WaveView a;

        a(com.scwang.smartrefresh.header.waveswipe.WaveView r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator r1) {
                r0 = this;
                com.scwang.smartrefresh.header.waveswipe.WaveView r1 = r0.a
                r1.postInvalidate()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements android.animation.ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ com.scwang.smartrefresh.header.waveswipe.WaveView a;

        b(com.scwang.smartrefresh.header.waveswipe.WaveView r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator r2) {
                r1 = this;
                com.scwang.smartrefresh.header.waveswipe.WaveView r0 = r1.a
                java.lang.Object r2 = r2.getAnimatedValue()
                java.lang.Float r2 = (java.lang.Float) r2
                float r2 = r2.floatValue()
                com.scwang.smartrefresh.header.waveswipe.WaveView.a(r0, r2)
                com.scwang.smartrefresh.header.waveswipe.WaveView r2 = r1.a
                r2.postInvalidateOnAnimation()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements android.animation.Animator.AnimatorListener {
        final /* synthetic */ com.scwang.smartrefresh.header.waveswipe.WaveView a;

        c(com.scwang.smartrefresh.header.waveswipe.WaveView r1) {
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
        public void onAnimationEnd(android.animation.Animator r2) {
                r1 = this;
                com.scwang.smartrefresh.header.waveswipe.WaveView r2 = r1.a
                com.scwang.smartrefresh.header.waveswipe.WaveView.b(r2)
                com.scwang.smartrefresh.header.waveswipe.WaveView r2 = r1.a
                r0 = 0
                com.scwang.smartrefresh.header.waveswipe.WaveView.c(r2, r0)
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
    class d implements android.animation.ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ com.scwang.smartrefresh.header.waveswipe.WaveView a;

        d(com.scwang.smartrefresh.header.waveswipe.WaveView r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator r7) {
                r6 = this;
                java.lang.Object r7 = r7.getAnimatedValue()
                java.lang.Float r7 = (java.lang.Float) r7
                float r7 = r7.floatValue()
                com.scwang.smartrefresh.header.waveswipe.WaveView r0 = r6.a
                android.graphics.Path r0 = com.scwang.smartrefresh.header.waveswipe.WaveView.d(r0)
                r1 = 0
                r0.moveTo(r1, r1)
                com.scwang.smartrefresh.header.waveswipe.WaveView r0 = r6.a
                android.graphics.Path r0 = com.scwang.smartrefresh.header.waveswipe.WaveView.d(r0)
                com.scwang.smartrefresh.header.waveswipe.WaveView r2 = r6.a
                int r2 = com.scwang.smartrefresh.header.waveswipe.WaveView.e(r2)
                float r2 = (float) r2
                r3 = 1048576000(0x3e800000, float:0.25)
                float r2 = r2 * r3
                com.scwang.smartrefresh.header.waveswipe.WaveView r3 = r6.a
                int r3 = com.scwang.smartrefresh.header.waveswipe.WaveView.e(r3)
                float r3 = (float) r3
                r4 = 1051361018(0x3eaa7efa, float:0.333)
                float r3 = r3 * r4
                r4 = 1056964608(0x3f000000, float:0.5)
                float r5 = r7 * r4
                r0.quadTo(r2, r1, r3, r5)
                com.scwang.smartrefresh.header.waveswipe.WaveView r0 = r6.a
                android.graphics.Path r0 = com.scwang.smartrefresh.header.waveswipe.WaveView.d(r0)
                com.scwang.smartrefresh.header.waveswipe.WaveView r2 = r6.a
                int r2 = com.scwang.smartrefresh.header.waveswipe.WaveView.e(r2)
                float r2 = (float) r2
                float r2 = r2 * r4
                r3 = 1068708659(0x3fb33333, float:1.4)
                float r7 = r7 * r3
                com.scwang.smartrefresh.header.waveswipe.WaveView r3 = r6.a
                int r3 = com.scwang.smartrefresh.header.waveswipe.WaveView.e(r3)
                float r3 = (float) r3
                r4 = 1059749626(0x3f2a7efa, float:0.666)
                float r3 = r3 * r4
                r0.quadTo(r2, r7, r3, r5)
                com.scwang.smartrefresh.header.waveswipe.WaveView r7 = r6.a
                android.graphics.Path r7 = com.scwang.smartrefresh.header.waveswipe.WaveView.d(r7)
                com.scwang.smartrefresh.header.waveswipe.WaveView r0 = r6.a
                int r0 = com.scwang.smartrefresh.header.waveswipe.WaveView.e(r0)
                float r0 = (float) r0
                r2 = 1061158912(0x3f400000, float:0.75)
                float r0 = r0 * r2
                com.scwang.smartrefresh.header.waveswipe.WaveView r2 = r6.a
                int r2 = com.scwang.smartrefresh.header.waveswipe.WaveView.e(r2)
                float r2 = (float) r2
                r7.quadTo(r0, r1, r2, r1)
                com.scwang.smartrefresh.header.waveswipe.WaveView r7 = r6.a
                r7.postInvalidate()
                return
        }
    }

    static {
            r0 = 2
            float[] r1 = new float[r0]
            r1 = {x0092: FILL_ARRAY_DATA , data: [1042905301, 0} // fill-array
            float[] r2 = new float[r0]
            r2 = {x009a: FILL_ARRAY_DATA , data: [1054239988, -1137535510} // fill-array
            float[] r3 = new float[r0]
            r3 = {x00a2: FILL_ARRAY_DATA , data: [1055642563, -1147105234} // fill-array
            float[] r4 = new float[r0]
            r4 = {x00aa: FILL_ARRAY_DATA , data: [1056605576, 0} // fill-array
            float[] r5 = new float[r0]
            r5 = {x00b2: FILL_ARRAY_DATA , data: [1056605576, 0} // fill-array
            float[] r6 = new float[r0]
            r6 = {x00ba: FILL_ARRAY_DATA , data: [1056964608, 0} // fill-array
            r7 = 6
            float[][] r8 = new float[r7][]
            r9 = 0
            r8[r9] = r1
            r1 = 1
            r8[r1] = r2
            r8[r0] = r3
            r2 = 3
            r8[r2] = r4
            r3 = 4
            r8[r3] = r5
            r4 = 5
            r8[r4] = r6
            com.scwang.smartrefresh.header.waveswipe.WaveView.B = r8
            float[] r5 = new float[r0]
            r5 = {x00c2: FILL_ARRAY_DATA , data: [1042905301, 0} // fill-array
            float[] r6 = new float[r0]
            r6 = {x00ca: FILL_ARRAY_DATA , data: [1057362228, 1029866049} // fill-array
            float[] r8 = new float[r0]
            r8 = {x00d2: FILL_ARRAY_DATA , data: [1055478147, 1035972955} // fill-array
            float[] r10 = new float[r0]
            r10 = {x00da: FILL_ARRAY_DATA , data: [1053300464, 1040536358} // fill-array
            float[] r11 = new float[r0]
            r11 = {x00e2: FILL_ARRAY_DATA , data: [1054625864, 1046381540} // fill-array
            float[] r12 = new float[r0]
            r12 = {x00ea: FILL_ARRAY_DATA , data: [1056964608, 1046381540} // fill-array
            float[][] r13 = new float[r7][]
            r13[r9] = r5
            r13[r1] = r6
            r13[r0] = r8
            r13[r2] = r10
            r13[r3] = r11
            r13[r4] = r12
            com.scwang.smartrefresh.header.waveswipe.WaveView.C = r13
            float[] r5 = new float[r0]
            r5 = {x00f2: FILL_ARRAY_DATA , data: [1042905301, 0} // fill-array
            float[] r6 = new float[r0]
            r6 = {x00fa: FILL_ARRAY_DATA , data: [1058489657, 0} // fill-array
            float[] r8 = new float[r0]
            r8 = {x0102: FILL_ARRAY_DATA , data: [1055478147, 1042818059} // fill-array
            float[] r10 = new float[r0]
            r10 = {x010a: FILL_ARRAY_DATA , data: [1053411194, 1045629921} // fill-array
            float[] r11 = new float[r0]
            r11 = {x0112: FILL_ARRAY_DATA , data: [1054625864, 1049881267} // fill-array
            float[] r12 = new float[r0]
            r12 = {x011a: FILL_ARRAY_DATA , data: [1056964608, 1049881267} // fill-array
            float[][] r7 = new float[r7][]
            r7[r9] = r5
            r7[r1] = r6
            r7[r0] = r8
            r7[r2] = r10
            r7[r3] = r11
            r7[r4] = r12
            com.scwang.smartrefresh.header.waveswipe.WaveView.D = r7
            return
    }

    public WaveView(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1120403456(0x42c80000, float:100.0)
            r0.a = r1
            r1 = 0
            r0.k = r1
            r0.l = r1
            com.scwang.smartrefresh.header.waveswipe.WaveView$a r1 = new com.scwang.smartrefresh.header.waveswipe.WaveView$a
            r1.<init>(r0)
            r0.t = r1
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            r1.addOnPreDrawListener(r0)
            r0.j()
            return
    }

    static /* synthetic */ float a(com.scwang.smartrefresh.header.waveswipe.WaveView r0, float r1) {
            r0.i = r1
            return r1
    }

    static /* synthetic */ void b(com.scwang.smartrefresh.header.waveswipe.WaveView r0) {
            r0.n()
            return
    }

    static /* synthetic */ boolean c(com.scwang.smartrefresh.header.waveswipe.WaveView r0, boolean r1) {
            r0.k = r1
            return r1
    }

    static /* synthetic */ android.graphics.Path d(com.scwang.smartrefresh.header.waveswipe.WaveView r0) {
            android.graphics.Path r0 = r0.c
            return r0
    }

    static /* synthetic */ int e(com.scwang.smartrefresh.header.waveswipe.WaveView r0) {
            int r0 = r0.h
            return r0
    }

    private void j() {
            r2 = this;
            r2.p()
            r2.q()
            r2.n()
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r2.g = r0
            r0 = 1
            r1 = 0
            r2.setLayerType(r0, r1)
            return
    }

    private void m() {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.s
            if (r0 == 0) goto Lf
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto Lf
            android.animation.ValueAnimator r0 = r1.s
            r0.cancel()
        Lf:
            return
    }

    private void n() {
            r3 = this;
            r0 = 2
            float[] r1 = new float[r0]
            r1 = {x0046: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            r3.n = r1
            float[] r1 = new float[r0]
            r1 = {x004e: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            r3.o = r1
            float[] r1 = new float[r0]
            r1 = {x0056: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            r3.p = r1
            float[] r1 = new float[r0]
            r1 = {x005e: FILL_ARRAY_DATA , data: [-998637568, -998637568} // fill-array
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            r3.q = r1
            r1.start()
            float[] r0 = new float[r0]
            r0 = {x0066: FILL_ARRAY_DATA , data: [1065353216, 1065353216} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            r3.r = r0
            r1 = 1
            r0.setDuration(r1)
            android.animation.ValueAnimator r0 = r3.r
            r0.start()
            return
    }

    private void p() {
            r4 = this;
            android.content.res.Resources r0 = r4.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r4.b = r1
            r2 = -14575885(0xffffffffff2196f3, float:-2.1478948E38)
            r1.setColor(r2)
            android.graphics.Paint r1 = r4.b
            r2 = 1
            r1.setAntiAlias(r2)
            android.graphics.Paint r1 = r4.b
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            r1.setStyle(r2)
            android.graphics.Paint r1 = r4.b
            r2 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r2
            int r0 = (int) r0
            float r0 = (float) r0
            r2 = 0
            r3 = -1728053248(0xffffffff99000000, float:-6.617445E-24)
            r1.setShadowLayer(r0, r2, r2, r3)
            return
    }

    private void q() {
            r1 = this;
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r1.c = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r1.d = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r1.e = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r1.f = r0
            return
    }

    private void v(int r3) {
            r2 = this;
            int r0 = r2.h
            float r0 = (float) r0
            r1 = 1152647168(0x44b40000, float:1440.0)
            float r0 = r0 / r1
            r1 = 1140457472(0x43fa0000, float:500.0)
            float r0 = r0 * r1
            float r3 = (float) r3
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L10
            return
        L10:
            int r0 = r2.getHeight()
            float r0 = (float) r0
            float r1 = r2.a
            float r0 = r0 - r1
            float r3 = java.lang.Math.min(r3, r0)
            int r3 = (int) r3
            r2.j = r3
            boolean r3 = r2.k
            if (r3 == 0) goto L29
            r3 = 0
            r2.k = r3
            r2.l()
        L29:
            return
    }

    public void f() {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.r
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L9
            return
        L9:
            r1.t()
            r0 = 1036831949(0x3dcccccd, float:0.1)
            r1.u(r0)
            return
    }

    public void g(float r30, float r31) {
            r29 = this;
            r0 = r29
            r0.m()
            android.graphics.Path r1 = r0.c
            r2 = 0
            r1.moveTo(r2, r2)
            android.graphics.Path r3 = r0.c
            int r1 = r0.h
            float r2 = (float) r1
            float[][] r10 = com.scwang.smartrefresh.header.waveswipe.WaveView.C
            r11 = 0
            r4 = r10[r11]
            r5 = r4[r11]
            float r2 = r2 * r5
            float r5 = (float) r1
            r12 = 1
            r4 = r4[r12]
            float r5 = r5 * r4
            float r1 = (float) r1
            float[][] r13 = com.scwang.smartrefresh.header.waveswipe.WaveView.B
            r4 = r13[r12]
            r4 = r4[r11]
            float r4 = r4 + r31
            r6 = r10[r12]
            r6 = r6[r11]
            float r4 = java.lang.Math.min(r4, r6)
            float r6 = r1 * r4
            int r1 = r0.h
            float r1 = (float) r1
            r4 = r13[r12]
            r4 = r4[r12]
            float r4 = r4 + r30
            float r4 = r4 - r31
            r7 = r10[r12]
            r7 = r7[r12]
            float r4 = java.lang.Math.max(r4, r7)
            float r7 = r1 * r4
            int r1 = r0.h
            float r1 = (float) r1
            r14 = 2
            r4 = r13[r14]
            r4 = r4[r11]
            float r4 = r4 - r31
            r8 = r10[r14]
            r8 = r8[r11]
            float r4 = java.lang.Math.max(r4, r8)
            float r8 = r1 * r4
            int r1 = r0.h
            float r1 = (float) r1
            r4 = r13[r14]
            r4 = r4[r12]
            float r4 = r4 + r30
            float r4 = r4 - r31
            r9 = r10[r14]
            r9 = r9[r12]
            float r4 = java.lang.Math.max(r4, r9)
            float r9 = r1 * r4
            r4 = r2
            r3.cubicTo(r4, r5, r6, r7, r8, r9)
            android.graphics.Path r15 = r0.c
            int r1 = r0.h
            float r1 = (float) r1
            r2 = 3
            r3 = r13[r2]
            r3 = r3[r11]
            float r3 = r3 - r31
            r4 = r10[r2]
            r4 = r4[r11]
            float r3 = java.lang.Math.max(r3, r4)
            float r16 = r1 * r3
            int r1 = r0.h
            float r1 = (float) r1
            r3 = r13[r2]
            r3 = r3[r12]
            float r3 = r3 + r30
            float r3 = r3 + r31
            r4 = r10[r2]
            r4 = r4[r12]
            float r3 = java.lang.Math.min(r3, r4)
            float r17 = r1 * r3
            int r1 = r0.h
            float r1 = (float) r1
            r3 = 4
            r4 = r13[r3]
            r4 = r4[r11]
            float r4 = r4 - r31
            r5 = r10[r3]
            r5 = r5[r11]
            float r4 = java.lang.Math.max(r4, r5)
            float r18 = r1 * r4
            int r1 = r0.h
            float r1 = (float) r1
            r4 = r13[r3]
            r4 = r4[r12]
            float r4 = r4 + r30
            float r4 = r4 + r31
            r5 = r10[r3]
            r5 = r5[r12]
            float r4 = java.lang.Math.min(r4, r5)
            float r19 = r1 * r4
            int r1 = r0.h
            float r4 = (float) r1
            r5 = 5
            r5 = r10[r5]
            r6 = r5[r11]
            float r20 = r4 * r6
            float r1 = (float) r1
            r4 = r13[r11]
            r4 = r4[r12]
            float r4 = r4 + r30
            float r4 = r4 + r31
            r5 = r5[r12]
            float r4 = java.lang.Math.min(r4, r5)
            float r21 = r1 * r4
            r15.cubicTo(r16, r17, r18, r19, r20, r21)
            android.graphics.Path r1 = r0.c
            int r4 = r0.h
            float r5 = (float) r4
            float r4 = (float) r4
            r6 = r13[r3]
            r6 = r6[r11]
            float r6 = r6 - r31
            r7 = r10[r3]
            r7 = r7[r11]
            float r6 = java.lang.Math.max(r6, r7)
            float r4 = r4 * r6
            float r23 = r5 - r4
            int r4 = r0.h
            float r4 = (float) r4
            r5 = r13[r3]
            r5 = r5[r12]
            float r5 = r5 + r30
            float r5 = r5 + r31
            r3 = r10[r3]
            r3 = r3[r12]
            float r3 = java.lang.Math.min(r5, r3)
            float r24 = r4 * r3
            int r3 = r0.h
            float r4 = (float) r3
            float r3 = (float) r3
            r5 = r13[r2]
            r5 = r5[r11]
            float r5 = r5 - r31
            r6 = r10[r2]
            r6 = r6[r11]
            float r5 = java.lang.Math.max(r5, r6)
            float r3 = r3 * r5
            float r25 = r4 - r3
            int r3 = r0.h
            float r3 = (float) r3
            r4 = r13[r2]
            r4 = r4[r12]
            float r4 = r4 + r30
            float r4 = r4 + r31
            r5 = r10[r2]
            r5 = r5[r12]
            float r4 = java.lang.Math.min(r4, r5)
            float r26 = r3 * r4
            int r3 = r0.h
            float r4 = (float) r3
            float r3 = (float) r3
            r5 = r13[r14]
            r5 = r5[r11]
            float r5 = r5 - r31
            r6 = r10[r14]
            r6 = r6[r11]
            float r5 = java.lang.Math.max(r5, r6)
            float r3 = r3 * r5
            float r27 = r4 - r3
            int r3 = r0.h
            float r3 = (float) r3
            r4 = r13[r14]
            r4 = r4[r12]
            float r4 = r4 + r30
            float r4 = r4 - r31
            r5 = r10[r14]
            r5 = r5[r12]
            float r4 = java.lang.Math.max(r4, r5)
            float r28 = r3 * r4
            r22 = r1
            r22.cubicTo(r23, r24, r25, r26, r27, r28)
            android.graphics.Path r3 = r0.c
            int r1 = r0.h
            float r4 = (float) r1
            float r1 = (float) r1
            r5 = r13[r12]
            r5 = r5[r11]
            float r5 = r5 + r31
            r6 = r10[r12]
            r6 = r6[r11]
            float r5 = java.lang.Math.min(r5, r6)
            float r1 = r1 * r5
            float r4 = r4 - r1
            int r1 = r0.h
            float r1 = (float) r1
            r5 = r13[r12]
            r5 = r5[r12]
            float r5 = r5 + r30
            float r5 = r5 - r31
            r6 = r10[r12]
            r6 = r6[r12]
            float r5 = java.lang.Math.max(r5, r6)
            float r5 = r5 * r1
            int r1 = r0.h
            float r6 = (float) r1
            float r7 = (float) r1
            r8 = r10[r11]
            r9 = r8[r11]
            float r7 = r7 * r9
            float r6 = r6 - r7
            float r7 = (float) r1
            r8 = r8[r12]
            float r7 = r7 * r8
            float r8 = (float) r1
            r9 = 0
            r3.cubicTo(r4, r5, r6, r7, r8, r9)
            int r1 = r0.h
            float r1 = (float) r1
            r3 = r13[r2]
            r3 = r3[r12]
            float r3 = r3 + r30
            float r3 = r3 + r31
            r2 = r10[r2]
            r2 = r2[r12]
            float r2 = java.lang.Math.min(r3, r2)
            float r1 = r1 * r2
            float r2 = r0.a
            float r1 = r1 + r2
            r0.i = r1
            r0.postInvalidateOnAnimation()
            return
    }

    public float getCurrentCircleCenterY() {
            r1 = this;
            float r0 = r1.i
            return r0
    }

    public void h(float r29) {
            r28 = this;
            r0 = r28
            r0.m()
            android.graphics.Path r1 = r0.c
            r2 = 0
            r1.moveTo(r2, r2)
            android.graphics.Path r3 = r0.c
            int r1 = r0.h
            float r2 = (float) r1
            float[][] r10 = com.scwang.smartrefresh.header.waveswipe.WaveView.B
            r11 = 0
            r4 = r10[r11]
            r5 = r4[r11]
            float r2 = r2 * r5
            r12 = 1
            r5 = r4[r12]
            float r4 = (float) r1
            r6 = r10[r12]
            r7 = r6[r11]
            float r4 = r4 * r7
            float r7 = (float) r1
            r6 = r6[r12]
            float r6 = r6 + r29
            float r7 = r7 * r6
            float r6 = (float) r1
            r13 = 2
            r8 = r10[r13]
            r9 = r8[r11]
            float r6 = r6 * r9
            float r1 = (float) r1
            r8 = r8[r12]
            float r8 = r8 + r29
            float r9 = r1 * r8
            r8 = r6
            r6 = r4
            r4 = r2
            r3.cubicTo(r4, r5, r6, r7, r8, r9)
            android.graphics.Path r14 = r0.c
            int r1 = r0.h
            float r2 = (float) r1
            r3 = 3
            r4 = r10[r3]
            r5 = r4[r11]
            float r15 = r2 * r5
            float r2 = (float) r1
            r4 = r4[r12]
            float r4 = r4 + r29
            float r16 = r2 * r4
            float r2 = (float) r1
            r4 = 4
            r5 = r10[r4]
            r6 = r5[r11]
            float r17 = r2 * r6
            float r2 = (float) r1
            r5 = r5[r12]
            float r5 = r5 + r29
            float r18 = r2 * r5
            float r2 = (float) r1
            r5 = 5
            r5 = r10[r5]
            r6 = r5[r11]
            float r19 = r2 * r6
            float r1 = (float) r1
            r2 = r5[r12]
            float r2 = r2 + r29
            float r20 = r1 * r2
            r14.cubicTo(r15, r16, r17, r18, r19, r20)
            android.graphics.Path r1 = r0.c
            int r2 = r0.h
            float r5 = (float) r2
            float r6 = (float) r2
            r4 = r10[r4]
            r7 = r4[r11]
            float r6 = r6 * r7
            float r22 = r5 - r6
            float r5 = (float) r2
            r4 = r4[r12]
            float r4 = r4 + r29
            float r23 = r5 * r4
            float r4 = (float) r2
            float r5 = (float) r2
            r3 = r10[r3]
            r6 = r3[r11]
            float r5 = r5 * r6
            float r24 = r4 - r5
            float r4 = (float) r2
            r3 = r3[r12]
            float r3 = r3 + r29
            float r25 = r4 * r3
            float r3 = (float) r2
            float r4 = (float) r2
            r5 = r10[r13]
            r6 = r5[r11]
            float r4 = r4 * r6
            float r26 = r3 - r4
            float r2 = (float) r2
            r3 = r5[r12]
            float r3 = r3 + r29
            float r27 = r2 * r3
            r21 = r1
            r21.cubicTo(r22, r23, r24, r25, r26, r27)
            android.graphics.Path r2 = r0.c
            int r1 = r0.h
            float r3 = (float) r1
            float r4 = (float) r1
            r5 = r10[r12]
            r6 = r5[r11]
            float r4 = r4 * r6
            float r3 = r3 - r4
            float r4 = (float) r1
            r5 = r5[r12]
            float r5 = r5 + r29
            float r4 = r4 * r5
            float r5 = (float) r1
            float r6 = (float) r1
            r7 = r10[r11]
            r8 = r7[r11]
            float r6 = r6 * r8
            float r5 = r5 - r6
            r6 = r7[r12]
            float r7 = (float) r1
            r8 = 0
            r2.cubicTo(r3, r4, r5, r6, r7, r8)
            r0.postInvalidateOnAnimation()
            return
    }

    public void i(float r31, float r32, float r33) {
            r30 = this;
            r0 = r30
            r0.m()
            android.graphics.Path r1 = r0.c
            r2 = 0
            r1.moveTo(r2, r2)
            android.graphics.Path r3 = r0.c
            int r1 = r0.h
            float r2 = (float) r1
            float[][] r10 = com.scwang.smartrefresh.header.waveswipe.WaveView.D
            r11 = 0
            r4 = r10[r11]
            r5 = r4[r11]
            float r2 = r2 * r5
            float r5 = (float) r1
            r12 = 1
            r4 = r4[r12]
            float r5 = r5 * r4
            float r1 = (float) r1
            float[][] r13 = com.scwang.smartrefresh.header.waveswipe.WaveView.B
            r4 = r13[r12]
            r4 = r4[r11]
            float r4 = r4 + r32
            float[][] r14 = com.scwang.smartrefresh.header.waveswipe.WaveView.C
            r6 = r14[r12]
            r6 = r6[r11]
            float r4 = java.lang.Math.min(r4, r6)
            float r4 = r4 + r33
            r6 = r10[r12]
            r6 = r6[r11]
            float r4 = java.lang.Math.min(r4, r6)
            float r6 = r1 * r4
            int r1 = r0.h
            float r1 = (float) r1
            r4 = r13[r12]
            r4 = r4[r12]
            float r4 = r4 + r31
            float r4 = r4 - r32
            r7 = r14[r12]
            r7 = r7[r12]
            float r4 = java.lang.Math.max(r4, r7)
            float r4 = r4 - r33
            r7 = r10[r12]
            r7 = r7[r12]
            float r4 = java.lang.Math.max(r4, r7)
            float r7 = r1 * r4
            int r1 = r0.h
            float r1 = (float) r1
            r15 = 2
            r4 = r13[r15]
            r4 = r4[r11]
            float r4 = r4 - r32
            r8 = r10[r15]
            r8 = r8[r11]
            float r4 = java.lang.Math.max(r4, r8)
            float r8 = r1 * r4
            int r1 = r0.h
            float r1 = (float) r1
            r4 = r13[r15]
            r4 = r4[r12]
            float r4 = r4 + r31
            float r4 = r4 - r32
            r9 = r14[r15]
            r9 = r9[r12]
            float r4 = java.lang.Math.max(r4, r9)
            float r4 = r4 + r33
            r9 = r10[r15]
            r9 = r9[r12]
            float r4 = java.lang.Math.min(r4, r9)
            float r9 = r1 * r4
            r4 = r2
            r3.cubicTo(r4, r5, r6, r7, r8, r9)
            android.graphics.Path r1 = r0.c
            int r2 = r0.h
            float r2 = (float) r2
            r3 = 3
            r4 = r13[r3]
            r4 = r4[r11]
            float r4 = r4 - r32
            r5 = r14[r3]
            r5 = r5[r11]
            float r4 = java.lang.Math.max(r4, r5)
            float r4 = r4 + r33
            r5 = r10[r3]
            r5 = r5[r11]
            float r4 = java.lang.Math.min(r4, r5)
            float r17 = r2 * r4
            int r2 = r0.h
            float r2 = (float) r2
            r4 = r13[r3]
            r4 = r4[r12]
            float r4 = r4 + r31
            float r4 = r4 + r32
            r5 = r14[r3]
            r5 = r5[r12]
            float r4 = java.lang.Math.min(r4, r5)
            float r4 = r4 + r33
            r5 = r10[r3]
            r5 = r5[r12]
            float r4 = java.lang.Math.min(r4, r5)
            float r18 = r2 * r4
            int r2 = r0.h
            float r2 = (float) r2
            r4 = 4
            r5 = r13[r4]
            r5 = r5[r11]
            float r5 = r5 - r32
            r6 = r10[r4]
            r6 = r6[r11]
            float r5 = java.lang.Math.max(r5, r6)
            float r19 = r2 * r5
            int r2 = r0.h
            float r2 = (float) r2
            r5 = r13[r4]
            r5 = r5[r12]
            float r5 = r5 + r31
            float r5 = r5 + r32
            r6 = r14[r4]
            r6 = r6[r12]
            float r5 = java.lang.Math.min(r5, r6)
            float r5 = r5 + r33
            r6 = r10[r4]
            r6 = r6[r12]
            float r5 = java.lang.Math.min(r5, r6)
            float r20 = r2 * r5
            int r2 = r0.h
            float r5 = (float) r2
            r6 = 5
            r7 = r10[r6]
            r7 = r7[r11]
            float r21 = r5 * r7
            float r2 = (float) r2
            r5 = r13[r11]
            r5 = r5[r12]
            float r5 = r5 + r31
            float r5 = r5 + r32
            r7 = r14[r6]
            r7 = r7[r12]
            float r5 = java.lang.Math.min(r5, r7)
            float r5 = r5 + r33
            r6 = r10[r6]
            r6 = r6[r12]
            float r5 = java.lang.Math.min(r5, r6)
            float r22 = r2 * r5
            r16 = r1
            r16.cubicTo(r17, r18, r19, r20, r21, r22)
            android.graphics.Path r1 = r0.c
            int r2 = r0.h
            float r5 = (float) r2
            float r2 = (float) r2
            r6 = r13[r4]
            r6 = r6[r11]
            float r6 = r6 - r32
            r7 = r10[r4]
            r7 = r7[r11]
            float r6 = java.lang.Math.max(r6, r7)
            float r2 = r2 * r6
            float r24 = r5 - r2
            int r2 = r0.h
            float r2 = (float) r2
            r5 = r13[r4]
            r5 = r5[r12]
            float r5 = r5 + r31
            float r5 = r5 + r32
            r6 = r14[r4]
            r6 = r6[r12]
            float r5 = java.lang.Math.min(r5, r6)
            float r5 = r5 + r33
            r4 = r10[r4]
            r4 = r4[r12]
            float r4 = java.lang.Math.min(r5, r4)
            float r25 = r2 * r4
            int r2 = r0.h
            float r4 = (float) r2
            float r2 = (float) r2
            r5 = r13[r3]
            r5 = r5[r11]
            float r5 = r5 - r32
            r6 = r14[r3]
            r6 = r6[r11]
            float r5 = java.lang.Math.max(r5, r6)
            float r5 = r5 + r33
            r6 = r10[r3]
            r6 = r6[r11]
            float r5 = java.lang.Math.min(r5, r6)
            float r2 = r2 * r5
            float r26 = r4 - r2
            int r2 = r0.h
            float r2 = (float) r2
            r4 = r13[r3]
            r4 = r4[r12]
            float r4 = r4 + r31
            float r4 = r4 + r32
            r5 = r14[r3]
            r5 = r5[r12]
            float r4 = java.lang.Math.min(r4, r5)
            float r4 = r4 + r33
            r5 = r10[r3]
            r5 = r5[r12]
            float r4 = java.lang.Math.min(r4, r5)
            float r27 = r2 * r4
            int r2 = r0.h
            float r4 = (float) r2
            float r2 = (float) r2
            r5 = r13[r15]
            r5 = r5[r11]
            float r5 = r5 - r32
            r6 = r10[r15]
            r6 = r6[r11]
            float r5 = java.lang.Math.max(r5, r6)
            float r2 = r2 * r5
            float r28 = r4 - r2
            int r2 = r0.h
            float r2 = (float) r2
            r4 = r13[r15]
            r4 = r4[r12]
            float r4 = r4 + r31
            float r4 = r4 - r32
            r5 = r14[r15]
            r5 = r5[r12]
            float r4 = java.lang.Math.max(r4, r5)
            float r4 = r4 + r33
            r5 = r10[r15]
            r5 = r5[r12]
            float r4 = java.lang.Math.min(r4, r5)
            float r29 = r2 * r4
            r23 = r1
            r23.cubicTo(r24, r25, r26, r27, r28, r29)
            android.graphics.Path r15 = r0.c
            int r1 = r0.h
            float r2 = (float) r1
            float r1 = (float) r1
            r4 = r13[r12]
            r4 = r4[r11]
            float r4 = r4 + r32
            r5 = r14[r12]
            r5 = r5[r11]
            float r4 = java.lang.Math.min(r4, r5)
            float r4 = r4 + r33
            r5 = r10[r12]
            r5 = r5[r11]
            float r4 = java.lang.Math.min(r4, r5)
            float r1 = r1 * r4
            float r16 = r2 - r1
            int r1 = r0.h
            float r1 = (float) r1
            r2 = r13[r12]
            r2 = r2[r12]
            float r2 = r2 + r31
            float r2 = r2 - r32
            r4 = r14[r12]
            r4 = r4[r12]
            float r2 = java.lang.Math.max(r2, r4)
            float r2 = r2 - r33
            r4 = r10[r12]
            r4 = r4[r12]
            float r2 = java.lang.Math.max(r2, r4)
            float r17 = r1 * r2
            int r1 = r0.h
            float r2 = (float) r1
            float r4 = (float) r1
            r5 = r10[r11]
            r6 = r5[r11]
            float r4 = r4 * r6
            float r18 = r2 - r4
            float r2 = (float) r1
            r4 = r5[r12]
            float r19 = r2 * r4
            float r1 = (float) r1
            r21 = 0
            r20 = r1
            r15.cubicTo(r16, r17, r18, r19, r20, r21)
            int r1 = r0.h
            float r1 = (float) r1
            r2 = r13[r3]
            r2 = r2[r12]
            float r2 = r2 + r31
            float r2 = r2 + r32
            r4 = r14[r3]
            r4 = r4[r12]
            float r2 = java.lang.Math.min(r2, r4)
            float r2 = r2 + r33
            r3 = r10[r3]
            r3 = r3[r12]
            float r2 = java.lang.Math.min(r2, r3)
            float r1 = r1 * r2
            float r2 = r0.a
            float r1 = r1 + r2
            r0.i = r1
            r0.postInvalidateOnAnimation()
            return
    }

    public boolean k() {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.r
            boolean r0 = r0.isRunning()
            return r0
    }

    public void l() {
            r6 = this;
            boolean r0 = r6.k
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r6.k = r0
            int r1 = r6.j
            float r2 = (float) r1
            float r1 = (float) r1
            r3 = 2
            float[] r4 = new float[r3]
            r5 = 0
            r4[r5] = r2
            r4[r0] = r1
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r4)
            r6.q = r1
            r1.start()
            int r1 = r6.j
            float r2 = (float) r1
            float r4 = r6.a
            float r2 = r2 - r4
            float r1 = (float) r1
            float r1 = r1 - r4
            float[] r3 = new float[r3]
            r3[r5] = r2
            r3[r0] = r1
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r3)
            r6.n = r0
            r0.start()
            int r0 = r6.j
            float r0 = (float) r0
            r6.i = r0
            r6.postInvalidate()
            return
    }

    public void o(int r3, int r4) {
            r2 = this;
            android.graphics.Paint r0 = r2.b
            float r3 = (float) r3
            r1 = 0
            r0.setShadowLayer(r3, r1, r1, r4)
            return
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.r
            if (r0 == 0) goto Lc
            r0.end()
            android.animation.ValueAnimator r0 = r1.r
            r0.removeAllUpdateListeners()
        Lc:
            android.animation.ValueAnimator r0 = r1.q
            if (r0 == 0) goto L18
            r0.end()
            android.animation.ValueAnimator r0 = r1.q
            r0.removeAllUpdateListeners()
        L18:
            android.animation.ValueAnimator r0 = r1.n
            if (r0 == 0) goto L24
            r0.end()
            android.animation.ValueAnimator r0 = r1.n
            r0.removeAllUpdateListeners()
        L24:
            android.animation.ValueAnimator r0 = r1.s
            if (r0 == 0) goto L30
            r0.end()
            android.animation.ValueAnimator r0 = r1.s
            r0.removeAllUpdateListeners()
        L30:
            android.animation.ValueAnimator r0 = r1.p
            if (r0 == 0) goto L3c
            r0.end()
            android.animation.ValueAnimator r0 = r1.p
            r0.removeAllUpdateListeners()
        L3c:
            android.animation.ValueAnimator r0 = r1.o
            if (r0 == 0) goto L48
            r0.end()
            android.animation.ValueAnimator r0 = r1.o
            r0.removeAllUpdateListeners()
        L48:
            super.onDetachedFromWindow()
            return
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r14) {
            r13 = this;
            super.onDraw(r14)
            android.graphics.Path r0 = r13.c
            android.graphics.Paint r1 = r13.b
            r14.drawPath(r0, r1)
            boolean r0 = r13.isInEditMode()
            if (r0 != 0) goto L1f
            android.graphics.Path r0 = r13.c
            r0.rewind()
            android.graphics.Path r0 = r13.d
            r0.rewind()
            android.graphics.Path r0 = r13.e
            r0.rewind()
        L1f:
            android.animation.ValueAnimator r0 = r13.q
            java.lang.Object r0 = r0.getAnimatedValue()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            int r1 = r13.h
            float r1 = (float) r1
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            android.graphics.RectF r3 = r13.g
            r3.setEmpty()
            android.animation.ValueAnimator r3 = r13.r
            java.lang.Object r3 = r3.getAnimatedValue()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            android.animation.ValueAnimator r4 = r13.o
            java.lang.Object r4 = r4.getAnimatedValue()
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            android.animation.ValueAnimator r5 = r13.p
            java.lang.Object r5 = r5.getAnimatedValue()
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            android.graphics.RectF r6 = r13.g
            float r7 = r13.a
            r8 = 1065353216(0x3f800000, float:1.0)
            float r9 = r4 + r8
            float r10 = r7 * r9
            float r10 = r10 * r3
            float r10 = r1 - r10
            float r11 = r7 * r5
            float r11 = r11 / r2
            float r10 = r10 + r11
            float r8 = r8 + r5
            float r11 = r7 * r8
            float r11 = r11 * r3
            float r11 = r11 + r0
            float r12 = r7 * r4
            float r12 = r12 / r2
            float r11 = r11 - r12
            float r9 = r9 * r7
            float r9 = r9 * r3
            float r9 = r9 + r1
            float r5 = r5 * r7
            float r5 = r5 / r2
            float r9 = r9 - r5
            float r8 = r8 * r7
            float r8 = r8 * r3
            float r3 = r0 - r8
            float r7 = r7 * r4
            float r7 = r7 / r2
            float r3 = r3 + r7
            r6.set(r10, r11, r9, r3)
            android.animation.ValueAnimator r2 = r13.n
            java.lang.Object r2 = r2.getAnimatedValue()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            android.graphics.Path r3 = r13.d
            r3.moveTo(r1, r2)
            float r3 = r13.a
            double r3 = (double) r3
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r3 = java.lang.Math.pow(r3, r5)
            float r7 = r0 * r2
            double r7 = (double) r7
            double r3 = r3 + r7
            double r7 = (double) r0
            double r9 = java.lang.Math.pow(r7, r5)
            double r3 = r3 - r9
            float r2 = r2 - r0
            double r9 = (double) r2
            double r3 = r3 / r9
            int r0 = r13.h
            double r9 = (double) r0
            r11 = -4611686018427387904(0xc000000000000000, double:-2.0)
            double r9 = r9 * r11
            double r9 = r9 / r5
            double r7 = r3 - r7
            double r7 = java.lang.Math.pow(r7, r5)
            double r0 = (double) r1
            double r0 = java.lang.Math.pow(r0, r5)
            double r7 = r7 + r0
            float r0 = r13.a
            double r0 = (double) r0
            double r0 = java.lang.Math.pow(r0, r5)
            double r7 = r7 - r0
            double r0 = -r9
            double r9 = r9 * r9
            r11 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r7 = r7 * r11
            double r9 = r9 - r7
            double r7 = java.lang.Math.sqrt(r9)
            double r7 = r7 + r0
            double r7 = r7 / r5
            double r9 = java.lang.Math.sqrt(r9)
            double r0 = r0 - r9
            double r0 = r0 / r5
            android.graphics.Path r2 = r13.d
            float r5 = (float) r7
            float r3 = (float) r3
            r2.lineTo(r5, r3)
            android.graphics.Path r2 = r13.d
            float r0 = (float) r0
            r2.lineTo(r0, r3)
            android.graphics.Path r0 = r13.d
            r0.close()
            android.graphics.Path r0 = r13.f
            android.graphics.Path r1 = r13.d
            r0.set(r1)
            android.graphics.Path r0 = r13.f
            android.graphics.RectF r1 = r13.g
            android.graphics.Path$Direction r2 = android.graphics.Path.Direction.CCW
            r0.addOval(r1, r2)
            android.graphics.Path r0 = r13.e
            android.graphics.RectF r1 = r13.g
            r0.addOval(r1, r2)
            android.animation.ValueAnimator r0 = r13.n
            r0.isRunning()
            android.graphics.Path r0 = r13.d
            android.graphics.Paint r1 = r13.b
            r14.drawPath(r0, r1)
            android.graphics.Path r0 = r13.e
            android.graphics.Paint r1 = r13.b
            r14.drawPath(r0, r1)
            return
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
            r1 = this;
            android.view.ViewTreeObserver r0 = r1.getViewTreeObserver()
            r0.removeOnPreDrawListener(r1)
            boolean r0 = r1.l
            if (r0 == 0) goto L10
            int r0 = r1.m
            r1.v(r0)
        L10:
            r0 = 0
            return r0
    }

    @Override // android.view.View
    protected void onSizeChanged(int r4, int r5, int r6, int r7) {
            r3 = this;
            r3.h = r4
            float r0 = (float) r4
            r1 = 1097229926(0x41666666, float:14.4)
            float r0 = r0 / r1
            r3.a = r0
            int r0 = java.lang.Math.min(r4, r5)
            float r0 = (float) r0
            int r1 = r3.getHeight()
            float r1 = (float) r1
            float r2 = r3.a
            float r1 = r1 - r2
            float r0 = java.lang.Math.min(r0, r1)
            int r0 = (int) r0
            r3.v(r0)
            super.onSizeChanged(r4, r5, r6, r7)
            return
    }

    @Override // android.view.View
    public void postInvalidateOnAnimation() {
            r0 = this;
            super.postInvalidateOnAnimation()
            return
    }

    public void r(int r2, int r3, int r4, int r5) {
            r1 = this;
            android.graphics.Paint r0 = r1.b
            r0.setARGB(r2, r3, r4, r5)
            r1.invalidate()
            return
    }

    public void s() {
            r3 = this;
            r0 = 2
            float[] r0 = new float[r0]
            r0 = {x0028: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            r3.r = r0
            android.animation.ValueAnimator$AnimatorUpdateListener r1 = r3.t
            r0.addUpdateListener(r1)
            android.animation.ValueAnimator r0 = r3.r
            r1 = 200(0xc8, double:9.9E-322)
            r0.setDuration(r1)
            android.animation.ValueAnimator r0 = r3.r
            com.scwang.smartrefresh.header.waveswipe.WaveView$c r1 = new com.scwang.smartrefresh.header.waveswipe.WaveView$c
            r1.<init>(r3)
            r0.addListener(r1)
            android.animation.ValueAnimator r0 = r3.r
            r0.start()
            return
    }

    public void setMaxDropHeight(int r2) {
            r1 = this;
            boolean r0 = r1.l
            if (r0 == 0) goto L8
            r1.v(r2)
            return
        L8:
            r1.m = r2
            r2 = 1
            r1.l = r2
            android.view.ViewTreeObserver r2 = r1.getViewTreeObserver()
            boolean r2 = r2.isAlive()
            if (r2 == 0) goto L25
            android.view.ViewTreeObserver r2 = r1.getViewTreeObserver()
            r2.removeOnPreDrawListener(r1)
            android.view.ViewTreeObserver r2 = r1.getViewTreeObserver()
            r2.addOnPreDrawListener(r1)
        L25:
            return
    }

    public void setShadowRadius(int r4) {
            r3 = this;
            android.graphics.Paint r0 = r3.b
            float r4 = (float) r4
            r1 = 0
            r2 = -1728053248(0xffffffff99000000, float:-6.617445E-24)
            r0.setShadowLayer(r4, r1, r1, r2)
            return
    }

    public void setWaveColor(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.b
            r0.setColor(r2)
            r1.invalidate()
            return
    }

    public void t() {
            r8 = this;
            r0 = 2
            float[] r1 = new float[r0]
            r1 = {x00c6: FILL_ARRAY_DATA , data: [1065353216, 1065353216} // fill-array
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            r8.r = r1
            r2 = 1
            r1.setDuration(r2)
            android.animation.ValueAnimator r1 = r8.r
            r1.start()
            int r1 = r8.h
            float r1 = (float) r1
            r2 = 1152647168(0x44b40000, float:1440.0)
            float r1 = r1 / r2
            r2 = 1140457472(0x43fa0000, float:500.0)
            float r1 = r1 * r2
            int r2 = r8.j
            float r2 = (float) r2
            float[] r3 = new float[r0]
            r4 = 0
            r3[r4] = r1
            r1 = 1
            r3[r1] = r2
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r3)
            r8.q = r2
            r5 = 500(0x1f4, double:2.47E-321)
            r2.setDuration(r5)
            android.animation.ValueAnimator r2 = r8.q
            com.scwang.smartrefresh.header.waveswipe.WaveView$b r3 = new com.scwang.smartrefresh.header.waveswipe.WaveView$b
            r3.<init>(r8)
            r2.addUpdateListener(r3)
            android.animation.ValueAnimator r2 = r8.q
            android.view.animation.AccelerateDecelerateInterpolator r3 = new android.view.animation.AccelerateDecelerateInterpolator
            r3.<init>()
            r2.setInterpolator(r3)
            android.animation.ValueAnimator r2 = r8.q
            r2.start()
            int r2 = r8.j
            float r2 = (float) r2
            float r3 = r8.a
            float r2 = r2 - r3
            float[] r3 = new float[r0]
            r7 = 0
            r3[r4] = r7
            r3[r1] = r2
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r3)
            r8.n = r1
            r1.setDuration(r5)
            android.animation.ValueAnimator r1 = r8.n
            android.animation.ValueAnimator$AnimatorUpdateListener r2 = r8.t
            r1.addUpdateListener(r2)
            android.animation.ValueAnimator r1 = r8.n
            r1.start()
            float[] r1 = new float[r0]
            r1 = {x00ce: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            r8.o = r1
            r1.setDuration(r5)
            android.animation.ValueAnimator r1 = r8.o
            android.animation.ValueAnimator$AnimatorUpdateListener r2 = r8.t
            r1.addUpdateListener(r2)
            android.animation.ValueAnimator r1 = r8.o
            com.scwang.smartrefresh.header.waveswipe.b r2 = new com.scwang.smartrefresh.header.waveswipe.b
            r2.<init>()
            r1.setInterpolator(r2)
            android.animation.ValueAnimator r1 = r8.o
            r1.setStartDelay(r5)
            android.animation.ValueAnimator r1 = r8.o
            r1.start()
            float[] r0 = new float[r0]
            r0 = {x00d6: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            r8.p = r0
            r0.setDuration(r5)
            android.animation.ValueAnimator r0 = r8.p
            android.animation.ValueAnimator$AnimatorUpdateListener r1 = r8.t
            r0.addUpdateListener(r1)
            android.animation.ValueAnimator r0 = r8.p
            com.scwang.smartrefresh.header.waveswipe.b r1 = new com.scwang.smartrefresh.header.waveswipe.b
            r1.<init>()
            r0.setInterpolator(r1)
            android.animation.ValueAnimator r0 = r8.p
            r1 = 625(0x271, double:3.09E-321)
            r0.setStartDelay(r1)
            android.animation.ValueAnimator r0 = r8.p
            r0.start()
            return
    }

    public void u(float r3) {
            r2 = this;
            r0 = 1045220557(0x3e4ccccd, float:0.2)
            float r3 = java.lang.Math.min(r3, r0)
            int r0 = r2.h
            float r0 = (float) r0
            float r3 = r3 * r0
            r0 = 2
            float[] r0 = new float[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 0
            r1 = 1
            r0[r1] = r3
            android.animation.ValueAnimator r3 = android.animation.ValueAnimator.ofFloat(r0)
            r2.s = r3
            r0 = 1000(0x3e8, double:4.94E-321)
            r3.setDuration(r0)
            android.animation.ValueAnimator r3 = r2.s
            com.scwang.smartrefresh.header.waveswipe.WaveView$d r0 = new com.scwang.smartrefresh.header.waveswipe.WaveView$d
            r0.<init>(r2)
            r3.addUpdateListener(r0)
            android.animation.ValueAnimator r3 = r2.s
            android.view.animation.BounceInterpolator r0 = new android.view.animation.BounceInterpolator
            r0.<init>()
            r3.setInterpolator(r0)
            android.animation.ValueAnimator r3 = r2.s
            r3.start()
            return
    }
}
