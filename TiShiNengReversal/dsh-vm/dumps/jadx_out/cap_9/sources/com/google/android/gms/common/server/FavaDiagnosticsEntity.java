package com.google.android.gms.common.server;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "FavaDiagnosticsEntityCreator")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class FavaDiagnosticsEntity extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.server.FavaDiagnosticsEntity> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField(id = 1)
    final int zaa;

    @androidx.annotation.NonNull
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    public final java.lang.String zab;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    public final int zac;

    static {
            com.google.android.gms.common.server.zaa r0 = new com.google.android.gms.common.server.zaa
            r0.<init>()
            com.google.android.gms.common.server.FavaDiagnosticsEntity.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public FavaDiagnosticsEntity(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r1, @androidx.annotation.NonNull @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) int r3) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            r0.zab = r2
            r0.zac = r3
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public FavaDiagnosticsEntity(@androidx.annotation.NonNull java.lang.String r2, int r3) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.zaa = r0
            r1.zab = r2
            r1.zac = r3
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = r3.zaa
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            r1 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r5)
            java.lang.String r5 = r3.zab
            r1 = 0
            r2 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r2, r5, r1)
            r5 = 3
            int r1 = r3.zac
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r5, r1)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r0)
            return
    }
}
