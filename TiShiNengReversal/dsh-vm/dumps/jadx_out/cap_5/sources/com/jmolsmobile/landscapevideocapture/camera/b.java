package com.jmolsmobile.landscapevideocapture.camera;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class b {
    private final int a;
    private com.jmolsmobile.landscapevideocapture.camera.c b;

    public b(com.jmolsmobile.landscapevideocapture.camera.c r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.a = r2
            return
    }

    private android.media.CamcorderProfile e() {
            r2 = this;
            r0 = 1
            android.media.CamcorderProfile r0 = android.media.CamcorderProfile.get(r0)
            if (r0 == 0) goto L8
            return r0
        L8:
            r0 = 0
            android.media.CamcorderProfile r0 = android.media.CamcorderProfile.get(r0)
            if (r0 == 0) goto L10
            return r0
        L10:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "No quality level found"
            r0.<init>(r1)
            throw r0
    }

    public void a(int r3, int r4) {
            r2 = this;
            com.jmolsmobile.landscapevideocapture.camera.c r0 = r2.b
            android.hardware.Camera$Parameters r0 = r0.f()
            java.util.List r1 = r0.getSupportedPreviewSizes()
            com.jmolsmobile.landscapevideocapture.camera.a r3 = r2.f(r1, r3, r4)
            int r4 = r3.b()
            int r1 = r3.a()
            r0.setPreviewSize(r4, r1)
            r4 = 17
            r0.setPreviewFormat(r4)
            com.jmolsmobile.landscapevideocapture.camera.c r4 = r2.b
            r4.p(r0)
            com.jmolsmobile.landscapevideocapture.camera.c r4 = r2.b
            int r0 = r2.g()
            r4.k(r0)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Preview size: "
            r4.append(r0)
            int r0 = r3.b()
            r4.append(r0)
            java.lang.String r0 = "x"
            r4.append(r0)
            int r3 = r3.a()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "VideoCapture_CameraWrapper"
            com.jmolsmobile.landscapevideocapture.b.a(r4, r3)
            return
    }

    public void b() {
            r2 = this;
            com.jmolsmobile.landscapevideocapture.camera.c r0 = r2.b
            android.hardware.Camera$Parameters r0 = r0.f()
            java.lang.String r1 = "continuous-video"
            r0.setFocusMode(r1)
            com.jmolsmobile.landscapevideocapture.camera.c r1 = r2.b
            r1.p(r0)
            return
    }

    public android.media.CamcorderProfile c() {
            r2 = this;
            r0 = 5
            boolean r1 = android.media.CamcorderProfile.hasProfile(r0)
            if (r1 == 0) goto Lc
            android.media.CamcorderProfile r0 = android.media.CamcorderProfile.get(r0)
            return r0
        Lc:
            r0 = 4
            boolean r1 = android.media.CamcorderProfile.hasProfile(r0)
            if (r1 == 0) goto L18
            android.media.CamcorderProfile r0 = android.media.CamcorderProfile.get(r0)
            return r0
        L18:
            android.media.CamcorderProfile r0 = r2.e()
            return r0
    }

    public android.hardware.Camera d() {
            r1 = this;
            com.jmolsmobile.landscapevideocapture.camera.c r0 = r1.b
            android.hardware.Camera r0 = r0.e()
            return r0
    }

    public com.jmolsmobile.landscapevideocapture.camera.a f(java.util.List<android.hardware.Camera.Size> r16, int r17, int r18) {
            r15 = this;
            r0 = r17
            r1 = r18
            double r2 = (double) r0
            double r4 = (double) r1
            double r2 = r2 / r4
            r0 = 0
            if (r16 != 0) goto Lb
            return r0
        Lb:
            java.util.Iterator r4 = r16.iterator()
            r5 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            r7 = r5
        L15:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L4d
            java.lang.Object r9 = r4.next()
            android.hardware.Camera$Size r9 = (android.hardware.Camera.Size) r9
            int r10 = r9.width
            double r10 = (double) r10
            int r12 = r9.height
            double r12 = (double) r12
            double r10 = r10 / r12
            double r10 = r10 - r2
            double r10 = java.lang.Math.abs(r10)
            r12 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 <= 0) goto L37
            goto L15
        L37:
            int r10 = r9.height
            int r10 = r10 - r1
            int r10 = java.lang.Math.abs(r10)
            double r10 = (double) r10
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 >= 0) goto L15
            int r0 = r9.height
            int r0 = r0 - r1
            int r0 = java.lang.Math.abs(r0)
            double r7 = (double) r0
            r0 = r9
            goto L15
        L4d:
            if (r0 != 0) goto L76
            java.util.Iterator r2 = r16.iterator()
        L53:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L76
            java.lang.Object r3 = r2.next()
            android.hardware.Camera$Size r3 = (android.hardware.Camera.Size) r3
            int r4 = r3.height
            int r4 = r4 - r1
            int r4 = java.lang.Math.abs(r4)
            double r7 = (double) r4
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 >= 0) goto L53
            int r0 = r3.height
            int r0 = r0 - r1
            int r0 = java.lang.Math.abs(r0)
            double r4 = (double) r0
            r0 = r3
            r5 = r4
            goto L53
        L76:
            com.jmolsmobile.landscapevideocapture.camera.a r1 = new com.jmolsmobile.landscapevideocapture.camera.a
            int r2 = r0.width
            int r0 = r0.height
            r1.<init>(r2, r0)
            return r1
    }

    public int g() {
            r2 = this;
            int r0 = r2.a
            int r0 = r0 * 90
            com.jmolsmobile.landscapevideocapture.camera.c r1 = r2.b
            boolean r1 = r1.h()
            if (r1 == 0) goto L1a
            com.jmolsmobile.landscapevideocapture.camera.c r1 = r2.b
            int r1 = r1.b()
            int r1 = r1 + r0
            int r1 = r1 % 360
            int r0 = 360 - r1
            int r0 = r0 % 360
            return r0
        L1a:
            com.jmolsmobile.landscapevideocapture.camera.c r1 = r2.b
            int r1 = r1.b()
            int r1 = r1 - r0
            int r1 = r1 + 360
            int r1 = r1 % 360
            return r1
    }

    public com.jmolsmobile.landscapevideocapture.camera.d h(int r5, int r6) {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            java.util.List r0 = r4.i(r0)
            com.jmolsmobile.landscapevideocapture.camera.a r0 = r4.f(r0, r5, r6)
            java.lang.String r1 = "x"
            java.lang.String r2 = "VideoCapture_CameraWrapper"
            if (r0 != 0) goto L30
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Failed to find supported recording size - falling back to requested: "
            r0.append(r3)
            r0.append(r5)
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.jmolsmobile.landscapevideocapture.b.b(r2, r0)
            com.jmolsmobile.landscapevideocapture.camera.d r0 = new com.jmolsmobile.landscapevideocapture.camera.d
            r0.<init>(r5, r6)
            return r0
        L30:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Recording size: "
            r5.append(r6)
            int r6 = r0.b()
            r5.append(r6)
            r5.append(r1)
            int r6 = r0.a()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.jmolsmobile.landscapevideocapture.b.a(r2, r5)
            com.jmolsmobile.landscapevideocapture.camera.d r5 = new com.jmolsmobile.landscapevideocapture.camera.d
            int r6 = r0.b()
            int r0 = r0.a()
            r5.<init>(r6, r0)
            return r5
    }

    @android.annotation.TargetApi(11)
    protected java.util.List<android.hardware.Camera.Size> i(int r4) {
            r3 = this;
            com.jmolsmobile.landscapevideocapture.camera.c r0 = r3.b
            android.hardware.Camera$Parameters r0 = r0.f()
            r1 = 11
            java.lang.String r2 = "VideoCapture_CameraWrapper"
            if (r4 >= r1) goto L16
            java.lang.String r4 = "Using supportedPreviewSizes iso supportedVideoSizes due to API restriction"
            com.jmolsmobile.landscapevideocapture.b.b(r2, r4)
            java.util.List r4 = r0.getSupportedPreviewSizes()
            return r4
        L16:
            java.util.List r4 = r0.getSupportedVideoSizes()
            if (r4 != 0) goto L26
            java.lang.String r4 = "Using supportedPreviewSizes because supportedVideoSizes is null"
            com.jmolsmobile.landscapevideocapture.b.b(r2, r4)
            java.util.List r4 = r0.getSupportedPreviewSizes()
            return r4
        L26:
            java.util.List r4 = r0.getSupportedVideoSizes()
            return r4
    }

    public void j(boolean r2) throws com.jmolsmobile.landscapevideocapture.camera.OpenCameraException {
            r1 = this;
            com.jmolsmobile.landscapevideocapture.camera.c r0 = r1.b     // Catch: java.lang.RuntimeException -> L16
            r0.i(r2)     // Catch: java.lang.RuntimeException -> L16
            com.jmolsmobile.landscapevideocapture.camera.c r2 = r1.b
            android.hardware.Camera r2 = r2.e()
            if (r2 == 0) goto Le
            return
        Le:
            com.jmolsmobile.landscapevideocapture.camera.OpenCameraException r2 = new com.jmolsmobile.landscapevideocapture.camera.OpenCameraException
            com.jmolsmobile.landscapevideocapture.camera.OpenCameraException$OpenType r0 = com.jmolsmobile.landscapevideocapture.camera.OpenCameraException.OpenType.NOCAMERA
            r2.<init>(r0)
            throw r2
        L16:
            com.jmolsmobile.landscapevideocapture.camera.OpenCameraException r2 = new com.jmolsmobile.landscapevideocapture.camera.OpenCameraException
            com.jmolsmobile.landscapevideocapture.camera.OpenCameraException$OpenType r0 = com.jmolsmobile.landscapevideocapture.camera.OpenCameraException.OpenType.INUSE
            r2.<init>(r0)
            throw r2
    }

    public void k() throws com.jmolsmobile.landscapevideocapture.camera.PrepareCameraException {
            r1 = this;
            com.jmolsmobile.landscapevideocapture.camera.c r0 = r1.b     // Catch: java.lang.RuntimeException -> L6
            r0.o()     // Catch: java.lang.RuntimeException -> L6
            return
        L6:
            com.jmolsmobile.landscapevideocapture.camera.PrepareCameraException r0 = new com.jmolsmobile.landscapevideocapture.camera.PrepareCameraException
            r0.<init>()
            throw r0
    }

    public void l() {
            r1 = this;
            android.hardware.Camera r0 = r1.d()
            if (r0 != 0) goto L7
            return
        L7:
            com.jmolsmobile.landscapevideocapture.camera.c r0 = r1.b
            r0.j()
            return
    }

    public void m(android.view.SurfaceHolder r2) throws java.io.IOException {
            r1 = this;
            com.jmolsmobile.landscapevideocapture.camera.c r0 = r1.b
            r0.l(r2)
            com.jmolsmobile.landscapevideocapture.camera.c r2 = r1.b
            r2.m()
            return
    }

    public void n() throws java.lang.Exception {
            r1 = this;
            com.jmolsmobile.landscapevideocapture.camera.c r0 = r1.b
            r0.n()
            com.jmolsmobile.landscapevideocapture.camera.c r0 = r1.b
            r0.a()
            return
    }
}
