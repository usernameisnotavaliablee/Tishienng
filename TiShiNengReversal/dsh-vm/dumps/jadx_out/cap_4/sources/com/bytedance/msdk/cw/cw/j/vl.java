package com.bytedance.msdk.cw.cw.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class vl implements com.bytedance.msdk.cw.cw.j.j {
    private final long j;




    public vl() {
            r2 = this;
            r2.<init>()
            r0 = 500(0x1f4, double:2.47E-321)
            r2.j = r0
            return
    }

    private com.bytedance.msdk.core.oq.xt j(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            r0 = -4
            com.bytedance.msdk.core.oq.oq r4 = com.bytedance.msdk.core.ae.cw.j(r5, r4, r0, r0)
            if (r4 != 0) goto L9
            r3 = 0
            return r3
        L9:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r5.add(r4)
            com.bytedance.msdk.core.oq.xt r4 = new com.bytedance.msdk.core.oq.xt
            r4.<init>()
            r4.r(r3)
            r3 = 3
            r4.ws(r3)
            r0 = 400(0x190, double:1.976E-321)
            r4.r(r0)
            r0 = 2000(0x7d0, double:9.88E-321)
            r4.up(r0)
            r0 = 5000(0x1388, double:2.4703E-320)
            r4.m(r0)
            r0 = 3000(0xbb8, double:1.482E-320)
            r4.ae(r0)
            r4.j(r5)
            return r4
    }

    private void j(com.bytedance.msdk.cw.cw.j.j.InterfaceC0233j r2, com.bytedance.msdk.cw.m.j.xt r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            com.bytedance.msdk.api.j.xt r0 = r3.mi()
            java.lang.String r0 = r0.v()
            com.bytedance.msdk.core.oq.xt r4 = r1.j(r0, r4, r5)
            r3.j(r4)
            r2.j(r3)
            return
    }

    static /* synthetic */ void j(com.bytedance.msdk.cw.cw.j.vl r0, com.bytedance.msdk.cw.cw.j.j.InterfaceC0233j r1, com.bytedance.msdk.cw.m.j.xt r2, java.lang.String r3, java.lang.String r4) {
            r0.j(r1, r2, r3, r4)
            return
    }

    static /* synthetic */ void j(com.bytedance.msdk.cw.cw.j.vl r0, com.bytedance.msdk.cw.m.j.xt r1, int r2) {
            r0.j(r1, r2)
            return
    }

    private void j(com.bytedance.msdk.cw.m.j.xt r8, int r9) {
            r7 = this;
            boolean r0 = r8.v()
            r3 = r0 ^ 1
            com.bytedance.msdk.core.oq.g r0 = r8.wq()
            java.lang.String r4 = r0.j
            com.bytedance.msdk.api.j.xt r1 = r8.mi()
            r2 = 0
            r6 = 0
            r5 = r9
            com.bytedance.msdk.up.m.j(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // com.bytedance.msdk.cw.cw.j.j
    public void j(com.bytedance.msdk.cw.cw.j.j.InterfaceC0233j r4) {
            r3 = this;
            com.bytedance.msdk.cw.m.j.xt r0 = r4.j()
            com.bytedance.msdk.core.oq.xt r1 = r0.vl()
            if (r1 != 0) goto L38
            com.bytedance.msdk.api.j.xt r1 = r0.mi()
            int r1 = r1.f()
            r2 = 3
            if (r1 != r2) goto L38
            com.bytedance.msdk.core.ws.cw r1 = com.bytedance.msdk.core.xt.xt()
            boolean r1 = r1.l()
            if (r1 != 0) goto L38
            com.bytedance.msdk.api.r.qv r1 = r0.h()
            if (r1 == 0) goto L38
            java.lang.String r1 = "TTMediationSDK"
            java.lang.String r2 = "执行开启开屏兜底..............."
            com.bytedance.msdk.j.up.cw.r(r1, r2)
            com.bytedance.msdk.api.j.xt r1 = r0.mi()
            com.bytedance.msdk.api.r.qv r2 = r0.h()
            r3.j(r4, r0, r1, r2)
            return
        L38:
            r4.j(r0)
            return
    }

    protected void j(com.bytedance.msdk.cw.cw.j.j.InterfaceC0233j r8, com.bytedance.msdk.cw.m.j.xt r9, com.bytedance.msdk.api.j.xt r10, com.bytedance.msdk.api.r.qv r11) {
            r7 = this;
            java.lang.String r0 = "TTMediationSDK"
            if (r11 == 0) goto L39
            if (r10 == 0) goto L39
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r10.v()
            java.lang.String r2 = com.bytedance.msdk.j.up.up.j(r2)
            r1.append(r2)
            java.lang.String r2 = "settings config.......AdUnitId = "
            r1.append(r2)
            java.lang.String r2 = r10.v()
            r1.append(r2)
            java.lang.String r2 = "  开屏广告走了开发者自定义兜底方案   adnName:"
            r1.append(r2)
            int r2 = r11.j()
            java.lang.String r2 = com.bytedance.msdk.xt.j.j(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.bytedance.msdk.j.up.cw.r(r0, r1)
        L39:
            r1 = -4
            com.bytedance.msdk.up.m.xt(r10, r1)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r1 = "开屏广告走了开发者自定义开屏兜底，数据为: getAdNetworkFlatFromId = "
            r10.<init>(r1)
            int r1 = r11.j()
            r10.append(r1)
            java.lang.String r1 = " getAppId = "
            r10.append(r1)
            java.lang.String r1 = r11.cw()
            r10.append(r1)
            java.lang.String r1 = " getAppKey = "
            r10.append(r1)
            java.lang.String r1 = r11.r()
            r10.append(r1)
            java.lang.String r1 = " getAdNetworkSlotId = "
            r10.append(r1)
            java.lang.String r1 = r11.xt()
            r10.append(r1)
            java.lang.String r10 = r10.toString()
            com.bytedance.msdk.j.up.cw.r(r0, r10)
            java.lang.String r10 = r11.xt()
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            r0 = 840027(0xcd15b, float:1.177129E-39)
            if (r10 != 0) goto L97
            java.lang.String r10 = r11.cw()
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 == 0) goto L9b
            java.lang.String r10 = r11.r()
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 == 0) goto L9b
        L97:
            r2 = r7
            r4 = r9
            goto L154
        L9b:
            int r10 = r11.j()
            java.lang.String r5 = com.bytedance.msdk.xt.j.j(r10)
            java.lang.String r6 = r11.xt()
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 == 0) goto Lbd
            r7.j(r9, r0)
            com.bytedance.msdk.api.j r8 = new com.bytedance.msdk.api.j
            java.lang.String r10 = com.bytedance.msdk.api.j.j(r0)
            r8.<init>(r0, r10)
            r9.j(r8)
            return
        Lbd:
            r1 = 3
            if (r10 != r1) goto Le1
            com.bytedance.msdk.m.j.up r10 = new com.bytedance.msdk.m.j.up
            r10.<init>(r11)
            r10.j(r11)
            android.os.Looper r10 = com.bytedance.msdk.j.up.m.xt()
            if (r10 == 0) goto Le0
            android.os.Handler r11 = new android.os.Handler
            r11.<init>(r10)
            com.bytedance.msdk.cw.cw.j.vl$1 r1 = new com.bytedance.msdk.cw.cw.j.vl$1
            r2 = r7
            r3 = r8
            r4 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r8 = 500(0x1f4, double:2.47E-321)
            r11.postDelayed(r1, r8)
        Le0:
            return
        Le1:
            r3 = r8
            r4 = r9
            r8 = 1
            if (r10 != r8) goto Lf4
            com.bytedance.msdk.m.j.oq r8 = com.bytedance.msdk.m.j.oq.xt(r11)
            com.bytedance.msdk.cw.cw.j.vl$2 r1 = new com.bytedance.msdk.cw.cw.j.vl$2
            r2 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r8.j(r11, r1)
            return
        Lf4:
            r2 = r7
            r8 = 7
            if (r10 != r8) goto L104
            com.bytedance.msdk.m.j.ae r8 = new com.bytedance.msdk.m.j.ae
            r8.<init>(r11)
            r8.j(r11)
            r7.j(r3, r4, r5, r6)
            return
        L104:
            r8 = 6
            if (r10 != r8) goto L113
            com.bytedance.msdk.m.j.xt r8 = new com.bytedance.msdk.m.j.xt
            r8.<init>(r11)
            r8.j(r11)
            r7.j(r3, r4, r5, r6)
            return
        L113:
            r8 = 4
            if (r10 != r8) goto L122
            com.bytedance.msdk.m.j.tl r8 = new com.bytedance.msdk.m.j.tl
            r8.<init>(r11)
            r8.j(r11)
            r7.j(r3, r4, r5, r6)
            return
        L122:
            r8 = 8
            if (r10 != r8) goto L132
            com.bytedance.msdk.m.j.vl r8 = new com.bytedance.msdk.m.j.vl
            r8.<init>(r11)
            r8.j(r11)
            r7.j(r3, r4, r5, r6)
            return
        L132:
            r8 = 9
            if (r10 != r8) goto L144
            com.bytedance.msdk.m.j.m r8 = new com.bytedance.msdk.m.j.m
            r8.<init>(r11)
            com.bytedance.msdk.cw.cw.j.vl$3 r1 = new com.bytedance.msdk.cw.cw.j.vl$3
            r1.<init>(r2, r3, r4, r5, r6)
            r8.j(r11, r1)
            return
        L144:
            r7.j(r4, r0)
            com.bytedance.msdk.api.j r8 = new com.bytedance.msdk.api.j
            java.lang.String r9 = com.bytedance.msdk.api.j.j(r0)
            r8.<init>(r0, r9)
            r4.j(r8)
            return
        L154:
            r7.j(r4, r0)
            com.bytedance.msdk.api.j r8 = new com.bytedance.msdk.api.j
            java.lang.String r9 = com.bytedance.msdk.api.j.j(r0)
            r8.<init>(r0, r9)
            r4.j(r8)
            return
    }

    @Override // com.bytedance.msdk.cw.cw.j.j
    public void xt(com.bytedance.msdk.cw.cw.j.j.InterfaceC0233j r2) {
            r1 = this;
            r0 = 0
            r2.j(r0)
            return
    }
}
