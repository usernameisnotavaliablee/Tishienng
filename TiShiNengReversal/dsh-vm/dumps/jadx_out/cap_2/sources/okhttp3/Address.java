package okhttp3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class Address {

    @org.jetbrains.annotations.Nullable
    private final okhttp3.CertificatePinner certificatePinner;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<okhttp3.ConnectionSpec> connectionSpecs;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.Dns dns;

    @org.jetbrains.annotations.Nullable
    private final javax.net.ssl.HostnameVerifier hostnameVerifier;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<okhttp3.Protocol> protocols;

    @org.jetbrains.annotations.Nullable
    private final java.net.Proxy proxy;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.Authenticator proxyAuthenticator;

    @org.jetbrains.annotations.NotNull
    private final java.net.ProxySelector proxySelector;

    @org.jetbrains.annotations.NotNull
    private final javax.net.SocketFactory socketFactory;

    @org.jetbrains.annotations.Nullable
    private final javax.net.ssl.SSLSocketFactory sslSocketFactory;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.HttpUrl url;

    public Address(@org.jetbrains.annotations.NotNull java.lang.String r2, int r3, @org.jetbrains.annotations.NotNull okhttp3.Dns r4, @org.jetbrains.annotations.NotNull javax.net.SocketFactory r5, @org.jetbrains.annotations.Nullable javax.net.ssl.SSLSocketFactory r6, @org.jetbrains.annotations.Nullable javax.net.ssl.HostnameVerifier r7, @org.jetbrains.annotations.Nullable okhttp3.CertificatePinner r8, @org.jetbrains.annotations.NotNull okhttp3.Authenticator r9, @org.jetbrains.annotations.Nullable java.net.Proxy r10, @org.jetbrains.annotations.NotNull java.util.List<? extends okhttp3.Protocol> r11, @org.jetbrains.annotations.NotNull java.util.List<okhttp3.ConnectionSpec> r12, @org.jetbrains.annotations.NotNull java.net.ProxySelector r13) {
            r1 = this;
            java.lang.String r0 = "uriHost"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "dns"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "socketFactory"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "proxyAuthenticator"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "protocols"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = "connectionSpecs"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "proxySelector"
            kotlin.jvm.internal.g0.p(r13, r0)
            r1.<init>()
            r1.dns = r4
            r1.socketFactory = r5
            r1.sslSocketFactory = r6
            r1.hostnameVerifier = r7
            r1.certificatePinner = r8
            r1.proxyAuthenticator = r9
            r1.proxy = r10
            r1.proxySelector = r13
            okhttp3.HttpUrl$Builder r4 = new okhttp3.HttpUrl$Builder
            r4.<init>()
            if (r6 == 0) goto L40
            java.lang.String r5 = "https"
            goto L42
        L40:
            java.lang.String r5 = "http"
        L42:
            okhttp3.HttpUrl$Builder r4 = r4.scheme(r5)
            okhttp3.HttpUrl$Builder r2 = r4.host(r2)
            okhttp3.HttpUrl$Builder r2 = r2.port(r3)
            okhttp3.HttpUrl r2 = r2.build()
            r1.url = r2
            java.util.List r2 = okhttp3.internal._UtilJvmKt.toImmutableList(r11)
            r1.protocols = r2
            java.util.List r2 = okhttp3.internal._UtilJvmKt.toImmutableList(r12)
            r1.connectionSpecs = r2
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "certificatePinner", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_certificatePinner")
    @org.jetbrains.annotations.Nullable
    /* renamed from: -deprecated_certificatePinner, reason: not valid java name */
    public final okhttp3.CertificatePinner m40deprecated_certificatePinner() {
            r1 = this;
            okhttp3.CertificatePinner r0 = r1.certificatePinner
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "connectionSpecs", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_connectionSpecs")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_connectionSpecs, reason: not valid java name */
    public final java.util.List<okhttp3.ConnectionSpec> m41deprecated_connectionSpecs() {
            r1 = this;
            java.util.List<okhttp3.ConnectionSpec> r0 = r1.connectionSpecs
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "dns", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_dns")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_dns, reason: not valid java name */
    public final okhttp3.Dns m42deprecated_dns() {
            r1 = this;
            okhttp3.Dns r0 = r1.dns
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "hostnameVerifier", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_hostnameVerifier")
    @org.jetbrains.annotations.Nullable
    /* renamed from: -deprecated_hostnameVerifier, reason: not valid java name */
    public final javax.net.ssl.HostnameVerifier m43deprecated_hostnameVerifier() {
            r1 = this;
            javax.net.ssl.HostnameVerifier r0 = r1.hostnameVerifier
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "protocols", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_protocols")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_protocols, reason: not valid java name */
    public final java.util.List<okhttp3.Protocol> m44deprecated_protocols() {
            r1 = this;
            java.util.List<okhttp3.Protocol> r0 = r1.protocols
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "proxy", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_proxy")
    @org.jetbrains.annotations.Nullable
    /* renamed from: -deprecated_proxy, reason: not valid java name */
    public final java.net.Proxy m45deprecated_proxy() {
            r1 = this;
            java.net.Proxy r0 = r1.proxy
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "proxyAuthenticator", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_proxyAuthenticator")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_proxyAuthenticator, reason: not valid java name */
    public final okhttp3.Authenticator m46deprecated_proxyAuthenticator() {
            r1 = this;
            okhttp3.Authenticator r0 = r1.proxyAuthenticator
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "proxySelector", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_proxySelector")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_proxySelector, reason: not valid java name */
    public final java.net.ProxySelector m47deprecated_proxySelector() {
            r1 = this;
            java.net.ProxySelector r0 = r1.proxySelector
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "socketFactory", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_socketFactory")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_socketFactory, reason: not valid java name */
    public final javax.net.SocketFactory m48deprecated_socketFactory() {
            r1 = this;
            javax.net.SocketFactory r0 = r1.socketFactory
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "sslSocketFactory", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_sslSocketFactory")
    @org.jetbrains.annotations.Nullable
    /* renamed from: -deprecated_sslSocketFactory, reason: not valid java name */
    public final javax.net.ssl.SSLSocketFactory m49deprecated_sslSocketFactory() {
            r1 = this;
            javax.net.ssl.SSLSocketFactory r0 = r1.sslSocketFactory
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "url", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_url")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_url, reason: not valid java name */
    public final okhttp3.HttpUrl m50deprecated_url() {
            r1 = this;
            okhttp3.HttpUrl r0 = r1.url
            return r0
    }

    @kotlin.jvm.JvmName(name = "certificatePinner")
    @org.jetbrains.annotations.Nullable
    public final okhttp3.CertificatePinner certificatePinner() {
            r1 = this;
            okhttp3.CertificatePinner r0 = r1.certificatePinner
            return r0
    }

    @kotlin.jvm.JvmName(name = "connectionSpecs")
    @org.jetbrains.annotations.NotNull
    public final java.util.List<okhttp3.ConnectionSpec> connectionSpecs() {
            r1 = this;
            java.util.List<okhttp3.ConnectionSpec> r0 = r1.connectionSpecs
            return r0
    }

    @kotlin.jvm.JvmName(name = "dns")
    @org.jetbrains.annotations.NotNull
    public final okhttp3.Dns dns() {
            r1 = this;
            okhttp3.Dns r0 = r1.dns
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof okhttp3.Address
            if (r0 == 0) goto L18
            okhttp3.HttpUrl r0 = r2.url
            okhttp3.Address r3 = (okhttp3.Address) r3
            okhttp3.HttpUrl r1 = r3.url
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L18
            boolean r3 = r2.equalsNonHost$okhttp(r3)
            if (r3 == 0) goto L18
            r3 = 1
            return r3
        L18:
            r3 = 0
            return r3
    }

    public final boolean equalsNonHost$okhttp(@org.jetbrains.annotations.NotNull okhttp3.Address r3) {
            r2 = this;
            java.lang.String r0 = "that"
            kotlin.jvm.internal.g0.p(r3, r0)
            okhttp3.Dns r0 = r2.dns
            okhttp3.Dns r1 = r3.dns
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L6f
            okhttp3.Authenticator r0 = r2.proxyAuthenticator
            okhttp3.Authenticator r1 = r3.proxyAuthenticator
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L6f
            java.util.List<okhttp3.Protocol> r0 = r2.protocols
            java.util.List<okhttp3.Protocol> r1 = r3.protocols
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L6f
            java.util.List<okhttp3.ConnectionSpec> r0 = r2.connectionSpecs
            java.util.List<okhttp3.ConnectionSpec> r1 = r3.connectionSpecs
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L6f
            java.net.ProxySelector r0 = r2.proxySelector
            java.net.ProxySelector r1 = r3.proxySelector
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L6f
            java.net.Proxy r0 = r2.proxy
            java.net.Proxy r1 = r3.proxy
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L6f
            javax.net.ssl.SSLSocketFactory r0 = r2.sslSocketFactory
            javax.net.ssl.SSLSocketFactory r1 = r3.sslSocketFactory
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L6f
            javax.net.ssl.HostnameVerifier r0 = r2.hostnameVerifier
            javax.net.ssl.HostnameVerifier r1 = r3.hostnameVerifier
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L6f
            okhttp3.CertificatePinner r0 = r2.certificatePinner
            okhttp3.CertificatePinner r1 = r3.certificatePinner
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L6f
            okhttp3.HttpUrl r0 = r2.url
            int r0 = r0.port()
            okhttp3.HttpUrl r3 = r3.url
            int r3 = r3.port()
            if (r0 != r3) goto L6f
            r3 = 1
            return r3
        L6f:
            r3 = 0
            return r3
    }

    public int hashCode() {
            r2 = this;
            okhttp3.HttpUrl r0 = r2.url
            int r0 = r0.hashCode()
            r1 = 527(0x20f, float:7.38E-43)
            int r1 = r1 + r0
            int r1 = r1 * 31
            okhttp3.Dns r0 = r2.dns
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            okhttp3.Authenticator r0 = r2.proxyAuthenticator
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.List<okhttp3.Protocol> r0 = r2.protocols
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.List<okhttp3.ConnectionSpec> r0 = r2.connectionSpecs
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.net.ProxySelector r0 = r2.proxySelector
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.net.Proxy r0 = r2.proxy
            int r0 = java.util.Objects.hashCode(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            javax.net.ssl.SSLSocketFactory r0 = r2.sslSocketFactory
            int r0 = java.util.Objects.hashCode(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            javax.net.ssl.HostnameVerifier r0 = r2.hostnameVerifier
            int r0 = java.util.Objects.hashCode(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            okhttp3.CertificatePinner r0 = r2.certificatePinner
            int r0 = java.util.Objects.hashCode(r0)
            int r1 = r1 + r0
            return r1
    }

    @kotlin.jvm.JvmName(name = "hostnameVerifier")
    @org.jetbrains.annotations.Nullable
    public final javax.net.ssl.HostnameVerifier hostnameVerifier() {
            r1 = this;
            javax.net.ssl.HostnameVerifier r0 = r1.hostnameVerifier
            return r0
    }

    @kotlin.jvm.JvmName(name = "protocols")
    @org.jetbrains.annotations.NotNull
    public final java.util.List<okhttp3.Protocol> protocols() {
            r1 = this;
            java.util.List<okhttp3.Protocol> r0 = r1.protocols
            return r0
    }

    @kotlin.jvm.JvmName(name = "proxy")
    @org.jetbrains.annotations.Nullable
    public final java.net.Proxy proxy() {
            r1 = this;
            java.net.Proxy r0 = r1.proxy
            return r0
    }

    @kotlin.jvm.JvmName(name = "proxyAuthenticator")
    @org.jetbrains.annotations.NotNull
    public final okhttp3.Authenticator proxyAuthenticator() {
            r1 = this;
            okhttp3.Authenticator r0 = r1.proxyAuthenticator
            return r0
    }

    @kotlin.jvm.JvmName(name = "proxySelector")
    @org.jetbrains.annotations.NotNull
    public final java.net.ProxySelector proxySelector() {
            r1 = this;
            java.net.ProxySelector r0 = r1.proxySelector
            return r0
    }

    @kotlin.jvm.JvmName(name = "socketFactory")
    @org.jetbrains.annotations.NotNull
    public final javax.net.SocketFactory socketFactory() {
            r1 = this;
            javax.net.SocketFactory r0 = r1.socketFactory
            return r0
    }

    @kotlin.jvm.JvmName(name = "sslSocketFactory")
    @org.jetbrains.annotations.Nullable
    public final javax.net.ssl.SSLSocketFactory sslSocketFactory() {
            r1 = this;
            javax.net.ssl.SSLSocketFactory r0 = r1.sslSocketFactory
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Address{"
            r0.append(r1)
            okhttp3.HttpUrl r1 = r3.url
            java.lang.String r1 = r1.host()
            r0.append(r1)
            r1 = 58
            r0.append(r1)
            okhttp3.HttpUrl r1 = r3.url
            int r1 = r1.port()
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            java.net.Proxy r1 = r3.proxy
            if (r1 == 0) goto L3e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "proxy="
            r1.append(r2)
            java.net.Proxy r2 = r3.proxy
        L36:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L4b
        L3e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "proxySelector="
            r1.append(r2)
            java.net.ProxySelector r2 = r3.proxySelector
            goto L36
        L4b:
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @kotlin.jvm.JvmName(name = "url")
    @org.jetbrains.annotations.NotNull
    public final okhttp3.HttpUrl url() {
            r1 = this;
            okhttp3.HttpUrl r0 = r1.url
            return r0
    }
}
