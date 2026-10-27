package com.bytedance.adsdk.ugeno.j.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class xt extends com.bytedance.adsdk.ugeno.j.j.j {
    private static final int ae = 0;
    private int cw;

    /* renamed from: m, reason: collision with root package name */
    private android.graphics.Paint f1962m;

    /* renamed from: r, reason: collision with root package name */
    private int f1963r;
    private int up;

    static {
            java.lang.String r0 = "#7ed321"
            int r0 = android.graphics.Color.parseColor(r0)
            com.bytedance.adsdk.ugeno.j.j.xt.ae = r0
            return
    }

    public xt(com.bytedance.adsdk.ugeno.xt.cw r1, org.json.JSONObject r2) {
            r0 = this;
            r0.<init>(r1, r2)
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r0.f1962m = r1
            r2 = 1
            r1.setAntiAlias(r2)
            return
    }

    @Override // com.bytedance.adsdk.ugeno.j.j.j
    public java.util.List<android.animation.PropertyValuesHolder> cw() {
            r2 = this;
            java.lang.String r0 = r2.r()
            r1 = 2
            float[] r1 = new float[r1]
            r1 = {x0018: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofFloat(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.add(r0)
            return r1
    }

    @Override // com.bytedance.adsdk.ugeno.j.j.j
    public void j(int r1, int r2) {
            r0 = this;
            int r1 = r1 / 2
            r0.f1963r = r1
            int r2 = r2 / 2
            r0.up = r2
            return
    }

    @Override // com.bytedance.adsdk.ugeno.j.j.j
    public void j(android.graphics.Canvas r5) {
            r4 = this;
            com.bytedance.adsdk.ugeno.xt.cw r0 = r4.xt     // Catch: java.lang.Throwable -> L50
            float r0 = r0.hh()     // Catch: java.lang.Throwable -> L50
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L52
            android.graphics.Paint r0 = r4.f1962m     // Catch: java.lang.Throwable -> L50
            int r1 = r4.cw     // Catch: java.lang.Throwable -> L50
            r0.setColor(r1)     // Catch: java.lang.Throwable -> L50
            android.graphics.Paint r0 = r4.f1962m     // Catch: java.lang.Throwable -> L50
            com.bytedance.adsdk.ugeno.xt.cw r1 = r4.xt     // Catch: java.lang.Throwable -> L50
            float r1 = r1.hh()     // Catch: java.lang.Throwable -> L50
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r1
            r1 = 1132396544(0x437f0000, float:255.0)
            float r2 = r2 * r1
            int r1 = (int) r2     // Catch: java.lang.Throwable -> L50
            r0.setAlpha(r1)     // Catch: java.lang.Throwable -> L50
            com.bytedance.adsdk.ugeno.xt.cw r0 = r4.xt     // Catch: java.lang.Throwable -> L50
            android.view.View r0 = r0.g()     // Catch: java.lang.Throwable -> L50
            android.view.ViewParent r0 = r0.getParent()     // Catch: java.lang.Throwable -> L50
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch: java.lang.Throwable -> L50
            r1 = 1
            r0.setClipChildren(r1)     // Catch: java.lang.Throwable -> L50
            int r0 = r4.f1963r     // Catch: java.lang.Throwable -> L50
            float r1 = (float) r0     // Catch: java.lang.Throwable -> L50
            int r2 = r4.up     // Catch: java.lang.Throwable -> L50
            float r3 = (float) r2     // Catch: java.lang.Throwable -> L50
            int r0 = java.lang.Math.min(r0, r2)     // Catch: java.lang.Throwable -> L50
            int r0 = r0 * 2
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L50
            com.bytedance.adsdk.ugeno.xt.cw r2 = r4.xt     // Catch: java.lang.Throwable -> L50
            float r2 = r2.hh()     // Catch: java.lang.Throwable -> L50
            float r0 = r0 * r2
            android.graphics.Paint r2 = r4.f1962m     // Catch: java.lang.Throwable -> L50
            r5.drawCircle(r1, r3, r0, r2)     // Catch: java.lang.Throwable -> L50
            return
        L50:
            r5 = move-exception
            goto L53
        L52:
            return
        L53:
            r5.getMessage()
            return
    }

    @Override // com.bytedance.adsdk.ugeno.j.j.j
    public void xt() {
            r2 = this;
            org.json.JSONObject r0 = r2.j
            java.lang.String r1 = "backgroundColor"
            java.lang.String r0 = r0.optString(r1)
            int r1 = com.bytedance.adsdk.ugeno.j.j.xt.ae
            int r0 = com.bytedance.adsdk.ugeno.m.j.j(r0, r1)
            r2.cw = r0
            return
    }
}
