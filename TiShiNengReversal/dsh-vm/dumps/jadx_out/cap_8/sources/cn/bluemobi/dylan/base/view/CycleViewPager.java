package cn.bluemobi.dylan.base.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class CycleViewPager extends android.widget.FrameLayout implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {
    private static final java.lang.String TAG = "CycleViewPager";
    private int WHEEL;
    private int WHEEL_WAIT;
    private int delay;
    private int dotHeight;
    private int dotWidth;
    private android.os.Handler handler;
    private cn.bluemobi.dylan.base.view.CycleViewPager.ImageCycleViewSelectListener imageCycleViewSelectListener;
    private java.util.List<java.lang.String> infos;
    private java.util.List<java.lang.Integer> infos0;
    private boolean isCycle;
    private boolean isScrolling;
    private boolean isWheel;
    private cn.bluemobi.dylan.base.view.CycleViewPager.ViewPagerAdapter mAdapter;
    private android.content.Context mContext;
    private int mCurrentPosition;
    private cn.bluemobi.dylan.base.view.CycleViewPager.ImageCycleViewListener mImageCycleViewListener;
    private android.widget.LinearLayout mIndicatorLayout;
    private int mIndicatorSelected;
    private int mIndicatorUnselected;
    private android.widget.ImageView[] mIndicators;
    private android.widget.TextView mTitle;
    private androidx.viewpager.widget.ViewPager mViewPager;
    private java.util.List<android.view.View> mViews;
    private long releaseTime;
    final java.lang.Runnable runnable;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface ImageCycleViewListener {
        void onImageClick(java.lang.String r1, int r2, android.view.View r3);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface ImageCycleViewSelectListener {
        void onItemSelect(int r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class ViewPagerAdapter extends androidx.viewpager.widget.PagerAdapter {
        final /* synthetic */ cn.bluemobi.dylan.base.view.CycleViewPager this$0;


        private ViewPagerAdapter(cn.bluemobi.dylan.base.view.CycleViewPager r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ ViewPagerAdapter(cn.bluemobi.dylan.base.view.CycleViewPager r1, cn.bluemobi.dylan.base.view.CycleViewPager.AnonymousClass1 r2) {
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
                cn.bluemobi.dylan.base.view.CycleViewPager r0 = r1.this$0
                java.util.List r0 = cn.bluemobi.dylan.base.view.CycleViewPager.access$700(r0)
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
                cn.bluemobi.dylan.base.view.CycleViewPager r0 = r1.this$0
                java.util.List r0 = cn.bluemobi.dylan.base.view.CycleViewPager.access$700(r0)
                java.lang.Object r3 = r0.get(r3)
                android.view.View r3 = (android.view.View) r3
                cn.bluemobi.dylan.base.view.CycleViewPager r0 = r1.this$0
                cn.bluemobi.dylan.base.view.CycleViewPager$ImageCycleViewListener r0 = cn.bluemobi.dylan.base.view.CycleViewPager.access$1200(r0)
                if (r0 == 0) goto L1c
                cn.bluemobi.dylan.base.view.CycleViewPager$ViewPagerAdapter$1 r0 = new cn.bluemobi.dylan.base.view.CycleViewPager$ViewPagerAdapter$1
                r0.<init>(r1)
                r3.setOnClickListener(r0)
            L1c:
                r2.addView(r3)
                return r3
        }

        /* renamed from: instantiateItem, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ java.lang.Object m0instantiateItem(android.view.ViewGroup r1, int r2) {
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

    public CycleViewPager(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r2 = 100
            r0.WHEEL = r2
            r2 = 101(0x65, float:1.42E-43)
            r0.WHEEL_WAIT = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.mViews = r2
            r2 = 0
            r0.isScrolling = r2
            r3 = 1
            r0.isCycle = r3
            r0.isWheel = r3
            r3 = 3000(0xbb8, float:4.204E-42)
            r0.delay = r3
            r0.mCurrentPosition = r2
            r2 = 0
            r0.releaseTime = r2
            cn.bluemobi.dylan.base.view.CycleViewPager$1 r2 = new cn.bluemobi.dylan.base.view.CycleViewPager$1
            r2.<init>(r0)
            r0.runnable = r2
            r2 = -2
            r0.dotWidth = r2
            r0.dotHeight = r2
            r0.mContext = r1
            r0.initView()
            return
    }

    static /* synthetic */ android.content.Context access$000(cn.bluemobi.dylan.base.view.CycleViewPager r0) {
            android.content.Context r0 = r0.mContext
            return r0
    }

    static /* synthetic */ boolean access$100(cn.bluemobi.dylan.base.view.CycleViewPager r0) {
            boolean r0 = r0.isWheel
            return r0
    }

    static /* synthetic */ androidx.viewpager.widget.ViewPager access$1000(cn.bluemobi.dylan.base.view.CycleViewPager r0) {
            androidx.viewpager.widget.ViewPager r0 = r0.mViewPager
            return r0
    }

    static /* synthetic */ cn.bluemobi.dylan.base.view.CycleViewPager.ImageCycleViewListener access$1200(cn.bluemobi.dylan.base.view.CycleViewPager r0) {
            cn.bluemobi.dylan.base.view.CycleViewPager$ImageCycleViewListener r0 = r0.mImageCycleViewListener
            return r0
    }

    static /* synthetic */ java.util.List access$1300(cn.bluemobi.dylan.base.view.CycleViewPager r0) {
            java.util.List<java.lang.String> r0 = r0.infos
            return r0
    }

    static /* synthetic */ long access$200(cn.bluemobi.dylan.base.view.CycleViewPager r2) {
            long r0 = r2.releaseTime
            return r0
    }

    static /* synthetic */ long access$202(cn.bluemobi.dylan.base.view.CycleViewPager r0, long r1) {
            r0.releaseTime = r1
            return r1
    }

    static /* synthetic */ int access$300(cn.bluemobi.dylan.base.view.CycleViewPager r0) {
            int r0 = r0.delay
            return r0
    }

    static /* synthetic */ int access$400(cn.bluemobi.dylan.base.view.CycleViewPager r0) {
            int r0 = r0.WHEEL
            return r0
    }

    static /* synthetic */ android.os.Handler access$500(cn.bluemobi.dylan.base.view.CycleViewPager r0) {
            android.os.Handler r0 = r0.handler
            return r0
    }

    static /* synthetic */ int access$600(cn.bluemobi.dylan.base.view.CycleViewPager r0) {
            int r0 = r0.WHEEL_WAIT
            return r0
    }

    static /* synthetic */ java.util.List access$700(cn.bluemobi.dylan.base.view.CycleViewPager r0) {
            java.util.List<android.view.View> r0 = r0.mViews
            return r0
    }

    static /* synthetic */ boolean access$800(cn.bluemobi.dylan.base.view.CycleViewPager r0) {
            boolean r0 = r0.isScrolling
            return r0
    }

    static /* synthetic */ int access$900(cn.bluemobi.dylan.base.view.CycleViewPager r0) {
            int r0 = r0.mCurrentPosition
            return r0
    }

    private android.view.View getImageView(android.content.Context r5, int r6) {
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

    private android.view.View getImageView(android.content.Context r6, java.lang.String r7) {
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

    private void initView() {
            r3 = this;
            android.content.Context r0 = r3.mContext
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = cn.bluemobi.dylan.base.R.layout.pub_layout_cycle_view
            r2 = 1
            r0.inflate(r1, r3, r2)
            int r0 = cn.bluemobi.dylan.base.R.id.cycle_view_pager
            android.view.View r0 = r3.findViewById(r0)
            androidx.viewpager.widget.ViewPager r0 = (androidx.viewpager.widget.ViewPager) r0
            r3.mViewPager = r0
            int r0 = cn.bluemobi.dylan.base.R.id.cycle_title
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.mTitle = r0
            int r0 = cn.bluemobi.dylan.base.R.id.cycle_indicator
            android.view.View r0 = r3.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r3.mIndicatorLayout = r0
            cn.bluemobi.dylan.base.view.CycleViewPager$2 r0 = new cn.bluemobi.dylan.base.view.CycleViewPager$2
            r0.<init>(r3)
            r3.handler = r0
            return
    }

    private void setIndicator(int r4) {
            r3 = this;
            cn.bluemobi.dylan.base.view.CycleViewPager$ImageCycleViewSelectListener r0 = r3.imageCycleViewSelectListener
            if (r0 == 0) goto L7
            r0.onItemSelect(r4)
        L7:
            r0 = 0
        L8:
            android.widget.ImageView[] r1 = r3.mIndicators     // Catch: java.lang.Exception -> L21
            int r2 = r1.length     // Catch: java.lang.Exception -> L21
            if (r0 >= r2) goto L17
            r1 = r1[r0]     // Catch: java.lang.Exception -> L21
            int r2 = r3.mIndicatorUnselected     // Catch: java.lang.Exception -> L21
            r1.setBackgroundResource(r2)     // Catch: java.lang.Exception -> L21
            int r0 = r0 + 1
            goto L8
        L17:
            int r0 = r1.length     // Catch: java.lang.Exception -> L21
            if (r0 <= r4) goto L21
            r4 = r1[r4]     // Catch: java.lang.Exception -> L21
            int r0 = r3.mIndicatorSelected     // Catch: java.lang.Exception -> L21
            r4.setBackgroundResource(r0)     // Catch: java.lang.Exception -> L21
        L21:
            return
    }

    public static void setText(android.widget.TextView r1, int r2) {
            if (r1 == 0) goto L16
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = ""
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            setText(r1, r2)
        L16:
            return
    }

    public static void setText(android.widget.TextView r0, java.lang.String r1) {
            if (r1 == 0) goto L7
            if (r0 == 0) goto L7
            r0.setText(r1)
        L7:
            return
    }

    public boolean isCycle() {
            r1 = this;
            boolean r0 = r1.isCycle
            return r0
    }

    public boolean isWheel() {
            r1 = this;
            boolean r0 = r1.isWheel
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r2 = this;
            android.os.Handler r0 = r2.handler
            java.lang.Runnable r1 = r2.runnable
            r0.removeCallbacks(r1)
            super.onDetachedFromWindow()
            return
    }

    public void onPageScrollStateChanged(int r4) {
            r3 = this;
            r0 = 1
            if (r4 != r0) goto L6
            r3.isScrolling = r0
            return
        L6:
            r0 = 0
            if (r4 != 0) goto L16
            long r1 = java.lang.System.currentTimeMillis()
            r3.releaseTime = r1
            androidx.viewpager.widget.ViewPager r4 = r3.mViewPager
            int r1 = r3.mCurrentPosition
            r4.setCurrentItem(r1, r0)
        L16:
            r3.isScrolling = r0
            return
    }

    public void onPageScrolled(int r1, float r2, int r3) {
            r0 = this;
            return
    }

    public void onPageSelected(int r4) {
            r3 = this;
            java.util.List<android.view.View> r0 = r3.mViews
            int r0 = r0.size()
            int r1 = r0 + (-1)
            r3.mCurrentPosition = r4
            boolean r2 = r3.isCycle
            if (r2 == 0) goto L1d
            r2 = 1
            if (r4 != 0) goto L16
            int r0 = r0 + (-2)
            r3.mCurrentPosition = r0
            goto L1a
        L16:
            if (r4 != r1) goto L1a
            r3.mCurrentPosition = r2
        L1a:
            int r4 = r3.mCurrentPosition
            int r4 = r4 - r2
        L1d:
            r3.setIndicator(r4)
            return
    }

    public void refreshData() {
            r1 = this;
            cn.bluemobi.dylan.base.view.CycleViewPager$ViewPagerAdapter r0 = r1.mAdapter
            if (r0 == 0) goto L7
            r0.notifyDataSetChanged()
        L7:
            return
    }

    public void setCycle(boolean r1) {
            r0 = this;
            r0.isCycle = r1
            return
    }

    public void setData(java.util.List<java.lang.String> r2, cn.bluemobi.dylan.base.view.CycleViewPager.ImageCycleViewListener r3) {
            r1 = this;
            r0 = 0
            r1.setData(r2, r3, r0)
            return
    }

    public void setData(java.util.List<java.lang.String> r6, cn.bluemobi.dylan.base.view.CycleViewPager.ImageCycleViewListener r7, int r8) {
            r5 = this;
            r0 = 8
            if (r6 == 0) goto L120
            int r1 = r6.size()
            if (r1 != 0) goto Lc
            goto L120
        Lc:
            java.util.List<android.view.View> r1 = r5.mViews
            r1.clear()
            r5.infos = r6
            boolean r1 = r5.isCycle
            r2 = 0
            if (r1 == 0) goto L62
            java.util.List<android.view.View> r1 = r5.mViews
            android.content.Context r3 = r5.mContext
            int r4 = r6.size()
            int r4 = r4 + (-1)
            java.lang.Object r6 = r6.get(r4)
            java.lang.String r6 = (java.lang.String) r6
            android.view.View r6 = r5.getImageView(r3, r6)
            r1.add(r6)
            r6 = 0
        L30:
            java.util.List<java.lang.String> r1 = r5.infos
            int r1 = r1.size()
            if (r6 >= r1) goto L4e
            java.util.List<android.view.View> r1 = r5.mViews
            android.content.Context r3 = r5.mContext
            java.util.List<java.lang.String> r4 = r5.infos
            java.lang.Object r4 = r4.get(r6)
            java.lang.String r4 = (java.lang.String) r4
            android.view.View r3 = r5.getImageView(r3, r4)
            r1.add(r3)
            int r6 = r6 + 1
            goto L30
        L4e:
            java.util.List<android.view.View> r6 = r5.mViews
            android.content.Context r1 = r5.mContext
            java.util.List<java.lang.String> r3 = r5.infos
            java.lang.Object r3 = r3.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            android.view.View r1 = r5.getImageView(r1, r3)
            r6.add(r1)
            goto L81
        L62:
            r6 = 0
        L63:
            java.util.List<java.lang.String> r1 = r5.infos
            int r1 = r1.size()
            if (r6 >= r1) goto L81
            java.util.List<android.view.View> r1 = r5.mViews
            android.content.Context r3 = r5.mContext
            java.util.List<java.lang.String> r4 = r5.infos
            java.lang.Object r4 = r4.get(r6)
            java.lang.String r4 = (java.lang.String) r4
            android.view.View r3 = r5.getImageView(r3, r4)
            r1.add(r3)
            int r6 = r6 + 1
            goto L63
        L81:
            java.util.List<android.view.View> r6 = r5.mViews
            if (r6 == 0) goto L11c
            int r6 = r6.size()
            if (r6 != 0) goto L8d
            goto L11c
        L8d:
            r5.mImageCycleViewListener = r7
            java.util.List<android.view.View> r6 = r5.mViews
            int r6 = r6.size()
            android.widget.ImageView[] r7 = new android.widget.ImageView[r6]
            r5.mIndicators = r7
            boolean r7 = r5.isCycle
            if (r7 == 0) goto La3
            int r6 = r6 + (-2)
            android.widget.ImageView[] r6 = new android.widget.ImageView[r6]
            r5.mIndicators = r6
        La3:
            android.widget.LinearLayout r6 = r5.mIndicatorLayout
            r6.removeAllViews()
            r6 = 0
        La9:
            android.widget.ImageView[] r7 = r5.mIndicators
            int r0 = r7.length
            if (r6 >= r0) goto Le1
            android.widget.ImageView r0 = new android.widget.ImageView
            android.content.Context r1 = r5.mContext
            r0.<init>(r1)
            r7[r6] = r0
            android.widget.ImageView[] r7 = r5.mIndicators
            r7 = r7[r6]
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
            r7.setScaleType(r0)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            int r0 = r5.dotWidth
            int r1 = r5.dotHeight
            r7.<init>(r0, r1)
            r0 = 10
            r7.setMargins(r0, r2, r0, r2)
            android.widget.ImageView[] r0 = r5.mIndicators
            r0 = r0[r6]
            r0.setLayoutParams(r7)
            android.widget.LinearLayout r7 = r5.mIndicatorLayout
            android.widget.ImageView[] r0 = r5.mIndicators
            r0 = r0[r6]
            r7.addView(r0)
            int r6 = r6 + 1
            goto La9
        Le1:
            cn.bluemobi.dylan.base.view.CycleViewPager$ViewPagerAdapter r6 = new cn.bluemobi.dylan.base.view.CycleViewPager$ViewPagerAdapter
            r7 = 0
            r6.<init>(r5, r7)
            r5.mAdapter = r6
            r5.setIndicator(r2)
            androidx.viewpager.widget.ViewPager r6 = r5.mViewPager
            r7 = 3
            r6.setOffscreenPageLimit(r7)
            androidx.viewpager.widget.ViewPager r6 = r5.mViewPager
            r6.setOnPageChangeListener(r5)
            androidx.viewpager.widget.ViewPager r6 = r5.mViewPager
            cn.bluemobi.dylan.base.view.CycleViewPager$ViewPagerAdapter r7 = r5.mAdapter
            r6.setAdapter(r7)
            if (r8 < 0) goto L108
            java.util.List<android.view.View> r6 = r5.mViews
            int r6 = r6.size()
            if (r8 < r6) goto L109
        L108:
            r8 = 0
        L109:
            boolean r6 = r5.isCycle
            if (r6 == 0) goto L10f
            int r8 = r8 + 1
        L10f:
            androidx.viewpager.widget.ViewPager r6 = r5.mViewPager
            r6.setCurrentItem(r8)
            boolean r6 = r5.isWheel()
            r5.setWheel(r6)
            return
        L11c:
            r5.setVisibility(r0)
            return
        L120:
            r5.setVisibility(r0)
            return
    }

    public void setDataResource(java.util.List<java.lang.Integer> r2, cn.bluemobi.dylan.base.view.CycleViewPager.ImageCycleViewListener r3) {
            r1 = this;
            r0 = 0
            r1.setDataResource(r2, r3, r0)
            return
    }

    public void setDataResource(java.util.List<java.lang.Integer> r6, cn.bluemobi.dylan.base.view.CycleViewPager.ImageCycleViewListener r7, int r8) {
            r5 = this;
            r0 = 8
            if (r6 == 0) goto L122
            int r1 = r6.size()
            if (r1 != 0) goto Lc
            goto L122
        Lc:
            java.util.List<android.view.View> r1 = r5.mViews
            r1.clear()
            r5.infos0 = r6
            boolean r6 = r5.isCycle
            r1 = 0
            if (r6 == 0) goto L64
            java.util.List<android.view.View> r6 = r5.mViews
            android.content.Context r2 = r5.mContext
            java.util.List<java.lang.String> r3 = r5.infos
            int r4 = r3.size()
            int r4 = r4 + (-1)
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            android.view.View r2 = r5.getImageView(r2, r3)
            r6.add(r2)
            r6 = 0
        L32:
            java.util.List<java.lang.String> r2 = r5.infos
            int r2 = r2.size()
            if (r6 >= r2) goto L50
            java.util.List<android.view.View> r2 = r5.mViews
            android.content.Context r3 = r5.mContext
            java.util.List<java.lang.String> r4 = r5.infos
            java.lang.Object r4 = r4.get(r6)
            java.lang.String r4 = (java.lang.String) r4
            android.view.View r3 = r5.getImageView(r3, r4)
            r2.add(r3)
            int r6 = r6 + 1
            goto L32
        L50:
            java.util.List<android.view.View> r6 = r5.mViews
            android.content.Context r2 = r5.mContext
            java.util.List<java.lang.String> r3 = r5.infos
            java.lang.Object r3 = r3.get(r1)
            java.lang.String r3 = (java.lang.String) r3
            android.view.View r2 = r5.getImageView(r2, r3)
            r6.add(r2)
            goto L83
        L64:
            r6 = 0
        L65:
            java.util.List<java.lang.String> r2 = r5.infos
            int r2 = r2.size()
            if (r6 >= r2) goto L83
            java.util.List<android.view.View> r2 = r5.mViews
            android.content.Context r3 = r5.mContext
            java.util.List<java.lang.String> r4 = r5.infos
            java.lang.Object r4 = r4.get(r6)
            java.lang.String r4 = (java.lang.String) r4
            android.view.View r3 = r5.getImageView(r3, r4)
            r2.add(r3)
            int r6 = r6 + 1
            goto L65
        L83:
            java.util.List<android.view.View> r6 = r5.mViews
            if (r6 == 0) goto L11e
            int r6 = r6.size()
            if (r6 != 0) goto L8f
            goto L11e
        L8f:
            r5.mImageCycleViewListener = r7
            java.util.List<android.view.View> r6 = r5.mViews
            int r6 = r6.size()
            android.widget.ImageView[] r7 = new android.widget.ImageView[r6]
            r5.mIndicators = r7
            boolean r7 = r5.isCycle
            if (r7 == 0) goto La5
            int r6 = r6 + (-2)
            android.widget.ImageView[] r6 = new android.widget.ImageView[r6]
            r5.mIndicators = r6
        La5:
            android.widget.LinearLayout r6 = r5.mIndicatorLayout
            r6.removeAllViews()
            r6 = 0
        Lab:
            android.widget.ImageView[] r7 = r5.mIndicators
            int r0 = r7.length
            if (r6 >= r0) goto Le3
            android.widget.ImageView r0 = new android.widget.ImageView
            android.content.Context r2 = r5.mContext
            r0.<init>(r2)
            r7[r6] = r0
            android.widget.ImageView[] r7 = r5.mIndicators
            r7 = r7[r6]
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
            r7.setScaleType(r0)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            int r0 = r5.dotWidth
            int r2 = r5.dotHeight
            r7.<init>(r0, r2)
            r0 = 10
            r7.setMargins(r0, r1, r0, r1)
            android.widget.ImageView[] r0 = r5.mIndicators
            r0 = r0[r6]
            r0.setLayoutParams(r7)
            android.widget.LinearLayout r7 = r5.mIndicatorLayout
            android.widget.ImageView[] r0 = r5.mIndicators
            r0 = r0[r6]
            r7.addView(r0)
            int r6 = r6 + 1
            goto Lab
        Le3:
            cn.bluemobi.dylan.base.view.CycleViewPager$ViewPagerAdapter r6 = new cn.bluemobi.dylan.base.view.CycleViewPager$ViewPagerAdapter
            r7 = 0
            r6.<init>(r5, r7)
            r5.mAdapter = r6
            r5.setIndicator(r1)
            androidx.viewpager.widget.ViewPager r6 = r5.mViewPager
            r7 = 3
            r6.setOffscreenPageLimit(r7)
            androidx.viewpager.widget.ViewPager r6 = r5.mViewPager
            r6.setOnPageChangeListener(r5)
            androidx.viewpager.widget.ViewPager r6 = r5.mViewPager
            cn.bluemobi.dylan.base.view.CycleViewPager$ViewPagerAdapter r7 = r5.mAdapter
            r6.setAdapter(r7)
            if (r8 < 0) goto L10a
            java.util.List<android.view.View> r6 = r5.mViews
            int r6 = r6.size()
            if (r8 < r6) goto L10b
        L10a:
            r8 = 0
        L10b:
            boolean r6 = r5.isCycle
            if (r6 == 0) goto L111
            int r8 = r8 + 1
        L111:
            androidx.viewpager.widget.ViewPager r6 = r5.mViewPager
            r6.setCurrentItem(r8)
            boolean r6 = r5.isWheel()
            r5.setWheel(r6)
            return
        L11e:
            r5.setVisibility(r0)
            return
        L122:
            r5.setVisibility(r0)
            return
    }

    public void setDelay(int r1) {
            r0 = this;
            r0.delay = r1
            return
    }

    public void setImageCycleViewSelectListener(cn.bluemobi.dylan.base.view.CycleViewPager.ImageCycleViewSelectListener r1) {
            r0 = this;
            r0.imageCycleViewSelectListener = r1
            return
    }

    public void setIndicatorSize(int r1, int r2) {
            r0 = this;
            r0.dotWidth = r1
            r0.dotHeight = r2
            return
    }

    public void setIndicators(int r1, int r2) {
            r0 = this;
            r0.mIndicatorSelected = r1
            r0.mIndicatorUnselected = r2
            return
    }

    public void setWheel(boolean r4) {
            r3 = this;
            r3.isWheel = r4
            r0 = 1
            r3.isCycle = r0
            if (r4 == 0) goto L11
            android.os.Handler r4 = r3.handler
            java.lang.Runnable r0 = r3.runnable
            int r1 = r3.delay
            long r1 = (long) r1
            r4.postDelayed(r0, r1)
        L11:
            return
    }
}
