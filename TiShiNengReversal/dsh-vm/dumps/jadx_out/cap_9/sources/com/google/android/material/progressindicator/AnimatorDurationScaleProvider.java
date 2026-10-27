package com.google.android.material.progressindicator;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class AnimatorDurationScaleProvider {
    private static float defaultSystemAnimatorDurationScale = 1.0f;

    static {
            return
    }

    public AnimatorDurationScaleProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.VisibleForTesting
    public static void setDefaultSystemAnimatorDurationScale(float r0) {
            com.google.android.material.progressindicator.AnimatorDurationScaleProvider.defaultSystemAnimatorDurationScale = r0
            return
    }

    public float getSystemAnimatorDurationScale(@androidx.annotation.NonNull android.content.ContentResolver r3) {
            r2 = this;
            java.lang.String r0 = "animator_duration_scale"
            r1 = 1065353216(0x3f800000, float:1.0)
            float r3 = android.provider.Settings.Global.getFloat(r3, r0, r1)
            return r3
    }
}
