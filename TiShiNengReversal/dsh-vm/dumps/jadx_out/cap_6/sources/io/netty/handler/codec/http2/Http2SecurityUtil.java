package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class Http2SecurityUtil {
    public static final java.util.List<java.lang.String> CIPHERS = null;
    private static final java.util.List<java.lang.String> CIPHERS_JAVA_MOZILLA_MODERN_SECURITY = null;

    static {
            java.lang.String r4 = "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256"
            java.lang.String r5 = "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256"
            java.lang.String r0 = "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384"
            java.lang.String r1 = "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384"
            java.lang.String r2 = "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256"
            java.lang.String r3 = "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5}
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            io.netty.handler.codec.http2.Http2SecurityUtil.CIPHERS_JAVA_MOZILLA_MODERN_SECURITY = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r1)
            io.netty.handler.codec.http2.Http2SecurityUtil.CIPHERS = r0
            return
    }

    private Http2SecurityUtil() {
            r0 = this;
            r0.<init>()
            return
    }
}
