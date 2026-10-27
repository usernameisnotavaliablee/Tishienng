package okhttp3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class Route {

    @org.jetbrains.annotations.NotNull
    private final okhttp3.Address address;

    @org.jetbrains.annotations.NotNull
    private final java.net.Proxy proxy;

    @org.jetbrains.annotations.NotNull
    private final java.net.InetSocketAddress socketAddress;

    public Route(@org.jetbrains.annotations.NotNull okhttp3.Address r2, @org.jetbrains.annotations.NotNull java.net.Proxy r3, @org.jetbrains.annotations.NotNull java.net.InetSocketAddress r4) {
            r1 = this;
            java.lang.String r0 = "address"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "proxy"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "socketAddress"
            kotlin.jvm.internal.g0.p(r4, r0)
            r1.<init>()
            r1.address = r2
            r1.proxy = r3
            r1.socketAddress = r4
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "address", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_address")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_address, reason: not valid java name */
    public final okhttp3.Address m179deprecated_address() {
            r1 = this;
            okhttp3.Address r0 = r1.address
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "proxy", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_proxy")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_proxy, reason: not valid java name */
    public final java.net.Proxy m180deprecated_proxy() {
            r1 = this;
            java.net.Proxy r0 = r1.proxy
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "socketAddress", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_socketAddress")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_socketAddress, reason: not valid java name */
    public final java.net.InetSocketAddress m181deprecated_socketAddress() {
            r1 = this;
            java.net.InetSocketAddress r0 = r1.socketAddress
            return r0
    }

    @kotlin.jvm.JvmName(name = "address")
    @org.jetbrains.annotations.NotNull
    public final okhttp3.Address address() {
            r1 = this;
            okhttp3.Address r0 = r1.address
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof okhttp3.Route
            if (r0 == 0) goto L26
            okhttp3.Route r3 = (okhttp3.Route) r3
            okhttp3.Address r0 = r3.address
            okhttp3.Address r1 = r2.address
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L26
            java.net.Proxy r0 = r3.proxy
            java.net.Proxy r1 = r2.proxy
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L26
            java.net.InetSocketAddress r3 = r3.socketAddress
            java.net.InetSocketAddress r0 = r2.socketAddress
            boolean r3 = kotlin.jvm.internal.g0.g(r3, r0)
            if (r3 == 0) goto L26
            r3 = 1
            return r3
        L26:
            r3 = 0
            return r3
    }

    public int hashCode() {
            r2 = this;
            okhttp3.Address r0 = r2.address
            int r0 = r0.hashCode()
            r1 = 527(0x20f, float:7.38E-43)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.net.Proxy r0 = r2.proxy
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.net.InetSocketAddress r0 = r2.socketAddress
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            return r1
    }

    @kotlin.jvm.JvmName(name = "proxy")
    @org.jetbrains.annotations.NotNull
    public final java.net.Proxy proxy() {
            r1 = this;
            java.net.Proxy r0 = r1.proxy
            return r0
    }

    public final boolean requiresTunnel() {
            r3 = this;
            java.net.Proxy r0 = r3.proxy
            java.net.Proxy$Type r0 = r0.type()
            java.net.Proxy$Type r1 = java.net.Proxy.Type.HTTP
            r2 = 0
            if (r0 == r1) goto Lc
            return r2
        Lc:
            okhttp3.Address r0 = r3.address
            javax.net.ssl.SSLSocketFactory r0 = r0.sslSocketFactory()
            if (r0 != 0) goto L24
            okhttp3.Address r0 = r3.address
            java.util.List r0 = r0.protocols()
            okhttp3.Protocol r1 = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L23
            goto L24
        L23:
            return r2
        L24:
            r0 = 1
            return r0
    }

    @kotlin.jvm.JvmName(name = "socketAddress")
    @org.jetbrains.annotations.NotNull
    public final java.net.InetSocketAddress socketAddress() {
            r1 = this;
            java.net.InetSocketAddress r0 = r1.socketAddress
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r12 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            okhttp3.Address r1 = r12.address
            okhttp3.HttpUrl r1 = r1.url()
            java.lang.String r1 = r1.host()
            java.net.InetSocketAddress r2 = r12.socketAddress
            java.net.InetAddress r2 = r2.getAddress()
            r3 = 0
            if (r2 == 0) goto L23
            java.lang.String r2 = r2.getHostAddress()
            if (r2 == 0) goto L23
            java.lang.String r2 = okhttp3.internal._HostnamesCommonKt.toCanonicalHost(r2)
            goto L24
        L23:
            r2 = r3
        L24:
            r4 = 58
            r5 = 0
            r6 = 2
            boolean r7 = kotlin.text.u.k3(r1, r4, r5, r6, r3)
            java.lang.String r8 = "]"
            java.lang.String r9 = "["
            if (r7 == 0) goto L3c
            r0.append(r9)
            r0.append(r1)
            r0.append(r8)
            goto L3f
        L3c:
            r0.append(r1)
        L3f:
            okhttp3.Address r7 = r12.address
            okhttp3.HttpUrl r7 = r7.url()
            int r7 = r7.port()
            java.net.InetSocketAddress r10 = r12.socketAddress
            int r10 = r10.getPort()
            java.lang.String r11 = ":"
            if (r7 != r10) goto L59
            boolean r7 = kotlin.jvm.internal.g0.g(r1, r2)
            if (r7 == 0) goto L69
        L59:
            r0.append(r11)
            okhttp3.Address r7 = r12.address
            okhttp3.HttpUrl r7 = r7.url()
            int r7 = r7.port()
            r0.append(r7)
        L69:
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r2)
            if (r1 != 0) goto Lab
            java.net.Proxy r1 = r12.proxy
            java.net.Proxy r7 = java.net.Proxy.NO_PROXY
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r7)
            if (r1 == 0) goto L7f
            java.lang.String r1 = " at "
            r0.append(r1)
            goto L84
        L7f:
            java.lang.String r1 = " via proxy "
            r0.append(r1)
        L84:
            if (r2 != 0) goto L8c
            java.lang.String r1 = "<unresolved>"
            r0.append(r1)
            goto L9f
        L8c:
            boolean r1 = kotlin.text.u.k3(r2, r4, r5, r6, r3)
            if (r1 == 0) goto L9c
            r0.append(r9)
            r0.append(r2)
            r0.append(r8)
            goto L9f
        L9c:
            r0.append(r2)
        L9f:
            r0.append(r11)
            java.net.InetSocketAddress r1 = r12.socketAddress
            int r1 = r1.getPort()
            r0.append(r1)
        Lab:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
