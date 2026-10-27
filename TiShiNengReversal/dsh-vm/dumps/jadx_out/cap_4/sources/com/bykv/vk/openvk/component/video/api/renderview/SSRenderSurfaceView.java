package com.bykv.vk.openvk.component.video.api.renderview;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class SSRenderSurfaceView extends com.bykv.vk.openvk.component.video.api.renderview.SSSurfaceView implements android.view.SurfaceHolder.Callback, com.bykv.vk.openvk.component.video.api.renderview.xt {
    private static final java.util.ArrayList<com.bykv.vk.openvk.component.video.api.renderview.cw> cw = null;
    private java.lang.ref.WeakReference<com.bykv.vk.openvk.component.video.api.renderview.j> j;

    /* renamed from: r, reason: collision with root package name */
    private com.bykv.vk.openvk.component.video.api.renderview.xt.j f1686r;
    private com.bykv.vk.openvk.component.video.api.renderview.cw xt;

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.bykv.vk.openvk.component.video.api.renderview.SSRenderSurfaceView.cw = r0
            return
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
    public void j(com.bykv.vk.openvk.component.video.api.renderview.j r4) {
            r3 = this;
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r4)
            r3.j = r0
            android.view.SurfaceHolder r4 = r3.getHolder()
            r0 = -3
            r4.setFormat(r0)
            java.util.ArrayList<com.bykv.vk.openvk.component.video.api.renderview.cw> r0 = com.bykv.vk.openvk.component.video.api.renderview.SSRenderSurfaceView.cw
            java.util.Iterator r0 = r0.iterator()
        L15:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()
            com.bykv.vk.openvk.component.video.api.renderview.cw r1 = (com.bykv.vk.openvk.component.video.api.renderview.cw) r1
            if (r1 == 0) goto L15
            android.view.SurfaceHolder$Callback r2 = r1.j()
            if (r2 != 0) goto L15
            r4.removeCallback(r1)
            r0.remove()
            goto L15
        L30:
            com.bykv.vk.openvk.component.video.api.renderview.cw r0 = r3.xt
            r4.addCallback(r0)
            return
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onWindowVisibilityChanged(int r1) {
            r0 = this;
            super.onWindowVisibilityChanged(r1)
            return
    }

    public void setWindowVisibilityChangedListener(com.bykv.vk.openvk.component.video.api.renderview.xt.j r1) {
            r0 = this;
            r0.f1686r = r1
            return
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder r3, int r4, int r5, int r6) {
            r2 = this;
            java.lang.String r0 = "CSJ_VIDEO_SurfaceView"
            java.lang.String r1 = "surfaceChanged: "
            com.bykv.vk.openvk.component.video.api.m.cw.j(r0, r1)
            java.lang.ref.WeakReference<com.bykv.vk.openvk.component.video.api.renderview.j> r0 = r2.j
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L1c
            java.lang.ref.WeakReference<com.bykv.vk.openvk.component.video.api.renderview.j> r0 = r2.j
            java.lang.Object r0 = r0.get()
            com.bykv.vk.openvk.component.video.api.renderview.j r0 = (com.bykv.vk.openvk.component.video.api.renderview.j) r0
            r0.j(r3, r4, r5, r6)
        L1c:
            return
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder r2) {
            r1 = this;
            java.lang.ref.WeakReference<com.bykv.vk.openvk.component.video.api.renderview.j> r0 = r1.j
            if (r0 == 0) goto L15
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L15
            java.lang.ref.WeakReference<com.bykv.vk.openvk.component.video.api.renderview.j> r0 = r1.j
            java.lang.Object r0 = r0.get()
            com.bykv.vk.openvk.component.video.api.renderview.j r0 = (com.bykv.vk.openvk.component.video.api.renderview.j) r0
            r0.j(r2)
        L15:
            java.lang.String r2 = "CSJ_VIDEO_SurfaceView"
            java.lang.String r0 = "surfaceCreated: "
            com.bykv.vk.openvk.component.video.api.m.cw.j(r2, r0)
            return
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder r3) {
            r2 = this;
            java.lang.String r0 = "CSJ_VIDEO_SurfaceView"
            java.lang.String r1 = "surfaceDestroyed: "
            com.bykv.vk.openvk.component.video.api.m.cw.j(r0, r1)
            java.lang.ref.WeakReference<com.bykv.vk.openvk.component.video.api.renderview.j> r0 = r2.j
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L1c
            java.lang.ref.WeakReference<com.bykv.vk.openvk.component.video.api.renderview.j> r0 = r2.j
            java.lang.Object r0 = r0.get()
            com.bykv.vk.openvk.component.video.api.renderview.j r0 = (com.bykv.vk.openvk.component.video.api.renderview.j) r0
            r0.xt(r3)
        L1c:
            return
    }
}
