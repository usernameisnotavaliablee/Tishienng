package com.bxkj.place.apply;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class SchoolDistrictActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> F0;
    private android.widget.Spinner Y;
    private androidx.recyclerview.widget.RecyclerView Z;
    private android.widget.TextView a0;
    private android.widget.TextView b0;
    private android.widget.TextView c0;

    /* renamed from: k0, reason: collision with root package name */
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> f682k0;

    /* renamed from: p0, reason: collision with root package name */
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> f683p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.place.apply.SchoolDistrictActivity e;

        a(com.bxkj.place.apply.SchoolDistrictActivity r1, android.content.Context r2, int r3, java.util.List r4) {
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

        public void d(cn.bluemobi.dylan.base.adapter.common.ViewHolder r3, java.util.Map<java.lang.String, java.lang.Object> r4) {
                r2 = this;
                int r0 = com.bxkj.place.R.id.tv_name
                java.lang.String r1 = "name"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                r3.J(r0, r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.place.apply.SchoolDistrictActivity k;

        b(com.bxkj.place.apply.SchoolDistrictActivity r1, android.content.Context r2, int r3, java.util.List r4) {
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
                int r0 = com.bxkj.place.R.id.imageView
                java.lang.String r1 = "picture"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                r3.s(r0, r1)
                int r0 = com.bxkj.place.R.id.tv_name
                java.lang.String r1 = "name"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                r3.J(r0, r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements cn.bluemobi.dylan.base.adapter.common.recyclerview.b {
        final /* synthetic */ com.bxkj.place.apply.SchoolDistrictActivity a;

        c(com.bxkj.place.apply.SchoolDistrictActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(android.view.ViewGroup r2, android.view.View r3, java.lang.Object r4, int r5) {
                r1 = this;
                com.bxkj.place.apply.SchoolDistrictActivity r2 = r1.a
                android.content.Intent r3 = r2.getIntent()
                com.bxkj.place.apply.SchoolDistrictActivity r4 = r1.a
                android.content.Context r4 = com.bxkj.place.apply.SchoolDistrictActivity.h0(r4)
                java.lang.Class<com.bxkj.place.apply.PlaceListActivity> r0 = com.bxkj.place.apply.PlaceListActivity.class
                android.content.Intent r3 = r3.setClass(r4, r0)
                com.bxkj.place.apply.SchoolDistrictActivity r4 = r1.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r4 = com.bxkj.place.apply.SchoolDistrictActivity.g0(r4)
                java.lang.Object r4 = r4.getItem(r5)
                java.util.Map r4 = (java.util.Map) r4
                java.lang.String r5 = "id"
                java.lang.String r4 = cn.bluemobi.dylan.base.utils.u.O(r4, r5)
                android.content.Intent r3 = r3.putExtra(r5, r4)
                r2.startActivity(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d implements android.widget.AdapterView.OnItemSelectedListener {
        final /* synthetic */ com.bxkj.place.apply.SchoolDistrictActivity a;

        d(com.bxkj.place.apply.SchoolDistrictActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
                r0 = this;
                com.bxkj.place.apply.SchoolDistrictActivity r1 = r0.a
                cn.bluemobi.dylan.base.adapter.common.abslistview.a r2 = com.bxkj.place.apply.SchoolDistrictActivity.i0(r1)
                java.lang.Object r2 = r2.getItem(r3)
                java.util.Map r2 = (java.util.Map) r2
                java.lang.String r4 = "id"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r4)
                com.bxkj.place.apply.SchoolDistrictActivity.j0(r1, r2)
                com.bxkj.place.apply.SchoolDistrictActivity r1 = r0.a
                android.widget.TextView r1 = com.bxkj.place.apply.SchoolDistrictActivity.k0(r1)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "校区地址："
                r2.append(r4)
                com.bxkj.place.apply.SchoolDistrictActivity r4 = r0.a
                cn.bluemobi.dylan.base.adapter.common.abslistview.a r4 = com.bxkj.place.apply.SchoolDistrictActivity.i0(r4)
                java.lang.Object r4 = r4.getItem(r3)
                java.util.Map r4 = (java.util.Map) r4
                java.lang.String r5 = "address"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r5)
                r2.append(r4)
                java.lang.String r2 = r2.toString()
                r1.setText(r2)
                com.bxkj.place.apply.SchoolDistrictActivity r1 = r0.a
                android.widget.TextView r1 = com.bxkj.place.apply.SchoolDistrictActivity.l0(r1)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "联系人\u3000："
                r2.append(r4)
                com.bxkj.place.apply.SchoolDistrictActivity r4 = r0.a
                cn.bluemobi.dylan.base.adapter.common.abslistview.a r4 = com.bxkj.place.apply.SchoolDistrictActivity.i0(r4)
                java.lang.Object r4 = r4.getItem(r3)
                java.util.Map r4 = (java.util.Map) r4
                java.lang.String r5 = "linkUser"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r5)
                r2.append(r4)
                java.lang.String r2 = r2.toString()
                r1.setText(r2)
                com.bxkj.place.apply.SchoolDistrictActivity r1 = r0.a
                android.widget.TextView r1 = com.bxkj.place.apply.SchoolDistrictActivity.m0(r1)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "联系电话："
                r2.append(r4)
                com.bxkj.place.apply.SchoolDistrictActivity r4 = r0.a
                cn.bluemobi.dylan.base.adapter.common.abslistview.a r4 = com.bxkj.place.apply.SchoolDistrictActivity.i0(r4)
                java.lang.Object r3 = r4.getItem(r3)
                java.util.Map r3 = (java.util.Map) r3
                java.lang.String r4 = "phoneNum"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r4)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.setText(r2)
                return
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(android.widget.AdapterView<?> r1) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.place.apply.SchoolDistrictActivity a;

        e(com.bxkj.place.apply.SchoolDistrictActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r4) {
                r3 = this;
                com.bxkj.place.apply.SchoolDistrictActivity r0 = r3.a
                android.widget.FrameLayout r0 = r0.P()
                r1 = 0
                r0.setVisibility(r1)
                com.bxkj.place.apply.SchoolDistrictActivity r0 = r3.a
                java.lang.String r2 = "data"
                java.lang.Object r4 = r4.get(r2)
                java.util.List r4 = (java.util.List) r4
                com.bxkj.place.apply.SchoolDistrictActivity.o0(r0, r4)
                com.bxkj.place.apply.SchoolDistrictActivity r4 = r3.a
                cn.bluemobi.dylan.base.adapter.common.abslistview.a r4 = com.bxkj.place.apply.SchoolDistrictActivity.i0(r4)
                com.bxkj.place.apply.SchoolDistrictActivity r0 = r3.a
                java.util.List r0 = com.bxkj.place.apply.SchoolDistrictActivity.n0(r0)
                r4.c(r0)
            L26:
                com.bxkj.place.apply.SchoolDistrictActivity r4 = r3.a
                java.util.List r4 = com.bxkj.place.apply.SchoolDistrictActivity.n0(r4)
                int r4 = r4.size()
                if (r1 >= r4) goto L58
                com.bxkj.place.apply.SchoolDistrictActivity r4 = r3.a
                java.util.List r4 = com.bxkj.place.apply.SchoolDistrictActivity.n0(r4)
                java.lang.Object r4 = r4.get(r1)
                java.util.Map r4 = (java.util.Map) r4
                java.lang.String r0 = "isDefault"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                java.lang.String r0 = "1"
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L55
                com.bxkj.place.apply.SchoolDistrictActivity r4 = r3.a
                android.widget.Spinner r4 = com.bxkj.place.apply.SchoolDistrictActivity.p0(r4)
                r4.setSelection(r1)
            L55:
                int r1 = r1 + 1
                goto L26
            L58:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class f extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.place.apply.SchoolDistrictActivity a;

        f(com.bxkj.place.apply.SchoolDistrictActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r2) {
                r1 = this;
                java.lang.String r0 = "data"
                java.lang.Object r2 = r2.get(r0)
                java.util.List r2 = (java.util.List) r2
                com.bxkj.place.apply.SchoolDistrictActivity r0 = r1.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r0 = com.bxkj.place.apply.SchoolDistrictActivity.g0(r0)
                r0.g(r2)
                return
        }
    }

    public SchoolDistrictActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f682k0 = r0
            return
    }

    static /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter g0(com.bxkj.place.apply.SchoolDistrictActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.f683p0
            return r0
    }

    static /* synthetic */ android.content.Context h0(com.bxkj.place.apply.SchoolDistrictActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ cn.bluemobi.dylan.base.adapter.common.abslistview.a i0(com.bxkj.place.apply.SchoolDistrictActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.F0
            return r0
    }

    static /* synthetic */ void j0(com.bxkj.place.apply.SchoolDistrictActivity r0, java.lang.String r1) {
            r0.q0(r1)
            return
    }

    static /* synthetic */ android.widget.TextView k0(com.bxkj.place.apply.SchoolDistrictActivity r0) {
            android.widget.TextView r0 = r0.a0
            return r0
    }

    static /* synthetic */ android.widget.TextView l0(com.bxkj.place.apply.SchoolDistrictActivity r0) {
            android.widget.TextView r0 = r0.b0
            return r0
    }

    static /* synthetic */ android.widget.TextView m0(com.bxkj.place.apply.SchoolDistrictActivity r0) {
            android.widget.TextView r0 = r0.c0
            return r0
    }

    static /* synthetic */ java.util.List n0(com.bxkj.place.apply.SchoolDistrictActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.f682k0
            return r0
    }

    static /* synthetic */ java.util.List o0(com.bxkj.place.apply.SchoolDistrictActivity r0, java.util.List r1) {
            r0.f682k0 = r1
            return r1
    }

    static /* synthetic */ android.widget.Spinner p0(com.bxkj.place.apply.SchoolDistrictActivity r0) {
            android.widget.Spinner r0 = r0.Y
            return r0
    }

    private void q0(java.lang.String r3) {
            r2 = this;
            android.content.Context r0 = r2.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<c0.b> r1 = c0.b.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            c0.b r1 = (c0.b) r1
            rx.e r3 = r1.i(r3)
            cn.bluemobi.dylan.http.HttpRequest r3 = r0.setObservable(r3)
            com.bxkj.place.apply.SchoolDistrictActivity$f r0 = new com.bxkj.place.apply.SchoolDistrictActivity$f
            r0.<init>(r2)
            r3.setDataListener(r0)
            return
    }

    private void r0() {
            r2 = this;
            android.content.Context r0 = r2.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<c0.b> r1 = c0.b.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            c0.b r1 = (c0.b) r1
            rx.e r1 = r1.d()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.place.apply.SchoolDistrictActivity$e r1 = new com.bxkj.place.apply.SchoolDistrictActivity$e
            r1.<init>(r2)
            r0.setDataListener(r1)
            return
    }

    public void L() {
            r2 = this;
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.f683p0
            com.bxkj.place.apply.SchoolDistrictActivity$c r1 = new com.bxkj.place.apply.SchoolDistrictActivity$c
            r1.<init>(r2)
            r0.k(r1)
            android.widget.Spinner r0 = r2.Y
            com.bxkj.place.apply.SchoolDistrictActivity$d r1 = new com.bxkj.place.apply.SchoolDistrictActivity$d
            r1.<init>(r2)
            r0.setOnItemSelectedListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            int r0 = com.bxkj.place.R.layout.ac_school_district
            return r0
    }

    public void R() {
            r6 = this;
            com.bxkj.place.apply.SchoolDistrictActivity$a r0 = new com.bxkj.place.apply.SchoolDistrictActivity$a
            android.content.Context r1 = r6.V
            int r2 = com.bxkj.place.R.layout.item_for_school_district_list
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r6.f682k0
            r0.<init>(r6, r1, r2, r3)
            r6.F0 = r0
            android.widget.Spinner r1 = r6.Y
            r1.setAdapter(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r6.Z
            androidx.recyclerview.widget.GridLayoutManager r1 = new androidx.recyclerview.widget.GridLayoutManager
            android.content.Context r2 = r6.V
            r3 = 1
            r4 = 0
            r5 = 4
            r1.<init>(r2, r5, r3, r4)
            r0.setLayoutManager(r1)
            com.bxkj.place.apply.SchoolDistrictActivity$b r0 = new com.bxkj.place.apply.SchoolDistrictActivity$b
            android.content.Context r1 = r6.V
            int r2 = com.bxkj.place.R.layout.item_for_sport_typeu
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r6.f682k0
            r0.<init>(r6, r1, r2, r3)
            r6.f683p0 = r0
            androidx.recyclerview.widget.RecyclerView r1 = r6.Z
            r1.setAdapter(r0)
            r6.r0()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "选择项目"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r2) {
            r1 = this;
            int r2 = com.bxkj.place.R.id.spinner
            android.view.View r2 = r1.findViewById(r2)
            android.widget.Spinner r2 = (android.widget.Spinner) r2
            r1.Y = r2
            int r2 = com.bxkj.place.R.id.recyclerView
            android.view.View r2 = r1.findViewById(r2)
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            r1.Z = r2
            int r2 = com.bxkj.place.R.id.tv_address
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.a0 = r2
            int r2 = com.bxkj.place.R.id.tv_user
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.b0 = r2
            int r2 = com.bxkj.place.R.id.tv_phone
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.c0 = r2
            android.widget.FrameLayout r2 = r1.P()
            r0 = 4
            r2.setVisibility(r0)
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}
