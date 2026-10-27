package com.bytedance.msdk.cw.r;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class ae extends com.bytedance.msdk.cw.r.xt {
    private com.bytedance.msdk.cw.cw.j.j.j av;
    private com.bytedance.msdk.api.r.j.cw.xt j;
    private com.bytedance.msdk.api.r.j.cw xt;



    public ae(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private void cw() {
            r6 = this;
            java.util.List r0 = r6.xt()     // Catch: java.lang.Throwable -> L46
            if (r0 == 0) goto L58
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L46
            if (r1 <= 0) goto L58
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L46
        L10:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L46
            if (r1 == 0) goto L58
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L46
            com.bytedance.msdk.core.oq.oq r1 = (com.bytedance.msdk.core.oq.oq) r1     // Catch: java.lang.Throwable -> L46
            if (r1 == 0) goto L10
            java.lang.String r2 = r1.w()     // Catch: java.lang.Throwable -> L46
            com.bytedance.msdk.core.up.j.j r3 = com.bytedance.msdk.core.up.j.j.j()     // Catch: java.lang.Throwable -> L46
            java.lang.String r4 = r6.up     // Catch: java.lang.Throwable -> L46
            com.bytedance.msdk.api.j.xt r5 = r6.m     // Catch: java.lang.Throwable -> L46
            int r5 = r5.up()     // Catch: java.lang.Throwable -> L46
            boolean r3 = r3.r(r4, r2, r5)     // Catch: java.lang.Throwable -> L46
            if (r3 == 0) goto L10
            int r3 = r1.mi()     // Catch: java.lang.Throwable -> L46
            r4 = 100
            if (r3 != r4) goto L48
            com.bytedance.msdk.cw.m.j.xt r1 = r6.cw     // Catch: java.lang.Throwable -> L46
            java.util.concurrent.CopyOnWriteArrayList r1 = r1.ae()     // Catch: java.lang.Throwable -> L46
            r6.j(r2, r1)     // Catch: java.lang.Throwable -> L46
            goto L10
        L46:
            r0 = move-exception
            goto L59
        L48:
            int r1 = r1.mi()     // Catch: java.lang.Throwable -> L46
            if (r1 != 0) goto L10
            com.bytedance.msdk.cw.m.j.xt r1 = r6.cw     // Catch: java.lang.Throwable -> L46
            java.util.concurrent.CopyOnWriteArrayList r1 = r1.tl()     // Catch: java.lang.Throwable -> L46
            r6.j(r2, r1)     // Catch: java.lang.Throwable -> L46
            goto L10
        L58:
            return
        L59:
            com.bytedance.sdk.component.utils.vl.j(r0)
            return
    }

    private void cw(java.util.List<com.bytedance.msdk.xt.cw> r4) {
            r3 = this;
            if (r4 == 0) goto L3b
            int r0 = r4.size()
            if (r0 <= 0) goto L3b
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r4.size()
            r0.<init>(r1)
            r0.addAll(r4)
            r4.clear()
            java.util.Iterator r0 = r0.iterator()
        L1b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r0.next()
            com.bytedance.msdk.xt.cw r1 = (com.bytedance.msdk.xt.cw) r1
            if (r1 == 0) goto L1b
            boolean r2 = r1.qb()
            if (r2 != 0) goto L1b
            java.lang.String r2 = r3.up
            boolean r2 = r1.wq(r2)
            if (r2 == 0) goto L1b
            r4.add(r1)
            goto L1b
        L3b:
            return
    }

    private java.util.List<com.bytedance.msdk.xt.cw> j(java.util.List<com.bytedance.msdk.xt.cw> r7, int r8) {
            r6 = this;
            if (r7 == 0) goto Lbb
            int r0 = r7.size()
            if (r0 > 0) goto La
            goto Lbb
        La:
            r6.cw(r7)
            r6.cw()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L19:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto Lb7
            int r1 = r0.size()
            if (r1 >= r8) goto Lb7
            java.lang.Object r1 = r7.next()
            com.bytedance.msdk.xt.cw r1 = (com.bytedance.msdk.xt.cw) r1
            com.bytedance.msdk.cw.r.ae$2 r2 = new com.bytedance.msdk.cw.r.ae$2
            r2.<init>(r6, r0)
            r1.j(r2)
            r0.add(r1)
            boolean r2 = com.bytedance.msdk.j.up.cw.xt()
            if (r2 == 0) goto Lb2
            java.lang.String r2 = ""
            java.lang.String r3 = "TTMediationSDK"
            com.bytedance.msdk.j.up.cw.r(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = r6.up
            java.lang.String r5 = "show"
            java.lang.String r4 = com.bytedance.msdk.j.up.up.j(r4, r5)
            r2.append(r4)
            java.lang.String r4 = "返回给开发者最终广告：slotId="
            r2.append(r4)
            java.lang.String r4 = r1.qa()
            r2.append(r4)
            java.lang.String r4 = ",slotType:"
            r2.append(r4)
            int r4 = r1.xw()
            r2.append(r4)
            java.lang.String r4 = ",cpm="
            r2.append(r4)
            double r4 = r1.t()
            r2.append(r4)
            java.lang.String r4 = ",广告类型："
            r2.append(r4)
            int r4 = r1.pz()
            java.lang.String r4 = com.bytedance.msdk.xt.j.j(r4)
            r2.append(r4)
            java.lang.String r4 = ",ImageMode="
            r2.append(r4)
            int r4 = r1.st()
            r2.append(r4)
            java.lang.String r4 = ",showSort="
            r2.append(r4)
            int r4 = r1.d()
            r2.append(r4)
            java.lang.String r4 = ",isExpressAd="
            r2.append(r4)
            boolean r1 = r1.aq()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.bytedance.msdk.j.up.cw.r(r3, r1)
        Lb2:
            r7.remove()
            goto L19
        Lb7:
            r6.j(r0)
            return r0
        Lbb:
            r7 = 0
            return r7
    }

    private void j(java.lang.String r4, java.util.List<com.bytedance.msdk.xt.cw> r5) {
            r3 = this;
            boolean r0 = r3.xt(r4, r5)
            if (r0 != 0) goto L5b
            com.bytedance.msdk.core.up.j.j r0 = com.bytedance.msdk.core.up.j.j.j()
            com.bytedance.msdk.api.j.xt r1 = r3.m
            r2 = 0
            int r0 = r0.j(r4, r1, r2)
            r1 = 3
            if (r0 != r1) goto L5b
            com.bytedance.msdk.core.up.j.j r0 = com.bytedance.msdk.core.up.j.j.j()
            com.bytedance.msdk.api.j.xt r1 = r3.m
            int r2 = r1.up()
            java.util.List r4 = r0.j(r4, r1, r2)
            if (r4 == 0) goto L5b
            int r0 = r4.size()
            if (r0 <= 0) goto L5b
            java.util.Iterator r4 = r4.iterator()
        L2e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L5b
            java.lang.Object r0 = r4.next()
            com.bytedance.msdk.core.up.xt.ae r0 = (com.bytedance.msdk.core.up.xt.ae) r0
            if (r0 == 0) goto L2e
            com.bytedance.msdk.xt.cw r1 = r0.j
            if (r1 == 0) goto L2e
            boolean r1 = r1.qb()
            if (r1 != 0) goto L2e
            com.bytedance.msdk.xt.cw r1 = r0.j
            java.lang.String r2 = r3.up
            boolean r1 = r1.wq(r2)
            if (r1 == 0) goto L2e
            com.bytedance.msdk.xt.cw r1 = r0.j
            r5.add(r1)
            com.bytedance.msdk.xt.cw r0 = r0.j
            r3.xt(r0)
            goto L2e
        L5b:
            return
    }

    private void j(java.util.concurrent.CopyOnWriteArrayList<com.bytedance.msdk.xt.cw> r3, com.bytedance.msdk.xt.cw r4) {
            r2 = this;
            java.util.Iterator r0 = r3.iterator()
        L4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            com.bytedance.msdk.xt.cw r1 = (com.bytedance.msdk.xt.cw) r1
            if (r1 != r4) goto L4
            if (r1 == 0) goto L4
            r3.remove(r1)
            goto L4
        L18:
            return
    }

    private boolean xt(java.lang.String r2, java.util.List<com.bytedance.msdk.xt.cw> r3) {
            r1 = this;
            if (r3 == 0) goto L26
            int r0 = r3.size()
            if (r0 <= 0) goto L26
            java.util.Iterator r3 = r3.iterator()
        Lc:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L26
            java.lang.Object r0 = r3.next()
            com.bytedance.msdk.xt.cw r0 = (com.bytedance.msdk.xt.cw) r0
            if (r0 == 0) goto Lc
            java.lang.String r0 = r0.qa()
            boolean r0 = android.text.TextUtils.equals(r2, r0)
            if (r0 == 0) goto Lc
            r2 = 1
            return r2
        L26:
            r2 = 0
            return r2
    }

    @Override // com.bytedance.msdk.cw.r.xt, com.bytedance.msdk.cw.xt.j.j
    public void ae() {
            r9 = this;
            com.bytedance.msdk.api.r.j.cw.xt r0 = r9.j
            if (r0 == 0) goto Lbc
            com.bytedance.msdk.cw.m.j.xt r0 = r9.cw
            java.util.List r0 = r0.kt()
            com.bytedance.msdk.api.j.xt r1 = r9.m
            int r1 = r1.a()
            java.util.List r0 = r9.j(r0, r1)
            if (r0 == 0) goto Lbc
            int r1 = r0.size()
            if (r1 <= 0) goto Lbc
            boolean r1 = com.bytedance.msdk.j.up.cw.xt()
            if (r1 == 0) goto L39
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "返回给外部开发者的广告数量：sumList.size="
            r1.<init>(r2)
            int r2 = r0.size()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "TTMediationSDK"
            com.bytedance.msdk.j.up.cw.r(r2, r1)
        L39:
            java.util.concurrent.CopyOnWriteArrayList r4 = new java.util.concurrent.CopyOnWriteArrayList
            com.bytedance.msdk.cw.m.j.xt r1 = r9.cw
            java.util.List r1 = r1.kt()
            r4.<init>(r1)
            java.util.Iterator r1 = r0.iterator()
        L48:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto La7
            java.lang.Object r2 = r1.next()
            com.bytedance.msdk.xt.cw r2 = (com.bytedance.msdk.xt.cw) r2
            if (r2 == 0) goto L48
            r3 = 1
            r2.up(r3)
            boolean r3 = r2.ll()
            if (r3 == 0) goto L82
            com.bytedance.msdk.core.up.j.j r3 = com.bytedance.msdk.core.up.j.j.j()
            java.lang.String r5 = r9.up
            java.lang.String r6 = r2.qa()
            com.bytedance.msdk.api.j.xt r7 = r9.m
            int r7 = r7.up()
            boolean r3 = r3.r(r5, r6, r7)
            if (r3 == 0) goto L82
            java.lang.String r3 = r9.up
            java.lang.String r5 = r2.qa()
            com.bytedance.msdk.cw.tl.up.j(r2, r3, r5)
            r9.j(r4, r2)
        L82:
            com.bytedance.msdk.cw.m.j.xt r3 = r9.cw
            java.util.concurrent.CopyOnWriteArrayList r3 = r3.ae()
            r9.j(r3, r2)
            com.bytedance.msdk.cw.m.j.xt r3 = r9.cw
            java.util.concurrent.CopyOnWriteArrayList r3 = r3.tl()
            r9.j(r3, r2)
            com.bytedance.msdk.cw.m.j.xt r3 = r9.cw
            java.util.concurrent.CopyOnWriteArrayList r3 = r3.g()
            r9.j(r3, r2)
            com.bytedance.msdk.cw.m.j.xt r3 = r9.cw
            java.util.concurrent.CopyOnWriteArrayList r3 = r3.oq()
            r9.j(r3, r2)
            goto L48
        La7:
            com.bytedance.msdk.core.up.j.j r3 = com.bytedance.msdk.core.up.j.j.j()
            java.lang.String r5 = r9.up
            com.bytedance.msdk.api.j.xt r6 = r9.m
            int r7 = r6.up()
            r8 = 0
            r3.j(r4, r5, r6, r7, r8)
            com.bytedance.msdk.api.r.j.cw.xt r1 = r9.j
            r1.j(r0)
        Lbc:
            return
    }

    @Override // com.bytedance.msdk.cw.r.xt
    public void j() {
            r1 = this;
            super.j()
            r0 = 0
            r1.j = r0
            return
    }

    public void j(com.bytedance.msdk.api.j.xt r1, @androidx.annotation.NonNull com.bytedance.msdk.api.r.j.cw.xt r2) {
            r0 = this;
            r0.j(r1)
            r0.j = r2
            r0.g()
            return
    }

    public void j(com.bytedance.msdk.api.j.xt r3, com.bytedance.msdk.api.r.j.cw r4) {
            r2 = this;
            r2.j(r3)
            r2.xt = r4
            com.bytedance.msdk.cw.m.j.xt r3 = r2.cw
            com.bytedance.msdk.core.oq.xt r3 = r3.vl()
            if (r3 == 0) goto L21
            com.bytedance.msdk.cw.m.j.xt r3 = r2.cw
            com.bytedance.msdk.core.oq.xt r3 = r3.vl()
            boolean r3 = r3.vl()
            if (r3 != 0) goto L1a
            goto L21
        L1a:
            com.bytedance.msdk.cw.cw.j.ae r3 = r2.g()
            r2.av = r3
            return
        L21:
            if (r4 == 0) goto L31
            com.bytedance.msdk.api.j r3 = new com.bytedance.msdk.api.j
            r0 = 10014(0x271e, float:1.4033E-41)
            java.lang.String r1 = com.bytedance.msdk.api.j.j(r0)
            r3.<init>(r0, r1)
            r4.j(r3)
        L31:
            return
    }

    public void j(com.bytedance.msdk.xt.cw r10, int r11) {
            r9 = this;
            if (r10 == 0) goto L4d
            boolean r0 = r10.ll()
            if (r0 == 0) goto L4d
            com.bytedance.msdk.core.up.j.j r0 = com.bytedance.msdk.core.up.j.j.j()
            java.lang.String r1 = r9.up
            java.lang.String r2 = r10.qa()
            com.bytedance.msdk.api.j.xt r3 = r9.m
            int r3 = r3.up()
            boolean r0 = r0.r(r1, r2, r3)
            if (r0 == 0) goto L4d
            com.bytedance.msdk.core.up.j.j r1 = com.bytedance.msdk.core.up.j.j.j()
            java.lang.String r2 = r10.qa()
            com.bytedance.msdk.api.j.xt r3 = r9.m
            com.bytedance.msdk.cw.m.j.xt r10 = r9.cw
            java.util.Map r4 = r10.p()
            if (r11 != 0) goto L33
            r10 = 1
            r5 = 1
            goto L35
        L33:
            r10 = 0
            r5 = 0
        L35:
            com.bytedance.msdk.cw.m.j.xt r10 = r9.cw
            com.bytedance.msdk.api.r.qv r6 = r10.h()
            com.bytedance.msdk.cw.m.j.xt r10 = r9.cw
            com.bytedance.msdk.core.oq.g r7 = r10.wq()
            java.lang.ref.SoftReference<android.content.Context> r10 = r9.tl
            java.lang.Object r10 = r10.get()
            r8 = r10
            android.content.Context r8 = (android.content.Context) r8
            r1.j(r2, r3, r4, r5, r6, r7, r8)
        L4d:
            return
    }

    @Override // com.bytedance.msdk.cw.r.xt, com.bytedance.msdk.cw.xt.j.j
    public void j(@androidx.annotation.Nullable java.lang.String r3) {
            r2 = this;
            int r0 = r2.qv
            if (r0 != 0) goto Le
            com.bytedance.msdk.api.r.j.cw r0 = r2.xt
            if (r0 == 0) goto Le
            r1 = 1
            r2.qv = r1
            r0.j(r3)
        Le:
            return
    }

    public void j(java.lang.String r3, com.bytedance.msdk.api.r.j.cw.xt r4) {
            r2 = this;
            int r0 = r2.qv
            r1 = 1
            if (r0 == r1) goto L16
            if (r4 == 0) goto L37
            com.bytedance.msdk.api.j r3 = new com.bytedance.msdk.api.j
            r0 = 10015(0x271f, float:1.4034E-41)
            java.lang.String r1 = com.bytedance.msdk.api.j.j(r0)
            r3.<init>(r0, r1)
            r4.j(r3)
            return
        L16:
            boolean r0 = r2.oq
            if (r0 == 0) goto L2c
            if (r4 == 0) goto L37
            com.bytedance.msdk.api.j r3 = new com.bytedance.msdk.api.j
            r0 = 40047(0x9c6f, float:5.6118E-41)
            java.lang.String r1 = com.bytedance.msdk.api.j.j(r0)
            r3.<init>(r0, r1)
            r4.j(r3)
            return
        L2c:
            r2.oq = r1
            r2.j = r4
            com.bytedance.msdk.cw.cw.j.j$j r4 = r2.av
            if (r4 == 0) goto L37
            r4.j(r3)
        L37:
            return
    }

    @Override // com.bytedance.msdk.cw.r.xt, com.bytedance.msdk.cw.xt.j.j
    public void j(@androidx.annotation.Nullable java.util.List<com.bytedance.msdk.xt.cw> r3, @androidx.annotation.Nullable com.bytedance.msdk.api.j r4) {
            r2 = this;
            super.j(r3, r4)
            com.bytedance.msdk.api.r.j.cw.xt r4 = r2.j
            boolean r4 = r4 instanceof com.bytedance.msdk.api.r.j.cw.up
            if (r4 == 0) goto L30
            boolean r4 = com.bytedance.msdk.tl.p.j(r3)
            if (r4 != 0) goto L30
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L18:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L30
            java.lang.Object r0 = r3.next()
            com.bytedance.msdk.xt.cw r0 = (com.bytedance.msdk.xt.cw) r0
            com.bytedance.msdk.cw.r.ae$1 r1 = new com.bytedance.msdk.cw.r.ae$1
            r1.<init>(r2)
            r0.j(r1)
            r4.add(r0)
            goto L18
        L30:
            return
    }

    @Override // com.bytedance.msdk.cw.r.xt, com.bytedance.msdk.cw.xt.j.j
    public void xt(@androidx.annotation.NonNull com.bytedance.msdk.api.j r3) {
            r2 = this;
            com.bytedance.msdk.api.r.j.cw.xt r0 = r2.j
            if (r0 == 0) goto L15
            r0.j(r3)
            int r0 = r2.qv
            if (r0 != 0) goto L15
            com.bytedance.msdk.api.r.j.cw r0 = r2.xt
            if (r0 == 0) goto L15
            r1 = 2
            r2.qv = r1
            r0.j(r3)
        L15:
            return
    }
}
