package androidx.appcompat.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class AppCompatTextHelper {
    private static final int MONOSPACE = 3;
    private static final int SANS = 1;
    private static final int SERIF = 2;
    private static final int TEXT_FONT_WEIGHT_UNSPECIFIED = -1;
    private boolean mAsyncFontPending;

    @androidx.annotation.NonNull
    private final androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper;
    private androidx.appcompat.widget.TintInfo mDrawableBottomTint;
    private androidx.appcompat.widget.TintInfo mDrawableEndTint;
    private androidx.appcompat.widget.TintInfo mDrawableLeftTint;
    private androidx.appcompat.widget.TintInfo mDrawableRightTint;
    private androidx.appcompat.widget.TintInfo mDrawableStartTint;
    private androidx.appcompat.widget.TintInfo mDrawableTint;
    private androidx.appcompat.widget.TintInfo mDrawableTopTint;
    private android.graphics.Typeface mFontTypeface;
    private int mFontWeight;
    private int mStyle;

    @androidx.annotation.NonNull
    private final android.widget.TextView mView;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(17)
    static class Api17Impl {
        private Api17Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static android.graphics.drawable.Drawable[] getCompoundDrawablesRelative(android.widget.TextView r0) {
                android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawablesRelative()
                return r0
        }

        @androidx.annotation.DoNotInline
        static void setCompoundDrawablesRelativeWithIntrinsicBounds(android.widget.TextView r0, android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
                r0.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r2, r3, r4)
                return
        }

        @androidx.annotation.DoNotInline
        static void setTextLocale(android.widget.TextView r0, java.util.Locale r1) {
                r0.setTextLocale(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static java.util.Locale forLanguageTag(java.lang.String r0) {
                java.util.Locale r0 = java.util.Locale.forLanguageTag(r0)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(24)
    static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static android.os.LocaleList forLanguageTags(java.lang.String r0) {
                android.os.LocaleList r0 = android.os.LocaleList.forLanguageTags(r0)
                return r0
        }

        @androidx.annotation.DoNotInline
        static void setTextLocales(android.widget.TextView r0, android.os.LocaleList r1) {
                r0.setTextLocales(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(26)
    static class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static int getAutoSizeStepGranularity(android.widget.TextView r0) {
                int r0 = r0.getAutoSizeStepGranularity()
                return r0
        }

        @androidx.annotation.DoNotInline
        static void setAutoSizeTextTypeUniformWithConfiguration(android.widget.TextView r0, int r1, int r2, int r3, int r4) {
                r0.setAutoSizeTextTypeUniformWithConfiguration(r1, r2, r3, r4)
                return
        }

        @androidx.annotation.DoNotInline
        static void setAutoSizeTextTypeUniformWithPresetSizes(android.widget.TextView r0, int[] r1, int r2) {
                r0.setAutoSizeTextTypeUniformWithPresetSizes(r1, r2)
                return
        }

        @androidx.annotation.DoNotInline
        static boolean setFontVariationSettings(android.widget.TextView r0, java.lang.String r1) {
                boolean r0 = r0.setFontVariationSettings(r1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(28)
    static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static android.graphics.Typeface create(android.graphics.Typeface r0, int r1, boolean r2) {
                android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r1, r2)
                return r0
        }
    }

    AppCompatTextHelper(@androidx.annotation.NonNull android.widget.TextView r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mStyle = r0
            r0 = -1
            r1.mFontWeight = r0
            r1.mView = r2
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = new androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper
            r0.<init>(r2)
            r1.mAutoSizeTextHelper = r0
            return
    }

    private void applyCompoundDrawableTint(android.graphics.drawable.Drawable r2, androidx.appcompat.widget.TintInfo r3) {
            r1 = this;
            if (r2 == 0) goto Ld
            if (r3 == 0) goto Ld
            android.widget.TextView r0 = r1.mView
            int[] r0 = r0.getDrawableState()
            androidx.appcompat.widget.AppCompatDrawableManager.tintDrawable(r2, r3, r0)
        Ld:
            return
    }

    private static androidx.appcompat.widget.TintInfo createTintInfo(android.content.Context r0, androidx.appcompat.widget.AppCompatDrawableManager r1, int r2) {
            android.content.res.ColorStateList r0 = r1.getTintList(r0, r2)
            if (r0 == 0) goto L11
            androidx.appcompat.widget.TintInfo r1 = new androidx.appcompat.widget.TintInfo
            r1.<init>()
            r2 = 1
            r1.mHasTintList = r2
            r1.mTintList = r0
            return r1
        L11:
            r0 = 0
            return r0
    }

    private void setCompoundDrawables(android.graphics.drawable.Drawable r6, android.graphics.drawable.Drawable r7, android.graphics.drawable.Drawable r8, android.graphics.drawable.Drawable r9, android.graphics.drawable.Drawable r10, android.graphics.drawable.Drawable r11) {
            r5 = this;
            r0 = 3
            r1 = 1
            r2 = 0
            r3 = 2
            if (r10 != 0) goto L54
            if (r11 == 0) goto L9
            goto L54
        L9:
            if (r6 != 0) goto L13
            if (r7 != 0) goto L13
            if (r8 != 0) goto L13
            if (r9 == 0) goto L12
            goto L13
        L12:
            return
        L13:
            android.widget.TextView r10 = r5.mView
            android.graphics.drawable.Drawable[] r10 = androidx.appcompat.widget.AppCompatTextHelper.Api17Impl.getCompoundDrawablesRelative(r10)
            r11 = r10[r2]
            if (r11 != 0) goto L42
            r4 = r10[r3]
            if (r4 == 0) goto L22
            goto L42
        L22:
            android.widget.TextView r10 = r5.mView
            android.graphics.drawable.Drawable[] r10 = r10.getCompoundDrawables()
            android.widget.TextView r11 = r5.mView
            if (r6 == 0) goto L2d
            goto L2f
        L2d:
            r6 = r10[r2]
        L2f:
            if (r7 == 0) goto L32
            goto L34
        L32:
            r7 = r10[r1]
        L34:
            if (r8 == 0) goto L37
            goto L39
        L37:
            r8 = r10[r3]
        L39:
            if (r9 == 0) goto L3c
            goto L3e
        L3c:
            r9 = r10[r0]
        L3e:
            r11.setCompoundDrawablesWithIntrinsicBounds(r6, r7, r8, r9)
            return
        L42:
            android.widget.TextView r6 = r5.mView
            if (r7 == 0) goto L47
            goto L49
        L47:
            r7 = r10[r1]
        L49:
            r8 = r10[r3]
            if (r9 == 0) goto L4e
            goto L50
        L4e:
            r9 = r10[r0]
        L50:
            androidx.appcompat.widget.AppCompatTextHelper.Api17Impl.setCompoundDrawablesRelativeWithIntrinsicBounds(r6, r11, r7, r8, r9)
            return
        L54:
            android.widget.TextView r6 = r5.mView
            android.graphics.drawable.Drawable[] r6 = androidx.appcompat.widget.AppCompatTextHelper.Api17Impl.getCompoundDrawablesRelative(r6)
            android.widget.TextView r8 = r5.mView
            if (r10 == 0) goto L5f
            goto L61
        L5f:
            r10 = r6[r2]
        L61:
            if (r7 == 0) goto L64
            goto L66
        L64:
            r7 = r6[r1]
        L66:
            if (r11 == 0) goto L69
            goto L6b
        L69:
            r11 = r6[r3]
        L6b:
            if (r9 == 0) goto L6e
            goto L70
        L6e:
            r9 = r6[r0]
        L70:
            androidx.appcompat.widget.AppCompatTextHelper.Api17Impl.setCompoundDrawablesRelativeWithIntrinsicBounds(r8, r10, r7, r11, r9)
            return
    }

    private void setCompoundTints() {
            r1 = this;
            androidx.appcompat.widget.TintInfo r0 = r1.mDrawableTint
            r1.mDrawableLeftTint = r0
            r1.mDrawableTopTint = r0
            r1.mDrawableRightTint = r0
            r1.mDrawableBottomTint = r0
            r1.mDrawableStartTint = r0
            r1.mDrawableEndTint = r0
            return
    }

    private void setTextSizeInternal(int r2, float r3) {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r1.mAutoSizeTextHelper
            r0.setTextSizeInternal(r2, r3)
            return
    }

    private void updateTypefaceAndStyle(android.content.Context r11, androidx.appcompat.widget.TintTypedArray r12) {
            r10 = this;
            int r0 = androidx.appcompat.R.styleable.TextAppearance_android_textStyle
            int r1 = r10.mStyle
            int r0 = r12.getInt(r0, r1)
            r10.mStyle = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 2
            r2 = -1
            r3 = 28
            if (r0 < r3) goto L21
            int r4 = androidx.appcompat.R.styleable.TextAppearance_android_textFontWeight
            int r4 = r12.getInt(r4, r2)
            r10.mFontWeight = r4
            if (r4 == r2) goto L21
            int r4 = r10.mStyle
            r4 = r4 & r1
            r10.mStyle = r4
        L21:
            int r4 = androidx.appcompat.R.styleable.TextAppearance_android_fontFamily
            boolean r5 = r12.hasValue(r4)
            r6 = 1
            r7 = 0
            if (r5 != 0) goto L5a
            int r5 = androidx.appcompat.R.styleable.TextAppearance_fontFamily
            boolean r5 = r12.hasValue(r5)
            if (r5 == 0) goto L34
            goto L5a
        L34:
            int r11 = androidx.appcompat.R.styleable.TextAppearance_android_typeface
            boolean r0 = r12.hasValue(r11)
            if (r0 == 0) goto Lda
            r10.mAsyncFontPending = r7
            int r11 = r12.getInt(r11, r6)
            if (r11 == r6) goto L55
            if (r11 == r1) goto L50
            r12 = 3
            if (r11 == r12) goto L4b
            goto Lda
        L4b:
            android.graphics.Typeface r11 = android.graphics.Typeface.MONOSPACE
            r10.mFontTypeface = r11
            return
        L50:
            android.graphics.Typeface r11 = android.graphics.Typeface.SERIF
            r10.mFontTypeface = r11
            return
        L55:
            android.graphics.Typeface r11 = android.graphics.Typeface.SANS_SERIF
            r10.mFontTypeface = r11
            return
        L5a:
            r5 = 0
            r10.mFontTypeface = r5
            int r5 = androidx.appcompat.R.styleable.TextAppearance_fontFamily
            boolean r8 = r12.hasValue(r5)
            if (r8 == 0) goto L66
            r4 = r5
        L66:
            int r5 = r10.mFontWeight
            int r8 = r10.mStyle
            boolean r11 = r11.isRestricted()
            if (r11 != 0) goto Lac
            java.lang.ref.WeakReference r11 = new java.lang.ref.WeakReference
            android.widget.TextView r9 = r10.mView
            r11.<init>(r9)
            androidx.appcompat.widget.AppCompatTextHelper$1 r9 = new androidx.appcompat.widget.AppCompatTextHelper$1
            r9.<init>(r10, r5, r8, r11)
            int r11 = r10.mStyle     // Catch: java.lang.Throwable -> L9f
            android.graphics.Typeface r11 = r12.getFont(r4, r11, r9)     // Catch: java.lang.Throwable -> L9f
            if (r11 == 0) goto La3
            if (r0 < r3) goto La1
            int r0 = r10.mFontWeight     // Catch: java.lang.Throwable -> L9f
            if (r0 == r2) goto La1
            android.graphics.Typeface r11 = android.graphics.Typeface.create(r11, r7)     // Catch: java.lang.Throwable -> L9f
            int r0 = r10.mFontWeight     // Catch: java.lang.Throwable -> L9f
            int r5 = r10.mStyle     // Catch: java.lang.Throwable -> L9f
            r5 = r5 & r1
            if (r5 == 0) goto L97
            r5 = 1
            goto L98
        L97:
            r5 = 0
        L98:
            android.graphics.Typeface r11 = androidx.appcompat.widget.AppCompatTextHelper.Api28Impl.create(r11, r0, r5)     // Catch: java.lang.Throwable -> L9f
            r10.mFontTypeface = r11     // Catch: java.lang.Throwable -> L9f
            goto La3
        L9f:
            goto Lac
        La1:
            r10.mFontTypeface = r11     // Catch: java.lang.Throwable -> L9f
        La3:
            android.graphics.Typeface r11 = r10.mFontTypeface     // Catch: java.lang.Throwable -> L9f
            if (r11 != 0) goto La9
            r11 = 1
            goto Laa
        La9:
            r11 = 0
        Laa:
            r10.mAsyncFontPending = r11     // Catch: java.lang.Throwable -> L9f
        Lac:
            android.graphics.Typeface r11 = r10.mFontTypeface
            if (r11 != 0) goto Lda
            java.lang.String r11 = r12.getString(r4)
            if (r11 == 0) goto Lda
            int r12 = android.os.Build.VERSION.SDK_INT
            if (r12 < r3) goto Ld2
            int r12 = r10.mFontWeight
            if (r12 == r2) goto Ld2
            android.graphics.Typeface r11 = android.graphics.Typeface.create(r11, r7)
            int r12 = r10.mFontWeight
            int r0 = r10.mStyle
            r0 = r0 & r1
            if (r0 == 0) goto Lca
            goto Lcb
        Lca:
            r6 = 0
        Lcb:
            android.graphics.Typeface r11 = androidx.appcompat.widget.AppCompatTextHelper.Api28Impl.create(r11, r12, r6)
            r10.mFontTypeface = r11
            goto Lda
        Ld2:
            int r12 = r10.mStyle
            android.graphics.Typeface r11 = android.graphics.Typeface.create(r11, r12)
            r10.mFontTypeface = r11
        Lda:
            return
    }

    void applyCompoundDrawablesTints() {
            r5 = this;
            androidx.appcompat.widget.TintInfo r0 = r5.mDrawableLeftTint
            r1 = 2
            r2 = 0
            if (r0 != 0) goto L12
            androidx.appcompat.widget.TintInfo r0 = r5.mDrawableTopTint
            if (r0 != 0) goto L12
            androidx.appcompat.widget.TintInfo r0 = r5.mDrawableRightTint
            if (r0 != 0) goto L12
            androidx.appcompat.widget.TintInfo r0 = r5.mDrawableBottomTint
            if (r0 == 0) goto L36
        L12:
            android.widget.TextView r0 = r5.mView
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawables()
            r3 = r0[r2]
            androidx.appcompat.widget.TintInfo r4 = r5.mDrawableLeftTint
            r5.applyCompoundDrawableTint(r3, r4)
            r3 = 1
            r3 = r0[r3]
            androidx.appcompat.widget.TintInfo r4 = r5.mDrawableTopTint
            r5.applyCompoundDrawableTint(r3, r4)
            r3 = r0[r1]
            androidx.appcompat.widget.TintInfo r4 = r5.mDrawableRightTint
            r5.applyCompoundDrawableTint(r3, r4)
            r3 = 3
            r0 = r0[r3]
            androidx.appcompat.widget.TintInfo r3 = r5.mDrawableBottomTint
            r5.applyCompoundDrawableTint(r0, r3)
        L36:
            androidx.appcompat.widget.TintInfo r0 = r5.mDrawableStartTint
            if (r0 != 0) goto L40
            androidx.appcompat.widget.TintInfo r0 = r5.mDrawableEndTint
            if (r0 == 0) goto L3f
            goto L40
        L3f:
            return
        L40:
            android.widget.TextView r0 = r5.mView
            android.graphics.drawable.Drawable[] r0 = androidx.appcompat.widget.AppCompatTextHelper.Api17Impl.getCompoundDrawablesRelative(r0)
            r2 = r0[r2]
            androidx.appcompat.widget.TintInfo r3 = r5.mDrawableStartTint
            r5.applyCompoundDrawableTint(r2, r3)
            r0 = r0[r1]
            androidx.appcompat.widget.TintInfo r1 = r5.mDrawableEndTint
            r5.applyCompoundDrawableTint(r0, r1)
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    void autoSizeText() {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r1.mAutoSizeTextHelper
            r0.autoSizeText()
            return
    }

    int getAutoSizeMaxTextSize() {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r1.mAutoSizeTextHelper
            int r0 = r0.getAutoSizeMaxTextSize()
            return r0
    }

    int getAutoSizeMinTextSize() {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r1.mAutoSizeTextHelper
            int r0 = r0.getAutoSizeMinTextSize()
            return r0
    }

    int getAutoSizeStepGranularity() {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r1.mAutoSizeTextHelper
            int r0 = r0.getAutoSizeStepGranularity()
            return r0
    }

    int[] getAutoSizeTextAvailableSizes() {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r1.mAutoSizeTextHelper
            int[] r0 = r0.getAutoSizeTextAvailableSizes()
            return r0
    }

    int getAutoSizeTextType() {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r1.mAutoSizeTextHelper
            int r0 = r0.getAutoSizeTextType()
            return r0
    }

    @androidx.annotation.Nullable
    android.content.res.ColorStateList getCompoundDrawableTintList() {
            r1 = this;
            androidx.appcompat.widget.TintInfo r0 = r1.mDrawableTint
            if (r0 == 0) goto L7
            android.content.res.ColorStateList r0 = r0.mTintList
            return r0
        L7:
            r0 = 0
            return r0
    }

    @androidx.annotation.Nullable
    android.graphics.PorterDuff.Mode getCompoundDrawableTintMode() {
            r1 = this;
            androidx.appcompat.widget.TintInfo r0 = r1.mDrawableTint
            if (r0 == 0) goto L7
            android.graphics.PorterDuff$Mode r0 = r0.mTintMode
            return r0
        L7:
            r0 = 0
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    boolean isAutoSizeEnabled() {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r1.mAutoSizeTextHelper
            boolean r0 = r0.isAutoSizeEnabled()
            return r0
    }

    @android.annotation.SuppressLint({"NewApi"})
    void loadFromAttributes(@androidx.annotation.Nullable android.util.AttributeSet r24, int r25) {
            r23 = this;
            r0 = r23
            r4 = r24
            r6 = r25
            android.widget.TextView r1 = r0.mView
            android.content.Context r8 = r1.getContext()
            androidx.appcompat.widget.AppCompatDrawableManager r9 = androidx.appcompat.widget.AppCompatDrawableManager.get()
            int[] r3 = androidx.appcompat.R.styleable.AppCompatTextHelper
            r10 = 0
            androidx.appcompat.widget.TintTypedArray r11 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r8, r4, r3, r6, r10)
            android.widget.TextView r1 = r0.mView
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r11.getWrappedTypeArray()
            r7 = 0
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(r1, r2, r3, r4, r5, r6, r7)
            int r1 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_textAppearance
            r7 = -1
            int r1 = r11.getResourceId(r1, r7)
            int r2 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableLeft
            boolean r3 = r11.hasValue(r2)
            if (r3 == 0) goto L3e
            int r2 = r11.getResourceId(r2, r10)
            androidx.appcompat.widget.TintInfo r2 = createTintInfo(r8, r9, r2)
            r0.mDrawableLeftTint = r2
        L3e:
            int r2 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableTop
            boolean r3 = r11.hasValue(r2)
            if (r3 == 0) goto L50
            int r2 = r11.getResourceId(r2, r10)
            androidx.appcompat.widget.TintInfo r2 = createTintInfo(r8, r9, r2)
            r0.mDrawableTopTint = r2
        L50:
            int r2 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableRight
            boolean r3 = r11.hasValue(r2)
            if (r3 == 0) goto L62
            int r2 = r11.getResourceId(r2, r10)
            androidx.appcompat.widget.TintInfo r2 = createTintInfo(r8, r9, r2)
            r0.mDrawableRightTint = r2
        L62:
            int r2 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableBottom
            boolean r3 = r11.hasValue(r2)
            if (r3 == 0) goto L74
            int r2 = r11.getResourceId(r2, r10)
            androidx.appcompat.widget.TintInfo r2 = createTintInfo(r8, r9, r2)
            r0.mDrawableBottomTint = r2
        L74:
            int r2 = android.os.Build.VERSION.SDK_INT
            int r3 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableStart
            boolean r5 = r11.hasValue(r3)
            if (r5 == 0) goto L88
            int r3 = r11.getResourceId(r3, r10)
            androidx.appcompat.widget.TintInfo r3 = createTintInfo(r8, r9, r3)
            r0.mDrawableStartTint = r3
        L88:
            int r3 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableEnd
            boolean r5 = r11.hasValue(r3)
            if (r5 == 0) goto L9a
            int r3 = r11.getResourceId(r3, r10)
            androidx.appcompat.widget.TintInfo r3 = createTintInfo(r8, r9, r3)
            r0.mDrawableEndTint = r3
        L9a:
            r11.recycle()
            android.widget.TextView r3 = r0.mView
            android.text.method.TransformationMethod r3 = r3.getTransformationMethod()
            boolean r3 = r3 instanceof android.text.method.PasswordTransformationMethod
            r5 = 26
            r11 = 23
            if (r1 == r7) goto L118
            int[] r14 = androidx.appcompat.R.styleable.TextAppearance
            androidx.appcompat.widget.TintTypedArray r1 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r8, r1, r14)
            if (r3 != 0) goto Lc1
            int r14 = androidx.appcompat.R.styleable.TextAppearance_textAllCaps
            boolean r15 = r1.hasValue(r14)
            if (r15 == 0) goto Lc1
            boolean r14 = r1.getBoolean(r14, r10)
            r15 = 1
            goto Lc3
        Lc1:
            r14 = 0
            r15 = 0
        Lc3:
            r0.updateTypefaceAndStyle(r8, r1)
            if (r2 >= r11) goto Lf3
            int r12 = androidx.appcompat.R.styleable.TextAppearance_android_textColor
            boolean r17 = r1.hasValue(r12)
            if (r17 == 0) goto Ld5
            android.content.res.ColorStateList r12 = r1.getColorStateList(r12)
            goto Ld6
        Ld5:
            r12 = 0
        Ld6:
            int r13 = androidx.appcompat.R.styleable.TextAppearance_android_textColorHint
            boolean r18 = r1.hasValue(r13)
            if (r18 == 0) goto Le3
            android.content.res.ColorStateList r13 = r1.getColorStateList(r13)
            goto Le4
        Le3:
            r13 = 0
        Le4:
            int r7 = androidx.appcompat.R.styleable.TextAppearance_android_textColorLink
            boolean r19 = r1.hasValue(r7)
            if (r19 == 0) goto Lf1
            android.content.res.ColorStateList r7 = r1.getColorStateList(r7)
            goto Lf6
        Lf1:
            r7 = 0
            goto Lf6
        Lf3:
            r7 = 0
            r12 = 0
            r13 = 0
        Lf6:
            int r11 = androidx.appcompat.R.styleable.TextAppearance_textLocale
            boolean r20 = r1.hasValue(r11)
            if (r20 == 0) goto L103
            java.lang.String r11 = r1.getString(r11)
            goto L104
        L103:
            r11 = 0
        L104:
            if (r2 < r5) goto L113
            int r5 = androidx.appcompat.R.styleable.TextAppearance_fontVariationSettings
            boolean r21 = r1.hasValue(r5)
            if (r21 == 0) goto L113
            java.lang.String r5 = r1.getString(r5)
            goto L114
        L113:
            r5 = 0
        L114:
            r1.recycle()
            goto L11f
        L118:
            r5 = 0
            r7 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L11f:
            int[] r1 = androidx.appcompat.R.styleable.TextAppearance
            androidx.appcompat.widget.TintTypedArray r1 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r8, r4, r1, r6, r10)
            if (r3 != 0) goto L13a
            int r10 = androidx.appcompat.R.styleable.TextAppearance_textAllCaps
            boolean r22 = r1.hasValue(r10)
            if (r22 == 0) goto L13a
            r22 = r3
            r3 = 0
            boolean r14 = r1.getBoolean(r10, r3)
            r15 = 1
        L137:
            r3 = 23
            goto L13d
        L13a:
            r22 = r3
            goto L137
        L13d:
            if (r2 >= r3) goto L163
            int r3 = androidx.appcompat.R.styleable.TextAppearance_android_textColor
            boolean r10 = r1.hasValue(r3)
            if (r10 == 0) goto L14b
            android.content.res.ColorStateList r12 = r1.getColorStateList(r3)
        L14b:
            int r3 = androidx.appcompat.R.styleable.TextAppearance_android_textColorHint
            boolean r10 = r1.hasValue(r3)
            if (r10 == 0) goto L157
            android.content.res.ColorStateList r13 = r1.getColorStateList(r3)
        L157:
            int r3 = androidx.appcompat.R.styleable.TextAppearance_android_textColorLink
            boolean r10 = r1.hasValue(r3)
            if (r10 == 0) goto L163
            android.content.res.ColorStateList r7 = r1.getColorStateList(r3)
        L163:
            int r3 = androidx.appcompat.R.styleable.TextAppearance_textLocale
            boolean r10 = r1.hasValue(r3)
            if (r10 == 0) goto L16f
            java.lang.String r11 = r1.getString(r3)
        L16f:
            r3 = 26
            if (r2 < r3) goto L17f
            int r3 = androidx.appcompat.R.styleable.TextAppearance_fontVariationSettings
            boolean r10 = r1.hasValue(r3)
            if (r10 == 0) goto L17f
            java.lang.String r5 = r1.getString(r3)
        L17f:
            r3 = 28
            if (r2 < r3) goto L19c
            int r3 = androidx.appcompat.R.styleable.TextAppearance_android_textSize
            boolean r10 = r1.hasValue(r3)
            if (r10 == 0) goto L19c
            r10 = -1
            int r3 = r1.getDimensionPixelSize(r3, r10)
            if (r3 != 0) goto L19c
            android.widget.TextView r3 = r0.mView
            r10 = 0
            r16 = r15
            r15 = 0
            r3.setTextSize(r15, r10)
            goto L19e
        L19c:
            r16 = r15
        L19e:
            r0.updateTypefaceAndStyle(r8, r1)
            r1.recycle()
            if (r12 == 0) goto L1ab
            android.widget.TextView r1 = r0.mView
            r1.setTextColor(r12)
        L1ab:
            if (r13 == 0) goto L1b2
            android.widget.TextView r1 = r0.mView
            r1.setHintTextColor(r13)
        L1b2:
            if (r7 == 0) goto L1b9
            android.widget.TextView r1 = r0.mView
            r1.setLinkTextColor(r7)
        L1b9:
            if (r22 != 0) goto L1c0
            if (r16 == 0) goto L1c0
            r0.setAllCaps(r14)
        L1c0:
            android.graphics.Typeface r1 = r0.mFontTypeface
            if (r1 == 0) goto L1d6
            int r3 = r0.mFontWeight
            r10 = -1
            if (r3 != r10) goto L1d1
            android.widget.TextView r3 = r0.mView
            int r7 = r0.mStyle
            r3.setTypeface(r1, r7)
            goto L1d6
        L1d1:
            android.widget.TextView r3 = r0.mView
            r3.setTypeface(r1)
        L1d6:
            if (r5 == 0) goto L1dd
            android.widget.TextView r1 = r0.mView
            androidx.appcompat.widget.AppCompatTextHelper.Api26Impl.setFontVariationSettings(r1, r5)
        L1dd:
            if (r11 == 0) goto L200
            r1 = 24
            if (r2 < r1) goto L1ed
            android.widget.TextView r1 = r0.mView
            android.os.LocaleList r2 = androidx.appcompat.widget.AppCompatTextHelper.Api24Impl.forLanguageTags(r11)
            androidx.appcompat.widget.AppCompatTextHelper.Api24Impl.setTextLocales(r1, r2)
            goto L200
        L1ed:
            java.lang.String r1 = ","
            java.lang.String[] r1 = r11.split(r1)
            r21 = 0
            r1 = r1[r21]
            android.widget.TextView r2 = r0.mView
            java.util.Locale r1 = androidx.appcompat.widget.AppCompatTextHelper.Api21Impl.forLanguageTag(r1)
            androidx.appcompat.widget.AppCompatTextHelper.Api17Impl.setTextLocale(r2, r1)
        L200:
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r1 = r0.mAutoSizeTextHelper
            r1.loadFromAttributes(r4, r6)
            boolean r1 = androidx.appcompat.widget.ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE
            if (r1 == 0) goto L246
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r1 = r0.mAutoSizeTextHelper
            int r1 = r1.getAutoSizeTextType()
            if (r1 == 0) goto L246
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r1 = r0.mAutoSizeTextHelper
            int[] r1 = r1.getAutoSizeTextAvailableSizes()
            int r2 = r1.length
            if (r2 <= 0) goto L246
            android.widget.TextView r2 = r0.mView
            int r2 = androidx.appcompat.widget.AppCompatTextHelper.Api26Impl.getAutoSizeStepGranularity(r2)
            float r2 = (float) r2
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L240
            android.widget.TextView r1 = r0.mView
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r2 = r0.mAutoSizeTextHelper
            int r2 = r2.getAutoSizeMinTextSize()
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r3 = r0.mAutoSizeTextHelper
            int r3 = r3.getAutoSizeMaxTextSize()
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r5 = r0.mAutoSizeTextHelper
            int r5 = r5.getAutoSizeStepGranularity()
            r15 = 0
            androidx.appcompat.widget.AppCompatTextHelper.Api26Impl.setAutoSizeTextTypeUniformWithConfiguration(r1, r2, r3, r5, r15)
            goto L246
        L240:
            r15 = 0
            android.widget.TextView r2 = r0.mView
            androidx.appcompat.widget.AppCompatTextHelper.Api26Impl.setAutoSizeTextTypeUniformWithPresetSizes(r2, r1, r15)
        L246:
            int[] r1 = androidx.appcompat.R.styleable.AppCompatTextView
            androidx.appcompat.widget.TintTypedArray r7 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r8, r4, r1)
            int r1 = androidx.appcompat.R.styleable.AppCompatTextView_drawableLeftCompat
            r10 = -1
            int r1 = r7.getResourceId(r1, r10)
            if (r1 == r10) goto L25a
            android.graphics.drawable.Drawable r1 = r9.getDrawable(r8, r1)
            goto L25b
        L25a:
            r1 = 0
        L25b:
            int r2 = androidx.appcompat.R.styleable.AppCompatTextView_drawableTopCompat
            int r2 = r7.getResourceId(r2, r10)
            if (r2 == r10) goto L268
            android.graphics.drawable.Drawable r2 = r9.getDrawable(r8, r2)
            goto L269
        L268:
            r2 = 0
        L269:
            int r3 = androidx.appcompat.R.styleable.AppCompatTextView_drawableRightCompat
            int r3 = r7.getResourceId(r3, r10)
            if (r3 == r10) goto L276
            android.graphics.drawable.Drawable r3 = r9.getDrawable(r8, r3)
            goto L277
        L276:
            r3 = 0
        L277:
            int r4 = androidx.appcompat.R.styleable.AppCompatTextView_drawableBottomCompat
            int r4 = r7.getResourceId(r4, r10)
            if (r4 == r10) goto L284
            android.graphics.drawable.Drawable r4 = r9.getDrawable(r8, r4)
            goto L285
        L284:
            r4 = 0
        L285:
            int r5 = androidx.appcompat.R.styleable.AppCompatTextView_drawableStartCompat
            int r5 = r7.getResourceId(r5, r10)
            if (r5 == r10) goto L292
            android.graphics.drawable.Drawable r5 = r9.getDrawable(r8, r5)
            goto L293
        L292:
            r5 = 0
        L293:
            int r6 = androidx.appcompat.R.styleable.AppCompatTextView_drawableEndCompat
            int r6 = r7.getResourceId(r6, r10)
            if (r6 == r10) goto L2a0
            android.graphics.drawable.Drawable r6 = r9.getDrawable(r8, r6)
            goto L2a1
        L2a0:
            r6 = 0
        L2a1:
            r0.setCompoundDrawables(r1, r2, r3, r4, r5, r6)
            int r1 = androidx.appcompat.R.styleable.AppCompatTextView_drawableTint
            boolean r2 = r7.hasValue(r1)
            if (r2 == 0) goto L2b5
            android.content.res.ColorStateList r1 = r7.getColorStateList(r1)
            android.widget.TextView r2 = r0.mView
            androidx.core.widget.TextViewCompat.setCompoundDrawableTintList(r2, r1)
        L2b5:
            int r1 = androidx.appcompat.R.styleable.AppCompatTextView_drawableTintMode
            boolean r2 = r7.hasValue(r1)
            r10 = -1
            if (r2 == 0) goto L2cc
            int r1 = r7.getInt(r1, r10)
            r2 = 0
            android.graphics.PorterDuff$Mode r1 = androidx.appcompat.widget.DrawableUtils.parseTintMode(r1, r2)
            android.widget.TextView r2 = r0.mView
            androidx.core.widget.TextViewCompat.setCompoundDrawableTintMode(r2, r1)
        L2cc:
            int r1 = androidx.appcompat.R.styleable.AppCompatTextView_firstBaselineToTopHeight
            int r1 = r7.getDimensionPixelSize(r1, r10)
            int r2 = androidx.appcompat.R.styleable.AppCompatTextView_lastBaselineToBottomHeight
            int r2 = r7.getDimensionPixelSize(r2, r10)
            int r3 = androidx.appcompat.R.styleable.AppCompatTextView_lineHeight
            int r3 = r7.getDimensionPixelSize(r3, r10)
            r7.recycle()
            if (r1 == r10) goto L2e8
            android.widget.TextView r4 = r0.mView
            androidx.core.widget.TextViewCompat.setFirstBaselineToTopHeight(r4, r1)
        L2e8:
            if (r2 == r10) goto L2ef
            android.widget.TextView r1 = r0.mView
            androidx.core.widget.TextViewCompat.setLastBaselineToBottomHeight(r1, r2)
        L2ef:
            if (r3 == r10) goto L2f6
            android.widget.TextView r1 = r0.mView
            androidx.core.widget.TextViewCompat.setLineHeight(r1, r3)
        L2f6:
            return
    }

    void onAsyncTypefaceReceived(java.lang.ref.WeakReference<android.widget.TextView> r3, android.graphics.Typeface r4) {
            r2 = this;
            boolean r0 = r2.mAsyncFontPending
            if (r0 == 0) goto L24
            r2.mFontTypeface = r4
            java.lang.Object r3 = r3.get()
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 == 0) goto L24
            boolean r0 = androidx.core.view.ViewCompat.isAttachedToWindow(r3)
            if (r0 == 0) goto L1f
            int r0 = r2.mStyle
            androidx.appcompat.widget.AppCompatTextHelper$2 r1 = new androidx.appcompat.widget.AppCompatTextHelper$2
            r1.<init>(r2, r3, r4, r0)
            r3.post(r1)
            return
        L1f:
            int r0 = r2.mStyle
            r3.setTypeface(r4, r0)
        L24:
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            boolean r1 = androidx.appcompat.widget.ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE
            if (r1 != 0) goto L7
            r0.autoSizeText()
        L7:
            return
    }

    void onSetCompoundDrawables() {
            r0 = this;
            r0.applyCompoundDrawablesTints()
            return
    }

    void onSetTextAppearance(android.content.Context r5, int r6) {
            r4 = this;
            int[] r0 = androidx.appcompat.R.styleable.TextAppearance
            androidx.appcompat.widget.TintTypedArray r6 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r5, r6, r0)
            int r0 = androidx.appcompat.R.styleable.TextAppearance_textAllCaps
            boolean r1 = r6.hasValue(r0)
            r2 = 0
            if (r1 == 0) goto L16
            boolean r0 = r6.getBoolean(r0, r2)
            r4.setAllCaps(r0)
        L16:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 >= r1) goto L55
            int r1 = androidx.appcompat.R.styleable.TextAppearance_android_textColor
            boolean r3 = r6.hasValue(r1)
            if (r3 == 0) goto L2f
            android.content.res.ColorStateList r1 = r6.getColorStateList(r1)
            if (r1 == 0) goto L2f
            android.widget.TextView r3 = r4.mView
            r3.setTextColor(r1)
        L2f:
            int r1 = androidx.appcompat.R.styleable.TextAppearance_android_textColorLink
            boolean r3 = r6.hasValue(r1)
            if (r3 == 0) goto L42
            android.content.res.ColorStateList r1 = r6.getColorStateList(r1)
            if (r1 == 0) goto L42
            android.widget.TextView r3 = r4.mView
            r3.setLinkTextColor(r1)
        L42:
            int r1 = androidx.appcompat.R.styleable.TextAppearance_android_textColorHint
            boolean r3 = r6.hasValue(r1)
            if (r3 == 0) goto L55
            android.content.res.ColorStateList r1 = r6.getColorStateList(r1)
            if (r1 == 0) goto L55
            android.widget.TextView r3 = r4.mView
            r3.setHintTextColor(r1)
        L55:
            int r1 = androidx.appcompat.R.styleable.TextAppearance_android_textSize
            boolean r3 = r6.hasValue(r1)
            if (r3 == 0) goto L6a
            r3 = -1
            int r1 = r6.getDimensionPixelSize(r1, r3)
            if (r1 != 0) goto L6a
            android.widget.TextView r1 = r4.mView
            r3 = 0
            r1.setTextSize(r2, r3)
        L6a:
            r4.updateTypefaceAndStyle(r5, r6)
            r5 = 26
            if (r0 < r5) goto L84
            int r5 = androidx.appcompat.R.styleable.TextAppearance_fontVariationSettings
            boolean r0 = r6.hasValue(r5)
            if (r0 == 0) goto L84
            java.lang.String r5 = r6.getString(r5)
            if (r5 == 0) goto L84
            android.widget.TextView r0 = r4.mView
            androidx.appcompat.widget.AppCompatTextHelper.Api26Impl.setFontVariationSettings(r0, r5)
        L84:
            r6.recycle()
            android.graphics.Typeface r5 = r4.mFontTypeface
            if (r5 == 0) goto L92
            android.widget.TextView r6 = r4.mView
            int r0 = r4.mStyle
            r6.setTypeface(r5, r0)
        L92:
            return
    }

    void populateSurroundingTextIfNeeded(@androidx.annotation.NonNull android.widget.TextView r3, @androidx.annotation.Nullable android.view.inputmethod.InputConnection r4, @androidx.annotation.NonNull android.view.inputmethod.EditorInfo r5) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 >= r1) goto Lf
            if (r4 == 0) goto Lf
            java.lang.CharSequence r3 = r3.getText()
            androidx.core.view.inputmethod.EditorInfoCompat.setInitialSurroundingText(r5, r3)
        Lf:
            return
    }

    void setAllCaps(boolean r2) {
            r1 = this;
            android.widget.TextView r0 = r1.mView
            r0.setAllCaps(r2)
            return
    }

    void setAutoSizeTextTypeUniformWithConfiguration(int r2, int r3, int r4, int r5) throws java.lang.IllegalArgumentException {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r1.mAutoSizeTextHelper
            r0.setAutoSizeTextTypeUniformWithConfiguration(r2, r3, r4, r5)
            return
    }

    void setAutoSizeTextTypeUniformWithPresetSizes(@androidx.annotation.NonNull int[] r2, int r3) throws java.lang.IllegalArgumentException {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r1.mAutoSizeTextHelper
            r0.setAutoSizeTextTypeUniformWithPresetSizes(r2, r3)
            return
    }

    void setAutoSizeTextTypeWithDefaults(int r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r1.mAutoSizeTextHelper
            r0.setAutoSizeTextTypeWithDefaults(r2)
            return
    }

    void setCompoundDrawableTintList(@androidx.annotation.Nullable android.content.res.ColorStateList r2) {
            r1 = this;
            androidx.appcompat.widget.TintInfo r0 = r1.mDrawableTint
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.TintInfo r0 = new androidx.appcompat.widget.TintInfo
            r0.<init>()
            r1.mDrawableTint = r0
        Lb:
            androidx.appcompat.widget.TintInfo r0 = r1.mDrawableTint
            r0.mTintList = r2
            if (r2 == 0) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            r0.mHasTintList = r2
            r1.setCompoundTints()
            return
    }

    void setCompoundDrawableTintMode(@androidx.annotation.Nullable android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            androidx.appcompat.widget.TintInfo r0 = r1.mDrawableTint
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.TintInfo r0 = new androidx.appcompat.widget.TintInfo
            r0.<init>()
            r1.mDrawableTint = r0
        Lb:
            androidx.appcompat.widget.TintInfo r0 = r1.mDrawableTint
            r0.mTintMode = r2
            if (r2 == 0) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            r0.mHasTintMode = r2
            r1.setCompoundTints()
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    void setTextSize(int r2, float r3) {
            r1 = this;
            boolean r0 = androidx.appcompat.widget.ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE
            if (r0 != 0) goto Ld
            boolean r0 = r1.isAutoSizeEnabled()
            if (r0 != 0) goto Ld
            r1.setTextSizeInternal(r2, r3)
        Ld:
            return
    }
}
