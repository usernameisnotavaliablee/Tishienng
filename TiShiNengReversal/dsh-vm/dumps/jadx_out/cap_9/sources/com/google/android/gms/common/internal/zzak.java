package com.google.android.gms.common.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "ValidateAccountRequestCreator")
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzak extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.internal.zzak> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField(id = 1)
    final int zza;

    static {
            com.google.android.gms.common.internal.zzal r0 = new com.google.android.gms.common.internal.zzal
            r0.<init>()
            com.google.android.gms.common.internal.zzak.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    zzak(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            int r4 = r2.zza
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r3)
            r1 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r3, r1, r4)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r3, r0)
            return
    }
}
