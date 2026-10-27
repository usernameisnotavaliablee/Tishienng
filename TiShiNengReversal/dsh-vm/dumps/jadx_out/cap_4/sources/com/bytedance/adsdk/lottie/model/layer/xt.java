package com.bytedance.adsdk.lottie.model.layer;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class xt extends com.bytedance.adsdk.lottie.model.layer.ae {
    private final java.lang.Runnable az;
    private float g;
    private com.bytedance.adsdk.lottie.LottieAnimationView jy;
    private com.bykv.vk.openvk.component.video.j.r.r oq;
    private volatile boolean qv;
    private float tl;
    private android.view.TextureView vl;
    private final android.os.Handler ws;





    public xt(com.bytedance.adsdk.lottie.tl r3, com.bytedance.adsdk.lottie.model.layer.tl r4, android.content.Context r5) {
            r2 = this;
            r2.<init>(r3, r4)
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.tl = r4
            r2.g = r4
            android.os.Handler r4 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r4.<init>(r0)
            r2.ws = r4
            com.bytedance.adsdk.lottie.model.layer.xt$4 r4 = new com.bytedance.adsdk.lottie.model.layer.xt$4
            r4.<init>(r2)
            r2.az = r4
            com.bytedance.adsdk.lottie.g r4 = r2.ae
            if (r4 == 0) goto La6
            if (r3 == 0) goto La6
            if (r5 == 0) goto La6
            com.bytedance.adsdk.lottie.LottieAnimationView r4 = r3.xt()
            r2.jy = r4
            if (r4 != 0) goto L2d
            goto La6
        L2d:
            float r4 = com.bytedance.adsdk.lottie.up.g.j()
            com.bytedance.adsdk.lottie.g r0 = r2.ae
            int r0 = r0.j()
            float r0 = (float) r0
            float r0 = r0 * r4
            int r0 = (int) r0
            float r0 = (float) r0
            r2.tl = r0
            com.bytedance.adsdk.lottie.g r0 = r2.ae
            int r0 = r0.xt()
            float r0 = (float) r0
            float r0 = r0 * r4
            int r4 = (int) r0
            float r4 = (float) r4
            r2.g = r4
            com.bytedance.adsdk.lottie.kt r3 = r3.ch()
            if (r3 == 0) goto L6b
            com.bytedance.adsdk.lottie.g r4 = r2.ae
            java.lang.String r4 = r4.vl()
            java.lang.String r3 = r3.j(r4)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L6b
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L67
            r4.<init>(r3)     // Catch: org.json.JSONException -> L67
            goto L6c
        L67:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
        L6b:
            r4 = 0
        L6c:
            if (r4 == 0) goto La6
            java.lang.String r3 = "file_hash"
            java.lang.String r3 = r4.optString(r3)
            java.lang.String r0 = "video_url"
            java.lang.String r0 = r4.optString(r0)
            java.lang.String r1 = "video_duration"
            r4.optString(r1)
            java.lang.String r1 = "resolution"
            r4.optString(r1)
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto La6
            android.view.TextureView r4 = new android.view.TextureView
            r4.<init>(r5)
            r2.vl = r4
            com.bytedance.adsdk.lottie.model.layer.xt$1 r1 = new com.bytedance.adsdk.lottie.model.layer.xt$1
            r1.<init>(r2, r0, r3, r5)
            r4.setSurfaceTextureListener(r1)
            com.bytedance.adsdk.lottie.LottieAnimationView r3 = r2.jy
            com.bytedance.adsdk.lottie.model.layer.xt$2 r4 = new com.bytedance.adsdk.lottie.model.layer.xt$2
            r4.<init>(r2)
            r3.addOnAttachStateChangeListener(r4)
            r2.az()
        La6:
            return
    }

    static /* synthetic */ java.lang.Runnable ae(com.bytedance.adsdk.lottie.model.layer.xt r0) {
            java.lang.Runnable r0 = r0.az
            return r0
    }

    private void av() {
            r2 = this;
            android.os.Handler r0 = r2.ws
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
            return
    }

    private void az() {
            r3 = this;
            android.view.TextureView r0 = r3.vl
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L11
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.TextureView r1 = r3.vl
            r0.removeView(r1)
        L11:
            com.bytedance.adsdk.lottie.LottieAnimationView r0 = r3.jy
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L29
            android.view.TextureView r1 = r3.vl
            r2 = 1325400064(0x4f000000, float:2.1474836E9)
            r1.setTranslationX(r2)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.TextureView r1 = r3.vl
            r0.addView(r1)
        L29:
            return
    }

    static /* synthetic */ void cw(com.bytedance.adsdk.lottie.model.layer.xt r0) {
            r0.av()
            return
    }

    private void i() {
            r4 = this;
            r4.av()
            com.bytedance.adsdk.lottie.LottieAnimationView r0 = r4.jy
            if (r0 == 0) goto L10
            android.os.Handler r0 = r4.ws
            java.lang.Runnable r1 = r4.az
            r2 = 40
            r0.postDelayed(r1, r2)
        L10:
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

    static /* synthetic */ void j(com.bytedance.adsdk.lottie.model.layer.xt r0) {
            r0.i()
            return
    }

    static /* synthetic */ void j(com.bytedance.adsdk.lottie.model.layer.xt r0, java.lang.String r1, java.lang.String r2, android.content.Context r3, android.graphics.SurfaceTexture r4) {
            r0.j(r1, r2, r3, r4)
            return
    }

    private void j(java.lang.String r8, java.lang.String r9, android.content.Context r10, android.graphics.SurfaceTexture r11) {
            r7 = this;
            r7.ws()
            com.bykv.vk.openvk.component.video.j.r.r r0 = new com.bykv.vk.openvk.component.video.j.r.r
            java.lang.String r1 = "uttie"
            r0.<init>(r1)
            r7.oq = r0
            r0.j(r11)
            com.bykv.vk.openvk.component.video.j.r.r r11 = r7.oq
            com.bytedance.adsdk.lottie.model.layer.xt$3 r0 = new com.bytedance.adsdk.lottie.model.layer.xt$3
            r0.<init>(r7)
            r11.j(r0)
            com.bykv.vk.openvk.component.video.api.cw.cw r3 = new com.bykv.vk.openvk.component.video.api.cw.cw
            r3.<init>()
            r3.cw(r8)
            r3.up(r9)
            com.bykv.vk.openvk.component.video.api.cw.r r1 = new com.bykv.vk.openvk.component.video.api.cw.r
            java.lang.String r2 = com.bytedance.adsdk.lottie.up.xt.xt(r10)
            r5 = 0
            r6 = 0
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            com.bykv.vk.openvk.component.video.j.r.r r8 = r7.oq
            r8.j(r1)
            com.bykv.vk.openvk.component.video.j.r.r r8 = r7.oq
            r9 = 1
            r8.j(r9)
            com.bykv.vk.openvk.component.video.j.r.r r8 = r7.oq
            r10 = 0
            r8.j(r9, r10, r9)
            return
    }

    static /* synthetic */ boolean j(com.bytedance.adsdk.lottie.model.layer.xt r0, boolean r1) {
            r0.qv = r1
            return r1
    }

    static /* synthetic */ android.view.TextureView m(com.bytedance.adsdk.lottie.model.layer.xt r0) {
            android.view.TextureView r0 = r0.vl
            return r0
    }

    static /* synthetic */ com.bytedance.adsdk.lottie.LottieAnimationView r(com.bytedance.adsdk.lottie.model.layer.xt r0) {
            com.bytedance.adsdk.lottie.LottieAnimationView r0 = r0.jy
            return r0
    }

    static /* synthetic */ android.os.Handler tl(com.bytedance.adsdk.lottie.model.layer.xt r0) {
            android.os.Handler r0 = r0.ws
            return r0
    }

    static /* synthetic */ void up(com.bytedance.adsdk.lottie.model.layer.xt r0) {
            r0.az()
            return
    }

    private void ws() {
            r1 = this;
            com.bykv.vk.openvk.component.video.j.r.r r0 = r1.oq
            if (r0 == 0) goto L15
            boolean r0 = r1.qv
            if (r0 == 0) goto Ld
            com.bykv.vk.openvk.component.video.j.r.r r0 = r1.oq
            r0.r()
        Ld:
            com.bykv.vk.openvk.component.video.j.r.r r0 = r1.oq
            r0.up()
            r0 = 0
            r1.oq = r0
        L15:
            return
    }

    static /* synthetic */ void xt(com.bytedance.adsdk.lottie.model.layer.xt r0) {
            r0.ws()
            return
    }

    @Override // com.bytedance.adsdk.lottie.model.layer.ae, com.bytedance.adsdk.lottie.model.layer.cw
    public void xt(android.graphics.Canvas r3, android.graphics.Matrix r4, int r5) {
            r2 = this;
            float r0 = r2.tl
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L30
            android.view.TextureView r0 = r2.vl
            if (r0 == 0) goto L30
            r3.save()
            r3.concat(r4)
            r2.j(r5)
            float r4 = r2.tl()
            android.view.TextureView r5 = r2.vl
            float r0 = r2.tl
            int r0 = (int) r0
            float r1 = r2.g
            int r1 = (int) r1
            j(r5, r0, r1)
            android.view.TextureView r5 = r2.vl
            r5.setAlpha(r4)
            android.view.TextureView r4 = r2.vl
            r4.draw(r3)
            r3.restore()
        L30:
            return
    }
}
