package androidx.core.text;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSpannableStringBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpannableStringBuilder.kt\nandroidx/core/text/SpannableStringBuilderKt\n*L\n1#1,163:1\n74#1,4:164\n74#1,4:168\n74#1,4:172\n74#1,4:176\n74#1,4:180\n74#1,4:184\n74#1,4:188\n74#1,4:192\n74#1,4:196\n*S KotlinDebug\n*F\n+ 1 SpannableStringBuilder.kt\nandroidx/core/text/SpannableStringBuilderKt\n*L\n87#1:164,4\n96#1:168,4\n105#1:172,4\n115#1:176,4\n125#1:180,4\n134#1:184,4\n144#1:188,4\n153#1:192,4\n162#1:196,4\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class SpannableStringBuilderKt {
    @org.jetbrains.annotations.NotNull
    public static final android.text.SpannableStringBuilder backgroundColor(@org.jetbrains.annotations.NotNull android.text.SpannableStringBuilder r2, @androidx.annotation.ColorInt int r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.text.SpannableStringBuilder, kotlin.n1> r4) {
            android.text.style.BackgroundColorSpan r0 = new android.text.style.BackgroundColorSpan
            r0.<init>(r3)
            int r3 = r2.length()
            r4.invoke(r2)
            int r4 = r2.length()
            r1 = 17
            r2.setSpan(r0, r3, r4, r1)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final android.text.SpannableStringBuilder bold(@org.jetbrains.annotations.NotNull android.text.SpannableStringBuilder r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.text.SpannableStringBuilder, kotlin.n1> r4) {
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r1 = 1
            r0.<init>(r1)
            int r1 = r3.length()
            r4.invoke(r3)
            int r4 = r3.length()
            r2 = 17
            r3.setSpan(r0, r1, r4, r2)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final android.text.SpannedString buildSpannedString(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.text.SpannableStringBuilder, kotlin.n1> r1) {
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>()
            r1.invoke(r0)
            android.text.SpannedString r1 = new android.text.SpannedString
            r1.<init>(r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final android.text.SpannableStringBuilder color(@org.jetbrains.annotations.NotNull android.text.SpannableStringBuilder r2, @androidx.annotation.ColorInt int r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.text.SpannableStringBuilder, kotlin.n1> r4) {
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r3)
            int r3 = r2.length()
            r4.invoke(r2)
            int r4 = r2.length()
            r1 = 17
            r2.setSpan(r0, r3, r4, r1)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final android.text.SpannableStringBuilder inSpans(@org.jetbrains.annotations.NotNull android.text.SpannableStringBuilder r2, @org.jetbrains.annotations.NotNull java.lang.Object r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.text.SpannableStringBuilder, kotlin.n1> r4) {
            int r0 = r2.length()
            r4.invoke(r2)
            int r4 = r2.length()
            r1 = 17
            r2.setSpan(r3, r0, r4, r1)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final android.text.SpannableStringBuilder inSpans(@org.jetbrains.annotations.NotNull android.text.SpannableStringBuilder r5, @org.jetbrains.annotations.NotNull java.lang.Object[] r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.text.SpannableStringBuilder, kotlin.n1> r7) {
            int r0 = r5.length()
            r7.invoke(r5)
            int r7 = r6.length
            r1 = 0
        L9:
            if (r1 >= r7) goto L19
            r2 = r6[r1]
            int r3 = r5.length()
            r4 = 17
            r5.setSpan(r2, r0, r3, r4)
            int r1 = r1 + 1
            goto L9
        L19:
            return r5
    }

    @org.jetbrains.annotations.NotNull
    public static final android.text.SpannableStringBuilder italic(@org.jetbrains.annotations.NotNull android.text.SpannableStringBuilder r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.text.SpannableStringBuilder, kotlin.n1> r4) {
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r1 = 2
            r0.<init>(r1)
            int r1 = r3.length()
            r4.invoke(r3)
            int r4 = r3.length()
            r2 = 17
            r3.setSpan(r0, r1, r4, r2)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final android.text.SpannableStringBuilder scale(@org.jetbrains.annotations.NotNull android.text.SpannableStringBuilder r2, float r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.text.SpannableStringBuilder, kotlin.n1> r4) {
            android.text.style.RelativeSizeSpan r0 = new android.text.style.RelativeSizeSpan
            r0.<init>(r3)
            int r3 = r2.length()
            r4.invoke(r2)
            int r4 = r2.length()
            r1 = 17
            r2.setSpan(r0, r3, r4, r1)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final android.text.SpannableStringBuilder strikeThrough(@org.jetbrains.annotations.NotNull android.text.SpannableStringBuilder r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.text.SpannableStringBuilder, kotlin.n1> r4) {
            android.text.style.StrikethroughSpan r0 = new android.text.style.StrikethroughSpan
            r0.<init>()
            int r1 = r3.length()
            r4.invoke(r3)
            int r4 = r3.length()
            r2 = 17
            r3.setSpan(r0, r1, r4, r2)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final android.text.SpannableStringBuilder subscript(@org.jetbrains.annotations.NotNull android.text.SpannableStringBuilder r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.text.SpannableStringBuilder, kotlin.n1> r4) {
            android.text.style.SubscriptSpan r0 = new android.text.style.SubscriptSpan
            r0.<init>()
            int r1 = r3.length()
            r4.invoke(r3)
            int r4 = r3.length()
            r2 = 17
            r3.setSpan(r0, r1, r4, r2)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final android.text.SpannableStringBuilder superscript(@org.jetbrains.annotations.NotNull android.text.SpannableStringBuilder r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.text.SpannableStringBuilder, kotlin.n1> r4) {
            android.text.style.SuperscriptSpan r0 = new android.text.style.SuperscriptSpan
            r0.<init>()
            int r1 = r3.length()
            r4.invoke(r3)
            int r4 = r3.length()
            r2 = 17
            r3.setSpan(r0, r1, r4, r2)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final android.text.SpannableStringBuilder underline(@org.jetbrains.annotations.NotNull android.text.SpannableStringBuilder r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.text.SpannableStringBuilder, kotlin.n1> r4) {
            android.text.style.UnderlineSpan r0 = new android.text.style.UnderlineSpan
            r0.<init>()
            int r1 = r3.length()
            r4.invoke(r3)
            int r4 = r3.length()
            r2 = 17
            r3.setSpan(r0, r1, r4, r2)
            return r3
    }
}
