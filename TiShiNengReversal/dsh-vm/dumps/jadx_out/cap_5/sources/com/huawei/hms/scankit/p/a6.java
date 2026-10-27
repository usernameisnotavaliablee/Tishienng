package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a6 implements com.huawei.hms.scankit.p.g4 {
    private final float a;
    private final float b;

    public a6(float r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.a = r2
            return
    }

    @Override // com.huawei.hms.scankit.p.g4
    public void a(@androidx.annotation.NonNull com.huawei.hms.scankit.p.w5 r4) {
            r3 = this;
            float r0 = r3.a
            float r1 = r3.b
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 != 0) goto L9
            goto L11
        L9:
            float r0 = r0 - r1
            float r0 = com.huawei.hms.scankit.p.n6.a(r0)
            float r1 = r3.b
            float r0 = r0 + r1
        L11:
            r4.b(r0)
            r4.a(r0)
            return
    }
}
