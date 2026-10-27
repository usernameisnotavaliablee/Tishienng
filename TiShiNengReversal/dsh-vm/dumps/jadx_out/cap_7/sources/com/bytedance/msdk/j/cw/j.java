package com.bytedance.msdk.j.cw;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class j implements com.bytedance.msdk.j.j.r {
    private com.bytedance.msdk.j.cw.cw j;

    public j() {
            r0 = this;
            r0.<init>()
            return
    }

    private void g() {
            r3 = this;
            com.bytedance.msdk.j.cw.cw r0 = r3.j
            boolean r0 = r0.ae()
            if (r0 == 0) goto Lb
            java.lang.String r0 = "0"
            goto Ld
        Lb:
            java.lang.String r0 = "1"
        Ld:
            java.lang.String r1 = com.bytedance.msdk.j.cw.xt.j()
            java.lang.String r2 = "personal_ads_type"
            java.lang.String r0 = com.bytedance.msdk.j.cw.xt.j(r1, r2, r0)
            com.bytedance.msdk.j.cw.xt.xt(r0)
            return
    }

    private void tl() {
            r0 = this;
            r0.g()
            return
    }

    @Override // com.bytedance.msdk.j.j.r
    public void ae() {
            r0 = this;
            return
    }

    @Override // com.bytedance.msdk.j.j.r
    public java.lang.String cw() {
            r1 = this;
            java.lang.String r0 = com.bytedance.sdk.gromore.init.j.r()
            return r0
    }

    @Override // com.bytedance.msdk.j.j.r
    public int j(com.bytedance.msdk.api.r.cw r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.bytedance.msdk.j.j.r
    public java.lang.String j() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.xt()
            r0.append(r1)
            java.lang.String r1 = ".0"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.bytedance.msdk.j.j.r
    public java.lang.String j(android.content.Context r18, java.util.Map<java.lang.String, java.lang.Object> r19) {
            r17 = this;
            r0 = r18
            r1 = r19
            boolean r2 = com.bytedance.sdk.gromore.init.j.up()
            if (r2 != 0) goto Ld
            java.lang.String r0 = ""
            return r0
        Ld:
            r2 = 0
            if (r1 == 0) goto L25e
            java.lang.String r3 = com.bytedance.msdk.j.j.j.j
            java.lang.Object r3 = r1.get(r3)
            java.lang.String r4 = com.bytedance.msdk.j.j.j.r
            java.lang.Object r4 = r1.get(r4)
            boolean r5 = r4 instanceof java.lang.String
            if (r5 == 0) goto L24
            java.lang.String r4 = (java.lang.String) r4
            r7 = r4
            goto L25
        L24:
            r7 = r2
        L25:
            java.lang.String r4 = com.bytedance.msdk.j.j.j.m
            java.lang.Object r4 = r1.get(r4)
            boolean r5 = r4 instanceof java.lang.String
            if (r5 == 0) goto L33
            java.lang.String r4 = (java.lang.String) r4
            r8 = r4
            goto L34
        L33:
            r8 = r2
        L34:
            java.lang.String r4 = com.bytedance.msdk.j.j.j.cw
            java.lang.Object r4 = r1.get(r4)
            boolean r5 = r4 instanceof java.lang.Integer
            if (r5 == 0) goto L45
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            goto L46
        L45:
            r4 = 0
        L46:
            boolean r5 = r3 instanceof com.bytedance.msdk.api.j.xt
            if (r5 == 0) goto L25e
            r5 = r3
            com.bytedance.msdk.api.j.xt r5 = (com.bytedance.msdk.api.j.xt) r5
            int r2 = r5.f()
            r3 = 10
            r12 = 9
            r13 = 3
            r14 = 8
            r15 = 7
            r6 = 2
            r9 = 5
            r10 = 1
            if (r2 != r3) goto L68
            if (r4 != r10) goto L63
            r2 = 2
        L61:
            r3 = 2
            goto L8a
        L63:
            if (r4 != r6) goto L61
        L65:
            r2 = 8
            goto L61
        L68:
            r3 = 4
            if (r2 != r10) goto L73
            if (r4 != r13) goto L6f
        L6d:
            r2 = 1
            goto L61
        L6f:
            if (r4 != r3) goto L61
        L71:
            r2 = 5
            goto L61
        L73:
            if (r2 != r15) goto L7d
            r3 = 6
            if (r4 != r3) goto L7a
            r2 = 7
            goto L61
        L7a:
            if (r4 != r15) goto L61
            goto L65
        L7d:
            if (r2 != r9) goto L61
            if (r4 != r3) goto L82
            goto L71
        L82:
            if (r4 != r9) goto L87
            r2 = 9
            goto L61
        L87:
            if (r4 != r13) goto L61
            goto L6d
        L8a:
            java.lang.String r6 = r5.v()
            r4 = 5
            r9 = 0
            r16 = 1
            r10 = 1
            r11 = 1
            com.bytedance.sdk.openadsdk.i.cw.cw.xt$j r6 = com.bytedance.msdk.j.cw.xt.j(r5, r6, r7, r8, r9, r10)
            com.bytedance.sdk.openadsdk.i.cw.cw.xt$j r7 = r6.ae(r2)
            int r8 = r5.rn()
            com.bytedance.sdk.openadsdk.i.cw.cw.xt$j r7 = r7.r(r8)
            java.lang.String r8 = r5.gq()
            com.bytedance.sdk.openadsdk.i.cw.cw.xt$j r7 = r7.m(r8)
            java.lang.String r8 = r5.la()
            r7.up(r8)
            java.lang.String r7 = com.bytedance.msdk.j.j.j.xt
            java.lang.Object r1 = r1.get(r7)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 != 0) goto Lbf
            r1 = 0
            goto Lc3
        Lbf:
            int r1 = r1.intValue()
        Lc3:
            r7 = 1149698048(0x44870000, float:1080.0)
            r8 = 0
            if (r2 == r13) goto L1e3
            if (r2 == r15) goto L1e3
            if (r2 != r14) goto Lce
            goto L1e3
        Lce:
            r9 = 640(0x280, float:8.97E-43)
            r10 = 340(0x154, float:4.76E-43)
            if (r2 == r11) goto L16f
            if (r2 != r3) goto Ld8
            goto L16f
        Ld8:
            if (r2 == r4) goto Lf1
            if (r2 != r12) goto Ldd
            goto Lf1
        Ldd:
            com.bytedance.sdk.openadsdk.i.cw.cw.xt$j r0 = r6.j(r10)
            r0.xt(r9)
            r0 = 1135214592(0x43aa0000, float:340.0)
            com.bytedance.sdk.openadsdk.i.cw.cw.xt$j r0 = r6.j(r0)
            r5 = 1142947840(0x44200000, float:640.0)
            r0.xt(r5)
            goto L23f
        Lf1:
            int r12 = r5.a()
            r6.cw(r12)
            float r12 = r5.ws()
            int r12 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r12 <= 0) goto L114
            float r12 = r5.az()
            int r12 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r12 > 0) goto L114
            float r0 = r5.ws()
            com.bytedance.sdk.openadsdk.i.cw.cw.xt$j r0 = r6.j(r0)
            r0.xt(r8)
            goto L148
        L114:
            float r12 = r5.ws()
            int r12 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r12 <= 0) goto L134
            float r12 = r5.az()
            int r8 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r8 <= 0) goto L134
            float r0 = r5.ws()
            com.bytedance.sdk.openadsdk.i.cw.cw.xt$j r0 = r6.j(r0)
            float r7 = r5.az()
            r0.xt(r7)
            goto L148
        L134:
            int r7 = com.bytedance.msdk.j.up.ae.j(r0, r7)
            float r7 = (float) r7
            com.bytedance.sdk.openadsdk.i.cw.cw.xt$j r7 = r6.j(r7)
            r8 = 1144750080(0x443b8000, float:750.0)
            int r0 = com.bytedance.msdk.j.up.ae.j(r0, r8)
            float r0 = (float) r0
            r7.xt(r0)
        L148:
            int r0 = r5.s()
            if (r0 <= 0) goto L166
            int r0 = r5.ch()
            if (r0 > 0) goto L155
            goto L166
        L155:
            int r0 = r5.ch()
            com.bytedance.sdk.openadsdk.i.cw.cw.xt$j r0 = r6.j(r0)
            int r5 = r5.s()
            r0.xt(r5)
            goto L23f
        L166:
            com.bytedance.sdk.openadsdk.i.cw.cw.xt$j r0 = r6.j(r9)
            r0.xt(r10)
            goto L23f
        L16f:
            float r12 = r5.ws()
            int r12 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r12 <= 0) goto L18b
            float r12 = r5.az()
            int r12 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r12 > 0) goto L18b
            float r0 = r5.ws()
            com.bytedance.sdk.openadsdk.i.cw.cw.xt$j r0 = r6.j(r0)
            r0.xt(r8)
            goto L1be
        L18b:
            float r12 = r5.ws()
            int r12 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r12 <= 0) goto L1ab
            float r12 = r5.az()
            int r8 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r8 <= 0) goto L1ab
            float r0 = r5.ws()
            com.bytedance.sdk.openadsdk.i.cw.cw.xt$j r0 = r6.j(r0)
            float r7 = r5.az()
            r0.xt(r7)
            goto L1be
        L1ab:
            int r7 = com.bytedance.msdk.j.up.ae.j(r0, r7)
            float r7 = (float) r7
            com.bytedance.sdk.openadsdk.i.cw.cw.xt$j r7 = r6.j(r7)
            r8 = 1142292480(0x44160000, float:600.0)
            int r0 = com.bytedance.msdk.j.up.ae.j(r0, r8)
            float r0 = (float) r0
            r7.xt(r0)
        L1be:
            int r0 = r5.ch()
            if (r0 <= 0) goto L1db
            int r0 = r5.s()
            if (r0 > 0) goto L1cb
            goto L1db
        L1cb:
            int r0 = r5.ch()
            com.bytedance.sdk.openadsdk.i.cw.cw.xt$j r0 = r6.j(r0)
            int r5 = r5.s()
            r0.xt(r5)
            goto L23f
        L1db:
            com.bytedance.sdk.openadsdk.i.cw.cw.xt$j r0 = r6.j(r9)
            r0.xt(r10)
            goto L23f
        L1e3:
            float r9 = r5.ws()
            int r9 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r9 <= 0) goto L204
            float r9 = r5.az()
            int r8 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r8 > 0) goto L1f4
            goto L204
        L1f4:
            float r0 = r5.ws()
            com.bytedance.sdk.openadsdk.i.cw.cw.xt$j r0 = r6.j(r0)
            float r7 = r5.az()
            r0.xt(r7)
            goto L217
        L204:
            int r7 = com.bytedance.msdk.j.up.ae.j(r0, r7)
            float r7 = (float) r7
            com.bytedance.sdk.openadsdk.i.cw.cw.xt$j r7 = r6.j(r7)
            r8 = 1156579328(0x44f00000, float:1920.0)
            int r0 = com.bytedance.msdk.j.up.ae.j(r0, r8)
            float r0 = (float) r0
            r7.xt(r0)
        L217:
            int r0 = r5.ch()
            if (r0 <= 0) goto L234
            int r0 = r5.s()
            if (r0 > 0) goto L224
            goto L234
        L224:
            int r0 = r5.ch()
            com.bytedance.sdk.openadsdk.i.cw.cw.xt$j r0 = r6.j(r0)
            int r5 = r5.s()
            r0.xt(r5)
            goto L23f
        L234:
            r0 = 1080(0x438, float:1.513E-42)
            com.bytedance.sdk.openadsdk.i.cw.cw.xt$j r0 = r6.j(r0)
            r5 = 1920(0x780, float:2.69E-42)
            r0.xt(r5)
        L23f:
            if (r1 == 0) goto L248
            if (r1 != r11) goto L248
            if (r2 != r4) goto L248
            r6.up(r2)
        L248:
            if (r2 == r11) goto L24c
            if (r2 != r3) goto L24f
        L24c:
            r6.up(r2)
        L24f:
            com.bytedance.sdk.openadsdk.i.cw.cw.xt r0 = r6.j()
            com.bytedance.sdk.openadsdk.core.s r1 = com.bytedance.sdk.openadsdk.core.v.j()
            r2 = -1
            r3 = 0
            java.lang.String r0 = r1.j(r0, r3, r2)
            return r0
        L25e:
            return r2
    }

    @Override // com.bytedance.msdk.j.j.xt
    public void j(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull java.util.Map<java.lang.String, java.lang.Object> r2, @androidx.annotation.NonNull com.bytedance.msdk.j.j.cw r3) {
            r0 = this;
            com.bytedance.msdk.core.j r1 = com.bytedance.msdk.core.j.qv()
            com.bytedance.msdk.j.cw.cw r1 = r1.xt()
            r0.j = r1
            r0.g()
            r3.j()
            return
    }

    @Override // com.bytedance.msdk.j.j.r
    public void j(com.bytedance.msdk.api.r.ws r1, android.util.SparseArray<java.lang.Object> r2) {
            r0 = this;
            com.bytedance.msdk.j.cw.cw r1 = r0.j
            r1.xt(r2)
            r0.tl()
            return
    }

    @Override // com.bytedance.msdk.j.j.r
    public void j(java.util.Map<java.lang.String, java.lang.Object> r2) {
            r1 = this;
            if (r2 != 0) goto L3
            goto L1b
        L3:
            java.lang.String r0 = com.bytedance.msdk.j.j.j.up
            java.lang.Object r2 = r2.get(r0)
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 == 0) goto L14
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            goto L15
        L14:
            r2 = 0
        L15:
            if (r2 == 0) goto L1c
            r0 = 1
            if (r2 != r0) goto L1b
            goto L1c
        L1b:
            return
        L1c:
            com.bytedance.sdk.gromore.init.j.j(r2)
            return
    }

    @Override // com.bytedance.msdk.j.j.r
    public int m() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.bytedance.msdk.j.j.r
    public void r() {
            r0 = this;
            return
    }

    @Override // com.bytedance.msdk.j.j.r
    public long up() {
            r2 = this;
            r0 = 0
            return r0
    }

    @Override // com.bytedance.msdk.j.j.r
    public java.lang.String xt() {
            r1 = this;
            java.lang.String r0 = com.bytedance.sdk.gromore.init.j.cw()
            return r0
    }

    @Override // com.bytedance.msdk.j.j.r
    public java.util.Map<java.lang.String, java.lang.Object> xt(android.content.Context r1, java.util.Map<java.lang.String, java.lang.Object> r2) {
            r0 = this;
            r1 = 0
            return r1
    }
}
