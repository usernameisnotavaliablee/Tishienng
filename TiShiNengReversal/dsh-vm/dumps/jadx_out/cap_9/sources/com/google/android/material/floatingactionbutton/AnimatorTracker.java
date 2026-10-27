package com.google.android.material.floatingactionbutton;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class AnimatorTracker {

    @androidx.annotation.Nullable
    private android.animation.Animator currentAnimator;

    AnimatorTracker() {
            r0 = this;
            r0.<init>()
            return
    }

    public void cancelCurrent() {
            r1 = this;
            android.animation.Animator r0 = r1.currentAnimator
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            return
    }

    public void clear() {
            r1 = this;
            r0 = 0
            r1.currentAnimator = r0
            return
    }

    public void onNextAnimationStart(android.animation.Animator r1) {
            r0 = this;
            r0.cancelCurrent()
            r0.currentAnimator = r1
            return
    }
}
