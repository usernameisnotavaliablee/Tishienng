package com.google.android.gms.common.internal.service;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class zaj extends com.google.android.gms.internal.base.zab implements com.google.android.gms.common.internal.service.zak {
    public zaj() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.common.internal.service.ICommonCallbacks"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.base.zab
    protected final boolean zaa(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
            r0 = this;
            r3 = 1
            if (r1 != r3) goto Le
            int r1 = r2.readInt()
            com.google.android.gms.internal.base.zac.zab(r2)
            r0.zab(r1)
            return r3
        Le:
            r1 = 0
            return r1
    }
}
