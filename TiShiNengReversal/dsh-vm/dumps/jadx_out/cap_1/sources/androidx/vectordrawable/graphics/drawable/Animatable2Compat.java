package androidx.vectordrawable.graphics.drawable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface Animatable2Compat extends android.graphics.drawable.Animatable {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class AnimationCallback {
        android.graphics.drawable.Animatable2.AnimationCallback mPlatformCallback;


        public AnimationCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.RequiresApi(23)
        android.graphics.drawable.Animatable2.AnimationCallback getPlatformCallback() {
                r1 = this;
                android.graphics.drawable.Animatable2$AnimationCallback r0 = r1.mPlatformCallback
                if (r0 != 0) goto Lb
                androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback$1 r0 = new androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback$1
                r0.<init>(r1)
                r1.mPlatformCallback = r0
            Lb:
                android.graphics.drawable.Animatable2$AnimationCallback r0 = r1.mPlatformCallback
                return r0
        }

        public void onAnimationEnd(android.graphics.drawable.Drawable r1) {
                r0 = this;
                return
        }

        public void onAnimationStart(android.graphics.drawable.Drawable r1) {
                r0 = this;
                return
        }
    }

    void clearAnimationCallbacks();

    void registerAnimationCallback(@androidx.annotation.NonNull androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback r1);

    boolean unregisterAnimationCallback(@androidx.annotation.NonNull androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback r1);
}
