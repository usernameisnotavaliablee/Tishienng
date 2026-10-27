package com.bytedance.adsdk.ugeno.swiper;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class BaseSwiper<T> extends android.widget.FrameLayout implements com.bytedance.adsdk.ugeno.viewpager.ViewPager.r {

    /* renamed from: s, reason: collision with root package name */
    private static final android.view.animation.Interpolator f1974s = null;
    private final java.lang.Runnable a;
    private int ae;
    private boolean av;
    private boolean az;
    private com.bytedance.adsdk.ugeno.swiper.j ch;
    protected android.content.Context cw;
    private android.widget.FrameLayout f;
    private int g;
    private boolean i;
    protected java.util.List<T> j;
    private boolean jy;
    private int kt;

    /* renamed from: l, reason: collision with root package name */
    private final java.lang.Runnable f1975l;

    /* renamed from: m, reason: collision with root package name */
    private int f1976m;
    private int mi;
    private java.lang.String oq;
    private float qv;

    /* renamed from: r, reason: collision with root package name */
    private int f1977r;
    private int tj;
    private int tl;
    private int up;

    /* renamed from: v, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.swiper.indicator.BaseIndicator f1978v;
    private boolean vl;

    /* renamed from: w, reason: collision with root package name */
    private int f1979w;
    private boolean ws;

    /* renamed from: x, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.swiper.BaseSwiper.j f1980x;
    protected com.bytedance.adsdk.ugeno.viewpager.ViewPager xt;




    public class SwiperViewPager extends com.bytedance.adsdk.ugeno.viewpager.ViewPager {
        final /* synthetic */ com.bytedance.adsdk.ugeno.swiper.BaseSwiper j;

        public SwiperViewPager(com.bytedance.adsdk.ugeno.swiper.BaseSwiper r1, android.content.Context r2) {
                r0 = this;
                r0.j = r1
                r0.<init>(r2)
                return
        }

        private android.view.MotionEvent j(android.view.MotionEvent r5) {
                r4 = this;
                int r0 = r4.getWidth()
                float r0 = (float) r0
                int r1 = r4.getHeight()
                float r1 = (float) r1
                float r2 = r5.getY()
                float r2 = r2 / r1
                float r2 = r2 * r0
                float r3 = r5.getX()
                float r3 = r3 / r0
                float r3 = r3 * r1
                r5.setLocation(r2, r3)
                return r5
        }

        @Override // com.bytedance.adsdk.ugeno.viewpager.ViewPager, android.view.ViewGroup
        public boolean onInterceptTouchEvent(android.view.MotionEvent r3) {
                r2 = this;
                com.bytedance.adsdk.ugeno.swiper.BaseSwiper r0 = r2.j
                boolean r0 = com.bytedance.adsdk.ugeno.swiper.BaseSwiper.m(r0)
                if (r0 == 0) goto L27
                com.bytedance.adsdk.ugeno.swiper.BaseSwiper r0 = r2.j     // Catch: java.lang.IllegalArgumentException -> L1d
                int r0 = com.bytedance.adsdk.ugeno.swiper.BaseSwiper.ae(r0)     // Catch: java.lang.IllegalArgumentException -> L1d
                r1 = 1
                if (r0 != r1) goto L1f
                android.view.MotionEvent r0 = r2.j(r3)     // Catch: java.lang.IllegalArgumentException -> L1d
                boolean r0 = super.onInterceptTouchEvent(r0)     // Catch: java.lang.IllegalArgumentException -> L1d
                r2.j(r3)     // Catch: java.lang.IllegalArgumentException -> L1d
                return r0
            L1d:
                r3 = move-exception
                goto L24
            L1f:
                boolean r3 = super.onInterceptTouchEvent(r3)     // Catch: java.lang.IllegalArgumentException -> L1d
                return r3
            L24:
                com.bytedance.sdk.component.utils.vl.j(r3)
            L27:
                r3 = 0
                return r3
        }

        @Override // com.bytedance.adsdk.ugeno.viewpager.ViewPager, android.view.View
        public boolean onTouchEvent(android.view.MotionEvent r3) {
                r2 = this;
                com.bytedance.adsdk.ugeno.swiper.BaseSwiper r0 = r2.j
                boolean r0 = com.bytedance.adsdk.ugeno.swiper.BaseSwiper.m(r0)
                if (r0 == 0) goto L24
                com.bytedance.adsdk.ugeno.swiper.BaseSwiper r0 = r2.j     // Catch: java.lang.IllegalArgumentException -> L1a
                int r0 = com.bytedance.adsdk.ugeno.swiper.BaseSwiper.ae(r0)     // Catch: java.lang.IllegalArgumentException -> L1a
                r1 = 1
                if (r0 != r1) goto L1c
                android.view.MotionEvent r3 = r2.j(r3)     // Catch: java.lang.IllegalArgumentException -> L1a
                boolean r3 = super.onTouchEvent(r3)     // Catch: java.lang.IllegalArgumentException -> L1a
                return r3
            L1a:
                r3 = move-exception
                goto L21
            L1c:
                boolean r3 = super.onTouchEvent(r3)     // Catch: java.lang.IllegalArgumentException -> L1a
                return r3
            L21:
                com.bytedance.sdk.component.utils.vl.j(r3)
            L24:
                r3 = 0
                return r3
        }
    }

    class j extends com.bytedance.adsdk.ugeno.viewpager.xt {
        final /* synthetic */ com.bytedance.adsdk.ugeno.swiper.BaseSwiper j;

        j(com.bytedance.adsdk.ugeno.swiper.BaseSwiper r1) {
                r0 = this;
                r0.j = r1
                r0.<init>()
                return
        }

        @Override // com.bytedance.adsdk.ugeno.viewpager.xt
        public float j(int r3) {
                r2 = this;
                com.bytedance.adsdk.ugeno.swiper.BaseSwiper r3 = r2.j
                float r3 = com.bytedance.adsdk.ugeno.swiper.BaseSwiper.xt(r3)
                r0 = 0
                r1 = 1065353216(0x3f800000, float:1.0)
                int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r3 > 0) goto Le
                return r1
            Le:
                com.bytedance.adsdk.ugeno.swiper.BaseSwiper r3 = r2.j
                float r3 = com.bytedance.adsdk.ugeno.swiper.BaseSwiper.xt(r3)
                float r1 = r1 / r3
                return r1
        }

        @Override // com.bytedance.adsdk.ugeno.viewpager.xt
        public int j() {
                r1 = this;
                com.bytedance.adsdk.ugeno.swiper.BaseSwiper r0 = r1.j
                boolean r0 = com.bytedance.adsdk.ugeno.swiper.BaseSwiper.j(r0)
                if (r0 == 0) goto Lb
                r0 = 1024(0x400, float:1.435E-42)
                return r0
            Lb:
                com.bytedance.adsdk.ugeno.swiper.BaseSwiper r0 = r1.j
                java.util.List<T> r0 = r0.j
                int r0 = r0.size()
                return r0
        }

        @Override // com.bytedance.adsdk.ugeno.viewpager.xt
        public int j(java.lang.Object r1) {
                r0 = this;
                r1 = -2
                return r1
        }

        @Override // com.bytedance.adsdk.ugeno.viewpager.xt
        public java.lang.Object j(android.view.ViewGroup r3, int r4) {
                r2 = this;
                com.bytedance.adsdk.ugeno.swiper.BaseSwiper r0 = r2.j
                boolean r0 = com.bytedance.adsdk.ugeno.swiper.BaseSwiper.j(r0)
                com.bytedance.adsdk.ugeno.swiper.BaseSwiper r1 = r2.j
                java.util.List<T> r1 = r1.j
                int r1 = r1.size()
                int r0 = com.bytedance.adsdk.ugeno.swiper.xt.j(r0, r4, r1)
                com.bytedance.adsdk.ugeno.swiper.BaseSwiper r1 = r2.j
                android.view.View r4 = r1.j(r4, r0)
                r3.addView(r4)
                return r4
        }

        @Override // com.bytedance.adsdk.ugeno.viewpager.xt
        public void j(android.view.ViewGroup r1, int r2, java.lang.Object r3) {
                r0 = this;
                android.view.View r3 = (android.view.View) r3
                r1.removeView(r3)
                return
        }

        @Override // com.bytedance.adsdk.ugeno.viewpager.xt
        public boolean j(android.view.View r1, java.lang.Object r2) {
                r0 = this;
                if (r1 != r2) goto L4
                r1 = 1
                return r1
            L4:
                r1 = 0
                return r1
        }
    }

    static {
            com.bytedance.adsdk.ugeno.swiper.BaseSwiper$1 r0 = new com.bytedance.adsdk.ugeno.swiper.BaseSwiper$1
            r0.<init>()
            com.bytedance.adsdk.ugeno.swiper.BaseSwiper.f1974s = r0
            return
    }

    public BaseSwiper(android.content.Context r4) {
            r3 = this;
            r3.<init>(r4)
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r3.j = r0
            r0 = 2000(0x7d0, float:2.803E-42)
            r3.f1977r = r0
            r0 = 500(0x1f4, float:7.0E-43)
            r3.up = r0
            r3.f1976m = r0
            r0 = 0
            r3.ae = r0
            r1 = -1
            r3.tl = r1
            r3.g = r1
            java.lang.String r2 = "normal"
            r3.oq = r2
            r2 = 1065353216(0x3f800000, float:1.0)
            r3.qv = r2
            r2 = 1
            r3.vl = r2
            r3.jy = r2
            r3.ws = r2
            r3.az = r2
            r3.f1979w = r0
            r3.mi = r0
            r3.kt = r0
            r3.tj = r0
            com.bytedance.adsdk.ugeno.swiper.BaseSwiper$2 r0 = new com.bytedance.adsdk.ugeno.swiper.BaseSwiper$2
            r0.<init>(r3)
            r3.a = r0
            com.bytedance.adsdk.ugeno.swiper.BaseSwiper$3 r0 = new com.bytedance.adsdk.ugeno.swiper.BaseSwiper$3
            r0.<init>(r3)
            r3.f1975l = r0
            r3.cw = r4
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            r0.<init>(r4)
            r3.f = r0
            com.bytedance.adsdk.ugeno.viewpager.ViewPager r4 = r3.j()
            r3.xt = r4
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r4.<init>(r1, r1)
            r0 = 17
            r4.gravity = r0
            android.widget.FrameLayout r0 = r3.f
            com.bytedance.adsdk.ugeno.viewpager.ViewPager r1 = r3.xt
            r0.addView(r1, r4)
            android.widget.FrameLayout r4 = r3.f
            r3.addView(r4)
            return
    }

    static /* synthetic */ int ae(com.bytedance.adsdk.ugeno.swiper.BaseSwiper r0) {
            int r0 = r0.tj
            return r0
    }

    private boolean ae() {
            r2 = this;
            java.util.List<T> r0 = r2.j
            int r0 = r0.size()
            r1 = 2
            if (r0 > r1) goto Lf
            boolean r0 = r2.ws
            if (r0 == 0) goto Lf
            r0 = 1
            return r0
        Lf:
            r0 = 0
            return r0
    }

    static /* synthetic */ boolean cw(com.bytedance.adsdk.ugeno.swiper.BaseSwiper r0) {
            boolean r0 = r0.jy
            return r0
    }

    private void j(int r4, android.view.View r5) {
            r3 = this;
            boolean r0 = r5 instanceof android.view.ViewGroup
            if (r0 == 0) goto L4c
            java.lang.String r0 = "two_items_tag"
            android.view.View r0 = r5.findViewWithTag(r0)
            if (r0 == 0) goto Ld
            goto L4c
        Ld:
            java.util.List<T> r1 = r3.j
            int r1 = r1.size()
            r2 = 1
            int r4 = com.bytedance.adsdk.ugeno.swiper.xt.j(r2, r4, r1)
            java.util.List<T> r1 = r3.j
            java.lang.Object r4 = r1.get(r4)
            if (r4 != 0) goto L21
            goto L4c
        L21:
            boolean r1 = r4 instanceof com.bytedance.adsdk.ugeno.xt.cw
            if (r1 == 0) goto L2c
            com.bytedance.adsdk.ugeno.xt.cw r4 = (com.bytedance.adsdk.ugeno.xt.cw) r4
            android.view.View r0 = r4.g()
            goto L33
        L2c:
            boolean r1 = r4 instanceof android.view.View
            if (r1 == 0) goto L33
            r0 = r4
            android.view.View r0 = (android.view.View) r0
        L33:
            if (r0 != 0) goto L36
            goto L4c
        L36:
            android.view.ViewParent r4 = r0.getParent()
            boolean r4 = r4 instanceof android.view.ViewGroup
            if (r4 == 0) goto L47
            android.view.ViewParent r4 = r0.getParent()
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r4.removeView(r0)
        L47:
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r5.addView(r0)
        L4c:
            return
    }

    static /* synthetic */ boolean j(com.bytedance.adsdk.ugeno.swiper.BaseSwiper r0) {
            boolean r0 = r0.ws
            return r0
    }

    static /* synthetic */ boolean m(com.bytedance.adsdk.ugeno.swiper.BaseSwiper r0) {
            boolean r0 = r0.az
            return r0
    }

    static /* synthetic */ java.lang.Runnable r(com.bytedance.adsdk.ugeno.swiper.BaseSwiper r0) {
            java.lang.Runnable r0 = r0.f1975l
            return r0
    }

    static /* synthetic */ int up(com.bytedance.adsdk.ugeno.swiper.BaseSwiper r0) {
            int r0 = r0.f1977r
            return r0
    }

    static /* synthetic */ float xt(com.bytedance.adsdk.ugeno.swiper.BaseSwiper r0) {
            float r0 = r0.qv
            return r0
    }

    public abstract android.view.View ae(int r1);

    public com.bytedance.adsdk.ugeno.swiper.BaseSwiper cw(int r2) {
            r1 = this;
            com.bytedance.adsdk.ugeno.swiper.indicator.BaseIndicator r0 = r1.f1978v
            r0.setUnSelectedColor(r2)
            return r1
    }

    public com.bytedance.adsdk.ugeno.swiper.BaseSwiper cw(boolean r1) {
            r0 = this;
            r0.vl = r1
            return r0
    }

    public void cw() {
            r3 = this;
            java.lang.Runnable r0 = r3.f1975l
            r3.removeCallbacks(r0)
            java.lang.Runnable r0 = r3.f1975l
            int r1 = r3.f1977r
            long r1 = (long) r1
            r3.postDelayed(r0, r1)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent r3) {
            r2 = this;
            boolean r0 = r2.jy
            if (r0 == 0) goto L1f
            int r0 = r3.getAction()
            r1 = 1
            if (r0 == r1) goto L18
            r1 = 3
            if (r0 == r1) goto L18
            r1 = 4
            if (r0 != r1) goto L12
            goto L18
        L12:
            if (r0 != 0) goto L1f
            r2.r()
            goto L1f
        L18:
            boolean r0 = r2.av
            if (r0 != 0) goto L1f
            r2.cw()
        L1f:
            boolean r3 = super.dispatchTouchEvent(r3)
            return r3
    }

    @Override // com.bytedance.adsdk.ugeno.viewpager.ViewPager.r
    public void g(int r2) {
            r1 = this;
            r0 = 1
            if (r2 != r0) goto La
            boolean r2 = r1.av
            if (r2 == 0) goto La
            r1.r()
        La:
            return
    }

    public com.bytedance.adsdk.ugeno.viewpager.xt getAdapter() {
            r1 = this;
            com.bytedance.adsdk.ugeno.viewpager.ViewPager r0 = r1.xt
            com.bytedance.adsdk.ugeno.viewpager.xt r0 = r0.getAdapter()
            return r0
    }

    public int getCurrentItem() {
            r1 = this;
            com.bytedance.adsdk.ugeno.viewpager.ViewPager r0 = r1.xt
            int r0 = r0.getCurrentItem()
            return r0
    }

    public com.bytedance.adsdk.ugeno.viewpager.ViewPager getViewPager() {
            r1 = this;
            com.bytedance.adsdk.ugeno.viewpager.ViewPager r0 = r1.xt
            return r0
    }

    public android.view.View j(int r5, int r6) {
            r4 = this;
            java.util.List<T> r0 = r4.j
            int r0 = r0.size()
            if (r0 != 0) goto L12
            android.view.View r5 = new android.view.View
            android.content.Context r6 = r4.getContext()
            r5.<init>(r6)
            return r5
        L12:
            android.view.View r6 = r4.ae(r6)
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            android.content.Context r1 = r4.getContext()
            r0.<init>(r1)
            boolean r1 = r6 instanceof android.view.ViewGroup
            if (r1 == 0) goto L27
            r1 = 1
            r0.setClipChildren(r1)
        L27:
            boolean r1 = r4.ae()
            if (r1 == 0) goto L32
            java.lang.String r1 = "two_items_tag"
            r6.setTag(r1)
        L32:
            android.view.ViewParent r1 = r6.getParent()
            boolean r1 = r1 instanceof android.view.ViewGroup
            if (r1 == 0) goto L43
            android.view.ViewParent r1 = r6.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r1.removeView(r6)
        L43:
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r2 = -1
            r1.<init>(r2, r2)
            r3 = 17
            r1.gravity = r3
            r0.addView(r6, r1)
            android.view.View r6 = new android.view.View
            android.content.Context r1 = r4.getContext()
            r6.<init>(r1)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r1.<init>(r2, r2)
            r0.addView(r6, r1)
            boolean r6 = r4.ae()
            if (r6 == 0) goto L6e
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.setTag(r5)
        L6e:
            return r0
    }

    public com.bytedance.adsdk.ugeno.swiper.BaseSwiper j(float r1) {
            r0 = this;
            r0.qv = r1
            return r0
    }

    public com.bytedance.adsdk.ugeno.swiper.BaseSwiper j(int r1) {
            r0 = this;
            r0.f1977r = r1
            r0.cw()
            return r0
    }

    public com.bytedance.adsdk.ugeno.swiper.BaseSwiper<T> j(T r3) {
            r2 = this;
            if (r3 == 0) goto L10
            java.util.List<T> r0 = r2.j
            r0.add(r3)
            boolean r3 = r2.vl
            if (r3 == 0) goto L10
            com.bytedance.adsdk.ugeno.swiper.indicator.BaseIndicator r3 = r2.f1978v
            r3.j()
        L10:
            com.bytedance.adsdk.ugeno.swiper.BaseSwiper$j r3 = r2.f1980x
            if (r3 == 0) goto L24
            r3.cw()
            com.bytedance.adsdk.ugeno.swiper.indicator.BaseIndicator r3 = r2.f1978v
            int r0 = r2.f1979w
            com.bytedance.adsdk.ugeno.viewpager.ViewPager r1 = r2.xt
            int r1 = r1.getCurrentItem()
            r3.j(r0, r1)
        L24:
            return r2
    }

    public com.bytedance.adsdk.ugeno.swiper.BaseSwiper j(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "rectangle"
            boolean r3 = android.text.TextUtils.equals(r3, r0)
            if (r3 == 0) goto L12
            com.bytedance.adsdk.ugeno.swiper.indicator.RectangleIndicator r3 = new com.bytedance.adsdk.ugeno.swiper.indicator.RectangleIndicator
            android.content.Context r0 = r2.cw
            r3.<init>(r0)
            r2.f1978v = r3
            goto L1b
        L12:
            com.bytedance.adsdk.ugeno.swiper.indicator.DotIndicator r3 = new com.bytedance.adsdk.ugeno.swiper.indicator.DotIndicator
            android.content.Context r0 = r2.cw
            r3.<init>(r0)
            r2.f1978v = r3
        L1b:
            com.bytedance.adsdk.ugeno.swiper.indicator.BaseIndicator r3 = r2.f1978v
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = -2
            r0.<init>(r1, r1)
            r2.addView(r3, r0)
            return r2
    }

    public com.bytedance.adsdk.ugeno.swiper.BaseSwiper j(boolean r1) {
            r0 = this;
            r0.jy = r1
            r0.cw()
            return r0
    }

    public com.bytedance.adsdk.ugeno.viewpager.ViewPager j() {
            r2 = this;
            com.bytedance.adsdk.ugeno.swiper.BaseSwiper$SwiperViewPager r0 = new com.bytedance.adsdk.ugeno.swiper.BaseSwiper$SwiperViewPager
            android.content.Context r1 = r2.getContext()
            r0.<init>(r2, r1)
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.viewpager.ViewPager.r
    public void j(int r2, float r3, int r4) {
            r1 = this;
            com.bytedance.adsdk.ugeno.swiper.j r4 = r1.ch
            if (r4 == 0) goto Lf
            boolean r4 = r1.ws
            java.util.List<T> r0 = r1.j
            int r0 = r0.size()
            com.bytedance.adsdk.ugeno.swiper.xt.j(r4, r2, r0)
        Lf:
            boolean r4 = r1.ae()
            if (r4 == 0) goto L32
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            android.view.View r4 = r1.findViewWithTag(r4)
            r1.j(r2, r4)
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L32
            int r2 = r2 + 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            android.view.View r3 = r1.findViewWithTag(r3)
            r1.j(r2, r3)
        L32:
            return
    }

    public void j(java.lang.String r3, int r4, int r5, int r6, boolean r7) {
            r2 = this;
            com.bytedance.adsdk.ugeno.swiper.BaseSwiper$j r7 = r2.f1980x
            if (r7 == 0) goto L7
            r7.cw()
        L7:
            com.bytedance.adsdk.ugeno.viewpager.ViewPager r7 = r2.xt
            r7.setPageMargin(r4)
            r7 = 1
            r0 = 0
            if (r5 > 0) goto L12
            if (r6 <= 0) goto L34
        L12:
            int r1 = r2.tj
            if (r1 != r7) goto L1e
            com.bytedance.adsdk.ugeno.viewpager.ViewPager r1 = r2.xt
            int r5 = r5 + r4
            int r6 = r6 + r4
            r1.setPadding(r0, r5, r0, r6)
            goto L25
        L1e:
            com.bytedance.adsdk.ugeno.viewpager.ViewPager r1 = r2.xt
            int r5 = r5 + r4
            int r6 = r6 + r4
            r1.setPadding(r5, r0, r6, r0)
        L25:
            android.widget.FrameLayout r4 = r2.f
            r4.setClipChildren(r0)
            com.bytedance.adsdk.ugeno.viewpager.ViewPager r4 = r2.xt
            r4.setClipChildren(r0)
            com.bytedance.adsdk.ugeno.viewpager.ViewPager r4 = r2.xt
            r4.setClipToPadding(r0)
        L34:
            int r4 = r2.tj
            if (r4 != r7) goto L4c
            com.bytedance.adsdk.ugeno.swiper.j.cw r4 = new com.bytedance.adsdk.ugeno.swiper.j.cw
            r4.<init>()
            r4.j(r3)
            com.bytedance.adsdk.ugeno.viewpager.ViewPager r3 = r2.xt
            r3.j(r7, r4)
            com.bytedance.adsdk.ugeno.viewpager.ViewPager r3 = r2.xt
            r4 = 2
            r3.setOverScrollMode(r4)
            goto L78
        L4c:
            java.lang.String r4 = "linear"
            boolean r4 = android.text.TextUtils.equals(r3, r4)
            if (r4 == 0) goto L5f
            com.bytedance.adsdk.ugeno.viewpager.ViewPager r3 = r2.xt
            com.bytedance.adsdk.ugeno.swiper.j.xt r4 = new com.bytedance.adsdk.ugeno.swiper.j.xt
            r4.<init>()
            r3.j(r0, r4)
            goto L78
        L5f:
            java.lang.String r4 = "cube"
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 == 0) goto L72
            com.bytedance.adsdk.ugeno.viewpager.ViewPager r3 = r2.xt
            com.bytedance.adsdk.ugeno.swiper.j.j r4 = new com.bytedance.adsdk.ugeno.swiper.j.j
            r4.<init>()
            r3.j(r0, r4)
            goto L78
        L72:
            com.bytedance.adsdk.ugeno.viewpager.ViewPager r3 = r2.xt
            r4 = 0
            r3.j(r0, r4)
        L78:
            com.bytedance.adsdk.ugeno.viewpager.ViewPager r3 = r2.xt
            float r4 = r2.qv
            int r4 = (int) r4
            r3.setOffscreenPageLimit(r4)
            return
    }

    public com.bytedance.adsdk.ugeno.swiper.BaseSwiper m(int r7) {
            r6 = this;
            r6.g = r7
            java.lang.String r1 = r6.oq
            int r2 = r6.ae
            int r3 = r6.tl
            r5 = 1
            r0 = r6
            r4 = r7
            r0.j(r1, r2, r3, r4, r5)
            return r0
    }

    public void m() {
            r1 = this;
            java.lang.Runnable r0 = r1.a
            r1.removeCallbacks(r0)
            return
    }

    public void oq(int r7) {
            r6 = this;
            java.lang.String r1 = r6.oq
            int r2 = r6.ae
            int r3 = r6.tl
            int r4 = r6.g
            r5 = 1
            r0 = r6
            r0.j(r1, r2, r3, r4, r5)
            com.bytedance.adsdk.ugeno.swiper.BaseSwiper$j r1 = r0.f1980x
            if (r1 != 0) goto L24
            com.bytedance.adsdk.ugeno.swiper.BaseSwiper$j r1 = new com.bytedance.adsdk.ugeno.swiper.BaseSwiper$j
            r1.<init>(r6)
            r0.f1980x = r1
            com.bytedance.adsdk.ugeno.viewpager.ViewPager r1 = r0.xt
            r1.j(r6)
            com.bytedance.adsdk.ugeno.viewpager.ViewPager r1 = r0.xt
            com.bytedance.adsdk.ugeno.swiper.BaseSwiper$j r2 = r0.f1980x
            r1.setAdapter(r2)
        L24:
            boolean r1 = r0.ws
            r2 = 1
            if (r1 == 0) goto L3c
            r1 = 1024(0x400, float:1.435E-42)
            if (r7 < r1) goto L36
            com.bytedance.adsdk.ugeno.viewpager.ViewPager r7 = r0.xt
            r1 = 512(0x200, float:7.17E-43)
            r2 = 0
            r7.j(r1, r2)
            return
        L36:
            com.bytedance.adsdk.ugeno.viewpager.ViewPager r1 = r0.xt
            r1.j(r7, r2)
            return
        L3c:
            if (r7 < 0) goto L4c
            java.util.List<T> r1 = r0.j
            int r1 = r1.size()
            if (r7 < r1) goto L47
            goto L4c
        L47:
            com.bytedance.adsdk.ugeno.viewpager.ViewPager r1 = r0.xt
            r1.j(r7, r2)
        L4c:
            return
    }

    public void qv(int r4) {
            r3 = this;
            java.lang.Runnable r0 = r3.a
            r3.removeCallbacks(r0)
            java.lang.Runnable r0 = r3.a
            long r1 = (long) r4
            r3.postDelayed(r0, r1)
            return
    }

    public com.bytedance.adsdk.ugeno.swiper.BaseSwiper r(int r7) {
            r6 = this;
            r6.ae = r7
            java.lang.String r1 = r6.oq
            int r3 = r6.tl
            int r4 = r6.g
            r5 = 1
            r0 = r6
            r2 = r7
            r0.j(r1, r2, r3, r4, r5)
            return r0
    }

    public com.bytedance.adsdk.ugeno.swiper.BaseSwiper r(boolean r3) {
            r2 = this;
            com.bytedance.adsdk.ugeno.swiper.indicator.BaseIndicator r0 = r2.f1978v
            r0.setLoop(r3)
            boolean r0 = r2.ws
            if (r0 == r3) goto L27
            com.bytedance.adsdk.ugeno.viewpager.ViewPager r0 = r2.xt
            int r0 = r0.getCurrentItem()
            java.util.List<T> r1 = r2.j
            int r1 = r1.size()
            int r0 = com.bytedance.adsdk.ugeno.swiper.xt.j(r3, r0, r1)
            r2.ws = r3
            com.bytedance.adsdk.ugeno.swiper.BaseSwiper$j r3 = r2.f1980x
            if (r3 == 0) goto L27
            r3.cw()
            com.bytedance.adsdk.ugeno.viewpager.ViewPager r3 = r2.xt
            r3.setCurrentItem(r0)
        L27:
            return r2
    }

    public void r() {
            r1 = this;
            java.lang.Runnable r0 = r1.f1975l
            r1.removeCallbacks(r0)
            return
    }

    public void setOnPageChangeListener(com.bytedance.adsdk.ugeno.swiper.j r1) {
            r0 = this;
            r0.ch = r1
            return
    }

    public void setTwoItems(boolean r1) {
            r0 = this;
            r0.i = r1
            return
    }

    @Override // com.bytedance.adsdk.ugeno.viewpager.ViewPager.r
    public void tl(int r9) {
            r8 = this;
            com.bytedance.adsdk.ugeno.swiper.j r0 = r8.ch
            if (r0 == 0) goto L2d
            boolean r0 = r8.ws
            java.util.List<T> r1 = r8.j
            int r1 = r1.size()
            int r4 = com.bytedance.adsdk.ugeno.swiper.xt.j(r0, r9, r1)
            com.bytedance.adsdk.ugeno.swiper.j r2 = r8.ch
            boolean r3 = r8.ws
            r0 = 0
            r1 = 1
            if (r4 != 0) goto L1a
            r6 = 1
            goto L1b
        L1a:
            r6 = 0
        L1b:
            java.util.List<T> r5 = r8.j
            int r5 = r5.size()
            int r5 = r5 - r1
            if (r4 != r5) goto L27
            r7 = 1
        L25:
            r5 = r9
            goto L29
        L27:
            r7 = 0
            goto L25
        L29:
            r2.j(r3, r4, r5, r6, r7)
            goto L2e
        L2d:
            r5 = r9
        L2e:
            boolean r9 = r8.vl
            if (r9 == 0) goto L37
            com.bytedance.adsdk.ugeno.swiper.indicator.BaseIndicator r9 = r8.f1978v
            r9.j(r5)
        L37:
            return
    }

    public com.bytedance.adsdk.ugeno.swiper.BaseSwiper<T> up(int r7) {
            r6 = this;
            r6.tl = r7
            java.lang.String r1 = r6.oq
            int r2 = r6.ae
            int r4 = r6.g
            r5 = 1
            r0 = r6
            r3 = r7
            r0.j(r1, r2, r3, r4, r5)
            return r0
    }

    public void up() {
            r6 = this;
            java.lang.String r1 = r6.oq
            int r2 = r6.ae
            int r3 = r6.tl
            int r4 = r6.g
            r5 = 1
            r0 = r6
            r0.j(r1, r2, r3, r4, r5)
            com.bytedance.adsdk.ugeno.swiper.BaseSwiper$j r1 = r0.f1980x
            if (r1 != 0) goto L24
            com.bytedance.adsdk.ugeno.swiper.BaseSwiper$j r1 = new com.bytedance.adsdk.ugeno.swiper.BaseSwiper$j
            r1.<init>(r6)
            r0.f1980x = r1
            com.bytedance.adsdk.ugeno.viewpager.ViewPager r1 = r0.xt
            r1.j(r6)
            com.bytedance.adsdk.ugeno.viewpager.ViewPager r1 = r0.xt
            com.bytedance.adsdk.ugeno.swiper.BaseSwiper$j r2 = r0.f1980x
            r1.setAdapter(r2)
        L24:
            int r1 = r0.f1979w
            if (r1 < 0) goto L30
            java.util.List<T> r2 = r0.j
            int r2 = r2.size()
            if (r1 < r2) goto L33
        L30:
            r1 = 0
            r0.f1979w = r1
        L33:
            boolean r1 = r0.ws
            if (r1 == 0) goto L3c
            int r1 = r0.f1979w
            int r1 = r1 + 512
            goto L3e
        L3c:
            int r1 = r0.f1979w
        L3e:
            com.bytedance.adsdk.ugeno.viewpager.ViewPager r2 = r0.xt
            r3 = 1
            r2.j(r1, r3)
            return
    }

    public com.bytedance.adsdk.ugeno.swiper.BaseSwiper xt(int r2) {
            r1 = this;
            com.bytedance.adsdk.ugeno.swiper.indicator.BaseIndicator r0 = r1.f1978v
            r0.setSelectedColor(r2)
            return r1
    }

    public com.bytedance.adsdk.ugeno.swiper.BaseSwiper xt(java.lang.String r7) {
            r6 = this;
            r6.oq = r7
            int r2 = r6.ae
            int r3 = r6.tl
            int r4 = r6.g
            r5 = 1
            r0 = r6
            r1 = r7
            r0.j(r1, r2, r3, r4, r5)
            return r0
    }

    public com.bytedance.adsdk.ugeno.swiper.BaseSwiper xt(boolean r1) {
            r0 = this;
            r0.az = r1
            return r0
    }

    public void xt() {
            r6 = this;
            java.lang.String r1 = r6.oq
            int r2 = r6.ae
            int r3 = r6.tl
            int r4 = r6.g
            r5 = 1
            r0 = r6
            r0.j(r1, r2, r3, r4, r5)
            com.bytedance.adsdk.ugeno.swiper.BaseSwiper$j r1 = r0.f1980x
            if (r1 != 0) goto L24
            com.bytedance.adsdk.ugeno.swiper.BaseSwiper$j r1 = new com.bytedance.adsdk.ugeno.swiper.BaseSwiper$j
            r1.<init>(r6)
            r0.f1980x = r1
            com.bytedance.adsdk.ugeno.viewpager.ViewPager r1 = r0.xt
            r1.j(r6)
            com.bytedance.adsdk.ugeno.viewpager.ViewPager r1 = r0.xt
            com.bytedance.adsdk.ugeno.swiper.BaseSwiper$j r2 = r0.f1980x
            r1.setAdapter(r2)
        L24:
            int r1 = r0.f1979w
            if (r1 < 0) goto L30
            java.util.List<T> r2 = r0.j
            int r2 = r2.size()
            if (r1 < r2) goto L33
        L30:
            r1 = 0
            r0.f1979w = r1
        L33:
            boolean r1 = r0.ws
            if (r1 == 0) goto L3c
            int r1 = r0.f1979w
            int r1 = r1 + 512
            goto L3e
        L3c:
            int r1 = r0.f1979w
        L3e:
            com.bytedance.adsdk.ugeno.viewpager.ViewPager r2 = r0.xt
            r3 = 1
            r2.j(r1, r3)
            boolean r2 = r0.ws
            if (r2 != 0) goto L4b
            r6.tl(r1)
        L4b:
            boolean r1 = r0.jy
            if (r1 == 0) goto L52
            r6.cw()
        L52:
            return
    }
}
