package com.google.android.gms.common.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "ClientIdentityCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1000})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class ClientIdentity extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.internal.ClientIdentity> CREATOR = null;

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(defaultValueUnchecked = "null", id = 2)
    public final java.lang.String packageName;

    @com.google.android.gms.common.annotation.KeepForSdk
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(defaultValueUnchecked = "0", id = 1)
    public final int uid;

    static {
            com.google.android.gms.common.internal.zaa r0 = new com.google.android.gms.common.internal.zaa
            r0.<init>()
            com.google.android.gms.common.internal.ClientIdentity.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public ClientIdentity(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r1, @androidx.annotation.Nullable @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.uid = r1
            r0.packageName = r2
            return
    }

    public final boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.gms.common.internal.ClientIdentity
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.common.internal.ClientIdentity r5 = (com.google.android.gms.common.internal.ClientIdentity) r5
            int r1 = r5.uid
            int r3 = r4.uid
            if (r1 != r3) goto L1d
            java.lang.String r5 = r5.packageName
            java.lang.String r1 = r4.packageName
            boolean r5 = com.google.android.gms.common.internal.Objects.equal(r5, r1)
            if (r5 == 0) goto L1d
            return r0
        L1d:
            return r2
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.uid
            return r0
    }

    @androidx.annotation.NonNull
    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r2.uid
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            java.lang.String r1 = r2.packageName
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = r3.uid
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            r1 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r5)
            java.lang.String r5 = r3.packageName
            r1 = 0
            r2 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r2, r5, r1)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r0)
            return
    }
}
