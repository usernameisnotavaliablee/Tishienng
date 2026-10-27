package androidx.recyclerview.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ItemTouchHelper extends androidx.recyclerview.widget.RecyclerView.ItemDecoration implements androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener {
    static final int ACTION_MODE_DRAG_MASK = 16711680;
    private static final int ACTION_MODE_IDLE_MASK = 255;
    static final int ACTION_MODE_SWIPE_MASK = 65280;
    public static final int ACTION_STATE_DRAG = 2;
    public static final int ACTION_STATE_IDLE = 0;
    public static final int ACTION_STATE_SWIPE = 1;
    private static final int ACTIVE_POINTER_ID_NONE = -1;
    public static final int ANIMATION_TYPE_DRAG = 8;
    public static final int ANIMATION_TYPE_SWIPE_CANCEL = 4;
    public static final int ANIMATION_TYPE_SWIPE_SUCCESS = 2;
    private static final boolean DEBUG = false;
    static final int DIRECTION_FLAG_COUNT = 8;
    public static final int DOWN = 2;
    public static final int END = 32;
    public static final int LEFT = 4;
    private static final int PIXELS_PER_SECOND = 1000;
    public static final int RIGHT = 8;
    public static final int START = 16;
    private static final java.lang.String TAG = "ItemTouchHelper";
    public static final int UP = 1;
    private int mActionState;
    int mActivePointerId;

    @androidx.annotation.NonNull
    androidx.recyclerview.widget.ItemTouchHelper.Callback mCallback;
    private androidx.recyclerview.widget.RecyclerView.ChildDrawingOrderCallback mChildDrawingOrderCallback;
    private java.util.List<java.lang.Integer> mDistances;
    private long mDragScrollStartTimeInMs;
    float mDx;
    float mDy;
    androidx.core.view.GestureDetectorCompat mGestureDetector;
    float mInitialTouchX;
    float mInitialTouchY;
    private androidx.recyclerview.widget.ItemTouchHelper.ItemTouchHelperGestureListener mItemTouchHelperGestureListener;
    private float mMaxSwipeVelocity;
    private final androidx.recyclerview.widget.RecyclerView.OnItemTouchListener mOnItemTouchListener;
    android.view.View mOverdrawChild;
    int mOverdrawChildPosition;
    final java.util.List<android.view.View> mPendingCleanup;

    @androidx.annotation.VisibleForTesting
    java.util.List<androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation> mRecoverAnimations;
    androidx.recyclerview.widget.RecyclerView mRecyclerView;
    final java.lang.Runnable mScrollRunnable;
    androidx.recyclerview.widget.RecyclerView.ViewHolder mSelected;
    int mSelectedFlags;
    private float mSelectedStartX;
    private float mSelectedStartY;
    private int mSlop;
    private java.util.List<androidx.recyclerview.widget.RecyclerView.ViewHolder> mSwapTargets;
    private float mSwipeEscapeVelocity;
    private final float[] mTmpPosition;
    private android.graphics.Rect mTmpRect;
    android.view.VelocityTracker mVelocityTracker;





    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$5, reason: invalid class name */
    class AnonymousClass5 implements androidx.recyclerview.widget.RecyclerView.ChildDrawingOrderCallback {
        final /* synthetic */ androidx.recyclerview.widget.ItemTouchHelper this$0;

        AnonymousClass5(androidx.recyclerview.widget.ItemTouchHelper r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ChildDrawingOrderCallback
        public int onGetChildDrawingOrder(int r5, int r6) {
                r4 = this;
                androidx.recyclerview.widget.ItemTouchHelper r0 = r4.this$0
                android.view.View r1 = r0.mOverdrawChild
                if (r1 != 0) goto L7
                goto L1d
            L7:
                int r2 = r0.mOverdrawChildPosition
                r3 = -1
                if (r2 != r3) goto L16
                androidx.recyclerview.widget.RecyclerView r0 = r0.mRecyclerView
                int r2 = r0.indexOfChild(r1)
                androidx.recyclerview.widget.ItemTouchHelper r0 = r4.this$0
                r0.mOverdrawChildPosition = r2
            L16:
                int r5 = r5 + (-1)
                if (r6 != r5) goto L1b
                return r2
            L1b:
                if (r6 >= r2) goto L1e
            L1d:
                return r6
            L1e:
                int r6 = r6 + 1
                return r6
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class Callback {
        private static final int ABS_HORIZONTAL_DIR_FLAGS = 789516;
        public static final int DEFAULT_DRAG_ANIMATION_DURATION = 200;
        public static final int DEFAULT_SWIPE_ANIMATION_DURATION = 250;
        private static final long DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS = 2000;
        static final int RELATIVE_DIR_FLAGS = 3158064;
        private static final android.view.animation.Interpolator sDragScrollInterpolator = null;
        private static final android.view.animation.Interpolator sDragViewScrollCapInterpolator = null;
        private int mCachedMaxScrollSpeed;



        static {
                androidx.recyclerview.widget.ItemTouchHelper$Callback$1 r0 = new androidx.recyclerview.widget.ItemTouchHelper$Callback$1
                r0.<init>()
                androidx.recyclerview.widget.ItemTouchHelper.Callback.sDragScrollInterpolator = r0
                androidx.recyclerview.widget.ItemTouchHelper$Callback$2 r0 = new androidx.recyclerview.widget.ItemTouchHelper$Callback$2
                r0.<init>()
                androidx.recyclerview.widget.ItemTouchHelper.Callback.sDragViewScrollCapInterpolator = r0
                return
        }

        public Callback() {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.mCachedMaxScrollSpeed = r0
                return
        }

        public static int convertToRelativeDirection(int r3, int r4) {
                r0 = 789516(0xc0c0c, float:1.106348E-39)
                r1 = r3 & r0
                if (r1 != 0) goto L8
                return r3
            L8:
                int r2 = ~r1
                r3 = r3 & r2
                if (r4 != 0) goto L10
                int r4 = r1 << 2
            Le:
                r3 = r3 | r4
                return r3
            L10:
                int r4 = r1 << 1
                r1 = -789517(0xfffffffffff3f3f3, float:NaN)
                r1 = r1 & r4
                r3 = r3 | r1
                r4 = r4 & r0
                int r4 = r4 << 2
                goto Le
        }

        @androidx.annotation.NonNull
        public static androidx.recyclerview.widget.ItemTouchUIUtil getDefaultUIUtil() {
                androidx.recyclerview.widget.ItemTouchUIUtil r0 = androidx.recyclerview.widget.ItemTouchUIUtilImpl.INSTANCE
                return r0
        }

        private int getMaxDragScroll(androidx.recyclerview.widget.RecyclerView r3) {
                r2 = this;
                int r0 = r2.mCachedMaxScrollSpeed
                r1 = -1
                if (r0 != r1) goto L11
                android.content.res.Resources r3 = r3.getResources()
                int r0 = androidx.recyclerview.R.dimen.item_touch_helper_max_drag_scroll_per_frame
                int r3 = r3.getDimensionPixelSize(r0)
                r2.mCachedMaxScrollSpeed = r3
            L11:
                int r3 = r2.mCachedMaxScrollSpeed
                return r3
        }

        public static int makeFlag(int r0, int r1) {
                int r0 = r0 * 8
                int r0 = r1 << r0
                return r0
        }

        public static int makeMovementFlags(int r2, int r3) {
                r0 = 0
                r1 = r3 | r2
                int r0 = makeFlag(r0, r1)
                r1 = 1
                int r3 = makeFlag(r1, r3)
                r3 = r3 | r0
                r0 = 2
                int r2 = makeFlag(r0, r2)
                r2 = r2 | r3
                return r2
        }

        public boolean canDropOver(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r1, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r2, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r3) {
                r0 = this;
                r1 = 1
                return r1
        }

        @android.annotation.SuppressLint({"UnknownNullness"})
        public androidx.recyclerview.widget.RecyclerView.ViewHolder chooseDropTarget(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r13, @androidx.annotation.NonNull java.util.List<androidx.recyclerview.widget.RecyclerView.ViewHolder> r14, int r15, int r16) {
                r12 = this;
                android.view.View r0 = r13.itemView
                int r0 = r0.getWidth()
                int r0 = r0 + r15
                android.view.View r1 = r13.itemView
                int r1 = r1.getHeight()
                int r1 = r16 + r1
                android.view.View r2 = r13.itemView
                int r2 = r2.getLeft()
                int r2 = r15 - r2
                android.view.View r3 = r13.itemView
                int r3 = r3.getTop()
                int r3 = r16 - r3
                int r4 = r14.size()
                r5 = 0
                r6 = -1
                r7 = 0
            L26:
                if (r7 >= r4) goto Lb7
                java.lang.Object r8 = r14.get(r7)
                androidx.recyclerview.widget.RecyclerView$ViewHolder r8 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r8
                if (r2 <= 0) goto L4f
                android.view.View r9 = r8.itemView
                int r9 = r9.getRight()
                int r9 = r9 - r0
                if (r9 >= 0) goto L4f
                android.view.View r10 = r8.itemView
                int r10 = r10.getRight()
                android.view.View r11 = r13.itemView
                int r11 = r11.getRight()
                if (r10 <= r11) goto L4f
                int r9 = java.lang.Math.abs(r9)
                if (r9 <= r6) goto L4f
                r5 = r8
                r6 = r9
            L4f:
                if (r2 >= 0) goto L70
                android.view.View r9 = r8.itemView
                int r9 = r9.getLeft()
                int r9 = r9 - r15
                if (r9 <= 0) goto L70
                android.view.View r10 = r8.itemView
                int r10 = r10.getLeft()
                android.view.View r11 = r13.itemView
                int r11 = r11.getLeft()
                if (r10 >= r11) goto L70
                int r9 = java.lang.Math.abs(r9)
                if (r9 <= r6) goto L70
                r5 = r8
                r6 = r9
            L70:
                if (r3 >= 0) goto L92
                android.view.View r9 = r8.itemView
                int r9 = r9.getTop()
                int r9 = r9 - r16
                if (r9 <= 0) goto L92
                android.view.View r10 = r8.itemView
                int r10 = r10.getTop()
                android.view.View r11 = r13.itemView
                int r11 = r11.getTop()
                if (r10 >= r11) goto L92
                int r9 = java.lang.Math.abs(r9)
                if (r9 <= r6) goto L92
                r5 = r8
                r6 = r9
            L92:
                if (r3 <= 0) goto Lb3
                android.view.View r9 = r8.itemView
                int r9 = r9.getBottom()
                int r9 = r9 - r1
                if (r9 >= 0) goto Lb3
                android.view.View r10 = r8.itemView
                int r10 = r10.getBottom()
                android.view.View r11 = r13.itemView
                int r11 = r11.getBottom()
                if (r10 <= r11) goto Lb3
                int r9 = java.lang.Math.abs(r9)
                if (r9 <= r6) goto Lb3
                r5 = r8
                r6 = r9
            Lb3:
                int r7 = r7 + 1
                goto L26
            Lb7:
                return r5
        }

        public void clearView(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r1, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r2) {
                r0 = this;
                androidx.recyclerview.widget.ItemTouchUIUtil r1 = androidx.recyclerview.widget.ItemTouchUIUtilImpl.INSTANCE
                android.view.View r2 = r2.itemView
                r1.clearView(r2)
                return
        }

        public int convertToAbsoluteDirection(int r4, int r5) {
                r3 = this;
                r0 = 3158064(0x303030, float:4.42539E-39)
                r1 = r4 & r0
                if (r1 != 0) goto L8
                return r4
            L8:
                int r2 = ~r1
                r4 = r4 & r2
                if (r5 != 0) goto L10
                int r5 = r1 >> 2
            Le:
                r4 = r4 | r5
                return r4
            L10:
                int r5 = r1 >> 1
                r1 = -3158065(0xffffffffffcfcfcf, float:NaN)
                r1 = r1 & r5
                r4 = r4 | r1
                r5 = r5 & r0
                int r5 = r5 >> 2
                goto Le
        }

        final int getAbsoluteMovementFlags(androidx.recyclerview.widget.RecyclerView r1, androidx.recyclerview.widget.RecyclerView.ViewHolder r2) {
                r0 = this;
                int r2 = r0.getMovementFlags(r1, r2)
                int r1 = androidx.core.view.ViewCompat.getLayoutDirection(r1)
                int r1 = r0.convertToAbsoluteDirection(r2, r1)
                return r1
        }

        public long getAnimationDuration(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r1, int r2, float r3, float r4) {
                r0 = this;
                androidx.recyclerview.widget.RecyclerView$ItemAnimator r1 = r1.getItemAnimator()
                r3 = 8
                if (r1 != 0) goto L10
                if (r2 != r3) goto Ld
                r1 = 200(0xc8, double:9.9E-322)
                return r1
            Ld:
                r1 = 250(0xfa, double:1.235E-321)
                return r1
            L10:
                if (r2 != r3) goto L17
                long r1 = r1.getMoveDuration()
                return r1
            L17:
                long r1 = r1.getRemoveDuration()
                return r1
        }

        public int getBoundingBoxMargin() {
                r1 = this;
                r0 = 0
                return r0
        }

        public float getMoveThreshold(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r1) {
                r0 = this;
                r1 = 1056964608(0x3f000000, float:0.5)
                return r1
        }

        public abstract int getMovementFlags(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r1, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r2);

        public float getSwipeEscapeVelocity(float r1) {
                r0 = this;
                return r1
        }

        public float getSwipeThreshold(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r1) {
                r0 = this;
                r1 = 1056964608(0x3f000000, float:0.5)
                return r1
        }

        public float getSwipeVelocityThreshold(float r1) {
                r0 = this;
                return r1
        }

        boolean hasDragFlag(androidx.recyclerview.widget.RecyclerView r1, androidx.recyclerview.widget.RecyclerView.ViewHolder r2) {
                r0 = this;
                int r1 = r0.getAbsoluteMovementFlags(r1, r2)
                r2 = 16711680(0xff0000, float:2.3418052E-38)
                r1 = r1 & r2
                if (r1 == 0) goto Lb
                r1 = 1
                return r1
            Lb:
                r1 = 0
                return r1
        }

        boolean hasSwipeFlag(androidx.recyclerview.widget.RecyclerView r1, androidx.recyclerview.widget.RecyclerView.ViewHolder r2) {
                r0 = this;
                int r1 = r0.getAbsoluteMovementFlags(r1, r2)
                r2 = 65280(0xff00, float:9.1477E-41)
                r1 = r1 & r2
                if (r1 == 0) goto Lc
                r1 = 1
                return r1
            Lc:
                r1 = 0
                return r1
        }

        public int interpolateOutOfBoundsScroll(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r5, int r6, int r7, int r8, long r9) {
                r4 = this;
                int r5 = r4.getMaxDragScroll(r5)
                int r8 = java.lang.Math.abs(r7)
                float r0 = (float) r7
                float r0 = java.lang.Math.signum(r0)
                int r0 = (int) r0
                float r8 = (float) r8
                r1 = 1065353216(0x3f800000, float:1.0)
                float r8 = r8 * r1
                float r6 = (float) r6
                float r8 = r8 / r6
                float r6 = java.lang.Math.min(r1, r8)
                int r0 = r0 * r5
                float r5 = (float) r0
                android.view.animation.Interpolator r8 = androidx.recyclerview.widget.ItemTouchHelper.Callback.sDragViewScrollCapInterpolator
                float r6 = r8.getInterpolation(r6)
                float r5 = r5 * r6
                int r5 = (int) r5
                r2 = 2000(0x7d0, double:9.88E-321)
                int r6 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r6 <= 0) goto L2c
                goto L31
            L2c:
                float r6 = (float) r9
                r8 = 1157234688(0x44fa0000, float:2000.0)
                float r1 = r6 / r8
            L31:
                float r5 = (float) r5
                android.view.animation.Interpolator r6 = androidx.recyclerview.widget.ItemTouchHelper.Callback.sDragScrollInterpolator
                float r6 = r6.getInterpolation(r1)
                float r5 = r5 * r6
                int r5 = (int) r5
                if (r5 != 0) goto L42
                if (r7 <= 0) goto L41
                r5 = 1
                return r5
            L41:
                r5 = -1
            L42:
                return r5
        }

        public boolean isItemViewSwipeEnabled() {
                r1 = this;
                r0 = 1
                return r0
        }

        public boolean isLongPressDragEnabled() {
                r1 = this;
                r0 = 1
                return r0
        }

        public void onChildDraw(@androidx.annotation.NonNull android.graphics.Canvas r9, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r10, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r11, float r12, float r13, int r14, boolean r15) {
                r8 = this;
                androidx.recyclerview.widget.ItemTouchUIUtil r0 = androidx.recyclerview.widget.ItemTouchUIUtilImpl.INSTANCE
                android.view.View r3 = r11.itemView
                r1 = r9
                r2 = r10
                r4 = r12
                r5 = r13
                r6 = r14
                r7 = r15
                r0.onDraw(r1, r2, r3, r4, r5, r6, r7)
                return
        }

        public void onChildDrawOver(@androidx.annotation.NonNull android.graphics.Canvas r9, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r10, @android.annotation.SuppressLint({"UnknownNullness"}) androidx.recyclerview.widget.RecyclerView.ViewHolder r11, float r12, float r13, int r14, boolean r15) {
                r8 = this;
                androidx.recyclerview.widget.ItemTouchUIUtil r0 = androidx.recyclerview.widget.ItemTouchUIUtilImpl.INSTANCE
                android.view.View r3 = r11.itemView
                r1 = r9
                r2 = r10
                r4 = r12
                r5 = r13
                r6 = r14
                r7 = r15
                r0.onDrawOver(r1, r2, r3, r4, r5, r6, r7)
                return
        }

        void onDraw(android.graphics.Canvas r13, androidx.recyclerview.widget.RecyclerView r14, androidx.recyclerview.widget.RecyclerView.ViewHolder r15, java.util.List<androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation> r16, int r17, float r18, float r19) {
                r12 = this;
                int r8 = r16.size()
                r0 = 0
                r9 = 0
            L6:
                if (r9 >= r8) goto L2c
                r10 = r16
                java.lang.Object r0 = r10.get(r9)
                androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation r0 = (androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation) r0
                r0.update()
                int r11 = r13.save()
                androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = r0.mViewHolder
                float r4 = r0.mX
                float r5 = r0.mY
                int r6 = r0.mActionState
                r7 = 0
                r0 = r12
                r1 = r13
                r2 = r14
                r0.onChildDraw(r1, r2, r3, r4, r5, r6, r7)
                r13.restoreToCount(r11)
                int r9 = r9 + 1
                goto L6
            L2c:
                if (r15 == 0) goto L43
                int r8 = r13.save()
                r7 = 1
                r0 = r12
                r1 = r13
                r2 = r14
                r3 = r15
                r6 = r17
                r4 = r18
                r5 = r19
                r0.onChildDraw(r1, r2, r3, r4, r5, r6, r7)
                r13.restoreToCount(r8)
            L43:
                return
        }

        void onDrawOver(android.graphics.Canvas r14, androidx.recyclerview.widget.RecyclerView r15, androidx.recyclerview.widget.RecyclerView.ViewHolder r16, java.util.List<androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation> r17, int r18, float r19, float r20) {
                r13 = this;
                r8 = r17
                int r9 = r8.size()
                r10 = 0
                r11 = 0
            L8:
                if (r11 >= r9) goto L29
                java.lang.Object r0 = r8.get(r11)
                androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation r0 = (androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation) r0
                int r12 = r14.save()
                androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = r0.mViewHolder
                float r4 = r0.mX
                float r5 = r0.mY
                int r6 = r0.mActionState
                r7 = 0
                r0 = r13
                r1 = r14
                r2 = r15
                r0.onChildDrawOver(r1, r2, r3, r4, r5, r6, r7)
                r14.restoreToCount(r12)
                int r11 = r11 + 1
                goto L8
            L29:
                if (r16 == 0) goto L41
                int r11 = r14.save()
                r7 = 1
                r0 = r13
                r1 = r14
                r2 = r15
                r3 = r16
                r6 = r18
                r4 = r19
                r5 = r20
                r0.onChildDrawOver(r1, r2, r3, r4, r5, r6, r7)
                r14.restoreToCount(r11)
            L41:
                r0 = 1
                int r9 = r9 - r0
            L43:
                if (r9 < 0) goto L5d
                java.lang.Object r1 = r8.get(r9)
                androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation r1 = (androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation) r1
                boolean r2 = r1.mEnded
                if (r2 == 0) goto L57
                boolean r1 = r1.mIsPendingCleanup
                if (r1 != 0) goto L57
                r8.remove(r9)
                goto L5a
            L57:
                if (r2 != 0) goto L5a
                r10 = 1
            L5a:
                int r9 = r9 + (-1)
                goto L43
            L5d:
                if (r10 == 0) goto L62
                r15.invalidate()
            L62:
                return
        }

        public abstract boolean onMove(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r1, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r2, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r3);

        public void onMoved(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r2, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r3, int r4, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r5, int r6, int r7, int r8) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$LayoutManager r4 = r2.getLayoutManager()
                boolean r0 = r4 instanceof androidx.recyclerview.widget.ItemTouchHelper.ViewDropHandler
                if (r0 == 0) goto L12
                androidx.recyclerview.widget.ItemTouchHelper$ViewDropHandler r4 = (androidx.recyclerview.widget.ItemTouchHelper.ViewDropHandler) r4
                android.view.View r2 = r3.itemView
                android.view.View r3 = r5.itemView
                r4.prepareForDrop(r2, r3, r7, r8)
                return
            L12:
                boolean r3 = r4.canScrollHorizontally()
                if (r3 == 0) goto L3b
                android.view.View r3 = r5.itemView
                int r3 = r4.getDecoratedLeft(r3)
                int r7 = r2.getPaddingLeft()
                if (r3 > r7) goto L27
                r2.scrollToPosition(r6)
            L27:
                android.view.View r3 = r5.itemView
                int r3 = r4.getDecoratedRight(r3)
                int r7 = r2.getWidth()
                int r8 = r2.getPaddingRight()
                int r7 = r7 - r8
                if (r3 < r7) goto L3b
                r2.scrollToPosition(r6)
            L3b:
                boolean r3 = r4.canScrollVertically()
                if (r3 == 0) goto L64
                android.view.View r3 = r5.itemView
                int r3 = r4.getDecoratedTop(r3)
                int r7 = r2.getPaddingTop()
                if (r3 > r7) goto L50
                r2.scrollToPosition(r6)
            L50:
                android.view.View r3 = r5.itemView
                int r3 = r4.getDecoratedBottom(r3)
                int r4 = r2.getHeight()
                int r5 = r2.getPaddingBottom()
                int r4 = r4 - r5
                if (r3 < r4) goto L64
                r2.scrollToPosition(r6)
            L64:
                return
        }

        public void onSelectedChanged(@androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerView.ViewHolder r1, int r2) {
                r0 = this;
                if (r1 == 0) goto L9
                androidx.recyclerview.widget.ItemTouchUIUtil r2 = androidx.recyclerview.widget.ItemTouchUIUtilImpl.INSTANCE
                android.view.View r1 = r1.itemView
                r2.onSelected(r1)
            L9:
                return
        }

        public abstract void onSwiped(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r1, int r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class ItemTouchHelperGestureListener extends android.view.GestureDetector.SimpleOnGestureListener {
        private boolean mShouldReactToLongPress;
        final /* synthetic */ androidx.recyclerview.widget.ItemTouchHelper this$0;

        ItemTouchHelperGestureListener(androidx.recyclerview.widget.ItemTouchHelper r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r1 = 1
                r0.mShouldReactToLongPress = r1
                return
        }

        void doNotReactToLongPress() {
                r1 = this;
                r0 = 0
                r1.mShouldReactToLongPress = r0
                return
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(android.view.MotionEvent r1) {
                r0 = this;
                r1 = 1
                return r1
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(android.view.MotionEvent r4) {
                r3 = this;
                boolean r0 = r3.mShouldReactToLongPress
                if (r0 != 0) goto L5
                goto L54
            L5:
                androidx.recyclerview.widget.ItemTouchHelper r0 = r3.this$0
                android.view.View r0 = r0.findChildView(r4)
                if (r0 == 0) goto L54
                androidx.recyclerview.widget.ItemTouchHelper r1 = r3.this$0
                androidx.recyclerview.widget.RecyclerView r1 = r1.mRecyclerView
                androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r1.getChildViewHolder(r0)
                if (r0 == 0) goto L54
                androidx.recyclerview.widget.ItemTouchHelper r1 = r3.this$0
                androidx.recyclerview.widget.ItemTouchHelper$Callback r2 = r1.mCallback
                androidx.recyclerview.widget.RecyclerView r1 = r1.mRecyclerView
                boolean r1 = r2.hasDragFlag(r1, r0)
                if (r1 != 0) goto L24
                goto L54
            L24:
                r1 = 0
                int r1 = r4.getPointerId(r1)
                androidx.recyclerview.widget.ItemTouchHelper r2 = r3.this$0
                int r2 = r2.mActivePointerId
                if (r1 != r2) goto L54
                int r1 = r4.findPointerIndex(r2)
                float r2 = r4.getX(r1)
                float r4 = r4.getY(r1)
                androidx.recyclerview.widget.ItemTouchHelper r1 = r3.this$0
                r1.mInitialTouchX = r2
                r1.mInitialTouchY = r4
                r4 = 0
                r1.mDy = r4
                r1.mDx = r4
                androidx.recyclerview.widget.ItemTouchHelper$Callback r4 = r1.mCallback
                boolean r4 = r4.isLongPressDragEnabled()
                if (r4 == 0) goto L54
                androidx.recyclerview.widget.ItemTouchHelper r4 = r3.this$0
                r1 = 2
                r4.select(r0, r1)
            L54:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.VisibleForTesting
    static class RecoverAnimation implements android.animation.Animator.AnimatorListener {
        final int mActionState;
        final int mAnimationType;
        boolean mEnded;
        private float mFraction;
        boolean mIsPendingCleanup;
        boolean mOverridden;
        final float mStartDx;
        final float mStartDy;
        final float mTargetX;
        final float mTargetY;

        @androidx.annotation.VisibleForTesting
        final android.animation.ValueAnimator mValueAnimator;
        final androidx.recyclerview.widget.RecyclerView.ViewHolder mViewHolder;
        float mX;
        float mY;


        RecoverAnimation(androidx.recyclerview.widget.RecyclerView.ViewHolder r2, int r3, int r4, float r5, float r6, float r7, float r8) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mOverridden = r0
                r1.mEnded = r0
                r1.mActionState = r4
                r1.mAnimationType = r3
                r1.mViewHolder = r2
                r1.mStartDx = r5
                r1.mStartDy = r6
                r1.mTargetX = r7
                r1.mTargetY = r8
                r3 = 2
                float[] r3 = new float[r3]
                r3 = {x0038: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
                android.animation.ValueAnimator r3 = android.animation.ValueAnimator.ofFloat(r3)
                r1.mValueAnimator = r3
                androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation$1 r4 = new androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation$1
                r4.<init>(r1)
                r3.addUpdateListener(r4)
                android.view.View r2 = r2.itemView
                r3.setTarget(r2)
                r3.addListener(r1)
                r2 = 0
                r1.setFraction(r2)
                return
        }

        public void cancel() {
                r1 = this;
                android.animation.ValueAnimator r0 = r1.mValueAnimator
                r0.cancel()
                return
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator r1) {
                r0 = this;
                r1 = 1065353216(0x3f800000, float:1.0)
                r0.setFraction(r1)
                return
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r2) {
                r1 = this;
                boolean r2 = r1.mEnded
                r0 = 1
                if (r2 != 0) goto La
                androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = r1.mViewHolder
                r2.setIsRecyclable(r0)
            La:
                r1.mEnded = r0
                return
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(android.animation.Animator r1) {
                r0 = this;
                return
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r1) {
                r0 = this;
                return
        }

        public void setDuration(long r2) {
                r1 = this;
                android.animation.ValueAnimator r0 = r1.mValueAnimator
                r0.setDuration(r2)
                return
        }

        public void setFraction(float r1) {
                r0 = this;
                r0.mFraction = r1
                return
        }

        public void start() {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r2.mViewHolder
                r1 = 0
                r0.setIsRecyclable(r1)
                android.animation.ValueAnimator r0 = r2.mValueAnimator
                r0.start()
                return
        }

        public void update() {
                r3 = this;
                float r0 = r3.mStartDx
                float r1 = r3.mTargetX
                int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r2 != 0) goto L13
                androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r3.mViewHolder
                android.view.View r0 = r0.itemView
                float r0 = r0.getTranslationX()
                r3.mX = r0
                goto L1b
            L13:
                float r2 = r3.mFraction
                float r1 = r1 - r0
                float r2 = r2 * r1
                float r0 = r0 + r2
                r3.mX = r0
            L1b:
                float r0 = r3.mStartDy
                float r1 = r3.mTargetY
                int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r2 != 0) goto L2e
                androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r3.mViewHolder
                android.view.View r0 = r0.itemView
                float r0 = r0.getTranslationY()
                r3.mY = r0
                return
            L2e:
                float r2 = r3.mFraction
                float r1 = r1 - r0
                float r2 = r2 * r1
                float r0 = r0 + r2
                r3.mY = r0
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class SimpleCallback extends androidx.recyclerview.widget.ItemTouchHelper.Callback {
        private int mDefaultDragDirs;
        private int mDefaultSwipeDirs;

        public SimpleCallback(int r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.mDefaultSwipeDirs = r2
                r0.mDefaultDragDirs = r1
                return
        }

        public int getDragDirs(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r1, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r2) {
                r0 = this;
                int r1 = r0.mDefaultDragDirs
                return r1
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public int getMovementFlags(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r2, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r3) {
                r1 = this;
                int r0 = r1.getDragDirs(r2, r3)
                int r2 = r1.getSwipeDirs(r2, r3)
                int r2 = androidx.recyclerview.widget.ItemTouchHelper.Callback.makeMovementFlags(r0, r2)
                return r2
        }

        public int getSwipeDirs(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r1, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r2) {
                r0 = this;
                int r1 = r0.mDefaultSwipeDirs
                return r1
        }

        public void setDefaultDragDirs(int r1) {
                r0 = this;
                r0.mDefaultDragDirs = r1
                return
        }

        public void setDefaultSwipeDirs(int r1) {
                r0 = this;
                r0.mDefaultSwipeDirs = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface ViewDropHandler {
        void prepareForDrop(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.NonNull android.view.View r2, int r3, int r4);
    }

    public ItemTouchHelper(@androidx.annotation.NonNull androidx.recyclerview.widget.ItemTouchHelper.Callback r4) {
            r3 = this;
            r3.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.mPendingCleanup = r0
            r0 = 2
            float[] r0 = new float[r0]
            r3.mTmpPosition = r0
            r0 = 0
            r3.mSelected = r0
            r1 = -1
            r3.mActivePointerId = r1
            r2 = 0
            r3.mActionState = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3.mRecoverAnimations = r2
            androidx.recyclerview.widget.ItemTouchHelper$1 r2 = new androidx.recyclerview.widget.ItemTouchHelper$1
            r2.<init>(r3)
            r3.mScrollRunnable = r2
            r3.mChildDrawingOrderCallback = r0
            r3.mOverdrawChild = r0
            r3.mOverdrawChildPosition = r1
            androidx.recyclerview.widget.ItemTouchHelper$2 r0 = new androidx.recyclerview.widget.ItemTouchHelper$2
            r0.<init>(r3)
            r3.mOnItemTouchListener = r0
            r3.mCallback = r4
            return
    }

    private void addChildDrawingOrderCallback() {
            r0 = this;
            return
    }

    private int checkHorizontalSwipe(androidx.recyclerview.widget.RecyclerView.ViewHolder r8, int r9) {
            r7 = this;
            r0 = r9 & 12
            if (r0 == 0) goto L7b
            float r0 = r7.mDx
            r1 = 4
            r2 = 8
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L11
            r0 = 8
            goto L12
        L11:
            r0 = 4
        L12:
            android.view.VelocityTracker r4 = r7.mVelocityTracker
            if (r4 == 0) goto L5d
            int r5 = r7.mActivePointerId
            r6 = -1
            if (r5 <= r6) goto L5d
            androidx.recyclerview.widget.ItemTouchHelper$Callback r5 = r7.mCallback
            float r6 = r7.mMaxSwipeVelocity
            float r5 = r5.getSwipeVelocityThreshold(r6)
            r6 = 1000(0x3e8, float:1.401E-42)
            r4.computeCurrentVelocity(r6, r5)
            android.view.VelocityTracker r4 = r7.mVelocityTracker
            int r5 = r7.mActivePointerId
            float r4 = r4.getXVelocity(r5)
            android.view.VelocityTracker r5 = r7.mVelocityTracker
            int r6 = r7.mActivePointerId
            float r5 = r5.getYVelocity(r6)
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 <= 0) goto L3e
            r1 = 8
        L3e:
            float r2 = java.lang.Math.abs(r4)
            r3 = r1 & r9
            if (r3 == 0) goto L5d
            if (r0 != r1) goto L5d
            androidx.recyclerview.widget.ItemTouchHelper$Callback r3 = r7.mCallback
            float r4 = r7.mSwipeEscapeVelocity
            float r3 = r3.getSwipeEscapeVelocity(r4)
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 < 0) goto L5d
            float r3 = java.lang.Math.abs(r5)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L5d
            return r1
        L5d:
            androidx.recyclerview.widget.RecyclerView r1 = r7.mRecyclerView
            int r1 = r1.getWidth()
            float r1 = (float) r1
            androidx.recyclerview.widget.ItemTouchHelper$Callback r2 = r7.mCallback
            float r8 = r2.getSwipeThreshold(r8)
            float r1 = r1 * r8
            r8 = r9 & r0
            if (r8 == 0) goto L7b
            float r8 = r7.mDx
            float r8 = java.lang.Math.abs(r8)
            int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r8 <= 0) goto L7b
            return r0
        L7b:
            r8 = 0
            return r8
    }

    private int checkVerticalSwipe(androidx.recyclerview.widget.RecyclerView.ViewHolder r8, int r9) {
            r7 = this;
            r0 = r9 & 3
            if (r0 == 0) goto L78
            float r0 = r7.mDy
            r1 = 1
            r2 = 2
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto Lf
            r0 = 2
            goto L10
        Lf:
            r0 = 1
        L10:
            android.view.VelocityTracker r4 = r7.mVelocityTracker
            if (r4 == 0) goto L5a
            int r5 = r7.mActivePointerId
            r6 = -1
            if (r5 <= r6) goto L5a
            androidx.recyclerview.widget.ItemTouchHelper$Callback r5 = r7.mCallback
            float r6 = r7.mMaxSwipeVelocity
            float r5 = r5.getSwipeVelocityThreshold(r6)
            r6 = 1000(0x3e8, float:1.401E-42)
            r4.computeCurrentVelocity(r6, r5)
            android.view.VelocityTracker r4 = r7.mVelocityTracker
            int r5 = r7.mActivePointerId
            float r4 = r4.getXVelocity(r5)
            android.view.VelocityTracker r5 = r7.mVelocityTracker
            int r6 = r7.mActivePointerId
            float r5 = r5.getYVelocity(r6)
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 <= 0) goto L3b
            r1 = 2
        L3b:
            float r2 = java.lang.Math.abs(r5)
            r3 = r1 & r9
            if (r3 == 0) goto L5a
            if (r1 != r0) goto L5a
            androidx.recyclerview.widget.ItemTouchHelper$Callback r3 = r7.mCallback
            float r5 = r7.mSwipeEscapeVelocity
            float r3 = r3.getSwipeEscapeVelocity(r5)
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 < 0) goto L5a
            float r3 = java.lang.Math.abs(r4)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L5a
            return r1
        L5a:
            androidx.recyclerview.widget.RecyclerView r1 = r7.mRecyclerView
            int r1 = r1.getHeight()
            float r1 = (float) r1
            androidx.recyclerview.widget.ItemTouchHelper$Callback r2 = r7.mCallback
            float r8 = r2.getSwipeThreshold(r8)
            float r1 = r1 * r8
            r8 = r9 & r0
            if (r8 == 0) goto L78
            float r8 = r7.mDy
            float r8 = java.lang.Math.abs(r8)
            int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r8 <= 0) goto L78
            return r0
        L78:
            r8 = 0
            return r8
    }

    private void destroyCallbacks() {
            r4 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r4.mRecyclerView
            r0.removeItemDecoration(r4)
            androidx.recyclerview.widget.RecyclerView r0 = r4.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$OnItemTouchListener r1 = r4.mOnItemTouchListener
            r0.removeOnItemTouchListener(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r4.mRecyclerView
            r0.removeOnChildAttachStateChangeListener(r4)
            java.util.List<androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation> r0 = r4.mRecoverAnimations
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L19:
            if (r0 < 0) goto L33
            java.util.List<androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation> r1 = r4.mRecoverAnimations
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation r1 = (androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation) r1
            r1.cancel()
            androidx.recyclerview.widget.ItemTouchHelper$Callback r2 = r4.mCallback
            androidx.recyclerview.widget.RecyclerView r3 = r4.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = r1.mViewHolder
            r2.clearView(r3, r1)
            int r0 = r0 + (-1)
            goto L19
        L33:
            java.util.List<androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation> r0 = r4.mRecoverAnimations
            r0.clear()
            r0 = 0
            r4.mOverdrawChild = r0
            r0 = -1
            r4.mOverdrawChildPosition = r0
            r4.releaseVelocityTracker()
            r4.stopGestureDetection()
            return
    }

    private java.util.List<androidx.recyclerview.widget.RecyclerView.ViewHolder> findSwapTargets(androidx.recyclerview.widget.RecyclerView.ViewHolder r17) {
            r16 = this;
            r0 = r16
            r1 = r17
            java.util.List<androidx.recyclerview.widget.RecyclerView$ViewHolder> r2 = r0.mSwapTargets
            if (r2 != 0) goto L17
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.mSwapTargets = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.mDistances = r2
            goto L1f
        L17:
            r2.clear()
            java.util.List<java.lang.Integer> r2 = r0.mDistances
            r2.clear()
        L1f:
            androidx.recyclerview.widget.ItemTouchHelper$Callback r2 = r0.mCallback
            int r2 = r2.getBoundingBoxMargin()
            float r3 = r0.mSelectedStartX
            float r4 = r0.mDx
            float r3 = r3 + r4
            int r3 = java.lang.Math.round(r3)
            int r3 = r3 - r2
            float r4 = r0.mSelectedStartY
            float r5 = r0.mDy
            float r4 = r4 + r5
            int r4 = java.lang.Math.round(r4)
            int r4 = r4 - r2
            android.view.View r5 = r1.itemView
            int r5 = r5.getWidth()
            int r5 = r5 + r3
            int r2 = r2 * 2
            int r5 = r5 + r2
            android.view.View r6 = r1.itemView
            int r6 = r6.getHeight()
            int r6 = r6 + r4
            int r6 = r6 + r2
            int r2 = r3 + r5
            int r2 = r2 / 2
            int r7 = r4 + r6
            int r7 = r7 / 2
            androidx.recyclerview.widget.RecyclerView r8 = r0.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$LayoutManager r8 = r8.getLayoutManager()
            int r9 = r8.getChildCount()
            r11 = 0
        L5e:
            if (r11 >= r9) goto Lef
            android.view.View r12 = r8.getChildAt(r11)
            android.view.View r13 = r1.itemView
            if (r12 != r13) goto L6a
            goto Le9
        L6a:
            int r13 = r12.getBottom()
            if (r13 < r4) goto Le9
            int r13 = r12.getTop()
            if (r13 > r6) goto Le9
            int r13 = r12.getRight()
            if (r13 < r3) goto Le9
            int r13 = r12.getLeft()
            if (r13 <= r5) goto L83
            goto Le9
        L83:
            androidx.recyclerview.widget.RecyclerView r13 = r0.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$ViewHolder r13 = r13.getChildViewHolder(r12)
            androidx.recyclerview.widget.ItemTouchHelper$Callback r14 = r0.mCallback
            androidx.recyclerview.widget.RecyclerView r15 = r0.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$ViewHolder r10 = r0.mSelected
            boolean r10 = r14.canDropOver(r15, r10, r13)
            if (r10 == 0) goto Le9
            int r10 = r12.getLeft()
            int r14 = r12.getRight()
            int r10 = r10 + r14
            int r10 = r10 / 2
            int r10 = r2 - r10
            int r10 = java.lang.Math.abs(r10)
            int r14 = r12.getTop()
            int r12 = r12.getBottom()
            int r14 = r14 + r12
            int r14 = r14 / 2
            int r12 = r7 - r14
            int r12 = java.lang.Math.abs(r12)
            int r10 = r10 * r10
            int r12 = r12 * r12
            int r10 = r10 + r12
            java.util.List<androidx.recyclerview.widget.RecyclerView$ViewHolder> r12 = r0.mSwapTargets
            int r12 = r12.size()
            r14 = 0
            r15 = 0
        Lc4:
            if (r14 >= r12) goto Ldb
            java.util.List<java.lang.Integer> r1 = r0.mDistances
            java.lang.Object r1 = r1.get(r14)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r10 <= r1) goto Ldb
            int r15 = r15 + 1
            int r14 = r14 + 1
            r1 = r17
            goto Lc4
        Ldb:
            java.util.List<androidx.recyclerview.widget.RecyclerView$ViewHolder> r1 = r0.mSwapTargets
            r1.add(r15, r13)
            java.util.List<java.lang.Integer> r1 = r0.mDistances
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r1.add(r15, r10)
        Le9:
            int r11 = r11 + 1
            r1 = r17
            goto L5e
        Lef:
            java.util.List<androidx.recyclerview.widget.RecyclerView$ViewHolder> r1 = r0.mSwapTargets
            return r1
    }

    private androidx.recyclerview.widget.RecyclerView.ViewHolder findSwipedView(android.view.MotionEvent r7) {
            r6 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r6.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
            int r1 = r6.mActivePointerId
            r2 = -1
            r3 = 0
            if (r1 != r2) goto Ld
            return r3
        Ld:
            int r1 = r7.findPointerIndex(r1)
            float r2 = r7.getX(r1)
            float r4 = r6.mInitialTouchX
            float r2 = r2 - r4
            float r1 = r7.getY(r1)
            float r4 = r6.mInitialTouchY
            float r1 = r1 - r4
            float r2 = java.lang.Math.abs(r2)
            float r1 = java.lang.Math.abs(r1)
            int r4 = r6.mSlop
            float r5 = (float) r4
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 >= 0) goto L34
            float r4 = (float) r4
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 >= 0) goto L34
            return r3
        L34:
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L3f
            boolean r4 = r0.canScrollHorizontally()
            if (r4 == 0) goto L3f
            return r3
        L3f:
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L4a
            boolean r0 = r0.canScrollVertically()
            if (r0 == 0) goto L4a
            return r3
        L4a:
            android.view.View r7 = r6.findChildView(r7)
            if (r7 != 0) goto L51
            return r3
        L51:
            androidx.recyclerview.widget.RecyclerView r0 = r6.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$ViewHolder r7 = r0.getChildViewHolder(r7)
            return r7
    }

    private void getSelectedDxDy(float[] r4) {
            r3 = this;
            int r0 = r3.mSelectedFlags
            r0 = r0 & 12
            r1 = 0
            if (r0 == 0) goto L19
            float r0 = r3.mSelectedStartX
            float r2 = r3.mDx
            float r0 = r0 + r2
            androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = r3.mSelected
            android.view.View r2 = r2.itemView
            int r2 = r2.getLeft()
            float r2 = (float) r2
            float r0 = r0 - r2
            r4[r1] = r0
            goto L23
        L19:
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r3.mSelected
            android.view.View r0 = r0.itemView
            float r0 = r0.getTranslationX()
            r4[r1] = r0
        L23:
            int r0 = r3.mSelectedFlags
            r0 = r0 & 3
            r1 = 1
            if (r0 == 0) goto L3c
            float r0 = r3.mSelectedStartY
            float r2 = r3.mDy
            float r0 = r0 + r2
            androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = r3.mSelected
            android.view.View r2 = r2.itemView
            int r2 = r2.getTop()
            float r2 = (float) r2
            float r0 = r0 - r2
            r4[r1] = r0
            return
        L3c:
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r3.mSelected
            android.view.View r0 = r0.itemView
            float r0 = r0.getTranslationY()
            r4[r1] = r0
            return
    }

    private static boolean hitTest(android.view.View r1, float r2, float r3, float r4, float r5) {
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L1e
            int r0 = r1.getWidth()
            float r0 = (float) r0
            float r4 = r4 + r0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L1e
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 < 0) goto L1e
            int r1 = r1.getHeight()
            float r1 = (float) r1
            float r5 = r5 + r1
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 > 0) goto L1e
            r1 = 1
            return r1
        L1e:
            r1 = 0
            return r1
    }

    private void releaseVelocityTracker() {
            r1 = this;
            android.view.VelocityTracker r0 = r1.mVelocityTracker
            if (r0 == 0) goto La
            r0.recycle()
            r0 = 0
            r1.mVelocityTracker = r0
        La:
            return
    }

    private void setupCallbacks() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
            android.content.Context r0 = r0.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r2.mSlop = r0
            androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
            r0.addItemDecoration(r2)
            androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$OnItemTouchListener r1 = r2.mOnItemTouchListener
            r0.addOnItemTouchListener(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
            r0.addOnChildAttachStateChangeListener(r2)
            r2.startGestureDetection()
            return
    }

    private void startGestureDetection() {
            r3 = this;
            androidx.recyclerview.widget.ItemTouchHelper$ItemTouchHelperGestureListener r0 = new androidx.recyclerview.widget.ItemTouchHelper$ItemTouchHelperGestureListener
            r0.<init>(r3)
            r3.mItemTouchHelperGestureListener = r0
            androidx.core.view.GestureDetectorCompat r0 = new androidx.core.view.GestureDetectorCompat
            androidx.recyclerview.widget.RecyclerView r1 = r3.mRecyclerView
            android.content.Context r1 = r1.getContext()
            androidx.recyclerview.widget.ItemTouchHelper$ItemTouchHelperGestureListener r2 = r3.mItemTouchHelperGestureListener
            r0.<init>(r1, r2)
            r3.mGestureDetector = r0
            return
    }

    private void stopGestureDetection() {
            r2 = this;
            androidx.recyclerview.widget.ItemTouchHelper$ItemTouchHelperGestureListener r0 = r2.mItemTouchHelperGestureListener
            r1 = 0
            if (r0 == 0) goto La
            r0.doNotReactToLongPress()
            r2.mItemTouchHelperGestureListener = r1
        La:
            androidx.core.view.GestureDetectorCompat r0 = r2.mGestureDetector
            if (r0 == 0) goto L10
            r2.mGestureDetector = r1
        L10:
            return
    }

    private int swipeIfNecessary(androidx.recyclerview.widget.RecyclerView.ViewHolder r6) {
            r5 = this;
            int r0 = r5.mActionState
            r1 = 2
            r2 = 0
            if (r0 != r1) goto L7
            return r2
        L7:
            androidx.recyclerview.widget.ItemTouchHelper$Callback r0 = r5.mCallback
            androidx.recyclerview.widget.RecyclerView r1 = r5.mRecyclerView
            int r0 = r0.getMovementFlags(r1, r6)
            androidx.recyclerview.widget.ItemTouchHelper$Callback r1 = r5.mCallback
            androidx.recyclerview.widget.RecyclerView r3 = r5.mRecyclerView
            int r3 = androidx.core.view.ViewCompat.getLayoutDirection(r3)
            int r1 = r1.convertToAbsoluteDirection(r0, r3)
            r3 = 65280(0xff00, float:9.1477E-41)
            r1 = r1 & r3
            int r1 = r1 >> 8
            if (r1 != 0) goto L24
            return r2
        L24:
            r0 = r0 & r3
            int r0 = r0 >> 8
            float r3 = r5.mDx
            float r3 = java.lang.Math.abs(r3)
            float r4 = r5.mDy
            float r4 = java.lang.Math.abs(r4)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L54
            int r3 = r5.checkHorizontalSwipe(r6, r1)
            if (r3 <= 0) goto L4d
            r6 = r0 & r3
            if (r6 != 0) goto L4c
            androidx.recyclerview.widget.RecyclerView r6 = r5.mRecyclerView
            int r6 = androidx.core.view.ViewCompat.getLayoutDirection(r6)
            int r6 = androidx.recyclerview.widget.ItemTouchHelper.Callback.convertToRelativeDirection(r3, r6)
            return r6
        L4c:
            return r3
        L4d:
            int r6 = r5.checkVerticalSwipe(r6, r1)
            if (r6 <= 0) goto L6f
            return r6
        L54:
            int r3 = r5.checkVerticalSwipe(r6, r1)
            if (r3 <= 0) goto L5b
            return r3
        L5b:
            int r6 = r5.checkHorizontalSwipe(r6, r1)
            if (r6 <= 0) goto L6f
            r0 = r0 & r6
            if (r0 != 0) goto L6e
            androidx.recyclerview.widget.RecyclerView r0 = r5.mRecyclerView
            int r0 = androidx.core.view.ViewCompat.getLayoutDirection(r0)
            int r6 = androidx.recyclerview.widget.ItemTouchHelper.Callback.convertToRelativeDirection(r6, r0)
        L6e:
            return r6
        L6f:
            return r2
    }

    public void attachToRecyclerView(@androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerView r2) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
            if (r0 != r2) goto L5
            goto L25
        L5:
            if (r0 == 0) goto La
            r1.destroyCallbacks()
        La:
            r1.mRecyclerView = r2
            if (r2 == 0) goto L25
            android.content.res.Resources r2 = r2.getResources()
            int r0 = androidx.recyclerview.R.dimen.item_touch_helper_swipe_escape_velocity
            float r0 = r2.getDimension(r0)
            r1.mSwipeEscapeVelocity = r0
            int r0 = androidx.recyclerview.R.dimen.item_touch_helper_swipe_escape_max_velocity
            float r2 = r2.getDimension(r0)
            r1.mMaxSwipeVelocity = r2
            r1.setupCallbacks()
        L25:
            return
    }

    void checkSelectForSwipe(int r9, android.view.MotionEvent r10, int r11) {
            r8 = this;
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r8.mSelected
            if (r0 != 0) goto L93
            r0 = 2
            if (r9 != r0) goto L93
            int r9 = r8.mActionState
            if (r9 == r0) goto L93
            androidx.recyclerview.widget.ItemTouchHelper$Callback r9 = r8.mCallback
            boolean r9 = r9.isItemViewSwipeEnabled()
            if (r9 != 0) goto L15
            goto L93
        L15:
            androidx.recyclerview.widget.RecyclerView r9 = r8.mRecyclerView
            int r9 = r9.getScrollState()
            r1 = 1
            if (r9 != r1) goto L20
            goto L93
        L20:
            androidx.recyclerview.widget.RecyclerView$ViewHolder r9 = r8.findSwipedView(r10)
            if (r9 != 0) goto L28
            goto L93
        L28:
            androidx.recyclerview.widget.ItemTouchHelper$Callback r2 = r8.mCallback
            androidx.recyclerview.widget.RecyclerView r3 = r8.mRecyclerView
            int r2 = r2.getAbsoluteMovementFlags(r3, r9)
            r3 = 65280(0xff00, float:9.1477E-41)
            r2 = r2 & r3
            int r2 = r2 >> 8
            if (r2 != 0) goto L39
            goto L93
        L39:
            float r3 = r10.getX(r11)
            float r11 = r10.getY(r11)
            float r4 = r8.mInitialTouchX
            float r3 = r3 - r4
            float r4 = r8.mInitialTouchY
            float r11 = r11 - r4
            float r4 = java.lang.Math.abs(r3)
            float r5 = java.lang.Math.abs(r11)
            int r6 = r8.mSlop
            float r7 = (float) r6
            int r7 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r7 >= 0) goto L5c
            float r6 = (float) r6
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 >= 0) goto L5c
            goto L93
        L5c:
            r6 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L73
            int r11 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r11 >= 0) goto L6a
            r11 = r2 & 4
            if (r11 != 0) goto L6a
            goto L93
        L6a:
            int r11 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r11 <= 0) goto L85
            r11 = r2 & 8
            if (r11 != 0) goto L85
            goto L93
        L73:
            int r3 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r3 >= 0) goto L7c
            r3 = r2 & 1
            if (r3 != 0) goto L7c
            goto L93
        L7c:
            int r11 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r11 <= 0) goto L85
            r11 = r2 & 2
            if (r11 != 0) goto L85
            goto L93
        L85:
            r8.mDy = r6
            r8.mDx = r6
            r11 = 0
            int r10 = r10.getPointerId(r11)
            r8.mActivePointerId = r10
            r8.select(r9, r1)
        L93:
            return
    }

    void endRecoverAnimation(androidx.recyclerview.widget.RecyclerView.ViewHolder r4, boolean r5) {
            r3 = this;
            java.util.List<androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation> r0 = r3.mRecoverAnimations
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L2b
            java.util.List<androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation> r1 = r3.mRecoverAnimations
            java.lang.Object r1 = r1.get(r0)
            androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation r1 = (androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation) r1
            androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = r1.mViewHolder
            if (r2 != r4) goto L28
            boolean r4 = r1.mOverridden
            r4 = r4 | r5
            r1.mOverridden = r4
            boolean r4 = r1.mEnded
            if (r4 != 0) goto L22
            r1.cancel()
        L22:
            java.util.List<androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation> r4 = r3.mRecoverAnimations
            r4.remove(r0)
            return
        L28:
            int r0 = r0 + (-1)
            goto L8
        L2b:
            return
    }

    androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation findAnimation(android.view.MotionEvent r5) {
            r4 = this;
            java.util.List<androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation> r0 = r4.mRecoverAnimations
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto La
            return r1
        La:
            android.view.View r5 = r4.findChildView(r5)
            java.util.List<androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation> r0 = r4.mRecoverAnimations
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L16:
            if (r0 < 0) goto L2a
            java.util.List<androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation> r2 = r4.mRecoverAnimations
            java.lang.Object r2 = r2.get(r0)
            androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation r2 = (androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation) r2
            androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = r2.mViewHolder
            android.view.View r3 = r3.itemView
            if (r3 != r5) goto L27
            return r2
        L27:
            int r0 = r0 + (-1)
            goto L16
        L2a:
            return r1
    }

    android.view.View findChildView(android.view.MotionEvent r6) {
            r5 = this;
            float r0 = r6.getX()
            float r6 = r6.getY()
            androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = r5.mSelected
            if (r1 == 0) goto L1f
            android.view.View r1 = r1.itemView
            float r2 = r5.mSelectedStartX
            float r3 = r5.mDx
            float r2 = r2 + r3
            float r3 = r5.mSelectedStartY
            float r4 = r5.mDy
            float r3 = r3 + r4
            boolean r2 = hitTest(r1, r0, r6, r2, r3)
            if (r2 == 0) goto L1f
            return r1
        L1f:
            java.util.List<androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation> r1 = r5.mRecoverAnimations
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L27:
            if (r1 < 0) goto L43
            java.util.List<androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation> r2 = r5.mRecoverAnimations
            java.lang.Object r2 = r2.get(r1)
            androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation r2 = (androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation) r2
            androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = r2.mViewHolder
            android.view.View r3 = r3.itemView
            float r4 = r2.mX
            float r2 = r2.mY
            boolean r2 = hitTest(r3, r0, r6, r4, r2)
            if (r2 == 0) goto L40
            return r3
        L40:
            int r1 = r1 + (-1)
            goto L27
        L43:
            androidx.recyclerview.widget.RecyclerView r1 = r5.mRecyclerView
            android.view.View r6 = r1.findChildViewUnder(r0, r6)
            return r6
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    @android.annotation.SuppressLint({"UnknownNullness"})
    public void getItemOffsets(android.graphics.Rect r1, android.view.View r2, androidx.recyclerview.widget.RecyclerView r3, androidx.recyclerview.widget.RecyclerView.State r4) {
            r0 = this;
            r1.setEmpty()
            return
    }

    boolean hasRunningRecoverAnim() {
            r4 = this;
            java.util.List<androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation> r0 = r4.mRecoverAnimations
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L1b
            java.util.List<androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation> r3 = r4.mRecoverAnimations
            java.lang.Object r3 = r3.get(r2)
            androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation r3 = (androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation) r3
            boolean r3 = r3.mEnded
            if (r3 != 0) goto L18
            r0 = 1
            return r0
        L18:
            int r2 = r2 + 1
            goto L8
        L1b:
            return r1
    }

    void moveIfNecessary(androidx.recyclerview.widget.RecyclerView.ViewHolder r11) {
            r10 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r10.mRecyclerView
            boolean r0 = r0.isLayoutRequested()
            if (r0 == 0) goto La
            goto L90
        La:
            int r0 = r10.mActionState
            r1 = 2
            if (r0 == r1) goto L11
            goto L90
        L11:
            androidx.recyclerview.widget.ItemTouchHelper$Callback r0 = r10.mCallback
            float r0 = r0.getMoveThreshold(r11)
            float r1 = r10.mSelectedStartX
            float r2 = r10.mDx
            float r1 = r1 + r2
            int r8 = (int) r1
            float r1 = r10.mSelectedStartY
            float r2 = r10.mDy
            float r1 = r1 + r2
            int r9 = (int) r1
            android.view.View r1 = r11.itemView
            int r1 = r1.getTop()
            int r1 = r9 - r1
            int r1 = java.lang.Math.abs(r1)
            float r1 = (float) r1
            android.view.View r2 = r11.itemView
            int r2 = r2.getHeight()
            float r2 = (float) r2
            float r2 = r2 * r0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L58
            android.view.View r1 = r11.itemView
            int r1 = r1.getLeft()
            int r1 = r8 - r1
            int r1 = java.lang.Math.abs(r1)
            float r1 = (float) r1
            android.view.View r2 = r11.itemView
            int r2 = r2.getWidth()
            float r2 = (float) r2
            float r2 = r2 * r0
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 >= 0) goto L58
            goto L90
        L58:
            java.util.List r0 = r10.findSwapTargets(r11)
            int r1 = r0.size()
            if (r1 != 0) goto L63
            goto L90
        L63:
            androidx.recyclerview.widget.ItemTouchHelper$Callback r1 = r10.mCallback
            androidx.recyclerview.widget.RecyclerView$ViewHolder r6 = r1.chooseDropTarget(r11, r0, r8, r9)
            if (r6 != 0) goto L76
            java.util.List<androidx.recyclerview.widget.RecyclerView$ViewHolder> r11 = r10.mSwapTargets
            r11.clear()
            java.util.List<java.lang.Integer> r11 = r10.mDistances
            r11.clear()
            return
        L76:
            int r7 = r6.getAbsoluteAdapterPosition()
            int r5 = r11.getAbsoluteAdapterPosition()
            androidx.recyclerview.widget.ItemTouchHelper$Callback r0 = r10.mCallback
            androidx.recyclerview.widget.RecyclerView r1 = r10.mRecyclerView
            boolean r0 = r0.onMove(r1, r11, r6)
            if (r0 == 0) goto L90
            androidx.recyclerview.widget.ItemTouchHelper$Callback r2 = r10.mCallback
            androidx.recyclerview.widget.RecyclerView r3 = r10.mRecyclerView
            r4 = r11
            r2.onMoved(r3, r4, r5, r6, r7, r8, r9)
        L90:
            return
    }

    void obtainVelocityTracker() {
            r1 = this;
            android.view.VelocityTracker r0 = r1.mVelocityTracker
            if (r0 == 0) goto L7
            r0.recycle()
        L7:
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r1.mVelocityTracker = r0
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public void onChildViewAttachedToWindow(@androidx.annotation.NonNull android.view.View r1) {
            r0 = this;
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public void onChildViewDetachedFromWindow(@androidx.annotation.NonNull android.view.View r3) {
            r2 = this;
            r2.removeChildDrawingOrderCallbackIfNecessary(r3)
            androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = r0.getChildViewHolder(r3)
            if (r3 != 0) goto Lc
            goto L2c
        Lc:
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r2.mSelected
            r1 = 0
            if (r0 == 0) goto L18
            if (r3 != r0) goto L18
            r3 = 0
            r2.select(r3, r1)
            return
        L18:
            r2.endRecoverAnimation(r3, r1)
            java.util.List<android.view.View> r0 = r2.mPendingCleanup
            android.view.View r1 = r3.itemView
            boolean r0 = r0.remove(r1)
            if (r0 == 0) goto L2c
            androidx.recyclerview.widget.ItemTouchHelper$Callback r0 = r2.mCallback
            androidx.recyclerview.widget.RecyclerView r1 = r2.mRecyclerView
            r0.clearView(r1, r3)
        L2c:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    @android.annotation.SuppressLint({"UnknownNullness"})
    public void onDraw(android.graphics.Canvas r10, androidx.recyclerview.widget.RecyclerView r11, androidx.recyclerview.widget.RecyclerView.State r12) {
            r9 = this;
            r12 = -1
            r9.mOverdrawChildPosition = r12
            androidx.recyclerview.widget.RecyclerView$ViewHolder r12 = r9.mSelected
            if (r12 == 0) goto L17
            float[] r12 = r9.mTmpPosition
            r9.getSelectedDxDy(r12)
            float[] r12 = r9.mTmpPosition
            r0 = 0
            r0 = r12[r0]
            r1 = 1
            r12 = r12[r1]
            r8 = r12
            r7 = r0
            goto L1a
        L17:
            r0 = 0
            r7 = 0
            r8 = 0
        L1a:
            androidx.recyclerview.widget.ItemTouchHelper$Callback r1 = r9.mCallback
            androidx.recyclerview.widget.RecyclerView$ViewHolder r4 = r9.mSelected
            java.util.List<androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation> r5 = r9.mRecoverAnimations
            int r6 = r9.mActionState
            r2 = r10
            r3 = r11
            r1.onDraw(r2, r3, r4, r5, r6, r7, r8)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(@androidx.annotation.NonNull android.graphics.Canvas r10, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r11, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r12) {
            r9 = this;
            androidx.recyclerview.widget.RecyclerView$ViewHolder r12 = r9.mSelected
            if (r12 == 0) goto L14
            float[] r12 = r9.mTmpPosition
            r9.getSelectedDxDy(r12)
            float[] r12 = r9.mTmpPosition
            r0 = 0
            r0 = r12[r0]
            r1 = 1
            r12 = r12[r1]
            r8 = r12
            r7 = r0
            goto L17
        L14:
            r0 = 0
            r7 = 0
            r8 = 0
        L17:
            androidx.recyclerview.widget.ItemTouchHelper$Callback r1 = r9.mCallback
            androidx.recyclerview.widget.RecyclerView$ViewHolder r4 = r9.mSelected
            java.util.List<androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation> r5 = r9.mRecoverAnimations
            int r6 = r9.mActionState
            r2 = r10
            r3 = r11
            r1.onDrawOver(r2, r3, r4, r5, r6, r7, r8)
            return
    }

    void postDispatchSwipe(androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation r3, int r4) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
            androidx.recyclerview.widget.ItemTouchHelper$4 r1 = new androidx.recyclerview.widget.ItemTouchHelper$4
            r1.<init>(r2, r3, r4)
            r0.post(r1)
            return
    }

    void removeChildDrawingOrderCallbackIfNecessary(android.view.View r2) {
            r1 = this;
            android.view.View r0 = r1.mOverdrawChild
            if (r2 != r0) goto L10
            r2 = 0
            r1.mOverdrawChild = r2
            androidx.recyclerview.widget.RecyclerView$ChildDrawingOrderCallback r0 = r1.mChildDrawingOrderCallback
            if (r0 == 0) goto L10
            androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
            r0.setChildDrawingOrderCallback(r2)
        L10:
            return
    }

    boolean scrollIfNecessary() {
            r15 = this;
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r15.mSelected
            r1 = 0
            r2 = -9223372036854775808
            if (r0 != 0) goto La
            r15.mDragScrollStartTimeInMs = r2
            return r1
        La:
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = r15.mDragScrollStartTimeInMs
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 != 0) goto L18
            r6 = 0
        L16:
            r13 = r6
            goto L1b
        L18:
            long r6 = r4 - r6
            goto L16
        L1b:
            androidx.recyclerview.widget.RecyclerView r0 = r15.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
            android.graphics.Rect r6 = r15.mTmpRect
            if (r6 != 0) goto L2c
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            r15.mTmpRect = r6
        L2c:
            androidx.recyclerview.widget.RecyclerView$ViewHolder r6 = r15.mSelected
            android.view.View r6 = r6.itemView
            android.graphics.Rect r7 = r15.mTmpRect
            r0.calculateItemDecorationsForChild(r6, r7)
            boolean r6 = r0.canScrollHorizontally()
            r7 = 0
            if (r6 == 0) goto L7d
            float r6 = r15.mSelectedStartX
            float r8 = r15.mDx
            float r6 = r6 + r8
            int r6 = (int) r6
            android.graphics.Rect r8 = r15.mTmpRect
            int r8 = r8.left
            int r8 = r6 - r8
            androidx.recyclerview.widget.RecyclerView r9 = r15.mRecyclerView
            int r9 = r9.getPaddingLeft()
            int r8 = r8 - r9
            float r9 = r15.mDx
            int r10 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r10 >= 0) goto L59
            if (r8 >= 0) goto L59
        L57:
            r11 = r8
            goto L7e
        L59:
            int r8 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r8 <= 0) goto L7d
            androidx.recyclerview.widget.RecyclerView$ViewHolder r8 = r15.mSelected
            android.view.View r8 = r8.itemView
            int r8 = r8.getWidth()
            int r6 = r6 + r8
            android.graphics.Rect r8 = r15.mTmpRect
            int r8 = r8.right
            int r6 = r6 + r8
            androidx.recyclerview.widget.RecyclerView r8 = r15.mRecyclerView
            int r8 = r8.getWidth()
            androidx.recyclerview.widget.RecyclerView r9 = r15.mRecyclerView
            int r9 = r9.getPaddingRight()
            int r8 = r8 - r9
            int r8 = r6 - r8
            if (r8 <= 0) goto L7d
            goto L57
        L7d:
            r11 = 0
        L7e:
            boolean r0 = r0.canScrollVertically()
            if (r0 == 0) goto Lc4
            float r0 = r15.mSelectedStartY
            float r6 = r15.mDy
            float r0 = r0 + r6
            int r0 = (int) r0
            android.graphics.Rect r6 = r15.mTmpRect
            int r6 = r6.top
            int r6 = r0 - r6
            androidx.recyclerview.widget.RecyclerView r8 = r15.mRecyclerView
            int r8 = r8.getPaddingTop()
            int r6 = r6 - r8
            float r8 = r15.mDy
            int r9 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r9 >= 0) goto La0
            if (r6 >= 0) goto La0
            goto Lc5
        La0:
            int r6 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r6 <= 0) goto Lc4
            androidx.recyclerview.widget.RecyclerView$ViewHolder r6 = r15.mSelected
            android.view.View r6 = r6.itemView
            int r6 = r6.getHeight()
            int r0 = r0 + r6
            android.graphics.Rect r6 = r15.mTmpRect
            int r6 = r6.bottom
            int r0 = r0 + r6
            androidx.recyclerview.widget.RecyclerView r6 = r15.mRecyclerView
            int r6 = r6.getHeight()
            androidx.recyclerview.widget.RecyclerView r7 = r15.mRecyclerView
            int r7 = r7.getPaddingBottom()
            int r6 = r6 - r7
            int r6 = r0 - r6
            if (r6 <= 0) goto Lc4
            goto Lc5
        Lc4:
            r6 = 0
        Lc5:
            if (r11 == 0) goto Ldd
            androidx.recyclerview.widget.ItemTouchHelper$Callback r8 = r15.mCallback
            androidx.recyclerview.widget.RecyclerView r9 = r15.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r15.mSelected
            android.view.View r0 = r0.itemView
            int r10 = r0.getWidth()
            androidx.recyclerview.widget.RecyclerView r0 = r15.mRecyclerView
            int r12 = r0.getWidth()
            int r11 = r8.interpolateOutOfBoundsScroll(r9, r10, r11, r12, r13)
        Ldd:
            r0 = r11
            if (r6 == 0) goto Lf8
            androidx.recyclerview.widget.ItemTouchHelper$Callback r8 = r15.mCallback
            androidx.recyclerview.widget.RecyclerView r9 = r15.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$ViewHolder r7 = r15.mSelected
            android.view.View r7 = r7.itemView
            int r10 = r7.getHeight()
            androidx.recyclerview.widget.RecyclerView r7 = r15.mRecyclerView
            int r12 = r7.getHeight()
            r11 = r6
            int r6 = r8.interpolateOutOfBoundsScroll(r9, r10, r11, r12, r13)
            goto Lf9
        Lf8:
            r11 = r6
        Lf9:
            if (r0 != 0) goto L101
            if (r6 == 0) goto Lfe
            goto L101
        Lfe:
            r15.mDragScrollStartTimeInMs = r2
            return r1
        L101:
            long r7 = r15.mDragScrollStartTimeInMs
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 != 0) goto L109
            r15.mDragScrollStartTimeInMs = r4
        L109:
            androidx.recyclerview.widget.RecyclerView r1 = r15.mRecyclerView
            r1.scrollBy(r0, r6)
            r0 = 1
            return r0
    }

    void select(@androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerView.ViewHolder r19, int r20) {
            r18 = this;
            r1 = r18
            r11 = r19
            r12 = r20
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r1.mSelected
            if (r11 != r0) goto Lf
            int r0 = r1.mActionState
            if (r12 != r0) goto Lf
            return
        Lf:
            r2 = -9223372036854775808
            r1.mDragScrollStartTimeInMs = r2
            int r4 = r1.mActionState
            r13 = 1
            r1.endRecoverAnimation(r11, r13)
            r1.mActionState = r12
            r14 = 2
            if (r12 != r14) goto L30
            if (r11 == 0) goto L28
            android.view.View r0 = r11.itemView
            r1.mOverdrawChild = r0
            r1.addChildDrawingOrderCallback()
            goto L30
        L28:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Must pass a ViewHolder when dragging"
            r0.<init>(r2)
            throw r0
        L30:
            int r0 = r12 * 8
            r15 = 8
            int r0 = r0 + r15
            int r0 = r13 << r0
            int r16 = r0 + (-1)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = r1.mSelected
            r0 = 0
            if (r2 == 0) goto Ld0
            android.view.View r3 = r2.itemView
            android.view.ViewParent r3 = r3.getParent()
            if (r3 == 0) goto Lbe
            if (r4 != r14) goto L4a
            r9 = 0
            goto L4f
        L4a:
            int r3 = r1.swipeIfNecessary(r2)
            r9 = r3
        L4f:
            r1.releaseVelocityTracker()
            r3 = 4
            r5 = 0
            if (r9 == r13) goto L78
            if (r9 == r14) goto L78
            if (r9 == r3) goto L67
            if (r9 == r15) goto L67
            r6 = 16
            if (r9 == r6) goto L67
            r6 = 32
            if (r9 == r6) goto L67
            r7 = 0
        L65:
            r8 = 0
            goto L89
        L67:
            float r6 = r1.mDx
            float r6 = java.lang.Math.signum(r6)
            androidx.recyclerview.widget.RecyclerView r7 = r1.mRecyclerView
            int r7 = r7.getWidth()
            float r7 = (float) r7
            float r6 = r6 * r7
            r7 = r6
            goto L65
        L78:
            float r6 = r1.mDy
            float r6 = java.lang.Math.signum(r6)
            androidx.recyclerview.widget.RecyclerView r7 = r1.mRecyclerView
            int r7 = r7.getHeight()
            float r7 = (float) r7
            float r6 = r6 * r7
            r8 = r6
            r7 = 0
        L89:
            if (r4 != r14) goto L8e
            r3 = 8
            goto L91
        L8e:
            if (r9 <= 0) goto L91
            r3 = 2
        L91:
            float[] r5 = r1.mTmpPosition
            r1.getSelectedDxDy(r5)
            float[] r5 = r1.mTmpPosition
            r6 = r5
            r5 = r6[r0]
            r6 = r6[r13]
            r10 = 0
            androidx.recyclerview.widget.ItemTouchHelper$3 r0 = new androidx.recyclerview.widget.ItemTouchHelper$3
            r17 = 0
            r10 = r2
            r13 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            androidx.recyclerview.widget.ItemTouchHelper$Callback r2 = r1.mCallback
            androidx.recyclerview.widget.RecyclerView r4 = r1.mRecyclerView
            float r7 = r7 - r5
            float r8 = r8 - r6
            long r2 = r2.getAnimationDuration(r4, r3, r7, r8)
            r0.setDuration(r2)
            java.util.List<androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation> r2 = r1.mRecoverAnimations
            r2.add(r0)
            r0.start()
            r0 = 1
            goto Lcc
        Lbe:
            r13 = 0
            android.view.View r0 = r2.itemView
            r1.removeChildDrawingOrderCallbackIfNecessary(r0)
            androidx.recyclerview.widget.ItemTouchHelper$Callback r0 = r1.mCallback
            androidx.recyclerview.widget.RecyclerView r3 = r1.mRecyclerView
            r0.clearView(r3, r2)
            r0 = 0
        Lcc:
            r2 = 0
            r1.mSelected = r2
            goto Ld2
        Ld0:
            r13 = 0
            r0 = 0
        Ld2:
            if (r11 == 0) goto L100
            androidx.recyclerview.widget.ItemTouchHelper$Callback r2 = r1.mCallback
            androidx.recyclerview.widget.RecyclerView r3 = r1.mRecyclerView
            int r2 = r2.getAbsoluteMovementFlags(r3, r11)
            r2 = r2 & r16
            int r3 = r1.mActionState
            int r3 = r3 * 8
            int r2 = r2 >> r3
            r1.mSelectedFlags = r2
            android.view.View r2 = r11.itemView
            int r2 = r2.getLeft()
            float r2 = (float) r2
            r1.mSelectedStartX = r2
            android.view.View r2 = r11.itemView
            int r2 = r2.getTop()
            float r2 = (float) r2
            r1.mSelectedStartY = r2
            r1.mSelected = r11
            if (r12 != r14) goto L100
            android.view.View r2 = r11.itemView
            r2.performHapticFeedback(r13)
        L100:
            androidx.recyclerview.widget.RecyclerView r2 = r1.mRecyclerView
            android.view.ViewParent r2 = r2.getParent()
            if (r2 == 0) goto L110
            androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = r1.mSelected
            if (r3 == 0) goto L10d
            r13 = 1
        L10d:
            r2.requestDisallowInterceptTouchEvent(r13)
        L110:
            if (r0 != 0) goto L11b
            androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
            r0.requestSimpleAnimationsInNextLayout()
        L11b:
            androidx.recyclerview.widget.ItemTouchHelper$Callback r0 = r1.mCallback
            androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = r1.mSelected
            int r3 = r1.mActionState
            r0.onSelectedChanged(r2, r3)
            androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
            r0.invalidate()
            return
    }

    public void startDrag(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r3) {
            r2 = this;
            androidx.recyclerview.widget.ItemTouchHelper$Callback r0 = r2.mCallback
            androidx.recyclerview.widget.RecyclerView r1 = r2.mRecyclerView
            boolean r0 = r0.hasDragFlag(r1, r3)
            if (r0 != 0) goto Lb
            return
        Lb:
            android.view.View r0 = r3.itemView
            android.view.ViewParent r0 = r0.getParent()
            androidx.recyclerview.widget.RecyclerView r1 = r2.mRecyclerView
            if (r0 == r1) goto L16
            return
        L16:
            r2.obtainVelocityTracker()
            r0 = 0
            r2.mDy = r0
            r2.mDx = r0
            r0 = 2
            r2.select(r3, r0)
            return
    }

    public void startSwipe(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r3) {
            r2 = this;
            androidx.recyclerview.widget.ItemTouchHelper$Callback r0 = r2.mCallback
            androidx.recyclerview.widget.RecyclerView r1 = r2.mRecyclerView
            boolean r0 = r0.hasSwipeFlag(r1, r3)
            if (r0 != 0) goto Lb
            return
        Lb:
            android.view.View r0 = r3.itemView
            android.view.ViewParent r0 = r0.getParent()
            androidx.recyclerview.widget.RecyclerView r1 = r2.mRecyclerView
            if (r0 == r1) goto L16
            return
        L16:
            r2.obtainVelocityTracker()
            r0 = 0
            r2.mDy = r0
            r2.mDx = r0
            r0 = 1
            r2.select(r3, r0)
            return
    }

    void updateDxDy(android.view.MotionEvent r2, int r3, int r4) {
            r1 = this;
            float r0 = r2.getX(r4)
            float r2 = r2.getY(r4)
            float r4 = r1.mInitialTouchX
            float r0 = r0 - r4
            r1.mDx = r0
            float r4 = r1.mInitialTouchY
            float r2 = r2 - r4
            r1.mDy = r2
            r2 = r3 & 4
            r4 = 0
            if (r2 != 0) goto L1d
            float r2 = java.lang.Math.max(r4, r0)
            r1.mDx = r2
        L1d:
            r2 = r3 & 8
            if (r2 != 0) goto L29
            float r2 = r1.mDx
            float r2 = java.lang.Math.min(r4, r2)
            r1.mDx = r2
        L29:
            r2 = r3 & 1
            if (r2 != 0) goto L35
            float r2 = r1.mDy
            float r2 = java.lang.Math.max(r4, r2)
            r1.mDy = r2
        L35:
            r2 = r3 & 2
            if (r2 != 0) goto L41
            float r2 = r1.mDy
            float r2 = java.lang.Math.min(r4, r2)
            r1.mDy = r2
        L41:
            return
    }
}
