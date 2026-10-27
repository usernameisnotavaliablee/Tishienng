package com.google.android.material.radiobutton;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class MaterialRadioButton extends androidx.appcompat.widget.AppCompatRadioButton {
    private static final int DEF_STYLE_RES = 0;
    private static final int[][] ENABLED_CHECKED_STATES = null;

    @androidx.annotation.Nullable
    private android.content.res.ColorStateList materialThemeColorsTintList;
    private boolean useMaterialThemeColors;

    static {
            int r0 = com.google.android.material.R.style.Widget_MaterialComponents_CompoundButton_RadioButton
            com.google.android.material.radiobutton.MaterialRadioButton.DEF_STYLE_RES = r0
            r0 = 4
            int[][] r0 = new int[r0][]
            r1 = 16842910(0x101009e, float:2.3694E-38)
            r2 = 16842912(0x10100a0, float:2.3694006E-38)
            int[] r3 = new int[]{r1, r2}
            r4 = 0
            r0[r4] = r3
            r3 = -16842912(0xfffffffffefeff60, float:-1.6947495E38)
            int[] r1 = new int[]{r1, r3}
            r4 = 1
            r0[r4] = r1
            r1 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            int[] r2 = new int[]{r1, r2}
            r4 = 2
            r0[r4] = r2
            int[] r1 = new int[]{r1, r3}
            r2 = 3
            r0[r2] = r1
            com.google.android.material.radiobutton.MaterialRadioButton.ENABLED_CHECKED_STATES = r0
            return
    }

    public MaterialRadioButton(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public MaterialRadioButton(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.R.attr.radioButtonStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public MaterialRadioButton(@androidx.annotation.NonNull android.content.Context r7, @androidx.annotation.Nullable android.util.AttributeSet r8, int r9) {
            r6 = this;
            int r4 = com.google.android.material.radiobutton.MaterialRadioButton.DEF_STYLE_RES
            android.content.Context r7 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.content.Context r0 = r6.getContext()
            int[] r2 = com.google.android.material.R.styleable.MaterialRadioButton
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r0, r1, r2, r3, r4, r5)
            int r9 = com.google.android.material.R.styleable.MaterialRadioButton_buttonTint
            boolean r1 = r8.hasValue(r9)
            if (r1 == 0) goto L27
            android.content.res.ColorStateList r9 = com.google.android.material.resources.MaterialResources.getColorStateList(r0, r8, r9)
            androidx.core.widget.CompoundButtonCompat.setButtonTintList(r6, r9)
        L27:
            int r9 = com.google.android.material.R.styleable.MaterialRadioButton_useMaterialThemeColors
            boolean r7 = r8.getBoolean(r9, r7)
            r6.useMaterialThemeColors = r7
            r8.recycle()
            return
    }

    private android.content.res.ColorStateList getMaterialThemeColorsTintList() {
            r7 = this;
            android.content.res.ColorStateList r0 = r7.materialThemeColorsTintList
            if (r0 != 0) goto L46
            int r0 = com.google.android.material.R.attr.colorControlActivated
            int r0 = com.google.android.material.color.MaterialColors.getColor(r7, r0)
            int r1 = com.google.android.material.R.attr.colorOnSurface
            int r1 = com.google.android.material.color.MaterialColors.getColor(r7, r1)
            int r2 = com.google.android.material.R.attr.colorSurface
            int r2 = com.google.android.material.color.MaterialColors.getColor(r7, r2)
            int[][] r3 = com.google.android.material.radiobutton.MaterialRadioButton.ENABLED_CHECKED_STATES
            int r4 = r3.length
            int[] r4 = new int[r4]
            r5 = 1065353216(0x3f800000, float:1.0)
            int r0 = com.google.android.material.color.MaterialColors.layer(r2, r0, r5)
            r5 = 0
            r4[r5] = r0
            r0 = 1057635697(0x3f0a3d71, float:0.54)
            int r0 = com.google.android.material.color.MaterialColors.layer(r2, r1, r0)
            r5 = 1
            r4[r5] = r0
            r0 = 2
            r5 = 1052938076(0x3ec28f5c, float:0.38)
            int r6 = com.google.android.material.color.MaterialColors.layer(r2, r1, r5)
            r4[r0] = r6
            r0 = 3
            int r1 = com.google.android.material.color.MaterialColors.layer(r2, r1, r5)
            r4[r0] = r1
            android.content.res.ColorStateList r0 = new android.content.res.ColorStateList
            r0.<init>(r3, r4)
            r7.materialThemeColorsTintList = r0
        L46:
            android.content.res.ColorStateList r0 = r7.materialThemeColorsTintList
            return r0
    }

    public boolean isUseMaterialThemeColors() {
            r1 = this;
            boolean r0 = r1.useMaterialThemeColors
            return r0
    }

    protected void onAttachedToWindow() {
            r1 = this;
            super/*android.widget.RadioButton*/.onAttachedToWindow()
            boolean r0 = r1.useMaterialThemeColors
            if (r0 == 0) goto L11
            android.content.res.ColorStateList r0 = androidx.core.widget.CompoundButtonCompat.getButtonTintList(r1)
            if (r0 != 0) goto L11
            r0 = 1
            r1.setUseMaterialThemeColors(r0)
        L11:
            return
    }

    public void setUseMaterialThemeColors(boolean r1) {
            r0 = this;
            r0.useMaterialThemeColors = r1
            if (r1 == 0) goto Lc
            android.content.res.ColorStateList r1 = r0.getMaterialThemeColorsTintList()
            androidx.core.widget.CompoundButtonCompat.setButtonTintList(r0, r1)
            return
        Lc:
            r1 = 0
            androidx.core.widget.CompoundButtonCompat.setButtonTintList(r0, r1)
            return
    }
}
