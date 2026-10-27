package com.bxkj.student.home.teaching.learning.question;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class VideoQuestionActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.ImageView F0;
    private android.widget.TextView G0;
    private android.widget.Button H0;
    private android.widget.Button I0;
    private java.lang.String J0;
    private int K0;
    private java.lang.String L0;
    private android.graphics.Bitmap M0;
    private android.widget.LinearLayout N0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> O0;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> P0;
    private int Q0;
    private android.app.Dialog R0;
    private final int S0;
    private android.widget.TextView Y;
    private android.widget.TextView Z;
    private android.widget.TextView a0;
    private android.widget.TextView b0;
    private android.widget.TextView c0;

    /* renamed from: k0, reason: collision with root package name */
    private androidx.recyclerview.widget.RecyclerView f960k0;

    /* renamed from: p0, reason: collision with root package name */
    private android.widget.ImageView f961p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity k;

        a(com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity r1, android.content.Context r2, int r3, java.util.List r4) {
                r0 = this;
                r0.k = r1
                r0.<init>(r2, r3, r4)
                return
        }

        public static /* synthetic */ void m(com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity.a r0, java.util.Map r1, android.view.View r2) {
                r0.o(r1, r2)
                return
        }

        private /* synthetic */ void o(java.util.Map r4, android.view.View r5) {
                r3 = this;
                com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity r5 = r3.k
                android.content.Intent r0 = new android.content.Intent
                android.content.Context r1 = r3.e
                java.lang.Class<com.bxkj.student.common.utils.video.OnLinePlayVideoActivity> r2 = com.bxkj.student.common.utils.video.OnLinePlayVideoActivity.class
                r0.<init>(r1, r2)
                java.lang.String r1 = "answerStr"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                java.lang.String r1 = "videoPath"
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
                java.lang.String r0 = "learnVideoImage"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r0)
                r1 = 2131231184(0x7f0801d0, float:1.8078442E38)
                r2 = 2131297182(0x7f09039e, float:1.8212302E38)
                r6.t(r2, r0, r1, r1)
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
                if (r0 != 0) goto L63
                java.lang.String r0 = "是否合格：不合格"
                r6.J(r1, r0)
                goto L73
            L63:
                if (r0 != r2) goto L6b
                java.lang.String r0 = "是否合格：合格"
                r6.J(r1, r0)
                goto L73
            L6b:
                r3 = 2
                if (r0 != r3) goto L73
                java.lang.String r0 = "是否合格：待批改"
                r6.J(r1, r0)
            L73:
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
                com.bxkj.student.home.teaching.learning.question.p r0 = new com.bxkj.student.home.teaching.learning.question.p
                r0.<init>(r5, r7)
                r7 = 2131296996(0x7f0902e4, float:1.8211924E38)
                r6.w(r7, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity a;

        b(com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity r0 = r2.a
                android.widget.FrameLayout r0 = r0.P()
                r1 = 0
                r0.setVisibility(r1)
                com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity r0 = r2.a
                com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity.z0(r0, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity a;

        c(com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public static /* synthetic */ void a(com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity.c r0, android.view.View r1) {
                r0.b(r1)
                return
        }

        private /* synthetic */ void b(android.view.View r1) {
                r0 = this;
                com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity r1 = r0.a
                com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity.x0(r1)
                return
        }

        public void netOnFailure(java.lang.Throwable r3) {
                r2 = this;
                super.netOnFailure(r3)
                boolean r0 = r3 instanceof java.net.SocketTimeoutException
                if (r0 == 0) goto L2b
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity r0 = r2.a
                android.content.Context r0 = com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity.A0(r0)
                r3.<init>(r0)
                java.lang.String r0 = "上传超时,请检查网络后重试"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r3.setMessage(r0)
                java.lang.String r0 = "重试"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r3.setOneButtonText(r0)
                com.bxkj.student.home.teaching.learning.question.q r0 = new com.bxkj.student.home.teaching.learning.question.q
                r0.<init>(r2)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r3.setButtonOnClickListener(r0)
                r3.show()
                return
            L2b:
                java.io.StringWriter r0 = new java.io.StringWriter
                r0.<init>()
                java.io.PrintWriter r1 = new java.io.PrintWriter
                r1.<init>(r0)
                r3.getClass()
                r0.toString()
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity r0 = r2.a
                android.content.Context r0 = com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity.B0(r0)
                r3.<init>(r0)
                java.lang.String r0 = "上传失败,请尝试切换网络后重试或者尝试直接从APP录制上传"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r3 = r3.setMessage(r0)
                r3.show()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r1) {
                r0 = this;
                com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity r1 = r0.a
                r1.finish()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d implements com.bxkj.student.common.utils.video.e.b {
        final android.app.ProgressDialog a;
        final /* synthetic */ java.lang.String b;
        final /* synthetic */ com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity c;

        d(com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity r1, java.lang.String r2) {
                r0 = this;
                r0.c = r1
                r0.b = r2
                r0.<init>()
                android.app.ProgressDialog r2 = new android.app.ProgressDialog
                android.content.Context r1 = com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity.C0(r1)
                r2.<init>(r1)
                r0.a = r2
                return
        }

        @Override // com.bxkj.student.common.utils.video.e.b
        public void a() {
                r2 = this;
                android.app.ProgressDialog r0 = r2.a
                if (r0 == 0) goto Lf
                boolean r0 = r0.isShowing()
                if (r0 == 0) goto Lf
                android.app.ProgressDialog r0 = r2.a
                r0.dismiss()
            Lf:
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity r1 = r2.c
                android.content.Context r1 = com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity.D0(r1)
                r0.<init>(r1)
                java.lang.String r1 = "压缩失败,请稍后再试"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)
                r0.show()
                return
        }

        @Override // com.bxkj.student.common.utils.video.e.b
        public void b(int r2) {
                r1 = this;
                android.app.ProgressDialog r0 = r1.a
                if (r0 == 0) goto Lf
                boolean r0 = r0.isShowing()
                if (r0 == 0) goto Lf
                android.app.ProgressDialog r0 = r1.a
                r0.setProgress(r2)
            Lf:
                return
        }

        @Override // com.bxkj.student.common.utils.video.e.b
        public void onStart() {
                r2 = this;
                android.app.ProgressDialog r0 = r2.a
                java.lang.String r1 = "正在压缩..."
                r0.setTitle(r1)
                android.app.ProgressDialog r0 = r2.a
                r1 = 1
                r0.setProgressStyle(r1)
                android.app.ProgressDialog r0 = r2.a
                r1 = 0
                r0.setIndeterminate(r1)
                android.app.ProgressDialog r0 = r2.a
                r0.setCanceledOnTouchOutside(r1)
                android.app.ProgressDialog r0 = r2.a
                r0.setProgress(r1)
                android.app.ProgressDialog r0 = r2.a
                r1 = 100
                r0.setMax(r1)
                android.app.ProgressDialog r0 = r2.a
                r0.show()
                return
        }

        @Override // com.bxkj.student.common.utils.video.e.b
        public void onSuccess(java.lang.String r5) {
                r4 = this;
                android.app.ProgressDialog r0 = r4.a
                if (r0 == 0) goto Lf
                boolean r0 = r0.isShowing()
                if (r0 == 0) goto Lf
                android.app.ProgressDialog r0 = r4.a
                r0.dismiss()
            Lf:
                com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity r0 = r4.c
                com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity.v0(r0, r5)
                com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity r0 = r4.c
                java.lang.String r1 = r4.b
                android.graphics.Bitmap r1 = com.bxkj.student.common.utils.video.h.a(r1)
                com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity.w0(r0, r1)
                com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity r0 = r4.c
                android.widget.ImageView r0 = com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity.q0(r0)
                com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity r1 = r4.c
                android.graphics.Bitmap r1 = com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity.u0(r1)
                r0.setImageBitmap(r1)
                com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity r0 = r4.c
                android.widget.Button r0 = com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity.o0(r0)
                r1 = 0
                r0.setVisibility(r1)
                com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity r0 = r4.c
                android.widget.ImageView r0 = com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity.p0(r0)
                r0.setVisibility(r1)
                com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity r0 = r4.c
                android.widget.TextView r0 = com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity.r0(r0)
                r0.setVisibility(r1)
                com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity r0 = r4.c
                android.widget.TextView r0 = com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity.r0(r0)
                com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity r1 = r4.c
                long r2 = com.bxkj.student.common.utils.video.h.b(r5)
                java.lang.String r5 = com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity.y0(r1, r2)
                r0.setText(r5)
                com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity r5 = r4.c
                android.widget.TextView r5 = com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity.s0(r5)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "您视频地址为:"
                r0.append(r1)
                com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity r1 = r4.c
                java.lang.String r1 = com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity.t0(r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r5.setHint(r0)
                return
        }
    }

    public VideoQuestionActivity() {
            r1 = this;
            r1.<init>()
            r0 = 60
            r1.Q0 = r0
            r0 = 187(0xbb, float:2.62E-43)
            r1.S0 = r0
            return
    }

    static /* synthetic */ android.content.Context A0(com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context B0(com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context C0(com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context D0(com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void E0() {
            r5 = this;
            java.lang.String r0 = r5.L0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L19
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r1 = r5.V
            r0.<init>(r1)
            java.lang.String r1 = "请拍摄视频"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)
            r0.show()
            return
        L19:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r5.L0
            r0.<init>(r1)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L27
            return
        L27:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "learnQuestionId"
            java.lang.String r2 = r5.J0
            okhttp3.MultipartBody$Part r1 = okhttp3.MultipartBody.Part.createFormData(r1, r2)
            r0.add(r1)
            android.graphics.Bitmap r1 = r5.M0
            java.lang.String r1 = com.bxkj.base.util.c.a(r1)
            java.lang.String r2 = "answer"
            okhttp3.MultipartBody$Part r1 = okhttp3.MultipartBody.Part.createFormData(r2, r1)
            r0.add(r1)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = r5.L0
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
            r2 = 10
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MINUTES
            cn.bluemobi.dylan.http.HttpRequest r1 = r1.setTimeout(r2, r4)
            java.lang.Class<com.bxkj.student.home.teaching.learning.m> r2 = com.bxkj.student.home.teaching.learning.m.class
            java.lang.Object r2 = cn.bluemobi.dylan.http.Http.getApiService(r2)
            com.bxkj.student.home.teaching.learning.m r2 = (com.bxkj.student.home.teaching.learning.m) r2
            rx.e r0 = r2.b(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r1.setObservable(r0)
            com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity$c r1 = new com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity$c
            r1.<init>(r5)
            r0.setDataListener(r1)
            return
    }

    private java.lang.String G0(long r3) {
            r2 = this;
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "mm:ss"
            r0.<init>(r1)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r3 = r0.format(r3)
            return r3
    }

    private void H0() {
            r4 = this;
            android.content.Context r0 = r4.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<com.bxkj.student.home.teaching.learning.m> r1 = com.bxkj.student.home.teaching.learning.m.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.student.home.teaching.learning.m r1 = (com.bxkj.student.home.teaching.learning.m) r1
            java.lang.String r2 = r4.J0
            int r3 = r4.K0
            rx.e r1 = r1.c(r2, r3)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity$b r1 = new com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity$b
            r1.<init>(r4)
            r0.setDataListener(r1)
            return
    }

    private /* synthetic */ void I0(android.view.View r2) {
            r1 = this;
            java.lang.String r2 = r1.L0
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r0 = ""
            if (r2 != 0) goto Lc
            r1.L0 = r0
        Lc:
            android.widget.TextView r2 = r1.c0
            r2.setText(r0)
            android.widget.ImageView r2 = r1.f961p0
            r0 = 2131231204(0x7f0801e4, float:1.8078482E38)
            r2.setImageResource(r0)
            android.widget.Button r2 = r1.H0
            r0 = 8
            r2.setVisibility(r0)
            android.widget.ImageView r2 = r1.F0
            r2.setVisibility(r0)
            android.widget.TextView r2 = r1.G0
            r2.setVisibility(r0)
            return
    }

    private /* synthetic */ void J0(android.view.View r3) {
            r2 = this;
            java.lang.String r3 = r2.L0
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto Lc
            r2.R0()
            return
        Lc:
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r0 = r2.V
            java.lang.Class<com.bxkj.student.common.utils.video.LocalVideoPreviewActivity> r1 = com.bxkj.student.common.utils.video.LocalVideoPreviewActivity.class
            r3.<init>(r0, r1)
            java.lang.String r0 = "filepath"
            java.lang.String r1 = r2.L0
            r3.putExtra(r0, r1)
            r2.startActivity(r3)
            return
    }

    private /* synthetic */ void K0(android.view.View r1) {
            r0 = this;
            r0.E0()
            return
    }

    private /* synthetic */ void L0(android.view.View r1) {
            r0 = this;
            android.app.Dialog r1 = r0.R0
            r1.dismiss()
            return
    }

    private /* synthetic */ kotlin.n1 M0() {
            r1 = this;
            r1.T0()
            r0 = 0
            return r0
    }

    private /* synthetic */ void N0(android.view.View r3) {
            r2 = this;
            android.app.Dialog r3 = r2.R0
            r3.dismiss()
            androidx.fragment.app.FragmentActivity r3 = r2.W
            com.bxkj.student.home.teaching.learning.question.h r0 = new com.bxkj.student.home.teaching.learning.question.h
            r0.<init>(r2)
            java.lang.String r1 = "录制视频"
            com.bxkj.base.v2.common.ext.t.B(r3, r1, r0)
            return
    }

    private /* synthetic */ void O0(android.view.View r1) {
            r0 = this;
            android.app.Dialog r1 = r0.R0
            r1.dismiss()
            r0.F0()
            return
    }

    private /* synthetic */ void P0(java.lang.String r1, android.graphics.Bitmap r2) {
            r0 = this;
            r0.S0(r1)
            return
    }

    private void Q0(java.util.Map<java.lang.String, java.lang.Object> r4) {
            r3 = this;
            java.lang.String r0 = "questionsRecord"
            java.util.List r0 = cn.bluemobi.dylan.http.JsonParse.getList(r4, r0)
            r3.O0 = r0
            java.lang.String r0 = "maxDuration"
            int r1 = r3.Q0
            int r0 = cn.bluemobi.dylan.http.JsonParse.getInt(r4, r0, r1)
            r3.Q0 = r0
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r3.O0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L27
            android.widget.LinearLayout r0 = r3.N0
            r1 = 8
            r0.setVisibility(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r3.f960k0
            r0.setVisibility(r1)
            goto L2e
        L27:
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r3.P0
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r3.O0
            r0.g(r1)
        L2e:
            android.widget.TextView r0 = r3.a0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "("
            r1.append(r2)
            java.lang.String r2 = "socre"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r2)
            r1.append(r2)
            java.lang.String r2 = "分)"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            android.widget.TextView r0 = r3.b0
            java.lang.String r1 = "questionName"
            java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
            android.text.Spanned r4 = android.text.Html.fromHtml(r4)
            r0.setText(r4)
            return
    }

    private void S0(java.lang.String r4) {
            r3 = this;
            com.bxkj.student.common.utils.video.e r0 = new com.bxkj.student.common.utils.video.e
            r0.<init>()
            android.content.Context r1 = r3.V
            com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity$d r2 = new com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity$d
            r2.<init>(r3, r4)
            r0.d(r1, r4, r2)
            return
    }

    private void T0() {
            r3 = this;
            com.bxkj.student.common.utils.video.g r0 = new com.bxkj.student.common.utils.video.g
            r0.<init>()
            int r1 = r3.Q0
            com.bxkj.student.home.teaching.learning.question.i r2 = new com.bxkj.student.home.teaching.learning.question.i
            r2.<init>(r3)
            r0.e(r3, r1, r2)
            return
    }

    public static /* synthetic */ void g0(com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity r0, android.view.View r1) {
            r0.I0(r1)
            return
    }

    public static /* synthetic */ void h0(com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity r0, android.view.View r1) {
            r0.J0(r1)
            return
    }

    public static /* synthetic */ void i0(com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity r0, android.view.View r1) {
            r0.K0(r1)
            return
    }

    public static /* synthetic */ void j0(com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity r0, android.view.View r1) {
            r0.L0(r1)
            return
    }

    public static /* synthetic */ kotlin.n1 k0(com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity r0) {
            kotlin.n1 r0 = r0.M0()
            return r0
    }

    public static /* synthetic */ void l0(com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity r0, android.view.View r1) {
            r0.O0(r1)
            return
    }

    public static /* synthetic */ void m0(com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity r0, android.view.View r1) {
            r0.N0(r1)
            return
    }

    public static /* synthetic */ void n0(com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity r0, java.lang.String r1, android.graphics.Bitmap r2) {
            r0.P0(r1, r2)
            return
    }

    static /* bridge */ /* synthetic */ android.widget.Button o0(com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity r0) {
            android.widget.Button r0 = r0.H0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.ImageView p0(com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity r0) {
            android.widget.ImageView r0 = r0.F0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.ImageView q0(com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity r0) {
            android.widget.ImageView r0 = r0.f961p0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView r0(com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity r0) {
            android.widget.TextView r0 = r0.G0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView s0(com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity r0) {
            android.widget.TextView r0 = r0.c0
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String t0(com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity r0) {
            java.lang.String r0 = r0.L0
            return r0
    }

    static /* bridge */ /* synthetic */ android.graphics.Bitmap u0(com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity r0) {
            android.graphics.Bitmap r0 = r0.M0
            return r0
    }

    static /* bridge */ /* synthetic */ void v0(com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity r0, java.lang.String r1) {
            r0.L0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void w0(com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity r0, android.graphics.Bitmap r1) {
            r0.M0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void x0(com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity r0) {
            r0.E0()
            return
    }

    static /* bridge */ /* synthetic */ java.lang.String y0(com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity r0, long r1) {
            java.lang.String r0 = r0.G0(r1)
            return r0
    }

    static /* bridge */ /* synthetic */ void z0(com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity r0, java.util.Map r1) {
            r0.Q0(r1)
            return
    }

    public void F0() {
            r2 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "android.intent.action.OPEN_DOCUMENT"
            r0.setAction(r1)
            java.lang.String r1 = "android.intent.category.OPENABLE"
            r0.addCategory(r1)
            java.lang.String r1 = "video/*"
            r0.setType(r1)
            java.lang.String r1 = "选择要录制的视频"
            android.content.Intent r0 = android.content.Intent.createChooser(r0, r1)
            r1 = 187(0xbb, float:2.62E-43)
            r2.startActivityForResult(r0, r1)
            return
    }

    public void L() {
            r2 = this;
            android.widget.Button r0 = r2.H0
            com.bxkj.student.home.teaching.learning.question.m r1 = new com.bxkj.student.home.teaching.learning.question.m
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            android.widget.ImageView r0 = r2.f961p0
            com.bxkj.student.home.teaching.learning.question.n r1 = new com.bxkj.student.home.teaching.learning.question.n
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            android.widget.Button r0 = r2.I0
            com.bxkj.student.home.teaching.learning.question.o r1 = new com.bxkj.student.home.teaching.learning.question.o
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
            java.lang.String r2 = "questionId"
            boolean r0 = r0.hasExtra(r2)
            if (r0 == 0) goto L1f
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r0 = r0.getStringExtra(r2)
            r4.J0 = r0
        L1f:
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r2 = "isQualified"
            boolean r0 = r0.hasExtra(r2)
            r3 = 0
            if (r0 == 0) goto L36
            android.content.Intent r0 = r4.getIntent()
            int r0 = r0.getIntExtra(r2, r3)
            r4.K0 = r0
        L36:
            int r0 = r4.K0
            r2 = 1
            if (r0 != r2) goto L53
            android.widget.Button r0 = r4.I0
            java.lang.String r2 = "已合格"
            r0.setText(r2)
            android.widget.ImageView r0 = r4.f961p0
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r1)
            android.widget.Button r0 = r4.I0
            r0.setEnabled(r3)
            goto L6d
        L53:
            r2 = 2
            if (r0 != r2) goto L6d
            android.widget.Button r0 = r4.I0
            java.lang.String r2 = "待批改"
            r0.setText(r2)
            android.widget.ImageView r0 = r4.f961p0
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r1)
            android.widget.Button r0 = r4.I0
            r0.setEnabled(r3)
        L6d:
            androidx.recyclerview.widget.RecyclerView r0 = r4.f960k0
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r4.V
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity$a r0 = new com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity$a
            android.content.Context r1 = r4.V
            r2 = 2131493270(0x7f0c0196, float:1.8610015E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.O0
            r0.<init>(r4, r1, r2, r3)
            r4.P0 = r0
            androidx.recyclerview.widget.RecyclerView r1 = r4.f960k0
            r1.setAdapter(r0)
            r4.H0()
            return
    }

    public void R0() {
            r7 = this;
            android.content.Context r0 = r7.V
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131493633(0x7f0c0301, float:1.8610752E38)
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r2)
            r1 = 2131298824(0x7f090a08, float:1.8215632E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = 2131298917(0x7f090a65, float:1.821582E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3 = 2131298826(0x7f090a0a, float:1.8215636E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            android.app.Dialog r4 = new android.app.Dialog
            android.content.Context r5 = r7.V
            r6 = 2132018385(0x7f1404d1, float:1.9675075E38)
            r4.<init>(r5, r6)
            r7.R0 = r4
            r4.setContentView(r0)
            android.app.Dialog r0 = r7.R0
            android.view.Window r0 = r0.getWindow()
            r4 = 80
            r0.setGravity(r4)
            android.view.WindowManager r0 = r7.getWindowManager()
            android.view.Display r0 = r0.getDefaultDisplay()
            android.app.Dialog r4 = r7.R0
            android.view.Window r4 = r4.getWindow()
            android.view.WindowManager$LayoutParams r4 = r4.getAttributes()
            int r0 = r0.getWidth()
            r4.width = r0
            android.app.Dialog r0 = r7.R0
            android.view.Window r0 = r0.getWindow()
            r0.setAttributes(r4)
            android.app.Dialog r0 = r7.R0
            r0.show()
            com.bxkj.student.home.teaching.learning.question.j r0 = new com.bxkj.student.home.teaching.learning.question.j
            r0.<init>(r7)
            r3.setOnClickListener(r0)
            java.lang.String r0 = "录制"
            r1.setText(r0)
            com.bxkj.student.home.teaching.learning.question.k r0 = new com.bxkj.student.home.teaching.learning.question.k
            r0.<init>(r7)
            r1.setOnClickListener(r0)
            com.bxkj.student.home.teaching.learning.question.l r0 = new com.bxkj.student.home.teaching.learning.question.l
            r0.<init>(r7)
            r2.setOnClickListener(r0)
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "开始答题-视频"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131298944(0x7f090a80, float:1.8215875E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.Y = r1
            r1 = 2131299171(0x7f090b63, float:1.8216336E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.Z = r1
            r1 = 2131299093(0x7f090b15, float:1.8216178E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.a0 = r1
            r1 = 2131299058(0x7f090af2, float:1.8216107E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.b0 = r1
            r1 = 2131298910(0x7f090a5e, float:1.8215806E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.c0 = r1
            r1 = 2131298423(0x7f090877, float:1.8214819E38)
            android.view.View r1 = r0.findViewById(r1)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r0.f960k0 = r1
            r1 = 2131297159(0x7f090387, float:1.8212255E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.f961p0 = r1
            r1 = 2131296602(0x7f09015a, float:1.8211125E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r0.H0 = r1
            r1 = 2131296828(0x7f09023c, float:1.8211584E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.F0 = r1
            r1 = 2131298887(0x7f090a47, float:1.821576E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.G0 = r1
            r1 = 2131296599(0x7f090157, float:1.821112E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r0.I0 = r1
            r1 = 2131298045(0x7f0906fd, float:1.8214052E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.N0 = r1
            return
    }

    public void onActivityResult(int r6, int r7, android.content.Intent r8) {
            r5 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onActivityResult(r6, r7, r8)
            r0 = 187(0xbb, float:2.62E-43)
            if (r6 != r0) goto L63
            r6 = -1
            if (r7 != r6) goto L63
            if (r8 == 0) goto L63
            android.content.Context r6 = r5.V
            android.net.Uri r7 = r8.getData()
            java.lang.String r6 = com.bxkj.student.common.utils.e.b(r6, r7)
            long r7 = com.bxkj.student.common.utils.video.h.b(r6)
            r0 = 1000(0x3e8, double:4.94E-321)
            long r0 = r7 / r0
            int r2 = r5.Q0
            long r2 = (long) r2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L4c
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r6 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r7 = r5.V
            r6.<init>(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "对不起,您选取的视频时长不能大于"
            r7.append(r8)
            int r8 = r5.Q0
            r7.append(r8)
            java.lang.String r8 = "秒"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r6 = r6.setMessage(r7)
            r6.show()
            return
        L4c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "duration="
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            com.orhanobut.logger.j.c(r7)
            r5.S0(r6)
        L63:
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}
