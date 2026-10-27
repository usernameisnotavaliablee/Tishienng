package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class u3 extends com.amap.api.offlineservice.a implements android.text.TextWatcher, android.view.View.OnTouchListener, android.widget.AbsListView.OnScrollListener, com.amap.api.maps.offlinemap.OfflineMapManager.OfflineLoadedListener, com.amap.api.maps.offlinemap.OfflineMapManager.OfflineMapDownloadListener {

    /* renamed from: b, reason: collision with root package name */
    private android.widget.ImageView f4005b;

    /* renamed from: c, reason: collision with root package name */
    private android.widget.RelativeLayout f4006c;

    /* renamed from: d, reason: collision with root package name */
    private com.amap.api.maps.offlinemap.DownLoadExpandListView f4007d;

    /* renamed from: e, reason: collision with root package name */
    private android.widget.ListView f4008e;

    /* renamed from: f, reason: collision with root package name */
    private android.widget.ExpandableListView f4009f;

    /* renamed from: g, reason: collision with root package name */
    private android.widget.ImageView f4010g;

    /* renamed from: h, reason: collision with root package name */
    private android.widget.ImageView f4011h;

    /* renamed from: i, reason: collision with root package name */
    private android.widget.AutoCompleteTextView f4012i;

    /* renamed from: j, reason: collision with root package name */
    private android.widget.RelativeLayout f4013j;

    /* renamed from: k, reason: collision with root package name */
    private android.widget.RelativeLayout f4014k;
    private android.widget.ImageView l;
    private android.widget.ImageView m;
    private android.widget.RelativeLayout n;
    private java.util.List<com.amap.api.maps.offlinemap.OfflineMapProvince> o;
    private com.amap.api.col.p0003l.o3 p;
    private com.amap.api.maps.offlinemap.OfflineMapManager q;
    private com.amap.api.col.p0003l.n3 r;
    private com.amap.api.col.p0003l.p3 s;
    private boolean t;
    private boolean u;
    private int v;
    private long w;
    private com.amap.api.col.p0003l.q3 x;
    private boolean y;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a implements android.view.View.OnClickListener {
        final /* synthetic */ com.amap.api.col.p0003l.u3 a;

        a(com.amap.api.col.p0003l.u3 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View r4) {
                r3 = this;
                com.amap.api.col.3l.u3 r4 = r3.a     // Catch: java.lang.Exception -> L4c
                android.widget.AutoCompleteTextView r4 = com.amap.api.col.p0003l.u3.i(r4)     // Catch: java.lang.Exception -> L4c
                java.lang.String r0 = ""
                r4.setText(r0)     // Catch: java.lang.Exception -> L4c
                com.amap.api.col.3l.u3 r4 = r3.a     // Catch: java.lang.Exception -> L4c
                android.widget.ImageView r4 = com.amap.api.col.p0003l.u3.l(r4)     // Catch: java.lang.Exception -> L4c
                r0 = 8
                r4.setVisibility(r0)     // Catch: java.lang.Exception -> L4c
                com.amap.api.col.3l.u3 r4 = r3.a     // Catch: java.lang.Exception -> L4c
                r0 = 0
                r4.k(r0)     // Catch: java.lang.Exception -> L4c
                com.amap.api.col.3l.u3 r4 = r3.a     // Catch: java.lang.Exception -> L4c
                android.widget.ImageView r4 = com.amap.api.col.p0003l.u3.m(r4)     // Catch: java.lang.Exception -> L4c
                android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()     // Catch: java.lang.Exception -> L4c
                android.widget.RelativeLayout$LayoutParams r4 = (android.widget.RelativeLayout.LayoutParams) r4     // Catch: java.lang.Exception -> L4c
                com.amap.api.col.3l.u3 r1 = r3.a     // Catch: java.lang.Exception -> L4c
                r2 = 1119748096(0x42be0000, float:95.0)
                int r1 = r1.a(r2)     // Catch: java.lang.Exception -> L4c
                r4.leftMargin = r1     // Catch: java.lang.Exception -> L4c
                com.amap.api.col.3l.u3 r1 = r3.a     // Catch: java.lang.Exception -> L4c
                android.widget.ImageView r1 = com.amap.api.col.p0003l.u3.m(r1)     // Catch: java.lang.Exception -> L4c
                r1.setLayoutParams(r4)     // Catch: java.lang.Exception -> L4c
                com.amap.api.col.3l.u3 r4 = r3.a     // Catch: java.lang.Exception -> L4c
                android.widget.AutoCompleteTextView r4 = com.amap.api.col.p0003l.u3.i(r4)     // Catch: java.lang.Exception -> L4c
                com.amap.api.col.3l.u3 r1 = r3.a     // Catch: java.lang.Exception -> L4c
                r2 = 1121058816(0x42d20000, float:105.0)
                int r1 = r1.a(r2)     // Catch: java.lang.Exception -> L4c
                r4.setPadding(r1, r0, r0, r0)     // Catch: java.lang.Exception -> L4c
            L4c:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class b implements java.util.Comparator<com.amap.api.maps.offlinemap.OfflineMapCity> {
        final /* synthetic */ com.amap.api.col.p0003l.u3 a;

        b(com.amap.api.col.p0003l.u3 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        private static int a(com.amap.api.maps.offlinemap.OfflineMapCity r4, com.amap.api.maps.offlinemap.OfflineMapCity r5) {
                java.lang.String r4 = r4.getJianpin()
                char[] r4 = r4.toCharArray()
                java.lang.String r5 = r5.getJianpin()
                char[] r5 = r5.toCharArray()
                r0 = 0
                char r1 = r4[r0]
                char r2 = r5[r0]
                r3 = 1
                if (r1 >= r2) goto L19
                return r3
            L19:
                char r4 = r4[r3]
                char r5 = r5[r3]
                if (r4 >= r5) goto L20
                return r3
            L20:
                return r0
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(com.amap.api.maps.offlinemap.OfflineMapCity r1, com.amap.api.maps.offlinemap.OfflineMapCity r2) {
                r0 = this;
                com.amap.api.maps.offlinemap.OfflineMapCity r1 = (com.amap.api.maps.offlinemap.OfflineMapCity) r1
                com.amap.api.maps.offlinemap.OfflineMapCity r2 = (com.amap.api.maps.offlinemap.OfflineMapCity) r2
                int r1 = a(r1, r2)
                return r1
        }
    }

    public u3() {
            r3 = this;
            r3.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.o = r0
            r0 = 0
            r3.q = r0
            r0 = 1
            r3.t = r0
            r3.u = r0
            r1 = -1
            r3.v = r1
            r1 = 0
            r3.w = r1
            r3.y = r0
            return
    }

    static /* synthetic */ android.widget.AutoCompleteTextView i(com.amap.api.col.p0003l.u3 r0) {
            android.widget.AutoCompleteTextView r0 = r0.f4012i
            return r0
    }

    static /* synthetic */ android.widget.ImageView l(com.amap.api.col.p0003l.u3 r0) {
            android.widget.ImageView r0 = r0.l
            return r0
    }

    static /* synthetic */ android.widget.ImageView m(com.amap.api.col.p0003l.u3 r0) {
            android.widget.ImageView r0 = r0.m
            return r0
    }

    private void n() {
            r3 = this;
            android.widget.ImageView r0 = r3.m     // Catch: java.lang.Exception -> L21
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()     // Catch: java.lang.Exception -> L21
            android.widget.RelativeLayout$LayoutParams r0 = (android.widget.RelativeLayout.LayoutParams) r0     // Catch: java.lang.Exception -> L21
            r1 = 1099956224(0x41900000, float:18.0)
            int r1 = r3.a(r1)     // Catch: java.lang.Exception -> L21
            r0.leftMargin = r1     // Catch: java.lang.Exception -> L21
            android.widget.ImageView r1 = r3.m     // Catch: java.lang.Exception -> L21
            r1.setLayoutParams(r0)     // Catch: java.lang.Exception -> L21
            android.widget.AutoCompleteTextView r0 = r3.f4012i     // Catch: java.lang.Exception -> L21
            r1 = 1106247680(0x41f00000, float:30.0)
            int r1 = r3.a(r1)     // Catch: java.lang.Exception -> L21
            r2 = 0
            r0.setPadding(r1, r2, r2, r2)     // Catch: java.lang.Exception -> L21
        L21:
            return
    }

    private void o() {
            r3 = this;
            r3.q()
            com.amap.api.col.3l.p3 r0 = new com.amap.api.col.3l.p3
            com.amap.api.maps.offlinemap.OfflineMapManager r1 = r3.q
            com.amap.api.maps.offlinemap.OfflineMapActivity r2 = r3.a
            r0.<init>(r1, r2)
            r3.s = r0
            android.widget.ListView r1 = r3.f4008e
            r1.setAdapter(r0)
            return
    }

    private void p() {
            r4 = this;
            com.amap.api.col.3l.n3 r0 = new com.amap.api.col.3l.n3
            com.amap.api.maps.offlinemap.OfflineMapActivity r1 = r4.a
            com.amap.api.maps.offlinemap.OfflineMapManager r2 = r4.q
            java.util.List<com.amap.api.maps.offlinemap.OfflineMapProvince> r3 = r4.o
            r0.<init>(r1, r4, r2, r3)
            r4.r = r0
            com.amap.api.maps.offlinemap.DownLoadExpandListView r1 = r4.f4007d
            r1.setAdapter(r0)
            com.amap.api.col.3l.n3 r0 = r4.r
            r0.notifyDataSetChanged()
            return
    }

    private void q() {
            r9 = this;
            com.amap.api.maps.offlinemap.OfflineMapManager r0 = r9.q
            java.util.ArrayList r0 = r0.getOfflineMapProvinceList()
            java.util.List<com.amap.api.maps.offlinemap.OfflineMapProvince> r1 = r9.o
            r1.clear()
            java.util.List<com.amap.api.maps.offlinemap.OfflineMapProvince> r1 = r9.o
            r2 = 0
            r1.add(r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = 0
            r5 = 0
        L22:
            int r6 = r0.size()
            if (r5 >= r6) goto L7f
            java.lang.Object r6 = r0.get(r5)
            com.amap.api.maps.offlinemap.OfflineMapProvince r6 = (com.amap.api.maps.offlinemap.OfflineMapProvince) r6
            java.util.ArrayList r7 = r6.getCityList()
            int r7 = r7.size()
            r8 = 1
            if (r7 == r8) goto L41
            java.util.List<com.amap.api.maps.offlinemap.OfflineMapProvince> r7 = r9.o
            int r8 = r5 + 1
            r7.add(r8, r6)
            goto L7c
        L41:
            java.lang.String r7 = r6.getProvinceName()
            java.lang.String r8 = "香港"
            boolean r8 = r7.contains(r8)
            if (r8 == 0) goto L55
            java.util.ArrayList r6 = r6.getCityList()
            r2.addAll(r6)
            goto L7c
        L55:
            java.lang.String r8 = "澳门"
            boolean r8 = r7.contains(r8)
            if (r8 == 0) goto L65
            java.util.ArrayList r6 = r6.getCityList()
            r2.addAll(r6)
            goto L7c
        L65:
            java.lang.String r8 = "全国概要图"
            boolean r7 = r7.contains(r8)
            if (r7 == 0) goto L75
            java.util.ArrayList r6 = r6.getCityList()
            r3.addAll(r4, r6)
            goto L7c
        L75:
            java.util.ArrayList r6 = r6.getCityList()
            r3.addAll(r6)
        L7c:
            int r5 = r5 + 1
            goto L22
        L7f:
            com.amap.api.maps.offlinemap.OfflineMapProvince r0 = new com.amap.api.maps.offlinemap.OfflineMapProvince
            r0.<init>()
            java.lang.String r5 = "基本功能包+直辖市"
            r0.setProvinceName(r5)
            r0.setCityList(r3)
            java.util.List<com.amap.api.maps.offlinemap.OfflineMapProvince> r3 = r9.o
            r3.set(r4, r0)
            com.amap.api.maps.offlinemap.OfflineMapProvince r0 = new com.amap.api.maps.offlinemap.OfflineMapProvince
            r0.<init>()
            java.lang.String r3 = "直辖市"
            r0.setProvinceName(r3)
            r0.setCityList(r1)
            com.amap.api.maps.offlinemap.OfflineMapProvince r0 = new com.amap.api.maps.offlinemap.OfflineMapProvince
            r0.<init>()
            java.lang.String r1 = "港澳"
            r0.setProvinceName(r1)
            r0.setCityList(r2)
            java.util.List<com.amap.api.maps.offlinemap.OfflineMapProvince> r1 = r9.o
            r1.add(r0)
            return
    }

    private void r() {
            r3 = this;
            android.widget.AutoCompleteTextView r0 = r3.f4012i
            if (r0 == 0) goto L2d
            boolean r0 = r0.isFocused()
            if (r0 == 0) goto L2d
            android.widget.AutoCompleteTextView r0 = r3.f4012i
            r0.clearFocus()
            com.amap.api.maps.offlinemap.OfflineMapActivity r0 = r3.a
            java.lang.String r1 = "input_method"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            if (r0 == 0) goto L20
            boolean r1 = r0.isActive()
            goto L21
        L20:
            r1 = 0
        L21:
            if (r1 == 0) goto L2d
            android.widget.AutoCompleteTextView r1 = r3.f4012i
            android.os.IBinder r1 = r1.getWindowToken()
            r2 = 2
            r0.hideSoftInputFromWindow(r1, r2)
        L2d:
            return
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable r1) {
            r0 = this;
            return
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }

    @Override // com.amap.api.offlineservice.a
    public final void c(android.view.View r6) {
            r5 = this;
            int r6 = r6.getId()     // Catch: java.lang.Exception -> L5c
            r0 = 2131165205(0x7f070015, float:1.794462E38)
            if (r6 != r0) goto Lf
            com.amap.api.maps.offlinemap.OfflineMapActivity r6 = r5.a     // Catch: java.lang.Exception -> L5c
            r6.closeScr()     // Catch: java.lang.Exception -> L5c
            return
        Lf:
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
            r1 = 1
            r2 = 2130837504(0x7f020000, float:1.7279964E38)
            r3 = 2130837508(0x7f020004, float:1.7279972E38)
            r4 = 0
            if (r6 != r0) goto L3a
            boolean r6 = r5.u     // Catch: java.lang.Exception -> L5c
            if (r6 == 0) goto L2d
            com.amap.api.maps.offlinemap.DownLoadExpandListView r6 = r5.f4007d     // Catch: java.lang.Exception -> L5c
            r0 = 8
            r6.setVisibility(r0)     // Catch: java.lang.Exception -> L5c
            android.widget.ImageView r6 = r5.f4010g     // Catch: java.lang.Exception -> L5c
            r6.setBackgroundResource(r3)     // Catch: java.lang.Exception -> L5c
            r5.u = r4     // Catch: java.lang.Exception -> L5c
            return
        L2d:
            com.amap.api.maps.offlinemap.DownLoadExpandListView r6 = r5.f4007d     // Catch: java.lang.Exception -> L5c
            r6.setVisibility(r4)     // Catch: java.lang.Exception -> L5c
            android.widget.ImageView r6 = r5.f4010g     // Catch: java.lang.Exception -> L5c
            r6.setBackgroundResource(r2)     // Catch: java.lang.Exception -> L5c
            r5.u = r1     // Catch: java.lang.Exception -> L5c
            return
        L3a:
            r0 = 2131165189(0x7f070005, float:1.7944588E38)
            if (r6 != r0) goto L5c
            boolean r6 = r5.t     // Catch: java.lang.Exception -> L5c
            if (r6 == 0) goto L50
            com.amap.api.col.3l.o3 r6 = r5.p     // Catch: java.lang.Exception -> L5c
            r6.c()     // Catch: java.lang.Exception -> L5c
            android.widget.ImageView r6 = r5.f4011h     // Catch: java.lang.Exception -> L5c
            r6.setBackgroundResource(r3)     // Catch: java.lang.Exception -> L5c
            r5.t = r4     // Catch: java.lang.Exception -> L5c
            return
        L50:
            com.amap.api.col.3l.o3 r6 = r5.p     // Catch: java.lang.Exception -> L5c
            r6.a()     // Catch: java.lang.Exception -> L5c
            android.widget.ImageView r6 = r5.f4011h     // Catch: java.lang.Exception -> L5c
            r6.setBackgroundResource(r2)     // Catch: java.lang.Exception -> L5c
            r5.t = r1     // Catch: java.lang.Exception -> L5c
        L5c:
            return
    }

    @Override // com.amap.api.offlineservice.a
    public final void e() {
            r5 = this;
            com.amap.api.maps.offlinemap.OfflineMapActivity r0 = r5.a
            r1 = 2130903040(0x7f030000, float:1.7412887E38)
            android.view.View r0 = com.amap.api.col.p0003l.x3.d(r0, r1)
            r1 = 2131165187(0x7f070003, float:1.7944584E38)
            android.view.View r1 = r0.findViewById(r1)
            com.amap.api.maps.offlinemap.DownLoadExpandListView r1 = (com.amap.api.maps.offlinemap.DownLoadExpandListView) r1
            r5.f4007d = r1
            r1.setOnTouchListener(r5)
            r1 = 2131165184(0x7f070000, float:1.7944578E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            r5.f4013j = r1
            r1 = 2131165186(0x7f070002, float:1.7944582E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r5.f4010g = r1
            android.widget.RelativeLayout r1 = r5.f4013j
            com.amap.api.maps.offlinemap.OfflineMapActivity r2 = r5.a
            r1.setOnClickListener(r2)
            r1 = 2131165189(0x7f070005, float:1.7944588E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            r5.f4014k = r1
            r1 = 2131165190(0x7f070006, float:1.794459E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r5.f4011h = r1
            android.widget.RelativeLayout r1 = r5.f4014k
            com.amap.api.maps.offlinemap.OfflineMapActivity r2 = r5.a
            r1.setOnClickListener(r2)
            r1 = 2131165188(0x7f070004, float:1.7944586E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            r5.n = r1
            android.widget.RelativeLayout r1 = r5.f4006c
            r2 = 2131165205(0x7f070015, float:1.794462E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r5.f4005b = r1
            com.amap.api.maps.offlinemap.OfflineMapActivity r2 = r5.a
            r1.setOnClickListener(r2)
            android.widget.RelativeLayout r1 = r5.f4006c
            r2 = 2131165207(0x7f070017, float:1.7944625E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r5.m = r1
            android.widget.RelativeLayout r1 = r5.f4006c
            r2 = 2131165209(0x7f070019, float:1.7944629E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r5.l = r1
            com.amap.api.col.3l.u3$a r2 = new com.amap.api.col.3l.u3$a
            r2.<init>(r5)
            r1.setOnClickListener(r2)
            android.widget.RelativeLayout r1 = r5.f4006c
            r2 = 2131165210(0x7f07001a, float:1.794463E38)
            android.view.View r1 = r1.findViewById(r2)
            r1.setOnTouchListener(r5)
            android.widget.RelativeLayout r1 = r5.f4006c
            r2 = 2131165208(0x7f070018, float:1.7944627E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.AutoCompleteTextView r1 = (android.widget.AutoCompleteTextView) r1
            r5.f4012i = r1
            r1.addTextChangedListener(r5)
            android.widget.AutoCompleteTextView r1 = r5.f4012i
            r1.setOnTouchListener(r5)
            android.widget.RelativeLayout r1 = r5.f4006c
            r2 = 2131165212(0x7f07001c, float:1.7944635E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.ListView r1 = (android.widget.ListView) r1
            r5.f4008e = r1
            android.widget.RelativeLayout r1 = r5.f4006c
            r2 = 2131165211(0x7f07001b, float:1.7944633E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.ExpandableListView r1 = (android.widget.ExpandableListView) r1
            r5.f4009f = r1
            r1.addHeaderView(r0)
            android.widget.ExpandableListView r0 = r5.f4009f
            r0.setOnTouchListener(r5)
            android.widget.ExpandableListView r0 = r5.f4009f
            r0.setOnScrollListener(r5)
            com.amap.api.maps.offlinemap.OfflineMapManager r0 = new com.amap.api.maps.offlinemap.OfflineMapManager     // Catch: java.lang.Exception -> Le3
            com.amap.api.maps.offlinemap.OfflineMapActivity r1 = r5.a     // Catch: java.lang.Exception -> Le3
            r0.<init>(r1, r5)     // Catch: java.lang.Exception -> Le3
            r5.q = r0     // Catch: java.lang.Exception -> Le3
            r0.setOnOfflineLoadedListener(r5)     // Catch: java.lang.Exception -> Le3
            goto Led
        Le3:
            r0 = move-exception
            java.lang.String r1 = "e="
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.concat(r0)
        Led:
            r5.q()
            com.amap.api.col.3l.o3 r0 = new com.amap.api.col.3l.o3
            java.util.List<com.amap.api.maps.offlinemap.OfflineMapProvince> r1 = r5.o
            com.amap.api.maps.offlinemap.OfflineMapManager r2 = r5.q
            com.amap.api.maps.offlinemap.OfflineMapActivity r3 = r5.a
            r0.<init>(r1, r2, r3)
            r5.p = r0
            android.widget.ExpandableListView r1 = r5.f4009f
            r1.setAdapter(r0)
            android.widget.ExpandableListView r0 = r5.f4009f
            com.amap.api.col.3l.o3 r1 = r5.p
            r0.setOnGroupCollapseListener(r1)
            android.widget.ExpandableListView r0 = r5.f4009f
            com.amap.api.col.3l.o3 r1 = r5.p
            r0.setOnGroupExpandListener(r1)
            android.widget.ExpandableListView r0 = r5.f4009f
            r1 = 0
            r0.setGroupIndicator(r1)
            boolean r0 = r5.t
            r1 = 8
            r2 = 2130837508(0x7f020004, float:1.7279972E38)
            r3 = 0
            r4 = 2130837504(0x7f020000, float:1.7279964E38)
            if (r0 == 0) goto L12d
            android.widget.ImageView r0 = r5.f4011h
            r0.setBackgroundResource(r4)
            android.widget.ExpandableListView r0 = r5.f4009f
            r0.setVisibility(r3)
            goto L137
        L12d:
            android.widget.ImageView r0 = r5.f4011h
            r0.setBackgroundResource(r2)
            android.widget.ExpandableListView r0 = r5.f4009f
            r0.setVisibility(r1)
        L137:
            boolean r0 = r5.u
            if (r0 == 0) goto L146
            android.widget.ImageView r0 = r5.f4010g
            r0.setBackgroundResource(r4)
            com.amap.api.maps.offlinemap.DownLoadExpandListView r0 = r5.f4007d
            r0.setVisibility(r3)
            return
        L146:
            android.widget.ImageView r0 = r5.f4010g
            r0.setBackgroundResource(r2)
            com.amap.api.maps.offlinemap.DownLoadExpandListView r0 = r5.f4007d
            r0.setVisibility(r1)
            return
    }

    @Override // com.amap.api.offlineservice.a
    public final boolean f() {
            r2 = this;
            android.widget.ListView r0 = r2.f4008e     // Catch: java.lang.Exception -> L1b
            int r0 = r0.getVisibility()     // Catch: java.lang.Exception -> L1b
            if (r0 != 0) goto L1b
            android.widget.AutoCompleteTextView r0 = r2.f4012i     // Catch: java.lang.Exception -> L1b
            java.lang.String r1 = ""
            r0.setText(r1)     // Catch: java.lang.Exception -> L1b
            android.widget.ImageView r0 = r2.l     // Catch: java.lang.Exception -> L1b
            r1 = 8
            r0.setVisibility(r1)     // Catch: java.lang.Exception -> L1b
            r0 = 0
            r2.k(r0)     // Catch: java.lang.Exception -> L1b
            return r0
        L1b:
            boolean r0 = super.f()
            return r0
    }

    @Override // com.amap.api.offlineservice.a
    public final android.widget.RelativeLayout g() {
            r2 = this;
            android.widget.RelativeLayout r0 = r2.f4006c
            if (r0 != 0) goto L11
            com.amap.api.maps.offlinemap.OfflineMapActivity r0 = r2.a
            r1 = 2130903044(0x7f030004, float:1.7412895E38)
            android.view.View r0 = com.amap.api.col.p0003l.x3.d(r0, r1)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r2.f4006c = r0
        L11:
            android.widget.RelativeLayout r0 = r2.f4006c
            return r0
    }

    @Override // com.amap.api.offlineservice.a
    public final void h() {
            r1 = this;
            com.amap.api.maps.offlinemap.OfflineMapManager r0 = r1.q
            r0.destroy()
            return
    }

    public final void j(com.amap.api.maps.offlinemap.OfflineMapCity r4) {
            r3 = this;
            com.amap.api.col.3l.q3 r0 = r3.x     // Catch: java.lang.Exception -> L21
            if (r0 != 0) goto Lf
            com.amap.api.col.3l.q3 r0 = new com.amap.api.col.3l.q3     // Catch: java.lang.Exception -> L21
            com.amap.api.maps.offlinemap.OfflineMapActivity r1 = r3.a     // Catch: java.lang.Exception -> L21
            com.amap.api.maps.offlinemap.OfflineMapManager r2 = r3.q     // Catch: java.lang.Exception -> L21
            r0.<init>(r1, r2)     // Catch: java.lang.Exception -> L21
            r3.x = r0     // Catch: java.lang.Exception -> L21
        Lf:
            com.amap.api.col.3l.q3 r0 = r3.x     // Catch: java.lang.Exception -> L21
            int r1 = r4.getState()     // Catch: java.lang.Exception -> L21
            java.lang.String r4 = r4.getCity()     // Catch: java.lang.Exception -> L21
            r0.c(r1, r4)     // Catch: java.lang.Exception -> L21
            com.amap.api.col.3l.q3 r4 = r3.x     // Catch: java.lang.Exception -> L21
            r4.show()     // Catch: java.lang.Exception -> L21
        L21:
            return
    }

    public final void k(boolean r4) {
            r3 = this;
            r0 = 0
            r1 = 8
            if (r4 == 0) goto L24
            android.widget.RelativeLayout r4 = r3.f4013j
            r4.setVisibility(r1)
            android.widget.RelativeLayout r4 = r3.f4014k
            r4.setVisibility(r1)
            com.amap.api.maps.offlinemap.DownLoadExpandListView r4 = r3.f4007d
            r4.setVisibility(r1)
            android.widget.ExpandableListView r4 = r3.f4009f
            r4.setVisibility(r1)
            android.widget.RelativeLayout r4 = r3.n
            r4.setVisibility(r1)
            android.widget.ListView r4 = r3.f4008e
            r4.setVisibility(r0)
            return
        L24:
            android.widget.RelativeLayout r4 = r3.f4013j
            r4.setVisibility(r0)
            android.widget.RelativeLayout r4 = r3.f4014k
            r4.setVisibility(r0)
            android.widget.RelativeLayout r4 = r3.n
            r4.setVisibility(r0)
            com.amap.api.maps.offlinemap.DownLoadExpandListView r4 = r3.f4007d
            boolean r2 = r3.u
            if (r2 == 0) goto L3b
            r2 = 0
            goto L3d
        L3b:
            r2 = 8
        L3d:
            r4.setVisibility(r2)
            android.widget.ExpandableListView r4 = r3.f4009f
            boolean r2 = r3.t
            if (r2 == 0) goto L47
            goto L49
        L47:
            r0 = 8
        L49:
            r4.setVisibility(r0)
            android.widget.ListView r4 = r3.f4008e
            r4.setVisibility(r1)
            return
    }

    @Override // com.amap.api.maps.offlinemap.OfflineMapManager.OfflineMapDownloadListener
    public final void onCheckUpdate(boolean r1, java.lang.String r2) {
            r0 = this;
            return
    }

    @Override // com.amap.api.maps.offlinemap.OfflineMapManager.OfflineMapDownloadListener
    public final void onDownload(int r3, int r4, java.lang.String r5) {
            r2 = this;
            r4 = 101(0x65, float:1.42E-43)
            if (r3 == r4) goto L5
            goto L16
        L5:
            com.amap.api.maps.offlinemap.OfflineMapActivity r4 = r2.a     // Catch: java.lang.Exception -> L56
            java.lang.String r5 = "网络异常"
            r0 = 0
            android.widget.Toast r4 = android.widget.Toast.makeText(r4, r5, r0)     // Catch: java.lang.Exception -> L56
            r4.show()     // Catch: java.lang.Exception -> L56
            com.amap.api.maps.offlinemap.OfflineMapManager r4 = r2.q     // Catch: java.lang.Exception -> L56
            r4.pause()     // Catch: java.lang.Exception -> L56
        L16:
            r4 = 2
            if (r3 != r4) goto L1e
            com.amap.api.col.3l.n3 r4 = r2.r     // Catch: java.lang.Exception -> L56
            r4.b()     // Catch: java.lang.Exception -> L56
        L1e:
            int r4 = r2.v     // Catch: java.lang.Exception -> L56
            if (r4 == r3) goto L3a
            com.amap.api.col.3l.o3 r4 = r2.p     // Catch: java.lang.Exception -> L56
            if (r4 == 0) goto L29
            r4.notifyDataSetChanged()     // Catch: java.lang.Exception -> L56
        L29:
            com.amap.api.col.3l.n3 r4 = r2.r     // Catch: java.lang.Exception -> L56
            if (r4 == 0) goto L30
            r4.notifyDataSetChanged()     // Catch: java.lang.Exception -> L56
        L30:
            com.amap.api.col.3l.p3 r4 = r2.s     // Catch: java.lang.Exception -> L56
            if (r4 == 0) goto L37
            r4.notifyDataSetChanged()     // Catch: java.lang.Exception -> L56
        L37:
            r2.v = r3     // Catch: java.lang.Exception -> L56
            return
        L3a:
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L56
            long r0 = r2.w     // Catch: java.lang.Exception -> L56
            long r3 = r3 - r0
            r0 = 1200(0x4b0, double:5.93E-321)
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 <= 0) goto L56
            boolean r3 = r2.y     // Catch: java.lang.Exception -> L56
            if (r3 == 0) goto L50
            com.amap.api.col.3l.n3 r3 = r2.r     // Catch: java.lang.Exception -> L56
            r3.notifyDataSetChanged()     // Catch: java.lang.Exception -> L56
        L50:
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L56
            r2.w = r3     // Catch: java.lang.Exception -> L56
        L56:
            return
    }

    @Override // com.amap.api.maps.offlinemap.OfflineMapManager.OfflineMapDownloadListener
    public final void onRemove(boolean r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            com.amap.api.col.3l.n3 r1 = r0.r
            if (r1 == 0) goto L7
            r1.c()
        L7:
            return
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(android.widget.AbsListView r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(android.widget.AbsListView r1, int r2) {
            r0 = this;
            r1 = 2
            if (r2 != r1) goto L7
            r1 = 0
            r0.y = r1
            return
        L7:
            r1 = 1
            r0.y = r1
            return
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(java.lang.CharSequence r7, int r8, int r9, int r10) {
            r6 = this;
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            r9 = 0
            if (r8 == 0) goto L12
            r6.k(r9)
            android.widget.ImageView r7 = r6.l
            r8 = 8
            r7.setVisibility(r8)
            return
        L12:
            android.widget.ImageView r8 = r6.l
            r8.setVisibility(r9)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.List<com.amap.api.maps.offlinemap.OfflineMapProvince> r10 = r6.o
            r0 = 1
            if (r10 == 0) goto L98
            int r10 = r10.size()
            if (r10 <= 0) goto L98
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.List<com.amap.api.maps.offlinemap.OfflineMapProvince> r1 = r6.o
            java.util.Iterator r1 = r1.iterator()
        L32:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L46
            java.lang.Object r2 = r1.next()
            com.amap.api.maps.offlinemap.OfflineMapProvince r2 = (com.amap.api.maps.offlinemap.OfflineMapProvince) r2
            java.util.ArrayList r2 = r2.getCityList()
            r10.addAll(r2)
            goto L32
        L46:
            java.util.Iterator r10 = r10.iterator()
        L4a:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L98
            java.lang.Object r1 = r10.next()
            com.amap.api.maps.offlinemap.OfflineMapCity r1 = (com.amap.api.maps.offlinemap.OfflineMapCity) r1
            java.lang.String r2 = r1.getCity()
            java.lang.String r3 = r1.getPinyin()
            java.lang.String r4 = r1.getJianpin()
            int r5 = r7.length()
            if (r5 != r0) goto L76
            java.lang.String r2 = java.lang.String.valueOf(r7)
            boolean r2 = r4.startsWith(r2)
            if (r2 == 0) goto L4a
            r8.add(r1)
            goto L4a
        L76:
            java.lang.String r5 = java.lang.String.valueOf(r7)
            boolean r4 = r4.startsWith(r5)
            if (r4 != 0) goto L94
            java.lang.String r4 = java.lang.String.valueOf(r7)
            boolean r3 = r3.startsWith(r4)
            if (r3 != 0) goto L94
            java.lang.String r3 = java.lang.String.valueOf(r7)
            boolean r2 = r2.startsWith(r3)
            if (r2 == 0) goto L4a
        L94:
            r8.add(r1)
            goto L4a
        L98:
            int r7 = r8.size()
            if (r7 <= 0) goto Lb6
            r6.k(r0)
            com.amap.api.col.3l.u3$b r7 = new com.amap.api.col.3l.u3$b
            r7.<init>(r6)
            java.util.Collections.sort(r8, r7)
            com.amap.api.col.3l.p3 r7 = r6.s
            if (r7 == 0) goto Lb5
            r7.b(r8)
            com.amap.api.col.3l.p3 r7 = r6.s
            r7.notifyDataSetChanged()
        Lb5:
            return
        Lb6:
            com.amap.api.maps.offlinemap.OfflineMapActivity r7 = r6.a
            java.lang.String r8 = "未找到相关城市"
            android.widget.Toast r7 = android.widget.Toast.makeText(r7, r8, r9)
            r7.show()
            return
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View r1, android.view.MotionEvent r2) {
            r0 = this;
            r0.r()
            int r1 = r1.getId()
            r2 = 2131165208(0x7f070018, float:1.7944627E38)
            if (r1 != r2) goto Lf
            r0.n()
        Lf:
            r1 = 0
            return r1
    }

    @Override // com.amap.api.maps.offlinemap.OfflineMapManager.OfflineLoadedListener
    public final void onVerifyComplete() {
            r0 = this;
            r0.o()
            r0.p()
            return
    }
}
