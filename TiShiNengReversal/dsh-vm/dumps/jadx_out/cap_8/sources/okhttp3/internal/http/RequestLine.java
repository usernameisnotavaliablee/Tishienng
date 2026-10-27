package okhttp3.internal.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class RequestLine {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.http.RequestLine INSTANCE = null;

    static {
            okhttp3.internal.http.RequestLine r0 = new okhttp3.internal.http.RequestLine
            r0.<init>()
            okhttp3.internal.http.RequestLine.INSTANCE = r0
            return
    }

    private RequestLine() {
            r0 = this;
            r0.<init>()
            return
    }

    private final boolean includeAuthorityInRequestLine(okhttp3.Request r1, java.net.Proxy.Type r2) {
            r0 = this;
            boolean r1 = r1.isHttps()
            if (r1 != 0) goto Lc
            java.net.Proxy$Type r1 = java.net.Proxy.Type.HTTP
            if (r2 != r1) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String get(@org.jetbrains.annotations.NotNull okhttp3.Request r3, @org.jetbrains.annotations.NotNull java.net.Proxy.Type r4) {
            r2 = this;
            java.lang.String r0 = "request"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "proxyType"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.method()
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            okhttp3.internal.http.RequestLine r1 = okhttp3.internal.http.RequestLine.INSTANCE
            boolean r4 = r1.includeAuthorityInRequestLine(r3, r4)
            if (r4 == 0) goto L2b
            okhttp3.HttpUrl r3 = r3.url()
            r0.append(r3)
            goto L36
        L2b:
            okhttp3.HttpUrl r3 = r3.url()
            java.lang.String r3 = r1.requestPath(r3)
            r0.append(r3)
        L36:
            java.lang.String r3 = " HTTP/1.1"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String requestPath(@org.jetbrains.annotations.NotNull okhttp3.HttpUrl r3) {
            r2 = this;
            java.lang.String r0 = "url"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = r3.encodedPath()
            java.lang.String r3 = r3.encodedQuery()
            if (r3 == 0) goto L24
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r0 = 63
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            return r3
        L24:
            return r0
    }
}
