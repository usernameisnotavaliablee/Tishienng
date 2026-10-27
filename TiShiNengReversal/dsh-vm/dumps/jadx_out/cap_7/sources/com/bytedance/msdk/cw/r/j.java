package com.bytedance.msdk.cw.r;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class j extends com.bytedance.msdk.cw.r.r {
    com.bytedance.msdk.j.xt.xt j;
    private com.bytedance.msdk.api.r.j.m.xt kt;
    private com.bytedance.msdk.api.r.j.m.j tj;
    com.bytedance.msdk.j.xt.cw xt;





    public j(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            com.bytedance.msdk.cw.r.j$3 r1 = new com.bytedance.msdk.cw.r.j$3
            r1.<init>(r0)
            r0.j = r1
            com.bytedance.msdk.cw.r.j$4 r1 = new com.bytedance.msdk.cw.r.j$4
            r1.<init>(r0)
            r0.xt = r1
            return
    }

    static /* synthetic */ com.bytedance.msdk.api.r.j.m.j j(com.bytedance.msdk.cw.r.j r0) {
            com.bytedance.msdk.api.r.j.m.j r0 = r0.tj
            return r0
    }

    private void j(com.bytedance.msdk.api.j r2) {
            r1 = this;
            com.bytedance.msdk.cw.r.j$2 r0 = new com.bytedance.msdk.cw.r.j$2
            r0.<init>(r1, r2)
            com.bytedance.msdk.j.up.m.cw(r0)
            return
    }

    static /* synthetic */ void j(com.bytedance.msdk.cw.r.j r0, com.bytedance.msdk.api.j r1) {
            r0.j(r1)
            return
    }

    private void xt(android.app.Activity r2, java.lang.Object r3, java.lang.String r4) {
            r1 = this;
            com.bytedance.msdk.cw.r.j$1 r0 = new com.bytedance.msdk.cw.r.j$1
            r0.<init>(r1)
            super.j(r2, r3, r4, r0)
            return
    }

    @Override // com.bytedance.msdk.cw.r.xt, com.bytedance.msdk.cw.xt.j.j
    public void ae() {
            r1 = this;
            com.bytedance.msdk.api.r.j.m.xt r0 = r1.kt
            if (r0 == 0) goto L7
            r0.j()
        L7:
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
            r7.tj = r0
            r7.kt = r0
            return
    }

    public void j(android.app.Activity r2) {
            r1 = this;
            r0 = 0
            r1.j(r2, r0, r0)
            return
    }

    @Override // com.bytedance.msdk.cw.r.r
    public void j(android.app.Activity r1, java.lang.Object r2, java.lang.String r3) {
            r0 = this;
            if (r1 != 0) goto La
            java.lang.String r1 = "TTMediationSDK"
            java.lang.String r2 = "activity can not be null !"
            com.bytedance.msdk.j.up.cw.r(r1, r2)
            return
        La:
            r0.xt(r1, r2, r3)
            com.bytedance.msdk.xt.cw r1 = r0.r
            r0.j(r1)
            return
    }

    public void j(com.bytedance.msdk.api.j.xt r1, com.bytedance.msdk.api.r.j.m.xt r2) {
            r0 = this;
            super.xt(r1)
            r0.m = r1
            r0.kt = r2
            com.bytedance.msdk.j.xt.xt r1 = r0.j
            r0.g = r1
            r0.g()
            return
    }

    public void j(com.bytedance.msdk.api.r.j.m.j r1) {
            r0 = this;
            r0.tj = r1
            return
    }

    @Override // com.bytedance.msdk.cw.r.r, com.bytedance.msdk.cw.r.oq
    public void j(com.bytedance.msdk.xt.cw r3, android.app.Activity r4, java.lang.Object r5, java.lang.String r6) {
            r2 = this;
            if (r3 == 0) goto L19
            int r0 = r3.rh()
            r1 = 1
            if (r0 != r1) goto Le
            com.bytedance.msdk.j.xt.cw r0 = r2.xt
            r2.g = r0
            goto L19
        Le:
            int r0 = r3.rh()
            r1 = 2
            if (r0 != r1) goto L19
            com.bytedance.msdk.j.xt.xt r0 = r2.j
            r2.g = r0
        L19:
            super.j(r3, r4, r5, r6)
            return
    }

    @Override // com.bytedance.msdk.cw.r.xt, com.bytedance.msdk.cw.xt.j.j
    public void tl() {
            r1 = this;
            com.bytedance.msdk.api.r.j.m.xt r0 = r1.kt
            if (r0 == 0) goto L7
            r0.xt()
        L7:
            return
    }

    @Override // com.bytedance.msdk.cw.r.xt, com.bytedance.msdk.cw.xt.j.j
    public void xt(com.bytedance.msdk.api.j r2) {
            r1 = this;
            com.bytedance.msdk.api.r.j.m.xt r0 = r1.kt
            if (r0 == 0) goto L7
            r0.j(r2)
        L7:
            return
    }
}
