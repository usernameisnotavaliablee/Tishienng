package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class o3 extends android.widget.BaseExpandableListAdapter implements android.widget.ExpandableListView.OnGroupCollapseListener, android.widget.ExpandableListView.OnGroupExpandListener {
    private boolean[] a;

    /* renamed from: b, reason: collision with root package name */
    private int f3729b;

    /* renamed from: c, reason: collision with root package name */
    private java.util.List<com.amap.api.maps.offlinemap.OfflineMapProvince> f3730c;

    /* renamed from: d, reason: collision with root package name */
    private com.amap.api.maps.offlinemap.OfflineMapManager f3731d;

    /* renamed from: e, reason: collision with root package name */
    private android.content.Context f3732e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public final class a {
        public com.amap.api.col.p0003l.s3 a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.o3 f3733b;

        public a(com.amap.api.col.p0003l.o3 r1) {
                r0 = this;
                r0.f3733b = r1
                r0.<init>()
                return
        }
    }

    public o3(java.util.List<com.amap.api.maps.offlinemap.OfflineMapProvince> r2, com.amap.api.maps.offlinemap.OfflineMapManager r3, android.content.Context r4) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f3729b = r0
            r1.f3730c = r2
            r1.f3731d = r3
            r1.f3732e = r4
            int r2 = r2.size()
            boolean[] r2 = new boolean[r2]
            r1.a = r2
            return
    }

    private boolean b(int r3) {
            r2 = this;
            if (r3 == 0) goto Lb
            int r0 = r2.getGroupCount()
            r1 = 1
            int r0 = r0 - r1
            if (r3 == r0) goto Lb
            return r1
        Lb:
            r3 = 0
            return r3
    }

    public final void a() {
            r1 = this;
            r0 = -1
            r1.f3729b = r0
            r1.notifyDataSetChanged()
            return
    }

    public final void c() {
            r1 = this;
            r0 = 0
            r1.f3729b = r0
            r1.notifyDataSetChanged()
            return
    }

    @Override // android.widget.ExpandableListAdapter
    public final java.lang.Object getChild(int r1, int r2) {
            r0 = this;
            r1 = 0
            return r1
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
            com.amap.api.col.3l.o3$a r4 = (com.amap.api.col.3l.o3.a) r4
            goto L25
        L9:
            com.amap.api.col.3l.o3$a r4 = new com.amap.api.col.3l.o3$a
            r4.<init>(r1)
            com.amap.api.col.3l.s3 r5 = new com.amap.api.col.3l.s3
            android.content.Context r6 = r1.f3732e
            com.amap.api.maps.offlinemap.OfflineMapManager r0 = r1.f3731d
            r5.<init>(r6, r0)
            r6 = 1
            r5.b(r6)
            android.view.View r6 = r5.a()
            r4.a = r5
            r6.setTag(r4)
            r5 = r6
        L25:
            java.util.List<com.amap.api.maps.offlinemap.OfflineMapProvince> r6 = r1.f3730c
            java.lang.Object r2 = r6.get(r2)
            com.amap.api.maps.offlinemap.OfflineMapProvince r2 = (com.amap.api.maps.offlinemap.OfflineMapProvince) r2
            java.util.ArrayList r2 = r2.getCityList()
            java.lang.Object r2 = r2.get(r3)
            com.amap.api.maps.offlinemap.OfflineMapCity r2 = (com.amap.api.maps.offlinemap.OfflineMapCity) r2
            com.amap.api.col.3l.s3 r3 = r4.a
            r3.e(r2)
            return r5
    }

    @Override // android.widget.ExpandableListAdapter
    public final int getChildrenCount(int r2) {
            r1 = this;
            boolean r0 = r1.b(r2)
            if (r0 == 0) goto L17
            java.util.List<com.amap.api.maps.offlinemap.OfflineMapProvince> r0 = r1.f3730c
            java.lang.Object r2 = r0.get(r2)
            com.amap.api.maps.offlinemap.OfflineMapProvince r2 = (com.amap.api.maps.offlinemap.OfflineMapProvince) r2
            java.util.ArrayList r2 = r2.getCityList()
            int r2 = r2.size()
            return r2
        L17:
            java.util.List<com.amap.api.maps.offlinemap.OfflineMapProvince> r0 = r1.f3730c
            java.lang.Object r2 = r0.get(r2)
            com.amap.api.maps.offlinemap.OfflineMapProvince r2 = (com.amap.api.maps.offlinemap.OfflineMapProvince) r2
            java.util.ArrayList r2 = r2.getCityList()
            int r2 = r2.size()
            return r2
    }

    @Override // android.widget.ExpandableListAdapter
    public final java.lang.Object getGroup(int r2) {
            r1 = this;
            java.util.List<com.amap.api.maps.offlinemap.OfflineMapProvince> r0 = r1.f3730c
            java.lang.Object r2 = r0.get(r2)
            com.amap.api.maps.offlinemap.OfflineMapProvince r2 = (com.amap.api.maps.offlinemap.OfflineMapProvince) r2
            java.lang.String r2 = r2.getProvinceName()
            return r2
    }

    @Override // android.widget.ExpandableListAdapter
    public final int getGroupCount() {
            r2 = this;
            int r0 = r2.f3729b
            r1 = -1
            if (r0 != r1) goto Lb
            java.util.List<com.amap.api.maps.offlinemap.OfflineMapProvince> r0 = r2.f3730c
            int r0 = r0.size()
        Lb:
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
            android.content.Context r3 = r1.f3732e
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
            java.util.List<com.amap.api.maps.offlinemap.OfflineMapProvince> r0 = r1.f3730c
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
            r0 = 1
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
