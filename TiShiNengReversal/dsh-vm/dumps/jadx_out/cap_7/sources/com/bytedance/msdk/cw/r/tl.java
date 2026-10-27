package com.bytedance.msdk.cw.r;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class tl extends com.bytedance.msdk.cw.r.r implements com.bytedance.msdk.j.xt.xt {
    private com.bytedance.msdk.api.r.j.r.xt j;
    private com.bytedance.msdk.api.r.j.r.j xt;



    public tl(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private void cw(com.bytedance.msdk.api.j r2) {
            r1 = this;
            com.bytedance.msdk.cw.r.tl$2 r0 = new com.bytedance.msdk.cw.r.tl$2
            r0.<init>(r1, r2)
            com.bytedance.msdk.j.up.m.cw(r0)
            return
    }

    static /* synthetic */ com.bytedance.msdk.api.r.j.r.j j(com.bytedance.msdk.cw.r.tl r0) {
            com.bytedance.msdk.api.r.j.r.j r0 = r0.xt
            return r0
    }

    static /* synthetic */ void j(com.bytedance.msdk.cw.r.tl r0, com.bytedance.msdk.api.j r1) {
            r0.cw(r1)
            return
    }

    @Override // com.bytedance.msdk.cw.r.xt, com.bytedance.msdk.cw.xt.j.j
    public void ae() {
            r1 = this;
            com.bytedance.msdk.api.r.j.r.xt r0 = r1.j
            if (r0 == 0) goto L7
            r0.j()
        L7:
            return
    }

    public void cw() {
            r13 = this;
            r13.v()
            boolean r0 = r13.av
            if (r0 != 0) goto L8
            goto L5f
        L8:
            boolean r0 = com.bytedance.msdk.tl.av.j()
            if (r0 == 0) goto L55
            com.bytedance.msdk.xt.cw r0 = r13.r
            if (r0 == 0) goto L44
            java.lang.String r1 = "pangle"
            java.lang.String r0 = r0.ff()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L44
            boolean r0 = com.bytedance.msdk.tl.av.cw()
            if (r0 != 0) goto L36
            java.lang.String r6 = com.bytedance.msdk.tl.mi.j()
            com.bytedance.msdk.xt.cw r1 = r13.r
            com.bytedance.msdk.api.j.xt r2 = r13.m
            r4 = 1
            boolean r5 = r13.tj()
            r3 = 2
            com.bytedance.msdk.up.m.j(r1, r2, r3, r4, r5, r6)
            return
        L36:
            com.bytedance.msdk.xt.cw r7 = r13.r
            com.bytedance.msdk.api.j.xt r8 = r13.m
            boolean r11 = r13.tj()
            r12 = 0
            r9 = 2
            r10 = 0
            com.bytedance.msdk.up.m.j(r7, r8, r9, r10, r11, r12)
        L44:
            boolean r0 = r13.ch()
            if (r0 != 0) goto L5f
            r13.s()
            com.bytedance.msdk.api.r.j.r.j r0 = r13.xt
            if (r0 == 0) goto L5f
            r0.cw()
            return
        L55:
            r13.s()
            com.bytedance.msdk.api.r.j.r.j r0 = r13.xt
            if (r0 == 0) goto L5f
            r0.cw()
        L5f:
            return
    }

    public void g_() {
            r12 = this;
            r12.f()
            boolean r0 = com.bytedance.msdk.tl.av.j()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L53
            com.bytedance.msdk.xt.cw r0 = r12.r
            if (r0 == 0) goto L53
            java.lang.String r3 = "pangle"
            java.lang.String r0 = r0.ff()
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L53
            boolean r0 = com.bytedance.msdk.tl.av.cw()
            if (r0 != 0) goto L47
            r12.j(r1)
            com.bytedance.msdk.api.j r5 = new com.bytedance.msdk.api.j
            r0 = 40063(0x9c7f, float:5.614E-41)
            java.lang.String r1 = com.bytedance.msdk.api.j.j(r0)
            r5.<init>(r0, r1)
            java.lang.String r11 = com.bytedance.msdk.tl.mi.j()
            com.bytedance.msdk.xt.cw r3 = r12.r
            com.bytedance.msdk.api.j.xt r4 = r12.m
            boolean r7 = r12.tj()
            r8 = 0
            r9 = 0
            r6 = 1
            com.bytedance.msdk.up.m.j(r3, r4, r5, r6, r7, r8, r9, r11)
            r12.cw(r5)
            return
        L47:
            boolean r0 = com.bytedance.msdk.tl.av.ae()
            if (r0 == 0) goto L53
            java.lang.String r0 = com.bytedance.msdk.tl.mi.j()
            r9 = r0
            goto L54
        L53:
            r9 = r2
        L54:
            com.bytedance.msdk.api.r.j.r.j r0 = r12.xt
            if (r0 == 0) goto L5b
            r0.g_()
        L5b:
            com.bytedance.msdk.core.tl.jy r0 = com.bytedance.msdk.core.tl.jy.j()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r12.up
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.ae(r3)
            com.bytedance.msdk.xt.cw r0 = r12.r
            if (r0 == 0) goto Lbc
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = r12.up
            java.lang.String r4 = "show_listen"
            java.lang.String r3 = com.bytedance.msdk.j.up.up.j(r3, r4)
            r0.append(r3)
            java.lang.String r3 = "adSlotId："
            r0.append(r3)
            com.bytedance.msdk.xt.cw r3 = r12.r
            java.lang.String r3 = r3.qa()
            r0.append(r3)
            java.lang.String r3 = "，广告类型："
            r0.append(r3)
            com.bytedance.msdk.xt.cw r3 = r12.r
            int r3 = r3.pz()
            java.lang.String r3 = com.bytedance.msdk.xt.j.j(r3)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "TTMediationSDK"
            com.bytedance.msdk.j.up.cw.j(r3, r0)
            com.bytedance.msdk.core.tl.qv r0 = com.bytedance.msdk.core.tl.qv.j()
            java.lang.String r3 = r12.up
            com.bytedance.msdk.xt.cw r4 = r12.r
            java.lang.String r4 = r4.qa()
            r0.xt(r3, r4)
        Lbc:
            com.bytedance.msdk.cw.m.j.xt r0 = r12.cw
            r12.j(r0)
            com.bytedance.msdk.xt.cw r0 = r12.r
            r12.cw(r0)
            com.bytedance.msdk.xt.cw r0 = r12.r
            if (r0 == 0) goto Ld9
            java.lang.String r0 = r0.zz()
            java.lang.String r3 = r12.up
            com.bytedance.msdk.xt.cw r4 = r12.r
            java.lang.String r4 = r4.qa()
            com.bytedance.msdk.core.cw.cw.j(r0, r3, r4)
        Ld9:
            long r3 = java.lang.System.currentTimeMillis()
            com.bytedance.msdk.xt.cw r0 = r12.r
            boolean r0 = com.bytedance.msdk.tl.mi.j(r0)
            if (r0 == 0) goto Lf1
            java.lang.String r2 = com.bytedance.msdk.tl.mi.xt()
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r3
        Lee:
            r7 = r5
            r6 = r2
            goto Lf4
        Lf1:
            r5 = -1
            goto Lee
        Lf4:
            com.bytedance.msdk.xt.cw r3 = r12.r
            com.bytedance.msdk.api.j.xt r4 = r12.m
            boolean r5 = r12.tj()
            r10 = 0
            com.bytedance.msdk.up.m.j(r3, r4, r5, r6, r7, r9, r10)
            com.bytedance.msdk.api.j.xt r0 = r12.m
            java.lang.String r0 = r0.v()
            com.bytedance.msdk.core.xt.j.ae(r0)
            com.bytedance.msdk.api.j.xt r0 = r12.m
            java.lang.String r0 = r0.v()
            com.bytedance.msdk.core.xt.j.cw(r0)
            com.bytedance.msdk.api.j.xt r0 = r12.m
            java.lang.String r0 = r0.v()
            com.bytedance.msdk.xt.cw r2 = r12.r
            int r2 = r2.om()
            com.bytedance.msdk.xt.cw r3 = r12.r
            double r3 = r3.t()
            com.bytedance.msdk.core.g.r.j(r1, r0, r2, r3)
            java.lang.String r0 = r12.up
            com.bytedance.msdk.xt.cw r1 = r12.r
            com.bytedance.msdk.core.ae.cw.j(r0, r1)
            return
    }

    public void h_() {
            r10 = this;
            r10.x()
            boolean r0 = com.bytedance.msdk.tl.av.j()
            r1 = 0
            if (r0 == 0) goto L4d
            com.bytedance.msdk.xt.cw r0 = r10.r
            if (r0 == 0) goto L3d
            java.lang.String r2 = "pangle"
            java.lang.String r0 = r0.ff()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L3d
            boolean r0 = com.bytedance.msdk.tl.av.cw()
            if (r0 != 0) goto L32
            java.lang.String r7 = com.bytedance.msdk.tl.mi.j()
            com.bytedance.msdk.xt.cw r2 = r10.r
            com.bytedance.msdk.api.j.xt r3 = r10.m
            r5 = 1
            boolean r6 = r10.tj()
            r4 = 5
            com.bytedance.msdk.up.m.j(r2, r3, r4, r5, r6, r7)
            return
        L32:
            boolean r0 = com.bytedance.msdk.tl.av.tl()
            if (r0 == 0) goto L3d
            java.lang.String r0 = com.bytedance.msdk.tl.mi.j()
            goto L3e
        L3d:
            r0 = r1
        L3e:
            boolean r2 = r10.ch()
            if (r2 != 0) goto L4b
            com.bytedance.msdk.api.r.j.r.j r2 = r10.xt
            if (r2 == 0) goto L4b
            r2.h_()
        L4b:
            r8 = r0
            goto L55
        L4d:
            com.bytedance.msdk.api.r.j.r.j r0 = r10.xt
            if (r0 == 0) goto L54
            r0.h_()
        L54:
            r8 = r1
        L55:
            long r2 = java.lang.System.currentTimeMillis()
            com.bytedance.msdk.xt.cw r0 = r10.r
            boolean r0 = com.bytedance.msdk.tl.mi.j(r0)
            if (r0 == 0) goto L6d
            java.lang.String r1 = com.bytedance.msdk.tl.mi.xt()
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r2
        L6a:
            r6 = r4
            r5 = r1
            goto L70
        L6d:
            r4 = -1
            goto L6a
        L70:
            com.bytedance.msdk.api.j.xt r0 = r10.m
            java.lang.String r0 = r0.v()
            com.bytedance.msdk.core.xt.j.up(r0)
            com.bytedance.msdk.xt.cw r2 = r10.r
            com.bytedance.msdk.api.j.xt r3 = r10.m
            boolean r4 = r10.tj()
            com.bytedance.msdk.xt.cw r0 = r10.r
            boolean r9 = r0.gq()
            com.bytedance.msdk.up.m.xt(r2, r3, r4, r5, r6, r8, r9)
            return
    }

    @Override // com.bytedance.msdk.cw.r.oq, com.bytedance.msdk.cw.r.xt
    public void j() {
            r7 = this;
            com.bytedance.msdk.xt.cw r0 = r7.r
            if (r0 != 0) goto L1b
            com.bytedance.msdk.core.up.j.j r1 = com.bytedance.msdk.core.up.j.j.j()
            com.bytedance.msdk.cw.m.j.xt r0 = r7.cw
            java.util.List r2 = r0.kt()
            java.lang.String r3 = r7.up
            com.bytedance.msdk.api.j.xt r4 = r7.m
            int r5 = r7.mi()
            com.bytedance.msdk.xt.cw r6 = r7.r
            r1.j(r2, r3, r4, r5, r6)
        L1b:
            super.j()
            r0 = 0
            r7.xt = r0
            r7.j = r0
            return
    }

    public void j(android.app.Activity r2) {
            r1 = this;
            r0 = 0
            r1.xt(r2, r0, r0)
            return
    }

    @Override // com.bytedance.msdk.cw.r.r
    @androidx.annotation.MainThread
    protected void j(android.app.Activity r2, java.lang.Object r3, java.lang.String r4) {
            r1 = this;
            com.bytedance.msdk.cw.r.tl$1 r0 = new com.bytedance.msdk.cw.r.tl$1
            r0.<init>(r1)
            super.j(r2, r3, r4, r0)
            com.bytedance.msdk.api.r.j.r.j r2 = r1.xt
            if (r2 != 0) goto L13
            java.lang.String r2 = "TTMediationSDK"
            java.lang.String r3 = "注意：未设置GMFullVideoAdListener，将收不到广告播放/点击/关闭等回调信息"
            com.bytedance.msdk.j.up.cw.j(r2, r3)
        L13:
            com.bytedance.msdk.xt.cw r2 = r1.r
            r1.j(r2)
            return
    }

    public void j(@androidx.annotation.NonNull com.bytedance.msdk.api.cw.j r4) {
            r3 = this;
            com.bytedance.msdk.api.r.j.r.j r0 = r3.xt
            if (r0 == 0) goto Lf
            com.bytedance.msdk.api.j.xt r1 = r3.m
            com.bytedance.msdk.xt.cw r2 = r3.r
            com.bytedance.msdk.api.cw.j r4 = com.bytedance.msdk.cw.r.vl.j(r1, r4, r2)
            r0.j(r4)
        Lf:
            return
    }

    public void j(com.bytedance.msdk.api.j.xt r1, @androidx.annotation.NonNull com.bytedance.msdk.api.r.j.r.xt r2) {
            r0 = this;
            super.xt(r1)
            r0.j = r2
            r0.m = r1
            r0.g = r0
            r0.g()
            return
    }

    public void j(com.bytedance.msdk.api.j r14) {
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
            boolean r9 = r13.tj()
            r7 = r14
            com.bytedance.msdk.up.m.j(r5, r6, r7, r8, r9, r10, r11)
            r13.cw(r7)
            return
    }

    public void j(com.bytedance.msdk.api.r.j.r.j r1) {
            r0 = this;
            r0.xt = r1
            return
    }

    public void m() {
            r13 = this;
            boolean r0 = com.bytedance.msdk.tl.av.j()
            if (r0 == 0) goto L4d
            com.bytedance.msdk.xt.cw r0 = r13.r
            if (r0 == 0) goto L3c
            java.lang.String r1 = "pangle"
            java.lang.String r0 = r0.ff()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L3c
            boolean r0 = com.bytedance.msdk.tl.av.cw()
            if (r0 != 0) goto L2e
            java.lang.String r6 = com.bytedance.msdk.tl.mi.j()
            com.bytedance.msdk.xt.cw r1 = r13.r
            com.bytedance.msdk.api.j.xt r2 = r13.m
            r4 = 1
            boolean r5 = r13.tj()
            r3 = 3
            com.bytedance.msdk.up.m.j(r1, r2, r3, r4, r5, r6)
            return
        L2e:
            com.bytedance.msdk.xt.cw r7 = r13.r
            com.bytedance.msdk.api.j.xt r8 = r13.m
            boolean r11 = r13.tj()
            r12 = 0
            r9 = 3
            r10 = 0
            com.bytedance.msdk.up.m.j(r7, r8, r9, r10, r11, r12)
        L3c:
            boolean r0 = r13.ch()
            if (r0 != 0) goto L57
            r13.s()
            com.bytedance.msdk.api.r.j.r.j r0 = r13.xt
            if (r0 == 0) goto L57
            r0.m()
            return
        L4d:
            r13.s()
            com.bytedance.msdk.api.r.j.r.j r0 = r13.xt
            if (r0 == 0) goto L57
            r0.m()
        L57:
            return
    }

    public void r() {
            r13 = this;
            boolean r0 = com.bytedance.msdk.tl.av.j()
            if (r0 == 0) goto L4d
            com.bytedance.msdk.xt.cw r0 = r13.r
            if (r0 == 0) goto L3c
            java.lang.String r1 = "pangle"
            java.lang.String r0 = r0.ff()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L3c
            boolean r0 = com.bytedance.msdk.tl.av.cw()
            if (r0 != 0) goto L2e
            java.lang.String r6 = com.bytedance.msdk.tl.mi.j()
            com.bytedance.msdk.xt.cw r1 = r13.r
            com.bytedance.msdk.api.j.xt r2 = r13.m
            r4 = 1
            boolean r5 = r13.tj()
            r3 = 1
            com.bytedance.msdk.up.m.j(r1, r2, r3, r4, r5, r6)
            return
        L2e:
            com.bytedance.msdk.xt.cw r7 = r13.r
            com.bytedance.msdk.api.j.xt r8 = r13.m
            boolean r11 = r13.tj()
            r12 = 0
            r9 = 1
            r10 = 0
            com.bytedance.msdk.up.m.j(r7, r8, r9, r10, r11, r12)
        L3c:
            boolean r0 = r13.ch()
            if (r0 != 0) goto L57
            r13.s()
            com.bytedance.msdk.api.r.j.r.j r0 = r13.xt
            if (r0 == 0) goto L57
            r0.r()
            return
        L4d:
            r13.s()
            com.bytedance.msdk.api.r.j.r.j r0 = r13.xt
            if (r0 == 0) goto L57
            r0.r()
        L57:
            return
    }

    @Override // com.bytedance.msdk.cw.r.xt, com.bytedance.msdk.cw.xt.j.j
    public void tl() {
            r1 = this;
            com.bytedance.msdk.api.r.j.r.xt r0 = r1.j
            if (r0 == 0) goto L7
            r0.xt()
        L7:
            return
    }

    public void up() {
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
            r8 = 2
            boolean r9 = r13.tj()
            r7 = 0
            com.bytedance.msdk.up.m.j(r5, r6, r7, r8, r9, r10, r11)
            com.bytedance.msdk.api.r.j.r.j r0 = r13.xt
            if (r0 == 0) goto L30
            r0.up()
        L30:
            return
    }

    public void xt(android.app.Activity r1, java.lang.Object r2, java.lang.String r3) {
            r0 = this;
            r0.j(r1, r2, r3)
            return
    }

    @Override // com.bytedance.msdk.cw.r.xt, com.bytedance.msdk.cw.xt.j.j
    public void xt(com.bytedance.msdk.api.j r2) {
            r1 = this;
            com.bytedance.msdk.api.r.j.r.xt r0 = r1.j
            if (r0 == 0) goto L7
            r0.j(r2)
        L7:
            return
    }
}
