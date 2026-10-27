package com.bytedance.msdk.cw.cw.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class m implements com.bytedance.msdk.cw.cw.j.j {
    public m() {
            r0 = this;
            r0.<init>()
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
    public void j(com.bytedance.msdk.cw.cw.j.j.InterfaceC0233j r10) {
            r9 = this;
            com.bytedance.msdk.cw.m.j.xt r0 = r10.j()
            com.bytedance.msdk.api.j.xt r1 = r0.mi()
            java.lang.String r1 = r1.v()
            com.bytedance.msdk.core.oq.xt r2 = r0.vl()
            if (r2 == 0) goto Laf
            boolean r2 = r2.oq()
            if (r2 == 0) goto Laf
            com.bytedance.msdk.core.tl.jy r2 = com.bytedance.msdk.core.tl.jy.j()
            java.lang.String r3 = java.lang.String.valueOf(r1)
            boolean r2 = r2.tl(r3)
            java.lang.String r3 = "TMe"
            java.lang.String r4 = ""
            if (r2 != 0) goto L5b
            java.lang.String r10 = "广告位 请求触发次数拦截............"
            com.bytedance.msdk.j.up.cw.xt(r3, r10)
            com.bytedance.msdk.core.tl.jy r10 = com.bytedance.msdk.core.tl.jy.j()
            android.util.Pair r10 = r10.m(r1)
            com.bytedance.msdk.api.xt.xt r1 = new com.bytedance.msdk.api.xt.xt
            r2 = 840041(0xcd169, float:1.177148E-39)
            java.lang.String r3 = com.bytedance.msdk.api.j.j(r2)
            if (r10 == 0) goto L47
            java.lang.Object r5 = r10.second
            java.lang.String r5 = (java.lang.String) r5
            goto L48
        L47:
            r5 = r4
        L48:
            if (r10 == 0) goto L4f
            java.lang.Object r10 = r10.first
            r4 = r10
            java.lang.String r4 = (java.lang.String) r4
        L4f:
            r1.<init>(r2, r3, r5, r4)
            int r10 = r1.j
            r9.j(r0, r10)
            r0.j(r1)
            return
        L5b:
            com.bytedance.msdk.core.tl.jy r2 = com.bytedance.msdk.core.tl.jy.j()
            java.lang.String r5 = java.lang.String.valueOf(r1)
            boolean r2 = r2.cw(r5)
            if (r2 != 0) goto Laf
            boolean r2 = r0.v()
            if (r2 != 0) goto Laf
            java.lang.String r10 = "广告位 请求触发时间间隔拦截............"
            com.bytedance.msdk.j.up.cw.xt(r3, r10)
            com.bytedance.msdk.core.tl.jy r10 = com.bytedance.msdk.core.tl.jy.j()
            java.lang.String r2 = java.lang.String.valueOf(r1)
            com.bytedance.msdk.core.tl.g r10 = r10.up(r2)
            com.bytedance.msdk.api.xt.cw r2 = new com.bytedance.msdk.api.xt.cw
            r3 = 840042(0xcd16a, float:1.17715E-39)
            java.lang.String r5 = com.bytedance.msdk.api.j.j(r3)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            com.bytedance.msdk.core.tl.jy r7 = com.bytedance.msdk.core.tl.jy.j()
            long r7 = r7.j(r1)
            r6.append(r7)
            java.lang.String r1 = r6.toString()
            if (r10 == 0) goto La3
            java.lang.String r4 = r10.oq()
        La3:
            r2.<init>(r3, r5, r1, r4)
            int r10 = r2.j
            r9.j(r0, r10)
            r0.j(r2)
            return
        Laf:
            com.bytedance.msdk.cw.m.j.xt r0 = r10.j()
            r10.j(r0)
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
