package com.huawei.hms.hmsscankit;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
class c extends com.huawei.hms.hmsscankit.api.IOnErrorCallback.Stub {
    private final com.huawei.hms.hmsscankit.OnErrorCallback a;

    c(com.huawei.hms.hmsscankit.OnErrorCallback r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // com.huawei.hms.hmsscankit.api.IOnErrorCallback
    public void onError(int r2) throws android.os.RemoteException {
            r1 = this;
            com.huawei.hms.hmsscankit.OnErrorCallback r0 = r1.a
            if (r0 == 0) goto L9
            com.huawei.hms.hmsscankit.OnErrorCallback r0 = r1.a
            r0.onError(r2)
        L9:
            return
    }
}
