package okhttp3.internal.proxy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nNullProxySelector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NullProxySelector.kt\nokhttp3/internal/proxy/NullProxySelector\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,40:1\n1#2:41\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class NullProxySelector extends java.net.ProxySelector {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.proxy.NullProxySelector INSTANCE = null;

    static {
            okhttp3.internal.proxy.NullProxySelector r0 = new okhttp3.internal.proxy.NullProxySelector
            r0.<init>()
            okhttp3.internal.proxy.NullProxySelector.INSTANCE = r0
            return
    }

    private NullProxySelector() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.net.ProxySelector
    public void connectFailed(@org.jetbrains.annotations.Nullable java.net.URI r1, @org.jetbrains.annotations.Nullable java.net.SocketAddress r2, @org.jetbrains.annotations.Nullable java.io.IOException r3) {
            r0 = this;
            return
    }

    @Override // java.net.ProxySelector
    @org.jetbrains.annotations.NotNull
    public java.util.List<java.net.Proxy> select(@org.jetbrains.annotations.Nullable java.net.URI r2) {
            r1 = this;
            if (r2 == 0) goto L9
            java.net.Proxy r2 = java.net.Proxy.NO_PROXY
            java.util.List r2 = kotlin.collections.f0.l(r2)
            return r2
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "uri must not be null"
            r2.<init>(r0)
            throw r2
    }
}
