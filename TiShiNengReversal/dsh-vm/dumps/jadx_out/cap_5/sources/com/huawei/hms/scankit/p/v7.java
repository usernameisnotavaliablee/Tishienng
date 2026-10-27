package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class v7 {
    public v7() {
            r1 = this;
            r1.<init>()
            return
    }

    public static float a(com.huawei.hms.scankit.p.u6[] r11, com.huawei.hms.scankit.p.u6[] r12) {
            int r0 = r11.length
            r1 = 1
            r2 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r3 = 0
            r4 = 0
            r5 = 1
            r6 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r7 = 1
            r8 = 2139095039(0x7f7fffff, float:3.4028235E38)
        Lf:
            if (r4 >= r0) goto L46
            r9 = r11[r4]
            float r10 = r9.b()
            int r10 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r10 <= 0) goto L1f
            float r5 = r9.b()
        L1f:
            float r10 = r9.b()
            int r10 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r10 >= 0) goto L2b
            float r6 = r9.b()
        L2b:
            float r10 = r9.c()
            int r10 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r10 <= 0) goto L37
            float r7 = r9.c()
        L37:
            float r10 = r9.c()
            int r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r10 >= 0) goto L43
            float r8 = r9.c()
        L43:
            int r4 = r4 + 1
            goto Lf
        L46:
            int r11 = r12.length
            r0 = 1
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r4 = 0
        L4c:
            if (r4 >= r11) goto L83
            r9 = r12[r4]
            float r10 = r9.b()
            int r10 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r10 <= 0) goto L5c
            float r1 = r9.b()
        L5c:
            float r10 = r9.b()
            int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r10 >= 0) goto L68
            float r2 = r9.b()
        L68:
            float r10 = r9.c()
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 <= 0) goto L74
            float r0 = r9.c()
        L74:
            float r10 = r9.c()
            int r10 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r10 >= 0) goto L80
            float r3 = r9.c()
        L80:
            int r4 = r4 + 1
            goto L4c
        L83:
            int r11 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r11 >= 0) goto L89
            r11 = r1
            goto L8a
        L89:
            r11 = r5
        L8a:
            int r12 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r12 <= 0) goto L90
            r12 = r2
            goto L91
        L90:
            r12 = r6
        L91:
            float r11 = r11 - r12
            int r12 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r12 >= 0) goto L98
            r12 = r0
            goto L99
        L98:
            r12 = r7
        L99:
            int r4 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r4 <= 0) goto L9f
            r4 = r3
            goto La0
        L9f:
            r4 = r8
        La0:
            float r12 = r12 - r4
            r4 = 0
            int r9 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r9 >= 0) goto La7
            r11 = 0
        La7:
            int r9 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r9 >= 0) goto Lac
            r12 = 0
        Lac:
            float r11 = r11 * r12
            float r5 = r5 - r6
            float r7 = r7 - r8
            float r5 = r5 * r7
            float r1 = r1 - r2
            float r0 = r0 - r3
            float r1 = r1 * r0
            float r5 = r5 + r1
            float r5 = r5 - r11
            float r11 = r11 / r5
            return r11
    }

    public static java.util.List<com.huawei.hms.scankit.p.s6> a(java.util.List<com.huawei.hms.scankit.p.s6> r7) {
            r0 = 0
        L1:
            int r1 = r7.size()
            int r1 = r1 + (-1)
            if (r0 >= r1) goto L47
            int r1 = r7.size()
            int r1 = r1 + (-1)
        Lf:
            if (r1 <= r0) goto L44
            java.lang.Object r2 = r7.get(r0)
            com.huawei.hms.scankit.p.s6 r2 = (com.huawei.hms.scankit.p.s6) r2
            java.lang.Object r3 = r7.get(r1)
            com.huawei.hms.scankit.p.s6 r3 = (com.huawei.hms.scankit.p.s6) r3
            java.lang.String r4 = r2.k()
            java.lang.String r5 = r3.k()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L41
            com.huawei.hms.scankit.p.u6[] r2 = r2.j()
            com.huawei.hms.scankit.p.u6[] r3 = r3.j()
            float r2 = a(r2, r3)
            double r2 = (double) r2
            r4 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L41
            r7.remove(r1)
        L41:
            int r1 = r1 + (-1)
            goto Lf
        L44:
            int r0 = r0 + 1
            goto L1
        L47:
            return r7
    }
}
