package com.bytedance.adsdk.ugeno.widget.cw;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class j extends com.bytedance.adsdk.ugeno.xt.j<com.bytedance.adsdk.ugeno.widget.frame.UGFrameLayout> {
    public j(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.bytedance.adsdk.ugeno.xt.cw
    public void j(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            super.j(r3, r4)
            r3.getClass()
            int r0 = r3.hashCode()
            r1 = -1
            switch(r0) {
                case -411339735: goto L3b;
                case 1139576207: goto L30;
                case 1302043440: goto L25;
                case 1479592233: goto L1a;
                case 1708332410: goto Lf;
                default: goto Le;
            }
        Le:
            goto L45
        Lf:
            java.lang.String r0 = "onVideoPause"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L18
            goto L45
        L18:
            r1 = 4
            goto L45
        L1a:
            java.lang.String r0 = "onVideoResume"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L23
            goto L45
        L23:
            r1 = 3
            goto L45
        L25:
            java.lang.String r0 = "onVideoPlay"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L2e
            goto L45
        L2e:
            r1 = 2
            goto L45
        L30:
            java.lang.String r0 = "onVideoFinish"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L39
            goto L45
        L39:
            r1 = 1
            goto L45
        L3b:
            java.lang.String r0 = "onVideoProgress"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L44
            goto L45
        L44:
            r1 = 0
        L45:
            switch(r1) {
                case 0: goto L49;
                case 1: goto L49;
                case 2: goto L49;
                case 3: goto L49;
                case 4: goto L49;
                default: goto L48;
            }
        L48:
            return
        L49:
            r2.xt(r3, r4)
            return
    }

    @Override // com.bytedance.adsdk.ugeno.xt.j, com.bytedance.adsdk.ugeno.xt.cw
    public void xt() {
            r0 = this;
            super.xt()
            return
    }
}
