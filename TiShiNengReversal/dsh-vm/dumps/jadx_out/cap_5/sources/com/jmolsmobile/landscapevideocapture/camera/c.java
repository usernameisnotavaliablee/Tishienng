package com.jmolsmobile.landscapevideocapture.camera;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class c {
    private android.hardware.Camera a;
    private boolean b;
    private android.hardware.Camera.Parameters c;

    public c() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.a = r0
            r1 = 0
            r2.b = r1
            r2.c = r0
            return
    }

    private int c() {
            r1 = this;
            boolean r0 = r1.b
            return r0
    }

    private int d() {
            r4 = this;
            int r0 = android.hardware.Camera.getNumberOfCameras()
            r1 = 0
        L5:
            if (r1 >= r0) goto L1b
            android.hardware.Camera$CameraInfo r2 = new android.hardware.Camera$CameraInfo
            r2.<init>()
            android.hardware.Camera.getCameraInfo(r1, r2)
            int r2 = r2.facing
            int r3 = r4.c()
            if (r2 != r3) goto L18
            return r1
        L18:
            int r1 = r1 + 1
            goto L5
        L1b:
            r0 = -1
            return r0
    }

    private boolean g() {
            r4 = this;
            r0 = 0
            r1 = 0
        L2:
            int r2 = android.hardware.Camera.getNumberOfCameras()
            if (r1 >= r2) goto L19
            android.hardware.Camera$CameraInfo r2 = new android.hardware.Camera$CameraInfo
            r2.<init>()
            android.hardware.Camera.getCameraInfo(r1, r2)
            int r2 = r2.facing
            r3 = 1
            if (r2 != r3) goto L16
            return r3
        L16:
            int r1 = r1 + 1
            goto L2
        L19:
            return r0
    }

    public void a() {
            r2 = this;
            android.hardware.Camera r0 = r2.a
            r1 = 0
            r0.setPreviewCallback(r1)
            return
    }

    public int b() {
            r2 = this;
            android.hardware.Camera$CameraInfo r0 = new android.hardware.Camera$CameraInfo
            r0.<init>()
            int r1 = r2.d()
            android.hardware.Camera.getCameraInfo(r1, r0)
            int r0 = r0.orientation
            return r0
    }

    public android.hardware.Camera e() {
            r1 = this;
            android.hardware.Camera r0 = r1.a
            return r0
    }

    public android.hardware.Camera.Parameters f() {
            r1 = this;
            android.hardware.Camera$Parameters r0 = r1.c
            if (r0 != 0) goto Lc
            android.hardware.Camera r0 = r1.a
            android.hardware.Camera$Parameters r0 = r0.getParameters()
            r1.c = r0
        Lc:
            android.hardware.Camera$Parameters r0 = r1.c
            return r0
    }

    public boolean h() {
            r1 = this;
            boolean r0 = r1.b
            return r0
    }

    public void i(boolean r2) throws java.lang.RuntimeException {
            r1 = this;
            if (r2 == 0) goto L13
            boolean r2 = r1.g()
            if (r2 != 0) goto L9
            return
        L9:
            r2 = 1
            android.hardware.Camera r0 = android.hardware.Camera.open(r2)
            r1.a = r0
            r1.b = r2
            return
        L13:
            r2 = 0
            android.hardware.Camera r2 = android.hardware.Camera.open(r2)
            r1.a = r2
            return
    }

    public void j() {
            r1 = this;
            android.hardware.Camera r0 = r1.a
            r0.release()
            return
    }

    public void k(int r2) {
            r1 = this;
            android.hardware.Camera r0 = r1.a
            r0.setDisplayOrientation(r2)
            return
    }

    public void l(android.view.SurfaceHolder r2) throws java.io.IOException {
            r1 = this;
            android.hardware.Camera r0 = r1.a
            r0.setPreviewDisplay(r2)
            return
    }

    public void m() {
            r1 = this;
            android.hardware.Camera r0 = r1.a
            r0.startPreview()
            return
    }

    public void n() {
            r1 = this;
            android.hardware.Camera r0 = r1.a
            r0.stopPreview()
            return
    }

    public void o() {
            r1 = this;
            android.hardware.Camera r0 = r1.a
            r0.unlock()
            return
    }

    public void p(android.hardware.Camera.Parameters r2) {
            r1 = this;
            r1.c = r2
            android.hardware.Camera r0 = r1.a
            r0.setParameters(r2)
            return
    }
}
