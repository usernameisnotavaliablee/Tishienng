package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class k6 {
    private final android.animation.ValueAnimator a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.animation.Animator.AnimatorListener {
        final /* synthetic */ xyz.adscope.ad.k6 a;

        a(xyz.adscope.ad.k6 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@androidx.annotation.NonNull android.animation.Animator r2) {
                r1 = this;
                xyz.adscope.ad.k6 r0 = r1.a
                r0.a(r2)
                return
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@androidx.annotation.NonNull android.animation.Animator r2) {
                r1 = this;
                xyz.adscope.ad.k6 r0 = r1.a
                r0.b(r2)
                return
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@androidx.annotation.NonNull android.animation.Animator r2) {
                r1 = this;
                xyz.adscope.ad.k6 r0 = r1.a
                r0.c(r2)
                return
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@androidx.annotation.NonNull android.animation.Animator r2) {
                r1 = this;
                xyz.adscope.ad.k6 r0 = r1.a
                r0.d(r2)
                return
        }
    }

    public k6(int r1, int r2, long r3) {
            r0 = this;
            r0.<init>()
            int[] r1 = new int[]{r1, r2}
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofInt(r1)
            r0.a = r1
            r1.setDuration(r3)
            r0.a()
            return
    }

    private void a() {
            r2 = this;
            android.animation.ValueAnimator r0 = r2.a
            xyz.adscope.ad.k7 r1 = new xyz.adscope.ad.k7
            r1.<init>(r2)
            r0.addUpdateListener(r1)
            android.animation.ValueAnimator r0 = r2.a
            xyz.adscope.ad.k6$a r1 = new xyz.adscope.ad.k6$a
            r1.<init>(r2)
            r0.addListener(r1)
            return
    }

    public void a(int r2, int r3) {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.a
            if (r0 == 0) goto Lc
            r0.setRepeatCount(r2)
            android.animation.ValueAnimator r2 = r1.a
            r2.setRepeatMode(r3)
        Lc:
            return
    }

    protected void a(android.animation.Animator r1) {
            r0 = this;
            return
    }

    protected void a(android.animation.ValueAnimator r1) {
            r0 = this;
            return
    }

    public void b() {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.a
            if (r0 == 0) goto Lf
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto Lf
            android.animation.ValueAnimator r0 = r1.a
            r0.pause()
        Lf:
            return
    }

    protected void b(android.animation.Animator r1) {
            r0 = this;
            return
    }

    public void c() {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.a
            if (r0 == 0) goto Lf
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto Lf
            android.animation.ValueAnimator r0 = r1.a
            r0.start()
        Lf:
            return
    }

    protected void c(android.animation.Animator r1) {
            r0 = this;
            return
    }

    protected void d(android.animation.Animator r1) {
            r0 = this;
            return
    }
}
