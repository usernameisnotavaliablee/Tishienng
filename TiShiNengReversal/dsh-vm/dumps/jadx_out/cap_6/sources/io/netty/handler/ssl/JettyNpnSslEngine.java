package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class JettyNpnSslEngine extends io.netty.handler.ssl.JdkSslEngine {
    private static boolean available;



    JettyNpnSslEngine(javax.net.ssl.SSLEngine r2, io.netty.handler.ssl.JdkApplicationProtocolNegotiator r3, boolean r4) {
            r1 = this;
            r1.<init>(r2)
            java.lang.String r0 = "applicationNegotiator"
            io.netty.util.internal.ObjectUtil.checkNotNull(r3, r0)
            if (r4 == 0) goto L27
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelectionListenerFactory r4 = r3.protocolListenerFactory()
            java.util.List r0 = r3.protocols()
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelectionListener r4 = r4.newListener(r1, r0)
            java.lang.String r0 = "protocolListener"
            java.lang.Object r4 = io.netty.util.internal.ObjectUtil.checkNotNull(r4, r0)
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelectionListener r4 = (io.netty.handler.ssl.JdkApplicationProtocolNegotiator.ProtocolSelectionListener) r4
            io.netty.handler.ssl.JettyNpnSslEngine$1 r0 = new io.netty.handler.ssl.JettyNpnSslEngine$1
            r0.<init>(r1, r4, r3)
            org.eclipse.jetty.npn.NextProtoNego.put(r2, r0)
            return
        L27:
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelectorFactory r4 = r3.protocolSelectorFactory()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            java.util.List r3 = r3.protocols()
            r0.<init>(r3)
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelector r3 = r4.newSelector(r1, r0)
            java.lang.String r4 = "protocolSelector"
            java.lang.Object r3 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r4)
            io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelector r3 = (io.netty.handler.ssl.JdkApplicationProtocolNegotiator.ProtocolSelector) r3
            io.netty.handler.ssl.JettyNpnSslEngine$2 r4 = new io.netty.handler.ssl.JettyNpnSslEngine$2
            r4.<init>(r1, r3)
            org.eclipse.jetty.npn.NextProtoNego.put(r2, r4)
            return
    }

    static boolean isAvailable() {
            updateAvailability()
            boolean r0 = io.netty.handler.ssl.JettyNpnSslEngine.available
            return r0
    }

    private static void updateAvailability() {
            boolean r0 = io.netty.handler.ssl.JettyNpnSslEngine.available
            if (r0 == 0) goto L5
            goto Le
        L5:
            java.lang.String r0 = "sun.security.ssl.NextProtoNegoExtension"
            r1 = 0
            r2 = 1
            java.lang.Class.forName(r0, r2, r1)     // Catch: java.lang.Exception -> Le
            io.netty.handler.ssl.JettyNpnSslEngine.available = r2     // Catch: java.lang.Exception -> Le
        Le:
            return
    }

    @Override // io.netty.handler.ssl.JdkSslEngine, javax.net.ssl.SSLEngine
    public void closeInbound() throws javax.net.ssl.SSLException {
            r1 = this;
            javax.net.ssl.SSLEngine r0 = r1.getWrappedEngine()
            org.eclipse.jetty.npn.NextProtoNego.remove(r0)
            super.closeInbound()
            return
    }

    @Override // io.netty.handler.ssl.JdkSslEngine, javax.net.ssl.SSLEngine
    public void closeOutbound() {
            r1 = this;
            javax.net.ssl.SSLEngine r0 = r1.getWrappedEngine()
            org.eclipse.jetty.npn.NextProtoNego.remove(r0)
            super.closeOutbound()
            return
    }
}
