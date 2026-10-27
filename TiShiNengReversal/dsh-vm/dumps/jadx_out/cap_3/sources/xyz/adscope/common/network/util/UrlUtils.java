package xyz.adscope.common.network.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class UrlUtils {
    public UrlUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String urlDecode(java.lang.String r0, java.lang.String r1) {
            java.lang.String r0 = java.net.URLDecoder.decode(r0, r1)     // Catch: java.io.UnsupportedEncodingException -> L4
        L4:
            return r0
    }

    public static java.lang.String urlDecode(java.lang.String r0, java.nio.charset.Charset r1) {
            java.lang.String r1 = r1.name()
            java.lang.String r0 = urlDecode(r0, r1)
            return r0
    }

    public static java.lang.String urlEncode(java.lang.String r0, java.lang.String r1) {
            java.lang.String r0 = java.net.URLEncoder.encode(r0, r1)     // Catch: java.io.UnsupportedEncodingException -> L4
        L4:
            return r0
    }

    public static java.lang.String urlEncode(java.lang.String r0, java.nio.charset.Charset r1) {
            java.lang.String r1 = r1.name()
            java.lang.String r0 = urlEncode(r0, r1)
            return r0
    }
}
