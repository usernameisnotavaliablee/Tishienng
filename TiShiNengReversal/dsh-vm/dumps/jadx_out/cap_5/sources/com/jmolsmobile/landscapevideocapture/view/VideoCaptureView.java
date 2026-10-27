package com.jmolsmobile.landscapevideocapture.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class VideoCaptureView extends android.widget.FrameLayout implements android.view.View.OnClickListener {
    private android.widget.ImageView a;
    private android.widget.ImageView b;
    private android.widget.ImageView c;
    private android.widget.ImageView d;
    private android.view.SurfaceView e;
    private android.widget.ImageView f;
    private android.widget.TextView g;
    private android.os.Handler h;
    private long i;
    private com.jmolsmobile.landscapevideocapture.view.a j;
    private boolean k;
    private boolean l;
    private boolean m;
    private java.lang.Runnable n;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements java.lang.Runnable {
        final /* synthetic */ com.jmolsmobile.landscapevideocapture.view.VideoCaptureView a;

        a(com.jmolsmobile.landscapevideocapture.view.VideoCaptureView r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r5 = this;
                long r0 = android.os.SystemClock.uptimeMillis()
                com.jmolsmobile.landscapevideocapture.view.VideoCaptureView r2 = r5.a
                long r2 = com.jmolsmobile.landscapevideocapture.view.VideoCaptureView.a(r2)
                long r0 = r0 - r2
                r2 = 1000(0x3e8, double:4.94E-321)
                long r0 = r0 / r2
                int r1 = (int) r0
                int r0 = r1 / 60
                int r1 = r1 % 60
                com.jmolsmobile.landscapevideocapture.view.VideoCaptureView r4 = r5.a
                com.jmolsmobile.landscapevideocapture.view.VideoCaptureView.b(r4, r1, r0)
                com.jmolsmobile.landscapevideocapture.view.VideoCaptureView r0 = r5.a
                android.os.Handler r0 = com.jmolsmobile.landscapevideocapture.view.VideoCaptureView.c(r0)
                r0.postDelayed(r5, r2)
                return
        }
    }

    public VideoCaptureView(android.content.Context r3) {
            r2 = this;
            r2.<init>(r3)
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r2.h = r0
            r0 = 0
            r2.i = r0
            com.jmolsmobile.landscapevideocapture.view.VideoCaptureView$a r0 = new com.jmolsmobile.landscapevideocapture.view.VideoCaptureView$a
            r0.<init>(r2)
            r2.n = r0
            r2.e(r3)
            return
    }

    public VideoCaptureView(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r2.<init>(r3, r4)
            android.os.Handler r4 = new android.os.Handler
            r4.<init>()
            r2.h = r4
            r0 = 0
            r2.i = r0
            com.jmolsmobile.landscapevideocapture.view.VideoCaptureView$a r4 = new com.jmolsmobile.landscapevideocapture.view.VideoCaptureView$a
            r4.<init>(r2)
            r2.n = r4
            r2.e(r3)
            return
    }

    public VideoCaptureView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            android.os.Handler r2 = new android.os.Handler
            r2.<init>()
            r0.h = r2
            r2 = 0
            r0.i = r2
            com.jmolsmobile.landscapevideocapture.view.VideoCaptureView$a r2 = new com.jmolsmobile.landscapevideocapture.view.VideoCaptureView$a
            r2.<init>(r0)
            r0.n = r2
            r0.e(r1)
            return
    }

    static /* synthetic */ long a(com.jmolsmobile.landscapevideocapture.view.VideoCaptureView r2) {
            long r0 = r2.i
            return r0
    }

    static /* synthetic */ void b(com.jmolsmobile.landscapevideocapture.view.VideoCaptureView r0, int r1, int r2) {
            r0.g(r1, r2)
            return
    }

    static /* synthetic */ android.os.Handler c(com.jmolsmobile.landscapevideocapture.view.VideoCaptureView r0) {
            android.os.Handler r0 = r0.h
            return r0
    }

    private boolean d() {
            r1 = this;
            boolean r0 = com.jmolsmobile.landscapevideocapture.preview.a.b()
            if (r0 == 0) goto Lc
            boolean r0 = r1.m
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    private void e(android.content.Context r2) {
            r1 = this;
            int r0 = com.jmolsmobile.landscapevideocapture.R.layout.view_videocapture
            android.view.View r2 = android.view.View.inflate(r2, r0, r1)
            int r0 = com.jmolsmobile.landscapevideocapture.R.id.videocapture_recordbtn_iv
            android.view.View r0 = r2.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1.c = r0
            int r0 = com.jmolsmobile.landscapevideocapture.R.id.videocapture_acceptbtn_iv
            android.view.View r0 = r2.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1.b = r0
            int r0 = com.jmolsmobile.landscapevideocapture.R.id.videocapture_declinebtn_iv
            android.view.View r0 = r2.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1.a = r0
            int r0 = com.jmolsmobile.landscapevideocapture.R.id.change_camera_iv
            android.view.View r0 = r2.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1.d = r0
            android.widget.ImageView r0 = r1.c
            r0.setOnClickListener(r1)
            android.widget.ImageView r0 = r1.b
            r0.setOnClickListener(r1)
            android.widget.ImageView r0 = r1.a
            r0.setOnClickListener(r1)
            android.widget.ImageView r0 = r1.d
            r0.setOnClickListener(r1)
            int r0 = com.jmolsmobile.landscapevideocapture.R.id.videocapture_preview_iv
            android.view.View r0 = r2.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1.f = r0
            int r0 = com.jmolsmobile.landscapevideocapture.R.id.videocapture_preview_sv
            android.view.View r0 = r2.findViewById(r0)
            android.view.SurfaceView r0 = (android.view.SurfaceView) r0
            r1.e = r0
            int r0 = com.jmolsmobile.landscapevideocapture.R.id.videocapture_timer_tv
            android.view.View r2 = r2.findViewById(r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.g = r2
            return
    }

    private void g(int r6, int r7) {
            r5 = this;
            android.widget.TextView r0 = r5.g
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r7
            java.lang.String r7 = "%02d"
            java.lang.String r3 = java.lang.String.format(r7, r3)
            r1.append(r3)
            java.lang.String r3 = ":"
            r1.append(r3)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r4] = r6
            java.lang.String r6 = java.lang.String.format(r7, r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.setText(r6)
            return
    }

    public void f(boolean r1) {
            r0 = this;
            r0.k = r1
            return
    }

    public android.view.SurfaceHolder getPreviewSurfaceHolder() {
            r1 = this;
            android.view.SurfaceView r0 = r1.e
            android.view.SurfaceHolder r0 = r0.getHolder()
            return r0
    }

    public void h() {
            r3 = this;
            android.widget.ImageView r0 = r3.c
            r1 = 0
            r0.setSelected(r1)
            android.widget.ImageView r0 = r3.d
            boolean r2 = r3.d()
            if (r2 == 0) goto L10
            r2 = 0
            goto L11
        L10:
            r2 = 4
        L11:
            r0.setVisibility(r2)
            android.widget.ImageView r0 = r3.c
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r3.b
            r2 = 8
            r0.setVisibility(r2)
            android.widget.ImageView r0 = r3.a
            r0.setVisibility(r2)
            android.widget.ImageView r0 = r3.f
            r0.setVisibility(r2)
            android.view.SurfaceView r0 = r3.e
            r0.setVisibility(r1)
            return
    }

    public void i(android.graphics.Bitmap r4) {
            r3 = this;
            android.widget.ImageView r0 = r3.c
            r1 = 4
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r3.b
            r2 = 0
            r0.setVisibility(r2)
            android.widget.ImageView r0 = r3.d
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r3.a
            r0.setVisibility(r2)
            android.widget.ImageView r0 = r3.f
            r0.setVisibility(r2)
            android.view.SurfaceView r0 = r3.e
            r1 = 8
            r0.setVisibility(r1)
            if (r4 == 0) goto L30
            android.widget.ImageView r0 = r3.f
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP
            r0.setScaleType(r1)
            android.widget.ImageView r0 = r3.f
            r0.setImageBitmap(r4)
        L30:
            android.os.Handler r4 = r3.h
            java.lang.Runnable r0 = r3.n
            r4.removeCallbacks(r0)
            return
    }

    public void j() {
            r4 = this;
            android.widget.ImageView r0 = r4.c
            r1 = 1
            r0.setSelected(r1)
            android.widget.ImageView r0 = r4.c
            r1 = 0
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r4.d
            r2 = 4
            r0.setVisibility(r2)
            android.widget.ImageView r0 = r4.b
            r2 = 8
            r0.setVisibility(r2)
            android.widget.ImageView r0 = r4.a
            r0.setVisibility(r2)
            android.widget.ImageView r0 = r4.f
            r0.setVisibility(r2)
            android.view.SurfaceView r0 = r4.e
            r0.setVisibility(r1)
            boolean r0 = r4.k
            if (r0 == 0) goto L43
            android.widget.TextView r0 = r4.g
            r0.setVisibility(r1)
            long r2 = android.os.SystemClock.uptimeMillis()
            r4.i = r2
            r4.g(r1, r1)
            android.os.Handler r0 = r4.h
            java.lang.Runnable r1 = r4.n
            r2 = 1000(0x3e8, double:4.94E-321)
            r0.postDelayed(r1, r2)
        L43:
            return
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r3) {
            r2 = this;
            com.jmolsmobile.landscapevideocapture.view.a r0 = r2.j
            if (r0 != 0) goto L5
            goto L60
        L5:
            int r0 = r3.getId()
            android.widget.ImageView r1 = r2.c
            int r1 = r1.getId()
            if (r0 != r1) goto L17
            com.jmolsmobile.landscapevideocapture.view.a r3 = r2.j
            r3.a()
            return
        L17:
            int r0 = r3.getId()
            android.widget.ImageView r1 = r2.b
            int r1 = r1.getId()
            if (r0 != r1) goto L29
            com.jmolsmobile.landscapevideocapture.view.a r3 = r2.j
            r3.b()
            return
        L29:
            int r0 = r3.getId()
            android.widget.ImageView r1 = r2.a
            int r1 = r1.getId()
            if (r0 != r1) goto L3b
            com.jmolsmobile.landscapevideocapture.view.a r3 = r2.j
            r3.d()
            return
        L3b:
            int r3 = r3.getId()
            android.widget.ImageView r0 = r2.d
            int r0 = r0.getId()
            if (r3 != r0) goto L60
            boolean r3 = r2.l
            r0 = r3 ^ 1
            r2.l = r0
            android.widget.ImageView r0 = r2.d
            if (r3 != 0) goto L54
            int r3 = com.jmolsmobile.landscapevideocapture.R.drawable.ic_change_camera_front
            goto L56
        L54:
            int r3 = com.jmolsmobile.landscapevideocapture.R.drawable.ic_change_camera_back
        L56:
            r0.setImageResource(r3)
            com.jmolsmobile.landscapevideocapture.view.a r3 = r2.j
            boolean r0 = r2.l
            r3.h(r0)
        L60:
            return
    }

    public void setCameraFacing(boolean r2) {
            r1 = this;
            boolean r0 = r1.m
            if (r0 != 0) goto L5
            return
        L5:
            r1.l = r2
            android.widget.ImageView r0 = r1.d
            if (r2 == 0) goto Le
            int r2 = com.jmolsmobile.landscapevideocapture.R.drawable.ic_change_camera_back
            goto L10
        Le:
            int r2 = com.jmolsmobile.landscapevideocapture.R.drawable.ic_change_camera_front
        L10:
            r0.setImageResource(r2)
            return
    }

    public void setCameraSwitchingEnabled(boolean r2) {
            r1 = this;
            r1.m = r2
            android.widget.ImageView r0 = r1.d
            if (r2 == 0) goto L8
            r2 = 0
            goto L9
        L8:
            r2 = 4
        L9:
            r0.setVisibility(r2)
            return
    }

    public void setRecordingButtonInterface(com.jmolsmobile.landscapevideocapture.view.a r1) {
            r0 = this;
            r0.j = r1
            return
    }
}
