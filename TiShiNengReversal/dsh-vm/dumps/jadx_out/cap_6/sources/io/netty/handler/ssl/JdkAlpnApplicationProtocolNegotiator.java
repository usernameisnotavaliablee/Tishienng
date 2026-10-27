package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class JdkAlpnApplicationProtocolNegotiator extends io.netty.handler.ssl.JdkBaseApplicationProtocolNegotiator {
    private static final io.netty.handler.ssl.JdkApplicationProtocolNegotiator.SslEngineWrapperFactory ALPN_WRAPPER = null;
    private static final boolean AVAILABLE = false;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.ssl.JdkAlpnApplicationProtocolNegotiator$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class AlpnWrapper extends io.netty.handler.ssl.JdkApplicationProtocolNegotiator.AllocatorAwareSslEngineWrapperFactory {
        private AlpnWrapper() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ AlpnWrapper(io.netty.handler.ssl.JdkAlpnApplicationProtocolNegotiator.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // io.netty.handler.ssl.JdkApplicationProtocolNegotiator.AllocatorAwareSslEngineWrapperFactory
        public javax.net.ssl.SSLEngine wrapSslEngine(javax.net.ssl.SSLEngine r2, io.netty.buffer.ByteBufAllocator r3, io.netty.handler.ssl.JdkApplicationProtocolNegotiator r4, boolean r5) {
                r1 = this;
                boolean r0 = io.netty.handler.ssl.Conscrypt.isEngineSupported(r2)
                if (r0 == 0) goto L12
                if (r5 == 0) goto Ld
                io.netty.handler.ssl.ConscryptAlpnSslEngine r2 = io.netty.handler.ssl.ConscryptAlpnSslEngine.newServerEngine(r2, r3, r4)
                return r2
            Ld:
                io.netty.handler.ssl.ConscryptAlpnSslEngine r2 = io.netty.handler.ssl.ConscryptAlpnSslEngine.newClientEngine(r2, r3, r4)
                return r2
            L12:
                boolean r3 = io.netty.handler.ssl.JdkAlpnApplicationProtocolNegotiator.jdkAlpnSupported()
                if (r3 == 0) goto L1e
                io.netty.handler.ssl.Java9SslEngine r3 = new io.netty.handler.ssl.Java9SslEngine
                r3.<init>(r2, r4, r5)
                return r3
            L1e:
                boolean r3 = io.netty.handler.ssl.JettyAlpnSslEngine.isAvailable()
                if (r3 == 0) goto L30
                if (r5 == 0) goto L2b
                io.netty.handler.ssl.JettyAlpnSslEngine r2 = io.netty.handler.ssl.JettyAlpnSslEngine.newServerEngine(r2, r4)
                return r2
            L2b:
                io.netty.handler.ssl.JettyAlpnSslEngine r2 = io.netty.handler.ssl.JettyAlpnSslEngine.newClientEngine(r2, r4)
                return r2
            L30:
                java.lang.RuntimeException r3 = new java.lang.RuntimeException
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "Unable to wrap SSLEngine of type "
                r4.append(r5)
                java.lang.Class r2 = r2.getClass()
                java.lang.String r2 = r2.getName()
                r4.append(r2)
                java.lang.String r2 = r4.toString()
                r3.<init>(r2)
                throw r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class FailureWrapper extends io.netty.handler.ssl.JdkApplicationProtocolNegotiator.AllocatorAwareSslEngineWrapperFactory {
        private FailureWrapper() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ FailureWrapper(io.netty.handler.ssl.JdkAlpnApplicationProtocolNegotiator.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // io.netty.handler.ssl.JdkApplicationProtocolNegotiator.AllocatorAwareSslEngineWrapperFactory
        public javax.net.ssl.SSLEngine wrapSslEngine(javax.net.ssl.SSLEngine r1, io.netty.buffer.ByteBufAllocator r2, io.netty.handler.ssl.JdkApplicationProtocolNegotiator r3, boolean r4) {
                r0 = this;
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "ALPN unsupported. Is your classpath configured correctly? For Conscrypt, add the appropriate Conscrypt JAR to classpath and set the security provider. For Jetty-ALPN, see http://www.eclipse.org/jetty/documentation/current/alpn-chapter.html#alpn-starting"
                r1.<init>(r2)
                throw r1
        }
    }

    static {
            boolean r0 = io.netty.handler.ssl.Conscrypt.isAvailable()
            if (r0 != 0) goto L15
            boolean r0 = jdkAlpnSupported()
            if (r0 != 0) goto L15
            boolean r0 = io.netty.handler.ssl.JettyAlpnSslEngine.isAvailable()
            if (r0 == 0) goto L13
            goto L15
        L13:
            r0 = 0
            goto L16
        L15:
            r0 = 1
        L16:
            io.netty.handler.ssl.JdkAlpnApplicationProtocolNegotiator.AVAILABLE = r0
            r1 = 0
            if (r0 == 0) goto L21
            io.netty.handler.ssl.JdkAlpnApplicationProtocolNegotiator$AlpnWrapper r0 = new io.netty.handler.ssl.JdkAlpnApplicationProtocolNegotiator$AlpnWrapper
            r0.<init>(r1)
            goto L26
        L21:
            io.netty.handler.ssl.JdkAlpnApplicationProtocolNegotiator$FailureWrapper r0 = new io.netty.handler.ssl.JdkAlpnApplicationProtocolNegotiator$FailureWrapper
            r0.<init>(r1)
        L26:
            io.netty.handler.ssl.JdkAlpnApplicationProtocolNegotiator.ALPN_WRAPPER = r0
            return
    }

    public JdkAlpnApplicationProtocolNegotiator(io.netty.handler.ssl.JdkApplicationProtocolNegotiator.ProtocolSelectorFactory r2, io.netty.handler.ssl.JdkApplicationProtocolNegotiator.ProtocolSelectionListenerFactory r3, java.lang.Iterable<java.lang.String> r4) {
            r1 = this;
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator$SslEngineWrapperFactory r0 = io.netty.handler.ssl.JdkAlpnApplicationProtocolNegotiator.ALPN_WRAPPER
            r1.<init>(r0, r2, r3, r4)
            return
    }

    public JdkAlpnApplicationProtocolNegotiator(io.netty.handler.ssl.JdkApplicationProtocolNegotiator.ProtocolSelectorFactory r2, io.netty.handler.ssl.JdkApplicationProtocolNegotiator.ProtocolSelectionListenerFactory r3, java.lang.String... r4) {
            r1 = this;
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator$SslEngineWrapperFactory r0 = io.netty.handler.ssl.JdkAlpnApplicationProtocolNegotiator.ALPN_WRAPPER
            r1.<init>(r0, r2, r3, r4)
            return
    }

    public JdkAlpnApplicationProtocolNegotiator(java.lang.Iterable<java.lang.String> r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2)
            return
    }

    public JdkAlpnApplicationProtocolNegotiator(boolean r1, java.lang.Iterable<java.lang.String> r2) {
            r0 = this;
            r0.<init>(r1, r1, r2)
            return
    }

    public JdkAlpnApplicationProtocolNegotiator(boolean r1, boolean r2, java.lang.Iterable<java.lang.String> r3) {
            r0 = this;
            if (r2 == 0) goto L5
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelectorFactory r2 = io.netty.handler.ssl.JdkBaseApplicationProtocolNegotiator.FAIL_SELECTOR_FACTORY
            goto L7
        L5:
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelectorFactory r2 = io.netty.handler.ssl.JdkBaseApplicationProtocolNegotiator.NO_FAIL_SELECTOR_FACTORY
        L7:
            if (r1 == 0) goto Lc
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelectionListenerFactory r1 = io.netty.handler.ssl.JdkBaseApplicationProtocolNegotiator.FAIL_SELECTION_LISTENER_FACTORY
            goto Le
        Lc:
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelectionListenerFactory r1 = io.netty.handler.ssl.JdkBaseApplicationProtocolNegotiator.NO_FAIL_SELECTION_LISTENER_FACTORY
        Le:
            r0.<init>(r2, r1, r3)
            return
    }

    public JdkAlpnApplicationProtocolNegotiator(boolean r1, boolean r2, java.lang.String... r3) {
            r0 = this;
            if (r2 == 0) goto L5
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelectorFactory r2 = io.netty.handler.ssl.JdkBaseApplicationProtocolNegotiator.FAIL_SELECTOR_FACTORY
            goto L7
        L5:
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelectorFactory r2 = io.netty.handler.ssl.JdkBaseApplicationProtocolNegotiator.NO_FAIL_SELECTOR_FACTORY
        L7:
            if (r1 == 0) goto Lc
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelectionListenerFactory r1 = io.netty.handler.ssl.JdkBaseApplicationProtocolNegotiator.FAIL_SELECTION_LISTENER_FACTORY
            goto Le
        Lc:
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelectionListenerFactory r1 = io.netty.handler.ssl.JdkBaseApplicationProtocolNegotiator.NO_FAIL_SELECTION_LISTENER_FACTORY
        Le:
            r0.<init>(r2, r1, r3)
            return
    }

    public JdkAlpnApplicationProtocolNegotiator(boolean r1, java.lang.String... r2) {
            r0 = this;
            r0.<init>(r1, r1, r2)
            return
    }

    public JdkAlpnApplicationProtocolNegotiator(java.lang.String... r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2)
            return
    }

    static boolean jdkAlpnSupported() {
            int r0 = io.netty.util.internal.PlatformDependent.javaVersion()
            r1 = 9
            if (r0 < r1) goto L10
            boolean r0 = io.netty.handler.ssl.Java9SslUtils.supportsAlpn()
            if (r0 == 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    @Override // io.netty.handler.ssl.JdkBaseApplicationProtocolNegotiator, io.netty.handler.ssl.JdkApplicationProtocolNegotiator
    public /* bridge */ /* synthetic */ io.netty.handler.ssl.JdkApplicationProtocolNegotiator.ProtocolSelectionListenerFactory protocolListenerFactory() {
            r1 = this;
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelectionListenerFactory r0 = super.protocolListenerFactory()
            return r0
    }

    @Override // io.netty.handler.ssl.JdkBaseApplicationProtocolNegotiator, io.netty.handler.ssl.JdkApplicationProtocolNegotiator
    public /* bridge */ /* synthetic */ io.netty.handler.ssl.JdkApplicationProtocolNegotiator.ProtocolSelectorFactory protocolSelectorFactory() {
            r1 = this;
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelectorFactory r0 = super.protocolSelectorFactory()
            return r0
    }

    @Override // io.netty.handler.ssl.JdkBaseApplicationProtocolNegotiator, io.netty.handler.ssl.ApplicationProtocolNegotiator
    public /* bridge */ /* synthetic */ java.util.List protocols() {
            r1 = this;
            java.util.List r0 = super.protocols()
            return r0
    }

    @Override // io.netty.handler.ssl.JdkBaseApplicationProtocolNegotiator, io.netty.handler.ssl.JdkApplicationProtocolNegotiator
    public /* bridge */ /* synthetic */ io.netty.handler.ssl.JdkApplicationProtocolNegotiator.SslEngineWrapperFactory wrapperFactory() {
            r1 = this;
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator$SslEngineWrapperFactory r0 = super.wrapperFactory()
            return r0
    }
}
