package com.bxkj.student.study;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class VideoPlayActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.TextView Y;
    private android.widget.TextView Z;
    private cn.bluemobi.dylan.smartwebview.SmartWebView a0;
    private com.devlin_n.videoplayer.player.IjkVideoView b0;
    private java.lang.String c0;

    /* renamed from: k0, reason: collision with root package name */
    private java.lang.String f1303k0;

    /* renamed from: p0, reason: collision with root package name */
    private java.lang.String f1304p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.study.VideoPlayActivity a;

        a(com.bxkj.student.study.VideoPlayActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r4) {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "标题："
                r0.append(r1)
                java.lang.String r1 = "title"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                r0.append(r1)
                com.bxkj.student.study.VideoPlayActivity r1 = r3.a
                android.widget.TextView r1 = com.bxkj.student.study.VideoPlayActivity.i0(r1)
                java.lang.String r0 = r0.toString()
                r1.setText(r0)
                com.bxkj.student.study.VideoPlayActivity r0 = r3.a
                cn.bluemobi.dylan.smartwebview.SmartWebView r0 = com.bxkj.student.study.VideoPlayActivity.g0(r0)
                java.lang.String r1 = "memo"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                r0.h(r1)
                com.bxkj.student.study.VideoPlayActivity r0 = r3.a
                java.lang.String r1 = "videoPath"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                com.bxkj.student.study.VideoPlayActivity.j0(r0, r1)
                com.bxkj.student.study.VideoPlayActivity r0 = r3.a
                android.widget.TextView r0 = com.bxkj.student.study.VideoPlayActivity.h0(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "播放量："
                r1.append(r2)
                java.lang.String r2 = "playNum"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.setText(r4)
                com.bxkj.student.study.VideoPlayActivity r4 = r3.a
                com.bxkj.student.study.VideoPlayActivity.k0(r4)
                return
        }
    }

    static {
            r0 = 17456(0x4430, float:2.4461E-41)
            com.stub.StubApp.interface11(r0)
            return
    }

    public VideoPlayActivity() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "https://media.w3.org/2010/05/sintel/trailer.mp4"
            r1.c0 = r0
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.smartwebview.SmartWebView g0(com.bxkj.student.study.VideoPlayActivity r0) {
            cn.bluemobi.dylan.smartwebview.SmartWebView r0 = r0.a0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView h0(com.bxkj.student.study.VideoPlayActivity r0) {
            android.widget.TextView r0 = r0.Z
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView i0(com.bxkj.student.study.VideoPlayActivity r0) {
            android.widget.TextView r0 = r0.Y
            return r0
    }

    static /* bridge */ /* synthetic */ void j0(com.bxkj.student.study.VideoPlayActivity r0, java.lang.String r1) {
            r0.c0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void k0(com.bxkj.student.study.VideoPlayActivity r0) {
            r0.m0()
            return
    }

    private void l0() {
            r3 = this;
            android.content.Context r0 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<w.f> r1 = w.f.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            w.f r1 = (w.f) r1
            java.lang.String r2 = r3.f1303k0
            rx.e r1 = r1.c(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.study.VideoPlayActivity$a r1 = new com.bxkj.student.study.VideoPlayActivity$a
            r1.<init>(r3)
            r0.setDataListener(r1)
            return
    }

    private void m0() {
            r3 = this;
            com.devlin_n.videoplayer.controller.StandardVideoController r0 = new com.devlin_n.videoplayer.controller.StandardVideoController
            r0.<init>(r3)
            com.devlin_n.videoplayer.player.IjkVideoView r1 = r3.b0
            com.devlin_n.videoplayer.player.IjkVideoView r1 = r1.T()
            com.devlin_n.videoplayer.player.IjkVideoView r1 = r1.R()
            java.lang.String r2 = r3.c0
            java.lang.String r2 = com.bxkj.base.util.c0.a(r2)
            com.devlin_n.videoplayer.player.IjkVideoView r1 = r1.e0(r2)
            com.devlin_n.videoplayer.player.IjkVideoView r0 = r1.f0(r0)
            r0.start()
            return
    }

    public void L() {
            r0 = this;
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131493057(0x7f0c00c1, float:1.8609583E38)
            return r0
    }

    public void R() {
            r2 = this;
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r1 = "videoName"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L19
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r2.f1304p0 = r0
            r2.setTitle(r0)
        L19:
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r1 = "videoId"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L2f
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r2.f1303k0 = r0
        L2f:
            r2.l0()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = r1.f1304p0
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131299185(0x7f090b71, float:1.8216364E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.Y = r1
            r1 = 2131298538(0x7f0908ea, float:1.8215052E38)
            android.view.View r1 = r0.findViewById(r1)
            cn.bluemobi.dylan.smartwebview.SmartWebView r1 = (cn.bluemobi.dylan.smartwebview.SmartWebView) r1
            r0.a0 = r1
            r1 = 2131298315(0x7f09080b, float:1.82146E38)
            android.view.View r1 = r0.findViewById(r1)
            com.devlin_n.videoplayer.player.IjkVideoView r1 = (com.devlin_n.videoplayer.player.IjkVideoView) r1
            r0.b0 = r1
            r1 = 2131299042(0x7f090ae2, float:1.8216074E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.Z = r1
            return
    }

    protected void onActivityResult(int r1, int r2, android.content.Intent r3) {
            r0 = this;
            r2 = 1
            if (r1 != r2) goto L1f
            com.devlin_n.floatWindowPermission.b r1 = com.devlin_n.floatWindowPermission.b.f()
            boolean r1 = r1.c(r0)
            if (r1 == 0) goto L13
            com.devlin_n.videoplayer.player.IjkVideoView r1 = r0.b0
            r1.c()
            return
        L13:
            android.content.Context r1 = r0.V
            java.lang.String r2 = "权限授予失败，无法开启悬浮窗"
            r3 = 0
            android.widget.Toast r1 = android.widget.Toast.makeText(r1, r2, r3)
            r1.show()
        L1f:
            return
    }

    public void onBackPressed() {
            r1 = this;
            com.devlin_n.videoplayer.player.IjkVideoView r0 = r1.b0
            boolean r0 = r0.X()
            if (r0 != 0) goto Lb
            super/*androidx.activity.ComponentActivity*/.onBackPressed()
        Lb:
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }

    protected native void onCreate(android.os.Bundle r1);

    protected void onDestroy() {
            r1 = this;
            super.onDestroy()
            com.devlin_n.videoplayer.player.IjkVideoView r0 = r1.b0
            r0.Z()
            return
    }

    protected void onPause() {
            r1 = this;
            super.onPause()
            com.devlin_n.videoplayer.player.IjkVideoView r0 = r1.b0
            r0.pause()
            return
    }

    protected void onResume() {
            r1 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onResume()
            com.devlin_n.videoplayer.player.IjkVideoView r0 = r1.b0
            r0.d()
            return
    }
}
