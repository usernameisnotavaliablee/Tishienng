package kotlin.text;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class v {
    public v() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final <T extends java.lang.Appendable> T a(@org.jetbrains.annotations.NotNull T r3, @org.jetbrains.annotations.NotNull java.lang.CharSequence... r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r4.length
            r1 = 0
        Lc:
            if (r1 >= r0) goto L16
            r2 = r4[r1]
            r3.append(r2)
            int r1 = r1 + 1
            goto Lc
        L16:
            return r3
    }

    public static <T> void b(@org.jetbrains.annotations.NotNull java.lang.Appendable r1, T r2, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super T, ? extends java.lang.CharSequence> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            if (r3 == 0) goto L11
            java.lang.Object r2 = r3.invoke(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.append(r2)
            return
        L11:
            if (r2 != 0) goto L15
            r3 = 1
            goto L17
        L15:
            boolean r3 = r2 instanceof java.lang.CharSequence
        L17:
            if (r3 == 0) goto L1f
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.append(r2)
            return
        L1f:
            boolean r3 = r2 instanceof java.lang.Character
            if (r3 == 0) goto L2d
            java.lang.Character r2 = (java.lang.Character) r2
            char r2 = r2.charValue()
            r1.append(r2)
            return
        L2d:
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            return
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final java.lang.Appendable c(java.lang.Appendable r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r0 = 10
            java.lang.Appendable r1 = r1.append(r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final java.lang.Appendable d(java.lang.Appendable r1, char r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Appendable r1 = r1.append(r2)
            r2 = 10
            java.lang.Appendable r1 = r1.append(r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final java.lang.Appendable e(java.lang.Appendable r1, java.lang.CharSequence r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Appendable r1 = r1.append(r2)
            r2 = 10
            java.lang.Appendable r1 = r1.append(r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.NotNull
    public static final <T extends java.lang.Appendable> T f(@org.jetbrains.annotations.NotNull T r1, @org.jetbrains.annotations.NotNull java.lang.CharSequence r2, int r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Appendable r1 = r1.append(r2, r3, r4)
            java.lang.String r2 = "null cannot be cast to non-null type T of kotlin.text.StringsKt__AppendableKt.appendRange"
            kotlin.jvm.internal.g0.n(r1, r2)
            return r1
    }
}
