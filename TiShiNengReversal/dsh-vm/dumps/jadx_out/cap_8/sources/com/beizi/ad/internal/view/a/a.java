package com.beizi.ad.internal.view.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a extends android.app.Dialog {

    /* renamed from: b, reason: collision with root package name */
    private static com.beizi.ad.internal.view.a.a.e f7176b;
    private java.util.List<com.beizi.ad.internal.view.a.a.c> a;

    /* renamed from: c, reason: collision with root package name */
    private int f7177c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.beizi.ad.internal.view.a.a$a, reason: collision with other inner class name */
    public static class C0113a {
        private androidx.recyclerview.widget.RecyclerView a;

        /* renamed from: b, reason: collision with root package name */
        private android.widget.ImageView f7178b;

        /* renamed from: c, reason: collision with root package name */
        private android.widget.TextView f7179c;

        /* renamed from: d, reason: collision with root package name */
        private android.widget.RelativeLayout f7180d;

        /* renamed from: e, reason: collision with root package name */
        private android.widget.RelativeLayout f7181e;

        /* renamed from: f, reason: collision with root package name */
        private android.widget.EditText f7182f;

        /* renamed from: g, reason: collision with root package name */
        private android.widget.TextView f7183g;

        /* renamed from: h, reason: collision with root package name */
        private android.widget.Button f7184h;

        /* renamed from: i, reason: collision with root package name */
        private android.view.View f7185i;

        /* renamed from: j, reason: collision with root package name */
        private com.beizi.ad.internal.view.a.a f7186j;

        /* renamed from: k, reason: collision with root package name */
        private com.beizi.ad.internal.view.a.a.b f7187k;
        private boolean l;







        public C0113a(android.content.Context r6) {
                r5 = this;
                r5.<init>()
                com.beizi.ad.internal.view.a.a r0 = new com.beizi.ad.internal.view.a.a
                int r1 = com.beizi.fusion.R.style.beizi_ad_custom_dialog
                r0.<init>(r6, r1)
                r5.f7186j = r0
                java.lang.String r0 = "layout_inflater"
                java.lang.Object r0 = r6.getSystemService(r0)
                android.view.LayoutInflater r0 = (android.view.LayoutInflater) r0
                int r1 = com.beizi.fusion.R.layout.beizi_complaint_dialog
                r2 = 0
                r3 = 0
                android.view.View r0 = r0.inflate(r1, r2, r3)
                r5.f7185i = r0
                com.beizi.ad.internal.view.a.a r1 = r5.f7186j
                android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
                r3 = -1
                r4 = -2
                r2.<init>(r3, r4)
                r1.addContentView(r0, r2)
                android.view.View r0 = r5.f7185i
                int r1 = com.beizi.fusion.R.id.dislike_reasons_list_recycleview
                android.view.View r0 = r0.findViewById(r1)
                androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
                r5.a = r0
                android.view.View r0 = r5.f7185i
                int r1 = com.beizi.fusion.R.id.complaint_dialog_close_view
                android.view.View r0 = r0.findViewById(r1)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                r5.f7178b = r0
                android.view.View r0 = r5.f7185i
                int r1 = com.beizi.fusion.R.id.complaint_other_suggest_view
                android.view.View r0 = r0.findViewById(r1)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r5.f7179c = r0
                android.view.View r0 = r5.f7185i
                int r1 = com.beizi.fusion.R.id.complaint_normal_ui
                android.view.View r0 = r0.findViewById(r1)
                android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
                r5.f7180d = r0
                android.view.View r0 = r5.f7185i
                int r1 = com.beizi.fusion.R.id.complaint_other_suggest_layout
                android.view.View r0 = r0.findViewById(r1)
                android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
                r5.f7181e = r0
                android.view.View r0 = r5.f7185i
                int r1 = com.beizi.fusion.R.id.complaint_input_other_edittext
                android.view.View r0 = r0.findViewById(r1)
                android.widget.EditText r0 = (android.widget.EditText) r0
                r5.f7182f = r0
                android.view.View r0 = r5.f7185i
                int r1 = com.beizi.fusion.R.id.complaint_other_suggest_number_textview
                android.view.View r0 = r0.findViewById(r1)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r5.f7183g = r0
                android.view.View r0 = r5.f7185i
                int r1 = com.beizi.fusion.R.id.complaint_other_suggest_submit
                android.view.View r0 = r0.findViewById(r1)
                android.widget.Button r0 = (android.widget.Button) r0
                r5.f7184h = r0
                androidx.recyclerview.widget.LinearLayoutManager r0 = new androidx.recyclerview.widget.LinearLayoutManager
                r0.<init>(r6)
                r1 = 1
                r0.setOrientation(r1)
                androidx.recyclerview.widget.RecyclerView r1 = r5.a
                r1.setLayoutManager(r0)
                com.beizi.ad.internal.view.a.a$e r0 = com.beizi.ad.internal.view.a.a.a()
                com.beizi.ad.internal.view.a.a$a$1 r1 = new com.beizi.ad.internal.view.a.a$a$1
                r1.<init>(r5)
                r0.a(r1)
                androidx.recyclerview.widget.RecyclerView r0 = r5.a
                com.beizi.ad.internal.view.a.a$e r1 = com.beizi.ad.internal.view.a.a.a()
                r0.setAdapter(r1)
                android.widget.TextView r0 = r5.f7179c
                com.beizi.ad.internal.view.a.a$a$2 r1 = new com.beizi.ad.internal.view.a.a$a$2
                r1.<init>(r5, r6)
                r0.setOnClickListener(r1)
                android.widget.ImageView r0 = r5.f7178b
                com.beizi.ad.internal.view.a.a$a$3 r1 = new com.beizi.ad.internal.view.a.a$a$3
                r1.<init>(r5, r6)
                r0.setOnClickListener(r1)
                android.widget.EditText r0 = r5.f7182f
                com.beizi.ad.internal.view.a.a$a$4 r1 = new com.beizi.ad.internal.view.a.a$a$4
                r1.<init>(r5, r6)
                r0.addTextChangedListener(r1)
                android.widget.Button r6 = r5.f7184h
                com.beizi.ad.internal.view.a.a$a$5 r0 = new com.beizi.ad.internal.view.a.a$a$5
                r0.<init>(r5)
                r6.setOnClickListener(r0)
                return
        }

        static /* synthetic */ android.widget.EditText a(com.beizi.ad.internal.view.a.a.C0113a r0) {
                android.widget.EditText r0 = r0.f7182f
                return r0
        }

        private void a(android.content.Context r4, android.widget.EditText r5) {
                r3 = this;
                boolean r0 = r3.l
                r1 = 8
                r2 = 0
                if (r0 == 0) goto L16
                android.widget.RelativeLayout r0 = r3.f7180d
                r0.setVisibility(r1)
                android.widget.RelativeLayout r0 = r3.f7181e
                r0.setVisibility(r2)
                r0 = 1
                r3.a(r4, r0, r5)
                return
            L16:
                android.widget.RelativeLayout r0 = r3.f7180d
                r0.setVisibility(r2)
                android.widget.RelativeLayout r0 = r3.f7181e
                r0.setVisibility(r1)
                r3.a(r4, r2, r5)
                return
        }

        private void a(android.content.Context r4, boolean r5, android.widget.EditText r6) {
                r3 = this;
                if (r5 == 0) goto L15
                r6.requestFocus()
                java.util.Timer r5 = new java.util.Timer
                r5.<init>()
                com.beizi.ad.internal.view.a.a$a$6 r0 = new com.beizi.ad.internal.view.a.a$a$6
                r0.<init>(r3, r4, r6)
                r1 = 100
                r5.schedule(r0, r1)
                return
            L15:
                r6.clearFocus()
                java.lang.String r5 = "input_method"
                java.lang.Object r4 = r4.getSystemService(r5)
                android.view.inputmethod.InputMethodManager r4 = (android.view.inputmethod.InputMethodManager) r4
                android.os.IBinder r5 = r6.getWindowToken()
                r6 = 0
                r4.hideSoftInputFromWindow(r5, r6)
                return
        }

        static /* synthetic */ void a(com.beizi.ad.internal.view.a.a.C0113a r0, android.content.Context r1, android.widget.EditText r2) {
                r0.a(r1, r2)
                return
        }

        static /* synthetic */ void a(com.beizi.ad.internal.view.a.a.C0113a r0, java.lang.String r1) {
                r0.a(r1)
                return
        }

        private void a(java.lang.String r2) {
                r1 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r2)
                if (r0 != 0) goto Ld
                com.beizi.ad.internal.view.a.a$b r0 = r1.f7187k
                if (r0 == 0) goto Ld
                r0.a(r2)
            Ld:
                com.beizi.ad.internal.view.a.a r0 = r1.f7186j
                if (r0 == 0) goto L14
                r0.dismiss()
            L14:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r2)
                java.lang.String r2 = " 被点击了"
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                java.lang.String r0 = "BeiZisAd"
                com.beizi.ad.lance.a.m.b(r0, r2)
                return
        }

        static /* synthetic */ boolean a(com.beizi.ad.internal.view.a.a.C0113a r0, boolean r1) {
                r0.l = r1
                return r1
        }

        static /* synthetic */ boolean b(com.beizi.ad.internal.view.a.a.C0113a r0) {
                boolean r0 = r0.l
                return r0
        }

        static /* synthetic */ com.beizi.ad.internal.view.a.a c(com.beizi.ad.internal.view.a.a.C0113a r0) {
                com.beizi.ad.internal.view.a.a r0 = r0.f7186j
                return r0
        }

        static /* synthetic */ com.beizi.ad.internal.view.a.a.b d(com.beizi.ad.internal.view.a.a.C0113a r0) {
                com.beizi.ad.internal.view.a.a$b r0 = r0.f7187k
                return r0
        }

        static /* synthetic */ android.widget.Button e(com.beizi.ad.internal.view.a.a.C0113a r0) {
                android.widget.Button r0 = r0.f7184h
                return r0
        }

        static /* synthetic */ android.widget.TextView f(com.beizi.ad.internal.view.a.a.C0113a r0) {
                android.widget.TextView r0 = r0.f7183g
                return r0
        }

        public com.beizi.ad.internal.view.a.a.C0113a a(com.beizi.ad.internal.view.a.a.b r1) {
                r0 = this;
                r0.f7187k = r1
                return r0
        }

        public com.beizi.ad.internal.view.a.a a() {
                r2 = this;
                com.beizi.ad.internal.view.a.a r0 = r2.f7186j
                android.view.View r1 = r2.f7185i
                r0.setContentView(r1)
                com.beizi.ad.internal.view.a.a r0 = r2.f7186j
                r1 = 1
                r0.setCancelable(r1)
                com.beizi.ad.internal.view.a.a r0 = r2.f7186j
                r1 = 0
                r0.setCanceledOnTouchOutside(r1)
                com.beizi.ad.internal.view.a.a r0 = r2.f7186j
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        void a();

        void a(java.lang.String r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c {
        int a;

        /* renamed from: b, reason: collision with root package name */
        java.lang.String f7193b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.beizi.ad.internal.view.a.a f7194c;

        c(com.beizi.ad.internal.view.a.a r1) {
                r0 = this;
                r0.f7194c = r1
                r0.<init>()
                return
        }

        public java.lang.String a() {
                r1 = this;
                java.lang.String r0 = r1.f7193b
                return r0
        }

        public void a(int r1) {
                r0 = this;
                r0.a = r1
                return
        }

        public void a(java.lang.String r1) {
                r0 = this;
                r0.f7193b = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface d {
        void a(android.view.View r1, int r2, java.lang.String r3);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e extends androidx.recyclerview.widget.RecyclerView.Adapter {
        public com.beizi.ad.internal.view.a.a.d a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.beizi.ad.internal.view.a.a f7195b;

        /* renamed from: c, reason: collision with root package name */
        private java.util.List<com.beizi.ad.internal.view.a.a.c> f7196c;


        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.beizi.ad.internal.view.a.a$e$a, reason: collision with other inner class name */
        public class C0114a extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
            final /* synthetic */ com.beizi.ad.internal.view.a.a.e a;

            /* renamed from: b, reason: collision with root package name */
            private android.widget.TextView f7199b;

            /* renamed from: c, reason: collision with root package name */
            private android.view.View f7200c;

            public C0114a(com.beizi.ad.internal.view.a.a.e r1, @androidx.annotation.NonNull android.view.View r2) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>(r2)
                    int r1 = com.beizi.fusion.R.id.dislike_item_multi_one_title
                    android.view.View r1 = r2.findViewById(r1)
                    android.widget.TextView r1 = (android.widget.TextView) r1
                    r0.f7199b = r1
                    int r1 = com.beizi.fusion.R.id.complaint_reason_item_divider
                    android.view.View r1 = r2.findViewById(r1)
                    r0.f7200c = r1
                    return
            }

            static /* synthetic */ android.widget.TextView a(com.beizi.ad.internal.view.a.a.e.C0114a r0) {
                    android.widget.TextView r0 = r0.f7199b
                    return r0
            }

            static /* synthetic */ android.view.View b(com.beizi.ad.internal.view.a.a.e.C0114a r0) {
                    android.view.View r0 = r0.f7200c
                    return r0
            }
        }

        public e(com.beizi.ad.internal.view.a.a r1, android.content.Context r2, java.util.List<com.beizi.ad.internal.view.a.a.c> r3) {
                r0 = this;
                r0.f7195b = r1
                r0.<init>()
                r0.f7196c = r3
                return
        }

        public void a(com.beizi.ad.internal.view.a.a.d r1) {
                r0 = this;
                r0.a = r1
                return
        }

        public int getItemCount() {
                r1 = this;
                java.util.List<com.beizi.ad.internal.view.a.a$c> r0 = r1.f7196c
                int r0 = r0.size()
                return r0
        }

        public int getItemViewType(int r1) {
                r0 = this;
                com.beizi.ad.internal.view.a.a r1 = r0.f7195b
                int r1 = com.beizi.ad.internal.view.a.a.a(r1)
                return r1
        }

        public void onBindViewHolder(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r4, int r5) {
                r3 = this;
                java.util.List<com.beizi.ad.internal.view.a.a$c> r0 = r3.f7196c
                java.lang.Object r0 = r0.get(r5)
                com.beizi.ad.internal.view.a.a$c r0 = (com.beizi.ad.internal.view.a.a.c) r0
                java.lang.String r0 = r0.a()
                boolean r1 = r4 instanceof com.beizi.ad.internal.view.a.a.e.C0114a
                if (r1 == 0) goto L35
                r1 = r4
                com.beizi.ad.internal.view.a.a$e$a r1 = (com.beizi.ad.internal.view.a.a.e.C0114a) r1
                android.widget.TextView r2 = com.beizi.ad.internal.view.a.a.e.C0114a.a(r1)
                r2.setText(r0)
                java.util.List<com.beizi.ad.internal.view.a.a$c> r2 = r3.f7196c
                int r2 = r2.size()
                if (r2 <= 0) goto L35
                java.util.List<com.beizi.ad.internal.view.a.a$c> r2 = r3.f7196c
                int r2 = r2.size()
                int r2 = r2 + (-1)
                if (r5 != r2) goto L35
                android.view.View r5 = com.beizi.ad.internal.view.a.a.e.C0114a.b(r1)
                r1 = 8
                r5.setVisibility(r1)
            L35:
                com.beizi.ad.internal.view.a.a$d r5 = r3.a
                if (r5 == 0) goto L43
                android.view.View r5 = r4.itemView
                com.beizi.ad.internal.view.a.a$e$1 r1 = new com.beizi.ad.internal.view.a.a$e$1
                r1.<init>(r3, r4, r0)
                r5.setOnClickListener(r1)
            L43:
                return
        }

        @androidx.annotation.NonNull
        public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r3, int r4) {
                r2 = this;
                android.content.Context r4 = r3.getContext()
                android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
                int r0 = com.beizi.fusion.R.layout.beizi_complaint_item_multi_one
                r1 = 0
                android.view.View r3 = r4.inflate(r0, r3, r1)
                com.beizi.ad.internal.view.a.a$e$a r4 = new com.beizi.ad.internal.view.a.a$e$a
                r4.<init>(r2, r3)
                return r4
        }
    }

    public a(@androidx.annotation.NonNull android.content.Context r2, int r3) {
            r1 = this;
            r1.<init>(r2, r3)
            r3 = 0
            r1.a = r3
            r3 = 1
            r1.f7177c = r3
            java.util.List r3 = r1.b()
            r1.a = r3
            com.beizi.ad.internal.view.a.a$e r0 = new com.beizi.ad.internal.view.a.a$e
            r0.<init>(r1, r2, r3)
            com.beizi.ad.internal.view.a.a.f7176b = r0
            return
    }

    static /* synthetic */ int a(com.beizi.ad.internal.view.a.a r0) {
            int r0 = r0.f7177c
            return r0
    }

    static /* synthetic */ com.beizi.ad.internal.view.a.a.e a() {
            com.beizi.ad.internal.view.a.a$e r0 = com.beizi.ad.internal.view.a.a.f7176b
            return r0
    }

    private java.util.List<com.beizi.ad.internal.view.a.a.c> b() {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r5 = "广告涉及违禁商品/服务"
            java.lang.String r6 = "对广告内容不感兴趣"
            java.lang.String r1 = "垃圾广告"
            java.lang.String r2 = "感觉有被冒犯或被歧视"
            java.lang.String r3 = "广告涉及欺诈造假"
            java.lang.String r4 = "广告涉及色情暴力"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4, r5, r6}
            r2 = 0
        L16:
            r3 = 6
            if (r2 >= r3) goto L2e
            r3 = r1[r2]
            com.beizi.ad.internal.view.a.a$c r4 = new com.beizi.ad.internal.view.a.a$c
            r4.<init>(r7)
            r4.a(r3)
            int r3 = r7.f7177c
            r4.a(r3)
            r0.add(r4)
            int r2 = r2 + 1
            goto L16
        L2e:
            return r0
    }
}
