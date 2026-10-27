package com.bxkj.student.life.lost;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class PublishLostActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private androidx.cardview.widget.CardView F0;
    private android.widget.LinearLayout G0;
    private androidx.recyclerview.widget.RecyclerView H0;
    private android.widget.RadioGroup I0;
    private int J0;
    private android.widget.Spinner K0;
    private cn.bluemobi.dylan.base.view.MyGridView L0;
    private java.util.List<java.lang.String> M0;
    private final int N0;
    private cn.bluemobi.dylan.base.adapter.c O0;
    private cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> P0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> Q0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> R0;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> S0;
    private android.widget.EditText Y;
    private android.widget.EditText Z;
    private android.widget.EditText a0;
    private android.widget.EditText b0;
    private android.widget.EditText c0;

    /* renamed from: k0, reason: collision with root package name */
    private android.widget.Button f1007k0;

    /* renamed from: p0, reason: collision with root package name */
    private android.widget.CheckBox f1008p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.life.lost.PublishLostActivity e;

        a(com.bxkj.student.life.lost.PublishLostActivity r1, android.content.Context r2, int r3, java.util.List r4) {
                r0 = this;
                r0.e = r1
                r0.<init>(r2, r3, r4)
                return
        }

        public /* bridge */ /* synthetic */ void a(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.lang.Object r2) {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                r0.d(r1, r2)
                return
        }

        public void d(cn.bluemobi.dylan.base.adapter.common.ViewHolder r2, java.util.Map<java.lang.String, java.lang.Object> r3) {
                r1 = this;
                java.lang.String r0 = "name"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r0)
                r0 = 2131298986(0x7f090aaa, float:1.821596E38)
                r2.J(r0, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.life.lost.PublishLostActivity k;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements android.view.View.OnClickListener {
            final /* synthetic */ java.util.Map a;
            final /* synthetic */ cn.bluemobi.dylan.base.adapter.common.ViewHolder b;
            final /* synthetic */ com.bxkj.student.life.lost.PublishLostActivity.b c;

            a(com.bxkj.student.life.lost.PublishLostActivity.b r1, java.util.Map r2, cn.bluemobi.dylan.base.adapter.common.ViewHolder r3) {
                    r0 = this;
                    r0.c = r1
                    r0.a = r2
                    r0.b = r3
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r2) {
                    r1 = this;
                    com.bxkj.student.life.lost.PublishLostActivity$b r2 = r1.c
                    com.bxkj.student.life.lost.PublishLostActivity r2 = r2.k
                    java.util.List r2 = com.bxkj.student.life.lost.PublishLostActivity.j0(r2)
                    java.util.Map r0 = r1.a
                    r2.remove(r0)
                    com.bxkj.student.life.lost.PublishLostActivity$b r2 = r1.c
                    cn.bluemobi.dylan.base.adapter.common.ViewHolder r0 = r1.b
                    int r0 = r0.f()
                    r2.notifyItemRemoved(r0)
                    return
            }
        }

        b(com.bxkj.student.life.lost.PublishLostActivity r1, android.content.Context r2, int r3, java.util.List r4) {
                r0 = this;
                r0.k = r1
                r0.<init>(r2, r3, r4)
                return
        }

        public /* bridge */ /* synthetic */ void c(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.lang.Object r2) {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                r0.m(r1, r2)
                return
        }

        public void m(cn.bluemobi.dylan.base.adapter.common.ViewHolder r3, java.util.Map<java.lang.String, java.lang.Object> r4) {
                r2 = this;
                java.lang.String r0 = "question"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r1 = 2131299058(0x7f090af2, float:1.8216107E38)
                r3.J(r1, r0)
                java.lang.String r0 = "answer"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                r1 = 2131298775(0x7f0909d7, float:1.8215533E38)
                r3.J(r1, r0)
                com.bxkj.student.life.lost.PublishLostActivity$b$a r0 = new com.bxkj.student.life.lost.PublishLostActivity$b$a
                r0.<init>(r2, r4, r3)
                r4 = 2131296602(0x7f09015a, float:1.8211125E38)
                r3.w(r4, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements android.widget.CompoundButton.OnCheckedChangeListener {
        final /* synthetic */ com.bxkj.student.life.lost.PublishLostActivity a;

        c(com.bxkj.student.life.lost.PublishLostActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(android.widget.CompoundButton r1, boolean r2) {
                r0 = this;
                com.bxkj.student.life.lost.PublishLostActivity r1 = r0.a
                androidx.cardview.widget.CardView r1 = com.bxkj.student.life.lost.PublishLostActivity.i0(r1)
                if (r2 == 0) goto La
                r2 = 0
                goto Lc
            La:
                r2 = 8
            Lc:
                r1.setVisibility(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.life.lost.PublishLostActivity a;

        d(com.bxkj.student.life.lost.PublishLostActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.life.lost.PublishLostActivity r0 = r2.a
                java.lang.String r1 = "data"
                java.util.List r3 = cn.bluemobi.dylan.http.JsonParse.getList(r3, r1)
                com.bxkj.student.life.lost.PublishLostActivity.m0(r0, r3)
                androidx.collection.ArrayMap r3 = new androidx.collection.ArrayMap
                r3.<init>()
                java.lang.String r0 = "name"
                java.lang.String r1 = "请选择物品类型"
                r3.put(r0, r1)
                com.bxkj.student.life.lost.PublishLostActivity r0 = r2.a
                java.util.List r0 = com.bxkj.student.life.lost.PublishLostActivity.l0(r0)
                r1 = 0
                r0.add(r1, r3)
                com.bxkj.student.life.lost.PublishLostActivity r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.abslistview.a r3 = com.bxkj.student.life.lost.PublishLostActivity.k0(r3)
                com.bxkj.student.life.lost.PublishLostActivity r0 = r2.a
                java.util.List r0 = com.bxkj.student.life.lost.PublishLostActivity.l0(r0)
                r3.c(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.life.lost.PublishLostActivity a;

        e(com.bxkj.student.life.lost.PublishLostActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r1) {
                r0 = this;
                com.bxkj.student.life.lost.PublishLostActivity r1 = r0.a
                r1.finish()
                return
        }
    }

    public PublishLostActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.M0 = r0
            r0 = 204(0xcc, float:2.86E-43)
            r1.N0 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.Q0 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.R0 = r0
            return
    }

    public static /* synthetic */ kotlin.n1 g0(com.bxkj.student.life.lost.PublishLostActivity r0, java.io.File r1) {
            kotlin.n1 r0 = r0.o0(r1)
            return r0
    }

    public static /* synthetic */ void h0(com.bxkj.student.life.lost.PublishLostActivity r0, android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0.p0(r1, r2, r3, r4)
            return
    }

    static /* bridge */ /* synthetic */ androidx.cardview.widget.CardView i0(com.bxkj.student.life.lost.PublishLostActivity r0) {
            androidx.cardview.widget.CardView r0 = r0.F0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List j0(com.bxkj.student.life.lost.PublishLostActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.R0
            return r0
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.abslistview.a k0(com.bxkj.student.life.lost.PublishLostActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.P0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List l0(com.bxkj.student.life.lost.PublishLostActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.Q0
            return r0
    }

    static /* bridge */ /* synthetic */ void m0(com.bxkj.student.life.lost.PublishLostActivity r0, java.util.List r1) {
            r0.Q0 = r1
            return
    }

    private void n0() {
            r2 = this;
            android.content.Context r0 = r2.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideLoadingDialog()
            java.lang.Class<w.e> r1 = w.e.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            w.e r1 = (w.e) r1
            rx.e r1 = r1.c()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.life.lost.PublishLostActivity$d r1 = new com.bxkj.student.life.lost.PublishLostActivity$d
            r1.<init>(r2)
            r0.setDataListener(r1)
            return
    }

    private /* synthetic */ kotlin.n1 o0(java.io.File r2) {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.M0
            java.lang.String r2 = r2.getPath()
            r0.add(r2)
            cn.bluemobi.dylan.base.adapter.c r2 = r1.O0
            java.util.List<java.lang.String> r0 = r1.M0
            r2.c(r0)
            r2 = 0
            return r2
    }

    private /* synthetic */ void p0(android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            com.bxkj.base.v2.common.utils.w r1 = com.bxkj.base.v2.common.utils.w.a
            androidx.fragment.app.FragmentActivity r2 = r0.W
            com.bxkj.student.life.lost.a r3 = new com.bxkj.student.life.lost.a
            r3.<init>(r0)
            r1.q(r2, r3)
            return
    }

    private void q0() {
            r15 = this;
            android.widget.Spinner r0 = r15.K0
            int r0 = r0.getSelectedItemPosition()
            r1 = -1
            if (r0 == r1) goto L16c
            android.widget.Spinner r0 = r15.K0
            int r0 = r0.getSelectedItemPosition()
            if (r0 != 0) goto L13
            goto L16c
        L13:
            cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> r0 = r15.P0
            android.widget.Spinner r1 = r15.K0
            int r1 = r1.getSelectedItemPosition()
            java.lang.Object r0 = r0.getItem(r1)
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r1 = "id"
            java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r1)
            android.widget.EditText r0 = r15.Y
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = r0.trim()
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L41
            java.lang.String r0 = "请简单描述一下哦"
            r15.f0(r0)
            return
        L41:
            android.widget.EditText r0 = r15.Z
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r11 = r0.trim()
            android.widget.EditText r0 = r15.a0
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r8 = r0.trim()
            android.widget.EditText r0 = r15.b0
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r10 = r0.trim()
            android.widget.EditText r0 = r15.c0
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r9 = r0.trim()
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L91
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto L91
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L91
            java.lang.String r0 = "至少填写一种联系方式哦"
            r15.f0(r0)
            return
        L91:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List<java.lang.String> r2 = r15.M0
            java.util.Iterator r2 = r2.iterator()
        La1:
            boolean r3 = r2.hasNext()
            r5 = 2
            if (r3 == 0) goto Ld9
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.io.File r7 = new java.io.File
            r7.<init>(r3)
            java.lang.String r3 = r7.getPath()
            byte[] r3 = r0(r3)
            java.lang.String r3 = cn.bluemobi.dylan.base.utils.b.b(r3)
            r1.add(r3)
            java.util.HashMap r12 = new java.util.HashMap
            r12.<init>(r5)
            java.lang.String r5 = "imageName"
            java.lang.String r7 = r7.getName()
            r12.put(r5, r7)
            java.lang.String r5 = "imageBase64"
            r12.put(r5, r3)
            r0.add(r12)
            goto La1
        Ld9:
            java.lang.String r7 = com.alibaba.fastjson.JSON.toJSONString(r1)
            int r0 = r15.J0
            if (r0 != 0) goto Lfb
            android.widget.CheckBox r0 = r15.f1008p0
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto Lfb
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r15.R0
            int r0 = r0.size()
            if (r0 != 0) goto Lf7
            java.lang.String r0 = "至少添加一个问题和答案"
            r15.f0(r0)
            return
        Lf7:
            java.lang.String r0 = "1"
        Lf9:
            r12 = r0
            goto Lfe
        Lfb:
            java.lang.String r0 = "0"
            goto Lf9
        Lfe:
            android.widget.RadioGroup r0 = r15.I0
            int r0 = r0.getCheckedRadioButtonId()
            android.widget.RadioGroup r1 = r15.I0
            r2 = 0
            android.view.View r1 = r1.getChildAt(r2)
            int r1 = r1.getId()
            r2 = 3
            if (r0 != r1) goto L114
        L112:
            r13 = 3
            goto L13c
        L114:
            android.widget.RadioGroup r0 = r15.I0
            int r0 = r0.getCheckedRadioButtonId()
            android.widget.RadioGroup r1 = r15.I0
            r3 = 1
            android.view.View r1 = r1.getChildAt(r3)
            int r1 = r1.getId()
            if (r0 != r1) goto L129
            r13 = 2
            goto L13c
        L129:
            android.widget.RadioGroup r0 = r15.I0
            int r0 = r0.getCheckedRadioButtonId()
            android.widget.RadioGroup r1 = r15.I0
            android.view.View r1 = r1.getChildAt(r5)
            int r1 = r1.getId()
            if (r0 != r1) goto L112
            r13 = 1
        L13c:
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r15.R0
            java.lang.String r14 = com.alibaba.fastjson.JSON.toJSONString(r0)
            android.content.Context r0 = r15.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<w.e> r1 = w.e.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            r2 = r1
            w.e r2 = (w.e) r2
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r3 = r1.getOpenId()
            int r5 = r15.J0
            rx.e r1 = r2.i(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.life.lost.PublishLostActivity$e r1 = new com.bxkj.student.life.lost.PublishLostActivity$e
            r1.<init>(r15)
            r0.setDataListener(r1)
            return
        L16c:
            java.lang.String r0 = "请选择物品类型"
            r15.f0(r0)
            return
    }

    public static byte[] r0(java.lang.String r9) {
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
            android.widget.Button r0 = r2.f1007k0
            r0.setOnClickListener(r2)
            android.widget.LinearLayout r0 = r2.G0
            r0.setOnClickListener(r2)
            cn.bluemobi.dylan.base.view.MyGridView r0 = r2.L0
            com.bxkj.student.life.lost.b r1 = new com.bxkj.student.life.lost.b
            r1.<init>(r2)
            r0.setOnItemClickListener(r1)
            android.widget.CheckBox r0 = r2.f1008p0
            com.bxkj.student.life.lost.PublishLostActivity$c r1 = new com.bxkj.student.life.lost.PublishLostActivity$c
            r1.<init>(r2)
            r0.setOnCheckedChangeListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131493001(0x7f0c0089, float:1.860947E38)
            return r0
    }

    public void R() {
            r5 = this;
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r1 = "type"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L2b
            android.content.Intent r0 = r5.getIntent()
            r2 = 1
            int r0 = r0.getIntExtra(r1, r2)
            r5.J0 = r0
            if (r0 != r2) goto L26
            java.lang.String r0 = "发布寻物启示"
            r5.setTitle(r0)
            android.widget.CheckBox r0 = r5.f1008p0
            r1 = 8
            r0.setVisibility(r1)
            goto L2b
        L26:
            java.lang.String r0 = "发布失物招领"
            r5.setTitle(r0)
        L2b:
            cn.bluemobi.dylan.base.adapter.c r0 = new cn.bluemobi.dylan.base.adapter.c
            java.util.List<java.lang.String> r1 = r5.M0
            android.content.Context r2 = r5.V
            r3 = 1092616192(0x41200000, float:10.0)
            int r3 = cn.bluemobi.dylan.base.utils.u.a(r3, r2)
            r4 = 4
            r0.<init>(r1, r2, r4, r3)
            r5.O0 = r0
            r1 = 3
            r0.e(r1)
            cn.bluemobi.dylan.base.view.MyGridView r0 = r5.L0
            cn.bluemobi.dylan.base.adapter.c r1 = r5.O0
            r0.setAdapter(r1)
            com.bxkj.student.life.lost.PublishLostActivity$a r0 = new com.bxkj.student.life.lost.PublishLostActivity$a
            android.content.Context r1 = r5.V
            r2 = 2131493315(0x7f0c01c3, float:1.8610107E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r5.Q0
            r0.<init>(r5, r1, r2, r3)
            r5.P0 = r0
            android.widget.Spinner r1 = r5.K0
            r1.setAdapter(r0)
            r5.n0()
            androidx.recyclerview.widget.RecyclerView r0 = r5.H0
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r5.V
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            com.bxkj.student.life.lost.PublishLostActivity$b r0 = new com.bxkj.student.life.lost.PublishLostActivity$b
            android.content.Context r1 = r5.V
            r2 = 2131493303(0x7f0c01b7, float:1.8610082E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r5.R0
            r0.<init>(r5, r1, r2, r3)
            r5.S0 = r0
            androidx.recyclerview.widget.RecyclerView r1 = r5.H0
            r1.setAdapter(r0)
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "发布寻物启事"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r2) {
            r1 = this;
            r2 = 2131297030(0x7f090306, float:1.8211993E38)
            android.view.View r0 = r1.findViewById(r2)
            cn.bluemobi.dylan.base.view.MyGridView r0 = (cn.bluemobi.dylan.base.view.MyGridView) r0
            r1.L0 = r0
            r0 = 2131298550(0x7f0908f6, float:1.8215076E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.Spinner r0 = (android.widget.Spinner) r0
            r1.K0 = r0
            r0 = 2131296932(0x7f0902a4, float:1.8211795E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            r1.Y = r0
            android.view.View r2 = r1.findViewById(r2)
            cn.bluemobi.dylan.base.view.MyGridView r2 = (cn.bluemobi.dylan.base.view.MyGridView) r2
            r1.L0 = r2
            r2 = 2131296942(0x7f0902ae, float:1.8211815E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.EditText r2 = (android.widget.EditText) r2
            r1.Z = r2
            r2 = 2131296941(0x7f0902ad, float:1.8211813E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.EditText r2 = (android.widget.EditText) r2
            r1.a0 = r2
            r2 = 2131296958(0x7f0902be, float:1.8211847E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.EditText r2 = (android.widget.EditText) r2
            r1.b0 = r2
            r2 = 2131296944(0x7f0902b0, float:1.8211819E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.EditText r2 = (android.widget.EditText) r2
            r1.c0 = r2
            r2 = 2131296629(0x7f090175, float:1.821118E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            r1.f1007k0 = r2
            r2 = 2131296723(0x7f0901d3, float:1.821137E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.CheckBox r2 = (android.widget.CheckBox) r2
            r1.f1008p0 = r2
            r2 = 2131296690(0x7f0901b2, float:1.8211304E38)
            android.view.View r2 = r1.findViewById(r2)
            androidx.cardview.widget.CardView r2 = (androidx.cardview.widget.CardView) r2
            r1.F0 = r2
            r2 = 2131298011(0x7f0906db, float:1.8213983E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r1.G0 = r2
            r2 = 2131298434(0x7f090882, float:1.8214841E38)
            android.view.View r2 = r1.findViewById(r2)
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            r1.H0 = r2
            r2 = 2131298363(0x7f09083b, float:1.8214697E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.RadioGroup r2 = (android.widget.RadioGroup) r2
            r1.I0 = r2
            androidx.cardview.widget.CardView r2 = r1.F0
            r0 = 8
            r2.setVisibility(r0)
            return
    }

    public void onClick(android.view.View r3) {
            r2 = this;
            int r3 = r3.getId()
            r0 = 2131296629(0x7f090175, float:1.821118E38)
            if (r3 == r0) goto L2d
            r0 = 2131298011(0x7f0906db, float:1.8213983E38)
            if (r3 == r0) goto Lf
            return
        Lf:
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r3 = r2.S0
            int r3 = r3.getItemCount()
            r0 = 3
            if (r3 >= r0) goto L27
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r0 = r2.V
            java.lang.Class<com.bxkj.student.life.lost.AddQuestionActivity> r1 = com.bxkj.student.life.lost.AddQuestionActivity.class
            r3.<init>(r0, r1)
            r0 = 204(0xcc, float:2.86E-43)
            r2.startActivityForResult(r3, r0)
            return
        L27:
            java.lang.String r3 = "最多三个问题哦！"
            r2.f0(r3)
            return
        L2d:
            r2.q0()
            return
    }
}
