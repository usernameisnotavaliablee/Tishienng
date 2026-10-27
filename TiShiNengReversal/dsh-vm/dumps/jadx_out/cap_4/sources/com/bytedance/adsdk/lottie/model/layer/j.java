package com.bytedance.adsdk.lottie.model.layer;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j extends com.bytedance.adsdk.lottie.model.layer.ae {
    private float g;
    private final android.os.Handler jy;
    private android.widget.ImageView oq;
    private android.graphics.drawable.Drawable qv;
    private float tl;
    private com.bytedance.adsdk.lottie.LottieAnimationView vl;
    private final java.lang.Runnable ws;






    public j(com.bytedance.adsdk.lottie.tl r2, com.bytedance.adsdk.lottie.model.layer.tl r3, android.content.Context r4) {
            r1 = this;
            r1.<init>(r2, r3)
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.tl = r3
            r1.g = r3
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r3.<init>(r0)
            r1.jy = r3
            com.bytedance.adsdk.lottie.model.layer.j$5 r3 = new com.bytedance.adsdk.lottie.model.layer.j$5
            r3.<init>(r1)
            r1.ws = r3
            com.bytedance.adsdk.lottie.g r3 = r1.ae
            if (r3 == 0) goto L83
            if (r2 == 0) goto L83
            com.bytedance.adsdk.lottie.LottieAnimationView r3 = r2.xt()
            r1.vl = r3
            if (r3 != 0) goto L2a
            goto L83
        L2a:
            float r3 = com.bytedance.adsdk.lottie.up.g.j()
            com.bytedance.adsdk.lottie.g r0 = r1.ae
            int r0 = r0.j()
            float r0 = (float) r0
            float r0 = r0 * r3
            int r0 = (int) r0
            float r0 = (float) r0
            r1.tl = r0
            com.bytedance.adsdk.lottie.g r0 = r1.ae
            int r0 = r0.xt()
            float r0 = (float) r0
            float r0 = r0 * r3
            int r3 = (int) r0
            float r3 = (float) r3
            r1.g = r3
            com.bytedance.adsdk.lottie.kt r2 = r2.ch()
            if (r2 == 0) goto L59
            com.bytedance.adsdk.lottie.g r3 = r1.ae
            java.lang.String r3 = r3.vl()
            java.lang.String r2 = r2.j(r3)
            goto L5a
        L59:
            r2 = 0
        L5a:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L83
            android.widget.ImageView r3 = new android.widget.ImageView
            r3.<init>(r4)
            r1.oq = r3
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
            r3.setScaleType(r0)
            android.widget.ImageView r3 = r1.oq
            com.bytedance.adsdk.lottie.model.layer.j$1 r0 = new com.bytedance.adsdk.lottie.model.layer.j$1
            r0.<init>(r1)
            r3.addOnAttachStateChangeListener(r0)
            com.bytedance.adsdk.lottie.LottieAnimationView r3 = r1.vl
            com.bytedance.adsdk.lottie.model.layer.j$2 r0 = new com.bytedance.adsdk.lottie.model.layer.j$2
            r0.<init>(r1)
            r3.addOnAttachStateChangeListener(r0)
            r1.j(r2, r4)
        L83:
            return
    }

    static /* synthetic */ java.lang.Runnable ae(com.bytedance.adsdk.lottie.model.layer.j r0) {
            java.lang.Runnable r0 = r0.ws
            return r0
    }

    private void av() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L31
            android.graphics.drawable.Drawable r0 = r2.qv
            boolean r0 = com.bytedance.adsdk.lottie.model.layer.a.a(r0)
            if (r0 == 0) goto L31
            android.graphics.drawable.Drawable r0 = r2.qv
            android.graphics.drawable.AnimatedImageDrawable r0 = com.bytedance.adsdk.lottie.model.layer.b.a(r0)
            boolean r0 = com.bytedance.adsdk.lottie.model.layer.c.a(r0)
            if (r0 == 0) goto L1b
            goto L31
        L1b:
            android.graphics.drawable.Drawable r0 = r2.qv
            android.graphics.drawable.AnimatedImageDrawable r0 = com.bytedance.adsdk.lottie.model.layer.b.a(r0)
            r1 = -1
            com.bytedance.adsdk.lottie.model.layer.d.a(r0, r1)
            android.graphics.drawable.Drawable r0 = r2.qv
            android.graphics.drawable.AnimatedImageDrawable r0 = com.bytedance.adsdk.lottie.model.layer.b.a(r0)
            com.bytedance.adsdk.lottie.model.layer.e.a(r0)
            r2.az()
        L31:
            return
    }

    private void az() {
            r4 = this;
            r4.ws()
            com.bytedance.adsdk.lottie.LottieAnimationView r0 = r4.vl
            if (r0 == 0) goto L10
            android.os.Handler r0 = r4.jy
            java.lang.Runnable r1 = r4.ws
            r2 = 40
            r0.postDelayed(r1, r2)
        L10:
            return
    }

    static /* synthetic */ void cw(com.bytedance.adsdk.lottie.model.layer.j r0) {
            r0.ws()
            return
    }

    private void i() {
            r3 = this;
            android.graphics.drawable.Drawable r0 = r3.qv
            if (r0 == 0) goto L34
            android.widget.ImageView r0 = r3.oq
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L15
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.widget.ImageView r1 = r3.oq
            r0.removeView(r1)
        L15:
            com.bytedance.adsdk.lottie.LottieAnimationView r0 = r3.vl
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L34
            android.widget.ImageView r1 = r3.oq
            r2 = 1325400064(0x4f000000, float:2.1474836E9)
            r1.setTranslationX(r2)
            android.widget.ImageView r1 = r3.oq
            android.graphics.drawable.Drawable r2 = r3.qv
            r1.setImageDrawable(r2)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.widget.ImageView r1 = r3.oq
            r0.addView(r1)
        L34:
            return
    }

    static /* synthetic */ android.widget.ImageView j(com.bytedance.adsdk.lottie.model.layer.j r0) {
            android.widget.ImageView r0 = r0.oq
            return r0
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

    static /* synthetic */ void j(com.bytedance.adsdk.lottie.model.layer.j r0, java.io.File r1) {
            r0.j(r1)
            return
    }

    private void j(java.io.File r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L32
            android.graphics.drawable.Drawable r0 = r2.qv     // Catch: java.io.IOException -> L18
            boolean r0 = com.bytedance.adsdk.lottie.model.layer.a.a(r0)     // Catch: java.io.IOException -> L18
            if (r0 == 0) goto L1a
            android.graphics.drawable.Drawable r0 = r2.qv     // Catch: java.io.IOException -> L18
            android.graphics.drawable.AnimatedImageDrawable r0 = com.bytedance.adsdk.lottie.model.layer.b.a(r0)     // Catch: java.io.IOException -> L18
            com.bytedance.adsdk.lottie.model.layer.f.a(r0)     // Catch: java.io.IOException -> L18
            goto L1a
        L18:
            r3 = move-exception
            goto L2f
        L1a:
            android.graphics.ImageDecoder$Source r3 = com.bytedance.adsdk.lottie.model.layer.h.a(r3)     // Catch: java.io.IOException -> L18
            android.graphics.drawable.Drawable r3 = com.bytedance.adsdk.lottie.model.layer.i.a(r3)     // Catch: java.io.IOException -> L18
            r2.qv = r3     // Catch: java.io.IOException -> L18
            android.os.Handler r3 = r2.jy     // Catch: java.io.IOException -> L18
            com.bytedance.adsdk.lottie.model.layer.j$4 r0 = new com.bytedance.adsdk.lottie.model.layer.j$4     // Catch: java.io.IOException -> L18
            r0.<init>(r2)     // Catch: java.io.IOException -> L18
            r3.post(r0)     // Catch: java.io.IOException -> L18
            return
        L2f:
            com.bytedance.sdk.component.utils.vl.j(r3)
        L32:
            return
    }

    private void j(java.lang.String r4, android.content.Context r5) {
            r3 = this;
            java.lang.String r0 = com.bytedance.adsdk.lottie.up.xt.j(r5)
            java.lang.String r1 = com.bytedance.sdk.component.utils.up.xt(r4)
            java.io.File r2 = new java.io.File
            r2.<init>(r0, r1)
            boolean r0 = r2.exists()
            if (r0 == 0) goto L17
            r3.j(r2)
            return
        L17:
            com.bytedance.adsdk.lottie.model.layer.j$3 r0 = new com.bytedance.adsdk.lottie.model.layer.j$3
            r0.<init>(r3)
            com.bytedance.adsdk.lottie.up.xt.j(r4, r5, r0)
            return
    }

    static /* synthetic */ void m(com.bytedance.adsdk.lottie.model.layer.j r0) {
            r0.i()
            return
    }

    static /* synthetic */ android.graphics.drawable.Drawable r(com.bytedance.adsdk.lottie.model.layer.j r0) {
            android.graphics.drawable.Drawable r0 = r0.qv
            return r0
    }

    static /* synthetic */ android.os.Handler tl(com.bytedance.adsdk.lottie.model.layer.j r0) {
            android.os.Handler r0 = r0.jy
            return r0
    }

    static /* synthetic */ com.bytedance.adsdk.lottie.LottieAnimationView up(com.bytedance.adsdk.lottie.model.layer.j r0) {
            com.bytedance.adsdk.lottie.LottieAnimationView r0 = r0.vl
            return r0
    }

    private void ws() {
            r2 = this;
            android.os.Handler r0 = r2.jy
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
            return
    }

    static /* synthetic */ void xt(com.bytedance.adsdk.lottie.model.layer.j r0) {
            r0.av()
            return
    }

    @Override // com.bytedance.adsdk.lottie.model.layer.ae, com.bytedance.adsdk.lottie.model.layer.cw
    public void xt(android.graphics.Canvas r4, android.graphics.Matrix r5, int r6) {
            r3 = this;
            float r0 = r3.tl
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L37
            android.widget.ImageView r0 = r3.oq
            if (r0 == 0) goto L37
            r4.save()
            r4.concat(r5)
            r3.j(r6)
            float r5 = r3.tl()
            android.widget.ImageView r6 = r3.oq
            float r0 = r3.tl
            int r0 = (int) r0
            float r2 = r3.g
            int r2 = (int) r2
            j(r6, r0, r2)
            android.widget.ImageView r6 = r3.oq
            r6.setAlpha(r5)
            float r5 = r3.tl
            float r6 = r3.g
            r4.clipRect(r1, r1, r5, r6)
            android.widget.ImageView r5 = r3.oq
            r5.draw(r4)
            r4.restore()
        L37:
            return
    }
}
