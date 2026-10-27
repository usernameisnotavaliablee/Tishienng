package com.google.mlkit.common.sdkinternal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public enum ModelType extends java.lang.Enum<com.google.mlkit.common.sdkinternal.ModelType> {

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final com.google.mlkit.common.sdkinternal.ModelType BASE = null;

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final com.google.mlkit.common.sdkinternal.ModelType CUSTOM = null;

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final com.google.mlkit.common.sdkinternal.ModelType DIGITAL_INK = null;

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final com.google.mlkit.common.sdkinternal.ModelType DIGITAL_INK_SEGMENTATION = null;

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final com.google.mlkit.common.sdkinternal.ModelType ENTITY_EXTRACTION = null;

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final com.google.mlkit.common.sdkinternal.ModelType IMAGE_CAPTIONING = null;

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final com.google.mlkit.common.sdkinternal.ModelType TOXICITY_DETECTION = null;

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final com.google.mlkit.common.sdkinternal.ModelType TRANSLATE = null;

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final com.google.mlkit.common.sdkinternal.ModelType UNKNOWN = null;
    private static final /* synthetic */ com.google.mlkit.common.sdkinternal.ModelType[] zza = null;

    static {
            com.google.mlkit.common.sdkinternal.ModelType r0 = new com.google.mlkit.common.sdkinternal.ModelType
            java.lang.String r1 = "UNKNOWN"
            r2 = 0
            r0.<init>(r1, r2)
            com.google.mlkit.common.sdkinternal.ModelType.UNKNOWN = r0
            com.google.mlkit.common.sdkinternal.ModelType r1 = new com.google.mlkit.common.sdkinternal.ModelType
            java.lang.String r3 = "BASE"
            r4 = 1
            r1.<init>(r3, r4)
            com.google.mlkit.common.sdkinternal.ModelType.BASE = r1
            com.google.mlkit.common.sdkinternal.ModelType r3 = new com.google.mlkit.common.sdkinternal.ModelType
            java.lang.String r5 = "TRANSLATE"
            r6 = 2
            r3.<init>(r5, r6)
            com.google.mlkit.common.sdkinternal.ModelType.TRANSLATE = r3
            com.google.mlkit.common.sdkinternal.ModelType r5 = new com.google.mlkit.common.sdkinternal.ModelType
            java.lang.String r7 = "ENTITY_EXTRACTION"
            r8 = 3
            r5.<init>(r7, r8)
            com.google.mlkit.common.sdkinternal.ModelType.ENTITY_EXTRACTION = r5
            com.google.mlkit.common.sdkinternal.ModelType r7 = new com.google.mlkit.common.sdkinternal.ModelType
            java.lang.String r9 = "CUSTOM"
            r10 = 4
            r7.<init>(r9, r10)
            com.google.mlkit.common.sdkinternal.ModelType.CUSTOM = r7
            com.google.mlkit.common.sdkinternal.ModelType r9 = new com.google.mlkit.common.sdkinternal.ModelType
            java.lang.String r11 = "DIGITAL_INK"
            r12 = 5
            r9.<init>(r11, r12)
            com.google.mlkit.common.sdkinternal.ModelType.DIGITAL_INK = r9
            com.google.mlkit.common.sdkinternal.ModelType r11 = new com.google.mlkit.common.sdkinternal.ModelType
            java.lang.String r13 = "DIGITAL_INK_SEGMENTATION"
            r14 = 6
            r11.<init>(r13, r14)
            com.google.mlkit.common.sdkinternal.ModelType.DIGITAL_INK_SEGMENTATION = r11
            com.google.mlkit.common.sdkinternal.ModelType r13 = new com.google.mlkit.common.sdkinternal.ModelType
            java.lang.String r15 = "TOXICITY_DETECTION"
            r16 = 0
            r2 = 7
            r13.<init>(r15, r2)
            com.google.mlkit.common.sdkinternal.ModelType.TOXICITY_DETECTION = r13
            com.google.mlkit.common.sdkinternal.ModelType r15 = new com.google.mlkit.common.sdkinternal.ModelType
            r17 = 7
            java.lang.String r2 = "IMAGE_CAPTIONING"
            r18 = 1
            r4 = 8
            r15.<init>(r2, r4)
            com.google.mlkit.common.sdkinternal.ModelType.IMAGE_CAPTIONING = r15
            r2 = 9
            com.google.mlkit.common.sdkinternal.ModelType[] r2 = new com.google.mlkit.common.sdkinternal.ModelType[r2]
            r2[r16] = r0
            r2[r18] = r1
            r2[r6] = r3
            r2[r8] = r5
            r2[r10] = r7
            r2[r12] = r9
            r2[r14] = r11
            r2[r17] = r13
            r2[r4] = r15
            com.google.mlkit.common.sdkinternal.ModelType.zza = r2
            return
    }

    ModelType(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @androidx.annotation.NonNull
    public static com.google.mlkit.common.sdkinternal.ModelType[] values() {
            com.google.mlkit.common.sdkinternal.ModelType[] r0 = com.google.mlkit.common.sdkinternal.ModelType.zza
            java.lang.Object r0 = r0.clone()
            com.google.mlkit.common.sdkinternal.ModelType[] r0 = (com.google.mlkit.common.sdkinternal.ModelType[]) r0
            return r0
    }
}
