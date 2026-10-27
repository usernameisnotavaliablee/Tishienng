package kotlin.io.encoding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class f {
    public f() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.io.encoding.ExperimentalEncodingApi
    @kotlin.SinceKotlin(version = "1.8")
    @org.jetbrains.annotations.NotNull
    public static final java.io.InputStream a(@org.jetbrains.annotations.NotNull java.io.InputStream r1, @org.jetbrains.annotations.NotNull kotlin.io.encoding.Base64 r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "base64"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.io.encoding.c r0 = new kotlin.io.encoding.c
            r0.<init>(r1, r2)
            return r0
    }

    @kotlin.io.encoding.ExperimentalEncodingApi
    @kotlin.SinceKotlin(version = "1.8")
    @org.jetbrains.annotations.NotNull
    public static final java.io.OutputStream b(@org.jetbrains.annotations.NotNull java.io.OutputStream r1, @org.jetbrains.annotations.NotNull kotlin.io.encoding.Base64 r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "base64"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.io.encoding.d r0 = new kotlin.io.encoding.d
            r0.<init>(r1, r2)
            return r0
    }
}
