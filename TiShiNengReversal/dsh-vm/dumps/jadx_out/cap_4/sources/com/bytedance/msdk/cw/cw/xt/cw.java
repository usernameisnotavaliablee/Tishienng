package com.bytedance.msdk.cw.cw.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class cw implements com.bytedance.msdk.cw.cw.xt.j, com.bytedance.msdk.cw.j.xt {
    private long ae;
    private com.bytedance.msdk.api.j.xt cw;
    private com.bytedance.msdk.cw.m.xt.xt j;

    /* renamed from: m, reason: collision with root package name */
    private long f2314m;

    /* renamed from: r, reason: collision with root package name */
    private com.bytedance.msdk.cw.j.j f2315r;
    private volatile long up;
    private com.bytedance.msdk.cw.m.j.xt xt;



    public cw() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f2315r = r0
            r0 = -1
            r2.up = r0
            return
    }

    static /* synthetic */ void cw(com.bytedance.msdk.cw.cw.xt.cw r0) {
            r0.j()
            return
    }

    private void cw(java.util.List<com.bytedance.msdk.xt.cw> r3) {
            r2 = this;
            com.bytedance.msdk.cw.m.xt.xt r0 = r2.j
            if (r0 == 0) goto Lb
            com.bytedance.msdk.core.oq.oq r1 = r0.tl()
            r0.j(r3, r1)
        Lb:
            com.bytedance.msdk.cw.cw.xt.cw$2 r3 = new com.bytedance.msdk.cw.cw.xt.cw$2
            r3.<init>(r2)
            r2.j(r3)
            return
    }

    static /* synthetic */ com.bytedance.msdk.cw.m.xt.xt j(com.bytedance.msdk.cw.cw.xt.cw r0) {
            com.bytedance.msdk.cw.m.xt.xt r0 = r0.j
            return r0
    }

    private java.lang.String j(java.lang.String r2) {
            r1 = this;
            com.bytedance.msdk.m.xt.xt r0 = com.bytedance.msdk.m.xt.xt.j()
            com.bytedance.msdk.j.j.r r2 = r0.j(r2)
            if (r2 == 0) goto Lf
            java.lang.String r2 = r2.xt()
            return r2
        Lf:
            r2 = 0
            return r2
    }

    private void j() {
            r1 = this;
            com.bytedance.msdk.cw.m.xt.xt r0 = r1.j
            if (r0 == 0) goto L7
            r0.g()
        L7:
            return
    }

    private void j(int r18, com.bytedance.msdk.xt.cw r19, int r20, java.lang.String r21, long r22) {
            r17 = this;
            r0 = r17
            com.bytedance.msdk.cw.m.j.xt r1 = r0.xt
            if (r1 == 0) goto L10a
            com.bytedance.msdk.api.j.xt r1 = r0.cw
            if (r1 == 0) goto L10a
            com.bytedance.msdk.cw.m.xt.xt r1 = r0.j
            if (r1 == 0) goto L10a
            com.bytedance.msdk.core.oq.oq r1 = r1.tl()
            if (r1 != 0) goto L16
            goto L10a
        L16:
            com.bytedance.msdk.cw.m.xt.xt r1 = r0.j
            com.bytedance.msdk.core.oq.oq r1 = r1.tl()
            r2 = 20000(0x4e20, float:2.8026E-41)
            r4 = r18
            if (r4 != r2) goto L26
            java.lang.String r2 = "load success"
        L24:
            r5 = r2
            goto L29
        L26:
            java.lang.String r2 = "请求成功，但无广告可用"
            goto L24
        L29:
            com.bytedance.msdk.cw.m.j.xt r2 = r0.xt
            com.bytedance.msdk.core.oq.g r2 = r2.wq()
            boolean r11 = r2.f2223m
            com.bytedance.msdk.cw.m.xt.xt r2 = r0.j
            boolean r2 = r2.v()
            if (r2 != 0) goto L61
            if (r19 == 0) goto L61
            long r2 = r0.up
            r6 = -1
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 == 0) goto L4b
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r6 = r0.up
            long r6 = r2 - r6
        L4b:
            r15 = r6
            long r6 = r0.f2314m
            com.bytedance.msdk.api.j.xt r8 = r0.cw
            com.bytedance.msdk.cw.m.xt.xt r2 = r0.j
            int r9 = r2.cw()
            r3 = r19
            r10 = r20
            r12 = r21
            r13 = r22
            com.bytedance.msdk.up.m.j(r3, r4, r5, r6, r8, r9, r10, r11, r12, r13, r15)
        L61:
            boolean r2 = com.bytedance.msdk.xt.xt.xt
            java.lang.String r3 = "] AdType["
            java.lang.String r4 = "AdNetWorkName["
            java.lang.String r5 = "fill"
            java.lang.String r6 = "TTMediationSDK"
            if (r2 == 0) goto Lce
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.bytedance.msdk.api.j.xt r7 = r0.cw
            java.lang.String r7 = r7.v()
            java.lang.String r5 = com.bytedance.msdk.j.up.up.j(r7, r5)
            r2.append(r5)
            r2.append(r4)
            java.lang.String r4 = r1.az()
            r2.append(r4)
            java.lang.String r4 = "] AdUnitId["
            r2.append(r4)
            java.lang.String r4 = r1.w()
            r2.append(r4)
            r2.append(r3)
            com.bytedance.msdk.api.j.xt r3 = r0.cw
            int r3 = r3.f()
            int r4 = r1.m()
            java.lang.String r3 = com.bytedance.msdk.xt.j.j(r3, r4, r1)
            r2.append(r3)
            java.lang.String r3 = "] 请求成功 (loadSort="
            r2.append(r3)
            int r3 = r1.x()
            r2.append(r3)
            java.lang.String r3 = ",showSort="
            r2.append(r3)
            int r1 = r1.ch()
            r2.append(r1)
            java.lang.String r1 = ")"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.bytedance.msdk.j.up.cw.xt(r6, r1)
            return
        Lce:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.bytedance.msdk.api.j.xt r7 = r0.cw
            java.lang.String r7 = r7.v()
            java.lang.String r5 = com.bytedance.msdk.j.up.up.j(r7, r5)
            r2.append(r5)
            r2.append(r4)
            java.lang.String r4 = r1.az()
            r2.append(r4)
            r2.append(r3)
            com.bytedance.msdk.api.j.xt r3 = r0.cw
            int r3 = r3.f()
            int r4 = r1.m()
            java.lang.String r1 = com.bytedance.msdk.xt.j.j(r3, r4, r1)
            r2.append(r1)
            java.lang.String r1 = "] 请求成功"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.bytedance.msdk.j.up.cw.xt(r6, r1)
        L10a:
            return
    }

    private void j(com.bytedance.msdk.api.j r17, boolean r18) {
            r16 = this;
            r0 = r16
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = r0.ae
            long r1 = r1 - r3
            r0.f2314m = r1
            com.bytedance.msdk.cw.m.xt.xt r1 = r0.j
            if (r1 == 0) goto L20b
            com.bytedance.msdk.core.oq.oq r1 = r1.tl()
            if (r1 == 0) goto L20b
            long r1 = java.lang.System.currentTimeMillis()
            com.bytedance.msdk.cw.m.xt.xt r3 = r0.j
            com.bytedance.msdk.core.oq.oq r3 = r3.tl()
            boolean r3 = com.bytedance.msdk.tl.mi.j(r3)
            r15 = 0
            if (r3 == 0) goto L32
            java.lang.String r3 = com.bytedance.msdk.tl.mi.xt()
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r1
            r12 = r3
        L30:
            r13 = r4
            goto L36
        L32:
            r4 = -1
            r12 = r15
            goto L30
        L36:
            com.bytedance.msdk.cw.m.xt.xt r1 = r0.j
            boolean r1 = r1.v()
            if (r1 != 0) goto L6e
            if (r18 == 0) goto L6e
            com.bytedance.msdk.api.j.xt r2 = r0.cw
            com.bytedance.msdk.cw.m.xt.xt r1 = r0.j
            com.bytedance.msdk.core.oq.oq r3 = r1.tl()
            com.bytedance.msdk.cw.m.xt.xt r1 = r0.j
            int r4 = r1.cw()
            com.bytedance.msdk.cw.m.xt.xt r1 = r0.j
            int r5 = r1.ae()
            com.bytedance.msdk.cw.m.xt.xt r1 = r0.j
            int r6 = r1.m()
            com.bytedance.msdk.cw.m.xt.xt r1 = r0.j
            java.lang.String r1 = r1.jy()
            java.lang.String r7 = r0.j(r1)
            long r8 = r0.f2314m
            r10 = 0
            r11 = 0
            r1 = r17
            com.bytedance.msdk.up.m.j(r1, r2, r3, r4, r5, r6, r7, r8, r10, r11, r12, r13)
            goto L99
        L6e:
            com.bytedance.msdk.api.j.xt r2 = r0.cw
            com.bytedance.msdk.cw.m.xt.xt r1 = r0.j
            com.bytedance.msdk.core.oq.oq r3 = r1.tl()
            com.bytedance.msdk.cw.m.xt.xt r1 = r0.j
            int r4 = r1.cw()
            com.bytedance.msdk.cw.m.xt.xt r1 = r0.j
            int r5 = r1.ae()
            com.bytedance.msdk.cw.m.xt.xt r1 = r0.j
            int r6 = r1.m()
            com.bytedance.msdk.cw.m.xt.xt r1 = r0.j
            java.lang.String r1 = r1.jy()
            java.lang.String r7 = r0.j(r1)
            long r8 = r0.f2314m
            r1 = r17
            com.bytedance.msdk.up.m.j(r1, r2, r3, r4, r5, r6, r7, r8)
        L99:
            com.bytedance.msdk.cw.m.xt.xt r2 = r0.j
            com.bytedance.msdk.core.oq.oq r2 = r2.tl()
            if (r1 == 0) goto L20d
            com.bytedance.msdk.api.j.xt r3 = r0.cw
            if (r3 == 0) goto L172
            boolean r3 = com.bytedance.msdk.xt.xt.xt
            java.lang.String r4 = ",msg="
            java.lang.String r5 = "] AdType["
            java.lang.String r6 = "AdNetWorkName["
            java.lang.String r7 = "fill_fail"
            java.lang.String r8 = ""
            java.lang.String r9 = "TTMediationSDK"
            if (r3 == 0) goto L126
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            com.bytedance.msdk.api.j.xt r10 = r0.cw
            if (r10 != 0) goto Lbf
            goto Lc3
        Lbf:
            java.lang.String r8 = r10.v()
        Lc3:
            java.lang.String r7 = com.bytedance.msdk.j.up.up.j(r8, r7)
            r3.append(r7)
            r3.append(r6)
            java.lang.String r6 = r2.az()
            r3.append(r6)
            java.lang.String r6 = "] AdUnitId["
            r3.append(r6)
            java.lang.String r6 = r2.w()
            r3.append(r6)
            r3.append(r5)
            com.bytedance.msdk.api.j.xt r5 = r0.cw
            int r5 = r5.f()
            int r6 = r2.m()
            java.lang.String r5 = com.bytedance.msdk.xt.j.j(r5, r6, r2)
            r3.append(r5)
            java.lang.String r5 = "] 请求失败 (loadSort="
            r3.append(r5)
            int r5 = r2.x()
            r3.append(r5)
            java.lang.String r5 = ",showSort="
            r3.append(r5)
            int r2 = r2.ch()
            r3.append(r2)
            java.lang.String r2 = "),error="
            r3.append(r2)
            int r2 = r1.cw
            r3.append(r2)
            r3.append(r4)
            java.lang.String r2 = r1.f2149r
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.bytedance.msdk.j.up.cw.r(r9, r2)
            goto L172
        L126:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            com.bytedance.msdk.api.j.xt r10 = r0.cw
            if (r10 != 0) goto L130
            goto L134
        L130:
            java.lang.String r8 = r10.v()
        L134:
            java.lang.String r7 = com.bytedance.msdk.j.up.up.j(r8, r7)
            r3.append(r7)
            r3.append(r6)
            java.lang.String r6 = r2.az()
            r3.append(r6)
            r3.append(r5)
            com.bytedance.msdk.api.j.xt r5 = r0.cw
            int r5 = r5.f()
            int r6 = r2.m()
            java.lang.String r2 = com.bytedance.msdk.xt.j.j(r5, r6, r2)
            r3.append(r2)
            java.lang.String r2 = "] 请求失败 error="
            r3.append(r2)
            int r2 = r1.cw
            r3.append(r2)
            r3.append(r4)
            java.lang.String r2 = r1.f2149r
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.bytedance.msdk.j.up.cw.r(r9, r2)
        L172:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r3 = r1.cw
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = r1.f2149r
            com.bytedance.msdk.cw.m.xt.xt r4 = r0.j
            com.bytedance.msdk.core.oq.oq r4 = r4.tl()
            java.lang.String r4 = r4.az()
            java.lang.String r3 = com.bytedance.msdk.j.j.j(r4, r3)
            com.bytedance.msdk.core.tl.ws r4 = com.bytedance.msdk.core.tl.ws.j()
            com.bytedance.msdk.api.j.xt r5 = r0.cw
            if (r5 != 0) goto L19a
            r5 = r15
            goto L19e
        L19a:
            java.lang.String r5 = r5.v()
        L19e:
            com.bytedance.msdk.cw.m.xt.xt r6 = r0.j
            com.bytedance.msdk.core.oq.oq r6 = r6.tl()
            java.lang.String r6 = r6.i()
            boolean r4 = r4.j(r5, r6)
            if (r4 == 0) goto L1e1
            com.bytedance.msdk.core.tl.ws r4 = com.bytedance.msdk.core.tl.ws.j()
            com.bytedance.msdk.api.j.xt r5 = r0.cw
            if (r5 != 0) goto L1b7
            goto L1bb
        L1b7:
            java.lang.String r15 = r5.v()
        L1bb:
            com.bytedance.msdk.cw.m.xt.xt r5 = r0.j
            com.bytedance.msdk.core.oq.oq r5 = r5.tl()
            java.lang.String r5 = r5.az()
            com.bytedance.msdk.cw.m.xt.xt r6 = r0.j
            com.bytedance.msdk.core.oq.oq r6 = r6.tl()
            java.lang.String r6 = r6.w()
            com.bytedance.msdk.cw.m.xt.xt r7 = r0.j
            com.bytedance.msdk.core.oq.oq r7 = r7.tl()
            java.lang.String r7 = r7.az()
            java.lang.String r2 = com.bytedance.msdk.j.j.j(r7, r2, r3)
            r4.j(r15, r5, r6, r2)
            goto L20d
        L1e1:
            com.bytedance.msdk.core.tl.cw r4 = com.bytedance.msdk.core.tl.cw.j()
            com.bytedance.msdk.cw.m.xt.xt r5 = r0.j
            com.bytedance.msdk.core.oq.oq r5 = r5.tl()
            java.lang.String r5 = r5.az()
            com.bytedance.msdk.cw.m.xt.xt r6 = r0.j
            com.bytedance.msdk.core.oq.oq r6 = r6.tl()
            java.lang.String r6 = r6.w()
            com.bytedance.msdk.cw.m.xt.xt r7 = r0.j
            com.bytedance.msdk.core.oq.oq r7 = r7.tl()
            java.lang.String r7 = r7.az()
            java.lang.String r2 = com.bytedance.msdk.j.j.j(r7, r2, r3)
            r4.j(r5, r6, r2)
            goto L20d
        L20b:
            r1 = r17
        L20d:
            r16.xt(r17)
            return
    }

    private void j(com.bytedance.msdk.cw.m.xt.xt r15, com.bytedance.msdk.cw.m.j.xt r16, com.bytedance.msdk.api.j r17, java.lang.String r18) {
            r14 = this;
            if (r15 == 0) goto L65
            if (r16 == 0) goto L65
            com.bytedance.msdk.core.oq.oq r0 = r15.tl()
            if (r0 != 0) goto Lb
            goto L65
        Lb:
            com.bytedance.msdk.core.oq.oq r1 = r15.tl()
            boolean r0 = android.text.TextUtils.isEmpty(r18)
            if (r0 == 0) goto L23
            com.bytedance.msdk.core.up.j.j r0 = com.bytedance.msdk.core.up.j.j.j()
            java.lang.String r2 = r1.w()
            java.lang.String r0 = r0.j(r2)
            r3 = r0
            goto L25
        L23:
            r3 = r18
        L25:
            boolean r0 = r1.h()
            if (r0 != 0) goto L5a
            int r0 = r15.ae()
            r2 = 4
            if (r0 != r2) goto L35
            r0 = 3
            r5 = 3
            goto L37
        L35:
            r0 = 0
            r5 = 0
        L37:
            com.bytedance.msdk.api.j.xt r2 = r14.cw
            boolean r4 = r15.up()
            int r6 = r15.cw()
            int r7 = r15.ae()
            int r8 = r15.m()
            long r10 = r15.r()
            com.bytedance.msdk.core.oq.g r15 = r16.wq()
            boolean r12 = r15.up
            r13 = 0
            r9 = r17
            com.bytedance.msdk.up.m.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            return
        L5a:
            com.bytedance.msdk.core.oq.tl r15 = r1.l()
            if (r15 == 0) goto L65
            com.bytedance.msdk.api.j.xt r15 = r14.cw
            com.bytedance.msdk.up.m.j(r1, r15, r3)
        L65:
            return
    }

    private void j(com.bytedance.msdk.xt.cw r7) {
            r6 = this;
            com.bytedance.msdk.cw.m.j.xt r0 = r6.xt
            if (r0 == 0) goto Ld8
            com.bytedance.msdk.api.j.xt r0 = r6.cw
            if (r0 == 0) goto Ld8
            com.bytedance.msdk.cw.m.xt.xt r0 = r6.j
            if (r0 == 0) goto Ld8
            com.bytedance.msdk.core.oq.oq r0 = r0.tl()
            if (r0 != 0) goto L14
            goto Ld8
        L14:
            com.bytedance.msdk.cw.m.xt.xt r0 = r6.j
            com.bytedance.msdk.core.oq.oq r0 = r0.tl()
            com.bytedance.msdk.cw.m.xt.xt r1 = r6.j
            boolean r1 = r1.v()
            if (r1 != 0) goto L2f
            if (r7 == 0) goto L2f
            com.bytedance.msdk.api.j.xt r1 = r6.cw
            com.bytedance.msdk.cw.m.xt.xt r2 = r6.j
            com.bytedance.msdk.core.oq.oq r2 = r2.tl()
            com.bytedance.msdk.up.m.j(r1, r7, r2)
        L2f:
            boolean r7 = com.bytedance.msdk.xt.xt.xt
            java.lang.String r1 = "] AdType["
            java.lang.String r2 = "AdNetWorkName["
            java.lang.String r3 = "fill"
            java.lang.String r4 = "TTMediationSDK"
            if (r7 == 0) goto L9c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            com.bytedance.msdk.api.j.xt r5 = r6.cw
            java.lang.String r5 = r5.v()
            java.lang.String r3 = com.bytedance.msdk.j.up.up.j(r5, r3)
            r7.append(r3)
            r7.append(r2)
            java.lang.String r2 = r0.az()
            r7.append(r2)
            java.lang.String r2 = "] AdUnitId["
            r7.append(r2)
            java.lang.String r2 = r0.w()
            r7.append(r2)
            r7.append(r1)
            com.bytedance.msdk.api.j.xt r1 = r6.cw
            int r1 = r1.f()
            int r2 = r0.m()
            java.lang.String r1 = com.bytedance.msdk.xt.j.j(r1, r2, r0)
            r7.append(r1)
            java.lang.String r1 = "] 视频缓存成功 (loadSort="
            r7.append(r1)
            int r1 = r0.x()
            r7.append(r1)
            java.lang.String r1 = ",showSort="
            r7.append(r1)
            int r0 = r0.ch()
            r7.append(r0)
            java.lang.String r0 = ")"
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            com.bytedance.msdk.j.up.cw.xt(r4, r7)
            return
        L9c:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            com.bytedance.msdk.api.j.xt r5 = r6.cw
            java.lang.String r5 = r5.v()
            java.lang.String r3 = com.bytedance.msdk.j.up.up.j(r5, r3)
            r7.append(r3)
            r7.append(r2)
            java.lang.String r2 = r0.az()
            r7.append(r2)
            r7.append(r1)
            com.bytedance.msdk.api.j.xt r1 = r6.cw
            int r1 = r1.f()
            int r2 = r0.m()
            java.lang.String r0 = com.bytedance.msdk.xt.j.j(r1, r2, r0)
            r7.append(r0)
            java.lang.String r0 = "] 视频缓存成功 "
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            com.bytedance.msdk.j.up.cw.xt(r4, r7)
        Ld8:
            return
    }

    private void j(java.lang.Runnable r1) {
            r0 = this;
            com.bytedance.msdk.j.up.m.j(r1)
            return
    }

    static /* synthetic */ com.bytedance.msdk.api.j.xt xt(com.bytedance.msdk.cw.cw.xt.cw r0) {
            com.bytedance.msdk.api.j.xt r0 = r0.cw
            return r0
    }

    private java.util.List<com.bytedance.msdk.xt.cw> xt(java.util.List<com.bytedance.msdk.xt.cw> r21) {
            r20 = this;
            r0 = r20
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            boolean r2 = com.bytedance.msdk.tl.p.j(r21)
            if (r2 != 0) goto L13
            r2 = r21
            r1.addAll(r2)
            goto L15
        L13:
            r2 = r21
        L15:
            com.bytedance.msdk.cw.m.xt.xt r3 = r0.j
            if (r3 == 0) goto Lc7
            boolean r3 = com.bytedance.msdk.tl.p.xt(r2)
            if (r3 != 0) goto Lc7
            com.bytedance.msdk.cw.m.xt.xt r3 = r0.j
            boolean r3 = r3.j()
            if (r3 != 0) goto L2f
            com.bytedance.msdk.cw.m.xt.xt r3 = r0.j
            boolean r3 = r3.x()
            if (r3 == 0) goto Lc7
        L2f:
            java.util.Iterator r2 = r2.iterator()
        L33:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lc7
            java.lang.Object r3 = r2.next()
            com.bytedance.msdk.xt.cw r3 = (com.bytedance.msdk.xt.cw) r3
            com.bytedance.msdk.cw.m.xt.xt r4 = r0.j
            com.bytedance.msdk.core.oq.oq r4 = r4.tl()
            com.bytedance.msdk.api.j.xt r5 = r0.cw
            r6 = 1
            com.bytedance.msdk.tl.h.j(r3, r4, r5, r6)
            com.bytedance.msdk.api.j.xt r4 = r0.cw
            double r4 = r4.z()
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L33
            double r6 = r3.t()
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L33
            r1.remove(r3)
            double r4 = r3.t()
            java.lang.String r15 = java.lang.String.valueOf(r4)
            java.lang.String r16 = r3.q()
            long r3 = java.lang.System.currentTimeMillis()
            com.bytedance.msdk.cw.m.xt.xt r5 = r0.j
            com.bytedance.msdk.core.oq.oq r5 = r5.tl()
            boolean r5 = com.bytedance.msdk.tl.mi.j(r5)
            if (r5 == 0) goto L8c
            java.lang.String r5 = com.bytedance.msdk.tl.mi.xt()
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r3
        L87:
            r17 = r5
            r18 = r6
            goto L90
        L8c:
            r5 = 0
            r6 = -1
            goto L87
        L90:
            com.bytedance.msdk.api.j r6 = new com.bytedance.msdk.api.j
            r3 = 50100(0xc3b4, float:7.0205E-41)
            java.lang.String r4 = com.bytedance.msdk.api.j.j(r3)
            r6.<init>(r3, r4)
            com.bytedance.msdk.api.j.xt r7 = r0.cw
            com.bytedance.msdk.cw.m.xt.xt r3 = r0.j
            com.bytedance.msdk.core.oq.oq r8 = r3.tl()
            com.bytedance.msdk.cw.m.xt.xt r3 = r0.j
            int r9 = r3.cw()
            com.bytedance.msdk.cw.m.xt.xt r3 = r0.j
            int r10 = r3.ae()
            com.bytedance.msdk.cw.m.xt.xt r3 = r0.j
            int r11 = r3.m()
            com.bytedance.msdk.cw.m.xt.xt r3 = r0.j
            java.lang.String r3 = r3.jy()
            java.lang.String r12 = r0.j(r3)
            long r13 = r0.f2314m
            com.bytedance.msdk.up.m.j(r6, r7, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18)
            goto L33
        Lc7:
            return r1
    }

    private void xt() {
            r8 = this;
            com.bytedance.msdk.cw.m.xt.xt r0 = r8.j
            com.bytedance.msdk.api.j.xt r1 = r8.cw
            java.lang.String r1 = com.bytedance.msdk.cw.tl.cw.j(r1, r0)
            r0.j(r1)
            com.bytedance.msdk.cw.m.xt.xt r0 = r8.j
            com.bytedance.msdk.cw.m.j.xt r1 = r8.xt
            com.bytedance.msdk.core.oq.xt r1 = r1.vl()
            java.lang.String r1 = r1.rn()
            r0.xt(r1)
            com.bytedance.msdk.cw.m.xt.xt r0 = r8.j
            boolean r0 = r0.oq()
            java.lang.String r1 = ""
            r2 = 0
            if (r0 != 0) goto L4c
            com.bytedance.msdk.cw.m.xt.xt r0 = r8.j
            boolean r0 = r0.qv()
            if (r0 == 0) goto L37
            com.bytedance.msdk.cw.m.xt.xt r0 = r8.j
            com.bytedance.msdk.cw.j.j r0 = com.bytedance.msdk.cw.cw.xt.j.r.j(r0, r8)
            r8.f2315r = r0
            goto L103
        L37:
            com.bytedance.msdk.cw.m.xt.xt r0 = r8.j
            com.bytedance.msdk.core.oq.oq r0 = r0.tl()
            boolean r0 = com.bytedance.msdk.core.ae.cw.j(r0)
            if (r0 == 0) goto L103
            com.bytedance.msdk.cw.cw.xt.j.cw r0 = new com.bytedance.msdk.cw.cw.xt.j.cw
            r0.<init>(r8)
            r8.f2315r = r0
            goto L103
        L4c:
            android.content.Context r0 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.cw.m.xt.xt r3 = r8.j
            if (r3 == 0) goto L59
            java.lang.String r3 = r3.jy()
            goto L5a
        L59:
            r3 = r1
        L5a:
            com.bytedance.msdk.m.xt.j(r0, r3)
            com.bytedance.msdk.cw.m.xt.xt r0 = r8.j
            java.lang.String r0 = r0.jy()
            com.bytedance.msdk.api.r.j.xt.m.j r0 = com.bytedance.msdk.m.xt.j.j(r0)
            if (r0 != 0) goto L86
            com.bytedance.msdk.cw.m.j.xt r0 = r8.xt
            com.bytedance.msdk.xt.cw r0 = r0.qv()
            com.bytedance.msdk.api.j.xt r3 = r8.cw
            com.bytedance.msdk.cw.m.xt.xt r4 = r8.j
            com.bytedance.msdk.core.oq.oq r4 = r4.tl()
            com.bytedance.msdk.api.j r5 = new com.bytedance.msdk.api.j
            r6 = 49014(0xbf76, float:6.8683E-41)
            java.lang.String r7 = "创建自定义广告对象 configuration is null"
            r5.<init>(r6, r7)
            com.bytedance.msdk.up.m.j(r1, r0, r3, r4, r5)
            goto L103
        L86:
            com.bytedance.msdk.ae.j.xt r0 = com.bytedance.msdk.ae.j.xt.j()
            com.bytedance.msdk.cw.m.xt.xt r3 = r8.j
            java.lang.String r3 = r3.jy()
            com.bytedance.msdk.core.oq.j r0 = r0.j(r3)
            r3 = 49013(0xbf75, float:6.8682E-41)
            if (r0 != 0) goto La4
            com.bytedance.msdk.api.j r0 = new com.bytedance.msdk.api.j
            java.lang.String r4 = "创建自定义广告对象 adNetworkConfValue is null"
            r0.<init>(r3, r4)
            com.bytedance.msdk.up.m.j(r1, r2, r2, r2, r0)
            goto L103
        La4:
            com.bytedance.msdk.api.r.j.xt.cw.xt r4 = r0.cw()
            if (r4 != 0) goto Lb5
            com.bytedance.msdk.api.j r0 = new com.bytedance.msdk.api.j
            java.lang.String r4 = "创建自定义广告对象 getGMCustomConfig is null"
            r0.<init>(r3, r4)
            com.bytedance.msdk.up.m.j(r1, r2, r2, r2, r0)
            goto L103
        Lb5:
            com.bytedance.msdk.api.r.j.xt.cw.xt r0 = r0.cw()
            com.bytedance.msdk.cw.m.xt.xt r4 = r8.j
            int r4 = r4.s()
            com.bytedance.msdk.cw.m.xt.xt r5 = r8.j
            int r5 = r5.az()
            com.bytedance.msdk.api.r.j.xt.cw.j r0 = r0.j(r4, r5)
            if (r0 != 0) goto Ld6
            com.bytedance.msdk.api.j r0 = new com.bytedance.msdk.api.j
            java.lang.String r4 = "创建自定义广告对象 adConfig is null"
            r0.<init>(r3, r4)
            com.bytedance.msdk.up.m.j(r1, r2, r2, r2, r0)
            goto L103
        Ld6:
            boolean r4 = com.bytedance.msdk.cw.tl.cw.j(r0)
            if (r4 == 0) goto Le9
            java.lang.String r0 = r0.j()
            com.bytedance.msdk.cw.m.xt.xt r3 = r8.j
            com.bytedance.msdk.cw.j.j r0 = com.bytedance.msdk.cw.cw.xt.j.r.j(r0, r3, r8)
            r8.f2315r = r0
            goto L103
        Le9:
            com.bytedance.msdk.api.j r4 = new com.bytedance.msdk.api.j
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "创建自定义广告对象 check className false className is "
            r5.<init>(r6)
            java.lang.String r0 = r0.j()
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r4.<init>(r3, r0)
            com.bytedance.msdk.up.m.j(r1, r2, r2, r2, r4)
        L103:
            com.bytedance.msdk.cw.j.j r0 = r8.f2315r
            if (r0 == 0) goto L182
            com.bytedance.msdk.cw.m.xt.xt r1 = r8.j
            java.lang.String r1 = r1.jy()
            java.lang.String r0 = r0.j(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L13a
            com.bytedance.msdk.cw.m.xt.xt r1 = r8.j
            if (r1 == 0) goto L13a
            java.lang.String r1 = r1.vl()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L13a
            com.bytedance.msdk.cw.m.xt.xt r1 = r8.j
            boolean r1 = r1.oq()
            if (r1 != 0) goto L13a
            com.bytedance.msdk.core.up.j.j r1 = com.bytedance.msdk.core.up.j.j.j()
            com.bytedance.msdk.cw.m.xt.xt r3 = r8.j
            java.lang.String r3 = r3.vl()
            r1.r(r3, r0)
        L13a:
            com.bytedance.msdk.cw.m.xt.xt r1 = r8.j
            com.bytedance.msdk.cw.m.j.xt r3 = r8.xt
            r8.j(r1, r3, r2, r0)
            com.bytedance.msdk.cw.j.j r0 = r8.f2315r
            com.bytedance.msdk.cw.m.j.xt r1 = r8.xt
            android.content.Context r1 = r1.getContext()
            com.bytedance.msdk.cw.m.xt.xt r2 = r8.j
            com.bytedance.msdk.api.j.xt r3 = r8.cw
            com.bytedance.msdk.cw.m.j.xt r4 = r8.xt
            java.util.Map r4 = r4.p()
            java.util.Map r4 = com.bytedance.msdk.cw.tl.cw.j(r2, r3, r4)
            r0.j(r1, r2, r3, r4)
            com.bytedance.msdk.cw.m.xt.xt r0 = r8.j
            boolean r0 = r0.oq()
            if (r0 != 0) goto L181
            com.bytedance.msdk.core.up.j.j r0 = com.bytedance.msdk.core.up.j.j.j()
            com.bytedance.msdk.cw.m.xt.xt r1 = r8.j
            java.lang.String r1 = r1.xt()
            com.bytedance.msdk.cw.m.xt.xt r2 = r8.j
            java.lang.String r2 = r2.vl()
            com.bytedance.msdk.cw.m.xt.xt r3 = r8.j
            com.bytedance.msdk.core.oq.oq r3 = r3.tl()
            com.bytedance.msdk.cw.m.xt.xt r4 = r8.j
            int r4 = r4.cw()
            r0.j(r1, r2, r3, r4)
        L181:
            return
        L182:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "**********【重要】"
            r0.<init>(r2)
            com.bytedance.msdk.cw.m.xt.xt r2 = r8.j
            java.lang.String r2 = r2.jy()
            r0.append(r2)
            java.lang.String r2 = "创建失败，请检查adapter是否接入 **********"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "TTMediationSDK"
            com.bytedance.msdk.j.up.cw.r(r2, r0)
            com.bytedance.msdk.cw.m.xt.xt r0 = r8.j
            com.bytedance.msdk.core.oq.oq r0 = r0.tl()
            com.bytedance.msdk.api.j.xt r2 = r8.cw
            com.bytedance.msdk.cw.m.xt.xt r3 = r8.j
            int r3 = r3.ae()
            com.bytedance.msdk.cw.m.xt.xt r4 = r8.j
            int r4 = r4.m()
            com.bytedance.msdk.up.m.j(r0, r2, r3, r4)
            com.bytedance.msdk.api.j r0 = new com.bytedance.msdk.api.j
            java.lang.String r2 = "create adn loader fail"
            r0.<init>(r2)
            com.bytedance.msdk.cw.m.xt.xt r3 = r8.j
            com.bytedance.msdk.cw.m.j.xt r4 = r8.xt
            r8.j(r3, r4, r0, r1)
            com.bytedance.msdk.api.j r0 = new com.bytedance.msdk.api.j
            r0.<init>(r2)
            r8.j(r0)
            return
    }

    private void xt(com.bytedance.msdk.api.j r3) {
            r2 = this;
            com.bytedance.msdk.cw.m.xt.xt r0 = r2.j
            if (r0 == 0) goto Lb
            com.bytedance.msdk.core.oq.oq r1 = r0.tl()
            r0.j(r3, r1)
        Lb:
            return
    }

    public void j(com.bytedance.msdk.api.j r2) {
            r1 = this;
            r0 = 1
            r1.j(r2, r0)
            return
    }

    @Override // com.bytedance.msdk.cw.cw.xt.j
    public void j(com.bytedance.msdk.cw.cw.xt.j.InterfaceC0234j r4) {
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            long r0 = java.lang.System.currentTimeMillis()
            r3.ae = r0
            com.bytedance.msdk.cw.m.xt.xt r0 = r4.j()
            r3.j = r0
            com.bytedance.msdk.cw.m.j.xt r4 = r4.xt()
            r3.xt = r4
            com.bytedance.msdk.api.j.xt r4 = r4.mi()
            r3.cw = r4
            com.bytedance.msdk.cw.m.j.xt r4 = r3.xt
            android.content.Context r4 = r4.getContext()
            java.lang.String r0 = ""
            if (r4 != 0) goto L37
            com.bytedance.msdk.api.j r4 = new com.bytedance.msdk.api.j
            java.lang.String r1 = "request adn context is null"
            r4.<init>(r1)
            com.bytedance.msdk.cw.m.xt.xt r1 = r3.j
            com.bytedance.msdk.cw.m.j.xt r2 = r3.xt
            r3.j(r1, r2, r4, r0)
            r3.j(r4)
            return
        L37:
            com.bytedance.msdk.cw.m.xt.xt r4 = r3.j
            if (r4 == 0) goto L3f
            r3.xt()
            return
        L3f:
            com.bytedance.msdk.api.j r4 = new com.bytedance.msdk.api.j
            java.lang.String r1 = "request adn waterfall request is null"
            r4.<init>(r1)
            com.bytedance.msdk.cw.m.xt.xt r1 = r3.j
            com.bytedance.msdk.cw.m.j.xt r2 = r3.xt
            r3.j(r1, r2, r4, r0)
            r3.j(r4)
            return
    }

    public void j(com.bytedance.msdk.xt.cw r3, java.lang.String r4) {
            r2 = this;
            if (r3 == 0) goto Le
            int r0 = r3.om()
            r1 = 5
            if (r0 != r1) goto Le
            com.bytedance.msdk.api.j.xt r0 = r2.cw
            com.bytedance.msdk.up.m.j(r3, r0, r4)
        Le:
            return
    }

    public void j(java.util.List<com.bytedance.msdk.xt.cw> r14) {
            r13 = this;
            if (r14 != 0) goto L5
            r6 = r13
            goto L114
        L5:
            long r0 = r13.up
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L13
            long r0 = android.os.SystemClock.elapsedRealtime()
            r13.up = r0
        L13:
            long r0 = java.lang.System.currentTimeMillis()
            long r4 = r13.ae
            long r0 = r0 - r4
            r13.f2314m = r0
            java.util.Iterator r0 = r14.iterator()
        L20:
            boolean r1 = r0.hasNext()
            r4 = 0
            if (r1 == 0) goto L4d
            java.lang.Object r1 = r0.next()
            com.bytedance.msdk.xt.cw r1 = (com.bytedance.msdk.xt.cw) r1
            com.bytedance.msdk.api.j.xt r5 = r13.cw
            com.bytedance.msdk.cw.m.xt.xt r6 = r13.j
            com.bytedance.msdk.cw.m.j.xt r7 = r13.xt
            if (r7 != 0) goto L36
            goto L3a
        L36:
            com.bytedance.msdk.core.oq.g r4 = r7.wq()
        L3a:
            com.bytedance.msdk.cw.m.xt.xt r7 = r13.j
            if (r7 == 0) goto L47
            java.lang.String r7 = r7.jy()
            java.lang.String r7 = r13.j(r7)
            goto L49
        L47:
            java.lang.String r7 = ""
        L49:
            com.bytedance.msdk.cw.tl.cw.j(r1, r5, r6, r4, r7)
            goto L20
        L4d:
            java.util.List r0 = r13.xt(r14)
            int r1 = r0.size()
            r5 = 0
            if (r1 == 0) goto L115
            com.bytedance.msdk.cw.m.xt.xt r1 = r13.j
            if (r1 == 0) goto Lea
            long r6 = java.lang.System.currentTimeMillis()
            com.bytedance.msdk.cw.m.xt.xt r1 = r13.j
            com.bytedance.msdk.core.oq.oq r1 = r1.tl()
            boolean r1 = com.bytedance.msdk.tl.mi.j(r1)
            if (r1 == 0) goto L78
            java.lang.String r1 = com.bytedance.msdk.tl.mi.xt()
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r6
            r10 = r1
        L76:
            r11 = r2
            goto L7a
        L78:
            r10 = r4
            goto L76
        L7a:
            int r1 = r14.size()
            if (r1 <= 0) goto L85
            r1 = 20000(0x4e20, float:2.8026E-41)
            r7 = 20000(0x4e20, float:2.8026E-41)
            goto L8b
        L85:
            r1 = 820001(0xc8321, float:1.149066E-39)
            r7 = 820001(0xc8321, float:1.149066E-39)
        L8b:
            com.bytedance.msdk.cw.m.xt.xt r1 = r13.j
            boolean r1 = r1.j()
            if (r1 != 0) goto Lac
            com.bytedance.msdk.cw.m.xt.xt r1 = r13.j
            boolean r1 = r1.x()
            if (r1 == 0) goto L9c
            goto Lac
        L9c:
            int r9 = r0.size()
            java.lang.Object r1 = r0.get(r5)
            r8 = r1
            com.bytedance.msdk.xt.cw r8 = (com.bytedance.msdk.xt.cw) r8
            r6 = r13
            r6.j(r7, r8, r9, r10, r11)
            goto Lc8
        Lac:
            java.util.Iterator r1 = r14.iterator()
        Lb0:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lc7
            java.lang.Object r2 = r1.next()
            r8 = r2
            com.bytedance.msdk.xt.cw r8 = (com.bytedance.msdk.xt.cw) r8
            if (r8 == 0) goto Lc5
            r9 = 1
            r6 = r13
            r6.j(r7, r8, r9, r10, r11)
            goto Lb0
        Lc5:
            r6 = r13
            goto Lb0
        Lc7:
            r6 = r13
        Lc8:
            com.bytedance.msdk.cw.m.xt.xt r1 = r6.j
            boolean r1 = r1.v()
            if (r1 == 0) goto Leb
            boolean r1 = com.bytedance.msdk.tl.p.xt(r14)
            if (r1 != 0) goto Leb
            java.lang.Object r14 = r14.get(r5)
            com.bytedance.msdk.xt.cw r14 = (com.bytedance.msdk.xt.cw) r14
            com.bytedance.msdk.api.j.xt r1 = r6.cw
            com.bytedance.msdk.cw.m.xt.xt r2 = r6.j
            com.bytedance.msdk.core.oq.oq r2 = r2.tl()
            long r7 = r6.f2314m
            com.bytedance.msdk.up.m.j(r14, r1, r2, r7)
            goto Leb
        Lea:
            r6 = r13
        Leb:
            r13.cw(r0)
            com.bytedance.msdk.cw.m.xt.xt r14 = r6.j
            com.bytedance.msdk.core.oq.oq r14 = r14.tl()
            if (r14 == 0) goto L114
            com.bytedance.msdk.cw.m.xt.xt r14 = r6.j
            com.bytedance.msdk.core.oq.oq r14 = r14.tl()
            int r14 = r14.jy()
            r1 = 10
            if (r14 != r1) goto L114
            com.bytedance.msdk.cw.m.xt.xt r14 = r6.j
            com.bytedance.msdk.core.oq.oq r14 = r14.tl()
            int r14 = r14.m()
            r1 = 1
            if (r14 != r1) goto L114
            r13.j(r0, r4)
        L114:
            return
        L115:
            r6 = r13
            com.bytedance.msdk.api.j r14 = new com.bytedance.msdk.api.j
            r0 = 50100(0xc3b4, float:7.0205E-41)
            java.lang.String r1 = com.bytedance.msdk.api.j.j(r0)
            r14.<init>(r0, r1)
            r13.j(r14, r5)
            return
    }

    public void j(java.util.List<com.bytedance.msdk.xt.cw> r8, com.bytedance.msdk.api.j r9) {
            r7 = this;
            r0 = 0
            if (r8 == 0) goto L3d
            java.util.Iterator r1 = r8.iterator()
        L7:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r1.next()
            com.bytedance.msdk.xt.cw r2 = (com.bytedance.msdk.xt.cw) r2
            if (r2 == 0) goto L7
            r3 = 1
            r2.g(r3)
            com.bytedance.msdk.api.j.xt r3 = r7.cw
            com.bytedance.msdk.cw.m.xt.xt r4 = r7.j
            com.bytedance.msdk.cw.m.j.xt r5 = r7.xt
            if (r5 != 0) goto L23
            r5 = r0
            goto L27
        L23:
            com.bytedance.msdk.core.oq.g r5 = r5.wq()
        L27:
            com.bytedance.msdk.cw.m.xt.xt r6 = r7.j
            if (r6 == 0) goto L34
            java.lang.String r6 = r6.jy()
            java.lang.String r6 = r7.j(r6)
            goto L36
        L34:
            java.lang.String r6 = ""
        L36:
            com.bytedance.msdk.cw.tl.cw.j(r2, r3, r4, r5, r6)
            r7.j(r2)
            goto L7
        L3d:
            if (r9 == 0) goto L56
            int r9 = r9.j
            r1 = 30010(0x753a, float:4.2053E-41)
            if (r9 != r1) goto L56
            boolean r9 = com.bytedance.msdk.j.j.j()
            if (r9 == 0) goto L56
            com.bytedance.msdk.cw.cw.xt.cw$1 r9 = new com.bytedance.msdk.cw.cw.xt.cw$1
            r9.<init>(r7, r8)
            r0 = 1000(0x3e8, double:4.94E-321)
            com.bytedance.msdk.j.up.m.j(r9, r0)
            return
        L56:
            com.bytedance.msdk.cw.m.xt.xt r9 = r7.j
            if (r9 == 0) goto L79
            boolean r9 = r9.v()
            if (r9 == 0) goto L79
            boolean r9 = com.bytedance.msdk.tl.p.xt(r8)
            if (r9 != 0) goto L6e
            r9 = 0
            java.lang.Object r8 = r8.get(r9)
            r0 = r8
            com.bytedance.msdk.xt.cw r0 = (com.bytedance.msdk.xt.cw) r0
        L6e:
            com.bytedance.msdk.api.j.xt r8 = r7.cw
            com.bytedance.msdk.cw.m.xt.xt r9 = r7.j
            com.bytedance.msdk.core.oq.oq r9 = r9.tl()
            com.bytedance.msdk.up.m.j(r0, r8, r9)
        L79:
            r7.j()
            return
    }
}
