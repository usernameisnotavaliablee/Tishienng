package com.google.android.material.theme;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class MaterialComponentsViewInflater extends androidx.appcompat.app.AppCompatViewInflater {
    public MaterialComponentsViewInflater() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    protected androidx.appcompat.widget.AppCompatAutoCompleteTextView createAutoCompleteTextView(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            com.google.android.material.textfield.MaterialAutoCompleteTextView r0 = new com.google.android.material.textfield.MaterialAutoCompleteTextView
            r0.<init>(r2, r3)
            return r0
    }

    @androidx.annotation.NonNull
    protected androidx.appcompat.widget.AppCompatButton createButton(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull android.util.AttributeSet r3) {
            r1 = this;
            com.google.android.material.button.MaterialButton r0 = new com.google.android.material.button.MaterialButton
            r0.<init>(r2, r3)
            return r0
    }

    @androidx.annotation.NonNull
    protected androidx.appcompat.widget.AppCompatCheckBox createCheckBox(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            com.google.android.material.checkbox.MaterialCheckBox r0 = new com.google.android.material.checkbox.MaterialCheckBox
            r0.<init>(r2, r3)
            return r0
    }

    @androidx.annotation.NonNull
    protected androidx.appcompat.widget.AppCompatRadioButton createRadioButton(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            com.google.android.material.radiobutton.MaterialRadioButton r0 = new com.google.android.material.radiobutton.MaterialRadioButton
            r0.<init>(r2, r3)
            return r0
    }

    @androidx.annotation.NonNull
    protected androidx.appcompat.widget.AppCompatTextView createTextView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            com.google.android.material.textview.MaterialTextView r0 = new com.google.android.material.textview.MaterialTextView
            r0.<init>(r2, r3)
            return r0
    }
}
