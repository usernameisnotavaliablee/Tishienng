package com.google.android.gms.common.moduleinstall;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "ModuleAvailabilityResponseCreator")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class ModuleAvailabilityResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {

    @androidx.annotation.NonNull
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "areModulesAvailable", id = 1)
    private final boolean zaa;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getAvailabilityStatus", id = 2)
    private final int zab;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    public @interface AvailabilityStatus {
        public static final int STATUS_ALREADY_AVAILABLE = 0;
        public static final int STATUS_READY_TO_DOWNLOAD = 1;
        public static final int STATUS_UNKNOWN_MODULE = 2;
    }

    static {
            com.google.android.gms.common.moduleinstall.zaa r0 = new com.google.android.gms.common.moduleinstall.zaa
            r0.<init>()
            com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    @com.google.android.gms.common.annotation.KeepForSdk
    public ModuleAvailabilityResponse(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) boolean r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) int r2) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            r0.zab = r2
            return
    }

    public boolean areModulesAvailable() {
            r1 = this;
            boolean r0 = r1.zaa
            return r0
    }

    @com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse.AvailabilityStatus
    public int getAvailabilityStatus() {
            r1 = this;
            int r0 = r1.zab
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r3, int r4) {
            r2 = this;
            int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r3)
            r0 = 1
            boolean r1 = r2.areModulesAvailable()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r3, r0, r1)
            r0 = 2
            int r1 = r2.getAvailabilityStatus()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r3, r0, r1)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r3, r4)
            return
    }
}
