package com.bytedance.adsdk.j.j.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class vl extends com.bytedance.adsdk.j.j.j.up {
    static final int j = 0;
    int cw;
    byte[] tl;
    int xt;

    static {
            java.lang.String r0 = "IHDR"
            int r0 = com.bytedance.adsdk.j.j.j.up.j(r0)
            com.bytedance.adsdk.j.j.j.vl.j = r0
            return
    }

    vl() {
            r1 = this;
            r1.<init>()
            r0 = 5
            byte[] r0 = new byte[r0]
            r1.tl = r0
            return
    }

    @Override // com.bytedance.adsdk.j.j.j.up
    void j(com.bytedance.adsdk.j.j.xt.j r4) throws java.io.IOException {
            r3 = this;
            int r0 = r4.xt()
            r3.xt = r0
            int r0 = r4.xt()
            r3.cw = r0
            byte[] r0 = r3.tl
            r1 = 0
            int r2 = r0.length
            r4.j(r0, r1, r2)
            return
    }
}
