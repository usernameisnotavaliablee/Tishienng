package com.jmolsmobile.landscapevideocapture.preview;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a implements android.view.SurfaceHolder.Callback {
    private boolean a;
    private final com.jmolsmobile.landscapevideocapture.preview.b b;
    public final com.jmolsmobile.landscapevideocapture.camera.b c;

    public a(com.jmolsmobile.landscapevideocapture.preview.b r2, com.jmolsmobile.landscapevideocapture.camera.b r3, android.view.SurfaceHolder r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            r1.b = r2
            r1.c = r3
            r1.a(r4)
            return
    }

    private void a(android.view.SurfaceHolder r2) {
            r1 = this;
            r2.removeCallback(r1)
            r2.addCallback(r1)
            r0 = 3
            r2.setType(r0)
            return
    }

    public static boolean b() {
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

    public void c() {
            r2 = this;
            boolean r0 = r2.a
            if (r0 == 0) goto L15
            com.jmolsmobile.landscapevideocapture.camera.b r0 = r2.c     // Catch: java.lang.Exception -> Le
            r0.n()     // Catch: java.lang.Exception -> Le
            r0 = 0
            r2.d(r0)     // Catch: java.lang.Exception -> Le
            return
        Le:
            java.lang.String r0 = "VideoCapture_Preview"
            java.lang.String r1 = "Failed to clean up preview resources"
            com.jmolsmobile.landscapevideocapture.b.b(r0, r1)
        L15:
            return
    }

    protected void d(boolean r1) {
            r0 = this;
            r0.a = r1
            return
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder r3, int r4, int r5, int r6) {
            r2 = this;
            java.lang.String r4 = "VideoCapture_Preview"
            boolean r0 = r2.a
            if (r0 == 0) goto Lb
            com.jmolsmobile.landscapevideocapture.camera.b r0 = r2.c     // Catch: java.lang.Exception -> Lb
            r0.n()     // Catch: java.lang.Exception -> Lb
        Lb:
            com.jmolsmobile.landscapevideocapture.camera.b r0 = r2.c     // Catch: java.lang.RuntimeException -> L57
            r0.a(r5, r6)     // Catch: java.lang.RuntimeException -> L57
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L57
            r0.<init>()     // Catch: java.lang.RuntimeException -> L57
            java.lang.String r1 = "Configured camera for preview in surface of "
            r0.append(r1)     // Catch: java.lang.RuntimeException -> L57
            r0.append(r5)     // Catch: java.lang.RuntimeException -> L57
            java.lang.String r5 = " by "
            r0.append(r5)     // Catch: java.lang.RuntimeException -> L57
            r0.append(r6)     // Catch: java.lang.RuntimeException -> L57
            java.lang.String r5 = r0.toString()     // Catch: java.lang.RuntimeException -> L57
            com.jmolsmobile.landscapevideocapture.b.a(r4, r5)     // Catch: java.lang.RuntimeException -> L57
            com.jmolsmobile.landscapevideocapture.camera.b r5 = r2.c     // Catch: java.lang.RuntimeException -> L32
            r5.b()     // Catch: java.lang.RuntimeException -> L32
            goto L37
        L32:
            java.lang.String r5 = "AutoFocus not available for preview"
            com.jmolsmobile.landscapevideocapture.b.a(r4, r5)
        L37:
            com.jmolsmobile.landscapevideocapture.camera.b r5 = r2.c     // Catch: java.lang.RuntimeException -> L41 java.io.IOException -> L4c
            r5.m(r3)     // Catch: java.lang.RuntimeException -> L41 java.io.IOException -> L4c
            r3 = 1
            r2.d(r3)     // Catch: java.lang.RuntimeException -> L41 java.io.IOException -> L4c
            goto L56
        L41:
            java.lang.String r3 = "Failed to show preview - unable to start camera preview (RuntimeException)"
            com.jmolsmobile.landscapevideocapture.b.a(r4, r3)
            com.jmolsmobile.landscapevideocapture.preview.b r3 = r2.b
            r3.a()
            goto L56
        L4c:
            java.lang.String r3 = "Failed to show preview - unable to connect camera to preview (IOException)"
            com.jmolsmobile.landscapevideocapture.b.a(r4, r3)
            com.jmolsmobile.landscapevideocapture.preview.b r3 = r2.b
            r3.a()
        L56:
            return
        L57:
            java.lang.String r3 = "Failed to show preview - invalid parameters set to camera preview"
            com.jmolsmobile.landscapevideocapture.b.a(r4, r3)
            com.jmolsmobile.landscapevideocapture.preview.b r3 = r2.b
            r3.a()
            return
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder r1) {
            r0 = this;
            return
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder r1) {
            r0 = this;
            return
    }
}
