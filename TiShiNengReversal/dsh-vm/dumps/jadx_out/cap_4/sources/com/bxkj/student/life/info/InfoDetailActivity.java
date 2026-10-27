package com.bxkj.student.life.info;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class InfoDetailActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.LinearLayout F0;
    private android.widget.LinearLayout G0;
    private java.lang.String H0;
    private java.lang.String I0;
    private java.lang.String Y;
    private java.lang.String Z;
    private androidx.coordinatorlayout.widget.CoordinatorLayout a0;
    private com.google.android.material.floatingactionbutton.FloatingActionButton b0;
    private cn.bluemobi.dylan.smartwebview.SmartWebView c0;

    /* renamed from: k0, reason: collision with root package name */
    private android.widget.LinearLayout f989k0;

    /* renamed from: p0, reason: collision with root package name */
    private android.widget.LinearLayout f990p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends android.animation.AnimatorListenerAdapter {
        private boolean a;
        final /* synthetic */ android.view.View b;
        final /* synthetic */ com.bxkj.student.life.info.InfoDetailActivity c;

        a(com.bxkj.student.life.info.InfoDetailActivity r1, android.view.View r2) {
                r0 = this;
                r0.c = r1
                r0.b = r2
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator r1) {
                r0 = this;
                r1 = 1
                r0.a = r1
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r2) {
                r1 = this;
                boolean r2 = r1.a
                if (r2 != 0) goto La
                android.view.View r2 = r1.b
                r0 = 4
                r2.setVisibility(r0)
            La:
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r2) {
                r1 = this;
                android.view.View r2 = r1.b
                r0 = 0
                r2.setVisibility(r0)
                r1.a = r0
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.life.info.InfoDetailActivity a;

        b(com.bxkj.student.life.info.InfoDetailActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.life.info.InfoDetailActivity r0 = r2.a
                androidx.coordinatorlayout.widget.CoordinatorLayout r0 = com.bxkj.student.life.info.InfoDetailActivity.g0(r0)
                r1 = 0
                r0.setVisibility(r1)
                java.lang.String r0 = "html5Url"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r0)
                com.bxkj.student.life.info.InfoDetailActivity r0 = r2.a
                cn.bluemobi.dylan.smartwebview.SmartWebView r0 = com.bxkj.student.life.info.InfoDetailActivity.i0(r0)
                r0.j(r3)
                com.bxkj.student.life.info.InfoDetailActivity r0 = r2.a
                cn.bluemobi.dylan.smartwebview.SmartWebView r0 = com.bxkj.student.life.info.InfoDetailActivity.i0(r0)
                r0.setTag(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements com.umeng.socialize.utils.ShareBoardlistener {
        final /* synthetic */ com.bxkj.student.life.info.InfoDetailActivity a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements com.umeng.socialize.UMShareListener {
            final /* synthetic */ com.bxkj.student.life.info.InfoDetailActivity.c a;

            a(com.bxkj.student.life.info.InfoDetailActivity.c r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public void onCancel(com.umeng.socialize.bean.SHARE_MEDIA r3) {
                    r2 = this;
                    com.bxkj.student.life.info.InfoDetailActivity$c r3 = r2.a
                    com.bxkj.student.life.info.InfoDetailActivity r3 = r3.a
                    android.content.Context r3 = com.bxkj.student.life.info.InfoDetailActivity.m0(r3)
                    java.lang.String r0 = " 分享取消了"
                    r1 = 0
                    android.widget.Toast r3 = android.widget.Toast.makeText(r3, r0, r1)
                    r3.show()
                    return
            }

            public void onError(com.umeng.socialize.bean.SHARE_MEDIA r2, java.lang.Throwable r3) {
                    r1 = this;
                    r3.getClass()
                    com.bxkj.student.life.info.InfoDetailActivity$c r2 = r1.a
                    com.bxkj.student.life.info.InfoDetailActivity r2 = r2.a
                    android.content.Context r2 = com.bxkj.student.life.info.InfoDetailActivity.l0(r2)
                    java.lang.String r3 = " 分享失败啦"
                    r0 = 0
                    android.widget.Toast r2 = android.widget.Toast.makeText(r2, r3, r0)
                    r2.show()
                    return
            }

            public void onResult(com.umeng.socialize.bean.SHARE_MEDIA r3) {
                    r2 = this;
                    com.bxkj.student.life.info.InfoDetailActivity$c r3 = r2.a
                    com.bxkj.student.life.info.InfoDetailActivity r3 = r3.a
                    android.content.Context r3 = com.bxkj.student.life.info.InfoDetailActivity.k0(r3)
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

        c(com.bxkj.student.life.info.InfoDetailActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void onclick(com.umeng.socialize.shareboard.SnsPlatform r4, com.umeng.socialize.bean.SHARE_MEDIA r5) {
                r3 = this;
                com.bxkj.student.life.info.InfoDetailActivity r4 = r3.a
                cn.bluemobi.dylan.smartwebview.SmartWebView r4 = com.bxkj.student.life.info.InfoDetailActivity.i0(r4)
                java.lang.Object r4 = r4.getTag()
                java.lang.String r4 = r4.toString()
                com.umeng.socialize.media.UMWeb r0 = new com.umeng.socialize.media.UMWeb
                r0.<init>(r4)
                com.bxkj.student.life.info.InfoDetailActivity r4 = r3.a
                java.lang.String r4 = com.bxkj.student.life.info.InfoDetailActivity.h0(r4)
                r0.setTitle(r4)
                com.umeng.socialize.media.UMImage r4 = new com.umeng.socialize.media.UMImage
                com.bxkj.student.life.info.InfoDetailActivity r1 = r3.a
                android.content.Context r1 = com.bxkj.student.life.info.InfoDetailActivity.j0(r1)
                java.lang.String r2 = "http://m.boxkj.com/resources/wechat/images/xiaowei.png"
                r4.<init>(r1, r2)
                r0.setThumb(r4)
                java.lang.String r4 = "校园生活如此简单"
                r0.setDescription(r4)
                com.umeng.socialize.ShareAction r4 = new com.umeng.socialize.ShareAction
                com.bxkj.student.life.info.InfoDetailActivity r1 = r3.a
                r4.<init>(r1)
                com.umeng.socialize.ShareAction r4 = r4.setPlatform(r5)
                com.bxkj.student.life.info.InfoDetailActivity$c$a r5 = new com.bxkj.student.life.info.InfoDetailActivity$c$a
                r5.<init>(r3)
                com.umeng.socialize.ShareAction r4 = r4.setCallback(r5)
                com.umeng.socialize.ShareAction r4 = r4.withMedia(r0)
                r4.share()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d implements com.umeng.socialize.UMShareListener {
        final /* synthetic */ com.bxkj.student.life.info.InfoDetailActivity a;

        d(com.bxkj.student.life.info.InfoDetailActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void onCancel(com.umeng.socialize.bean.SHARE_MEDIA r3) {
                r2 = this;
                com.bxkj.student.life.info.InfoDetailActivity r3 = r2.a
                android.content.Context r3 = com.bxkj.student.life.info.InfoDetailActivity.p0(r3)
                java.lang.String r0 = " 分享取消了"
                r1 = 0
                android.widget.Toast r3 = android.widget.Toast.makeText(r3, r0, r1)
                r3.show()
                return
        }

        public void onError(com.umeng.socialize.bean.SHARE_MEDIA r2, java.lang.Throwable r3) {
                r1 = this;
                r3.getClass()
                com.bxkj.student.life.info.InfoDetailActivity r2 = r1.a
                android.content.Context r2 = com.bxkj.student.life.info.InfoDetailActivity.o0(r2)
                java.lang.String r3 = " 分享失败啦"
                r0 = 0
                android.widget.Toast r2 = android.widget.Toast.makeText(r2, r3, r0)
                r2.show()
                return
        }

        public void onResult(com.umeng.socialize.bean.SHARE_MEDIA r3) {
                r2 = this;
                com.bxkj.student.life.info.InfoDetailActivity r3 = r2.a
                android.content.Context r3 = com.bxkj.student.life.info.InfoDetailActivity.n0(r3)
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

    public InfoDetailActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* bridge */ /* synthetic */ androidx.coordinatorlayout.widget.CoordinatorLayout g0(com.bxkj.student.life.info.InfoDetailActivity r0) {
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r0.a0
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String h0(com.bxkj.student.life.info.InfoDetailActivity r0) {
            java.lang.String r0 = r0.Z
            return r0
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.smartwebview.SmartWebView i0(com.bxkj.student.life.info.InfoDetailActivity r0) {
            cn.bluemobi.dylan.smartwebview.SmartWebView r0 = r0.c0
            return r0
    }

    static /* synthetic */ android.content.Context j0(com.bxkj.student.life.info.InfoDetailActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context k0(com.bxkj.student.life.info.InfoDetailActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context l0(com.bxkj.student.life.info.InfoDetailActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context m0(com.bxkj.student.life.info.InfoDetailActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context n0(com.bxkj.student.life.info.InfoDetailActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context o0(com.bxkj.student.life.info.InfoDetailActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context p0(com.bxkj.student.life.info.InfoDetailActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void q0(android.view.View r4) {
            r3 = this;
            android.view.ViewPropertyAnimator r0 = r4.animate()
            r0.cancel()
            android.view.ViewPropertyAnimator r0 = r4.animate()
            r1 = 0
            android.view.ViewPropertyAnimator r0 = r0.scaleX(r1)
            android.view.ViewPropertyAnimator r0 = r0.scaleY(r1)
            android.view.ViewPropertyAnimator r0 = r0.alpha(r1)
            r1 = 200(0xc8, double:9.9E-322)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r1)
            androidx.interpolator.view.animation.FastOutLinearInInterpolator r1 = new androidx.interpolator.view.animation.FastOutLinearInInterpolator
            r1.<init>()
            android.view.ViewPropertyAnimator r0 = r0.setInterpolator(r1)
            com.bxkj.student.life.info.InfoDetailActivity$a r1 = new com.bxkj.student.life.info.InfoDetailActivity$a
            r1.<init>(r3, r4)
            r0.setListener(r1)
            return
    }

    private void s0() {
            r3 = this;
            android.content.Context r0 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<w.c> r1 = w.c.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            w.c r1 = (w.c) r1
            java.lang.String r2 = r3.Y
            rx.e r1 = r1.e(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.life.info.InfoDetailActivity$b r1 = new com.bxkj.student.life.info.InfoDetailActivity$b
            r1.<init>(r3)
            r0.setDataListener(r1)
            return
    }

    private void t0() {
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
            com.bxkj.student.life.info.InfoDetailActivity$c r1 = new com.bxkj.student.life.info.InfoDetailActivity$c
            r1.<init>(r4)
            com.umeng.socialize.ShareAction r0 = r0.setShareboardclickCallback(r1)
            r0.open()
            return
    }

    private void u0(com.umeng.socialize.bean.SHARE_MEDIA r5) {
            r4 = this;
            cn.bluemobi.dylan.smartwebview.SmartWebView r0 = r4.c0
            java.lang.Object r0 = r0.getTag()
            java.lang.String r0 = r0.toString()
            com.umeng.socialize.media.UMWeb r1 = new com.umeng.socialize.media.UMWeb
            r1.<init>(r0)
            java.lang.String r0 = r4.Z
            r1.setTitle(r0)
            java.lang.String r0 = r4.I0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L20
            java.lang.String r0 = "http://m.boxkj.com/resources/wechat/images/xiaowei.png"
            r4.I0 = r0
        L20:
            com.umeng.socialize.media.UMImage r0 = new com.umeng.socialize.media.UMImage
            android.content.Context r2 = r4.V
            java.lang.String r3 = r4.I0
            r0.<init>(r2, r3)
            r1.setThumb(r0)
            java.lang.String r0 = "校园生活如此简单"
            r1.setDescription(r0)
            com.umeng.socialize.ShareAction r0 = new com.umeng.socialize.ShareAction
            r0.<init>(r4)
            com.umeng.socialize.ShareAction r5 = r0.setPlatform(r5)
            com.bxkj.student.life.info.InfoDetailActivity$d r0 = new com.bxkj.student.life.info.InfoDetailActivity$d
            r0.<init>(r4)
            com.umeng.socialize.ShareAction r5 = r5.setCallback(r0)
            com.umeng.socialize.ShareAction r5 = r5.withMedia(r1)
            r5.share()
            return
    }

    public void L() {
            r1 = this;
            android.widget.LinearLayout r0 = r1.f989k0
            r0.setOnClickListener(r1)
            android.widget.LinearLayout r0 = r1.f990p0
            r0.setOnClickListener(r1)
            android.widget.LinearLayout r0 = r1.F0
            r0.setOnClickListener(r1)
            android.widget.LinearLayout r0 = r1.G0
            r0.setOnClickListener(r1)
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r1.b0
            r0.setOnClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492950(0x7f0c0056, float:1.8609366E38)
            return r0
    }

    public void R() {
            r2 = this;
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r1 = "infoId"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L16
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r2.Y = r0
        L16:
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r1 = "imageUrl"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L2c
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r2.I0 = r0
        L2c:
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r1 = "inforTitle"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L42
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r2.Z = r0
        L42:
            r2.s0()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "资讯详情"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r2) {
            r1 = this;
            r2 = 2131298609(0x7f090931, float:1.8215196E38)
            android.view.View r2 = r1.findViewById(r2)
            cn.bluemobi.dylan.smartwebview.SmartWebView r2 = (cn.bluemobi.dylan.smartwebview.SmartWebView) r2
            r1.c0 = r2
            r2 = 2131296747(0x7f0901eb, float:1.821142E38)
            android.view.View r2 = r1.findViewById(r2)
            androidx.coordinatorlayout.widget.CoordinatorLayout r2 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r2
            r1.a0 = r2
            r2 = 2131298085(0x7f090725, float:1.8214133E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r1.f989k0 = r2
            r2 = 2131298053(0x7f090705, float:1.8214068E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r1.f990p0 = r2
            r2 = 2131298063(0x7f09070f, float:1.8214089E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r1.F0 = r2
            r2 = 2131298066(0x7f090712, float:1.8214095E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r1.G0 = r2
            r2 = 2131296971(0x7f0902cb, float:1.8211874E38)
            android.view.View r2 = r1.findViewById(r2)
            com.google.android.material.floatingactionbutton.FloatingActionButton r2 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r2
            r1.b0 = r2
            androidx.coordinatorlayout.widget.CoordinatorLayout r2 = r1.a0
            r0 = 8
            r2.setVisibility(r0)
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            int r1 = r1.getId()
            switch(r1) {
                case 2131296971: goto L20;
                case 2131298053: goto L1a;
                case 2131298063: goto L14;
                case 2131298066: goto Le;
                case 2131298085: goto L8;
                default: goto L7;
            }
        L7:
            return
        L8:
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN
            r0.u0(r1)
            return
        Le:
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.QZONE
            r0.u0(r1)
            return
        L14:
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.QQ
            r0.u0(r1)
            return
        L1a:
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN_CIRCLE
            r0.u0(r1)
            return
        L20:
            com.google.android.material.floatingactionbutton.FloatingActionButton r1 = r0.b0
            r0.q0(r1)
            return
    }

    protected void onDestroy() {
            r2 = this;
            cn.bluemobi.dylan.smartwebview.SmartWebView r0 = r2.c0
            if (r0 == 0) goto L3a
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L11
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            cn.bluemobi.dylan.smartwebview.SmartWebView r1 = r2.c0
            r0.removeView(r1)
        L11:
            cn.bluemobi.dylan.smartwebview.SmartWebView r0 = r2.c0     // Catch: java.lang.Throwable -> L3a
            android.webkit.WebView r0 = r0.getWebView()     // Catch: java.lang.Throwable -> L3a
            r0.stopLoading()     // Catch: java.lang.Throwable -> L3a
            cn.bluemobi.dylan.smartwebview.SmartWebView r0 = r2.c0     // Catch: java.lang.Throwable -> L3a
            android.webkit.WebView r0 = r0.getWebView()     // Catch: java.lang.Throwable -> L3a
            r0.clearHistory()     // Catch: java.lang.Throwable -> L3a
            cn.bluemobi.dylan.smartwebview.SmartWebView r0 = r2.c0     // Catch: java.lang.Throwable -> L3a
            android.webkit.WebView r0 = r0.getWebView()     // Catch: java.lang.Throwable -> L3a
            r0.clearView()     // Catch: java.lang.Throwable -> L3a
            cn.bluemobi.dylan.smartwebview.SmartWebView r0 = r2.c0     // Catch: java.lang.Throwable -> L3a
            r0.removeAllViews()     // Catch: java.lang.Throwable -> L3a
            cn.bluemobi.dylan.smartwebview.SmartWebView r0 = r2.c0     // Catch: java.lang.Throwable -> L3a
            android.webkit.WebView r0 = r0.getWebView()     // Catch: java.lang.Throwable -> L3a
            r0.destroy()     // Catch: java.lang.Throwable -> L3a
        L3a:
            super.onDestroy()
            return
    }

    public java.lang.String r0(java.lang.String r6) {
            r5 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "<[\\s]*?script[^>]*?>[\\s\\S]*?<[\\s]*?\\/[\\s]*?script[\\s]*?>"
            java.lang.String r2 = "<[\\s]*?style[^>]*?>[\\s\\S]*?<[\\s]*?\\/[\\s]*?style[\\s]*?>"
            java.lang.String r3 = "<[^>]+>"
            r4 = 2
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1, r4)     // Catch: java.lang.Exception -> L2e
            java.util.regex.Matcher r6 = r1.matcher(r6)     // Catch: java.lang.Exception -> L2e
            java.lang.String r6 = r6.replaceAll(r0)     // Catch: java.lang.Exception -> L2e
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r2, r4)     // Catch: java.lang.Exception -> L2e
            java.util.regex.Matcher r6 = r1.matcher(r6)     // Catch: java.lang.Exception -> L2e
            java.lang.String r6 = r6.replaceAll(r0)     // Catch: java.lang.Exception -> L2e
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r3, r4)     // Catch: java.lang.Exception -> L2e
            java.util.regex.Matcher r6 = r1.matcher(r6)     // Catch: java.lang.Exception -> L2e
            java.lang.String r6 = r6.replaceAll(r0)     // Catch: java.lang.Exception -> L2e
            goto L38
        L2e:
            r6 = move-exception
            java.io.PrintStream r1 = java.lang.System.err
            r6.getMessage()
            r1.getClass()
            r6 = r0
        L38:
            java.lang.String r1 = "[ ]+"
            java.lang.String r2 = " "
            java.lang.String r6 = r6.replaceAll(r1, r2)
            java.lang.String r1 = "(?m)^\\s*$(\\n|\\r\\n)"
            java.lang.String r6 = r6.replaceAll(r1, r0)
            return r6
    }
}
