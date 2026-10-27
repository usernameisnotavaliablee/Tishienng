package com.bxkj.base.v2.common.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class CycleViewPager extends android.widget.FrameLayout implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {
    private static final java.lang.String B = "CycleViewPager";
    private int A;
    private android.content.Context a;
    private androidx.viewpager.widget.ViewPager b;
    private android.widget.TextView c;
    private android.widget.LinearLayout d;
    private android.os.Handler e;
    private int f;
    private int g;
    private java.util.List<android.view.View> h;
    private android.widget.ImageView[] i;
    private boolean j;
    private boolean k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f599l;

    /* renamed from: m, reason: collision with root package name */
    private int f600m;

    /* renamed from: n, reason: collision with root package name */
    private int f601n;

    /* renamed from: o, reason: collision with root package name */
    private long f602o;

    /* renamed from: p, reason: collision with root package name */
    private com.bxkj.base.v2.common.view.CycleViewPager.e f603p;

    /* renamed from: q, reason: collision with root package name */
    private com.bxkj.base.v2.common.view.CycleViewPager.c f604q;

    /* renamed from: r, reason: collision with root package name */
    private com.bxkj.base.v2.common.view.CycleViewPager.d f605r;

    /* renamed from: s, reason: collision with root package name */
    private java.util.List<java.lang.String> f606s;

    /* renamed from: t, reason: collision with root package name */
    private java.util.List<java.lang.Integer> f607t;

    /* renamed from: u, reason: collision with root package name */
    private int f608u;

    /* renamed from: v, reason: collision with root package name */
    private int f609v;

    /* renamed from: w, reason: collision with root package name */
    final java.lang.Runnable f610w;

    /* renamed from: x, reason: collision with root package name */
    private int f611x;

    /* renamed from: y, reason: collision with root package name */
    private int f612y;

    /* renamed from: z, reason: collision with root package name */
    private android.view.View f613z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements java.lang.Runnable {
        final /* synthetic */ com.bxkj.base.v2.common.view.CycleViewPager a;

        a(com.bxkj.base.v2.common.view.CycleViewPager r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r5 = this;
                com.bxkj.base.v2.common.view.CycleViewPager r0 = r5.a
                android.content.Context r0 = com.bxkj.base.v2.common.view.CycleViewPager.h(r0)
                if (r0 == 0) goto L47
                com.bxkj.base.v2.common.view.CycleViewPager r0 = r5.a
                boolean r0 = com.bxkj.base.v2.common.view.CycleViewPager.g(r0)
                if (r0 == 0) goto L47
                long r0 = java.lang.System.currentTimeMillis()
                com.bxkj.base.v2.common.view.CycleViewPager r2 = r5.a
                long r2 = com.bxkj.base.v2.common.view.CycleViewPager.m(r2)
                long r0 = r0 - r2
                com.bxkj.base.v2.common.view.CycleViewPager r2 = r5.a
                int r2 = com.bxkj.base.v2.common.view.CycleViewPager.c(r2)
                int r2 = r2 + (-500)
                long r2 = (long) r2
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 <= 0) goto L38
                com.bxkj.base.v2.common.view.CycleViewPager r0 = r5.a
                android.os.Handler r0 = com.bxkj.base.v2.common.view.CycleViewPager.d(r0)
                com.bxkj.base.v2.common.view.CycleViewPager r1 = r5.a
                int r1 = com.bxkj.base.v2.common.view.CycleViewPager.a(r1)
                r0.sendEmptyMessage(r1)
                return
            L38:
                com.bxkj.base.v2.common.view.CycleViewPager r0 = r5.a
                android.os.Handler r0 = com.bxkj.base.v2.common.view.CycleViewPager.d(r0)
                com.bxkj.base.v2.common.view.CycleViewPager r1 = r5.a
                int r1 = com.bxkj.base.v2.common.view.CycleViewPager.b(r1)
                r0.sendEmptyMessage(r1)
            L47:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends android.os.Handler {
        final /* synthetic */ com.bxkj.base.v2.common.view.CycleViewPager a;

        b(com.bxkj.base.v2.common.view.CycleViewPager r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r5) {
                r4 = this;
                super.handleMessage(r5)
                int r0 = r5.what
                com.bxkj.base.v2.common.view.CycleViewPager r1 = r4.a
                int r1 = com.bxkj.base.v2.common.view.CycleViewPager.a(r1)
                if (r0 != r1) goto L66
                com.bxkj.base.v2.common.view.CycleViewPager r0 = r4.a
                java.util.List r0 = com.bxkj.base.v2.common.view.CycleViewPager.l(r0)
                int r0 = r0.size()
                if (r0 <= 0) goto L66
                com.bxkj.base.v2.common.view.CycleViewPager r5 = r4.a
                boolean r5 = com.bxkj.base.v2.common.view.CycleViewPager.f(r5)
                if (r5 != 0) goto L3d
                com.bxkj.base.v2.common.view.CycleViewPager r5 = r4.a
                int r5 = com.bxkj.base.v2.common.view.CycleViewPager.i(r5)
                r0 = 1
                int r5 = r5 + r0
                com.bxkj.base.v2.common.view.CycleViewPager r1 = r4.a
                java.util.List r1 = com.bxkj.base.v2.common.view.CycleViewPager.l(r1)
                int r1 = r1.size()
                int r5 = r5 % r1
                com.bxkj.base.v2.common.view.CycleViewPager r1 = r4.a
                androidx.viewpager.widget.ViewPager r1 = com.bxkj.base.v2.common.view.CycleViewPager.k(r1)
                r1.setCurrentItem(r5, r0)
            L3d:
                com.bxkj.base.v2.common.view.CycleViewPager r5 = r4.a
                long r0 = java.lang.System.currentTimeMillis()
                com.bxkj.base.v2.common.view.CycleViewPager.n(r5, r0)
                com.bxkj.base.v2.common.view.CycleViewPager r5 = r4.a
                android.os.Handler r5 = com.bxkj.base.v2.common.view.CycleViewPager.d(r5)
                com.bxkj.base.v2.common.view.CycleViewPager r0 = r4.a
                java.lang.Runnable r0 = r0.f610w
                r5.removeCallbacks(r0)
                com.bxkj.base.v2.common.view.CycleViewPager r5 = r4.a
                android.os.Handler r5 = com.bxkj.base.v2.common.view.CycleViewPager.d(r5)
                com.bxkj.base.v2.common.view.CycleViewPager r0 = r4.a
                java.lang.Runnable r1 = r0.f610w
                int r0 = com.bxkj.base.v2.common.view.CycleViewPager.c(r0)
                long r2 = (long) r0
                r5.postDelayed(r1, r2)
                return
            L66:
                int r5 = r5.what
                com.bxkj.base.v2.common.view.CycleViewPager r0 = r4.a
                int r0 = com.bxkj.base.v2.common.view.CycleViewPager.b(r0)
                if (r5 != r0) goto L9b
                com.bxkj.base.v2.common.view.CycleViewPager r5 = r4.a
                java.util.List r5 = com.bxkj.base.v2.common.view.CycleViewPager.l(r5)
                int r5 = r5.size()
                if (r5 <= 0) goto L9b
                com.bxkj.base.v2.common.view.CycleViewPager r5 = r4.a
                android.os.Handler r5 = com.bxkj.base.v2.common.view.CycleViewPager.d(r5)
                com.bxkj.base.v2.common.view.CycleViewPager r0 = r4.a
                java.lang.Runnable r0 = r0.f610w
                r5.removeCallbacks(r0)
                com.bxkj.base.v2.common.view.CycleViewPager r5 = r4.a
                android.os.Handler r5 = com.bxkj.base.v2.common.view.CycleViewPager.d(r5)
                com.bxkj.base.v2.common.view.CycleViewPager r0 = r4.a
                java.lang.Runnable r1 = r0.f610w
                int r0 = com.bxkj.base.v2.common.view.CycleViewPager.c(r0)
                long r2 = (long) r0
                r5.postDelayed(r1, r2)
            L9b:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface c {
        void onImageClick(java.lang.String r1, int r2, android.view.View r3);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface d {
        void onItemSelect(int r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class e extends androidx.viewpager.widget.PagerAdapter {
        final /* synthetic */ com.bxkj.base.v2.common.view.CycleViewPager f;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements android.view.View.OnClickListener {
            final /* synthetic */ com.bxkj.base.v2.common.view.CycleViewPager.e a;

            a(com.bxkj.base.v2.common.view.CycleViewPager.e r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r4) {
                    r3 = this;
                    com.bxkj.base.v2.common.view.CycleViewPager$e r0 = r3.a
                    com.bxkj.base.v2.common.view.CycleViewPager r0 = r0.f
                    com.bxkj.base.v2.common.view.CycleViewPager$c r0 = com.bxkj.base.v2.common.view.CycleViewPager.j(r0)
                    com.bxkj.base.v2.common.view.CycleViewPager$e r1 = r3.a
                    com.bxkj.base.v2.common.view.CycleViewPager r1 = r1.f
                    java.util.List r1 = com.bxkj.base.v2.common.view.CycleViewPager.e(r1)
                    com.bxkj.base.v2.common.view.CycleViewPager$e r2 = r3.a
                    com.bxkj.base.v2.common.view.CycleViewPager r2 = r2.f
                    int r2 = com.bxkj.base.v2.common.view.CycleViewPager.i(r2)
                    int r2 = r2 + (-1)
                    java.lang.Object r1 = r1.get(r2)
                    java.lang.String r1 = (java.lang.String) r1
                    com.bxkj.base.v2.common.view.CycleViewPager$e r2 = r3.a
                    com.bxkj.base.v2.common.view.CycleViewPager r2 = r2.f
                    int r2 = com.bxkj.base.v2.common.view.CycleViewPager.i(r2)
                    int r2 = r2 + (-1)
                    r0.onImageClick(r1, r2, r4)
                    return
            }
        }

        private e(com.bxkj.base.v2.common.view.CycleViewPager r1) {
                r0 = this;
                r0.f = r1
                r0.<init>()
                return
        }

        /* synthetic */ e(com.bxkj.base.v2.common.view.CycleViewPager r1, com.bxkj.base.v2.common.view.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public void destroyItem(android.view.ViewGroup r1, int r2, java.lang.Object r3) {
                r0 = this;
                android.view.View r3 = (android.view.View) r3
                r1.removeView(r3)
                return
        }

        public int getCount() {
                r1 = this;
                com.bxkj.base.v2.common.view.CycleViewPager r0 = r1.f
                java.util.List r0 = com.bxkj.base.v2.common.view.CycleViewPager.l(r0)
                int r0 = r0.size()
                return r0
        }

        public int getItemPosition(java.lang.Object r1) {
                r0 = this;
                r1 = -2
                return r1
        }

        public android.view.View instantiateItem(android.view.ViewGroup r2, int r3) {
                r1 = this;
                com.bxkj.base.v2.common.view.CycleViewPager r0 = r1.f
                java.util.List r0 = com.bxkj.base.v2.common.view.CycleViewPager.l(r0)
                java.lang.Object r3 = r0.get(r3)
                android.view.View r3 = (android.view.View) r3
                com.bxkj.base.v2.common.view.CycleViewPager r0 = r1.f
                com.bxkj.base.v2.common.view.CycleViewPager$c r0 = com.bxkj.base.v2.common.view.CycleViewPager.j(r0)
                if (r0 == 0) goto L1c
                com.bxkj.base.v2.common.view.CycleViewPager$e$a r0 = new com.bxkj.base.v2.common.view.CycleViewPager$e$a
                r0.<init>(r1)
                r3.setOnClickListener(r0)
            L1c:
                r2.addView(r3)
                return r3
        }

        /* renamed from: instantiateItem, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ java.lang.Object m2instantiateItem(android.view.ViewGroup r1, int r2) {
                r0 = this;
                android.view.View r1 = r0.instantiateItem(r1, r2)
                return r1
        }

        public boolean isViewFromObject(android.view.View r1, java.lang.Object r2) {
                r0 = this;
                if (r1 != r2) goto L4
                r1 = 1
                return r1
            L4:
                r1 = 0
                return r1
        }
    }

    public CycleViewPager(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public CycleViewPager(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public CycleViewPager(android.content.Context r3, android.util.AttributeSet r4, int r5) {
            r2 = this;
            r2.<init>(r3, r4, r5)
            r4 = 100
            r2.f = r4
            r4 = 101(0x65, float:1.42E-43)
            r2.g = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r2.h = r4
            r4 = 0
            r2.j = r4
            r5 = 1
            r2.k = r5
            r2.f599l = r5
            r5 = 5000(0x1388, float:7.006E-42)
            r2.f600m = r5
            r2.f601n = r4
            r0 = 0
            r2.f602o = r0
            com.bxkj.base.v2.common.view.CycleViewPager$a r5 = new com.bxkj.base.v2.common.view.CycleViewPager$a
            r5.<init>(r2)
            r2.f610w = r5
            r5 = -2
            r2.f611x = r5
            r2.f612y = r5
            r5 = 0
            r2.f613z = r5
            r2.A = r4
            r2.a = r3
            r2.s()
            return
    }

    public static void C(android.widget.TextView r1, int r2) {
            if (r1 == 0) goto L16
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = ""
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            D(r1, r2)
        L16:
            return
    }

    public static void D(android.widget.TextView r0, java.lang.String r1) {
            if (r1 == 0) goto L7
            if (r0 == 0) goto L7
            r0.setText(r1)
        L7:
            return
    }

    static /* bridge */ /* synthetic */ int a(com.bxkj.base.v2.common.view.CycleViewPager r0) {
            int r0 = r0.f
            return r0
    }

    static /* bridge */ /* synthetic */ int b(com.bxkj.base.v2.common.view.CycleViewPager r0) {
            int r0 = r0.g
            return r0
    }

    static /* bridge */ /* synthetic */ int c(com.bxkj.base.v2.common.view.CycleViewPager r0) {
            int r0 = r0.f600m
            return r0
    }

    static /* bridge */ /* synthetic */ android.os.Handler d(com.bxkj.base.v2.common.view.CycleViewPager r0) {
            android.os.Handler r0 = r0.e
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List e(com.bxkj.base.v2.common.view.CycleViewPager r0) {
            java.util.List<java.lang.String> r0 = r0.f606s
            return r0
    }

    static /* bridge */ /* synthetic */ boolean f(com.bxkj.base.v2.common.view.CycleViewPager r0) {
            boolean r0 = r0.j
            return r0
    }

    static /* bridge */ /* synthetic */ boolean g(com.bxkj.base.v2.common.view.CycleViewPager r0) {
            boolean r0 = r0.f599l
            return r0
    }

    static /* bridge */ /* synthetic */ android.content.Context h(com.bxkj.base.v2.common.view.CycleViewPager r0) {
            android.content.Context r0 = r0.a
            return r0
    }

    static /* bridge */ /* synthetic */ int i(com.bxkj.base.v2.common.view.CycleViewPager r0) {
            int r0 = r0.f601n
            return r0
    }

    static /* bridge */ /* synthetic */ com.bxkj.base.v2.common.view.CycleViewPager.c j(com.bxkj.base.v2.common.view.CycleViewPager r0) {
            com.bxkj.base.v2.common.view.CycleViewPager$c r0 = r0.f604q
            return r0
    }

    static /* bridge */ /* synthetic */ androidx.viewpager.widget.ViewPager k(com.bxkj.base.v2.common.view.CycleViewPager r0) {
            androidx.viewpager.widget.ViewPager r0 = r0.b
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List l(com.bxkj.base.v2.common.view.CycleViewPager r0) {
            java.util.List<android.view.View> r0 = r0.h
            return r0
    }

    static /* bridge */ /* synthetic */ long m(com.bxkj.base.v2.common.view.CycleViewPager r2) {
            long r0 = r2.f602o
            return r0
    }

    static /* bridge */ /* synthetic */ void n(com.bxkj.base.v2.common.view.CycleViewPager r0, long r1) {
            r0.f602o = r1
            return
    }

    private android.view.View q(android.content.Context r5, int r6) {
            r4 = this;
            android.widget.RelativeLayout r0 = new android.widget.RelativeLayout
            r0.<init>(r5)
            android.widget.ImageView r1 = new android.widget.ImageView
            r1.<init>(r5)
            android.widget.RelativeLayout$LayoutParams r2 = new android.widget.RelativeLayout$LayoutParams
            r3 = -1
            r2.<init>(r3, r3)
            android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.CENTER_CROP
            r1.setScaleType(r3)
            r1.setLayoutParams(r2)
            com.bumptech.glide.i r3 = com.bumptech.glide.b.D(r5)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            com.bumptech.glide.h r6 = r3.K(r6)
            r6.m1(r1)
            android.widget.ImageView r6 = new android.widget.ImageView
            r6.<init>(r5)
            r6.setLayoutParams(r2)
            r0.addView(r1)
            r0.addView(r6)
            return r0
    }

    private android.view.View r(android.content.Context r6, java.lang.String r7) {
            r5 = this;
            android.widget.RelativeLayout r0 = new android.widget.RelativeLayout
            r0.<init>(r6)
            android.widget.ImageView r1 = new android.widget.ImageView
            r1.<init>(r6)
            android.widget.RelativeLayout$LayoutParams r2 = new android.widget.RelativeLayout$LayoutParams
            r3 = -1
            r2.<init>(r3, r3)
            android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.CENTER_CROP
            r1.setScaleType(r3)
            r1.setLayoutParams(r2)
            int r3 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.NumberFormatException -> L2c
            com.bumptech.glide.i r4 = com.bumptech.glide.b.D(r6)     // Catch: java.lang.NumberFormatException -> L2c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.NumberFormatException -> L2c
            com.bumptech.glide.h r3 = r4.K(r3)     // Catch: java.lang.NumberFormatException -> L2c
            r3.m1(r1)     // Catch: java.lang.NumberFormatException -> L2c
            goto L37
        L2c:
            com.bumptech.glide.i r3 = com.bumptech.glide.b.D(r6)
            com.bumptech.glide.h r7 = r3.M(r7)
            r7.m1(r1)
        L37:
            android.widget.ImageView r7 = new android.widget.ImageView
            r7.<init>(r6)
            r7.setLayoutParams(r2)
            r0.addView(r1)
            r0.addView(r7)
            return r0
    }

    private void s() {
            r3 = this;
            android.content.Context r0 = r3.a
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = com.bxkj.base.R.layout.pub_layout_cycle_view
            r2 = 1
            r0.inflate(r1, r3, r2)
            int r0 = com.bxkj.base.R.id.cycle_view_pager
            android.view.View r0 = r3.findViewById(r0)
            androidx.viewpager.widget.ViewPager r0 = (androidx.viewpager.widget.ViewPager) r0
            r3.b = r0
            int r0 = com.bxkj.base.R.id.cycle_title
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.c = r0
            int r0 = com.bxkj.base.R.id.cycle_indicator
            android.view.View r0 = r3.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r3.d = r0
            com.bxkj.base.v2.common.view.CycleViewPager$b r0 = new com.bxkj.base.v2.common.view.CycleViewPager$b
            r0.<init>(r3)
            r3.e = r0
            return
    }

    private void setIndicator(int r4) {
            r3 = this;
            com.bxkj.base.v2.common.view.CycleViewPager$d r0 = r3.f605r
            if (r0 == 0) goto L7
            r0.onItemSelect(r4)
        L7:
            r0 = 0
        L8:
            android.widget.ImageView[] r1 = r3.i     // Catch: java.lang.Exception -> L21
            int r2 = r1.length     // Catch: java.lang.Exception -> L21
            if (r0 >= r2) goto L17
            r1 = r1[r0]     // Catch: java.lang.Exception -> L21
            int r2 = r3.f609v     // Catch: java.lang.Exception -> L21
            r1.setBackgroundResource(r2)     // Catch: java.lang.Exception -> L21
            int r0 = r0 + 1
            goto L8
        L17:
            int r0 = r1.length     // Catch: java.lang.Exception -> L21
            if (r0 <= r4) goto L21
            r4 = r1[r4]     // Catch: java.lang.Exception -> L21
            int r0 = r3.f608u     // Catch: java.lang.Exception -> L21
            r4.setBackgroundResource(r0)     // Catch: java.lang.Exception -> L21
        L21:
            return
    }

    public void A(int r1, int r2) {
            r0 = this;
            r0.f611x = r1
            r0.f612y = r2
            return
    }

    public void B(int r1, int r2) {
            r0 = this;
            r0.f608u = r1
            r0.f609v = r2
            return
    }

    public void o(android.view.View r5) {
            r4 = this;
            r4.f613z = r5
            java.util.List<android.view.View> r0 = r4.h
            r0.add(r5)
            java.util.List<java.lang.String> r5 = r4.f606s
            if (r5 != 0) goto L12
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4.f606s = r5
        L12:
            java.util.List<java.lang.String> r5 = r4.f606s
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L3c
            java.util.List<android.view.View> r5 = r4.h
            int r5 = r5.size()
            r0 = 1
            if (r5 <= r0) goto L3c
            java.util.List<android.view.View> r5 = r4.h
            int r5 = r5.size()
            java.util.List<java.lang.String> r0 = r4.f606s
            int r0 = r0.size()
            if (r5 <= r0) goto L3c
            java.util.List<android.view.View> r5 = r4.h
            int r0 = r5.size()
            int r0 = r0 + (-2)
            r5.remove(r0)
        L3c:
            java.util.List<android.view.View> r5 = r4.h
            android.content.Context r0 = r4.a
            java.util.List<java.lang.String> r1 = r4.f606s
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            android.view.View r0 = r4.r(r0, r1)
            r5.add(r0)
            java.util.List<android.view.View> r5 = r4.h
            int r5 = r5.size()
            android.widget.ImageView[] r0 = new android.widget.ImageView[r5]
            r4.i = r0
            boolean r0 = r4.k
            if (r0 == 0) goto L64
            int r5 = r5 + (-2)
            android.widget.ImageView[] r5 = new android.widget.ImageView[r5]
            r4.i = r5
        L64:
            android.widget.LinearLayout r5 = r4.d
            r5.removeAllViews()
            r5 = 0
        L6a:
            android.widget.ImageView[] r0 = r4.i
            int r1 = r0.length
            if (r5 >= r1) goto La2
            android.widget.ImageView r1 = new android.widget.ImageView
            android.content.Context r3 = r4.a
            r1.<init>(r3)
            r0[r5] = r1
            android.widget.ImageView[] r0 = r4.i
            r0 = r0[r5]
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP
            r0.setScaleType(r1)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            int r1 = r4.f611x
            int r3 = r4.f612y
            r0.<init>(r1, r3)
            r1 = 10
            r0.setMargins(r1, r2, r1, r2)
            android.widget.ImageView[] r1 = r4.i
            r1 = r1[r5]
            r1.setLayoutParams(r0)
            android.widget.LinearLayout r0 = r4.d
            android.widget.ImageView[] r1 = r4.i
            r1 = r1[r5]
            r0.addView(r1)
            int r5 = r5 + 1
            goto L6a
        La2:
            int r5 = r4.A
            r4.setIndicator(r5)
            com.bxkj.base.v2.common.view.CycleViewPager$e r5 = r4.f603p
            r5.notifyDataSetChanged()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r2 = this;
            android.os.Handler r0 = r2.e
            java.lang.Runnable r1 = r2.f610w
            r0.removeCallbacks(r1)
            super.onDetachedFromWindow()
            return
    }

    public void onPageScrollStateChanged(int r4) {
            r3 = this;
            r0 = 1
            if (r4 != r0) goto L6
            r3.j = r0
            return
        L6:
            r0 = 0
            if (r4 != 0) goto L16
            long r1 = java.lang.System.currentTimeMillis()
            r3.f602o = r1
            androidx.viewpager.widget.ViewPager r4 = r3.b
            int r1 = r3.f601n
            r4.setCurrentItem(r1, r0)
        L16:
            r3.j = r0
            return
    }

    public void onPageScrolled(int r1, float r2, int r3) {
            r0 = this;
            return
    }

    public void onPageSelected(int r4) {
            r3 = this;
            java.util.List<android.view.View> r0 = r3.h
            int r0 = r0.size()
            int r1 = r0 + (-1)
            r3.f601n = r4
            boolean r2 = r3.k
            if (r2 == 0) goto L1d
            r2 = 1
            if (r4 != 0) goto L16
            int r0 = r0 + (-2)
            r3.f601n = r0
            goto L1a
        L16:
            if (r4 != r1) goto L1a
            r3.f601n = r2
        L1a:
            int r4 = r3.f601n
            int r4 = r4 - r2
        L1d:
            r3.A = r4
            r3.setIndicator(r4)
            return
    }

    public void p() {
            r5 = this;
            java.util.List<android.view.View> r0 = r5.h
            android.view.View r1 = r5.f613z
            r0.remove(r1)
            java.util.List<android.view.View> r0 = r5.h
            int r0 = r0.size()
            android.widget.ImageView[] r1 = new android.widget.ImageView[r0]
            r5.i = r1
            boolean r1 = r5.k
            if (r1 == 0) goto L1b
            int r0 = r0 + (-2)
            android.widget.ImageView[] r0 = new android.widget.ImageView[r0]
            r5.i = r0
        L1b:
            android.widget.LinearLayout r0 = r5.d
            r0.removeAllViews()
            r0 = 0
            r1 = 0
        L22:
            android.widget.ImageView[] r2 = r5.i
            int r3 = r2.length
            if (r1 >= r3) goto L5a
            android.widget.ImageView r3 = new android.widget.ImageView
            android.content.Context r4 = r5.a
            r3.<init>(r4)
            r2[r1] = r3
            android.widget.ImageView[] r2 = r5.i
            r2 = r2[r1]
            android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.CENTER_CROP
            r2.setScaleType(r3)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            int r3 = r5.f611x
            int r4 = r5.f612y
            r2.<init>(r3, r4)
            r3 = 10
            r2.setMargins(r3, r0, r3, r0)
            android.widget.ImageView[] r3 = r5.i
            r3 = r3[r1]
            r3.setLayoutParams(r2)
            android.widget.LinearLayout r2 = r5.d
            android.widget.ImageView[] r3 = r5.i
            r3 = r3[r1]
            r2.addView(r3)
            int r1 = r1 + 1
            goto L22
        L5a:
            r1 = 1
            r5.f601n = r1
            r5.setIndicator(r0)
            com.bxkj.base.v2.common.view.CycleViewPager$e r0 = r5.f603p
            r0.notifyDataSetChanged()
            return
    }

    public void setCycle(boolean r1) {
            r0 = this;
            r0.k = r1
            return
    }

    public void setDelay(int r1) {
            r0 = this;
            r0.f600m = r1
            return
    }

    public void setImageCycleViewSelectListener(com.bxkj.base.v2.common.view.CycleViewPager.d r1) {
            r0 = this;
            r0.f605r = r1
            return
    }

    public void setWheel(boolean r4) {
            r3 = this;
            r3.f599l = r4
            r0 = 1
            r3.k = r0
            if (r4 == 0) goto L11
            android.os.Handler r4 = r3.e
            java.lang.Runnable r0 = r3.f610w
            int r1 = r3.f600m
            long r1 = (long) r1
            r4.postDelayed(r0, r1)
        L11:
            return
    }

    public boolean t() {
            r1 = this;
            boolean r0 = r1.k
            return r0
    }

    public boolean u() {
            r1 = this;
            boolean r0 = r1.f599l
            return r0
    }

    public void v() {
            r1 = this;
            com.bxkj.base.v2.common.view.CycleViewPager$e r0 = r1.f603p
            if (r0 == 0) goto L7
            r0.notifyDataSetChanged()
        L7:
            return
    }

    public void w(java.util.List<java.lang.String> r2, com.bxkj.base.v2.common.view.CycleViewPager.c r3) {
            r1 = this;
            r0 = 0
            r1.x(r2, r3, r0)
            return
    }

    public void x(java.util.List<java.lang.String> r6, com.bxkj.base.v2.common.view.CycleViewPager.c r7, int r8) {
            r5 = this;
            r0 = 8
            if (r6 == 0) goto L120
            int r1 = r6.size()
            if (r1 != 0) goto Lc
            goto L120
        Lc:
            java.util.List<android.view.View> r1 = r5.h
            r1.clear()
            r5.f606s = r6
            boolean r1 = r5.k
            r2 = 0
            if (r1 == 0) goto L62
            java.util.List<android.view.View> r1 = r5.h
            android.content.Context r3 = r5.a
            int r4 = r6.size()
            int r4 = r4 + (-1)
            java.lang.Object r6 = r6.get(r4)
            java.lang.String r6 = (java.lang.String) r6
            android.view.View r6 = r5.r(r3, r6)
            r1.add(r6)
            r6 = 0
        L30:
            java.util.List<java.lang.String> r1 = r5.f606s
            int r1 = r1.size()
            if (r6 >= r1) goto L4e
            java.util.List<android.view.View> r1 = r5.h
            android.content.Context r3 = r5.a
            java.util.List<java.lang.String> r4 = r5.f606s
            java.lang.Object r4 = r4.get(r6)
            java.lang.String r4 = (java.lang.String) r4
            android.view.View r3 = r5.r(r3, r4)
            r1.add(r3)
            int r6 = r6 + 1
            goto L30
        L4e:
            java.util.List<android.view.View> r6 = r5.h
            android.content.Context r1 = r5.a
            java.util.List<java.lang.String> r3 = r5.f606s
            java.lang.Object r3 = r3.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            android.view.View r1 = r5.r(r1, r3)
            r6.add(r1)
            goto L81
        L62:
            r6 = 0
        L63:
            java.util.List<java.lang.String> r1 = r5.f606s
            int r1 = r1.size()
            if (r6 >= r1) goto L81
            java.util.List<android.view.View> r1 = r5.h
            android.content.Context r3 = r5.a
            java.util.List<java.lang.String> r4 = r5.f606s
            java.lang.Object r4 = r4.get(r6)
            java.lang.String r4 = (java.lang.String) r4
            android.view.View r3 = r5.r(r3, r4)
            r1.add(r3)
            int r6 = r6 + 1
            goto L63
        L81:
            java.util.List<android.view.View> r6 = r5.h
            if (r6 == 0) goto L11c
            int r6 = r6.size()
            if (r6 != 0) goto L8d
            goto L11c
        L8d:
            r5.f604q = r7
            java.util.List<android.view.View> r6 = r5.h
            int r6 = r6.size()
            android.widget.ImageView[] r7 = new android.widget.ImageView[r6]
            r5.i = r7
            boolean r7 = r5.k
            if (r7 == 0) goto La3
            int r6 = r6 + (-2)
            android.widget.ImageView[] r6 = new android.widget.ImageView[r6]
            r5.i = r6
        La3:
            android.widget.LinearLayout r6 = r5.d
            r6.removeAllViews()
            r6 = 0
        La9:
            android.widget.ImageView[] r7 = r5.i
            int r0 = r7.length
            if (r6 >= r0) goto Le1
            android.widget.ImageView r0 = new android.widget.ImageView
            android.content.Context r1 = r5.a
            r0.<init>(r1)
            r7[r6] = r0
            android.widget.ImageView[] r7 = r5.i
            r7 = r7[r6]
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
            r7.setScaleType(r0)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            int r0 = r5.f611x
            int r1 = r5.f612y
            r7.<init>(r0, r1)
            r0 = 10
            r7.setMargins(r0, r2, r0, r2)
            android.widget.ImageView[] r0 = r5.i
            r0 = r0[r6]
            r0.setLayoutParams(r7)
            android.widget.LinearLayout r7 = r5.d
            android.widget.ImageView[] r0 = r5.i
            r0 = r0[r6]
            r7.addView(r0)
            int r6 = r6 + 1
            goto La9
        Le1:
            com.bxkj.base.v2.common.view.CycleViewPager$e r6 = new com.bxkj.base.v2.common.view.CycleViewPager$e
            r7 = 0
            r6.<init>(r5, r7)
            r5.f603p = r6
            r5.setIndicator(r2)
            androidx.viewpager.widget.ViewPager r6 = r5.b
            r7 = 3
            r6.setOffscreenPageLimit(r7)
            androidx.viewpager.widget.ViewPager r6 = r5.b
            r6.setOnPageChangeListener(r5)
            androidx.viewpager.widget.ViewPager r6 = r5.b
            com.bxkj.base.v2.common.view.CycleViewPager$e r7 = r5.f603p
            r6.setAdapter(r7)
            if (r8 < 0) goto L108
            java.util.List<android.view.View> r6 = r5.h
            int r6 = r6.size()
            if (r8 < r6) goto L109
        L108:
            r8 = 0
        L109:
            boolean r6 = r5.k
            if (r6 == 0) goto L10f
            int r8 = r8 + 1
        L10f:
            androidx.viewpager.widget.ViewPager r6 = r5.b
            r6.setCurrentItem(r8)
            boolean r6 = r5.u()
            r5.setWheel(r6)
            return
        L11c:
            r5.setVisibility(r0)
            return
        L120:
            r5.setVisibility(r0)
            return
    }

    public void y(java.util.List<java.lang.Integer> r2, com.bxkj.base.v2.common.view.CycleViewPager.c r3) {
            r1 = this;
            r0 = 0
            r1.z(r2, r3, r0)
            return
    }

    public void z(java.util.List<java.lang.Integer> r6, com.bxkj.base.v2.common.view.CycleViewPager.c r7, int r8) {
            r5 = this;
            r0 = 8
            if (r6 == 0) goto L122
            int r1 = r6.size()
            if (r1 != 0) goto Lc
            goto L122
        Lc:
            java.util.List<android.view.View> r1 = r5.h
            r1.clear()
            r5.f607t = r6
            boolean r6 = r5.k
            r1 = 0
            if (r6 == 0) goto L64
            java.util.List<android.view.View> r6 = r5.h
            android.content.Context r2 = r5.a
            java.util.List<java.lang.String> r3 = r5.f606s
            int r4 = r3.size()
            int r4 = r4 + (-1)
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            android.view.View r2 = r5.r(r2, r3)
            r6.add(r2)
            r6 = 0
        L32:
            java.util.List<java.lang.String> r2 = r5.f606s
            int r2 = r2.size()
            if (r6 >= r2) goto L50
            java.util.List<android.view.View> r2 = r5.h
            android.content.Context r3 = r5.a
            java.util.List<java.lang.String> r4 = r5.f606s
            java.lang.Object r4 = r4.get(r6)
            java.lang.String r4 = (java.lang.String) r4
            android.view.View r3 = r5.r(r3, r4)
            r2.add(r3)
            int r6 = r6 + 1
            goto L32
        L50:
            java.util.List<android.view.View> r6 = r5.h
            android.content.Context r2 = r5.a
            java.util.List<java.lang.String> r3 = r5.f606s
            java.lang.Object r3 = r3.get(r1)
            java.lang.String r3 = (java.lang.String) r3
            android.view.View r2 = r5.r(r2, r3)
            r6.add(r2)
            goto L83
        L64:
            r6 = 0
        L65:
            java.util.List<java.lang.String> r2 = r5.f606s
            int r2 = r2.size()
            if (r6 >= r2) goto L83
            java.util.List<android.view.View> r2 = r5.h
            android.content.Context r3 = r5.a
            java.util.List<java.lang.String> r4 = r5.f606s
            java.lang.Object r4 = r4.get(r6)
            java.lang.String r4 = (java.lang.String) r4
            android.view.View r3 = r5.r(r3, r4)
            r2.add(r3)
            int r6 = r6 + 1
            goto L65
        L83:
            java.util.List<android.view.View> r6 = r5.h
            if (r6 == 0) goto L11e
            int r6 = r6.size()
            if (r6 != 0) goto L8f
            goto L11e
        L8f:
            r5.f604q = r7
            java.util.List<android.view.View> r6 = r5.h
            int r6 = r6.size()
            android.widget.ImageView[] r7 = new android.widget.ImageView[r6]
            r5.i = r7
            boolean r7 = r5.k
            if (r7 == 0) goto La5
            int r6 = r6 + (-2)
            android.widget.ImageView[] r6 = new android.widget.ImageView[r6]
            r5.i = r6
        La5:
            android.widget.LinearLayout r6 = r5.d
            r6.removeAllViews()
            r6 = 0
        Lab:
            android.widget.ImageView[] r7 = r5.i
            int r0 = r7.length
            if (r6 >= r0) goto Le3
            android.widget.ImageView r0 = new android.widget.ImageView
            android.content.Context r2 = r5.a
            r0.<init>(r2)
            r7[r6] = r0
            android.widget.ImageView[] r7 = r5.i
            r7 = r7[r6]
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
            r7.setScaleType(r0)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            int r0 = r5.f611x
            int r2 = r5.f612y
            r7.<init>(r0, r2)
            r0 = 10
            r7.setMargins(r0, r1, r0, r1)
            android.widget.ImageView[] r0 = r5.i
            r0 = r0[r6]
            r0.setLayoutParams(r7)
            android.widget.LinearLayout r7 = r5.d
            android.widget.ImageView[] r0 = r5.i
            r0 = r0[r6]
            r7.addView(r0)
            int r6 = r6 + 1
            goto Lab
        Le3:
            com.bxkj.base.v2.common.view.CycleViewPager$e r6 = new com.bxkj.base.v2.common.view.CycleViewPager$e
            r7 = 0
            r6.<init>(r5, r7)
            r5.f603p = r6
            r5.setIndicator(r1)
            androidx.viewpager.widget.ViewPager r6 = r5.b
            r7 = 3
            r6.setOffscreenPageLimit(r7)
            androidx.viewpager.widget.ViewPager r6 = r5.b
            r6.setOnPageChangeListener(r5)
            androidx.viewpager.widget.ViewPager r6 = r5.b
            com.bxkj.base.v2.common.view.CycleViewPager$e r7 = r5.f603p
            r6.setAdapter(r7)
            if (r8 < 0) goto L10a
            java.util.List<android.view.View> r6 = r5.h
            int r6 = r6.size()
            if (r8 < r6) goto L10b
        L10a:
            r8 = 0
        L10b:
            boolean r6 = r5.k
            if (r6 == 0) goto L111
            int r8 = r8 + 1
        L111:
            androidx.viewpager.widget.ViewPager r6 = r5.b
            r6.setCurrentItem(r8)
            boolean r6 = r5.u()
            r5.setWheel(r6)
            return
        L11e:
            r5.setVisibility(r0)
            return
        L122:
            r5.setVisibility(r0)
            return
    }
}
