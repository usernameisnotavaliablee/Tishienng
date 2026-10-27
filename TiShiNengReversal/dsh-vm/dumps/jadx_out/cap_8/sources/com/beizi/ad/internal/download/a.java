package com.beizi.ad.internal.download;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a extends android.widget.BaseExpandableListAdapter {
    private android.content.Context a;

    /* renamed from: b, reason: collision with root package name */
    private java.util.List<com.beizi.ad.internal.download.b> f6700b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.beizi.ad.internal.download.a$a, reason: collision with other inner class name */
    public class C0102a {
        android.widget.TextView a;

        /* renamed from: b, reason: collision with root package name */
        com.beizi.ad.internal.download.BeiZiWebView f6701b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.beizi.ad.internal.download.a f6702c;

        public C0102a(com.beizi.ad.internal.download.a r1) {
                r0 = this;
                r0.f6702c = r1
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class b {
        android.widget.TextView a;

        /* renamed from: b, reason: collision with root package name */
        android.widget.ImageView f6703b;

        /* renamed from: c, reason: collision with root package name */
        android.view.View f6704c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.beizi.ad.internal.download.a f6705d;

        public b(com.beizi.ad.internal.download.a r1) {
                r0 = this;
                r0.f6705d = r1
                r0.<init>()
                return
        }
    }

    public a(android.content.Context r2, java.util.List<com.beizi.ad.internal.download.b> r3) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f6700b = r0
            r1.a = r2
            r0.clear()
            java.util.List<com.beizi.ad.internal.download.b> r2 = r1.f6700b
            r2.addAll(r3)
            return
    }

    @Override // android.widget.ExpandableListAdapter
    public java.lang.Object getChild(int r1, int r2) {
            r0 = this;
            java.util.List<com.beizi.ad.internal.download.b> r2 = r0.f6700b
            java.lang.Object r1 = r2.get(r1)
            com.beizi.ad.internal.download.b r1 = (com.beizi.ad.internal.download.b) r1
            java.lang.String r1 = r1.c()
            return r1
    }

    @Override // android.widget.ExpandableListAdapter
    public long getChildId(int r1, int r2) {
            r0 = this;
            long r1 = (long) r2
            return r1
    }

    @Override // android.widget.ExpandableListAdapter
    public android.view.View getChildView(int r3, int r4, boolean r5, android.view.View r6, android.view.ViewGroup r7) {
            r2 = this;
            android.content.Context r4 = r2.a
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            int r5 = com.beizi.fusion.R.layout.beizi_download_dialog_expand_child_item
            r6 = 0
            android.view.View r4 = r4.inflate(r5, r6)
            com.beizi.ad.internal.download.a$a r5 = new com.beizi.ad.internal.download.a$a
            r5.<init>(r2)
            int r6 = com.beizi.fusion.R.id.beizi_addeci_content_tv
            android.view.View r6 = r4.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r5.a = r6
            int r6 = com.beizi.fusion.R.id.beizi_addeci_content_wb
            android.view.View r6 = r4.findViewById(r6)
            com.beizi.ad.internal.download.BeiZiWebView r6 = (com.beizi.ad.internal.download.BeiZiWebView) r6
            r5.f6701b = r6
            r4.setTag(r5)
            java.util.List<com.beizi.ad.internal.download.b> r6 = r2.f6700b
            java.lang.Object r6 = r6.get(r3)
            com.beizi.ad.internal.download.b r6 = (com.beizi.ad.internal.download.b) r6
            java.lang.String r6 = r6.b()
            java.lang.String r7 = "text"
            boolean r6 = r7.equals(r6)
            r7 = 8
            r0 = 0
            if (r6 == 0) goto L5c
            android.widget.TextView r6 = r5.a
            r6.setVisibility(r0)
            com.beizi.ad.internal.download.BeiZiWebView r6 = r5.f6701b
            r6.setVisibility(r7)
            android.widget.TextView r5 = r5.a
            java.util.List<com.beizi.ad.internal.download.b> r6 = r2.f6700b
            java.lang.Object r3 = r6.get(r3)
            com.beizi.ad.internal.download.b r3 = (com.beizi.ad.internal.download.b) r3
            java.lang.String r3 = r3.c()
            r5.setText(r3)
            return r4
        L5c:
            java.util.List<com.beizi.ad.internal.download.b> r6 = r2.f6700b
            java.lang.Object r6 = r6.get(r3)
            com.beizi.ad.internal.download.b r6 = (com.beizi.ad.internal.download.b) r6
            java.lang.String r6 = r6.b()
            java.lang.String r1 = "h5"
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L8f
            android.widget.TextView r6 = r5.a
            r6.setVisibility(r7)
            com.beizi.ad.internal.download.BeiZiWebView r6 = r5.f6701b
            r6.setVisibility(r0)
            com.beizi.ad.internal.download.BeiZiWebView r5 = r5.f6701b
            java.util.List<com.beizi.ad.internal.download.b> r6 = r2.f6700b
            java.lang.Object r3 = r6.get(r3)
            com.beizi.ad.internal.download.b r3 = (com.beizi.ad.internal.download.b) r3
            java.lang.String r3 = r3.c()
            java.util.Map r6 = com.beizi.ad.lance.a.j.a()
            r5.loadUrl(r3, r6)
        L8f:
            return r4
    }

    @Override // android.widget.ExpandableListAdapter
    public int getChildrenCount(int r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // android.widget.ExpandableListAdapter
    public java.lang.Object getGroup(int r2) {
            r1 = this;
            java.util.List<com.beizi.ad.internal.download.b> r0 = r1.f6700b
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // android.widget.ExpandableListAdapter
    public int getGroupCount() {
            r1 = this;
            java.util.List<com.beizi.ad.internal.download.b> r0 = r1.f6700b
            int r0 = r0.size()
            return r0
    }

    @Override // android.widget.ExpandableListAdapter
    public long getGroupId(int r3) {
            r2 = this;
            long r0 = (long) r3
            return r0
    }

    @Override // android.widget.ExpandableListAdapter
    public android.view.View getGroupView(int r3, boolean r4, android.view.View r5, android.view.ViewGroup r6) {
            r2 = this;
            if (r5 != 0) goto L34
            android.content.Context r5 = r2.a
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r5)
            int r6 = com.beizi.fusion.R.layout.beizi_download_dialog_expand_parent_item
            r0 = 0
            android.view.View r5 = r5.inflate(r6, r0)
            com.beizi.ad.internal.download.a$b r6 = new com.beizi.ad.internal.download.a$b
            r6.<init>(r2)
            int r0 = com.beizi.fusion.R.id.beizi_addep_title_tv
            android.view.View r0 = r5.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.a = r0
            int r0 = com.beizi.fusion.R.id.beizi_addep_fold_iv
            android.view.View r0 = r5.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r6.f6703b = r0
            int r0 = com.beizi.fusion.R.id.beizi_addep_item_divider_view
            android.view.View r0 = r5.findViewById(r0)
            r6.f6704c = r0
            r5.setTag(r6)
            goto L3a
        L34:
            java.lang.Object r6 = r5.getTag()
            com.beizi.ad.internal.download.a$b r6 = (com.beizi.ad.internal.download.a.b) r6
        L3a:
            android.widget.TextView r0 = r6.a
            java.util.List<com.beizi.ad.internal.download.b> r1 = r2.f6700b
            java.lang.Object r1 = r1.get(r3)
            com.beizi.ad.internal.download.b r1 = (com.beizi.ad.internal.download.b) r1
            java.lang.String r1 = r1.a()
            r0.setText(r1)
            if (r4 == 0) goto L60
            android.widget.TextView r4 = r6.a
            java.lang.String r0 = "#FF8E15"
            int r0 = android.graphics.Color.parseColor(r0)
            r4.setTextColor(r0)
            android.widget.ImageView r4 = r6.f6703b
            int r0 = com.beizi.fusion.R.mipmap.beizi_icon_arrow_unfold
            r4.setBackgroundResource(r0)
            goto L72
        L60:
            android.widget.TextView r4 = r6.a
            java.lang.String r0 = "#333333"
            int r0 = android.graphics.Color.parseColor(r0)
            r4.setTextColor(r0)
            android.widget.ImageView r4 = r6.f6703b
            int r0 = com.beizi.fusion.R.mipmap.beizi_icon_arrow_fold
            r4.setBackgroundResource(r0)
        L72:
            if (r3 != 0) goto L7c
            android.view.View r3 = r6.f6704c
            r4 = 8
            r3.setVisibility(r4)
            return r5
        L7c:
            android.view.View r3 = r6.f6704c
            r4 = 0
            r3.setVisibility(r4)
            return r5
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean hasStableIds() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean isChildSelectable(int r1, int r2) {
            r0 = this;
            r1 = 0
            return r1
    }
}
