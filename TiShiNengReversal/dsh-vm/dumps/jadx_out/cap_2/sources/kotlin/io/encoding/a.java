package kotlin.io.encoding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class a {
    @kotlin.SinceKotlin(version = "1.8")
    @kotlin.internal.InlineOnly
    private static final byte[] a(kotlin.io.encoding.Base64 r1, java.lang.CharSequence r2, int r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L31
            java.lang.String r2 = (java.lang.String) r2
            int r0 = r2.length()
            r1.i(r0, r3, r4)
            java.lang.String r1 = r2.substring(r3, r4)
            java.lang.String r2 = "substring(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            java.nio.charset.Charset r2 = kotlin.text.e.g
            java.lang.String r3 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.g0.n(r1, r3)
            byte[] r1 = r1.getBytes(r2)
            java.lang.String r2 = "getBytes(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
        L31:
            byte[] r1 = r1.f(r2, r3, r4)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.8")
    @kotlin.internal.InlineOnly
    private static final int b(kotlin.io.encoding.Base64 r1, byte[] r2, byte[] r3, int r4, int r5, int r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r1 = r1.x(r2, r3, r4, r5, r6)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.8")
    @kotlin.internal.InlineOnly
    private static final byte[] c(kotlin.io.encoding.Base64 r1, byte[] r2, int r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r2, r0)
            byte[] r1 = r1.D(r2, r3, r4)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.8")
    @kotlin.internal.InlineOnly
    private static final java.lang.String d(kotlin.io.encoding.Base64 r1, byte[] r2, int r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r2, r0)
            byte[] r1 = r1.D(r2, r3, r4)
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = kotlin.text.e.g
            r2.<init>(r1, r3)
            return r2
    }
}
