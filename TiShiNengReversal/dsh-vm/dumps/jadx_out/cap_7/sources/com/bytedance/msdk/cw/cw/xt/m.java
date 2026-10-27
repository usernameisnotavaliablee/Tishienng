package com.bytedance.msdk.cw.cw.xt;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class m implements com.bytedance.msdk.cw.cw.xt.j {
    public m() {
            r0 = this;
            r0.<init>()
            return
    }

    private boolean j(com.bytedance.msdk.cw.m.j.xt r20, com.bytedance.msdk.cw.m.xt.xt r21, com.bytedance.msdk.api.j.xt r22, java.lang.String r23, com.bytedance.msdk.core.oq.oq r24, int r25) {
            r19 = this;
            r0 = r23
            r1 = r24
            com.bytedance.msdk.core.up.j.j r2 = com.bytedance.msdk.core.up.j.j.j()
            java.lang.String r3 = r22.v()
            r10 = r25
            r2.j(r3, r0, r1, r10)
            com.bytedance.msdk.core.up.j.j r2 = com.bytedance.msdk.core.up.j.j.j()
            int r3 = r22.up()
            r9 = r22
            java.util.List r14 = r2.j(r0, r9, r3)
            r15 = 0
            if (r14 == 0) goto Lb5
            int r2 = r14.size()
            if (r2 > 0) goto L2a
            goto Lb5
        L2a:
            java.lang.Object r2 = r14.get(r15)
            com.bytedance.msdk.core.up.xt.ae r2 = (com.bytedance.msdk.core.up.xt.ae) r2
            com.bytedance.msdk.xt.cw r2 = r2.j
            java.lang.String r3 = r9.j()
            int r8 = r2.tl(r3)
            com.bytedance.msdk.core.up.j.j r2 = com.bytedance.msdk.core.up.j.j.j()
            java.lang.String r3 = r2.j(r0)
            boolean r2 = r20.v()
            r18 = 1
            r4 = r2 ^ 1
            r12 = 0
            r13 = 0
            r5 = 1
            r7 = 3
            r9 = 0
            r10 = -1
            r2 = r22
            r6 = r25
            com.bytedance.msdk.up.m.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r14.iterator()
        L61:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L91
            java.lang.Object r4 = r3.next()
            com.bytedance.msdk.core.up.xt.ae r4 = (com.bytedance.msdk.core.up.xt.ae) r4
            com.bytedance.msdk.xt.cw r5 = r4.j
            r6 = 3
            r5.g(r6)
            com.bytedance.msdk.xt.cw r5 = r4.j
            r5.oq(r8)
            com.bytedance.msdk.xt.cw r5 = r4.j
            r5.cw(r15)
            com.bytedance.msdk.xt.cw r5 = r4.j
            r5.xt(r15)
            com.bytedance.msdk.xt.cw r5 = r4.j
            java.lang.String r6 = r22.v()
            com.bytedance.msdk.cw.tl.up.j(r5, r6, r0)
            com.bytedance.msdk.xt.cw r4 = r4.j
            r2.add(r4)
            goto L61
        L91:
            java.lang.Object r0 = r14.get(r15)
            com.bytedance.msdk.core.up.xt.ae r0 = (com.bytedance.msdk.core.up.xt.ae) r0
            com.bytedance.msdk.xt.cw r4 = r0.j
            int r11 = r2.size()
            r14 = 0
            r16 = -1
            r5 = 0
            java.lang.String r6 = "adn cache命中"
            r7 = 0
            r12 = 2
            r13 = 0
            r9 = r22
            r10 = r25
            com.bytedance.msdk.up.m.j(r4, r5, r6, r7, r9, r10, r11, r12, r13, r14, r16)
            r0 = r21
            r0.j(r2, r1)
            return r18
        Lb5:
            return r15
    }

    public void j(com.bytedance.msdk.cw.cw.xt.j.j r9) {
            r8 = this;
            com.bytedance.msdk.cw.m.xt.xt r0 = r9.j()
            com.bytedance.msdk.core.oq.oq r6 = r0.tl()
            com.bytedance.msdk.cw.m.j.xt r0 = r9.xt()
            com.bytedance.msdk.api.j.xt r4 = r0.mi()
            if (r6 == 0) goto Lad
            java.lang.String r5 = r6.w()
            boolean r0 = r6.kt()
            if (r0 == 0) goto Lad
            com.bytedance.msdk.core.up.j.j r0 = com.bytedance.msdk.core.up.j.j.j()
            java.lang.String r1 = r4.v()
            int r2 = r4.up()
            boolean r0 = r0.r(r1, r5, r2)
            if (r0 == 0) goto Lad
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "--==-- 广告复用，模式："
            r0.<init>(r1)
            com.bytedance.msdk.core.up.j.j r1 = com.bytedance.msdk.core.up.j.j.j()
            java.lang.String r2 = r4.v()
            int r3 = r4.up()
            int r1 = r1.up(r2, r5, r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TTMediationSDK"
            com.bytedance.msdk.j.up.cw.xt(r1, r0)
            com.bytedance.msdk.core.up.j.j r0 = com.bytedance.msdk.core.up.j.j.j()
            r1 = 1
            int r0 = r0.j(r5, r4, r1)
            com.bytedance.msdk.cw.m.xt.xt r1 = r9.j()
            r1.cw(r0)
            r1 = 3
            r2 = 2
            if (r0 != r1) goto L7d
            com.bytedance.msdk.cw.m.xt.xt r0 = r9.j()
            r0.j(r2)
            com.bytedance.msdk.cw.m.j.xt r2 = r9.xt()
            com.bytedance.msdk.cw.m.xt.xt r3 = r9.j()
            r7 = 2
            r1 = r8
            boolean r0 = r1.j(r2, r3, r4, r5, r6, r7)
            if (r0 == 0) goto Lae
            return
        L7d:
            r1 = r8
            if (r0 != r2) goto Lae
            com.bytedance.msdk.core.up.j.j r0 = com.bytedance.msdk.core.up.j.j.j()
            int r2 = r4.up()
            java.util.List r0 = r0.j(r5, r4, r2)
            if (r0 == 0) goto Lae
            int r2 = r0.size()
            if (r2 <= 0) goto Lae
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            com.bytedance.msdk.core.up.xt.ae r0 = (com.bytedance.msdk.core.up.xt.ae) r0
            com.bytedance.msdk.xt.cw r0 = r0.j
            java.lang.String r2 = r4.j()
            int r0 = r0.tl(r2)
            com.bytedance.msdk.cw.m.xt.xt r2 = r9.j()
            r2.xt(r0)
            goto Lae
        Lad:
            r1 = r8
        Lae:
            r9.j(r8)
            return
    }
}
