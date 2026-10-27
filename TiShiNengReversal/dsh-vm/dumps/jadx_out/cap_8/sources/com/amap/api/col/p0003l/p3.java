package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class p3 extends android.widget.BaseAdapter {
    private java.util.List<com.amap.api.maps.offlinemap.OfflineMapCity> a;

    /* renamed from: b, reason: collision with root package name */
    private com.amap.api.maps.offlinemap.OfflineMapManager f3742b;

    /* renamed from: c, reason: collision with root package name */
    private android.app.Activity f3743c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a implements android.view.View.OnClickListener {
        final /* synthetic */ com.amap.api.col.3l.p3.b a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.maps.offlinemap.OfflineMapCity f3744b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.p3 f3745c;

        a(com.amap.api.col.p0003l.p3 r1, com.amap.api.col.3l.p3.b r2, com.amap.api.maps.offlinemap.OfflineMapCity r3) {
                r0 = this;
                r0.f3745c = r1
                r0.a = r2
                r0.f3744b = r3
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View r2) {
                r1 = this;
                com.amap.api.col.3l.p3$b r2 = r1.a
                android.widget.ImageView r2 = r2.f3748d
                r0 = 8
                r2.setVisibility(r0)
                com.amap.api.col.3l.p3$b r2 = r1.a
                android.widget.TextView r2 = r2.f3747c
                r0 = 0
                r2.setVisibility(r0)
                com.amap.api.col.3l.p3$b r2 = r1.a
                android.widget.TextView r2 = r2.f3747c
                java.lang.String r0 = "下载中"
                r2.setText(r0)
                com.amap.api.col.3l.p3 r2 = r1.f3745c     // Catch: com.amap.api.maps.AMapException -> L29
                com.amap.api.maps.offlinemap.OfflineMapManager r2 = com.amap.api.col.p0003l.p3.a(r2)     // Catch: com.amap.api.maps.AMapException -> L29
                com.amap.api.maps.offlinemap.OfflineMapCity r0 = r1.f3744b     // Catch: com.amap.api.maps.AMapException -> L29
                java.lang.String r0 = r0.getCity()     // Catch: com.amap.api.maps.AMapException -> L29
                r2.downloadByCityName(r0)     // Catch: com.amap.api.maps.AMapException -> L29
            L29:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public final class b {
        public android.widget.TextView a;

        /* renamed from: b, reason: collision with root package name */
        public android.widget.TextView f3746b;

        /* renamed from: c, reason: collision with root package name */
        public android.widget.TextView f3747c;

        /* renamed from: d, reason: collision with root package name */
        public android.widget.ImageView f3748d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.p3 f3749e;

        public b(com.amap.api.col.p0003l.p3 r1) {
                r0 = this;
                r0.f3749e = r1
                r0.<init>()
                return
        }
    }

    public p3(com.amap.api.maps.offlinemap.OfflineMapManager r2, com.amap.api.maps.offlinemap.OfflineMapActivity r3) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a = r0
            r1.f3742b = r2
            r1.f3743c = r3
            return
    }

    static /* synthetic */ com.amap.api.maps.offlinemap.OfflineMapManager a(com.amap.api.col.p0003l.p3 r0) {
            com.amap.api.maps.offlinemap.OfflineMapManager r0 = r0.f3742b
            return r0
    }

    public final void b(java.util.List<com.amap.api.maps.offlinemap.OfflineMapCity> r1) {
            r0 = this;
            r0.a = r1
            return
    }

    @Override // android.widget.Adapter
    public final int getCount() {
            r1 = this;
            java.util.List<com.amap.api.maps.offlinemap.OfflineMapCity> r0 = r1.a
            int r0 = r0.size()
            return r0
    }

    @Override // android.widget.Adapter
    public final java.lang.Object getItem(int r2) {
            r1 = this;
            java.util.List<com.amap.api.maps.offlinemap.OfflineMapCity> r0 = r1.a
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // android.widget.Adapter
    public final long getItemId(int r3) {
            r2 = this;
            long r0 = (long) r3
            return r0
    }

    @Override // android.widget.Adapter
    public final android.view.View getView(int r7, android.view.View r8, android.view.ViewGroup r9) {
            r6 = this;
            java.util.List<com.amap.api.maps.offlinemap.OfflineMapCity> r9 = r6.a     // Catch: java.lang.Exception -> Lfa
            java.lang.Object r7 = r9.get(r7)     // Catch: java.lang.Exception -> Lfa
            com.amap.api.maps.offlinemap.OfflineMapCity r7 = (com.amap.api.maps.offlinemap.OfflineMapCity) r7     // Catch: java.lang.Exception -> Lfa
            if (r8 != 0) goto L48
            com.amap.api.col.3l.p3$b r9 = new com.amap.api.col.3l.p3$b     // Catch: java.lang.Exception -> Lfa
            r9.<init>(r6)     // Catch: java.lang.Exception -> Lfa
            android.app.Activity r0 = r6.f3743c     // Catch: java.lang.Exception -> Lfa
            r1 = 2130903042(0x7f030002, float:1.741289E38)
            android.view.View r8 = com.amap.api.col.p0003l.x3.d(r0, r1)     // Catch: java.lang.Exception -> Lfa
            r0 = 2131165195(0x7f07000b, float:1.79446E38)
            android.view.View r0 = r8.findViewById(r0)     // Catch: java.lang.Exception -> Lfa
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch: java.lang.Exception -> Lfa
            r9.a = r0     // Catch: java.lang.Exception -> Lfa
            r0 = 2131165199(0x7f07000f, float:1.7944608E38)
            android.view.View r0 = r8.findViewById(r0)     // Catch: java.lang.Exception -> Lfa
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch: java.lang.Exception -> Lfa
            r9.f3746b = r0     // Catch: java.lang.Exception -> Lfa
            r0 = 2131165197(0x7f07000d, float:1.7944604E38)
            android.view.View r0 = r8.findViewById(r0)     // Catch: java.lang.Exception -> Lfa
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch: java.lang.Exception -> Lfa
            r9.f3747c = r0     // Catch: java.lang.Exception -> Lfa
            r0 = 2131165198(0x7f07000e, float:1.7944606E38)
            android.view.View r0 = r8.findViewById(r0)     // Catch: java.lang.Exception -> Lfa
            android.widget.ImageView r0 = (android.widget.ImageView) r0     // Catch: java.lang.Exception -> Lfa
            r9.f3748d = r0     // Catch: java.lang.Exception -> Lfa
            r8.setTag(r9)     // Catch: java.lang.Exception -> Lfa
            goto L4e
        L48:
            java.lang.Object r9 = r8.getTag()     // Catch: java.lang.Exception -> Lfa
            com.amap.api.col.3l.p3$b r9 = (com.amap.api.col.3l.p3.b) r9     // Catch: java.lang.Exception -> Lfa
        L4e:
            android.widget.ImageView r0 = r9.f3748d     // Catch: java.lang.Exception -> Lfa
            com.amap.api.col.3l.p3$a r1 = new com.amap.api.col.3l.p3$a     // Catch: java.lang.Exception -> Lfa
            r1.<init>(r6, r9, r7)     // Catch: java.lang.Exception -> Lfa
            r0.setOnClickListener(r1)     // Catch: java.lang.Exception -> Lfa
            android.widget.TextView r0 = r9.f3747c     // Catch: java.lang.Exception -> Lfa
            r1 = 0
            r0.setVisibility(r1)     // Catch: java.lang.Exception -> Lfa
            android.widget.TextView r0 = r9.a     // Catch: java.lang.Exception -> Lfa
            java.lang.String r2 = r7.getCity()     // Catch: java.lang.Exception -> Lfa
            r0.setText(r2)     // Catch: java.lang.Exception -> Lfa
            long r2 = r7.getSize()     // Catch: java.lang.Exception -> Lfa
            double r2 = (double) r2     // Catch: java.lang.Exception -> Lfa
            r4 = 4652218415073722368(0x4090000000000000, double:1024.0)
            double r2 = r2 / r4
            double r2 = r2 / r4
            r4 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r2 = r2 * r4
            int r0 = (int) r2     // Catch: java.lang.Exception -> Lfa
            double r2 = (double) r0     // Catch: java.lang.Exception -> Lfa
            double r2 = r2 / r4
            android.widget.TextView r0 = r9.f3746b     // Catch: java.lang.Exception -> Lfa
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lfa
            r4.<init>()     // Catch: java.lang.Exception -> Lfa
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Exception -> Lfa
            r4.append(r2)     // Catch: java.lang.Exception -> Lfa
            java.lang.String r2 = " M"
            r4.append(r2)     // Catch: java.lang.Exception -> Lfa
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Exception -> Lfa
            r0.setText(r2)     // Catch: java.lang.Exception -> Lfa
            int r7 = r7.getState()     // Catch: java.lang.Exception -> Lfa
            r0 = -1
            r2 = 8
            if (r7 == r0) goto Lee
            if (r7 == 0) goto Le1
            r0 = 1
            if (r7 == r0) goto Le1
            r0 = 2
            if (r7 == r0) goto Ld4
            r0 = 3
            if (r7 == r0) goto Lc7
            r0 = 4
            if (r7 == r0) goto Lba
            r0 = 6
            if (r7 == r0) goto Laf
            switch(r7) {
                case 101: goto Lee;
                case 102: goto Lee;
                case 103: goto Lee;
                default: goto Lae;
            }     // Catch: java.lang.Exception -> Lfa
        Lae:
            return r8
        Laf:
            android.widget.ImageView r7 = r9.f3748d     // Catch: java.lang.Exception -> Lfa
            r7.setVisibility(r1)     // Catch: java.lang.Exception -> Lfa
            android.widget.TextView r7 = r9.f3747c     // Catch: java.lang.Exception -> Lfa
            r7.setVisibility(r2)     // Catch: java.lang.Exception -> Lfa
            return r8
        Lba:
            android.widget.ImageView r7 = r9.f3748d     // Catch: java.lang.Exception -> Lfa
            r7.setVisibility(r2)     // Catch: java.lang.Exception -> Lfa
            android.widget.TextView r7 = r9.f3747c     // Catch: java.lang.Exception -> Lfa
            java.lang.String r9 = "已下载"
            r7.setText(r9)     // Catch: java.lang.Exception -> Lfa
            return r8
        Lc7:
            android.widget.ImageView r7 = r9.f3748d     // Catch: java.lang.Exception -> Lfa
            r7.setVisibility(r2)     // Catch: java.lang.Exception -> Lfa
            android.widget.TextView r7 = r9.f3747c     // Catch: java.lang.Exception -> Lfa
            java.lang.String r9 = "暂停中"
            r7.setText(r9)     // Catch: java.lang.Exception -> Lfa
            return r8
        Ld4:
            android.widget.ImageView r7 = r9.f3748d     // Catch: java.lang.Exception -> Lfa
            r7.setVisibility(r2)     // Catch: java.lang.Exception -> Lfa
            android.widget.TextView r7 = r9.f3747c     // Catch: java.lang.Exception -> Lfa
            java.lang.String r9 = "等待下载"
            r7.setText(r9)     // Catch: java.lang.Exception -> Lfa
            return r8
        Le1:
            android.widget.ImageView r7 = r9.f3748d     // Catch: java.lang.Exception -> Lfa
            r7.setVisibility(r2)     // Catch: java.lang.Exception -> Lfa
            android.widget.TextView r7 = r9.f3747c     // Catch: java.lang.Exception -> Lfa
            java.lang.String r9 = "下载中"
            r7.setText(r9)     // Catch: java.lang.Exception -> Lfa
            return r8
        Lee:
            android.widget.ImageView r7 = r9.f3748d     // Catch: java.lang.Exception -> Lfa
            r7.setVisibility(r2)     // Catch: java.lang.Exception -> Lfa
            android.widget.TextView r7 = r9.f3747c     // Catch: java.lang.Exception -> Lfa
            java.lang.String r9 = "下载失败"
            r7.setText(r9)     // Catch: java.lang.Exception -> Lfa
        Lfa:
            return r8
    }
}
