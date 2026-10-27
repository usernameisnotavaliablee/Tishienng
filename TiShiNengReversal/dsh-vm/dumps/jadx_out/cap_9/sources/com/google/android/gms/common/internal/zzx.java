package com.google.android.gms.common.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzx extends com.google.android.gms.internal.common.zza implements com.google.android.gms.common.internal.ICancelToken {
    zzx(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.common.internal.ICancelToken"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.common.internal.ICancelToken
    public final void cancel() throws android.os.RemoteException {
            r2 = this;
            r0 = 2
            android.os.Parcel r1 = r2.zza()
            r2.zzD(r0, r1)
            return
    }
}
