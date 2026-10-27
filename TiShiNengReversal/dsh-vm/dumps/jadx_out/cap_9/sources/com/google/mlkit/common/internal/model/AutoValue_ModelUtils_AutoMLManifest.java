package com.google.mlkit.common.internal.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class AutoValue_ModelUtils_AutoMLManifest extends com.google.mlkit.common.internal.model.ModelUtils.AutoMLManifest {
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;

    AutoValue_ModelUtils_AutoMLManifest(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L20
            r0.zza = r1
            if (r2 == 0) goto L18
            r0.zzb = r2
            if (r3 == 0) goto L10
            r0.zzc = r3
            return
        L10:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null labelsFile"
            r1.<init>(r2)
            throw r1
        L18:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null modelFile"
            r1.<init>(r2)
            throw r1
        L20:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null modelType"
            r1.<init>(r2)
            throw r1
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.mlkit.common.internal.model.ModelUtils.AutoMLManifest
            r2 = 0
            if (r1 == 0) goto L30
            com.google.mlkit.common.internal.model.ModelUtils$AutoMLManifest r5 = (com.google.mlkit.common.internal.model.ModelUtils.AutoMLManifest) r5
            java.lang.String r1 = r4.zza
            java.lang.String r3 = r5.getModelType()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L30
            java.lang.String r1 = r4.zzb
            java.lang.String r3 = r5.getModelFile()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L30
            java.lang.String r1 = r4.zzc
            java.lang.String r5 = r5.getLabelsFile()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L30
            return r0
        L30:
            return r2
    }

    @Override // com.google.mlkit.common.internal.model.ModelUtils.AutoMLManifest
    @com.google.android.gms.common.annotation.KeepForSdk
    public java.lang.String getLabelsFile() {
            r1 = this;
            java.lang.String r0 = r1.zzc
            return r0
    }

    @Override // com.google.mlkit.common.internal.model.ModelUtils.AutoMLManifest
    @com.google.android.gms.common.annotation.KeepForSdk
    public java.lang.String getModelFile() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    @Override // com.google.mlkit.common.internal.model.ModelUtils.AutoMLManifest
    @com.google.android.gms.common.annotation.KeepForSdk
    public java.lang.String getModelType() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.zza
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            java.lang.String r2 = r3.zzb
            int r0 = r0 * r1
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            java.lang.String r2 = r3.zzc
            int r0 = r0 * r1
            int r1 = r2.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "AutoMLManifest{modelType="
            r0.append(r1)
            java.lang.String r1 = r2.zza
            r0.append(r1)
            java.lang.String r1 = ", modelFile="
            r0.append(r1)
            java.lang.String r1 = r2.zzb
            r0.append(r1)
            java.lang.String r1 = ", labelsFile="
            r0.append(r1)
            java.lang.String r1 = r2.zzc
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
