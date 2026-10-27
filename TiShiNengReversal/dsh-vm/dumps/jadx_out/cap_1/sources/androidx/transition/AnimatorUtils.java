package androidx.transition;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class AnimatorUtils {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface AnimatorPauseListenerCompat {
        void onAnimationPause(android.animation.Animator r1);

        void onAnimationResume(android.animation.Animator r1);
    }

    private AnimatorUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    static void addPauseListener(@androidx.annotation.NonNull android.animation.Animator r0, @androidx.annotation.NonNull android.animation.AnimatorListenerAdapter r1) {
            r0.addPauseListener(r1)
            return
    }

    static void pause(@androidx.annotation.NonNull android.animation.Animator r0) {
            r0.pause()
            return
    }

    static void resume(@androidx.annotation.NonNull android.animation.Animator r0) {
            r0.resume()
            return
    }
}
