package com.bxkj.student.life.mall.address;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class MyAddressListActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> F0;
    private java.lang.String G0;
    private com.scwang.smartrefresh.layout.SmartRefreshLayout Y;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView Z;
    private android.widget.Button a0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> b0;
    private int c0;

    /* renamed from: k0, reason: collision with root package name */
    private int f1032k0;

    /* renamed from: p0, reason: collision with root package name */
    private int f1033p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.life.mall.address.MyAddressListActivity k;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bxkj.student.life.mall.address.MyAddressListActivity$a$a, reason: collision with other inner class name */
        class ViewOnClickListenerC0113a implements android.view.View.OnClickListener {
            final /* synthetic */ java.util.Map a;
            final /* synthetic */ java.lang.String b;
            final /* synthetic */ java.lang.String c;
            final /* synthetic */ java.lang.String d;
            final /* synthetic */ java.lang.String e;
            final /* synthetic */ com.bxkj.student.life.mall.address.MyAddressListActivity.a f;

            ViewOnClickListenerC0113a(com.bxkj.student.life.mall.address.MyAddressListActivity.a r1, java.util.Map r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
                    r0 = this;
                    r0.f = r1
                    r0.a = r2
                    r0.b = r3
                    r0.c = r4
                    r0.d = r5
                    r0.e = r6
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r4) {
                    r3 = this;
                    com.bxkj.student.life.mall.address.MyAddressListActivity$a r4 = r3.f
                    com.bxkj.student.life.mall.address.MyAddressListActivity r4 = r4.k
                    android.content.Intent r0 = new android.content.Intent
                    com.bxkj.student.life.mall.address.MyAddressListActivity$a r1 = r3.f
                    android.content.Context r1 = com.bxkj.student.life.mall.address.MyAddressListActivity.a.m(r1)
                    java.lang.Class<com.bxkj.student.life.mall.address.AddAddressActivity> r2 = com.bxkj.student.life.mall.address.AddAddressActivity.class
                    r0.<init>(r1, r2)
                    java.util.Map r1 = r3.a
                    java.lang.String r2 = "id"
                    java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
                    java.lang.String r2 = "addressId"
                    android.content.Intent r0 = r0.putExtra(r2, r1)
                    java.lang.String r1 = "name"
                    java.lang.String r2 = r3.b
                    android.content.Intent r0 = r0.putExtra(r1, r2)
                    java.lang.String r1 = "phone"
                    java.lang.String r2 = r3.c
                    android.content.Intent r0 = r0.putExtra(r1, r2)
                    java.lang.String r1 = "city"
                    java.lang.String r2 = r3.d
                    android.content.Intent r0 = r0.putExtra(r1, r2)
                    java.util.Map r1 = r3.a
                    java.lang.String r2 = "cityId"
                    java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
                    java.lang.String r2 = "areaId"
                    android.content.Intent r0 = r0.putExtra(r2, r1)
                    java.lang.String r1 = "address"
                    java.lang.String r2 = r3.e
                    android.content.Intent r0 = r0.putExtra(r1, r2)
                    r4.startActivity(r0)
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class b implements android.view.View.OnClickListener {
            final /* synthetic */ java.util.Map a;
            final /* synthetic */ cn.bluemobi.dylan.base.adapter.common.ViewHolder b;
            final /* synthetic */ com.bxkj.student.life.mall.address.MyAddressListActivity.a c;

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            /* renamed from: com.bxkj.student.life.mall.address.MyAddressListActivity$a$b$a, reason: collision with other inner class name */
            class C0114a implements cn.bluemobi.dylan.base.view.iOSTwoButtonDialog.RightButtonOnClick {
                final /* synthetic */ com.bxkj.student.life.mall.address.MyAddressListActivity.a.b a;

                /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
                /* renamed from: com.bxkj.student.life.mall.address.MyAddressListActivity$a$b$a$a, reason: collision with other inner class name */
                class C0115a extends cn.bluemobi.dylan.http.HttpCallBack {
                    final /* synthetic */ com.bxkj.student.life.mall.address.MyAddressListActivity.a.b.C0114a a;

                    C0115a(com.bxkj.student.life.mall.address.MyAddressListActivity.a.b.C0114a r1) {
                            r0 = this;
                            r0.a = r1
                            r0.<init>()
                            return
                    }

                    public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r2) {
                            r1 = this;
                            com.bxkj.student.life.mall.address.MyAddressListActivity$a$b$a r2 = r1.a
                            com.bxkj.student.life.mall.address.MyAddressListActivity$a$b r2 = r2.a
                            com.bxkj.student.life.mall.address.MyAddressListActivity$a r2 = r2.c
                            java.util.List r2 = r2.d()
                            com.bxkj.student.life.mall.address.MyAddressListActivity$a$b$a r0 = r1.a
                            com.bxkj.student.life.mall.address.MyAddressListActivity$a$b r0 = r0.a
                            java.util.Map r0 = r0.a
                            r2.remove(r0)
                            com.bxkj.student.life.mall.address.MyAddressListActivity$a$b$a r2 = r1.a
                            com.bxkj.student.life.mall.address.MyAddressListActivity$a$b r2 = r2.a
                            com.bxkj.student.life.mall.address.MyAddressListActivity$a r0 = r2.c
                            cn.bluemobi.dylan.base.adapter.common.ViewHolder r2 = r2.b
                            int r2 = r2.f()
                            r0.notifyItemRemoved(r2)
                            return
                    }
                }

                C0114a(com.bxkj.student.life.mall.address.MyAddressListActivity.a.b r1) {
                        r0 = this;
                        r0.a = r1
                        r0.<init>()
                        return
                }

                public void buttonRightOnClick() {
                        r4 = this;
                        com.bxkj.student.life.mall.address.MyAddressListActivity$a$b r0 = r4.a
                        com.bxkj.student.life.mall.address.MyAddressListActivity$a r0 = r0.c
                        android.content.Context r0 = com.bxkj.student.life.mall.address.MyAddressListActivity.a.n(r0)
                        cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
                        java.lang.Class<w.g> r1 = w.g.class
                        java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
                        w.g r1 = (w.g) r1
                        com.bxkj.student.life.mall.address.MyAddressListActivity$a$b r2 = r4.a
                        java.util.Map r2 = r2.a
                        java.lang.String r3 = "id"
                        java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r3)
                        rx.e r1 = r1.u(r2)
                        cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
                        com.bxkj.student.life.mall.address.MyAddressListActivity$a$b$a$a r1 = new com.bxkj.student.life.mall.address.MyAddressListActivity$a$b$a$a
                        r1.<init>(r4)
                        r0.setDataListener(r1)
                        return
                }
            }

            b(com.bxkj.student.life.mall.address.MyAddressListActivity.a r1, java.util.Map r2, cn.bluemobi.dylan.base.adapter.common.ViewHolder r3) {
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
                    cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
                    com.bxkj.student.life.mall.address.MyAddressListActivity$a r0 = r1.c
                    android.content.Context r0 = com.bxkj.student.life.mall.address.MyAddressListActivity.a.o(r0)
                    r2.<init>(r0)
                    java.lang.String r0 = "确定要删除吗？"
                    cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r2 = r2.setMessage(r0)
                    com.bxkj.student.life.mall.address.MyAddressListActivity$a$b$a r0 = new com.bxkj.student.life.mall.address.MyAddressListActivity$a$b$a
                    r0.<init>(r1)
                    cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r2 = r2.setRightButtonOnClickListener(r0)
                    r2.show()
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class c implements android.view.View.OnClickListener {
            final /* synthetic */ cn.bluemobi.dylan.base.adapter.common.ViewHolder a;
            final /* synthetic */ com.bxkj.student.life.mall.address.MyAddressListActivity.a b;

            c(com.bxkj.student.life.mall.address.MyAddressListActivity.a r1, cn.bluemobi.dylan.base.adapter.common.ViewHolder r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r2) {
                    r1 = this;
                    com.bxkj.student.life.mall.address.MyAddressListActivity$a r2 = r1.b
                    com.bxkj.student.life.mall.address.MyAddressListActivity r2 = r2.k
                    cn.bluemobi.dylan.base.adapter.common.ViewHolder r0 = r1.a
                    int r0 = r0.f()
                    com.bxkj.student.life.mall.address.MyAddressListActivity.q0(r2, r0)
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class d implements android.view.View.OnClickListener {
            final /* synthetic */ java.util.Map a;
            final /* synthetic */ com.bxkj.student.life.mall.address.MyAddressListActivity.a b;

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            /* renamed from: com.bxkj.student.life.mall.address.MyAddressListActivity$a$d$a, reason: collision with other inner class name */
            class C0116a extends cn.bluemobi.dylan.http.HttpCallBack {
                final /* synthetic */ com.bxkj.student.life.mall.address.MyAddressListActivity.a.d a;

                C0116a(com.bxkj.student.life.mall.address.MyAddressListActivity.a.d r1) {
                        r0 = this;
                        r0.a = r1
                        r0.<init>()
                        return
                }

                public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r4) {
                        r3 = this;
                        com.bxkj.student.life.mall.address.MyAddressListActivity$a$d r4 = r3.a
                        com.bxkj.student.life.mall.address.MyAddressListActivity$a r4 = r4.b
                        com.bxkj.student.life.mall.address.MyAddressListActivity r4 = r4.k
                        java.util.List r4 = com.bxkj.student.life.mall.address.MyAddressListActivity.i0(r4)
                        java.util.Iterator r4 = r4.iterator()
                    Le:
                        boolean r0 = r4.hasNext()
                        if (r0 == 0) goto L38
                        java.lang.Object r0 = r4.next()
                        java.util.Map r0 = (java.util.Map) r0
                        com.bxkj.student.life.mall.address.MyAddressListActivity$a$d r1 = r3.a
                        java.util.Map r1 = r1.a
                        boolean r1 = r1.equals(r0)
                        java.lang.String r2 = "firstFlag"
                        if (r1 == 0) goto L2f
                        r1 = 1
                        java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                        r0.put(r2, r1)
                        goto Le
                    L2f:
                        r1 = 0
                        java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                        r0.put(r2, r1)
                        goto Le
                    L38:
                        com.bxkj.student.life.mall.address.MyAddressListActivity$a$d r4 = r3.a
                        com.bxkj.student.life.mall.address.MyAddressListActivity$a r4 = r4.b
                        r4.notifyDataSetChanged()
                        return
                }
            }

            d(com.bxkj.student.life.mall.address.MyAddressListActivity.a r1, java.util.Map r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r4) {
                    r3 = this;
                    com.bxkj.student.life.mall.address.MyAddressListActivity$a r4 = r3.b
                    android.content.Context r4 = com.bxkj.student.life.mall.address.MyAddressListActivity.a.p(r4)
                    cn.bluemobi.dylan.http.HttpRequest r4 = cn.bluemobi.dylan.http.Http.with(r4)
                    java.lang.Class<w.g> r0 = w.g.class
                    java.lang.Object r0 = cn.bluemobi.dylan.http.Http.getApiService(r0)
                    w.g r0 = (w.g) r0
                    java.util.Map r1 = r3.a
                    java.lang.String r2 = "id"
                    java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
                    rx.e r0 = r0.B(r1)
                    cn.bluemobi.dylan.http.HttpRequest r4 = r4.setObservable(r0)
                    com.bxkj.student.life.mall.address.MyAddressListActivity$a$d$a r0 = new com.bxkj.student.life.mall.address.MyAddressListActivity$a$d$a
                    r0.<init>(r3)
                    r4.setDataListener(r0)
                    return
            }
        }

        a(com.bxkj.student.life.mall.address.MyAddressListActivity r1, android.content.Context r2, int r3, java.util.List r4) {
                r0 = this;
                r0.k = r1
                r0.<init>(r2, r3, r4)
                return
        }

        static /* synthetic */ android.content.Context m(com.bxkj.student.life.mall.address.MyAddressListActivity.a r0) {
                android.content.Context r0 = r0.e
                return r0
        }

        static /* synthetic */ android.content.Context n(com.bxkj.student.life.mall.address.MyAddressListActivity.a r0) {
                android.content.Context r0 = r0.e
                return r0
        }

        static /* synthetic */ android.content.Context o(com.bxkj.student.life.mall.address.MyAddressListActivity.a r0) {
                android.content.Context r0 = r0.e
                return r0
        }

        static /* synthetic */ android.content.Context p(com.bxkj.student.life.mall.address.MyAddressListActivity.a r0) {
                android.content.Context r0 = r0.e
                return r0
        }

        public /* bridge */ /* synthetic */ void c(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.lang.Object r2) {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                r0.q(r1, r2)
                return
        }

        public void q(cn.bluemobi.dylan.base.adapter.common.ViewHolder r9, java.util.Map<java.lang.String, java.lang.Object> r10) {
                r8 = this;
                java.lang.String r0 = "receiverName"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r10, r0)
                r0 = 2131298986(0x7f090aaa, float:1.821596E38)
                r9.J(r0, r4)
                java.lang.String r0 = "receiverPhone"
                java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getString(r10, r0)
                r0 = 2131299035(0x7f090adb, float:1.821606E38)
                r9.J(r0, r5)
                java.lang.String r0 = "provenceStr"
                java.lang.String r6 = cn.bluemobi.dylan.http.JsonParse.getString(r10, r0)
                java.lang.String r0 = "detailAddress"
                java.lang.String r7 = cn.bluemobi.dylan.http.JsonParse.getString(r10, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r6)
                r0.append(r7)
                java.lang.String r0 = r0.toString()
                r1 = 2131298773(0x7f0909d5, float:1.8215529E38)
                r9.J(r1, r0)
                com.bxkj.student.life.mall.address.MyAddressListActivity$a$a r1 = new com.bxkj.student.life.mall.address.MyAddressListActivity$a$a
                r2 = r8
                r3 = r10
                r1.<init>(r2, r3, r4, r5, r6, r7)
                r10 = 2131297130(0x7f09036a, float:1.8212196E38)
                r9.w(r10, r1)
                com.bxkj.student.life.mall.address.MyAddressListActivity$a$b r10 = new com.bxkj.student.life.mall.address.MyAddressListActivity$a$b
                r10.<init>(r8, r3, r9)
                r0 = 2131297121(0x7f090361, float:1.8212178E38)
                r9.w(r0, r10)
                com.bxkj.student.life.mall.address.MyAddressListActivity r10 = r2.k
                java.lang.String r10 = com.bxkj.student.life.mall.address.MyAddressListActivity.h0(r10)
                boolean r10 = android.text.TextUtils.isEmpty(r10)
                r0 = 2131298076(0x7f09071c, float:1.8214115E38)
                java.lang.String r1 = "firstFlag"
                java.lang.String r4 = "1"
                r5 = 2131298950(0x7f090a86, float:1.8215888E38)
                r6 = 2131296719(0x7f0901cf, float:1.8211363E38)
                if (r10 != 0) goto L9a
                java.lang.String r10 = "选择该地址"
                r9.J(r6, r10)
                r10 = 1
                r9.N(r5, r10)
                java.lang.String r10 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r1)
                boolean r10 = r4.equals(r10)
                r9.N(r5, r10)
                com.bxkj.student.life.mall.address.MyAddressListActivity r10 = r2.k
                java.lang.String r10 = com.bxkj.student.life.mall.address.MyAddressListActivity.h0(r10)
                java.lang.String r1 = "id"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r1)
                boolean r10 = r10.equals(r1)
                r9.m(r6, r10)
                com.bxkj.student.life.mall.address.MyAddressListActivity$a$c r10 = new com.bxkj.student.life.mall.address.MyAddressListActivity$a$c
                r10.<init>(r8, r9)
                r9.w(r0, r10)
                return
            L9a:
                java.lang.String r10 = "设为默认地址"
                r9.J(r6, r10)
                r10 = 0
                r9.N(r5, r10)
                java.lang.String r10 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r1)
                boolean r10 = r4.equals(r10)
                r9.m(r6, r10)
                com.bxkj.student.life.mall.address.MyAddressListActivity$a$d r10 = new com.bxkj.student.life.mall.address.MyAddressListActivity$a$d
                r10.<init>(r8, r3)
                r9.w(r0, r10)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements cn.bluemobi.dylan.base.adapter.common.recyclerview.b {
        final /* synthetic */ com.bxkj.student.life.mall.address.MyAddressListActivity a;

        b(com.bxkj.student.life.mall.address.MyAddressListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(android.view.ViewGroup r1, android.view.View r2, java.lang.Object r3, int r4) {
                r0 = this;
                com.bxkj.student.life.mall.address.MyAddressListActivity r1 = r0.a
                com.bxkj.student.life.mall.address.MyAddressListActivity.q0(r1, r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements m2.e {
        final /* synthetic */ com.bxkj.student.life.mall.address.MyAddressListActivity a;

        c(com.bxkj.student.life.mall.address.MyAddressListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void m(l2.h r4) {
                r3 = this;
                com.bxkj.student.life.mall.address.MyAddressListActivity r4 = r3.a
                int r4 = com.bxkj.student.life.mall.address.MyAddressListActivity.m0(r4)
                com.bxkj.student.life.mall.address.MyAddressListActivity r0 = r3.a
                int r0 = com.bxkj.student.life.mall.address.MyAddressListActivity.k0(r0)
                int r4 = r4 / r0
                com.bxkj.student.life.mall.address.MyAddressListActivity r0 = r3.a
                int r0 = com.bxkj.student.life.mall.address.MyAddressListActivity.j0(r0)
                com.bxkj.student.life.mall.address.MyAddressListActivity r1 = r3.a
                int r1 = com.bxkj.student.life.mall.address.MyAddressListActivity.m0(r1)
                com.bxkj.student.life.mall.address.MyAddressListActivity r2 = r3.a
                int r2 = com.bxkj.student.life.mall.address.MyAddressListActivity.k0(r2)
                int r1 = r1 % r2
                if (r1 != 0) goto L23
                goto L25
            L23:
                int r4 = r4 + 1
            L25:
                if (r0 < r4) goto L38
                com.bxkj.student.life.mall.address.MyAddressListActivity r4 = r3.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r4 = com.bxkj.student.life.mall.address.MyAddressListActivity.l0(r4)
                r4.q0()
                com.bxkj.student.life.mall.address.MyAddressListActivity r4 = r3.a
                java.lang.String r0 = "没有了"
                r4.f0(r0)
                return
            L38:
                com.bxkj.student.life.mall.address.MyAddressListActivity r4 = r3.a
                int r0 = com.bxkj.student.life.mall.address.MyAddressListActivity.j0(r4)
                int r0 = r0 + 1
                com.bxkj.student.life.mall.address.MyAddressListActivity.n0(r4, r0)
                com.bxkj.student.life.mall.address.MyAddressListActivity r4 = r3.a
                com.bxkj.student.life.mall.address.MyAddressListActivity.p0(r4)
                return
        }

        public void n(l2.h r2) {
                r1 = this;
                com.bxkj.student.life.mall.address.MyAddressListActivity r2 = r1.a
                r0 = 1
                com.bxkj.student.life.mall.address.MyAddressListActivity.n0(r2, r0)
                com.bxkj.student.life.mall.address.MyAddressListActivity r2 = r1.a
                com.bxkj.student.life.mall.address.MyAddressListActivity.p0(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.life.mall.address.MyAddressListActivity a;

        d(com.bxkj.student.life.mall.address.MyAddressListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFinish() {
                r1 = this;
                super.netOnFinish()
                com.bxkj.student.life.mall.address.MyAddressListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.mall.address.MyAddressListActivity.l0(r0)
                if (r0 == 0) goto L20
                com.bxkj.student.life.mall.address.MyAddressListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.mall.address.MyAddressListActivity.l0(r0)
                boolean r0 = r0.w()
                if (r0 == 0) goto L20
                com.bxkj.student.life.mall.address.MyAddressListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.mall.address.MyAddressListActivity.l0(r0)
                r0.w0()
            L20:
                com.bxkj.student.life.mall.address.MyAddressListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.mall.address.MyAddressListActivity.l0(r0)
                if (r0 == 0) goto L3d
                com.bxkj.student.life.mall.address.MyAddressListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.mall.address.MyAddressListActivity.l0(r0)
                boolean r0 = r0.isLoading()
                if (r0 == 0) goto L3d
                com.bxkj.student.life.mall.address.MyAddressListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.life.mall.address.MyAddressListActivity.l0(r0)
                r0.q0()
            L3d:
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.life.mall.address.MyAddressListActivity r0 = r2.a
                java.lang.String r1 = "total"
                int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r3, r1)
                com.bxkj.student.life.mall.address.MyAddressListActivity.o0(r0, r1)
                com.bxkj.student.life.mall.address.MyAddressListActivity r0 = r2.a
                int r0 = com.bxkj.student.life.mall.address.MyAddressListActivity.j0(r0)
                r1 = 1
                if (r0 != r1) goto L1d
                com.bxkj.student.life.mall.address.MyAddressListActivity r0 = r2.a
                java.util.List r0 = com.bxkj.student.life.mall.address.MyAddressListActivity.i0(r0)
                r0.clear()
            L1d:
                java.lang.String r0 = "data"
                java.util.List r3 = cn.bluemobi.dylan.http.JsonParse.getList(r3, r0)
                com.bxkj.student.life.mall.address.MyAddressListActivity r0 = r2.a
                java.util.List r0 = com.bxkj.student.life.mall.address.MyAddressListActivity.i0(r0)
                r0.addAll(r3)
                com.bxkj.student.life.mall.address.MyAddressListActivity r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.student.life.mall.address.MyAddressListActivity.g0(r3)
                r3.notifyDataSetChanged()
                return
        }
    }

    public MyAddressListActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.b0 = r0
            r0 = 1
            r1.c0 = r0
            r0 = 15
            r1.f1032k0 = r0
            r0 = 0
            r1.f1033p0 = r0
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter g0(com.bxkj.student.life.mall.address.MyAddressListActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.F0
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String h0(com.bxkj.student.life.mall.address.MyAddressListActivity r0) {
            java.lang.String r0 = r0.G0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List i0(com.bxkj.student.life.mall.address.MyAddressListActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.b0
            return r0
    }

    static /* bridge */ /* synthetic */ int j0(com.bxkj.student.life.mall.address.MyAddressListActivity r0) {
            int r0 = r0.c0
            return r0
    }

    static /* bridge */ /* synthetic */ int k0(com.bxkj.student.life.mall.address.MyAddressListActivity r0) {
            int r0 = r0.f1032k0
            return r0
    }

    static /* bridge */ /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout l0(com.bxkj.student.life.mall.address.MyAddressListActivity r0) {
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.Y
            return r0
    }

    static /* bridge */ /* synthetic */ int m0(com.bxkj.student.life.mall.address.MyAddressListActivity r0) {
            int r0 = r0.f1033p0
            return r0
    }

    static /* bridge */ /* synthetic */ void n0(com.bxkj.student.life.mall.address.MyAddressListActivity r0, int r1) {
            r0.c0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void o0(com.bxkj.student.life.mall.address.MyAddressListActivity r0, int r1) {
            r0.f1033p0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void p0(com.bxkj.student.life.mall.address.MyAddressListActivity r0) {
            r0.r0()
            return
    }

    static /* bridge */ /* synthetic */ void q0(com.bxkj.student.life.mall.address.MyAddressListActivity r0, int r1) {
            r0.u0(r1)
            return
    }

    private void r0() {
            r5 = this;
            android.content.Context r0 = r5.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideLoadingDialog()
            java.lang.Class<w.g> r1 = w.g.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            w.g r1 = (w.g) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getOpenId()
            int r3 = r5.c0
            int r4 = r5.f1032k0
            rx.e r1 = r1.s(r2, r3, r4)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.life.mall.address.MyAddressListActivity$d r1 = new com.bxkj.student.life.mall.address.MyAddressListActivity$d
            r1.<init>(r5)
            r0.setDataListener(r1)
            return
    }

    private void s0() {
            r2 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r2.Y
            com.bxkj.student.life.mall.address.MyAddressListActivity$c r1 = new com.bxkj.student.life.mall.address.MyAddressListActivity$c
            r1.<init>(r2)
            r0.m1(r1)
            return
    }

    private void u0(int r5) {
            r4 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r1 = r4.F0
            java.lang.Object r1 = r1.getItem(r5)
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r2 = "id"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
            r0.putExtra(r2, r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r1 = r4.F0
            java.lang.Object r1 = r1.getItem(r5)
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r2 = "receiverName"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
            r0.putExtra(r2, r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r1 = r4.F0
            java.lang.Object r1 = r1.getItem(r5)
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r2 = "receiverPhone"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
            r0.putExtra(r2, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r2 = r4.F0
            java.lang.Object r2 = r2.getItem(r5)
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r3 = "provenceStr"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r3)
            r1.append(r2)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r2 = r4.F0
            java.lang.Object r5 = r2.getItem(r5)
            java.util.Map r5 = (java.util.Map) r5
            java.lang.String r2 = "detailAddress"
            java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.putExtra(r2, r5)
            r5 = -1
            r4.setResult(r5, r0)
            r4.finish()
            return
    }

    public void L() {
            r2 = this;
            android.widget.Button r0 = r2.a0
            r0.setOnClickListener(r2)
            java.lang.String r0 = r2.G0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L17
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.F0
            com.bxkj.student.life.mall.address.MyAddressListActivity$b r1 = new com.bxkj.student.life.mall.address.MyAddressListActivity$b
            r1.<init>(r2)
            r0.k(r1)
        L17:
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492895(0x7f0c001f, float:1.8609255E38)
            return r0
    }

    public void R() {
            r4 = this;
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "addressId"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L16
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r4.G0 = r0
        L16:
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.Z
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r4.V
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            com.bxkj.student.life.mall.address.MyAddressListActivity$a r0 = new com.bxkj.student.life.mall.address.MyAddressListActivity$a
            android.content.Context r1 = r4.V
            r2 = 2131493225(0x7f0c0169, float:1.8609924E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.b0
            r0.<init>(r4, r1, r2, r3)
            r4.F0 = r0
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = r4.Z
            r1.setAdapter(r0)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.Z
            r1 = 2131298892(0x7f090a4c, float:1.821577E38)
            android.view.View r1 = r4.findViewById(r1)
            r0.setEmptyView(r1)
            r4.s0()
            r4.t0()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "收货地址"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131298353(0x7f090831, float:1.8214677E38)
            android.view.View r1 = r0.findViewById(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = (com.scwang.smartrefresh.layout.SmartRefreshLayout) r1
            r0.Y = r1
            r1 = 2131298422(0x7f090876, float:1.8214817E38)
            android.view.View r1 = r0.findViewById(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = (cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView) r1
            r0.Z = r1
            r1 = 2131296581(0x7f090145, float:1.8211083E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r0.a0 = r1
            return
    }

    public void onClick(android.view.View r3) {
            r2 = this;
            int r3 = r3.getId()
            r0 = 2131296581(0x7f090145, float:1.8211083E38)
            if (r3 == r0) goto La
            return
        La:
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r0 = r2.V
            java.lang.Class<com.bxkj.student.life.mall.address.AddAddressActivity> r1 = com.bxkj.student.life.mall.address.AddAddressActivity.class
            r3.<init>(r0, r1)
            r2.startActivity(r3)
            return
    }

    public void t0() {
            r1 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r1.Y
            r0.D()
            return
    }
}
