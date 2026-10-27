package com.jmolsmobile.landscapevideocapture;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class VideoCaptureActivity extends android.app.Activity implements com.jmolsmobile.landscapevideocapture.view.a, com.jmolsmobile.landscapevideocapture.recorder.b {
    public static final int g = 753245;
    private static final int h = 578465;
    public static final java.lang.String i = "com.jmolsmobile.extraoutputfilename";
    public static final java.lang.String j = "com.jmolsmobile.extracaptureconfiguration";
    public static final java.lang.String k = "com.jmolsmobile.extraerrormessage";
    private static final java.lang.String l = "com.jmolsmobile.extracamerafacing";
    private static final java.lang.String m = "com.jmolsmobile.savedrecordedboolean";
    protected static final java.lang.String n = "com.jmolsmobile.savedoutputfilename";
    private boolean a;
    com.jmolsmobile.landscapevideocapture.c b;
    private com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration c;
    private com.jmolsmobile.landscapevideocapture.view.VideoCaptureView d;
    private com.jmolsmobile.landscapevideocapture.recorder.a e;
    private boolean f;

    static {
            r0 = 35104(0x8920, float:4.9191E-41)
            com.stub.StubApp.interface11(r0)
            return
    }

    public VideoCaptureActivity() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            r0 = 0
            r1.b = r0
            return
    }

    private void i() {
            r1 = this;
            r0 = 0
            r1.setResult(r0)
            r1.finish()
            return
    }

    private void j() {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            com.jmolsmobile.landscapevideocapture.c r1 = r3.b
            java.lang.String r1 = r1.d()
            java.lang.String r2 = "com.jmolsmobile.extraoutputfilename"
            r0.putExtra(r2, r1)
            r1 = -1
            r3.setResult(r1, r0)
            r3.finish()
            return
    }

    private void k(java.lang.String r4) {
            r3 = this;
            android.content.Context r0 = r3.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Can't capture video: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r2 = 1
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)
            r0.show()
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "com.jmolsmobile.extraerrormessage"
            r0.putExtra(r1, r4)
            r4 = 753245(0xb7e5d, float:1.055521E-39)
            r3.setResult(r4, r0)
            r3.finish()
            return
    }

    private boolean m() {
            r3 = this;
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r1 = "com.jmolsmobile.extracamerafacing"
            r2 = 0
            boolean r0 = r0.getBooleanExtra(r1, r2)
            return r0
    }

    private boolean o(android.os.Bundle r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "com.jmolsmobile.savedrecordedboolean"
            boolean r3 = r3.getBoolean(r1, r0)
            return r3
    }

    private void q(android.os.Bundle r2) {
            r1 = this;
            com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration r0 = r1.l()
            r1.c = r0
            boolean r0 = r1.o(r2)
            r1.a = r0
            com.jmolsmobile.landscapevideocapture.c r2 = r1.n(r2)
            r1.b = r2
            boolean r2 = r1.m()
            r1.f = r2
            return
    }

    private void r() {
            r8 = this;
            java.lang.String r0 = "window"
            java.lang.Object r0 = r8.getSystemService(r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            com.jmolsmobile.landscapevideocapture.recorder.a r1 = new com.jmolsmobile.landscapevideocapture.recorder.a
            com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration r3 = r8.c
            com.jmolsmobile.landscapevideocapture.c r4 = r8.b
            com.jmolsmobile.landscapevideocapture.camera.b r5 = new com.jmolsmobile.landscapevideocapture.camera.b
            com.jmolsmobile.landscapevideocapture.camera.c r2 = new com.jmolsmobile.landscapevideocapture.camera.c
            r2.<init>()
            int r0 = r0.getRotation()
            r5.<init>(r2, r0)
            com.jmolsmobile.landscapevideocapture.view.VideoCaptureView r0 = r8.d
            android.view.SurfaceHolder r6 = r0.getPreviewSurfaceHolder()
            boolean r7 = r8.f
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r2.e = r1
            com.jmolsmobile.landscapevideocapture.view.VideoCaptureView r0 = r2.d
            r0.setRecordingButtonInterface(r8)
            com.jmolsmobile.landscapevideocapture.view.VideoCaptureView r0 = r2.d
            com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration r1 = r2.c
            boolean r1 = r1.i()
            r0.setCameraSwitchingEnabled(r1)
            com.jmolsmobile.landscapevideocapture.view.VideoCaptureView r0 = r2.d
            boolean r1 = r2.f
            r0.setCameraFacing(r1)
            boolean r0 = r2.a
            if (r0 == 0) goto L53
            com.jmolsmobile.landscapevideocapture.view.VideoCaptureView r0 = r2.d
            android.graphics.Bitmap r1 = r8.p()
            r0.i(r1)
            goto L58
        L53:
            com.jmolsmobile.landscapevideocapture.view.VideoCaptureView r0 = r2.d
            r0.h()
        L58:
            com.jmolsmobile.landscapevideocapture.view.VideoCaptureView r0 = r2.d
            com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration r1 = r2.c
            boolean r1 = r1.s()
            r0.f(r1)
            return
    }

    private void s() {
            r1 = this;
            com.jmolsmobile.landscapevideocapture.recorder.a r0 = r1.e
            if (r0 == 0) goto L7
            r0.h()
        L7:
            return
    }

    @Override // com.jmolsmobile.landscapevideocapture.view.a
    public void a() {
            r2 = this;
            com.jmolsmobile.landscapevideocapture.recorder.a r0 = r2.e     // Catch: com.jmolsmobile.landscapevideocapture.recorder.AlreadyUsedException -> L6
            r0.n()     // Catch: com.jmolsmobile.landscapevideocapture.recorder.AlreadyUsedException -> L6
            return
        L6:
            java.lang.String r0 = "VideoCapture_Activity"
            java.lang.String r1 = "Cannot toggle recording after cleaning up all resources"
            com.jmolsmobile.landscapevideocapture.b.a(r0, r1)
            return
    }

    @Override // com.jmolsmobile.landscapevideocapture.view.a
    public void b() {
            r0 = this;
            r0.j()
            return
    }

    @Override // com.jmolsmobile.landscapevideocapture.recorder.b
    public void c(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto La
            r0 = 1
            android.widget.Toast r2 = android.widget.Toast.makeText(r1, r2, r0)
            r2.show()
        La:
            com.jmolsmobile.landscapevideocapture.view.VideoCaptureView r2 = r1.d
            android.graphics.Bitmap r0 = r1.p()
            r2.i(r0)
            r1.s()
            return
    }

    @Override // com.jmolsmobile.landscapevideocapture.view.a
    public void d() {
            r0 = this;
            r0.i()
            return
    }

    @Override // com.jmolsmobile.landscapevideocapture.recorder.b
    public void e(java.lang.String r1) {
            r0 = this;
            r0.k(r1)
            return
    }

    @Override // com.jmolsmobile.landscapevideocapture.recorder.b
    public void f() {
            r1 = this;
            com.jmolsmobile.landscapevideocapture.view.VideoCaptureView r0 = r1.d
            r0.j()
            return
    }

    @Override // com.jmolsmobile.landscapevideocapture.recorder.b
    public void g() {
            r1 = this;
            r0 = 1
            r1.a = r0
            return
    }

    @Override // com.jmolsmobile.landscapevideocapture.view.a
    public void h(boolean r3) {
            r2 = this;
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.jmolsmobile.landscapevideocapture.VideoCaptureActivity> r1 = com.jmolsmobile.landscapevideocapture.VideoCaptureActivity.class
            r0.<init>(r2, r1)
            android.content.Intent r1 = r2.getIntent()
            android.os.Bundle r1 = r1.getExtras()
            r0.putExtras(r1)
            java.lang.String r1 = "com.jmolsmobile.extracamerafacing"
            r0.putExtra(r1, r3)
            r3 = 578465(0x8d3a1, float:8.10602E-40)
            r2.startActivityForResult(r0, r3)
            int r3 = com.jmolsmobile.landscapevideocapture.R.anim.from_middle
            int r0 = com.jmolsmobile.landscapevideocapture.R.anim.to_middle
            r2.overridePendingTransition(r3, r0)
            return
    }

    protected com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration l() {
            r3 = this;
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r1 = "com.jmolsmobile.extracaptureconfiguration"
            android.os.Parcelable r0 = r0.getParcelableExtra(r1)
            com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration r0 = (com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration) r0
            if (r0 != 0) goto L19
            com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration r0 = com.jmolsmobile.landscapevideocapture.configuration.CaptureConfiguration.n()
            java.lang.String r1 = "VideoCapture_Activity"
            java.lang.String r2 = "No captureconfiguration passed - using default configuration"
            com.jmolsmobile.landscapevideocapture.b.a(r1, r2)
        L19:
            return r0
    }

    protected com.jmolsmobile.landscapevideocapture.c n(android.os.Bundle r3) {
            r2 = this;
            if (r3 == 0) goto Le
            com.jmolsmobile.landscapevideocapture.c r0 = new com.jmolsmobile.landscapevideocapture.c
            java.lang.String r1 = "com.jmolsmobile.savedoutputfilename"
            java.lang.String r3 = r3.getString(r1)
            r0.<init>(r3)
            return r0
        Le:
            com.jmolsmobile.landscapevideocapture.c r3 = new com.jmolsmobile.landscapevideocapture.c
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r1 = "com.jmolsmobile.extraoutputfilename"
            java.lang.String r0 = r0.getStringExtra(r1)
            r3.<init>(r0)
            return r3
    }

    @Override // android.app.Activity
    protected void onActivityResult(int r1, int r2, android.content.Intent r3) {
            r0 = this;
            r0.setResult(r2, r3)
            r0.finish()
            return
    }

    @Override // android.app.Activity
    public void onBackPressed() {
            r0 = this;
            r0.i()
            return
    }

    @Override // android.app.Activity
    public native void onCreate(android.os.Bundle r1);

    @Override // android.app.Activity
    protected void onPause() {
            r2 = this;
            com.jmolsmobile.landscapevideocapture.recorder.a r0 = r2.e
            if (r0 == 0) goto L8
            r1 = 0
            r0.m(r1)
        L8:
            r2.s()
            super.onPause()
            return
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(android.os.Bundle r3) {
            r2 = this;
            java.lang.String r0 = "com.jmolsmobile.savedrecordedboolean"
            boolean r1 = r2.a
            r3.putBoolean(r0, r1)
            com.jmolsmobile.landscapevideocapture.c r0 = r2.b
            java.lang.String r0 = r0.d()
            java.lang.String r1 = "com.jmolsmobile.savedoutputfilename"
            r3.putString(r1, r0)
            super.onSaveInstanceState(r3)
            return
    }

    public android.graphics.Bitmap p() {
            r3 = this;
            com.jmolsmobile.landscapevideocapture.c r0 = r3.b
            java.lang.String r0 = r0.d()
            r1 = 2
            android.graphics.Bitmap r0 = android.media.ThumbnailUtils.createVideoThumbnail(r0, r1)
            if (r0 != 0) goto L14
            java.lang.String r1 = "VideoCapture_Activity"
            java.lang.String r2 = "Failed to generate video preview"
            com.jmolsmobile.landscapevideocapture.b.a(r1, r2)
        L14:
            return r0
    }
}
