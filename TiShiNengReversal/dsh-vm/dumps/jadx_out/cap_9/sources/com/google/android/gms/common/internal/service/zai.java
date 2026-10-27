package com.google.android.gms.common.internal.service;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zai extends com.google.android.gms.internal.base.zaa implements android.os.IInterface {
    zai(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.common.internal.service.IClientTelemetryService"
            r1.<init>(r2, r0)
            return
    }

    public final void zae(com.google.android.gms.common.internal.TelemetryData r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zaa()
            com.google.android.gms.internal.base.zac.zac(r0, r2)
            r2 = 1
            r1.zad(r2, r0)
            return
    }
}
