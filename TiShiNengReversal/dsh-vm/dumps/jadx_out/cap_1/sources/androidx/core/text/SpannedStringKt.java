package androidx.core.text;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class SpannedStringKt {
    public static final /* synthetic */ <T> T[] getSpans(android.text.Spanned r2, int r3, int r4) {
            r0 = 4
            java.lang.String r1 = "T"
            kotlin.jvm.internal.g0.y(r0, r1)
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.Object[] r2 = r2.getSpans(r3, r4, r0)
            return r2
    }

    public static /* synthetic */ java.lang.Object[] getSpans$default(android.text.Spanned r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Ld
            int r2 = r0.length()
        Ld:
            r3 = 4
            java.lang.String r4 = "T"
            kotlin.jvm.internal.g0.y(r3, r4)
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            java.lang.Object[] r0 = r0.getSpans(r1, r2, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.text.Spanned toSpanned(@org.jetbrains.annotations.NotNull java.lang.CharSequence r0) {
            android.text.SpannedString r0 = android.text.SpannedString.valueOf(r0)
            return r0
    }
}
