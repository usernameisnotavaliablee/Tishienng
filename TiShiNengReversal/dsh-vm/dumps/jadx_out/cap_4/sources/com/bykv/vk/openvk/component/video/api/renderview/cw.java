package com.bykv.vk.openvk.component.video.api.renderview;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class cw implements android.view.SurfaceHolder.Callback {
    private final java.lang.ref.WeakReference<android.view.SurfaceHolder.Callback> j;

    public cw() {
            r1 = this;
            r1.<init>()
            return
    }

    public android.view.SurfaceHolder.Callback j() {
            r1 = this;
            java.lang.ref.WeakReference<android.view.SurfaceHolder$Callback> r0 = r1.j
            java.lang.Object r0 = r0.get()
            android.view.SurfaceHolder$Callback r0 = (android.view.SurfaceHolder.Callback) r0
            return r0
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder r2, int r3, int r4, int r5) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.SurfaceHolder$Callback> r0 = r1.j
            java.lang.Object r0 = r0.get()
            android.view.SurfaceHolder$Callback r0 = (android.view.SurfaceHolder.Callback) r0
            if (r0 == 0) goto Ld
            r0.surfaceChanged(r2, r3, r4, r5)
        Ld:
            return
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.SurfaceHolder$Callback> r0 = r1.j
            java.lang.Object r0 = r0.get()
            android.view.SurfaceHolder$Callback r0 = (android.view.SurfaceHolder.Callback) r0
            if (r0 == 0) goto Ld
            r0.surfaceCreated(r2)
        Ld:
            return
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.SurfaceHolder$Callback> r0 = r1.j
            java.lang.Object r0 = r0.get()
            android.view.SurfaceHolder$Callback r0 = (android.view.SurfaceHolder.Callback) r0
            if (r0 == 0) goto Ld
            r0.surfaceDestroyed(r2)
        Ld:
            return
    }
}
