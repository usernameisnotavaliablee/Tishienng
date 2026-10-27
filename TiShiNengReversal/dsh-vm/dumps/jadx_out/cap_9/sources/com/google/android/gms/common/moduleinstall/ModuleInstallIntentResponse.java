package com.google.android.gms.common.moduleinstall;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "ModuleInstallIntentResponseCreator")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class ModuleInstallIntentResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {

    @androidx.annotation.NonNull
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse> CREATOR = null;

    @androidx.annotation.Nullable
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getPendingIntent", id = 1)
    private final android.app.PendingIntent zaa;

    static {
            com.google.android.gms.common.moduleinstall.zab r0 = new com.google.android.gms.common.moduleinstall.zab
            r0.<init>()
            com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    @com.google.android.gms.common.annotation.KeepForSdk
    public ModuleInstallIntentResponse(@androidx.annotation.Nullable @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) android.app.PendingIntent r1) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            return
    }

    @androidx.annotation.Nullable
    public android.app.PendingIntent getPendingIntent() {
            r1 = this;
            android.app.PendingIntent r0 = r1.zaa
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            android.app.PendingIntent r1 = r4.getPendingIntent()
            r2 = 0
            r3 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r3, r1, r6, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }
}
