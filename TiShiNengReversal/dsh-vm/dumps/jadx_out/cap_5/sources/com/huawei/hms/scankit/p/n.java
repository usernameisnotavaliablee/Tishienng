package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class n implements com.huawei.hms.scankit.p.v2 {
    n() {
            r0 = this;
            r0.<init>()
            return
    }

    private static char a(char r1, int r2) {
            int r2 = r2 * 149
            r0 = 255(0xff, float:3.57E-43)
            int r2 = r2 % r0
            int r2 = r2 + 1
            int r1 = r1 + r2
            if (r1 > r0) goto Lc
            char r1 = (char) r1
            return r1
        Lc:
            int r1 = r1 + (-256)
            char r1 = (char) r1
            return r1
    }

    public int a() {
            r1 = this;
            r0 = 5
            return r0
    }

    @Override // com.huawei.hms.scankit.p.v2
    public void a(com.huawei.hms.scankit.p.y2 r7) {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            r0.append(r1)
        L9:
            boolean r2 = r7.i()
            r3 = 1
            if (r2 == 0) goto L33
            char r2 = r7.c()
            r0.append(r2)
            int r2 = r7.f
            int r2 = r2 + r3
            r7.f = r2
            java.lang.String r2 = r7.d()
            int r4 = r7.f
            int r5 = r6.a()
            int r2 = com.huawei.hms.scankit.p.d4.a(r2, r4, r5)
            int r4 = r6.a()
            if (r2 == r4) goto L9
            r7.b(r1)
        L33:
            int r2 = r0.length()
            int r2 = r2 - r3
            int r4 = r7.a()
            int r4 = r4 + r2
            int r4 = r4 + r3
            r7.c(r4)
            com.huawei.hms.scankit.p.d7 r5 = r7.g()
            int r5 = r5.a()
            int r5 = r5 - r4
            if (r5 <= 0) goto L4e
            r4 = 1
            goto L4f
        L4e:
            r4 = 0
        L4f:
            boolean r5 = r7.i()
            if (r5 != 0) goto L57
            if (r4 == 0) goto L71
        L57:
            r4 = 249(0xf9, float:3.49E-43)
            if (r2 > r4) goto L60
            char r2 = (char) r2
            r0.setCharAt(r1, r2)
            goto L71
        L60:
            r5 = 1555(0x613, float:2.179E-42)
            if (r2 > r5) goto L8b
            int r5 = r2 / 250
            int r5 = r5 + r4
            char r4 = (char) r5
            r0.setCharAt(r1, r4)
            int r2 = r2 % 250
            char r2 = (char) r2
            r0.insert(r3, r2)
        L71:
            int r2 = r0.length()
        L75:
            if (r1 >= r2) goto L8a
            char r4 = r0.charAt(r1)
            int r5 = r7.a()
            int r5 = r5 + r3
            char r4 = a(r4, r5)
            r7.a(r4)
            int r1 = r1 + 1
            goto L75
        L8a:
            return
        L8b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Message length not in valid ranges: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
    }
}
