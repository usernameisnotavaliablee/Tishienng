package com.google.android.gms.common.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzo {
    private static final android.net.Uri zza = null;

    @androidx.annotation.Nullable
    private final java.lang.String zzb;

    @androidx.annotation.Nullable
    private final java.lang.String zzc;

    @androidx.annotation.Nullable
    private final android.content.ComponentName zzd;
    private final int zze;
    private final boolean zzf;

    static {
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            java.lang.String r1 = "content"
            android.net.Uri$Builder r0 = r0.scheme(r1)
            java.lang.String r1 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r0 = r0.authority(r1)
            android.net.Uri r0 = r0.build()
            com.google.android.gms.common.internal.zzo.zza = r0
            return
    }

    public zzo(android.content.ComponentName r1, int r2) {
            r0 = this;
            r0.<init>()
            r2 = 0
            r0.zzb = r2
            r0.zzc = r2
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            r0.zzd = r1
            r1 = 4225(0x1081, float:5.92E-42)
            r0.zze = r1
            r1 = 0
            r0.zzf = r1
            return
    }

    public zzo(java.lang.String r2, int r3, boolean r4) {
            r1 = this;
            r3 = 4225(0x1081, float:5.92E-42)
            r4 = 0
            java.lang.String r0 = "com.google.android.gms"
            r1.<init>(r2, r0, r3, r4)
            return
    }

    public zzo(java.lang.String r1, java.lang.String r2, int r3, boolean r4) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r1)
            r0.zzb = r1
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r2)
            r0.zzc = r2
            r1 = 0
            r0.zzd = r1
            r1 = 4225(0x1081, float:5.92E-42)
            r0.zze = r1
            r0.zzf = r4
            return
    }

    public final boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.gms.common.internal.zzo
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.common.internal.zzo r5 = (com.google.android.gms.common.internal.zzo) r5
            java.lang.String r1 = r4.zzb
            java.lang.String r3 = r5.zzb
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r1, r3)
            if (r1 == 0) goto L31
            java.lang.String r1 = r4.zzc
            java.lang.String r3 = r5.zzc
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r1, r3)
            if (r1 == 0) goto L31
            android.content.ComponentName r1 = r4.zzd
            android.content.ComponentName r3 = r5.zzd
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r1, r3)
            if (r1 == 0) goto L31
            boolean r1 = r4.zzf
            boolean r5 = r5.zzf
            if (r1 != r5) goto L31
            return r0
        L31:
            return r2
    }

    public final int hashCode() {
            r7 = this;
            java.lang.String r0 = r7.zzb
            java.lang.String r1 = r7.zzc
            android.content.ComponentName r2 = r7.zzd
            r3 = 4225(0x1081, float:5.92E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r4 = r7.zzf
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r5 = 5
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = 0
            r5[r6] = r0
            r0 = 1
            r5[r0] = r1
            r0 = 2
            r5[r0] = r2
            r0 = 3
            r5[r0] = r3
            r0 = 4
            r5[r0] = r4
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r5)
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            if (r0 != 0) goto Lf
            android.content.ComponentName r0 = r1.zzd
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            android.content.ComponentName r0 = r1.zzd
            java.lang.String r0 = r0.flattenToString()
        Lf:
            return r0
    }

    @androidx.annotation.Nullable
    public final android.content.ComponentName zza() {
            r1 = this;
            android.content.ComponentName r0 = r1.zzd
            return r0
    }

    public final android.content.Intent zzb(android.content.Context r5) {
            r4 = this;
            java.lang.String r0 = r4.zzb
            if (r0 == 0) goto L57
            boolean r0 = r4.zzf
            r1 = 0
            if (r0 == 0) goto L46
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r2 = r4.zzb
            java.lang.String r3 = "serviceActionBundleKey"
            r0.putString(r3, r2)
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch: java.lang.IllegalArgumentException -> L22
            android.net.Uri r2 = com.google.android.gms.common.internal.zzo.zza     // Catch: java.lang.IllegalArgumentException -> L22
            java.lang.String r3 = "serviceIntentCall"
            android.os.Bundle r5 = r5.call(r2, r3, r1, r0)     // Catch: java.lang.IllegalArgumentException -> L22
            goto L2d
        L22:
            r5 = move-exception
            java.lang.String r0 = "Dynamic intent resolution failed: "
            java.lang.String r5 = r5.toString()
            r0.concat(r5)
            r5 = r1
        L2d:
            if (r5 != 0) goto L30
            goto L39
        L30:
            java.lang.String r0 = "serviceResponseIntentKey"
            android.os.Parcelable r5 = r5.getParcelable(r0)
            r1 = r5
            android.content.Intent r1 = (android.content.Intent) r1
        L39:
            if (r1 != 0) goto L46
            java.lang.String r5 = r4.zzb
            java.lang.String r0 = "Dynamic lookup for intent failed for action: "
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r0.concat(r5)
        L46:
            if (r1 != 0) goto L56
            java.lang.String r5 = r4.zzb
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r5)
            java.lang.String r5 = r4.zzc
            android.content.Intent r5 = r0.setPackage(r5)
            return r5
        L56:
            return r1
        L57:
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            android.content.ComponentName r0 = r4.zzd
            android.content.Intent r5 = r5.setComponent(r0)
            return r5
    }

    @androidx.annotation.Nullable
    public final java.lang.String zzc() {
            r1 = this;
            java.lang.String r0 = r1.zzc
            return r0
    }
}
