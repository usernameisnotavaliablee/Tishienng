package com.google.android.gms.signin.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zaf extends com.google.android.gms.internal.base.zaa implements android.os.IInterface {
    zaf(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.signin.internal.ISignInService"
            r1.<init>(r2, r0)
            return
    }

    public final void zae(int r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zaa()
            r0.writeInt(r2)
            r2 = 7
            r1.zac(r2, r0)
            return
    }

    public final void zaf(com.google.android.gms.common.internal.IAccountAccessor r2, int r3, boolean r4) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zaa()
            com.google.android.gms.internal.base.zac.zad(r0, r2)
            r0.writeInt(r3)
            r0.writeInt(r4)
            r2 = 9
            r1.zac(r2, r0)
            return
    }

    public final void zag(com.google.android.gms.signin.internal.zai r2, com.google.android.gms.signin.internal.zae r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zaa()
            com.google.android.gms.internal.base.zac.zac(r0, r2)
            com.google.android.gms.internal.base.zac.zad(r0, r3)
            r2 = 12
            r1.zac(r2, r0)
            return
    }
}
