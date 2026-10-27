package com.bytedance.msdk.cw.cw.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class jy implements com.bytedance.msdk.cw.cw.j.j {
    public jy() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bytedance.msdk.cw.cw.j.j
    public void j(com.bytedance.msdk.cw.cw.j.j.InterfaceC0233j r9) {
            r8 = this;
            com.bytedance.msdk.cw.m.j.xt r0 = r9.j()
            com.bytedance.msdk.api.j.xt r1 = r0.mi()
            java.lang.String r2 = r1.uf()
            java.lang.String r2 = com.bytedance.msdk.core.az.j.j(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L79
            r3 = 2
            r1.r(r3)
            com.bytedance.msdk.core.oq.xt r3 = r0.vl()
            com.bytedance.msdk.core.oq.xt r3 = com.bytedance.msdk.core.az.j.j(r3, r2)
            if (r3 == 0) goto L51
            r0.j(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = com.bytedance.msdk.j.up.up.j(r3)
            r0.append(r3)
            java.lang.String r3 = "测试工具加载广告........rit_id:"
            r0.append(r3)
            java.lang.String r1 = r1.v()
            r0.append(r1)
            java.lang.String r1 = " ,slot_id:"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TTMediationSDK"
            com.bytedance.msdk.j.up.cw.r(r1, r0)
            goto L79
        L51:
            com.bytedance.msdk.api.j.xt r2 = r0.mi()
            boolean r9 = r0.v()
            r4 = r9 ^ 1
            com.bytedance.msdk.core.oq.g r9 = r0.wq()
            java.lang.String r5 = r9.j
            r6 = 81012(0x13c74, float:1.13522E-40)
            r7 = 0
            r3 = 0
            com.bytedance.msdk.up.m.j(r2, r3, r4, r5, r6, r7)
            com.bytedance.msdk.api.xt.j r9 = new com.bytedance.msdk.api.xt.j
            r1 = 81012(0x13c74, float:1.13522E-40)
            java.lang.String r2 = com.bytedance.msdk.api.j.j(r1)
            r9.<init>(r1, r2)
            r0.j(r9)
            return
        L79:
            com.bytedance.msdk.cw.m.j.xt r0 = r9.j()
            r9.j(r0)
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
