package androidx.core.text;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSpannableString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpannableString.kt\nandroidx/core/text/SpannableStringKt\n+ 2 SpannedString.kt\nandroidx/core/text/SpannedStringKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,66:1\n31#2,4:67\n13579#3,2:71\n*S KotlinDebug\n*F\n+ 1 SpannableString.kt\nandroidx/core/text/SpannableStringKt\n*L\n32#1:67,4\n32#1:71,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class SpannableStringKt {
    public static final void clearSpans(@org.jetbrains.annotations.NotNull android.text.Spannable r4) {
            int r0 = r4.length()
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r2 = 0
            java.lang.Object[] r0 = r4.getSpans(r2, r0, r1)
            int r1 = r0.length
        Lc:
            if (r2 >= r1) goto L16
            r3 = r0[r2]
            r4.removeSpan(r3)
            int r2 = r2 + 1
            goto Lc
        L16:
            return
    }

    public static final void set(@org.jetbrains.annotations.NotNull android.text.Spannable r1, int r2, int r3, @org.jetbrains.annotations.NotNull java.lang.Object r4) {
            r0 = 17
            r1.setSpan(r4, r2, r3, r0)
            return
    }

    public static final void set(@org.jetbrains.annotations.NotNull android.text.Spannable r2, @org.jetbrains.annotations.NotNull kotlin.ranges.m r3, @org.jetbrains.annotations.NotNull java.lang.Object r4) {
            java.lang.Integer r0 = r3.r()
            int r0 = r0.intValue()
            java.lang.Integer r3 = r3.q()
            int r3 = r3.intValue()
            r1 = 17
            r2.setSpan(r4, r0, r3, r1)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final android.text.Spannable toSpannable(@org.jetbrains.annotations.NotNull java.lang.CharSequence r0) {
            android.text.SpannableString r0 = android.text.SpannableString.valueOf(r0)
            return r0
    }
}
