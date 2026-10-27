package com.jmolsmobile.landscapevideocapture.recorder;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a implements android.media.MediaRecorder.OnInfoListener, com.jmolsmobile.landscapevideocapture.preview.b {
    private com.jmolsmobile.landscapevideocapture.camera.b a;
    private com.jmolsmobile.landscapevideocapture.preview.a b;
    private final com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration c;
    private final com.jmolsmobile.landscapevideocapture.c d;
    private android.media.MediaRecorder e;
    private boolean f;
    private final com.jmolsmobile.landscapevideocapture.recorder.b g;

    public a(com.jmolsmobile.landscapevideocapture.recorder.b r2, com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration r3, com.jmolsmobile.landscapevideocapture.c r4, com.jmolsmobile.landscapevideocapture.camera.b r5, android.view.SurfaceHolder r6, boolean r7) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f = r0
            r1.c = r3
            r1.g = r2
            r1.d = r4
            r1.a = r5
            r1.e(r6, r7)
            return
    }

    private boolean d() {
            r4 = this;
            java.lang.String r0 = "VideoCapture_VideoRecorder"
            com.jmolsmobile.landscapevideocapture.camera.b r1 = r4.a     // Catch: com.jmolsmobile.landscapevideocapture.camera.PrepareCameraException -> L23
            r1.k()     // Catch: com.jmolsmobile.landscapevideocapture.camera.PrepareCameraException -> L23
            android.media.MediaRecorder r1 = new android.media.MediaRecorder
            r1.<init>()
            r4.j(r1)
            android.media.MediaRecorder r1 = r4.c()
            com.jmolsmobile.landscapevideocapture.camera.b r2 = r4.a
            android.hardware.Camera r2 = r2.d()
            r4.b(r1, r2)
            java.lang.String r1 = "MediaRecorder successfully initialized"
            com.jmolsmobile.landscapevideocapture.b.a(r0, r1)
            r0 = 1
            return r0
        L23:
            r1 = move-exception
            com.jmolsmobile.landscapevideocapture.recorder.b r2 = r4.g
            java.lang.String r3 = "Unable to record video"
            r2.e(r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to initialize recorder - "
            r2.append(r3)
            java.lang.String r1 = r1.toString()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.jmolsmobile.landscapevideocapture.b.b(r0, r1)
            r0 = 0
            return r0
    }

    private boolean g() {
            r5 = this;
            java.lang.String r0 = "MediaRecorder preparation failed - "
            java.lang.String r1 = "VideoCapture_VideoRecorder"
            r2 = 0
            android.media.MediaRecorder r3 = r5.c()     // Catch: java.io.IOException -> L13 java.lang.IllegalStateException -> L15
            r3.prepare()     // Catch: java.io.IOException -> L13 java.lang.IllegalStateException -> L15
            java.lang.String r3 = "MediaRecorder successfully prepared"
            com.jmolsmobile.landscapevideocapture.b.a(r1, r3)     // Catch: java.io.IOException -> L13 java.lang.IllegalStateException -> L15
            r0 = 1
            return r0
        L13:
            r3 = move-exception
            goto L17
        L15:
            r3 = move-exception
            goto L2e
        L17:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r0 = r3.toString()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.jmolsmobile.landscapevideocapture.b.b(r1, r0)
            return r2
        L2e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r0 = r3.toString()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.jmolsmobile.landscapevideocapture.b.b(r1, r0)
            return r2
    }

    private void i() {
            r1 = this;
            android.media.MediaRecorder r0 = r1.c()
            if (r0 == 0) goto Ld
            r0.release()
            r0 = 0
            r1.j(r0)
        Ld:
            return
    }

    private boolean k() {
            r5 = this;
            java.lang.String r0 = "MediaRecorder start failed - "
            java.lang.String r1 = "VideoCapture_VideoRecorder"
            r2 = 0
            android.media.MediaRecorder r3 = r5.c()     // Catch: java.lang.RuntimeException -> L13 java.lang.IllegalStateException -> L15
            r3.start()     // Catch: java.lang.RuntimeException -> L13 java.lang.IllegalStateException -> L15
            java.lang.String r3 = "MediaRecorder successfully started"
            com.jmolsmobile.landscapevideocapture.b.a(r1, r3)     // Catch: java.lang.RuntimeException -> L13 java.lang.IllegalStateException -> L15
            r0 = 1
            return r0
        L13:
            r3 = move-exception
            goto L17
        L15:
            r3 = move-exception
            goto L35
        L17:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r0 = r3.toString()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.jmolsmobile.landscapevideocapture.b.b(r1, r0)
            com.jmolsmobile.landscapevideocapture.recorder.b r0 = r5.g
            java.lang.String r1 = "Unable to record video with given settings"
            r0.e(r1)
            return r2
        L35:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r0 = r3.toString()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.jmolsmobile.landscapevideocapture.b.b(r1, r0)
            return r2
    }

    @Override // com.jmolsmobile.landscapevideocapture.preview.b
    public void a() {
            r2 = this;
            com.jmolsmobile.landscapevideocapture.recorder.b r0 = r2.g
            java.lang.String r1 = "Unable to show camera preview"
            r0.e(r1)
            return
    }

    protected void b(android.media.MediaRecorder r5, android.hardware.Camera r6) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException {
            r4 = this;
            java.lang.String r0 = "VideoCapture_VideoRecorder"
            r5.setCamera(r6)
            com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration r6 = r4.c
            int r6 = r6.l()
            r5.setAudioSource(r6)
            com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration r6 = r4.c
            int r6 = r6.x()
            r5.setVideoSource(r6)
            com.jmolsmobile.landscapevideocapture.camera.b r6 = r4.a
            android.media.CamcorderProfile r6 = r6.c()
            com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration r1 = r4.c
            int r1 = r1.q()
            r6.fileFormat = r1
            com.jmolsmobile.landscapevideocapture.camera.b r1 = r4.a
            com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration r2 = r4.c
            int r2 = r2.y()
            com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration r3 = r4.c
            int r3 = r3.w()
            com.jmolsmobile.landscapevideocapture.camera.d r1 = r1.h(r2, r3)
            int r2 = r1.a
            r6.videoFrameWidth = r2
            int r1 = r1.b
            r6.videoFrameHeight = r1
            com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration r1 = r4.c
            int r1 = r1.t()
            r6.videoBitRate = r1
            com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration r1 = r4.c
            int r1 = r1.k()
            r6.audioCodec = r1
            com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration r1 = r4.c
            int r1 = r1.u()
            r6.videoCodec = r1
            r5.setProfile(r6)
            com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration r6 = r4.c
            int r6 = r6.o()
            r5.setMaxDuration(r6)
            com.jmolsmobile.landscapevideocapture.c r6 = r4.d
            java.lang.String r6 = r6.d()
            r5.setOutputFile(r6)
            com.jmolsmobile.landscapevideocapture.camera.b r6 = r4.a
            int r6 = r6.g()
            r5.setOrientationHint(r6)
            com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration r6 = r4.c
            int r6 = r6.v()
            r5.setVideoFrameRate(r6)
            com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration r6 = r4.c     // Catch: java.lang.RuntimeException -> L89 java.lang.IllegalArgumentException -> L8f
            int r6 = r6.p()     // Catch: java.lang.RuntimeException -> L89 java.lang.IllegalArgumentException -> L8f
            long r1 = (long) r6     // Catch: java.lang.RuntimeException -> L89 java.lang.IllegalArgumentException -> L8f
            r5.setMaxFileSize(r1)     // Catch: java.lang.RuntimeException -> L89 java.lang.IllegalArgumentException -> L8f
            goto La9
        L89:
            java.lang.String r6 = "Failed to set max filesize - runtime exception"
            com.jmolsmobile.landscapevideocapture.b.b(r0, r6)
            goto La9
        L8f:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = "Failed to set max filesize - illegal argument: "
            r6.append(r1)
            com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration r1 = r4.c
            int r1 = r1.p()
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            com.jmolsmobile.landscapevideocapture.b.b(r0, r6)
        La9:
            r5.setOnInfoListener(r4)
            return
    }

    protected android.media.MediaRecorder c() {
            r1 = this;
            android.media.MediaRecorder r0 = r1.e
            return r0
    }

    protected void e(android.view.SurfaceHolder r2, boolean r3) {
            r1 = this;
            com.jmolsmobile.landscapevideocapture.camera.b r0 = r1.a     // Catch: com.jmolsmobile.landscapevideocapture.camera.OpenCameraException -> Lf
            r0.j(r3)     // Catch: com.jmolsmobile.landscapevideocapture.camera.OpenCameraException -> Lf
            com.jmolsmobile.landscapevideocapture.preview.a r3 = new com.jmolsmobile.landscapevideocapture.preview.a
            com.jmolsmobile.landscapevideocapture.camera.b r0 = r1.a
            r3.<init>(r1, r0, r2)
            r1.b = r3
            return
        Lf:
            r2 = move-exception
            com.jmolsmobile.landscapevideocapture.recorder.b r3 = r1.g
            java.lang.String r2 = r2.getMessage()
            r3.e(r2)
            return
    }

    protected boolean f() {
            r1 = this;
            boolean r0 = r1.f
            return r0
    }

    public void h() {
            r2 = this;
            com.jmolsmobile.landscapevideocapture.preview.a r0 = r2.b
            if (r0 == 0) goto L7
            r0.c()
        L7:
            com.jmolsmobile.landscapevideocapture.camera.b r0 = r2.a
            if (r0 == 0) goto L11
            r0.l()
            r0 = 0
            r2.a = r0
        L11:
            r2.i()
            java.lang.String r0 = "VideoCapture_VideoRecorder"
            java.lang.String r1 = "Released all resources"
            com.jmolsmobile.landscapevideocapture.b.a(r0, r1)
            return
    }

    protected void j(android.media.MediaRecorder r1) {
            r0 = this;
            r0.e = r1
            return
    }

    protected void l() {
            r2 = this;
            r0 = 0
            r2.f = r0
            boolean r0 = r2.d()
            if (r0 != 0) goto La
            goto L17
        La:
            boolean r0 = r2.g()
            if (r0 != 0) goto L11
            goto L17
        L11:
            boolean r0 = r2.k()
            if (r0 != 0) goto L18
        L17:
            return
        L18:
            r0 = 1
            r2.f = r0
            com.jmolsmobile.landscapevideocapture.recorder.b r0 = r2.g
            r0.f()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Successfully started recording - outputfile: "
            r0.append(r1)
            com.jmolsmobile.landscapevideocapture.c r1 = r2.d
            java.lang.String r1 = r1.d()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "VideoCapture_VideoRecorder"
            com.jmolsmobile.landscapevideocapture.b.a(r1, r0)
            return
    }

    public void m(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "VideoCapture_VideoRecorder"
            boolean r1 = r3.f()
            if (r1 != 0) goto L9
            return
        L9:
            android.media.MediaRecorder r1 = r3.c()     // Catch: java.lang.RuntimeException -> L30
            r1.stop()     // Catch: java.lang.RuntimeException -> L30
            com.jmolsmobile.landscapevideocapture.recorder.b r1 = r3.g     // Catch: java.lang.RuntimeException -> L30
            r1.g()     // Catch: java.lang.RuntimeException -> L30
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L30
            r1.<init>()     // Catch: java.lang.RuntimeException -> L30
            java.lang.String r2 = "Successfully stopped recording - outputfile: "
            r1.append(r2)     // Catch: java.lang.RuntimeException -> L30
            com.jmolsmobile.landscapevideocapture.c r2 = r3.d     // Catch: java.lang.RuntimeException -> L30
            java.lang.String r2 = r2.d()     // Catch: java.lang.RuntimeException -> L30
            r1.append(r2)     // Catch: java.lang.RuntimeException -> L30
            java.lang.String r1 = r1.toString()     // Catch: java.lang.RuntimeException -> L30
            com.jmolsmobile.landscapevideocapture.b.a(r0, r1)     // Catch: java.lang.RuntimeException -> L30
            goto L35
        L30:
            java.lang.String r1 = "Failed to stop recording"
            com.jmolsmobile.landscapevideocapture.b.a(r0, r1)
        L35:
            r0 = 0
            r3.f = r0
            com.jmolsmobile.landscapevideocapture.recorder.b r0 = r3.g
            r0.c(r4)
            return
    }

    public void n() throws com.jmolsmobile.landscapevideocapture.recorder.AlreadyUsedException {
            r1 = this;
            com.jmolsmobile.landscapevideocapture.camera.b r0 = r1.a
            if (r0 == 0) goto L13
            boolean r0 = r1.f()
            if (r0 == 0) goto Lf
            r0 = 0
            r1.m(r0)
            return
        Lf:
            r1.l()
            return
        L13:
            com.jmolsmobile.landscapevideocapture.recorder.AlreadyUsedException r0 = new com.jmolsmobile.landscapevideocapture.recorder.AlreadyUsedException
            r0.<init>()
            throw r0
    }

    @Override // android.media.MediaRecorder.OnInfoListener
    public void onInfo(android.media.MediaRecorder r1, int r2, int r3) {
            r0 = this;
            r1 = 800(0x320, float:1.121E-42)
            java.lang.String r3 = "VideoCapture_VideoRecorder"
            if (r2 == r1) goto L16
            r1 = 801(0x321, float:1.122E-42)
            if (r2 == r1) goto Lb
            return
        Lb:
            java.lang.String r1 = "MediaRecorder max filesize reached"
            com.jmolsmobile.landscapevideocapture.b.a(r3, r1)
            java.lang.String r1 = "Capture stopped - Max file size reached"
            r0.m(r1)
            return
        L16:
            java.lang.String r1 = "MediaRecorder max duration reached"
            com.jmolsmobile.landscapevideocapture.b.a(r3, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "录制完成,已达最大"
            r1.append(r2)
            com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration r2 = r0.c
            int r2 = r2.o()
            int r2 = r2 / 1000
            r1.append(r2)
            java.lang.String r2 = "秒限制"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.m(r1)
            return
    }
}
