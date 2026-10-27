package com.huawei.hms.scankit;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class j implements com.huawei.hms.scankit.p.j0.e {
    private com.huawei.hms.scankit.d a;

    public j(com.huawei.hms.scankit.d r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // com.huawei.hms.scankit.p.j0.e
    public void a(byte[] r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "request frame time:"
            r0.append(r1)
            long r1 = java.lang.System.currentTimeMillis()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "scan-time"
            com.huawei.hms.scankit.p.o4.a(r1, r0)
            com.huawei.hms.scankit.d r0 = r3.a
            android.os.Handler r0 = r0.a()
            int r1 = com.huawei.hms.scankit.R.id.scankit_decode
            android.os.Message r4 = r0.obtainMessage(r1, r4)
            r4.sendToTarget()
            return
    }
}
