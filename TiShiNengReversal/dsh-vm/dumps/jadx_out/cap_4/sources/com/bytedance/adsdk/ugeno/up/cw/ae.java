package com.bytedance.adsdk.ugeno.up.cw;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ae extends com.bytedance.adsdk.ugeno.up.cw.xt implements com.bytedance.adsdk.ugeno.m.g.j {
    private android.os.Handler jy;
    private int qv;
    private boolean vl;

    public ae(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r2 = 500(0x1f4, float:7.0E-43)
            r1.qv = r2
            com.bytedance.adsdk.ugeno.m.g r2 = new com.bytedance.adsdk.ugeno.m.g
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r2.<init>(r0, r1)
            r1.jy = r2
            return
    }

    private boolean j(com.bytedance.adsdk.ugeno.xt.cw r6, android.view.MotionEvent r7) {
            r5 = this;
            int r6 = r7.getAction()
            r7 = 1
            r0 = 1102(0x44e, float:1.544E-42)
            if (r6 == 0) goto L43
            r1 = 0
            if (r6 == r7) goto L1a
            r2 = 3
            if (r6 == r2) goto L10
            goto L4b
        L10:
            android.os.Handler r6 = r5.jy
            if (r6 == 0) goto L17
            r6.removeMessages(r0)
        L17:
            r5.vl = r1
            goto L4b
        L1a:
            boolean r6 = r5.vl
            if (r6 == 0) goto L39
            com.bytedance.adsdk.ugeno.up.qv r6 = r5.j
            if (r6 == 0) goto L39
            com.bytedance.adsdk.ugeno.xt.cw r2 = r5.xt
            java.lang.String r3 = r5.f1985m
            com.bytedance.adsdk.ugeno.up.m r4 = r5.cw
            java.util.List r4 = r4.xt()
            r6.j(r2, r3, r4)
            r5.vl = r1
            android.os.Handler r6 = r5.jy
            if (r6 == 0) goto L38
            r6.removeMessages(r0)
        L38:
            return r7
        L39:
            android.os.Handler r6 = r5.jy
            if (r6 == 0) goto L40
            r6.removeMessages(r0)
        L40:
            r5.vl = r1
            return r1
        L43:
            android.os.Handler r6 = r5.jy
            int r1 = r5.qv
            long r1 = (long) r1
            r6.sendEmptyMessageDelayed(r0, r1)
        L4b:
            return r7
    }

    @Override // com.bytedance.adsdk.ugeno.m.g.j
    public void j(android.os.Message r2) {
            r1 = this;
            int r2 = r2.what
            r0 = 1102(0x44e, float:1.544E-42)
            if (r2 == r0) goto L7
            goto L11
        L7:
            r2 = 1
            r1.vl = r2
            android.os.Handler r2 = r1.jy
            if (r2 == 0) goto L11
            r2.removeMessages(r0)
        L11:
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
