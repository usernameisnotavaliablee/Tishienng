package com.google.android.gms.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "FeatureCreator")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class Feature extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {

    @androidx.annotation.NonNull
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.Feature> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getName", id = 1)
    private final java.lang.String zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getOldVersion", id = 2)
    @java.lang.Deprecated
    private final int zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(defaultValue = "-1", getter = "getVersion", id = 3)
    private final long zzc;

    static {
            com.google.android.gms.common.zzc r0 = new com.google.android.gms.common.zzc
            r0.<init>()
            com.google.android.gms.common.Feature.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public Feature(@androidx.annotation.NonNull @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) java.lang.String r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) int r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) long r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public Feature(@androidx.annotation.NonNull java.lang.String r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzc = r2
            r1 = -1
            r0.zzb = r1
            return
    }

    public final boolean equals(@androidx.annotation.Nullable java.lang.Object r7) {
            r6 = this;
            boolean r0 = r7 instanceof com.google.android.gms.common.Feature
            r1 = 0
            if (r0 == 0) goto L35
            com.google.android.gms.common.Feature r7 = (com.google.android.gms.common.Feature) r7
            java.lang.String r0 = r6.getName()
            if (r0 == 0) goto L1b
            java.lang.String r0 = r6.getName()
            java.lang.String r2 = r7.getName()
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L27
        L1b:
            java.lang.String r0 = r6.getName()
            if (r0 != 0) goto L35
            java.lang.String r0 = r7.getName()
            if (r0 != 0) goto L35
        L27:
            long r2 = r6.getVersion()
            long r4 = r7.getVersion()
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L35
            r7 = 1
            return r7
        L35:
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public long getVersion() {
            r5 = this;
            long r0 = r5.zzc
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lb
            int r0 = r5.zzb
            long r0 = (long) r0
        Lb:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.getName()
            long r1 = r4.getVersion()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r2)
            return r0
    }

    @androidx.annotation.NonNull
    public final java.lang.String toString() {
            r3 = this;
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = com.google.android.gms.common.internal.Objects.toStringHelper(r3)
            java.lang.String r1 = "name"
            java.lang.String r2 = r3.getName()
            r0.add(r1, r2)
            long r1 = r3.getVersion()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "version"
            r0.add(r2, r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            java.lang.String r0 = r3.getName()
            r1 = 0
            r2 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r2, r0, r1)
            r0 = 2
            int r1 = r3.zzb
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r0, r1)
            r0 = 3
            long r1 = r3.getVersion()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r4, r0, r1)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
