package com.bytedance.adsdk.xt.xt.cw.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class up extends com.bytedance.adsdk.xt.xt.cw.j.m {
    public up() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bytedance.adsdk.xt.xt.cw.j.m
    public int j(java.lang.String r4, int r5, java.util.Deque<com.bytedance.adsdk.xt.xt.xt.j> r6, com.bytedance.adsdk.xt.xt.cw.j r7) {
            r3 = this;
            r0 = r5
        L1:
            char r1 = r3.j(r0, r4)
            boolean r2 = com.bytedance.adsdk.xt.xt.up.j.xt(r1)
            if (r2 != 0) goto L2a
            boolean r2 = com.bytedance.adsdk.xt.xt.up.j.cw(r1)
            if (r2 == 0) goto L12
            goto L2a
        L12:
            r2 = 40
            if (r1 == r2) goto L1b
            int r4 = r7.j(r4, r5, r6)
            return r4
        L1b:
            java.lang.String r4 = r4.substring(r5, r0)
            com.bytedance.adsdk.xt.xt.xt.j.oq r5 = new com.bytedance.adsdk.xt.xt.xt.j.oq
            r5.<init>(r4)
            r6.push(r5)
            int r0 = r0 + 1
            return r0
        L2a:
            int r0 = r0 + 1
            goto L1
    }
}
