package com.huawei.hms.hmsscankit;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
class e extends com.huawei.hms.hmsscankit.api.IOnResultCallback.Stub {
    private final com.huawei.hms.hmsscankit.OnResultCallback a;
    private java.lang.String b;
    private boolean c;

    e(com.huawei.hms.hmsscankit.OnResultCallback r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.c = r2
            return
    }

    @Override // com.huawei.hms.hmsscankit.api.IOnResultCallback
    public void onResult(com.huawei.hms.ml.scan.HmsScan[] r6) throws android.os.RemoteException {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "result callback sdk continueScan"
            r0.append(r1)
            boolean r2 = r5.c
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "OnResultCallbackDelegat"
            com.huawei.hms.scankit.p.o4.d(r2, r0)
            boolean r0 = r5.c
            if (r0 == 0) goto L22
            com.huawei.hms.hmsscankit.OnResultCallback r0 = r5.a
            r0.onResult(r6)
            return
        L22:
            if (r6 == 0) goto L59
            int r0 = r6.length
            if (r0 <= 0) goto L59
            r0 = 0
            r3 = r6[r0]
            if (r3 == 0) goto L59
            java.lang.String r4 = r5.b
            java.lang.String r3 = r3.getOriginalValue()
            boolean r3 = android.text.TextUtils.equals(r4, r3)
            if (r3 != 0) goto L59
            r0 = r6[r0]
            java.lang.String r0 = r0.getOriginalValue()
            r5.b = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            boolean r1 = r5.c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.huawei.hms.scankit.p.o4.d(r2, r0)
            com.huawei.hms.hmsscankit.OnResultCallback r0 = r5.a
            r0.onResult(r6)
        L59:
            return
    }
}
