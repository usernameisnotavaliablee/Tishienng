package com.google.android.material.divider;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class MaterialDividerItemDecoration extends androidx.recyclerview.widget.RecyclerView.ItemDecoration {
    private static final int DEF_STYLE_RES = 0;
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;

    @androidx.annotation.ColorInt
    private int color;

    @androidx.annotation.NonNull
    private android.graphics.drawable.Drawable dividerDrawable;
    private int insetEnd;
    private int insetStart;
    private boolean lastItemDecorated;
    private int orientation;
    private final android.graphics.Rect tempRect;
    private int thickness;

    static {
            int r0 = com.google.android.material.R.style.Widget_MaterialComponents_MaterialDivider
            com.google.android.material.divider.MaterialDividerItemDecoration.DEF_STYLE_RES = r0
            return
    }

    public MaterialDividerItemDecoration(@androidx.annotation.NonNull android.content.Context r2, int r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r3)
            return
    }

    public MaterialDividerItemDecoration(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3, int r4) {
            r1 = this;
            int r0 = com.google.android.material.R.attr.materialDividerStyle
            r1.<init>(r2, r3, r0, r4)
            return
    }

    public MaterialDividerItemDecoration(@androidx.annotation.NonNull android.content.Context r8, @androidx.annotation.Nullable android.util.AttributeSet r9, int r10, int r11) {
            r7 = this;
            r7.<init>()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r7.tempRect = r0
            int[] r3 = com.google.android.material.R.styleable.MaterialDivider
            int r5 = com.google.android.material.divider.MaterialDividerItemDecoration.DEF_STYLE_RES
            r0 = 0
            int[] r6 = new int[r0]
            r1 = r8
            r2 = r9
            r4 = r10
            android.content.res.TypedArray r8 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r1, r2, r3, r4, r5, r6)
            int r9 = com.google.android.material.R.styleable.MaterialDivider_dividerColor
            android.content.res.ColorStateList r9 = com.google.android.material.resources.MaterialResources.getColorStateList(r1, r8, r9)
            int r9 = r9.getDefaultColor()
            r7.color = r9
            int r9 = com.google.android.material.R.styleable.MaterialDivider_dividerThickness
            android.content.res.Resources r10 = r1.getResources()
            int r1 = com.google.android.material.R.dimen.material_divider_thickness
            int r10 = r10.getDimensionPixelSize(r1)
            int r9 = r8.getDimensionPixelSize(r9, r10)
            r7.thickness = r9
            int r9 = com.google.android.material.R.styleable.MaterialDivider_dividerInsetStart
            int r9 = r8.getDimensionPixelOffset(r9, r0)
            r7.insetStart = r9
            int r9 = com.google.android.material.R.styleable.MaterialDivider_dividerInsetEnd
            int r9 = r8.getDimensionPixelOffset(r9, r0)
            r7.insetEnd = r9
            int r9 = com.google.android.material.R.styleable.MaterialDivider_lastItemDecorated
            r10 = 1
            boolean r9 = r8.getBoolean(r9, r10)
            r7.lastItemDecorated = r9
            r8.recycle()
            android.graphics.drawable.ShapeDrawable r8 = new android.graphics.drawable.ShapeDrawable
            r8.<init>()
            r7.dividerDrawable = r8
            int r8 = r7.color
            r7.setDividerColor(r8)
            r7.setOrientation(r11)
            return
    }

    private void drawForHorizontalOrientation(@androidx.annotation.NonNull android.graphics.Canvas r8, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r9) {
            r7 = this;
            r8.save()
            boolean r0 = r9.getClipToPadding()
            r1 = 0
            if (r0 == 0) goto L28
            int r0 = r9.getPaddingTop()
            int r2 = r9.getHeight()
            int r3 = r9.getPaddingBottom()
            int r2 = r2 - r3
            int r3 = r9.getPaddingLeft()
            int r4 = r9.getWidth()
            int r5 = r9.getPaddingRight()
            int r4 = r4 - r5
            r8.clipRect(r3, r0, r4, r2)
            goto L2d
        L28:
            int r2 = r9.getHeight()
            r0 = 0
        L2d:
            int r3 = r7.insetStart
            int r0 = r0 + r3
            int r3 = r7.insetEnd
            int r2 = r2 - r3
            int r3 = r9.getChildCount()
        L37:
            if (r1 >= r3) goto L6a
            android.view.View r4 = r9.getChildAt(r1)
            boolean r5 = r7.shouldDrawDivider(r9, r4)
            if (r5 == 0) goto L67
            androidx.recyclerview.widget.RecyclerView$LayoutManager r5 = r9.getLayoutManager()
            android.graphics.Rect r6 = r7.tempRect
            r5.getDecoratedBoundsWithMargins(r4, r6)
            android.graphics.Rect r5 = r7.tempRect
            int r5 = r5.right
            float r4 = r4.getTranslationX()
            int r4 = java.lang.Math.round(r4)
            int r5 = r5 + r4
            int r4 = r7.thickness
            int r4 = r5 - r4
            android.graphics.drawable.Drawable r6 = r7.dividerDrawable
            r6.setBounds(r4, r0, r5, r2)
            android.graphics.drawable.Drawable r4 = r7.dividerDrawable
            r4.draw(r8)
        L67:
            int r1 = r1 + 1
            goto L37
        L6a:
            r8.restore()
            return
    }

    private void drawForVerticalOrientation(@androidx.annotation.NonNull android.graphics.Canvas r8, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r9) {
            r7 = this;
            r8.save()
            boolean r0 = r9.getClipToPadding()
            r1 = 0
            if (r0 == 0) goto L28
            int r0 = r9.getPaddingLeft()
            int r2 = r9.getWidth()
            int r3 = r9.getPaddingRight()
            int r2 = r2 - r3
            int r3 = r9.getPaddingTop()
            int r4 = r9.getHeight()
            int r5 = r9.getPaddingBottom()
            int r4 = r4 - r5
            r8.clipRect(r0, r3, r2, r4)
            goto L2d
        L28:
            int r2 = r9.getWidth()
            r0 = 0
        L2d:
            int r3 = androidx.core.view.ViewCompat.getLayoutDirection(r9)
            r4 = 1
            if (r3 != r4) goto L35
            goto L36
        L35:
            r4 = 0
        L36:
            if (r4 == 0) goto L3b
            int r3 = r7.insetEnd
            goto L3d
        L3b:
            int r3 = r7.insetStart
        L3d:
            int r0 = r0 + r3
            if (r4 == 0) goto L43
            int r3 = r7.insetStart
            goto L45
        L43:
            int r3 = r7.insetEnd
        L45:
            int r2 = r2 - r3
            int r3 = r9.getChildCount()
        L4a:
            if (r1 >= r3) goto L7d
            android.view.View r4 = r9.getChildAt(r1)
            boolean r5 = r7.shouldDrawDivider(r9, r4)
            if (r5 == 0) goto L7a
            androidx.recyclerview.widget.RecyclerView$LayoutManager r5 = r9.getLayoutManager()
            android.graphics.Rect r6 = r7.tempRect
            r5.getDecoratedBoundsWithMargins(r4, r6)
            android.graphics.Rect r5 = r7.tempRect
            int r5 = r5.bottom
            float r4 = r4.getTranslationY()
            int r4 = java.lang.Math.round(r4)
            int r5 = r5 + r4
            int r4 = r7.thickness
            int r4 = r5 - r4
            android.graphics.drawable.Drawable r6 = r7.dividerDrawable
            r6.setBounds(r0, r4, r2, r5)
            android.graphics.drawable.Drawable r4 = r7.dividerDrawable
            r4.draw(r8)
        L7a:
            int r1 = r1 + 1
            goto L4a
        L7d:
            r8.restore()
            return
    }

    private boolean shouldDrawDivider(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r5, @androidx.annotation.NonNull android.view.View r6) {
            r4 = this;
            int r6 = r5.getChildAdapterPosition(r6)
            androidx.recyclerview.widget.RecyclerView$Adapter r5 = r5.getAdapter()
            r0 = 0
            r1 = 1
            if (r5 == 0) goto L15
            int r2 = r5.getItemCount()
            int r2 = r2 - r1
            if (r6 != r2) goto L15
            r2 = 1
            goto L16
        L15:
            r2 = 0
        L16:
            r3 = -1
            if (r6 == r3) goto L26
            if (r2 == 0) goto L1f
            boolean r2 = r4.lastItemDecorated
            if (r2 == 0) goto L26
        L1f:
            boolean r5 = r4.shouldDrawDivider(r6, r5)
            if (r5 == 0) goto L26
            return r1
        L26:
            return r0
    }

    @androidx.annotation.ColorInt
    public int getDividerColor() {
            r1 = this;
            int r0 = r1.color
            return r0
    }

    @androidx.annotation.Px
    public int getDividerInsetEnd() {
            r1 = this;
            int r0 = r1.insetEnd
            return r0
    }

    @androidx.annotation.Px
    public int getDividerInsetStart() {
            r1 = this;
            int r0 = r1.insetStart
            return r0
    }

    @androidx.annotation.Px
    public int getDividerThickness() {
            r1 = this;
            int r0 = r1.thickness
            return r0
    }

    public void getItemOffsets(@androidx.annotation.NonNull android.graphics.Rect r1, @androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r3, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r4) {
            r0 = this;
            r4 = 0
            r1.set(r4, r4, r4, r4)
            boolean r2 = r0.shouldDrawDivider(r3, r2)
            if (r2 == 0) goto L18
            int r2 = r0.orientation
            r3 = 1
            if (r2 != r3) goto L14
            int r2 = r0.thickness
            r1.bottom = r2
            return
        L14:
            int r2 = r0.thickness
            r1.right = r2
        L18:
            return
    }

    public int getOrientation() {
            r1 = this;
            int r0 = r1.orientation
            return r0
    }

    public boolean isLastItemDecorated() {
            r1 = this;
            boolean r0 = r1.lastItemDecorated
            return r0
    }

    public void onDraw(@androidx.annotation.NonNull android.graphics.Canvas r2, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r3, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r4) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r4 = r3.getLayoutManager()
            if (r4 != 0) goto L7
            return
        L7:
            int r4 = r1.orientation
            r0 = 1
            if (r4 != r0) goto L10
            r1.drawForVerticalOrientation(r2, r3)
            return
        L10:
            r1.drawForHorizontalOrientation(r2, r3)
            return
    }

    public void setDividerColor(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            r1.color = r2
            android.graphics.drawable.Drawable r0 = r1.dividerDrawable
            android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.DrawableCompat.wrap(r0)
            r1.dividerDrawable = r0
            androidx.core.graphics.drawable.DrawableCompat.setTint(r0, r2)
            return
    }

    public void setDividerColorResource(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.ColorRes int r2) {
            r0 = this;
            int r1 = androidx.core.content.ContextCompat.getColor(r1, r2)
            r0.setDividerColor(r1)
            return
    }

    public void setDividerInsetEnd(@androidx.annotation.Px int r1) {
            r0 = this;
            r0.insetEnd = r1
            return
    }

    public void setDividerInsetEndResource(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.DimenRes int r2) {
            r0 = this;
            android.content.res.Resources r1 = r1.getResources()
            int r1 = r1.getDimensionPixelOffset(r2)
            r0.setDividerInsetEnd(r1)
            return
    }

    public void setDividerInsetStart(@androidx.annotation.Px int r1) {
            r0 = this;
            r0.insetStart = r1
            return
    }

    public void setDividerInsetStartResource(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.DimenRes int r2) {
            r0 = this;
            android.content.res.Resources r1 = r1.getResources()
            int r1 = r1.getDimensionPixelOffset(r2)
            r0.setDividerInsetStart(r1)
            return
    }

    public void setDividerThickness(@androidx.annotation.Px int r1) {
            r0 = this;
            r0.thickness = r1
            return
    }

    public void setDividerThicknessResource(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.DimenRes int r2) {
            r0 = this;
            android.content.res.Resources r1 = r1.getResources()
            int r1 = r1.getDimensionPixelSize(r2)
            r0.setDividerThickness(r1)
            return
    }

    public void setLastItemDecorated(boolean r1) {
            r0 = this;
            r0.lastItemDecorated = r1
            return
    }

    public void setOrientation(int r4) {
            r3 = this;
            if (r4 == 0) goto L22
            r0 = 1
            if (r4 != r0) goto L6
            goto L22
        L6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid orientation: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ". It should be either HORIZONTAL or VERTICAL"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L22:
            r3.orientation = r4
            return
    }

    protected boolean shouldDrawDivider(int r1, @androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerView.Adapter<?> r2) {
            r0 = this;
            r1 = 1
            return r1
    }
}
