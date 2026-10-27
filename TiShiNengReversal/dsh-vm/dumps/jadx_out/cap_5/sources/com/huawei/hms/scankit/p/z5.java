package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class z5 implements com.huawei.hms.scankit.p.g4 {
    private java.util.List<com.huawei.hms.scankit.p.g4> a;

    public z5() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a = r0
            return
    }

    public void a(@androidx.annotation.NonNull com.huawei.hms.scankit.p.g4 r2) {
            r1 = this;
            java.util.List<com.huawei.hms.scankit.p.g4> r0 = r1.a
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a = r0
        Lb:
            java.util.List<com.huawei.hms.scankit.p.g4> r0 = r1.a
            r0.add(r2)
            return
    }

    @Override // com.huawei.hms.scankit.p.g4
    public void a(@androidx.annotation.NonNull com.huawei.hms.scankit.p.w5 r3) {
            r2 = this;
            java.util.List<com.huawei.hms.scankit.p.g4> r0 = r2.a
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.huawei.hms.scankit.p.g4 r1 = (com.huawei.hms.scankit.p.g4) r1
            r1.a(r3)
            goto L6
        L16:
            return
    }
}
