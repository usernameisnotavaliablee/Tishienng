package com.bytedance.adsdk.ugeno.up.cw;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class tl extends com.bytedance.adsdk.ugeno.up.cw.xt implements com.bytedance.adsdk.ugeno.m.g.j {
    private int qv;
    private android.os.Handler vl;

    public tl(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r2 = 500(0x1f4, float:7.0E-43)
            r1.qv = r2
            com.bytedance.adsdk.ugeno.m.g r2 = new com.bytedance.adsdk.ugeno.m.g
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r2.<init>(r0, r1)
            r1.vl = r2
            return
    }

    private boolean j(com.bytedance.adsdk.ugeno.xt.cw r3, android.view.MotionEvent r4) {
            r2 = this;
            int r3 = r4.getAction()
            r4 = 1101(0x44d, float:1.543E-42)
            if (r3 == 0) goto L15
            r0 = 1
            if (r3 == r0) goto Lf
            r0 = 3
            if (r3 == r0) goto Lf
            goto L1d
        Lf:
            android.os.Handler r3 = r2.vl
            r3.removeMessages(r4)
            goto L1d
        L15:
            android.os.Handler r3 = r2.vl
            int r0 = r2.qv
            long r0 = (long) r0
            r3.sendEmptyMessageDelayed(r4, r0)
        L1d:
            r3 = 0
            return r3
    }

    @Override // com.bytedance.adsdk.ugeno.m.g.j
    public void j(android.os.Message r5) {
            r4 = this;
            int r5 = r5.what
            r0 = 1101(0x44d, float:1.543E-42)
            if (r5 == r0) goto L7
            goto L1f
        L7:
            com.bytedance.adsdk.ugeno.up.qv r5 = r4.j
            if (r5 == 0) goto L18
            com.bytedance.adsdk.ugeno.xt.cw r1 = r4.xt
            java.lang.String r2 = r4.f1985m
            com.bytedance.adsdk.ugeno.up.m r3 = r4.cw
            java.util.List r3 = r3.xt()
            r5.j(r1, r2, r3)
        L18:
            android.os.Handler r5 = r4.vl
            if (r5 == 0) goto L1f
            r5.removeMessages(r0)
        L1f:
            return
    }

    @Override // com.bytedance.adsdk.ugeno.up.cw.xt
    public boolean j(java.lang.Object... r3) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L24
            int r1 = r3.length
            if (r1 > 0) goto L7
            goto L24
        L7:
            r3 = r3[r0]
            android.view.MotionEvent r3 = (android.view.MotionEvent) r3
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.up
            java.lang.String r1 = "delay"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r1 = 500(0x1f4, float:7.0E-43)
            int r0 = com.bytedance.adsdk.ugeno.m.cw.j(r0, r1)
            r2.qv = r0
            com.bytedance.adsdk.ugeno.xt.cw r0 = r2.xt
            boolean r3 = r2.j(r0, r3)
            return r3
        L24:
            return r0
    }
}
