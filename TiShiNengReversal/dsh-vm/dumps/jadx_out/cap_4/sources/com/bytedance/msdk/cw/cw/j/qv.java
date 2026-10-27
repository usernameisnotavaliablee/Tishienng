package com.bytedance.msdk.cw.cw.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class qv implements com.bytedance.msdk.cw.cw.j.j {
    public qv() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bytedance.msdk.cw.cw.j.j
    public void j(com.bytedance.msdk.cw.cw.j.j.InterfaceC0233j r26) {
            r25 = this;
            com.bytedance.msdk.cw.m.j.xt r0 = r26.j()
            com.bytedance.msdk.api.j.xt r1 = r0.mi()
            r1.v()
            boolean r2 = r1.sm()
            if (r2 == 0) goto L1ce
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r1.v()
            java.lang.String r3 = com.bytedance.msdk.j.up.up.j(r3)
            r2.append(r3)
            java.lang.String r3 = "V2 公共缓存池广告请求......"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r15 = "TTMediationSDK"
            com.bytedance.msdk.j.up.cw.xt(r15, r2)
            com.bytedance.msdk.core.oq.xt r2 = r0.vl()
            r16 = 0
            if (r2 == 0) goto L42
            com.bytedance.msdk.core.oq.xt r2 = r0.vl()
            java.lang.String r2 = r2.hh()
            r17 = r2
            goto L44
        L42:
            r17 = r16
        L44:
            boolean r2 = r0.v()
            r3 = r2 ^ 1
            com.bytedance.msdk.core.ws.cw r2 = com.bytedance.msdk.core.xt.xt()
            boolean r2 = r2.m()
            if (r2 == 0) goto L1ab
            com.bytedance.msdk.cw.up.j r2 = com.bytedance.msdk.cw.up.j.j()
            java.util.List r11 = r2.j(r1)
            if (r11 == 0) goto L188
            boolean r2 = r11.isEmpty()
            if (r2 != 0) goto L188
            r2 = 0
            java.lang.Object r2 = r11.get(r2)
            com.bytedance.msdk.core.up.xt.ae r2 = (com.bytedance.msdk.core.up.xt.ae) r2
            com.bytedance.msdk.xt.cw r2 = r2.j
            r7 = r3
            com.bytedance.msdk.core.oq.xt r3 = r0.vl()
            com.bytedance.msdk.core.oq.g r4 = r0.wq()
            java.lang.String r6 = r4.j
            int r8 = r11.size()
            com.bytedance.msdk.core.oq.g r4 = r0.wq()
            boolean r9 = r4.up
            r10 = 0
            r4 = 0
            r24 = r2
            r2 = r1
            r1 = r24
            com.bytedance.msdk.up.m.j(r1, r2, r3, r4, r6, r7, r8, r9, r10)
            r1 = r2
            r18 = r7
            int r2 = r11.size()
            int r2 = r2 + (-1)
            r3 = r16
        L98:
            if (r2 < 0) goto L152
            java.lang.Object r4 = r11.get(r2)
            com.bytedance.msdk.core.up.xt.ae r4 = (com.bytedance.msdk.core.up.xt.ae) r4
            com.bytedance.msdk.xt.cw r5 = r4.j
            java.lang.String r6 = r4.m()
            r5.j(r6)
            com.bytedance.msdk.api.j.xt r6 = r4.r()
            if (r6 == 0) goto Lb8
            com.bytedance.msdk.api.j.xt r6 = r4.r()
            java.lang.String r6 = r6.j()
            goto Lba
        Lb8:
            r6 = r16
        Lba:
            r5.xt(r6)
            if (r2 != 0) goto Lc3
            java.lang.String r3 = r4.m()
        Lc3:
            r19 = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r3.add(r5)
            java.lang.String r6 = r4.m()
            com.bytedance.msdk.cw.up.j.j(r1, r6)
            com.bytedance.msdk.core.ws.cw r6 = com.bytedance.msdk.core.xt.xt()
            java.lang.String r7 = r4.m()
            int r8 = r1.f()
            r9 = 102(0x66, float:1.43E-43)
            com.bytedance.msdk.core.oq.xt r6 = r6.j(r7, r8, r9)
            java.lang.String r7 = r5.qa()
            com.bytedance.msdk.core.oq.oq r6 = r6.m(r7)
            com.bytedance.msdk.core.up.j.j r7 = com.bytedance.msdk.core.up.j.j.j()
            java.lang.String r8 = r5.qa()
            java.lang.String r7 = r7.j(r8)
            com.bytedance.msdk.api.j.xt r8 = r4.r()
            if (r8 == 0) goto L10a
            com.bytedance.msdk.api.j.xt r4 = r4.r()
            java.lang.String r4 = r4.j()
            r14 = r4
            goto L10c
        L10a:
            r14 = r16
        L10c:
            r4 = 1
            r8 = r5
            r5 = 1
            r9 = r2
            r2 = r1
            r1 = r6
            r6 = 0
            r10 = r3
            r3 = r7
            r7 = 3
            r12 = r8
            r8 = 3
            r13 = r9
            r9 = 0
            r21 = r10
            r20 = r11
            r10 = -1
            r22 = r12
            r12 = 0
            r23 = r13
            r13 = 0
            r26 = r15
            r15 = r21
            com.bytedance.msdk.up.m.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13, r14)
            r1 = r2
            r0.j(r15)
            int r8 = r15.size()
            r11 = 0
            r13 = -1
            r2 = 0
            java.lang.String r3 = "adn cache命中"
            r4 = 0
            r7 = 0
            r9 = 2
            r10 = 0
            r6 = r1
            r1 = r22
            com.bytedance.msdk.up.m.j(r1, r2, r3, r4, r6, r7, r8, r9, r10, r11, r13)
            r1 = r6
            int r2 = r23 + (-1)
            r15 = r26
            r3 = r19
            r11 = r20
            goto L98
        L152:
            r26 = r15
            com.bytedance.msdk.cw.up.j.j(r1, r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r1.v()
            java.lang.String r3 = com.bytedance.msdk.j.up.up.j(r3)
            r2.append(r3)
            java.lang.String r3 = "V2 resetAdLinkInfo......"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = r26
            com.bytedance.msdk.j.up.cw.xt(r3, r2)
            com.bytedance.msdk.core.oq.g r2 = r0.wq()
            java.lang.String r4 = r2.j
            r5 = 0
            r6 = 0
            r2 = r17
            r3 = r18
            com.bytedance.msdk.up.m.j(r1, r2, r3, r4, r5, r6)
            r0.r()
            return
        L188:
            r2 = r17
            java.lang.String r4 = "-1"
            com.bytedance.msdk.cw.up.j.j(r1, r4)
            com.bytedance.msdk.api.xt.j r7 = new com.bytedance.msdk.api.xt.j
            r4 = 41008(0xa030, float:5.7464E-41)
            java.lang.String r5 = com.bytedance.msdk.api.j.j(r4)
            r7.<init>(r4, r5)
            com.bytedance.msdk.core.oq.g r4 = r0.wq()
            java.lang.String r4 = r4.j
            int r5 = r7.j
            r6 = 0
            com.bytedance.msdk.up.m.j(r1, r2, r3, r4, r5, r6)
            r0.j(r7)
            return
        L1ab:
            r2 = r17
            java.lang.String r4 = "-2"
            com.bytedance.msdk.cw.up.j.j(r1, r4)
            com.bytedance.msdk.api.xt.j r7 = new com.bytedance.msdk.api.xt.j
            r4 = 41007(0xa02f, float:5.7463E-41)
            java.lang.String r5 = com.bytedance.msdk.api.j.j(r4)
            r7.<init>(r4, r5)
            com.bytedance.msdk.core.oq.g r4 = r0.wq()
            java.lang.String r4 = r4.j
            int r5 = r7.j
            r6 = 0
            com.bytedance.msdk.up.m.j(r1, r2, r3, r4, r5, r6)
            r0.j(r7)
            return
        L1ce:
            com.bytedance.msdk.cw.m.j.xt r0 = r26.j()
            r1 = r26
            r1.j(r0)
            return
    }

    @Override // com.bytedance.msdk.cw.cw.j.j
    public void xt(com.bytedance.msdk.cw.cw.j.j.InterfaceC0233j r2) {
            r1 = this;
            r0 = 0
            r2.j(r0)
            return
    }
}
