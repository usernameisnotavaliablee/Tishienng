package com.bxkj.student.home.teaching.learning.detail.backup;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j {
    private android.content.Context a;
    private android.widget.Button b;
    private int c;
    private int d;
    private java.lang.String e;
    private java.lang.String f;
    private int g;
    private long h;
    private int i;
    private int j;
    private long k;

    /* renamed from: l, reason: collision with root package name */
    public java.util.Timer f904l;

    /* renamed from: m, reason: collision with root package name */
    public java.util.TimerTask f905m;

    /* renamed from: n, reason: collision with root package name */
    private java.lang.Long f906n;

    /* renamed from: o, reason: collision with root package name */
    private com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment f907o;

    /* renamed from: p, reason: collision with root package name */
    private cn.bluemobi.dylan.base.view.iOSTwoButtonDialog f908p;

    /* renamed from: q, reason: collision with root package name */
    private com.bxkj.student.home.teaching.learning.detail.db.ReadExceptionDataDB f909q;

    /* renamed from: r, reason: collision with root package name */
    private final int f910r;

    /* renamed from: s, reason: collision with root package name */
    public android.os.Handler f911s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f912t;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends java.util.TimerTask {
        final /* synthetic */ com.bxkj.student.home.teaching.learning.detail.backup.j a;

        a(com.bxkj.student.home.teaching.learning.detail.backup.j r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
                r5 = this;
                com.bxkj.student.home.teaching.learning.detail.backup.j r0 = r5.a
                boolean r0 = com.bxkj.student.home.teaching.learning.detail.backup.j.n(r0)
                if (r0 == 0) goto L9
                return
            L9:
                com.bxkj.student.home.teaching.learning.detail.backup.j r0 = r5.a
                long r1 = com.bxkj.student.home.teaching.learning.detail.backup.j.p(r0)
                r3 = 1
                long r1 = r1 + r3
                com.bxkj.student.home.teaching.learning.detail.backup.j.r(r0, r1)
                com.bxkj.student.home.teaching.learning.detail.backup.j r0 = r5.a
                long r0 = com.bxkj.student.home.teaching.learning.detail.backup.j.p(r0)
                r2 = 10
                long r0 = r0 % r2
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L29
                com.bxkj.student.home.teaching.learning.detail.backup.j r0 = r5.a
                com.bxkj.student.home.teaching.learning.detail.backup.j.v(r0)
            L29:
                com.bxkj.student.home.teaching.learning.detail.backup.j r0 = r5.a
                android.os.Handler r0 = r0.f911s
                r1 = 170(0xaa, float:2.38E-43)
                r0.sendEmptyMessage(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends android.os.Handler {
        final /* synthetic */ com.bxkj.student.home.teaching.learning.detail.backup.j a;

        b(com.bxkj.student.home.teaching.learning.detail.backup.j r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r9) {
                r8 = this;
                int r9 = r9.what
                r0 = 170(0xaa, float:2.38E-43)
                if (r9 == r0) goto L7
                goto L7c
            L7:
                com.bxkj.student.home.teaching.learning.detail.backup.j r9 = r8.a
                long r0 = com.bxkj.student.home.teaching.learning.detail.backup.j.l(r9)
                com.bxkj.student.home.teaching.learning.detail.backup.j r9 = r8.a
                long r2 = com.bxkj.student.home.teaching.learning.detail.backup.j.p(r9)
                long r0 = r0 - r2
                com.bxkj.student.home.teaching.learning.detail.backup.j r9 = r8.a
                android.widget.Button r9 = com.bxkj.student.home.teaching.learning.detail.backup.j.k(r9)
                com.bxkj.student.home.teaching.learning.detail.backup.j r2 = r8.a
                java.lang.String r2 = r2.C(r0)
                r9.setText(r2)
                com.bxkj.student.home.teaching.learning.detail.backup.j r9 = r8.a
                int r9 = com.bxkj.student.home.teaching.learning.detail.backup.j.m(r9)
                r2 = 0
                if (r9 == 0) goto L5c
                com.bxkj.student.home.teaching.learning.detail.backup.j r9 = r8.a
                long r4 = com.bxkj.student.home.teaching.learning.detail.backup.j.p(r9)
                com.bxkj.student.home.teaching.learning.detail.backup.j r9 = r8.a
                int r9 = com.bxkj.student.home.teaching.learning.detail.backup.j.m(r9)
                long r6 = (long) r9
                long r4 = r4 % r6
                int r9 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r9 != 0) goto L5c
                com.bxkj.student.home.teaching.learning.detail.backup.j r9 = r8.a
                int r9 = com.bxkj.student.home.teaching.learning.detail.backup.j.q(r9)
                r4 = 1
                if (r9 != r4) goto L4e
                com.bxkj.student.home.teaching.learning.detail.backup.j r9 = r8.a
                com.bxkj.student.home.teaching.learning.detail.backup.j.s(r9)
                goto L5c
            L4e:
                com.bxkj.student.home.teaching.learning.detail.backup.j r9 = r8.a
                int r9 = com.bxkj.student.home.teaching.learning.detail.backup.j.q(r9)
                r4 = 2
                if (r9 != r4) goto L5c
                com.bxkj.student.home.teaching.learning.detail.backup.j r9 = r8.a
                com.bxkj.student.home.teaching.learning.detail.backup.j.t(r9)
            L5c:
                int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r9 != 0) goto L7c
                com.bxkj.student.home.teaching.learning.detail.backup.j r9 = r8.a
                java.util.TimerTask r9 = r9.f905m
                r9.cancel()
                com.bxkj.student.home.teaching.learning.detail.backup.j r9 = r8.a
                java.util.Timer r9 = r9.f904l
                r9.cancel()
                com.bxkj.student.home.teaching.learning.detail.backup.j r9 = r8.a
                android.os.Handler r0 = r9.f911s
                java.util.TimerTask r9 = r9.f905m
                r0.removeCallbacks(r9)
                com.bxkj.student.home.teaching.learning.detail.backup.j r9 = r8.a
                com.bxkj.student.home.teaching.learning.detail.backup.j.u(r9)
            L7c:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements android.text.TextWatcher {
        final /* synthetic */ android.widget.EditText a;
        final /* synthetic */ android.widget.Button b;
        final /* synthetic */ com.bxkj.student.home.teaching.learning.detail.backup.j c;

        c(com.bxkj.student.home.teaching.learning.detail.backup.j r1, android.widget.EditText r2, android.widget.Button r3) {
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
                com.bxkj.student.home.teaching.learning.detail.backup.j r3 = r2.c
                android.content.Context r3 = com.bxkj.student.home.teaching.learning.detail.backup.j.o(r3)
                r1 = 2131099829(0x7f0600b5, float:1.7812022E38)
            L26:
                int r3 = androidx.core.content.ContextCompat.getColor(r3, r1)
                goto L35
            L2b:
                com.bxkj.student.home.teaching.learning.detail.backup.j r3 = r2.c
                android.content.Context r3 = com.bxkj.student.home.teaching.learning.detail.backup.j.o(r3)
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
    class d implements cn.bluemobi.dylan.base.view.iOSTwoButtonDialog.RightButtonOnClick {
        final /* synthetic */ com.bxkj.student.home.teaching.learning.detail.backup.j a;

        d(com.bxkj.student.home.teaching.learning.detail.backup.j r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public static /* synthetic */ kotlin.n1 a(com.bxkj.student.home.teaching.learning.detail.backup.j.d r0) {
                kotlin.n1 r0 = r0.b()
                return r0
        }

        private /* synthetic */ kotlin.n1 b() {
                r3 = this;
                android.content.Intent r0 = new android.content.Intent
                com.bxkj.student.home.teaching.learning.detail.backup.j r1 = r3.a
                android.content.Context r1 = com.bxkj.student.home.teaching.learning.detail.backup.j.o(r1)
                java.lang.Class<com.bxkj.student.home.teaching.learning.FaceDetectLearnActivity> r2 = com.bxkj.student.home.teaching.learning.FaceDetectLearnActivity.class
                r0.<init>(r1, r2)
                com.bxkj.student.home.teaching.learning.detail.backup.j r1 = r3.a
                com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment r1 = com.bxkj.student.home.teaching.learning.detail.backup.j.j(r1)
                r2 = 170(0xaa, float:2.38E-43)
                r1.startActivityForResult(r0, r2)
                com.bxkj.student.home.teaching.learning.detail.backup.j r0 = r3.a
                android.content.Context r0 = com.bxkj.student.home.teaching.learning.detail.backup.j.o(r0)
                androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
                r1 = 2130771987(0x7f010013, float:1.714708E38)
                r2 = 2130771986(0x7f010012, float:1.7147078E38)
                r0.overridePendingTransition(r1, r2)
                r0 = 0
                return r0
        }

        public void buttonRightOnClick() {
                r3 = this;
                com.bxkj.student.home.teaching.learning.detail.backup.j r0 = r3.a
                android.content.Context r0 = com.bxkj.student.home.teaching.learning.detail.backup.j.o(r0)
                androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
                com.bxkj.student.home.teaching.learning.detail.backup.k r1 = new com.bxkj.student.home.teaching.learning.detail.backup.k
                r1.<init>(r3)
                java.lang.String r2 = "人脸识别"
                com.bxkj.base.v2.common.ext.t.p(r0, r2, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.learning.detail.backup.j a;

        e(com.bxkj.student.home.teaching.learning.detail.backup.j r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r2) {
                r1 = this;
                cn.bluemobi.dylan.base.utils.a r2 = cn.bluemobi.dylan.base.utils.a.n()
                java.lang.Class<com.bxkj.student.home.teaching.learning.LearnHomeListActivity> r0 = com.bxkj.student.home.teaching.learning.LearnHomeListActivity.class
                android.app.Activity r2 = r2.getActivity(r0)
                com.bxkj.student.home.teaching.learning.LearnHomeListActivity r2 = (com.bxkj.student.home.teaching.learning.LearnHomeListActivity) r2
                if (r2 == 0) goto L11
                r2.S0()
            L11:
                return
        }
    }

    public j(com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment r4, android.content.Context r5, int r6, int r7, java.lang.String r8, java.lang.String r9, android.widget.Button r10, int r11, int r12) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.c = r0
            r3.d = r0
            r1 = 30
            r3.g = r1
            r1 = 0
            r3.k = r1
            r1 = 170(0xaa, float:2.38E-43)
            r3.f910r = r1
            com.bxkj.student.home.teaching.learning.detail.backup.j$b r1 = new com.bxkj.student.home.teaching.learning.detail.backup.j$b
            r1.<init>(r3)
            r3.f911s = r1
            r3.f912t = r0
            r3.f907o = r4
            r3.a = r5
            r3.e = r8
            long r4 = (long) r6
            r3.h = r4
            r3.b = r10
            r3.g = r7
            if (r7 != 0) goto L2f
            r3.d = r0
            goto L32
        L2f:
            int r6 = r6 / r7
            r3.d = r6
        L32:
            r3.f = r9
            r3.i = r11
            r3.j = r12
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "需要弹框次数="
            r4.append(r5)
            int r5 = r3.d
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.orhanobut.logger.j.c(r4)
            r3.A()
            return
    }

    private void A() {
            r4 = this;
            cn.bluemobi.dylan.sqlitelibrary.c r0 = cn.bluemobi.dylan.sqlitelibrary.c.h()
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r1 = r1.getUserId()
            java.lang.String r2 = r4.f
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            java.lang.Class<com.bxkj.student.home.teaching.learning.detail.db.ReadExceptionDataDB> r2 = com.bxkj.student.home.teaching.learning.detail.db.ReadExceptionDataDB.class
            java.lang.String r3 = "userId=? and detailId=?"
            java.util.List r0 = r0.query(r2, r3, r1)
            int r1 = r0.size()
            if (r1 <= 0) goto L44
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.bxkj.student.home.teaching.learning.detail.db.ReadExceptionDataDB r0 = (com.bxkj.student.home.teaching.learning.detail.db.ReadExceptionDataDB) r0
            r4.f909q = r0
            long r0 = r0.getCountTime()
            r4.k = r0
            com.bxkj.student.home.teaching.learning.detail.db.ReadExceptionDataDB r0 = r4.f909q
            int r0 = r0.getAlertCount()
            r4.c = r0
            com.bxkj.student.home.teaching.learning.detail.db.ReadExceptionDataDB r0 = r4.f909q
            long r0 = r0.getStartTime()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.f906n = r0
            return
        L44:
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.f906n = r0
            com.bxkj.student.home.teaching.learning.detail.db.ReadExceptionDataDB r0 = new com.bxkj.student.home.teaching.learning.detail.db.ReadExceptionDataDB
            r0.<init>()
            r4.f909q = r0
            java.lang.Long r0 = r4.f906n
            long r0 = r0.longValue()
            java.lang.String r2 = "yyyy-MM-dd HH:mm:ss"
            java.lang.String r0 = com.bxkj.student.run.app.utils.i.h(r0, r2)
            com.bxkj.student.home.teaching.learning.detail.db.ReadExceptionDataDB r1 = r4.f909q
            r1.setCreateTime(r0)
            com.bxkj.student.home.teaching.learning.detail.db.ReadExceptionDataDB r0 = r4.f909q
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r1 = r1.getUserId()
            r0.setUserId(r1)
            com.bxkj.student.home.teaching.learning.detail.db.ReadExceptionDataDB r0 = r4.f909q
            java.lang.String r1 = r4.f
            r0.setDetailId(r1)
            com.bxkj.student.home.teaching.learning.detail.db.ReadExceptionDataDB r0 = r4.f909q
            java.lang.Long r1 = r4.f906n
            long r1 = r1.longValue()
            r0.setStartTime(r1)
            cn.bluemobi.dylan.sqlitelibrary.c r0 = cn.bluemobi.dylan.sqlitelibrary.c.h()
            com.bxkj.student.home.teaching.learning.detail.db.ReadExceptionDataDB r1 = r4.f909q
            r0.insert(r1)
            return
    }

    private void D() {
            r5 = this;
            long r0 = r5.h
            long r2 = r5.k
            long r0 = r0 - r2
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lc
            goto L5f
        Lc:
            int r0 = r5.c
            int r1 = r5.d
            if (r0 != r1) goto L5f
            android.widget.Button r0 = r5.b
            int r1 = r5.i
            r2 = 1
            if (r1 != r2) goto L1c
            java.lang.String r1 = "开始答题"
            goto L1e
        L1c:
            java.lang.String r1 = "已完成"
        L1e:
            r0.setText(r1)
            android.widget.Button r0 = r5.b
            int r1 = r5.i
            if (r1 != r2) goto L29
            r1 = 1
            goto L2a
        L29:
            r1 = 0
        L2a:
            r0.setEnabled(r1)
            android.content.Context r0 = r5.a
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideLoadingDialog()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideSuccessMessage()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideOtherStatusMessage()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideOtherStatusMessage()
            java.lang.Class<com.bxkj.student.home.teaching.learning.m> r1 = com.bxkj.student.home.teaching.learning.m.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.student.home.teaching.learning.m r1 = (com.bxkj.student.home.teaching.learning.m) r1
            java.lang.String r3 = r5.f
            java.lang.String r4 = "4"
            rx.e r1 = r1.v(r3, r4, r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.teaching.learning.detail.backup.j$e r1 = new com.bxkj.student.home.teaching.learning.detail.backup.j$e
            r1.<init>(r5)
            r0.setDataListener(r1)
        L5f:
            return
    }

    private /* synthetic */ void E(cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1, android.widget.EditText r2, android.widget.ImageView r3) {
            r0 = this;
            r0.z(r1, r2, r3)
            return
    }

    private /* synthetic */ void F() {
            r1 = this;
            android.content.Context r0 = r1.a
            android.app.Activity r0 = (android.app.Activity) r0
            r0.finish()
            return
    }

    private /* synthetic */ void G() {
            r2 = this;
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
            android.content.Context r1 = r2.a
            r0.<init>(r1)
            java.lang.String r1 = "确定要取消本次学习吗？"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setMessage(r1)
            java.lang.String r1 = "继续"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setLeftButtonText(r1)
            java.lang.String r1 = "放弃"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setRightButtonText(r1)
            com.bxkj.student.home.teaching.learning.detail.backup.i r1 = new com.bxkj.student.home.teaching.learning.detail.backup.i
            r1.<init>(r2)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setRightButtonOnClickListener(r1)
            r0.show()
            return
    }

    private /* synthetic */ void H(android.widget.EditText r1, android.content.DialogInterface r2) {
            r0 = this;
            r0.M(r1)
            return
    }

    private /* synthetic */ void I() {
            r1 = this;
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r1.f908p
            r0.dismiss()
            android.content.Context r0 = r1.a
            android.app.Activity r0 = (android.app.Activity) r0
            r0.finish()
            return
    }

    private /* synthetic */ void J() {
            r2 = this;
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
            android.content.Context r1 = r2.a
            r0.<init>(r1)
            java.lang.String r1 = "确定要取消本次学习吗？"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setMessage(r1)
            java.lang.String r1 = "继续"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setLeftButtonText(r1)
            java.lang.String r1 = "放弃"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setRightButtonText(r1)
            com.bxkj.student.home.teaching.learning.detail.backup.c r1 = new com.bxkj.student.home.teaching.learning.detail.backup.c
            r1.<init>(r2)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setRightButtonOnClickListener(r1)
            r0.show()
            return
    }

    private /* synthetic */ void K() {
            r4 = this;
            com.bxkj.student.home.teaching.learning.detail.db.ReadExceptionDataDB r0 = r4.f909q
            long r1 = r4.k
            r0.setCountTime(r1)
            com.bxkj.student.home.teaching.learning.detail.db.ReadExceptionDataDB r0 = r4.f909q
            int r1 = r4.c
            r0.setAlertCount(r1)
            cn.bluemobi.dylan.sqlitelibrary.c r0 = cn.bluemobi.dylan.sqlitelibrary.c.h()
            com.bxkj.student.home.teaching.learning.detail.db.ReadExceptionDataDB r1 = r4.f909q
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getUserId()
            java.lang.String r3 = r4.f
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}
            java.lang.String r3 = "userId=? and detailId=?"
            int r0 = r0.update(r1, r3, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "update="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.orhanobut.logger.j.c(r0)
            return
    }

    private void L() {
            r2 = this;
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor()
            com.bxkj.student.home.teaching.learning.detail.backup.a r1 = new com.bxkj.student.home.teaching.learning.detail.backup.a
            r1.<init>(r2)
            r0.execute(r1)
            return
    }

    public static /* synthetic */ void a(com.bxkj.student.home.teaching.learning.detail.backup.j r0) {
            r0.F()
            return
    }

    public static /* synthetic */ void b(com.bxkj.student.home.teaching.learning.detail.backup.j r0) {
            r0.I()
            return
    }

    public static /* synthetic */ void c(android.widget.ImageView r0, android.view.View r1) {
            com.bxkj.base.util.d r1 = com.bxkj.base.util.d.e()
            android.graphics.Bitmap r1 = r1.a()
            r0.setImageBitmap(r1)
            return
    }

    public static /* synthetic */ boolean d(android.content.DialogInterface r0, int r1, android.view.KeyEvent r2) {
            r0 = 4
            if (r1 != r0) goto L5
            r0 = 1
            return r0
        L5:
            r0 = 0
            return r0
    }

    public static /* synthetic */ void e(com.bxkj.student.home.teaching.learning.detail.backup.j r0) {
            r0.K()
            return
    }

    public static /* synthetic */ void f(com.bxkj.student.home.teaching.learning.detail.backup.j r0) {
            r0.J()
            return
    }

    public static /* synthetic */ void g(com.bxkj.student.home.teaching.learning.detail.backup.j r0, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1, android.widget.EditText r2, android.widget.ImageView r3) {
            r0.E(r1, r2, r3)
            return
    }

    public static /* synthetic */ void h(com.bxkj.student.home.teaching.learning.detail.backup.j r0) {
            r0.G()
            return
    }

    public static /* synthetic */ void i(com.bxkj.student.home.teaching.learning.detail.backup.j r0, android.widget.EditText r1, android.content.DialogInterface r2) {
            r0.H(r1, r2)
            return
    }

    static /* bridge */ /* synthetic */ com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment j(com.bxkj.student.home.teaching.learning.detail.backup.j r0) {
            com.bxkj.student.home.teaching.learning.detail.backup.BottomFragment r0 = r0.f907o
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.Button k(com.bxkj.student.home.teaching.learning.detail.backup.j r0) {
            android.widget.Button r0 = r0.b
            return r0
    }

    static /* bridge */ /* synthetic */ long l(com.bxkj.student.home.teaching.learning.detail.backup.j r2) {
            long r0 = r2.h
            return r0
    }

    static /* bridge */ /* synthetic */ int m(com.bxkj.student.home.teaching.learning.detail.backup.j r0) {
            int r0 = r0.g
            return r0
    }

    static /* bridge */ /* synthetic */ boolean n(com.bxkj.student.home.teaching.learning.detail.backup.j r0) {
            boolean r0 = r0.f912t
            return r0
    }

    static /* bridge */ /* synthetic */ android.content.Context o(com.bxkj.student.home.teaching.learning.detail.backup.j r0) {
            android.content.Context r0 = r0.a
            return r0
    }

    static /* bridge */ /* synthetic */ long p(com.bxkj.student.home.teaching.learning.detail.backup.j r2) {
            long r0 = r2.k
            return r0
    }

    static /* bridge */ /* synthetic */ int q(com.bxkj.student.home.teaching.learning.detail.backup.j r0) {
            int r0 = r0.j
            return r0
    }

    static /* bridge */ /* synthetic */ void r(com.bxkj.student.home.teaching.learning.detail.backup.j r0, long r1) {
            r0.k = r1
            return
    }

    static /* bridge */ /* synthetic */ void s(com.bxkj.student.home.teaching.learning.detail.backup.j r0) {
            r0.w()
            return
    }

    static /* bridge */ /* synthetic */ void t(com.bxkj.student.home.teaching.learning.detail.backup.j r0) {
            r0.x()
            return
    }

    static /* bridge */ /* synthetic */ void u(com.bxkj.student.home.teaching.learning.detail.backup.j r0) {
            r0.D()
            return
    }

    static /* bridge */ /* synthetic */ void v(com.bxkj.student.home.teaching.learning.detail.backup.j r0) {
            r0.L()
            return
    }

    private void w() {
            r5 = this;
            r0 = 1
            r5.f912t = r0
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
            android.content.Context r1 = r5.a
            r0.<init>(r1)
            r1 = 2131296668(0x7f09019c, float:1.821126E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            java.lang.String r2 = "请输入验证码继续观看"
            r0.setMessage(r2)
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
            r3 = 2131297112(0x7f090358, float:1.821216E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            com.bxkj.base.util.d r4 = com.bxkj.base.util.d.e()
            android.graphics.Bitmap r4 = r4.a()
            r3.setImageBitmap(r4)
            com.bxkj.student.home.teaching.learning.detail.backup.d r4 = new com.bxkj.student.home.teaching.learning.detail.backup.d
            r4.<init>(r3)
            r3.setOnClickListener(r4)
            com.bxkj.student.home.teaching.learning.detail.backup.j$c r4 = new com.bxkj.student.home.teaching.learning.detail.backup.j$c
            r4.<init>(r5, r2, r1)
            r2.addTextChangedListener(r4)
            com.bxkj.student.home.teaching.learning.detail.backup.e r1 = new com.bxkj.student.home.teaching.learning.detail.backup.e
            r1.<init>(r5, r0, r2, r3)
            r0.setRightButtonOnClickListener(r1)
            com.bxkj.student.home.teaching.learning.detail.backup.f r1 = new com.bxkj.student.home.teaching.learning.detail.backup.f
            r1.<init>(r5)
            r0.setLeftButtonOnClickListener(r1)
            com.bxkj.student.home.teaching.learning.detail.backup.g r1 = new com.bxkj.student.home.teaching.learning.detail.backup.g
            r1.<init>()
            r0.setOnKeyListener(r1)
            com.bxkj.student.home.teaching.learning.detail.backup.h r1 = new com.bxkj.student.home.teaching.learning.detail.backup.h
            r1.<init>(r5, r2)
            r0.setOnShowListener(r1)
            r0.show()
            return
    }

    private void x() {
            r2 = this;
            r0 = 1
            r2.f912t = r0
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
            android.content.Context r1 = r2.a
            r0.<init>(r1)
            java.lang.String r1 = "学习已暂停，请先进行人脸识别"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setMessage(r1)
            r2.f908p = r0
            com.bxkj.student.home.teaching.learning.detail.backup.b r1 = new com.bxkj.student.home.teaching.learning.detail.backup.b
            r1.<init>(r2)
            r0.setLeftButtonOnClickListener(r1)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r2.f908p
            com.bxkj.student.home.teaching.learning.detail.backup.j$d r1 = new com.bxkj.student.home.teaching.learning.detail.backup.j$d
            r1.<init>(r2)
            r0.setRightButtonOnClickListener(r1)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r2.f908p
            r1 = 0
            r0.setClickAutoCancel(r1)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r2.f908p
            r0.setCancelable(r1)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r2.f908p
            r0.setCanceledOnTouchOutside(r1)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r2.f908p
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
            r2 = 0
            r1.f912t = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "已点击弹框次数="
            r2.append(r0)
            int r0 = r1.c
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.orhanobut.logger.j.c(r2)
            r1.D()
            return
    }

    private void z(cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r2, android.widget.EditText r3, android.widget.ImageView r4) {
            r1 = this;
            android.text.Editable r3 = r3.getText()
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r3.trim()
            com.bxkj.base.util.d r0 = com.bxkj.base.util.d.e()
            java.lang.String r0 = r0.d()
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L32
            android.content.Context r2 = r1.a
            java.lang.String r3 = "验证码错误"
            r0 = 0
            android.widget.Toast r2 = android.widget.Toast.makeText(r2, r3, r0)
            r2.show()
            com.bxkj.base.util.d r2 = com.bxkj.base.util.d.e()
            android.graphics.Bitmap r2 = r2.a()
            r4.setImageBitmap(r2)
            return
        L32:
            r1.y(r2)
            return
    }

    public void B() {
            r1 = this;
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r1.f908p
            r1.y(r0)
            return
    }

    public java.lang.String C(long r9) {
            r8 = this;
            r0 = 60
            long r2 = r9 / r0
            java.lang.String r4 = "0"
            r5 = 10
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 >= 0) goto L1c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            goto L20
        L1c:
            java.lang.String r2 = java.lang.String.valueOf(r2)
        L20:
            long r9 = r9 % r0
            int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r0 >= 0) goto L35
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            goto L39
        L35:
            java.lang.String r9 = java.lang.String.valueOf(r9)
        L39:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r2)
            java.lang.String r0 = ":"
            r10.append(r0)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            return r9
    }

    public void M(android.widget.EditText r3) {
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

    public void N() {
            r7 = this;
            com.bxkj.student.home.teaching.learning.detail.backup.j$a r0 = new com.bxkj.student.home.teaching.learning.detail.backup.j$a
            r0.<init>(r7)
            r7.f905m = r0
            java.util.Timer r1 = new java.util.Timer
            r1.<init>()
            r7.f904l = r1
            java.util.TimerTask r2 = r7.f905m
            r3 = 0
            r5 = 1000(0x3e8, double:4.94E-321)
            r1.schedule(r2, r3, r5)
            return
    }
}
