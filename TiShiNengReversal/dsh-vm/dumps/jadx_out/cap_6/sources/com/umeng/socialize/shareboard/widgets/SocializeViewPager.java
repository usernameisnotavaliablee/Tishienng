package com.umeng.socialize.shareboard.widgets;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class SocializeViewPager extends android.view.ViewGroup {
    private static final int CLOSE_ENOUGH = 2;
    private static final java.util.Comparator<com.umeng.socialize.shareboard.widgets.SocializeViewPager.ItemInfo> COMPARATOR = null;
    private static final int DEFAULT_GUTTER_SIZE = 16;
    private static final int DEFAULT_OFFSCREEN_PAGES = 1;
    private static final int DEFAULT_WIDTH_FACTOR = 1;
    private static final int INVALID_POINTER = -1;
    static final int[] LAYOUT_ATTRS = null;
    private static final int MAX_SETTLE_DURATION = 600;
    private static final int MIN_DISTANCE_FOR_FLING = 25;
    private static final int MIN_FLING_VELOCITY = 400;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    private static final java.lang.String TAG = "ViewPager";
    private static final android.view.animation.Interpolator sInterpolator = null;
    private int mActivePointerId;
    private com.umeng.socialize.shareboard.widgets.SocializePagerAdapter mAdapter;
    private boolean mCalledSuper;
    private int mCloseEnough;
    private int mCurPosition;
    private int mDefaultGutterSize;
    private final java.lang.Runnable mEndScrollRunnable;
    private int mExpectedAdapterCount;
    private boolean mFirstLayout;
    private float mFirstOffset;
    private int mFlingDistance;
    private int mGutterSize;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private boolean mIsBeingDragged;
    private boolean mIsScrollStarted;
    private boolean mIsUnableToDrag;
    private java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager.ItemInfo> mItems;
    private float mLastMotionX;
    private float mLastMotionY;
    private float mLastOffset;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private com.umeng.socialize.shareboard.widgets.SocializeViewPager.PagerObserver mObserver;
    private int mOffscreenPageLimit;
    private java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager.OnPageChangeListener> mOnPageChangeListeners;
    private boolean mPopulatePending;
    private android.os.Parcelable mRestoredAdapterState;
    private java.lang.ClassLoader mRestoredClassLoader;
    private int mRestoredCurItem;
    private int mScrollState;
    private android.widget.Scroller mScroller;
    private final com.umeng.socialize.shareboard.widgets.SocializeViewPager.ItemInfo mTempItem;
    private final android.graphics.Rect mTempRect;
    private int mTouchSlop;
    private android.view.VelocityTracker mVelocityTracker;





    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class ItemInfo {
        java.lang.Object object;
        float offset;
        int position;
        boolean scrolling;

        ItemInfo() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class LayoutParams extends android.view.ViewGroup.LayoutParams {
        int childIndex;
        public int gravity;
        public boolean isDecor;
        boolean needsMeasure;
        int position;
        float widthFactor;

        public LayoutParams() {
                r1 = this;
                r0 = -1
                r1.<init>(r0, r0)
                r0 = 0
                r1.widthFactor = r0
                return
        }

        public LayoutParams(android.content.Context r2, android.util.AttributeSet r3) {
                r1 = this;
                r1.<init>(r2, r3)
                r0 = 0
                r1.widthFactor = r0
                int[] r0 = com.umeng.socialize.shareboard.widgets.SocializeViewPager.LAYOUT_ATTRS
                android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
                r3 = 0
                r0 = 48
                int r3 = r2.getInteger(r3, r0)
                r1.gravity = r3
                r2.recycle()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnPageChangeListener {
        void onPageScrollStateChanged(int r1);

        void onPageScrolled(int r1, float r2, int r3);

        void onPageSelected(int r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class PagerObserver extends android.database.DataSetObserver {
        final /* synthetic */ com.umeng.socialize.shareboard.widgets.SocializeViewPager this$0;

        PagerObserver(com.umeng.socialize.shareboard.widgets.SocializeViewPager r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
                r1 = this;
                com.umeng.socialize.shareboard.widgets.SocializeViewPager r0 = r1.this$0
                r0.dataSetChanged()
                return
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
                r1 = this;
                com.umeng.socialize.shareboard.widgets.SocializeViewPager r0 = r1.this$0
                r0.dataSetChanged()
                return
        }
    }

    static {
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$2 r0 = new com.umeng.socialize.shareboard.widgets.SocializeViewPager$2
            r0.<init>()
            com.umeng.socialize.shareboard.widgets.SocializeViewPager.COMPARATOR = r0
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$3 r0 = new com.umeng.socialize.shareboard.widgets.SocializeViewPager$3
            r0.<init>()
            com.umeng.socialize.shareboard.widgets.SocializeViewPager.sInterpolator = r0
            r0 = 16842931(0x10100b3, float:2.369406E-38)
            int[] r0 = new int[]{r0}
            com.umeng.socialize.shareboard.widgets.SocializeViewPager.LAYOUT_ATTRS = r0
            return
    }

    public SocializeViewPager(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r2 = -1
            r1.mActivePointerId = r2
            r0 = 1
            r1.mOffscreenPageLimit = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mItems = r0
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo r0 = new com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo
            r0.<init>()
            r1.mTempItem = r0
            r1.mRestoredCurItem = r2
            r2 = 0
            r1.mRestoredAdapterState = r2
            r1.mRestoredClassLoader = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r1.mTempRect = r2
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$1 r2 = new com.umeng.socialize.shareboard.widgets.SocializeViewPager$1
            r2.<init>(r1)
            r1.mEndScrollRunnable = r2
            r2 = 0
            r1.mScrollState = r2
            r1.init()
            return
    }

    public SocializeViewPager(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = -1
            r0.mActivePointerId = r1
            r2 = 1
            r0.mOffscreenPageLimit = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.mItems = r2
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo r2 = new com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo
            r2.<init>()
            r0.mTempItem = r2
            r0.mRestoredCurItem = r1
            r1 = 0
            r0.mRestoredAdapterState = r1
            r0.mRestoredClassLoader = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.mTempRect = r1
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$1 r1 = new com.umeng.socialize.shareboard.widgets.SocializeViewPager$1
            r1.<init>(r0)
            r0.mEndScrollRunnable = r1
            r1 = 0
            r0.mScrollState = r1
            r0.init()
            return
    }

    public SocializeViewPager(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = -1
            r0.mActivePointerId = r1
            r2 = 1
            r0.mOffscreenPageLimit = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.mItems = r2
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo r2 = new com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo
            r2.<init>()
            r0.mTempItem = r2
            r0.mRestoredCurItem = r1
            r1 = 0
            r0.mRestoredAdapterState = r1
            r0.mRestoredClassLoader = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.mTempRect = r1
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$1 r1 = new com.umeng.socialize.shareboard.widgets.SocializeViewPager$1
            r1.<init>(r0)
            r0.mEndScrollRunnable = r1
            r1 = 0
            r0.mScrollState = r1
            r0.init()
            return
    }

    @android.annotation.TargetApi(21)
    public SocializeViewPager(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            r1 = -1
            r0.mActivePointerId = r1
            r2 = 1
            r0.mOffscreenPageLimit = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.mItems = r2
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo r2 = new com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo
            r2.<init>()
            r0.mTempItem = r2
            r0.mRestoredCurItem = r1
            r1 = 0
            r0.mRestoredAdapterState = r1
            r0.mRestoredClassLoader = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.mTempRect = r1
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$1 r1 = new com.umeng.socialize.shareboard.widgets.SocializeViewPager$1
            r1.<init>(r0)
            r0.mEndScrollRunnable = r1
            r1 = 0
            r0.mScrollState = r1
            r0.init()
            return
    }

    static /* synthetic */ void access$000(com.umeng.socialize.shareboard.widgets.SocializeViewPager r0) {
            r0.populate()
            return
    }

    static /* synthetic */ android.graphics.Rect access$100(com.umeng.socialize.shareboard.widgets.SocializeViewPager r0) {
            android.graphics.Rect r0 = r0.mTempRect
            return r0
    }

    private void calculatePageOffsets(com.umeng.socialize.shareboard.widgets.SocializeViewPager.ItemInfo r10, int r11, com.umeng.socialize.shareboard.widgets.SocializeViewPager.ItemInfo r12) {
            r9 = this;
            com.umeng.socialize.shareboard.widgets.SocializePagerAdapter r0 = r9.mAdapter
            int r0 = r0.getCount()
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r12 == 0) goto L9c
            int r3 = r12.position
            int r4 = r10.position
            if (r3 >= r4) goto L5a
            float r12 = r12.offset
            float r12 = r12 + r2
            float r12 = r12 + r1
            int r3 = r3 + 1
            r4 = 0
        L18:
            int r5 = r10.position
            if (r3 > r5) goto L9c
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r5 = r9.mItems
            int r5 = r5.size()
            if (r4 >= r5) goto L9c
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r5 = r9.mItems
            java.lang.Object r5 = r5.get(r4)
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo r5 = (com.umeng.socialize.shareboard.widgets.SocializeViewPager.ItemInfo) r5
        L2c:
            int r6 = r5.position
            if (r3 <= r6) goto L45
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r6 = r9.mItems
            int r6 = r6.size()
            int r6 = r6 + (-1)
            if (r4 >= r6) goto L45
            int r4 = r4 + 1
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r5 = r9.mItems
            java.lang.Object r5 = r5.get(r4)
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo r5 = (com.umeng.socialize.shareboard.widgets.SocializeViewPager.ItemInfo) r5
            goto L2c
        L45:
            int r6 = r5.position
            if (r3 >= r6) goto L54
            com.umeng.socialize.shareboard.widgets.SocializePagerAdapter r6 = r9.mAdapter
            float r6 = r6.getPageWidth(r3)
            float r6 = r6 + r1
            float r12 = r12 + r6
            int r3 = r3 + 1
            goto L45
        L54:
            r5.offset = r12
            float r12 = r12 + r2
            int r3 = r3 + 1
            goto L18
        L5a:
            if (r3 <= r4) goto L9c
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r4 = r9.mItems
            int r4 = r4.size()
            int r4 = r4 + (-1)
            float r12 = r12.offset
            int r3 = r3 + (-1)
        L68:
            int r5 = r10.position
            if (r3 < r5) goto L9c
            if (r4 < 0) goto L9c
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r5 = r9.mItems
            java.lang.Object r5 = r5.get(r4)
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo r5 = (com.umeng.socialize.shareboard.widgets.SocializeViewPager.ItemInfo) r5
        L76:
            int r6 = r5.position
            if (r3 >= r6) goto L87
            if (r4 <= 0) goto L87
            int r4 = r4 + (-1)
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r5 = r9.mItems
            java.lang.Object r5 = r5.get(r4)
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo r5 = (com.umeng.socialize.shareboard.widgets.SocializeViewPager.ItemInfo) r5
            goto L76
        L87:
            int r6 = r5.position
            if (r3 <= r6) goto L96
            com.umeng.socialize.shareboard.widgets.SocializePagerAdapter r6 = r9.mAdapter
            float r6 = r6.getPageWidth(r3)
            float r6 = r6 + r1
            float r12 = r12 - r6
            int r3 = r3 + (-1)
            goto L87
        L96:
            float r12 = r12 - r2
            r5.offset = r12
            int r3 = r3 + (-1)
            goto L68
        L9c:
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r12 = r9.mItems
            int r12 = r12.size()
            float r3 = r10.offset
            int r4 = r10.position
            int r5 = r4 + (-1)
            if (r4 != 0) goto Lac
            r6 = r3
            goto Laf
        Lac:
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        Laf:
            r9.mFirstOffset = r6
            int r0 = r0 + (-1)
            if (r4 != r0) goto Lb9
            float r4 = r3 + r2
            float r4 = r4 - r2
            goto Lbc
        Lb9:
            r4 = 2139095039(0x7f7fffff, float:3.4028235E38)
        Lbc:
            r9.mLastOffset = r4
            int r4 = r11 + (-1)
        Lc0:
            if (r4 < 0) goto Le6
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r6 = r9.mItems
            java.lang.Object r6 = r6.get(r4)
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo r6 = (com.umeng.socialize.shareboard.widgets.SocializeViewPager.ItemInfo) r6
        Lca:
            int r7 = r6.position
            if (r5 <= r7) goto Lda
            com.umeng.socialize.shareboard.widgets.SocializePagerAdapter r7 = r9.mAdapter
            int r8 = r5 + (-1)
            float r5 = r7.getPageWidth(r5)
            float r5 = r5 + r1
            float r3 = r3 - r5
            r5 = r8
            goto Lca
        Lda:
            float r3 = r3 - r2
            r6.offset = r3
            if (r7 != 0) goto Le1
            r9.mFirstOffset = r3
        Le1:
            int r4 = r4 + (-1)
            int r5 = r5 + (-1)
            goto Lc0
        Le6:
            float r3 = r10.offset
            float r3 = r3 + r2
            float r3 = r3 + r1
            int r10 = r10.position
            int r10 = r10 + 1
            int r11 = r11 + 1
        Lf0:
            if (r11 >= r12) goto L119
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r4 = r9.mItems
            java.lang.Object r4 = r4.get(r11)
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo r4 = (com.umeng.socialize.shareboard.widgets.SocializeViewPager.ItemInfo) r4
        Lfa:
            int r5 = r4.position
            if (r10 >= r5) goto L10a
            com.umeng.socialize.shareboard.widgets.SocializePagerAdapter r5 = r9.mAdapter
            int r6 = r10 + 1
            float r10 = r5.getPageWidth(r10)
            float r10 = r10 + r1
            float r3 = r3 + r10
            r10 = r6
            goto Lfa
        L10a:
            if (r5 != r0) goto L111
            float r5 = r3 + r2
            float r5 = r5 - r2
            r9.mLastOffset = r5
        L111:
            r4.offset = r3
            float r3 = r3 + r2
            int r11 = r11 + 1
            int r10 = r10 + 1
            goto Lf0
        L119:
            return
    }

    private void completeScroll(boolean r8) {
            r7 = this;
            int r0 = r7.mScrollState
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            if (r0 == 0) goto L39
            android.widget.Scroller r1 = r7.mScroller
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto L39
            android.widget.Scroller r1 = r7.mScroller
            r1.abortAnimation()
            int r1 = r7.getScrollX()
            int r4 = r7.getScrollY()
            android.widget.Scroller r5 = r7.mScroller
            int r5 = r5.getCurrX()
            android.widget.Scroller r6 = r7.mScroller
            int r6 = r6.getCurrY()
            if (r1 != r5) goto L31
            if (r4 == r6) goto L39
        L31:
            r7.scrollTo(r5, r6)
            if (r5 == r1) goto L39
            r7.pageScrolled(r5)
        L39:
            r7.mPopulatePending = r3
            r1 = 0
        L3c:
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r4 = r7.mItems
            int r4 = r4.size()
            if (r1 >= r4) goto L56
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r4 = r7.mItems
            java.lang.Object r4 = r4.get(r1)
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo r4 = (com.umeng.socialize.shareboard.widgets.SocializeViewPager.ItemInfo) r4
            boolean r5 = r4.scrolling
            if (r5 == 0) goto L53
            r4.scrolling = r3
            r0 = 1
        L53:
            int r1 = r1 + 1
            goto L3c
        L56:
            if (r0 == 0) goto L65
            if (r8 == 0) goto L60
            java.lang.Runnable r8 = r7.mEndScrollRunnable
            com.umeng.socialize.shareboard.widgets.ViewCompat.postOnAnimation(r7, r8)
            return
        L60:
            java.lang.Runnable r8 = r7.mEndScrollRunnable
            r8.run()
        L65:
            return
    }

    private int determineTargetPage(int r2, float r3, int r4, int r5) {
            r1 = this;
            int r5 = java.lang.Math.abs(r5)
            int r0 = r1.mFlingDistance
            if (r5 <= r0) goto L16
            int r5 = java.lang.Math.abs(r4)
            int r0 = r1.mMinimumVelocity
            if (r5 <= r0) goto L16
            if (r4 <= 0) goto L13
            goto L24
        L13:
            int r2 = r2 + 1
            goto L24
        L16:
            int r4 = r1.mCurPosition
            if (r2 < r4) goto L1e
            r4 = 1053609165(0x3ecccccd, float:0.4)
            goto L21
        L1e:
            r4 = 1058642330(0x3f19999a, float:0.6)
        L21:
            float r3 = r3 + r4
            int r3 = (int) r3
            int r2 = r2 + r3
        L24:
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r3 = r1.mItems
            int r3 = r3.size()
            if (r3 <= 0) goto L4f
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r3 = r1.mItems
            r4 = 0
            java.lang.Object r3 = r3.get(r4)
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo r3 = (com.umeng.socialize.shareboard.widgets.SocializeViewPager.ItemInfo) r3
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r4 = r1.mItems
            int r5 = r4.size()
            int r5 = r5 + (-1)
            java.lang.Object r4 = r4.get(r5)
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo r4 = (com.umeng.socialize.shareboard.widgets.SocializeViewPager.ItemInfo) r4
            int r3 = r3.position
            int r4 = r4.position
            int r2 = java.lang.Math.min(r2, r4)
            int r2 = java.lang.Math.max(r3, r2)
        L4f:
            return r2
    }

    private void dispatchOnPageScrolled(int r4, float r5, int r6) {
            r3 = this;
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$OnPageChangeListener> r0 = r3.mOnPageChangeListeners
            if (r0 == 0) goto L1b
            int r0 = r0.size()
            r1 = 0
        L9:
            if (r1 >= r0) goto L1b
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$OnPageChangeListener> r2 = r3.mOnPageChangeListeners
            java.lang.Object r2 = r2.get(r1)
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$OnPageChangeListener r2 = (com.umeng.socialize.shareboard.widgets.SocializeViewPager.OnPageChangeListener) r2
            if (r2 == 0) goto L18
            r2.onPageScrolled(r4, r5, r6)
        L18:
            int r1 = r1 + 1
            goto L9
        L1b:
            return
    }

    private void dispatchOnPageSelected(int r4) {
            r3 = this;
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$OnPageChangeListener> r0 = r3.mOnPageChangeListeners
            if (r0 == 0) goto L1b
            int r0 = r0.size()
            r1 = 0
        L9:
            if (r1 >= r0) goto L1b
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$OnPageChangeListener> r2 = r3.mOnPageChangeListeners
            java.lang.Object r2 = r2.get(r1)
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$OnPageChangeListener r2 = (com.umeng.socialize.shareboard.widgets.SocializeViewPager.OnPageChangeListener) r2
            if (r2 == 0) goto L18
            r2.onPageSelected(r4)
        L18:
            int r1 = r1 + 1
            goto L9
        L1b:
            return
    }

    private void dispatchOnScrollStateChanged(int r4) {
            r3 = this;
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$OnPageChangeListener> r0 = r3.mOnPageChangeListeners
            if (r0 == 0) goto L1b
            int r0 = r0.size()
            r1 = 0
        L9:
            if (r1 >= r0) goto L1b
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$OnPageChangeListener> r2 = r3.mOnPageChangeListeners
            java.lang.Object r2 = r2.get(r1)
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$OnPageChangeListener r2 = (com.umeng.socialize.shareboard.widgets.SocializeViewPager.OnPageChangeListener) r2
            if (r2 == 0) goto L18
            r2.onPageScrollStateChanged(r4)
        L18:
            int r1 = r1 + 1
            goto L9
        L1b:
            return
    }

    private void endDrag() {
            r1 = this;
            r0 = 0
            r1.mIsBeingDragged = r0
            r1.mIsUnableToDrag = r0
            android.view.VelocityTracker r0 = r1.mVelocityTracker
            if (r0 == 0) goto Lf
            r0.recycle()
            r0 = 0
            r1.mVelocityTracker = r0
        Lf:
            return
    }

    private android.graphics.Rect getChildRectInPagerCoordinates(android.graphics.Rect r3, android.view.View r4) {
            r2 = this;
            if (r3 != 0) goto L7
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
        L7:
            if (r4 != 0) goto Le
            r4 = 0
            r3.set(r4, r4, r4, r4)
            return r3
        Le:
            int r0 = r4.getLeft()
            r3.left = r0
            int r0 = r4.getRight()
            r3.right = r0
            int r0 = r4.getTop()
            r3.top = r0
            int r0 = r4.getBottom()
            r3.bottom = r0
            android.view.ViewParent r4 = r4.getParent()
        L2a:
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto L5b
            if (r4 == r2) goto L5b
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r0 = r3.left
            int r1 = r4.getLeft()
            int r0 = r0 + r1
            r3.left = r0
            int r0 = r3.right
            int r1 = r4.getRight()
            int r0 = r0 + r1
            r3.right = r0
            int r0 = r3.top
            int r1 = r4.getTop()
            int r0 = r0 + r1
            r3.top = r0
            int r0 = r3.bottom
            int r1 = r4.getBottom()
            int r0 = r0 + r1
            r3.bottom = r0
            android.view.ViewParent r4 = r4.getParent()
            goto L2a
        L5b:
            return r3
    }

    private int getClientWidth() {
            r2 = this;
            int r0 = r2.getMeasuredWidth()
            int r1 = r2.getPaddingLeft()
            int r0 = r0 - r1
            int r1 = r2.getPaddingRight()
            int r0 = r0 - r1
            return r0
    }

    private com.umeng.socialize.shareboard.widgets.SocializeViewPager.ItemInfo infoForCurrentScrollPosition() {
            r11 = this;
            int r0 = r11.getClientWidth()
            r1 = 0
            if (r0 <= 0) goto Lf
            int r2 = r11.getScrollX()
            float r2 = (float) r2
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L10
        Lf:
            r2 = 0
        L10:
            r0 = 0
            r3 = -1
            r4 = 1
            r5 = 0
            r6 = 0
            r7 = 1
            r8 = 0
        L17:
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r9 = r11.mItems
            int r9 = r9.size()
            if (r6 >= r9) goto L5a
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r9 = r11.mItems
            java.lang.Object r9 = r9.get(r6)
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo r9 = (com.umeng.socialize.shareboard.widgets.SocializeViewPager.ItemInfo) r9
            if (r7 != 0) goto L38
            int r10 = r9.position
            int r3 = r3 + r4
            if (r10 == r3) goto L38
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo r9 = r11.mTempItem
            float r8 = r8 + r1
            float r8 = r8 + r1
            r9.offset = r8
            r9.position = r3
            int r6 = r6 + (-1)
        L38:
            float r8 = r9.offset
            r3 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 + r8
            float r3 = r3 + r1
            if (r7 != 0) goto L44
            int r7 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r7 < 0) goto L5a
        L44:
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 < 0) goto L59
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r3 = r11.mItems
            int r3 = r3.size()
            int r3 = r3 - r4
            if (r6 != r3) goto L52
            goto L59
        L52:
            int r3 = r9.position
            int r6 = r6 + 1
            r5 = r9
            r7 = 0
            goto L17
        L59:
            return r9
        L5a:
            return r5
    }

    private void init() {
            r3 = this;
            r0 = 0
            r3.setWillNotDraw(r0)
            r0 = 262144(0x40000, float:3.67342E-40)
            r3.setDescendantFocusability(r0)
            r0 = 1
            r3.setFocusable(r0)
            android.content.Context r0 = r3.getContext()
            android.widget.Scroller r1 = new android.widget.Scroller
            android.view.animation.Interpolator r2 = com.umeng.socialize.shareboard.widgets.SocializeViewPager.sInterpolator
            r1.<init>(r0, r2)
            r3.mScroller = r1
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r0)
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            int r2 = r1.getScaledPagingTouchSlop()
            r3.mTouchSlop = r2
            r2 = 1137180672(0x43c80000, float:400.0)
            float r2 = r2 * r0
            int r2 = (int) r2
            r3.mMinimumVelocity = r2
            int r1 = r1.getScaledMaximumFlingVelocity()
            r3.mMaximumVelocity = r1
            r1 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 * r0
            int r1 = (int) r1
            r3.mCloseEnough = r1
            r1 = 1103626240(0x41c80000, float:25.0)
            float r1 = r1 * r0
            int r1 = (int) r1
            r3.mFlingDistance = r1
            r1 = 1098907648(0x41800000, float:16.0)
            float r0 = r0 * r1
            int r0 = (int) r0
            r3.mDefaultGutterSize = r0
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$4 r0 = new com.umeng.socialize.shareboard.widgets.SocializeViewPager$4
            r0.<init>(r3)
            com.umeng.socialize.shareboard.widgets.ViewCompat.setOnApplyWindowInsetsListener(r3, r0)
            return
    }

    private boolean isGutterDrag(float r4, float r5) {
            r3 = this;
            int r0 = r3.mGutterSize
            float r0 = (float) r0
            r1 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto Lc
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L1c
        Lc:
            int r0 = r3.getWidth()
            int r2 = r3.mGutterSize
            int r0 = r0 - r2
            float r0 = (float) r0
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 <= 0) goto L1e
            int r4 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r4 >= 0) goto L1e
        L1c:
            r4 = 1
            return r4
        L1e:
            r4 = 0
            return r4
    }

    private void onSecondaryPointerUp(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = com.umeng.socialize.shareboard.widgets.MotionEventCompat.getActionIndex(r4)
            int r1 = r4.getPointerId(r0)
            int r2 = r3.mActivePointerId
            if (r1 != r2) goto L24
            if (r0 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            float r1 = r4.getX(r0)
            r3.mLastMotionX = r1
            int r4 = r4.getPointerId(r0)
            r3.mActivePointerId = r4
            android.view.VelocityTracker r4 = r3.mVelocityTracker
            if (r4 == 0) goto L24
            r4.clear()
        L24:
            return
    }

    private boolean pageScrolled(int r6) {
            r5 = this;
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r0 = r5.mItems
            int r0 = r0.size()
            java.lang.String r1 = "onPageScrolled did not call superclass implementation"
            r2 = 0
            if (r0 != 0) goto L21
            boolean r6 = r5.mFirstLayout
            if (r6 == 0) goto L10
            return r2
        L10:
            r5.mCalledSuper = r2
            r6 = 0
            r5.onPageScrolled(r2, r6, r2)
            boolean r6 = r5.mCalledSuper
            if (r6 == 0) goto L1b
            return r2
        L1b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>(r1)
            throw r6
        L21:
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo r0 = r5.infoForCurrentScrollPosition()
            int r3 = r5.getClientWidth()
            int r4 = r0.position
            float r6 = (float) r6
            float r3 = (float) r3
            float r6 = r6 / r3
            float r0 = r0.offset
            float r6 = r6 - r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r6 = r6 / r0
            float r3 = r3 * r6
            int r0 = (int) r3
            r5.mCalledSuper = r2
            r5.onPageScrolled(r4, r6, r0)
            boolean r6 = r5.mCalledSuper
            if (r6 == 0) goto L42
            r6 = 1
            return r6
        L42:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>(r1)
            throw r6
    }

    private boolean performDrag(float r10) {
            r9 = this;
            float r0 = r9.mLastMotionX
            float r0 = r0 - r10
            r9.mLastMotionX = r10
            int r10 = r9.getScrollX()
            float r10 = (float) r10
            float r10 = r10 + r0
            int r0 = r9.getClientWidth()
            float r0 = (float) r0
            float r1 = r9.mFirstOffset
            float r1 = r1 * r0
            float r2 = r9.mLastOffset
            float r2 = r2 * r0
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r3 = r9.mItems
            r4 = 0
            java.lang.Object r3 = r3.get(r4)
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo r3 = (com.umeng.socialize.shareboard.widgets.SocializeViewPager.ItemInfo) r3
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r5 = r9.mItems
            int r6 = r5.size()
            r7 = 1
            int r6 = r6 - r7
            java.lang.Object r5 = r5.get(r6)
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo r5 = (com.umeng.socialize.shareboard.widgets.SocializeViewPager.ItemInfo) r5
            int r6 = r3.position
            if (r6 == 0) goto L39
            float r1 = r3.offset
            float r1 = r1 * r0
            r3 = 0
            goto L3a
        L39:
            r3 = 1
        L3a:
            int r6 = r5.position
            com.umeng.socialize.shareboard.widgets.SocializePagerAdapter r8 = r9.mAdapter
            int r8 = r8.getCount()
            int r8 = r8 - r7
            if (r6 == r8) goto L4a
            float r2 = r5.offset
            float r2 = r2 * r0
            r7 = 0
        L4a:
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 >= 0) goto L51
            r10 = r1
            r4 = r3
            goto L57
        L51:
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 <= 0) goto L57
            r10 = r2
            r4 = r7
        L57:
            float r0 = r9.mLastMotionX
            int r1 = (int) r10
            float r2 = (float) r1
            float r10 = r10 - r2
            float r0 = r0 + r10
            r9.mLastMotionX = r0
            int r10 = r9.getScrollY()
            r9.scrollTo(r1, r10)
            r9.pageScrolled(r1)
            return r4
    }

    private void populate() {
            r1 = this;
            int r0 = r1.mCurPosition
            r1.populate(r0)
            return
    }

    private void populate(int r19) {
            r18 = this;
            r0 = r18
            r1 = r19
            int r2 = r0.mCurPosition
            if (r2 == r1) goto Lf
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo r2 = r0.infoForPosition(r2)
            r0.mCurPosition = r1
            goto L10
        Lf:
            r2 = 0
        L10:
            com.umeng.socialize.shareboard.widgets.SocializePagerAdapter r1 = r0.mAdapter
            if (r1 != 0) goto L16
            goto L1fd
        L16:
            boolean r1 = r0.mPopulatePending
            if (r1 == 0) goto L1c
            goto L1fd
        L1c:
            android.os.IBinder r1 = r0.getWindowToken()
            if (r1 != 0) goto L24
            goto L1fd
        L24:
            com.umeng.socialize.shareboard.widgets.SocializePagerAdapter r1 = r0.mAdapter
            r1.startUpdate(r0)
            int r1 = r0.mOffscreenPageLimit
            int r4 = r0.mCurPosition
            int r4 = r4 - r1
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
            com.umeng.socialize.shareboard.widgets.SocializePagerAdapter r6 = r0.mAdapter
            int r6 = r6.getCount()
            int r7 = r6 + (-1)
            int r8 = r0.mCurPosition
            int r8 = r8 + r1
            int r1 = java.lang.Math.min(r7, r8)
            int r7 = r0.mExpectedAdapterCount
            if (r6 != r7) goto L1fe
            r7 = 0
        L47:
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r8 = r0.mItems
            int r8 = r8.size()
            if (r7 >= r8) goto L63
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r8 = r0.mItems
            java.lang.Object r8 = r8.get(r7)
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo r8 = (com.umeng.socialize.shareboard.widgets.SocializeViewPager.ItemInfo) r8
            int r9 = r8.position
            int r10 = r0.mCurPosition
            if (r9 < r10) goto L60
            if (r9 != r10) goto L63
            goto L64
        L60:
            int r7 = r7 + 1
            goto L47
        L63:
            r8 = 0
        L64:
            if (r8 != 0) goto L6e
            if (r6 <= 0) goto L6e
            int r8 = r0.mCurPosition
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo r8 = r0.addNewItem(r8, r7)
        L6e:
            r9 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L184
            int r11 = r7 + (-1)
            if (r11 < 0) goto L80
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r12 = r0.mItems
            java.lang.Object r12 = r12.get(r11)
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo r12 = (com.umeng.socialize.shareboard.widgets.SocializeViewPager.ItemInfo) r12
            goto L81
        L80:
            r12 = 0
        L81:
            int r13 = r0.getClientWidth()
            if (r13 > 0) goto L89
            r14 = 0
            goto L91
        L89:
            int r14 = r0.getPaddingLeft()
            float r14 = (float) r14
            float r15 = (float) r13
            float r14 = r14 / r15
            float r14 = r14 + r10
        L91:
            int r15 = r0.mCurPosition
            int r15 = r15 + (-1)
            r16 = 0
        L97:
            if (r15 < 0) goto Lf4
            int r17 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r17 < 0) goto Lc8
            if (r15 >= r4) goto Lc8
            if (r12 != 0) goto La2
            goto Lf4
        La2:
            int r3 = r12.position
            if (r15 != r3) goto Lf1
            boolean r3 = r12.scrolling
            if (r3 != 0) goto Lf1
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r3 = r0.mItems
            r3.remove(r11)
            com.umeng.socialize.shareboard.widgets.SocializePagerAdapter r3 = r0.mAdapter
            java.lang.Object r12 = r12.object
            r3.destroyItem(r0, r15, r12)
            int r11 = r11 + (-1)
            int r7 = r7 + (-1)
            if (r11 < 0) goto Lc5
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r3 = r0.mItems
            java.lang.Object r3 = r3.get(r11)
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo r3 = (com.umeng.socialize.shareboard.widgets.SocializeViewPager.ItemInfo) r3
            goto Lc6
        Lc5:
            r3 = 0
        Lc6:
            r12 = r3
            goto Lf1
        Lc8:
            if (r12 == 0) goto Ldd
            int r3 = r12.position
            if (r15 != r3) goto Ldd
            float r16 = r16 + r10
            int r11 = r11 + (-1)
            if (r11 < 0) goto Lc5
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r3 = r0.mItems
            java.lang.Object r3 = r3.get(r11)
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo r3 = (com.umeng.socialize.shareboard.widgets.SocializeViewPager.ItemInfo) r3
            goto Lc6
        Ldd:
            int r3 = r11 + 1
            r0.addNewItem(r15, r3)
            float r16 = r16 + r10
            int r7 = r7 + 1
            if (r11 < 0) goto Lc5
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r3 = r0.mItems
            java.lang.Object r3 = r3.get(r11)
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo r3 = (com.umeng.socialize.shareboard.widgets.SocializeViewPager.ItemInfo) r3
            goto Lc6
        Lf1:
            int r15 = r15 + (-1)
            goto L97
        Lf4:
            int r3 = r7 + 1
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r4 = r0.mItems
            int r4 = r4.size()
            if (r3 >= r4) goto L107
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r4 = r0.mItems
            java.lang.Object r4 = r4.get(r3)
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo r4 = (com.umeng.socialize.shareboard.widgets.SocializeViewPager.ItemInfo) r4
            goto L108
        L107:
            r4 = 0
        L108:
            if (r13 > 0) goto L10c
            r11 = 0
            goto L116
        L10c:
            int r11 = r0.getPaddingRight()
            float r11 = (float) r11
            float r12 = (float) r13
            float r11 = r11 / r12
            r12 = 1073741824(0x40000000, float:2.0)
            float r11 = r11 + r12
        L116:
            int r12 = r0.mCurPosition
            int r12 = r12 + 1
            r13 = 1065353216(0x3f800000, float:1.0)
        L11c:
            if (r12 >= r6) goto L181
            int r14 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r14 < 0) goto L14e
            if (r12 <= r1) goto L14e
            if (r4 != 0) goto L127
            goto L181
        L127:
            int r14 = r4.position
            if (r12 != r14) goto L17e
            boolean r14 = r4.scrolling
            if (r14 != 0) goto L17e
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r14 = r0.mItems
            r14.remove(r3)
            com.umeng.socialize.shareboard.widgets.SocializePagerAdapter r14 = r0.mAdapter
            java.lang.Object r4 = r4.object
            r14.destroyItem(r0, r12, r4)
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r4 = r0.mItems
            int r4 = r4.size()
            if (r3 >= r4) goto L14c
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r4 = r0.mItems
            java.lang.Object r4 = r4.get(r3)
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo r4 = (com.umeng.socialize.shareboard.widgets.SocializeViewPager.ItemInfo) r4
            goto L17e
        L14c:
            r4 = 0
            goto L17e
        L14e:
            if (r4 == 0) goto L168
            int r4 = r4.position
            if (r12 != r4) goto L168
            float r13 = r13 + r10
            int r3 = r3 + 1
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r4 = r0.mItems
            int r4 = r4.size()
            if (r3 >= r4) goto L14c
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r4 = r0.mItems
            java.lang.Object r4 = r4.get(r3)
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo r4 = (com.umeng.socialize.shareboard.widgets.SocializeViewPager.ItemInfo) r4
            goto L17e
        L168:
            r0.addNewItem(r12, r3)
            int r3 = r3 + 1
            float r13 = r13 + r10
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r4 = r0.mItems
            int r4 = r4.size()
            if (r3 >= r4) goto L14c
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r4 = r0.mItems
            java.lang.Object r4 = r4.get(r3)
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo r4 = (com.umeng.socialize.shareboard.widgets.SocializeViewPager.ItemInfo) r4
        L17e:
            int r12 = r12 + 1
            goto L11c
        L181:
            r0.calculatePageOffsets(r8, r7, r2)
        L184:
            com.umeng.socialize.shareboard.widgets.SocializePagerAdapter r1 = r0.mAdapter
            int r2 = r0.mCurPosition
            if (r8 == 0) goto L18d
            java.lang.Object r3 = r8.object
            goto L18e
        L18d:
            r3 = 0
        L18e:
            r1.setPrimaryItem(r0, r2, r3)
            com.umeng.socialize.shareboard.widgets.SocializePagerAdapter r1 = r0.mAdapter
            r1.finishUpdate(r0)
            int r1 = r0.getChildCount()
            r2 = 0
        L19b:
            if (r2 >= r1) goto L1c2
            android.view.View r3 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$LayoutParams r4 = (com.umeng.socialize.shareboard.widgets.SocializeViewPager.LayoutParams) r4
            r4.childIndex = r2
            boolean r6 = r4.isDecor
            if (r6 != 0) goto L1bf
            float r6 = r4.widthFactor
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 != 0) goto L1bf
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo r3 = r0.infoForChild(r3)
            if (r3 == 0) goto L1bf
            r4.widthFactor = r10
            int r3 = r3.position
            r4.position = r3
        L1bf:
            int r2 = r2 + 1
            goto L19b
        L1c2:
            boolean r1 = r0.hasFocus()
            if (r1 == 0) goto L1fd
            android.view.View r1 = r0.findFocus()
            if (r1 == 0) goto L1d3
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo r3 = r0.infoForAnyChild(r1)
            goto L1d4
        L1d3:
            r3 = 0
        L1d4:
            if (r3 == 0) goto L1dc
            int r1 = r3.position
            int r2 = r0.mCurPosition
            if (r1 == r2) goto L1fd
        L1dc:
            int r1 = r0.getChildCount()
            if (r5 >= r1) goto L1fd
            android.view.View r1 = r0.getChildAt(r5)
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo r2 = r0.infoForChild(r1)
            if (r2 == 0) goto L1fa
            int r2 = r2.position
            int r3 = r0.mCurPosition
            if (r2 != r3) goto L1fa
            r2 = 2
            boolean r1 = r1.requestFocus(r2)
            if (r1 == 0) goto L1fa
            goto L1fd
        L1fa:
            int r5 = r5 + 1
            goto L1dc
        L1fd:
            return
        L1fe:
            android.content.res.Resources r1 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L20b
            int r2 = r0.getId()     // Catch: android.content.res.Resources.NotFoundException -> L20b
            java.lang.String r1 = r1.getResourceName(r2)     // Catch: android.content.res.Resources.NotFoundException -> L20b
            goto L213
        L20b:
            int r1 = r0.getId()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
        L213:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "The application's SocializePagerAdapter changed the adapter's contents without calling SocializePagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            r3.append(r4)
            int r4 = r0.mExpectedAdapterCount
            r3.append(r4)
            java.lang.String r4 = ", found: "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r4 = " Pager id: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " Pager class: "
            r3.append(r1)
            java.lang.Class r1 = r0.getClass()
            r3.append(r1)
            java.lang.String r1 = " Problematic adapter: "
            r3.append(r1)
            com.umeng.socialize.shareboard.widgets.SocializePagerAdapter r1 = r0.mAdapter
            java.lang.Class r1 = r1.getClass()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
    }

    private void recomputeScrollPosition(int r2, int r3, int r4, int r5) {
            r1 = this;
            if (r3 <= 0) goto L4b
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r0 = r1.mItems
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L4b
            android.widget.Scroller r0 = r1.mScroller
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L22
            android.widget.Scroller r2 = r1.mScroller
            int r3 = r1.getCurrentItem()
            int r4 = r1.getClientWidth()
            int r3 = r3 * r4
            r2.setFinalX(r3)
            return
        L22:
            int r0 = r1.getPaddingLeft()
            int r2 = r2 - r0
            int r0 = r1.getPaddingRight()
            int r2 = r2 - r0
            int r2 = r2 + r4
            int r4 = r1.getPaddingLeft()
            int r3 = r3 - r4
            int r4 = r1.getPaddingRight()
            int r3 = r3 - r4
            int r3 = r3 + r5
            int r4 = r1.getScrollX()
            float r4 = (float) r4
            float r3 = (float) r3
            float r4 = r4 / r3
            float r2 = (float) r2
            float r4 = r4 * r2
            int r2 = (int) r4
            int r3 = r1.getScrollY()
            r1.scrollTo(r2, r3)
            return
        L4b:
            int r3 = r1.mCurPosition
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo r3 = r1.infoForPosition(r3)
            if (r3 == 0) goto L5c
            float r3 = r3.offset
            float r4 = r1.mLastOffset
            float r3 = java.lang.Math.min(r3, r4)
            goto L5d
        L5c:
            r3 = 0
        L5d:
            int r4 = r1.getPaddingLeft()
            int r2 = r2 - r4
            int r4 = r1.getPaddingRight()
            int r2 = r2 - r4
            float r2 = (float) r2
            float r3 = r3 * r2
            int r2 = (int) r3
            int r3 = r1.getScrollX()
            if (r2 == r3) goto L7c
            r3 = 0
            r1.completeScroll(r3)
            int r3 = r1.getScrollY()
            r1.scrollTo(r2, r3)
        L7c:
            return
    }

    private void requestParentDisallowInterceptTouchEvent(boolean r2) {
            r1 = this;
            android.view.ViewParent r0 = r1.getParent()
            if (r0 == 0) goto L9
            r0.requestDisallowInterceptTouchEvent(r2)
        L9:
            return
    }

    private boolean resetTouch() {
            r1 = this;
            r0 = -1
            r1.mActivePointerId = r0
            r1.endDrag()
            r0 = 1
            return r0
    }

    private void scrollToItem(int r6, boolean r7, int r8, boolean r9) {
            r5 = this;
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo r0 = r5.infoForPosition(r6)
            r1 = 0
            if (r0 == 0) goto L1e
            int r2 = r5.getClientWidth()
            float r2 = (float) r2
            float r3 = r5.mFirstOffset
            float r0 = r0.offset
            float r4 = r5.mLastOffset
            float r0 = java.lang.Math.min(r0, r4)
            float r0 = java.lang.Math.max(r3, r0)
            float r2 = r2 * r0
            int r0 = (int) r2
            goto L1f
        L1e:
            r0 = 0
        L1f:
            if (r7 == 0) goto L2a
            r5.smoothScrollTo(r0, r1, r8)
            if (r9 == 0) goto L29
            r5.dispatchOnPageSelected(r6)
        L29:
            return
        L2a:
            if (r9 == 0) goto L2f
            r5.dispatchOnPageSelected(r6)
        L2f:
            r5.completeScroll(r1)
            r5.scrollTo(r0, r1)
            r5.pageScrolled(r0)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(java.util.ArrayList<android.view.View> r7, int r8, int r9) {
            r6 = this;
            int r0 = r7.size()
            int r1 = r6.getDescendantFocusability()
            r2 = 393216(0x60000, float:5.51013E-40)
            if (r1 == r2) goto L2f
            r2 = 0
        Ld:
            int r3 = r6.getChildCount()
            if (r2 >= r3) goto L2f
            android.view.View r3 = r6.getChildAt(r2)
            int r4 = r3.getVisibility()
            if (r4 != 0) goto L2c
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo r4 = r6.infoForChild(r3)
            if (r4 == 0) goto L2c
            int r4 = r4.position
            int r5 = r6.mCurPosition
            if (r4 != r5) goto L2c
            r3.addFocusables(r7, r8, r9)
        L2c:
            int r2 = r2 + 1
            goto Ld
        L2f:
            r8 = 262144(0x40000, float:3.67342E-40)
            if (r1 != r8) goto L39
            int r8 = r7.size()
            if (r0 != r8) goto L50
        L39:
            boolean r8 = r6.isFocusable()
            if (r8 != 0) goto L40
            goto L50
        L40:
            r8 = 1
            r9 = r9 & r8
            if (r9 != r8) goto L51
            boolean r8 = r6.isInTouchMode()
            if (r8 == 0) goto L51
            boolean r8 = r6.isFocusableInTouchMode()
            if (r8 != 0) goto L51
        L50:
            return
        L51:
            r7.add(r6)
            return
    }

    com.umeng.socialize.shareboard.widgets.SocializeViewPager.ItemInfo addNewItem(int r3, int r4) {
            r2 = this;
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo r0 = new com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo
            r0.<init>()
            r0.position = r3
            com.umeng.socialize.shareboard.widgets.SocializePagerAdapter r1 = r2.mAdapter
            java.lang.Object r3 = r1.instantiateItem(r2, r3)
            r0.object = r3
            if (r4 < 0) goto L20
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r3 = r2.mItems
            int r3 = r3.size()
            if (r4 < r3) goto L1a
            goto L20
        L1a:
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r3 = r2.mItems
            r3.add(r4, r0)
            return r0
        L20:
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r3 = r2.mItems
            r3.add(r0)
            return r0
    }

    public void addOnPageChangeListener(com.umeng.socialize.shareboard.widgets.SocializeViewPager.OnPageChangeListener r2) {
            r1 = this;
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$OnPageChangeListener> r0 = r1.mOnPageChangeListeners
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mOnPageChangeListeners = r0
        Lb:
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$OnPageChangeListener> r0 = r1.mOnPageChangeListeners
            r0.add(r2)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(java.util.ArrayList<android.view.View> r5) {
            r4 = this;
            r0 = 0
        L1:
            int r1 = r4.getChildCount()
            if (r0 >= r1) goto L23
            android.view.View r1 = r4.getChildAt(r0)
            int r2 = r1.getVisibility()
            if (r2 != 0) goto L20
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo r2 = r4.infoForChild(r1)
            if (r2 == 0) goto L20
            int r2 = r2.position
            int r3 = r4.mCurPosition
            if (r2 != r3) goto L20
            r1.addTouchables(r5)
        L20:
            int r0 = r0 + 1
            goto L1
        L23:
            return
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View r4, int r5, android.view.ViewGroup.LayoutParams r6) {
            r3 = this;
            boolean r0 = r3.checkLayoutParams(r6)
            if (r0 != 0) goto La
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$LayoutParams r6 = r3.generateLayoutParams(r6)
        La:
            r0 = r6
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$LayoutParams r0 = (com.umeng.socialize.shareboard.widgets.SocializeViewPager.LayoutParams) r0
            boolean r1 = r0.isDecor
            r0.isDecor = r1
            boolean r2 = r3.mInLayout
            if (r2 == 0) goto L26
            if (r1 != 0) goto L1e
            r1 = 1
            r0.needsMeasure = r1
            r3.addViewInLayout(r4, r5, r6)
            return
        L1e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Cannot add pager decor view during layout"
            r4.<init>(r5)
            throw r4
        L26:
            super.addView(r4, r5, r6)
            return
    }

    public boolean arrowScroll(int r5) {
            r4 = this;
            android.view.View r0 = r4.findFocus()
            r1 = 0
            if (r0 != r4) goto L9
        L7:
            r0 = r1
            goto L48
        L9:
            if (r0 == 0) goto L48
            android.view.ViewParent r2 = r0.getParent()
        Lf:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L1b
            if (r2 != r4) goto L16
            goto L48
        L16:
            android.view.ViewParent r2 = r2.getParent()
            goto Lf
        L1b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
        L2f:
            boolean r3 = r0 instanceof android.view.ViewGroup
            if (r3 == 0) goto L7
            java.lang.String r3 = " => "
            r2.append(r3)
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
            goto L2f
        L48:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r4, r0, r5)
            r2 = 66
            r3 = 17
            if (r1 == 0) goto L98
            if (r1 == r0) goto L98
            if (r5 != r3) goto L78
            android.graphics.Rect r2 = r4.mTempRect
            android.graphics.Rect r2 = r4.getChildRectInPagerCoordinates(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r4.mTempRect
            android.graphics.Rect r3 = r4.getChildRectInPagerCoordinates(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto L73
            if (r2 < r3) goto L73
            boolean r0 = r4.pageLeft()
            goto Laf
        L73:
            boolean r0 = r1.requestFocus()
            goto Laf
        L78:
            if (r5 != r2) goto La4
            android.graphics.Rect r2 = r4.mTempRect
            android.graphics.Rect r2 = r4.getChildRectInPagerCoordinates(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r4.mTempRect
            android.graphics.Rect r3 = r4.getChildRectInPagerCoordinates(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto L93
            if (r2 > r3) goto L93
            boolean r0 = r4.pageRight()
            goto Laf
        L93:
            boolean r0 = r1.requestFocus()
            goto Laf
        L98:
            if (r5 == r3) goto Lab
            r0 = 1
            if (r5 != r0) goto L9e
            goto Lab
        L9e:
            if (r5 == r2) goto La6
            r0 = 2
            if (r5 != r0) goto La4
            goto La6
        La4:
            r0 = 0
            goto Laf
        La6:
            boolean r0 = r4.pageRight()
            goto Laf
        Lab:
            boolean r0 = r4.pageLeft()
        Laf:
            if (r0 == 0) goto Lb8
            int r5 = android.view.SoundEffectConstants.getContantForFocusDirection(r5)
            r4.playSoundEffect(r5)
        Lb8:
            return r0
    }

    protected boolean canScroll(android.view.View r12, boolean r13, int r14, int r15, int r16) {
            r11 = this;
            boolean r0 = r12 instanceof android.view.ViewGroup
            r1 = 1
            if (r0 == 0) goto L50
            r0 = r12
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r2 = r12.getScrollX()
            int r3 = r12.getScrollY()
            int r4 = r0.getChildCount()
            int r4 = r4 - r1
        L15:
            if (r4 < 0) goto L50
            android.view.View r6 = r0.getChildAt(r4)
            int r5 = r15 + r2
            int r7 = r6.getLeft()
            if (r5 < r7) goto L4d
            int r7 = r6.getRight()
            if (r5 >= r7) goto L4d
            int r7 = r16 + r3
            int r8 = r6.getTop()
            if (r7 < r8) goto L4d
            int r8 = r6.getBottom()
            if (r7 >= r8) goto L4d
            int r8 = r6.getLeft()
            int r9 = r5 - r8
            int r5 = r6.getTop()
            int r10 = r7 - r5
            r7 = 1
            r5 = r11
            r8 = r14
            boolean r6 = r5.canScroll(r6, r7, r8, r9, r10)
            if (r6 == 0) goto L4d
            return r1
        L4d:
            int r4 = r4 + (-1)
            goto L15
        L50:
            if (r13 == 0) goto L5a
            int r13 = -r14
            boolean r12 = com.umeng.socialize.shareboard.widgets.ViewCompat.canScrollHorizontally(r12, r13)
            if (r12 == 0) goto L5a
            return r1
        L5a:
            r12 = 0
            return r12
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.umeng.socialize.shareboard.widgets.SocializeViewPager.LayoutParams
            if (r0 == 0) goto Lc
            boolean r2 = super.checkLayoutParams(r2)
            if (r2 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            r2 = 0
            return r2
    }

    public void clearOnPageChangeListeners() {
            r1 = this;
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$OnPageChangeListener> r0 = r1.mOnPageChangeListeners
            if (r0 == 0) goto L7
            r0.clear()
        L7:
            return
    }

    @Override // android.view.View
    public void computeScroll() {
            r4 = this;
            r0 = 1
            r4.mIsScrollStarted = r0
            android.widget.Scroller r1 = r4.mScroller
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto L41
            android.widget.Scroller r1 = r4.mScroller
            boolean r1 = r1.computeScrollOffset()
            if (r1 == 0) goto L41
            int r0 = r4.getScrollX()
            int r1 = r4.getScrollY()
            android.widget.Scroller r2 = r4.mScroller
            int r2 = r2.getCurrX()
            android.widget.Scroller r3 = r4.mScroller
            int r3 = r3.getCurrY()
            if (r0 != r2) goto L2b
            if (r1 == r3) goto L3d
        L2b:
            r4.scrollTo(r2, r3)
            boolean r0 = r4.pageScrolled(r2)
            if (r0 != 0) goto L3d
            android.widget.Scroller r0 = r4.mScroller
            r0.abortAnimation()
            r0 = 0
            r4.scrollTo(r0, r3)
        L3d:
            com.umeng.socialize.shareboard.widgets.ViewCompat.postInvalidateOnAnimation(r4)
            return
        L41:
            r4.completeScroll(r0)
            return
    }

    void dataSetChanged() {
            r10 = this;
            com.umeng.socialize.shareboard.widgets.SocializePagerAdapter r0 = r10.mAdapter
            int r0 = r0.getCount()
            r10.mExpectedAdapterCount = r0
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r1 = r10.mItems
            int r1 = r1.size()
            int r2 = r10.mOffscreenPageLimit
            int r2 = r2 * 2
            r3 = 1
            int r2 = r2 + r3
            r4 = 0
            if (r1 >= r2) goto L21
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r1 = r10.mItems
            int r1 = r1.size()
            if (r1 >= r0) goto L21
            r1 = 1
            goto L22
        L21:
            r1 = 0
        L22:
            int r2 = r10.mCurPosition
            r5 = 0
            r6 = 0
        L26:
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r7 = r10.mItems
            int r7 = r7.size()
            if (r5 >= r7) goto L7e
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r7 = r10.mItems
            java.lang.Object r7 = r7.get(r5)
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo r7 = (com.umeng.socialize.shareboard.widgets.SocializeViewPager.ItemInfo) r7
            com.umeng.socialize.shareboard.widgets.SocializePagerAdapter r8 = r10.mAdapter
            java.lang.Object r9 = r7.object
            int r8 = r8.getItemPosition(r9)
            r9 = -1
            if (r8 != r9) goto L42
            goto L7c
        L42:
            r9 = -2
            if (r8 != r9) goto L70
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r1 = r10.mItems
            r1.remove(r5)
            int r5 = r5 + (-1)
            if (r6 != 0) goto L54
            com.umeng.socialize.shareboard.widgets.SocializePagerAdapter r1 = r10.mAdapter
            r1.startUpdate(r10)
            r6 = 1
        L54:
            com.umeng.socialize.shareboard.widgets.SocializePagerAdapter r1 = r10.mAdapter
            int r8 = r7.position
            java.lang.Object r9 = r7.object
            r1.destroyItem(r10, r8, r9)
            int r1 = r10.mCurPosition
            int r7 = r7.position
            if (r1 != r7) goto L6e
            int r2 = r0 + (-1)
            int r1 = java.lang.Math.min(r1, r2)
            int r1 = java.lang.Math.max(r4, r1)
            r2 = r1
        L6e:
            r1 = 1
            goto L7c
        L70:
            int r9 = r7.position
            if (r9 == r8) goto L7c
            int r1 = r10.mCurPosition
            if (r9 != r1) goto L79
            r2 = r8
        L79:
            r7.position = r8
            goto L6e
        L7c:
            int r5 = r5 + r3
            goto L26
        L7e:
            if (r6 == 0) goto L85
            com.umeng.socialize.shareboard.widgets.SocializePagerAdapter r0 = r10.mAdapter
            r0.finishUpdate(r10)
        L85:
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r0 = r10.mItems
            java.util.Comparator<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r5 = com.umeng.socialize.shareboard.widgets.SocializeViewPager.COMPARATOR
            java.util.Collections.sort(r0, r5)
            if (r1 == 0) goto L94
            r10.setCurrentItemInternal(r2, r4, r3)
            r10.requestLayout()
        L94:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent r2) {
            r1 = this;
            boolean r0 = super.dispatchKeyEvent(r2)
            if (r0 != 0) goto Lf
            boolean r2 = r1.executeKeyEvent(r2)
            if (r2 == 0) goto Ld
            goto Lf
        Ld:
            r2 = 0
            return r2
        Lf:
            r2 = 1
            return r2
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent r7) {
            r6 = this;
            int r0 = r7.getEventType()
            r1 = 4096(0x1000, float:5.74E-42)
            if (r0 != r1) goto Ld
            boolean r7 = super.dispatchPopulateAccessibilityEvent(r7)
            return r7
        Ld:
            int r0 = r6.getChildCount()
            r1 = 0
            r2 = 0
        L13:
            if (r2 >= r0) goto L36
            android.view.View r3 = r6.getChildAt(r2)
            int r4 = r3.getVisibility()
            if (r4 != 0) goto L33
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo r4 = r6.infoForChild(r3)
            if (r4 == 0) goto L33
            int r4 = r4.position
            int r5 = r6.mCurPosition
            if (r4 != r5) goto L33
            boolean r3 = r3.dispatchPopulateAccessibilityEvent(r7)
            if (r3 == 0) goto L33
            r7 = 1
            return r7
        L33:
            int r2 = r2 + 1
            goto L13
        L36:
            return r1
    }

    float distanceInfluenceForSnapDuration(float r5) {
            r4 = this;
            r0 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 - r0
            double r0 = (double) r5
            r2 = 4602160705557665991(0x3fde28c7460698c7, double:0.4712389167638204)
            double r0 = r0 * r2
            float r5 = (float) r0
            double r0 = (double) r5
            double r0 = java.lang.Math.sin(r0)
            float r5 = (float) r0
            return r5
    }

    public boolean executeKeyEvent(android.view.KeyEvent r3) {
            r2 = this;
            int r0 = r3.getAction()
            if (r0 != 0) goto L3d
            int r0 = r3.getKeyCode()
            r1 = 21
            if (r0 == r1) goto L36
            r1 = 22
            if (r0 == r1) goto L2f
            r1 = 61
            if (r0 == r1) goto L17
            goto L3d
        L17:
            boolean r0 = com.umeng.socialize.shareboard.widgets.KeyEventCompat.hasNoModifiers(r3)
            if (r0 == 0) goto L23
            r3 = 2
            boolean r3 = r2.arrowScroll(r3)
            return r3
        L23:
            r0 = 1
            boolean r3 = com.umeng.socialize.shareboard.widgets.KeyEventCompat.hasModifiers(r3, r0)
            if (r3 == 0) goto L3d
            boolean r3 = r2.arrowScroll(r0)
            return r3
        L2f:
            r3 = 66
            boolean r3 = r2.arrowScroll(r3)
            return r3
        L36:
            r3 = 17
            boolean r3 = r2.arrowScroll(r3)
            return r3
        L3d:
            r3 = 0
            return r3
    }

    @Override // android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$LayoutParams r0 = r1.generateDefaultLayoutParams()
            return r0
    }

    @Override // android.view.ViewGroup
    protected com.umeng.socialize.shareboard.widgets.SocializeViewPager.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$LayoutParams r0 = new com.umeng.socialize.shareboard.widgets.SocializeViewPager$LayoutParams
            r0.<init>()
            return r0
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$LayoutParams r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$LayoutParams r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // android.view.ViewGroup
    public com.umeng.socialize.shareboard.widgets.SocializeViewPager.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$LayoutParams r0 = new com.umeng.socialize.shareboard.widgets.SocializeViewPager$LayoutParams
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // android.view.ViewGroup
    protected com.umeng.socialize.shareboard.widgets.SocializeViewPager.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$LayoutParams r1 = r0.generateDefaultLayoutParams()
            return r1
    }

    public int getCurrentItem() {
            r1 = this;
            int r0 = r1.mCurPosition
            return r0
    }

    com.umeng.socialize.shareboard.widgets.SocializeViewPager.ItemInfo infoForAnyChild(android.view.View r2) {
            r1 = this;
        L0:
            android.view.ViewParent r0 = r2.getParent()
            if (r0 == r1) goto L13
            if (r0 == 0) goto L11
            boolean r2 = r0 instanceof android.view.View
            if (r2 != 0) goto Ld
            goto L11
        Ld:
            r2 = r0
            android.view.View r2 = (android.view.View) r2
            goto L0
        L11:
            r2 = 0
            return r2
        L13:
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo r2 = r1.infoForChild(r2)
            return r2
    }

    com.umeng.socialize.shareboard.widgets.SocializeViewPager.ItemInfo infoForChild(android.view.View r5) {
            r4 = this;
            r0 = 0
        L1:
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r1 = r4.mItems
            int r1 = r1.size()
            if (r0 >= r1) goto L1f
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r1 = r4.mItems
            java.lang.Object r1 = r1.get(r0)
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo r1 = (com.umeng.socialize.shareboard.widgets.SocializeViewPager.ItemInfo) r1
            com.umeng.socialize.shareboard.widgets.SocializePagerAdapter r2 = r4.mAdapter
            java.lang.Object r3 = r1.object
            boolean r2 = r2.isViewFromObject(r5, r3)
            if (r2 == 0) goto L1c
            return r1
        L1c:
            int r0 = r0 + 1
            goto L1
        L1f:
            r5 = 0
            return r5
    }

    com.umeng.socialize.shareboard.widgets.SocializeViewPager.ItemInfo infoForPosition(int r4) {
            r3 = this;
            r0 = 0
        L1:
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r1 = r3.mItems
            int r1 = r1.size()
            if (r0 >= r1) goto L19
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r1 = r3.mItems
            java.lang.Object r1 = r1.get(r0)
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo r1 = (com.umeng.socialize.shareboard.widgets.SocializeViewPager.ItemInfo) r1
            int r2 = r1.position
            if (r2 != r4) goto L16
            return r1
        L16:
            int r0 = r0 + 1
            goto L1
        L19:
            r4 = 0
            return r4
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            r0 = 1
            r1.mFirstLayout = r0
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            java.lang.Runnable r0 = r1.mEndScrollRunnable
            r1.removeCallbacks(r0)
            android.widget.Scroller r0 = r1.mScroller
            if (r0 == 0) goto L14
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L14
            android.widget.Scroller r0 = r1.mScroller
            r0.abortAnimation()
        L14:
            super.onDetachedFromWindow()
            return
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent r14) {
            r13 = this;
            int r1 = r14.getAction()
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 3
            r6 = 0
            if (r1 == r2) goto L10a
            r7 = 1
            if (r1 != r7) goto Lf
            goto L10a
        Lf:
            if (r1 == 0) goto L1b
            boolean r2 = r13.mIsBeingDragged
            if (r2 == 0) goto L16
            return r7
        L16:
            boolean r2 = r13.mIsUnableToDrag
            if (r2 == 0) goto L1b
            return r6
        L1b:
            r2 = 2
            if (r1 == 0) goto La8
            if (r1 == r2) goto L2a
            r2 = 6
            if (r1 == r2) goto L25
            goto Lf8
        L25:
            r13.onSecondaryPointerUp(r14)
            goto Lf8
        L2a:
            int r1 = r13.mActivePointerId
            r2 = -1
            if (r1 != r2) goto L31
            goto Lf8
        L31:
            int r1 = r14.findPointerIndex(r1)
            float r8 = r14.getX(r1)
            float r2 = r13.mLastMotionX
            float r2 = r8 - r2
            float r9 = java.lang.Math.abs(r2)
            float r10 = r14.getY(r1)
            float r1 = r13.mInitialMotionY
            float r1 = r10 - r1
            float r11 = java.lang.Math.abs(r1)
            r1 = 0
            int r12 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r12 == 0) goto L6d
            float r1 = r13.mLastMotionX
            boolean r1 = r13.isGutterDrag(r1, r2)
            if (r1 != 0) goto L6d
            int r3 = (int) r2
            int r4 = (int) r8
            int r5 = (int) r10
            r2 = 0
            r1 = r13
            r0 = r13
            boolean r1 = r0.canScroll(r1, r2, r3, r4, r5)
            if (r1 == 0) goto L6d
            r13.mLastMotionX = r8
            r13.mLastMotionY = r10
            r13.mIsUnableToDrag = r7
            return r6
        L6d:
            int r1 = r13.mTouchSlop
            float r2 = (float) r1
            int r2 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r2 <= 0) goto L93
            r2 = 1056964608(0x3f000000, float:0.5)
            float r9 = r9 * r2
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 <= 0) goto L93
            r13.mIsBeingDragged = r7
            r13.requestParentDisallowInterceptTouchEvent(r7)
            r13.setScrollState(r7)
            float r1 = r13.mInitialMotionX
            int r2 = r13.mTouchSlop
            float r2 = (float) r2
            if (r12 <= 0) goto L8d
            float r1 = r1 + r2
            goto L8e
        L8d:
            float r1 = r1 - r2
        L8e:
            r13.mLastMotionX = r1
            r13.mLastMotionY = r10
            goto L9a
        L93:
            float r1 = (float) r1
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r1 <= 0) goto L9a
            r13.mIsUnableToDrag = r7
        L9a:
            boolean r1 = r13.mIsBeingDragged
            if (r1 == 0) goto Lf8
            boolean r1 = r13.performDrag(r8)
            if (r1 == 0) goto Lf8
            com.umeng.socialize.shareboard.widgets.ViewCompat.postInvalidateOnAnimation(r13)
            goto Lf8
        La8:
            float r1 = r14.getX()
            r13.mInitialMotionX = r1
            r13.mLastMotionX = r1
            float r1 = r14.getY()
            r13.mInitialMotionY = r1
            r13.mLastMotionY = r1
            int r1 = r14.getPointerId(r6)
            r13.mActivePointerId = r1
            r13.mIsUnableToDrag = r6
            r13.mIsScrollStarted = r7
            android.widget.Scroller r1 = r13.mScroller
            r1.computeScrollOffset()
            int r1 = r13.mScrollState
            if (r1 != r2) goto Lf3
            android.widget.Scroller r1 = r13.mScroller
            int r1 = r1.getFinalX()
            android.widget.Scroller r2 = r13.mScroller
            int r2 = r2.getCurrX()
            int r1 = r1 - r2
            int r1 = java.lang.Math.abs(r1)
            int r2 = r13.mCloseEnough
            if (r1 <= r2) goto Lf3
            android.widget.Scroller r1 = r13.mScroller
            r1.abortAnimation()
            r13.mPopulatePending = r6
            r13.populate()
            r13.mIsBeingDragged = r7
            r13.requestParentDisallowInterceptTouchEvent(r7)
            r13.setScrollState(r7)
            goto Lf8
        Lf3:
            r13.completeScroll(r6)
            r13.mIsBeingDragged = r6
        Lf8:
            android.view.VelocityTracker r1 = r13.mVelocityTracker
            if (r1 != 0) goto L102
            android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
            r13.mVelocityTracker = r1
        L102:
            android.view.VelocityTracker r1 = r13.mVelocityTracker
            r1.addMovement(r14)
            boolean r1 = r13.mIsBeingDragged
            return r1
        L10a:
            r13.resetTouch()
            return r6
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r9, int r10, int r11, int r12, int r13) {
            r8 = this;
            int r9 = r8.getChildCount()
            int r12 = r12 - r10
            int r13 = r13 - r11
            int r10 = r8.getPaddingLeft()
            int r11 = r8.getPaddingTop()
            int r0 = r8.getPaddingRight()
            int r1 = r8.getPaddingBottom()
            int r12 = r12 - r10
            int r12 = r12 - r0
            r0 = 0
            r2 = 0
        L1a:
            if (r2 >= r9) goto L6a
            android.view.View r3 = r8.getChildAt(r2)
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 == r5) goto L67
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$LayoutParams r4 = (com.umeng.socialize.shareboard.widgets.SocializeViewPager.LayoutParams) r4
            boolean r5 = r4.isDecor
            if (r5 != 0) goto L67
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo r5 = r8.infoForChild(r3)
            if (r5 == 0) goto L67
            float r6 = (float) r12
            float r5 = r5.offset
            float r5 = r5 * r6
            int r5 = (int) r5
            int r5 = r5 + r10
            boolean r7 = r4.needsMeasure
            if (r7 == 0) goto L5a
            r4.needsMeasure = r0
            float r4 = r4.widthFactor
            float r6 = r6 * r4
            int r4 = (int) r6
            r6 = 1073741824(0x40000000, float:2.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r6)
            int r7 = r13 - r11
            int r7 = r7 - r1
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r6)
            r3.measure(r4, r6)
        L5a:
            int r4 = r3.getMeasuredWidth()
            int r4 = r4 + r5
            int r6 = r3.getMeasuredHeight()
            int r6 = r6 + r11
            r3.layout(r5, r11, r4, r6)
        L67:
            int r2 = r2 + 1
            goto L1a
        L6a:
            boolean r9 = r8.mFirstLayout
            if (r9 == 0) goto L73
            int r9 = r8.mCurPosition
            r8.scrollToItem(r9, r0, r0, r0)
        L73:
            r8.mFirstLayout = r0
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r7, int r8) {
            r6 = this;
            r0 = 0
            int r7 = android.view.View.getDefaultSize(r0, r7)
            int r8 = android.view.View.getDefaultSize(r0, r8)
            r6.setMeasuredDimension(r7, r8)
            int r7 = r6.getMeasuredWidth()
            int r8 = r7 / 10
            int r1 = r6.mDefaultGutterSize
            int r8 = java.lang.Math.min(r8, r1)
            r6.mGutterSize = r8
            int r8 = r6.getPaddingLeft()
            int r7 = r7 - r8
            int r8 = r6.getPaddingRight()
            int r7 = r7 - r8
            int r8 = r6.getMeasuredHeight()
            int r1 = r6.getPaddingTop()
            int r8 = r8 - r1
            int r1 = r6.getPaddingBottom()
            int r8 = r8 - r1
            r1 = 1073741824(0x40000000, float:2.0)
            android.view.View.MeasureSpec.makeMeasureSpec(r7, r1)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r1)
            r2 = 1
            r6.mInLayout = r2
            r6.populate()
            r6.mInLayout = r0
            int r2 = r6.getChildCount()
        L47:
            if (r0 >= r2) goto L6b
            android.view.View r3 = r6.getChildAt(r0)
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 == r5) goto L68
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$LayoutParams r4 = (com.umeng.socialize.shareboard.widgets.SocializeViewPager.LayoutParams) r4
            if (r4 == 0) goto L61
            boolean r4 = r4.isDecor
            if (r4 != 0) goto L68
        L61:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r1)
            r3.measure(r4, r8)
        L68:
            int r0 = r0 + 1
            goto L47
        L6b:
            return
    }

    protected void onPageScrolled(int r1, float r2, int r3) {
            r0 = this;
            r0.dispatchOnPageScrolled(r1, r2, r3)
            r1 = 1
            r0.mCalledSuper = r1
            return
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int r9, android.graphics.Rect r10) {
            r8 = this;
            int r0 = r8.getChildCount()
            r1 = r9 & 2
            r2 = 0
            r3 = 1
            if (r1 == 0) goto Le
            r1 = r0
            r0 = 0
            r4 = 1
            goto L12
        Le:
            int r0 = r0 + (-1)
            r1 = -1
            r4 = -1
        L12:
            if (r0 == r1) goto L33
            android.view.View r5 = r8.getChildAt(r0)
            int r6 = r5.getVisibility()
            if (r6 != 0) goto L31
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo r6 = r8.infoForChild(r5)
            if (r6 == 0) goto L31
            int r6 = r6.position
            int r7 = r8.mCurPosition
            if (r6 != r7) goto L31
            boolean r5 = r5.requestFocus(r9, r10)
            if (r5 == 0) goto L31
            return r3
        L31:
            int r0 = r0 + r4
            goto L12
        L33:
            return r2
    }

    @Override // android.view.View
    protected void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onSizeChanged(r1, r2, r3, r4)
            if (r1 == r3) goto L9
            r2 = 0
            r0.recomputeScrollPosition(r1, r3, r2, r2)
        L9:
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r8) {
            r7 = this;
            int r0 = r8.getAction()
            r1 = 0
            if (r0 != 0) goto Le
            int r0 = r8.getEdgeFlags()
            if (r0 == 0) goto Le
            return r1
        Le:
            com.umeng.socialize.shareboard.widgets.SocializePagerAdapter r0 = r7.mAdapter
            if (r0 == 0) goto L151
            int r0 = r0.getCount()
            if (r0 != 0) goto L1a
            goto L151
        L1a:
            android.view.VelocityTracker r0 = r7.mVelocityTracker
            if (r0 != 0) goto L24
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r7.mVelocityTracker = r0
        L24:
            android.view.VelocityTracker r0 = r7.mVelocityTracker
            r0.addMovement(r8)
            int r0 = r8.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r2 = 1
            if (r0 == 0) goto L12b
            if (r0 == r2) goto Le3
            r3 = 2
            if (r0 == r3) goto L74
            r3 = 3
            if (r0 == r3) goto L65
            r3 = 5
            if (r0 == r3) goto L53
            r3 = 6
            if (r0 == r3) goto L42
            goto L14b
        L42:
            r7.onSecondaryPointerUp(r8)
            int r0 = r7.mActivePointerId
            int r0 = r8.findPointerIndex(r0)
            float r8 = r8.getX(r0)
            r7.mLastMotionX = r8
            goto L14b
        L53:
            int r0 = com.umeng.socialize.shareboard.widgets.MotionEventCompat.getActionIndex(r8)
            float r3 = r8.getX(r0)
            r7.mLastMotionX = r3
            int r8 = r8.getPointerId(r0)
            r7.mActivePointerId = r8
            goto L14b
        L65:
            boolean r8 = r7.mIsBeingDragged
            if (r8 == 0) goto L14b
            int r8 = r7.mCurPosition
            r7.scrollToItem(r8, r2, r1, r1)
            boolean r1 = r7.resetTouch()
            goto L14b
        L74:
            boolean r0 = r7.mIsBeingDragged
            if (r0 != 0) goto Ld0
            int r0 = r7.mActivePointerId
            int r0 = r8.findPointerIndex(r0)
            r3 = -1
            if (r0 != r3) goto L87
            boolean r1 = r7.resetTouch()
            goto L14b
        L87:
            float r3 = r8.getX(r0)
            float r4 = r7.mLastMotionX
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            float r0 = r8.getY(r0)
            float r5 = r7.mLastMotionY
            float r5 = r0 - r5
            float r5 = java.lang.Math.abs(r5)
            int r6 = r7.mTouchSlop
            float r6 = (float) r6
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 <= 0) goto Ld0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Ld0
            r7.mIsBeingDragged = r2
            r7.requestParentDisallowInterceptTouchEvent(r2)
            float r4 = r7.mInitialMotionX
            float r3 = r3 - r4
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto Lbc
            int r3 = r7.mTouchSlop
            float r3 = (float) r3
            float r4 = r4 + r3
            goto Lc0
        Lbc:
            int r3 = r7.mTouchSlop
            float r3 = (float) r3
            float r4 = r4 - r3
        Lc0:
            r7.mLastMotionX = r4
            r7.mLastMotionY = r0
            r7.setScrollState(r2)
            android.view.ViewParent r0 = r7.getParent()
            if (r0 == 0) goto Ld0
            r0.requestDisallowInterceptTouchEvent(r2)
        Ld0:
            boolean r0 = r7.mIsBeingDragged
            if (r0 == 0) goto L14b
            int r0 = r7.mActivePointerId
            int r0 = r8.findPointerIndex(r0)
            float r8 = r8.getX(r0)
            boolean r1 = r7.performDrag(r8)
            goto L14b
        Le3:
            boolean r0 = r7.mIsBeingDragged
            if (r0 == 0) goto L14b
            android.view.VelocityTracker r0 = r7.mVelocityTracker
            int r1 = r7.mMaximumVelocity
            float r1 = (float) r1
            r3 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r3, r1)
            int r1 = r7.mActivePointerId
            float r0 = com.umeng.socialize.shareboard.widgets.VelocityTrackerCompat.getXVelocity(r0, r1)
            int r0 = (int) r0
            r7.mPopulatePending = r2
            int r1 = r7.getClientWidth()
            int r3 = r7.getScrollX()
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo r4 = r7.infoForCurrentScrollPosition()
            int r5 = r4.position
            float r3 = (float) r3
            float r1 = (float) r1
            float r3 = r3 / r1
            float r1 = r4.offset
            float r3 = r3 - r1
            r1 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 / r1
            int r1 = r7.mActivePointerId
            int r1 = r8.findPointerIndex(r1)
            float r8 = r8.getX(r1)
            float r1 = r7.mInitialMotionX
            float r8 = r8 - r1
            int r8 = (int) r8
            int r8 = r7.determineTargetPage(r5, r3, r0, r8)
            r7.setCurrentItemInternal(r8, r2, r2, r0)
            boolean r1 = r7.resetTouch()
            goto L14b
        L12b:
            android.widget.Scroller r0 = r7.mScroller
            r0.abortAnimation()
            r7.mPopulatePending = r1
            r7.populate()
            float r0 = r8.getX()
            r7.mInitialMotionX = r0
            r7.mLastMotionX = r0
            float r0 = r8.getY()
            r7.mInitialMotionY = r0
            r7.mLastMotionY = r0
            int r8 = r8.getPointerId(r1)
            r7.mActivePointerId = r8
        L14b:
            if (r1 == 0) goto L150
            com.umeng.socialize.shareboard.widgets.ViewCompat.postInvalidateOnAnimation(r7)
        L150:
            return r2
        L151:
            return r1
    }

    boolean pageLeft() {
            r2 = this;
            int r0 = r2.mCurPosition
            if (r0 <= 0) goto La
            r1 = 1
            int r0 = r0 - r1
            r2.setCurrentItem(r0, r1)
            return r1
        La:
            r0 = 0
            return r0
    }

    boolean pageRight() {
            r3 = this;
            com.umeng.socialize.shareboard.widgets.SocializePagerAdapter r0 = r3.mAdapter
            if (r0 == 0) goto L15
            int r1 = r3.mCurPosition
            int r0 = r0.getCount()
            r2 = 1
            int r0 = r0 - r2
            if (r1 >= r0) goto L15
            int r0 = r3.mCurPosition
            int r0 = r0 + r2
            r3.setCurrentItem(r0, r2)
            return r2
        L15:
            r0 = 0
            return r0
    }

    public void removeOnPageChangeListener(com.umeng.socialize.shareboard.widgets.SocializeViewPager.OnPageChangeListener r2) {
            r1 = this;
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$OnPageChangeListener> r0 = r1.mOnPageChangeListeners
            if (r0 == 0) goto L7
            r0.remove(r2)
        L7:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(android.view.View r2) {
            r1 = this;
            boolean r0 = r1.mInLayout
            if (r0 == 0) goto L8
            r1.removeViewInLayout(r2)
            return
        L8:
            super.removeView(r2)
            return
    }

    public void setAdapter(com.umeng.socialize.shareboard.widgets.SocializePagerAdapter r7) {
            r6 = this;
            com.umeng.socialize.shareboard.widgets.SocializePagerAdapter r0 = r6.mAdapter
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L3d
            r0.setViewPagerObserver(r1)
            com.umeng.socialize.shareboard.widgets.SocializePagerAdapter r0 = r6.mAdapter
            r0.startUpdate(r6)
            r0 = 0
        Lf:
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r3 = r6.mItems
            int r3 = r3.size()
            if (r0 >= r3) goto L2b
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r3 = r6.mItems
            java.lang.Object r3 = r3.get(r0)
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo r3 = (com.umeng.socialize.shareboard.widgets.SocializeViewPager.ItemInfo) r3
            com.umeng.socialize.shareboard.widgets.SocializePagerAdapter r4 = r6.mAdapter
            int r5 = r3.position
            java.lang.Object r3 = r3.object
            r4.destroyItem(r6, r5, r3)
            int r0 = r0 + 1
            goto Lf
        L2b:
            com.umeng.socialize.shareboard.widgets.SocializePagerAdapter r0 = r6.mAdapter
            r0.finishUpdate(r6)
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r0 = r6.mItems
            r0.clear()
            r6.removeAllViews()
            r6.mCurPosition = r2
            r6.scrollTo(r2, r2)
        L3d:
            r6.mAdapter = r7
            r6.mExpectedAdapterCount = r2
            if (r7 == 0) goto L87
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$PagerObserver r7 = r6.mObserver
            if (r7 != 0) goto L4e
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$PagerObserver r7 = new com.umeng.socialize.shareboard.widgets.SocializeViewPager$PagerObserver
            r7.<init>(r6)
            r6.mObserver = r7
        L4e:
            com.umeng.socialize.shareboard.widgets.SocializePagerAdapter r7 = r6.mAdapter
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$PagerObserver r0 = r6.mObserver
            r7.setViewPagerObserver(r0)
            r6.mPopulatePending = r2
            boolean r7 = r6.mFirstLayout
            r0 = 1
            r6.mFirstLayout = r0
            com.umeng.socialize.shareboard.widgets.SocializePagerAdapter r3 = r6.mAdapter
            int r3 = r3.getCount()
            r6.mExpectedAdapterCount = r3
            int r3 = r6.mRestoredCurItem
            if (r3 < 0) goto L7e
            com.umeng.socialize.shareboard.widgets.SocializePagerAdapter r7 = r6.mAdapter
            android.os.Parcelable r3 = r6.mRestoredAdapterState
            java.lang.ClassLoader r4 = r6.mRestoredClassLoader
            r7.restoreState(r3, r4)
            int r7 = r6.mRestoredCurItem
            r6.setCurrentItemInternal(r7, r2, r0)
            r7 = -1
            r6.mRestoredCurItem = r7
            r6.mRestoredAdapterState = r1
            r6.mRestoredClassLoader = r1
            return
        L7e:
            if (r7 != 0) goto L84
            r6.populate()
            return
        L84:
            r6.requestLayout()
        L87:
            return
    }

    public void setCurrentItem(int r3) {
            r2 = this;
            r0 = 0
            r2.mPopulatePending = r0
            boolean r1 = r2.mFirstLayout
            r1 = r1 ^ 1
            r2.setCurrentItemInternal(r3, r1, r0)
            return
    }

    public void setCurrentItem(int r2, boolean r3) {
            r1 = this;
            r0 = 0
            r1.mPopulatePending = r0
            r1.setCurrentItemInternal(r2, r3, r0)
            return
    }

    void setCurrentItemInternal(int r2, boolean r3, boolean r4) {
            r1 = this;
            r0 = 0
            r1.setCurrentItemInternal(r2, r3, r4, r0)
            return
    }

    void setCurrentItemInternal(int r5, boolean r6, boolean r7, int r8) {
            r4 = this;
            com.umeng.socialize.shareboard.widgets.SocializePagerAdapter r0 = r4.mAdapter
            if (r0 == 0) goto L6a
            int r0 = r0.getCount()
            if (r0 > 0) goto Lb
            goto L6a
        Lb:
            if (r7 != 0) goto L1a
            int r7 = r4.mCurPosition
            if (r7 != r5) goto L1a
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r7 = r4.mItems
            int r7 = r7.size()
            if (r7 == 0) goto L1a
            goto L6a
        L1a:
            r7 = 0
            r0 = 1
            if (r5 >= 0) goto L20
            r5 = 0
            goto L2f
        L20:
            com.umeng.socialize.shareboard.widgets.SocializePagerAdapter r1 = r4.mAdapter
            int r1 = r1.getCount()
            if (r5 < r1) goto L2f
            com.umeng.socialize.shareboard.widgets.SocializePagerAdapter r5 = r4.mAdapter
            int r5 = r5.getCount()
            int r5 = r5 - r0
        L2f:
            int r1 = r4.mOffscreenPageLimit
            int r2 = r4.mCurPosition
            int r3 = r2 + r1
            if (r5 > r3) goto L3a
            int r2 = r2 - r1
            if (r5 >= r2) goto L50
        L3a:
            r1 = 0
        L3b:
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r2 = r4.mItems
            int r2 = r2.size()
            if (r1 >= r2) goto L50
            java.util.List<com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo> r2 = r4.mItems
            java.lang.Object r2 = r2.get(r1)
            com.umeng.socialize.shareboard.widgets.SocializeViewPager$ItemInfo r2 = (com.umeng.socialize.shareboard.widgets.SocializeViewPager.ItemInfo) r2
            r2.scrolling = r0
            int r1 = r1 + 1
            goto L3b
        L50:
            int r1 = r4.mCurPosition
            if (r1 == r5) goto L55
            r7 = 1
        L55:
            boolean r0 = r4.mFirstLayout
            if (r0 == 0) goto L64
            r4.mCurPosition = r5
            if (r7 == 0) goto L60
            r4.dispatchOnPageSelected(r5)
        L60:
            r4.requestLayout()
            return
        L64:
            r4.populate(r5)
            r4.scrollToItem(r5, r6, r8, r7)
        L6a:
            return
    }

    void setScrollState(int r2) {
            r1 = this;
            int r0 = r1.mScrollState
            if (r0 != r2) goto L5
            return
        L5:
            r1.mScrollState = r2
            r1.dispatchOnScrollStateChanged(r2)
            return
    }

    void smoothScrollTo(int r2, int r3) {
            r1 = this;
            r0 = 0
            r1.smoothScrollTo(r2, r3, r0)
            return
    }

    void smoothScrollTo(int r8, int r9, int r10) {
            r7 = this;
            int r0 = r7.getChildCount()
            if (r0 != 0) goto L7
            return
        L7:
            android.widget.Scroller r0 = r7.mScroller
            if (r0 == 0) goto L29
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L29
            boolean r0 = r7.mIsScrollStarted
            if (r0 == 0) goto L1c
            android.widget.Scroller r0 = r7.mScroller
            int r0 = r0.getCurrX()
            goto L22
        L1c:
            android.widget.Scroller r0 = r7.mScroller
            int r0 = r0.getStartX()
        L22:
            android.widget.Scroller r1 = r7.mScroller
            r1.abortAnimation()
        L27:
            r2 = r0
            goto L2e
        L29:
            int r0 = r7.getScrollX()
            goto L27
        L2e:
            int r3 = r7.getScrollY()
            int r4 = r8 - r2
            int r5 = r9 - r3
            r8 = 0
            if (r4 != 0) goto L45
            if (r5 != 0) goto L45
            r7.completeScroll(r8)
            r7.populate()
            r7.setScrollState(r8)
            return
        L45:
            r9 = 2
            r7.setScrollState(r9)
            int r9 = r7.getClientWidth()
            int r0 = r9 / 2
            int r1 = java.lang.Math.abs(r4)
            float r1 = (float) r1
            r6 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 * r6
            float r9 = (float) r9
            float r1 = r1 / r9
            float r1 = java.lang.Math.min(r6, r1)
            float r0 = (float) r0
            float r1 = r7.distanceInfluenceForSnapDuration(r1)
            float r1 = r1 * r0
            float r0 = r0 + r1
            int r10 = java.lang.Math.abs(r10)
            if (r10 <= 0) goto L7d
            float r9 = (float) r10
            float r0 = r0 / r9
            float r9 = java.lang.Math.abs(r0)
            r10 = 1148846080(0x447a0000, float:1000.0)
            float r9 = r9 * r10
            int r9 = java.lang.Math.round(r9)
            int r9 = r9 * 4
            goto L93
        L7d:
            com.umeng.socialize.shareboard.widgets.SocializePagerAdapter r10 = r7.mAdapter
            int r0 = r7.mCurPosition
            float r10 = r10.getPageWidth(r0)
            float r9 = r9 * r10
            int r10 = java.lang.Math.abs(r4)
            float r10 = (float) r10
            float r10 = r10 / r9
            float r10 = r10 + r6
            r9 = 1120403456(0x42c80000, float:100.0)
            float r10 = r10 * r9
            int r9 = (int) r10
        L93:
            r10 = 600(0x258, float:8.41E-43)
            int r6 = java.lang.Math.min(r9, r10)
            r7.mIsScrollStarted = r8
            android.widget.Scroller r1 = r7.mScroller
            r1.startScroll(r2, r3, r4, r5, r6)
            com.umeng.socialize.shareboard.widgets.ViewCompat.postInvalidateOnAnimation(r7)
            return
    }
}
