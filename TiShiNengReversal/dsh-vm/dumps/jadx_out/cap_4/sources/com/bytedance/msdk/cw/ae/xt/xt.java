package com.bytedance.msdk.cw.ae.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class xt implements java.lang.Runnable {
    private boolean cw;
    private com.bytedance.msdk.core.oq.xt j;
    private java.lang.Runnable xt;

    public xt(com.bytedance.msdk.core.oq.xt r2, java.lang.Runnable r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.cw = r0
            r1.j = r2
            r1.xt = r3
            return
    }

    public boolean j() {
            r1 = this;
            boolean r0 = r1.cw
            return r0
    }

    @Override // java.lang.Runnable
    public void run() {
            r3 = this;
            com.bytedance.msdk.core.oq.xt r0 = r3.j
            if (r0 == 0) goto L18
            int r0 = r0.m()
            r1 = 4
            if (r0 != r1) goto L18
            com.bytedance.msdk.core.oq.xt r0 = r3.j
            java.util.Map r0 = r0.up()
            java.lang.String r1 = "serverBidding_timeout"
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.put(r1, r2)
        L18:
            r0 = 1
            r3.cw = r0
            java.lang.Runnable r0 = r3.xt
            if (r0 == 0) goto L22
            r0.run()
        L22:
            return
    }
}
