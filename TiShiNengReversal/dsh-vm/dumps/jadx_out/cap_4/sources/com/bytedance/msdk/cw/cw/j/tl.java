package com.bytedance.msdk.cw.cw.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class tl implements com.bytedance.msdk.cw.cw.j.j {
    private int j;


    public tl() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.j = r0
            return
    }

    private double j(java.lang.String r6, int r7) {
            r5 = this;
            com.bytedance.msdk.ae.j.cw r0 = com.bytedance.msdk.ae.j.cw.j()
            r1 = 102(0x66, float:1.43E-43)
            com.bytedance.msdk.core.oq.xt r6 = r0.j(r6, r7, r1)
            r0 = 0
            if (r6 != 0) goto Lf
            return r0
        Lf:
            java.util.List r6 = r6.ol()
            java.util.Iterator r6 = r6.iterator()
        L17:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L36
            java.lang.Object r7 = r6.next()
            com.bytedance.msdk.core.oq.oq r7 = (com.bytedance.msdk.core.oq.oq) r7
            boolean r2 = r7.uf()
            if (r2 == 0) goto L17
            double r2 = r7.v()
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L17
            double r0 = r7.v()
            goto L17
        L36:
            return r0
    }

    private void j(com.bytedance.msdk.api.j.xt r21, java.lang.String r22, com.bytedance.msdk.core.oq.xt r23, com.bytedance.msdk.cw.m.j.xt r24) {
            r20 = this;
            r1 = r20
            r6 = r21
            r7 = r22
            r5 = r24
            com.bytedance.msdk.core.up.xt.r r0 = com.bytedance.msdk.core.up.xt.r.j()
            com.bytedance.msdk.api.j.xt r0 = r0.xt(r7)
            if (r0 == 0) goto L20
            java.lang.String r2 = r0.j()
            r6.j(r2)
            int r0 = r0.cw()
            r6.xt(r0)
        L20:
            com.bytedance.msdk.core.up.xt.r r0 = com.bytedance.msdk.core.up.xt.r.j()
            r0.j(r7, r6)
            com.bytedance.msdk.api.j.xt r8 = r5.mi()
            java.lang.String r9 = r23.hh()
            boolean r0 = r5.v()
            r2 = 1
            r10 = r0 ^ 1
            com.bytedance.msdk.core.oq.g r0 = r5.wq()
            java.lang.String r11 = r0.j
            r12 = 0
            r13 = 0
            com.bytedance.msdk.up.m.j(r8, r9, r10, r11, r12, r13)
            r0 = 0
            r3 = 0
            com.bytedance.msdk.cw.tl.j.j(r5, r0, r3)
            com.bytedance.msdk.core.up.xt.r r4 = com.bytedance.msdk.core.up.xt.r.j()
            com.bytedance.msdk.core.up.xt.xt r4 = r4.cw(r7)
            if (r4 == 0) goto L6a
            com.bytedance.msdk.cw.m.j.xt r8 = r4.r()
            if (r8 == 0) goto L5f
            com.bytedance.msdk.cw.m.j.xt r8 = r4.r()
            com.bytedance.msdk.core.oq.g r8 = r8.wq()
            goto L60
        L5f:
            r8 = r0
        L60:
            r5.j(r8)
            java.util.concurrent.ConcurrentHashMap r4 = r4.cw()
            r5.j(r4)
        L6a:
            com.bytedance.msdk.core.up.xt.r r4 = com.bytedance.msdk.core.up.xt.r.j()
            int r8 = r6.up()
            int r4 = r4.xt(r7, r8)
            r8 = 2
            if (r4 != r8) goto L82
            r1.j = r2
            r5.j(r2)
            r5.r()
            return
        L82:
            r9 = 4
            r10 = 3
            java.lang.String r11 = "TTMediationSDK"
            if (r4 == r10) goto L99
            if (r4 != r9) goto L8b
            goto L99
        L8b:
            java.lang.String r0 = "--==-- 预缓存reqType错误：reqType = "
            java.lang.String r2 = java.lang.String.valueOf(r4)
            java.lang.String r0 = r0.concat(r2)
            com.bytedance.msdk.j.up.cw.xt(r11, r0)
            return
        L99:
            int r12 = r6.tl()
            if (r12 != r2) goto Lad
            java.lang.String r0 = "--==-- 激励再得情况，不进行预缓存补充，直接对外给出回调"
            com.bytedance.msdk.j.up.cw.xt(r11, r0)
            r1.j = r8
            r5.j(r8)
            r5.r()
            return
        Lad:
            long r12 = com.bytedance.msdk.core.up.xt.r.up(r7)
            long r14 = java.lang.System.currentTimeMillis()
            long r14 = r14 - r12
            r16 = -1
            int r2 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r2 == 0) goto Lea
            long r12 = r23.r()
            int r2 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r2 >= 0) goto Lea
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "--==-- 预缓存补充请求无需发起，时间间隔不够，interval："
            r0.<init>(r2)
            r0.append(r14)
            java.lang.String r2 = ", config interval: "
            r0.append(r2)
            long r2 = r23.r()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.xt(r11, r0)
            r1.j = r10
            r5.j(r10)
            r5.r()
            return
        Lea:
            java.util.List r2 = r5.kt()
            if (r2 == 0) goto Lfc
            int r8 = r2.size()
            if (r8 <= 0) goto Lfc
            java.lang.Object r0 = r2.get(r3)
            com.bytedance.msdk.xt.cw r0 = (com.bytedance.msdk.xt.cw) r0
        Lfc:
            r8 = r0
            int r0 = r6.f()
            double r2 = r1.j(r7, r0)
            if (r8 == 0) goto L133
            boolean r0 = r8.px()
            if (r0 != 0) goto L133
            double r12 = r8.t()
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 >= 0) goto L133
            com.bytedance.msdk.core.up.xt.r r9 = com.bytedance.msdk.core.up.xt.r.j()
            android.content.Context r10 = r5.getContext()
            com.bytedance.msdk.cw.cw.j.tl$1 r0 = new com.bytedance.msdk.cw.cw.j.tl$1
            r18 = r2
            r2 = r4
            r3 = r18
            r0.<init>(r1, r2, r3, r5)
            r3 = r2
            r4 = r6
            r2 = r7
            r5 = r8
            r6 = r0
            r7 = r1
            r0 = r9
            r1 = r10
            r0.j(r1, r2, r3, r4, r5, r6)
            return
        L133:
            r7 = r1
            java.lang.String r0 = "--==-- 预缓存补充请求无需发起，已经命中最优"
            com.bytedance.msdk.j.up.cw.xt(r11, r0)
            r7.j = r9
            r5.j(r9)
            r5.r()
            return
    }

    static /* synthetic */ void j(com.bytedance.msdk.cw.cw.j.tl r0, java.lang.String r1, boolean r2, int r3, java.util.List r4, int r5, double r6, com.bytedance.msdk.cw.m.j.xt r8) {
            r0.j(r1, r2, r3, r4, r5, r6, r8)
            return
    }

    private void j(java.lang.String r1, boolean r2, int r3, java.util.List<com.bytedance.msdk.xt.cw> r4, int r5, double r6, com.bytedance.msdk.cw.m.j.xt r8) {
            r0 = this;
            if (r2 != 0) goto L14
            r1 = 10003(0x2713, float:1.4017E-41)
            if (r3 != r1) goto Lb
            r1 = 9
            r0.j = r1
            goto L40
        Lb:
            r1 = 10086(0x2766, float:1.4133E-41)
            if (r3 != r1) goto L40
            r1 = 8
            r0.j = r1
            goto L40
        L14:
            r1 = 4
            if (r5 != r1) goto L3a
            if (r4 == 0) goto L27
            int r1 = r4.size()
            if (r1 <= 0) goto L27
            r1 = 0
            java.lang.Object r1 = r4.get(r1)
            com.bytedance.msdk.xt.cw r1 = (com.bytedance.msdk.xt.cw) r1
            goto L28
        L27:
            r1 = 0
        L28:
            if (r1 == 0) goto L36
            double r1 = r1.t()
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 < 0) goto L36
            r1 = 6
            r0.j = r1
            goto L40
        L36:
            r1 = 7
            r0.j = r1
            goto L40
        L3a:
            r1 = 3
            if (r5 != r1) goto L40
            r1 = 5
            r0.j = r1
        L40:
            int r1 = r0.j
            r8.j(r1)
            r8.j(r4)
            java.lang.String r1 = "TTMediationSDK"
            java.lang.String r2 = "--==-- 预缓存补充请求结束，对外给出回调"
            com.bytedance.msdk.j.up.cw.xt(r1, r2)
            r8.r()
            return
    }

    private boolean j(java.lang.String r4, com.bytedance.msdk.api.j.xt r5, com.bytedance.msdk.cw.m.j.xt r6) {
            r3 = this;
            com.bytedance.msdk.core.oq.xt r0 = r6.vl()
            if (r0 == 0) goto Lb
            java.lang.String r0 = r0.hh()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            com.bytedance.msdk.core.up.xt.r r1 = com.bytedance.msdk.core.up.xt.r.j()
            boolean r5 = r1.j(r4, r5, r0)
            java.lang.String r0 = "TTMediationSDK"
            if (r5 == 0) goto L7e
            com.bytedance.msdk.core.up.xt.r r5 = com.bytedance.msdk.core.up.xt.r.j()
            java.util.List r5 = r5.r(r4)
            if (r5 == 0) goto L7e
            int r1 = r5.size()
            if (r1 <= 0) goto L7e
            java.util.Iterator r5 = r5.iterator()
        L2c:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L46
            java.lang.Object r1 = r5.next()
            com.bytedance.msdk.core.up.xt.ae r1 = (com.bytedance.msdk.core.up.xt.ae) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.bytedance.msdk.xt.cw r1 = r1.j
            r2.add(r1)
            r6.j(r2)
            goto L2c
        L46:
            java.util.concurrent.CopyOnWriteArrayList r5 = r6.ae()
            int r5 = r5.size()
            if (r5 > 0) goto L64
            java.util.concurrent.CopyOnWriteArrayList r5 = r6.oq()
            int r5 = r5.size()
            if (r5 > 0) goto L64
            java.util.concurrent.CopyOnWriteArrayList r5 = r6.tl()
            int r5 = r5.size()
            if (r5 <= 0) goto L7e
        L64:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r4 = com.bytedance.msdk.j.up.up.j(r4)
            r5.append(r4)
            java.lang.String r4 = "--==-- hit cache!!! -----"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.bytedance.msdk.j.up.cw.xt(r0, r4)
            r4 = 1
            return r4
        L7e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r4 = com.bytedance.msdk.j.up.up.j(r4)
            r5.append(r4)
            java.lang.String r4 = "--==-- not hit cache!!! -----"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.bytedance.msdk.j.up.cw.xt(r0, r4)
            r4 = 0
            return r4
    }

    @Override // com.bytedance.msdk.cw.cw.j.j
    public void j(com.bytedance.msdk.cw.cw.j.j.InterfaceC0233j r6) {
            r5 = this;
            com.bytedance.msdk.cw.m.j.xt r0 = r6.j()
            com.bytedance.msdk.core.oq.xt r0 = r0.vl()
            java.lang.String r0 = r0.rn()
            com.bytedance.msdk.cw.m.j.xt r1 = r6.j()
            com.bytedance.msdk.api.j.xt r1 = r1.mi()
            com.bytedance.msdk.cw.m.j.xt r2 = r6.j()
            boolean r2 = r2.v()
            com.bytedance.msdk.core.up.xt.r r3 = com.bytedance.msdk.core.up.xt.r.j()
            int r4 = r1.up()
            boolean r3 = r3.cw(r0, r4)
            if (r3 == 0) goto L64
            com.bytedance.msdk.core.up.xt.r r3 = com.bytedance.msdk.core.up.xt.r.j()
            java.lang.Long r3 = r3.j(r0)
            r4 = 1
            if (r3 != 0) goto L37
            r3 = 1
            goto L38
        L37:
            r3 = 0
        L38:
            if (r2 != 0) goto L5d
            if (r3 != 0) goto L5d
            com.bytedance.msdk.cw.m.j.xt r2 = r6.j()
            boolean r2 = r5.j(r0, r1, r2)
            if (r2 == 0) goto L5d
            com.bytedance.msdk.cw.m.j.xt r2 = r6.j()
            r2.cw(r4)
            com.bytedance.msdk.cw.m.j.xt r2 = r6.j()
            com.bytedance.msdk.core.oq.xt r2 = r2.vl()
            com.bytedance.msdk.cw.m.j.xt r6 = r6.j()
            r5.j(r1, r0, r2, r6)
            return
        L5d:
            com.bytedance.msdk.core.up.xt.r r2 = com.bytedance.msdk.core.up.xt.r.j()
            r2.j(r0, r1)
        L64:
            com.bytedance.msdk.cw.m.j.xt r0 = r6.j()
            r6.j(r0)
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
