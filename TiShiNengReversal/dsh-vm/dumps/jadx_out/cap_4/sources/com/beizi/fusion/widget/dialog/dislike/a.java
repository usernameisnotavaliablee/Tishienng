package com.beizi.fusion.widget.dialog.dislike;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class a extends android.app.Dialog {
    private static com.beizi.fusion.widget.dialog.dislike.a.h b;
    private java.util.List<com.beizi.fusion.widget.dialog.dislike.a.b> a;
    private int c;
    private int d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.beizi.fusion.widget.dialog.dislike.a$a, reason: collision with other inner class name */
    public static class C0005a {
        private androidx.recyclerview.widget.RecyclerView a;
        private android.view.View b;
        private com.beizi.fusion.widget.dialog.dislike.a c;
        private com.beizi.fusion.widget.dialog.dislike.a.c d;


        public C0005a(android.content.Context r6) {
                r5 = this;
                r5.<init>()
                com.beizi.fusion.widget.dialog.dislike.a r0 = new com.beizi.fusion.widget.dialog.dislike.a
                int r1 = com.beizi.fusion.R.style.beizi_custom_dialog
                r0.<init>(r6, r1)
                r5.c = r0
                java.lang.String r0 = "layout_inflater"
                java.lang.Object r0 = r6.getSystemService(r0)
                android.view.LayoutInflater r0 = (android.view.LayoutInflater) r0
                int r1 = com.beizi.fusion.R.layout.beizi_dislike_dialog
                r2 = 0
                r3 = 0
                android.view.View r0 = r0.inflate(r1, r2, r3)
                r5.b = r0
                com.beizi.fusion.widget.dialog.dislike.a r1 = r5.c
                android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
                r3 = -1
                r4 = -2
                r2.<init>(r3, r4)
                r1.addContentView(r0, r2)
                android.view.View r0 = r5.b
                int r1 = com.beizi.fusion.R.id.beizi_dislike_reasons_list_recycleview
                android.view.View r0 = r0.findViewById(r1)
                androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
                r5.a = r0
                androidx.recyclerview.widget.LinearLayoutManager r0 = new androidx.recyclerview.widget.LinearLayoutManager
                r0.<init>(r6)
                r6 = 1
                r0.setOrientation(r6)
                androidx.recyclerview.widget.RecyclerView r6 = r5.a
                r6.setLayoutManager(r0)
                com.beizi.fusion.widget.dialog.dislike.a$h r6 = com.beizi.fusion.widget.dialog.dislike.a.a()
                com.beizi.fusion.widget.dialog.dislike.a$a$1 r0 = new com.beizi.fusion.widget.dialog.dislike.a$a$1
                r0.<init>(r5)
                r6.a(r0)
                androidx.recyclerview.widget.RecyclerView r6 = r5.a
                com.beizi.fusion.widget.dialog.dislike.a$h r0 = com.beizi.fusion.widget.dialog.dislike.a.a()
                r6.setAdapter(r0)
                com.beizi.fusion.widget.dialog.dislike.a r6 = r5.c
                android.view.Window r6 = r6.getWindow()
                android.view.WindowManager$LayoutParams r6 = r6.getAttributes()
                android.graphics.Point r0 = new android.graphics.Point
                r0.<init>()
                com.beizi.fusion.widget.dialog.dislike.a r1 = r5.c
                android.view.Window r1 = r1.getWindow()
                android.view.WindowManager r1 = r1.getWindowManager()
                android.view.Display r1 = r1.getDefaultDisplay()
                r1.getSize(r0)
                int r0 = r0.x
                double r0 = (double) r0
                r2 = 4605831338911806259(0x3feb333333333333, double:0.85)
                double r0 = r0 * r2
                int r0 = (int) r0
                r6.width = r0
                r0 = 17
                r6.gravity = r0
                com.beizi.fusion.widget.dialog.dislike.a r0 = r5.c
                android.view.Window r0 = r0.getWindow()
                r0.setAttributes(r6)
                return
        }

        static /* synthetic */ com.beizi.fusion.widget.dialog.dislike.a a(com.beizi.fusion.widget.dialog.dislike.a.C0005a r0) {
                com.beizi.fusion.widget.dialog.dislike.a r0 = r0.c
                return r0
        }

        static /* synthetic */ com.beizi.fusion.widget.dialog.dislike.a.c b(com.beizi.fusion.widget.dialog.dislike.a.C0005a r0) {
                com.beizi.fusion.widget.dialog.dislike.a$c r0 = r0.d
                return r0
        }

        public com.beizi.fusion.widget.dialog.dislike.a.C0005a a(com.beizi.fusion.widget.dialog.dislike.a.c r1) {
                r0 = this;
                r0.d = r1
                return r0
        }

        public com.beizi.fusion.widget.dialog.dislike.a a() {
                r2 = this;
                com.beizi.fusion.widget.dialog.dislike.a r0 = r2.c
                android.view.View r1 = r2.b
                r0.setContentView(r1)
                com.beizi.fusion.widget.dialog.dislike.a r0 = r2.c
                r1 = 1
                r0.setCancelable(r1)
                com.beizi.fusion.widget.dialog.dislike.a r0 = r2.c
                r0.setCanceledOnTouchOutside(r1)
                com.beizi.fusion.widget.dialog.dislike.a r0 = r2.c
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b {
        int a;
        java.lang.String b;
        java.util.List<com.beizi.fusion.widget.dialog.dislike.a.d> c;
        final /* synthetic */ com.beizi.fusion.widget.dialog.dislike.a d;

        b(com.beizi.fusion.widget.dialog.dislike.a r1) {
                r0 = this;
                r0.d = r1
                r0.<init>()
                return
        }

        public java.util.List<com.beizi.fusion.widget.dialog.dislike.a.d> a() {
                r1 = this;
                java.util.List<com.beizi.fusion.widget.dialog.dislike.a$d> r0 = r1.c
                return r0
        }

        public void a(int r1) {
                r0 = this;
                r0.a = r1
                return
        }

        public void a(java.lang.String r1) {
                r0 = this;
                r0.b = r1
                return
        }

        public void a(java.util.List<com.beizi.fusion.widget.dialog.dislike.a.d> r1) {
                r0 = this;
                r0.c = r1
                return
        }

        public java.lang.String b() {
                r1 = this;
                java.lang.String r0 = r1.b
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface c {
        void a();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d {
        java.lang.String a;
        final /* synthetic */ com.beizi.fusion.widget.dialog.dislike.a b;

        d(com.beizi.fusion.widget.dialog.dislike.a r1) {
                r0 = this;
                r0.b = r1
                r0.<init>()
                return
        }

        public java.lang.String a() {
                r1 = this;
                java.lang.String r0 = r1.a
                return r0
        }

        public void a(java.lang.String r1) {
                r0 = this;
                r0.a = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface e {
        void a(android.view.View r1, int r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface f {
        void a(android.view.View r1, int r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class g extends androidx.recyclerview.widget.RecyclerView.Adapter {
        final /* synthetic */ com.beizi.fusion.widget.dialog.dislike.a a;
        private java.util.List<com.beizi.fusion.widget.dialog.dislike.a.d> b;
        private android.content.Context c;
        private com.beizi.fusion.widget.dialog.dislike.a.f d;


        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.beizi.fusion.widget.dialog.dislike.a$g$a, reason: collision with other inner class name */
        class C0006a extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
            android.widget.TextView a;
            final /* synthetic */ com.beizi.fusion.widget.dialog.dislike.a.g b;

            public C0006a(com.beizi.fusion.widget.dialog.dislike.a.g r1, @androidx.annotation.NonNull android.view.View r2) {
                    r0 = this;
                    r0.b = r1
                    r0.<init>(r2)
                    int r1 = com.beizi.fusion.R.id.beizi_dislike_item_multi_two_recycleview_item
                    android.view.View r1 = r2.findViewById(r1)
                    android.widget.TextView r1 = (android.widget.TextView) r1
                    r0.a = r1
                    return
            }
        }

        public g(com.beizi.fusion.widget.dialog.dislike.a r1, android.content.Context r2, java.util.List<com.beizi.fusion.widget.dialog.dislike.a.d> r3) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                r0.c = r2
                r0.b = r3
                return
        }

        static /* synthetic */ com.beizi.fusion.widget.dialog.dislike.a.f a(com.beizi.fusion.widget.dialog.dislike.a.g r0) {
                com.beizi.fusion.widget.dialog.dislike.a$f r0 = r0.d
                return r0
        }

        public void a(com.beizi.fusion.widget.dialog.dislike.a.f r1) {
                r0 = this;
                r0.d = r1
                return
        }

        public int getItemCount() {
                r1 = this;
                java.util.List<com.beizi.fusion.widget.dialog.dislike.a$d> r0 = r1.b
                int r0 = r0.size()
                return r0
        }

        public void onBindViewHolder(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r6, @android.annotation.SuppressLint({"RecyclerView"}) int r7) {
                r5 = this;
                com.beizi.fusion.widget.dialog.dislike.a$g$a r6 = (com.beizi.fusion.widget.dialog.dislike.a.g.C0006a) r6
                android.widget.TextView r0 = r6.a
                java.util.List<com.beizi.fusion.widget.dialog.dislike.a$d> r1 = r5.b
                java.lang.Object r1 = r1.get(r7)
                com.beizi.fusion.widget.dialog.dislike.a$d r1 = (com.beizi.fusion.widget.dialog.dislike.a.d) r1
                java.lang.String r1 = r1.a()
                r0.setText(r1)
                android.view.View r0 = r6.itemView
                java.lang.String r1 = ""
                r2 = 10
                java.lang.String r3 = "#FFFAF6F6"
                r4 = 0
                com.beizi.fusion.tool.am.a(r0, r3, r4, r1, r2)
                android.view.View r6 = r6.itemView
                com.beizi.fusion.widget.dialog.dislike.a$g$1 r0 = new com.beizi.fusion.widget.dialog.dislike.a$g$1
                r0.<init>(r5, r7)
                r6.setOnClickListener(r0)
                return
        }

        @androidx.annotation.NonNull
        public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r3, int r4) {
                r2 = this;
                int r4 = com.beizi.fusion.R.layout.beizi_dislike_item_multi_two_recycle_item
                android.content.Context r0 = r3.getContext()
                android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
                r1 = 0
                android.view.View r3 = r0.inflate(r4, r3, r1)
                com.beizi.fusion.widget.dialog.dislike.a$g$a r4 = new com.beizi.fusion.widget.dialog.dislike.a$g$a
                r4.<init>(r2, r3)
                return r4
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class h extends androidx.recyclerview.widget.RecyclerView.Adapter {
        public com.beizi.fusion.widget.dialog.dislike.a.e a;
        final /* synthetic */ com.beizi.fusion.widget.dialog.dislike.a b;
        private android.content.Context c;
        private java.util.List<com.beizi.fusion.widget.dialog.dislike.a.b> d;




        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.beizi.fusion.widget.dialog.dislike.a$h$a, reason: collision with other inner class name */
        public class C0007a extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
            final /* synthetic */ com.beizi.fusion.widget.dialog.dislike.a.h a;
            private android.widget.TextView b;

            public C0007a(com.beizi.fusion.widget.dialog.dislike.a.h r1, @androidx.annotation.NonNull android.view.View r2) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>(r2)
                    int r1 = com.beizi.fusion.R.id.beizi_dislike_item_multi_one_title
                    android.view.View r1 = r2.findViewById(r1)
                    android.widget.TextView r1 = (android.widget.TextView) r1
                    r0.b = r1
                    return
            }

            static /* synthetic */ android.widget.TextView a(com.beizi.fusion.widget.dialog.dislike.a.h.C0007a r0) {
                    android.widget.TextView r0 = r0.b
                    return r0
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public class b extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
            final /* synthetic */ com.beizi.fusion.widget.dialog.dislike.a.h a;
            private android.widget.TextView b;
            private androidx.recyclerview.widget.RecyclerView c;

            public b(com.beizi.fusion.widget.dialog.dislike.a.h r1, @androidx.annotation.NonNull android.view.View r2) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>(r2)
                    int r1 = com.beizi.fusion.R.id.beizi_dislike_item_multi_two_title
                    android.view.View r1 = r2.findViewById(r1)
                    android.widget.TextView r1 = (android.widget.TextView) r1
                    r0.b = r1
                    int r1 = com.beizi.fusion.R.id.beizi_dislike_item_multi_two_recycleview
                    android.view.View r1 = r2.findViewById(r1)
                    androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
                    r0.c = r1
                    return
            }

            static /* synthetic */ android.widget.TextView a(com.beizi.fusion.widget.dialog.dislike.a.h.b r0) {
                    android.widget.TextView r0 = r0.b
                    return r0
            }

            static /* synthetic */ androidx.recyclerview.widget.RecyclerView b(com.beizi.fusion.widget.dialog.dislike.a.h.b r0) {
                    androidx.recyclerview.widget.RecyclerView r0 = r0.c
                    return r0
            }
        }

        public h(com.beizi.fusion.widget.dialog.dislike.a r1, android.content.Context r2, java.util.List<com.beizi.fusion.widget.dialog.dislike.a.b> r3) {
                r0 = this;
                r0.b = r1
                r0.<init>()
                r0.c = r2
                r0.d = r3
                return
        }

        public void a(com.beizi.fusion.widget.dialog.dislike.a.e r1) {
                r0 = this;
                r0.a = r1
                return
        }

        public int getItemCount() {
                r1 = this;
                java.util.List<com.beizi.fusion.widget.dialog.dislike.a$b> r0 = r1.d
                int r0 = r0.size()
                return r0
        }

        public int getItemViewType(int r2) {
                r1 = this;
                java.util.List<com.beizi.fusion.widget.dialog.dislike.a$b> r0 = r1.d
                java.lang.Object r0 = r0.get(r2)
                com.beizi.fusion.widget.dialog.dislike.a$b r0 = (com.beizi.fusion.widget.dialog.dislike.a.b) r0
                java.util.List r0 = r0.a()
                if (r0 == 0) goto L27
                java.util.List<com.beizi.fusion.widget.dialog.dislike.a$b> r0 = r1.d
                java.lang.Object r2 = r0.get(r2)
                com.beizi.fusion.widget.dialog.dislike.a$b r2 = (com.beizi.fusion.widget.dialog.dislike.a.b) r2
                java.util.List r2 = r2.a()
                int r2 = r2.size()
                if (r2 <= 0) goto L27
                com.beizi.fusion.widget.dialog.dislike.a r2 = r1.b
                int r2 = com.beizi.fusion.widget.dialog.dislike.a.a(r2)
                return r2
            L27:
                com.beizi.fusion.widget.dialog.dislike.a r2 = r1.b
                int r2 = com.beizi.fusion.widget.dialog.dislike.a.b(r2)
                return r2
        }

        public void onBindViewHolder(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r6, int r7) {
                r5 = this;
                boolean r0 = r6 instanceof com.beizi.fusion.widget.dialog.dislike.a.h.C0007a
                if (r0 == 0) goto L1b
                r0 = r6
                com.beizi.fusion.widget.dialog.dislike.a$h$a r0 = (com.beizi.fusion.widget.dialog.dislike.a.h.C0007a) r0
                android.widget.TextView r0 = com.beizi.fusion.widget.dialog.dislike.a.h.C0007a.a(r0)
                java.util.List<com.beizi.fusion.widget.dialog.dislike.a$b> r1 = r5.d
                java.lang.Object r7 = r1.get(r7)
                com.beizi.fusion.widget.dialog.dislike.a$b r7 = (com.beizi.fusion.widget.dialog.dislike.a.b) r7
                java.lang.String r7 = r7.b()
                r0.setText(r7)
                goto L6f
            L1b:
                r0 = r6
                com.beizi.fusion.widget.dialog.dislike.a$h$b r0 = (com.beizi.fusion.widget.dialog.dislike.a.h.b) r0
                android.widget.TextView r1 = com.beizi.fusion.widget.dialog.dislike.a.h.b.a(r0)
                java.util.List<com.beizi.fusion.widget.dialog.dislike.a$b> r2 = r5.d
                java.lang.Object r2 = r2.get(r7)
                com.beizi.fusion.widget.dialog.dislike.a$b r2 = (com.beizi.fusion.widget.dialog.dislike.a.b) r2
                java.lang.String r2 = r2.b()
                r1.setText(r2)
                com.beizi.fusion.widget.dialog.dislike.FlowLayoutManager r1 = new com.beizi.fusion.widget.dialog.dislike.FlowLayoutManager
                r1.<init>()
                androidx.recyclerview.widget.RecyclerView r2 = com.beizi.fusion.widget.dialog.dislike.a.h.b.b(r0)
                r2.setLayoutManager(r1)
                com.beizi.fusion.widget.dialog.dislike.a$g r1 = new com.beizi.fusion.widget.dialog.dislike.a$g
                com.beizi.fusion.widget.dialog.dislike.a r2 = r5.b
                android.content.Context r3 = r2.getContext()
                java.util.List<com.beizi.fusion.widget.dialog.dislike.a$b> r4 = r5.d
                java.lang.Object r7 = r4.get(r7)
                com.beizi.fusion.widget.dialog.dislike.a$b r7 = (com.beizi.fusion.widget.dialog.dislike.a.b) r7
                java.util.List r7 = r7.a()
                r1.<init>(r2, r3, r7)
                androidx.recyclerview.widget.RecyclerView r7 = com.beizi.fusion.widget.dialog.dislike.a.h.b.b(r0)
                r7.setAdapter(r1)
                com.beizi.fusion.widget.dialog.dislike.a$h$1 r7 = new com.beizi.fusion.widget.dialog.dislike.a$h$1
                r7.<init>(r5)
                r1.a(r7)
                androidx.recyclerview.widget.RecyclerView r7 = com.beizi.fusion.widget.dialog.dislike.a.h.b.b(r0)
                com.beizi.fusion.widget.dialog.dislike.a$h$2 r0 = new com.beizi.fusion.widget.dialog.dislike.a$h$2
                r0.<init>(r5)
                r7.addItemDecoration(r0)
            L6f:
                com.beizi.fusion.widget.dialog.dislike.a$e r7 = r5.a
                if (r7 == 0) goto L7d
                android.view.View r7 = r6.itemView
                com.beizi.fusion.widget.dialog.dislike.a$h$3 r0 = new com.beizi.fusion.widget.dialog.dislike.a$h$3
                r0.<init>(r5, r6)
                r7.setOnClickListener(r0)
            L7d:
                return
        }

        @androidx.annotation.NonNull
        public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r3, int r4) {
                r2 = this;
                com.beizi.fusion.widget.dialog.dislike.a r0 = r2.b
                int r0 = com.beizi.fusion.widget.dialog.dislike.a.b(r0)
                r1 = 0
                if (r4 != r0) goto L1d
                android.content.Context r4 = r3.getContext()
                android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
                int r0 = com.beizi.fusion.R.layout.beizi_dislike_item_multi_one
                android.view.View r3 = r4.inflate(r0, r3, r1)
                com.beizi.fusion.widget.dialog.dislike.a$h$a r4 = new com.beizi.fusion.widget.dialog.dislike.a$h$a
                r4.<init>(r2, r3)
                return r4
            L1d:
                android.content.Context r4 = r3.getContext()
                android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
                int r0 = com.beizi.fusion.R.layout.beizi_dislike_item_multi_two
                android.view.View r3 = r4.inflate(r0, r3, r1)
                com.beizi.fusion.widget.dialog.dislike.a$h$b r4 = new com.beizi.fusion.widget.dialog.dislike.a$h$b
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
            r1.c = r3
            r3 = 2
            r1.d = r3
            java.util.List r3 = r1.b()
            r1.a = r3
            com.beizi.fusion.widget.dialog.dislike.a$h r0 = new com.beizi.fusion.widget.dialog.dislike.a$h
            r0.<init>(r1, r2, r3)
            com.beizi.fusion.widget.dialog.dislike.a.b = r0
            return
    }

    static /* synthetic */ int a(com.beizi.fusion.widget.dialog.dislike.a r0) {
            int r0 = r0.d
            return r0
    }

    static /* synthetic */ com.beizi.fusion.widget.dialog.dislike.a.h a() {
            com.beizi.fusion.widget.dialog.dislike.a$h r0 = com.beizi.fusion.widget.dialog.dislike.a.b
            return r0
    }

    static /* synthetic */ int b(com.beizi.fusion.widget.dialog.dislike.a r0) {
            int r0 = r0.c
            return r0
    }

    private java.util.List<com.beizi.fusion.widget.dialog.dislike.a.b> b() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.beizi.fusion.widget.dialog.dislike.a$b r1 = new com.beizi.fusion.widget.dialog.dislike.a$b
            r1.<init>(r4)
            java.lang.String r2 = "内容无法正常展示（卡顿、黑白屏）"
            r1.a(r2)
            int r2 = r4.c
            r1.a(r2)
            r0.add(r1)
            com.beizi.fusion.widget.dialog.dislike.a$b r1 = new com.beizi.fusion.widget.dialog.dislike.a$b
            r1.<init>(r4)
            java.lang.String r2 = "不感兴趣"
            r1.a(r2)
            int r2 = r4.c
            r1.a(r2)
            r0.add(r1)
            com.beizi.fusion.widget.dialog.dislike.a$b r1 = new com.beizi.fusion.widget.dialog.dislike.a$b
            r1.<init>(r4)
            java.lang.String r2 = "无法关闭"
            r1.a(r2)
            int r2 = r4.c
            r1.a(r2)
            r0.add(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.beizi.fusion.widget.dialog.dislike.a$d r2 = new com.beizi.fusion.widget.dialog.dislike.a$d
            r2.<init>(r4)
            java.lang.String r3 = "疑似抄袭"
            r2.a(r3)
            r1.add(r2)
            com.beizi.fusion.widget.dialog.dislike.a$d r2 = new com.beizi.fusion.widget.dialog.dislike.a$d
            r2.<init>(r4)
            java.lang.String r3 = "虚假欺诈"
            r2.a(r3)
            r1.add(r2)
            com.beizi.fusion.widget.dialog.dislike.a$d r2 = new com.beizi.fusion.widget.dialog.dislike.a$d
            r2.<init>(r4)
            java.lang.String r3 = "违法违规"
            r2.a(r3)
            r1.add(r2)
            com.beizi.fusion.widget.dialog.dislike.a$d r2 = new com.beizi.fusion.widget.dialog.dislike.a$d
            r2.<init>(r4)
            java.lang.String r3 = "低俗色情"
            r2.a(r3)
            r1.add(r2)
            com.beizi.fusion.widget.dialog.dislike.a$b r2 = new com.beizi.fusion.widget.dialog.dislike.a$b
            r2.<init>(r4)
            java.lang.String r3 = "举报广告"
            r2.a(r3)
            r2.a(r1)
            int r1 = r4.c
            r2.a(r1)
            r0.add(r2)
            return r0
    }
}
