package io.netty.util.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ResourcesUtil {
    private ResourcesUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.io.File getFile(java.lang.Class r3, java.lang.String r4) {
            java.io.File r0 = new java.io.File     // Catch: java.io.UnsupportedEncodingException -> L14
            java.net.URL r1 = r3.getResource(r4)     // Catch: java.io.UnsupportedEncodingException -> L14
            java.lang.String r1 = r1.getFile()     // Catch: java.io.UnsupportedEncodingException -> L14
            java.lang.String r2 = "UTF-8"
            java.lang.String r1 = java.net.URLDecoder.decode(r1, r2)     // Catch: java.io.UnsupportedEncodingException -> L14
            r0.<init>(r1)     // Catch: java.io.UnsupportedEncodingException -> L14
            return r0
        L14:
            java.io.File r0 = new java.io.File
            java.net.URL r3 = r3.getResource(r4)
            java.lang.String r3 = r3.getFile()
            r0.<init>(r3)
            return r0
    }
}
