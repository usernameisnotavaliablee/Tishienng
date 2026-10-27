package com.bxkj.student.life.mall.order;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class a {
    private android.content.Context a;
    private java.lang.String b;
    private java.lang.String c;
    private java.lang.String d;
    private java.lang.String e;
    private java.lang.String f;
    private java.lang.String g;
    private com.bxkj.student.life.mall.order.a.e h;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.bxkj.student.life.mall.order.a$a, reason: collision with other inner class name */
    class C0121a implements cn.bluemobi.dylan.base.view.iOSTwoButtonDialog.RightButtonOnClick {
        final /* synthetic */ java.lang.String a;
        final /* synthetic */ com.bxkj.student.life.mall.order.a b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bxkj.student.life.mall.order.a$a$a, reason: collision with other inner class name */
        class C0122a extends cn.bluemobi.dylan.http.HttpCallBack {
            final /* synthetic */ com.bxkj.student.life.mall.order.a.C0121a a;

            C0122a(com.bxkj.student.life.mall.order.a.C0121a r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                    r2 = this;
                    com.bxkj.student.life.mall.order.a$a r3 = r2.a
                    com.bxkj.student.life.mall.order.a r3 = r3.b
                    android.content.Context r3 = com.bxkj.student.life.mall.order.a.a(r3)
                    java.lang.String r0 = "订单取消成功"
                    r1 = 0
                    android.widget.Toast r3 = android.widget.Toast.makeText(r3, r0, r1)
                    r3.show()
                    com.bxkj.student.life.mall.order.a$a r3 = r2.a
                    com.bxkj.student.life.mall.order.a r3 = r3.b
                    com.bxkj.student.life.mall.order.a$e r3 = com.bxkj.student.life.mall.order.a.b(r3)
                    if (r3 == 0) goto L27
                    com.bxkj.student.life.mall.order.a$a r3 = r2.a
                    com.bxkj.student.life.mall.order.a r3 = r3.b
                    com.bxkj.student.life.mall.order.a$e r3 = com.bxkj.student.life.mall.order.a.b(r3)
                    r3.a()
                L27:
                    return
            }
        }

        C0121a(com.bxkj.student.life.mall.order.a r1, java.lang.String r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void buttonRightOnClick() {
                r3 = this;
                com.bxkj.student.life.mall.order.a r0 = r3.b
                android.content.Context r0 = com.bxkj.student.life.mall.order.a.a(r0)
                cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
                java.lang.Class<w.g> r1 = w.g.class
                java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
                w.g r1 = (w.g) r1
                java.lang.String r2 = r3.a
                rx.e r1 = r1.x(r2)
                cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
                com.bxkj.student.life.mall.order.a$a$a r1 = new com.bxkj.student.life.mall.order.a$a$a
                r1.<init>(r3)
                r0.setDataListener(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements cn.bluemobi.dylan.base.view.iOSTwoButtonDialog.RightButtonOnClick {
        final /* synthetic */ java.lang.String a;
        final /* synthetic */ com.bxkj.student.life.mall.order.a b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bxkj.student.life.mall.order.a$b$a, reason: collision with other inner class name */
        class C0123a extends cn.bluemobi.dylan.http.HttpCallBack {
            final /* synthetic */ com.bxkj.student.life.mall.order.a.b a;

            C0123a(com.bxkj.student.life.mall.order.a.b r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                    r2 = this;
                    com.bxkj.student.life.mall.order.a$b r3 = r2.a
                    com.bxkj.student.life.mall.order.a r3 = r3.b
                    android.content.Context r3 = com.bxkj.student.life.mall.order.a.a(r3)
                    java.lang.String r0 = "订单删除成功"
                    r1 = 0
                    android.widget.Toast r3 = android.widget.Toast.makeText(r3, r0, r1)
                    r3.show()
                    com.bxkj.student.life.mall.order.a$b r3 = r2.a
                    com.bxkj.student.life.mall.order.a r3 = r3.b
                    com.bxkj.student.life.mall.order.a$e r3 = com.bxkj.student.life.mall.order.a.b(r3)
                    if (r3 == 0) goto L27
                    com.bxkj.student.life.mall.order.a$b r3 = r2.a
                    com.bxkj.student.life.mall.order.a r3 = r3.b
                    com.bxkj.student.life.mall.order.a$e r3 = com.bxkj.student.life.mall.order.a.b(r3)
                    r3.a()
                L27:
                    return
            }
        }

        b(com.bxkj.student.life.mall.order.a r1, java.lang.String r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void buttonRightOnClick() {
                r3 = this;
                com.bxkj.student.life.mall.order.a r0 = r3.b
                android.content.Context r0 = com.bxkj.student.life.mall.order.a.a(r0)
                cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
                java.lang.Class<w.g> r1 = w.g.class
                java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
                w.g r1 = (w.g) r1
                java.lang.String r2 = r3.a
                rx.e r1 = r1.e(r2)
                cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
                com.bxkj.student.life.mall.order.a$b$a r1 = new com.bxkj.student.life.mall.order.a$b$a
                r1.<init>(r3)
                r0.setDataListener(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements cn.bluemobi.dylan.base.view.iOSTwoButtonDialog.RightButtonOnClick {
        final /* synthetic */ java.lang.String a;
        final /* synthetic */ com.bxkj.student.life.mall.order.a b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bxkj.student.life.mall.order.a$c$a, reason: collision with other inner class name */
        class C0124a extends cn.bluemobi.dylan.http.HttpCallBack {
            final /* synthetic */ com.bxkj.student.life.mall.order.a.c a;

            C0124a(com.bxkj.student.life.mall.order.a.c r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                    r2 = this;
                    com.bxkj.student.life.mall.order.a$c r3 = r2.a
                    com.bxkj.student.life.mall.order.a r3 = r3.b
                    android.content.Context r3 = com.bxkj.student.life.mall.order.a.a(r3)
                    java.lang.String r0 = "订单审核中"
                    r1 = 0
                    android.widget.Toast r3 = android.widget.Toast.makeText(r3, r0, r1)
                    r3.show()
                    com.bxkj.student.life.mall.order.a$c r3 = r2.a
                    com.bxkj.student.life.mall.order.a r3 = r3.b
                    com.bxkj.student.life.mall.order.a$e r3 = com.bxkj.student.life.mall.order.a.b(r3)
                    if (r3 == 0) goto L27
                    com.bxkj.student.life.mall.order.a$c r3 = r2.a
                    com.bxkj.student.life.mall.order.a r3 = r3.b
                    com.bxkj.student.life.mall.order.a$e r3 = com.bxkj.student.life.mall.order.a.b(r3)
                    r3.a()
                L27:
                    return
            }
        }

        c(com.bxkj.student.life.mall.order.a r1, java.lang.String r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void buttonRightOnClick() {
                r3 = this;
                com.bxkj.student.life.mall.order.a r0 = r3.b
                android.content.Context r0 = com.bxkj.student.life.mall.order.a.a(r0)
                cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
                java.lang.Class<w.g> r1 = w.g.class
                java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
                w.g r1 = (w.g) r1
                java.lang.String r2 = r3.a
                rx.e r1 = r1.h(r2)
                cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
                com.bxkj.student.life.mall.order.a$c$a r1 = new com.bxkj.student.life.mall.order.a$c$a
                r1.<init>(r3)
                r0.setDataListener(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d implements cn.bluemobi.dylan.base.view.iOSTwoButtonDialog.RightButtonOnClick {
        final /* synthetic */ java.lang.String a;
        final /* synthetic */ com.bxkj.student.life.mall.order.a b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bxkj.student.life.mall.order.a$d$a, reason: collision with other inner class name */
        class C0125a extends cn.bluemobi.dylan.http.HttpCallBack {
            final /* synthetic */ com.bxkj.student.life.mall.order.a.d a;

            C0125a(com.bxkj.student.life.mall.order.a.d r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                    r2 = this;
                    com.bxkj.student.life.mall.order.a$d r3 = r2.a
                    com.bxkj.student.life.mall.order.a r3 = r3.b
                    android.content.Context r3 = com.bxkj.student.life.mall.order.a.a(r3)
                    java.lang.String r0 = "确认收货成功"
                    r1 = 0
                    android.widget.Toast r3 = android.widget.Toast.makeText(r3, r0, r1)
                    r3.show()
                    com.bxkj.student.life.mall.order.a$d r3 = r2.a
                    com.bxkj.student.life.mall.order.a r3 = r3.b
                    com.bxkj.student.life.mall.order.a$e r3 = com.bxkj.student.life.mall.order.a.b(r3)
                    if (r3 == 0) goto L27
                    com.bxkj.student.life.mall.order.a$d r3 = r2.a
                    com.bxkj.student.life.mall.order.a r3 = r3.b
                    com.bxkj.student.life.mall.order.a$e r3 = com.bxkj.student.life.mall.order.a.b(r3)
                    r3.a()
                L27:
                    return
            }
        }

        d(com.bxkj.student.life.mall.order.a r1, java.lang.String r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void buttonRightOnClick() {
                r3 = this;
                com.bxkj.student.life.mall.order.a r0 = r3.b
                android.content.Context r0 = com.bxkj.student.life.mall.order.a.a(r0)
                cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
                java.lang.Class<w.g> r1 = w.g.class
                java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
                w.g r1 = (w.g) r1
                java.lang.String r2 = r3.a
                rx.e r1 = r1.r(r2)
                cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
                com.bxkj.student.life.mall.order.a$d$a r1 = new com.bxkj.student.life.mall.order.a$d$a
                r1.<init>(r3)
                r0.setDataListener(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface e {
        void a();
    }

    public a(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    static /* bridge */ /* synthetic */ android.content.Context a(com.bxkj.student.life.mall.order.a r0) {
            android.content.Context r0 = r0.a
            return r0
    }

    static /* bridge */ /* synthetic */ com.bxkj.student.life.mall.order.a.e b(com.bxkj.student.life.mall.order.a r0) {
            com.bxkj.student.life.mall.order.a$e r0 = r0.h
            return r0
    }

    private void c(java.lang.String r3) {
            r2 = this;
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
            android.content.Context r1 = r2.a
            r0.<init>(r1)
            java.lang.String r1 = "确定要申请退款吗？"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setMessage(r1)
            com.bxkj.student.life.mall.order.a$c r1 = new com.bxkj.student.life.mall.order.a$c
            r1.<init>(r2, r3)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r3 = r0.setRightButtonOnClickListener(r1)
            r3.show()
            return
    }

    private void e(java.lang.String r3) {
            r2 = this;
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
            android.content.Context r1 = r2.a
            r0.<init>(r1)
            java.lang.String r1 = "确定要取消订单吗？"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setMessage(r1)
            com.bxkj.student.life.mall.order.a$a r1 = new com.bxkj.student.life.mall.order.a$a
            r1.<init>(r2, r3)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r3 = r0.setRightButtonOnClickListener(r1)
            r3.show()
            return
    }

    private void f(java.lang.String r3) {
            r2 = this;
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
            android.content.Context r1 = r2.a
            r0.<init>(r1)
            java.lang.String r1 = "确定已收到货物吗？"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setMessage(r1)
            com.bxkj.student.life.mall.order.a$d r1 = new com.bxkj.student.life.mall.order.a$d
            r1.<init>(r2, r3)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r3 = r0.setRightButtonOnClickListener(r1)
            r3.show()
            return
    }

    private void g(java.lang.String r3) {
            r2 = this;
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
            android.content.Context r1 = r2.a
            r0.<init>(r1)
            java.lang.String r1 = "确定要删除订单吗？"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r0 = r0.setMessage(r1)
            com.bxkj.student.life.mall.order.a$b r1 = new com.bxkj.student.life.mall.order.a$b
            r1.<init>(r2, r3)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r3 = r0.setRightButtonOnClickListener(r1)
            r3.show()
            return
    }

    public void d(java.lang.String r5, java.lang.String r6, java.lang.String r7, double r8) {
            r4 = this;
            java.lang.String r0 = "立即付款"
            boolean r0 = r5.equals(r0)
            java.lang.String r1 = "orderId"
            if (r0 == 0) goto L29
            android.content.Context r5 = r4.a
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r2 = r4.a
            java.lang.Class<com.bxkj.student.life.mall.order.OrderPayActivity> r3 = com.bxkj.student.life.mall.order.OrderPayActivity.class
            r0.<init>(r2, r3)
            android.content.Intent r6 = r0.putExtra(r1, r6)
            java.lang.String r0 = "orderNo"
            android.content.Intent r6 = r6.putExtra(r0, r7)
            java.lang.String r7 = "payPrice"
            android.content.Intent r6 = r6.putExtra(r7, r8)
            r5.startActivity(r6)
            return
        L29:
            java.lang.String r7 = "取消订单"
            boolean r7 = r5.equals(r7)
            if (r7 == 0) goto L35
            r4.e(r6)
            return
        L35:
            java.lang.String r7 = "删除订单"
            boolean r7 = r5.equals(r7)
            if (r7 == 0) goto L41
            r4.g(r6)
            return
        L41:
            java.lang.String r7 = "申请退款"
            boolean r7 = r5.equals(r7)
            if (r7 == 0) goto L4d
            r4.c(r6)
            return
        L4d:
            java.lang.String r7 = "确认收货"
            boolean r7 = r5.equals(r7)
            if (r7 == 0) goto L59
            r4.f(r6)
            return
        L59:
            java.lang.String r7 = "查看物流"
            boolean r7 = r5.equals(r7)
            if (r7 == 0) goto L84
            android.content.Context r5 = r4.a
            android.content.Intent r7 = new android.content.Intent
            android.content.Context r8 = r4.a
            java.lang.Class<com.bxkj.student.life.mall.order.ViewLogisticsActivity> r9 = com.bxkj.student.life.mall.order.ViewLogisticsActivity.class
            r7.<init>(r8, r9)
            android.content.Intent r6 = r7.putExtra(r1, r6)
            java.lang.String r7 = "shipping_id"
            java.lang.String r8 = r4.f
            android.content.Intent r6 = r6.putExtra(r7, r8)
            java.lang.String r7 = "invoice_no"
            java.lang.String r8 = r4.g
            android.content.Intent r6 = r6.putExtra(r7, r8)
            r5.startActivity(r6)
            return
        L84:
            java.lang.String r6 = "立即评价"
            r5.equals(r6)
            return
    }

    public java.lang.String h() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }

    public java.lang.String i() {
            r1 = this;
            java.lang.String r0 = r1.e
            return r0
    }

    public java.lang.String j() {
            r1 = this;
            java.lang.String r0 = r1.c
            return r0
    }

    public java.lang.String k() {
            r1 = this;
            java.lang.String r0 = r1.d
            return r0
    }

    public java.lang.String l() {
            r1 = this;
            java.lang.String r0 = r1.g
            return r0
    }

    public java.lang.String m() {
            r1 = this;
            java.lang.String r0 = r1.f
            return r0
    }

    public com.bxkj.student.life.mall.order.a n(java.lang.String r1) {
            r0 = this;
            r0.b = r1
            return r0
    }

    public com.bxkj.student.life.mall.order.a o(java.lang.String r1) {
            r0 = this;
            r0.e = r1
            return r0
    }

    public com.bxkj.student.life.mall.order.a p(java.lang.String r1) {
            r0 = this;
            r0.c = r1
            return r0
    }

    public com.bxkj.student.life.mall.order.a q(java.lang.String r1) {
            r0 = this;
            r0.d = r1
            return r0
    }

    public com.bxkj.student.life.mall.order.a r(java.lang.String r1) {
            r0 = this;
            r0.g = r1
            return r0
    }

    public void s(com.bxkj.student.life.mall.order.a.e r1) {
            r0 = this;
            r0.h = r1
            return
    }

    public com.bxkj.student.life.mall.order.a t(java.lang.String r1) {
            r0 = this;
            r0.f = r1
            return r0
    }
}
