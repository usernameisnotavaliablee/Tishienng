package com.bytedance.msdk.cw.cw.xt;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class r implements com.bytedance.msdk.cw.cw.xt.j {
    public r() {
            r0 = this;
            r0.<init>()
            return
    }

    public void j(com.bytedance.msdk.cw.cw.xt.j.j r17) {
            r16 = this;
            com.bytedance.msdk.cw.m.xt.xt r0 = r17.j()
            com.bytedance.msdk.cw.m.j.xt r1 = r17.xt()
            com.bytedance.msdk.core.oq.oq r2 = r0.tl()
            com.bytedance.msdk.api.j.xt r3 = r1.mi()
            java.lang.String r3 = r3.v()
            if (r2 == 0) goto L1f0
            boolean r4 = r2.r()
            java.lang.String r5 = "TMe"
            if (r4 == 0) goto Lba
            com.bytedance.msdk.core.tl.qv r4 = com.bytedance.msdk.core.tl.qv.j()
            java.lang.String r6 = r2.w()
            boolean r4 = r4.cw(r3, r6)
            if (r4 != 0) goto Lba
            java.lang.String r4 = "adn 请求触发次数拦截............"
            com.bytedance.msdk.j.up.cw.xt(r5, r4)
            com.bytedance.msdk.core.tl.qv r4 = com.bytedance.msdk.core.tl.qv.j()
            java.lang.String r5 = r2.w()
            android.util.Pair r3 = r4.j(r3, r5)
            r4 = 41041(0xa051, float:5.751E-41)
            if (r3 == 0) goto L55
            com.bytedance.msdk.api.xt.xt r5 = new com.bytedance.msdk.api.xt.xt
            java.lang.String r6 = com.bytedance.msdk.api.j.j(r4)
            java.lang.Object r7 = r3.second
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r3 = r3.first
            java.lang.String r3 = (java.lang.String) r3
            r5.<init>(r4, r6, r7, r3)
        L53:
            r10 = r5
            goto L5f
        L55:
            com.bytedance.msdk.api.j r5 = new com.bytedance.msdk.api.j
            java.lang.String r3 = com.bytedance.msdk.api.j.j(r4)
            r5.<init>(r4, r3)
            goto L53
        L5f:
            com.bytedance.msdk.api.j.xt r3 = r1.mi()
            com.bytedance.msdk.core.up.j.j r4 = com.bytedance.msdk.core.up.j.j.j()
            java.lang.String r5 = r2.w()
            java.lang.String r4 = r4.j(r5)
            boolean r5 = r0.up()
            int r7 = r0.cw()
            int r8 = r0.ae()
            int r9 = r0.m()
            com.bytedance.msdk.core.oq.g r6 = r1.wq()
            boolean r13 = r6.up
            r14 = 0
            r6 = 2
            r11 = -1
            com.bytedance.msdk.up.m.j(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14)
            com.bytedance.msdk.api.j.xt r3 = r1.mi()
            int r5 = r0.cw()
            int r6 = r0.ae()
            int r7 = r0.m()
            com.bytedance.msdk.core.up.j.j r1 = com.bytedance.msdk.core.up.j.j.j()
            java.lang.String r4 = r2.w()
            java.lang.String r8 = r1.j(r4)
            r13 = 0
            r14 = 0
            r4 = r2
            r2 = r10
            r9 = 0
            r11 = 0
            r12 = 0
            com.bytedance.msdk.up.m.j(r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r13, r14)
            r10 = r2
            r2 = r4
            r0.j(r10, r2)
            return
        Lba:
            boolean r4 = r2.r()
            if (r4 == 0) goto L170
            com.bytedance.msdk.core.tl.vl r4 = com.bytedance.msdk.core.tl.vl.j()
            java.lang.String r6 = r2.w()
            boolean r4 = r4.cw(r3, r6)
            if (r4 != 0) goto L170
            java.lang.String r4 = "adn 请求触发时间间隔拦截............"
            com.bytedance.msdk.j.up.cw.xt(r5, r4)
            com.bytedance.msdk.core.tl.vl r4 = com.bytedance.msdk.core.tl.vl.j()
            java.lang.String r5 = r2.w()
            com.bytedance.msdk.core.tl.g r4 = r4.r(r3, r5)
            r5 = 41042(0xa052, float:5.7512E-41)
            if (r4 == 0) goto L10b
            com.bytedance.msdk.api.xt.cw r6 = new com.bytedance.msdk.api.xt.cw
            java.lang.String r7 = com.bytedance.msdk.api.j.j(r5)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            com.bytedance.msdk.core.tl.vl r9 = com.bytedance.msdk.core.tl.vl.j()
            java.lang.String r10 = r2.w()
            long r9 = r9.j(r3, r10)
            r8.append(r9)
            java.lang.String r3 = r8.toString()
            java.lang.String r4 = r4.oq()
            r6.<init>(r5, r7, r3, r4)
        L109:
            r10 = r6
            goto L115
        L10b:
            com.bytedance.msdk.api.j r6 = new com.bytedance.msdk.api.j
            java.lang.String r3 = com.bytedance.msdk.api.j.j(r5)
            r6.<init>(r5, r3)
            goto L109
        L115:
            com.bytedance.msdk.api.j.xt r3 = r1.mi()
            com.bytedance.msdk.core.up.j.j r4 = com.bytedance.msdk.core.up.j.j.j()
            java.lang.String r5 = r2.w()
            java.lang.String r4 = r4.j(r5)
            boolean r5 = r0.up()
            int r7 = r0.cw()
            int r8 = r0.ae()
            int r9 = r0.m()
            com.bytedance.msdk.core.oq.g r6 = r1.wq()
            boolean r13 = r6.up
            r14 = 0
            r6 = 2
            r11 = -1
            com.bytedance.msdk.up.m.j(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14)
            com.bytedance.msdk.api.j.xt r3 = r1.mi()
            int r5 = r0.cw()
            int r6 = r0.ae()
            int r7 = r0.m()
            com.bytedance.msdk.core.up.j.j r1 = com.bytedance.msdk.core.up.j.j.j()
            java.lang.String r4 = r2.w()
            java.lang.String r8 = r1.j(r4)
            r13 = 0
            r14 = 0
            r4 = r2
            r2 = r10
            r9 = 0
            r11 = 0
            r12 = 0
            com.bytedance.msdk.up.m.j(r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r13, r14)
            r10 = r2
            r2 = r4
            r0.j(r10, r2)
            return
        L170:
            com.bytedance.msdk.core.tl.ws r4 = com.bytedance.msdk.core.tl.ws.j()
            java.lang.String r6 = r2.i()
            boolean r4 = r4.j(r3, r6)
            if (r4 == 0) goto L1f5
            com.bytedance.msdk.core.tl.ws r4 = com.bytedance.msdk.core.tl.ws.j()
            java.lang.String r6 = r2.az()
            java.lang.String r7 = r2.w()
            com.bytedance.msdk.api.j r10 = r4.j(r3, r6, r7)
            if (r10 == 0) goto L1f0
            java.lang.String r3 = "adn 请求触发了rit级别的错误码拦截............"
            com.bytedance.msdk.j.up.cw.xt(r5, r3)
            com.bytedance.msdk.api.j.xt r3 = r1.mi()
            com.bytedance.msdk.core.up.j.j r4 = com.bytedance.msdk.core.up.j.j.j()
            java.lang.String r5 = r2.w()
            java.lang.String r4 = r4.j(r5)
            boolean r5 = r0.up()
            int r7 = r0.cw()
            int r8 = r0.ae()
            int r9 = r0.m()
            com.bytedance.msdk.core.oq.g r6 = r1.wq()
            boolean r13 = r6.up
            r14 = 0
            r6 = 2
            r11 = -1
            com.bytedance.msdk.up.m.j(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14)
            com.bytedance.msdk.api.j.xt r3 = r1.mi()
            int r5 = r0.cw()
            int r6 = r0.ae()
            int r7 = r0.m()
            com.bytedance.msdk.core.up.j.j r1 = com.bytedance.msdk.core.up.j.j.j()
            java.lang.String r4 = r2.w()
            java.lang.String r8 = r1.j(r4)
            r13 = 0
            r14 = 0
            r4 = r2
            r2 = r10
            r9 = 0
            r11 = 0
            r12 = 0
            com.bytedance.msdk.up.m.j(r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r13, r14)
            r10 = r2
            r2 = r4
            r0.j(r10, r2)
            return
        L1f0:
            r0 = r16
            r1 = r17
            goto L267
        L1f5:
            com.bytedance.msdk.core.tl.cw r3 = com.bytedance.msdk.core.tl.cw.j()
            java.lang.String r4 = r2.az()
            java.lang.String r6 = r2.w()
            com.bytedance.msdk.api.j r10 = r3.j(r4, r6)
            if (r10 == 0) goto L1f0
            java.lang.String r3 = "adn 请求触发了错误码拦截............"
            com.bytedance.msdk.j.up.cw.xt(r5, r3)
            com.bytedance.msdk.api.j.xt r3 = r1.mi()
            com.bytedance.msdk.core.up.j.j r4 = com.bytedance.msdk.core.up.j.j.j()
            java.lang.String r5 = r2.w()
            java.lang.String r4 = r4.j(r5)
            boolean r5 = r0.up()
            int r7 = r0.cw()
            int r8 = r0.ae()
            int r9 = r0.m()
            com.bytedance.msdk.core.oq.g r6 = r1.wq()
            boolean r13 = r6.up
            r14 = 0
            r6 = 2
            r11 = -1
            com.bytedance.msdk.up.m.j(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14)
            com.bytedance.msdk.api.j.xt r3 = r1.mi()
            int r5 = r0.cw()
            int r6 = r0.ae()
            int r7 = r0.m()
            com.bytedance.msdk.core.up.j.j r1 = com.bytedance.msdk.core.up.j.j.j()
            java.lang.String r4 = r2.w()
            java.lang.String r8 = r1.j(r4)
            r13 = 0
            r14 = 0
            r4 = r2
            r2 = r10
            r9 = 0
            r11 = 0
            r12 = 0
            com.bytedance.msdk.up.m.j(r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r13, r14)
            r10 = r2
            r2 = r4
            r0.j(r10, r2)
            return
        L267:
            r1.j(r0)
            return
    }
}
