package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class f6 implements android.hardware.Camera.PreviewCallback {
    private com.huawei.hms.scankit.p.j0.e a;

    public f6(com.huawei.hms.scankit.p.j0.e r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] r1, android.hardware.Camera r2) {
            r0 = this;
            com.huawei.hms.scankit.p.j0$e r2 = r0.a
            r2.a(r1)
            return
    }
}
