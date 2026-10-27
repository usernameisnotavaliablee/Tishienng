package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class e0<T> extends androidx.viewpager.widget.PagerAdapter implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f2273e = "BaseViewPagerAdapter";
    public java.util.List<T> a;

    /* renamed from: b, reason: collision with root package name */
    public android.content.Context f2274b;

    /* renamed from: c, reason: collision with root package name */
    public com.acse.ottn.t f2275c;

    /* renamed from: d, reason: collision with root package name */
    public com.acse.ottn.e0.b f2276d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements android.view.View.OnClickListener {
        public final /* synthetic */ int a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.e0 f2277b;

        public a(com.acse.ottn.e0 r1, int r2) {
                r0 = this;
                r0.f2277b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r5) {
                r4 = this;
                com.acse.ottn.e0 r5 = r4.f2277b
                com.acse.ottn.t r5 = com.acse.ottn.e0.a(r5)
                r5.f()
                com.acse.ottn.e0 r5 = r4.f2277b
                com.acse.ottn.e0$b r5 = com.acse.ottn.e0.b(r5)
                if (r5 == 0) goto L36
                com.acse.ottn.e0 r5 = r4.f2277b
                com.acse.ottn.e0$b r5 = com.acse.ottn.e0.b(r5)
                int r0 = r4.a
                com.acse.ottn.e0 r1 = r4.f2277b
                int r1 = r1.a()
                int r0 = r0 % r1
                com.acse.ottn.e0 r1 = r4.f2277b
                java.util.List r1 = com.acse.ottn.e0.c(r1)
                int r2 = r4.a
                com.acse.ottn.e0 r3 = r4.f2277b
                int r3 = r3.a()
                int r2 = r2 % r3
                java.lang.Object r1 = r1.get(r2)
                r5.a(r0, r1)
            L36:
                com.acse.ottn.e0 r5 = r4.f2277b
                com.acse.ottn.t r5 = com.acse.ottn.e0.a(r5)
                r5.e()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b<T> {
        void a(int r1, T r2);
    }

    public e0(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a = r0
            r1.f2274b = r2
            return
    }

    public e0(android.content.Context r2, com.acse.ottn.e0.b r3) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a = r0
            r1.f2274b = r2
            r1.f2276d = r3
            return
    }

    public e0(android.content.Context r2, java.util.List<T> r3) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f2274b = r2
            r1.a = r3
            return
    }

    public e0(android.content.Context r2, java.util.List<T> r3, com.acse.ottn.e0.b r4) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f2274b = r2
            r1.a = r3
            r1.f2276d = r4
            return
    }

    public e0(java.util.List<T> r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a = r2
            return
    }

    public static /* synthetic */ com.acse.ottn.t a(com.acse.ottn.e0 r0) {
            com.acse.ottn.t r0 = r0.f2275c
            return r0
    }

    public static /* synthetic */ com.acse.ottn.e0.b b(com.acse.ottn.e0 r0) {
            com.acse.ottn.e0$b r0 = r0.f2276d
            return r0
    }

    public static /* synthetic */ java.util.List c(com.acse.ottn.e0 r0) {
            java.util.List<T> r0 = r0.a
            return r0
    }

    public int a() {
            r1 = this;
            java.util.List<T> r0 = r1.a
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.size()
            return r0
    }

    public abstract void a(android.widget.TextView r1, int r2, T r3);

    public void a(com.acse.ottn.e0.b r1) {
            r0 = this;
            r0.f2276d = r1
            return
    }

    public void a(com.acse.ottn.t r1, com.acse.ottn.e0 r2) {
            r0 = this;
            r0.f2275c = r1
            r1.setAdapter(r0)
            com.acse.ottn.t r1 = r0.f2275c
            r1.addOnPageChangeListener(r0)
            java.util.List<T> r1 = r0.a
            if (r1 == 0) goto L3a
            int r1 = r1.size()
            if (r1 != 0) goto L15
            goto L3a
        L15:
            int r1 = r0.a()
            r2 = 1073741823(0x3fffffff, float:1.9999999)
            int r1 = r2 % r1
            int r2 = r2 - r1
            com.acse.ottn.t r1 = r0.f2275c
            r1.setCurrentItem(r2)
            com.acse.ottn.t r1 = r0.f2275c
            boolean r1 = r1.c()
            if (r1 != 0) goto L3a
            com.acse.ottn.t r1 = r0.f2275c
            r1.g()
            com.acse.ottn.t r1 = r0.f2275c
            int r2 = r0.a()
            r1.b(r2)
        L3a:
            return
    }

    public abstract void a(com.acse.ottn.widget.RoundRectImageView r1, int r2, T r3);

    public void a(T r3) {
            r2 = this;
            com.acse.ottn.t r0 = r2.f2275c
            androidx.viewpager.widget.PagerAdapter r0 = r0.getAdapter()
            if (r0 == 0) goto L5b
            java.util.List<T> r0 = r2.a
            if (r0 != 0) goto L13
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.a = r0
        L13:
            com.acse.ottn.t r0 = r2.f2275c
            int r0 = r0.getCurrentItem()
            int r1 = r2.a()
            int r0 = r0 % r1
            java.util.List<T> r1 = r2.a
            r1.add(r3)
            com.acse.ottn.t r3 = r2.f2275c
            r3.f()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = "当前显示第"
            r3.append(r1)
            r3.append(r0)
            java.lang.String r1 = "/"
            r3.append(r1)
            com.acse.ottn.t r1 = r2.f2275c
            int r1 = r1.getCurrentItem()
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.String r1 = "BaseViewPagerAdapter"
            com.acse.ottn.h2.a(r1, r3)
            com.acse.ottn.t r3 = r2.f2275c
            int r1 = r2.a()
            r3.a(r1, r0)
            com.acse.ottn.t r3 = r2.f2275c
            r3.e()
            return
        L5b:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r0 = "必须先设置Adapter"
            r3.<init>(r0)
            throw r3
    }

    public void a(java.util.List<T> r2) {
            r1 = this;
            java.util.List<T> r0 = r1.a
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a = r0
        Lb:
            java.util.List<T> r0 = r1.a
            r0.addAll(r2)
            r1.notifyDataSetChanged()
            com.acse.ottn.t r2 = r1.f2275c
            r2.g()
            com.acse.ottn.t r2 = r1.f2275c
            int r0 = r1.a()
            r2.b(r0)
            return
    }

    public void b(java.util.List<T> r2) {
            r1 = this;
            java.util.List<T> r0 = r1.a
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a = r0
        Lb:
            java.util.List<T> r0 = r1.a
            r0.clear()
            java.util.List<T> r0 = r1.a
            r0.addAll(r2)
            r1.notifyDataSetChanged()
            com.acse.ottn.t r2 = r1.f2275c
            boolean r2 = r2.c()
            if (r2 != 0) goto L2e
            com.acse.ottn.t r2 = r1.f2275c
            r2.g()
            com.acse.ottn.t r2 = r1.f2275c
            int r0 = r1.a()
            r2.b(r0)
        L2e:
            return
    }

    public void destroyItem(android.view.ViewGroup r1, int r2, java.lang.Object r3) {
            r0 = this;
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r1.removeView(r3)
            return
    }

    public int getCount() {
            r1 = this;
            java.util.List<T> r0 = r1.a
            if (r0 == 0) goto Lf
            int r0 = r0.size()
            if (r0 != 0) goto Lb
            goto Lf
        Lb:
            r0 = 2147483647(0x7fffffff, float:NaN)
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public java.lang.Object instantiateItem(android.view.ViewGroup r5, int r6) {
            r4 = this;
            android.content.Context r0 = r4.f2274b
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = com.acse.ottn.R.layout.imageview
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r5, r2)
            com.acse.ottn.widget.RoundRectImageView r0 = (com.acse.ottn.widget.RoundRectImageView) r0
            java.util.List<T> r1 = r4.a
            int r2 = r4.a()
            int r2 = r6 % r2
            java.lang.Object r1 = r1.get(r2)
            r4.a(r0, r6, r1)
            r5.addView(r0)
            com.acse.ottn.t r5 = r4.f2275c
            android.widget.TextView r5 = r5.getSubTitle()
            if (r5 == 0) goto L57
            if (r6 != 0) goto L41
            com.acse.ottn.t r5 = r4.f2275c
            android.widget.TextView r5 = r5.getSubTitle()
            java.util.List<T> r1 = r4.a
            int r2 = r4.a()
            int r2 = r2 + (-1)
            java.lang.Object r1 = r1.get(r2)
            r4.a(r5, r6, r1)
            goto L57
        L41:
            com.acse.ottn.t r5 = r4.f2275c
            android.widget.TextView r5 = r5.getSubTitle()
            java.util.List<T> r1 = r4.a
            int r2 = r6 + (-1)
            int r3 = r4.a()
            int r2 = r2 % r3
            java.lang.Object r1 = r1.get(r2)
            r4.a(r5, r6, r1)
        L57:
            com.acse.ottn.e0$a r5 = new com.acse.ottn.e0$a
            r5.<init>(r4, r6)
            r0.setOnClickListener(r5)
            return r0
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

    public void onPageScrollStateChanged(int r1) {
            r0 = this;
            return
    }

    public void onPageScrolled(int r1, float r2, int r3) {
            r0 = this;
            return
    }

    public void onPageSelected(int r3) {
            r2 = this;
            com.acse.ottn.t r0 = r2.f2275c
            int r1 = r2.a()
            int r3 = r3 % r1
            r0.a(r3)
            return
    }
}
