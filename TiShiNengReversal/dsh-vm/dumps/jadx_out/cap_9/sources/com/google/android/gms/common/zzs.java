package com.google.android.gms.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "GoogleCertificatesQueryCreator")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzs extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.zzs> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getCallingPackage", id = 1)
    private final java.lang.String zza;

    @javax.annotation.Nullable
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getCallingCertificateBinder", id = 2, type = "android.os.IBinder")
    private final com.google.android.gms.common.zzj zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getAllowTestKeys", id = 3)
    private final boolean zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(defaultValue = "false", getter = "getIgnoreTestKeysOverride", id = 4)
    private final boolean zzd;

    static {
            com.google.android.gms.common.zzt r0 = new com.google.android.gms.common.zzt
            r0.<init>()
            com.google.android.gms.common.zzs.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    zzs(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) java.lang.String r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) @javax.annotation.Nullable android.os.IBinder r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) boolean r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) boolean r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r1 = 0
            if (r2 != 0) goto L9
            goto L22
        L9:
            com.google.android.gms.common.internal.zzaa r2 = com.google.android.gms.common.internal.zzz.zzg(r2)     // Catch: android.os.RemoteException -> L22
            com.google.android.gms.dynamic.IObjectWrapper r2 = r2.zzd()     // Catch: android.os.RemoteException -> L22
            if (r2 != 0) goto L15
            r2 = r1
            goto L1b
        L15:
            java.lang.Object r2 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r2)
            byte[] r2 = (byte[]) r2
        L1b:
            if (r2 == 0) goto L22
            com.google.android.gms.common.zzk r1 = new com.google.android.gms.common.zzk
            r1.<init>(r2)
        L22:
            r0.zzb = r1
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    zzs(java.lang.String r1, @javax.annotation.Nullable com.google.android.gms.common.zzj r2, boolean r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            java.lang.String r5 = r3.zza
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            r1 = 1
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r5, r2)
            com.google.android.gms.common.zzj r5 = r3.zzb
            if (r5 != 0) goto L10
            r5 = 0
        L10:
            r1 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(r4, r1, r5, r2)
            r5 = 3
            boolean r1 = r3.zzc
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r5, r1)
            r5 = 4
            boolean r1 = r3.zzd
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r5, r1)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r0)
            return
    }
}
