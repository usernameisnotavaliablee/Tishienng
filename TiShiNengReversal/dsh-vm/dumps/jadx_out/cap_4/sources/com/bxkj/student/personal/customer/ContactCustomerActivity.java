package com.bxkj.student.personal.customer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ContactCustomerActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> F0;
    protected int G0;
    protected int H0;
    protected int I0;
    private android.widget.EditText Y;
    private android.widget.Button Z;
    private android.widget.ImageView a0;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.MultiItemCommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> b0;
    private androidx.recyclerview.widget.LinearLayoutManager c0;

    /* renamed from: k0, reason: collision with root package name */
    private androidx.recyclerview.widget.RecyclerView f1132k0;

    /* renamed from: p0, reason: collision with root package name */
    private com.scwang.smartrefresh.layout.SmartRefreshLayout f1133p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.text.TextWatcher {
        final /* synthetic */ com.bxkj.student.personal.customer.ContactCustomerActivity a;

        a(com.bxkj.student.personal.customer.ContactCustomerActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable r3) {
                r2 = this;
                com.bxkj.student.personal.customer.ContactCustomerActivity r3 = r2.a
                android.widget.EditText r3 = com.bxkj.student.personal.customer.ContactCustomerActivity.k0(r3)
                android.text.Editable r3 = r3.getText()
                java.lang.String r3 = r3.toString()
                java.lang.String r3 = r3.trim()
                boolean r3 = r3.isEmpty()
                r0 = 8
                r1 = 0
                if (r3 == 0) goto L2e
                com.bxkj.student.personal.customer.ContactCustomerActivity r3 = r2.a
                android.widget.ImageView r3 = com.bxkj.student.personal.customer.ContactCustomerActivity.h0(r3)
                r3.setVisibility(r1)
                com.bxkj.student.personal.customer.ContactCustomerActivity r3 = r2.a
                android.widget.Button r3 = com.bxkj.student.personal.customer.ContactCustomerActivity.i0(r3)
                r3.setVisibility(r0)
                return
            L2e:
                com.bxkj.student.personal.customer.ContactCustomerActivity r3 = r2.a
                android.widget.ImageView r3 = com.bxkj.student.personal.customer.ContactCustomerActivity.h0(r3)
                r3.setVisibility(r0)
                com.bxkj.student.personal.customer.ContactCustomerActivity r3 = r2.a
                android.widget.Button r3 = com.bxkj.student.personal.customer.ContactCustomerActivity.i0(r3)
                r3.setVisibility(r1)
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
    class b implements cn.bluemobi.dylan.base.adapter.common.recyclerview.a<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.personal.customer.ContactCustomerActivity a;

        b(com.bxkj.student.personal.customer.ContactCustomerActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public /* bridge */ /* synthetic */ int a(int r1, java.lang.Object r2) {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                int r1 = r0.c(r1, r2)
                return r1
        }

        public int b(int r2) {
                r1 = this;
                r0 = 1
                if (r2 != r0) goto L7
                r2 = 2131493314(0x7f0c01c2, float:1.8610105E38)
                return r2
            L7:
                r2 = 2131493308(0x7f0c01bc, float:1.8610092E38)
                return r2
        }

        public int c(int r2, java.util.Map<java.lang.String, java.lang.Object> r3) {
                r1 = this;
                com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r2 = r2.getUserId()
                java.lang.String r0 = "userId"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r0)
                boolean r2 = r2.equals(r3)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.base.adapter.common.recyclerview.MultiItemCommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ com.bxkj.student.personal.customer.ContactCustomerActivity f1134l;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements android.view.View.OnClickListener {
            final /* synthetic */ java.util.Map a;
            final /* synthetic */ com.bxkj.student.personal.customer.ContactCustomerActivity.c b;

            a(com.bxkj.student.personal.customer.ContactCustomerActivity.c r1, java.util.Map r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r3) {
                    r2 = this;
                    com.bxkj.student.personal.customer.ContactCustomerActivity$c r3 = r2.b
                    com.bxkj.student.personal.customer.ContactCustomerActivity r3 = r3.f1134l
                    java.util.Map r0 = r2.a
                    java.lang.String r1 = "content"
                    java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r1)
                    com.bxkj.student.personal.customer.ContactCustomerActivity.p0(r3, r0)
                    return
            }
        }

        c(com.bxkj.student.personal.customer.ContactCustomerActivity r1, android.content.Context r2, java.util.List r3, cn.bluemobi.dylan.base.adapter.common.recyclerview.a r4) {
                r0 = this;
                r0.f1134l = r1
                r0.<init>(r2, r3, r4)
                return
        }

        public /* bridge */ /* synthetic */ void c(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.lang.Object r2) {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                r0.m(r1, r2)
                return
        }

        public void m(cn.bluemobi.dylan.base.adapter.common.ViewHolder r8, java.util.Map<java.lang.String, java.lang.Object> r9) {
                r7 = this;
                java.lang.String r0 = "isImg"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r9, r0)
                java.lang.String r1 = "1"
                boolean r0 = r0.equals(r1)
                java.lang.String r1 = "content"
                r2 = 0
                r3 = 1
                r4 = 2131298048(0x7f090700, float:1.8214058E38)
                r5 = 2131299070(0x7f090afe, float:1.821613E38)
                r6 = 2131297091(0x7f090343, float:1.8212117E38)
                if (r0 == 0) goto L31
                android.view.View r0 = r8.h(r6)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                r8.N(r4, r3)
                r8.N(r5, r2)
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r9, r1)     // Catch: java.lang.Exception -> L2f
                r8.s(r6, r0)     // Catch: java.lang.Exception -> L2f
                goto L3e
            L2f:
                goto L3e
            L31:
                r8.N(r4, r2)
                r8.N(r5, r3)
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r9, r1)
                r8.J(r5, r0)
            L3e:
                com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r0 = r0.getUserId()
                java.lang.String r1 = "userId"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r9, r1)
                boolean r0 = r0.equals(r1)
                r1 = 2131299176(0x7f090b68, float:1.8216346E38)
                if (r0 == 0) goto L61
                com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r0 = r0.getRealName()
                r8.J(r1, r0)
                goto L66
            L61:
                java.lang.String r0 = "系统"
                r8.J(r1, r0)
            L66:
                java.lang.String r0 = "replyTime"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r9, r0)
                r1 = 2131298860(0x7f090a2c, float:1.8215705E38)
                r8.J(r1, r0)
                com.bxkj.student.personal.customer.ContactCustomerActivity$c$a r0 = new com.bxkj.student.personal.customer.ContactCustomerActivity$c$a
                r0.<init>(r7, r9)
                r8.w(r6, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.personal.customer.ContactCustomerActivity a;

        d(com.bxkj.student.personal.customer.ContactCustomerActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r2) {
                r1 = this;
                com.bxkj.student.personal.customer.ContactCustomerActivity r2 = r1.a
                android.widget.EditText r2 = com.bxkj.student.personal.customer.ContactCustomerActivity.k0(r2)
                java.lang.String r0 = ""
                r2.setText(r0)
                com.bxkj.student.personal.customer.ContactCustomerActivity r2 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r2 = com.bxkj.student.personal.customer.ContactCustomerActivity.o0(r2)
                r2.Q()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e implements m2.e {
        final /* synthetic */ com.bxkj.student.personal.customer.ContactCustomerActivity a;

        e(com.bxkj.student.personal.customer.ContactCustomerActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void m(l2.h r1) {
                r0 = this;
                com.bxkj.student.personal.customer.ContactCustomerActivity r1 = r0.a
                r1.x0()
                return
        }

        public void n(l2.h r5) {
                r4 = this;
                com.bxkj.student.personal.customer.ContactCustomerActivity r5 = r4.a
                int r0 = r5.I0
                int r1 = r5.G0
                int r2 = r0 / r1
                int r3 = r5.H0
                int r0 = r0 % r1
                if (r0 != 0) goto Le
                goto L10
            Le:
                int r2 = r2 + 1
            L10:
                if (r3 < r2) goto L2a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r5 = com.bxkj.student.personal.customer.ContactCustomerActivity.o0(r5)
                r5.w0()
                com.bxkj.student.personal.customer.ContactCustomerActivity r5 = r4.a
                android.content.Context r5 = com.bxkj.student.personal.customer.ContactCustomerActivity.q0(r5)
                java.lang.String r0 = "已全部加载完毕"
                r1 = 0
                android.widget.Toast r5 = android.widget.Toast.makeText(r5, r0, r1)
                r5.show()
                return
            L2a:
                int r3 = r3 + 1
                r5.H0 = r3
                r5.s0()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class f extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.personal.customer.ContactCustomerActivity a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements java.lang.Runnable {
            final /* synthetic */ com.bxkj.student.personal.customer.ContactCustomerActivity.f a;

            a(com.bxkj.student.personal.customer.ContactCustomerActivity.f r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r2 = this;
                    com.bxkj.student.personal.customer.ContactCustomerActivity$f r0 = r2.a
                    com.bxkj.student.personal.customer.ContactCustomerActivity r0 = r0.a
                    androidx.recyclerview.widget.RecyclerView r0 = com.bxkj.student.personal.customer.ContactCustomerActivity.n0(r0)
                    com.bxkj.student.personal.customer.ContactCustomerActivity$f r1 = r2.a
                    com.bxkj.student.personal.customer.ContactCustomerActivity r1 = r1.a
                    cn.bluemobi.dylan.base.adapter.common.recyclerview.MultiItemCommonAdapter r1 = com.bxkj.student.personal.customer.ContactCustomerActivity.m0(r1)
                    int r1 = r1.getItemCount()
                    int r1 = r1 + (-1)
                    r0.smoothScrollToPosition(r1)
                    return
            }
        }

        f(com.bxkj.student.personal.customer.ContactCustomerActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFinish() {
                r2 = this;
                super.netOnFinish()
                com.bxkj.student.personal.customer.ContactCustomerActivity r0 = r2.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.personal.customer.ContactCustomerActivity.o0(r0)
                r1 = 0
                r0.x0(r1)
                com.bxkj.student.personal.customer.ContactCustomerActivity r0 = r2.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.personal.customer.ContactCustomerActivity.o0(r0)
                r0.q0()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r6) {
                r5 = this;
                com.bxkj.student.personal.customer.ContactCustomerActivity r0 = r5.a
                java.lang.String r1 = "total"
                java.lang.String r1 = cn.bluemobi.dylan.base.utils.u.O(r6, r1)
                int r1 = java.lang.Integer.parseInt(r1)
                r0.I0 = r1
                java.lang.String r0 = "data"
                java.util.List r6 = cn.bluemobi.dylan.http.JsonParse.getList(r6, r0)
                com.bxkj.student.personal.customer.ContactCustomerActivity r0 = r5.a
                int r1 = r0.H0
                r2 = 1
                if (r1 != r2) goto Lc4
                java.util.List r0 = com.bxkj.student.personal.customer.ContactCustomerActivity.j0(r0)
                r0.clear()
                com.bxkj.student.personal.customer.ContactCustomerActivity r0 = r5.a
                java.util.List r0 = com.bxkj.student.personal.customer.ContactCustomerActivity.j0(r0)
                r0.addAll(r6)
                com.bxkj.student.personal.customer.ContactCustomerActivity r6 = r5.a
                java.util.List r6 = com.bxkj.student.personal.customer.ContactCustomerActivity.j0(r6)
                boolean r6 = r6.isEmpty()
                if (r6 == 0) goto La0
                java.text.SimpleDateFormat r6 = new java.text.SimpleDateFormat
                java.lang.String r0 = "yy-MM-dd HH:mm:ss"
                r6.<init>(r0)
                java.util.HashMap r0 = new java.util.HashMap
                r1 = 2
                r0.<init>(r1)
                java.util.Date r2 = new java.util.Date
                r2.<init>()
                java.lang.String r2 = r6.format(r2)
                java.lang.String r3 = "replyTime"
                r0.put(r3, r2)
                java.lang.String r2 = "为了服务质量，我们将采取实名制，请认真反馈"
                java.lang.String r4 = "content"
                r0.put(r4, r2)
                com.bxkj.student.personal.customer.ContactCustomerActivity r2 = r5.a
                java.util.List r2 = com.bxkj.student.personal.customer.ContactCustomerActivity.j0(r2)
                r2.add(r0)
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>(r1)
                java.util.Date r2 = new java.util.Date
                r2.<init>()
                java.lang.String r2 = r6.format(r2)
                r0.put(r3, r2)
                java.lang.String r2 = "请输入您的宝贵意见或建议,我们将努力改进"
                r0.put(r4, r2)
                com.bxkj.student.personal.customer.ContactCustomerActivity r2 = r5.a
                java.util.List r2 = com.bxkj.student.personal.customer.ContactCustomerActivity.j0(r2)
                r2.add(r0)
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>(r1)
                java.util.Date r1 = new java.util.Date
                r1.<init>()
                java.lang.String r6 = r6.format(r1)
                r0.put(r3, r6)
                java.lang.String r6 = "请留下您的联系方式，以便我们回复您"
                r0.put(r4, r6)
                com.bxkj.student.personal.customer.ContactCustomerActivity r6 = r5.a
                java.util.List r6 = com.bxkj.student.personal.customer.ContactCustomerActivity.j0(r6)
                r6.add(r0)
            La0:
                com.bxkj.student.personal.customer.ContactCustomerActivity r6 = r5.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.MultiItemCommonAdapter r6 = com.bxkj.student.personal.customer.ContactCustomerActivity.m0(r6)
                r6.notifyDataSetChanged()
                com.bxkj.student.personal.customer.ContactCustomerActivity r6 = r5.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.MultiItemCommonAdapter r6 = com.bxkj.student.personal.customer.ContactCustomerActivity.m0(r6)
                int r6 = r6.getItemCount()
                if (r6 <= 0) goto Lc3
                com.bxkj.student.personal.customer.ContactCustomerActivity r6 = r5.a
                androidx.recyclerview.widget.RecyclerView r6 = com.bxkj.student.personal.customer.ContactCustomerActivity.n0(r6)
                com.bxkj.student.personal.customer.ContactCustomerActivity$f$a r0 = new com.bxkj.student.personal.customer.ContactCustomerActivity$f$a
                r0.<init>(r5)
                r6.post(r0)
            Lc3:
                return
            Lc4:
                java.util.List r0 = com.bxkj.student.personal.customer.ContactCustomerActivity.j0(r0)
                r1 = 0
                r0.addAll(r1, r6)
                com.bxkj.student.personal.customer.ContactCustomerActivity r0 = r5.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.MultiItemCommonAdapter r0 = com.bxkj.student.personal.customer.ContactCustomerActivity.m0(r0)
                int r1 = r6.size()
                int r1 = -r1
                int r6 = r6.size()
                r0.notifyItemRangeInserted(r1, r6)
                com.bxkj.student.personal.customer.ContactCustomerActivity r6 = r5.a
                androidx.recyclerview.widget.LinearLayoutManager r6 = com.bxkj.student.personal.customer.ContactCustomerActivity.l0(r6)
                int r6 = r6.findFirstVisibleItemPosition()
                com.bxkj.student.personal.customer.ContactCustomerActivity r0 = r5.a
                androidx.recyclerview.widget.RecyclerView r0 = com.bxkj.student.personal.customer.ContactCustomerActivity.n0(r0)
                r0.getChildAt(r6)
                com.bxkj.student.personal.customer.ContactCustomerActivity r6 = r5.a
                androidx.recyclerview.widget.LinearLayoutManager r6 = com.bxkj.student.personal.customer.ContactCustomerActivity.l0(r6)
                com.bxkj.student.personal.customer.ContactCustomerActivity r0 = r5.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.MultiItemCommonAdapter r0 = com.bxkj.student.personal.customer.ContactCustomerActivity.m0(r0)
                int r0 = r0.getItemCount()
                com.bxkj.student.personal.customer.ContactCustomerActivity r1 = r5.a
                int r3 = r1.G0
                int r4 = r1.H0
                int r4 = r4 - r2
                int r3 = r3 * r4
                int r0 = r0 - r3
                r2 = 1112014848(0x42480000, float:50.0)
                android.content.Context r1 = com.bxkj.student.personal.customer.ContactCustomerActivity.r0(r1)
                int r1 = cn.bluemobi.dylan.base.utils.u.a(r2, r1)
                int r1 = -r1
                r6.scrollToPositionWithOffset(r0, r1)
                return
        }
    }

    public ContactCustomerActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.F0 = r0
            r0 = 10
            r1.G0 = r0
            r0 = 1
            r1.H0 = r0
            r1.I0 = r0
            return
    }

    public static /* synthetic */ kotlin.n1 g0(com.bxkj.student.personal.customer.ContactCustomerActivity r0, java.io.File r1) {
            kotlin.n1 r0 = r0.v0(r1)
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.ImageView h0(com.bxkj.student.personal.customer.ContactCustomerActivity r0) {
            android.widget.ImageView r0 = r0.a0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.Button i0(com.bxkj.student.personal.customer.ContactCustomerActivity r0) {
            android.widget.Button r0 = r0.Z
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List j0(com.bxkj.student.personal.customer.ContactCustomerActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.F0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.EditText k0(com.bxkj.student.personal.customer.ContactCustomerActivity r0) {
            android.widget.EditText r0 = r0.Y
            return r0
    }

    static /* bridge */ /* synthetic */ androidx.recyclerview.widget.LinearLayoutManager l0(com.bxkj.student.personal.customer.ContactCustomerActivity r0) {
            androidx.recyclerview.widget.LinearLayoutManager r0 = r0.c0
            return r0
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.MultiItemCommonAdapter m0(com.bxkj.student.personal.customer.ContactCustomerActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.MultiItemCommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.b0
            return r0
    }

    static /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView n0(com.bxkj.student.personal.customer.ContactCustomerActivity r0) {
            androidx.recyclerview.widget.RecyclerView r0 = r0.f1132k0
            return r0
    }

    static /* bridge */ /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout o0(com.bxkj.student.personal.customer.ContactCustomerActivity r0) {
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.f1133p0
            return r0
    }

    static /* bridge */ /* synthetic */ void p0(com.bxkj.student.personal.customer.ContactCustomerActivity r0, java.lang.String r1) {
            r0.w0(r1)
            return
    }

    static /* synthetic */ android.content.Context q0(com.bxkj.student.personal.customer.ContactCustomerActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context r0(com.bxkj.student.personal.customer.ContactCustomerActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private java.lang.String t0() {
            r3 = this;
            android.content.Context r0 = r3.V     // Catch: java.lang.Exception -> L14
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Exception -> L14
            android.content.Context r1 = r3.V     // Catch: java.lang.Exception -> L14
            java.lang.String r1 = r1.getPackageName()     // Catch: java.lang.Exception -> L14
            r2 = 0
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r2)     // Catch: java.lang.Exception -> L14
            java.lang.String r0 = r0.versionName     // Catch: java.lang.Exception -> L14
            return r0
        L14:
            java.lang.String r0 = "0.1"
            return r0
    }

    private /* synthetic */ kotlin.n1 v0(java.io.File r1) {
            r0 = this;
            r0.y0(r1)
            r1 = 0
            return r1
    }

    private void w0(java.lang.String r5) {
            r4 = this;
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r4.F0
            if (r0 != 0) goto L5
            return
        L5:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        Lb:
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2 = r4.F0
            int r2 = r2.size()
            if (r1 >= r2) goto L3d
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2 = r4.F0
            java.lang.Object r2 = r2.get(r1)
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r3 = "isImg"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r3)
            java.lang.String r3 = "1"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L3a
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2 = r4.F0
            java.lang.Object r2 = r2.get(r1)
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r3 = "content"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r3)
            r0.add(r2)
        L3a:
            int r1 = r1 + 1
            goto Lb
        L3d:
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r2 = r4.V
            java.lang.Class<cn.bluemobi.dylan.photoview.ImagePagerActivity> r3 = cn.bluemobi.dylan.photoview.ImagePagerActivity.class
            r1.<init>(r2, r3)
            int r2 = r0.size()
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.Object[] r2 = r0.toArray(r2)
            java.lang.String[] r2 = (java.lang.String[]) r2
            java.lang.String r3 = "image_urls"
            r1.putExtra(r3, r2)
            java.lang.String r2 = "image_index"
            int r5 = r0.indexOf(r5)
            r1.putExtra(r2, r5)
            r4.startActivity(r1)
            r5 = 2130772094(0x7f01007e, float:1.7147297E38)
            r0 = 2130772095(0x7f01007f, float:1.7147299E38)
            r4.overridePendingTransition(r5, r0)
            return
    }

    private void y0(java.io.File r12) {
            r11 = this;
            if (r12 == 0) goto L17
            boolean r0 = r12.exists()
            if (r0 != 0) goto L9
            goto L17
        L9:
            java.lang.String r0 = r12.getPath()
            byte[] r0 = z0(r0)
            java.lang.String r0 = cn.bluemobi.dylan.base.utils.b.b(r0)
        L15:
            r5 = r0
            goto L31
        L17:
            android.widget.EditText r0 = r11.Y
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L15
            java.lang.String r12 = "内容不能为空"
            r11.f0(r12)
            return
        L31:
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r0 = r0.getUserId()
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            boolean r1 = r1.isLogin()
            if (r1 != 0) goto L4b
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r0 = r0.getTempUserId()
        L4b:
            r2 = r0
            android.content.Context r0 = r11.V
            cn.bluemobi.dylan.http.HttpRequest r10 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<w.f> r0 = w.f.class
            java.lang.Object r0 = cn.bluemobi.dylan.http.Http.getApiService(r0)
            w.f r0 = (w.f) r0
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r1 = r1.getSchoolId()
            java.lang.String r3 = r11.t0()
            if (r12 != 0) goto L6b
            r12 = 0
        L69:
            r6 = r12
            goto L70
        L6b:
            java.lang.String r12 = r12.getName()
            goto L69
        L70:
            com.bxkj.base.user.LoginUser r12 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r7 = r12.getTempUserName()
            com.bxkj.base.user.LoginUser r12 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r8 = r12.getTempUserNumber()
            com.bxkj.base.user.LoginUser r12 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r9 = r12.getTempUserPhone()
            java.lang.String r4 = "Android"
            rx.e r12 = r0.x(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            cn.bluemobi.dylan.http.HttpRequest r12 = r10.setObservable(r12)
            com.bxkj.student.personal.customer.ContactCustomerActivity$d r0 = new com.bxkj.student.personal.customer.ContactCustomerActivity$d
            r0.<init>(r11)
            r12.setDataListener(r0)
            return
    }

    public static byte[] z0(java.lang.String r9) {
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
            r1 = this;
            android.widget.Button r0 = r1.Z
            r0.setOnClickListener(r1)
            android.widget.ImageView r0 = r1.a0
            r0.setOnClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492939(0x7f0c004b, float:1.8609344E38)
            return r0
    }

    public void R() {
            r4 = this;
            android.widget.EditText r0 = r4.Y
            com.bxkj.student.personal.customer.ContactCustomerActivity$a r1 = new com.bxkj.student.personal.customer.ContactCustomerActivity$a
            r1.<init>(r4)
            r0.addTextChangedListener(r1)
            androidx.recyclerview.widget.LinearLayoutManager r0 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r1 = r4.V
            r0.<init>(r1)
            r4.c0 = r0
            androidx.recyclerview.widget.RecyclerView r1 = r4.f1132k0
            r1.setLayoutManager(r0)
            android.view.animation.LayoutAnimationController r0 = new android.view.animation.LayoutAnimationController
            r1 = 2130772096(0x7f010080, float:1.71473E38)
            android.view.animation.Animation r1 = android.view.animation.AnimationUtils.loadAnimation(r4, r1)
            r0.<init>(r1)
            r1 = 1
            r0.setOrder(r1)
            androidx.recyclerview.widget.RecyclerView r1 = r4.f1132k0
            r1.setLayoutAnimation(r0)
            com.bxkj.student.personal.customer.ContactCustomerActivity$b r0 = new com.bxkj.student.personal.customer.ContactCustomerActivity$b
            r0.<init>(r4)
            com.bxkj.student.personal.customer.ContactCustomerActivity$c r1 = new com.bxkj.student.personal.customer.ContactCustomerActivity$c
            android.content.Context r2 = r4.V
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.F0
            r1.<init>(r4, r2, r3, r0)
            r4.b0 = r1
            androidx.recyclerview.widget.RecyclerView r0 = r4.f1132k0
            r0.setAdapter(r1)
            r4.u0()
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r4.f1133p0
            r0.Q()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "联系客服"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131298351(0x7f09082f, float:1.8214673E38)
            android.view.View r1 = r0.findViewById(r1)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r0.f1132k0 = r1
            r1 = 2131298352(0x7f090830, float:1.8214675E38)
            android.view.View r1 = r0.findViewById(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = (com.scwang.smartrefresh.layout.SmartRefreshLayout) r1
            r0.f1133p0 = r1
            r1 = 2131296948(0x7f0902b4, float:1.8211827E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.EditText r1 = (android.widget.EditText) r1
            r0.Y = r1
            r1 = 2131296623(0x7f09016f, float:1.8211168E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r0.Z = r1
            r1 = 2131296581(0x7f090145, float:1.8211083E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.a0 = r1
            return
    }

    public void onClick(android.view.View r3) {
            r2 = this;
            int r3 = r3.getId()
            r0 = 2131296581(0x7f090145, float:1.8211083E38)
            if (r3 == r0) goto L14
            r0 = 2131296623(0x7f09016f, float:1.8211168E38)
            if (r3 == r0) goto Lf
            return
        Lf:
            r3 = 0
            r2.y0(r3)
            return
        L14:
            com.bxkj.base.v2.common.utils.w r3 = com.bxkj.base.v2.common.utils.w.a
            androidx.fragment.app.FragmentActivity r0 = r2.W
            com.bxkj.student.personal.customer.a r1 = new com.bxkj.student.personal.customer.a
            r1.<init>(r2)
            r3.q(r0, r1)
            return
    }

    public void s0() {
            r5 = this;
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r0 = r0.getUserId()
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            boolean r1 = r1.isLogin()
            if (r1 != 0) goto L1a
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r0 = r0.getTempUserId()
        L1a:
            java.lang.Class<w.f> r1 = w.f.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            w.f r1 = (w.f) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getSchoolId()
            int r3 = r5.H0
            int r4 = r5.G0
            rx.e r0 = r1.p(r2, r0, r3, r4)
            android.content.Context r1 = r5.V
            cn.bluemobi.dylan.http.HttpRequest r1 = cn.bluemobi.dylan.http.Http.with(r1)
            cn.bluemobi.dylan.http.HttpRequest r1 = r1.hideLoadingDialog()
            cn.bluemobi.dylan.http.HttpRequest r0 = r1.setObservable(r0)
            com.bxkj.student.personal.customer.ContactCustomerActivity$f r1 = new com.bxkj.student.personal.customer.ContactCustomerActivity$f
            r1.<init>(r5)
            r0.setDataListener(r1)
            return
    }

    public void u0() {
            r3 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r3.f1133p0
            r1 = 1073741824(0x40000000, float:2.0)
            r0.g1(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r3.f1133p0
            r1 = 1112014848(0x42480000, float:50.0)
            android.content.Context r2 = r3.V
            int r1 = cn.bluemobi.dylan.base.utils.u.a(r1, r2)
            float r1 = (float) r1
            r0.e1(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r3.f1133p0
            com.bxkj.student.personal.customer.ContactCustomerActivity$e r1 = new com.bxkj.student.personal.customer.ContactCustomerActivity$e
            r1.<init>(r3)
            r0.m1(r1)
            return
    }

    public void x0() {
            r1 = this;
            r0 = 1
            r1.H0 = r0
            r1.s0()
            return
    }
}
