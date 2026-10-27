package androidx.core.content.res;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class TypedArrayKt {
    private static final void checkAttribute(android.content.res.TypedArray r0, @androidx.annotation.StyleableRes int r1) {
            boolean r0 = r0.hasValue(r1)
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Attribute not defined in set."
            r0.<init>(r1)
            throw r0
    }

    public static final boolean getBooleanOrThrow(@org.jetbrains.annotations.NotNull android.content.res.TypedArray r1, @androidx.annotation.StyleableRes int r2) {
            checkAttribute(r1, r2)
            r0 = 0
            boolean r1 = r1.getBoolean(r2, r0)
            return r1
    }

    @androidx.annotation.ColorInt
    public static final int getColorOrThrow(@org.jetbrains.annotations.NotNull android.content.res.TypedArray r1, @androidx.annotation.StyleableRes int r2) {
            checkAttribute(r1, r2)
            r0 = 0
            int r1 = r1.getColor(r2, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final android.content.res.ColorStateList getColorStateListOrThrow(@org.jetbrains.annotations.NotNull android.content.res.TypedArray r0, @androidx.annotation.StyleableRes int r1) {
            checkAttribute(r0, r1)
            android.content.res.ColorStateList r0 = r0.getColorStateList(r1)
            if (r0 == 0) goto La
            return r0
        La:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Attribute value was not a color or color state list."
            r0.<init>(r1)
            throw r0
    }

    public static final float getDimensionOrThrow(@org.jetbrains.annotations.NotNull android.content.res.TypedArray r1, @androidx.annotation.StyleableRes int r2) {
            checkAttribute(r1, r2)
            r0 = 0
            float r1 = r1.getDimension(r2, r0)
            return r1
    }

    @androidx.annotation.Dimension
    public static final int getDimensionPixelOffsetOrThrow(@org.jetbrains.annotations.NotNull android.content.res.TypedArray r1, @androidx.annotation.StyleableRes int r2) {
            checkAttribute(r1, r2)
            r0 = 0
            int r1 = r1.getDimensionPixelOffset(r2, r0)
            return r1
    }

    @androidx.annotation.Dimension
    public static final int getDimensionPixelSizeOrThrow(@org.jetbrains.annotations.NotNull android.content.res.TypedArray r1, @androidx.annotation.StyleableRes int r2) {
            checkAttribute(r1, r2)
            r0 = 0
            int r1 = r1.getDimensionPixelSize(r2, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.drawable.Drawable getDrawableOrThrow(@org.jetbrains.annotations.NotNull android.content.res.TypedArray r0, @androidx.annotation.StyleableRes int r1) {
            checkAttribute(r0, r1)
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)
            kotlin.jvm.internal.g0.m(r0)
            return r0
    }

    public static final float getFloatOrThrow(@org.jetbrains.annotations.NotNull android.content.res.TypedArray r1, @androidx.annotation.StyleableRes int r2) {
            checkAttribute(r1, r2)
            r0 = 0
            float r1 = r1.getFloat(r2, r0)
            return r1
    }

    @androidx.annotation.RequiresApi(26)
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Typeface getFontOrThrow(@org.jetbrains.annotations.NotNull android.content.res.TypedArray r0, @androidx.annotation.StyleableRes int r1) {
            checkAttribute(r0, r1)
            android.graphics.Typeface r0 = androidx.core.content.res.TypedArrayApi26ImplKt.getFont(r0, r1)
            return r0
    }

    public static final int getIntOrThrow(@org.jetbrains.annotations.NotNull android.content.res.TypedArray r1, @androidx.annotation.StyleableRes int r2) {
            checkAttribute(r1, r2)
            r0 = 0
            int r1 = r1.getInt(r2, r0)
            return r1
    }

    public static final int getIntegerOrThrow(@org.jetbrains.annotations.NotNull android.content.res.TypedArray r1, @androidx.annotation.StyleableRes int r2) {
            checkAttribute(r1, r2)
            r0 = 0
            int r1 = r1.getInteger(r2, r0)
            return r1
    }

    @androidx.annotation.AnyRes
    public static final int getResourceIdOrThrow(@org.jetbrains.annotations.NotNull android.content.res.TypedArray r1, @androidx.annotation.StyleableRes int r2) {
            checkAttribute(r1, r2)
            r0 = 0
            int r1 = r1.getResourceId(r2, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String getStringOrThrow(@org.jetbrains.annotations.NotNull android.content.res.TypedArray r0, @androidx.annotation.StyleableRes int r1) {
            checkAttribute(r0, r1)
            java.lang.String r0 = r0.getString(r1)
            if (r0 == 0) goto La
            return r0
        La:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Attribute value could not be coerced to String."
            r0.<init>(r1)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.CharSequence[] getTextArrayOrThrow(@org.jetbrains.annotations.NotNull android.content.res.TypedArray r0, @androidx.annotation.StyleableRes int r1) {
            checkAttribute(r0, r1)
            java.lang.CharSequence[] r0 = r0.getTextArray(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.CharSequence getTextOrThrow(@org.jetbrains.annotations.NotNull android.content.res.TypedArray r0, @androidx.annotation.StyleableRes int r1) {
            checkAttribute(r0, r1)
            java.lang.CharSequence r0 = r0.getText(r1)
            if (r0 == 0) goto La
            return r0
        La:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Attribute value could not be coerced to CharSequence."
            r0.<init>(r1)
            throw r0
    }

    public static final <R> R use(@org.jetbrains.annotations.NotNull android.content.res.TypedArray r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.content.res.TypedArray, ? extends R> r1) {
            java.lang.Object r1 = r1.invoke(r0)
            r0.recycle()
            return r1
    }
}
