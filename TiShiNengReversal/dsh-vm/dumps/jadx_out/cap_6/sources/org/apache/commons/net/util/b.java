package org.apache.commons.net.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b {
    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.nio.charset.Charset a(java.lang.String r0) {
            if (r0 != 0) goto L7
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            return r0
        L7:
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            return r0
    }

    public static java.nio.charset.Charset b(java.lang.String r0, java.lang.String r1) {
            if (r0 != 0) goto L7
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r1)
            return r0
        L7:
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            return r0
    }
}
