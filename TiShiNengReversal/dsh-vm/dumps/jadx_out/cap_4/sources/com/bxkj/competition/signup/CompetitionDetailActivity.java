package com.bxkj.competition.signup;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class CompetitionDetailActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.TextView F0;
    private android.widget.TextView G0;
    private android.widget.TextView H0;
    private android.widget.TextView I0;
    private android.widget.TextView J0;
    private android.widget.CheckBox K0;
    private cn.bluemobi.dylan.smartwebview.SmartWebView L0;
    private android.widget.LinearLayout M0;
    private android.widget.LinearLayout N0;
    private android.widget.LinearLayout O0;
    private android.widget.LinearLayout P0;
    private android.widget.LinearLayout Q0;
    private android.widget.LinearLayout R0;
    private java.lang.String S0;
    private android.os.CountDownTimer T0;
    private java.lang.String U0;
    private java.util.Map<java.lang.String, java.lang.Object> V0;
    private android.widget.RelativeLayout Y;
    private cn.bluemobi.dylan.base.view.CycleViewPager Z;
    private android.widget.TextView a0;
    private android.widget.TextView b0;
    private android.widget.TextView c0;

    /* renamed from: k0, reason: collision with root package name */
    private android.widget.TextView f660k0;

    /* renamed from: p0, reason: collision with root package name */
    private android.widget.TextView f661p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements cn.bluemobi.dylan.base.view.iOSTwoButtonDialog.RightButtonOnClick {
        final /* synthetic */ com.bxkj.competition.signup.CompetitionDetailActivity a;

        a(com.bxkj.competition.signup.CompetitionDetailActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void buttonRightOnClick() {
                r3 = this;
                android.content.Intent r0 = new android.content.Intent
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "tel:"
                r1.append(r2)
                com.bxkj.competition.signup.CompetitionDetailActivity r2 = r3.a
                android.widget.TextView r2 = com.bxkj.competition.signup.CompetitionDetailActivity.g0(r2)
                java.lang.CharSequence r2 = r2.getText()
                java.lang.String r2 = r2.toString()
                java.lang.String r2 = r2.trim()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                android.net.Uri r1 = android.net.Uri.parse(r1)
                java.lang.String r2 = "android.intent.action.DIAL"
                r0.<init>(r2, r1)
                r1 = 268435456(0x10000000, float:2.524355E-29)
                r0.setFlags(r1)
                com.bxkj.competition.signup.CompetitionDetailActivity r1 = r3.a
                r1.startActivity(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.competition.signup.CompetitionDetailActivity a;

        b(com.bxkj.competition.signup.CompetitionDetailActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r2) {
                r1 = this;
                com.bxkj.competition.signup.CompetitionDetailActivity r0 = r1.a
                com.bxkj.competition.signup.CompetitionDetailActivity.h0(r0, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements android.view.View.OnClickListener {
        final /* synthetic */ java.lang.String a;
        final /* synthetic */ com.bxkj.competition.signup.CompetitionDetailActivity b;

        c(com.bxkj.competition.signup.CompetitionDetailActivity r1, java.lang.String r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r4) {
                r3 = this;
                com.bxkj.competition.signup.CompetitionDetailActivity r4 = r3.b
                android.content.Intent r0 = new android.content.Intent
                com.bxkj.competition.signup.CompetitionDetailActivity r1 = r3.b
                android.content.Context r1 = com.bxkj.competition.signup.CompetitionDetailActivity.m0(r1)
                java.lang.Class<com.bxkj.base.webview.H5DetailActivity> r2 = com.bxkj.base.webview.H5DetailActivity.class
                r0.<init>(r1, r2)
                java.lang.String r1 = "title"
                java.lang.String r2 = "赛事规程协议"
                android.content.Intent r0 = r0.putExtra(r1, r2)
                java.lang.String r1 = "url"
                java.lang.String r2 = r3.a
                android.content.Intent r0 = r0.putExtra(r1, r2)
                r4.startActivity(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d implements cn.bluemobi.dylan.base.BaseActivity.c {
        final /* synthetic */ java.lang.String a;
        final /* synthetic */ java.lang.String b;
        final /* synthetic */ java.lang.String c;
        final /* synthetic */ com.bxkj.competition.signup.CompetitionDetailActivity d;

        d(com.bxkj.competition.signup.CompetitionDetailActivity r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
                r0 = this;
                r0.d = r1
                r0.a = r2
                r0.b = r3
                r0.c = r4
                r0.<init>()
                return
        }

        public void onClick() {
                r5 = this;
                com.bxkj.competition.signup.CompetitionDetailActivity r0 = r5.d
                java.lang.String r1 = r5.a
                int r2 = com.bxkj.competition.R.string.wanzhuan_app
                java.lang.String r2 = r0.getString(r2)
                java.lang.String r3 = r5.b
                java.lang.String r4 = r5.c
                com.bxkj.competition.signup.CompetitionDetailActivity.n0(r0, r1, r2, r3, r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e extends android.os.CountDownTimer {
        final /* synthetic */ boolean a;
        final /* synthetic */ com.bxkj.competition.signup.CompetitionDetailActivity b;

        e(com.bxkj.competition.signup.CompetitionDetailActivity r1, long r2, long r4, boolean r6) {
                r0 = this;
                r0.b = r1
                r0.a = r6
                r0.<init>(r2, r4)
                return
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
                r3 = this;
                boolean r0 = r3.a
                if (r0 == 0) goto L2f
                com.bxkj.competition.signup.CompetitionDetailActivity r0 = r3.b
                android.widget.TextView r0 = com.bxkj.competition.signup.CompetitionDetailActivity.p0(r0)
                r1 = 1
                r0.setEnabled(r1)
                com.bxkj.competition.signup.CompetitionDetailActivity r0 = r3.b
                android.widget.TextView r0 = com.bxkj.competition.signup.CompetitionDetailActivity.p0(r0)
                com.bxkj.competition.signup.CompetitionDetailActivity r1 = r3.b
                android.content.res.Resources r1 = r1.getResources()
                int r2 = com.bxkj.competition.R.color.themeColor
                int r1 = r1.getColor(r2)
                r0.setBackgroundColor(r1)
                com.bxkj.competition.signup.CompetitionDetailActivity r0 = r3.b
                android.widget.TextView r0 = com.bxkj.competition.signup.CompetitionDetailActivity.p0(r0)
                java.lang.String r1 = "报名参赛"
                r0.setText(r1)
                return
            L2f:
                com.bxkj.competition.signup.CompetitionDetailActivity r0 = r3.b
                android.widget.TextView r0 = com.bxkj.competition.signup.CompetitionDetailActivity.p0(r0)
                java.lang.String r1 = "报名已结束"
                r0.setText(r1)
                com.bxkj.competition.signup.CompetitionDetailActivity r0 = r3.b
                android.widget.TextView r0 = com.bxkj.competition.signup.CompetitionDetailActivity.q0(r0)
                r0.setText(r1)
                com.bxkj.competition.signup.CompetitionDetailActivity r0 = r3.b
                android.widget.TextView r0 = com.bxkj.competition.signup.CompetitionDetailActivity.p0(r0)
                r1 = 0
                r0.setEnabled(r1)
                com.bxkj.competition.signup.CompetitionDetailActivity r0 = r3.b
                android.widget.TextView r0 = com.bxkj.competition.signup.CompetitionDetailActivity.p0(r0)
                com.bxkj.competition.signup.CompetitionDetailActivity r1 = r3.b
                android.content.res.Resources r1 = r1.getResources()
                int r2 = com.bxkj.competition.R.color.app_title4
                int r1 = r1.getColor(r2)
                r0.setBackgroundColor(r1)
                com.bxkj.competition.signup.CompetitionDetailActivity r0 = r3.b
                android.widget.TextView r0 = com.bxkj.competition.signup.CompetitionDetailActivity.r0(r0)
                r1 = 8
                r0.setVisibility(r1)
                com.bxkj.competition.signup.CompetitionDetailActivity r0 = r3.b
                android.widget.LinearLayout r0 = com.bxkj.competition.signup.CompetitionDetailActivity.s0(r0)
                r0.setVisibility(r1)
                return
        }

        @Override // android.os.CountDownTimer
        public void onTick(long r2) {
                r1 = this;
                com.bxkj.competition.signup.CompetitionDetailActivity r0 = r1.b
                com.bxkj.competition.signup.CompetitionDetailActivity.o0(r0, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class f implements cn.bluemobi.dylan.base.view.CycleViewPager.ImageCycleViewListener {
        final /* synthetic */ java.util.List a;
        final /* synthetic */ com.bxkj.competition.signup.CompetitionDetailActivity b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a extends rx.l<okhttp3.ResponseBody> {
            final /* synthetic */ com.bxkj.competition.signup.CompetitionDetailActivity.f a;

            a(com.bxkj.competition.signup.CompetitionDetailActivity.f r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public void g(okhttp3.ResponseBody r3) {
                    r2 = this;
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "onNext="
                    r0.append(r1)
                    java.lang.String r3 = r3.toString()
                    r0.append(r3)
                    java.lang.String r3 = r0.toString()
                    r0 = 0
                    java.lang.Object[] r0 = new java.lang.Object[r0]
                    com.orhanobut.logger.j.d(r3, r0)
                    return
            }

            public void onCompleted() {
                    r2 = this;
                    r0 = 0
                    java.lang.Object[] r0 = new java.lang.Object[r0]
                    java.lang.String r1 = "onCompleted"
                    com.orhanobut.logger.j.d(r1, r0)
                    return
            }

            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    r2.getClass()
                    r2 = 0
                    java.lang.Object[] r2 = new java.lang.Object[r2]
                    java.lang.String r0 = "Throwable"
                    com.orhanobut.logger.j.d(r0, r2)
                    return
            }

            public /* bridge */ /* synthetic */ void onNext(java.lang.Object r1) {
                    r0 = this;
                    okhttp3.ResponseBody r1 = (okhttp3.ResponseBody) r1
                    r0.g(r1)
                    return
            }
        }

        f(com.bxkj.competition.signup.CompetitionDetailActivity r1, java.util.List r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void onImageClick(java.lang.String r3, int r4, android.view.View r5) {
                r2 = this;
                java.util.List r3 = r2.a
                if (r3 == 0) goto L85
                int r3 = r3.size()
                if (r3 <= r4) goto L85
                android.content.Intent r3 = new android.content.Intent
                com.bxkj.competition.signup.CompetitionDetailActivity r5 = r2.b
                android.content.Context r5 = com.bxkj.competition.signup.CompetitionDetailActivity.t0(r5)
                java.lang.Class<com.bxkj.base.webview.H5DetailActivity> r0 = com.bxkj.base.webview.H5DetailActivity.class
                r3.<init>(r5, r0)
                java.util.List r5 = r2.a
                java.lang.Object r5 = r5.get(r4)
                java.util.Map r5 = (java.util.Map) r5
                java.lang.String r0 = "clickUrl"
                java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r0)
                java.lang.String r0 = "url"
                r3.putExtra(r0, r5)
                java.util.List r5 = r2.a
                java.lang.Object r4 = r5.get(r4)
                java.util.Map r4 = (java.util.Map) r4
                java.lang.String r5 = "advertiesTitle"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r5)
                java.lang.String r5 = "title"
                r3.putExtra(r5, r4)
                com.bxkj.competition.signup.CompetitionDetailActivity r4 = r2.b
                r4.startActivity(r3)
                com.bxkj.competition.signup.CompetitionDetailActivity$f$a r3 = new com.bxkj.competition.signup.CompetitionDetailActivity$f$a
                r3.<init>(r2)
                java.lang.Class<w.f> r4 = w.f.class
                java.lang.Object r4 = cn.bluemobi.dylan.http.Http.getApiService(r4)
                w.f r4 = (w.f) r4
                java.util.List r5 = r2.a
                r0 = 0
                java.lang.Object r5 = r5.get(r0)
                java.util.Map r5 = (java.util.Map) r5
                java.lang.String r0 = "id"
                java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r0)
                com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r0 = r0.getSchoolId()
                com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r1 = r1.getUserId()
                rx.e r4 = r4.v(r5, r0, r1)
                rx.h r5 = rx.schedulers.c.e()
                rx.e r4 = r4.w5(r5)
                rx.h r5 = rx.android.schedulers.a.b()
                rx.e r4 = r4.I3(r5)
                r4.r5(r3)
            L85:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class g implements com.umeng.socialize.utils.ShareBoardlistener {
        final /* synthetic */ java.lang.String a;
        final /* synthetic */ java.lang.String b;
        final /* synthetic */ java.lang.String c;
        final /* synthetic */ java.lang.String d;
        final /* synthetic */ com.bxkj.competition.signup.CompetitionDetailActivity e;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements com.umeng.socialize.UMShareListener {
            final /* synthetic */ com.bxkj.competition.signup.CompetitionDetailActivity.g a;

            a(com.bxkj.competition.signup.CompetitionDetailActivity.g r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public void onCancel(com.umeng.socialize.bean.SHARE_MEDIA r3) {
                    r2 = this;
                    com.bxkj.competition.signup.CompetitionDetailActivity$g r3 = r2.a
                    com.bxkj.competition.signup.CompetitionDetailActivity r3 = r3.e
                    android.content.Context r3 = com.bxkj.competition.signup.CompetitionDetailActivity.l0(r3)
                    java.lang.String r0 = " 分享取消了"
                    r1 = 0
                    android.widget.Toast r3 = android.widget.Toast.makeText(r3, r0, r1)
                    r3.show()
                    return
            }

            public void onError(com.umeng.socialize.bean.SHARE_MEDIA r2, java.lang.Throwable r3) {
                    r1 = this;
                    r3.getClass()
                    com.bxkj.competition.signup.CompetitionDetailActivity$g r2 = r1.a
                    com.bxkj.competition.signup.CompetitionDetailActivity r2 = r2.e
                    android.content.Context r2 = com.bxkj.competition.signup.CompetitionDetailActivity.k0(r2)
                    java.lang.String r3 = " 分享失败啦"
                    r0 = 0
                    android.widget.Toast r2 = android.widget.Toast.makeText(r2, r3, r0)
                    r2.show()
                    return
            }

            public void onResult(com.umeng.socialize.bean.SHARE_MEDIA r3) {
                    r2 = this;
                    com.bxkj.competition.signup.CompetitionDetailActivity$g r3 = r2.a
                    com.bxkj.competition.signup.CompetitionDetailActivity r3 = r3.e
                    android.content.Context r3 = com.bxkj.competition.signup.CompetitionDetailActivity.j0(r3)
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

        g(com.bxkj.competition.signup.CompetitionDetailActivity r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
                r0 = this;
                r0.e = r1
                r0.a = r2
                r0.b = r3
                r0.c = r4
                r0.d = r5
                r0.<init>()
                return
        }

        public void onclick(com.umeng.socialize.shareboard.SnsPlatform r4, com.umeng.socialize.bean.SHARE_MEDIA r5) {
                r3 = this;
                com.umeng.socialize.media.UMWeb r4 = new com.umeng.socialize.media.UMWeb
                java.lang.String r0 = r3.a
                r4.<init>(r0)
                java.lang.String r0 = r3.b
                r4.setTitle(r0)
                com.umeng.socialize.media.UMImage r0 = new com.umeng.socialize.media.UMImage
                com.bxkj.competition.signup.CompetitionDetailActivity r1 = r3.e
                android.content.Context r1 = com.bxkj.competition.signup.CompetitionDetailActivity.i0(r1)
                java.lang.String r2 = r3.c
                r0.<init>(r1, r2)
                r4.setThumb(r0)
                java.lang.String r0 = r3.d
                r4.setDescription(r0)
                com.umeng.socialize.ShareAction r0 = new com.umeng.socialize.ShareAction
                com.bxkj.competition.signup.CompetitionDetailActivity r1 = r3.e
                r0.<init>(r1)
                com.umeng.socialize.ShareAction r5 = r0.setPlatform(r5)
                com.bxkj.competition.signup.CompetitionDetailActivity$g$a r0 = new com.bxkj.competition.signup.CompetitionDetailActivity$g$a
                r0.<init>(r3)
                com.umeng.socialize.ShareAction r5 = r5.setCallback(r0)
                com.umeng.socialize.ShareAction r4 = r5.withMedia(r4)
                r4.share()
                return
        }
    }

    public CompetitionDetailActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    private void A0(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
            r7 = this;
            com.umeng.socialize.ShareAction r0 = new com.umeng.socialize.ShareAction
            r0.<init>(r7)
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
            com.bxkj.competition.signup.CompetitionDetailActivity$g r1 = new com.bxkj.competition.signup.CompetitionDetailActivity$g
            r2 = r7
            r4 = r8
            r6 = r9
            r3 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            com.umeng.socialize.ShareAction r8 = r0.setShareboardclickCallback(r1)
            r8.open()
            return
    }

    static /* synthetic */ android.widget.TextView g0(com.bxkj.competition.signup.CompetitionDetailActivity r0) {
            android.widget.TextView r0 = r0.H0
            return r0
    }

    static /* synthetic */ void h0(com.bxkj.competition.signup.CompetitionDetailActivity r0, java.util.Map r1) {
            r0.x0(r1)
            return
    }

    static /* synthetic */ android.content.Context i0(com.bxkj.competition.signup.CompetitionDetailActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context j0(com.bxkj.competition.signup.CompetitionDetailActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context k0(com.bxkj.competition.signup.CompetitionDetailActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context l0(com.bxkj.competition.signup.CompetitionDetailActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context m0(com.bxkj.competition.signup.CompetitionDetailActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ void n0(com.bxkj.competition.signup.CompetitionDetailActivity r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0.A0(r1, r2, r3, r4)
            return
    }

    static /* synthetic */ void o0(com.bxkj.competition.signup.CompetitionDetailActivity r0, long r1) {
            r0.y0(r1)
            return
    }

    static /* synthetic */ android.widget.TextView p0(com.bxkj.competition.signup.CompetitionDetailActivity r0) {
            android.widget.TextView r0 = r0.J0
            return r0
    }

    static /* synthetic */ android.widget.TextView q0(com.bxkj.competition.signup.CompetitionDetailActivity r0) {
            android.widget.TextView r0 = r0.F0
            return r0
    }

    static /* synthetic */ android.widget.TextView r0(com.bxkj.competition.signup.CompetitionDetailActivity r0) {
            android.widget.TextView r0 = r0.G0
            return r0
    }

    static /* synthetic */ android.widget.LinearLayout s0(com.bxkj.competition.signup.CompetitionDetailActivity r0) {
            android.widget.LinearLayout r0 = r0.N0
            return r0
    }

    static /* synthetic */ android.content.Context t0(com.bxkj.competition.signup.CompetitionDetailActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void u0() {
            r3 = this;
            android.widget.CheckBox r0 = r3.K0
            boolean r0 = r0.isChecked()
            if (r0 != 0) goto L19
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r1 = r3.V
            r0.<init>(r1)
            java.lang.String r1 = "请同意赛事规程协议"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)
            r0.show()
            return
        L19:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.V0
            java.lang.String r1 = "signupType"
            int r0 = cn.bluemobi.dylan.http.JsonParse.getInt(r0, r1)
            if (r0 != 0) goto L2d
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r3.V
            java.lang.Class<com.bxkj.competition.signup.FreeProjectListActivity> r2 = com.bxkj.competition.signup.FreeProjectListActivity.class
            r0.<init>(r1, r2)
            goto L36
        L2d:
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r3.V
            java.lang.Class<com.bxkj.competition.signup.CostProjectListActivity> r2 = com.bxkj.competition.signup.CostProjectListActivity.class
            r0.<init>(r1, r2)
        L36:
            java.lang.String r1 = "competitionId"
            java.lang.String r2 = r3.S0
            android.content.Intent r0 = r0.putExtra(r1, r2)
            r3.startActivity(r0)
            return
    }

    private void v0() {
            r3 = this;
            android.content.Context r0 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<com.bxkj.competition.b> r1 = com.bxkj.competition.b.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.competition.b r1 = (com.bxkj.competition.b) r1
            java.lang.String r2 = r3.S0
            rx.e r1 = r1.e(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.competition.signup.CompetitionDetailActivity$b r1 = new com.bxkj.competition.signup.CompetitionDetailActivity$b
            r1.<init>(r3)
            r0.setDataListener(r1)
            return
    }

    private void w0(java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r5) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r5 == 0) goto L28
            int r1 = r5.size()
            if (r1 != 0) goto Le
            goto L28
        Le:
            java.util.Iterator r1 = r5.iterator()
        L12:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L37
            java.lang.Object r2 = r1.next()
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r3 = "advertiesUrl"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r3)
            r0.add(r2)
            goto L12
        L28:
            java.lang.String r1 = "http://www.boxkj.com/resources/upload/photo/15fffd1a-12db-42d9-aeda-f94e179d277d.jpg"
            r0.add(r1)
            java.lang.String r1 = "http://www.boxkj.com/resources/upload/photo/f95cc0e8-4cdd-4011-a573-1070b7d76a0b.jpg"
            r0.add(r1)
            java.lang.String r1 = "http://www.boxkj.com/resources/upload/photo/6b63fa83-98c8-48ef-91b2-ce9c6d37e8ce.jpg"
            r0.add(r1)
        L37:
            cn.bluemobi.dylan.base.view.CycleViewPager r1 = r4.Z
            int r2 = com.bxkj.competition.R.drawable.dot_focus_blue
            int r3 = com.bxkj.competition.R.drawable.dot_normal_blue
            r1.setIndicators(r2, r3)
            cn.bluemobi.dylan.base.view.CycleViewPager r1 = r4.Z
            com.bxkj.competition.signup.CompetitionDetailActivity$f r2 = new com.bxkj.competition.signup.CompetitionDetailActivity$f
            r2.<init>(r4, r5)
            r1.setData(r0, r2)
            return
    }

    private void x0(java.util.Map<java.lang.String, java.lang.Object> r8) {
            r7 = this;
            r7.V0 = r8
            android.widget.RelativeLayout r0 = r7.Y
            r1 = 0
            r0.setVisibility(r1)
            java.lang.String r0 = "name"
            java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r0)
            android.widget.TextView r2 = r7.a0
            r2.setText(r0)
            android.widget.TextView r2 = r7.b0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "竞赛地点："
            r3.append(r4)
            java.lang.String r4 = "address"
            java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r4)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.setText(r3)
            android.widget.TextView r2 = r7.c0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "竞赛时间："
            r3.append(r4)
            java.lang.String r4 = "startDate"
            java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r4)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.setText(r3)
            android.widget.TextView r2 = r7.f660k0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "报名开始时间："
            r3.append(r4)
            java.lang.String r4 = "signupBeginTime"
            java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r4)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.setText(r3)
            android.widget.TextView r2 = r7.f661p0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "报名结束时间："
            r3.append(r4)
            java.lang.String r4 = "signupEndTime"
            java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r4)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.setText(r3)
            java.lang.String r2 = "sideImg"
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.util.List r2 = cn.bluemobi.dylan.http.JsonParse.getList(r8, r2, r3)
            cn.bluemobi.dylan.base.view.CycleViewPager r3 = r7.Z
            int r4 = com.bxkj.competition.R.drawable.dot_focus_blue
            int r5 = com.bxkj.competition.R.drawable.dot_normal_blue
            r3.setIndicators(r4, r5)
            cn.bluemobi.dylan.base.view.CycleViewPager r3 = r7.Z
            r4 = 0
            r3.setData(r2, r4)
            java.lang.String r2 = "content"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r2)
            cn.bluemobi.dylan.smartwebview.SmartWebView r3 = r7.L0
            r3.j(r2)
            android.widget.TextView r3 = r7.I0
            com.bxkj.competition.signup.CompetitionDetailActivity$c r4 = new com.bxkj.competition.signup.CompetitionDetailActivity$c
            r4.<init>(r7, r2)
            r3.setOnClickListener(r4)
            java.lang.String r3 = "majorImg"
            java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r3)
            android.app.Application r4 = r7.getApplication()     // Catch: java.lang.Exception -> Ld5
            java.lang.String r4 = r4.getPackageName()     // Catch: java.lang.Exception -> Ld5
            java.lang.String r5 = "com.bxkj.teacher"
            boolean r4 = r4.equalsIgnoreCase(r5)     // Catch: java.lang.Exception -> Ld5
            if (r4 != 0) goto Ld6
            java.lang.String r4 = "分享"
            int r5 = com.bxkj.competition.R.mipmap.share     // Catch: java.lang.Exception -> Ld5
            com.bxkj.competition.signup.CompetitionDetailActivity$d r6 = new com.bxkj.competition.signup.CompetitionDetailActivity$d     // Catch: java.lang.Exception -> Ld5
            r6.<init>(r7, r0, r2, r3)     // Catch: java.lang.Exception -> Ld5
            r7.a0(r4, r5, r6)     // Catch: java.lang.Exception -> Ld5
            r7.invalidateOptionsMenu()     // Catch: java.lang.Exception -> Ld5
            goto Ld6
        Ld5:
        Ld6:
            java.lang.String r0 = r7.U0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r2 = 1
            r3 = 8
            if (r0 == 0) goto L16a
            java.lang.String r0 = "timeStatus"
            java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r0)
            java.lang.String r4 = "1"
            boolean r4 = r4.equals(r0)
            java.lang.String r5 = "timeValue"
            if (r4 == 0) goto L120
            android.widget.TextView r0 = r7.F0
            java.lang.String r4 = "距离报名开始还有"
            r0.setText(r4)
            android.widget.TextView r0 = r7.J0
            java.lang.String r4 = "报名未开始"
            r0.setText(r4)
            android.widget.TextView r0 = r7.J0
            r0.setEnabled(r1)
            android.widget.TextView r0 = r7.J0
            android.content.res.Resources r1 = r7.getResources()
            int r4 = com.bxkj.competition.R.color.app_title4
            int r1 = r1.getColor(r4)
            r0.setBackgroundColor(r1)
            android.widget.LinearLayout r0 = r7.N0
            r0.setVisibility(r3)
            long r0 = cn.bluemobi.dylan.http.JsonParse.getLong(r8, r5)
            r7.z0(r0, r2)
            goto L180
        L120:
            java.lang.String r4 = "2"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L137
            android.widget.TextView r0 = r7.F0
            java.lang.String r1 = "距离报名结束还有"
            r0.setText(r1)
            long r0 = cn.bluemobi.dylan.http.JsonParse.getLong(r8, r5)
            r7.z0(r0, r2)
            goto L180
        L137:
            java.lang.String r8 = "3"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L180
            android.widget.TextView r8 = r7.J0
            java.lang.String r0 = "报名已结束"
            r8.setText(r0)
            android.widget.TextView r8 = r7.F0
            r8.setText(r0)
            android.widget.TextView r8 = r7.J0
            r8.setEnabled(r1)
            android.widget.TextView r8 = r7.J0
            android.content.res.Resources r0 = r7.getResources()
            int r1 = com.bxkj.competition.R.color.app_title4
            int r0 = r0.getColor(r1)
            r8.setBackgroundColor(r0)
            android.widget.TextView r8 = r7.G0
            r8.setVisibility(r3)
            android.widget.LinearLayout r8 = r7.N0
            r8.setVisibility(r3)
            goto L180
        L16a:
            android.widget.LinearLayout r8 = r7.M0
            r8.setVisibility(r3)
            android.widget.CheckBox r8 = r7.K0
            r8.setChecked(r2)
            android.widget.CheckBox r8 = r7.K0
            r8.setClickable(r1)
            android.widget.TextView r8 = r7.J0
            java.lang.String r0 = "查看我报名的项目"
            r8.setText(r0)
        L180:
            return
    }

    private void y0(long r7) {
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
            android.widget.TextView r8 = r6.G0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r1 = "天 "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = "时 "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = " 分"
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = " 秒"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.setText(r7)
            return
    }

    private void z0(long r8, boolean r10) {
            r7 = this;
            r7.y0(r8)
            com.bxkj.competition.signup.CompetitionDetailActivity$e r0 = new com.bxkj.competition.signup.CompetitionDetailActivity$e
            r4 = 1000(0x3e8, double:4.94E-321)
            r1 = r7
            r2 = r8
            r6 = r10
            r0.<init>(r1, r2, r4, r6)
            r1.T0 = r0
            r0.start()
            return
    }

    public void L() {
            r1 = this;
            android.widget.TextView r0 = r1.H0
            r0.setOnClickListener(r1)
            android.widget.TextView r0 = r1.J0
            r0.setOnClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            int r0 = com.bxkj.competition.R.layout.ac_competition_detail
            return r0
    }

    public void R() {
            r2 = this;
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r1 = "competitionId"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L16
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r2.S0 = r0
        L16:
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r1 = "from"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L2c
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r2.U0 = r0
        L2c:
            r2.v0()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "竞赛详情"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r2) {
            r1 = this;
            int r2 = com.bxkj.competition.R.id.rl_root
            android.view.View r2 = r1.findViewById(r2)
            android.widget.RelativeLayout r2 = (android.widget.RelativeLayout) r2
            r1.Y = r2
            int r2 = com.bxkj.competition.R.id.cy
            android.view.View r2 = r1.findViewById(r2)
            cn.bluemobi.dylan.base.view.CycleViewPager r2 = (cn.bluemobi.dylan.base.view.CycleViewPager) r2
            r1.Z = r2
            int r2 = com.bxkj.competition.R.id.tv_title
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.a0 = r2
            int r2 = com.bxkj.competition.R.id.tv_address
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.b0 = r2
            int r2 = com.bxkj.competition.R.id.tv_status
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.F0 = r2
            int r2 = com.bxkj.competition.R.id.tv_time
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.G0 = r2
            int r2 = com.bxkj.competition.R.id.tv_start_time
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.c0 = r2
            int r2 = com.bxkj.competition.R.id.tv_apply_time
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.f660k0 = r2
            int r2 = com.bxkj.competition.R.id.tv_apply_end_time
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.f661p0 = r2
            int r2 = com.bxkj.competition.R.id.tv_phone
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.H0 = r2
            int r2 = com.bxkj.competition.R.id.tv_ok
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.J0 = r2
            int r2 = com.bxkj.competition.R.id.swv
            android.view.View r2 = r1.findViewById(r2)
            cn.bluemobi.dylan.smartwebview.SmartWebView r2 = (cn.bluemobi.dylan.smartwebview.SmartWebView) r2
            r1.L0 = r2
            int r2 = com.bxkj.competition.R.id.ll_time
            android.view.View r2 = r1.findViewById(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r1.M0 = r2
            int r2 = com.bxkj.competition.R.id.ll_xy
            android.view.View r2 = r1.findViewById(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r1.N0 = r2
            int r2 = com.bxkj.competition.R.id.tv_xy
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.I0 = r2
            int r2 = com.bxkj.competition.R.id.ll_wechat
            android.view.View r2 = r1.findViewById(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r1.O0 = r2
            int r2 = com.bxkj.competition.R.id.ll_moments
            android.view.View r2 = r1.findViewById(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r1.P0 = r2
            int r2 = com.bxkj.competition.R.id.ll_qq
            android.view.View r2 = r1.findViewById(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r1.Q0 = r2
            int r2 = com.bxkj.competition.R.id.ll_qzone
            android.view.View r2 = r1.findViewById(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r1.R0 = r2
            int r2 = com.bxkj.competition.R.id.cb_agree
            android.view.View r2 = r1.findViewById(r2)
            android.widget.CheckBox r2 = (android.widget.CheckBox) r2
            r1.K0 = r2
            android.widget.RelativeLayout r2 = r1.Y
            r0 = 8
            r2.setVisibility(r0)
            return
    }

    public void onClick(android.view.View r3) {
            r2 = this;
            int r3 = r3.getId()
            int r0 = com.bxkj.competition.R.id.tv_phone
            if (r3 != r0) goto L2c
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r3 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
            android.content.Context r0 = r2.V
            r3.<init>(r0)
            java.lang.String r0 = "提示"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r3 = r3.setTitle(r0)
            int r0 = com.bxkj.competition.R.string.you_sure_call_phone
            java.lang.String r0 = r2.getString(r0)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r3 = r3.setMessage(r0)
            com.bxkj.competition.signup.CompetitionDetailActivity$a r0 = new com.bxkj.competition.signup.CompetitionDetailActivity$a
            r0.<init>(r2)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r3 = r3.setRightButtonOnClickListener(r0)
            r3.show()
            return
        L2c:
            int r0 = com.bxkj.competition.R.id.tv_ok
            if (r3 != r0) goto L88
            android.widget.TextView r3 = r2.J0
            java.lang.CharSequence r3 = r3.getText()
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r3.trim()
            java.lang.String r0 = "报名参赛"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L4a
            r2.u0()
            return
        L4a:
            java.lang.String r0 = "查看我报名的项目"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L88
            java.util.Map<java.lang.String, java.lang.Object> r3 = r2.V0
            java.lang.String r0 = "signupType"
            java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r0)
            java.lang.String r0 = "0"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L6c
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r0 = r2.V
            java.lang.Class<com.bxkj.competition.signup.FreeProjectListActivity> r1 = com.bxkj.competition.signup.FreeProjectListActivity.class
            r3.<init>(r0, r1)
            goto L75
        L6c:
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r0 = r2.V
            java.lang.Class<com.bxkj.competition.signup.CostProjectListActivity> r1 = com.bxkj.competition.signup.CostProjectListActivity.class
            r3.<init>(r0, r1)
        L75:
            java.lang.String r0 = "competitionId"
            java.lang.String r1 = r2.S0
            android.content.Intent r3 = r3.putExtra(r0, r1)
            java.lang.String r0 = "from"
            java.lang.String r1 = "my"
            android.content.Intent r3 = r3.putExtra(r0, r1)
            r2.startActivity(r3)
        L88:
            return
    }

    protected void onDestroy() {
            r1 = this;
            android.os.CountDownTimer r0 = r1.T0
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            super.onDestroy()
            return
    }
}
