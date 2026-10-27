package com.google.android.material.textfield;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
abstract class EndIconDelegate {
    final android.content.Context context;
    final com.google.android.material.internal.CheckableImageButton endIconView;
    final com.google.android.material.textfield.EndCompoundLayout endLayout;
    final com.google.android.material.textfield.TextInputLayout textInputLayout;

    EndIconDelegate(@androidx.annotation.NonNull com.google.android.material.textfield.EndCompoundLayout r2) {
            r1 = this;
            r1.<init>()
            com.google.android.material.textfield.TextInputLayout r0 = r2.textInputLayout
            r1.textInputLayout = r0
            r1.endLayout = r2
            android.content.Context r0 = r2.getContext()
            r1.context = r0
            com.google.android.material.internal.CheckableImageButton r2 = r2.getEndIconView()
            r1.endIconView = r2
            return
    }

    void afterEditTextChanged(android.text.Editable r1) {
            r0 = this;
            return
    }

    void beforeEditTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }

    @androidx.annotation.StringRes
    int getIconContentDescriptionResId() {
            r1 = this;
            r0 = 0
            return r0
    }

    @androidx.annotation.DrawableRes
    int getIconDrawableResId() {
            r1 = this;
            r0 = 0
            return r0
    }

    android.view.View.OnFocusChangeListener getOnEditTextFocusChangeListener() {
            r1 = this;
            r0 = 0
            return r0
    }

    android.view.View.OnClickListener getOnIconClickListener() {
            r1 = this;
            r0 = 0
            return r0
    }

    android.view.View.OnFocusChangeListener getOnIconViewFocusChangeListener() {
            r1 = this;
            r0 = 0
            return r0
    }

    androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener getTouchExplorationStateChangeListener() {
            r1 = this;
            r0 = 0
            return r0
    }

    boolean isBoxBackgroundModeSupported(int r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    boolean isIconActivable() {
            r1 = this;
            r0 = 0
            return r0
    }

    boolean isIconActivated() {
            r1 = this;
            r0 = 0
            return r0
    }

    boolean isIconCheckable() {
            r1 = this;
            r0 = 0
            return r0
    }

    boolean isIconChecked() {
            r1 = this;
            r0 = 0
            return r0
    }

    void onEditTextAttached(@androidx.annotation.Nullable android.widget.EditText r1) {
            r0 = this;
            return
    }

    void onInitializeAccessibilityNodeInfo(android.view.View r1, @androidx.annotation.NonNull androidx.core.view.accessibility.AccessibilityNodeInfoCompat r2) {
            r0 = this;
            return
    }

    void onPopulateAccessibilityEvent(android.view.View r1, @androidx.annotation.NonNull android.view.accessibility.AccessibilityEvent r2) {
            r0 = this;
            return
    }

    void onSuffixVisibilityChanged(boolean r1) {
            r0 = this;
            return
    }

    final void refreshIconState() {
            r2 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r2.endLayout
            r1 = 0
            r0.refreshIconState(r1)
            return
    }

    void setUp() {
            r0 = this;
            return
    }

    boolean shouldTintIconOnError() {
            r1 = this;
            r0 = 0
            return r0
    }

    void tearDown() {
            r0 = this;
            return
    }
}
