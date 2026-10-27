package com.bytedance.adsdk.xt.xt.cw.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class cw extends com.bytedance.adsdk.xt.xt.cw.j.m {
    public cw() {
            r0 = this;
            r0.<init>()
            return
    }

    private int j(java.lang.String r5, int r6, java.util.Deque<com.bytedance.adsdk.xt.xt.xt.j> r7) {
            r4 = this;
            r0 = 0
        L1:
            int r1 = r0 + r6
            char r2 = r4.j(r1, r5)
            boolean r3 = com.bytedance.adsdk.xt.xt.up.j.xt(r2)
            if (r3 != 0) goto L48
            boolean r3 = com.bytedance.adsdk.xt.xt.up.j.cw(r2)
            if (r3 != 0) goto L48
            r3 = 46
            if (r3 == r2) goto L48
            r3 = 91
            if (r3 == r2) goto L48
            r3 = 93
            if (r3 == r2) goto L48
            r3 = 95
            if (r3 == r2) goto L48
            r3 = 45
            if (r3 == r2) goto L48
            r3 = 36
            if (r3 != r2) goto L2c
            goto L48
        L2c:
            java.lang.String r5 = r5.substring(r6, r1)
            com.bytedance.adsdk.xt.xt.r.j r6 = com.bytedance.adsdk.xt.xt.r.j.j(r5)
            if (r6 == 0) goto L3f
            com.bytedance.adsdk.xt.xt.xt.j.ae r6 = new com.bytedance.adsdk.xt.xt.xt.j.ae
            r6.<init>(r5)
            r7.push(r6)
            return r1
        L3f:
            com.bytedance.adsdk.xt.xt.xt.j.f r6 = new com.bytedance.adsdk.xt.xt.xt.j.f
            r6.<init>(r5)
            r7.push(r6)
            return r1
        L48:
            int r0 = r0 + 1
            goto L1
    }

    @Override // com.bytedance.adsdk.xt.xt.cw.j.m
    public int j(java.lang.String r3, int r4, java.util.Deque<com.bytedance.adsdk.xt.xt.xt.j> r5, com.bytedance.adsdk.xt.xt.cw.j r6) {
            r2 = this;
            char r0 = r2.j(r4, r3)
            boolean r1 = com.bytedance.adsdk.xt.xt.up.j.xt(r0)
            if (r1 != 0) goto L13
            r1 = 36
            if (r0 == r1) goto L13
            int r3 = r6.j(r3, r4, r5)
            return r3
        L13:
            int r3 = r2.j(r3, r4, r5)
            return r3
    }
}
