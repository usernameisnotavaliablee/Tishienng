package com.bxkj.student.life.lost;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class LostDetailActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.TextView F0;
    private android.widget.TextView G0;
    private android.widget.TextView H0;
    private android.widget.CheckBox I0;
    private androidx.recyclerview.widget.RecyclerView J0;
    private android.widget.Button K0;
    private android.widget.RelativeLayout L0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> M0;
    private java.lang.String N0;
    private java.util.Map<java.lang.String, java.lang.Object> O0;
    private java.util.List<java.lang.String> P0;
    private cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.lang.String> Q0;
    private int R0;
    private java.lang.String S0;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> T0;
    private java.lang.String U0;
    private android.widget.TextView Y;
    private android.widget.TextView Z;
    private android.widget.TextView a0;
    private cn.bluemobi.dylan.base.view.MyGridView b0;
    private android.widget.LinearLayout c0;

    /* renamed from: k0, reason: collision with root package name */
    private android.widget.EditText f993k0;

    /* renamed from: p0, reason: collision with root package name */
    private android.widget.TextView f994p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.lang.String> {
        final /* synthetic */ com.bxkj.student.life.lost.LostDetailActivity e;

        a(com.bxkj.student.life.lost.LostDetailActivity r1, android.content.Context r2, int r3, java.util.List r4) {
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
                r1 = 2131689689(0x7f0f00d9, float:1.90084E38)
                r3.t(r0, r4, r1, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.life.lost.LostDetailActivity k;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements android.view.View.OnClickListener {
            final /* synthetic */ java.lang.String a;
            final /* synthetic */ com.bxkj.student.life.lost.LostDetailActivity.b b;

            a(com.bxkj.student.life.lost.LostDetailActivity.b r1, java.lang.String r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r2) {
                    r1 = this;
                    com.bxkj.student.life.lost.LostDetailActivity$b r2 = r1.b
                    com.bxkj.student.life.lost.LostDetailActivity r2 = r2.k
                    java.lang.String r0 = r1.a
                    com.bxkj.student.life.lost.LostDetailActivity.n0(r2, r0)
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bxkj.student.life.lost.LostDetailActivity$b$b, reason: collision with other inner class name */
        class C0105b extends cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> {
            final /* synthetic */ com.bxkj.student.life.lost.LostDetailActivity.b e;

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            /* renamed from: com.bxkj.student.life.lost.LostDetailActivity$b$b$a */
            class a implements android.view.View.OnClickListener {
                final /* synthetic */ java.util.Map a;
                final /* synthetic */ com.bxkj.student.life.lost.LostDetailActivity.b.C0105b b;

                a(com.bxkj.student.life.lost.LostDetailActivity.b.C0105b r1, java.util.Map r2) {
                        r0 = this;
                        r0.b = r1
                        r0.a = r2
                        r0.<init>()
                        return
                }

                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View r3) {
                        r2 = this;
                        com.bxkj.student.life.lost.LostDetailActivity$b$b r3 = r2.b
                        com.bxkj.student.life.lost.LostDetailActivity$b r3 = r3.e
                        com.bxkj.student.life.lost.LostDetailActivity r3 = r3.k
                        java.util.Map r0 = r2.a
                        java.lang.String r1 = "validateAnswerId"
                        java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r1)
                        java.lang.String r1 = "1"
                        com.bxkj.student.life.lost.LostDetailActivity.o0(r3, r0, r1)
                        return
                }
            }

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            /* renamed from: com.bxkj.student.life.lost.LostDetailActivity$b$b$b, reason: collision with other inner class name */
            class ViewOnClickListenerC0106b implements android.view.View.OnClickListener {
                final /* synthetic */ java.util.Map a;
                final /* synthetic */ com.bxkj.student.life.lost.LostDetailActivity.b.C0105b b;

                ViewOnClickListenerC0106b(com.bxkj.student.life.lost.LostDetailActivity.b.C0105b r1, java.util.Map r2) {
                        r0 = this;
                        r0.b = r1
                        r0.a = r2
                        r0.<init>()
                        return
                }

                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View r3) {
                        r2 = this;
                        com.bxkj.student.life.lost.LostDetailActivity$b$b r3 = r2.b
                        com.bxkj.student.life.lost.LostDetailActivity$b r3 = r3.e
                        com.bxkj.student.life.lost.LostDetailActivity r3 = r3.k
                        java.util.Map r0 = r2.a
                        java.lang.String r1 = "validateAnswerId"
                        java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r1)
                        java.lang.String r1 = "0"
                        com.bxkj.student.life.lost.LostDetailActivity.o0(r3, r0, r1)
                        return
                }
            }

            C0105b(com.bxkj.student.life.lost.LostDetailActivity.b r1, android.content.Context r2, int r3, java.util.List r4) {
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

            public void d(cn.bluemobi.dylan.base.adapter.common.ViewHolder r11, java.util.Map<java.lang.String, java.lang.Object> r12) {
                    r10 = this;
                    java.lang.String r0 = "validateAnswer"
                    java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r12, r0)
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "validateUser"
                    java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r12, r2)
                    r1.append(r2)
                    java.lang.String r2 = ":"
                    r1.append(r2)
                    r1.append(r0)
                    java.lang.String r0 = r1.toString()
                    r1 = 2131298775(0x7f0909d7, float:1.8215533E38)
                    r11.J(r1, r0)
                    com.bxkj.student.life.lost.LostDetailActivity$b r0 = r10.e
                    com.bxkj.student.life.lost.LostDetailActivity r0 = r0.k
                    java.lang.String r0 = com.bxkj.student.life.lost.LostDetailActivity.i0(r0)
                    java.lang.String r1 = "Y"
                    boolean r0 = r1.equals(r0)
                    r2 = 2131296641(0x7f090181, float:1.8211204E38)
                    r11.N(r2, r0)
                    android.view.View r0 = r11.h(r2)
                    android.widget.Button r0 = (android.widget.Button) r0
                    r3 = 2131296606(0x7f09015e, float:1.8211133E38)
                    android.view.View r4 = r11.h(r3)
                    android.widget.Button r4 = (android.widget.Button) r4
                    r5 = 2131296653(0x7f09018d, float:1.8211229E38)
                    android.view.View r5 = r11.h(r5)
                    android.widget.Button r5 = (android.widget.Button) r5
                    java.lang.String r6 = "reviewResult"
                    java.lang.String r7 = cn.bluemobi.dylan.http.JsonParse.getString(r12, r6)
                    java.lang.String r8 = "未审核"
                    boolean r7 = r8.equals(r7)
                    r8 = 8
                    r9 = 0
                    if (r7 == 0) goto L92
                    com.bxkj.student.life.lost.LostDetailActivity$b r6 = r10.e
                    com.bxkj.student.life.lost.LostDetailActivity r6 = r6.k
                    java.lang.String r6 = com.bxkj.student.life.lost.LostDetailActivity.i0(r6)
                    boolean r1 = r1.equals(r6)
                    if (r1 == 0) goto L82
                    r5.setVisibility(r8)
                    r0.setVisibility(r9)
                    r4.setVisibility(r9)
                    r1 = 1
                    r0.setEnabled(r1)
                    r4.setEnabled(r1)
                    goto Lc3
                L82:
                    r5.setVisibility(r9)
                    r0.setVisibility(r8)
                    r4.setVisibility(r8)
                    r0.setEnabled(r9)
                    r4.setEnabled(r9)
                    goto Lc3
                L92:
                    java.lang.String r1 = "正确"
                    java.lang.String r7 = cn.bluemobi.dylan.http.JsonParse.getString(r12, r6)
                    boolean r1 = r1.equals(r7)
                    if (r1 == 0) goto Lab
                    r0.setEnabled(r9)
                    r0.setVisibility(r9)
                    r4.setVisibility(r8)
                    r5.setVisibility(r8)
                    goto Lc3
                Lab:
                    java.lang.String r1 = "错误"
                    java.lang.String r6 = cn.bluemobi.dylan.http.JsonParse.getString(r12, r6)
                    boolean r1 = r1.equals(r6)
                    if (r1 == 0) goto Lc3
                    r4.setEnabled(r9)
                    r0.setVisibility(r8)
                    r4.setVisibility(r9)
                    r5.setVisibility(r8)
                Lc3:
                    com.bxkj.student.life.lost.LostDetailActivity$b$b$a r0 = new com.bxkj.student.life.lost.LostDetailActivity$b$b$a
                    r0.<init>(r10, r12)
                    r11.w(r2, r0)
                    com.bxkj.student.life.lost.LostDetailActivity$b$b$b r0 = new com.bxkj.student.life.lost.LostDetailActivity$b$b$b
                    r0.<init>(r10, r12)
                    r11.w(r3, r0)
                    return
            }
        }

        b(com.bxkj.student.life.lost.LostDetailActivity r1, android.content.Context r2, int r3, java.util.List r4) {
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

        public void m(cn.bluemobi.dylan.base.adapter.common.ViewHolder r6, java.util.Map<java.lang.String, java.lang.Object> r7) {
                r5 = this;
                java.lang.String r0 = "question"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r7, r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                int r2 = r6.f()
                int r2 = r2 + 1
                r1.append(r2)
                java.lang.String r2 = "."
                r1.append(r2)
                r1.append(r0)
                java.lang.String r1 = r1.toString()
                r2 = 2131299058(0x7f090af2, float:1.8216107E38)
                r6.J(r2, r1)
                com.bxkj.student.life.lost.LostDetailActivity$b$a r1 = new com.bxkj.student.life.lost.LostDetailActivity$b$a
                r1.<init>(r5, r0)
                r0 = 2131296640(0x7f090180, float:1.8211202E38)
                r6.w(r0, r1)
                r1 = 2131298097(0x7f090731, float:1.8214158E38)
                android.view.View r1 = r6.h(r1)
                android.widget.ListView r1 = (android.widget.ListView) r1
                java.lang.String r2 = "answer"
                java.util.List r7 = cn.bluemobi.dylan.http.JsonParse.getList(r7, r2)
                com.bxkj.student.life.lost.LostDetailActivity$b$b r2 = new com.bxkj.student.life.lost.LostDetailActivity$b$b
                android.content.Context r3 = r5.e
                r4 = 2131493227(0x7f0c016b, float:1.8609928E38)
                r2.<init>(r5, r3, r4, r7)
                r1.setAdapter(r2)
                com.bxkj.student.life.lost.LostDetailActivity r7 = r5.k
                java.lang.String r7 = com.bxkj.student.life.lost.LostDetailActivity.i0(r7)
                java.lang.String r1 = "N"
                boolean r7 = r1.equals(r7)
                r6.N(r0, r7)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements android.widget.AdapterView.OnItemClickListener {
        final /* synthetic */ com.bxkj.student.life.lost.LostDetailActivity a;

        c(com.bxkj.student.life.lost.LostDetailActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
                r0 = this;
                com.bxkj.student.life.lost.LostDetailActivity r1 = r0.a
                java.util.List r1 = com.bxkj.student.life.lost.LostDetailActivity.h0(r1)
                int r1 = r1.size()
                java.lang.String[] r1 = new java.lang.String[r1]
                com.bxkj.student.life.lost.LostDetailActivity r2 = r0.a
                java.util.List r4 = com.bxkj.student.life.lost.LostDetailActivity.h0(r2)
                java.lang.Object[] r1 = r4.toArray(r1)
                java.lang.String[] r1 = (java.lang.String[]) r1
                com.bxkj.student.life.lost.LostDetailActivity.q0(r2, r1, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d implements cn.bluemobi.dylan.base.view.iOSTwoButtonDialog.RightButtonOnClick {
        final /* synthetic */ rx.e a;
        final /* synthetic */ com.bxkj.student.life.lost.LostDetailActivity b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a extends cn.bluemobi.dylan.http.HttpCallBack {
            final /* synthetic */ com.bxkj.student.life.lost.LostDetailActivity.d a;

            a(com.bxkj.student.life.lost.LostDetailActivity.d r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r2) {
                    r1 = this;
                    cn.bluemobi.dylan.base.utils.a r2 = cn.bluemobi.dylan.base.utils.a.n()
                    java.lang.Class<com.bxkj.student.life.lost.MyLostGoodsActivity> r0 = com.bxkj.student.life.lost.MyLostGoodsActivity.class
                    android.app.Activity r2 = r2.getActivity(r0)
                    com.bxkj.student.life.lost.MyLostGoodsActivity r2 = (com.bxkj.student.life.lost.MyLostGoodsActivity) r2
                    if (r2 == 0) goto L11
                    r2.t0()
                L11:
                    com.bxkj.student.life.lost.LostDetailActivity$d r2 = r1.a
                    com.bxkj.student.life.lost.LostDetailActivity r2 = r2.b
                    android.widget.Button r2 = com.bxkj.student.life.lost.LostDetailActivity.g0(r2)
                    java.lang.CharSequence r2 = r2.getText()
                    java.lang.String r2 = r2.toString()
                    java.lang.String r2 = r2.trim()
                    java.lang.String r0 = "删除"
                    boolean r2 = r2.equals(r0)
                    if (r2 == 0) goto L4f
                    com.bxkj.student.life.lost.LostDetailActivity$d r2 = r1.a
                    com.bxkj.student.life.lost.LostDetailActivity r2 = r2.b
                    java.lang.String r0 = "删除成功"
                    r2.f0(r0)
                    cn.bluemobi.dylan.base.utils.a r2 = cn.bluemobi.dylan.base.utils.a.n()
                    java.lang.Class<com.bxkj.student.life.lost.LostGoodsFragment> r0 = com.bxkj.student.life.lost.LostGoodsFragment.class
                    androidx.fragment.app.Fragment r2 = r2.o(r0)
                    com.bxkj.student.life.lost.LostGoodsFragment r2 = (com.bxkj.student.life.lost.LostGoodsFragment) r2
                    if (r2 == 0) goto L47
                    r2.f0()
                L47:
                    com.bxkj.student.life.lost.LostDetailActivity$d r2 = r1.a
                    com.bxkj.student.life.lost.LostDetailActivity r2 = r2.b
                    r2.finish()
                    return
                L4f:
                    com.bxkj.student.life.lost.LostDetailActivity$d r2 = r1.a
                    com.bxkj.student.life.lost.LostDetailActivity r2 = r2.b
                    java.lang.String r0 = "已关闭"
                    r2.f0(r0)
                    com.bxkj.student.life.lost.LostDetailActivity$d r2 = r1.a
                    com.bxkj.student.life.lost.LostDetailActivity r2 = r2.b
                    com.bxkj.student.life.lost.LostDetailActivity.m0(r2)
                    return
            }
        }

        d(com.bxkj.student.life.lost.LostDetailActivity r1, rx.e r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void buttonRightOnClick() {
                r2 = this;
                com.bxkj.student.life.lost.LostDetailActivity r0 = r2.b
                android.content.Context r0 = com.bxkj.student.life.lost.LostDetailActivity.r0(r0)
                cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
                rx.e r1 = r2.a
                cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
                com.bxkj.student.life.lost.LostDetailActivity$d$a r1 = new com.bxkj.student.life.lost.LostDetailActivity$d$a
                r1.<init>(r2)
                r0.setDataListener(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.life.lost.LostDetailActivity a;

        e(com.bxkj.student.life.lost.LostDetailActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.life.lost.LostDetailActivity r0 = r2.a
                android.widget.RelativeLayout r0 = com.bxkj.student.life.lost.LostDetailActivity.k0(r0)
                r1 = 0
                r0.setVisibility(r1)
                com.bxkj.student.life.lost.LostDetailActivity r0 = r2.a
                com.bxkj.student.life.lost.LostDetailActivity.l0(r0, r3)
                com.bxkj.student.life.lost.LostDetailActivity r3 = r2.a
                com.bxkj.student.life.lost.LostDetailActivity.p0(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class f implements cn.bluemobi.dylan.base.view.iOSTwoButtonDialog.RightButtonOnClick {
        final /* synthetic */ cn.bluemobi.dylan.base.view.iOSTwoButtonDialog a;
        final /* synthetic */ java.lang.String b;
        final /* synthetic */ com.bxkj.student.life.lost.LostDetailActivity c;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a extends cn.bluemobi.dylan.http.HttpCallBack {
            final /* synthetic */ com.bxkj.student.life.lost.LostDetailActivity.f a;

            a(com.bxkj.student.life.lost.LostDetailActivity.f r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public void netOnOtherStatus(int r2, java.lang.String r3) {
                    r1 = this;
                    super.netOnOtherStatus(r2, r3)
                    cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                    com.bxkj.student.life.lost.LostDetailActivity$f r0 = r1.a
                    com.bxkj.student.life.lost.LostDetailActivity r0 = r0.c
                    android.content.Context r0 = com.bxkj.student.life.lost.LostDetailActivity.s0(r0)
                    r2.<init>(r0)
                    cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                    r2.show()
                    return
            }

            public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r2) {
                    r1 = this;
                    com.bxkj.student.life.lost.LostDetailActivity$f r2 = r1.a
                    cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r2 = r2.a
                    r2.dismiss()
                    com.bxkj.student.life.lost.LostDetailActivity$f r2 = r1.a
                    com.bxkj.student.life.lost.LostDetailActivity r2 = r2.c
                    java.lang.String r0 = "已提交回答，等待对方审核"
                    r2.f0(r0)
                    com.bxkj.student.life.lost.LostDetailActivity$f r2 = r1.a
                    com.bxkj.student.life.lost.LostDetailActivity r2 = r2.c
                    com.bxkj.student.life.lost.LostDetailActivity.m0(r2)
                    return
            }
        }

        f(com.bxkj.student.life.lost.LostDetailActivity r1, cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r2, java.lang.String r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        public void buttonRightOnClick() {
                r6 = this;
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r6.a
                r0.show()
                cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r6.a
                r1 = 2131296927(0x7f09029f, float:1.8211784E38)
                android.view.View r0 = r0.findViewById(r1)
                android.widget.EditText r0 = (android.widget.EditText) r0
                android.text.Editable r0 = r0.getText()
                java.lang.String r0 = r0.toString()
                java.lang.String r0 = r0.trim()
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L2a
                com.bxkj.student.life.lost.LostDetailActivity r0 = r6.c
                java.lang.String r1 = "答案不能为空"
                r0.f0(r1)
                return
            L2a:
                com.bxkj.student.life.lost.LostDetailActivity r1 = r6.c
                android.content.Context r1 = com.bxkj.student.life.lost.LostDetailActivity.t0(r1)
                cn.bluemobi.dylan.http.HttpRequest r1 = cn.bluemobi.dylan.http.Http.with(r1)
                cn.bluemobi.dylan.http.HttpRequest r1 = r1.hideOtherStatusMessage()
                java.lang.Class<w.e> r2 = w.e.class
                java.lang.Object r2 = cn.bluemobi.dylan.http.Http.getApiService(r2)
                w.e r2 = (w.e) r2
                com.bxkj.student.life.lost.LostDetailActivity r3 = r6.c
                java.lang.String r3 = com.bxkj.student.life.lost.LostDetailActivity.j0(r3)
                com.bxkj.base.user.LoginUser r4 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r4 = r4.getOpenId()
                java.lang.String r5 = r6.b
                rx.e r0 = r2.d(r3, r4, r5, r0)
                cn.bluemobi.dylan.http.HttpRequest r0 = r1.setObservable(r0)
                com.bxkj.student.life.lost.LostDetailActivity$f$a r1 = new com.bxkj.student.life.lost.LostDetailActivity$f$a
                r1.<init>(r6)
                r0.setDataListener(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class g extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.life.lost.LostDetailActivity a;

        g(com.bxkj.student.life.lost.LostDetailActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnOtherStatus(int r2, java.lang.String r3) {
                r1 = this;
                super.netOnOtherStatus(r2, r3)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.life.lost.LostDetailActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.student.life.lost.LostDetailActivity.u0(r0)
                r2.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                r2.show()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r1) {
                r0 = this;
                com.bxkj.student.life.lost.LostDetailActivity r1 = r0.a
                com.bxkj.student.life.lost.LostDetailActivity.m0(r1)
                return
        }
    }

    public LostDetailActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    private void A0() {
            r4 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.O0
            java.lang.String r1 = "phone"
            java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            r3 = 8
            if (r1 == 0) goto L1d
            android.widget.TextView r0 = r4.f994p0
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r3)
            goto L2d
        L1d:
            android.widget.TextView r1 = r4.f994p0
            android.view.ViewParent r1 = r1.getParent()
            android.view.View r1 = (android.view.View) r1
            r1.setVisibility(r2)
            android.widget.TextView r1 = r4.f994p0
            r1.setText(r0)
        L2d:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.O0
            java.lang.String r1 = "wechat"
            java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L47
            android.widget.TextView r0 = r4.F0
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r3)
            goto L57
        L47:
            android.widget.TextView r1 = r4.F0
            android.view.ViewParent r1 = r1.getParent()
            android.view.View r1 = (android.view.View) r1
            r1.setVisibility(r2)
            android.widget.TextView r1 = r4.F0
            r1.setText(r0)
        L57:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.O0
            java.lang.String r1 = "qq"
            java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L71
            android.widget.TextView r0 = r4.H0
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r3)
            return
        L71:
            android.widget.TextView r1 = r4.H0
            android.view.ViewParent r1 = r1.getParent()
            android.view.View r1 = (android.view.View) r1
            r1.setVisibility(r2)
            android.widget.TextView r1 = r4.H0
            r1.setText(r0)
            return
    }

    private void B0(java.lang.String[] r4, int r5) {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r3.V
            java.lang.Class<cn.bluemobi.dylan.photoview.ImagePagerActivity> r2 = cn.bluemobi.dylan.photoview.ImagePagerActivity.class
            r0.<init>(r1, r2)
            java.lang.String r1 = "image_urls"
            r0.putExtra(r1, r4)
            java.lang.String r4 = "image_index"
            r0.putExtra(r4, r5)
            r3.startActivity(r0)
            r4 = 2130772094(0x7f01007e, float:1.7147297E38)
            r5 = 2130772095(0x7f01007f, float:1.7147299E38)
            r3.overridePendingTransition(r4, r5)
            return
    }

    static /* bridge */ /* synthetic */ android.widget.Button g0(com.bxkj.student.life.lost.LostDetailActivity r0) {
            android.widget.Button r0 = r0.K0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List h0(com.bxkj.student.life.lost.LostDetailActivity r0) {
            java.util.List<java.lang.String> r0 = r0.P0
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String i0(com.bxkj.student.life.lost.LostDetailActivity r0) {
            java.lang.String r0 = r0.U0
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String j0(com.bxkj.student.life.lost.LostDetailActivity r0) {
            java.lang.String r0 = r0.N0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.RelativeLayout k0(com.bxkj.student.life.lost.LostDetailActivity r0) {
            android.widget.RelativeLayout r0 = r0.L0
            return r0
    }

    static /* bridge */ /* synthetic */ void l0(com.bxkj.student.life.lost.LostDetailActivity r0, java.util.Map r1) {
            r0.O0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void m0(com.bxkj.student.life.lost.LostDetailActivity r0) {
            r0.w0()
            return
    }

    static /* bridge */ /* synthetic */ void n0(com.bxkj.student.life.lost.LostDetailActivity r0, java.lang.String r1) {
            r0.x0(r1)
            return
    }

    static /* bridge */ /* synthetic */ void o0(com.bxkj.student.life.lost.LostDetailActivity r0, java.lang.String r1, java.lang.String r2) {
            r0.y0(r1, r2)
            return
    }

    static /* bridge */ /* synthetic */ void p0(com.bxkj.student.life.lost.LostDetailActivity r0) {
            r0.z0()
            return
    }

    static /* bridge */ /* synthetic */ void q0(com.bxkj.student.life.lost.LostDetailActivity r0, java.lang.String[] r1, int r2) {
            r0.B0(r1, r2)
            return
    }

    static /* synthetic */ android.content.Context r0(com.bxkj.student.life.lost.LostDetailActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context s0(com.bxkj.student.life.lost.LostDetailActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context t0(com.bxkj.student.life.lost.LostDetailActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context u0(com.bxkj.student.life.lost.LostDetailActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void v0() {
            r4 = this;
            android.widget.Button r0 = r4.K0
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            java.lang.String r1 = "删除"
            boolean r0 = r0.equals(r1)
            java.lang.Class<w.e> r1 = w.e.class
            if (r0 == 0) goto L2d
            java.lang.Object r0 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            w.e r0 = (w.e) r0
            java.lang.String r1 = r4.N0
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getOpenId()
            rx.e r0 = r0.b(r1, r2)
            goto L41
        L2d:
            java.lang.Object r0 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            w.e r0 = (w.e) r0
            java.lang.String r1 = r4.N0
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getOpenId()
            rx.e r0 = r0.a(r1, r2)
        L41:
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
            android.content.Context r2 = r4.V
            r1.<init>(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "确定要"
            r2.append(r3)
            android.widget.Button r3 = r4.K0
            java.lang.CharSequence r3 = r3.getText()
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r3.trim()
            r2.append(r3)
            java.lang.String r3 = "吗？"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1 = r1.setMessage(r2)
            com.bxkj.student.life.lost.LostDetailActivity$d r2 = new com.bxkj.student.life.lost.LostDetailActivity$d
            r2.<init>(r4, r0)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r1.setRightButtonOnClickListener(r2)
            r0.show()
            return
    }

    private void w0() {
            r4 = this;
            android.content.Context r0 = r4.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<w.e> r1 = w.e.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            w.e r1 = (w.e) r1
            java.lang.String r2 = r4.N0
            java.lang.String r3 = r4.S0
            rx.e r1 = r1.j(r2, r3)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.life.lost.LostDetailActivity$e r1 = new com.bxkj.student.life.lost.LostDetailActivity$e
            r1.<init>(r4)
            r0.setDataListener(r1)
            return
    }

    private void x0(java.lang.String r4) {
            r3 = this;
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
            android.content.Context r1 = r3.V
            r0.<init>(r1)
            java.lang.String r1 = "回答问题"
            r0.setTitle(r1)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1 = r0.setMessage(r4)
            r2 = 2131493156(0x7f0c0124, float:1.8609784E38)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r1 = r1.setCenterCustomView(r2)
            com.bxkj.student.life.lost.LostDetailActivity$f r2 = new com.bxkj.student.life.lost.LostDetailActivity$f
            r2.<init>(r3, r0, r4)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r4 = r1.setRightButtonOnClickListener(r2)
            r4.show()
            return
    }

    private void y0(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            android.content.Context r0 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideOtherStatusMessage()
            java.lang.Class<w.e> r1 = w.e.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            w.e r1 = (w.e) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getOpenId()
            rx.e r4 = r1.h(r2, r4, r5)
            cn.bluemobi.dylan.http.HttpRequest r4 = r0.setObservable(r4)
            com.bxkj.student.life.lost.LostDetailActivity$g r5 = new com.bxkj.student.life.lost.LostDetailActivity$g
            r5.<init>(r3)
            r4.setDataListener(r5)
            return
    }

    private void z0() {
            r8 = this;
            android.widget.TextView r0 = r8.Y
            java.util.Map<java.lang.String, java.lang.Object> r1 = r8.O0
            java.lang.String r2 = "publishTime"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
            r0.setText(r1)
            android.widget.TextView r0 = r8.Z
            java.util.Map<java.lang.String, java.lang.Object> r1 = r8.O0
            java.lang.String r2 = "goodsTypeName"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
            r0.setText(r1)
            android.widget.TextView r0 = r8.a0
            java.util.Map<java.lang.String, java.lang.Object> r1 = r8.O0
            java.lang.String r2 = "description"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
            r0.setText(r1)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r8.O0
            java.lang.String r1 = "img"
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.util.List r0 = cn.bluemobi.dylan.http.JsonParse.getList(r0, r1, r2)
            r8.P0 = r0
            cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.lang.String> r1 = r8.Q0
            r1.c(r0)
            cn.bluemobi.dylan.base.view.MyGridView r0 = r8.b0
            java.util.List<java.lang.String> r1 = r8.P0
            r2 = 8
            r3 = 0
            if (r1 == 0) goto L49
            int r1 = r1.size()
            if (r1 <= 0) goto L49
            r1 = 0
            goto L4b
        L49:
            r1 = 8
        L4b:
            r0.setVisibility(r1)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r8.O0
            java.lang.String r1 = "isValidate"
            int r0 = cn.bluemobi.dylan.http.JsonParse.getInt(r0, r1)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r8.O0
            java.lang.String r4 = "myMotice"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r4)
            r8.U0 = r1
            java.util.Map<java.lang.String, java.lang.Object> r1 = r8.O0
            java.lang.String r4 = "validateCount"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r4)
            java.util.Map<java.lang.String, java.lang.Object> r4 = r8.O0
            java.lang.String r5 = "afterTime"
            java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r5)
            android.widget.TextView r5 = r8.G0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "*输入答案错误超过"
            r6.append(r7)
            r6.append(r1)
            java.lang.String r1 = "次，需要"
            r6.append(r1)
            r6.append(r4)
            java.lang.String r1 = "以后再试"
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            r5.setText(r1)
            java.lang.String r1 = r8.U0
            java.lang.String r4 = "Y"
            boolean r1 = r1.equals(r4)
            java.lang.String r4 = "question"
            r5 = 1
            if (r1 == 0) goto L124
            if (r0 != r5) goto Lc1
            android.widget.CheckBox r0 = r8.I0
            r0.setVisibility(r3)
            android.widget.TextView r0 = r8.G0
            r0.setVisibility(r3)
            android.widget.CheckBox r0 = r8.I0
            java.lang.String r1 = "回答与失物有关的问题，才能查看我的联系方式"
            r0.setText(r1)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r8.O0
            java.util.List r0 = cn.bluemobi.dylan.http.JsonParse.getList(r0, r4)
            r8.M0 = r0
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r1 = r8.T0
            r1.g(r0)
            goto Lcb
        Lc1:
            android.widget.CheckBox r0 = r8.I0
            r0.setVisibility(r2)
            android.widget.TextView r0 = r8.G0
            r0.setVisibility(r2)
        Lcb:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r8.O0
            java.lang.String r1 = "status"
            java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r1)
            android.widget.Button r1 = r8.K0
            r1.setVisibility(r3)
            java.lang.String r1 = "0"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto Led
            android.widget.Button r0 = r8.K0
            r0.setEnabled(r5)
            android.widget.Button r0 = r8.K0
            java.lang.String r1 = "删除"
            r0.setText(r1)
            goto L148
        Led:
            java.lang.String r1 = "1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L102
            android.widget.Button r0 = r8.K0
            r0.setEnabled(r5)
            android.widget.Button r0 = r8.K0
            java.lang.String r1 = "关闭"
            r0.setText(r1)
            goto L148
        L102:
            java.lang.String r1 = "2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L117
            android.widget.Button r0 = r8.K0
            r0.setEnabled(r3)
            android.widget.Button r0 = r8.K0
            java.lang.String r1 = "审核不通过"
            r0.setText(r1)
            goto L148
        L117:
            android.widget.Button r0 = r8.K0
            r0.setEnabled(r3)
            android.widget.Button r0 = r8.K0
            java.lang.String r1 = "已关闭"
            r0.setText(r1)
            goto L148
        L124:
            if (r0 != r5) goto L13e
            android.widget.CheckBox r0 = r8.I0
            r0.setVisibility(r3)
            android.widget.TextView r0 = r8.G0
            r0.setVisibility(r3)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r8.O0
            java.util.List r0 = cn.bluemobi.dylan.http.JsonParse.getList(r0, r4)
            r8.M0 = r0
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r1 = r8.T0
            r1.g(r0)
            goto L148
        L13e:
            android.widget.CheckBox r0 = r8.I0
            r0.setVisibility(r2)
            android.widget.TextView r0 = r8.G0
            r0.setVisibility(r2)
        L148:
            r8.A0()
            return
    }

    public void L() {
            r2 = this;
            android.widget.Button r0 = r2.K0
            r0.setOnClickListener(r2)
            cn.bluemobi.dylan.base.view.MyGridView r0 = r2.b0
            com.bxkj.student.life.lost.LostDetailActivity$c r1 = new com.bxkj.student.life.lost.LostDetailActivity$c
            r1.<init>(r2)
            r0.setOnItemClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492970(0x7f0c006a, float:1.8609407E38)
            return r0
    }

    public void R() {
            r5 = this;
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            boolean r0 = r0.isAuthorizationInLost()
            if (r0 == 0) goto L14
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r0 = r0.getOpenId()
            r5.S0 = r0
        L14:
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r1 = "noticeId"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L2a
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r5.N0 = r0
        L2a:
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r1 = "lostType"
            boolean r0 = r0.hasExtra(r1)
            r2 = 1
            if (r0 == 0) goto L74
            android.content.Intent r0 = r5.getIntent()
            int r0 = r0.getIntExtra(r1, r2)
            r5.R0 = r0
            r1 = 0
            if (r0 != r2) goto L60
            java.lang.String r0 = "寻物启示"
            r5.setTitle(r0)
            android.widget.CheckBox r0 = r5.I0
            r3 = 8
            r0.setVisibility(r3)
            android.widget.LinearLayout r0 = r5.c0
            r0.setVisibility(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r5.J0
            r0.setVisibility(r3)
            android.widget.TextView r0 = r5.G0
            r0.setVisibility(r3)
            goto L74
        L60:
            java.lang.String r0 = "失物招领"
            r5.setTitle(r0)
            android.widget.CheckBox r0 = r5.I0
            r0.setVisibility(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r5.J0
            r0.setVisibility(r1)
            android.widget.TextView r0 = r5.G0
            r0.setVisibility(r1)
        L74:
            com.bxkj.student.life.lost.LostDetailActivity$a r0 = new com.bxkj.student.life.lost.LostDetailActivity$a
            android.content.Context r1 = r5.V
            r3 = 2131493280(0x7f0c01a0, float:1.8610036E38)
            java.util.List<java.lang.String> r4 = r5.P0
            r0.<init>(r5, r1, r3, r4)
            r5.Q0 = r0
            cn.bluemobi.dylan.base.view.MyGridView r1 = r5.b0
            r1.setAdapter(r0)
            com.bxkj.student.life.lost.LostDetailActivity$b r0 = new com.bxkj.student.life.lost.LostDetailActivity$b
            android.content.Context r1 = r5.V
            r3 = 2131493304(0x7f0c01b8, float:1.8610084E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r4 = r5.M0
            r0.<init>(r5, r1, r3, r4)
            r5.T0 = r0
            androidx.recyclerview.widget.RecyclerView r0 = r5.J0
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r3 = r5.V
            r1.<init>(r3)
            r0.setLayoutManager(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r5.J0
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r1 = r5.T0
            r0.setAdapter(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r5.J0
            cn.bluemobi.dylan.base.adapter.common.recyclerview.DividerItemDecoration r1 = new cn.bluemobi.dylan.base.adapter.common.recyclerview.DividerItemDecoration
            android.content.Context r3 = r5.V
            r1.<init>(r3, r2)
            r0.addItemDecoration(r1)
            r5.w0()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "物品详情"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r2) {
            r1 = this;
            r2 = 2131298860(0x7f090a2c, float:1.8215705E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.Y = r2
            r2 = 2131299171(0x7f090b63, float:1.8216336E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.Z = r2
            r2 = 2131298878(0x7f090a3e, float:1.8215742E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.a0 = r2
            r2 = 2131297030(0x7f090306, float:1.8211993E38)
            android.view.View r2 = r1.findViewById(r2)
            cn.bluemobi.dylan.base.view.MyGridView r2 = (cn.bluemobi.dylan.base.view.MyGridView) r2
            r1.b0 = r2
            r2 = 2131298050(0x7f090702, float:1.8214062E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r1.c0 = r2
            r2 = 2131296942(0x7f0902ae, float:1.8211815E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.EditText r2 = (android.widget.EditText) r2
            r1.f993k0 = r2
            r2 = 2131299035(0x7f090adb, float:1.821606E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.f994p0 = r2
            r2 = 2131299188(0x7f090b74, float:1.821637E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.F0 = r2
            r2 = 2131299055(0x7f090aef, float:1.82161E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.H0 = r2
            r2 = 2131296723(0x7f0901d3, float:1.821137E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.CheckBox r2 = (android.widget.CheckBox) r2
            r1.I0 = r2
            r2 = 2131298434(0x7f090882, float:1.8214841E38)
            android.view.View r2 = r1.findViewById(r2)
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            r1.J0 = r2
            r2 = 2131296597(0x7f090155, float:1.8211115E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            r1.K0 = r2
            r2 = 2131298994(0x7f090ab2, float:1.8215977E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.G0 = r2
            r2 = 2131298404(0x7f090864, float:1.821478E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.RelativeLayout r2 = (android.widget.RelativeLayout) r2
            r1.L0 = r2
            r0 = 8
            r2.setVisibility(r0)
            return
    }

    public void onClick(android.view.View r2) {
            r1 = this;
            int r2 = r2.getId()
            r0 = 2131296597(0x7f090155, float:1.8211115E38)
            if (r2 == r0) goto La
            return
        La:
            r1.v0()
            return
    }
}
