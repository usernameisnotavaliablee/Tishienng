package com.bxkj.base.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ViewSwitcher extends android.widget.FrameLayout {
    private static final int d = 500;
    private static final java.lang.String e = "translationY";
    private static final int f = 60;
    private android.content.Context a;
    private boolean b;
    private android.view.View.OnClickListener c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.view.View.OnClickListener {
        final /* synthetic */ int a;
        final /* synthetic */ android.view.View b;
        final /* synthetic */ com.bxkj.base.view.ViewSwitcher c;

        a(com.bxkj.base.view.ViewSwitcher r1, int r2, android.view.View r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        public void a(int r14) {
                r13 = this;
                java.lang.String r0 = "onClickFirstCard"
                com.orhanobut.logger.j.c(r0)
                android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
                r0.<init>()
                com.bxkj.base.view.ViewSwitcher r1 = r13.c
                int r1 = r1.getChildCount()
                r2 = 0
                r3 = 0
                r4 = 0
            L13:
                if (r3 >= r1) goto L95
                com.bxkj.base.view.ViewSwitcher r5 = r13.c
                android.view.View r5 = r5.getChildAt(r3)
                int r6 = r5.getVisibility()
                if (r6 != 0) goto L91
                r6 = 2
                java.lang.String r7 = "translationY"
                r8 = 1
                if (r4 != r14) goto L53
                com.bxkj.base.view.ViewSwitcher r9 = r13.c
                android.content.Context r9 = com.bxkj.base.view.ViewSwitcher.b(r9)
                com.bxkj.base.view.ViewSwitcher r10 = r13.c
                int r10 = r10.getRealChildCount()
                int r10 = r10 - r8
                int r10 = r10 * (-60)
                float r10 = (float) r10
                int r9 = com.bxkj.base.view.ViewSwitcher.f(r9, r10)
                float r9 = (float) r9
                float[] r6 = new float[r6]
                r6[r2] = r9
                r9 = 0
                r6[r8] = r9
                android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r5, r7, r6)
                com.bxkj.base.view.ViewSwitcher r6 = r13.c
                android.view.View r7 = r13.b
                android.animation.Animator$AnimatorListener r6 = com.bxkj.base.view.ViewSwitcher.e(r6, r4, r7, r1)
                r5.addListener(r6)
                goto L85
            L53:
                com.bxkj.base.view.ViewSwitcher r9 = r13.c
                android.content.Context r9 = com.bxkj.base.view.ViewSwitcher.b(r9)
                int r10 = r4 + (-1)
                int r10 = r10 * 60
                float r10 = (float) r10
                int r9 = com.bxkj.base.view.ViewSwitcher.f(r9, r10)
                float r9 = (float) r9
                float r10 = r5.getY()
                float r10 = r10 - r9
                float r11 = r5.getY()
                float r11 = r11 - r9
                com.bxkj.base.view.ViewSwitcher r9 = r13.c
                android.content.Context r9 = com.bxkj.base.view.ViewSwitcher.b(r9)
                r12 = 1114636288(0x42700000, float:60.0)
                int r9 = com.bxkj.base.view.ViewSwitcher.f(r9, r12)
                float r9 = (float) r9
                float r11 = r11 - r9
                float[] r6 = new float[r6]
                r6[r2] = r10
                r6[r8] = r11
                android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r5, r7, r6)
            L85:
                if (r5 == 0) goto L8f
                r6 = 500(0x1f4, double:2.47E-321)
                r5.setDuration(r6)
                r0.play(r5)
            L8f:
                int r4 = r4 + 1
            L91:
                int r3 = r3 + 1
                goto L13
            L95:
                r0.start()
                return
        }

        public void b() {
                r13 = this;
                java.lang.String r0 = "onClickFirstCard"
                com.orhanobut.logger.j.c(r0)
                android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
                r0.<init>()
                com.bxkj.base.view.ViewSwitcher r1 = r13.c
                int r1 = r1.getChildCount()
                r2 = 0
                r3 = 0
                r4 = 0
            L13:
                if (r3 >= r1) goto Lbd
                com.bxkj.base.view.ViewSwitcher r5 = r13.c
                android.view.View r5 = r5.getChildAt(r3)
                int r6 = r5.getVisibility()
                if (r6 != 0) goto Lb9
                r6 = 2
                java.lang.String r7 = "translationY"
                r8 = 1
                if (r4 != 0) goto L67
                com.bxkj.base.view.ViewSwitcher r9 = r13.c
                android.content.Context r9 = com.bxkj.base.view.ViewSwitcher.b(r9)
                com.bxkj.base.view.ViewSwitcher r10 = r13.c
                int r10 = r10.getRealChildCount()
                int r10 = r10 - r8
                int r10 = r10 * (-60)
                float r10 = (float) r10
                int r9 = com.bxkj.base.view.ViewSwitcher.f(r9, r10)
                float r9 = (float) r9
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "onClickFirstCard-downFactor="
                r10.append(r11)
                r10.append(r9)
                java.lang.String r10 = r10.toString()
                com.orhanobut.logger.j.c(r10)
                float[] r6 = new float[r6]
                r6[r2] = r9
                r9 = 0
                r6[r8] = r9
                android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r5, r7, r6)
                com.bxkj.base.view.ViewSwitcher r6 = r13.c
                android.view.View r7 = r13.b
                android.animation.Animator$AnimatorListener r6 = com.bxkj.base.view.ViewSwitcher.e(r6, r4, r7, r1)
                r5.addListener(r6)
                goto Lad
            L67:
                com.bxkj.base.view.ViewSwitcher r9 = r13.c
                android.content.Context r9 = com.bxkj.base.view.ViewSwitcher.b(r9)
                int r10 = r4 + (-1)
                int r10 = r10 * 60
                float r10 = (float) r10
                int r9 = com.bxkj.base.view.ViewSwitcher.f(r9, r10)
                float r9 = (float) r9
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "onClickFirstCard-upFactor="
                r10.append(r11)
                r10.append(r9)
                java.lang.String r10 = r10.toString()
                com.orhanobut.logger.j.c(r10)
                float r10 = r5.getY()
                float r10 = r10 - r9
                float r11 = r5.getY()
                float r11 = r11 - r9
                com.bxkj.base.view.ViewSwitcher r9 = r13.c
                android.content.Context r9 = com.bxkj.base.view.ViewSwitcher.b(r9)
                r12 = 1114636288(0x42700000, float:60.0)
                int r9 = com.bxkj.base.view.ViewSwitcher.f(r9, r12)
                float r9 = (float) r9
                float r11 = r11 - r9
                float[] r6 = new float[r6]
                r6[r2] = r10
                r6[r8] = r11
                android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r5, r7, r6)
            Lad:
                if (r5 == 0) goto Lb7
                r6 = 500(0x1f4, double:2.47E-321)
                r5.setDuration(r6)
                r0.play(r5)
            Lb7:
                int r4 = r4 + 1
            Lb9:
                int r3 = r3 + 1
                goto L13
            Lbd:
                r0.start()
                return
        }

        public void c(int r14, android.view.View r15) {
                r13 = this;
                java.lang.String r0 = "onClickOtherCard"
                com.orhanobut.logger.j.c(r0)
                android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
                r0.<init>()
                com.bxkj.base.view.ViewSwitcher r1 = r13.c
                int r1 = r1.getChildCount()
                r2 = 0
                r3 = r14
                r4 = 0
            L13:
                if (r3 >= r1) goto Lbc
                com.bxkj.base.view.ViewSwitcher r5 = r13.c
                android.view.View r5 = r5.getChildAt(r3)
                int r6 = r5.getVisibility()
                if (r6 != 0) goto Lb8
                r6 = 2
                java.lang.String r7 = "translationY"
                r8 = 1
                if (r4 != r14) goto L66
                com.bxkj.base.view.ViewSwitcher r9 = r13.c
                android.content.Context r9 = com.bxkj.base.view.ViewSwitcher.b(r9)
                com.bxkj.base.view.ViewSwitcher r10 = r13.c
                int r10 = r10.getRealChildCount()
                int r10 = r10 - r4
                int r10 = r10 - r8
                int r10 = r10 * (-60)
                float r10 = (float) r10
                int r9 = com.bxkj.base.view.ViewSwitcher.f(r9, r10)
                float r9 = (float) r9
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "onClickOtherCard-downFactor="
                r10.append(r11)
                r10.append(r9)
                java.lang.String r10 = r10.toString()
                com.orhanobut.logger.j.c(r10)
                float[] r6 = new float[r6]
                r6[r2] = r9
                r9 = 0
                r6[r8] = r9
                android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r5, r7, r6)
                com.bxkj.base.view.ViewSwitcher r6 = r13.c
                android.animation.Animator$AnimatorListener r6 = com.bxkj.base.view.ViewSwitcher.e(r6, r4, r15, r1)
                r5.addListener(r6)
                goto Lac
            L66:
                com.bxkj.base.view.ViewSwitcher r9 = r13.c
                android.content.Context r9 = com.bxkj.base.view.ViewSwitcher.b(r9)
                int r10 = r4 + (-1)
                int r10 = r10 * 60
                float r10 = (float) r10
                int r9 = com.bxkj.base.view.ViewSwitcher.f(r9, r10)
                float r9 = (float) r9
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "onClickOtherCard-upFactor="
                r10.append(r11)
                r10.append(r9)
                java.lang.String r10 = r10.toString()
                com.orhanobut.logger.j.c(r10)
                float r10 = r5.getY()
                float r10 = r10 - r9
                float r11 = r5.getY()
                float r11 = r11 - r9
                com.bxkj.base.view.ViewSwitcher r9 = r13.c
                android.content.Context r9 = com.bxkj.base.view.ViewSwitcher.b(r9)
                r12 = 1114636288(0x42700000, float:60.0)
                int r9 = com.bxkj.base.view.ViewSwitcher.f(r9, r12)
                float r9 = (float) r9
                float r11 = r11 - r9
                float[] r6 = new float[r6]
                r6[r2] = r10
                r6[r8] = r11
                android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r5, r7, r6)
            Lac:
                if (r5 == 0) goto Lb6
                r6 = 500(0x1f4, double:2.47E-321)
                r5.setDuration(r6)
                r0.play(r5)
            Lb6:
                int r4 = r4 + 1
            Lb8:
                int r3 = r3 + 1
                goto L13
            Lbc:
                r0.start()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r3) {
                r2 = this;
                com.bxkj.base.view.ViewSwitcher r3 = r2.c
                boolean r3 = com.bxkj.base.view.ViewSwitcher.a(r3)
                if (r3 == 0) goto L9
                return
            L9:
                com.bxkj.base.view.ViewSwitcher r3 = r2.c
                int r3 = r3.getRealChildCount()
                r0 = 1
                int r3 = r3 - r0
                int r1 = r2.a
                if (r1 == r3) goto L20
                com.bxkj.base.view.ViewSwitcher r3 = r2.c
                com.bxkj.base.view.ViewSwitcher.d(r3, r0)
                int r3 = r2.a
                r2.a(r3)
                return
            L20:
                com.bxkj.base.view.ViewSwitcher r3 = r2.c
                android.view.View$OnClickListener r3 = com.bxkj.base.view.ViewSwitcher.c(r3)
                if (r3 == 0) goto L33
                com.bxkj.base.view.ViewSwitcher r3 = r2.c
                android.view.View$OnClickListener r3 = com.bxkj.base.view.ViewSwitcher.c(r3)
                android.view.View r0 = r2.b
                r3.onClick(r0)
            L33:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements android.animation.Animator.AnimatorListener {
        final /* synthetic */ android.view.View a;
        final /* synthetic */ com.bxkj.base.view.ViewSwitcher b;

        b(com.bxkj.base.view.ViewSwitcher r1, android.view.View r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        private void a(android.view.View r1) {
                r0 = this;
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
                com.bxkj.base.view.ViewSwitcher r2 = r1.b
                r0 = 0
                com.bxkj.base.view.ViewSwitcher.d(r2, r0)
                return
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(android.animation.Animator r1) {
                r0 = this;
                return
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r2) {
                r1 = this;
                com.bxkj.base.view.ViewSwitcher r2 = r1.b
                android.view.View r0 = r1.a
                r2.removeView(r0)
                com.bxkj.base.view.ViewSwitcher r2 = r1.b
                android.view.View r0 = r1.a
                r2.addView(r0)
                return
        }
    }

    public ViewSwitcher(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ViewSwitcher(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public ViewSwitcher(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.a = r1
            return
    }

    static /* bridge */ /* synthetic */ boolean a(com.bxkj.base.view.ViewSwitcher r0) {
            boolean r0 = r0.b
            return r0
    }

    static /* bridge */ /* synthetic */ android.content.Context b(com.bxkj.base.view.ViewSwitcher r0) {
            android.content.Context r0 = r0.a
            return r0
    }

    static /* bridge */ /* synthetic */ android.view.View.OnClickListener c(com.bxkj.base.view.ViewSwitcher r0) {
            android.view.View$OnClickListener r0 = r0.c
            return r0
    }

    static /* bridge */ /* synthetic */ void d(com.bxkj.base.view.ViewSwitcher r0, boolean r1) {
            r0.b = r1
            return
    }

    static /* bridge */ /* synthetic */ android.animation.Animator.AnimatorListener e(com.bxkj.base.view.ViewSwitcher r0, int r1, android.view.View r2, int r3) {
            android.animation.Animator$AnimatorListener r0 = r0.g(r1, r2, r3)
            return r0
    }

    public static int f(android.content.Context r0, float r1) {
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            return r0
    }

    private android.animation.Animator.AnimatorListener g(int r1, android.view.View r2, int r3) {
            r0 = this;
            com.bxkj.base.view.ViewSwitcher$b r1 = new com.bxkj.base.view.ViewSwitcher$b
            r1.<init>(r0, r2)
            return r1
    }

    private android.view.View.OnClickListener h(android.view.View r2, int r3) {
            r1 = this;
            com.bxkj.base.view.ViewSwitcher$a r0 = new com.bxkj.base.view.ViewSwitcher$a
            r0.<init>(r1, r3, r2)
            return r0
    }

    public android.view.View.OnClickListener getClickListener() {
            r1 = this;
            android.view.View$OnClickListener r0 = r1.c
            return r0
    }

    public int getRealChildCount() {
            r4 = this;
            int r0 = super.getChildCount()
            r1 = 0
            r2 = 0
        L6:
            if (r1 >= r0) goto L19
            android.view.View r3 = r4.getChildAt(r1)
            if (r3 == 0) goto L16
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L16
            int r2 = r2 + 1
        L16:
            int r1 = r1 + 1
            goto L6
        L19:
            return r2
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r1) {
            r0 = this;
            super.onDraw(r1)
            return
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            return
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int r11, int r12) {
            r10 = this;
            int r0 = r10.getChildCount()
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
        L9:
            if (r2 >= r0) goto L4b
            android.view.View r6 = r10.getChildAt(r2)
            int r7 = r6.getVisibility()
            if (r7 != 0) goto L48
            r10.measureChild(r6, r11, r12)
            int r7 = r6.getMeasuredHeight()
            if (r4 != 0) goto L20
        L1e:
            int r3 = r3 + r7
            goto L29
        L20:
            android.content.Context r7 = r10.a
            r8 = 1114636288(0x42700000, float:60.0)
            int r7 = f(r7, r8)
            goto L1e
        L29:
            android.widget.FrameLayout$LayoutParams r7 = new android.widget.FrameLayout$LayoutParams
            r8 = -1
            r9 = -2
            r7.<init>(r8, r9)
            android.content.Context r8 = r10.a
            float r9 = (float) r5
            int r8 = f(r8, r9)
            r7.setMargins(r1, r8, r1, r1)
            r6.setLayoutParams(r7)
            android.view.View$OnClickListener r7 = r10.h(r6, r4)
            r6.setOnClickListener(r7)
            int r4 = r4 + 1
            int r5 = r5 + 60
        L48:
            int r2 = r2 + 1
            goto L9
        L4b:
            super.onMeasure(r11, r3)
            return
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener r1) {
            r0 = this;
            r0.c = r1
            return
    }
}
