package com.bxkj.student.common.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class g {
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> a;
    private android.content.Context b;
    private com.scwang.smartrefresh.layout.SmartRefreshLayout c;
    private rx.e<retrofit2.c0<okhttp3.ResponseBody>> d;
    protected int e;
    protected int f;
    protected int g;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements m2.e {
        final /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout a;
        final /* synthetic */ com.bxkj.student.common.utils.g b;

        a(com.bxkj.student.common.utils.g r1, com.scwang.smartrefresh.layout.SmartRefreshLayout r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void m(l2.h r5) {
                r4 = this;
                com.bxkj.student.common.utils.g r5 = r4.b
                int r0 = r5.g
                int r1 = r5.e
                int r2 = r0 / r1
                int r3 = r5.f
                int r0 = r0 % r1
                if (r0 != 0) goto Le
                goto L10
            Le:
                int r2 = r2 + 1
            L10:
                if (r3 < r2) goto L28
                com.scwang.smartrefresh.layout.SmartRefreshLayout r5 = r4.a
                r5.q0()
                com.bxkj.student.common.utils.g r5 = r4.b
                android.content.Context r5 = com.bxkj.student.common.utils.g.b(r5)
                java.lang.String r0 = "没有了"
                r1 = 0
                android.widget.Toast r5 = android.widget.Toast.makeText(r5, r0, r1)
                r5.show()
                return
            L28:
                int r3 = r3 + 1
                r5.f = r3
                r5.d()
                return
        }

        public void n(l2.h r2) {
                r1 = this;
                com.bxkj.student.common.utils.g r2 = r1.b
                r0 = 1
                r2.f = r0
                r2.d()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.common.utils.g a;

        b(com.bxkj.student.common.utils.g r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFinish() {
                r1 = this;
                super.netOnFinish()
                com.bxkj.student.common.utils.g r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.common.utils.g.c(r0)
                r0.w0()
                com.bxkj.student.common.utils.g r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.student.common.utils.g.c(r0)
                r0.q0()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r4) {
                r3 = this;
                com.bxkj.student.common.utils.g r0 = r3.a
                java.lang.String r1 = "total"
                java.lang.String r1 = cn.bluemobi.dylan.base.utils.u.O(r4, r1)
                int r1 = java.lang.Integer.parseInt(r1)
                r0.g = r1
                java.lang.String r0 = "data"
                java.lang.Object r4 = r4.get(r0)
                java.util.List r4 = (java.util.List) r4
                com.bxkj.student.common.utils.g r0 = r3.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r0 = com.bxkj.student.common.utils.g.a(r0)
                java.util.List r0 = r0.d()
                com.bxkj.student.common.utils.g r1 = r3.a
                int r1 = r1.f
                r2 = 1
                if (r1 != r2) goto L28
                goto L2c
            L28:
                r0.addAll(r4)
                r4 = r0
            L2c:
                com.bxkj.student.common.utils.g r0 = r3.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r0 = com.bxkj.student.common.utils.g.a(r0)
                r0.g(r4)
                return
        }
    }

    public g(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r0 = 10
            r1.e = r0
            r0 = 1
            r1.f = r0
            r1.g = r0
            r1.b = r2
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter a(com.bxkj.student.common.utils.g r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.a
            return r0
    }

    static /* bridge */ /* synthetic */ android.content.Context b(com.bxkj.student.common.utils.g r0) {
            android.content.Context r0 = r0.b
            return r0
    }

    static /* bridge */ /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout c(com.bxkj.student.common.utils.g r0) {
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.c
            return r0
    }

    public void d() {
            r2 = this;
            android.content.Context r0 = r2.b
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideLoadingDialog()
            rx.e<retrofit2.c0<okhttp3.ResponseBody>> r1 = r2.d
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.common.utils.g$b r1 = new com.bxkj.student.common.utils.g$b
            r1.<init>(r2)
            r0.setDataListener(r1)
            return
    }

    public int e() {
            r1 = this;
            int r0 = r1.f
            return r0
    }

    public int f() {
            r1 = this;
            int r0 = r1.e
            return r0
    }

    public com.bxkj.student.common.utils.g g(com.scwang.smartrefresh.layout.SmartRefreshLayout r2) {
            r1 = this;
            r1.c = r2
            com.bxkj.student.common.utils.g$a r0 = new com.bxkj.student.common.utils.g$a
            r0.<init>(r1, r2)
            r2.m1(r0)
            return r1
    }

    public com.bxkj.student.common.utils.g h(cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r1) {
            r0 = this;
            r0.a = r1
            return r0
    }

    public com.bxkj.student.common.utils.g i(rx.e<retrofit2.c0<okhttp3.ResponseBody>> r1) {
            r0 = this;
            r0.d = r1
            return r0
    }
}
