package com.google.mlkit.common.sdkinternal.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public enum BaseModel extends java.lang.Enum<com.google.mlkit.common.sdkinternal.model.BaseModel> {

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final com.google.mlkit.common.sdkinternal.model.BaseModel ENTITY_EXTRACTION = null;

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final com.google.mlkit.common.sdkinternal.model.BaseModel IMAGE_CAPTIONING = null;

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final com.google.mlkit.common.sdkinternal.model.BaseModel TOXICITY_DETECTION = null;

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final com.google.mlkit.common.sdkinternal.model.BaseModel TRANSLATE = null;

    @androidx.annotation.NonNull
    public static final com.google.mlkit.common.sdkinternal.model.BaseModel zza = null;

    @androidx.annotation.NonNull
    public static final com.google.mlkit.common.sdkinternal.model.BaseModel zzb = null;
    private static final /* synthetic */ com.google.mlkit.common.sdkinternal.model.BaseModel[] zzc = null;

    static {
            com.google.mlkit.common.sdkinternal.model.BaseModel r0 = new com.google.mlkit.common.sdkinternal.model.BaseModel
            java.lang.String r1 = "FACE_DETECTION"
            r2 = 0
            r0.<init>(r1, r2)
            com.google.mlkit.common.sdkinternal.model.BaseModel.zza = r0
            com.google.mlkit.common.sdkinternal.model.BaseModel r1 = new com.google.mlkit.common.sdkinternal.model.BaseModel
            java.lang.String r3 = "SMART_REPLY"
            r4 = 1
            r1.<init>(r3, r4)
            com.google.mlkit.common.sdkinternal.model.BaseModel.zzb = r1
            com.google.mlkit.common.sdkinternal.model.BaseModel r3 = new com.google.mlkit.common.sdkinternal.model.BaseModel
            java.lang.String r5 = "TRANSLATE"
            r6 = 2
            r3.<init>(r5, r6)
            com.google.mlkit.common.sdkinternal.model.BaseModel.TRANSLATE = r3
            com.google.mlkit.common.sdkinternal.model.BaseModel r5 = new com.google.mlkit.common.sdkinternal.model.BaseModel
            java.lang.String r7 = "ENTITY_EXTRACTION"
            r8 = 3
            r5.<init>(r7, r8)
            com.google.mlkit.common.sdkinternal.model.BaseModel.ENTITY_EXTRACTION = r5
            com.google.mlkit.common.sdkinternal.model.BaseModel r7 = new com.google.mlkit.common.sdkinternal.model.BaseModel
            java.lang.String r9 = "TOXICITY_DETECTION"
            r10 = 4
            r7.<init>(r9, r10)
            com.google.mlkit.common.sdkinternal.model.BaseModel.TOXICITY_DETECTION = r7
            com.google.mlkit.common.sdkinternal.model.BaseModel r9 = new com.google.mlkit.common.sdkinternal.model.BaseModel
            java.lang.String r11 = "IMAGE_CAPTIONING"
            r12 = 5
            r9.<init>(r11, r12)
            com.google.mlkit.common.sdkinternal.model.BaseModel.IMAGE_CAPTIONING = r9
            r11 = 6
            com.google.mlkit.common.sdkinternal.model.BaseModel[] r11 = new com.google.mlkit.common.sdkinternal.model.BaseModel[r11]
            r11[r2] = r0
            r11[r4] = r1
            r11[r6] = r3
            r11[r8] = r5
            r11[r10] = r7
            r11[r12] = r9
            com.google.mlkit.common.sdkinternal.model.BaseModel.zzc = r11
            return
    }

    BaseModel(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @androidx.annotation.NonNull
    public static com.google.mlkit.common.sdkinternal.model.BaseModel[] values() {
            com.google.mlkit.common.sdkinternal.model.BaseModel[] r0 = com.google.mlkit.common.sdkinternal.model.BaseModel.zzc
            java.lang.Object r0 = r0.clone()
            com.google.mlkit.common.sdkinternal.model.BaseModel[] r0 = (com.google.mlkit.common.sdkinternal.model.BaseModel[]) r0
            return r0
    }
}
