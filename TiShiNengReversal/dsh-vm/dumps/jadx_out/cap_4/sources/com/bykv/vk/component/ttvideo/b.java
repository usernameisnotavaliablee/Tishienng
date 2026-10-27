package com.bykv.vk.component.ttvideo;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class b implements android.view.SurfaceHolder.Callback {
    private final java.lang.ref.WeakReference<com.bykv.vk.component.ttvideo.TTVideoEngine> a;

    public b(com.bykv.vk.component.ttvideo.TTVideoEngine r2) {
            r1 = this;
            r1.<init>()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.a = r0
            return
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder r2) {
            r1 = this;
            java.lang.ref.WeakReference<com.bykv.vk.component.ttvideo.TTVideoEngine> r0 = r1.a
            java.lang.Object r0 = r0.get()
            com.bykv.vk.component.ttvideo.TTVideoEngine r0 = (com.bykv.vk.component.ttvideo.TTVideoEngine) r0
            if (r0 == 0) goto L11
            android.view.Surface r2 = r2.getSurface()
            r0.a(r2)
        L11:
            return
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder r2) {
            r1 = this;
            java.lang.ref.WeakReference<com.bykv.vk.component.ttvideo.TTVideoEngine> r2 = r1.a
            java.lang.Object r2 = r2.get()
            com.bykv.vk.component.ttvideo.TTVideoEngine r2 = (com.bykv.vk.component.ttvideo.TTVideoEngine) r2
            if (r2 == 0) goto Le
            r0 = 0
            r2.a(r0)
        Le:
            return
    }
}
