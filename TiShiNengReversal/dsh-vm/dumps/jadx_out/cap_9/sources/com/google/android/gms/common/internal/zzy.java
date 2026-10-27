package com.google.android.gms.common.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzy extends com.google.android.gms.internal.common.zza implements com.google.android.gms.common.internal.zzaa {
    zzy(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.common.internal.ICertData"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.common.internal.zzaa
    public final int zzc() throws android.os.RemoteException {
            r2 = this;
            r0 = 2
            android.os.Parcel r1 = r2.zza()
            android.os.Parcel r0 = r2.zzB(r0, r1)
            int r1 = r0.readInt()
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.common.internal.zzaa
    public final com.google.android.gms.dynamic.IObjectWrapper zzd() throws android.os.RemoteException {
            r2 = this;
            r0 = 1
            android.os.Parcel r1 = r2.zza()
            android.os.Parcel r0 = r2.zzB(r0, r1)
            android.os.IBinder r1 = r0.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
            r0.recycle()
            return r1
    }
}
