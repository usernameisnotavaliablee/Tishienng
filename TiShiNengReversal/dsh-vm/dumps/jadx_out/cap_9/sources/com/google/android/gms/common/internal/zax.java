package com.google.android.gms.common.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "SignInButtonConfigCreator")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zax extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.internal.zax> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField(id = 1)
    final int zaa;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getButtonSize", id = 2)
    private final int zab;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getColorScheme", id = 3)
    private final int zac;

    @androidx.annotation.Nullable
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getScopes", id = 4)
    @java.lang.Deprecated
    private final com.google.android.gms.common.api.Scope[] zad;

    static {
            com.google.android.gms.common.internal.zay r0 = new com.google.android.gms.common.internal.zay
            r0.<init>()
            com.google.android.gms.common.internal.zax.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    zax(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) int r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) int r3, @androidx.annotation.Nullable @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) com.google.android.gms.common.api.Scope[] r4) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            r0.zab = r2
            r0.zac = r3
            r0.zad = r4
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = r4.zaa
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            r2 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r2, r0)
            r0 = 2
            int r2 = r4.zab
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r0, r2)
            r0 = 3
            int r2 = r4.zac
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r0, r2)
            com.google.android.gms.common.api.Scope[] r0 = r4.zad
            r2 = 0
            r3 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(r5, r3, r0, r6, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r1)
            return
    }
}
