package com.bxkj.student.home;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class HomeMenuListActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> F0;
    private com.bxkj.student.main.HomeFragment G0;
    private androidx.recyclerview.widget.ItemTouchHelper H0;
    private final java.lang.String Y;
    private androidx.recyclerview.widget.RecyclerView Z;
    private androidx.recyclerview.widget.RecyclerView a0;
    private android.widget.Button b0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> c0;

    /* renamed from: k0, reason: collision with root package name */
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> f769k0;

    /* renamed from: p0, reason: collision with root package name */
    private boolean f770p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends androidx.recyclerview.widget.ItemTouchHelper.Callback {
        final /* synthetic */ com.bxkj.student.home.HomeMenuListActivity a;

        a(com.bxkj.student.home.HomeMenuListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void clearView(androidx.recyclerview.widget.RecyclerView r3, androidx.recyclerview.widget.RecyclerView.ViewHolder r4) {
                r2 = this;
                android.view.View r0 = r4.itemView
                r1 = -1
                r0.setBackgroundColor(r1)
                super.clearView(r3, r4)
                return
        }

        public int getMovementFlags(androidx.recyclerview.widget.RecyclerView r4, androidx.recyclerview.widget.RecyclerView.ViewHolder r5) {
                r3 = this;
                int r0 = r5.getItemViewType()
                r1 = 1
                r2 = 0
                if (r0 == r1) goto L54
                int r0 = r5.getItemViewType()
                int r1 = r5.getItemViewType()
                if (r0 != r1) goto L54
                com.bxkj.student.home.HomeMenuListActivity r0 = r3.a
                boolean r0 = com.bxkj.student.home.HomeMenuListActivity.k0(r0)
                if (r0 == 0) goto L54
                int r0 = r5.getAdapterPosition()
                com.bxkj.student.home.HomeMenuListActivity r1 = r3.a
                java.util.List r1 = com.bxkj.student.home.HomeMenuListActivity.j0(r1)
                int r1 = r1.size()
                if (r0 >= r1) goto L54
                com.bxkj.student.home.HomeMenuListActivity r0 = r3.a
                java.util.List r0 = com.bxkj.student.home.HomeMenuListActivity.j0(r0)
                int r5 = r5.getAdapterPosition()
                java.lang.Object r5 = r0.get(r5)
                java.util.Map r5 = (java.util.Map) r5
                java.lang.String r0 = "name"
                java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r0)
                boolean r5 = r5.isEmpty()
                if (r5 == 0) goto L47
                goto L54
            L47:
                androidx.recyclerview.widget.RecyclerView$LayoutManager r4 = r4.getLayoutManager()
                boolean r4 = r4 instanceof androidx.recyclerview.widget.GridLayoutManager
                if (r4 == 0) goto L52
                r4 = 15
                goto L55
            L52:
                r4 = 3
                goto L55
            L54:
                r4 = 0
            L55:
                int r4 = androidx.recyclerview.widget.ItemTouchHelper.Callback.makeMovementFlags(r4, r2)
                return r4
        }

        public boolean isLongPressDragEnabled() {
                r3 = this;
                com.bxkj.student.home.HomeMenuListActivity r0 = r3.a
                boolean r0 = com.bxkj.student.home.HomeMenuListActivity.k0(r0)
                if (r0 == 0) goto L1d
                com.bxkj.student.home.HomeMenuListActivity r0 = r3.a
                android.content.Context r0 = com.bxkj.student.home.HomeMenuListActivity.m0(r0)
                java.lang.String r1 = "vibrator"
                java.lang.Object r0 = r0.getSystemService(r1)
                android.os.Vibrator r0 = (android.os.Vibrator) r0
                r1 = 500(0x1f4, double:2.47E-321)
                r0.vibrate(r1)
                r0 = 1
                return r0
            L1d:
                r0 = 0
                return r0
        }

        public boolean onMove(androidx.recyclerview.widget.RecyclerView r3, androidx.recyclerview.widget.RecyclerView.ViewHolder r4, androidx.recyclerview.widget.RecyclerView.ViewHolder r5) {
                r2 = this;
                int r3 = r4.getAdapterPosition()
                int r4 = r5.getAdapterPosition()
                com.bxkj.student.home.HomeMenuListActivity r5 = r2.a
                java.util.List r5 = com.bxkj.student.home.HomeMenuListActivity.j0(r5)
                java.lang.Object r5 = r5.get(r3)
                java.util.Map r5 = (java.util.Map) r5
                java.lang.String r0 = "name"
                java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r0)
                boolean r5 = r5.isEmpty()
                r1 = 0
                if (r5 == 0) goto L22
                return r1
            L22:
                com.bxkj.student.home.HomeMenuListActivity r5 = r2.a
                java.util.List r5 = com.bxkj.student.home.HomeMenuListActivity.j0(r5)
                java.lang.Object r5 = r5.get(r4)
                java.util.Map r5 = (java.util.Map) r5
                java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r0)
                boolean r5 = r5.isEmpty()
                if (r5 == 0) goto L39
                return r1
            L39:
                if (r3 >= r4) goto L4b
                r5 = r3
            L3c:
                if (r5 >= r4) goto L5c
                com.bxkj.student.home.HomeMenuListActivity r0 = r2.a
                java.util.List r0 = com.bxkj.student.home.HomeMenuListActivity.j0(r0)
                int r1 = r5 + 1
                java.util.Collections.swap(r0, r5, r1)
                r5 = r1
                goto L3c
            L4b:
                r5 = r3
            L4c:
                if (r5 <= r4) goto L5c
                com.bxkj.student.home.HomeMenuListActivity r0 = r2.a
                java.util.List r0 = com.bxkj.student.home.HomeMenuListActivity.j0(r0)
                int r1 = r5 + (-1)
                java.util.Collections.swap(r0, r5, r1)
                int r5 = r5 + (-1)
                goto L4c
            L5c:
                com.bxkj.student.home.HomeMenuListActivity r5 = r2.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r5 = com.bxkj.student.home.HomeMenuListActivity.h0(r5)
                r5.notifyItemMoved(r3, r4)
                r3 = 1
                return r3
        }

        public void onSelectedChanged(androidx.recyclerview.widget.RecyclerView.ViewHolder r3, int r4) {
                r2 = this;
                if (r4 == 0) goto La
                android.view.View r0 = r3.itemView
                r1 = -3355444(0xffffffffffcccccc, float:NaN)
                r0.setBackgroundColor(r1)
            La:
                super.onSelectedChanged(r3, r4)
                return
        }

        public void onSwiped(androidx.recyclerview.widget.RecyclerView.ViewHolder r1, int r2) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.home.HomeMenuListActivity k;

        b(com.bxkj.student.home.HomeMenuListActivity r1, android.content.Context r2, int r3, java.util.List r4) {
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
                com.bxkj.student.home.HomeMenuListActivity r0 = r2.k
                java.lang.String r1 = "icon"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                int r4 = r0.u0(r4)
                r0 = 2131297155(0x7f090383, float:1.8212247E38)
                r3.r(r0, r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends com.bxkj.student.common.utils.UniversalItemDecoration {
        final /* synthetic */ com.bxkj.student.home.HomeMenuListActivity g;

        c(com.bxkj.student.home.HomeMenuListActivity r1) {
                r0 = this;
                r0.g = r1
                r0.<init>()
                return
        }

        @Override // com.bxkj.student.common.utils.UniversalItemDecoration
        public com.bxkj.student.common.utils.UniversalItemDecoration.b a(int r3) {
                r2 = this;
                com.bxkj.student.common.utils.UniversalItemDecoration$a r3 = new com.bxkj.student.common.utils.UniversalItemDecoration$a
                r3.<init>()
                com.bxkj.student.home.HomeMenuListActivity r0 = r2.g
                android.content.Context r0 = com.bxkj.student.home.HomeMenuListActivity.n0(r0)
                r1 = 1088421888(0x40e00000, float:7.0)
                int r0 = cn.bluemobi.dylan.base.utils.u.a(r1, r0)
                r3.a = r0
                r0 = -1
                r3.f = r0
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d implements cn.bluemobi.dylan.base.adapter.common.recyclerview.a<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.student.home.HomeMenuListActivity a;

        d(com.bxkj.student.home.HomeMenuListActivity r1) {
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
                r2 = 2131493259(0x7f0c018b, float:1.8609993E38)
                return r2
            L7:
                r2 = 2131493260(0x7f0c018c, float:1.8609995E38)
                return r2
        }

        public int c(int r1, java.util.Map<java.lang.String, java.lang.Object> r2) {
                r0 = this;
                java.lang.String r1 = "type"
                int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r2, r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e extends cn.bluemobi.dylan.base.adapter.common.recyclerview.MultiItemCommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ com.bxkj.student.home.HomeMenuListActivity f771l;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a extends androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup {
            final /* synthetic */ com.bxkj.student.home.HomeMenuListActivity.e a;

            a(com.bxkj.student.home.HomeMenuListActivity.e r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public int getSpanSize(int r2) {
                    r1 = this;
                    com.bxkj.student.home.HomeMenuListActivity$e r0 = r1.a
                    int r2 = r0.getItemViewType(r2)
                    r0 = 1
                    if (r2 == r0) goto La
                    return r0
                La:
                    r2 = 4
                    return r2
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class b implements android.view.View.OnClickListener {
            final /* synthetic */ java.util.Map a;
            final /* synthetic */ cn.bluemobi.dylan.base.adapter.common.ViewHolder b;
            final /* synthetic */ com.bxkj.student.home.HomeMenuListActivity.e c;

            b(com.bxkj.student.home.HomeMenuListActivity.e r1, java.util.Map r2, cn.bluemobi.dylan.base.adapter.common.ViewHolder r3) {
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
                    com.bxkj.student.home.HomeMenuListActivity$e r3 = r2.c
                    java.util.Map r0 = r2.a
                    cn.bluemobi.dylan.base.adapter.common.ViewHolder r1 = r2.b
                    com.bxkj.student.home.HomeMenuListActivity.e.n(r3, r0, r1)
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class c implements android.view.View.OnClickListener {
            final /* synthetic */ int a;
            final /* synthetic */ com.bxkj.student.home.HomeMenuListActivity.e b;

            c(com.bxkj.student.home.HomeMenuListActivity.e r1, int r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r2) {
                    r1 = this;
                    com.bxkj.student.home.HomeMenuListActivity$e r2 = r1.b
                    int r0 = r1.a
                    com.bxkj.student.home.HomeMenuListActivity.e.o(r2, r0)
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class d implements android.view.View.OnClickListener {
            final /* synthetic */ java.util.Map a;
            final /* synthetic */ com.bxkj.student.home.HomeMenuListActivity.e b;

            d(com.bxkj.student.home.HomeMenuListActivity.e r1, java.util.Map r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r2) {
                    r1 = this;
                    com.bxkj.student.home.HomeMenuListActivity$e r2 = r1.b
                    java.util.Map r0 = r1.a
                    com.bxkj.student.home.HomeMenuListActivity.e.m(r2, r0)
                    return
            }
        }

        e(com.bxkj.student.home.HomeMenuListActivity r1, android.content.Context r2, java.util.List r3, cn.bluemobi.dylan.base.adapter.common.recyclerview.a r4) {
                r0 = this;
                r0.f771l = r1
                r0.<init>(r2, r3, r4)
                return
        }

        static /* bridge */ /* synthetic */ void m(com.bxkj.student.home.HomeMenuListActivity.e r0, java.util.Map r1) {
                r0.p(r1)
                return
        }

        static /* bridge */ /* synthetic */ void n(com.bxkj.student.home.HomeMenuListActivity.e r0, java.util.Map r1, cn.bluemobi.dylan.base.adapter.common.ViewHolder r2) {
                r0.r(r1, r2)
                return
        }

        static /* bridge */ /* synthetic */ void o(com.bxkj.student.home.HomeMenuListActivity.e r0, int r1) {
                r0.s(r1)
                return
        }

        private void p(java.util.Map<java.lang.String, java.lang.Object> r5) {
                r4 = this;
                com.bxkj.student.home.HomeMenuListActivity r0 = r4.f771l
                java.util.List r0 = com.bxkj.student.home.HomeMenuListActivity.j0(r0)
                int r0 = r0.size()
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>(r5)
                r5 = -1
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.String r2 = "groupType"
                r1.put(r2, r5)
                r5 = 12
                if (r0 != r5) goto L63
                com.bxkj.student.home.HomeMenuListActivity r2 = r4.f771l
                java.util.List r2 = com.bxkj.student.home.HomeMenuListActivity.j0(r2)
                com.bxkj.student.home.HomeMenuListActivity r3 = r4.f771l
                java.util.List r3 = com.bxkj.student.home.HomeMenuListActivity.j0(r3)
                int r3 = r3.size()
                int r3 = r3 + (-1)
                java.lang.Object r2 = r2.get(r3)
                java.util.Map r2 = (java.util.Map) r2
                java.lang.String r3 = "name"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r3)
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L63
                com.bxkj.student.home.HomeMenuListActivity r5 = r4.f771l
                java.util.List r5 = com.bxkj.student.home.HomeMenuListActivity.j0(r5)
                int r0 = r0 + (-1)
                r5.set(r0, r1)
                com.bxkj.student.home.HomeMenuListActivity r5 = r4.f771l
                java.util.List r5 = com.bxkj.student.home.HomeMenuListActivity.i0(r5)
                r5.set(r0, r1)
                com.bxkj.student.home.HomeMenuListActivity r5 = r4.f771l
                java.util.List r5 = com.bxkj.student.home.HomeMenuListActivity.i0(r5)
                int r5 = r5.size()
                r4.notifyItemRangeChanged(r0, r5)
                return
            L63:
                if (r0 >= r5) goto L8c
                com.bxkj.student.home.HomeMenuListActivity r5 = r4.f771l
                java.util.List r5 = com.bxkj.student.home.HomeMenuListActivity.j0(r5)
                int r2 = r0 + (-1)
                r5.add(r2, r1)
                com.bxkj.student.home.HomeMenuListActivity r5 = r4.f771l
                java.util.List r5 = com.bxkj.student.home.HomeMenuListActivity.i0(r5)
                r5.add(r2, r1)
                int r0 = r0 + (-2)
                r4.notifyItemInserted(r0)
                com.bxkj.student.home.HomeMenuListActivity r5 = r4.f771l
                java.util.List r5 = com.bxkj.student.home.HomeMenuListActivity.i0(r5)
                int r5 = r5.size()
                r4.notifyItemRangeChanged(r0, r5)
                return
            L8c:
                com.bxkj.student.home.HomeMenuListActivity r5 = r4.f771l
                java.lang.String r0 = "首页最多添加11个应用"
                r5.f0(r0)
                return
        }

        private void r(java.util.Map<java.lang.String, java.lang.Object> r3, cn.bluemobi.dylan.base.adapter.common.ViewHolder r4) {
                r2 = this;
                com.bxkj.student.home.HomeMenuListActivity r0 = r2.f771l
                java.util.List r0 = com.bxkj.student.home.HomeMenuListActivity.i0(r0)
                r0.remove(r3)
                com.bxkj.student.home.HomeMenuListActivity r0 = r2.f771l
                java.util.List r0 = com.bxkj.student.home.HomeMenuListActivity.j0(r0)
                r0.remove(r3)
                com.bxkj.student.home.HomeMenuListActivity r3 = r2.f771l
                java.util.List r3 = com.bxkj.student.home.HomeMenuListActivity.j0(r3)
                com.bxkj.student.home.HomeMenuListActivity r0 = r2.f771l
                java.util.List r0 = com.bxkj.student.home.HomeMenuListActivity.j0(r0)
                int r0 = r0.size()
                int r0 = r0 + (-1)
                java.lang.Object r3 = r3.get(r0)
                java.util.Map r3 = (java.util.Map) r3
                java.lang.String r0 = "name"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r0)
                boolean r3 = r3.isEmpty()
                if (r3 != 0) goto L68
                androidx.collection.ArrayMap r3 = new androidx.collection.ArrayMap
                r3.<init>()
                java.lang.String r1 = ""
                r3.put(r0, r1)
                r0 = 2
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                java.lang.String r1 = "type"
                r3.put(r1, r0)
                com.bxkj.student.home.HomeMenuListActivity r0 = r2.f771l
                java.util.List r0 = com.bxkj.student.home.HomeMenuListActivity.j0(r0)
                r0.add(r3)
                com.bxkj.student.home.HomeMenuListActivity r0 = r2.f771l
                java.util.List r0 = com.bxkj.student.home.HomeMenuListActivity.i0(r0)
                com.bxkj.student.home.HomeMenuListActivity r1 = r2.f771l
                java.util.List r1 = com.bxkj.student.home.HomeMenuListActivity.j0(r1)
                int r1 = r1.size()
                int r1 = r1 + (-1)
                r0.add(r1, r3)
            L68:
                int r3 = r4.f()
                r2.notifyItemRemoved(r3)
                int r3 = r4.f()
                com.bxkj.student.home.HomeMenuListActivity r4 = r2.f771l
                java.util.List r4 = com.bxkj.student.home.HomeMenuListActivity.i0(r4)
                int r4 = r4.size()
                r2.notifyItemRangeChanged(r3, r4)
                return
        }

        private void s(int r4) {
                r3 = this;
                com.bxkj.student.home.HomeMenuListActivity r0 = r3.f771l
                java.util.List r0 = com.bxkj.student.home.HomeMenuListActivity.i0(r0)
                r0.remove(r4)
                com.bxkj.student.home.HomeMenuListActivity r0 = r3.f771l
                java.util.List r0 = com.bxkj.student.home.HomeMenuListActivity.j0(r0)
                r0.remove(r4)
                com.bxkj.student.home.HomeMenuListActivity r0 = r3.f771l
                java.util.List r0 = com.bxkj.student.home.HomeMenuListActivity.j0(r0)
                com.bxkj.student.home.HomeMenuListActivity r1 = r3.f771l
                java.util.List r1 = com.bxkj.student.home.HomeMenuListActivity.j0(r1)
                int r1 = r1.size()
                int r1 = r1 + (-1)
                java.lang.Object r0 = r0.get(r1)
                java.util.Map r0 = (java.util.Map) r0
                java.lang.String r1 = "name"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r1)
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L68
                androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
                r0.<init>()
                java.lang.String r2 = ""
                r0.put(r1, r2)
                r1 = 2
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.String r2 = "type"
                r0.put(r2, r1)
                com.bxkj.student.home.HomeMenuListActivity r1 = r3.f771l
                java.util.List r1 = com.bxkj.student.home.HomeMenuListActivity.j0(r1)
                r1.add(r0)
                com.bxkj.student.home.HomeMenuListActivity r1 = r3.f771l
                java.util.List r1 = com.bxkj.student.home.HomeMenuListActivity.i0(r1)
                com.bxkj.student.home.HomeMenuListActivity r2 = r3.f771l
                java.util.List r2 = com.bxkj.student.home.HomeMenuListActivity.j0(r2)
                int r2 = r2.size()
                int r2 = r2 + (-1)
                r1.add(r2, r0)
            L68:
                r3.notifyItemRemoved(r4)
                com.bxkj.student.home.HomeMenuListActivity r0 = r3.f771l
                java.util.List r0 = com.bxkj.student.home.HomeMenuListActivity.i0(r0)
                int r0 = r0.size()
                r3.notifyItemRangeChanged(r4, r0)
                return
        }

        public /* bridge */ /* synthetic */ void c(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.lang.Object r2) {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                r0.q(r1, r2)
                return
        }

        public void onAttachedToRecyclerView(androidx.recyclerview.widget.RecyclerView r2) {
                r1 = this;
                super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onAttachedToRecyclerView(r2)
                androidx.recyclerview.widget.RecyclerView$LayoutManager r2 = r2.getLayoutManager()
                boolean r0 = r2 instanceof androidx.recyclerview.widget.GridLayoutManager
                if (r0 == 0) goto L15
                androidx.recyclerview.widget.GridLayoutManager r2 = (androidx.recyclerview.widget.GridLayoutManager) r2
                com.bxkj.student.home.HomeMenuListActivity$e$a r0 = new com.bxkj.student.home.HomeMenuListActivity$e$a
                r0.<init>(r1)
                r2.setSpanSizeLookup(r0)
            L15:
                return
        }

        public void q(cn.bluemobi.dylan.base.adapter.common.ViewHolder r11, java.util.Map<java.lang.String, java.lang.Object> r12) {
                r10 = this;
                java.lang.String r0 = "name"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r12, r0)
                java.lang.String r1 = "首页应用"
                boolean r1 = r0.equals(r1)
                r2 = 2131298986(0x7f090aaa, float:1.821596E38)
                if (r1 == 0) goto L4d
                android.text.SpannableString r1 = new android.text.SpannableString
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r0)
                java.lang.String r4 = "(按住拖动调整顺序)"
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                r1.<init>(r3)
                android.text.style.ForegroundColorSpan r3 = new android.text.style.ForegroundColorSpan
                com.bxkj.student.home.HomeMenuListActivity r4 = r10.f771l
                android.content.res.Resources r4 = r4.getResources()
                r5 = 2131099821(0x7f0600ad, float:1.7812006E38)
                int r4 = r4.getColor(r5)
                r3.<init>(r4)
                int r4 = r1.length()
                r5 = 34
                r6 = 4
                r1.setSpan(r3, r6, r4, r5)
                android.view.View r3 = r11.h(r2)
                android.widget.TextView r3 = (android.widget.TextView) r3
                r3.setText(r1)
                goto L50
            L4d:
                r11.J(r2, r0)
            L50:
                int r1 = r11.f()
                int r1 = r10.getItemViewType(r1)
                r3 = 2
                if (r1 != r3) goto L131
                boolean r1 = android.text.TextUtils.isEmpty(r0)
                r3 = -1
                r4 = 1
                r5 = 2131297155(0x7f090383, float:1.8212247E38)
                r6 = 0
                r7 = 2131297201(0x7f0903b1, float:1.821234E38)
                if (r1 == 0) goto La1
                r11.N(r2, r6)
                r11.N(r5, r6)
                r11.N(r7, r6)
                r1 = 1112014848(0x42480000, float:50.0)
                android.content.Context r2 = r10.e
                int r1 = cn.bluemobi.dylan.base.utils.u.a(r1, r2)
                androidx.recyclerview.widget.GridLayoutManager$LayoutParams r2 = new androidx.recyclerview.widget.GridLayoutManager$LayoutParams
                r2.<init>(r3, r1)
                r1 = 1092616192(0x41200000, float:10.0)
                android.content.Context r8 = r10.e
                int r1 = cn.bluemobi.dylan.base.utils.u.a(r1, r8)
                r8 = 1097859072(0x41700000, float:15.0)
                android.content.Context r9 = r10.e
                int r8 = cn.bluemobi.dylan.base.utils.u.a(r8, r9)
                r2.setMargins(r8, r1, r8, r1)
                android.view.View r1 = r11.itemView
                r1.setLayoutParams(r2)
                android.view.View r1 = r11.itemView
                r2 = 2131231959(0x7f0804d7, float:1.8080014E38)
                r1.setBackgroundResource(r2)
                goto Lc1
            La1:
                r11.N(r2, r4)
                r11.N(r5, r4)
                r11.N(r7, r4)
                androidx.recyclerview.widget.GridLayoutManager$LayoutParams r1 = new androidx.recyclerview.widget.GridLayoutManager$LayoutParams
                r2 = 1116471296(0x428c0000, float:70.0)
                android.content.Context r8 = r10.e
                int r2 = cn.bluemobi.dylan.base.utils.u.a(r2, r8)
                r1.<init>(r3, r2)
                android.view.View r2 = r11.itemView
                r2.setLayoutParams(r1)
                android.view.View r1 = r11.itemView
                r1.setBackgroundColor(r6)
            Lc1:
                java.lang.String r1 = "icon"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r12, r1)
                boolean r2 = r2.isEmpty()
                if (r2 != 0) goto Lde
                r11.N(r5, r4)
                com.bxkj.student.home.HomeMenuListActivity r2 = r10.f771l
                java.lang.String r8 = cn.bluemobi.dylan.http.JsonParse.getString(r12, r1)
                int r2 = r2.u0(r8)
                r11.r(r5, r2)
                goto Le1
            Lde:
                r11.N(r5, r6)
            Le1:
                com.bxkj.student.home.HomeMenuListActivity r2 = r10.f771l
                boolean r2 = com.bxkj.student.home.HomeMenuListActivity.k0(r2)
                if (r2 == 0) goto Lf0
                boolean r2 = android.text.TextUtils.isEmpty(r0)
                if (r2 != 0) goto Lf0
                goto Lf1
            Lf0:
                r4 = 0
            Lf1:
                r11.N(r7, r4)
                java.lang.String r2 = "groupType"
                int r2 = cn.bluemobi.dylan.http.JsonParse.getInt(r12, r2)
                r4 = 2131689856(0x7f0f0180, float:1.900874E38)
                if (r2 != r3) goto L10b
                r11.r(r7, r4)
                com.bxkj.student.home.HomeMenuListActivity$e$b r0 = new com.bxkj.student.home.HomeMenuListActivity$e$b
                r0.<init>(r10, r12, r11)
                r11.w(r7, r0)
                return
            L10b:
                com.bxkj.student.home.HomeMenuListActivity r2 = r10.f771l
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r12, r1)
                int r0 = com.bxkj.student.home.HomeMenuListActivity.l0(r2, r0, r1)
                if (r0 == r3) goto L123
                r11.r(r7, r4)
                com.bxkj.student.home.HomeMenuListActivity$e$c r12 = new com.bxkj.student.home.HomeMenuListActivity$e$c
                r12.<init>(r10, r0)
                r11.w(r7, r12)
                return
            L123:
                r0 = 2131689855(0x7f0f017f, float:1.9008737E38)
                r11.r(r7, r0)
                com.bxkj.student.home.HomeMenuListActivity$e$d r0 = new com.bxkj.student.home.HomeMenuListActivity$e$d
                r0.<init>(r10, r12)
                r11.w(r7, r0)
            L131:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class f extends com.bxkj.student.common.utils.UniversalItemDecoration {
        final /* synthetic */ com.bxkj.student.home.HomeMenuListActivity g;

        f(com.bxkj.student.home.HomeMenuListActivity r1) {
                r0 = this;
                r0.g = r1
                r0.<init>()
                return
        }

        @Override // com.bxkj.student.common.utils.UniversalItemDecoration
        public com.bxkj.student.common.utils.UniversalItemDecoration.b a(int r3) {
                r2 = this;
                if (r3 <= 0) goto L46
                com.bxkj.student.home.HomeMenuListActivity r0 = r2.g
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r0 = com.bxkj.student.home.HomeMenuListActivity.h0(r0)
                int r0 = r0.getItemCount()
                if (r3 >= r0) goto L46
                com.bxkj.student.home.HomeMenuListActivity r0 = r2.g
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r0 = com.bxkj.student.home.HomeMenuListActivity.h0(r0)
                java.lang.Object r3 = r0.getItem(r3)
                java.util.Map r3 = (java.util.Map) r3
                java.lang.String r0 = "type"
                int r3 = cn.bluemobi.dylan.http.JsonParse.getInt(r3, r0)
                r0 = 1
                if (r3 != r0) goto L46
                com.bxkj.student.common.utils.UniversalItemDecoration$a r3 = new com.bxkj.student.common.utils.UniversalItemDecoration$a
                r3.<init>()
                com.bxkj.student.home.HomeMenuListActivity r0 = r2.g
                android.content.Context r0 = com.bxkj.student.home.HomeMenuListActivity.o0(r0)
                r1 = 1073741824(0x40000000, float:2.0)
                int r0 = cn.bluemobi.dylan.base.utils.u.a(r1, r0)
                r3.c = r0
                com.bxkj.student.home.HomeMenuListActivity r0 = r2.g
                android.content.res.Resources r0 = r0.getResources()
                r1 = 2131099756(0x7f06006c, float:1.7811874E38)
                int r0 = r0.getColor(r1)
                r3.f = r0
                return r3
            L46:
                r3 = 0
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class g implements cn.bluemobi.dylan.base.adapter.common.recyclerview.b {
        final /* synthetic */ com.bxkj.student.home.HomeMenuListActivity a;

        g(com.bxkj.student.home.HomeMenuListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(android.view.ViewGroup r2, android.view.View r3, java.lang.Object r4, int r5) {
                r1 = this;
                com.bxkj.student.home.HomeMenuListActivity r2 = r1.a
                boolean r2 = com.bxkj.student.home.HomeMenuListActivity.k0(r2)
                if (r2 != 0) goto L4f
                com.bxkj.student.home.HomeMenuListActivity r2 = r1.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r2 = com.bxkj.student.home.HomeMenuListActivity.h0(r2)
                java.lang.Object r2 = r2.getItem(r5)
                java.util.Map r2 = (java.util.Map) r2
                java.lang.String r3 = "type"
                int r2 = cn.bluemobi.dylan.http.JsonParse.getInt(r2, r3)
                r3 = 2
                if (r2 != r3) goto L4f
                com.bxkj.student.home.d r2 = new com.bxkj.student.home.d
                com.bxkj.student.home.HomeMenuListActivity r3 = r1.a
                androidx.fragment.app.FragmentActivity r3 = com.bxkj.student.home.HomeMenuListActivity.p0(r3)
                com.bxkj.student.home.HomeMenuListActivity r4 = r1.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r4 = com.bxkj.student.home.HomeMenuListActivity.h0(r4)
                java.lang.Object r4 = r4.getItem(r5)
                java.util.Map r4 = (java.util.Map) r4
                java.lang.String r0 = "icon"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r0)
                com.bxkj.student.home.HomeMenuListActivity r0 = r1.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r0 = com.bxkj.student.home.HomeMenuListActivity.h0(r0)
                java.lang.Object r5 = r0.getItem(r5)
                java.util.Map r5 = (java.util.Map) r5
                java.lang.String r0 = "name"
                java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r0)
                r2.<init>(r3, r4, r5)
                r2.f()
            L4f:
                return
        }
    }

    public HomeMenuListActivity() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "groupType"
            r1.Y = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.c0 = r0
            r0 = 0
            r1.f770p0 = r0
            return
    }

    private void A0() {
            r7 = this;
            com.bxkj.student.home.HomeMenuListActivity$d r0 = new com.bxkj.student.home.HomeMenuListActivity$d
            r0.<init>(r7)
            androidx.recyclerview.widget.RecyclerView r1 = r7.Z
            androidx.recyclerview.widget.GridLayoutManager r2 = new androidx.recyclerview.widget.GridLayoutManager
            android.content.Context r3 = r7.V
            r4 = 1
            r5 = 0
            r6 = 4
            r2.<init>(r3, r6, r4, r5)
            r1.setLayoutManager(r2)
            com.bxkj.student.home.HomeMenuListActivity$e r1 = new com.bxkj.student.home.HomeMenuListActivity$e
            android.content.Context r2 = r7.V
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r7.c0
            r1.<init>(r7, r2, r3, r0)
            r7.f769k0 = r1
            androidx.recyclerview.widget.RecyclerView r0 = r7.Z
            r0.setAdapter(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r7.Z
            com.bxkj.student.home.HomeMenuListActivity$f r1 = new com.bxkj.student.home.HomeMenuListActivity$f
            r1.<init>(r7)
            r0.addItemDecoration(r1)
            return
    }

    private void B0() {
            r2 = this;
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.c0
            java.util.List r1 = r2.w0()
            r0.addAll(r1)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.c0
            java.util.List r1 = r2.s0()
            r0.addAll(r1)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.c0
            java.util.List r1 = r2.r0()
            r0.addAll(r1)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.c0
            java.util.List r1 = r2.v0()
            r0.addAll(r1)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.c0
            java.util.List r1 = r2.t0()
            r0.addAll(r1)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.c0
            java.util.List r1 = r2.x0()
            r0.addAll(r1)
            return
    }

    private void C0() {
            r4 = this;
            android.view.animation.LayoutAnimationController r0 = new android.view.animation.LayoutAnimationController
            android.content.Context r1 = r4.V
            r2 = 2130772096(0x7f010080, float:1.71473E38)
            android.view.animation.Animation r1 = android.view.animation.AnimationUtils.loadAnimation(r1, r2)
            r0.<init>(r1)
            r1 = 0
            r0.setOrder(r1)
            androidx.recyclerview.widget.RecyclerView r2 = r4.a0
            r2.setLayoutAnimation(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r4.a0
            androidx.recyclerview.widget.LinearLayoutManager r2 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r3 = r4.V
            r2.<init>(r3, r1, r1)
            r0.setLayoutManager(r2)
            com.bxkj.student.home.a r0 = com.bxkj.student.home.a.b()
            java.util.List r0 = r0.c()
            com.bxkj.student.home.HomeMenuListActivity$b r1 = new com.bxkj.student.home.HomeMenuListActivity$b
            android.content.Context r2 = r4.V
            r3 = 2131493287(0x7f0c01a7, float:1.861005E38)
            r1.<init>(r4, r2, r3, r0)
            androidx.recyclerview.widget.RecyclerView r0 = r4.a0
            r0.setAdapter(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r4.a0
            com.bxkj.student.home.HomeMenuListActivity$c r1 = new com.bxkj.student.home.HomeMenuListActivity$c
            r1.<init>(r4)
            r0.addItemDecoration(r1)
            com.bxkj.student.home.b r0 = new com.bxkj.student.home.b
            r0.<init>(r4)
            android.widget.Button r1 = r4.b0
            r1.setOnClickListener(r0)
            return
    }

    private /* synthetic */ void D0(android.view.View r5) {
            r4 = this;
            boolean r5 = r4.f770p0
            r0 = 0
            if (r5 != 0) goto L5c
            android.widget.Button r5 = r4.b0
            java.lang.String r1 = "完成"
            r5.setText(r1)
            r5 = 1
            r4.f770p0 = r5
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            java.lang.String r2 = "首页应用"
            java.lang.String r3 = "name"
            r1.put(r3, r2)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r2 = "type"
            r1.put(r2, r5)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r5 = r4.F0
            r5.add(r0, r1)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r5 = r4.F0
            int r5 = r5.size()
            r1 = 12
            if (r5 >= r1) goto L4a
            androidx.collection.ArrayMap r5 = new androidx.collection.ArrayMap
            r5.<init>()
            java.lang.String r1 = ""
            r5.put(r3, r1)
            r1 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5.put(r2, r1)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r4.F0
            r1.add(r5)
        L4a:
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r5 = r4.c0
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r4.F0
            r5.addAll(r0, r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r5 = r4.f769k0
            r5.notifyDataSetChanged()
            androidx.recyclerview.widget.RecyclerView r5 = r4.Z
            r5.scrollToPosition(r0)
            return
        L5c:
            android.widget.Button r5 = r4.b0
            java.lang.String r1 = "编辑"
            r5.setText(r1)
            r4.f770p0 = r0
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r5 = r4.c0
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r4.F0
            r5.removeAll(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r5 = r4.f769k0
            r5.notifyDataSetChanged()
            androidx.recyclerview.widget.RecyclerView r5 = r4.Z
            r5.scrollToPosition(r0)
            r4.E0()
            return
    }

    private void E0() {
            r6 = this;
            java.lang.String r0 = "name"
            cn.bluemobi.dylan.sqlitelibrary.c r1 = cn.bluemobi.dylan.sqlitelibrary.c.h()     // Catch: java.lang.Exception -> L3a
            java.lang.Class<com.bxkj.student.common.db.HomeMenuDB> r2 = com.bxkj.student.common.db.HomeMenuDB.class
            r1.c(r2)     // Catch: java.lang.Exception -> L3a
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Exception -> L3a
            r1.<init>()     // Catch: java.lang.Exception -> L3a
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2 = r6.F0     // Catch: java.lang.Exception -> L3a
            r3 = 0
            r2.remove(r3)     // Catch: java.lang.Exception -> L3a
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2 = r6.F0     // Catch: java.lang.Exception -> L3a
            int r3 = r2.size()     // Catch: java.lang.Exception -> L3a
            int r3 = r3 + (-1)
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Exception -> L3a
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Exception -> L3a
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r0)     // Catch: java.lang.Exception -> L3a
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Exception -> L3a
            if (r2 == 0) goto L3c
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2 = r6.F0     // Catch: java.lang.Exception -> L3a
            int r3 = r2.size()     // Catch: java.lang.Exception -> L3a
            int r3 = r3 + (-1)
            r2.remove(r3)     // Catch: java.lang.Exception -> L3a
            goto L3c
        L3a:
            goto L6e
        L3c:
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2 = r6.F0     // Catch: java.lang.Exception -> L3a
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> L3a
        L42:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Exception -> L3a
            if (r3 == 0) goto L67
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Exception -> L3a
            java.util.Map r3 = (java.util.Map) r3     // Catch: java.lang.Exception -> L3a
            com.bxkj.student.common.db.HomeMenuDB r4 = new com.bxkj.student.common.db.HomeMenuDB     // Catch: java.lang.Exception -> L3a
            r4.<init>()     // Catch: java.lang.Exception -> L3a
            java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r0)     // Catch: java.lang.Exception -> L3a
            r4.setMenuName(r5)     // Catch: java.lang.Exception -> L3a
            java.lang.String r5 = "icon"
            java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r5)     // Catch: java.lang.Exception -> L3a
            r4.setIconResName(r3)     // Catch: java.lang.Exception -> L3a
            r1.add(r4)     // Catch: java.lang.Exception -> L3a
            goto L42
        L67:
            cn.bluemobi.dylan.sqlitelibrary.c r0 = cn.bluemobi.dylan.sqlitelibrary.c.h()     // Catch: java.lang.Exception -> L3a
            r0.insert(r1)     // Catch: java.lang.Exception -> L3a
        L6e:
            com.bxkj.student.main.HomeFragment r0 = r6.G0
            if (r0 == 0) goto L75
            r0.Z()
        L75:
            return
    }

    public static /* synthetic */ void g0(com.bxkj.student.home.HomeMenuListActivity r0, android.view.View r1) {
            r0.D0(r1)
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter h0(com.bxkj.student.home.HomeMenuListActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.f769k0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List i0(com.bxkj.student.home.HomeMenuListActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.c0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List j0(com.bxkj.student.home.HomeMenuListActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.F0
            return r0
    }

    static /* bridge */ /* synthetic */ boolean k0(com.bxkj.student.home.HomeMenuListActivity r0) {
            boolean r0 = r0.f770p0
            return r0
    }

    static /* bridge */ /* synthetic */ int l0(com.bxkj.student.home.HomeMenuListActivity r0, java.lang.String r1, java.lang.String r2) {
            int r0 = r0.y0(r1, r2)
            return r0
    }

    static /* synthetic */ android.content.Context m0(com.bxkj.student.home.HomeMenuListActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context n0(com.bxkj.student.home.HomeMenuListActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ android.content.Context o0(com.bxkj.student.home.HomeMenuListActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ androidx.fragment.app.FragmentActivity p0(com.bxkj.student.home.HomeMenuListActivity r0) {
            androidx.fragment.app.FragmentActivity r0 = r0.W
            return r0
    }

    private void q0() {
            r2 = this;
            androidx.recyclerview.widget.ItemTouchHelper r0 = new androidx.recyclerview.widget.ItemTouchHelper
            com.bxkj.student.home.HomeMenuListActivity$a r1 = new com.bxkj.student.home.HomeMenuListActivity$a
            r1.<init>(r2)
            r0.<init>(r1)
            r2.H0 = r0
            androidx.recyclerview.widget.RecyclerView r1 = r2.Z
            r0.attachToRecyclerView(r1)
            return
    }

    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0() {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            java.lang.String r2 = "竞赛"
            java.lang.String r3 = "name"
            r1.put(r3, r2)
            r2 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r4 = "type"
            r1.put(r4, r2)
            r0.add(r1)
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            java.lang.String r2 = "竞赛报名"
            r1.put(r3, r2)
            java.lang.String r2 = "icon_3_1"
            java.lang.String r5 = "icon"
            r1.put(r5, r2)
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.put(r4, r2)
            r0.add(r1)
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            java.lang.String r6 = "竞赛记录"
            r1.put(r3, r6)
            java.lang.String r6 = "icon_3_2"
            r1.put(r5, r6)
            r1.put(r4, r2)
            r0.add(r1)
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            java.lang.String r6 = "电子参赛证"
            r1.put(r3, r6)
            java.lang.String r6 = "icon_3_4"
            r1.put(r5, r6)
            r1.put(r4, r2)
            r0.add(r1)
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            java.lang.String r6 = "赛事中心"
            r1.put(r3, r6)
            java.lang.String r3 = "icon_3_3"
            r1.put(r5, r3)
            r1.put(r4, r2)
            r0.add(r1)
            return r0
    }

    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> s0() {
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            java.lang.String r2 = "体测"
            java.lang.String r3 = "name"
            r1.put(r3, r2)
            r2 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r4 = "type"
            r1.put(r4, r2)
            r0.add(r1)
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            java.lang.String r2 = "预约体测"
            r1.put(r3, r2)
            java.lang.String r2 = "icon_2_1"
            java.lang.String r5 = "icon"
            r1.put(r5, r2)
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.put(r4, r2)
            r0.add(r1)
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            java.lang.String r6 = "体测预约记录"
            r1.put(r3, r6)
            java.lang.String r6 = "icon_2_2"
            r1.put(r5, r6)
            r1.put(r4, r2)
            r0.add(r1)
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            java.lang.String r6 = "体测成绩"
            r1.put(r3, r6)
            java.lang.String r6 = "icon_2_3"
            r1.put(r5, r6)
            r1.put(r4, r2)
            r0.add(r1)
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            java.lang.String r7 = "申请免测"
            r1.put(r3, r7)
            java.lang.String r7 = "icon_2_4"
            r1.put(r5, r7)
            r1.put(r4, r2)
            r0.add(r1)
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            java.lang.String r7 = "班长预约"
            r1.put(r3, r7)
            java.lang.String r7 = "icon_2_5"
            r1.put(r5, r7)
            r1.put(r4, r2)
            r0.add(r1)
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            java.lang.String r7 = "班长记录"
            r1.put(r3, r7)
            java.lang.String r7 = "icon_2_6"
            r1.put(r5, r7)
            r1.put(r4, r2)
            r0.add(r1)
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            java.lang.String r7 = "体测计算器"
            r1.put(r3, r7)
            java.lang.String r7 = "icon_2_7"
            r1.put(r5, r7)
            r1.put(r4, r2)
            r0.add(r1)
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            java.lang.String r8 = "自助视力"
            r1.put(r3, r8)
            java.lang.String r8 = "icon_2_8"
            r1.put(r5, r8)
            r1.put(r4, r2)
            r0.add(r1)
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            java.lang.String r8 = "体测准考证"
            r1.put(r3, r8)
            r1.put(r5, r7)
            r1.put(r4, r2)
            r0.add(r1)
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            java.lang.String r7 = "体测排名"
            r1.put(r3, r7)
            r1.put(r5, r6)
            r1.put(r4, r2)
            r0.add(r1)
            return r0
    }

    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> t0() {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            java.lang.String r2 = "场馆"
            java.lang.String r3 = "name"
            r1.put(r3, r2)
            r2 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r4 = "type"
            r1.put(r4, r2)
            r0.add(r1)
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            java.lang.String r2 = "预约场馆"
            r1.put(r3, r2)
            java.lang.String r2 = "icon_5_1"
            java.lang.String r5 = "icon"
            r1.put(r5, r2)
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.put(r4, r2)
            r0.add(r1)
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r1 = r1.getSchoolId()
            java.lang.String r6 = "342"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L89
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            java.lang.String r6 = "场馆预约记录"
            r1.put(r3, r6)
            java.lang.String r6 = "icon_5_2"
            r1.put(r5, r6)
            r1.put(r4, r2)
            r0.add(r1)
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            java.lang.String r6 = "申请场馆"
            r1.put(r3, r6)
            java.lang.String r6 = "icon_5_3"
            r1.put(r5, r6)
            r1.put(r4, r2)
            r0.add(r1)
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            java.lang.String r6 = "申请记录"
            r1.put(r3, r6)
            java.lang.String r3 = "icon_5_4"
            r1.put(r5, r3)
            r1.put(r4, r2)
            r0.add(r1)
        L89:
            return r0
    }

    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> v0() {
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            java.lang.String r2 = "阳光体育"
            java.lang.String r3 = "name"
            r1.put(r3, r2)
            r2 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            java.lang.String r5 = "type"
            r1.put(r5, r4)
            r0.add(r1)
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            java.lang.String r4 = "App跑步"
            r1.put(r3, r4)
            java.lang.String r4 = "icon_4_1"
            java.lang.String r6 = "icon"
            r1.put(r6, r4)
            r4 = 2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.put(r5, r4)
            r0.add(r1)
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            java.lang.String r7 = "约跑"
            r1.put(r3, r7)
            java.lang.String r7 = "icon_4_2"
            r1.put(r6, r7)
            r1.put(r5, r4)
            r0.add(r1)
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            java.lang.String r7 = "锻炼考勤"
            r1.put(r3, r7)
            java.lang.String r7 = "icon_4_3"
            r1.put(r6, r7)
            r1.put(r5, r4)
            r0.add(r1)
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            java.lang.String r7 = "场馆打卡"
            r1.put(r3, r7)
            java.lang.String r7 = "icon_4_4"
            r1.put(r6, r7)
            r1.put(r5, r4)
            r0.add(r1)
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            java.lang.String r7 = "申请免跑"
            r1.put(r3, r7)
            java.lang.String r7 = "icon_4_5"
            r1.put(r6, r7)
            r1.put(r5, r4)
            r0.add(r1)
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            int r1 = r1.getIsOpenKeep()
            if (r1 != r2) goto Lc0
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            java.lang.String r2 = "绑定Keep账号"
            r1.put(r3, r2)
            java.lang.String r2 = "keep"
            r1.put(r6, r2)
            r1.put(r5, r4)
            r0.add(r1)
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            java.lang.String r7 = "同步Keep数据"
            r1.put(r3, r7)
            r1.put(r6, r2)
            r1.put(r5, r4)
            r0.add(r1)
        Lc0:
            return r0
    }

    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> w0() {
            r14 = this;
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            androidx.collection.ArrayMap r2 = new androidx.collection.ArrayMap
            r2.<init>()
            java.lang.String r3 = "教学"
            java.lang.String r4 = "name"
            r2.put(r4, r3)
            r3 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r5 = "type"
            r2.put(r5, r3)
            r1.add(r2)
            androidx.collection.ArrayMap r2 = new androidx.collection.ArrayMap
            r2.<init>()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "查看"
            r3.append(r6)
            com.bxkj.base.user.LoginUser r6 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r6 = r6.getViewAfterLabelName()
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            r2.put(r4, r3)
            java.lang.String r3 = "icon_1_1"
            java.lang.String r6 = "icon"
            r2.put(r6, r3)
            r3 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.put(r5, r3)
            r1.add(r2)
            androidx.collection.ArrayMap r2 = new androidx.collection.ArrayMap
            r2.<init>()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "在线选"
            r7.append(r8)
            com.bxkj.base.user.LoginUser r8 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r8 = r8.getXuanAfterLabelName()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r2.put(r4, r7)
            java.lang.String r7 = "icon_1_2"
            r2.put(r6, r7)
            r2.put(r5, r3)
            r1.add(r2)
            androidx.collection.ArrayMap r2 = new androidx.collection.ArrayMap
            r2.<init>()
            java.lang.String r7 = "查看点名"
            r2.put(r4, r7)
            java.lang.String r7 = "icon_1_3"
            r2.put(r6, r7)
            r2.put(r5, r3)
            r1.add(r2)
            androidx.collection.ArrayMap r2 = new androidx.collection.ArrayMap
            r2.<init>()
            java.lang.String r7 = "上课签到"
            r2.put(r4, r7)
            java.lang.String r7 = "icon_1_4"
            r2.put(r6, r7)
            r2.put(r5, r3)
            r1.add(r2)
            androidx.collection.ArrayMap r2 = new androidx.collection.ArrayMap
            r2.<init>()
            java.lang.String r7 = "上课请假"
            r2.put(r4, r7)
            java.lang.String r7 = "icon_1_5"
            r2.put(r6, r7)
            r2.put(r5, r3)
            r1.add(r2)
            androidx.collection.ArrayMap r2 = new androidx.collection.ArrayMap
            r2.<init>()
            java.lang.String r7 = "评价教师"
            r2.put(r4, r7)
            java.lang.String r7 = "icon_1_6"
            r2.put(r6, r7)
            r2.put(r5, r3)
            r1.add(r2)
            androidx.collection.ArrayMap r2 = new androidx.collection.ArrayMap
            r2.<init>()
            java.lang.String r7 = "理论考试"
            r2.put(r4, r7)
            java.lang.String r7 = "icon_1_7"
            r2.put(r6, r7)
            r2.put(r5, r3)
            r1.add(r2)
            androidx.collection.ArrayMap r2 = new androidx.collection.ArrayMap
            r2.<init>()
            java.lang.String r7 = "师生互动"
            r2.put(r4, r7)
            java.lang.String r7 = "icon_1_8"
            r2.put(r6, r7)
            r2.put(r5, r3)
            r1.add(r2)
            androidx.collection.ArrayMap r2 = new androidx.collection.ArrayMap
            r2.<init>()
            java.lang.String r7 = "申请状态"
            r2.put(r4, r7)
            java.lang.String r7 = "icon_1_9"
            r2.put(r6, r7)
            r2.put(r5, r3)
            r1.add(r2)
            androidx.collection.ArrayMap r2 = new androidx.collection.ArrayMap
            r2.<init>()
            java.lang.String r7 = "期末成绩"
            r2.put(r4, r7)
            java.lang.String r7 = "icon_1_10"
            r2.put(r6, r7)
            r2.put(r5, r3)
            r1.add(r2)
            androidx.collection.ArrayMap r2 = new androidx.collection.ArrayMap
            r2.<init>()
            java.lang.String r7 = "申请班长"
            r2.put(r4, r7)
            java.lang.String r7 = "icon_1_11"
            r2.put(r6, r7)
            r2.put(r5, r3)
            r1.add(r2)
            androidx.collection.ArrayMap r2 = new androidx.collection.ArrayMap
            r2.<init>()
            java.lang.String r7 = "班级管理"
            r2.put(r4, r7)
            java.lang.String r7 = "icon_1_12"
            r2.put(r6, r7)
            r2.put(r5, r3)
            r1.add(r2)
            androidx.collection.ArrayMap r2 = new androidx.collection.ArrayMap
            r2.<init>()
            java.lang.String r7 = "公共班级"
            r2.put(r4, r7)
            java.lang.String r7 = "icon_1_13"
            r2.put(r6, r7)
            r2.put(r5, r3)
            r1.add(r2)
            androidx.collection.ArrayMap r2 = new androidx.collection.ArrayMap
            r2.<init>()
            java.lang.String r7 = "预约活动"
            r2.put(r4, r7)
            java.lang.String r7 = "icon_1_14"
            r2.put(r6, r7)
            r2.put(r5, r3)
            r1.add(r2)
            androidx.collection.ArrayMap r2 = new androidx.collection.ArrayMap
            r2.<init>()
            java.lang.String r7 = "我的活动"
            r2.put(r4, r7)
            java.lang.String r7 = "icon_1_15"
            r2.put(r6, r7)
            r2.put(r5, r3)
            r1.add(r2)
            androidx.collection.ArrayMap r2 = new androidx.collection.ArrayMap
            r2.<init>()
            java.lang.String r7 = "在线学习"
            r2.put(r4, r7)
            java.lang.String r7 = "icon_1_16"
            r2.put(r6, r7)
            r2.put(r5, r3)
            r1.add(r2)
            androidx.collection.ArrayMap r2 = new androidx.collection.ArrayMap
            r2.<init>()
            java.lang.String r7 = "预约考试"
            r2.put(r4, r7)
            java.lang.String r7 = "icon_1_17"
            r2.put(r6, r7)
            r2.put(r5, r3)
            r1.add(r2)
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getSchoolId()
            java.lang.String r7 = "92"
            boolean r2 = r2.equals(r7)
            java.lang.String r8 = "groupType"
            java.lang.String r9 = "icon_1_18"
            java.lang.String r10 = "130"
            java.lang.String r11 = "97"
            java.lang.String r12 = "11"
            if (r2 != 0) goto L211
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getSchoolId()
            boolean r2 = r2.equals(r12)
            if (r2 != 0) goto L211
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getSchoolId()
            java.lang.String r13 = "95"
            boolean r2 = r2.equals(r13)
            if (r2 != 0) goto L211
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getSchoolId()
            boolean r2 = r2.equals(r11)
            if (r2 != 0) goto L211
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getSchoolId()
            boolean r2 = r2.equals(r10)
            if (r2 == 0) goto L227
        L211:
            androidx.collection.ArrayMap r2 = new androidx.collection.ArrayMap
            r2.<init>()
            java.lang.String r13 = "体育专业题库"
            r2.put(r4, r13)
            r2.put(r6, r9)
            r2.put(r5, r3)
            r2.put(r8, r0)
            r1.add(r2)
        L227:
            androidx.collection.ArrayMap r2 = new androidx.collection.ArrayMap
            r2.<init>()
            java.lang.String r13 = "课后作业"
            r2.put(r4, r13)
            java.lang.String r13 = "ic_home_word"
            r2.put(r6, r13)
            r2.put(r5, r3)
            r1.add(r2)
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getSchoolId()
            boolean r2 = r2.equals(r7)
            if (r2 != 0) goto L276
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getSchoolId()
            boolean r2 = r2.equals(r12)
            if (r2 != 0) goto L276
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getSchoolId()
            boolean r2 = r2.equals(r11)
            if (r2 != 0) goto L276
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getSchoolId()
            boolean r2 = r2.equals(r10)
            if (r2 == 0) goto L275
            goto L276
        L275:
            return r1
        L276:
            androidx.collection.ArrayMap r2 = new androidx.collection.ArrayMap
            r2.<init>()
            java.lang.String r7 = "体育知识竞赛"
            r2.put(r4, r7)
            r2.put(r6, r9)
            r2.put(r5, r3)
            r2.put(r8, r0)
            r1.add(r2)
            return r1
    }

    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> x0() {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            java.lang.String r2 = "器材"
            java.lang.String r3 = "name"
            r1.put(r3, r2)
            r2 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r4 = "type"
            r1.put(r4, r2)
            r0.add(r1)
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            java.lang.String r2 = "借用器材"
            r1.put(r3, r2)
            java.lang.String r2 = "icon_6_1"
            java.lang.String r5 = "icon"
            r1.put(r5, r2)
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.put(r4, r2)
            r0.add(r1)
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            java.lang.String r6 = "借用记录"
            r1.put(r3, r6)
            java.lang.String r3 = "icon_6_2"
            r1.put(r5, r3)
            r1.put(r4, r2)
            r0.add(r1)
            return r0
    }

    private int y0(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            r0 = 0
        L1:
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r2.F0
            int r1 = r1.size()
            if (r0 >= r1) goto L29
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r2.F0
            java.lang.Object r1 = r1.get(r0)
            java.util.Map r1 = (java.util.Map) r1
            boolean r1 = r1.containsValue(r3)
            if (r1 == 0) goto L26
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r2.F0
            java.lang.Object r1 = r1.get(r0)
            java.util.Map r1 = (java.util.Map) r1
            boolean r1 = r1.containsValue(r4)
            if (r1 == 0) goto L26
            return r0
        L26:
            int r0 = r0 + 1
            goto L1
        L29:
            r3 = -1
            return r3
    }

    private int z0(java.lang.String r3) {
            r2 = this;
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.c0
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L1c
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r2.c0
            java.lang.Object r1 = r1.get(r0)
            java.util.Map r1 = (java.util.Map) r1
            boolean r1 = r1.containsValue(r3)
            if (r1 == 0) goto L19
            return r0
        L19:
            int r0 = r0 + (-1)
            goto L8
        L1c:
            r3 = -1
            return r3
    }

    public void L() {
            r2 = this;
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.f769k0
            com.bxkj.student.home.HomeMenuListActivity$g r1 = new com.bxkj.student.home.HomeMenuListActivity$g
            r1.<init>(r2)
            r0.k(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492948(0x7f0c0054, float:1.8609362E38)
            return r0
    }

    public void R() {
            r2 = this;
            cn.bluemobi.dylan.base.utils.a r0 = cn.bluemobi.dylan.base.utils.a.n()
            java.lang.Class<com.bxkj.student.main.HomeFragment> r1 = com.bxkj.student.main.HomeFragment.class
            androidx.fragment.app.Fragment r0 = r0.o(r1)
            com.bxkj.student.main.HomeFragment r0 = (com.bxkj.student.main.HomeFragment) r0
            r2.G0 = r0
            com.bxkj.student.home.a r0 = com.bxkj.student.home.a.b()
            java.util.List r0 = r0.c()
            r2.F0 = r0
            r2.B0()
            r2.A0()
            r2.C0()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "全部应用"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131296605(0x7f09015d, float:1.8211131E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r0.b0 = r1
            r1 = 2131298432(0x7f090880, float:1.8214837E38)
            android.view.View r1 = r0.findViewById(r1)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r0.a0 = r1
            r1 = 2131298421(0x7f090875, float:1.8214815E38)
            android.view.View r1 = r0.findViewById(r1)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r0.Z = r1
            r0.q0()
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }

    public int u0(java.lang.String r4) {
            r3 = this;
            android.content.res.Resources r0 = r3.getResources()
            java.lang.String r1 = "mipmap"
            java.lang.String r2 = r3.getPackageName()
            int r0 = r0.getIdentifier(r4, r1, r2)
            java.lang.String r1 = "ic_home_word"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L25
            android.content.res.Resources r0 = r3.getResources()
            java.lang.String r1 = "drawable"
            java.lang.String r2 = r3.getPackageName()
            int r4 = r0.getIdentifier(r4, r1, r2)
            return r4
        L25:
            return r0
    }
}
