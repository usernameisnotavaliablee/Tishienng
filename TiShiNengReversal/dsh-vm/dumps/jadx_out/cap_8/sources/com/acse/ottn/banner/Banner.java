package com.acse.ottn.banner;

import com.acse.ottn.u;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class Banner<T, BA extends com.acse.ottn.u> extends android.widget.FrameLayout implements com.acse.ottn.y {
    public static final int I = -1;
    public static final int J = 0;
    public static final int K = 1;
    public int A;
    public float B;
    public float C;
    public boolean D;
    public boolean E;
    public android.graphics.Paint F;
    public android.graphics.Paint G;
    public androidx.recyclerview.widget.RecyclerView.AdapterDataObserver H;
    public androidx.viewpager2.widget.ViewPager2 a;

    /* renamed from: b, reason: collision with root package name */
    public com.acse.ottn.banner.Banner.b f2183b;

    /* renamed from: c, reason: collision with root package name */
    public com.acse.ottn.c3 f2184c;

    /* renamed from: d, reason: collision with root package name */
    public BA f2185d;

    /* renamed from: e, reason: collision with root package name */
    public com.acse.ottn.u1 f2186e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.viewpager2.widget.CompositePageTransformer f2187f;

    /* renamed from: g, reason: collision with root package name */
    public com.acse.ottn.banner.Banner<T, BA>.c f2188g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2189h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2190i;

    /* renamed from: j, reason: collision with root package name */
    public long f2191j;

    /* renamed from: k, reason: collision with root package name */
    public int f2192k;
    public int l;
    public float m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a extends androidx.recyclerview.widget.RecyclerView.AdapterDataObserver {
        public final /* synthetic */ com.acse.ottn.banner.Banner a;

        public a(com.acse.ottn.banner.Banner r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void onChanged() {
                r2 = this;
                com.acse.ottn.banner.Banner r0 = r2.a
                int r0 = r0.getItemCount()
                r1 = 1
                if (r0 > r1) goto Lf
                com.acse.ottn.banner.Banner r0 = r2.a
                r0.i()
                goto L14
            Lf:
                com.acse.ottn.banner.Banner r0 = r2.a
                r0.h()
            L14:
                com.acse.ottn.banner.Banner r0 = r2.a
                r0.f()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class b implements java.lang.Runnable {
        public final java.lang.ref.WeakReference<com.acse.ottn.banner.Banner> a;

        public b(com.acse.ottn.banner.Banner r2) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.a = r0
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                java.lang.ref.WeakReference<com.acse.ottn.banner.Banner> r0 = r4.a
                java.lang.Object r0 = r0.get()
                com.acse.ottn.banner.Banner r0 = (com.acse.ottn.banner.Banner) r0
                if (r0 == 0) goto L2c
                boolean r1 = com.acse.ottn.banner.Banner.d(r0)
                if (r1 == 0) goto L2c
                int r1 = r0.getItemCount()
                if (r1 != 0) goto L17
                goto L2c
            L17:
                int r2 = r0.getCurrentItem()
                int r2 = r2 + 1
                int r2 = r2 % r1
                r0.b(r2)
                com.acse.ottn.banner.Banner$b r1 = com.acse.ottn.banner.Banner.e(r0)
                long r2 = com.acse.ottn.banner.Banner.f(r0)
                r0.postDelayed(r1, r2)
            L2c:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class c extends androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback {
        public int a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f2193b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.banner.Banner f2194c;

        public c(com.acse.ottn.banner.Banner r1) {
                r0 = this;
                r0.f2194c = r1
                r0.<init>()
                r1 = -1
                r0.a = r1
                return
        }

        public void onPageScrollStateChanged(int r5) {
                r4 = this;
                r0 = 1
                if (r5 == r0) goto L36
                r1 = 2
                if (r5 != r1) goto L7
                goto L36
            L7:
                if (r5 != 0) goto L38
                r1 = 0
                r4.f2193b = r1
                int r2 = r4.a
                r3 = -1
                if (r2 == r3) goto L38
                com.acse.ottn.banner.Banner r2 = r4.f2194c
                boolean r2 = com.acse.ottn.banner.Banner.c(r2)
                if (r2 == 0) goto L38
                int r2 = r4.a
                if (r2 != 0) goto L27
                com.acse.ottn.banner.Banner r0 = r4.f2194c
                int r2 = r0.getRealCount()
                r0.a(r2, r1)
                goto L38
            L27:
                com.acse.ottn.banner.Banner r3 = r4.f2194c
                int r3 = r3.getItemCount()
                int r3 = r3 - r0
                if (r2 != r3) goto L38
                com.acse.ottn.banner.Banner r2 = r4.f2194c
                r2.a(r0, r1)
                goto L38
            L36:
                r4.f2193b = r0
            L38:
                com.acse.ottn.banner.Banner r0 = r4.f2194c
                com.acse.ottn.c3 r0 = com.acse.ottn.banner.Banner.a(r0)
                if (r0 == 0) goto L49
                com.acse.ottn.banner.Banner r0 = r4.f2194c
                com.acse.ottn.c3 r0 = com.acse.ottn.banner.Banner.a(r0)
                r0.onPageScrollStateChanged(r5)
            L49:
                com.acse.ottn.banner.Banner r0 = r4.f2194c
                com.acse.ottn.u1 r0 = com.acse.ottn.banner.Banner.b(r0)
                if (r0 == 0) goto L5a
                com.acse.ottn.banner.Banner r0 = r4.f2194c
                com.acse.ottn.u1 r0 = com.acse.ottn.banner.Banner.b(r0)
                r0.onPageScrollStateChanged(r5)
            L5a:
                return
        }

        public void onPageScrolled(int r3, float r4, int r5) {
                r2 = this;
                com.acse.ottn.banner.Banner r0 = r2.f2194c
                boolean r0 = r0.d()
                com.acse.ottn.banner.Banner r1 = r2.f2194c
                int r1 = r1.getRealCount()
                int r3 = com.acse.ottn.z.a(r0, r3, r1)
                com.acse.ottn.banner.Banner r0 = r2.f2194c
                com.acse.ottn.c3 r0 = com.acse.ottn.banner.Banner.a(r0)
                if (r0 == 0) goto L21
                com.acse.ottn.banner.Banner r0 = r2.f2194c
                com.acse.ottn.c3 r0 = com.acse.ottn.banner.Banner.a(r0)
                r0.onPageScrolled(r3, r4, r5)
            L21:
                com.acse.ottn.banner.Banner r0 = r2.f2194c
                com.acse.ottn.u1 r0 = com.acse.ottn.banner.Banner.b(r0)
                if (r0 == 0) goto L32
                com.acse.ottn.banner.Banner r0 = r2.f2194c
                com.acse.ottn.u1 r0 = com.acse.ottn.banner.Banner.b(r0)
                r0.onPageScrolled(r3, r4, r5)
            L32:
                return
        }

        public void onPageSelected(int r3) {
                r2 = this;
                boolean r0 = r2.f2193b
                if (r0 == 0) goto L38
                r2.a = r3
                com.acse.ottn.banner.Banner r0 = r2.f2194c
                boolean r0 = r0.d()
                com.acse.ottn.banner.Banner r1 = r2.f2194c
                int r1 = r1.getRealCount()
                int r3 = com.acse.ottn.z.a(r0, r3, r1)
                com.acse.ottn.banner.Banner r0 = r2.f2194c
                com.acse.ottn.c3 r0 = com.acse.ottn.banner.Banner.a(r0)
                if (r0 == 0) goto L27
                com.acse.ottn.banner.Banner r0 = r2.f2194c
                com.acse.ottn.c3 r0 = com.acse.ottn.banner.Banner.a(r0)
                r0.onPageSelected(r3)
            L27:
                com.acse.ottn.banner.Banner r0 = r2.f2194c
                com.acse.ottn.u1 r0 = com.acse.ottn.banner.Banner.b(r0)
                if (r0 == 0) goto L38
                com.acse.ottn.banner.Banner r0 = r2.f2194c
                com.acse.ottn.u1 r0 = com.acse.ottn.banner.Banner.b(r0)
                r0.onPageSelected(r3)
            L38:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface d {
    }

    public Banner(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public Banner(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public Banner(android.content.Context r3, android.util.AttributeSet r4, int r5) {
            r2 = this;
            r2.<init>(r3, r4, r5)
            r5 = 1
            r2.f2189h = r5
            r2.f2190i = r5
            r0 = 3000(0xbb8, double:1.482E-320)
            r2.f2191j = r0
            r0 = 600(0x258, float:8.41E-43)
            r2.f2192k = r0
            r2.l = r5
            r0 = 0
            r2.m = r0
            int r0 = com.acse.ottn.v.f2812g
            r2.n = r0
            int r0 = com.acse.ottn.v.f2813h
            r2.o = r0
            r0 = -1996488705(0xffffffff88ffffff, float:-1.5407439E-33)
            r2.p = r0
            r0 = -2013265920(0xffffffff88000000, float:-3.85186E-34)
            r2.q = r0
            r2.r = r5
            int r0 = com.acse.ottn.v.f2816k
            r2.y = r0
            int r0 = com.acse.ottn.v.l
            r2.z = r0
            r2.E = r5
            com.acse.ottn.banner.Banner$a r5 = new com.acse.ottn.banner.Banner$a
            r5.<init>(r2)
            r2.H = r5
            r2.a(r3)
            r2.a(r3, r4)
            return
    }

    public static /* synthetic */ com.acse.ottn.c3 a(com.acse.ottn.banner.Banner r0) {
            com.acse.ottn.c3 r0 = r0.f2184c
            return r0
    }

    public static /* synthetic */ com.acse.ottn.u1 b(com.acse.ottn.banner.Banner r0) {
            com.acse.ottn.u1 r0 = r0.f2186e
            return r0
    }

    public static /* synthetic */ boolean c(com.acse.ottn.banner.Banner r0) {
            boolean r0 = r0.f2189h
            return r0
    }

    public static /* synthetic */ boolean d(com.acse.ottn.banner.Banner r0) {
            boolean r0 = r0.f2190i
            return r0
    }

    public static /* synthetic */ com.acse.ottn.banner.Banner.b e(com.acse.ottn.banner.Banner r0) {
            com.acse.ottn.banner.Banner$b r0 = r0.f2183b
            return r0
    }

    public static /* synthetic */ long f(com.acse.ottn.banner.Banner r2) {
            long r0 = r2.f2191j
            return r0
    }

    private void setRecyclerViewPadding(int r1) {
            r0 = this;
            r0.c(r1, r1)
            return
    }

    public com.acse.ottn.banner.Banner a(float r1) {
            r0 = this;
            r0.m = r1
            return r0
    }

    public com.acse.ottn.banner.Banner a(int r2) {
            r1 = this;
            r0 = 1063339950(0x3f6147ae, float:0.88)
            com.acse.ottn.banner.Banner r2 = r1.a(r2, r0)
            return r2
    }

    public com.acse.ottn.banner.Banner a(int r2, float r3) {
            r1 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L13
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L13
            com.acse.ottn.k2 r0 = new com.acse.ottn.k2
            r0.<init>(r3)
            r1.a(r0)
        L13:
            float r2 = (float) r2
            float r2 = com.acse.ottn.z.a(r2)
            int r2 = (int) r2
            r1.setRecyclerViewPadding(r2)
            return r1
    }

    public com.acse.ottn.banner.Banner a(int r2, int r3) {
            r1 = this;
            r0 = 1062836634(0x3f59999a, float:0.85)
            com.acse.ottn.banner.Banner r2 = r1.a(r2, r3, r0)
            return r2
    }

    public com.acse.ottn.banner.Banner a(int r1, int r2, float r3) {
            r0 = this;
            com.acse.ottn.banner.Banner r1 = r0.a(r1, r1, r2, r3)
            return r1
    }

    public com.acse.ottn.banner.Banner a(int r2, int r3, int r4) {
            r1 = this;
            r0 = 1062836634(0x3f59999a, float:0.85)
            com.acse.ottn.banner.Banner r2 = r1.a(r2, r3, r4, r0)
            return r2
    }

    public com.acse.ottn.banner.Banner a(int r3, int r4, int r5, float r6) {
            r2 = this;
            if (r5 <= 0) goto L10
            androidx.viewpager2.widget.MarginPageTransformer r0 = new androidx.viewpager2.widget.MarginPageTransformer
            float r1 = (float) r5
            float r1 = com.acse.ottn.z.a(r1)
            int r1 = (int) r1
            r0.<init>(r1)
            r2.a(r0)
        L10:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 >= 0) goto L23
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L23
            com.acse.ottn.a4 r0 = new com.acse.ottn.a4
            r0.<init>(r6)
            r2.a(r0)
        L23:
            r6 = 0
            if (r3 <= 0) goto L2e
            int r3 = r3 + r5
            float r3 = (float) r3
            float r3 = com.acse.ottn.z.a(r3)
            int r3 = (int) r3
            goto L2f
        L2e:
            r3 = 0
        L2f:
            if (r4 <= 0) goto L38
            int r4 = r4 + r5
            float r4 = (float) r4
            float r4 = com.acse.ottn.z.a(r4)
            int r6 = (int) r4
        L38:
            r2.c(r3, r6)
            return r2
    }

    public com.acse.ottn.banner.Banner a(int r2, boolean r3) {
            r1 = this;
            androidx.viewpager2.widget.ViewPager2 r0 = r1.getViewPager2()
            r0.setCurrentItem(r2, r3)
            return r1
    }

    public com.acse.ottn.banner.Banner a(long r1) {
            r0 = this;
            r0.f2191j = r1
            return r0
    }

    public com.acse.ottn.banner.Banner a(androidx.recyclerview.widget.RecyclerView.ItemDecoration r2) {
            r1 = this;
            androidx.viewpager2.widget.ViewPager2 r0 = r1.getViewPager2()
            r0.addItemDecoration(r2)
            return r1
    }

    public com.acse.ottn.banner.Banner a(androidx.recyclerview.widget.RecyclerView.ItemDecoration r2, int r3) {
            r1 = this;
            androidx.viewpager2.widget.ViewPager2 r0 = r1.getViewPager2()
            r0.addItemDecoration(r2, r3)
            return r1
    }

    public com.acse.ottn.banner.Banner a(@androidx.annotation.Nullable androidx.viewpager2.widget.ViewPager2.PageTransformer r2) {
            r1 = this;
            androidx.viewpager2.widget.CompositePageTransformer r0 = r1.f2187f
            r0.addTransformer(r2)
            return r1
    }

    public com.acse.ottn.banner.Banner a(com.acse.ottn.b3 r2) {
            r1 = this;
            com.acse.ottn.u r0 = r1.getAdapter()
            if (r0 == 0) goto Ld
            com.acse.ottn.u r0 = r1.getAdapter()
            r0.a(r2)
        Ld:
            return r1
    }

    public com.acse.ottn.banner.Banner a(com.acse.ottn.c3 r1) {
            r0 = this;
            r0.f2184c = r1
            return r0
    }

    public com.acse.ottn.banner.Banner a(com.acse.ottn.u1 r2) {
            r1 = this;
            r0 = 1
            com.acse.ottn.banner.Banner r2 = r1.a(r2, r0)
            return r2
    }

    public com.acse.ottn.banner.Banner a(com.acse.ottn.u1 r2, boolean r3) {
            r1 = this;
            r1.e()
            com.acse.ottn.v1 r0 = r2.getIndicatorConfig()
            r0.a(r3)
            r1.f2186e = r2
            r1.b()
            return r1
    }

    public com.acse.ottn.banner.Banner a(BA r4) {
            r3 = this;
            if (r4 == 0) goto L25
            r3.f2185d = r4
            boolean r0 = r3.d()
            r1 = 0
            if (r0 != 0) goto L10
            BA extends com.acse.ottn.u r0 = r3.f2185d
            r0.c(r1)
        L10:
            BA extends com.acse.ottn.u r0 = r3.f2185d
            androidx.recyclerview.widget.RecyclerView$AdapterDataObserver r2 = r3.H
            r0.registerAdapterDataObserver(r2)
            androidx.viewpager2.widget.ViewPager2 r0 = r3.a
            r0.setAdapter(r4)
            int r4 = r3.l
            r3.a(r4, r1)
            r3.b()
            return r3
        L25:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            android.content.Context r0 = r3.getContext()
            int r1 = com.acse.ottn.R.string.banner_adapter_null_error
            java.lang.String r0 = r0.getString(r1)
            r4.<init>(r0)
            throw r4
    }

    public com.acse.ottn.banner.Banner a(BA r1, boolean r2) {
            r0 = this;
            r0.f2189h = r2
            r0.g()
            r0.a(r1)
            return r0
    }

    public com.acse.ottn.banner.Banner a(com.acse.ottn.v1.b r2) {
            r1 = this;
            com.acse.ottn.u1 r0 = r1.f2186e
            if (r0 == 0) goto L20
            com.acse.ottn.v1 r0 = r0.getIndicatorConfig()
            boolean r0 = r0.l()
            if (r0 == 0) goto L20
            com.acse.ottn.u1 r0 = r1.f2186e
            com.acse.ottn.v1 r0 = r0.getIndicatorConfig()
            r0.a(r2)
            com.acse.ottn.u1 r2 = r1.f2186e
            android.view.View r2 = r2.getIndicatorView()
            r2.requestLayout()
        L20:
            return r1
    }

    public com.acse.ottn.banner.Banner a(java.util.List<T> r2) {
            r1 = this;
            com.acse.ottn.u r0 = r1.getAdapter()
            if (r0 == 0) goto L20
            com.acse.ottn.u r0 = r1.getAdapter()
            r0.a(r2)
            com.acse.ottn.u r2 = r1.getAdapter()
            r2.notifyDataSetChanged()
            int r2 = r1.l
            r0 = 0
            r1.a(r2, r0)
            r1.f()
            r1.h()
        L20:
            return r1
    }

    public com.acse.ottn.banner.Banner a(boolean r1) {
            r0 = this;
            r0.f2190i = r1
            return r0
    }

    public void a() {
            r2 = this;
            androidx.viewpager2.widget.ViewPager2 r0 = r2.getViewPager2()
            if (r0 == 0) goto L16
            com.acse.ottn.banner.Banner<T, BA>$c r0 = r2.f2188g
            if (r0 == 0) goto L16
            androidx.viewpager2.widget.ViewPager2 r0 = r2.getViewPager2()
            com.acse.ottn.banner.Banner<T, BA>$c r1 = r2.f2188g
            r0.unregisterOnPageChangeCallback(r1)
            r0 = 0
            r2.f2188g = r0
        L16:
            r2.i()
            return
    }

    public final void a(android.content.Context r4) {
            r3 = this;
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r4)
            int r0 = r0.getScaledTouchSlop()
            int r0 = r0 / 2
            r3.A = r0
            androidx.viewpager2.widget.CompositePageTransformer r0 = new androidx.viewpager2.widget.CompositePageTransformer
            r0.<init>()
            r3.f2187f = r0
            com.acse.ottn.banner.Banner$c r0 = new com.acse.ottn.banner.Banner$c
            r0.<init>(r3)
            r3.f2188g = r0
            com.acse.ottn.banner.Banner$b r0 = new com.acse.ottn.banner.Banner$b
            r0.<init>(r3)
            r3.f2183b = r0
            androidx.viewpager2.widget.ViewPager2 r0 = new androidx.viewpager2.widget.ViewPager2
            r0.<init>(r4)
            r3.a = r0
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r1 = -1
            r4.<init>(r1, r1)
            r0.setLayoutParams(r4)
            androidx.viewpager2.widget.ViewPager2 r4 = r3.a
            r0 = 1
            r4.setOffscreenPageLimit(r0)
            androidx.viewpager2.widget.ViewPager2 r4 = r3.a
            com.acse.ottn.banner.Banner<T, BA>$c r2 = r3.f2188g
            r4.registerOnPageChangeCallback(r2)
            androidx.viewpager2.widget.ViewPager2 r4 = r3.a
            androidx.viewpager2.widget.CompositePageTransformer r2 = r3.f2187f
            r4.setPageTransformer(r2)
            com.acse.ottn.banner.util.ScrollSpeedManger.a(r3)
            androidx.viewpager2.widget.ViewPager2 r4 = r3.a
            r3.addView(r4)
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>()
            r3.F = r4
            r4.setColor(r1)
            android.graphics.Paint r4 = r3.F
            r4.setAntiAlias(r0)
            android.graphics.Paint r4 = r3.F
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r4.setStyle(r0)
            android.graphics.Paint r4 = r3.F
            android.graphics.PorterDuffXfermode r0 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.DST_OUT
            r0.<init>(r1)
            r4.setXfermode(r0)
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>()
            r3.G = r4
            r0 = 0
            r4.setXfermode(r0)
            return
    }

    public final void a(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            if (r5 != 0) goto L3
            return
        L3:
            int[] r0 = com.acse.ottn.R.styleable.Banner
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r0)
            int r5 = com.acse.ottn.R.styleable.Banner_banner_radius
            r0 = 0
            int r5 = r4.getDimensionPixelSize(r5, r0)
            float r5 = (float) r5
            r3.m = r5
            int r5 = com.acse.ottn.R.styleable.Banner_banner_loop_time
            r1 = 3000(0xbb8, float:4.204E-42)
            int r5 = r4.getInt(r5, r1)
            long r1 = (long) r5
            r3.f2191j = r1
            int r5 = com.acse.ottn.R.styleable.Banner_banner_auto_loop
            r1 = 1
            boolean r5 = r4.getBoolean(r5, r1)
            r3.f2190i = r5
            int r5 = com.acse.ottn.R.styleable.Banner_banner_infinite_loop
            boolean r5 = r4.getBoolean(r5, r1)
            r3.f2189h = r5
            int r5 = com.acse.ottn.R.styleable.Banner_banner_indicator_normal_width
            int r2 = com.acse.ottn.v.f2812g
            int r5 = r4.getDimensionPixelSize(r5, r2)
            r3.n = r5
            int r5 = com.acse.ottn.R.styleable.Banner_banner_indicator_selected_width
            int r2 = com.acse.ottn.v.f2813h
            int r5 = r4.getDimensionPixelSize(r5, r2)
            r3.o = r5
            int r5 = com.acse.ottn.R.styleable.Banner_banner_indicator_normal_color
            r2 = -1996488705(0xffffffff88ffffff, float:-1.5407439E-33)
            int r5 = r4.getColor(r5, r2)
            r3.p = r5
            int r5 = com.acse.ottn.R.styleable.Banner_banner_indicator_selected_color
            r2 = -2013265920(0xffffffff88000000, float:-3.85186E-34)
            int r5 = r4.getColor(r5, r2)
            r3.q = r5
            int r5 = com.acse.ottn.R.styleable.Banner_banner_indicator_gravity
            int r5 = r4.getInt(r5, r1)
            r3.r = r5
            int r5 = com.acse.ottn.R.styleable.Banner_banner_indicator_space
            int r5 = r4.getDimensionPixelSize(r5, r0)
            r3.s = r5
            int r5 = com.acse.ottn.R.styleable.Banner_banner_indicator_margin
            int r5 = r4.getDimensionPixelSize(r5, r0)
            r3.t = r5
            int r5 = com.acse.ottn.R.styleable.Banner_banner_indicator_marginLeft
            int r5 = r4.getDimensionPixelSize(r5, r0)
            r3.u = r5
            int r5 = com.acse.ottn.R.styleable.Banner_banner_indicator_marginTop
            int r5 = r4.getDimensionPixelSize(r5, r0)
            r3.v = r5
            int r5 = com.acse.ottn.R.styleable.Banner_banner_indicator_marginRight
            int r5 = r4.getDimensionPixelSize(r5, r0)
            r3.w = r5
            int r5 = com.acse.ottn.R.styleable.Banner_banner_indicator_marginBottom
            int r5 = r4.getDimensionPixelSize(r5, r0)
            r3.x = r5
            int r5 = com.acse.ottn.R.styleable.Banner_banner_indicator_height
            int r1 = com.acse.ottn.v.f2816k
            int r5 = r4.getDimensionPixelSize(r5, r1)
            r3.y = r5
            int r5 = com.acse.ottn.R.styleable.Banner_banner_indicator_radius
            int r1 = com.acse.ottn.v.l
            int r5 = r4.getDimensionPixelSize(r5, r1)
            r3.z = r5
            int r5 = com.acse.ottn.R.styleable.Banner_banner_orientation
            int r5 = r4.getInt(r5, r0)
            r3.m(r5)
            r3.g()
            r4.recycle()
            return
    }

    public final void a(android.graphics.Canvas r7) {
            r6 = this;
            int r0 = r6.getHeight()
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            float r0 = (float) r0
            float r2 = r6.m
            float r2 = r0 - r2
            r3 = 0
            r1.moveTo(r3, r2)
            r1.lineTo(r3, r0)
            float r2 = r6.m
            r1.lineTo(r2, r0)
            android.graphics.RectF r2 = new android.graphics.RectF
            float r4 = r6.m
            r5 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 * r5
            float r5 = r0 - r4
            r2.<init>(r3, r5, r4, r0)
            r0 = 1119092736(0x42b40000, float:90.0)
            r1.arcTo(r2, r0, r0)
            r1.close()
            android.graphics.Paint r0 = r6.F
            r7.drawPath(r1, r0)
            return
    }

    @Override // com.acse.ottn.y
    public void a(androidx.lifecycle.LifecycleOwner r1) {
            r0 = this;
            r0.a()
            return
    }

    @androidx.annotation.RequiresApi(api = 21)
    public com.acse.ottn.banner.Banner b(float r1) {
            r0 = this;
            com.acse.ottn.z.a(r0, r1)
            return r0
    }

    public com.acse.ottn.banner.Banner b(int r2) {
            r1 = this;
            r0 = 1
            com.acse.ottn.banner.Banner r2 = r1.a(r2, r0)
            return r2
    }

    public com.acse.ottn.banner.Banner b(int r2, int r3) {
            r1 = this;
            com.acse.ottn.u1 r0 = r1.f2186e
            if (r0 == 0) goto L14
            com.acse.ottn.v1 r0 = r0.getIndicatorConfig()
            r0.g(r2)
            com.acse.ottn.u1 r2 = r1.f2186e
            com.acse.ottn.v1 r2 = r2.getIndicatorConfig()
            r2.j(r3)
        L14:
            return r1
    }

    public com.acse.ottn.banner.Banner b(androidx.viewpager2.widget.ViewPager2.PageTransformer r2) {
            r1 = this;
            androidx.viewpager2.widget.CompositePageTransformer r0 = r1.f2187f
            r0.removeTransformer(r2)
            return r1
    }

    public com.acse.ottn.banner.Banner b(boolean r1) {
            r0 = this;
            r0.E = r1
            return r0
    }

    public final void b() {
            r1 = this;
            com.acse.ottn.u1 r0 = r1.f2186e
            if (r0 == 0) goto L29
            com.acse.ottn.u r0 = r1.getAdapter()
            if (r0 != 0) goto Lb
            goto L29
        Lb:
            com.acse.ottn.u1 r0 = r1.f2186e
            com.acse.ottn.v1 r0 = r0.getIndicatorConfig()
            boolean r0 = r0.l()
            if (r0 == 0) goto L23
            r1.e()
            com.acse.ottn.u1 r0 = r1.f2186e
            android.view.View r0 = r0.getIndicatorView()
            r1.addView(r0)
        L23:
            r1.c()
            r1.f()
        L29:
            return
    }

    public final void b(android.graphics.Canvas r7) {
            r6 = this;
            int r0 = r6.getHeight()
            int r1 = r6.getWidth()
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            float r1 = (float) r1
            float r3 = r6.m
            float r3 = r1 - r3
            float r0 = (float) r0
            r2.moveTo(r3, r0)
            r2.lineTo(r1, r0)
            float r3 = r6.m
            float r3 = r0 - r3
            r2.lineTo(r1, r3)
            android.graphics.RectF r3 = new android.graphics.RectF
            float r4 = r6.m
            r5 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 * r5
            float r5 = r1 - r4
            float r4 = r0 - r4
            r3.<init>(r5, r4, r1, r0)
            r0 = 0
            r1 = 1119092736(0x42b40000, float:90.0)
            r2.arcTo(r3, r0, r1)
            r2.close()
            android.graphics.Paint r0 = r6.F
            r7.drawPath(r2, r0)
            return
    }

    @Override // com.acse.ottn.y
    public void b(androidx.lifecycle.LifecycleOwner r1) {
            r0 = this;
            r0.h()
            return
    }

    public com.acse.ottn.banner.Banner c(int r2) {
            r1 = this;
            com.acse.ottn.u1 r0 = r1.f2186e
            if (r0 == 0) goto L20
            com.acse.ottn.v1 r0 = r0.getIndicatorConfig()
            boolean r0 = r0.l()
            if (r0 == 0) goto L20
            com.acse.ottn.u1 r0 = r1.f2186e
            com.acse.ottn.v1 r0 = r0.getIndicatorConfig()
            r0.b(r2)
            com.acse.ottn.u1 r2 = r1.f2186e
            android.view.View r2 = r2.getIndicatorView()
            r2.postInvalidate()
        L20:
            return r1
    }

    public com.acse.ottn.banner.Banner c(@androidx.annotation.Nullable androidx.viewpager2.widget.ViewPager2.PageTransformer r2) {
            r1 = this;
            androidx.viewpager2.widget.ViewPager2 r0 = r1.getViewPager2()
            r0.setPageTransformer(r2)
            return r1
    }

    public com.acse.ottn.banner.Banner c(boolean r2) {
            r1 = this;
            androidx.viewpager2.widget.ViewPager2 r0 = r1.getViewPager2()
            r0.setUserInputEnabled(r2)
            return r1
    }

    public final void c() {
            r5 = this;
            int r0 = r5.t
            if (r0 == 0) goto Ld
            com.acse.ottn.v1$b r1 = new com.acse.ottn.v1$b
            r1.<init>(r0)
            r5.a(r1)
            goto L2b
        Ld:
            int r0 = r5.u
            if (r0 != 0) goto L1d
            int r1 = r5.v
            if (r1 != 0) goto L1d
            int r1 = r5.w
            if (r1 != 0) goto L1d
            int r1 = r5.x
            if (r1 == 0) goto L2b
        L1d:
            com.acse.ottn.v1$b r1 = new com.acse.ottn.v1$b
            int r2 = r5.v
            int r3 = r5.w
            int r4 = r5.x
            r1.<init>(r0, r2, r3, r4)
            r5.a(r1)
        L2b:
            int r0 = r5.s
            if (r0 <= 0) goto L32
            r5.l(r0)
        L32:
            int r0 = r5.r
            r1 = 1
            if (r0 == r1) goto L3a
            r5.c(r0)
        L3a:
            int r0 = r5.n
            if (r0 <= 0) goto L41
            r5.g(r0)
        L41:
            int r0 = r5.o
            if (r0 <= 0) goto L48
            r5.k(r0)
        L48:
            int r0 = r5.y
            if (r0 <= 0) goto L4f
            r5.d(r0)
        L4f:
            int r0 = r5.z
            if (r0 <= 0) goto L56
            r5.h(r0)
        L56:
            int r0 = r5.p
            r5.e(r0)
            int r0 = r5.q
            r5.i(r0)
            return
    }

    public final void c(int r5, int r6) {
            r4 = this;
            androidx.viewpager2.widget.ViewPager2 r0 = r4.getViewPager2()
            r1 = 0
            android.view.View r0 = r0.getChildAt(r1)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            androidx.viewpager2.widget.ViewPager2 r2 = r4.getViewPager2()
            int r2 = r2.getOrientation()
            r3 = 1
            if (r2 != r3) goto L1a
            r0.setPadding(r1, r5, r1, r6)
            goto L1d
        L1a:
            r0.setPadding(r5, r1, r6, r1)
        L1d:
            r0.setClipToPadding(r1)
            return
    }

    public final void c(android.graphics.Canvas r6) {
            r5 = this;
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            float r1 = r5.m
            r2 = 0
            r0.moveTo(r2, r1)
            r0.lineTo(r2, r2)
            float r1 = r5.m
            r0.lineTo(r1, r2)
            android.graphics.RectF r1 = new android.graphics.RectF
            float r3 = r5.m
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 * r4
            r1.<init>(r2, r2, r3, r3)
            r2 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r0.arcTo(r1, r2, r2)
            r0.close()
            android.graphics.Paint r1 = r5.F
            r6.drawPath(r0, r1)
            return
    }

    @Override // com.acse.ottn.y
    public void c(androidx.lifecycle.LifecycleOwner r1) {
            r0 = this;
            r0.i()
            return
    }

    public com.acse.ottn.banner.Banner<T, BA> d(int r2) {
            r1 = this;
            com.acse.ottn.u1 r0 = r1.f2186e
            if (r0 == 0) goto Lb
            com.acse.ottn.v1 r0 = r0.getIndicatorConfig()
            r0.c(r2)
        Lb:
            return r1
    }

    public com.acse.ottn.banner.Banner d(androidx.lifecycle.LifecycleOwner r3) {
            r2 = this;
            if (r3 == 0) goto Le
            androidx.lifecycle.Lifecycle r0 = r3.getLifecycle()
            com.acse.ottn.banner.util.BannerLifecycleObserverAdapter r1 = new com.acse.ottn.banner.util.BannerLifecycleObserverAdapter
            r1.<init>(r3, r2)
            r0.addObserver(r1)
        Le:
            return r2
    }

    public final void d(android.graphics.Canvas r7) {
            r6 = this;
            int r0 = r6.getWidth()
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            float r0 = (float) r0
            float r2 = r6.m
            float r2 = r0 - r2
            r3 = 0
            r1.moveTo(r2, r3)
            r1.lineTo(r0, r3)
            float r2 = r6.m
            r1.lineTo(r0, r2)
            android.graphics.RectF r2 = new android.graphics.RectF
            float r4 = r6.m
            r5 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 * r5
            float r5 = r0 - r4
            r2.<init>(r5, r3, r0, r4)
            r0 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r1.arcTo(r2, r3, r0)
            r1.close()
            android.graphics.Paint r0 = r6.F
            r7.drawPath(r1, r0)
            return
    }

    public boolean d() {
            r1 = this;
            boolean r0 = r1.f2189h
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas r5) {
            r4 = this;
            float r0 = r4.m
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L30
            android.graphics.RectF r0 = new android.graphics.RectF
            int r2 = r5.getWidth()
            float r2 = (float) r2
            int r3 = r5.getHeight()
            float r3 = (float) r3
            r0.<init>(r1, r1, r2, r3)
            android.graphics.Paint r1 = r4.G
            r2 = 31
            r5.saveLayer(r0, r1, r2)
            super.dispatchDraw(r5)
            r4.c(r5)
            r4.d(r5)
            r4.a(r5)
            r4.b(r5)
            r5.restore()
            return
        L30:
            super.dispatchDraw(r5)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent r3) {
            r2 = this;
            androidx.viewpager2.widget.ViewPager2 r0 = r2.getViewPager2()
            boolean r0 = r0.isUserInputEnabled()
            if (r0 != 0) goto Lf
            boolean r3 = super.dispatchTouchEvent(r3)
            return r3
        Lf:
            int r0 = r3.getActionMasked()
            r1 = 1
            if (r0 == r1) goto L23
            r1 = 3
            if (r0 == r1) goto L23
            r1 = 4
            if (r0 != r1) goto L1d
            goto L23
        L1d:
            if (r0 != 0) goto L26
            r2.i()
            goto L26
        L23:
            r2.h()
        L26:
            boolean r3 = super.dispatchTouchEvent(r3)
            return r3
    }

    public com.acse.ottn.banner.Banner e() {
            r1 = this;
            com.acse.ottn.u1 r0 = r1.f2186e
            if (r0 == 0) goto Lb
            android.view.View r0 = r0.getIndicatorView()
            r1.removeView(r0)
        Lb:
            return r1
    }

    public com.acse.ottn.banner.Banner e(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            com.acse.ottn.u1 r0 = r1.f2186e
            if (r0 == 0) goto Lb
            com.acse.ottn.v1 r0 = r0.getIndicatorConfig()
            r0.f(r2)
        Lb:
            return r1
    }

    public com.acse.ottn.banner.Banner f() {
            r3 = this;
            com.acse.ottn.u1 r0 = r3.f2186e
            if (r0 == 0) goto L1d
            boolean r0 = r3.d()
            int r1 = r3.getCurrentItem()
            int r2 = r3.getRealCount()
            int r0 = com.acse.ottn.z.a(r0, r1, r2)
            com.acse.ottn.u1 r1 = r3.f2186e
            int r2 = r3.getRealCount()
            r1.a(r2, r0)
        L1d:
            return r3
    }

    public com.acse.ottn.banner.Banner f(@androidx.annotation.ColorRes int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            int r2 = androidx.core.content.ContextCompat.getColor(r0, r2)
            r1.e(r2)
            return r1
    }

    public com.acse.ottn.banner.Banner g(int r2) {
            r1 = this;
            com.acse.ottn.u1 r0 = r1.f2186e
            if (r0 == 0) goto Lb
            com.acse.ottn.v1 r0 = r0.getIndicatorConfig()
            r0.g(r2)
        Lb:
            return r1
    }

    public final void g() {
            r1 = this;
            boolean r0 = r1.d()
            if (r0 != 0) goto La
            r0 = 0
            r1.a(r0)
        La:
            boolean r0 = r1.d()
            r1.o(r0)
            return
    }

    public BA getAdapter() {
            r2 = this;
            BA extends com.acse.ottn.u r0 = r2.f2185d
            if (r0 != 0) goto L11
            android.content.Context r0 = r2.getContext()
            int r1 = com.acse.ottn.R.string.banner_adapter_use_error
            java.lang.String r0 = r0.getString(r1)
            com.acse.ottn.i2.b(r0)
        L11:
            BA extends com.acse.ottn.u r0 = r2.f2185d
            return r0
    }

    public int getCurrentItem() {
            r1 = this;
            androidx.viewpager2.widget.ViewPager2 r0 = r1.getViewPager2()
            int r0 = r0.getCurrentItem()
            return r0
    }

    public com.acse.ottn.u1 getIndicator() {
            r2 = this;
            com.acse.ottn.u1 r0 = r2.f2186e
            if (r0 != 0) goto L11
            android.content.Context r0 = r2.getContext()
            int r1 = com.acse.ottn.R.string.indicator_null_error
            java.lang.String r0 = r0.getString(r1)
            com.acse.ottn.i2.b(r0)
        L11:
            com.acse.ottn.u1 r0 = r2.f2186e
            return r0
    }

    public com.acse.ottn.v1 getIndicatorConfig() {
            r1 = this;
            com.acse.ottn.u1 r0 = r1.getIndicator()
            if (r0 == 0) goto Lf
            com.acse.ottn.u1 r0 = r1.getIndicator()
            com.acse.ottn.v1 r0 = r0.getIndicatorConfig()
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public int getItemCount() {
            r1 = this;
            com.acse.ottn.u r0 = r1.getAdapter()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            com.acse.ottn.u r0 = r1.getAdapter()
            int r0 = r0.getItemCount()
            return r0
    }

    public int getRealCount() {
            r1 = this;
            com.acse.ottn.u r0 = r1.getAdapter()
            int r0 = r0.a()
            return r0
    }

    public int getScrollTime() {
            r1 = this;
            int r0 = r1.f2192k
            return r0
    }

    public androidx.viewpager2.widget.ViewPager2 getViewPager2() {
            r1 = this;
            androidx.viewpager2.widget.ViewPager2 r0 = r1.a
            return r0
    }

    public com.acse.ottn.banner.Banner h() {
            r3 = this;
            boolean r0 = r3.f2190i
            if (r0 == 0) goto Le
            r3.i()
            com.acse.ottn.banner.Banner$b r0 = r3.f2183b
            long r1 = r3.f2191j
            r3.postDelayed(r0, r1)
        Le:
            return r3
    }

    public com.acse.ottn.banner.Banner<T, BA> h(int r2) {
            r1 = this;
            com.acse.ottn.u1 r0 = r1.f2186e
            if (r0 == 0) goto Lb
            com.acse.ottn.v1 r0 = r0.getIndicatorConfig()
            r0.h(r2)
        Lb:
            return r1
    }

    public com.acse.ottn.banner.Banner i() {
            r1 = this;
            boolean r0 = r1.f2190i
            if (r0 == 0) goto L9
            com.acse.ottn.banner.Banner$b r0 = r1.f2183b
            r1.removeCallbacks(r0)
        L9:
            return r1
    }

    public com.acse.ottn.banner.Banner i(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            com.acse.ottn.u1 r0 = r1.f2186e
            if (r0 == 0) goto Lb
            com.acse.ottn.v1 r0 = r0.getIndicatorConfig()
            r0.i(r2)
        Lb:
            return r1
    }

    public com.acse.ottn.banner.Banner j(@androidx.annotation.ColorRes int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            int r2 = androidx.core.content.ContextCompat.getColor(r0, r2)
            r1.i(r2)
            return r1
    }

    public com.acse.ottn.banner.Banner k(int r2) {
            r1 = this;
            com.acse.ottn.u1 r0 = r1.f2186e
            if (r0 == 0) goto Lb
            com.acse.ottn.v1 r0 = r0.getIndicatorConfig()
            r0.j(r2)
        Lb:
            return r1
    }

    public com.acse.ottn.banner.Banner l(int r2) {
            r1 = this;
            com.acse.ottn.u1 r0 = r1.f2186e
            if (r0 == 0) goto Lb
            com.acse.ottn.v1 r0 = r0.getIndicatorConfig()
            r0.e(r2)
        Lb:
            return r1
    }

    public com.acse.ottn.banner.Banner m(int r2) {
            r1 = this;
            androidx.viewpager2.widget.ViewPager2 r0 = r1.getViewPager2()
            r0.setOrientation(r2)
            return r1
    }

    public com.acse.ottn.banner.Banner n(int r1) {
            r0 = this;
            r0.f2192k = r1
            return r0
    }

    public com.acse.ottn.banner.Banner o(int r1) {
            r0 = this;
            r0.l = r1
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
            r0 = this;
            super.onAttachedToWindow()
            r0.h()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
            r0 = this;
            super.onDetachedFromWindow()
            r0.i()
            return
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
            r5 = this;
            androidx.viewpager2.widget.ViewPager2 r0 = r5.getViewPager2()
            boolean r0 = r0.isUserInputEnabled()
            if (r0 == 0) goto L8a
            boolean r0 = r5.E
            if (r0 != 0) goto L10
            goto L8a
        L10:
            int r0 = r6.getAction()
            r1 = 1
            if (r0 == 0) goto L72
            r2 = 0
            if (r0 == r1) goto L6a
            r3 = 2
            if (r0 == r3) goto L21
            r1 = 3
            if (r0 == r1) goto L6a
            goto L85
        L21:
            float r0 = r6.getX()
            float r3 = r6.getY()
            float r4 = r5.B
            float r0 = r0 - r4
            float r0 = java.lang.Math.abs(r0)
            float r4 = r5.C
            float r3 = r3 - r4
            float r3 = java.lang.Math.abs(r3)
            androidx.viewpager2.widget.ViewPager2 r4 = r5.getViewPager2()
            int r4 = r4.getOrientation()
            if (r4 != 0) goto L51
            int r4 = r5.A
            float r4 = (float) r4
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 <= 0) goto L4d
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L4d
            goto L4e
        L4d:
            r1 = 0
        L4e:
            r5.D = r1
            goto L60
        L51:
            int r4 = r5.A
            float r4 = (float) r4
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 <= 0) goto L5d
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L5d
            goto L5e
        L5d:
            r1 = 0
        L5e:
            r5.D = r1
        L60:
            android.view.ViewParent r0 = r5.getParent()
            boolean r1 = r5.D
            r0.requestDisallowInterceptTouchEvent(r1)
            goto L85
        L6a:
            android.view.ViewParent r0 = r5.getParent()
            r0.requestDisallowInterceptTouchEvent(r2)
            goto L85
        L72:
            float r0 = r6.getX()
            r5.B = r0
            float r0 = r6.getY()
            r5.C = r0
            android.view.ViewParent r0 = r5.getParent()
            r0.requestDisallowInterceptTouchEvent(r1)
        L85:
            boolean r6 = super.onInterceptTouchEvent(r6)
            return r6
        L8a:
            boolean r6 = super.onInterceptTouchEvent(r6)
            return r6
    }

    public com.acse.ottn.banner.Banner p(int r1) {
            r0 = this;
            r0.A = r1
            return r0
    }
}
