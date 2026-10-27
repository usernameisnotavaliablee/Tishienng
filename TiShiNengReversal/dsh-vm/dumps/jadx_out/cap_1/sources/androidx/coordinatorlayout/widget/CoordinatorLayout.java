package androidx.coordinatorlayout.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class CoordinatorLayout extends android.view.ViewGroup implements androidx.core.view.NestedScrollingParent2, androidx.core.view.NestedScrollingParent3 {
    static final java.lang.Class<?>[] CONSTRUCTOR_PARAMS = null;
    static final int EVENT_NESTED_SCROLL = 1;
    static final int EVENT_PRE_DRAW = 0;
    static final int EVENT_VIEW_REMOVED = 2;
    static final java.lang.String TAG = "CoordinatorLayout";
    static final java.util.Comparator<android.view.View> TOP_SORTED_CHILDREN_COMPARATOR = null;
    private static final int TYPE_ON_INTERCEPT = 0;
    private static final int TYPE_ON_TOUCH = 1;
    static final java.lang.String WIDGET_PACKAGE_NAME = null;
    static final java.lang.ThreadLocal<java.util.Map<java.lang.String, java.lang.reflect.Constructor<androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior>>> sConstructors = null;
    private static final androidx.core.util.Pools.Pool<android.graphics.Rect> sRectPool = null;
    private androidx.core.view.OnApplyWindowInsetsListener mApplyWindowInsetsListener;
    private final int[] mBehaviorConsumed;
    private android.view.View mBehaviorTouchView;
    private final androidx.coordinatorlayout.widget.DirectedAcyclicGraph<android.view.View> mChildDag;
    private final java.util.List<android.view.View> mDependencySortedChildren;
    private boolean mDisallowInterceptReset;
    private boolean mDrawStatusBarBackground;
    private boolean mIsAttachedToWindow;
    private int[] mKeylines;
    private androidx.core.view.WindowInsetsCompat mLastInsets;
    private boolean mNeedsPreDrawListener;
    private final androidx.core.view.NestedScrollingParentHelper mNestedScrollingParentHelper;
    private android.view.View mNestedScrollingTarget;
    private final int[] mNestedScrollingV2ConsumedCompat;
    android.view.ViewGroup.OnHierarchyChangeListener mOnHierarchyChangeListener;
    private androidx.coordinatorlayout.widget.CoordinatorLayout.OnPreDrawListener mOnPreDrawListener;
    private android.graphics.Paint mScrimPaint;
    private android.graphics.drawable.Drawable mStatusBarBackground;
    private final java.util.List<android.view.View> mTempDependenciesList;
    private final java.util.List<android.view.View> mTempList1;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface AttachedBehavior {
        @androidx.annotation.NonNull
        androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior getBehavior();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class Behavior<V extends android.view.View> {
        public Behavior() {
                r0 = this;
                r0.<init>()
                return
        }

        public Behavior(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.Nullable
        public static java.lang.Object getTag(@androidx.annotation.NonNull android.view.View r0) {
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0
                java.lang.Object r0 = r0.mBehaviorTag
                return r0
        }

        public static void setTag(@androidx.annotation.NonNull android.view.View r0, @androidx.annotation.Nullable java.lang.Object r1) {
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0
                r0.mBehaviorTag = r1
                return
        }

        public boolean blocksInteractionBelow(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2) {
                r0 = this;
                float r1 = r0.getScrimOpacity(r1, r2)
                r2 = 0
                int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r1 <= 0) goto Lb
                r1 = 1
                return r1
            Lb:
                r1 = 0
                return r1
        }

        public boolean getInsetDodgeRect(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2, @androidx.annotation.NonNull android.graphics.Rect r3) {
                r0 = this;
                r1 = 0
                return r1
        }

        @androidx.annotation.ColorInt
        public int getScrimColor(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2) {
                r0 = this;
                r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                return r1
        }

        @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d)
        public float getScrimOpacity(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        public boolean layoutDependsOn(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2, @androidx.annotation.NonNull android.view.View r3) {
                r0 = this;
                r1 = 0
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.core.view.WindowInsetsCompat onApplyWindowInsets(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2, @androidx.annotation.NonNull androidx.core.view.WindowInsetsCompat r3) {
                r0 = this;
                return r3
        }

        public void onAttachedToLayoutParams(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams r1) {
                r0 = this;
                return
        }

        public boolean onDependentViewChanged(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2, @androidx.annotation.NonNull android.view.View r3) {
                r0 = this;
                r1 = 0
                return r1
        }

        public void onDependentViewRemoved(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2, @androidx.annotation.NonNull android.view.View r3) {
                r0 = this;
                return
        }

        public void onDetachedFromLayoutParams() {
                r0 = this;
                return
        }

        public boolean onInterceptTouchEvent(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2, @androidx.annotation.NonNull android.view.MotionEvent r3) {
                r0 = this;
                r1 = 0
                return r1
        }

        public boolean onLayoutChild(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2, int r3) {
                r0 = this;
                r1 = 0
                return r1
        }

        public boolean onMeasureChild(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2, int r3, int r4, int r5, int r6) {
                r0 = this;
                r1 = 0
                return r1
        }

        public boolean onNestedFling(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2, @androidx.annotation.NonNull android.view.View r3, float r4, float r5, boolean r6) {
                r0 = this;
                r1 = 0
                return r1
        }

        public boolean onNestedPreFling(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2, @androidx.annotation.NonNull android.view.View r3, float r4, float r5) {
                r0 = this;
                r1 = 0
                return r1
        }

        @java.lang.Deprecated
        public void onNestedPreScroll(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2, @androidx.annotation.NonNull android.view.View r3, int r4, int r5, @androidx.annotation.NonNull int[] r6) {
                r0 = this;
                return
        }

        public void onNestedPreScroll(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2, @androidx.annotation.NonNull android.view.View r3, int r4, int r5, @androidx.annotation.NonNull int[] r6, int r7) {
                r0 = this;
                if (r7 != 0) goto L5
                r0.onNestedPreScroll(r1, r2, r3, r4, r5, r6)
            L5:
                return
        }

        @java.lang.Deprecated
        public void onNestedScroll(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2, @androidx.annotation.NonNull android.view.View r3, int r4, int r5, int r6, int r7) {
                r0 = this;
                return
        }

        @java.lang.Deprecated
        public void onNestedScroll(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2, @androidx.annotation.NonNull android.view.View r3, int r4, int r5, int r6, int r7, int r8) {
                r0 = this;
                if (r8 != 0) goto L5
                r0.onNestedScroll(r1, r2, r3, r4, r5, r6, r7)
            L5:
                return
        }

        public void onNestedScroll(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r3, @androidx.annotation.NonNull V r4, @androidx.annotation.NonNull android.view.View r5, int r6, int r7, int r8, int r9, int r10, @androidx.annotation.NonNull int[] r11) {
                r2 = this;
                r0 = 0
                r1 = r11[r0]
                int r1 = r1 + r8
                r11[r0] = r1
                r0 = 1
                r1 = r11[r0]
                int r1 = r1 + r9
                r11[r0] = r1
                r2.onNestedScroll(r3, r4, r5, r6, r7, r8, r9, r10)
                return
        }

        @java.lang.Deprecated
        public void onNestedScrollAccepted(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2, @androidx.annotation.NonNull android.view.View r3, @androidx.annotation.NonNull android.view.View r4, int r5) {
                r0 = this;
                return
        }

        public void onNestedScrollAccepted(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2, @androidx.annotation.NonNull android.view.View r3, @androidx.annotation.NonNull android.view.View r4, int r5, int r6) {
                r0 = this;
                if (r6 != 0) goto L5
                r0.onNestedScrollAccepted(r1, r2, r3, r4, r5)
            L5:
                return
        }

        public boolean onRequestChildRectangleOnScreen(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2, @androidx.annotation.NonNull android.graphics.Rect r3, boolean r4) {
                r0 = this;
                r1 = 0
                return r1
        }

        public void onRestoreInstanceState(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2, @androidx.annotation.NonNull android.os.Parcelable r3) {
                r0 = this;
                return
        }

        @androidx.annotation.Nullable
        public android.os.Parcelable onSaveInstanceState(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2) {
                r0 = this;
                android.view.AbsSavedState r1 = android.view.View.BaseSavedState.EMPTY_STATE
                return r1
        }

        @java.lang.Deprecated
        public boolean onStartNestedScroll(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2, @androidx.annotation.NonNull android.view.View r3, @androidx.annotation.NonNull android.view.View r4, int r5) {
                r0 = this;
                r1 = 0
                return r1
        }

        public boolean onStartNestedScroll(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2, @androidx.annotation.NonNull android.view.View r3, @androidx.annotation.NonNull android.view.View r4, int r5, int r6) {
                r0 = this;
                if (r6 != 0) goto L7
                boolean r1 = r0.onStartNestedScroll(r1, r2, r3, r4, r5)
                return r1
            L7:
                r1 = 0
                return r1
        }

        @java.lang.Deprecated
        public void onStopNestedScroll(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2, @androidx.annotation.NonNull android.view.View r3) {
                r0 = this;
                return
        }

        public void onStopNestedScroll(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2, @androidx.annotation.NonNull android.view.View r3, int r4) {
                r0 = this;
                if (r4 != 0) goto L5
                r0.onStopNestedScroll(r1, r2, r3)
            L5:
                return
        }

        public boolean onTouchEvent(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull V r2, @androidx.annotation.NonNull android.view.MotionEvent r3) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @java.lang.Deprecated
    public @interface DefaultBehavior {
        java.lang.Class<? extends androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior> value();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface DispatchChangeEvent {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class HierarchyChangeListener implements android.view.ViewGroup.OnHierarchyChangeListener {
        final /* synthetic */ androidx.coordinatorlayout.widget.CoordinatorLayout this$0;

        HierarchyChangeListener(androidx.coordinatorlayout.widget.CoordinatorLayout r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(android.view.View r2, android.view.View r3) {
                r1 = this;
                androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r1.this$0
                android.view.ViewGroup$OnHierarchyChangeListener r0 = r0.mOnHierarchyChangeListener
                if (r0 == 0) goto L9
                r0.onChildViewAdded(r2, r3)
            L9:
                return
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(android.view.View r3, android.view.View r4) {
                r2 = this;
                androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r2.this$0
                r1 = 2
                r0.onChildViewsChanged(r1)
                androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r2.this$0
                android.view.ViewGroup$OnHierarchyChangeListener r0 = r0.mOnHierarchyChangeListener
                if (r0 == 0) goto Lf
                r0.onChildViewRemoved(r3, r4)
            Lf:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        public int anchorGravity;
        public int dodgeInsetEdges;
        public int gravity;
        public int insetEdge;
        public int keyline;
        android.view.View mAnchorDirectChild;
        int mAnchorId;
        android.view.View mAnchorView;
        androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior mBehavior;
        boolean mBehaviorResolved;
        java.lang.Object mBehaviorTag;
        private boolean mDidAcceptNestedScrollNonTouch;
        private boolean mDidAcceptNestedScrollTouch;
        private boolean mDidBlockInteraction;
        private boolean mDidChangeAfterNestedScroll;
        int mInsetOffsetX;
        int mInsetOffsetY;
        final android.graphics.Rect mLastChildRect;

        public LayoutParams(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 0
                r0.mBehaviorResolved = r1
                r0.gravity = r1
                r0.anchorGravity = r1
                r2 = -1
                r0.keyline = r2
                r0.mAnchorId = r2
                r0.insetEdge = r1
                r0.dodgeInsetEdges = r1
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                r0.mLastChildRect = r1
                return
        }

        LayoutParams(@androidx.annotation.NonNull android.content.Context r5, @androidx.annotation.Nullable android.util.AttributeSet r6) {
                r4 = this;
                r4.<init>(r5, r6)
                r0 = 0
                r4.mBehaviorResolved = r0
                r4.gravity = r0
                r4.anchorGravity = r0
                r1 = -1
                r4.keyline = r1
                r4.mAnchorId = r1
                r4.insetEdge = r0
                r4.dodgeInsetEdges = r0
                android.graphics.Rect r2 = new android.graphics.Rect
                r2.<init>()
                r4.mLastChildRect = r2
                int[] r2 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout_Layout
                android.content.res.TypedArray r2 = r5.obtainStyledAttributes(r6, r2)
                int r3 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout_Layout_android_layout_gravity
                int r3 = r2.getInteger(r3, r0)
                r4.gravity = r3
                int r3 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout_Layout_layout_anchor
                int r3 = r2.getResourceId(r3, r1)
                r4.mAnchorId = r3
                int r3 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout_Layout_layout_anchorGravity
                int r3 = r2.getInteger(r3, r0)
                r4.anchorGravity = r3
                int r3 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout_Layout_layout_keyline
                int r1 = r2.getInteger(r3, r1)
                r4.keyline = r1
                int r1 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout_Layout_layout_insetEdge
                int r1 = r2.getInt(r1, r0)
                r4.insetEdge = r1
                int r1 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout_Layout_layout_dodgeInsetEdges
                int r0 = r2.getInt(r1, r0)
                r4.dodgeInsetEdges = r0
                int r0 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout_Layout_layout_behavior
                boolean r1 = r2.hasValue(r0)
                r4.mBehaviorResolved = r1
                if (r1 == 0) goto L64
                java.lang.String r0 = r2.getString(r0)
                androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r5 = androidx.coordinatorlayout.widget.CoordinatorLayout.parseBehavior(r5, r6, r0)
                r4.mBehavior = r5
            L64:
                r2.recycle()
                androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r5 = r4.mBehavior
                if (r5 == 0) goto L6e
                r5.onAttachedToLayoutParams(r4)
            L6e:
                return
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams r2) {
                r1 = this;
                r1.<init>(r2)
                r2 = 0
                r1.mBehaviorResolved = r2
                r1.gravity = r2
                r1.anchorGravity = r2
                r0 = -1
                r1.keyline = r0
                r1.mAnchorId = r0
                r1.insetEdge = r2
                r1.dodgeInsetEdges = r2
                android.graphics.Rect r2 = new android.graphics.Rect
                r2.<init>()
                r1.mLastChildRect = r2
                return
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams r2) {
                r1 = this;
                r1.<init>(r2)
                r2 = 0
                r1.mBehaviorResolved = r2
                r1.gravity = r2
                r1.anchorGravity = r2
                r0 = -1
                r1.keyline = r0
                r1.mAnchorId = r0
                r1.insetEdge = r2
                r1.dodgeInsetEdges = r2
                android.graphics.Rect r2 = new android.graphics.Rect
                r2.<init>()
                r1.mLastChildRect = r2
                return
        }

        public LayoutParams(androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams r2) {
                r1 = this;
                r1.<init>(r2)
                r2 = 0
                r1.mBehaviorResolved = r2
                r1.gravity = r2
                r1.anchorGravity = r2
                r0 = -1
                r1.keyline = r0
                r1.mAnchorId = r0
                r1.insetEdge = r2
                r1.dodgeInsetEdges = r2
                android.graphics.Rect r2 = new android.graphics.Rect
                r2.<init>()
                r1.mLastChildRect = r2
                return
        }

        private void resolveAnchorView(android.view.View r5, androidx.coordinatorlayout.widget.CoordinatorLayout r6) {
                r4 = this;
                int r0 = r4.mAnchorId
                android.view.View r0 = r6.findViewById(r0)
                r4.mAnchorView = r0
                r1 = 0
                if (r0 == 0) goto L4c
                if (r0 != r6) goto L20
                boolean r5 = r6.isInEditMode()
                if (r5 == 0) goto L18
                r4.mAnchorDirectChild = r1
                r4.mAnchorView = r1
                return
            L18:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "View can not be anchored to the the parent CoordinatorLayout"
                r5.<init>(r6)
                throw r5
            L20:
                android.view.ViewParent r2 = r0.getParent()
            L24:
                if (r2 == r6) goto L49
                if (r2 == 0) goto L49
                if (r2 != r5) goto L3d
                boolean r5 = r6.isInEditMode()
                if (r5 == 0) goto L35
                r4.mAnchorDirectChild = r1
                r4.mAnchorView = r1
                return
            L35:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "Anchor must not be a descendant of the anchored view"
                r5.<init>(r6)
                throw r5
            L3d:
                boolean r3 = r2 instanceof android.view.View
                if (r3 == 0) goto L44
                r0 = r2
                android.view.View r0 = (android.view.View) r0
            L44:
                android.view.ViewParent r2 = r2.getParent()
                goto L24
            L49:
                r4.mAnchorDirectChild = r0
                return
            L4c:
                boolean r0 = r6.isInEditMode()
                if (r0 == 0) goto L57
                r4.mAnchorDirectChild = r1
                r4.mAnchorView = r1
                return
            L57:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Could not find CoordinatorLayout descendant view with id "
                r1.append(r2)
                android.content.res.Resources r6 = r6.getResources()
                int r2 = r4.mAnchorId
                java.lang.String r6 = r6.getResourceName(r2)
                r1.append(r6)
                java.lang.String r6 = " to anchor view "
                r1.append(r6)
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                r0.<init>(r5)
                throw r0
        }

        private boolean shouldDodge(android.view.View r2, int r3) {
                r1 = this;
                android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r2 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r2
                int r2 = r2.insetEdge
                int r2 = androidx.core.view.GravityCompat.getAbsoluteGravity(r2, r3)
                if (r2 == 0) goto L19
                int r0 = r1.dodgeInsetEdges
                int r3 = androidx.core.view.GravityCompat.getAbsoluteGravity(r0, r3)
                r3 = r3 & r2
                if (r3 != r2) goto L19
                r2 = 1
                return r2
            L19:
                r2 = 0
                return r2
        }

        private boolean verifyAnchorView(android.view.View r5, androidx.coordinatorlayout.widget.CoordinatorLayout r6) {
                r4 = this;
                android.view.View r0 = r4.mAnchorView
                int r0 = r0.getId()
                int r1 = r4.mAnchorId
                r2 = 0
                if (r0 == r1) goto Lc
                return r2
            Lc:
                android.view.View r0 = r4.mAnchorView
                android.view.ViewParent r1 = r0.getParent()
            L12:
                if (r1 == r6) goto L2b
                if (r1 == 0) goto L25
                if (r1 != r5) goto L19
                goto L25
            L19:
                boolean r3 = r1 instanceof android.view.View
                if (r3 == 0) goto L20
                r0 = r1
                android.view.View r0 = (android.view.View) r0
            L20:
                android.view.ViewParent r1 = r1.getParent()
                goto L12
            L25:
                r5 = 0
                r4.mAnchorDirectChild = r5
                r4.mAnchorView = r5
                return r2
            L2b:
                r4.mAnchorDirectChild = r0
                r5 = 1
                return r5
        }

        boolean checkAnchorChanged() {
                r2 = this;
                android.view.View r0 = r2.mAnchorView
                if (r0 != 0) goto Lb
                int r0 = r2.mAnchorId
                r1 = -1
                if (r0 == r1) goto Lb
                r0 = 1
                return r0
            Lb:
                r0 = 0
                return r0
        }

        boolean dependsOn(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4) {
                r1 = this;
                android.view.View r0 = r1.mAnchorDirectChild
                if (r4 == r0) goto L1b
                int r0 = androidx.core.view.ViewCompat.getLayoutDirection(r2)
                boolean r0 = r1.shouldDodge(r4, r0)
                if (r0 != 0) goto L1b
                androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r0 = r1.mBehavior
                if (r0 == 0) goto L19
                boolean r2 = r0.layoutDependsOn(r2, r3, r4)
                if (r2 == 0) goto L19
                goto L1b
            L19:
                r2 = 0
                return r2
            L1b:
                r2 = 1
                return r2
        }

        boolean didBlockInteraction() {
                r1 = this;
                androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r0 = r1.mBehavior
                if (r0 != 0) goto L7
                r0 = 0
                r1.mDidBlockInteraction = r0
            L7:
                boolean r0 = r1.mDidBlockInteraction
                return r0
        }

        android.view.View findAnchorView(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4) {
                r2 = this;
                int r0 = r2.mAnchorId
                r1 = -1
                if (r0 != r1) goto Lb
                r3 = 0
                r2.mAnchorDirectChild = r3
                r2.mAnchorView = r3
                return r3
            Lb:
                android.view.View r0 = r2.mAnchorView
                if (r0 == 0) goto L15
                boolean r0 = r2.verifyAnchorView(r4, r3)
                if (r0 != 0) goto L18
            L15:
                r2.resolveAnchorView(r4, r3)
            L18:
                android.view.View r3 = r2.mAnchorView
                return r3
        }

        @androidx.annotation.IdRes
        public int getAnchorId() {
                r1 = this;
                int r0 = r1.mAnchorId
                return r0
        }

        @androidx.annotation.Nullable
        public androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior getBehavior() {
                r1 = this;
                androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r0 = r1.mBehavior
                return r0
        }

        boolean getChangedAfterNestedScroll() {
                r1 = this;
                boolean r0 = r1.mDidChangeAfterNestedScroll
                return r0
        }

        android.graphics.Rect getLastChildRect() {
                r1 = this;
                android.graphics.Rect r0 = r1.mLastChildRect
                return r0
        }

        void invalidateAnchor() {
                r1 = this;
                r0 = 0
                r1.mAnchorDirectChild = r0
                r1.mAnchorView = r0
                return
        }

        boolean isBlockingInteractionBelow(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4) {
                r2 = this;
                boolean r0 = r2.mDidBlockInteraction
                if (r0 == 0) goto L6
                r3 = 1
                return r3
            L6:
                androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r1 = r2.mBehavior
                if (r1 == 0) goto Lf
                boolean r3 = r1.blocksInteractionBelow(r3, r4)
                goto L10
            Lf:
                r3 = 0
            L10:
                r3 = r3 | r0
                r2.mDidBlockInteraction = r3
                return r3
        }

        boolean isNestedScrollAccepted(int r2) {
                r1 = this;
                if (r2 == 0) goto La
                r0 = 1
                if (r2 == r0) goto L7
                r2 = 0
                return r2
            L7:
                boolean r2 = r1.mDidAcceptNestedScrollNonTouch
                return r2
            La:
                boolean r2 = r1.mDidAcceptNestedScrollTouch
                return r2
        }

        void resetChangedAfterNestedScroll() {
                r1 = this;
                r0 = 0
                r1.mDidChangeAfterNestedScroll = r0
                return
        }

        void resetNestedScroll(int r2) {
                r1 = this;
                r0 = 0
                r1.setNestedScrollAccepted(r2, r0)
                return
        }

        void resetTouchBehaviorTracking() {
                r1 = this;
                r0 = 0
                r1.mDidBlockInteraction = r0
                return
        }

        public void setAnchorId(@androidx.annotation.IdRes int r1) {
                r0 = this;
                r0.invalidateAnchor()
                r0.mAnchorId = r1
                return
        }

        public void setBehavior(@androidx.annotation.Nullable androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior r2) {
                r1 = this;
                androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r0 = r1.mBehavior
                if (r0 == r2) goto L16
                if (r0 == 0) goto L9
                r0.onDetachedFromLayoutParams()
            L9:
                r1.mBehavior = r2
                r0 = 0
                r1.mBehaviorTag = r0
                r0 = 1
                r1.mBehaviorResolved = r0
                if (r2 == 0) goto L16
                r2.onAttachedToLayoutParams(r1)
            L16:
                return
        }

        void setChangedAfterNestedScroll(boolean r1) {
                r0 = this;
                r0.mDidChangeAfterNestedScroll = r1
                return
        }

        void setLastChildRect(android.graphics.Rect r2) {
                r1 = this;
                android.graphics.Rect r0 = r1.mLastChildRect
                r0.set(r2)
                return
        }

        void setNestedScrollAccepted(int r2, boolean r3) {
                r1 = this;
                if (r2 == 0) goto L9
                r0 = 1
                if (r2 == r0) goto L6
                return
            L6:
                r1.mDidAcceptNestedScrollNonTouch = r3
                return
            L9:
                r1.mDidAcceptNestedScrollTouch = r3
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class OnPreDrawListener implements android.view.ViewTreeObserver.OnPreDrawListener {
        final /* synthetic */ androidx.coordinatorlayout.widget.CoordinatorLayout this$0;

        OnPreDrawListener(androidx.coordinatorlayout.widget.CoordinatorLayout r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
                r2 = this;
                androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r2.this$0
                r1 = 0
                r0.onChildViewsChanged(r1)
                r0 = 1
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    protected static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState> CREATOR = null;
        android.util.SparseArray<android.os.Parcelable> behaviorStates;


        static {
                androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState$1 r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState$1
                r0.<init>()
                androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState.CREATOR = r0
                return
        }

        public SavedState(android.os.Parcel r6, java.lang.ClassLoader r7) {
                r5 = this;
                r5.<init>(r6, r7)
                int r0 = r6.readInt()
                int[] r1 = new int[r0]
                r6.readIntArray(r1)
                android.os.Parcelable[] r6 = r6.readParcelableArray(r7)
                android.util.SparseArray r7 = new android.util.SparseArray
                r7.<init>(r0)
                r5.behaviorStates = r7
                r7 = 0
            L18:
                if (r7 >= r0) goto L26
                android.util.SparseArray<android.os.Parcelable> r2 = r5.behaviorStates
                r3 = r1[r7]
                r4 = r6[r7]
                r2.append(r3, r4)
                int r7 = r7 + 1
                goto L18
            L26:
                return
        }

        public SavedState(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r6, int r7) {
                r5 = this;
                super.writeToParcel(r6, r7)
                android.util.SparseArray<android.os.Parcelable> r0 = r5.behaviorStates
                r1 = 0
                if (r0 == 0) goto Ld
                int r0 = r0.size()
                goto Le
            Ld:
                r0 = 0
            Le:
                r6.writeInt(r0)
                int[] r2 = new int[r0]
                android.os.Parcelable[] r3 = new android.os.Parcelable[r0]
            L15:
                if (r1 >= r0) goto L2c
                android.util.SparseArray<android.os.Parcelable> r4 = r5.behaviorStates
                int r4 = r4.keyAt(r1)
                r2[r1] = r4
                android.util.SparseArray<android.os.Parcelable> r4 = r5.behaviorStates
                java.lang.Object r4 = r4.valueAt(r1)
                android.os.Parcelable r4 = (android.os.Parcelable) r4
                r3[r1] = r4
                int r1 = r1 + 1
                goto L15
            L2c:
                r6.writeIntArray(r2)
                r6.writeParcelableArray(r3, r7)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class ViewElevationComparator implements java.util.Comparator<android.view.View> {
        ViewElevationComparator() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(android.view.View r2, android.view.View r3) {
                r1 = this;
                float r2 = androidx.core.view.ViewCompat.getZ(r2)
                float r3 = androidx.core.view.ViewCompat.getZ(r3)
                int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r0 <= 0) goto Le
                r2 = -1
                return r2
            Le:
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 >= 0) goto L14
                r2 = 1
                return r2
            L14:
                r2 = 0
                return r2
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(android.view.View r1, android.view.View r2) {
                r0 = this;
                android.view.View r1 = (android.view.View) r1
                android.view.View r2 = (android.view.View) r2
                int r1 = r0.compare2(r1, r2)
                return r1
        }
    }

    static {
            java.lang.Class<androidx.coordinatorlayout.widget.CoordinatorLayout> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.class
            java.lang.Package r0 = r0.getPackage()
            if (r0 == 0) goto Ld
            java.lang.String r0 = r0.getName()
            goto Le
        Ld:
            r0 = 0
        Le:
            androidx.coordinatorlayout.widget.CoordinatorLayout.WIDGET_PACKAGE_NAME = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$ViewElevationComparator r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$ViewElevationComparator
            r0.<init>()
            androidx.coordinatorlayout.widget.CoordinatorLayout.TOP_SORTED_CHILDREN_COMPARATOR = r0
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r2 = 0
            r0[r2] = r1
            java.lang.Class<android.util.AttributeSet> r1 = android.util.AttributeSet.class
            r2 = 1
            r0[r2] = r1
            androidx.coordinatorlayout.widget.CoordinatorLayout.CONSTRUCTOR_PARAMS = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            androidx.coordinatorlayout.widget.CoordinatorLayout.sConstructors = r0
            androidx.core.util.Pools$SynchronizedPool r0 = new androidx.core.util.Pools$SynchronizedPool
            r1 = 12
            r0.<init>(r1)
            androidx.coordinatorlayout.widget.CoordinatorLayout.sRectPool = r0
            return
    }

    public CoordinatorLayout(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public CoordinatorLayout(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            int r0 = androidx.coordinatorlayout.R.attr.coordinatorLayoutStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public CoordinatorLayout(@androidx.annotation.NonNull android.content.Context r10, @androidx.annotation.Nullable android.util.AttributeSet r11, @androidx.annotation.AttrRes int r12) {
            r9 = this;
            r9.<init>(r10, r11, r12)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.mDependencySortedChildren = r0
            androidx.coordinatorlayout.widget.DirectedAcyclicGraph r0 = new androidx.coordinatorlayout.widget.DirectedAcyclicGraph
            r0.<init>()
            r9.mChildDag = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.mTempList1 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.mTempDependenciesList = r0
            r0 = 2
            int[] r1 = new int[r0]
            r9.mBehaviorConsumed = r1
            int[] r0 = new int[r0]
            r9.mNestedScrollingV2ConsumedCompat = r0
            androidx.core.view.NestedScrollingParentHelper r0 = new androidx.core.view.NestedScrollingParentHelper
            r0.<init>(r9)
            r9.mNestedScrollingParentHelper = r0
            r0 = 0
            if (r12 != 0) goto L3c
            int[] r1 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout
            int r2 = androidx.coordinatorlayout.R.style.Widget_Support_CoordinatorLayout
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r11, r1, r0, r2)
        L3a:
            r6 = r1
            goto L43
        L3c:
            int[] r1 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r11, r1, r12, r0)
            goto L3a
        L43:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto L62
            if (r12 != 0) goto L57
            int[] r4 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout
            r7 = 0
            int r8 = androidx.coordinatorlayout.R.style.Widget_Support_CoordinatorLayout
            r2 = r9
            r3 = r10
            r5 = r11
            androidx.coordinatorlayout.widget.a.a(r2, r3, r4, r5, r6, r7, r8)
            goto L64
        L57:
            r3 = r10
            r5 = r11
            int[] r4 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout
            r8 = 0
            r2 = r9
            r7 = r12
            androidx.coordinatorlayout.widget.a.a(r2, r3, r4, r5, r6, r7, r8)
            goto L64
        L62:
            r2 = r9
            r3 = r10
        L64:
            int r10 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout_keylines
            int r10 = r6.getResourceId(r10, r0)
            if (r10 == 0) goto L8e
            android.content.res.Resources r11 = r3.getResources()
            int[] r10 = r11.getIntArray(r10)
            r2.mKeylines = r10
            android.util.DisplayMetrics r10 = r11.getDisplayMetrics()
            float r10 = r10.density
            int[] r11 = r2.mKeylines
            int r11 = r11.length
        L7f:
            if (r0 >= r11) goto L8e
            int[] r12 = r2.mKeylines
            r1 = r12[r0]
            float r1 = (float) r1
            float r1 = r1 * r10
            int r1 = (int) r1
            r12[r0] = r1
            int r0 = r0 + 1
            goto L7f
        L8e:
            int r10 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout_statusBarBackground
            android.graphics.drawable.Drawable r10 = r6.getDrawable(r10)
            r2.mStatusBarBackground = r10
            r6.recycle()
            r9.setupForInsets()
            androidx.coordinatorlayout.widget.CoordinatorLayout$HierarchyChangeListener r10 = new androidx.coordinatorlayout.widget.CoordinatorLayout$HierarchyChangeListener
            r10.<init>(r9)
            super.setOnHierarchyChangeListener(r10)
            int r10 = androidx.core.view.ViewCompat.getImportantForAccessibility(r9)
            if (r10 != 0) goto Lae
            r10 = 1
            androidx.core.view.ViewCompat.setImportantForAccessibility(r9, r10)
        Lae:
            return
    }

    @androidx.annotation.NonNull
    private static android.graphics.Rect acquireTempRect() {
            androidx.core.util.Pools$Pool<android.graphics.Rect> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.sRectPool
            java.lang.Object r0 = r0.acquire()
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            if (r0 != 0) goto Lf
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
        Lf:
            return r0
    }

    private static int clamp(int r0, int r1, int r2) {
            if (r0 >= r1) goto L3
            return r1
        L3:
            if (r0 <= r2) goto L6
            return r2
        L6:
            return r0
    }

    private void constrainChildRect(androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams r6, android.graphics.Rect r7, int r8, int r9) {
            r5 = this;
            int r0 = r5.getWidth()
            int r1 = r5.getHeight()
            int r2 = r5.getPaddingLeft()
            int r3 = r6.leftMargin
            int r2 = r2 + r3
            int r3 = r7.left
            int r4 = r5.getPaddingRight()
            int r0 = r0 - r4
            int r0 = r0 - r8
            int r4 = r6.rightMargin
            int r0 = r0 - r4
            int r0 = java.lang.Math.min(r3, r0)
            int r0 = java.lang.Math.max(r2, r0)
            int r2 = r5.getPaddingTop()
            int r3 = r6.topMargin
            int r2 = r2 + r3
            int r3 = r7.top
            int r4 = r5.getPaddingBottom()
            int r1 = r1 - r4
            int r1 = r1 - r9
            int r6 = r6.bottomMargin
            int r1 = r1 - r6
            int r6 = java.lang.Math.min(r3, r1)
            int r6 = java.lang.Math.max(r2, r6)
            int r8 = r8 + r0
            int r9 = r9 + r6
            r7.set(r0, r6, r8, r9)
            return
    }

    private androidx.core.view.WindowInsetsCompat dispatchApplyWindowInsetsToBehaviors(androidx.core.view.WindowInsetsCompat r5) {
            r4 = this;
            boolean r0 = r5.isConsumed()
            if (r0 == 0) goto L7
            return r5
        L7:
            int r0 = r4.getChildCount()
            r1 = 0
        Lc:
            if (r1 >= r0) goto L32
            android.view.View r2 = r4.getChildAt(r1)
            boolean r3 = androidx.core.view.ViewCompat.getFitsSystemWindows(r2)
            if (r3 == 0) goto L2f
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r3
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r3 = r3.getBehavior()
            if (r3 == 0) goto L2f
            androidx.core.view.WindowInsetsCompat r5 = r3.onApplyWindowInsets(r4, r2, r5)
            boolean r2 = r5.isConsumed()
            if (r2 == 0) goto L2f
            return r5
        L2f:
            int r1 = r1 + 1
            goto Lc
        L32:
            return r5
    }

    private void getDesiredAnchoredChildRectWithoutConstraints(android.view.View r6, int r7, android.graphics.Rect r8, android.graphics.Rect r9, androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams r10, int r11, int r12) {
            r5 = this;
            int r6 = r10.gravity
            int r6 = resolveAnchoredChildGravity(r6)
            int r6 = androidx.core.view.GravityCompat.getAbsoluteGravity(r6, r7)
            int r10 = r10.anchorGravity
            int r10 = resolveGravity(r10)
            int r7 = androidx.core.view.GravityCompat.getAbsoluteGravity(r10, r7)
            r10 = r6 & 7
            r6 = r6 & 112(0x70, float:1.57E-43)
            r0 = r7 & 7
            r7 = r7 & 112(0x70, float:1.57E-43)
            r1 = 5
            r2 = 1
            if (r0 == r2) goto L28
            if (r0 == r1) goto L25
            int r0 = r8.left
            goto L31
        L25:
            int r0 = r8.right
            goto L31
        L28:
            int r0 = r8.left
            int r3 = r8.width()
            int r3 = r3 / 2
            int r0 = r0 + r3
        L31:
            r3 = 80
            r4 = 16
            if (r7 == r4) goto L3f
            if (r7 == r3) goto L3c
            int r7 = r8.top
            goto L48
        L3c:
            int r7 = r8.bottom
            goto L48
        L3f:
            int r7 = r8.top
            int r8 = r8.height()
            int r8 = r8 / 2
            int r7 = r7 + r8
        L48:
            if (r10 == r2) goto L4e
            if (r10 == r1) goto L51
            int r0 = r0 - r11
            goto L51
        L4e:
            int r8 = r11 / 2
            int r0 = r0 - r8
        L51:
            if (r6 == r4) goto L57
            if (r6 == r3) goto L5a
            int r7 = r7 - r12
            goto L5a
        L57:
            int r6 = r12 / 2
            int r7 = r7 - r6
        L5a:
            int r11 = r11 + r0
            int r12 = r12 + r7
            r9.set(r0, r7, r11, r12)
            return
    }

    private int getKeyline(int r4) {
            r3 = this;
            int[] r0 = r3.mKeylines
            r1 = 0
            if (r0 != 0) goto L9
            r3.toString()
            return r1
        L9:
            if (r4 < 0) goto L12
            int r2 = r0.length
            if (r4 < r2) goto Lf
            goto L12
        Lf:
            r4 = r0[r4]
            return r4
        L12:
            r3.toString()
            return r1
    }

    private void getTopSortedChildren(java.util.List<android.view.View> r5) {
            r4 = this;
            r5.clear()
            boolean r0 = r4.isChildrenDrawingOrderEnabled()
            int r1 = r4.getChildCount()
            int r2 = r1 + (-1)
        Ld:
            if (r2 < 0) goto L21
            if (r0 == 0) goto L16
            int r3 = r4.getChildDrawingOrder(r1, r2)
            goto L17
        L16:
            r3 = r2
        L17:
            android.view.View r3 = r4.getChildAt(r3)
            r5.add(r3)
            int r2 = r2 + (-1)
            goto Ld
        L21:
            java.util.Comparator<android.view.View> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.TOP_SORTED_CHILDREN_COMPARATOR
            if (r0 == 0) goto L28
            java.util.Collections.sort(r5, r0)
        L28:
            return
    }

    private boolean hasDependencies(android.view.View r2) {
            r1 = this;
            androidx.coordinatorlayout.widget.DirectedAcyclicGraph<android.view.View> r0 = r1.mChildDag
            boolean r2 = r0.hasOutgoingEdges(r2)
            return r2
    }

    private void layoutChild(android.view.View r8, int r9) {
            r7 = this;
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0
            android.graphics.Rect r4 = acquireTempRect()
            int r1 = r7.getPaddingLeft()
            int r2 = r0.leftMargin
            int r1 = r1 + r2
            int r2 = r7.getPaddingTop()
            int r3 = r0.topMargin
            int r2 = r2 + r3
            int r3 = r7.getWidth()
            int r5 = r7.getPaddingRight()
            int r3 = r3 - r5
            int r5 = r0.rightMargin
            int r3 = r3 - r5
            int r5 = r7.getHeight()
            int r6 = r7.getPaddingBottom()
            int r5 = r5 - r6
            int r6 = r0.bottomMargin
            int r5 = r5 - r6
            r4.set(r1, r2, r3, r5)
            androidx.core.view.WindowInsetsCompat r1 = r7.mLastInsets
            if (r1 == 0) goto L6f
            boolean r1 = androidx.core.view.ViewCompat.getFitsSystemWindows(r7)
            if (r1 == 0) goto L6f
            boolean r1 = androidx.core.view.ViewCompat.getFitsSystemWindows(r8)
            if (r1 != 0) goto L6f
            int r1 = r4.left
            androidx.core.view.WindowInsetsCompat r2 = r7.mLastInsets
            int r2 = r2.getSystemWindowInsetLeft()
            int r1 = r1 + r2
            r4.left = r1
            int r1 = r4.top
            androidx.core.view.WindowInsetsCompat r2 = r7.mLastInsets
            int r2 = r2.getSystemWindowInsetTop()
            int r1 = r1 + r2
            r4.top = r1
            int r1 = r4.right
            androidx.core.view.WindowInsetsCompat r2 = r7.mLastInsets
            int r2 = r2.getSystemWindowInsetRight()
            int r1 = r1 - r2
            r4.right = r1
            int r1 = r4.bottom
            androidx.core.view.WindowInsetsCompat r2 = r7.mLastInsets
            int r2 = r2.getSystemWindowInsetBottom()
            int r1 = r1 - r2
            r4.bottom = r1
        L6f:
            android.graphics.Rect r5 = acquireTempRect()
            int r0 = r0.gravity
            int r1 = resolveGravity(r0)
            int r2 = r8.getMeasuredWidth()
            int r3 = r8.getMeasuredHeight()
            r6 = r9
            androidx.core.view.GravityCompat.apply(r1, r2, r3, r4, r5, r6)
            int r9 = r5.left
            int r0 = r5.top
            int r1 = r5.right
            int r2 = r5.bottom
            r8.layout(r9, r0, r1, r2)
            releaseTempRect(r4)
            releaseTempRect(r5)
            return
    }

    private void layoutChildWithAnchor(android.view.View r5, android.view.View r6, int r7) {
            r4 = this;
            android.graphics.Rect r0 = acquireTempRect()
            android.graphics.Rect r1 = acquireTempRect()
            r4.getDescendantRect(r6, r0)     // Catch: java.lang.Throwable -> L20
            r4.getDesiredAnchoredChildRect(r5, r7, r0, r1)     // Catch: java.lang.Throwable -> L20
            int r6 = r1.left     // Catch: java.lang.Throwable -> L20
            int r7 = r1.top     // Catch: java.lang.Throwable -> L20
            int r2 = r1.right     // Catch: java.lang.Throwable -> L20
            int r3 = r1.bottom     // Catch: java.lang.Throwable -> L20
            r5.layout(r6, r7, r2, r3)     // Catch: java.lang.Throwable -> L20
            releaseTempRect(r0)
            releaseTempRect(r1)
            return
        L20:
            r5 = move-exception
            releaseTempRect(r0)
            releaseTempRect(r1)
            throw r5
    }

    private void layoutChildWithKeyline(android.view.View r9, int r10, int r11) {
            r8 = this;
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0
            int r1 = r0.gravity
            int r1 = resolveKeylineGravity(r1)
            int r1 = androidx.core.view.GravityCompat.getAbsoluteGravity(r1, r11)
            r2 = r1 & 7
            r1 = r1 & 112(0x70, float:1.57E-43)
            int r3 = r8.getWidth()
            int r4 = r8.getHeight()
            int r5 = r9.getMeasuredWidth()
            int r6 = r9.getMeasuredHeight()
            r7 = 1
            if (r11 != r7) goto L29
            int r10 = r3 - r10
        L29:
            int r10 = r8.getKeyline(r10)
            int r10 = r10 - r5
            if (r2 == r7) goto L36
            r11 = 5
            if (r2 == r11) goto L34
            goto L39
        L34:
            int r10 = r10 + r5
            goto L39
        L36:
            int r11 = r5 / 2
            int r10 = r10 + r11
        L39:
            r11 = 16
            if (r1 == r11) goto L45
            r11 = 80
            if (r1 == r11) goto L43
            r11 = 0
            goto L47
        L43:
            r11 = r6
            goto L47
        L45:
            int r11 = r6 / 2
        L47:
            int r1 = r8.getPaddingLeft()
            int r2 = r0.leftMargin
            int r1 = r1 + r2
            int r2 = r8.getPaddingRight()
            int r3 = r3 - r2
            int r3 = r3 - r5
            int r2 = r0.rightMargin
            int r3 = r3 - r2
            int r10 = java.lang.Math.min(r10, r3)
            int r10 = java.lang.Math.max(r1, r10)
            int r1 = r8.getPaddingTop()
            int r2 = r0.topMargin
            int r1 = r1 + r2
            int r2 = r8.getPaddingBottom()
            int r4 = r4 - r2
            int r4 = r4 - r6
            int r0 = r0.bottomMargin
            int r4 = r4 - r0
            int r11 = java.lang.Math.min(r11, r4)
            int r11 = java.lang.Math.max(r1, r11)
            int r5 = r5 + r10
            int r6 = r6 + r11
            r9.layout(r10, r11, r5, r6)
            return
    }

    private void offsetChildByInset(android.view.View r9, android.graphics.Rect r10, int r11) {
            r8 = this;
            boolean r0 = androidx.core.view.ViewCompat.isLaidOut(r9)
            if (r0 != 0) goto L8
            goto Lfe
        L8:
            int r0 = r9.getWidth()
            if (r0 <= 0) goto Lfe
            int r0 = r9.getHeight()
            if (r0 > 0) goto L16
            goto Lfe
        L16:
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r1 = r0.getBehavior()
            android.graphics.Rect r2 = acquireTempRect()
            android.graphics.Rect r3 = acquireTempRect()
            int r4 = r9.getLeft()
            int r5 = r9.getTop()
            int r6 = r9.getRight()
            int r7 = r9.getBottom()
            r3.set(r4, r5, r6, r7)
            if (r1 == 0) goto L71
            boolean r1 = r1.getInsetDodgeRect(r8, r9, r2)
            if (r1 == 0) goto L71
            boolean r1 = r3.contains(r2)
            if (r1 == 0) goto L4a
            goto L74
        L4a:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Rect should be within the child's bounds. Rect:"
            r10.append(r11)
            java.lang.String r11 = r2.toShortString()
            r10.append(r11)
            java.lang.String r11 = " | Bounds:"
            r10.append(r11)
            java.lang.String r11 = r3.toShortString()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L71:
            r2.set(r3)
        L74:
            releaseTempRect(r3)
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L81
            releaseTempRect(r2)
            return
        L81:
            int r1 = r0.dodgeInsetEdges
            int r11 = androidx.core.view.GravityCompat.getAbsoluteGravity(r1, r11)
            r1 = r11 & 48
            r3 = 48
            r4 = 1
            r5 = 0
            if (r1 != r3) goto La1
            int r1 = r2.top
            int r3 = r0.topMargin
            int r1 = r1 - r3
            int r3 = r0.mInsetOffsetY
            int r1 = r1 - r3
            int r3 = r10.top
            if (r1 >= r3) goto La1
            int r3 = r3 - r1
            r8.setInsetOffsetY(r9, r3)
            r1 = 1
            goto La2
        La1:
            r1 = 0
        La2:
            r3 = r11 & 80
            r6 = 80
            if (r3 != r6) goto Lbe
            int r3 = r8.getHeight()
            int r6 = r2.bottom
            int r3 = r3 - r6
            int r6 = r0.bottomMargin
            int r3 = r3 - r6
            int r6 = r0.mInsetOffsetY
            int r3 = r3 + r6
            int r6 = r10.bottom
            if (r3 >= r6) goto Lbe
            int r3 = r3 - r6
            r8.setInsetOffsetY(r9, r3)
            r1 = 1
        Lbe:
            if (r1 != 0) goto Lc3
            r8.setInsetOffsetY(r9, r5)
        Lc3:
            r1 = r11 & 3
            r3 = 3
            if (r1 != r3) goto Lda
            int r1 = r2.left
            int r3 = r0.leftMargin
            int r1 = r1 - r3
            int r3 = r0.mInsetOffsetX
            int r1 = r1 - r3
            int r3 = r10.left
            if (r1 >= r3) goto Lda
            int r3 = r3 - r1
            r8.setInsetOffsetX(r9, r3)
            r1 = 1
            goto Ldb
        Lda:
            r1 = 0
        Ldb:
            r3 = 5
            r11 = r11 & r3
            if (r11 != r3) goto Lf5
            int r11 = r8.getWidth()
            int r3 = r2.right
            int r11 = r11 - r3
            int r3 = r0.rightMargin
            int r11 = r11 - r3
            int r0 = r0.mInsetOffsetX
            int r11 = r11 + r0
            int r10 = r10.right
            if (r11 >= r10) goto Lf5
            int r11 = r11 - r10
            r8.setInsetOffsetX(r9, r11)
            goto Lf6
        Lf5:
            r4 = r1
        Lf6:
            if (r4 != 0) goto Lfb
            r8.setInsetOffsetX(r9, r5)
        Lfb:
            releaseTempRect(r2)
        Lfe:
            return
    }

    static androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior parseBehavior(android.content.Context r5, android.util.AttributeSet r6, java.lang.String r7) {
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L8
            r5 = 0
            return r5
        L8:
            java.lang.String r0 = "."
            boolean r0 = r7.startsWith(r0)
            if (r0 == 0) goto L24
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r5.getPackageName()
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            goto L47
        L24:
            r0 = 46
            int r1 = r7.indexOf(r0)
            if (r1 < 0) goto L2d
            goto L47
        L2d:
            java.lang.String r1 = androidx.coordinatorlayout.widget.CoordinatorLayout.WIDGET_PACKAGE_NAME
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L47
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r0)
            r2.append(r7)
            java.lang.String r7 = r2.toString()
        L47:
            java.lang.ThreadLocal<java.util.Map<java.lang.String, java.lang.reflect.Constructor<androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior>>> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.sConstructors     // Catch: java.lang.Exception -> L5a
            java.lang.Object r1 = r0.get()     // Catch: java.lang.Exception -> L5a
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Exception -> L5a
            if (r1 != 0) goto L5c
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Exception -> L5a
            r1.<init>()     // Catch: java.lang.Exception -> L5a
            r0.set(r1)     // Catch: java.lang.Exception -> L5a
            goto L5c
        L5a:
            r5 = move-exception
            goto L88
        L5c:
            java.lang.Object r0 = r1.get(r7)     // Catch: java.lang.Exception -> L5a
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0     // Catch: java.lang.Exception -> L5a
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L7a
            java.lang.ClassLoader r0 = r5.getClassLoader()     // Catch: java.lang.Exception -> L5a
            java.lang.Class r0 = java.lang.Class.forName(r7, r3, r0)     // Catch: java.lang.Exception -> L5a
            java.lang.Class<?>[] r4 = androidx.coordinatorlayout.widget.CoordinatorLayout.CONSTRUCTOR_PARAMS     // Catch: java.lang.Exception -> L5a
            java.lang.reflect.Constructor r0 = r0.getConstructor(r4)     // Catch: java.lang.Exception -> L5a
            r0.setAccessible(r2)     // Catch: java.lang.Exception -> L5a
            r1.put(r7, r0)     // Catch: java.lang.Exception -> L5a
        L7a:
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L5a
            r1[r3] = r5     // Catch: java.lang.Exception -> L5a
            r1[r2] = r6     // Catch: java.lang.Exception -> L5a
            java.lang.Object r5 = r0.newInstance(r1)     // Catch: java.lang.Exception -> L5a
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r5 = (androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior) r5     // Catch: java.lang.Exception -> L5a
            return r5
        L88:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Could not inflate Behavior subclass "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.<init>(r7, r5)
            throw r6
    }

    private boolean performIntercept(android.view.MotionEvent r24, int r25) {
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            int r3 = r1.getActionMasked()
            java.util.List<android.view.View> r4 = r0.mTempList1
            r0.getTopSortedChildren(r4)
            int r5 = r4.size()
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
        L18:
            if (r8 >= r5) goto L81
            java.lang.Object r11 = r4.get(r8)
            android.view.View r11 = (android.view.View) r11
            android.view.ViewGroup$LayoutParams r12 = r11.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r12 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r12
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r13 = r12.getBehavior()
            r14 = 1
            if (r9 != 0) goto L2f
            if (r10 == 0) goto L54
        L2f:
            if (r3 == 0) goto L54
            if (r13 == 0) goto L7e
            if (r7 != 0) goto L47
            long r15 = android.os.SystemClock.uptimeMillis()
            r21 = 0
            r22 = 0
            r19 = 3
            r20 = 0
            r17 = r15
            android.view.MotionEvent r7 = android.view.MotionEvent.obtain(r15, r17, r19, r20, r21, r22)
        L47:
            if (r2 == 0) goto L50
            if (r2 == r14) goto L4c
            goto L7e
        L4c:
            r13.onTouchEvent(r0, r11, r7)
            goto L7e
        L50:
            r13.onInterceptTouchEvent(r0, r11, r7)
            goto L7e
        L54:
            if (r9 != 0) goto L6a
            if (r13 == 0) goto L6a
            if (r2 == 0) goto L62
            if (r2 == r14) goto L5d
            goto L66
        L5d:
            boolean r9 = r13.onTouchEvent(r0, r11, r1)
            goto L66
        L62:
            boolean r9 = r13.onInterceptTouchEvent(r0, r11, r1)
        L66:
            if (r9 == 0) goto L6a
            r0.mBehaviorTouchView = r11
        L6a:
            boolean r10 = r12.didBlockInteraction()
            boolean r11 = r12.isBlockingInteractionBelow(r0, r11)
            if (r11 == 0) goto L78
            if (r10 != 0) goto L78
            r10 = 1
            goto L79
        L78:
            r10 = 0
        L79:
            if (r11 == 0) goto L7e
            if (r10 != 0) goto L7e
            goto L81
        L7e:
            int r8 = r8 + 1
            goto L18
        L81:
            r4.clear()
            return r9
    }

    private void prepareChildren() {
            r8 = this;
            java.util.List<android.view.View> r0 = r8.mDependencySortedChildren
            r0.clear()
            androidx.coordinatorlayout.widget.DirectedAcyclicGraph<android.view.View> r0 = r8.mChildDag
            r0.clear()
            int r0 = r8.getChildCount()
            r1 = 0
            r2 = 0
        L10:
            if (r2 >= r0) goto L4a
            android.view.View r3 = r8.getChildAt(r2)
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r4 = r8.getResolvedLayoutParams(r3)
            r4.findAnchorView(r8, r3)
            androidx.coordinatorlayout.widget.DirectedAcyclicGraph<android.view.View> r5 = r8.mChildDag
            r5.addNode(r3)
            r5 = 0
        L23:
            if (r5 >= r0) goto L47
            if (r5 != r2) goto L28
            goto L44
        L28:
            android.view.View r6 = r8.getChildAt(r5)
            boolean r7 = r4.dependsOn(r8, r3, r6)
            if (r7 == 0) goto L44
            androidx.coordinatorlayout.widget.DirectedAcyclicGraph<android.view.View> r7 = r8.mChildDag
            boolean r7 = r7.contains(r6)
            if (r7 != 0) goto L3f
            androidx.coordinatorlayout.widget.DirectedAcyclicGraph<android.view.View> r7 = r8.mChildDag
            r7.addNode(r6)
        L3f:
            androidx.coordinatorlayout.widget.DirectedAcyclicGraph<android.view.View> r7 = r8.mChildDag
            r7.addEdge(r6, r3)
        L44:
            int r5 = r5 + 1
            goto L23
        L47:
            int r2 = r2 + 1
            goto L10
        L4a:
            java.util.List<android.view.View> r0 = r8.mDependencySortedChildren
            androidx.coordinatorlayout.widget.DirectedAcyclicGraph<android.view.View> r1 = r8.mChildDag
            java.util.ArrayList r1 = r1.getSortedList()
            r0.addAll(r1)
            java.util.List<android.view.View> r0 = r8.mDependencySortedChildren
            java.util.Collections.reverse(r0)
            return
    }

    private static void releaseTempRect(@androidx.annotation.NonNull android.graphics.Rect r1) {
            r1.setEmpty()
            androidx.core.util.Pools$Pool<android.graphics.Rect> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.sRectPool
            r0.release(r1)
            return
    }

    private void resetTouchBehaviors(boolean r14) {
            r13 = this;
            int r0 = r13.getChildCount()
            r1 = 0
            r2 = 0
        L6:
            if (r2 >= r0) goto L34
            android.view.View r3 = r13.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r4
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r4 = r4.getBehavior()
            if (r4 == 0) goto L31
            long r5 = android.os.SystemClock.uptimeMillis()
            r11 = 0
            r12 = 0
            r9 = 3
            r10 = 0
            r7 = r5
            android.view.MotionEvent r5 = android.view.MotionEvent.obtain(r5, r7, r9, r10, r11, r12)
            if (r14 == 0) goto L2b
            r4.onInterceptTouchEvent(r13, r3, r5)
            goto L2e
        L2b:
            r4.onTouchEvent(r13, r3, r5)
        L2e:
            r5.recycle()
        L31:
            int r2 = r2 + 1
            goto L6
        L34:
            r14 = 0
        L35:
            if (r14 >= r0) goto L47
            android.view.View r2 = r13.getChildAt(r14)
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r2 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r2
            r2.resetTouchBehaviorTracking()
            int r14 = r14 + 1
            goto L35
        L47:
            r14 = 0
            r13.mBehaviorTouchView = r14
            r13.mDisallowInterceptReset = r1
            return
    }

    private static int resolveAnchoredChildGravity(int r0) {
            if (r0 != 0) goto L4
            r0 = 17
        L4:
            return r0
    }

    private static int resolveGravity(int r1) {
            r0 = r1 & 7
            if (r0 != 0) goto L8
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r1 = r1 | r0
        L8:
            r0 = r1 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto Le
            r1 = r1 | 48
        Le:
            return r1
    }

    private static int resolveKeylineGravity(int r0) {
            if (r0 != 0) goto L5
            r0 = 8388661(0x800035, float:1.1755018E-38)
        L5:
            return r0
    }

    private void setInsetOffsetX(android.view.View r3, int r4) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0
            int r1 = r0.mInsetOffsetX
            if (r1 == r4) goto L11
            int r1 = r4 - r1
            androidx.core.view.ViewCompat.offsetLeftAndRight(r3, r1)
            r0.mInsetOffsetX = r4
        L11:
            return
    }

    private void setInsetOffsetY(android.view.View r3, int r4) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0
            int r1 = r0.mInsetOffsetY
            if (r1 == r4) goto L11
            int r1 = r4 - r1
            androidx.core.view.ViewCompat.offsetTopAndBottom(r3, r1)
            r0.mInsetOffsetY = r4
        L11:
            return
    }

    private void setupForInsets() {
            r1 = this;
            boolean r0 = androidx.core.view.ViewCompat.getFitsSystemWindows(r1)
            if (r0 == 0) goto L1c
            androidx.core.view.OnApplyWindowInsetsListener r0 = r1.mApplyWindowInsetsListener
            if (r0 != 0) goto L11
            androidx.coordinatorlayout.widget.CoordinatorLayout$1 r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$1
            r0.<init>(r1)
            r1.mApplyWindowInsetsListener = r0
        L11:
            androidx.core.view.OnApplyWindowInsetsListener r0 = r1.mApplyWindowInsetsListener
            androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(r1, r0)
            r0 = 1280(0x500, float:1.794E-42)
            r1.setSystemUiVisibility(r0)
            return
        L1c:
            r0 = 0
            androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(r1, r0)
            return
    }

    void addPreDrawListener() {
            r2 = this;
            boolean r0 = r2.mIsAttachedToWindow
            if (r0 == 0) goto L18
            androidx.coordinatorlayout.widget.CoordinatorLayout$OnPreDrawListener r0 = r2.mOnPreDrawListener
            if (r0 != 0) goto Lf
            androidx.coordinatorlayout.widget.CoordinatorLayout$OnPreDrawListener r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$OnPreDrawListener
            r0.<init>(r2)
            r2.mOnPreDrawListener = r0
        Lf:
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$OnPreDrawListener r1 = r2.mOnPreDrawListener
            r0.addOnPreDrawListener(r1)
        L18:
            r0 = 1
            r2.mNeedsPreDrawListener = r0
            return
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams
            if (r0 == 0) goto Lc
            boolean r2 = super.checkLayoutParams(r2)
            if (r2 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            r2 = 0
            return r2
    }

    public void dispatchDependentViewsChanged(@androidx.annotation.NonNull android.view.View r5) {
            r4 = this;
            androidx.coordinatorlayout.widget.DirectedAcyclicGraph<android.view.View> r0 = r4.mChildDag
            java.util.List r0 = r0.getIncomingEdges(r5)
            if (r0 == 0) goto L2d
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L2d
            r1 = 0
        Lf:
            int r2 = r0.size()
            if (r1 >= r2) goto L2d
            java.lang.Object r2 = r0.get(r1)
            android.view.View r2 = (android.view.View) r2
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r3
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r3 = r3.getBehavior()
            if (r3 == 0) goto L2a
            r3.onDependentViewChanged(r4, r2, r5)
        L2a:
            int r1 = r1 + 1
            goto Lf
        L2d:
            return
    }

    public boolean doViewsOverlap(@androidx.annotation.NonNull android.view.View r5, @androidx.annotation.NonNull android.view.View r6) {
            r4 = this;
            int r0 = r5.getVisibility()
            r1 = 0
            if (r0 != 0) goto L58
            int r0 = r6.getVisibility()
            if (r0 != 0) goto L58
            android.graphics.Rect r0 = acquireTempRect()
            android.view.ViewParent r2 = r5.getParent()
            r3 = 1
            if (r2 == r4) goto L1a
            r2 = 1
            goto L1b
        L1a:
            r2 = 0
        L1b:
            r4.getChildRect(r5, r2, r0)
            android.graphics.Rect r5 = acquireTempRect()
            android.view.ViewParent r2 = r6.getParent()
            if (r2 == r4) goto L2a
            r2 = 1
            goto L2b
        L2a:
            r2 = 0
        L2b:
            r4.getChildRect(r6, r2, r5)
            int r6 = r0.left     // Catch: java.lang.Throwable -> L48
            int r2 = r5.right     // Catch: java.lang.Throwable -> L48
            if (r6 > r2) goto L4a
            int r6 = r0.top     // Catch: java.lang.Throwable -> L48
            int r2 = r5.bottom     // Catch: java.lang.Throwable -> L48
            if (r6 > r2) goto L4a
            int r6 = r0.right     // Catch: java.lang.Throwable -> L48
            int r2 = r5.left     // Catch: java.lang.Throwable -> L48
            if (r6 < r2) goto L4a
            int r6 = r0.bottom     // Catch: java.lang.Throwable -> L48
            int r2 = r5.top     // Catch: java.lang.Throwable -> L48
            if (r6 < r2) goto L4a
            r1 = 1
            goto L4a
        L48:
            r6 = move-exception
            goto L51
        L4a:
            releaseTempRect(r0)
            releaseTempRect(r5)
            return r1
        L51:
            releaseTempRect(r0)
            releaseTempRect(r5)
            throw r6
        L58:
            return r1
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(android.graphics.Canvas r17, android.view.View r18, long r19) {
            r16 = this;
            r0 = r16
            r1 = r18
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r2 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r2
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r3 = r2.mBehavior
            if (r3 == 0) goto L90
            float r3 = r3.getScrimOpacity(r0, r1)
            r4 = 0
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 <= 0) goto L90
            android.graphics.Paint r4 = r0.mScrimPaint
            if (r4 != 0) goto L22
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>()
            r0.mScrimPaint = r4
        L22:
            android.graphics.Paint r4 = r0.mScrimPaint
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r2 = r2.mBehavior
            int r2 = r2.getScrimColor(r0, r1)
            r4.setColor(r2)
            android.graphics.Paint r2 = r0.mScrimPaint
            r4 = 1132396544(0x437f0000, float:255.0)
            float r3 = r3 * r4
            int r3 = java.lang.Math.round(r3)
            r4 = 0
            r5 = 255(0xff, float:3.57E-43)
            int r3 = clamp(r3, r4, r5)
            r2.setAlpha(r3)
            int r2 = r17.save()
            boolean r3 = r1.isOpaque()
            if (r3 == 0) goto L66
            int r3 = r1.getLeft()
            float r5 = (float) r3
            int r3 = r1.getTop()
            float r6 = (float) r3
            int r3 = r1.getRight()
            float r7 = (float) r3
            int r3 = r1.getBottom()
            float r8 = (float) r3
            android.graphics.Region$Op r9 = android.graphics.Region.Op.DIFFERENCE
            r4 = r17
            r4.clipRect(r5, r6, r7, r8, r9)
        L66:
            int r3 = r0.getPaddingLeft()
            float r11 = (float) r3
            int r3 = r0.getPaddingTop()
            float r12 = (float) r3
            int r3 = r0.getWidth()
            int r4 = r0.getPaddingRight()
            int r3 = r3 - r4
            float r13 = (float) r3
            int r3 = r0.getHeight()
            int r4 = r0.getPaddingBottom()
            int r3 = r3 - r4
            float r14 = (float) r3
            android.graphics.Paint r15 = r0.mScrimPaint
            r10 = r17
            r10.drawRect(r11, r12, r13, r14, r15)
            r4 = r10
            r4.restoreToCount(r2)
            goto L92
        L90:
            r4 = r17
        L92:
            boolean r1 = super.drawChild(r17, r18, r19)
            return r1
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
            r3 = this;
            super.drawableStateChanged()
            int[] r0 = r3.getDrawableState()
            android.graphics.drawable.Drawable r1 = r3.mStatusBarBackground
            if (r1 == 0) goto L16
            boolean r2 = r1.isStateful()
            if (r2 == 0) goto L16
            boolean r0 = r1.setState(r0)
            goto L17
        L16:
            r0 = 0
        L17:
            if (r0 == 0) goto L1c
            r3.invalidate()
        L1c:
            return
    }

    void ensurePreDrawListener() {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 0
            r2 = 0
        L6:
            if (r2 >= r0) goto L17
            android.view.View r3 = r4.getChildAt(r2)
            boolean r3 = r4.hasDependencies(r3)
            if (r3 == 0) goto L14
            r1 = 1
            goto L17
        L14:
            int r2 = r2 + 1
            goto L6
        L17:
            boolean r0 = r4.mNeedsPreDrawListener
            if (r1 == r0) goto L24
            if (r1 == 0) goto L21
            r4.addPreDrawListener()
            return
        L21:
            r4.removePreDrawListener()
        L24:
            return
    }

    @Override // android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = r1.generateDefaultLayoutParams()
            return r0
    }

    @Override // android.view.ViewGroup
    protected androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams generateDefaultLayoutParams() {
            r2 = this;
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams
            r1 = -2
            r0.<init>(r1, r1)
            return r0
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // android.view.ViewGroup
    public androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // android.view.ViewGroup
    protected androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams
            if (r0 == 0) goto Lc
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r2 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r2
            r0.<init>(r2)
            return r0
        Lc:
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L18
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r0.<init>(r2)
            return r0
        L18:
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams
            r0.<init>(r2)
            return r0
    }

    void getChildRect(android.view.View r3, boolean r4, android.graphics.Rect r5) {
            r2 = this;
            boolean r0 = r3.isLayoutRequested()
            if (r0 != 0) goto L29
            int r0 = r3.getVisibility()
            r1 = 8
            if (r0 != r1) goto Lf
            goto L29
        Lf:
            if (r4 == 0) goto L15
            r2.getDescendantRect(r3, r5)
            return
        L15:
            int r4 = r3.getLeft()
            int r0 = r3.getTop()
            int r1 = r3.getRight()
            int r3 = r3.getBottom()
            r5.set(r4, r0, r1, r3)
            return
        L29:
            r5.setEmpty()
            return
    }

    @androidx.annotation.NonNull
    public java.util.List<android.view.View> getDependencies(@androidx.annotation.NonNull android.view.View r2) {
            r1 = this;
            androidx.coordinatorlayout.widget.DirectedAcyclicGraph<android.view.View> r0 = r1.mChildDag
            java.util.List r2 = r0.getOutgoingEdges(r2)
            java.util.List<android.view.View> r0 = r1.mTempDependenciesList
            r0.clear()
            if (r2 == 0) goto L12
            java.util.List<android.view.View> r0 = r1.mTempDependenciesList
            r0.addAll(r2)
        L12:
            java.util.List<android.view.View> r2 = r1.mTempDependenciesList
            return r2
    }

    @androidx.annotation.VisibleForTesting
    final java.util.List<android.view.View> getDependencySortedChildren() {
            r1 = this;
            r1.prepareChildren()
            java.util.List<android.view.View> r0 = r1.mDependencySortedChildren
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.List<android.view.View> getDependents(@androidx.annotation.NonNull android.view.View r2) {
            r1 = this;
            androidx.coordinatorlayout.widget.DirectedAcyclicGraph<android.view.View> r0 = r1.mChildDag
            java.util.List r2 = r0.getIncomingEdges(r2)
            java.util.List<android.view.View> r0 = r1.mTempDependenciesList
            r0.clear()
            if (r2 == 0) goto L12
            java.util.List<android.view.View> r0 = r1.mTempDependenciesList
            r0.addAll(r2)
        L12:
            java.util.List<android.view.View> r2 = r1.mTempDependenciesList
            return r2
    }

    void getDescendantRect(android.view.View r1, android.graphics.Rect r2) {
            r0 = this;
            androidx.coordinatorlayout.widget.ViewGroupUtils.getDescendantRect(r0, r1, r2)
            return
    }

    void getDesiredAnchoredChildRect(android.view.View r10, int r11, android.graphics.Rect r12, android.graphics.Rect r13) {
            r9 = this;
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            r6 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r6
            int r7 = r10.getMeasuredWidth()
            int r8 = r10.getMeasuredHeight()
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r1.getDesiredAnchoredChildRectWithoutConstraints(r2, r3, r4, r5, r6, r7, r8)
            r9.constrainChildRect(r6, r5, r7, r8)
            return
    }

    void getLastChildRect(android.view.View r1, android.graphics.Rect r2) {
            r0 = this;
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r1
            android.graphics.Rect r1 = r1.getLastChildRect()
            r2.set(r1)
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final androidx.core.view.WindowInsetsCompat getLastWindowInsets() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat r0 = r1.mLastInsets
            return r0
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
            r1 = this;
            androidx.core.view.NestedScrollingParentHelper r0 = r1.mNestedScrollingParentHelper
            int r0 = r0.getNestedScrollAxes()
            return r0
    }

    androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams getResolvedLayoutParams(android.view.View r5) {
            r4 = this;
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0
            boolean r1 = r0.mBehaviorResolved
            if (r1 != 0) goto L4f
            boolean r1 = r5 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
            r2 = 1
            if (r1 == 0) goto L1b
            androidx.coordinatorlayout.widget.CoordinatorLayout$AttachedBehavior r5 = (androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior) r5
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r5 = r5.getBehavior()
            r0.setBehavior(r5)
            r0.mBehaviorResolved = r2
            return r0
        L1b:
            java.lang.Class r5 = r5.getClass()
            r1 = 0
            r3 = r1
        L21:
            if (r5 == 0) goto L32
            java.lang.Class<androidx.coordinatorlayout.widget.CoordinatorLayout$DefaultBehavior> r3 = androidx.coordinatorlayout.widget.CoordinatorLayout.DefaultBehavior.class
            java.lang.annotation.Annotation r3 = r5.getAnnotation(r3)
            androidx.coordinatorlayout.widget.CoordinatorLayout$DefaultBehavior r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout.DefaultBehavior) r3
            if (r3 != 0) goto L32
            java.lang.Class r5 = r5.getSuperclass()
            goto L21
        L32:
            if (r3 == 0) goto L4d
            java.lang.Class r5 = r3.value()     // Catch: java.lang.Exception -> L46
            java.lang.reflect.Constructor r5 = r5.getDeclaredConstructor(r1)     // Catch: java.lang.Exception -> L46
            java.lang.Object r5 = r5.newInstance(r1)     // Catch: java.lang.Exception -> L46
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r5 = (androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior) r5     // Catch: java.lang.Exception -> L46
            r0.setBehavior(r5)     // Catch: java.lang.Exception -> L46
            goto L4d
        L46:
            java.lang.Class r5 = r3.value()
            r5.getName()
        L4d:
            r0.mBehaviorResolved = r2
        L4f:
            return r0
    }

    @androidx.annotation.Nullable
    public android.graphics.drawable.Drawable getStatusBarBackground() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mStatusBarBackground
            return r0
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
            r3 = this;
            int r0 = super.getSuggestedMinimumHeight()
            int r1 = r3.getPaddingTop()
            int r2 = r3.getPaddingBottom()
            int r1 = r1 + r2
            int r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
            r3 = this;
            int r0 = super.getSuggestedMinimumWidth()
            int r1 = r3.getPaddingLeft()
            int r2 = r3.getPaddingRight()
            int r1 = r1 + r2
            int r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    public boolean isPointInChildBounds(@androidx.annotation.NonNull android.view.View r2, int r3, int r4) {
            r1 = this;
            android.graphics.Rect r0 = acquireTempRect()
            r1.getDescendantRect(r2, r0)
            boolean r2 = r0.contains(r3, r4)     // Catch: java.lang.Throwable -> Lf
            releaseTempRect(r0)
            return r2
        Lf:
            r2 = move-exception
            releaseTempRect(r0)
            throw r2
    }

    void offsetChildToAnchor(android.view.View r11, int r12) {
            r10 = this;
            android.view.ViewGroup$LayoutParams r0 = r11.getLayoutParams()
            r6 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r6
            android.view.View r0 = r6.mAnchorView
            if (r0 == 0) goto L69
            android.graphics.Rect r4 = acquireTempRect()
            android.graphics.Rect r0 = acquireTempRect()
            android.graphics.Rect r5 = acquireTempRect()
            android.view.View r1 = r6.mAnchorView
            r10.getDescendantRect(r1, r4)
            r9 = 0
            r10.getChildRect(r11, r9, r0)
            int r7 = r11.getMeasuredWidth()
            int r8 = r11.getMeasuredHeight()
            r1 = r10
            r2 = r11
            r3 = r12
            r1.getDesiredAnchoredChildRectWithoutConstraints(r2, r3, r4, r5, r6, r7, r8)
            int r11 = r5.left
            int r12 = r0.left
            if (r11 != r12) goto L3a
            int r11 = r5.top
            int r12 = r0.top
            if (r11 == r12) goto L3b
        L3a:
            r9 = 1
        L3b:
            r10.constrainChildRect(r6, r5, r7, r8)
            int r11 = r5.left
            int r12 = r0.left
            int r11 = r11 - r12
            int r12 = r5.top
            int r3 = r0.top
            int r12 = r12 - r3
            if (r11 == 0) goto L4d
            androidx.core.view.ViewCompat.offsetLeftAndRight(r2, r11)
        L4d:
            if (r12 == 0) goto L52
            androidx.core.view.ViewCompat.offsetTopAndBottom(r2, r12)
        L52:
            if (r9 == 0) goto L5f
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r11 = r6.getBehavior()
            if (r11 == 0) goto L5f
            android.view.View r12 = r6.mAnchorView
            r11.onDependentViewChanged(r10, r2, r12)
        L5f:
            releaseTempRect(r4)
            releaseTempRect(r0)
            releaseTempRect(r5)
            return
        L69:
            r1 = r10
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
            r2 = this;
            super.onAttachedToWindow()
            r0 = 0
            r2.resetTouchBehaviors(r0)
            boolean r0 = r2.mNeedsPreDrawListener
            if (r0 == 0) goto L1f
            androidx.coordinatorlayout.widget.CoordinatorLayout$OnPreDrawListener r0 = r2.mOnPreDrawListener
            if (r0 != 0) goto L16
            androidx.coordinatorlayout.widget.CoordinatorLayout$OnPreDrawListener r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$OnPreDrawListener
            r0.<init>(r2)
            r2.mOnPreDrawListener = r0
        L16:
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$OnPreDrawListener r1 = r2.mOnPreDrawListener
            r0.addOnPreDrawListener(r1)
        L1f:
            androidx.core.view.WindowInsetsCompat r0 = r2.mLastInsets
            if (r0 != 0) goto L2c
            boolean r0 = androidx.core.view.ViewCompat.getFitsSystemWindows(r2)
            if (r0 == 0) goto L2c
            androidx.core.view.ViewCompat.requestApplyInsets(r2)
        L2c:
            r0 = 1
            r2.mIsAttachedToWindow = r0
            return
    }

    final void onChildViewsChanged(int r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = androidx.core.view.ViewCompat.getLayoutDirection(r0)
            java.util.List<android.view.View> r3 = r0.mDependencySortedChildren
            int r3 = r3.size()
            android.graphics.Rect r4 = acquireTempRect()
            android.graphics.Rect r5 = acquireTempRect()
            android.graphics.Rect r6 = acquireTempRect()
            r7 = 0
            r8 = 0
        L1c:
            if (r8 >= r3) goto L107
            java.util.List<android.view.View> r9 = r0.mDependencySortedChildren
            java.lang.Object r9 = r9.get(r8)
            android.view.View r9 = (android.view.View) r9
            android.view.ViewGroup$LayoutParams r10 = r9.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r10 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r10
            if (r1 != 0) goto L38
            int r11 = r9.getVisibility()
            r12 = 8
            if (r11 != r12) goto L38
            goto L103
        L38:
            r11 = 0
        L39:
            if (r11 >= r8) goto L4d
            java.util.List<android.view.View> r12 = r0.mDependencySortedChildren
            java.lang.Object r12 = r12.get(r11)
            android.view.View r12 = (android.view.View) r12
            android.view.View r13 = r10.mAnchorDirectChild
            if (r13 != r12) goto L4a
            r0.offsetChildToAnchor(r9, r2)
        L4a:
            int r11 = r11 + 1
            goto L39
        L4d:
            r11 = 1
            r0.getChildRect(r9, r11, r5)
            int r12 = r10.insetEdge
            if (r12 == 0) goto La9
            boolean r12 = r5.isEmpty()
            if (r12 != 0) goto La9
            int r12 = r10.insetEdge
            int r12 = androidx.core.view.GravityCompat.getAbsoluteGravity(r12, r2)
            r13 = r12 & 112(0x70, float:1.57E-43)
            r14 = 48
            if (r13 == r14) goto L7c
            r14 = 80
            if (r13 == r14) goto L6c
            goto L86
        L6c:
            int r13 = r4.bottom
            int r14 = r0.getHeight()
            int r15 = r5.top
            int r14 = r14 - r15
            int r13 = java.lang.Math.max(r13, r14)
            r4.bottom = r13
            goto L86
        L7c:
            int r13 = r4.top
            int r14 = r5.bottom
            int r13 = java.lang.Math.max(r13, r14)
            r4.top = r13
        L86:
            r12 = r12 & 7
            r13 = 3
            if (r12 == r13) goto L9f
            r13 = 5
            if (r12 == r13) goto L8f
            goto La9
        L8f:
            int r12 = r4.right
            int r13 = r0.getWidth()
            int r14 = r5.left
            int r13 = r13 - r14
            int r12 = java.lang.Math.max(r12, r13)
            r4.right = r12
            goto La9
        L9f:
            int r12 = r4.left
            int r13 = r5.right
            int r12 = java.lang.Math.max(r12, r13)
            r4.left = r12
        La9:
            int r10 = r10.dodgeInsetEdges
            if (r10 == 0) goto Lb6
            int r10 = r9.getVisibility()
            if (r10 != 0) goto Lb6
            r0.offsetChildByInset(r9, r4, r2)
        Lb6:
            r10 = 2
            if (r1 == r10) goto Lc6
            r0.getLastChildRect(r9, r6)
            boolean r12 = r6.equals(r5)
            if (r12 == 0) goto Lc3
            goto L103
        Lc3:
            r0.recordLastChildRect(r9, r5)
        Lc6:
            int r12 = r8 + 1
        Lc8:
            if (r12 >= r3) goto L103
            java.util.List<android.view.View> r13 = r0.mDependencySortedChildren
            java.lang.Object r13 = r13.get(r12)
            android.view.View r13 = (android.view.View) r13
            android.view.ViewGroup$LayoutParams r14 = r13.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r14 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r14
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r15 = r14.getBehavior()
            if (r15 == 0) goto L100
            boolean r16 = r15.layoutDependsOn(r0, r13, r9)
            if (r16 == 0) goto L100
            if (r1 != 0) goto Lf0
            boolean r16 = r14.getChangedAfterNestedScroll()
            if (r16 == 0) goto Lf0
            r14.resetChangedAfterNestedScroll()
            goto L100
        Lf0:
            if (r1 == r10) goto Lf7
            boolean r13 = r15.onDependentViewChanged(r0, r13, r9)
            goto Lfb
        Lf7:
            r15.onDependentViewRemoved(r0, r13, r9)
            r13 = 1
        Lfb:
            if (r1 != r11) goto L100
            r14.setChangedAfterNestedScroll(r13)
        L100:
            int r12 = r12 + 1
            goto Lc8
        L103:
            int r8 = r8 + 1
            goto L1c
        L107:
            releaseTempRect(r4)
            releaseTempRect(r5)
            releaseTempRect(r6)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
            r3 = this;
            super.onDetachedFromWindow()
            r0 = 0
            r3.resetTouchBehaviors(r0)
            boolean r1 = r3.mNeedsPreDrawListener
            if (r1 == 0) goto L18
            androidx.coordinatorlayout.widget.CoordinatorLayout$OnPreDrawListener r1 = r3.mOnPreDrawListener
            if (r1 == 0) goto L18
            android.view.ViewTreeObserver r1 = r3.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$OnPreDrawListener r2 = r3.mOnPreDrawListener
            r1.removeOnPreDrawListener(r2)
        L18:
            android.view.View r1 = r3.mNestedScrollingTarget
            if (r1 == 0) goto L1f
            r3.onStopNestedScroll(r1)
        L1f:
            r3.mIsAttachedToWindow = r0
            return
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas r5) {
            r4 = this;
            super.onDraw(r5)
            boolean r0 = r4.mDrawStatusBarBackground
            if (r0 == 0) goto L26
            android.graphics.drawable.Drawable r0 = r4.mStatusBarBackground
            if (r0 == 0) goto L26
            androidx.core.view.WindowInsetsCompat r0 = r4.mLastInsets
            r1 = 0
            if (r0 == 0) goto L15
            int r0 = r0.getSystemWindowInsetTop()
            goto L16
        L15:
            r0 = 0
        L16:
            if (r0 <= 0) goto L26
            android.graphics.drawable.Drawable r2 = r4.mStatusBarBackground
            int r3 = r4.getWidth()
            r2.setBounds(r1, r1, r3, r0)
            android.graphics.drawable.Drawable r0 = r4.mStatusBarBackground
            r0.draw(r5)
        L26:
            return
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getActionMasked()
            r1 = 1
            if (r0 != 0) goto La
            r3.resetTouchBehaviors(r1)
        La:
            r2 = 0
            boolean r4 = r3.performIntercept(r4, r2)
            if (r0 == r1) goto L16
            r2 = 3
            if (r0 != r2) goto L15
            goto L16
        L15:
            return r4
        L16:
            r3.resetTouchBehaviors(r1)
            return r4
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            int r2 = androidx.core.view.ViewCompat.getLayoutDirection(r1)
            java.util.List<android.view.View> r3 = r1.mDependencySortedChildren
            int r3 = r3.size()
            r4 = 0
        Lb:
            if (r4 >= r3) goto L36
            java.util.List<android.view.View> r5 = r1.mDependencySortedChildren
            java.lang.Object r5 = r5.get(r4)
            android.view.View r5 = (android.view.View) r5
            int r6 = r5.getVisibility()
            r0 = 8
            if (r6 != r0) goto L1e
            goto L33
        L1e:
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r6 = r6.getBehavior()
            if (r6 == 0) goto L30
            boolean r6 = r6.onLayoutChild(r1, r5, r2)
            if (r6 != 0) goto L33
        L30:
            r1.onLayoutChild(r5, r2)
        L33:
            int r4 = r4 + 1
            goto Lb
        L36:
            return
    }

    public void onLayoutChild(@androidx.annotation.NonNull android.view.View r3, int r4) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0
            boolean r1 = r0.checkAnchorChanged()
            if (r1 != 0) goto L20
            android.view.View r1 = r0.mAnchorView
            if (r1 == 0) goto L14
            r2.layoutChildWithAnchor(r3, r1, r4)
            return
        L14:
            int r0 = r0.keyline
            if (r0 < 0) goto L1c
            r2.layoutChildWithKeyline(r3, r0, r4)
            return
        L1c:
            r2.layoutChild(r3, r4)
            return
        L20:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete."
            r3.<init>(r4)
            throw r3
    }

    @Override // android.view.View
    protected void onMeasure(int r27, int r28) {
            r26 = this;
            r0 = r26
            r0.prepareChildren()
            r0.ensurePreDrawListener()
            int r7 = r0.getPaddingLeft()
            int r1 = r0.getPaddingTop()
            int r8 = r0.getPaddingRight()
            int r2 = r0.getPaddingBottom()
            int r9 = androidx.core.view.ViewCompat.getLayoutDirection(r0)
            r3 = 1
            if (r9 != r3) goto L21
            r11 = 1
            goto L22
        L21:
            r11 = 0
        L22:
            int r12 = android.view.View.MeasureSpec.getMode(r27)
            int r13 = android.view.View.MeasureSpec.getSize(r27)
            int r14 = android.view.View.MeasureSpec.getMode(r28)
            int r15 = android.view.View.MeasureSpec.getSize(r28)
            int r16 = r7 + r8
            int r17 = r1 + r2
            int r1 = r0.getSuggestedMinimumWidth()
            int r2 = r0.getSuggestedMinimumHeight()
            androidx.core.view.WindowInsetsCompat r4 = r0.mLastInsets
            if (r4 == 0) goto L4b
            boolean r4 = androidx.core.view.ViewCompat.getFitsSystemWindows(r0)
            if (r4 == 0) goto L4b
            r18 = 1
            goto L4d
        L4b:
            r18 = 0
        L4d:
            java.util.List<android.view.View> r3 = r0.mDependencySortedChildren
            int r3 = r3.size()
            r4 = 0
            r5 = 0
        L55:
            if (r4 >= r3) goto L183
            java.util.List<android.view.View> r6 = r0.mDependencySortedChildren
            java.lang.Object r6 = r6.get(r4)
            android.view.View r6 = (android.view.View) r6
            int r10 = r6.getVisibility()
            r20 = r1
            r1 = 8
            if (r10 != r1) goto L79
            r23 = r3
            r21 = r4
            r19 = r7
            r22 = r9
            r1 = r20
            r24 = 0
            r20 = r8
            goto L177
        L79:
            android.view.ViewGroup$LayoutParams r1 = r6.getLayoutParams()
            r10 = r1
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r10 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r10
            int r1 = r10.keyline
            if (r1 < 0) goto Lc6
            if (r12 == 0) goto Lc6
            int r1 = r0.getKeyline(r1)
            r21 = r1
            int r1 = r10.gravity
            int r1 = resolveKeylineGravity(r1)
            int r1 = androidx.core.view.GravityCompat.getAbsoluteGravity(r1, r9)
            r1 = r1 & 7
            r22 = r2
            r2 = 3
            if (r1 != r2) goto L9f
            if (r11 == 0) goto La4
        L9f:
            r2 = 5
            if (r1 != r2) goto Lb3
            if (r11 == 0) goto Lb3
        La4:
            int r1 = r13 - r8
            int r1 = r1 - r21
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)
        Lad:
            r25 = r4
            r4 = r1
            r1 = r25
            goto Lcb
        Lb3:
            if (r1 != r2) goto Lb7
            if (r11 == 0) goto Lbc
        Lb7:
            r2 = 3
            if (r1 != r2) goto Lc4
            if (r11 == 0) goto Lc4
        Lbc:
            int r1 = r21 - r7
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)
            goto Lad
        Lc4:
            r2 = 0
            goto Lc9
        Lc6:
            r22 = r2
            goto Lc4
        Lc9:
            r1 = r4
            r4 = 0
        Lcb:
            if (r18 == 0) goto Lff
            boolean r19 = androidx.core.view.ViewCompat.getFitsSystemWindows(r6)
            if (r19 != 0) goto Lff
            androidx.core.view.WindowInsetsCompat r2 = r0.mLastInsets
            int r2 = r2.getSystemWindowInsetLeft()
            r21 = r1
            androidx.core.view.WindowInsetsCompat r1 = r0.mLastInsets
            int r1 = r1.getSystemWindowInsetRight()
            int r2 = r2 + r1
            androidx.core.view.WindowInsetsCompat r1 = r0.mLastInsets
            int r1 = r1.getSystemWindowInsetTop()
            r23 = r1
            androidx.core.view.WindowInsetsCompat r1 = r0.mLastInsets
            int r1 = r1.getSystemWindowInsetBottom()
            int r1 = r23 + r1
            int r2 = r13 - r2
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r12)
            int r1 = r15 - r1
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r14)
            goto L105
        Lff:
            r21 = r1
            r2 = r27
            r1 = r28
        L105:
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r0 = r10.getBehavior()
            if (r0 == 0) goto L12f
            r23 = r3
            r3 = r2
            r2 = r6
            r6 = 0
            r19 = r22
            r22 = r9
            r9 = r19
            r24 = 0
            r19 = r7
            r7 = r20
            r20 = r8
            r8 = r5
            r5 = r1
            r1 = r26
            boolean r0 = r0.onMeasureChild(r1, r2, r3, r4, r5, r6)
            r1 = r3
            r3 = r4
            r4 = r5
            if (r0 != 0) goto L12c
            goto L144
        L12c:
            r0 = r26
            goto L14e
        L12f:
            r19 = r22
            r22 = r9
            r9 = r19
            r23 = r3
            r3 = r4
            r19 = r7
            r7 = r20
            r24 = 0
            r4 = r1
            r1 = r2
            r2 = r6
            r20 = r8
            r8 = r5
        L144:
            r5 = 0
            r0 = r2
            r2 = r1
            r1 = r0
            r0 = r26
            r0.onMeasureChild(r1, r2, r3, r4, r5)
            r2 = r1
        L14e:
            int r1 = r2.getMeasuredWidth()
            int r1 = r16 + r1
            int r3 = r10.leftMargin
            int r1 = r1 + r3
            int r3 = r10.rightMargin
            int r1 = r1 + r3
            int r1 = java.lang.Math.max(r7, r1)
            int r3 = r2.getMeasuredHeight()
            int r3 = r17 + r3
            int r4 = r10.topMargin
            int r3 = r3 + r4
            int r4 = r10.bottomMargin
            int r3 = r3 + r4
            int r3 = java.lang.Math.max(r9, r3)
            int r2 = r2.getMeasuredState()
            int r5 = android.view.View.combineMeasuredStates(r8, r2)
            r2 = r3
        L177:
            int r4 = r21 + 1
            r7 = r19
            r8 = r20
            r9 = r22
            r3 = r23
            goto L55
        L183:
            r7 = r1
            r9 = r2
            r8 = r5
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r8
            r2 = r27
            int r1 = android.view.View.resolveSizeAndState(r7, r2, r1)
            int r2 = r8 << 16
            r3 = r28
            int r2 = android.view.View.resolveSizeAndState(r9, r3, r2)
            r0.setMeasuredDimension(r1, r2)
            return
    }

    public void onMeasureChild(android.view.View r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(android.view.View r12, float r13, float r14, boolean r15) {
            r11 = this;
            int r0 = r11.getChildCount()
            r1 = 0
            r2 = 0
            r3 = 0
        L7:
            if (r2 >= r0) goto L3f
            android.view.View r6 = r11.getChildAt(r2)
            int r4 = r6.getVisibility()
            r5 = 8
            if (r4 != r5) goto L1b
        L15:
            r5 = r11
            r7 = r12
            r8 = r13
            r9 = r14
            r10 = r15
            goto L38
        L1b:
            android.view.ViewGroup$LayoutParams r4 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r4
            boolean r5 = r4.isNestedScrollAccepted(r1)
            if (r5 != 0) goto L28
            goto L15
        L28:
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r4 = r4.getBehavior()
            if (r4 == 0) goto L15
            r5 = r11
            r7 = r12
            r8 = r13
            r9 = r14
            r10 = r15
            boolean r12 = r4.onNestedFling(r5, r6, r7, r8, r9, r10)
            r3 = r3 | r12
        L38:
            int r2 = r2 + 1
            r12 = r7
            r13 = r8
            r14 = r9
            r15 = r10
            goto L7
        L3f:
            r5 = r11
            if (r3 == 0) goto L46
            r12 = 1
            r11.onChildViewsChanged(r12)
        L46:
            return r3
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(android.view.View r11, float r12, float r13) {
            r10 = this;
            int r0 = r10.getChildCount()
            r1 = 0
            r2 = 0
            r3 = 0
        L7:
            if (r2 >= r0) goto L3b
            android.view.View r6 = r10.getChildAt(r2)
            int r4 = r6.getVisibility()
            r5 = 8
            if (r4 != r5) goto L19
        L15:
            r7 = r11
            r8 = r12
            r9 = r13
            goto L35
        L19:
            android.view.ViewGroup$LayoutParams r4 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r4
            boolean r5 = r4.isNestedScrollAccepted(r1)
            if (r5 != 0) goto L26
            goto L15
        L26:
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r4 = r4.getBehavior()
            if (r4 == 0) goto L15
            r5 = r10
            r7 = r11
            r8 = r12
            r9 = r13
            boolean r11 = r4.onNestedPreFling(r5, r6, r7, r8, r9)
            r3 = r3 | r11
        L35:
            int r2 = r2 + 1
            r11 = r7
            r12 = r8
            r13 = r9
            goto L7
        L3b:
            return r3
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(android.view.View r7, int r8, int r9, int[] r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.onNestedPreScroll(r1, r2, r3, r4, r5)
            return
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(android.view.View r15, int r16, int r17, int[] r18, int r19) {
            r14 = this;
            int r8 = r14.getChildCount()
            r9 = 0
            r0 = 0
            r10 = 0
            r11 = 0
            r12 = 0
        L9:
            r13 = 1
            if (r10 >= r8) goto L68
            android.view.View r2 = r14.getChildAt(r10)
            int r3 = r2.getVisibility()
            r4 = 8
            if (r3 != r4) goto L19
            goto L65
        L19:
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r3
            r7 = r19
            boolean r4 = r3.isNestedScrollAccepted(r7)
            if (r4 != 0) goto L28
            goto L65
        L28:
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r3 = r3.getBehavior()
            if (r3 == 0) goto L65
            int[] r6 = r14.mBehaviorConsumed
            r6[r9] = r9
            r6[r13] = r9
            r1 = r14
            r4 = r16
            r5 = r17
            r0 = r3
            r3 = r15
            r0.onNestedPreScroll(r1, r2, r3, r4, r5, r6, r7)
            int[] r0 = r14.mBehaviorConsumed
            if (r16 <= 0) goto L4a
            r0 = r0[r9]
            int r0 = java.lang.Math.max(r11, r0)
        L48:
            r11 = r0
            goto L51
        L4a:
            r0 = r0[r9]
            int r0 = java.lang.Math.min(r11, r0)
            goto L48
        L51:
            int[] r0 = r14.mBehaviorConsumed
            if (r17 <= 0) goto L5d
            r0 = r0[r13]
            int r0 = java.lang.Math.max(r12, r0)
        L5b:
            r12 = r0
            goto L64
        L5d:
            r0 = r0[r13]
            int r0 = java.lang.Math.min(r12, r0)
            goto L5b
        L64:
            r0 = 1
        L65:
            int r10 = r10 + 1
            goto L9
        L68:
            r18[r9] = r11
            r18[r13] = r12
            if (r0 == 0) goto L71
            r14.onChildViewsChanged(r13)
        L71:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(android.view.View r8, int r9, int r10, int r11, int r12) {
            r7 = this;
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.onNestedScroll(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(android.view.View r9, int r10, int r11, int r12, int r13, int r14) {
            r8 = this;
            r6 = 0
            int[] r7 = r8.mNestedScrollingV2ConsumedCompat
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r0.onNestedScroll(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(@androidx.annotation.NonNull android.view.View r17, int r18, int r19, int r20, int r21, int r22, @androidx.annotation.NonNull int[] r23) {
            r16 = this;
            r1 = r16
            int r10 = r1.getChildCount()
            r11 = 0
            r0 = 0
            r12 = 0
            r13 = 0
            r14 = 0
        Lb:
            r15 = 1
            if (r12 >= r10) goto L6e
            android.view.View r2 = r1.getChildAt(r12)
            int r3 = r2.getVisibility()
            r4 = 8
            if (r3 != r4) goto L1b
            goto L6b
        L1b:
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r3
            r8 = r22
            boolean r4 = r3.isNestedScrollAccepted(r8)
            if (r4 != 0) goto L2a
            goto L6b
        L2a:
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r3 = r3.getBehavior()
            if (r3 == 0) goto L6b
            int[] r9 = r1.mBehaviorConsumed
            r9[r11] = r11
            r9[r15] = r11
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r0 = r3
            r3 = r17
            r0.onNestedScroll(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            int[] r0 = r1.mBehaviorConsumed
            if (r20 <= 0) goto L50
            r0 = r0[r11]
            int r0 = java.lang.Math.max(r13, r0)
        L4e:
            r13 = r0
            goto L57
        L50:
            r0 = r0[r11]
            int r0 = java.lang.Math.min(r13, r0)
            goto L4e
        L57:
            int[] r0 = r1.mBehaviorConsumed
            if (r21 <= 0) goto L63
            r0 = r0[r15]
            int r0 = java.lang.Math.max(r14, r0)
        L61:
            r14 = r0
            goto L6a
        L63:
            r0 = r0[r15]
            int r0 = java.lang.Math.min(r14, r0)
            goto L61
        L6a:
            r0 = 1
        L6b:
            int r12 = r12 + 1
            goto Lb
        L6e:
            r2 = r23[r11]
            int r2 = r2 + r13
            r23[r11] = r2
            r2 = r23[r15]
            int r2 = r2 + r14
            r23[r15] = r2
            if (r0 == 0) goto L7d
            r1.onChildViewsChanged(r15)
        L7d:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(android.view.View r2, android.view.View r3, int r4) {
            r1 = this;
            r0 = 0
            r1.onNestedScrollAccepted(r2, r3, r4, r0)
            return
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(android.view.View r10, android.view.View r11, int r12, int r13) {
            r9 = this;
            androidx.core.view.NestedScrollingParentHelper r0 = r9.mNestedScrollingParentHelper
            r0.onNestedScrollAccepted(r10, r11, r12, r13)
            r9.mNestedScrollingTarget = r11
            int r0 = r9.getChildCount()
            r1 = 0
        Lc:
            if (r1 >= r0) goto L38
            android.view.View r4 = r9.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r2 = r4.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r2 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r2
            boolean r3 = r2.isNestedScrollAccepted(r13)
            if (r3 != 0) goto L23
        L1e:
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            goto L31
        L23:
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r2 = r2.getBehavior()
            if (r2 == 0) goto L1e
            r3 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r2.onNestedScrollAccepted(r3, r4, r5, r6, r7, r8)
        L31:
            int r1 = r1 + 1
            r10 = r5
            r11 = r6
            r12 = r7
            r13 = r8
            goto Lc
        L38:
            return
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable r7) {
            r6 = this;
            boolean r0 = r7 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r7)
            return
        L8:
            androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState r7 = (androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState) r7
            android.os.Parcelable r0 = r7.getSuperState()
            super.onRestoreInstanceState(r0)
            android.util.SparseArray<android.os.Parcelable> r7 = r7.behaviorStates
            int r0 = r6.getChildCount()
            r1 = 0
        L18:
            if (r1 >= r0) goto L3d
            android.view.View r2 = r6.getChildAt(r1)
            int r3 = r2.getId()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r4 = r6.getResolvedLayoutParams(r2)
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r4 = r4.getBehavior()
            r5 = -1
            if (r3 == r5) goto L3a
            if (r4 == 0) goto L3a
            java.lang.Object r3 = r7.get(r3)
            android.os.Parcelable r3 = (android.os.Parcelable) r3
            if (r3 == 0) goto L3a
            r4.onRestoreInstanceState(r6, r2, r3)
        L3a:
            int r1 = r1 + 1
            goto L18
        L3d:
            return
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
            r8 = this;
            androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState
            android.os.Parcelable r1 = super.onSaveInstanceState()
            r0.<init>(r1)
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            int r2 = r8.getChildCount()
            r3 = 0
        L13:
            if (r3 >= r2) goto L38
            android.view.View r4 = r8.getChildAt(r3)
            int r5 = r4.getId()
            android.view.ViewGroup$LayoutParams r6 = r4.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r6 = r6.getBehavior()
            r7 = -1
            if (r5 == r7) goto L35
            if (r6 == 0) goto L35
            android.os.Parcelable r4 = r6.onSaveInstanceState(r8, r4)
            if (r4 == 0) goto L35
            r1.append(r5, r4)
        L35:
            int r3 = r3 + 1
            goto L13
        L38:
            r0.behaviorStates = r1
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(android.view.View r2, android.view.View r3, int r4) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.onStartNestedScroll(r2, r3, r4, r0)
            return r2
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(android.view.View r13, android.view.View r14, int r15, int r16) {
            r12 = this;
            int r7 = r12.getChildCount()
            r8 = 0
            r9 = 0
            r10 = 0
        L7:
            if (r9 >= r7) goto L3c
            android.view.View r2 = r12.getChildAt(r9)
            int r0 = r2.getVisibility()
            r1 = 8
            if (r0 != r1) goto L18
            r6 = r16
            goto L39
        L18:
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            r11 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r11 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r11
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r0 = r11.getBehavior()
            if (r0 == 0) goto L34
            r1 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            boolean r0 = r0.onStartNestedScroll(r1, r2, r3, r4, r5, r6)
            r10 = r10 | r0
            r11.setNestedScrollAccepted(r6, r0)
            goto L39
        L34:
            r6 = r16
            r11.setNestedScrollAccepted(r6, r8)
        L39:
            int r9 = r9 + 1
            goto L7
        L3c:
            return r10
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(android.view.View r2) {
            r1 = this;
            r0 = 0
            r1.onStopNestedScroll(r2, r0)
            return
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(android.view.View r6, int r7) {
            r5 = this;
            androidx.core.view.NestedScrollingParentHelper r0 = r5.mNestedScrollingParentHelper
            r0.onStopNestedScroll(r6, r7)
            int r0 = r5.getChildCount()
            r1 = 0
        La:
            if (r1 >= r0) goto L2f
            android.view.View r2 = r5.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r3
            boolean r4 = r3.isNestedScrollAccepted(r7)
            if (r4 != 0) goto L1d
            goto L2c
        L1d:
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r4 = r3.getBehavior()
            if (r4 == 0) goto L26
            r4.onStopNestedScroll(r5, r2, r6, r7)
        L26:
            r3.resetNestedScroll(r7)
            r3.resetChangedAfterNestedScroll()
        L2c:
            int r1 = r1 + 1
            goto La
        L2f:
            r6 = 0
            r5.mNestedScrollingTarget = r6
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r1.getActionMasked()
            android.view.View r3 = r0.mBehaviorTouchView
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.performIntercept(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = 0
            goto L2c
        L17:
            r3 = 0
        L18:
            android.view.View r6 = r0.mBehaviorTouchView
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r6 = r6.getBehavior()
            if (r6 == 0) goto L15
            android.view.View r7 = r0.mBehaviorTouchView
            boolean r6 = r6.onTouchEvent(r0, r7, r1)
        L2c:
            android.view.View r7 = r0.mBehaviorTouchView
            r8 = 0
            if (r7 != 0) goto L37
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L4a
        L37:
            if (r3 == 0) goto L4a
            long r9 = android.os.SystemClock.uptimeMillis()
            r15 = 0
            r16 = 0
            r13 = 3
            r14 = 0
            r11 = r9
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L4a:
            if (r8 == 0) goto L4f
            r8.recycle()
        L4f:
            if (r2 == r4) goto L56
            r1 = 3
            if (r2 != r1) goto L55
            goto L56
        L55:
            return r6
        L56:
            r0.resetTouchBehaviors(r5)
            return r6
    }

    void recordLastChildRect(android.view.View r1, android.graphics.Rect r2) {
            r0 = this;
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r1
            r1.setLastChildRect(r2)
            return
    }

    void removePreDrawListener() {
            r2 = this;
            boolean r0 = r2.mIsAttachedToWindow
            if (r0 == 0) goto L11
            androidx.coordinatorlayout.widget.CoordinatorLayout$OnPreDrawListener r0 = r2.mOnPreDrawListener
            if (r0 == 0) goto L11
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$OnPreDrawListener r1 = r2.mOnPreDrawListener
            r0.removeOnPreDrawListener(r1)
        L11:
            r0 = 0
            r2.mNeedsPreDrawListener = r0
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(android.view.View r2, android.graphics.Rect r3, boolean r4) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r0 = r0.getBehavior()
            if (r0 == 0) goto L14
            boolean r0 = r0.onRequestChildRectangleOnScreen(r1, r2, r3, r4)
            if (r0 == 0) goto L14
            r2 = 1
            return r2
        L14:
            boolean r2 = super.requestChildRectangleOnScreen(r2, r3, r4)
            return r2
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean r1) {
            r0 = this;
            super.requestDisallowInterceptTouchEvent(r1)
            if (r1 == 0) goto L10
            boolean r1 = r0.mDisallowInterceptReset
            if (r1 != 0) goto L10
            r1 = 0
            r0.resetTouchBehaviors(r1)
            r1 = 1
            r0.mDisallowInterceptReset = r1
        L10:
            return
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean r1) {
            r0 = this;
            super.setFitsSystemWindows(r1)
            r0.setupForInsets()
            return
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(android.view.ViewGroup.OnHierarchyChangeListener r1) {
            r0 = this;
            r0.mOnHierarchyChangeListener = r1
            return
    }

    public void setStatusBarBackground(@androidx.annotation.Nullable android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.mStatusBarBackground
            if (r0 == r3) goto L43
            r1 = 0
            if (r0 == 0) goto La
            r0.setCallback(r1)
        La:
            if (r3 == 0) goto L10
            android.graphics.drawable.Drawable r1 = r3.mutate()
        L10:
            r2.mStatusBarBackground = r1
            if (r1 == 0) goto L40
            boolean r3 = r1.isStateful()
            if (r3 == 0) goto L23
            android.graphics.drawable.Drawable r3 = r2.mStatusBarBackground
            int[] r0 = r2.getDrawableState()
            r3.setState(r0)
        L23:
            android.graphics.drawable.Drawable r3 = r2.mStatusBarBackground
            int r0 = androidx.core.view.ViewCompat.getLayoutDirection(r2)
            androidx.core.graphics.drawable.DrawableCompat.setLayoutDirection(r3, r0)
            android.graphics.drawable.Drawable r3 = r2.mStatusBarBackground
            int r0 = r2.getVisibility()
            r1 = 0
            if (r0 != 0) goto L37
            r0 = 1
            goto L38
        L37:
            r0 = 0
        L38:
            r3.setVisible(r0, r1)
            android.graphics.drawable.Drawable r3 = r2.mStatusBarBackground
            r3.setCallback(r2)
        L40:
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r2)
        L43:
            return
    }

    public void setStatusBarBackgroundColor(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r2)
            r1.setStatusBarBackground(r0)
            return
    }

    public void setStatusBarBackgroundResource(@androidx.annotation.DrawableRes int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = androidx.core.content.ContextCompat.getDrawable(r0, r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setStatusBarBackground(r2)
            return
    }

    @Override // android.view.View
    public void setVisibility(int r3) {
            r2 = this;
            super.setVisibility(r3)
            r0 = 0
            if (r3 != 0) goto L8
            r3 = 1
            goto L9
        L8:
            r3 = 0
        L9:
            android.graphics.drawable.Drawable r1 = r2.mStatusBarBackground
            if (r1 == 0) goto L18
            boolean r1 = r1.isVisible()
            if (r1 == r3) goto L18
            android.graphics.drawable.Drawable r1 = r2.mStatusBarBackground
            r1.setVisible(r3, r0)
        L18:
            return
    }

    final androidx.core.view.WindowInsetsCompat setWindowInsets(androidx.core.view.WindowInsetsCompat r4) {
            r3 = this;
            androidx.core.view.WindowInsetsCompat r0 = r3.mLastInsets
            boolean r0 = androidx.core.util.ObjectsCompat.equals(r0, r4)
            if (r0 != 0) goto L2c
            r3.mLastInsets = r4
            r0 = 0
            r1 = 1
            if (r4 == 0) goto L16
            int r2 = r4.getSystemWindowInsetTop()
            if (r2 <= 0) goto L16
            r2 = 1
            goto L17
        L16:
            r2 = 0
        L17:
            r3.mDrawStatusBarBackground = r2
            if (r2 != 0) goto L22
            android.graphics.drawable.Drawable r2 = r3.getBackground()
            if (r2 != 0) goto L22
            r0 = 1
        L22:
            r3.setWillNotDraw(r0)
            androidx.core.view.WindowInsetsCompat r4 = r3.dispatchApplyWindowInsetsToBehaviors(r4)
            r3.requestLayout()
        L2c:
            return r4
    }

    @Override // android.view.View
    protected boolean verifyDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            boolean r0 = super.verifyDrawable(r2)
            if (r0 != 0) goto Ld
            android.graphics.drawable.Drawable r0 = r1.mStatusBarBackground
            if (r2 != r0) goto Lb
            goto Ld
        Lb:
            r2 = 0
            return r2
        Ld:
            r2 = 1
            return r2
    }
}
