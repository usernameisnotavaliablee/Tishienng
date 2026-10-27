package kotlin.text;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class d0 extends kotlin.text.c0 {
    public d0() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final java.lang.String A0(int r1, kotlin.jvm.functions.Function1<? super java.lang.StringBuilder, kotlin.n1> r2) {
            java.lang.String r0 = "builderAction"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r2.invoke(r0)
            java.lang.String r1 = r0.toString()
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final java.lang.String B0(kotlin.jvm.functions.Function1<? super java.lang.StringBuilder, kotlin.n1> r1) {
            java.lang.String r0 = "builderAction"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1.invoke(r0)
            java.lang.String r1 = r0.toString()
            return r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use append(value: Any?) instead", replaceWith = @kotlin.ReplaceWith(expression = "append(value = obj)", imports = {}))
    @kotlin.internal.InlineOnly
    private static final java.lang.StringBuilder p0(java.lang.StringBuilder r1, java.lang.Object r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r1.append(r2)
            return r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use appendRange instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.appendRange(str, offset, offset + len)", imports = {}))
    @kotlin.internal.InlineOnly
    private static final java.lang.StringBuilder q0(java.lang.StringBuilder r0, char[] r1, int r2, int r3) {
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.g0.p(r0, r2)
            java.lang.String r0 = "str"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.NotImplementedError r0 = new kotlin.NotImplementedError
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.StringBuilder r0(@org.jetbrains.annotations.NotNull java.lang.StringBuilder r3, @org.jetbrains.annotations.NotNull java.lang.Object... r4) {
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

    @org.jetbrains.annotations.NotNull
    public static java.lang.StringBuilder s0(@org.jetbrains.annotations.NotNull java.lang.StringBuilder r3, @org.jetbrains.annotations.NotNull java.lang.String... r4) {
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

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final java.lang.StringBuilder t0(java.lang.StringBuilder r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r0 = 10
            r1.append(r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final java.lang.StringBuilder u0(java.lang.StringBuilder r1, char r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r1.append(r2)
            r2 = 10
            r1.append(r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final java.lang.StringBuilder v0(java.lang.StringBuilder r1, java.lang.CharSequence r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r1.append(r2)
            r2 = 10
            r1.append(r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final java.lang.StringBuilder w0(java.lang.StringBuilder r1, java.lang.Object r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r1.append(r2)
            r2 = 10
            r1.append(r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final java.lang.StringBuilder x0(java.lang.StringBuilder r1, java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r1.append(r2)
            r2 = 10
            r1.append(r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final java.lang.StringBuilder y0(java.lang.StringBuilder r1, boolean r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r1.append(r2)
            r2 = 10
            r1.append(r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final java.lang.StringBuilder z0(java.lang.StringBuilder r1, char[] r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.append(r2)
            r2 = 10
            r1.append(r2)
            return r1
    }
}
