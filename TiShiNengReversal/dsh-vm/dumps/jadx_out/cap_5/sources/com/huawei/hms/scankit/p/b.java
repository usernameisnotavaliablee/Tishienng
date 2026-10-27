package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class b implements com.huawei.hms.scankit.p.v2 {
    b() {
            r0 = this;
            r0.<init>()
            return
    }

    private static char a(char r3, char r4) {
            boolean r0 = com.huawei.hms.scankit.p.d4.b(r3)
            if (r0 == 0) goto L17
            boolean r0 = com.huawei.hms.scankit.p.d4.b(r4)
            if (r0 == 0) goto L17
            int r3 = r3 + (-48)
            int r3 = r3 * 10
            int r4 = r4 + (-48)
            int r3 = r3 + r4
            int r3 = r3 + 130
            char r3 = (char) r3
            return r3
        L17:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "not digits: "
            r1.append(r2)
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public int a() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.huawei.hms.scankit.p.v2
    public void a(com.huawei.hms.scankit.p.y2 r7) {
            r6 = this;
            java.lang.String r0 = r7.d()
            int r1 = r7.f
            int r0 = com.huawei.hms.scankit.p.d4.a(r0, r1)
            r1 = 1
            r2 = 2
            if (r0 < r2) goto L30
            java.lang.String r0 = r7.d()
            int r3 = r7.f
            char r0 = r0.charAt(r3)
            java.lang.String r3 = r7.d()
            int r4 = r7.f
            int r4 = r4 + r1
            char r1 = r3.charAt(r4)
            char r0 = a(r0, r1)
            r7.a(r0)
            int r0 = r7.f
            int r0 = r0 + r2
            r7.f = r0
            return
        L30:
            char r0 = r7.c()
            java.lang.String r3 = r7.d()
            int r4 = r7.f
            int r5 = r6.a()
            int r3 = com.huawei.hms.scankit.p.d4.a(r3, r4, r5)
            int r4 = r6.a()
            if (r3 == r4) goto L99
            if (r3 == r1) goto L90
            if (r3 == r2) goto L87
            r0 = 3
            if (r3 == r0) goto L7e
            r0 = 4
            if (r3 == r0) goto L75
            r0 = 5
            if (r3 != r0) goto L5e
            r1 = 231(0xe7, float:3.24E-43)
            r7.a(r1)
            r7.b(r0)
            return
        L5e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Illegal mode: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L75:
            r1 = 240(0xf0, float:3.36E-43)
            r7.a(r1)
            r7.b(r0)
            return
        L7e:
            r1 = 238(0xee, float:3.34E-43)
            r7.a(r1)
            r7.b(r0)
            return
        L87:
            r0 = 239(0xef, float:3.35E-43)
            r7.a(r0)
            r7.b(r2)
            return
        L90:
            r0 = 230(0xe6, float:3.22E-43)
            r7.a(r0)
            r7.b(r1)
            return
        L99:
            boolean r2 = com.huawei.hms.scankit.p.d4.c(r0)
            if (r2 == 0) goto Lb0
            r2 = 235(0xeb, float:3.3E-43)
            r7.a(r2)
            int r0 = r0 + (-127)
            char r0 = (char) r0
            r7.a(r0)
            int r0 = r7.f
            int r0 = r0 + r1
            r7.f = r0
            return
        Lb0:
            int r0 = r0 + r1
            char r0 = (char) r0
            r7.a(r0)
            int r0 = r7.f
            int r0 = r0 + r1
            r7.f = r0
            return
    }
}
