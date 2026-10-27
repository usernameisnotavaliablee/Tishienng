package com.bxkj.student.common.utils.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class LocalVideoPreviewActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.VideoView Y;
    private android.widget.SeekBar Z;
    private android.widget.TextView a0;
    private android.widget.TextView b0;
    private int c0;

    /* renamed from: k0, reason: collision with root package name */
    private final java.lang.String f767k0;

    /* renamed from: p0, reason: collision with root package name */
    private java.lang.Runnable f768p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.widget.SeekBar.OnSeekBarChangeListener {
        final /* synthetic */ com.bxkj.student.common.utils.video.LocalVideoPreviewActivity a;

        a(com.bxkj.student.common.utils.video.LocalVideoPreviewActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(android.widget.SeekBar r3, int r4, boolean r5) {
                r2 = this;
                if (r5 == 0) goto L1b
                com.bxkj.student.common.utils.video.LocalVideoPreviewActivity r3 = r2.a
                android.widget.VideoView r3 = com.bxkj.student.common.utils.video.LocalVideoPreviewActivity.l0(r3)
                r3.seekTo(r4)
                com.bxkj.student.common.utils.video.LocalVideoPreviewActivity r3 = r2.a
                android.widget.TextView r3 = com.bxkj.student.common.utils.video.LocalVideoPreviewActivity.k0(r3)
                com.bxkj.student.common.utils.video.LocalVideoPreviewActivity r5 = r2.a
                long r0 = (long) r4
                java.lang.String r4 = com.bxkj.student.common.utils.video.LocalVideoPreviewActivity.m0(r5, r0)
                r3.setText(r4)
            L1b:
                return
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(android.widget.SeekBar r1) {
                r0 = this;
                return
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(android.widget.SeekBar r1) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements java.lang.Runnable {
        final /* synthetic */ com.bxkj.student.common.utils.video.LocalVideoPreviewActivity a;

        b(com.bxkj.student.common.utils.video.LocalVideoPreviewActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                com.bxkj.student.common.utils.video.LocalVideoPreviewActivity r0 = r4.a
                android.widget.TextView r0 = com.bxkj.student.common.utils.video.LocalVideoPreviewActivity.k0(r0)
                com.bxkj.student.common.utils.video.LocalVideoPreviewActivity r1 = r4.a
                android.widget.VideoView r2 = com.bxkj.student.common.utils.video.LocalVideoPreviewActivity.l0(r1)
                int r2 = r2.getCurrentPosition()
                long r2 = (long) r2
                java.lang.String r1 = com.bxkj.student.common.utils.video.LocalVideoPreviewActivity.m0(r1, r2)
                r0.setText(r1)
                com.bxkj.student.common.utils.video.LocalVideoPreviewActivity r0 = r4.a
                android.widget.SeekBar r0 = com.bxkj.student.common.utils.video.LocalVideoPreviewActivity.j0(r0)
                if (r0 == 0) goto L33
                com.bxkj.student.common.utils.video.LocalVideoPreviewActivity r0 = r4.a
                android.widget.SeekBar r0 = com.bxkj.student.common.utils.video.LocalVideoPreviewActivity.j0(r0)
                com.bxkj.student.common.utils.video.LocalVideoPreviewActivity r1 = r4.a
                android.widget.VideoView r1 = com.bxkj.student.common.utils.video.LocalVideoPreviewActivity.l0(r1)
                int r1 = r1.getCurrentPosition()
                r0.setProgress(r1)
            L33:
                com.bxkj.student.common.utils.video.LocalVideoPreviewActivity r0 = r4.a
                android.widget.VideoView r0 = com.bxkj.student.common.utils.video.LocalVideoPreviewActivity.l0(r0)
                boolean r0 = r0.isPlaying()
                if (r0 == 0) goto L50
                com.bxkj.student.common.utils.video.LocalVideoPreviewActivity r0 = r4.a
                android.widget.SeekBar r0 = com.bxkj.student.common.utils.video.LocalVideoPreviewActivity.j0(r0)
                com.bxkj.student.common.utils.video.LocalVideoPreviewActivity r1 = r4.a
                java.lang.Runnable r1 = com.bxkj.student.common.utils.video.LocalVideoPreviewActivity.i0(r1)
                r2 = 1000(0x3e8, double:4.94E-321)
                r0.postDelayed(r1, r2)
            L50:
                return
        }
    }

    public LocalVideoPreviewActivity() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "filepath"
            r1.f767k0 = r0
            com.bxkj.student.common.utils.video.LocalVideoPreviewActivity$b r0 = new com.bxkj.student.common.utils.video.LocalVideoPreviewActivity$b
            r0.<init>(r1)
            r1.f768p0 = r0
            return
    }

    public static /* synthetic */ void g0(com.bxkj.student.common.utils.video.LocalVideoPreviewActivity r0, android.media.MediaPlayer r1) {
            r0.p0(r1)
            return
    }

    public static /* synthetic */ void h0(com.bxkj.student.common.utils.video.LocalVideoPreviewActivity r0, android.media.MediaPlayer r1, int r2) {
            r0.o0(r1, r2)
            return
    }

    static /* bridge */ /* synthetic */ java.lang.Runnable i0(com.bxkj.student.common.utils.video.LocalVideoPreviewActivity r0) {
            java.lang.Runnable r0 = r0.f768p0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.SeekBar j0(com.bxkj.student.common.utils.video.LocalVideoPreviewActivity r0) {
            android.widget.SeekBar r0 = r0.Z
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView k0(com.bxkj.student.common.utils.video.LocalVideoPreviewActivity r0) {
            android.widget.TextView r0 = r0.a0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.VideoView l0(com.bxkj.student.common.utils.video.LocalVideoPreviewActivity r0) {
            android.widget.VideoView r0 = r0.Y
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String m0(com.bxkj.student.common.utils.video.LocalVideoPreviewActivity r0, long r1) {
            java.lang.String r0 = r0.n0(r1)
            return r0
    }

    private java.lang.String n0(long r3) {
            r2 = this;
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "mm:ss"
            r0.<init>(r1)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r3 = r0.format(r3)
            return r3
    }

    private /* synthetic */ void o0(android.media.MediaPlayer r3, int r4) {
            r2 = this;
            android.widget.TextView r3 = r2.a0
            android.widget.VideoView r4 = r2.Y
            int r4 = r4.getCurrentPosition()
            long r0 = (long) r4
            java.lang.String r4 = com.bxkj.student.run.app.utils.i.g(r0)
            r3.setText(r4)
            return
    }

    private /* synthetic */ void p0(android.media.MediaPlayer r5) {
            r4 = this;
            r0 = 1
            r5.setLooping(r0)
            android.widget.VideoView r0 = r4.Y
            int r0 = r0.getDuration()
            android.widget.TextView r1 = r4.a0
            r2 = 0
            java.lang.String r2 = r4.n0(r2)
            r1.setText(r2)
            android.widget.TextView r1 = r4.b0
            long r2 = (long) r0
            java.lang.String r2 = r4.n0(r2)
            r1.setText(r2)
            android.widget.SeekBar r1 = r4.Z
            r1.setMax(r0)
            android.widget.SeekBar r0 = r4.Z
            java.lang.Runnable r1 = r4.f768p0
            r2 = 1000(0x3e8, double:4.94E-321)
            r0.postDelayed(r1, r2)
            com.bxkj.student.common.utils.video.a r0 = new com.bxkj.student.common.utils.video.a
            r0.<init>(r4)
            r5.setOnBufferingUpdateListener(r0)
            return
    }

    public void L() {
            r2 = this;
            android.widget.VideoView r0 = r2.Y
            com.bxkj.student.common.utils.video.b r1 = new com.bxkj.student.common.utils.video.b
            r1.<init>(r2)
            r0.setOnPreparedListener(r1)
            android.widget.SeekBar r0 = r2.Z
            com.bxkj.student.common.utils.video.LocalVideoPreviewActivity$a r1 = new com.bxkj.student.common.utils.video.LocalVideoPreviewActivity$a
            r1.<init>(r2)
            r0.setOnSeekBarChangeListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131493058(0x7f0c00c2, float:1.8609585E38)
            return r0
    }

    public void R() {
            r2 = this;
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r1 = "filepath"
            java.lang.String r0 = r0.getStringExtra(r1)
            android.widget.VideoView r1 = r2.Y
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r1.setVideoURI(r0)
            android.widget.VideoView r0 = r2.Y
            r0.start()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "播放视频"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131299253(0x7f090bb5, float:1.8216502E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.VideoView r1 = (android.widget.VideoView) r1
            r0.Y = r1
            r1 = 2131298505(0x7f0908c9, float:1.8214985E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.SeekBar r1 = (android.widget.SeekBar) r1
            r0.Z = r1
            r1 = 2131299112(0x7f090b28, float:1.8216216E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.a0 = r1
            r1 = 2131298893(0x7f090a4d, float:1.8215772E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.b0 = r1
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }

    public boolean onOptionsItemSelected(android.view.MenuItem r3) {
            r2 = this;
            int r0 = r3.getItemId()
            r1 = 16908332(0x102002c, float:2.3877352E-38)
            if (r0 != r1) goto Lc
            r2.finish()
        Lc:
            boolean r3 = super.onOptionsItemSelected(r3)
            return r3
    }

    protected void onPause() {
            r1 = this;
            super.onPause()
            android.widget.VideoView r0 = r1.Y
            int r0 = r0.getCurrentPosition()
            r1.c0 = r0
            android.widget.VideoView r0 = r1.Y
            r0.pause()
            return
    }

    protected void onResume() {
            r2 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onResume()
            android.widget.VideoView r0 = r2.Y
            int r1 = r2.c0
            r0.seekTo(r1)
            android.widget.VideoView r0 = r2.Y
            r0.start()
            return
    }
}
