package com.bxkj.student.life.mall.address;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ChooseCityActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private java.lang.String F0;
    private java.lang.String G0;
    private java.lang.String H0;
    private androidx.recyclerview.widget.RecyclerView Y;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> Z;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> a0;
    private java.lang.String b0;
    private java.lang.String c0;

    /* renamed from: k0, reason: collision with root package name */
    private java.lang.String f1030k0;

    /* renamed from: p0, reason: collision with root package name */
    private java.lang.String f1031p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.life.mall.address.ChooseCityActivity k;

        a(com.bxkj.student.life.mall.address.ChooseCityActivity r1, android.content.Context r2, int r3, java.util.List r4) {
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

        public void m(cn.bluemobi.dylan.base.adapter.common.ViewHolder r2, java.util.Map<java.lang.String, java.lang.Object> r3) {
                r1 = this;
                java.lang.String r0 = "name"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r0)
                r0 = 2131298986(0x7f090aaa, float:1.821596E38)
                r2.J(r0, r3)
                int r3 = r2.f()
                int r3 = r3 % 2
                if (r3 != 0) goto L22
                com.bxkj.student.life.mall.address.ChooseCityActivity r3 = r1.k
                android.content.res.Resources r3 = r3.getResources()
                r0 = 2131099737(0x7f060059, float:1.7811836E38)
            L1d:
                int r3 = r3.getColor(r0)
                goto L2c
            L22:
                com.bxkj.student.life.mall.address.ChooseCityActivity r3 = r1.k
                android.content.res.Resources r3 = r3.getResources()
                r0 = 2131099728(0x7f060050, float:1.7811817E38)
                goto L1d
            L2c:
                r0 = 2131298068(0x7f090714, float:1.8214099E38)
                r2.k(r0, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements cn.bluemobi.dylan.base.adapter.common.recyclerview.b {
        final /* synthetic */ com.bxkj.student.life.mall.address.ChooseCityActivity a;

        b(com.bxkj.student.life.mall.address.ChooseCityActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(android.view.ViewGroup r1, android.view.View r2, java.lang.Object r3, int r4) {
                r0 = this;
                com.bxkj.student.life.mall.address.ChooseCityActivity r1 = r0.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r1 = com.bxkj.student.life.mall.address.ChooseCityActivity.g0(r1)
                java.lang.Object r1 = r1.getItem(r4)
                java.util.Map r1 = (java.util.Map) r1
                java.lang.String r2 = "id"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
                com.bxkj.student.life.mall.address.ChooseCityActivity r2 = r0.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r2 = com.bxkj.student.life.mall.address.ChooseCityActivity.g0(r2)
                java.lang.Object r2 = r2.getItem(r4)
                java.util.Map r2 = (java.util.Map) r2
                java.lang.String r3 = "name"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r3)
                com.bxkj.student.life.mall.address.ChooseCityActivity r3 = r0.a
                java.lang.String r3 = com.bxkj.student.life.mall.address.ChooseCityActivity.o0(r3)
                java.lang.String r4 = "请选择省"
                boolean r3 = r3.equals(r4)
                java.lang.String r4 = "请选择市"
                if (r3 == 0) goto L4e
                com.bxkj.student.life.mall.address.ChooseCityActivity r3 = r0.a
                com.bxkj.student.life.mall.address.ChooseCityActivity.w0(r3, r4)
                com.bxkj.student.life.mall.address.ChooseCityActivity r3 = r0.a
                com.bxkj.student.life.mall.address.ChooseCityActivity.u0(r3, r1)
                com.bxkj.student.life.mall.address.ChooseCityActivity r1 = r0.a
                com.bxkj.student.life.mall.address.ChooseCityActivity.v0(r1, r2)
                com.bxkj.student.life.mall.address.ChooseCityActivity r1 = r0.a
                java.lang.String r2 = com.bxkj.student.life.mall.address.ChooseCityActivity.m0(r1)
                com.bxkj.student.life.mall.address.ChooseCityActivity.x0(r1, r2)
                goto Ld9
            L4e:
                com.bxkj.student.life.mall.address.ChooseCityActivity r3 = r0.a
                java.lang.String r3 = com.bxkj.student.life.mall.address.ChooseCityActivity.o0(r3)
                boolean r3 = r3.equals(r4)
                java.lang.String r4 = "请选择区"
                if (r3 == 0) goto L71
                com.bxkj.student.life.mall.address.ChooseCityActivity r3 = r0.a
                com.bxkj.student.life.mall.address.ChooseCityActivity.w0(r3, r4)
                com.bxkj.student.life.mall.address.ChooseCityActivity r3 = r0.a
                com.bxkj.student.life.mall.address.ChooseCityActivity.s0(r3, r1)
                com.bxkj.student.life.mall.address.ChooseCityActivity r3 = r0.a
                com.bxkj.student.life.mall.address.ChooseCityActivity.t0(r3, r2)
                com.bxkj.student.life.mall.address.ChooseCityActivity r2 = r0.a
                com.bxkj.student.life.mall.address.ChooseCityActivity.x0(r2, r1)
                goto Ld9
            L71:
                com.bxkj.student.life.mall.address.ChooseCityActivity r3 = r0.a
                java.lang.String r3 = com.bxkj.student.life.mall.address.ChooseCityActivity.o0(r3)
                boolean r3 = r3.equals(r4)
                if (r3 == 0) goto Ld9
                com.bxkj.student.life.mall.address.ChooseCityActivity r3 = r0.a
                com.bxkj.student.life.mall.address.ChooseCityActivity.q0(r3, r1)
                com.bxkj.student.life.mall.address.ChooseCityActivity r1 = r0.a
                com.bxkj.student.life.mall.address.ChooseCityActivity.r0(r1, r2)
                android.content.Intent r1 = new android.content.Intent
                r1.<init>()
                com.bxkj.student.life.mall.address.ChooseCityActivity r2 = r0.a
                java.lang.String r2 = com.bxkj.student.life.mall.address.ChooseCityActivity.m0(r2)
                java.lang.String r3 = "provinceId"
                r1.putExtra(r3, r2)
                com.bxkj.student.life.mall.address.ChooseCityActivity r2 = r0.a
                java.lang.String r2 = com.bxkj.student.life.mall.address.ChooseCityActivity.n0(r2)
                java.lang.String r3 = "provinceName"
                r1.putExtra(r3, r2)
                com.bxkj.student.life.mall.address.ChooseCityActivity r2 = r0.a
                java.lang.String r2 = com.bxkj.student.life.mall.address.ChooseCityActivity.k0(r2)
                java.lang.String r3 = "cityId"
                r1.putExtra(r3, r2)
                com.bxkj.student.life.mall.address.ChooseCityActivity r2 = r0.a
                java.lang.String r2 = com.bxkj.student.life.mall.address.ChooseCityActivity.l0(r2)
                java.lang.String r3 = "cityName"
                r1.putExtra(r3, r2)
                com.bxkj.student.life.mall.address.ChooseCityActivity r2 = r0.a
                java.lang.String r2 = com.bxkj.student.life.mall.address.ChooseCityActivity.i0(r2)
                java.lang.String r3 = "areaId"
                r1.putExtra(r3, r2)
                com.bxkj.student.life.mall.address.ChooseCityActivity r2 = r0.a
                java.lang.String r2 = com.bxkj.student.life.mall.address.ChooseCityActivity.j0(r2)
                java.lang.String r3 = "areaName"
                r1.putExtra(r3, r2)
                com.bxkj.student.life.mall.address.ChooseCityActivity r2 = r0.a
                r3 = -1
                r2.setResult(r3, r1)
                com.bxkj.student.life.mall.address.ChooseCityActivity r1 = r0.a
                r1.finish()
            Ld9:
                com.bxkj.student.life.mall.address.ChooseCityActivity r1 = r0.a
                java.lang.String r2 = com.bxkj.student.life.mall.address.ChooseCityActivity.o0(r1)
                r1.setTitle(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.life.mall.address.ChooseCityActivity a;

        c(com.bxkj.student.life.mall.address.ChooseCityActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.student.life.mall.address.ChooseCityActivity r0 = r2.a
                java.lang.String r1 = "data"
                java.util.List r3 = cn.bluemobi.dylan.http.JsonParse.getList(r3, r1)
                com.bxkj.student.life.mall.address.ChooseCityActivity.p0(r0, r3)
                com.bxkj.student.life.mall.address.ChooseCityActivity r3 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r3 = com.bxkj.student.life.mall.address.ChooseCityActivity.g0(r3)
                com.bxkj.student.life.mall.address.ChooseCityActivity r0 = r2.a
                java.util.List r0 = com.bxkj.student.life.mall.address.ChooseCityActivity.h0(r0)
                r3.g(r0)
                return
        }
    }

    public ChooseCityActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.Z = r0
            java.lang.String r0 = "请选择省"
            r1.b0 = r0
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter g0(com.bxkj.student.life.mall.address.ChooseCityActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.a0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List h0(com.bxkj.student.life.mall.address.ChooseCityActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.Z
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String i0(com.bxkj.student.life.mall.address.ChooseCityActivity r0) {
            java.lang.String r0 = r0.G0
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String j0(com.bxkj.student.life.mall.address.ChooseCityActivity r0) {
            java.lang.String r0 = r0.H0
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String k0(com.bxkj.student.life.mall.address.ChooseCityActivity r0) {
            java.lang.String r0 = r0.f1031p0
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String l0(com.bxkj.student.life.mall.address.ChooseCityActivity r0) {
            java.lang.String r0 = r0.F0
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String m0(com.bxkj.student.life.mall.address.ChooseCityActivity r0) {
            java.lang.String r0 = r0.c0
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String n0(com.bxkj.student.life.mall.address.ChooseCityActivity r0) {
            java.lang.String r0 = r0.f1030k0
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String o0(com.bxkj.student.life.mall.address.ChooseCityActivity r0) {
            java.lang.String r0 = r0.b0
            return r0
    }

    static /* bridge */ /* synthetic */ void p0(com.bxkj.student.life.mall.address.ChooseCityActivity r0, java.util.List r1) {
            r0.Z = r1
            return
    }

    static /* bridge */ /* synthetic */ void q0(com.bxkj.student.life.mall.address.ChooseCityActivity r0, java.lang.String r1) {
            r0.G0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void r0(com.bxkj.student.life.mall.address.ChooseCityActivity r0, java.lang.String r1) {
            r0.H0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void s0(com.bxkj.student.life.mall.address.ChooseCityActivity r0, java.lang.String r1) {
            r0.f1031p0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void t0(com.bxkj.student.life.mall.address.ChooseCityActivity r0, java.lang.String r1) {
            r0.F0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void u0(com.bxkj.student.life.mall.address.ChooseCityActivity r0, java.lang.String r1) {
            r0.c0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void v0(com.bxkj.student.life.mall.address.ChooseCityActivity r0, java.lang.String r1) {
            r0.f1030k0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void w0(com.bxkj.student.life.mall.address.ChooseCityActivity r0, java.lang.String r1) {
            r0.b0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void x0(com.bxkj.student.life.mall.address.ChooseCityActivity r0, java.lang.String r1) {
            r0.y0(r1)
            return
    }

    private void y0(java.lang.String r3) {
            r2 = this;
            android.content.Context r0 = r2.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<w.g> r1 = w.g.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            w.g r1 = (w.g) r1
            rx.e r3 = r1.t(r3)
            cn.bluemobi.dylan.http.HttpRequest r3 = r0.setObservable(r3)
            com.bxkj.student.life.mall.address.ChooseCityActivity$c r0 = new com.bxkj.student.life.mall.address.ChooseCityActivity$c
            r0.<init>(r2)
            r3.setDataListener(r0)
            return
    }

    public void L() {
            r2 = this;
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.a0
            com.bxkj.student.life.mall.address.ChooseCityActivity$b r1 = new com.bxkj.student.life.mall.address.ChooseCityActivity$b
            r1.<init>(r2)
            r0.k(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131493638(0x7f0c0306, float:1.8610762E38)
            return r0
    }

    public void R() {
            r4 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r4.Y
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r4.V
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            com.bxkj.student.life.mall.address.ChooseCityActivity$a r0 = new com.bxkj.student.life.mall.address.ChooseCityActivity$a
            android.content.Context r1 = r4.V
            r2 = 2131493238(0x7f0c0176, float:1.860995E38)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.Z
            r0.<init>(r4, r1, r2, r3)
            r4.a0 = r0
            androidx.recyclerview.widget.RecyclerView r1 = r4.Y
            r1.setAdapter(r0)
            r0 = 0
            r4.y0(r0)
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = r1.b0
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131298421(0x7f090875, float:1.8214815E38)
            android.view.View r1 = r0.findViewById(r1)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r0.Y = r1
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}
