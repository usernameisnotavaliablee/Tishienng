package com.bytedance.adsdk.ugeno.j.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class cw extends com.bytedance.adsdk.ugeno.j.j.j {
    private android.graphics.Paint ae;
    private java.lang.String cw;
    private android.graphics.PorterDuffXfermode g;

    /* renamed from: m, reason: collision with root package name */
    private android.view.View f1955m;
    private android.graphics.LinearGradient oq;
    private android.graphics.Matrix qv;

    /* renamed from: r, reason: collision with root package name */
    private float f1956r;
    private android.graphics.Paint tl;
    private float up;

    public cw(com.bytedance.adsdk.ugeno.xt.cw r2, org.json.JSONObject r3) {
            r1 = this;
            r1.<init>(r2, r3)
            com.bytedance.adsdk.ugeno.xt.cw r2 = r1.xt
            android.view.View r2 = r2.g()
            r1.f1955m = r2
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r1.ae = r2
            r3 = 1
            r2.setAntiAlias(r3)
            android.view.View r2 = r1.f1955m
            r3 = 2
            r0 = 0
            r2.setLayerType(r3, r0)
            android.graphics.PorterDuffXfermode r2 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.CLEAR
            r2.<init>(r3)
            r1.g = r2
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r1.tl = r2
            android.graphics.Matrix r2 = new android.graphics.Matrix
            r2.<init>()
            r1.qv = r2
            return
    }

    @Override // com.bytedance.adsdk.ugeno.j.j.j
    public java.util.List<android.animation.PropertyValuesHolder> cw() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 2
            float[] r2 = new float[r1]
            r2 = {x0028: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            java.lang.String r3 = "rubIn"
            android.animation.PropertyValuesHolder r2 = android.animation.PropertyValuesHolder.ofFloat(r3, r2)
            r0.add(r2)
            com.bytedance.adsdk.ugeno.j.up r2 = com.bytedance.adsdk.ugeno.j.up.oq
            java.lang.String r2 = r2.xt()
            float[] r1 = new float[r1]
            r1 = {x0030: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.PropertyValuesHolder r1 = android.animation.PropertyValuesHolder.ofFloat(r2, r1)
            r0.add(r1)
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.j.j.j
    public void j(int r13, int r14) {
            r12 = this;
            float r13 = (float) r13
            r12.f1956r = r13
            float r13 = (float) r14
            r12.up = r13
            java.lang.String r13 = r12.cw
            r13.getClass()
            int r14 = r13.hashCode()
            r0 = -1
            switch(r14) {
                case -1383228885: goto L35;
                case 115029: goto L2a;
                case 3317767: goto L1f;
                case 108511772: goto L14;
                default: goto L13;
            }
        L13:
            goto L3f
        L14:
            java.lang.String r14 = "right"
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L1d
            goto L3f
        L1d:
            r0 = 3
            goto L3f
        L1f:
            java.lang.String r14 = "left"
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L28
            goto L3f
        L28:
            r0 = 2
            goto L3f
        L2a:
            java.lang.String r14 = "top"
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L33
            goto L3f
        L33:
            r0 = 1
            goto L3f
        L35:
            java.lang.String r14 = "bottom"
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L3e
            goto L3f
        L3e:
            r0 = 0
        L3f:
            switch(r0) {
                case 0: goto L78;
                case 1: goto L67;
                case 2: goto L56;
                case 3: goto L43;
                default: goto L42;
            }
        L42:
            return
        L43:
            android.graphics.LinearGradient r1 = new android.graphics.LinearGradient
            float r13 = r12.f1956r
            float r2 = -r13
            float r5 = r12.up
            r7 = -1
            android.graphics.Shader$TileMode r8 = android.graphics.Shader.TileMode.CLAMP
            r3 = 0
            r4 = 0
            r6 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r12.oq = r1
            return
        L56:
            android.graphics.LinearGradient r2 = new android.graphics.LinearGradient
            float r3 = r12.f1956r
            r8 = -1
            android.graphics.Shader$TileMode r9 = android.graphics.Shader.TileMode.CLAMP
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r12.oq = r2
            return
        L67:
            android.graphics.LinearGradient r3 = new android.graphics.LinearGradient
            float r5 = r12.up
            r9 = -1
            android.graphics.Shader$TileMode r10 = android.graphics.Shader.TileMode.CLAMP
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r12.oq = r3
            return
        L78:
            android.graphics.LinearGradient r4 = new android.graphics.LinearGradient
            float r13 = r12.up
            float r6 = -r13
            r10 = -1
            android.graphics.Shader$TileMode r11 = android.graphics.Shader.TileMode.CLAMP
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r12.oq = r4
            return
    }

    @Override // com.bytedance.adsdk.ugeno.j.j.j
    public void j(android.graphics.Canvas r22) {
            r21 = this;
            r1 = r21
            com.bytedance.adsdk.ugeno.xt.cw r0 = r1.xt     // Catch: java.lang.Throwable -> L8a
            float r0 = r0.b()     // Catch: java.lang.Throwable -> L8a
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L1db
            float r0 = r1.f1956r     // Catch: java.lang.Throwable -> L8a
            com.bytedance.adsdk.ugeno.xt.cw r3 = r1.xt     // Catch: java.lang.Throwable -> L8a
            float r3 = r3.b()     // Catch: java.lang.Throwable -> L8a
            float r0 = r0 * r3
            int r0 = (int) r0     // Catch: java.lang.Throwable -> L8a
            float r3 = r1.up     // Catch: java.lang.Throwable -> L8a
            com.bytedance.adsdk.ugeno.xt.cw r4 = r1.xt     // Catch: java.lang.Throwable -> L8a
            float r4 = r4.b()     // Catch: java.lang.Throwable -> L8a
            float r3 = r3 * r4
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L8a
            android.graphics.Paint r4 = r1.ae     // Catch: java.lang.Throwable -> L8a
            android.graphics.PorterDuffXfermode r5 = r1.g     // Catch: java.lang.Throwable -> L8a
            r4.setXfermode(r5)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r4 = r1.cw     // Catch: java.lang.Throwable -> L8a
            int r5 = r4.hashCode()     // Catch: java.lang.Throwable -> L8a
            r6 = 1063675494(0x3f666666, float:0.9)
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = 1132396544(0x437f0000, float:255.0)
            switch(r5) {
                case -1383228885: goto L174;
                case 115029: goto L107;
                case 3317767: goto L9a;
                case 108511772: goto L3c;
                default: goto L3a;
            }     // Catch: java.lang.Throwable -> L8a
        L3a:
            goto L1db
        L3c:
            java.lang.String r2 = "right"
            boolean r2 = r4.equals(r2)     // Catch: java.lang.Throwable -> L8a
            if (r2 == 0) goto L1db
            float r10 = (float) r0     // Catch: java.lang.Throwable -> L8a
            float r12 = r1.f1956r     // Catch: java.lang.Throwable -> L8a
            float r13 = r1.up     // Catch: java.lang.Throwable -> L8a
            android.graphics.Paint r14 = r1.ae     // Catch: java.lang.Throwable -> L8a
            r11 = 0
            r9 = r22
            r9.drawRect(r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L8a
            android.graphics.Matrix r0 = r1.qv     // Catch: java.lang.Throwable -> L8a
            float r2 = r1.up     // Catch: java.lang.Throwable -> L8a
            r0.setTranslate(r10, r2)     // Catch: java.lang.Throwable -> L8a
            android.graphics.LinearGradient r0 = r1.oq     // Catch: java.lang.Throwable -> L8a
            android.graphics.Matrix r2 = r1.qv     // Catch: java.lang.Throwable -> L8a
            r0.setLocalMatrix(r2)     // Catch: java.lang.Throwable -> L8a
            android.graphics.Paint r0 = r1.tl     // Catch: java.lang.Throwable -> L8a
            android.graphics.LinearGradient r2 = r1.oq     // Catch: java.lang.Throwable -> L8a
            r0.setShader(r2)     // Catch: java.lang.Throwable -> L8a
            com.bytedance.adsdk.ugeno.xt.cw r0 = r1.xt     // Catch: java.lang.Throwable -> L8a
            float r0 = r0.b()     // Catch: java.lang.Throwable -> L8a
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 > 0) goto L8d
            com.bytedance.adsdk.ugeno.xt.cw r0 = r1.xt     // Catch: java.lang.Throwable -> L8a
            float r0 = r0.b()     // Catch: java.lang.Throwable -> L8a
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 <= 0) goto L8d
            android.graphics.Paint r0 = r1.tl     // Catch: java.lang.Throwable -> L8a
            com.bytedance.adsdk.ugeno.xt.cw r2 = r1.xt     // Catch: java.lang.Throwable -> L8a
            float r2 = r2.b()     // Catch: java.lang.Throwable -> L8a
            float r2 = r2 * r8
            float r8 = r8 - r2
            int r2 = (int) r8     // Catch: java.lang.Throwable -> L8a
            r0.setAlpha(r2)     // Catch: java.lang.Throwable -> L8a
            goto L8d
        L8a:
            r0 = move-exception
            goto L1dc
        L8d:
            float r13 = r1.up     // Catch: java.lang.Throwable -> L8a
            android.graphics.Paint r14 = r1.tl     // Catch: java.lang.Throwable -> L8a
            r12 = r10
            r10 = 0
            r11 = 0
            r9 = r22
            r9.drawRect(r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L8a
            return
        L9a:
            java.lang.String r3 = "left"
            boolean r3 = r4.equals(r3)     // Catch: java.lang.Throwable -> L8a
            if (r3 == 0) goto L1db
            float r3 = r1.f1956r     // Catch: java.lang.Throwable -> L8a
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L8a
            float r18 = r3 - r0
            float r3 = r1.up     // Catch: java.lang.Throwable -> L8a
            android.graphics.Paint r4 = r1.ae     // Catch: java.lang.Throwable -> L8a
            r16 = 0
            r17 = 0
            r15 = r22
            r19 = r3
            r20 = r4
            r15.drawRect(r16, r17, r18, r19, r20)     // Catch: java.lang.Throwable -> L8a
            android.graphics.Matrix r3 = r1.qv     // Catch: java.lang.Throwable -> L8a
            float r4 = r1.f1956r     // Catch: java.lang.Throwable -> L8a
            float r4 = r4 - r0
            r3.setTranslate(r4, r2)     // Catch: java.lang.Throwable -> L8a
            android.graphics.LinearGradient r2 = r1.oq     // Catch: java.lang.Throwable -> L8a
            android.graphics.Matrix r3 = r1.qv     // Catch: java.lang.Throwable -> L8a
            r2.setLocalMatrix(r3)     // Catch: java.lang.Throwable -> L8a
            android.graphics.Paint r2 = r1.tl     // Catch: java.lang.Throwable -> L8a
            android.graphics.LinearGradient r3 = r1.oq     // Catch: java.lang.Throwable -> L8a
            r2.setShader(r3)     // Catch: java.lang.Throwable -> L8a
            com.bytedance.adsdk.ugeno.xt.cw r2 = r1.xt     // Catch: java.lang.Throwable -> L8a
            float r2 = r2.b()     // Catch: java.lang.Throwable -> L8a
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 > 0) goto Lf1
            com.bytedance.adsdk.ugeno.xt.cw r2 = r1.xt     // Catch: java.lang.Throwable -> L8a
            float r2 = r2.b()     // Catch: java.lang.Throwable -> L8a
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 <= 0) goto Lf1
            android.graphics.Paint r2 = r1.tl     // Catch: java.lang.Throwable -> L8a
            com.bytedance.adsdk.ugeno.xt.cw r3 = r1.xt     // Catch: java.lang.Throwable -> L8a
            float r3 = r3.b()     // Catch: java.lang.Throwable -> L8a
            float r3 = r3 * r8
            float r8 = r8 - r3
            int r3 = (int) r8     // Catch: java.lang.Throwable -> L8a
            r2.setAlpha(r3)     // Catch: java.lang.Throwable -> L8a
        Lf1:
            float r2 = r1.f1956r     // Catch: java.lang.Throwable -> L8a
            float r3 = r1.up     // Catch: java.lang.Throwable -> L8a
            float r18 = r2 - r0
            android.graphics.Paint r0 = r1.tl     // Catch: java.lang.Throwable -> L8a
            r19 = 0
            r15 = r22
            r20 = r0
            r16 = r2
            r17 = r3
            r15.drawRect(r16, r17, r18, r19, r20)     // Catch: java.lang.Throwable -> L8a
            return
        L107:
            java.lang.String r0 = "top"
            boolean r0 = r4.equals(r0)     // Catch: java.lang.Throwable -> L8a
            if (r0 == 0) goto L1db
            float r0 = r1.f1956r     // Catch: java.lang.Throwable -> L8a
            float r4 = r1.up     // Catch: java.lang.Throwable -> L8a
            float r3 = (float) r3     // Catch: java.lang.Throwable -> L8a
            float r19 = r4 - r3
            android.graphics.Paint r4 = r1.ae     // Catch: java.lang.Throwable -> L8a
            r16 = 0
            r17 = 0
            r15 = r22
            r18 = r0
            r20 = r4
            r15.drawRect(r16, r17, r18, r19, r20)     // Catch: java.lang.Throwable -> L8a
            android.graphics.Matrix r0 = r1.qv     // Catch: java.lang.Throwable -> L8a
            float r4 = r1.up     // Catch: java.lang.Throwable -> L8a
            float r4 = r4 - r3
            r0.setTranslate(r2, r4)     // Catch: java.lang.Throwable -> L8a
            android.graphics.LinearGradient r0 = r1.oq     // Catch: java.lang.Throwable -> L8a
            android.graphics.Matrix r2 = r1.qv     // Catch: java.lang.Throwable -> L8a
            r0.setLocalMatrix(r2)     // Catch: java.lang.Throwable -> L8a
            android.graphics.Paint r0 = r1.tl     // Catch: java.lang.Throwable -> L8a
            android.graphics.LinearGradient r2 = r1.oq     // Catch: java.lang.Throwable -> L8a
            r0.setShader(r2)     // Catch: java.lang.Throwable -> L8a
            com.bytedance.adsdk.ugeno.xt.cw r0 = r1.xt     // Catch: java.lang.Throwable -> L8a
            float r0 = r0.b()     // Catch: java.lang.Throwable -> L8a
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 > 0) goto L15e
            com.bytedance.adsdk.ugeno.xt.cw r0 = r1.xt     // Catch: java.lang.Throwable -> L8a
            float r0 = r0.b()     // Catch: java.lang.Throwable -> L8a
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 <= 0) goto L15e
            android.graphics.Paint r0 = r1.tl     // Catch: java.lang.Throwable -> L8a
            com.bytedance.adsdk.ugeno.xt.cw r2 = r1.xt     // Catch: java.lang.Throwable -> L8a
            float r2 = r2.b()     // Catch: java.lang.Throwable -> L8a
            float r2 = r2 * r8
            float r8 = r8 - r2
            int r2 = (int) r8     // Catch: java.lang.Throwable -> L8a
            r0.setAlpha(r2)     // Catch: java.lang.Throwable -> L8a
        L15e:
            float r0 = r1.f1956r     // Catch: java.lang.Throwable -> L8a
            float r2 = r1.up     // Catch: java.lang.Throwable -> L8a
            float r19 = r2 - r3
            android.graphics.Paint r3 = r1.tl     // Catch: java.lang.Throwable -> L8a
            r18 = 0
            r15 = r22
            r16 = r0
            r17 = r2
            r20 = r3
            r15.drawRect(r16, r17, r18, r19, r20)     // Catch: java.lang.Throwable -> L8a
            return
        L174:
            java.lang.String r0 = "bottom"
            boolean r0 = r4.equals(r0)     // Catch: java.lang.Throwable -> L8a
            if (r0 == 0) goto L1db
            float r0 = (float) r3     // Catch: java.lang.Throwable -> L8a
            float r3 = r1.f1956r     // Catch: java.lang.Throwable -> L8a
            float r4 = r1.up     // Catch: java.lang.Throwable -> L8a
            android.graphics.Paint r5 = r1.ae     // Catch: java.lang.Throwable -> L8a
            r16 = 0
            r15 = r22
            r17 = r0
            r18 = r3
            r19 = r4
            r20 = r5
            r15.drawRect(r16, r17, r18, r19, r20)     // Catch: java.lang.Throwable -> L8a
            android.graphics.Matrix r3 = r1.qv     // Catch: java.lang.Throwable -> L8a
            r3.setTranslate(r2, r0)     // Catch: java.lang.Throwable -> L8a
            android.graphics.LinearGradient r2 = r1.oq     // Catch: java.lang.Throwable -> L8a
            android.graphics.Matrix r3 = r1.qv     // Catch: java.lang.Throwable -> L8a
            r2.setLocalMatrix(r3)     // Catch: java.lang.Throwable -> L8a
            android.graphics.Paint r2 = r1.tl     // Catch: java.lang.Throwable -> L8a
            android.graphics.LinearGradient r3 = r1.oq     // Catch: java.lang.Throwable -> L8a
            r2.setShader(r3)     // Catch: java.lang.Throwable -> L8a
            com.bytedance.adsdk.ugeno.xt.cw r2 = r1.xt     // Catch: java.lang.Throwable -> L8a
            float r2 = r2.b()     // Catch: java.lang.Throwable -> L8a
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 > 0) goto L1c8
            com.bytedance.adsdk.ugeno.xt.cw r2 = r1.xt     // Catch: java.lang.Throwable -> L8a
            float r2 = r2.b()     // Catch: java.lang.Throwable -> L8a
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 <= 0) goto L1c8
            android.graphics.Paint r2 = r1.tl     // Catch: java.lang.Throwable -> L8a
            com.bytedance.adsdk.ugeno.xt.cw r3 = r1.xt     // Catch: java.lang.Throwable -> L8a
            float r3 = r3.b()     // Catch: java.lang.Throwable -> L8a
            float r3 = r3 * r8
            float r8 = r8 - r3
            int r3 = (int) r8     // Catch: java.lang.Throwable -> L8a
            r2.setAlpha(r3)     // Catch: java.lang.Throwable -> L8a
        L1c8:
            float r2 = r1.f1956r     // Catch: java.lang.Throwable -> L8a
            android.graphics.Paint r3 = r1.tl     // Catch: java.lang.Throwable -> L8a
            r16 = 0
            r17 = 0
            r15 = r22
            r19 = r0
            r18 = r2
            r20 = r3
            r15.drawRect(r16, r17, r18, r19, r20)     // Catch: java.lang.Throwable -> L8a
        L1db:
            return
        L1dc:
            java.lang.String r2 = "BaseEffectWrapper"
            java.lang.String r0 = r0.getMessage()
            com.bytedance.sdk.component.utils.vl.r(r2, r0)
            return
    }

    @Override // com.bytedance.adsdk.ugeno.j.j.j
    public void xt() {
            r3 = this;
            org.json.JSONObject r0 = r3.j
            java.lang.String r1 = "direction"
            java.lang.String r2 = "left"
            java.lang.String r0 = r0.optString(r1, r2)
            r3.cw = r0
            return
    }
}
