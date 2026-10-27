package com.bytedance.adsdk.ugeno.cw.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class xt implements com.bytedance.adsdk.ugeno.m.g.j {
    private android.content.Context cw;
    private int j;

    /* renamed from: m, reason: collision with root package name */
    private android.os.Handler f1936m;

    /* renamed from: r, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.cw.av f1937r;
    private com.bytedance.adsdk.ugeno.xt.cw up;
    private com.bytedance.adsdk.ugeno.cw.w xt;

    public xt(android.content.Context r3, com.bytedance.adsdk.ugeno.cw.av r4, com.bytedance.adsdk.ugeno.xt.cw r5) {
            r2 = this;
            r2.<init>()
            com.bytedance.adsdk.ugeno.m.g r0 = new com.bytedance.adsdk.ugeno.m.g
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1, r2)
            r2.f1936m = r0
            r2.cw = r3
            r2.f1937r = r4
            r2.up = r5
            return
    }

    public void j() {
            r5 = this;
            com.bytedance.adsdk.ugeno.cw.av r0 = r5.f1937r
            if (r0 != 0) goto L5
            return
        L5:
            org.json.JSONObject r0 = r0.cw()
            java.lang.String r1 = "delay"
            java.lang.String r0 = r0.optString(r1)
            com.bytedance.adsdk.ugeno.xt.cw r1 = r5.up
            org.json.JSONObject r1 = r1.oq()
            java.lang.String r0 = com.bytedance.adsdk.ugeno.r.xt.j(r0, r1)
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L28
            r5.j = r0     // Catch: java.lang.NumberFormatException -> L28
            android.os.Handler r1 = r5.f1936m     // Catch: java.lang.NumberFormatException -> L28
            r2 = 1001(0x3e9, float:1.403E-42)
            long r3 = (long) r0     // Catch: java.lang.NumberFormatException -> L28
            r1.sendEmptyMessageDelayed(r2, r3)     // Catch: java.lang.NumberFormatException -> L28
            return
        L28:
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
            com.bytedance.adsdk.ugeno.cw.av r4 = r3.f1937r
            org.json.JSONObject r4 = r4.cw()
            java.lang.String r1 = "type"
            java.lang.String r1 = r4.optString(r1)
            java.lang.String r2 = "onAnimation"
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 == 0) goto L42
            java.lang.String r1 = "nodeId"
            java.lang.String r1 = r4.optString(r1)
            com.bytedance.adsdk.ugeno.xt.cw r2 = r3.up
            com.bytedance.adsdk.ugeno.xt.cw r2 = r2.xt(r2)
            com.bytedance.adsdk.ugeno.xt.cw r1 = r2.r(r1)
            java.lang.String r2 = "animatorSet"
            org.json.JSONObject r4 = r4.optJSONObject(r2)
            com.bytedance.adsdk.ugeno.cw.j r4 = com.bytedance.adsdk.ugeno.cw.j.j(r4, r1)
            com.bytedance.adsdk.ugeno.cw.jy r2 = new com.bytedance.adsdk.ugeno.cw.jy
            android.view.View r1 = r1.g()
            r2.<init>(r1, r4)
            r2.j()
            goto L4d
        L42:
            com.bytedance.adsdk.ugeno.cw.w r4 = r3.xt
            if (r4 == 0) goto L4d
            com.bytedance.adsdk.ugeno.cw.av r1 = r3.f1937r
            com.bytedance.adsdk.ugeno.xt.cw r2 = r3.up
            r4.j(r1, r2, r2)
        L4d:
            android.os.Handler r4 = r3.f1936m
            r4.removeMessages(r0)
            return
    }

    public void j(com.bytedance.adsdk.ugeno.cw.w r1) {
            r0 = this;
            r0.xt = r1
            return
    }
}
