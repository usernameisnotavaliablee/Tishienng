package okhttp3.internal.platform.android;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class AndroidSocketAdapter implements okhttp3.internal.platform.android.SocketAdapter {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.platform.android.AndroidSocketAdapter.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    private static final okhttp3.internal.platform.android.DeferredSocketAdapter.Factory playProviderFactory = null;
    private final java.lang.reflect.Method getAlpnSelectedProtocol;
    private final java.lang.reflect.Method setAlpnProtocols;
    private final java.lang.reflect.Method setHostname;

    @org.jetbrains.annotations.NotNull
    private final java.lang.reflect.Method setUseSessionTickets;

    @org.jetbrains.annotations.NotNull
    private final java.lang.Class<? super javax.net.ssl.SSLSocket> sslSocketClass;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public static final /* synthetic */ okhttp3.internal.platform.android.AndroidSocketAdapter access$build(okhttp3.internal.platform.android.AndroidSocketAdapter.Companion r0, java.lang.Class r1) {
                okhttp3.internal.platform.android.AndroidSocketAdapter r0 = r0.build(r1)
                return r0
        }

        private final okhttp3.internal.platform.android.AndroidSocketAdapter build(java.lang.Class<? super javax.net.ssl.SSLSocket> r4) {
                r3 = this;
                r0 = r4
            L1:
                if (r0 == 0) goto L2d
                java.lang.String r1 = r0.getSimpleName()
                java.lang.String r2 = "OpenSSLSocketImpl"
                boolean r1 = kotlin.jvm.internal.g0.g(r1, r2)
                if (r1 != 0) goto L2d
                java.lang.Class r0 = r0.getSuperclass()
                if (r0 == 0) goto L16
                goto L1
            L16:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "No OpenSSLSocketImpl superclass of socket of type "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
            L2d:
                okhttp3.internal.platform.android.AndroidSocketAdapter r4 = new okhttp3.internal.platform.android.AndroidSocketAdapter
                kotlin.jvm.internal.g0.m(r0)
                r4.<init>(r0)
                return r4
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.internal.platform.android.DeferredSocketAdapter.Factory factory(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "packageName"
                kotlin.jvm.internal.g0.p(r2, r0)
                okhttp3.internal.platform.android.AndroidSocketAdapter$Companion$factory$1 r0 = new okhttp3.internal.platform.android.AndroidSocketAdapter$Companion$factory$1
                r0.<init>(r2)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.internal.platform.android.DeferredSocketAdapter.Factory getPlayProviderFactory() {
                r1 = this;
                okhttp3.internal.platform.android.DeferredSocketAdapter$Factory r0 = okhttp3.internal.platform.android.AndroidSocketAdapter.access$getPlayProviderFactory$cp()
                return r0
        }
    }

    static {
            okhttp3.internal.platform.android.AndroidSocketAdapter$Companion r0 = new okhttp3.internal.platform.android.AndroidSocketAdapter$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.platform.android.AndroidSocketAdapter.Companion = r0
            java.lang.String r1 = "com.google.android.gms.org.conscrypt"
            okhttp3.internal.platform.android.DeferredSocketAdapter$Factory r0 = r0.factory(r1)
            okhttp3.internal.platform.android.AndroidSocketAdapter.playProviderFactory = r0
            return
    }

    public AndroidSocketAdapter(@org.jetbrains.annotations.NotNull java.lang.Class<? super javax.net.ssl.SSLSocket> r5) {
            r4 = this;
            java.lang.String r0 = "sslSocketClass"
            kotlin.jvm.internal.g0.p(r5, r0)
            r4.<init>()
            r4.sslSocketClass = r5
            r0 = 1
            java.lang.Class[] r1 = new java.lang.Class[r0]
            r2 = 0
            java.lang.Class r3 = java.lang.Boolean.TYPE
            r1[r2] = r3
            java.lang.String r3 = "setUseSessionTickets"
            java.lang.reflect.Method r1 = r5.getDeclaredMethod(r3, r1)
            java.lang.String r3 = "getDeclaredMethod(...)"
            kotlin.jvm.internal.g0.o(r1, r3)
            r4.setUseSessionTickets = r1
            java.lang.Class[] r1 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r1[r2] = r3
            java.lang.String r3 = "setHostname"
            java.lang.reflect.Method r1 = r5.getMethod(r3, r1)
            r4.setHostname = r1
            java.lang.String r1 = "getAlpnSelectedProtocol"
            r3 = 0
            java.lang.reflect.Method r1 = r5.getMethod(r1, r3)
            r4.getAlpnSelectedProtocol = r1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Class<byte[]> r1 = byte[].class
            r0[r2] = r1
            java.lang.String r1 = "setAlpnProtocols"
            java.lang.reflect.Method r5 = r5.getMethod(r1, r0)
            r4.setAlpnProtocols = r5
            return
    }

    public static final /* synthetic */ okhttp3.internal.platform.android.DeferredSocketAdapter.Factory access$getPlayProviderFactory$cp() {
            okhttp3.internal.platform.android.DeferredSocketAdapter$Factory r0 = okhttp3.internal.platform.android.AndroidSocketAdapter.playProviderFactory
            return r0
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public void configureTlsExtensions(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocket r6, @org.jetbrains.annotations.Nullable java.lang.String r7, @org.jetbrains.annotations.NotNull java.util.List<? extends okhttp3.Protocol> r8) {
            r5 = this;
            java.lang.String r0 = "sslSocket"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "protocols"
            kotlin.jvm.internal.g0.p(r8, r0)
            boolean r0 = r5.matchesSocket(r6)
            if (r0 == 0) goto L4f
            java.lang.reflect.Method r0 = r5.setUseSessionTickets     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.IllegalAccessException -> L31
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.IllegalAccessException -> L31
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.IllegalAccessException -> L31
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.IllegalAccessException -> L31
            r0.invoke(r6, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.IllegalAccessException -> L31
            if (r7 == 0) goto L33
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.IllegalAccessException -> L31
            r2 = 23
            if (r0 > r2) goto L33
            java.lang.reflect.Method r0 = r5.setHostname     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.IllegalAccessException -> L31
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.IllegalAccessException -> L31
            r2[r4] = r7     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.IllegalAccessException -> L31
            r0.invoke(r6, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.IllegalAccessException -> L31
            goto L33
        L2f:
            r6 = move-exception
            goto L43
        L31:
            r6 = move-exception
            goto L49
        L33:
            java.lang.reflect.Method r7 = r5.setAlpnProtocols     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.IllegalAccessException -> L31
            okhttp3.internal.platform.Platform$Companion r0 = okhttp3.internal.platform.Platform.Companion     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.IllegalAccessException -> L31
            byte[] r8 = r0.concatLengthPrefixed(r8)     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.IllegalAccessException -> L31
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.IllegalAccessException -> L31
            r0[r4] = r8     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.IllegalAccessException -> L31
            r7.invoke(r6, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.IllegalAccessException -> L31
            return
        L43:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            r7.<init>(r6)
            throw r7
        L49:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            r7.<init>(r6)
            throw r7
        L4f:
            return
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    @org.jetbrains.annotations.Nullable
    public java.lang.String getSelectedProtocol(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocket r4) {
            r3 = this;
            java.lang.String r0 = "sslSocket"
            kotlin.jvm.internal.g0.p(r4, r0)
            boolean r0 = r3.matchesSocket(r4)
            r1 = 0
            if (r0 != 0) goto Ld
            return r1
        Ld:
            java.lang.reflect.Method r0 = r3.getAlpnSelectedProtocol     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L21
            java.lang.Object r4 = r0.invoke(r4, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L21
            byte[] r4 = (byte[]) r4     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L21
            if (r4 == 0) goto L23
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L21
            java.nio.charset.Charset r2 = kotlin.text.e.b     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L21
            r0.<init>(r4, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L21
            return r0
        L1f:
            r4 = move-exception
            goto L24
        L21:
            r4 = move-exception
            goto L41
        L23:
            return r1
        L24:
            java.lang.Throwable r0 = r4.getCause()
            boolean r2 = r0 instanceof java.lang.NullPointerException
            if (r2 == 0) goto L3b
            java.lang.NullPointerException r0 = (java.lang.NullPointerException) r0
            java.lang.String r0 = r0.getMessage()
            java.lang.String r2 = "ssl == null"
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r2)
            if (r0 == 0) goto L3b
            return r1
        L3b:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r4)
            throw r0
        L41:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r4)
            throw r0
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean isSupported() {
            r1 = this;
            okhttp3.internal.platform.AndroidPlatform$Companion r0 = okhttp3.internal.platform.AndroidPlatform.Companion
            boolean r0 = r0.isSupported()
            return r0
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean matchesSocket(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocket r2) {
            r1 = this;
            java.lang.String r0 = "sslSocket"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Class<? super javax.net.ssl.SSLSocket> r0 = r1.sslSocketClass
            boolean r2 = r0.isInstance(r2)
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
