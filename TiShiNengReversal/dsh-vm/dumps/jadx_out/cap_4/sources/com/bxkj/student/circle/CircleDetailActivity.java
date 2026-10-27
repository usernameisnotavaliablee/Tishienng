package com.bxkj.student.circle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class CircleDetailActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private java.lang.String F0;
    private android.os.CountDownTimer G0;
    private java.lang.String Y;
    private android.widget.TextView Z;
    private android.widget.TextView a0;
    private android.widget.Button b0;
    private android.widget.ImageView c0;

    /* renamed from: k0, reason: collision with root package name */
    private android.widget.Button f734k0;

    /* renamed from: p0, reason: collision with root package name */
    private com.devlin_n.videoplayer.player.IjkVideoView f735p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.circle.CircleDetailActivity a;

        a(com.bxkj.student.circle.CircleDetailActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public static /* synthetic */ void a(com.bxkj.student.circle.CircleDetailActivity.a r0, java.util.Map r1, android.view.View r2) {
                r0.b(r1, r2)
                return
        }

        private /* synthetic */ void b(java.util.Map r3, android.view.View r4) {
                r2 = this;
                com.bxkj.student.circle.CircleDetailActivity r4 = r2.a
                java.lang.String r0 = "sysStudentName"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r0)
                java.lang.String r1 = "learnQuestionImage"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r1)
                com.bxkj.student.circle.CircleDetailActivity.p0(r4, r0, r3)
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r6) {
                r5 = this;
                com.bxkj.student.circle.CircleDetailActivity r0 = r5.a
                android.widget.FrameLayout r0 = r0.P()
                r1 = 0
                r0.setVisibility(r1)
                com.bxkj.student.circle.CircleDetailActivity r0 = r5.a
                android.widget.TextView r0 = com.bxkj.student.circle.CircleDetailActivity.j0(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "票数："
                r1.append(r2)
                java.lang.String r2 = "votesTotalNumber"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.setText(r1)
                com.bxkj.student.circle.CircleDetailActivity r0 = r5.a
                android.widget.TextView r0 = com.bxkj.student.circle.CircleDetailActivity.k0(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "排名："
                r1.append(r2)
                java.lang.String r2 = "rank"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.setText(r1)
                java.lang.String r0 = "works"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r0)
                com.bxkj.student.circle.CircleDetailActivity r1 = r5.a
                com.bxkj.student.circle.CircleDetailActivity.m0(r1, r0)
                com.bxkj.student.circle.CircleDetailActivity r0 = r5.a
                java.lang.String r1 = "isVote"
                int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r6, r1)
                java.lang.String r2 = "voteFlag"
                boolean r2 = cn.bluemobi.dylan.http.JsonParse.getBoolean(r6, r2)
                java.lang.String r3 = "countDown"
                long r3 = cn.bluemobi.dylan.http.JsonParse.getLong(r6, r3)
                com.bxkj.student.circle.CircleDetailActivity.n0(r0, r1, r2, r3)
                com.bxkj.student.circle.CircleDetailActivity r0 = r5.a
                android.widget.Button r0 = com.bxkj.student.circle.CircleDetailActivity.i0(r0)
                com.bxkj.student.circle.c r1 = new com.bxkj.student.circle.c
                r1.<init>(r5, r6)
                r0.setOnClickListener(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.circle.CircleDetailActivity a;

        b(com.bxkj.student.circle.CircleDetailActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r2) {
                r1 = this;
                com.bxkj.student.circle.CircleDetailActivity r2 = r1.a
                com.bxkj.student.circle.CircleDetailActivity.l0(r2)
                cn.bluemobi.dylan.base.utils.a r2 = cn.bluemobi.dylan.base.utils.a.n()
                java.lang.Class<com.bxkj.student.main.CircleFragment> r0 = com.bxkj.student.main.CircleFragment.class
                androidx.fragment.app.Fragment r2 = r2.o(r0)
                com.bxkj.student.main.CircleFragment r2 = (com.bxkj.student.main.CircleFragment) r2
                if (r2 == 0) goto L16
                r2.i0()
            L16:
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r2, java.lang.String r3) {
                r1 = this;
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.circle.CircleDetailActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.student.circle.CircleDetailActivity.q0(r0)
                r2.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                r2.show()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends android.os.CountDownTimer {
        final /* synthetic */ com.bxkj.student.circle.CircleDetailActivity a;

        c(com.bxkj.student.circle.CircleDetailActivity r1, long r2, long r4) {
                r0 = this;
                r0.a = r1
                r0.<init>(r2, r4)
                return
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
                r5 = this;
                com.bxkj.student.circle.CircleDetailActivity r0 = r5.a
                r1 = 0
                r2 = 0
                r4 = 1
                com.bxkj.student.circle.CircleDetailActivity.n0(r0, r4, r1, r2)
                return
        }

        @Override // android.os.CountDownTimer
        public void onTick(long r2) {
                r1 = this;
                com.bxkj.student.circle.CircleDetailActivity r0 = r1.a
                com.bxkj.student.circle.CircleDetailActivity.o0(r0, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d implements com.umeng.socialize.UMShareListener {
        final /* synthetic */ com.bxkj.student.circle.CircleDetailActivity a;

        d(com.bxkj.student.circle.CircleDetailActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void onCancel(com.umeng.socialize.bean.SHARE_MEDIA r3) {
                r2 = this;
                com.bxkj.student.circle.CircleDetailActivity r3 = r2.a
                android.content.Context r3 = com.bxkj.student.circle.CircleDetailActivity.t0(r3)
                java.lang.String r0 = " 分享取消了"
                r1 = 0
                android.widget.Toast r3 = android.widget.Toast.makeText(r3, r0, r1)
                r3.show()
                return
        }

        public void onError(com.umeng.socialize.bean.SHARE_MEDIA r2, java.lang.Throwable r3) {
                r1 = this;
                r3.getClass()
                com.bxkj.student.circle.CircleDetailActivity r2 = r1.a
                android.content.Context r2 = com.bxkj.student.circle.CircleDetailActivity.s0(r2)
                java.lang.String r3 = " 分享失败啦"
                r0 = 0
                android.widget.Toast r2 = android.widget.Toast.makeText(r2, r3, r0)
                r2.show()
                return
        }

        public void onResult(com.umeng.socialize.bean.SHARE_MEDIA r3) {
                r2 = this;
                com.bxkj.student.circle.CircleDetailActivity r3 = r2.a
                android.content.Context r3 = com.bxkj.student.circle.CircleDetailActivity.r0(r3)
                java.lang.String r0 = " 分享成功啦"
                r1 = 0
                android.widget.Toast r3 = android.widget.Toast.makeText(r3, r0, r1)
                r3.show()
                return
        }

        public void onStart(com.umeng.socialize.bean.SHARE_MEDIA r1) {
                r0 = this;
                return
        }
    }

    public CircleDetailActivity() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "https://tsncs.boxkj.com/resources/upload/learn/20200227221615_883.mp4"
            r1.Y = r0
            return
    }

    private void A0(long r7) {
            r6 = this;
            r6.z0(r7)
            com.bxkj.student.circle.CircleDetailActivity$c r0 = new com.bxkj.student.circle.CircleDetailActivity$c
            r4 = 1000(0x3e8, double:4.94E-321)
            r1 = r6
            r2 = r7
            r0.<init>(r1, r2, r4)
            r1.G0 = r0
            r0.start()
            return
    }

    private void B0(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            com.umeng.socialize.ShareAction r0 = new com.umeng.socialize.ShareAction
            r0.<init>(r4)
            r1 = 4
            com.umeng.socialize.bean.SHARE_MEDIA[] r1 = new com.umeng.socialize.bean.SHARE_MEDIA[r1]
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.QQ
            r3 = 0
            r1[r3] = r2
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.QZONE
            r3 = 1
            r1[r3] = r2
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN
            r3 = 2
            r1[r3] = r2
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN_CIRCLE
            r3 = 3
            r1[r3] = r2
            com.umeng.socialize.ShareAction r0 = r0.setDisplayList(r1)
            com.bxkj.student.circle.a r1 = new com.bxkj.student.circle.a
            r1.<init>(r4, r5, r6)
            com.umeng.socialize.ShareAction r5 = r0.setShareboardclickCallback(r1)
            r5.open()
            return
    }

    private void C0() {
            r5 = this;
            android.content.Context r0 = r5.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideSuccessMessage()
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            java.lang.String r2 = r5.F0
            r3 = 0
            r4 = 1
            rx.e r1 = r1.q1(r2, r3, r4)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.circle.CircleDetailActivity$b r1 = new com.bxkj.student.circle.CircleDetailActivity$b
            r1.<init>(r5)
            r0.setDataListener(r1)
            return
    }

    public static /* synthetic */ void g0(com.bxkj.student.circle.CircleDetailActivity r0, android.view.View r1) {
            r0.v0(r1)
            return
    }

    public static /* synthetic */ void h0(com.bxkj.student.circle.CircleDetailActivity r0, java.lang.String r1, java.lang.String r2, com.umeng.socialize.shareboard.SnsPlatform r3, com.umeng.socialize.bean.SHARE_MEDIA r4) {
            r0.w0(r1, r2, r3, r4)
            return
    }

    static /* bridge */ /* synthetic */ android.widget.Button i0(com.bxkj.student.circle.CircleDetailActivity r0) {
            android.widget.Button r0 = r0.f734k0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView j0(com.bxkj.student.circle.CircleDetailActivity r0) {
            android.widget.TextView r0 = r0.Z
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView k0(com.bxkj.student.circle.CircleDetailActivity r0) {
            android.widget.TextView r0 = r0.a0
            return r0
    }

    static /* bridge */ /* synthetic */ void l0(com.bxkj.student.circle.CircleDetailActivity r0) {
            r0.u0()
            return
    }

    static /* bridge */ /* synthetic */ void m0(com.bxkj.student.circle.CircleDetailActivity r0, java.lang.String r1) {
            r0.x0(r1)
            return
    }

    static /* bridge */ /* synthetic */ void n0(com.bxkj.student.circle.CircleDetailActivity r0, int r1, boolean r2, long r3) {
            r0.y0(r1, r2, r3)
            return
    }

    static /* bridge */ /* synthetic */ void o0(com.bxkj.student.circle.CircleDetailActivity r0, long r1) {
            r0.z0(r1)
            return
    }

    static /* bridge */ /* synthetic */ void p0(com.bxkj.student.circle.CircleDetailActivity r0, java.lang.String r1, java.lang.String r2) {
            r0.B0(r1, r2)
            return
    }

    static /* synthetic */ android.content.Context q0(com.bxkj.student.circle.CircleDetailActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context r0(com.bxkj.student.circle.CircleDetailActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context s0(com.bxkj.student.circle.CircleDetailActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context t0(com.bxkj.student.circle.CircleDetailActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void u0() {
            r3 = this;
            android.content.Context r0 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            java.lang.String r2 = r3.F0
            rx.e r1 = r1.c0(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.circle.CircleDetailActivity$a r1 = new com.bxkj.student.circle.CircleDetailActivity$a
            r1.<init>(r3)
            r0.setDataListener(r1)
            return
    }

    private /* synthetic */ void v0(android.view.View r1) {
            r0 = this;
            r0.C0()
            return
    }

    private /* synthetic */ void w0(java.lang.String r3, java.lang.String r4, com.umeng.socialize.shareboard.SnsPlatform r5, com.umeng.socialize.bean.SHARE_MEDIA r6) {
            r2 = this;
            com.umeng.socialize.media.UMWeb r5 = new com.umeng.socialize.media.UMWeb
            java.lang.String r0 = "http://sj.qq.com/myapp/detail.htm?apkName=com.bxkj.student"
            r5.<init>(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "请为"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "投上一票"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r5.setTitle(r3)
            com.umeng.socialize.media.UMImage r3 = new com.umeng.socialize.media.UMImage
            android.content.Context r0 = r2.V
            r3.<init>(r0, r4)
            r5.setThumb(r3)
            java.lang.String r3 = "2020年学生“齐抗疫，云锻炼”居家锻炼模范评比活动"
            r5.setDescription(r3)
            com.umeng.socialize.ShareAction r3 = new com.umeng.socialize.ShareAction
            r3.<init>(r2)
            com.umeng.socialize.ShareAction r3 = r3.setPlatform(r6)
            com.bxkj.student.circle.CircleDetailActivity$d r4 = new com.bxkj.student.circle.CircleDetailActivity$d
            r4.<init>(r2)
            com.umeng.socialize.ShareAction r3 = r3.setCallback(r4)
            com.umeng.socialize.ShareAction r3 = r3.withMedia(r5)
            r3.share()
            return
    }

    private void x0(java.lang.String r3) {
            r2 = this;
            com.devlin_n.videoplayer.controller.StandardVideoController r0 = new com.devlin_n.videoplayer.controller.StandardVideoController
            r0.<init>(r2)
            com.devlin_n.videoplayer.player.IjkVideoView r1 = r2.f735p0
            com.devlin_n.videoplayer.player.IjkVideoView r1 = r1.T()
            com.devlin_n.videoplayer.player.IjkVideoView r1 = r1.R()
            java.lang.String r3 = com.bxkj.base.util.c0.a(r3)
            com.devlin_n.videoplayer.player.IjkVideoView r3 = r1.e0(r3)
            com.devlin_n.videoplayer.player.IjkVideoView r3 = r3.f0(r0)
            r3.start()
            return
    }

    private void y0(int r3, boolean r4, long r5) {
            r2 = this;
            r0 = 2131231052(0x7f08014c, float:1.8078174E38)
            r1 = 0
            if (r3 != 0) goto L2b
            android.widget.Button r3 = r2.b0
            r3.setEnabled(r1)
            android.widget.Button r3 = r2.b0
            android.content.Context r4 = r2.V
            android.graphics.drawable.Drawable r4 = androidx.core.content.ContextCompat.getDrawable(r4, r0)
            r3.setBackground(r4)
            r3 = 0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L24
            android.widget.Button r3 = r2.b0
            java.lang.String r4 = "投票未开始"
            r3.setText(r4)
            return
        L24:
            r2.z0(r5)
            r2.A0(r5)
            return
        L2b:
            r5 = 1
            if (r3 != r5) goto L6c
            r3 = 8
            if (r4 == 0) goto L3d
            android.widget.Button r4 = r2.b0
            r4.setVisibility(r3)
            android.widget.ImageView r3 = r2.c0
            r3.setVisibility(r1)
            return
        L3d:
            android.widget.Button r4 = r2.b0
            r4.setVisibility(r1)
            android.widget.ImageView r4 = r2.c0
            r4.setVisibility(r3)
            android.widget.Button r3 = r2.b0
            r3.setEnabled(r5)
            android.widget.Button r3 = r2.b0
            android.content.Context r4 = r2.V
            r5 = 2131231062(0x7f080156, float:1.8078194E38)
            android.graphics.drawable.Drawable r4 = androidx.core.content.ContextCompat.getDrawable(r4, r5)
            r3.setBackground(r4)
            android.widget.Button r3 = r2.b0
            java.lang.String r4 = "投票"
            r3.setText(r4)
            android.widget.Button r3 = r2.b0
            com.bxkj.student.circle.b r4 = new com.bxkj.student.circle.b
            r4.<init>(r2)
            r3.setOnClickListener(r4)
            return
        L6c:
            android.widget.Button r3 = r2.b0
            r3.setEnabled(r1)
            android.widget.Button r3 = r2.b0
            android.content.Context r4 = r2.V
            android.graphics.drawable.Drawable r4 = androidx.core.content.ContextCompat.getDrawable(r4, r0)
            r3.setBackground(r4)
            android.widget.Button r3 = r2.b0
            java.lang.String r4 = "投票已结束"
            r3.setText(r4)
            return
    }

    private void z0(long r7) {
            r6 = this;
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r2 = r7 / r0
            double r2 = (double) r2
            double r2 = java.lang.Math.floor(r2)
            int r2 = (int) r2
            long r7 = r7 % r0
            double r7 = (double) r7
            r0 = 4704985352480227328(0x414b774000000000, double:3600000.0)
            double r3 = r7 / r0
            double r3 = java.lang.Math.floor(r3)
            int r3 = (int) r3
            double r7 = r7 % r0
            r0 = 4678479150791524352(0x40ed4c0000000000, double:60000.0)
            double r4 = r7 / r0
            double r4 = java.lang.Math.floor(r4)
            int r4 = (int) r4
            double r7 = r7 % r0
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r7 = r7 / r0
            double r7 = java.lang.Math.floor(r7)
            int r7 = (int) r7
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "距离投票开始还有"
            r8.append(r0)
            java.lang.String r0 = "0"
            r1 = 10
            if (r2 <= 0) goto L4f
            if (r2 >= r1) goto L47
            r8.append(r0)
        L47:
            r8.append(r2)
            java.lang.String r2 = "天"
            r8.append(r2)
        L4f:
            if (r3 <= 0) goto L5e
            if (r3 >= r1) goto L56
            r8.append(r0)
        L56:
            r8.append(r3)
            java.lang.String r2 = "时"
            r8.append(r2)
        L5e:
            if (r4 <= 0) goto L6d
            if (r4 >= r1) goto L65
            r8.append(r0)
        L65:
            r8.append(r4)
            java.lang.String r2 = "分"
            r8.append(r2)
        L6d:
            if (r7 >= r1) goto L72
            r8.append(r0)
        L72:
            r8.append(r7)
            java.lang.String r7 = "秒"
            r8.append(r7)
            android.widget.Button r7 = r6.b0
            r7.setText(r8)
            return
    }

    public void L() {
            r0 = this;
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492918(0x7f0c0036, float:1.8609301E38)
            return r0
    }

    public void R() {
            r2 = this;
            android.widget.FrameLayout r0 = r2.P()
            r1 = 8
            r0.setVisibility(r1)
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r1 = "learnSelectionWorkId"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L22
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r2.F0 = r0
            r2.u0()
        L22:
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "参与投票"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131298315(0x7f09080b, float:1.82146E38)
            android.view.View r1 = r0.findViewById(r1)
            com.devlin_n.videoplayer.player.IjkVideoView r1 = (com.devlin_n.videoplayer.player.IjkVideoView) r1
            r0.f735p0 = r1
            r1 = 2131298996(0x7f090ab4, float:1.821598E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.Z = r1
            r1 = 2131299062(0x7f090af6, float:1.8216115E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.a0 = r1
            r1 = 2131296652(0x7f09018c, float:1.8211227E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r0.b0 = r1
            r1 = 2131297147(0x7f09037b, float:1.821223E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.c0 = r1
            r1 = 2131296643(0x7f090183, float:1.8211208E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r0.f734k0 = r1
            return
    }

    public void onActivityResult(int r2, int r3, @androidx.annotation.Nullable android.content.Intent r4) {
            r1 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onActivityResult(r2, r3, r4)
            android.content.Context r0 = r1.V
            com.umeng.socialize.UMShareAPI r0 = com.umeng.socialize.UMShareAPI.get(r0)
            r0.onActivityResult(r2, r3, r4)
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }

    public void onDestroy() {
            r1 = this;
            super.onDestroy()
            com.devlin_n.videoplayer.player.IjkVideoView r0 = r1.f735p0
            r0.Z()
            android.os.CountDownTimer r0 = r1.G0
            if (r0 == 0) goto Lf
            r0.cancel()
        Lf:
            return
    }

    public void onPause() {
            r1 = this;
            super.onPause()
            com.devlin_n.videoplayer.player.IjkVideoView r0 = r1.f735p0
            r0.pause()
            return
    }

    public void onResume() {
            r1 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onResume()
            com.devlin_n.videoplayer.player.IjkVideoView r0 = r1.f735p0
            r0.d()
            return
    }
}
