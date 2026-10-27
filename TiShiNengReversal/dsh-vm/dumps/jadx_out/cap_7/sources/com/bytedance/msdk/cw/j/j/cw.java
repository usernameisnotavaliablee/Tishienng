package com.bytedance.msdk.cw.j.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public abstract class cw extends com.bytedance.msdk.xt.cw {
    protected com.bytedance.msdk.cw.cw.xt.j.j.xt g;
    protected java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> oq;

    public cw(com.bytedance.msdk.cw.cw.xt.j.j.xt r1, java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r2) {
            r0 = this;
            r0.<init>()
            r0.g = r1
            r0.oq = r2
            return
    }

    @Override // com.bytedance.msdk.xt.cw
    public void av() {
            r1 = this;
            super.av()
            com.bytedance.msdk.cw.cw.xt.j.j.xt r0 = r1.g
            if (r0 == 0) goto La
            r0.qv()
        La:
            return
    }

    @Override // com.bytedance.msdk.xt.cw
    public void i() {
            r1 = this;
            super.i()
            com.bytedance.msdk.cw.cw.xt.j.j.xt r0 = r1.g
            if (r0 == 0) goto La
            r0.vl()
        La:
            return
    }

    @Override // com.bytedance.msdk.xt.cw
    public void j(java.util.Map<java.lang.String, java.lang.Object> r8) {
            r7 = this;
            if (r8 != 0) goto L3
            return
        L3:
            r0 = 10001(0x2711, float:1.4014E-41)
            java.lang.String r1 = "bidding_lose_reason_NUM"
            java.lang.Object r8 = r8.get(r1)     // Catch: java.lang.Exception -> L1c
            boolean r1 = r8 instanceof java.lang.Integer     // Catch: java.lang.Exception -> L1c
            if (r1 == 0) goto L16
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch: java.lang.Exception -> L1c
            int r8 = r8.intValue()     // Catch: java.lang.Exception -> L1c
            goto L17
        L16:
            r8 = 0
        L17:
            if (r8 <= 0) goto L1a
            r0 = r8
        L1a:
            r5 = r0
            goto L1e
        L1c:
            r5 = 10001(0x2711, float:1.4014E-41)
        L1e:
            r3 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r6 = 0
            r2 = 0
            r1 = r7
            r1.j(r2, r3, r5, r6)
            return
    }

    public void j(boolean r7, double r8, int r10, java.util.Map<java.lang.String, java.lang.Object> r11) {
            r6 = this;
            com.bytedance.msdk.cw.cw.xt.j.j.xt r0 = r6.g
            if (r0 == 0) goto Lb
            r1 = r7
            r2 = r8
            r4 = r10
            r5 = r11
            r0.j(r1, r2, r4, r5)
        Lb:
            return
    }

    @Override // com.bytedance.msdk.xt.cw
    public java.lang.Integer m() {
            r1 = this;
            com.bytedance.msdk.cw.cw.xt.j.j.xt r0 = r1.g
            if (r0 == 0) goto L9
            java.lang.Integer r0 = r0.oq()
            return r0
        L9:
            java.lang.Integer r0 = super.m()
            return r0
    }

    @Override // com.bytedance.msdk.xt.cw
    public boolean up() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.bytedance.msdk.xt.cw
    public void w() {
            r1 = this;
            super.w()
            com.bytedance.msdk.cw.cw.xt.j.j.xt r0 = r1.g
            if (r0 == 0) goto La
            r0.jy()
        La:
            return
    }

    @Override // com.bytedance.msdk.xt.cw
    public void xt(java.util.Map<java.lang.String, java.lang.Object> r7) {
            r6 = this;
            double r2 = r6.t()
            r4 = -1
            r5 = 0
            r1 = 1
            r0 = r6
            r0.j(r1, r2, r4, r5)
            return
    }
}
