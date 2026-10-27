package com.bytedance.msdk.cw.ae.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class xt implements com.bytedance.msdk.cw.ae.j.j {
    public xt() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bytedance.msdk.cw.ae.j.j
    public boolean j(com.bytedance.msdk.cw.m.j.xt r2, com.bytedance.msdk.xt.cw r3, java.util.List<com.bytedance.msdk.core.oq.oq> r4) {
            r1 = this;
            if (r3 == 0) goto L1e
            if (r2 != 0) goto L5
            goto L1e
        L5:
            com.bytedance.msdk.core.oq.xt r0 = r2.vl()
            int r0 = com.bytedance.msdk.cw.tl.m.j(r0, r3)
            com.bytedance.msdk.cw.m.j.j r2 = r2.jy()
            int r2 = r2.m(r0)
            if (r2 != 0) goto L19
            r2 = 1
            return r2
        L19:
            boolean r2 = r1.j(r3, r4)
            return r2
        L1e:
            r2 = 0
            return r2
    }

    protected boolean j(com.bytedance.msdk.xt.cw r3, java.util.List<com.bytedance.msdk.core.oq.oq> r4) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L44
            java.lang.String r1 = r3.qa()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto Le
            goto L44
        Le:
            boolean r1 = r3.qe()
            if (r1 != 0) goto L15
            return r0
        L15:
            boolean r1 = com.bytedance.msdk.tl.p.j(r4)
            if (r1 == 0) goto L1c
            return r0
        L1c:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.addAll(r4)
            java.util.Collections.sort(r1)
            boolean r4 = com.bytedance.msdk.tl.p.xt(r1)
            if (r4 == 0) goto L2e
            return r0
        L2e:
            java.lang.String r3 = r3.qa()
            java.lang.Object r4 = r1.get(r0)
            com.bytedance.msdk.core.oq.oq r4 = (com.bytedance.msdk.core.oq.oq) r4
            java.lang.String r4 = r4.w()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L44
            r3 = 1
            return r3
        L44:
            return r0
    }
}
