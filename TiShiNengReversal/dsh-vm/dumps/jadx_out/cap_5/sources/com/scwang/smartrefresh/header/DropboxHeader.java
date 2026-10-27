package com.scwang.smartrefresh.header;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class DropboxHeader extends android.view.View implements l2.e {
    private android.graphics.Path a;
    private android.graphics.Paint b;
    private com.scwang.smartrefresh.header.DropboxHeader.e c;
    private int d;
    private int e;
    private boolean f;
    private android.graphics.drawable.Drawable g;
    private android.graphics.drawable.Drawable h;
    private android.graphics.drawable.Drawable i;
    private float j;
    private float k;
    private android.animation.ValueAnimator l;
    private android.animation.ValueAnimator m;
    private com.scwang.smartrefresh.layout.constant.RefreshState n;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.animation.ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ com.scwang.smartrefresh.header.DropboxHeader a;

        a(com.scwang.smartrefresh.header.DropboxHeader r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator r2) {
                r1 = this;
                com.scwang.smartrefresh.header.DropboxHeader r0 = r1.a
                java.lang.Object r2 = r2.getAnimatedValue()
                java.lang.Float r2 = (java.lang.Float) r2
                float r2 = r2.floatValue()
                com.scwang.smartrefresh.header.DropboxHeader.m(r0, r2)
                com.scwang.smartrefresh.header.DropboxHeader r2 = r1.a
                r2.invalidate()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends android.animation.AnimatorListenerAdapter {
        final /* synthetic */ com.scwang.smartrefresh.header.DropboxHeader a;

        b(com.scwang.smartrefresh.header.DropboxHeader r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r2) {
                r1 = this;
                com.scwang.smartrefresh.header.DropboxHeader r2 = r1.a
                com.scwang.smartrefresh.layout.constant.RefreshState r2 = com.scwang.smartrefresh.header.DropboxHeader.n(r2)
                com.scwang.smartrefresh.layout.constant.RefreshState r0 = com.scwang.smartrefresh.layout.constant.RefreshState.Refreshing
                if (r2 != r0) goto L1b
                com.scwang.smartrefresh.header.DropboxHeader r2 = r1.a
                android.animation.ValueAnimator r2 = com.scwang.smartrefresh.header.DropboxHeader.z(r2)
                if (r2 == 0) goto L1b
                com.scwang.smartrefresh.header.DropboxHeader r2 = r1.a
                android.animation.ValueAnimator r2 = com.scwang.smartrefresh.header.DropboxHeader.z(r2)
                r2.start()
            L1b:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements android.animation.ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ com.scwang.smartrefresh.header.DropboxHeader a;

        c(com.scwang.smartrefresh.header.DropboxHeader r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator r5) {
                r4 = this;
                com.scwang.smartrefresh.header.DropboxHeader r0 = r4.a
                float r0 = com.scwang.smartrefresh.header.DropboxHeader.A(r0)
                r1 = 1065353216(0x3f800000, float:1.0)
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 < 0) goto L61
                com.scwang.smartrefresh.header.DropboxHeader r0 = r4.a
                float r0 = com.scwang.smartrefresh.header.DropboxHeader.A(r0)
                r2 = 1077936128(0x40400000, float:3.0)
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 < 0) goto L19
                goto L61
            L19:
                com.scwang.smartrefresh.header.DropboxHeader r0 = r4.a
                float r0 = com.scwang.smartrefresh.header.DropboxHeader.A(r0)
                r3 = 1073741824(0x40000000, float:2.0)
                int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r0 >= 0) goto L36
                com.scwang.smartrefresh.header.DropboxHeader r0 = r4.a
                java.lang.Object r5 = r5.getAnimatedValue()
                java.lang.Float r5 = (java.lang.Float) r5
                float r5 = r5.floatValue()
                float r5 = r5 + r1
                com.scwang.smartrefresh.header.DropboxHeader.B(r0, r5)
                goto L70
            L36:
                com.scwang.smartrefresh.header.DropboxHeader r0 = r4.a
                float r0 = com.scwang.smartrefresh.header.DropboxHeader.A(r0)
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 >= 0) goto L70
                com.scwang.smartrefresh.header.DropboxHeader r0 = r4.a
                java.lang.Object r5 = r5.getAnimatedValue()
                java.lang.Float r5 = (java.lang.Float) r5
                float r5 = r5.floatValue()
                float r5 = r5 + r3
                com.scwang.smartrefresh.header.DropboxHeader.B(r0, r5)
                com.scwang.smartrefresh.header.DropboxHeader r5 = r4.a
                float r5 = com.scwang.smartrefresh.header.DropboxHeader.A(r5)
                int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
                if (r5 != 0) goto L70
                com.scwang.smartrefresh.header.DropboxHeader r5 = r4.a
                r0 = 1
                com.scwang.smartrefresh.header.DropboxHeader.C(r5, r0)
                goto L70
            L61:
                com.scwang.smartrefresh.header.DropboxHeader r0 = r4.a
                java.lang.Object r5 = r5.getAnimatedValue()
                java.lang.Float r5 = (java.lang.Float) r5
                float r5 = r5.floatValue()
                com.scwang.smartrefresh.header.DropboxHeader.B(r0, r5)
            L70:
                com.scwang.smartrefresh.header.DropboxHeader r5 = r4.a
                r5.invalidate()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d extends android.animation.AnimatorListenerAdapter {
        final /* synthetic */ com.scwang.smartrefresh.header.DropboxHeader a;

        d(com.scwang.smartrefresh.header.DropboxHeader r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r1) {
                r0 = this;
                com.scwang.smartrefresh.header.DropboxHeader r1 = r0.a
                android.animation.ValueAnimator r1 = com.scwang.smartrefresh.header.DropboxHeader.D(r1)
                if (r1 == 0) goto L11
                com.scwang.smartrefresh.header.DropboxHeader r1 = r0.a
                android.animation.ValueAnimator r1 = com.scwang.smartrefresh.header.DropboxHeader.D(r1)
                r1.start()
            L11:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class e {
        private int a;
        private int b;
        private int c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private int i;

        private e() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ e(com.scwang.smartrefresh.header.DropboxHeader.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ int a(com.scwang.smartrefresh.header.DropboxHeader.e r0) {
                int r0 = r0.a
                return r0
        }

        static /* synthetic */ int b(com.scwang.smartrefresh.header.DropboxHeader.e r0) {
                int r0 = r0.h
                return r0
        }

        static /* synthetic */ int c(com.scwang.smartrefresh.header.DropboxHeader.e r0) {
                int r0 = r0.d
                return r0
        }

        static /* synthetic */ int d(com.scwang.smartrefresh.header.DropboxHeader.e r0) {
                int r0 = r0.c
                return r0
        }

        static /* synthetic */ int e(com.scwang.smartrefresh.header.DropboxHeader.e r0) {
                int r0 = r0.g
                return r0
        }

        static /* synthetic */ int f(com.scwang.smartrefresh.header.DropboxHeader.e r0) {
                int r0 = r0.i
                return r0
        }

        static /* synthetic */ int g(com.scwang.smartrefresh.header.DropboxHeader.e r0) {
                int r0 = r0.b
                return r0
        }

        static /* synthetic */ int h(com.scwang.smartrefresh.header.DropboxHeader.e r0) {
                int r0 = r0.f
                return r0
        }

        static /* synthetic */ int i(com.scwang.smartrefresh.header.DropboxHeader.e r0) {
                int r0 = r0.e
                return r0
        }

        com.scwang.smartrefresh.header.DropboxHeader.e j(int r6, int r7, int r8, int r9) {
                r5 = this;
                r5.i = r8
                int r0 = r6 / 2
                r5.a = r0
                int r7 = r7 - r9
                r5.c = r7
                int r9 = r8 * 2
                int r7 = r7 - r9
                r5.d = r7
                double r1 = (double) r8
                r3 = 4607394977673999205(0x3ff0c152382d7365, double:1.0471975511965976)
                double r3 = java.lang.Math.sin(r3)
                double r1 = r1 * r3
                int r7 = (int) r1
                int r0 = r0 - r7
                r5.e = r0
                int r7 = r5.d
                int r9 = r8 / 2
                int r7 = r7 + r9
                r5.f = r7
                int r7 = r5.c
                int r9 = r7 - r9
                r5.g = r9
                int r6 = r6 - r0
                r5.h = r6
                int r7 = r7 - r8
                r5.b = r7
                return r5
        }
    }

    public DropboxHeader(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = 0
            r1.K(r2, r0)
            return
    }

    public DropboxHeader(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.K(r1, r2)
            return
    }

    public DropboxHeader(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.K(r1, r2)
            return
    }

    @androidx.annotation.RequiresApi(21)
    public DropboxHeader(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            r0.K(r1, r2)
            return
    }

    static /* synthetic */ float A(com.scwang.smartrefresh.header.DropboxHeader r0) {
            float r0 = r0.j
            return r0
    }

    static /* synthetic */ float B(com.scwang.smartrefresh.header.DropboxHeader r0, float r1) {
            r0.j = r1
            return r1
    }

    static /* synthetic */ boolean C(com.scwang.smartrefresh.header.DropboxHeader r0, boolean r1) {
            r0.f = r1
            return r1
    }

    static /* synthetic */ android.animation.ValueAnimator D(com.scwang.smartrefresh.header.DropboxHeader r0) {
            android.animation.ValueAnimator r0 = r0.l
            return r0
    }

    @androidx.annotation.NonNull
    private com.scwang.smartrefresh.header.DropboxHeader.e E(int r3, int r4, int r5) {
            r2 = this;
            int r0 = r5 / 2
            com.scwang.smartrefresh.header.DropboxHeader$e r1 = r2.c
            com.scwang.smartrefresh.header.DropboxHeader$e r3 = r1.j(r3, r4, r5, r0)
            return r3
    }

    @androidx.annotation.NonNull
    private android.graphics.Path F(com.scwang.smartrefresh.header.DropboxHeader.e r6) {
            r5 = this;
            android.graphics.Path r0 = r5.a
            r0.reset()
            android.graphics.Path r0 = r5.a
            int r1 = com.scwang.smartrefresh.header.DropboxHeader.e.i(r6)
            float r1 = (float) r1
            int r2 = com.scwang.smartrefresh.header.DropboxHeader.e.e(r6)
            float r2 = (float) r2
            r0.moveTo(r1, r2)
            android.graphics.Path r0 = r5.a
            int r1 = com.scwang.smartrefresh.header.DropboxHeader.e.a(r6)
            float r1 = (float) r1
            int r2 = com.scwang.smartrefresh.header.DropboxHeader.e.d(r6)
            float r2 = (float) r2
            r0.lineTo(r1, r2)
            android.graphics.Path r0 = r5.a
            int r1 = com.scwang.smartrefresh.header.DropboxHeader.e.b(r6)
            float r1 = (float) r1
            int r2 = com.scwang.smartrefresh.header.DropboxHeader.e.e(r6)
            float r2 = (float) r2
            r0.lineTo(r1, r2)
            android.graphics.Path r0 = r5.a
            int r1 = com.scwang.smartrefresh.header.DropboxHeader.e.b(r6)
            float r1 = (float) r1
            int r2 = com.scwang.smartrefresh.header.DropboxHeader.e.f(r6)
            int r2 = r2 / 2
            float r2 = (float) r2
            float r3 = r5.k
            float r2 = r2 * r3
            float r1 = r1 + r2
            int r2 = com.scwang.smartrefresh.header.DropboxHeader.e.g(r6)
            float r2 = (float) r2
            int r3 = com.scwang.smartrefresh.header.DropboxHeader.e.b(r6)
            float r3 = (float) r3
            int r4 = com.scwang.smartrefresh.header.DropboxHeader.e.h(r6)
            float r4 = (float) r4
            r0.quadTo(r1, r2, r3, r4)
            android.graphics.Path r0 = r5.a
            int r1 = com.scwang.smartrefresh.header.DropboxHeader.e.a(r6)
            float r1 = (float) r1
            int r2 = com.scwang.smartrefresh.header.DropboxHeader.e.c(r6)
            float r2 = (float) r2
            r0.lineTo(r1, r2)
            android.graphics.Path r0 = r5.a
            int r1 = com.scwang.smartrefresh.header.DropboxHeader.e.i(r6)
            float r1 = (float) r1
            int r2 = com.scwang.smartrefresh.header.DropboxHeader.e.h(r6)
            float r2 = (float) r2
            r0.lineTo(r1, r2)
            android.graphics.Path r0 = r5.a
            int r1 = com.scwang.smartrefresh.header.DropboxHeader.e.i(r6)
            float r1 = (float) r1
            int r2 = com.scwang.smartrefresh.header.DropboxHeader.e.f(r6)
            int r2 = r2 / 2
            float r2 = (float) r2
            float r3 = r5.k
            float r2 = r2 * r3
            float r1 = r1 - r2
            int r2 = com.scwang.smartrefresh.header.DropboxHeader.e.g(r6)
            float r2 = (float) r2
            int r3 = com.scwang.smartrefresh.header.DropboxHeader.e.i(r6)
            float r3 = (float) r3
            int r6 = com.scwang.smartrefresh.header.DropboxHeader.e.e(r6)
            float r6 = (float) r6
            r0.quadTo(r1, r2, r3, r6)
            android.graphics.Path r6 = r5.a
            r6.close()
            android.graphics.Path r6 = r5.a
            return r6
    }

    @androidx.annotation.NonNull
    private android.graphics.Path G(com.scwang.smartrefresh.header.DropboxHeader.e r13) {
            r12 = this;
            android.graphics.Path r0 = r12.a
            r0.reset()
            int r0 = com.scwang.smartrefresh.header.DropboxHeader.e.a(r13)
            int r1 = com.scwang.smartrefresh.header.DropboxHeader.e.i(r13)
            int r0 = r0 - r1
            int r0 = r0 * 4
            int r0 = r0 / 5
            float r1 = r12.k
            double r1 = (double) r1
            r3 = 4608338209374269664(0x3ff41b2f769cf0e0, double:1.2566370614359172)
            double r1 = r1 * r3
            float r0 = (float) r0
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r3 = r1 / r3
            r5 = 4607394977673999205(0x3ff0c152382d7365, double:1.0471975511965976)
            double r3 = r5 - r3
            double r7 = java.lang.Math.sin(r3)
            float r7 = (float) r7
            float r7 = r7 * r0
            double r8 = java.lang.Math.cos(r3)
            float r8 = (float) r8
            float r8 = r8 * r0
            android.graphics.Path r9 = r12.a
            int r10 = com.scwang.smartrefresh.header.DropboxHeader.e.i(r13)
            float r10 = (float) r10
            int r11 = com.scwang.smartrefresh.header.DropboxHeader.e.h(r13)
            float r11 = (float) r11
            r9.moveTo(r10, r11)
            android.graphics.Path r9 = r12.a
            int r10 = com.scwang.smartrefresh.header.DropboxHeader.e.a(r13)
            float r10 = (float) r10
            int r11 = com.scwang.smartrefresh.header.DropboxHeader.e.c(r13)
            float r11 = (float) r11
            r9.lineTo(r10, r11)
            android.graphics.Path r9 = r12.a
            int r10 = com.scwang.smartrefresh.header.DropboxHeader.e.a(r13)
            float r10 = (float) r10
            float r10 = r10 - r7
            int r11 = com.scwang.smartrefresh.header.DropboxHeader.e.c(r13)
            float r11 = (float) r11
            float r11 = r11 - r8
            r9.lineTo(r10, r11)
            android.graphics.Path r9 = r12.a
            int r10 = com.scwang.smartrefresh.header.DropboxHeader.e.i(r13)
            float r10 = (float) r10
            float r10 = r10 - r7
            int r7 = com.scwang.smartrefresh.header.DropboxHeader.e.h(r13)
            float r7 = (float) r7
            float r7 = r7 - r8
            r9.lineTo(r10, r7)
            android.graphics.Path r7 = r12.a
            r7.close()
            double r1 = r1 + r5
            double r5 = java.lang.Math.sin(r1)
            float r5 = (float) r5
            float r5 = r5 * r0
            double r6 = java.lang.Math.cos(r1)
            float r6 = (float) r6
            float r6 = r6 * r0
            android.graphics.Path r7 = r12.a
            int r8 = com.scwang.smartrefresh.header.DropboxHeader.e.i(r13)
            float r8 = (float) r8
            int r9 = com.scwang.smartrefresh.header.DropboxHeader.e.h(r13)
            float r9 = (float) r9
            r7.moveTo(r8, r9)
            android.graphics.Path r7 = r12.a
            int r8 = com.scwang.smartrefresh.header.DropboxHeader.e.a(r13)
            float r8 = (float) r8
            int r9 = com.scwang.smartrefresh.header.DropboxHeader.e.d(r13)
            int r10 = com.scwang.smartrefresh.header.DropboxHeader.e.c(r13)
            int r9 = r9 + r10
            int r9 = r9 / 2
            float r9 = (float) r9
            r7.lineTo(r8, r9)
            android.graphics.Path r7 = r12.a
            int r8 = com.scwang.smartrefresh.header.DropboxHeader.e.a(r13)
            float r8 = (float) r8
            float r8 = r8 - r5
            int r9 = com.scwang.smartrefresh.header.DropboxHeader.e.d(r13)
            int r10 = com.scwang.smartrefresh.header.DropboxHeader.e.c(r13)
            int r9 = r9 + r10
            int r9 = r9 / 2
            float r9 = (float) r9
            float r9 = r9 + r6
            r7.lineTo(r8, r9)
            android.graphics.Path r7 = r12.a
            int r8 = com.scwang.smartrefresh.header.DropboxHeader.e.i(r13)
            float r8 = (float) r8
            float r8 = r8 - r5
            int r5 = com.scwang.smartrefresh.header.DropboxHeader.e.h(r13)
            float r5 = (float) r5
            float r5 = r5 + r6
            r7.lineTo(r8, r5)
            android.graphics.Path r5 = r12.a
            r5.close()
            double r5 = java.lang.Math.sin(r3)
            float r5 = (float) r5
            float r5 = r5 * r0
            double r3 = java.lang.Math.cos(r3)
            float r3 = (float) r3
            float r3 = r3 * r0
            android.graphics.Path r4 = r12.a
            int r6 = com.scwang.smartrefresh.header.DropboxHeader.e.b(r13)
            float r6 = (float) r6
            int r7 = com.scwang.smartrefresh.header.DropboxHeader.e.h(r13)
            float r7 = (float) r7
            r4.moveTo(r6, r7)
            android.graphics.Path r4 = r12.a
            int r6 = com.scwang.smartrefresh.header.DropboxHeader.e.a(r13)
            float r6 = (float) r6
            int r7 = com.scwang.smartrefresh.header.DropboxHeader.e.c(r13)
            float r7 = (float) r7
            r4.lineTo(r6, r7)
            android.graphics.Path r4 = r12.a
            int r6 = com.scwang.smartrefresh.header.DropboxHeader.e.a(r13)
            float r6 = (float) r6
            float r6 = r6 + r5
            int r7 = com.scwang.smartrefresh.header.DropboxHeader.e.c(r13)
            float r7 = (float) r7
            float r7 = r7 - r3
            r4.lineTo(r6, r7)
            android.graphics.Path r4 = r12.a
            int r6 = com.scwang.smartrefresh.header.DropboxHeader.e.b(r13)
            float r6 = (float) r6
            float r6 = r6 + r5
            int r5 = com.scwang.smartrefresh.header.DropboxHeader.e.h(r13)
            float r5 = (float) r5
            float r5 = r5 - r3
            r4.lineTo(r6, r5)
            android.graphics.Path r3 = r12.a
            r3.close()
            double r3 = java.lang.Math.sin(r1)
            float r3 = (float) r3
            float r3 = r3 * r0
            double r1 = java.lang.Math.cos(r1)
            float r1 = (float) r1
            float r0 = r0 * r1
            android.graphics.Path r1 = r12.a
            int r2 = com.scwang.smartrefresh.header.DropboxHeader.e.b(r13)
            float r2 = (float) r2
            int r4 = com.scwang.smartrefresh.header.DropboxHeader.e.h(r13)
            float r4 = (float) r4
            r1.moveTo(r2, r4)
            android.graphics.Path r1 = r12.a
            int r2 = com.scwang.smartrefresh.header.DropboxHeader.e.a(r13)
            float r2 = (float) r2
            int r4 = com.scwang.smartrefresh.header.DropboxHeader.e.d(r13)
            int r5 = com.scwang.smartrefresh.header.DropboxHeader.e.c(r13)
            int r4 = r4 + r5
            int r4 = r4 / 2
            float r4 = (float) r4
            r1.lineTo(r2, r4)
            android.graphics.Path r1 = r12.a
            int r2 = com.scwang.smartrefresh.header.DropboxHeader.e.a(r13)
            float r2 = (float) r2
            float r2 = r2 + r3
            int r4 = com.scwang.smartrefresh.header.DropboxHeader.e.d(r13)
            int r5 = com.scwang.smartrefresh.header.DropboxHeader.e.c(r13)
            int r4 = r4 + r5
            int r4 = r4 / 2
            float r4 = (float) r4
            float r4 = r4 + r0
            r1.lineTo(r2, r4)
            android.graphics.Path r1 = r12.a
            int r2 = com.scwang.smartrefresh.header.DropboxHeader.e.b(r13)
            float r2 = (float) r2
            float r2 = r2 + r3
            int r13 = com.scwang.smartrefresh.header.DropboxHeader.e.h(r13)
            float r13 = (float) r13
            float r13 = r13 + r0
            r1.lineTo(r2, r13)
            android.graphics.Path r13 = r12.a
            r13.close()
            android.graphics.Path r13 = r12.a
            return r13
    }

    @androidx.annotation.NonNull
    private android.graphics.Path H(com.scwang.smartrefresh.header.DropboxHeader.e r5, int r6) {
            r4 = this;
            android.graphics.Path r0 = r4.a
            r0.reset()
            android.graphics.Path r0 = r4.a
            int r1 = com.scwang.smartrefresh.header.DropboxHeader.e.h(r5)
            float r1 = (float) r1
            r2 = 0
            r0.lineTo(r2, r1)
            android.graphics.Path r0 = r4.a
            int r1 = com.scwang.smartrefresh.header.DropboxHeader.e.i(r5)
            float r1 = (float) r1
            int r3 = com.scwang.smartrefresh.header.DropboxHeader.e.h(r5)
            float r3 = (float) r3
            r0.lineTo(r1, r3)
            android.graphics.Path r0 = r4.a
            int r1 = com.scwang.smartrefresh.header.DropboxHeader.e.a(r5)
            float r1 = (float) r1
            int r3 = com.scwang.smartrefresh.header.DropboxHeader.e.g(r5)
            float r3 = (float) r3
            r0.lineTo(r1, r3)
            android.graphics.Path r0 = r4.a
            int r1 = com.scwang.smartrefresh.header.DropboxHeader.e.b(r5)
            float r1 = (float) r1
            int r3 = com.scwang.smartrefresh.header.DropboxHeader.e.h(r5)
            float r3 = (float) r3
            r0.lineTo(r1, r3)
            android.graphics.Path r0 = r4.a
            float r6 = (float) r6
            int r5 = com.scwang.smartrefresh.header.DropboxHeader.e.h(r5)
            float r5 = (float) r5
            r0.lineTo(r6, r5)
            android.graphics.Path r5 = r4.a
            r5.lineTo(r6, r2)
            android.graphics.Path r5 = r4.a
            r5.close()
            android.graphics.Path r5 = r4.a
            return r5
    }

    private int I() {
            r1 = this;
            int r0 = r1.e
            int r0 = r0 / 5
            return r0
    }

    private void J() {
            r5 = this;
            android.view.animation.AccelerateInterpolator r0 = new android.view.animation.AccelerateInterpolator
            r0.<init>()
            r1 = 3
            float[] r1 = new float[r1]
            r1 = {x0058: FILL_ARRAY_DATA , data: [0, 1065353216, 0} // fill-array
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            r5.l = r1
            r1.setInterpolator(r0)
            android.animation.ValueAnimator r1 = r5.l
            r2 = 300(0x12c, double:1.48E-321)
            r1.setDuration(r2)
            android.animation.ValueAnimator r1 = r5.l
            com.scwang.smartrefresh.header.DropboxHeader$a r4 = new com.scwang.smartrefresh.header.DropboxHeader$a
            r4.<init>(r5)
            r1.addUpdateListener(r4)
            android.animation.ValueAnimator r1 = r5.l
            com.scwang.smartrefresh.header.DropboxHeader$b r4 = new com.scwang.smartrefresh.header.DropboxHeader$b
            r4.<init>(r5)
            r1.addListener(r4)
            r1 = 2
            float[] r1 = new float[r1]
            r1 = {x0062: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            r5.m = r1
            r1.setInterpolator(r0)
            android.animation.ValueAnimator r0 = r5.m
            r0.setDuration(r2)
            android.animation.ValueAnimator r0 = r5.m
            com.scwang.smartrefresh.header.DropboxHeader$c r1 = new com.scwang.smartrefresh.header.DropboxHeader$c
            r1.<init>(r5)
            r0.addUpdateListener(r1)
            android.animation.ValueAnimator r0 = r5.m
            com.scwang.smartrefresh.header.DropboxHeader$d r1 = new com.scwang.smartrefresh.header.DropboxHeader$d
            r1.<init>(r5)
            r0.addListener(r1)
            return
    }

    private void K(android.content.Context r8, android.util.AttributeSet r9) {
            r7 = this;
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r7.a = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r7.b = r0
            com.scwang.smartrefresh.header.DropboxHeader$e r0 = new com.scwang.smartrefresh.header.DropboxHeader$e
            r1 = 0
            r0.<init>(r1)
            r7.c = r0
            android.graphics.Paint r0 = r7.b
            r1 = 1
            r0.setAntiAlias(r1)
            r0 = -9524737(0xffffffffff6ea9ff, float:-3.1723893E38)
            r7.d = r0
            r0 = -14141883(0xffffffffff283645, float:-2.2359209E38)
            r7.setBackgroundColor(r0)
            r0 = 1125515264(0x43160000, float:150.0)
            int r0 = com.scwang.smartrefresh.layout.util.c.b(r0)
            r7.setMinimumHeight(r0)
            int[] r0 = com.scwang.smartrefresh.header.R.styleable.DropboxHeader
            android.content.res.TypedArray r8 = r8.obtainStyledAttributes(r9, r0)
            int r9 = com.scwang.smartrefresh.header.R.styleable.DropboxHeader_dhDrawable1
            boolean r0 = r8.hasValue(r9)
            if (r0 == 0) goto L45
            android.graphics.drawable.Drawable r9 = r8.getDrawable(r9)
            r7.g = r9
            goto L64
        L45:
            com.scwang.smartrefresh.layout.internal.pathview.b r9 = new com.scwang.smartrefresh.layout.internal.pathview.b
            r9.<init>()
            java.lang.String r0 = "M3 2h18v20h-18z"
            java.lang.String r1 = "m4,1c-1.105,0 -2,0.895 -2,2v3,11 3,1c0,1.105 0.895,2 2,2h2,12 2c1.105,0 2,-0.895 2,-2v-1,-3 -11,-3c0,-1.105 -0.895,-2 -2,-2h-2,-12 -2zM3.5,3h1c0.276,0 0.5,0.224 0.5,0.5v1c0,0.276 -0.224,0.5 -0.5,0.5h-1c-0.276,0 -0.5,-0.224 -0.5,-0.5v-1c0,-0.276 0.224,-0.5 0.5,-0.5zM19.5,3h1c0.276,0 0.5,0.224 0.5,0.5v1c0,0.276 -0.224,0.5 -0.5,0.5h-1c-0.276,0 -0.5,-0.224 -0.5,-0.5v-1c0,-0.276 0.224,-0.5 0.5,-0.5zM3.5,6h1c0.276,0 0.5,0.224 0.5,0.5v1c0,0.276 -0.224,0.5 -0.5,0.5h-1c-0.276,0 -0.5,-0.224 -0.5,-0.5v-1c0,-0.276 0.224,-0.5 0.5,-0.5zM19.5,6h1c0.276,0 0.5,0.224 0.5,0.5v1c0,0.276 -0.224,0.5 -0.5,0.5h-1c-0.276,0 -0.5,-0.224 -0.5,-0.5v-1c0,-0.276 0.224,-0.5 0.5,-0.5zM3.5,9h1c0.276,0 0.5,0.224 0.5,0.5v1c0,0.276 -0.224,0.5 -0.5,0.5h-1c-0.276,0 -0.5,-0.224 -0.5,-0.5v-1c0,-0.276 0.224,-0.5 0.5,-0.5zM19.5,9h1c0.276,0 0.5,0.224 0.5,0.5v1c0,0.276 -0.224,0.5 -0.5,0.5h-1c-0.276,0 -0.5,-0.224 -0.5,-0.5v-1c0,-0.276 0.224,-0.5 0.5,-0.5zM3.5,12h1c0.276,0 0.5,0.224 0.5,0.5v1c0,0.276 -0.224,0.5 -0.5,0.5h-1c-0.276,0 -0.5,-0.224 -0.5,-0.5v-1c0,-0.276 0.224,-0.5 0.5,-0.5zM19.5,12h1c0.276,0 0.5,0.224 0.5,0.5v1c0,0.276 -0.224,0.5 -0.5,0.5h-1c-0.276,0 -0.5,-0.224 -0.5,-0.5v-1c0,-0.276 0.224,-0.5 0.5,-0.5zM3.5,15h1c0.276,0 0.5,0.224 0.5,0.5v1c0,0.276 -0.224,0.5 -0.5,0.5h-1c-0.276,0 -0.5,-0.224 -0.5,-0.5v-1c0,-0.276 0.224,-0.5 0.5,-0.5zM19.5,15h1c0.276,0 0.5,0.224 0.5,0.5v1c0,0.276 -0.224,0.5 -0.5,0.5h-1c-0.276,0 -0.5,-0.224 -0.5,-0.5v-1c0,-0.276 0.224,-0.5 0.5,-0.5zM3.5,18h1c0.276,0 0.5,0.224 0.5,0.5v1c0,0.276 -0.224,0.5 -0.5,0.5h-1c-0.276,0 -0.5,-0.224 -0.5,-0.5v-1c0,-0.276 0.224,-0.5 0.5,-0.5zM19.5,18h1c0.276,0 0.5,0.224 0.5,0.5v1c0,0.276 -0.224,0.5 -0.5,0.5h-1c-0.276,0 -0.5,-0.224 -0.5,-0.5v-1c0,-0.276 0.224,-0.5 0.5,-0.5z"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            r9.i(r0)
            r0 = -1249039(0xffffffffffecf0f1, float:NaN)
            r1 = -245496(0xfffffffffffc4108, float:NaN)
            int[] r0 = new int[]{r0, r1}
            r9.h(r0)
            r7.g = r9
        L64:
            int r9 = com.scwang.smartrefresh.header.R.styleable.DropboxHeader_dhDrawable2
            boolean r0 = r8.hasValue(r9)
            if (r0 == 0) goto L73
            android.graphics.drawable.Drawable r9 = r8.getDrawable(r9)
            r7.h = r9
            goto L9c
        L73:
            com.scwang.smartrefresh.layout.internal.pathview.b r9 = new com.scwang.smartrefresh.layout.internal.pathview.b
            r9.<init>()
            java.lang.String r5 = "M41,45.5L16,45.5c-0.55,0 -1,0.45 -1,1 0,0.55 0.45,1 1,1h25c0.55,0 1,-0.45 1,-1 0,-0.55 -0.45,-1 -1,-1z"
            java.lang.String r6 = "M49,16.5l-14,-14l0,14z"
            java.lang.String r0 = "M49,16.5l-14,-14l-27,0l0,53l41,0z"
            java.lang.String r1 = "m16,23.5h25c0.55,0 1,-0.45 1,-1 0,-0.55 -0.45,-1 -1,-1L16,21.5c-0.55,0 -1,0.45 -1,1 0,0.55 0.45,1 1,1z"
            java.lang.String r2 = "m16,15.5h10c0.55,0 1,-0.45 1,-1 0,-0.55 -0.45,-1 -1,-1L16,13.5c-0.55,0 -1,0.45 -1,1 0,0.55 0.45,1 1,1z"
            java.lang.String r3 = "M41,29.5L16,29.5c-0.55,0 -1,0.45 -1,1 0,0.55 0.45,1 1,1h25c0.55,0 1,-0.45 1,-1 0,-0.55 -0.45,-1 -1,-1z"
            java.lang.String r4 = "M41,37.5L16,37.5c-0.55,0 -1,0.45 -1,1 0,0.55 0.45,1 1,1h25c0.55,0 1,-0.45 1,-1 0,-0.55 -0.45,-1 -1,-1z"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6}
            r9.i(r0)
            r0 = -76695(0xfffffffffffed469, float:NaN)
            r1 = -2773417(0xffffffffffd5ae57, float:NaN)
            int[] r0 = new int[]{r0, r1}
            r9.h(r0)
            r7.h = r9
        L9c:
            int r9 = com.scwang.smartrefresh.header.R.styleable.DropboxHeader_dhDrawable3
            boolean r0 = r8.hasValue(r9)
            if (r0 == 0) goto Lab
            android.graphics.drawable.Drawable r9 = r8.getDrawable(r9)
            r7.i = r9
            goto Lc5
        Lab:
            com.scwang.smartrefresh.layout.internal.pathview.b r9 = new com.scwang.smartrefresh.layout.internal.pathview.b
            r9.<init>()
            java.lang.String r0 = "M6.021,2.188L6.021,11.362C5.46,11.327 4.843,11.414 4.229,11.663C2.624,12.312 1.696,13.729 2.155,14.825C2.62,15.924 4.294,16.284 5.898,15.634C7.131,15.134 7.856,14.184 7.965,13.272L7.958,4.387L15.02,3.028L15.02,9.406C14.422,9.343 13.746,9.432 13.076,9.703C11.471,10.353 10.544,11.77 11.004,12.866C11.467,13.964 13.141,14.325 14.746,13.675C15.979,13.174 16.836,12.224 16.947,11.313L16.958,0.002L6.021,2.188L6.021,2.188Z"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r9.i(r0)
            r0 = -6760607(0xffffffffff98d761, float:NaN)
            int[] r0 = new int[]{r0}
            r9.h(r0)
            r7.i = r9
        Lc5:
            r8.recycle()
            return
    }

    static /* synthetic */ float m(com.scwang.smartrefresh.header.DropboxHeader r0, float r1) {
            r0.k = r1
            return r1
    }

    static /* synthetic */ com.scwang.smartrefresh.layout.constant.RefreshState n(com.scwang.smartrefresh.header.DropboxHeader r0) {
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = r0.n
            return r0
    }

    static /* synthetic */ android.animation.ValueAnimator z(com.scwang.smartrefresh.header.DropboxHeader r0) {
            android.animation.ValueAnimator r0 = r0.m
            return r0
    }

    public void f(l2.g r1, int r2, int r3) {
            r0 = this;
            r0.e = r2
            int r1 = r0.I()
            android.graphics.drawable.Drawable r2 = r0.g
            r3 = 0
            r2.setBounds(r3, r3, r1, r1)
            android.graphics.drawable.Drawable r2 = r0.h
            r2.setBounds(r3, r3, r1, r1)
            android.graphics.drawable.Drawable r2 = r0.i
            r2.setBounds(r3, r3, r1, r1)
            return
    }

    public void g(float r1, int r2, int r3, int r4) {
            r0 = this;
            r1 = 0
            int r2 = r2 - r3
            int r1 = java.lang.Math.max(r1, r2)
            float r1 = (float) r1
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 * r2
            float r2 = (float) r4
            float r1 = r1 / r2
            r0.k = r1
            return
    }

    public com.scwang.smartrefresh.layout.constant.SpinnerStyle getSpinnerStyle() {
            r1 = this;
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r0 = com.scwang.smartrefresh.layout.constant.SpinnerStyle.Scale
            return r0
    }

    @androidx.annotation.NonNull
    public android.view.View getView() {
            r0 = this;
            return r0
    }

    public void i(l2.h r1, int r2, int r3) {
            r0 = this;
            return
    }

    public void j(float r1, int r2, int r3) {
            r0 = this;
            return
    }

    public boolean k() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
            r0 = this;
            super.onAttachedToWindow()
            r0.J()
            return
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
            r2 = this;
            super.onDetachedFromWindow()
            android.animation.ValueAnimator r0 = r2.l
            r1 = 0
            if (r0 == 0) goto L12
            r0.removeAllUpdateListeners()
            android.animation.ValueAnimator r0 = r2.l
            r0.removeAllListeners()
            r2.l = r1
        L12:
            android.animation.ValueAnimator r0 = r2.m
            if (r0 == 0) goto L20
            r0.removeAllUpdateListeners()
            android.animation.ValueAnimator r0 = r2.m
            r0.removeAllListeners()
            r2.m = r1
        L20:
            return
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r11) {
            r10 = this;
            int r0 = r10.getWidth()
            int r1 = r10.getHeight()
            int r2 = r10.I()
            com.scwang.smartrefresh.header.DropboxHeader$e r1 = r10.E(r0, r1, r2)
            android.graphics.Paint r2 = r10.b
            int r3 = r10.d
            r4 = 150(0x96, float:2.1E-43)
            int r3 = com.scwang.smartrefresh.layout.util.a.A(r3, r4)
            r2.setColor(r3)
            android.graphics.Path r2 = r10.F(r1)
            android.graphics.Paint r3 = r10.b
            r11.drawPath(r2, r3)
            android.graphics.Paint r2 = r10.b
            int r3 = r10.d
            r2.setColor(r3)
            android.graphics.Path r2 = r10.G(r1)
            android.graphics.Paint r3 = r10.b
            r11.drawPath(r2, r3)
            boolean r2 = r10.isInEditMode()
            if (r2 == 0) goto L40
            r2 = 1075838976(0x40200000, float:2.5)
            r10.j = r2
        L40:
            float r2 = r10.j
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L151
            android.graphics.Path r2 = r10.H(r1, r0)
            r11.clipPath(r2)
            float r2 = r10.j
            r4 = 1065353216(0x3f800000, float:1.0)
            float r2 = java.lang.Math.min(r2, r4)
            android.graphics.drawable.Drawable r5 = r10.g
            android.graphics.Rect r5 = r5.getBounds()
            int r0 = r0 / 2
            int r6 = r5.width()
            int r6 = r6 / 2
            int r6 = r0 - r6
            int r7 = com.scwang.smartrefresh.header.DropboxHeader.e.g(r1)
            int r8 = r5.height()
            int r8 = r8 / 2
            int r7 = r7 - r8
            int r8 = r5.height()
            int r7 = r7 + r8
            float r7 = (float) r7
            float r7 = r7 * r2
            int r2 = (int) r7
            int r7 = r5.height()
            int r2 = r2 - r7
            r5.offsetTo(r6, r2)
            android.graphics.drawable.Drawable r2 = r10.g
            r2.draw(r11)
            float r2 = r10.j
            float r2 = r2 - r4
            float r2 = java.lang.Math.max(r2, r3)
            float r2 = java.lang.Math.min(r2, r4)
            android.graphics.drawable.Drawable r6 = r10.h
            android.graphics.Rect r6 = r6.getBounds()
            int r7 = r6.width()
            int r7 = r7 / 2
            int r7 = r0 - r7
            int r8 = com.scwang.smartrefresh.header.DropboxHeader.e.g(r1)
            int r9 = r6.height()
            int r9 = r9 / 2
            int r8 = r8 - r9
            int r9 = r6.height()
            int r8 = r8 + r9
            float r8 = (float) r8
            float r8 = r8 * r2
            int r2 = (int) r8
            int r8 = r6.height()
            int r2 = r2 - r8
            r6.offsetTo(r7, r2)
            android.graphics.drawable.Drawable r2 = r10.h
            r2.draw(r11)
            float r2 = r10.j
            r7 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 - r7
            float r2 = java.lang.Math.max(r2, r3)
            float r2 = java.lang.Math.min(r2, r4)
            android.graphics.drawable.Drawable r3 = r10.i
            android.graphics.Rect r3 = r3.getBounds()
            int r4 = r3.width()
            int r4 = r4 / 2
            int r4 = r0 - r4
            int r7 = com.scwang.smartrefresh.header.DropboxHeader.e.g(r1)
            int r8 = r3.height()
            int r8 = r8 / 2
            int r7 = r7 - r8
            int r8 = r3.height()
            int r7 = r7 + r8
            float r7 = (float) r7
            float r7 = r7 * r2
            int r2 = (int) r7
            int r7 = r3.height()
            int r2 = r2 - r7
            r3.offsetTo(r4, r2)
            android.graphics.drawable.Drawable r2 = r10.i
            r2.draw(r11)
            boolean r2 = r10.f
            if (r2 == 0) goto L151
            int r2 = r5.width()
            int r2 = r2 / 2
            int r2 = r0 - r2
            int r4 = com.scwang.smartrefresh.header.DropboxHeader.e.g(r1)
            int r7 = r5.height()
            int r7 = r7 / 2
            int r4 = r4 - r7
            r5.offsetTo(r2, r4)
            android.graphics.drawable.Drawable r2 = r10.g
            r2.draw(r11)
            int r2 = r6.width()
            int r2 = r2 / 2
            int r2 = r0 - r2
            int r4 = com.scwang.smartrefresh.header.DropboxHeader.e.g(r1)
            int r5 = r6.height()
            int r5 = r5 / 2
            int r4 = r4 - r5
            r6.offsetTo(r2, r4)
            android.graphics.drawable.Drawable r2 = r10.h
            r2.draw(r11)
            int r2 = r3.width()
            int r2 = r2 / 2
            int r0 = r0 - r2
            int r1 = com.scwang.smartrefresh.header.DropboxHeader.e.g(r1)
            int r2 = r3.height()
            int r2 = r2 / 2
            int r1 = r1 - r2
            r3.offsetTo(r0, r1)
            android.graphics.drawable.Drawable r0 = r10.i
            r0.draw(r11)
        L151:
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r2, int r3) {
            r1 = this;
            int r0 = r1.getSuggestedMinimumWidth()
            int r2 = android.view.View.resolveSize(r0, r2)
            int r0 = r1.getSuggestedMinimumHeight()
            int r3 = android.view.View.resolveSize(r0, r3)
            r1.setMeasuredDimension(r2, r3)
            return
    }

    public void q(l2.h r1, com.scwang.smartrefresh.layout.constant.RefreshState r2, com.scwang.smartrefresh.layout.constant.RefreshState r3) {
            r0 = this;
            r0.n = r3
            com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.None
            if (r3 != r1) goto L9
            r1 = 0
            r0.f = r1
        L9:
            return
    }

    @java.lang.Deprecated
    public void setPrimaryColors(@androidx.annotation.ColorInt int... r3) {
            r2 = this;
            int r0 = r3.length
            if (r0 <= 0) goto L11
            r0 = 0
            r0 = r3[r0]
            r2.setBackgroundColor(r0)
            int r0 = r3.length
            r1 = 1
            if (r0 <= r1) goto L11
            r3 = r3[r1]
            r2.d = r3
        L11:
            return
    }

    public void t(l2.h r1, int r2, int r3) {
            r0 = this;
            android.animation.ValueAnimator r1 = r0.m
            if (r1 == 0) goto L7
            r1.start()
        L7:
            return
    }

    public int w(l2.h r1, boolean r2) {
            r0 = this;
            r1 = 0
            r0.j = r1
            r1 = 0
            return r1
    }

    public void x(float r2, int r3, int r4, int r5) {
            r1 = this;
            com.scwang.smartrefresh.layout.constant.RefreshState r2 = r1.n
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = com.scwang.smartrefresh.layout.constant.RefreshState.Refreshing
            if (r2 == r0) goto L15
            r2 = 0
            int r3 = r3 - r4
            int r2 = java.lang.Math.max(r2, r3)
            float r2 = (float) r2
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 * r3
            float r3 = (float) r5
            float r2 = r2 / r3
            r1.k = r2
        L15:
            return
    }
}
