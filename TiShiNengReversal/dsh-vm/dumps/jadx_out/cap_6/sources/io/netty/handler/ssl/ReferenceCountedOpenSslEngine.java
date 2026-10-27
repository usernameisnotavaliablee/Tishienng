package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ReferenceCountedOpenSslEngine extends javax.net.ssl.SSLEngine implements io.netty.util.ReferenceCounted, io.netty.handler.ssl.ApplicationProtocolAccessor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final javax.net.ssl.SSLEngineResult CLOSED_NOT_HANDSHAKING = null;
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater<io.netty.handler.ssl.ReferenceCountedOpenSslEngine> DESTROYED_UPDATER = null;
    static final int MAX_PLAINTEXT_LENGTH = 0;
    private static final int MAX_RECORD_SIZE = 0;
    private static final javax.net.ssl.SSLEngineResult NEED_UNWRAP_CLOSED = null;
    private static final javax.net.ssl.SSLEngineResult NEED_UNWRAP_OK = null;
    private static final javax.net.ssl.SSLEngineResult NEED_WRAP_CLOSED = null;
    private static final javax.net.ssl.SSLEngineResult NEED_WRAP_OK = null;
    private static final int[] OPENSSL_OP_NO_PROTOCOLS = null;
    private static final int OPENSSL_OP_NO_PROTOCOL_INDEX_SSLV2 = 0;
    private static final int OPENSSL_OP_NO_PROTOCOL_INDEX_SSLV3 = 1;
    private static final int OPENSSL_OP_NO_PROTOCOL_INDEX_TLSv1 = 2;
    private static final int OPENSSL_OP_NO_PROTOCOL_INDEX_TLSv1_1 = 3;
    private static final int OPENSSL_OP_NO_PROTOCOL_INDEX_TLSv1_2 = 4;
    private static final int OPENSSL_OP_NO_PROTOCOL_INDEX_TLSv1_3 = 5;
    private static final io.netty.util.ResourceLeakDetector<io.netty.handler.ssl.ReferenceCountedOpenSslEngine> leakDetector = null;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private java.lang.Object algorithmConstraints;
    final io.netty.buffer.ByteBufAllocator alloc;
    private final io.netty.handler.ssl.OpenSslApplicationProtocolNegotiator apn;
    private volatile java.lang.String applicationProtocol;
    private volatile io.netty.handler.ssl.ClientAuth clientAuth;
    private final boolean clientMode;
    private volatile int destroyed;
    private final boolean enableOcsp;
    private java.lang.String endPointIdentificationAlgorithm;
    private final io.netty.handler.ssl.OpenSslEngineMap engineMap;
    private java.lang.Throwable handshakeException;
    private io.netty.handler.ssl.ReferenceCountedOpenSslEngine.HandshakeState handshakeState;
    private boolean isInboundDone;
    final boolean jdkCompatibilityMode;
    private volatile long lastAccessed;
    private final io.netty.util.ResourceLeakTracker<io.netty.handler.ssl.ReferenceCountedOpenSslEngine> leak;
    private volatile java.security.cert.Certificate[] localCertificateChain;
    private volatile java.util.Collection<?> matchers;
    private int maxWrapBufferSize;
    private int maxWrapOverhead;
    private volatile boolean needTask;
    private long networkBIO;
    private boolean outboundClosed;
    private boolean receivedShutdown;
    private final io.netty.util.AbstractReferenceCounted refCnt;
    private final io.netty.handler.ssl.OpenSslSession session;
    private final java.nio.ByteBuffer[] singleDstBuffer;
    private final java.nio.ByteBuffer[] singleSrcBuffer;
    private java.util.List<java.lang.String> sniHostNames;
    private long ssl;




    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.ssl.ReferenceCountedOpenSslEngine$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$Protocol = null;
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$ssl$ClientAuth = null;
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$ssl$ReferenceCountedOpenSslEngine$HandshakeState = null;

        static {
                io.netty.handler.ssl.ApplicationProtocolConfig$Protocol[] r0 = io.netty.handler.ssl.ApplicationProtocolConfig.Protocol.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine.AnonymousClass4.$SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$Protocol = r0
                r1 = 1
                io.netty.handler.ssl.ApplicationProtocolConfig$Protocol r2 = io.netty.handler.ssl.ApplicationProtocolConfig.Protocol.NONE     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.AnonymousClass4.$SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$Protocol     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.handler.ssl.ApplicationProtocolConfig$Protocol r3 = io.netty.handler.ssl.ApplicationProtocolConfig.Protocol.ALPN     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                r2 = 3
                int[] r3 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.AnonymousClass4.$SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$Protocol     // Catch: java.lang.NoSuchFieldError -> L28
                io.netty.handler.ssl.ApplicationProtocolConfig$Protocol r4 = io.netty.handler.ssl.ApplicationProtocolConfig.Protocol.NPN     // Catch: java.lang.NoSuchFieldError -> L28
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                r3 = 4
                int[] r4 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.AnonymousClass4.$SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$Protocol     // Catch: java.lang.NoSuchFieldError -> L33
                io.netty.handler.ssl.ApplicationProtocolConfig$Protocol r5 = io.netty.handler.ssl.ApplicationProtocolConfig.Protocol.NPN_AND_ALPN     // Catch: java.lang.NoSuchFieldError -> L33
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r4[r5] = r3     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                io.netty.handler.ssl.ClientAuth[] r4 = io.netty.handler.ssl.ClientAuth.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine.AnonymousClass4.$SwitchMap$io$netty$handler$ssl$ClientAuth = r4
                io.netty.handler.ssl.ClientAuth r5 = io.netty.handler.ssl.ClientAuth.NONE     // Catch: java.lang.NoSuchFieldError -> L44
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L44
                r4[r5] = r1     // Catch: java.lang.NoSuchFieldError -> L44
            L44:
                int[] r4 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.AnonymousClass4.$SwitchMap$io$netty$handler$ssl$ClientAuth     // Catch: java.lang.NoSuchFieldError -> L4e
                io.netty.handler.ssl.ClientAuth r5 = io.netty.handler.ssl.ClientAuth.REQUIRE     // Catch: java.lang.NoSuchFieldError -> L4e
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4e
                r4[r5] = r0     // Catch: java.lang.NoSuchFieldError -> L4e
            L4e:
                int[] r4 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.AnonymousClass4.$SwitchMap$io$netty$handler$ssl$ClientAuth     // Catch: java.lang.NoSuchFieldError -> L58
                io.netty.handler.ssl.ClientAuth r5 = io.netty.handler.ssl.ClientAuth.OPTIONAL     // Catch: java.lang.NoSuchFieldError -> L58
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L58
                r4[r5] = r2     // Catch: java.lang.NoSuchFieldError -> L58
            L58:
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState[] r4 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.HandshakeState.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine.AnonymousClass4.$SwitchMap$io$netty$handler$ssl$ReferenceCountedOpenSslEngine$HandshakeState = r4
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState r5 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.HandshakeState.NOT_STARTED     // Catch: java.lang.NoSuchFieldError -> L69
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L69
                r4[r5] = r1     // Catch: java.lang.NoSuchFieldError -> L69
            L69:
                int[] r1 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.AnonymousClass4.$SwitchMap$io$netty$handler$ssl$ReferenceCountedOpenSslEngine$HandshakeState     // Catch: java.lang.NoSuchFieldError -> L73
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState r4 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.HandshakeState.FINISHED     // Catch: java.lang.NoSuchFieldError -> L73
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L73
                r1[r4] = r0     // Catch: java.lang.NoSuchFieldError -> L73
            L73:
                int[] r0 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.AnonymousClass4.$SwitchMap$io$netty$handler$ssl$ReferenceCountedOpenSslEngine$HandshakeState     // Catch: java.lang.NoSuchFieldError -> L7d
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState r1 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.HandshakeState.STARTED_IMPLICITLY     // Catch: java.lang.NoSuchFieldError -> L7d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L7d
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L7d
            L7d:
                int[] r0 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.AnonymousClass4.$SwitchMap$io$netty$handler$ssl$ReferenceCountedOpenSslEngine$HandshakeState     // Catch: java.lang.NoSuchFieldError -> L87
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState r1 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.HandshakeState.STARTED_EXPLICITLY     // Catch: java.lang.NoSuchFieldError -> L87
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L87
                r0[r1] = r3     // Catch: java.lang.NoSuchFieldError -> L87
            L87:
                return
        }

        public AnonymousClass4() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class DefaultOpenSslSession implements io.netty.handler.ssl.OpenSslSession {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private volatile int applicationBufferSize;
        private java.lang.String cipher;
        private long creationTime;
        private byte[] id;
        private java.security.cert.Certificate[] peerCerts;
        private java.lang.String protocol;
        private final io.netty.handler.ssl.OpenSslSessionContext sessionContext;
        final /* synthetic */ io.netty.handler.ssl.ReferenceCountedOpenSslEngine this$0;
        private java.util.Map<java.lang.String, java.lang.Object> values;
        private javax.security.cert.X509Certificate[] x509PeerCerts;

        static {
                return
        }

        DefaultOpenSslSession(io.netty.handler.ssl.ReferenceCountedOpenSslEngine r1, io.netty.handler.ssl.OpenSslSessionContext r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                int r1 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.MAX_PLAINTEXT_LENGTH
                r0.applicationBufferSize = r1
                r0.sessionContext = r2
                return
        }

        private void initCerts(byte[][] r6, int r7) {
                r5 = this;
                r0 = 0
            L1:
                int r1 = r6.length
                if (r0 >= r1) goto L1f
                int r1 = r7 + r0
                java.security.cert.Certificate[] r2 = r5.peerCerts
                io.netty.handler.ssl.OpenSslX509Certificate r3 = new io.netty.handler.ssl.OpenSslX509Certificate
                r4 = r6[r0]
                r3.<init>(r4)
                r2[r1] = r3
                javax.security.cert.X509Certificate[] r2 = r5.x509PeerCerts
                io.netty.handler.ssl.OpenSslJavaxX509Certificate r3 = new io.netty.handler.ssl.OpenSslJavaxX509Certificate
                r4 = r6[r0]
                r3.<init>(r4)
                r2[r1] = r3
                int r0 = r0 + 1
                goto L1
            L1f:
                return
        }

        private void initPeerCerts() {
                r6 = this;
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r0 = r6.this$0
                long r0 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.access$400(r0)
                byte[][] r0 = io.netty.internal.tcnative.SSL.getPeerCertChain(r0)
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r1 = r6.this$0
                boolean r1 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.access$100(r1)
                r2 = 0
                if (r1 == 0) goto L30
                boolean r1 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.access$1200(r0)
                if (r1 == 0) goto L22
                java.security.cert.Certificate[] r0 = io.netty.util.internal.EmptyArrays.EMPTY_CERTIFICATES
                r6.peerCerts = r0
                javax.security.cert.X509Certificate[] r0 = io.netty.util.internal.EmptyArrays.EMPTY_JAVAX_X509_CERTIFICATES
                r6.x509PeerCerts = r0
                return
            L22:
                int r1 = r0.length
                java.security.cert.Certificate[] r1 = new java.security.cert.Certificate[r1]
                r6.peerCerts = r1
                int r1 = r0.length
                javax.security.cert.X509Certificate[] r1 = new javax.security.cert.X509Certificate[r1]
                r6.x509PeerCerts = r1
                r6.initCerts(r0, r2)
                return
            L30:
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r1 = r6.this$0
                long r3 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.access$400(r1)
                byte[] r1 = io.netty.internal.tcnative.SSL.getPeerCertificate(r3)
                boolean r3 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.access$1300(r1)
                if (r3 == 0) goto L49
                java.security.cert.Certificate[] r0 = io.netty.util.internal.EmptyArrays.EMPTY_CERTIFICATES
                r6.peerCerts = r0
                javax.security.cert.X509Certificate[] r0 = io.netty.util.internal.EmptyArrays.EMPTY_JAVAX_X509_CERTIFICATES
                r6.x509PeerCerts = r0
                return
            L49:
                boolean r3 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.access$1200(r0)
                r4 = 1
                if (r3 == 0) goto L67
                io.netty.handler.ssl.OpenSslX509Certificate r0 = new io.netty.handler.ssl.OpenSslX509Certificate
                r0.<init>(r1)
                java.security.cert.Certificate[] r3 = new java.security.cert.Certificate[r4]
                r3[r2] = r0
                r6.peerCerts = r3
                io.netty.handler.ssl.OpenSslJavaxX509Certificate r0 = new io.netty.handler.ssl.OpenSslJavaxX509Certificate
                r0.<init>(r1)
                javax.security.cert.X509Certificate[] r1 = new javax.security.cert.X509Certificate[r4]
                r1[r2] = r0
                r6.x509PeerCerts = r1
                return
            L67:
                int r3 = r0.length
                int r3 = r3 + r4
                java.security.cert.Certificate[] r3 = new java.security.cert.Certificate[r3]
                r6.peerCerts = r3
                int r5 = r0.length
                int r5 = r5 + r4
                javax.security.cert.X509Certificate[] r5 = new javax.security.cert.X509Certificate[r5]
                r6.x509PeerCerts = r5
                io.netty.handler.ssl.OpenSslX509Certificate r5 = new io.netty.handler.ssl.OpenSslX509Certificate
                r5.<init>(r1)
                r3[r2] = r5
                javax.security.cert.X509Certificate[] r3 = r6.x509PeerCerts
                io.netty.handler.ssl.OpenSslJavaxX509Certificate r5 = new io.netty.handler.ssl.OpenSslJavaxX509Certificate
                r5.<init>(r1)
                r3[r2] = r5
                r6.initCerts(r0, r4)
                return
        }

        private javax.net.ssl.SSLSessionBindingEvent newSSLSessionBindingEvent(java.lang.String r3) {
                r2 = this;
                javax.net.ssl.SSLSessionBindingEvent r0 = new javax.net.ssl.SSLSessionBindingEvent
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r1 = r2.this$0
                io.netty.handler.ssl.OpenSslSession r1 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.access$700(r1)
                r0.<init>(r1, r3)
                return r0
        }

        private void notifyUnbound(java.lang.Object r2, java.lang.String r3) {
                r1 = this;
                boolean r0 = r2 instanceof javax.net.ssl.SSLSessionBindingListener
                if (r0 == 0) goto Ld
                javax.net.ssl.SSLSessionBindingListener r2 = (javax.net.ssl.SSLSessionBindingListener) r2
                javax.net.ssl.SSLSessionBindingEvent r3 = r1.newSSLSessionBindingEvent(r3)
                r2.valueUnbound(r3)
            Ld:
                return
        }

        private java.lang.String selectApplicationProtocol(java.util.List<java.lang.String> r3, io.netty.handler.ssl.ApplicationProtocolConfig.SelectedListenerFailureBehavior r4, java.lang.String r5) throws javax.net.ssl.SSLException {
                r2 = this;
                io.netty.handler.ssl.ApplicationProtocolConfig$SelectedListenerFailureBehavior r0 = io.netty.handler.ssl.ApplicationProtocolConfig.SelectedListenerFailureBehavior.ACCEPT
                if (r4 != r0) goto L5
                goto Lf
            L5:
                int r0 = r3.size()
                boolean r1 = r3.contains(r5)
                if (r1 == 0) goto L10
            Lf:
                return r5
            L10:
                io.netty.handler.ssl.ApplicationProtocolConfig$SelectedListenerFailureBehavior r1 = io.netty.handler.ssl.ApplicationProtocolConfig.SelectedListenerFailureBehavior.CHOOSE_MY_LAST_PROTOCOL
                if (r4 != r1) goto L1d
                int r0 = r0 + (-1)
                java.lang.Object r3 = r3.get(r0)
                java.lang.String r3 = (java.lang.String) r3
                return r3
            L1d:
                javax.net.ssl.SSLException r3 = new javax.net.ssl.SSLException
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r0 = "unknown protocol "
                r4.append(r0)
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                r3.<init>(r4)
                throw r3
        }

        private void selectApplicationProtocol() throws javax.net.ssl.SSLException {
                r4 = this;
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r0 = r4.this$0
                io.netty.handler.ssl.OpenSslApplicationProtocolNegotiator r0 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.access$1400(r0)
                io.netty.handler.ssl.ApplicationProtocolConfig$SelectedListenerFailureBehavior r0 = r0.selectedListenerFailureBehavior()
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r1 = r4.this$0
                io.netty.handler.ssl.OpenSslApplicationProtocolNegotiator r1 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.access$1400(r1)
                java.util.List r1 = r1.protocols()
                int[] r2 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.AnonymousClass4.$SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$Protocol
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r3 = r4.this$0
                io.netty.handler.ssl.OpenSslApplicationProtocolNegotiator r3 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.access$1400(r3)
                io.netty.handler.ssl.ApplicationProtocolConfig$Protocol r3 = r3.protocol()
                int r3 = r3.ordinal()
                r2 = r2[r3]
                r3 = 1
                if (r2 == r3) goto L85
                r3 = 2
                if (r2 == r3) goto L70
                r3 = 3
                if (r2 == r3) goto L5a
                r3 = 4
                if (r2 != r3) goto L54
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r2 = r4.this$0
                long r2 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.access$400(r2)
                java.lang.String r2 = io.netty.internal.tcnative.SSL.getAlpnSelected(r2)
                if (r2 != 0) goto L48
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r2 = r4.this$0
                long r2 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.access$400(r2)
                java.lang.String r2 = io.netty.internal.tcnative.SSL.getNextProtoNegotiated(r2)
            L48:
                if (r2 == 0) goto L85
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r3 = r4.this$0
                java.lang.String r0 = r4.selectApplicationProtocol(r1, r0, r2)
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine.access$1502(r3, r0)
                return
            L54:
                java.lang.Error r0 = new java.lang.Error
                r0.<init>()
                throw r0
            L5a:
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r2 = r4.this$0
                long r2 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.access$400(r2)
                java.lang.String r2 = io.netty.internal.tcnative.SSL.getNextProtoNegotiated(r2)
                if (r2 == 0) goto L85
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r3 = r4.this$0
                java.lang.String r0 = r4.selectApplicationProtocol(r1, r0, r2)
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine.access$1502(r3, r0)
                return
            L70:
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r2 = r4.this$0
                long r2 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.access$400(r2)
                java.lang.String r2 = io.netty.internal.tcnative.SSL.getAlpnSelected(r2)
                if (r2 == 0) goto L85
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r3 = r4.this$0
                java.lang.String r0 = r4.selectApplicationProtocol(r1, r0, r2)
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine.access$1502(r3, r0)
            L85:
                return
        }

        @Override // javax.net.ssl.SSLSession
        public int getApplicationBufferSize() {
                r1 = this;
                int r0 = r1.applicationBufferSize
                return r0
        }

        @Override // javax.net.ssl.SSLSession
        public java.lang.String getCipherSuite() {
                r2 = this;
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r0 = r2.this$0
                monitor-enter(r0)
                java.lang.String r1 = r2.cipher     // Catch: java.lang.Throwable -> Lb
                if (r1 != 0) goto Ld
                java.lang.String r1 = "SSL_NULL_WITH_NULL_NULL"
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                return r1
            Lb:
                r1 = move-exception
                goto Lf
            Ld:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                return r1
            Lf:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                throw r1
        }

        @Override // javax.net.ssl.SSLSession
        public long getCreationTime() {
                r6 = this;
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r0 = r6.this$0
                monitor-enter(r0)
                long r1 = r6.creationTime     // Catch: java.lang.Throwable -> L24
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 != 0) goto L26
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r1 = r6.this$0     // Catch: java.lang.Throwable -> L24
                boolean r1 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.access$300(r1)     // Catch: java.lang.Throwable -> L24
                if (r1 != 0) goto L26
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r1 = r6.this$0     // Catch: java.lang.Throwable -> L24
                long r1 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.access$400(r1)     // Catch: java.lang.Throwable -> L24
                long r1 = io.netty.internal.tcnative.SSL.getTime(r1)     // Catch: java.lang.Throwable -> L24
                r3 = 1000(0x3e8, double:4.94E-321)
                long r1 = r1 * r3
                r6.creationTime = r1     // Catch: java.lang.Throwable -> L24
                goto L26
            L24:
                r1 = move-exception
                goto L2a
            L26:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
                long r0 = r6.creationTime
                return r0
            L2a:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
                throw r1
        }

        @Override // javax.net.ssl.SSLSession
        public byte[] getId() {
                r2 = this;
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r0 = r2.this$0
                monitor-enter(r0)
                byte[] r1 = r2.id     // Catch: java.lang.Throwable -> Lb
                if (r1 != 0) goto Ld
                byte[] r1 = io.netty.util.internal.EmptyArrays.EMPTY_BYTES     // Catch: java.lang.Throwable -> Lb
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                return r1
            Lb:
                r1 = move-exception
                goto L15
            Ld:
                java.lang.Object r1 = r1.clone()     // Catch: java.lang.Throwable -> Lb
                byte[] r1 = (byte[]) r1     // Catch: java.lang.Throwable -> Lb
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                return r1
            L15:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                throw r1
        }

        @Override // javax.net.ssl.SSLSession
        public long getLastAccessedTime() {
                r5 = this;
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r0 = r5.this$0
                long r0 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.access$800(r0)
                r2 = -1
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L10
                long r0 = r5.getCreationTime()
            L10:
                return r0
        }

        @Override // javax.net.ssl.SSLSession
        public java.security.cert.Certificate[] getLocalCertificates() {
                r1 = this;
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r0 = r1.this$0
                java.security.cert.Certificate[] r0 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.access$1600(r0)
                if (r0 != 0) goto La
                r0 = 0
                return r0
            La:
                java.lang.Object r0 = r0.clone()
                java.security.cert.Certificate[] r0 = (java.security.cert.Certificate[]) r0
                return r0
        }

        @Override // javax.net.ssl.SSLSession
        public java.security.Principal getLocalPrincipal() {
                r2 = this;
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r0 = r2.this$0
                java.security.cert.Certificate[] r0 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.access$1600(r0)
                if (r0 == 0) goto L16
                int r1 = r0.length
                if (r1 != 0) goto Lc
                goto L16
            Lc:
                r1 = 0
                r0 = r0[r1]
                java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0
                javax.security.auth.x500.X500Principal r0 = r0.getIssuerX500Principal()
                return r0
            L16:
                r0 = 0
                return r0
        }

        @Override // javax.net.ssl.SSLSession
        public int getPacketBufferSize() {
                r1 = this;
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r0 = r1.this$0
                int r0 = r0.maxEncryptedPacketLength()
                return r0
        }

        @Override // javax.net.ssl.SSLSession
        public javax.security.cert.X509Certificate[] getPeerCertificateChain() throws javax.net.ssl.SSLPeerUnverifiedException {
                r3 = this;
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r0 = r3.this$0
                monitor-enter(r0)
                javax.security.cert.X509Certificate[] r1 = r3.x509PeerCerts     // Catch: java.lang.Throwable -> L15
                boolean r1 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.access$1200(r1)     // Catch: java.lang.Throwable -> L15
                if (r1 != 0) goto L17
                javax.security.cert.X509Certificate[] r1 = r3.x509PeerCerts     // Catch: java.lang.Throwable -> L15
                java.lang.Object r1 = r1.clone()     // Catch: java.lang.Throwable -> L15
                javax.security.cert.X509Certificate[] r1 = (javax.security.cert.X509Certificate[]) r1     // Catch: java.lang.Throwable -> L15
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
                return r1
            L15:
                r1 = move-exception
                goto L1f
            L17:
                javax.net.ssl.SSLPeerUnverifiedException r1 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch: java.lang.Throwable -> L15
                java.lang.String r2 = "peer not verified"
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L15
                throw r1     // Catch: java.lang.Throwable -> L15
            L1f:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
                throw r1
        }

        @Override // javax.net.ssl.SSLSession
        public java.security.cert.Certificate[] getPeerCertificates() throws javax.net.ssl.SSLPeerUnverifiedException {
                r3 = this;
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r0 = r3.this$0
                monitor-enter(r0)
                java.security.cert.Certificate[] r1 = r3.peerCerts     // Catch: java.lang.Throwable -> L15
                boolean r1 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.access$1200(r1)     // Catch: java.lang.Throwable -> L15
                if (r1 != 0) goto L17
                java.security.cert.Certificate[] r1 = r3.peerCerts     // Catch: java.lang.Throwable -> L15
                java.lang.Object r1 = r1.clone()     // Catch: java.lang.Throwable -> L15
                java.security.cert.Certificate[] r1 = (java.security.cert.Certificate[]) r1     // Catch: java.lang.Throwable -> L15
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
                return r1
            L15:
                r1 = move-exception
                goto L1f
            L17:
                javax.net.ssl.SSLPeerUnverifiedException r1 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch: java.lang.Throwable -> L15
                java.lang.String r2 = "peer not verified"
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L15
                throw r1     // Catch: java.lang.Throwable -> L15
            L1f:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
                throw r1
        }

        @Override // javax.net.ssl.SSLSession
        public java.lang.String getPeerHost() {
                r1 = this;
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r0 = r1.this$0
                java.lang.String r0 = r0.getPeerHost()
                return r0
        }

        @Override // javax.net.ssl.SSLSession
        public int getPeerPort() {
                r1 = this;
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r0 = r1.this$0
                int r0 = r0.getPeerPort()
                return r0
        }

        @Override // javax.net.ssl.SSLSession
        public java.security.Principal getPeerPrincipal() throws javax.net.ssl.SSLPeerUnverifiedException {
                r2 = this;
                java.security.cert.Certificate[] r0 = r2.getPeerCertificates()
                r1 = 0
                r0 = r0[r1]
                java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0
                javax.security.auth.x500.X500Principal r0 = r0.getSubjectX500Principal()
                return r0
        }

        @Override // javax.net.ssl.SSLSession
        public java.lang.String getProtocol() {
                r4 = this;
                java.lang.String r0 = r4.protocol
                if (r0 != 0) goto L22
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r1 = r4.this$0
                monitor-enter(r1)
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r0 = r4.this$0     // Catch: java.lang.Throwable -> L1a
                boolean r0 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.access$300(r0)     // Catch: java.lang.Throwable -> L1a
                if (r0 != 0) goto L1c
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r0 = r4.this$0     // Catch: java.lang.Throwable -> L1a
                long r2 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.access$400(r0)     // Catch: java.lang.Throwable -> L1a
                java.lang.String r0 = io.netty.internal.tcnative.SSL.getVersion(r2)     // Catch: java.lang.Throwable -> L1a
                goto L1e
            L1a:
                r0 = move-exception
                goto L20
            L1c:
                java.lang.String r0 = ""
            L1e:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
                return r0
            L20:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
                throw r0
            L22:
                return r0
        }

        @Override // javax.net.ssl.SSLSession
        public javax.net.ssl.SSLSessionContext getSessionContext() {
                r1 = this;
                io.netty.handler.ssl.OpenSslSessionContext r0 = r1.sessionContext
                return r0
        }

        @Override // javax.net.ssl.SSLSession
        public java.lang.Object getValue(java.lang.String r2) {
                r1 = this;
                if (r2 == 0) goto L14
                monitor-enter(r1)
                java.util.Map<java.lang.String, java.lang.Object> r0 = r1.values     // Catch: java.lang.Throwable -> La
                if (r0 != 0) goto Lc
                r2 = 0
                monitor-exit(r1)     // Catch: java.lang.Throwable -> La
                return r2
            La:
                r2 = move-exception
                goto L12
            Lc:
                java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> La
                monitor-exit(r1)     // Catch: java.lang.Throwable -> La
                return r2
            L12:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> La
                throw r2
            L14:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "name"
                r2.<init>(r0)
                throw r2
        }

        @Override // javax.net.ssl.SSLSession
        public java.lang.String[] getValueNames() {
                r2 = this;
                monitor-enter(r2)
                java.util.Map<java.lang.String, java.lang.Object> r0 = r2.values     // Catch: java.lang.Throwable -> L1b
                if (r0 == 0) goto L1d
                boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L1b
                if (r1 == 0) goto Lc
                goto L1d
            Lc:
                java.util.Set r0 = r0.keySet()     // Catch: java.lang.Throwable -> L1b
                r1 = 0
                java.lang.String[] r1 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L1b
                java.lang.Object[] r0 = r0.toArray(r1)     // Catch: java.lang.Throwable -> L1b
                java.lang.String[] r0 = (java.lang.String[]) r0     // Catch: java.lang.Throwable -> L1b
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1b
                return r0
            L1b:
                r0 = move-exception
                goto L21
            L1d:
                java.lang.String[] r0 = io.netty.util.internal.EmptyArrays.EMPTY_STRINGS     // Catch: java.lang.Throwable -> L1b
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1b
                return r0
            L21:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1b
                throw r0
        }

        @Override // io.netty.handler.ssl.OpenSslSession
        public void handshakeFinished() throws javax.net.ssl.SSLException {
                r4 = this;
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r0 = r4.this$0
                monitor-enter(r0)
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r1 = r4.this$0     // Catch: java.lang.Throwable -> L47
                boolean r1 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.access$300(r1)     // Catch: java.lang.Throwable -> L47
                if (r1 != 0) goto L49
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r1 = r4.this$0     // Catch: java.lang.Throwable -> L47
                long r1 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.access$400(r1)     // Catch: java.lang.Throwable -> L47
                byte[] r1 = io.netty.internal.tcnative.SSL.getSessionId(r1)     // Catch: java.lang.Throwable -> L47
                r4.id = r1     // Catch: java.lang.Throwable -> L47
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r1 = r4.this$0     // Catch: java.lang.Throwable -> L47
                long r2 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.access$400(r1)     // Catch: java.lang.Throwable -> L47
                java.lang.String r2 = io.netty.internal.tcnative.SSL.getCipherForSSL(r2)     // Catch: java.lang.Throwable -> L47
                java.lang.String r1 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.access$900(r1, r2)     // Catch: java.lang.Throwable -> L47
                r4.cipher = r1     // Catch: java.lang.Throwable -> L47
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r1 = r4.this$0     // Catch: java.lang.Throwable -> L47
                long r1 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.access$400(r1)     // Catch: java.lang.Throwable -> L47
                java.lang.String r1 = io.netty.internal.tcnative.SSL.getVersion(r1)     // Catch: java.lang.Throwable -> L47
                r4.protocol = r1     // Catch: java.lang.Throwable -> L47
                r4.initPeerCerts()     // Catch: java.lang.Throwable -> L47
                r4.selectApplicationProtocol()     // Catch: java.lang.Throwable -> L47
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r1 = r4.this$0     // Catch: java.lang.Throwable -> L47
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine.access$1000(r1)     // Catch: java.lang.Throwable -> L47
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r1 = r4.this$0     // Catch: java.lang.Throwable -> L47
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState r2 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.HandshakeState.FINISHED     // Catch: java.lang.Throwable -> L47
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine.access$1102(r1, r2)     // Catch: java.lang.Throwable -> L47
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
                return
            L47:
                r1 = move-exception
                goto L51
            L49:
                javax.net.ssl.SSLException r1 = new javax.net.ssl.SSLException     // Catch: java.lang.Throwable -> L47
                java.lang.String r2 = "Already closed"
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L47
                throw r1     // Catch: java.lang.Throwable -> L47
            L51:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
                throw r1
        }

        @Override // javax.net.ssl.SSLSession
        public void invalidate() {
                r5 = this;
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r0 = r5.this$0
                monitor-enter(r0)
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r1 = r5.this$0     // Catch: java.lang.Throwable -> L17
                boolean r1 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.access$300(r1)     // Catch: java.lang.Throwable -> L17
                if (r1 != 0) goto L19
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r1 = r5.this$0     // Catch: java.lang.Throwable -> L17
                long r1 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.access$400(r1)     // Catch: java.lang.Throwable -> L17
                r3 = 0
                io.netty.internal.tcnative.SSL.setTimeout(r1, r3)     // Catch: java.lang.Throwable -> L17
                goto L19
            L17:
                r1 = move-exception
                goto L1b
            L19:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
                return
            L1b:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
                throw r1
        }

        @Override // javax.net.ssl.SSLSession
        public boolean isValid() {
                r9 = this;
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r0 = r9.this$0
                monitor-enter(r0)
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r1 = r9.this$0     // Catch: java.lang.Throwable -> L32
                boolean r1 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.access$300(r1)     // Catch: java.lang.Throwable -> L32
                r2 = 0
                if (r1 != 0) goto L34
                long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L32
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r1 = r9.this$0     // Catch: java.lang.Throwable -> L32
                long r5 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.access$400(r1)     // Catch: java.lang.Throwable -> L32
                long r5 = io.netty.internal.tcnative.SSL.getTimeout(r5)     // Catch: java.lang.Throwable -> L32
                r7 = 1000(0x3e8, double:4.94E-321)
                long r5 = r5 * r7
                long r3 = r3 - r5
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine r1 = r9.this$0     // Catch: java.lang.Throwable -> L32
                long r5 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.access$400(r1)     // Catch: java.lang.Throwable -> L32
                long r5 = io.netty.internal.tcnative.SSL.getTime(r5)     // Catch: java.lang.Throwable -> L32
                long r5 = r5 * r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L30
                r2 = 1
            L30:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
                return r2
            L32:
                r1 = move-exception
                goto L36
            L34:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
                return r2
            L36:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
                throw r1
        }

        @Override // javax.net.ssl.SSLSession
        public void putValue(java.lang.String r3, java.lang.Object r4) {
                r2 = this;
                if (r3 == 0) goto L34
                if (r4 == 0) goto L2c
                monitor-enter(r2)
                java.util.Map<java.lang.String, java.lang.Object> r0 = r2.values     // Catch: java.lang.Throwable -> L12
                if (r0 != 0) goto L14
                java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L12
                r1 = 2
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L12
                r2.values = r0     // Catch: java.lang.Throwable -> L12
                goto L14
            L12:
                r3 = move-exception
                goto L2a
            L14:
                java.lang.Object r0 = r0.put(r3, r4)     // Catch: java.lang.Throwable -> L12
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
                boolean r1 = r4 instanceof javax.net.ssl.SSLSessionBindingListener
                if (r1 == 0) goto L26
                javax.net.ssl.SSLSessionBindingListener r4 = (javax.net.ssl.SSLSessionBindingListener) r4
                javax.net.ssl.SSLSessionBindingEvent r1 = r2.newSSLSessionBindingEvent(r3)
                r4.valueBound(r1)
            L26:
                r2.notifyUnbound(r0, r3)
                return
            L2a:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
                throw r3
            L2c:
                java.lang.NullPointerException r3 = new java.lang.NullPointerException
                java.lang.String r4 = "value"
                r3.<init>(r4)
                throw r3
            L34:
                java.lang.NullPointerException r3 = new java.lang.NullPointerException
                java.lang.String r4 = "name"
                r3.<init>(r4)
                throw r3
        }

        @Override // javax.net.ssl.SSLSession
        public void removeValue(java.lang.String r2) {
                r1 = this;
                if (r2 == 0) goto L16
                monitor-enter(r1)
                java.util.Map<java.lang.String, java.lang.Object> r0 = r1.values     // Catch: java.lang.Throwable -> L9
                if (r0 != 0) goto Lb
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
                return
            L9:
                r2 = move-exception
                goto L14
            Lb:
                java.lang.Object r0 = r0.remove(r2)     // Catch: java.lang.Throwable -> L9
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
                r1.notifyUnbound(r0, r2)
                return
            L14:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
                throw r2
            L16:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "name"
                r2.<init>(r0)
                throw r2
        }

        @Override // io.netty.handler.ssl.OpenSslSession
        public void tryExpandApplicationBufferSize(int r2) {
                r1 = this;
                int r0 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.MAX_PLAINTEXT_LENGTH
                if (r2 <= r0) goto L12
                int r2 = r1.applicationBufferSize
                int r0 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.access$1700()
                if (r2 == r0) goto L12
                int r2 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.access$1700()
                r1.applicationBufferSize = r2
            L12:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private enum HandshakeState extends java.lang.Enum<io.netty.handler.ssl.ReferenceCountedOpenSslEngine.HandshakeState> {
        private static final /* synthetic */ io.netty.handler.ssl.ReferenceCountedOpenSslEngine.HandshakeState[] $VALUES = null;
        public static final io.netty.handler.ssl.ReferenceCountedOpenSslEngine.HandshakeState FINISHED = null;
        public static final io.netty.handler.ssl.ReferenceCountedOpenSslEngine.HandshakeState NOT_STARTED = null;
        public static final io.netty.handler.ssl.ReferenceCountedOpenSslEngine.HandshakeState STARTED_EXPLICITLY = null;
        public static final io.netty.handler.ssl.ReferenceCountedOpenSslEngine.HandshakeState STARTED_IMPLICITLY = null;

        static {
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState r0 = new io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState
                java.lang.String r1 = "NOT_STARTED"
                r2 = 0
                r0.<init>(r1, r2)
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine.HandshakeState.NOT_STARTED = r0
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState r1 = new io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState
                java.lang.String r3 = "STARTED_IMPLICITLY"
                r4 = 1
                r1.<init>(r3, r4)
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine.HandshakeState.STARTED_IMPLICITLY = r1
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState r3 = new io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState
                java.lang.String r5 = "STARTED_EXPLICITLY"
                r6 = 2
                r3.<init>(r5, r6)
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine.HandshakeState.STARTED_EXPLICITLY = r3
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState r5 = new io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState
                java.lang.String r7 = "FINISHED"
                r8 = 3
                r5.<init>(r7, r8)
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine.HandshakeState.FINISHED = r5
                r7 = 4
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState[] r7 = new io.netty.handler.ssl.ReferenceCountedOpenSslEngine.HandshakeState[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine.HandshakeState.$VALUES = r7
                return
        }

        HandshakeState(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.netty.handler.ssl.ReferenceCountedOpenSslEngine.HandshakeState valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState> r0 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.HandshakeState.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState r1 = (io.netty.handler.ssl.ReferenceCountedOpenSslEngine.HandshakeState) r1
                return r1
        }

        public static io.netty.handler.ssl.ReferenceCountedOpenSslEngine.HandshakeState[] values() {
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState[] r0 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.HandshakeState.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState[] r0 = (io.netty.handler.ssl.ReferenceCountedOpenSslEngine.HandshakeState[]) r0
                return r0
        }
    }

    static {
            java.lang.Class<io.netty.handler.ssl.ReferenceCountedOpenSslEngine> r0 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.class
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine.logger = r1
            io.netty.util.ResourceLeakDetectorFactory r1 = io.netty.util.ResourceLeakDetectorFactory.instance()
            io.netty.util.ResourceLeakDetector r1 = r1.newResourceLeakDetector(r0)
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine.leakDetector = r1
            int r2 = io.netty.internal.tcnative.SSL.SSL_OP_NO_SSLv2
            int r3 = io.netty.internal.tcnative.SSL.SSL_OP_NO_SSLv3
            int r4 = io.netty.internal.tcnative.SSL.SSL_OP_NO_TLSv1
            int r5 = io.netty.internal.tcnative.SSL.SSL_OP_NO_TLSv1_1
            int r6 = io.netty.internal.tcnative.SSL.SSL_OP_NO_TLSv1_2
            int r7 = io.netty.internal.tcnative.SSL.SSL_OP_NO_TLSv1_3
            int[] r1 = new int[]{r2, r3, r4, r5, r6, r7}
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine.OPENSSL_OP_NO_PROTOCOLS = r1
            int r1 = io.netty.internal.tcnative.SSL.SSL_MAX_PLAINTEXT_LENGTH
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine.MAX_PLAINTEXT_LENGTH = r1
            int r1 = io.netty.internal.tcnative.SSL.SSL_MAX_RECORD_LENGTH
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine.MAX_RECORD_SIZE = r1
            java.lang.String r1 = "destroyed"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine.DESTROYED_UPDATER = r0
            javax.net.ssl.SSLEngineResult r0 = new javax.net.ssl.SSLEngineResult
            javax.net.ssl.SSLEngineResult$Status r1 = javax.net.ssl.SSLEngineResult.Status.OK
            javax.net.ssl.SSLEngineResult$HandshakeStatus r2 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_UNWRAP
            r3 = 0
            r0.<init>(r1, r2, r3, r3)
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine.NEED_UNWRAP_OK = r0
            javax.net.ssl.SSLEngineResult r0 = new javax.net.ssl.SSLEngineResult
            javax.net.ssl.SSLEngineResult$Status r4 = javax.net.ssl.SSLEngineResult.Status.CLOSED
            r0.<init>(r4, r2, r3, r3)
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine.NEED_UNWRAP_CLOSED = r0
            javax.net.ssl.SSLEngineResult r0 = new javax.net.ssl.SSLEngineResult
            javax.net.ssl.SSLEngineResult$HandshakeStatus r2 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_WRAP
            r0.<init>(r1, r2, r3, r3)
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine.NEED_WRAP_OK = r0
            javax.net.ssl.SSLEngineResult r0 = new javax.net.ssl.SSLEngineResult
            r0.<init>(r4, r2, r3, r3)
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine.NEED_WRAP_CLOSED = r0
            javax.net.ssl.SSLEngineResult r0 = new javax.net.ssl.SSLEngineResult
            javax.net.ssl.SSLEngineResult$HandshakeStatus r1 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING
            r0.<init>(r4, r1, r3, r3)
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine.CLOSED_NOT_HANDSHAKING = r0
            return
    }

    ReferenceCountedOpenSslEngine(io.netty.handler.ssl.ReferenceCountedOpenSslContext r7, io.netty.buffer.ByteBufAllocator r8, java.lang.String r9, int r10, boolean r11, boolean r12) {
            r6 = this;
            r6.<init>(r9, r10)
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState r10 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.HandshakeState.NOT_STARTED
            r6.handshakeState = r10
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine$1 r10 = new io.netty.handler.ssl.ReferenceCountedOpenSslEngine$1
            r10.<init>(r6)
            r6.refCnt = r10
            io.netty.handler.ssl.ClientAuth r10 = io.netty.handler.ssl.ClientAuth.NONE
            r6.clientAuth = r10
            r0 = -1
            r6.lastAccessed = r0
            r0 = 1
            java.nio.ByteBuffer[] r1 = new java.nio.ByteBuffer[r0]
            r6.singleSrcBuffer = r1
            java.nio.ByteBuffer[] r1 = new java.nio.ByteBuffer[r0]
            r6.singleDstBuffer = r1
            io.netty.handler.ssl.OpenSsl.ensureAvailability()
            java.lang.String r1 = "alloc"
            java.lang.Object r8 = io.netty.util.internal.ObjectUtil.checkNotNull(r8, r1)
            io.netty.buffer.ByteBufAllocator r8 = (io.netty.buffer.ByteBufAllocator) r8
            r6.alloc = r8
            io.netty.handler.ssl.ApplicationProtocolNegotiator r8 = r7.applicationProtocolNegotiator()
            io.netty.handler.ssl.OpenSslApplicationProtocolNegotiator r8 = (io.netty.handler.ssl.OpenSslApplicationProtocolNegotiator) r8
            r6.apn = r8
            boolean r8 = r7.isClient()
            r6.clientMode = r8
            int r1 = io.netty.util.internal.PlatformDependent.javaVersion()
            r2 = 7
            if (r1 < r2) goto L52
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine$2 r1 = new io.netty.handler.ssl.ReferenceCountedOpenSslEngine$2
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine$DefaultOpenSslSession r2 = new io.netty.handler.ssl.ReferenceCountedOpenSslEngine$DefaultOpenSslSession
            io.netty.handler.ssl.OpenSslSessionContext r3 = r7.sessionContext()
            r2.<init>(r6, r3)
            r1.<init>(r6, r2)
            r6.session = r1
            goto L5d
        L52:
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine$DefaultOpenSslSession r1 = new io.netty.handler.ssl.ReferenceCountedOpenSslEngine$DefaultOpenSslSession
            io.netty.handler.ssl.OpenSslSessionContext r2 = r7.sessionContext()
            r1.<init>(r6, r2)
            r6.session = r1
        L5d:
            io.netty.handler.ssl.OpenSslEngineMap r1 = r7.engineMap
            r6.engineMap = r1
            boolean r1 = r7.enableOcsp
            r6.enableOcsp = r1
            java.security.cert.Certificate[] r2 = r7.keyCertChain
            r6.localCertificateChain = r2
            r6.jdkCompatibilityMode = r11
            java.util.concurrent.locks.ReadWriteLock r2 = r7.ctxLock
            java.util.concurrent.locks.Lock r2 = r2.readLock()
            r2.lock()
            long r3 = r7.ctx     // Catch: java.lang.Throwable -> Le4
            boolean r5 = r7.isClient()     // Catch: java.lang.Throwable -> Le4
            r0 = r0 ^ r5
            long r3 = io.netty.internal.tcnative.SSL.newSSL(r3, r0)     // Catch: java.lang.Throwable -> Le4
            r2.unlock()
            monitor-enter(r6)
            r6.ssl = r3     // Catch: java.lang.Throwable -> Le1
            int r0 = r7.getBioNonApplicationBufferSize()     // Catch: java.lang.Throwable -> L9f
            long r2 = io.netty.internal.tcnative.SSL.bioNewByteBuffer(r3, r0)     // Catch: java.lang.Throwable -> L9f
            r6.networkBIO = r2     // Catch: java.lang.Throwable -> L9f
            if (r8 == 0) goto L92
            goto L94
        L92:
            io.netty.handler.ssl.ClientAuth r10 = r7.clientAuth     // Catch: java.lang.Throwable -> L9f
        L94:
            r6.setClientAuth(r10)     // Catch: java.lang.Throwable -> L9f
            java.lang.String[] r7 = r7.protocols     // Catch: java.lang.Throwable -> L9f
            if (r7 == 0) goto La1
            r6.setEnabledProtocols(r7)     // Catch: java.lang.Throwable -> L9f
            goto La1
        L9f:
            r7 = move-exception
            goto Lcd
        La1:
            if (r8 == 0) goto Lb4
            boolean r7 = io.netty.handler.ssl.SslUtils.isValidHostNameForSNI(r9)     // Catch: java.lang.Throwable -> L9f
            if (r7 == 0) goto Lb4
            long r7 = r6.ssl     // Catch: java.lang.Throwable -> L9f
            io.netty.internal.tcnative.SSL.setTlsExtHostName(r7, r9)     // Catch: java.lang.Throwable -> L9f
            java.util.List r7 = java.util.Collections.singletonList(r9)     // Catch: java.lang.Throwable -> L9f
            r6.sniHostNames = r7     // Catch: java.lang.Throwable -> L9f
        Lb4:
            if (r1 == 0) goto Lbb
            long r7 = r6.ssl     // Catch: java.lang.Throwable -> L9f
            io.netty.internal.tcnative.SSL.enableOcsp(r7)     // Catch: java.lang.Throwable -> L9f
        Lbb:
            if (r11 != 0) goto Lc9
            long r7 = r6.ssl     // Catch: java.lang.Throwable -> L9f
            int r9 = io.netty.internal.tcnative.SSL.getMode(r7)     // Catch: java.lang.Throwable -> L9f
            int r10 = io.netty.internal.tcnative.SSL.SSL_MODE_ENABLE_PARTIAL_WRITE     // Catch: java.lang.Throwable -> L9f
            r9 = r9 | r10
            io.netty.internal.tcnative.SSL.setMode(r7, r9)     // Catch: java.lang.Throwable -> L9f
        Lc9:
            r6.calculateMaxWrapOverhead()     // Catch: java.lang.Throwable -> L9f
            goto Ld3
        Lcd:
            r6.shutdown()     // Catch: java.lang.Throwable -> Le1
            io.netty.util.internal.PlatformDependent.throwException(r7)     // Catch: java.lang.Throwable -> Le1
        Ld3:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Le1
            if (r12 == 0) goto Ldd
            io.netty.util.ResourceLeakDetector<io.netty.handler.ssl.ReferenceCountedOpenSslEngine> r7 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.leakDetector
            io.netty.util.ResourceLeakTracker r7 = r7.track(r6)
            goto Lde
        Ldd:
            r7 = 0
        Lde:
            r6.leak = r7
            return
        Le1:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Le1
            throw r7
        Le4:
            r7 = move-exception
            r2.unlock()
            throw r7
    }

    static /* synthetic */ io.netty.util.ResourceLeakTracker access$000(io.netty.handler.ssl.ReferenceCountedOpenSslEngine r0) {
            io.netty.util.ResourceLeakTracker<io.netty.handler.ssl.ReferenceCountedOpenSslEngine> r0 = r0.leak
            return r0
    }

    static /* synthetic */ boolean access$100(io.netty.handler.ssl.ReferenceCountedOpenSslEngine r0) {
            boolean r0 = r0.clientMode
            return r0
    }

    static /* synthetic */ void access$1000(io.netty.handler.ssl.ReferenceCountedOpenSslEngine r0) {
            r0.calculateMaxWrapOverhead()
            return
    }

    static /* synthetic */ io.netty.handler.ssl.ReferenceCountedOpenSslEngine.HandshakeState access$1102(io.netty.handler.ssl.ReferenceCountedOpenSslEngine r0, io.netty.handler.ssl.ReferenceCountedOpenSslEngine.HandshakeState r1) {
            r0.handshakeState = r1
            return r1
    }

    static /* synthetic */ boolean access$1200(java.lang.Object[] r0) {
            boolean r0 = isEmpty(r0)
            return r0
    }

    static /* synthetic */ boolean access$1300(byte[] r0) {
            boolean r0 = isEmpty(r0)
            return r0
    }

    static /* synthetic */ io.netty.handler.ssl.OpenSslApplicationProtocolNegotiator access$1400(io.netty.handler.ssl.ReferenceCountedOpenSslEngine r0) {
            io.netty.handler.ssl.OpenSslApplicationProtocolNegotiator r0 = r0.apn
            return r0
    }

    static /* synthetic */ java.lang.String access$1502(io.netty.handler.ssl.ReferenceCountedOpenSslEngine r0, java.lang.String r1) {
            r0.applicationProtocol = r1
            return r1
    }

    static /* synthetic */ java.security.cert.Certificate[] access$1600(io.netty.handler.ssl.ReferenceCountedOpenSslEngine r0) {
            java.security.cert.Certificate[] r0 = r0.localCertificateChain
            return r0
    }

    static /* synthetic */ int access$1700() {
            int r0 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.MAX_RECORD_SIZE
            return r0
    }

    static /* synthetic */ java.util.List access$200(io.netty.handler.ssl.ReferenceCountedOpenSslEngine r0) {
            java.util.List<java.lang.String> r0 = r0.sniHostNames
            return r0
    }

    static /* synthetic */ boolean access$300(io.netty.handler.ssl.ReferenceCountedOpenSslEngine r0) {
            boolean r0 = r0.isDestroyed()
            return r0
    }

    static /* synthetic */ long access$400(io.netty.handler.ssl.ReferenceCountedOpenSslEngine r2) {
            long r0 = r2.ssl
            return r0
    }

    static /* synthetic */ boolean access$500(io.netty.handler.ssl.ReferenceCountedOpenSslEngine r0) {
            boolean r0 = r0.enableOcsp
            return r0
    }

    static /* synthetic */ boolean access$602(io.netty.handler.ssl.ReferenceCountedOpenSslEngine r0, boolean r1) {
            r0.needTask = r1
            return r1
    }

    static /* synthetic */ io.netty.handler.ssl.OpenSslSession access$700(io.netty.handler.ssl.ReferenceCountedOpenSslEngine r0) {
            io.netty.handler.ssl.OpenSslSession r0 = r0.session
            return r0
    }

    static /* synthetic */ long access$800(io.netty.handler.ssl.ReferenceCountedOpenSslEngine r2) {
            long r0 = r2.lastAccessed
            return r0
    }

    static /* synthetic */ java.lang.String access$900(io.netty.handler.ssl.ReferenceCountedOpenSslEngine r0, java.lang.String r1) {
            java.lang.String r0 = r0.toJavaCipherSuite(r1)
            return r0
    }

    private static long bufferAddress(java.nio.ByteBuffer r2) {
            boolean r0 = io.netty.util.internal.PlatformDependent.hasUnsafe()
            if (r0 == 0) goto Lb
            long r0 = io.netty.util.internal.PlatformDependent.directBufferAddress(r2)
            return r0
        Lb:
            long r0 = io.netty.internal.tcnative.Buffer.address(r2)
            return r0
    }

    private void calculateMaxWrapOverhead() {
            r2 = this;
            long r0 = r2.ssl
            int r0 = io.netty.internal.tcnative.SSL.getMaxWrapOverhead(r0)
            r2.maxWrapOverhead = r0
            boolean r0 = r2.jdkCompatibilityMode
            if (r0 == 0) goto L11
            int r0 = r2.maxEncryptedPacketLength0()
            goto L17
        L11:
            int r0 = r2.maxEncryptedPacketLength0()
            int r0 = r0 << 4
        L17:
            r2.maxWrapBufferSize = r0
            return
    }

    private void checkEngineClosed() throws javax.net.ssl.SSLException {
            r2 = this;
            boolean r0 = r2.isDestroyed()
            if (r0 != 0) goto L7
            return
        L7:
            javax.net.ssl.SSLException r0 = new javax.net.ssl.SSLException
            java.lang.String r1 = "engine closed"
            r0.<init>(r1)
            throw r0
    }

    private void closeAll() throws javax.net.ssl.SSLException {
            r1 = this;
            r0 = 1
            r1.receivedShutdown = r0
            r1.closeOutbound()
            r1.closeInbound()
            return
    }

    private boolean doSSLShutdown() {
            r6 = this;
            long r0 = r6.ssl
            int r0 = io.netty.internal.tcnative.SSL.isInInit(r0)
            r1 = 0
            if (r0 == 0) goto La
            return r1
        La:
            long r2 = r6.ssl
            int r0 = io.netty.internal.tcnative.SSL.shutdownSSL(r2)
            if (r0 >= 0) goto L43
            long r2 = r6.ssl
            int r0 = io.netty.internal.tcnative.SSL.getError(r2, r0)
            int r2 = io.netty.internal.tcnative.SSL.SSL_ERROR_SYSCALL
            if (r0 == r2) goto L25
            int r2 = io.netty.internal.tcnative.SSL.SSL_ERROR_SSL
            if (r0 != r2) goto L21
            goto L25
        L21:
            io.netty.internal.tcnative.SSL.clearError()
            goto L43
        L25:
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.logger
            boolean r2 = r0.isDebugEnabled()
            if (r2 == 0) goto L3f
            int r2 = io.netty.internal.tcnative.SSL.getLastErrorNumber()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            long r4 = (long) r2
            java.lang.String r2 = io.netty.internal.tcnative.SSL.getErrorString(r4)
            java.lang.String r4 = "SSL_shutdown failed: OpenSSL error: {} {}"
            r0.debug(r4, r3, r2)
        L3f:
            r6.shutdown()
            return r1
        L43:
            r0 = 1
            return r0
    }

    private javax.net.ssl.SSLEngineResult.HandshakeStatus getHandshakeStatus(int r2) {
            r1 = this;
            boolean r0 = r1.needPendingStatus()
            if (r0 == 0) goto L12
            boolean r0 = r1.needTask
            if (r0 == 0) goto Ld
            javax.net.ssl.SSLEngineResult$HandshakeStatus r2 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_TASK
            return r2
        Ld:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r2 = pendingStatus(r2)
            return r2
        L12:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r2 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING
            return r2
    }

    private javax.net.ssl.SSLEngineResult.HandshakeStatus handshake() throws javax.net.ssl.SSLException {
            r5 = this;
            boolean r0 = r5.needTask
            if (r0 == 0) goto L7
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_TASK
            return r0
        L7:
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState r0 = r5.handshakeState
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState r1 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.HandshakeState.FINISHED
            if (r0 != r1) goto L10
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = javax.net.ssl.SSLEngineResult.HandshakeStatus.FINISHED
            return r0
        L10:
            r5.checkEngineClosed()
            java.lang.Throwable r0 = r5.handshakeException
            if (r0 == 0) goto L1c
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = r5.handshakeException()
            return r0
        L1c:
            io.netty.handler.ssl.OpenSslEngineMap r0 = r5.engineMap
            r0.add(r5)
            long r0 = r5.lastAccessed
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L2f
            long r0 = java.lang.System.currentTimeMillis()
            r5.lastAccessed = r0
        L2f:
            long r0 = r5.ssl
            int r0 = io.netty.internal.tcnative.SSL.doHandshake(r0)
            if (r0 > 0) goto L71
            long r1 = r5.ssl
            int r0 = io.netty.internal.tcnative.SSL.getError(r1, r0)
            int r1 = io.netty.internal.tcnative.SSL.SSL_ERROR_WANT_READ
            if (r0 == r1) goto L66
            int r1 = io.netty.internal.tcnative.SSL.SSL_ERROR_WANT_WRITE
            if (r0 != r1) goto L46
            goto L66
        L46:
            int r1 = io.netty.internal.tcnative.SSL.SSL_ERROR_WANT_X509_LOOKUP
            if (r0 == r1) goto L63
            int r1 = io.netty.internal.tcnative.SSL.SSL_ERROR_WANT_CERTIFICATE_VERIFY
            if (r0 == r1) goto L63
            int r1 = io.netty.internal.tcnative.SSL.SSL_ERROR_WANT_PRIVATE_KEY_OPERATION
            if (r0 != r1) goto L53
            goto L63
        L53:
            java.lang.Throwable r1 = r5.handshakeException
            if (r1 == 0) goto L5c
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = r5.handshakeException()
            return r0
        L5c:
            java.lang.String r1 = "SSL_do_handshake"
            javax.net.ssl.SSLException r0 = r5.shutdownWithError(r1, r0)
            throw r0
        L63:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_TASK
            return r0
        L66:
            long r0 = r5.networkBIO
            int r0 = io.netty.internal.tcnative.SSL.bioLengthNonApplication(r0)
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = pendingStatus(r0)
            return r0
        L71:
            long r0 = r5.networkBIO
            int r0 = io.netty.internal.tcnative.SSL.bioLengthNonApplication(r0)
            if (r0 <= 0) goto L7c
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_WRAP
            return r0
        L7c:
            io.netty.handler.ssl.OpenSslSession r0 = r5.session
            r0.handshakeFinished()
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = javax.net.ssl.SSLEngineResult.HandshakeStatus.FINISHED
            return r0
    }

    private javax.net.ssl.SSLEngineResult.HandshakeStatus handshakeException() throws javax.net.ssl.SSLException {
            r3 = this;
            long r0 = r3.networkBIO
            int r0 = io.netty.internal.tcnative.SSL.bioLengthNonApplication(r0)
            if (r0 <= 0) goto Lb
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_WRAP
            return r0
        Lb:
            java.lang.Throwable r0 = r3.handshakeException
            r1 = 0
            r3.handshakeException = r1
            r3.shutdown()
            boolean r1 = r0 instanceof javax.net.ssl.SSLHandshakeException
            if (r1 == 0) goto L1a
            javax.net.ssl.SSLHandshakeException r0 = (javax.net.ssl.SSLHandshakeException) r0
            throw r0
        L1a:
            javax.net.ssl.SSLHandshakeException r1 = new javax.net.ssl.SSLHandshakeException
            java.lang.String r2 = "General OpenSslEngine problem"
            r1.<init>(r2)
            r1.initCause(r0)
            throw r1
    }

    private boolean isBytesAvailableEnoughForWrap(int r7, int r8, int r9) {
            r6 = this;
            long r0 = (long) r7
            int r7 = r6.maxWrapOverhead
            long r2 = (long) r7
            long r4 = (long) r9
            long r2 = r2 * r4
            long r0 = r0 - r2
            long r7 = (long) r8
            int r9 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r9 < 0) goto Lf
            r7 = 1
            return r7
        Lf:
            r7 = 0
            return r7
    }

    private boolean isDestroyed() {
            r1 = this;
            int r0 = r1.destroyed
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    private static boolean isEmpty(byte[] r0) {
            if (r0 == 0) goto L8
            int r0 = r0.length
            if (r0 != 0) goto L6
            goto L8
        L6:
            r0 = 0
            return r0
        L8:
            r0 = 1
            return r0
    }

    private static boolean isEmpty(java.lang.Object[] r0) {
            if (r0 == 0) goto L8
            int r0 = r0.length
            if (r0 != 0) goto L6
            goto L8
        L6:
            r0 = 0
            return r0
        L8:
            r0 = 1
            return r0
    }

    private static boolean isEndPointVerificationEnabled(java.lang.String r0) {
            if (r0 == 0) goto La
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    private static boolean isProtocolEnabled(int r0, int r1, java.lang.String r2) {
            r0 = r0 & r1
            if (r0 != 0) goto Ld
            java.util.Set<java.lang.String> r0 = io.netty.handler.ssl.OpenSsl.SUPPORTED_PROTOCOLS_SET
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto Ld
            r0 = 1
            return r0
        Ld:
            r0 = 0
            return r0
    }

    private javax.net.ssl.SSLEngineResult.HandshakeStatus mayFinishHandshake(javax.net.ssl.SSLEngineResult.HandshakeStatus r3) throws javax.net.ssl.SSLException {
            r2 = this;
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING
            if (r3 != r0) goto Le
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState r0 = r2.handshakeState
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState r1 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.HandshakeState.FINISHED
            if (r0 == r1) goto Le
            javax.net.ssl.SSLEngineResult$HandshakeStatus r3 = r2.handshake()
        Le:
            return r3
    }

    private boolean needPendingStatus() {
            r2 = this;
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState r0 = r2.handshakeState
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState r1 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.HandshakeState.NOT_STARTED
            if (r0 == r1) goto L20
            boolean r0 = r2.isDestroyed()
            if (r0 != 0) goto L20
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState r0 = r2.handshakeState
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState r1 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.HandshakeState.FINISHED
            if (r0 != r1) goto L1e
            boolean r0 = r2.isInboundDone()
            if (r0 != 0) goto L1e
            boolean r0 = r2.isOutboundDone()
            if (r0 == 0) goto L20
        L1e:
            r0 = 1
            return r0
        L20:
            r0 = 0
            return r0
    }

    private javax.net.ssl.SSLEngineResult newResult(javax.net.ssl.SSLEngineResult.HandshakeStatus r2, int r3, int r4) {
            r1 = this;
            javax.net.ssl.SSLEngineResult$Status r0 = javax.net.ssl.SSLEngineResult.Status.OK
            javax.net.ssl.SSLEngineResult r2 = r1.newResult(r0, r2, r3, r4)
            return r2
    }

    private javax.net.ssl.SSLEngineResult newResult(javax.net.ssl.SSLEngineResult.Status r2, javax.net.ssl.SSLEngineResult.HandshakeStatus r3, int r4, int r5) {
            r1 = this;
            boolean r0 = r1.isOutboundDone()
            if (r0 == 0) goto L19
            boolean r2 = r1.isInboundDone()
            if (r2 == 0) goto L11
            javax.net.ssl.SSLEngineResult$HandshakeStatus r3 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING
            r1.shutdown()
        L11:
            javax.net.ssl.SSLEngineResult r2 = new javax.net.ssl.SSLEngineResult
            javax.net.ssl.SSLEngineResult$Status r0 = javax.net.ssl.SSLEngineResult.Status.CLOSED
            r2.<init>(r0, r3, r4, r5)
            return r2
        L19:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_TASK
            if (r3 != r0) goto L20
            r0 = 1
            r1.needTask = r0
        L20:
            javax.net.ssl.SSLEngineResult r0 = new javax.net.ssl.SSLEngineResult
            r0.<init>(r2, r3, r4, r5)
            return r0
    }

    private javax.net.ssl.SSLEngineResult newResultMayFinishHandshake(javax.net.ssl.SSLEngineResult.HandshakeStatus r2, int r3, int r4) throws javax.net.ssl.SSLException {
            r1 = this;
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = javax.net.ssl.SSLEngineResult.HandshakeStatus.FINISHED
            if (r2 == r0) goto L8
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = r1.getHandshakeStatus()
        L8:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r2 = r1.mayFinishHandshake(r0)
            javax.net.ssl.SSLEngineResult r2 = r1.newResult(r2, r3, r4)
            return r2
    }

    private javax.net.ssl.SSLEngineResult newResultMayFinishHandshake(javax.net.ssl.SSLEngineResult.Status r2, javax.net.ssl.SSLEngineResult.HandshakeStatus r3, int r4, int r5) throws javax.net.ssl.SSLException {
            r1 = this;
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = javax.net.ssl.SSLEngineResult.HandshakeStatus.FINISHED
            if (r3 == r0) goto L8
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = r1.getHandshakeStatus()
        L8:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r3 = r1.mayFinishHandshake(r0)
            javax.net.ssl.SSLEngineResult r2 = r1.newResult(r2, r3, r4, r5)
            return r2
    }

    private static javax.net.ssl.SSLEngineResult.HandshakeStatus pendingStatus(int r0) {
            if (r0 <= 0) goto L5
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_WRAP
            return r0
        L5:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_UNWRAP
            return r0
    }

    private int readPlaintextData(java.nio.ByteBuffer r9) {
            r8 = this;
            int r0 = r9.position()
            boolean r1 = r9.isDirect()
            if (r1 == 0) goto L22
            long r1 = r8.ssl
            long r3 = bufferAddress(r9)
            long r5 = (long) r0
            long r3 = r3 + r5
            int r5 = r9.limit()
            int r5 = r5 - r0
            int r1 = io.netty.internal.tcnative.SSL.readFromSSL(r1, r3, r5)
            if (r1 <= 0) goto L21
            int r0 = r0 + r1
            r9.position(r0)
        L21:
            return r1
        L22:
            int r1 = r9.limit()
            int r2 = r8.maxEncryptedPacketLength0()
            int r3 = r1 - r0
            int r2 = java.lang.Math.min(r2, r3)
            io.netty.buffer.ByteBufAllocator r3 = r8.alloc
            io.netty.buffer.ByteBuf r3 = r3.directBuffer(r2)
            long r4 = r8.ssl     // Catch: java.lang.Throwable -> L51
            long r6 = io.netty.handler.ssl.OpenSsl.memoryAddress(r3)     // Catch: java.lang.Throwable -> L51
            int r2 = io.netty.internal.tcnative.SSL.readFromSSL(r4, r6, r2)     // Catch: java.lang.Throwable -> L51
            if (r2 <= 0) goto L53
            int r0 = r0 + r2
            r9.limit(r0)     // Catch: java.lang.Throwable -> L51
            int r0 = r3.readerIndex()     // Catch: java.lang.Throwable -> L51
            r3.getBytes(r0, r9)     // Catch: java.lang.Throwable -> L51
            r9.limit(r1)     // Catch: java.lang.Throwable -> L51
            goto L53
        L51:
            r9 = move-exception
            goto L57
        L53:
            r3.release()
            return r2
        L57:
            r3.release()
            throw r9
    }

    private void rejectRemoteInitiatedRenegotiation() throws javax.net.ssl.SSLHandshakeException {
            r2 = this;
            boolean r0 = r2.isDestroyed()
            if (r0 != 0) goto L2f
            long r0 = r2.ssl
            int r0 = io.netty.internal.tcnative.SSL.getHandshakeCount(r0)
            r1 = 1
            if (r0 <= r1) goto L2f
            io.netty.handler.ssl.OpenSslSession r0 = r2.session
            java.lang.String r0 = r0.getProtocol()
            java.lang.String r1 = "TLSv1.3"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L2f
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState r0 = r2.handshakeState
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState r1 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.HandshakeState.FINISHED
            if (r0 == r1) goto L24
            goto L2f
        L24:
            r2.shutdown()
            javax.net.ssl.SSLHandshakeException r0 = new javax.net.ssl.SSLHandshakeException
            java.lang.String r1 = "remote-initiated renegotiation not allowed"
            r0.<init>(r1)
            throw r0
        L2f:
            return
    }

    private void resetSingleDstBuffer() {
            r3 = this;
            java.nio.ByteBuffer[] r0 = r3.singleDstBuffer
            r1 = 0
            r2 = 0
            r0[r1] = r2
            return
    }

    private void resetSingleSrcBuffer() {
            r3 = this;
            java.nio.ByteBuffer[] r0 = r3.singleSrcBuffer
            r1 = 0
            r2 = 0
            r0[r1] = r2
            return
    }

    private void setClientAuth(io.netty.handler.ssl.ClientAuth r6) {
            r5 = this;
            boolean r0 = r5.clientMode
            if (r0 == 0) goto L5
            return
        L5:
            monitor-enter(r5)
            io.netty.handler.ssl.ClientAuth r0 = r5.clientAuth     // Catch: java.lang.Throwable -> Lc
            if (r0 != r6) goto Le
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r6 = move-exception
            goto L41
        Le:
            int[] r0 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.AnonymousClass4.$SwitchMap$io$netty$handler$ssl$ClientAuth     // Catch: java.lang.Throwable -> Lc
            int r1 = r6.ordinal()     // Catch: java.lang.Throwable -> Lc
            r0 = r0[r1]     // Catch: java.lang.Throwable -> Lc
            r1 = 1
            r2 = 10
            if (r0 == r1) goto L37
            r3 = 2
            if (r0 == r3) goto L31
            r3 = 3
            if (r0 != r3) goto L27
            long r3 = r5.ssl     // Catch: java.lang.Throwable -> Lc
            io.netty.internal.tcnative.SSL.setVerify(r3, r1, r2)     // Catch: java.lang.Throwable -> Lc
            goto L3d
        L27:
            java.lang.Error r0 = new java.lang.Error     // Catch: java.lang.Throwable -> Lc
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Lc
            r0.<init>(r6)     // Catch: java.lang.Throwable -> Lc
            throw r0     // Catch: java.lang.Throwable -> Lc
        L31:
            long r0 = r5.ssl     // Catch: java.lang.Throwable -> Lc
            io.netty.internal.tcnative.SSL.setVerify(r0, r3, r2)     // Catch: java.lang.Throwable -> Lc
            goto L3d
        L37:
            long r0 = r5.ssl     // Catch: java.lang.Throwable -> Lc
            r3 = 0
            io.netty.internal.tcnative.SSL.setVerify(r0, r3, r2)     // Catch: java.lang.Throwable -> Lc
        L3d:
            r5.clientAuth = r6     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lc
            return
        L41:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lc
            throw r6
    }

    private javax.net.ssl.SSLException shutdownWithError(java.lang.String r2, int r3) {
            r1 = this;
            int r0 = io.netty.internal.tcnative.SSL.getLastErrorNumber()
            javax.net.ssl.SSLException r2 = r1.shutdownWithError(r2, r3, r0)
            return r2
    }

    private javax.net.ssl.SSLException shutdownWithError(java.lang.String r5, int r6, int r7) {
            r4 = this;
            long r0 = (long) r7
            java.lang.String r0 = io.netty.internal.tcnative.SSL.getErrorString(r0)
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.logger
            boolean r2 = r1.isDebugEnabled()
            if (r2 == 0) goto L29
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            r2[r5] = r6
            r5 = 2
            r2[r5] = r7
            r5 = 3
            r2[r5] = r0
            java.lang.String r5 = "{} failed with {}: OpenSSL error: {} {}"
            r1.debug(r5, r2)
        L29:
            r4.shutdown()
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState r5 = r4.handshakeState
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState r6 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.HandshakeState.FINISHED
            if (r5 != r6) goto L38
            javax.net.ssl.SSLException r5 = new javax.net.ssl.SSLException
            r5.<init>(r0)
            return r5
        L38:
            javax.net.ssl.SSLHandshakeException r5 = new javax.net.ssl.SSLHandshakeException
            r5.<init>(r0)
            java.lang.Throwable r6 = r4.handshakeException
            if (r6 == 0) goto L47
            r5.initCause(r6)
            r6 = 0
            r4.handshakeException = r6
        L47:
            return r5
    }

    private java.nio.ByteBuffer[] singleDstBuffer(java.nio.ByteBuffer r3) {
            r2 = this;
            java.nio.ByteBuffer[] r0 = r2.singleDstBuffer
            r1 = 0
            r0[r1] = r3
            return r0
    }

    private java.nio.ByteBuffer[] singleSrcBuffer(java.nio.ByteBuffer r3) {
            r2 = this;
            java.nio.ByteBuffer[] r0 = r2.singleSrcBuffer
            r1 = 0
            r0[r1] = r3
            return r0
    }

    private int sslPending0() {
            r2 = this;
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState r0 = r2.handshakeState
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState r1 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.HandshakeState.FINISHED
            if (r0 == r1) goto L8
            r0 = 0
            return r0
        L8:
            long r0 = r2.ssl
            int r0 = io.netty.internal.tcnative.SSL.sslPending(r0)
            return r0
    }

    private javax.net.ssl.SSLEngineResult sslReadErrorResult(int r3, int r4, int r5, int r6) throws javax.net.ssl.SSLException {
            r2 = this;
            long r0 = r2.networkBIO
            int r0 = io.netty.internal.tcnative.SSL.bioLengthNonApplication(r0)
            if (r0 <= 0) goto L2b
            java.lang.Throwable r3 = r2.handshakeException
            if (r3 != 0) goto L1e
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState r3 = r2.handshakeState
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState r0 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.HandshakeState.FINISHED
            if (r3 == r0) goto L1e
            javax.net.ssl.SSLHandshakeException r3 = new javax.net.ssl.SSLHandshakeException
            long r0 = (long) r4
            java.lang.String r4 = io.netty.internal.tcnative.SSL.getErrorString(r0)
            r3.<init>(r4)
            r2.handshakeException = r3
        L1e:
            io.netty.internal.tcnative.SSL.clearError()
            javax.net.ssl.SSLEngineResult r3 = new javax.net.ssl.SSLEngineResult
            javax.net.ssl.SSLEngineResult$Status r4 = javax.net.ssl.SSLEngineResult.Status.OK
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_WRAP
            r3.<init>(r4, r0, r5, r6)
            return r3
        L2b:
            java.lang.String r5 = "SSL_read"
            javax.net.ssl.SSLException r3 = r2.shutdownWithError(r5, r3, r4)
            throw r3
    }

    private java.lang.String toJavaCipherSuite(java.lang.String r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            long r0 = r2.ssl
            java.lang.String r0 = io.netty.internal.tcnative.SSL.getVersion(r0)
            java.lang.String r0 = toJavaCipherSuitePrefix(r0)
            java.lang.String r3 = io.netty.handler.ssl.CipherSuiteConverter.toJava(r3, r0)
            return r3
    }

    private static java.lang.String toJavaCipherSuitePrefix(java.lang.String r2) {
            r0 = 0
            if (r2 == 0) goto Le
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto La
            goto Le
        La:
            char r0 = r2.charAt(r0)
        Le:
            r2 = 83
            if (r0 == r2) goto L1c
            r2 = 84
            if (r0 == r2) goto L19
            java.lang.String r2 = "UNKNOWN"
            return r2
        L19:
            java.lang.String r2 = "TLS"
            return r2
        L1c:
            java.lang.String r2 = "SSL"
            return r2
    }

    private io.netty.buffer.ByteBuf writeEncryptedData(java.nio.ByteBuffer r9, int r10) {
            r8 = this;
            int r1 = r9.position()
            boolean r2 = r9.isDirect()
            if (r2 == 0) goto L1a
            long r2 = r8.networkBIO
            long r4 = bufferAddress(r9)
            long r6 = (long) r1
            long r4 = r4 + r6
            r6 = 0
            r1 = r2
            r3 = r4
            r5 = r10
            io.netty.internal.tcnative.SSL.bioSetByteBuffer(r1, r3, r5, r6)
            goto L45
        L1a:
            io.netty.buffer.ByteBufAllocator r2 = r8.alloc
            io.netty.buffer.ByteBuf r7 = r2.directBuffer(r10)
            int r2 = r9.limit()     // Catch: java.lang.Throwable -> L3e
            int r3 = r1 + r10
            r9.limit(r3)     // Catch: java.lang.Throwable -> L3e
            r7.writeBytes(r9)     // Catch: java.lang.Throwable -> L3e
            r9.position(r1)     // Catch: java.lang.Throwable -> L3e
            r9.limit(r2)     // Catch: java.lang.Throwable -> L3e
            long r1 = r8.networkBIO     // Catch: java.lang.Throwable -> L3e
            long r3 = io.netty.handler.ssl.OpenSsl.memoryAddress(r7)     // Catch: java.lang.Throwable -> L3e
            r6 = 0
            r5 = r10
            io.netty.internal.tcnative.SSL.bioSetByteBuffer(r1, r3, r5, r6)     // Catch: java.lang.Throwable -> L3e
            return r7
        L3e:
            r0 = move-exception
            r7.release()
            io.netty.util.internal.PlatformDependent.throwException(r0)
        L45:
            r0 = 0
            return r0
    }

    private int writePlaintextData(java.nio.ByteBuffer r8, int r9) {
            r7 = this;
            int r0 = r8.position()
            int r1 = r8.limit()
            boolean r2 = r8.isDirect()
            if (r2 == 0) goto L21
            long r1 = r7.ssl
            long r3 = bufferAddress(r8)
            long r5 = (long) r0
            long r3 = r3 + r5
            int r9 = io.netty.internal.tcnative.SSL.writeToSSL(r1, r3, r9)
            if (r9 <= 0) goto L20
            int r0 = r0 + r9
            r8.position(r0)
        L20:
            return r9
        L21:
            io.netty.buffer.ByteBufAllocator r2 = r7.alloc
            io.netty.buffer.ByteBuf r2 = r2.directBuffer(r9)
            int r3 = r0 + r9
            r8.limit(r3)     // Catch: java.lang.Throwable -> L44
            r3 = 0
            r2.setBytes(r3, r8)     // Catch: java.lang.Throwable -> L44
            r8.limit(r1)     // Catch: java.lang.Throwable -> L44
            long r3 = r7.ssl     // Catch: java.lang.Throwable -> L44
            long r5 = io.netty.handler.ssl.OpenSsl.memoryAddress(r2)     // Catch: java.lang.Throwable -> L44
            int r9 = io.netty.internal.tcnative.SSL.writeToSSL(r3, r5, r9)     // Catch: java.lang.Throwable -> L44
            if (r9 <= 0) goto L46
            int r0 = r0 + r9
            r8.position(r0)     // Catch: java.lang.Throwable -> L44
            goto L49
        L44:
            r8 = move-exception
            goto L4d
        L46:
            r8.position(r0)     // Catch: java.lang.Throwable -> L44
        L49:
            r2.release()
            return r9
        L4d:
            r2.release()
            throw r8
    }

    @Override // javax.net.ssl.SSLEngine
    public final synchronized void beginHandshake() throws javax.net.ssl.SSLException {
            r3 = this;
            monitor-enter(r3)
            int[] r0 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.AnonymousClass4.$SwitchMap$io$netty$handler$ssl$ReferenceCountedOpenSslEngine$HandshakeState     // Catch: java.lang.Throwable -> L1e
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState r1 = r3.handshakeState     // Catch: java.lang.Throwable -> L1e
            int r1 = r1.ordinal()     // Catch: java.lang.Throwable -> L1e
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L1e
            r1 = 1
            if (r0 == r1) goto L33
            r1 = 2
            if (r0 == r1) goto L2b
            r1 = 3
            if (r0 == r1) goto L20
            r1 = 4
            if (r0 != r1) goto L18
            goto L44
        L18:
            java.lang.Error r0 = new java.lang.Error     // Catch: java.lang.Throwable -> L1e
            r0.<init>()     // Catch: java.lang.Throwable -> L1e
            throw r0     // Catch: java.lang.Throwable -> L1e
        L1e:
            r0 = move-exception
            goto L46
        L20:
            r3.checkEngineClosed()     // Catch: java.lang.Throwable -> L1e
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState r0 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.HandshakeState.STARTED_EXPLICITLY     // Catch: java.lang.Throwable -> L1e
            r3.handshakeState = r0     // Catch: java.lang.Throwable -> L1e
            r3.calculateMaxWrapOverhead()     // Catch: java.lang.Throwable -> L1e
            goto L44
        L2b:
            javax.net.ssl.SSLException r0 = new javax.net.ssl.SSLException     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = "renegotiation unsupported"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1e
            throw r0     // Catch: java.lang.Throwable -> L1e
        L33:
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState r0 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.HandshakeState.STARTED_EXPLICITLY     // Catch: java.lang.Throwable -> L1e
            r3.handshakeState = r0     // Catch: java.lang.Throwable -> L1e
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = r3.handshake()     // Catch: java.lang.Throwable -> L1e
            javax.net.ssl.SSLEngineResult$HandshakeStatus r2 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_TASK     // Catch: java.lang.Throwable -> L1e
            if (r0 != r2) goto L41
            r3.needTask = r1     // Catch: java.lang.Throwable -> L1e
        L41:
            r3.calculateMaxWrapOverhead()     // Catch: java.lang.Throwable -> L1e
        L44:
            monitor-exit(r3)
            return
        L46:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1e
            throw r0
    }

    final int calculateMaxLengthForWrap(int r7, int r8) {
            r6 = this;
            int r0 = r6.maxWrapBufferSize
            long r0 = (long) r0
            long r2 = (long) r7
            int r7 = r6.maxWrapOverhead
            long r4 = (long) r7
            long r7 = (long) r8
            long r4 = r4 * r7
            long r2 = r2 + r4
            long r7 = java.lang.Math.min(r0, r2)
            int r8 = (int) r7
            return r8
    }

    final boolean checkSniHostnameMatch(byte[] r2) {
            r1 = this;
            java.util.Collection<?> r0 = r1.matchers
            boolean r2 = io.netty.handler.ssl.Java8SslUtils.checkSniHostnameMatch(r0, r2)
            return r2
    }

    @Override // javax.net.ssl.SSLEngine
    public final synchronized void closeInbound() throws javax.net.ssl.SSLException {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.isInboundDone     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L7
            monitor-exit(r2)
            return
        L7:
            r0 = 1
            r2.isInboundDone = r0     // Catch: java.lang.Throwable -> L14
            boolean r0 = r2.isOutboundDone()     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L16
            r2.shutdown()     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r0 = move-exception
            goto L2b
        L16:
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState r0 = r2.handshakeState     // Catch: java.lang.Throwable -> L14
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState r1 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.HandshakeState.NOT_STARTED     // Catch: java.lang.Throwable -> L14
            if (r0 == r1) goto L29
            boolean r0 = r2.receivedShutdown     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L21
            goto L29
        L21:
            javax.net.ssl.SSLException r0 = new javax.net.ssl.SSLException     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = "Inbound closed before receiving peer's close_notify: possible truncation attack?"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L14
            throw r0     // Catch: java.lang.Throwable -> L14
        L29:
            monitor-exit(r2)
            return
        L2b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            throw r0
    }

    @Override // javax.net.ssl.SSLEngine
    public final synchronized void closeOutbound() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.outboundClosed     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L7
            monitor-exit(r2)
            return
        L7:
            r0 = 1
            r2.outboundClosed = r0     // Catch: java.lang.Throwable -> L27
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState r0 = r2.handshakeState     // Catch: java.lang.Throwable -> L27
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState r1 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.HandshakeState.NOT_STARTED     // Catch: java.lang.Throwable -> L27
            if (r0 == r1) goto L29
            boolean r0 = r2.isDestroyed()     // Catch: java.lang.Throwable -> L27
            if (r0 != 0) goto L29
            long r0 = r2.ssl     // Catch: java.lang.Throwable -> L27
            int r0 = io.netty.internal.tcnative.SSL.getShutdown(r0)     // Catch: java.lang.Throwable -> L27
            int r1 = io.netty.internal.tcnative.SSL.SSL_SENT_SHUTDOWN     // Catch: java.lang.Throwable -> L27
            r0 = r0 & r1
            int r1 = io.netty.internal.tcnative.SSL.SSL_SENT_SHUTDOWN     // Catch: java.lang.Throwable -> L27
            if (r0 == r1) goto L2c
            r2.doSSLShutdown()     // Catch: java.lang.Throwable -> L27
            goto L2c
        L27:
            r0 = move-exception
            goto L2e
        L29:
            r2.shutdown()     // Catch: java.lang.Throwable -> L27
        L2c:
            monitor-exit(r2)
            return
        L2e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L27
            throw r0
    }

    @Override // javax.net.ssl.SSLEngine
    public final synchronized java.lang.Runnable getDelegatedTask() {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.isDestroyed()     // Catch: java.lang.Throwable -> L1b
            r1 = 0
            if (r0 == 0) goto La
            monitor-exit(r4)
            return r1
        La:
            long r2 = r4.ssl     // Catch: java.lang.Throwable -> L1b
            java.lang.Runnable r0 = io.netty.internal.tcnative.SSL.getTask(r2)     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L14
            monitor-exit(r4)
            return r1
        L14:
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine$3 r1 = new io.netty.handler.ssl.ReferenceCountedOpenSslEngine$3     // Catch: java.lang.Throwable -> L1b
            r1.<init>(r4, r0)     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r4)
            return r1
        L1b:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1b
            throw r0
    }

    @Override // javax.net.ssl.SSLEngine
    public final boolean getEnableSessionCreation() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // javax.net.ssl.SSLEngine
    public final java.lang.String[] getEnabledCipherSuites() {
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.isDestroyed()     // Catch: java.lang.Throwable -> L4a
            if (r0 != 0) goto L4c
            long r0 = r6.ssl     // Catch: java.lang.Throwable -> L4a
            java.lang.String[] r0 = io.netty.internal.tcnative.SSL.getCiphers(r0)     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L4a
            if (r0 != 0) goto L13
            java.lang.String[] r0 = io.netty.util.internal.EmptyArrays.EMPTY_STRINGS
            return r0
        L13:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            monitor-enter(r6)
            r2 = 0
            r3 = 0
        L1b:
            int r4 = r0.length     // Catch: java.lang.Throwable -> L29
            if (r3 >= r4) goto L3e
            r4 = r0[r3]     // Catch: java.lang.Throwable -> L29
            java.lang.String r4 = r6.toJavaCipherSuite(r4)     // Catch: java.lang.Throwable -> L29
            if (r4 != 0) goto L2b
            r4 = r0[r3]     // Catch: java.lang.Throwable -> L29
            goto L2b
        L29:
            r0 = move-exception
            goto L48
        L2b:
            boolean r5 = io.netty.handler.ssl.OpenSsl.isTlsv13Supported()     // Catch: java.lang.Throwable -> L29
            if (r5 != 0) goto L38
            boolean r5 = io.netty.handler.ssl.SslUtils.isTLSv13Cipher(r4)     // Catch: java.lang.Throwable -> L29
            if (r5 == 0) goto L38
            goto L3b
        L38:
            r1.add(r4)     // Catch: java.lang.Throwable -> L29
        L3b:
            int r3 = r3 + 1
            goto L1b
        L3e:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L29
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.Object[] r0 = r1.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
        L48:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L29
            throw r0
        L4a:
            r0 = move-exception
            goto L50
        L4c:
            java.lang.String[] r0 = io.netty.util.internal.EmptyArrays.EMPTY_STRINGS     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L4a
            return r0
        L50:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L4a
            throw r0
    }

    @Override // javax.net.ssl.SSLEngine
    public final java.lang.String[] getEnabledProtocols() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 6
            r0.<init>(r1)
            java.lang.String r1 = "SSLv2Hello"
            r0.add(r1)
            monitor-enter(r5)
            boolean r1 = r5.isDestroyed()     // Catch: java.lang.Throwable -> L7d
            r2 = 0
            if (r1 != 0) goto L7f
            long r3 = r5.ssl     // Catch: java.lang.Throwable -> L7d
            int r1 = io.netty.internal.tcnative.SSL.getOptions(r3)     // Catch: java.lang.Throwable -> L7d
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L7d
            int r3 = io.netty.internal.tcnative.SSL.SSL_OP_NO_TLSv1
            java.lang.String r4 = "TLSv1"
            boolean r3 = isProtocolEnabled(r1, r3, r4)
            if (r3 == 0) goto L29
            java.lang.String r3 = "TLSv1"
            r0.add(r3)
        L29:
            int r3 = io.netty.internal.tcnative.SSL.SSL_OP_NO_TLSv1_1
            java.lang.String r4 = "TLSv1.1"
            boolean r3 = isProtocolEnabled(r1, r3, r4)
            if (r3 == 0) goto L38
            java.lang.String r3 = "TLSv1.1"
            r0.add(r3)
        L38:
            int r3 = io.netty.internal.tcnative.SSL.SSL_OP_NO_TLSv1_2
            java.lang.String r4 = "TLSv1.2"
            boolean r3 = isProtocolEnabled(r1, r3, r4)
            if (r3 == 0) goto L47
            java.lang.String r3 = "TLSv1.2"
            r0.add(r3)
        L47:
            int r3 = io.netty.internal.tcnative.SSL.SSL_OP_NO_TLSv1_3
            java.lang.String r4 = "TLSv1.3"
            boolean r3 = isProtocolEnabled(r1, r3, r4)
            if (r3 == 0) goto L56
            java.lang.String r3 = "TLSv1.3"
            r0.add(r3)
        L56:
            int r3 = io.netty.internal.tcnative.SSL.SSL_OP_NO_SSLv2
            java.lang.String r4 = "SSLv2"
            boolean r3 = isProtocolEnabled(r1, r3, r4)
            if (r3 == 0) goto L65
            java.lang.String r3 = "SSLv2"
            r0.add(r3)
        L65:
            int r3 = io.netty.internal.tcnative.SSL.SSL_OP_NO_SSLv3
            java.lang.String r4 = "SSLv3"
            boolean r1 = isProtocolEnabled(r1, r3, r4)
            if (r1 == 0) goto L74
            java.lang.String r1 = "SSLv3"
            r0.add(r1)
        L74:
            java.lang.String[] r1 = new java.lang.String[r2]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
        L7d:
            r0 = move-exception
            goto L89
        L7f:
            java.lang.String[] r1 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L7d
            java.lang.Object[] r0 = r0.toArray(r1)     // Catch: java.lang.Throwable -> L7d
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch: java.lang.Throwable -> L7d
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L7d
            return r0
        L89:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L7d
            throw r0
    }

    @Override // javax.net.ssl.SSLEngine
    public final synchronized javax.net.ssl.SSLSession getHandshakeSession() {
            r2 = this;
            monitor-enter(r2)
            int[] r0 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.AnonymousClass4.$SwitchMap$io$netty$handler$ssl$ReferenceCountedOpenSslEngine$HandshakeState     // Catch: java.lang.Throwable -> L15
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState r1 = r2.handshakeState     // Catch: java.lang.Throwable -> L15
            int r1 = r1.ordinal()     // Catch: java.lang.Throwable -> L15
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L15
            r1 = 1
            if (r0 == r1) goto L17
            r1 = 2
            if (r0 == r1) goto L17
            io.netty.handler.ssl.OpenSslSession r0 = r2.session     // Catch: java.lang.Throwable -> L15
            monitor-exit(r2)
            return r0
        L15:
            r0 = move-exception
            goto L1a
        L17:
            monitor-exit(r2)
            r0 = 0
            return r0
        L1a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
            throw r0
    }

    @Override // javax.net.ssl.SSLEngine
    public final synchronized javax.net.ssl.SSLEngineResult.HandshakeStatus getHandshakeStatus() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.needPendingStatus()     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L1d
            boolean r0 = r2.needTask     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L11
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_TASK     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r2)
            return r0
        Lf:
            r0 = move-exception
            goto L21
        L11:
            long r0 = r2.networkBIO     // Catch: java.lang.Throwable -> Lf
            int r0 = io.netty.internal.tcnative.SSL.bioLengthNonApplication(r0)     // Catch: java.lang.Throwable -> Lf
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = pendingStatus(r0)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r2)
            return r0
        L1d:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r2)
            return r0
        L21:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf
            throw r0
    }

    @Override // javax.net.ssl.SSLEngine
    public final boolean getNeedClientAuth() {
            r2 = this;
            io.netty.handler.ssl.ClientAuth r0 = r2.clientAuth
            io.netty.handler.ssl.ClientAuth r1 = io.netty.handler.ssl.ClientAuth.REQUIRE
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // io.netty.handler.ssl.ApplicationProtocolAccessor
    public java.lang.String getNegotiatedApplicationProtocol() {
            r1 = this;
            java.lang.String r0 = r1.applicationProtocol
            return r0
    }

    public byte[] getOcspResponse() {
            r2 = this;
            boolean r0 = r2.enableOcsp
            if (r0 == 0) goto L1c
            boolean r0 = r2.clientMode
            if (r0 == 0) goto L14
            monitor-enter(r2)
            long r0 = r2.ssl     // Catch: java.lang.Throwable -> L11
            byte[] r0 = io.netty.internal.tcnative.SSL.getOcspResponse(r0)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L11
            return r0
        L11:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L11
            throw r0
        L14:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Not a client SSLEngine"
            r0.<init>(r1)
            throw r0
        L1c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "OCSP stapling is not enabled"
            r0.<init>(r1)
            throw r0
    }

    @Override // javax.net.ssl.SSLEngine
    public final synchronized javax.net.ssl.SSLParameters getSSLParameters() {
            r3 = this;
            monitor-enter(r3)
            javax.net.ssl.SSLParameters r0 = super.getSSLParameters()     // Catch: java.lang.Throwable -> L22
            int r1 = io.netty.util.internal.PlatformDependent.javaVersion()     // Catch: java.lang.Throwable -> L22
            r2 = 7
            if (r1 < r2) goto L40
            java.lang.String r2 = r3.endPointIdentificationAlgorithm     // Catch: java.lang.Throwable -> L22
            io.netty.handler.ssl.i0.a(r0, r2)     // Catch: java.lang.Throwable -> L22
            java.lang.Object r2 = r3.algorithmConstraints     // Catch: java.lang.Throwable -> L22
            io.netty.handler.ssl.Java7SslParametersUtils.setAlgorithmConstraints(r0, r2)     // Catch: java.lang.Throwable -> L22
            r2 = 8
            if (r1 < r2) goto L40
            java.util.List<java.lang.String> r1 = r3.sniHostNames     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L24
            io.netty.handler.ssl.Java8SslUtils.setSniHostNames(r0, r1)     // Catch: java.lang.Throwable -> L22
            goto L24
        L22:
            r0 = move-exception
            goto L42
        L24:
            boolean r1 = r3.isDestroyed()     // Catch: java.lang.Throwable -> L22
            if (r1 != 0) goto L3b
            long r1 = r3.ssl     // Catch: java.lang.Throwable -> L22
            int r1 = io.netty.internal.tcnative.SSL.getOptions(r1)     // Catch: java.lang.Throwable -> L22
            int r2 = io.netty.internal.tcnative.SSL.SSL_OP_CIPHER_SERVER_PREFERENCE     // Catch: java.lang.Throwable -> L22
            r1 = r1 & r2
            if (r1 == 0) goto L37
            r1 = 1
            goto L38
        L37:
            r1 = 0
        L38:
            io.netty.handler.ssl.Java8SslUtils.setUseCipherSuitesOrder(r0, r1)     // Catch: java.lang.Throwable -> L22
        L3b:
            java.util.Collection<?> r1 = r3.matchers     // Catch: java.lang.Throwable -> L22
            io.netty.handler.ssl.Java8SslUtils.setSNIMatchers(r0, r1)     // Catch: java.lang.Throwable -> L22
        L40:
            monitor-exit(r3)
            return r0
        L42:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L22
            throw r0
    }

    @Override // javax.net.ssl.SSLEngine
    public final javax.net.ssl.SSLSession getSession() {
            r1 = this;
            io.netty.handler.ssl.OpenSslSession r0 = r1.session
            return r0
    }

    @Override // javax.net.ssl.SSLEngine
    public final java.lang.String[] getSupportedCipherSuites() {
            r2 = this;
            java.util.Set<java.lang.String> r0 = io.netty.handler.ssl.OpenSsl.AVAILABLE_CIPHER_SUITES
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
    }

    @Override // javax.net.ssl.SSLEngine
    public final java.lang.String[] getSupportedProtocols() {
            r2 = this;
            java.util.Set<java.lang.String> r0 = io.netty.handler.ssl.OpenSsl.SUPPORTED_PROTOCOLS_SET
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
    }

    @Override // javax.net.ssl.SSLEngine
    public final boolean getUseClientMode() {
            r1 = this;
            boolean r0 = r1.clientMode
            return r0
    }

    @Override // javax.net.ssl.SSLEngine
    public final boolean getWantClientAuth() {
            r2 = this;
            io.netty.handler.ssl.ClientAuth r0 = r2.clientAuth
            io.netty.handler.ssl.ClientAuth r1 = io.netty.handler.ssl.ClientAuth.OPTIONAL
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    final void initHandshakeException(java.lang.Throwable r1) {
            r0 = this;
            r0.handshakeException = r1
            return
    }

    @Override // javax.net.ssl.SSLEngine
    public final synchronized boolean isInboundDone() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.isInboundDone     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    @Override // javax.net.ssl.SSLEngine
    public final synchronized boolean isOutboundDone() {
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.outboundClosed     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L18
            long r0 = r5.networkBIO     // Catch: java.lang.Throwable -> L14
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L16
            int r0 = io.netty.internal.tcnative.SSL.bioLengthNonApplication(r0)     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L18
            goto L16
        L14:
            r0 = move-exception
            goto L1b
        L16:
            r0 = 1
            goto L19
        L18:
            r0 = 0
        L19:
            monitor-exit(r5)
            return r0
        L1b:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L14
            throw r0
    }

    final synchronized int maxEncryptedPacketLength() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.maxEncryptedPacketLength0()     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)
            return r0
        L7:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
            throw r0
    }

    final int maxEncryptedPacketLength0() {
            r2 = this;
            int r0 = r2.maxWrapOverhead
            int r1 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.MAX_PLAINTEXT_LENGTH
            int r0 = r0 + r1
            return r0
    }

    final synchronized int maxWrapOverhead() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.maxWrapOverhead     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public final int refCnt() {
            r1 = this;
            io.netty.util.AbstractReferenceCounted r0 = r1.refCnt
            int r0 = r0.refCnt()
            return r0
    }

    public final boolean release() {
            r1 = this;
            io.netty.util.AbstractReferenceCounted r0 = r1.refCnt
            boolean r0 = r0.release()
            return r0
    }

    public final boolean release(int r2) {
            r1 = this;
            io.netty.util.AbstractReferenceCounted r0 = r1.refCnt
            boolean r2 = r0.release(r2)
            return r2
    }

    public final io.netty.util.ReferenceCounted retain() {
            r1 = this;
            io.netty.util.AbstractReferenceCounted r0 = r1.refCnt
            r0.retain()
            return r1
    }

    public final io.netty.util.ReferenceCounted retain(int r2) {
            r1 = this;
            io.netty.util.AbstractReferenceCounted r0 = r1.refCnt
            r0.retain(r2)
            return r1
    }

    @Override // javax.net.ssl.SSLEngine
    public final void setEnableSessionCreation(boolean r1) {
            r0 = this;
            if (r1 != 0) goto L3
            return
        L3:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // javax.net.ssl.SSLEngine
    public final void setEnabledCipherSuites(java.lang.String[] r5) {
            r4 = this;
            java.lang.String r0 = "cipherSuites"
            io.netty.util.internal.ObjectUtil.checkNotNull(r5, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.List r5 = java.util.Arrays.asList(r5)
            boolean r2 = io.netty.handler.ssl.OpenSsl.isBoringSSL()
            io.netty.handler.ssl.CipherSuiteConverter.convertToCipherStrings(r5, r0, r1, r2)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = r1.toString()
            boolean r1 = io.netty.handler.ssl.OpenSsl.isTlsv13Supported()
            if (r1 != 0) goto L37
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L2f
            goto L37
        L2f:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "TLSv1.3 is not supported by this java version."
            r5.<init>(r0)
            throw r5
        L37:
            monitor-enter(r4)
            boolean r1 = r4.isDestroyed()     // Catch: java.lang.Throwable -> L51
            if (r1 != 0) goto L6e
            long r1 = r4.ssl     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            r3 = 0
            io.netty.internal.tcnative.SSL.setCipherSuites(r1, r5, r3)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            boolean r1 = io.netty.handler.ssl.OpenSsl.isTlsv13Supported()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            if (r1 == 0) goto L55
            long r1 = r4.ssl     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            r3 = 1
            io.netty.internal.tcnative.SSL.setCipherSuites(r1, r0, r3)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            goto L55
        L51:
            r5 = move-exception
            goto L85
        L53:
            r0 = move-exception
            goto L57
        L55:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L51
            return
        L57:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L51
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L51
            r2.<init>()     // Catch: java.lang.Throwable -> L51
            java.lang.String r3 = "failed to enable cipher suites: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L51
            r2.append(r5)     // Catch: java.lang.Throwable -> L51
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> L51
            r1.<init>(r5, r0)     // Catch: java.lang.Throwable -> L51
            throw r1     // Catch: java.lang.Throwable -> L51
        L6e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L51
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L51
            r1.<init>()     // Catch: java.lang.Throwable -> L51
            java.lang.String r2 = "failed to enable cipher suites: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L51
            r1.append(r5)     // Catch: java.lang.Throwable -> L51
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L51
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L51
            throw r0     // Catch: java.lang.Throwable -> L51
        L85:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L51
            throw r5
    }

    @Override // javax.net.ssl.SSLEngine
    public final void setEnabledProtocols(java.lang.String[] r9) {
            r8 = this;
            if (r9 == 0) goto Lec
            int[] r0 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.OPENSSL_OP_NO_PROTOCOLS
            int r0 = r0.length
            int r1 = r9.length
            r2 = 0
            r3 = 0
            r4 = 0
        L9:
            r5 = 1
            if (r3 >= r1) goto L92
            r6 = r9[r3]
            java.util.Set<java.lang.String> r7 = io.netty.handler.ssl.OpenSsl.SUPPORTED_PROTOCOLS_SET
            boolean r7 = r7.contains(r6)
            if (r7 == 0) goto L76
            java.lang.String r7 = "SSLv2"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L25
            if (r0 <= 0) goto L21
            r0 = 0
        L21:
            if (r4 >= 0) goto L73
            r4 = 0
            goto L73
        L25:
            java.lang.String r7 = "SSLv3"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L34
            if (r0 <= r5) goto L30
            r0 = 1
        L30:
            if (r4 >= r5) goto L73
            r4 = 1
            goto L73
        L34:
            java.lang.String r5 = "TLSv1"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L44
            r5 = 2
            if (r0 <= r5) goto L40
            r0 = 2
        L40:
            if (r4 >= r5) goto L73
            r4 = 2
            goto L73
        L44:
            java.lang.String r5 = "TLSv1.1"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L54
            r5 = 3
            if (r0 <= r5) goto L50
            r0 = 3
        L50:
            if (r4 >= r5) goto L73
            r4 = 3
            goto L73
        L54:
            java.lang.String r5 = "TLSv1.2"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L64
            r5 = 4
            if (r0 <= r5) goto L60
            r0 = 4
        L60:
            if (r4 >= r5) goto L73
            r4 = 4
            goto L73
        L64:
            java.lang.String r5 = "TLSv1.3"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L73
            r5 = 5
            if (r0 <= r5) goto L70
            r0 = 5
        L70:
            if (r4 >= r5) goto L73
            r4 = 5
        L73:
            int r3 = r3 + 1
            goto L9
        L76:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Protocol "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = " is not supported."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        L92:
            monitor-enter(r8)
            boolean r1 = r8.isDestroyed()     // Catch: java.lang.Throwable -> Lba
            if (r1 != 0) goto Lcf
            long r6 = r8.ssl     // Catch: java.lang.Throwable -> Lba
            int r9 = io.netty.internal.tcnative.SSL.SSL_OP_NO_SSLv2     // Catch: java.lang.Throwable -> Lba
            int r1 = io.netty.internal.tcnative.SSL.SSL_OP_NO_SSLv3     // Catch: java.lang.Throwable -> Lba
            r9 = r9 | r1
            int r1 = io.netty.internal.tcnative.SSL.SSL_OP_NO_TLSv1     // Catch: java.lang.Throwable -> Lba
            r9 = r9 | r1
            int r1 = io.netty.internal.tcnative.SSL.SSL_OP_NO_TLSv1_1     // Catch: java.lang.Throwable -> Lba
            r9 = r9 | r1
            int r1 = io.netty.internal.tcnative.SSL.SSL_OP_NO_TLSv1_2     // Catch: java.lang.Throwable -> Lba
            r9 = r9 | r1
            int r1 = io.netty.internal.tcnative.SSL.SSL_OP_NO_TLSv1_3     // Catch: java.lang.Throwable -> Lba
            r9 = r9 | r1
            io.netty.internal.tcnative.SSL.clearOptions(r6, r9)     // Catch: java.lang.Throwable -> Lba
            r9 = 0
        Lb0:
            if (r2 >= r0) goto Lbc
            int[] r1 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.OPENSSL_OP_NO_PROTOCOLS     // Catch: java.lang.Throwable -> Lba
            r1 = r1[r2]     // Catch: java.lang.Throwable -> Lba
            r9 = r9 | r1
            int r2 = r2 + 1
            goto Lb0
        Lba:
            r9 = move-exception
            goto Lea
        Lbc:
            int r4 = r4 + r5
        Lbd:
            int[] r0 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.OPENSSL_OP_NO_PROTOCOLS     // Catch: java.lang.Throwable -> Lba
            int r1 = r0.length     // Catch: java.lang.Throwable -> Lba
            if (r4 >= r1) goto Lc8
            r0 = r0[r4]     // Catch: java.lang.Throwable -> Lba
            r9 = r9 | r0
            int r4 = r4 + 1
            goto Lbd
        Lc8:
            long r0 = r8.ssl     // Catch: java.lang.Throwable -> Lba
            io.netty.internal.tcnative.SSL.setOptions(r0, r9)     // Catch: java.lang.Throwable -> Lba
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Lba
            return
        Lcf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lba
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lba
            r1.<init>()     // Catch: java.lang.Throwable -> Lba
            java.lang.String r2 = "failed to enable protocols: "
            r1.append(r2)     // Catch: java.lang.Throwable -> Lba
            java.util.List r9 = java.util.Arrays.asList(r9)     // Catch: java.lang.Throwable -> Lba
            r1.append(r9)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r9 = r1.toString()     // Catch: java.lang.Throwable -> Lba
            r0.<init>(r9)     // Catch: java.lang.Throwable -> Lba
            throw r0     // Catch: java.lang.Throwable -> Lba
        Lea:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Lba
            throw r9
        Lec:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>()
            throw r9
    }

    final void setKeyMaterial(io.netty.handler.ssl.OpenSslKeyMaterial r7) throws java.lang.Exception {
            r6 = this;
            long r0 = r6.ssl
            long r2 = r7.certificateChainAddress()
            long r4 = r7.privateKeyAddress()
            io.netty.internal.tcnative.SSL.setKeyMaterial(r0, r2, r4)
            java.security.cert.X509Certificate[] r7 = r7.certificateChain()
            r6.localCertificateChain = r7
            return
    }

    @Override // javax.net.ssl.SSLEngine
    public final void setNeedClientAuth(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L5
            io.netty.handler.ssl.ClientAuth r1 = io.netty.handler.ssl.ClientAuth.REQUIRE
            goto L7
        L5:
            io.netty.handler.ssl.ClientAuth r1 = io.netty.handler.ssl.ClientAuth.NONE
        L7:
            r0.setClientAuth(r1)
            return
    }

    public void setOcspResponse(byte[] r3) {
            r2 = this;
            boolean r0 = r2.enableOcsp
            if (r0 == 0) goto L1b
            boolean r0 = r2.clientMode
            if (r0 != 0) goto L13
            monitor-enter(r2)
            long r0 = r2.ssl     // Catch: java.lang.Throwable -> L10
            io.netty.internal.tcnative.SSL.setOcspResponse(r0, r3)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L10
            throw r3
        L13:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Not a server SSLEngine"
            r3.<init>(r0)
            throw r3
        L1b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "OCSP stapling is not enabled"
            r3.<init>(r0)
            throw r3
    }

    @Override // javax.net.ssl.SSLEngine
    public final synchronized void setSSLParameters(javax.net.ssl.SSLParameters r6) {
            r5 = this;
            monitor-enter(r5)
            int r0 = io.netty.util.internal.PlatformDependent.javaVersion()     // Catch: java.lang.Throwable -> L36
            r1 = 7
            if (r0 < r1) goto L7b
            java.security.AlgorithmConstraints r1 = io.netty.handler.ssl.f0.a(r6)     // Catch: java.lang.Throwable -> L36
            if (r1 != 0) goto L73
            r1 = 8
            if (r0 < r1) goto L55
            boolean r0 = r5.isDestroyed()     // Catch: java.lang.Throwable -> L36
            if (r0 != 0) goto L4f
            boolean r0 = r5.clientMode     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L3a
            java.util.List r0 = io.netty.handler.ssl.Java8SslUtils.getSniHostNames(r6)     // Catch: java.lang.Throwable -> L36
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L36
        L24:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L36
            if (r2 == 0) goto L38
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L36
            long r3 = r5.ssl     // Catch: java.lang.Throwable -> L36
            io.netty.internal.tcnative.SSL.setTlsExtHostName(r3, r2)     // Catch: java.lang.Throwable -> L36
            goto L24
        L36:
            r6 = move-exception
            goto L80
        L38:
            r5.sniHostNames = r0     // Catch: java.lang.Throwable -> L36
        L3a:
            boolean r0 = io.netty.handler.ssl.Java8SslUtils.getUseCipherSuitesOrder(r6)     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L48
            long r0 = r5.ssl     // Catch: java.lang.Throwable -> L36
            int r2 = io.netty.internal.tcnative.SSL.SSL_OP_CIPHER_SERVER_PREFERENCE     // Catch: java.lang.Throwable -> L36
            io.netty.internal.tcnative.SSL.setOptions(r0, r2)     // Catch: java.lang.Throwable -> L36
            goto L4f
        L48:
            long r0 = r5.ssl     // Catch: java.lang.Throwable -> L36
            int r2 = io.netty.internal.tcnative.SSL.SSL_OP_CIPHER_SERVER_PREFERENCE     // Catch: java.lang.Throwable -> L36
            io.netty.internal.tcnative.SSL.clearOptions(r0, r2)     // Catch: java.lang.Throwable -> L36
        L4f:
            java.util.Collection r0 = io.netty.handler.ssl.g0.a(r6)     // Catch: java.lang.Throwable -> L36
            r5.matchers = r0     // Catch: java.lang.Throwable -> L36
        L55:
            java.lang.String r0 = io.netty.handler.ssl.h0.a(r6)     // Catch: java.lang.Throwable -> L36
            boolean r1 = isEndPointVerificationEnabled(r0)     // Catch: java.lang.Throwable -> L36
            boolean r2 = r5.clientMode     // Catch: java.lang.Throwable -> L36
            if (r2 == 0) goto L6a
            if (r1 == 0) goto L6a
            long r1 = r5.ssl     // Catch: java.lang.Throwable -> L36
            r3 = 2
            r4 = -1
            io.netty.internal.tcnative.SSL.setVerify(r1, r3, r4)     // Catch: java.lang.Throwable -> L36
        L6a:
            r5.endPointIdentificationAlgorithm = r0     // Catch: java.lang.Throwable -> L36
            java.security.AlgorithmConstraints r0 = io.netty.handler.ssl.f0.a(r6)     // Catch: java.lang.Throwable -> L36
            r5.algorithmConstraints = r0     // Catch: java.lang.Throwable -> L36
            goto L7b
        L73:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = "AlgorithmConstraints are not supported."
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L36
            throw r6     // Catch: java.lang.Throwable -> L36
        L7b:
            super.setSSLParameters(r6)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r5)
            return
        L80:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L36
            throw r6
    }

    @Override // javax.net.ssl.SSLEngine
    public final void setUseClientMode(boolean r2) {
            r1 = this;
            boolean r0 = r1.clientMode
            if (r2 != r0) goto L5
            return
        L5:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            r2.<init>()
            throw r2
    }

    public final synchronized void setVerify(int r3, int r4) {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.ssl     // Catch: java.lang.Throwable -> L8
            io.netty.internal.tcnative.SSL.setVerify(r0, r3, r4)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r2)
            return
        L8:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8
            throw r3
    }

    @Override // javax.net.ssl.SSLEngine
    public final void setWantClientAuth(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L5
            io.netty.handler.ssl.ClientAuth r1 = io.netty.handler.ssl.ClientAuth.OPTIONAL
            goto L7
        L5:
            io.netty.handler.ssl.ClientAuth r1 = io.netty.handler.ssl.ClientAuth.NONE
        L7:
            r0.setClientAuth(r1)
            return
    }

    public final synchronized void shutdown() {
            r5 = this;
            monitor-enter(r5)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater<io.netty.handler.ssl.ReferenceCountedOpenSslEngine> r0 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.DESTROYED_UPDATER     // Catch: java.lang.Throwable -> L22
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r5, r1, r2)     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L24
            io.netty.handler.ssl.OpenSslEngineMap r0 = r5.engineMap     // Catch: java.lang.Throwable -> L22
            long r3 = r5.ssl     // Catch: java.lang.Throwable -> L22
            r0.remove(r3)     // Catch: java.lang.Throwable -> L22
            long r0 = r5.ssl     // Catch: java.lang.Throwable -> L22
            io.netty.internal.tcnative.SSL.freeSSL(r0)     // Catch: java.lang.Throwable -> L22
            r0 = 0
            r5.networkBIO = r0     // Catch: java.lang.Throwable -> L22
            r5.ssl = r0     // Catch: java.lang.Throwable -> L22
            r5.outboundClosed = r2     // Catch: java.lang.Throwable -> L22
            r5.isInboundDone = r2     // Catch: java.lang.Throwable -> L22
            goto L24
        L22:
            r0 = move-exception
            goto L29
        L24:
            io.netty.internal.tcnative.SSL.clearError()     // Catch: java.lang.Throwable -> L22
            monitor-exit(r5)
            return
        L29:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L22
            throw r0
    }

    final synchronized int sslPending() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.sslPending0()     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)
            return r0
        L7:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
            throw r0
    }

    public final synchronized long sslPointer() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.ssl     // Catch: java.lang.Throwable -> L5
            monitor-exit(r2)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public final io.netty.util.ReferenceCounted touch() {
            r1 = this;
            io.netty.util.AbstractReferenceCounted r0 = r1.refCnt
            r0.touch()
            return r1
    }

    public final io.netty.util.ReferenceCounted touch(java.lang.Object r2) {
            r1 = this;
            io.netty.util.AbstractReferenceCounted r0 = r1.refCnt
            r0.touch(r2)
            return r1
    }

    @Override // javax.net.ssl.SSLEngine
    public final synchronized javax.net.ssl.SSLEngineResult unwrap(java.nio.ByteBuffer r1, java.nio.ByteBuffer r2) throws javax.net.ssl.SSLException {
            r0 = this;
            monitor-enter(r0)
            java.nio.ByteBuffer[] r1 = r0.singleSrcBuffer(r1)     // Catch: java.lang.Throwable -> L17
            java.nio.ByteBuffer[] r2 = r0.singleDstBuffer(r2)     // Catch: java.lang.Throwable -> L17
            javax.net.ssl.SSLEngineResult r1 = r0.unwrap(r1, r2)     // Catch: java.lang.Throwable -> L17
            r0.resetSingleSrcBuffer()     // Catch: java.lang.Throwable -> L15
            r0.resetSingleDstBuffer()     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)
            return r1
        L15:
            r1 = move-exception
            goto L1f
        L17:
            r1 = move-exception
            r0.resetSingleSrcBuffer()     // Catch: java.lang.Throwable -> L15
            r0.resetSingleDstBuffer()     // Catch: java.lang.Throwable -> L15
            throw r1     // Catch: java.lang.Throwable -> L15
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r1
    }

    @Override // javax.net.ssl.SSLEngine
    public final synchronized javax.net.ssl.SSLEngineResult unwrap(java.nio.ByteBuffer r1, java.nio.ByteBuffer[] r2) throws javax.net.ssl.SSLException {
            r0 = this;
            monitor-enter(r0)
            java.nio.ByteBuffer[] r1 = r0.singleSrcBuffer(r1)     // Catch: java.lang.Throwable -> L10
            javax.net.ssl.SSLEngineResult r1 = r0.unwrap(r1, r2)     // Catch: java.lang.Throwable -> L10
            r0.resetSingleSrcBuffer()     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)
            return r1
        Le:
            r1 = move-exception
            goto L15
        L10:
            r1 = move-exception
            r0.resetSingleSrcBuffer()     // Catch: java.lang.Throwable -> Le
            throw r1     // Catch: java.lang.Throwable -> Le
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    @Override // javax.net.ssl.SSLEngine
    public final synchronized javax.net.ssl.SSLEngineResult unwrap(java.nio.ByteBuffer r9, java.nio.ByteBuffer[] r10, int r11, int r12) throws javax.net.ssl.SSLException {
            r8 = this;
            monitor-enter(r8)
            java.nio.ByteBuffer[] r2 = r8.singleSrcBuffer(r9)     // Catch: java.lang.Throwable -> L1a
            r3 = 0
            r4 = 1
            r1 = r8
            r5 = r10
            r6 = r11
            r7 = r12
            javax.net.ssl.SSLEngineResult r9 = r1.unwrap(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L17
            r8.resetSingleSrcBuffer()     // Catch: java.lang.Throwable -> L14
            monitor-exit(r8)
            return r9
        L14:
            r0 = move-exception
            r9 = r0
            goto L21
        L17:
            r0 = move-exception
        L18:
            r9 = r0
            goto L1d
        L1a:
            r0 = move-exception
            r1 = r8
            goto L18
        L1d:
            r8.resetSingleSrcBuffer()     // Catch: java.lang.Throwable -> L14
            throw r9     // Catch: java.lang.Throwable -> L14
        L21:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L14
            throw r9
    }

    public final javax.net.ssl.SSLEngineResult unwrap(java.nio.ByteBuffer[] r19, int r20, int r21, java.nio.ByteBuffer[] r22, int r23, int r24) throws javax.net.ssl.SSLException {
            r18 = this;
            r1 = r18
            r0 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            if (r0 == 0) goto L340
            int r7 = r0.length
            if (r2 >= r7) goto L313
            int r7 = r2 + r3
            int r8 = r0.length
            if (r7 > r8) goto L313
            if (r4 == 0) goto L30b
            int r3 = r4.length
            if (r5 >= r3) goto L2de
            int r3 = r5 + r6
            int r8 = r4.length
            if (r3 > r8) goto L2de
            r6 = r5
            r10 = 0
        L25:
            if (r6 >= r3) goto L5c
            r12 = r4[r6]
            if (r12 == 0) goto L40
            boolean r13 = r12.isReadOnly()
            if (r13 != 0) goto L3a
            int r12 = r12.remaining()
            long r12 = (long) r12
            long r10 = r10 + r12
            int r6 = r6 + 1
            goto L25
        L3a:
            java.nio.ReadOnlyBufferException r0 = new java.nio.ReadOnlyBufferException
            r0.<init>()
            throw r0
        L40:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "dsts["
            r2.append(r3)
            r2.append(r6)
            java.lang.String r3 = "] is null"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L5c:
            r6 = r2
            r12 = 0
        L5f:
            if (r6 >= r7) goto L8a
            r14 = r0[r6]
            if (r14 == 0) goto L6e
            int r14 = r14.remaining()
            long r14 = (long) r14
            long r12 = r12 + r14
            int r6 = r6 + 1
            goto L5f
        L6e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "srcs["
            r2.append(r3)
            r2.append(r6)
            java.lang.String r3 = "] is null"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L8a:
            monitor-enter(r18)
            boolean r6 = r1.isInboundDone()     // Catch: java.lang.Throwable -> La1
            if (r6 == 0) goto La8
            boolean r0 = r1.isOutboundDone()     // Catch: java.lang.Throwable -> La1
            if (r0 != 0) goto La4
            boolean r0 = r1.isDestroyed()     // Catch: java.lang.Throwable -> La1
            if (r0 == 0) goto L9e
            goto La4
        L9e:
            javax.net.ssl.SSLEngineResult r0 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.NEED_WRAP_CLOSED     // Catch: java.lang.Throwable -> La1
            goto La6
        La1:
            r0 = move-exception
            goto L2dc
        La4:
            javax.net.ssl.SSLEngineResult r0 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.CLOSED_NOT_HANDSHAKING     // Catch: java.lang.Throwable -> La1
        La6:
            monitor-exit(r18)     // Catch: java.lang.Throwable -> La1
            return r0
        La8:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r6 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING     // Catch: java.lang.Throwable -> La1
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState r14 = r1.handshakeState     // Catch: java.lang.Throwable -> La1
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState r15 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.HandshakeState.FINISHED     // Catch: java.lang.Throwable -> La1
            r16 = 0
            r8 = 0
            if (r14 == r15) goto Ld9
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState r6 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.HandshakeState.STARTED_EXPLICITLY     // Catch: java.lang.Throwable -> La1
            if (r14 == r6) goto Lbb
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState r6 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.HandshakeState.STARTED_IMPLICITLY     // Catch: java.lang.Throwable -> La1
            r1.handshakeState = r6     // Catch: java.lang.Throwable -> La1
        Lbb:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r6 = r1.handshake()     // Catch: java.lang.Throwable -> La1
            javax.net.ssl.SSLEngineResult$HandshakeStatus r9 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_TASK     // Catch: java.lang.Throwable -> La1
            if (r6 != r9) goto Lc9
            javax.net.ssl.SSLEngineResult r0 = r1.newResult(r6, r8, r8)     // Catch: java.lang.Throwable -> La1
            monitor-exit(r18)     // Catch: java.lang.Throwable -> La1
            return r0
        Lc9:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r9 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_WRAP     // Catch: java.lang.Throwable -> La1
            if (r6 != r9) goto Ld1
            javax.net.ssl.SSLEngineResult r0 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.NEED_WRAP_OK     // Catch: java.lang.Throwable -> La1
            monitor-exit(r18)     // Catch: java.lang.Throwable -> La1
            return r0
        Ld1:
            boolean r9 = r1.isInboundDone     // Catch: java.lang.Throwable -> La1
            if (r9 == 0) goto Ld9
            javax.net.ssl.SSLEngineResult r0 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.NEED_WRAP_CLOSED     // Catch: java.lang.Throwable -> La1
            monitor-exit(r18)     // Catch: java.lang.Throwable -> La1
            return r0
        Ld9:
            int r9 = r1.sslPending0()     // Catch: java.lang.Throwable -> La1
            boolean r14 = r1.jdkCompatibilityMode     // Catch: java.lang.Throwable -> La1
            if (r14 == 0) goto L14e
            r14 = 5
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 >= 0) goto Lef
            javax.net.ssl.SSLEngineResult$Status r0 = javax.net.ssl.SSLEngineResult.Status.BUFFER_UNDERFLOW     // Catch: java.lang.Throwable -> La1
            javax.net.ssl.SSLEngineResult r0 = r1.newResultMayFinishHandshake(r0, r6, r8, r8)     // Catch: java.lang.Throwable -> La1
            monitor-exit(r18)     // Catch: java.lang.Throwable -> La1
            return r0
        Lef:
            int r14 = io.netty.handler.ssl.SslUtils.getEncryptedPacketLength(r19, r20)     // Catch: java.lang.Throwable -> La1
            r15 = -2
            if (r14 == r15) goto L146
            int r15 = r14 + (-5)
            r21 = r9
            long r8 = (long) r15     // Catch: java.lang.Throwable -> La1
            int r16 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r16 <= 0) goto L136
            int r0 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.MAX_RECORD_SIZE     // Catch: java.lang.Throwable -> La1
            if (r15 > r0) goto L111
            io.netty.handler.ssl.OpenSslSession r0 = r1.session     // Catch: java.lang.Throwable -> La1
            r0.tryExpandApplicationBufferSize(r15)     // Catch: java.lang.Throwable -> La1
            javax.net.ssl.SSLEngineResult$Status r0 = javax.net.ssl.SSLEngineResult.Status.BUFFER_OVERFLOW     // Catch: java.lang.Throwable -> La1
            r2 = 0
            javax.net.ssl.SSLEngineResult r0 = r1.newResultMayFinishHandshake(r0, r6, r2, r2)     // Catch: java.lang.Throwable -> La1
            monitor-exit(r18)     // Catch: java.lang.Throwable -> La1
            return r0
        L111:
            javax.net.ssl.SSLException r0 = new javax.net.ssl.SSLException     // Catch: java.lang.Throwable -> La1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La1
            r2.<init>()     // Catch: java.lang.Throwable -> La1
            java.lang.String r3 = "Illegal packet length: "
            r2.append(r3)     // Catch: java.lang.Throwable -> La1
            r2.append(r15)     // Catch: java.lang.Throwable -> La1
            java.lang.String r3 = " > "
            r2.append(r3)     // Catch: java.lang.Throwable -> La1
            io.netty.handler.ssl.OpenSslSession r3 = r1.session     // Catch: java.lang.Throwable -> La1
            int r3 = r3.getApplicationBufferSize()     // Catch: java.lang.Throwable -> La1
            r2.append(r3)     // Catch: java.lang.Throwable -> La1
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> La1
            r0.<init>(r2)     // Catch: java.lang.Throwable -> La1
            throw r0     // Catch: java.lang.Throwable -> La1
        L136:
            long r8 = (long) r14     // Catch: java.lang.Throwable -> La1
            int r10 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r10 >= 0) goto L144
            javax.net.ssl.SSLEngineResult$Status r0 = javax.net.ssl.SSLEngineResult.Status.BUFFER_UNDERFLOW     // Catch: java.lang.Throwable -> La1
            r2 = 0
            javax.net.ssl.SSLEngineResult r0 = r1.newResultMayFinishHandshake(r0, r6, r2, r2)     // Catch: java.lang.Throwable -> La1
            monitor-exit(r18)     // Catch: java.lang.Throwable -> La1
            return r0
        L144:
            r8 = 0
            goto L175
        L146:
            io.netty.handler.ssl.NotSslRecordException r0 = new io.netty.handler.ssl.NotSslRecordException     // Catch: java.lang.Throwable -> La1
            java.lang.String r2 = "not an SSL/TLS record"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> La1
            throw r0     // Catch: java.lang.Throwable -> La1
        L14e:
            r21 = r9
            int r8 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r8 != 0) goto L15f
            if (r21 > 0) goto L15f
            javax.net.ssl.SSLEngineResult$Status r0 = javax.net.ssl.SSLEngineResult.Status.BUFFER_UNDERFLOW     // Catch: java.lang.Throwable -> La1
            r2 = 0
            javax.net.ssl.SSLEngineResult r0 = r1.newResultMayFinishHandshake(r0, r6, r2, r2)     // Catch: java.lang.Throwable -> La1
            monitor-exit(r18)     // Catch: java.lang.Throwable -> La1
            return r0
        L15f:
            int r8 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r8 != 0) goto L16c
            javax.net.ssl.SSLEngineResult$Status r0 = javax.net.ssl.SSLEngineResult.Status.BUFFER_OVERFLOW     // Catch: java.lang.Throwable -> La1
            r8 = 0
            javax.net.ssl.SSLEngineResult r0 = r1.newResultMayFinishHandshake(r0, r6, r8, r8)     // Catch: java.lang.Throwable -> La1
            monitor-exit(r18)     // Catch: java.lang.Throwable -> La1
            return r0
        L16c:
            r8 = 0
            r9 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r9 = java.lang.Math.min(r9, r12)     // Catch: java.lang.Throwable -> La1
            int r14 = (int) r9
        L175:
            r10 = r21
            r9 = 0
        L178:
            r11 = r0[r2]     // Catch: java.lang.Throwable -> L190
            int r12 = r11.remaining()     // Catch: java.lang.Throwable -> L190
            if (r12 != 0) goto L193
            if (r10 > 0) goto L188
            int r2 = r2 + 1
            if (r2 < r7) goto L178
            goto L296
        L188:
            long r12 = r1.networkBIO     // Catch: java.lang.Throwable -> L190
            int r12 = io.netty.internal.tcnative.SSL.bioLengthByteBuffer(r12)     // Catch: java.lang.Throwable -> L190
            r13 = 0
            goto L19b
        L190:
            r0 = move-exception
            goto L2d3
        L193:
            int r12 = java.lang.Math.min(r14, r12)     // Catch: java.lang.Throwable -> L190
            io.netty.buffer.ByteBuf r13 = r1.writeEncryptedData(r11, r12)     // Catch: java.lang.Throwable -> L190
        L19b:
            r15 = r4[r5]     // Catch: java.lang.Throwable -> L1e7
            boolean r16 = r15.hasRemaining()     // Catch: java.lang.Throwable -> L1e7
            if (r16 != 0) goto L1ae
            int r5 = r5 + 1
            if (r5 < r3) goto L19b
            if (r13 == 0) goto L296
            r13.release()     // Catch: java.lang.Throwable -> L190
            goto L296
        L1ae:
            r20 = r2
            int r2 = r1.readPlaintextData(r15)     // Catch: java.lang.Throwable -> L1e7
            r21 = r9
            r23 = r10
            long r9 = r1.networkBIO     // Catch: java.lang.Throwable -> L1e7
            int r9 = io.netty.internal.tcnative.SSL.bioLengthByteBuffer(r9)     // Catch: java.lang.Throwable -> L1e7
            int r9 = r12 - r9
            int r10 = r21 + r9
            int r14 = r14 - r9
            int r12 = r12 - r9
            int r16 = r11.position()     // Catch: java.lang.Throwable -> L1e7
            int r9 = r16 + r9
            r11.position(r9)     // Catch: java.lang.Throwable -> L1e7
            if (r2 <= 0) goto L21c
            int r8 = r8 + r2
            boolean r2 = r15.hasRemaining()     // Catch: java.lang.Throwable -> L1e7
            if (r2 != 0) goto L206
            int r2 = r1.sslPending0()     // Catch: java.lang.Throwable -> L1e7
            int r5 = r5 + 1
            if (r5 < r3) goto L20f
            if (r2 <= 0) goto L1ea
            javax.net.ssl.SSLEngineResult$Status r0 = javax.net.ssl.SSLEngineResult.Status.BUFFER_OVERFLOW     // Catch: java.lang.Throwable -> L1e7
            javax.net.ssl.SSLEngineResult r0 = r1.newResult(r0, r6, r10, r8)     // Catch: java.lang.Throwable -> L1e7
            goto L1f9
        L1e7:
            r0 = move-exception
            goto L2cd
        L1ea:
            boolean r0 = r1.isInboundDone()     // Catch: java.lang.Throwable -> L1e7
            if (r0 == 0) goto L1f3
            javax.net.ssl.SSLEngineResult$Status r0 = javax.net.ssl.SSLEngineResult.Status.CLOSED     // Catch: java.lang.Throwable -> L1e7
            goto L1f5
        L1f3:
            javax.net.ssl.SSLEngineResult$Status r0 = javax.net.ssl.SSLEngineResult.Status.OK     // Catch: java.lang.Throwable -> L1e7
        L1f5:
            javax.net.ssl.SSLEngineResult r0 = r1.newResultMayFinishHandshake(r0, r6, r10, r8)     // Catch: java.lang.Throwable -> L1e7
        L1f9:
            if (r13 == 0) goto L1fe
            r13.release()     // Catch: java.lang.Throwable -> L190
        L1fe:
            long r2 = r1.networkBIO     // Catch: java.lang.Throwable -> La1
            io.netty.internal.tcnative.SSL.bioClearByteBuffer(r2)     // Catch: java.lang.Throwable -> La1
            goto L24f
        L204:
            monitor-exit(r18)     // Catch: java.lang.Throwable -> La1
            return r0
        L206:
            if (r14 == 0) goto L214
            boolean r2 = r1.jdkCompatibilityMode     // Catch: java.lang.Throwable -> L1e7
            if (r2 == 0) goto L20d
            goto L214
        L20d:
            r2 = r23
        L20f:
            r9 = r10
            r10 = r2
            r2 = r20
            goto L19b
        L214:
            if (r13 == 0) goto L219
        L216:
            r13.release()     // Catch: java.lang.Throwable -> L190
        L219:
            r9 = r10
            goto L296
        L21c:
            long r11 = r1.ssl     // Catch: java.lang.Throwable -> L1e7
            int r2 = io.netty.internal.tcnative.SSL.getError(r11, r2)     // Catch: java.lang.Throwable -> L1e7
            int r9 = io.netty.internal.tcnative.SSL.SSL_ERROR_WANT_READ     // Catch: java.lang.Throwable -> L1e7
            if (r2 == r9) goto L28f
            int r9 = io.netty.internal.tcnative.SSL.SSL_ERROR_WANT_WRITE     // Catch: java.lang.Throwable -> L1e7
            if (r2 != r9) goto L22b
            goto L28f
        L22b:
            int r0 = io.netty.internal.tcnative.SSL.SSL_ERROR_ZERO_RETURN     // Catch: java.lang.Throwable -> L1e7
            if (r2 != r0) goto L253
            boolean r0 = r1.receivedShutdown     // Catch: java.lang.Throwable -> L1e7
            if (r0 != 0) goto L236
            r1.closeAll()     // Catch: java.lang.Throwable -> L1e7
        L236:
            boolean r0 = r1.isInboundDone()     // Catch: java.lang.Throwable -> L1e7
            if (r0 == 0) goto L23f
            javax.net.ssl.SSLEngineResult$Status r0 = javax.net.ssl.SSLEngineResult.Status.CLOSED     // Catch: java.lang.Throwable -> L1e7
            goto L241
        L23f:
            javax.net.ssl.SSLEngineResult$Status r0 = javax.net.ssl.SSLEngineResult.Status.OK     // Catch: java.lang.Throwable -> L1e7
        L241:
            javax.net.ssl.SSLEngineResult r0 = r1.newResultMayFinishHandshake(r0, r6, r10, r8)     // Catch: java.lang.Throwable -> L1e7
            if (r13 == 0) goto L24a
            r13.release()     // Catch: java.lang.Throwable -> L190
        L24a:
            long r2 = r1.networkBIO     // Catch: java.lang.Throwable -> La1
            io.netty.internal.tcnative.SSL.bioClearByteBuffer(r2)     // Catch: java.lang.Throwable -> La1
        L24f:
            r1.rejectRemoteInitiatedRenegotiation()     // Catch: java.lang.Throwable -> La1
            goto L204
        L253:
            int r0 = io.netty.internal.tcnative.SSL.SSL_ERROR_WANT_X509_LOOKUP     // Catch: java.lang.Throwable -> L1e7
            if (r2 == r0) goto L273
            int r0 = io.netty.internal.tcnative.SSL.SSL_ERROR_WANT_CERTIFICATE_VERIFY     // Catch: java.lang.Throwable -> L1e7
            if (r2 == r0) goto L273
            int r0 = io.netty.internal.tcnative.SSL.SSL_ERROR_WANT_PRIVATE_KEY_OPERATION     // Catch: java.lang.Throwable -> L1e7
            if (r2 != r0) goto L260
            goto L273
        L260:
            int r0 = io.netty.internal.tcnative.SSL.getLastErrorNumber()     // Catch: java.lang.Throwable -> L1e7
            javax.net.ssl.SSLEngineResult r0 = r1.sslReadErrorResult(r2, r0, r10, r8)     // Catch: java.lang.Throwable -> L1e7
            if (r13 == 0) goto L26d
            r13.release()     // Catch: java.lang.Throwable -> L190
        L26d:
            long r2 = r1.networkBIO     // Catch: java.lang.Throwable -> La1
            io.netty.internal.tcnative.SSL.bioClearByteBuffer(r2)     // Catch: java.lang.Throwable -> La1
            goto L24f
        L273:
            boolean r0 = r1.isInboundDone()     // Catch: java.lang.Throwable -> L1e7
            if (r0 == 0) goto L27c
            javax.net.ssl.SSLEngineResult$Status r0 = javax.net.ssl.SSLEngineResult.Status.CLOSED     // Catch: java.lang.Throwable -> L1e7
            goto L27e
        L27c:
            javax.net.ssl.SSLEngineResult$Status r0 = javax.net.ssl.SSLEngineResult.Status.OK     // Catch: java.lang.Throwable -> L1e7
        L27e:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r2 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_TASK     // Catch: java.lang.Throwable -> L1e7
            javax.net.ssl.SSLEngineResult r0 = r1.newResult(r0, r2, r10, r8)     // Catch: java.lang.Throwable -> L1e7
            if (r13 == 0) goto L289
            r13.release()     // Catch: java.lang.Throwable -> L190
        L289:
            long r2 = r1.networkBIO     // Catch: java.lang.Throwable -> La1
            io.netty.internal.tcnative.SSL.bioClearByteBuffer(r2)     // Catch: java.lang.Throwable -> La1
            goto L24f
        L28f:
            int r2 = r20 + 1
            if (r2 < r7) goto L2c3
            if (r13 == 0) goto L219
            goto L216
        L296:
            long r2 = r1.networkBIO     // Catch: java.lang.Throwable -> La1
            io.netty.internal.tcnative.SSL.bioClearByteBuffer(r2)     // Catch: java.lang.Throwable -> La1
            r1.rejectRemoteInitiatedRenegotiation()     // Catch: java.lang.Throwable -> La1
            boolean r0 = r1.receivedShutdown     // Catch: java.lang.Throwable -> La1
            if (r0 != 0) goto L2b2
            long r2 = r1.ssl     // Catch: java.lang.Throwable -> La1
            int r0 = io.netty.internal.tcnative.SSL.getShutdown(r2)     // Catch: java.lang.Throwable -> La1
            int r2 = io.netty.internal.tcnative.SSL.SSL_RECEIVED_SHUTDOWN     // Catch: java.lang.Throwable -> La1
            r0 = r0 & r2
            int r2 = io.netty.internal.tcnative.SSL.SSL_RECEIVED_SHUTDOWN     // Catch: java.lang.Throwable -> La1
            if (r0 != r2) goto L2b2
            r1.closeAll()     // Catch: java.lang.Throwable -> La1
        L2b2:
            boolean r0 = r1.isInboundDone()     // Catch: java.lang.Throwable -> La1
            if (r0 == 0) goto L2bb
            javax.net.ssl.SSLEngineResult$Status r0 = javax.net.ssl.SSLEngineResult.Status.CLOSED     // Catch: java.lang.Throwable -> La1
            goto L2bd
        L2bb:
            javax.net.ssl.SSLEngineResult$Status r0 = javax.net.ssl.SSLEngineResult.Status.OK     // Catch: java.lang.Throwable -> La1
        L2bd:
            javax.net.ssl.SSLEngineResult r0 = r1.newResultMayFinishHandshake(r0, r6, r9, r8)     // Catch: java.lang.Throwable -> La1
            monitor-exit(r18)     // Catch: java.lang.Throwable -> La1
            return r0
        L2c3:
            if (r13 == 0) goto L2c8
            r13.release()     // Catch: java.lang.Throwable -> L190
        L2c8:
            r9 = r10
            r10 = r23
            goto L178
        L2cd:
            if (r13 == 0) goto L2d2
            r13.release()     // Catch: java.lang.Throwable -> L190
        L2d2:
            throw r0     // Catch: java.lang.Throwable -> L190
        L2d3:
            long r2 = r1.networkBIO     // Catch: java.lang.Throwable -> La1
            io.netty.internal.tcnative.SSL.bioClearByteBuffer(r2)     // Catch: java.lang.Throwable -> La1
            r1.rejectRemoteInitiatedRenegotiation()     // Catch: java.lang.Throwable -> La1
            throw r0     // Catch: java.lang.Throwable -> La1
        L2dc:
            monitor-exit(r18)     // Catch: java.lang.Throwable -> La1
            throw r0
        L2de:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "offset: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r3 = ", length: "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r3 = " (expected: offset <= offset + length <= dsts.length ("
            r2.append(r3)
            int r3 = r4.length
            r2.append(r3)
            java.lang.String r3 = "))"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L30b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "dsts is null"
            r0.<init>(r2)
            throw r0
        L313:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "offset: "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r2 = ", length: "
            r5.append(r2)
            r5.append(r3)
            java.lang.String r2 = " (expected: offset <= offset + length <= srcs.length ("
            r5.append(r2)
            int r0 = r0.length
            r5.append(r0)
            java.lang.String r0 = "))"
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r4.<init>(r0)
            throw r4
        L340:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r2 = "srcs"
            r0.<init>(r2)
            throw r0
    }

    public final javax.net.ssl.SSLEngineResult unwrap(java.nio.ByteBuffer[] r8, java.nio.ByteBuffer[] r9) throws javax.net.ssl.SSLException {
            r7 = this;
            int r3 = r8.length
            r5 = 0
            int r6 = r9.length
            r2 = 0
            r0 = r7
            r1 = r8
            r4 = r9
            javax.net.ssl.SSLEngineResult r8 = r0.unwrap(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Override // javax.net.ssl.SSLEngine
    public final synchronized javax.net.ssl.SSLEngineResult wrap(java.nio.ByteBuffer r1, java.nio.ByteBuffer r2) throws javax.net.ssl.SSLException {
            r0 = this;
            monitor-enter(r0)
            java.nio.ByteBuffer[] r1 = r0.singleSrcBuffer(r1)     // Catch: java.lang.Throwable -> L10
            javax.net.ssl.SSLEngineResult r1 = r0.wrap(r1, r2)     // Catch: java.lang.Throwable -> L10
            r0.resetSingleSrcBuffer()     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)
            return r1
        Le:
            r1 = move-exception
            goto L15
        L10:
            r1 = move-exception
            r0.resetSingleSrcBuffer()     // Catch: java.lang.Throwable -> Le
            throw r1     // Catch: java.lang.Throwable -> Le
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    @Override // javax.net.ssl.SSLEngine
    public final javax.net.ssl.SSLEngineResult wrap(java.nio.ByteBuffer[] r12, int r13, int r14, java.nio.ByteBuffer r15) throws javax.net.ssl.SSLException {
            r11 = this;
            if (r12 == 0) goto L4a5
            if (r15 == 0) goto L49d
            int r0 = r12.length
            if (r13 >= r0) goto L470
            int r0 = r13 + r14
            int r1 = r12.length
            if (r0 > r1) goto L470
            boolean r14 = r15.isReadOnly()
            if (r14 != 0) goto L46a
            monitor-enter(r11)
            boolean r14 = r11.isOutboundDone()     // Catch: java.lang.Throwable -> L29
            if (r14 == 0) goto L31
            boolean r12 = r11.isInboundDone()     // Catch: java.lang.Throwable -> L29
            if (r12 != 0) goto L2d
            boolean r12 = r11.isDestroyed()     // Catch: java.lang.Throwable -> L29
            if (r12 == 0) goto L26
            goto L2d
        L26:
            javax.net.ssl.SSLEngineResult r12 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.NEED_UNWRAP_CLOSED     // Catch: java.lang.Throwable -> L29
            goto L2f
        L29:
            r0 = move-exception
            r12 = r0
            goto L468
        L2d:
            javax.net.ssl.SSLEngineResult r12 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.CLOSED_NOT_HANDSHAKING     // Catch: java.lang.Throwable -> L29
        L2f:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L29
            return r12
        L31:
            r14 = 0
            r1 = 0
            boolean r2 = r15.isDirect()     // Catch: java.lang.Throwable -> L4e
            if (r2 == 0) goto L52
            long r3 = r11.networkBIO     // Catch: java.lang.Throwable -> L4e
            long r5 = bufferAddress(r15)     // Catch: java.lang.Throwable -> L4e
            int r2 = r15.position()     // Catch: java.lang.Throwable -> L4e
            long r7 = (long) r2     // Catch: java.lang.Throwable -> L4e
            long r5 = r5 + r7
            int r7 = r15.remaining()     // Catch: java.lang.Throwable -> L4e
            r8 = 1
            io.netty.internal.tcnative.SSL.bioSetByteBuffer(r3, r5, r7, r8)     // Catch: java.lang.Throwable -> L4e
            goto L6a
        L4e:
            r0 = move-exception
            r12 = r0
            goto L449
        L52:
            io.netty.buffer.ByteBufAllocator r2 = r11.alloc     // Catch: java.lang.Throwable -> L4e
            int r3 = r15.remaining()     // Catch: java.lang.Throwable -> L4e
            io.netty.buffer.ByteBuf r1 = r2.directBuffer(r3)     // Catch: java.lang.Throwable -> L4e
            long r2 = r11.networkBIO     // Catch: java.lang.Throwable -> L4e
            long r4 = io.netty.handler.ssl.OpenSsl.memoryAddress(r1)     // Catch: java.lang.Throwable -> L4e
            int r6 = r1.writableBytes()     // Catch: java.lang.Throwable -> L4e
            r7 = 1
            io.netty.internal.tcnative.SSL.bioSetByteBuffer(r2, r4, r6, r7)     // Catch: java.lang.Throwable -> L4e
        L6a:
            long r2 = r11.networkBIO     // Catch: java.lang.Throwable -> L4e
            int r2 = io.netty.internal.tcnative.SSL.bioLengthByteBuffer(r2)     // Catch: java.lang.Throwable -> L4e
            boolean r3 = r11.outboundClosed     // Catch: java.lang.Throwable -> L4e
            r4 = 1
            if (r3 == 0) goto L131
            int r12 = r15.remaining()     // Catch: java.lang.Throwable -> L4e
            r13 = 2
            boolean r12 = r11.isBytesAvailableEnoughForWrap(r12, r13, r4)     // Catch: java.lang.Throwable -> L4e
            if (r12 != 0) goto La9
            javax.net.ssl.SSLEngineResult r12 = new javax.net.ssl.SSLEngineResult     // Catch: java.lang.Throwable -> L4e
            javax.net.ssl.SSLEngineResult$Status r13 = javax.net.ssl.SSLEngineResult.Status.BUFFER_OVERFLOW     // Catch: java.lang.Throwable -> L4e
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = r11.getHandshakeStatus()     // Catch: java.lang.Throwable -> L4e
            r12.<init>(r13, r0, r14, r14)     // Catch: java.lang.Throwable -> L4e
            long r2 = r11.networkBIO     // Catch: java.lang.Throwable -> L29
            io.netty.internal.tcnative.SSL.bioClearByteBuffer(r2)     // Catch: java.lang.Throwable -> L29
            if (r1 != 0) goto L9a
            int r13 = r15.position()     // Catch: java.lang.Throwable -> L29
            r15.position(r13)     // Catch: java.lang.Throwable -> L29
            goto La7
        L9a:
            int r13 = r1.readerIndex()     // Catch: java.lang.Throwable -> L29
            java.nio.ByteBuffer r13 = r1.internalNioBuffer(r13, r14)     // Catch: java.lang.Throwable -> L29
            r15.put(r13)     // Catch: java.lang.Throwable -> L29
            goto L127
        La7:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L29
            return r12
        La9:
            long r12 = r11.networkBIO     // Catch: java.lang.Throwable -> L4e
            int r12 = io.netty.internal.tcnative.SSL.bioFlushByteBuffer(r12)     // Catch: java.lang.Throwable -> L4e
            if (r12 > 0) goto Ld8
            javax.net.ssl.SSLEngineResult$HandshakeStatus r13 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING     // Catch: java.lang.Throwable -> Ld2
            javax.net.ssl.SSLEngineResult r13 = r11.newResultMayFinishHandshake(r13, r14, r14)     // Catch: java.lang.Throwable -> Ld2
            long r2 = r11.networkBIO     // Catch: java.lang.Throwable -> L29
            io.netty.internal.tcnative.SSL.bioClearByteBuffer(r2)     // Catch: java.lang.Throwable -> L29
            if (r1 != 0) goto Lc3
            int r14 = r15.position()     // Catch: java.lang.Throwable -> L29
            goto Lef
        Lc3:
            int r14 = r1.readerIndex()     // Catch: java.lang.Throwable -> L29
            java.nio.ByteBuffer r12 = r1.internalNioBuffer(r14, r12)     // Catch: java.lang.Throwable -> L29
            r15.put(r12)     // Catch: java.lang.Throwable -> L29
        Lce:
            r1.release()     // Catch: java.lang.Throwable -> L29
            goto L100
        Ld2:
            r0 = move-exception
            r13 = r0
            r14 = r12
            r12 = r13
            goto L449
        Ld8:
            boolean r13 = r11.doSSLShutdown()     // Catch: java.lang.Throwable -> Ld2
            if (r13 != 0) goto L102
            javax.net.ssl.SSLEngineResult$HandshakeStatus r13 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING     // Catch: java.lang.Throwable -> Ld2
            javax.net.ssl.SSLEngineResult r13 = r11.newResultMayFinishHandshake(r13, r14, r12)     // Catch: java.lang.Throwable -> Ld2
            long r2 = r11.networkBIO     // Catch: java.lang.Throwable -> L29
            io.netty.internal.tcnative.SSL.bioClearByteBuffer(r2)     // Catch: java.lang.Throwable -> L29
            if (r1 != 0) goto Lf4
            int r14 = r15.position()     // Catch: java.lang.Throwable -> L29
        Lef:
            int r14 = r14 + r12
            r15.position(r14)     // Catch: java.lang.Throwable -> L29
            goto L100
        Lf4:
            int r14 = r1.readerIndex()     // Catch: java.lang.Throwable -> L29
            java.nio.ByteBuffer r12 = r1.internalNioBuffer(r14, r12)     // Catch: java.lang.Throwable -> L29
            r15.put(r12)     // Catch: java.lang.Throwable -> L29
            goto Lce
        L100:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L29
            return r13
        L102:
            long r3 = r11.networkBIO     // Catch: java.lang.Throwable -> Ld2
            int r12 = io.netty.internal.tcnative.SSL.bioLengthByteBuffer(r3)     // Catch: java.lang.Throwable -> Ld2
            int r2 = r2 - r12
            javax.net.ssl.SSLEngineResult$HandshakeStatus r12 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_WRAP     // Catch: java.lang.Throwable -> L12c
            javax.net.ssl.SSLEngineResult r12 = r11.newResultMayFinishHandshake(r12, r14, r2)     // Catch: java.lang.Throwable -> L12c
            long r13 = r11.networkBIO     // Catch: java.lang.Throwable -> L29
            io.netty.internal.tcnative.SSL.bioClearByteBuffer(r13)     // Catch: java.lang.Throwable -> L29
            if (r1 != 0) goto L11c
            int r13 = r15.position()     // Catch: java.lang.Throwable -> L29
            goto L329
        L11c:
            int r13 = r1.readerIndex()     // Catch: java.lang.Throwable -> L29
            java.nio.ByteBuffer r13 = r1.internalNioBuffer(r13, r2)     // Catch: java.lang.Throwable -> L29
            r15.put(r13)     // Catch: java.lang.Throwable -> L29
        L127:
            r1.release()     // Catch: java.lang.Throwable -> L29
            goto La7
        L12c:
            r0 = move-exception
            r12 = r0
            r14 = r2
            goto L449
        L131:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r3 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING     // Catch: java.lang.Throwable -> L4e
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState r5 = r11.handshakeState     // Catch: java.lang.Throwable -> L4e
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState r6 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.HandshakeState.FINISHED     // Catch: java.lang.Throwable -> L4e
            if (r5 == r6) goto L22a
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState r3 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.HandshakeState.STARTED_EXPLICITLY     // Catch: java.lang.Throwable -> L4e
            if (r5 == r3) goto L141
            io.netty.handler.ssl.ReferenceCountedOpenSslEngine$HandshakeState r3 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.HandshakeState.STARTED_IMPLICITLY     // Catch: java.lang.Throwable -> L4e
            r11.handshakeState = r3     // Catch: java.lang.Throwable -> L4e
        L141:
            long r5 = r11.networkBIO     // Catch: java.lang.Throwable -> L4e
            int r3 = io.netty.internal.tcnative.SSL.bioFlushByteBuffer(r5)     // Catch: java.lang.Throwable -> L4e
            java.lang.Throwable r5 = r11.handshakeException     // Catch: java.lang.Throwable -> L16e
            if (r5 == 0) goto L173
            javax.net.ssl.SSLEngineResult$HandshakeStatus r12 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_UNWRAP     // Catch: java.lang.Throwable -> L16e
            javax.net.ssl.SSLEngineResult r12 = r11.newResult(r12, r14, r3)     // Catch: java.lang.Throwable -> L16e
            long r13 = r11.networkBIO     // Catch: java.lang.Throwable -> L29
            io.netty.internal.tcnative.SSL.bioClearByteBuffer(r13)     // Catch: java.lang.Throwable -> L29
            if (r1 != 0) goto L162
            int r13 = r15.position()     // Catch: java.lang.Throwable -> L29
        L15c:
            int r13 = r13 + r3
            r15.position(r13)     // Catch: java.lang.Throwable -> L29
            goto La7
        L162:
            int r13 = r1.readerIndex()     // Catch: java.lang.Throwable -> L29
            java.nio.ByteBuffer r13 = r1.internalNioBuffer(r13, r3)     // Catch: java.lang.Throwable -> L29
            r15.put(r13)     // Catch: java.lang.Throwable -> L29
            goto L127
        L16e:
            r0 = move-exception
            r12 = r0
            r14 = r3
            goto L449
        L173:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r5 = r11.handshake()     // Catch: java.lang.Throwable -> L16e
            long r6 = r11.networkBIO     // Catch: java.lang.Throwable -> L16e
            int r3 = io.netty.internal.tcnative.SSL.bioLengthByteBuffer(r6)     // Catch: java.lang.Throwable -> L16e
            int r3 = r2 - r3
            javax.net.ssl.SSLEngineResult$HandshakeStatus r6 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_TASK     // Catch: java.lang.Throwable -> L16e
            if (r5 != r6) goto L19f
            javax.net.ssl.SSLEngineResult r12 = r11.newResult(r5, r14, r3)     // Catch: java.lang.Throwable -> L16e
            long r13 = r11.networkBIO     // Catch: java.lang.Throwable -> L29
            io.netty.internal.tcnative.SSL.bioClearByteBuffer(r13)     // Catch: java.lang.Throwable -> L29
            if (r1 != 0) goto L193
            int r13 = r15.position()     // Catch: java.lang.Throwable -> L29
            goto L15c
        L193:
            int r13 = r1.readerIndex()     // Catch: java.lang.Throwable -> L29
            java.nio.ByteBuffer r13 = r1.internalNioBuffer(r13, r3)     // Catch: java.lang.Throwable -> L29
            r15.put(r13)     // Catch: java.lang.Throwable -> L29
            goto L127
        L19f:
            if (r3 <= 0) goto L1d5
            javax.net.ssl.SSLEngineResult$HandshakeStatus r12 = javax.net.ssl.SSLEngineResult.HandshakeStatus.FINISHED     // Catch: java.lang.Throwable -> L16e
            if (r5 == r12) goto L1b4
            if (r3 != r2) goto L1aa
            javax.net.ssl.SSLEngineResult$HandshakeStatus r12 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_WRAP     // Catch: java.lang.Throwable -> L16e
            goto L1b4
        L1aa:
            long r12 = r11.networkBIO     // Catch: java.lang.Throwable -> L16e
            int r12 = io.netty.internal.tcnative.SSL.bioLengthNonApplication(r12)     // Catch: java.lang.Throwable -> L16e
            javax.net.ssl.SSLEngineResult$HandshakeStatus r12 = r11.getHandshakeStatus(r12)     // Catch: java.lang.Throwable -> L16e
        L1b4:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r12 = r11.mayFinishHandshake(r12)     // Catch: java.lang.Throwable -> L16e
            javax.net.ssl.SSLEngineResult r12 = r11.newResult(r12, r14, r3)     // Catch: java.lang.Throwable -> L16e
            long r13 = r11.networkBIO     // Catch: java.lang.Throwable -> L29
            io.netty.internal.tcnative.SSL.bioClearByteBuffer(r13)     // Catch: java.lang.Throwable -> L29
            if (r1 != 0) goto L1c8
            int r13 = r15.position()     // Catch: java.lang.Throwable -> L29
            goto L15c
        L1c8:
            int r13 = r1.readerIndex()     // Catch: java.lang.Throwable -> L29
            java.nio.ByteBuffer r13 = r1.internalNioBuffer(r13, r3)     // Catch: java.lang.Throwable -> L29
            r15.put(r13)     // Catch: java.lang.Throwable -> L29
            goto L127
        L1d5:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r6 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_UNWRAP     // Catch: java.lang.Throwable -> L16e
            if (r5 != r6) goto L1fe
            boolean r12 = r11.isOutboundDone()     // Catch: java.lang.Throwable -> L16e
            if (r12 == 0) goto L1e2
            javax.net.ssl.SSLEngineResult r12 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.NEED_UNWRAP_CLOSED     // Catch: java.lang.Throwable -> L16e
            goto L1e4
        L1e2:
            javax.net.ssl.SSLEngineResult r12 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.NEED_UNWRAP_OK     // Catch: java.lang.Throwable -> L16e
        L1e4:
            long r13 = r11.networkBIO     // Catch: java.lang.Throwable -> L29
            io.netty.internal.tcnative.SSL.bioClearByteBuffer(r13)     // Catch: java.lang.Throwable -> L29
            if (r1 != 0) goto L1f1
            int r13 = r15.position()     // Catch: java.lang.Throwable -> L29
            goto L15c
        L1f1:
            int r13 = r1.readerIndex()     // Catch: java.lang.Throwable -> L29
            java.nio.ByteBuffer r13 = r1.internalNioBuffer(r13, r3)     // Catch: java.lang.Throwable -> L29
            r15.put(r13)     // Catch: java.lang.Throwable -> L29
            goto L127
        L1fe:
            boolean r6 = r11.outboundClosed     // Catch: java.lang.Throwable -> L16e
            if (r6 == 0) goto L226
            long r12 = r11.networkBIO     // Catch: java.lang.Throwable -> L16e
            int r12 = io.netty.internal.tcnative.SSL.bioFlushByteBuffer(r12)     // Catch: java.lang.Throwable -> L16e
            javax.net.ssl.SSLEngineResult r13 = r11.newResultMayFinishHandshake(r5, r14, r12)     // Catch: java.lang.Throwable -> Ld2
            long r2 = r11.networkBIO     // Catch: java.lang.Throwable -> L29
            io.netty.internal.tcnative.SSL.bioClearByteBuffer(r2)     // Catch: java.lang.Throwable -> L29
            if (r1 != 0) goto L219
            int r14 = r15.position()     // Catch: java.lang.Throwable -> L29
            goto Lef
        L219:
            int r14 = r1.readerIndex()     // Catch: java.lang.Throwable -> L29
            java.nio.ByteBuffer r12 = r1.internalNioBuffer(r14, r12)     // Catch: java.lang.Throwable -> L29
            r15.put(r12)     // Catch: java.lang.Throwable -> L29
            goto Lce
        L226:
            r10 = r5
            r5 = r3
            r3 = r10
            goto L22b
        L22a:
            r5 = 0
        L22b:
            boolean r6 = r11.jdkCompatibilityMode     // Catch: java.lang.Throwable -> L249
            if (r6 == 0) goto L29d
            r6 = r13
            r7 = 0
        L231:
            if (r6 >= r0) goto L26a
            r8 = r12[r6]     // Catch: java.lang.Throwable -> L249
            if (r8 == 0) goto L24e
            int r9 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.MAX_PLAINTEXT_LENGTH     // Catch: java.lang.Throwable -> L249
            if (r7 != r9) goto L23c
            goto L246
        L23c:
            int r8 = r8.remaining()     // Catch: java.lang.Throwable -> L249
            int r7 = r7 + r8
            if (r7 > r9) goto L245
            if (r7 >= 0) goto L246
        L245:
            r7 = r9
        L246:
            int r6 = r6 + 1
            goto L231
        L249:
            r0 = move-exception
            r12 = r0
            r14 = r5
            goto L449
        L24e:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L249
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L249
            r13.<init>()     // Catch: java.lang.Throwable -> L249
            java.lang.String r14 = "srcs["
            r13.append(r14)     // Catch: java.lang.Throwable -> L249
            r13.append(r6)     // Catch: java.lang.Throwable -> L249
            java.lang.String r14 = "] is null"
            r13.append(r14)     // Catch: java.lang.Throwable -> L249
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L249
            r12.<init>(r13)     // Catch: java.lang.Throwable -> L249
            throw r12     // Catch: java.lang.Throwable -> L249
        L26a:
            int r6 = r15.remaining()     // Catch: java.lang.Throwable -> L249
            boolean r4 = r11.isBytesAvailableEnoughForWrap(r6, r7, r4)     // Catch: java.lang.Throwable -> L249
            if (r4 != 0) goto L29d
            javax.net.ssl.SSLEngineResult r12 = new javax.net.ssl.SSLEngineResult     // Catch: java.lang.Throwable -> L249
            javax.net.ssl.SSLEngineResult$Status r13 = javax.net.ssl.SSLEngineResult.Status.BUFFER_OVERFLOW     // Catch: java.lang.Throwable -> L249
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = r11.getHandshakeStatus()     // Catch: java.lang.Throwable -> L249
            r12.<init>(r13, r0, r14, r14)     // Catch: java.lang.Throwable -> L249
            long r13 = r11.networkBIO     // Catch: java.lang.Throwable -> L29
            io.netty.internal.tcnative.SSL.bioClearByteBuffer(r13)     // Catch: java.lang.Throwable -> L29
            if (r1 != 0) goto L290
            int r13 = r15.position()     // Catch: java.lang.Throwable -> L29
            int r13 = r13 + r5
            r15.position(r13)     // Catch: java.lang.Throwable -> L29
            goto La7
        L290:
            int r13 = r1.readerIndex()     // Catch: java.lang.Throwable -> L29
            java.nio.ByteBuffer r13 = r1.internalNioBuffer(r13, r5)     // Catch: java.lang.Throwable -> L29
            r15.put(r13)     // Catch: java.lang.Throwable -> L29
            goto L127
        L29d:
            long r6 = r11.networkBIO     // Catch: java.lang.Throwable -> L249
            int r4 = io.netty.internal.tcnative.SSL.bioFlushByteBuffer(r6)     // Catch: java.lang.Throwable -> L249
        L2a3:
            if (r13 >= r0) goto L42b
            r5 = r12[r13]     // Catch: java.lang.Throwable -> L2bf
            int r6 = r5.remaining()     // Catch: java.lang.Throwable -> L2bf
            if (r6 != 0) goto L2af
            goto L317
        L2af:
            boolean r7 = r11.jdkCompatibilityMode     // Catch: java.lang.Throwable -> L2bf
            if (r7 == 0) goto L2c4
            int r7 = io.netty.handler.ssl.ReferenceCountedOpenSslEngine.MAX_PLAINTEXT_LENGTH     // Catch: java.lang.Throwable -> L2bf
            int r7 = r7 - r14
            int r6 = java.lang.Math.min(r6, r7)     // Catch: java.lang.Throwable -> L2bf
            int r5 = r11.writePlaintextData(r5, r6)     // Catch: java.lang.Throwable -> L2bf
            goto L2ff
        L2bf:
            r0 = move-exception
            r12 = r0
            r14 = r4
            goto L449
        L2c4:
            int r7 = r15.remaining()     // Catch: java.lang.Throwable -> L2bf
            int r7 = r7 - r4
            int r8 = r11.maxWrapOverhead     // Catch: java.lang.Throwable -> L2bf
            int r7 = r7 - r8
            if (r7 > 0) goto L2f7
            javax.net.ssl.SSLEngineResult r12 = new javax.net.ssl.SSLEngineResult     // Catch: java.lang.Throwable -> L2bf
            javax.net.ssl.SSLEngineResult$Status r13 = javax.net.ssl.SSLEngineResult.Status.BUFFER_OVERFLOW     // Catch: java.lang.Throwable -> L2bf
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = r11.getHandshakeStatus()     // Catch: java.lang.Throwable -> L2bf
            r12.<init>(r13, r0, r14, r4)     // Catch: java.lang.Throwable -> L2bf
            long r13 = r11.networkBIO     // Catch: java.lang.Throwable -> L29
            io.netty.internal.tcnative.SSL.bioClearByteBuffer(r13)     // Catch: java.lang.Throwable -> L29
            if (r1 != 0) goto L2ea
            int r13 = r15.position()     // Catch: java.lang.Throwable -> L29
        L2e4:
            int r13 = r13 + r4
            r15.position(r13)     // Catch: java.lang.Throwable -> L29
            goto La7
        L2ea:
            int r13 = r1.readerIndex()     // Catch: java.lang.Throwable -> L29
            java.nio.ByteBuffer r13 = r1.internalNioBuffer(r13, r4)     // Catch: java.lang.Throwable -> L29
            r15.put(r13)     // Catch: java.lang.Throwable -> L29
            goto L127
        L2f7:
            int r6 = java.lang.Math.min(r6, r7)     // Catch: java.lang.Throwable -> L2bf
            int r5 = r11.writePlaintextData(r5, r6)     // Catch: java.lang.Throwable -> L2bf
        L2ff:
            if (r5 <= 0) goto L33c
            int r14 = r14 + r5
            long r5 = r11.networkBIO     // Catch: java.lang.Throwable -> L2bf
            int r5 = io.netty.internal.tcnative.SSL.bioLengthByteBuffer(r5)     // Catch: java.lang.Throwable -> L2bf
            int r2 = r2 - r5
            int r2 = r2 + r4
            boolean r4 = r11.jdkCompatibilityMode     // Catch: java.lang.Throwable -> L12c
            if (r4 != 0) goto L31a
            int r4 = r15.remaining()     // Catch: java.lang.Throwable -> L12c
            if (r2 != r4) goto L315
            goto L31a
        L315:
            r4 = r2
            r2 = r5
        L317:
            int r13 = r13 + 1
            goto L2a3
        L31a:
            javax.net.ssl.SSLEngineResult r12 = r11.newResultMayFinishHandshake(r3, r14, r2)     // Catch: java.lang.Throwable -> L12c
            long r13 = r11.networkBIO     // Catch: java.lang.Throwable -> L29
            io.netty.internal.tcnative.SSL.bioClearByteBuffer(r13)     // Catch: java.lang.Throwable -> L29
            if (r1 != 0) goto L32f
            int r13 = r15.position()     // Catch: java.lang.Throwable -> L29
        L329:
            int r13 = r13 + r2
            r15.position(r13)     // Catch: java.lang.Throwable -> L29
            goto La7
        L32f:
            int r13 = r1.readerIndex()     // Catch: java.lang.Throwable -> L29
            java.nio.ByteBuffer r13 = r1.internalNioBuffer(r13, r2)     // Catch: java.lang.Throwable -> L29
            r15.put(r13)     // Catch: java.lang.Throwable -> L29
            goto L127
        L33c:
            long r12 = r11.ssl     // Catch: java.lang.Throwable -> L2bf
            int r12 = io.netty.internal.tcnative.SSL.getError(r12, r5)     // Catch: java.lang.Throwable -> L2bf
            int r13 = io.netty.internal.tcnative.SSL.SSL_ERROR_ZERO_RETURN     // Catch: java.lang.Throwable -> L2bf
            if (r12 != r13) goto L3af
            boolean r12 = r11.receivedShutdown     // Catch: java.lang.Throwable -> L2bf
            if (r12 != 0) goto L38f
            r11.closeAll()     // Catch: java.lang.Throwable -> L2bf
            long r12 = r11.networkBIO     // Catch: java.lang.Throwable -> L2bf
            int r12 = io.netty.internal.tcnative.SSL.bioLengthByteBuffer(r12)     // Catch: java.lang.Throwable -> L2bf
            int r2 = r2 - r12
            int r12 = r4 + r2
            javax.net.ssl.SSLEngineResult$HandshakeStatus r13 = javax.net.ssl.SSLEngineResult.HandshakeStatus.FINISHED     // Catch: java.lang.Throwable -> Ld2
            if (r3 == r13) goto L36d
            int r13 = r15.remaining()     // Catch: java.lang.Throwable -> Ld2
            if (r12 != r13) goto L363
            javax.net.ssl.SSLEngineResult$HandshakeStatus r13 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_WRAP     // Catch: java.lang.Throwable -> Ld2
            goto L36d
        L363:
            long r2 = r11.networkBIO     // Catch: java.lang.Throwable -> Ld2
            int r13 = io.netty.internal.tcnative.SSL.bioLengthNonApplication(r2)     // Catch: java.lang.Throwable -> Ld2
            javax.net.ssl.SSLEngineResult$HandshakeStatus r13 = r11.getHandshakeStatus(r13)     // Catch: java.lang.Throwable -> Ld2
        L36d:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r13 = r11.mayFinishHandshake(r13)     // Catch: java.lang.Throwable -> Ld2
            javax.net.ssl.SSLEngineResult r13 = r11.newResult(r13, r14, r12)     // Catch: java.lang.Throwable -> Ld2
            long r2 = r11.networkBIO     // Catch: java.lang.Throwable -> L29
            io.netty.internal.tcnative.SSL.bioClearByteBuffer(r2)     // Catch: java.lang.Throwable -> L29
            if (r1 != 0) goto L382
            int r14 = r15.position()     // Catch: java.lang.Throwable -> L29
            goto Lef
        L382:
            int r14 = r1.readerIndex()     // Catch: java.lang.Throwable -> L29
            java.nio.ByteBuffer r12 = r1.internalNioBuffer(r14, r12)     // Catch: java.lang.Throwable -> L29
            r15.put(r12)     // Catch: java.lang.Throwable -> L29
            goto Lce
        L38f:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r12 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING     // Catch: java.lang.Throwable -> L2bf
            javax.net.ssl.SSLEngineResult r12 = r11.newResult(r12, r14, r4)     // Catch: java.lang.Throwable -> L2bf
            long r13 = r11.networkBIO     // Catch: java.lang.Throwable -> L29
            io.netty.internal.tcnative.SSL.bioClearByteBuffer(r13)     // Catch: java.lang.Throwable -> L29
            if (r1 != 0) goto L3a2
            int r13 = r15.position()     // Catch: java.lang.Throwable -> L29
            goto L2e4
        L3a2:
            int r13 = r1.readerIndex()     // Catch: java.lang.Throwable -> L29
            java.nio.ByteBuffer r13 = r1.internalNioBuffer(r13, r4)     // Catch: java.lang.Throwable -> L29
            r15.put(r13)     // Catch: java.lang.Throwable -> L29
            goto L127
        L3af:
            int r13 = io.netty.internal.tcnative.SSL.SSL_ERROR_WANT_READ     // Catch: java.lang.Throwable -> L2bf
            if (r12 != r13) goto L3d3
            javax.net.ssl.SSLEngineResult$HandshakeStatus r12 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_UNWRAP     // Catch: java.lang.Throwable -> L2bf
            javax.net.ssl.SSLEngineResult r12 = r11.newResult(r12, r14, r4)     // Catch: java.lang.Throwable -> L2bf
            long r13 = r11.networkBIO     // Catch: java.lang.Throwable -> L29
            io.netty.internal.tcnative.SSL.bioClearByteBuffer(r13)     // Catch: java.lang.Throwable -> L29
            if (r1 != 0) goto L3c6
            int r13 = r15.position()     // Catch: java.lang.Throwable -> L29
            goto L2e4
        L3c6:
            int r13 = r1.readerIndex()     // Catch: java.lang.Throwable -> L29
            java.nio.ByteBuffer r13 = r1.internalNioBuffer(r13, r4)     // Catch: java.lang.Throwable -> L29
            r15.put(r13)     // Catch: java.lang.Throwable -> L29
            goto L127
        L3d3:
            int r13 = io.netty.internal.tcnative.SSL.SSL_ERROR_WANT_WRITE     // Catch: java.lang.Throwable -> L2bf
            if (r12 != r13) goto L3f7
            javax.net.ssl.SSLEngineResult$Status r12 = javax.net.ssl.SSLEngineResult.Status.BUFFER_OVERFLOW     // Catch: java.lang.Throwable -> L2bf
            javax.net.ssl.SSLEngineResult r12 = r11.newResult(r12, r3, r14, r4)     // Catch: java.lang.Throwable -> L2bf
            long r13 = r11.networkBIO     // Catch: java.lang.Throwable -> L29
            io.netty.internal.tcnative.SSL.bioClearByteBuffer(r13)     // Catch: java.lang.Throwable -> L29
            if (r1 != 0) goto L3ea
            int r13 = r15.position()     // Catch: java.lang.Throwable -> L29
            goto L2e4
        L3ea:
            int r13 = r1.readerIndex()     // Catch: java.lang.Throwable -> L29
            java.nio.ByteBuffer r13 = r1.internalNioBuffer(r13, r4)     // Catch: java.lang.Throwable -> L29
            r15.put(r13)     // Catch: java.lang.Throwable -> L29
            goto L127
        L3f7:
            int r13 = io.netty.internal.tcnative.SSL.SSL_ERROR_WANT_X509_LOOKUP     // Catch: java.lang.Throwable -> L2bf
            if (r12 == r13) goto L40b
            int r13 = io.netty.internal.tcnative.SSL.SSL_ERROR_WANT_CERTIFICATE_VERIFY     // Catch: java.lang.Throwable -> L2bf
            if (r12 == r13) goto L40b
            int r13 = io.netty.internal.tcnative.SSL.SSL_ERROR_WANT_PRIVATE_KEY_OPERATION     // Catch: java.lang.Throwable -> L2bf
            if (r12 != r13) goto L404
            goto L40b
        L404:
            java.lang.String r13 = "SSL_write"
            javax.net.ssl.SSLException r12 = r11.shutdownWithError(r13, r12)     // Catch: java.lang.Throwable -> L2bf
            throw r12     // Catch: java.lang.Throwable -> L2bf
        L40b:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r12 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_TASK     // Catch: java.lang.Throwable -> L2bf
            javax.net.ssl.SSLEngineResult r12 = r11.newResult(r12, r14, r4)     // Catch: java.lang.Throwable -> L2bf
            long r13 = r11.networkBIO     // Catch: java.lang.Throwable -> L29
            io.netty.internal.tcnative.SSL.bioClearByteBuffer(r13)     // Catch: java.lang.Throwable -> L29
            if (r1 != 0) goto L41e
            int r13 = r15.position()     // Catch: java.lang.Throwable -> L29
            goto L2e4
        L41e:
            int r13 = r1.readerIndex()     // Catch: java.lang.Throwable -> L29
            java.nio.ByteBuffer r13 = r1.internalNioBuffer(r13, r4)     // Catch: java.lang.Throwable -> L29
            r15.put(r13)     // Catch: java.lang.Throwable -> L29
            goto L127
        L42b:
            javax.net.ssl.SSLEngineResult r12 = r11.newResultMayFinishHandshake(r3, r14, r4)     // Catch: java.lang.Throwable -> L2bf
            long r13 = r11.networkBIO     // Catch: java.lang.Throwable -> L29
            io.netty.internal.tcnative.SSL.bioClearByteBuffer(r13)     // Catch: java.lang.Throwable -> L29
            if (r1 != 0) goto L43c
            int r13 = r15.position()     // Catch: java.lang.Throwable -> L29
            goto L2e4
        L43c:
            int r13 = r1.readerIndex()     // Catch: java.lang.Throwable -> L29
            java.nio.ByteBuffer r13 = r1.internalNioBuffer(r13, r4)     // Catch: java.lang.Throwable -> L29
            r15.put(r13)     // Catch: java.lang.Throwable -> L29
            goto L127
        L449:
            long r2 = r11.networkBIO     // Catch: java.lang.Throwable -> L29
            io.netty.internal.tcnative.SSL.bioClearByteBuffer(r2)     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L45f
            int r13 = r1.readerIndex()     // Catch: java.lang.Throwable -> L29
            java.nio.ByteBuffer r13 = r1.internalNioBuffer(r13, r14)     // Catch: java.lang.Throwable -> L29
            r15.put(r13)     // Catch: java.lang.Throwable -> L29
            r1.release()     // Catch: java.lang.Throwable -> L29
            goto L467
        L45f:
            int r13 = r15.position()     // Catch: java.lang.Throwable -> L29
            int r13 = r13 + r14
            r15.position(r13)     // Catch: java.lang.Throwable -> L29
        L467:
            throw r12     // Catch: java.lang.Throwable -> L29
        L468:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L29
            throw r12
        L46a:
            java.nio.ReadOnlyBufferException r12 = new java.nio.ReadOnlyBufferException
            r12.<init>()
            throw r12
        L470:
            java.lang.IndexOutOfBoundsException r15 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "offset: "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r13 = ", length: "
            r0.append(r13)
            r0.append(r14)
            java.lang.String r13 = " (expected: offset <= offset + length <= srcs.length ("
            r0.append(r13)
            int r12 = r12.length
            r0.append(r12)
            java.lang.String r12 = "))"
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r15.<init>(r12)
            throw r15
        L49d:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "dst is null"
            r12.<init>(r13)
            throw r12
        L4a5:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "srcs is null"
            r12.<init>(r13)
            throw r12
    }
}
