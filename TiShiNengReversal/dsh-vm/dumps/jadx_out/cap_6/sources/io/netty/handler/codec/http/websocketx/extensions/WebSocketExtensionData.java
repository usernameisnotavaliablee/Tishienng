package io.netty.handler.codec.http.websocketx.extensions;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class WebSocketExtensionData {
    private final java.lang.String name;
    private final java.util.Map<java.lang.String, java.lang.String> parameters;

    public WebSocketExtensionData(java.lang.String r1, java.util.Map<java.lang.String, java.lang.String> r2) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L18
            if (r2 == 0) goto L10
            r0.name = r1
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r2)
            r0.parameters = r1
            return
        L10:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "parameters"
            r1.<init>(r2)
            throw r1
        L18:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "name"
            r1.<init>(r2)
            throw r1
    }

    public java.lang.String name() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public java.util.Map<java.lang.String, java.lang.String> parameters() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.parameters
            return r0
    }
}
