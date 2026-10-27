package com.bxkj.competition.signup;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class FreeProjectListActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.MultiItemCommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> F0;
    private java.lang.String G0;
    private com.bxkj.competition.signup.StickyDecoration H0;
    private java.lang.String I0;
    private com.scwang.smartrefresh.layout.SmartRefreshLayout Y;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView Z;
    private android.widget.TextView a0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> b0;
    private int c0;

    /* renamed from: k0, reason: collision with root package name */
    private int f667k0;

    /* renamed from: p0, reason: collision with root package name */
    private int f668p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements m2.e {
        final /* synthetic */ com.bxkj.competition.signup.FreeProjectListActivity a;

        a(com.bxkj.competition.signup.FreeProjectListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void m(l2.h r4) {
                r3 = this;
                com.bxkj.competition.signup.FreeProjectListActivity r4 = r3.a
                int r4 = com.bxkj.competition.signup.FreeProjectListActivity.g0(r4)
                com.bxkj.competition.signup.FreeProjectListActivity r0 = r3.a
                int r0 = com.bxkj.competition.signup.FreeProjectListActivity.i0(r0)
                int r4 = r4 / r0
                com.bxkj.competition.signup.FreeProjectListActivity r0 = r3.a
                int r0 = com.bxkj.competition.signup.FreeProjectListActivity.s0(r0)
                com.bxkj.competition.signup.FreeProjectListActivity r1 = r3.a
                int r1 = com.bxkj.competition.signup.FreeProjectListActivity.g0(r1)
                com.bxkj.competition.signup.FreeProjectListActivity r2 = r3.a
                int r2 = com.bxkj.competition.signup.FreeProjectListActivity.i0(r2)
                int r1 = r1 % r2
                if (r1 != 0) goto L23
                goto L25
            L23:
                int r4 = r4 + 1
            L25:
                if (r0 < r4) goto L38
                com.bxkj.competition.signup.FreeProjectListActivity r4 = r3.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r4 = com.bxkj.competition.signup.FreeProjectListActivity.v0(r4)
                r4.q0()
                com.bxkj.competition.signup.FreeProjectListActivity r4 = r3.a
                java.lang.String r0 = "没有了"
                r4.f0(r0)
                return
            L38:
                com.bxkj.competition.signup.FreeProjectListActivity r4 = r3.a
                com.bxkj.competition.signup.FreeProjectListActivity.u0(r4)
                com.bxkj.competition.signup.FreeProjectListActivity r4 = r3.a
                com.bxkj.competition.signup.FreeProjectListActivity.w0(r4)
                return
        }

        public void n(l2.h r2) {
                r1 = this;
                com.bxkj.competition.signup.FreeProjectListActivity r2 = r1.a
                r0 = 1
                com.bxkj.competition.signup.FreeProjectListActivity.t0(r2, r0)
                com.bxkj.competition.signup.FreeProjectListActivity r2 = r1.a
                com.bxkj.competition.signup.FreeProjectListActivity.w0(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements cn.bluemobi.dylan.base.adapter.common.recyclerview.a<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.competition.signup.FreeProjectListActivity a;

        b(com.bxkj.competition.signup.FreeProjectListActivity r1) {
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

        public int b(int r1) {
                r0 = this;
                int r1 = com.bxkj.competition.R.layout.item_for_competition_project_list_free
                return r1
        }

        public int c(int r1, java.util.Map<java.lang.String, java.lang.Object> r2) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.base.adapter.common.recyclerview.MultiItemCommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ com.bxkj.competition.signup.FreeProjectListActivity f669l;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements android.view.View.OnClickListener {
            final /* synthetic */ int a;
            final /* synthetic */ cn.bluemobi.dylan.base.adapter.common.ViewHolder b;
            final /* synthetic */ com.bxkj.competition.signup.FreeProjectListActivity.c c;

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            /* renamed from: com.bxkj.competition.signup.FreeProjectListActivity$c$a$a, reason: collision with other inner class name */
            class C0063a implements cn.bluemobi.dylan.base.view.iOSTwoButtonDialog.RightButtonOnClick {
                final /* synthetic */ com.bxkj.competition.signup.FreeProjectListActivity.c.a a;

                C0063a(com.bxkj.competition.signup.FreeProjectListActivity.c.a r1) {
                        r0 = this;
                        r0.a = r1
                        r0.<init>()
                        return
                }

                public void buttonRightOnClick() {
                        r3 = this;
                        com.bxkj.competition.signup.FreeProjectListActivity$c$a r0 = r3.a
                        com.bxkj.competition.signup.FreeProjectListActivity$c r1 = r0.c
                        com.bxkj.competition.signup.FreeProjectListActivity r2 = r1.f669l
                        cn.bluemobi.dylan.base.adapter.common.ViewHolder r0 = r0.b
                        int r0 = com.bxkj.competition.signup.FreeProjectListActivity.c.n(r1, r0)
                        com.bxkj.competition.signup.FreeProjectListActivity.y0(r2, r0)
                        return
                }
            }

            a(com.bxkj.competition.signup.FreeProjectListActivity.c r1, int r2, cn.bluemobi.dylan.base.adapter.common.ViewHolder r3) {
                    r0 = this;
                    r0.c = r1
                    r0.a = r2
                    r0.b = r3
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r3) {
                    r2 = this;
                    int r3 = r2.a
                    if (r3 != 0) goto L12
                    com.bxkj.competition.signup.FreeProjectListActivity$c r3 = r2.c
                    com.bxkj.competition.signup.FreeProjectListActivity r0 = r3.f669l
                    cn.bluemobi.dylan.base.adapter.common.ViewHolder r1 = r2.b
                    int r3 = com.bxkj.competition.signup.FreeProjectListActivity.c.m(r3, r1)
                    com.bxkj.competition.signup.FreeProjectListActivity.x0(r0, r3)
                    return
                L12:
                    cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r3 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
                    com.bxkj.competition.signup.FreeProjectListActivity$c r0 = r2.c
                    android.content.Context r0 = com.bxkj.competition.signup.FreeProjectListActivity.c.o(r0)
                    r3.<init>(r0)
                    java.lang.String r0 = "确定要取消报名吗？"
                    cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r3 = r3.setMessage(r0)
                    com.bxkj.competition.signup.FreeProjectListActivity$c$a$a r0 = new com.bxkj.competition.signup.FreeProjectListActivity$c$a$a
                    r0.<init>(r2)
                    cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r3 = r3.setRightButtonOnClickListener(r0)
                    r3.show()
                    return
            }
        }

        c(com.bxkj.competition.signup.FreeProjectListActivity r1, android.content.Context r2, java.util.List r3, cn.bluemobi.dylan.base.adapter.common.recyclerview.a r4) {
                r0 = this;
                r0.f669l = r1
                r0.<init>(r2, r3, r4)
                return
        }

        static /* synthetic */ int m(com.bxkj.competition.signup.FreeProjectListActivity.c r0, androidx.recyclerview.widget.RecyclerView.ViewHolder r1) {
                int r0 = r0.e(r1)
                return r0
        }

        static /* synthetic */ int n(com.bxkj.competition.signup.FreeProjectListActivity.c r0, androidx.recyclerview.widget.RecyclerView.ViewHolder r1) {
                int r0 = r0.e(r1)
                return r0
        }

        static /* synthetic */ android.content.Context o(com.bxkj.competition.signup.FreeProjectListActivity.c r0) {
                android.content.Context r0 = r0.e
                return r0
        }

        public /* bridge */ /* synthetic */ void c(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.lang.Object r2) {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                r0.p(r1, r2)
                return
        }

        public void p(cn.bluemobi.dylan.base.adapter.common.ViewHolder r7, java.util.Map<java.lang.String, java.lang.Object> r8) {
                r6 = this;
                int r0 = com.bxkj.competition.R.id.tv_name
                java.lang.String r1 = "itemName"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r1)
                r7.J(r0, r1)
                java.lang.String r0 = "operation"
                int r0 = cn.bluemobi.dylan.http.JsonParse.getInt(r8, r0)
                int r1 = com.bxkj.competition.R.id.bt_ok
                android.view.View r2 = r7.h(r1)
                android.widget.Button r2 = (android.widget.Button) r2
                r3 = 1
                if (r0 != 0) goto L31
                android.content.Context r8 = r6.e
                int r4 = com.bxkj.competition.R.drawable.button_bg
                android.graphics.drawable.Drawable r8 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r8, r4)
                r2.setBackground(r8)
                r2.setEnabled(r3)
                java.lang.String r8 = "报名"
                r7.J(r1, r8)
                goto Lcb
            L31:
                if (r0 != r3) goto L57
                r2.setEnabled(r3)
                android.content.Context r8 = r6.e
                int r3 = com.bxkj.competition.R.drawable.button_red
                android.graphics.drawable.Drawable r8 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r8, r3)
                r2.setBackground(r8)
                com.bxkj.competition.signup.FreeProjectListActivity r8 = r6.f669l
                android.content.res.Resources r8 = r8.getResources()
                int r3 = com.bxkj.competition.R.color.color_red
                int r8 = r8.getColor(r3)
                r2.setBackgroundColor(r8)
                java.lang.String r8 = "取消报名"
                r7.J(r1, r8)
                goto Lcb
            L57:
                r3 = 2
                r4 = 0
                if (r0 != r3) goto L6f
                android.content.Context r8 = r6.e
                int r3 = com.bxkj.competition.R.drawable.button_bg
                android.graphics.drawable.Drawable r8 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r8, r3)
                r2.setBackground(r8)
                r2.setEnabled(r4)
                java.lang.String r8 = "驳回"
                r7.J(r1, r8)
                goto Lcb
            L6f:
                r3 = 3
                if (r0 != r3) goto L86
                android.content.Context r8 = r6.e
                int r3 = com.bxkj.competition.R.drawable.button_bg
                android.graphics.drawable.Drawable r8 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r8, r3)
                r2.setBackground(r8)
                r2.setEnabled(r4)
                java.lang.String r8 = "院系通过"
                r7.J(r1, r8)
                goto Lcb
            L86:
                r3 = 4
                if (r0 != r3) goto L9d
                android.content.Context r8 = r6.e
                int r3 = com.bxkj.competition.R.drawable.button_bg
                android.graphics.drawable.Drawable r8 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r8, r3)
                r2.setBackground(r8)
                r2.setEnabled(r4)
                java.lang.String r8 = "体育部审核"
                r7.J(r1, r8)
                goto Lcb
            L9d:
                r3 = 5
                if (r0 != r3) goto Lb4
                android.content.Context r8 = r6.e
                int r3 = com.bxkj.competition.R.drawable.button_bg
                android.graphics.drawable.Drawable r8 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r8, r3)
                r2.setBackground(r8)
                r2.setEnabled(r4)
                java.lang.String r8 = "体育部通过"
                r7.J(r1, r8)
                goto Lcb
            Lb4:
                android.content.Context r3 = r6.e
                int r5 = com.bxkj.competition.R.drawable.button_bg
                android.graphics.drawable.Drawable r3 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r3, r5)
                r2.setBackground(r3)
                r2.setEnabled(r4)
                java.lang.String r2 = "status"
                java.lang.String r8 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r2)
                r7.J(r1, r8)
            Lcb:
                com.bxkj.competition.signup.FreeProjectListActivity$c$a r8 = new com.bxkj.competition.signup.FreeProjectListActivity$c$a
                r8.<init>(r6, r0, r7)
                r7.w(r1, r8)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ int a;
        final /* synthetic */ com.bxkj.competition.signup.FreeProjectListActivity b;

        d(com.bxkj.competition.signup.FreeProjectListActivity r1, int r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void netOnOtherStatus(int r2, java.lang.String r3) {
                r1 = this;
                super.netOnOtherStatus(r2, r3)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.competition.signup.FreeProjectListActivity r0 = r1.b
                android.content.Context r0 = com.bxkj.competition.signup.FreeProjectListActivity.k0(r0)
                r2.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                r2.show()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.competition.signup.FreeProjectListActivity r3 = r2.b
                cn.bluemobi.dylan.base.adapter.common.recyclerview.MultiItemCommonAdapter r3 = com.bxkj.competition.signup.FreeProjectListActivity.j0(r3)
                int r0 = r2.a
                java.lang.Object r3 = r3.getItem(r0)
                java.util.Map r3 = (java.util.Map) r3
                r0 = 1
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                java.lang.String r1 = "operation"
                r3.put(r1, r0)
                com.bxkj.competition.signup.FreeProjectListActivity r3 = r2.b
                cn.bluemobi.dylan.base.adapter.common.recyclerview.MultiItemCommonAdapter r3 = com.bxkj.competition.signup.FreeProjectListActivity.j0(r3)
                int r0 = r2.a
                java.lang.Object r3 = r3.getItem(r0)
                java.util.Map r3 = (java.util.Map) r3
                java.lang.String r0 = "status"
                java.lang.String r1 = "待审核"
                r3.put(r0, r1)
                com.bxkj.competition.signup.FreeProjectListActivity r3 = r2.b
                cn.bluemobi.dylan.base.adapter.common.recyclerview.MultiItemCommonAdapter r3 = com.bxkj.competition.signup.FreeProjectListActivity.j0(r3)
                int r0 = r2.a
                r3.notifyItemChanged(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ int a;
        final /* synthetic */ com.bxkj.competition.signup.FreeProjectListActivity b;

        e(com.bxkj.competition.signup.FreeProjectListActivity r1, int r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void netOnOtherStatus(int r2, java.lang.String r3) {
                r1 = this;
                super.netOnOtherStatus(r2, r3)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.competition.signup.FreeProjectListActivity r0 = r1.b
                android.content.Context r0 = com.bxkj.competition.signup.FreeProjectListActivity.m0(r0)
                r2.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                r2.show()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.competition.signup.FreeProjectListActivity r3 = r2.b
                java.lang.String r3 = com.bxkj.competition.signup.FreeProjectListActivity.l0(r3)
                boolean r3 = android.text.TextUtils.isEmpty(r3)
                if (r3 != 0) goto L27
                com.bxkj.competition.signup.FreeProjectListActivity r3 = r2.b
                cn.bluemobi.dylan.base.adapter.common.recyclerview.MultiItemCommonAdapter r3 = com.bxkj.competition.signup.FreeProjectListActivity.j0(r3)
                java.util.List r3 = r3.d()
                int r0 = r2.a
                r3.remove(r0)
                com.bxkj.competition.signup.FreeProjectListActivity r3 = r2.b
                cn.bluemobi.dylan.base.adapter.common.recyclerview.MultiItemCommonAdapter r3 = com.bxkj.competition.signup.FreeProjectListActivity.j0(r3)
                int r0 = r2.a
                r3.notifyItemRemoved(r0)
                return
            L27:
                com.bxkj.competition.signup.FreeProjectListActivity r3 = r2.b
                cn.bluemobi.dylan.base.adapter.common.recyclerview.MultiItemCommonAdapter r3 = com.bxkj.competition.signup.FreeProjectListActivity.j0(r3)
                int r0 = r2.a
                java.lang.Object r3 = r3.getItem(r0)
                java.util.Map r3 = (java.util.Map) r3
                r0 = 0
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                java.lang.String r1 = "operation"
                r3.put(r1, r0)
                com.bxkj.competition.signup.FreeProjectListActivity r3 = r2.b
                cn.bluemobi.dylan.base.adapter.common.recyclerview.MultiItemCommonAdapter r3 = com.bxkj.competition.signup.FreeProjectListActivity.j0(r3)
                int r0 = r2.a
                java.lang.Object r3 = r3.getItem(r0)
                java.util.Map r3 = (java.util.Map) r3
                java.lang.String r0 = "status"
                java.lang.String r1 = "未报名"
                r3.put(r0, r1)
                com.bxkj.competition.signup.FreeProjectListActivity r3 = r2.b
                cn.bluemobi.dylan.base.adapter.common.recyclerview.MultiItemCommonAdapter r3 = com.bxkj.competition.signup.FreeProjectListActivity.j0(r3)
                int r0 = r2.a
                r3.notifyItemChanged(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class f extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.competition.signup.FreeProjectListActivity a;

        f(com.bxkj.competition.signup.FreeProjectListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFinish() {
                r1 = this;
                super.netOnFinish()
                com.bxkj.competition.signup.FreeProjectListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.competition.signup.FreeProjectListActivity.v0(r0)
                r0.w0()
                com.bxkj.competition.signup.FreeProjectListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.competition.signup.FreeProjectListActivity.v0(r0)
                r0.q0()
                return
        }

        public void netOnOtherStatus(int r2, java.lang.String r3) {
                r1 = this;
                super.netOnOtherStatus(r2, r3)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.competition.signup.FreeProjectListActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.competition.signup.FreeProjectListActivity.r0(r0)
                r2.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                r2.show()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.competition.signup.FreeProjectListActivity r0 = r2.a
                java.lang.String r1 = "total"
                java.lang.String r1 = cn.bluemobi.dylan.base.utils.u.O(r3, r1)
                int r1 = java.lang.Integer.parseInt(r1)
                com.bxkj.competition.signup.FreeProjectListActivity.h0(r0, r1)
                java.lang.String r0 = "itemDetail"
                java.lang.Object r3 = r3.get(r0)
                java.util.List r3 = (java.util.List) r3
                com.bxkj.competition.signup.FreeProjectListActivity r0 = r2.a
                int r0 = com.bxkj.competition.signup.FreeProjectListActivity.s0(r0)
                r1 = 1
                if (r0 != r1) goto L26
                com.bxkj.competition.signup.FreeProjectListActivity r0 = r2.a
                com.bxkj.competition.signup.FreeProjectListActivity.o0(r0, r3)
                goto L2f
            L26:
                com.bxkj.competition.signup.FreeProjectListActivity r0 = r2.a
                java.util.List r0 = com.bxkj.competition.signup.FreeProjectListActivity.n0(r0)
                r0.addAll(r3)
            L2f:
                com.bxkj.competition.signup.FreeProjectListActivity r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.MultiItemCommonAdapter r3 = com.bxkj.competition.signup.FreeProjectListActivity.j0(r3)
                com.bxkj.competition.signup.FreeProjectListActivity r0 = r2.a
                java.util.List r0 = com.bxkj.competition.signup.FreeProjectListActivity.n0(r0)
                r3.g(r0)
                com.bxkj.competition.signup.FreeProjectListActivity r3 = r2.a     // Catch: java.lang.Exception -> L4d
                cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r3 = com.bxkj.competition.signup.FreeProjectListActivity.q0(r3)     // Catch: java.lang.Exception -> L4d
                com.bxkj.competition.signup.FreeProjectListActivity r0 = r2.a     // Catch: java.lang.Exception -> L4d
                com.bxkj.competition.signup.StickyDecoration r0 = com.bxkj.competition.signup.FreeProjectListActivity.p0(r0)     // Catch: java.lang.Exception -> L4d
                r3.removeItemDecoration(r0)     // Catch: java.lang.Exception -> L4d
            L4d:
                com.bxkj.competition.signup.FreeProjectListActivity r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r3 = com.bxkj.competition.signup.FreeProjectListActivity.q0(r3)
                com.bxkj.competition.signup.FreeProjectListActivity r0 = r2.a
                com.bxkj.competition.signup.StickyDecoration r0 = com.bxkj.competition.signup.FreeProjectListActivity.p0(r0)
                r3.addItemDecoration(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class g extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.competition.signup.FreeProjectListActivity a;

        g(com.bxkj.competition.signup.FreeProjectListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFinish() {
                r1 = this;
                super.netOnFinish()
                com.bxkj.competition.signup.FreeProjectListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.competition.signup.FreeProjectListActivity.v0(r0)
                r0.w0()
                com.bxkj.competition.signup.FreeProjectListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.competition.signup.FreeProjectListActivity.v0(r0)
                r0.q0()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.competition.signup.FreeProjectListActivity r0 = r2.a
                java.lang.String r1 = "total"
                java.lang.String r1 = cn.bluemobi.dylan.base.utils.u.O(r3, r1)
                int r1 = java.lang.Integer.parseInt(r1)
                com.bxkj.competition.signup.FreeProjectListActivity.h0(r0, r1)
                java.lang.String r0 = "data"
                java.lang.Object r3 = r3.get(r0)
                java.util.List r3 = (java.util.List) r3
                com.bxkj.competition.signup.FreeProjectListActivity r0 = r2.a
                int r0 = com.bxkj.competition.signup.FreeProjectListActivity.s0(r0)
                r1 = 1
                if (r0 != r1) goto L26
                com.bxkj.competition.signup.FreeProjectListActivity r0 = r2.a
                com.bxkj.competition.signup.FreeProjectListActivity.o0(r0, r3)
                goto L2f
            L26:
                com.bxkj.competition.signup.FreeProjectListActivity r0 = r2.a
                java.util.List r0 = com.bxkj.competition.signup.FreeProjectListActivity.n0(r0)
                r0.addAll(r3)
            L2f:
                com.bxkj.competition.signup.FreeProjectListActivity r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.MultiItemCommonAdapter r3 = com.bxkj.competition.signup.FreeProjectListActivity.j0(r3)
                com.bxkj.competition.signup.FreeProjectListActivity r0 = r2.a
                java.util.List r0 = com.bxkj.competition.signup.FreeProjectListActivity.n0(r0)
                r3.g(r0)
                com.bxkj.competition.signup.FreeProjectListActivity r3 = r2.a     // Catch: java.lang.Exception -> L4d
                cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r3 = com.bxkj.competition.signup.FreeProjectListActivity.q0(r3)     // Catch: java.lang.Exception -> L4d
                com.bxkj.competition.signup.FreeProjectListActivity r0 = r2.a     // Catch: java.lang.Exception -> L4d
                com.bxkj.competition.signup.StickyDecoration r0 = com.bxkj.competition.signup.FreeProjectListActivity.p0(r0)     // Catch: java.lang.Exception -> L4d
                r3.removeItemDecoration(r0)     // Catch: java.lang.Exception -> L4d
            L4d:
                com.bxkj.competition.signup.FreeProjectListActivity r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r3 = com.bxkj.competition.signup.FreeProjectListActivity.q0(r3)
                com.bxkj.competition.signup.FreeProjectListActivity r0 = r2.a
                com.bxkj.competition.signup.StickyDecoration r0 = com.bxkj.competition.signup.FreeProjectListActivity.p0(r0)
                r3.addItemDecoration(r0)
                return
        }
    }

    public FreeProjectListActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.b0 = r0
            r0 = 1
            r1.c0 = r0
            r0 = 0
            r1.f667k0 = r0
            r0 = 10
            r1.f668p0 = r0
            return
    }

    private void A0(int r5) {
            r4 = this;
            android.content.Context r0 = r4.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideOtherStatusMessage()
            java.lang.Class<com.bxkj.competition.b> r1 = com.bxkj.competition.b.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.competition.b r1 = (com.bxkj.competition.b) r1
            cn.bluemobi.dylan.base.adapter.common.recyclerview.MultiItemCommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r2 = r4.F0
            java.lang.Object r2 = r2.getItem(r5)
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r3 = "id"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r3)
            com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r3 = r3.getUserId()
            rx.e r1 = r1.f(r2, r3)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.competition.signup.FreeProjectListActivity$e r1 = new com.bxkj.competition.signup.FreeProjectListActivity$e
            r1.<init>(r4, r5)
            r0.setDataListener(r1)
            return
    }

    private void B0() {
            r4 = this;
            android.content.Context r0 = r4.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideOtherStatusMessage()
            java.lang.Class<com.bxkj.competition.b> r1 = com.bxkj.competition.b.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.competition.b r1 = (com.bxkj.competition.b) r1
            java.lang.String r2 = r4.G0
            com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r3 = r3.getUserId()
            rx.e r1 = r1.b(r2, r3)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.competition.signup.FreeProjectListActivity$f r1 = new com.bxkj.competition.signup.FreeProjectListActivity$f
            r1.<init>(r4)
            r0.setDataListener(r1)
            return
    }

    private void C0() {
            r4 = this;
            android.content.Context r0 = r4.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<com.bxkj.competition.b> r1 = com.bxkj.competition.b.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.competition.b r1 = (com.bxkj.competition.b) r1
            java.lang.String r2 = r4.G0
            com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r3 = r3.getUserId()
            rx.e r1 = r1.h(r2, r3)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.competition.signup.FreeProjectListActivity$g r1 = new com.bxkj.competition.signup.FreeProjectListActivity$g
            r1.<init>(r4)
            r0.setDataListener(r1)
            return
    }

    private void D0() {
            r4 = this;
            com.bxkj.competition.signup.FreeProjectListActivity$b r0 = new com.bxkj.competition.signup.FreeProjectListActivity$b
            r0.<init>(r4)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = r4.Z
            androidx.recyclerview.widget.LinearLayoutManager r2 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r3 = r4.V
            r2.<init>(r3)
            r1.setLayoutManager(r2)
            android.view.animation.LayoutAnimationController r1 = new android.view.animation.LayoutAnimationController
            int r2 = com.bxkj.competition.R.anim.zoom_in
            android.view.animation.Animation r2 = android.view.animation.AnimationUtils.loadAnimation(r4, r2)
            r1.<init>(r2)
            r2 = 0
            r1.setOrder(r2)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r2 = r4.Z
            r2.setLayoutAnimation(r1)
            com.bxkj.competition.signup.FreeProjectListActivity$c r1 = new com.bxkj.competition.signup.FreeProjectListActivity$c
            android.content.Context r2 = r4.V
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.b0
            r1.<init>(r4, r2, r3, r0)
            r4.F0 = r1
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.Z
            r0.setAdapter(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.Z
            int r1 = com.bxkj.competition.R.id.tv_emptyView
            android.view.View r1 = r4.findViewById(r1)
            r0.setEmptyView(r1)
            com.bxkj.competition.signup.StickyDecoration r0 = new com.bxkj.competition.signup.StickyDecoration
            android.content.Context r1 = r4.V
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2 = r4.b0
            r0.<init>(r1, r2)
            r4.H0 = r0
            return
    }

    private void E0() {
            r2 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r2.Y
            com.bxkj.competition.signup.FreeProjectListActivity$a r1 = new com.bxkj.competition.signup.FreeProjectListActivity$a
            r1.<init>(r2)
            r0.m1(r1)
            return
    }

    static /* synthetic */ int g0(com.bxkj.competition.signup.FreeProjectListActivity r0) {
            int r0 = r0.c0
            return r0
    }

    static /* synthetic */ int h0(com.bxkj.competition.signup.FreeProjectListActivity r0, int r1) {
            r0.c0 = r1
            return r1
    }

    static /* synthetic */ int i0(com.bxkj.competition.signup.FreeProjectListActivity r0) {
            int r0 = r0.f668p0
            return r0
    }

    static /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.MultiItemCommonAdapter j0(com.bxkj.competition.signup.FreeProjectListActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.MultiItemCommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.F0
            return r0
    }

    static /* synthetic */ android.content.Context k0(com.bxkj.competition.signup.FreeProjectListActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ java.lang.String l0(com.bxkj.competition.signup.FreeProjectListActivity r0) {
            java.lang.String r0 = r0.I0
            return r0
    }

    static /* synthetic */ android.content.Context m0(com.bxkj.competition.signup.FreeProjectListActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ java.util.List n0(com.bxkj.competition.signup.FreeProjectListActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.b0
            return r0
    }

    static /* synthetic */ java.util.List o0(com.bxkj.competition.signup.FreeProjectListActivity r0, java.util.List r1) {
            r0.b0 = r1
            return r1
    }

    static /* synthetic */ com.bxkj.competition.signup.StickyDecoration p0(com.bxkj.competition.signup.FreeProjectListActivity r0) {
            com.bxkj.competition.signup.StickyDecoration r0 = r0.H0
            return r0
    }

    static /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView q0(com.bxkj.competition.signup.FreeProjectListActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r0.Z
            return r0
    }

    static /* synthetic */ android.content.Context r0(com.bxkj.competition.signup.FreeProjectListActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ int s0(com.bxkj.competition.signup.FreeProjectListActivity r0) {
            int r0 = r0.f667k0
            return r0
    }

    static /* synthetic */ int t0(com.bxkj.competition.signup.FreeProjectListActivity r0, int r1) {
            r0.f667k0 = r1
            return r1
    }

    static /* synthetic */ int u0(com.bxkj.competition.signup.FreeProjectListActivity r2) {
            int r0 = r2.f667k0
            int r1 = r0 + 1
            r2.f667k0 = r1
            return r0
    }

    static /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout v0(com.bxkj.competition.signup.FreeProjectListActivity r0) {
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.Y
            return r0
    }

    static /* synthetic */ void w0(com.bxkj.competition.signup.FreeProjectListActivity r0) {
            r0.B0()
            return
    }

    static /* synthetic */ void x0(com.bxkj.competition.signup.FreeProjectListActivity r0, int r1) {
            r0.z0(r1)
            return
    }

    static /* synthetic */ void y0(com.bxkj.competition.signup.FreeProjectListActivity r0, int r1) {
            r0.A0(r1)
            return
    }

    private void z0(int r5) {
            r4 = this;
            android.content.Context r0 = r4.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideOtherStatusMessage()
            java.lang.Class<com.bxkj.competition.b> r1 = com.bxkj.competition.b.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.competition.b r1 = (com.bxkj.competition.b) r1
            cn.bluemobi.dylan.base.adapter.common.recyclerview.MultiItemCommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r2 = r4.F0
            java.lang.Object r2 = r2.getItem(r5)
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r3 = "id"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r3)
            com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r3 = r3.getUserId()
            rx.e r1 = r1.d(r2, r3)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.competition.signup.FreeProjectListActivity$d r1 = new com.bxkj.competition.signup.FreeProjectListActivity$d
            r1.<init>(r4, r5)
            r0.setDataListener(r1)
            return
    }

    public void L() {
            r1 = this;
            android.widget.TextView r0 = r1.a0
            r0.setOnClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            int r0 = com.bxkj.competition.R.layout.ac_competition_project_list
            return r0
    }

    public void R() {
            r2 = this;
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r1 = "competitionId"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L16
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r2.G0 = r0
        L16:
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r1 = "from"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L2c
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r2.I0 = r0
        L2c:
            r2.E0()
            r2.D0()
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r2.Y
            r1 = 0
            r0.X0(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r2.Y
            r0.S0(r1)
            java.lang.String r0 = r2.I0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L4e
            java.lang.String r0 = "我报名的竞赛项目"
            r2.setTitle(r0)
            r2.C0()
            return
        L4e:
            r2.B0()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "竞赛报名项目列表"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            int r1 = com.bxkj.competition.R.id.refresh
            android.view.View r1 = r0.findViewById(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = (com.scwang.smartrefresh.layout.SmartRefreshLayout) r1
            r0.Y = r1
            int r1 = com.bxkj.competition.R.id.recyclerView
            android.view.View r1 = r0.findViewById(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = (cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView) r1
            r0.Z = r1
            int r1 = com.bxkj.competition.R.id.tv_ok
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.a0 = r1
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}
