package com.bytedance.msdk.cw.r;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class up extends com.bytedance.msdk.cw.r.xt implements com.bytedance.msdk.core.up.xt.cw {
    private java.util.List<com.bytedance.msdk.core.oq.oq> av;
    private final int j;
    private com.bytedance.msdk.core.up.xt.r.cw xt;

    public up(android.content.Context r1, int r2) {
            r0 = this;
            r0.<init>(r1)
            r0.j = r2
            return
    }

    private com.bytedance.msdk.core.oq.xt j(com.bytedance.msdk.core.oq.xt r8, com.bytedance.msdk.xt.cw r9) {
            r7 = this;
            if (r8 == 0) goto L57
            if (r9 != 0) goto L5
            goto L57
        L5:
            double r0 = r9.t()
            java.lang.String r9 = "筛选预缓存 ecpm "
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.String r9 = r9.concat(r2)
            java.lang.String r2 = "TMe"
            com.bytedance.msdk.j.up.cw.xt(r2, r9)
            com.bytedance.msdk.core.oq.xt r8 = r8.av()
            java.util.concurrent.CopyOnWriteArrayList r9 = new java.util.concurrent.CopyOnWriteArrayList
            r9.<init>()
            java.util.List r2 = r8.ol()
            java.util.Iterator r2 = r2.iterator()
        L29:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L49
            java.lang.Object r3 = r2.next()
            com.bytedance.msdk.core.oq.oq r3 = (com.bytedance.msdk.core.oq.oq) r3
            if (r3 == 0) goto L29
            boolean r4 = r3.uf()
            if (r4 == 0) goto L29
            double r4 = r3.v()
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 <= 0) goto L29
            r9.add(r3)
            goto L29
        L49:
            boolean r0 = r8.qv()
            if (r0 == 0) goto L53
            r8.xt(r9)
            return r8
        L53:
            r8.j(r9)
            return r8
        L57:
            r8 = 0
            return r8
    }

    @Override // com.bytedance.msdk.cw.r.xt, com.bytedance.msdk.cw.xt.j.j
    public void ae() {
            r5 = this;
            super.ae()
            com.bytedance.msdk.core.up.xt.r$cw r0 = r5.xt
            if (r0 == 0) goto L1d
            com.bytedance.msdk.core.oq.xt r1 = r5.ae
            if (r1 == 0) goto L10
            java.lang.String r1 = r1.rn()
            goto L12
        L10:
            java.lang.String r1 = ""
        L12:
            com.bytedance.msdk.cw.m.j.xt r2 = r5.cw
            java.util.concurrent.CopyOnWriteArrayList r2 = r2.tl()
            r3 = 1
            r4 = 0
            r0.j(r1, r3, r4, r2)
        L1d:
            return
    }

    @Override // com.bytedance.msdk.cw.r.xt
    protected com.bytedance.msdk.cw.cw.j.ae g() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r5.j
            r2 = 3
            if (r1 != r2) goto L13
            com.bytedance.msdk.cw.cw.j.g r1 = new com.bytedance.msdk.cw.cw.j.g
            r1.<init>()
            r0.add(r1)
            goto L2d
        L13:
            r2 = 4
            if (r1 != r2) goto L25
            com.bytedance.msdk.cw.cw.j.oq r1 = new com.bytedance.msdk.cw.cw.j.oq
            com.bytedance.msdk.cw.m.j.xt r2 = r5.cw
            com.bytedance.msdk.core.oq.xt r3 = r5.ae
            java.util.List<com.bytedance.msdk.core.oq.oq> r4 = r5.av
            r1.<init>(r2, r3, r4)
            r0.add(r1)
            goto L2d
        L25:
            com.bytedance.msdk.cw.cw.j.xt r1 = new com.bytedance.msdk.cw.cw.j.xt
            r1.<init>()
            r0.add(r1)
        L2d:
            com.bytedance.msdk.cw.cw.j.ae r1 = new com.bytedance.msdk.cw.cw.j.ae
            r1.<init>(r0)
            com.bytedance.msdk.cw.m.j.xt r0 = r5.cw
            r1.j(r0)
            return r1
    }

    public void j(com.bytedance.msdk.api.j.xt r6, com.bytedance.msdk.xt.cw r7, com.bytedance.msdk.core.up.xt.r.cw r8) {
            r5 = this;
            r5.xt = r8
            r5.j(r6)
            com.bytedance.msdk.cw.m.j.xt r8 = r5.cw
            r0 = 1
            r8.j(r0)
            com.bytedance.msdk.cw.m.j.xt r8 = r5.cw
            r8.r(r0)
            com.bytedance.msdk.cw.m.j.xt r8 = r5.cw
            com.bytedance.msdk.api.j.xt r8 = r8.mi()
            java.lang.String r6 = r6.j()
            r8.j(r6)
            com.bytedance.msdk.core.oq.xt r6 = r5.ae
            com.bytedance.msdk.core.oq.xt r6 = r5.j(r6, r7)
            r5.ae = r6
            com.bytedance.msdk.cw.m.j.xt r7 = r5.cw
            r7.j(r6)
            com.bytedance.msdk.api.j.xt r6 = r5.m
            r6.m(r0)
            com.bytedance.msdk.api.j.xt r6 = r5.m
            com.bytedance.msdk.core.oq.xt r7 = r5.ae
            com.bytedance.msdk.core.oq.xt r6 = com.bytedance.msdk.core.cw.cw.j(r6, r7)
            if (r6 == 0) goto L40
            r5.ae = r6
            com.bytedance.msdk.cw.m.j.xt r7 = r5.cw
            r7.j(r6)
        L40:
            com.bytedance.msdk.core.oq.xt r6 = r5.ae
            r7 = 0
            java.lang.String r8 = "TTMediationSDK"
            r0 = 0
            if (r6 != 0) goto L57
            java.lang.String r6 = "--==-- 预缓存补充请求未发起，mRitConfig为null"
            com.bytedance.msdk.j.up.cw.j(r8, r6)
            com.bytedance.msdk.core.up.xt.r$cw r6 = r5.xt
            if (r6 == 0) goto L123
            java.lang.String r8 = r5.up
            r6.j(r8, r0, r0, r7)
            return
        L57:
            java.util.List r6 = r6.ol()
            if (r6 == 0) goto L115
            int r6 = r6.size()
            if (r6 > 0) goto L65
            goto L115
        L65:
            com.bytedance.msdk.core.oq.xt r6 = r5.ae
            long r1 = r6.c()
            double r1 = (double) r1
            com.bytedance.msdk.core.oq.xt r7 = r5.ae
            double r3 = r7.cw()
            double r1 = r1 * r3
            long r1 = (long) r1
            r6.m(r1)
            com.bytedance.msdk.core.oq.xt r6 = r5.ae
            long r1 = r6.ed()
            double r1 = (double) r1
            com.bytedance.msdk.core.oq.xt r7 = r5.ae
            double r3 = r7.xt()
            double r1 = r1 * r3
            long r1 = (long) r1
            r6.up(r1)
            com.bytedance.msdk.core.oq.xt r6 = r5.ae
            r6.xt(r0)
            com.bytedance.msdk.core.oq.xt r6 = r5.ae
            r6.j(r0)
            com.bytedance.msdk.core.oq.xt r6 = r5.ae
            java.util.List r6 = r6.ol()
            r5.av = r6
            java.util.Comparator<com.bytedance.msdk.core.oq.oq> r7 = r5.az
            com.bytedance.msdk.tl.la.j(r6, r7)
            boolean r6 = com.bytedance.msdk.j.up.cw.xt()
            if (r6 == 0) goto L111
            java.lang.String r6 = "--==-- 预缓存补充请求，过滤后的waterfall："
            com.bytedance.msdk.j.up.cw.j(r8, r6)
            java.util.List<com.bytedance.msdk.core.oq.oq> r6 = r5.av
            java.util.Iterator r6 = r6.iterator()
        Lb3:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L111
            java.lang.Object r7 = r6.next()
            com.bytedance.msdk.core.oq.oq r7 = (com.bytedance.msdk.core.oq.oq) r7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r5.up
            java.lang.String r1 = com.bytedance.msdk.j.up.up.j(r1)
            r0.append(r1)
            java.lang.String r1 = "waterfall: "
            r0.append(r1)
            java.lang.String r1 = r7.az()
            r0.append(r1)
            java.lang.String r1 = "adnSlotId: "
            r0.append(r1)
            java.lang.String r1 = r7.w()
            r0.append(r1)
            java.lang.String r1 = ", loadSort: "
            r0.append(r1)
            int r1 = r7.x()
            r0.append(r1)
            java.lang.String r1 = ", showSort: "
            r0.append(r1)
            int r1 = r7.ch()
            r0.append(r1)
            java.lang.String r1 = ", eCpm: "
            r0.append(r1)
            double r1 = r7.v()
            r0.append(r1)
            java.lang.String r7 = r0.toString()
            com.bytedance.msdk.j.up.cw.j(r8, r7)
            goto Lb3
        L111:
            r5.g()
            return
        L115:
            java.lang.String r6 = "--==-- 预缓存补充请求未发起，过滤后的waterfall为空"
            com.bytedance.msdk.j.up.cw.j(r8, r6)
            com.bytedance.msdk.core.up.xt.r$cw r6 = r5.xt
            if (r6 == 0) goto L123
            java.lang.String r8 = r5.up
            r6.j(r8, r0, r0, r7)
        L123:
            return
    }

    @Override // com.bytedance.msdk.cw.r.xt, com.bytedance.msdk.cw.xt.j.j
    public void xt(@androidx.annotation.NonNull com.bytedance.msdk.api.j r5) {
            r4 = this;
            super.xt(r5)
            com.bytedance.msdk.core.up.xt.r$cw r0 = r4.xt
            if (r0 == 0) goto L23
            r1 = 20005(0x4e25, float:2.8033E-41)
            if (r5 == 0) goto L13
            int r5 = r5.j
            r2 = 10003(0x2713, float:1.4017E-41)
            if (r5 != r2) goto L13
            r1 = 10003(0x2713, float:1.4017E-41)
        L13:
            com.bytedance.msdk.core.oq.xt r5 = r4.ae
            if (r5 == 0) goto L1c
            java.lang.String r5 = r5.rn()
            goto L1e
        L1c:
            java.lang.String r5 = ""
        L1e:
            r2 = 0
            r3 = 0
            r0.j(r5, r2, r1, r3)
        L23:
            return
    }
}
