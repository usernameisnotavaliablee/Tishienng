package androidx.appcompat.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ActionMenuView extends androidx.appcompat.widget.LinearLayoutCompat implements androidx.appcompat.view.menu.MenuBuilder.ItemInvoker, androidx.appcompat.view.menu.MenuView {
    static final int GENERATED_ITEM_PADDING = 4;
    static final int MIN_CELL_SIZE = 56;
    private static final java.lang.String TAG = "ActionMenuView";
    private androidx.appcompat.view.menu.MenuPresenter.Callback mActionMenuPresenterCallback;
    private boolean mFormatItems;
    private int mFormatItemsWidth;
    private int mGeneratedItemPadding;
    private androidx.appcompat.view.menu.MenuBuilder mMenu;
    androidx.appcompat.view.menu.MenuBuilder.Callback mMenuBuilderCallback;
    private int mMinCellSize;
    androidx.appcompat.widget.ActionMenuView.OnMenuItemClickListener mOnMenuItemClickListener;
    private android.content.Context mPopupContext;
    private int mPopupTheme;
    private androidx.appcompat.widget.ActionMenuPresenter mPresenter;
    private boolean mReserveOverflow;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface ActionMenuChildView {
        boolean needsDividerAfter();

        boolean needsDividerBefore();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class ActionMenuPresenterCallback implements androidx.appcompat.view.menu.MenuPresenter.Callback {
        ActionMenuPresenterCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public void onCloseMenu(@androidx.annotation.NonNull androidx.appcompat.view.menu.MenuBuilder r1, boolean r2) {
                r0 = this;
                return
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public boolean onOpenSubMenu(@androidx.annotation.NonNull androidx.appcompat.view.menu.MenuBuilder r1) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class LayoutParams extends androidx.appcompat.widget.LinearLayoutCompat.LayoutParams {

        @android.view.ViewDebug.ExportedProperty
        public int cellsUsed;

        @android.view.ViewDebug.ExportedProperty
        public boolean expandable;
        boolean expanded;

        @android.view.ViewDebug.ExportedProperty
        public int extraPixels;

        @android.view.ViewDebug.ExportedProperty
        public boolean isOverflowButton;

        @android.view.ViewDebug.ExportedProperty
        public boolean preventEdgeOffset;

        public LayoutParams(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 0
                r0.isOverflowButton = r1
                return
        }

        LayoutParams(int r1, int r2, boolean r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.isOverflowButton = r3
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

        public LayoutParams(androidx.appcompat.widget.ActionMenuView.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                boolean r1 = r1.isOverflowButton
                r0.isOverflowButton = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class MenuBuilderCallback implements androidx.appcompat.view.menu.MenuBuilder.Callback {
        final /* synthetic */ androidx.appcompat.widget.ActionMenuView this$0;

        MenuBuilderCallback(androidx.appcompat.widget.ActionMenuView r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public boolean onMenuItemSelected(@androidx.annotation.NonNull androidx.appcompat.view.menu.MenuBuilder r1, @androidx.annotation.NonNull android.view.MenuItem r2) {
                r0 = this;
                androidx.appcompat.widget.ActionMenuView r1 = r0.this$0
                androidx.appcompat.widget.ActionMenuView$OnMenuItemClickListener r1 = r1.mOnMenuItemClickListener
                if (r1 == 0) goto Le
                boolean r1 = r1.onMenuItemClick(r2)
                if (r1 == 0) goto Le
                r1 = 1
                return r1
            Le:
                r1 = 0
                return r1
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public void onMenuModeChange(@androidx.annotation.NonNull androidx.appcompat.view.menu.MenuBuilder r2) {
                r1 = this;
                androidx.appcompat.widget.ActionMenuView r0 = r1.this$0
                androidx.appcompat.view.menu.MenuBuilder$Callback r0 = r0.mMenuBuilderCallback
                if (r0 == 0) goto L9
                r0.onMenuModeChange(r2)
            L9:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(android.view.MenuItem r1);
    }

    public ActionMenuView(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ActionMenuView(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.Nullable android.util.AttributeSet r4) {
            r2 = this;
            r2.<init>(r3, r4)
            r4 = 0
            r2.setBaselineAligned(r4)
            android.content.res.Resources r0 = r3.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            r1 = 1113587712(0x42600000, float:56.0)
            float r1 = r1 * r0
            int r1 = (int) r1
            r2.mMinCellSize = r1
            r1 = 1082130432(0x40800000, float:4.0)
            float r0 = r0 * r1
            int r0 = (int) r0
            r2.mGeneratedItemPadding = r0
            r2.mPopupContext = r3
            r2.mPopupTheme = r4
            return
    }

    static int measureChildForCells(android.view.View r5, int r6, int r7, int r8, int r9) {
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$LayoutParams r0 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) r0
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            int r1 = r1 - r9
            int r8 = android.view.View.MeasureSpec.getMode(r8)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            boolean r9 = r5 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            if (r9 == 0) goto L1b
            r9 = r5
            androidx.appcompat.view.menu.ActionMenuItemView r9 = (androidx.appcompat.view.menu.ActionMenuItemView) r9
            goto L1c
        L1b:
            r9 = 0
        L1c:
            r1 = 0
            r2 = 1
            if (r9 == 0) goto L28
            boolean r9 = r9.hasText()
            if (r9 == 0) goto L28
            r9 = 1
            goto L29
        L28:
            r9 = 0
        L29:
            if (r7 <= 0) goto L4d
            r3 = 2
            if (r9 == 0) goto L30
            if (r7 < r3) goto L4d
        L30:
            int r7 = r7 * r6
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r4)
            r5.measure(r7, r8)
            int r7 = r5.getMeasuredWidth()
            int r4 = r7 / r6
            int r7 = r7 % r6
            if (r7 == 0) goto L46
            int r4 = r4 + 1
        L46:
            if (r9 == 0) goto L4b
            if (r4 >= r3) goto L4b
            goto L4e
        L4b:
            r3 = r4
            goto L4e
        L4d:
            r3 = 0
        L4e:
            boolean r7 = r0.isOverflowButton
            if (r7 != 0) goto L55
            if (r9 == 0) goto L55
            r1 = 1
        L55:
            r0.expandable = r1
            r0.cellsUsed = r3
            int r6 = r6 * r3
            r7 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r7)
            r5.measure(r6, r8)
            return r3
    }

    private void onMeasureExactFormat(int r31, int r32) {
            r30 = this;
            r0 = r30
            int r1 = android.view.View.MeasureSpec.getMode(r32)
            int r2 = android.view.View.MeasureSpec.getSize(r31)
            int r3 = android.view.View.MeasureSpec.getSize(r32)
            int r4 = r0.getPaddingLeft()
            int r5 = r0.getPaddingRight()
            int r4 = r4 + r5
            int r5 = r0.getPaddingTop()
            int r6 = r0.getPaddingBottom()
            int r5 = r5 + r6
            r6 = -2
            r7 = r32
            int r6 = android.view.ViewGroup.getChildMeasureSpec(r7, r5, r6)
            int r2 = r2 - r4
            int r4 = r0.mMinCellSize
            int r7 = r2 / r4
            int r8 = r2 % r4
            r9 = 0
            if (r7 != 0) goto L35
            r0.setMeasuredDimension(r2, r9)
            return
        L35:
            int r8 = r8 / r7
            int r4 = r4 + r8
            int r8 = r0.getChildCount()
            r31 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L46:
            if (r12 >= r8) goto Lc2
            android.view.View r11 = r0.getChildAt(r12)
            int r9 = r11.getVisibility()
            r20 = r3
            r3 = 8
            if (r9 != r3) goto L59
            r21 = r4
            goto Lba
        L59:
            boolean r3 = r11 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            int r14 = r14 + 1
            if (r3 == 0) goto L68
            int r9 = r0.mGeneratedItemPadding
            r21 = r3
            r3 = 0
            r11.setPadding(r9, r3, r9, r3)
            goto L6b
        L68:
            r21 = r3
            r3 = 0
        L6b:
            android.view.ViewGroup$LayoutParams r9 = r11.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$LayoutParams r9 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) r9
            r9.expanded = r3
            r9.extraPixels = r3
            r9.cellsUsed = r3
            r9.expandable = r3
            r9.leftMargin = r3
            r9.rightMargin = r3
            if (r21 == 0) goto L8a
            r3 = r11
            androidx.appcompat.view.menu.ActionMenuItemView r3 = (androidx.appcompat.view.menu.ActionMenuItemView) r3
            boolean r3 = r3.hasText()
            if (r3 == 0) goto L8a
            r3 = 1
            goto L8b
        L8a:
            r3 = 0
        L8b:
            r9.preventEdgeOffset = r3
            boolean r3 = r9.isOverflowButton
            if (r3 == 0) goto L93
            r3 = 1
            goto L94
        L93:
            r3 = r7
        L94:
            int r3 = measureChildForCells(r11, r4, r3, r6, r5)
            int r15 = java.lang.Math.max(r15, r3)
            r21 = r4
            boolean r4 = r9.expandable
            if (r4 == 0) goto La4
            int r16 = r16 + 1
        La4:
            boolean r4 = r9.isOverflowButton
            if (r4 == 0) goto La9
            r13 = 1
        La9:
            int r7 = r7 - r3
            int r4 = r11.getMeasuredHeight()
            int r10 = java.lang.Math.max(r10, r4)
            r4 = 1
            if (r3 != r4) goto Lba
            int r3 = r4 << r12
            long r3 = (long) r3
            long r17 = r17 | r3
        Lba:
            int r12 = r12 + 1
            r3 = r20
            r4 = r21
            r9 = 0
            goto L46
        Lc2:
            r20 = r3
            r21 = r4
            r3 = 2
            if (r13 == 0) goto Lcd
            if (r14 != r3) goto Lcd
            r4 = 1
            goto Lce
        Lcd:
            r4 = 0
        Lce:
            r5 = 0
        Lcf:
            if (r16 <= 0) goto L15f
            if (r7 <= 0) goto L15f
            r9 = 2147483647(0x7fffffff, float:NaN)
            r25 = r31
            r3 = 0
            r11 = 0
            r22 = 2
            r23 = 1
        Lde:
            if (r11 >= r8) goto L107
            android.view.View r12 = r0.getChildAt(r11)
            android.view.ViewGroup$LayoutParams r12 = r12.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$LayoutParams r12 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) r12
            r27 = r4
            boolean r4 = r12.expandable
            if (r4 != 0) goto Lf1
            goto L102
        Lf1:
            int r4 = r12.cellsUsed
            if (r4 >= r9) goto Lfa
            long r25 = r23 << r11
            r9 = r4
            r3 = 1
            goto L102
        Lfa:
            if (r4 != r9) goto L102
            long r28 = r23 << r11
            long r25 = r25 | r28
            int r3 = r3 + 1
        L102:
            int r11 = r11 + 1
            r4 = r27
            goto Lde
        L107:
            r27 = r4
            long r17 = r17 | r25
            if (r3 <= r7) goto L10e
            goto L163
        L10e:
            int r9 = r9 + 1
            r3 = 0
        L111:
            if (r3 >= r8) goto L159
            android.view.View r4 = r0.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$LayoutParams r5 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) r5
            r19 = 1
            int r11 = r19 << r3
            long r11 = (long) r11
            long r23 = r25 & r11
            int r28 = (r23 > r31 ? 1 : (r23 == r31 ? 0 : -1))
            if (r28 != 0) goto L131
            int r4 = r5.cellsUsed
            if (r4 != r9) goto L12e
            long r17 = r17 | r11
        L12e:
            r23 = r3
            goto L156
        L131:
            if (r27 == 0) goto L147
            boolean r11 = r5.preventEdgeOffset
            if (r11 == 0) goto L147
            r11 = 1
            if (r7 != r11) goto L147
            int r12 = r0.mGeneratedItemPadding
            r19 = 1
            int r11 = r12 + r21
            r23 = r3
            r3 = 0
            r4.setPadding(r11, r3, r12, r3)
            goto L14b
        L147:
            r23 = r3
            r19 = 1
        L14b:
            int r3 = r5.cellsUsed
            int r3 = r3 + 1
            r5.cellsUsed = r3
            r4 = 1
            r5.expanded = r4
            int r7 = r7 + (-1)
        L156:
            int r3 = r23 + 1
            goto L111
        L159:
            r4 = r27
            r3 = 2
            r5 = 1
            goto Lcf
        L15f:
            r22 = 2
            r23 = 1
        L163:
            r4 = 1
            if (r13 != 0) goto L16a
            if (r14 != r4) goto L16a
            r3 = 1
            goto L16b
        L16a:
            r3 = 0
        L16b:
            if (r7 <= 0) goto L179
            int r9 = (r17 > r31 ? 1 : (r17 == r31 ? 0 : -1))
            if (r9 == 0) goto L179
            int r14 = r14 - r4
            if (r7 < r14) goto L17c
            if (r3 != 0) goto L17c
            if (r15 <= r4) goto L179
            goto L17c
        L179:
            r9 = 0
            goto L219
        L17c:
            int r4 = java.lang.Long.bitCount(r17)
            float r4 = (float) r4
            if (r3 != 0) goto L1ba
            long r11 = r17 & r23
            r3 = 1056964608(0x3f000000, float:0.5)
            int r9 = (r11 > r31 ? 1 : (r11 == r31 ? 0 : -1))
            if (r9 == 0) goto L19c
            r9 = 0
            android.view.View r11 = r0.getChildAt(r9)
            android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$LayoutParams r11 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) r11
            boolean r11 = r11.preventEdgeOffset
            if (r11 != 0) goto L19d
            float r4 = r4 - r3
            goto L19d
        L19c:
            r9 = 0
        L19d:
            int r11 = r8 + (-1)
            r19 = 1
            int r12 = r19 << r11
            long r12 = (long) r12
            long r12 = r17 & r12
            int r14 = (r12 > r31 ? 1 : (r12 == r31 ? 0 : -1))
            if (r14 == 0) goto L1bb
            android.view.View r11 = r0.getChildAt(r11)
            android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$LayoutParams r11 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) r11
            boolean r11 = r11.preventEdgeOffset
            if (r11 != 0) goto L1bb
            float r4 = r4 - r3
            goto L1bb
        L1ba:
            r9 = 0
        L1bb:
            r3 = 0
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 <= 0) goto L1c6
            int r7 = r7 * r21
            float r3 = (float) r7
            float r3 = r3 / r4
            int r3 = (int) r3
            goto L1c7
        L1c6:
            r3 = 0
        L1c7:
            r4 = 0
        L1c8:
            if (r4 >= r8) goto L219
            r19 = 1
            int r7 = r19 << r4
            long r11 = (long) r7
            long r11 = r17 & r11
            int r7 = (r11 > r31 ? 1 : (r11 == r31 ? 0 : -1))
            if (r7 != 0) goto L1d6
            goto L1f5
        L1d6:
            android.view.View r7 = r0.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r11 = r7.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$LayoutParams r11 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) r11
            boolean r7 = r7 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            if (r7 == 0) goto L1f7
            r11.extraPixels = r3
            r5 = 1
            r11.expanded = r5
            if (r4 != 0) goto L1f4
            boolean r5 = r11.preventEdgeOffset
            if (r5 != 0) goto L1f4
            int r5 = -r3
            int r5 = r5 / 2
            r11.leftMargin = r5
        L1f4:
            r5 = 1
        L1f5:
            r7 = 1
            goto L216
        L1f7:
            boolean r7 = r11.isOverflowButton
            if (r7 == 0) goto L207
            r11.extraPixels = r3
            r7 = 1
            r11.expanded = r7
            int r5 = -r3
            int r5 = r5 / 2
            r11.rightMargin = r5
            r5 = 1
            goto L216
        L207:
            r7 = 1
            if (r4 == 0) goto L20e
            int r12 = r3 / 2
            r11.leftMargin = r12
        L20e:
            int r12 = r8 + (-1)
            if (r4 == r12) goto L216
            int r12 = r3 / 2
            r11.rightMargin = r12
        L216:
            int r4 = r4 + 1
            goto L1c8
        L219:
            r3 = 1073741824(0x40000000, float:2.0)
            if (r5 == 0) goto L23f
        L21d:
            if (r9 >= r8) goto L23f
            android.view.View r4 = r0.getChildAt(r9)
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$LayoutParams r5 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) r5
            boolean r7 = r5.expanded
            if (r7 != 0) goto L22e
            goto L23c
        L22e:
            int r7 = r5.cellsUsed
            int r7 = r7 * r21
            int r5 = r5.extraPixels
            int r7 = r7 + r5
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r3)
            r4.measure(r5, r6)
        L23c:
            int r9 = r9 + 1
            goto L21d
        L23f:
            if (r1 == r3) goto L243
            r3 = r10
            goto L245
        L243:
            r3 = r20
        L245:
            r0.setMeasuredDimension(r2, r3)
            return
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r1 = r1 instanceof androidx.appcompat.widget.ActionMenuView.LayoutParams
            return r1
    }

    public void dismissPopupMenus() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mPresenter
            if (r0 == 0) goto L7
            r0.dismissPopupMenus()
        L7:
            return
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuView$LayoutParams r0 = r1.generateDefaultLayoutParams()
            return r0
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    protected androidx.appcompat.widget.ActionMenuView.LayoutParams generateDefaultLayoutParams() {
            r2 = this;
            androidx.appcompat.widget.ActionMenuView$LayoutParams r0 = new androidx.appcompat.widget.ActionMenuView$LayoutParams
            r1 = -2
            r0.<init>(r1, r1)
            r1 = 16
            r0.gravity = r1
            return r0
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    protected /* bridge */ /* synthetic */ androidx.appcompat.widget.LinearLayoutCompat.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuView$LayoutParams r0 = r1.generateDefaultLayoutParams()
            return r0
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            androidx.appcompat.widget.ActionMenuView$LayoutParams r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            androidx.appcompat.widget.ActionMenuView$LayoutParams r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public androidx.appcompat.widget.ActionMenuView.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            androidx.appcompat.widget.ActionMenuView$LayoutParams r0 = new androidx.appcompat.widget.ActionMenuView$LayoutParams
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    protected androidx.appcompat.widget.ActionMenuView.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            if (r2 == 0) goto L1c
            boolean r0 = r2 instanceof androidx.appcompat.widget.ActionMenuView.LayoutParams
            if (r0 == 0) goto Le
            androidx.appcompat.widget.ActionMenuView$LayoutParams r0 = new androidx.appcompat.widget.ActionMenuView$LayoutParams
            androidx.appcompat.widget.ActionMenuView$LayoutParams r2 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) r2
            r0.<init>(r2)
            goto L13
        Le:
            androidx.appcompat.widget.ActionMenuView$LayoutParams r0 = new androidx.appcompat.widget.ActionMenuView$LayoutParams
            r0.<init>(r2)
        L13:
            int r2 = r0.gravity
            if (r2 > 0) goto L1b
            r2 = 16
            r0.gravity = r2
        L1b:
            return r0
        L1c:
            androidx.appcompat.widget.ActionMenuView$LayoutParams r2 = r1.generateDefaultLayoutParams()
            return r2
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public /* bridge */ /* synthetic */ androidx.appcompat.widget.LinearLayoutCompat.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            androidx.appcompat.widget.ActionMenuView$LayoutParams r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    protected /* bridge */ /* synthetic */ androidx.appcompat.widget.LinearLayoutCompat.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            androidx.appcompat.widget.ActionMenuView$LayoutParams r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public androidx.appcompat.widget.ActionMenuView.LayoutParams generateOverflowButtonLayoutParams() {
            r2 = this;
            androidx.appcompat.widget.ActionMenuView$LayoutParams r0 = r2.generateDefaultLayoutParams()
            r1 = 1
            r0.isOverflowButton = r1
            return r0
    }

    public android.view.Menu getMenu() {
            r3 = this;
            androidx.appcompat.view.menu.MenuBuilder r0 = r3.mMenu
            if (r0 != 0) goto L3f
            android.content.Context r0 = r3.getContext()
            androidx.appcompat.view.menu.MenuBuilder r1 = new androidx.appcompat.view.menu.MenuBuilder
            r1.<init>(r0)
            r3.mMenu = r1
            androidx.appcompat.widget.ActionMenuView$MenuBuilderCallback r2 = new androidx.appcompat.widget.ActionMenuView$MenuBuilderCallback
            r2.<init>(r3)
            r1.setCallback(r2)
            androidx.appcompat.widget.ActionMenuPresenter r1 = new androidx.appcompat.widget.ActionMenuPresenter
            r1.<init>(r0)
            r3.mPresenter = r1
            r0 = 1
            r1.setReserveOverflow(r0)
            androidx.appcompat.widget.ActionMenuPresenter r0 = r3.mPresenter
            androidx.appcompat.view.menu.MenuPresenter$Callback r1 = r3.mActionMenuPresenterCallback
            if (r1 == 0) goto L29
            goto L2e
        L29:
            androidx.appcompat.widget.ActionMenuView$ActionMenuPresenterCallback r1 = new androidx.appcompat.widget.ActionMenuView$ActionMenuPresenterCallback
            r1.<init>()
        L2e:
            r0.setCallback(r1)
            androidx.appcompat.view.menu.MenuBuilder r0 = r3.mMenu
            androidx.appcompat.widget.ActionMenuPresenter r1 = r3.mPresenter
            android.content.Context r2 = r3.mPopupContext
            r0.addMenuPresenter(r1, r2)
            androidx.appcompat.widget.ActionMenuPresenter r0 = r3.mPresenter
            r0.setMenuView(r3)
        L3f:
            androidx.appcompat.view.menu.MenuBuilder r0 = r3.mMenu
            return r0
    }

    @androidx.annotation.Nullable
    public android.graphics.drawable.Drawable getOverflowIcon() {
            r1 = this;
            r1.getMenu()
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mPresenter
            android.graphics.drawable.Drawable r0 = r0.getOverflowIcon()
            return r0
    }

    public int getPopupTheme() {
            r1 = this;
            int r0 = r1.mPopupTheme
            return r0
    }

    @Override // androidx.appcompat.view.menu.MenuView
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getWindowAnimations() {
            r1 = this;
            r0 = 0
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    protected boolean hasSupportDividerBeforeChildAt(int r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            int r1 = r5 + (-1)
            android.view.View r1 = r4.getChildAt(r1)
            android.view.View r2 = r4.getChildAt(r5)
            int r3 = r4.getChildCount()
            if (r5 >= r3) goto L1e
            boolean r3 = r1 instanceof androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
            if (r3 == 0) goto L1e
            androidx.appcompat.widget.ActionMenuView$ActionMenuChildView r1 = (androidx.appcompat.widget.ActionMenuView.ActionMenuChildView) r1
            boolean r0 = r1.needsDividerAfter()
        L1e:
            if (r5 <= 0) goto L2c
            boolean r5 = r2 instanceof androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
            if (r5 == 0) goto L2c
            androidx.appcompat.widget.ActionMenuView$ActionMenuChildView r2 = (androidx.appcompat.widget.ActionMenuView.ActionMenuChildView) r2
            boolean r5 = r2.needsDividerBefore()
            r5 = r5 | r0
            return r5
        L2c:
            return r0
    }

    public boolean hideOverflowMenu() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mPresenter
            if (r0 == 0) goto Lc
            boolean r0 = r0.hideOverflowMenu()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.view.menu.MenuView
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void initialize(androidx.appcompat.view.menu.MenuBuilder r1) {
            r0 = this;
            r0.mMenu = r1
            return
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.ItemInvoker
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean invokeItem(androidx.appcompat.view.menu.MenuItemImpl r3) {
            r2 = this;
            androidx.appcompat.view.menu.MenuBuilder r0 = r2.mMenu
            r1 = 0
            boolean r3 = r0.performItemAction(r3, r1)
            return r3
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean isOverflowMenuShowPending() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mPresenter
            if (r0 == 0) goto Lc
            boolean r0 = r0.isOverflowMenuShowPending()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public boolean isOverflowMenuShowing() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mPresenter
            if (r0 == 0) goto Lc
            boolean r0 = r0.isOverflowMenuShowing()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean isOverflowReserved() {
            r1 = this;
            boolean r0 = r1.mReserveOverflow
            return r0
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration r2) {
            r1 = this;
            super.onConfigurationChanged(r2)
            androidx.appcompat.widget.ActionMenuPresenter r2 = r1.mPresenter
            if (r2 == 0) goto L1d
            r0 = 0
            r2.updateMenuView(r0)
            androidx.appcompat.widget.ActionMenuPresenter r2 = r1.mPresenter
            boolean r2 = r2.isOverflowMenuShowing()
            if (r2 == 0) goto L1d
            androidx.appcompat.widget.ActionMenuPresenter r2 = r1.mPresenter
            r2.hideOverflowMenu()
            androidx.appcompat.widget.ActionMenuPresenter r2 = r1.mPresenter
            r2.showOverflowMenu()
        L1d:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
            r0 = this;
            super.onDetachedFromWindow()
            r0.dismissPopupMenus()
            return
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
            r17 = this;
            r0 = r17
            boolean r1 = r0.mFormatItems
            if (r1 != 0) goto La
            super.onLayout(r18, r19, r20, r21, r22)
            return
        La:
            int r1 = r0.getChildCount()
            int r2 = r22 - r20
            int r2 = r2 / 2
            int r3 = r0.getDividerWidth()
            int r4 = r21 - r19
            int r5 = r0.getPaddingRight()
            int r5 = r4 - r5
            int r6 = r0.getPaddingLeft()
            int r5 = r5 - r6
            boolean r6 = androidx.appcompat.widget.ViewUtils.isLayoutRtl(r0)
            r8 = 0
            r9 = 0
            r10 = 0
        L2a:
            r11 = 8
            r12 = 1
            if (r8 >= r1) goto L8d
            android.view.View r13 = r0.getChildAt(r8)
            int r14 = r13.getVisibility()
            if (r14 != r11) goto L3a
            goto L8a
        L3a:
            android.view.ViewGroup$LayoutParams r11 = r13.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$LayoutParams r11 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) r11
            boolean r14 = r11.isOverflowButton
            if (r14 == 0) goto L7a
            int r9 = r13.getMeasuredWidth()
            boolean r14 = r0.hasSupportDividerBeforeChildAt(r8)
            if (r14 == 0) goto L4f
            int r9 = r9 + r3
        L4f:
            int r14 = r13.getMeasuredHeight()
            if (r6 == 0) goto L5f
            int r15 = r0.getPaddingLeft()
            int r11 = r11.leftMargin
            int r15 = r15 + r11
            int r11 = r15 + r9
            goto L6f
        L5f:
            int r15 = r0.getWidth()
            int r16 = r0.getPaddingRight()
            int r15 = r15 - r16
            int r11 = r11.rightMargin
            int r11 = r15 - r11
            int r15 = r11 - r9
        L6f:
            int r16 = r14 / 2
            int r7 = r2 - r16
            int r14 = r14 + r7
            r13.layout(r15, r7, r11, r14)
            int r5 = r5 - r9
            r9 = 1
            goto L8a
        L7a:
            int r7 = r13.getMeasuredWidth()
            int r12 = r11.leftMargin
            int r7 = r7 + r12
            int r11 = r11.rightMargin
            int r7 = r7 + r11
            int r5 = r5 - r7
            r0.hasSupportDividerBeforeChildAt(r8)
            int r10 = r10 + 1
        L8a:
            int r8 = r8 + 1
            goto L2a
        L8d:
            if (r1 != r12) goto Lac
            if (r9 != 0) goto Lac
            r3 = 0
            android.view.View r1 = r0.getChildAt(r3)
            int r3 = r1.getMeasuredWidth()
            int r5 = r1.getMeasuredHeight()
            int r4 = r4 / 2
            int r6 = r3 / 2
            int r4 = r4 - r6
            int r6 = r5 / 2
            int r2 = r2 - r6
            int r3 = r3 + r4
            int r5 = r5 + r2
            r1.layout(r4, r2, r3, r5)
            return
        Lac:
            r3 = r9 ^ 1
            int r10 = r10 - r3
            if (r10 <= 0) goto Lb5
            int r3 = r5 / r10
        Lb3:
            r4 = 0
            goto Lb7
        Lb5:
            r3 = 0
            goto Lb3
        Lb7:
            int r3 = java.lang.Math.max(r4, r3)
            if (r6 == 0) goto Lfb
            int r5 = r0.getWidth()
            int r6 = r0.getPaddingRight()
            int r5 = r5 - r6
            r7 = 0
        Lc7:
            if (r7 >= r1) goto L134
            android.view.View r4 = r0.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r6 = r4.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$LayoutParams r6 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) r6
            int r8 = r4.getVisibility()
            if (r8 == r11) goto Lf8
            boolean r8 = r6.isOverflowButton
            if (r8 == 0) goto Lde
            goto Lf8
        Lde:
            int r8 = r6.rightMargin
            int r5 = r5 - r8
            int r8 = r4.getMeasuredWidth()
            int r9 = r4.getMeasuredHeight()
            int r10 = r9 / 2
            int r10 = r2 - r10
            int r12 = r5 - r8
            int r9 = r9 + r10
            r4.layout(r12, r10, r5, r9)
            int r4 = r6.leftMargin
            int r8 = r8 + r4
            int r8 = r8 + r3
            int r5 = r5 - r8
        Lf8:
            int r7 = r7 + 1
            goto Lc7
        Lfb:
            int r5 = r0.getPaddingLeft()
            r7 = 0
        L100:
            if (r7 >= r1) goto L134
            android.view.View r4 = r0.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r6 = r4.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$LayoutParams r6 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) r6
            int r8 = r4.getVisibility()
            if (r8 == r11) goto L131
            boolean r8 = r6.isOverflowButton
            if (r8 == 0) goto L117
            goto L131
        L117:
            int r8 = r6.leftMargin
            int r5 = r5 + r8
            int r8 = r4.getMeasuredWidth()
            int r9 = r4.getMeasuredHeight()
            int r10 = r9 / 2
            int r10 = r2 - r10
            int r12 = r5 + r8
            int r9 = r9 + r10
            r4.layout(r5, r10, r12, r9)
            int r4 = r6.rightMargin
            int r8 = r8 + r4
            int r8 = r8 + r3
            int r5 = r5 + r8
        L131:
            int r7 = r7 + 1
            goto L100
        L134:
            return
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int r6, int r7) {
            r5 = this;
            boolean r0 = r5.mFormatItems
            int r1 = android.view.View.MeasureSpec.getMode(r6)
            r2 = 1073741824(0x40000000, float:2.0)
            r3 = 1
            r4 = 0
            if (r1 != r2) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            r5.mFormatItems = r1
            if (r0 == r1) goto L15
            r5.mFormatItemsWidth = r4
        L15:
            int r0 = android.view.View.MeasureSpec.getSize(r6)
            boolean r1 = r5.mFormatItems
            if (r1 == 0) goto L2a
            androidx.appcompat.view.menu.MenuBuilder r1 = r5.mMenu
            if (r1 == 0) goto L2a
            int r2 = r5.mFormatItemsWidth
            if (r0 == r2) goto L2a
            r5.mFormatItemsWidth = r0
            r1.onItemsChanged(r3)
        L2a:
            int r0 = r5.getChildCount()
            boolean r1 = r5.mFormatItems
            if (r1 == 0) goto L38
            if (r0 <= 0) goto L38
            r5.onMeasureExactFormat(r6, r7)
            return
        L38:
            r1 = 0
        L39:
            if (r1 >= r0) goto L4c
            android.view.View r2 = r5.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$LayoutParams r2 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) r2
            r2.rightMargin = r4
            r2.leftMargin = r4
            int r1 = r1 + 1
            goto L39
        L4c:
            super.onMeasure(r6, r7)
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public androidx.appcompat.view.menu.MenuBuilder peekMenu() {
            r1 = this;
            androidx.appcompat.view.menu.MenuBuilder r0 = r1.mMenu
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setExpandedActionViewsExclusive(boolean r2) {
            r1 = this;
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mPresenter
            r0.setExpandedActionViewsExclusive(r2)
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setMenuCallbacks(androidx.appcompat.view.menu.MenuPresenter.Callback r1, androidx.appcompat.view.menu.MenuBuilder.Callback r2) {
            r0 = this;
            r0.mActionMenuPresenterCallback = r1
            r0.mMenuBuilderCallback = r2
            return
    }

    public void setOnMenuItemClickListener(androidx.appcompat.widget.ActionMenuView.OnMenuItemClickListener r1) {
            r0 = this;
            r0.mOnMenuItemClickListener = r1
            return
    }

    public void setOverflowIcon(@androidx.annotation.Nullable android.graphics.drawable.Drawable r2) {
            r1 = this;
            r1.getMenu()
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mPresenter
            r0.setOverflowIcon(r2)
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setOverflowReserved(boolean r1) {
            r0 = this;
            r0.mReserveOverflow = r1
            return
    }

    public void setPopupTheme(@androidx.annotation.StyleRes int r3) {
            r2 = this;
            int r0 = r2.mPopupTheme
            if (r0 == r3) goto L1a
            r2.mPopupTheme = r3
            if (r3 != 0) goto Lf
            android.content.Context r3 = r2.getContext()
            r2.mPopupContext = r3
            return
        Lf:
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            r2.mPopupContext = r0
        L1a:
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public void setPresenter(androidx.appcompat.widget.ActionMenuPresenter r1) {
            r0 = this;
            r0.mPresenter = r1
            r1.setMenuView(r0)
            return
    }

    public boolean showOverflowMenu() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mPresenter
            if (r0 == 0) goto Lc
            boolean r0 = r0.showOverflowMenu()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }
}
