package com.bytedance.msdk.cw.cw.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class cw implements com.bytedance.msdk.cw.cw.j.j {
    public cw() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bytedance.msdk.cw.cw.j.j
    public void j(com.bytedance.msdk.cw.cw.j.j.InterfaceC0233j r8) {
            r7 = this;
            com.bytedance.msdk.cw.m.j.xt r0 = r8.j()
            com.bytedance.msdk.api.j.xt r1 = r0.mi()
            com.bytedance.msdk.core.oq.xt r2 = r0.vl()
            com.bytedance.msdk.core.oq.xt r3 = com.bytedance.msdk.core.cw.cw.j(r1, r2)
            if (r3 == 0) goto L33
            int r2 = r1.cw()
            r4 = 2
            if (r2 == r4) goto L27
            int r2 = r1.cw()
            r4 = 4
            if (r2 == r4) goto L27
            int r2 = r1.cw()
            r4 = 5
            if (r2 != r4) goto L32
        L27:
            com.bytedance.msdk.core.up.xt.r r2 = com.bytedance.msdk.core.up.xt.r.j()
            java.lang.String r4 = r1.v()
            r2.j(r4, r1)
        L32:
            r2 = r3
        L33:
            java.util.List r3 = r2.ol()
            if (r3 == 0) goto L4f
            java.util.List r3 = r2.ol()
            int r3 = r3.size()
            if (r3 != 0) goto L44
            goto L4f
        L44:
            r0.j(r2)
            com.bytedance.msdk.cw.m.j.xt r0 = r8.j()
            r8.j(r0)
            return
        L4f:
            com.bytedance.msdk.core.oq.xt r8 = r0.vl()
            if (r8 == 0) goto L5f
            com.bytedance.msdk.core.oq.xt r8 = r0.vl()
            java.lang.String r8 = r8.hh()
        L5d:
            r2 = r8
            goto L61
        L5f:
            r8 = 0
            goto L5d
        L61:
            boolean r8 = r0.v()
            r3 = r8 ^ 1
            com.bytedance.msdk.core.oq.g r8 = r0.wq()
            java.lang.String r4 = r8.j
            r5 = 810085(0xc5c65, float:1.135171E-39)
            r6 = 0
            com.bytedance.msdk.up.m.j(r1, r2, r3, r4, r5, r6)
            com.bytedance.msdk.api.j r8 = new com.bytedance.msdk.api.j
            r1 = 810085(0xc5c65, float:1.135171E-39)
            java.lang.String r2 = com.bytedance.msdk.api.j.j(r1)
            r8.<init>(r1, r2)
            r0.j(r8)
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
