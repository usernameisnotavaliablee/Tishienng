package com.bytedance.adsdk.xt.xt.cw.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class m {
    public m() {
            r0 = this;
            r0.<init>()
            return
    }

    protected int getIdentifier(int r5, java.lang.String r6) {
            r4 = this;
            r0 = 0
        L1:
            int r1 = r0 + r5
            char r2 = r4.j(r1, r6)
            boolean r3 = com.bytedance.adsdk.xt.xt.up.j.xt(r2)
            if (r3 != 0) goto L15
            boolean r2 = com.bytedance.adsdk.xt.xt.up.j.cw(r2)
            if (r2 == 0) goto L14
            goto L15
        L14:
            return r1
        L15:
            int r0 = r0 + 1
            goto L1
    }

    protected char j(int r2, java.lang.String r3) {
            r1 = this;
            int r0 = r3.length()
            if (r2 < r0) goto L9
            r2 = 26
            return r2
        L9:
            char r2 = r3.charAt(r2)
            return r2
    }

    public abstract int j(java.lang.String r1, int r2, java.util.Deque<com.bytedance.adsdk.xt.xt.xt.j> r3, com.bytedance.adsdk.xt.xt.cw.j r4);

    protected int xt(int r2, java.lang.String r3) {
            r1 = this;
        L0:
            char r0 = r1.j(r2, r3)
            boolean r0 = com.bytedance.adsdk.xt.xt.up.j.j(r0)
            if (r0 == 0) goto Ld
            int r2 = r2 + 1
            goto L0
        Ld:
            return r2
    }
}
