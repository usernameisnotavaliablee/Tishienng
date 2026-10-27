package com.bytedance.msdk.cw.r;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class jy extends com.bytedance.msdk.cw.r.xt implements com.bytedance.msdk.j.xt.up {
    private android.view.View av;
    private com.bytedance.msdk.api.r.j.g.cw i;
    private boolean j;
    private com.bytedance.msdk.api.r.j.g.r mi;
    private com.bytedance.msdk.api.r.j.g.xt w;
    private boolean xt;




    public jy(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.j = r1
            r0.xt = r1
            return
    }

    private void cw(com.bytedance.msdk.api.j r2) {
            r1 = this;
            com.bytedance.msdk.cw.r.jy$3 r0 = new com.bytedance.msdk.cw.r.jy$3
            r0.<init>(r1, r2)
            com.bytedance.msdk.j.up.m.cw(r0)
            return
    }

    static /* synthetic */ com.bytedance.msdk.api.r.j.g.xt j(com.bytedance.msdk.cw.r.jy r0) {
            com.bytedance.msdk.api.r.j.g.xt r0 = r0.w
            return r0
    }

    static /* synthetic */ void j(com.bytedance.msdk.cw.r.jy r0, android.view.ViewGroup r1) {
            r0.xt(r1)
            return
    }

    private void j(com.bytedance.msdk.xt.cw r9, android.view.ViewGroup r10) {
            r8 = this;
            r8.r = r9
            boolean r0 = r8.xt
            if (r0 == 0) goto L9
            r9.sf()
        L9:
            com.bytedance.msdk.api.r.j.xt r9 = r8.jy
            if (r9 == 0) goto L12
            com.bytedance.msdk.xt.cw r0 = r8.r
            r0.j(r9)
        L12:
            com.bytedance.sdk.openadsdk.i.cw.j.xt r9 = r8.ws
            if (r9 == 0) goto L1b
            com.bytedance.msdk.xt.cw r0 = r8.r
            r0.j(r9)
        L1b:
            com.bytedance.msdk.cw.m.j.xt r9 = r8.cw
            com.bytedance.msdk.xt.cw r0 = r8.r
            r9.j(r0)
            com.bytedance.msdk.xt.cw r9 = r8.r
            r0 = 1
            r9.up(r0)
            com.bytedance.msdk.xt.cw r9 = r8.r
            com.bytedance.msdk.j.xt.m r0 = r8.g
            r9.j(r0)
            com.bytedance.msdk.xt.cw r9 = r8.r
            boolean r9 = r9.ll()
            if (r9 == 0) goto L58
            com.bytedance.msdk.core.up.j.j r9 = com.bytedance.msdk.core.up.j.j.j()
            java.lang.String r0 = r8.up
            com.bytedance.msdk.xt.cw r1 = r8.r
            java.lang.String r1 = r1.qa()
            int r2 = r8.mi()
            boolean r9 = r9.r(r0, r1, r2)
            if (r9 == 0) goto L58
            com.bytedance.msdk.xt.cw r9 = r8.r
            java.lang.String r0 = r8.up
            java.lang.String r1 = r9.qa()
            com.bytedance.msdk.cw.tl.up.j(r9, r0, r1)
        L58:
            com.bytedance.msdk.core.up.j.j r2 = com.bytedance.msdk.core.up.j.j.j()
            com.bytedance.msdk.cw.m.j.xt r9 = r8.cw
            java.util.List r3 = r9.kt()
            java.lang.String r4 = r8.up
            com.bytedance.msdk.api.j.xt r5 = r8.m
            int r6 = r8.mi()
            com.bytedance.msdk.xt.cw r7 = r8.r
            r2.j(r3, r4, r5, r6, r7)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = r8.up
            java.lang.String r1 = "show"
            java.lang.String r0 = com.bytedance.msdk.j.up.up.j(r0, r1)
            r9.append(r0)
            java.lang.String r0 = "展示的广告类型："
            r9.append(r0)
            com.bytedance.msdk.xt.cw r0 = r8.r
            int r0 = r0.pz()
            java.lang.String r0 = com.bytedance.msdk.xt.j.j(r0)
            r9.append(r0)
            java.lang.String r0 = ",slotId："
            r9.append(r0)
            com.bytedance.msdk.xt.cw r0 = r8.r
            java.lang.String r0 = r0.qa()
            r9.append(r0)
            java.lang.String r0 = ",slotType:"
            r9.append(r0)
            com.bytedance.msdk.xt.cw r0 = r8.r
            int r0 = r0.xw()
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            java.lang.String r0 = "TTMediationSDK"
            com.bytedance.msdk.j.up.cw.j(r0, r9)
            com.bytedance.msdk.core.tl.jy r9 = com.bytedance.msdk.core.tl.jy.j()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r8.up
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.xt(r0)
            com.bytedance.msdk.core.tl.vl r9 = com.bytedance.msdk.core.tl.vl.j()
            java.lang.String r0 = r8.up
            com.bytedance.msdk.xt.cw r1 = r8.r
            java.lang.String r1 = r1.qa()
            r9.xt(r0, r1)
            com.bytedance.msdk.xt.cw r9 = r8.r
            r9.j(r10)
            return
    }

    private void xt(android.view.ViewGroup r11) {
            r10 = this;
            com.bytedance.msdk.api.j.xt r0 = r10.m
            com.bytedance.msdk.up.m.j(r0)
            boolean r0 = r10.vl
            r1 = 0
            r2 = 40052(0x9c74, float:5.6125E-41)
            r3 = 0
            if (r0 == 0) goto L20
            com.bytedance.msdk.api.j.xt r11 = r10.m
            com.bytedance.msdk.up.m.j(r1, r11, r3)
            com.bytedance.msdk.api.j r11 = new com.bytedance.msdk.api.j
            java.lang.String r0 = com.bytedance.msdk.api.j.j(r2)
            r11.<init>(r2, r0)
            r10.cw(r11)
            return
        L20:
            java.lang.String r0 = r10.up
            int r0 = com.bytedance.msdk.cw.r.xt.xt(r0)
            if (r0 == 0) goto L3a
            com.bytedance.msdk.api.j.xt r11 = r10.m
            com.bytedance.msdk.up.m.j(r1, r11, r0)
            com.bytedance.msdk.api.j r11 = new com.bytedance.msdk.api.j
            java.lang.String r1 = com.bytedance.msdk.api.j.j(r0)
            r11.<init>(r0, r1)
            r10.cw(r11)
            return
        L3a:
            com.bytedance.msdk.cw.m.j.xt r0 = r10.cw
            java.util.List r0 = r0.kt()
            if (r11 == 0) goto L186
            java.util.List r1 = r10.xt()     // Catch: java.lang.Throwable -> L47
            goto L4b
        L47:
            r4 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r4)
        L4b:
            r4 = 1
            if (r1 == 0) goto L127
            int r5 = r1.size()
            if (r5 <= 0) goto L127
            java.util.HashMap r5 = r10.xt(r0)
            java.util.Iterator r1 = r1.iterator()
        L5c:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L127
            java.lang.Object r6 = r1.next()
            com.bytedance.msdk.core.oq.oq r6 = (com.bytedance.msdk.core.oq.oq) r6
            if (r6 == 0) goto L5c
            java.lang.String r7 = r6.w()
            java.lang.Object r8 = r5.get(r7)
            com.bytedance.msdk.xt.cw r8 = (com.bytedance.msdk.xt.cw) r8
            if (r8 == 0) goto L8b
            java.lang.String r9 = r10.up
            boolean r9 = r8.wq(r9)
            if (r9 == 0) goto L8b
            boolean r9 = r8.qb()
            if (r9 != 0) goto L8b
            r10.j(r8, r11)
        L87:
            r1 = 1
            r5 = 1
            goto L129
        L8b:
            boolean r6 = r6.kt()
            if (r6 == 0) goto L5c
            com.bytedance.msdk.core.up.j.j r6 = com.bytedance.msdk.core.up.j.j.j()
            java.lang.String r8 = r10.up
            int r9 = r10.mi()
            boolean r6 = r6.r(r8, r7, r9)
            if (r6 == 0) goto L5c
            com.bytedance.msdk.core.up.j.j r6 = com.bytedance.msdk.core.up.j.j.j()
            com.bytedance.msdk.api.j.xt r8 = r10.m
            int r6 = r6.j(r7, r8, r3)
            r8 = 3
            if (r6 != r8) goto L5c
            com.bytedance.msdk.core.up.j.j r6 = com.bytedance.msdk.core.up.j.j.j()
            com.bytedance.msdk.api.j.xt r8 = r10.m
            int r9 = r10.mi()
            java.util.List r6 = r6.j(r7, r8, r9)
            if (r6 == 0) goto L5c
            int r7 = r6.size()
            if (r7 <= 0) goto L5c
            java.lang.Object r6 = r6.get(r3)
            com.bytedance.msdk.core.up.xt.ae r6 = (com.bytedance.msdk.core.up.xt.ae) r6
            com.bytedance.msdk.xt.cw r6 = r6.j
            if (r6 == 0) goto L5c
            java.lang.String r7 = r10.up
            boolean r7 = r6.wq(r7)
            if (r7 == 0) goto L5c
            boolean r7 = r6.qb()
            if (r7 != 0) goto L5c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = r10.up
            java.lang.String r7 = "show"
            java.lang.String r5 = com.bytedance.msdk.j.up.up.j(r5, r7)
            r1.append(r5)
            java.lang.String r5 = "adSlotId："
            r1.append(r5)
            java.lang.String r5 = r6.qa()
            r1.append(r5)
            java.lang.String r5 = "，广告类型："
            r1.append(r5)
            int r5 = r6.pz()
            java.lang.String r5 = com.bytedance.msdk.xt.j.j(r5)
            r1.append(r5)
            java.lang.String r5 = ",isReady()："
            r1.append(r5)
            java.lang.String r5 = r10.up
            boolean r5 = r6.wq(r5)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r5 = "TTMediationSDK"
            com.bytedance.msdk.j.up.cw.j(r5, r1)
            r10.xt(r6)
            r10.j(r6, r11)
            goto L87
        L127:
            r1 = 0
            r5 = 0
        L129:
            if (r1 != 0) goto L157
            if (r0 == 0) goto L157
            int r1 = r0.size()
            if (r1 <= 0) goto L157
            java.util.Iterator r1 = r0.iterator()
        L137:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L157
            java.lang.Object r6 = r1.next()
            com.bytedance.msdk.xt.cw r6 = (com.bytedance.msdk.xt.cw) r6
            if (r6 == 0) goto L137
            java.lang.String r7 = r10.up
            boolean r7 = r6.wq(r7)
            if (r7 == 0) goto L137
            boolean r7 = r6.qb()
            if (r7 != 0) goto L137
            r10.j(r6, r11)
            r5 = 1
        L157:
            if (r5 == 0) goto L174
            r10.vl = r4
            com.bytedance.msdk.xt.cw r11 = r10.r
            if (r11 == 0) goto L16c
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            com.bytedance.msdk.xt.cw r0 = r10.r
            r11.add(r0)
            r10.j(r11)
        L16c:
            com.bytedance.msdk.xt.cw r11 = r10.r
            com.bytedance.msdk.api.j.xt r0 = r10.m
            com.bytedance.msdk.up.m.j(r11, r0, r3, r3)
            return
        L174:
            com.bytedance.msdk.api.j.xt r11 = r10.m
            com.bytedance.msdk.up.m.j(r0, r11, r3)
            com.bytedance.msdk.api.j r11 = new com.bytedance.msdk.api.j
            java.lang.String r0 = com.bytedance.msdk.api.j.j(r2)
            r11.<init>(r2, r0)
            r10.cw(r11)
            return
        L186:
            com.bytedance.msdk.api.j.xt r11 = r10.m
            com.bytedance.msdk.up.m.j(r0, r11, r3)
            com.bytedance.msdk.api.j r11 = new com.bytedance.msdk.api.j
            java.lang.String r0 = com.bytedance.msdk.api.j.j(r2)
            r11.<init>(r2, r0)
            r10.cw(r11)
            return
    }

    @Override // com.bytedance.msdk.cw.r.xt, com.bytedance.msdk.cw.xt.j.j
    public void ae() {
            r1 = this;
            com.bytedance.msdk.api.r.j.g.cw r0 = r1.i
            if (r0 == 0) goto L7
            r0.j()
        L7:
            return
    }

    @Override // com.bytedance.msdk.j.xt.up
    public void cw() {
            r1 = this;
            com.bytedance.msdk.api.r.j.g.r r0 = r1.mi
            if (r0 == 0) goto L7
            r0.cw()
        L7:
            return
    }

    public android.view.View f() {
            r3 = this;
            java.lang.ref.SoftReference<android.content.Context> r0 = r3.tl
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            android.view.View r1 = r3.av
            if (r1 != 0) goto L2a
            if (r0 == 0) goto L2a
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            r1.<init>(r0)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r2 = -1
            r0.<init>(r2, r2)
            r1.setLayoutParams(r0)
            r3.xt(r1)
            r3.av = r1
            com.bytedance.msdk.xt.cw r0 = r3.r
            r3.j(r0)
        L2a:
            android.view.View r0 = r3.av
            return r0
    }

    @Override // com.bytedance.msdk.j.xt.up
    public android.app.Activity getActivity() {
            r1 = this;
            com.bytedance.msdk.api.r.j.g.r r0 = r1.mi
            if (r0 == 0) goto L9
            android.app.Activity r0 = r0.getActivity()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.msdk.cw.r.xt
    public void j() {
            r7 = this;
            com.bytedance.msdk.xt.cw r0 = r7.r
            if (r0 != 0) goto L1b
            com.bytedance.msdk.core.up.j.j r1 = com.bytedance.msdk.core.up.j.j.j()
            com.bytedance.msdk.cw.m.j.xt r0 = r7.cw
            java.util.List r2 = r0.kt()
            java.lang.String r3 = r7.up
            com.bytedance.msdk.api.j.xt r4 = r7.m
            int r5 = r4.up()
            com.bytedance.msdk.xt.cw r6 = r7.r
            r1.j(r2, r3, r4, r5, r6)
        L1b:
            super.j()
            return
    }

    public void j(int r4) {
            r3 = this;
            com.bytedance.msdk.api.r.j.g.xt r4 = r3.w
            if (r4 == 0) goto L8
            r0 = 1
            r4.j(r0)
        L8:
            com.bytedance.msdk.core.up.xt.r r4 = com.bytedance.msdk.core.up.xt.r.j()
            java.lang.ref.SoftReference<android.content.Context> r0 = r3.tl
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            java.lang.String r1 = r3.up
            int r2 = r3.mi()
            r4.j(r0, r1, r2)
            return
    }

    public void j(android.view.ViewGroup r5) {
            r4 = this;
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            com.bytedance.msdk.core.ws.cw r1 = com.bytedance.msdk.core.xt.xt()
            boolean r1 = r1.la()
            if (r1 == 0) goto L14
            r2 = 0
            java.lang.String r3 = com.bytedance.msdk.tl.mi.j()
            r0[r2] = r3
        L14:
            com.bytedance.msdk.cw.r.jy$2 r2 = new com.bytedance.msdk.cw.r.jy$2
            r2.<init>(r4, r5, r1, r0)
            com.bytedance.msdk.j.up.m.cw(r2)
            return
    }

    public void j(android.view.ViewGroup r2, android.app.Activity r3) {
            r1 = this;
            com.bytedance.msdk.xt.cw r0 = r1.r
            if (r0 == 0) goto L7
            r0.j(r2, r3)
        L7:
            return
    }

    public void j(com.bytedance.msdk.api.j.xt r2, com.bytedance.msdk.api.r.qv r3, com.bytedance.msdk.api.r.j.g.cw r4) {
            r1 = this;
            r1.j(r2)
            com.bytedance.msdk.cw.m.j.xt r0 = r1.cw
            r0.j(r3)
            r1.i = r4
            r1.g = r1
            com.bytedance.msdk.cw.m.j.xt r3 = r1.cw
            java.util.Map r3 = r3.p()
            int r2 = r2.i()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r4 = "ad_load_timeout"
            r3.put(r4, r2)
            com.bytedance.msdk.core.ws.cw r2 = com.bytedance.msdk.core.xt.xt()
            boolean r2 = r2.l()
            if (r2 == 0) goto L32
            com.bytedance.msdk.cw.r.jy$1 r2 = new com.bytedance.msdk.cw.r.jy$1
            r2.<init>(r1)
            com.bytedance.msdk.api.r.oq.j(r2)
            return
        L32:
            r1.g()
            return
    }

    public void j(@androidx.annotation.NonNull com.bytedance.msdk.api.j r14) {
            r13 = this;
            long r0 = java.lang.System.currentTimeMillis()
            com.bytedance.msdk.xt.cw r2 = r13.r
            boolean r2 = com.bytedance.msdk.tl.mi.j(r2)
            if (r2 == 0) goto L18
            java.lang.String r2 = com.bytedance.msdk.tl.mi.xt()
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r0
        L15:
            r10 = r2
            r11 = r3
            goto L1c
        L18:
            r2 = 0
            r3 = -1
            goto L15
        L1c:
            com.bytedance.msdk.xt.cw r5 = r13.r
            com.bytedance.msdk.api.j.xt r6 = r13.m
            r8 = 1
            r9 = 0
            r7 = r14
            com.bytedance.msdk.up.m.j(r5, r6, r7, r8, r9, r10, r11)
            r13.cw(r7)
            return
    }

    public void j(com.bytedance.msdk.api.r.j.g.r r1) {
            r0 = this;
            r0.mi = r1
            return
    }

    public void j(com.bytedance.msdk.api.r.j.g.xt r1) {
            r0 = this;
            r0.w = r1
            return
    }

    @Override // com.bytedance.msdk.j.xt.up
    public void k_() {
            r1 = this;
            com.bytedance.msdk.api.r.j.g.r r0 = r1.mi
            if (r0 == 0) goto L7
            r0.j()
        L7:
            return
    }

    @Override // com.bytedance.msdk.j.xt.up
    public void l_() {
            r1 = this;
            com.bytedance.msdk.api.r.j.g.r r0 = r1.mi
            if (r0 == 0) goto L7
            r0.xt()
        L7:
            return
    }

    public android.view.View m() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void r() {
            r12 = this;
            com.bytedance.msdk.api.r.j.g.xt r0 = r12.w
            if (r0 == 0) goto L7
            r0.r()
        L7:
            long r0 = java.lang.System.currentTimeMillis()
            com.bytedance.msdk.xt.cw r2 = r12.r
            boolean r2 = com.bytedance.msdk.tl.mi.j(r2)
            if (r2 == 0) goto L1f
            java.lang.String r2 = com.bytedance.msdk.tl.mi.xt()
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r0
        L1c:
            r8 = r2
            r9 = r3
            goto L23
        L1f:
            r2 = 0
            r3 = -1
            goto L1c
        L23:
            com.bytedance.msdk.api.j.xt r0 = r12.m
            java.lang.String r0 = r0.v()
            com.bytedance.msdk.core.xt.j.up(r0)
            com.bytedance.msdk.xt.cw r5 = r12.r
            com.bytedance.msdk.api.j.xt r6 = r12.m
            r7 = 0
            boolean r11 = r5.gq()
            com.bytedance.msdk.up.m.xt(r5, r6, r7, r8, r9, r11)
            return
    }

    public boolean tj() {
            r9 = this;
            java.util.List r0 = r9.xt()     // Catch: java.lang.Throwable -> L6
        L4:
            r8 = r0
            goto Lc
        L6:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
            r0 = 0
            goto L4
        Lc:
            com.bytedance.msdk.cw.m.j.xt r0 = r9.cw
            java.util.concurrent.CopyOnWriteArrayList r1 = r0.ae()
            com.bytedance.msdk.cw.m.j.xt r0 = r9.cw
            java.util.concurrent.CopyOnWriteArrayList r2 = r0.oq()
            com.bytedance.msdk.cw.m.j.xt r0 = r9.cw
            java.util.concurrent.CopyOnWriteArrayList r3 = r0.tl()
            com.bytedance.msdk.api.j.xt r4 = r9.m
            boolean r5 = r9.vl
            java.lang.String r6 = r9.up
            com.bytedance.msdk.api.j.xt r0 = r9.m
            int r7 = r0.up()
            boolean r0 = com.bytedance.msdk.tl.ws.j(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    public void up() {
            r12 = this;
            com.bytedance.msdk.api.r.j.g.xt r0 = r12.w
            if (r0 == 0) goto L7
            r0.up()
        L7:
            com.bytedance.msdk.core.tl.jy r0 = com.bytedance.msdk.core.tl.jy.j()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r12.up
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.ae(r1)
            com.bytedance.msdk.xt.cw r0 = r12.r
            if (r0 == 0) goto L68
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r12.up
            java.lang.String r2 = "show_listen"
            java.lang.String r1 = com.bytedance.msdk.j.up.up.j(r1, r2)
            r0.append(r1)
            java.lang.String r1 = "adSlotId："
            r0.append(r1)
            com.bytedance.msdk.xt.cw r1 = r12.r
            java.lang.String r1 = r1.qa()
            r0.append(r1)
            java.lang.String r1 = "，广告类型："
            r0.append(r1)
            com.bytedance.msdk.xt.cw r1 = r12.r
            int r1 = r1.pz()
            java.lang.String r1 = com.bytedance.msdk.xt.j.j(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TTMediationSDK"
            com.bytedance.msdk.j.up.cw.j(r1, r0)
            com.bytedance.msdk.core.tl.qv r0 = com.bytedance.msdk.core.tl.qv.j()
            java.lang.String r1 = r12.up
            com.bytedance.msdk.xt.cw r2 = r12.r
            java.lang.String r2 = r2.qa()
            r0.xt(r1, r2)
        L68:
            com.bytedance.msdk.xt.cw r0 = r12.r
            if (r0 == 0) goto L7b
            java.lang.String r0 = r0.zz()
            java.lang.String r1 = r12.up
            com.bytedance.msdk.xt.cw r2 = r12.r
            java.lang.String r2 = r2.qa()
            com.bytedance.msdk.core.cw.cw.j(r0, r1, r2)
        L7b:
            r12.v()
            long r0 = java.lang.System.currentTimeMillis()
            com.bytedance.msdk.xt.cw r2 = r12.r
            boolean r2 = com.bytedance.msdk.tl.mi.j(r2)
            if (r2 == 0) goto L96
            java.lang.String r2 = com.bytedance.msdk.tl.mi.xt()
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r0
        L93:
            r8 = r2
            r9 = r3
            goto L9a
        L96:
            r2 = 0
            r3 = -1
            goto L93
        L9a:
            com.bytedance.msdk.xt.cw r5 = r12.r
            com.bytedance.msdk.api.j.xt r6 = r12.m
            r7 = 0
            r11 = 0
            com.bytedance.msdk.up.m.j(r5, r6, r7, r8, r9, r11)
            com.bytedance.msdk.api.j.xt r0 = r12.m
            java.lang.String r0 = r0.v()
            com.bytedance.msdk.core.xt.j.ae(r0)
            com.bytedance.msdk.api.j.xt r0 = r12.m
            java.lang.String r0 = r0.v()
            com.bytedance.msdk.core.xt.j.cw(r0)
            com.bytedance.msdk.api.j.xt r0 = r12.m
            java.lang.String r0 = r0.v()
            com.bytedance.msdk.xt.cw r1 = r12.r
            int r1 = r1.om()
            com.bytedance.msdk.xt.cw r2 = r12.r
            double r2 = r2.t()
            r4 = 1
            com.bytedance.msdk.core.g.r.j(r4, r0, r1, r2)
            java.lang.String r0 = r12.up
            com.bytedance.msdk.xt.cw r1 = r12.r
            com.bytedance.msdk.core.ae.cw.j(r0, r1)
            return
    }

    protected void v() {
            r9 = this;
            com.bytedance.msdk.xt.cw r0 = r9.r
            boolean r0 = r0.ll()
            if (r0 == 0) goto L49
            com.bytedance.msdk.core.up.j.j r0 = com.bytedance.msdk.core.up.j.j.j()
            java.lang.String r1 = r9.up
            com.bytedance.msdk.xt.cw r2 = r9.r
            java.lang.String r2 = r2.qa()
            int r3 = r9.mi()
            boolean r0 = r0.r(r1, r2, r3)
            if (r0 == 0) goto L49
            com.bytedance.msdk.core.up.j.j r1 = com.bytedance.msdk.core.up.j.j.j()
            com.bytedance.msdk.xt.cw r0 = r9.r
            java.lang.String r2 = r0.qa()
            com.bytedance.msdk.api.j.xt r3 = r9.m
            com.bytedance.msdk.cw.m.j.xt r0 = r9.cw
            java.util.Map r4 = r0.p()
            com.bytedance.msdk.cw.m.j.xt r0 = r9.cw
            com.bytedance.msdk.api.r.qv r6 = r0.h()
            com.bytedance.msdk.cw.m.j.xt r0 = r9.cw
            com.bytedance.msdk.core.oq.g r7 = r0.wq()
            java.lang.ref.SoftReference<android.content.Context> r0 = r9.tl
            java.lang.Object r0 = r0.get()
            r8 = r0
            android.content.Context r8 = (android.content.Context) r8
            r5 = 1
            r1.j(r2, r3, r4, r5, r6, r7, r8)
        L49:
            return
    }

    public void x() {
            r1 = this;
            r0 = 1
            r1.xt = r0
            return
    }

    public void xt(int r4) {
            r3 = this;
            com.bytedance.msdk.api.r.j.g.xt r0 = r3.w
            if (r0 == 0) goto L7
            r0.xt(r4)
        L7:
            com.bytedance.msdk.core.up.xt.r r4 = com.bytedance.msdk.core.up.xt.r.j()
            java.lang.ref.SoftReference<android.content.Context> r0 = r3.tl
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            java.lang.String r1 = r3.up
            int r2 = r3.mi()
            r4.j(r0, r1, r2)
            return
    }

    @Override // com.bytedance.msdk.cw.r.xt, com.bytedance.msdk.cw.xt.j.j
    public void xt(@androidx.annotation.NonNull com.bytedance.msdk.api.j r2) {
            r1 = this;
            com.bytedance.msdk.api.r.j.g.cw r0 = r1.i
            if (r0 == 0) goto L7
            r0.j(r2)
        L7:
            return
    }
}
