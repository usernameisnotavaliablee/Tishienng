package com.google.android.gms.common.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzab extends com.google.android.gms.internal.common.zza implements com.google.android.gms.common.internal.IGmsCallbacks {
    zzab(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.common.internal.IGmsCallbacks"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void onPostInitComplete(int r2, android.os.IBinder r3, android.os.Bundle r4) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeInt(r2)
            r0.writeStrongBinder(r3)
            com.google.android.gms.internal.common.zzc.zzc(r0, r4)
            r2 = 1
            r1.zzC(r2, r0)
            return
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void zzb(int r1, android.os.Bundle r2) throws android.os.RemoteException {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void zzc(int r1, android.os.IBinder r2, com.google.android.gms.common.internal.zzk r3) throws android.os.RemoteException {
            r0 = this;
            r1 = 0
            throw r1
    }
}
