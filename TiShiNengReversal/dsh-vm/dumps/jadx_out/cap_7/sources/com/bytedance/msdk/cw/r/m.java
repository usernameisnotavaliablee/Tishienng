package com.bytedance.msdk.cw.r;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class m extends com.bytedance.msdk.cw.r.xt implements com.bytedance.msdk.j.xt.j {
    private boolean av;
    private com.bytedance.msdk.api.r.j.j.r i;
    private com.bytedance.msdk.api.r.j.j.j j;
    private com.bytedance.msdk.api.r.j.j.xt xt;




    public m(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.av = r1
            return
    }

    private com.bytedance.msdk.api.r.j.j.cw cw(com.bytedance.msdk.xt.cw r2) {
            r1 = this;
            com.bytedance.msdk.cw.r.m$3 r0 = new com.bytedance.msdk.cw.r.m$3
            r0.<init>(r1, r2)
            return r0
    }

    private void cw(com.bytedance.msdk.api.j r2) {
            r1 = this;
            com.bytedance.msdk.cw.r.m$2 r0 = new com.bytedance.msdk.cw.r.m$2
            r0.<init>(r1, r2)
            com.bytedance.msdk.j.up.m.cw(r0)
            return
    }

    private android.view.View j(android.content.Context r4, com.bytedance.msdk.xt.cw r5) {
            r3 = this;
            r3.r = r5
            com.bytedance.msdk.cw.m.j.xt r0 = r3.cw
            r0.j(r5)
            com.bytedance.msdk.xt.cw r5 = r3.r
            r0 = 1
            r5.up(r0)
            com.bytedance.msdk.xt.cw r5 = r3.r
            com.bytedance.msdk.j.xt.m r0 = r3.g
            r5.j(r0)
            com.bytedance.msdk.xt.cw r5 = r3.r
            boolean r5 = r5.ll()
            if (r5 == 0) goto L3f
            com.bytedance.msdk.core.up.j.j r5 = com.bytedance.msdk.core.up.j.j.j()
            java.lang.String r0 = r3.up
            com.bytedance.msdk.xt.cw r1 = r3.r
            java.lang.String r1 = r1.qa()
            com.bytedance.msdk.api.j.xt r2 = r3.m
            int r2 = r2.up()
            boolean r5 = r5.r(r0, r1, r2)
            if (r5 == 0) goto L3f
            com.bytedance.msdk.xt.cw r5 = r3.r
            java.lang.String r0 = r3.up
            java.lang.String r1 = r5.qa()
            com.bytedance.msdk.cw.tl.up.j(r5, r0, r1)
        L3f:
            r5 = 0
            r3.j(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = r3.up
            java.lang.String r1 = "show"
            java.lang.String r0 = com.bytedance.msdk.j.up.up.j(r0, r1)
            r5.append(r0)
            java.lang.String r0 = "展示的广告类型："
            r5.append(r0)
            com.bytedance.msdk.xt.cw r0 = r3.r
            int r0 = r0.pz()
            java.lang.String r0 = com.bytedance.msdk.xt.j.j(r0)
            r5.append(r0)
            java.lang.String r0 = ",slotId："
            r5.append(r0)
            com.bytedance.msdk.xt.cw r0 = r3.r
            java.lang.String r0 = r0.qa()
            r5.append(r0)
            java.lang.String r0 = ",slotType:"
            r5.append(r0)
            com.bytedance.msdk.xt.cw r0 = r3.r
            int r0 = r0.xw()
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            java.lang.String r0 = "TTMediationSDK"
            com.bytedance.msdk.j.up.cw.j(r0, r5)
            com.bytedance.msdk.xt.cw r5 = r3.r
            android.view.View r5 = r5.g()
            com.bytedance.msdk.xt.cw r1 = r3.r
            boolean r1 = r1.dj()
            if (r1 != 0) goto Ld7
            com.bytedance.msdk.xt.cw r1 = r3.r
            int r1 = r1.rh()
            r2 = 4
            if (r1 != r2) goto Ld7
            com.bytedance.msdk.xt.cw r1 = r3.r
            int r1 = r1.ol()
            r2 = 2
            if (r1 != r2) goto Ld7
            com.bytedance.msdk.xt.cw r1 = r3.r
            boolean r1 = r1.aq()
            if (r1 != 0) goto Ld7
            com.bytedance.msdk.api.r.j.j.r r1 = r3.i
            if (r1 == 0) goto Ld2
            com.bytedance.msdk.xt.cw r2 = r3.r     // Catch: java.lang.Throwable -> Lc8
            com.bytedance.msdk.api.r.j.j.cw r2 = r3.cw(r2)     // Catch: java.lang.Throwable -> Lc8
            android.view.View r5 = r1.j(r2)     // Catch: java.lang.Throwable -> Lc8
            if (r5 != 0) goto Ld7
            java.lang.String r1 = "--==-- banner混出自渲染信息流，getGMBannerViewFromNativeAd()返回null，将无法展示该广告"
            com.bytedance.msdk.j.up.cw.j(r0, r1)     // Catch: java.lang.Throwable -> Lc8
            goto Ld7
        Lc8:
            r1 = move-exception
            java.lang.String r2 = "--==-- banner混出自渲染信息流，getGMBannerViewFromNativeAd()发生异常，将无法展示该广告，信息如下："
            com.bytedance.msdk.j.up.cw.j(r0, r2)
            com.bytedance.sdk.component.utils.vl.j(r1)
            goto Ld7
        Ld2:
            java.lang.String r1 = "--==-- banner混出自渲染信息流，但未提供GMNativeToBannerListener，将无法展示该广告"
            com.bytedance.msdk.j.up.cw.j(r0, r1)
        Ld7:
            com.bytedance.msdk.xt.cw r0 = r3.r
            boolean r0 = r0.kt()
            if (r0 == 0) goto Lee
            if (r4 == 0) goto Lee
            com.bytedance.msdk.xt.cw r0 = r3.r
            android.app.Activity r4 = (android.app.Activity) r4
            com.bytedance.msdk.cw.r.m$1 r1 = new com.bytedance.msdk.cw.r.m$1
            r2 = 0
            r1.<init>(r3, r2, r5)
            r0.j(r4, r1)
        Lee:
            return r5
    }

    static /* synthetic */ com.bytedance.msdk.api.r.j.j.j j(com.bytedance.msdk.cw.r.m r0) {
            com.bytedance.msdk.api.r.j.j.j r0 = r0.j
            return r0
    }

    private void j(boolean r10) {
            r9 = this;
            com.bytedance.msdk.xt.cw r0 = r9.r
            if (r0 == 0) goto L4d
            boolean r0 = r0.ll()
            if (r0 == 0) goto L4d
            com.bytedance.msdk.core.up.j.j r0 = com.bytedance.msdk.core.up.j.j.j()
            java.lang.String r1 = r9.up
            com.bytedance.msdk.xt.cw r2 = r9.r
            java.lang.String r2 = r2.qa()
            com.bytedance.msdk.api.j.xt r3 = r9.m
            int r3 = r3.up()
            boolean r0 = r0.r(r1, r2, r3)
            if (r0 == 0) goto L4d
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
            r5 = r10
            r1.j(r2, r3, r4, r5, r6, r7, r8)
        L4d:
            return
    }

    @Override // com.bytedance.msdk.cw.r.xt, com.bytedance.msdk.cw.xt.j.j
    public void ae() {
            r1 = this;
            com.bytedance.msdk.api.r.j.j.xt r0 = r1.xt
            if (r0 == 0) goto L7
            r0.j()
        L7:
            return
    }

    @Override // com.bytedance.msdk.cw.r.xt
    public com.bytedance.msdk.api.cw az() {
            r1 = this;
            boolean r0 = r1.av
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            com.bytedance.msdk.api.cw r0 = super.az()
            return r0
    }

    public boolean cw() {
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

    public void f_() {
            r1 = this;
            com.bytedance.msdk.api.r.j.j.j r0 = r1.j
            if (r0 == 0) goto L7
            r0.f_()
        L7:
            return
    }

    public synchronized android.view.View j(android.content.Context r15) {
            r14 = this;
            monitor-enter(r14)
            com.bytedance.msdk.api.j.xt r0 = r14.m     // Catch: java.lang.Throwable -> L22
            com.bytedance.msdk.up.m.j(r0)     // Catch: java.lang.Throwable -> L22
            boolean r0 = r14.vl     // Catch: java.lang.Throwable -> L22
            r1 = 40052(0x9c74, float:5.6125E-41)
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L26
            com.bytedance.msdk.api.j.xt r15 = r14.m     // Catch: java.lang.Throwable -> L22
            com.bytedance.msdk.up.m.j(r3, r15, r2)     // Catch: java.lang.Throwable -> L22
            com.bytedance.msdk.api.j r15 = new com.bytedance.msdk.api.j     // Catch: java.lang.Throwable -> L22
            java.lang.String r0 = com.bytedance.msdk.api.j.j(r1)     // Catch: java.lang.Throwable -> L22
            r15.<init>(r1, r0)     // Catch: java.lang.Throwable -> L22
            r14.cw(r15)     // Catch: java.lang.Throwable -> L22
            monitor-exit(r14)
            return r3
        L22:
            r0 = move-exception
            r15 = r0
            goto L25a
        L26:
            java.lang.String r0 = r14.up     // Catch: java.lang.Throwable -> L22
            int r0 = com.bytedance.msdk.cw.r.xt.xt(r0)     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L41
            com.bytedance.msdk.api.j.xt r15 = r14.m     // Catch: java.lang.Throwable -> L22
            com.bytedance.msdk.up.m.j(r3, r15, r0)     // Catch: java.lang.Throwable -> L22
            com.bytedance.msdk.api.j r15 = new com.bytedance.msdk.api.j     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = com.bytedance.msdk.api.j.j(r0)     // Catch: java.lang.Throwable -> L22
            r15.<init>(r0, r1)     // Catch: java.lang.Throwable -> L22
            r14.cw(r15)     // Catch: java.lang.Throwable -> L22
            monitor-exit(r14)
            return r3
        L41:
            com.bytedance.msdk.cw.m.j.xt r0 = r14.cw     // Catch: java.lang.Throwable -> L22
            java.util.List r4 = r0.kt()     // Catch: java.lang.Throwable -> L22
            java.util.List r0 = r14.xt()     // Catch: java.lang.Throwable -> L4c
            goto L51
        L4c:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)     // Catch: java.lang.Throwable -> L22
            r0 = r3
        L51:
            if (r0 == 0) goto Lee
            int r5 = r0.size()     // Catch: java.lang.Throwable -> L22
            if (r5 <= 0) goto Lee
            java.util.HashMap r5 = r14.xt(r4)     // Catch: java.lang.Throwable -> L22
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L22
            r6 = r3
        L62:
            boolean r7 = r0.hasNext()     // Catch: java.lang.Throwable -> L22
            if (r7 == 0) goto Lef
            java.lang.Object r7 = r0.next()     // Catch: java.lang.Throwable -> L22
            com.bytedance.msdk.core.oq.oq r7 = (com.bytedance.msdk.core.oq.oq) r7     // Catch: java.lang.Throwable -> L22
            if (r7 == 0) goto L62
            java.lang.String r8 = r7.w()     // Catch: java.lang.Throwable -> L22
            java.lang.Object r9 = r5.get(r8)     // Catch: java.lang.Throwable -> L22
            com.bytedance.msdk.xt.cw r9 = (com.bytedance.msdk.xt.cw) r9     // Catch: java.lang.Throwable -> L22
            if (r9 == 0) goto L90
            java.lang.String r10 = r14.up     // Catch: java.lang.Throwable -> L22
            boolean r10 = r9.wq(r10)     // Catch: java.lang.Throwable -> L22
            if (r10 == 0) goto L90
            boolean r10 = r9.qb()     // Catch: java.lang.Throwable -> L22
            if (r10 != 0) goto L90
            android.view.View r6 = r14.j(r15, r9)     // Catch: java.lang.Throwable -> L22
            if (r6 != 0) goto Lef
        L90:
            boolean r7 = r7.kt()     // Catch: java.lang.Throwable -> L22
            if (r7 == 0) goto L62
            com.bytedance.msdk.core.up.j.j r7 = com.bytedance.msdk.core.up.j.j.j()     // Catch: java.lang.Throwable -> L22
            java.lang.String r9 = r14.up     // Catch: java.lang.Throwable -> L22
            com.bytedance.msdk.api.j.xt r10 = r14.m     // Catch: java.lang.Throwable -> L22
            int r10 = r10.up()     // Catch: java.lang.Throwable -> L22
            boolean r7 = r7.r(r9, r8, r10)     // Catch: java.lang.Throwable -> L22
            if (r7 == 0) goto L62
            com.bytedance.msdk.core.up.j.j r7 = com.bytedance.msdk.core.up.j.j.j()     // Catch: java.lang.Throwable -> L22
            com.bytedance.msdk.api.j.xt r9 = r14.m     // Catch: java.lang.Throwable -> L22
            int r7 = r7.j(r8, r9, r2)     // Catch: java.lang.Throwable -> L22
            r9 = 3
            if (r7 != r9) goto L62
            com.bytedance.msdk.core.up.j.j r7 = com.bytedance.msdk.core.up.j.j.j()     // Catch: java.lang.Throwable -> L22
            com.bytedance.msdk.api.j.xt r9 = r14.m     // Catch: java.lang.Throwable -> L22
            int r10 = r9.up()     // Catch: java.lang.Throwable -> L22
            java.util.List r7 = r7.j(r8, r9, r10)     // Catch: java.lang.Throwable -> L22
            if (r7 == 0) goto L62
            int r8 = r7.size()     // Catch: java.lang.Throwable -> L22
            if (r8 <= 0) goto L62
            java.lang.Object r7 = r7.get(r2)     // Catch: java.lang.Throwable -> L22
            com.bytedance.msdk.core.up.xt.ae r7 = (com.bytedance.msdk.core.up.xt.ae) r7     // Catch: java.lang.Throwable -> L22
            com.bytedance.msdk.xt.cw r7 = r7.j     // Catch: java.lang.Throwable -> L22
            if (r7 == 0) goto L62
            java.lang.String r8 = r14.up     // Catch: java.lang.Throwable -> L22
            boolean r8 = r7.wq(r8)     // Catch: java.lang.Throwable -> L22
            if (r8 == 0) goto L62
            boolean r8 = r7.qb()     // Catch: java.lang.Throwable -> L22
            if (r8 != 0) goto L62
            r14.xt(r7)     // Catch: java.lang.Throwable -> L22
            android.view.View r6 = r14.j(r15, r7)     // Catch: java.lang.Throwable -> L22
            if (r6 != 0) goto Lef
            goto L62
        Lee:
            r6 = r3
        Lef:
            if (r6 != 0) goto L120
            if (r4 == 0) goto L120
            int r0 = r4.size()     // Catch: java.lang.Throwable -> L22
            if (r0 <= 0) goto L120
            java.util.Iterator r0 = r4.iterator()     // Catch: java.lang.Throwable -> L22
        Lfd:
            boolean r5 = r0.hasNext()     // Catch: java.lang.Throwable -> L22
            if (r5 == 0) goto L120
            java.lang.Object r5 = r0.next()     // Catch: java.lang.Throwable -> L22
            com.bytedance.msdk.xt.cw r5 = (com.bytedance.msdk.xt.cw) r5     // Catch: java.lang.Throwable -> L22
            if (r5 == 0) goto Lfd
            java.lang.String r7 = r14.up     // Catch: java.lang.Throwable -> L22
            boolean r7 = r5.wq(r7)     // Catch: java.lang.Throwable -> L22
            if (r7 == 0) goto Lfd
            boolean r7 = r5.qb()     // Catch: java.lang.Throwable -> L22
            if (r7 != 0) goto Lfd
            android.view.View r6 = r14.j(r15, r5)     // Catch: java.lang.Throwable -> L22
            if (r6 != 0) goto L120
            goto Lfd
        L120:
            if (r6 == 0) goto L247
            r15 = 1
            r14.vl = r15     // Catch: java.lang.Throwable -> L22
            com.bytedance.msdk.cw.m.j.xt r0 = r14.cw     // Catch: java.lang.Throwable -> L22
            java.util.List r8 = r0.kt()     // Catch: java.lang.Throwable -> L22
            com.bytedance.msdk.core.up.j.j r7 = com.bytedance.msdk.core.up.j.j.j()     // Catch: java.lang.Throwable -> L22
            java.lang.String r9 = r14.up     // Catch: java.lang.Throwable -> L22
            com.bytedance.msdk.api.j.xt r10 = r14.m     // Catch: java.lang.Throwable -> L22
            int r11 = r10.up()     // Catch: java.lang.Throwable -> L22
            com.bytedance.msdk.xt.cw r12 = r14.r     // Catch: java.lang.Throwable -> L22
            r7.j(r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L22
            com.bytedance.msdk.xt.cw r0 = r14.r     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L15a
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L22
            r0.<init>()     // Catch: java.lang.Throwable -> L22
            com.bytedance.msdk.xt.cw r1 = r14.r     // Catch: java.lang.Throwable -> L22
            r0.add(r1)     // Catch: java.lang.Throwable -> L22
            com.bytedance.msdk.cw.up.j r1 = com.bytedance.msdk.cw.up.j.j()     // Catch: java.lang.Throwable -> L22
            com.bytedance.msdk.api.j.xt r4 = r14.m     // Catch: java.lang.Throwable -> L22
            java.util.List r5 = com.bytedance.msdk.cw.up.j.j(r4, r0, r8)     // Catch: java.lang.Throwable -> L22
            r1.j(r4, r5)     // Catch: java.lang.Throwable -> L22
            r14.j(r0)     // Catch: java.lang.Throwable -> L22
        L15a:
            com.bytedance.msdk.xt.cw r0 = r14.r     // Catch: java.lang.Throwable -> L22
            com.bytedance.msdk.api.j.xt r1 = r14.m     // Catch: java.lang.Throwable -> L22
            com.bytedance.msdk.up.m.j(r0, r1, r2, r2)     // Catch: java.lang.Throwable -> L22
            com.bytedance.msdk.api.r.j.j.j r0 = r14.j     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L245
            com.bytedance.msdk.xt.cw r0 = r14.r     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L245
            int r0 = r0.pz()     // Catch: java.lang.Throwable -> L22
            r1 = 2
            if (r0 != r1) goto L245
            java.lang.String r0 = "ADMOB_EVENT"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L22
            r1.<init>()     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = r14.up     // Catch: java.lang.Throwable -> L22
            com.bytedance.msdk.xt.cw r4 = r14.r     // Catch: java.lang.Throwable -> L22
            java.lang.String r4 = r4.qa()     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = com.bytedance.msdk.j.up.up.xt(r2, r4)     // Catch: java.lang.Throwable -> L22
            r1.append(r2)     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = "mTTAdBannerListener-->Admob--->onAdShow......"
            r1.append(r2)     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L22
            com.bytedance.msdk.j.up.cw.j(r0, r1)     // Catch: java.lang.Throwable -> L22
            com.bytedance.msdk.core.tl.jy r0 = com.bytedance.msdk.core.tl.jy.j()     // Catch: java.lang.Throwable -> L22
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L22
            r1.<init>()     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = r14.up     // Catch: java.lang.Throwable -> L22
            r1.append(r2)     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L22
            r0.ae(r1)     // Catch: java.lang.Throwable -> L22
            com.bytedance.msdk.core.tl.jy r0 = com.bytedance.msdk.core.tl.jy.j()     // Catch: java.lang.Throwable -> L22
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L22
            r1.<init>()     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = r14.up     // Catch: java.lang.Throwable -> L22
            r1.append(r2)     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L22
            r0.xt(r1)     // Catch: java.lang.Throwable -> L22
            com.bytedance.msdk.api.r.j.j.j r0 = r14.j     // Catch: java.lang.Throwable -> L22
            r0.xt(r3)     // Catch: java.lang.Throwable -> L22
            com.bytedance.msdk.xt.cw r0 = r14.r     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L21c
            java.lang.String r0 = "TTMediationSDK"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L22
            r1.<init>()     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = r14.up     // Catch: java.lang.Throwable -> L22
            java.lang.String r3 = "show_listen"
            java.lang.String r2 = com.bytedance.msdk.j.up.up.j(r2, r3)     // Catch: java.lang.Throwable -> L22
            r1.append(r2)     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = "adSlotId："
            r1.append(r2)     // Catch: java.lang.Throwable -> L22
            com.bytedance.msdk.xt.cw r2 = r14.r     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = r2.qa()     // Catch: java.lang.Throwable -> L22
            r1.append(r2)     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = "，广告类型："
            r1.append(r2)     // Catch: java.lang.Throwable -> L22
            com.bytedance.msdk.xt.cw r2 = r14.r     // Catch: java.lang.Throwable -> L22
            int r2 = r2.pz()     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = com.bytedance.msdk.xt.j.j(r2)     // Catch: java.lang.Throwable -> L22
            r1.append(r2)     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L22
            com.bytedance.msdk.j.up.cw.j(r0, r1)     // Catch: java.lang.Throwable -> L22
            com.bytedance.msdk.core.tl.qv r0 = com.bytedance.msdk.core.tl.qv.j()     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = r14.up     // Catch: java.lang.Throwable -> L22
            com.bytedance.msdk.xt.cw r2 = r14.r     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = r2.qa()     // Catch: java.lang.Throwable -> L22
            r0.xt(r1, r2)     // Catch: java.lang.Throwable -> L22
            com.bytedance.msdk.core.tl.vl r0 = com.bytedance.msdk.core.tl.vl.j()     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = r14.up     // Catch: java.lang.Throwable -> L22
            com.bytedance.msdk.xt.cw r2 = r14.r     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = r2.qa()     // Catch: java.lang.Throwable -> L22
            r0.xt(r1, r2)     // Catch: java.lang.Throwable -> L22
        L21c:
            com.bytedance.msdk.xt.cw r0 = r14.r     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L22f
            java.lang.String r0 = r0.zz()     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = r14.up     // Catch: java.lang.Throwable -> L22
            com.bytedance.msdk.xt.cw r2 = r14.r     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = r2.qa()     // Catch: java.lang.Throwable -> L22
            com.bytedance.msdk.core.cw.cw.j(r0, r1, r2)     // Catch: java.lang.Throwable -> L22
        L22f:
            r14.j(r15)     // Catch: java.lang.Throwable -> L22
            com.bytedance.msdk.xt.cw r7 = r14.r     // Catch: java.lang.Throwable -> L22
            com.bytedance.msdk.api.j.xt r8 = r14.m     // Catch: java.lang.Throwable -> L22
            r11 = 0
            r13 = 0
            r9 = 0
            r10 = 0
            com.bytedance.msdk.up.m.j(r7, r8, r9, r10, r11, r13)     // Catch: java.lang.Throwable -> L22
            java.lang.String r15 = r14.up     // Catch: java.lang.Throwable -> L22
            com.bytedance.msdk.xt.cw r0 = r14.r     // Catch: java.lang.Throwable -> L22
            com.bytedance.msdk.core.ae.cw.j(r15, r0)     // Catch: java.lang.Throwable -> L22
        L245:
            monitor-exit(r14)
            return r6
        L247:
            com.bytedance.msdk.api.j.xt r15 = r14.m     // Catch: java.lang.Throwable -> L22
            com.bytedance.msdk.up.m.j(r4, r15, r2)     // Catch: java.lang.Throwable -> L22
            com.bytedance.msdk.api.j r15 = new com.bytedance.msdk.api.j     // Catch: java.lang.Throwable -> L22
            java.lang.String r0 = com.bytedance.msdk.api.j.j(r1)     // Catch: java.lang.Throwable -> L22
            r15.<init>(r1, r0)     // Catch: java.lang.Throwable -> L22
            r14.cw(r15)     // Catch: java.lang.Throwable -> L22
            monitor-exit(r14)
            return r3
        L25a:
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L22
            throw r15
    }

    public com.bytedance.sdk.openadsdk.i.cw.xt.ae j(android.app.Activity r2) {
            r1 = this;
            com.bytedance.msdk.xt.cw r0 = r1.r
            if (r0 == 0) goto L9
            com.bytedance.sdk.openadsdk.i.cw.xt.ae r2 = r0.j(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    @Override // com.bytedance.msdk.cw.r.xt
    public void j() {
            r7 = this;
            boolean r0 = r7.vl
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
            r0 = 0
            r7.j = r0
            r7.xt = r0
            return
    }

    public void j(android.app.Activity r2, com.bytedance.sdk.openadsdk.kt.j.xt.j.j r3) {
            r1 = this;
            com.bytedance.msdk.xt.cw r0 = r1.r
            if (r0 == 0) goto L7
            r0.j(r2, r3)
        L7:
            return
    }

    public void j(android.app.Dialog r2, java.lang.Integer[] r3) {
            r1 = this;
            com.bytedance.msdk.xt.cw r0 = r1.r
            if (r0 == 0) goto L7
            r0.j(r2, r3)
        L7:
            return
    }

    public void j(android.view.View r12) {
            r11 = this;
            com.bytedance.msdk.api.r.j.j.j r0 = r11.j
            if (r0 == 0) goto L7
            r0.j(r12)
        L7:
            long r0 = java.lang.System.currentTimeMillis()
            com.bytedance.msdk.xt.cw r12 = r11.r
            boolean r12 = com.bytedance.msdk.tl.mi.j(r12)
            if (r12 == 0) goto L1f
            java.lang.String r12 = com.bytedance.msdk.tl.mi.xt()
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
        L1c:
            r7 = r12
            r8 = r2
            goto L23
        L1f:
            r12 = 0
            r2 = -1
            goto L1c
        L23:
            com.bytedance.msdk.api.j.xt r12 = r11.m
            java.lang.String r12 = r12.v()
            com.bytedance.msdk.core.xt.j.up(r12)
            com.bytedance.msdk.xt.cw r4 = r11.r
            com.bytedance.msdk.api.j.xt r5 = r11.m
            r6 = 0
            boolean r10 = r4.gq()
            com.bytedance.msdk.up.m.xt(r4, r5, r6, r7, r8, r10)
            return
    }

    public void j(com.bytedance.msdk.api.j.xt r1, com.bytedance.msdk.api.r.j.j.xt r2) {
            r0 = this;
            r0.j(r1)
            r0.g = r0
            r0.xt = r2
            r0.g()
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

    public void j(com.bytedance.msdk.api.r.j.j.j r1) {
            r0 = this;
            r0.j = r1
            return
    }

    public void j(com.bytedance.msdk.api.r.j.j.r r1) {
            r0 = this;
            r0.i = r1
            return
    }

    public void j(com.bytedance.sdk.openadsdk.i.cw.j.cw r2) {
            r1 = this;
            com.bytedance.msdk.xt.cw r0 = r1.r
            if (r0 == 0) goto L7
            r0.j(r2)
        L7:
            return
    }

    public void j(com.bytedance.sdk.openadsdk.s.j.xt.j.cw r2) {
            r1 = this;
            com.bytedance.msdk.xt.cw r0 = r1.r
            if (r0 == 0) goto L7
            r0.j(r2)
        L7:
            return
    }

    public void m() {
            r1 = this;
            com.bytedance.msdk.xt.cw r0 = r1.r
            if (r0 == 0) goto L7
            r0.av()
        L7:
            return
    }

    public int r() {
            r1 = this;
            com.bytedance.msdk.xt.cw r0 = r1.r
            if (r0 == 0) goto L9
            int r0 = r0.st()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public void r(java.lang.String r2) {
            r1 = this;
            com.bytedance.msdk.xt.cw r0 = r1.r
            if (r0 == 0) goto L7
            r0.uf(r2)
        L7:
            return
    }

    public com.bytedance.sdk.openadsdk.i.cw.xt.r tj() {
            r1 = this;
            com.bytedance.msdk.xt.cw r0 = r1.r
            if (r0 == 0) goto L9
            com.bytedance.sdk.openadsdk.i.cw.xt.r r0 = r0.kk()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public void up() {
            r1 = this;
            com.bytedance.msdk.xt.cw r0 = r1.r
            if (r0 == 0) goto L7
            r0.i()
        L7:
            return
    }

    public void xt(android.view.View r13) {
            r12 = this;
            r0 = 1
            r12.av = r0
            com.bytedance.msdk.api.r.j.j.j r1 = r12.j
            if (r1 == 0) goto L36
            com.bytedance.msdk.core.tl.jy r1 = com.bytedance.msdk.core.tl.jy.j()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r12.up
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.ae(r2)
            com.bytedance.msdk.core.tl.jy r1 = com.bytedance.msdk.core.tl.jy.j()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r12.up
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.xt(r2)
            com.bytedance.msdk.api.r.j.j.j r1 = r12.j
            r1.xt(r13)
        L36:
            com.bytedance.msdk.xt.cw r13 = r12.r
            if (r13 == 0) goto L91
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r1 = r12.up
            java.lang.String r2 = "show_listen"
            java.lang.String r1 = com.bytedance.msdk.j.up.up.j(r1, r2)
            r13.append(r1)
            java.lang.String r1 = "adSlotId："
            r13.append(r1)
            com.bytedance.msdk.xt.cw r1 = r12.r
            java.lang.String r1 = r1.qa()
            r13.append(r1)
            java.lang.String r1 = "，广告类型："
            r13.append(r1)
            com.bytedance.msdk.xt.cw r1 = r12.r
            int r1 = r1.pz()
            java.lang.String r1 = com.bytedance.msdk.xt.j.j(r1)
            r13.append(r1)
            java.lang.String r13 = r13.toString()
            java.lang.String r1 = "TTMediationSDK"
            com.bytedance.msdk.j.up.cw.j(r1, r13)
            com.bytedance.msdk.core.tl.qv r13 = com.bytedance.msdk.core.tl.qv.j()
            java.lang.String r1 = r12.up
            com.bytedance.msdk.xt.cw r2 = r12.r
            java.lang.String r2 = r2.qa()
            r13.xt(r1, r2)
            com.bytedance.msdk.core.tl.vl r13 = com.bytedance.msdk.core.tl.vl.j()
            java.lang.String r1 = r12.up
            com.bytedance.msdk.xt.cw r2 = r12.r
            java.lang.String r2 = r2.qa()
            r13.xt(r1, r2)
        L91:
            com.bytedance.msdk.xt.cw r13 = r12.r
            if (r13 == 0) goto La4
            java.lang.String r13 = r13.zz()
            java.lang.String r1 = r12.up
            com.bytedance.msdk.xt.cw r2 = r12.r
            java.lang.String r2 = r2.qa()
            com.bytedance.msdk.core.cw.cw.j(r13, r1, r2)
        La4:
            r12.j(r0)
            long r1 = java.lang.System.currentTimeMillis()
            com.bytedance.msdk.xt.cw r13 = r12.r
            boolean r13 = com.bytedance.msdk.tl.mi.j(r13)
            if (r13 == 0) goto Lbf
            java.lang.String r13 = com.bytedance.msdk.tl.mi.xt()
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r1
        Lbc:
            r8 = r13
            r9 = r3
            goto Lc3
        Lbf:
            r13 = 0
            r3 = -1
            goto Lbc
        Lc3:
            com.bytedance.msdk.xt.cw r5 = r12.r
            com.bytedance.msdk.api.j.xt r6 = r12.m
            r7 = 0
            r11 = 0
            com.bytedance.msdk.up.m.j(r5, r6, r7, r8, r9, r11)
            com.bytedance.msdk.api.j.xt r13 = r12.m
            java.lang.String r13 = r13.v()
            com.bytedance.msdk.core.xt.j.ae(r13)
            com.bytedance.msdk.api.j.xt r13 = r12.m
            java.lang.String r13 = r13.v()
            com.bytedance.msdk.core.xt.j.cw(r13)
            com.bytedance.msdk.api.j.xt r13 = r12.m
            java.lang.String r13 = r13.v()
            com.bytedance.msdk.xt.cw r1 = r12.r
            int r1 = r1.om()
            com.bytedance.msdk.xt.cw r2 = r12.r
            double r2 = r2.t()
            com.bytedance.msdk.core.g.r.j(r0, r13, r1, r2)
            java.lang.String r13 = r12.up
            com.bytedance.msdk.xt.cw r0 = r12.r
            com.bytedance.msdk.core.ae.cw.j(r13, r0)
            return
    }

    @Override // com.bytedance.msdk.cw.r.xt, com.bytedance.msdk.cw.xt.j.j
    public void xt(@androidx.annotation.NonNull com.bytedance.msdk.api.j r2) {
            r1 = this;
            com.bytedance.msdk.api.r.j.j.xt r0 = r1.xt
            if (r0 == 0) goto L7
            r0.j(r2)
        L7:
            return
    }

    public void xt(com.bytedance.sdk.openadsdk.i.cw.j.xt r2) {
            r1 = this;
            com.bytedance.msdk.xt.cw r0 = r1.r
            if (r0 == 0) goto L7
            r0.j(r2)
        L7:
            return
    }
}
