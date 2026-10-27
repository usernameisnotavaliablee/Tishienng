package com.google.android.material.navigation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class DrawerLayoutUtils {
    private static final int DEFAULT_SCRIM_ALPHA = 0;
    private static final int DEFAULT_SCRIM_COLOR = -1728053248;


    static {
            r0 = -1728053248(0xffffffff99000000, float:-6.617445E-24)
            int r0 = android.graphics.Color.alpha(r0)
            com.google.android.material.navigation.DrawerLayoutUtils.DEFAULT_SCRIM_ALPHA = r0
            return
    }

    private DrawerLayoutUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void a(androidx.drawerlayout.widget.DrawerLayout r2, android.animation.ValueAnimator r3) {
            int r0 = com.google.android.material.navigation.DrawerLayoutUtils.DEFAULT_SCRIM_ALPHA
            r1 = 0
            float r3 = r3.getAnimatedFraction()
            int r3 = com.google.android.material.animation.AnimationUtils.lerp(r0, r1, r3)
            r0 = -1728053248(0xffffffff99000000, float:-6.617445E-24)
            int r3 = androidx.core.graphics.ColorUtils.setAlphaComponent(r0, r3)
            r2.setScrimColor(r3)
            return
    }

    @androidx.annotation.NonNull
    public static android.animation.Animator.AnimatorListener getScrimCloseAnimatorListener(@androidx.annotation.NonNull androidx.drawerlayout.widget.DrawerLayout r1, @androidx.annotation.NonNull android.view.View r2) {
            com.google.android.material.navigation.DrawerLayoutUtils$1 r0 = new com.google.android.material.navigation.DrawerLayoutUtils$1
            r0.<init>(r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public static android.animation.ValueAnimator.AnimatorUpdateListener getScrimCloseAnimatorUpdateListener(@androidx.annotation.NonNull androidx.drawerlayout.widget.DrawerLayout r1) {
            com.google.android.material.navigation.a r0 = new com.google.android.material.navigation.a
            r0.<init>(r1)
            return r0
    }
}
