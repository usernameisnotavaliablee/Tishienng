package com.bytedance.adsdk.ugeno.up.cw;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class m extends com.bytedance.adsdk.ugeno.up.cw.xt implements com.bytedance.adsdk.ugeno.m.g.j {
    private android.os.Handler jy;
    private int qv;
    private int vl;
    private int ws;

    public m(android.content.Context r3) {
            r2 = this;
            r2.<init>(r3)
            r3 = 0
            r2.vl = r3
            com.bytedance.adsdk.ugeno.m.g r0 = new com.bytedance.adsdk.ugeno.m.g
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1, r2)
            r2.jy = r0
            r2.ws = r3
            return
    }

    @Override // com.bytedance.adsdk.ugeno.m.g.j
    public void j(android.os.Message r5) {
            r4 = this;
            int r5 = r5.what
            r0 = 1001(0x3e9, float:1.403E-42)
            if (r5 == r0) goto L7
            return
        L7:
            com.bytedance.adsdk.ugeno.up.qv r5 = r4.j
            com.bytedance.adsdk.ugeno.xt.cw r1 = r4.xt
            java.lang.String r2 = r4.f1985m
            com.bytedance.adsdk.ugeno.up.m r3 = r4.cw
            java.util.List r3 = r3.xt()
            r5.j(r1, r2, r3)
            int r5 = r4.ws
            int r5 = r5 + (-1)
            r4.ws = r5
            if (r5 >= 0) goto L29
            int r1 = r4.vl
            if (r1 == 0) goto L29
            android.os.Handler r5 = r4.jy
            long r1 = (long) r1
            r5.sendEmptyMessageDelayed(r0, r1)
            return
        L29:
            if (r5 <= 0) goto L36
            int r5 = r4.vl
            if (r5 == 0) goto L36
            android.os.Handler r1 = r4.jy
            long r2 = (long) r5
            r1.sendEmptyMessageDelayed(r0, r2)
            return
        L36:
            android.os.Handler r5 = r4.jy
            r5.removeMessages(r0)
            return
    }

    @Override // com.bytedance.adsdk.ugeno.up.cw.xt
    public boolean j(java.lang.Object... r4) {
            r3 = this;
            java.util.Map<java.lang.String, java.lang.String> r4 = r3.up
            if (r4 == 0) goto L2b
            java.lang.String r0 = "loop"
            java.lang.Object r4 = r4.get(r0)
            java.lang.String r4 = (java.lang.String) r4
            r0 = 0
            int r4 = com.bytedance.adsdk.ugeno.m.cw.j(r4, r0)
            r3.qv = r4
            if (r4 > 0) goto L19
            r4 = -1
            r3.ws = r4
            goto L1b
        L19:
            r3.ws = r4
        L1b:
            java.util.Map<java.lang.String, java.lang.String> r4 = r3.up
            java.lang.String r1 = "duration"
            java.lang.Object r4 = r4.get(r1)
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.bytedance.adsdk.ugeno.m.cw.j(r4, r0)
            r3.vl = r4
        L2b:
            android.os.Handler r4 = r3.jy
            int r0 = r3.vl
            long r0 = (long) r0
            r2 = 1001(0x3e9, float:1.403E-42)
            r4.sendEmptyMessageDelayed(r2, r0)
            r4 = 1
            return r4
    }
}
