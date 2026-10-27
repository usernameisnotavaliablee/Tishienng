package com.bytedance.msdk.cw.cw.xt.j.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class up extends com.bytedance.msdk.cw.cw.xt.j.xt.xt {
    private com.bytedance.msdk.cw.m.xt.xt cw;
    private com.bytedance.msdk.api.j.xt xt;

    public up(com.bytedance.msdk.cw.j.xt r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private void j(com.bytedance.sdk.openadsdk.core.gq r3, com.bytedance.sdk.openadsdk.i.cw.cw.xt.j r4) {
            r2 = this;
            com.bytedance.msdk.api.j.xt r0 = r2.xt
            float r0 = r0.az()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L1f
            com.bytedance.msdk.api.j.xt r0 = r2.xt
            float r0 = r0.ws()
            com.bytedance.sdk.openadsdk.i.cw.cw.xt$j r0 = r4.j(r0)
            com.bytedance.msdk.api.j.xt r1 = r2.xt
            float r1 = r1.az()
            r0.xt(r1)
            goto L2c
        L1f:
            com.bytedance.msdk.api.j.xt r0 = r2.xt
            float r0 = r0.ws()
            com.bytedance.sdk.openadsdk.i.cw.cw.xt$j r0 = r4.j(r0)
            r0.xt(r1)
        L2c:
            com.bytedance.msdk.cw.cw.xt.j.xt.r r0 = new com.bytedance.msdk.cw.cw.xt.j.xt.r
            r0.<init>()
            com.bytedance.msdk.cw.m.xt.xt r1 = r2.cw
            boolean r1 = r1.j()
            com.bytedance.sdk.openadsdk.i.cw.cw.xt r4 = r4.j()
            r0.j(r1, r3, r4, r2)
            return
    }

    private void xt(com.bytedance.sdk.openadsdk.core.gq r3, com.bytedance.sdk.openadsdk.i.cw.cw.xt.j r4) {
            r2 = this;
            com.bytedance.sdk.openadsdk.i.cw.cw.xt r4 = r4.j()
            com.bytedance.msdk.cw.cw.xt.j.xt.cw r0 = new com.bytedance.msdk.cw.cw.xt.j.xt.cw
            r0.<init>()
            com.bytedance.msdk.cw.m.xt.xt r1 = r2.cw
            boolean r1 = r1.j()
            r0.j(r1, r3, r4, r2)
            return
    }

    @Override // com.bytedance.msdk.cw.cw.xt.j.xt
    public void xt(android.content.Context r2, com.bytedance.msdk.cw.m.xt.xt r3, com.bytedance.msdk.api.j.xt r4, java.util.Map<java.lang.String, java.lang.Object> r5) {
            r1 = this;
            r1.cw = r3
            r1.xt = r4
            if (r4 != 0) goto L11
            com.bytedance.msdk.api.j r2 = new com.bytedance.msdk.api.j
            java.lang.String r3 = "load ad fail adSlot is null"
            r2.<init>(r3)
            r1.j(r2)
            return
        L11:
            if (r5 == 0) goto L71
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            com.bytedance.sdk.openadsdk.core.gq r2 = r1.j(r2)
            if (r2 != 0) goto L22
            goto L71
        L22:
            com.bytedance.msdk.api.j.xt r3 = r1.xt
            com.bytedance.msdk.cw.m.xt.xt r4 = r1.cw
            r0 = 0
            com.bytedance.sdk.openadsdk.i.cw.cw.xt$j r3 = com.bytedance.msdk.j.cw.xt.j(r3, r4, r0)
            com.bytedance.msdk.api.j.xt r4 = r1.xt
            int r4 = r4.ch()
            com.bytedance.msdk.api.j.xt r0 = r1.xt
            int r0 = r0.s()
            if (r4 <= 0) goto L42
            if (r0 <= 0) goto L42
            com.bytedance.sdk.openadsdk.i.cw.cw.xt$j r4 = r3.j(r4)
            r4.xt(r0)
        L42:
            java.lang.String r4 = "tt_ad_origin_type"
            java.lang.Object r4 = r5.get(r4)
            java.lang.String r5 = "渲染类型错误"
            if (r4 == 0) goto L69
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0 = 1
            if (r4 != r0) goto L59
            r1.j(r2, r3)
            return
        L59:
            r0 = 2
            if (r4 != r0) goto L60
            r1.xt(r2, r3)
            return
        L60:
            com.bytedance.msdk.api.j r2 = new com.bytedance.msdk.api.j
            r2.<init>(r5)
            r1.j(r2)
            return
        L69:
            com.bytedance.msdk.api.j r2 = new com.bytedance.msdk.api.j
            r2.<init>(r5)
            r1.j(r2)
        L71:
            return
    }
}
