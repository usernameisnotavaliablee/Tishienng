package com.google.mlkit.common.internal.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class AutoValue_ModelUtils_ModelLoggingInfo extends com.google.mlkit.common.internal.model.ModelUtils.ModelLoggingInfo {
    private final long zza;
    private final java.lang.String zzb;
    private final boolean zzc;

    AutoValue_ModelUtils_ModelLoggingInfo(long r1, java.lang.String r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r3
            r0.zzc = r4
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.mlkit.common.internal.model.ModelUtils.ModelLoggingInfo
            r2 = 0
            if (r1 == 0) goto L2a
            com.google.mlkit.common.internal.model.ModelUtils$ModelLoggingInfo r8 = (com.google.mlkit.common.internal.model.ModelUtils.ModelLoggingInfo) r8
            long r3 = r7.zza
            long r5 = r8.getSize()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L2a
            java.lang.String r1 = r7.zzb
            java.lang.String r3 = r8.getHash()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L2a
            boolean r1 = r7.zzc
            boolean r8 = r8.isManifestModel()
            if (r1 != r8) goto L2a
            return r0
        L2a:
            return r2
    }

    @Override // com.google.mlkit.common.internal.model.ModelUtils.ModelLoggingInfo
    @com.google.android.gms.common.annotation.KeepForSdk
    public java.lang.String getHash() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    @Override // com.google.mlkit.common.internal.model.ModelUtils.ModelLoggingInfo
    @com.google.android.gms.common.annotation.KeepForSdk
    public long getSize() {
            r2 = this;
            long r0 = r2.zza
            return r0
    }

    public final int hashCode() {
            r4 = this;
            long r0 = r4.zza
            r2 = 32
            long r2 = r0 >>> r2
            long r0 = r0 ^ r2
            int r1 = (int) r0
            java.lang.String r0 = r4.zzb
            r2 = 1000003(0xf4243, float:1.401303E-39)
            r1 = r1 ^ r2
            int r1 = r1 * r2
            int r0 = r0.hashCode()
            r0 = r0 ^ r1
            r1 = 1
            boolean r3 = r4.zzc
            if (r1 == r3) goto L1d
            r1 = 1237(0x4d5, float:1.733E-42)
            goto L1f
        L1d:
            r1 = 1231(0x4cf, float:1.725E-42)
        L1f:
            int r0 = r0 * r2
            r0 = r0 ^ r1
            return r0
    }

    @Override // com.google.mlkit.common.internal.model.ModelUtils.ModelLoggingInfo
    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean isManifestModel() {
            r1 = this;
            boolean r0 = r1.zzc
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ModelLoggingInfo{size="
            r0.append(r1)
            long r1 = r3.zza
            r0.append(r1)
            java.lang.String r1 = ", hash="
            r0.append(r1)
            java.lang.String r1 = r3.zzb
            r0.append(r1)
            java.lang.String r1 = ", manifestModel="
            r0.append(r1)
            boolean r1 = r3.zzc
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
