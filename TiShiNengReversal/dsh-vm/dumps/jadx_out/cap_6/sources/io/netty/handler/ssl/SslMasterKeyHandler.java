package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class SslMasterKeyHandler extends io.netty.channel.ChannelInboundHandlerAdapter {
    private static final java.lang.Class<?> SSL_SESSIONIMPL_CLASS = null;
    private static final java.lang.reflect.Field SSL_SESSIONIMPL_MASTER_SECRET_FIELD = null;
    public static final java.lang.String SYSTEM_PROP_KEY = "io.netty.ssl.masterKeyHandler";
    private static final java.lang.Throwable UNAVAILABILITY_CAUSE = null;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.ssl.SslMasterKeyHandler$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class WiresharkSslMasterKeyHandler extends io.netty.handler.ssl.SslMasterKeyHandler {
        private static final char[] hexCode = null;
        private static final io.netty.util.internal.logging.InternalLogger wireshark_logger = null;

        static {
                java.lang.String r0 = "io.netty.wireshark"
                io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
                io.netty.handler.ssl.SslMasterKeyHandler.WiresharkSslMasterKeyHandler.wireshark_logger = r0
                java.lang.String r0 = "0123456789ABCDEF"
                char[] r0 = r0.toCharArray()
                io.netty.handler.ssl.SslMasterKeyHandler.WiresharkSslMasterKeyHandler.hexCode = r0
                return
        }

        private WiresharkSslMasterKeyHandler() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ WiresharkSslMasterKeyHandler(io.netty.handler.ssl.SslMasterKeyHandler.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // io.netty.handler.ssl.SslMasterKeyHandler
        protected void accept(javax.crypto.SecretKey r3, javax.net.ssl.SSLSession r4) {
                r2 = this;
                byte[] r0 = r3.getEncoded()
                int r0 = r0.length
                r1 = 48
                if (r0 != r1) goto L29
                byte[] r4 = r4.getId()
                io.netty.util.internal.logging.InternalLogger r0 = io.netty.handler.ssl.SslMasterKeyHandler.WiresharkSslMasterKeyHandler.wireshark_logger
                java.lang.String r4 = io.netty.buffer.ByteBufUtil.hexDump(r4)
                java.lang.String r4 = r4.toLowerCase()
                byte[] r3 = r3.getEncoded()
                java.lang.String r3 = io.netty.buffer.ByteBufUtil.hexDump(r3)
                java.lang.String r3 = r3.toLowerCase()
                java.lang.String r1 = "RSA Session-ID:{} Master-Key:{}"
                r0.warn(r1, r4, r3)
                return
            L29:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r4 = "An invalid length master key was provided."
                r3.<init>(r4)
                throw r3
        }
    }

    static {
            java.lang.Class<io.netty.handler.ssl.SslMasterKeyHandler> r0 = io.netty.handler.ssl.SslMasterKeyHandler.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.handler.ssl.SslMasterKeyHandler.logger = r0
            r0 = 0
            java.lang.String r1 = "sun.security.ssl.SSLSessionImpl"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L20
            java.lang.String r2 = "masterSecret"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L1b
            r2 = 1
            java.lang.Throwable r2 = io.netty.util.internal.ReflectionUtil.trySetAccessible(r0, r2)     // Catch: java.lang.Throwable -> L1b
            goto L2d
        L1b:
            r2 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L23
        L20:
            r1 = move-exception
            r2 = r1
            r1 = r0
        L23:
            io.netty.util.internal.logging.InternalLogger r3 = io.netty.handler.ssl.SslMasterKeyHandler.logger
            java.lang.String r4 = "sun.security.ssl.SSLSessionImpl is unavailable."
            r3.debug(r4, r2)
            r5 = r1
            r1 = r0
            r0 = r5
        L2d:
            io.netty.handler.ssl.SslMasterKeyHandler.UNAVAILABILITY_CAUSE = r2
            io.netty.handler.ssl.SslMasterKeyHandler.SSL_SESSIONIMPL_CLASS = r1
            io.netty.handler.ssl.SslMasterKeyHandler.SSL_SESSIONIMPL_MASTER_SECRET_FIELD = r0
            return
    }

    protected SslMasterKeyHandler() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void ensureSunSslEngineAvailability() {
            java.lang.Throwable r0 = io.netty.handler.ssl.SslMasterKeyHandler.UNAVAILABILITY_CAUSE
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Failed to find SSLSessionImpl on classpath"
            r1.<init>(r2, r0)
            throw r1
    }

    public static boolean isSunSslEngineAvailable() {
            java.lang.Throwable r0 = io.netty.handler.ssl.SslMasterKeyHandler.UNAVAILABILITY_CAUSE
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public static io.netty.handler.ssl.SslMasterKeyHandler newWireSharkSslMasterKeyHandler() {
            io.netty.handler.ssl.SslMasterKeyHandler$WiresharkSslMasterKeyHandler r0 = new io.netty.handler.ssl.SslMasterKeyHandler$WiresharkSslMasterKeyHandler
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    public static java.lang.Throwable sunSslEngineUnavailabilityCause() {
            java.lang.Throwable r0 = io.netty.handler.ssl.SslMasterKeyHandler.UNAVAILABILITY_CAUSE
            return r0
    }

    protected abstract void accept(javax.crypto.SecretKey r1, javax.net.ssl.SSLSession r2);

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public final void userEventTriggered(io.netty.channel.ChannelHandlerContext r6, java.lang.Object r7) {
            r5 = this;
            io.netty.handler.ssl.SslHandshakeCompletionEvent r0 = io.netty.handler.ssl.SslHandshakeCompletionEvent.SUCCESS
            if (r7 != r0) goto L66
            java.lang.String r0 = "io.netty.ssl.masterKeyHandler"
            r1 = 0
            boolean r0 = io.netty.util.internal.SystemPropertyUtil.getBoolean(r0, r1)
            if (r0 == 0) goto L66
            io.netty.channel.ChannelPipeline r0 = r6.pipeline()
            java.lang.Class<io.netty.handler.ssl.SslHandler> r1 = io.netty.handler.ssl.SslHandler.class
            io.netty.channel.ChannelHandler r0 = r0.get(r1)
            io.netty.handler.ssl.SslHandler r0 = (io.netty.handler.ssl.SslHandler) r0
            javax.net.ssl.SSLEngine r0 = r0.engine()
            javax.net.ssl.SSLSession r1 = r0.getSession()
            boolean r2 = isSunSslEngineAvailable()
            if (r2 == 0) goto L48
            java.lang.Class r2 = r1.getClass()
            java.lang.Class<?> r3 = io.netty.handler.ssl.SslMasterKeyHandler.SSL_SESSIONIMPL_CLASS
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L48
            java.lang.reflect.Field r0 = io.netty.handler.ssl.SslMasterKeyHandler.SSL_SESSIONIMPL_MASTER_SECRET_FIELD     // Catch: java.lang.IllegalAccessException -> L3f
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.IllegalAccessException -> L3f
            javax.crypto.SecretKey r0 = (javax.crypto.SecretKey) r0     // Catch: java.lang.IllegalAccessException -> L3f
            r5.accept(r0, r1)
            goto L66
        L3f:
            r6 = move-exception
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed to access the field 'masterSecret' via reflection."
            r7.<init>(r0, r6)
            throw r7
        L48:
            boolean r2 = io.netty.handler.ssl.OpenSsl.isAvailable()
            if (r2 == 0) goto L66
            boolean r2 = r0 instanceof io.netty.handler.ssl.ReferenceCountedOpenSslEngine
            if (r2 == 0) goto L66
            javax.crypto.spec.SecretKeySpec r2 = new javax.crypto.spec.SecretKeySpec
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine r0 = (io.netty.handler.ssl.ReferenceCountedOpenSslEngine) r0
            long r3 = r0.sslPointer()
            byte[] r0 = io.netty.internal.tcnative.SSL.getMasterKey(r3)
            java.lang.String r3 = "AES"
            r2.<init>(r0, r3)
            r5.accept(r2, r1)
        L66:
            r6.fireUserEventTriggered(r7)
            return
    }
}
