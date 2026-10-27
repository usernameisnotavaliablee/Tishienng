package com.romainpiel.shimmer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class b {
    public static final int g = 0;
    public static final int h = 1;
    private static final int i = -1;
    private static final long j = 1000;
    private static final long k = 0;
    private static final int l = 0;
    private int a;
    private long b;
    private long c;
    private int d;
    private android.animation.Animator.AnimatorListener e;
    private android.animation.ObjectAnimator f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements java.lang.Runnable {
        final /* synthetic */ android.view.View a;
        final /* synthetic */ com.romainpiel.shimmer.b b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.romainpiel.shimmer.b$a$a, reason: collision with other inner class name */
        class C0179a implements android.animation.Animator.AnimatorListener {
            final /* synthetic */ com.romainpiel.shimmer.b.a a;

            C0179a(com.romainpiel.shimmer.b.a r1) {
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
                    com.romainpiel.shimmer.b$a r2 = r1.a
                    android.view.View r2 = r2.a
                    com.romainpiel.shimmer.c r2 = (com.romainpiel.shimmer.c) r2
                    r0 = 0
                    r2.setShimmering(r0)
                    com.romainpiel.shimmer.b$a r2 = r1.a
                    android.view.View r2 = r2.a
                    r2.postInvalidateOnAnimation()
                    com.romainpiel.shimmer.b$a r2 = r1.a
                    com.romainpiel.shimmer.b r2 = r2.b
                    r0 = 0
                    com.romainpiel.shimmer.b.c(r2, r0)
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

        a(com.romainpiel.shimmer.b r1, android.view.View r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r7 = this;
                android.view.View r0 = r7.a
                com.romainpiel.shimmer.c r0 = (com.romainpiel.shimmer.c) r0
                r1 = 1
                r0.setShimmering(r1)
                android.view.View r0 = r7.a
                int r0 = r0.getWidth()
                float r0 = (float) r0
                com.romainpiel.shimmer.b r2 = r7.b
                int r2 = com.romainpiel.shimmer.b.a(r2)
                r3 = 0
                if (r2 != r1) goto L21
                android.view.View r0 = r7.a
                int r0 = r0.getWidth()
                float r0 = (float) r0
                r3 = r0
                r0 = 0
            L21:
                com.romainpiel.shimmer.b r2 = r7.b
                android.view.View r4 = r7.a
                r5 = 2
                float[] r5 = new float[r5]
                r6 = 0
                r5[r6] = r3
                r5[r1] = r0
                java.lang.String r0 = "gradientX"
                android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r4, r0, r5)
                com.romainpiel.shimmer.b.c(r2, r0)
                com.romainpiel.shimmer.b r0 = r7.b
                android.animation.ObjectAnimator r0 = com.romainpiel.shimmer.b.b(r0)
                com.romainpiel.shimmer.b r1 = r7.b
                int r1 = com.romainpiel.shimmer.b.d(r1)
                r0.setRepeatCount(r1)
                com.romainpiel.shimmer.b r0 = r7.b
                android.animation.ObjectAnimator r0 = com.romainpiel.shimmer.b.b(r0)
                com.romainpiel.shimmer.b r1 = r7.b
                long r1 = com.romainpiel.shimmer.b.e(r1)
                r0.setDuration(r1)
                com.romainpiel.shimmer.b r0 = r7.b
                android.animation.ObjectAnimator r0 = com.romainpiel.shimmer.b.b(r0)
                com.romainpiel.shimmer.b r1 = r7.b
                long r1 = com.romainpiel.shimmer.b.f(r1)
                r0.setStartDelay(r1)
                com.romainpiel.shimmer.b r0 = r7.b
                android.animation.ObjectAnimator r0 = com.romainpiel.shimmer.b.b(r0)
                com.romainpiel.shimmer.b$a$a r1 = new com.romainpiel.shimmer.b$a$a
                r1.<init>(r7)
                r0.addListener(r1)
                com.romainpiel.shimmer.b r0 = r7.b
                android.animation.Animator$AnimatorListener r0 = com.romainpiel.shimmer.b.g(r0)
                if (r0 == 0) goto L88
                com.romainpiel.shimmer.b r0 = r7.b
                android.animation.ObjectAnimator r0 = com.romainpiel.shimmer.b.b(r0)
                com.romainpiel.shimmer.b r1 = r7.b
                android.animation.Animator$AnimatorListener r1 = com.romainpiel.shimmer.b.g(r1)
                r0.addListener(r1)
            L88:
                com.romainpiel.shimmer.b r0 = r7.b
                android.animation.ObjectAnimator r0 = com.romainpiel.shimmer.b.b(r0)
                r0.start()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.romainpiel.shimmer.b$b, reason: collision with other inner class name */
    class C0180b implements com.romainpiel.shimmer.d.a {
        final /* synthetic */ java.lang.Runnable a;
        final /* synthetic */ com.romainpiel.shimmer.b b;

        C0180b(com.romainpiel.shimmer.b r1, java.lang.Runnable r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // com.romainpiel.shimmer.d.a
        public void a(android.view.View r1) {
                r0 = this;
                java.lang.Runnable r1 = r0.a
                r1.run()
                return
        }
    }

    public b() {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.a = r0
            r0 = 1000(0x3e8, double:4.94E-321)
            r2.b = r0
            r0 = 0
            r2.c = r0
            r0 = 0
            r2.d = r0
            return
    }

    static /* synthetic */ int a(com.romainpiel.shimmer.b r0) {
            int r0 = r0.d
            return r0
    }

    static /* synthetic */ android.animation.ObjectAnimator b(com.romainpiel.shimmer.b r0) {
            android.animation.ObjectAnimator r0 = r0.f
            return r0
    }

    static /* synthetic */ android.animation.ObjectAnimator c(com.romainpiel.shimmer.b r0, android.animation.ObjectAnimator r1) {
            r0.f = r1
            return r1
    }

    static /* synthetic */ int d(com.romainpiel.shimmer.b r0) {
            int r0 = r0.a
            return r0
    }

    static /* synthetic */ long e(com.romainpiel.shimmer.b r2) {
            long r0 = r2.b
            return r0
    }

    static /* synthetic */ long f(com.romainpiel.shimmer.b r2) {
            long r0 = r2.c
            return r0
    }

    static /* synthetic */ android.animation.Animator.AnimatorListener g(com.romainpiel.shimmer.b r0) {
            android.animation.Animator$AnimatorListener r0 = r0.e
            return r0
    }

    public void h() {
            r1 = this;
            android.animation.ObjectAnimator r0 = r1.f
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            return
    }

    public android.animation.Animator.AnimatorListener i() {
            r1 = this;
            android.animation.Animator$AnimatorListener r0 = r1.e
            return r0
    }

    public int j() {
            r1 = this;
            int r0 = r1.d
            return r0
    }

    public long k() {
            r2 = this;
            long r0 = r2.b
            return r0
    }

    public int l() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    public long m() {
            r2 = this;
            long r0 = r2.c
            return r0
    }

    public boolean n() {
            r1 = this;
            android.animation.ObjectAnimator r0 = r1.f
            if (r0 == 0) goto Lc
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public com.romainpiel.shimmer.b o(android.animation.Animator.AnimatorListener r1) {
            r0 = this;
            r0.e = r1
            return r0
    }

    public com.romainpiel.shimmer.b p(int r2) {
            r1 = this;
            if (r2 == 0) goto Le
            r0 = 1
            if (r2 != r0) goto L6
            goto Le
        L6:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The animation direction must be either ANIMATION_DIRECTION_LTR or ANIMATION_DIRECTION_RTL"
            r2.<init>(r0)
            throw r2
        Le:
            r1.d = r2
            return r1
    }

    public com.romainpiel.shimmer.b q(long r1) {
            r0 = this;
            r0.b = r1
            return r0
    }

    public com.romainpiel.shimmer.b r(int r1) {
            r0 = this;
            r0.a = r1
            return r0
    }

    public com.romainpiel.shimmer.b s(long r1) {
            r0 = this;
            r0.c = r1
            return r0
    }

    public <V extends android.view.View & com.romainpiel.shimmer.c> void t(V r3) {
            r2 = this;
            boolean r0 = r2.n()
            if (r0 == 0) goto L7
            return
        L7:
            com.romainpiel.shimmer.b$a r0 = new com.romainpiel.shimmer.b$a
            r0.<init>(r2, r3)
            com.romainpiel.shimmer.c r3 = (com.romainpiel.shimmer.c) r3
            boolean r1 = r3.a()
            if (r1 != 0) goto L1d
            com.romainpiel.shimmer.b$b r1 = new com.romainpiel.shimmer.b$b
            r1.<init>(r2, r0)
            r3.setAnimationSetupCallback(r1)
            return
        L1d:
            r0.run()
            return
    }
}
