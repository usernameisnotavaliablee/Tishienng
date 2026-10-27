package okhttp3.internal.platform.android;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class DeferredSocketAdapter implements okhttp3.internal.platform.android.SocketAdapter {

    @org.jetbrains.annotations.Nullable
    private okhttp3.internal.platform.android.SocketAdapter delegate;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.platform.android.DeferredSocketAdapter.Factory socketAdapterFactory;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Factory {
        @org.jetbrains.annotations.NotNull
        okhttp3.internal.platform.android.SocketAdapter create(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocket r1);

        boolean matchesSocket(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocket r1);
    }

    public DeferredSocketAdapter(@org.jetbrains.annotations.NotNull okhttp3.internal.platform.android.DeferredSocketAdapter.Factory r2) {
            r1 = this;
            java.lang.String r0 = "socketAdapterFactory"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.socketAdapterFactory = r2
            return
    }

    private final synchronized okhttp3.internal.platform.android.SocketAdapter getDelegate(javax.net.ssl.SSLSocket r2) {
            r1 = this;
            monitor-enter(r1)
            okhttp3.internal.platform.android.SocketAdapter r0 = r1.delegate     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L18
            okhttp3.internal.platform.android.DeferredSocketAdapter$Factory r0 = r1.socketAdapterFactory     // Catch: java.lang.Throwable -> L16
            boolean r0 = r0.matchesSocket(r2)     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L18
            okhttp3.internal.platform.android.DeferredSocketAdapter$Factory r0 = r1.socketAdapterFactory     // Catch: java.lang.Throwable -> L16
            okhttp3.internal.platform.android.SocketAdapter r2 = r0.create(r2)     // Catch: java.lang.Throwable -> L16
            r1.delegate = r2     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r2 = move-exception
            goto L1c
        L18:
            okhttp3.internal.platform.android.SocketAdapter r2 = r1.delegate     // Catch: java.lang.Throwable -> L16
            monitor-exit(r1)
            return r2
        L1c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            throw r2
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public void configureTlsExtensions(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocket r2, @org.jetbrains.annotations.Nullable java.lang.String r3, @org.jetbrains.annotations.NotNull java.util.List<? extends okhttp3.Protocol> r4) {
            r1 = this;
            java.lang.String r0 = "sslSocket"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "protocols"
            kotlin.jvm.internal.g0.p(r4, r0)
            okhttp3.internal.platform.android.SocketAdapter r0 = r1.getDelegate(r2)
            if (r0 == 0) goto L13
            r0.configureTlsExtensions(r2, r3, r4)
        L13:
            return
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    @org.jetbrains.annotations.Nullable
    public java.lang.String getSelectedProtocol(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocket r2) {
            r1 = this;
            java.lang.String r0 = "sslSocket"
            kotlin.jvm.internal.g0.p(r2, r0)
            okhttp3.internal.platform.android.SocketAdapter r0 = r1.getDelegate(r2)
            if (r0 == 0) goto L10
            java.lang.String r2 = r0.getSelectedProtocol(r2)
            return r2
        L10:
            r2 = 0
            return r2
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean isSupported() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean matchesSocket(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocket r2) {
            r1 = this;
            java.lang.String r0 = "sslSocket"
            kotlin.jvm.internal.g0.p(r2, r0)
            okhttp3.internal.platform.android.DeferredSocketAdapter$Factory r0 = r1.socketAdapterFactory
            boolean r2 = r0.matchesSocket(r2)
            return r2
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public /* bridge */ boolean matchesSocketFactory(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocketFactory r1) {
            r0 = this;
            boolean r1 = okhttp3.internal.platform.android.b.a(r0, r1)
            return r1
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    @org.jetbrains.annotations.Nullable
    public /* bridge */ javax.net.ssl.X509TrustManager trustManager(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocketFactory r1) {
            r0 = this;
            javax.net.ssl.X509TrustManager r1 = okhttp3.internal.platform.android.b.b(r0, r1)
            return r1
    }
}
