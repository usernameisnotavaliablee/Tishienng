package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class r4 implements android.animation.Animator.AnimatorListener {
    private android.animation.Animator a;

    public r4(android.animation.Animator r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(@androidx.annotation.NonNull android.animation.Animator r1) {
            r0 = this;
            r1 = 0
            r0.a = r1
            return
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(@androidx.annotation.NonNull android.animation.Animator r1) {
            r0 = this;
            android.animation.Animator r1 = r0.a
            if (r1 == 0) goto L7
            r1.start()
        L7:
            return
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(@androidx.annotation.NonNull android.animation.Animator r1) {
            r0 = this;
            return
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(@androidx.annotation.NonNull android.animation.Animator r1) {
            r0 = this;
            return
    }
}
