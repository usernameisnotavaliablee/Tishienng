package com.bykv.vk.openvk.component.video.api.renderview;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class SSRenderTextureView extends android.view.TextureView implements android.view.TextureView.SurfaceTextureListener, com.bykv.vk.openvk.component.video.api.renderview.xt {
    private com.bykv.vk.openvk.component.video.api.renderview.j j;
    private com.bykv.vk.openvk.component.video.api.renderview.xt.j xt;

    public SSRenderTextureView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public SSRenderTextureView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // com.bykv.vk.openvk.component.video.api.renderview.xt
    public android.view.SurfaceHolder getHolder() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.bykv.vk.openvk.component.video.api.renderview.xt
    public android.view.View getView() {
            r0 = this;
            return r0
    }

    @Override // com.bykv.vk.openvk.component.video.api.renderview.xt
    public void j(int r2, int r3) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r0.height = r3
            r0.width = r2
            r1.setLayoutParams(r0)
            return
    }

    @Override // com.bykv.vk.openvk.component.video.api.renderview.xt
    public void j(com.bykv.vk.openvk.component.video.api.renderview.j r1) {
            r0 = this;
            r0.j = r1
            r0.setSurfaceTextureListener(r0)
            return
    }

    @Override // android.view.TextureView, android.view.View
    protected void onAttachedToWindow() {
            r0 = this;
            super.onAttachedToWindow()
            return
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
            r3 = this;
            super.onDetachedFromWindow()     // Catch: java.lang.Throwable -> L4
            return
        L4:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
            boolean r1 = com.bykv.vk.openvk.component.video.api.m.cw.xt()
            if (r1 == 0) goto L15
            java.lang.String r1 = "CSJ_VIDEO_TextureView"
            java.lang.String r2 = "rethrow exception for debug & local_test, (TextureView)"
            com.bykv.vk.openvk.component.video.api.m.cw.j(r1, r2, r0)
        L15:
            return
    }

    @Override // android.view.TextureView, android.view.View
    protected void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onSizeChanged(r1, r2, r3, r4)
            return
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture r3, int r4, int r5) {
            r2 = this;
            java.lang.String r0 = "CSJ_VIDEO_TextureView"
            java.lang.String r1 = "onSurfaceTextureAvailable: "
            com.bykv.vk.openvk.component.video.api.m.cw.j(r0, r1)
            com.bykv.vk.openvk.component.video.api.renderview.j r0 = r2.j
            if (r0 == 0) goto Le
            r0.j(r3, r4, r5)
        Le:
            return
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture r3) {
            r2 = this;
            java.lang.String r0 = "CSJ_VIDEO_TextureView"
            java.lang.String r1 = "onSurfaceTextureDestroyed: "
            com.bykv.vk.openvk.component.video.api.m.cw.j(r0, r1)
            com.bykv.vk.openvk.component.video.api.renderview.j r0 = r2.j
            if (r0 == 0) goto L10
            boolean r3 = r0.j(r3)
            return r3
        L10:
            r3 = 0
            return r3
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture r1, int r2, int r3) {
            r0 = this;
            java.lang.String r1 = "CSJ_VIDEO_TextureView"
            java.lang.String r2 = "onSurfaceTextureSizeChanged: "
            com.bykv.vk.openvk.component.video.api.m.cw.j(r1, r2)
            return
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture r1) {
            r0 = this;
            return
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int r1) {
            r0 = this;
            super.onWindowVisibilityChanged(r1)
            return
    }

    public void setWindowVisibilityChangedListener(com.bykv.vk.openvk.component.video.api.renderview.xt.j r1) {
            r0 = this;
            r0.xt = r1
            return
    }
}
