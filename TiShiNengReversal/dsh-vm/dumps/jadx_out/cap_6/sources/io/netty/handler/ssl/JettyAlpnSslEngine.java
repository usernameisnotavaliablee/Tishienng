package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
abstract class JettyAlpnSslEngine extends io.netty.handler.ssl.JdkSslEngine {
    private static final boolean available = false;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.ssl.JettyAlpnSslEngine$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class ClientEngine extends io.netty.handler.ssl.JettyAlpnSslEngine {


        ClientEngine(javax.net.ssl.SSLEngine r3, io.netty.handler.ssl.JdkApplicationProtocolNegotiator r4) {
                r2 = this;
                r0 = 0
                r2.<init>(r3, r0)
                java.lang.String r0 = "applicationNegotiator"
                io.netty.util.internal.ObjectUtil.checkNotNull(r4, r0)
                io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelectionListenerFactory r0 = r4.protocolListenerFactory()
                java.util.List r1 = r4.protocols()
                io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelectionListener r0 = r0.newListener(r2, r1)
                java.lang.String r1 = "protocolListener"
                java.lang.Object r0 = io.netty.util.internal.ObjectUtil.checkNotNull(r0, r1)
                io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelectionListener r0 = (io.netty.handler.ssl.JdkApplicationProtocolNegotiator.ProtocolSelectionListener) r0
                io.netty.handler.ssl.JettyAlpnSslEngine$ClientEngine$1 r1 = new io.netty.handler.ssl.JettyAlpnSslEngine$ClientEngine$1
                r1.<init>(r2, r4, r0)
                org.eclipse.jetty.alpn.ALPN.put(r3, r1)
                return
        }

        @Override // io.netty.handler.ssl.JdkSslEngine, javax.net.ssl.SSLEngine
        public void closeInbound() throws javax.net.ssl.SSLException {
                r1 = this;
                javax.net.ssl.SSLEngine r0 = r1.getWrappedEngine()     // Catch: java.lang.Throwable -> Lb
                org.eclipse.jetty.alpn.ALPN.remove(r0)     // Catch: java.lang.Throwable -> Lb
                super.closeInbound()
                return
            Lb:
                r0 = move-exception
                super.closeInbound()
                throw r0
        }

        @Override // io.netty.handler.ssl.JdkSslEngine, javax.net.ssl.SSLEngine
        public void closeOutbound() {
                r1 = this;
                javax.net.ssl.SSLEngine r0 = r1.getWrappedEngine()     // Catch: java.lang.Throwable -> Lb
                org.eclipse.jetty.alpn.ALPN.remove(r0)     // Catch: java.lang.Throwable -> Lb
                super.closeOutbound()
                return
            Lb:
                r0 = move-exception
                super.closeOutbound()
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class ServerEngine extends io.netty.handler.ssl.JettyAlpnSslEngine {


        ServerEngine(javax.net.ssl.SSLEngine r3, io.netty.handler.ssl.JdkApplicationProtocolNegotiator r4) {
                r2 = this;
                r0 = 0
                r2.<init>(r3, r0)
                java.lang.String r0 = "applicationNegotiator"
                io.netty.util.internal.ObjectUtil.checkNotNull(r4, r0)
                io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelectorFactory r0 = r4.protocolSelectorFactory()
                java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
                java.util.List r4 = r4.protocols()
                r1.<init>(r4)
                io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelector r4 = r0.newSelector(r2, r1)
                java.lang.String r0 = "protocolSelector"
                java.lang.Object r4 = io.netty.util.internal.ObjectUtil.checkNotNull(r4, r0)
                io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelector r4 = (io.netty.handler.ssl.JdkApplicationProtocolNegotiator.ProtocolSelector) r4
                io.netty.handler.ssl.JettyAlpnSslEngine$ServerEngine$1 r0 = new io.netty.handler.ssl.JettyAlpnSslEngine$ServerEngine$1
                r0.<init>(r2, r4)
                org.eclipse.jetty.alpn.ALPN.put(r3, r0)
                return
        }

        @Override // io.netty.handler.ssl.JdkSslEngine, javax.net.ssl.SSLEngine
        public void closeInbound() throws javax.net.ssl.SSLException {
                r1 = this;
                javax.net.ssl.SSLEngine r0 = r1.getWrappedEngine()     // Catch: java.lang.Throwable -> Lb
                org.eclipse.jetty.alpn.ALPN.remove(r0)     // Catch: java.lang.Throwable -> Lb
                super.closeInbound()
                return
            Lb:
                r0 = move-exception
                super.closeInbound()
                throw r0
        }

        @Override // io.netty.handler.ssl.JdkSslEngine, javax.net.ssl.SSLEngine
        public void closeOutbound() {
                r1 = this;
                javax.net.ssl.SSLEngine r0 = r1.getWrappedEngine()     // Catch: java.lang.Throwable -> Lb
                org.eclipse.jetty.alpn.ALPN.remove(r0)     // Catch: java.lang.Throwable -> Lb
                super.closeOutbound()
                return
            Lb:
                r0 = move-exception
                super.closeOutbound()
                throw r0
        }
    }

    static {
            boolean r0 = initAvailable()
            io.netty.handler.ssl.JettyAlpnSslEngine.available = r0
            return
    }

    private JettyAlpnSslEngine(javax.net.ssl.SSLEngine r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    /* synthetic */ JettyAlpnSslEngine(javax.net.ssl.SSLEngine r1, io.netty.handler.ssl.JettyAlpnSslEngine.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private static boolean initAvailable() {
            int r0 = io.netty.util.internal.PlatformDependent.javaVersion()
            r1 = 8
            if (r0 > r1) goto L10
            java.lang.String r0 = "sun.security.ssl.ALPNExtension"
            r1 = 0
            r2 = 1
            java.lang.Class.forName(r0, r2, r1)     // Catch: java.lang.Throwable -> L10
            return r2
        L10:
            r0 = 0
            return r0
    }

    static boolean isAvailable() {
            boolean r0 = io.netty.handler.ssl.JettyAlpnSslEngine.available
            return r0
    }

    static io.netty.handler.ssl.JettyAlpnSslEngine newClientEngine(javax.net.ssl.SSLEngine r1, io.netty.handler.ssl.JdkApplicationProtocolNegotiator r2) {
            io.netty.handler.ssl.JettyAlpnSslEngine$ClientEngine r0 = new io.netty.handler.ssl.JettyAlpnSslEngine$ClientEngine
            r0.<init>(r1, r2)
            return r0
    }

    static io.netty.handler.ssl.JettyAlpnSslEngine newServerEngine(javax.net.ssl.SSLEngine r1, io.netty.handler.ssl.JdkApplicationProtocolNegotiator r2) {
            io.netty.handler.ssl.JettyAlpnSslEngine$ServerEngine r0 = new io.netty.handler.ssl.JettyAlpnSslEngine$ServerEngine
            r0.<init>(r1, r2)
            return r0
    }
}
