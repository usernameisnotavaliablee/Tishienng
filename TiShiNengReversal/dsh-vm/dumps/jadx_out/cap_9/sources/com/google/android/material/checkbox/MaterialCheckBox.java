package com.google.android.material.checkbox;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class MaterialCheckBox extends androidx.appcompat.widget.AppCompatCheckBox {
    private static final int[][] CHECKBOX_STATES = null;
    private static final int DEF_STYLE_RES = 0;
    private static final int[] ERROR_STATE_SET = null;

    @android.annotation.SuppressLint({"DiscouragedApi"})
    private static final int FRAMEWORK_BUTTON_DRAWABLE_RES_ID = 0;
    private static final int[] INDETERMINATE_STATE_SET = null;
    public static final int STATE_CHECKED = 1;
    public static final int STATE_INDETERMINATE = 2;
    public static final int STATE_UNCHECKED = 0;
    private boolean broadcasting;

    @androidx.annotation.Nullable
    private android.graphics.drawable.Drawable buttonDrawable;

    @androidx.annotation.Nullable
    private android.graphics.drawable.Drawable buttonIconDrawable;

    @androidx.annotation.Nullable
    android.content.res.ColorStateList buttonIconTintList;

    @androidx.annotation.NonNull
    private android.graphics.PorterDuff.Mode buttonIconTintMode;

    @androidx.annotation.Nullable
    android.content.res.ColorStateList buttonTintList;
    private boolean centerIfNoTextEnabled;
    private int checkedState;
    private int[] currentStateChecked;

    @androidx.annotation.Nullable
    private java.lang.CharSequence customStateDescription;

    @androidx.annotation.Nullable
    private java.lang.CharSequence errorAccessibilityLabel;
    private boolean errorShown;

    @androidx.annotation.Nullable
    private android.content.res.ColorStateList materialThemeColorsTintList;

    @androidx.annotation.Nullable
    private android.widget.CompoundButton.OnCheckedChangeListener onCheckedChangeListener;

    @androidx.annotation.NonNull
    private final java.util.LinkedHashSet<com.google.android.material.checkbox.MaterialCheckBox.OnCheckedStateChangedListener> onCheckedStateChangedListeners;

    @androidx.annotation.NonNull
    private final java.util.LinkedHashSet<com.google.android.material.checkbox.MaterialCheckBox.OnErrorChangedListener> onErrorChangedListeners;

    @androidx.annotation.Nullable
    private final androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat transitionToUnchecked;
    private final androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback transitionToUncheckedCallback;
    private boolean useMaterialThemeColors;
    private boolean usingMaterialButtonDrawable;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public @interface CheckedState {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnCheckedStateChangedListener {
        void onCheckedStateChangedListener(@androidx.annotation.NonNull com.google.android.material.checkbox.MaterialCheckBox r1, int r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnErrorChangedListener {
        void onErrorChanged(@androidx.annotation.NonNull com.google.android.material.checkbox.MaterialCheckBox r1, boolean r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class SavedState extends android.view.View.BaseSavedState {

        @androidx.annotation.NonNull
        public static final android.os.Parcelable.Creator<com.google.android.material.checkbox.MaterialCheckBox.SavedState> CREATOR = null;
        int checkedState;


        static {
                com.google.android.material.checkbox.MaterialCheckBox$SavedState$1 r0 = new com.google.android.material.checkbox.MaterialCheckBox$SavedState$1
                r0.<init>()
                com.google.android.material.checkbox.MaterialCheckBox.SavedState.CREATOR = r0
                return
        }

        private SavedState(android.os.Parcel r2) {
                r1 = this;
                r1.<init>(r2)
                java.lang.Class r0 = r1.getClass()
                java.lang.ClassLoader r0 = r0.getClassLoader()
                java.lang.Object r2 = r2.readValue(r0)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r1.checkedState = r2
                return
        }

        /* synthetic */ SavedState(android.os.Parcel r1, com.google.android.material.checkbox.MaterialCheckBox.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        SavedState(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @androidx.annotation.NonNull
        private java.lang.String getCheckedStateString() {
                r2 = this;
                int r0 = r2.checkedState
                r1 = 1
                if (r0 == r1) goto Le
                r1 = 2
                if (r0 == r1) goto Lb
                java.lang.String r0 = "unchecked"
                return r0
            Lb:
                java.lang.String r0 = "indeterminate"
                return r0
            Le:
                java.lang.String r0 = "checked"
                return r0
        }

        @androidx.annotation.NonNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "MaterialCheckBox.SavedState{"
                r0.append(r1)
                int r1 = java.lang.System.identityHashCode(r2)
                java.lang.String r1 = java.lang.Integer.toHexString(r1)
                r0.append(r1)
                java.lang.String r1 = " CheckedState="
                r0.append(r1)
                java.lang.String r1 = r2.getCheckedStateString()
                r0.append(r1)
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                int r2 = r0.checkedState
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r1.writeValue(r2)
                return
        }
    }

    static {
            int r0 = com.google.android.material.R.style.Widget_MaterialComponents_CompoundButton_CheckBox
            com.google.android.material.checkbox.MaterialCheckBox.DEF_STYLE_RES = r0
            int r0 = com.google.android.material.R.attr.state_indeterminate
            int[] r0 = new int[]{r0}
            com.google.android.material.checkbox.MaterialCheckBox.INDETERMINATE_STATE_SET = r0
            int r0 = com.google.android.material.R.attr.state_error
            int[] r1 = new int[]{r0}
            com.google.android.material.checkbox.MaterialCheckBox.ERROR_STATE_SET = r1
            r1 = 16842910(0x101009e, float:2.3694E-38)
            int[] r0 = new int[]{r1, r0}
            r2 = 5
            int[][] r2 = new int[r2][]
            r3 = 0
            r2[r3] = r0
            r0 = 16842912(0x10100a0, float:2.3694006E-38)
            int[] r3 = new int[]{r1, r0}
            r4 = 1
            r2[r4] = r3
            r3 = -16842912(0xfffffffffefeff60, float:-1.6947495E38)
            int[] r1 = new int[]{r1, r3}
            r4 = 2
            r2[r4] = r1
            r1 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            int[] r0 = new int[]{r1, r0}
            r4 = 3
            r2[r4] = r0
            int[] r0 = new int[]{r1, r3}
            r1 = 4
            r2[r1] = r0
            com.google.android.material.checkbox.MaterialCheckBox.CHECKBOX_STATES = r2
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            java.lang.String r1 = "drawable"
            java.lang.String r2 = "android"
            java.lang.String r3 = "btn_check_material_anim"
            int r0 = r0.getIdentifier(r3, r1, r2)
            com.google.android.material.checkbox.MaterialCheckBox.FRAMEWORK_BUTTON_DRAWABLE_RES_ID = r0
            return
    }

    public MaterialCheckBox(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public MaterialCheckBox(android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.R.attr.checkboxStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public MaterialCheckBox(android.content.Context r8, @androidx.annotation.Nullable android.util.AttributeSet r9, int r10) {
            r7 = this;
            int r4 = com.google.android.material.checkbox.MaterialCheckBox.DEF_STYLE_RES
            android.content.Context r8 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
            r7.onErrorChangedListeners = r8
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
            r7.onCheckedStateChangedListeners = r8
            android.content.Context r8 = r7.getContext()
            int r0 = com.google.android.material.R.drawable.mtrl_checkbox_button_checked_unchecked
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat r8 = androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.create(r8, r0)
            r7.transitionToUnchecked = r8
            com.google.android.material.checkbox.MaterialCheckBox$1 r8 = new com.google.android.material.checkbox.MaterialCheckBox$1
            r8.<init>(r7)
            r7.transitionToUncheckedCallback = r8
            android.content.Context r0 = r7.getContext()
            android.graphics.drawable.Drawable r8 = androidx.core.widget.CompoundButtonCompat.getButtonDrawable(r7)
            r7.buttonDrawable = r8
            android.content.res.ColorStateList r8 = r7.getSuperButtonTintList()
            r7.buttonTintList = r8
            r8 = 0
            r7.setSupportButtonTintList(r8)
            int[] r2 = com.google.android.material.R.styleable.MaterialCheckBox
            r6 = 0
            int[] r5 = new int[r6]
            r1 = r9
            r3 = r10
            androidx.appcompat.widget.TintTypedArray r9 = com.google.android.material.internal.ThemeEnforcement.obtainTintedStyledAttributes(r0, r1, r2, r3, r4, r5)
            int r10 = com.google.android.material.R.styleable.MaterialCheckBox_buttonIcon
            android.graphics.drawable.Drawable r10 = r9.getDrawable(r10)
            r7.buttonIconDrawable = r10
            android.graphics.drawable.Drawable r10 = r7.buttonDrawable
            r1 = 1
            if (r10 == 0) goto L7b
            boolean r10 = com.google.android.material.internal.ThemeEnforcement.isMaterial3Theme(r0)
            if (r10 == 0) goto L7b
            boolean r10 = r7.isButtonDrawableLegacy(r9)
            if (r10 == 0) goto L7b
            super.setButtonDrawable(r8)
            int r8 = com.google.android.material.R.drawable.mtrl_checkbox_button
            android.graphics.drawable.Drawable r8 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r8)
            r7.buttonDrawable = r8
            r7.usingMaterialButtonDrawable = r1
            android.graphics.drawable.Drawable r8 = r7.buttonIconDrawable
            if (r8 != 0) goto L7b
            int r8 = com.google.android.material.R.drawable.mtrl_checkbox_button_icon
            android.graphics.drawable.Drawable r8 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r8)
            r7.buttonIconDrawable = r8
        L7b:
            int r8 = com.google.android.material.R.styleable.MaterialCheckBox_buttonIconTint
            android.content.res.ColorStateList r8 = com.google.android.material.resources.MaterialResources.getColorStateList(r0, r9, r8)
            r7.buttonIconTintList = r8
            int r8 = com.google.android.material.R.styleable.MaterialCheckBox_buttonIconTintMode
            r10 = -1
            int r8 = r9.getInt(r8, r10)
            android.graphics.PorterDuff$Mode r10 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r8 = com.google.android.material.internal.ViewUtils.parseTintMode(r8, r10)
            r7.buttonIconTintMode = r8
            int r8 = com.google.android.material.R.styleable.MaterialCheckBox_useMaterialThemeColors
            boolean r8 = r9.getBoolean(r8, r6)
            r7.useMaterialThemeColors = r8
            int r8 = com.google.android.material.R.styleable.MaterialCheckBox_centerIfNoTextEnabled
            boolean r8 = r9.getBoolean(r8, r1)
            r7.centerIfNoTextEnabled = r8
            int r8 = com.google.android.material.R.styleable.MaterialCheckBox_errorShown
            boolean r8 = r9.getBoolean(r8, r6)
            r7.errorShown = r8
            int r8 = com.google.android.material.R.styleable.MaterialCheckBox_errorAccessibilityLabel
            java.lang.CharSequence r8 = r9.getText(r8)
            r7.errorAccessibilityLabel = r8
            int r8 = com.google.android.material.R.styleable.MaterialCheckBox_checkedState
            boolean r10 = r9.hasValue(r8)
            if (r10 == 0) goto Lc1
            int r8 = r9.getInt(r8, r6)
            r7.setCheckedState(r8)
        Lc1:
            r9.recycle()
            r7.refreshButtonDrawable()
            return
    }

    public static /* synthetic */ void a(com.google.android.material.checkbox.MaterialCheckBox r0) {
            android.graphics.drawable.Drawable r0 = r0.buttonIconDrawable
            r0.jumpToCurrentState()
            return
    }

    static /* synthetic */ int[] access$000(com.google.android.material.checkbox.MaterialCheckBox r0) {
            int[] r0 = r0.currentStateChecked
            return r0
    }

    @androidx.annotation.NonNull
    private java.lang.String getButtonStateDescription() {
            r2 = this;
            int r0 = r2.checkedState
            r1 = 1
            if (r0 != r1) goto L10
            android.content.res.Resources r0 = r2.getResources()
            int r1 = com.google.android.material.R.string.mtrl_checkbox_state_description_checked
            java.lang.String r0 = r0.getString(r1)
            return r0
        L10:
            if (r0 != 0) goto L1d
            android.content.res.Resources r0 = r2.getResources()
            int r1 = com.google.android.material.R.string.mtrl_checkbox_state_description_unchecked
            java.lang.String r0 = r0.getString(r1)
            return r0
        L1d:
            android.content.res.Resources r0 = r2.getResources()
            int r1 = com.google.android.material.R.string.mtrl_checkbox_state_description_indeterminate
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    private android.content.res.ColorStateList getMaterialThemeColorsTintList() {
            r8 = this;
            android.content.res.ColorStateList r0 = r8.materialThemeColorsTintList
            if (r0 != 0) goto L53
            int[][] r0 = com.google.android.material.checkbox.MaterialCheckBox.CHECKBOX_STATES
            int r1 = r0.length
            int[] r1 = new int[r1]
            int r2 = com.google.android.material.R.attr.colorControlActivated
            int r2 = com.google.android.material.color.MaterialColors.getColor(r8, r2)
            int r3 = com.google.android.material.R.attr.colorError
            int r3 = com.google.android.material.color.MaterialColors.getColor(r8, r3)
            int r4 = com.google.android.material.R.attr.colorSurface
            int r4 = com.google.android.material.color.MaterialColors.getColor(r8, r4)
            int r5 = com.google.android.material.R.attr.colorOnSurface
            int r5 = com.google.android.material.color.MaterialColors.getColor(r8, r5)
            r6 = 0
            r7 = 1065353216(0x3f800000, float:1.0)
            int r3 = com.google.android.material.color.MaterialColors.layer(r4, r3, r7)
            r1[r6] = r3
            r3 = 1
            int r2 = com.google.android.material.color.MaterialColors.layer(r4, r2, r7)
            r1[r3] = r2
            r2 = 1057635697(0x3f0a3d71, float:0.54)
            int r2 = com.google.android.material.color.MaterialColors.layer(r4, r5, r2)
            r3 = 2
            r1[r3] = r2
            r2 = 3
            r3 = 1052938076(0x3ec28f5c, float:0.38)
            int r6 = com.google.android.material.color.MaterialColors.layer(r4, r5, r3)
            r1[r2] = r6
            r2 = 4
            int r3 = com.google.android.material.color.MaterialColors.layer(r4, r5, r3)
            r1[r2] = r3
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            r2.<init>(r0, r1)
            r8.materialThemeColorsTintList = r2
        L53:
            android.content.res.ColorStateList r0 = r8.materialThemeColorsTintList
            return r0
    }

    @androidx.annotation.Nullable
    private android.content.res.ColorStateList getSuperButtonTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.buttonTintList
            if (r0 == 0) goto L5
            return r0
        L5:
            android.content.res.ColorStateList r0 = super/*android.widget.CheckBox*/.getButtonTintList()
            if (r0 == 0) goto L10
            android.content.res.ColorStateList r0 = super/*android.widget.CheckBox*/.getButtonTintList()
            return r0
        L10:
            android.content.res.ColorStateList r0 = r1.getSupportButtonTintList()
            return r0
    }

    private boolean isButtonDrawableLegacy(androidx.appcompat.widget.TintTypedArray r4) {
            r3 = this;
            int r0 = com.google.android.material.R.styleable.MaterialCheckBox_android_button
            r1 = 0
            int r0 = r4.getResourceId(r0, r1)
            int r2 = com.google.android.material.R.styleable.MaterialCheckBox_buttonCompat
            int r4 = r4.getResourceId(r2, r1)
            int r2 = com.google.android.material.checkbox.MaterialCheckBox.FRAMEWORK_BUTTON_DRAWABLE_RES_ID
            if (r0 != r2) goto L15
            if (r4 != 0) goto L15
            r4 = 1
            return r4
        L15:
            return r1
    }

    private void refreshButtonDrawable() {
            r3 = this;
            android.graphics.drawable.Drawable r0 = r3.buttonDrawable
            android.content.res.ColorStateList r1 = r3.buttonTintList
            android.graphics.PorterDuff$Mode r2 = androidx.core.widget.CompoundButtonCompat.getButtonTintMode(r3)
            android.graphics.drawable.Drawable r0 = com.google.android.material.drawable.DrawableUtils.createTintableMutatedDrawableIfNeeded(r0, r1, r2)
            r3.buttonDrawable = r0
            android.graphics.drawable.Drawable r0 = r3.buttonIconDrawable
            android.content.res.ColorStateList r1 = r3.buttonIconTintList
            android.graphics.PorterDuff$Mode r2 = r3.buttonIconTintMode
            android.graphics.drawable.Drawable r0 = com.google.android.material.drawable.DrawableUtils.createTintableMutatedDrawableIfNeeded(r0, r1, r2)
            r3.buttonIconDrawable = r0
            r3.setUpDefaultButtonDrawableAnimationIfNeeded()
            r3.updateButtonTints()
            android.graphics.drawable.Drawable r0 = r3.buttonDrawable
            android.graphics.drawable.Drawable r1 = r3.buttonIconDrawable
            android.graphics.drawable.Drawable r0 = com.google.android.material.drawable.DrawableUtils.compositeTwoLayeredDrawable(r0, r1)
            super.setButtonDrawable(r0)
            r3.refreshDrawableState()
            return
    }

    private void setDefaultStateDescription() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L11
            java.lang.CharSequence r0 = r2.customStateDescription
            if (r0 != 0) goto L11
            java.lang.String r0 = r2.getButtonStateDescription()
            super/*android.widget.CheckBox*/.setStateDescription(r0)
        L11:
            return
    }

    private void setUpDefaultButtonDrawableAnimationIfNeeded() {
            r5 = this;
            boolean r0 = r5.usingMaterialButtonDrawable
            if (r0 != 0) goto L5
            goto L3a
        L5:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat r0 = r5.transitionToUnchecked
            if (r0 == 0) goto L15
            androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback r1 = r5.transitionToUncheckedCallback
            r0.unregisterAnimationCallback(r1)
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat r0 = r5.transitionToUnchecked
            androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback r1 = r5.transitionToUncheckedCallback
            r0.registerAnimationCallback(r1)
        L15:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L3a
            android.graphics.drawable.Drawable r0 = r5.buttonDrawable
            boolean r1 = r0 instanceof android.graphics.drawable.AnimatedStateListDrawable
            if (r1 == 0) goto L3a
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat r1 = r5.transitionToUnchecked
            if (r1 == 0) goto L3a
            android.graphics.drawable.AnimatedStateListDrawable r0 = (android.graphics.drawable.AnimatedStateListDrawable) r0
            int r2 = com.google.android.material.R.id.checked
            int r3 = com.google.android.material.R.id.unchecked
            r4 = 0
            r0.addTransition(r2, r3, r1, r4)
            android.graphics.drawable.Drawable r0 = r5.buttonDrawable
            android.graphics.drawable.AnimatedStateListDrawable r0 = (android.graphics.drawable.AnimatedStateListDrawable) r0
            int r1 = com.google.android.material.R.id.indeterminate
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat r2 = r5.transitionToUnchecked
            r0.addTransition(r1, r3, r2, r4)
        L3a:
            return
    }

    private void updateButtonTints() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.buttonDrawable
            if (r0 == 0) goto Lb
            android.content.res.ColorStateList r1 = r2.buttonTintList
            if (r1 == 0) goto Lb
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r0, r1)
        Lb:
            android.graphics.drawable.Drawable r0 = r2.buttonIconDrawable
            if (r0 == 0) goto L16
            android.content.res.ColorStateList r1 = r2.buttonIconTintList
            if (r1 == 0) goto L16
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r0, r1)
        L16:
            return
    }

    private void updateIconTintIfNeeded() {
            r0 = this;
            return
    }

    public void addOnCheckedStateChangedListener(@androidx.annotation.NonNull com.google.android.material.checkbox.MaterialCheckBox.OnCheckedStateChangedListener r2) {
            r1 = this;
            java.util.LinkedHashSet<com.google.android.material.checkbox.MaterialCheckBox$OnCheckedStateChangedListener> r0 = r1.onCheckedStateChangedListeners
            r0.add(r2)
            return
    }

    public void addOnErrorChangedListener(@androidx.annotation.NonNull com.google.android.material.checkbox.MaterialCheckBox.OnErrorChangedListener r2) {
            r1 = this;
            java.util.LinkedHashSet<com.google.android.material.checkbox.MaterialCheckBox$OnErrorChangedListener> r0 = r1.onErrorChangedListeners
            r0.add(r2)
            return
    }

    public void clearOnCheckedStateChangedListeners() {
            r1 = this;
            java.util.LinkedHashSet<com.google.android.material.checkbox.MaterialCheckBox$OnCheckedStateChangedListener> r0 = r1.onCheckedStateChangedListeners
            r0.clear()
            return
    }

    public void clearOnErrorChangedListeners() {
            r1 = this;
            java.util.LinkedHashSet<com.google.android.material.checkbox.MaterialCheckBox$OnErrorChangedListener> r0 = r1.onErrorChangedListeners
            r0.clear()
            return
    }

    @androidx.annotation.Nullable
    public android.graphics.drawable.Drawable getButtonDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.buttonDrawable
            return r0
    }

    @androidx.annotation.Nullable
    public android.graphics.drawable.Drawable getButtonIconDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.buttonIconDrawable
            return r0
    }

    @androidx.annotation.Nullable
    public android.content.res.ColorStateList getButtonIconTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.buttonIconTintList
            return r0
    }

    @androidx.annotation.NonNull
    public android.graphics.PorterDuff.Mode getButtonIconTintMode() {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.buttonIconTintMode
            return r0
    }

    @androidx.annotation.Nullable
    public android.content.res.ColorStateList getButtonTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.buttonTintList
            return r0
    }

    public int getCheckedState() {
            r1 = this;
            int r0 = r1.checkedState
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.CharSequence getErrorAccessibilityLabel() {
            r1 = this;
            java.lang.CharSequence r0 = r1.errorAccessibilityLabel
            return r0
    }

    public boolean isCenterIfNoTextEnabled() {
            r1 = this;
            boolean r0 = r1.centerIfNoTextEnabled
            return r0
    }

    public boolean isChecked() {
            r2 = this;
            int r0 = r2.checkedState
            r1 = 1
            if (r0 != r1) goto L6
            return r1
        L6:
            r0 = 0
            return r0
    }

    public boolean isErrorShown() {
            r1 = this;
            boolean r0 = r1.errorShown
            return r0
    }

    public boolean isUseMaterialThemeColors() {
            r1 = this;
            boolean r0 = r1.useMaterialThemeColors
            return r0
    }

    protected void onAttachedToWindow() {
            r1 = this;
            super/*android.widget.CheckBox*/.onAttachedToWindow()
            boolean r0 = r1.useMaterialThemeColors
            if (r0 == 0) goto L13
            android.content.res.ColorStateList r0 = r1.buttonTintList
            if (r0 != 0) goto L13
            android.content.res.ColorStateList r0 = r1.buttonIconTintList
            if (r0 != 0) goto L13
            r0 = 1
            r1.setUseMaterialThemeColors(r0)
        L13:
            return
    }

    protected int[] onCreateDrawableState(int r3) {
            r2 = this;
            r0 = 2
            int r3 = r3 + r0
            int[] r3 = super/*android.widget.CheckBox*/.onCreateDrawableState(r3)
            int r1 = r2.getCheckedState()
            if (r1 != r0) goto L11
            int[] r0 = com.google.android.material.checkbox.MaterialCheckBox.INDETERMINATE_STATE_SET
            android.view.View.mergeDrawableStates(r3, r0)
        L11:
            boolean r0 = r2.isErrorShown()
            if (r0 == 0) goto L1c
            int[] r0 = com.google.android.material.checkbox.MaterialCheckBox.ERROR_STATE_SET
            android.view.View.mergeDrawableStates(r3, r0)
        L1c:
            int[] r0 = com.google.android.material.drawable.DrawableUtils.getCheckedState(r3)
            r2.currentStateChecked = r0
            r2.updateIconTintIfNeeded()
            return r3
    }

    protected void onDraw(android.graphics.Canvas r6) {
            r5 = this;
            boolean r0 = r5.centerIfNoTextEnabled
            if (r0 == 0) goto L55
            java.lang.CharSequence r0 = r5.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L55
            android.graphics.drawable.Drawable r0 = androidx.core.widget.CompoundButtonCompat.getButtonDrawable(r5)
            if (r0 == 0) goto L55
            boolean r1 = com.google.android.material.internal.ViewUtils.isLayoutRtl(r5)
            if (r1 == 0) goto L1c
            r1 = -1
            goto L1d
        L1c:
            r1 = 1
        L1d:
            int r2 = r5.getWidth()
            int r3 = r0.getIntrinsicWidth()
            int r2 = r2 - r3
            int r2 = r2 / 2
            int r2 = r2 * r1
            int r1 = r6.save()
            float r3 = (float) r2
            r4 = 0
            r6.translate(r3, r4)
            super/*android.widget.CheckBox*/.onDraw(r6)
            r6.restoreToCount(r1)
            android.graphics.drawable.Drawable r6 = r5.getBackground()
            if (r6 == 0) goto L54
            android.graphics.Rect r6 = r0.getBounds()
            android.graphics.drawable.Drawable r0 = r5.getBackground()
            int r1 = r6.left
            int r1 = r1 + r2
            int r3 = r6.top
            int r4 = r6.right
            int r4 = r4 + r2
            int r6 = r6.bottom
            androidx.core.graphics.drawable.DrawableCompat.setHotspotBounds(r0, r1, r3, r4, r6)
        L54:
            return
        L55:
            super/*android.widget.CheckBox*/.onDraw(r6)
            return
    }

    public void onInitializeAccessibilityNodeInfo(@androidx.annotation.Nullable android.view.accessibility.AccessibilityNodeInfo r3) {
            r2 = this;
            super/*android.widget.CheckBox*/.onInitializeAccessibilityNodeInfo(r3)
            if (r3 != 0) goto L6
            goto L29
        L6:
            boolean r0 = r2.isErrorShown()
            if (r0 == 0) goto L29
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.CharSequence r1 = r3.getText()
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            java.lang.CharSequence r1 = r2.errorAccessibilityLabel
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.setText(r0)
        L29:
            return
    }

    public void onRestoreInstanceState(@androidx.annotation.Nullable android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.material.checkbox.MaterialCheckBox.SavedState
            if (r0 != 0) goto L8
            super/*android.widget.CheckBox*/.onRestoreInstanceState(r2)
            return
        L8:
            com.google.android.material.checkbox.MaterialCheckBox$SavedState r2 = (com.google.android.material.checkbox.MaterialCheckBox.SavedState) r2
            android.os.Parcelable r0 = r2.getSuperState()
            super/*android.widget.CheckBox*/.onRestoreInstanceState(r0)
            int r2 = r2.checkedState
            r1.setCheckedState(r2)
            return
    }

    @androidx.annotation.Nullable
    public android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            android.os.Parcelable r0 = super/*android.widget.CheckBox*/.onSaveInstanceState()
            com.google.android.material.checkbox.MaterialCheckBox$SavedState r1 = new com.google.android.material.checkbox.MaterialCheckBox$SavedState
            r1.<init>(r0)
            int r0 = r2.getCheckedState()
            r1.checkedState = r0
            return r1
    }

    public void removeOnCheckedStateChangedListener(@androidx.annotation.NonNull com.google.android.material.checkbox.MaterialCheckBox.OnCheckedStateChangedListener r2) {
            r1 = this;
            java.util.LinkedHashSet<com.google.android.material.checkbox.MaterialCheckBox$OnCheckedStateChangedListener> r0 = r1.onCheckedStateChangedListeners
            r0.remove(r2)
            return
    }

    public void removeOnErrorChangedListener(@androidx.annotation.NonNull com.google.android.material.checkbox.MaterialCheckBox.OnErrorChangedListener r2) {
            r1 = this;
            java.util.LinkedHashSet<com.google.android.material.checkbox.MaterialCheckBox$OnErrorChangedListener> r0 = r1.onErrorChangedListeners
            r0.remove(r2)
            return
    }

    public void setButtonDrawable(@androidx.annotation.DrawableRes int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r2)
            r1.setButtonDrawable(r2)
            return
    }

    public void setButtonDrawable(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.buttonDrawable = r1
            r1 = 0
            r0.usingMaterialButtonDrawable = r1
            r0.refreshButtonDrawable()
            return
    }

    public void setButtonIconDrawable(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.buttonIconDrawable = r1
            r0.refreshButtonDrawable()
            return
    }

    public void setButtonIconDrawableResource(@androidx.annotation.DrawableRes int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r2)
            r1.setButtonIconDrawable(r2)
            return
    }

    public void setButtonIconTintList(@androidx.annotation.Nullable android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.buttonIconTintList
            if (r0 != r2) goto L5
            return
        L5:
            r1.buttonIconTintList = r2
            r1.refreshButtonDrawable()
            return
    }

    public void setButtonIconTintMode(@androidx.annotation.NonNull android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.buttonIconTintMode
            if (r0 != r2) goto L5
            return
        L5:
            r1.buttonIconTintMode = r2
            r1.refreshButtonDrawable()
            return
    }

    public void setButtonTintList(@androidx.annotation.Nullable android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.buttonTintList
            if (r0 != r2) goto L5
            return
        L5:
            r1.buttonTintList = r2
            r1.refreshButtonDrawable()
            return
    }

    public void setButtonTintMode(@androidx.annotation.Nullable android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            r0.setSupportButtonTintMode(r1)
            r0.refreshButtonDrawable()
            return
    }

    public void setCenterIfNoTextEnabled(boolean r1) {
            r0 = this;
            r0.centerIfNoTextEnabled = r1
            return
    }

    public void setChecked(boolean r1) {
            r0 = this;
            r0.setCheckedState(r1)
            return
    }

    public void setCheckedState(int r4) {
            r3 = this;
            int r0 = r3.checkedState
            if (r0 == r4) goto L64
            r3.checkedState = r4
            r0 = 0
            r1 = 1
            if (r4 != r1) goto Lc
            r4 = 1
            goto Ld
        Lc:
            r4 = 0
        Ld:
            super/*android.widget.CheckBox*/.setChecked(r4)
            r3.refreshDrawableState()
            r3.setDefaultStateDescription()
            boolean r4 = r3.broadcasting
            if (r4 == 0) goto L1b
            goto L64
        L1b:
            r3.broadcasting = r1
            java.util.LinkedHashSet<com.google.android.material.checkbox.MaterialCheckBox$OnCheckedStateChangedListener> r4 = r3.onCheckedStateChangedListeners
            if (r4 == 0) goto L37
            java.util.Iterator r4 = r4.iterator()
        L25:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L37
            java.lang.Object r1 = r4.next()
            com.google.android.material.checkbox.MaterialCheckBox$OnCheckedStateChangedListener r1 = (com.google.android.material.checkbox.MaterialCheckBox.OnCheckedStateChangedListener) r1
            int r2 = r3.checkedState
            r1.onCheckedStateChangedListener(r3, r2)
            goto L25
        L37:
            int r4 = r3.checkedState
            r1 = 2
            if (r4 == r1) goto L47
            android.widget.CompoundButton$OnCheckedChangeListener r4 = r3.onCheckedChangeListener
            if (r4 == 0) goto L47
            boolean r1 = r3.isChecked()
            r4.onCheckedChanged(r3, r1)
        L47:
            int r4 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r4 < r1) goto L62
            android.content.Context r4 = r3.getContext()
            java.lang.Class r1 = com.google.android.material.checkbox.a.a()
            java.lang.Object r4 = androidx.core.content.pm.z0.a(r4, r1)
            android.view.autofill.AutofillManager r4 = com.google.android.material.checkbox.b.a(r4)
            if (r4 == 0) goto L62
            com.google.android.material.checkbox.c.a(r4, r3)
        L62:
            r3.broadcasting = r0
        L64:
            return
    }

    public void setEnabled(boolean r1) {
            r0 = this;
            super/*android.widget.CheckBox*/.setEnabled(r1)
            r0.updateIconTintIfNeeded()
            return
    }

    public void setErrorAccessibilityLabel(@androidx.annotation.Nullable java.lang.CharSequence r1) {
            r0 = this;
            r0.errorAccessibilityLabel = r1
            return
    }

    public void setErrorAccessibilityLabelResource(@androidx.annotation.StringRes int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.res.Resources r0 = r1.getResources()
            java.lang.CharSequence r2 = r0.getText(r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setErrorAccessibilityLabel(r2)
            return
    }

    public void setErrorShown(boolean r3) {
            r2 = this;
            boolean r0 = r2.errorShown
            if (r0 != r3) goto L5
            goto L22
        L5:
            r2.errorShown = r3
            r2.refreshDrawableState()
            java.util.LinkedHashSet<com.google.android.material.checkbox.MaterialCheckBox$OnErrorChangedListener> r3 = r2.onErrorChangedListeners
            java.util.Iterator r3 = r3.iterator()
        L10:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r3.next()
            com.google.android.material.checkbox.MaterialCheckBox$OnErrorChangedListener r0 = (com.google.android.material.checkbox.MaterialCheckBox.OnErrorChangedListener) r0
            boolean r1 = r2.errorShown
            r0.onErrorChanged(r2, r1)
            goto L10
        L22:
            return
    }

    public void setOnCheckedChangeListener(@androidx.annotation.Nullable android.widget.CompoundButton.OnCheckedChangeListener r1) {
            r0 = this;
            r0.onCheckedChangeListener = r1
            return
    }

    @androidx.annotation.RequiresApi(30)
    public void setStateDescription(@androidx.annotation.Nullable java.lang.CharSequence r1) {
            r0 = this;
            r0.customStateDescription = r1
            if (r1 != 0) goto L8
            r0.setDefaultStateDescription()
            return
        L8:
            super/*android.widget.CheckBox*/.setStateDescription(r1)
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

    public void toggle() {
            r1 = this;
            boolean r0 = r1.isChecked()
            r0 = r0 ^ 1
            r1.setChecked(r0)
            return
    }
}
