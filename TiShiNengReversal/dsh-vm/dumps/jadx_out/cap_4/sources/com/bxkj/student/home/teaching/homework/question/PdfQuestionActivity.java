package com.bxkj.student.home.teaching.homework.question;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class PdfQuestionActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.ImageView F0;
    private android.widget.TextView G0;
    private android.widget.Button H0;
    private android.widget.Button I0;
    private android.widget.TextView J0;
    private java.lang.String K0;
    private int L0;
    private java.lang.String M0;
    private android.widget.LinearLayout N0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> O0;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> P0;
    private int Q0;
    private final int R0;
    private android.widget.TextView Y;
    private android.widget.TextView Z;
    private android.widget.TextView a0;
    private android.widget.TextView b0;
    private android.widget.TextView c0;

    /* renamed from: k0, reason: collision with root package name */
    private androidx.recyclerview.widget.RecyclerView f848k0;

    /* renamed from: p0, reason: collision with root package name */
    private android.widget.ImageView f849p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.home.teaching.homework.question.PdfQuestionActivity k;

        a(com.bxkj.student.home.teaching.homework.question.PdfQuestionActivity r1, android.content.Context r2, int r3, java.util.List r4) {
                r0 = this;
                r0.k = r1
                r0.<init>(r2, r3, r4)
                return
        }

        public static /* synthetic */ void m(com.bxkj.student.home.teaching.homework.question.PdfQuestionActivity.a r0, java.util.Map r1, android.view.View r2) {
                r0.o(r1, r2)
                return
        }

        private /* synthetic */ void o(java.util.Map r4, android.view.View r5) {
                r3 = this;
                com.bxkj.student.home.teaching.homework.question.PdfQuestionActivity r5 = r3.k
                android.content.Intent r0 = new android.content.Intent
                android.content.Context r1 = r3.e
                java.lang.Class<com.bxkj.student.home.teaching.homework.question.PdfViewActivity> r2 = com.bxkj.student.home.teaching.homework.question.PdfViewActivity.class
                r0.<init>(r1, r2)
                java.lang.String r1 = "answerStr"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                java.lang.String r1 = "url"
                android.content.Intent r4 = r0.putExtra(r1, r4)
                r5.startActivity(r4)
                return
        }

        public /* bridge */ /* synthetic */ void c(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.lang.Object r2) {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                r0.n(r1, r2)
                return
        }

        public void n(cn.bluemobi.dylan.base.adapter.common.ViewHolder r6, java.util.Map<java.lang.String, java.lang.Object> r7) {
                r5 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "回答时间："
                r0.append(r1)
                java.lang.String r1 = "answerTime"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 2131298842(0x7f090a1a, float:1.8215669E38)
                r6.J(r1, r0)
                r0 = 2131297182(0x7f09039e, float:1.8212302E38)
                r1 = 2131231197(0x7f0801dd, float:1.8078468E38)
                r6.r(r0, r1)
                r0 = 2131296828(0x7f09023c, float:1.8211584E38)
                r1 = 0
                r6.N(r0, r1)
                java.lang.String r0 = "reviewTime"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r0)
                boolean r1 = android.text.TextUtils.isEmpty(r0)
                r2 = 1
                r1 = r1 ^ r2
                r3 = 2131298831(0x7f090a0f, float:1.8215646E38)
                r6.N(r3, r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = "批改时间："
                r1.append(r4)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                r6.J(r3, r0)
                java.lang.String r0 = "isRight"
                int r0 = cn.bluemobi.dylan.http.JsonParse.getInt(r7, r0)
                r1 = 2131298949(0x7f090a85, float:1.8215886E38)
                if (r0 != 0) goto L64
                java.lang.String r0 = "是否合格：不合格"
                r6.J(r1, r0)
                goto L74
            L64:
                if (r0 != r2) goto L6c
                java.lang.String r0 = "是否合格：合格"
                r6.J(r1, r0)
                goto L74
            L6c:
                r3 = 2
                if (r0 != r3) goto L74
                java.lang.String r0 = "是否合格：待批改"
                r6.J(r1, r0)
            L74:
                java.lang.String r0 = "note"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r0)
                boolean r1 = android.text.TextUtils.isEmpty(r0)
                r1 = r1 ^ r2
                r2 = 2131299078(0x7f090b06, float:1.8216147E38)
                r6.N(r2, r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "备注："
                r1.append(r3)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                r6.J(r2, r0)
                com.bxkj.student.home.teaching.homework.question.j r0 = new com.bxkj.student.home.teaching.homework.question.j
                r0.<init>(r5, r7)
                r7 = 2131296996(0x7f0902e4, float:1.8211924E38)
                r6.w(r7, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.homework.question.PdfQuestionActivity a;

        b(com.bxkj.student.home.teaching.homework.question.PdfQuestionActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.home.teaching.homework.question.PdfQuestionActivity r0 = r2.a
                android.widget.FrameLayout r0 = r0.P()
                r1 = 0
                r0.setVisibility(r1)
                com.bxkj.student.home.teaching.homework.question.PdfQuestionActivity r0 = r2.a
                com.bxkj.student.home.teaching.homework.question.PdfQuestionActivity.l0(r0, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.homework.question.PdfQuestionActivity a;

        c(com.bxkj.student.home.teaching.homework.question.PdfQuestionActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public static /* synthetic */ void a(com.bxkj.student.home.teaching.homework.question.PdfQuestionActivity.c r0, android.view.View r1) {
                r0.b(r1)
                return
        }

        private /* synthetic */ void b(android.view.View r1) {
                r0 = this;
                com.bxkj.student.home.teaching.homework.question.PdfQuestionActivity r1 = r0.a
                com.bxkj.student.home.teaching.homework.question.PdfQuestionActivity.k0(r1)
                return
        }

        public void netOnFailure(java.lang.Throwable r2) {
                r1 = this;
                super.netOnFailure(r2)
                boolean r2 = r2 instanceof java.net.SocketTimeoutException
                if (r2 == 0) goto L2a
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.home.teaching.homework.question.PdfQuestionActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.student.home.teaching.homework.question.PdfQuestionActivity.m0(r0)
                r2.<init>(r0)
                java.lang.String r0 = "上传超时,请检查网络后重试"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r0)
                java.lang.String r0 = "重试"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setOneButtonText(r0)
                com.bxkj.student.home.teaching.homework.question.k r0 = new com.bxkj.student.home.teaching.homework.question.k
                r0.<init>(r1)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setButtonOnClickListener(r0)
                r2.show()
            L2a:
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r1) {
                r0 = this;
                com.bxkj.student.home.teaching.homework.question.PdfQuestionActivity r1 = r0.a
                r1.finish()
                return
        }
    }

    public PdfQuestionActivity() {
            r1 = this;
            r1.<init>()
            r0 = 60
            r1.Q0 = r0
            r0 = 23
            r1.R0 = r0
            return
    }

    public static /* synthetic */ void g0(com.bxkj.student.home.teaching.homework.question.PdfQuestionActivity r0, android.view.View r1) {
            r0.s0(r1)
            return
    }

    public static /* synthetic */ void h0(com.bxkj.student.home.teaching.homework.question.PdfQuestionActivity r0, int r1, android.content.Intent r2) {
            r0.t0(r1, r2)
            return
    }

    public static /* synthetic */ void i0(com.bxkj.student.home.teaching.homework.question.PdfQuestionActivity r0, android.view.View r1) {
            r0.q0(r1)
            return
    }

    public static /* synthetic */ void j0(com.bxkj.student.home.teaching.homework.question.PdfQuestionActivity r0, android.view.View r1) {
            r0.r0(r1)
            return
    }

    static /* bridge */ /* synthetic */ void k0(com.bxkj.student.home.teaching.homework.question.PdfQuestionActivity r0) {
            r0.o0()
            return
    }

    static /* bridge */ /* synthetic */ void l0(com.bxkj.student.home.teaching.homework.question.PdfQuestionActivity r0, java.util.Map r1) {
            r0.u0(r1)
            return
    }

    static /* synthetic */ android.content.Context m0(com.bxkj.student.home.teaching.homework.question.PdfQuestionActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void n0() {
            r2 = this;
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.GET_CONTENT"
            r0.<init>(r1)
            java.lang.String r1 = "application/pdf"
            r0.setType(r1)
            java.lang.String r1 = "android.intent.category.OPENABLE"
            r0.addCategory(r1)
            t.b r1 = new t.b
            r1.<init>(r2)
            t.b r0 = r1.startActivityForResult(r0)
            com.bxkj.student.home.teaching.homework.question.i r1 = new com.bxkj.student.home.teaching.homework.question.i
            r1.<init>(r2)
            r0.c(r1)
            return
    }

    private void o0() {
            r5 = this;
            java.lang.String r0 = r5.M0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L19
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r1 = r5.V
            r0.<init>(r1)
            java.lang.String r1 = "请选择文件"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)
            r0.show()
            return
        L19:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r5.M0
            r0.<init>(r1)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L37
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r1 = r5.V
            r0.<init>(r1)
            java.lang.String r1 = "文件不存在！"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)
            r0.show()
            return
        L37:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "learnQuestionId"
            java.lang.String r2 = r5.K0
            okhttp3.MultipartBody$Part r1 = okhttp3.MultipartBody.Part.createFormData(r1, r2)
            r0.add(r1)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = r5.M0
            r1.<init>(r2)
            java.lang.String r2 = "application/octet-stream"
            okhttp3.MediaType r2 = okhttp3.MediaType.parse(r2)
            okhttp3.RequestBody r2 = okhttp3.RequestBody.create(r1, r2)
            java.lang.String r3 = "files"
            java.lang.String r1 = r1.getName()
            okhttp3.MultipartBody$Part r1 = okhttp3.MultipartBody.Part.createFormData(r3, r1, r2)
            r0.add(r1)
            java.lang.String r1 = "文件存在"
            com.orhanobut.logger.j.c(r1)
            android.content.Context r1 = r5.V
            cn.bluemobi.dylan.http.HttpRequest r1 = cn.bluemobi.dylan.http.Http.with(r1)
            java.lang.String r2 = "正在上传..."
            cn.bluemobi.dylan.http.HttpRequest r1 = r1.setLoadingMessage(r2)
            r2 = 3
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MINUTES
            cn.bluemobi.dylan.http.HttpRequest r1 = r1.setTimeout(r2, r4)
            java.lang.Class<com.bxkj.student.home.teaching.homework.a> r2 = com.bxkj.student.home.teaching.homework.a.class
            java.lang.Object r2 = cn.bluemobi.dylan.http.Http.getApiService(r2)
            com.bxkj.student.home.teaching.homework.a r2 = (com.bxkj.student.home.teaching.homework.a) r2
            rx.e r0 = r2.b(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r1.setObservable(r0)
            com.bxkj.student.home.teaching.homework.question.PdfQuestionActivity$c r1 = new com.bxkj.student.home.teaching.homework.question.PdfQuestionActivity$c
            r1.<init>(r5)
            r0.setDataListener(r1)
            return
    }

    private void p0() {
            r4 = this;
            android.content.Context r0 = r4.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<com.bxkj.student.home.teaching.homework.a> r1 = com.bxkj.student.home.teaching.homework.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.student.home.teaching.homework.a r1 = (com.bxkj.student.home.teaching.homework.a) r1
            java.lang.String r2 = r4.K0
            int r3 = r4.L0
            rx.e r1 = r1.c(r2, r3)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.teaching.homework.question.PdfQuestionActivity$b r1 = new com.bxkj.student.home.teaching.homework.question.PdfQuestionActivity$b
            r1.<init>(r4)
            r0.setDataListener(r1)
            return
    }

    private /* synthetic */ void q0(android.view.View r2) {
            r1 = this;
            java.lang.String r2 = r1.M0
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r0 = ""
            if (r2 != 0) goto Lc
            r1.M0 = r0
        Lc:
            android.widget.TextView r2 = r1.c0
            r2.setText(r0)
            android.widget.ImageView r2 = r1.f849p0
            r0 = 2131231203(0x7f0801e3, float:1.807848E38)
            r2.setImageResource(r0)
            android.widget.ImageView r2 = r1.F0
            r0 = 8
            r2.setVisibility(r0)
            android.widget.TextView r2 = r1.G0
            r2.setVisibility(r0)
            android.widget.Button r2 = r1.H0
            r2.setVisibility(r0)
            return
    }

    private /* synthetic */ void r0(android.view.View r3) {
            r2 = this;
            java.lang.String r3 = r2.M0
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto Lc
            r2.n0()
            return
        Lc:
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r0 = r2.V
            java.lang.Class<com.bxkj.student.home.teaching.homework.question.PdfViewActivity> r1 = com.bxkj.student.home.teaching.homework.question.PdfViewActivity.class
            r3.<init>(r0, r1)
            java.lang.String r0 = "filePath"
            java.lang.String r1 = r2.M0
            r3.putExtra(r0, r1)
            r2.startActivity(r3)
            return
    }

    private /* synthetic */ void s0(android.view.View r1) {
            r0 = this;
            r0.o0()
            return
    }

    private /* synthetic */ void t0(int r2, android.content.Intent r3) {
            r1 = this;
            if (r3 == 0) goto L67
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r2 < r0) goto L15
            android.content.Context r2 = r1.V
            android.net.Uri r3 = r3.getData()
            java.lang.String r2 = com.bxkj.student.common.utils.e.b(r2, r3)
            r1.M0 = r2
            goto L21
        L15:
            android.content.Context r2 = r1.V
            android.net.Uri r3 = r3.getData()
            java.lang.String r2 = com.bxkj.student.common.utils.e.c(r2, r3)
            r1.M0 = r2
        L21:
            java.lang.String r2 = r1.M0
            java.lang.String r2 = com.bxkj.base.util.file.b.i(r2)
            java.lang.String r3 = "pdf"
            boolean r2 = r3.equalsIgnoreCase(r2)
            if (r2 != 0) goto L43
            r2 = 0
            r1.M0 = r2
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r3 = r1.V
            r2.<init>(r3)
            java.lang.String r3 = "只能上传PDF文件"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
            r2.show()
            return
        L43:
            android.widget.ImageView r2 = r1.f849p0
            r3 = 2131689974(0x7f0f01f6, float:1.9008979E38)
            r2.setImageResource(r3)
            android.widget.Button r2 = r1.H0
            r3 = 0
            r2.setVisibility(r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "filePath="
            r2.append(r3)
            java.lang.String r3 = r1.M0
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.orhanobut.logger.j.c(r2)
        L67:
            return
    }

    private void u0(java.util.Map<java.lang.String, java.lang.Object> r7) {
            r6 = this;
            android.widget.TextView r0 = r6.Z
            java.lang.String r1 = "questionTypeName"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r1)
            r0.setText(r1)
            java.lang.String r0 = "isFlag"
            boolean r0 = cn.bluemobi.dylan.http.JsonParse.getBoolean(r7, r0)
            int r1 = r6.L0
            r2 = 0
            r3 = 8
            r4 = 1
            if (r1 != r4) goto L31
            android.widget.Button r0 = r6.I0
            java.lang.String r1 = "已合格"
            r0.setText(r1)
            android.widget.ImageView r0 = r6.f849p0
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r3)
            android.widget.Button r0 = r6.I0
            r0.setEnabled(r2)
            goto L82
        L31:
            r5 = 2
            if (r1 != r5) goto L4c
            android.widget.Button r0 = r6.I0
            java.lang.String r1 = "待批改"
            r0.setText(r1)
            android.widget.ImageView r0 = r6.f849p0
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r3)
            android.widget.Button r0 = r6.I0
            r0.setEnabled(r2)
            goto L82
        L4c:
            if (r0 == 0) goto L5b
            android.widget.Button r0 = r6.I0
            java.lang.String r1 = "提交"
            r0.setText(r1)
            android.widget.Button r0 = r6.I0
            r0.setEnabled(r4)
            goto L82
        L5b:
            android.widget.Button r0 = r6.I0
            java.lang.String r1 = "不合格"
            r0.setText(r1)
            android.widget.Button r0 = r6.I0
            r0.setEnabled(r2)
            android.widget.ImageView r0 = r6.f849p0
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r3)
            android.widget.TextView r0 = r6.J0
            r0.setVisibility(r2)
            android.widget.TextView r0 = r6.J0
            java.lang.String r1 = "markAnswer"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r1)
            r0.setText(r1)
        L82:
            java.lang.String r0 = "questionsRecord"
            java.util.List r0 = cn.bluemobi.dylan.http.JsonParse.getList(r7, r0)
            r6.O0 = r0
            java.lang.String r0 = "maxDuration"
            int r1 = r6.Q0
            int r0 = cn.bluemobi.dylan.http.JsonParse.getInt(r7, r0, r1)
            r6.Q0 = r0
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r6.O0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto La7
            android.widget.LinearLayout r0 = r6.N0
            r0.setVisibility(r3)
            androidx.recyclerview.widget.RecyclerView r0 = r6.f848k0
            r0.setVisibility(r3)
            goto Lae
        La7:
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r6.P0
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r6.O0
            r0.g(r1)
        Lae:
            android.widget.TextView r0 = r6.a0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "("
            r1.append(r2)
            java.lang.String r2 = "socre"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r2)
            r1.append(r2)
            java.lang.String r2 = "分)"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            android.widget.TextView r0 = r6.b0
            java.lang.String r1 = "questionName"
            java.lang.String r7 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r1)
            android.text.Spanned r7 = android.text.Html.fromHtml(r7)
            r0.setText(r7)
            return
    }

    public void L() {
            r2 = this;
            android.widget.Button r0 = r2.H0
            com.bxkj.student.home.teaching.homework.question.f r1 = new com.bxkj.student.home.teaching.homework.question.f
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            android.widget.ImageView r0 = r2.f849p0
            com.bxkj.student.home.teaching.homework.question.g r1 = new com.bxkj.student.home.teaching.homework.question.g
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            android.widget.Button r0 = r2.I0
            com.bxkj.student.home.teaching.homework.question.h r1 = new com.bxkj.student.home.teaching.homework.question.h
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492963(0x7f0c0063, float:1.8609393E38)
            return r0
    }

    public void R() {
            r4 = this;
            android.widget.FrameLayout r0 = r4.P()
            r1 = 8
            r0.setVisibility(r1)
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "questionId"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L1f
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r4.K0 = r0
        L1f:
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "isQualified"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L36
            android.content.Intent r0 = r4.getIntent()
            r2 = 0
            int r0 = r0.getIntExtra(r1, r2)
            r4.L0 = r0
        L36:
            androidx.recyclerview.widget.RecyclerView r0 = r4.f848k0
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r4.V
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            com.bxkj.student.home.teaching.homework.question.PdfQuestionActivity$a r0 = new com.bxkj.student.home.teaching.homework.question.PdfQuestionActivity$a
            android.content.Context r1 = r4.V
            r2 = 2131493270(0x7f0c0196, float:1.8610015E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.O0
            r0.<init>(r4, r1, r2, r3)
            r4.P0 = r0
            androidx.recyclerview.widget.RecyclerView r1 = r4.f848k0
            r1.setAdapter(r0)
            r4.p0()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "课后作业开始答题-PDF文件"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r2) {
            r1 = this;
            r2 = 2131298944(0x7f090a80, float:1.8215875E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.Y = r2
            r2 = 2131299171(0x7f090b63, float:1.8216336E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.Z = r2
            r2 = 2131299093(0x7f090b15, float:1.8216178E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.a0 = r2
            r2 = 2131299058(0x7f090af2, float:1.8216107E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.b0 = r2
            r2 = 2131298910(0x7f090a5e, float:1.8215806E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.c0 = r2
            r2 = 2131298423(0x7f090877, float:1.8214819E38)
            android.view.View r2 = r1.findViewById(r2)
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            r1.f848k0 = r2
            r2 = 2131297159(0x7f090387, float:1.8212255E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r1.f849p0 = r2
            r2 = 2131296828(0x7f09023c, float:1.8211584E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r1.F0 = r2
            r2 = 2131298887(0x7f090a47, float:1.821576E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.G0 = r2
            r2 = 2131296602(0x7f09015a, float:1.8211125E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            r1.H0 = r2
            r2 = 2131296599(0x7f090157, float:1.821112E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            r1.I0 = r2
            r2 = 2131299080(0x7f090b08, float:1.8216151E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.J0 = r2
            r2 = 2131298045(0x7f0906fd, float:1.8214052E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r1.N0 = r2
            android.widget.ImageView r2 = r1.f849p0
            r0 = 2131231203(0x7f0801e3, float:1.807848E38)
            r2.setImageResource(r0)
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}
