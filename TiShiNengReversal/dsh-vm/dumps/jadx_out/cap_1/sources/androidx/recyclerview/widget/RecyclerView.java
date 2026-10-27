package androidx.recyclerview.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class RecyclerView extends android.view.ViewGroup implements androidx.core.view.ScrollingView, androidx.core.view.NestedScrollingChild2, androidx.core.view.NestedScrollingChild3 {
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = false;
    static final boolean ALLOW_THREAD_GAP_WORK = false;
    static final boolean DEBUG = false;
    private static final float DECELERATION_RATE = 0.0f;
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final float FLING_DESTRETCH_FACTOR = 4.0f;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = false;
    private static final float INFLEXION = 0.35f;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final java.lang.Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = null;
    static final int MAX_SCROLL_DURATION = 2000;
    private static final int[] NESTED_SCROLLING_ATTRS = null;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    static final boolean POST_UPDATES_ON_ANIMATION = false;
    private static final float SCROLL_FRICTION = 0.015f;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final java.lang.String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final java.lang.String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final java.lang.String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final java.lang.String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final java.lang.String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final java.lang.String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final java.lang.String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final java.lang.String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final java.lang.String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static final androidx.recyclerview.widget.RecyclerView.StretchEdgeEffectFactory sDefaultEdgeEffectFactory = null;
    static final android.view.animation.Interpolator sQuinticInterpolator = null;
    androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate mAccessibilityDelegate;
    private final android.view.accessibility.AccessibilityManager mAccessibilityManager;
    androidx.recyclerview.widget.RecyclerView.Adapter mAdapter;
    androidx.recyclerview.widget.AdapterHelper mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private android.widget.EdgeEffect mBottomGlow;
    private androidx.recyclerview.widget.RecyclerView.ChildDrawingOrderCallback mChildDrawingOrderCallback;
    androidx.recyclerview.widget.ChildHelper mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;

    @androidx.annotation.NonNull
    private androidx.recyclerview.widget.RecyclerView.EdgeEffectFactory mEdgeEffectFactory;
    boolean mEnableFastScroller;

    @androidx.annotation.VisibleForTesting
    boolean mFirstLayoutComplete;
    androidx.recyclerview.widget.GapWorker mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private androidx.recyclerview.widget.RecyclerView.OnItemTouchListener mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    androidx.recyclerview.widget.RecyclerView.ItemAnimator mItemAnimator;
    private androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemAnimatorListener mItemAnimatorListener;
    private java.lang.Runnable mItemAnimatorRunner;
    final java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ItemDecoration> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;

    @androidx.annotation.VisibleForTesting
    androidx.recyclerview.widget.RecyclerView.LayoutManager mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private android.widget.EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final androidx.recyclerview.widget.RecyclerView.RecyclerViewDataObserver mObserver;
    private java.util.List<androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener> mOnChildAttachStateListeners;
    private androidx.recyclerview.widget.RecyclerView.OnFlingListener mOnFlingListener;
    private final java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.OnItemTouchListener> mOnItemTouchListeners;

    @androidx.annotation.VisibleForTesting
    final java.util.List<androidx.recyclerview.widget.RecyclerView.ViewHolder> mPendingAccessibilityImportanceChange;
    androidx.recyclerview.widget.RecyclerView.SavedState mPendingSavedState;
    private final float mPhysicalCoef;
    boolean mPostedAnimatorRunner;
    androidx.recyclerview.widget.GapWorker.LayoutPrefetchRegistryImpl mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final androidx.recyclerview.widget.RecyclerView.Recycler mRecycler;
    androidx.recyclerview.widget.RecyclerView.RecyclerListener mRecyclerListener;
    final java.util.List<androidx.recyclerview.widget.RecyclerView.RecyclerListener> mRecyclerListeners;
    final int[] mReusableIntPair;
    private android.widget.EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private androidx.recyclerview.widget.RecyclerView.OnScrollListener mScrollListener;
    private java.util.List<androidx.recyclerview.widget.RecyclerView.OnScrollListener> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private androidx.core.view.NestedScrollingChildHelper mScrollingChildHelper;
    final androidx.recyclerview.widget.RecyclerView.State mState;
    final android.graphics.Rect mTempRect;
    private final android.graphics.Rect mTempRect2;
    final android.graphics.RectF mTempRectF;
    private android.widget.EdgeEffect mTopGlow;
    private int mTouchSlop;
    final java.lang.Runnable mUpdateChildViewsRunnable;
    private android.view.VelocityTracker mVelocityTracker;
    final androidx.recyclerview.widget.RecyclerView.ViewFlinger mViewFlinger;
    private final androidx.recyclerview.widget.ViewInfoStore.ProcessCallback mViewInfoProcessCallback;
    final androidx.recyclerview.widget.ViewInfoStore mViewInfoStore;







    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$7, reason: invalid class name */
    static /* synthetic */ class AnonymousClass7 {
        static final /* synthetic */ int[] $SwitchMap$androidx$recyclerview$widget$RecyclerView$Adapter$StateRestorationPolicy = null;

        static {
                androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy[] r0 = androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.recyclerview.widget.RecyclerView.AnonymousClass7.$SwitchMap$androidx$recyclerview$widget$RecyclerView$Adapter$StateRestorationPolicy = r0
                androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy r1 = androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.PREVENT     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.recyclerview.widget.RecyclerView.AnonymousClass7.$SwitchMap$androidx$recyclerview$widget$RecyclerView$Adapter$StateRestorationPolicy     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy r1 = androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class Adapter<VH extends androidx.recyclerview.widget.RecyclerView.ViewHolder> {
        private boolean mHasStableIds;
        private final androidx.recyclerview.widget.RecyclerView.AdapterDataObservable mObservable;
        private androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy mStateRestorationPolicy;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public enum StateRestorationPolicy extends java.lang.Enum<androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy> {
            private static final /* synthetic */ androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy[] $VALUES = null;
            public static final androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy ALLOW = null;
            public static final androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy PREVENT = null;
            public static final androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy PREVENT_WHEN_EMPTY = null;

            static {
                    androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy r0 = new androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy
                    java.lang.String r1 = "ALLOW"
                    r2 = 0
                    r0.<init>(r1, r2)
                    androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.ALLOW = r0
                    androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy r1 = new androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy
                    java.lang.String r3 = "PREVENT_WHEN_EMPTY"
                    r4 = 1
                    r1.<init>(r3, r4)
                    androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY = r1
                    androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy r3 = new androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy
                    java.lang.String r5 = "PREVENT"
                    r6 = 2
                    r3.<init>(r5, r6)
                    androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.PREVENT = r3
                    r5 = 3
                    androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy[] r5 = new androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy[r5]
                    r5[r2] = r0
                    r5[r4] = r1
                    r5[r6] = r3
                    androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.$VALUES = r5
                    return
            }

            StateRestorationPolicy(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy valueOf(java.lang.String r1) {
                    java.lang.Class<androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy> r0 = androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy r1 = (androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy) r1
                    return r1
            }

            public static androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy[] values() {
                    androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy[] r0 = androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.$VALUES
                    java.lang.Object r0 = r0.clone()
                    androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy[] r0 = (androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy[]) r0
                    return r0
            }
        }

        public Adapter() {
                r1 = this;
                r1.<init>()
                androidx.recyclerview.widget.RecyclerView$AdapterDataObservable r0 = new androidx.recyclerview.widget.RecyclerView$AdapterDataObservable
                r0.<init>()
                r1.mObservable = r0
                r0 = 0
                r1.mHasStableIds = r0
                androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy r0 = androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.ALLOW
                r1.mStateRestorationPolicy = r0
                return
        }

        public final void bindViewHolder(@androidx.annotation.NonNull VH r5, int r6) {
                r4 = this;
                androidx.recyclerview.widget.RecyclerView$Adapter<? extends androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r5.mBindingAdapter
                r1 = 1
                if (r0 != 0) goto L7
                r0 = 1
                goto L8
            L7:
                r0 = 0
            L8:
                if (r0 == 0) goto L22
                r5.mPosition = r6
                boolean r2 = r4.hasStableIds()
                if (r2 == 0) goto L18
                long r2 = r4.getItemId(r6)
                r5.mItemId = r2
            L18:
                r2 = 519(0x207, float:7.27E-43)
                r5.setFlags(r1, r2)
                java.lang.String r2 = "RV OnBindView"
                androidx.core.os.TraceCompat.beginSection(r2)
            L22:
                r5.mBindingAdapter = r4
                java.util.List r2 = r5.getUnmodifiedPayloads()
                r4.onBindViewHolder(r5, r6, r2)
                if (r0 == 0) goto L41
                r5.clearPayload()
                android.view.View r5 = r5.itemView
                android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
                boolean r6 = r5 instanceof androidx.recyclerview.widget.RecyclerView.LayoutParams
                if (r6 == 0) goto L3e
                androidx.recyclerview.widget.RecyclerView$LayoutParams r5 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r5
                r5.mInsetsDirty = r1
            L3e:
                androidx.core.os.TraceCompat.endSection()
            L41:
                return
        }

        boolean canRestoreState() {
                r4 = this;
                int[] r0 = androidx.recyclerview.widget.RecyclerView.AnonymousClass7.$SwitchMap$androidx$recyclerview$widget$RecyclerView$Adapter$StateRestorationPolicy
                androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy r1 = r4.mStateRestorationPolicy
                int r1 = r1.ordinal()
                r0 = r0[r1]
                r1 = 0
                r2 = 1
                if (r0 == r2) goto L19
                r3 = 2
                if (r0 == r3) goto L12
                return r2
            L12:
                int r0 = r4.getItemCount()
                if (r0 <= 0) goto L19
                return r2
            L19:
                return r1
        }

        @androidx.annotation.NonNull
        public final VH createViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r2, int r3) {
                r1 = this;
                java.lang.String r0 = "RV CreateView"
                androidx.core.os.TraceCompat.beginSection(r0)     // Catch: java.lang.Throwable -> L17
                androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = r1.onCreateViewHolder(r2, r3)     // Catch: java.lang.Throwable -> L17
                android.view.View r0 = r2.itemView     // Catch: java.lang.Throwable -> L17
                android.view.ViewParent r0 = r0.getParent()     // Catch: java.lang.Throwable -> L17
                if (r0 != 0) goto L19
                r2.mItemViewType = r3     // Catch: java.lang.Throwable -> L17
                androidx.core.os.TraceCompat.endSection()
                return r2
            L17:
                r2 = move-exception
                goto L21
            L19:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L17
                java.lang.String r3 = "ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)"
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L17
                throw r2     // Catch: java.lang.Throwable -> L17
            L21:
                androidx.core.os.TraceCompat.endSection()
                throw r2
        }

        public int findRelativeAdapterPositionIn(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder> r1, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r2, int r3) {
                r0 = this;
                if (r1 != r0) goto L3
                return r3
            L3:
                r1 = -1
                return r1
        }

        public abstract int getItemCount();

        public long getItemId(int r3) {
                r2 = this;
                r0 = -1
                return r0
        }

        public int getItemViewType(int r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @androidx.annotation.NonNull
        public final androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy getStateRestorationPolicy() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy r0 = r1.mStateRestorationPolicy
                return r0
        }

        public final boolean hasObservers() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$AdapterDataObservable r0 = r1.mObservable
                boolean r0 = r0.hasObservers()
                return r0
        }

        public final boolean hasStableIds() {
                r1 = this;
                boolean r0 = r1.mHasStableIds
                return r0
        }

        public final void notifyDataSetChanged() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$AdapterDataObservable r0 = r1.mObservable
                r0.notifyChanged()
                return
        }

        public final void notifyItemChanged(int r3) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView$AdapterDataObservable r0 = r2.mObservable
                r1 = 1
                r0.notifyItemRangeChanged(r3, r1)
                return
        }

        public final void notifyItemChanged(int r3, @androidx.annotation.Nullable java.lang.Object r4) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView$AdapterDataObservable r0 = r2.mObservable
                r1 = 1
                r0.notifyItemRangeChanged(r3, r1, r4)
                return
        }

        public final void notifyItemInserted(int r3) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView$AdapterDataObservable r0 = r2.mObservable
                r1 = 1
                r0.notifyItemRangeInserted(r3, r1)
                return
        }

        public final void notifyItemMoved(int r2, int r3) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$AdapterDataObservable r0 = r1.mObservable
                r0.notifyItemMoved(r2, r3)
                return
        }

        public final void notifyItemRangeChanged(int r2, int r3) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$AdapterDataObservable r0 = r1.mObservable
                r0.notifyItemRangeChanged(r2, r3)
                return
        }

        public final void notifyItemRangeChanged(int r2, int r3, @androidx.annotation.Nullable java.lang.Object r4) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$AdapterDataObservable r0 = r1.mObservable
                r0.notifyItemRangeChanged(r2, r3, r4)
                return
        }

        public final void notifyItemRangeInserted(int r2, int r3) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$AdapterDataObservable r0 = r1.mObservable
                r0.notifyItemRangeInserted(r2, r3)
                return
        }

        public final void notifyItemRangeRemoved(int r2, int r3) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$AdapterDataObservable r0 = r1.mObservable
                r0.notifyItemRangeRemoved(r2, r3)
                return
        }

        public final void notifyItemRemoved(int r3) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView$AdapterDataObservable r0 = r2.mObservable
                r1 = 1
                r0.notifyItemRangeRemoved(r3, r1)
                return
        }

        public void onAttachedToRecyclerView(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r1) {
                r0 = this;
                return
        }

        public abstract void onBindViewHolder(@androidx.annotation.NonNull VH r1, int r2);

        public void onBindViewHolder(@androidx.annotation.NonNull VH r1, int r2, @androidx.annotation.NonNull java.util.List<java.lang.Object> r3) {
                r0 = this;
                r0.onBindViewHolder(r1, r2)
                return
        }

        @androidx.annotation.NonNull
        public abstract VH onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r1, int r2);

        public void onDetachedFromRecyclerView(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r1) {
                r0 = this;
                return
        }

        public boolean onFailedToRecycleView(@androidx.annotation.NonNull VH r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public void onViewAttachedToWindow(@androidx.annotation.NonNull VH r1) {
                r0 = this;
                return
        }

        public void onViewDetachedFromWindow(@androidx.annotation.NonNull VH r1) {
                r0 = this;
                return
        }

        public void onViewRecycled(@androidx.annotation.NonNull VH r1) {
                r0 = this;
                return
        }

        public void registerAdapterDataObserver(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.AdapterDataObserver r2) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$AdapterDataObservable r0 = r1.mObservable
                r0.registerObserver(r2)
                return
        }

        public void setHasStableIds(boolean r2) {
                r1 = this;
                boolean r0 = r1.hasObservers()
                if (r0 != 0) goto L9
                r1.mHasStableIds = r2
                return
            L9:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "Cannot change whether this adapter has stable IDs while the adapter has registered observers."
                r2.<init>(r0)
                throw r2
        }

        public void setStateRestorationPolicy(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy r1) {
                r0 = this;
                r0.mStateRestorationPolicy = r1
                androidx.recyclerview.widget.RecyclerView$AdapterDataObservable r1 = r0.mObservable
                r1.notifyStateRestorationPolicyChanged()
                return
        }

        public void unregisterAdapterDataObserver(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.AdapterDataObserver r2) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$AdapterDataObservable r0 = r1.mObservable
                r0.unregisterObserver(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class AdapterDataObservable extends android.database.Observable<androidx.recyclerview.widget.RecyclerView.AdapterDataObserver> {
        AdapterDataObservable() {
                r0 = this;
                r0.<init>()
                return
        }

        public boolean hasObservers() {
                r1 = this;
                java.util.ArrayList r0 = r1.mObservers
                boolean r0 = r0.isEmpty()
                r0 = r0 ^ 1
                return r0
        }

        public void notifyChanged() {
                r2 = this;
                java.util.ArrayList r0 = r2.mObservers
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L8:
                if (r0 < 0) goto L18
                java.util.ArrayList r1 = r2.mObservers
                java.lang.Object r1 = r1.get(r0)
                androidx.recyclerview.widget.RecyclerView$AdapterDataObserver r1 = (androidx.recyclerview.widget.RecyclerView.AdapterDataObserver) r1
                r1.onChanged()
                int r0 = r0 + (-1)
                goto L8
            L18:
                return
        }

        public void notifyItemMoved(int r4, int r5) {
                r3 = this;
                java.util.ArrayList r0 = r3.mObservers
                int r0 = r0.size()
                r1 = 1
                int r0 = r0 - r1
            L8:
                if (r0 < 0) goto L18
                java.util.ArrayList r2 = r3.mObservers
                java.lang.Object r2 = r2.get(r0)
                androidx.recyclerview.widget.RecyclerView$AdapterDataObserver r2 = (androidx.recyclerview.widget.RecyclerView.AdapterDataObserver) r2
                r2.onItemRangeMoved(r4, r5, r1)
                int r0 = r0 + (-1)
                goto L8
            L18:
                return
        }

        public void notifyItemRangeChanged(int r2, int r3) {
                r1 = this;
                r0 = 0
                r1.notifyItemRangeChanged(r2, r3, r0)
                return
        }

        public void notifyItemRangeChanged(int r3, int r4, @androidx.annotation.Nullable java.lang.Object r5) {
                r2 = this;
                java.util.ArrayList r0 = r2.mObservers
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L8:
                if (r0 < 0) goto L18
                java.util.ArrayList r1 = r2.mObservers
                java.lang.Object r1 = r1.get(r0)
                androidx.recyclerview.widget.RecyclerView$AdapterDataObserver r1 = (androidx.recyclerview.widget.RecyclerView.AdapterDataObserver) r1
                r1.onItemRangeChanged(r3, r4, r5)
                int r0 = r0 + (-1)
                goto L8
            L18:
                return
        }

        public void notifyItemRangeInserted(int r3, int r4) {
                r2 = this;
                java.util.ArrayList r0 = r2.mObservers
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L8:
                if (r0 < 0) goto L18
                java.util.ArrayList r1 = r2.mObservers
                java.lang.Object r1 = r1.get(r0)
                androidx.recyclerview.widget.RecyclerView$AdapterDataObserver r1 = (androidx.recyclerview.widget.RecyclerView.AdapterDataObserver) r1
                r1.onItemRangeInserted(r3, r4)
                int r0 = r0 + (-1)
                goto L8
            L18:
                return
        }

        public void notifyItemRangeRemoved(int r3, int r4) {
                r2 = this;
                java.util.ArrayList r0 = r2.mObservers
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L8:
                if (r0 < 0) goto L18
                java.util.ArrayList r1 = r2.mObservers
                java.lang.Object r1 = r1.get(r0)
                androidx.recyclerview.widget.RecyclerView$AdapterDataObserver r1 = (androidx.recyclerview.widget.RecyclerView.AdapterDataObserver) r1
                r1.onItemRangeRemoved(r3, r4)
                int r0 = r0 + (-1)
                goto L8
            L18:
                return
        }

        public void notifyStateRestorationPolicyChanged() {
                r2 = this;
                java.util.ArrayList r0 = r2.mObservers
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L8:
                if (r0 < 0) goto L18
                java.util.ArrayList r1 = r2.mObservers
                java.lang.Object r1 = r1.get(r0)
                androidx.recyclerview.widget.RecyclerView$AdapterDataObserver r1 = (androidx.recyclerview.widget.RecyclerView.AdapterDataObserver) r1
                r1.onStateRestorationPolicyChanged()
                int r0 = r0 + (-1)
                goto L8
            L18:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class AdapterDataObserver {
        public AdapterDataObserver() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onChanged() {
                r0 = this;
                return
        }

        public void onItemRangeChanged(int r1, int r2) {
                r0 = this;
                return
        }

        public void onItemRangeChanged(int r1, int r2, @androidx.annotation.Nullable java.lang.Object r3) {
                r0 = this;
                r0.onItemRangeChanged(r1, r2)
                return
        }

        public void onItemRangeInserted(int r1, int r2) {
                r0 = this;
                return
        }

        public void onItemRangeMoved(int r1, int r2, int r3) {
                r0 = this;
                return
        }

        public void onItemRangeRemoved(int r1, int r2) {
                r0 = this;
                return
        }

        public void onStateRestorationPolicyChanged() {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface ChildDrawingOrderCallback {
        int onGetChildDrawingOrder(int r1, int r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class EdgeEffectFactory {
        public static final int DIRECTION_BOTTOM = 3;
        public static final int DIRECTION_LEFT = 0;
        public static final int DIRECTION_RIGHT = 2;
        public static final int DIRECTION_TOP = 1;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface EdgeDirection {
        }

        public EdgeEffectFactory() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        protected android.widget.EdgeEffect createEdgeEffect(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r1, int r2) {
                r0 = this;
                android.widget.EdgeEffect r2 = new android.widget.EdgeEffect
                android.content.Context r1 = r1.getContext()
                r2.<init>(r1)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class ItemAnimator {
        public static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        public static final int FLAG_CHANGED = 2;
        public static final int FLAG_INVALIDATED = 4;
        public static final int FLAG_MOVED = 2048;
        public static final int FLAG_REMOVED = 8;
        private long mAddDuration;
        private long mChangeDuration;
        private java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemAnimatorFinishedListener> mFinishedListeners;
        private androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemAnimatorListener mListener;
        private long mMoveDuration;
        private long mRemoveDuration;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface AdapterChanges {
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public interface ItemAnimatorFinishedListener {
            void onAnimationsFinished();
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        interface ItemAnimatorListener {
            void onAnimationFinished(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r1);
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static class ItemHolderInfo {
            public int bottom;
            public int changeFlags;
            public int left;
            public int right;
            public int top;

            public ItemHolderInfo() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @androidx.annotation.NonNull
            public androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo setFrom(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r2) {
                    r1 = this;
                    r0 = 0
                    androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemHolderInfo r2 = r1.setFrom(r2, r0)
                    return r2
            }

            @androidx.annotation.NonNull
            public androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo setFrom(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r1, int r2) {
                    r0 = this;
                    android.view.View r1 = r1.itemView
                    int r2 = r1.getLeft()
                    r0.left = r2
                    int r2 = r1.getTop()
                    r0.top = r2
                    int r2 = r1.getRight()
                    r0.right = r2
                    int r1 = r1.getBottom()
                    r0.bottom = r1
                    return r0
            }
        }

        public ItemAnimator() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.mListener = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.mFinishedListeners = r0
                r0 = 120(0x78, double:5.93E-322)
                r2.mAddDuration = r0
                r2.mRemoveDuration = r0
                r0 = 250(0xfa, double:1.235E-321)
                r2.mMoveDuration = r0
                r2.mChangeDuration = r0
                return
        }

        static int buildAdapterChangeFlagsForAnimations(androidx.recyclerview.widget.RecyclerView.ViewHolder r4) {
                int r0 = r4.mFlags
                r1 = r0 & 14
                boolean r2 = r4.isInvalid()
                r3 = 4
                if (r2 == 0) goto Lc
                return r3
            Lc:
                r0 = r0 & r3
                if (r0 != 0) goto L21
                int r0 = r4.getOldPosition()
                int r4 = r4.getAbsoluteAdapterPosition()
                r2 = -1
                if (r0 == r2) goto L21
                if (r4 == r2) goto L21
                if (r0 == r4) goto L21
                r4 = r1 | 2048(0x800, float:2.87E-42)
                return r4
            L21:
                return r1
        }

        public abstract boolean animateAppearance(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r1, @androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo r2, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo r3);

        public abstract boolean animateChange(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r1, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r2, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo r3, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo r4);

        public abstract boolean animateDisappearance(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r1, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo r2, @androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo r3);

        public abstract boolean animatePersistence(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r1, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo r2, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo r3);

        public boolean canReuseUpdatedViewHolder(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r1) {
                r0 = this;
                r1 = 1
                return r1
        }

        public boolean canReuseUpdatedViewHolder(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r1, @androidx.annotation.NonNull java.util.List<java.lang.Object> r2) {
                r0 = this;
                boolean r1 = r0.canReuseUpdatedViewHolder(r1)
                return r1
        }

        public final void dispatchAnimationFinished(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r2) {
                r1 = this;
                r1.onAnimationFinished(r2)
                androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemAnimatorListener r0 = r1.mListener
                if (r0 == 0) goto La
                r0.onAnimationFinished(r2)
            La:
                return
        }

        public final void dispatchAnimationStarted(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r1) {
                r0 = this;
                r0.onAnimationStarted(r1)
                return
        }

        public final void dispatchAnimationsFinished() {
                r3 = this;
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemAnimatorFinishedListener> r0 = r3.mFinishedListeners
                int r0 = r0.size()
                r1 = 0
            L7:
                if (r1 >= r0) goto L17
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemAnimatorFinishedListener> r2 = r3.mFinishedListeners
                java.lang.Object r2 = r2.get(r1)
                androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemAnimatorFinishedListener r2 = (androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemAnimatorFinishedListener) r2
                r2.onAnimationsFinished()
                int r1 = r1 + 1
                goto L7
            L17:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemAnimatorFinishedListener> r0 = r3.mFinishedListeners
                r0.clear()
                return
        }

        public abstract void endAnimation(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r1);

        public abstract void endAnimations();

        public long getAddDuration() {
                r2 = this;
                long r0 = r2.mAddDuration
                return r0
        }

        public long getChangeDuration() {
                r2 = this;
                long r0 = r2.mChangeDuration
                return r0
        }

        public long getMoveDuration() {
                r2 = this;
                long r0 = r2.mMoveDuration
                return r0
        }

        public long getRemoveDuration() {
                r2 = this;
                long r0 = r2.mRemoveDuration
                return r0
        }

        public abstract boolean isRunning();

        public final boolean isRunning(@androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemAnimatorFinishedListener r3) {
                r2 = this;
                boolean r0 = r2.isRunning()
                if (r3 == 0) goto L11
                if (r0 != 0) goto Lc
                r3.onAnimationsFinished()
                return r0
            Lc:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemAnimatorFinishedListener> r1 = r2.mFinishedListeners
                r1.add(r3)
            L11:
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo obtainHolderInfo() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemHolderInfo r0 = new androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemHolderInfo
                r0.<init>()
                return r0
        }

        public void onAnimationFinished(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r1) {
                r0 = this;
                return
        }

        public void onAnimationStarted(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r1) {
                r0 = this;
                return
        }

        @androidx.annotation.NonNull
        public androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo recordPostLayoutInformation(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r1, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r2) {
                r0 = this;
                androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemHolderInfo r1 = r0.obtainHolderInfo()
                androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemHolderInfo r1 = r1.setFrom(r2)
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo recordPreLayoutInformation(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r1, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r2, int r3, @androidx.annotation.NonNull java.util.List<java.lang.Object> r4) {
                r0 = this;
                androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemHolderInfo r1 = r0.obtainHolderInfo()
                androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemHolderInfo r1 = r1.setFrom(r2)
                return r1
        }

        public abstract void runPendingAnimations();

        public void setAddDuration(long r1) {
                r0 = this;
                r0.mAddDuration = r1
                return
        }

        public void setChangeDuration(long r1) {
                r0 = this;
                r0.mChangeDuration = r1
                return
        }

        void setListener(androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemAnimatorListener r1) {
                r0 = this;
                r0.mListener = r1
                return
        }

        public void setMoveDuration(long r1) {
                r0 = this;
                r0.mMoveDuration = r1
                return
        }

        public void setRemoveDuration(long r1) {
                r0 = this;
                r0.mRemoveDuration = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class ItemAnimatorRestoreListener implements androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemAnimatorListener {
        final /* synthetic */ androidx.recyclerview.widget.RecyclerView this$0;

        ItemAnimatorRestoreListener(androidx.recyclerview.widget.RecyclerView r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemAnimatorListener
        public void onAnimationFinished(androidx.recyclerview.widget.RecyclerView.ViewHolder r3) {
                r2 = this;
                r0 = 1
                r3.setIsRecyclable(r0)
                androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r3.mShadowedHolder
                r1 = 0
                if (r0 == 0) goto Lf
                androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r3.mShadowingHolder
                if (r0 != 0) goto Lf
                r3.mShadowedHolder = r1
            Lf:
                r3.mShadowingHolder = r1
                boolean r0 = r3.shouldBeKeptAsChild()
                if (r0 != 0) goto L2f
                androidx.recyclerview.widget.RecyclerView r0 = r2.this$0
                android.view.View r1 = r3.itemView
                boolean r0 = r0.removeAnimatingView(r1)
                if (r0 != 0) goto L2f
                boolean r0 = r3.isTmpDetached()
                if (r0 == 0) goto L2f
                androidx.recyclerview.widget.RecyclerView r0 = r2.this$0
                android.view.View r3 = r3.itemView
                r1 = 0
                r0.removeDetachedView(r3, r1)
            L2f:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class ItemDecoration {
        public ItemDecoration() {
                r0 = this;
                r0.<init>()
                return
        }

        @java.lang.Deprecated
        public void getItemOffsets(@androidx.annotation.NonNull android.graphics.Rect r1, int r2, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r3) {
                r0 = this;
                r2 = 0
                r1.set(r2, r2, r2, r2)
                return
        }

        public void getItemOffsets(@androidx.annotation.NonNull android.graphics.Rect r1, @androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r3, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r4) {
                r0 = this;
                android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$LayoutParams r2 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r2
                int r2 = r2.getViewLayoutPosition()
                r0.getItemOffsets(r1, r2, r3)
                return
        }

        @java.lang.Deprecated
        public void onDraw(@androidx.annotation.NonNull android.graphics.Canvas r1, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r2) {
                r0 = this;
                return
        }

        public void onDraw(@androidx.annotation.NonNull android.graphics.Canvas r1, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r2, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r3) {
                r0 = this;
                r0.onDraw(r1, r2)
                return
        }

        @java.lang.Deprecated
        public void onDrawOver(@androidx.annotation.NonNull android.graphics.Canvas r1, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r2) {
                r0 = this;
                return
        }

        public void onDrawOver(@androidx.annotation.NonNull android.graphics.Canvas r1, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r2, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r3) {
                r0 = this;
                r0.onDrawOver(r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class LayoutManager {
        boolean mAutoMeasure;
        androidx.recyclerview.widget.ChildHelper mChildHelper;
        private int mHeight;
        private int mHeightMode;
        androidx.recyclerview.widget.ViewBoundsCheck mHorizontalBoundCheck;
        private final androidx.recyclerview.widget.ViewBoundsCheck.Callback mHorizontalBoundCheckCallback;
        boolean mIsAttachedToWindow;
        private boolean mItemPrefetchEnabled;
        private boolean mMeasurementCacheEnabled;
        int mPrefetchMaxCountObserved;
        boolean mPrefetchMaxObservedInInitialPrefetch;
        androidx.recyclerview.widget.RecyclerView mRecyclerView;
        boolean mRequestedSimpleAnimations;

        @androidx.annotation.Nullable
        androidx.recyclerview.widget.RecyclerView.SmoothScroller mSmoothScroller;
        androidx.recyclerview.widget.ViewBoundsCheck mVerticalBoundCheck;
        private final androidx.recyclerview.widget.ViewBoundsCheck.Callback mVerticalBoundCheckCallback;
        private int mWidth;
        private int mWidthMode;



        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public interface LayoutPrefetchRegistry {
            void addPosition(int r1, int r2);
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static class Properties {
            public int orientation;
            public boolean reverseLayout;
            public int spanCount;
            public boolean stackFromEnd;

            public Properties() {
                    r0 = this;
                    r0.<init>()
                    return
            }
        }

        public LayoutManager() {
                r3 = this;
                r3.<init>()
                androidx.recyclerview.widget.RecyclerView$LayoutManager$1 r0 = new androidx.recyclerview.widget.RecyclerView$LayoutManager$1
                r0.<init>(r3)
                r3.mHorizontalBoundCheckCallback = r0
                androidx.recyclerview.widget.RecyclerView$LayoutManager$2 r1 = new androidx.recyclerview.widget.RecyclerView$LayoutManager$2
                r1.<init>(r3)
                r3.mVerticalBoundCheckCallback = r1
                androidx.recyclerview.widget.ViewBoundsCheck r2 = new androidx.recyclerview.widget.ViewBoundsCheck
                r2.<init>(r0)
                r3.mHorizontalBoundCheck = r2
                androidx.recyclerview.widget.ViewBoundsCheck r0 = new androidx.recyclerview.widget.ViewBoundsCheck
                r0.<init>(r1)
                r3.mVerticalBoundCheck = r0
                r0 = 0
                r3.mRequestedSimpleAnimations = r0
                r3.mIsAttachedToWindow = r0
                r3.mAutoMeasure = r0
                r0 = 1
                r3.mMeasurementCacheEnabled = r0
                r3.mItemPrefetchEnabled = r0
                return
        }

        private void addViewInt(android.view.View r5, int r6, boolean r7) {
                r4 = this;
                androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r5)
                if (r7 != 0) goto L15
                boolean r7 = r0.isRemoved()
                if (r7 == 0) goto Ld
                goto L15
            Ld:
                androidx.recyclerview.widget.RecyclerView r7 = r4.mRecyclerView
                androidx.recyclerview.widget.ViewInfoStore r7 = r7.mViewInfoStore
                r7.removeFromDisappearedInLayout(r0)
                goto L1c
            L15:
                androidx.recyclerview.widget.RecyclerView r7 = r4.mRecyclerView
                androidx.recyclerview.widget.ViewInfoStore r7 = r7.mViewInfoStore
                r7.addToDisappearedInLayout(r0)
            L1c:
                android.view.ViewGroup$LayoutParams r7 = r5.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$LayoutParams r7 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r7
                boolean r1 = r0.wasReturnedFromScrap()
                r2 = 0
                if (r1 != 0) goto L91
                boolean r1 = r0.isScrap()
                if (r1 == 0) goto L30
                goto L91
            L30:
                android.view.ViewParent r1 = r5.getParent()
                androidx.recyclerview.widget.RecyclerView r3 = r4.mRecyclerView
                if (r1 != r3) goto L79
                androidx.recyclerview.widget.ChildHelper r1 = r4.mChildHelper
                int r1 = r1.indexOfChild(r5)
                r3 = -1
                if (r6 != r3) goto L47
                androidx.recyclerview.widget.ChildHelper r6 = r4.mChildHelper
                int r6 = r6.getChildCount()
            L47:
                if (r1 == r3) goto L53
                if (r1 == r6) goto La7
                androidx.recyclerview.widget.RecyclerView r5 = r4.mRecyclerView
                androidx.recyclerview.widget.RecyclerView$LayoutManager r5 = r5.mLayout
                r5.moveView(r1, r6)
                goto La7
            L53:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r0 = "Added View has RecyclerView as parent but view is not a real child. Unfiltered index:"
                r7.append(r0)
                androidx.recyclerview.widget.RecyclerView r0 = r4.mRecyclerView
                int r5 = r0.indexOfChild(r5)
                r7.append(r5)
                androidx.recyclerview.widget.RecyclerView r5 = r4.mRecyclerView
                java.lang.String r5 = r5.exceptionLabel()
                r7.append(r5)
                java.lang.String r5 = r7.toString()
                r6.<init>(r5)
                throw r6
            L79:
                androidx.recyclerview.widget.ChildHelper r1 = r4.mChildHelper
                r1.addView(r5, r6, r2)
                r6 = 1
                r7.mInsetsDirty = r6
                androidx.recyclerview.widget.RecyclerView$SmoothScroller r6 = r4.mSmoothScroller
                if (r6 == 0) goto La7
                boolean r6 = r6.isRunning()
                if (r6 == 0) goto La7
                androidx.recyclerview.widget.RecyclerView$SmoothScroller r6 = r4.mSmoothScroller
                r6.onChildAttachedToWindow(r5)
                goto La7
            L91:
                boolean r1 = r0.isScrap()
                if (r1 == 0) goto L9b
                r0.unScrap()
                goto L9e
            L9b:
                r0.clearReturnedFromScrapFlag()
            L9e:
                androidx.recyclerview.widget.ChildHelper r1 = r4.mChildHelper
                android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
                r1.attachViewToParent(r5, r6, r3, r2)
            La7:
                boolean r5 = r7.mPendingInvalidate
                if (r5 == 0) goto Lb2
                android.view.View r5 = r0.itemView
                r5.invalidate()
                r7.mPendingInvalidate = r2
            Lb2:
                return
        }

        public static int chooseSize(int r2, int r3, int r4) {
                int r0 = android.view.View.MeasureSpec.getMode(r2)
                int r2 = android.view.View.MeasureSpec.getSize(r2)
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r0 == r1) goto L15
                r1 = 1073741824(0x40000000, float:2.0)
                if (r0 == r1) goto L14
                int r2 = java.lang.Math.max(r3, r4)
            L14:
                return r2
            L15:
                int r3 = java.lang.Math.max(r3, r4)
                int r2 = java.lang.Math.min(r2, r3)
                return r2
        }

        private void detachViewInternal(int r1, @androidx.annotation.NonNull android.view.View r2) {
                r0 = this;
                androidx.recyclerview.widget.ChildHelper r2 = r0.mChildHelper
                r2.detachViewFromParent(r1)
                return
        }

        public static int getChildMeasureSpec(int r4, int r5, int r6, int r7, boolean r8) {
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1e
                if (r7 < 0) goto L13
            L10:
                r5 = 1073741824(0x40000000, float:2.0)
                goto L31
            L13:
                if (r7 != r1) goto L1b
                if (r5 == r2) goto L23
                if (r5 == 0) goto L1b
                if (r5 == r3) goto L23
            L1b:
                r5 = 0
                r7 = 0
                goto L31
            L1e:
                if (r7 < 0) goto L21
                goto L10
            L21:
                if (r7 != r1) goto L25
            L23:
                r7 = r4
                goto L31
            L25:
                if (r7 != r0) goto L1b
                if (r5 == r2) goto L2e
                if (r5 != r3) goto L2c
                goto L2e
            L2c:
                r5 = 0
                goto L23
            L2e:
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L23
            L31:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
        }

        @java.lang.Deprecated
        public static int getChildMeasureSpec(int r1, int r2, int r3, boolean r4) {
                int r1 = r1 - r2
                r2 = 0
                int r1 = java.lang.Math.max(r2, r1)
                r0 = 1073741824(0x40000000, float:2.0)
                if (r4 == 0) goto L11
                if (r3 < 0) goto Lf
            Lc:
                r2 = 1073741824(0x40000000, float:2.0)
                goto L21
            Lf:
                r3 = 0
                goto L21
            L11:
                if (r3 < 0) goto L14
                goto Lc
            L14:
                r4 = -1
                if (r3 != r4) goto L1b
                r2 = 1073741824(0x40000000, float:2.0)
            L19:
                r3 = r1
                goto L21
            L1b:
                r4 = -2
                if (r3 != r4) goto Lf
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L19
            L21:
                int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
                return r1
        }

        private int[] getChildRectangleOnScreenScrollAmount(android.view.View r8, android.graphics.Rect r9) {
                r7 = this;
                int r0 = r7.getPaddingLeft()
                int r1 = r7.getPaddingTop()
                int r2 = r7.getWidth()
                int r3 = r7.getPaddingRight()
                int r2 = r2 - r3
                int r3 = r7.getHeight()
                int r4 = r7.getPaddingBottom()
                int r3 = r3 - r4
                int r4 = r8.getLeft()
                int r5 = r9.left
                int r4 = r4 + r5
                int r5 = r8.getScrollX()
                int r4 = r4 - r5
                int r5 = r8.getTop()
                int r6 = r9.top
                int r5 = r5 + r6
                int r8 = r8.getScrollY()
                int r5 = r5 - r8
                int r8 = r9.width()
                int r8 = r8 + r4
                int r9 = r9.height()
                int r9 = r9 + r5
                int r4 = r4 - r0
                r0 = 0
                int r6 = java.lang.Math.min(r0, r4)
                int r5 = r5 - r1
                int r1 = java.lang.Math.min(r0, r5)
                int r8 = r8 - r2
                int r2 = java.lang.Math.max(r0, r8)
                int r9 = r9 - r3
                int r9 = java.lang.Math.max(r0, r9)
                int r0 = r7.getLayoutDirection()
                r3 = 1
                if (r0 != r3) goto L60
                if (r2 == 0) goto L5b
                goto L68
            L5b:
                int r2 = java.lang.Math.max(r6, r8)
                goto L68
            L60:
                if (r6 == 0) goto L63
                goto L67
            L63:
                int r6 = java.lang.Math.min(r4, r2)
            L67:
                r2 = r6
            L68:
                if (r1 == 0) goto L6b
                goto L6f
            L6b:
                int r1 = java.lang.Math.min(r5, r9)
            L6f:
                int[] r8 = new int[]{r2, r1}
                return r8
        }

        public static androidx.recyclerview.widget.RecyclerView.LayoutManager.Properties getProperties(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3, int r4, int r5) {
                androidx.recyclerview.widget.RecyclerView$LayoutManager$Properties r0 = new androidx.recyclerview.widget.RecyclerView$LayoutManager$Properties
                r0.<init>()
                int[] r1 = androidx.recyclerview.R.styleable.RecyclerView
                android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r1, r4, r5)
                int r3 = androidx.recyclerview.R.styleable.RecyclerView_android_orientation
                r4 = 1
                int r3 = r2.getInt(r3, r4)
                r0.orientation = r3
                int r3 = androidx.recyclerview.R.styleable.RecyclerView_spanCount
                int r3 = r2.getInt(r3, r4)
                r0.spanCount = r3
                int r3 = androidx.recyclerview.R.styleable.RecyclerView_reverseLayout
                r4 = 0
                boolean r3 = r2.getBoolean(r3, r4)
                r0.reverseLayout = r3
                int r3 = androidx.recyclerview.R.styleable.RecyclerView_stackFromEnd
                boolean r3 = r2.getBoolean(r3, r4)
                r0.stackFromEnd = r3
                r2.recycle()
                return r0
        }

        private boolean isFocusedChildVisibleAfterScrolling(androidx.recyclerview.widget.RecyclerView r7, int r8, int r9) {
                r6 = this;
                android.view.View r7 = r7.getFocusedChild()
                r0 = 0
                if (r7 != 0) goto L8
                return r0
            L8:
                int r1 = r6.getPaddingLeft()
                int r2 = r6.getPaddingTop()
                int r3 = r6.getWidth()
                int r4 = r6.getPaddingRight()
                int r3 = r3 - r4
                int r4 = r6.getHeight()
                int r5 = r6.getPaddingBottom()
                int r4 = r4 - r5
                androidx.recyclerview.widget.RecyclerView r5 = r6.mRecyclerView
                android.graphics.Rect r5 = r5.mTempRect
                r6.getDecoratedBoundsWithMargins(r7, r5)
                int r7 = r5.left
                int r7 = r7 - r8
                if (r7 >= r3) goto L40
                int r7 = r5.right
                int r7 = r7 - r8
                if (r7 <= r1) goto L40
                int r7 = r5.top
                int r7 = r7 - r9
                if (r7 >= r4) goto L40
                int r7 = r5.bottom
                int r7 = r7 - r9
                if (r7 > r2) goto L3e
                goto L40
            L3e:
                r7 = 1
                return r7
            L40:
                return r0
        }

        private static boolean isMeasurementUpToDate(int r3, int r4, int r5) {
                int r0 = android.view.View.MeasureSpec.getMode(r4)
                int r4 = android.view.View.MeasureSpec.getSize(r4)
                r1 = 0
                if (r5 <= 0) goto Le
                if (r3 == r5) goto Le
                return r1
            Le:
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = 1
                if (r0 == r5) goto L1f
                if (r0 == 0) goto L1e
                r5 = 1073741824(0x40000000, float:2.0)
                if (r0 == r5) goto L1a
                return r1
            L1a:
                if (r4 != r3) goto L1d
                return r2
            L1d:
                return r1
            L1e:
                return r2
            L1f:
                if (r4 < r3) goto L22
                return r2
            L22:
                return r1
        }

        private void scrapOrRecycleView(androidx.recyclerview.widget.RecyclerView.Recycler r3, int r4, android.view.View r5) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r5)
                boolean r1 = r0.shouldIgnore()
                if (r1 == 0) goto Lb
                return
            Lb:
                boolean r1 = r0.isInvalid()
                if (r1 == 0) goto L28
                boolean r1 = r0.isRemoved()
                if (r1 != 0) goto L28
                androidx.recyclerview.widget.RecyclerView r1 = r2.mRecyclerView
                androidx.recyclerview.widget.RecyclerView$Adapter r1 = r1.mAdapter
                boolean r1 = r1.hasStableIds()
                if (r1 != 0) goto L28
                r2.removeViewAt(r4)
                r3.recycleViewHolderInternal(r0)
                return
            L28:
                r2.detachViewAt(r4)
                r3.scrapView(r5)
                androidx.recyclerview.widget.RecyclerView r3 = r2.mRecyclerView
                androidx.recyclerview.widget.ViewInfoStore r3 = r3.mViewInfoStore
                r3.onViewDetached(r0)
                return
        }

        @android.annotation.SuppressLint({"UnknownNullness"})
        public void addDisappearingView(android.view.View r2) {
                r1 = this;
                r0 = -1
                r1.addDisappearingView(r2, r0)
                return
        }

        @android.annotation.SuppressLint({"UnknownNullness"})
        public void addDisappearingView(android.view.View r2, int r3) {
                r1 = this;
                r0 = 1
                r1.addViewInt(r2, r3, r0)
                return
        }

        @android.annotation.SuppressLint({"UnknownNullness"})
        public void addView(android.view.View r2) {
                r1 = this;
                r0 = -1
                r1.addView(r2, r0)
                return
        }

        @android.annotation.SuppressLint({"UnknownNullness"})
        public void addView(android.view.View r2, int r3) {
                r1 = this;
                r0 = 0
                r1.addViewInt(r2, r3, r0)
                return
        }

        public void assertInLayoutOrScroll(java.lang.String r2) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                if (r0 == 0) goto L7
                r0.assertInLayoutOrScroll(r2)
            L7:
                return
        }

        @android.annotation.SuppressLint({"UnknownNullness"})
        public void assertNotInLayoutOrScroll(java.lang.String r2) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                if (r0 == 0) goto L7
                r0.assertNotInLayoutOrScroll(r2)
            L7:
                return
        }

        public void attachView(@androidx.annotation.NonNull android.view.View r2) {
                r1 = this;
                r0 = -1
                r1.attachView(r2, r0)
                return
        }

        public void attachView(@androidx.annotation.NonNull android.view.View r2, int r3) {
                r1 = this;
                android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$LayoutParams r0 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r0
                r1.attachView(r2, r3, r0)
                return
        }

        public void attachView(@androidx.annotation.NonNull android.view.View r3, int r4, androidx.recyclerview.widget.RecyclerView.LayoutParams r5) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r3)
                boolean r1 = r0.isRemoved()
                if (r1 == 0) goto L12
                androidx.recyclerview.widget.RecyclerView r1 = r2.mRecyclerView
                androidx.recyclerview.widget.ViewInfoStore r1 = r1.mViewInfoStore
                r1.addToDisappearedInLayout(r0)
                goto L19
            L12:
                androidx.recyclerview.widget.RecyclerView r1 = r2.mRecyclerView
                androidx.recyclerview.widget.ViewInfoStore r1 = r1.mViewInfoStore
                r1.removeFromDisappearedInLayout(r0)
            L19:
                androidx.recyclerview.widget.ChildHelper r1 = r2.mChildHelper
                boolean r0 = r0.isRemoved()
                r1.attachViewToParent(r3, r4, r5, r0)
                return
        }

        public void calculateItemDecorationsForChild(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull android.graphics.Rect r3) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                if (r0 != 0) goto L9
                r2 = 0
                r3.set(r2, r2, r2, r2)
                return
            L9:
                android.graphics.Rect r2 = r0.getItemDecorInsetsForChild(r2)
                r3.set(r2)
                return
        }

        public boolean canScrollHorizontally() {
                r1 = this;
                r0 = 0
                return r0
        }

        public boolean canScrollVertically() {
                r1 = this;
                r0 = 0
                return r0
        }

        public boolean checkLayoutParams(androidx.recyclerview.widget.RecyclerView.LayoutParams r1) {
                r0 = this;
                if (r1 == 0) goto L4
                r1 = 1
                return r1
            L4:
                r1 = 0
                return r1
        }

        @android.annotation.SuppressLint({"UnknownNullness"})
        public void collectAdjacentPrefetchPositions(int r1, int r2, androidx.recyclerview.widget.RecyclerView.State r3, androidx.recyclerview.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry r4) {
                r0 = this;
                return
        }

        @android.annotation.SuppressLint({"UnknownNullness"})
        public void collectInitialPrefetchPositions(int r1, androidx.recyclerview.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry r2) {
                r0 = this;
                return
        }

        public int computeHorizontalScrollExtent(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public int computeHorizontalScrollOffset(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public int computeHorizontalScrollRange(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public int computeVerticalScrollExtent(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public int computeVerticalScrollOffset(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public int computeVerticalScrollRange(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public void detachAndScrapAttachedViews(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.Recycler r3) {
                r2 = this;
                int r0 = r2.getChildCount()
                int r0 = r0 + (-1)
            L6:
                if (r0 < 0) goto L12
                android.view.View r1 = r2.getChildAt(r0)
                r2.scrapOrRecycleView(r3, r0, r1)
                int r0 = r0 + (-1)
                goto L6
            L12:
                return
        }

        public void detachAndScrapView(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.Recycler r3) {
                r1 = this;
                androidx.recyclerview.widget.ChildHelper r0 = r1.mChildHelper
                int r0 = r0.indexOfChild(r2)
                r1.scrapOrRecycleView(r3, r0, r2)
                return
        }

        public void detachAndScrapViewAt(int r2, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.Recycler r3) {
                r1 = this;
                android.view.View r0 = r1.getChildAt(r2)
                r1.scrapOrRecycleView(r3, r2, r0)
                return
        }

        public void detachView(@androidx.annotation.NonNull android.view.View r2) {
                r1 = this;
                androidx.recyclerview.widget.ChildHelper r0 = r1.mChildHelper
                int r0 = r0.indexOfChild(r2)
                if (r0 < 0) goto Lb
                r1.detachViewInternal(r0, r2)
            Lb:
                return
        }

        public void detachViewAt(int r2) {
                r1 = this;
                android.view.View r0 = r1.getChildAt(r2)
                r1.detachViewInternal(r2, r0)
                return
        }

        void dispatchAttachedToWindow(androidx.recyclerview.widget.RecyclerView r2) {
                r1 = this;
                r0 = 1
                r1.mIsAttachedToWindow = r0
                r1.onAttachedToWindow(r2)
                return
        }

        void dispatchDetachedFromWindow(androidx.recyclerview.widget.RecyclerView r2, androidx.recyclerview.widget.RecyclerView.Recycler r3) {
                r1 = this;
                r0 = 0
                r1.mIsAttachedToWindow = r0
                r1.onDetachedFromWindow(r2, r3)
                return
        }

        @android.annotation.SuppressLint({"UnknownNullness"})
        public void endAnimation(android.view.View r2) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                androidx.recyclerview.widget.RecyclerView$ItemAnimator r0 = r0.mItemAnimator
                if (r0 == 0) goto Ld
                androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r2)
                r0.endAnimation(r2)
            Ld:
                return
        }

        @androidx.annotation.Nullable
        public android.view.View findContainingItemView(@androidx.annotation.NonNull android.view.View r3) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                android.view.View r3 = r0.findContainingItemView(r3)
                if (r3 != 0) goto Ld
                return r1
            Ld:
                androidx.recyclerview.widget.ChildHelper r0 = r2.mChildHelper
                boolean r0 = r0.isHidden(r3)
                if (r0 == 0) goto L16
                return r1
            L16:
                return r3
        }

        @androidx.annotation.Nullable
        public android.view.View findViewByPosition(int r6) {
                r5 = this;
                int r0 = r5.getChildCount()
                r1 = 0
            L5:
                if (r1 >= r0) goto L32
                android.view.View r2 = r5.getChildAt(r1)
                androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r2)
                if (r3 != 0) goto L12
                goto L2f
            L12:
                int r4 = r3.getLayoutPosition()
                if (r4 != r6) goto L2f
                boolean r4 = r3.shouldIgnore()
                if (r4 != 0) goto L2f
                androidx.recyclerview.widget.RecyclerView r4 = r5.mRecyclerView
                androidx.recyclerview.widget.RecyclerView$State r4 = r4.mState
                boolean r4 = r4.isPreLayout()
                if (r4 != 0) goto L2e
                boolean r3 = r3.isRemoved()
                if (r3 != 0) goto L2f
            L2e:
                return r2
            L2f:
                int r1 = r1 + 1
                goto L5
            L32:
                r6 = 0
                return r6
        }

        @android.annotation.SuppressLint({"UnknownNullness"})
        public abstract androidx.recyclerview.widget.RecyclerView.LayoutParams generateDefaultLayoutParams();

        @android.annotation.SuppressLint({"UnknownNullness"})
        public androidx.recyclerview.widget.RecyclerView.LayoutParams generateLayoutParams(android.content.Context r2, android.util.AttributeSet r3) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$LayoutParams r0 = new androidx.recyclerview.widget.RecyclerView$LayoutParams
                r0.<init>(r2, r3)
                return r0
        }

        @android.annotation.SuppressLint({"UnknownNullness"})
        public androidx.recyclerview.widget.RecyclerView.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
                r1 = this;
                boolean r0 = r2 instanceof androidx.recyclerview.widget.RecyclerView.LayoutParams
                if (r0 == 0) goto Lc
                androidx.recyclerview.widget.RecyclerView$LayoutParams r0 = new androidx.recyclerview.widget.RecyclerView$LayoutParams
                androidx.recyclerview.widget.RecyclerView$LayoutParams r2 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r2
                r0.<init>(r2)
                return r0
            Lc:
                boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
                if (r0 == 0) goto L18
                androidx.recyclerview.widget.RecyclerView$LayoutParams r0 = new androidx.recyclerview.widget.RecyclerView$LayoutParams
                android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
                r0.<init>(r2)
                return r0
            L18:
                androidx.recyclerview.widget.RecyclerView$LayoutParams r0 = new androidx.recyclerview.widget.RecyclerView$LayoutParams
                r0.<init>(r2)
                return r0
        }

        public int getBaseline() {
                r1 = this;
                r0 = -1
                return r0
        }

        public int getBottomDecorationHeight(@androidx.annotation.NonNull android.view.View r1) {
                r0 = this;
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
                android.graphics.Rect r1 = r1.mDecorInsets
                int r1 = r1.bottom
                return r1
        }

        @androidx.annotation.Nullable
        public android.view.View getChildAt(int r2) {
                r1 = this;
                androidx.recyclerview.widget.ChildHelper r0 = r1.mChildHelper
                if (r0 == 0) goto L9
                android.view.View r2 = r0.getChildAt(r2)
                return r2
            L9:
                r2 = 0
                return r2
        }

        public int getChildCount() {
                r1 = this;
                androidx.recyclerview.widget.ChildHelper r0 = r1.mChildHelper
                if (r0 == 0) goto L9
                int r0 = r0.getChildCount()
                return r0
            L9:
                r0 = 0
                return r0
        }

        public boolean getClipToPadding() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                if (r0 == 0) goto La
                boolean r0 = r0.mClipToPadding
                if (r0 == 0) goto La
                r0 = 1
                return r0
            La:
                r0 = 0
                return r0
        }

        public int getColumnCountForAccessibility(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.Recycler r1, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r2) {
                r0 = this;
                r1 = -1
                return r1
        }

        public int getDecoratedBottom(@androidx.annotation.NonNull android.view.View r2) {
                r1 = this;
                int r0 = r2.getBottom()
                int r2 = r1.getBottomDecorationHeight(r2)
                int r0 = r0 + r2
                return r0
        }

        public void getDecoratedBoundsWithMargins(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.NonNull android.graphics.Rect r2) {
                r0 = this;
                androidx.recyclerview.widget.RecyclerView.getDecoratedBoundsWithMarginsInt(r1, r2)
                return
        }

        public int getDecoratedLeft(@androidx.annotation.NonNull android.view.View r2) {
                r1 = this;
                int r0 = r2.getLeft()
                int r2 = r1.getLeftDecorationWidth(r2)
                int r0 = r0 - r2
                return r0
        }

        public int getDecoratedMeasuredHeight(@androidx.annotation.NonNull android.view.View r3) {
                r2 = this;
                android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$LayoutParams r0 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r0
                android.graphics.Rect r0 = r0.mDecorInsets
                int r3 = r3.getMeasuredHeight()
                int r1 = r0.top
                int r3 = r3 + r1
                int r0 = r0.bottom
                int r3 = r3 + r0
                return r3
        }

        public int getDecoratedMeasuredWidth(@androidx.annotation.NonNull android.view.View r3) {
                r2 = this;
                android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$LayoutParams r0 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r0
                android.graphics.Rect r0 = r0.mDecorInsets
                int r3 = r3.getMeasuredWidth()
                int r1 = r0.left
                int r3 = r3 + r1
                int r0 = r0.right
                int r3 = r3 + r0
                return r3
        }

        public int getDecoratedRight(@androidx.annotation.NonNull android.view.View r2) {
                r1 = this;
                int r0 = r2.getRight()
                int r2 = r1.getRightDecorationWidth(r2)
                int r0 = r0 + r2
                return r0
        }

        public int getDecoratedTop(@androidx.annotation.NonNull android.view.View r2) {
                r1 = this;
                int r0 = r2.getTop()
                int r2 = r1.getTopDecorationHeight(r2)
                int r0 = r0 - r2
                return r0
        }

        @androidx.annotation.Nullable
        public android.view.View getFocusedChild() {
                r3 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r3.mRecyclerView
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                android.view.View r0 = r0.getFocusedChild()
                if (r0 == 0) goto L16
                androidx.recyclerview.widget.ChildHelper r2 = r3.mChildHelper
                boolean r2 = r2.isHidden(r0)
                if (r2 == 0) goto L15
                goto L16
            L15:
                return r0
            L16:
                return r1
        }

        @androidx.annotation.Px
        public int getHeight() {
                r1 = this;
                int r0 = r1.mHeight
                return r0
        }

        public int getHeightMode() {
                r1 = this;
                int r0 = r1.mHeightMode
                return r0
        }

        public int getItemCount() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                if (r0 == 0) goto L9
                androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.getAdapter()
                goto La
            L9:
                r0 = 0
            La:
                if (r0 == 0) goto L11
                int r0 = r0.getItemCount()
                return r0
            L11:
                r0 = 0
                return r0
        }

        public int getItemViewType(@androidx.annotation.NonNull android.view.View r1) {
                r0 = this;
                androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r1)
                int r1 = r1.getItemViewType()
                return r1
        }

        public int getLayoutDirection() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                int r0 = androidx.core.view.ViewCompat.getLayoutDirection(r0)
                return r0
        }

        public int getLeftDecorationWidth(@androidx.annotation.NonNull android.view.View r1) {
                r0 = this;
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
                android.graphics.Rect r1 = r1.mDecorInsets
                int r1 = r1.left
                return r1
        }

        @androidx.annotation.Px
        public int getMinimumHeight() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                int r0 = androidx.core.view.ViewCompat.getMinimumHeight(r0)
                return r0
        }

        @androidx.annotation.Px
        public int getMinimumWidth() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                int r0 = androidx.core.view.ViewCompat.getMinimumWidth(r0)
                return r0
        }

        @androidx.annotation.Px
        public int getPaddingBottom() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                if (r0 == 0) goto L9
                int r0 = r0.getPaddingBottom()
                return r0
            L9:
                r0 = 0
                return r0
        }

        @androidx.annotation.Px
        public int getPaddingEnd() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                if (r0 == 0) goto L9
                int r0 = androidx.core.view.ViewCompat.getPaddingEnd(r0)
                return r0
            L9:
                r0 = 0
                return r0
        }

        @androidx.annotation.Px
        public int getPaddingLeft() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                if (r0 == 0) goto L9
                int r0 = r0.getPaddingLeft()
                return r0
            L9:
                r0 = 0
                return r0
        }

        @androidx.annotation.Px
        public int getPaddingRight() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                if (r0 == 0) goto L9
                int r0 = r0.getPaddingRight()
                return r0
            L9:
                r0 = 0
                return r0
        }

        @androidx.annotation.Px
        public int getPaddingStart() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                if (r0 == 0) goto L9
                int r0 = androidx.core.view.ViewCompat.getPaddingStart(r0)
                return r0
            L9:
                r0 = 0
                return r0
        }

        @androidx.annotation.Px
        public int getPaddingTop() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                if (r0 == 0) goto L9
                int r0 = r0.getPaddingTop()
                return r0
            L9:
                r0 = 0
                return r0
        }

        public int getPosition(@androidx.annotation.NonNull android.view.View r1) {
                r0 = this;
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
                int r1 = r1.getViewLayoutPosition()
                return r1
        }

        public int getRightDecorationWidth(@androidx.annotation.NonNull android.view.View r1) {
                r0 = this;
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
                android.graphics.Rect r1 = r1.mDecorInsets
                int r1 = r1.right
                return r1
        }

        public int getRowCountForAccessibility(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.Recycler r1, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r2) {
                r0 = this;
                r1 = -1
                return r1
        }

        public int getSelectionModeForAccessibility(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.Recycler r1, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        public int getTopDecorationHeight(@androidx.annotation.NonNull android.view.View r1) {
                r0 = this;
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
                android.graphics.Rect r1 = r1.mDecorInsets
                int r1 = r1.top
                return r1
        }

        public void getTransformedBoundingBox(@androidx.annotation.NonNull android.view.View r6, boolean r7, @androidx.annotation.NonNull android.graphics.Rect r8) {
                r5 = this;
                if (r7 == 0) goto L22
                android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$LayoutParams r7 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r7
                android.graphics.Rect r7 = r7.mDecorInsets
                int r0 = r7.left
                int r0 = -r0
                int r1 = r7.top
                int r1 = -r1
                int r2 = r6.getWidth()
                int r3 = r7.right
                int r2 = r2 + r3
                int r3 = r6.getHeight()
                int r7 = r7.bottom
                int r3 = r3 + r7
                r8.set(r0, r1, r2, r3)
                goto L2e
            L22:
                int r7 = r6.getWidth()
                int r0 = r6.getHeight()
                r1 = 0
                r8.set(r1, r1, r7, r0)
            L2e:
                androidx.recyclerview.widget.RecyclerView r7 = r5.mRecyclerView
                if (r7 == 0) goto L6b
                android.graphics.Matrix r7 = r6.getMatrix()
                if (r7 == 0) goto L6b
                boolean r0 = r7.isIdentity()
                if (r0 != 0) goto L6b
                androidx.recyclerview.widget.RecyclerView r0 = r5.mRecyclerView
                android.graphics.RectF r0 = r0.mTempRectF
                r0.set(r8)
                r7.mapRect(r0)
                float r7 = r0.left
                double r1 = (double) r7
                double r1 = java.lang.Math.floor(r1)
                int r7 = (int) r1
                float r1 = r0.top
                double r1 = (double) r1
                double r1 = java.lang.Math.floor(r1)
                int r1 = (int) r1
                float r2 = r0.right
                double r2 = (double) r2
                double r2 = java.lang.Math.ceil(r2)
                int r2 = (int) r2
                float r0 = r0.bottom
                double r3 = (double) r0
                double r3 = java.lang.Math.ceil(r3)
                int r0 = (int) r3
                r8.set(r7, r1, r2, r0)
            L6b:
                int r7 = r6.getLeft()
                int r6 = r6.getTop()
                r8.offset(r7, r6)
                return
        }

        @androidx.annotation.Px
        public int getWidth() {
                r1 = this;
                int r0 = r1.mWidth
                return r0
        }

        public int getWidthMode() {
                r1 = this;
                int r0 = r1.mWidthMode
                return r0
        }

        boolean hasFlexibleChildInBothOrientations() {
                r5 = this;
                int r0 = r5.getChildCount()
                r1 = 0
                r2 = 0
            L6:
                if (r2 >= r0) goto L1d
                android.view.View r3 = r5.getChildAt(r2)
                android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                int r4 = r3.width
                if (r4 >= 0) goto L1a
                int r3 = r3.height
                if (r3 >= 0) goto L1a
                r0 = 1
                return r0
            L1a:
                int r2 = r2 + 1
                goto L6
            L1d:
                return r1
        }

        public boolean hasFocus() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                if (r0 == 0) goto Lc
                boolean r0 = r0.hasFocus()
                if (r0 == 0) goto Lc
                r0 = 1
                return r0
            Lc:
                r0 = 0
                return r0
        }

        public void ignoreView(@androidx.annotation.NonNull android.view.View r3) {
                r2 = this;
                android.view.ViewParent r0 = r3.getParent()
                androidx.recyclerview.widget.RecyclerView r1 = r2.mRecyclerView
                if (r0 != r1) goto L20
                int r0 = r1.indexOfChild(r3)
                r1 = -1
                if (r0 == r1) goto L20
                androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r3)
                r0 = 128(0x80, float:1.8E-43)
                r3.addFlags(r0)
                androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
                androidx.recyclerview.widget.ViewInfoStore r0 = r0.mViewInfoStore
                r0.removeViewHolder(r3)
                return
            L20:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "View should be fully attached to be ignored"
                r0.append(r1)
                androidx.recyclerview.widget.RecyclerView r1 = r2.mRecyclerView
                java.lang.String r1 = r1.exceptionLabel()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }

        public boolean isAttachedToWindow() {
                r1 = this;
                boolean r0 = r1.mIsAttachedToWindow
                return r0
        }

        public boolean isAutoMeasureEnabled() {
                r1 = this;
                boolean r0 = r1.mAutoMeasure
                return r0
        }

        public boolean isFocused() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                if (r0 == 0) goto Lc
                boolean r0 = r0.isFocused()
                if (r0 == 0) goto Lc
                r0 = 1
                return r0
            Lc:
                r0 = 0
                return r0
        }

        public final boolean isItemPrefetchEnabled() {
                r1 = this;
                boolean r0 = r1.mItemPrefetchEnabled
                return r0
        }

        public boolean isLayoutHierarchical(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.Recycler r1, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        public boolean isMeasurementCacheEnabled() {
                r1 = this;
                boolean r0 = r1.mMeasurementCacheEnabled
                return r0
        }

        public boolean isSmoothScrolling() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$SmoothScroller r0 = r1.mSmoothScroller
                if (r0 == 0) goto Lc
                boolean r0 = r0.isRunning()
                if (r0 == 0) goto Lc
                r0 = 1
                return r0
            Lc:
                r0 = 0
                return r0
        }

        public boolean isViewPartiallyVisible(@androidx.annotation.NonNull android.view.View r3, boolean r4, boolean r5) {
                r2 = this;
                androidx.recyclerview.widget.ViewBoundsCheck r5 = r2.mHorizontalBoundCheck
                r0 = 24579(0x6003, float:3.4443E-41)
                boolean r5 = r5.isViewWithinBoundFlags(r3, r0)
                r1 = 1
                if (r5 == 0) goto L15
                androidx.recyclerview.widget.ViewBoundsCheck r5 = r2.mVerticalBoundCheck
                boolean r3 = r5.isViewWithinBoundFlags(r3, r0)
                if (r3 == 0) goto L15
                r3 = 1
                goto L16
            L15:
                r3 = 0
            L16:
                if (r4 == 0) goto L19
                return r3
            L19:
                r3 = r3 ^ r1
                return r3
        }

        public void layoutDecorated(@androidx.annotation.NonNull android.view.View r3, int r4, int r5, int r6, int r7) {
                r2 = this;
                android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$LayoutParams r0 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r0
                android.graphics.Rect r0 = r0.mDecorInsets
                int r1 = r0.left
                int r4 = r4 + r1
                int r1 = r0.top
                int r5 = r5 + r1
                int r1 = r0.right
                int r6 = r6 - r1
                int r0 = r0.bottom
                int r7 = r7 - r0
                r3.layout(r4, r5, r6, r7)
                return
        }

        public void layoutDecoratedWithMargins(@androidx.annotation.NonNull android.view.View r4, int r5, int r6, int r7, int r8) {
                r3 = this;
                android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$LayoutParams r0 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r0
                android.graphics.Rect r1 = r0.mDecorInsets
                int r2 = r1.left
                int r5 = r5 + r2
                int r2 = r0.leftMargin
                int r5 = r5 + r2
                int r2 = r1.top
                int r6 = r6 + r2
                int r2 = r0.topMargin
                int r6 = r6 + r2
                int r2 = r1.right
                int r7 = r7 - r2
                int r2 = r0.rightMargin
                int r7 = r7 - r2
                int r1 = r1.bottom
                int r8 = r8 - r1
                int r0 = r0.bottomMargin
                int r8 = r8 - r0
                r4.layout(r5, r6, r7, r8)
                return
        }

        public void measureChild(@androidx.annotation.NonNull android.view.View r6, int r7, int r8) {
                r5 = this;
                android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$LayoutParams r0 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r0
                androidx.recyclerview.widget.RecyclerView r1 = r5.mRecyclerView
                android.graphics.Rect r1 = r1.getItemDecorInsetsForChild(r6)
                int r2 = r1.left
                int r3 = r1.right
                int r2 = r2 + r3
                int r7 = r7 + r2
                int r2 = r1.top
                int r1 = r1.bottom
                int r2 = r2 + r1
                int r8 = r8 + r2
                int r1 = r5.getWidth()
                int r2 = r5.getWidthMode()
                int r3 = r5.getPaddingLeft()
                int r4 = r5.getPaddingRight()
                int r3 = r3 + r4
                int r3 = r3 + r7
                int r7 = r0.width
                boolean r4 = r5.canScrollHorizontally()
                int r7 = getChildMeasureSpec(r1, r2, r3, r7, r4)
                int r1 = r5.getHeight()
                int r2 = r5.getHeightMode()
                int r3 = r5.getPaddingTop()
                int r4 = r5.getPaddingBottom()
                int r3 = r3 + r4
                int r3 = r3 + r8
                int r8 = r0.height
                boolean r4 = r5.canScrollVertically()
                int r8 = getChildMeasureSpec(r1, r2, r3, r8, r4)
                boolean r0 = r5.shouldMeasureChild(r6, r7, r8, r0)
                if (r0 == 0) goto L59
                r6.measure(r7, r8)
            L59:
                return
        }

        public void measureChildWithMargins(@androidx.annotation.NonNull android.view.View r6, int r7, int r8) {
                r5 = this;
                android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$LayoutParams r0 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r0
                androidx.recyclerview.widget.RecyclerView r1 = r5.mRecyclerView
                android.graphics.Rect r1 = r1.getItemDecorInsetsForChild(r6)
                int r2 = r1.left
                int r3 = r1.right
                int r2 = r2 + r3
                int r7 = r7 + r2
                int r2 = r1.top
                int r1 = r1.bottom
                int r2 = r2 + r1
                int r8 = r8 + r2
                int r1 = r5.getWidth()
                int r2 = r5.getWidthMode()
                int r3 = r5.getPaddingLeft()
                int r4 = r5.getPaddingRight()
                int r3 = r3 + r4
                int r4 = r0.leftMargin
                int r3 = r3 + r4
                int r4 = r0.rightMargin
                int r3 = r3 + r4
                int r3 = r3 + r7
                int r7 = r0.width
                boolean r4 = r5.canScrollHorizontally()
                int r7 = getChildMeasureSpec(r1, r2, r3, r7, r4)
                int r1 = r5.getHeight()
                int r2 = r5.getHeightMode()
                int r3 = r5.getPaddingTop()
                int r4 = r5.getPaddingBottom()
                int r3 = r3 + r4
                int r4 = r0.topMargin
                int r3 = r3 + r4
                int r4 = r0.bottomMargin
                int r3 = r3 + r4
                int r3 = r3 + r8
                int r8 = r0.height
                boolean r4 = r5.canScrollVertically()
                int r8 = getChildMeasureSpec(r1, r2, r3, r8, r4)
                boolean r0 = r5.shouldMeasureChild(r6, r7, r8, r0)
                if (r0 == 0) goto L65
                r6.measure(r7, r8)
            L65:
                return
        }

        public void moveView(int r3, int r4) {
                r2 = this;
                android.view.View r0 = r2.getChildAt(r3)
                if (r0 == 0) goto Ld
                r2.detachViewAt(r3)
                r2.attachView(r0, r4)
                return
            Ld:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Cannot move a child from non-existing index:"
                r0.append(r1)
                r0.append(r3)
                androidx.recyclerview.widget.RecyclerView r3 = r2.mRecyclerView
                java.lang.String r3 = r3.toString()
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r4.<init>(r3)
                throw r4
        }

        public void offsetChildrenHorizontal(@androidx.annotation.Px int r2) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                if (r0 == 0) goto L7
                r0.offsetChildrenHorizontal(r2)
            L7:
                return
        }

        public void offsetChildrenVertical(@androidx.annotation.Px int r2) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                if (r0 == 0) goto L7
                r0.offsetChildrenVertical(r2)
            L7:
                return
        }

        public void onAdapterChanged(@androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerView.Adapter r1, @androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerView.Adapter r2) {
                r0 = this;
                return
        }

        public boolean onAddFocusables(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r1, @androidx.annotation.NonNull java.util.ArrayList<android.view.View> r2, int r3, int r4) {
                r0 = this;
                r1 = 0
                return r1
        }

        @androidx.annotation.CallSuper
        public void onAttachedToWindow(androidx.recyclerview.widget.RecyclerView r1) {
                r0 = this;
                return
        }

        @java.lang.Deprecated
        public void onDetachedFromWindow(androidx.recyclerview.widget.RecyclerView r1) {
                r0 = this;
                return
        }

        @android.annotation.SuppressLint({"UnknownNullness"})
        @androidx.annotation.CallSuper
        public void onDetachedFromWindow(androidx.recyclerview.widget.RecyclerView r1, androidx.recyclerview.widget.RecyclerView.Recycler r2) {
                r0 = this;
                r0.onDetachedFromWindow(r1)
                return
        }

        @androidx.annotation.Nullable
        public android.view.View onFocusSearchFailed(@androidx.annotation.NonNull android.view.View r1, int r2, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.Recycler r3, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r4) {
                r0 = this;
                r1 = 0
                return r1
        }

        public void onInitializeAccessibilityEvent(@androidx.annotation.NonNull android.view.accessibility.AccessibilityEvent r3) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
                androidx.recyclerview.widget.RecyclerView$Recycler r1 = r0.mRecycler
                androidx.recyclerview.widget.RecyclerView$State r0 = r0.mState
                r2.onInitializeAccessibilityEvent(r1, r0, r3)
                return
        }

        public void onInitializeAccessibilityEvent(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.Recycler r2, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r3, @androidx.annotation.NonNull android.view.accessibility.AccessibilityEvent r4) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r2 = r1.mRecyclerView
                if (r2 == 0) goto L39
                if (r4 != 0) goto L7
                goto L39
            L7:
                r3 = 1
                boolean r2 = r2.canScrollVertically(r3)
                if (r2 != 0) goto L29
                androidx.recyclerview.widget.RecyclerView r2 = r1.mRecyclerView
                r0 = -1
                boolean r2 = r2.canScrollVertically(r0)
                if (r2 != 0) goto L29
                androidx.recyclerview.widget.RecyclerView r2 = r1.mRecyclerView
                boolean r2 = r2.canScrollHorizontally(r0)
                if (r2 != 0) goto L29
                androidx.recyclerview.widget.RecyclerView r2 = r1.mRecyclerView
                boolean r2 = r2.canScrollHorizontally(r3)
                if (r2 == 0) goto L28
                goto L29
            L28:
                r3 = 0
            L29:
                r4.setScrollable(r3)
                androidx.recyclerview.widget.RecyclerView r2 = r1.mRecyclerView
                androidx.recyclerview.widget.RecyclerView$Adapter r2 = r2.mAdapter
                if (r2 == 0) goto L39
                int r2 = r2.getItemCount()
                r4.setItemCount(r2)
            L39:
                return
        }

        void onInitializeAccessibilityNodeInfo(androidx.core.view.accessibility.AccessibilityNodeInfoCompat r3) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
                androidx.recyclerview.widget.RecyclerView$Recycler r1 = r0.mRecycler
                androidx.recyclerview.widget.RecyclerView$State r0 = r0.mState
                r2.onInitializeAccessibilityNodeInfo(r1, r0, r3)
                return
        }

        public void onInitializeAccessibilityNodeInfo(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.Recycler r4, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r5, @androidx.annotation.NonNull androidx.core.view.accessibility.AccessibilityNodeInfoCompat r6) {
                r3 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r3.mRecyclerView
                r1 = -1
                boolean r0 = r0.canScrollVertically(r1)
                r2 = 1
                if (r0 != 0) goto L12
                androidx.recyclerview.widget.RecyclerView r0 = r3.mRecyclerView
                boolean r0 = r0.canScrollHorizontally(r1)
                if (r0 == 0) goto L1a
            L12:
                r0 = 8192(0x2000, float:1.148E-41)
                r6.addAction(r0)
                r6.setScrollable(r2)
            L1a:
                androidx.recyclerview.widget.RecyclerView r0 = r3.mRecyclerView
                boolean r0 = r0.canScrollVertically(r2)
                if (r0 != 0) goto L2a
                androidx.recyclerview.widget.RecyclerView r0 = r3.mRecyclerView
                boolean r0 = r0.canScrollHorizontally(r2)
                if (r0 == 0) goto L32
            L2a:
                r0 = 4096(0x1000, float:5.74E-42)
                r6.addAction(r0)
                r6.setScrollable(r2)
            L32:
                int r0 = r3.getRowCountForAccessibility(r4, r5)
                int r1 = r3.getColumnCountForAccessibility(r4, r5)
                boolean r2 = r3.isLayoutHierarchical(r4, r5)
                int r4 = r3.getSelectionModeForAccessibility(r4, r5)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionInfoCompat r4 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(r0, r1, r2, r4)
                r6.setCollectionInfo(r4)
                return
        }

        void onInitializeAccessibilityNodeInfoForItem(android.view.View r3, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r4) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r3)
                if (r0 == 0) goto L1f
                boolean r1 = r0.isRemoved()
                if (r1 != 0) goto L1f
                androidx.recyclerview.widget.ChildHelper r1 = r2.mChildHelper
                android.view.View r0 = r0.itemView
                boolean r0 = r1.isHidden(r0)
                if (r0 != 0) goto L1f
                androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
                androidx.recyclerview.widget.RecyclerView$Recycler r1 = r0.mRecycler
                androidx.recyclerview.widget.RecyclerView$State r0 = r0.mState
                r2.onInitializeAccessibilityNodeInfoForItem(r1, r0, r3, r4)
            L1f:
                return
        }

        public void onInitializeAccessibilityNodeInfoForItem(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.Recycler r1, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r2, @androidx.annotation.NonNull android.view.View r3, @androidx.annotation.NonNull androidx.core.view.accessibility.AccessibilityNodeInfoCompat r4) {
                r0 = this;
                return
        }

        @androidx.annotation.Nullable
        public android.view.View onInterceptFocusSearch(@androidx.annotation.NonNull android.view.View r1, int r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        public void onItemsAdded(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r1, int r2, int r3) {
                r0 = this;
                return
        }

        public void onItemsChanged(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r1) {
                r0 = this;
                return
        }

        public void onItemsMoved(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r1, int r2, int r3, int r4) {
                r0 = this;
                return
        }

        public void onItemsRemoved(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r1, int r2, int r3) {
                r0 = this;
                return
        }

        public void onItemsUpdated(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r1, int r2, int r3) {
                r0 = this;
                return
        }

        public void onItemsUpdated(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r1, int r2, int r3, @androidx.annotation.Nullable java.lang.Object r4) {
                r0 = this;
                r0.onItemsUpdated(r1, r2, r3)
                return
        }

        @android.annotation.SuppressLint({"UnknownNullness"})
        public void onLayoutChildren(androidx.recyclerview.widget.RecyclerView.Recycler r1, androidx.recyclerview.widget.RecyclerView.State r2) {
                r0 = this;
                return
        }

        @android.annotation.SuppressLint({"UnknownNullness"})
        public void onLayoutCompleted(androidx.recyclerview.widget.RecyclerView.State r1) {
                r0 = this;
                return
        }

        public void onMeasure(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.Recycler r1, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r2, int r3, int r4) {
                r0 = this;
                androidx.recyclerview.widget.RecyclerView r1 = r0.mRecyclerView
                r1.defaultOnMeasure(r3, r4)
                return
        }

        @java.lang.Deprecated
        public boolean onRequestChildFocus(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r1, @androidx.annotation.NonNull android.view.View r2, @androidx.annotation.Nullable android.view.View r3) {
                r0 = this;
                boolean r2 = r0.isSmoothScrolling()
                if (r2 != 0) goto Lf
                boolean r1 = r1.isComputingLayout()
                if (r1 == 0) goto Ld
                goto Lf
            Ld:
                r1 = 0
                return r1
            Lf:
                r1 = 1
                return r1
        }

        public boolean onRequestChildFocus(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r1, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r2, @androidx.annotation.NonNull android.view.View r3, @androidx.annotation.Nullable android.view.View r4) {
                r0 = this;
                boolean r1 = r0.onRequestChildFocus(r1, r3, r4)
                return r1
        }

        @android.annotation.SuppressLint({"UnknownNullness"})
        public void onRestoreInstanceState(android.os.Parcelable r1) {
                r0 = this;
                return
        }

        @androidx.annotation.Nullable
        public android.os.Parcelable onSaveInstanceState() {
                r1 = this;
                r0 = 0
                return r0
        }

        public void onScrollStateChanged(int r1) {
                r0 = this;
                return
        }

        void onSmoothScrollerStopped(androidx.recyclerview.widget.RecyclerView.SmoothScroller r2) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$SmoothScroller r0 = r1.mSmoothScroller
                if (r0 != r2) goto L7
                r2 = 0
                r1.mSmoothScroller = r2
            L7:
                return
        }

        boolean performAccessibilityAction(int r3, @androidx.annotation.Nullable android.os.Bundle r4) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
                androidx.recyclerview.widget.RecyclerView$Recycler r1 = r0.mRecycler
                androidx.recyclerview.widget.RecyclerView$State r0 = r0.mState
                boolean r3 = r2.performAccessibilityAction(r1, r0, r3, r4)
                return r3
        }

        public boolean performAccessibilityAction(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.Recycler r9, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r10, int r11, @androidx.annotation.Nullable android.os.Bundle r12) {
                r8 = this;
                androidx.recyclerview.widget.RecyclerView r9 = r8.mRecyclerView
                r10 = 0
                if (r9 != 0) goto L6
                return r10
            L6:
                int r9 = r8.getHeight()
                int r12 = r8.getWidth()
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                androidx.recyclerview.widget.RecyclerView r1 = r8.mRecyclerView
                android.graphics.Matrix r1 = r1.getMatrix()
                boolean r1 = r1.isIdentity()
                if (r1 == 0) goto L2f
                androidx.recyclerview.widget.RecyclerView r1 = r8.mRecyclerView
                boolean r1 = r1.getGlobalVisibleRect(r0)
                if (r1 == 0) goto L2f
                int r9 = r0.height()
                int r12 = r0.width()
            L2f:
                r0 = 4096(0x1000, float:5.74E-42)
                r1 = 1
                if (r11 == r0) goto L6a
                r0 = 8192(0x2000, float:1.148E-41)
                if (r11 == r0) goto L3b
                r3 = 0
                r4 = 0
                goto L92
            L3b:
                androidx.recyclerview.widget.RecyclerView r11 = r8.mRecyclerView
                r0 = -1
                boolean r11 = r11.canScrollVertically(r0)
                if (r11 == 0) goto L50
                int r11 = r8.getPaddingTop()
                int r9 = r9 - r11
                int r11 = r8.getPaddingBottom()
                int r9 = r9 - r11
                int r9 = -r9
                goto L51
            L50:
                r9 = 0
            L51:
                androidx.recyclerview.widget.RecyclerView r11 = r8.mRecyclerView
                boolean r11 = r11.canScrollHorizontally(r0)
                if (r11 == 0) goto L67
                int r11 = r8.getPaddingLeft()
                int r12 = r12 - r11
                int r11 = r8.getPaddingRight()
                int r12 = r12 - r11
                int r11 = -r12
            L64:
                r4 = r9
                r3 = r11
                goto L92
            L67:
                r4 = r9
                r3 = 0
                goto L92
            L6a:
                androidx.recyclerview.widget.RecyclerView r11 = r8.mRecyclerView
                boolean r11 = r11.canScrollVertically(r1)
                if (r11 == 0) goto L7d
                int r11 = r8.getPaddingTop()
                int r9 = r9 - r11
                int r11 = r8.getPaddingBottom()
                int r9 = r9 - r11
                goto L7e
            L7d:
                r9 = 0
            L7e:
                androidx.recyclerview.widget.RecyclerView r11 = r8.mRecyclerView
                boolean r11 = r11.canScrollHorizontally(r1)
                if (r11 == 0) goto L67
                int r11 = r8.getPaddingLeft()
                int r12 = r12 - r11
                int r11 = r8.getPaddingRight()
                int r11 = r12 - r11
                goto L64
            L92:
                if (r4 != 0) goto L97
                if (r3 != 0) goto L97
                return r10
            L97:
                androidx.recyclerview.widget.RecyclerView r2 = r8.mRecyclerView
                r6 = -2147483648(0xffffffff80000000, float:-0.0)
                r7 = 1
                r5 = 0
                r2.smoothScrollBy(r3, r4, r5, r6, r7)
                return r1
        }

        boolean performAccessibilityActionForItem(@androidx.annotation.NonNull android.view.View r8, int r9, @androidx.annotation.Nullable android.os.Bundle r10) {
                r7 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r7.mRecyclerView
                androidx.recyclerview.widget.RecyclerView$Recycler r2 = r0.mRecycler
                androidx.recyclerview.widget.RecyclerView$State r3 = r0.mState
                r1 = r7
                r4 = r8
                r5 = r9
                r6 = r10
                boolean r8 = r1.performAccessibilityActionForItem(r2, r3, r4, r5, r6)
                return r8
        }

        public boolean performAccessibilityActionForItem(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.Recycler r1, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r2, @androidx.annotation.NonNull android.view.View r3, int r4, @androidx.annotation.Nullable android.os.Bundle r5) {
                r0 = this;
                r1 = 0
                return r1
        }

        public void postOnAnimation(java.lang.Runnable r2) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                if (r0 == 0) goto L7
                androidx.core.view.ViewCompat.postOnAnimation(r0, r2)
            L7:
                return
        }

        public void removeAllViews() {
                r2 = this;
                int r0 = r2.getChildCount()
                int r0 = r0 + (-1)
            L6:
                if (r0 < 0) goto L10
                androidx.recyclerview.widget.ChildHelper r1 = r2.mChildHelper
                r1.removeViewAt(r0)
                int r0 = r0 + (-1)
                goto L6
            L10:
                return
        }

        public void removeAndRecycleAllViews(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.Recycler r3) {
                r2 = this;
                int r0 = r2.getChildCount()
                int r0 = r0 + (-1)
            L6:
                if (r0 < 0) goto L1c
                android.view.View r1 = r2.getChildAt(r0)
                androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r1)
                boolean r1 = r1.shouldIgnore()
                if (r1 != 0) goto L19
                r2.removeAndRecycleViewAt(r0, r3)
            L19:
                int r0 = r0 + (-1)
                goto L6
            L1c:
                return
        }

        void removeAndRecycleScrapInt(androidx.recyclerview.widget.RecyclerView.Recycler r7) {
                r6 = this;
                int r0 = r7.getScrapCount()
                int r1 = r0 + (-1)
            L6:
                if (r1 < 0) goto L39
                android.view.View r2 = r7.getScrapViewAt(r1)
                androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r2)
                boolean r4 = r3.shouldIgnore()
                if (r4 == 0) goto L17
                goto L36
            L17:
                r4 = 0
                r3.setIsRecyclable(r4)
                boolean r5 = r3.isTmpDetached()
                if (r5 == 0) goto L26
                androidx.recyclerview.widget.RecyclerView r5 = r6.mRecyclerView
                r5.removeDetachedView(r2, r4)
            L26:
                androidx.recyclerview.widget.RecyclerView r4 = r6.mRecyclerView
                androidx.recyclerview.widget.RecyclerView$ItemAnimator r4 = r4.mItemAnimator
                if (r4 == 0) goto L2f
                r4.endAnimation(r3)
            L2f:
                r4 = 1
                r3.setIsRecyclable(r4)
                r7.quickRecycleScrapView(r2)
            L36:
                int r1 = r1 + (-1)
                goto L6
            L39:
                r7.clearScrap()
                if (r0 <= 0) goto L43
                androidx.recyclerview.widget.RecyclerView r7 = r6.mRecyclerView
                r7.invalidate()
            L43:
                return
        }

        public void removeAndRecycleView(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.Recycler r2) {
                r0 = this;
                r0.removeView(r1)
                r2.recycleView(r1)
                return
        }

        public void removeAndRecycleViewAt(int r2, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.Recycler r3) {
                r1 = this;
                android.view.View r0 = r1.getChildAt(r2)
                r1.removeViewAt(r2)
                r3.recycleView(r0)
                return
        }

        public boolean removeCallbacks(java.lang.Runnable r2) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                if (r0 == 0) goto L9
                boolean r2 = r0.removeCallbacks(r2)
                return r2
            L9:
                r2 = 0
                return r2
        }

        public void removeDetachedView(@androidx.annotation.NonNull android.view.View r3) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
                r1 = 0
                r0.removeDetachedView(r3, r1)
                return
        }

        @android.annotation.SuppressLint({"UnknownNullness"})
        public void removeView(android.view.View r2) {
                r1 = this;
                androidx.recyclerview.widget.ChildHelper r0 = r1.mChildHelper
                r0.removeView(r2)
                return
        }

        public void removeViewAt(int r2) {
                r1 = this;
                android.view.View r0 = r1.getChildAt(r2)
                if (r0 == 0) goto Lb
                androidx.recyclerview.widget.ChildHelper r0 = r1.mChildHelper
                r0.removeViewAt(r2)
            Lb:
                return
        }

        public boolean requestChildRectangleOnScreen(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r7, @androidx.annotation.NonNull android.view.View r8, @androidx.annotation.NonNull android.graphics.Rect r9, boolean r10) {
                r6 = this;
                r5 = 0
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r9
                r4 = r10
                boolean r7 = r0.requestChildRectangleOnScreen(r1, r2, r3, r4, r5)
                return r7
        }

        public boolean requestChildRectangleOnScreen(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r3, @androidx.annotation.NonNull android.view.View r4, @androidx.annotation.NonNull android.graphics.Rect r5, boolean r6, boolean r7) {
                r2 = this;
                int[] r4 = r2.getChildRectangleOnScreenScrollAmount(r4, r5)
                r5 = 0
                r0 = r4[r5]
                r1 = 1
                r4 = r4[r1]
                if (r7 == 0) goto L12
                boolean r7 = r2.isFocusedChildVisibleAfterScrolling(r3, r0, r4)
                if (r7 == 0) goto L17
            L12:
                if (r0 != 0) goto L18
                if (r4 == 0) goto L17
                goto L18
            L17:
                return r5
            L18:
                if (r6 == 0) goto L1e
                r3.scrollBy(r0, r4)
                goto L21
            L1e:
                r3.smoothScrollBy(r0, r4)
            L21:
                return r1
        }

        public void requestLayout() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                if (r0 == 0) goto L7
                r0.requestLayout()
            L7:
                return
        }

        public void requestSimpleAnimationsInNextLayout() {
                r1 = this;
                r0 = 1
                r1.mRequestedSimpleAnimations = r0
                return
        }

        @android.annotation.SuppressLint({"UnknownNullness"})
        public int scrollHorizontallyBy(int r1, androidx.recyclerview.widget.RecyclerView.Recycler r2, androidx.recyclerview.widget.RecyclerView.State r3) {
                r0 = this;
                r1 = 0
                return r1
        }

        public void scrollToPosition(int r1) {
                r0 = this;
                return
        }

        @android.annotation.SuppressLint({"UnknownNullness"})
        public int scrollVerticallyBy(int r1, androidx.recyclerview.widget.RecyclerView.Recycler r2, androidx.recyclerview.widget.RecyclerView.State r3) {
                r0 = this;
                r1 = 0
                return r1
        }

        @java.lang.Deprecated
        public void setAutoMeasureEnabled(boolean r1) {
                r0 = this;
                r0.mAutoMeasure = r1
                return
        }

        void setExactMeasureSpecsFrom(androidx.recyclerview.widget.RecyclerView r3) {
                r2 = this;
                int r0 = r3.getWidth()
                r1 = 1073741824(0x40000000, float:2.0)
                int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
                int r3 = r3.getHeight()
                int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r1)
                r2.setMeasureSpecs(r0, r3)
                return
        }

        public final void setItemPrefetchEnabled(boolean r2) {
                r1 = this;
                boolean r0 = r1.mItemPrefetchEnabled
                if (r2 == r0) goto L12
                r1.mItemPrefetchEnabled = r2
                r2 = 0
                r1.mPrefetchMaxCountObserved = r2
                androidx.recyclerview.widget.RecyclerView r2 = r1.mRecyclerView
                if (r2 == 0) goto L12
                androidx.recyclerview.widget.RecyclerView$Recycler r2 = r2.mRecycler
                r2.updateViewCacheSize()
            L12:
                return
        }

        void setMeasureSpecs(int r2, int r3) {
                r1 = this;
                int r0 = android.view.View.MeasureSpec.getSize(r2)
                r1.mWidth = r0
                int r2 = android.view.View.MeasureSpec.getMode(r2)
                r1.mWidthMode = r2
                r0 = 0
                if (r2 != 0) goto L15
                boolean r2 = androidx.recyclerview.widget.RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC
                if (r2 != 0) goto L15
                r1.mWidth = r0
            L15:
                int r2 = android.view.View.MeasureSpec.getSize(r3)
                r1.mHeight = r2
                int r2 = android.view.View.MeasureSpec.getMode(r3)
                r1.mHeightMode = r2
                if (r2 != 0) goto L29
                boolean r2 = androidx.recyclerview.widget.RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC
                if (r2 != 0) goto L29
                r1.mHeight = r0
            L29:
                return
        }

        public void setMeasuredDimension(int r2, int r3) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                androidx.recyclerview.widget.RecyclerView.access$300(r0, r2, r3)
                return
        }

        public void setMeasuredDimension(android.graphics.Rect r3, int r4, int r5) {
                r2 = this;
                int r0 = r3.width()
                int r1 = r2.getPaddingLeft()
                int r0 = r0 + r1
                int r1 = r2.getPaddingRight()
                int r0 = r0 + r1
                int r3 = r3.height()
                int r1 = r2.getPaddingTop()
                int r3 = r3 + r1
                int r1 = r2.getPaddingBottom()
                int r3 = r3 + r1
                int r1 = r2.getMinimumWidth()
                int r4 = chooseSize(r4, r0, r1)
                int r0 = r2.getMinimumHeight()
                int r3 = chooseSize(r5, r3, r0)
                r2.setMeasuredDimension(r4, r3)
                return
        }

        void setMeasuredDimensionFromChildren(int r9, int r10) {
                r8 = this;
                int r0 = r8.getChildCount()
                if (r0 != 0) goto Lc
                androidx.recyclerview.widget.RecyclerView r0 = r8.mRecyclerView
                r0.defaultOnMeasure(r9, r10)
                return
            Lc:
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = 2147483647(0x7fffffff, float:NaN)
                r3 = 0
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 2147483647(0x7fffffff, float:NaN)
                r4 = 2147483647(0x7fffffff, float:NaN)
                r5 = 0
            L1b:
                if (r5 >= r0) goto L3f
                android.view.View r6 = r8.getChildAt(r5)
                androidx.recyclerview.widget.RecyclerView r7 = r8.mRecyclerView
                android.graphics.Rect r7 = r7.mTempRect
                r8.getDecoratedBoundsWithMargins(r6, r7)
                int r6 = r7.left
                if (r6 >= r3) goto L2d
                r3 = r6
            L2d:
                int r6 = r7.right
                if (r6 <= r1) goto L32
                r1 = r6
            L32:
                int r6 = r7.top
                if (r6 >= r4) goto L37
                r4 = r6
            L37:
                int r6 = r7.bottom
                if (r6 <= r2) goto L3c
                r2 = r6
            L3c:
                int r5 = r5 + 1
                goto L1b
            L3f:
                androidx.recyclerview.widget.RecyclerView r0 = r8.mRecyclerView
                android.graphics.Rect r0 = r0.mTempRect
                r0.set(r3, r4, r1, r2)
                androidx.recyclerview.widget.RecyclerView r0 = r8.mRecyclerView
                android.graphics.Rect r0 = r0.mTempRect
                r8.setMeasuredDimension(r0, r9, r10)
                return
        }

        public void setMeasurementCacheEnabled(boolean r1) {
                r0 = this;
                r0.mMeasurementCacheEnabled = r1
                return
        }

        void setRecyclerView(androidx.recyclerview.widget.RecyclerView r2) {
                r1 = this;
                if (r2 != 0) goto Ld
                r2 = 0
                r1.mRecyclerView = r2
                r1.mChildHelper = r2
                r2 = 0
                r1.mWidth = r2
                r1.mHeight = r2
                goto L1f
            Ld:
                r1.mRecyclerView = r2
                androidx.recyclerview.widget.ChildHelper r0 = r2.mChildHelper
                r1.mChildHelper = r0
                int r0 = r2.getWidth()
                r1.mWidth = r0
                int r2 = r2.getHeight()
                r1.mHeight = r2
            L1f:
                r2 = 1073741824(0x40000000, float:2.0)
                r1.mWidthMode = r2
                r1.mHeightMode = r2
                return
        }

        boolean shouldMeasureChild(android.view.View r3, int r4, int r5, androidx.recyclerview.widget.RecyclerView.LayoutParams r6) {
                r2 = this;
                boolean r0 = r3.isLayoutRequested()
                if (r0 != 0) goto L25
                boolean r0 = r2.mMeasurementCacheEnabled
                if (r0 == 0) goto L25
                int r0 = r3.getWidth()
                int r1 = r6.width
                boolean r4 = isMeasurementUpToDate(r0, r4, r1)
                if (r4 == 0) goto L25
                int r3 = r3.getHeight()
                int r4 = r6.height
                boolean r3 = isMeasurementUpToDate(r3, r5, r4)
                if (r3 != 0) goto L23
                goto L25
            L23:
                r3 = 0
                return r3
            L25:
                r3 = 1
                return r3
        }

        boolean shouldMeasureTwice() {
                r1 = this;
                r0 = 0
                return r0
        }

        boolean shouldReMeasureChild(android.view.View r3, int r4, int r5, androidx.recyclerview.widget.RecyclerView.LayoutParams r6) {
                r2 = this;
                boolean r0 = r2.mMeasurementCacheEnabled
                if (r0 == 0) goto L1f
                int r0 = r3.getMeasuredWidth()
                int r1 = r6.width
                boolean r4 = isMeasurementUpToDate(r0, r4, r1)
                if (r4 == 0) goto L1f
                int r3 = r3.getMeasuredHeight()
                int r4 = r6.height
                boolean r3 = isMeasurementUpToDate(r3, r5, r4)
                if (r3 != 0) goto L1d
                goto L1f
            L1d:
                r3 = 0
                return r3
            L1f:
                r3 = 1
                return r3
        }

        @android.annotation.SuppressLint({"UnknownNullness"})
        public void smoothScrollToPosition(androidx.recyclerview.widget.RecyclerView r1, androidx.recyclerview.widget.RecyclerView.State r2, int r3) {
                r0 = this;
                return
        }

        @android.annotation.SuppressLint({"UnknownNullness"})
        public void startSmoothScroll(androidx.recyclerview.widget.RecyclerView.SmoothScroller r2) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$SmoothScroller r0 = r1.mSmoothScroller
                if (r0 == 0) goto L11
                if (r2 == r0) goto L11
                boolean r0 = r0.isRunning()
                if (r0 == 0) goto L11
                androidx.recyclerview.widget.RecyclerView$SmoothScroller r0 = r1.mSmoothScroller
                r0.stop()
            L11:
                r1.mSmoothScroller = r2
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                r2.start(r0, r1)
                return
        }

        public void stopIgnoringView(@androidx.annotation.NonNull android.view.View r2) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r2)
                r2.stopIgnoring()
                r2.resetInternal()
                r0 = 4
                r2.addFlags(r0)
                return
        }

        void stopSmoothScroller() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$SmoothScroller r0 = r1.mSmoothScroller
                if (r0 == 0) goto L7
                r0.stop()
            L7:
                return
        }

        public boolean supportsPredictiveItemAnimations() {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        final android.graphics.Rect mDecorInsets;
        boolean mInsetsDirty;
        boolean mPendingInvalidate;
        androidx.recyclerview.widget.RecyclerView.ViewHolder mViewHolder;

        public LayoutParams(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                r0.mDecorInsets = r1
                r1 = 1
                r0.mInsetsDirty = r1
                r1 = 0
                r0.mPendingInvalidate = r1
                return
        }

        public LayoutParams(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                r0.mDecorInsets = r1
                r1 = 1
                r0.mInsetsDirty = r1
                r1 = 0
                r0.mPendingInvalidate = r1
                return
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                r0.mDecorInsets = r1
                r1 = 1
                r0.mInsetsDirty = r1
                r1 = 0
                r0.mPendingInvalidate = r1
                return
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                r0.mDecorInsets = r1
                r1 = 1
                r0.mInsetsDirty = r1
                r1 = 0
                r0.mPendingInvalidate = r1
                return
        }

        public LayoutParams(androidx.recyclerview.widget.RecyclerView.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                r0.mDecorInsets = r1
                r1 = 1
                r0.mInsetsDirty = r1
                r1 = 0
                r0.mPendingInvalidate = r1
                return
        }

        public int getAbsoluteAdapterPosition() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r1.mViewHolder
                int r0 = r0.getAbsoluteAdapterPosition()
                return r0
        }

        public int getBindingAdapterPosition() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r1.mViewHolder
                int r0 = r0.getBindingAdapterPosition()
                return r0
        }

        @java.lang.Deprecated
        public int getViewAdapterPosition() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r1.mViewHolder
                int r0 = r0.getBindingAdapterPosition()
                return r0
        }

        public int getViewLayoutPosition() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r1.mViewHolder
                int r0 = r0.getLayoutPosition()
                return r0
        }

        @java.lang.Deprecated
        public int getViewPosition() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r1.mViewHolder
                int r0 = r0.getPosition()
                return r0
        }

        public boolean isItemChanged() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r1.mViewHolder
                boolean r0 = r0.isUpdated()
                return r0
        }

        public boolean isItemRemoved() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r1.mViewHolder
                boolean r0 = r0.isRemoved()
                return r0
        }

        public boolean isViewInvalid() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r1.mViewHolder
                boolean r0 = r0.isInvalid()
                return r0
        }

        public boolean viewNeedsUpdate() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r1.mViewHolder
                boolean r0 = r0.needsUpdate()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnChildAttachStateChangeListener {
        void onChildViewAttachedToWindow(@androidx.annotation.NonNull android.view.View r1);

        void onChildViewDetachedFromWindow(@androidx.annotation.NonNull android.view.View r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class OnFlingListener {
        public OnFlingListener() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract boolean onFling(int r1, int r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnItemTouchListener {
        boolean onInterceptTouchEvent(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r1, @androidx.annotation.NonNull android.view.MotionEvent r2);

        void onRequestDisallowInterceptTouchEvent(boolean r1);

        void onTouchEvent(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r1, @androidx.annotation.NonNull android.view.MotionEvent r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class OnScrollListener {
        public OnScrollListener() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onScrollStateChanged(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r1, int r2) {
                r0 = this;
                return
        }

        public void onScrolled(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r1, int r2, int r3) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface Orientation {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class RecycledViewPool {
        private static final int DEFAULT_MAX_SCRAP = 5;
        int mAttachCountForClearing;
        java.util.Set<androidx.recyclerview.widget.RecyclerView.Adapter<?>> mAttachedAdaptersForPoolingContainer;
        android.util.SparseArray<androidx.recyclerview.widget.RecyclerView.RecycledViewPool.ScrapData> mScrap;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        static class ScrapData {
            long mBindRunningAverageNs;
            long mCreateRunningAverageNs;
            int mMaxScrap;
            final java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ViewHolder> mScrapHeap;

            ScrapData() {
                    r2 = this;
                    r2.<init>()
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    r2.mScrapHeap = r0
                    r0 = 5
                    r2.mMaxScrap = r0
                    r0 = 0
                    r2.mCreateRunningAverageNs = r0
                    r2.mBindRunningAverageNs = r0
                    return
            }
        }

        public RecycledViewPool() {
                r1 = this;
                r1.<init>()
                android.util.SparseArray r0 = new android.util.SparseArray
                r0.<init>()
                r1.mScrap = r0
                r0 = 0
                r1.mAttachCountForClearing = r0
                java.util.IdentityHashMap r0 = new java.util.IdentityHashMap
                r0.<init>()
                java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
                r1.mAttachedAdaptersForPoolingContainer = r0
                return
        }

        private androidx.recyclerview.widget.RecyclerView.RecycledViewPool.ScrapData getScrapDataForType(int r3) {
                r2 = this;
                android.util.SparseArray<androidx.recyclerview.widget.RecyclerView$RecycledViewPool$ScrapData> r0 = r2.mScrap
                java.lang.Object r0 = r0.get(r3)
                androidx.recyclerview.widget.RecyclerView$RecycledViewPool$ScrapData r0 = (androidx.recyclerview.widget.RecyclerView.RecycledViewPool.ScrapData) r0
                if (r0 != 0) goto L14
                androidx.recyclerview.widget.RecyclerView$RecycledViewPool$ScrapData r0 = new androidx.recyclerview.widget.RecyclerView$RecycledViewPool$ScrapData
                r0.<init>()
                android.util.SparseArray<androidx.recyclerview.widget.RecyclerView$RecycledViewPool$ScrapData> r1 = r2.mScrap
                r1.put(r3, r0)
            L14:
                return r0
        }

        void attach() {
                r1 = this;
                int r0 = r1.mAttachCountForClearing
                int r0 = r0 + 1
                r1.mAttachCountForClearing = r0
                return
        }

        void attachForPoolingContainer(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.Adapter<?> r2) {
                r1 = this;
                java.util.Set<androidx.recyclerview.widget.RecyclerView$Adapter<?>> r0 = r1.mAttachedAdaptersForPoolingContainer
                r0.add(r2)
                return
        }

        public void clear() {
                r4 = this;
                r0 = 0
            L1:
                android.util.SparseArray<androidx.recyclerview.widget.RecyclerView$RecycledViewPool$ScrapData> r1 = r4.mScrap
                int r1 = r1.size()
                if (r0 >= r1) goto L31
                android.util.SparseArray<androidx.recyclerview.widget.RecyclerView$RecycledViewPool$ScrapData> r1 = r4.mScrap
                java.lang.Object r1 = r1.valueAt(r0)
                androidx.recyclerview.widget.RecyclerView$RecycledViewPool$ScrapData r1 = (androidx.recyclerview.widget.RecyclerView.RecycledViewPool.ScrapData) r1
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r2 = r1.mScrapHeap
                java.util.Iterator r2 = r2.iterator()
            L17:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L29
                java.lang.Object r3 = r2.next()
                androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r3
                android.view.View r3 = r3.itemView
                androidx.customview.poolingcontainer.PoolingContainer.callPoolingContainerOnRelease(r3)
                goto L17
            L29:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r1 = r1.mScrapHeap
                r1.clear()
                int r0 = r0 + 1
                goto L1
            L31:
                return
        }

        void detach() {
                r1 = this;
                int r0 = r1.mAttachCountForClearing
                int r0 = r0 + (-1)
                r1.mAttachCountForClearing = r0
                return
        }

        void detachForPoolingContainer(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.Adapter<?> r4, boolean r5) {
                r3 = this;
                java.util.Set<androidx.recyclerview.widget.RecyclerView$Adapter<?>> r0 = r3.mAttachedAdaptersForPoolingContainer
                r0.remove(r4)
                java.util.Set<androidx.recyclerview.widget.RecyclerView$Adapter<?>> r4 = r3.mAttachedAdaptersForPoolingContainer
                int r4 = r4.size()
                if (r4 != 0) goto L3f
                if (r5 != 0) goto L3f
                r4 = 0
                r5 = 0
            L11:
                android.util.SparseArray<androidx.recyclerview.widget.RecyclerView$RecycledViewPool$ScrapData> r0 = r3.mScrap
                int r0 = r0.size()
                if (r5 >= r0) goto L3f
                android.util.SparseArray<androidx.recyclerview.widget.RecyclerView$RecycledViewPool$ScrapData> r0 = r3.mScrap
                int r1 = r0.keyAt(r5)
                java.lang.Object r0 = r0.get(r1)
                androidx.recyclerview.widget.RecyclerView$RecycledViewPool$ScrapData r0 = (androidx.recyclerview.widget.RecyclerView.RecycledViewPool.ScrapData) r0
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r0.mScrapHeap
                r1 = 0
            L28:
                int r2 = r0.size()
                if (r1 >= r2) goto L3c
                java.lang.Object r2 = r0.get(r1)
                androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r2
                android.view.View r2 = r2.itemView
                androidx.customview.poolingcontainer.PoolingContainer.callPoolingContainerOnRelease(r2)
                int r1 = r1 + 1
                goto L28
            L3c:
                int r5 = r5 + 1
                goto L11
            L3f:
                return
        }

        void factorInBindTime(int r3, long r4) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView$RecycledViewPool$ScrapData r3 = r2.getScrapDataForType(r3)
                long r0 = r3.mBindRunningAverageNs
                long r4 = r2.runningAverage(r0, r4)
                r3.mBindRunningAverageNs = r4
                return
        }

        void factorInCreateTime(int r3, long r4) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView$RecycledViewPool$ScrapData r3 = r2.getScrapDataForType(r3)
                long r0 = r3.mCreateRunningAverageNs
                long r4 = r2.runningAverage(r0, r4)
                r3.mCreateRunningAverageNs = r4
                return
        }

        @androidx.annotation.Nullable
        public androidx.recyclerview.widget.RecyclerView.ViewHolder getRecycledView(int r3) {
                r2 = this;
                android.util.SparseArray<androidx.recyclerview.widget.RecyclerView$RecycledViewPool$ScrapData> r0 = r2.mScrap
                java.lang.Object r3 = r0.get(r3)
                androidx.recyclerview.widget.RecyclerView$RecycledViewPool$ScrapData r3 = (androidx.recyclerview.widget.RecyclerView.RecycledViewPool.ScrapData) r3
                if (r3 == 0) goto L32
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r3.mScrapHeap
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L32
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r3 = r3.mScrapHeap
                int r0 = r3.size()
                int r0 = r0 + (-1)
            L1a:
                if (r0 < 0) goto L32
                java.lang.Object r1 = r3.get(r0)
                androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r1
                boolean r1 = r1.isAttachedToTransitionOverlay()
                if (r1 != 0) goto L2f
                java.lang.Object r3 = r3.remove(r0)
                androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r3
                return r3
            L2f:
                int r0 = r0 + (-1)
                goto L1a
            L32:
                r3 = 0
                return r3
        }

        public int getRecycledViewCount(int r1) {
                r0 = this;
                androidx.recyclerview.widget.RecyclerView$RecycledViewPool$ScrapData r1 = r0.getScrapDataForType(r1)
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r1 = r1.mScrapHeap
                int r1 = r1.size()
                return r1
        }

        void onAdapterChanged(androidx.recyclerview.widget.RecyclerView.Adapter<?> r1, androidx.recyclerview.widget.RecyclerView.Adapter<?> r2, boolean r3) {
                r0 = this;
                if (r1 == 0) goto L5
                r0.detach()
            L5:
                if (r3 != 0) goto Le
                int r1 = r0.mAttachCountForClearing
                if (r1 != 0) goto Le
                r0.clear()
            Le:
                if (r2 == 0) goto L13
                r0.attach()
            L13:
                return
        }

        public void putRecycledView(androidx.recyclerview.widget.RecyclerView.ViewHolder r4) {
                r3 = this;
                int r0 = r4.getItemViewType()
                androidx.recyclerview.widget.RecyclerView$RecycledViewPool$ScrapData r1 = r3.getScrapDataForType(r0)
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r1 = r1.mScrapHeap
                android.util.SparseArray<androidx.recyclerview.widget.RecyclerView$RecycledViewPool$ScrapData> r2 = r3.mScrap
                java.lang.Object r0 = r2.get(r0)
                androidx.recyclerview.widget.RecyclerView$RecycledViewPool$ScrapData r0 = (androidx.recyclerview.widget.RecyclerView.RecycledViewPool.ScrapData) r0
                int r0 = r0.mMaxScrap
                int r2 = r1.size()
                if (r0 > r2) goto L20
                android.view.View r4 = r4.itemView
                androidx.customview.poolingcontainer.PoolingContainer.callPoolingContainerOnRelease(r4)
                return
            L20:
                r4.resetInternal()
                r1.add(r4)
                return
        }

        long runningAverage(long r5, long r7) {
                r4 = this;
                r0 = 0
                int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r2 != 0) goto L7
                return r7
            L7:
                r0 = 4
                long r5 = r5 / r0
                r2 = 3
                long r5 = r5 * r2
                long r7 = r7 / r0
                long r5 = r5 + r7
                return r5
        }

        public void setMaxRecycledViews(int r2, int r3) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$RecycledViewPool$ScrapData r2 = r1.getScrapDataForType(r2)
                r2.mMaxScrap = r3
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r2 = r2.mScrapHeap
            L8:
                int r0 = r2.size()
                if (r0 <= r3) goto L18
                int r0 = r2.size()
                int r0 = r0 + (-1)
                r2.remove(r0)
                goto L8
            L18:
                return
        }

        int size() {
                r3 = this;
                r0 = 0
                r1 = 0
            L2:
                android.util.SparseArray<androidx.recyclerview.widget.RecyclerView$RecycledViewPool$ScrapData> r2 = r3.mScrap
                int r2 = r2.size()
                if (r0 >= r2) goto L1e
                android.util.SparseArray<androidx.recyclerview.widget.RecyclerView$RecycledViewPool$ScrapData> r2 = r3.mScrap
                java.lang.Object r2 = r2.valueAt(r0)
                androidx.recyclerview.widget.RecyclerView$RecycledViewPool$ScrapData r2 = (androidx.recyclerview.widget.RecyclerView.RecycledViewPool.ScrapData) r2
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r2 = r2.mScrapHeap
                if (r2 == 0) goto L1b
                int r2 = r2.size()
                int r1 = r1 + r2
            L1b:
                int r0 = r0 + 1
                goto L2
            L1e:
                return r1
        }

        boolean willBindInTime(int r5, long r6, long r8) {
                r4 = this;
                androidx.recyclerview.widget.RecyclerView$RecycledViewPool$ScrapData r5 = r4.getScrapDataForType(r5)
                long r0 = r5.mBindRunningAverageNs
                r2 = 0
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 == 0) goto L14
                long r6 = r6 + r0
                int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r5 >= 0) goto L12
                goto L14
            L12:
                r5 = 0
                return r5
            L14:
                r5 = 1
                return r5
        }

        boolean willCreateInTime(int r5, long r6, long r8) {
                r4 = this;
                androidx.recyclerview.widget.RecyclerView$RecycledViewPool$ScrapData r5 = r4.getScrapDataForType(r5)
                long r0 = r5.mCreateRunningAverageNs
                r2 = 0
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 == 0) goto L14
                long r6 = r6 + r0
                int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r5 >= 0) goto L12
                goto L14
            L12:
                r5 = 0
                return r5
            L14:
                r5 = 1
                return r5
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public final class Recycler {
        static final int DEFAULT_CACHE_SIZE = 2;
        final java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ViewHolder> mAttachedScrap;
        final java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ViewHolder> mCachedViews;
        java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ViewHolder> mChangedScrap;
        androidx.recyclerview.widget.RecyclerView.RecycledViewPool mRecyclerPool;
        private int mRequestedCacheMax;
        private final java.util.List<androidx.recyclerview.widget.RecyclerView.ViewHolder> mUnmodifiableAttachedScrap;
        private androidx.recyclerview.widget.RecyclerView.ViewCacheExtension mViewCacheExtension;
        int mViewCacheMax;
        final /* synthetic */ androidx.recyclerview.widget.RecyclerView this$0;

        public Recycler(androidx.recyclerview.widget.RecyclerView r2) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r1.mAttachedScrap = r2
                r0 = 0
                r1.mChangedScrap = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mCachedViews = r0
                java.util.List r2 = java.util.Collections.unmodifiableList(r2)
                r1.mUnmodifiableAttachedScrap = r2
                r2 = 2
                r1.mRequestedCacheMax = r2
                r1.mViewCacheMax = r2
                return
        }

        private void attachAccessibilityDelegateOnBind(androidx.recyclerview.widget.RecyclerView.ViewHolder r3) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r2.this$0
                boolean r0 = r0.isAccessibilityEnabled()
                if (r0 == 0) goto L2c
                android.view.View r3 = r3.itemView
                int r0 = androidx.core.view.ViewCompat.getImportantForAccessibility(r3)
                if (r0 != 0) goto L14
                r0 = 1
                androidx.core.view.ViewCompat.setImportantForAccessibility(r3, r0)
            L14:
                androidx.recyclerview.widget.RecyclerView r0 = r2.this$0
                androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate r0 = r0.mAccessibilityDelegate
                if (r0 != 0) goto L1b
                goto L2c
            L1b:
                androidx.core.view.AccessibilityDelegateCompat r0 = r0.getItemDelegate()
                boolean r1 = r0 instanceof androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate.ItemDelegate
                if (r1 == 0) goto L29
                r1 = r0
                androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate$ItemDelegate r1 = (androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate.ItemDelegate) r1
                r1.saveOriginalDelegate(r3)
            L29:
                androidx.core.view.ViewCompat.setAccessibilityDelegate(r3, r0)
            L2c:
                return
        }

        private void invalidateDisplayListInt(android.view.ViewGroup r5, boolean r6) {
                r4 = this;
                int r0 = r5.getChildCount()
                r1 = 1
                int r0 = r0 - r1
            L6:
                if (r0 < 0) goto L18
                android.view.View r2 = r5.getChildAt(r0)
                boolean r3 = r2 instanceof android.view.ViewGroup
                if (r3 == 0) goto L15
                android.view.ViewGroup r2 = (android.view.ViewGroup) r2
                r4.invalidateDisplayListInt(r2, r1)
            L15:
                int r0 = r0 + (-1)
                goto L6
            L18:
                if (r6 != 0) goto L1b
                return
            L1b:
                int r6 = r5.getVisibility()
                r0 = 4
                if (r6 != r0) goto L2a
                r6 = 0
                r5.setVisibility(r6)
                r5.setVisibility(r0)
                return
            L2a:
                int r6 = r5.getVisibility()
                r5.setVisibility(r0)
                r5.setVisibility(r6)
                return
        }

        private void invalidateDisplayListInt(androidx.recyclerview.widget.RecyclerView.ViewHolder r2) {
                r1 = this;
                android.view.View r2 = r2.itemView
                boolean r0 = r2 instanceof android.view.ViewGroup
                if (r0 == 0) goto Lc
                android.view.ViewGroup r2 = (android.view.ViewGroup) r2
                r0 = 0
                r1.invalidateDisplayListInt(r2, r0)
            Lc:
                return
        }

        private void maybeSendPoolingContainerAttach() {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView$RecycledViewPool r0 = r2.mRecyclerPool
                if (r0 == 0) goto L19
                androidx.recyclerview.widget.RecyclerView r0 = r2.this$0
                androidx.recyclerview.widget.RecyclerView$Adapter r1 = r0.mAdapter
                if (r1 == 0) goto L19
                boolean r0 = r0.isAttachedToWindow()
                if (r0 == 0) goto L19
                androidx.recyclerview.widget.RecyclerView$RecycledViewPool r0 = r2.mRecyclerPool
                androidx.recyclerview.widget.RecyclerView r1 = r2.this$0
                androidx.recyclerview.widget.RecyclerView$Adapter r1 = r1.mAdapter
                r0.attachForPoolingContainer(r1)
            L19:
                return
        }

        private void poolingContainerDetach(androidx.recyclerview.widget.RecyclerView.Adapter<?> r2) {
                r1 = this;
                r0 = 0
                r1.poolingContainerDetach(r2, r0)
                return
        }

        private void poolingContainerDetach(androidx.recyclerview.widget.RecyclerView.Adapter<?> r2, boolean r3) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$RecycledViewPool r0 = r1.mRecyclerPool
                if (r0 == 0) goto L7
                r0.detachForPoolingContainer(r2, r3)
            L7:
                return
        }

        private boolean tryBindViewHolderByDeadline(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r8, int r9, int r10, long r11) {
                r7 = this;
                r0 = 0
                r8.mBindingAdapter = r0
                androidx.recyclerview.widget.RecyclerView r0 = r7.this$0
                r8.mOwnerRecyclerView = r0
                int r2 = r8.getItemViewType()
                androidx.recyclerview.widget.RecyclerView r0 = r7.this$0
                long r3 = r0.getNanoTime()
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
                if (r5 == 0) goto L25
                androidx.recyclerview.widget.RecyclerView$RecycledViewPool r1 = r7.mRecyclerPool
                r5 = r11
                boolean r11 = r1.willBindInTime(r2, r3, r5)
                if (r11 != 0) goto L25
                r8 = 0
                return r8
            L25:
                androidx.recyclerview.widget.RecyclerView r11 = r7.this$0
                androidx.recyclerview.widget.RecyclerView$Adapter r11 = r11.mAdapter
                r11.bindViewHolder(r8, r9)
                androidx.recyclerview.widget.RecyclerView r9 = r7.this$0
                long r11 = r9.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$RecycledViewPool r9 = r7.mRecyclerPool
                int r0 = r8.getItemViewType()
                long r11 = r11 - r3
                r9.factorInBindTime(r0, r11)
                r7.attachAccessibilityDelegateOnBind(r8)
                androidx.recyclerview.widget.RecyclerView r9 = r7.this$0
                androidx.recyclerview.widget.RecyclerView$State r9 = r9.mState
                boolean r9 = r9.isPreLayout()
                if (r9 == 0) goto L4b
                r8.mPreLayoutPosition = r10
            L4b:
                r8 = 1
                return r8
        }

        void addViewHolderToRecycledViewPool(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r5, boolean r6) {
                r4 = this;
                androidx.recyclerview.widget.RecyclerView.clearNestedRecyclerViewIfNotNested(r5)
                android.view.View r0 = r5.itemView
                androidx.recyclerview.widget.RecyclerView r1 = r4.this$0
                androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate r1 = r1.mAccessibilityDelegate
                r2 = 0
                if (r1 == 0) goto L1f
                androidx.core.view.AccessibilityDelegateCompat r1 = r1.getItemDelegate()
                boolean r3 = r1 instanceof androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate.ItemDelegate
                if (r3 == 0) goto L1b
                androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate$ItemDelegate r1 = (androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate.ItemDelegate) r1
                androidx.core.view.AccessibilityDelegateCompat r1 = r1.getAndRemoveOriginalDelegateForItem(r0)
                goto L1c
            L1b:
                r1 = r2
            L1c:
                androidx.core.view.ViewCompat.setAccessibilityDelegate(r0, r1)
            L1f:
                if (r6 == 0) goto L24
                r4.dispatchViewRecycled(r5)
            L24:
                r5.mBindingAdapter = r2
                r5.mOwnerRecyclerView = r2
                androidx.recyclerview.widget.RecyclerView$RecycledViewPool r6 = r4.getRecycledViewPool()
                r6.putRecycledView(r5)
                return
        }

        public void bindViewToPosition(@androidx.annotation.NonNull android.view.View r7, int r8) {
                r6 = this;
                androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r7)
                if (r1 == 0) goto L9e
                androidx.recyclerview.widget.RecyclerView r7 = r6.this$0
                androidx.recyclerview.widget.AdapterHelper r7 = r7.mAdapterHelper
                int r2 = r7.findPositionOffset(r8)
                if (r2 < 0) goto L64
                androidx.recyclerview.widget.RecyclerView r7 = r6.this$0
                androidx.recyclerview.widget.RecyclerView$Adapter r7 = r7.mAdapter
                int r7 = r7.getItemCount()
                if (r2 >= r7) goto L64
                r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r0 = r6
                r3 = r8
                r0.tryBindViewHolderByDeadline(r1, r2, r3, r4)
                android.view.View r7 = r1.itemView
                android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
                if (r7 != 0) goto L3a
                androidx.recyclerview.widget.RecyclerView r7 = r0.this$0
                android.view.ViewGroup$LayoutParams r7 = r7.generateDefaultLayoutParams()
                androidx.recyclerview.widget.RecyclerView$LayoutParams r7 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r7
                android.view.View r8 = r1.itemView
                r8.setLayoutParams(r7)
                goto L52
            L3a:
                androidx.recyclerview.widget.RecyclerView r8 = r0.this$0
                boolean r8 = r8.checkLayoutParams(r7)
                if (r8 != 0) goto L50
                androidx.recyclerview.widget.RecyclerView r8 = r0.this$0
                android.view.ViewGroup$LayoutParams r7 = r8.generateLayoutParams(r7)
                androidx.recyclerview.widget.RecyclerView$LayoutParams r7 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r7
                android.view.View r8 = r1.itemView
                r8.setLayoutParams(r7)
                goto L52
            L50:
                androidx.recyclerview.widget.RecyclerView$LayoutParams r7 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r7
            L52:
                r8 = 1
                r7.mInsetsDirty = r8
                r7.mViewHolder = r1
                android.view.View r1 = r1.itemView
                android.view.ViewParent r1 = r1.getParent()
                if (r1 != 0) goto L60
                goto L61
            L60:
                r8 = 0
            L61:
                r7.mPendingInvalidate = r8
                return
            L64:
                r0 = r6
                r3 = r8
                java.lang.IndexOutOfBoundsException r7 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r1 = "Inconsistency detected. Invalid item position "
                r8.append(r1)
                r8.append(r3)
                java.lang.String r1 = "(offset:"
                r8.append(r1)
                r8.append(r2)
                java.lang.String r1 = ").state:"
                r8.append(r1)
                androidx.recyclerview.widget.RecyclerView r1 = r0.this$0
                androidx.recyclerview.widget.RecyclerView$State r1 = r1.mState
                int r1 = r1.getItemCount()
                r8.append(r1)
                androidx.recyclerview.widget.RecyclerView r1 = r0.this$0
                java.lang.String r1 = r1.exceptionLabel()
                r8.append(r1)
                java.lang.String r8 = r8.toString()
                r7.<init>(r8)
                throw r7
            L9e:
                r0 = r6
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r1 = "The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter"
                r8.append(r1)
                androidx.recyclerview.widget.RecyclerView r1 = r0.this$0
                java.lang.String r1 = r1.exceptionLabel()
                r8.append(r1)
                java.lang.String r8 = r8.toString()
                r7.<init>(r8)
                throw r7
        }

        public void clear() {
                r1 = this;
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r1.mAttachedScrap
                r0.clear()
                r1.recycleAndClearCachedViews()
                return
        }

        void clearOldPositions() {
                r4 = this;
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r4.mCachedViews
                int r0 = r0.size()
                r1 = 0
                r2 = 0
            L8:
                if (r2 >= r0) goto L18
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r3 = r4.mCachedViews
                java.lang.Object r3 = r3.get(r2)
                androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r3
                r3.clearOldPosition()
                int r2 = r2 + 1
                goto L8
            L18:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r4.mAttachedScrap
                int r0 = r0.size()
                r2 = 0
            L1f:
                if (r2 >= r0) goto L2f
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r3 = r4.mAttachedScrap
                java.lang.Object r3 = r3.get(r2)
                androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r3
                r3.clearOldPosition()
                int r2 = r2 + 1
                goto L1f
            L2f:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r4.mChangedScrap
                if (r0 == 0) goto L47
                int r0 = r0.size()
            L37:
                if (r1 >= r0) goto L47
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r2 = r4.mChangedScrap
                java.lang.Object r2 = r2.get(r1)
                androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r2
                r2.clearOldPosition()
                int r1 = r1 + 1
                goto L37
            L47:
                return
        }

        void clearScrap() {
                r1 = this;
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r1.mAttachedScrap
                r0.clear()
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r1.mChangedScrap
                if (r0 == 0) goto Lc
                r0.clear()
            Lc:
                return
        }

        public int convertPreLayoutPositionToPostLayout(int r4) {
                r3 = this;
                if (r4 < 0) goto L20
                androidx.recyclerview.widget.RecyclerView r0 = r3.this$0
                androidx.recyclerview.widget.RecyclerView$State r0 = r0.mState
                int r0 = r0.getItemCount()
                if (r4 >= r0) goto L20
                androidx.recyclerview.widget.RecyclerView r0 = r3.this$0
                androidx.recyclerview.widget.RecyclerView$State r0 = r0.mState
                boolean r0 = r0.isPreLayout()
                if (r0 != 0) goto L17
                return r4
            L17:
                androidx.recyclerview.widget.RecyclerView r0 = r3.this$0
                androidx.recyclerview.widget.AdapterHelper r0 = r0.mAdapterHelper
                int r4 = r0.findPositionOffset(r4)
                return r4
            L20:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "invalid position "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = ". State item count is "
                r1.append(r4)
                androidx.recyclerview.widget.RecyclerView r4 = r3.this$0
                androidx.recyclerview.widget.RecyclerView$State r4 = r4.mState
                int r4 = r4.getItemCount()
                r1.append(r4)
                androidx.recyclerview.widget.RecyclerView r4 = r3.this$0
                java.lang.String r4 = r4.exceptionLabel()
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        void dispatchViewRecycled(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r4) {
                r3 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r3.this$0
                androidx.recyclerview.widget.RecyclerView$RecyclerListener r0 = r0.mRecyclerListener
                if (r0 == 0) goto L9
                r0.onViewRecycled(r4)
            L9:
                androidx.recyclerview.widget.RecyclerView r0 = r3.this$0
                java.util.List<androidx.recyclerview.widget.RecyclerView$RecyclerListener> r0 = r0.mRecyclerListeners
                int r0 = r0.size()
                r1 = 0
            L12:
                if (r1 >= r0) goto L24
                androidx.recyclerview.widget.RecyclerView r2 = r3.this$0
                java.util.List<androidx.recyclerview.widget.RecyclerView$RecyclerListener> r2 = r2.mRecyclerListeners
                java.lang.Object r2 = r2.get(r1)
                androidx.recyclerview.widget.RecyclerView$RecyclerListener r2 = (androidx.recyclerview.widget.RecyclerView.RecyclerListener) r2
                r2.onViewRecycled(r4)
                int r1 = r1 + 1
                goto L12
            L24:
                androidx.recyclerview.widget.RecyclerView r0 = r3.this$0
                androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.mAdapter
                if (r0 == 0) goto L2d
                r0.onViewRecycled(r4)
            L2d:
                androidx.recyclerview.widget.RecyclerView r0 = r3.this$0
                androidx.recyclerview.widget.RecyclerView$State r1 = r0.mState
                if (r1 == 0) goto L38
                androidx.recyclerview.widget.ViewInfoStore r0 = r0.mViewInfoStore
                r0.removeViewHolder(r4)
            L38:
                return
        }

        androidx.recyclerview.widget.RecyclerView.ViewHolder getChangedScrapViewForPosition(int r10) {
                r9 = this;
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r9.mChangedScrap
                r1 = 0
                if (r0 == 0) goto L72
                int r0 = r0.size()
                if (r0 != 0) goto Lc
                goto L72
            Lc:
                r2 = 0
                r3 = 0
            Le:
                r4 = 32
                if (r3 >= r0) goto L2d
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r5 = r9.mChangedScrap
                java.lang.Object r5 = r5.get(r3)
                androidx.recyclerview.widget.RecyclerView$ViewHolder r5 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r5
                boolean r6 = r5.wasReturnedFromScrap()
                if (r6 != 0) goto L2a
                int r6 = r5.getLayoutPosition()
                if (r6 != r10) goto L2a
                r5.addFlags(r4)
                return r5
            L2a:
                int r3 = r3 + 1
                goto Le
            L2d:
                androidx.recyclerview.widget.RecyclerView r3 = r9.this$0
                androidx.recyclerview.widget.RecyclerView$Adapter r3 = r3.mAdapter
                boolean r3 = r3.hasStableIds()
                if (r3 == 0) goto L72
                androidx.recyclerview.widget.RecyclerView r3 = r9.this$0
                androidx.recyclerview.widget.AdapterHelper r3 = r3.mAdapterHelper
                int r10 = r3.findPositionOffset(r10)
                if (r10 <= 0) goto L72
                androidx.recyclerview.widget.RecyclerView r3 = r9.this$0
                androidx.recyclerview.widget.RecyclerView$Adapter r3 = r3.mAdapter
                int r3 = r3.getItemCount()
                if (r10 >= r3) goto L72
                androidx.recyclerview.widget.RecyclerView r3 = r9.this$0
                androidx.recyclerview.widget.RecyclerView$Adapter r3 = r3.mAdapter
                long r5 = r3.getItemId(r10)
            L53:
                if (r2 >= r0) goto L72
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r10 = r9.mChangedScrap
                java.lang.Object r10 = r10.get(r2)
                androidx.recyclerview.widget.RecyclerView$ViewHolder r10 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r10
                boolean r3 = r10.wasReturnedFromScrap()
                if (r3 != 0) goto L6f
                long r7 = r10.getItemId()
                int r3 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r3 != 0) goto L6f
                r10.addFlags(r4)
                return r10
            L6f:
                int r2 = r2 + 1
                goto L53
            L72:
                return r1
        }

        androidx.recyclerview.widget.RecyclerView.RecycledViewPool getRecycledViewPool() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$RecycledViewPool r0 = r1.mRecyclerPool
                if (r0 != 0) goto Le
                androidx.recyclerview.widget.RecyclerView$RecycledViewPool r0 = new androidx.recyclerview.widget.RecyclerView$RecycledViewPool
                r0.<init>()
                r1.mRecyclerPool = r0
                r1.maybeSendPoolingContainerAttach()
            Le:
                androidx.recyclerview.widget.RecyclerView$RecycledViewPool r0 = r1.mRecyclerPool
                return r0
        }

        int getScrapCount() {
                r1 = this;
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r1.mAttachedScrap
                int r0 = r0.size()
                return r0
        }

        @androidx.annotation.NonNull
        public java.util.List<androidx.recyclerview.widget.RecyclerView.ViewHolder> getScrapList() {
                r1 = this;
                java.util.List<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r1.mUnmodifiableAttachedScrap
                return r0
        }

        androidx.recyclerview.widget.RecyclerView.ViewHolder getScrapOrCachedViewForId(long r7, int r9, boolean r10) {
                r6 = this;
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r6.mAttachedScrap
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L8:
                if (r0 < 0) goto L59
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r1 = r6.mAttachedScrap
                java.lang.Object r1 = r1.get(r0)
                androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r1
                long r2 = r1.getItemId()
                int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r4 != 0) goto L56
                boolean r2 = r1.wasReturnedFromScrap()
                if (r2 != 0) goto L56
                int r2 = r1.getItemViewType()
                if (r9 != r2) goto L42
                r7 = 32
                r1.addFlags(r7)
                boolean r7 = r1.isRemoved()
                if (r7 == 0) goto L41
                androidx.recyclerview.widget.RecyclerView r7 = r6.this$0
                androidx.recyclerview.widget.RecyclerView$State r7 = r7.mState
                boolean r7 = r7.isPreLayout()
                if (r7 != 0) goto L41
                r7 = 2
                r8 = 14
                r1.setFlags(r7, r8)
            L41:
                return r1
            L42:
                if (r10 != 0) goto L56
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r2 = r6.mAttachedScrap
                r2.remove(r0)
                androidx.recyclerview.widget.RecyclerView r2 = r6.this$0
                android.view.View r3 = r1.itemView
                r4 = 0
                r2.removeDetachedView(r3, r4)
                android.view.View r1 = r1.itemView
                r6.quickRecycleScrapView(r1)
            L56:
                int r0 = r0 + (-1)
                goto L8
            L59:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r6.mCachedViews
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L61:
                r1 = 0
                if (r0 < 0) goto L91
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r2 = r6.mCachedViews
                java.lang.Object r2 = r2.get(r0)
                androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r2
                long r3 = r2.getItemId()
                int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
                if (r5 != 0) goto L8e
                boolean r3 = r2.isAttachedToTransitionOverlay()
                if (r3 != 0) goto L8e
                int r3 = r2.getItemViewType()
                if (r9 != r3) goto L88
                if (r10 != 0) goto L87
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r7 = r6.mCachedViews
                r7.remove(r0)
            L87:
                return r2
            L88:
                if (r10 != 0) goto L8e
                r6.recycleCachedViewAt(r0)
                return r1
            L8e:
                int r0 = r0 + (-1)
                goto L61
            L91:
                return r1
        }

        androidx.recyclerview.widget.RecyclerView.ViewHolder getScrapOrHiddenOrCachedHolderForPosition(int r6, boolean r7) {
                r5 = this;
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r5.mAttachedScrap
                int r0 = r0.size()
                r1 = 0
                r2 = 0
            L8:
                if (r2 >= r0) goto L3b
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r3 = r5.mAttachedScrap
                java.lang.Object r3 = r3.get(r2)
                androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r3
                boolean r4 = r3.wasReturnedFromScrap()
                if (r4 != 0) goto L38
                int r4 = r3.getLayoutPosition()
                if (r4 != r6) goto L38
                boolean r4 = r3.isInvalid()
                if (r4 != 0) goto L38
                androidx.recyclerview.widget.RecyclerView r4 = r5.this$0
                androidx.recyclerview.widget.RecyclerView$State r4 = r4.mState
                boolean r4 = r4.mInPreLayout
                if (r4 != 0) goto L32
                boolean r4 = r3.isRemoved()
                if (r4 != 0) goto L38
            L32:
                r6 = 32
                r3.addFlags(r6)
                return r3
            L38:
                int r2 = r2 + 1
                goto L8
            L3b:
                if (r7 != 0) goto L8d
                androidx.recyclerview.widget.RecyclerView r0 = r5.this$0
                androidx.recyclerview.widget.ChildHelper r0 = r0.mChildHelper
                android.view.View r0 = r0.findHiddenNonRemovedView(r6)
                if (r0 == 0) goto L8d
                androidx.recyclerview.widget.RecyclerView$ViewHolder r6 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r0)
                androidx.recyclerview.widget.RecyclerView r7 = r5.this$0
                androidx.recyclerview.widget.ChildHelper r7 = r7.mChildHelper
                r7.unhide(r0)
                androidx.recyclerview.widget.RecyclerView r7 = r5.this$0
                androidx.recyclerview.widget.ChildHelper r7 = r7.mChildHelper
                int r7 = r7.indexOfChild(r0)
                r1 = -1
                if (r7 == r1) goto L6d
                androidx.recyclerview.widget.RecyclerView r1 = r5.this$0
                androidx.recyclerview.widget.ChildHelper r1 = r1.mChildHelper
                r1.detachViewFromParent(r7)
                r5.scrapView(r0)
                r7 = 8224(0x2020, float:1.1524E-41)
                r6.addFlags(r7)
                return r6
            L6d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "layout index should not be -1 after unhiding a view:"
                r0.append(r1)
                r0.append(r6)
                androidx.recyclerview.widget.RecyclerView r6 = r5.this$0
                java.lang.String r6 = r6.exceptionLabel()
                r0.append(r6)
                java.lang.String r6 = r0.toString()
                r7.<init>(r6)
                throw r7
            L8d:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r5.mCachedViews
                int r0 = r0.size()
            L93:
                if (r1 >= r0) goto Lba
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r2 = r5.mCachedViews
                java.lang.Object r2 = r2.get(r1)
                androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r2
                boolean r3 = r2.isInvalid()
                if (r3 != 0) goto Lb7
                int r3 = r2.getLayoutPosition()
                if (r3 != r6) goto Lb7
                boolean r3 = r2.isAttachedToTransitionOverlay()
                if (r3 != 0) goto Lb7
                if (r7 != 0) goto Lb6
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r6 = r5.mCachedViews
                r6.remove(r1)
            Lb6:
                return r2
            Lb7:
                int r1 = r1 + 1
                goto L93
            Lba:
                r6 = 0
                return r6
        }

        android.view.View getScrapViewAt(int r2) {
                r1 = this;
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r1.mAttachedScrap
                java.lang.Object r2 = r0.get(r2)
                androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r2
                android.view.View r2 = r2.itemView
                return r2
        }

        @androidx.annotation.NonNull
        public android.view.View getViewForPosition(int r2) {
                r1 = this;
                r0 = 0
                android.view.View r2 = r1.getViewForPosition(r2, r0)
                return r2
        }

        android.view.View getViewForPosition(int r3, boolean r4) {
                r2 = this;
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = r2.tryGetViewHolderForPositionByDeadline(r3, r4, r0)
                android.view.View r3 = r3.itemView
                return r3
        }

        void markItemDecorInsetsDirty() {
                r4 = this;
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r4.mCachedViews
                int r0 = r0.size()
                r1 = 0
            L7:
                if (r1 >= r0) goto L21
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r2 = r4.mCachedViews
                java.lang.Object r2 = r2.get(r1)
                androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r2
                android.view.View r2 = r2.itemView
                android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$LayoutParams r2 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r2
                if (r2 == 0) goto L1e
                r3 = 1
                r2.mInsetsDirty = r3
            L1e:
                int r1 = r1 + 1
                goto L7
            L21:
                return
        }

        void markKnownViewsInvalid() {
                r4 = this;
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r4.mCachedViews
                int r0 = r0.size()
                r1 = 0
            L7:
                if (r1 >= r0) goto L1e
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r2 = r4.mCachedViews
                java.lang.Object r2 = r2.get(r1)
                androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r2
                if (r2 == 0) goto L1b
                r3 = 6
                r2.addFlags(r3)
                r3 = 0
                r2.addChangePayload(r3)
            L1b:
                int r1 = r1 + 1
                goto L7
            L1e:
                androidx.recyclerview.widget.RecyclerView r0 = r4.this$0
                androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.mAdapter
                if (r0 == 0) goto L2c
                boolean r0 = r0.hasStableIds()
                if (r0 != 0) goto L2b
                goto L2c
            L2b:
                return
            L2c:
                r4.recycleAndClearCachedViews()
                return
        }

        void offsetPositionRecordsForInsert(int r6, int r7) {
                r5 = this;
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r5.mCachedViews
                int r0 = r0.size()
                r1 = 0
                r2 = 0
            L8:
                if (r2 >= r0) goto L1e
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r3 = r5.mCachedViews
                java.lang.Object r3 = r3.get(r2)
                androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r3
                if (r3 == 0) goto L1b
                int r4 = r3.mPosition
                if (r4 < r6) goto L1b
                r3.offsetPosition(r7, r1)
            L1b:
                int r2 = r2 + 1
                goto L8
            L1e:
                return
        }

        void offsetPositionRecordsForMove(int r9, int r10) {
                r8 = this;
                if (r9 >= r10) goto L6
                r0 = -1
                r1 = r9
                r2 = r10
                goto L9
            L6:
                r0 = 1
                r2 = r9
                r1 = r10
            L9:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r3 = r8.mCachedViews
                int r3 = r3.size()
                r4 = 0
                r5 = 0
            L11:
                if (r5 >= r3) goto L32
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r6 = r8.mCachedViews
                java.lang.Object r6 = r6.get(r5)
                androidx.recyclerview.widget.RecyclerView$ViewHolder r6 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r6
                if (r6 == 0) goto L2f
                int r7 = r6.mPosition
                if (r7 < r1) goto L2f
                if (r7 <= r2) goto L24
                goto L2f
            L24:
                if (r7 != r9) goto L2c
                int r7 = r10 - r9
                r6.offsetPosition(r7, r4)
                goto L2f
            L2c:
                r6.offsetPosition(r0, r4)
            L2f:
                int r5 = r5 + 1
                goto L11
            L32:
                return
        }

        void offsetPositionRecordsForRemove(int r5, int r6, boolean r7) {
                r4 = this;
                int r0 = r5 + r6
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r1 = r4.mCachedViews
                int r1 = r1.size()
                int r1 = r1 + (-1)
            La:
                if (r1 < 0) goto L2c
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r2 = r4.mCachedViews
                java.lang.Object r2 = r2.get(r1)
                androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r2
                if (r2 == 0) goto L29
                int r3 = r2.mPosition
                if (r3 < r0) goto L1f
                int r3 = -r6
                r2.offsetPosition(r3, r7)
                goto L29
            L1f:
                if (r3 < r5) goto L29
                r3 = 8
                r2.addFlags(r3)
                r4.recycleCachedViewAt(r1)
            L29:
                int r1 = r1 + (-1)
                goto La
            L2c:
                return
        }

        void onAdapterChanged(androidx.recyclerview.widget.RecyclerView.Adapter<?> r2, androidx.recyclerview.widget.RecyclerView.Adapter<?> r3, boolean r4) {
                r1 = this;
                r1.clear()
                r0 = 1
                r1.poolingContainerDetach(r2, r0)
                androidx.recyclerview.widget.RecyclerView$RecycledViewPool r0 = r1.getRecycledViewPool()
                r0.onAdapterChanged(r2, r3, r4)
                r1.maybeSendPoolingContainerAttach()
                return
        }

        void onAttachedToWindow() {
                r0 = this;
                r0.maybeSendPoolingContainerAttach()
                return
        }

        void onDetachedFromWindow() {
                r2 = this;
                r0 = 0
            L1:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r1 = r2.mCachedViews
                int r1 = r1.size()
                if (r0 >= r1) goto L19
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r1 = r2.mCachedViews
                java.lang.Object r1 = r1.get(r0)
                androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r1
                android.view.View r1 = r1.itemView
                androidx.customview.poolingcontainer.PoolingContainer.callPoolingContainerOnRelease(r1)
                int r0 = r0 + 1
                goto L1
            L19:
                androidx.recyclerview.widget.RecyclerView r0 = r2.this$0
                androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.mAdapter
                r2.poolingContainerDetach(r0)
                return
        }

        void quickRecycleScrapView(android.view.View r2) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r2)
                r0 = 0
                r2.mScrapContainer = r0
                r0 = 0
                r2.mInChangeScrap = r0
                r2.clearReturnedFromScrapFlag()
                r1.recycleViewHolderInternal(r2)
                return
        }

        void recycleAndClearCachedViews() {
                r1 = this;
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r1.mCachedViews
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L8:
                if (r0 < 0) goto L10
                r1.recycleCachedViewAt(r0)
                int r0 = r0 + (-1)
                goto L8
            L10:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r1.mCachedViews
                r0.clear()
                boolean r0 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
                if (r0 == 0) goto L20
                androidx.recyclerview.widget.RecyclerView r0 = r1.this$0
                androidx.recyclerview.widget.GapWorker$LayoutPrefetchRegistryImpl r0 = r0.mPrefetchRegistry
                r0.clearPrefetchPositions()
            L20:
                return
        }

        void recycleCachedViewAt(int r3) {
                r2 = this;
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r2.mCachedViews
                java.lang.Object r0 = r0.get(r3)
                androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r0
                r1 = 1
                r2.addViewHolderToRecycledViewPool(r0, r1)
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r2.mCachedViews
                r0.remove(r3)
                return
        }

        public void recycleView(@androidx.annotation.NonNull android.view.View r4) {
                r3 = this;
                androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r4)
                boolean r1 = r0.isTmpDetached()
                if (r1 == 0) goto L10
                androidx.recyclerview.widget.RecyclerView r1 = r3.this$0
                r2 = 0
                r1.removeDetachedView(r4, r2)
            L10:
                boolean r4 = r0.isScrap()
                if (r4 == 0) goto L1a
                r0.unScrap()
                goto L23
            L1a:
                boolean r4 = r0.wasReturnedFromScrap()
                if (r4 == 0) goto L23
                r0.clearReturnedFromScrapFlag()
            L23:
                r3.recycleViewHolderInternal(r0)
                androidx.recyclerview.widget.RecyclerView r4 = r3.this$0
                androidx.recyclerview.widget.RecyclerView$ItemAnimator r4 = r4.mItemAnimator
                if (r4 == 0) goto L39
                boolean r4 = r0.isRecyclable()
                if (r4 != 0) goto L39
                androidx.recyclerview.widget.RecyclerView r4 = r3.this$0
                androidx.recyclerview.widget.RecyclerView$ItemAnimator r4 = r4.mItemAnimator
                r4.endAnimation(r0)
            L39:
                return
        }

        void recycleViewHolderInternal(androidx.recyclerview.widget.RecyclerView.ViewHolder r7) {
                r6 = this;
                boolean r0 = r7.isScrap()
                r1 = 0
                r2 = 1
                if (r0 != 0) goto Lf0
                android.view.View r0 = r7.itemView
                android.view.ViewParent r0 = r0.getParent()
                if (r0 == 0) goto L12
                goto Lf0
            L12:
                boolean r0 = r7.isTmpDetached()
                if (r0 != 0) goto Ld0
                boolean r0 = r7.shouldIgnore()
                if (r0 != 0) goto Lb3
                boolean r0 = r7.doesTransientStatePreventRecycling()
                androidx.recyclerview.widget.RecyclerView r3 = r6.this$0
                androidx.recyclerview.widget.RecyclerView$Adapter r3 = r3.mAdapter
                if (r3 == 0) goto L32
                if (r0 == 0) goto L32
                boolean r3 = r3.onFailedToRecycleView(r7)
                if (r3 == 0) goto L32
                r3 = 1
                goto L33
            L32:
                r3 = 0
            L33:
                if (r3 != 0) goto L3e
                boolean r3 = r7.isRecyclable()
                if (r3 == 0) goto L3c
                goto L3e
            L3c:
                r2 = 0
                goto L9b
            L3e:
                int r3 = r6.mViewCacheMax
                if (r3 <= 0) goto L91
                r3 = 526(0x20e, float:7.37E-43)
                boolean r3 = r7.hasAnyOfTheFlags(r3)
                if (r3 != 0) goto L91
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r3 = r6.mCachedViews
                int r3 = r3.size()
                int r4 = r6.mViewCacheMax
                if (r3 < r4) goto L5b
                if (r3 <= 0) goto L5b
                r6.recycleCachedViewAt(r1)
                int r3 = r3 + (-1)
            L5b:
                boolean r4 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
                if (r4 == 0) goto L8a
                if (r3 <= 0) goto L8a
                androidx.recyclerview.widget.RecyclerView r4 = r6.this$0
                androidx.recyclerview.widget.GapWorker$LayoutPrefetchRegistryImpl r4 = r4.mPrefetchRegistry
                int r5 = r7.mPosition
                boolean r4 = r4.lastPrefetchIncludedPosition(r5)
                if (r4 != 0) goto L8a
                int r3 = r3 + (-1)
            L6f:
                if (r3 < 0) goto L89
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r4 = r6.mCachedViews
                java.lang.Object r4 = r4.get(r3)
                androidx.recyclerview.widget.RecyclerView$ViewHolder r4 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r4
                int r4 = r4.mPosition
                androidx.recyclerview.widget.RecyclerView r5 = r6.this$0
                androidx.recyclerview.widget.GapWorker$LayoutPrefetchRegistryImpl r5 = r5.mPrefetchRegistry
                boolean r4 = r5.lastPrefetchIncludedPosition(r4)
                if (r4 != 0) goto L86
                goto L89
            L86:
                int r3 = r3 + (-1)
                goto L6f
            L89:
                int r3 = r3 + r2
            L8a:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r4 = r6.mCachedViews
                r4.add(r3, r7)
                r3 = 1
                goto L92
            L91:
                r3 = 0
            L92:
                if (r3 != 0) goto L99
                r6.addViewHolderToRecycledViewPool(r7, r2)
                r1 = r3
                goto L9b
            L99:
                r1 = r3
                goto L3c
            L9b:
                androidx.recyclerview.widget.RecyclerView r3 = r6.this$0
                androidx.recyclerview.widget.ViewInfoStore r3 = r3.mViewInfoStore
                r3.removeViewHolder(r7)
                if (r1 != 0) goto Lb2
                if (r2 != 0) goto Lb2
                if (r0 == 0) goto Lb2
                android.view.View r0 = r7.itemView
                androidx.customview.poolingcontainer.PoolingContainer.callPoolingContainerOnRelease(r0)
                r0 = 0
                r7.mBindingAdapter = r0
                r7.mOwnerRecyclerView = r0
            Lb2:
                return
            Lb3:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."
                r0.append(r1)
                androidx.recyclerview.widget.RecyclerView r1 = r6.this$0
                java.lang.String r1 = r1.exceptionLabel()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r7.<init>(r0)
                throw r7
            Ld0:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Tmp detached view should be removed from RecyclerView before it can be recycled: "
                r1.append(r2)
                r1.append(r7)
                androidx.recyclerview.widget.RecyclerView r7 = r6.this$0
                java.lang.String r7 = r7.exceptionLabel()
                r1.append(r7)
                java.lang.String r7 = r1.toString()
                r0.<init>(r7)
                throw r0
            Lf0:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Scrapped or attached views may not be recycled. isScrap:"
                r3.append(r4)
                boolean r4 = r7.isScrap()
                r3.append(r4)
                java.lang.String r4 = " isAttached:"
                r3.append(r4)
                android.view.View r7 = r7.itemView
                android.view.ViewParent r7 = r7.getParent()
                if (r7 == 0) goto L111
                r1 = 1
            L111:
                r3.append(r1)
                androidx.recyclerview.widget.RecyclerView r7 = r6.this$0
                java.lang.String r7 = r7.exceptionLabel()
                r3.append(r7)
                java.lang.String r7 = r3.toString()
                r0.<init>(r7)
                throw r0
        }

        void scrapView(android.view.View r3) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r3)
                r0 = 12
                boolean r0 = r3.hasAnyOfTheFlags(r0)
                if (r0 != 0) goto L30
                boolean r0 = r3.isUpdated()
                if (r0 == 0) goto L30
                androidx.recyclerview.widget.RecyclerView r0 = r2.this$0
                boolean r0 = r0.canReuseUpdatedViewHolder(r3)
                if (r0 == 0) goto L1b
                goto L30
            L1b:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r2.mChangedScrap
                if (r0 != 0) goto L26
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.mChangedScrap = r0
            L26:
                r0 = 1
                r3.setScrapContainer(r2, r0)
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r2.mChangedScrap
                r0.add(r3)
                return
            L30:
                boolean r0 = r3.isInvalid()
                if (r0 == 0) goto L64
                boolean r0 = r3.isRemoved()
                if (r0 != 0) goto L64
                androidx.recyclerview.widget.RecyclerView r0 = r2.this$0
                androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.mAdapter
                boolean r0 = r0.hasStableIds()
                if (r0 == 0) goto L47
                goto L64
            L47:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."
                r0.append(r1)
                androidx.recyclerview.widget.RecyclerView r1 = r2.this$0
                java.lang.String r1 = r1.exceptionLabel()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
            L64:
                r0 = 0
                r3.setScrapContainer(r2, r0)
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r2.mAttachedScrap
                r0.add(r3)
                return
        }

        void setRecycledViewPool(androidx.recyclerview.widget.RecyclerView.RecycledViewPool r2) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.this$0
                androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.mAdapter
                r1.poolingContainerDetach(r0)
                androidx.recyclerview.widget.RecyclerView$RecycledViewPool r0 = r1.mRecyclerPool
                if (r0 == 0) goto Le
                r0.detach()
            Le:
                r1.mRecyclerPool = r2
                if (r2 == 0) goto L1f
                androidx.recyclerview.widget.RecyclerView r2 = r1.this$0
                androidx.recyclerview.widget.RecyclerView$Adapter r2 = r2.getAdapter()
                if (r2 == 0) goto L1f
                androidx.recyclerview.widget.RecyclerView$RecycledViewPool r2 = r1.mRecyclerPool
                r2.attach()
            L1f:
                r1.maybeSendPoolingContainerAttach()
                return
        }

        void setViewCacheExtension(androidx.recyclerview.widget.RecyclerView.ViewCacheExtension r1) {
                r0 = this;
                r0.mViewCacheExtension = r1
                return
        }

        public void setViewCacheSize(int r1) {
                r0 = this;
                r0.mRequestedCacheMax = r1
                r0.updateViewCacheSize()
                return
        }

        @androidx.annotation.Nullable
        androidx.recyclerview.widget.RecyclerView.ViewHolder tryGetViewHolderForPositionByDeadline(int r17, boolean r18, long r19) {
                r16 = this;
                r0 = r16
                r3 = r17
                r1 = r18
                if (r3 < 0) goto L227
                androidx.recyclerview.widget.RecyclerView r2 = r0.this$0
                androidx.recyclerview.widget.RecyclerView$State r2 = r2.mState
                int r2 = r2.getItemCount()
                if (r3 >= r2) goto L227
                androidx.recyclerview.widget.RecyclerView r2 = r0.this$0
                androidx.recyclerview.widget.RecyclerView$State r2 = r2.mState
                boolean r2 = r2.isPreLayout()
                r4 = 0
                r6 = 1
                r7 = 0
                if (r2 == 0) goto L27
                androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = r16.getChangedScrapViewForPosition(r17)
                if (r2 == 0) goto L28
                r5 = 1
                goto L29
            L27:
                r2 = r4
            L28:
                r5 = 0
            L29:
                if (r2 != 0) goto L5d
                androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = r16.getScrapOrHiddenOrCachedHolderForPosition(r17, r18)
                if (r2 == 0) goto L5d
                boolean r8 = r0.validateViewHolderForOffsetPosition(r2)
                if (r8 != 0) goto L5c
                if (r1 != 0) goto L5a
                r8 = 4
                r2.addFlags(r8)
                boolean r8 = r2.isScrap()
                if (r8 == 0) goto L4e
                androidx.recyclerview.widget.RecyclerView r8 = r0.this$0
                android.view.View r9 = r2.itemView
                r8.removeDetachedView(r9, r7)
                r2.unScrap()
                goto L57
            L4e:
                boolean r8 = r2.wasReturnedFromScrap()
                if (r8 == 0) goto L57
                r2.clearReturnedFromScrapFlag()
            L57:
                r0.recycleViewHolderInternal(r2)
            L5a:
                r2 = r4
                goto L5d
            L5c:
                r5 = 1
            L5d:
                if (r2 != 0) goto L145
                androidx.recyclerview.widget.RecyclerView r8 = r0.this$0
                androidx.recyclerview.widget.AdapterHelper r8 = r8.mAdapterHelper
                int r8 = r8.findPositionOffset(r3)
                if (r8 < 0) goto L148
                androidx.recyclerview.widget.RecyclerView r9 = r0.this$0
                androidx.recyclerview.widget.RecyclerView$Adapter r9 = r9.mAdapter
                int r9 = r9.getItemCount()
                if (r8 >= r9) goto L148
                androidx.recyclerview.widget.RecyclerView r9 = r0.this$0
                androidx.recyclerview.widget.RecyclerView$Adapter r9 = r9.mAdapter
                int r11 = r9.getItemViewType(r8)
                androidx.recyclerview.widget.RecyclerView r9 = r0.this$0
                androidx.recyclerview.widget.RecyclerView$Adapter r9 = r9.mAdapter
                boolean r9 = r9.hasStableIds()
                if (r9 == 0) goto L96
                androidx.recyclerview.widget.RecyclerView r2 = r0.this$0
                androidx.recyclerview.widget.RecyclerView$Adapter r2 = r2.mAdapter
                long r9 = r2.getItemId(r8)
                androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = r0.getScrapOrCachedViewForId(r9, r11, r1)
                if (r2 == 0) goto L96
                r2.mPosition = r8
                r5 = 1
            L96:
                if (r2 != 0) goto Leb
                androidx.recyclerview.widget.RecyclerView$ViewCacheExtension r1 = r0.mViewCacheExtension
                if (r1 == 0) goto Leb
                android.view.View r1 = r1.getViewForPositionAndType(r0, r3, r11)
                if (r1 == 0) goto Leb
                androidx.recyclerview.widget.RecyclerView r2 = r0.this$0
                androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = r2.getChildViewHolder(r1)
                if (r2 == 0) goto Lce
                boolean r1 = r2.shouldIgnore()
                if (r1 != 0) goto Lb1
                goto Leb
            Lb1:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view."
                r2.append(r3)
                androidx.recyclerview.widget.RecyclerView r3 = r0.this$0
                java.lang.String r3 = r3.exceptionLabel()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            Lce:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "getViewForPositionAndType returned a view which does not have a ViewHolder"
                r2.append(r3)
                androidx.recyclerview.widget.RecyclerView r3 = r0.this$0
                java.lang.String r3 = r3.exceptionLabel()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            Leb:
                if (r2 != 0) goto L102
                androidx.recyclerview.widget.RecyclerView$RecycledViewPool r1 = r0.getRecycledViewPool()
                androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = r1.getRecycledView(r11)
                if (r1 == 0) goto L101
                r1.resetInternal()
                boolean r2 = androidx.recyclerview.widget.RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST
                if (r2 == 0) goto L101
                r0.invalidateDisplayListInt(r1)
            L101:
                r2 = r1
            L102:
                if (r2 != 0) goto L145
                androidx.recyclerview.widget.RecyclerView r1 = r0.this$0
                long r12 = r1.getNanoTime()
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r8 = (r19 > r1 ? 1 : (r19 == r1 ? 0 : -1))
                if (r8 == 0) goto L11e
                androidx.recyclerview.widget.RecyclerView$RecycledViewPool r10 = r0.mRecyclerPool
                r14 = r19
                boolean r1 = r10.willCreateInTime(r11, r12, r14)
                if (r1 != 0) goto L11e
                return r4
            L11e:
                androidx.recyclerview.widget.RecyclerView r1 = r0.this$0
                androidx.recyclerview.widget.RecyclerView$Adapter r2 = r1.mAdapter
                androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = r2.createViewHolder(r1, r11)
                boolean r1 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
                if (r1 == 0) goto L139
                android.view.View r1 = r2.itemView
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.findNestedRecyclerView(r1)
                if (r1 == 0) goto L139
                java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
                r4.<init>(r1)
                r2.mNestedRecyclerView = r4
            L139:
                androidx.recyclerview.widget.RecyclerView r1 = r0.this$0
                long r8 = r1.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$RecycledViewPool r1 = r0.mRecyclerPool
                long r8 = r8 - r12
                r1.factorInCreateTime(r11, r8)
            L145:
                r1 = r2
                r8 = r5
                goto L180
            L148:
                java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "Inconsistency detected. Invalid item position "
                r2.append(r4)
                r2.append(r3)
                java.lang.String r3 = "(offset:"
                r2.append(r3)
                r2.append(r8)
                java.lang.String r3 = ").state:"
                r2.append(r3)
                androidx.recyclerview.widget.RecyclerView r3 = r0.this$0
                androidx.recyclerview.widget.RecyclerView$State r3 = r3.mState
                int r3 = r3.getItemCount()
                r2.append(r3)
                androidx.recyclerview.widget.RecyclerView r3 = r0.this$0
                java.lang.String r3 = r3.exceptionLabel()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L180:
                if (r8 == 0) goto L1b8
                androidx.recyclerview.widget.RecyclerView r2 = r0.this$0
                androidx.recyclerview.widget.RecyclerView$State r2 = r2.mState
                boolean r2 = r2.isPreLayout()
                if (r2 != 0) goto L1b8
                r2 = 8192(0x2000, float:1.148E-41)
                boolean r4 = r1.hasAnyOfTheFlags(r2)
                if (r4 == 0) goto L1b8
                r1.setFlags(r7, r2)
                androidx.recyclerview.widget.RecyclerView r2 = r0.this$0
                androidx.recyclerview.widget.RecyclerView$State r2 = r2.mState
                boolean r2 = r2.mRunSimpleAnimations
                if (r2 == 0) goto L1b8
                int r2 = androidx.recyclerview.widget.RecyclerView.ItemAnimator.buildAdapterChangeFlagsForAnimations(r1)
                r2 = r2 | 4096(0x1000, float:5.74E-42)
                androidx.recyclerview.widget.RecyclerView r4 = r0.this$0
                androidx.recyclerview.widget.RecyclerView$ItemAnimator r5 = r4.mItemAnimator
                androidx.recyclerview.widget.RecyclerView$State r4 = r4.mState
                java.util.List r9 = r1.getUnmodifiedPayloads()
                androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemHolderInfo r2 = r5.recordPreLayoutInformation(r4, r1, r2, r9)
                androidx.recyclerview.widget.RecyclerView r4 = r0.this$0
                r4.recordAnimationInfoIfBouncedHiddenView(r1, r2)
            L1b8:
                androidx.recyclerview.widget.RecyclerView r2 = r0.this$0
                androidx.recyclerview.widget.RecyclerView$State r2 = r2.mState
                boolean r2 = r2.isPreLayout()
                if (r2 == 0) goto L1cb
                boolean r2 = r1.isBound()
                if (r2 == 0) goto L1cb
                r1.mPreLayoutPosition = r3
                goto L1de
            L1cb:
                boolean r2 = r1.isBound()
                if (r2 == 0) goto L1e0
                boolean r2 = r1.needsUpdate()
                if (r2 != 0) goto L1e0
                boolean r2 = r1.isInvalid()
                if (r2 == 0) goto L1de
                goto L1e0
            L1de:
                r2 = 0
                goto L1ee
            L1e0:
                androidx.recyclerview.widget.RecyclerView r2 = r0.this$0
                androidx.recyclerview.widget.AdapterHelper r2 = r2.mAdapterHelper
                int r2 = r2.findPositionOffset(r3)
                r4 = r19
                boolean r2 = r0.tryBindViewHolderByDeadline(r1, r2, r3, r4)
            L1ee:
                android.view.View r3 = r1.itemView
                android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                if (r3 != 0) goto L204
                androidx.recyclerview.widget.RecyclerView r3 = r0.this$0
                android.view.ViewGroup$LayoutParams r3 = r3.generateDefaultLayoutParams()
                androidx.recyclerview.widget.RecyclerView$LayoutParams r3 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r3
                android.view.View r4 = r1.itemView
                r4.setLayoutParams(r3)
                goto L21c
            L204:
                androidx.recyclerview.widget.RecyclerView r4 = r0.this$0
                boolean r4 = r4.checkLayoutParams(r3)
                if (r4 != 0) goto L21a
                androidx.recyclerview.widget.RecyclerView r4 = r0.this$0
                android.view.ViewGroup$LayoutParams r3 = r4.generateLayoutParams(r3)
                androidx.recyclerview.widget.RecyclerView$LayoutParams r3 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r3
                android.view.View r4 = r1.itemView
                r4.setLayoutParams(r3)
                goto L21c
            L21a:
                androidx.recyclerview.widget.RecyclerView$LayoutParams r3 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r3
            L21c:
                r3.mViewHolder = r1
                if (r8 == 0) goto L223
                if (r2 == 0) goto L223
                goto L224
            L223:
                r6 = 0
            L224:
                r3.mPendingInvalidate = r6
                return r1
            L227:
                java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "Invalid item position "
                r2.append(r4)
                r2.append(r3)
                java.lang.String r4 = "("
                r2.append(r4)
                r2.append(r3)
                java.lang.String r3 = "). Item count:"
                r2.append(r3)
                androidx.recyclerview.widget.RecyclerView r3 = r0.this$0
                androidx.recyclerview.widget.RecyclerView$State r3 = r3.mState
                int r3 = r3.getItemCount()
                r2.append(r3)
                androidx.recyclerview.widget.RecyclerView r3 = r0.this$0
                java.lang.String r3 = r3.exceptionLabel()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
        }

        void unscrapView(androidx.recyclerview.widget.RecyclerView.ViewHolder r2) {
                r1 = this;
                boolean r0 = r2.mInChangeScrap
                if (r0 == 0) goto La
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r1.mChangedScrap
                r0.remove(r2)
                goto Lf
            La:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r1.mAttachedScrap
                r0.remove(r2)
            Lf:
                r0 = 0
                r2.mScrapContainer = r0
                r0 = 0
                r2.mInChangeScrap = r0
                r2.clearReturnedFromScrapFlag()
                return
        }

        void updateViewCacheSize() {
                r3 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r3.this$0
                androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.mLayout
                if (r0 == 0) goto L9
                int r0 = r0.mPrefetchMaxCountObserved
                goto La
            L9:
                r0 = 0
            La:
                int r1 = r3.mRequestedCacheMax
                int r1 = r1 + r0
                r3.mViewCacheMax = r1
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r3.mCachedViews
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L17:
                if (r0 < 0) goto L29
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r1 = r3.mCachedViews
                int r1 = r1.size()
                int r2 = r3.mViewCacheMax
                if (r1 <= r2) goto L29
                r3.recycleCachedViewAt(r0)
                int r0 = r0 + (-1)
                goto L17
            L29:
                return
        }

        boolean validateViewHolderForOffsetPosition(androidx.recyclerview.widget.RecyclerView.ViewHolder r8) {
                r7 = this;
                boolean r0 = r8.isRemoved()
                if (r0 == 0) goto Lf
                androidx.recyclerview.widget.RecyclerView r8 = r7.this$0
                androidx.recyclerview.widget.RecyclerView$State r8 = r8.mState
                boolean r8 = r8.isPreLayout()
                return r8
            Lf:
                int r0 = r8.mPosition
                if (r0 < 0) goto L59
                androidx.recyclerview.widget.RecyclerView r1 = r7.this$0
                androidx.recyclerview.widget.RecyclerView$Adapter r1 = r1.mAdapter
                int r1 = r1.getItemCount()
                if (r0 >= r1) goto L59
                androidx.recyclerview.widget.RecyclerView r0 = r7.this$0
                androidx.recyclerview.widget.RecyclerView$State r0 = r0.mState
                boolean r0 = r0.isPreLayout()
                r1 = 0
                if (r0 != 0) goto L39
                androidx.recyclerview.widget.RecyclerView r0 = r7.this$0
                androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.mAdapter
                int r2 = r8.mPosition
                int r0 = r0.getItemViewType(r2)
                int r2 = r8.getItemViewType()
                if (r0 == r2) goto L39
                return r1
            L39:
                androidx.recyclerview.widget.RecyclerView r0 = r7.this$0
                androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.mAdapter
                boolean r0 = r0.hasStableIds()
                r2 = 1
                if (r0 == 0) goto L58
                long r3 = r8.getItemId()
                androidx.recyclerview.widget.RecyclerView r0 = r7.this$0
                androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.mAdapter
                int r8 = r8.mPosition
                long r5 = r0.getItemId(r8)
                int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r8 != 0) goto L57
                return r2
            L57:
                return r1
            L58:
                return r2
            L59:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Inconsistency detected. Invalid view holder adapter position"
                r1.append(r2)
                r1.append(r8)
                androidx.recyclerview.widget.RecyclerView r8 = r7.this$0
                java.lang.String r8 = r8.exceptionLabel()
                r1.append(r8)
                java.lang.String r8 = r1.toString()
                r0.<init>(r8)
                throw r0
        }

        void viewRangeUpdate(int r4, int r5) {
                r3 = this;
                int r5 = r5 + r4
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r3.mCachedViews
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L9:
                if (r0 < 0) goto L26
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r1 = r3.mCachedViews
                java.lang.Object r1 = r1.get(r0)
                androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r1
                if (r1 != 0) goto L16
                goto L23
            L16:
                int r2 = r1.mPosition
                if (r2 < r4) goto L23
                if (r2 >= r5) goto L23
                r2 = 2
                r1.addFlags(r2)
                r3.recycleCachedViewAt(r0)
            L23:
                int r0 = r0 + (-1)
                goto L9
            L26:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface RecyclerListener {
        void onViewRecycled(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class RecyclerViewDataObserver extends androidx.recyclerview.widget.RecyclerView.AdapterDataObserver {
        final /* synthetic */ androidx.recyclerview.widget.RecyclerView this$0;

        RecyclerViewDataObserver(androidx.recyclerview.widget.RecyclerView r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
                r3 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r3.this$0
                r1 = 0
                r0.assertNotInLayoutOrScroll(r1)
                androidx.recyclerview.widget.RecyclerView r0 = r3.this$0
                androidx.recyclerview.widget.RecyclerView$State r1 = r0.mState
                r2 = 1
                r1.mStructureChanged = r2
                r0.processDataSetCompletelyChanged(r2)
                androidx.recyclerview.widget.RecyclerView r0 = r3.this$0
                androidx.recyclerview.widget.AdapterHelper r0 = r0.mAdapterHelper
                boolean r0 = r0.hasPendingUpdates()
                if (r0 != 0) goto L1f
                androidx.recyclerview.widget.RecyclerView r0 = r3.this$0
                r0.requestLayout()
            L1f:
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int r3, int r4, java.lang.Object r5) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r2.this$0
                r1 = 0
                r0.assertNotInLayoutOrScroll(r1)
                androidx.recyclerview.widget.RecyclerView r0 = r2.this$0
                androidx.recyclerview.widget.AdapterHelper r0 = r0.mAdapterHelper
                boolean r3 = r0.onItemRangeChanged(r3, r4, r5)
                if (r3 == 0) goto L13
                r2.triggerUpdateProcessor()
            L13:
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int r3, int r4) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r2.this$0
                r1 = 0
                r0.assertNotInLayoutOrScroll(r1)
                androidx.recyclerview.widget.RecyclerView r0 = r2.this$0
                androidx.recyclerview.widget.AdapterHelper r0 = r0.mAdapterHelper
                boolean r3 = r0.onItemRangeInserted(r3, r4)
                if (r3 == 0) goto L13
                r2.triggerUpdateProcessor()
            L13:
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int r3, int r4, int r5) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r2.this$0
                r1 = 0
                r0.assertNotInLayoutOrScroll(r1)
                androidx.recyclerview.widget.RecyclerView r0 = r2.this$0
                androidx.recyclerview.widget.AdapterHelper r0 = r0.mAdapterHelper
                boolean r3 = r0.onItemRangeMoved(r3, r4, r5)
                if (r3 == 0) goto L13
                r2.triggerUpdateProcessor()
            L13:
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int r3, int r4) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r2.this$0
                r1 = 0
                r0.assertNotInLayoutOrScroll(r1)
                androidx.recyclerview.widget.RecyclerView r0 = r2.this$0
                androidx.recyclerview.widget.AdapterHelper r0 = r0.mAdapterHelper
                boolean r3 = r0.onItemRangeRemoved(r3, r4)
                if (r3 == 0) goto L13
                r2.triggerUpdateProcessor()
            L13:
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onStateRestorationPolicyChanged() {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r2.this$0
                androidx.recyclerview.widget.RecyclerView$SavedState r1 = r0.mPendingSavedState
                if (r1 != 0) goto L7
                goto L16
            L7:
                androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.mAdapter
                if (r0 == 0) goto L16
                boolean r0 = r0.canRestoreState()
                if (r0 == 0) goto L16
                androidx.recyclerview.widget.RecyclerView r0 = r2.this$0
                r0.requestLayout()
            L16:
                return
        }

        void triggerUpdateProcessor() {
                r2 = this;
                boolean r0 = androidx.recyclerview.widget.RecyclerView.POST_UPDATES_ON_ANIMATION
                if (r0 == 0) goto L14
                androidx.recyclerview.widget.RecyclerView r0 = r2.this$0
                boolean r1 = r0.mHasFixedSize
                if (r1 == 0) goto L14
                boolean r1 = r0.mIsAttached
                if (r1 == 0) goto L14
                java.lang.Runnable r1 = r0.mUpdateChildViewsRunnable
                androidx.core.view.ViewCompat.postOnAnimation(r0, r1)
                return
            L14:
                androidx.recyclerview.widget.RecyclerView r0 = r2.this$0
                r1 = 1
                r0.mAdapterUpdateDuringMeasure = r1
                r0.requestLayout()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<androidx.recyclerview.widget.RecyclerView.SavedState> CREATOR = null;
        android.os.Parcelable mLayoutState;


        static {
                androidx.recyclerview.widget.RecyclerView$SavedState$1 r0 = new androidx.recyclerview.widget.RecyclerView$SavedState$1
                r0.<init>()
                androidx.recyclerview.widget.RecyclerView.SavedState.CREATOR = r0
                return
        }

        SavedState(android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>(r1, r2)
                if (r2 == 0) goto L6
                goto Lc
            L6:
                java.lang.Class<androidx.recyclerview.widget.RecyclerView$LayoutManager> r2 = androidx.recyclerview.widget.RecyclerView.LayoutManager.class
                java.lang.ClassLoader r2 = r2.getClassLoader()
            Lc:
                android.os.Parcelable r1 = r1.readParcelable(r2)
                r0.mLayoutState = r1
                return
        }

        SavedState(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        void copyFrom(androidx.recyclerview.widget.RecyclerView.SavedState r1) {
                r0 = this;
                android.os.Parcelable r1 = r1.mLayoutState
                r0.mLayoutState = r1
                return
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                super.writeToParcel(r2, r3)
                android.os.Parcelable r3 = r1.mLayoutState
                r0 = 0
                r2.writeParcelable(r3, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class SimpleOnItemTouchListener implements androidx.recyclerview.widget.RecyclerView.OnItemTouchListener {
        public SimpleOnItemTouchListener() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public boolean onInterceptTouchEvent(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r1, @androidx.annotation.NonNull android.view.MotionEvent r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void onRequestDisallowInterceptTouchEvent(boolean r1) {
                r0 = this;
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void onTouchEvent(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r1, @androidx.annotation.NonNull android.view.MotionEvent r2) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class SmoothScroller {
        private androidx.recyclerview.widget.RecyclerView.LayoutManager mLayoutManager;
        private boolean mPendingInitialRun;
        private androidx.recyclerview.widget.RecyclerView mRecyclerView;
        private final androidx.recyclerview.widget.RecyclerView.SmoothScroller.Action mRecyclingAction;
        private boolean mRunning;
        private boolean mStarted;
        private int mTargetPosition;
        private android.view.View mTargetView;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static class Action {
            public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
            private boolean mChanged;
            private int mConsecutiveUpdates;
            private int mDuration;
            private int mDx;
            private int mDy;
            private android.view.animation.Interpolator mInterpolator;
            private int mJumpToPosition;

            public Action(@androidx.annotation.Px int r3, @androidx.annotation.Px int r4) {
                    r2 = this;
                    r0 = -2147483648(0xffffffff80000000, float:-0.0)
                    r1 = 0
                    r2.<init>(r3, r4, r0, r1)
                    return
            }

            public Action(@androidx.annotation.Px int r2, @androidx.annotation.Px int r3, int r4) {
                    r1 = this;
                    r0 = 0
                    r1.<init>(r2, r3, r4, r0)
                    return
            }

            public Action(@androidx.annotation.Px int r2, @androidx.annotation.Px int r3, int r4, @androidx.annotation.Nullable android.view.animation.Interpolator r5) {
                    r1 = this;
                    r1.<init>()
                    r0 = -1
                    r1.mJumpToPosition = r0
                    r0 = 0
                    r1.mChanged = r0
                    r1.mConsecutiveUpdates = r0
                    r1.mDx = r2
                    r1.mDy = r3
                    r1.mDuration = r4
                    r1.mInterpolator = r5
                    return
            }

            private void validate() {
                    r2 = this;
                    android.view.animation.Interpolator r0 = r2.mInterpolator
                    r1 = 1
                    if (r0 == 0) goto L12
                    int r0 = r2.mDuration
                    if (r0 < r1) goto La
                    goto L12
                La:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "If you provide an interpolator, you must set a positive duration"
                    r0.<init>(r1)
                    throw r0
                L12:
                    int r0 = r2.mDuration
                    if (r0 < r1) goto L17
                    return
                L17:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "Scroll duration must be a positive number"
                    r0.<init>(r1)
                    throw r0
            }

            public int getDuration() {
                    r1 = this;
                    int r0 = r1.mDuration
                    return r0
            }

            @androidx.annotation.Px
            public int getDx() {
                    r1 = this;
                    int r0 = r1.mDx
                    return r0
            }

            @androidx.annotation.Px
            public int getDy() {
                    r1 = this;
                    int r0 = r1.mDy
                    return r0
            }

            @androidx.annotation.Nullable
            public android.view.animation.Interpolator getInterpolator() {
                    r1 = this;
                    android.view.animation.Interpolator r0 = r1.mInterpolator
                    return r0
            }

            boolean hasJumpTarget() {
                    r1 = this;
                    int r0 = r1.mJumpToPosition
                    if (r0 < 0) goto L6
                    r0 = 1
                    return r0
                L6:
                    r0 = 0
                    return r0
            }

            public void jumpTo(int r1) {
                    r0 = this;
                    r0.mJumpToPosition = r1
                    return
            }

            void runIfNecessary(androidx.recyclerview.widget.RecyclerView r6) {
                    r5 = this;
                    int r0 = r5.mJumpToPosition
                    r1 = 0
                    if (r0 < 0) goto Le
                    r2 = -1
                    r5.mJumpToPosition = r2
                    r6.jumpToPositionForSmoothScroller(r0)
                    r5.mChanged = r1
                    return
                Le:
                    boolean r0 = r5.mChanged
                    if (r0 == 0) goto L2b
                    r5.validate()
                    androidx.recyclerview.widget.RecyclerView$ViewFlinger r6 = r6.mViewFlinger
                    int r0 = r5.mDx
                    int r2 = r5.mDy
                    int r3 = r5.mDuration
                    android.view.animation.Interpolator r4 = r5.mInterpolator
                    r6.smoothScrollBy(r0, r2, r3, r4)
                    int r6 = r5.mConsecutiveUpdates
                    int r6 = r6 + 1
                    r5.mConsecutiveUpdates = r6
                    r5.mChanged = r1
                    return
                L2b:
                    r5.mConsecutiveUpdates = r1
                    return
            }

            public void setDuration(int r2) {
                    r1 = this;
                    r0 = 1
                    r1.mChanged = r0
                    r1.mDuration = r2
                    return
            }

            public void setDx(@androidx.annotation.Px int r2) {
                    r1 = this;
                    r0 = 1
                    r1.mChanged = r0
                    r1.mDx = r2
                    return
            }

            public void setDy(@androidx.annotation.Px int r2) {
                    r1 = this;
                    r0 = 1
                    r1.mChanged = r0
                    r1.mDy = r2
                    return
            }

            public void setInterpolator(@androidx.annotation.Nullable android.view.animation.Interpolator r2) {
                    r1 = this;
                    r0 = 1
                    r1.mChanged = r0
                    r1.mInterpolator = r2
                    return
            }

            public void update(@androidx.annotation.Px int r1, @androidx.annotation.Px int r2, int r3, @androidx.annotation.Nullable android.view.animation.Interpolator r4) {
                    r0 = this;
                    r0.mDx = r1
                    r0.mDy = r2
                    r0.mDuration = r3
                    r0.mInterpolator = r4
                    r1 = 1
                    r0.mChanged = r1
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public interface ScrollVectorProvider {
            @androidx.annotation.Nullable
            android.graphics.PointF computeScrollVectorForPosition(int r1);
        }

        public SmoothScroller() {
                r2 = this;
                r2.<init>()
                r0 = -1
                r2.mTargetPosition = r0
                androidx.recyclerview.widget.RecyclerView$SmoothScroller$Action r0 = new androidx.recyclerview.widget.RecyclerView$SmoothScroller$Action
                r1 = 0
                r0.<init>(r1, r1)
                r2.mRecyclingAction = r0
                return
        }

        @androidx.annotation.Nullable
        public android.graphics.PointF computeScrollVectorForPosition(int r3) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r2.getLayoutManager()
                boolean r1 = r0 instanceof androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
                if (r1 == 0) goto Lf
                androidx.recyclerview.widget.RecyclerView$SmoothScroller$ScrollVectorProvider r0 = (androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider) r0
                android.graphics.PointF r3 = r0.computeScrollVectorForPosition(r3)
                return r3
            Lf:
                r3 = 0
                return r3
        }

        public android.view.View findViewByPosition(int r2) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.mLayout
                android.view.View r2 = r0.findViewByPosition(r2)
                return r2
        }

        public int getChildCount() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.mLayout
                int r0 = r0.getChildCount()
                return r0
        }

        public int getChildPosition(android.view.View r2) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                int r2 = r0.getChildLayoutPosition(r2)
                return r2
        }

        @androidx.annotation.Nullable
        public androidx.recyclerview.widget.RecyclerView.LayoutManager getLayoutManager() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r1.mLayoutManager
                return r0
        }

        public int getTargetPosition() {
                r1 = this;
                int r0 = r1.mTargetPosition
                return r0
        }

        @java.lang.Deprecated
        public void instantScrollToPosition(int r2) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                r0.scrollToPosition(r2)
                return
        }

        public boolean isPendingInitialRun() {
                r1 = this;
                boolean r0 = r1.mPendingInitialRun
                return r0
        }

        public boolean isRunning() {
                r1 = this;
                boolean r0 = r1.mRunning
                return r0
        }

        protected void normalize(@androidx.annotation.NonNull android.graphics.PointF r3) {
                r2 = this;
                float r0 = r3.x
                float r0 = r0 * r0
                float r1 = r3.y
                float r1 = r1 * r1
                float r0 = r0 + r1
                double r0 = (double) r0
                double r0 = java.lang.Math.sqrt(r0)
                float r0 = (float) r0
                float r1 = r3.x
                float r1 = r1 / r0
                r3.x = r1
                float r1 = r3.y
                float r1 = r1 / r0
                r3.y = r1
                return
        }

        void onAnimation(int r7, int r8) {
                r6 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r6.mRecyclerView
                int r1 = r6.mTargetPosition
                r2 = -1
                if (r1 == r2) goto L9
                if (r0 != 0) goto Lc
            L9:
                r6.stop()
            Lc:
                boolean r1 = r6.mPendingInitialRun
                r2 = 0
                if (r1 == 0) goto L3d
                android.view.View r1 = r6.mTargetView
                if (r1 != 0) goto L3d
                androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r6.mLayoutManager
                if (r1 == 0) goto L3d
                int r1 = r6.mTargetPosition
                android.graphics.PointF r1 = r6.computeScrollVectorForPosition(r1)
                if (r1 == 0) goto L3d
                float r3 = r1.x
                r4 = 0
                int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r5 != 0) goto L2e
                float r5 = r1.y
                int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
                if (r4 == 0) goto L3d
            L2e:
                float r3 = java.lang.Math.signum(r3)
                int r3 = (int) r3
                float r1 = r1.y
                float r1 = java.lang.Math.signum(r1)
                int r1 = (int) r1
                r0.scrollStep(r3, r1, r2)
            L3d:
                r1 = 0
                r6.mPendingInitialRun = r1
                android.view.View r1 = r6.mTargetView
                if (r1 == 0) goto L60
                int r1 = r6.getChildPosition(r1)
                int r3 = r6.mTargetPosition
                if (r1 != r3) goto L5e
                android.view.View r1 = r6.mTargetView
                androidx.recyclerview.widget.RecyclerView$State r2 = r0.mState
                androidx.recyclerview.widget.RecyclerView$SmoothScroller$Action r3 = r6.mRecyclingAction
                r6.onTargetFound(r1, r2, r3)
                androidx.recyclerview.widget.RecyclerView$SmoothScroller$Action r1 = r6.mRecyclingAction
                r1.runIfNecessary(r0)
                r6.stop()
                goto L60
            L5e:
                r6.mTargetView = r2
            L60:
                boolean r1 = r6.mRunning
                if (r1 == 0) goto L84
                androidx.recyclerview.widget.RecyclerView$State r1 = r0.mState
                androidx.recyclerview.widget.RecyclerView$SmoothScroller$Action r2 = r6.mRecyclingAction
                r6.onSeekTargetStep(r7, r8, r1, r2)
                androidx.recyclerview.widget.RecyclerView$SmoothScroller$Action r7 = r6.mRecyclingAction
                boolean r7 = r7.hasJumpTarget()
                androidx.recyclerview.widget.RecyclerView$SmoothScroller$Action r8 = r6.mRecyclingAction
                r8.runIfNecessary(r0)
                if (r7 == 0) goto L84
                boolean r7 = r6.mRunning
                if (r7 == 0) goto L84
                r7 = 1
                r6.mPendingInitialRun = r7
                androidx.recyclerview.widget.RecyclerView$ViewFlinger r7 = r0.mViewFlinger
                r7.postOnAnimation()
            L84:
                return
        }

        protected void onChildAttachedToWindow(android.view.View r3) {
                r2 = this;
                int r0 = r2.getChildPosition(r3)
                int r1 = r2.getTargetPosition()
                if (r0 != r1) goto Lc
                r2.mTargetView = r3
            Lc:
                return
        }

        protected abstract void onSeekTargetStep(@androidx.annotation.Px int r1, @androidx.annotation.Px int r2, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r3, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.SmoothScroller.Action r4);

        protected abstract void onStart();

        protected abstract void onStop();

        protected abstract void onTargetFound(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r2, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.SmoothScroller.Action r3);

        public void setTargetPosition(int r1) {
                r0 = this;
                r0.mTargetPosition = r1
                return
        }

        void start(androidx.recyclerview.widget.RecyclerView r2, androidx.recyclerview.widget.RecyclerView.LayoutManager r3) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ViewFlinger r0 = r2.mViewFlinger
                r0.stop()
                r1.mRecyclerView = r2
                r1.mLayoutManager = r3
                int r3 = r1.mTargetPosition
                r0 = -1
                if (r3 == r0) goto L2e
                androidx.recyclerview.widget.RecyclerView$State r2 = r2.mState
                r2.mTargetPosition = r3
                r2 = 1
                r1.mRunning = r2
                r1.mPendingInitialRun = r2
                int r3 = r1.getTargetPosition()
                android.view.View r3 = r1.findViewByPosition(r3)
                r1.mTargetView = r3
                r1.onStart()
                androidx.recyclerview.widget.RecyclerView r3 = r1.mRecyclerView
                androidx.recyclerview.widget.RecyclerView$ViewFlinger r3 = r3.mViewFlinger
                r3.postOnAnimation()
                r1.mStarted = r2
                return
            L2e:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "Invalid target position"
                r2.<init>(r3)
                throw r2
        }

        protected final void stop() {
                r3 = this;
                boolean r0 = r3.mRunning
                if (r0 != 0) goto L5
                return
            L5:
                r0 = 0
                r3.mRunning = r0
                r3.onStop()
                androidx.recyclerview.widget.RecyclerView r1 = r3.mRecyclerView
                androidx.recyclerview.widget.RecyclerView$State r1 = r1.mState
                r2 = -1
                r1.mTargetPosition = r2
                r1 = 0
                r3.mTargetView = r1
                r3.mTargetPosition = r2
                r3.mPendingInitialRun = r0
                androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r3.mLayoutManager
                r0.onSmoothScrollerStopped(r3)
                r3.mLayoutManager = r1
                r3.mRecyclerView = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class State {
        static final int STEP_ANIMATIONS = 4;
        static final int STEP_LAYOUT = 2;
        static final int STEP_START = 1;
        private android.util.SparseArray<java.lang.Object> mData;
        int mDeletedInvisibleItemCountSincePreviousLayout;
        long mFocusedItemId;
        int mFocusedItemPosition;
        int mFocusedSubChildId;
        boolean mInPreLayout;
        boolean mIsMeasuring;
        int mItemCount;
        int mLayoutStep;
        int mPreviousLayoutItemCount;
        int mRemainingScrollHorizontal;
        int mRemainingScrollVertical;
        boolean mRunPredictiveAnimations;
        boolean mRunSimpleAnimations;
        boolean mStructureChanged;
        int mTargetPosition;
        boolean mTrackOldChangeHolders;

        public State() {
                r2 = this;
                r2.<init>()
                r0 = -1
                r2.mTargetPosition = r0
                r0 = 0
                r2.mPreviousLayoutItemCount = r0
                r2.mDeletedInvisibleItemCountSincePreviousLayout = r0
                r1 = 1
                r2.mLayoutStep = r1
                r2.mItemCount = r0
                r2.mStructureChanged = r0
                r2.mInPreLayout = r0
                r2.mTrackOldChangeHolders = r0
                r2.mIsMeasuring = r0
                r2.mRunSimpleAnimations = r0
                r2.mRunPredictiveAnimations = r0
                return
        }

        void assertLayoutStep(int r4) {
                r3 = this;
                int r0 = r3.mLayoutStep
                r0 = r0 & r4
                if (r0 == 0) goto L6
                return
            L6:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Layout state should be one of "
                r1.append(r2)
                java.lang.String r4 = java.lang.Integer.toBinaryString(r4)
                r1.append(r4)
                java.lang.String r4 = " but it is "
                r1.append(r4)
                int r4 = r3.mLayoutStep
                java.lang.String r4 = java.lang.Integer.toBinaryString(r4)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        public boolean didStructureChange() {
                r1 = this;
                boolean r0 = r1.mStructureChanged
                return r0
        }

        public <T> T get(int r2) {
                r1 = this;
                android.util.SparseArray<java.lang.Object> r0 = r1.mData
                if (r0 != 0) goto L6
                r2 = 0
                return r2
            L6:
                java.lang.Object r2 = r0.get(r2)
                return r2
        }

        public int getItemCount() {
                r2 = this;
                boolean r0 = r2.mInPreLayout
                if (r0 == 0) goto La
                int r0 = r2.mPreviousLayoutItemCount
                int r1 = r2.mDeletedInvisibleItemCountSincePreviousLayout
                int r0 = r0 - r1
                return r0
            La:
                int r0 = r2.mItemCount
                return r0
        }

        public int getRemainingScrollHorizontal() {
                r1 = this;
                int r0 = r1.mRemainingScrollHorizontal
                return r0
        }

        public int getRemainingScrollVertical() {
                r1 = this;
                int r0 = r1.mRemainingScrollVertical
                return r0
        }

        public int getTargetScrollPosition() {
                r1 = this;
                int r0 = r1.mTargetPosition
                return r0
        }

        public boolean hasTargetScrollPosition() {
                r2 = this;
                int r0 = r2.mTargetPosition
                r1 = -1
                if (r0 == r1) goto L7
                r0 = 1
                return r0
            L7:
                r0 = 0
                return r0
        }

        public boolean isMeasuring() {
                r1 = this;
                boolean r0 = r1.mIsMeasuring
                return r0
        }

        public boolean isPreLayout() {
                r1 = this;
                boolean r0 = r1.mInPreLayout
                return r0
        }

        void prepareForNestedPrefetch(androidx.recyclerview.widget.RecyclerView.Adapter r2) {
                r1 = this;
                r0 = 1
                r1.mLayoutStep = r0
                int r2 = r2.getItemCount()
                r1.mItemCount = r2
                r2 = 0
                r1.mInPreLayout = r2
                r1.mTrackOldChangeHolders = r2
                r1.mIsMeasuring = r2
                return
        }

        public void put(int r2, java.lang.Object r3) {
                r1 = this;
                android.util.SparseArray<java.lang.Object> r0 = r1.mData
                if (r0 != 0) goto Lb
                android.util.SparseArray r0 = new android.util.SparseArray
                r0.<init>()
                r1.mData = r0
            Lb:
                android.util.SparseArray<java.lang.Object> r0 = r1.mData
                r0.put(r2, r3)
                return
        }

        public void remove(int r2) {
                r1 = this;
                android.util.SparseArray<java.lang.Object> r0 = r1.mData
                if (r0 != 0) goto L5
                return
            L5:
                r0.remove(r2)
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "State{mTargetPosition="
                r0.append(r1)
                int r1 = r2.mTargetPosition
                r0.append(r1)
                java.lang.String r1 = ", mData="
                r0.append(r1)
                android.util.SparseArray<java.lang.Object> r1 = r2.mData
                r0.append(r1)
                java.lang.String r1 = ", mItemCount="
                r0.append(r1)
                int r1 = r2.mItemCount
                r0.append(r1)
                java.lang.String r1 = ", mIsMeasuring="
                r0.append(r1)
                boolean r1 = r2.mIsMeasuring
                r0.append(r1)
                java.lang.String r1 = ", mPreviousLayoutItemCount="
                r0.append(r1)
                int r1 = r2.mPreviousLayoutItemCount
                r0.append(r1)
                java.lang.String r1 = ", mDeletedInvisibleItemCountSincePreviousLayout="
                r0.append(r1)
                int r1 = r2.mDeletedInvisibleItemCountSincePreviousLayout
                r0.append(r1)
                java.lang.String r1 = ", mStructureChanged="
                r0.append(r1)
                boolean r1 = r2.mStructureChanged
                r0.append(r1)
                java.lang.String r1 = ", mInPreLayout="
                r0.append(r1)
                boolean r1 = r2.mInPreLayout
                r0.append(r1)
                java.lang.String r1 = ", mRunSimpleAnimations="
                r0.append(r1)
                boolean r1 = r2.mRunSimpleAnimations
                r0.append(r1)
                java.lang.String r1 = ", mRunPredictiveAnimations="
                r0.append(r1)
                boolean r1 = r2.mRunPredictiveAnimations
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        public boolean willRunPredictiveAnimations() {
                r1 = this;
                boolean r0 = r1.mRunPredictiveAnimations
                return r0
        }

        public boolean willRunSimpleAnimations() {
                r1 = this;
                boolean r0 = r1.mRunSimpleAnimations
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class StretchEdgeEffectFactory extends androidx.recyclerview.widget.RecyclerView.EdgeEffectFactory {
        StretchEdgeEffectFactory() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.EdgeEffectFactory
        @androidx.annotation.NonNull
        protected android.widget.EdgeEffect createEdgeEffect(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r1, int r2) {
                r0 = this;
                android.widget.EdgeEffect r2 = new android.widget.EdgeEffect
                android.content.Context r1 = r1.getContext()
                r2.<init>(r1)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class ViewCacheExtension {
        public ViewCacheExtension() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.Nullable
        public abstract android.view.View getViewForPositionAndType(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.Recycler r1, int r2, int r3);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class ViewFlinger implements java.lang.Runnable {
        private boolean mEatRunOnAnimationRequest;
        android.view.animation.Interpolator mInterpolator;
        private int mLastFlingX;
        private int mLastFlingY;
        android.widget.OverScroller mOverScroller;
        private boolean mReSchedulePostAnimationCallback;
        final /* synthetic */ androidx.recyclerview.widget.RecyclerView this$0;

        ViewFlinger(androidx.recyclerview.widget.RecyclerView r3) {
                r2 = this;
                r2.this$0 = r3
                r2.<init>()
                android.view.animation.Interpolator r0 = androidx.recyclerview.widget.RecyclerView.sQuinticInterpolator
                r2.mInterpolator = r0
                r1 = 0
                r2.mEatRunOnAnimationRequest = r1
                r2.mReSchedulePostAnimationCallback = r1
                android.widget.OverScroller r1 = new android.widget.OverScroller
                android.content.Context r3 = r3.getContext()
                r1.<init>(r3, r0)
                r2.mOverScroller = r1
                return
        }

        private int computeScrollDuration(int r3, int r4) {
                r2 = this;
                int r3 = java.lang.Math.abs(r3)
                int r4 = java.lang.Math.abs(r4)
                if (r3 <= r4) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                androidx.recyclerview.widget.RecyclerView r1 = r2.this$0
                if (r0 == 0) goto L16
                int r1 = r1.getWidth()
                goto L1a
            L16:
                int r1 = r1.getHeight()
            L1a:
                if (r0 == 0) goto L1d
                goto L1e
            L1d:
                r3 = r4
            L1e:
                float r3 = (float) r3
                float r4 = (float) r1
                float r3 = r3 / r4
                r4 = 1065353216(0x3f800000, float:1.0)
                float r3 = r3 + r4
                r4 = 1133903872(0x43960000, float:300.0)
                float r3 = r3 * r4
                int r3 = (int) r3
                r4 = 2000(0x7d0, float:2.803E-42)
                int r3 = java.lang.Math.min(r3, r4)
                return r3
        }

        private void internalPostOnAnimation() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.this$0
                r0.removeCallbacks(r1)
                androidx.recyclerview.widget.RecyclerView r0 = r1.this$0
                androidx.core.view.ViewCompat.postOnAnimation(r0, r1)
                return
        }

        public void fling(int r13, int r14) {
                r12 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r12.this$0
                r1 = 2
                r0.setScrollState(r1)
                r0 = 0
                r12.mLastFlingY = r0
                r12.mLastFlingX = r0
                android.view.animation.Interpolator r0 = r12.mInterpolator
                android.view.animation.Interpolator r1 = androidx.recyclerview.widget.RecyclerView.sQuinticInterpolator
                if (r0 == r1) goto L20
                r12.mInterpolator = r1
                android.widget.OverScroller r0 = new android.widget.OverScroller
                androidx.recyclerview.widget.RecyclerView r2 = r12.this$0
                android.content.Context r2 = r2.getContext()
                r0.<init>(r2, r1)
                r12.mOverScroller = r0
            L20:
                android.widget.OverScroller r3 = r12.mOverScroller
                r10 = -2147483648(0xffffffff80000000, float:-0.0)
                r11 = 2147483647(0x7fffffff, float:NaN)
                r4 = 0
                r5 = 0
                r8 = -2147483648(0xffffffff80000000, float:-0.0)
                r9 = 2147483647(0x7fffffff, float:NaN)
                r6 = r13
                r7 = r14
                r3.fling(r4, r5, r6, r7, r8, r9, r10, r11)
                r12.postOnAnimation()
                return
        }

        void postOnAnimation() {
                r1 = this;
                boolean r0 = r1.mEatRunOnAnimationRequest
                if (r0 == 0) goto L8
                r0 = 1
                r1.mReSchedulePostAnimationCallback = r0
                return
            L8:
                r1.internalPostOnAnimation()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r19 = this;
                r0 = r19
                androidx.recyclerview.widget.RecyclerView r1 = r0.this$0
                androidx.recyclerview.widget.RecyclerView$LayoutManager r2 = r1.mLayout
                if (r2 != 0) goto Lc
                r0.stop()
                return
            Lc:
                r2 = 0
                r0.mReSchedulePostAnimationCallback = r2
                r3 = 1
                r0.mEatRunOnAnimationRequest = r3
                r1.consumePendingUpdateOperations()
                android.widget.OverScroller r1 = r0.mOverScroller
                boolean r4 = r1.computeScrollOffset()
                if (r4 == 0) goto L16d
                int r4 = r1.getCurrX()
                int r5 = r1.getCurrY()
                int r6 = r0.mLastFlingX
                int r6 = r4 - r6
                int r7 = r0.mLastFlingY
                int r7 = r5 - r7
                r0.mLastFlingX = r4
                r0.mLastFlingY = r5
                androidx.recyclerview.widget.RecyclerView r4 = r0.this$0
                int r9 = r4.consumeFlingInHorizontalStretch(r6)
                androidx.recyclerview.widget.RecyclerView r4 = r0.this$0
                int r10 = r4.consumeFlingInVerticalStretch(r7)
                androidx.recyclerview.widget.RecyclerView r8 = r0.this$0
                int[] r11 = r8.mReusableIntPair
                r11[r2] = r2
                r11[r3] = r2
                r12 = 0
                r13 = 1
                boolean r4 = r8.dispatchNestedPreScroll(r9, r10, r11, r12, r13)
                if (r4 == 0) goto L57
                androidx.recyclerview.widget.RecyclerView r4 = r0.this$0
                int[] r4 = r4.mReusableIntPair
                r5 = r4[r2]
                int r9 = r9 - r5
                r4 = r4[r3]
                int r10 = r10 - r4
            L57:
                androidx.recyclerview.widget.RecyclerView r4 = r0.this$0
                int r4 = r4.getOverScrollMode()
                r5 = 2
                if (r4 == r5) goto L65
                androidx.recyclerview.widget.RecyclerView r4 = r0.this$0
                r4.considerReleasingGlowsOnScroll(r9, r10)
            L65:
                androidx.recyclerview.widget.RecyclerView r4 = r0.this$0
                androidx.recyclerview.widget.RecyclerView$Adapter r6 = r4.mAdapter
                if (r6 == 0) goto Lb4
                int[] r6 = r4.mReusableIntPair
                r6[r2] = r2
                r6[r3] = r2
                r4.scrollStep(r9, r10, r6)
                androidx.recyclerview.widget.RecyclerView r4 = r0.this$0
                int[] r6 = r4.mReusableIntPair
                r7 = r6[r2]
                r6 = r6[r3]
                int r9 = r9 - r7
                int r10 = r10 - r6
                androidx.recyclerview.widget.RecyclerView$LayoutManager r4 = r4.mLayout
                androidx.recyclerview.widget.RecyclerView$SmoothScroller r4 = r4.mSmoothScroller
                if (r4 == 0) goto Laf
                boolean r8 = r4.isPendingInitialRun()
                if (r8 != 0) goto Laf
                boolean r8 = r4.isRunning()
                if (r8 == 0) goto Laf
                androidx.recyclerview.widget.RecyclerView r8 = r0.this$0
                androidx.recyclerview.widget.RecyclerView$State r8 = r8.mState
                int r8 = r8.getItemCount()
                if (r8 != 0) goto L9e
                r4.stop()
                goto Laf
            L9e:
                int r11 = r4.getTargetPosition()
                if (r11 < r8) goto Lac
                int r8 = r8 - r3
                r4.setTargetPosition(r8)
                r4.onAnimation(r7, r6)
                goto Laf
            Lac:
                r4.onAnimation(r7, r6)
            Laf:
                r13 = r6
                r12 = r7
            Lb1:
                r14 = r9
                r15 = r10
                goto Lb7
            Lb4:
                r12 = 0
                r13 = 0
                goto Lb1
            Lb7:
                androidx.recyclerview.widget.RecyclerView r4 = r0.this$0
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ItemDecoration> r4 = r4.mItemDecorations
                boolean r4 = r4.isEmpty()
                if (r4 != 0) goto Lc6
                androidx.recyclerview.widget.RecyclerView r4 = r0.this$0
                r4.invalidate()
            Lc6:
                androidx.recyclerview.widget.RecyclerView r11 = r0.this$0
                int[] r4 = r11.mReusableIntPair
                r4[r2] = r2
                r4[r3] = r2
                r16 = 0
                r17 = 1
                r18 = r4
                r11.dispatchNestedScroll(r12, r13, r14, r15, r16, r17, r18)
                androidx.recyclerview.widget.RecyclerView r4 = r0.this$0
                int[] r6 = r4.mReusableIntPair
                r7 = r6[r2]
                int r14 = r14 - r7
                r6 = r6[r3]
                int r15 = r15 - r6
                if (r12 != 0) goto Le5
                if (r13 == 0) goto Le8
            Le5:
                r4.dispatchOnScrolled(r12, r13)
            Le8:
                androidx.recyclerview.widget.RecyclerView r4 = r0.this$0
                boolean r4 = androidx.recyclerview.widget.RecyclerView.access$200(r4)
                if (r4 != 0) goto Lf5
                androidx.recyclerview.widget.RecyclerView r4 = r0.this$0
                r4.invalidate()
            Lf5:
                int r4 = r1.getCurrX()
                int r6 = r1.getFinalX()
                if (r4 != r6) goto L101
                r4 = 1
                goto L102
            L101:
                r4 = 0
            L102:
                int r6 = r1.getCurrY()
                int r7 = r1.getFinalY()
                if (r6 != r7) goto L10e
                r6 = 1
                goto L10f
            L10e:
                r6 = 0
            L10f:
                boolean r7 = r1.isFinished()
                if (r7 != 0) goto L120
                if (r4 != 0) goto L119
                if (r14 == 0) goto L11e
            L119:
                if (r6 != 0) goto L120
                if (r15 == 0) goto L11e
                goto L120
            L11e:
                r4 = 0
                goto L121
            L120:
                r4 = 1
            L121:
                androidx.recyclerview.widget.RecyclerView r6 = r0.this$0
                androidx.recyclerview.widget.RecyclerView$LayoutManager r6 = r6.mLayout
                androidx.recyclerview.widget.RecyclerView$SmoothScroller r6 = r6.mSmoothScroller
                if (r6 == 0) goto L130
                boolean r6 = r6.isPendingInitialRun()
                if (r6 == 0) goto L130
                goto L161
            L130:
                if (r4 == 0) goto L161
                androidx.recyclerview.widget.RecyclerView r4 = r0.this$0
                int r4 = r4.getOverScrollMode()
                if (r4 == r5) goto L155
                float r1 = r1.getCurrVelocity()
                int r1 = (int) r1
                if (r14 >= 0) goto L143
                int r4 = -r1
                goto L148
            L143:
                if (r14 <= 0) goto L147
                r4 = r1
                goto L148
            L147:
                r4 = 0
            L148:
                if (r15 >= 0) goto L14c
                int r1 = -r1
                goto L150
            L14c:
                if (r15 <= 0) goto L14f
                goto L150
            L14f:
                r1 = 0
            L150:
                androidx.recyclerview.widget.RecyclerView r5 = r0.this$0
                r5.absorbGlows(r4, r1)
            L155:
                boolean r1 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
                if (r1 == 0) goto L16d
                androidx.recyclerview.widget.RecyclerView r1 = r0.this$0
                androidx.recyclerview.widget.GapWorker$LayoutPrefetchRegistryImpl r1 = r1.mPrefetchRegistry
                r1.clearPrefetchPositions()
                goto L16d
            L161:
                r0.postOnAnimation()
                androidx.recyclerview.widget.RecyclerView r1 = r0.this$0
                androidx.recyclerview.widget.GapWorker r4 = r1.mGapWorker
                if (r4 == 0) goto L16d
                r4.postFromTraversal(r1, r12, r13)
            L16d:
                androidx.recyclerview.widget.RecyclerView r1 = r0.this$0
                androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r1.mLayout
                androidx.recyclerview.widget.RecyclerView$SmoothScroller r1 = r1.mSmoothScroller
                if (r1 == 0) goto L17e
                boolean r4 = r1.isPendingInitialRun()
                if (r4 == 0) goto L17e
                r1.onAnimation(r2, r2)
            L17e:
                r0.mEatRunOnAnimationRequest = r2
                boolean r1 = r0.mReSchedulePostAnimationCallback
                if (r1 == 0) goto L188
                r0.internalPostOnAnimation()
                return
            L188:
                androidx.recyclerview.widget.RecyclerView r1 = r0.this$0
                r1.setScrollState(r2)
                androidx.recyclerview.widget.RecyclerView r1 = r0.this$0
                r1.stopNestedScroll(r3)
                return
        }

        public void smoothScrollBy(int r7, int r8, int r9, @androidx.annotation.Nullable android.view.animation.Interpolator r10) {
                r6 = this;
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r9 != r0) goto L8
                int r9 = r6.computeScrollDuration(r7, r8)
            L8:
                r5 = r9
                if (r10 != 0) goto Ld
                android.view.animation.Interpolator r10 = androidx.recyclerview.widget.RecyclerView.sQuinticInterpolator
            Ld:
                android.view.animation.Interpolator r9 = r6.mInterpolator
                if (r9 == r10) goto L20
                r6.mInterpolator = r10
                android.widget.OverScroller r9 = new android.widget.OverScroller
                androidx.recyclerview.widget.RecyclerView r0 = r6.this$0
                android.content.Context r0 = r0.getContext()
                r9.<init>(r0, r10)
                r6.mOverScroller = r9
            L20:
                r9 = 0
                r6.mLastFlingY = r9
                r6.mLastFlingX = r9
                androidx.recyclerview.widget.RecyclerView r9 = r6.this$0
                r10 = 2
                r9.setScrollState(r10)
                android.widget.OverScroller r0 = r6.mOverScroller
                r1 = 0
                r2 = 0
                r3 = r7
                r4 = r8
                r0.startScroll(r1, r2, r3, r4, r5)
                int r7 = android.os.Build.VERSION.SDK_INT
                r8 = 23
                if (r7 >= r8) goto L3f
                android.widget.OverScroller r7 = r6.mOverScroller
                r7.computeScrollOffset()
            L3f:
                r6.postOnAnimation()
                return
        }

        public void stop() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.this$0
                r0.removeCallbacks(r1)
                android.widget.OverScroller r0 = r1.mOverScroller
                r0.abortAnimation()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class ViewHolder {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final java.util.List<java.lang.Object> FULLUPDATE_PAYLOADS = null;
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;

        @androidx.annotation.NonNull
        public final android.view.View itemView;
        androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder> mBindingAdapter;
        int mFlags;
        boolean mInChangeScrap;
        private int mIsRecyclableCount;
        long mItemId;
        int mItemViewType;
        java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView> mNestedRecyclerView;
        int mOldPosition;
        androidx.recyclerview.widget.RecyclerView mOwnerRecyclerView;
        java.util.List<java.lang.Object> mPayloads;

        @androidx.annotation.VisibleForTesting
        int mPendingAccessibilityState;
        int mPosition;
        int mPreLayoutPosition;
        androidx.recyclerview.widget.RecyclerView.Recycler mScrapContainer;
        androidx.recyclerview.widget.RecyclerView.ViewHolder mShadowedHolder;
        androidx.recyclerview.widget.RecyclerView.ViewHolder mShadowingHolder;
        java.util.List<java.lang.Object> mUnmodifiedPayloads;
        private int mWasImportantForAccessibilityBeforeHidden;

        static {
                java.util.List r0 = java.util.Collections.EMPTY_LIST
                androidx.recyclerview.widget.RecyclerView.ViewHolder.FULLUPDATE_PAYLOADS = r0
                return
        }

        public ViewHolder(@androidx.annotation.NonNull android.view.View r4) {
                r3 = this;
                r3.<init>()
                r0 = -1
                r3.mPosition = r0
                r3.mOldPosition = r0
                r1 = -1
                r3.mItemId = r1
                r3.mItemViewType = r0
                r3.mPreLayoutPosition = r0
                r1 = 0
                r3.mShadowedHolder = r1
                r3.mShadowingHolder = r1
                r3.mPayloads = r1
                r3.mUnmodifiedPayloads = r1
                r2 = 0
                r3.mIsRecyclableCount = r2
                r3.mScrapContainer = r1
                r3.mInChangeScrap = r2
                r3.mWasImportantForAccessibilityBeforeHidden = r2
                r3.mPendingAccessibilityState = r0
                if (r4 == 0) goto L29
                r3.itemView = r4
                return
            L29:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "itemView may not be null"
                r4.<init>(r0)
                throw r4
        }

        private void createPayloadsIfNeeded() {
                r1 = this;
                java.util.List<java.lang.Object> r0 = r1.mPayloads
                if (r0 != 0) goto L11
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mPayloads = r0
                java.util.List r0 = java.util.Collections.unmodifiableList(r0)
                r1.mUnmodifiedPayloads = r0
            L11:
                return
        }

        void addChangePayload(java.lang.Object r3) {
                r2 = this;
                r0 = 1024(0x400, float:1.435E-42)
                if (r3 != 0) goto L8
                r2.addFlags(r0)
                return
            L8:
                int r1 = r2.mFlags
                r0 = r0 & r1
                if (r0 != 0) goto L15
                r2.createPayloadsIfNeeded()
                java.util.List<java.lang.Object> r0 = r2.mPayloads
                r0.add(r3)
            L15:
                return
        }

        void addFlags(int r2) {
                r1 = this;
                int r0 = r1.mFlags
                r2 = r2 | r0
                r1.mFlags = r2
                return
        }

        void clearOldPosition() {
                r1 = this;
                r0 = -1
                r1.mOldPosition = r0
                r1.mPreLayoutPosition = r0
                return
        }

        void clearPayload() {
                r1 = this;
                java.util.List<java.lang.Object> r0 = r1.mPayloads
                if (r0 == 0) goto L7
                r0.clear()
            L7:
                int r0 = r1.mFlags
                r0 = r0 & (-1025(0xfffffffffffffbff, float:NaN))
                r1.mFlags = r0
                return
        }

        void clearReturnedFromScrapFlag() {
                r1 = this;
                int r0 = r1.mFlags
                r0 = r0 & (-33)
                r1.mFlags = r0
                return
        }

        void clearTmpDetachFlag() {
                r1 = this;
                int r0 = r1.mFlags
                r0 = r0 & (-257(0xfffffffffffffeff, float:NaN))
                r1.mFlags = r0
                return
        }

        boolean doesTransientStatePreventRecycling() {
                r1 = this;
                int r0 = r1.mFlags
                r0 = r0 & 16
                if (r0 != 0) goto L10
                android.view.View r0 = r1.itemView
                boolean r0 = androidx.core.view.ViewCompat.hasTransientState(r0)
                if (r0 == 0) goto L10
                r0 = 1
                return r0
            L10:
                r0 = 0
                return r0
        }

        void flagRemovedAndOffsetPosition(int r2, int r3, boolean r4) {
                r1 = this;
                r0 = 8
                r1.addFlags(r0)
                r1.offsetPosition(r3, r4)
                r1.mPosition = r2
                return
        }

        public final int getAbsoluteAdapterPosition() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mOwnerRecyclerView
                if (r0 != 0) goto L6
                r0 = -1
                return r0
            L6:
                int r0 = r0.getAdapterPositionInRecyclerView(r1)
                return r0
        }

        @java.lang.Deprecated
        public final int getAdapterPosition() {
                r1 = this;
                int r0 = r1.getBindingAdapterPosition()
                return r0
        }

        @androidx.annotation.Nullable
        public final androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder> getBindingAdapter() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$Adapter<? extends androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r1.mBindingAdapter
                return r0
        }

        public final int getBindingAdapterPosition() {
                r3 = this;
                androidx.recyclerview.widget.RecyclerView$Adapter<? extends androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r3.mBindingAdapter
                r1 = -1
                if (r0 != 0) goto L6
                return r1
            L6:
                androidx.recyclerview.widget.RecyclerView r0 = r3.mOwnerRecyclerView
                if (r0 != 0) goto Lb
                return r1
            Lb:
                androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.getAdapter()
                if (r0 != 0) goto L12
                return r1
            L12:
                androidx.recyclerview.widget.RecyclerView r2 = r3.mOwnerRecyclerView
                int r2 = r2.getAdapterPositionInRecyclerView(r3)
                if (r2 != r1) goto L1b
                return r1
            L1b:
                androidx.recyclerview.widget.RecyclerView$Adapter<? extends androidx.recyclerview.widget.RecyclerView$ViewHolder> r1 = r3.mBindingAdapter
                int r0 = r0.findRelativeAdapterPositionIn(r1, r3, r2)
                return r0
        }

        public final long getItemId() {
                r2 = this;
                long r0 = r2.mItemId
                return r0
        }

        public final int getItemViewType() {
                r1 = this;
                int r0 = r1.mItemViewType
                return r0
        }

        public final int getLayoutPosition() {
                r2 = this;
                int r0 = r2.mPreLayoutPosition
                r1 = -1
                if (r0 != r1) goto L7
                int r0 = r2.mPosition
            L7:
                return r0
        }

        public final int getOldPosition() {
                r1 = this;
                int r0 = r1.mOldPosition
                return r0
        }

        @java.lang.Deprecated
        public final int getPosition() {
                r2 = this;
                int r0 = r2.mPreLayoutPosition
                r1 = -1
                if (r0 != r1) goto L7
                int r0 = r2.mPosition
            L7:
                return r0
        }

        java.util.List<java.lang.Object> getUnmodifiedPayloads() {
                r1 = this;
                int r0 = r1.mFlags
                r0 = r0 & 1024(0x400, float:1.435E-42)
                if (r0 != 0) goto L17
                java.util.List<java.lang.Object> r0 = r1.mPayloads
                if (r0 == 0) goto L14
                int r0 = r0.size()
                if (r0 != 0) goto L11
                goto L14
            L11:
                java.util.List<java.lang.Object> r0 = r1.mUnmodifiedPayloads
                return r0
            L14:
                java.util.List<java.lang.Object> r0 = androidx.recyclerview.widget.RecyclerView.ViewHolder.FULLUPDATE_PAYLOADS
                return r0
            L17:
                java.util.List<java.lang.Object> r0 = androidx.recyclerview.widget.RecyclerView.ViewHolder.FULLUPDATE_PAYLOADS
                return r0
        }

        boolean hasAnyOfTheFlags(int r2) {
                r1 = this;
                int r0 = r1.mFlags
                r2 = r2 & r0
                if (r2 == 0) goto L7
                r2 = 1
                return r2
            L7:
                r2 = 0
                return r2
        }

        boolean isAdapterPositionUnknown() {
                r1 = this;
                int r0 = r1.mFlags
                r0 = r0 & 512(0x200, float:7.17E-43)
                if (r0 != 0) goto Lf
                boolean r0 = r1.isInvalid()
                if (r0 == 0) goto Ld
                goto Lf
            Ld:
                r0 = 0
                return r0
            Lf:
                r0 = 1
                return r0
        }

        boolean isAttachedToTransitionOverlay() {
                r2 = this;
                android.view.View r0 = r2.itemView
                android.view.ViewParent r0 = r0.getParent()
                if (r0 == 0) goto L14
                android.view.View r0 = r2.itemView
                android.view.ViewParent r0 = r0.getParent()
                androidx.recyclerview.widget.RecyclerView r1 = r2.mOwnerRecyclerView
                if (r0 == r1) goto L14
                r0 = 1
                return r0
            L14:
                r0 = 0
                return r0
        }

        boolean isBound() {
                r2 = this;
                int r0 = r2.mFlags
                r1 = 1
                r0 = r0 & r1
                if (r0 == 0) goto L7
                return r1
            L7:
                r0 = 0
                return r0
        }

        boolean isInvalid() {
                r1 = this;
                int r0 = r1.mFlags
                r0 = r0 & 4
                if (r0 == 0) goto L8
                r0 = 1
                return r0
            L8:
                r0 = 0
                return r0
        }

        public final boolean isRecyclable() {
                r1 = this;
                int r0 = r1.mFlags
                r0 = r0 & 16
                if (r0 != 0) goto L10
                android.view.View r0 = r1.itemView
                boolean r0 = androidx.core.view.ViewCompat.hasTransientState(r0)
                if (r0 != 0) goto L10
                r0 = 1
                return r0
            L10:
                r0 = 0
                return r0
        }

        boolean isRemoved() {
                r1 = this;
                int r0 = r1.mFlags
                r0 = r0 & 8
                if (r0 == 0) goto L8
                r0 = 1
                return r0
            L8:
                r0 = 0
                return r0
        }

        boolean isScrap() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$Recycler r0 = r1.mScrapContainer
                if (r0 == 0) goto L6
                r0 = 1
                return r0
            L6:
                r0 = 0
                return r0
        }

        boolean isTmpDetached() {
                r1 = this;
                int r0 = r1.mFlags
                r0 = r0 & 256(0x100, float:3.59E-43)
                if (r0 == 0) goto L8
                r0 = 1
                return r0
            L8:
                r0 = 0
                return r0
        }

        boolean isUpdated() {
                r1 = this;
                int r0 = r1.mFlags
                r0 = r0 & 2
                if (r0 == 0) goto L8
                r0 = 1
                return r0
            L8:
                r0 = 0
                return r0
        }

        boolean needsUpdate() {
                r1 = this;
                int r0 = r1.mFlags
                r0 = r0 & 2
                if (r0 == 0) goto L8
                r0 = 1
                return r0
            L8:
                r0 = 0
                return r0
        }

        void offsetPosition(int r3, boolean r4) {
                r2 = this;
                int r0 = r2.mOldPosition
                r1 = -1
                if (r0 != r1) goto L9
                int r0 = r2.mPosition
                r2.mOldPosition = r0
            L9:
                int r0 = r2.mPreLayoutPosition
                if (r0 != r1) goto L11
                int r0 = r2.mPosition
                r2.mPreLayoutPosition = r0
            L11:
                if (r4 == 0) goto L18
                int r4 = r2.mPreLayoutPosition
                int r4 = r4 + r3
                r2.mPreLayoutPosition = r4
            L18:
                int r4 = r2.mPosition
                int r4 = r4 + r3
                r2.mPosition = r4
                android.view.View r3 = r2.itemView
                android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                if (r3 == 0) goto L30
                android.view.View r3 = r2.itemView
                android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$LayoutParams r3 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r3
                r4 = 1
                r3.mInsetsDirty = r4
            L30:
                return
        }

        void onEnteredHiddenState(androidx.recyclerview.widget.RecyclerView r3) {
                r2 = this;
                int r0 = r2.mPendingAccessibilityState
                r1 = -1
                if (r0 == r1) goto L8
                r2.mWasImportantForAccessibilityBeforeHidden = r0
                goto L10
            L8:
                android.view.View r0 = r2.itemView
                int r0 = androidx.core.view.ViewCompat.getImportantForAccessibility(r0)
                r2.mWasImportantForAccessibilityBeforeHidden = r0
            L10:
                r0 = 4
                r3.setChildImportantForAccessibilityInternal(r2, r0)
                return
        }

        void onLeftHiddenState(androidx.recyclerview.widget.RecyclerView r2) {
                r1 = this;
                int r0 = r1.mWasImportantForAccessibilityBeforeHidden
                r2.setChildImportantForAccessibilityInternal(r1, r0)
                r2 = 0
                r1.mWasImportantForAccessibilityBeforeHidden = r2
                return
        }

        void resetInternal() {
                r4 = this;
                r0 = 0
                r4.mFlags = r0
                r1 = -1
                r4.mPosition = r1
                r4.mOldPosition = r1
                r2 = -1
                r4.mItemId = r2
                r4.mPreLayoutPosition = r1
                r4.mIsRecyclableCount = r0
                r2 = 0
                r4.mShadowedHolder = r2
                r4.mShadowingHolder = r2
                r4.clearPayload()
                r4.mWasImportantForAccessibilityBeforeHidden = r0
                r4.mPendingAccessibilityState = r1
                androidx.recyclerview.widget.RecyclerView.clearNestedRecyclerViewIfNotNested(r4)
                return
        }

        void saveOldPosition() {
                r2 = this;
                int r0 = r2.mOldPosition
                r1 = -1
                if (r0 != r1) goto L9
                int r0 = r2.mPosition
                r2.mOldPosition = r0
            L9:
                return
        }

        void setFlags(int r3, int r4) {
                r2 = this;
                int r0 = r2.mFlags
                int r1 = ~r4
                r0 = r0 & r1
                r3 = r3 & r4
                r3 = r3 | r0
                r2.mFlags = r3
                return
        }

        public final void setIsRecyclable(boolean r3) {
                r2 = this;
                r0 = 1
                int r1 = r2.mIsRecyclableCount
                if (r3 == 0) goto L7
                int r1 = r1 - r0
                goto L8
            L7:
                int r1 = r1 + r0
            L8:
                r2.mIsRecyclableCount = r1
                if (r1 >= 0) goto L13
                r3 = 0
                r2.mIsRecyclableCount = r3
                r2.toString()
                return
            L13:
                if (r3 != 0) goto L1e
                if (r1 != r0) goto L1e
                int r3 = r2.mFlags
                r3 = r3 | 16
                r2.mFlags = r3
                return
            L1e:
                if (r3 == 0) goto L28
                if (r1 != 0) goto L28
                int r3 = r2.mFlags
                r3 = r3 & (-17)
                r2.mFlags = r3
            L28:
                return
        }

        void setScrapContainer(androidx.recyclerview.widget.RecyclerView.Recycler r1, boolean r2) {
                r0 = this;
                r0.mScrapContainer = r1
                r0.mInChangeScrap = r2
                return
        }

        boolean shouldBeKeptAsChild() {
                r1 = this;
                int r0 = r1.mFlags
                r0 = r0 & 16
                if (r0 == 0) goto L8
                r0 = 1
                return r0
            L8:
                r0 = 0
                return r0
        }

        boolean shouldIgnore() {
                r1 = this;
                int r0 = r1.mFlags
                r0 = r0 & 128(0x80, float:1.8E-43)
                if (r0 == 0) goto L8
                r0 = 1
                return r0
            L8:
                r0 = 0
                return r0
        }

        void stopIgnoring() {
                r1 = this;
                int r0 = r1.mFlags
                r0 = r0 & (-129(0xffffffffffffff7f, float:NaN))
                r1.mFlags = r0
                return
        }

        public java.lang.String toString() {
                r5 = this;
                java.lang.Class r0 = r5.getClass()
                boolean r0 = r0.isAnonymousClass()
                if (r0 == 0) goto Ld
                java.lang.String r0 = "ViewHolder"
                goto L15
            Ld:
                java.lang.Class r0 = r5.getClass()
                java.lang.String r0 = r0.getSimpleName()
            L15:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r0)
                java.lang.String r0 = "{"
                r2.append(r0)
                int r0 = r5.hashCode()
                java.lang.String r0 = java.lang.Integer.toHexString(r0)
                r2.append(r0)
                java.lang.String r0 = " position="
                r2.append(r0)
                int r0 = r5.mPosition
                r2.append(r0)
                java.lang.String r0 = " id="
                r2.append(r0)
                long r3 = r5.mItemId
                r2.append(r3)
                java.lang.String r0 = ", oldPos="
                r2.append(r0)
                int r0 = r5.mOldPosition
                r2.append(r0)
                java.lang.String r0 = ", pLpos:"
                r2.append(r0)
                int r0 = r5.mPreLayoutPosition
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                boolean r0 = r5.isScrap()
                if (r0 == 0) goto L76
                java.lang.String r0 = " scrap "
                r1.append(r0)
                boolean r0 = r5.mInChangeScrap
                if (r0 == 0) goto L71
                java.lang.String r0 = "[changeScrap]"
                goto L73
            L71:
                java.lang.String r0 = "[attachedScrap]"
            L73:
                r1.append(r0)
            L76:
                boolean r0 = r5.isInvalid()
                if (r0 == 0) goto L81
                java.lang.String r0 = " invalid"
                r1.append(r0)
            L81:
                boolean r0 = r5.isBound()
                if (r0 != 0) goto L8c
                java.lang.String r0 = " unbound"
                r1.append(r0)
            L8c:
                boolean r0 = r5.needsUpdate()
                if (r0 == 0) goto L97
                java.lang.String r0 = " update"
                r1.append(r0)
            L97:
                boolean r0 = r5.isRemoved()
                if (r0 == 0) goto La2
                java.lang.String r0 = " removed"
                r1.append(r0)
            La2:
                boolean r0 = r5.shouldIgnore()
                if (r0 == 0) goto Lad
                java.lang.String r0 = " ignored"
                r1.append(r0)
            Lad:
                boolean r0 = r5.isTmpDetached()
                if (r0 == 0) goto Lb8
                java.lang.String r0 = " tmpDetached"
                r1.append(r0)
            Lb8:
                boolean r0 = r5.isRecyclable()
                if (r0 != 0) goto Ld9
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = " not recyclable("
                r0.append(r2)
                int r2 = r5.mIsRecyclableCount
                r0.append(r2)
                java.lang.String r2 = ")"
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                r1.append(r0)
            Ld9:
                boolean r0 = r5.isAdapterPositionUnknown()
                if (r0 == 0) goto Le4
                java.lang.String r0 = " undefined adapter position"
                r1.append(r0)
            Le4:
                android.view.View r0 = r5.itemView
                android.view.ViewParent r0 = r0.getParent()
                if (r0 != 0) goto Lf1
                java.lang.String r0 = " no parent"
                r1.append(r0)
            Lf1:
                java.lang.String r0 = "}"
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
        }

        void unScrap() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$Recycler r0 = r1.mScrapContainer
                r0.unscrapView(r1)
                return
        }

        boolean wasReturnedFromScrap() {
                r1 = this;
                int r0 = r1.mFlags
                r0 = r0 & 32
                if (r0 == 0) goto L8
                r0 = 1
                return r0
            L8:
                r0 = 0
                return r0
        }
    }

    static {
            r0 = 16843830(0x1010436, float:2.369658E-38)
            int[] r0 = new int[]{r0}
            androidx.recyclerview.widget.RecyclerView.NESTED_SCROLLING_ATTRS = r0
            r0 = 4605200834963974390(0x3fe8f5c28f5c28f6, double:0.78)
            double r0 = java.lang.Math.log(r0)
            r2 = 4606281698874543309(0x3feccccccccccccd, double:0.9)
            double r2 = java.lang.Math.log(r2)
            double r0 = r0 / r2
            float r0 = (float) r0
            androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            androidx.recyclerview.widget.RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST = r1
            r2 = 23
            r3 = 1
            if (r0 < r2) goto L2b
            r0 = 1
            goto L2c
        L2b:
            r0 = 0
        L2c:
            androidx.recyclerview.widget.RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC = r0
            androidx.recyclerview.widget.RecyclerView.POST_UPDATES_ON_ANIMATION = r3
            androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK = r3
            androidx.recyclerview.widget.RecyclerView.FORCE_ABS_FOCUS_SEARCH_DIRECTION = r1
            androidx.recyclerview.widget.RecyclerView.IGNORE_DETACHED_FOCUSED_CHILD = r1
            r0 = 4
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            java.lang.Class<android.util.AttributeSet> r1 = android.util.AttributeSet.class
            r0[r3] = r1
            r1 = 2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r0[r1] = r2
            r1 = 3
            r0[r1] = r2
            androidx.recyclerview.widget.RecyclerView.LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = r0
            androidx.recyclerview.widget.RecyclerView$3 r0 = new androidx.recyclerview.widget.RecyclerView$3
            r0.<init>()
            androidx.recyclerview.widget.RecyclerView.sQuinticInterpolator = r0
            androidx.recyclerview.widget.RecyclerView$StretchEdgeEffectFactory r0 = new androidx.recyclerview.widget.RecyclerView$StretchEdgeEffectFactory
            r0.<init>()
            androidx.recyclerview.widget.RecyclerView.sDefaultEdgeEffectFactory = r0
            return
    }

    public RecyclerView(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public RecyclerView(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            int r0 = androidx.recyclerview.R.attr.recyclerViewStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public RecyclerView(@androidx.annotation.NonNull android.content.Context r11, @androidx.annotation.Nullable android.util.AttributeSet r12, int r13) {
            r10 = this;
            r10.<init>(r11, r12, r13)
            androidx.recyclerview.widget.RecyclerView$RecyclerViewDataObserver r2 = new androidx.recyclerview.widget.RecyclerView$RecyclerViewDataObserver
            r2.<init>(r10)
            r10.mObserver = r2
            androidx.recyclerview.widget.RecyclerView$Recycler r2 = new androidx.recyclerview.widget.RecyclerView$Recycler
            r2.<init>(r10)
            r10.mRecycler = r2
            androidx.recyclerview.widget.ViewInfoStore r2 = new androidx.recyclerview.widget.ViewInfoStore
            r2.<init>()
            r10.mViewInfoStore = r2
            androidx.recyclerview.widget.RecyclerView$1 r2 = new androidx.recyclerview.widget.RecyclerView$1
            r2.<init>(r10)
            r10.mUpdateChildViewsRunnable = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r10.mTempRect = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r10.mTempRect2 = r2
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r10.mTempRectF = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r10.mRecyclerListeners = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r10.mItemDecorations = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r10.mOnItemTouchListeners = r2
            r7 = 0
            r10.mInterceptRequestLayoutDepth = r7
            r10.mDataSetHasChangedAfterLayout = r7
            r10.mDispatchItemsChangedEvent = r7
            r10.mLayoutOrScrollCounter = r7
            r10.mDispatchScrollCounter = r7
            androidx.recyclerview.widget.RecyclerView$StretchEdgeEffectFactory r2 = androidx.recyclerview.widget.RecyclerView.sDefaultEdgeEffectFactory
            r10.mEdgeEffectFactory = r2
            androidx.recyclerview.widget.DefaultItemAnimator r2 = new androidx.recyclerview.widget.DefaultItemAnimator
            r2.<init>()
            r10.mItemAnimator = r2
            r10.mScrollState = r7
            r8 = -1
            r10.mScrollPointerId = r8
            r2 = 1
            r10.mScaledHorizontalScrollFactor = r2
            r10.mScaledVerticalScrollFactor = r2
            r9 = 1
            r10.mPreserveFocusAfterLayout = r9
            androidx.recyclerview.widget.RecyclerView$ViewFlinger r2 = new androidx.recyclerview.widget.RecyclerView$ViewFlinger
            r2.<init>(r10)
            r10.mViewFlinger = r2
            boolean r2 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
            if (r2 == 0) goto L7d
            androidx.recyclerview.widget.GapWorker$LayoutPrefetchRegistryImpl r2 = new androidx.recyclerview.widget.GapWorker$LayoutPrefetchRegistryImpl
            r2.<init>()
            goto L7e
        L7d:
            r2 = 0
        L7e:
            r10.mPrefetchRegistry = r2
            androidx.recyclerview.widget.RecyclerView$State r2 = new androidx.recyclerview.widget.RecyclerView$State
            r2.<init>()
            r10.mState = r2
            r10.mItemsAddedOrRemoved = r7
            r10.mItemsChanged = r7
            androidx.recyclerview.widget.RecyclerView$ItemAnimatorRestoreListener r2 = new androidx.recyclerview.widget.RecyclerView$ItemAnimatorRestoreListener
            r2.<init>(r10)
            r10.mItemAnimatorListener = r2
            r10.mPostedAnimatorRunner = r7
            r2 = 2
            int[] r4 = new int[r2]
            r10.mMinMaxLayoutPositions = r4
            int[] r4 = new int[r2]
            r10.mScrollOffset = r4
            int[] r4 = new int[r2]
            r10.mNestedOffsets = r4
            int[] r4 = new int[r2]
            r10.mReusableIntPair = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r10.mPendingAccessibilityImportanceChange = r4
            androidx.recyclerview.widget.RecyclerView$2 r4 = new androidx.recyclerview.widget.RecyclerView$2
            r4.<init>(r10)
            r10.mItemAnimatorRunner = r4
            r10.mLastAutoMeasureNonExactMeasuredWidth = r7
            r10.mLastAutoMeasureNonExactMeasuredHeight = r7
            androidx.recyclerview.widget.RecyclerView$4 r4 = new androidx.recyclerview.widget.RecyclerView$4
            r4.<init>(r10)
            r10.mViewInfoProcessCallback = r4
            r10.setScrollContainer(r9)
            r10.setFocusableInTouchMode(r9)
            android.view.ViewConfiguration r4 = android.view.ViewConfiguration.get(r11)
            int r6 = r4.getScaledTouchSlop()
            r10.mTouchSlop = r6
            float r6 = androidx.core.view.ViewConfigurationCompat.getScaledHorizontalScrollFactor(r4, r11)
            r10.mScaledHorizontalScrollFactor = r6
            float r6 = androidx.core.view.ViewConfigurationCompat.getScaledVerticalScrollFactor(r4, r11)
            r10.mScaledVerticalScrollFactor = r6
            int r6 = r4.getScaledMinimumFlingVelocity()
            r10.mMinFlingVelocity = r6
            int r4 = r4.getScaledMaximumFlingVelocity()
            r10.mMaxFlingVelocity = r4
            android.content.res.Resources r4 = r11.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            r6 = 1126170624(0x43200000, float:160.0)
            float r4 = r4 * r6
            r6 = 1136724797(0x43c10b3d, float:386.0878)
            float r4 = r4 * r6
            r6 = 1062668861(0x3f570a3d, float:0.84)
            float r4 = r4 * r6
            r10.mPhysicalCoef = r4
            int r4 = r10.getOverScrollMode()
            if (r4 != r2) goto L108
            r2 = 1
            goto L109
        L108:
            r2 = 0
        L109:
            r10.setWillNotDraw(r2)
            androidx.recyclerview.widget.RecyclerView$ItemAnimator r2 = r10.mItemAnimator
            androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemAnimatorListener r4 = r10.mItemAnimatorListener
            r2.setListener(r4)
            r10.initAdapterManager()
            r10.initChildrenHelper()
            r10.initAutofill()
            int r2 = androidx.core.view.ViewCompat.getImportantForAccessibility(r10)
            if (r2 != 0) goto L125
            androidx.core.view.ViewCompat.setImportantForAccessibility(r10, r9)
        L125:
            android.content.Context r2 = r10.getContext()
            java.lang.String r4 = "accessibility"
            java.lang.Object r2 = r2.getSystemService(r4)
            android.view.accessibility.AccessibilityManager r2 = (android.view.accessibility.AccessibilityManager) r2
            r10.mAccessibilityManager = r2
            androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate r2 = new androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate
            r2.<init>(r10)
            r10.setAccessibilityDelegateCompat(r2)
            int[] r2 = androidx.recyclerview.R.styleable.RecyclerView
            android.content.res.TypedArray r4 = r11.obtainStyledAttributes(r12, r2, r13, r7)
            r6 = 0
            r0 = r10
            r1 = r11
            r3 = r12
            r5 = r13
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(r0, r1, r2, r3, r4, r5, r6)
            int r1 = androidx.recyclerview.R.styleable.RecyclerView_layoutManager
            java.lang.String r2 = r4.getString(r1)
            int r1 = androidx.recyclerview.R.styleable.RecyclerView_android_descendantFocusability
            int r1 = r4.getInt(r1, r8)
            if (r1 != r8) goto L15c
            r1 = 262144(0x40000, float:3.67342E-40)
            r10.setDescendantFocusability(r1)
        L15c:
            int r1 = androidx.recyclerview.R.styleable.RecyclerView_android_clipToPadding
            boolean r1 = r4.getBoolean(r1, r9)
            r10.mClipToPadding = r1
            int r1 = androidx.recyclerview.R.styleable.RecyclerView_fastScrollEnabled
            boolean r1 = r4.getBoolean(r1, r7)
            r10.mEnableFastScroller = r1
            if (r1 == 0) goto L18d
            int r1 = androidx.recyclerview.R.styleable.RecyclerView_fastScrollVerticalThumbDrawable
            android.graphics.drawable.Drawable r1 = r4.getDrawable(r1)
            android.graphics.drawable.StateListDrawable r1 = (android.graphics.drawable.StateListDrawable) r1
            int r3 = androidx.recyclerview.R.styleable.RecyclerView_fastScrollVerticalTrackDrawable
            android.graphics.drawable.Drawable r3 = r4.getDrawable(r3)
            int r5 = androidx.recyclerview.R.styleable.RecyclerView_fastScrollHorizontalThumbDrawable
            android.graphics.drawable.Drawable r5 = r4.getDrawable(r5)
            android.graphics.drawable.StateListDrawable r5 = (android.graphics.drawable.StateListDrawable) r5
            int r6 = androidx.recyclerview.R.styleable.RecyclerView_fastScrollHorizontalTrackDrawable
            android.graphics.drawable.Drawable r6 = r4.getDrawable(r6)
            r10.initFastScroller(r1, r3, r5, r6)
        L18d:
            r4.recycle()
            r5 = 0
            r0 = r10
            r1 = r11
            r3 = r12
            r4 = r13
            r0.createLayoutManager(r1, r2, r3, r4, r5)
            int[] r2 = androidx.recyclerview.widget.RecyclerView.NESTED_SCROLLING_ATTRS
            android.content.res.TypedArray r4 = r11.obtainStyledAttributes(r12, r2, r13, r7)
            r6 = 0
            r5 = r13
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(r0, r1, r2, r3, r4, r5, r6)
            boolean r1 = r4.getBoolean(r7, r9)
            r4.recycle()
            r10.setNestedScrollingEnabled(r1)
            androidx.customview.poolingcontainer.PoolingContainer.setPoolingContainer(r10, r9)
            return
    }

    static /* synthetic */ void access$000(androidx.recyclerview.widget.RecyclerView r0, android.view.View r1, int r2, android.view.ViewGroup.LayoutParams r3) {
            r0.attachViewToParent(r1, r2, r3)
            return
    }

    static /* synthetic */ void access$100(androidx.recyclerview.widget.RecyclerView r0, int r1) {
            r0.detachViewFromParent(r1)
            return
    }

    static /* synthetic */ boolean access$200(androidx.recyclerview.widget.RecyclerView r0) {
            boolean r0 = r0.awakenScrollBars()
            return r0
    }

    static /* synthetic */ void access$300(androidx.recyclerview.widget.RecyclerView r0, int r1, int r2) {
            r0.setMeasuredDimension(r1, r2)
            return
    }

    private void addAnimatingView(androidx.recyclerview.widget.RecyclerView.ViewHolder r6) {
            r5 = this;
            android.view.View r0 = r6.itemView
            android.view.ViewParent r1 = r0.getParent()
            r2 = 1
            if (r1 != r5) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            androidx.recyclerview.widget.RecyclerView$Recycler r3 = r5.mRecycler
            androidx.recyclerview.widget.RecyclerView$ViewHolder r4 = r5.getChildViewHolder(r0)
            r3.unscrapView(r4)
            boolean r6 = r6.isTmpDetached()
            if (r6 == 0) goto L26
            androidx.recyclerview.widget.ChildHelper r6 = r5.mChildHelper
            r1 = -1
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            r6.attachViewToParent(r0, r1, r3, r2)
            return
        L26:
            if (r1 != 0) goto L2e
            androidx.recyclerview.widget.ChildHelper r6 = r5.mChildHelper
            r6.addView(r0, r2)
            return
        L2e:
            androidx.recyclerview.widget.ChildHelper r6 = r5.mChildHelper
            r6.hide(r0)
            return
    }

    private void animateChange(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r2, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r3, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo r4, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo r5, boolean r6, boolean r7) {
            r1 = this;
            r0 = 0
            r2.setIsRecyclable(r0)
            if (r6 == 0) goto L9
            r1.addAnimatingView(r2)
        L9:
            if (r2 == r3) goto L1f
            if (r7 == 0) goto L10
            r1.addAnimatingView(r3)
        L10:
            r2.mShadowedHolder = r3
            r1.addAnimatingView(r2)
            androidx.recyclerview.widget.RecyclerView$Recycler r6 = r1.mRecycler
            r6.unscrapView(r2)
            r3.setIsRecyclable(r0)
            r3.mShadowingHolder = r2
        L1f:
            androidx.recyclerview.widget.RecyclerView$ItemAnimator r6 = r1.mItemAnimator
            boolean r2 = r6.animateChange(r2, r3, r4, r5)
            if (r2 == 0) goto L2a
            r1.postAnimationRunner()
        L2a:
            return
    }

    private void cancelScroll() {
            r1 = this;
            r1.resetScroll()
            r0 = 0
            r1.setScrollState(r0)
            return
    }

    static void clearNestedRecyclerViewIfNotNested(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r3) {
            java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView> r0 = r3.mNestedRecyclerView
            if (r0 == 0) goto L21
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
        La:
            r1 = 0
            if (r0 == 0) goto L1f
            android.view.View r2 = r3.itemView
            if (r0 != r2) goto L12
            goto L21
        L12:
            android.view.ViewParent r0 = r0.getParent()
            boolean r2 = r0 instanceof android.view.View
            if (r2 == 0) goto L1d
            android.view.View r0 = (android.view.View) r0
            goto La
        L1d:
            r0 = r1
            goto La
        L1f:
            r3.mNestedRecyclerView = r1
        L21:
            return
    }

    private int consumeFlingInStretch(int r5, android.widget.EdgeEffect r6, android.widget.EdgeEffect r7, int r8) {
            r4 = this;
            r0 = 1056964608(0x3f000000, float:0.5)
            r1 = 0
            r2 = 1082130432(0x40800000, float:4.0)
            if (r5 <= 0) goto L2b
            if (r6 == 0) goto L2b
            float r3 = androidx.core.widget.EdgeEffectCompat.getDistance(r6)
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 == 0) goto L2b
            int r7 = -r5
            float r7 = (float) r7
            float r7 = r7 * r2
            float r1 = (float) r8
            float r7 = r7 / r1
            int r8 = -r8
            float r8 = (float) r8
            float r8 = r8 / r2
            float r7 = androidx.core.widget.EdgeEffectCompat.onPullDistance(r6, r7, r0)
            float r8 = r8 * r7
            int r7 = java.lang.Math.round(r8)
            if (r7 == r5) goto L29
            r6.finish()
        L29:
            int r5 = r5 - r7
            return r5
        L2b:
            if (r5 >= 0) goto L4d
            if (r7 == 0) goto L4d
            float r6 = androidx.core.widget.EdgeEffectCompat.getDistance(r7)
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 == 0) goto L4d
            float r6 = (float) r5
            float r6 = r6 * r2
            float r8 = (float) r8
            float r6 = r6 / r8
            float r8 = r8 / r2
            float r6 = androidx.core.widget.EdgeEffectCompat.onPullDistance(r7, r6, r0)
            float r8 = r8 * r6
            int r6 = java.lang.Math.round(r8)
            if (r6 == r5) goto L4c
            r7.finish()
        L4c:
            int r5 = r5 - r6
        L4d:
            return r5
    }

    private void createLayoutManager(android.content.Context r7, java.lang.String r8, android.util.AttributeSet r9, int r10, int r11) {
            r6 = this;
            java.lang.String r0 = ": Could not instantiate the LayoutManager: "
            if (r8 == 0) goto L123
            java.lang.String r8 = r8.trim()
            boolean r1 = r8.isEmpty()
            if (r1 != 0) goto L123
            java.lang.String r8 = r6.getFullClassName(r7, r8)
            boolean r1 = r6.isInEditMode()     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c
            if (r1 == 0) goto L2f
            java.lang.Class r1 = r6.getClass()     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c
            goto L33
        L21:
            r7 = move-exception
            goto L91
        L23:
            r7 = move-exception
            goto Laf
        L26:
            r7 = move-exception
            goto Lcd
        L29:
            r7 = move-exception
            goto Le9
        L2c:
            r7 = move-exception
            goto L105
        L2f:
            java.lang.ClassLoader r1 = r7.getClassLoader()     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c
        L33:
            r2 = 0
            java.lang.Class r1 = java.lang.Class.forName(r8, r2, r1)     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c
            java.lang.Class<androidx.recyclerview.widget.RecyclerView$LayoutManager> r3 = androidx.recyclerview.widget.RecyclerView.LayoutManager.class
            java.lang.Class r1 = r1.asSubclass(r3)     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c
            r3 = 1
            java.lang.Class<?>[] r4 = androidx.recyclerview.widget.RecyclerView.LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c java.lang.NoSuchMethodException -> L5b
            java.lang.reflect.Constructor r4 = r1.getConstructor(r4)     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c java.lang.NoSuchMethodException -> L5b
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c java.lang.NoSuchMethodException -> L5b
            r5[r2] = r7     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c java.lang.NoSuchMethodException -> L5b
            r5[r3] = r9     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c java.lang.NoSuchMethodException -> L5b
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c java.lang.NoSuchMethodException -> L5b
            r10 = 2
            r5[r10] = r7     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c java.lang.NoSuchMethodException -> L5b
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c java.lang.NoSuchMethodException -> L5b
            r10 = 3
            r5[r10] = r7     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c java.lang.NoSuchMethodException -> L5b
            goto L61
        L5b:
            r7 = move-exception
            r5 = 0
            java.lang.reflect.Constructor r4 = r1.getConstructor(r5)     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c java.lang.NoSuchMethodException -> L6f
        L61:
            r4.setAccessible(r3)     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c
            java.lang.Object r7 = r4.newInstance(r5)     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c
            androidx.recyclerview.widget.RecyclerView$LayoutManager r7 = (androidx.recyclerview.widget.RecyclerView.LayoutManager) r7     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c
            r6.setLayoutManager(r7)     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c
            goto L123
        L6f:
            r10 = move-exception
            r10.initCause(r7)     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c
            r11.<init>()     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c
            java.lang.String r1 = r9.getPositionDescription()     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c
            r11.append(r1)     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c
            java.lang.String r1 = ": Error creating LayoutManager "
            r11.append(r1)     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c
            r11.append(r8)     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c
            java.lang.String r11 = r11.toString()     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c
            r7.<init>(r11, r10)     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c
            throw r7     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c
        L91:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r11.append(r9)
            java.lang.String r9 = ": Class is not a LayoutManager "
            r11.append(r9)
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r10.<init>(r8, r7)
            throw r10
        Laf:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r11.append(r9)
            java.lang.String r9 = ": Cannot access non-public constructor "
            r11.append(r9)
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r10.<init>(r8, r7)
            throw r10
        Lcd:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r11.append(r9)
            r11.append(r0)
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r10.<init>(r8, r7)
            throw r10
        Le9:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r11.append(r9)
            r11.append(r0)
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r10.<init>(r8, r7)
            throw r10
        L105:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r11.append(r9)
            java.lang.String r9 = ": Unable to find LayoutManager "
            r11.append(r9)
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r10.<init>(r8, r7)
            throw r10
        L123:
            return
    }

    private boolean didChildRangeChange(int r5, int r6) {
            r4 = this;
            int[] r0 = r4.mMinMaxLayoutPositions
            r4.findMinMaxChildLayoutPositions(r0)
            int[] r0 = r4.mMinMaxLayoutPositions
            r1 = 0
            r2 = r0[r1]
            r3 = 1
            if (r2 != r5) goto L13
            r5 = r0[r3]
            if (r5 == r6) goto L12
            goto L13
        L12:
            return r1
        L13:
            return r3
    }

    private void dispatchContentChangedIfNecessary() {
            r3 = this;
            int r0 = r3.mEatenAccessibilityChangeFlags
            r1 = 0
            r3.mEatenAccessibilityChangeFlags = r1
            if (r0 == 0) goto L1c
            boolean r1 = r3.isAccessibilityEnabled()
            if (r1 == 0) goto L1c
            android.view.accessibility.AccessibilityEvent r1 = android.view.accessibility.AccessibilityEvent.obtain()
            r2 = 2048(0x800, float:2.87E-42)
            r1.setEventType(r2)
            androidx.core.view.accessibility.AccessibilityEventCompat.setContentChangeTypes(r1, r0)
            r3.sendAccessibilityEventUnchecked(r1)
        L1c:
            return
    }

    private void dispatchLayoutStep1() {
            r8 = this;
            androidx.recyclerview.widget.RecyclerView$State r0 = r8.mState
            r1 = 1
            r0.assertLayoutStep(r1)
            androidx.recyclerview.widget.RecyclerView$State r0 = r8.mState
            r8.fillRemainingScrollValues(r0)
            androidx.recyclerview.widget.RecyclerView$State r0 = r8.mState
            r2 = 0
            r0.mIsMeasuring = r2
            r8.startInterceptRequestLayout()
            androidx.recyclerview.widget.ViewInfoStore r0 = r8.mViewInfoStore
            r0.clear()
            r8.onEnterLayoutOrScroll()
            r8.processAdapterUpdatesAndSetAnimationFlags()
            r8.saveFocusInfo()
            androidx.recyclerview.widget.RecyclerView$State r0 = r8.mState
            boolean r3 = r0.mRunSimpleAnimations
            if (r3 == 0) goto L2c
            boolean r3 = r8.mItemsChanged
            if (r3 == 0) goto L2c
            goto L2d
        L2c:
            r1 = 0
        L2d:
            r0.mTrackOldChangeHolders = r1
            r8.mItemsChanged = r2
            r8.mItemsAddedOrRemoved = r2
            boolean r1 = r0.mRunPredictiveAnimations
            r0.mInPreLayout = r1
            androidx.recyclerview.widget.RecyclerView$Adapter r1 = r8.mAdapter
            int r1 = r1.getItemCount()
            r0.mItemCount = r1
            int[] r0 = r8.mMinMaxLayoutPositions
            r8.findMinMaxChildLayoutPositions(r0)
            androidx.recyclerview.widget.RecyclerView$State r0 = r8.mState
            boolean r0 = r0.mRunSimpleAnimations
            if (r0 == 0) goto Lb1
            androidx.recyclerview.widget.ChildHelper r0 = r8.mChildHelper
            int r0 = r0.getChildCount()
            r1 = 0
        L51:
            if (r1 >= r0) goto Lb1
            androidx.recyclerview.widget.ChildHelper r3 = r8.mChildHelper
            android.view.View r3 = r3.getChildAt(r1)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = getChildViewHolderInt(r3)
            boolean r4 = r3.shouldIgnore()
            if (r4 != 0) goto Lae
            boolean r4 = r3.isInvalid()
            if (r4 == 0) goto L72
            androidx.recyclerview.widget.RecyclerView$Adapter r4 = r8.mAdapter
            boolean r4 = r4.hasStableIds()
            if (r4 != 0) goto L72
            goto Lae
        L72:
            androidx.recyclerview.widget.RecyclerView$ItemAnimator r4 = r8.mItemAnimator
            androidx.recyclerview.widget.RecyclerView$State r5 = r8.mState
            int r6 = androidx.recyclerview.widget.RecyclerView.ItemAnimator.buildAdapterChangeFlagsForAnimations(r3)
            java.util.List r7 = r3.getUnmodifiedPayloads()
            androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemHolderInfo r4 = r4.recordPreLayoutInformation(r5, r3, r6, r7)
            androidx.recyclerview.widget.ViewInfoStore r5 = r8.mViewInfoStore
            r5.addToPreLayout(r3, r4)
            androidx.recyclerview.widget.RecyclerView$State r4 = r8.mState
            boolean r4 = r4.mTrackOldChangeHolders
            if (r4 == 0) goto Lae
            boolean r4 = r3.isUpdated()
            if (r4 == 0) goto Lae
            boolean r4 = r3.isRemoved()
            if (r4 != 0) goto Lae
            boolean r4 = r3.shouldIgnore()
            if (r4 != 0) goto Lae
            boolean r4 = r3.isInvalid()
            if (r4 != 0) goto Lae
            long r4 = r8.getChangedHolderKey(r3)
            androidx.recyclerview.widget.ViewInfoStore r6 = r8.mViewInfoStore
            r6.addToOldChangeHolders(r4, r3)
        Lae:
            int r1 = r1 + 1
            goto L51
        Lb1:
            androidx.recyclerview.widget.RecyclerView$State r0 = r8.mState
            boolean r0 = r0.mRunPredictiveAnimations
            if (r0 == 0) goto L119
            r8.saveOldPositions()
            androidx.recyclerview.widget.RecyclerView$State r0 = r8.mState
            boolean r1 = r0.mStructureChanged
            r0.mStructureChanged = r2
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r8.mLayout
            androidx.recyclerview.widget.RecyclerView$Recycler r4 = r8.mRecycler
            r3.onLayoutChildren(r4, r0)
            androidx.recyclerview.widget.RecyclerView$State r0 = r8.mState
            r0.mStructureChanged = r1
            r0 = 0
        Lcc:
            androidx.recyclerview.widget.ChildHelper r1 = r8.mChildHelper
            int r1 = r1.getChildCount()
            if (r0 >= r1) goto L115
            androidx.recyclerview.widget.ChildHelper r1 = r8.mChildHelper
            android.view.View r1 = r1.getChildAt(r0)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = getChildViewHolderInt(r1)
            boolean r3 = r1.shouldIgnore()
            if (r3 == 0) goto Le5
            goto L112
        Le5:
            androidx.recyclerview.widget.ViewInfoStore r3 = r8.mViewInfoStore
            boolean r3 = r3.isInPreLayout(r1)
            if (r3 != 0) goto L112
            int r3 = androidx.recyclerview.widget.RecyclerView.ItemAnimator.buildAdapterChangeFlagsForAnimations(r1)
            r4 = 8192(0x2000, float:1.148E-41)
            boolean r4 = r1.hasAnyOfTheFlags(r4)
            if (r4 != 0) goto Lfb
            r3 = r3 | 4096(0x1000, float:5.74E-42)
        Lfb:
            androidx.recyclerview.widget.RecyclerView$ItemAnimator r5 = r8.mItemAnimator
            androidx.recyclerview.widget.RecyclerView$State r6 = r8.mState
            java.util.List r7 = r1.getUnmodifiedPayloads()
            androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemHolderInfo r3 = r5.recordPreLayoutInformation(r6, r1, r3, r7)
            if (r4 == 0) goto L10d
            r8.recordAnimationInfoIfBouncedHiddenView(r1, r3)
            goto L112
        L10d:
            androidx.recyclerview.widget.ViewInfoStore r4 = r8.mViewInfoStore
            r4.addToAppearedInPreLayoutHolders(r1, r3)
        L112:
            int r0 = r0 + 1
            goto Lcc
        L115:
            r8.clearOldPositions()
            goto L11c
        L119:
            r8.clearOldPositions()
        L11c:
            r8.onExitLayoutOrScroll()
            r8.stopInterceptRequestLayout(r2)
            androidx.recyclerview.widget.RecyclerView$State r0 = r8.mState
            r1 = 2
            r0.mLayoutStep = r1
            return
    }

    private void dispatchLayoutStep2() {
            r4 = this;
            r4.startInterceptRequestLayout()
            r4.onEnterLayoutOrScroll()
            androidx.recyclerview.widget.RecyclerView$State r0 = r4.mState
            r1 = 6
            r0.assertLayoutStep(r1)
            androidx.recyclerview.widget.AdapterHelper r0 = r4.mAdapterHelper
            r0.consumeUpdatesInOnePass()
            androidx.recyclerview.widget.RecyclerView$State r0 = r4.mState
            androidx.recyclerview.widget.RecyclerView$Adapter r1 = r4.mAdapter
            int r1 = r1.getItemCount()
            r0.mItemCount = r1
            androidx.recyclerview.widget.RecyclerView$State r0 = r4.mState
            r1 = 0
            r0.mDeletedInvisibleItemCountSincePreviousLayout = r1
            androidx.recyclerview.widget.RecyclerView$SavedState r0 = r4.mPendingSavedState
            if (r0 == 0) goto L3a
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r4.mAdapter
            boolean r0 = r0.canRestoreState()
            if (r0 == 0) goto L3a
            androidx.recyclerview.widget.RecyclerView$SavedState r0 = r4.mPendingSavedState
            android.os.Parcelable r0 = r0.mLayoutState
            if (r0 == 0) goto L37
            androidx.recyclerview.widget.RecyclerView$LayoutManager r2 = r4.mLayout
            r2.onRestoreInstanceState(r0)
        L37:
            r0 = 0
            r4.mPendingSavedState = r0
        L3a:
            androidx.recyclerview.widget.RecyclerView$State r0 = r4.mState
            r0.mInPreLayout = r1
            androidx.recyclerview.widget.RecyclerView$LayoutManager r2 = r4.mLayout
            androidx.recyclerview.widget.RecyclerView$Recycler r3 = r4.mRecycler
            r2.onLayoutChildren(r3, r0)
            androidx.recyclerview.widget.RecyclerView$State r0 = r4.mState
            r0.mStructureChanged = r1
            boolean r2 = r0.mRunSimpleAnimations
            if (r2 == 0) goto L53
            androidx.recyclerview.widget.RecyclerView$ItemAnimator r2 = r4.mItemAnimator
            if (r2 == 0) goto L53
            r2 = 1
            goto L54
        L53:
            r2 = 0
        L54:
            r0.mRunSimpleAnimations = r2
            r2 = 4
            r0.mLayoutStep = r2
            r4.onExitLayoutOrScroll()
            r4.stopInterceptRequestLayout(r1)
            return
    }

    private void dispatchLayoutStep3() {
            r11 = this;
            androidx.recyclerview.widget.RecyclerView$State r0 = r11.mState
            r1 = 4
            r0.assertLayoutStep(r1)
            r11.startInterceptRequestLayout()
            r11.onEnterLayoutOrScroll()
            androidx.recyclerview.widget.RecyclerView$State r0 = r11.mState
            r1 = 1
            r0.mLayoutStep = r1
            boolean r0 = r0.mRunSimpleAnimations
            if (r0 == 0) goto L92
            androidx.recyclerview.widget.ChildHelper r0 = r11.mChildHelper
            int r0 = r0.getChildCount()
            int r0 = r0 - r1
        L1c:
            if (r0 < 0) goto L89
            androidx.recyclerview.widget.ChildHelper r2 = r11.mChildHelper
            android.view.View r2 = r2.getChildAt(r0)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r5 = getChildViewHolderInt(r2)
            boolean r2 = r5.shouldIgnore()
            if (r2 == 0) goto L30
        L2e:
            r3 = r11
            goto L86
        L30:
            long r2 = r11.getChangedHolderKey(r5)
            androidx.recyclerview.widget.RecyclerView$ItemAnimator r4 = r11.mItemAnimator
            androidx.recyclerview.widget.RecyclerView$State r6 = r11.mState
            androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemHolderInfo r4 = r4.recordPostLayoutInformation(r6, r5)
            androidx.recyclerview.widget.ViewInfoStore r6 = r11.mViewInfoStore
            androidx.recyclerview.widget.RecyclerView$ViewHolder r6 = r6.getFromOldChangeHolders(r2)
            if (r6 == 0) goto L80
            boolean r7 = r6.shouldIgnore()
            if (r7 != 0) goto L80
            androidx.recyclerview.widget.ViewInfoStore r7 = r11.mViewInfoStore
            boolean r8 = r7.isDisappearing(r6)
            androidx.recyclerview.widget.ViewInfoStore r7 = r11.mViewInfoStore
            boolean r9 = r7.isDisappearing(r5)
            if (r8 == 0) goto L60
            if (r6 != r5) goto L60
            androidx.recyclerview.widget.ViewInfoStore r2 = r11.mViewInfoStore
            r2.addToPostLayout(r5, r4)
            goto L2e
        L60:
            androidx.recyclerview.widget.ViewInfoStore r7 = r11.mViewInfoStore
            androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemHolderInfo r7 = r7.popFromPreLayout(r6)
            androidx.recyclerview.widget.ViewInfoStore r10 = r11.mViewInfoStore
            r10.addToPostLayout(r5, r4)
            androidx.recyclerview.widget.ViewInfoStore r4 = r11.mViewInfoStore
            androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemHolderInfo r4 = r4.popFromPostLayout(r5)
            if (r7 != 0) goto L77
            r11.handleMissingPreInfoForChangeError(r2, r5, r6)
            goto L2e
        L77:
            r3 = r7
            r7 = r4
            r4 = r6
            r6 = r3
            r3 = r11
            r3.animateChange(r4, r5, r6, r7, r8, r9)
            goto L86
        L80:
            r3 = r11
            androidx.recyclerview.widget.ViewInfoStore r2 = r3.mViewInfoStore
            r2.addToPostLayout(r5, r4)
        L86:
            int r0 = r0 + (-1)
            goto L1c
        L89:
            r3 = r11
            androidx.recyclerview.widget.ViewInfoStore r0 = r3.mViewInfoStore
            androidx.recyclerview.widget.ViewInfoStore$ProcessCallback r2 = r3.mViewInfoProcessCallback
            r0.process(r2)
            goto L93
        L92:
            r3 = r11
        L93:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r3.mLayout
            androidx.recyclerview.widget.RecyclerView$Recycler r2 = r3.mRecycler
            r0.removeAndRecycleScrapInt(r2)
            androidx.recyclerview.widget.RecyclerView$State r0 = r3.mState
            int r2 = r0.mItemCount
            r0.mPreviousLayoutItemCount = r2
            r2 = 0
            r3.mDataSetHasChangedAfterLayout = r2
            r3.mDispatchItemsChangedEvent = r2
            r0.mRunSimpleAnimations = r2
            r0.mRunPredictiveAnimations = r2
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r3.mLayout
            r0.mRequestedSimpleAnimations = r2
            androidx.recyclerview.widget.RecyclerView$Recycler r0 = r3.mRecycler
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r0.mChangedScrap
            if (r0 == 0) goto Lb6
            r0.clear()
        Lb6:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r3.mLayout
            boolean r4 = r0.mPrefetchMaxObservedInInitialPrefetch
            if (r4 == 0) goto Lc5
            r0.mPrefetchMaxCountObserved = r2
            r0.mPrefetchMaxObservedInInitialPrefetch = r2
            androidx.recyclerview.widget.RecyclerView$Recycler r0 = r3.mRecycler
            r0.updateViewCacheSize()
        Lc5:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r3.mLayout
            androidx.recyclerview.widget.RecyclerView$State r4 = r3.mState
            r0.onLayoutCompleted(r4)
            r11.onExitLayoutOrScroll()
            r11.stopInterceptRequestLayout(r2)
            androidx.recyclerview.widget.ViewInfoStore r0 = r3.mViewInfoStore
            r0.clear()
            int[] r0 = r3.mMinMaxLayoutPositions
            r4 = r0[r2]
            r0 = r0[r1]
            boolean r0 = r11.didChildRangeChange(r4, r0)
            if (r0 == 0) goto Le6
            r11.dispatchOnScrolled(r2, r2)
        Le6:
            r11.recoverFocusFromState()
            r11.resetFocusInfo()
            return
    }

    private boolean dispatchToOnItemTouchListeners(android.view.MotionEvent r3) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$OnItemTouchListener r0 = r2.mInterceptingOnItemTouchListener
            if (r0 != 0) goto L11
            int r0 = r3.getAction()
            if (r0 != 0) goto Lc
            r3 = 0
            return r3
        Lc:
            boolean r3 = r2.findInterceptingOnItemTouchListener(r3)
            return r3
        L11:
            r0.onTouchEvent(r2, r3)
            int r3 = r3.getAction()
            r0 = 3
            r1 = 1
            if (r3 == r0) goto L1e
            if (r3 != r1) goto L21
        L1e:
            r3 = 0
            r2.mInterceptingOnItemTouchListener = r3
        L21:
            return r1
    }

    private boolean findInterceptingOnItemTouchListener(android.view.MotionEvent r7) {
            r6 = this;
            int r0 = r7.getAction()
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$OnItemTouchListener> r1 = r6.mOnItemTouchListeners
            int r1 = r1.size()
            r2 = 0
            r3 = 0
        Lc:
            if (r3 >= r1) goto L26
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$OnItemTouchListener> r4 = r6.mOnItemTouchListeners
            java.lang.Object r4 = r4.get(r3)
            androidx.recyclerview.widget.RecyclerView$OnItemTouchListener r4 = (androidx.recyclerview.widget.RecyclerView.OnItemTouchListener) r4
            boolean r5 = r4.onInterceptTouchEvent(r6, r7)
            if (r5 == 0) goto L23
            r5 = 3
            if (r0 == r5) goto L23
            r6.mInterceptingOnItemTouchListener = r4
            r7 = 1
            return r7
        L23:
            int r3 = r3 + 1
            goto Lc
        L26:
            return r2
    }

    private void findMinMaxChildLayoutPositions(int[] r9) {
            r8 = this;
            androidx.recyclerview.widget.ChildHelper r0 = r8.mChildHelper
            int r0 = r0.getChildCount()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L10
            r0 = -1
            r9[r2] = r0
            r9[r1] = r0
            return
        L10:
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 0
        L16:
            if (r5 >= r0) goto L36
            androidx.recyclerview.widget.ChildHelper r6 = r8.mChildHelper
            android.view.View r6 = r6.getChildAt(r5)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r6 = getChildViewHolderInt(r6)
            boolean r7 = r6.shouldIgnore()
            if (r7 == 0) goto L29
            goto L33
        L29:
            int r6 = r6.getLayoutPosition()
            if (r6 >= r3) goto L30
            r3 = r6
        L30:
            if (r6 <= r4) goto L33
            r4 = r6
        L33:
            int r5 = r5 + 1
            goto L16
        L36:
            r9[r2] = r3
            r9[r1] = r4
            return
    }

    @androidx.annotation.Nullable
    static androidx.recyclerview.widget.RecyclerView findNestedRecyclerView(@androidx.annotation.NonNull android.view.View r4) {
            boolean r0 = r4 instanceof android.view.ViewGroup
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r4 instanceof androidx.recyclerview.widget.RecyclerView
            if (r0 == 0) goto Ld
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            return r4
        Ld:
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r0 = r4.getChildCount()
            r2 = 0
        L14:
            if (r2 >= r0) goto L24
            android.view.View r3 = r4.getChildAt(r2)
            androidx.recyclerview.widget.RecyclerView r3 = findNestedRecyclerView(r3)
            if (r3 == 0) goto L21
            return r3
        L21:
            int r2 = r2 + 1
            goto L14
        L24:
            return r1
    }

    @androidx.annotation.Nullable
    private android.view.View findNextViewToFocus() {
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$State r0 = r5.mState
            int r1 = r0.mFocusedItemPosition
            r2 = -1
            if (r1 == r2) goto L8
            goto L9
        L8:
            r1 = 0
        L9:
            int r0 = r0.getItemCount()
            r2 = r1
        Le:
            if (r2 >= r0) goto L25
            androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = r5.findViewHolderForAdapterPosition(r2)
            if (r3 != 0) goto L17
            goto L25
        L17:
            android.view.View r4 = r3.itemView
            boolean r4 = r4.hasFocusable()
            if (r4 == 0) goto L22
            android.view.View r0 = r3.itemView
            return r0
        L22:
            int r2 = r2 + 1
            goto Le
        L25:
            int r0 = java.lang.Math.min(r0, r1)
            int r0 = r0 + (-1)
        L2b:
            r1 = 0
            if (r0 < 0) goto L43
            androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = r5.findViewHolderForAdapterPosition(r0)
            if (r2 != 0) goto L35
            return r1
        L35:
            android.view.View r1 = r2.itemView
            boolean r1 = r1.hasFocusable()
            if (r1 == 0) goto L40
            android.view.View r0 = r2.itemView
            return r0
        L40:
            int r0 = r0 + (-1)
            goto L2b
        L43:
            return r1
    }

    static androidx.recyclerview.widget.RecyclerView.ViewHolder getChildViewHolderInt(android.view.View r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r0 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r0
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r0.mViewHolder
            return r0
    }

    static void getDecoratedBoundsWithMarginsInt(android.view.View r6, android.graphics.Rect r7) {
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r0 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r0
            android.graphics.Rect r1 = r0.mDecorInsets
            int r2 = r6.getLeft()
            int r3 = r1.left
            int r2 = r2 - r3
            int r3 = r0.leftMargin
            int r2 = r2 - r3
            int r3 = r6.getTop()
            int r4 = r1.top
            int r3 = r3 - r4
            int r4 = r0.topMargin
            int r3 = r3 - r4
            int r4 = r6.getRight()
            int r5 = r1.right
            int r4 = r4 + r5
            int r5 = r0.rightMargin
            int r4 = r4 + r5
            int r6 = r6.getBottom()
            int r1 = r1.bottom
            int r6 = r6 + r1
            int r0 = r0.bottomMargin
            int r6 = r6 + r0
            r7.set(r2, r3, r4, r6)
            return
    }

    private int getDeepestFocusedViewWithId(android.view.View r4) {
            r3 = this;
            int r0 = r4.getId()
        L4:
            boolean r1 = r4.isFocused()
            if (r1 != 0) goto L26
            boolean r1 = r4 instanceof android.view.ViewGroup
            if (r1 == 0) goto L26
            boolean r1 = r4.hasFocus()
            if (r1 == 0) goto L26
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            android.view.View r4 = r4.getFocusedChild()
            int r1 = r4.getId()
            r2 = -1
            if (r1 == r2) goto L4
            int r0 = r4.getId()
            goto L4
        L26:
            return r0
    }

    private java.lang.String getFullClassName(android.content.Context r3, java.lang.String r4) {
            r2 = this;
            r0 = 0
            char r0 = r4.charAt(r0)
            r1 = 46
            if (r0 != r1) goto L1d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = r3.getPackageName()
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            return r3
        L1d:
            java.lang.String r3 = "."
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L26
            return r4
        L26:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.Class<androidx.recyclerview.widget.RecyclerView> r0 = androidx.recyclerview.widget.RecyclerView.class
            java.lang.Package r0 = r0.getPackage()
            java.lang.String r0 = r0.getName()
            r3.append(r0)
            r3.append(r1)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            return r3
    }

    private androidx.core.view.NestedScrollingChildHelper getScrollingChildHelper() {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.mScrollingChildHelper
            if (r0 != 0) goto Lb
            androidx.core.view.NestedScrollingChildHelper r0 = new androidx.core.view.NestedScrollingChildHelper
            r0.<init>(r1)
            r1.mScrollingChildHelper = r0
        Lb:
            androidx.core.view.NestedScrollingChildHelper r0 = r1.mScrollingChildHelper
            return r0
    }

    private float getSplineFlingDistance(int r9) {
            r8 = this;
            int r9 = java.lang.Math.abs(r9)
            float r9 = (float) r9
            r0 = 1051931443(0x3eb33333, float:0.35)
            float r9 = r9 * r0
            float r0 = r8.mPhysicalCoef
            r1 = 1014350479(0x3c75c28f, float:0.015)
            float r0 = r0 * r1
            float r9 = r9 / r0
            double r2 = (double) r9
            double r2 = java.lang.Math.log(r2)
            float r9 = androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE
            double r4 = (double) r9
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = r4 - r6
            float r0 = r8.mPhysicalCoef
            float r0 = r0 * r1
            double r0 = (double) r0
            double r6 = (double) r9
            double r6 = r6 / r4
            double r6 = r6 * r2
            double r2 = java.lang.Math.exp(r6)
            double r0 = r0 * r2
            float r9 = (float) r0
            return r9
    }

    private void handleMissingPreInfoForChangeError(long r7, androidx.recyclerview.widget.RecyclerView.ViewHolder r9, androidx.recyclerview.widget.RecyclerView.ViewHolder r10) {
            r6 = this;
            androidx.recyclerview.widget.ChildHelper r0 = r6.mChildHelper
            int r0 = r0.getChildCount()
            r1 = 0
        L7:
            if (r1 >= r0) goto L75
            androidx.recyclerview.widget.ChildHelper r2 = r6.mChildHelper
            android.view.View r2 = r2.getChildAt(r1)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = getChildViewHolderInt(r2)
            if (r2 != r9) goto L16
            goto L72
        L16:
            long r3 = r6.getChangedHolderKey(r2)
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 != 0) goto L72
            androidx.recyclerview.widget.RecyclerView$Adapter r7 = r6.mAdapter
            java.lang.String r8 = " \n View Holder 2:"
            if (r7 == 0) goto L4e
            boolean r7 = r7.hasStableIds()
            if (r7 == 0) goto L4e
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:"
            r10.append(r0)
            r10.append(r2)
            r10.append(r8)
            r10.append(r9)
            java.lang.String r8 = r6.exceptionLabel()
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r7.<init>(r8)
            throw r7
        L4e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:"
            r10.append(r0)
            r10.append(r2)
            r10.append(r8)
            r10.append(r9)
            java.lang.String r8 = r6.exceptionLabel()
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r7.<init>(r8)
            throw r7
        L72:
            int r1 = r1 + 1
            goto L7
        L75:
            java.util.Objects.toString(r10)
            java.util.Objects.toString(r9)
            r6.exceptionLabel()
            return
    }

    private boolean hasUpdatedView() {
            r5 = this;
            androidx.recyclerview.widget.ChildHelper r0 = r5.mChildHelper
            int r0 = r0.getChildCount()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L28
            androidx.recyclerview.widget.ChildHelper r3 = r5.mChildHelper
            android.view.View r3 = r3.getChildAt(r2)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = getChildViewHolderInt(r3)
            if (r3 == 0) goto L25
            boolean r4 = r3.shouldIgnore()
            if (r4 == 0) goto L1d
            goto L25
        L1d:
            boolean r3 = r3.isUpdated()
            if (r3 == 0) goto L25
            r0 = 1
            return r0
        L25:
            int r2 = r2 + 1
            goto L8
        L28:
            return r1
    }

    @android.annotation.SuppressLint({"InlinedApi"})
    private void initAutofill() {
            r1 = this;
            int r0 = androidx.core.view.ViewCompat.getImportantForAutofill(r1)
            if (r0 != 0) goto Lb
            r0 = 8
            androidx.core.view.ViewCompat.setImportantForAutofill(r1, r0)
        Lb:
            return
    }

    private void initChildrenHelper() {
            r2 = this;
            androidx.recyclerview.widget.ChildHelper r0 = new androidx.recyclerview.widget.ChildHelper
            androidx.recyclerview.widget.RecyclerView$5 r1 = new androidx.recyclerview.widget.RecyclerView$5
            r1.<init>(r2)
            r0.<init>(r1)
            r2.mChildHelper = r0
            return
    }

    private boolean isPreferredNextFocus(android.view.View r10, android.view.View r11, int r12) {
            r9 = this;
            r0 = 0
            if (r11 == 0) goto Le5
            if (r11 == r9) goto Le5
            if (r11 != r10) goto L9
            goto Le5
        L9:
            android.view.View r1 = r9.findContainingItemView(r11)
            if (r1 != 0) goto L10
            return r0
        L10:
            r1 = 1
            if (r10 != 0) goto L14
            return r1
        L14:
            android.view.View r2 = r9.findContainingItemView(r10)
            if (r2 != 0) goto L1b
            return r1
        L1b:
            android.graphics.Rect r2 = r9.mTempRect
            int r3 = r10.getWidth()
            int r4 = r10.getHeight()
            r2.set(r0, r0, r3, r4)
            android.graphics.Rect r2 = r9.mTempRect2
            int r3 = r11.getWidth()
            int r4 = r11.getHeight()
            r2.set(r0, r0, r3, r4)
            android.graphics.Rect r2 = r9.mTempRect
            r9.offsetDescendantRectToMyCoords(r10, r2)
            android.graphics.Rect r10 = r9.mTempRect2
            r9.offsetDescendantRectToMyCoords(r11, r10)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r10 = r9.mLayout
            int r10 = r10.getLayoutDirection()
            r11 = -1
            if (r10 != r1) goto L4a
            r10 = -1
            goto L4b
        L4a:
            r10 = 1
        L4b:
            android.graphics.Rect r2 = r9.mTempRect
            int r3 = r2.left
            android.graphics.Rect r4 = r9.mTempRect2
            int r5 = r4.left
            if (r3 < r5) goto L59
            int r6 = r2.right
            if (r6 > r5) goto L61
        L59:
            int r6 = r2.right
            int r7 = r4.right
            if (r6 >= r7) goto L61
            r3 = 1
            goto L6e
        L61:
            int r6 = r2.right
            int r7 = r4.right
            if (r6 > r7) goto L69
            if (r3 < r7) goto L6d
        L69:
            if (r3 <= r5) goto L6d
            r3 = -1
            goto L6e
        L6d:
            r3 = 0
        L6e:
            int r5 = r2.top
            int r6 = r4.top
            if (r5 < r6) goto L78
            int r7 = r2.bottom
            if (r7 > r6) goto L80
        L78:
            int r7 = r2.bottom
            int r8 = r4.bottom
            if (r7 >= r8) goto L80
            r11 = 1
            goto L8c
        L80:
            int r2 = r2.bottom
            int r4 = r4.bottom
            if (r2 > r4) goto L88
            if (r5 < r4) goto L8b
        L88:
            if (r5 <= r6) goto L8b
            goto L8c
        L8b:
            r11 = 0
        L8c:
            if (r12 == r1) goto Lda
            r2 = 2
            if (r12 == r2) goto Lcf
            r10 = 17
            if (r12 == r10) goto Lcb
            r10 = 33
            if (r12 == r10) goto Lc7
            r10 = 66
            if (r12 == r10) goto Lc3
            r10 = 130(0x82, float:1.82E-43)
            if (r12 != r10) goto La5
            if (r11 <= 0) goto La4
            return r1
        La4:
            return r0
        La5:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "Invalid direction: "
            r11.append(r0)
            r11.append(r12)
            java.lang.String r12 = r9.exceptionLabel()
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        Lc3:
            if (r3 <= 0) goto Lc6
            return r1
        Lc6:
            return r0
        Lc7:
            if (r11 >= 0) goto Lca
            return r1
        Lca:
            return r0
        Lcb:
            if (r3 >= 0) goto Lce
            return r1
        Lce:
            return r0
        Lcf:
            if (r11 > 0) goto Ld9
            if (r11 != 0) goto Ld8
            int r3 = r3 * r10
            if (r3 <= 0) goto Ld8
            goto Ld9
        Ld8:
            return r0
        Ld9:
            return r1
        Lda:
            if (r11 < 0) goto Le4
            if (r11 != 0) goto Le3
            int r3 = r3 * r10
            if (r3 >= 0) goto Le3
            goto Le4
        Le3:
            return r0
        Le4:
            return r1
        Le5:
            return r0
    }

    private void nestedScrollByInternal(int r12, int r13, @androidx.annotation.Nullable android.view.MotionEvent r14, int r15) {
            r11 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r11.mLayout
            if (r0 != 0) goto L5
            return
        L5:
            boolean r1 = r11.mLayoutSuppressed
            if (r1 == 0) goto La
            return
        La:
            int[] r1 = r11.mReusableIntPair
            r2 = 0
            r1[r2] = r2
            r3 = 1
            r1[r3] = r2
            boolean r0 = r0.canScrollHorizontally()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r11.mLayout
            boolean r1 = r1.canScrollVertically()
            if (r1 == 0) goto L21
            r4 = r0 | 2
            goto L22
        L21:
            r4 = r0
        L22:
            r5 = 1073741824(0x40000000, float:2.0)
            if (r14 != 0) goto L2d
            int r6 = r11.getHeight()
            float r6 = (float) r6
            float r6 = r6 / r5
            goto L31
        L2d:
            float r6 = r14.getY()
        L31:
            if (r14 != 0) goto L3a
            int r7 = r11.getWidth()
            float r7 = (float) r7
            float r7 = r7 / r5
            goto L3e
        L3a:
            float r7 = r14.getX()
        L3e:
            int r5 = r11.releaseHorizontalGlow(r12, r6)
            int r12 = r12 - r5
            int r5 = r11.releaseVerticalGlow(r13, r7)
            int r13 = r13 - r5
            r11.startNestedScroll(r4, r15)
            if (r0 == 0) goto L4f
            r6 = r12
            goto L50
        L4f:
            r6 = 0
        L50:
            if (r1 == 0) goto L54
            r7 = r13
            goto L55
        L54:
            r7 = 0
        L55:
            int[] r8 = r11.mReusableIntPair
            int[] r9 = r11.mScrollOffset
            r5 = r11
            r10 = r15
            boolean r15 = r5.dispatchNestedPreScroll(r6, r7, r8, r9, r10)
            if (r15 == 0) goto L69
            int[] r15 = r5.mReusableIntPair
            r4 = r15[r2]
            int r12 = r12 - r4
            r15 = r15[r3]
            int r13 = r13 - r15
        L69:
            if (r0 == 0) goto L6d
            r15 = r12
            goto L6e
        L6d:
            r15 = 0
        L6e:
            if (r1 == 0) goto L71
            r2 = r13
        L71:
            r11.scrollByInternal(r15, r2, r14, r10)
            androidx.recyclerview.widget.GapWorker r14 = r5.mGapWorker
            if (r14 == 0) goto L7f
            if (r12 != 0) goto L7c
            if (r13 == 0) goto L7f
        L7c:
            r14.postFromTraversal(r11, r12, r13)
        L7f:
            r11.stopNestedScroll(r10)
            return
    }

    private void onPointerUp(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getActionIndex()
            int r1 = r4.getPointerId(r0)
            int r2 = r3.mScrollPointerId
            if (r1 != r2) goto L2d
            if (r0 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            int r1 = r4.getPointerId(r0)
            r3.mScrollPointerId = r1
            float r1 = r4.getX(r0)
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r1 = (int) r1
            r3.mLastTouchX = r1
            r3.mInitialTouchX = r1
            float r4 = r4.getY(r0)
            float r4 = r4 + r2
            int r4 = (int) r4
            r3.mLastTouchY = r4
            r3.mInitialTouchY = r4
        L2d:
            return
    }

    private boolean predictiveItemAnimationsEnabled() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$ItemAnimator r0 = r1.mItemAnimator
            if (r0 == 0) goto Le
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r1.mLayout
            boolean r0 = r0.supportsPredictiveItemAnimations()
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
            r6 = this;
            boolean r0 = r6.mDataSetHasChangedAfterLayout
            if (r0 == 0) goto L12
            androidx.recyclerview.widget.AdapterHelper r0 = r6.mAdapterHelper
            r0.reset()
            boolean r0 = r6.mDispatchItemsChangedEvent
            if (r0 == 0) goto L12
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r6.mLayout
            r0.onItemsChanged(r6)
        L12:
            boolean r0 = r6.predictiveItemAnimationsEnabled()
            if (r0 == 0) goto L1e
            androidx.recyclerview.widget.AdapterHelper r0 = r6.mAdapterHelper
            r0.preProcess()
            goto L23
        L1e:
            androidx.recyclerview.widget.AdapterHelper r0 = r6.mAdapterHelper
            r0.consumeUpdatesInOnePass()
        L23:
            boolean r0 = r6.mItemsAddedOrRemoved
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L30
            boolean r0 = r6.mItemsChanged
            if (r0 == 0) goto L2e
            goto L30
        L2e:
            r0 = 0
            goto L31
        L30:
            r0 = 1
        L31:
            androidx.recyclerview.widget.RecyclerView$State r3 = r6.mState
            boolean r4 = r6.mFirstLayoutComplete
            if (r4 == 0) goto L53
            androidx.recyclerview.widget.RecyclerView$ItemAnimator r4 = r6.mItemAnimator
            if (r4 == 0) goto L53
            boolean r4 = r6.mDataSetHasChangedAfterLayout
            if (r4 != 0) goto L47
            if (r0 != 0) goto L47
            androidx.recyclerview.widget.RecyclerView$LayoutManager r5 = r6.mLayout
            boolean r5 = r5.mRequestedSimpleAnimations
            if (r5 == 0) goto L53
        L47:
            if (r4 == 0) goto L51
            androidx.recyclerview.widget.RecyclerView$Adapter r4 = r6.mAdapter
            boolean r4 = r4.hasStableIds()
            if (r4 == 0) goto L53
        L51:
            r4 = 1
            goto L54
        L53:
            r4 = 0
        L54:
            r3.mRunSimpleAnimations = r4
            androidx.recyclerview.widget.RecyclerView$State r3 = r6.mState
            boolean r4 = r3.mRunSimpleAnimations
            if (r4 == 0) goto L69
            if (r0 == 0) goto L69
            boolean r0 = r6.mDataSetHasChangedAfterLayout
            if (r0 != 0) goto L69
            boolean r0 = r6.predictiveItemAnimationsEnabled()
            if (r0 == 0) goto L69
            goto L6a
        L69:
            r1 = 0
        L6a:
            r3.mRunPredictiveAnimations = r1
            return
    }

    private void pullGlows(float r7, float r8, float r9, float r10) {
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L21
            r6.ensureLeftGlow()
            android.widget.EdgeEffect r3 = r6.mLeftGlow
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
            androidx.core.widget.EdgeEffectCompat.onPullDistance(r3, r4, r9)
        L1f:
            r9 = 1
            goto L3c
        L21:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L3b
            r6.ensureRightGlow()
            android.widget.EdgeEffect r3 = r6.mRightGlow
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            androidx.core.widget.EdgeEffectCompat.onPullDistance(r3, r4, r9)
            goto L1f
        L3b:
            r9 = 0
        L3c:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L56
            r6.ensureTopGlow()
            android.widget.EdgeEffect r9 = r6.mTopGlow
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            androidx.core.widget.EdgeEffectCompat.onPullDistance(r9, r0, r7)
            goto L72
        L56:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L71
            r6.ensureBottomGlow()
            android.widget.EdgeEffect r9 = r6.mBottomGlow
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            androidx.core.widget.EdgeEffectCompat.onPullDistance(r9, r3, r0)
            goto L72
        L71:
            r1 = r9
        L72:
            if (r1 != 0) goto L7e
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L7e
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L7d
            goto L7e
        L7d:
            return
        L7e:
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r6)
            return
    }

    private void recoverFocusFromState() {
            r7 = this;
            boolean r0 = r7.mPreserveFocusAfterLayout
            if (r0 == 0) goto Lb1
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r7.mAdapter
            if (r0 == 0) goto Lb1
            boolean r0 = r7.hasFocus()
            if (r0 == 0) goto Lb1
            int r0 = r7.getDescendantFocusability()
            r1 = 393216(0x60000, float:5.51013E-40)
            if (r0 == r1) goto Lb1
            int r0 = r7.getDescendantFocusability()
            r1 = 131072(0x20000, float:1.83671E-40)
            if (r0 != r1) goto L26
            boolean r0 = r7.isFocused()
            if (r0 == 0) goto L26
            goto Lb1
        L26:
            boolean r0 = r7.isFocused()
            if (r0 != 0) goto L55
            android.view.View r0 = r7.getFocusedChild()
            boolean r1 = androidx.recyclerview.widget.RecyclerView.IGNORE_DETACHED_FOCUSED_CHILD
            if (r1 == 0) goto L4c
            android.view.ViewParent r1 = r0.getParent()
            if (r1 == 0) goto L40
            boolean r1 = r0.hasFocus()
            if (r1 != 0) goto L4c
        L40:
            androidx.recyclerview.widget.ChildHelper r0 = r7.mChildHelper
            int r0 = r0.getChildCount()
            if (r0 != 0) goto L55
            r7.requestFocus()
            return
        L4c:
            androidx.recyclerview.widget.ChildHelper r1 = r7.mChildHelper
            boolean r0 = r1.isHidden(r0)
            if (r0 != 0) goto L55
            goto Lb1
        L55:
            androidx.recyclerview.widget.RecyclerView$State r0 = r7.mState
            long r0 = r0.mFocusedItemId
            r2 = -1
            r4 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L71
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r7.mAdapter
            boolean r0 = r0.hasStableIds()
            if (r0 == 0) goto L71
            androidx.recyclerview.widget.RecyclerView$State r0 = r7.mState
            long r0 = r0.mFocusedItemId
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r7.findViewHolderForItemId(r0)
            goto L72
        L71:
            r0 = r4
        L72:
            if (r0 == 0) goto L8a
            androidx.recyclerview.widget.ChildHelper r1 = r7.mChildHelper
            android.view.View r5 = r0.itemView
            boolean r1 = r1.isHidden(r5)
            if (r1 != 0) goto L8a
            android.view.View r1 = r0.itemView
            boolean r1 = r1.hasFocusable()
            if (r1 != 0) goto L87
            goto L8a
        L87:
            android.view.View r4 = r0.itemView
            goto L96
        L8a:
            androidx.recyclerview.widget.ChildHelper r0 = r7.mChildHelper
            int r0 = r0.getChildCount()
            if (r0 <= 0) goto L96
            android.view.View r4 = r7.findNextViewToFocus()
        L96:
            if (r4 == 0) goto Lb1
            androidx.recyclerview.widget.RecyclerView$State r0 = r7.mState
            int r0 = r0.mFocusedSubChildId
            long r5 = (long) r0
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r1 == 0) goto Lae
            android.view.View r0 = r4.findViewById(r0)
            if (r0 == 0) goto Lae
            boolean r1 = r0.isFocusable()
            if (r1 == 0) goto Lae
            r4 = r0
        Lae:
            r4.requestFocus()
        Lb1:
            return
    }

    private void releaseGlows() {
            r2 = this;
            android.widget.EdgeEffect r0 = r2.mLeftGlow
            if (r0 == 0) goto Le
            r0.onRelease()
            android.widget.EdgeEffect r0 = r2.mLeftGlow
            boolean r0 = r0.isFinished()
            goto Lf
        Le:
            r0 = 0
        Lf:
            android.widget.EdgeEffect r1 = r2.mTopGlow
            if (r1 == 0) goto L1d
            r1.onRelease()
            android.widget.EdgeEffect r1 = r2.mTopGlow
            boolean r1 = r1.isFinished()
            r0 = r0 | r1
        L1d:
            android.widget.EdgeEffect r1 = r2.mRightGlow
            if (r1 == 0) goto L2b
            r1.onRelease()
            android.widget.EdgeEffect r1 = r2.mRightGlow
            boolean r1 = r1.isFinished()
            r0 = r0 | r1
        L2b:
            android.widget.EdgeEffect r1 = r2.mBottomGlow
            if (r1 == 0) goto L39
            r1.onRelease()
            android.widget.EdgeEffect r1 = r2.mBottomGlow
            boolean r1 = r1.isFinished()
            r0 = r0 | r1
        L39:
            if (r0 == 0) goto L3e
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r2)
        L3e:
            return
    }

    private int releaseHorizontalGlow(int r4, float r5) {
            r3 = this;
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.mLeftGlow
            r1 = 0
            if (r0 == 0) goto L46
            float r0 = androidx.core.widget.EdgeEffectCompat.getDistance(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L46
            r0 = -1
            boolean r0 = r3.canScrollHorizontally(r0)
            if (r0 == 0) goto L27
            android.widget.EdgeEffect r4 = r3.mLeftGlow
            r4.onRelease()
            goto L42
        L27:
            android.widget.EdgeEffect r0 = r3.mLeftGlow
            float r4 = -r4
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = androidx.core.widget.EdgeEffectCompat.onPullDistance(r0, r4, r2)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.mLeftGlow
            float r5 = androidx.core.widget.EdgeEffectCompat.getDistance(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L41
            android.widget.EdgeEffect r5 = r3.mLeftGlow
            r5.onRelease()
        L41:
            r1 = r4
        L42:
            r3.invalidate()
            goto L78
        L46:
            android.widget.EdgeEffect r0 = r3.mRightGlow
            if (r0 == 0) goto L78
            float r0 = androidx.core.widget.EdgeEffectCompat.getDistance(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L78
            r0 = 1
            boolean r0 = r3.canScrollHorizontally(r0)
            if (r0 == 0) goto L5f
            android.widget.EdgeEffect r4 = r3.mRightGlow
            r4.onRelease()
            goto L75
        L5f:
            android.widget.EdgeEffect r0 = r3.mRightGlow
            float r4 = androidx.core.widget.EdgeEffectCompat.onPullDistance(r0, r4, r5)
            android.widget.EdgeEffect r5 = r3.mRightGlow
            float r5 = androidx.core.widget.EdgeEffectCompat.getDistance(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L74
            android.widget.EdgeEffect r5 = r3.mRightGlow
            r5.onRelease()
        L74:
            r1 = r4
        L75:
            r3.invalidate()
        L78:
            int r4 = r3.getWidth()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            return r4
    }

    private int releaseVerticalGlow(int r4, float r5) {
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.mTopGlow
            r1 = 0
            if (r0 == 0) goto L43
            float r0 = androidx.core.widget.EdgeEffectCompat.getDistance(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L43
            r0 = -1
            boolean r0 = r3.canScrollVertically(r0)
            if (r0 == 0) goto L27
            android.widget.EdgeEffect r4 = r3.mTopGlow
            r4.onRelease()
            goto L3f
        L27:
            android.widget.EdgeEffect r0 = r3.mTopGlow
            float r4 = -r4
            float r4 = androidx.core.widget.EdgeEffectCompat.onPullDistance(r0, r4, r5)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.mTopGlow
            float r5 = androidx.core.widget.EdgeEffectCompat.getDistance(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L3e
            android.widget.EdgeEffect r5 = r3.mTopGlow
            r5.onRelease()
        L3e:
            r1 = r4
        L3f:
            r3.invalidate()
            goto L78
        L43:
            android.widget.EdgeEffect r0 = r3.mBottomGlow
            if (r0 == 0) goto L78
            float r0 = androidx.core.widget.EdgeEffectCompat.getDistance(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L78
            r0 = 1
            boolean r0 = r3.canScrollVertically(r0)
            if (r0 == 0) goto L5c
            android.widget.EdgeEffect r4 = r3.mBottomGlow
            r4.onRelease()
            goto L75
        L5c:
            android.widget.EdgeEffect r0 = r3.mBottomGlow
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = androidx.core.widget.EdgeEffectCompat.onPullDistance(r0, r4, r2)
            android.widget.EdgeEffect r5 = r3.mBottomGlow
            float r5 = androidx.core.widget.EdgeEffectCompat.getDistance(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L74
            android.widget.EdgeEffect r5 = r3.mBottomGlow
            r5.onRelease()
        L74:
            r1 = r4
        L75:
            r3.invalidate()
        L78:
            int r4 = r3.getHeight()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            return r4
    }

    private void requestChildOnScreen(@androidx.annotation.NonNull android.view.View r12, @androidx.annotation.Nullable android.view.View r13) {
            r11 = this;
            if (r13 == 0) goto L4
            r0 = r13
            goto L5
        L4:
            r0 = r12
        L5:
            android.graphics.Rect r1 = r11.mTempRect
            int r2 = r0.getWidth()
            int r3 = r0.getHeight()
            r4 = 0
            r1.set(r4, r4, r2, r3)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r1 = r0 instanceof androidx.recyclerview.widget.RecyclerView.LayoutParams
            if (r1 == 0) goto L41
            androidx.recyclerview.widget.RecyclerView$LayoutParams r0 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r0
            boolean r1 = r0.mInsetsDirty
            if (r1 != 0) goto L41
            android.graphics.Rect r0 = r0.mDecorInsets
            android.graphics.Rect r1 = r11.mTempRect
            int r2 = r1.left
            int r3 = r0.left
            int r2 = r2 - r3
            r1.left = r2
            int r2 = r1.right
            int r3 = r0.right
            int r2 = r2 + r3
            r1.right = r2
            int r2 = r1.top
            int r3 = r0.top
            int r2 = r2 - r3
            r1.top = r2
            int r2 = r1.bottom
            int r0 = r0.bottom
            int r2 = r2 + r0
            r1.bottom = r2
        L41:
            if (r13 == 0) goto L4d
            android.graphics.Rect r0 = r11.mTempRect
            r11.offsetDescendantRectToMyCoords(r13, r0)
            android.graphics.Rect r0 = r11.mTempRect
            r11.offsetRectIntoDescendantCoords(r12, r0)
        L4d:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r5 = r11.mLayout
            android.graphics.Rect r8 = r11.mTempRect
            boolean r0 = r11.mFirstLayoutComplete
            r1 = 1
            r9 = r0 ^ 1
            if (r13 != 0) goto L5c
            r10 = 1
        L59:
            r6 = r11
            r7 = r12
            goto L5e
        L5c:
            r10 = 0
            goto L59
        L5e:
            r5.requestChildRectangleOnScreen(r6, r7, r8, r9, r10)
            return
    }

    private void resetFocusInfo() {
            r3 = this;
            androidx.recyclerview.widget.RecyclerView$State r0 = r3.mState
            r1 = -1
            r0.mFocusedItemId = r1
            r1 = -1
            r0.mFocusedItemPosition = r1
            r0.mFocusedSubChildId = r1
            return
    }

    private void resetScroll() {
            r1 = this;
            android.view.VelocityTracker r0 = r1.mVelocityTracker
            if (r0 == 0) goto L7
            r0.clear()
        L7:
            r0 = 0
            r1.stopNestedScroll(r0)
            r1.releaseGlows()
            return
    }

    private void saveFocusInfo() {
            r4 = this;
            boolean r0 = r4.mPreserveFocusAfterLayout
            r1 = 0
            if (r0 == 0) goto L14
            boolean r0 = r4.hasFocus()
            if (r0 == 0) goto L14
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r4.mAdapter
            if (r0 == 0) goto L14
            android.view.View r0 = r4.getFocusedChild()
            goto L15
        L14:
            r0 = r1
        L15:
            if (r0 != 0) goto L18
            goto L1c
        L18:
            androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = r4.findContainingViewHolder(r0)
        L1c:
            if (r1 != 0) goto L22
            r4.resetFocusInfo()
            return
        L22:
            androidx.recyclerview.widget.RecyclerView$State r0 = r4.mState
            androidx.recyclerview.widget.RecyclerView$Adapter r2 = r4.mAdapter
            boolean r2 = r2.hasStableIds()
            if (r2 == 0) goto L31
            long r2 = r1.getItemId()
            goto L33
        L31:
            r2 = -1
        L33:
            r0.mFocusedItemId = r2
            androidx.recyclerview.widget.RecyclerView$State r0 = r4.mState
            boolean r2 = r4.mDataSetHasChangedAfterLayout
            if (r2 == 0) goto L3d
            r2 = -1
            goto L4a
        L3d:
            boolean r2 = r1.isRemoved()
            if (r2 == 0) goto L46
            int r2 = r1.mOldPosition
            goto L4a
        L46:
            int r2 = r1.getAbsoluteAdapterPosition()
        L4a:
            r0.mFocusedItemPosition = r2
            androidx.recyclerview.widget.RecyclerView$State r0 = r4.mState
            android.view.View r1 = r1.itemView
            int r1 = r4.getDeepestFocusedViewWithId(r1)
            r0.mFocusedSubChildId = r1
            return
    }

    private void setAdapterInternal(@androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerView.Adapter<?> r3, boolean r4, boolean r5) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r2.mAdapter
            if (r0 == 0) goto Le
            androidx.recyclerview.widget.RecyclerView$RecyclerViewDataObserver r1 = r2.mObserver
            r0.unregisterAdapterDataObserver(r1)
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r2.mAdapter
            r0.onDetachedFromRecyclerView(r2)
        Le:
            if (r4 == 0) goto L12
            if (r5 == 0) goto L15
        L12:
            r2.removeAndRecycleViews()
        L15:
            androidx.recyclerview.widget.AdapterHelper r5 = r2.mAdapterHelper
            r5.reset()
            androidx.recyclerview.widget.RecyclerView$Adapter r5 = r2.mAdapter
            r2.mAdapter = r3
            if (r3 == 0) goto L28
            androidx.recyclerview.widget.RecyclerView$RecyclerViewDataObserver r0 = r2.mObserver
            r3.registerAdapterDataObserver(r0)
            r3.onAttachedToRecyclerView(r2)
        L28:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r2.mLayout
            if (r3 == 0) goto L31
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r2.mAdapter
            r3.onAdapterChanged(r5, r0)
        L31:
            androidx.recyclerview.widget.RecyclerView$Recycler r3 = r2.mRecycler
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r2.mAdapter
            r3.onAdapterChanged(r5, r0, r4)
            androidx.recyclerview.widget.RecyclerView$State r3 = r2.mState
            r4 = 1
            r3.mStructureChanged = r4
            return
    }

    private boolean shouldAbsorb(@androidx.annotation.NonNull android.widget.EdgeEffect r2, int r3, int r4) {
            r1 = this;
            r0 = 1
            if (r3 <= 0) goto L4
            return r0
        L4:
            float r2 = androidx.core.widget.EdgeEffectCompat.getDistance(r2)
            float r4 = (float) r4
            float r2 = r2 * r4
            int r3 = -r3
            float r3 = r1.getSplineFlingDistance(r3)
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 >= 0) goto L15
            return r0
        L15:
            r2 = 0
            return r2
    }

    private boolean stopGlowAnimations(android.view.MotionEvent r8) {
            r7 = this;
            android.widget.EdgeEffect r0 = r7.mLeftGlow
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L2a
            float r0 = androidx.core.widget.EdgeEffectCompat.getDistance(r0)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L2a
            boolean r0 = r7.canScrollHorizontally(r2)
            if (r0 != 0) goto L2a
            android.widget.EdgeEffect r0 = r7.mLeftGlow
            float r5 = r8.getY()
            int r6 = r7.getHeight()
            float r6 = (float) r6
            float r5 = r5 / r6
            float r5 = r1 - r5
            androidx.core.widget.EdgeEffectCompat.onPullDistance(r0, r4, r5)
            r0 = 1
            goto L2b
        L2a:
            r0 = 0
        L2b:
            android.widget.EdgeEffect r5 = r7.mRightGlow
            if (r5 == 0) goto L4d
            float r5 = androidx.core.widget.EdgeEffectCompat.getDistance(r5)
            int r5 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r5 == 0) goto L4d
            boolean r5 = r7.canScrollHorizontally(r3)
            if (r5 != 0) goto L4d
            android.widget.EdgeEffect r0 = r7.mRightGlow
            float r5 = r8.getY()
            int r6 = r7.getHeight()
            float r6 = (float) r6
            float r5 = r5 / r6
            androidx.core.widget.EdgeEffectCompat.onPullDistance(r0, r4, r5)
            r0 = 1
        L4d:
            android.widget.EdgeEffect r5 = r7.mTopGlow
            if (r5 == 0) goto L6f
            float r5 = androidx.core.widget.EdgeEffectCompat.getDistance(r5)
            int r5 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r5 == 0) goto L6f
            boolean r2 = r7.canScrollVertically(r2)
            if (r2 != 0) goto L6f
            android.widget.EdgeEffect r0 = r7.mTopGlow
            float r2 = r8.getX()
            int r5 = r7.getWidth()
            float r5 = (float) r5
            float r2 = r2 / r5
            androidx.core.widget.EdgeEffectCompat.onPullDistance(r0, r4, r2)
            r0 = 1
        L6f:
            android.widget.EdgeEffect r2 = r7.mBottomGlow
            if (r2 == 0) goto L92
            float r2 = androidx.core.widget.EdgeEffectCompat.getDistance(r2)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L92
            boolean r2 = r7.canScrollVertically(r3)
            if (r2 != 0) goto L92
            android.widget.EdgeEffect r0 = r7.mBottomGlow
            float r8 = r8.getX()
            int r2 = r7.getWidth()
            float r2 = (float) r2
            float r8 = r8 / r2
            float r1 = r1 - r8
            androidx.core.widget.EdgeEffectCompat.onPullDistance(r0, r4, r1)
            return r3
        L92:
            return r0
    }

    private void stopScrollersInternal() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$ViewFlinger r0 = r1.mViewFlinger
            r0.stop()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r1.mLayout
            if (r0 == 0) goto Lc
            r0.stopSmoothScroller()
        Lc:
            return
    }

    void absorbGlows(int r3, int r4) {
            r2 = this;
            if (r3 >= 0) goto L14
            r2.ensureLeftGlow()
            android.widget.EdgeEffect r0 = r2.mLeftGlow
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L26
            android.widget.EdgeEffect r0 = r2.mLeftGlow
            int r1 = -r3
            r0.onAbsorb(r1)
            goto L26
        L14:
            if (r3 <= 0) goto L26
            r2.ensureRightGlow()
            android.widget.EdgeEffect r0 = r2.mRightGlow
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L26
            android.widget.EdgeEffect r0 = r2.mRightGlow
            r0.onAbsorb(r3)
        L26:
            if (r4 >= 0) goto L3a
            r2.ensureTopGlow()
            android.widget.EdgeEffect r0 = r2.mTopGlow
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L4c
            android.widget.EdgeEffect r0 = r2.mTopGlow
            int r1 = -r4
            r0.onAbsorb(r1)
            goto L4c
        L3a:
            if (r4 <= 0) goto L4c
            r2.ensureBottomGlow()
            android.widget.EdgeEffect r0 = r2.mBottomGlow
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L4c
            android.widget.EdgeEffect r0 = r2.mBottomGlow
            r0.onAbsorb(r4)
        L4c:
            if (r3 != 0) goto L52
            if (r4 == 0) goto L51
            goto L52
        L51:
            return
        L52:
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r2)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(java.util.ArrayList<android.view.View> r2, int r3, int r4) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r1.mLayout
            if (r0 == 0) goto Lc
            boolean r0 = r0.onAddFocusables(r1, r2, r3, r4)
            if (r0 != 0) goto Lb
            goto Lc
        Lb:
            return
        Lc:
            super.addFocusables(r2, r3, r4)
            return
    }

    public void addItemDecoration(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ItemDecoration r2) {
            r1 = this;
            r0 = -1
            r1.addItemDecoration(r2, r0)
            return
    }

    public void addItemDecoration(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ItemDecoration r3, int r4) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r2.mLayout
            if (r0 == 0) goto L9
            java.lang.String r1 = "Cannot add item decoration during a scroll  or layout"
            r0.assertNotInLayoutOrScroll(r1)
        L9:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ItemDecoration> r0 = r2.mItemDecorations
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L15
            r0 = 0
            r2.setWillNotDraw(r0)
        L15:
            if (r4 >= 0) goto L1d
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ItemDecoration> r4 = r2.mItemDecorations
            r4.add(r3)
            goto L22
        L1d:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ItemDecoration> r0 = r2.mItemDecorations
            r0.add(r4, r3)
        L22:
            r2.markItemDecorInsetsDirty()
            r2.requestLayout()
            return
    }

    public void addOnChildAttachStateChangeListener(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener r2) {
            r1 = this;
            java.util.List<androidx.recyclerview.widget.RecyclerView$OnChildAttachStateChangeListener> r0 = r1.mOnChildAttachStateListeners
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mOnChildAttachStateListeners = r0
        Lb:
            java.util.List<androidx.recyclerview.widget.RecyclerView$OnChildAttachStateChangeListener> r0 = r1.mOnChildAttachStateListeners
            r0.add(r2)
            return
    }

    public void addOnItemTouchListener(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.OnItemTouchListener r2) {
            r1 = this;
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$OnItemTouchListener> r0 = r1.mOnItemTouchListeners
            r0.add(r2)
            return
    }

    public void addOnScrollListener(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.OnScrollListener r2) {
            r1 = this;
            java.util.List<androidx.recyclerview.widget.RecyclerView$OnScrollListener> r0 = r1.mScrollListeners
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mScrollListeners = r0
        Lb:
            java.util.List<androidx.recyclerview.widget.RecyclerView$OnScrollListener> r0 = r1.mScrollListeners
            r0.add(r2)
            return
    }

    public void addRecyclerListener(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.RecyclerListener r3) {
            r2 = this;
            if (r3 == 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            java.lang.String r1 = "'listener' arg cannot be null."
            androidx.core.util.Preconditions.checkArgument(r0, r1)
            java.util.List<androidx.recyclerview.widget.RecyclerView$RecyclerListener> r0 = r2.mRecyclerListeners
            r0.add(r3)
            return
    }

    void animateAppearance(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r2, @androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo r3, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo r4) {
            r1 = this;
            r0 = 0
            r2.setIsRecyclable(r0)
            androidx.recyclerview.widget.RecyclerView$ItemAnimator r0 = r1.mItemAnimator
            boolean r2 = r0.animateAppearance(r2, r3, r4)
            if (r2 == 0) goto Lf
            r1.postAnimationRunner()
        Lf:
            return
    }

    void animateDisappearance(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r2, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo r3, @androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo r4) {
            r1 = this;
            r1.addAnimatingView(r2)
            r0 = 0
            r2.setIsRecyclable(r0)
            androidx.recyclerview.widget.RecyclerView$ItemAnimator r0 = r1.mItemAnimator
            boolean r2 = r0.animateDisappearance(r2, r3, r4)
            if (r2 == 0) goto L12
            r1.postAnimationRunner()
        L12:
            return
    }

    void assertInLayoutOrScroll(java.lang.String r3) {
            r2 = this;
            boolean r0 = r2.isComputingLayout()
            if (r0 != 0) goto L3c
            if (r3 != 0) goto L23
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot call this method unless RecyclerView is computing a layout or scrolling"
            r0.append(r1)
            java.lang.String r1 = r2.exceptionLabel()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
        L23:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = r2.exceptionLabel()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L3c:
            return
    }

    void assertNotInLayoutOrScroll(java.lang.String r3) {
            r2 = this;
            boolean r0 = r2.isComputingLayout()
            if (r0 == 0) goto L29
            if (r3 != 0) goto L23
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot call this method while RecyclerView is computing a layout or scrolling"
            r0.append(r1)
            java.lang.String r1 = r2.exceptionLabel()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
        L23:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L29:
            int r3 = r2.mDispatchScrollCounter
            if (r3 <= 0) goto L47
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            r0.append(r1)
            java.lang.String r1 = r2.exceptionLabel()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
        L47:
            return
    }

    boolean canReuseUpdatedViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r3) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$ItemAnimator r0 = r2.mItemAnimator
            if (r0 == 0) goto L11
            java.util.List r1 = r3.getUnmodifiedPayloads()
            boolean r3 = r0.canReuseUpdatedViewHolder(r3, r1)
            if (r3 == 0) goto Lf
            goto L11
        Lf:
            r3 = 0
            return r3
        L11:
            r3 = 1
            return r3
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.recyclerview.widget.RecyclerView.LayoutParams
            if (r0 == 0) goto L10
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r1.mLayout
            androidx.recyclerview.widget.RecyclerView$LayoutParams r2 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r2
            boolean r2 = r0.checkLayoutParams(r2)
            if (r2 == 0) goto L10
            r2 = 1
            return r2
        L10:
            r2 = 0
            return r2
    }

    void clearOldPositions() {
            r4 = this;
            androidx.recyclerview.widget.ChildHelper r0 = r4.mChildHelper
            int r0 = r0.getUnfilteredChildCount()
            r1 = 0
        L7:
            if (r1 >= r0) goto L1f
            androidx.recyclerview.widget.ChildHelper r2 = r4.mChildHelper
            android.view.View r2 = r2.getUnfilteredChildAt(r1)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = getChildViewHolderInt(r2)
            boolean r3 = r2.shouldIgnore()
            if (r3 != 0) goto L1c
            r2.clearOldPosition()
        L1c:
            int r1 = r1 + 1
            goto L7
        L1f:
            androidx.recyclerview.widget.RecyclerView$Recycler r0 = r4.mRecycler
            r0.clearOldPositions()
            return
    }

    public void clearOnChildAttachStateChangeListeners() {
            r1 = this;
            java.util.List<androidx.recyclerview.widget.RecyclerView$OnChildAttachStateChangeListener> r0 = r1.mOnChildAttachStateListeners
            if (r0 == 0) goto L7
            r0.clear()
        L7:
            return
    }

    public void clearOnScrollListeners() {
            r1 = this;
            java.util.List<androidx.recyclerview.widget.RecyclerView$OnScrollListener> r0 = r1.mScrollListeners
            if (r0 == 0) goto L7
            r0.clear()
        L7:
            return
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollExtent() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r2.mLayout
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r0.canScrollHorizontally()
            if (r0 == 0) goto L15
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r2.mLayout
            androidx.recyclerview.widget.RecyclerView$State r1 = r2.mState
            int r0 = r0.computeHorizontalScrollExtent(r1)
            return r0
        L15:
            return r1
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollOffset() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r2.mLayout
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r0.canScrollHorizontally()
            if (r0 == 0) goto L15
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r2.mLayout
            androidx.recyclerview.widget.RecyclerView$State r1 = r2.mState
            int r0 = r0.computeHorizontalScrollOffset(r1)
            return r0
        L15:
            return r1
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollRange() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r2.mLayout
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r0.canScrollHorizontally()
            if (r0 == 0) goto L15
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r2.mLayout
            androidx.recyclerview.widget.RecyclerView$State r1 = r2.mState
            int r0 = r0.computeHorizontalScrollRange(r1)
            return r0
        L15:
            return r1
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollExtent() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r2.mLayout
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r0.canScrollVertically()
            if (r0 == 0) goto L15
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r2.mLayout
            androidx.recyclerview.widget.RecyclerView$State r1 = r2.mState
            int r0 = r0.computeVerticalScrollExtent(r1)
            return r0
        L15:
            return r1
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollOffset() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r2.mLayout
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r0.canScrollVertically()
            if (r0 == 0) goto L15
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r2.mLayout
            androidx.recyclerview.widget.RecyclerView$State r1 = r2.mState
            int r0 = r0.computeVerticalScrollOffset(r1)
            return r0
        L15:
            return r1
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollRange() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r2.mLayout
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r0.canScrollVertically()
            if (r0 == 0) goto L15
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r2.mLayout
            androidx.recyclerview.widget.RecyclerView$State r1 = r2.mState
            int r0 = r0.computeVerticalScrollRange(r1)
            return r0
        L15:
            return r1
    }

    void considerReleasingGlowsOnScroll(int r3, int r4) {
            r2 = this;
            android.widget.EdgeEffect r0 = r2.mLeftGlow
            if (r0 == 0) goto L18
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L18
            if (r3 <= 0) goto L18
            android.widget.EdgeEffect r0 = r2.mLeftGlow
            r0.onRelease()
            android.widget.EdgeEffect r0 = r2.mLeftGlow
            boolean r0 = r0.isFinished()
            goto L19
        L18:
            r0 = 0
        L19:
            android.widget.EdgeEffect r1 = r2.mRightGlow
            if (r1 == 0) goto L31
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto L31
            if (r3 >= 0) goto L31
            android.widget.EdgeEffect r3 = r2.mRightGlow
            r3.onRelease()
            android.widget.EdgeEffect r3 = r2.mRightGlow
            boolean r3 = r3.isFinished()
            r0 = r0 | r3
        L31:
            android.widget.EdgeEffect r3 = r2.mTopGlow
            if (r3 == 0) goto L49
            boolean r3 = r3.isFinished()
            if (r3 != 0) goto L49
            if (r4 <= 0) goto L49
            android.widget.EdgeEffect r3 = r2.mTopGlow
            r3.onRelease()
            android.widget.EdgeEffect r3 = r2.mTopGlow
            boolean r3 = r3.isFinished()
            r0 = r0 | r3
        L49:
            android.widget.EdgeEffect r3 = r2.mBottomGlow
            if (r3 == 0) goto L61
            boolean r3 = r3.isFinished()
            if (r3 != 0) goto L61
            if (r4 >= 0) goto L61
            android.widget.EdgeEffect r3 = r2.mBottomGlow
            r3.onRelease()
            android.widget.EdgeEffect r3 = r2.mBottomGlow
            boolean r3 = r3.isFinished()
            r0 = r0 | r3
        L61:
            if (r0 == 0) goto L66
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r2)
        L66:
            return
    }

    int consumeFlingInHorizontalStretch(int r4) {
            r3 = this;
            android.widget.EdgeEffect r0 = r3.mLeftGlow
            android.widget.EdgeEffect r1 = r3.mRightGlow
            int r2 = r3.getWidth()
            int r4 = r3.consumeFlingInStretch(r4, r0, r1, r2)
            return r4
    }

    int consumeFlingInVerticalStretch(int r4) {
            r3 = this;
            android.widget.EdgeEffect r0 = r3.mTopGlow
            android.widget.EdgeEffect r1 = r3.mBottomGlow
            int r2 = r3.getHeight()
            int r4 = r3.consumeFlingInStretch(r4, r0, r1, r2)
            return r4
    }

    void consumePendingUpdateOperations() {
            r3 = this;
            boolean r0 = r3.mFirstLayoutComplete
            java.lang.String r1 = "RV FullInvalidate"
            if (r0 == 0) goto L67
            boolean r0 = r3.mDataSetHasChangedAfterLayout
            if (r0 == 0) goto Lb
            goto L67
        Lb:
            androidx.recyclerview.widget.AdapterHelper r0 = r3.mAdapterHelper
            boolean r0 = r0.hasPendingUpdates()
            if (r0 != 0) goto L14
            goto L66
        L14:
            androidx.recyclerview.widget.AdapterHelper r0 = r3.mAdapterHelper
            r2 = 4
            boolean r0 = r0.hasAnyUpdateTypes(r2)
            if (r0 == 0) goto L55
            androidx.recyclerview.widget.AdapterHelper r0 = r3.mAdapterHelper
            r2 = 11
            boolean r0 = r0.hasAnyUpdateTypes(r2)
            if (r0 != 0) goto L55
            java.lang.String r0 = "RV PartialInvalidate"
            androidx.core.os.TraceCompat.beginSection(r0)
            r3.startInterceptRequestLayout()
            r3.onEnterLayoutOrScroll()
            androidx.recyclerview.widget.AdapterHelper r0 = r3.mAdapterHelper
            r0.preProcess()
            boolean r0 = r3.mLayoutWasDefered
            if (r0 != 0) goto L4a
            boolean r0 = r3.hasUpdatedView()
            if (r0 == 0) goto L45
            r3.dispatchLayout()
            goto L4a
        L45:
            androidx.recyclerview.widget.AdapterHelper r0 = r3.mAdapterHelper
            r0.consumePostponedUpdates()
        L4a:
            r0 = 1
            r3.stopInterceptRequestLayout(r0)
            r3.onExitLayoutOrScroll()
            androidx.core.os.TraceCompat.endSection()
            return
        L55:
            androidx.recyclerview.widget.AdapterHelper r0 = r3.mAdapterHelper
            boolean r0 = r0.hasPendingUpdates()
            if (r0 == 0) goto L66
            androidx.core.os.TraceCompat.beginSection(r1)
            r3.dispatchLayout()
            androidx.core.os.TraceCompat.endSection()
        L66:
            return
        L67:
            androidx.core.os.TraceCompat.beginSection(r1)
            r3.dispatchLayout()
            androidx.core.os.TraceCompat.endSection()
            return
    }

    void defaultOnMeasure(int r3, int r4) {
            r2 = this;
            int r0 = r2.getPaddingLeft()
            int r1 = r2.getPaddingRight()
            int r0 = r0 + r1
            int r1 = androidx.core.view.ViewCompat.getMinimumWidth(r2)
            int r3 = androidx.recyclerview.widget.RecyclerView.LayoutManager.chooseSize(r3, r0, r1)
            int r0 = r2.getPaddingTop()
            int r1 = r2.getPaddingBottom()
            int r0 = r0 + r1
            int r1 = androidx.core.view.ViewCompat.getMinimumHeight(r2)
            int r4 = androidx.recyclerview.widget.RecyclerView.LayoutManager.chooseSize(r4, r0, r1)
            r2.setMeasuredDimension(r3, r4)
            return
    }

    void dispatchChildAttached(android.view.View r3) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = getChildViewHolderInt(r3)
            r2.onChildAttachedToWindow(r3)
            androidx.recyclerview.widget.RecyclerView$Adapter r1 = r2.mAdapter
            if (r1 == 0) goto L10
            if (r0 == 0) goto L10
            r1.onViewAttachedToWindow(r0)
        L10:
            java.util.List<androidx.recyclerview.widget.RecyclerView$OnChildAttachStateChangeListener> r0 = r2.mOnChildAttachStateListeners
            if (r0 == 0) goto L2a
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L1a:
            if (r0 < 0) goto L2a
            java.util.List<androidx.recyclerview.widget.RecyclerView$OnChildAttachStateChangeListener> r1 = r2.mOnChildAttachStateListeners
            java.lang.Object r1 = r1.get(r0)
            androidx.recyclerview.widget.RecyclerView$OnChildAttachStateChangeListener r1 = (androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener) r1
            r1.onChildViewAttachedToWindow(r3)
            int r0 = r0 + (-1)
            goto L1a
        L2a:
            return
    }

    void dispatchChildDetached(android.view.View r3) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = getChildViewHolderInt(r3)
            r2.onChildDetachedFromWindow(r3)
            androidx.recyclerview.widget.RecyclerView$Adapter r1 = r2.mAdapter
            if (r1 == 0) goto L10
            if (r0 == 0) goto L10
            r1.onViewDetachedFromWindow(r0)
        L10:
            java.util.List<androidx.recyclerview.widget.RecyclerView$OnChildAttachStateChangeListener> r0 = r2.mOnChildAttachStateListeners
            if (r0 == 0) goto L2a
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L1a:
            if (r0 < 0) goto L2a
            java.util.List<androidx.recyclerview.widget.RecyclerView$OnChildAttachStateChangeListener> r1 = r2.mOnChildAttachStateListeners
            java.lang.Object r1 = r1.get(r0)
            androidx.recyclerview.widget.RecyclerView$OnChildAttachStateChangeListener r1 = (androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener) r1
            r1.onChildViewDetachedFromWindow(r3)
            int r0 = r0 + (-1)
            goto L1a
        L2a:
            return
    }

    void dispatchLayout() {
            r4 = this;
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r4.mAdapter
            if (r0 != 0) goto L5
            return
        L5:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r4.mLayout
            if (r0 != 0) goto La
            return
        La:
            androidx.recyclerview.widget.RecyclerView$State r0 = r4.mState
            r1 = 0
            r0.mIsMeasuring = r1
            boolean r0 = r4.mLastAutoMeasureSkippedDueToExact
            r2 = 1
            if (r0 == 0) goto L26
            int r0 = r4.mLastAutoMeasureNonExactMeasuredWidth
            int r3 = r4.getWidth()
            if (r0 != r3) goto L24
            int r0 = r4.mLastAutoMeasureNonExactMeasuredHeight
            int r3 = r4.getHeight()
            if (r0 == r3) goto L26
        L24:
            r0 = 1
            goto L27
        L26:
            r0 = 0
        L27:
            r4.mLastAutoMeasureNonExactMeasuredWidth = r1
            r4.mLastAutoMeasureNonExactMeasuredHeight = r1
            r4.mLastAutoMeasureSkippedDueToExact = r1
            androidx.recyclerview.widget.RecyclerView$State r1 = r4.mState
            int r1 = r1.mLayoutStep
            if (r1 != r2) goto L3f
            r4.dispatchLayoutStep1()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r4.mLayout
            r0.setExactMeasureSpecsFrom(r4)
            r4.dispatchLayoutStep2()
            goto L70
        L3f:
            androidx.recyclerview.widget.AdapterHelper r1 = r4.mAdapterHelper
            boolean r1 = r1.hasUpdates()
            if (r1 != 0) goto L68
            if (r0 != 0) goto L68
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r4.mLayout
            int r0 = r0.getWidth()
            int r1 = r4.getWidth()
            if (r0 != r1) goto L68
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r4.mLayout
            int r0 = r0.getHeight()
            int r1 = r4.getHeight()
            if (r0 == r1) goto L62
            goto L68
        L62:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r4.mLayout
            r0.setExactMeasureSpecsFrom(r4)
            goto L70
        L68:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r4.mLayout
            r0.setExactMeasureSpecsFrom(r4)
            r4.dispatchLayoutStep2()
        L70:
            r4.dispatchLayoutStep3()
            return
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float r2, float r3, boolean r4) {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.getScrollingChildHelper()
            boolean r2 = r0.dispatchNestedFling(r2, r3, r4)
            return r2
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float r2, float r3) {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.getScrollingChildHelper()
            boolean r2 = r0.dispatchNestedPreFling(r2, r3)
            return r2
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int r2, int r3, int[] r4, int[] r5) {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.getScrollingChildHelper()
            boolean r2 = r0.dispatchNestedPreScroll(r2, r3, r4, r5)
            return r2
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedPreScroll(int r7, int r8, int[] r9, int[] r10, int r11) {
            r6 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r6.getScrollingChildHelper()
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            boolean r7 = r0.dispatchNestedPreScroll(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // androidx.core.view.NestedScrollingChild3
    public final void dispatchNestedScroll(int r9, int r10, int r11, int r12, int[] r13, int r14, @androidx.annotation.NonNull int[] r15) {
            r8 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r8.getScrollingChildHelper()
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r0.dispatchNestedScroll(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int r7, int r8, int r9, int r10, int[] r11) {
            r6 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r6.getScrollingChildHelper()
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            boolean r7 = r0.dispatchNestedScroll(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedScroll(int r8, int r9, int r10, int r11, int[] r12, int r13) {
            r7 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r7.getScrollingChildHelper()
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            boolean r8 = r0.dispatchNestedScroll(r1, r2, r3, r4, r5, r6)
            return r8
    }

    void dispatchOnScrollStateChanged(int r3) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r2.mLayout
            if (r0 == 0) goto L7
            r0.onScrollStateChanged(r3)
        L7:
            r2.onScrollStateChanged(r3)
            androidx.recyclerview.widget.RecyclerView$OnScrollListener r0 = r2.mScrollListener
            if (r0 == 0) goto L11
            r0.onScrollStateChanged(r2, r3)
        L11:
            java.util.List<androidx.recyclerview.widget.RecyclerView$OnScrollListener> r0 = r2.mScrollListeners
            if (r0 == 0) goto L2b
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L1b:
            if (r0 < 0) goto L2b
            java.util.List<androidx.recyclerview.widget.RecyclerView$OnScrollListener> r1 = r2.mScrollListeners
            java.lang.Object r1 = r1.get(r0)
            androidx.recyclerview.widget.RecyclerView$OnScrollListener r1 = (androidx.recyclerview.widget.RecyclerView.OnScrollListener) r1
            r1.onScrollStateChanged(r2, r3)
            int r0 = r0 + (-1)
            goto L1b
        L2b:
            return
    }

    void dispatchOnScrolled(int r5, int r6) {
            r4 = this;
            int r0 = r4.mDispatchScrollCounter
            int r0 = r0 + 1
            r4.mDispatchScrollCounter = r0
            int r0 = r4.getScrollX()
            int r1 = r4.getScrollY()
            int r2 = r0 - r5
            int r3 = r1 - r6
            r4.onScrollChanged(r0, r1, r2, r3)
            r4.onScrolled(r5, r6)
            androidx.recyclerview.widget.RecyclerView$OnScrollListener r0 = r4.mScrollListener
            if (r0 == 0) goto L1f
            r0.onScrolled(r4, r5, r6)
        L1f:
            java.util.List<androidx.recyclerview.widget.RecyclerView$OnScrollListener> r0 = r4.mScrollListeners
            if (r0 == 0) goto L39
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L29:
            if (r0 < 0) goto L39
            java.util.List<androidx.recyclerview.widget.RecyclerView$OnScrollListener> r1 = r4.mScrollListeners
            java.lang.Object r1 = r1.get(r0)
            androidx.recyclerview.widget.RecyclerView$OnScrollListener r1 = (androidx.recyclerview.widget.RecyclerView.OnScrollListener) r1
            r1.onScrolled(r4, r5, r6)
            int r0 = r0 + (-1)
            goto L29
        L39:
            int r5 = r4.mDispatchScrollCounter
            int r5 = r5 + (-1)
            r4.mDispatchScrollCounter = r5
            return
    }

    void dispatchPendingImportantForAccessibilityChanges() {
            r5 = this;
            java.util.List<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r5.mPendingAccessibilityImportanceChange
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L30
            java.util.List<androidx.recyclerview.widget.RecyclerView$ViewHolder> r1 = r5.mPendingAccessibilityImportanceChange
            java.lang.Object r1 = r1.get(r0)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r1
            android.view.View r2 = r1.itemView
            android.view.ViewParent r2 = r2.getParent()
            if (r2 != r5) goto L2d
            boolean r2 = r1.shouldIgnore()
            if (r2 == 0) goto L21
            goto L2d
        L21:
            int r2 = r1.mPendingAccessibilityState
            r3 = -1
            if (r2 == r3) goto L2d
            android.view.View r4 = r1.itemView
            androidx.core.view.ViewCompat.setImportantForAccessibility(r4, r2)
            r1.mPendingAccessibilityState = r3
        L2d:
            int r0 = r0 + (-1)
            goto L8
        L30:
            java.util.List<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r5.mPendingAccessibilityImportanceChange
            r0.clear()
            return
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent r1) {
            r0 = this;
            r0.onPopulateAccessibilityEvent(r1)
            r1 = 1
            return r1
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(android.util.SparseArray<android.os.Parcelable> r1) {
            r0 = this;
            r0.dispatchThawSelfOnly(r1)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(android.util.SparseArray<android.os.Parcelable> r1) {
            r0 = this;
            r0.dispatchFreezeSelfOnly(r1)
            return
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas r8) {
            r7 = this;
            super.draw(r8)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ItemDecoration> r0 = r7.mItemDecorations
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        Lb:
            if (r2 >= r0) goto L1d
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ItemDecoration> r3 = r7.mItemDecorations
            java.lang.Object r3 = r3.get(r2)
            androidx.recyclerview.widget.RecyclerView$ItemDecoration r3 = (androidx.recyclerview.widget.RecyclerView.ItemDecoration) r3
            androidx.recyclerview.widget.RecyclerView$State r4 = r7.mState
            r3.onDrawOver(r8, r7, r4)
            int r2 = r2 + 1
            goto Lb
        L1d:
            android.widget.EdgeEffect r0 = r7.mLeftGlow
            r2 = 1
            if (r0 == 0) goto L57
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L57
            int r0 = r8.save()
            boolean r3 = r7.mClipToPadding
            if (r3 == 0) goto L35
            int r3 = r7.getPaddingBottom()
            goto L36
        L35:
            r3 = 0
        L36:
            r4 = 1132920832(0x43870000, float:270.0)
            r8.rotate(r4)
            int r4 = r7.getHeight()
            int r4 = -r4
            int r4 = r4 + r3
            float r3 = (float) r4
            r4 = 0
            r8.translate(r3, r4)
            android.widget.EdgeEffect r3 = r7.mLeftGlow
            if (r3 == 0) goto L52
            boolean r3 = r3.draw(r8)
            if (r3 == 0) goto L52
            r3 = 1
            goto L53
        L52:
            r3 = 0
        L53:
            r8.restoreToCount(r0)
            goto L58
        L57:
            r3 = 0
        L58:
            android.widget.EdgeEffect r0 = r7.mTopGlow
            if (r0 == 0) goto L88
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L88
            int r0 = r8.save()
            boolean r4 = r7.mClipToPadding
            if (r4 == 0) goto L77
            int r4 = r7.getPaddingLeft()
            float r4 = (float) r4
            int r5 = r7.getPaddingTop()
            float r5 = (float) r5
            r8.translate(r4, r5)
        L77:
            android.widget.EdgeEffect r4 = r7.mTopGlow
            if (r4 == 0) goto L83
            boolean r4 = r4.draw(r8)
            if (r4 == 0) goto L83
            r4 = 1
            goto L84
        L83:
            r4 = 0
        L84:
            r3 = r3 | r4
            r8.restoreToCount(r0)
        L88:
            android.widget.EdgeEffect r0 = r7.mRightGlow
            if (r0 == 0) goto Lc0
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto Lc0
            int r0 = r8.save()
            int r4 = r7.getWidth()
            boolean r5 = r7.mClipToPadding
            if (r5 == 0) goto La3
            int r5 = r7.getPaddingTop()
            goto La4
        La3:
            r5 = 0
        La4:
            r6 = 1119092736(0x42b40000, float:90.0)
            r8.rotate(r6)
            float r5 = (float) r5
            int r4 = -r4
            float r4 = (float) r4
            r8.translate(r5, r4)
            android.widget.EdgeEffect r4 = r7.mRightGlow
            if (r4 == 0) goto Lbb
            boolean r4 = r4.draw(r8)
            if (r4 == 0) goto Lbb
            r4 = 1
            goto Lbc
        Lbb:
            r4 = 0
        Lbc:
            r3 = r3 | r4
            r8.restoreToCount(r0)
        Lc0:
            android.widget.EdgeEffect r0 = r7.mBottomGlow
            if (r0 == 0) goto L10f
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L10f
            int r0 = r8.save()
            r4 = 1127481344(0x43340000, float:180.0)
            r8.rotate(r4)
            boolean r4 = r7.mClipToPadding
            if (r4 == 0) goto Lf1
            int r4 = r7.getWidth()
            int r4 = -r4
            int r5 = r7.getPaddingRight()
            int r4 = r4 + r5
            float r4 = (float) r4
            int r5 = r7.getHeight()
            int r5 = -r5
            int r6 = r7.getPaddingBottom()
            int r5 = r5 + r6
            float r5 = (float) r5
            r8.translate(r4, r5)
            goto L100
        Lf1:
            int r4 = r7.getWidth()
            int r4 = -r4
            float r4 = (float) r4
            int r5 = r7.getHeight()
            int r5 = -r5
            float r5 = (float) r5
            r8.translate(r4, r5)
        L100:
            android.widget.EdgeEffect r4 = r7.mBottomGlow
            if (r4 == 0) goto L10b
            boolean r4 = r4.draw(r8)
            if (r4 == 0) goto L10b
            r1 = 1
        L10b:
            r3 = r3 | r1
            r8.restoreToCount(r0)
        L10f:
            if (r3 != 0) goto L126
            androidx.recyclerview.widget.RecyclerView$ItemAnimator r8 = r7.mItemAnimator
            if (r8 == 0) goto L126
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ItemDecoration> r8 = r7.mItemDecorations
            int r8 = r8.size()
            if (r8 <= 0) goto L126
            androidx.recyclerview.widget.RecyclerView$ItemAnimator r8 = r7.mItemAnimator
            boolean r8 = r8.isRunning()
            if (r8 == 0) goto L126
            goto L127
        L126:
            r2 = r3
        L127:
            if (r2 == 0) goto L12c
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r7)
        L12c:
            return
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(android.graphics.Canvas r1, android.view.View r2, long r3) {
            r0 = this;
            boolean r1 = super.drawChild(r1, r2, r3)
            return r1
    }

    void ensureBottomGlow() {
            r4 = this;
            android.widget.EdgeEffect r0 = r4.mBottomGlow
            if (r0 == 0) goto L5
            return
        L5:
            androidx.recyclerview.widget.RecyclerView$EdgeEffectFactory r0 = r4.mEdgeEffectFactory
            r1 = 3
            android.widget.EdgeEffect r0 = r0.createEdgeEffect(r4, r1)
            r4.mBottomGlow = r0
            boolean r1 = r4.mClipToPadding
            if (r1 == 0) goto L32
            int r1 = r4.getMeasuredWidth()
            int r2 = r4.getPaddingLeft()
            int r1 = r1 - r2
            int r2 = r4.getPaddingRight()
            int r1 = r1 - r2
            int r2 = r4.getMeasuredHeight()
            int r3 = r4.getPaddingTop()
            int r2 = r2 - r3
            int r3 = r4.getPaddingBottom()
            int r2 = r2 - r3
            r0.setSize(r1, r2)
            return
        L32:
            int r1 = r4.getMeasuredWidth()
            int r2 = r4.getMeasuredHeight()
            r0.setSize(r1, r2)
            return
    }

    void ensureLeftGlow() {
            r4 = this;
            android.widget.EdgeEffect r0 = r4.mLeftGlow
            if (r0 == 0) goto L5
            return
        L5:
            androidx.recyclerview.widget.RecyclerView$EdgeEffectFactory r0 = r4.mEdgeEffectFactory
            r1 = 0
            android.widget.EdgeEffect r0 = r0.createEdgeEffect(r4, r1)
            r4.mLeftGlow = r0
            boolean r1 = r4.mClipToPadding
            if (r1 == 0) goto L32
            int r1 = r4.getMeasuredHeight()
            int r2 = r4.getPaddingTop()
            int r1 = r1 - r2
            int r2 = r4.getPaddingBottom()
            int r1 = r1 - r2
            int r2 = r4.getMeasuredWidth()
            int r3 = r4.getPaddingLeft()
            int r2 = r2 - r3
            int r3 = r4.getPaddingRight()
            int r2 = r2 - r3
            r0.setSize(r1, r2)
            return
        L32:
            int r1 = r4.getMeasuredHeight()
            int r2 = r4.getMeasuredWidth()
            r0.setSize(r1, r2)
            return
    }

    void ensureRightGlow() {
            r4 = this;
            android.widget.EdgeEffect r0 = r4.mRightGlow
            if (r0 == 0) goto L5
            return
        L5:
            androidx.recyclerview.widget.RecyclerView$EdgeEffectFactory r0 = r4.mEdgeEffectFactory
            r1 = 2
            android.widget.EdgeEffect r0 = r0.createEdgeEffect(r4, r1)
            r4.mRightGlow = r0
            boolean r1 = r4.mClipToPadding
            if (r1 == 0) goto L32
            int r1 = r4.getMeasuredHeight()
            int r2 = r4.getPaddingTop()
            int r1 = r1 - r2
            int r2 = r4.getPaddingBottom()
            int r1 = r1 - r2
            int r2 = r4.getMeasuredWidth()
            int r3 = r4.getPaddingLeft()
            int r2 = r2 - r3
            int r3 = r4.getPaddingRight()
            int r2 = r2 - r3
            r0.setSize(r1, r2)
            return
        L32:
            int r1 = r4.getMeasuredHeight()
            int r2 = r4.getMeasuredWidth()
            r0.setSize(r1, r2)
            return
    }

    void ensureTopGlow() {
            r4 = this;
            android.widget.EdgeEffect r0 = r4.mTopGlow
            if (r0 == 0) goto L5
            return
        L5:
            androidx.recyclerview.widget.RecyclerView$EdgeEffectFactory r0 = r4.mEdgeEffectFactory
            r1 = 1
            android.widget.EdgeEffect r0 = r0.createEdgeEffect(r4, r1)
            r4.mTopGlow = r0
            boolean r1 = r4.mClipToPadding
            if (r1 == 0) goto L32
            int r1 = r4.getMeasuredWidth()
            int r2 = r4.getPaddingLeft()
            int r1 = r1 - r2
            int r2 = r4.getPaddingRight()
            int r1 = r1 - r2
            int r2 = r4.getMeasuredHeight()
            int r3 = r4.getPaddingTop()
            int r2 = r2 - r3
            int r3 = r4.getPaddingBottom()
            int r2 = r2 - r3
            r0.setSize(r1, r2)
            return
        L32:
            int r1 = r4.getMeasuredWidth()
            int r2 = r4.getMeasuredHeight()
            r0.setSize(r1, r2)
            return
    }

    java.lang.String exceptionLabel() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = ", adapter:"
            r0.append(r1)
            androidx.recyclerview.widget.RecyclerView$Adapter r1 = r2.mAdapter
            r0.append(r1)
            java.lang.String r1 = ", layout:"
            r0.append(r1)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r2.mLayout
            r0.append(r1)
            java.lang.String r1 = ", context:"
            r0.append(r1)
            android.content.Context r1 = r2.getContext()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    final void fillRemainingScrollValues(androidx.recyclerview.widget.RecyclerView.State r4) {
            r3 = this;
            int r0 = r3.getScrollState()
            r1 = 2
            if (r0 != r1) goto L22
            androidx.recyclerview.widget.RecyclerView$ViewFlinger r0 = r3.mViewFlinger
            android.widget.OverScroller r0 = r0.mOverScroller
            int r1 = r0.getFinalX()
            int r2 = r0.getCurrX()
            int r1 = r1 - r2
            r4.mRemainingScrollHorizontal = r1
            int r1 = r0.getFinalY()
            int r0 = r0.getCurrY()
            int r1 = r1 - r0
            r4.mRemainingScrollVertical = r1
            return
        L22:
            r0 = 0
            r4.mRemainingScrollHorizontal = r0
            r4.mRemainingScrollVertical = r0
            return
    }

    @androidx.annotation.Nullable
    public android.view.View findChildViewUnder(float r6, float r7) {
            r5 = this;
            androidx.recyclerview.widget.ChildHelper r0 = r5.mChildHelper
            int r0 = r0.getChildCount()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L44
            androidx.recyclerview.widget.ChildHelper r1 = r5.mChildHelper
            android.view.View r1 = r1.getChildAt(r0)
            float r2 = r1.getTranslationX()
            float r3 = r1.getTranslationY()
            int r4 = r1.getLeft()
            float r4 = (float) r4
            float r4 = r4 + r2
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 < 0) goto L41
            int r4 = r1.getRight()
            float r4 = (float) r4
            float r4 = r4 + r2
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 > 0) goto L41
            int r2 = r1.getTop()
            float r2 = (float) r2
            float r2 = r2 + r3
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 < 0) goto L41
            int r2 = r1.getBottom()
            float r2 = (float) r2
            float r2 = r2 + r3
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 > 0) goto L41
            return r1
        L41:
            int r0 = r0 + (-1)
            goto L8
        L44:
            r6 = 0
            return r6
    }

    @androidx.annotation.Nullable
    public android.view.View findContainingItemView(@androidx.annotation.NonNull android.view.View r3) {
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            return r3
        L17:
            r3 = 0
            return r3
    }

    @androidx.annotation.Nullable
    public androidx.recyclerview.widget.RecyclerView.ViewHolder findContainingViewHolder(@androidx.annotation.NonNull android.view.View r1) {
            r0 = this;
            android.view.View r1 = r0.findContainingItemView(r1)
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = r0.getChildViewHolder(r1)
            return r1
    }

    @androidx.annotation.Nullable
    public androidx.recyclerview.widget.RecyclerView.ViewHolder findViewHolderForAdapterPosition(int r6) {
            r5 = this;
            boolean r0 = r5.mDataSetHasChangedAfterLayout
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            androidx.recyclerview.widget.ChildHelper r0 = r5.mChildHelper
            int r0 = r0.getUnfilteredChildCount()
            r2 = 0
        Ld:
            if (r2 >= r0) goto L37
            androidx.recyclerview.widget.ChildHelper r3 = r5.mChildHelper
            android.view.View r3 = r3.getUnfilteredChildAt(r2)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = getChildViewHolderInt(r3)
            if (r3 == 0) goto L34
            boolean r4 = r3.isRemoved()
            if (r4 != 0) goto L34
            int r4 = r5.getAdapterPositionInRecyclerView(r3)
            if (r4 != r6) goto L34
            androidx.recyclerview.widget.ChildHelper r1 = r5.mChildHelper
            android.view.View r4 = r3.itemView
            boolean r1 = r1.isHidden(r4)
            if (r1 == 0) goto L33
            r1 = r3
            goto L34
        L33:
            return r3
        L34:
            int r2 = r2 + 1
            goto Ld
        L37:
            return r1
    }

    public androidx.recyclerview.widget.RecyclerView.ViewHolder findViewHolderForItemId(long r8) {
            r7 = this;
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r7.mAdapter
            r1 = 0
            if (r0 == 0) goto L3f
            boolean r0 = r0.hasStableIds()
            if (r0 != 0) goto Lc
            goto L3f
        Lc:
            androidx.recyclerview.widget.ChildHelper r0 = r7.mChildHelper
            int r0 = r0.getUnfilteredChildCount()
            r2 = 0
        L13:
            if (r2 >= r0) goto L3f
            androidx.recyclerview.widget.ChildHelper r3 = r7.mChildHelper
            android.view.View r3 = r3.getUnfilteredChildAt(r2)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = getChildViewHolderInt(r3)
            if (r3 == 0) goto L3c
            boolean r4 = r3.isRemoved()
            if (r4 != 0) goto L3c
            long r4 = r3.getItemId()
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 != 0) goto L3c
            androidx.recyclerview.widget.ChildHelper r1 = r7.mChildHelper
            android.view.View r4 = r3.itemView
            boolean r1 = r1.isHidden(r4)
            if (r1 == 0) goto L3b
            r1 = r3
            goto L3c
        L3b:
            return r3
        L3c:
            int r2 = r2 + 1
            goto L13
        L3f:
            return r1
    }

    @androidx.annotation.Nullable
    public androidx.recyclerview.widget.RecyclerView.ViewHolder findViewHolderForLayoutPosition(int r2) {
            r1 = this;
            r0 = 0
            androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = r1.findViewHolderForPosition(r2, r0)
            return r2
    }

    @androidx.annotation.Nullable
    @java.lang.Deprecated
    public androidx.recyclerview.widget.RecyclerView.ViewHolder findViewHolderForPosition(int r2) {
            r1 = this;
            r0 = 0
            androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = r1.findViewHolderForPosition(r2, r0)
            return r2
    }

    @androidx.annotation.Nullable
    androidx.recyclerview.widget.RecyclerView.ViewHolder findViewHolderForPosition(int r6, boolean r7) {
            r5 = this;
            androidx.recyclerview.widget.ChildHelper r0 = r5.mChildHelper
            int r0 = r0.getUnfilteredChildCount()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.ChildHelper r3 = r5.mChildHelper
            android.view.View r3 = r3.getUnfilteredChildAt(r2)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = getChildViewHolderInt(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.isRemoved()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.mPosition
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.getLayoutPosition()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.ChildHelper r1 = r5.mChildHelper
            android.view.View r4 = r3.itemView
            boolean r1 = r1.isHidden(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
    }

    public boolean fling(int r8, int r9) {
            r7 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r7.mLayout
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r2 = r7.mLayoutSuppressed
            if (r2 == 0) goto Lb
            return r1
        Lb:
            boolean r0 = r0.canScrollHorizontally()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r2 = r7.mLayout
            boolean r2 = r2.canScrollVertically()
            if (r0 == 0) goto L1f
            int r3 = java.lang.Math.abs(r8)
            int r4 = r7.mMinFlingVelocity
            if (r3 >= r4) goto L20
        L1f:
            r8 = 0
        L20:
            if (r2 == 0) goto L2a
            int r3 = java.lang.Math.abs(r9)
            int r4 = r7.mMinFlingVelocity
            if (r3 >= r4) goto L2b
        L2a:
            r9 = 0
        L2b:
            if (r8 != 0) goto L30
            if (r9 != 0) goto L30
            return r1
        L30:
            r3 = 0
            if (r8 == 0) goto L73
            android.widget.EdgeEffect r4 = r7.mLeftGlow
            if (r4 == 0) goto L55
            float r4 = androidx.core.widget.EdgeEffectCompat.getDistance(r4)
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 == 0) goto L55
            android.widget.EdgeEffect r4 = r7.mLeftGlow
            int r5 = -r8
            int r6 = r7.getWidth()
            boolean r4 = r7.shouldAbsorb(r4, r5, r6)
            if (r4 == 0) goto L52
            android.widget.EdgeEffect r8 = r7.mLeftGlow
            r8.onAbsorb(r5)
        L51:
            r8 = 0
        L52:
            r4 = r8
            r8 = 0
            goto L74
        L55:
            android.widget.EdgeEffect r4 = r7.mRightGlow
            if (r4 == 0) goto L73
            float r4 = androidx.core.widget.EdgeEffectCompat.getDistance(r4)
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 == 0) goto L73
            android.widget.EdgeEffect r4 = r7.mRightGlow
            int r5 = r7.getWidth()
            boolean r4 = r7.shouldAbsorb(r4, r8, r5)
            if (r4 == 0) goto L52
            android.widget.EdgeEffect r4 = r7.mRightGlow
            r4.onAbsorb(r8)
            goto L51
        L73:
            r4 = 0
        L74:
            if (r9 == 0) goto Lb5
            android.widget.EdgeEffect r5 = r7.mTopGlow
            if (r5 == 0) goto L97
            float r5 = androidx.core.widget.EdgeEffectCompat.getDistance(r5)
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 == 0) goto L97
            android.widget.EdgeEffect r3 = r7.mTopGlow
            int r5 = -r9
            int r6 = r7.getHeight()
            boolean r3 = r7.shouldAbsorb(r3, r5, r6)
            if (r3 == 0) goto L95
            android.widget.EdgeEffect r9 = r7.mTopGlow
            r9.onAbsorb(r5)
        L94:
            r9 = 0
        L95:
            r3 = 0
            goto Lb7
        L97:
            android.widget.EdgeEffect r5 = r7.mBottomGlow
            if (r5 == 0) goto Lb5
            float r5 = androidx.core.widget.EdgeEffectCompat.getDistance(r5)
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 == 0) goto Lb5
            android.widget.EdgeEffect r3 = r7.mBottomGlow
            int r5 = r7.getHeight()
            boolean r3 = r7.shouldAbsorb(r3, r9, r5)
            if (r3 == 0) goto L95
            android.widget.EdgeEffect r3 = r7.mBottomGlow
            r3.onAbsorb(r9)
            goto L94
        Lb5:
            r3 = r9
            r9 = 0
        Lb7:
            if (r4 != 0) goto Lbb
            if (r9 == 0) goto Ld6
        Lbb:
            int r5 = r7.mMaxFlingVelocity
            int r6 = -r5
            int r4 = java.lang.Math.min(r4, r5)
            int r4 = java.lang.Math.max(r6, r4)
            int r5 = r7.mMaxFlingVelocity
            int r6 = -r5
            int r9 = java.lang.Math.min(r9, r5)
            int r9 = java.lang.Math.max(r6, r9)
            androidx.recyclerview.widget.RecyclerView$ViewFlinger r5 = r7.mViewFlinger
            r5.fling(r4, r9)
        Ld6:
            r5 = 1
            if (r8 != 0) goto Le2
            if (r3 != 0) goto Le2
            if (r4 != 0) goto Le1
            if (r9 == 0) goto Le0
            goto Le1
        Le0:
            return r1
        Le1:
            return r5
        Le2:
            float r9 = (float) r8
            float r4 = (float) r3
            boolean r6 = r7.dispatchNestedPreFling(r9, r4)
            if (r6 != 0) goto L125
            if (r0 != 0) goto Lf1
            if (r2 == 0) goto Lef
            goto Lf1
        Lef:
            r6 = 0
            goto Lf2
        Lf1:
            r6 = 1
        Lf2:
            r7.dispatchNestedFling(r9, r4, r6)
            androidx.recyclerview.widget.RecyclerView$OnFlingListener r9 = r7.mOnFlingListener
            if (r9 == 0) goto L100
            boolean r9 = r9.onFling(r8, r3)
            if (r9 == 0) goto L100
            return r5
        L100:
            if (r6 == 0) goto L125
            if (r2 == 0) goto L106
            r0 = r0 | 2
        L106:
            r7.startNestedScroll(r0, r5)
            int r9 = r7.mMaxFlingVelocity
            int r0 = -r9
            int r8 = java.lang.Math.min(r8, r9)
            int r8 = java.lang.Math.max(r0, r8)
            int r9 = r7.mMaxFlingVelocity
            int r0 = -r9
            int r9 = java.lang.Math.min(r3, r9)
            int r9 = java.lang.Math.max(r0, r9)
            androidx.recyclerview.widget.RecyclerView$ViewFlinger r0 = r7.mViewFlinger
            r0.fling(r8, r9)
            return r5
        L125:
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public android.view.View focusSearch(android.view.View r9, int r10) {
            r8 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r8.mLayout
            android.view.View r0 = r0.onInterceptFocusSearch(r9, r10)
            if (r0 == 0) goto L9
            return r0
        L9:
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r8.mAdapter
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1f
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r8.mLayout
            if (r0 == 0) goto L1f
            boolean r0 = r8.isComputingLayout()
            if (r0 != 0) goto L1f
            boolean r0 = r8.mLayoutSuppressed
            if (r0 != 0) goto L1f
            r0 = 1
            goto L20
        L1f:
            r0 = 0
        L20:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            r4 = 0
            if (r0 == 0) goto L9b
            r5 = 2
            if (r10 == r5) goto L2c
            if (r10 != r1) goto L9b
        L2c:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r8.mLayout
            boolean r0 = r0.canScrollVertically()
            if (r0 == 0) goto L4a
            if (r10 != r5) goto L39
            r0 = 130(0x82, float:1.82E-43)
            goto L3b
        L39:
            r0 = 33
        L3b:
            android.view.View r6 = r3.findNextFocus(r8, r9, r0)
            if (r6 != 0) goto L43
            r6 = 1
            goto L44
        L43:
            r6 = 0
        L44:
            boolean r7 = androidx.recyclerview.widget.RecyclerView.FORCE_ABS_FOCUS_SEARCH_DIRECTION
            if (r7 == 0) goto L4b
            r10 = r0
            goto L4b
        L4a:
            r6 = 0
        L4b:
            if (r6 != 0) goto L7b
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r8.mLayout
            boolean r0 = r0.canScrollHorizontally()
            if (r0 == 0) goto L7b
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r8.mLayout
            int r0 = r0.getLayoutDirection()
            if (r0 != r1) goto L5f
            r0 = 1
            goto L60
        L5f:
            r0 = 0
        L60:
            if (r10 != r5) goto L64
            r5 = 1
            goto L65
        L64:
            r5 = 0
        L65:
            r0 = r0 ^ r5
            if (r0 == 0) goto L6b
            r0 = 66
            goto L6d
        L6b:
            r0 = 17
        L6d:
            android.view.View r5 = r3.findNextFocus(r8, r9, r0)
            if (r5 != 0) goto L74
            goto L75
        L74:
            r1 = 0
        L75:
            boolean r5 = androidx.recyclerview.widget.RecyclerView.FORCE_ABS_FOCUS_SEARCH_DIRECTION
            if (r5 == 0) goto L7a
            r10 = r0
        L7a:
            r6 = r1
        L7b:
            if (r6 == 0) goto L96
            r8.consumePendingUpdateOperations()
            android.view.View r0 = r8.findContainingItemView(r9)
            if (r0 != 0) goto L87
            return r4
        L87:
            r8.startInterceptRequestLayout()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r8.mLayout
            androidx.recyclerview.widget.RecyclerView$Recycler r1 = r8.mRecycler
            androidx.recyclerview.widget.RecyclerView$State r5 = r8.mState
            r0.onFocusSearchFailed(r9, r10, r1, r5)
            r8.stopInterceptRequestLayout(r2)
        L96:
            android.view.View r0 = r3.findNextFocus(r8, r9, r10)
            goto Lbf
        L9b:
            android.view.View r1 = r3.findNextFocus(r8, r9, r10)
            if (r1 != 0) goto Lbe
            if (r0 == 0) goto Lbe
            r8.consumePendingUpdateOperations()
            android.view.View r0 = r8.findContainingItemView(r9)
            if (r0 != 0) goto Lad
            return r4
        Lad:
            r8.startInterceptRequestLayout()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r8.mLayout
            androidx.recyclerview.widget.RecyclerView$Recycler r1 = r8.mRecycler
            androidx.recyclerview.widget.RecyclerView$State r3 = r8.mState
            android.view.View r0 = r0.onFocusSearchFailed(r9, r10, r1, r3)
            r8.stopInterceptRequestLayout(r2)
            goto Lbf
        Lbe:
            r0 = r1
        Lbf:
            if (r0 == 0) goto Ld6
            boolean r1 = r0.hasFocusable()
            if (r1 != 0) goto Ld6
            android.view.View r1 = r8.getFocusedChild()
            if (r1 != 0) goto Ld2
            android.view.View r9 = super.focusSearch(r9, r10)
            return r9
        Ld2:
            r8.requestChildOnScreen(r0, r4)
            return r9
        Ld6:
            boolean r1 = r8.isPreferredNextFocus(r9, r0, r10)
            if (r1 == 0) goto Ldd
            return r0
        Ldd:
            android.view.View r9 = super.focusSearch(r9, r10)
            return r9
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r3 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r3.mLayout
            if (r0 == 0) goto L9
            androidx.recyclerview.widget.RecyclerView$LayoutParams r0 = r0.generateDefaultLayoutParams()
            return r0
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "RecyclerView has no LayoutManager"
            r1.append(r2)
            java.lang.String r2 = r3.exceptionLabel()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r2.mLayout
            if (r0 == 0) goto Ld
            android.content.Context r1 = r2.getContext()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r3 = r0.generateLayoutParams(r1, r3)
            return r3
        Ld:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "RecyclerView has no LayoutManager"
            r0.append(r1)
            java.lang.String r1 = r2.exceptionLabel()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r3) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r2.mLayout
            if (r0 == 0) goto L9
            androidx.recyclerview.widget.RecyclerView$LayoutParams r3 = r0.generateLayoutParams(r3)
            return r3
        L9:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "RecyclerView has no LayoutManager"
            r0.append(r1)
            java.lang.String r1 = r2.exceptionLabel()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    @Override // android.view.ViewGroup, android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
            r1 = this;
            java.lang.String r0 = "androidx.recyclerview.widget.RecyclerView"
            return r0
    }

    @androidx.annotation.Nullable
    public androidx.recyclerview.widget.RecyclerView.Adapter getAdapter() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r1.mAdapter
            return r0
    }

    int getAdapterPositionInRecyclerView(androidx.recyclerview.widget.RecyclerView.ViewHolder r2) {
            r1 = this;
            r0 = 524(0x20c, float:7.34E-43)
            boolean r0 = r2.hasAnyOfTheFlags(r0)
            if (r0 != 0) goto L18
            boolean r0 = r2.isBound()
            if (r0 != 0) goto Lf
            goto L18
        Lf:
            androidx.recyclerview.widget.AdapterHelper r0 = r1.mAdapterHelper
            int r2 = r2.mPosition
            int r2 = r0.applyPendingUpdatesToPosition(r2)
            return r2
        L18:
            r2 = -1
            return r2
    }

    @Override // android.view.View
    public int getBaseline() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r1.mLayout
            if (r0 == 0) goto L9
            int r0 = r0.getBaseline()
            return r0
        L9:
            int r0 = super.getBaseline()
            return r0
    }

    long getChangedHolderKey(androidx.recyclerview.widget.RecyclerView.ViewHolder r3) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r2.mAdapter
            boolean r0 = r0.hasStableIds()
            if (r0 == 0) goto Ld
            long r0 = r3.getItemId()
            return r0
        Ld:
            int r3 = r3.mPosition
            long r0 = (long) r3
            return r0
    }

    public int getChildAdapterPosition(@androidx.annotation.NonNull android.view.View r1) {
            r0 = this;
            androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = getChildViewHolderInt(r1)
            if (r1 == 0) goto Lb
            int r1 = r1.getAbsoluteAdapterPosition()
            return r1
        Lb:
            r1 = -1
            return r1
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int r2, int r3) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$ChildDrawingOrderCallback r0 = r1.mChildDrawingOrderCallback
            if (r0 != 0) goto L9
            int r2 = super.getChildDrawingOrder(r2, r3)
            return r2
        L9:
            int r2 = r0.onGetChildDrawingOrder(r2, r3)
            return r2
    }

    public long getChildItemId(@androidx.annotation.NonNull android.view.View r4) {
            r3 = this;
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r3.mAdapter
            r1 = -1
            if (r0 == 0) goto L18
            boolean r0 = r0.hasStableIds()
            if (r0 != 0) goto Ld
            goto L18
        Ld:
            androidx.recyclerview.widget.RecyclerView$ViewHolder r4 = getChildViewHolderInt(r4)
            if (r4 == 0) goto L18
            long r0 = r4.getItemId()
            return r0
        L18:
            return r1
    }

    public int getChildLayoutPosition(@androidx.annotation.NonNull android.view.View r1) {
            r0 = this;
            androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = getChildViewHolderInt(r1)
            if (r1 == 0) goto Lb
            int r1 = r1.getLayoutPosition()
            return r1
        Lb:
            r1 = -1
            return r1
    }

    @java.lang.Deprecated
    public int getChildPosition(@androidx.annotation.NonNull android.view.View r1) {
            r0 = this;
            int r1 = r0.getChildAdapterPosition(r1)
            return r1
    }

    public androidx.recyclerview.widget.RecyclerView.ViewHolder getChildViewHolder(@androidx.annotation.NonNull android.view.View r4) {
            r3 = this;
            android.view.ViewParent r0 = r4.getParent()
            if (r0 == 0) goto L28
            if (r0 != r3) goto L9
            goto L28
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "View "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " is not a direct child of "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L28:
            androidx.recyclerview.widget.RecyclerView$ViewHolder r4 = getChildViewHolderInt(r4)
            return r4
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
            r1 = this;
            boolean r0 = r1.mClipToPadding
            return r0
    }

    @androidx.annotation.Nullable
    public androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate getCompatAccessibilityDelegate() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate r0 = r1.mAccessibilityDelegate
            return r0
    }

    public void getDecoratedBoundsWithMargins(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.NonNull android.graphics.Rect r2) {
            r0 = this;
            getDecoratedBoundsWithMarginsInt(r1, r2)
            return
    }

    @androidx.annotation.NonNull
    public androidx.recyclerview.widget.RecyclerView.EdgeEffectFactory getEdgeEffectFactory() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$EdgeEffectFactory r0 = r1.mEdgeEffectFactory
            return r0
    }

    @androidx.annotation.Nullable
    public androidx.recyclerview.widget.RecyclerView.ItemAnimator getItemAnimator() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$ItemAnimator r0 = r1.mItemAnimator
            return r0
    }

    android.graphics.Rect getItemDecorInsetsForChild(android.view.View r9) {
            r8 = this;
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r0 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r0
            boolean r1 = r0.mInsetsDirty
            if (r1 != 0) goto Ld
            android.graphics.Rect r9 = r0.mDecorInsets
            return r9
        Ld:
            androidx.recyclerview.widget.RecyclerView$State r1 = r8.mState
            boolean r1 = r1.isPreLayout()
            if (r1 == 0) goto L24
            boolean r1 = r0.isItemChanged()
            if (r1 != 0) goto L21
            boolean r1 = r0.isViewInvalid()
            if (r1 == 0) goto L24
        L21:
            android.graphics.Rect r9 = r0.mDecorInsets
            return r9
        L24:
            android.graphics.Rect r1 = r0.mDecorInsets
            r2 = 0
            r1.set(r2, r2, r2, r2)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ItemDecoration> r3 = r8.mItemDecorations
            int r3 = r3.size()
            r4 = 0
        L31:
            if (r4 >= r3) goto L68
            android.graphics.Rect r5 = r8.mTempRect
            r5.set(r2, r2, r2, r2)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ItemDecoration> r5 = r8.mItemDecorations
            java.lang.Object r5 = r5.get(r4)
            androidx.recyclerview.widget.RecyclerView$ItemDecoration r5 = (androidx.recyclerview.widget.RecyclerView.ItemDecoration) r5
            android.graphics.Rect r6 = r8.mTempRect
            androidx.recyclerview.widget.RecyclerView$State r7 = r8.mState
            r5.getItemOffsets(r6, r9, r8, r7)
            int r5 = r1.left
            android.graphics.Rect r6 = r8.mTempRect
            int r7 = r6.left
            int r5 = r5 + r7
            r1.left = r5
            int r5 = r1.top
            int r7 = r6.top
            int r5 = r5 + r7
            r1.top = r5
            int r5 = r1.right
            int r7 = r6.right
            int r5 = r5 + r7
            r1.right = r5
            int r5 = r1.bottom
            int r6 = r6.bottom
            int r5 = r5 + r6
            r1.bottom = r5
            int r4 = r4 + 1
            goto L31
        L68:
            r0.mInsetsDirty = r2
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.recyclerview.widget.RecyclerView.ItemDecoration getItemDecorationAt(int r4) {
            r3 = this;
            int r0 = r3.getItemDecorationCount()
            if (r4 < 0) goto L11
            if (r4 >= r0) goto L11
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ItemDecoration> r0 = r3.mItemDecorations
            java.lang.Object r4 = r0.get(r4)
            androidx.recyclerview.widget.RecyclerView$ItemDecoration r4 = (androidx.recyclerview.widget.RecyclerView.ItemDecoration) r4
            return r4
        L11:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            java.lang.String r4 = " is an invalid index for size "
            r2.append(r4)
            r2.append(r0)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4)
            throw r1
    }

    public int getItemDecorationCount() {
            r1 = this;
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ItemDecoration> r0 = r1.mItemDecorations
            int r0 = r0.size()
            return r0
    }

    @androidx.annotation.Nullable
    public androidx.recyclerview.widget.RecyclerView.LayoutManager getLayoutManager() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r1.mLayout
            return r0
    }

    public int getMaxFlingVelocity() {
            r1 = this;
            int r0 = r1.mMaxFlingVelocity
            return r0
    }

    public int getMinFlingVelocity() {
            r1 = this;
            int r0 = r1.mMinFlingVelocity
            return r0
    }

    long getNanoTime() {
            r2 = this;
            boolean r0 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
            if (r0 == 0) goto L9
            long r0 = java.lang.System.nanoTime()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @androidx.annotation.Nullable
    public androidx.recyclerview.widget.RecyclerView.OnFlingListener getOnFlingListener() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$OnFlingListener r0 = r1.mOnFlingListener
            return r0
    }

    public boolean getPreserveFocusAfterLayout() {
            r1 = this;
            boolean r0 = r1.mPreserveFocusAfterLayout
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.recyclerview.widget.RecyclerView.RecycledViewPool getRecycledViewPool() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$Recycler r0 = r1.mRecycler
            androidx.recyclerview.widget.RecyclerView$RecycledViewPool r0 = r0.getRecycledViewPool()
            return r0
    }

    public int getScrollState() {
            r1 = this;
            int r0 = r1.mScrollState
            return r0
    }

    public boolean hasFixedSize() {
            r1 = this;
            boolean r0 = r1.mHasFixedSize
            return r0
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.getScrollingChildHelper()
            boolean r0 = r0.hasNestedScrollingParent()
            return r0
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean hasNestedScrollingParent(int r2) {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.getScrollingChildHelper()
            boolean r2 = r0.hasNestedScrollingParent(r2)
            return r2
    }

    public boolean hasPendingAdapterUpdates() {
            r1 = this;
            boolean r0 = r1.mFirstLayoutComplete
            if (r0 == 0) goto L13
            boolean r0 = r1.mDataSetHasChangedAfterLayout
            if (r0 != 0) goto L13
            androidx.recyclerview.widget.AdapterHelper r0 = r1.mAdapterHelper
            boolean r0 = r0.hasPendingUpdates()
            if (r0 == 0) goto L11
            goto L13
        L11:
            r0 = 0
            return r0
        L13:
            r0 = 1
            return r0
    }

    void initAdapterManager() {
            r2 = this;
            androidx.recyclerview.widget.AdapterHelper r0 = new androidx.recyclerview.widget.AdapterHelper
            androidx.recyclerview.widget.RecyclerView$6 r1 = new androidx.recyclerview.widget.RecyclerView$6
            r1.<init>(r2)
            r0.<init>(r1)
            r2.mAdapterHelper = r0
            return
    }

    @androidx.annotation.VisibleForTesting
    void initFastScroller(android.graphics.drawable.StateListDrawable r11, android.graphics.drawable.Drawable r12, android.graphics.drawable.StateListDrawable r13, android.graphics.drawable.Drawable r14) {
            r10 = this;
            if (r11 == 0) goto L2d
            if (r12 == 0) goto L2d
            if (r13 == 0) goto L2d
            if (r14 == 0) goto L2d
            android.content.Context r0 = r10.getContext()
            android.content.res.Resources r0 = r0.getResources()
            androidx.recyclerview.widget.FastScroller r1 = new androidx.recyclerview.widget.FastScroller
            int r2 = androidx.recyclerview.R.dimen.fastscroll_default_thickness
            int r7 = r0.getDimensionPixelSize(r2)
            int r2 = androidx.recyclerview.R.dimen.fastscroll_minimum_range
            int r8 = r0.getDimensionPixelSize(r2)
            int r2 = androidx.recyclerview.R.dimen.fastscroll_margin
            int r9 = r0.getDimensionPixelOffset(r2)
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L2d:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Trying to set fast scroller without both required drawables."
            r12.append(r13)
            java.lang.String r13 = r10.exceptionLabel()
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
    }

    void invalidateGlows() {
            r1 = this;
            r0 = 0
            r1.mBottomGlow = r0
            r1.mTopGlow = r0
            r1.mRightGlow = r0
            r1.mLeftGlow = r0
            return
    }

    public void invalidateItemDecorations() {
            r2 = this;
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ItemDecoration> r0 = r2.mItemDecorations
            int r0 = r0.size()
            if (r0 != 0) goto L9
            return
        L9:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r2.mLayout
            if (r0 == 0) goto L12
            java.lang.String r1 = "Cannot invalidate item decorations during a scroll or layout"
            r0.assertNotInLayoutOrScroll(r1)
        L12:
            r2.markItemDecorInsetsDirty()
            r2.requestLayout()
            return
    }

    boolean isAccessibilityEnabled() {
            r1 = this;
            android.view.accessibility.AccessibilityManager r0 = r1.mAccessibilityManager
            if (r0 == 0) goto Lc
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public boolean isAnimating() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$ItemAnimator r0 = r1.mItemAnimator
            if (r0 == 0) goto Lc
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
            r1 = this;
            boolean r0 = r1.mIsAttached
            return r0
    }

    public boolean isComputingLayout() {
            r1 = this;
            int r0 = r1.mLayoutOrScrollCounter
            if (r0 <= 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @java.lang.Deprecated
    public boolean isLayoutFrozen() {
            r1 = this;
            boolean r0 = r1.isLayoutSuppressed()
            return r0
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
            r1 = this;
            boolean r0 = r1.mLayoutSuppressed
            return r0
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.getScrollingChildHelper()
            boolean r0 = r0.isNestedScrollingEnabled()
            return r0
    }

    void jumpToPositionForSmoothScroller(int r2) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r1.mLayout
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 2
            r1.setScrollState(r0)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r1.mLayout
            r0.scrollToPosition(r2)
            r1.awakenScrollBars()
            return
    }

    void markItemDecorInsetsDirty() {
            r4 = this;
            androidx.recyclerview.widget.ChildHelper r0 = r4.mChildHelper
            int r0 = r0.getUnfilteredChildCount()
            r1 = 0
        L7:
            if (r1 >= r0) goto L1b
            androidx.recyclerview.widget.ChildHelper r2 = r4.mChildHelper
            android.view.View r2 = r2.getUnfilteredChildAt(r1)
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r2 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r2
            r3 = 1
            r2.mInsetsDirty = r3
            int r1 = r1 + 1
            goto L7
        L1b:
            androidx.recyclerview.widget.RecyclerView$Recycler r0 = r4.mRecycler
            r0.markItemDecorInsetsDirty()
            return
    }

    void markKnownViewsInvalid() {
            r4 = this;
            androidx.recyclerview.widget.ChildHelper r0 = r4.mChildHelper
            int r0 = r0.getUnfilteredChildCount()
            r1 = 0
        L7:
            if (r1 >= r0) goto L22
            androidx.recyclerview.widget.ChildHelper r2 = r4.mChildHelper
            android.view.View r2 = r2.getUnfilteredChildAt(r1)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = getChildViewHolderInt(r2)
            if (r2 == 0) goto L1f
            boolean r3 = r2.shouldIgnore()
            if (r3 != 0) goto L1f
            r3 = 6
            r2.addFlags(r3)
        L1f:
            int r1 = r1 + 1
            goto L7
        L22:
            r4.markItemDecorInsetsDirty()
            androidx.recyclerview.widget.RecyclerView$Recycler r0 = r4.mRecycler
            r0.markKnownViewsInvalid()
            return
    }

    public void nestedScrollBy(int r3, int r4) {
            r2 = this;
            r0 = 0
            r1 = 1
            r2.nestedScrollByInternal(r3, r4, r0, r1)
            return
    }

    public void offsetChildrenHorizontal(@androidx.annotation.Px int r4) {
            r3 = this;
            androidx.recyclerview.widget.ChildHelper r0 = r3.mChildHelper
            int r0 = r0.getChildCount()
            r1 = 0
        L7:
            if (r1 >= r0) goto L15
            androidx.recyclerview.widget.ChildHelper r2 = r3.mChildHelper
            android.view.View r2 = r2.getChildAt(r1)
            r2.offsetLeftAndRight(r4)
            int r1 = r1 + 1
            goto L7
        L15:
            return
    }

    public void offsetChildrenVertical(@androidx.annotation.Px int r4) {
            r3 = this;
            androidx.recyclerview.widget.ChildHelper r0 = r3.mChildHelper
            int r0 = r0.getChildCount()
            r1 = 0
        L7:
            if (r1 >= r0) goto L15
            androidx.recyclerview.widget.ChildHelper r2 = r3.mChildHelper
            android.view.View r2 = r2.getChildAt(r1)
            r2.offsetTopAndBottom(r4)
            int r1 = r1 + 1
            goto L7
        L15:
            return
    }

    void offsetPositionRecordsForInsert(int r6, int r7) {
            r5 = this;
            androidx.recyclerview.widget.ChildHelper r0 = r5.mChildHelper
            int r0 = r0.getUnfilteredChildCount()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L2b
            androidx.recyclerview.widget.ChildHelper r3 = r5.mChildHelper
            android.view.View r3 = r3.getUnfilteredChildAt(r2)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = getChildViewHolderInt(r3)
            if (r3 == 0) goto L28
            boolean r4 = r3.shouldIgnore()
            if (r4 != 0) goto L28
            int r4 = r3.mPosition
            if (r4 < r6) goto L28
            r3.offsetPosition(r7, r1)
            androidx.recyclerview.widget.RecyclerView$State r3 = r5.mState
            r4 = 1
            r3.mStructureChanged = r4
        L28:
            int r2 = r2 + 1
            goto L8
        L2b:
            androidx.recyclerview.widget.RecyclerView$Recycler r0 = r5.mRecycler
            r0.offsetPositionRecordsForInsert(r6, r7)
            r5.requestLayout()
            return
    }

    void offsetPositionRecordsForMove(int r10, int r11) {
            r9 = this;
            androidx.recyclerview.widget.ChildHelper r0 = r9.mChildHelper
            int r0 = r0.getUnfilteredChildCount()
            r1 = 1
            if (r10 >= r11) goto Ld
            r2 = -1
            r3 = r10
            r4 = r11
            goto L10
        Ld:
            r4 = r10
            r3 = r11
            r2 = 1
        L10:
            r5 = 0
            r6 = 0
        L12:
            if (r6 >= r0) goto L39
            androidx.recyclerview.widget.ChildHelper r7 = r9.mChildHelper
            android.view.View r7 = r7.getUnfilteredChildAt(r6)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r7 = getChildViewHolderInt(r7)
            if (r7 == 0) goto L36
            int r8 = r7.mPosition
            if (r8 < r3) goto L36
            if (r8 <= r4) goto L27
            goto L36
        L27:
            if (r8 != r10) goto L2f
            int r8 = r11 - r10
            r7.offsetPosition(r8, r5)
            goto L32
        L2f:
            r7.offsetPosition(r2, r5)
        L32:
            androidx.recyclerview.widget.RecyclerView$State r7 = r9.mState
            r7.mStructureChanged = r1
        L36:
            int r6 = r6 + 1
            goto L12
        L39:
            androidx.recyclerview.widget.RecyclerView$Recycler r0 = r9.mRecycler
            r0.offsetPositionRecordsForMove(r10, r11)
            r9.requestLayout()
            return
    }

    void offsetPositionRecordsForRemove(int r8, int r9, boolean r10) {
            r7 = this;
            int r0 = r8 + r9
            androidx.recyclerview.widget.ChildHelper r1 = r7.mChildHelper
            int r1 = r1.getUnfilteredChildCount()
            r2 = 0
        L9:
            if (r2 >= r1) goto L3a
            androidx.recyclerview.widget.ChildHelper r3 = r7.mChildHelper
            android.view.View r3 = r3.getUnfilteredChildAt(r2)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = getChildViewHolderInt(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.shouldIgnore()
            if (r4 != 0) goto L37
            int r4 = r3.mPosition
            r5 = 1
            if (r4 < r0) goto L2b
            int r4 = -r9
            r3.offsetPosition(r4, r10)
            androidx.recyclerview.widget.RecyclerView$State r3 = r7.mState
            r3.mStructureChanged = r5
            goto L37
        L2b:
            if (r4 < r8) goto L37
            int r4 = r8 + (-1)
            int r6 = -r9
            r3.flagRemovedAndOffsetPosition(r4, r6, r10)
            androidx.recyclerview.widget.RecyclerView$State r3 = r7.mState
            r3.mStructureChanged = r5
        L37:
            int r2 = r2 + 1
            goto L9
        L3a:
            androidx.recyclerview.widget.RecyclerView$Recycler r0 = r7.mRecycler
            r0.offsetPositionRecordsForRemove(r8, r9, r10)
            r7.requestLayout()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.mLayoutOrScrollCounter = r0
            r1 = 1
            r5.mIsAttached = r1
            boolean r2 = r5.mFirstLayoutComplete
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            goto L15
        L14:
            r1 = 0
        L15:
            r5.mFirstLayoutComplete = r1
            androidx.recyclerview.widget.RecyclerView$Recycler r1 = r5.mRecycler
            r1.onAttachedToWindow()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r5.mLayout
            if (r1 == 0) goto L23
            r1.dispatchAttachedToWindow(r5)
        L23:
            r5.mPostedAnimatorRunner = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
            if (r0 == 0) goto L66
            java.lang.ThreadLocal<androidx.recyclerview.widget.GapWorker> r0 = androidx.recyclerview.widget.GapWorker.sGapWorker
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.GapWorker r1 = (androidx.recyclerview.widget.GapWorker) r1
            r5.mGapWorker = r1
            if (r1 != 0) goto L61
            androidx.recyclerview.widget.GapWorker r1 = new androidx.recyclerview.widget.GapWorker
            r1.<init>()
            r5.mGapWorker = r1
            android.view.Display r1 = androidx.core.view.ViewCompat.getDisplay(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L53
            if (r1 == 0) goto L53
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L53
            goto L55
        L53:
            r1 = 1114636288(0x42700000, float:60.0)
        L55:
            androidx.recyclerview.widget.GapWorker r2 = r5.mGapWorker
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.mFrameIntervalNs = r3
            r0.set(r2)
        L61:
            androidx.recyclerview.widget.GapWorker r0 = r5.mGapWorker
            r0.add(r5)
        L66:
            return
    }

    public void onChildAttachedToWindow(@androidx.annotation.NonNull android.view.View r1) {
            r0 = this;
            return
    }

    public void onChildDetachedFromWindow(@androidx.annotation.NonNull android.view.View r1) {
            r0 = this;
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r2 = this;
            super.onDetachedFromWindow()
            androidx.recyclerview.widget.RecyclerView$ItemAnimator r0 = r2.mItemAnimator
            if (r0 == 0) goto La
            r0.endAnimations()
        La:
            r2.stopScroll()
            r0 = 0
            r2.mIsAttached = r0
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r2.mLayout
            if (r0 == 0) goto L19
            androidx.recyclerview.widget.RecyclerView$Recycler r1 = r2.mRecycler
            r0.dispatchDetachedFromWindow(r2, r1)
        L19:
            java.util.List<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r2.mPendingAccessibilityImportanceChange
            r0.clear()
            java.lang.Runnable r0 = r2.mItemAnimatorRunner
            r2.removeCallbacks(r0)
            androidx.recyclerview.widget.ViewInfoStore r0 = r2.mViewInfoStore
            r0.onDetach()
            androidx.recyclerview.widget.RecyclerView$Recycler r0 = r2.mRecycler
            r0.onDetachedFromWindow()
            androidx.customview.poolingcontainer.PoolingContainer.callPoolingContainerOnReleaseForChildren(r2)
            boolean r0 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
            if (r0 == 0) goto L3e
            androidx.recyclerview.widget.GapWorker r0 = r2.mGapWorker
            if (r0 == 0) goto L3e
            r0.remove(r2)
            r0 = 0
            r2.mGapWorker = r0
        L3e:
            return
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas r5) {
            r4 = this;
            super.onDraw(r5)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ItemDecoration> r0 = r4.mItemDecorations
            int r0 = r0.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L1c
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ItemDecoration> r2 = r4.mItemDecorations
            java.lang.Object r2 = r2.get(r1)
            androidx.recyclerview.widget.RecyclerView$ItemDecoration r2 = (androidx.recyclerview.widget.RecyclerView.ItemDecoration) r2
            androidx.recyclerview.widget.RecyclerView$State r3 = r4.mState
            r2.onDraw(r5, r4, r3)
            int r1 = r1 + 1
            goto La
        L1c:
            return
    }

    void onEnterLayoutOrScroll() {
            r1 = this;
            int r0 = r1.mLayoutOrScrollCounter
            int r0 = r0 + 1
            r1.mLayoutOrScrollCounter = r0
            return
    }

    void onExitLayoutOrScroll() {
            r1 = this;
            r0 = 1
            r1.onExitLayoutOrScroll(r0)
            return
    }

    void onExitLayoutOrScroll(boolean r3) {
            r2 = this;
            int r0 = r2.mLayoutOrScrollCounter
            r1 = 1
            int r0 = r0 - r1
            r2.mLayoutOrScrollCounter = r0
            if (r0 >= r1) goto L13
            r0 = 0
            r2.mLayoutOrScrollCounter = r0
            if (r3 == 0) goto L13
            r2.dispatchContentChangedIfNecessary()
            r2.dispatchPendingImportantForAccessibilityChanges()
        L13:
            return
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r5.mLayout
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.mLayoutSuppressed
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L7a
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r5.mLayout
            boolean r0 = r0.canScrollVertically()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = 0
        L2d:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r5.mLayout
            boolean r3 = r3.canScrollHorizontally()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = 0
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r5.mLayout
            boolean r3 = r3.canScrollVertically()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r5.mLayout
            boolean r3 = r3.canScrollHorizontally()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = 0
            goto L64
        L62:
            r0 = 0
            goto L3c
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L7a
        L6c:
            float r2 = r5.mScaledHorizontalScrollFactor
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.mScaledVerticalScrollFactor
            float r0 = r0 * r3
            int r0 = (int) r0
            r3 = 1
            r5.nestedScrollByInternal(r2, r0, r6, r3)
        L7a:
            return r1
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
            r8 = this;
            boolean r0 = r8.mLayoutSuppressed
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            r0 = 0
            r8.mInterceptingOnItemTouchListener = r0
            boolean r0 = r8.findInterceptingOnItemTouchListener(r9)
            r2 = 1
            if (r0 == 0) goto L14
            r8.cancelScroll()
            return r2
        L14:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r8.mLayout
            if (r0 != 0) goto L19
            return r1
        L19:
            boolean r0 = r0.canScrollHorizontally()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r8.mLayout
            boolean r3 = r3.canScrollVertically()
            android.view.VelocityTracker r4 = r8.mVelocityTracker
            if (r4 != 0) goto L2d
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r8.mVelocityTracker = r4
        L2d:
            android.view.VelocityTracker r4 = r8.mVelocityTracker
            r4.addMovement(r9)
            int r4 = r9.getActionMasked()
            int r5 = r9.getActionIndex()
            r6 = 2
            r7 = 1056964608(0x3f000000, float:0.5)
            if (r4 == 0) goto Lc0
            if (r4 == r2) goto Lb7
            if (r4 == r6) goto L74
            r0 = 3
            if (r4 == r0) goto L6f
            r0 = 5
            if (r4 == r0) goto L53
            r0 = 6
            if (r4 == r0) goto L4e
            goto L104
        L4e:
            r8.onPointerUp(r9)
            goto L104
        L53:
            int r0 = r9.getPointerId(r5)
            r8.mScrollPointerId = r0
            float r0 = r9.getX(r5)
            float r0 = r0 + r7
            int r0 = (int) r0
            r8.mLastTouchX = r0
            r8.mInitialTouchX = r0
            float r9 = r9.getY(r5)
            float r9 = r9 + r7
            int r9 = (int) r9
            r8.mLastTouchY = r9
            r8.mInitialTouchY = r9
            goto L104
        L6f:
            r8.cancelScroll()
            goto L104
        L74:
            int r4 = r8.mScrollPointerId
            int r4 = r9.findPointerIndex(r4)
            if (r4 >= 0) goto L7d
            return r1
        L7d:
            float r5 = r9.getX(r4)
            float r5 = r5 + r7
            int r5 = (int) r5
            float r9 = r9.getY(r4)
            float r9 = r9 + r7
            int r9 = (int) r9
            int r4 = r8.mScrollState
            if (r4 == r2) goto L104
            int r4 = r8.mInitialTouchX
            int r4 = r5 - r4
            int r6 = r8.mInitialTouchY
            int r6 = r9 - r6
            if (r0 == 0) goto La3
            int r0 = java.lang.Math.abs(r4)
            int r4 = r8.mTouchSlop
            if (r0 <= r4) goto La3
            r8.mLastTouchX = r5
            r0 = 1
            goto La4
        La3:
            r0 = 0
        La4:
            if (r3 == 0) goto Lb1
            int r3 = java.lang.Math.abs(r6)
            int r4 = r8.mTouchSlop
            if (r3 <= r4) goto Lb1
            r8.mLastTouchY = r9
            r0 = 1
        Lb1:
            if (r0 == 0) goto L104
            r8.setScrollState(r2)
            goto L104
        Lb7:
            android.view.VelocityTracker r9 = r8.mVelocityTracker
            r9.clear()
            r8.stopNestedScroll(r1)
            goto L104
        Lc0:
            boolean r4 = r8.mIgnoreMotionEventTillDown
            if (r4 == 0) goto Lc6
            r8.mIgnoreMotionEventTillDown = r1
        Lc6:
            int r4 = r9.getPointerId(r1)
            r8.mScrollPointerId = r4
            float r4 = r9.getX()
            float r4 = r4 + r7
            int r4 = (int) r4
            r8.mLastTouchX = r4
            r8.mInitialTouchX = r4
            float r4 = r9.getY()
            float r4 = r4 + r7
            int r4 = (int) r4
            r8.mLastTouchY = r4
            r8.mInitialTouchY = r4
            boolean r9 = r8.stopGlowAnimations(r9)
            if (r9 != 0) goto Lea
            int r9 = r8.mScrollState
            if (r9 != r6) goto Lf7
        Lea:
            android.view.ViewParent r9 = r8.getParent()
            r9.requestDisallowInterceptTouchEvent(r2)
            r8.setScrollState(r2)
            r8.stopNestedScroll(r2)
        Lf7:
            int[] r9 = r8.mNestedOffsets
            r9[r2] = r1
            r9[r1] = r1
            if (r3 == 0) goto L101
            r0 = r0 | 2
        L101:
            r8.startNestedScroll(r0, r1)
        L104:
            int r9 = r8.mScrollState
            if (r9 != r2) goto L109
            return r2
        L109:
            return r1
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            java.lang.String r1 = "RV OnLayout"
            androidx.core.os.TraceCompat.beginSection(r1)
            r0.dispatchLayout()
            androidx.core.os.TraceCompat.endSection()
            r1 = 1
            r0.mFirstLayoutComplete = r1
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r8, int r9) {
            r7 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r7.mLayout
            if (r0 != 0) goto L8
            r7.defaultOnMeasure(r8, r9)
            return
        L8:
            boolean r0 = r0.isAutoMeasureEnabled()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L81
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            int r3 = android.view.View.MeasureSpec.getMode(r9)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r4 = r7.mLayout
            androidx.recyclerview.widget.RecyclerView$Recycler r5 = r7.mRecycler
            androidx.recyclerview.widget.RecyclerView$State r6 = r7.mState
            r4.onMeasure(r5, r6, r8, r9)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r0 != r4) goto L28
            if (r3 != r4) goto L28
            r2 = 1
        L28:
            r7.mLastAutoMeasureSkippedDueToExact = r2
            if (r2 != 0) goto L80
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r7.mAdapter
            if (r0 != 0) goto L31
            goto L80
        L31:
            androidx.recyclerview.widget.RecyclerView$State r0 = r7.mState
            int r0 = r0.mLayoutStep
            if (r0 != r1) goto L3a
            r7.dispatchLayoutStep1()
        L3a:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r7.mLayout
            r0.setMeasureSpecs(r8, r9)
            androidx.recyclerview.widget.RecyclerView$State r0 = r7.mState
            r0.mIsMeasuring = r1
            r7.dispatchLayoutStep2()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r7.mLayout
            r0.setMeasuredDimensionFromChildren(r8, r9)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r7.mLayout
            boolean r0 = r0.shouldMeasureTwice()
            if (r0 == 0) goto L74
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r7.mLayout
            int r2 = r7.getMeasuredWidth()
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r4)
            int r3 = r7.getMeasuredHeight()
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r4)
            r0.setMeasureSpecs(r2, r3)
            androidx.recyclerview.widget.RecyclerView$State r0 = r7.mState
            r0.mIsMeasuring = r1
            r7.dispatchLayoutStep2()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r7.mLayout
            r0.setMeasuredDimensionFromChildren(r8, r9)
        L74:
            int r8 = r7.getMeasuredWidth()
            r7.mLastAutoMeasureNonExactMeasuredWidth = r8
            int r8 = r7.getMeasuredHeight()
            r7.mLastAutoMeasureNonExactMeasuredHeight = r8
        L80:
            return
        L81:
            boolean r0 = r7.mHasFixedSize
            if (r0 == 0) goto L8f
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r7.mLayout
            androidx.recyclerview.widget.RecyclerView$Recycler r1 = r7.mRecycler
            androidx.recyclerview.widget.RecyclerView$State r2 = r7.mState
            r0.onMeasure(r1, r2, r8, r9)
            return
        L8f:
            boolean r0 = r7.mAdapterUpdateDuringMeasure
            if (r0 == 0) goto Lb7
            r7.startInterceptRequestLayout()
            r7.onEnterLayoutOrScroll()
            r7.processAdapterUpdatesAndSetAnimationFlags()
            r7.onExitLayoutOrScroll()
            androidx.recyclerview.widget.RecyclerView$State r0 = r7.mState
            boolean r3 = r0.mRunPredictiveAnimations
            if (r3 == 0) goto La8
            r0.mInPreLayout = r1
            goto Lb1
        La8:
            androidx.recyclerview.widget.AdapterHelper r0 = r7.mAdapterHelper
            r0.consumeUpdatesInOnePass()
            androidx.recyclerview.widget.RecyclerView$State r0 = r7.mState
            r0.mInPreLayout = r2
        Lb1:
            r7.mAdapterUpdateDuringMeasure = r2
            r7.stopInterceptRequestLayout(r2)
            goto Lc9
        Lb7:
            androidx.recyclerview.widget.RecyclerView$State r0 = r7.mState
            boolean r0 = r0.mRunPredictiveAnimations
            if (r0 == 0) goto Lc9
            int r8 = r7.getMeasuredWidth()
            int r9 = r7.getMeasuredHeight()
            r7.setMeasuredDimension(r8, r9)
            return
        Lc9:
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r7.mAdapter
            if (r0 == 0) goto Ld6
            androidx.recyclerview.widget.RecyclerView$State r1 = r7.mState
            int r0 = r0.getItemCount()
            r1.mItemCount = r0
            goto Lda
        Ld6:
            androidx.recyclerview.widget.RecyclerView$State r0 = r7.mState
            r0.mItemCount = r2
        Lda:
            r7.startInterceptRequestLayout()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r7.mLayout
            androidx.recyclerview.widget.RecyclerView$Recycler r1 = r7.mRecycler
            androidx.recyclerview.widget.RecyclerView$State r3 = r7.mState
            r0.onMeasure(r1, r3, r8, r9)
            r7.stopInterceptRequestLayout(r2)
            androidx.recyclerview.widget.RecyclerView$State r8 = r7.mState
            r8.mInPreLayout = r2
            return
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int r2, android.graphics.Rect r3) {
            r1 = this;
            boolean r0 = r1.isComputingLayout()
            if (r0 == 0) goto L8
            r2 = 0
            return r2
        L8:
            boolean r2 = super.onRequestFocusInDescendants(r2, r3)
            return r2
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.recyclerview.widget.RecyclerView.SavedState
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            androidx.recyclerview.widget.RecyclerView$SavedState r2 = (androidx.recyclerview.widget.RecyclerView.SavedState) r2
            r1.mPendingSavedState = r2
            android.os.Parcelable r2 = r2.getSuperState()
            super.onRestoreInstanceState(r2)
            r1.requestLayout()
            return
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$SavedState r0 = new androidx.recyclerview.widget.RecyclerView$SavedState
            android.os.Parcelable r1 = super.onSaveInstanceState()
            r0.<init>(r1)
            androidx.recyclerview.widget.RecyclerView$SavedState r1 = r2.mPendingSavedState
            if (r1 == 0) goto L11
            r0.copyFrom(r1)
            return r0
        L11:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r2.mLayout
            if (r1 == 0) goto L1c
            android.os.Parcelable r1 = r1.onSaveInstanceState()
            r0.mLayoutState = r1
            return r0
        L1c:
            r1 = 0
            r0.mLayoutState = r1
            return r0
    }

    public void onScrollStateChanged(int r1) {
            r0 = this;
            return
    }

    public void onScrolled(@androidx.annotation.Px int r1, @androidx.annotation.Px int r2) {
            r0 = this;
            return
    }

    @Override // android.view.View
    protected void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onSizeChanged(r1, r2, r3, r4)
            if (r1 != r3) goto L9
            if (r2 == r4) goto L8
            goto L9
        L8:
            return
        L9:
            r0.invalidateGlows()
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r17) {
            r16 = this;
            r0 = r16
            r6 = r17
            boolean r1 = r0.mLayoutSuppressed
            r7 = 0
            if (r1 != 0) goto L1cc
            boolean r1 = r0.mIgnoreMotionEventTillDown
            if (r1 == 0) goto Lf
            goto L1cc
        Lf:
            boolean r1 = r16.dispatchToOnItemTouchListeners(r17)
            r8 = 1
            if (r1 == 0) goto L1a
            r0.cancelScroll()
            return r8
        L1a:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r0.mLayout
            if (r1 != 0) goto L1f
            return r7
        L1f:
            boolean r9 = r1.canScrollHorizontally()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r0.mLayout
            boolean r10 = r1.canScrollVertically()
            android.view.VelocityTracker r1 = r0.mVelocityTracker
            if (r1 != 0) goto L33
            android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
            r0.mVelocityTracker = r1
        L33:
            int r1 = r6.getActionMasked()
            int r2 = r6.getActionIndex()
            if (r1 != 0) goto L43
            int[] r3 = r0.mNestedOffsets
            r3[r8] = r7
            r3[r7] = r7
        L43:
            android.view.MotionEvent r11 = android.view.MotionEvent.obtain(r6)
            int[] r3 = r0.mNestedOffsets
            r4 = r3[r7]
            float r4 = (float) r4
            r3 = r3[r8]
            float r3 = (float) r3
            r11.offsetLocation(r4, r3)
            r3 = 1056964608(0x3f000000, float:0.5)
            if (r1 == 0) goto L1a2
            if (r1 == r8) goto L161
            r4 = 2
            if (r1 == r4) goto L8c
            r4 = 3
            if (r1 == r4) goto L87
            r4 = 5
            if (r1 == r4) goto L6b
            r2 = 6
            if (r1 == r2) goto L66
            goto L1c3
        L66:
            r16.onPointerUp(r17)
            goto L1c3
        L6b:
            int r1 = r6.getPointerId(r2)
            r0.mScrollPointerId = r1
            float r1 = r6.getX(r2)
            float r1 = r1 + r3
            int r1 = (int) r1
            r0.mLastTouchX = r1
            r0.mInitialTouchX = r1
            float r1 = r6.getY(r2)
            float r1 = r1 + r3
            int r1 = (int) r1
            r0.mLastTouchY = r1
            r0.mInitialTouchY = r1
            goto L1c3
        L87:
            r0.cancelScroll()
            goto L1c3
        L8c:
            int r1 = r0.mScrollPointerId
            int r1 = r6.findPointerIndex(r1)
            if (r1 >= 0) goto L95
            return r7
        L95:
            float r2 = r6.getX(r1)
            float r2 = r2 + r3
            int r12 = (int) r2
            float r1 = r6.getY(r1)
            float r1 = r1 + r3
            int r13 = (int) r1
            int r1 = r0.mLastTouchX
            int r1 = r1 - r12
            int r2 = r0.mLastTouchY
            int r2 = r2 - r13
            int r3 = r0.mScrollState
            if (r3 == r8) goto Lde
            if (r9 == 0) goto Lc2
            if (r1 <= 0) goto Lb7
            int r3 = r0.mTouchSlop
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r7, r1)
            goto Lbe
        Lb7:
            int r3 = r0.mTouchSlop
            int r1 = r1 + r3
            int r1 = java.lang.Math.min(r7, r1)
        Lbe:
            if (r1 == 0) goto Lc2
            r3 = 1
            goto Lc3
        Lc2:
            r3 = 0
        Lc3:
            if (r10 == 0) goto Ld9
            if (r2 <= 0) goto Lcf
            int r4 = r0.mTouchSlop
            int r2 = r2 - r4
            int r2 = java.lang.Math.max(r7, r2)
            goto Ld6
        Lcf:
            int r4 = r0.mTouchSlop
            int r2 = r2 + r4
            int r2 = java.lang.Math.min(r7, r2)
        Ld6:
            if (r2 == 0) goto Ld9
            r3 = 1
        Ld9:
            if (r3 == 0) goto Lde
            r0.setScrollState(r8)
        Lde:
            int r3 = r0.mScrollState
            if (r3 != r8) goto L1c3
            int[] r3 = r0.mReusableIntPair
            r3[r7] = r7
            r3[r8] = r7
            float r3 = r6.getY()
            int r3 = r0.releaseHorizontalGlow(r1, r3)
            int r14 = r1 - r3
            float r1 = r6.getX()
            int r1 = r0.releaseVerticalGlow(r2, r1)
            int r15 = r2 - r1
            if (r9 == 0) goto L100
            r1 = r14
            goto L101
        L100:
            r1 = 0
        L101:
            if (r10 == 0) goto L105
            r2 = r15
            goto L106
        L105:
            r2 = 0
        L106:
            int[] r3 = r0.mReusableIntPair
            int[] r4 = r0.mScrollOffset
            r5 = 0
            boolean r1 = r0.dispatchNestedPreScroll(r1, r2, r3, r4, r5)
            if (r1 == 0) goto L132
            int[] r1 = r0.mReusableIntPair
            r2 = r1[r7]
            int r14 = r14 - r2
            r1 = r1[r8]
            int r15 = r15 - r1
            int[] r1 = r0.mNestedOffsets
            r2 = r1[r7]
            int[] r3 = r0.mScrollOffset
            r4 = r3[r7]
            int r2 = r2 + r4
            r1[r7] = r2
            r2 = r1[r8]
            r3 = r3[r8]
            int r2 = r2 + r3
            r1[r8] = r2
            android.view.ViewParent r1 = r0.getParent()
            r1.requestDisallowInterceptTouchEvent(r8)
        L132:
            int[] r1 = r0.mScrollOffset
            r2 = r1[r7]
            int r12 = r12 - r2
            r0.mLastTouchX = r12
            r1 = r1[r8]
            int r13 = r13 - r1
            r0.mLastTouchY = r13
            if (r9 == 0) goto L142
            r1 = r14
            goto L143
        L142:
            r1 = 0
        L143:
            if (r10 == 0) goto L147
            r2 = r15
            goto L148
        L147:
            r2 = 0
        L148:
            boolean r1 = r0.scrollByInternal(r1, r2, r6, r7)
            if (r1 == 0) goto L155
            android.view.ViewParent r1 = r0.getParent()
            r1.requestDisallowInterceptTouchEvent(r8)
        L155:
            androidx.recyclerview.widget.GapWorker r1 = r0.mGapWorker
            if (r1 == 0) goto L1c3
            if (r14 != 0) goto L15d
            if (r15 == 0) goto L1c3
        L15d:
            r1.postFromTraversal(r0, r14, r15)
            goto L1c3
        L161:
            android.view.VelocityTracker r1 = r0.mVelocityTracker
            r1.addMovement(r11)
            android.view.VelocityTracker r1 = r0.mVelocityTracker
            int r2 = r0.mMaxFlingVelocity
            float r2 = (float) r2
            r3 = 1000(0x3e8, float:1.401E-42)
            r1.computeCurrentVelocity(r3, r2)
            r1 = 0
            if (r9 == 0) goto L17d
            android.view.VelocityTracker r2 = r0.mVelocityTracker
            int r3 = r0.mScrollPointerId
            float r2 = r2.getXVelocity(r3)
            float r2 = -r2
            goto L17e
        L17d:
            r2 = 0
        L17e:
            if (r10 == 0) goto L18a
            android.view.VelocityTracker r3 = r0.mVelocityTracker
            int r4 = r0.mScrollPointerId
            float r3 = r3.getYVelocity(r4)
            float r3 = -r3
            goto L18b
        L18a:
            r3 = 0
        L18b:
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 != 0) goto L193
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 == 0) goto L19b
        L193:
            int r1 = (int) r2
            int r2 = (int) r3
            boolean r1 = r0.fling(r1, r2)
            if (r1 != 0) goto L19e
        L19b:
            r0.setScrollState(r7)
        L19e:
            r0.resetScroll()
            goto L1c8
        L1a2:
            int r1 = r6.getPointerId(r7)
            r0.mScrollPointerId = r1
            float r1 = r6.getX()
            float r1 = r1 + r3
            int r1 = (int) r1
            r0.mLastTouchX = r1
            r0.mInitialTouchX = r1
            float r1 = r6.getY()
            float r1 = r1 + r3
            int r1 = (int) r1
            r0.mLastTouchY = r1
            r0.mInitialTouchY = r1
            if (r10 == 0) goto L1c0
            r9 = r9 | 2
        L1c0:
            r0.startNestedScroll(r9, r7)
        L1c3:
            android.view.VelocityTracker r1 = r0.mVelocityTracker
            r1.addMovement(r11)
        L1c8:
            r11.recycle()
            return r8
        L1cc:
            return r7
    }

    void postAnimationRunner() {
            r1 = this;
            boolean r0 = r1.mPostedAnimatorRunner
            if (r0 != 0) goto L10
            boolean r0 = r1.mIsAttached
            if (r0 == 0) goto L10
            java.lang.Runnable r0 = r1.mItemAnimatorRunner
            androidx.core.view.ViewCompat.postOnAnimation(r1, r0)
            r0 = 1
            r1.mPostedAnimatorRunner = r0
        L10:
            return
    }

    void processDataSetCompletelyChanged(boolean r2) {
            r1 = this;
            boolean r0 = r1.mDispatchItemsChangedEvent
            r2 = r2 | r0
            r1.mDispatchItemsChangedEvent = r2
            r2 = 1
            r1.mDataSetHasChangedAfterLayout = r2
            r1.markKnownViewsInvalid()
            return
    }

    void recordAnimationInfoIfBouncedHiddenView(androidx.recyclerview.widget.RecyclerView.ViewHolder r4, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo r5) {
            r3 = this;
            r0 = 0
            r1 = 8192(0x2000, float:1.148E-41)
            r4.setFlags(r0, r1)
            androidx.recyclerview.widget.RecyclerView$State r0 = r3.mState
            boolean r0 = r0.mTrackOldChangeHolders
            if (r0 == 0) goto L27
            boolean r0 = r4.isUpdated()
            if (r0 == 0) goto L27
            boolean r0 = r4.isRemoved()
            if (r0 != 0) goto L27
            boolean r0 = r4.shouldIgnore()
            if (r0 != 0) goto L27
            long r0 = r3.getChangedHolderKey(r4)
            androidx.recyclerview.widget.ViewInfoStore r2 = r3.mViewInfoStore
            r2.addToOldChangeHolders(r0, r4)
        L27:
            androidx.recyclerview.widget.ViewInfoStore r0 = r3.mViewInfoStore
            r0.addToPreLayout(r4, r5)
            return
    }

    void removeAndRecycleViews() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$ItemAnimator r0 = r2.mItemAnimator
            if (r0 == 0) goto L7
            r0.endAnimations()
        L7:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r2.mLayout
            if (r0 == 0) goto L17
            androidx.recyclerview.widget.RecyclerView$Recycler r1 = r2.mRecycler
            r0.removeAndRecycleAllViews(r1)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r2.mLayout
            androidx.recyclerview.widget.RecyclerView$Recycler r1 = r2.mRecycler
            r0.removeAndRecycleScrapInt(r1)
        L17:
            androidx.recyclerview.widget.RecyclerView$Recycler r0 = r2.mRecycler
            r0.clear()
            return
    }

    boolean removeAnimatingView(android.view.View r3) {
            r2 = this;
            r2.startInterceptRequestLayout()
            androidx.recyclerview.widget.ChildHelper r0 = r2.mChildHelper
            boolean r0 = r0.removeViewIfHidden(r3)
            if (r0 == 0) goto L19
            androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = getChildViewHolderInt(r3)
            androidx.recyclerview.widget.RecyclerView$Recycler r1 = r2.mRecycler
            r1.unscrapView(r3)
            androidx.recyclerview.widget.RecyclerView$Recycler r1 = r2.mRecycler
            r1.recycleViewHolderInternal(r3)
        L19:
            r3 = r0 ^ 1
            r2.stopInterceptRequestLayout(r3)
            return r0
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(android.view.View r3, boolean r4) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = getChildViewHolderInt(r3)
            if (r0 == 0) goto L35
            boolean r1 = r0.isTmpDetached()
            if (r1 == 0) goto L10
            r0.clearTmpDetachFlag()
            goto L35
        L10:
            boolean r1 = r0.shouldIgnore()
            if (r1 == 0) goto L17
            goto L35
        L17:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "Called removeDetachedView with a view which is not flagged as tmp detached."
            r4.append(r1)
            r4.append(r0)
            java.lang.String r0 = r2.exceptionLabel()
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L35:
            r3.clearAnimation()
            r2.dispatchChildDetached(r3)
            super.removeDetachedView(r3, r4)
            return
    }

    public void removeItemDecoration(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ItemDecoration r3) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r2.mLayout
            if (r0 == 0) goto L9
            java.lang.String r1 = "Cannot remove item decoration during a scroll  or layout"
            r0.assertNotInLayoutOrScroll(r1)
        L9:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ItemDecoration> r0 = r2.mItemDecorations
            r0.remove(r3)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ItemDecoration> r3 = r2.mItemDecorations
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L23
            int r3 = r2.getOverScrollMode()
            r0 = 2
            if (r3 != r0) goto L1f
            r3 = 1
            goto L20
        L1f:
            r3 = 0
        L20:
            r2.setWillNotDraw(r3)
        L23:
            r2.markItemDecorInsetsDirty()
            r2.requestLayout()
            return
    }

    public void removeItemDecorationAt(int r4) {
            r3 = this;
            int r0 = r3.getItemDecorationCount()
            if (r4 < 0) goto L10
            if (r4 >= r0) goto L10
            androidx.recyclerview.widget.RecyclerView$ItemDecoration r4 = r3.getItemDecorationAt(r4)
            r3.removeItemDecoration(r4)
            return
        L10:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            java.lang.String r4 = " is an invalid index for size "
            r2.append(r4)
            r2.append(r0)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4)
            throw r1
    }

    public void removeOnChildAttachStateChangeListener(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener r2) {
            r1 = this;
            java.util.List<androidx.recyclerview.widget.RecyclerView$OnChildAttachStateChangeListener> r0 = r1.mOnChildAttachStateListeners
            if (r0 != 0) goto L5
            return
        L5:
            r0.remove(r2)
            return
    }

    public void removeOnItemTouchListener(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.OnItemTouchListener r2) {
            r1 = this;
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$OnItemTouchListener> r0 = r1.mOnItemTouchListeners
            r0.remove(r2)
            androidx.recyclerview.widget.RecyclerView$OnItemTouchListener r0 = r1.mInterceptingOnItemTouchListener
            if (r0 != r2) goto Lc
            r2 = 0
            r1.mInterceptingOnItemTouchListener = r2
        Lc:
            return
    }

    public void removeOnScrollListener(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.OnScrollListener r2) {
            r1 = this;
            java.util.List<androidx.recyclerview.widget.RecyclerView$OnScrollListener> r0 = r1.mScrollListeners
            if (r0 == 0) goto L7
            r0.remove(r2)
        L7:
            return
    }

    public void removeRecyclerListener(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.RecyclerListener r2) {
            r1 = this;
            java.util.List<androidx.recyclerview.widget.RecyclerView$RecyclerListener> r0 = r1.mRecyclerListeners
            r0.remove(r2)
            return
    }

    void repositionShadowingViews() {
            r7 = this;
            androidx.recyclerview.widget.ChildHelper r0 = r7.mChildHelper
            int r0 = r0.getChildCount()
            r1 = 0
        L7:
            if (r1 >= r0) goto L3f
            androidx.recyclerview.widget.ChildHelper r2 = r7.mChildHelper
            android.view.View r2 = r2.getChildAt(r1)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = r7.getChildViewHolder(r2)
            if (r3 == 0) goto L3c
            androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = r3.mShadowingHolder
            if (r3 == 0) goto L3c
            android.view.View r3 = r3.itemView
            int r4 = r2.getLeft()
            int r2 = r2.getTop()
            int r5 = r3.getLeft()
            if (r4 != r5) goto L2f
            int r5 = r3.getTop()
            if (r2 == r5) goto L3c
        L2f:
            int r5 = r3.getWidth()
            int r5 = r5 + r4
            int r6 = r3.getHeight()
            int r6 = r6 + r2
            r3.layout(r4, r2, r5, r6)
        L3c:
            int r1 = r1 + 1
            goto L7
        L3f:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(android.view.View r3, android.view.View r4) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r2.mLayout
            androidx.recyclerview.widget.RecyclerView$State r1 = r2.mState
            boolean r0 = r0.onRequestChildFocus(r2, r1, r3, r4)
            if (r0 != 0) goto Lf
            if (r4 == 0) goto Lf
            r2.requestChildOnScreen(r3, r4)
        Lf:
            super.requestChildFocus(r3, r4)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(android.view.View r2, android.graphics.Rect r3, boolean r4) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r1.mLayout
            boolean r2 = r0.requestChildRectangleOnScreen(r1, r2, r3, r4)
            return r2
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean r4) {
            r3 = this;
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$OnItemTouchListener> r0 = r3.mOnItemTouchListeners
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L17
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$OnItemTouchListener> r2 = r3.mOnItemTouchListeners
            java.lang.Object r2 = r2.get(r1)
            androidx.recyclerview.widget.RecyclerView$OnItemTouchListener r2 = (androidx.recyclerview.widget.RecyclerView.OnItemTouchListener) r2
            r2.onRequestDisallowInterceptTouchEvent(r4)
            int r1 = r1 + 1
            goto L7
        L17:
            super.requestDisallowInterceptTouchEvent(r4)
            return
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
            r1 = this;
            int r0 = r1.mInterceptRequestLayoutDepth
            if (r0 != 0) goto Lc
            boolean r0 = r1.mLayoutSuppressed
            if (r0 != 0) goto Lc
            super.requestLayout()
            return
        Lc:
            r0 = 1
            r1.mLayoutWasDefered = r0
            return
    }

    void saveOldPositions() {
            r4 = this;
            androidx.recyclerview.widget.ChildHelper r0 = r4.mChildHelper
            int r0 = r0.getUnfilteredChildCount()
            r1 = 0
        L7:
            if (r1 >= r0) goto L1f
            androidx.recyclerview.widget.ChildHelper r2 = r4.mChildHelper
            android.view.View r2 = r2.getUnfilteredChildAt(r1)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = getChildViewHolderInt(r2)
            boolean r3 = r2.shouldIgnore()
            if (r3 != 0) goto L1c
            r2.saveOldPosition()
        L1c:
            int r1 = r1 + 1
            goto L7
        L1f:
            return
    }

    @Override // android.view.View
    public void scrollBy(int r4, int r5) {
            r3 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r3.mLayout
            if (r0 != 0) goto L5
            return
        L5:
            boolean r1 = r3.mLayoutSuppressed
            if (r1 == 0) goto La
            goto L19
        La:
            boolean r0 = r0.canScrollHorizontally()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r3.mLayout
            boolean r1 = r1.canScrollVertically()
            if (r0 != 0) goto L1a
            if (r1 == 0) goto L19
            goto L1a
        L19:
            return
        L1a:
            r2 = 0
            if (r0 == 0) goto L1e
            goto L1f
        L1e:
            r4 = 0
        L1f:
            if (r1 == 0) goto L22
            goto L23
        L22:
            r5 = 0
        L23:
            r0 = 0
            r3.scrollByInternal(r4, r5, r0, r2)
            return
    }

    boolean scrollByInternal(int r17, int r18, android.view.MotionEvent r19, int r20) {
            r16 = this;
            r0 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            r0.consumePendingUpdateOperations()
            androidx.recyclerview.widget.RecyclerView$Adapter r1 = r0.mAdapter
            r11 = 1
            r12 = 0
            if (r1 == 0) goto L28
            int[] r1 = r0.mReusableIntPair
            r1[r12] = r12
            r1[r11] = r12
            r0.scrollStep(r8, r9, r1)
            int[] r1 = r0.mReusableIntPair
            r2 = r1[r12]
            r1 = r1[r11]
            int r3 = r8 - r2
            int r4 = r9 - r1
            r15 = r2
            r2 = r1
            r1 = r15
            goto L2c
        L28:
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
        L2c:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ItemDecoration> r5 = r0.mItemDecorations
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L37
            r0.invalidate()
        L37:
            int[] r7 = r0.mReusableIntPair
            r7[r12] = r12
            r7[r11] = r12
            int[] r5 = r0.mScrollOffset
            r6 = r20
            r0.dispatchNestedScroll(r1, r2, r3, r4, r5, r6, r7)
            int[] r5 = r0.mReusableIntPair
            r6 = r5[r12]
            int r3 = r3 - r6
            r5 = r5[r11]
            int r4 = r4 - r5
            if (r6 != 0) goto L53
            if (r5 == 0) goto L51
            goto L53
        L51:
            r5 = 0
            goto L54
        L53:
            r5 = 1
        L54:
            int r6 = r0.mLastTouchX
            int[] r7 = r0.mScrollOffset
            r13 = r7[r12]
            int r6 = r6 - r13
            r0.mLastTouchX = r6
            int r6 = r0.mLastTouchY
            r7 = r7[r11]
            int r6 = r6 - r7
            r0.mLastTouchY = r6
            int[] r6 = r0.mNestedOffsets
            r14 = r6[r12]
            int r14 = r14 + r13
            r6[r12] = r14
            r13 = r6[r11]
            int r13 = r13 + r7
            r6[r11] = r13
            int r6 = r0.getOverScrollMode()
            r7 = 2
            if (r6 == r7) goto L91
            if (r10 == 0) goto L8e
            r6 = 8194(0x2002, float:1.1482E-41)
            boolean r6 = androidx.core.view.MotionEventCompat.isFromSource(r10, r6)
            if (r6 != 0) goto L8e
            float r6 = r10.getX()
            float r3 = (float) r3
            float r7 = r10.getY()
            float r4 = (float) r4
            r0.pullGlows(r6, r3, r7, r4)
        L8e:
            r16.considerReleasingGlowsOnScroll(r17, r18)
        L91:
            if (r1 != 0) goto L95
            if (r2 == 0) goto L98
        L95:
            r0.dispatchOnScrolled(r1, r2)
        L98:
            boolean r3 = r0.awakenScrollBars()
            if (r3 != 0) goto La1
            r0.invalidate()
        La1:
            if (r5 != 0) goto La9
            if (r1 != 0) goto La9
            if (r2 == 0) goto La8
            goto La9
        La8:
            return r12
        La9:
            return r11
    }

    void scrollStep(int r5, int r6, @androidx.annotation.Nullable int[] r7) {
            r4 = this;
            r4.startInterceptRequestLayout()
            r4.onEnterLayoutOrScroll()
            java.lang.String r0 = "RV Scroll"
            androidx.core.os.TraceCompat.beginSection(r0)
            androidx.recyclerview.widget.RecyclerView$State r0 = r4.mState
            r4.fillRemainingScrollValues(r0)
            r0 = 0
            if (r5 == 0) goto L1e
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r4.mLayout
            androidx.recyclerview.widget.RecyclerView$Recycler r2 = r4.mRecycler
            androidx.recyclerview.widget.RecyclerView$State r3 = r4.mState
            int r5 = r1.scrollHorizontallyBy(r5, r2, r3)
            goto L1f
        L1e:
            r5 = 0
        L1f:
            if (r6 == 0) goto L2c
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r4.mLayout
            androidx.recyclerview.widget.RecyclerView$Recycler r2 = r4.mRecycler
            androidx.recyclerview.widget.RecyclerView$State r3 = r4.mState
            int r6 = r1.scrollVerticallyBy(r6, r2, r3)
            goto L2d
        L2c:
            r6 = 0
        L2d:
            androidx.core.os.TraceCompat.endSection()
            r4.repositionShadowingViews()
            r4.onExitLayoutOrScroll()
            r4.stopInterceptRequestLayout(r0)
            if (r7 == 0) goto L40
            r7[r0] = r5
            r5 = 1
            r7[r5] = r6
        L40:
            return
    }

    @Override // android.view.View
    public void scrollTo(int r1, int r2) {
            r0 = this;
            return
    }

    public void scrollToPosition(int r2) {
            r1 = this;
            boolean r0 = r1.mLayoutSuppressed
            if (r0 == 0) goto L5
            return
        L5:
            r1.stopScroll()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r1.mLayout
            if (r0 != 0) goto Ld
            return
        Ld:
            r0.scrollToPosition(r2)
            r1.awakenScrollBars()
            return
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            boolean r0 = r1.shouldDeferAccessibilityEvent(r2)
            if (r0 == 0) goto L7
            return
        L7:
            super.sendAccessibilityEventUnchecked(r2)
            return
    }

    public void setAccessibilityDelegateCompat(@androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate r1) {
            r0 = this;
            r0.mAccessibilityDelegate = r1
            androidx.core.view.ViewCompat.setAccessibilityDelegate(r0, r1)
            return
    }

    public void setAdapter(@androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerView.Adapter r3) {
            r2 = this;
            r0 = 0
            r2.setLayoutFrozen(r0)
            r1 = 1
            r2.setAdapterInternal(r3, r0, r1)
            r2.processDataSetCompletelyChanged(r0)
            r2.requestLayout()
            return
    }

    public void setChildDrawingOrderCallback(@androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerView.ChildDrawingOrderCallback r2) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$ChildDrawingOrderCallback r0 = r1.mChildDrawingOrderCallback
            if (r2 != r0) goto L5
            return
        L5:
            r1.mChildDrawingOrderCallback = r2
            if (r2 == 0) goto Lb
            r2 = 1
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setChildrenDrawingOrderEnabled(r2)
            return
    }

    @androidx.annotation.VisibleForTesting
    boolean setChildImportantForAccessibilityInternal(androidx.recyclerview.widget.RecyclerView.ViewHolder r2, int r3) {
            r1 = this;
            boolean r0 = r1.isComputingLayout()
            if (r0 == 0) goto Lf
            r2.mPendingAccessibilityState = r3
            java.util.List<androidx.recyclerview.widget.RecyclerView$ViewHolder> r3 = r1.mPendingAccessibilityImportanceChange
            r3.add(r2)
            r2 = 0
            return r2
        Lf:
            android.view.View r2 = r2.itemView
            androidx.core.view.ViewCompat.setImportantForAccessibility(r2, r3)
            r2 = 1
            return r2
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean r2) {
            r1 = this;
            boolean r0 = r1.mClipToPadding
            if (r2 == r0) goto L7
            r1.invalidateGlows()
        L7:
            r1.mClipToPadding = r2
            super.setClipToPadding(r2)
            boolean r2 = r1.mFirstLayoutComplete
            if (r2 == 0) goto L13
            r1.requestLayout()
        L13:
            return
    }

    public void setEdgeEffectFactory(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.EdgeEffectFactory r1) {
            r0 = this;
            androidx.core.util.Preconditions.checkNotNull(r1)
            r0.mEdgeEffectFactory = r1
            r0.invalidateGlows()
            return
    }

    public void setHasFixedSize(boolean r1) {
            r0 = this;
            r0.mHasFixedSize = r1
            return
    }

    public void setItemAnimator(@androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerView.ItemAnimator r3) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$ItemAnimator r0 = r2.mItemAnimator
            if (r0 == 0) goto Ld
            r0.endAnimations()
            androidx.recyclerview.widget.RecyclerView$ItemAnimator r0 = r2.mItemAnimator
            r1 = 0
            r0.setListener(r1)
        Ld:
            r2.mItemAnimator = r3
            if (r3 == 0) goto L16
            androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemAnimatorListener r0 = r2.mItemAnimatorListener
            r3.setListener(r0)
        L16:
            return
    }

    public void setItemViewCacheSize(int r2) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$Recycler r0 = r1.mRecycler
            r0.setViewCacheSize(r2)
            return
    }

    @java.lang.Deprecated
    public void setLayoutFrozen(boolean r1) {
            r0 = this;
            r0.suppressLayout(r1)
            return
    }

    public void setLayoutManager(@androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerView.LayoutManager r4) {
            r3 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r3.mLayout
            if (r4 != r0) goto L5
            return
        L5:
            r3.stopScroll()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r3.mLayout
            if (r0 == 0) goto L3a
            androidx.recyclerview.widget.RecyclerView$ItemAnimator r0 = r3.mItemAnimator
            if (r0 == 0) goto L13
            r0.endAnimations()
        L13:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r3.mLayout
            androidx.recyclerview.widget.RecyclerView$Recycler r1 = r3.mRecycler
            r0.removeAndRecycleAllViews(r1)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r3.mLayout
            androidx.recyclerview.widget.RecyclerView$Recycler r1 = r3.mRecycler
            r0.removeAndRecycleScrapInt(r1)
            androidx.recyclerview.widget.RecyclerView$Recycler r0 = r3.mRecycler
            r0.clear()
            boolean r0 = r3.mIsAttached
            if (r0 == 0) goto L31
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r3.mLayout
            androidx.recyclerview.widget.RecyclerView$Recycler r1 = r3.mRecycler
            r0.dispatchDetachedFromWindow(r3, r1)
        L31:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r3.mLayout
            r1 = 0
            r0.setRecyclerView(r1)
            r3.mLayout = r1
            goto L3f
        L3a:
            androidx.recyclerview.widget.RecyclerView$Recycler r0 = r3.mRecycler
            r0.clear()
        L3f:
            androidx.recyclerview.widget.ChildHelper r0 = r3.mChildHelper
            r0.removeAllViewsUnfiltered()
            r3.mLayout = r4
            if (r4 == 0) goto L7e
            androidx.recyclerview.widget.RecyclerView r0 = r4.mRecyclerView
            if (r0 != 0) goto L59
            r4.setRecyclerView(r3)
            boolean r4 = r3.mIsAttached
            if (r4 == 0) goto L7e
            androidx.recyclerview.widget.RecyclerView$LayoutManager r4 = r3.mLayout
            r4.dispatchAttachedToWindow(r3)
            goto L7e
        L59:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "LayoutManager "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = " is already attached to a RecyclerView:"
            r1.append(r2)
            androidx.recyclerview.widget.RecyclerView r4 = r4.mRecyclerView
            java.lang.String r4 = r4.exceptionLabel()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L7e:
            androidx.recyclerview.widget.RecyclerView$Recycler r4 = r3.mRecycler
            r4.updateViewCacheSize()
            r3.requestLayout()
            return
    }

    @Override // android.view.ViewGroup
    @java.lang.Deprecated
    public void setLayoutTransition(android.animation.LayoutTransition r2) {
            r1 = this;
            if (r2 != 0) goto L7
            r2 = 0
            super.setLayoutTransition(r2)
            return
        L7:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView"
            r2.<init>(r0)
            throw r2
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean r2) {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.getScrollingChildHelper()
            r0.setNestedScrollingEnabled(r2)
            return
    }

    public void setOnFlingListener(@androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerView.OnFlingListener r1) {
            r0 = this;
            r0.mOnFlingListener = r1
            return
    }

    @java.lang.Deprecated
    public void setOnScrollListener(@androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerView.OnScrollListener r1) {
            r0 = this;
            r0.mScrollListener = r1
            return
    }

    public void setPreserveFocusAfterLayout(boolean r1) {
            r0 = this;
            r0.mPreserveFocusAfterLayout = r1
            return
    }

    public void setRecycledViewPool(@androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerView.RecycledViewPool r2) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$Recycler r0 = r1.mRecycler
            r0.setRecycledViewPool(r2)
            return
    }

    @java.lang.Deprecated
    public void setRecyclerListener(@androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerView.RecyclerListener r1) {
            r0 = this;
            r0.mRecyclerListener = r1
            return
    }

    void setScrollState(int r2) {
            r1 = this;
            int r0 = r1.mScrollState
            if (r2 != r0) goto L5
            return
        L5:
            r1.mScrollState = r2
            r0 = 2
            if (r2 == r0) goto Ld
            r1.stopScrollersInternal()
        Ld:
            r1.dispatchOnScrollStateChanged(r2)
            return
    }

    public void setScrollingTouchSlop(int r3) {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            if (r3 == 0) goto L15
            r1 = 1
            if (r3 == r1) goto Le
            goto L15
        Le:
            int r3 = r0.getScaledPagingTouchSlop()
            r2.mTouchSlop = r3
            return
        L15:
            int r3 = r0.getScaledTouchSlop()
            r2.mTouchSlop = r3
            return
    }

    public void setViewCacheExtension(@androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerView.ViewCacheExtension r2) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$Recycler r0 = r1.mRecycler
            r0.setViewCacheExtension(r2)
            return
    }

    boolean shouldDeferAccessibilityEvent(android.view.accessibility.AccessibilityEvent r3) {
            r2 = this;
            boolean r0 = r2.isComputingLayout()
            r1 = 0
            if (r0 == 0) goto L1a
            if (r3 == 0) goto Le
            int r3 = androidx.core.view.accessibility.AccessibilityEventCompat.getContentChangeTypes(r3)
            goto Lf
        Le:
            r3 = 0
        Lf:
            if (r3 != 0) goto L12
            goto L13
        L12:
            r1 = r3
        L13:
            int r3 = r2.mEatenAccessibilityChangeFlags
            r3 = r3 | r1
            r2.mEatenAccessibilityChangeFlags = r3
            r3 = 1
            return r3
        L1a:
            return r1
    }

    public void smoothScrollBy(@androidx.annotation.Px int r2, @androidx.annotation.Px int r3) {
            r1 = this;
            r0 = 0
            r1.smoothScrollBy(r2, r3, r0)
            return
    }

    public void smoothScrollBy(@androidx.annotation.Px int r2, @androidx.annotation.Px int r3, @androidx.annotation.Nullable android.view.animation.Interpolator r4) {
            r1 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.smoothScrollBy(r2, r3, r4, r0)
            return
    }

    public void smoothScrollBy(@androidx.annotation.Px int r7, @androidx.annotation.Px int r8, @androidx.annotation.Nullable android.view.animation.Interpolator r9, int r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.smoothScrollBy(r1, r2, r3, r4, r5)
            return
    }

    void smoothScrollBy(@androidx.annotation.Px int r3, @androidx.annotation.Px int r4, @androidx.annotation.Nullable android.view.animation.Interpolator r5, int r6, boolean r7) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r2.mLayout
            if (r0 != 0) goto L5
            return
        L5:
            boolean r1 = r2.mLayoutSuppressed
            if (r1 == 0) goto La
            goto L20
        La:
            boolean r0 = r0.canScrollHorizontally()
            r1 = 0
            if (r0 != 0) goto L12
            r3 = 0
        L12:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r2.mLayout
            boolean r0 = r0.canScrollVertically()
            if (r0 != 0) goto L1b
            r4 = 0
        L1b:
            if (r3 != 0) goto L21
            if (r4 == 0) goto L20
            goto L21
        L20:
            return
        L21:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 == r0) goto L2c
            if (r6 <= 0) goto L28
            goto L2c
        L28:
            r2.scrollBy(r3, r4)
            return
        L2c:
            if (r7 == 0) goto L39
            r7 = 1
            if (r3 == 0) goto L32
            r1 = 1
        L32:
            if (r4 == 0) goto L36
            r1 = r1 | 2
        L36:
            r2.startNestedScroll(r1, r7)
        L39:
            androidx.recyclerview.widget.RecyclerView$ViewFlinger r7 = r2.mViewFlinger
            r7.smoothScrollBy(r3, r4, r6, r5)
            return
    }

    public void smoothScrollToPosition(int r3) {
            r2 = this;
            boolean r0 = r2.mLayoutSuppressed
            if (r0 == 0) goto L5
            return
        L5:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r2.mLayout
            if (r0 != 0) goto La
            return
        La:
            androidx.recyclerview.widget.RecyclerView$State r1 = r2.mState
            r0.smoothScrollToPosition(r2, r1, r3)
            return
    }

    void startInterceptRequestLayout() {
            r2 = this;
            int r0 = r2.mInterceptRequestLayoutDepth
            r1 = 1
            int r0 = r0 + r1
            r2.mInterceptRequestLayoutDepth = r0
            if (r0 != r1) goto Lf
            boolean r0 = r2.mLayoutSuppressed
            if (r0 != 0) goto Lf
            r0 = 0
            r2.mLayoutWasDefered = r0
        Lf:
            return
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int r2) {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.getScrollingChildHelper()
            boolean r2 = r0.startNestedScroll(r2)
            return r2
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean startNestedScroll(int r2, int r3) {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.getScrollingChildHelper()
            boolean r2 = r0.startNestedScroll(r2, r3)
            return r2
    }

    void stopInterceptRequestLayout(boolean r4) {
            r3 = this;
            int r0 = r3.mInterceptRequestLayoutDepth
            r1 = 1
            if (r0 >= r1) goto L7
            r3.mInterceptRequestLayoutDepth = r1
        L7:
            r0 = 0
            if (r4 != 0) goto L10
            boolean r2 = r3.mLayoutSuppressed
            if (r2 != 0) goto L10
            r3.mLayoutWasDefered = r0
        L10:
            int r2 = r3.mInterceptRequestLayoutDepth
            if (r2 != r1) goto L2f
            if (r4 == 0) goto L29
            boolean r4 = r3.mLayoutWasDefered
            if (r4 == 0) goto L29
            boolean r4 = r3.mLayoutSuppressed
            if (r4 != 0) goto L29
            androidx.recyclerview.widget.RecyclerView$LayoutManager r4 = r3.mLayout
            if (r4 == 0) goto L29
            androidx.recyclerview.widget.RecyclerView$Adapter r4 = r3.mAdapter
            if (r4 == 0) goto L29
            r3.dispatchLayout()
        L29:
            boolean r4 = r3.mLayoutSuppressed
            if (r4 != 0) goto L2f
            r3.mLayoutWasDefered = r0
        L2f:
            int r4 = r3.mInterceptRequestLayoutDepth
            int r4 = r4 - r1
            r3.mInterceptRequestLayoutDepth = r4
            return
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.getScrollingChildHelper()
            r0.stopNestedScroll()
            return
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public void stopNestedScroll(int r2) {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.getScrollingChildHelper()
            r0.stopNestedScroll(r2)
            return
    }

    public void stopScroll() {
            r1 = this;
            r0 = 0
            r1.setScrollState(r0)
            r1.stopScrollersInternal()
            return
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean r10) {
            r9 = this;
            boolean r0 = r9.mLayoutSuppressed
            if (r10 == r0) goto L38
            java.lang.String r0 = "Do not suppressLayout in layout or scroll"
            r9.assertNotInLayoutOrScroll(r0)
            if (r10 != 0) goto L20
            r10 = 0
            r9.mLayoutSuppressed = r10
            boolean r0 = r9.mLayoutWasDefered
            if (r0 == 0) goto L1d
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r9.mLayout
            if (r0 == 0) goto L1d
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r9.mAdapter
            if (r0 == 0) goto L1d
            r9.requestLayout()
        L1d:
            r9.mLayoutWasDefered = r10
            return
        L20:
            long r1 = android.os.SystemClock.uptimeMillis()
            r7 = 0
            r8 = 0
            r5 = 3
            r6 = 0
            r3 = r1
            android.view.MotionEvent r10 = android.view.MotionEvent.obtain(r1, r3, r5, r6, r7, r8)
            r9.onTouchEvent(r10)
            r10 = 1
            r9.mLayoutSuppressed = r10
            r9.mIgnoreMotionEventTillDown = r10
            r9.stopScroll()
        L38:
            return
    }

    public void swapAdapter(@androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerView.Adapter r2, boolean r3) {
            r1 = this;
            r0 = 0
            r1.setLayoutFrozen(r0)
            r0 = 1
            r1.setAdapterInternal(r2, r0, r3)
            r1.processDataSetCompletelyChanged(r0)
            r1.requestLayout()
            return
    }

    void viewRangeUpdate(int r7, int r8, java.lang.Object r9) {
            r6 = this;
            androidx.recyclerview.widget.ChildHelper r0 = r6.mChildHelper
            int r0 = r0.getUnfilteredChildCount()
            int r1 = r7 + r8
            r2 = 0
        L9:
            if (r2 >= r0) goto L37
            androidx.recyclerview.widget.ChildHelper r3 = r6.mChildHelper
            android.view.View r3 = r3.getUnfilteredChildAt(r2)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r4 = getChildViewHolderInt(r3)
            if (r4 == 0) goto L34
            boolean r5 = r4.shouldIgnore()
            if (r5 == 0) goto L1e
            goto L34
        L1e:
            int r5 = r4.mPosition
            if (r5 < r7) goto L34
            if (r5 >= r1) goto L34
            r5 = 2
            r4.addFlags(r5)
            r4.addChangePayload(r9)
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r3 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r3
            r4 = 1
            r3.mInsetsDirty = r4
        L34:
            int r2 = r2 + 1
            goto L9
        L37:
            androidx.recyclerview.widget.RecyclerView$Recycler r9 = r6.mRecycler
            r9.viewRangeUpdate(r7, r8)
            return
    }
}
