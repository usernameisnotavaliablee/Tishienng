package androidx.core.text;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class HtmlKt {
    @org.jetbrains.annotations.NotNull
    public static final android.text.Spanned parseAsHtml(@org.jetbrains.annotations.NotNull java.lang.String r0, int r1, @org.jetbrains.annotations.Nullable android.text.Html.ImageGetter r2, @org.jetbrains.annotations.Nullable android.text.Html.TagHandler r3) {
            android.text.Spanned r0 = androidx.core.text.HtmlCompat.fromHtml(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ android.text.Spanned parseAsHtml$default(java.lang.String r1, int r2, android.text.Html.ImageGetter r3, android.text.Html.TagHandler r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L5
            r2 = 0
        L5:
            r6 = r5 & 2
            r0 = 0
            if (r6 == 0) goto Lb
            r3 = r0
        Lb:
            r5 = r5 & 4
            if (r5 == 0) goto L10
            r4 = r0
        L10:
            android.text.Spanned r1 = androidx.core.text.HtmlCompat.fromHtml(r1, r2, r3, r4)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String toHtml(@org.jetbrains.annotations.NotNull android.text.Spanned r0, int r1) {
            java.lang.String r0 = androidx.core.text.HtmlCompat.toHtml(r0, r1)
            return r0
    }

    public static /* synthetic */ java.lang.String toHtml$default(android.text.Spanned r0, int r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            java.lang.String r0 = androidx.core.text.HtmlCompat.toHtml(r0, r1)
            return r0
    }
}
