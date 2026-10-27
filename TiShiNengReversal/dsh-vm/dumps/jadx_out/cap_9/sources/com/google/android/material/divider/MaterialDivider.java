package com.google.android.material.divider;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class MaterialDivider extends android.view.View {
    private static final int DEF_STYLE_RES = 0;

    @androidx.annotation.ColorInt
    private int color;

    @androidx.annotation.NonNull
    private final com.google.android.material.shape.MaterialShapeDrawable dividerDrawable;
    private int insetEnd;
    private int insetStart;
    private int thickness;

    static {
            int r0 = com.google.android.material.R.style.Widget_MaterialComponents_MaterialDivider
            com.google.android.material.divider.MaterialDivider.DEF_STYLE_RES = r0
            return
    }

    public MaterialDivider(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public MaterialDivider(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.R.attr.materialDividerStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public MaterialDivider(@androidx.annotation.NonNull android.content.Context r7, @androidx.annotation.Nullable android.util.AttributeSet r8, int r9) {
            r6 = this;
            int r4 = com.google.android.material.divider.MaterialDivider.DEF_STYLE_RES
            android.content.Context r7 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.content.Context r0 = r6.getContext()
            com.google.android.material.shape.MaterialShapeDrawable r7 = new com.google.android.material.shape.MaterialShapeDrawable
            r7.<init>()
            r6.dividerDrawable = r7
            int[] r2 = com.google.android.material.R.styleable.MaterialDivider
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r0, r1, r2, r3, r4, r5)
            int r9 = com.google.android.material.R.styleable.MaterialDivider_dividerThickness
            android.content.res.Resources r1 = r6.getResources()
            int r2 = com.google.android.material.R.dimen.material_divider_thickness
            int r1 = r1.getDimensionPixelSize(r2)
            int r9 = r8.getDimensionPixelSize(r9, r1)
            r6.thickness = r9
            int r9 = com.google.android.material.R.styleable.MaterialDivider_dividerInsetStart
            int r9 = r8.getDimensionPixelOffset(r9, r7)
            r6.insetStart = r9
            int r9 = com.google.android.material.R.styleable.MaterialDivider_dividerInsetEnd
            int r7 = r8.getDimensionPixelOffset(r9, r7)
            r6.insetEnd = r7
            int r7 = com.google.android.material.R.styleable.MaterialDivider_dividerColor
            android.content.res.ColorStateList r7 = com.google.android.material.resources.MaterialResources.getColorStateList(r0, r8, r7)
            int r7 = r7.getDefaultColor()
            r6.setDividerColor(r7)
            r8.recycle()
            return
    }

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

    public int getDividerThickness() {
            r1 = this;
            int r0 = r1.thickness
            return r0
    }

    @Override // android.view.View
    protected void onDraw(@androidx.annotation.NonNull android.graphics.Canvas r7) {
            r6 = this;
            super.onDraw(r7)
            int r0 = androidx.core.view.ViewCompat.getLayoutDirection(r6)
            r1 = 0
            r2 = 1
            if (r0 != r2) goto Lc
            goto Ld
        Lc:
            r2 = 0
        Ld:
            if (r2 == 0) goto L12
            int r0 = r6.insetEnd
            goto L14
        L12:
            int r0 = r6.insetStart
        L14:
            if (r2 == 0) goto L1e
            int r2 = r6.getWidth()
            int r3 = r6.insetStart
        L1c:
            int r2 = r2 - r3
            goto L25
        L1e:
            int r2 = r6.getWidth()
            int r3 = r6.insetEnd
            goto L1c
        L25:
            com.google.android.material.shape.MaterialShapeDrawable r3 = r6.dividerDrawable
            int r4 = r6.getBottom()
            int r5 = r6.getTop()
            int r4 = r4 - r5
            r3.setBounds(r0, r1, r2, r4)
            com.google.android.material.shape.MaterialShapeDrawable r0 = r6.dividerDrawable
            r0.draw(r7)
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r2, int r3) {
            r1 = this;
            super.onMeasure(r2, r3)
            int r2 = android.view.View.MeasureSpec.getMode(r3)
            int r3 = r1.getMeasuredHeight()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r0) goto L13
            if (r2 != 0) goto L12
            goto L13
        L12:
            return
        L13:
            int r2 = r1.thickness
            if (r2 <= 0) goto L1a
            if (r3 == r2) goto L1a
            r3 = r2
        L1a:
            int r2 = r1.getMeasuredWidth()
            r1.setMeasuredDimension(r2, r3)
            return
    }

    public void setDividerColor(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            int r0 = r1.color
            if (r0 == r2) goto L12
            r1.color = r2
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.dividerDrawable
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r0.setFillColor(r2)
            r1.invalidate()
        L12:
            return
    }

    public void setDividerColorResource(@androidx.annotation.ColorRes int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            int r2 = androidx.core.content.ContextCompat.getColor(r0, r2)
            r1.setDividerColor(r2)
            return
    }

    public void setDividerInsetEnd(@androidx.annotation.Px int r1) {
            r0 = this;
            r0.insetEnd = r1
            return
    }

    public void setDividerInsetEndResource(@androidx.annotation.DimenRes int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r2 = r0.getDimensionPixelOffset(r2)
            r1.setDividerInsetEnd(r2)
            return
    }

    public void setDividerInsetStart(@androidx.annotation.Px int r1) {
            r0 = this;
            r0.insetStart = r1
            return
    }

    public void setDividerInsetStartResource(@androidx.annotation.DimenRes int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r2 = r0.getDimensionPixelOffset(r2)
            r1.setDividerInsetStart(r2)
            return
    }

    public void setDividerThickness(@androidx.annotation.Px int r2) {
            r1 = this;
            int r0 = r1.thickness
            if (r0 == r2) goto L9
            r1.thickness = r2
            r1.requestLayout()
        L9:
            return
    }

    public void setDividerThicknessResource(@androidx.annotation.DimenRes int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r2 = r0.getDimensionPixelSize(r2)
            r1.setDividerThickness(r2)
            return
    }
}
