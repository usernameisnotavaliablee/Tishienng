package com.bxkj.place.apply;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class PlaceListActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.lang.String> F0;
    private java.util.List<java.lang.String> G0;
    private android.widget.Button H0;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> I0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> J0;
    private int K0;
    private java.lang.String L0;
    private java.lang.String M0;
    private java.lang.String N0;
    private java.lang.String O0;
    private com.bxkj.place.view.MyRecyclerViewOnScrollListener P0;
    private com.bxkj.place.view.MyRecyclerViewOnScrollListener Q0;
    private android.widget.TextView Y;
    private com.google.android.material.tabs.TabLayout Z;
    private androidx.recyclerview.widget.RecyclerView a0;
    private androidx.recyclerview.widget.RecyclerView b0;
    private androidx.recyclerview.widget.RecyclerView c0;

    /* renamed from: k0, reason: collision with root package name */
    private com.bxkj.base.view.ObservableHorizontalScrollView f680k0;

    /* renamed from: p0, reason: collision with root package name */
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> f681p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.lang.String> {
        final /* synthetic */ com.bxkj.place.apply.PlaceListActivity k;

        a(com.bxkj.place.apply.PlaceListActivity r1, android.content.Context r2, int r3, java.util.List r4) {
                r0 = this;
                r0.k = r1
                r0.<init>(r2, r3, r4)
                return
        }

        public /* bridge */ /* synthetic */ void c(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.lang.Object r2) {
                r0 = this;
                java.lang.String r2 = (java.lang.String) r2
                r0.m(r1, r2)
                return
        }

        public void m(cn.bluemobi.dylan.base.adapter.common.ViewHolder r2, java.lang.String r3) {
                r1 = this;
                int r0 = com.bxkj.place.R.id.tv_name
                r2.J(r0, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.place.apply.PlaceListActivity k;

        b(com.bxkj.place.apply.PlaceListActivity r1, android.content.Context r2, int r3, java.util.List r4) {
                r0 = this;
                r0.k = r1
                r0.<init>(r2, r3, r4)
                return
        }

        public static /* synthetic */ void m(com.bxkj.place.apply.PlaceListActivity.b r1, java.lang.String r2, java.util.Map r3, android.view.View r4) {
                r1.getClass()
                java.lang.String r4 = "1"
                boolean r4 = r4.equals(r2)
                if (r4 == 0) goto L13
                com.bxkj.place.apply.PlaceListActivity r1 = r1.k
                java.lang.String r2 = "已被预约"
                r1.f0(r2)
                return
            L13:
                java.lang.String r4 = "2"
                boolean r4 = r4.equals(r2)
                if (r4 == 0) goto L23
                com.bxkj.place.apply.PlaceListActivity r1 = r1.k
                java.lang.String r2 = "时间已过"
                r1.f0(r2)
                return
            L23:
                java.lang.String r4 = "3"
                boolean r4 = r4.equals(r2)
                if (r4 == 0) goto L33
                com.bxkj.place.apply.PlaceListActivity r1 = r1.k
                java.lang.String r2 = "未开放"
                r1.f0(r2)
                return
            L33:
                java.lang.String r4 = "4"
                boolean r2 = r4.equals(r2)
                if (r2 == 0) goto L43
                com.bxkj.place.apply.PlaceListActivity r1 = r1.k
                java.lang.String r2 = "已禁用"
                r1.f0(r2)
                return
            L43:
                com.bxkj.place.apply.PlaceListActivity r2 = r1.k
                android.widget.TextView r2 = com.bxkj.place.apply.PlaceListActivity.i0(r2)
                r4 = 0
                r2.setVisibility(r4)
                com.bxkj.place.apply.PlaceListActivity r2 = r1.k
                android.widget.TextView r2 = com.bxkj.place.apply.PlaceListActivity.i0(r2)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r0 = "fieldName"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r0)
                r4.append(r0)
                java.lang.String r0 = "\u3000"
                r4.append(r0)
                java.lang.String r0 = "startTime"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r0)
                r4.append(r0)
                java.lang.String r0 = "-"
                r4.append(r0)
                java.lang.String r0 = "endTime"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r0)
                r4.append(r0)
                java.lang.String r4 = r4.toString()
                r2.setText(r4)
                com.bxkj.place.apply.PlaceListActivity r2 = r1.k
                android.widget.TextView r2 = com.bxkj.place.apply.PlaceListActivity.i0(r2)
                java.lang.String r4 = "id"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r4)
                r2.setTag(r4)
                com.bxkj.place.apply.PlaceListActivity r2 = r1.k
                android.widget.Button r2 = com.bxkj.place.apply.PlaceListActivity.j0(r2)
                java.lang.String r4 = "isParty"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r4)
                r2.setTag(r3)
                com.bxkj.place.apply.PlaceListActivity r2 = r1.k
                android.widget.Button r2 = com.bxkj.place.apply.PlaceListActivity.j0(r2)
                r3 = 1
                r2.setEnabled(r3)
                com.bxkj.place.apply.PlaceListActivity r2 = r1.k
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r2 = com.bxkj.place.apply.PlaceListActivity.s0(r2)
                com.bxkj.place.apply.PlaceListActivity r1 = r1.k
                java.util.List r1 = com.bxkj.place.apply.PlaceListActivity.q0(r1)
                r2.g(r1)
                return
        }

        public /* bridge */ /* synthetic */ void c(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.lang.Object r2) {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                r0.n(r1, r2)
                return
        }

        public void n(cn.bluemobi.dylan.base.adapter.common.ViewHolder r5, java.util.Map<java.lang.String, java.lang.Object> r6) {
                r4 = this;
                java.lang.String r0 = "id"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r0)
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L1e
                int r1 = com.bxkj.place.R.id.ll_root
                android.view.View r1 = r5.h(r1)
                android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
                r2 = 0
                r1.setPadding(r2, r2, r2, r2)
                int r1 = com.bxkj.place.R.id.tv_name
                r5.N(r1, r2)
                goto L52
            L1e:
                int r1 = com.bxkj.place.R.id.ll_root
                android.view.View r1 = r5.h(r1)
                android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
                r2 = 1
                r1.setPadding(r2, r2, r2, r2)
                int r1 = com.bxkj.place.R.id.tv_name
                r5.N(r1, r2)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "startTime"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r3)
                r2.append(r3)
                java.lang.String r3 = "-"
                r2.append(r3)
                java.lang.String r3 = "endTime"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r3)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r5.J(r1, r2)
            L52:
                com.bxkj.place.apply.PlaceListActivity r1 = r4.k
                android.widget.TextView r1 = com.bxkj.place.apply.PlaceListActivity.i0(r1)
                java.lang.Object r1 = r1.getTag()
                java.lang.String r1 = (java.lang.String) r1
                java.lang.String r2 = "showStatus"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r2)
                if (r1 == 0) goto L83
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r0)
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L83
                int r0 = com.bxkj.place.R.id.tv_name
                com.bxkj.place.apply.PlaceListActivity r1 = r4.k
                android.content.res.Resources r1 = r1.getResources()
                int r3 = com.bxkj.place.R.color.themeColor
                int r1 = r1.getColor(r3)
                r5.k(r0, r1)
                goto L104
            L83:
                java.lang.String r0 = "0"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L9d
                int r0 = com.bxkj.place.R.id.tv_name
                com.bxkj.place.apply.PlaceListActivity r1 = r4.k
                android.content.res.Resources r1 = r1.getResources()
                int r3 = com.bxkj.place.R.color.colorWhite
                int r1 = r1.getColor(r3)
                r5.k(r0, r1)
                goto L104
            L9d:
                java.lang.String r0 = "1"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto Lb7
                int r0 = com.bxkj.place.R.id.tv_name
                com.bxkj.place.apply.PlaceListActivity r1 = r4.k
                android.content.res.Resources r1 = r1.getResources()
                int r3 = com.bxkj.place.R.color.textColorGray
                int r1 = r1.getColor(r3)
                r5.k(r0, r1)
                goto L104
            Lb7:
                java.lang.String r0 = "2"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto Ld1
                int r0 = com.bxkj.place.R.id.tv_name
                com.bxkj.place.apply.PlaceListActivity r1 = r4.k
                android.content.res.Resources r1 = r1.getResources()
                int r3 = com.bxkj.place.R.color.cardBlue
                int r1 = r1.getColor(r3)
                r5.k(r0, r1)
                goto L104
            Ld1:
                java.lang.String r0 = "3"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto Leb
                int r0 = com.bxkj.place.R.id.tv_name
                com.bxkj.place.apply.PlaceListActivity r1 = r4.k
                android.content.res.Resources r1 = r1.getResources()
                int r3 = com.bxkj.place.R.color.cardYellow
                int r1 = r1.getColor(r3)
                r5.k(r0, r1)
                goto L104
            Leb:
                java.lang.String r0 = "4"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L104
                int r0 = com.bxkj.place.R.id.tv_name
                com.bxkj.place.apply.PlaceListActivity r1 = r4.k
                android.content.res.Resources r1 = r1.getResources()
                int r3 = com.bxkj.place.R.color.color_red
                int r1 = r1.getColor(r3)
                r5.k(r0, r1)
            L104:
                int r0 = com.bxkj.place.R.id.tv_name
                com.bxkj.place.apply.c r1 = new com.bxkj.place.apply.c
                r1.<init>(r4, r2, r6)
                r5.w(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.http.HttpCallBack {
        private com.google.android.material.tabs.TabLayout.OnTabSelectedListener a;
        final /* synthetic */ com.bxkj.place.apply.PlaceListActivity b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements com.google.android.material.tabs.TabLayout.OnTabSelectedListener {
            final /* synthetic */ com.bxkj.place.apply.PlaceListActivity.c a;

            a(com.bxkj.place.apply.PlaceListActivity.c r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public void onTabReselected(com.google.android.material.tabs.TabLayout.Tab r1) {
                    r0 = this;
                    return
            }

            public void onTabSelected(com.google.android.material.tabs.TabLayout.Tab r2) {
                    r1 = this;
                    com.bxkj.place.apply.PlaceListActivity$c r0 = r1.a
                    com.bxkj.place.apply.PlaceListActivity r0 = r0.b
                    java.lang.CharSequence r2 = r2.getText()
                    java.lang.String r2 = r2.toString()
                    java.lang.String r2 = r2.trim()
                    com.bxkj.place.apply.PlaceListActivity.u0(r0, r2)
                    com.bxkj.place.apply.PlaceListActivity$c r2 = r1.a
                    com.bxkj.place.apply.PlaceListActivity r2 = r2.b
                    r2.C0()
                    return
            }

            public void onTabUnselected(com.google.android.material.tabs.TabLayout.Tab r1) {
                    r0 = this;
                    return
            }
        }

        c(com.bxkj.place.apply.PlaceListActivity r1) {
                r0 = this;
                r0.b = r1
                r0.<init>()
                com.bxkj.place.apply.PlaceListActivity$c$a r1 = new com.bxkj.place.apply.PlaceListActivity$c$a
                r1.<init>(r0)
                r0.a = r1
                return
        }

        public void netOnOtherStatus(int r2, java.lang.String r3) {
                r1 = this;
                boolean r2 = android.text.TextUtils.isEmpty(r3)
                if (r2 != 0) goto L18
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.place.apply.PlaceListActivity r0 = r1.b
                android.content.Context r0 = com.bxkj.place.apply.PlaceListActivity.m0(r0)
                r2.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                r2.show()
            L18:
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r1) {
                r0 = this;
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r8, java.lang.String r9) {
                r7 = this;
                boolean r0 = cn.bluemobi.dylan.base.utils.u.b0(r9)
                if (r0 != 0) goto L18
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.place.apply.PlaceListActivity r1 = r7.b
                android.content.Context r1 = com.bxkj.place.apply.PlaceListActivity.v0(r1)
                r0.<init>(r1)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r9 = r0.setMessage(r9)
                r9.show()
            L18:
                com.bxkj.place.apply.PlaceListActivity r9 = r7.b
                android.widget.FrameLayout r9 = r9.P()
                r0 = 0
                r9.setVisibility(r0)
                java.lang.String r9 = "dateList"
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                java.util.List r9 = cn.bluemobi.dylan.http.JsonParse.getList(r8, r9, r1)
                com.bxkj.place.apply.PlaceListActivity r1 = r7.b
                com.google.android.material.tabs.TabLayout r1 = com.bxkj.place.apply.PlaceListActivity.w0(r1)
                r1.clearOnTabSelectedListeners()
                com.bxkj.place.apply.PlaceListActivity r1 = r7.b
                com.google.android.material.tabs.TabLayout r1 = com.bxkj.place.apply.PlaceListActivity.w0(r1)
                r1.removeAllTabs()
                java.util.Iterator r9 = r9.iterator()
            L40:
                boolean r1 = r9.hasNext()
                if (r1 == 0) goto L7b
                java.lang.Object r1 = r9.next()
                java.lang.String r1 = (java.lang.String) r1
                java.lang.String r2 = "/"
                java.lang.String r3 = "\n"
                java.lang.String r1 = r1.replace(r2, r3)
                com.bxkj.place.apply.PlaceListActivity r2 = r7.b
                com.google.android.material.tabs.TabLayout r2 = com.bxkj.place.apply.PlaceListActivity.w0(r2)
                com.google.android.material.tabs.TabLayout$Tab r2 = r2.newTab()
                com.google.android.material.tabs.TabLayout$Tab r2 = r2.setText(r1)
                com.bxkj.place.apply.PlaceListActivity r3 = r7.b
                com.google.android.material.tabs.TabLayout r3 = com.bxkj.place.apply.PlaceListActivity.w0(r3)
                r3.addTab(r2)
                com.bxkj.place.apply.PlaceListActivity r3 = r7.b
                java.lang.String r3 = com.bxkj.place.apply.PlaceListActivity.t0(r3)
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L40
                r2.select()
                goto L40
            L7b:
                com.bxkj.place.apply.PlaceListActivity r9 = r7.b
                com.google.android.material.tabs.TabLayout r9 = com.bxkj.place.apply.PlaceListActivity.w0(r9)
                com.google.android.material.tabs.TabLayout$OnTabSelectedListener r1 = r7.a
                r9.addOnTabSelectedListener(r1)
                com.bxkj.place.apply.PlaceListActivity r9 = r7.b
                java.lang.String r1 = "fieldPlanList"
                java.util.List r8 = cn.bluemobi.dylan.http.JsonParse.getList(r8, r1)
                com.bxkj.place.apply.PlaceListActivity.y0(r9, r8)
                com.bxkj.place.apply.PlaceListActivity r8 = r7.b
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                com.bxkj.place.apply.PlaceListActivity.A0(r8, r9)
                com.bxkj.place.apply.PlaceListActivity r8 = r7.b
                java.util.List r8 = com.bxkj.place.apply.PlaceListActivity.x0(r8)
                java.util.Iterator r8 = r8.iterator()
                r9 = 0
            La6:
                boolean r1 = r8.hasNext()
                java.lang.String r2 = "time"
                if (r1 == 0) goto Ld2
                java.lang.Object r1 = r8.next()
                java.util.Map r1 = (java.util.Map) r1
                com.bxkj.place.apply.PlaceListActivity r3 = r7.b
                java.util.List r3 = com.bxkj.place.apply.PlaceListActivity.z0(r3)
                java.lang.String r4 = "name"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r4)
                r3.add(r4)
                java.util.List r1 = cn.bluemobi.dylan.http.JsonParse.getList(r1, r2)
                int r2 = r1.size()
                if (r2 <= r9) goto La6
                int r9 = r1.size()
                goto La6
            Ld2:
                com.bxkj.place.apply.PlaceListActivity r8 = r7.b
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r8 = com.bxkj.place.apply.PlaceListActivity.B0(r8)
                com.bxkj.place.apply.PlaceListActivity r1 = r7.b
                java.util.List r1 = com.bxkj.place.apply.PlaceListActivity.z0(r1)
                r8.g(r1)
                com.bxkj.place.apply.PlaceListActivity r8 = r7.b
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                com.bxkj.place.apply.PlaceListActivity.r0(r8, r1)
                com.bxkj.place.apply.PlaceListActivity r8 = r7.b
                java.util.List r8 = com.bxkj.place.apply.PlaceListActivity.z0(r8)
                int r8 = r8.size()
                r1 = 0
            Lf6:
                if (r1 >= r9) goto L12c
                r3 = 0
            Lf9:
                if (r3 >= r8) goto L129
                com.bxkj.place.apply.PlaceListActivity r4 = r7.b
                java.util.List r4 = com.bxkj.place.apply.PlaceListActivity.x0(r4)
                java.lang.Object r4 = r4.get(r3)
                java.util.Map r4 = (java.util.Map) r4
                java.util.List r4 = cn.bluemobi.dylan.http.JsonParse.getList(r4, r2)
                androidx.collection.ArrayMap r5 = new androidx.collection.ArrayMap
                r5.<init>()
                int r6 = r4.size()
                if (r1 >= r6) goto L11d
                java.lang.Object r4 = r4.get(r1)
                r5 = r4
                java.util.Map r5 = (java.util.Map) r5
            L11d:
                com.bxkj.place.apply.PlaceListActivity r4 = r7.b
                java.util.List r4 = com.bxkj.place.apply.PlaceListActivity.q0(r4)
                r4.add(r5)
                int r3 = r3 + 1
                goto Lf9
            L129:
                int r1 = r1 + 1
                goto Lf6
            L12c:
                com.bxkj.place.apply.PlaceListActivity r8 = r7.b
                java.util.List r8 = com.bxkj.place.apply.PlaceListActivity.q0(r8)
                int r8 = r8.size()
                if (r8 <= 0) goto L157
                com.bxkj.place.apply.PlaceListActivity r8 = r7.b
                androidx.recyclerview.widget.RecyclerView r8 = com.bxkj.place.apply.PlaceListActivity.l0(r8)
                androidx.recyclerview.widget.GridLayoutManager r9 = new androidx.recyclerview.widget.GridLayoutManager
                com.bxkj.place.apply.PlaceListActivity r1 = r7.b
                android.content.Context r1 = com.bxkj.place.apply.PlaceListActivity.k0(r1)
                com.bxkj.place.apply.PlaceListActivity r2 = r7.b
                java.util.List r2 = com.bxkj.place.apply.PlaceListActivity.z0(r2)
                int r2 = r2.size()
                r3 = 1
                r9.<init>(r1, r2, r3, r0)
                r8.setLayoutManager(r9)
            L157:
                com.bxkj.place.apply.PlaceListActivity r8 = r7.b
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r8 = com.bxkj.place.apply.PlaceListActivity.s0(r8)
                com.bxkj.place.apply.PlaceListActivity r9 = r7.b
                java.util.List r9 = com.bxkj.place.apply.PlaceListActivity.q0(r9)
                r8.g(r9)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d implements androidx.recyclerview.widget.RecyclerView.OnItemTouchListener {
        private int a;
        final /* synthetic */ com.bxkj.place.apply.PlaceListActivity b;

        d(com.bxkj.place.apply.PlaceListActivity r1) {
                r0 = this;
                r0.b = r1
                r0.<init>()
                return
        }

        public boolean onInterceptTouchEvent(androidx.recyclerview.widget.RecyclerView r2, android.view.MotionEvent r3) {
                r1 = this;
                int r0 = r2.getScrollState()
                if (r0 != 0) goto L9
                r1.onTouchEvent(r2, r3)
            L9:
                r2 = 0
                return r2
        }

        public void onRequestDisallowInterceptTouchEvent(boolean r1) {
                r0 = this;
                return
        }

        public void onTouchEvent(androidx.recyclerview.widget.RecyclerView r2, android.view.MotionEvent r3) {
                r1 = this;
                int r0 = r3.getAction()
                if (r0 != 0) goto L22
                com.bxkj.place.apply.PlaceListActivity r0 = r1.b
                androidx.recyclerview.widget.RecyclerView r0 = com.bxkj.place.apply.PlaceListActivity.l0(r0)
                int r0 = r0.getScrollState()
                if (r0 != 0) goto L22
                int r3 = r2.getScrollY()
                r1.a = r3
                com.bxkj.place.apply.PlaceListActivity r3 = r1.b
                com.bxkj.place.view.MyRecyclerViewOnScrollListener r3 = com.bxkj.place.apply.PlaceListActivity.n0(r3)
                r2.addOnScrollListener(r3)
                return
            L22:
                int r3 = r3.getAction()
                r0 = 1
                if (r3 != r0) goto L3a
                int r3 = r2.getScrollY()
                int r0 = r1.a
                if (r3 != r0) goto L3a
                com.bxkj.place.apply.PlaceListActivity r3 = r1.b
                com.bxkj.place.view.MyRecyclerViewOnScrollListener r3 = com.bxkj.place.apply.PlaceListActivity.n0(r3)
                r2.removeOnScrollListener(r3)
            L3a:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e implements androidx.recyclerview.widget.RecyclerView.OnItemTouchListener {
        private int a;
        final /* synthetic */ com.bxkj.place.apply.PlaceListActivity b;

        e(com.bxkj.place.apply.PlaceListActivity r1) {
                r0 = this;
                r0.b = r1
                r0.<init>()
                return
        }

        public boolean onInterceptTouchEvent(androidx.recyclerview.widget.RecyclerView r2, android.view.MotionEvent r3) {
                r1 = this;
                int r0 = r2.getScrollState()
                if (r0 != 0) goto L9
                r1.onTouchEvent(r2, r3)
            L9:
                r2 = 0
                return r2
        }

        public void onRequestDisallowInterceptTouchEvent(boolean r1) {
                r0 = this;
                return
        }

        public void onTouchEvent(androidx.recyclerview.widget.RecyclerView r2, android.view.MotionEvent r3) {
                r1 = this;
                int r0 = r3.getAction()
                if (r0 != 0) goto L22
                com.bxkj.place.apply.PlaceListActivity r0 = r1.b
                androidx.recyclerview.widget.RecyclerView r0 = com.bxkj.place.apply.PlaceListActivity.o0(r0)
                int r0 = r0.getScrollState()
                if (r0 != 0) goto L22
                int r3 = r2.getScrollY()
                r1.a = r3
                com.bxkj.place.apply.PlaceListActivity r3 = r1.b
                com.bxkj.place.view.MyRecyclerViewOnScrollListener r3 = com.bxkj.place.apply.PlaceListActivity.p0(r3)
                r2.addOnScrollListener(r3)
                return
            L22:
                int r3 = r3.getAction()
                r0 = 1
                if (r3 != r0) goto L3a
                int r3 = r2.getScrollY()
                int r0 = r1.a
                if (r3 != r0) goto L3a
                com.bxkj.place.apply.PlaceListActivity r3 = r1.b
                com.bxkj.place.view.MyRecyclerViewOnScrollListener r3 = com.bxkj.place.apply.PlaceListActivity.p0(r3)
                r2.removeOnScrollListener(r3)
            L3a:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class f extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.place.apply.PlaceListActivity a;

        f(com.bxkj.place.apply.PlaceListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r1) {
                r0 = this;
                com.bxkj.place.apply.PlaceListActivity r1 = r0.a
                r1.C0()
                return
        }
    }

    public PlaceListActivity() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.N0 = r0
            return
    }

    static /* synthetic */ java.util.List A0(com.bxkj.place.apply.PlaceListActivity r0, java.util.List r1) {
            r0.G0 = r1
            return r1
    }

    static /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter B0(com.bxkj.place.apply.PlaceListActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.lang.String> r0 = r0.F0
            return r0
    }

    public static /* synthetic */ void g0(com.bxkj.place.apply.PlaceListActivity r0, com.bxkj.base.view.ObservableHorizontalScrollView r1, int r2, int r3, int r4, int r5) {
            androidx.recyclerview.widget.RecyclerView r1 = r0.c0
            com.bxkj.place.view.MyRecyclerViewOnScrollListener r2 = r0.Q0
            r1.removeOnScrollListener(r2)
            androidx.recyclerview.widget.RecyclerView r1 = r0.a0
            com.bxkj.place.view.MyRecyclerViewOnScrollListener r0 = r0.P0
            r1.removeOnScrollListener(r0)
            return
    }

    public static /* synthetic */ void h0(com.bxkj.place.apply.PlaceListActivity r3) {
            android.content.Intent r0 = r3.getIntent()
            android.content.Context r1 = r3.V
            java.lang.Class<com.bxkj.place.apply.ApplyIntroductionActivity> r2 = com.bxkj.place.apply.ApplyIntroductionActivity.class
            android.content.Intent r0 = r0.setClass(r1, r2)
            r3.startActivity(r0)
            return
    }

    static /* synthetic */ android.widget.TextView i0(com.bxkj.place.apply.PlaceListActivity r0) {
            android.widget.TextView r0 = r0.Y
            return r0
    }

    static /* synthetic */ android.widget.Button j0(com.bxkj.place.apply.PlaceListActivity r0) {
            android.widget.Button r0 = r0.H0
            return r0
    }

    static /* synthetic */ android.content.Context k0(com.bxkj.place.apply.PlaceListActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ androidx.recyclerview.widget.RecyclerView l0(com.bxkj.place.apply.PlaceListActivity r0) {
            androidx.recyclerview.widget.RecyclerView r0 = r0.c0
            return r0
    }

    static /* synthetic */ android.content.Context m0(com.bxkj.place.apply.PlaceListActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ com.bxkj.place.view.MyRecyclerViewOnScrollListener n0(com.bxkj.place.apply.PlaceListActivity r0) {
            com.bxkj.place.view.MyRecyclerViewOnScrollListener r0 = r0.P0
            return r0
    }

    static /* synthetic */ androidx.recyclerview.widget.RecyclerView o0(com.bxkj.place.apply.PlaceListActivity r0) {
            androidx.recyclerview.widget.RecyclerView r0 = r0.a0
            return r0
    }

    static /* synthetic */ com.bxkj.place.view.MyRecyclerViewOnScrollListener p0(com.bxkj.place.apply.PlaceListActivity r0) {
            com.bxkj.place.view.MyRecyclerViewOnScrollListener r0 = r0.Q0
            return r0
    }

    static /* synthetic */ java.util.List q0(com.bxkj.place.apply.PlaceListActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.f681p0
            return r0
    }

    static /* synthetic */ java.util.List r0(com.bxkj.place.apply.PlaceListActivity r0, java.util.List r1) {
            r0.f681p0 = r1
            return r1
    }

    static /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter s0(com.bxkj.place.apply.PlaceListActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.I0
            return r0
    }

    static /* synthetic */ java.lang.String t0(com.bxkj.place.apply.PlaceListActivity r0) {
            java.lang.String r0 = r0.N0
            return r0
    }

    static /* synthetic */ java.lang.String u0(com.bxkj.place.apply.PlaceListActivity r0, java.lang.String r1) {
            r0.N0 = r1
            return r1
    }

    static /* synthetic */ android.content.Context v0(com.bxkj.place.apply.PlaceListActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ com.google.android.material.tabs.TabLayout w0(com.bxkj.place.apply.PlaceListActivity r0) {
            com.google.android.material.tabs.TabLayout r0 = r0.Z
            return r0
    }

    static /* synthetic */ java.util.List x0(com.bxkj.place.apply.PlaceListActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.J0
            return r0
    }

    static /* synthetic */ java.util.List y0(com.bxkj.place.apply.PlaceListActivity r0, java.util.List r1) {
            r0.J0 = r1
            return r1
    }

    static /* synthetic */ java.util.List z0(com.bxkj.place.apply.PlaceListActivity r0) {
            java.util.List<java.lang.String> r0 = r0.G0
            return r0
    }

    public void C0() {
            r6 = this;
            android.widget.TextView r0 = r6.Y
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r0 = r6.Y
            java.lang.String r1 = ""
            r0.setText(r1)
            android.widget.TextView r0 = r6.Y
            r1 = 0
            r0.setTag(r1)
            android.widget.Button r0 = r6.H0
            r1 = 0
            r0.setEnabled(r1)
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy-MM-dd"
            r0.<init>(r1)
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            java.lang.String r1 = r0.format(r1)
            com.google.android.material.tabs.TabLayout r2 = r6.Z
            int r3 = r2.getSelectedTabPosition()
            com.google.android.material.tabs.TabLayout$Tab r2 = r2.getTabAt(r3)
            if (r2 == 0) goto L54
            com.google.android.material.tabs.TabLayout r2 = r6.Z     // Catch: java.text.ParseException -> L54
            int r3 = r2.getSelectedTabPosition()     // Catch: java.text.ParseException -> L54
            com.google.android.material.tabs.TabLayout$Tab r2 = r2.getTabAt(r3)     // Catch: java.text.ParseException -> L54
            java.lang.CharSequence r2 = r2.getText()     // Catch: java.text.ParseException -> L54
            java.lang.String r2 = r2.toString()     // Catch: java.text.ParseException -> L54
            java.lang.String r2 = r2.trim()     // Catch: java.text.ParseException -> L54
            java.util.Date r2 = r0.parse(r2)     // Catch: java.text.ParseException -> L54
            java.lang.String r1 = r0.format(r2)     // Catch: java.text.ParseException -> L54
        L54:
            android.content.Context r0 = r6.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideSuccessMessage()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideOtherStatusMessage()
            java.lang.Class<c0.b> r2 = c0.b.class
            java.lang.Object r2 = cn.bluemobi.dylan.http.Http.getApiService(r2)
            c0.b r2 = (c0.b) r2
            com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r3 = r3.getUserId()
            int r4 = r6.K0
            java.lang.String r5 = r6.M0
            rx.e r1 = r2.g(r3, r4, r5, r1)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.place.apply.PlaceListActivity$c r1 = new com.bxkj.place.apply.PlaceListActivity$c
            r1.<init>(r6)
            r0.setDataListener(r1)
            return
    }

    public void L() {
            r2 = this;
            com.bxkj.place.view.MyRecyclerViewOnScrollListener r0 = new com.bxkj.place.view.MyRecyclerViewOnScrollListener
            androidx.recyclerview.widget.RecyclerView r1 = r2.c0
            r0.<init>(r1)
            r2.P0 = r0
            com.bxkj.place.view.MyRecyclerViewOnScrollListener r0 = new com.bxkj.place.view.MyRecyclerViewOnScrollListener
            androidx.recyclerview.widget.RecyclerView r1 = r2.a0
            r0.<init>(r1)
            r2.Q0 = r0
            androidx.recyclerview.widget.RecyclerView r0 = r2.a0
            com.bxkj.place.apply.PlaceListActivity$d r1 = new com.bxkj.place.apply.PlaceListActivity$d
            r1.<init>(r2)
            r0.addOnItemTouchListener(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r2.c0
            com.bxkj.place.apply.PlaceListActivity$e r1 = new com.bxkj.place.apply.PlaceListActivity$e
            r1.<init>(r2)
            r0.addOnItemTouchListener(r1)
            com.bxkj.base.view.ObservableHorizontalScrollView r0 = r2.f680k0
            com.bxkj.place.apply.b r1 = new com.bxkj.place.apply.b
            r1.<init>(r2)
            r0.setScrollViewListener(r1)
            android.widget.Button r0 = r2.H0
            r0.setOnClickListener(r2)
            return
    }

    protected int N() {
            r1 = this;
            int r0 = com.bxkj.place.R.layout.ac_place_list
            return r0
    }

    public void R() {
            r4 = this;
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "id"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L16
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r4.M0 = r0
        L16:
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "appointType"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L2d
            android.content.Intent r0 = r4.getIntent()
            r2 = 1
            int r0 = r0.getIntExtra(r1, r2)
            r4.K0 = r0
        L2d:
            android.widget.Button r0 = r4.H0
            int r1 = r4.K0
            r2 = 2
            if (r1 != r2) goto L37
            java.lang.String r1 = "立即申请"
            goto L39
        L37:
            java.lang.String r1 = "立即预约"
        L39:
            r0.setText(r1)
            int r0 = r4.K0
            if (r0 != r2) goto L43
            java.lang.String r1 = "申请"
            goto L45
        L43:
            java.lang.String r1 = "立预约"
        L45:
            r4.L0 = r1
            if (r0 != r2) goto L4c
            java.lang.String r0 = "申请场地"
            goto L4e
        L4c:
            java.lang.String r0 = "预约场地"
        L4e:
            r4.setTitle(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r4.b0
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r4.V
            r3 = 0
            r1.<init>(r2, r3, r3)
            r0.setLayoutManager(r1)
            com.bxkj.place.apply.PlaceListActivity$a r0 = new com.bxkj.place.apply.PlaceListActivity$a
            android.content.Context r1 = r4.V
            int r2 = com.bxkj.place.R.layout.item_for_place_name
            java.util.List<java.lang.String> r3 = r4.G0
            r0.<init>(r4, r1, r2, r3)
            r4.F0 = r0
            androidx.recyclerview.widget.RecyclerView r1 = r4.b0
            r1.setAdapter(r0)
            com.bxkj.place.apply.PlaceListActivity$b r0 = new com.bxkj.place.apply.PlaceListActivity$b
            android.content.Context r1 = r4.V
            int r2 = com.bxkj.place.R.layout.item_for_place_checked
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.f681p0
            r0.<init>(r4, r1, r2, r3)
            r4.I0 = r0
            androidx.recyclerview.widget.RecyclerView r1 = r4.c0
            r1.setAdapter(r0)
            r4.C0()
            return
    }

    public void S() {
            r2 = this;
            java.lang.String r0 = "申请场地"
            r2.setTitle(r0)
            int r0 = com.bxkj.place.R.mipmap.help
            com.bxkj.place.apply.a r1 = new com.bxkj.place.apply.a
            r1.<init>(r2)
            r2.Z(r0, r1)
            return
    }

    public void T(android.os.Bundle r2) {
            r1 = this;
            int r2 = com.bxkj.place.R.id.tv_order
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.Y = r2
            int r2 = com.bxkj.place.R.id.tb_date
            android.view.View r2 = r1.findViewById(r2)
            com.google.android.material.tabs.TabLayout r2 = (com.google.android.material.tabs.TabLayout) r2
            r1.Z = r2
            int r2 = com.bxkj.place.R.id.rv_top
            android.view.View r2 = r1.findViewById(r2)
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            r1.b0 = r2
            int r2 = com.bxkj.place.R.id.recyclerView
            android.view.View r2 = r1.findViewById(r2)
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            r1.c0 = r2
            int r2 = com.bxkj.place.R.id.rv_left
            android.view.View r2 = r1.findViewById(r2)
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            r1.a0 = r2
            int r2 = com.bxkj.place.R.id.hs
            android.view.View r2 = r1.findViewById(r2)
            com.bxkj.base.view.ObservableHorizontalScrollView r2 = (com.bxkj.base.view.ObservableHorizontalScrollView) r2
            r1.f680k0 = r2
            int r2 = com.bxkj.place.R.id.bt_ok
            android.view.View r2 = r1.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            r1.H0 = r2
            android.widget.FrameLayout r2 = r1.P()
            r0 = 4
            r2.setVisibility(r0)
            return
    }

    public void onClick(android.view.View r9) {
            r8 = this;
            int r9 = r9.getId()
            int r0 = com.bxkj.place.R.id.bt_ok
            if (r9 != r0) goto L9d
            android.widget.Button r9 = r8.H0
            java.lang.Object r9 = r9.getTag()
            if (r9 != 0) goto L12
            goto L9d
        L12:
            android.widget.Button r9 = r8.H0
            java.lang.Object r9 = r9.getTag()
            java.lang.String r9 = r9.toString()
            java.lang.String r9 = r9.trim()
            java.lang.String r0 = "1"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L67
            int r9 = r8.K0
            r0 = 2
            if (r9 != r0) goto L2e
            goto L67
        L2e:
            android.content.Context r9 = r8.V
            cn.bluemobi.dylan.http.HttpRequest r9 = cn.bluemobi.dylan.http.Http.with(r9)
            java.lang.Class<c0.b> r0 = c0.b.class
            java.lang.Object r0 = cn.bluemobi.dylan.http.Http.getApiService(r0)
            r1 = r0
            c0.b r1 = (c0.b) r1
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r0.getUserId()
            android.widget.TextView r0 = r8.Y
            java.lang.Object r0 = r0.getTag()
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            int r6 = r8.K0
            java.lang.String r7 = "1"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            rx.e r0 = r1.h(r2, r3, r4, r5, r6, r7)
            cn.bluemobi.dylan.http.HttpRequest r9 = r9.setObservable(r0)
            com.bxkj.place.apply.PlaceListActivity$f r0 = new com.bxkj.place.apply.PlaceListActivity$f
            r0.<init>(r8)
            r9.setDataListener(r0)
            return
        L67:
            android.content.Intent r9 = new android.content.Intent
            android.content.Context r0 = r8.V
            java.lang.Class<com.bxkj.place.apply.ApplyPlaceActivity> r1 = com.bxkj.place.apply.ApplyPlaceActivity.class
            r9.<init>(r0, r1)
            com.google.android.material.tabs.TabLayout r0 = r8.Z
            int r1 = r0.getSelectedTabPosition()
            com.google.android.material.tabs.TabLayout$Tab r0 = r0.getTabAt(r1)
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r1 = "date"
            android.content.Intent r9 = r9.putExtra(r1, r0)
            android.widget.TextView r0 = r8.Y
            java.lang.Object r0 = r0.getTag()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "id"
            android.content.Intent r9 = r9.putExtra(r1, r0)
            java.lang.String r0 = "appointType"
            int r1 = r8.K0
            android.content.Intent r9 = r9.putExtra(r0, r1)
            r8.startActivity(r9)
        L9d:
            return
    }
}
