package com.google.mlkit.common.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class RemoteModel {

    @androidx.annotation.NonNull
    @androidx.annotation.VisibleForTesting
    public static final java.util.Map zza = null;
    private static final java.util.Map zzb = null;

    @androidx.annotation.Nullable
    private final java.lang.String zzc;

    @androidx.annotation.Nullable
    private final com.google.mlkit.common.sdkinternal.model.BaseModel zzd;
    private final com.google.mlkit.common.sdkinternal.ModelType zze;
    private java.lang.String zzf;

    static {
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<com.google.mlkit.common.sdkinternal.model.BaseModel> r1 = com.google.mlkit.common.sdkinternal.model.BaseModel.class
            r0.<init>(r1)
            com.google.mlkit.common.model.RemoteModel.zzb = r0
            java.util.EnumMap r0 = new java.util.EnumMap
            r0.<init>(r1)
            com.google.mlkit.common.model.RemoteModel.zza = r0
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    protected RemoteModel(@androidx.annotation.Nullable java.lang.String r5, @androidx.annotation.Nullable com.google.mlkit.common.sdkinternal.model.BaseModel r6, @androidx.annotation.NonNull com.google.mlkit.common.sdkinternal.ModelType r7) {
            r4 = this;
            r4.<init>()
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 1
            r2 = 0
            if (r6 != 0) goto Ld
            r3 = 0
            goto Le
        Ld:
            r3 = 1
        Le:
            if (r0 != r3) goto L11
            goto L12
        L11:
            r1 = 0
        L12:
            java.lang.String r0 = "One of cloud model name and base model cannot be empty"
            com.google.android.gms.common.internal.Preconditions.checkArgument(r1, r0)
            r4.zzc = r5
            r4.zzd = r6
            r4.zze = r7
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean baseModelHashMatches(@androidx.annotation.NonNull java.lang.String r3) {
            r2 = this;
            com.google.mlkit.common.sdkinternal.model.BaseModel r0 = r2.zzd
            if (r0 != 0) goto L6
            r3 = 0
            return r3
        L6:
            java.util.Map r1 = com.google.mlkit.common.model.RemoteModel.zzb
            java.lang.Object r0 = r1.get(r0)
            boolean r3 = r3.equals(r0)
            return r3
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.mlkit.common.model.RemoteModel
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.mlkit.common.model.RemoteModel r5 = (com.google.mlkit.common.model.RemoteModel) r5
            java.lang.String r1 = r4.zzc
            java.lang.String r3 = r5.zzc
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r1, r3)
            if (r1 == 0) goto L2b
            com.google.mlkit.common.sdkinternal.model.BaseModel r1 = r4.zzd
            com.google.mlkit.common.sdkinternal.model.BaseModel r3 = r5.zzd
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r1, r3)
            if (r1 == 0) goto L2b
            com.google.mlkit.common.sdkinternal.ModelType r1 = r4.zze
            com.google.mlkit.common.sdkinternal.ModelType r5 = r5.zze
            boolean r5 = com.google.android.gms.common.internal.Objects.equal(r1, r5)
            if (r5 == 0) goto L2b
            return r0
        L2b:
            return r2
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public java.lang.String getModelHash() {
            r1 = this;
            java.lang.String r0 = r1.zzf
            return r0
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public java.lang.String getModelName() {
            r1 = this;
            java.lang.String r0 = r1.zzc
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public java.lang.String getModelNameForBackend() {
            r2 = this;
            java.lang.String r0 = r2.zzc
            if (r0 == 0) goto L5
            return r0
        L5:
            com.google.mlkit.common.sdkinternal.model.BaseModel r0 = r2.zzd
            java.util.Map r1 = com.google.mlkit.common.model.RemoteModel.zza
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public com.google.mlkit.common.sdkinternal.ModelType getModelType() {
            r1 = this;
            com.google.mlkit.common.sdkinternal.ModelType r0 = r1.zze
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public java.lang.String getUniqueModelNameForPersist() {
            r2 = this;
            java.lang.String r0 = r2.zzc
            if (r0 == 0) goto L5
            return r0
        L5:
            com.google.mlkit.common.sdkinternal.model.BaseModel r0 = r2.zzd
            java.util.Map r1 = com.google.mlkit.common.model.RemoteModel.zza
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "COM.GOOGLE.BASE_"
            java.lang.String r0 = r1.concat(r0)
            return r0
    }

    public int hashCode() {
            r5 = this;
            java.lang.String r0 = r5.zzc
            com.google.mlkit.common.sdkinternal.model.BaseModel r1 = r5.zzd
            com.google.mlkit.common.sdkinternal.ModelType r2 = r5.zze
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r0
            r0 = 1
            r3[r0] = r1
            r0 = 2
            r3[r0] = r2
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r3)
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean isBaseModel() {
            r1 = this;
            com.google.mlkit.common.sdkinternal.model.BaseModel r0 = r1.zzd
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void setModelHash(@androidx.annotation.NonNull java.lang.String r1) {
            r0 = this;
            r0.zzf = r1
            return
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "RemoteModel"
            com.google.android.gms.internal.mlkit_common.zzq r0 = com.google.android.gms.internal.mlkit_common.zzr.zzb(r0)
            java.lang.String r1 = "modelName"
            java.lang.String r2 = r3.zzc
            r0.zza(r1, r2)
            java.lang.String r1 = "baseModel"
            com.google.mlkit.common.sdkinternal.model.BaseModel r2 = r3.zzd
            r0.zza(r1, r2)
            java.lang.String r1 = "modelType"
            com.google.mlkit.common.sdkinternal.ModelType r2 = r3.zze
            r0.zza(r1, r2)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
