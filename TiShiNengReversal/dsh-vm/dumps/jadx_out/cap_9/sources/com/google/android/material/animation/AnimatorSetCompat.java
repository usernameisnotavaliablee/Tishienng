package com.google.android.material.animation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class AnimatorSetCompat {
    public AnimatorSetCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void playTogether(@androidx.annotation.NonNull android.animation.AnimatorSet r10, @androidx.annotation.NonNull java.util.List<android.animation.Animator> r11) {
            int r0 = r11.size()
            r1 = 0
            r3 = 0
            r4 = 0
        L8:
            if (r4 >= r0) goto L20
            java.lang.Object r5 = r11.get(r4)
            android.animation.Animator r5 = (android.animation.Animator) r5
            long r6 = r5.getStartDelay()
            long r8 = r5.getDuration()
            long r6 = r6 + r8
            long r1 = java.lang.Math.max(r1, r6)
            int r4 = r4 + 1
            goto L8
        L20:
            int[] r0 = new int[]{r3, r3}
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofInt(r0)
            r0.setDuration(r1)
            r11.add(r3, r0)
            r10.playTogether(r11)
            return
    }
}
