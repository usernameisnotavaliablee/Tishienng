package com.google.android.gms.auth.api.signin.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "GoogleSignInOptionsExtensionCreator")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class GoogleSignInOptionsExtensionParcelable extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {

    @androidx.annotation.NonNull
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField(id = 1)
    final int zaa;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getType", id = 2)
    private int zab;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getBundle", id = 3)
    private android.os.Bundle zac;

    static {
            com.google.android.gms.auth.api.signin.internal.zaa r0 = new com.google.android.gms.auth.api.signin.internal.zaa
            r0.<init>()
            com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    GoogleSignInOptionsExtensionParcelable(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) int r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) android.os.Bundle r3) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            r0.zab = r2
            r0.zac = r3
            return
    }

    public GoogleSignInOptionsExtensionParcelable(@androidx.annotation.NonNull com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension r3) {
            r2 = this;
            int r0 = r3.getExtensionType()
            android.os.Bundle r3 = r3.toBundle()
            r1 = 1
            r2.<init>(r1, r0, r3)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public int getType() {
            r1 = this;
            int r0 = r1.zab
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            r0 = 1
            int r1 = r3.zaa
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r0, r1)
            r0 = 2
            int r1 = r3.getType()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r0, r1)
            android.os.Bundle r0 = r3.zac
            r1 = 0
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(r4, r2, r0, r1)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
