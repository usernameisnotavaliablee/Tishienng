package com.bytedance.msdk.cw.r;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public abstract class oq extends com.bytedance.msdk.cw.r.xt {
    protected boolean i;
    private java.lang.Object j;
    protected com.bytedance.msdk.j.xt.m mi;
    protected boolean w;



    public interface j {
        void j();
    }

    public oq(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.i = r1
            r0.w = r1
            r1 = 0
            r0.j = r1
            return
    }

    private boolean cw(com.bytedance.msdk.xt.cw r8, android.app.Activity r9, java.lang.Object r10, java.lang.String r11) {
            r7 = this;
            java.lang.String r0 = r7.up
            boolean r0 = r8.wq(r0)
            if (r0 == 0) goto Lad
            boolean r0 = r8.qb()
            if (r0 != 0) goto Lad
            boolean r0 = r7.tj()
            r1 = 1
            java.lang.String r2 = ",isReady()："
            java.lang.String r3 = "弱网情况下没有缓存好的广告,那么直接根据优先级展示，广告类型："
            java.lang.String r4 = "TTMediationSDK"
            if (r0 == 0) goto L73
            boolean r0 = r7.r(r8)
            if (r0 == 0) goto L6d
            java.lang.String r0 = r8.ff()
            int r5 = r8.om()
            int r6 = r8.rh()
            boolean r0 = com.bytedance.msdk.core.admanager.j.j(r0, r5, r6)
            if (r0 != 0) goto L6d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = r7.up
            java.lang.String r6 = r8.qa()
            java.lang.String r5 = com.bytedance.msdk.j.up.up.xt(r5, r6)
            r0.append(r5)
            r0.append(r3)
            int r3 = r8.pz()
            java.lang.String r3 = com.bytedance.msdk.xt.j.j(r3)
            r0.append(r3)
            r0.append(r2)
            java.lang.String r2 = r7.up
            boolean r2 = r8.wq(r2)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.j(r4, r0)
            r7.xt(r8)
            r7.j(r8, r9, r10, r11)
            return r1
        L6d:
            java.lang.String r8 = "--==--- cache 插全屏轮播中，不能轮播的自定义adn跳过"
            com.bytedance.msdk.j.up.cw.xt(r4, r8)
            goto Lad
        L73:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = r7.up
            java.lang.String r6 = r8.qa()
            java.lang.String r5 = com.bytedance.msdk.j.up.up.xt(r5, r6)
            r0.append(r5)
            r0.append(r3)
            int r3 = r8.pz()
            java.lang.String r3 = com.bytedance.msdk.xt.j.j(r3)
            r0.append(r3)
            r0.append(r2)
            java.lang.String r2 = r7.up
            boolean r2 = r8.wq(r2)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.j(r4, r0)
            r7.xt(r8)
            r7.j(r8, r9, r10, r11)
            return r1
        Lad:
            r8 = 0
            return r8
    }

    static /* synthetic */ java.lang.Object j(com.bytedance.msdk.cw.r.oq r0) {
            java.lang.Object r0 = r0.j
            return r0
    }

    private boolean j(java.util.List<com.bytedance.msdk.core.oq.oq> r9, java.util.List<com.bytedance.msdk.xt.cw> r10, boolean r11, android.app.Activity r12, java.lang.Object r13, java.lang.String r14) {
            r8 = this;
            java.util.HashMap r10 = r8.xt(r10)
            java.util.Iterator r0 = r9.iterator()
        L8:
            boolean r1 = r0.hasNext()
            r2 = 3
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L95
            java.lang.Object r1 = r0.next()
            com.bytedance.msdk.core.oq.oq r1 = (com.bytedance.msdk.core.oq.oq) r1
            if (r1 == 0) goto L8
            java.lang.String r5 = r1.w()
            java.lang.Object r6 = r10.get(r5)
            com.bytedance.msdk.xt.cw r6 = (com.bytedance.msdk.xt.cw) r6
            if (r6 == 0) goto L3b
            if (r11 == 0) goto L34
            boolean r7 = r6.fp()
            if (r7 == 0) goto L3b
            boolean r6 = r8.xt(r6, r12, r13, r14)
            if (r6 == 0) goto L3b
            return r4
        L34:
            boolean r6 = r8.xt(r6, r12, r13, r14)
            if (r6 == 0) goto L3b
            return r4
        L3b:
            boolean r1 = r1.kt()
            if (r1 == 0) goto L8
            com.bytedance.msdk.core.up.j.j r1 = com.bytedance.msdk.core.up.j.j.j()
            java.lang.String r6 = r8.up
            com.bytedance.msdk.api.j.xt r7 = r8.m
            int r7 = r7.up()
            boolean r1 = r1.r(r6, r5, r7)
            if (r1 == 0) goto L8
            com.bytedance.msdk.core.up.j.j r1 = com.bytedance.msdk.core.up.j.j.j()
            com.bytedance.msdk.api.j.xt r6 = r8.m
            int r1 = r1.j(r5, r6, r3)
            if (r1 != r2) goto L8
            com.bytedance.msdk.core.up.j.j r1 = com.bytedance.msdk.core.up.j.j.j()
            com.bytedance.msdk.api.j.xt r2 = r8.m
            int r6 = r2.up()
            java.util.List r1 = r1.j(r5, r2, r6)
            if (r1 == 0) goto L8
            int r2 = r1.size()
            if (r2 <= 0) goto L8
            java.lang.Object r1 = r1.get(r3)
            com.bytedance.msdk.core.up.xt.ae r1 = (com.bytedance.msdk.core.up.xt.ae) r1
            com.bytedance.msdk.xt.cw r1 = r1.j
            if (r1 == 0) goto L8
            if (r11 == 0) goto L8e
            boolean r2 = r1.fp()
            if (r2 == 0) goto L8
            boolean r1 = r8.cw(r1, r12, r13, r14)
            if (r1 == 0) goto L8
            return r4
        L8e:
            boolean r1 = r8.cw(r1, r12, r13, r14)
            if (r1 == 0) goto L8
            return r4
        L95:
            if (r11 == 0) goto L10b
            com.bytedance.msdk.xt.cw r11 = r8.r
            if (r11 != 0) goto L10b
            java.util.Iterator r9 = r9.iterator()
        L9f:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L10b
            java.lang.Object r11 = r9.next()
            com.bytedance.msdk.core.oq.oq r11 = (com.bytedance.msdk.core.oq.oq) r11
            if (r11 == 0) goto L9f
            java.lang.String r0 = r11.w()
            java.lang.Object r1 = r10.get(r0)
            com.bytedance.msdk.xt.cw r1 = (com.bytedance.msdk.xt.cw) r1
            if (r1 == 0) goto Lc0
            boolean r1 = r8.xt(r1, r12, r13, r14)
            if (r1 == 0) goto Lc0
            return r4
        Lc0:
            boolean r11 = r11.kt()
            if (r11 == 0) goto L9f
            com.bytedance.msdk.core.up.j.j r11 = com.bytedance.msdk.core.up.j.j.j()
            java.lang.String r1 = r8.up
            com.bytedance.msdk.api.j.xt r5 = r8.m
            int r5 = r5.up()
            boolean r11 = r11.r(r1, r0, r5)
            if (r11 == 0) goto L9f
            com.bytedance.msdk.core.up.j.j r11 = com.bytedance.msdk.core.up.j.j.j()
            com.bytedance.msdk.api.j.xt r1 = r8.m
            int r11 = r11.j(r0, r1, r3)
            if (r11 != r2) goto L9f
            com.bytedance.msdk.core.up.j.j r11 = com.bytedance.msdk.core.up.j.j.j()
            com.bytedance.msdk.api.j.xt r1 = r8.m
            int r5 = r1.up()
            java.util.List r11 = r11.j(r0, r1, r5)
            if (r11 == 0) goto L9f
            int r0 = r11.size()
            if (r0 <= 0) goto L9f
            java.lang.Object r11 = r11.get(r3)
            com.bytedance.msdk.core.up.xt.ae r11 = (com.bytedance.msdk.core.up.xt.ae) r11
            com.bytedance.msdk.xt.cw r11 = r11.j
            if (r11 == 0) goto L9f
            boolean r11 = r8.cw(r11, r12, r13, r14)
            if (r11 == 0) goto L9f
            return r4
        L10b:
            return r3
    }

    private boolean r(com.bytedance.msdk.xt.cw r3) {
            r2 = this;
            boolean r0 = r3.dj()
            r1 = 1
            if (r0 == 0) goto L10
            int r3 = r3.x()
            if (r3 != r1) goto Le
            goto L10
        Le:
            r3 = 0
            return r3
        L10:
            return r1
    }

    private boolean xt(com.bytedance.msdk.xt.cw r8, android.app.Activity r9, java.lang.Object r10, java.lang.String r11) {
            r7 = this;
            java.lang.String r0 = r7.up
            boolean r0 = r8.wq(r0)
            if (r0 == 0) goto La7
            boolean r0 = r8.qb()
            if (r0 != 0) goto La7
            boolean r0 = r7.tj()
            r1 = 1
            java.lang.String r2 = ",isReady()："
            java.lang.String r3 = "弱网情况下没有缓存好的广告,那么直接根据优先级展示，广告类型："
            java.lang.String r4 = "TTMediationSDK"
            if (r0 == 0) goto L70
            boolean r0 = r7.r(r8)
            if (r0 == 0) goto L6a
            java.lang.String r0 = r8.ff()
            int r5 = r8.om()
            int r6 = r8.rh()
            boolean r0 = com.bytedance.msdk.core.admanager.j.j(r0, r5, r6)
            if (r0 != 0) goto L6a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = r7.up
            java.lang.String r6 = r8.qa()
            java.lang.String r5 = com.bytedance.msdk.j.up.up.xt(r5, r6)
            r0.append(r5)
            r0.append(r3)
            int r3 = r8.pz()
            java.lang.String r3 = com.bytedance.msdk.xt.j.j(r3)
            r0.append(r3)
            r0.append(r2)
            java.lang.String r2 = r7.up
            boolean r2 = r8.wq(r2)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.j(r4, r0)
            r7.j(r8, r9, r10, r11)
            return r1
        L6a:
            java.lang.String r8 = "--==--- 插全屏轮播中，不能轮播的自定义adn跳过"
            com.bytedance.msdk.j.up.cw.xt(r4, r8)
            goto La7
        L70:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = r7.up
            java.lang.String r6 = r8.qa()
            java.lang.String r5 = com.bytedance.msdk.j.up.up.xt(r5, r6)
            r0.append(r5)
            r0.append(r3)
            int r3 = r8.pz()
            java.lang.String r3 = com.bytedance.msdk.xt.j.j(r3)
            r0.append(r3)
            r0.append(r2)
            java.lang.String r2 = r7.up
            boolean r2 = r8.wq(r2)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.j(r4, r0)
            r7.j(r8, r9, r10, r11)
            return r1
        La7:
            r8 = 0
            return r8
    }

    public boolean a() {
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

    public boolean ch() {
            r1 = this;
            boolean r0 = r1.i
            return r0
    }

    public void cw(com.bytedance.msdk.xt.cw r2) {
            r1 = this;
            com.bytedance.msdk.api.j.xt r0 = r1.m
            boolean r0 = r0.sm()
            if (r0 == 0) goto L9
            return
        L9:
            com.bytedance.msdk.cw.r.oq$1 r0 = new com.bytedance.msdk.cw.r.oq$1
            r0.<init>(r1, r2)
            com.bytedance.msdk.j.up.m.cw(r0)
            return
    }

    @Override // com.bytedance.msdk.cw.r.xt
    public void j() {
            r1 = this;
            super.j()
            r0 = 0
            r1.mi = r0
            return
    }

    public void j(android.app.Activity r11, java.lang.Object r12, java.lang.String r13, com.bytedance.msdk.cw.r.oq.j r14) {
            r10 = this;
            boolean r0 = r10.tj()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L1f
            com.bytedance.msdk.api.j.xt r0 = r10.m
            com.bytedance.msdk.up.m.j(r0)
            boolean r0 = r10.vl
            if (r0 == 0) goto L1f
            com.bytedance.msdk.api.j.xt r11 = r10.m
            com.bytedance.msdk.up.m.j(r2, r11, r1)
            if (r14 == 0) goto L1c
            r14.j()
            return
        L1c:
            r3 = r10
            goto Lb0
        L1f:
            java.lang.String r0 = r10.up
            int r0 = com.bytedance.msdk.cw.r.xt.xt(r0)
            if (r0 == 0) goto L32
            com.bytedance.msdk.api.j.xt r11 = r10.m
            com.bytedance.msdk.up.m.j(r2, r11, r0)
            if (r14 == 0) goto L1c
            r14.j()
            return
        L32:
            boolean r6 = r10.jy()
            com.bytedance.msdk.cw.m.j.xt r0 = r10.cw
            java.util.List r5 = r0.kt()
            java.util.List r2 = r10.xt()     // Catch: java.lang.Throwable -> L42
        L40:
            r4 = r2
            goto L47
        L42:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
            goto L40
        L47:
            if (r4 == 0) goto L5a
            int r0 = r4.size()
            if (r0 <= 0) goto L5a
            r3 = r10
            r7 = r11
            r8 = r12
            r9 = r13
            boolean r11 = r3.j(r4, r5, r6, r7, r8, r9)
            if (r11 == 0) goto L5e
            goto Lb0
        L5a:
            r3 = r10
            r7 = r11
            r8 = r12
            r9 = r13
        L5e:
            if (r5 == 0) goto La6
            int r11 = r5.size()
            if (r11 <= 0) goto La6
            java.util.Iterator r11 = r5.iterator()
        L6a:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L87
            java.lang.Object r12 = r11.next()
            com.bytedance.msdk.xt.cw r12 = (com.bytedance.msdk.xt.cw) r12
            if (r12 == 0) goto L6a
            if (r6 == 0) goto L80
            boolean r13 = r12.fp()
            if (r13 == 0) goto L6a
        L80:
            boolean r12 = r10.xt(r12, r7, r8, r9)
            if (r12 == 0) goto L6a
            goto Lb0
        L87:
            if (r6 == 0) goto La6
            com.bytedance.msdk.xt.cw r11 = r3.r
            if (r11 != 0) goto La6
            java.util.Iterator r11 = r5.iterator()
        L91:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto La6
            java.lang.Object r12 = r11.next()
            com.bytedance.msdk.xt.cw r12 = (com.bytedance.msdk.xt.cw) r12
            if (r12 == 0) goto L91
            boolean r12 = r10.xt(r12, r7, r8, r9)
            if (r12 == 0) goto L91
            goto Lb0
        La6:
            com.bytedance.msdk.api.j.xt r11 = r3.m
            com.bytedance.msdk.up.m.j(r5, r11, r1)
            if (r14 == 0) goto Lb0
            r14.j()
        Lb0:
            return
    }

    public void j(com.bytedance.msdk.cw.m.j.xt r14) {
            r13 = this;
            com.bytedance.msdk.xt.cw r0 = r13.r
            int r0 = r0.om()
            r1 = 8
            r2 = 1
            r3 = 10
            if (r0 == r3) goto L21
            com.bytedance.msdk.xt.cw r0 = r13.r
            int r0 = r0.om()
            if (r0 == r1) goto L21
            com.bytedance.msdk.xt.cw r0 = r13.r
            int r0 = r0.om()
            r4 = 7
            if (r0 != r4) goto L1f
            goto L21
        L1f:
            r9 = 1
            goto L71
        L21:
            com.bytedance.msdk.xt.cw r0 = r13.r
            boolean r0 = r0.lx()
            r4 = 0
            if (r0 == 0) goto L46
            com.bytedance.msdk.xt.cw r0 = r13.r
            boolean r0 = r0.fp()
            if (r0 == 0) goto L46
            com.bytedance.msdk.core.up.xt.r r0 = com.bytedance.msdk.core.up.xt.r.j()
            java.lang.String r5 = r13.up
            com.bytedance.msdk.api.j.xt r6 = r13.m
            int r6 = r6.up()
            boolean r0 = r0.cw(r5, r6)
            if (r0 == 0) goto L46
            r0 = 0
            goto L47
        L46:
            r0 = 1
        L47:
            com.bytedance.msdk.api.j.xt r5 = r13.m
            if (r5 == 0) goto L64
            int r5 = r5.f()
            if (r5 == r3) goto L59
            com.bytedance.msdk.api.j.xt r3 = r13.m
            int r3 = r3.f()
            if (r3 != r1) goto L64
        L59:
            com.bytedance.msdk.core.oq.xt r1 = r13.ae
            if (r1 == 0) goto L64
            int r1 = r1.jy()
            if (r1 == 0) goto L64
            goto L65
        L64:
            r2 = r0
        L65:
            com.bytedance.msdk.xt.cw r0 = r13.r
            int r0 = r0.pz()
            r1 = 4
            if (r0 != r1) goto L70
            r9 = 0
            goto L71
        L70:
            r9 = r2
        L71:
            com.bytedance.msdk.xt.cw r0 = r13.r
            boolean r0 = r0.ll()
            if (r0 == 0) goto Lbb
            com.bytedance.msdk.core.up.j.j r0 = com.bytedance.msdk.core.up.j.j.j()
            java.lang.String r1 = r13.up
            com.bytedance.msdk.xt.cw r2 = r13.r
            java.lang.String r2 = r2.qa()
            com.bytedance.msdk.api.j.xt r3 = r13.m
            int r3 = r3.up()
            boolean r0 = r0.r(r1, r2, r3)
            if (r0 == 0) goto Lbb
            com.bytedance.msdk.core.up.j.j r5 = com.bytedance.msdk.core.up.j.j.j()
            com.bytedance.msdk.xt.cw r0 = r13.r
            java.lang.String r6 = r0.qa()
            com.bytedance.msdk.api.j.xt r7 = r13.m
            r0 = 0
            if (r14 == 0) goto La6
            java.util.Map r1 = r14.p()
            r8 = r1
            goto La7
        La6:
            r8 = r0
        La7:
            if (r14 == 0) goto Lad
            com.bytedance.msdk.api.r.qv r0 = r14.h()
        Lad:
            r10 = r0
            java.lang.ref.SoftReference<android.content.Context> r14 = r13.tl
            java.lang.Object r14 = r14.get()
            r12 = r14
            android.content.Context r12 = (android.content.Context) r12
            r11 = 0
            r5.j(r6, r7, r8, r9, r10, r11, r12)
        Lbb:
            return
    }

    public void j(com.bytedance.msdk.xt.cw r1, android.app.Activity r2, java.lang.Object r3, java.lang.String r4) {
            r0 = this;
            r0.r = r1
            com.bytedance.msdk.cw.r.oq$2 r1 = new com.bytedance.msdk.cw.r.oq$2
            r1.<init>(r0, r2, r3, r4)
            com.bytedance.msdk.j.up.m.cw(r1)
            return
    }

    public void j(java.lang.Object r2) {
            r1 = this;
            r1.j = r2
            com.bytedance.msdk.xt.cw r0 = r1.r
            if (r0 == 0) goto L9
            r0.j(r2)
        L9:
            return
    }

    public void j(boolean r1) {
            r0 = this;
            r0.i = r1
            return
    }

    public void s() {
            r4 = this;
            com.bytedance.msdk.api.j.xt r0 = r4.m
            boolean r0 = r0.sm()
            if (r0 == 0) goto L9
            goto L2b
        L9:
            com.bytedance.msdk.xt.cw r0 = r4.r
            if (r0 == 0) goto L2b
            int r0 = r0.pz()
            r1 = 4
            if (r0 == r1) goto L2b
            com.bytedance.msdk.core.up.xt.r r0 = com.bytedance.msdk.core.up.xt.r.j()
            java.lang.ref.SoftReference<android.content.Context> r1 = r4.tl
            java.lang.Object r1 = r1.get()
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r2 = r4.up
            com.bytedance.msdk.api.j.xt r3 = r4.m
            int r3 = r3.up()
            r0.j(r1, r2, r3)
        L2b:
            return
    }

    protected boolean tj() {
            r1 = this;
            r0 = 0
            return r0
    }
}
