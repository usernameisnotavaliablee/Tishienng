package androidx.appcompat.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class LinearLayoutCompat extends android.view.ViewGroup {
    private static final java.lang.String ACCESSIBILITY_CLASS_NAME = "androidx.appcompat.widget.LinearLayoutCompat";
    public static final int HORIZONTAL = 0;
    private static final int INDEX_BOTTOM = 2;
    private static final int INDEX_CENTER_VERTICAL = 0;
    private static final int INDEX_FILL = 3;
    private static final int INDEX_TOP = 1;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_GRAVITY_COUNT = 4;
    private boolean mBaselineAligned;
    private int mBaselineAlignedChildIndex;
    private int mBaselineChildTop;
    private android.graphics.drawable.Drawable mDivider;
    private int mDividerHeight;
    private int mDividerPadding;
    private int mDividerWidth;
    private int mGravity;
    private int[] mMaxAscent;
    private int[] mMaxDescent;
    private int mOrientation;
    private int mShowDividers;
    private int mTotalLength;
    private boolean mUseLargestChild;
    private float mWeightSum;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface DividerMode {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class LayoutParams extends android.widget.LinearLayout.LayoutParams {
        public LayoutParams(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public LayoutParams(int r1, int r2, float r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        public LayoutParams(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface OrientationMode {
    }

    public LinearLayoutCompat(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public LinearLayoutCompat(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public LinearLayoutCompat(@androidx.annotation.NonNull android.content.Context r12, @androidx.annotation.Nullable android.util.AttributeSet r13, int r14) {
            r11 = this;
            r11.<init>(r12, r13, r14)
            r0 = 1
            r11.mBaselineAligned = r0
            r1 = -1
            r11.mBaselineAlignedChildIndex = r1
            r2 = 0
            r11.mBaselineChildTop = r2
            r3 = 8388659(0x800033, float:1.1755015E-38)
            r11.mGravity = r3
            int[] r6 = androidx.appcompat.R.styleable.LinearLayoutCompat
            androidx.appcompat.widget.TintTypedArray r3 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r12, r13, r6, r14, r2)
            android.content.res.TypedArray r8 = r3.getWrappedTypeArray()
            r10 = 0
            r4 = r11
            r5 = r12
            r7 = r13
            r9 = r14
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(r4, r5, r6, r7, r8, r9, r10)
            int r12 = androidx.appcompat.R.styleable.LinearLayoutCompat_android_orientation
            int r12 = r3.getInt(r12, r1)
            if (r12 < 0) goto L2e
            r11.setOrientation(r12)
        L2e:
            int r12 = androidx.appcompat.R.styleable.LinearLayoutCompat_android_gravity
            int r12 = r3.getInt(r12, r1)
            if (r12 < 0) goto L39
            r11.setGravity(r12)
        L39:
            int r12 = androidx.appcompat.R.styleable.LinearLayoutCompat_android_baselineAligned
            boolean r12 = r3.getBoolean(r12, r0)
            if (r12 != 0) goto L44
            r11.setBaselineAligned(r12)
        L44:
            int r12 = androidx.appcompat.R.styleable.LinearLayoutCompat_android_weightSum
            r13 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r12 = r3.getFloat(r12, r13)
            r4.mWeightSum = r12
            int r12 = androidx.appcompat.R.styleable.LinearLayoutCompat_android_baselineAlignedChildIndex
            int r12 = r3.getInt(r12, r1)
            r4.mBaselineAlignedChildIndex = r12
            int r12 = androidx.appcompat.R.styleable.LinearLayoutCompat_measureWithLargestChild
            boolean r12 = r3.getBoolean(r12, r2)
            r4.mUseLargestChild = r12
            int r12 = androidx.appcompat.R.styleable.LinearLayoutCompat_divider
            android.graphics.drawable.Drawable r12 = r3.getDrawable(r12)
            r11.setDividerDrawable(r12)
            int r12 = androidx.appcompat.R.styleable.LinearLayoutCompat_showDividers
            int r12 = r3.getInt(r12, r2)
            r4.mShowDividers = r12
            int r12 = androidx.appcompat.R.styleable.LinearLayoutCompat_dividerPadding
            int r12 = r3.getDimensionPixelSize(r12, r2)
            r4.mDividerPadding = r12
            r3.recycle()
            return
    }

    private void forceUniformHeight(int r10, int r11) {
            r9 = this;
            int r0 = r9.getMeasuredHeight()
            r1 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r0 = 0
        Lb:
            if (r0 >= r10) goto L3b
            android.view.View r3 = r9.getVirtualChildAt(r0)
            int r1 = r3.getVisibility()
            r2 = 8
            if (r1 == r2) goto L36
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r1 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r1
            int r2 = r1.height
            r4 = -1
            if (r2 != r4) goto L36
            int r8 = r1.width
            int r2 = r3.getMeasuredWidth()
            r1.width = r2
            r5 = 0
            r7 = 0
            r2 = r9
            r4 = r11
            r2.measureChildWithMargins(r3, r4, r5, r6, r7)
            r1.width = r8
            goto L37
        L36:
            r4 = r11
        L37:
            int r0 = r0 + 1
            r11 = r4
            goto Lb
        L3b:
            return
    }

    private void forceUniformWidth(int r10, int r11) {
            r9 = this;
            int r0 = r9.getMeasuredWidth()
            r1 = 1073741824(0x40000000, float:2.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r0 = 0
        Lb:
            if (r0 >= r10) goto L3b
            android.view.View r3 = r9.getVirtualChildAt(r0)
            int r1 = r3.getVisibility()
            r2 = 8
            if (r1 == r2) goto L36
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r1 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r1
            int r2 = r1.width
            r5 = -1
            if (r2 != r5) goto L36
            int r8 = r1.height
            int r2 = r3.getMeasuredHeight()
            r1.height = r2
            r5 = 0
            r7 = 0
            r2 = r9
            r6 = r11
            r2.measureChildWithMargins(r3, r4, r5, r6, r7)
            r1.height = r8
            goto L37
        L36:
            r6 = r11
        L37:
            int r0 = r0 + 1
            r11 = r6
            goto Lb
        L3b:
            return
    }

    private void setChildFrame(android.view.View r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            int r4 = r4 + r2
            int r5 = r5 + r3
            r1.layout(r2, r3, r4, r5)
            return
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r1 = r1 instanceof androidx.appcompat.widget.LinearLayoutCompat.LayoutParams
            return r1
    }

    void drawDividersHorizontal(android.graphics.Canvas r7) {
            r6 = this;
            int r0 = r6.getVirtualChildCount()
            boolean r1 = androidx.appcompat.widget.ViewUtils.isLayoutRtl(r6)
            r2 = 0
        L9:
            if (r2 >= r0) goto L3f
            android.view.View r3 = r6.getVirtualChildAt(r2)
            if (r3 == 0) goto L3c
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 == r5) goto L3c
            boolean r4 = r6.hasDividerBeforeChildAt(r2)
            if (r4 == 0) goto L3c
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r4 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r4
            if (r1 == 0) goto L2f
            int r3 = r3.getRight()
            int r4 = r4.rightMargin
            int r3 = r3 + r4
            goto L39
        L2f:
            int r3 = r3.getLeft()
            int r4 = r4.leftMargin
            int r3 = r3 - r4
            int r4 = r6.mDividerWidth
            int r3 = r3 - r4
        L39:
            r6.drawVerticalDivider(r7, r3)
        L3c:
            int r2 = r2 + 1
            goto L9
        L3f:
            boolean r2 = r6.hasDividerBeforeChildAt(r0)
            if (r2 == 0) goto L7d
            int r0 = r0 + (-1)
            android.view.View r0 = r6.getVirtualChildAt(r0)
            if (r0 != 0) goto L61
            if (r1 == 0) goto L54
            int r0 = r6.getPaddingLeft()
            goto L7a
        L54:
            int r0 = r6.getWidth()
            int r1 = r6.getPaddingRight()
            int r0 = r0 - r1
            int r1 = r6.mDividerWidth
        L5f:
            int r0 = r0 - r1
            goto L7a
        L61:
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r2 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r2
            if (r1 == 0) goto L73
            int r0 = r0.getLeft()
            int r1 = r2.leftMargin
            int r0 = r0 - r1
            int r1 = r6.mDividerWidth
            goto L5f
        L73:
            int r0 = r0.getRight()
            int r1 = r2.rightMargin
            int r0 = r0 + r1
        L7a:
            r6.drawVerticalDivider(r7, r0)
        L7d:
            return
    }

    void drawDividersVertical(android.graphics.Canvas r6) {
            r5 = this;
            int r0 = r5.getVirtualChildCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L31
            android.view.View r2 = r5.getVirtualChildAt(r1)
            if (r2 == 0) goto L2e
            int r3 = r2.getVisibility()
            r4 = 8
            if (r3 == r4) goto L2e
            boolean r3 = r5.hasDividerBeforeChildAt(r1)
            if (r3 == 0) goto L2e
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r3 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r3
            int r2 = r2.getTop()
            int r3 = r3.topMargin
            int r2 = r2 - r3
            int r3 = r5.mDividerHeight
            int r2 = r2 - r3
            r5.drawHorizontalDivider(r6, r2)
        L2e:
            int r1 = r1 + 1
            goto L5
        L31:
            boolean r1 = r5.hasDividerBeforeChildAt(r0)
            if (r1 == 0) goto L5c
            int r0 = r0 + (-1)
            android.view.View r0 = r5.getVirtualChildAt(r0)
            if (r0 != 0) goto L4c
            int r0 = r5.getHeight()
            int r1 = r5.getPaddingBottom()
            int r0 = r0 - r1
            int r1 = r5.mDividerHeight
            int r0 = r0 - r1
            goto L59
        L4c:
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r1 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r1
            int r0 = r0.getBottom()
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
        L59:
            r5.drawHorizontalDivider(r6, r0)
        L5c:
            return
    }

    void drawHorizontalDivider(android.graphics.Canvas r5, int r6) {
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.mDivider
            int r1 = r4.getPaddingLeft()
            int r2 = r4.mDividerPadding
            int r1 = r1 + r2
            int r2 = r4.getWidth()
            int r3 = r4.getPaddingRight()
            int r2 = r2 - r3
            int r3 = r4.mDividerPadding
            int r2 = r2 - r3
            int r3 = r4.mDividerHeight
            int r3 = r3 + r6
            r0.setBounds(r1, r6, r2, r3)
            android.graphics.drawable.Drawable r6 = r4.mDivider
            r6.draw(r5)
            return
    }

    void drawVerticalDivider(android.graphics.Canvas r6, int r7) {
            r5 = this;
            android.graphics.drawable.Drawable r0 = r5.mDivider
            int r1 = r5.getPaddingTop()
            int r2 = r5.mDividerPadding
            int r1 = r1 + r2
            int r2 = r5.mDividerWidth
            int r2 = r2 + r7
            int r3 = r5.getHeight()
            int r4 = r5.getPaddingBottom()
            int r3 = r3 - r4
            int r4 = r5.mDividerPadding
            int r3 = r3 - r4
            r0.setBounds(r7, r1, r2, r3)
            android.graphics.drawable.Drawable r7 = r5.mDivider
            r7.draw(r6)
            return
    }

    @Override // android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r0 = r1.generateDefaultLayoutParams()
            return r0
    }

    @Override // android.view.ViewGroup
    protected androidx.appcompat.widget.LinearLayoutCompat.LayoutParams generateDefaultLayoutParams() {
            r3 = this;
            int r0 = r3.mOrientation
            r1 = -2
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r0 = new androidx.appcompat.widget.LinearLayoutCompat$LayoutParams
            r0.<init>(r1, r1)
            return r0
        Lb:
            r2 = 1
            if (r0 != r2) goto L15
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r0 = new androidx.appcompat.widget.LinearLayoutCompat$LayoutParams
            r2 = -1
            r0.<init>(r2, r1)
            return r0
        L15:
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // android.view.ViewGroup
    public androidx.appcompat.widget.LinearLayoutCompat.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r0 = new androidx.appcompat.widget.LinearLayoutCompat$LayoutParams
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // android.view.ViewGroup
    protected androidx.appcompat.widget.LinearLayoutCompat.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r0 = new androidx.appcompat.widget.LinearLayoutCompat$LayoutParams
            r0.<init>(r2)
            return r0
    }

    @Override // android.view.View
    public int getBaseline() {
            r5 = this;
            int r0 = r5.mBaselineAlignedChildIndex
            if (r0 >= 0) goto L9
            int r0 = super.getBaseline()
            return r0
        L9:
            int r0 = r5.getChildCount()
            int r1 = r5.mBaselineAlignedChildIndex
            if (r0 <= r1) goto L77
            android.view.View r0 = r5.getChildAt(r1)
            int r1 = r0.getBaseline()
            r2 = -1
            if (r1 != r2) goto L29
            int r0 = r5.mBaselineAlignedChildIndex
            if (r0 != 0) goto L21
            return r2
        L21:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline."
            r0.<init>(r1)
            throw r0
        L29:
            int r2 = r5.mBaselineChildTop
            int r3 = r5.mOrientation
            r4 = 1
            if (r3 != r4) goto L6c
            int r3 = r5.mGravity
            r3 = r3 & 112(0x70, float:1.57E-43)
            r4 = 48
            if (r3 == r4) goto L6c
            r4 = 16
            if (r3 == r4) goto L53
            r4 = 80
            if (r3 == r4) goto L41
            goto L6c
        L41:
            int r2 = r5.getBottom()
            int r3 = r5.getTop()
            int r2 = r2 - r3
            int r3 = r5.getPaddingBottom()
            int r2 = r2 - r3
            int r3 = r5.mTotalLength
            int r2 = r2 - r3
            goto L6c
        L53:
            int r3 = r5.getBottom()
            int r4 = r5.getTop()
            int r3 = r3 - r4
            int r4 = r5.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r5.getPaddingBottom()
            int r3 = r3 - r4
            int r4 = r5.mTotalLength
            int r3 = r3 - r4
            int r3 = r3 / 2
            int r2 = r2 + r3
        L6c:
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r0 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r0
            int r0 = r0.topMargin
            int r2 = r2 + r0
            int r2 = r2 + r1
            return r2
        L77:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds."
            r0.<init>(r1)
            throw r0
    }

    public int getBaselineAlignedChildIndex() {
            r1 = this;
            int r0 = r1.mBaselineAlignedChildIndex
            return r0
    }

    int getChildrenSkipCount(android.view.View r1, int r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    public android.graphics.drawable.Drawable getDividerDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDivider
            return r0
    }

    public int getDividerPadding() {
            r1 = this;
            int r0 = r1.mDividerPadding
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getDividerWidth() {
            r1 = this;
            int r0 = r1.mDividerWidth
            return r0
    }

    @androidx.annotation.GravityInt
    public int getGravity() {
            r1 = this;
            int r0 = r1.mGravity
            return r0
    }

    int getLocationOffset(android.view.View r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    int getNextLocationOffset(android.view.View r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public int getOrientation() {
            r1 = this;
            int r0 = r1.mOrientation
            return r0
    }

    public int getShowDividers() {
            r1 = this;
            int r0 = r1.mShowDividers
            return r0
    }

    android.view.View getVirtualChildAt(int r1) {
            r0 = this;
            android.view.View r1 = r0.getChildAt(r1)
            return r1
    }

    int getVirtualChildCount() {
            r1 = this;
            int r0 = r1.getChildCount()
            return r0
    }

    public float getWeightSum() {
            r1 = this;
            float r0 = r1.mWeightSum
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    protected boolean hasDividerBeforeChildAt(int r5) {
            r4 = this;
            r0 = 0
            r1 = 1
            if (r5 != 0) goto Lb
            int r5 = r4.mShowDividers
            r5 = r5 & r1
            if (r5 == 0) goto La
            return r1
        La:
            return r0
        Lb:
            int r2 = r4.getChildCount()
            if (r5 != r2) goto L19
            int r5 = r4.mShowDividers
            r5 = r5 & 4
            if (r5 == 0) goto L18
            return r1
        L18:
            return r0
        L19:
            int r2 = r4.mShowDividers
            r2 = r2 & 2
            if (r2 == 0) goto L32
            int r5 = r5 - r1
        L20:
            if (r5 < 0) goto L32
            android.view.View r2 = r4.getChildAt(r5)
            int r2 = r2.getVisibility()
            r3 = 8
            if (r2 == r3) goto L2f
            return r1
        L2f:
            int r5 = r5 + (-1)
            goto L20
        L32:
            return r0
    }

    public boolean isBaselineAligned() {
            r1 = this;
            boolean r0 = r1.mBaselineAligned
            return r0
    }

    public boolean isMeasureWithLargestChildEnabled() {
            r1 = this;
            boolean r0 = r1.mUseLargestChild
            return r0
    }

    void layoutHorizontal(int r22, int r23, int r24, int r25) {
            r21 = this;
            r0 = r21
            boolean r1 = androidx.appcompat.widget.ViewUtils.isLayoutRtl(r0)
            int r6 = r0.getPaddingTop()
            int r2 = r25 - r23
            int r3 = r0.getPaddingBottom()
            int r7 = r2 - r3
            int r2 = r2 - r6
            int r3 = r0.getPaddingBottom()
            int r8 = r2 - r3
            int r9 = r0.getVirtualChildCount()
            int r2 = r0.mGravity
            r3 = 8388615(0x800007, float:1.1754953E-38)
            r3 = r3 & r2
            r10 = r2 & 112(0x70, float:1.57E-43)
            boolean r11 = r0.mBaselineAligned
            int[] r12 = r0.mMaxAscent
            int[] r13 = r0.mMaxDescent
            int r2 = androidx.core.view.ViewCompat.getLayoutDirection(r0)
            int r2 = androidx.core.view.GravityCompat.getAbsoluteGravity(r3, r2)
            r14 = 2
            r15 = 1
            if (r2 == r15) goto L4b
            r3 = 5
            if (r2 == r3) goto L3f
            int r2 = r0.getPaddingLeft()
            goto L56
        L3f:
            int r2 = r0.getPaddingLeft()
            int r2 = r2 + r24
            int r2 = r2 - r22
            int r3 = r0.mTotalLength
            int r2 = r2 - r3
            goto L56
        L4b:
            int r2 = r0.getPaddingLeft()
            int r3 = r24 - r22
            int r4 = r0.mTotalLength
            int r3 = r3 - r4
            int r3 = r3 / r14
            int r2 = r2 + r3
        L56:
            r3 = 0
            if (r1 == 0) goto L60
            int r1 = r9 + (-1)
            r16 = r1
            r17 = -1
            goto L64
        L60:
            r16 = 0
            r17 = 1
        L64:
            r1 = 0
        L65:
            if (r1 >= r9) goto L13e
            int r3 = r17 * r1
            int r3 = r16 + r3
            r5 = r1
            android.view.View r1 = r0.getVirtualChildAt(r3)
            if (r1 != 0) goto L82
            int r1 = r0.measureNullChild(r3)
            int r2 = r2 + r1
            r1 = r5
            r19 = r6
            r23 = 2
            r25 = 1
            r18 = -1
            goto L136
        L82:
            r23 = 2
            int r14 = r1.getVisibility()
            r25 = 1
            r15 = 8
            if (r14 == r15) goto L12e
            int r14 = r1.getMeasuredWidth()
            r15 = r5
            int r5 = r1.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r18 = r1.getLayoutParams()
            r4 = r18
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r4 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r4
            r24 = r2
            if (r11 == 0) goto Laf
            int r2 = r4.height
            r18 = r5
            r5 = -1
            if (r2 == r5) goto Lb1
            int r5 = r1.getBaseline()
            goto Lb2
        Laf:
            r18 = r5
        Lb1:
            r5 = -1
        Lb2:
            int r2 = r4.gravity
            if (r2 >= 0) goto Lb7
            r2 = r10
        Lb7:
            r2 = r2 & 112(0x70, float:1.57E-43)
            r19 = r6
            r6 = 16
            if (r2 == r6) goto Led
            r6 = 48
            if (r2 == r6) goto Ldf
            r6 = 80
            if (r2 == r6) goto Lcb
            r2 = r19
            r6 = -1
            goto Lfa
        Lcb:
            int r2 = r7 - r18
            int r6 = r4.bottomMargin
            int r2 = r2 - r6
            r6 = -1
            if (r5 == r6) goto Lfa
            int r20 = r1.getMeasuredHeight()
            int r20 = r20 - r5
            r5 = r13[r23]
            int r5 = r5 - r20
        Ldd:
            int r2 = r2 - r5
            goto Lfa
        Ldf:
            r6 = -1
            int r2 = r4.topMargin
            int r2 = r19 + r2
            if (r5 == r6) goto Lfa
            r20 = r12[r25]
            int r20 = r20 - r5
            int r2 = r2 + r20
            goto Lfa
        Led:
            r6 = -1
            int r2 = r8 - r18
            int r2 = r2 / 2
            int r2 = r19 + r2
            int r5 = r4.topMargin
            int r2 = r2 + r5
            int r5 = r4.bottomMargin
            goto Ldd
        Lfa:
            boolean r5 = r0.hasDividerBeforeChildAt(r3)
            if (r5 == 0) goto L105
            int r5 = r0.mDividerWidth
            int r5 = r24 + r5
            goto L107
        L105:
            r5 = r24
        L107:
            int r6 = r4.leftMargin
            int r6 = r6 + r5
            int r5 = r0.getLocationOffset(r1)
            int r5 = r5 + r6
            r22 = r6
            r6 = r4
            r4 = r14
            r14 = r3
            r3 = r2
            r2 = r5
            r5 = r18
            r18 = -1
            r0.setChildFrame(r1, r2, r3, r4, r5)
            int r2 = r6.rightMargin
            int r2 = r2 + r4
            int r3 = r0.getNextLocationOffset(r1)
            int r2 = r2 + r3
            int r6 = r22 + r2
            int r1 = r0.getChildrenSkipCount(r1, r14)
            int r1 = r1 + r15
            r2 = r6
            goto L136
        L12e:
            r24 = r2
            r15 = r5
            r19 = r6
            r18 = -1
            r1 = r15
        L136:
            int r1 = r1 + 1
            r6 = r19
            r14 = 2
            r15 = 1
            goto L65
        L13e:
            return
    }

    void layoutVertical(int r12, int r13, int r14, int r15) {
            r11 = this;
            int r0 = r11.getPaddingLeft()
            int r14 = r14 - r12
            int r12 = r11.getPaddingRight()
            int r12 = r14 - r12
            int r14 = r14 - r0
            int r1 = r11.getPaddingRight()
            int r14 = r14 - r1
            int r1 = r11.getVirtualChildCount()
            int r2 = r11.mGravity
            r3 = r2 & 112(0x70, float:1.57E-43)
            r4 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r4
            r4 = 16
            if (r3 == r4) goto L35
            r4 = 80
            if (r3 == r4) goto L2a
            int r13 = r11.getPaddingTop()
            goto L41
        L2a:
            int r3 = r11.getPaddingTop()
            int r3 = r3 + r15
            int r3 = r3 - r13
            int r13 = r11.mTotalLength
            int r13 = r3 - r13
            goto L41
        L35:
            int r3 = r11.getPaddingTop()
            int r15 = r15 - r13
            int r13 = r11.mTotalLength
            int r15 = r15 - r13
            int r15 = r15 / 2
            int r13 = r3 + r15
        L41:
            r15 = 0
        L42:
            if (r15 >= r1) goto Lb9
            android.view.View r4 = r11.getVirtualChildAt(r15)
            r9 = 1
            if (r4 != 0) goto L52
            int r3 = r11.measureNullChild(r15)
            int r13 = r13 + r3
        L50:
            r3 = r11
            goto Lb7
        L52:
            int r3 = r4.getVisibility()
            r5 = 8
            if (r3 == r5) goto L50
            int r7 = r4.getMeasuredWidth()
            int r8 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r3 = r4.getLayoutParams()
            r10 = r3
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r10 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r10
            int r3 = r10.gravity
            if (r3 >= 0) goto L6e
            r3 = r2
        L6e:
            int r5 = androidx.core.view.ViewCompat.getLayoutDirection(r11)
            int r3 = androidx.core.view.GravityCompat.getAbsoluteGravity(r3, r5)
            r3 = r3 & 7
            if (r3 == r9) goto L88
            r5 = 5
            if (r3 == r5) goto L82
            int r3 = r10.leftMargin
            int r3 = r3 + r0
        L80:
            r5 = r3
            goto L93
        L82:
            int r3 = r12 - r7
            int r5 = r10.rightMargin
        L86:
            int r3 = r3 - r5
            goto L80
        L88:
            int r3 = r14 - r7
            int r3 = r3 / 2
            int r3 = r3 + r0
            int r5 = r10.leftMargin
            int r3 = r3 + r5
            int r5 = r10.rightMargin
            goto L86
        L93:
            boolean r3 = r11.hasDividerBeforeChildAt(r15)
            if (r3 == 0) goto L9c
            int r3 = r11.mDividerHeight
            int r13 = r13 + r3
        L9c:
            int r3 = r10.topMargin
            int r13 = r13 + r3
            int r3 = r11.getLocationOffset(r4)
            int r6 = r13 + r3
            r3 = r11
            r3.setChildFrame(r4, r5, r6, r7, r8)
            int r5 = r10.bottomMargin
            int r8 = r8 + r5
            int r5 = r11.getNextLocationOffset(r4)
            int r8 = r8 + r5
            int r13 = r13 + r8
            int r4 = r11.getChildrenSkipCount(r4, r15)
            int r15 = r15 + r4
        Lb7:
            int r15 = r15 + r9
            goto L42
        Lb9:
            r3 = r11
            return
    }

    void measureChildBeforeLayout(android.view.View r1, int r2, int r3, int r4, int r5, int r6) {
            r0 = this;
            r2 = r1
            r1 = r0
            r1.measureChildWithMargins(r2, r3, r4, r5, r6)
            return
    }

    void measureHorizontal(int r39, int r40) {
            r38 = this;
            r0 = r38
            r7 = 0
            r0.mTotalLength = r7
            int r8 = r0.getVirtualChildCount()
            int r9 = android.view.View.MeasureSpec.getMode(r39)
            int r10 = android.view.View.MeasureSpec.getMode(r40)
            int[] r1 = r0.mMaxAscent
            r11 = 4
            if (r1 == 0) goto L1a
            int[] r1 = r0.mMaxDescent
            if (r1 != 0) goto L22
        L1a:
            int[] r1 = new int[r11]
            r0.mMaxAscent = r1
            int[] r1 = new int[r11]
            r0.mMaxDescent = r1
        L22:
            int[] r12 = r0.mMaxAscent
            int[] r13 = r0.mMaxDescent
            r14 = 3
            r15 = -1
            r12[r14] = r15
            r16 = 2
            r12[r16] = r15
            r17 = 1
            r12[r17] = r15
            r12[r7] = r15
            r13[r14] = r15
            r13[r16] = r15
            r13[r17] = r15
            r13[r7] = r15
            boolean r1 = r0.mBaselineAligned
            boolean r2 = r0.mUseLargestChild
            r3 = 1073741824(0x40000000, float:2.0)
            if (r9 != r3) goto L47
            r18 = 1
            goto L49
        L47:
            r18 = 0
        L49:
            r19 = 0
            r4 = r2
            r2 = 0
            r5 = 0
            r6 = 0
            r11 = 0
            r14 = 0
            r15 = 0
            r20 = 4
            r21 = 3
            r22 = 0
            r24 = 0
            r25 = 1
            r26 = 0
        L5e:
            r27 = r6
            r6 = 8
            if (r2 >= r8) goto L205
            r30 = r1
            android.view.View r1 = r0.getVirtualChildAt(r2)
            if (r1 != 0) goto L87
            int r1 = r0.mTotalLength
            int r6 = r0.measureNullChild(r2)
            int r1 = r1 + r6
            r0.mTotalLength = r1
        L75:
            r3 = r39
            r1 = r40
            r35 = r8
            r33 = r9
            r34 = r12
            r28 = r13
            r6 = r27
            r27 = r4
            goto L1f2
        L87:
            int r7 = r1.getVisibility()
            if (r7 != r6) goto L93
            int r1 = r0.getChildrenSkipCount(r1, r2)
            int r2 = r2 + r1
            goto L75
        L93:
            boolean r6 = r0.hasDividerBeforeChildAt(r2)
            if (r6 == 0) goto La0
            int r6 = r0.mTotalLength
            int r7 = r0.mDividerWidth
            int r6 = r6 + r7
            r0.mTotalLength = r6
        La0:
            android.view.ViewGroup$LayoutParams r6 = r1.getLayoutParams()
            r7 = r6
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r7 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r7
            float r6 = r7.weight
            float r32 = r5 + r6
            if (r9 != r3) goto L102
            int r5 = r7.width
            if (r5 != 0) goto L102
            int r5 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
            if (r5 <= 0) goto L102
            if (r18 == 0) goto Lc2
            int r5 = r0.mTotalLength
            int r6 = r7.leftMargin
            int r3 = r7.rightMargin
            int r6 = r6 + r3
            int r5 = r5 + r6
            r0.mTotalLength = r5
            goto Ld0
        Lc2:
            int r3 = r0.mTotalLength
            int r5 = r7.leftMargin
            int r5 = r5 + r3
            int r6 = r7.rightMargin
            int r5 = r5 + r6
            int r3 = java.lang.Math.max(r3, r5)
            r0.mTotalLength = r3
        Ld0:
            if (r30 == 0) goto Le9
            r3 = 0
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            r1.measure(r5, r5)
            r3 = r39
            r35 = r8
            r33 = r9
            r34 = r12
            r28 = r13
            r12 = r27
            r8 = 1073741824(0x40000000, float:2.0)
            goto Lf9
        Le9:
            r3 = r39
            r35 = r8
            r33 = r9
            r34 = r12
            r28 = r13
            r12 = r27
            r8 = 1073741824(0x40000000, float:2.0)
            r22 = 1
        Lf9:
            r29 = -2
            r27 = r4
            r4 = r1
            r1 = r40
            goto L175
        L102:
            int r3 = r7.width
            if (r3 != 0) goto L10f
            int r3 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
            if (r3 <= 0) goto L10f
            r3 = -2
            r7.width = r3
            r5 = 0
            goto L112
        L10f:
            r3 = -2
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
        L112:
            int r6 = (r32 > r19 ? 1 : (r32 == r19 ? 0 : -1))
            if (r6 != 0) goto L11e
            int r6 = r0.mTotalLength
            r37 = r6
            r6 = r4
            r4 = r37
            goto L120
        L11e:
            r6 = r4
            r4 = 0
        L120:
            r28 = 0
            r3 = r39
            r35 = r8
            r33 = r9
            r34 = r12
            r28 = r13
            r12 = r27
            r8 = 1073741824(0x40000000, float:2.0)
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r29 = -2
            r13 = r5
            r27 = r6
            r6 = 0
            r5 = r40
            r0.measureChildBeforeLayout(r1, r2, r3, r4, r5, r6)
            r4 = r1
            r1 = r5
            if (r13 == r9) goto L143
            r7.width = r13
        L143:
            int r5 = r4.getMeasuredWidth()
            if (r18 == 0) goto L15a
            int r6 = r0.mTotalLength
            int r9 = r7.leftMargin
            int r9 = r9 + r5
            int r13 = r7.rightMargin
            int r9 = r9 + r13
            int r13 = r0.getNextLocationOffset(r4)
            int r9 = r9 + r13
            int r6 = r6 + r9
            r0.mTotalLength = r6
            goto L16f
        L15a:
            int r6 = r0.mTotalLength
            int r9 = r6 + r5
            int r13 = r7.leftMargin
            int r9 = r9 + r13
            int r13 = r7.rightMargin
            int r9 = r9 + r13
            int r13 = r0.getNextLocationOffset(r4)
            int r9 = r9 + r13
            int r6 = java.lang.Math.max(r6, r9)
            r0.mTotalLength = r6
        L16f:
            if (r27 == 0) goto L175
            int r15 = java.lang.Math.max(r5, r15)
        L175:
            if (r10 == r8) goto L180
            int r5 = r7.height
            r6 = -1
            if (r5 != r6) goto L180
            r5 = 1
            r26 = 1
            goto L181
        L180:
            r5 = 0
        L181:
            int r6 = r7.topMargin
            int r9 = r7.bottomMargin
            int r6 = r6 + r9
            int r9 = r4.getMeasuredHeight()
            int r9 = r9 + r6
            int r13 = r4.getMeasuredState()
            r8 = r24
            int r24 = android.view.View.combineMeasuredStates(r8, r13)
            if (r30 == 0) goto L1c1
            int r8 = r4.getBaseline()
            r13 = -1
            if (r8 == r13) goto L1c1
            int r13 = r7.gravity
            if (r13 >= 0) goto L1a4
            int r13 = r0.mGravity
        L1a4:
            r13 = r13 & 112(0x70, float:1.57E-43)
            int r13 = r13 >> 4
            r13 = r13 & (-2)
            int r13 = r13 >> 1
            r36 = r5
            r5 = r34[r13]
            int r5 = java.lang.Math.max(r5, r8)
            r34[r13] = r5
            r5 = r28[r13]
            int r8 = r9 - r8
            int r5 = java.lang.Math.max(r5, r8)
            r28[r13] = r5
            goto L1c3
        L1c1:
            r36 = r5
        L1c3:
            int r5 = java.lang.Math.max(r12, r9)
            if (r25 == 0) goto L1d1
            int r8 = r7.height
            r13 = -1
            if (r8 != r13) goto L1d1
            r25 = 1
            goto L1d3
        L1d1:
            r25 = 0
        L1d3:
            float r7 = r7.weight
            int r7 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1))
            if (r7 <= 0) goto L1e2
            if (r36 == 0) goto L1dc
            goto L1dd
        L1dc:
            r6 = r9
        L1dd:
            int r14 = java.lang.Math.max(r14, r6)
            goto L1ea
        L1e2:
            if (r36 == 0) goto L1e5
            goto L1e6
        L1e5:
            r6 = r9
        L1e6:
            int r11 = java.lang.Math.max(r11, r6)
        L1ea:
            int r4 = r0.getChildrenSkipCount(r4, r2)
            int r2 = r2 + r4
            r6 = r5
            r5 = r32
        L1f2:
            int r2 = r2 + 1
            r4 = r27
            r13 = r28
            r1 = r30
            r9 = r33
            r12 = r34
            r8 = r35
            r3 = 1073741824(0x40000000, float:2.0)
            r7 = 0
            goto L5e
        L205:
            r3 = r39
            r30 = r1
            r35 = r8
            r33 = r9
            r34 = r12
            r28 = r13
            r8 = r24
            r12 = r27
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r29 = -2
            r1 = r40
            r27 = r4
            int r2 = r0.mTotalLength
            if (r2 <= 0) goto L231
            r2 = r35
            boolean r4 = r0.hasDividerBeforeChildAt(r2)
            if (r4 == 0) goto L233
            int r4 = r0.mTotalLength
            int r7 = r0.mDividerWidth
            int r4 = r4 + r7
            r0.mTotalLength = r4
            goto L233
        L231:
            r2 = r35
        L233:
            r4 = r34[r17]
            r13 = -1
            if (r4 != r13) goto L249
            r31 = 0
            r7 = r34[r31]
            if (r7 != r13) goto L249
            r7 = r34[r16]
            if (r7 != r13) goto L249
            r7 = r34[r21]
            if (r7 == r13) goto L247
            goto L249
        L247:
            r6 = r12
            goto L276
        L249:
            r7 = r34[r21]
            r31 = 0
            r13 = r34[r31]
            r6 = r34[r16]
            int r4 = java.lang.Math.max(r4, r6)
            int r4 = java.lang.Math.max(r13, r4)
            int r4 = java.lang.Math.max(r7, r4)
            r6 = r28[r21]
            r7 = r28[r31]
            r13 = r28[r17]
            r9 = r28[r16]
            int r9 = java.lang.Math.max(r13, r9)
            int r7 = java.lang.Math.max(r7, r9)
            int r6 = java.lang.Math.max(r6, r7)
            int r4 = r4 + r6
            int r6 = java.lang.Math.max(r12, r4)
        L276:
            if (r27 == 0) goto L2ea
            r4 = r33
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 == r9) goto L280
            if (r4 != 0) goto L282
        L280:
            r7 = 0
            goto L288
        L282:
            r32 = r5
        L284:
            r33 = r6
            goto L2ef
        L288:
            r0.mTotalLength = r7
            r7 = 0
        L28b:
            if (r7 >= r2) goto L282
            android.view.View r9 = r0.getVirtualChildAt(r7)
            if (r9 != 0) goto L29d
            int r9 = r0.mTotalLength
            int r12 = r0.measureNullChild(r7)
            int r9 = r9 + r12
            r0.mTotalLength = r9
            goto L2aa
        L29d:
            int r12 = r9.getVisibility()
            r13 = 8
            if (r12 != r13) goto L2af
            int r9 = r0.getChildrenSkipCount(r9, r7)
            int r7 = r7 + r9
        L2aa:
            r32 = r5
        L2ac:
            r33 = r6
            goto L2e3
        L2af:
            android.view.ViewGroup$LayoutParams r12 = r9.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r12 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r12
            if (r18 == 0) goto L2ca
            int r13 = r0.mTotalLength
            r32 = r5
            int r5 = r12.leftMargin
            int r5 = r5 + r15
            int r12 = r12.rightMargin
            int r5 = r5 + r12
            int r9 = r0.getNextLocationOffset(r9)
            int r5 = r5 + r9
            int r13 = r13 + r5
            r0.mTotalLength = r13
            goto L2ac
        L2ca:
            r32 = r5
            int r5 = r0.mTotalLength
            int r13 = r5 + r15
            r33 = r6
            int r6 = r12.leftMargin
            int r13 = r13 + r6
            int r6 = r12.rightMargin
            int r13 = r13 + r6
            int r6 = r0.getNextLocationOffset(r9)
            int r13 = r13 + r6
            int r5 = java.lang.Math.max(r5, r13)
            r0.mTotalLength = r5
        L2e3:
            int r7 = r7 + 1
            r5 = r32
            r6 = r33
            goto L28b
        L2ea:
            r32 = r5
            r4 = r33
            goto L284
        L2ef:
            int r5 = r0.mTotalLength
            int r6 = r0.getPaddingLeft()
            int r7 = r0.getPaddingRight()
            int r6 = r6 + r7
            int r5 = r5 + r6
            r0.mTotalLength = r5
            int r6 = r0.getSuggestedMinimumWidth()
            int r5 = java.lang.Math.max(r5, r6)
            r7 = 0
            int r5 = android.view.View.resolveSizeAndState(r5, r3, r7)
            r6 = 16777215(0xffffff, float:2.3509886E-38)
            r6 = r6 & r5
            int r7 = r0.mTotalLength
            int r6 = r6 - r7
            if (r22 != 0) goto L35e
            if (r6 == 0) goto L31a
            int r9 = (r32 > r19 ? 1 : (r32 == r19 ? 0 : -1))
            if (r9 <= 0) goto L31a
            goto L35e
        L31a:
            int r6 = java.lang.Math.max(r11, r14)
            if (r27 == 0) goto L356
            r9 = 1073741824(0x40000000, float:2.0)
            if (r4 == r9) goto L356
            r4 = 0
        L325:
            if (r4 >= r2) goto L356
            android.view.View r9 = r0.getVirtualChildAt(r4)
            if (r9 == 0) goto L353
            int r11 = r9.getVisibility()
            r13 = 8
            if (r11 != r13) goto L336
            goto L353
        L336:
            android.view.ViewGroup$LayoutParams r11 = r9.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r11 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r11
            float r11 = r11.weight
            int r11 = (r11 > r19 ? 1 : (r11 == r19 ? 0 : -1))
            if (r11 <= 0) goto L353
            r11 = 1073741824(0x40000000, float:2.0)
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r11)
            int r13 = r9.getMeasuredHeight()
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r11)
            r9.measure(r12, r13)
        L353:
            int r4 = r4 + 1
            goto L325
        L356:
            r27 = r5
            r24 = r8
            r22 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L4df
        L35e:
            float r9 = r0.mWeightSum
            int r12 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
            if (r12 <= 0) goto L366
            r32 = r9
        L366:
            r23 = -1
            r34[r21] = r23
            r34[r16] = r23
            r34[r17] = r23
            r9 = 0
            r34[r9] = r23
            r28[r21] = r23
            r28[r16] = r23
            r28[r17] = r23
            r28[r9] = r23
            r0.mTotalLength = r9
            r9 = r8
            r8 = -1
            r12 = 0
        L37e:
            if (r12 >= r2) goto L484
            android.view.View r13 = r0.getVirtualChildAt(r12)
            if (r13 == 0) goto L38e
            int r14 = r13.getVisibility()
            r15 = 8
            if (r14 != r15) goto L394
        L38e:
            r27 = r5
            r22 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L47e
        L394:
            android.view.ViewGroup$LayoutParams r14 = r13.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r14 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r14
            r22 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            float r7 = r14.weight
            int r24 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1))
            if (r24 <= 0) goto L3f5
            float r15 = (float) r6
            float r15 = r15 * r7
            float r15 = r15 / r32
            int r15 = (int) r15
            float r32 = r32 - r7
            int r6 = r6 - r15
            int r7 = r0.getPaddingTop()
            int r27 = r0.getPaddingBottom()
            int r7 = r7 + r27
            r27 = r5
            int r5 = r14.topMargin
            int r7 = r7 + r5
            int r5 = r14.bottomMargin
            int r7 = r7 + r5
            int r5 = r14.height
            int r5 = android.view.ViewGroup.getChildMeasureSpec(r1, r7, r5)
            int r7 = r14.width
            if (r7 != 0) goto L3d8
            r7 = 1073741824(0x40000000, float:2.0)
            if (r4 == r7) goto L3cc
            goto L3da
        L3cc:
            if (r15 <= 0) goto L3cf
            goto L3d0
        L3cf:
            r15 = 0
        L3d0:
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r7)
            r13.measure(r15, r5)
            goto L3ea
        L3d8:
            r7 = 1073741824(0x40000000, float:2.0)
        L3da:
            int r33 = r13.getMeasuredWidth()
            int r15 = r33 + r15
            if (r15 >= 0) goto L3e3
            r15 = 0
        L3e3:
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r7)
            r13.measure(r15, r5)
        L3ea:
            int r5 = r13.getMeasuredState()
            r5 = r5 & r22
            int r9 = android.view.View.combineMeasuredStates(r9, r5)
            goto L3f7
        L3f5:
            r27 = r5
        L3f7:
            if (r18 == 0) goto L410
            int r5 = r0.mTotalLength
            int r7 = r13.getMeasuredWidth()
            int r15 = r14.leftMargin
            int r7 = r7 + r15
            int r15 = r14.rightMargin
            int r7 = r7 + r15
            int r15 = r0.getNextLocationOffset(r13)
            int r7 = r7 + r15
            int r5 = r5 + r7
            r0.mTotalLength = r5
        L40d:
            r7 = 1073741824(0x40000000, float:2.0)
            goto L429
        L410:
            int r5 = r0.mTotalLength
            int r7 = r13.getMeasuredWidth()
            int r7 = r7 + r5
            int r15 = r14.leftMargin
            int r7 = r7 + r15
            int r15 = r14.rightMargin
            int r7 = r7 + r15
            int r15 = r0.getNextLocationOffset(r13)
            int r7 = r7 + r15
            int r5 = java.lang.Math.max(r5, r7)
            r0.mTotalLength = r5
            goto L40d
        L429:
            if (r10 == r7) goto L432
            int r5 = r14.height
            r7 = -1
            if (r5 != r7) goto L432
            r5 = 1
            goto L433
        L432:
            r5 = 0
        L433:
            int r7 = r14.topMargin
            int r15 = r14.bottomMargin
            int r7 = r7 + r15
            int r15 = r13.getMeasuredHeight()
            int r15 = r15 + r7
            int r8 = java.lang.Math.max(r8, r15)
            if (r5 == 0) goto L444
            goto L445
        L444:
            r7 = r15
        L445:
            int r5 = java.lang.Math.max(r11, r7)
            if (r25 == 0) goto L452
            int r7 = r14.height
            r11 = -1
            if (r7 != r11) goto L453
            r7 = 1
            goto L454
        L452:
            r11 = -1
        L453:
            r7 = 0
        L454:
            if (r30 == 0) goto L47b
            int r13 = r13.getBaseline()
            if (r13 == r11) goto L47b
            int r11 = r14.gravity
            if (r11 >= 0) goto L462
            int r11 = r0.mGravity
        L462:
            r11 = r11 & 112(0x70, float:1.57E-43)
            int r11 = r11 >> 4
            r11 = r11 & (-2)
            int r11 = r11 >> 1
            r14 = r34[r11]
            int r14 = java.lang.Math.max(r14, r13)
            r34[r11] = r14
            r14 = r28[r11]
            int r15 = r15 - r13
            int r13 = java.lang.Math.max(r14, r15)
            r28[r11] = r13
        L47b:
            r11 = r5
            r25 = r7
        L47e:
            int r12 = r12 + 1
            r5 = r27
            goto L37e
        L484:
            r27 = r5
            r22 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r4 = r0.mTotalLength
            int r5 = r0.getPaddingLeft()
            int r6 = r0.getPaddingRight()
            int r5 = r5 + r6
            int r4 = r4 + r5
            r0.mTotalLength = r4
            r4 = r34[r17]
            r13 = -1
            if (r4 != r13) goto L4ac
            r31 = 0
            r5 = r34[r31]
            if (r5 != r13) goto L4ac
            r5 = r34[r16]
            if (r5 != r13) goto L4ac
            r5 = r34[r21]
            if (r5 == r13) goto L4aa
            goto L4ac
        L4aa:
            r6 = r8
            goto L4da
        L4ac:
            r5 = r34[r21]
            r31 = 0
            r6 = r34[r31]
            r7 = r34[r16]
            int r4 = java.lang.Math.max(r4, r7)
            int r4 = java.lang.Math.max(r6, r4)
            int r4 = java.lang.Math.max(r5, r4)
            r5 = r28[r21]
            r6 = r28[r31]
            r7 = r28[r17]
            r12 = r28[r16]
            int r7 = java.lang.Math.max(r7, r12)
            int r6 = java.lang.Math.max(r6, r7)
            int r5 = java.lang.Math.max(r5, r6)
            int r4 = r4 + r5
            int r4 = java.lang.Math.max(r8, r4)
            r6 = r4
        L4da:
            r33 = r6
            r24 = r9
            r6 = r11
        L4df:
            if (r25 != 0) goto L4e6
            r7 = 1073741824(0x40000000, float:2.0)
            if (r10 == r7) goto L4e6
            goto L4e8
        L4e6:
            r6 = r33
        L4e8:
            int r4 = r0.getPaddingTop()
            int r5 = r0.getPaddingBottom()
            int r4 = r4 + r5
            int r6 = r6 + r4
            int r4 = r0.getSuggestedMinimumHeight()
            int r4 = java.lang.Math.max(r6, r4)
            r5 = r24 & r22
            r5 = r27 | r5
            int r6 = r24 << 16
            int r1 = android.view.View.resolveSizeAndState(r4, r1, r6)
            r0.setMeasuredDimension(r5, r1)
            if (r26 == 0) goto L50c
            r0.forceUniformHeight(r2, r3)
        L50c:
            return
    }

    int measureNullChild(int r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    void measureVertical(int r28, int r29) {
            r27 = this;
            r0 = r27
            r7 = 0
            r0.mTotalLength = r7
            int r8 = r0.getVirtualChildCount()
            int r9 = android.view.View.MeasureSpec.getMode(r28)
            int r10 = android.view.View.MeasureSpec.getMode(r29)
            int r11 = r0.mBaselineAlignedChildIndex
            boolean r12 = r0.mUseLargestChild
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r15 = 0
            r16 = 0
            r17 = 1
            r18 = 0
            r19 = 1
        L24:
            r20 = 0
            r7 = 8
            r14 = 1073741824(0x40000000, float:2.0)
            if (r2 >= r8) goto L17f
            r21 = r1
            android.view.View r1 = r0.getVirtualChildAt(r2)
            if (r1 != 0) goto L4d
            int r1 = r0.mTotalLength
            int r7 = r0.measureNullChild(r2)
            int r1 = r1 + r7
            r0.mTotalLength = r1
        L3d:
            r14 = r3
            r26 = r8
            r25 = r10
            r24 = r12
            r1 = r21
            r3 = r28
            r10 = r5
            r5 = r29
            goto L172
        L4d:
            int r13 = r1.getVisibility()
            if (r13 != r7) goto L59
            int r1 = r0.getChildrenSkipCount(r1, r2)
            int r2 = r2 + r1
            goto L3d
        L59:
            boolean r7 = r0.hasDividerBeforeChildAt(r2)
            if (r7 == 0) goto L66
            int r7 = r0.mTotalLength
            int r13 = r0.mDividerHeight
            int r7 = r7 + r13
            r0.mTotalLength = r7
        L66:
            android.view.ViewGroup$LayoutParams r7 = r1.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r7 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r7
            float r13 = r7.weight
            float r21 = r21 + r13
            if (r10 != r14) goto L9d
            int r14 = r7.height
            if (r14 != 0) goto L9d
            int r14 = (r13 > r20 ? 1 : (r13 == r20 ? 0 : -1))
            if (r14 <= 0) goto L9d
            int r13 = r0.mTotalLength
            int r14 = r7.topMargin
            int r14 = r14 + r13
            r24 = r1
            int r1 = r7.bottomMargin
            int r14 = r14 + r1
            int r1 = java.lang.Math.max(r13, r14)
            r0.mTotalLength = r1
            r14 = r3
            r26 = r8
            r25 = r10
            r1 = r24
            r16 = 1
            r3 = r28
            r10 = r5
            r8 = r6
            r24 = r12
            r5 = r29
            goto Lfe
        L9d:
            r24 = r1
            int r1 = r7.height
            if (r1 != 0) goto Lac
            int r1 = (r13 > r20 ? 1 : (r13 == r20 ? 0 : -1))
            if (r1 <= 0) goto Lac
            r1 = -2
            r7.height = r1
            r13 = 0
            goto Lae
        Lac:
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
        Lae:
            int r1 = (r21 > r20 ? 1 : (r21 == r20 ? 0 : -1))
            if (r1 != 0) goto Lb9
            int r1 = r0.mTotalLength
            r14 = r6
            r6 = r1
            r1 = r14
        Lb7:
            r14 = r4
            goto Lbc
        Lb9:
            r1 = r6
            r6 = 0
            goto Lb7
        Lbc:
            r4 = 0
            r26 = r8
            r25 = r10
            r8 = r1
            r10 = r5
            r1 = r24
            r5 = r29
            r24 = r12
            r12 = r14
            r14 = r3
            r3 = r28
            r0.measureChildBeforeLayout(r1, r2, r3, r4, r5, r6)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r13 == r4) goto Ld6
            r7.height = r13
        Ld6:
            int r4 = r1.getMeasuredHeight()
            int r6 = r0.mTotalLength
            int r13 = r6 + r4
            r22 = r13
            int r13 = r7.topMargin
            int r13 = r22 + r13
            r22 = r13
            int r13 = r7.bottomMargin
            int r13 = r22 + r13
            int r22 = r0.getNextLocationOffset(r1)
            int r13 = r13 + r22
            int r6 = java.lang.Math.max(r6, r13)
            r0.mTotalLength = r6
            if (r24 == 0) goto Lfd
            int r4 = java.lang.Math.max(r4, r12)
            goto Lfe
        Lfd:
            r4 = r12
        Lfe:
            if (r11 < 0) goto L108
            int r6 = r2 + 1
            if (r11 != r6) goto L108
            int r6 = r0.mTotalLength
            r0.mBaselineChildTop = r6
        L108:
            if (r2 >= r11) goto L110
            float r6 = r7.weight
            int r6 = (r6 > r20 ? 1 : (r6 == r20 ? 0 : -1))
            if (r6 > 0) goto L113
        L110:
            r6 = 1073741824(0x40000000, float:2.0)
            goto L11b
        L113:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r1.<init>(r2)
            throw r1
        L11b:
            if (r9 == r6) goto L126
            int r6 = r7.width
            r12 = -1
            if (r6 != r12) goto L126
            r6 = 1
            r18 = 1
            goto L127
        L126:
            r6 = 0
        L127:
            int r12 = r7.leftMargin
            int r13 = r7.rightMargin
            int r12 = r12 + r13
            int r13 = r1.getMeasuredWidth()
            int r13 = r13 + r12
            int r10 = java.lang.Math.max(r10, r13)
            r22 = r4
            int r4 = r1.getMeasuredState()
            int r4 = android.view.View.combineMeasuredStates(r8, r4)
            if (r17 == 0) goto L14b
            int r8 = r7.width
            r23 = r4
            r4 = -1
            if (r8 != r4) goto L14d
            r17 = 1
            goto L14f
        L14b:
            r23 = r4
        L14d:
            r17 = 0
        L14f:
            float r4 = r7.weight
            int r4 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r4 <= 0) goto L15f
            if (r6 == 0) goto L158
            goto L159
        L158:
            r12 = r13
        L159:
            int r4 = java.lang.Math.max(r14, r12)
            r14 = r4
            goto L167
        L15f:
            if (r6 == 0) goto L162
            goto L163
        L162:
            r12 = r13
        L163:
            int r15 = java.lang.Math.max(r15, r12)
        L167:
            int r1 = r0.getChildrenSkipCount(r1, r2)
            int r2 = r2 + r1
            r1 = r21
            r4 = r22
            r6 = r23
        L172:
            int r2 = r2 + 1
            r5 = r10
            r3 = r14
            r12 = r24
            r10 = r25
            r8 = r26
            r7 = 0
            goto L24
        L17f:
            r21 = r1
            r14 = r3
            r26 = r8
            r25 = r10
            r24 = r12
            r3 = r28
            r12 = r4
            r10 = r5
            r8 = r6
            r5 = r29
            int r1 = r0.mTotalLength
            if (r1 <= 0) goto L1a3
            r1 = r26
            boolean r2 = r0.hasDividerBeforeChildAt(r1)
            if (r2 == 0) goto L1a5
            int r2 = r0.mTotalLength
            int r4 = r0.mDividerHeight
            int r2 = r2 + r4
            r0.mTotalLength = r2
            goto L1a5
        L1a3:
            r1 = r26
        L1a5:
            r2 = r25
            if (r24 == 0) goto L1f4
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r4) goto L1af
            if (r2 != 0) goto L1f4
        L1af:
            r4 = 0
            r0.mTotalLength = r4
            r4 = 0
        L1b3:
            if (r4 >= r1) goto L1f4
            android.view.View r6 = r0.getVirtualChildAt(r4)
            if (r6 != 0) goto L1c5
            int r6 = r0.mTotalLength
            int r11 = r0.measureNullChild(r4)
            int r6 = r6 + r11
            r0.mTotalLength = r6
            goto L1ef
        L1c5:
            int r11 = r6.getVisibility()
            if (r11 != r7) goto L1d1
            int r6 = r0.getChildrenSkipCount(r6, r4)
            int r4 = r4 + r6
            goto L1ef
        L1d1:
            android.view.ViewGroup$LayoutParams r11 = r6.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r11 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r11
            int r13 = r0.mTotalLength
            int r22 = r13 + r12
            int r7 = r11.topMargin
            int r22 = r22 + r7
            int r7 = r11.bottomMargin
            int r22 = r22 + r7
            int r6 = r0.getNextLocationOffset(r6)
            int r6 = r22 + r6
            int r6 = java.lang.Math.max(r13, r6)
            r0.mTotalLength = r6
        L1ef:
            int r4 = r4 + 1
            r7 = 8
            goto L1b3
        L1f4:
            int r4 = r0.mTotalLength
            int r6 = r0.getPaddingTop()
            int r7 = r0.getPaddingBottom()
            int r6 = r6 + r7
            int r4 = r4 + r6
            r0.mTotalLength = r4
            int r6 = r0.getSuggestedMinimumHeight()
            int r4 = java.lang.Math.max(r4, r6)
            r6 = 0
            int r4 = android.view.View.resolveSizeAndState(r4, r5, r6)
            r6 = 16777215(0xffffff, float:2.3509886E-38)
            r6 = r6 & r4
            int r7 = r0.mTotalLength
            int r6 = r6 - r7
            if (r16 != 0) goto L25b
            if (r6 == 0) goto L21f
            int r7 = (r21 > r20 ? 1 : (r21 == r20 ? 0 : -1))
            if (r7 <= 0) goto L21f
            goto L25b
        L21f:
            int r6 = java.lang.Math.max(r15, r14)
            if (r24 == 0) goto L348
            r7 = 1073741824(0x40000000, float:2.0)
            if (r2 == r7) goto L348
            r7 = 0
        L22a:
            if (r7 >= r1) goto L348
            android.view.View r2 = r0.getVirtualChildAt(r7)
            if (r2 == 0) goto L258
            int r11 = r2.getVisibility()
            r13 = 8
            if (r11 != r13) goto L23b
            goto L258
        L23b:
            android.view.ViewGroup$LayoutParams r11 = r2.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r11 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r11
            float r11 = r11.weight
            int r11 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            if (r11 <= 0) goto L258
            int r11 = r2.getMeasuredWidth()
            r13 = 1073741824(0x40000000, float:2.0)
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r13)
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r13)
            r2.measure(r11, r14)
        L258:
            int r7 = r7 + 1
            goto L22a
        L25b:
            float r7 = r0.mWeightSum
            int r11 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r11 <= 0) goto L263
        L261:
            r11 = 0
            goto L266
        L263:
            r7 = r21
            goto L261
        L266:
            r0.mTotalLength = r11
            r12 = r7
            r7 = r6
            r6 = 0
        L26b:
            if (r6 >= r1) goto L339
            android.view.View r13 = r0.getVirtualChildAt(r6)
            int r14 = r13.getVisibility()
            r11 = 8
            if (r14 != r11) goto L27f
            r22 = r2
            r16 = r6
            goto L332
        L27f:
            android.view.ViewGroup$LayoutParams r14 = r13.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r14 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r14
            float r11 = r14.weight
            int r16 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            if (r16 <= 0) goto L2e5
            r16 = r6
            float r6 = (float) r7
            float r6 = r6 * r11
            float r6 = r6 / r12
            int r6 = (int) r6
            float r12 = r12 - r11
            int r7 = r7 - r6
            int r11 = r0.getPaddingLeft()
            int r21 = r0.getPaddingRight()
            int r11 = r11 + r21
            r21 = r6
            int r6 = r14.leftMargin
            int r11 = r11 + r6
            int r6 = r14.rightMargin
            int r11 = r11 + r6
            int r6 = r14.width
            int r6 = android.view.ViewGroup.getChildMeasureSpec(r3, r11, r6)
            int r11 = r14.height
            if (r11 != 0) goto L2c7
            r11 = 1073741824(0x40000000, float:2.0)
            if (r2 == r11) goto L2b7
        L2b4:
            r22 = r2
            goto L2ca
        L2b7:
            r22 = r2
            if (r21 <= 0) goto L2be
            r2 = r21
            goto L2bf
        L2be:
            r2 = 0
        L2bf:
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r11)
            r13.measure(r6, r2)
            goto L2da
        L2c7:
            r11 = 1073741824(0x40000000, float:2.0)
            goto L2b4
        L2ca:
            int r2 = r13.getMeasuredHeight()
            int r2 = r2 + r21
            if (r2 >= 0) goto L2d3
            r2 = 0
        L2d3:
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r11)
            r13.measure(r6, r2)
        L2da:
            int r2 = r13.getMeasuredState()
            r2 = r2 & (-256(0xffffffffffffff00, float:NaN))
            int r8 = android.view.View.combineMeasuredStates(r8, r2)
            goto L2e9
        L2e5:
            r22 = r2
            r16 = r6
        L2e9:
            int r2 = r14.leftMargin
            int r6 = r14.rightMargin
            int r2 = r2 + r6
            int r6 = r13.getMeasuredWidth()
            int r6 = r6 + r2
            int r10 = java.lang.Math.max(r10, r6)
            r11 = 1073741824(0x40000000, float:2.0)
            if (r9 == r11) goto L305
            int r11 = r14.width
            r21 = r2
            r2 = -1
            if (r11 != r2) goto L306
            r6 = r21
            goto L306
        L305:
            r2 = -1
        L306:
            int r6 = java.lang.Math.max(r15, r6)
            if (r17 == 0) goto L312
            int r11 = r14.width
            if (r11 != r2) goto L312
            r11 = 1
            goto L313
        L312:
            r11 = 0
        L313:
            int r15 = r0.mTotalLength
            int r17 = r13.getMeasuredHeight()
            int r17 = r15 + r17
            int r2 = r14.topMargin
            int r17 = r17 + r2
            int r2 = r14.bottomMargin
            int r17 = r17 + r2
            int r2 = r0.getNextLocationOffset(r13)
            int r2 = r17 + r2
            int r2 = java.lang.Math.max(r15, r2)
            r0.mTotalLength = r2
            r15 = r6
            r17 = r11
        L332:
            int r6 = r16 + 1
            r2 = r22
            r11 = 0
            goto L26b
        L339:
            int r2 = r0.mTotalLength
            int r6 = r0.getPaddingTop()
            int r7 = r0.getPaddingBottom()
            int r6 = r6 + r7
            int r2 = r2 + r6
            r0.mTotalLength = r2
            r6 = r15
        L348:
            if (r17 != 0) goto L34f
            r11 = 1073741824(0x40000000, float:2.0)
            if (r9 == r11) goto L34f
            r10 = r6
        L34f:
            int r2 = r0.getPaddingLeft()
            int r6 = r0.getPaddingRight()
            int r2 = r2 + r6
            int r10 = r10 + r2
            int r2 = r0.getSuggestedMinimumWidth()
            int r2 = java.lang.Math.max(r10, r2)
            int r2 = android.view.View.resolveSizeAndState(r2, r3, r8)
            r0.setMeasuredDimension(r2, r4)
            if (r18 == 0) goto L36d
            r0.forceUniformWidth(r1, r5)
        L36d:
            return
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.mDivider
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = r2.mOrientation
            r1 = 1
            if (r0 != r1) goto Le
            r2.drawDividersVertical(r3)
            return
        Le:
            r2.drawDividersHorizontal(r3)
            return
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            super.onInitializeAccessibilityEvent(r2)
            java.lang.String r0 = "androidx.appcompat.widget.LinearLayoutCompat"
            r2.setClassName(r0)
            return
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r2) {
            r1 = this;
            super.onInitializeAccessibilityNodeInfo(r2)
            java.lang.String r0 = "androidx.appcompat.widget.LinearLayoutCompat"
            r2.setClassName(r0)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            int r2 = r1.mOrientation
            r0 = 1
            if (r2 != r0) goto L9
            r1.layoutVertical(r3, r4, r5, r6)
            return
        L9:
            r1.layoutHorizontal(r3, r4, r5, r6)
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r3, int r4) {
            r2 = this;
            int r0 = r2.mOrientation
            r1 = 1
            if (r0 != r1) goto L9
            r2.measureVertical(r3, r4)
            return
        L9:
            r2.measureHorizontal(r3, r4)
            return
    }

    public void setBaselineAligned(boolean r1) {
            r0 = this;
            r0.mBaselineAligned = r1
            return
    }

    public void setBaselineAlignedChildIndex(int r3) {
            r2 = this;
            if (r3 < 0) goto Lb
            int r0 = r2.getChildCount()
            if (r3 >= r0) goto Lb
            r2.mBaselineAlignedChildIndex = r3
            return
        Lb:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "base aligned child index out of range (0, "
            r0.append(r1)
            int r1 = r2.getChildCount()
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    public void setDividerDrawable(android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.mDivider
            if (r3 != r0) goto L5
            return
        L5:
            r2.mDivider = r3
            r0 = 0
            if (r3 == 0) goto L17
            int r1 = r3.getIntrinsicWidth()
            r2.mDividerWidth = r1
            int r1 = r3.getIntrinsicHeight()
            r2.mDividerHeight = r1
            goto L1b
        L17:
            r2.mDividerWidth = r0
            r2.mDividerHeight = r0
        L1b:
            if (r3 != 0) goto L1e
            r0 = 1
        L1e:
            r2.setWillNotDraw(r0)
            r2.requestLayout()
            return
    }

    public void setDividerPadding(int r1) {
            r0 = this;
            r0.mDividerPadding = r1
            return
    }

    public void setGravity(@androidx.annotation.GravityInt int r2) {
            r1 = this;
            int r0 = r1.mGravity
            if (r0 == r2) goto L19
            r0 = 8388615(0x800007, float:1.1754953E-38)
            r0 = r0 & r2
            if (r0 != 0) goto Le
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r2 = r2 | r0
        Le:
            r0 = r2 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L14
            r2 = r2 | 48
        L14:
            r1.mGravity = r2
            r1.requestLayout()
        L19:
            return
    }

    public void setHorizontalGravity(int r3) {
            r2 = this;
            r0 = 8388615(0x800007, float:1.1754953E-38)
            r3 = r3 & r0
            int r1 = r2.mGravity
            r0 = r0 & r1
            if (r0 == r3) goto L13
            r0 = -8388616(0xffffffffff7ffff8, float:-3.402822E38)
            r0 = r0 & r1
            r3 = r3 | r0
            r2.mGravity = r3
            r2.requestLayout()
        L13:
            return
    }

    public void setMeasureWithLargestChildEnabled(boolean r1) {
            r0 = this;
            r0.mUseLargestChild = r1
            return
    }

    public void setOrientation(int r2) {
            r1 = this;
            int r0 = r1.mOrientation
            if (r0 == r2) goto L9
            r1.mOrientation = r2
            r1.requestLayout()
        L9:
            return
    }

    public void setShowDividers(int r2) {
            r1 = this;
            int r0 = r1.mShowDividers
            if (r2 == r0) goto L7
            r1.requestLayout()
        L7:
            r1.mShowDividers = r2
            return
    }

    public void setVerticalGravity(int r3) {
            r2 = this;
            r3 = r3 & 112(0x70, float:1.57E-43)
            int r0 = r2.mGravity
            r1 = r0 & 112(0x70, float:1.57E-43)
            if (r1 == r3) goto L10
            r0 = r0 & (-113(0xffffffffffffff8f, float:NaN))
            r3 = r3 | r0
            r2.mGravity = r3
            r2.requestLayout()
        L10:
            return
    }

    public void setWeightSum(float r2) {
            r1 = this;
            r0 = 0
            float r2 = java.lang.Math.max(r0, r2)
            r1.mWeightSum = r2
            return
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
            r1 = this;
            r0 = 0
            return r0
    }
}
