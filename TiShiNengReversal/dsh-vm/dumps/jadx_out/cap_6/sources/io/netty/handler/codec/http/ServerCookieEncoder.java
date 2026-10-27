package io.netty.handler.codec.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class ServerCookieEncoder {
    private ServerCookieEncoder() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public static java.lang.String encode(io.netty.handler.codec.http.Cookie r1) {
            io.netty.handler.codec.http.cookie.ServerCookieEncoder r0 = io.netty.handler.codec.http.cookie.ServerCookieEncoder.LAX
            java.lang.String r1 = r0.encode(r1)
            return r1
    }

    @java.lang.Deprecated
    public static java.lang.String encode(java.lang.String r1, java.lang.String r2) {
            io.netty.handler.codec.http.cookie.ServerCookieEncoder r0 = io.netty.handler.codec.http.cookie.ServerCookieEncoder.LAX
            java.lang.String r1 = r0.encode(r1, r2)
            return r1
    }

    @java.lang.Deprecated
    public static java.util.List<java.lang.String> encode(java.lang.Iterable<io.netty.handler.codec.http.Cookie> r1) {
            io.netty.handler.codec.http.cookie.ServerCookieEncoder r0 = io.netty.handler.codec.http.cookie.ServerCookieEncoder.LAX
            java.util.List r1 = r0.encode(r1)
            return r1
    }

    @java.lang.Deprecated
    public static java.util.List<java.lang.String> encode(java.util.Collection<io.netty.handler.codec.http.Cookie> r1) {
            io.netty.handler.codec.http.cookie.ServerCookieEncoder r0 = io.netty.handler.codec.http.cookie.ServerCookieEncoder.LAX
            java.util.List r1 = r0.encode(r1)
            return r1
    }

    @java.lang.Deprecated
    public static java.util.List<java.lang.String> encode(io.netty.handler.codec.http.Cookie... r1) {
            io.netty.handler.codec.http.cookie.ServerCookieEncoder r0 = io.netty.handler.codec.http.cookie.ServerCookieEncoder.LAX
            java.util.List r1 = r0.encode(r1)
            return r1
    }
}
