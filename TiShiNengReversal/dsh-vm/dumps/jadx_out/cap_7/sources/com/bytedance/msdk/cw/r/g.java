package com.bytedance.msdk.cw.r;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class g extends com.bytedance.msdk.cw.r.xt {
    private com.bytedance.msdk.cw.cw.j.j.j av;
    private boolean i;
    private com.bytedance.msdk.api.r.j.ae.r j;
    private com.bytedance.msdk.api.r.j.cw xt;



    public g(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.i = r1
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

    private void cw(com.bytedance.msdk.xt.cw r4) {
            r3 = this;
            com.bytedance.msdk.api.j.xt r0 = r3.m
            boolean r0 = r0.sm()
            if (r0 == 0) goto L9
            goto L37
        L9:
            if (r4 == 0) goto L37
            int r0 = r4.pz()
            r1 = 7
            if (r0 == r1) goto L37
            boolean r4 = r4 instanceof com.bytedance.msdk.api.r.j.xt.xt
            if (r4 != 0) goto L37
            com.bytedance.msdk.core.oq.xt r4 = r3.ae
            if (r4 == 0) goto L37
            boolean r4 = r4.vl()
            if (r4 != 0) goto L37
            com.bytedance.msdk.core.up.xt.r r4 = com.bytedance.msdk.core.up.xt.r.j()
            java.lang.ref.SoftReference<android.content.Context> r0 = r3.tl
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            java.lang.String r1 = r3.up
            com.bytedance.msdk.api.j.xt r2 = r3.m
            int r2 = r2.up()
            r4.xt(r0, r1, r2)
        L37:
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

    private java.util.List<com.bytedance.msdk.xt.cw> j(java.util.List<com.bytedance.msdk.xt.cw> r8, int r9) {
            r7 = this;
            if (r8 == 0) goto Lc8
            int r0 = r8.size()
            if (r0 > 0) goto La
            goto Lc8
        La:
            r7.cw(r8)
            r7.cw()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r8.iterator()
        L19:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lb7
            int r2 = r0.size()
            if (r2 >= r9) goto Lb7
            java.lang.Object r2 = r1.next()
            com.bytedance.msdk.xt.cw r2 = (com.bytedance.msdk.xt.cw) r2
            r0.add(r2)
            boolean r3 = com.bytedance.msdk.j.up.cw.xt()
            if (r3 == 0) goto Laa
            java.lang.String r3 = ""
            java.lang.String r4 = "TTMediationSDK"
            com.bytedance.msdk.j.up.cw.r(r4, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = r7.up
            java.lang.String r6 = "show"
            java.lang.String r5 = com.bytedance.msdk.j.up.up.j(r5, r6)
            r3.append(r5)
            java.lang.String r5 = "返回给开发者最终广告：slotId="
            r3.append(r5)
            java.lang.String r5 = r2.qa()
            r3.append(r5)
            java.lang.String r5 = ",slotType:"
            r3.append(r5)
            int r5 = r2.xw()
            r3.append(r5)
            java.lang.String r5 = ",cpm="
            r3.append(r5)
            double r5 = r2.t()
            r3.append(r5)
            java.lang.String r5 = ",广告类型："
            r3.append(r5)
            int r5 = r2.pz()
            java.lang.String r5 = com.bytedance.msdk.xt.j.j(r5)
            r3.append(r5)
            java.lang.String r5 = ",ImageMode="
            r3.append(r5)
            int r5 = r2.st()
            r3.append(r5)
            java.lang.String r5 = ",showSort="
            r3.append(r5)
            int r5 = r2.d()
            r3.append(r5)
            java.lang.String r5 = ",isExpressAd="
            r3.append(r5)
            boolean r5 = r2.aq()
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            com.bytedance.msdk.j.up.cw.r(r4, r3)
        Laa:
            com.bytedance.msdk.cw.r.g$2 r3 = new com.bytedance.msdk.cw.r.g$2
            r3.<init>(r7)
            r2.j(r3)
            r1.remove()
            goto L19
        Lb7:
            com.bytedance.msdk.cw.up.j r9 = com.bytedance.msdk.cw.up.j.j()
            com.bytedance.msdk.api.j.xt r1 = r7.m
            java.util.List r8 = com.bytedance.msdk.cw.up.j.j(r1, r0, r8)
            r9.j(r1, r8)
            r7.j(r0)
            return r0
        Lc8:
            r8 = 0
            return r8
    }

    static /* synthetic */ void j(com.bytedance.msdk.cw.r.g r0, com.bytedance.msdk.xt.cw r1) {
            r0.cw(r1)
            return
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

    static /* synthetic */ boolean j(com.bytedance.msdk.cw.r.g r0) {
            boolean r0 = r0.i
            return r0
    }

    static /* synthetic */ boolean j(com.bytedance.msdk.cw.r.g r0, boolean r1) {
            r0.i = r1
            return r1
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
            r10 = this;
            com.bytedance.msdk.api.r.j.ae.r r0 = r10.j
            if (r0 == 0) goto Lb6
            com.bytedance.msdk.cw.m.j.xt r0 = r10.cw
            java.util.List r0 = r0.kt()
            com.bytedance.msdk.api.j.xt r1 = r10.m
            int r1 = r1.a()
            java.util.List r1 = r10.j(r0, r1)
            if (r1 == 0) goto Lb6
            int r2 = r1.size()
            if (r2 <= 0) goto Lb6
            boolean r2 = com.bytedance.msdk.j.up.cw.xt()
            if (r2 == 0) goto L39
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "返回给外部开发者的广告数量：sumList.size="
            r2.<init>(r3)
            int r3 = r1.size()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "TTMediationSDK"
            com.bytedance.msdk.j.up.cw.r(r3, r2)
        L39:
            java.util.concurrent.CopyOnWriteArrayList r5 = new java.util.concurrent.CopyOnWriteArrayList
            r5.<init>(r0)
            java.util.Iterator r0 = r1.iterator()
        L42:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto La1
            java.lang.Object r2 = r0.next()
            com.bytedance.msdk.xt.cw r2 = (com.bytedance.msdk.xt.cw) r2
            if (r2 == 0) goto L42
            r3 = 1
            r2.up(r3)
            boolean r3 = r2.ll()
            if (r3 == 0) goto L7c
            com.bytedance.msdk.core.up.j.j r3 = com.bytedance.msdk.core.up.j.j.j()
            java.lang.String r4 = r10.up
            java.lang.String r6 = r2.qa()
            com.bytedance.msdk.api.j.xt r7 = r10.m
            int r7 = r7.up()
            boolean r3 = r3.r(r4, r6, r7)
            if (r3 == 0) goto L7c
            java.lang.String r3 = r10.up
            java.lang.String r4 = r2.qa()
            com.bytedance.msdk.cw.tl.up.j(r2, r3, r4)
            r10.j(r5, r2)
        L7c:
            com.bytedance.msdk.cw.m.j.xt r3 = r10.cw
            java.util.concurrent.CopyOnWriteArrayList r3 = r3.ae()
            r10.j(r3, r2)
            com.bytedance.msdk.cw.m.j.xt r3 = r10.cw
            java.util.concurrent.CopyOnWriteArrayList r3 = r3.tl()
            r10.j(r3, r2)
            com.bytedance.msdk.cw.m.j.xt r3 = r10.cw
            java.util.concurrent.CopyOnWriteArrayList r3 = r3.g()
            r10.j(r3, r2)
            com.bytedance.msdk.cw.m.j.xt r3 = r10.cw
            java.util.concurrent.CopyOnWriteArrayList r3 = r3.oq()
            r10.j(r3, r2)
            goto L42
        La1:
            com.bytedance.msdk.core.up.j.j r4 = com.bytedance.msdk.core.up.j.j.j()
            java.lang.String r6 = r10.up
            com.bytedance.msdk.api.j.xt r7 = r10.m
            int r8 = r7.up()
            r9 = 0
            r4.j(r5, r6, r7, r8, r9)
            com.bytedance.msdk.api.r.j.ae.r r0 = r10.j
            r0.j(r1)
        Lb6:
            return
    }

    @Override // com.bytedance.msdk.cw.r.xt
    public void j() {
            r1 = this;
            r0 = 0
            r1.j = r0
            return
    }

    public void j(com.bytedance.msdk.api.j.xt r1, @androidx.annotation.NonNull com.bytedance.msdk.api.r.j.ae.r r2) {
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

    public void j(com.bytedance.msdk.xt.cw r10, boolean r11) {
            r9 = this;
            if (r10 == 0) goto L47
            boolean r0 = r10.ll()
            if (r0 == 0) goto L47
            com.bytedance.msdk.core.up.j.j r0 = com.bytedance.msdk.core.up.j.j.j()
            java.lang.String r1 = r9.up
            java.lang.String r2 = r10.qa()
            com.bytedance.msdk.api.j.xt r3 = r9.m
            int r3 = r3.up()
            boolean r0 = r0.r(r1, r2, r3)
            if (r0 == 0) goto L47
            com.bytedance.msdk.core.up.j.j r1 = com.bytedance.msdk.core.up.j.j.j()
            java.lang.String r2 = r10.qa()
            com.bytedance.msdk.api.j.xt r3 = r9.m
            com.bytedance.msdk.cw.m.j.xt r10 = r9.cw
            java.util.Map r4 = r10.p()
            com.bytedance.msdk.cw.m.j.xt r10 = r9.cw
            com.bytedance.msdk.api.r.qv r6 = r10.h()
            com.bytedance.msdk.cw.m.j.xt r10 = r9.cw
            com.bytedance.msdk.core.oq.g r7 = r10.wq()
            java.lang.ref.SoftReference<android.content.Context> r10 = r9.tl
            java.lang.Object r10 = r10.get()
            r8 = r10
            android.content.Context r8 = (android.content.Context) r8
            r5 = r11
            r1.j(r2, r3, r4, r5, r6, r7, r8)
        L47:
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

    public void j(java.lang.String r3, com.bytedance.msdk.api.r.j.ae.r r4) {
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
            com.bytedance.msdk.api.r.j.ae.r r4 = r2.j
            boolean r4 = r4 instanceof com.bytedance.msdk.api.r.j.ae.ae
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
            com.bytedance.msdk.cw.r.g$1 r1 = new com.bytedance.msdk.cw.r.g$1
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
            com.bytedance.msdk.api.r.j.ae.r r0 = r2.j
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
