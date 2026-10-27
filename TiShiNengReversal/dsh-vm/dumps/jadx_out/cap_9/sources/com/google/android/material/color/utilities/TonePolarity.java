package com.google.android.material.color.utilities;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public enum TonePolarity extends java.lang.Enum<com.google.android.material.color.utilities.TonePolarity> {
    private static final /* synthetic */ com.google.android.material.color.utilities.TonePolarity[] $VALUES = null;
    public static final com.google.android.material.color.utilities.TonePolarity DARKER = null;
    public static final com.google.android.material.color.utilities.TonePolarity LIGHTER = null;
    public static final com.google.android.material.color.utilities.TonePolarity NO_PREFERENCE = null;

    static {
            com.google.android.material.color.utilities.TonePolarity r0 = new com.google.android.material.color.utilities.TonePolarity
            java.lang.String r1 = "DARKER"
            r2 = 0
            r0.<init>(r1, r2)
            com.google.android.material.color.utilities.TonePolarity.DARKER = r0
            com.google.android.material.color.utilities.TonePolarity r1 = new com.google.android.material.color.utilities.TonePolarity
            java.lang.String r3 = "LIGHTER"
            r4 = 1
            r1.<init>(r3, r4)
            com.google.android.material.color.utilities.TonePolarity.LIGHTER = r1
            com.google.android.material.color.utilities.TonePolarity r3 = new com.google.android.material.color.utilities.TonePolarity
            java.lang.String r5 = "NO_PREFERENCE"
            r6 = 2
            r3.<init>(r5, r6)
            com.google.android.material.color.utilities.TonePolarity.NO_PREFERENCE = r3
            r5 = 3
            com.google.android.material.color.utilities.TonePolarity[] r5 = new com.google.android.material.color.utilities.TonePolarity[r5]
            r5[r2] = r0
            r5[r4] = r1
            r5[r6] = r3
            com.google.android.material.color.utilities.TonePolarity.$VALUES = r5
            return
    }

    TonePolarity(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.google.android.material.color.utilities.TonePolarity valueOf(java.lang.String r1) {
            java.lang.Class<com.google.android.material.color.utilities.TonePolarity> r0 = com.google.android.material.color.utilities.TonePolarity.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.android.material.color.utilities.TonePolarity r1 = (com.google.android.material.color.utilities.TonePolarity) r1
            return r1
    }

    public static com.google.android.material.color.utilities.TonePolarity[] values() {
            com.google.android.material.color.utilities.TonePolarity[] r0 = com.google.android.material.color.utilities.TonePolarity.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.android.material.color.utilities.TonePolarity[] r0 = (com.google.android.material.color.utilities.TonePolarity[]) r0
            return r0
    }
}
