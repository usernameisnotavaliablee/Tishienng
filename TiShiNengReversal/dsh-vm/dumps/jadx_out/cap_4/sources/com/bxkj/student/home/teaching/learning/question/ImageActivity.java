package com.bxkj.student.home.teaching.learning.question;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ImageActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.LinearLayout F0;
    private java.lang.String G0;
    private int H0;
    private cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> I0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> J0;
    private cn.bluemobi.dylan.base.view.MyGridView Y;
    private android.widget.Button Z;
    private java.util.List<java.lang.String> a0;
    private cn.bluemobi.dylan.base.adapter.c b0;
    private cn.bluemobi.dylan.base.view.MyListView c0;

    /* renamed from: k0, reason: collision with root package name */
    private android.widget.TextView f954k0;

    /* renamed from: p0, reason: collision with root package name */
    private android.widget.TextView f955p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.home.teaching.learning.question.ImageActivity e;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bxkj.student.home.teaching.learning.question.ImageActivity$a$a, reason: collision with other inner class name */
        class C0093a extends cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.lang.String> {
            final /* synthetic */ com.bxkj.student.home.teaching.learning.question.ImageActivity.a e;

            C0093a(com.bxkj.student.home.teaching.learning.question.ImageActivity.a r1, android.content.Context r2, int r3, java.util.List r4) {
                    r0 = this;
                    r0.e = r1
                    r0.<init>(r2, r3, r4)
                    return
            }

            public /* bridge */ /* synthetic */ void a(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.lang.Object r2) {
                    r0 = this;
                    java.lang.String r2 = (java.lang.String) r2
                    r0.d(r1, r2)
                    return
            }

            public void d(cn.bluemobi.dylan.base.adapter.common.ViewHolder r3, java.lang.String r4) {
                    r2 = this;
                    r0 = 2131297161(0x7f090389, float:1.821226E38)
                    r1 = 2131231184(0x7f0801d0, float:1.8078442E38)
                    r3.t(r0, r4, r1, r1)
                    return
            }
        }

        a(com.bxkj.student.home.teaching.learning.question.ImageActivity r1, android.content.Context r2, int r3, java.util.List r4) {
                r0 = this;
                r0.e = r1
                r0.<init>(r2, r3, r4)
                return
        }

        public static /* synthetic */ void d(com.bxkj.student.home.teaching.learning.question.ImageActivity.a r0, java.lang.String[] r1, android.widget.AdapterView r2, android.view.View r3, int r4, long r5) {
                r0.f(r1, r2, r3, r4, r5)
                return
        }

        private /* synthetic */ void f(java.lang.String[] r1, android.widget.AdapterView r2, android.view.View r3, int r4, long r5) {
                r0 = this;
                r0.g(r1, r4)
                return
        }

        private void g(java.lang.String[] r4, int r5) {
                r3 = this;
                android.content.Intent r0 = new android.content.Intent
                android.content.Context r1 = r3.a
                java.lang.Class<cn.bluemobi.dylan.photoview.ImagePagerActivity> r2 = cn.bluemobi.dylan.photoview.ImagePagerActivity.class
                r0.<init>(r1, r2)
                java.lang.String r1 = "image_urls"
                r0.putExtra(r1, r4)
                java.lang.String r4 = "image_index"
                r0.putExtra(r4, r5)
                com.bxkj.student.home.teaching.learning.question.ImageActivity r4 = r3.e
                r4.startActivity(r0)
                com.bxkj.student.home.teaching.learning.question.ImageActivity r4 = r3.e
                r5 = 2130772094(0x7f01007e, float:1.7147297E38)
                r0 = 2130772095(0x7f01007f, float:1.7147299E38)
                r4.overridePendingTransition(r5, r0)
                return
        }

        public /* bridge */ /* synthetic */ void a(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.lang.Object r2) {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                r0.e(r1, r2)
                return
        }

        public void e(cn.bluemobi.dylan.base.adapter.common.ViewHolder r7, java.util.Map<java.lang.String, java.lang.Object> r8) {
                r6 = this;
                r0 = 2131298200(0x7f090798, float:1.8214366E38)
                android.view.View r0 = r7.h(r0)
                cn.bluemobi.dylan.base.view.MyGridView r0 = (cn.bluemobi.dylan.base.view.MyGridView) r0
                java.lang.String r1 = "answerStr"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r1)
                java.lang.String r2 = ","
                java.lang.String[] r1 = r1.split(r2)
                java.util.List r2 = java.util.Arrays.asList(r1)
                com.bxkj.student.home.teaching.learning.question.ImageActivity$a$a r3 = new com.bxkj.student.home.teaching.learning.question.ImageActivity$a$a
                android.content.Context r4 = r6.a
                r5 = 2131493280(0x7f0c01a0, float:1.8610036E38)
                r3.<init>(r6, r4, r5, r2)
                r0.setAdapter(r3)
                com.bxkj.student.home.teaching.learning.question.e r2 = new com.bxkj.student.home.teaching.learning.question.e
                r2.<init>(r6, r1)
                r0.setOnItemClickListener(r2)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "回答时间："
                r0.append(r1)
                java.lang.String r1 = "answerTime"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 2131298842(0x7f090a1a, float:1.8215669E38)
                r7.J(r1, r0)
                java.lang.String r0 = "reviewTime"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r0)
                boolean r1 = android.text.TextUtils.isEmpty(r0)
                r2 = 1
                r1 = r1 ^ r2
                r3 = 2131298831(0x7f090a0f, float:1.8215646E38)
                r7.N(r3, r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = "批改时间："
                r1.append(r4)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                r7.J(r3, r0)
                java.lang.String r0 = "isRight"
                int r0 = cn.bluemobi.dylan.http.JsonParse.getInt(r8, r0)
                r1 = 2131298949(0x7f090a85, float:1.8215886E38)
                if (r0 != 0) goto L82
                java.lang.String r0 = "是否合格：不合格"
                r7.J(r1, r0)
                goto L92
            L82:
                if (r0 != r2) goto L8a
                java.lang.String r0 = "是否合格：合格"
                r7.J(r1, r0)
                goto L92
            L8a:
                r3 = 2
                if (r0 != r3) goto L92
                java.lang.String r0 = "是否合格：待批改"
                r7.J(r1, r0)
            L92:
                java.lang.String r0 = "note"
                java.lang.String r8 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r0)
                boolean r0 = android.text.TextUtils.isEmpty(r8)
                r0 = r0 ^ r2
                r1 = 2131299078(0x7f090b06, float:1.8216147E38)
                r7.N(r1, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "备注："
                r0.append(r2)
                r0.append(r8)
                java.lang.String r8 = r0.toString()
                r7.J(r1, r8)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.learning.question.ImageActivity a;

        b(com.bxkj.student.home.teaching.learning.question.ImageActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.home.teaching.learning.question.ImageActivity r0 = r2.a
                android.widget.FrameLayout r0 = r0.P()
                r1 = 0
                r0.setVisibility(r1)
                com.bxkj.student.home.teaching.learning.question.ImageActivity r0 = r2.a
                com.bxkj.student.home.teaching.learning.question.ImageActivity.i0(r0, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.learning.question.ImageActivity a;

        c(com.bxkj.student.home.teaching.learning.question.ImageActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r1) {
                r0 = this;
                com.bxkj.student.home.teaching.learning.question.ImageActivity r1 = r0.a
                r1.finish()
                return
        }
    }

    public ImageActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a0 = r0
            return
    }

    public static /* synthetic */ void g0(com.bxkj.student.home.teaching.learning.question.ImageActivity r0, android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0.n0(r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ kotlin.n1 h0(com.bxkj.student.home.teaching.learning.question.ImageActivity r0, java.io.File r1) {
            kotlin.n1 r0 = r0.m0(r1)
            return r0
    }

    static /* bridge */ /* synthetic */ void i0(com.bxkj.student.home.teaching.learning.question.ImageActivity r0, java.util.Map r1) {
            r0.o0(r1)
            return
    }

    private void j0() {
            r5 = this;
            java.util.List<java.lang.String> r0 = r5.a0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L19
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r1 = r5.V
            r0.<init>(r1)
            java.lang.String r1 = "请至少上传一张图片"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)
            r0.show()
            return
        L19:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "learnQuestionId"
            java.lang.String r2 = r5.G0
            okhttp3.MultipartBody$Part r1 = okhttp3.MultipartBody.Part.createFormData(r1, r2)
            r0.add(r1)
            java.util.List<java.lang.String> r1 = r5.a0
            java.util.Iterator r1 = r1.iterator()
        L2f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L58
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.io.File r3 = new java.io.File
            r3.<init>(r2)
            java.lang.String r2 = "application/octet-stream"
            okhttp3.MediaType r2 = okhttp3.MediaType.parse(r2)
            okhttp3.RequestBody r2 = okhttp3.RequestBody.create(r3, r2)
            java.lang.String r4 = "files"
            java.lang.String r3 = r3.getName()
            okhttp3.MultipartBody$Part r2 = okhttp3.MultipartBody.Part.createFormData(r4, r3, r2)
            r0.add(r2)
            goto L2f
        L58:
            android.content.Context r1 = r5.V
            cn.bluemobi.dylan.http.HttpRequest r1 = cn.bluemobi.dylan.http.Http.with(r1)
            r2 = 3
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MINUTES
            cn.bluemobi.dylan.http.HttpRequest r1 = r1.setTimeout(r2, r4)
            java.lang.Class<com.bxkj.student.home.teaching.learning.m> r2 = com.bxkj.student.home.teaching.learning.m.class
            java.lang.Object r2 = cn.bluemobi.dylan.http.Http.getApiService(r2)
            com.bxkj.student.home.teaching.learning.m r2 = (com.bxkj.student.home.teaching.learning.m) r2
            rx.e r0 = r2.b(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r1.setObservable(r0)
            com.bxkj.student.home.teaching.learning.question.ImageActivity$c r1 = new com.bxkj.student.home.teaching.learning.question.ImageActivity$c
            r1.<init>(r5)
            r0.setDataListener(r1)
            return
    }

    private void l0() {
            r4 = this;
            android.content.Context r0 = r4.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<com.bxkj.student.home.teaching.learning.m> r1 = com.bxkj.student.home.teaching.learning.m.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.student.home.teaching.learning.m r1 = (com.bxkj.student.home.teaching.learning.m) r1
            java.lang.String r2 = r4.G0
            int r3 = r4.H0
            rx.e r1 = r1.c(r2, r3)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.home.teaching.learning.question.ImageActivity$b r1 = new com.bxkj.student.home.teaching.learning.question.ImageActivity$b
            r1.<init>(r4)
            r0.setDataListener(r1)
            return
    }

    private /* synthetic */ kotlin.n1 m0(java.io.File r2) {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.a0
            java.lang.String r2 = r2.getPath()
            r0.add(r2)
            cn.bluemobi.dylan.base.adapter.c r2 = r1.b0
            java.util.List<java.lang.String> r0 = r1.a0
            r2.c(r0)
            r2 = 0
            return r2
    }

    private /* synthetic */ void n0(android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            java.util.List<java.lang.String> r1 = r0.a0
            int r1 = r1.size()
            if (r3 != r1) goto L15
            com.bxkj.base.v2.common.utils.w r1 = com.bxkj.base.v2.common.utils.w.a
            androidx.fragment.app.FragmentActivity r2 = r0.W
            com.bxkj.student.home.teaching.learning.question.c r3 = new com.bxkj.student.home.teaching.learning.question.c
            r3.<init>(r0)
            r1.q(r2, r3)
            return
        L15:
            android.content.Context r1 = r0.V
            java.util.List<java.lang.String> r2 = r0.a0
            com.bxkj.base.util.n.c(r1, r2, r3)
            return
    }

    private void o0(java.util.Map<java.lang.String, java.lang.Object> r4) {
            r3 = this;
            java.lang.String r0 = "questionsRecord"
            java.util.List r0 = cn.bluemobi.dylan.http.JsonParse.getList(r4, r0)
            r3.J0 = r0
            cn.bluemobi.dylan.base.adapter.c r0 = r3.b0
            java.lang.String r1 = "pictureCount"
            r2 = 3
            int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r4, r1, r2)
            r0.e(r1)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r3.J0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L29
            android.widget.LinearLayout r0 = r3.F0
            r1 = 8
            r0.setVisibility(r1)
            cn.bluemobi.dylan.base.view.MyListView r0 = r3.c0
            r0.setVisibility(r1)
            goto L30
        L29:
            cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> r0 = r3.I0
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r3.J0
            r0.c(r1)
        L30:
            android.widget.TextView r0 = r3.f954k0
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
            android.widget.TextView r0 = r3.f955p0
            java.lang.String r1 = "questionName"
            java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
            android.text.Spanned r4 = android.text.Html.fromHtml(r4)
            r0.setText(r4)
            return
    }

    public static byte[] p0(java.lang.String r9) {
            r1 = 0
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L48
            java.lang.String r2 = "r"
            r0.<init>(r9, r2)     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L48
            java.nio.channels.FileChannel r3 = r0.getChannel()     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L48
            java.nio.channels.FileChannel$MapMode r4 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            long r7 = r3.size()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            r5 = 0
            java.nio.MappedByteBuffer r9 = r3.map(r4, r5, r7)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            java.nio.MappedByteBuffer r9 = r9.load()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            boolean r0 = r9.isLoaded()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            com.orhanobut.logger.j.c(r0)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            long r4 = r3.size()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            int r0 = (int) r4     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            int r2 = r9.remaining()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            if (r2 <= 0) goto L41
            int r2 = r9.remaining()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            r4 = 0
            r9.get(r0, r4, r2)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            goto L41
        L3d:
            r0 = move-exception
            r9 = r0
            r1 = r3
            goto L4a
        L41:
            r3.close()     // Catch: java.io.IOException -> L44
        L44:
            return r0
        L45:
            r0 = move-exception
            r9 = r0
            goto L4a
        L48:
            r3 = r1
            goto L4e
        L4a:
            r1.close()     // Catch: java.io.IOException -> L4d
        L4d:
            throw r9
        L4e:
            r3.close()     // Catch: java.io.IOException -> L51
        L51:
            return r1
    }

    public void L() {
            r2 = this;
            cn.bluemobi.dylan.base.view.MyGridView r0 = r2.Y
            com.bxkj.student.home.teaching.learning.question.d r1 = new com.bxkj.student.home.teaching.learning.question.d
            r1.<init>(r2)
            r0.setOnItemClickListener(r1)
            android.widget.Button r0 = r2.Z
            r0.setOnClickListener(r2)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492957(0x7f0c005d, float:1.860938E38)
            return r0
    }

    public void R() {
            r5 = this;
            android.widget.FrameLayout r0 = r5.P()
            r1 = 8
            r0.setVisibility(r1)
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r2 = "questionId"
            boolean r0 = r0.hasExtra(r2)
            if (r0 == 0) goto L1f
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r0 = r0.getStringExtra(r2)
            r5.G0 = r0
        L1f:
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r2 = "isQualified"
            boolean r0 = r0.hasExtra(r2)
            r3 = 0
            if (r0 == 0) goto L36
            android.content.Intent r0 = r5.getIntent()
            int r0 = r0.getIntExtra(r2, r3)
            r5.H0 = r0
        L36:
            int r0 = r5.H0
            r2 = 1
            if (r0 != r2) goto L4d
            android.widget.Button r0 = r5.Z
            java.lang.String r2 = "已合格"
            r0.setText(r2)
            cn.bluemobi.dylan.base.view.MyGridView r0 = r5.Y
            r0.setVisibility(r1)
            android.widget.Button r0 = r5.Z
            r0.setEnabled(r3)
            goto L61
        L4d:
            r2 = 2
            if (r0 != r2) goto L61
            android.widget.Button r0 = r5.Z
            java.lang.String r2 = "待批改"
            r0.setText(r2)
            cn.bluemobi.dylan.base.view.MyGridView r0 = r5.Y
            r0.setVisibility(r1)
            android.widget.Button r0 = r5.Z
            r0.setEnabled(r3)
        L61:
            com.bxkj.student.home.teaching.learning.question.ImageActivity$a r0 = new com.bxkj.student.home.teaching.learning.question.ImageActivity$a
            android.content.Context r1 = r5.V
            r2 = 2131493267(0x7f0c0193, float:1.861001E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r5.J0
            r0.<init>(r5, r1, r2, r3)
            r5.I0 = r0
            cn.bluemobi.dylan.base.view.MyListView r1 = r5.c0
            r1.setAdapter(r0)
            cn.bluemobi.dylan.base.adapter.c r0 = new cn.bluemobi.dylan.base.adapter.c
            java.util.List<java.lang.String> r1 = r5.a0
            android.content.Context r2 = r5.V
            r3 = 1092616192(0x41200000, float:10.0)
            int r3 = cn.bluemobi.dylan.base.utils.u.a(r3, r2)
            r4 = 4
            r0.<init>(r1, r2, r4, r3)
            r5.b0 = r0
            r1 = 3
            r0.e(r1)
            cn.bluemobi.dylan.base.view.MyGridView r0 = r5.Y
            cn.bluemobi.dylan.base.adapter.c r1 = r5.b0
            r0.setAdapter(r1)
            r5.l0()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "开始答题-拍照"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131297030(0x7f090306, float:1.8211993E38)
            android.view.View r1 = r0.findViewById(r1)
            cn.bluemobi.dylan.base.view.MyGridView r1 = (cn.bluemobi.dylan.base.view.MyGridView) r1
            r0.Y = r1
            r1 = 2131298423(0x7f090877, float:1.8214819E38)
            android.view.View r1 = r0.findViewById(r1)
            cn.bluemobi.dylan.base.view.MyListView r1 = (cn.bluemobi.dylan.base.view.MyListView) r1
            r0.c0 = r1
            r1 = 2131299093(0x7f090b15, float:1.8216178E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f954k0 = r1
            r1 = 2131299058(0x7f090af2, float:1.8216107E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f955p0 = r1
            r1 = 2131298045(0x7f0906fd, float:1.8214052E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.F0 = r1
            r1 = 2131296599(0x7f090157, float:1.821112E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r0.Z = r1
            return
    }

    public java.util.Map<java.lang.String, okhttp3.RequestBody> k0(java.lang.String r7, java.util.List<java.io.File> r8) {
            r6 = this;
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r8.size()
            if (r1 >= r2) goto L3a
            java.lang.Object r2 = r8.get(r1)
            java.io.File r2 = (java.io.File) r2
            java.lang.String r3 = "image/png"
            okhttp3.MediaType r3 = okhttp3.MediaType.parse(r3)
            okhttp3.RequestBody r3 = okhttp3.RequestBody.create(r3, r2)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r7)
            java.lang.String r5 = "\"; filename=\""
            r4.append(r5)
            java.lang.String r2 = r2.getName()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r0.put(r2, r3)
            int r1 = r1 + 1
            goto L6
        L3a:
            return r0
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            r0.j0()
            return
    }
}
