package com.bytedance.msdk.cw.ae.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class cw implements com.bytedance.msdk.cw.ae.xt.j {
    private android.os.Handler j;
    private com.bytedance.msdk.cw.ae.xt.xt xt;

    public cw() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bytedance.msdk.cw.ae.xt.j
    public void j() {
            r2 = this;
            android.os.Handler r0 = r2.j
            if (r0 == 0) goto L1a
            com.bytedance.msdk.cw.ae.xt.xt r0 = r2.xt
            if (r0 == 0) goto L1a
            boolean r0 = r0.j()
            if (r0 != 0) goto L1a
            android.os.Handler r0 = r2.j
            com.bytedance.msdk.cw.ae.xt.xt r1 = r2.xt
            r0.removeCallbacks(r1)
            com.bytedance.msdk.cw.ae.xt.xt r0 = r2.xt
            r0.run()
        L1a:
            return
    }

    @Override // com.bytedance.msdk.cw.ae.xt.j
    public void j(android.os.Handler r4, com.bytedance.msdk.core.oq.xt r5, com.bytedance.msdk.cw.ae.xt.xt r6) {
            r3 = this;
            r3.j = r4
            r3.xt = r6
            if (r4 == 0) goto L1d
            if (r6 == 0) goto L1d
            if (r5 == 0) goto L1d
            java.util.Map r0 = r5.up()
            java.lang.String r1 = "serverBidding_timeout"
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.put(r1, r2)
            int r5 = r5.ae()
            long r0 = (long) r5
            r4.postDelayed(r6, r0)
        L1d:
            return
    }
}
