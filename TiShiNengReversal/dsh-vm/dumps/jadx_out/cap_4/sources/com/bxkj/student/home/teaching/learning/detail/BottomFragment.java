package com.bxkj.student.home.teaching.learning.detail;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class BottomFragment extends cn.bluemobi.dylan.base.BaseFragment {
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private com.bxkj.student.home.teaching.learning.detail.k G;
    private android.widget.Button j;
    private android.widget.LinearLayout k;

    /* renamed from: l, reason: collision with root package name */
    private android.widget.TextView f870l;

    /* renamed from: m, reason: collision with root package name */
    private android.widget.TextView f871m;

    /* renamed from: n, reason: collision with root package name */
    private android.widget.TextView f872n;

    /* renamed from: o, reason: collision with root package name */
    private android.widget.TextView f873o;

    /* renamed from: p, reason: collision with root package name */
    private android.widget.TextView f874p;

    /* renamed from: q, reason: collision with root package name */
    private android.widget.TextView f875q;

    /* renamed from: r, reason: collision with root package name */
    private com.umeng.socialize.media.BaseMediaObject f876r;

    /* renamed from: s, reason: collision with root package name */
    private com.umeng.socialize.ShareAction f877s;

    /* renamed from: t, reason: collision with root package name */
    private com.umeng.socialize.UMShareListener f878t;

    /* renamed from: u, reason: collision with root package name */
    private java.lang.String f879u;

    /* renamed from: v, reason: collision with root package name */
    private java.lang.String f880v;

    /* renamed from: w, reason: collision with root package name */
    private int f881w;

    /* renamed from: x, reason: collision with root package name */
    private int f882x;

    /* renamed from: y, reason: collision with root package name */
    private int f883y;

    /* renamed from: z, reason: collision with root package name */
    private int f884z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements com.umeng.socialize.UMShareListener {
        final /* synthetic */ com.bxkj.student.home.teaching.learning.detail.BottomFragment a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bxkj.student.home.teaching.learning.detail.BottomFragment$a$a, reason: collision with other inner class name */
        class C0090a extends cn.bluemobi.dylan.http.HttpCallBack {
            final /* synthetic */ com.bxkj.student.home.teaching.learning.detail.BottomFragment.a a;

            C0090a(com.bxkj.student.home.teaching.learning.detail.BottomFragment.a r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r1) {
                    r0 = this;
                    return
            }
        }

        a(com.bxkj.student.home.teaching.learning.detail.BottomFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void onCancel(com.umeng.socialize.bean.SHARE_MEDIA r3) {
                r2 = this;
                com.bxkj.student.home.teaching.learning.detail.BottomFragment r3 = r2.a
                android.content.Context r3 = com.bxkj.student.home.teaching.learning.detail.BottomFragment.f0(r3)
                java.lang.String r0 = " 分享取消了"
                r1 = 0
                android.widget.Toast r3 = android.widget.Toast.makeText(r3, r0, r1)
                r3.show()
                return
        }

        public void onError(com.umeng.socialize.bean.SHARE_MEDIA r3, java.lang.Throwable r4) {
                r2 = this;
                r4.getClass()
                com.bxkj.student.home.teaching.learning.detail.BottomFragment r3 = r2.a
                android.content.Context r3 = com.bxkj.student.home.teaching.learning.detail.BottomFragment.e0(r3)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = " 分享失败啦,"
                r0.append(r1)
                java.lang.String r4 = r4.getMessage()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r0 = 0
                android.widget.Toast r3 = android.widget.Toast.makeText(r3, r4, r0)
                r3.show()
                return
        }

        public void onResult(com.umeng.socialize.bean.SHARE_MEDIA r5) {
                r4 = this;
                com.bxkj.student.home.teaching.learning.detail.BottomFragment r5 = r4.a
                android.content.Context r5 = com.bxkj.student.home.teaching.learning.detail.BottomFragment.c0(r5)
                cn.bluemobi.dylan.http.HttpRequest r5 = cn.bluemobi.dylan.http.Http.with(r5)
                java.lang.Class<com.bxkj.student.home.teaching.learning.m> r0 = com.bxkj.student.home.teaching.learning.m.class
                java.lang.Object r0 = cn.bluemobi.dylan.http.Http.getApiService(r0)
                com.bxkj.student.home.teaching.learning.m r0 = (com.bxkj.student.home.teaching.learning.m) r0
                com.bxkj.student.home.teaching.learning.detail.BottomFragment r1 = r4.a
                java.lang.String r1 = com.bxkj.student.home.teaching.learning.detail.BottomFragment.V(r1)
                java.lang.String r2 = "3"
                r3 = 1
                rx.e r0 = r0.v(r1, r2, r3)
                cn.bluemobi.dylan.http.HttpRequest r5 = r5.setObservable(r0)
                com.bxkj.student.home.teaching.learning.detail.BottomFragment$a$a r0 = new com.bxkj.student.home.teaching.learning.detail.BottomFragment$a$a
                r0.<init>(r4)
                r5.setDataListener(r0)
                com.bxkj.student.home.teaching.learning.detail.BottomFragment r5 = r4.a
                android.content.Context r5 = com.bxkj.student.home.teaching.learning.detail.BottomFragment.d0(r5)
                java.lang.String r0 = " 分享成功啦"
                r1 = 0
                android.widget.Toast r5 = android.widget.Toast.makeText(r5, r0, r1)
                r5.show()
                return
        }

        public void onStart(com.umeng.socialize.bean.SHARE_MEDIA r1) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.learning.detail.BottomFragment a;

        b(com.bxkj.student.home.teaching.learning.detail.BottomFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r2) {
                r1 = this;
                com.bxkj.student.home.teaching.learning.detail.BottomFragment r2 = r1.a
                int r0 = com.bxkj.student.home.teaching.learning.detail.BottomFragment.X(r2)
                if (r0 != 0) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                com.bxkj.student.home.teaching.learning.detail.BottomFragment.Z(r2, r0)
                com.bxkj.student.home.teaching.learning.detail.BottomFragment r2 = r1.a
                com.bxkj.student.home.teaching.learning.detail.BottomFragment.b0(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.learning.detail.BottomFragment a;

        c(com.bxkj.student.home.teaching.learning.detail.BottomFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r2) {
                r1 = this;
                com.bxkj.student.home.teaching.learning.detail.BottomFragment r2 = r1.a
                int r0 = com.bxkj.student.home.teaching.learning.detail.BottomFragment.W(r2)
                if (r0 != 0) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                com.bxkj.student.home.teaching.learning.detail.BottomFragment.Y(r2, r0)
                com.bxkj.student.home.teaching.learning.detail.BottomFragment r2 = r1.a
                com.bxkj.student.home.teaching.learning.detail.BottomFragment.a0(r2)
                return
        }
    }

    public BottomFragment() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void N(com.bxkj.student.home.teaching.learning.detail.BottomFragment r0, android.view.View r1) {
            r0.j0(r1)
            return
    }

    public static /* synthetic */ void O(com.bxkj.student.home.teaching.learning.detail.BottomFragment r0, android.view.View r1) {
            r0.l0(r1)
            return
    }

    public static /* synthetic */ kotlin.n1 P(com.bxkj.student.home.teaching.learning.detail.BottomFragment r0, android.content.Intent r1, int r2) {
            kotlin.n1 r0 = r0.n0(r1, r2)
            return r0
    }

    public static /* synthetic */ void Q(com.bxkj.student.home.teaching.learning.detail.BottomFragment r0, android.view.View r1) {
            r0.k0(r1)
            return
    }

    public static /* synthetic */ void R(com.bxkj.student.home.teaching.learning.detail.BottomFragment r0, android.view.View r1) {
            r0.m0(r1)
            return
    }

    public static /* synthetic */ void S(com.bxkj.student.home.teaching.learning.detail.BottomFragment r0, android.view.View r1) {
            r0.g0(r1)
            return
    }

    public static /* synthetic */ void T(com.bxkj.student.home.teaching.learning.detail.BottomFragment r0, android.view.View r1) {
            r0.h0(r1)
            return
    }

    public static /* synthetic */ void U(com.bxkj.student.home.teaching.learning.detail.BottomFragment r0, android.view.View r1) {
            r0.i0(r1)
            return
    }

    static /* bridge */ /* synthetic */ java.lang.String V(com.bxkj.student.home.teaching.learning.detail.BottomFragment r0) {
            java.lang.String r0 = r0.f880v
            return r0
    }

    static /* bridge */ /* synthetic */ int W(com.bxkj.student.home.teaching.learning.detail.BottomFragment r0) {
            int r0 = r0.f882x
            return r0
    }

    static /* bridge */ /* synthetic */ int X(com.bxkj.student.home.teaching.learning.detail.BottomFragment r0) {
            int r0 = r0.f881w
            return r0
    }

    static /* bridge */ /* synthetic */ void Y(com.bxkj.student.home.teaching.learning.detail.BottomFragment r0, int r1) {
            r0.f882x = r1
            return
    }

    static /* bridge */ /* synthetic */ void Z(com.bxkj.student.home.teaching.learning.detail.BottomFragment r0, int r1) {
            r0.f881w = r1
            return
    }

    static /* bridge */ /* synthetic */ void a0(com.bxkj.student.home.teaching.learning.detail.BottomFragment r0) {
            r0.o0()
            return
    }

    static /* bridge */ /* synthetic */ void b0(com.bxkj.student.home.teaching.learning.detail.BottomFragment r0) {
            r0.t0()
            return
    }

    static /* synthetic */ android.content.Context c0(com.bxkj.student.home.teaching.learning.detail.BottomFragment r0) {
            android.content.Context r0 = r0.g
            return r0
    }

    static /* synthetic */ android.content.Context d0(com.bxkj.student.home.teaching.learning.detail.BottomFragment r0) {
            android.content.Context r0 = r0.g
            return r0
    }

    static /* synthetic */ android.content.Context e0(com.bxkj.student.home.teaching.learning.detail.BottomFragment r0) {
            android.content.Context r0 = r0.g
            return r0
    }

    static /* synthetic */ android.content.Context f0(com.bxkj.student.home.teaching.learning.detail.BottomFragment r0) {
            android.content.Context r0 = r0.g
            return r0
    }

    private /* synthetic */ void g0(android.view.View r1) {
            r0 = this;
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN
            r0.w0(r1)
            return
    }

    private /* synthetic */ void h0(android.view.View r1) {
            r0 = this;
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN_CIRCLE
            r0.w0(r1)
            return
    }

    private /* synthetic */ void i0(android.view.View r1) {
            r0 = this;
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.QQ
            r0.w0(r1)
            return
    }

    private /* synthetic */ void j0(android.view.View r1) {
            r0 = this;
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.QZONE
            r0.w0(r1)
            return
    }

    private /* synthetic */ void k0(android.view.View r5) {
            r4 = this;
            android.content.Context r5 = r4.g
            cn.bluemobi.dylan.http.HttpRequest r5 = cn.bluemobi.dylan.http.Http.with(r5)
            java.lang.Class<com.bxkj.student.home.teaching.learning.m> r0 = com.bxkj.student.home.teaching.learning.m.class
            java.lang.Object r0 = cn.bluemobi.dylan.http.Http.getApiService(r0)
            com.bxkj.student.home.teaching.learning.m r0 = (com.bxkj.student.home.teaching.learning.m) r0
            java.lang.String r1 = r4.f880v
            int r2 = r4.f881w
            if (r2 != 0) goto L16
            r2 = 1
            goto L17
        L16:
            r2 = 0
        L17:
            java.lang.String r3 = "1"
            rx.e r0 = r0.v(r1, r3, r2)
            cn.bluemobi.dylan.http.HttpRequest r5 = r5.setObservable(r0)
            com.bxkj.student.home.teaching.learning.detail.BottomFragment$b r0 = new com.bxkj.student.home.teaching.learning.detail.BottomFragment$b
            r0.<init>(r4)
            r5.setDataListener(r0)
            return
    }

    private /* synthetic */ void l0(android.view.View r5) {
            r4 = this;
            android.content.Context r5 = r4.g
            cn.bluemobi.dylan.http.HttpRequest r5 = cn.bluemobi.dylan.http.Http.with(r5)
            java.lang.Class<com.bxkj.student.home.teaching.learning.m> r0 = com.bxkj.student.home.teaching.learning.m.class
            java.lang.Object r0 = cn.bluemobi.dylan.http.Http.getApiService(r0)
            com.bxkj.student.home.teaching.learning.m r0 = (com.bxkj.student.home.teaching.learning.m) r0
            java.lang.String r1 = r4.f880v
            int r2 = r4.f882x
            if (r2 != 0) goto L16
            r2 = 1
            goto L17
        L16:
            r2 = 0
        L17:
            java.lang.String r3 = "2"
            rx.e r0 = r0.v(r1, r3, r2)
            cn.bluemobi.dylan.http.HttpRequest r5 = r5.setObservable(r0)
            com.bxkj.student.home.teaching.learning.detail.BottomFragment$c r0 = new com.bxkj.student.home.teaching.learning.detail.BottomFragment$c
            r0.<init>(r4)
            r5.setDataListener(r0)
            return
    }

    private /* synthetic */ void m0(android.view.View r3) {
            r2 = this;
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r0 = r2.g
            java.lang.Class<com.bxkj.student.home.teaching.learning.question.list.QuestionListActivity> r1 = com.bxkj.student.home.teaching.learning.question.list.QuestionListActivity.class
            r3.<init>(r0, r1)
            java.lang.String r0 = "type"
            r1 = 1
            android.content.Intent r3 = r3.putExtra(r0, r1)
            java.lang.String r0 = "resourceId"
            java.lang.String r1 = r2.f879u
            android.content.Intent r3 = r3.putExtra(r0, r1)
            r2.startActivity(r3)
            return
    }

    private /* synthetic */ kotlin.n1 n0(android.content.Intent r3, int r4) {
            r2 = this;
            android.content.Context r0 = r2.g
            java.lang.Class<com.bxkj.student.home.teaching.exam.FaceDetectExamActivity> r1 = com.bxkj.student.home.teaching.exam.FaceDetectExamActivity.class
            android.content.Intent r3 = r3.setClass(r0, r1)
            r2.startActivityForResult(r3, r4)
            android.app.Activity r3 = r2.h
            r4 = 2130771987(0x7f010013, float:1.714708E38)
            r0 = 2130771986(0x7f010012, float:1.7147078E38)
            r3.overridePendingTransition(r4, r0)
            r3 = 0
            return r3
    }

    private void o0() {
            r2 = this;
            int r0 = r2.f882x
            r1 = 1
            if (r0 != r1) goto L9
            r2.p0()
            return
        L9:
            r2.q0()
            return
    }

    private void p0() {
            r4 = this;
            android.content.res.Resources r0 = r4.getResources()
            r1 = 2131689650(0x7f0f00b2, float:1.9008321E38)
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)
            android.content.Context r1 = r4.g
            r2 = 1101529088(0x41a80000, float:21.0)
            int r1 = cn.bluemobi.dylan.base.utils.u.a(r2, r1)
            android.content.Context r3 = r4.g
            int r2 = cn.bluemobi.dylan.base.utils.u.a(r2, r3)
            r3 = 0
            r0.setBounds(r3, r3, r1, r2)
            android.widget.TextView r1 = r4.f871m
            r2 = 0
            r1.setCompoundDrawables(r2, r0, r2, r2)
            android.widget.TextView r0 = r4.f871m
            java.lang.String r1 = "已收藏"
            r0.setText(r1)
            return
    }

    private void q0() {
            r4 = this;
            android.content.res.Resources r0 = r4.getResources()
            r1 = 2131689611(0x7f0f008b, float:1.9008242E38)
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)
            android.content.Context r1 = r4.g
            r2 = 1101529088(0x41a80000, float:21.0)
            int r1 = cn.bluemobi.dylan.base.utils.u.a(r2, r1)
            android.content.Context r3 = r4.g
            int r2 = cn.bluemobi.dylan.base.utils.u.a(r2, r3)
            r3 = 0
            r0.setBounds(r3, r3, r1, r2)
            android.widget.TextView r1 = r4.f871m
            r2 = 0
            r1.setCompoundDrawables(r2, r0, r2, r2)
            android.widget.TextView r0 = r4.f871m
            java.lang.String r1 = "收藏"
            r0.setText(r1)
            return
    }

    private void r0() {
            r4 = this;
            android.content.res.Resources r0 = r4.getResources()
            r1 = 2131690268(0x7f0f031c, float:1.9009575E38)
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)
            android.content.Context r1 = r4.g
            r2 = 1101529088(0x41a80000, float:21.0)
            int r1 = cn.bluemobi.dylan.base.utils.u.a(r2, r1)
            android.content.Context r3 = r4.g
            int r2 = cn.bluemobi.dylan.base.utils.u.a(r2, r3)
            r3 = 0
            r0.setBounds(r3, r3, r1, r2)
            android.widget.TextView r1 = r4.f870l
            r2 = 0
            r1.setCompoundDrawables(r2, r0, r2, r2)
            android.widget.TextView r0 = r4.f870l
            java.lang.String r1 = "已点赞"
            r0.setText(r1)
            return
    }

    private void s0() {
            r4 = this;
            android.content.res.Resources r0 = r4.getResources()
            r1 = 2131690269(0x7f0f031d, float:1.9009577E38)
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)
            android.content.Context r1 = r4.g
            r2 = 1101529088(0x41a80000, float:21.0)
            int r1 = cn.bluemobi.dylan.base.utils.u.a(r2, r1)
            android.content.Context r3 = r4.g
            int r2 = cn.bluemobi.dylan.base.utils.u.a(r2, r3)
            r3 = 0
            r0.setBounds(r3, r3, r1, r2)
            android.widget.TextView r1 = r4.f870l
            r2 = 0
            r1.setCompoundDrawables(r2, r0, r2, r2)
            android.widget.TextView r0 = r4.f870l
            java.lang.String r1 = "点赞"
            r0.setText(r1)
            return
    }

    private void t0() {
            r2 = this;
            int r0 = r2.f881w
            r1 = 1
            if (r0 != r1) goto L9
            r2.r0()
            return
        L9:
            r2.s0()
            return
    }

    private void w0(com.umeng.socialize.bean.SHARE_MEDIA r2) {
            r1 = this;
            com.umeng.socialize.ShareAction r0 = r1.f877s
            r0.setPlatform(r2)
            com.umeng.socialize.ShareAction r2 = r1.f877s
            com.umeng.socialize.UMShareListener r0 = r1.f878t
            r2.setCallback(r0)
            com.umeng.socialize.media.BaseMediaObject r2 = r1.f876r
            boolean r0 = r2 instanceof com.umeng.socialize.media.UMVideo
            if (r0 == 0) goto L1a
            com.umeng.socialize.media.UMVideo r2 = (com.umeng.socialize.media.UMVideo) r2
            com.umeng.socialize.ShareAction r0 = r1.f877s
            r0.withMedia(r2)
            goto L25
        L1a:
            boolean r0 = r2 instanceof com.umeng.socialize.media.UMWeb
            if (r0 == 0) goto L25
            com.umeng.socialize.media.UMWeb r2 = (com.umeng.socialize.media.UMWeb) r2
            com.umeng.socialize.ShareAction r0 = r1.f877s
            r0.withMedia(r2)
        L25:
            com.umeng.socialize.ShareAction r2 = r1.f877s
            r2.share()
            return
    }

    public void b() {
            r2 = this;
            com.bxkj.student.home.teaching.learning.detail.BottomFragment$a r0 = new com.bxkj.student.home.teaching.learning.detail.BottomFragment$a
            r0.<init>(r2)
            r2.f878t = r0
            android.widget.TextView r0 = r2.f872n
            com.bxkj.student.home.teaching.learning.detail.o r1 = new com.bxkj.student.home.teaching.learning.detail.o
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            android.widget.TextView r0 = r2.f873o
            com.bxkj.student.home.teaching.learning.detail.p r1 = new com.bxkj.student.home.teaching.learning.detail.p
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            android.widget.TextView r0 = r2.f874p
            com.bxkj.student.home.teaching.learning.detail.q r1 = new com.bxkj.student.home.teaching.learning.detail.q
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            android.widget.TextView r0 = r2.f875q
            com.bxkj.student.home.teaching.learning.detail.r r1 = new com.bxkj.student.home.teaching.learning.detail.r
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            android.widget.TextView r0 = r2.f870l
            com.bxkj.student.home.teaching.learning.detail.s r1 = new com.bxkj.student.home.teaching.learning.detail.s
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            android.widget.TextView r0 = r2.f871m
            com.bxkj.student.home.teaching.learning.detail.t r1 = new com.bxkj.student.home.teaching.learning.detail.t
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            android.widget.Button r0 = r2.j
            com.bxkj.student.home.teaching.learning.detail.u r1 = new com.bxkj.student.home.teaching.learning.detail.u
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            return
    }

    protected void e() {
            r14 = this;
            android.os.Bundle r0 = r14.getArguments()
            java.lang.String r2 = "id"
            boolean r3 = r0.containsKey(r2)
            if (r3 == 0) goto L12
            java.lang.String r2 = r0.getString(r2)
            r14.f879u = r2
        L12:
            java.lang.String r2 = "detailId"
            boolean r3 = r0.containsKey(r2)
            if (r3 == 0) goto L20
            java.lang.String r2 = r0.getString(r2)
            r14.f880v = r2
        L20:
            java.lang.String r2 = "isLike"
            boolean r3 = r0.containsKey(r2)
            r11 = 0
            if (r3 == 0) goto L2f
            int r2 = r0.getInt(r2, r11)
            r14.f881w = r2
        L2f:
            java.lang.String r2 = "isCollection"
            boolean r3 = r0.containsKey(r2)
            if (r3 == 0) goto L3d
            int r2 = r0.getInt(r2, r11)
            r14.f882x = r2
        L3d:
            java.lang.String r2 = "duration"
            boolean r3 = r0.containsKey(r2)
            if (r3 == 0) goto L4b
            int r2 = r0.getInt(r2, r11)
            r14.f883y = r2
        L4b:
            java.lang.String r2 = "popTime"
            boolean r3 = r0.containsKey(r2)
            if (r3 == 0) goto L59
            int r2 = r0.getInt(r2, r11)
            r14.f884z = r2
        L59:
            java.lang.String r2 = "hasQuestion"
            boolean r3 = r0.containsKey(r2)
            if (r3 == 0) goto L67
            int r2 = r0.getInt(r2, r11)
            r14.A = r2
        L67:
            java.lang.String r2 = "isComplete"
            boolean r3 = r0.containsKey(r2)
            if (r3 == 0) goto L75
            int r2 = r0.getInt(r2, r11)
            r14.B = r2
        L75:
            java.lang.String r2 = "isOk"
            boolean r3 = r0.containsKey(r2)
            if (r3 == 0) goto L83
            int r2 = r0.getInt(r2, r11)
            r14.C = r2
        L83:
            java.lang.String r2 = "opreateFlag"
            boolean r3 = r0.containsKey(r2)
            if (r3 == 0) goto L91
            int r2 = r0.getInt(r2, r11)
            r14.D = r2
        L91:
            java.lang.String r2 = "valType"
            boolean r3 = r0.containsKey(r2)
            r12 = 1
            if (r3 == 0) goto La0
            int r2 = r0.getInt(r2, r12)
            r14.E = r2
        La0:
            java.lang.String r2 = "integral"
            boolean r3 = r0.containsKey(r2)
            if (r3 == 0) goto Lae
            int r0 = r0.getInt(r2, r12)
            r14.F = r0
        Lae:
            r14.t0()
            r14.o0()
            com.umeng.socialize.ShareAction r0 = new com.umeng.socialize.ShareAction
            androidx.fragment.app.FragmentActivity r2 = r14.getActivity()
            r0.<init>(r2)
            r14.f877s = r0
            int r0 = r14.D
            r13 = 8
            if (r0 != 0) goto Lfd
            com.bxkj.student.home.teaching.learning.detail.k r0 = new com.bxkj.student.home.teaching.learning.detail.k
            android.content.Context r2 = r14.g
            int r3 = r14.f883y
            int r4 = r14.f884z
            java.lang.String r5 = r14.f879u
            java.lang.String r6 = r14.f880v
            android.widget.Button r7 = r14.j
            int r8 = r14.A
            int r9 = r14.E
            int r10 = r14.F
            r1 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14.G = r0
            int r0 = r14.f883y
            if (r0 != 0) goto Le9
            android.widget.Button r0 = r14.j
            r0.setVisibility(r13)
            goto Lf7
        Le9:
            androidx.fragment.app.FragmentActivity r0 = r14.getActivity()
            com.bxkj.student.home.teaching.learning.detail.LearnDetailActivity r0 = (com.bxkj.student.home.teaching.learning.detail.LearnDetailActivity) r0
            r0.u0(r12)
            com.bxkj.student.home.teaching.learning.detail.k r0 = r14.G
            r0.S()
        Lf7:
            android.widget.Button r0 = r14.j
            r0.setEnabled(r11)
            return
        Lfd:
            if (r0 != r12) goto L10c
            android.widget.Button r0 = r14.j
            java.lang.String r2 = "已完成"
            r0.setText(r2)
            android.widget.Button r0 = r14.j
            r0.setEnabled(r11)
            return
        L10c:
            r2 = 2
            if (r0 != r2) goto L11c
            android.widget.Button r0 = r14.j
            java.lang.String r2 = "开始答题"
            r0.setText(r2)
            android.widget.Button r0 = r14.j
            r0.setEnabled(r12)
            return
        L11c:
            r2 = 3
            if (r0 != r2) goto L12c
            android.widget.Button r0 = r14.j
            java.lang.String r2 = "查看答题"
            r0.setText(r2)
            android.widget.Button r0 = r14.j
            r0.setEnabled(r12)
            return
        L12c:
            android.widget.Button r0 = r14.j
            r0.setVisibility(r13)
            android.widget.Button r0 = r14.j
            r0.setEnabled(r11)
            return
    }

    protected void f(android.view.View r1) {
            r0 = this;
            r1 = 2131296633(0x7f090179, float:1.8211188E38)
            android.view.View r1 = r0.c(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r0.j = r1
            r1 = 2131298015(0x7f0906df, float:1.8213991E38)
            android.view.View r1 = r0.c(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.k = r1
            r1 = 2131299214(0x7f090b8e, float:1.8216423E38)
            android.view.View r1 = r0.c(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f870l = r1
            r1 = 2131298841(0x7f090a19, float:1.8215667E38)
            android.view.View r1 = r0.c(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f871m = r1
            r1 = 2131299188(0x7f090b74, float:1.821637E38)
            android.view.View r1 = r0.c(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f872n = r1
            r1 = 2131298979(0x7f090aa3, float:1.8215946E38)
            android.view.View r1 = r0.c(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f873o = r1
            r1 = 2131299055(0x7f090aef, float:1.82161E38)
            android.view.View r1 = r0.c(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f874p = r1
            r1 = 2131299061(0x7f090af5, float:1.8216113E38)
            android.view.View r1 = r0.c(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f875q = r1
            return
    }

    protected int i() {
            r1 = this;
            r0 = 2131493180(0x7f0c013c, float:1.8609833E38)
            return r0
    }

    public void onActivityResult(int r3, int r4, android.content.Intent r5) {
            r2 = this;
            super/*androidx.fragment.app.Fragment*/.onActivityResult(r3, r4, r5)
            r0 = 170(0xaa, float:2.38E-43)
            if (r3 != r0) goto L23
            r1 = 187(0xbb, float:2.62E-43)
            if (r4 != r1) goto L23
            com.bxkj.student.home.teaching.learning.detail.k r3 = r2.G
            if (r3 == 0) goto L12
            r3.D()
        L12:
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r4 = r2.g
            r3.<init>(r4)
            java.lang.String r4 = "人脸识别成功，请继续学习"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r3.setMessage(r4)
            r3.show()
            return
        L23:
            if (r3 != r0) goto L35
            if (r4 != r0) goto L35
            android.content.Context r4 = r2.g
            androidx.fragment.app.FragmentActivity r4 = (androidx.fragment.app.FragmentActivity) r4
            com.bxkj.student.home.teaching.learning.detail.n r0 = new com.bxkj.student.home.teaching.learning.detail.n
            r0.<init>(r2, r5, r3)
            java.lang.String r3 = "人脸识别"
            com.bxkj.base.v2.common.ext.t.p(r4, r3, r0)
        L35:
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }

    public void onDestroy() {
            r1 = this;
            com.bxkj.student.home.teaching.learning.detail.k r0 = r1.G
            if (r0 == 0) goto L7
            r0.T()
        L7:
            com.bxkj.student.home.teaching.learning.detail.k r0 = r1.G
            if (r0 == 0) goto Le
            r0.P()
        Le:
            super/*androidx.fragment.app.Fragment*/.onDestroy()
            return
    }

    public void u0(boolean r2) {
            r1 = this;
            com.bxkj.student.home.teaching.learning.detail.k r0 = r1.G
            if (r0 == 0) goto L7
            r0.Q(r2)
        L7:
            return
    }

    public void v0(com.umeng.socialize.media.BaseMediaObject r1) {
            r0 = this;
            r0.f876r = r1
            return
    }
}
