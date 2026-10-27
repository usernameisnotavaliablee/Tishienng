package com.bytedance.msdk.cw.cw.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class up implements com.bytedance.msdk.cw.cw.j.j {
    public up() {
            r0 = this;
            r0.<init>()
            return
    }

    private int j(int r1) {
            r0 = this;
            switch(r1) {
                case 1: goto L23;
                case 2: goto L1f;
                case 3: goto L1b;
                case 4: goto L3;
                case 5: goto L17;
                case 6: goto L3;
                case 7: goto L13;
                case 8: goto Lf;
                case 9: goto Lb;
                case 10: goto L7;
                default: goto L3;
            }
        L3:
            r1 = 840029(0xcd15d, float:1.177131E-39)
            return r1
        L7:
            r1 = 840039(0xcd167, float:1.177145E-39)
            return r1
        Lb:
            r1 = 840030(0xcd15e, float:1.177133E-39)
            return r1
        Lf:
            r1 = 840037(0xcd165, float:1.177143E-39)
            return r1
        L13:
            r1 = 840036(0xcd164, float:1.177141E-39)
            return r1
        L17:
            r1 = 840035(0xcd163, float:1.17714E-39)
            return r1
        L1b:
            r1 = 840034(0xcd162, float:1.177138E-39)
            return r1
        L1f:
            r1 = 840033(0xcd161, float:1.177137E-39)
            return r1
        L23:
            r1 = 840032(0xcd160, float:1.177136E-39)
            return r1
    }

    @Override // com.bytedance.msdk.cw.cw.j.j
    public void j(com.bytedance.msdk.cw.cw.j.j.InterfaceC0233j r10) {
            r9 = this;
            com.bytedance.msdk.cw.m.j.xt r0 = r10.j()
            com.bytedance.msdk.api.j.xt r1 = r0.mi()
            com.bytedance.msdk.core.ws.cw r2 = com.bytedance.msdk.core.xt.xt()
            com.bytedance.msdk.api.j.xt r3 = r0.mi()
            java.lang.String r3 = r3.v()
            com.bytedance.msdk.api.j.xt r4 = r0.mi()
            int r4 = r4.f()
            boolean r2 = r2.j(r3, r4)
            r3 = 0
            if (r2 != 0) goto L30
            com.bytedance.msdk.api.xt.j r2 = new com.bytedance.msdk.api.xt.j
            r4 = 840031(0xcd15f, float:1.177134E-39)
            java.lang.String r5 = com.bytedance.msdk.api.j.j(r4)
            r2.<init>(r4, r5)
            goto L31
        L30:
            r2 = r3
        L31:
            if (r2 != 0) goto L66
            com.bytedance.msdk.core.ws.cw r4 = com.bytedance.msdk.core.xt.xt()
            com.bytedance.msdk.api.j.xt r5 = r0.mi()
            int r5 = r5.f()
            boolean r4 = r4.j(r5)
            if (r4 != 0) goto L66
            com.bytedance.msdk.api.xt.j r2 = new com.bytedance.msdk.api.xt.j
            com.bytedance.msdk.api.j.xt r4 = r0.mi()
            int r4 = r4.f()
            int r4 = r9.j(r4)
            com.bytedance.msdk.api.j.xt r5 = r0.mi()
            int r5 = r5.f()
            int r5 = r9.j(r5)
            java.lang.String r5 = com.bytedance.msdk.api.j.j(r5)
            r2.<init>(r4, r5)
        L66:
            r4 = 1
            if (r2 != 0) goto L78
            boolean r5 = com.bytedance.msdk.m.cw.xt()
            if (r5 != 0) goto L78
            com.bytedance.msdk.api.xt.j r2 = new com.bytedance.msdk.api.xt.j
            java.lang.String r5 = com.bytedance.msdk.api.j.j(r4)
            r2.<init>(r4, r5)
        L78:
            if (r2 != 0) goto L8c
            boolean r5 = r0.m()
            if (r5 == 0) goto L8c
            com.bytedance.msdk.api.xt.j r2 = new com.bytedance.msdk.api.xt.j
            r5 = 41044(0xa054, float:5.7515E-41)
            java.lang.String r6 = com.bytedance.msdk.api.j.j(r5)
            r2.<init>(r5, r6)
        L8c:
            java.lang.String r5 = "TTMediationSDK"
            if (r2 != 0) goto La7
            android.content.Context r6 = r0.getContext()
            if (r6 != 0) goto La7
            java.lang.String r2 = "Context为null！！！"
            com.bytedance.msdk.j.up.cw.r(r5, r2)
            com.bytedance.msdk.api.xt.j r2 = new com.bytedance.msdk.api.xt.j
            r6 = 41005(0xa02d, float:5.746E-41)
            java.lang.String r7 = com.bytedance.msdk.api.j.j(r6)
            r2.<init>(r6, r7)
        La7:
            if (r2 != 0) goto Lc1
            com.bytedance.msdk.api.j.xt r6 = r0.mi()
            java.lang.String r6 = r6.v()
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto Lc1
            com.bytedance.msdk.api.xt.j r2 = new com.bytedance.msdk.api.xt.j
            r6 = 840026(0xcd15a, float:1.177127E-39)
            java.lang.String r7 = "广告位id不能为空"
            r2.<init>(r6, r7)
        Lc1:
            if (r2 != 0) goto L194
            com.bytedance.msdk.core.oq.xt r6 = r0.vl()
            if (r6 == 0) goto Ld7
            com.bytedance.msdk.core.oq.xt r6 = r0.vl()
            java.util.List r6 = r6.ol()
            boolean r6 = com.bytedance.msdk.tl.p.j(r6)
            if (r6 == 0) goto L194
        Ld7:
            com.bytedance.msdk.ae.j.cw r6 = com.bytedance.msdk.ae.j.cw.j()
            boolean r6 = r6.cw()
            if (r6 == 0) goto L114
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = r1.v()
            java.lang.String r6 = com.bytedance.msdk.j.up.up.j(r6)
            r2.append(r6)
            java.lang.String r6 = "settings config.......没有settings config配置信息,AdUnitId = "
            r2.append(r6)
            java.lang.String r6 = r1.v()
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            com.bytedance.msdk.j.up.cw.r(r5, r2)
            com.bytedance.msdk.api.xt.j r2 = new com.bytedance.msdk.api.xt.j
            r5 = 840040(0xcd168, float:1.177147E-39)
            java.lang.String r6 = com.bytedance.msdk.api.j.j(r5)
            r2.<init>(r5, r6)
            com.bytedance.msdk.up.m.xt(r1, r4)
            goto L189
        L114:
            com.bytedance.msdk.core.oq.xt r6 = r0.vl()
            java.lang.String r7 = "settings config.......注意，AdUnitId = "
            if (r6 == 0) goto L155
            com.bytedance.msdk.core.oq.xt r6 = r0.vl()
            java.util.List r6 = r6.ol()
            boolean r6 = com.bytedance.msdk.tl.p.j(r6)
            if (r6 == 0) goto L155
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = r1.v()
            java.lang.String r8 = com.bytedance.msdk.j.up.up.j(r8)
            r6.append(r8)
            r6.append(r7)
            java.lang.String r7 = r1.v()
            r6.append(r7)
            java.lang.String r7 = "  没有对应的waterfall配置信息"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.bytedance.msdk.j.up.cw.r(r5, r6)
            r5 = 3
            com.bytedance.msdk.up.m.xt(r1, r5)
            goto L189
        L155:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = r1.v()
            java.lang.String r6 = com.bytedance.msdk.j.up.up.j(r6)
            r2.append(r6)
            r2.append(r7)
            java.lang.String r6 = r1.v()
            r2.append(r6)
            java.lang.String r6 = " 的配置信息为 null ！！"
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            com.bytedance.msdk.j.up.cw.r(r5, r2)
            com.bytedance.msdk.api.xt.j r2 = new com.bytedance.msdk.api.xt.j
            r5 = 44406(0xad76, float:6.2226E-41)
            java.lang.String r6 = "检查广告位ID的状态是否正常、初始化 useMediation 参数是否为 true、新建广告位ID生效期为20min左右"
            r2.<init>(r5, r6)
            r5 = 2
            com.bytedance.msdk.up.m.xt(r1, r5)
        L189:
            com.bytedance.msdk.core.ws.cw r5 = com.bytedance.msdk.core.xt.xt()
            com.bytedance.msdk.core.ws.xt r5 = com.bytedance.msdk.core.ws.xt.j(r5)
            r5.xt(r4)
        L194:
            if (r2 != 0) goto L1ba
            java.lang.String r5 = r1.nd()
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L1ba
            boolean r6 = r1.rh()
            if (r6 != 0) goto L1ba
            java.lang.String r6 = r1.v()
            boolean r5 = com.bytedance.msdk.cw.tl.r.j(r6, r5)
            if (r5 != 0) goto L1ba
            com.bytedance.msdk.api.xt.j r2 = new com.bytedance.msdk.api.xt.j
            r5 = 840044(0xcd16c, float:1.177152E-39)
            java.lang.String r6 = "本次请求未包含聚合广告位头层设价最高的代码位，导致聚合请求失败；请调整请求，确保包含聚合广告位头层设价最高的代码位。"
            r2.<init>(r5, r6)
        L1ba:
            r7 = r2
            if (r7 == 0) goto L1e2
            com.bytedance.msdk.core.oq.xt r10 = r0.vl()
            if (r10 == 0) goto L1cb
            com.bytedance.msdk.core.oq.xt r10 = r0.vl()
            java.lang.String r3 = r10.hh()
        L1cb:
            r2 = r3
            boolean r10 = r0.v()
            r3 = r10 ^ 1
            com.bytedance.msdk.core.oq.g r10 = r0.wq()
            java.lang.String r4 = r10.j
            int r5 = r7.j
            r6 = 0
            com.bytedance.msdk.up.m.j(r1, r2, r3, r4, r5, r6)
            r0.j(r7)
            return
        L1e2:
            com.bytedance.msdk.cw.m.j.xt r0 = r10.j()
            r10.j(r0)
            return
    }

    @Override // com.bytedance.msdk.cw.cw.j.j
    public void xt(com.bytedance.msdk.cw.cw.j.j.InterfaceC0233j r4) {
            r3 = this;
            com.bytedance.msdk.cw.m.j.xt r0 = r4.j()
            boolean r1 = r0.m()
            if (r1 == 0) goto L21
            java.lang.String r4 = "TTMediationSDK"
            java.lang.String r1 = "调用过销毁方法_destroy()！！！"
            com.bytedance.msdk.j.up.cw.r(r4, r1)
            com.bytedance.msdk.api.j r4 = new com.bytedance.msdk.api.j
            r1 = 41044(0xa054, float:5.7515E-41)
            java.lang.String r2 = com.bytedance.msdk.api.j.j(r1)
            r4.<init>(r1, r2)
            r0.j(r4)
            return
        L21:
            com.bytedance.msdk.cw.m.j.j r1 = r0.jy()
            boolean r1 = r1.up()
            if (r1 == 0) goto L38
            com.bytedance.msdk.api.j r4 = new com.bytedance.msdk.api.j
            r1 = 10010(0x271a, float:1.4027E-41)
            java.lang.String r2 = "延长瀑布流总超时时长或者缩短层超时并添加兜底代码位"
            r4.<init>(r1, r2)
            r0.j(r4)
            return
        L38:
            r0 = 0
            r4.j(r0)
            return
    }
}
