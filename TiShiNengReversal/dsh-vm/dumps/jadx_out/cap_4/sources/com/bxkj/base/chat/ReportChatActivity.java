package com.bxkj.base.chat;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nReportChatActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportChatActivity.kt\ncom/bxkj/base/chat/ReportChatActivity\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,186:1\n106#2:187\n78#2,22:188\n1869#3:210\n1870#3:212\n1#4:211\n*S KotlinDebug\n*F\n+ 1 ReportChatActivity.kt\ncom/bxkj/base/chat/ReportChatActivity\n*L\n145#1:187\n145#1:188,22\n155#1:210\n155#1:212\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class ReportChatActivity extends cn.bluemobi.dylan.base.BaseActivity {

    @org.jetbrains.annotations.Nullable
    private android.widget.EditText F0;

    @org.jetbrains.annotations.Nullable
    private android.widget.Button G0;

    @org.jetbrains.annotations.Nullable
    private androidx.recyclerview.widget.RecyclerView Y;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.util.Map<java.lang.String, java.lang.Object>> Z;

    @org.jetbrains.annotations.Nullable
    private java.lang.String a0;
    private int b0;

    @org.jetbrains.annotations.Nullable
    private java.lang.String c0;

    /* renamed from: k0, reason: collision with root package name */
    @org.jetbrains.annotations.Nullable
    private java.lang.String f568k0;

    /* renamed from: p0, reason: collision with root package name */
    @org.jetbrains.annotations.Nullable
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> f569p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.base.chat.ReportChatActivity a;

        a(com.bxkj.base.chat.ReportChatActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, ? extends java.lang.Object> r4) {
                r3 = this;
                java.lang.String r0 = "data"
                kotlin.jvm.internal.g0.p(r4, r0)
                com.bxkj.base.chat.ReportChatActivity r1 = r3.a
                java.lang.String r2 = "userIds"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r2)
                com.bxkj.base.chat.ReportChatActivity.j0(r1, r2)
                java.lang.String r1 = "messages"
                java.util.Map r4 = cn.bluemobi.dylan.http.JsonParse.getMap(r4, r1)
                java.util.List r4 = cn.bluemobi.dylan.http.JsonParse.getList(r4, r0)
                com.bxkj.base.chat.ReportChatActivity r0 = r3.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r0 = com.bxkj.base.chat.ReportChatActivity.h0(r0)
                if (r0 == 0) goto L25
                r0.g(r4)
            L25:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.base.chat.ReportChatActivity a;

        b(com.bxkj.base.chat.ReportChatActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public static /* synthetic */ void a(com.bxkj.base.chat.ReportChatActivity r0, android.view.View r1) {
                b(r0, r1)
                return
        }

        private static final void b(com.bxkj.base.chat.ReportChatActivity r0, android.view.View r1) {
                r0.finish()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, ? extends java.lang.Object> r3) {
                r2 = this;
                java.lang.String r0 = "data"
                kotlin.jvm.internal.g0.p(r3, r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.base.chat.ReportChatActivity r0 = r2.a
                android.content.Context r0 = com.bxkj.base.chat.ReportChatActivity.i0(r0)
                r3.<init>(r0)
                java.lang.String r0 = "举报成功，等待后审核，请耐心等待"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r3.setMessage(r0)
                com.bxkj.base.chat.ReportChatActivity r0 = r2.a
                com.bxkj.base.chat.q r1 = new com.bxkj.base.chat.q
                r1.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r3.setButtonOnClickListener(r1)
                r3.show()
                return
        }
    }

    public ReportChatActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.Z = r0
            r0 = 1
            r1.b0 = r0
            return
    }

    public static /* synthetic */ void g0(com.bxkj.base.chat.ReportChatActivity r0, android.view.View r1) {
            k0(r0, r1)
            return
    }

    public static final /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter h0(com.bxkj.base.chat.ReportChatActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.f569p0
            return r0
    }

    public static final /* synthetic */ android.content.Context i0(com.bxkj.base.chat.ReportChatActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    public static final /* synthetic */ void j0(com.bxkj.base.chat.ReportChatActivity r0, java.lang.String r1) {
            r0.f568k0 = r1
            return
    }

    private static final void k0(com.bxkj.base.chat.ReportChatActivity r0, android.view.View r1) {
            r0.n0()
            return
    }

    private static /* synthetic */ void l0() {
            return
    }

    private final void n0() {
            r14 = this;
            android.widget.EditText r0 = r14.F0
            if (r0 == 0) goto L9
            android.text.Editable r0 = r0.getText()
            goto La
        L9:
            r0 = 0
        La:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            r2 = 1
            int r1 = r1 - r2
            r3 = 0
            r4 = 0
            r5 = 0
        L17:
            if (r4 > r1) goto L3c
            if (r5 != 0) goto L1d
            r6 = r4
            goto L1e
        L1d:
            r6 = r1
        L1e:
            char r6 = r0.charAt(r6)
            r7 = 32
            int r6 = kotlin.jvm.internal.g0.t(r6, r7)
            if (r6 > 0) goto L2c
            r6 = 1
            goto L2d
        L2c:
            r6 = 0
        L2d:
            if (r5 != 0) goto L36
            if (r6 != 0) goto L33
            r5 = 1
            goto L17
        L33:
            int r4 = r4 + 1
            goto L17
        L36:
            if (r6 != 0) goto L39
            goto L3c
        L39:
            int r1 = r1 + (-1)
            goto L17
        L3c:
            int r1 = r1 + r2
            java.lang.CharSequence r0 = r0.subSequence(r4, r1)
            java.lang.String r0 = r0.toString()
            int r1 = r0.length()
            if (r1 != 0) goto L51
            java.lang.String r0 = "内容不能为空"
            r14.f0(r0)
            return
        L51:
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r1 = r1.getUserId()
            com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
            boolean r3 = r3.isLogin()
            if (r3 != 0) goto L6b
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r1 = r1.getTempUserId()
        L6b:
            r5 = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r3 = r14.f569p0
            if (r3 == 0) goto Lac
            java.util.List r3 = r3.d()
            if (r3 == 0) goto Lac
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L81:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lac
            java.lang.Object r4 = r3.next()
            java.util.Map r4 = (java.util.Map) r4
            com.bxkj.base.v2.common.utils.x r6 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r7 = "isChecked"
            r6.d(r4, r7)
            java.lang.String r7 = "userName"
            java.lang.String r7 = r6.t(r4, r7)
            r1.append(r7)
            java.lang.String r7 = ":"
            r1.append(r7)
            java.lang.String r7 = "msg"
            java.lang.String r4 = r6.t(r4, r7)
            r1.append(r4)
            goto L81
        Lac:
            android.content.Context r3 = r14.V
            cn.bluemobi.dylan.http.HttpRequest r3 = cn.bluemobi.dylan.http.Http.with(r3)
            cn.bluemobi.dylan.http.HttpRequest r13 = r3.hideSuccessMessage()
            java.lang.Class<w.f> r3 = w.f.class
            java.lang.Object r3 = cn.bluemobi.dylan.http.Http.getApiService(r3)
            w.f r3 = (w.f) r3
            com.bxkj.base.user.LoginUser r4 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r4 = r4.getSchoolId()
            android.content.Context r6 = r14.V
            java.lang.String r6 = com.bxkj.base.util.b0.h(r6)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "【举报聊天】"
            r7.append(r8)
            r7.append(r1)
            java.lang.String r1 = "【"
            r7.append(r1)
            r7.append(r0)
            java.lang.String r0 = "】"
            r7.append(r0)
            java.lang.String r8 = r7.toString()
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r10 = r0.getRealName()
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r11 = r0.getAccount()
            int r0 = r14.b0
            if (r0 != r2) goto L102
            java.lang.String r0 = r14.f568k0
        L100:
            r12 = r0
            goto L105
        L102:
            java.lang.String r0 = r14.c0
            goto L100
        L105:
            java.lang.String r7 = "Android"
            java.lang.String r9 = "a.jpg"
            rx.e r0 = r3.x(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            cn.bluemobi.dylan.http.HttpRequest r0 = r13.setObservable(r0)
            com.bxkj.base.chat.ReportChatActivity$b r1 = new com.bxkj.base.chat.ReportChatActivity$b
            r1.<init>(r14)
            r0.setDataListener(r1)
            return
    }

    public void L() {
            r2 = this;
            android.widget.Button r0 = r2.G0
            if (r0 == 0) goto Lc
            com.bxkj.base.chat.o r1 = new com.bxkj.base.chat.o
            r1.<init>(r2)
            r0.setOnClickListener(r1)
        Lc:
            return
    }

    protected int N() {
            r1 = this;
            int r0 = com.bxkj.base.R.layout.ac_report_chat
            return r0
    }

    public void R() {
            r4 = this;
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "chatName"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L16
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r4.a0 = r0
        L16:
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "chatType"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L2d
            android.content.Intent r0 = r4.getIntent()
            r2 = 1
            int r0 = r0.getIntExtra(r1, r2)
            r4.b0 = r0
        L2d:
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "groupId"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L43
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r4.c0 = r0
        L43:
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "userId"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L59
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r4.f568k0 = r0
        L59:
            android.content.Context r0 = r4.V
            int r1 = com.bxkj.base.R.layout.item_for_report_message
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2 = r4.Z
            com.bxkj.base.chat.ReportChatActivity$initData$1 r3 = new com.bxkj.base.chat.ReportChatActivity$initData$1
            r3.<init>(r0, r1, r2)
            r4.f569p0 = r3
            androidx.recyclerview.widget.RecyclerView r0 = r4.Y
            if (r0 == 0) goto L6d
            r0.setAdapter(r3)
        L6d:
            r4.m0()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "举报该聊天"
            r1.setTitle(r0)
            return
    }

    public void T(@org.jetbrains.annotations.Nullable android.os.Bundle r2) {
            r1 = this;
            int r2 = com.bxkj.base.R.id.recyclerView
            android.view.View r2 = r1.findViewById(r2)
            java.lang.String r0 = "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView"
            kotlin.jvm.internal.g0.n(r2, r0)
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            r1.Y = r2
            int r2 = com.bxkj.base.R.id.et_reply
            android.view.View r2 = r1.findViewById(r2)
            android.widget.EditText r2 = (android.widget.EditText) r2
            r1.F0 = r2
            int r2 = com.bxkj.base.R.id.bt_ok
            android.view.View r2 = r1.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            r1.G0 = r2
            return
    }

    public final void m0() {
            r9 = this;
            android.content.Context r0 = r9.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideLoadingDialog()
            java.lang.Class<w.a> r1 = w.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            r2 = r1
            w.a r2 = (w.a) r2
            int r3 = r9.b0
            r1 = 0
            r4 = 1
            if (r3 != r4) goto L1c
            java.lang.String r5 = r9.f568k0
            goto L1d
        L1c:
            r5 = r1
        L1d:
            r6 = 2
            if (r3 != r6) goto L22
            java.lang.String r1 = r9.c0
        L22:
            r6 = 100
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            r8 = 0
            r4 = r5
            r5 = r1
            rx.e r1 = r2.e(r3, r4, r5, r6, r7, r8)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.base.chat.ReportChatActivity$a r1 = new com.bxkj.base.chat.ReportChatActivity$a
            r1.<init>(r9)
            r0.setDataListener(r1)
            return
    }

    public void onClick(@org.jetbrains.annotations.Nullable android.view.View r1) {
            r0 = this;
            return
    }
}
