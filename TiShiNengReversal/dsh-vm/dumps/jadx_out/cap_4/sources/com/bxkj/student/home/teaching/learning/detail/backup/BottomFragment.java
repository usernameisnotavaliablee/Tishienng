package com.bxkj.student.home.teaching.learning.detail.backup;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class BottomFragment extends cn.bluemobi.dylan.base.BaseFragment {
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private com.bxkj.student.home.teaching.learning.detail.backup.j F;
    private android.widget.Button j;
    private android.widget.LinearLayout k;

    /* renamed from: l, reason: collision with root package name */
    private android.widget.TextView f887l;

    /* renamed from: m, reason: collision with root package name */
    private android.widget.TextView f888m;

    /* renamed from: n, reason: collision with root package name */
    private android.widget.TextView f889n;

    /* renamed from: o, reason: collision with root package name */
    private android.widget.TextView f890o;

    /* renamed from: p, reason: collision with root package name */
    private android.widget.TextView f891p;

    /* renamed from: q, reason: collision with root package name */
    private android.widget.TextView f892q;

    /* renamed from: r, reason: collision with root package name */
    private com.umeng.socialize.media.BaseMediaObject f893r;

    /* renamed from: s, reason: collision with root package name */
    private com.umeng.socialize.ShareAction f894s;

    /* renamed from: t, reason: collision with root package name */
    private com.umeng.socialize.UMShareListener f895t;

    /* renamed from: u, reason: collision with root package name */
    private java.lang.String f896u;

    /* renamed from: v, reason: collision with root package name */
    private java.lang.String f897v;

    /* renamed from: w, reason: collision with root package name */
    private int f898w;

    /* renamed from: x, reason: collision with root package name */
    private int f899x;

    /* renamed from: y, reason: collision with root package name */
    private int f900y;

    /* renamed from: z, reason: collision with root package name */
    private int f901z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements com.umeng.socialize.UMShareListener {
        final /* synthetic */ com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment$a$a, reason: collision with other inner class name */
        class C0091a extends cn.bluemobi.dylan.http.HttpCallBack {
            final /* synthetic */ com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment.a a;

            C0091a(com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment.a r1) {
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

        a(com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void onCancel(com.umeng.socialize.bean.SHARE_MEDIA r3) {
                r2 = this;
                com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment r3 = r2.a
                android.content.Context r3 = com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment.e0(r3)
                java.lang.String r0 = " 分享取消了"
                r1 = 0
                android.widget.Toast r3 = android.widget.Toast.makeText(r3, r0, r1)
                r3.show()
                return
        }

        public void onError(com.umeng.socialize.bean.SHARE_MEDIA r3, java.lang.Throwable r4) {
                r2 = this;
                r4.getClass()
                com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment r3 = r2.a
                android.content.Context r3 = com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment.d0(r3)
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
                com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment r5 = r4.a
                android.content.Context r5 = com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment.b0(r5)
                cn.bluemobi.dylan.http.HttpRequest r5 = cn.bluemobi.dylan.http.Http.with(r5)
                java.lang.Class<com.bxkj.student.home.teaching.learning.m> r0 = com.bxkj.student.home.teaching.learning.m.class
                java.lang.Object r0 = cn.bluemobi.dylan.http.Http.getApiService(r0)
                com.bxkj.student.home.teaching.learning.m r0 = (com.bxkj.student.home.teaching.learning.m) r0
                com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment r1 = r4.a
                java.lang.String r1 = com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment.U(r1)
                java.lang.String r2 = "3"
                r3 = 1
                rx.e r0 = r0.v(r1, r2, r3)
                cn.bluemobi.dylan.http.HttpRequest r5 = r5.setObservable(r0)
                com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment$a$a r0 = new com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment$a$a
                r0.<init>(r4)
                r5.setDataListener(r0)
                com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment r5 = r4.a
                android.content.Context r5 = com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment.c0(r5)
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
        final /* synthetic */ com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment a;

        b(com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r2) {
                r1 = this;
                com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment r2 = r1.a
                int r0 = com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment.W(r2)
                if (r0 != 0) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment.Y(r2, r0)
                com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment r2 = r1.a
                com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment.a0(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment a;

        c(com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r2) {
                r1 = this;
                com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment r2 = r1.a
                int r0 = com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment.V(r2)
                if (r0 != 0) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment.X(r2, r0)
                com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment r2 = r1.a
                com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment.Z(r2)
                return
        }
    }

    public BottomFragment() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void N(com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment r0, android.view.View r1) {
            r0.k0(r1)
            return
    }

    public static /* synthetic */ void O(com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment r0, android.view.View r1) {
            r0.h0(r1)
            return
    }

    public static /* synthetic */ void P(com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment r0, android.view.View r1) {
            r0.j0(r1)
            return
    }

    public static /* synthetic */ void Q(com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment r0, android.view.View r1) {
            r0.l0(r1)
            return
    }

    public static /* synthetic */ void R(com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment r0, android.view.View r1) {
            r0.f0(r1)
            return
    }

    public static /* synthetic */ void S(com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment r0, android.view.View r1) {
            r0.i0(r1)
            return
    }

    public static /* synthetic */ void T(com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment r0, android.view.View r1) {
            r0.g0(r1)
            return
    }

    static /* bridge */ /* synthetic */ java.lang.String U(com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment r0) {
            java.lang.String r0 = r0.f897v
            return r0
    }

    static /* bridge */ /* synthetic */ int V(com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment r0) {
            int r0 = r0.f899x
            return r0
    }

    static /* bridge */ /* synthetic */ int W(com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment r0) {
            int r0 = r0.f898w
            return r0
    }

    static /* bridge */ /* synthetic */ void X(com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment r0, int r1) {
            r0.f899x = r1
            return
    }

    static /* bridge */ /* synthetic */ void Y(com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment r0, int r1) {
            r0.f898w = r1
            return
    }

    static /* bridge */ /* synthetic */ void Z(com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment r0) {
            r0.m0()
            return
    }

    static /* bridge */ /* synthetic */ void a0(com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment r0) {
            r0.r0()
            return
    }

    static /* synthetic */ android.content.Context b0(com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment r0) {
            android.content.Context r0 = r0.g
            return r0
    }

    static /* synthetic */ android.content.Context c0(com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment r0) {
            android.content.Context r0 = r0.g
            return r0
    }

    static /* synthetic */ android.content.Context d0(com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment r0) {
            android.content.Context r0 = r0.g
            return r0
    }

    static /* synthetic */ android.content.Context e0(com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment r0) {
            android.content.Context r0 = r0.g
            return r0
    }

    private /* synthetic */ void f0(android.view.View r1) {
            r0 = this;
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN
            r0.t0(r1)
            return
    }

    private /* synthetic */ void g0(android.view.View r1) {
            r0 = this;
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN_CIRCLE
            r0.t0(r1)
            return
    }

    private /* synthetic */ void h0(android.view.View r1) {
            r0 = this;
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.QQ
            r0.t0(r1)
            return
    }

    private /* synthetic */ void i0(android.view.View r1) {
            r0 = this;
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.QZONE
            r0.t0(r1)
            return
    }

    private /* synthetic */ void j0(android.view.View r5) {
            r4 = this;
            android.content.Context r5 = r4.g
            cn.bluemobi.dylan.http.HttpRequest r5 = cn.bluemobi.dylan.http.Http.with(r5)
            java.lang.Class<com.bxkj.student.home.teaching.learning.m> r0 = com.bxkj.student.home.teaching.learning.m.class
            java.lang.Object r0 = cn.bluemobi.dylan.http.Http.getApiService(r0)
            com.bxkj.student.home.teaching.learning.m r0 = (com.bxkj.student.home.teaching.learning.m) r0
            java.lang.String r1 = r4.f897v
            int r2 = r4.f898w
            if (r2 != 0) goto L16
            r2 = 1
            goto L17
        L16:
            r2 = 0
        L17:
            java.lang.String r3 = "1"
            rx.e r0 = r0.v(r1, r3, r2)
            cn.bluemobi.dylan.http.HttpRequest r5 = r5.setObservable(r0)
            com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment$b r0 = new com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment$b
            r0.<init>(r4)
            r5.setDataListener(r0)
            return
    }

    private /* synthetic */ void k0(android.view.View r5) {
            r4 = this;
            android.content.Context r5 = r4.g
            cn.bluemobi.dylan.http.HttpRequest r5 = cn.bluemobi.dylan.http.Http.with(r5)
            java.lang.Class<com.bxkj.student.home.teaching.learning.m> r0 = com.bxkj.student.home.teaching.learning.m.class
            java.lang.Object r0 = cn.bluemobi.dylan.http.Http.getApiService(r0)
            com.bxkj.student.home.teaching.learning.m r0 = (com.bxkj.student.home.teaching.learning.m) r0
            java.lang.String r1 = r4.f897v
            int r2 = r4.f899x
            if (r2 != 0) goto L16
            r2 = 1
            goto L17
        L16:
            r2 = 0
        L17:
            java.lang.String r3 = "2"
            rx.e r0 = r0.v(r1, r3, r2)
            cn.bluemobi.dylan.http.HttpRequest r5 = r5.setObservable(r0)
            com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment$c r0 = new com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment$c
            r0.<init>(r4)
            r5.setDataListener(r0)
            return
    }

    private /* synthetic */ void l0(android.view.View r3) {
            r2 = this;
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r0 = r2.g
            java.lang.Class<com.bxkj.student.home.teaching.learning.question.list.QuestionListActivity> r1 = com.bxkj.student.home.teaching.learning.question.list.QuestionListActivity.class
            r3.<init>(r0, r1)
            java.lang.String r0 = "type"
            r1 = 1
            android.content.Intent r3 = r3.putExtra(r0, r1)
            java.lang.String r0 = "resourceId"
            java.lang.String r1 = r2.f896u
            android.content.Intent r3 = r3.putExtra(r0, r1)
            r2.startActivity(r3)
            return
    }

    private void m0() {
            r2 = this;
            int r0 = r2.f899x
            r1 = 1
            if (r0 != r1) goto L9
            r2.n0()
            return
        L9:
            r2.o0()
            return
    }

    private void n0() {
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
            android.widget.TextView r1 = r4.f888m
            r2 = 0
            r1.setCompoundDrawables(r2, r0, r2, r2)
            android.widget.TextView r0 = r4.f888m
            java.lang.String r1 = "已收藏"
            r0.setText(r1)
            return
    }

    private void o0() {
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
            android.widget.TextView r1 = r4.f888m
            r2 = 0
            r1.setCompoundDrawables(r2, r0, r2, r2)
            android.widget.TextView r0 = r4.f888m
            java.lang.String r1 = "收藏"
            r0.setText(r1)
            return
    }

    private void p0() {
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
            android.widget.TextView r1 = r4.f887l
            r2 = 0
            r1.setCompoundDrawables(r2, r0, r2, r2)
            android.widget.TextView r0 = r4.f887l
            java.lang.String r1 = "已点赞"
            r0.setText(r1)
            return
    }

    private void q0() {
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
            android.widget.TextView r1 = r4.f887l
            r2 = 0
            r1.setCompoundDrawables(r2, r0, r2, r2)
            android.widget.TextView r0 = r4.f887l
            java.lang.String r1 = "点赞"
            r0.setText(r1)
            return
    }

    private void r0() {
            r2 = this;
            int r0 = r2.f898w
            r1 = 1
            if (r0 != r1) goto L9
            r2.p0()
            return
        L9:
            r2.q0()
            return
    }

    private void t0(com.umeng.socialize.bean.SHARE_MEDIA r2) {
            r1 = this;
            com.umeng.socialize.ShareAction r0 = r1.f894s
            r0.setPlatform(r2)
            com.umeng.socialize.ShareAction r2 = r1.f894s
            com.umeng.socialize.UMShareListener r0 = r1.f895t
            r2.setCallback(r0)
            com.umeng.socialize.media.BaseMediaObject r2 = r1.f893r
            boolean r0 = r2 instanceof com.umeng.socialize.media.UMVideo
            if (r0 == 0) goto L1a
            com.umeng.socialize.media.UMVideo r2 = (com.umeng.socialize.media.UMVideo) r2
            com.umeng.socialize.ShareAction r0 = r1.f894s
            r0.withMedia(r2)
            goto L25
        L1a:
            boolean r0 = r2 instanceof com.umeng.socialize.media.UMWeb
            if (r0 == 0) goto L25
            com.umeng.socialize.media.UMWeb r2 = (com.umeng.socialize.media.UMWeb) r2
            com.umeng.socialize.ShareAction r0 = r1.f894s
            r0.withMedia(r2)
        L25:
            com.umeng.socialize.ShareAction r2 = r1.f894s
            r2.share()
            return
    }

    public void b() {
            r2 = this;
            com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment$a r0 = new com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment$a
            r0.<init>(r2)
            r2.f895t = r0
            android.widget.TextView r0 = r2.f889n
            com.bxkj.student.home.teaching.learning.detail.backup.l r1 = new com.bxkj.student.home.teaching.learning.detail.backup.l
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            android.widget.TextView r0 = r2.f890o
            com.bxkj.student.home.teaching.learning.detail.backup.m r1 = new com.bxkj.student.home.teaching.learning.detail.backup.m
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            android.widget.TextView r0 = r2.f891p
            com.bxkj.student.home.teaching.learning.detail.backup.n r1 = new com.bxkj.student.home.teaching.learning.detail.backup.n
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            android.widget.TextView r0 = r2.f892q
            com.bxkj.student.home.teaching.learning.detail.backup.o r1 = new com.bxkj.student.home.teaching.learning.detail.backup.o
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            android.widget.TextView r0 = r2.f887l
            com.bxkj.student.home.teaching.learning.detail.backup.p r1 = new com.bxkj.student.home.teaching.learning.detail.backup.p
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            android.widget.TextView r0 = r2.f888m
            com.bxkj.student.home.teaching.learning.detail.backup.q r1 = new com.bxkj.student.home.teaching.learning.detail.backup.q
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            android.widget.Button r0 = r2.j
            com.bxkj.student.home.teaching.learning.detail.backup.r r1 = new com.bxkj.student.home.teaching.learning.detail.backup.r
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            return
    }

    protected void e() {
            r15 = this;
            android.os.Bundle r0 = r15.getArguments()
            java.lang.String r1 = "id"
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto L12
            java.lang.String r1 = r0.getString(r1)
            r15.f896u = r1
        L12:
            java.lang.String r1 = "detailId"
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto L20
            java.lang.String r1 = r0.getString(r1)
            r15.f897v = r1
        L20:
            java.lang.String r1 = "isLike"
            boolean r2 = r0.containsKey(r1)
            r3 = 0
            if (r2 == 0) goto L2f
            int r1 = r0.getInt(r1, r3)
            r15.f898w = r1
        L2f:
            java.lang.String r1 = "isCollection"
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto L3d
            int r1 = r0.getInt(r1, r3)
            r15.f899x = r1
        L3d:
            java.lang.String r1 = "duration"
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto L4b
            int r1 = r0.getInt(r1, r3)
            r15.f900y = r1
        L4b:
            java.lang.String r1 = "popTime"
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto L59
            int r1 = r0.getInt(r1, r3)
            r15.f901z = r1
        L59:
            java.lang.String r1 = "hasQuestion"
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto L67
            int r1 = r0.getInt(r1, r3)
            r15.A = r1
        L67:
            java.lang.String r1 = "isComplete"
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto L75
            int r1 = r0.getInt(r1, r3)
            r15.B = r1
        L75:
            java.lang.String r1 = "isOk"
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto L83
            int r1 = r0.getInt(r1, r3)
            r15.C = r1
        L83:
            java.lang.String r1 = "opreateFlag"
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto L91
            int r1 = r0.getInt(r1, r3)
            r15.D = r1
        L91:
            java.lang.String r1 = "valType"
            boolean r2 = r0.containsKey(r1)
            r4 = 1
            if (r2 == 0) goto La0
            int r0 = r0.getInt(r1, r4)
            r15.E = r0
        La0:
            r15.r0()
            r15.m0()
            com.umeng.socialize.ShareAction r0 = new com.umeng.socialize.ShareAction
            androidx.fragment.app.FragmentActivity r1 = r15.getActivity()
            r0.<init>(r1)
            r15.f894s = r0
            int r0 = r15.D
            r1 = 8
            if (r0 != 0) goto Le2
            com.bxkj.student.home.teaching.learning.detail.backup.j r5 = new com.bxkj.student.home.teaching.learning.detail.backup.j
            android.content.Context r7 = r15.g
            int r8 = r15.f900y
            int r9 = r15.f901z
            java.lang.String r10 = r15.f896u
            java.lang.String r11 = r15.f897v
            android.widget.Button r12 = r15.j
            int r13 = r15.A
            int r14 = r15.E
            r6 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r6.F = r5
            int r0 = r6.f900y
            if (r0 != 0) goto Ld9
            android.widget.Button r0 = r6.j
            r0.setVisibility(r1)
            goto Ldc
        Ld9:
            r5.N()
        Ldc:
            android.widget.Button r0 = r6.j
            r0.setEnabled(r3)
            return
        Le2:
            r6 = r15
            if (r0 != r4) goto Lf2
            android.widget.Button r0 = r6.j
            java.lang.String r1 = "已完成"
            r0.setText(r1)
            android.widget.Button r0 = r6.j
            r0.setEnabled(r3)
            return
        Lf2:
            r2 = 2
            if (r0 != r2) goto L102
            android.widget.Button r0 = r6.j
            java.lang.String r1 = "开始答题"
            r0.setText(r1)
            android.widget.Button r0 = r6.j
            r0.setEnabled(r4)
            return
        L102:
            r2 = 3
            if (r0 != r2) goto L112
            android.widget.Button r0 = r6.j
            java.lang.String r1 = "查看答题"
            r0.setText(r1)
            android.widget.Button r0 = r6.j
            r0.setEnabled(r4)
            return
        L112:
            android.widget.Button r0 = r6.j
            r0.setVisibility(r1)
            android.widget.Button r0 = r6.j
            r0.setEnabled(r3)
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
            r0.f887l = r1
            r1 = 2131298841(0x7f090a19, float:1.8215667E38)
            android.view.View r1 = r0.c(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f888m = r1
            r1 = 2131299188(0x7f090b74, float:1.821637E38)
            android.view.View r1 = r0.c(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f889n = r1
            r1 = 2131298979(0x7f090aa3, float:1.8215946E38)
            android.view.View r1 = r0.c(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f890o = r1
            r1 = 2131299055(0x7f090aef, float:1.82161E38)
            android.view.View r1 = r0.c(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f891p = r1
            r1 = 2131299061(0x7f090af5, float:1.8216113E38)
            android.view.View r1 = r0.c(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f892q = r1
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
            com.bxkj.student.home.teaching.learning.detail.backup.j r3 = r2.F
            if (r3 == 0) goto L12
            r3.B()
        L12:
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r4 = r2.g
            r3.<init>(r4)
            java.lang.String r4 = "人脸识别成功，请继续学习"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r3.setMessage(r4)
            r3.show()
            return
        L23:
            if (r3 != r0) goto L3d
            if (r4 != r0) goto L3d
            android.content.Context r4 = r2.g
            java.lang.Class<com.bxkj.student.home.teaching.exam.FaceDetectExamActivity> r0 = com.bxkj.student.home.teaching.exam.FaceDetectExamActivity.class
            android.content.Intent r4 = r5.setClass(r4, r0)
            r2.startActivityForResult(r4, r3)
            android.app.Activity r3 = r2.h
            r4 = 2130771987(0x7f010013, float:1.714708E38)
            r5 = 2130771986(0x7f010012, float:1.7147078E38)
            r3.overridePendingTransition(r4, r5)
        L3d:
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }

    public void onDestroy() {
            r2 = this;
            com.bxkj.student.home.teaching.learning.detail.backup.j r0 = r2.F
            if (r0 == 0) goto L1f
            java.util.TimerTask r0 = r0.f905m
            if (r0 == 0) goto Lb
            r0.cancel()
        Lb:
            com.bxkj.student.home.teaching.learning.detail.backup.j r0 = r2.F
            java.util.Timer r0 = r0.f904l
            if (r0 == 0) goto L14
            r0.cancel()
        L14:
            com.bxkj.student.home.teaching.learning.detail.backup.j r0 = r2.F
            android.os.Handler r1 = r0.f911s
            if (r1 == 0) goto L1f
            java.util.TimerTask r0 = r0.f905m
            r1.removeCallbacks(r0)
        L1f:
            super/*androidx.fragment.app.Fragment*/.onDestroy()
            return
    }

    public void s0(com.umeng.socialize.media.BaseMediaObject r1) {
            r0 = this;
            r0.f893r = r1
            return
    }
}
