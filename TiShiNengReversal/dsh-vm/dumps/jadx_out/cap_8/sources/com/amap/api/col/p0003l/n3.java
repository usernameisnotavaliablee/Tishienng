package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class n3 extends android.widget.BaseExpandableListAdapter implements android.widget.ExpandableListView.OnGroupCollapseListener, android.widget.ExpandableListView.OnGroupExpandListener {
    private boolean[] a;

    /* renamed from: b, reason: collision with root package name */
    private android.content.Context f3694b;

    /* renamed from: c, reason: collision with root package name */
    private com.amap.api.col.p0003l.s3 f3695c;

    /* renamed from: d, reason: collision with root package name */
    private java.util.List<com.amap.api.maps.offlinemap.OfflineMapProvince> f3696d;

    /* renamed from: e, reason: collision with root package name */
    java.util.List<com.amap.api.maps.offlinemap.OfflineMapProvince> f3697e;

    /* renamed from: f, reason: collision with root package name */
    private com.amap.api.col.p0003l.u3 f3698f;

    /* renamed from: g, reason: collision with root package name */
    private com.amap.api.maps.offlinemap.OfflineMapManager f3699g;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a implements android.view.View.OnClickListener {
        final /* synthetic */ com.amap.api.maps.offlinemap.OfflineMapCity a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.n3 f3700b;

        a(com.amap.api.col.p0003l.n3 r1, com.amap.api.maps.offlinemap.OfflineMapCity r2) {
                r0 = this;
                r0.f3700b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View r2) {
                r1 = this;
                com.amap.api.col.3l.n3 r2 = r1.f3700b
                com.amap.api.col.3l.u3 r2 = com.amap.api.col.p0003l.n3.a(r2)
                com.amap.api.maps.offlinemap.OfflineMapCity r0 = r1.a
                r2.j(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public final class b {
        public com.amap.api.col.p0003l.s3 a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.n3 f3701b;

        public b(com.amap.api.col.p0003l.n3 r1) {
                r0 = this;
                r0.f3701b = r1
                r0.<init>()
                return
        }
    }

    public n3(android.content.Context r2, com.amap.api.col.p0003l.u3 r3, com.amap.api.maps.offlinemap.OfflineMapManager r4, java.util.List<com.amap.api.maps.offlinemap.OfflineMapProvince> r5) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f3696d = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f3697e = r0
            r1.f3694b = r2
            r1.f3698f = r3
            r1.f3699g = r4
            if (r5 == 0) goto L4d
            int r2 = r5.size()
            if (r2 <= 0) goto L4d
            java.util.List<com.amap.api.maps.offlinemap.OfflineMapProvince> r2 = r1.f3696d
            r2.clear()
            java.util.List<com.amap.api.maps.offlinemap.OfflineMapProvince> r2 = r1.f3696d
            r2.addAll(r5)
            java.util.List<com.amap.api.maps.offlinemap.OfflineMapProvince> r2 = r1.f3696d
            java.util.Iterator r2 = r2.iterator()
        L2f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L4d
            java.lang.Object r3 = r2.next()
            com.amap.api.maps.offlinemap.OfflineMapProvince r3 = (com.amap.api.maps.offlinemap.OfflineMapProvince) r3
            if (r3 == 0) goto L2f
            java.util.ArrayList r4 = r3.getDownloadedCityList()
            int r4 = r4.size()
            if (r4 <= 0) goto L2f
            java.util.List<com.amap.api.maps.offlinemap.OfflineMapProvince> r4 = r1.f3697e
            r4.add(r3)
            goto L2f
        L4d:
            java.util.List<com.amap.api.maps.offlinemap.OfflineMapProvince> r2 = r1.f3697e
            int r2 = r2.size()
            boolean[] r2 = new boolean[r2]
            r1.a = r2
            return
    }

    static /* synthetic */ com.amap.api.col.p0003l.u3 a(com.amap.api.col.p0003l.n3 r0) {
            com.amap.api.col.3l.u3 r0 = r0.f3698f
            return r0
    }

    public final void b() {
            r3 = this;
            java.util.List<com.amap.api.maps.offlinemap.OfflineMapProvince> r0 = r3.f3696d
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r0.next()
            com.amap.api.maps.offlinemap.OfflineMapProvince r1 = (com.amap.api.maps.offlinemap.OfflineMapProvince) r1
            java.util.ArrayList r2 = r1.getDownloadedCityList()
            int r2 = r2.size()
            if (r2 <= 0) goto L6
            java.util.List<com.amap.api.maps.offlinemap.OfflineMapProvince> r2 = r3.f3697e
            boolean r2 = r2.contains(r1)
            if (r2 != 0) goto L6
            java.util.List<com.amap.api.maps.offlinemap.OfflineMapProvince> r2 = r3.f3697e
            r2.add(r1)
            goto L6
        L2a:
            java.util.List<com.amap.api.maps.offlinemap.OfflineMapProvince> r0 = r3.f3697e
            int r0 = r0.size()
            boolean[] r0 = new boolean[r0]
            r3.a = r0
            r3.notifyDataSetChanged()
            return
    }

    public final void c() {
            r3 = this;
            java.util.List<com.amap.api.maps.offlinemap.OfflineMapProvince> r0 = r3.f3697e     // Catch: java.lang.Exception -> L31
            int r0 = r0.size()     // Catch: java.lang.Exception -> L31
        L6:
            if (r0 <= 0) goto L24
            java.util.List<com.amap.api.maps.offlinemap.OfflineMapProvince> r1 = r3.f3697e     // Catch: java.lang.Exception -> L31
            int r2 = r0 + (-1)
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Exception -> L31
            com.amap.api.maps.offlinemap.OfflineMapProvince r1 = (com.amap.api.maps.offlinemap.OfflineMapProvince) r1     // Catch: java.lang.Exception -> L31
            java.util.ArrayList r2 = r1.getDownloadedCityList()     // Catch: java.lang.Exception -> L31
            int r2 = r2.size()     // Catch: java.lang.Exception -> L31
            if (r2 != 0) goto L21
            java.util.List<com.amap.api.maps.offlinemap.OfflineMapProvince> r2 = r3.f3697e     // Catch: java.lang.Exception -> L31
            r2.remove(r1)     // Catch: java.lang.Exception -> L31
        L21:
            int r0 = r0 + (-1)
            goto L6
        L24:
            java.util.List<com.amap.api.maps.offlinemap.OfflineMapProvince> r0 = r3.f3697e     // Catch: java.lang.Exception -> L31
            int r0 = r0.size()     // Catch: java.lang.Exception -> L31
            boolean[] r0 = new boolean[r0]     // Catch: java.lang.Exception -> L31
            r3.a = r0     // Catch: java.lang.Exception -> L31
            r3.notifyDataSetChanged()     // Catch: java.lang.Exception -> L31
        L31:
            return
    }

    @Override // android.widget.ExpandableListAdapter
    public final java.lang.Object getChild(int r2, int r3) {
            r1 = this;
            java.util.List<com.amap.api.maps.offlinemap.OfflineMapProvince> r0 = r1.f3697e
            java.lang.Object r2 = r0.get(r2)
            com.amap.api.maps.offlinemap.OfflineMapProvince r2 = (com.amap.api.maps.offlinemap.OfflineMapProvince) r2
            java.util.ArrayList r2 = r2.getDownloadedCityList()
            java.lang.Object r2 = r2.get(r3)
            return r2
    }

    @Override // android.widget.ExpandableListAdapter
    public final long getChildId(int r1, int r2) {
            r0 = this;
            long r1 = (long) r2
            return r1
    }

    @Override // android.widget.ExpandableListAdapter
    public final android.view.View getChildView(int r2, int r3, boolean r4, android.view.View r5, android.view.ViewGroup r6) {
            r1 = this;
            if (r5 == 0) goto L9
            java.lang.Object r4 = r5.getTag()
            com.amap.api.col.3l.n3$b r4 = (com.amap.api.col.3l.n3.b) r4
            goto L2a
        L9:
            com.amap.api.col.3l.n3$b r4 = new com.amap.api.col.3l.n3$b
            r4.<init>(r1)
            com.amap.api.col.3l.s3 r5 = new com.amap.api.col.3l.s3
            android.content.Context r6 = r1.f3694b
            com.amap.api.maps.offlinemap.OfflineMapManager r0 = r1.f3699g
            r5.<init>(r6, r0)
            r1.f3695c = r5
            r6 = 2
            r5.b(r6)
            com.amap.api.col.3l.s3 r5 = r1.f3695c
            android.view.View r5 = r5.a()
            com.amap.api.col.3l.s3 r6 = r1.f3695c
            r4.a = r6
            r5.setTag(r4)
        L2a:
            java.util.List<com.amap.api.maps.offlinemap.OfflineMapProvince> r6 = r1.f3697e
            java.lang.Object r2 = r6.get(r2)
            com.amap.api.maps.offlinemap.OfflineMapProvince r2 = (com.amap.api.maps.offlinemap.OfflineMapProvince) r2
            java.util.ArrayList r6 = r2.getDownloadedCityList()
            int r6 = r6.size()
            if (r3 >= r6) goto L53
            java.util.ArrayList r2 = r2.getDownloadedCityList()
            java.lang.Object r2 = r2.get(r3)
            com.amap.api.maps.offlinemap.OfflineMapCity r2 = (com.amap.api.maps.offlinemap.OfflineMapCity) r2
            com.amap.api.col.3l.s3 r3 = r4.a
            r3.e(r2)
            com.amap.api.col.3l.n3$a r3 = new com.amap.api.col.3l.n3$a
            r3.<init>(r1, r2)
            r5.setOnClickListener(r3)
        L53:
            return r5
    }

    @Override // android.widget.ExpandableListAdapter
    public final int getChildrenCount(int r2) {
            r1 = this;
            java.util.List<com.amap.api.maps.offlinemap.OfflineMapProvince> r0 = r1.f3697e
            java.lang.Object r2 = r0.get(r2)
            com.amap.api.maps.offlinemap.OfflineMapProvince r2 = (com.amap.api.maps.offlinemap.OfflineMapProvince) r2
            java.util.ArrayList r2 = r2.getDownloadedCityList()
            int r2 = r2.size()
            return r2
    }

    @Override // android.widget.ExpandableListAdapter
    public final java.lang.Object getGroup(int r2) {
            r1 = this;
            java.util.List<com.amap.api.maps.offlinemap.OfflineMapProvince> r0 = r1.f3697e
            java.lang.Object r2 = r0.get(r2)
            com.amap.api.maps.offlinemap.OfflineMapProvince r2 = (com.amap.api.maps.offlinemap.OfflineMapProvince) r2
            java.lang.String r2 = r2.getProvinceName()
            return r2
    }

    @Override // android.widget.ExpandableListAdapter
    public final int getGroupCount() {
            r1 = this;
            java.util.List<com.amap.api.maps.offlinemap.OfflineMapProvince> r0 = r1.f3697e
            int r0 = r0.size()
            return r0
    }

    @Override // android.widget.ExpandableListAdapter
    public final long getGroupId(int r3) {
            r2 = this;
            long r0 = (long) r3
            return r0
    }

    @Override // android.widget.ExpandableListAdapter
    public final android.view.View getGroupView(int r2, boolean r3, android.view.View r4, android.view.ViewGroup r5) {
            r1 = this;
            if (r4 != 0) goto Le
            android.content.Context r3 = r1.f3694b
            r4 = 2130903043(0x7f030003, float:1.7412893E38)
            android.view.View r3 = com.amap.api.col.p0003l.x3.d(r3, r4)
            r4 = r3
            android.widget.RelativeLayout r4 = (android.widget.RelativeLayout) r4
        Le:
            r3 = 2131165201(0x7f070011, float:1.7944612E38)
            android.view.View r3 = r4.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r5 = 2131165202(0x7f070012, float:1.7944614E38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            java.util.List<com.amap.api.maps.offlinemap.OfflineMapProvince> r0 = r1.f3697e
            java.lang.Object r0 = r0.get(r2)
            com.amap.api.maps.offlinemap.OfflineMapProvince r0 = (com.amap.api.maps.offlinemap.OfflineMapProvince) r0
            java.lang.String r0 = r0.getProvinceName()
            r3.setText(r0)
            boolean[] r3 = r1.a
            boolean r2 = r3[r2]
            if (r2 == 0) goto L44
            android.content.res.Resources r2 = com.amap.api.col.p0003l.x3.b()
            r3 = 2130837509(0x7f020005, float:1.7279974E38)
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r3)
            r5.setImageDrawable(r2)
            return r4
        L44:
            android.content.res.Resources r2 = com.amap.api.col.p0003l.x3.b()
            r3 = 2130837510(0x7f020006, float:1.7279976E38)
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r3)
            r5.setImageDrawable(r2)
            return r4
    }

    @Override // android.widget.ExpandableListAdapter
    public final boolean hasStableIds() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.widget.ExpandableListAdapter
    public final boolean isChildSelectable(int r1, int r2) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // android.widget.ExpandableListView.OnGroupCollapseListener
    public final void onGroupCollapse(int r3) {
            r2 = this;
            boolean[] r0 = r2.a
            r1 = 0
            r0[r3] = r1
            return
    }

    @Override // android.widget.ExpandableListView.OnGroupExpandListener
    public final void onGroupExpand(int r3) {
            r2 = this;
            boolean[] r0 = r2.a
            r1 = 1
            r0[r3] = r1
            return
    }
}
