package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class n8 extends com.huawei.hms.scankit.p.d0 {
    n8() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.huawei.hms.scankit.p.d0
    public int a() {
            r1 = this;
            r0 = 3
            return r0
    }

    @Override // com.huawei.hms.scankit.p.d0
    int a(char r3, java.lang.StringBuilder r4) {
            r2 = this;
            r0 = 13
            r1 = 1
            if (r3 == r0) goto L41
            r0 = 32
            if (r3 == r0) goto L3c
            r0 = 42
            if (r3 == r0) goto L38
            r0 = 62
            if (r3 == r0) goto L33
            r0 = 48
            if (r3 < r0) goto L20
            r0 = 57
            if (r3 > r0) goto L20
            int r3 = r3 + (-44)
            char r3 = (char) r3
            r4.append(r3)
            goto L45
        L20:
            r0 = 65
            if (r3 < r0) goto L2f
            r0 = 90
            if (r3 > r0) goto L2f
            int r3 = r3 + (-51)
            char r3 = (char) r3
            r4.append(r3)
            goto L45
        L2f:
            com.huawei.hms.scankit.p.d4.a(r3)
            goto L45
        L33:
            r3 = 2
            r4.append(r3)
            goto L45
        L38:
            r4.append(r1)
            goto L45
        L3c:
            r3 = 3
            r4.append(r3)
            goto L45
        L41:
            r3 = 0
            r4.append(r3)
        L45:
            return r1
    }

    @Override // com.huawei.hms.scankit.p.d0, com.huawei.hms.scankit.p.v2
    public void a(com.huawei.hms.scankit.p.y2 r5) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L5:
            boolean r1 = r5.i()
            if (r1 == 0) goto L3b
            char r1 = r5.c()
            int r2 = r5.f
            int r2 = r2 + 1
            r5.f = r2
            r4.a(r1, r0)
            int r1 = r0.length()
            int r1 = r1 % 3
            if (r1 != 0) goto L5
            com.huawei.hms.scankit.p.d0.b(r5, r0)
            java.lang.String r1 = r5.d()
            int r2 = r5.f
            int r3 = r4.a()
            int r1 = com.huawei.hms.scankit.p.d4.a(r1, r2, r3)
            int r2 = r4.a()
            if (r1 == r2) goto L5
            r1 = 0
            r5.b(r1)
        L3b:
            r4.a(r5, r0)
            return
    }

    @Override // com.huawei.hms.scankit.p.d0
    void a(com.huawei.hms.scankit.p.y2 r3, java.lang.StringBuilder r4) {
            r2 = this;
            r3.l()
            com.huawei.hms.scankit.p.d7 r0 = r3.g()
            int r0 = r0.a()
            int r1 = r3.a()
            int r0 = r0 - r1
            int r4 = r4.length()
            int r1 = r3.f
            int r1 = r1 - r4
            r3.f = r1
            int r4 = r3.f()
            r1 = 1
            if (r4 > r1) goto L28
            if (r0 > r1) goto L28
            int r4 = r3.f()
            if (r4 == r0) goto L2d
        L28:
            r4 = 254(0xfe, float:3.56E-43)
            r3.a(r4)
        L2d:
            int r4 = r3.e()
            if (r4 >= 0) goto L37
            r4 = 0
            r3.b(r4)
        L37:
            return
    }
}
