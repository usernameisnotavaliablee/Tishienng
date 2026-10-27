package com.bytedance.adsdk.ugeno.cw.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class m implements com.bytedance.adsdk.ugeno.m.g.j {
    private android.os.Handler ae;
    private com.bytedance.adsdk.ugeno.cw.w cw;
    private boolean j;

    /* renamed from: m, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.xt.cw f1932m;

    /* renamed from: r, reason: collision with root package name */
    private android.content.Context f1933r;
    private com.bytedance.adsdk.ugeno.cw.av up;
    private int xt;

    public m(android.content.Context r3, com.bytedance.adsdk.ugeno.cw.av r4, com.bytedance.adsdk.ugeno.xt.cw r5) {
            r2 = this;
            r2.<init>()
            com.bytedance.adsdk.ugeno.m.g r0 = new com.bytedance.adsdk.ugeno.m.g
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1, r2)
            r2.ae = r0
            r2.f1933r = r3
            r2.up = r4
            r2.f1932m = r5
            return
    }

    public void j() {
            r4 = this;
            com.bytedance.adsdk.ugeno.cw.av r0 = r4.up
            if (r0 != 0) goto L5
            return
        L5:
            org.json.JSONObject r0 = r0.cw()
            java.lang.String r1 = "interval"
            java.lang.String r2 = "8000"
            java.lang.String r1 = r0.optString(r1, r2)
            com.bytedance.adsdk.ugeno.xt.cw r2 = r4.f1932m
            org.json.JSONObject r2 = r2.oq()
            java.lang.String r1 = com.bytedance.adsdk.ugeno.r.xt.j(r1, r2)
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L34
            r4.xt = r1     // Catch: java.lang.NumberFormatException -> L34
            java.lang.String r1 = "repeat"
            boolean r0 = r0.optBoolean(r1)     // Catch: java.lang.NumberFormatException -> L34
            r4.j = r0     // Catch: java.lang.NumberFormatException -> L34
            android.os.Handler r0 = r4.ae     // Catch: java.lang.NumberFormatException -> L34
            int r1 = r4.xt     // Catch: java.lang.NumberFormatException -> L34
            long r1 = (long) r1     // Catch: java.lang.NumberFormatException -> L34
            r3 = 1001(0x3e9, float:1.403E-42)
            r0.sendEmptyMessageDelayed(r3, r1)     // Catch: java.lang.NumberFormatException -> L34
            return
        L34:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
            return
    }

    @Override // com.bytedance.adsdk.ugeno.m.g.j
    public void j(android.os.Message r4) {
            r3 = this;
            int r4 = r4.what
            r0 = 1001(0x3e9, float:1.403E-42)
            if (r4 == r0) goto L7
            return
        L7:
            com.bytedance.adsdk.ugeno.cw.w r4 = r3.cw
            if (r4 == 0) goto L12
            com.bytedance.adsdk.ugeno.cw.av r1 = r3.up
            com.bytedance.adsdk.ugeno.xt.cw r2 = r3.f1932m
            r4.j(r1, r2, r2)
        L12:
            boolean r4 = r3.j
            if (r4 == 0) goto L1f
            android.os.Handler r4 = r3.ae
            int r1 = r3.xt
            long r1 = (long) r1
            r4.sendEmptyMessageDelayed(r0, r1)
            return
        L1f:
            android.os.Handler r4 = r3.ae
            r4.removeMessages(r0)
            return
    }

    public void j(com.bytedance.adsdk.ugeno.cw.w r1) {
            r0 = this;
            r0.cw = r1
            return
    }
}
