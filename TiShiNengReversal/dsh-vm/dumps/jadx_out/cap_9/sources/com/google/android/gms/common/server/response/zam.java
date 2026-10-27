package com.google.android.gms.common.server.response;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.internal.ShowFirstParty
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "FieldMapPairCreator")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zam extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.server.response.zam> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField(id = 1)
    final int zaa;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    final java.lang.String zab;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    final com.google.android.gms.common.server.response.FastJsonResponse.Field zac;

    static {
            com.google.android.gms.common.server.response.zak r0 = new com.google.android.gms.common.server.response.zak
            r0.<init>()
            com.google.android.gms.common.server.response.zam.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    zam(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) com.google.android.gms.common.server.response.FastJsonResponse.Field r3) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            r0.zab = r2
            r0.zac = r3
            return
    }

    zam(java.lang.String r2, com.google.android.gms.common.server.response.FastJsonResponse.Field r3) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.zaa = r0
            r1.zab = r2
            r1.zac = r3
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = r4.zaa
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            r2 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r2, r0)
            java.lang.String r0 = r4.zab
            r2 = 2
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r0, r3)
            r0 = 3
            com.google.android.gms.common.server.response.FastJsonResponse$Field r2 = r4.zac
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r0, r2, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r1)
            return
    }
}
