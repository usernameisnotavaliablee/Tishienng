package com.google.android.material.textfield;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class PasswordToggleEndIconDelegate extends com.google.android.material.textfield.EndIconDelegate {

    @androidx.annotation.Nullable
    private android.widget.EditText editText;
    private int iconResId;
    private final android.view.View.OnClickListener onIconClickListener;

    PasswordToggleEndIconDelegate(@androidx.annotation.NonNull com.google.android.material.textfield.EndCompoundLayout r1, @androidx.annotation.DrawableRes int r2) {
            r0 = this;
            r0.<init>(r1)
            int r1 = com.google.android.material.R.drawable.design_password_eye
            r0.iconResId = r1
            com.google.android.material.textfield.n r1 = new com.google.android.material.textfield.n
            r1.<init>(r0)
            r0.onIconClickListener = r1
            if (r2 == 0) goto L12
            r0.iconResId = r2
        L12:
            return
    }

    public static /* synthetic */ void a(com.google.android.material.textfield.PasswordToggleEndIconDelegate r2, android.view.View r3) {
            android.widget.EditText r3 = r2.editText
            if (r3 != 0) goto L5
            return
        L5:
            int r3 = r3.getSelectionEnd()
            boolean r0 = r2.hasPasswordTransformation()
            if (r0 == 0) goto L16
            android.widget.EditText r0 = r2.editText
            r1 = 0
            r0.setTransformationMethod(r1)
            goto L1f
        L16:
            android.widget.EditText r0 = r2.editText
            android.text.method.PasswordTransformationMethod r1 = android.text.method.PasswordTransformationMethod.getInstance()
            r0.setTransformationMethod(r1)
        L1f:
            if (r3 < 0) goto L26
            android.widget.EditText r0 = r2.editText
            r0.setSelection(r3)
        L26:
            r2.refreshIconState()
            return
    }

    private boolean hasPasswordTransformation() {
            r1 = this;
            android.widget.EditText r0 = r1.editText
            if (r0 == 0) goto Le
            android.text.method.TransformationMethod r0 = r0.getTransformationMethod()
            boolean r0 = r0 instanceof android.text.method.PasswordTransformationMethod
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    private static boolean isInputTypePassword(android.widget.EditText r2) {
            if (r2 == 0) goto L24
            int r0 = r2.getInputType()
            r1 = 16
            if (r0 == r1) goto L22
            int r0 = r2.getInputType()
            r1 = 128(0x80, float:1.8E-43)
            if (r0 == r1) goto L22
            int r0 = r2.getInputType()
            r1 = 144(0x90, float:2.02E-43)
            if (r0 == r1) goto L22
            int r2 = r2.getInputType()
            r0 = 224(0xe0, float:3.14E-43)
            if (r2 != r0) goto L24
        L22:
            r2 = 1
            return r2
        L24:
            r2 = 0
            return r2
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    void beforeEditTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            r0.refreshIconState()
            return
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    @androidx.annotation.StringRes
    int getIconContentDescriptionResId() {
            r1 = this;
            int r0 = com.google.android.material.R.string.password_toggle_content_description
            return r0
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    @androidx.annotation.DrawableRes
    int getIconDrawableResId() {
            r1 = this;
            int r0 = r1.iconResId
            return r0
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    android.view.View.OnClickListener getOnIconClickListener() {
            r1 = this;
            android.view.View$OnClickListener r0 = r1.onIconClickListener
            return r0
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    boolean isIconCheckable() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    boolean isIconChecked() {
            r1 = this;
            boolean r0 = r1.hasPasswordTransformation()
            r0 = r0 ^ 1
            return r0
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    void onEditTextAttached(@androidx.annotation.Nullable android.widget.EditText r1) {
            r0 = this;
            r0.editText = r1
            r0.refreshIconState()
            return
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    void setUp() {
            r2 = this;
            android.widget.EditText r0 = r2.editText
            boolean r0 = isInputTypePassword(r0)
            if (r0 == 0) goto L11
            android.widget.EditText r0 = r2.editText
            android.text.method.PasswordTransformationMethod r1 = android.text.method.PasswordTransformationMethod.getInstance()
            r0.setTransformationMethod(r1)
        L11:
            return
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    void tearDown() {
            r2 = this;
            android.widget.EditText r0 = r2.editText
            if (r0 == 0) goto Lb
            android.text.method.PasswordTransformationMethod r1 = android.text.method.PasswordTransformationMethod.getInstance()
            r0.setTransformationMethod(r1)
        Lb:
            return
    }
}
