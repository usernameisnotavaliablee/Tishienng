package com.google.android.material.floatingactionbutton;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class ExtendedFloatingActionButton extends com.google.android.material.button.MaterialButton implements androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior {
    private static final int ANIM_STATE_HIDING = 1;
    private static final int ANIM_STATE_NONE = 0;
    private static final int ANIM_STATE_SHOWING = 2;
    private static final int DEF_STYLE_RES = 0;
    private static final int EXTEND = 3;
    private static final int EXTEND_STRATEGY_AUTO = 0;
    private static final int EXTEND_STRATEGY_MATCH_PARENT = 2;
    private static final int EXTEND_STRATEGY_WRAP_CONTENT = 1;
    static final android.util.Property<android.view.View, java.lang.Float> HEIGHT = null;
    private static final int HIDE = 1;
    static final android.util.Property<android.view.View, java.lang.Float> PADDING_END = null;
    static final android.util.Property<android.view.View, java.lang.Float> PADDING_START = null;
    private static final int SHOW = 0;
    private static final int SHRINK = 2;
    static final android.util.Property<android.view.View, java.lang.Float> WIDTH = null;
    private int animState;
    private boolean animateShowBeforeLayout;

    @androidx.annotation.NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton> behavior;
    private final com.google.android.material.floatingactionbutton.AnimatorTracker changeVisibilityTracker;
    private final int collapsedSize;

    @androidx.annotation.NonNull
    private final com.google.android.material.floatingactionbutton.MotionStrategy extendStrategy;
    private final int extendStrategyType;
    private int extendedPaddingEnd;
    private int extendedPaddingStart;
    private final com.google.android.material.floatingactionbutton.MotionStrategy hideStrategy;
    private boolean isExtended;
    private boolean isTransforming;
    private int originalHeight;

    @androidx.annotation.NonNull
    protected android.content.res.ColorStateList originalTextCsl;
    private int originalWidth;
    private final com.google.android.material.floatingactionbutton.MotionStrategy showStrategy;

    @androidx.annotation.NonNull
    private final com.google.android.material.floatingactionbutton.MotionStrategy shrinkStrategy;










    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class ChangeSizeStrategy extends com.google.android.material.floatingactionbutton.BaseMotionStrategy {
        private final boolean extending;
        private final com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size size;
        final /* synthetic */ com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton this$0;

        ChangeSizeStrategy(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r1, com.google.android.material.floatingactionbutton.AnimatorTracker r2, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size r3, boolean r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1, r2)
                r0.size = r3
                r0.extending = r4
                return
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        @androidx.annotation.NonNull
        public android.animation.AnimatorSet createAnimator() {
                r10 = this;
                com.google.android.material.animation.MotionSpec r0 = r10.getCurrentMotionSpec()
                java.lang.String r1 = "width"
                boolean r2 = r0.hasPropertyValues(r1)
                r3 = 1
                r4 = 2
                r5 = 0
                if (r2 == 0) goto L2f
                android.animation.PropertyValuesHolder[] r2 = r0.getPropertyValues(r1)
                r6 = r2[r5]
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r7 = r10.this$0
                int r7 = r7.getWidth()
                float r7 = (float) r7
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$Size r8 = r10.size
                int r8 = r8.getWidth()
                float r8 = (float) r8
                float[] r9 = new float[r4]
                r9[r5] = r7
                r9[r3] = r8
                r6.setFloatValues(r9)
                r0.setPropertyValues(r1, r2)
            L2f:
                java.lang.String r1 = "height"
                boolean r2 = r0.hasPropertyValues(r1)
                if (r2 == 0) goto L57
                android.animation.PropertyValuesHolder[] r2 = r0.getPropertyValues(r1)
                r6 = r2[r5]
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r7 = r10.this$0
                int r7 = r7.getHeight()
                float r7 = (float) r7
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$Size r8 = r10.size
                int r8 = r8.getHeight()
                float r8 = (float) r8
                float[] r9 = new float[r4]
                r9[r5] = r7
                r9[r3] = r8
                r6.setFloatValues(r9)
                r0.setPropertyValues(r1, r2)
            L57:
                java.lang.String r1 = "paddingStart"
                boolean r2 = r0.hasPropertyValues(r1)
                if (r2 == 0) goto L7f
                android.animation.PropertyValuesHolder[] r2 = r0.getPropertyValues(r1)
                r6 = r2[r5]
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r7 = r10.this$0
                int r7 = androidx.core.view.ViewCompat.getPaddingStart(r7)
                float r7 = (float) r7
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$Size r8 = r10.size
                int r8 = r8.getPaddingStart()
                float r8 = (float) r8
                float[] r9 = new float[r4]
                r9[r5] = r7
                r9[r3] = r8
                r6.setFloatValues(r9)
                r0.setPropertyValues(r1, r2)
            L7f:
                java.lang.String r1 = "paddingEnd"
                boolean r2 = r0.hasPropertyValues(r1)
                if (r2 == 0) goto La7
                android.animation.PropertyValuesHolder[] r2 = r0.getPropertyValues(r1)
                r6 = r2[r5]
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r7 = r10.this$0
                int r7 = androidx.core.view.ViewCompat.getPaddingEnd(r7)
                float r7 = (float) r7
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$Size r8 = r10.size
                int r8 = r8.getPaddingEnd()
                float r8 = (float) r8
                float[] r9 = new float[r4]
                r9[r5] = r7
                r9[r3] = r8
                r6.setFloatValues(r9)
                r0.setPropertyValues(r1, r2)
            La7:
                java.lang.String r1 = "labelOpacity"
                boolean r2 = r0.hasPropertyValues(r1)
                if (r2 == 0) goto Ld0
                android.animation.PropertyValuesHolder[] r2 = r0.getPropertyValues(r1)
                boolean r6 = r10.extending
                r7 = 1065353216(0x3f800000, float:1.0)
                r8 = 0
                if (r6 == 0) goto Lbc
                r9 = 0
                goto Lbe
            Lbc:
                r9 = 1065353216(0x3f800000, float:1.0)
            Lbe:
                if (r6 == 0) goto Lc1
                goto Lc2
            Lc1:
                r7 = 0
            Lc2:
                r6 = r2[r5]
                float[] r4 = new float[r4]
                r4[r5] = r9
                r4[r3] = r7
                r6.setFloatValues(r4)
                r0.setPropertyValues(r1, r2)
            Ld0:
                android.animation.AnimatorSet r0 = super.createAnimator(r0)
                return r0
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public int getDefaultMotionSpecResource() {
                r1 = this;
                boolean r0 = r1.extending
                if (r0 == 0) goto L7
                int r0 = com.google.android.material.R.animator.mtrl_extended_fab_change_size_expand_motion_spec
                return r0
            L7:
                int r0 = com.google.android.material.R.animator.mtrl_extended_fab_change_size_collapse_motion_spec
                return r0
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationEnd() {
                r2 = this;
                super.onAnimationEnd()
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r2.this$0
                r1 = 0
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.access$602(r0, r1)
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r2.this$0
                r0.setHorizontallyScrolling(r1)
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r2.this$0
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                if (r0 != 0) goto L17
                return
            L17:
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$Size r1 = r2.size
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                int r1 = r1.width
                r0.width = r1
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$Size r1 = r2.size
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                int r1 = r1.height
                r0.height = r1
                return
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationStart(android.animation.Animator r2) {
                r1 = this;
                super.onAnimationStart(r2)
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r2 = r1.this$0
                boolean r0 = r1.extending
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.access$502(r2, r0)
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r2 = r1.this$0
                r0 = 1
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.access$602(r2, r0)
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r2 = r1.this$0
                r2.setHorizontallyScrolling(r0)
                return
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void onChange(@androidx.annotation.Nullable com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OnChangedCallback r2) {
                r1 = this;
                if (r2 != 0) goto L3
                return
            L3:
                boolean r0 = r1.extending
                if (r0 == 0) goto Ld
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r1.this$0
                r2.onExtended(r0)
                return
            Ld:
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r1.this$0
                r2.onShrunken(r0)
                return
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void performNow() {
                r5 = this;
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r5.this$0
                boolean r1 = r5.extending
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.access$502(r0, r1)
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r5.this$0
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                if (r0 != 0) goto L10
                return
            L10:
                boolean r1 = r5.extending
                if (r1 != 0) goto L22
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r1 = r5.this$0
                int r2 = r0.width
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.access$302(r1, r2)
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r1 = r5.this$0
                int r2 = r0.height
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.access$202(r1, r2)
            L22:
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$Size r1 = r5.size
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                int r1 = r1.width
                r0.width = r1
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$Size r1 = r5.size
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                int r1 = r1.height
                r0.height = r1
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r5.this$0
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$Size r1 = r5.size
                int r1 = r1.getPaddingStart()
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r2 = r5.this$0
                int r2 = r2.getPaddingTop()
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$Size r3 = r5.size
                int r3 = r3.getPaddingEnd()
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r4 = r5.this$0
                int r4 = r4.getPaddingBottom()
                androidx.core.view.ViewCompat.setPaddingRelative(r0, r1, r2, r3, r4)
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r5.this$0
                r0.requestLayout()
                return
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public boolean shouldCancel() {
                r2 = this;
                boolean r0 = r2.extending
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r1 = r2.this$0
                boolean r1 = com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.access$500(r1)
                if (r0 == r1) goto L21
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r2.this$0
                android.graphics.drawable.Drawable r0 = r0.getIcon()
                if (r0 == 0) goto L21
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r2.this$0
                java.lang.CharSequence r0 = r0.getText()
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L1f
                goto L21
            L1f:
                r0 = 0
                return r0
            L21:
                r0 = 1
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    protected static class ExtendedFloatingActionButtonBehavior<T extends com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton> extends androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<T> {
        private static final boolean AUTO_HIDE_DEFAULT = false;
        private static final boolean AUTO_SHRINK_DEFAULT = true;
        private boolean autoHideEnabled;
        private boolean autoShrinkEnabled;

        @androidx.annotation.Nullable
        private com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OnChangedCallback internalAutoHideCallback;

        @androidx.annotation.Nullable
        private com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OnChangedCallback internalAutoShrinkCallback;
        private android.graphics.Rect tmpRect;

        public ExtendedFloatingActionButtonBehavior() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.autoHideEnabled = r0
                r0 = 1
                r1.autoShrinkEnabled = r0
                return
        }

        public ExtendedFloatingActionButtonBehavior(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
                r1 = this;
                r1.<init>(r2, r3)
                int[] r0 = com.google.android.material.R.styleable.ExtendedFloatingActionButton_Behavior_Layout
                android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
                int r3 = com.google.android.material.R.styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide
                r0 = 0
                boolean r3 = r2.getBoolean(r3, r0)
                r1.autoHideEnabled = r3
                int r3 = com.google.android.material.R.styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink
                r0 = 1
                boolean r3 = r2.getBoolean(r3, r0)
                r1.autoShrinkEnabled = r3
                r2.recycle()
                return
        }

        private static boolean isBottomSheet(@androidx.annotation.NonNull android.view.View r1) {
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                boolean r0 = r1 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams
                if (r0 == 0) goto L11
                androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r1
                androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r1 = r1.getBehavior()
                boolean r1 = r1 instanceof com.google.android.material.bottomsheet.BottomSheetBehavior
                return r1
            L11:
                r1 = 0
                return r1
        }

        private boolean shouldUpdateVisibility(@androidx.annotation.NonNull android.view.View r3, @androidx.annotation.NonNull com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r4) {
                r2 = this;
                android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r4
                boolean r0 = r2.autoHideEnabled
                r1 = 0
                if (r0 != 0) goto L10
                boolean r0 = r2.autoShrinkEnabled
                if (r0 != 0) goto L10
                return r1
            L10:
                int r4 = r4.getAnchorId()
                int r3 = r3.getId()
                if (r4 == r3) goto L1b
                return r1
            L1b:
                r3 = 1
                return r3
        }

        private boolean updateFabVisibilityForAppBarLayout(androidx.coordinatorlayout.widget.CoordinatorLayout r2, @androidx.annotation.NonNull com.google.android.material.appbar.AppBarLayout r3, @androidx.annotation.NonNull com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r4) {
                r1 = this;
                boolean r0 = r1.shouldUpdateVisibility(r3, r4)
                if (r0 != 0) goto L8
                r2 = 0
                return r2
            L8:
                android.graphics.Rect r0 = r1.tmpRect
                if (r0 != 0) goto L13
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r1.tmpRect = r0
            L13:
                android.graphics.Rect r0 = r1.tmpRect
                com.google.android.material.internal.DescendantOffsetUtils.getDescendantRect(r2, r3, r0)
                int r2 = r0.bottom
                int r3 = r3.getMinimumHeightForVisibleOverlappingContent()
                if (r2 > r3) goto L24
                r1.shrinkOrHide(r4)
                goto L27
            L24:
                r1.extendOrShow(r4)
            L27:
                r2 = 1
                return r2
        }

        private boolean updateFabVisibilityForBottomSheet(@androidx.annotation.NonNull android.view.View r3, @androidx.annotation.NonNull com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r4) {
                r2 = this;
                boolean r0 = r2.shouldUpdateVisibility(r3, r4)
                if (r0 != 0) goto L8
                r3 = 0
                return r3
            L8:
                android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0
                int r3 = r3.getTop()
                int r1 = r4.getHeight()
                int r1 = r1 / 2
                int r0 = r0.topMargin
                int r1 = r1 + r0
                if (r3 >= r1) goto L21
                r2.shrinkOrHide(r4)
                goto L24
            L21:
                r2.extendOrShow(r4)
            L24:
                r3 = 1
                return r3
        }

        protected void extendOrShow(@androidx.annotation.NonNull com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r3) {
                r2 = this;
                boolean r0 = r2.autoShrinkEnabled
                if (r0 == 0) goto L7
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$OnChangedCallback r1 = r2.internalAutoShrinkCallback
                goto L9
            L7:
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$OnChangedCallback r1 = r2.internalAutoHideCallback
            L9:
                if (r0 == 0) goto Ld
                r0 = 3
                goto Le
            Ld:
                r0 = 0
            Le:
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.access$400(r3, r0, r1)
                return
        }

        public /* bridge */ /* synthetic */ boolean getInsetDodgeRect(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull android.graphics.Rect r3) {
                r0 = this;
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r2 = (com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton) r2
                boolean r1 = r0.getInsetDodgeRect(r1, r2, r3)
                return r1
        }

        public boolean getInsetDodgeRect(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r2, @androidx.annotation.NonNull android.graphics.Rect r3) {
                r0 = this;
                boolean r1 = super.getInsetDodgeRect(r1, r2, r3)
                return r1
        }

        public boolean isAutoHideEnabled() {
                r1 = this;
                boolean r0 = r1.autoHideEnabled
                return r0
        }

        public boolean isAutoShrinkEnabled() {
                r1 = this;
                boolean r0 = r1.autoShrinkEnabled
                return r0
        }

        public void onAttachedToLayoutParams(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams r2) {
                r1 = this;
                int r0 = r2.dodgeInsetEdges
                if (r0 != 0) goto L8
                r0 = 80
                r2.dodgeInsetEdges = r0
            L8:
                return
        }

        public /* bridge */ /* synthetic */ boolean onDependentViewChanged(androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull android.view.View r2, android.view.View r3) {
                r0 = this;
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r2 = (com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton) r2
                boolean r1 = r0.onDependentViewChanged(r1, r2, r3)
                return r1
        }

        public boolean onDependentViewChanged(androidx.coordinatorlayout.widget.CoordinatorLayout r2, @androidx.annotation.NonNull com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r3, android.view.View r4) {
                r1 = this;
                boolean r0 = r4 instanceof com.google.android.material.appbar.AppBarLayout
                if (r0 == 0) goto La
                com.google.android.material.appbar.AppBarLayout r4 = (com.google.android.material.appbar.AppBarLayout) r4
                r1.updateFabVisibilityForAppBarLayout(r2, r4, r3)
                goto L13
            La:
                boolean r2 = isBottomSheet(r4)
                if (r2 == 0) goto L13
                r1.updateFabVisibilityForBottomSheet(r4, r3)
            L13:
                r2 = 0
                return r2
        }

        public /* bridge */ /* synthetic */ boolean onLayoutChild(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r1, @androidx.annotation.NonNull android.view.View r2, int r3) {
                r0 = this;
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r2 = (com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton) r2
                boolean r1 = r0.onLayoutChild(r1, r2, r3)
                return r1
        }

        public boolean onLayoutChild(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r6, @androidx.annotation.NonNull com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r7, int r8) {
                r5 = this;
                java.util.List r0 = r6.getDependencies(r7)
                int r1 = r0.size()
                r2 = 0
            L9:
                if (r2 >= r1) goto L2e
                java.lang.Object r3 = r0.get(r2)
                android.view.View r3 = (android.view.View) r3
                boolean r4 = r3 instanceof com.google.android.material.appbar.AppBarLayout
                if (r4 == 0) goto L1e
                com.google.android.material.appbar.AppBarLayout r3 = (com.google.android.material.appbar.AppBarLayout) r3
                boolean r3 = r5.updateFabVisibilityForAppBarLayout(r6, r3, r7)
                if (r3 == 0) goto L2b
                goto L2e
            L1e:
                boolean r4 = isBottomSheet(r3)
                if (r4 == 0) goto L2b
                boolean r3 = r5.updateFabVisibilityForBottomSheet(r3, r7)
                if (r3 == 0) goto L2b
                goto L2e
            L2b:
                int r2 = r2 + 1
                goto L9
            L2e:
                r6.onLayoutChild(r7, r8)
                r6 = 1
                return r6
        }

        public void setAutoHideEnabled(boolean r1) {
                r0 = this;
                r0.autoHideEnabled = r1
                return
        }

        public void setAutoShrinkEnabled(boolean r1) {
                r0 = this;
                r0.autoShrinkEnabled = r1
                return
        }

        @androidx.annotation.VisibleForTesting
        void setInternalAutoHideCallback(@androidx.annotation.Nullable com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OnChangedCallback r1) {
                r0 = this;
                r0.internalAutoHideCallback = r1
                return
        }

        @androidx.annotation.VisibleForTesting
        void setInternalAutoShrinkCallback(@androidx.annotation.Nullable com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OnChangedCallback r1) {
                r0 = this;
                r0.internalAutoShrinkCallback = r1
                return
        }

        protected void shrinkOrHide(@androidx.annotation.NonNull com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r3) {
                r2 = this;
                boolean r0 = r2.autoShrinkEnabled
                if (r0 == 0) goto L7
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$OnChangedCallback r1 = r2.internalAutoShrinkCallback
                goto L9
            L7:
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$OnChangedCallback r1 = r2.internalAutoHideCallback
            L9:
                if (r0 == 0) goto Ld
                r0 = 2
                goto Le
            Ld:
                r0 = 1
            Le:
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.access$400(r3, r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class HideStrategy extends com.google.android.material.floatingactionbutton.BaseMotionStrategy {
        private boolean isCancelled;
        final /* synthetic */ com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton this$0;

        public HideStrategy(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r1, com.google.android.material.floatingactionbutton.AnimatorTracker r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1, r2)
                return
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public int getDefaultMotionSpecResource() {
                r1 = this;
                int r0 = com.google.android.material.R.animator.mtrl_extended_fab_hide_motion_spec
                return r0
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationCancel() {
                r1 = this;
                super.onAnimationCancel()
                r0 = 1
                r1.isCancelled = r0
                return
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationEnd() {
                r2 = this;
                super.onAnimationEnd()
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r2.this$0
                r1 = 0
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.access$702(r0, r1)
                boolean r0 = r2.isCancelled
                if (r0 != 0) goto L14
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r2.this$0
                r1 = 8
                r0.setVisibility(r1)
            L14:
                return
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationStart(android.animation.Animator r2) {
                r1 = this;
                super.onAnimationStart(r2)
                r2 = 0
                r1.isCancelled = r2
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r1.this$0
                r0.setVisibility(r2)
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r2 = r1.this$0
                r0 = 1
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.access$702(r2, r0)
                return
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void onChange(@androidx.annotation.Nullable com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OnChangedCallback r2) {
                r1 = this;
                if (r2 == 0) goto L7
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r1.this$0
                r2.onHidden(r0)
            L7:
                return
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void performNow() {
                r2 = this;
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r2.this$0
                r1 = 8
                r0.setVisibility(r1)
                return
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public boolean shouldCancel() {
                r1 = this;
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r1.this$0
                boolean r0 = com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.access$900(r0)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class OnChangedCallback {
        public OnChangedCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onExtended(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r1) {
                r0 = this;
                return
        }

        public void onHidden(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r1) {
                r0 = this;
                return
        }

        public void onShown(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r1) {
                r0 = this;
                return
        }

        public void onShrunken(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r1) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class ShowStrategy extends com.google.android.material.floatingactionbutton.BaseMotionStrategy {
        final /* synthetic */ com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton this$0;

        public ShowStrategy(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r1, com.google.android.material.floatingactionbutton.AnimatorTracker r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1, r2)
                return
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public int getDefaultMotionSpecResource() {
                r1 = this;
                int r0 = com.google.android.material.R.animator.mtrl_extended_fab_show_motion_spec
                return r0
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationEnd() {
                r2 = this;
                super.onAnimationEnd()
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r2.this$0
                r1 = 0
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.access$702(r0, r1)
                return
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationStart(android.animation.Animator r2) {
                r1 = this;
                super.onAnimationStart(r2)
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r2 = r1.this$0
                r0 = 0
                r2.setVisibility(r0)
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r2 = r1.this$0
                r0 = 2
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.access$702(r2, r0)
                return
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void onChange(@androidx.annotation.Nullable com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OnChangedCallback r2) {
                r1 = this;
                if (r2 == 0) goto L7
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r1.this$0
                r2.onShown(r0)
            L7:
                return
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void performNow() {
                r2 = this;
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r2.this$0
                r1 = 0
                r0.setVisibility(r1)
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r2.this$0
                r1 = 1065353216(0x3f800000, float:1.0)
                r0.setAlpha(r1)
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r2.this$0
                r0.setScaleY(r1)
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r2.this$0
                r0.setScaleX(r1)
                return
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public boolean shouldCancel() {
                r1 = this;
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r1.this$0
                boolean r0 = com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.access$800(r0)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface Size {
        int getHeight();

        android.view.ViewGroup.LayoutParams getLayoutParams();

        int getPaddingEnd();

        int getPaddingStart();

        int getWidth();
    }

    static {
            int r0 = com.google.android.material.R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.DEF_STYLE_RES = r0
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$6 r0 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$6
            java.lang.String r1 = "width"
            java.lang.Class<java.lang.Float> r2 = java.lang.Float.class
            r0.<init>(r2, r1)
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.WIDTH = r0
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$7 r0 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$7
            java.lang.String r1 = "height"
            r0.<init>(r2, r1)
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.HEIGHT = r0
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$8 r0 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$8
            java.lang.String r1 = "paddingStart"
            r0.<init>(r2, r1)
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.PADDING_START = r0
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$9 r0 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$9
            java.lang.String r1 = "paddingEnd"
            r0.<init>(r2, r1)
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.PADDING_END = r0
            return
    }

    public ExtendedFloatingActionButton(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ExtendedFloatingActionButton(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.R.attr.extendedFloatingActionButtonStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public ExtendedFloatingActionButton(@androidx.annotation.NonNull android.content.Context r18, @androidx.annotation.Nullable android.util.AttributeSet r19, int r20) {
            r17 = this;
            r0 = r17
            r2 = r19
            r4 = r20
            int r5 = com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.DEF_STYLE_RES
            r1 = r18
            android.content.Context r1 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r1, r2, r4, r5)
            r0.<init>(r1, r2, r4)
            r7 = 0
            r0.animState = r7
            com.google.android.material.floatingactionbutton.AnimatorTracker r1 = new com.google.android.material.floatingactionbutton.AnimatorTracker
            r1.<init>()
            r0.changeVisibilityTracker = r1
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ShowStrategy r8 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ShowStrategy
            r8.<init>(r0, r1)
            r0.showStrategy = r8
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$HideStrategy r9 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$HideStrategy
            r9.<init>(r0, r1)
            r0.hideStrategy = r9
            r10 = 1
            r0.isExtended = r10
            r0.isTransforming = r7
            r0.animateShowBeforeLayout = r7
            android.content.Context r1 = r0.getContext()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior r3 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior
            r3.<init>(r1, r2)
            r0.behavior = r3
            int[] r3 = com.google.android.material.R.styleable.ExtendedFloatingActionButton
            int[] r6 = new int[r7]
            android.content.res.TypedArray r3 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r1, r2, r3, r4, r5, r6)
            int r6 = com.google.android.material.R.styleable.ExtendedFloatingActionButton_showMotionSpec
            com.google.android.material.animation.MotionSpec r6 = com.google.android.material.animation.MotionSpec.createFromAttribute(r1, r3, r6)
            int r11 = com.google.android.material.R.styleable.ExtendedFloatingActionButton_hideMotionSpec
            com.google.android.material.animation.MotionSpec r11 = com.google.android.material.animation.MotionSpec.createFromAttribute(r1, r3, r11)
            int r12 = com.google.android.material.R.styleable.ExtendedFloatingActionButton_extendMotionSpec
            com.google.android.material.animation.MotionSpec r12 = com.google.android.material.animation.MotionSpec.createFromAttribute(r1, r3, r12)
            int r13 = com.google.android.material.R.styleable.ExtendedFloatingActionButton_shrinkMotionSpec
            com.google.android.material.animation.MotionSpec r13 = com.google.android.material.animation.MotionSpec.createFromAttribute(r1, r3, r13)
            int r14 = com.google.android.material.R.styleable.ExtendedFloatingActionButton_collapsedSize
            r15 = -1
            int r14 = r3.getDimensionPixelSize(r14, r15)
            r0.collapsedSize = r14
            int r14 = com.google.android.material.R.styleable.ExtendedFloatingActionButton_extendStrategy
            int r14 = r3.getInt(r14, r10)
            r0.extendStrategyType = r14
            int r15 = androidx.core.view.ViewCompat.getPaddingStart(r0)
            r0.extendedPaddingStart = r15
            int r15 = androidx.core.view.ViewCompat.getPaddingEnd(r0)
            r0.extendedPaddingEnd = r15
            com.google.android.material.floatingactionbutton.AnimatorTracker r15 = new com.google.android.material.floatingactionbutton.AnimatorTracker
            r15.<init>()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ChangeSizeStrategy r7 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ChangeSizeStrategy
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$Size r14 = r0.getSizeFromExtendStrategyType(r14)
            r7.<init>(r0, r15, r14, r10)
            r0.extendStrategy = r7
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ChangeSizeStrategy r10 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ChangeSizeStrategy
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$1 r14 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$1
            r14.<init>(r0)
            r16 = r3
            r3 = 0
            r10.<init>(r0, r15, r14, r3)
            r0.shrinkStrategy = r10
            r8.setMotionSpec(r6)
            r9.setMotionSpec(r11)
            r7.setMotionSpec(r12)
            r10.setMotionSpec(r13)
            r16.recycle()
            com.google.android.material.shape.CornerSize r3 = com.google.android.material.shape.ShapeAppearanceModel.PILL
            com.google.android.material.shape.ShapeAppearanceModel$Builder r1 = com.google.android.material.shape.ShapeAppearanceModel.builder(r1, r2, r4, r5, r3)
            com.google.android.material.shape.ShapeAppearanceModel r1 = r1.build()
            r0.setShapeAppearanceModel(r1)
            r0.saveOriginalTextCsl()
            return
    }

    static /* synthetic */ int access$000(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0) {
            int r0 = r0.extendedPaddingStart
            return r0
    }

    static /* synthetic */ int access$100(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0) {
            int r0 = r0.extendedPaddingEnd
            return r0
    }

    static /* synthetic */ int access$200(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0) {
            int r0 = r0.originalHeight
            return r0
    }

    static /* synthetic */ int access$202(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0, int r1) {
            r0.originalHeight = r1
            return r1
    }

    static /* synthetic */ int access$300(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0) {
            int r0 = r0.originalWidth
            return r0
    }

    static /* synthetic */ int access$302(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0, int r1) {
            r0.originalWidth = r1
            return r1
    }

    static /* synthetic */ void access$400(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0, int r1, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OnChangedCallback r2) {
            r0.performMotion(r1, r2)
            return
    }

    static /* synthetic */ boolean access$500(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0) {
            boolean r0 = r0.isExtended
            return r0
    }

    static /* synthetic */ boolean access$502(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0, boolean r1) {
            r0.isExtended = r1
            return r1
    }

    static /* synthetic */ boolean access$602(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0, boolean r1) {
            r0.isTransforming = r1
            return r1
    }

    static /* synthetic */ int access$702(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0, int r1) {
            r0.animState = r1
            return r1
    }

    static /* synthetic */ boolean access$800(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0) {
            boolean r0 = r0.isOrWillBeShown()
            return r0
    }

    static /* synthetic */ boolean access$900(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0) {
            boolean r0 = r0.isOrWillBeHidden()
            return r0
    }

    private com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size getSizeFromExtendStrategyType(int r5) {
            r4 = this;
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$2 r0 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$2
            r0.<init>(r4)
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$3 r1 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$3
            r1.<init>(r4, r0)
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$4 r2 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$4
            r2.<init>(r4, r1, r0)
            r3 = 1
            if (r5 == r3) goto L17
            r0 = 2
            if (r5 == r0) goto L16
            return r2
        L16:
            return r1
        L17:
            return r0
    }

    private boolean isOrWillBeHidden() {
            r4 = this;
            int r0 = r4.getVisibility()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto Le
            int r0 = r4.animState
            if (r0 != r2) goto Ld
            return r2
        Ld:
            return r1
        Le:
            int r0 = r4.animState
            r3 = 2
            if (r0 == r3) goto L14
            return r2
        L14:
            return r1
    }

    private boolean isOrWillBeShown() {
            r4 = this;
            int r0 = r4.getVisibility()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lf
            int r0 = r4.animState
            r3 = 2
            if (r0 != r3) goto Le
            return r2
        Le:
            return r1
        Lf:
            int r0 = r4.animState
            if (r0 == r2) goto L14
            return r2
        L14:
            return r1
    }

    private void performMotion(int r4, @androidx.annotation.Nullable com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OnChangedCallback r5) {
            r3 = this;
            r0 = 2
            if (r4 == 0) goto L2b
            r1 = 1
            if (r4 == r1) goto L28
            if (r4 == r0) goto L25
            r1 = 3
            if (r4 != r1) goto Le
            com.google.android.material.floatingactionbutton.MotionStrategy r1 = r3.extendStrategy
            goto L2d
        Le:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown strategy type: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            throw r5
        L25:
            com.google.android.material.floatingactionbutton.MotionStrategy r1 = r3.shrinkStrategy
            goto L2d
        L28:
            com.google.android.material.floatingactionbutton.MotionStrategy r1 = r3.hideStrategy
            goto L2d
        L2b:
            com.google.android.material.floatingactionbutton.MotionStrategy r1 = r3.showStrategy
        L2d:
            boolean r2 = r1.shouldCancel()
            if (r2 == 0) goto L34
            return
        L34:
            boolean r2 = r3.shouldAnimateVisibilityChange()
            if (r2 != 0) goto L41
            r1.performNow()
            r1.onChange(r5)
            return
        L41:
            if (r4 != r0) goto L5e
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            if (r4 == 0) goto L52
            int r0 = r4.width
            r3.originalWidth = r0
            int r4 = r4.height
            r3.originalHeight = r4
            goto L5e
        L52:
            int r4 = r3.getWidth()
            r3.originalWidth = r4
            int r4 = r3.getHeight()
            r3.originalHeight = r4
        L5e:
            r4 = 0
            r3.measure(r4, r4)
            android.animation.AnimatorSet r4 = r1.createAnimator()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$5 r0 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$5
            r0.<init>(r3, r1, r5)
            r4.addListener(r0)
            java.util.List r5 = r1.getListeners()
            java.util.Iterator r5 = r5.iterator()
        L76:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L86
            java.lang.Object r0 = r5.next()
            android.animation.Animator$AnimatorListener r0 = (android.animation.Animator.AnimatorListener) r0
            r4.addListener(r0)
            goto L76
        L86:
            r4.start()
            return
    }

    private void saveOriginalTextCsl() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.getTextColors()
            r1.originalTextCsl = r0
            return
    }

    private boolean shouldAnimateVisibilityChange() {
            r1 = this;
            boolean r0 = androidx.core.view.ViewCompat.isLaidOut(r1)
            if (r0 != 0) goto L10
            boolean r0 = r1.isOrWillBeShown()
            if (r0 != 0) goto L18
            boolean r0 = r1.animateShowBeforeLayout
            if (r0 == 0) goto L18
        L10:
            boolean r0 = r1.isInEditMode()
            if (r0 != 0) goto L18
            r0 = 1
            return r0
        L18:
            r0 = 0
            return r0
    }

    public void addOnExtendAnimationListener(@androidx.annotation.NonNull android.animation.Animator.AnimatorListener r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r1.extendStrategy
            r0.addAnimationListener(r2)
            return
    }

    public void addOnHideAnimationListener(@androidx.annotation.NonNull android.animation.Animator.AnimatorListener r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r1.hideStrategy
            r0.addAnimationListener(r2)
            return
    }

    public void addOnShowAnimationListener(@androidx.annotation.NonNull android.animation.Animator.AnimatorListener r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r1.showStrategy
            r0.addAnimationListener(r2)
            return
    }

    public void addOnShrinkAnimationListener(@androidx.annotation.NonNull android.animation.Animator.AnimatorListener r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r1.shrinkStrategy
            r0.addAnimationListener(r2)
            return
    }

    public void extend() {
            r2 = this;
            r0 = 3
            r1 = 0
            r2.performMotion(r0, r1)
            return
    }

    public void extend(@androidx.annotation.NonNull com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OnChangedCallback r2) {
            r1 = this;
            r0 = 3
            r1.performMotion(r0, r2)
            return
    }

    @androidx.annotation.NonNull
    public androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton> getBehavior() {
            r1 = this;
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior<com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton> r0 = r1.behavior
            return r0
    }

    int getCollapsedPadding() {
            r2 = this;
            int r0 = r2.getCollapsedSize()
            int r1 = r2.getIconSize()
            int r0 = r0 - r1
            int r0 = r0 / 2
            return r0
    }

    @androidx.annotation.VisibleForTesting
    int getCollapsedSize() {
            r2 = this;
            int r0 = r2.collapsedSize
            if (r0 >= 0) goto L17
            int r0 = androidx.core.view.ViewCompat.getPaddingStart(r2)
            int r1 = androidx.core.view.ViewCompat.getPaddingEnd(r2)
            int r0 = java.lang.Math.min(r0, r1)
            int r0 = r0 * 2
            int r1 = r2.getIconSize()
            int r0 = r0 + r1
        L17:
            return r0
    }

    @androidx.annotation.Nullable
    public com.google.android.material.animation.MotionSpec getExtendMotionSpec() {
            r1 = this;
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r1.extendStrategy
            com.google.android.material.animation.MotionSpec r0 = r0.getMotionSpec()
            return r0
    }

    @androidx.annotation.Nullable
    public com.google.android.material.animation.MotionSpec getHideMotionSpec() {
            r1 = this;
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r1.hideStrategy
            com.google.android.material.animation.MotionSpec r0 = r0.getMotionSpec()
            return r0
    }

    @androidx.annotation.Nullable
    public com.google.android.material.animation.MotionSpec getShowMotionSpec() {
            r1 = this;
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r1.showStrategy
            com.google.android.material.animation.MotionSpec r0 = r0.getMotionSpec()
            return r0
    }

    @androidx.annotation.Nullable
    public com.google.android.material.animation.MotionSpec getShrinkMotionSpec() {
            r1 = this;
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r1.shrinkStrategy
            com.google.android.material.animation.MotionSpec r0 = r0.getMotionSpec()
            return r0
    }

    public void hide() {
            r2 = this;
            r0 = 1
            r1 = 0
            r2.performMotion(r0, r1)
            return
    }

    public void hide(@androidx.annotation.NonNull com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OnChangedCallback r2) {
            r1 = this;
            r0 = 1
            r1.performMotion(r0, r2)
            return
    }

    public final boolean isExtended() {
            r1 = this;
            boolean r0 = r1.isExtended
            return r0
    }

    @Override // com.google.android.material.button.MaterialButton
    protected void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            boolean r0 = r1.isExtended
            if (r0 == 0) goto L1f
            java.lang.CharSequence r0 = r1.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1f
            android.graphics.drawable.Drawable r0 = r1.getIcon()
            if (r0 == 0) goto L1f
            r0 = 0
            r1.isExtended = r0
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r1.shrinkStrategy
            r0.performNow()
        L1f:
            return
    }

    public void removeOnExtendAnimationListener(@androidx.annotation.NonNull android.animation.Animator.AnimatorListener r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r1.extendStrategy
            r0.removeAnimationListener(r2)
            return
    }

    public void removeOnHideAnimationListener(@androidx.annotation.NonNull android.animation.Animator.AnimatorListener r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r1.hideStrategy
            r0.removeAnimationListener(r2)
            return
    }

    public void removeOnShowAnimationListener(@androidx.annotation.NonNull android.animation.Animator.AnimatorListener r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r1.showStrategy
            r0.removeAnimationListener(r2)
            return
    }

    public void removeOnShrinkAnimationListener(@androidx.annotation.NonNull android.animation.Animator.AnimatorListener r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r1.shrinkStrategy
            r0.removeAnimationListener(r2)
            return
    }

    public void setAnimateShowBeforeLayout(boolean r1) {
            r0 = this;
            r0.animateShowBeforeLayout = r1
            return
    }

    public void setExtendMotionSpec(@androidx.annotation.Nullable com.google.android.material.animation.MotionSpec r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r1.extendStrategy
            r0.setMotionSpec(r2)
            return
    }

    public void setExtendMotionSpecResource(@androidx.annotation.AnimatorRes int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            com.google.android.material.animation.MotionSpec r2 = com.google.android.material.animation.MotionSpec.createFromResource(r0, r2)
            r1.setExtendMotionSpec(r2)
            return
    }

    public void setExtended(boolean r2) {
            r1 = this;
            boolean r0 = r1.isExtended
            if (r0 != r2) goto L5
            goto L12
        L5:
            if (r2 == 0) goto La
            com.google.android.material.floatingactionbutton.MotionStrategy r2 = r1.extendStrategy
            goto Lc
        La:
            com.google.android.material.floatingactionbutton.MotionStrategy r2 = r1.shrinkStrategy
        Lc:
            boolean r0 = r2.shouldCancel()
            if (r0 == 0) goto L13
        L12:
            return
        L13:
            r2.performNow()
            return
    }

    public void setHideMotionSpec(@androidx.annotation.Nullable com.google.android.material.animation.MotionSpec r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r1.hideStrategy
            r0.setMotionSpec(r2)
            return
    }

    public void setHideMotionSpecResource(@androidx.annotation.AnimatorRes int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            com.google.android.material.animation.MotionSpec r2 = com.google.android.material.animation.MotionSpec.createFromResource(r0, r2)
            r1.setHideMotionSpec(r2)
            return
    }

    public void setPadding(int r1, int r2, int r3, int r4) {
            r0 = this;
            super/*android.widget.Button*/.setPadding(r1, r2, r3, r4)
            boolean r1 = r0.isExtended
            if (r1 == 0) goto L17
            boolean r1 = r0.isTransforming
            if (r1 != 0) goto L17
            int r1 = androidx.core.view.ViewCompat.getPaddingStart(r0)
            r0.extendedPaddingStart = r1
            int r1 = androidx.core.view.ViewCompat.getPaddingEnd(r0)
            r0.extendedPaddingEnd = r1
        L17:
            return
    }

    public void setPaddingRelative(int r1, int r2, int r3, int r4) {
            r0 = this;
            super/*android.widget.Button*/.setPaddingRelative(r1, r2, r3, r4)
            boolean r2 = r0.isExtended
            if (r2 == 0) goto Lf
            boolean r2 = r0.isTransforming
            if (r2 != 0) goto Lf
            r0.extendedPaddingStart = r1
            r0.extendedPaddingEnd = r3
        Lf:
            return
    }

    public void setShowMotionSpec(@androidx.annotation.Nullable com.google.android.material.animation.MotionSpec r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r1.showStrategy
            r0.setMotionSpec(r2)
            return
    }

    public void setShowMotionSpecResource(@androidx.annotation.AnimatorRes int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            com.google.android.material.animation.MotionSpec r2 = com.google.android.material.animation.MotionSpec.createFromResource(r0, r2)
            r1.setShowMotionSpec(r2)
            return
    }

    public void setShrinkMotionSpec(@androidx.annotation.Nullable com.google.android.material.animation.MotionSpec r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r1.shrinkStrategy
            r0.setMotionSpec(r2)
            return
    }

    public void setShrinkMotionSpecResource(@androidx.annotation.AnimatorRes int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            com.google.android.material.animation.MotionSpec r2 = com.google.android.material.animation.MotionSpec.createFromResource(r0, r2)
            r1.setShrinkMotionSpec(r2)
            return
    }

    public void setTextColor(int r1) {
            r0 = this;
            super/*android.widget.Button*/.setTextColor(r1)
            r0.saveOriginalTextCsl()
            return
    }

    public void setTextColor(@androidx.annotation.NonNull android.content.res.ColorStateList r1) {
            r0 = this;
            super/*android.widget.Button*/.setTextColor(r1)
            r0.saveOriginalTextCsl()
            return
    }

    public void show() {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.performMotion(r0, r1)
            return
    }

    public void show(@androidx.annotation.NonNull com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OnChangedCallback r2) {
            r1 = this;
            r0 = 0
            r1.performMotion(r0, r2)
            return
    }

    public void shrink() {
            r2 = this;
            r0 = 2
            r1 = 0
            r2.performMotion(r0, r1)
            return
    }

    public void shrink(@androidx.annotation.NonNull com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OnChangedCallback r2) {
            r1 = this;
            r0 = 2
            r1.performMotion(r0, r2)
            return
    }

    protected void silentlyUpdateTextColor(@androidx.annotation.NonNull android.content.res.ColorStateList r1) {
            r0 = this;
            super/*android.widget.Button*/.setTextColor(r1)
            return
    }
}
