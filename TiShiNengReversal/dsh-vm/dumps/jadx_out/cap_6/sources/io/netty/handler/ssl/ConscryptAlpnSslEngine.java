package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
abstract class ConscryptAlpnSslEngine extends io.netty.handler.ssl.JdkSslEngine {
    private static final boolean USE_BUFFER_ALLOCATOR = false;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.ssl.ConscryptAlpnSslEngine$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class BufferAdapter extends org.conscrypt.AllocatedBuffer {
        private final java.nio.ByteBuffer buffer;
        private final io.netty.buffer.ByteBuf nettyBuffer;

        BufferAdapter(io.netty.buffer.ByteBuf r3) {
                r2 = this;
                r2.<init>()
                r2.nettyBuffer = r3
                r0 = 0
                int r1 = r3.capacity()
                java.nio.ByteBuffer r3 = r3.nioBuffer(r0, r1)
                r2.buffer = r3
                return
        }

        public java.nio.ByteBuffer nioBuffer() {
                r1 = this;
                java.nio.ByteBuffer r0 = r1.buffer
                return r0
        }

        public org.conscrypt.AllocatedBuffer release() {
                r1 = this;
                io.netty.buffer.ByteBuf r0 = r1.nettyBuffer
                r0.release()
                return r1
        }

        public org.conscrypt.AllocatedBuffer retain() {
                r1 = this;
                io.netty.buffer.ByteBuf r0 = r1.nettyBuffer
                r0.retain()
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class BufferAllocatorAdapter extends org.conscrypt.BufferAllocator {
        private final io.netty.buffer.ByteBufAllocator alloc;

        BufferAllocatorAdapter(io.netty.buffer.ByteBufAllocator r1) {
                r0 = this;
                r0.<init>()
                r0.alloc = r1
                return
        }

        public org.conscrypt.AllocatedBuffer allocateDirectBuffer(int r3) {
                r2 = this;
                io.netty.handler.ssl.ConscryptAlpnSslEngine$BufferAdapter r0 = new io.netty.handler.ssl.ConscryptAlpnSslEngine$BufferAdapter
                io.netty.buffer.ByteBufAllocator r1 = r2.alloc
                io.netty.buffer.ByteBuf r3 = r1.directBuffer(r3)
                r0.<init>(r3)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class ClientEngine extends io.netty.handler.ssl.ConscryptAlpnSslEngine {
        private final io.netty.handler.ssl.JdkApplicationProtocolNegotiator.ProtocolSelectionListener protocolListener;


        ClientEngine(javax.net.ssl.SSLEngine r3, io.netty.buffer.ByteBufAllocator r4, io.netty.handler.ssl.JdkApplicationProtocolNegotiator r5) {
                r2 = this;
                java.util.List r0 = r5.protocols()
                r1 = 0
                r2.<init>(r3, r4, r0, r1)
                io.netty.handler.ssl.ConscryptAlpnSslEngine$ClientEngine$1 r4 = new io.netty.handler.ssl.ConscryptAlpnSslEngine$ClientEngine$1
                r4.<init>(r2)
                org.conscrypt.Conscrypt.setHandshakeListener(r3, r4)
                io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelectionListenerFactory r3 = r5.protocolListenerFactory()
                java.util.List r4 = r5.protocols()
                io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelectionListener r3 = r3.newListener(r2, r4)
                java.lang.String r4 = "protocolListener"
                java.lang.Object r3 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r4)
                io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelectionListener r3 = (io.netty.handler.ssl.JdkApplicationProtocolNegotiator.ProtocolSelectionListener) r3
                r2.protocolListener = r3
                return
        }

        static /* synthetic */ void access$100(io.netty.handler.ssl.ConscryptAlpnSslEngine.ClientEngine r0) throws javax.net.ssl.SSLException {
                r0.selectProtocol()
                return
        }

        private void selectProtocol() throws javax.net.ssl.SSLException {
                r2 = this;
                javax.net.ssl.SSLEngine r0 = r2.getWrappedEngine()
                java.lang.String r0 = org.conscrypt.Conscrypt.getApplicationProtocol(r0)
                io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelectionListener r1 = r2.protocolListener     // Catch: java.lang.Throwable -> Le
                r1.selected(r0)     // Catch: java.lang.Throwable -> Le
                return
            Le:
                r0 = move-exception
                javax.net.ssl.SSLHandshakeException r0 = io.netty.handler.ssl.SslUtils.toSSLHandshakeException(r0)
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class ServerEngine extends io.netty.handler.ssl.ConscryptAlpnSslEngine {
        private final io.netty.handler.ssl.JdkApplicationProtocolNegotiator.ProtocolSelector protocolSelector;


        ServerEngine(javax.net.ssl.SSLEngine r3, io.netty.buffer.ByteBufAllocator r4, io.netty.handler.ssl.JdkApplicationProtocolNegotiator r5) {
                r2 = this;
                java.util.List r0 = r5.protocols()
                r1 = 0
                r2.<init>(r3, r4, r0, r1)
                io.netty.handler.ssl.ConscryptAlpnSslEngine$ServerEngine$1 r4 = new io.netty.handler.ssl.ConscryptAlpnSslEngine$ServerEngine$1
                r4.<init>(r2)
                org.conscrypt.Conscrypt.setHandshakeListener(r3, r4)
                io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelectorFactory r3 = r5.protocolSelectorFactory()
                java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
                java.util.List r5 = r5.protocols()
                r4.<init>(r5)
                io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelector r3 = r3.newSelector(r2, r4)
                java.lang.String r4 = "protocolSelector"
                java.lang.Object r3 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r4)
                io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelector r3 = (io.netty.handler.ssl.JdkApplicationProtocolNegotiator.ProtocolSelector) r3
                r2.protocolSelector = r3
                return
        }

        static /* synthetic */ void access$200(io.netty.handler.ssl.ConscryptAlpnSslEngine.ServerEngine r0) throws javax.net.ssl.SSLException {
                r0.selectProtocol()
                return
        }

        private void selectProtocol() throws javax.net.ssl.SSLException {
                r2 = this;
                javax.net.ssl.SSLEngine r0 = r2.getWrappedEngine()     // Catch: java.lang.Throwable -> L11
                java.lang.String r0 = org.conscrypt.Conscrypt.getApplicationProtocol(r0)     // Catch: java.lang.Throwable -> L11
                io.netty.handler.ssl.JdkApplicationProtocolNegotiator$ProtocolSelector r1 = r2.protocolSelector     // Catch: java.lang.Throwable -> L11
                if (r0 == 0) goto L13
                java.util.List r0 = java.util.Collections.singletonList(r0)     // Catch: java.lang.Throwable -> L11
                goto L15
            L11:
                r0 = move-exception
                goto L19
            L13:
                java.util.List r0 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> L11
            L15:
                r1.select(r0)     // Catch: java.lang.Throwable -> L11
                return
            L19:
                javax.net.ssl.SSLHandshakeException r0 = io.netty.handler.ssl.SslUtils.toSSLHandshakeException(r0)
                throw r0
        }
    }

    static {
            java.lang.String r0 = "io.netty.handler.ssl.conscrypt.useBufferAllocator"
            r1 = 1
            boolean r0 = io.netty.util.internal.SystemPropertyUtil.getBoolean(r0, r1)
            io.netty.handler.ssl.ConscryptAlpnSslEngine.USE_BUFFER_ALLOCATOR = r0
            return
    }

    private ConscryptAlpnSslEngine(javax.net.ssl.SSLEngine r2, io.netty.buffer.ByteBufAllocator r3, java.util.List<java.lang.String> r4) {
            r1 = this;
            r1.<init>(r2)
            boolean r0 = io.netty.handler.ssl.ConscryptAlpnSslEngine.USE_BUFFER_ALLOCATOR
            if (r0 == 0) goto Lf
            io.netty.handler.ssl.ConscryptAlpnSslEngine$BufferAllocatorAdapter r0 = new io.netty.handler.ssl.ConscryptAlpnSslEngine$BufferAllocatorAdapter
            r0.<init>(r3)
            org.conscrypt.Conscrypt.setBufferAllocator(r2, r0)
        Lf:
            r3 = 0
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.Object[] r3 = r4.toArray(r3)
            java.lang.String[] r3 = (java.lang.String[]) r3
            org.conscrypt.Conscrypt.setApplicationProtocols(r2, r3)
            return
    }

    /* synthetic */ ConscryptAlpnSslEngine(javax.net.ssl.SSLEngine r1, io.netty.buffer.ByteBufAllocator r2, java.util.List r3, io.netty.handler.ssl.ConscryptAlpnSslEngine.AnonymousClass1 r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    static io.netty.handler.ssl.ConscryptAlpnSslEngine newClientEngine(javax.net.ssl.SSLEngine r1, io.netty.buffer.ByteBufAllocator r2, io.netty.handler.ssl.JdkApplicationProtocolNegotiator r3) {
            io.netty.handler.ssl.ConscryptAlpnSslEngine$ClientEngine r0 = new io.netty.handler.ssl.ConscryptAlpnSslEngine$ClientEngine
            r0.<init>(r1, r2, r3)
            return r0
    }

    static io.netty.handler.ssl.ConscryptAlpnSslEngine newServerEngine(javax.net.ssl.SSLEngine r1, io.netty.buffer.ByteBufAllocator r2, io.netty.handler.ssl.JdkApplicationProtocolNegotiator r3) {
            io.netty.handler.ssl.ConscryptAlpnSslEngine$ServerEngine r0 = new io.netty.handler.ssl.ConscryptAlpnSslEngine$ServerEngine
            r0.<init>(r1, r2, r3)
            return r0
    }

    final int calculateOutNetBufSize(int r5, int r6) {
            r4 = this;
            javax.net.ssl.SSLEngine r0 = r4.getWrappedEngine()
            int r0 = org.conscrypt.Conscrypt.maxSealOverhead(r0)
            long r0 = (long) r0
            long r2 = (long) r6
            long r0 = r0 * r2
            long r5 = (long) r5
            long r5 = r5 + r0
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r5 = java.lang.Math.min(r0, r5)
            int r6 = (int) r5
            return r6
    }

    final javax.net.ssl.SSLEngineResult unwrap(java.nio.ByteBuffer[] r2, java.nio.ByteBuffer[] r3) throws javax.net.ssl.SSLException {
            r1 = this;
            javax.net.ssl.SSLEngine r0 = r1.getWrappedEngine()
            javax.net.ssl.SSLEngineResult r2 = org.conscrypt.Conscrypt.unwrap(r0, r2, r3)
            return r2
    }
}
