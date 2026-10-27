package com.google.android.gms.common.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
@com.google.android.gms.common.annotation.KeepName
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class BinderWrapper implements android.os.Parcelable {

    @androidx.annotation.NonNull
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.internal.BinderWrapper> CREATOR = null;
    private final android.os.IBinder zza;

    static {
            com.google.android.gms.common.internal.zzh r0 = new com.google.android.gms.common.internal.zzh
            r0.<init>()
            com.google.android.gms.common.internal.BinderWrapper.CREATOR = r0
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public BinderWrapper(@androidx.annotation.NonNull android.os.IBinder r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    /* synthetic */ BinderWrapper(android.os.Parcel r1, com.google.android.gms.common.internal.zzi r2) {
            r0 = this;
            r0.<init>()
            android.os.IBinder r1 = r1.readStrongBinder()
            r0.zza = r1
            return
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r1, int r2) {
            r0 = this;
            android.os.IBinder r2 = r0.zza
            r1.writeStrongBinder(r2)
            return
    }
}
