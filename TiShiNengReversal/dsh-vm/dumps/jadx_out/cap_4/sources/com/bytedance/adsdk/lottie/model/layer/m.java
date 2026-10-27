package com.bytedance.adsdk.lottie.model.layer;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class m extends com.bytedance.adsdk.lottie.model.layer.ae {
    private final android.widget.LinearLayout.LayoutParams g;
    private final java.util.List<java.lang.String> oq;
    private final java.util.List<android.widget.TextView> qv;
    private android.widget.LinearLayout tl;
    private java.lang.String vl;

    public m(com.bytedance.adsdk.lottie.tl r7, com.bytedance.adsdk.lottie.model.layer.tl r8, android.content.Context r9) {
            r6 = this;
            r6.<init>(r7, r8)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r8 = -2
            r7.<init>(r8, r8)
            r6.g = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r6.oq = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r6.qv = r7
            com.bytedance.adsdk.lottie.g r7 = r6.ae
            if (r7 == 0) goto Lb3
            java.util.List r7 = r7.cw()
            if (r7 == 0) goto Lb3
            int r8 = r7.size()
            if (r8 <= 0) goto Lb3
            android.widget.LinearLayout r8 = new android.widget.LinearLayout
            r8.<init>(r9)
            r6.tl = r8
            r0 = 0
            r8.setOrientation(r0)
            java.lang.Object r8 = r7.get(r0)
            com.bytedance.adsdk.lottie.g$xt r8 = (com.bytedance.adsdk.lottie.g.xt) r8
            java.lang.String r8 = r8.g
            r6.xt(r8)
            android.widget.LinearLayout r8 = new android.widget.LinearLayout
            r8.<init>(r9)
            r8.setOrientation(r0)
            r1 = 80
            r8.setGravity(r1)
            android.widget.LinearLayout r1 = r6.tl
            r1.addView(r8)
            java.util.List r1 = r6.ws()
        L55:
            int r2 = r7.size()
            if (r0 >= r2) goto L96
            java.lang.Object r2 = r7.get(r0)
            com.bytedance.adsdk.lottie.g$xt r2 = (com.bytedance.adsdk.lottie.g.xt) r2
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r9)
            if (r1 == 0) goto L75
            int r4 = r1.size()
            if (r0 >= r4) goto L75
            java.lang.Object r4 = r1.get(r0)
            java.lang.String r4 = (java.lang.String) r4
            goto L77
        L75:
            java.lang.String r4 = ""
        L77:
            r6.j(r3, r2, r4)
            int r2 = r2.tl
            if (r2 == 0) goto L90
            android.widget.LinearLayout$LayoutParams r4 = r6.g
            float r2 = (float) r2
            float r5 = com.bytedance.adsdk.lottie.up.g.j()
            float r2 = r2 * r5
            int r2 = (int) r2
            r4.bottomMargin = r2
            android.widget.LinearLayout$LayoutParams r2 = r6.g
            r8.addView(r3, r2)
            goto L93
        L90:
            r8.addView(r3)
        L93:
            int r0 = r0 + 1
            goto L55
        L96:
            float r7 = com.bytedance.adsdk.lottie.up.g.j()
            android.widget.LinearLayout r8 = r6.tl
            com.bytedance.adsdk.lottie.g r9 = r6.ae
            int r9 = r9.j()
            float r9 = (float) r9
            float r9 = r9 * r7
            int r9 = (int) r9
            com.bytedance.adsdk.lottie.g r0 = r6.ae
            int r0 = r0.xt()
            float r0 = (float) r0
            float r0 = r0 * r7
            int r7 = (int) r0
            j(r8, r9, r7)
        Lb3:
            return
    }

    private void cw(float r9) {
            r8 = this;
            com.bytedance.adsdk.lottie.g r0 = r8.ae
            if (r0 == 0) goto Le0
            java.util.List r0 = r0.cw()
            if (r0 == 0) goto Le0
            int r1 = r0.size()
            if (r1 <= 0) goto Le0
            android.widget.LinearLayout r1 = r8.tl
            r2 = 0
            r1.setOrientation(r2)
            android.widget.LinearLayout r1 = r8.tl
            r3 = 17
            r1.setGravity(r3)
            android.widget.LinearLayout r1 = r8.tl
            int r1 = r1.getChildCount()
            if (r1 > 0) goto L27
            goto Le0
        L27:
            android.widget.LinearLayout r1 = r8.tl
            android.view.View r1 = r1.getChildAt(r2)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1.setOrientation(r2)
            r3 = 80
            r1.setGravity(r3)
            android.widget.LinearLayout r3 = r8.tl
            r3.removeAllViews()
            int r3 = r1.getChildCount()
            int r4 = r0.size()
            if (r3 == r4) goto L48
            goto Le0
        L48:
            java.util.List r3 = r8.ws()
            java.util.List<android.widget.TextView> r4 = r8.qv
            r4.clear()
            r4 = 0
        L52:
            int r5 = r0.size()
            if (r4 >= r5) goto L80
            java.lang.Object r5 = r0.get(r4)
            com.bytedance.adsdk.lottie.g$xt r5 = (com.bytedance.adsdk.lottie.g.xt) r5
            android.view.View r6 = r1.getChildAt(r4)
            android.widget.TextView r6 = (android.widget.TextView) r6
            java.util.List<android.widget.TextView> r7 = r8.qv
            r7.add(r6)
            if (r3 == 0) goto L78
            int r7 = r3.size()
            if (r4 >= r7) goto L78
            java.lang.Object r7 = r3.get(r4)
            java.lang.String r7 = (java.lang.String) r7
            goto L7a
        L78:
            java.lang.String r7 = ""
        L7a:
            r8.j(r6, r5, r7)
            int r4 = r4 + 1
            goto L52
        L80:
            r1.removeAllViews()
        L83:
            int r3 = r0.size()
            if (r2 >= r3) goto Lb9
            java.lang.Object r3 = r0.get(r2)
            com.bytedance.adsdk.lottie.g$xt r3 = (com.bytedance.adsdk.lottie.g.xt) r3
            java.util.List<android.widget.TextView> r4 = r8.qv
            java.lang.Object r4 = r4.get(r2)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r4.setAlpha(r9)
            r1.setAlpha(r9)
            int r3 = r3.tl
            if (r3 == 0) goto Lb3
            android.widget.LinearLayout$LayoutParams r5 = r8.g
            float r3 = (float) r3
            float r6 = com.bytedance.adsdk.lottie.up.g.j()
            float r3 = r3 * r6
            int r3 = (int) r3
            r5.bottomMargin = r3
            android.widget.LinearLayout$LayoutParams r3 = r8.g
            r1.addView(r4, r3)
            goto Lb6
        Lb3:
            r1.addView(r4)
        Lb6:
            int r2 = r2 + 1
            goto L83
        Lb9:
            android.widget.LinearLayout r0 = r8.tl
            r0.setAlpha(r9)
            android.widget.LinearLayout r9 = r8.tl
            r9.addView(r1)
            float r9 = com.bytedance.adsdk.lottie.up.g.j()
            android.widget.LinearLayout r0 = r8.tl
            com.bytedance.adsdk.lottie.g r1 = r8.ae
            int r1 = r1.j()
            float r1 = (float) r1
            float r1 = r1 * r9
            int r1 = (int) r1
            com.bytedance.adsdk.lottie.g r2 = r8.ae
            int r2 = r2.xt()
            float r2 = (float) r2
            float r2 = r2 * r9
            int r9 = (int) r2
            j(r0, r1, r9)
        Le0:
            return
    }

    private static void j(android.view.View r2, int r3, int r4) {
            r0 = 0
            r2.layout(r0, r0, r3, r4)
            r1 = 1073741824(0x40000000, float:2.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r1)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r1)
            r2.measure(r3, r4)
            int r3 = r2.getMeasuredWidth()
            int r4 = r2.getMeasuredHeight()
            r2.layout(r0, r0, r3, r4)
            return
    }

    private void j(android.widget.TextView r3, com.bytedance.adsdk.lottie.g.xt r4, java.lang.String r5) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto La
            r3.setText(r5)
            goto Lf
        La:
            java.lang.String r5 = ""
            r3.setText(r5)
        Lf:
            java.lang.String r5 = r4.cw
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L21
            java.lang.String r5 = r4.cw
            int r5 = android.graphics.Color.parseColor(r5)
            r3.setTextColor(r5)
            goto L32
        L21:
            java.lang.String r5 = r4.f1765r
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L32
            java.lang.String r5 = r4.f1765r
            int r5 = android.graphics.Color.parseColor(r5)
            r3.setTextColor(r5)
        L32:
            java.lang.String r5 = r4.up
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L43
            java.lang.String r5 = r4.up
            int r5 = android.graphics.Color.parseColor(r5)
            r3.setBackgroundColor(r5)
        L43:
            int r5 = r4.ae
            r0 = 1
            r1 = 0
            if (r5 != 0) goto L4d
            r3.setTypeface(r1, r0)
            goto L51
        L4d:
            r5 = 0
            r3.setTypeface(r1, r5)
        L51:
            r5 = 17
            r3.setGravity(r5)
            int r4 = r4.f1764m
            float r4 = (float) r4
            r3.setTextSize(r0, r4)
            return
    }

    private java.util.List<java.lang.String> ws() {
            r9 = this;
            com.bytedance.adsdk.lottie.g r0 = r9.ae
            r1 = 0
            if (r0 == 0) goto L92
            com.bytedance.adsdk.lottie.tl r0 = r9.xt
            if (r0 != 0) goto Lb
            goto L92
        Lb:
            com.bytedance.adsdk.lottie.kt r0 = r0.ch()
            if (r0 != 0) goto L12
            return r1
        L12:
            com.bytedance.adsdk.lottie.g r2 = r9.ae
            java.lang.String r2 = r2.r()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L27
            java.lang.String r3 = r9.vl
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L27
            return r1
        L27:
            com.bytedance.adsdk.lottie.g r3 = r9.ae
            java.util.List r3 = r3.cw()
            if (r3 == 0) goto L92
            java.lang.String r4 = r9.vl
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto L3b
            java.lang.String r4 = r0.j(r2)
        L3b:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L92
            int r0 = r4.length()
            java.util.List<java.lang.String> r1 = r9.oq
            r1.clear()
            r1 = 0
            r2 = 0
        L4c:
            int r5 = r3.size()
            if (r2 >= r5) goto L8f
            java.lang.Object r5 = r3.get(r2)
            com.bytedance.adsdk.lottie.g$xt r5 = (com.bytedance.adsdk.lottie.g.xt) r5
            int r6 = r5.j
            int r5 = r5.xt
            if (r6 >= 0) goto L63
            int r6 = r6 + r0
            int r6 = java.lang.Math.max(r6, r1)
        L63:
            if (r5 >= 0) goto L6a
            int r5 = r5 + r0
            int r5 = java.lang.Math.max(r5, r1)
        L6a:
            int r7 = r6 + r5
            if (r7 <= r0) goto L76
            java.util.List<java.lang.String> r5 = r9.oq
            java.lang.String r6 = ""
            r5.add(r6)
            goto L8c
        L76:
            int r7 = r3.size()
            r8 = 1
            if (r7 != r8) goto L82
            if (r6 != 0) goto L82
            if (r5 != 0) goto L82
            r5 = r0
        L82:
            java.util.List<java.lang.String> r7 = r9.oq
            int r5 = r5 + r6
            java.lang.String r5 = r4.substring(r6, r5)
            r7.add(r5)
        L8c:
            int r2 = r2 + 1
            goto L4c
        L8f:
            java.util.List<java.lang.String> r0 = r9.oq
            return r0
        L92:
            return r1
    }

    private void xt(java.lang.String r3) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 17
            if (r0 == 0) goto Le
            android.widget.LinearLayout r3 = r2.tl
            r3.setGravity(r1)
            return
        Le:
            r3.getClass()
            java.lang.String r0 = "left"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L2e
            java.lang.String r0 = "right"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L27
            android.widget.LinearLayout r3 = r2.tl
            r3.setGravity(r1)
            return
        L27:
            android.widget.LinearLayout r3 = r2.tl
            r0 = 5
            r3.setGravity(r0)
            return
        L2e:
            android.widget.LinearLayout r3 = r2.tl
            r0 = 3
            r3.setGravity(r0)
            return
    }

    public void j(java.lang.String r1) {
            r0 = this;
            r0.vl = r1
            return
    }

    @Override // com.bytedance.adsdk.lottie.model.layer.ae, com.bytedance.adsdk.lottie.model.layer.cw
    public void xt(android.graphics.Canvas r2, android.graphics.Matrix r3, int r4) {
            r1 = this;
            android.widget.LinearLayout r0 = r1.tl
            if (r0 == 0) goto L1d
            r2.save()
            r2.concat(r3)
            r1.j(r4)
            float r3 = r1.tl()
            r1.cw(r3)
            android.widget.LinearLayout r3 = r1.tl
            r3.draw(r2)
            r2.restore()
            return
        L1d:
            super.xt(r2, r3, r4)
            return
    }
}
