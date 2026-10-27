package com.google.android.gms.common.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "TelemetryDataCreator")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class TelemetryData extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {

    @androidx.annotation.NonNull
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.internal.TelemetryData> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getTelemetryConfigVersion", id = 1)
    private final int zaa;

    @javax.annotation.Nullable
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getMethodInvocations", id = 2)
    private java.util.List zab;

    static {
            com.google.android.gms.common.internal.zaab r0 = new com.google.android.gms.common.internal.zaab
            r0.<init>()
            com.google.android.gms.common.internal.TelemetryData.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public TelemetryData(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) @javax.annotation.Nullable java.util.List r2) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            r0.zab = r2
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            r0 = 1
            int r1 = r3.zaa
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r0, r1)
            java.util.List r0 = r3.zab
            r1 = 0
            r2 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(r4, r2, r0, r1)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }

    public final int zaa() {
            r1 = this;
            int r0 = r1.zaa
            return r0
    }

    @androidx.annotation.Nullable
    public final java.util.List zab() {
            r1 = this;
            java.util.List r0 = r1.zab
            return r0
    }

    public final void zac(@androidx.annotation.NonNull com.google.android.gms.common.internal.MethodInvocation r2) {
            r1 = this;
            java.util.List r0 = r1.zab
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.zab = r0
        Lb:
            java.util.List r0 = r1.zab
            r0.add(r2)
            return
    }
}
