package cn.bluemobi.dylan.base.adapter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c extends android.widget.BaseAdapter {
    private java.util.List<java.lang.String> a;

    /* renamed from: b, reason: collision with root package name */
    private android.content.Context f32b;

    /* renamed from: c, reason: collision with root package name */
    private android.view.LayoutInflater f33c;

    /* renamed from: d, reason: collision with root package name */
    private int f34d;

    /* renamed from: e, reason: collision with root package name */
    private int f35e;

    /* renamed from: f, reason: collision with root package name */
    private int f36f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.view.View.OnClickListener {
        final /* synthetic */ java.io.File a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f37b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ cn.bluemobi.dylan.base.adapter.c f38c;

        a(cn.bluemobi.dylan.base.adapter.c r1, java.io.File r2, int r3) {
                r0 = this;
                r0.f38c = r1
                r0.a = r2
                r0.f37b = r3
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r2) {
                r1 = this;
                java.io.File r2 = r1.a
                boolean r2 = r2.exists()
                if (r2 == 0) goto Ld
                java.io.File r2 = r1.a
                r2.delete()
            Ld:
                cn.bluemobi.dylan.base.adapter.c r2 = r1.f38c
                java.util.List r2 = cn.bluemobi.dylan.base.adapter.c.a(r2)
                int r0 = r1.f37b
                r2.remove(r0)
                cn.bluemobi.dylan.base.adapter.c r2 = r1.f38c
                r2.notifyDataSetChanged()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class b {
        public final android.widget.ImageView a;

        /* renamed from: b, reason: collision with root package name */
        public final android.widget.Button f39b;

        /* renamed from: c, reason: collision with root package name */
        public final android.view.View f40c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ cn.bluemobi.dylan.base.adapter.c f41d;

        public b(cn.bluemobi.dylan.base.adapter.c r1, android.view.View r2) {
                r0 = this;
                r0.f41d = r1
                r0.<init>()
                int r1 = cn.bluemobi.dylan.base.R.id.iv_image
                android.view.View r1 = r2.findViewById(r1)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                r0.a = r1
                int r1 = cn.bluemobi.dylan.base.R.id.bt_del
                android.view.View r1 = r2.findViewById(r1)
                android.widget.Button r1 = (android.widget.Button) r1
                r0.f39b = r1
                r0.f40c = r2
                return
        }
    }

    public c(java.util.List<java.lang.String> r2, android.content.Context r3, int r4, int r5) {
            r1 = this;
            r1.<init>()
            int r0 = cn.bluemobi.dylan.base.R.drawable.image_add
            r1.f35e = r0
            r0 = 9
            r1.f36f = r0
            r1.a = r2
            r1.f32b = r3
            android.content.res.Resources r2 = r3.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            int r0 = r4 + 1
            int r5 = r5 * r0
            int r2 = r2 - r5
            int r2 = r2 / r4
            r1.f34d = r2
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r3)
            r1.f33c = r2
            return
    }

    static /* synthetic */ java.util.List a(cn.bluemobi.dylan.base.adapter.c r0) {
            java.util.List<java.lang.String> r0 = r0.a
            return r0
    }

    public int b() {
            r1 = this;
            int r0 = r1.f36f
            return r0
    }

    public void c(java.util.List<java.lang.String> r1) {
            r0 = this;
            r0.a = r1
            r0.notifyDataSetChanged()
            return
    }

    public cn.bluemobi.dylan.base.adapter.c d(int r1) {
            r0 = this;
            r0.f35e = r1
            return r0
    }

    public cn.bluemobi.dylan.base.adapter.c e(int r1) {
            r0 = this;
            r0.f36f = r1
            return r0
    }

    @Override // android.widget.Adapter
    public int getCount() {
            r2 = this;
            java.util.List<java.lang.String> r0 = r2.a
            r1 = 1
            if (r0 != 0) goto L6
            goto Lb
        L6:
            int r0 = r0.size()
            int r1 = r1 + r0
        Lb:
            int r0 = r2.f36f
            if (r1 <= r0) goto L16
            java.util.List<java.lang.String> r0 = r2.a
            int r0 = r0.size()
            return r0
        L16:
            return r1
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.widget.Adapter
    public long getItemId(int r3) {
            r2 = this;
            r0 = 0
            return r0
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
            r5 = this;
            r0 = 0
            if (r7 != 0) goto L1f
            android.view.LayoutInflater r7 = r5.f33c
            int r1 = cn.bluemobi.dylan.base.R.layout.pub_item_grid_add_image
            android.view.View r7 = r7.inflate(r1, r8, r0)
            android.widget.AbsListView$LayoutParams r8 = new android.widget.AbsListView$LayoutParams
            r1 = -1
            int r2 = r5.f34d
            r8.<init>(r1, r2)
            r7.setLayoutParams(r8)
            cn.bluemobi.dylan.base.adapter.c$b r8 = new cn.bluemobi.dylan.base.adapter.c$b
            r8.<init>(r5, r7)
            r7.setTag(r8)
            goto L25
        L1f:
            java.lang.Object r8 = r7.getTag()
            cn.bluemobi.dylan.base.adapter.c$b r8 = (cn.bluemobi.dylan.base.adapter.c.b) r8
        L25:
            java.util.List<java.lang.String> r1 = r5.a
            if (r1 == 0) goto L7d
            int r1 = r1.size()
            if (r6 >= r1) goto L7d
            java.io.File r1 = new java.io.File
            java.util.List<java.lang.String> r2 = r5.a
            java.lang.Object r2 = r2.get(r6)
            java.lang.String r2 = (java.lang.String) r2
            r1.<init>(r2)
            android.content.Context r2 = r5.f32b
            com.bumptech.glide.i r2 = com.bumptech.glide.b.D(r2)
            java.util.List<java.lang.String> r3 = r5.a
            java.lang.Object r3 = r3.get(r6)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "http"
            boolean r3 = r3.startsWith(r4)
            if (r3 == 0) goto L5b
            java.util.List<java.lang.String> r3 = r5.a
            java.lang.Object r3 = r3.get(r6)
            java.io.Serializable r3 = (java.io.Serializable) r3
            goto L5c
        L5b:
            r3 = r1
        L5c:
            com.bumptech.glide.h r2 = r2.L(r3)
            com.bumptech.glide.Priority r3 = com.bumptech.glide.Priority.HIGH
            com.bumptech.glide.request.a r2 = r2.A0(r3)
            com.bumptech.glide.h r2 = (com.bumptech.glide.h) r2
            android.widget.ImageView r3 = r8.a
            r2.m1(r3)
            android.widget.Button r2 = r8.f39b
            r2.setVisibility(r0)
            android.widget.Button r8 = r8.f39b
            cn.bluemobi.dylan.base.adapter.c$a r0 = new cn.bluemobi.dylan.base.adapter.c$a
            r0.<init>(r5, r1, r6)
            r8.setOnClickListener(r0)
            return r7
        L7d:
            android.content.Context r6 = r5.f32b
            com.bumptech.glide.i r6 = com.bumptech.glide.b.D(r6)
            int r0 = r5.f35e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.bumptech.glide.h r6 = r6.K(r0)
            com.bumptech.glide.Priority r0 = com.bumptech.glide.Priority.HIGH
            com.bumptech.glide.request.a r6 = r6.A0(r0)
            com.bumptech.glide.h r6 = (com.bumptech.glide.h) r6
            android.widget.ImageView r0 = r8.a
            r6.m1(r0)
            android.widget.ImageView r6 = r8.a
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_XY
            r6.setScaleType(r0)
            android.widget.Button r6 = r8.f39b
            r8 = 8
            r6.setVisibility(r8)
            return r7
    }
}
