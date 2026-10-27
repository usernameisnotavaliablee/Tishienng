package com.bxkj.student.home.teaching.learning.detail.backup;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class VideoPlayActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private java.lang.String F0;
    private java.lang.String G0;
    private java.lang.String H0;
    private java.util.Timer I0;
    private java.util.TimerTask J0;
    private java.lang.String K0;
    private android.os.CountDownTimer L0;
    private int M0;
    private android.widget.ProgressBar Y;
    private com.bxkj.base.view.TimeView Z;
    private android.widget.TextView a0;
    private android.widget.TextView b0;
    private android.widget.TextView c0;

    /* renamed from: k0, reason: collision with root package name */
    private cn.bluemobi.dylan.smartwebview.SmartWebView f902k0;

    /* renamed from: p0, reason: collision with root package name */
    private com.devlin_n.videoplayer.player.IjkVideoView f903p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity a;

        a(com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r18) {
                r17 = this;
                r0 = r17
                r1 = r18
                com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity r2 = r0.a
                android.widget.FrameLayout r2 = r2.P()
                r3 = 0
                r2.setVisibility(r3)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "标题："
                r2.append(r3)
                java.lang.String r3 = "title"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r3)
                r2.append(r3)
                com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity r4 = r0.a
                android.widget.TextView r4 = com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity.l0(r4)
                java.lang.String r2 = r2.toString()
                r4.setText(r2)
                java.lang.String r2 = "synopsis"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
                com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity r4 = r0.a
                android.widget.TextView r4 = com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity.m0(r4)
                r4.setText(r2)
                com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity r4 = r0.a
                java.lang.String r5 = "content"
                java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r5)
                com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity.p0(r4, r5)
                com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity r4 = r0.a
                android.widget.TextView r4 = com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity.k0(r4)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "播放量："
                r5.append(r6)
                java.lang.String r6 = "pv"
                java.lang.String r6 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r6)
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                r4.setText(r5)
                com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity r4 = r0.a
                java.lang.String r5 = "detailId"
                java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r5)
                com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity.o0(r4, r5)
                com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity r4 = r0.a
                com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity.r0(r4)
                java.lang.String r4 = "duration"
                int r9 = cn.bluemobi.dylan.http.JsonParse.getInt(r1, r4)
                java.lang.String r4 = "indexImg"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r4)
                boolean r5 = android.text.TextUtils.isEmpty(r4)
                if (r5 == 0) goto L8c
                java.lang.String r4 = "http://m.boxkj.com/resources/wechat/images/xiaowei.png"
            L8c:
                com.umeng.socialize.media.UMVideo r5 = new com.umeng.socialize.media.UMVideo
                com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity r6 = r0.a
                java.lang.String r6 = com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity.n0(r6)
                r5.<init>(r6)
                r5.setTitle(r3)
                com.umeng.socialize.media.UMImage r3 = new com.umeng.socialize.media.UMImage
                com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity r6 = r0.a
                android.content.Context r6 = com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity.s0(r6)
                r3.<init>(r6, r4)
                r5.setThumb(r3)
                r5.setDescription(r2)
                r16 = r5
                com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity r5 = r0.a
                java.lang.String r6 = com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity.h0(r5)
                java.lang.String r2 = "isLike"
                int r7 = cn.bluemobi.dylan.http.JsonParse.getInt(r1, r2)
                java.lang.String r2 = "isCollection"
                int r8 = cn.bluemobi.dylan.http.JsonParse.getInt(r1, r2)
                java.lang.String r2 = "popTime"
                int r10 = cn.bluemobi.dylan.http.JsonParse.getInt(r1, r2)
                java.lang.String r2 = "hasQuestion"
                int r11 = cn.bluemobi.dylan.http.JsonParse.getInt(r1, r2)
                java.lang.String r2 = "isComplete"
                int r12 = cn.bluemobi.dylan.http.JsonParse.getInt(r1, r2)
                java.lang.String r2 = "isOk"
                int r13 = cn.bluemobi.dylan.http.JsonParse.getInt(r1, r2)
                java.lang.String r2 = "opreateFlag"
                int r14 = cn.bluemobi.dylan.http.JsonParse.getInt(r1, r2)
                java.lang.String r2 = "valType"
                int r15 = cn.bluemobi.dylan.http.JsonParse.getInt(r1, r2)
                com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity.q0(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends android.os.CountDownTimer {
        final /* synthetic */ com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity a;

        b(com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity r1, long r2, long r4) {
                r0 = this;
                r0.a = r1
                r0.<init>(r2, r4)
                return
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
                r3 = this;
                com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity r0 = r3.a
                com.bxkj.base.view.TimeView r0 = com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity.g0(r0)
                com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity r1 = r3.a
                int r1 = com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity.i0(r1)
                int r1 = r1 / 1000
                com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity r2 = r3.a
                int r2 = com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity.i0(r2)
                int r2 = r2 / 1000
                r0.i(r1, r2)
                return
        }

        @Override // android.os.CountDownTimer
        public void onTick(long r3) {
                r2 = this;
                com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity r0 = r2.a
                int r0 = com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity.i0(r0)
                long r0 = (long) r0
                long r0 = r0 - r3
                int r3 = (int) r0
                int r3 = r3 / 1000
                com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity r4 = r2.a
                com.bxkj.base.view.TimeView r4 = com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity.g0(r4)
                com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity r0 = r2.a
                int r0 = com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity.i0(r0)
                int r0 = r0 / 1000
                r4.i(r0, r3)
                com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity r4 = r2.a
                android.widget.ProgressBar r4 = com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity.j0(r4)
                r4.setProgress(r3)
                return
        }
    }

    public VideoPlayActivity() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "http://xttp.xidian.edu.cn:1221/Upload/69045f62-a3eb-4c05-a1c0-7e1d92c05565.flv"
            r1.F0 = r0
            r0 = 120000(0x1d4c0, float:1.68156E-40)
            r1.M0 = r0
            return
    }

    static /* bridge */ /* synthetic */ com.bxkj.base.view.TimeView g0(com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity r0) {
            com.bxkj.base.view.TimeView r0 = r0.Z
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String h0(com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity r0) {
            java.lang.String r0 = r0.K0
            return r0
    }

    static /* bridge */ /* synthetic */ int i0(com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity r0) {
            int r0 = r0.M0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.ProgressBar j0(com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity r0) {
            android.widget.ProgressBar r0 = r0.Y
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView k0(com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity r0) {
            android.widget.TextView r0 = r0.b0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView l0(com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity r0) {
            android.widget.TextView r0 = r0.a0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView m0(com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity r0) {
            android.widget.TextView r0 = r0.c0
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String n0(com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity r0) {
            java.lang.String r0 = r0.F0
            return r0
    }

    static /* bridge */ /* synthetic */ void o0(com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity r0, java.lang.String r1) {
            r0.K0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void p0(com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity r0, java.lang.String r1) {
            r0.F0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void q0(com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity r0, java.lang.String r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, com.umeng.socialize.media.BaseMediaObject r11) {
            r0.t0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    static /* bridge */ /* synthetic */ void r0(com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity r0) {
            r0.v0()
            return
    }

    static /* synthetic */ android.content.Context s0(com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void t0(java.lang.String r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15, com.umeng.socialize.media.BaseMediaObject r16) {
            r5 = this;
            androidx.fragment.app.FragmentManager r0 = r5.getSupportFragmentManager()
            androidx.fragment.app.FragmentTransaction r0 = r0.beginTransaction()
            com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment r1 = new com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment
            r1.<init>()
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = "id"
            java.lang.String r4 = r5.G0
            r2.putString(r3, r4)
            java.lang.String r3 = "detailId"
            r2.putString(r3, r6)
            java.lang.String r6 = "isLike"
            r2.putInt(r6, r7)
            java.lang.String r6 = "isCollection"
            r2.putInt(r6, r8)
            java.lang.String r6 = "duration"
            r2.putInt(r6, r9)
            java.lang.String r6 = "popTime"
            r2.putInt(r6, r10)
            java.lang.String r6 = "hasQuestion"
            r2.putInt(r6, r11)
            java.lang.String r6 = "isComplete"
            r2.putInt(r6, r12)
            java.lang.String r6 = "isOk"
            r2.putInt(r6, r13)
            java.lang.String r6 = "opreateFlag"
            r2.putInt(r6, r14)
            java.lang.String r6 = "valType"
            r2.putInt(r6, r15)
            r1.setArguments(r2)
            r6 = r16
            r1.s0(r6)
            r6 = 2131296988(0x7f0902dc, float:1.8211908E38)
            r0.add(r6, r1)
            r0.commit()
            return
    }

    private void v0() {
            r3 = this;
            com.devlin_n.videoplayer.controller.StandardVideoController r0 = new com.devlin_n.videoplayer.controller.StandardVideoController
            r0.<init>(r3)
            r1 = 0
            r0.setCanFast(r1)
            com.devlin_n.videoplayer.player.IjkVideoView r1 = r3.f903p0
            com.devlin_n.videoplayer.player.IjkVideoView r1 = r1.R()
            com.devlin_n.videoplayer.player.IjkVideoView r1 = r1.T()
            java.lang.String r2 = r3.F0
            java.lang.String r2 = com.bxkj.base.util.c0.a(r2)
            com.devlin_n.videoplayer.player.IjkVideoView r1 = r1.e0(r2)
            com.devlin_n.videoplayer.player.IjkVideoView r0 = r1.f0(r0)
            r0.start()
            return
    }

    private void w0() {
            r8 = this;
            android.widget.ProgressBar r0 = r8.Y
            r1 = 0
            r0.setVisibility(r1)
            com.bxkj.base.view.TimeView r0 = r8.Z
            r0.setVisibility(r1)
            android.widget.ProgressBar r0 = r8.Y
            int r1 = r8.M0
            int r1 = r1 / 1000
            r0.setMax(r1)
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "HH:mm:ss"
            r0.<init>(r1)
            java.lang.String r1 = "GMT+00:00"
            java.util.TimeZone r1 = java.util.TimeZone.getTimeZone(r1)
            r0.setTimeZone(r1)
            com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity$b r2 = new com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity$b
            int r0 = r8.M0
            long r4 = (long) r0
            r6 = 1000(0x3e8, double:4.94E-321)
            r3 = r8
            r2.<init>(r3, r4, r6)
            r3.L0 = r2
            r2.start()
            return
    }

    public void L() {
            r0 = this;
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492965(0x7f0c0065, float:1.8609397E38)
            return r0
    }

    public void R() {
            r2 = this;
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r1 = "title"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L19
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r2.H0 = r0
            r2.setTitle(r0)
        L19:
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r1 = "id"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L2f
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r2.G0 = r0
        L2f:
            r2.u0()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = r1.H0
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r2) {
            r1 = this;
            r2 = 2131298301(0x7f0907fd, float:1.8214571E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.ProgressBar r2 = (android.widget.ProgressBar) r2
            r1.Y = r2
            r2 = 2131296725(0x7f0901d5, float:1.8211375E38)
            android.view.View r2 = r1.findViewById(r2)
            com.bxkj.base.view.TimeView r2 = (com.bxkj.base.view.TimeView) r2
            r1.Z = r2
            r2 = 2131299185(0x7f090b71, float:1.8216364E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.a0 = r2
            r2 = 2131298538(0x7f0908ea, float:1.8215052E38)
            android.view.View r2 = r1.findViewById(r2)
            cn.bluemobi.dylan.smartwebview.SmartWebView r2 = (cn.bluemobi.dylan.smartwebview.SmartWebView) r2
            r1.f902k0 = r2
            r2 = 2131298315(0x7f09080b, float:1.82146E38)
            android.view.View r2 = r1.findViewById(r2)
            com.devlin_n.videoplayer.player.IjkVideoView r2 = (com.devlin_n.videoplayer.player.IjkVideoView) r2
            r1.f903p0 = r2
            r2 = 2131299042(0x7f090ae2, float:1.8216074E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.b0 = r2
            r2 = 2131299184(0x7f090b70, float:1.8216362E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.c0 = r2
            android.widget.FrameLayout r2 = r1.P()
            r0 = 8
            r2.setVisibility(r0)
            return
    }

    protected void onActivityResult(int r1, int r2, android.content.Intent r3) {
            r0 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onActivityResult(r1, r2, r3)
            r2 = 1
            if (r1 != r2) goto L22
            com.devlin_n.floatWindowPermission.b r1 = com.devlin_n.floatWindowPermission.b.f()
            boolean r1 = r1.c(r0)
            if (r1 == 0) goto L16
            com.devlin_n.videoplayer.player.IjkVideoView r1 = r0.f903p0
            r1.c()
            return
        L16:
            android.content.Context r1 = r0.V
            java.lang.String r2 = "权限授予失败，无法开启悬浮窗"
            r3 = 0
            android.widget.Toast r1 = android.widget.Toast.makeText(r1, r2, r3)
            r1.show()
        L22:
            return
    }

    public void onBackPressed() {
            r1 = this;
            com.devlin_n.videoplayer.player.IjkVideoView r0 = r1.f903p0
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

    protected void onDestroy() {
            r1 = this;
            super.onDestroy()
            com.devlin_n.videoplayer.player.IjkVideoView r0 = r1.f903p0
            r0.Z()
            java.util.TimerTask r0 = r1.J0
            if (r0 == 0) goto Lf
            r0.cancel()
        Lf:
            java.util.Timer r0 = r1.I0
            if (r0 == 0) goto L16
            r0.cancel()
        L16:
            android.os.CountDownTimer r0 = r1.L0
            if (r0 == 0) goto L1d
            r0.cancel()
        L1d:
            return
    }

    protected void onPause() {
            r1 = this;
            super.onPause()
            com.devlin_n.videoplayer.player.IjkVideoView r0 = r1.f903p0
            r0.pause()
            return
    }

    protected void onRestart() {
            r0 = this;
            super/*android.app.Activity*/.onRestart()
            return
    }

    protected void onResume() {
            r1 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onResume()
            com.devlin_n.videoplayer.player.IjkVideoView r0 = r1.f903p0
            r0.d()
            return
    }

    public void u0() {
            r4 = this;
            android.content.Context r0 = r4.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<com.bxkj.student.home.teaching.learning.m> r1 = com.bxkj.student.home.teaching.learning.m.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.student.home.teaching.learning.m r1 = (com.bxkj.student.home.teaching.learning.m) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getUserId()
            java.lang.String r3 = r4.G0
            rx.e r1 = r1.k(r2, r3)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity$a r1 = new com.bxkj.student.home.teaching.learning.detail.backup.VideoPlayActivity$a
            r1.<init>(r4)
            r0.setDataListener(r1)
            return
    }
}
