package androidx.databinding.adapters;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.databinding.BindingMethods({@androidx.databinding.BindingMethod(attribute = "android:autoLink", method = "setAutoLinkMask", type = android.widget.TextView.class), @androidx.databinding.BindingMethod(attribute = "android:drawablePadding", method = "setCompoundDrawablePadding", type = android.widget.TextView.class), @androidx.databinding.BindingMethod(attribute = "android:editorExtras", method = "setInputExtras", type = android.widget.TextView.class), @androidx.databinding.BindingMethod(attribute = "android:inputType", method = "setRawInputType", type = android.widget.TextView.class), @androidx.databinding.BindingMethod(attribute = "android:scrollHorizontally", method = "setHorizontallyScrolling", type = android.widget.TextView.class), @androidx.databinding.BindingMethod(attribute = "android:textAllCaps", method = "setAllCaps", type = android.widget.TextView.class), @androidx.databinding.BindingMethod(attribute = "android:textColorHighlight", method = "setHighlightColor", type = android.widget.TextView.class), @androidx.databinding.BindingMethod(attribute = "android:textColorHint", method = "setHintTextColor", type = android.widget.TextView.class), @androidx.databinding.BindingMethod(attribute = "android:textColorLink", method = "setLinkTextColor", type = android.widget.TextView.class), @androidx.databinding.BindingMethod(attribute = "android:onEditorAction", method = "setOnEditorActionListener", type = android.widget.TextView.class)})
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class TextViewBindingAdapter {
    public static final int DECIMAL = 5;
    public static final int INTEGER = 1;
    public static final int SIGNED = 3;
    private static final java.lang.String TAG = "TextViewBindingAdapters";


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface AfterTextChanged {
        void afterTextChanged(android.text.Editable r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface BeforeTextChanged {
        void beforeTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnTextChanged {
        void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4);
    }

    public TextViewBindingAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.databinding.InverseBindingAdapter(attribute = "android:text", event = "android:textAttrChanged")
    public static java.lang.String getTextString(android.widget.TextView r0) {
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            return r0
    }

    private static boolean haveContentsChanged(java.lang.CharSequence r6, java.lang.CharSequence r7) {
            r0 = 0
            r1 = 1
            if (r6 != 0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            if (r7 != 0) goto Lb
            r3 = 1
            goto Lc
        Lb:
            r3 = 0
        Lc:
            if (r2 == r3) goto Lf
            return r1
        Lf:
            if (r6 != 0) goto L12
            return r0
        L12:
            int r2 = r6.length()
            int r3 = r7.length()
            if (r2 == r3) goto L1d
            return r1
        L1d:
            r3 = 0
        L1e:
            if (r3 >= r2) goto L2e
            char r4 = r6.charAt(r3)
            char r5 = r7.charAt(r3)
            if (r4 == r5) goto L2b
            return r1
        L2b:
            int r3 = r3 + 1
            goto L1e
        L2e:
            return r0
    }

    @androidx.databinding.BindingAdapter({"android:autoText"})
    public static void setAutoText(android.widget.TextView r3, boolean r4) {
            android.text.method.KeyListener r0 = r3.getKeyListener()
            android.text.method.TextKeyListener$Capitalize r1 = android.text.method.TextKeyListener.Capitalize.NONE
            if (r0 == 0) goto Ld
            int r0 = r0.getInputType()
            goto Le
        Ld:
            r0 = 0
        Le:
            r2 = r0 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L15
            android.text.method.TextKeyListener$Capitalize r1 = android.text.method.TextKeyListener.Capitalize.CHARACTERS
            goto L22
        L15:
            r2 = r0 & 8192(0x2000, float:1.148E-41)
            if (r2 == 0) goto L1c
            android.text.method.TextKeyListener$Capitalize r1 = android.text.method.TextKeyListener.Capitalize.WORDS
            goto L22
        L1c:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L22
            android.text.method.TextKeyListener$Capitalize r1 = android.text.method.TextKeyListener.Capitalize.SENTENCES
        L22:
            android.text.method.TextKeyListener r4 = android.text.method.TextKeyListener.getInstance(r4, r1)
            r3.setKeyListener(r4)
            return
    }

    @androidx.databinding.BindingAdapter({"android:bufferType"})
    public static void setBufferType(android.widget.TextView r1, android.widget.TextView.BufferType r2) {
            java.lang.CharSequence r0 = r1.getText()
            r1.setText(r0, r2)
            return
    }

    @androidx.databinding.BindingAdapter({"android:capitalize"})
    public static void setCapitalize(android.widget.TextView r2, android.text.method.TextKeyListener.Capitalize r3) {
            android.text.method.KeyListener r0 = r2.getKeyListener()
            int r0 = r0.getInputType()
            r1 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            android.text.method.TextKeyListener r3 = android.text.method.TextKeyListener.getInstance(r0, r3)
            r2.setKeyListener(r3)
            return
    }

    @androidx.databinding.BindingAdapter({"android:digits"})
    public static void setDigits(android.widget.TextView r0, java.lang.CharSequence r1) {
            if (r1 == 0) goto Le
            java.lang.String r1 = r1.toString()
            android.text.method.DigitsKeyListener r1 = android.text.method.DigitsKeyListener.getInstance(r1)
            r0.setKeyListener(r1)
            return
        Le:
            android.text.method.KeyListener r1 = r0.getKeyListener()
            boolean r1 = r1 instanceof android.text.method.DigitsKeyListener
            if (r1 == 0) goto L1a
            r1 = 0
            r0.setKeyListener(r1)
        L1a:
            return
    }

    @androidx.databinding.BindingAdapter({"android:drawableBottom"})
    public static void setDrawableBottom(android.widget.TextView r4, android.graphics.drawable.Drawable r5) {
            setIntrinsicBounds(r5)
            android.graphics.drawable.Drawable[] r0 = r4.getCompoundDrawables()
            r1 = 0
            r1 = r0[r1]
            r2 = 1
            r2 = r0[r2]
            r3 = 2
            r0 = r0[r3]
            r4.setCompoundDrawables(r1, r2, r0, r5)
            return
    }

    @androidx.databinding.BindingAdapter({"android:drawableEnd"})
    public static void setDrawableEnd(android.widget.TextView r4, android.graphics.drawable.Drawable r5) {
            setIntrinsicBounds(r5)
            android.graphics.drawable.Drawable[] r0 = r4.getCompoundDrawablesRelative()
            r1 = 0
            r1 = r0[r1]
            r2 = 1
            r2 = r0[r2]
            r3 = 3
            r0 = r0[r3]
            r4.setCompoundDrawablesRelative(r1, r2, r5, r0)
            return
    }

    @androidx.databinding.BindingAdapter({"android:drawableLeft"})
    public static void setDrawableLeft(android.widget.TextView r4, android.graphics.drawable.Drawable r5) {
            setIntrinsicBounds(r5)
            android.graphics.drawable.Drawable[] r0 = r4.getCompoundDrawables()
            r1 = 1
            r1 = r0[r1]
            r2 = 2
            r2 = r0[r2]
            r3 = 3
            r0 = r0[r3]
            r4.setCompoundDrawables(r5, r1, r2, r0)
            return
    }

    @androidx.databinding.BindingAdapter({"android:drawableRight"})
    public static void setDrawableRight(android.widget.TextView r4, android.graphics.drawable.Drawable r5) {
            setIntrinsicBounds(r5)
            android.graphics.drawable.Drawable[] r0 = r4.getCompoundDrawables()
            r1 = 0
            r1 = r0[r1]
            r2 = 1
            r2 = r0[r2]
            r3 = 3
            r0 = r0[r3]
            r4.setCompoundDrawables(r1, r2, r5, r0)
            return
    }

    @androidx.databinding.BindingAdapter({"android:drawableStart"})
    public static void setDrawableStart(android.widget.TextView r4, android.graphics.drawable.Drawable r5) {
            setIntrinsicBounds(r5)
            android.graphics.drawable.Drawable[] r0 = r4.getCompoundDrawablesRelative()
            r1 = 1
            r1 = r0[r1]
            r2 = 2
            r2 = r0[r2]
            r3 = 3
            r0 = r0[r3]
            r4.setCompoundDrawablesRelative(r5, r1, r2, r0)
            return
    }

    @androidx.databinding.BindingAdapter({"android:drawableTop"})
    public static void setDrawableTop(android.widget.TextView r4, android.graphics.drawable.Drawable r5) {
            setIntrinsicBounds(r5)
            android.graphics.drawable.Drawable[] r0 = r4.getCompoundDrawables()
            r1 = 0
            r1 = r0[r1]
            r2 = 2
            r2 = r0[r2]
            r3 = 3
            r0 = r0[r3]
            r4.setCompoundDrawables(r1, r5, r2, r0)
            return
    }

    @androidx.databinding.BindingAdapter({"android:imeActionId"})
    public static void setImeActionLabel(android.widget.TextView r1, int r2) {
            java.lang.CharSequence r0 = r1.getImeActionLabel()
            r1.setImeActionLabel(r0, r2)
            return
    }

    @androidx.databinding.BindingAdapter({"android:imeActionLabel"})
    public static void setImeActionLabel(android.widget.TextView r1, java.lang.CharSequence r2) {
            int r0 = r1.getImeActionId()
            r1.setImeActionLabel(r2, r0)
            return
    }

    @androidx.databinding.BindingAdapter({"android:inputMethod"})
    public static void setInputMethod(android.widget.TextView r1, java.lang.CharSequence r2) {
            java.lang.String r0 = r2.toString()     // Catch: java.lang.IllegalAccessException -> L12 java.lang.InstantiationException -> L16 java.lang.ClassNotFoundException -> L1a
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.IllegalAccessException -> L12 java.lang.InstantiationException -> L16 java.lang.ClassNotFoundException -> L1a
            java.lang.Object r0 = r0.newInstance()     // Catch: java.lang.IllegalAccessException -> L12 java.lang.InstantiationException -> L16 java.lang.ClassNotFoundException -> L1a
            android.text.method.KeyListener r0 = (android.text.method.KeyListener) r0     // Catch: java.lang.IllegalAccessException -> L12 java.lang.InstantiationException -> L16 java.lang.ClassNotFoundException -> L1a
            r1.setKeyListener(r0)     // Catch: java.lang.IllegalAccessException -> L12 java.lang.InstantiationException -> L16 java.lang.ClassNotFoundException -> L1a
            return
        L12:
            java.util.Objects.toString(r2)
            goto L1d
        L16:
            java.util.Objects.toString(r2)
            goto L1d
        L1a:
            java.util.Objects.toString(r2)
        L1d:
            return
    }

    private static void setIntrinsicBounds(android.graphics.drawable.Drawable r3) {
            if (r3 == 0) goto Le
            int r0 = r3.getIntrinsicWidth()
            int r1 = r3.getIntrinsicHeight()
            r2 = 0
            r3.setBounds(r2, r2, r0, r1)
        Le:
            return
    }

    @androidx.databinding.BindingAdapter({"android:lineSpacingExtra"})
    public static void setLineSpacingExtra(android.widget.TextView r1, float r2) {
            float r0 = r1.getLineSpacingMultiplier()
            r1.setLineSpacing(r2, r0)
            return
    }

    @androidx.databinding.BindingAdapter({"android:lineSpacingMultiplier"})
    public static void setLineSpacingMultiplier(android.widget.TextView r1, float r2) {
            float r0 = r1.getLineSpacingExtra()
            r1.setLineSpacing(r0, r2)
            return
    }

    @androidx.databinding.BindingAdapter({"android:maxLength"})
    public static void setMaxLength(android.widget.TextView r5, int r6) {
            android.text.InputFilter[] r0 = r5.getFilters()
            r1 = 0
            if (r0 != 0) goto L12
            r0 = 1
            android.text.InputFilter[] r0 = new android.text.InputFilter[r0]
            android.text.InputFilter$LengthFilter r2 = new android.text.InputFilter$LengthFilter
            r2.<init>(r6)
            r0[r1] = r2
            goto L40
        L12:
            r2 = 0
        L13:
            int r3 = r0.length
            if (r2 >= r3) goto L2f
            r3 = r0[r2]
            boolean r4 = r3 instanceof android.text.InputFilter.LengthFilter
            if (r4 == 0) goto L2c
            android.text.InputFilter$LengthFilter r3 = (android.text.InputFilter.LengthFilter) r3
            int r1 = r3.getMax()
            if (r1 == r6) goto L40
            android.text.InputFilter$LengthFilter r1 = new android.text.InputFilter$LengthFilter
            r1.<init>(r6)
            r0[r2] = r1
            goto L40
        L2c:
            int r2 = r2 + 1
            goto L13
        L2f:
            int r2 = r0.length
            int r3 = r2 + 1
            android.text.InputFilter[] r3 = new android.text.InputFilter[r3]
            int r4 = r0.length
            java.lang.System.arraycopy(r0, r1, r3, r1, r4)
            android.text.InputFilter$LengthFilter r0 = new android.text.InputFilter$LengthFilter
            r0.<init>(r6)
            r3[r2] = r0
            r0 = r3
        L40:
            r5.setFilters(r0)
            return
    }

    @androidx.databinding.BindingAdapter({"android:numeric"})
    public static void setNumeric(android.widget.TextView r3, int r4) {
            r0 = r4 & 3
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            r4 = r4 & 5
            if (r4 == 0) goto Le
            r1 = 1
        Le:
            android.text.method.DigitsKeyListener r4 = android.text.method.DigitsKeyListener.getInstance(r0, r1)
            r3.setKeyListener(r4)
            return
    }

    @androidx.databinding.BindingAdapter({"android:password"})
    public static void setPassword(android.widget.TextView r0, boolean r1) {
            if (r1 == 0) goto La
            android.text.method.PasswordTransformationMethod r1 = android.text.method.PasswordTransformationMethod.getInstance()
            r0.setTransformationMethod(r1)
            return
        La:
            android.text.method.TransformationMethod r1 = r0.getTransformationMethod()
            boolean r1 = r1 instanceof android.text.method.PasswordTransformationMethod
            if (r1 == 0) goto L16
            r1 = 0
            r0.setTransformationMethod(r1)
        L16:
            return
    }

    @androidx.databinding.BindingAdapter({"android:phoneNumber"})
    public static void setPhoneNumber(android.widget.TextView r0, boolean r1) {
            if (r1 == 0) goto La
            android.text.method.DialerKeyListener r1 = android.text.method.DialerKeyListener.getInstance()
            r0.setKeyListener(r1)
            return
        La:
            android.text.method.KeyListener r1 = r0.getKeyListener()
            boolean r1 = r1 instanceof android.text.method.DialerKeyListener
            if (r1 == 0) goto L16
            r1 = 0
            r0.setKeyListener(r1)
        L16:
            return
    }

    @androidx.databinding.BindingAdapter({"android:shadowColor"})
    public static void setShadowColor(android.widget.TextView r3, int r4) {
            float r0 = r3.getShadowDx()
            float r1 = r3.getShadowDy()
            float r2 = r3.getShadowRadius()
            r3.setShadowLayer(r2, r0, r1, r4)
            return
    }

    @androidx.databinding.BindingAdapter({"android:shadowDx"})
    public static void setShadowDx(android.widget.TextView r3, float r4) {
            int r0 = r3.getShadowColor()
            float r1 = r3.getShadowDy()
            float r2 = r3.getShadowRadius()
            r3.setShadowLayer(r2, r4, r1, r0)
            return
    }

    @androidx.databinding.BindingAdapter({"android:shadowDy"})
    public static void setShadowDy(android.widget.TextView r3, float r4) {
            int r0 = r3.getShadowColor()
            float r1 = r3.getShadowDx()
            float r2 = r3.getShadowRadius()
            r3.setShadowLayer(r2, r1, r4, r0)
            return
    }

    @androidx.databinding.BindingAdapter({"android:shadowRadius"})
    public static void setShadowRadius(android.widget.TextView r3, float r4) {
            int r0 = r3.getShadowColor()
            float r1 = r3.getShadowDx()
            float r2 = r3.getShadowDy()
            r3.setShadowLayer(r4, r1, r2, r0)
            return
    }

    @androidx.databinding.BindingAdapter({"android:text"})
    public static void setText(android.widget.TextView r2, java.lang.CharSequence r3) {
            java.lang.CharSequence r0 = r2.getText()
            if (r3 == r0) goto L24
            if (r3 != 0) goto Lf
            int r1 = r0.length()
            if (r1 != 0) goto Lf
            goto L24
        Lf:
            boolean r1 = r3 instanceof android.text.Spanned
            if (r1 == 0) goto L1a
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L21
            goto L24
        L1a:
            boolean r0 = haveContentsChanged(r3, r0)
            if (r0 != 0) goto L21
            goto L24
        L21:
            r2.setText(r3)
        L24:
            return
    }

    @androidx.databinding.BindingAdapter({"android:textSize"})
    public static void setTextSize(android.widget.TextView r1, float r2) {
            r0 = 0
            r1.setTextSize(r0, r2)
            return
    }

    @androidx.databinding.BindingAdapter(requireAll = false, value = {"android:beforeTextChanged", "android:onTextChanged", "android:afterTextChanged", "android:textAttrChanged"})
    public static void setTextWatcher(android.widget.TextView r1, androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged r2, androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged r3, androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged r4, androidx.databinding.InverseBindingListener r5) {
            if (r2 != 0) goto La
            if (r4 != 0) goto La
            if (r3 != 0) goto La
            if (r5 != 0) goto La
            r2 = 0
            goto L10
        La:
            androidx.databinding.adapters.TextViewBindingAdapter$1 r0 = new androidx.databinding.adapters.TextViewBindingAdapter$1
            r0.<init>(r2, r3, r5, r4)
            r2 = r0
        L10:
            int r3 = androidx.databinding.library.baseAdapters.R.id.textWatcher
            java.lang.Object r3 = androidx.databinding.adapters.ListenerUtil.trackListener(r1, r2, r3)
            android.text.TextWatcher r3 = (android.text.TextWatcher) r3
            if (r3 == 0) goto L1d
            r1.removeTextChangedListener(r3)
        L1d:
            if (r2 == 0) goto L22
            r1.addTextChangedListener(r2)
        L22:
            return
    }
}
