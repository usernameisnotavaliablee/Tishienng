package com.bytedance.adsdk.ugeno.j.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class up extends com.bytedance.adsdk.ugeno.j.j.j {
    private java.lang.String ae;
    private float cw;
    private boolean g;
    private android.graphics.PorterDuffXfermode jy;

    /* renamed from: m, reason: collision with root package name */
    private float f1960m;
    private android.graphics.Path oq;
    private android.graphics.Path qv;

    /* renamed from: r, reason: collision with root package name */
    private float f1961r;
    private boolean tl;
    private android.graphics.Paint up;
    private android.graphics.Path vl;

    public up(com.bytedance.adsdk.ugeno.xt.cw r2, org.json.JSONObject r3) {
            r1 = this;
            r1.<init>(r2, r3)
            r2 = 1
            r1.tl = r2
            r1.g = r2
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>()
            r1.up = r3
            r3.setAntiAlias(r2)
            com.bytedance.adsdk.ugeno.xt.cw r2 = r1.xt
            android.view.View r2 = r2.g()
            r3 = 2
            r0 = 0
            r2.setLayerType(r3, r0)
            android.graphics.PorterDuffXfermode r2 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.CLEAR
            r2.<init>(r3)
            r1.jy = r2
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            r1.oq = r2
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            r1.qv = r2
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            r1.vl = r2
            return
    }

    @Override // com.bytedance.adsdk.ugeno.j.j.j
    public java.util.List<android.animation.PropertyValuesHolder> cw() {
            r4 = this;
            java.lang.String r0 = r4.r()
            float r1 = r4.f1960m
            r2 = 2
            float[] r2 = new float[r2]
            r3 = 0
            r2[r3] = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            r2[r3] = r1
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofFloat(r0, r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.add(r0)
            return r1
    }

    @Override // com.bytedance.adsdk.ugeno.j.j.j
    public void j(int r3, int r4) {
            r2 = this;
            r0 = 0
            if (r3 <= 0) goto Lc
            boolean r1 = r2.tl
            if (r1 == 0) goto Lc
            float r3 = (float) r3
            r2.cw = r3
            r2.tl = r0
        Lc:
            if (r4 <= 0) goto L17
            boolean r3 = r2.g
            if (r3 == 0) goto L17
            float r3 = (float) r4
            r2.f1961r = r3
            r2.g = r0
        L17:
            return
    }

    @Override // com.bytedance.adsdk.ugeno.j.j.j
    public void j(android.graphics.Canvas r13) {
            r12 = this;
            com.bytedance.adsdk.ugeno.xt.cw r0 = r12.xt
            float r0 = r0.hl()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L103
            float r0 = r12.cw
            com.bytedance.adsdk.ugeno.xt.cw r1 = r12.xt
            float r1 = r1.hl()
            float r0 = r0 * r1
            int r0 = (int) r0
            float r1 = r12.f1961r
            com.bytedance.adsdk.ugeno.xt.cw r2 = r12.xt
            float r2 = r2.hl()
            float r1 = r1 * r2
            int r1 = (int) r1
            android.graphics.Paint r2 = r12.up
            android.graphics.PorterDuffXfermode r3 = r12.jy
            r2.setXfermode(r3)
            java.lang.String r2 = r12.ae
            r2.getClass()
            int r3 = r2.hashCode()
            r4 = -1
            switch(r3) {
                case -1383228885: goto L62;
                case -1364013995: goto L57;
                case 115029: goto L4c;
                case 3317767: goto L41;
                case 108511772: goto L36;
                default: goto L35;
            }
        L35:
            goto L6c
        L36:
            java.lang.String r3 = "right"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L3f
            goto L6c
        L3f:
            r4 = 4
            goto L6c
        L41:
            java.lang.String r3 = "left"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L4a
            goto L6c
        L4a:
            r4 = 3
            goto L6c
        L4c:
            java.lang.String r3 = "top"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L55
            goto L6c
        L55:
            r4 = 2
            goto L6c
        L57:
            java.lang.String r3 = "center"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L60
            goto L6c
        L60:
            r4 = 1
            goto L6c
        L62:
            java.lang.String r3 = "bottom"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L6b
            goto L6c
        L6b:
            r4 = 0
        L6c:
            switch(r4) {
                case 0: goto Lf6;
                case 1: goto L9f;
                case 2: goto L8f;
                case 3: goto L7e;
                case 4: goto L71;
                default: goto L6f;
            }
        L6f:
            goto L103
        L71:
            float r6 = (float) r0
            float r8 = r12.cw
            float r9 = r12.f1961r
            android.graphics.Paint r10 = r12.up
            r7 = 0
            r5 = r13
            r5.drawRect(r6, r7, r8, r9, r10)
            return
        L7e:
            r5 = r13
            float r13 = r12.cw
            float r0 = (float) r0
            float r3 = r13 - r0
            float r4 = r12.f1961r
            r0 = r5
            android.graphics.Paint r5 = r12.up
            r1 = 0
            r2 = 0
            r0.drawRect(r1, r2, r3, r4, r5)
            return
        L8f:
            r0 = r13
            float r3 = r12.cw
            float r13 = r12.f1961r
            float r1 = (float) r1
            float r4 = r13 - r1
            android.graphics.Paint r5 = r12.up
            r1 = 0
            r2 = 0
            r0.drawRect(r1, r2, r3, r4, r5)
            return
        L9f:
            r5 = r13
            android.graphics.Path r13 = r12.oq
            r13.reset()
            android.graphics.Path r13 = r12.qv
            r13.reset()
            android.graphics.Path r13 = r12.vl
            r13.reset()
            android.graphics.Path r13 = r12.oq
            float r1 = r12.cw
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            float r3 = r12.f1961r
            float r3 = r3 / r2
            float r0 = (float) r0
            android.graphics.Path$Direction r11 = android.graphics.Path.Direction.CW
            r13.addCircle(r1, r3, r0, r11)
            android.graphics.Path r6 = r12.qv
            float r9 = r12.cw
            float r7 = r9 / r2
            r8 = 0
            float r10 = r12.f1961r
            r6.addRect(r7, r8, r9, r10, r11)
            android.graphics.Path r13 = r12.qv
            android.graphics.Path r0 = r12.oq
            android.graphics.Path$Op r1 = android.graphics.Path.Op.DIFFERENCE
            r13.op(r0, r1)
            android.graphics.Path r6 = r12.vl
            float r13 = r12.cw
            float r9 = r13 / r2
            float r10 = r12.f1961r
            r7 = 0
            r6.addRect(r7, r8, r9, r10, r11)
            android.graphics.Path r13 = r12.vl
            android.graphics.Path r0 = r12.oq
            r13.op(r0, r1)
            android.graphics.Path r13 = r12.qv
            android.graphics.Paint r0 = r12.up
            r5.drawPath(r13, r0)
            android.graphics.Path r13 = r12.vl
            android.graphics.Paint r0 = r12.up
            r5.drawPath(r13, r0)
            return
        Lf6:
            r5 = r13
            float r2 = (float) r1
            float r3 = r12.cw
            float r4 = r12.f1961r
            r0 = r5
            android.graphics.Paint r5 = r12.up
            r1 = 0
            r0.drawRect(r1, r2, r3, r4, r5)
        L103:
            return
    }

    @Override // com.bytedance.adsdk.ugeno.j.j.j
    public void xt() {
            r4 = this;
            org.json.JSONObject r0 = r4.j
            java.lang.String r1 = "start"
            r2 = 0
            double r0 = r0.optDouble(r1, r2)
            float r0 = (float) r0
            r4.f1960m = r0
            org.json.JSONObject r0 = r4.j
            java.lang.String r1 = "direction"
            java.lang.String r2 = "center"
            java.lang.String r0 = r0.optString(r1, r2)
            r4.ae = r0
            return
    }
}
