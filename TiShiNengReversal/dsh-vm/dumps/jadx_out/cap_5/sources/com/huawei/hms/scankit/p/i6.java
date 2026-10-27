package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class i6 {
    private final boolean a;

    i6(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public void a(com.huawei.hms.scankit.p.u6[] r5) {
            r4 = this;
            boolean r0 = r4.a
            if (r0 == 0) goto L15
            if (r5 == 0) goto L15
            int r0 = r5.length
            r1 = 3
            if (r0 >= r1) goto Lb
            goto L15
        Lb:
            r0 = 0
            r1 = r5[r0]
            r2 = 2
            r3 = r5[r2]
            r5[r0] = r3
            r5[r2] = r1
        L15:
            return
    }
}
