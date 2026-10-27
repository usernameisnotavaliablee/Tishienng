package com.bxkj.student.home.teaching.learning.detail;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class k {
    private android.content.Context a;
    private android.widget.Button b;
    private int c;
    private int d;
    private java.lang.String e;
    private java.lang.String f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;

    /* renamed from: l, reason: collision with root package name */
    private java.lang.Long f913l;

    /* renamed from: m, reason: collision with root package name */
    public java.util.Timer f914m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.TimerTask f915n;

    /* renamed from: o, reason: collision with root package name */
    private com.bxkj.student.home.teaching.learning.detail.BottomFragment f916o;

    /* renamed from: p, reason: collision with root package name */
    private cn.bluemobi.dylan.base.view.iOSTwoButtonDialog f917p;

    /* renamed from: q, reason: collision with root package name */
    private com.bxkj.student.home.teaching.learning.detail.v f918q;

    /* renamed from: r, reason: collision with root package name */
    private com.bxkj.student.home.teaching.learning.detail.db.ReadExceptionDataDB f919r;

    /* renamed from: s, reason: collision with root package name */
    private long f920s;

    /* renamed from: t, reason: collision with root package name */
    private final int f921t;

    /* renamed from: u, reason: collision with root package name */
    public android.os.Handler f922u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f923v;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends java.util.TimerTask {
        final /* synthetic */ com.bxkj.student.home.teaching.learning.detail.k a;

        a(com.bxkj.student.home.teaching.learning.detail.k r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
                r5 = this;
                com.bxkj.student.home.teaching.learning.detail.k r0 = r5.a
                boolean r0 = com.bxkj.student.home.teaching.learning.detail.k.p(r0)
                if (r0 == 0) goto L9
                return
            L9:
                com.bxkj.student.home.teaching.learning.detail.k r0 = r5.a
                long r1 = com.bxkj.student.home.teaching.learning.detail.k.r(r0)
                r3 = 1
                long r1 = r1 + r3
                com.bxkj.student.home.teaching.learning.detail.k.t(r0, r1)
                com.bxkj.student.home.teaching.learning.detail.k r0 = r5.a
                long r0 = com.bxkj.student.home.teaching.learning.detail.k.r(r0)
                r2 = 10
                long r0 = r0 % r2
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L29
                com.bxkj.student.home.teaching.learning.detail.k r0 = r5.a
                r0.P()
            L29:
                com.bxkj.student.home.teaching.learning.detail.k r0 = r5.a
                android.os.Handler r0 = r0.f922u
                r1 = 170(0xaa, float:2.38E-43)
                r0.sendEmptyMessage(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends android.os.Handler {
        final /* synthetic */ com.bxkj.student.home.teaching.learning.detail.k a;

        b(com.bxkj.student.home.teaching.learning.detail.k r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r2) {
                r1 = this;
                int r2 = r2.what
                r0 = 170(0xaa, float:2.38E-43)
                if (r2 == r0) goto L7
                return
            L7:
                com.bxkj.student.home.teaching.learning.detail.k r2 = r1.a
                com.bxkj.student.home.teaching.learning.detail.k.u(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements android.text.TextWatcher {
        final /* synthetic */ android.widget.EditText a;
        final /* synthetic */ android.widget.Button b;
        final /* synthetic */ com.bxkj.student.home.teaching.learning.detail.k c;

        c(com.bxkj.student.home.teaching.learning.detail.k r1, android.widget.EditText r2, android.widget.Button r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable r3) {
                r2 = this;
                android.widget.EditText r3 = r2.a
                android.text.Editable r3 = r3.getText()
                java.lang.String r3 = r3.toString()
                int r3 = r3.length()
                r0 = 4
                if (r3 != r0) goto L13
                r3 = 1
                goto L14
            L13:
                r3 = 0
            L14:
                android.widget.Button r0 = r2.b
                r0.setEnabled(r3)
                android.widget.Button r0 = r2.b
                if (r3 == 0) goto L2b
                com.bxkj.student.home.teaching.learning.detail.k r3 = r2.c
                android.content.Context r3 = com.bxkj.student.home.teaching.learning.detail.k.q(r3)
                r1 = 2131099829(0x7f0600b5, float:1.7812022E38)
            L26:
                int r3 = androidx.core.content.ContextCompat.getColor(r3, r1)
                goto L35
            L2b:
                com.bxkj.student.home.teaching.learning.detail.k r3 = r2.c
                android.content.Context r3 = com.bxkj.student.home.teaching.learning.detail.k.q(r3)
                r1 = 2131099715(0x7f060043, float:1.7811791E38)
                goto L26
            L35:
                r0.setTextColor(r3)
                return
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
                r0 = this;
                return
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.learning.detail.k a;

        d(com.bxkj.student.home.teaching.learning.detail.k r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public static /* synthetic */ void a(com.bxkj.student.home.teaching.learning.detail.k.d r0) {
                r0.c()
                return
        }

        public static /* synthetic */ void b(com.bxkj.student.home.teaching.learning.detail.k.d r0) {
                r0.d()
                return
        }

        private /* synthetic */ void c() {
                r1 = this;
                com.bxkj.student.home.teaching.learning.detail.k r0 = r1.a
                com.bxkj.student.home.teaching.learning.detail.k.v(r0)
                return
        }

        private /* synthetic */ void d() {
                r1 = this;
                com.bxkj.student.home.teaching.learning.detail.k r0 = r1.a
                com.bxkj.student.home.teaching.learning.detail.k.v(r0)
                return
        }

        public void netOnFailure(java.lang.Throwable r3) {
                r2 = this;
                super.netOnFailure(r3)
                boolean r3 = r3 instanceof java.net.SocketTimeoutException
                java.lang.String r0 = "重试"
                if (r3 == 0) goto L2b
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r3 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
                com.bxkj.student.home.teaching.learning.detail.k r1 = r2.a
                android.content.Context r1 = com.bxkj.student.home.teaching.learning.detail.k.q(r1)
                r3.<init>(r1)
                java.lang.String r1 = "获取积分超时,请重试"
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r3 = r3.setMessage(r1)
                com.bxkj.student.home.teaching.learning.detail.l r1 = new com.bxkj.student.home.teaching.learning.detail.l
                r1.<init>(r2)
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r3 = r3.setRightButtonOnClickListener(r1)
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r3 = r3.setRightButtonText(r0)
                r3.show()
                return
            L2b:
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r3 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
                com.bxkj.student.home.teaching.learning.detail.k r1 = r2.a
                android.content.Context r1 = com.bxkj.student.home.teaching.learning.detail.k.q(r1)
                r3.<init>(r1)
                java.lang.String r1 = "获取积分失败,请重试"
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r3 = r3.setMessage(r1)
                com.bxkj.student.home.teaching.learning.detail.m r1 = new com.bxkj.student.home.teaching.learning.detail.m
                r1.<init>(r2)
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r3 = r3.setRightButtonOnClickListener(r1)
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r3 = r3.setRightButtonText(r0)
                r3.show()
                return
        }

        public void netOnOtherStatus(int r2, java.lang.String r3) {
                r1 = this;
                super.netOnOtherStatus(r2, r3)
                com.bxkj.student.home.teaching.learning.detail.k r2 = r1.a
                android.widget.Button r2 = com.bxkj.student.home.teaching.learning.detail.k.l(r2)
                java.lang.String r0 = ""
                r2.setText(r0)
                com.bxkj.student.home.teaching.learning.detail.k r2 = r1.a
                android.widget.Button r2 = com.bxkj.student.home.teaching.learning.detail.k.l(r2)
                r0 = 0
                r2.setEnabled(r0)
                com.bxkj.student.home.teaching.learning.detail.k r2 = r1.a
                com.bxkj.student.home.teaching.learning.detail.BottomFragment r2 = com.bxkj.student.home.teaching.learning.detail.k.k(r2)
                androidx.fragment.app.FragmentActivity r2 = r2.getActivity()
                com.bxkj.student.home.teaching.learning.detail.LearnDetailActivity r2 = (com.bxkj.student.home.teaching.learning.detail.LearnDetailActivity) r2
                r2.u0(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.home.teaching.learning.detail.k r0 = r1.a
                android.content.Context r0 = com.bxkj.student.home.teaching.learning.detail.k.q(r0)
                r2.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                r2.show()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r9) {
                r8 = this;
                com.bxkj.student.home.teaching.learning.detail.k r9 = r8.a
                android.widget.Button r9 = com.bxkj.student.home.teaching.learning.detail.k.l(r9)
                com.bxkj.student.home.teaching.learning.detail.k r0 = r8.a
                int r0 = com.bxkj.student.home.teaching.learning.detail.k.n(r0)
                r1 = 1
                if (r0 != r1) goto L12
                java.lang.String r0 = "开始答题"
                goto L14
            L12:
                java.lang.String r0 = "已完成"
            L14:
                r9.setText(r0)
                com.bxkj.student.home.teaching.learning.detail.k r9 = r8.a
                android.widget.Button r9 = com.bxkj.student.home.teaching.learning.detail.k.l(r9)
                com.bxkj.student.home.teaching.learning.detail.k r0 = r8.a
                int r0 = com.bxkj.student.home.teaching.learning.detail.k.n(r0)
                r2 = 0
                if (r0 != r1) goto L27
                goto L28
            L27:
                r1 = 0
            L28:
                r9.setEnabled(r1)
                com.bxkj.student.home.teaching.learning.detail.k r9 = r8.a
                com.bxkj.student.home.teaching.learning.detail.BottomFragment r9 = com.bxkj.student.home.teaching.learning.detail.k.k(r9)
                androidx.fragment.app.FragmentActivity r9 = r9.getActivity()
                com.bxkj.student.home.teaching.learning.detail.LearnDetailActivity r9 = (com.bxkj.student.home.teaching.learning.detail.LearnDetailActivity) r9
                r9.u0(r2)
                cn.bluemobi.dylan.base.utils.a r9 = cn.bluemobi.dylan.base.utils.a.n()
                java.lang.Class<com.bxkj.student.home.teaching.learning.LearnHomeListActivity> r0 = com.bxkj.student.home.teaching.learning.LearnHomeListActivity.class
                android.app.Activity r9 = r9.getActivity(r0)
                com.bxkj.student.home.teaching.learning.LearnHomeListActivity r9 = (com.bxkj.student.home.teaching.learning.LearnHomeListActivity) r9
                if (r9 == 0) goto L4b
                r9.S0()
            L4b:
                android.widget.Toast r9 = new android.widget.Toast
                com.bxkj.student.home.teaching.learning.detail.k r0 = r8.a
                android.content.Context r0 = com.bxkj.student.home.teaching.learning.detail.k.q(r0)
                r9.<init>(r0)
                com.bxkj.student.home.teaching.learning.detail.k r0 = r8.a
                android.content.Context r0 = com.bxkj.student.home.teaching.learning.detail.k.q(r0)
                r1 = 2131493680(0x7f0c0330, float:1.8610847E38)
                r3 = 0
                android.view.View r0 = android.view.View.inflate(r0, r1, r3)
                r1 = 2131298068(0x7f090714, float:1.8214099E38)
                android.view.View r1 = r0.findViewById(r1)
                android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
                android.view.ViewGroup$LayoutParams r4 = new android.view.ViewGroup$LayoutParams
                com.bxkj.student.home.teaching.learning.detail.k r5 = r8.a
                android.content.Context r5 = com.bxkj.student.home.teaching.learning.detail.k.q(r5)
                r6 = 1123024896(0x42f00000, float:120.0)
                int r5 = cn.bluemobi.dylan.base.utils.u.a(r6, r5)
                com.bxkj.student.home.teaching.learning.detail.k r7 = r8.a
                android.content.Context r7 = com.bxkj.student.home.teaching.learning.detail.k.q(r7)
                int r6 = cn.bluemobi.dylan.base.utils.u.a(r6, r7)
                r4.<init>(r5, r6)
                r1.setLayoutParams(r4)
                r1 = 2131298976(0x7f090aa0, float:1.821594E38)
                android.view.View r1 = r0.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "+"
                r4.append(r5)
                com.bxkj.student.home.teaching.learning.detail.k r5 = r8.a
                int r5 = com.bxkj.student.home.teaching.learning.detail.k.o(r5)
                r4.append(r5)
                java.lang.String r5 = "积分"
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                r1.setText(r4)
                r9.setView(r0)
                r0 = 17
                r9.setGravity(r0, r2, r2)
                r9.setDuration(r2)
                r9.show()
                cn.bluemobi.dylan.sqlitelibrary.c r9 = cn.bluemobi.dylan.sqlitelibrary.c.h()
                com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r0 = r0.getUserId()
                com.bxkj.student.home.teaching.learning.detail.k r1 = r8.a
                java.lang.String r1 = com.bxkj.student.home.teaching.learning.detail.k.m(r1)
                java.lang.String[] r0 = new java.lang.String[]{r0, r1}
                java.lang.Class<com.bxkj.student.home.teaching.learning.detail.db.ReadExceptionDataDB> r1 = com.bxkj.student.home.teaching.learning.detail.db.ReadExceptionDataDB.class
                java.lang.String r2 = "userId=? and detailId=?"
                r9.delete(r1, r2, r0)
                com.bxkj.student.home.teaching.learning.detail.k r9 = r8.a
                com.bxkj.student.home.teaching.learning.detail.k.s(r9, r3)
                return
        }
    }

    public k(com.bxkj.student.home.teaching.learning.detail.BottomFragment r4, android.content.Context r5, int r6, int r7, java.lang.String r8, java.lang.String r9, android.widget.Button r10, int r11, int r12, int r13) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.c = r0
            r3.d = r0
            r1 = 30
            r3.g = r1
            r1 = 0
            r3.f920s = r1
            r1 = 170(0xaa, float:2.38E-43)
            r3.f921t = r1
            com.bxkj.student.home.teaching.learning.detail.k$b r1 = new com.bxkj.student.home.teaching.learning.detail.k$b
            r1.<init>(r3)
            r3.f922u = r1
            r3.f923v = r0
            r3.f916o = r4
            r3.a = r5
            r3.e = r8
            r3.h = r6
            r3.b = r10
            r3.g = r7
            if (r7 != 0) goto L2e
            r3.d = r0
            goto L31
        L2e:
            int r6 = r6 / r7
            r3.d = r6
        L31:
            r3.f = r9
            r3.i = r11
            r3.j = r12
            r3.k = r13
            com.bxkj.student.home.teaching.learning.detail.v r4 = new com.bxkj.student.home.teaching.learning.detail.v
            r4.<init>(r5)
            r3.f918q = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "需要弹框次数="
            r4.append(r5)
            int r5 = r3.d
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.orhanobut.logger.j.c(r4)
            r3.B()
            return
    }

    private void A(cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r2, android.widget.EditText r3, android.widget.TextView r4) {
            r1 = this;
            android.text.Editable r3 = r3.getText()
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r3.trim()
            com.bxkj.student.home.teaching.learning.detail.v r0 = r1.f918q
            android.text.SpannableString r0 = r0.b()
            java.lang.String r0 = r0.toString()
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L32
            android.content.Context r2 = r1.a
            java.lang.String r3 = "验证码错误"
            r0 = 0
            android.widget.Toast r2 = android.widget.Toast.makeText(r2, r3, r0)
            r2.show()
            com.bxkj.student.home.teaching.learning.detail.v r2 = r1.f918q
            android.text.SpannableString r2 = r2.a()
            r4.setText(r2)
            return
        L32:
            r1.y(r2)
            return
    }

    private void B() {
            r6 = this;
            cn.bluemobi.dylan.sqlitelibrary.c r0 = cn.bluemobi.dylan.sqlitelibrary.c.h()
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r1 = r1.getUserId()
            java.lang.String r2 = r6.f
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            java.lang.Class<com.bxkj.student.home.teaching.learning.detail.db.ReadExceptionDataDB> r2 = com.bxkj.student.home.teaching.learning.detail.db.ReadExceptionDataDB.class
            java.lang.String r3 = "userId=? and detailId=?"
            java.util.List r0 = r0.query(r2, r3, r1)
            int r1 = r0.size()
            if (r1 <= 0) goto L4e
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.bxkj.student.home.teaching.learning.detail.db.ReadExceptionDataDB r0 = (com.bxkj.student.home.teaching.learning.detail.db.ReadExceptionDataDB) r0
            r6.f919r = r0
            long r0 = r0.getCountTime()
            r6.f920s = r0
            int r2 = r6.h
            long r3 = (long) r2
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 <= 0) goto L39
            long r0 = (long) r2
            r6.f920s = r0
        L39:
            com.bxkj.student.home.teaching.learning.detail.db.ReadExceptionDataDB r0 = r6.f919r
            int r0 = r0.getAlertCount()
            r6.c = r0
            com.bxkj.student.home.teaching.learning.detail.db.ReadExceptionDataDB r0 = r6.f919r
            long r0 = r0.getStartTime()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.f913l = r0
            return
        L4e:
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.f913l = r0
            com.bxkj.student.home.teaching.learning.detail.db.ReadExceptionDataDB r0 = new com.bxkj.student.home.teaching.learning.detail.db.ReadExceptionDataDB
            r0.<init>()
            r6.f919r = r0
            java.lang.Long r0 = r6.f913l
            long r0 = r0.longValue()
            java.lang.String r2 = "yyyy-MM-dd HH:mm:ss"
            java.lang.String r0 = com.bxkj.student.run.app.utils.i.h(r0, r2)
            com.bxkj.student.home.teaching.learning.detail.db.ReadExceptionDataDB r1 = r6.f919r
            r1.setCreateTime(r0)
            com.bxkj.student.home.teaching.learning.detail.db.ReadExceptionDataDB r0 = r6.f919r
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r1 = r1.getUserId()
            r0.setUserId(r1)
            com.bxkj.student.home.teaching.learning.detail.db.ReadExceptionDataDB r0 = r6.f919r
            java.lang.String r1 = r6.f
            r0.setDetailId(r1)
            com.bxkj.student.home.teaching.learning.detail.db.ReadExceptionDataDB r0 = r6.f919r
            java.lang.Long r1 = r6.f913l
            long r1 = r1.longValue()
            r0.setStartTime(r1)
            cn.bluemobi.dylan.sqlitelibrary.c r0 = cn.bluemobi.dylan.sqlitelibrary.c.h()
            com.bxkj.student.home.teaching.learning.detail.db.ReadExceptionDataDB r1 = r6.f919r
            r0.insert(r1)
            return
    }

    private void C() {
            r5 = this;
            android.content.Context r0 = r5.a
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.String r1 = "获取积分中,请稍后..."
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setLoadingMessage(r1)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideSuccessMessage()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideOtherStatusMessage()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideFailMessage()
            r1 = 0
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setCanCancel(r1)
            java.lang.Class<com.bxkj.student.home.teaching.learning.m> r1 = com.bxkj.student.home.teaching.learning.m.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.student.home.teaching.learning.m r1 = (com.bxkj.student.home.teaching.learning.m) r1
            java.lang.String r2 = r5.f
            java.lang.String r3 = "4"
            r4 = 1
            rx.e r1 = r1.v(r2, r3, r4)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.teaching.learning.detail.k$d r1 = new com.bxkj.student.home.teaching.learning.detail.k$d
            r1.<init>(r5)
            r0.setDataListener(r1)
            return
    }

    private void F() {
            r5 = this;
            int r0 = r5.h
            long r0 = (long) r0
            long r2 = r5.f920s
            long r0 = r0 - r2
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Ld
            return
        Ld:
            r5.T()
            r5.C()
            return
    }

    private /* synthetic */ void G(android.widget.TextView r1, android.view.View r2) {
            r0 = this;
            com.bxkj.student.home.teaching.learning.detail.v r2 = r0.f918q
            android.text.SpannableString r2 = r2.a()
            r1.setText(r2)
            return
    }

    private /* synthetic */ void H(cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1, android.widget.EditText r2, android.widget.TextView r3) {
            r0 = this;
            r0.A(r1, r2, r3)
            return
    }

    private /* synthetic */ void I(cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1) {
            r0 = this;
            r1.dismiss()
            android.content.Context r1 = r0.a
            android.app.Activity r1 = (android.app.Activity) r1
            r1.finish()
            return
    }

    private /* synthetic */ void J(cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r3) {
            r2 = this;
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
            android.content.Context r1 = r2.a
            r0.<init>(r1)
            java.lang.String r1 = "正在学习,如果离开将不积分,确定离开？"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setMessage(r1)
            java.lang.String r1 = "继续学习"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setLeftButtonText(r1)
            java.lang.String r1 = "确定离开"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setRightButtonText(r1)
            com.bxkj.student.home.teaching.learning.detail.i r1 = new com.bxkj.student.home.teaching.learning.detail.i
            r1.<init>(r2, r3)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r3 = r0.setRightButtonOnClickListener(r1)
            r3.show()
            return
    }

    private /* synthetic */ void K(android.widget.EditText r1, android.content.DialogInterface r2) {
            r0 = this;
            r0.R(r1)
            return
    }

    private /* synthetic */ void L() {
            r1 = this;
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r1.f917p
            r0.dismiss()
            android.content.Context r0 = r1.a
            android.app.Activity r0 = (android.app.Activity) r0
            r0.finish()
            return
    }

    private /* synthetic */ void M() {
            r2 = this;
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
            android.content.Context r1 = r2.a
            r0.<init>(r1)
            java.lang.String r1 = "正在学习,如果离开将不积分,确定离开？"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setMessage(r1)
            java.lang.String r1 = "继续学习"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setLeftButtonText(r1)
            java.lang.String r1 = "确定离开"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setRightButtonText(r1)
            com.bxkj.student.home.teaching.learning.detail.h r1 = new com.bxkj.student.home.teaching.learning.detail.h
            r1.<init>(r2)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setRightButtonOnClickListener(r1)
            r0.show()
            return
    }

    private /* synthetic */ kotlin.n1 N() {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r3.a
            java.lang.Class<com.bxkj.student.home.teaching.learning.FaceDetectLearnActivity> r2 = com.bxkj.student.home.teaching.learning.FaceDetectLearnActivity.class
            r0.<init>(r1, r2)
            com.bxkj.student.home.teaching.learning.detail.BottomFragment r1 = r3.f916o
            r2 = 170(0xaa, float:2.38E-43)
            r1.startActivityForResult(r0, r2)
            android.content.Context r0 = r3.a
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            r1 = 2130771987(0x7f010013, float:1.714708E38)
            r2 = 2130771986(0x7f010012, float:1.7147078E38)
            r0.overridePendingTransition(r1, r2)
            r0 = 0
            return r0
    }

    private /* synthetic */ void O() {
            r3 = this;
            android.content.Context r0 = r3.a
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            com.bxkj.student.home.teaching.learning.detail.j r1 = new com.bxkj.student.home.teaching.learning.detail.j
            r1.<init>(r3)
            java.lang.String r2 = "人脸识别"
            com.bxkj.base.v2.common.ext.t.p(r0, r2, r1)
            return
    }

    public static /* synthetic */ void a(com.bxkj.student.home.teaching.learning.detail.k r0, android.widget.EditText r1, android.content.DialogInterface r2) {
            r0.K(r1, r2)
            return
    }

    public static /* synthetic */ void b(com.bxkj.student.home.teaching.learning.detail.k r0, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1, android.widget.EditText r2, android.widget.TextView r3) {
            r0.H(r1, r2, r3)
            return
    }

    public static /* synthetic */ void c(com.bxkj.student.home.teaching.learning.detail.k r0) {
            r0.L()
            return
    }

    public static /* synthetic */ void d(com.bxkj.student.home.teaching.learning.detail.k r0) {
            r0.M()
            return
    }

    public static /* synthetic */ void e(com.bxkj.student.home.teaching.learning.detail.k r0, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1) {
            r0.J(r1)
            return
    }

    public static /* synthetic */ void f(com.bxkj.student.home.teaching.learning.detail.k r0, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1) {
            r0.I(r1)
            return
    }

    public static /* synthetic */ void g(com.bxkj.student.home.teaching.learning.detail.k r0) {
            r0.O()
            return
    }

    public static /* synthetic */ kotlin.n1 h(com.bxkj.student.home.teaching.learning.detail.k r0) {
            kotlin.n1 r0 = r0.N()
            return r0
    }

    public static /* synthetic */ boolean i(android.content.DialogInterface r0, int r1, android.view.KeyEvent r2) {
            r0 = 4
            if (r1 != r0) goto L5
            r0 = 1
            return r0
        L5:
            r0 = 0
            return r0
    }

    public static /* synthetic */ void j(com.bxkj.student.home.teaching.learning.detail.k r0, android.widget.TextView r1, android.view.View r2) {
            r0.G(r1, r2)
            return
    }

    static /* bridge */ /* synthetic */ com.bxkj.student.home.teaching.learning.detail.BottomFragment k(com.bxkj.student.home.teaching.learning.detail.k r0) {
            com.bxkj.student.home.teaching.learning.detail.BottomFragment r0 = r0.f916o
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.Button l(com.bxkj.student.home.teaching.learning.detail.k r0) {
            android.widget.Button r0 = r0.b
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String m(com.bxkj.student.home.teaching.learning.detail.k r0) {
            java.lang.String r0 = r0.f
            return r0
    }

    static /* bridge */ /* synthetic */ int n(com.bxkj.student.home.teaching.learning.detail.k r0) {
            int r0 = r0.i
            return r0
    }

    static /* bridge */ /* synthetic */ int o(com.bxkj.student.home.teaching.learning.detail.k r0) {
            int r0 = r0.k
            return r0
    }

    static /* bridge */ /* synthetic */ boolean p(com.bxkj.student.home.teaching.learning.detail.k r0) {
            boolean r0 = r0.f923v
            return r0
    }

    static /* bridge */ /* synthetic */ android.content.Context q(com.bxkj.student.home.teaching.learning.detail.k r0) {
            android.content.Context r0 = r0.a
            return r0
    }

    static /* bridge */ /* synthetic */ long r(com.bxkj.student.home.teaching.learning.detail.k r2) {
            long r0 = r2.f920s
            return r0
    }

    static /* bridge */ /* synthetic */ void s(com.bxkj.student.home.teaching.learning.detail.k r0, com.bxkj.student.home.teaching.learning.detail.db.ReadExceptionDataDB r1) {
            r0.f919r = r1
            return
    }

    static /* bridge */ /* synthetic */ void t(com.bxkj.student.home.teaching.learning.detail.k r0, long r1) {
            r0.f920s = r1
            return
    }

    static /* bridge */ /* synthetic */ void u(com.bxkj.student.home.teaching.learning.detail.k r0) {
            r0.z()
            return
    }

    static /* bridge */ /* synthetic */ void v(com.bxkj.student.home.teaching.learning.detail.k r0) {
            r0.C()
            return
    }

    private void w() {
            r5 = this;
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
            android.content.Context r1 = r5.a
            r0.<init>(r1)
            r1 = 2131296668(0x7f09019c, float:1.821126E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            java.lang.String r2 = "请输入验证码继续观看"
            r0.setTitle(r2)
            r2 = 2131493148(0x7f0c011c, float:1.8609768E38)
            r0.setCenterCustomView(r2)
            r2 = 0
            r0.setClickAutoCancel(r2)
            r0.setCanceledOnTouchOutside(r2)
            r1.setEnabled(r2)
            r2 = 2131296929(0x7f0902a1, float:1.8211789E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.EditText r2 = (android.widget.EditText) r2
            android.content.Context r3 = r5.a
            r4 = 2131099715(0x7f060043, float:1.7811791E38)
            int r3 = androidx.core.content.ContextCompat.getColor(r3, r4)
            r1.setTextColor(r3)
            r3 = 2131298840(0x7f090a18, float:1.8215665E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            com.bxkj.student.home.teaching.learning.detail.v r4 = r5.f918q
            android.text.SpannableString r4 = r4.a()
            r3.setText(r4)
            com.bxkj.student.home.teaching.learning.detail.c r4 = new com.bxkj.student.home.teaching.learning.detail.c
            r4.<init>(r5, r3)
            r3.setOnClickListener(r4)
            com.bxkj.student.home.teaching.learning.detail.k$c r4 = new com.bxkj.student.home.teaching.learning.detail.k$c
            r4.<init>(r5, r2, r1)
            r2.addTextChangedListener(r4)
            com.bxkj.student.home.teaching.learning.detail.d r1 = new com.bxkj.student.home.teaching.learning.detail.d
            r1.<init>(r5, r0, r2, r3)
            r0.setRightButtonOnClickListener(r1)
            com.bxkj.student.home.teaching.learning.detail.e r1 = new com.bxkj.student.home.teaching.learning.detail.e
            r1.<init>(r5, r0)
            r0.setLeftButtonOnClickListener(r1)
            com.bxkj.student.home.teaching.learning.detail.f r1 = new com.bxkj.student.home.teaching.learning.detail.f
            r1.<init>()
            r0.setOnKeyListener(r1)
            com.bxkj.student.home.teaching.learning.detail.g r1 = new com.bxkj.student.home.teaching.learning.detail.g
            r1.<init>(r5, r2)
            r0.setOnShowListener(r1)
            r0.show()
            return
    }

    private void x() {
            r2 = this;
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
            android.content.Context r1 = r2.a
            r0.<init>(r1)
            java.lang.String r1 = "学习已暂停，请先进行人脸识别"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setMessage(r1)
            r2.f917p = r0
            com.bxkj.student.home.teaching.learning.detail.a r1 = new com.bxkj.student.home.teaching.learning.detail.a
            r1.<init>(r2)
            r0.setLeftButtonOnClickListener(r1)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r2.f917p
            com.bxkj.student.home.teaching.learning.detail.b r1 = new com.bxkj.student.home.teaching.learning.detail.b
            r1.<init>(r2)
            r0.setRightButtonOnClickListener(r1)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r2.f917p
            r1 = 0
            r0.setClickAutoCancel(r1)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r2.f917p
            r0.setCancelable(r1)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r2.f917p
            r0.setCanceledOnTouchOutside(r1)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r2.f917p
            r0.show()
            return
    }

    private void y(cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r2) {
            r1 = this;
            int r0 = r1.c
            int r0 = r0 + 1
            r1.c = r0
            if (r2 == 0) goto Lb
            r2.dismiss()
        Lb:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "已点击弹框次数="
            r2.append(r0)
            int r0 = r1.c
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.orhanobut.logger.j.c(r2)
            r1.F()
            r2 = 0
            r1.Q(r2)
            return
    }

    private void z() {
            r6 = this;
            int r0 = r6.h
            long r0 = (long) r0
            long r2 = r6.f920s
            long r0 = r0 - r2
            android.widget.Button r2 = r6.b
            java.lang.String r0 = r6.E(r0)
            r2.setText(r0)
            long r0 = r6.f920s
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L32
            int r4 = r6.g
            if (r4 <= 0) goto L32
            long r4 = (long) r4
            long r0 = r0 % r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L32
            r0 = 1
            r6.Q(r0)
            int r0 = r6.j
            r1 = 2
            if (r0 != r1) goto L2e
            r6.x()
            return
        L2e:
            r6.w()
            return
        L32:
            r6.F()
            return
    }

    public void D() {
            r1 = this;
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r1.f917p
            r1.y(r0)
            return
    }

    public java.lang.String E(long r9) {
            r8 = this;
            r0 = 0
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 >= 0) goto La
            r8.T()
            r9 = r0
        La:
            r0 = 60
            long r2 = r9 / r0
            java.lang.String r4 = "0"
            r5 = 10
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 >= 0) goto L26
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            goto L2a
        L26:
            java.lang.String r2 = java.lang.String.valueOf(r2)
        L2a:
            long r9 = r9 % r0
            int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r0 >= 0) goto L3f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            goto L43
        L3f:
            java.lang.String r9 = java.lang.String.valueOf(r9)
        L43:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r2)
            java.lang.String r0 = ":"
            r10.append(r0)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            return r9
    }

    public void P() {
            r4 = this;
            com.bxkj.student.home.teaching.learning.detail.db.ReadExceptionDataDB r0 = r4.f919r
            if (r0 != 0) goto L5
            return
        L5:
            long r1 = r4.f920s
            r0.setCountTime(r1)
            com.bxkj.student.home.teaching.learning.detail.db.ReadExceptionDataDB r0 = r4.f919r
            int r1 = r4.c
            r0.setAlertCount(r1)
            cn.bluemobi.dylan.sqlitelibrary.c r0 = cn.bluemobi.dylan.sqlitelibrary.c.h()
            com.bxkj.student.home.teaching.learning.detail.db.ReadExceptionDataDB r1 = r4.f919r
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getUserId()
            java.lang.String r3 = r4.f
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}
            java.lang.String r3 = "userId=? and detailId=?"
            r0.update(r1, r3, r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "readExceptionDataDB="
            r0.append(r1)
            com.bxkj.student.home.teaching.learning.detail.db.ReadExceptionDataDB r1 = r4.f919r
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.orhanobut.logger.j.c(r0)
            return
    }

    public void Q(boolean r1) {
            r0 = this;
            r0.f923v = r1
            return
    }

    public void R(android.widget.EditText r3) {
            r2 = this;
            if (r3 == 0) goto L1c
            r0 = 1
            r3.setFocusable(r0)
            r3.setFocusableInTouchMode(r0)
            r3.requestFocus()
            android.content.Context r0 = r3.getContext()
            java.lang.String r1 = "input_method"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            r1 = 0
            r0.showSoftInput(r3, r1)
        L1c:
            return
    }

    public void S() {
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "time="
            r0.append(r1)
            long r1 = r7.f920s
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.orhanobut.logger.j.c(r0)
            r7.z()
            com.bxkj.student.home.teaching.learning.detail.k$a r0 = new com.bxkj.student.home.teaching.learning.detail.k$a
            r0.<init>(r7)
            r7.f915n = r0
            java.util.Timer r1 = new java.util.Timer
            r1.<init>()
            r7.f914m = r1
            java.util.TimerTask r2 = r7.f915n
            r3 = 0
            r5 = 1000(0x3e8, double:4.94E-321)
            r1.schedule(r2, r3, r5)
            return
    }

    public void T() {
            r2 = this;
            java.util.TimerTask r0 = r2.f915n
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            java.util.Timer r0 = r2.f914m
            if (r0 == 0) goto Le
            r0.cancel()
        Le:
            android.os.Handler r0 = r2.f922u
            if (r0 == 0) goto L17
            java.util.TimerTask r1 = r2.f915n
            r0.removeCallbacks(r1)
        L17:
            return
    }
}
