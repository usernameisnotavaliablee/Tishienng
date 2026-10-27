package com.bytedance.adsdk.ugeno.j.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class r extends com.bytedance.adsdk.ugeno.j.j.j {
    private static final float av = 0.0f;
    private static final float az = 0.0f;
    private static final float i = 0.0f;
    private static final float ws = 0.0f;
    private int ae;
    private int cw;
    private float g;
    private android.graphics.Path jy;

    /* renamed from: m, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.m.j.C0190j f1957m;
    private int oq;
    private int qv;

    /* renamed from: r, reason: collision with root package name */
    private android.graphics.Paint f1958r;
    private int tl;
    private android.graphics.Path up;
    private boolean vl;

    /* renamed from: w, reason: collision with root package name */
    private float f1959w;

    static {
            r0 = 4629137466983448576(0x403e000000000000, double:30.0)
            double r0 = java.lang.Math.toRadians(r0)
            float r0 = (float) r0
            com.bytedance.adsdk.ugeno.j.j.r.ws = r0
            double r1 = (double) r0
            double r1 = java.lang.Math.tan(r1)
            float r1 = (float) r1
            com.bytedance.adsdk.ugeno.j.j.r.az = r1
            double r1 = (double) r0
            double r1 = java.lang.Math.cos(r1)
            float r1 = (float) r1
            com.bytedance.adsdk.ugeno.j.j.r.av = r1
            double r0 = (double) r0
            double r0 = java.lang.Math.sin(r0)
            float r0 = (float) r0
            com.bytedance.adsdk.ugeno.j.j.r.i = r0
            return
    }

    public r(com.bytedance.adsdk.ugeno.xt.cw r1, org.json.JSONObject r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 1
            r0.vl = r1
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r0.f1958r = r2
            r2.setAntiAlias(r1)
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r0.up = r1
            com.bytedance.adsdk.ugeno.xt.cw r1 = r0.xt
            float r1 = r1.tj()
            r0.g = r1
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r0.jy = r1
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
    public void j(int r3, int r4) {
            r2 = this;
            r2.oq = r3
            r2.qv = r4
            android.graphics.RectF r0 = new android.graphics.RectF     // Catch: java.lang.Throwable -> L15
            float r3 = (float) r3     // Catch: java.lang.Throwable -> L15
            float r4 = (float) r4     // Catch: java.lang.Throwable -> L15
            r1 = 0
            r0.<init>(r1, r1, r3, r4)     // Catch: java.lang.Throwable -> L15
            android.graphics.Path r3 = r2.up     // Catch: java.lang.Throwable -> L15
            float r4 = r2.g     // Catch: java.lang.Throwable -> L15
            android.graphics.Path$Direction r1 = android.graphics.Path.Direction.CW     // Catch: java.lang.Throwable -> L15
            r3.addRoundRect(r0, r4, r4, r1)     // Catch: java.lang.Throwable -> L15
        L15:
            return
    }

    @Override // com.bytedance.adsdk.ugeno.j.j.j
    @android.annotation.SuppressLint({"DrawAllocation"})
    public void j(android.graphics.Canvas r13) {
            r12 = this;
            com.bytedance.adsdk.ugeno.xt.cw r0 = r12.xt     // Catch: java.lang.Throwable -> L97
            float r0 = r0.z()     // Catch: java.lang.Throwable -> L97
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L97
            int r0 = r12.oq     // Catch: java.lang.Throwable -> L97
            float r2 = (float) r0     // Catch: java.lang.Throwable -> L97
            float r3 = com.bytedance.adsdk.ugeno.j.j.r.az     // Catch: java.lang.Throwable -> L97
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L97
            float r0 = r0 * r3
            float r2 = r2 + r0
            com.bytedance.adsdk.ugeno.xt.cw r0 = r12.xt     // Catch: java.lang.Throwable -> L97
            float r0 = r0.z()     // Catch: java.lang.Throwable -> L97
            float r5 = r2 * r0
            android.graphics.Path r0 = r12.jy     // Catch: java.lang.Throwable -> L97
            r0.reset()     // Catch: java.lang.Throwable -> L97
            android.graphics.Path r0 = r12.jy     // Catch: java.lang.Throwable -> L97
            r0.moveTo(r5, r1)     // Catch: java.lang.Throwable -> L97
            int r0 = r12.qv     // Catch: java.lang.Throwable -> L97
            float r2 = (float) r0     // Catch: java.lang.Throwable -> L97
            float r2 = r2 * r3
            float r2 = r5 - r2
            android.graphics.Path r3 = r12.jy     // Catch: java.lang.Throwable -> L97
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L97
            r3.lineTo(r2, r0)     // Catch: java.lang.Throwable -> L97
            android.graphics.Path r0 = r12.jy     // Catch: java.lang.Throwable -> L97
            int r3 = r12.cw     // Catch: java.lang.Throwable -> L97
            float r3 = (float) r3     // Catch: java.lang.Throwable -> L97
            float r2 = r2 + r3
            int r3 = r12.qv     // Catch: java.lang.Throwable -> L97
            float r3 = (float) r3     // Catch: java.lang.Throwable -> L97
            r0.lineTo(r2, r3)     // Catch: java.lang.Throwable -> L97
            android.graphics.Path r0 = r12.jy     // Catch: java.lang.Throwable -> L97
            int r2 = r12.cw     // Catch: java.lang.Throwable -> L97
            float r2 = (float) r2     // Catch: java.lang.Throwable -> L97
            float r2 = r2 + r5
            r0.lineTo(r2, r1)     // Catch: java.lang.Throwable -> L97
            android.graphics.Path r0 = r12.jy     // Catch: java.lang.Throwable -> L97
            r0.close()     // Catch: java.lang.Throwable -> L97
            float r0 = r12.f1959w     // Catch: java.lang.Throwable -> L97
            float r1 = com.bytedance.adsdk.ugeno.j.j.r.av     // Catch: java.lang.Throwable -> L97
            float r1 = r1 * r0
            float r2 = com.bytedance.adsdk.ugeno.j.j.r.i     // Catch: java.lang.Throwable -> L97
            float r8 = r0 * r2
            boolean r0 = r12.vl     // Catch: java.lang.Throwable -> L97
            if (r0 == 0) goto L6f
            com.bytedance.adsdk.ugeno.m.j$j r0 = r12.f1957m     // Catch: java.lang.Throwable -> L97
            if (r0 == 0) goto L6f
            android.graphics.LinearGradient r4 = new android.graphics.LinearGradient     // Catch: java.lang.Throwable -> L97
            float r7 = r5 + r1
            com.bytedance.adsdk.ugeno.m.j$j r0 = r12.f1957m     // Catch: java.lang.Throwable -> L97
            int[] r9 = r0.xt     // Catch: java.lang.Throwable -> L97
            android.graphics.Shader$TileMode r11 = android.graphics.Shader.TileMode.CLAMP     // Catch: java.lang.Throwable -> L97
            r6 = 0
            r10 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L97
            goto L82
        L6f:
            android.graphics.LinearGradient r4 = new android.graphics.LinearGradient     // Catch: java.lang.Throwable -> L97
            float r7 = r5 + r1
            int r0 = r12.tl     // Catch: java.lang.Throwable -> L97
            int r1 = r12.ae     // Catch: java.lang.Throwable -> L97
            int[] r9 = new int[]{r0, r1, r0}     // Catch: java.lang.Throwable -> L97
            android.graphics.Shader$TileMode r11 = android.graphics.Shader.TileMode.CLAMP     // Catch: java.lang.Throwable -> L97
            r6 = 0
            r10 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L97
        L82:
            android.graphics.Paint r0 = r12.f1958r     // Catch: java.lang.Throwable -> L97
            r0.setShader(r4)     // Catch: java.lang.Throwable -> L97
            android.graphics.Path r0 = r12.up     // Catch: java.lang.Throwable -> L97
            if (r0 == 0) goto L90
            android.graphics.Region$Op r1 = android.graphics.Region.Op.INTERSECT     // Catch: java.lang.Throwable -> L97
            r13.clipPath(r0, r1)     // Catch: java.lang.Throwable -> L97
        L90:
            android.graphics.Path r0 = r12.jy     // Catch: java.lang.Throwable -> L97
            android.graphics.Paint r1 = r12.f1958r     // Catch: java.lang.Throwable -> L97
            r13.drawPath(r0, r1)     // Catch: java.lang.Throwable -> L97
        L97:
            return
    }

    @Override // com.bytedance.adsdk.ugeno.j.j.j
    public void xt() {
            r4 = this;
            com.bytedance.adsdk.ugeno.xt.cw r0 = r4.xt
            android.view.View r0 = r0.g()
            android.content.Context r0 = r0.getContext()
            org.json.JSONObject r1 = r4.j
            java.lang.String r2 = "shineWidth"
            r3 = 30
            int r1 = r1.optInt(r2, r3)
            float r1 = (float) r1
            float r0 = com.bytedance.adsdk.ugeno.m.tl.j(r0, r1)
            int r0 = (int) r0
            r4.cw = r0
            org.json.JSONObject r0 = r4.j
            java.lang.String r1 = "backgroundColor"
            java.lang.String r2 = "linear-gradient(90deg, rgba(255, 255, 255, 0), rgba(255, 255, 255, 0.25) 30%, rgba(255, 255, 255, 0.3) 50%, rgba(255, 255, 255, 0.25) 70%, rgba(255, 255, 255, 0))"
            java.lang.String r0 = r0.optString(r1, r2)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L2d
            goto L2e
        L2d:
            r2 = r0
        L2e:
            java.lang.String r0 = "linear"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L3d
            com.bytedance.adsdk.ugeno.m.j$j r0 = com.bytedance.adsdk.ugeno.m.j.xt(r2)
            r4.f1957m = r0
            goto L4e
        L3d:
            int r0 = com.bytedance.adsdk.ugeno.m.j.j(r2)
            r4.ae = r0
            r1 = 32
            int r0 = com.bytedance.adsdk.ugeno.m.j.j(r0, r1)
            r4.tl = r0
            r0 = 0
            r4.vl = r0
        L4e:
            float r0 = com.bytedance.adsdk.ugeno.j.j.r.av
            int r1 = r4.cw
            float r1 = (float) r1
            float r0 = r0 * r1
            r4.f1959w = r0
            return
    }
}
