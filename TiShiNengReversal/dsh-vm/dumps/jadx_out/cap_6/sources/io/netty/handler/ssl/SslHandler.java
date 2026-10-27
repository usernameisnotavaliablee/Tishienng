package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class SslHandler extends io.netty.handler.codec.ByteToMessageDecoder implements io.netty.channel.ChannelOutboundHandler {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.util.regex.Pattern IGNORABLE_CLASS_IN_STACK = null;
    private static final java.util.regex.Pattern IGNORABLE_ERROR_MESSAGE = null;
    private static final int MAX_PLAINTEXT_LENGTH = 16384;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private boolean closeNotify;
    private volatile long closeNotifyFlushTimeoutMillis;
    private volatile long closeNotifyReadTimeoutMillis;
    private volatile io.netty.channel.ChannelHandlerContext ctx;
    private final java.util.concurrent.Executor delegatedTaskExecutor;
    private final javax.net.ssl.SSLEngine engine;
    private final io.netty.handler.ssl.SslHandler.SslEngineType engineType;
    private boolean firedChannelRead;
    private boolean flushedBeforeHandshake;
    private io.netty.util.concurrent.Promise<io.netty.channel.Channel> handshakePromise;
    private boolean handshakeStarted;
    private volatile long handshakeTimeoutMillis;
    private final boolean jdkCompatibilityMode;
    private boolean needsFlush;
    private boolean outboundClosed;
    private int packetLength;
    private io.netty.handler.ssl.SslHandler.SslHandlerCoalescingBufferQueue pendingUnencryptedWrites;
    private boolean processTask;
    private boolean readDuringHandshake;
    private boolean sentFirstMessage;
    private final java.nio.ByteBuffer[] singleBuffer;
    private final io.netty.handler.ssl.SslHandler.LazyChannelPromise sslClosePromise;
    private final boolean startTls;
    volatile int wrapDataSize;









    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.ssl.SslHandler$9, reason: invalid class name */
    static /* synthetic */ class AnonymousClass9 {
        static final /* synthetic */ int[] $SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus = null;
        static final /* synthetic */ int[] $SwitchMap$javax$net$ssl$SSLEngineResult$Status = null;

        static {
                javax.net.ssl.SSLEngineResult$Status[] r0 = javax.net.ssl.SSLEngineResult.Status.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.handler.ssl.SslHandler.AnonymousClass9.$SwitchMap$javax$net$ssl$SSLEngineResult$Status = r0
                r1 = 1
                javax.net.ssl.SSLEngineResult$Status r2 = javax.net.ssl.SSLEngineResult.Status.BUFFER_OVERFLOW     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = io.netty.handler.ssl.SslHandler.AnonymousClass9.$SwitchMap$javax$net$ssl$SSLEngineResult$Status     // Catch: java.lang.NoSuchFieldError -> L1d
                javax.net.ssl.SSLEngineResult$Status r3 = javax.net.ssl.SSLEngineResult.Status.CLOSED     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                javax.net.ssl.SSLEngineResult$HandshakeStatus[] r2 = javax.net.ssl.SSLEngineResult.HandshakeStatus.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                io.netty.handler.ssl.SslHandler.AnonymousClass9.$SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus = r2
                javax.net.ssl.SSLEngineResult$HandshakeStatus r3 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_TASK     // Catch: java.lang.NoSuchFieldError -> L2e
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2e
                r2[r3] = r1     // Catch: java.lang.NoSuchFieldError -> L2e
            L2e:
                int[] r1 = io.netty.handler.ssl.SslHandler.AnonymousClass9.$SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus     // Catch: java.lang.NoSuchFieldError -> L38
                javax.net.ssl.SSLEngineResult$HandshakeStatus r2 = javax.net.ssl.SSLEngineResult.HandshakeStatus.FINISHED     // Catch: java.lang.NoSuchFieldError -> L38
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L38
                r1[r2] = r0     // Catch: java.lang.NoSuchFieldError -> L38
            L38:
                int[] r0 = io.netty.handler.ssl.SslHandler.AnonymousClass9.$SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus     // Catch: java.lang.NoSuchFieldError -> L43
                javax.net.ssl.SSLEngineResult$HandshakeStatus r1 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING     // Catch: java.lang.NoSuchFieldError -> L43
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L43
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L43
            L43:
                int[] r0 = io.netty.handler.ssl.SslHandler.AnonymousClass9.$SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus     // Catch: java.lang.NoSuchFieldError -> L4e
                javax.net.ssl.SSLEngineResult$HandshakeStatus r1 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_WRAP     // Catch: java.lang.NoSuchFieldError -> L4e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4e
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L4e
            L4e:
                int[] r0 = io.netty.handler.ssl.SslHandler.AnonymousClass9.$SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus     // Catch: java.lang.NoSuchFieldError -> L59
                javax.net.ssl.SSLEngineResult$HandshakeStatus r1 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_UNWRAP     // Catch: java.lang.NoSuchFieldError -> L59
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L59
            L59:
                return
        }

        public AnonymousClass9() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class LazyChannelPromise extends io.netty.util.concurrent.DefaultPromise<io.netty.channel.Channel> {
        final /* synthetic */ io.netty.handler.ssl.SslHandler this$0;

        private LazyChannelPromise(io.netty.handler.ssl.SslHandler r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ LazyChannelPromise(io.netty.handler.ssl.SslHandler r1, io.netty.handler.ssl.SslHandler.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        protected void checkDeadLock() {
                r1 = this;
                io.netty.handler.ssl.SslHandler r0 = r1.this$0
                io.netty.channel.ChannelHandlerContext r0 = io.netty.handler.ssl.SslHandler.access$700(r0)
                if (r0 != 0) goto L9
                return
            L9:
                super.checkDeadLock()
                return
        }

        protected io.netty.util.concurrent.EventExecutor executor() {
                r1 = this;
                io.netty.handler.ssl.SslHandler r0 = r1.this$0
                io.netty.channel.ChannelHandlerContext r0 = io.netty.handler.ssl.SslHandler.access$700(r0)
                if (r0 == 0) goto L13
                io.netty.handler.ssl.SslHandler r0 = r1.this$0
                io.netty.channel.ChannelHandlerContext r0 = io.netty.handler.ssl.SslHandler.access$700(r0)
                io.netty.util.concurrent.EventExecutor r0 = r0.executor()
                return r0
            L13:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>()
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private enum SslEngineType extends java.lang.Enum<io.netty.handler.ssl.SslHandler.SslEngineType> {
        private static final /* synthetic */ io.netty.handler.ssl.SslHandler.SslEngineType[] $VALUES = null;
        public static final io.netty.handler.ssl.SslHandler.SslEngineType CONSCRYPT = null;
        public static final io.netty.handler.ssl.SslHandler.SslEngineType JDK = null;
        public static final io.netty.handler.ssl.SslHandler.SslEngineType TCNATIVE = null;
        final io.netty.handler.codec.ByteToMessageDecoder.Cumulator cumulator;
        final boolean wantsDirectBuffer;




        static {
                io.netty.handler.ssl.SslHandler$SslEngineType$1 r0 = new io.netty.handler.ssl.SslHandler$SslEngineType$1
                io.netty.handler.codec.ByteToMessageDecoder$Cumulator r1 = io.netty.handler.codec.ByteToMessageDecoder.COMPOSITE_CUMULATOR
                java.lang.String r2 = "TCNATIVE"
                r3 = 0
                r4 = 1
                r0.<init>(r2, r3, r4, r1)
                io.netty.handler.ssl.SslHandler.SslEngineType.TCNATIVE = r0
                io.netty.handler.ssl.SslHandler$SslEngineType$2 r2 = new io.netty.handler.ssl.SslHandler$SslEngineType$2
                java.lang.String r5 = "CONSCRYPT"
                r2.<init>(r5, r4, r4, r1)
                io.netty.handler.ssl.SslHandler.SslEngineType.CONSCRYPT = r2
                io.netty.handler.ssl.SslHandler$SslEngineType$3 r1 = new io.netty.handler.ssl.SslHandler$SslEngineType$3
                io.netty.handler.codec.ByteToMessageDecoder$Cumulator r5 = io.netty.handler.codec.ByteToMessageDecoder.MERGE_CUMULATOR
                java.lang.String r6 = "JDK"
                r7 = 2
                r1.<init>(r6, r7, r3, r5)
                io.netty.handler.ssl.SslHandler.SslEngineType.JDK = r1
                r5 = 3
                io.netty.handler.ssl.SslHandler$SslEngineType[] r5 = new io.netty.handler.ssl.SslHandler.SslEngineType[r5]
                r5[r3] = r0
                r5[r4] = r2
                r5[r7] = r1
                io.netty.handler.ssl.SslHandler.SslEngineType.$VALUES = r5
                return
        }

        SslEngineType(java.lang.String r1, int r2, boolean r3, io.netty.handler.codec.ByteToMessageDecoder.Cumulator r4) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.wantsDirectBuffer = r3
                r0.cumulator = r4
                return
        }

        /* synthetic */ SslEngineType(java.lang.String r1, int r2, boolean r3, io.netty.handler.codec.ByteToMessageDecoder.Cumulator r4, io.netty.handler.ssl.SslHandler.AnonymousClass1 r5) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        static io.netty.handler.ssl.SslHandler.SslEngineType forEngine(javax.net.ssl.SSLEngine r1) {
                boolean r0 = r1 instanceof io.netty.handler.ssl.ReferenceCountedOpenSslEngine
                if (r0 == 0) goto L7
                io.netty.handler.ssl.SslHandler$SslEngineType r1 = io.netty.handler.ssl.SslHandler.SslEngineType.TCNATIVE
                return r1
            L7:
                boolean r1 = r1 instanceof io.netty.handler.ssl.ConscryptAlpnSslEngine
                if (r1 == 0) goto Le
                io.netty.handler.ssl.SslHandler$SslEngineType r1 = io.netty.handler.ssl.SslHandler.SslEngineType.CONSCRYPT
                return r1
            Le:
                io.netty.handler.ssl.SslHandler$SslEngineType r1 = io.netty.handler.ssl.SslHandler.SslEngineType.JDK
                return r1
        }

        public static io.netty.handler.ssl.SslHandler.SslEngineType valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.handler.ssl.SslHandler$SslEngineType> r0 = io.netty.handler.ssl.SslHandler.SslEngineType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.handler.ssl.SslHandler$SslEngineType r1 = (io.netty.handler.ssl.SslHandler.SslEngineType) r1
                return r1
        }

        public static io.netty.handler.ssl.SslHandler.SslEngineType[] values() {
                io.netty.handler.ssl.SslHandler$SslEngineType[] r0 = io.netty.handler.ssl.SslHandler.SslEngineType.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.handler.ssl.SslHandler$SslEngineType[] r0 = (io.netty.handler.ssl.SslHandler.SslEngineType[]) r0
                return r0
        }

        abstract int calculatePendingData(io.netty.handler.ssl.SslHandler r1, int r2);

        abstract int calculateWrapBufferCapacity(io.netty.handler.ssl.SslHandler r1, int r2, int r3);

        int getPacketBufferSize(io.netty.handler.ssl.SslHandler r1) {
                r0 = this;
                javax.net.ssl.SSLEngine r1 = io.netty.handler.ssl.SslHandler.access$100(r1)
                javax.net.ssl.SSLSession r1 = r1.getSession()
                int r1 = r1.getPacketBufferSize()
                return r1
        }

        abstract boolean jdkCompatibilityMode(javax.net.ssl.SSLEngine r1);

        abstract javax.net.ssl.SSLEngineResult unwrap(io.netty.handler.ssl.SslHandler r1, io.netty.buffer.ByteBuf r2, int r3, int r4, io.netty.buffer.ByteBuf r5) throws javax.net.ssl.SSLException;
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class SslHandlerCoalescingBufferQueue extends io.netty.channel.AbstractCoalescingBufferQueue {
        final /* synthetic */ io.netty.handler.ssl.SslHandler this$0;

        SslHandlerCoalescingBufferQueue(io.netty.handler.ssl.SslHandler r1, io.netty.channel.Channel r2, int r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2, r3)
                return
        }

        @Override // io.netty.channel.AbstractCoalescingBufferQueue
        protected io.netty.buffer.ByteBuf compose(io.netty.buffer.ByteBufAllocator r3, io.netty.buffer.ByteBuf r4, io.netty.buffer.ByteBuf r5) {
                r2 = this;
                io.netty.handler.ssl.SslHandler r0 = r2.this$0
                int r0 = r0.wrapDataSize
                boolean r1 = r4 instanceof io.netty.buffer.CompositeByteBuf
                if (r1 == 0) goto L22
                io.netty.buffer.CompositeByteBuf r4 = (io.netty.buffer.CompositeByteBuf) r4
                int r3 = r4.numComponents()
                r1 = 1
                if (r3 == 0) goto L1e
                int r3 = r3 - r1
                io.netty.buffer.ByteBuf r3 = r4.internalComponent(r3)
                boolean r3 = io.netty.handler.ssl.SslHandler.access$2800(r3, r5, r0)
                if (r3 != 0) goto L1d
                goto L1e
            L1d:
                return r4
            L1e:
                r4.addComponent(r1, r5)
                return r4
            L22:
                boolean r0 = io.netty.handler.ssl.SslHandler.access$2800(r4, r5, r0)
                if (r0 == 0) goto L29
                return r4
            L29:
                io.netty.buffer.ByteBuf r3 = r2.copyAndCompose(r3, r4, r5)
                return r3
        }

        @Override // io.netty.channel.AbstractCoalescingBufferQueue
        protected io.netty.buffer.ByteBuf composeFirst(io.netty.buffer.ByteBufAllocator r2, io.netty.buffer.ByteBuf r3) {
                r1 = this;
                boolean r0 = r3 instanceof io.netty.buffer.CompositeByteBuf
                if (r0 == 0) goto L1d
                io.netty.buffer.CompositeByteBuf r3 = (io.netty.buffer.CompositeByteBuf) r3
                int r0 = r3.readableBytes()
                io.netty.buffer.ByteBuf r2 = r2.directBuffer(r0)
                r2.writeBytes(r3)     // Catch: java.lang.Throwable -> L12
                goto L19
            L12:
                r0 = move-exception
                r2.release()
                io.netty.util.internal.PlatformDependent.throwException(r0)
            L19:
                r3.release()
                return r2
            L1d:
                return r3
        }

        @Override // io.netty.channel.AbstractCoalescingBufferQueue
        protected io.netty.buffer.ByteBuf removeEmptyValue() {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class SslTasksRunner implements java.lang.Runnable {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final boolean inUnwrap;
        final /* synthetic */ io.netty.handler.ssl.SslHandler this$0;



        static {
                return
        }

        SslTasksRunner(io.netty.handler.ssl.SslHandler r1, boolean r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.inUnwrap = r2
                return
        }

        static /* synthetic */ void access$2000(io.netty.handler.ssl.SslHandler.SslTasksRunner r0) {
                r0.resumeOnEventExecutor()
                return
        }

        static /* synthetic */ void access$2100(io.netty.handler.ssl.SslHandler.SslTasksRunner r0, java.lang.Throwable r1) {
                r0.safeExceptionCaught(r1)
                return
        }

        private void handleException(java.lang.Throwable r4) {
                r3 = this;
                io.netty.handler.ssl.SslHandler r0 = r3.this$0
                io.netty.channel.ChannelHandlerContext r0 = io.netty.handler.ssl.SslHandler.access$700(r0)
                io.netty.util.concurrent.EventExecutor r0 = r0.executor()
                boolean r0 = r0.inEventLoop()
                r1 = 0
                if (r0 == 0) goto L1a
                io.netty.handler.ssl.SslHandler r0 = r3.this$0
                io.netty.handler.ssl.SslHandler.access$1202(r0, r1)
                r3.safeExceptionCaught(r4)
                return
            L1a:
                io.netty.handler.ssl.SslHandler r0 = r3.this$0     // Catch: java.util.concurrent.RejectedExecutionException -> L2d
                io.netty.channel.ChannelHandlerContext r0 = io.netty.handler.ssl.SslHandler.access$700(r0)     // Catch: java.util.concurrent.RejectedExecutionException -> L2d
                io.netty.util.concurrent.EventExecutor r0 = r0.executor()     // Catch: java.util.concurrent.RejectedExecutionException -> L2d
                io.netty.handler.ssl.SslHandler$SslTasksRunner$2 r2 = new io.netty.handler.ssl.SslHandler$SslTasksRunner$2     // Catch: java.util.concurrent.RejectedExecutionException -> L2d
                r2.<init>(r3, r4)     // Catch: java.util.concurrent.RejectedExecutionException -> L2d
                r0.execute(r2)     // Catch: java.util.concurrent.RejectedExecutionException -> L2d
                return
            L2d:
                io.netty.handler.ssl.SslHandler r0 = r3.this$0
                io.netty.handler.ssl.SslHandler.access$1202(r0, r1)
                io.netty.handler.ssl.SslHandler r0 = r3.this$0
                io.netty.channel.ChannelHandlerContext r0 = io.netty.handler.ssl.SslHandler.access$700(r0)
                r0.fireExceptionCaught(r4)
                return
        }

        private void resumeOnEventExecutor() {
                r3 = this;
                io.netty.handler.ssl.SslHandler r0 = r3.this$0
                r1 = 0
                io.netty.handler.ssl.SslHandler.access$1202(r0, r1)
                io.netty.handler.ssl.SslHandler r0 = r3.this$0     // Catch: java.lang.Throwable -> L34
                javax.net.ssl.SSLEngine r0 = io.netty.handler.ssl.SslHandler.access$100(r0)     // Catch: java.lang.Throwable -> L34
                javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = r0.getHandshakeStatus()     // Catch: java.lang.Throwable -> L34
                int[] r2 = io.netty.handler.ssl.SslHandler.AnonymousClass9.$SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus     // Catch: java.lang.Throwable -> L34
                int r0 = r0.ordinal()     // Catch: java.lang.Throwable -> L34
                r0 = r2[r0]     // Catch: java.lang.Throwable -> L34
                r2 = 1
                if (r0 == r2) goto L9d
                r2 = 2
                if (r0 == r2) goto L69
                r2 = 3
                if (r0 == r2) goto L6e
                r2 = 4
                if (r0 == r2) goto L3c
                r1 = 5
                if (r0 != r1) goto L36
                io.netty.handler.ssl.SslHandler r0 = r3.this$0     // Catch: java.lang.Throwable -> L34
                io.netty.channel.ChannelHandlerContext r1 = io.netty.handler.ssl.SslHandler.access$700(r0)     // Catch: java.lang.Throwable -> L34
                io.netty.handler.ssl.SslHandler.access$1700(r0, r1)     // Catch: java.lang.Throwable -> L34
                r3.tryDecodeAgain()     // Catch: java.lang.Throwable -> L34
                return
            L34:
                r0 = move-exception
                goto La5
            L36:
                java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L34
                r0.<init>()     // Catch: java.lang.Throwable -> L34
                throw r0     // Catch: java.lang.Throwable -> L34
            L3c:
                io.netty.handler.ssl.SslHandler r0 = r3.this$0     // Catch: java.lang.Throwable -> L56
                io.netty.channel.ChannelHandlerContext r2 = io.netty.handler.ssl.SslHandler.access$700(r0)     // Catch: java.lang.Throwable -> L56
                boolean r0 = io.netty.handler.ssl.SslHandler.access$1800(r0, r2, r1)     // Catch: java.lang.Throwable -> L56
                if (r0 != 0) goto L58
                boolean r0 = r3.inUnwrap     // Catch: java.lang.Throwable -> L56
                if (r0 == 0) goto L58
                io.netty.handler.ssl.SslHandler r0 = r3.this$0     // Catch: java.lang.Throwable -> L56
                io.netty.channel.ChannelHandlerContext r1 = io.netty.handler.ssl.SslHandler.access$700(r0)     // Catch: java.lang.Throwable -> L56
                io.netty.handler.ssl.SslHandler.access$1700(r0, r1)     // Catch: java.lang.Throwable -> L56
                goto L58
            L56:
                r0 = move-exception
                goto L65
            L58:
                io.netty.handler.ssl.SslHandler r0 = r3.this$0     // Catch: java.lang.Throwable -> L56
                io.netty.channel.ChannelHandlerContext r1 = io.netty.handler.ssl.SslHandler.access$700(r0)     // Catch: java.lang.Throwable -> L56
                io.netty.handler.ssl.SslHandler.access$1000(r0, r1)     // Catch: java.lang.Throwable -> L56
                r3.tryDecodeAgain()     // Catch: java.lang.Throwable -> L34
                return
            L65:
                r3.taskError(r0)     // Catch: java.lang.Throwable -> L34
                goto L9c
            L69:
                io.netty.handler.ssl.SslHandler r0 = r3.this$0     // Catch: java.lang.Throwable -> L34
                io.netty.handler.ssl.SslHandler.access$1400(r0)     // Catch: java.lang.Throwable -> L34
            L6e:
                io.netty.handler.ssl.SslHandler r0 = r3.this$0     // Catch: java.lang.Throwable -> L34
                io.netty.handler.ssl.SslHandler.access$1500(r0)     // Catch: java.lang.Throwable -> L34
                io.netty.handler.ssl.SslHandler r0 = r3.this$0     // Catch: java.lang.Throwable -> L98
                io.netty.channel.ChannelHandlerContext r1 = io.netty.handler.ssl.SslHandler.access$700(r0)     // Catch: java.lang.Throwable -> L98
                boolean r2 = r3.inUnwrap     // Catch: java.lang.Throwable -> L98
                io.netty.handler.ssl.SslHandler.access$1600(r0, r1, r2)     // Catch: java.lang.Throwable -> L98
                boolean r0 = r3.inUnwrap     // Catch: java.lang.Throwable -> L34
                if (r0 == 0) goto L8b
                io.netty.handler.ssl.SslHandler r0 = r3.this$0     // Catch: java.lang.Throwable -> L34
                io.netty.channel.ChannelHandlerContext r1 = io.netty.handler.ssl.SslHandler.access$700(r0)     // Catch: java.lang.Throwable -> L34
                io.netty.handler.ssl.SslHandler.access$1700(r0, r1)     // Catch: java.lang.Throwable -> L34
            L8b:
                io.netty.handler.ssl.SslHandler r0 = r3.this$0     // Catch: java.lang.Throwable -> L34
                io.netty.channel.ChannelHandlerContext r1 = io.netty.handler.ssl.SslHandler.access$700(r0)     // Catch: java.lang.Throwable -> L34
                io.netty.handler.ssl.SslHandler.access$1000(r0, r1)     // Catch: java.lang.Throwable -> L34
                r3.tryDecodeAgain()     // Catch: java.lang.Throwable -> L34
                return
            L98:
                r0 = move-exception
                r3.taskError(r0)     // Catch: java.lang.Throwable -> L34
            L9c:
                return
            L9d:
                io.netty.handler.ssl.SslHandler r0 = r3.this$0     // Catch: java.lang.Throwable -> L34
                boolean r1 = r3.inUnwrap     // Catch: java.lang.Throwable -> L34
                io.netty.handler.ssl.SslHandler.access$1300(r0, r1)     // Catch: java.lang.Throwable -> L34
                return
            La5:
                r3.safeExceptionCaught(r0)
                return
        }

        private void safeExceptionCaught(java.lang.Throwable r3) {
                r2 = this;
                io.netty.handler.ssl.SslHandler r0 = r2.this$0     // Catch: java.lang.Throwable -> Le
                io.netty.channel.ChannelHandlerContext r1 = io.netty.handler.ssl.SslHandler.access$700(r0)     // Catch: java.lang.Throwable -> Le
                java.lang.Throwable r3 = r2.wrapIfNeeded(r3)     // Catch: java.lang.Throwable -> Le
                r0.exceptionCaught(r1, r3)     // Catch: java.lang.Throwable -> Le
                return
            Le:
                r3 = move-exception
                io.netty.handler.ssl.SslHandler r0 = r2.this$0
                io.netty.channel.ChannelHandlerContext r0 = io.netty.handler.ssl.SslHandler.access$700(r0)
                r0.fireExceptionCaught(r3)
                return
        }

        private void taskError(java.lang.Throwable r3) {
                r2 = this;
                boolean r0 = r2.inUnwrap
                if (r0 == 0) goto L13
                io.netty.handler.ssl.SslHandler r0 = r2.this$0     // Catch: java.lang.Throwable -> Le
                io.netty.channel.ChannelHandlerContext r1 = io.netty.handler.ssl.SslHandler.access$700(r0)     // Catch: java.lang.Throwable -> Le
                io.netty.handler.ssl.SslHandler.access$800(r0, r1, r3)     // Catch: java.lang.Throwable -> Le
                return
            Le:
                r3 = move-exception
                r2.safeExceptionCaught(r3)
                return
            L13:
                io.netty.handler.ssl.SslHandler r0 = r2.this$0
                io.netty.channel.ChannelHandlerContext r1 = io.netty.handler.ssl.SslHandler.access$700(r0)
                io.netty.handler.ssl.SslHandler.access$900(r0, r1, r3)
                io.netty.handler.ssl.SslHandler r3 = r2.this$0
                io.netty.channel.ChannelHandlerContext r0 = io.netty.handler.ssl.SslHandler.access$700(r3)
                io.netty.handler.ssl.SslHandler.access$1000(r3, r0)
                return
        }

        private void tryDecodeAgain() {
                r3 = this;
                io.netty.handler.ssl.SslHandler r0 = r3.this$0     // Catch: java.lang.Throwable -> L15
                io.netty.channel.ChannelHandlerContext r1 = io.netty.handler.ssl.SslHandler.access$700(r0)     // Catch: java.lang.Throwable -> L15
                io.netty.buffer.ByteBuf r2 = io.netty.buffer.Unpooled.EMPTY_BUFFER     // Catch: java.lang.Throwable -> L15
                r0.channelRead(r1, r2)     // Catch: java.lang.Throwable -> L15
            Lb:
                io.netty.handler.ssl.SslHandler r0 = r3.this$0
                io.netty.channel.ChannelHandlerContext r1 = io.netty.handler.ssl.SslHandler.access$700(r0)
                io.netty.handler.ssl.SslHandler.access$1100(r0, r1)
                return
            L15:
                r0 = move-exception
                r3.safeExceptionCaught(r0)     // Catch: java.lang.Throwable -> L1a
                goto Lb
            L1a:
                r0 = move-exception
                io.netty.handler.ssl.SslHandler r1 = r3.this$0
                io.netty.handler.ssl.SslHandler r2 = r3.this$0
                io.netty.channel.ChannelHandlerContext r2 = io.netty.handler.ssl.SslHandler.access$700(r2)
                io.netty.handler.ssl.SslHandler.access$1100(r1, r2)
                throw r0
        }

        private java.lang.Throwable wrapIfNeeded(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.inUnwrap
                if (r0 != 0) goto L5
                return r2
            L5:
                boolean r0 = r2 instanceof io.netty.handler.codec.DecoderException
                if (r0 == 0) goto La
                return r2
            La:
                io.netty.handler.codec.DecoderException r0 = new io.netty.handler.codec.DecoderException
                r0.<init>(r2)
                return r0
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                io.netty.handler.ssl.SslHandler r0 = r2.this$0     // Catch: java.lang.Throwable -> L1c
                javax.net.ssl.SSLEngine r0 = io.netty.handler.ssl.SslHandler.access$100(r0)     // Catch: java.lang.Throwable -> L1c
                io.netty.handler.ssl.SslHandler.access$1900(r0)     // Catch: java.lang.Throwable -> L1c
                io.netty.handler.ssl.SslHandler r0 = r2.this$0     // Catch: java.lang.Throwable -> L1c
                io.netty.channel.ChannelHandlerContext r0 = io.netty.handler.ssl.SslHandler.access$700(r0)     // Catch: java.lang.Throwable -> L1c
                io.netty.util.concurrent.EventExecutor r0 = r0.executor()     // Catch: java.lang.Throwable -> L1c
                io.netty.handler.ssl.SslHandler$SslTasksRunner$1 r1 = new io.netty.handler.ssl.SslHandler$SslTasksRunner$1     // Catch: java.lang.Throwable -> L1c
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L1c
                r0.execute(r1)     // Catch: java.lang.Throwable -> L1c
                return
            L1c:
                r0 = move-exception
                r2.handleException(r0)
                return
        }
    }

    static {
            java.lang.Class<io.netty.handler.ssl.SslHandler> r0 = io.netty.handler.ssl.SslHandler.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.handler.ssl.SslHandler.logger = r0
            java.lang.String r0 = "^.*(?:Socket|Datagram|Sctp|Udt)Channel.*$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            io.netty.handler.ssl.SslHandler.IGNORABLE_CLASS_IN_STACK = r0
            java.lang.String r0 = "^.*(?:connection.*(?:reset|closed|abort|broken)|broken.*pipe).*$"
            r1 = 2
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            io.netty.handler.ssl.SslHandler.IGNORABLE_ERROR_MESSAGE = r0
            return
    }

    public SslHandler(javax.net.ssl.SSLEngine r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public SslHandler(javax.net.ssl.SSLEngine r2, java.util.concurrent.Executor r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r3)
            return
    }

    public SslHandler(javax.net.ssl.SSLEngine r2, boolean r3) {
            r1 = this;
            io.netty.util.concurrent.ImmediateExecutor r0 = io.netty.util.concurrent.ImmediateExecutor.INSTANCE
            r1.<init>(r2, r3, r0)
            return
    }

    public SslHandler(javax.net.ssl.SSLEngine r3, boolean r4, java.util.concurrent.Executor r5) {
            r2 = this;
            r2.<init>()
            r0 = 1
            java.nio.ByteBuffer[] r0 = new java.nio.ByteBuffer[r0]
            r2.singleBuffer = r0
            io.netty.handler.ssl.SslHandler$LazyChannelPromise r0 = new io.netty.handler.ssl.SslHandler$LazyChannelPromise
            r1 = 0
            r0.<init>(r2, r1)
            r2.handshakePromise = r0
            io.netty.handler.ssl.SslHandler$LazyChannelPromise r0 = new io.netty.handler.ssl.SslHandler$LazyChannelPromise
            r0.<init>(r2, r1)
            r2.sslClosePromise = r0
            r0 = 10000(0x2710, double:4.9407E-320)
            r2.handshakeTimeoutMillis = r0
            r0 = 3000(0xbb8, double:1.482E-320)
            r2.closeNotifyFlushTimeoutMillis = r0
            r0 = 16384(0x4000, float:2.2959E-41)
            r2.wrapDataSize = r0
            if (r3 == 0) goto L47
            if (r5 == 0) goto L3f
            r2.engine = r3
            io.netty.handler.ssl.SslHandler$SslEngineType r0 = io.netty.handler.ssl.SslHandler.SslEngineType.forEngine(r3)
            r2.engineType = r0
            r2.delegatedTaskExecutor = r5
            r2.startTls = r4
            boolean r3 = r0.jdkCompatibilityMode(r3)
            r2.jdkCompatibilityMode = r3
            io.netty.handler.codec.ByteToMessageDecoder$Cumulator r3 = r0.cumulator
            r2.setCumulator(r3)
            return
        L3f:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "delegatedTaskExecutor"
            r3.<init>(r4)
            throw r3
        L47:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "engine"
            r3.<init>(r4)
            throw r3
    }

    static /* synthetic */ javax.net.ssl.SSLEngine access$100(io.netty.handler.ssl.SslHandler r0) {
            javax.net.ssl.SSLEngine r0 = r0.engine
            return r0
    }

    static /* synthetic */ void access$1000(io.netty.handler.ssl.SslHandler r0, io.netty.channel.ChannelHandlerContext r1) {
            r0.forceFlush(r1)
            return
    }

    static /* synthetic */ void access$1100(io.netty.handler.ssl.SslHandler r0, io.netty.channel.ChannelHandlerContext r1) {
            r0.channelReadComplete0(r1)
            return
    }

    static /* synthetic */ boolean access$1202(io.netty.handler.ssl.SslHandler r0, boolean r1) {
            r0.processTask = r1
            return r1
    }

    static /* synthetic */ void access$1300(io.netty.handler.ssl.SslHandler r0, boolean r1) {
            r0.executeDelegatedTasks(r1)
            return
    }

    static /* synthetic */ void access$1400(io.netty.handler.ssl.SslHandler r0) {
            r0.setHandshakeSuccess()
            return
    }

    static /* synthetic */ boolean access$1500(io.netty.handler.ssl.SslHandler r0) {
            boolean r0 = r0.setHandshakeSuccessIfStillHandshaking()
            return r0
    }

    static /* synthetic */ void access$1600(io.netty.handler.ssl.SslHandler r0, io.netty.channel.ChannelHandlerContext r1, boolean r2) throws javax.net.ssl.SSLException {
            r0.wrap(r1, r2)
            return
    }

    static /* synthetic */ void access$1700(io.netty.handler.ssl.SslHandler r0, io.netty.channel.ChannelHandlerContext r1) throws javax.net.ssl.SSLException {
            r0.unwrapNonAppData(r1)
            return
    }

    static /* synthetic */ boolean access$1800(io.netty.handler.ssl.SslHandler r0, io.netty.channel.ChannelHandlerContext r1, boolean r2) throws javax.net.ssl.SSLException {
            boolean r0 = r0.wrapNonAppData(r1, r2)
            return r0
    }

    static /* synthetic */ void access$1900(javax.net.ssl.SSLEngine r0) {
            runAllDelegatedTasks(r0)
            return
    }

    static /* synthetic */ java.nio.ByteBuffer[] access$200(io.netty.handler.ssl.SslHandler r0) {
            java.nio.ByteBuffer[] r0 = r0.singleBuffer
            return r0
    }

    static /* synthetic */ void access$2200(io.netty.handler.ssl.SslHandler r0, io.netty.util.concurrent.Promise r1) {
            r0.renegotiateOnEventLoop(r1)
            return
    }

    static /* synthetic */ void access$2300(io.netty.handler.ssl.SslHandler r0, io.netty.channel.ChannelHandlerContext r1, java.lang.Throwable r2) {
            r0.releaseAndFailAll(r1, r2)
            return
    }

    static /* synthetic */ io.netty.util.internal.logging.InternalLogger access$2400() {
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.handler.ssl.SslHandler.logger
            return r0
    }

    static /* synthetic */ void access$2500(io.netty.channel.ChannelFuture r0, io.netty.channel.ChannelPromise r1) {
            addCloseListener(r0, r1)
            return
    }

    static /* synthetic */ long access$2600(io.netty.handler.ssl.SslHandler r2) {
            long r0 = r2.closeNotifyReadTimeoutMillis
            return r0
    }

    static /* synthetic */ io.netty.handler.ssl.SslHandler.LazyChannelPromise access$2700(io.netty.handler.ssl.SslHandler r0) {
            io.netty.handler.ssl.SslHandler$LazyChannelPromise r0 = r0.sslClosePromise
            return r0
    }

    static /* synthetic */ boolean access$2800(io.netty.buffer.ByteBuf r0, io.netty.buffer.ByteBuf r1, int r2) {
            boolean r0 = attemptCopyToCumulation(r0, r1, r2)
            return r0
    }

    static /* synthetic */ java.nio.ByteBuffer access$300(io.netty.buffer.ByteBuf r0, int r1, int r2) {
            java.nio.ByteBuffer r0 = toByteBuffer(r0, r1, r2)
            return r0
    }

    static /* synthetic */ void access$500(io.netty.handler.ssl.SslHandler r0, io.netty.channel.ChannelPromise r1) {
            r0.closeOutbound0(r1)
            return
    }

    static /* synthetic */ void access$600(io.netty.handler.ssl.SslHandler r0, io.netty.channel.ChannelHandlerContext r1, java.lang.Throwable r2) {
            r0.setHandshakeFailureTransportFailure(r1, r2)
            return
    }

    static /* synthetic */ io.netty.channel.ChannelHandlerContext access$700(io.netty.handler.ssl.SslHandler r0) {
            io.netty.channel.ChannelHandlerContext r0 = r0.ctx
            return r0
    }

    static /* synthetic */ void access$800(io.netty.handler.ssl.SslHandler r0, io.netty.channel.ChannelHandlerContext r1, java.lang.Throwable r2) {
            r0.handleUnwrapThrowable(r1, r2)
            return
    }

    static /* synthetic */ void access$900(io.netty.handler.ssl.SslHandler r0, io.netty.channel.ChannelHandlerContext r1, java.lang.Throwable r2) {
            r0.setHandshakeFailure(r1, r2)
            return
    }

    private static void addCloseListener(io.netty.channel.ChannelFuture r3, io.netty.channel.ChannelPromise r4) {
            io.netty.channel.ChannelPromiseNotifier r0 = new io.netty.channel.ChannelPromiseNotifier
            r1 = 1
            io.netty.channel.ChannelPromise[] r1 = new io.netty.channel.ChannelPromise[r1]
            r2 = 0
            r1[r2] = r4
            r0.<init>(r2, r1)
            r3.addListener(r0)
            return
    }

    private io.netty.buffer.ByteBuf allocate(io.netty.channel.ChannelHandlerContext r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBufAllocator r2 = r2.alloc()
            io.netty.handler.ssl.SslHandler$SslEngineType r0 = r1.engineType
            boolean r0 = r0.wantsDirectBuffer
            if (r0 == 0) goto Lf
            io.netty.buffer.ByteBuf r2 = r2.directBuffer(r3)
            return r2
        Lf:
            io.netty.buffer.ByteBuf r2 = r2.buffer(r3)
            return r2
    }

    private io.netty.buffer.ByteBuf allocateOutNetBuf(io.netty.channel.ChannelHandlerContext r2, int r3, int r4) {
            r1 = this;
            io.netty.handler.ssl.SslHandler$SslEngineType r0 = r1.engineType
            int r3 = r0.calculateWrapBufferCapacity(r1, r3, r4)
            io.netty.buffer.ByteBuf r2 = r1.allocate(r2, r3)
            return r2
    }

    private void applyHandshakeTimeout() {
            r6 = this;
            io.netty.util.concurrent.Promise<io.netty.channel.Channel> r0 = r6.handshakePromise
            long r1 = r6.handshakeTimeoutMillis
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L2a
            boolean r3 = r0.isDone()
            if (r3 == 0) goto L11
            goto L2a
        L11:
            io.netty.channel.ChannelHandlerContext r3 = r6.ctx
            io.netty.util.concurrent.EventExecutor r3 = r3.executor()
            io.netty.handler.ssl.SslHandler$5 r4 = new io.netty.handler.ssl.SslHandler$5
            r4.<init>(r6, r0)
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            io.netty.util.concurrent.ScheduledFuture r1 = r3.schedule(r4, r1, r5)
            io.netty.handler.ssl.SslHandler$6 r2 = new io.netty.handler.ssl.SslHandler$6
            r2.<init>(r6, r1)
            r0.addListener(r2)
        L2a:
            return
    }

    private static boolean attemptCopyToCumulation(io.netty.buffer.ByteBuf r4, io.netty.buffer.ByteBuf r5, int r6) {
            int r0 = r5.readableBytes()
            int r1 = r4.capacity()
            int r2 = r4.readableBytes()
            int r2 = r6 - r2
            r3 = 0
            if (r2 < r0) goto L2d
            boolean r2 = r4.isWritable(r0)
            if (r2 == 0) goto L19
            if (r1 >= r6) goto L25
        L19:
            if (r1 >= r6) goto L2d
            int r6 = r4.ensureWritable(r0, r3)
            boolean r6 = io.netty.buffer.ByteBufUtil.ensureWritableSuccess(r6)
            if (r6 == 0) goto L2d
        L25:
            r4.writeBytes(r5)
            r5.release()
            r4 = 1
            return r4
        L2d:
            return r3
    }

    private void channelReadComplete0(io.netty.channel.ChannelHandlerContext r2) {
            r1 = this;
            r1.discardSomeReadBytes()
            r1.flushIfNeeded(r2)
            r1.readIfNeeded(r2)
            r0 = 0
            r1.firedChannelRead = r0
            r2.fireChannelReadComplete()
            return
    }

    private void closeOutbound0(io.netty.channel.ChannelPromise r4) {
            r3 = this;
            r0 = 1
            r3.outboundClosed = r0
            javax.net.ssl.SSLEngine r0 = r3.engine
            r0.closeOutbound()
            io.netty.channel.ChannelHandlerContext r0 = r3.ctx     // Catch: java.lang.Exception -> Le
            r3.flush(r0, r4)     // Catch: java.lang.Exception -> Le
            return
        Le:
            r0 = move-exception
            boolean r4 = r4.tryFailure(r0)
            if (r4 != 0) goto L22
            io.netty.util.internal.logging.InternalLogger r4 = io.netty.handler.ssl.SslHandler.logger
            io.netty.channel.ChannelHandlerContext r1 = r3.ctx
            io.netty.channel.Channel r1 = r1.channel()
            java.lang.String r2 = "{} flush() raised a masked exception."
            r4.warn(r2, r1, r0)
        L22:
            return
    }

    private void closeOutboundAndChannel(io.netty.channel.ChannelHandlerContext r6, io.netty.channel.ChannelPromise r7, boolean r8) throws java.lang.Exception {
            r5 = this;
            r0 = 1
            r5.outboundClosed = r0
            javax.net.ssl.SSLEngine r1 = r5.engine
            r1.closeOutbound()
            io.netty.channel.Channel r1 = r6.channel()
            boolean r1 = r1.isActive()
            if (r1 != 0) goto L1c
            if (r8 == 0) goto L18
            r6.disconnect(r7)
            return
        L18:
            r6.close(r7)
            return
        L1c:
            io.netty.channel.ChannelPromise r8 = r6.newPromise()
            r1 = 0
            r5.flush(r6, r8)     // Catch: java.lang.Throwable -> L4a
            boolean r2 = r5.closeNotify
            if (r2 != 0) goto L3f
            r5.closeNotify = r0
            io.netty.channel.ChannelPromise r2 = r6.newPromise()
            io.netty.channel.ChannelPromiseNotifier r3 = new io.netty.channel.ChannelPromiseNotifier
            io.netty.channel.ChannelPromise[] r0 = new io.netty.channel.ChannelPromise[r0]
            r0[r1] = r7
            r3.<init>(r1, r0)
            io.netty.channel.ChannelPromise r7 = r2.addListener(r3)
            r5.safeClose(r6, r8, r7)
            return
        L3f:
            io.netty.handler.ssl.SslHandler$LazyChannelPromise r6 = r5.sslClosePromise
            io.netty.handler.ssl.SslHandler$3 r8 = new io.netty.handler.ssl.SslHandler$3
            r8.<init>(r5, r7)
            r6.addListener(r8)
            return
        L4a:
            r2 = move-exception
            boolean r3 = r5.closeNotify
            if (r3 != 0) goto L66
            r5.closeNotify = r0
            io.netty.channel.ChannelPromise r3 = r6.newPromise()
            io.netty.channel.ChannelPromiseNotifier r4 = new io.netty.channel.ChannelPromiseNotifier
            io.netty.channel.ChannelPromise[] r0 = new io.netty.channel.ChannelPromise[r0]
            r0[r1] = r7
            r4.<init>(r1, r0)
            io.netty.channel.ChannelPromise r7 = r3.addListener(r4)
            r5.safeClose(r6, r8, r7)
            goto L70
        L66:
            io.netty.handler.ssl.SslHandler$LazyChannelPromise r6 = r5.sslClosePromise
            io.netty.handler.ssl.SslHandler$3 r8 = new io.netty.handler.ssl.SslHandler$3
            r8.<init>(r5, r7)
            r6.addListener(r8)
        L70:
            throw r2
    }

    private void decodeJdkCompatible(io.netty.channel.ChannelHandlerContext r4, io.netty.buffer.ByteBuf r5) throws io.netty.handler.ssl.NotSslRecordException {
            r3 = this;
            int r0 = r3.packetLength
            if (r0 <= 0) goto Lb
            int r1 = r5.readableBytes()
            if (r1 >= r0) goto L24
            goto L12
        Lb:
            int r0 = r5.readableBytes()
            r1 = 5
            if (r0 >= r1) goto L13
        L12:
            return
        L13:
            int r1 = r5.readerIndex()
            int r1 = io.netty.handler.ssl.SslUtils.getEncryptedPacketLength(r5, r1)
            r2 = -2
            if (r1 == r2) goto L38
            if (r1 <= r0) goto L23
            r3.packetLength = r1
            return
        L23:
            r0 = r1
        L24:
            r1 = 0
            r3.packetLength = r1
            int r1 = r5.readerIndex()     // Catch: java.lang.Throwable -> L33
            int r0 = r3.unwrap(r4, r5, r1, r0)     // Catch: java.lang.Throwable -> L33
            r5.skipBytes(r0)     // Catch: java.lang.Throwable -> L33
            return
        L33:
            r5 = move-exception
            r3.handleUnwrapThrowable(r4, r5)
            return
        L38:
            io.netty.handler.ssl.NotSslRecordException r0 = new io.netty.handler.ssl.NotSslRecordException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "not an SSL/TLS record: "
            r1.append(r2)
            java.lang.String r2 = io.netty.buffer.ByteBufUtil.hexDump(r5)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            int r1 = r5.readableBytes()
            r5.skipBytes(r1)
            r3.setHandshakeFailure(r4, r0)
            throw r0
    }

    private void decodeNonJdkCompatible(io.netty.channel.ChannelHandlerContext r3, io.netty.buffer.ByteBuf r4) {
            r2 = this;
            int r0 = r4.readerIndex()     // Catch: java.lang.Throwable -> L10
            int r1 = r4.readableBytes()     // Catch: java.lang.Throwable -> L10
            int r0 = r2.unwrap(r3, r4, r0, r1)     // Catch: java.lang.Throwable -> L10
            r4.skipBytes(r0)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r4 = move-exception
            r2.handleUnwrapThrowable(r3, r4)
            return
    }

    private void executeDelegatedTasks(boolean r3) {
            r2 = this;
            r0 = 1
            r2.processTask = r0
            java.util.concurrent.Executor r0 = r2.delegatedTaskExecutor     // Catch: java.util.concurrent.RejectedExecutionException -> Le
            io.netty.handler.ssl.SslHandler$SslTasksRunner r1 = new io.netty.handler.ssl.SslHandler$SslTasksRunner     // Catch: java.util.concurrent.RejectedExecutionException -> Le
            r1.<init>(r2, r3)     // Catch: java.util.concurrent.RejectedExecutionException -> Le
            r0.execute(r1)     // Catch: java.util.concurrent.RejectedExecutionException -> Le
            return
        Le:
            r3 = move-exception
            r0 = 0
            r2.processTask = r0
            throw r3
    }

    private void finishWrap(io.netty.channel.ChannelHandlerContext r2, io.netty.buffer.ByteBuf r3, io.netty.channel.ChannelPromise r4, boolean r5, boolean r6) {
            r1 = this;
            if (r3 != 0) goto L5
            io.netty.buffer.ByteBuf r3 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            goto L10
        L5:
            boolean r0 = r3.isReadable()
            if (r0 != 0) goto L10
            r3.release()
            io.netty.buffer.ByteBuf r3 = io.netty.buffer.Unpooled.EMPTY_BUFFER
        L10:
            if (r4 == 0) goto L16
            r2.write(r3, r4)
            goto L19
        L16:
            r2.write(r3)
        L19:
            if (r5 == 0) goto L1e
            r3 = 1
            r1.needsFlush = r3
        L1e:
            if (r6 == 0) goto L23
            r1.readIfNeeded(r2)
        L23:
            return
    }

    private void flush(io.netty.channel.ChannelHandlerContext r3, io.netty.channel.ChannelPromise r4) throws java.lang.Exception {
            r2 = this;
            io.netty.handler.ssl.SslHandler$SslHandlerCoalescingBufferQueue r0 = r2.pendingUnencryptedWrites
            if (r0 == 0) goto La
            io.netty.buffer.ByteBuf r1 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            r0.add(r1, r4)
            goto L11
        La:
            java.lang.IllegalStateException r0 = newPendingWritesNullException()
            r4.setFailure(r0)
        L11:
            r2.flush(r3)
            return
    }

    private void flushIfNeeded(io.netty.channel.ChannelHandlerContext r2) {
            r1 = this;
            boolean r0 = r1.needsFlush
            if (r0 == 0) goto L7
            r1.forceFlush(r2)
        L7:
            return
    }

    private void forceFlush(io.netty.channel.ChannelHandlerContext r2) {
            r1 = this;
            r0 = 0
            r1.needsFlush = r0
            r2.flush()
            return
    }

    private void handleUnwrapThrowable(io.netty.channel.ChannelHandlerContext r14, java.lang.Throwable r15) {
            r13 = this;
            io.netty.util.concurrent.Promise<io.netty.channel.Channel> r0 = r13.handshakePromise     // Catch: java.lang.Throwable -> L11 javax.net.ssl.SSLException -> L15
            boolean r0 = r0.tryFailure(r15)     // Catch: java.lang.Throwable -> L11 javax.net.ssl.SSLException -> L15
            if (r0 == 0) goto L19
            io.netty.handler.ssl.SslHandshakeCompletionEvent r0 = new io.netty.handler.ssl.SslHandshakeCompletionEvent     // Catch: java.lang.Throwable -> L11 javax.net.ssl.SSLException -> L15
            r0.<init>(r15)     // Catch: java.lang.Throwable -> L11 javax.net.ssl.SSLException -> L15
            r14.fireUserEventTriggered(r0)     // Catch: java.lang.Throwable -> L11 javax.net.ssl.SSLException -> L15
            goto L19
        L11:
            r0 = move-exception
            r8 = r14
            r9 = r15
            goto L3a
        L15:
            r0 = move-exception
            r8 = r14
            r9 = r15
            goto L27
        L19:
            r13.wrapAndFlush(r14)     // Catch: java.lang.Throwable -> L11 javax.net.ssl.SSLException -> L15
            r5 = 0
            r6 = 1
            r4 = 1
            r1 = r13
            r2 = r14
            r3 = r15
            r1.setHandshakeFailure(r2, r3, r4, r5, r6)
            r9 = r3
            goto L35
        L27:
            io.netty.util.internal.logging.InternalLogger r14 = io.netty.handler.ssl.SslHandler.logger     // Catch: java.lang.Throwable -> L39
            java.lang.String r15 = "SSLException during trying to call SSLEngine.wrap(...) because of an previous SSLException, ignoring..."
            r14.debug(r15, r0)     // Catch: java.lang.Throwable -> L39
            r11 = 0
            r12 = 1
            r10 = 1
            r7 = r13
            r7.setHandshakeFailure(r8, r9, r10, r11, r12)
        L35:
            io.netty.util.internal.PlatformDependent.throwException(r9)
            return
        L39:
            r0 = move-exception
        L3a:
            r11 = 0
            r12 = 1
            r10 = 1
            r7 = r13
            r7.setHandshakeFailure(r8, r9, r10, r11, r12)
            throw r0
    }

    private void handshake() {
            r2 = this;
            javax.net.ssl.SSLEngine r0 = r2.engine
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = r0.getHandshakeStatus()
            javax.net.ssl.SSLEngineResult$HandshakeStatus r1 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING
            if (r0 == r1) goto Lb
            goto L13
        Lb:
            io.netty.util.concurrent.Promise<io.netty.channel.Channel> r0 = r2.handshakePromise
            boolean r0 = r0.isDone()
            if (r0 == 0) goto L14
        L13:
            return
        L14:
            io.netty.channel.ChannelHandlerContext r0 = r2.ctx
            javax.net.ssl.SSLEngine r1 = r2.engine     // Catch: java.lang.Throwable -> L23
            r1.beginHandshake()     // Catch: java.lang.Throwable -> L23
            r1 = 0
            r2.wrapNonAppData(r0, r1)     // Catch: java.lang.Throwable -> L23
            r2.forceFlush(r0)
            return
        L23:
            r1 = move-exception
            r2.setHandshakeFailure(r0, r1)     // Catch: java.lang.Throwable -> L2b
            r2.forceFlush(r0)
            return
        L2b:
            r1 = move-exception
            r2.forceFlush(r0)
            throw r1
    }

    private boolean ignoreException(java.lang.Throwable r10) {
            r9 = this;
            boolean r0 = r10 instanceof javax.net.ssl.SSLException
            r1 = 0
            if (r0 != 0) goto La6
            boolean r0 = r10 instanceof java.io.IOException
            if (r0 == 0) goto La6
            io.netty.handler.ssl.SslHandler$LazyChannelPromise r0 = r9.sslClosePromise
            boolean r0 = r0.isDone()
            if (r0 == 0) goto La6
            java.lang.String r0 = r10.getMessage()
            r2 = 1
            if (r0 == 0) goto L25
            java.util.regex.Pattern r3 = io.netty.handler.ssl.SslHandler.IGNORABLE_ERROR_MESSAGE
            java.util.regex.Matcher r0 = r3.matcher(r0)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L25
            return r2
        L25:
            java.lang.StackTraceElement[] r10 = r10.getStackTrace()
            int r0 = r10.length
            r3 = 0
        L2b:
            if (r3 >= r0) goto La6
            r4 = r10[r3]
            java.lang.String r5 = r4.getClassName()
            java.lang.String r4 = r4.getMethodName()
            java.lang.String r6 = "io.netty."
            boolean r6 = r5.startsWith(r6)
            if (r6 == 0) goto L40
            goto La3
        L40:
            java.lang.String r6 = "read"
            boolean r4 = r6.equals(r4)
            if (r4 != 0) goto L49
            goto La3
        L49:
            java.util.regex.Pattern r4 = io.netty.handler.ssl.SslHandler.IGNORABLE_CLASS_IN_STACK
            java.util.regex.Matcher r4 = r4.matcher(r5)
            boolean r4 = r4.matches()
            if (r4 == 0) goto L56
            return r2
        L56:
            java.lang.Class r4 = r9.getClass()     // Catch: java.lang.Throwable -> L8b
            java.lang.ClassLoader r4 = io.netty.util.internal.PlatformDependent.getClassLoader(r4)     // Catch: java.lang.Throwable -> L8b
            java.lang.Class r4 = r4.loadClass(r5)     // Catch: java.lang.Throwable -> L8b
            java.lang.Class<java.nio.channels.SocketChannel> r6 = java.nio.channels.SocketChannel.class
            boolean r6 = r6.isAssignableFrom(r4)     // Catch: java.lang.Throwable -> L8b
            if (r6 != 0) goto L8d
            java.lang.Class<java.nio.channels.DatagramChannel> r6 = java.nio.channels.DatagramChannel.class
            boolean r6 = r6.isAssignableFrom(r4)     // Catch: java.lang.Throwable -> L8b
            if (r6 == 0) goto L73
            goto L8d
        L73:
            int r6 = io.netty.util.internal.PlatformDependent.javaVersion()     // Catch: java.lang.Throwable -> L8b
            r7 = 7
            if (r6 < r7) goto La3
            java.lang.String r6 = "com.sun.nio.sctp.SctpChannel"
            java.lang.Class r4 = r4.getSuperclass()     // Catch: java.lang.Throwable -> L8b
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L8b
            boolean r4 = r6.equals(r4)     // Catch: java.lang.Throwable -> L8b
            if (r4 == 0) goto La3
            return r2
        L8b:
            r4 = move-exception
            goto L8e
        L8d:
            return r2
        L8e:
            io.netty.util.internal.logging.InternalLogger r6 = io.netty.handler.ssl.SslHandler.logger
            java.lang.Class r7 = r9.getClass()
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r1] = r7
            r8[r2] = r5
            r5 = 2
            r8[r5] = r4
            java.lang.String r4 = "Unexpected exception while loading class {} classname {}"
            r6.debug(r4, r8)
        La3:
            int r3 = r3 + 1
            goto L2b
        La6:
            return r1
    }

    private static boolean inEventLoop(java.util.concurrent.Executor r1) {
            boolean r0 = r1 instanceof io.netty.util.concurrent.EventExecutor
            if (r0 == 0) goto Le
            io.netty.util.concurrent.EventExecutor r1 = (io.netty.util.concurrent.EventExecutor) r1
            boolean r1 = r1.inEventLoop()
            if (r1 == 0) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    public static boolean isEncrypted(io.netty.buffer.ByteBuf r2) {
            int r0 = r2.readableBytes()
            r1 = 5
            if (r0 < r1) goto L16
            int r0 = r2.readerIndex()
            int r2 = io.netty.handler.ssl.SslUtils.getEncryptedPacketLength(r2, r0)
            r0 = -2
            if (r2 == r0) goto L14
            r2 = 1
            return r2
        L14:
            r2 = 0
            return r2
        L16:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "buffer must have at least 5 readable bytes"
            r2.<init>(r0)
            throw r2
    }

    private static java.lang.IllegalStateException newPendingWritesNullException() {
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "pendingUnencryptedWrites is null, handlerRemoved0 called?"
            r0.<init>(r1)
            return r0
    }

    private void notifyClosePromise(java.lang.Throwable r3) {
            r2 = this;
            if (r3 != 0) goto L18
            io.netty.handler.ssl.SslHandler$LazyChannelPromise r3 = r2.sslClosePromise
            io.netty.channel.ChannelHandlerContext r0 = r2.ctx
            io.netty.channel.Channel r0 = r0.channel()
            boolean r3 = r3.trySuccess(r0)
            if (r3 == 0) goto L2a
            io.netty.channel.ChannelHandlerContext r3 = r2.ctx
            io.netty.handler.ssl.SslCloseCompletionEvent r0 = io.netty.handler.ssl.SslCloseCompletionEvent.SUCCESS
            r3.fireUserEventTriggered(r0)
            return
        L18:
            io.netty.handler.ssl.SslHandler$LazyChannelPromise r0 = r2.sslClosePromise
            boolean r0 = r0.tryFailure(r3)
            if (r0 == 0) goto L2a
            io.netty.channel.ChannelHandlerContext r0 = r2.ctx
            io.netty.handler.ssl.SslCloseCompletionEvent r1 = new io.netty.handler.ssl.SslCloseCompletionEvent
            r1.<init>(r3)
            r0.fireUserEventTriggered(r1)
        L2a:
            return
    }

    private void readIfNeeded(io.netty.channel.ChannelHandlerContext r2) {
            r1 = this;
            io.netty.channel.Channel r0 = r2.channel()
            io.netty.channel.ChannelConfig r0 = r0.config()
            boolean r0 = r0.isAutoRead()
            if (r0 != 0) goto L1d
            boolean r0 = r1.firedChannelRead
            if (r0 == 0) goto L1a
            io.netty.util.concurrent.Promise<io.netty.channel.Channel> r0 = r1.handshakePromise
            boolean r0 = r0.isDone()
            if (r0 != 0) goto L1d
        L1a:
            r2.read()
        L1d:
            return
    }

    private void releaseAndFailAll(io.netty.channel.ChannelHandlerContext r2, java.lang.Throwable r3) {
            r1 = this;
            io.netty.handler.ssl.SslHandler$SslHandlerCoalescingBufferQueue r0 = r1.pendingUnencryptedWrites
            if (r0 == 0) goto L7
            r0.releaseAndFailAll(r2, r3)
        L7:
            return
    }

    private void renegotiateOnEventLoop(io.netty.util.concurrent.Promise<io.netty.channel.Channel> r5) {
            r4 = this;
            io.netty.util.concurrent.Promise<io.netty.channel.Channel> r0 = r4.handshakePromise
            boolean r1 = r0.isDone()
            if (r1 != 0) goto L17
            io.netty.util.concurrent.PromiseNotifier r1 = new io.netty.util.concurrent.PromiseNotifier
            r2 = 1
            io.netty.util.concurrent.Promise[] r2 = new io.netty.util.concurrent.Promise[r2]
            r3 = 0
            r2[r3] = r5
            r1.<init>(r2)
            r0.addListener(r1)
            return
        L17:
            r4.handshakePromise = r5
            r4.handshake()
            r4.applyHandshakeTimeout()
            return
    }

    private static void runAllDelegatedTasks(javax.net.ssl.SSLEngine r1) {
        L0:
            java.lang.Runnable r0 = r1.getDelegatedTask()
            if (r0 != 0) goto L7
            return
        L7:
            r0.run()
            goto L0
    }

    private boolean runDelegatedTasks(boolean r3) {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.delegatedTaskExecutor
            io.netty.util.concurrent.ImmediateExecutor r1 = io.netty.util.concurrent.ImmediateExecutor.INSTANCE
            if (r0 == r1) goto L12
            boolean r0 = inEventLoop(r0)
            if (r0 == 0) goto Ld
            goto L12
        Ld:
            r2.executeDelegatedTasks(r3)
            r3 = 0
            return r3
        L12:
            javax.net.ssl.SSLEngine r3 = r2.engine
            runAllDelegatedTasks(r3)
            r3 = 1
            return r3
    }

    private void safeClose(io.netty.channel.ChannelHandlerContext r7, io.netty.channel.ChannelFuture r8, io.netty.channel.ChannelPromise r9) {
            r6 = this;
            io.netty.channel.Channel r0 = r7.channel()
            boolean r0 = r0.isActive()
            if (r0 != 0) goto Le
            r7.close(r9)
            return
        Le:
            boolean r0 = r8.isDone()
            r1 = 0
            if (r0 != 0) goto L2c
            long r2 = r6.closeNotifyFlushTimeoutMillis
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L2c
            io.netty.util.concurrent.EventExecutor r0 = r7.executor()
            io.netty.handler.ssl.SslHandler$7 r1 = new io.netty.handler.ssl.SslHandler$7
            r1.<init>(r6, r8, r7, r9)
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            io.netty.util.concurrent.ScheduledFuture r1 = r0.schedule(r1, r2, r4)
        L2c:
            io.netty.handler.ssl.SslHandler$8 r0 = new io.netty.handler.ssl.SslHandler$8
            r0.<init>(r6, r1, r7, r9)
            r8.addListener(r0)
            return
    }

    private void setHandshakeFailure(io.netty.channel.ChannelHandlerContext r7, java.lang.Throwable r8) {
            r6 = this;
            r4 = 1
            r5 = 0
            r3 = 1
            r0 = r6
            r1 = r7
            r2 = r8
            r0.setHandshakeFailure(r1, r2, r3, r4, r5)
            return
    }

    private void setHandshakeFailure(io.netty.channel.ChannelHandlerContext r4, java.lang.Throwable r5, boolean r6, boolean r7, boolean r8) {
            r3 = this;
            r0 = 1
            r3.outboundClosed = r0     // Catch: java.lang.Throwable -> L10
            javax.net.ssl.SSLEngine r0 = r3.engine     // Catch: java.lang.Throwable -> L10
            r0.closeOutbound()     // Catch: java.lang.Throwable -> L10
            if (r6 == 0) goto L3a
            javax.net.ssl.SSLEngine r6 = r3.engine     // Catch: java.lang.Throwable -> L10 javax.net.ssl.SSLException -> L12
            r6.closeInbound()     // Catch: java.lang.Throwable -> L10 javax.net.ssl.SSLException -> L12
            goto L3a
        L10:
            r6 = move-exception
            goto L4b
        L12:
            r6 = move-exception
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.handler.ssl.SslHandler.logger     // Catch: java.lang.Throwable -> L10
            boolean r1 = r0.isDebugEnabled()     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto L3a
            java.lang.String r1 = r6.getMessage()     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto L31
            java.lang.String r2 = "possible truncation attack"
            boolean r2 = r1.contains(r2)     // Catch: java.lang.Throwable -> L10
            if (r2 != 0) goto L3a
            java.lang.String r2 = "closing inbound before receiving peer's close_notify"
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Throwable -> L10
            if (r1 != 0) goto L3a
        L31:
            java.lang.String r1 = "{} SSLEngine.closeInbound() raised an exception."
            io.netty.channel.Channel r2 = r4.channel()     // Catch: java.lang.Throwable -> L10
            r0.debug(r1, r2, r6)     // Catch: java.lang.Throwable -> L10
        L3a:
            io.netty.util.concurrent.Promise<io.netty.channel.Channel> r6 = r3.handshakePromise     // Catch: java.lang.Throwable -> L10
            boolean r6 = r6.tryFailure(r5)     // Catch: java.lang.Throwable -> L10
            if (r6 != 0) goto L44
            if (r8 == 0) goto L47
        L44:
            io.netty.handler.ssl.SslUtils.handleHandshakeFailure(r4, r5, r7)     // Catch: java.lang.Throwable -> L10
        L47:
            r3.releaseAndFailAll(r4, r5)
            return
        L4b:
            r3.releaseAndFailAll(r4, r5)
            throw r6
    }

    private void setHandshakeFailureTransportFailure(io.netty.channel.ChannelHandlerContext r3, java.lang.Throwable r4) {
            r2 = this;
            javax.net.ssl.SSLException r0 = new javax.net.ssl.SSLException     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = "failure when writing TLS control frames"
            r0.<init>(r1, r4)     // Catch: java.lang.Throwable -> L1b
            r2.releaseAndFailAll(r3, r0)     // Catch: java.lang.Throwable -> L1b
            io.netty.util.concurrent.Promise<io.netty.channel.Channel> r4 = r2.handshakePromise     // Catch: java.lang.Throwable -> L1b
            boolean r4 = r4.tryFailure(r0)     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L1d
            io.netty.handler.ssl.SslHandshakeCompletionEvent r4 = new io.netty.handler.ssl.SslHandshakeCompletionEvent     // Catch: java.lang.Throwable -> L1b
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L1b
            r3.fireUserEventTriggered(r4)     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r4 = move-exception
            goto L21
        L1d:
            r3.close()
            return
        L21:
            r3.close()
            throw r4
    }

    private void setHandshakeSuccess() {
            r4 = this;
            io.netty.util.concurrent.Promise<io.netty.channel.Channel> r0 = r4.handshakePromise
            io.netty.channel.ChannelHandlerContext r1 = r4.ctx
            io.netty.channel.Channel r1 = r1.channel()
            r0.trySuccess(r1)
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.handler.ssl.SslHandler.logger
            boolean r1 = r0.isDebugEnabled()
            if (r1 == 0) goto L28
            io.netty.channel.ChannelHandlerContext r1 = r4.ctx
            io.netty.channel.Channel r1 = r1.channel()
            javax.net.ssl.SSLEngine r2 = r4.engine
            javax.net.ssl.SSLSession r2 = r2.getSession()
            java.lang.String r2 = r2.getCipherSuite()
            java.lang.String r3 = "{} HANDSHAKEN: {}"
            r0.debug(r3, r1, r2)
        L28:
            io.netty.channel.ChannelHandlerContext r0 = r4.ctx
            io.netty.handler.ssl.SslHandshakeCompletionEvent r1 = io.netty.handler.ssl.SslHandshakeCompletionEvent.SUCCESS
            r0.fireUserEventTriggered(r1)
            boolean r0 = r4.readDuringHandshake
            if (r0 == 0) goto L4b
            io.netty.channel.ChannelHandlerContext r0 = r4.ctx
            io.netty.channel.Channel r0 = r0.channel()
            io.netty.channel.ChannelConfig r0 = r0.config()
            boolean r0 = r0.isAutoRead()
            if (r0 != 0) goto L4b
            r0 = 0
            r4.readDuringHandshake = r0
            io.netty.channel.ChannelHandlerContext r0 = r4.ctx
            r0.read()
        L4b:
            return
    }

    private boolean setHandshakeSuccessIfStillHandshaking() {
            r1 = this;
            io.netty.util.concurrent.Promise<io.netty.channel.Channel> r0 = r1.handshakePromise
            boolean r0 = r0.isDone()
            if (r0 != 0) goto Ld
            r1.setHandshakeSuccess()
            r0 = 1
            return r0
        Ld:
            r0 = 0
            return r0
    }

    private void startHandshakeProcessing() {
            r1 = this;
            boolean r0 = r1.handshakeStarted
            if (r0 != 0) goto L15
            r0 = 1
            r1.handshakeStarted = r0
            javax.net.ssl.SSLEngine r0 = r1.engine
            boolean r0 = r0.getUseClientMode()
            if (r0 == 0) goto L12
            r1.handshake()
        L12:
            r1.applyHandshakeTimeout()
        L15:
            return
    }

    private static java.nio.ByteBuffer toByteBuffer(io.netty.buffer.ByteBuf r2, int r3, int r4) {
            int r0 = r2.nioBufferCount()
            r1 = 1
            if (r0 != r1) goto Lc
            java.nio.ByteBuffer r2 = r2.internalNioBuffer(r3, r4)
            return r2
        Lc:
            java.nio.ByteBuffer r2 = r2.nioBuffer(r3, r4)
            return r2
    }

    private int unwrap(io.netty.channel.ChannelHandlerContext r20, io.netty.buffer.ByteBuf r21, int r22, int r23) throws javax.net.ssl.SSLException {
            r19 = this;
            r1 = r19
            r6 = r20
            r7 = r23
            io.netty.buffer.ByteBuf r0 = r1.allocate(r6, r7)
            r8 = 0
            r3 = r22
            r5 = r0
            r4 = r7
            r10 = -1
            r11 = 0
            r12 = 0
        L12:
            r13 = 1
            boolean r0 = r6.isRemoved()     // Catch: java.lang.Throwable -> L70
            r14 = 0
            if (r0 != 0) goto L121
            io.netty.handler.ssl.SslHandler$SslEngineType r0 = r1.engineType     // Catch: java.lang.Throwable -> L70
            r2 = r21
            javax.net.ssl.SSLEngineResult r0 = r0.unwrap(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L70
            javax.net.ssl.SSLEngineResult$Status r2 = r0.getStatus()     // Catch: java.lang.Throwable -> L70
            javax.net.ssl.SSLEngineResult$HandshakeStatus r15 = r0.getHandshakeStatus()     // Catch: java.lang.Throwable -> L70
            int r16 = r0.bytesProduced()     // Catch: java.lang.Throwable -> L70
            int r0 = r0.bytesConsumed()     // Catch: java.lang.Throwable -> L70
            int r3 = r3 + r0
            int r4 = r4 - r0
            int[] r17 = io.netty.handler.ssl.SslHandler.AnonymousClass9.$SwitchMap$javax$net$ssl$SSLEngineResult$Status     // Catch: java.lang.Throwable -> L70
            int r18 = r2.ordinal()     // Catch: java.lang.Throwable -> L70
            r9 = r17[r18]     // Catch: java.lang.Throwable -> L70
            if (r9 == r13) goto Lb1
            r10 = 2
            if (r9 == r10) goto L42
            goto L43
        L42:
            r12 = 1
        L43:
            int[] r9 = io.netty.handler.ssl.SslHandler.AnonymousClass9.$SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus     // Catch: java.lang.Throwable -> L70
            int r17 = r15.ordinal()     // Catch: java.lang.Throwable -> L70
            r9 = r9[r17]     // Catch: java.lang.Throwable -> L70
            if (r9 == r13) goto L8f
            if (r9 == r10) goto L8a
            r10 = 3
            if (r9 == r10) goto L7d
            r10 = 4
            if (r9 == r10) goto L73
            r10 = 5
            if (r9 != r10) goto L59
            goto L98
        L59:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L70
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L70
            r2.<init>()     // Catch: java.lang.Throwable -> L70
            java.lang.String r3 = "unknown handshake status: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L70
            r2.append(r15)     // Catch: java.lang.Throwable -> L70
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L70
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L70
            throw r0     // Catch: java.lang.Throwable -> L70
        L70:
            r0 = move-exception
            goto L14e
        L73:
            boolean r9 = r1.wrapNonAppData(r6, r13)     // Catch: java.lang.Throwable -> L70
            if (r9 == 0) goto L98
            if (r4 != 0) goto L98
            goto L121
        L7d:
            boolean r9 = r1.setHandshakeSuccessIfStillHandshaking()     // Catch: java.lang.Throwable -> L70
            if (r9 == 0) goto L86
            r10 = -1
            r11 = 1
            goto L12
        L86:
            if (r4 != 0) goto L98
            goto L121
        L8a:
            r1.setHandshakeSuccess()     // Catch: java.lang.Throwable -> L70
            r11 = 1
            goto L98
        L8f:
            boolean r9 = r1.runDelegatedTasks(r13)     // Catch: java.lang.Throwable -> L70
            if (r9 != 0) goto L98
            r11 = 0
            goto L121
        L98:
            javax.net.ssl.SSLEngineResult$Status r9 = javax.net.ssl.SSLEngineResult.Status.BUFFER_UNDERFLOW     // Catch: java.lang.Throwable -> L70
            if (r2 == r9) goto La8
            javax.net.ssl.SSLEngineResult$HandshakeStatus r2 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_TASK     // Catch: java.lang.Throwable -> L70
            if (r15 == r2) goto La5
            if (r0 != 0) goto La5
            if (r16 != 0) goto La5
            goto La8
        La5:
            r10 = -1
            goto L12
        La8:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_UNWRAP     // Catch: java.lang.Throwable -> L70
            if (r15 != r0) goto L121
            r19.readIfNeeded(r20)     // Catch: java.lang.Throwable -> L70
            goto L121
        Lb1:
            int r0 = r5.readableBytes()     // Catch: java.lang.Throwable -> L70
            javax.net.ssl.SSLEngine r2 = r1.engine     // Catch: java.lang.Throwable -> L70
            javax.net.ssl.SSLSession r2 = r2.getSession()     // Catch: java.lang.Throwable -> L70
            int r2 = r2.getApplicationBufferSize()     // Catch: java.lang.Throwable -> L70
            int r2 = r2 - r0
            if (r0 <= 0) goto Ld8
            r1.firedChannelRead = r13     // Catch: java.lang.Throwable -> L70
            r6.fireChannelRead(r5)     // Catch: java.lang.Throwable -> L70
            if (r2 > 0) goto Ldb
            javax.net.ssl.SSLEngine r2 = r1.engine     // Catch: java.lang.Throwable -> Ld4
            javax.net.ssl.SSLSession r2 = r2.getSession()     // Catch: java.lang.Throwable -> Ld4
            int r2 = r2.getApplicationBufferSize()     // Catch: java.lang.Throwable -> Ld4
            goto Ldb
        Ld4:
            r0 = move-exception
            r5 = r14
            goto L14e
        Ld8:
            r5.release()     // Catch: java.lang.Throwable -> L70
        Ldb:
            if (r0 != 0) goto L114
            if (r10 == 0) goto Le0
            goto L114
        Le0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Ld4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld4
            r2.<init>()     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r3 = "Two consecutive overflows but no content was consumed. "
            r2.append(r3)     // Catch: java.lang.Throwable -> Ld4
            java.lang.Class<javax.net.ssl.SSLSession> r3 = javax.net.ssl.SSLSession.class
            java.lang.String r3 = r3.getSimpleName()     // Catch: java.lang.Throwable -> Ld4
            r2.append(r3)     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r3 = " getApplicationBufferSize: "
            r2.append(r3)     // Catch: java.lang.Throwable -> Ld4
            javax.net.ssl.SSLEngine r3 = r1.engine     // Catch: java.lang.Throwable -> Ld4
            javax.net.ssl.SSLSession r3 = r3.getSession()     // Catch: java.lang.Throwable -> Ld4
            int r3 = r3.getApplicationBufferSize()     // Catch: java.lang.Throwable -> Ld4
            r2.append(r3)     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r3 = " maybe too small."
            r2.append(r3)     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Ld4
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Ld4
            throw r0     // Catch: java.lang.Throwable -> Ld4
        L114:
            io.netty.handler.ssl.SslHandler$SslEngineType r5 = r1.engineType     // Catch: java.lang.Throwable -> Ld4
            int r2 = r5.calculatePendingData(r1, r2)     // Catch: java.lang.Throwable -> Ld4
            io.netty.buffer.ByteBuf r5 = r1.allocate(r6, r2)     // Catch: java.lang.Throwable -> Ld4
            r10 = r0
            goto L12
        L121:
            boolean r0 = r1.flushedBeforeHandshake     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L130
            io.netty.util.concurrent.Promise<io.netty.channel.Channel> r0 = r1.handshakePromise     // Catch: java.lang.Throwable -> L70
            boolean r0 = r0.isDone()     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L130
            r1.flushedBeforeHandshake = r8     // Catch: java.lang.Throwable -> L70
            r11 = 1
        L130:
            if (r11 == 0) goto L135
            r1.wrap(r6, r13)     // Catch: java.lang.Throwable -> L70
        L135:
            if (r12 == 0) goto L13a
            r1.notifyClosePromise(r14)     // Catch: java.lang.Throwable -> L70
        L13a:
            if (r5 == 0) goto L14b
            boolean r0 = r5.isReadable()
            if (r0 == 0) goto L148
            r1.firedChannelRead = r13
            r6.fireChannelRead(r5)
            goto L14b
        L148:
            r5.release()
        L14b:
            int r0 = r7 - r4
            return r0
        L14e:
            if (r5 == 0) goto L15f
            boolean r2 = r5.isReadable()
            if (r2 == 0) goto L15c
            r1.firedChannelRead = r13
            r6.fireChannelRead(r5)
            goto L15f
        L15c:
            r5.release()
        L15f:
            throw r0
    }

    private void unwrapNonAppData(io.netty.channel.ChannelHandlerContext r3) throws javax.net.ssl.SSLException {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            r1 = 0
            r2.unwrap(r3, r0, r1, r1)
            return
    }

    private javax.net.ssl.SSLEngineResult wrap(io.netty.buffer.ByteBufAllocator r8, javax.net.ssl.SSLEngine r9, io.netty.buffer.ByteBuf r10, io.netty.buffer.ByteBuf r11) throws javax.net.ssl.SSLException {
            r7 = this;
            r0 = 0
            r1 = 0
            int r2 = r10.readerIndex()     // Catch: java.lang.Throwable -> L2e
            int r3 = r10.readableBytes()     // Catch: java.lang.Throwable -> L2e
            boolean r4 = r10.isDirect()     // Catch: java.lang.Throwable -> L2e
            r5 = 1
            if (r4 != 0) goto L31
            io.netty.handler.ssl.SslHandler$SslEngineType r4 = r7.engineType     // Catch: java.lang.Throwable -> L2e
            boolean r4 = r4.wantsDirectBuffer     // Catch: java.lang.Throwable -> L2e
            if (r4 != 0) goto L18
            goto L31
        L18:
            io.netty.buffer.ByteBuf r8 = r8.directBuffer(r3)     // Catch: java.lang.Throwable -> L2e
            r8.writeBytes(r10, r2, r3)     // Catch: java.lang.Throwable -> L2c
            java.nio.ByteBuffer[] r2 = r7.singleBuffer     // Catch: java.lang.Throwable -> L2c
            int r4 = r8.readerIndex()     // Catch: java.lang.Throwable -> L2c
            java.nio.ByteBuffer r3 = r8.internalNioBuffer(r4, r3)     // Catch: java.lang.Throwable -> L2c
            r2[r0] = r3     // Catch: java.lang.Throwable -> L2c
            goto L4b
        L2c:
            r9 = move-exception
            goto L92
        L2e:
            r9 = move-exception
            r8 = r1
            goto L92
        L31:
            boolean r8 = r10 instanceof io.netty.buffer.CompositeByteBuf     // Catch: java.lang.Throwable -> L2e
            if (r8 != 0) goto L46
            int r8 = r10.nioBufferCount()     // Catch: java.lang.Throwable -> L2e
            if (r8 != r5) goto L46
            java.nio.ByteBuffer[] r8 = r7.singleBuffer     // Catch: java.lang.Throwable -> L2e
            java.nio.ByteBuffer r2 = r10.internalNioBuffer(r2, r3)     // Catch: java.lang.Throwable -> L2e
            r8[r0] = r2     // Catch: java.lang.Throwable -> L2e
            r2 = r8
        L44:
            r8 = r1
            goto L4b
        L46:
            java.nio.ByteBuffer[] r2 = r10.nioBuffers()     // Catch: java.lang.Throwable -> L2e
            goto L44
        L4b:
            int r3 = r11.writerIndex()     // Catch: java.lang.Throwable -> L2c
            int r4 = r11.writableBytes()     // Catch: java.lang.Throwable -> L2c
            java.nio.ByteBuffer r3 = r11.nioBuffer(r3, r4)     // Catch: java.lang.Throwable -> L2c
            javax.net.ssl.SSLEngineResult r3 = r9.wrap(r2, r3)     // Catch: java.lang.Throwable -> L2c
            int r4 = r3.bytesConsumed()     // Catch: java.lang.Throwable -> L2c
            r10.skipBytes(r4)     // Catch: java.lang.Throwable -> L2c
            int r4 = r11.writerIndex()     // Catch: java.lang.Throwable -> L2c
            int r6 = r3.bytesProduced()     // Catch: java.lang.Throwable -> L2c
            int r4 = r4 + r6
            r11.writerIndex(r4)     // Catch: java.lang.Throwable -> L2c
            int[] r4 = io.netty.handler.ssl.SslHandler.AnonymousClass9.$SwitchMap$javax$net$ssl$SSLEngineResult$Status     // Catch: java.lang.Throwable -> L2c
            javax.net.ssl.SSLEngineResult$Status r6 = r3.getStatus()     // Catch: java.lang.Throwable -> L2c
            int r6 = r6.ordinal()     // Catch: java.lang.Throwable -> L2c
            r4 = r4[r6]     // Catch: java.lang.Throwable -> L2c
            if (r4 == r5) goto L86
            java.nio.ByteBuffer[] r9 = r7.singleBuffer
            r9[r0] = r1
            if (r8 == 0) goto L85
            r8.release()
        L85:
            return r3
        L86:
            javax.net.ssl.SSLSession r3 = r9.getSession()     // Catch: java.lang.Throwable -> L2c
            int r3 = r3.getPacketBufferSize()     // Catch: java.lang.Throwable -> L2c
            r11.ensureWritable(r3)     // Catch: java.lang.Throwable -> L2c
            goto L4b
        L92:
            java.nio.ByteBuffer[] r10 = r7.singleBuffer
            r10[r0] = r1
            if (r8 == 0) goto L9b
            r8.release()
        L9b:
            throw r9
    }

    private void wrap(io.netty.channel.ChannelHandlerContext r13, boolean r14) throws javax.net.ssl.SSLException {
            r12 = this;
            io.netty.buffer.ByteBufAllocator r0 = r13.alloc()
            r7 = 0
            r6 = 0
            int r8 = r12.wrapDataSize     // Catch: java.lang.Throwable -> Lea
            r3 = r7
            r4 = r3
        La:
            boolean r5 = r13.isRemoved()     // Catch: java.lang.Throwable -> L1d
            if (r5 != 0) goto L29
            io.netty.channel.ChannelPromise r4 = r13.newPromise()     // Catch: java.lang.Throwable -> L67
            if (r8 <= 0) goto L20
            io.netty.handler.ssl.SslHandler$SslHandlerCoalescingBufferQueue r5 = r12.pendingUnencryptedWrites     // Catch: java.lang.Throwable -> L1d
            io.netty.buffer.ByteBuf r5 = r5.remove(r0, r8, r4)     // Catch: java.lang.Throwable -> L1d
            goto L26
        L1d:
            r0 = move-exception
            goto Led
        L20:
            io.netty.handler.ssl.SslHandler$SslHandlerCoalescingBufferQueue r5 = r12.pendingUnencryptedWrites     // Catch: java.lang.Throwable -> L67
            io.netty.buffer.ByteBuf r5 = r5.removeFirst(r4)     // Catch: java.lang.Throwable -> L67
        L26:
            if (r5 != 0) goto L2c
            r7 = r5
        L29:
            r10 = 0
            goto Ldd
        L2c:
            if (r3 != 0) goto L3f
            int r9 = r5.readableBytes()     // Catch: java.lang.Throwable -> L3b
            int r10 = r5.nioBufferCount()     // Catch: java.lang.Throwable -> L3b
            io.netty.buffer.ByteBuf r3 = r12.allocateOutNetBuf(r13, r9, r10)     // Catch: java.lang.Throwable -> L3b
            goto L3f
        L3b:
            r0 = move-exception
            r7 = r5
            goto Led
        L3f:
            javax.net.ssl.SSLEngine r9 = r12.engine     // Catch: java.lang.Throwable -> L6c
            javax.net.ssl.SSLEngineResult r9 = r12.wrap(r0, r9, r5, r3)     // Catch: java.lang.Throwable -> L6c
            javax.net.ssl.SSLEngineResult$Status r10 = r9.getStatus()     // Catch: java.lang.Throwable -> L6c
            javax.net.ssl.SSLEngineResult$Status r11 = javax.net.ssl.SSLEngineResult.Status.CLOSED     // Catch: java.lang.Throwable -> L6c
            if (r10 != r11) goto L70
            r5.release()     // Catch: java.lang.Throwable -> L6c
            javax.net.ssl.SSLException r0 = new javax.net.ssl.SSLException     // Catch: java.lang.Throwable -> L67
            java.lang.String r5 = "SSLEngine closed already"
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L67
            r4.tryFailure(r0)     // Catch: java.lang.Throwable -> L67
            r4 = 0
            io.netty.handler.ssl.SslHandler$SslHandlerCoalescingBufferQueue r5 = r12.pendingUnencryptedWrites     // Catch: java.lang.Throwable -> L67
            r5.releaseAndFailAll(r13, r0)     // Catch: java.lang.Throwable -> L67
            r1 = r12
            r2 = r13
            r5 = r14
            r1.finishWrap(r2, r3, r4, r5, r6)
            return
        L67:
            r0 = move-exception
            r10 = 0
        L69:
            r6 = 0
            goto Led
        L6c:
            r0 = move-exception
            r10 = 0
        L6e:
            r7 = r5
            goto L69
        L70:
            r10 = 0
            boolean r2 = r5.isReadable()     // Catch: java.lang.Throwable -> L7e
            if (r2 == 0) goto L80
            io.netty.handler.ssl.SslHandler$SslHandlerCoalescingBufferQueue r2 = r12.pendingUnencryptedWrites     // Catch: java.lang.Throwable -> L7e
            r2.addFirst(r5, r4)     // Catch: java.lang.Throwable -> L7e
            r4 = r7
            goto L83
        L7e:
            r0 = move-exception
            goto L6e
        L80:
            r5.release()     // Catch: java.lang.Throwable -> L7e
        L83:
            int[] r2 = io.netty.handler.ssl.SslHandler.AnonymousClass9.$SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus     // Catch: java.lang.Throwable -> Lc1
            javax.net.ssl.SSLEngineResult$HandshakeStatus r5 = r9.getHandshakeStatus()     // Catch: java.lang.Throwable -> Lc1
            int r5 = r5.ordinal()     // Catch: java.lang.Throwable -> Lc1
            r2 = r2[r5]     // Catch: java.lang.Throwable -> Lc1
            r5 = 1
            if (r2 == r5) goto Ld3
            r5 = 2
            if (r2 == r5) goto Lc3
            r5 = 3
            if (r2 == r5) goto Lc6
            r5 = 4
            if (r2 == r5) goto Lc9
            r0 = 5
            if (r2 != r0) goto La6
            r6 = 1
            r1 = r12
            r2 = r13
            r5 = r14
            r1.finishWrap(r2, r3, r4, r5, r6)
            return
        La6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lc1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc1
            r1.<init>()     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r2 = "Unknown handshake status: "
            r1.append(r2)     // Catch: java.lang.Throwable -> Lc1
            javax.net.ssl.SSLEngineResult$HandshakeStatus r2 = r9.getHandshakeStatus()     // Catch: java.lang.Throwable -> Lc1
            r1.append(r2)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lc1
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lc1
            throw r0     // Catch: java.lang.Throwable -> Lc1
        Lc1:
            r0 = move-exception
            goto L69
        Lc3:
            r12.setHandshakeSuccess()     // Catch: java.lang.Throwable -> Lc1
        Lc6:
            r12.setHandshakeSuccessIfStillHandshaking()     // Catch: java.lang.Throwable -> Lc1
        Lc9:
            r6 = 0
            r1 = r12
            r2 = r13
            r5 = r14
            r1.finishWrap(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Lc1
            r3 = r7
            r4 = r3
            goto Lda
        Ld3:
            boolean r5 = r12.runDelegatedTasks(r14)     // Catch: java.lang.Throwable -> Lc1
            if (r5 != 0) goto Lda
            goto Ldd
        Lda:
            r6 = 0
            goto La
        Ldd:
            if (r7 == 0) goto Le2
            r7.release()
        Le2:
            r1 = r12
            r2 = r13
            r5 = r14
            r6 = 0
            r1.finishWrap(r2, r3, r4, r5, r6)
            return
        Lea:
            r0 = move-exception
            r3 = r7
            r4 = r3
        Led:
            if (r7 == 0) goto Lf2
            r7.release()
        Lf2:
            r1 = r12
            r2 = r13
            r5 = r14
            r1.finishWrap(r2, r3, r4, r5, r6)
            throw r0
    }

    private void wrapAndFlush(io.netty.channel.ChannelHandlerContext r4) throws javax.net.ssl.SSLException {
            r3 = this;
            io.netty.handler.ssl.SslHandler$SslHandlerCoalescingBufferQueue r0 = r3.pendingUnencryptedWrites
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L13
            io.netty.handler.ssl.SslHandler$SslHandlerCoalescingBufferQueue r0 = r3.pendingUnencryptedWrites
            io.netty.buffer.ByteBuf r1 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            io.netty.channel.ChannelPromise r2 = r4.newPromise()
            r0.add(r1, r2)
        L13:
            io.netty.util.concurrent.Promise<io.netty.channel.Channel> r0 = r3.handshakePromise
            boolean r0 = r0.isDone()
            if (r0 != 0) goto L1e
            r0 = 1
            r3.flushedBeforeHandshake = r0
        L1e:
            r0 = 0
            r3.wrap(r4, r0)     // Catch: java.lang.Throwable -> L26
            r3.forceFlush(r4)
            return
        L26:
            r0 = move-exception
            r3.forceFlush(r4)
            throw r0
    }

    private boolean wrapNonAppData(io.netty.channel.ChannelHandlerContext r10, boolean r11) throws javax.net.ssl.SSLException {
            r9 = this;
            io.netty.buffer.ByteBufAllocator r0 = r10.alloc()
            r1 = 0
            r2 = r1
        L6:
            boolean r3 = r10.isRemoved()     // Catch: java.lang.Throwable -> L17
            r4 = 0
            if (r3 != 0) goto Lb1
            r3 = 1
            if (r2 != 0) goto L1a
            r5 = 2048(0x800, float:2.87E-42)
            io.netty.buffer.ByteBuf r2 = r9.allocateOutNetBuf(r10, r5, r3)     // Catch: java.lang.Throwable -> L17
            goto L1a
        L17:
            r10 = move-exception
            goto Lb7
        L1a:
            javax.net.ssl.SSLEngine r5 = r9.engine     // Catch: java.lang.Throwable -> L17
            io.netty.buffer.ByteBuf r6 = io.netty.buffer.Unpooled.EMPTY_BUFFER     // Catch: java.lang.Throwable -> L17
            javax.net.ssl.SSLEngineResult r5 = r9.wrap(r0, r5, r6, r2)     // Catch: java.lang.Throwable -> L17
            int r6 = r5.bytesProduced()     // Catch: java.lang.Throwable -> L17
            if (r6 <= 0) goto L39
            io.netty.channel.ChannelFuture r6 = r10.write(r2)     // Catch: java.lang.Throwable -> L17
            io.netty.handler.ssl.SslHandler$2 r7 = new io.netty.handler.ssl.SslHandler$2     // Catch: java.lang.Throwable -> L17
            r7.<init>(r9, r10)     // Catch: java.lang.Throwable -> L17
            r6.addListener(r7)     // Catch: java.lang.Throwable -> L17
            if (r11 == 0) goto L38
            r9.needsFlush = r3     // Catch: java.lang.Throwable -> L17
        L38:
            r2 = r1
        L39:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r6 = r5.getHandshakeStatus()     // Catch: java.lang.Throwable -> L17
            int[] r7 = io.netty.handler.ssl.SslHandler.AnonymousClass9.$SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus     // Catch: java.lang.Throwable -> L17
            int r8 = r6.ordinal()     // Catch: java.lang.Throwable -> L17
            r7 = r7[r8]     // Catch: java.lang.Throwable -> L17
            if (r7 == r3) goto L91
            r8 = 2
            if (r7 == r8) goto L88
            r8 = 3
            if (r7 == r8) goto L7a
            r3 = 4
            if (r7 == r3) goto L98
            r3 = 5
            if (r7 != r3) goto L5f
            if (r11 == 0) goto L5b
            if (r2 == 0) goto L5a
            r2.release()
        L5a:
            return r4
        L5b:
            r9.unwrapNonAppData(r10)     // Catch: java.lang.Throwable -> L17
            goto L98
        L5f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L17
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L17
            r11.<init>()     // Catch: java.lang.Throwable -> L17
            java.lang.String r0 = "Unknown handshake status: "
            r11.append(r0)     // Catch: java.lang.Throwable -> L17
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = r5.getHandshakeStatus()     // Catch: java.lang.Throwable -> L17
            r11.append(r0)     // Catch: java.lang.Throwable -> L17
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L17
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L17
            throw r10     // Catch: java.lang.Throwable -> L17
        L7a:
            r9.setHandshakeSuccessIfStillHandshaking()     // Catch: java.lang.Throwable -> L17
            if (r11 != 0) goto L82
            r9.unwrapNonAppData(r10)     // Catch: java.lang.Throwable -> L17
        L82:
            if (r2 == 0) goto L87
            r2.release()
        L87:
            return r3
        L88:
            r9.setHandshakeSuccess()     // Catch: java.lang.Throwable -> L17
            if (r2 == 0) goto L90
            r2.release()
        L90:
            return r4
        L91:
            boolean r3 = r9.runDelegatedTasks(r11)     // Catch: java.lang.Throwable -> L17
            if (r3 != 0) goto L98
            goto Lb1
        L98:
            int r3 = r5.bytesProduced()     // Catch: java.lang.Throwable -> L17
            if (r3 != 0) goto La3
            javax.net.ssl.SSLEngineResult$HandshakeStatus r3 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_TASK     // Catch: java.lang.Throwable -> L17
            if (r6 == r3) goto La3
            goto Lb1
        La3:
            int r3 = r5.bytesConsumed()     // Catch: java.lang.Throwable -> L17
            if (r3 != 0) goto L6
            javax.net.ssl.SSLEngineResult$HandshakeStatus r3 = r5.getHandshakeStatus()     // Catch: java.lang.Throwable -> L17
            javax.net.ssl.SSLEngineResult$HandshakeStatus r5 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING     // Catch: java.lang.Throwable -> L17
            if (r3 != r5) goto L6
        Lb1:
            if (r2 == 0) goto Lb6
            r2.release()
        Lb6:
            return r4
        Lb7:
            if (r2 == 0) goto Lbc
            r2.release()
        Lbc:
            throw r10
    }

    public java.lang.String applicationProtocol() {
            r2 = this;
            javax.net.ssl.SSLEngine r0 = r2.engine()
            boolean r1 = r0 instanceof io.netty.handler.ssl.ApplicationProtocolAccessor
            if (r1 != 0) goto La
            r0 = 0
            return r0
        La:
            io.netty.handler.ssl.ApplicationProtocolAccessor r0 = (io.netty.handler.ssl.ApplicationProtocolAccessor) r0
            java.lang.String r0 = r0.getNegotiatedApplicationProtocol()
            return r0
    }

    @Override // io.netty.channel.ChannelOutboundHandler
    public void bind(io.netty.channel.ChannelHandlerContext r1, java.net.SocketAddress r2, io.netty.channel.ChannelPromise r3) throws java.lang.Exception {
            r0 = this;
            r1.bind(r2, r3)
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelActive(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            boolean r0 = r1.startTls
            if (r0 != 0) goto L7
            r1.startHandshakeProcessing()
        L7:
            r2.fireChannelActive()
            return
    }

    @Override // io.netty.handler.codec.ByteToMessageDecoder, io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelInactive(io.netty.channel.ChannelHandlerContext r7) throws java.lang.Exception {
            r6 = this;
            java.nio.channels.ClosedChannelException r2 = new java.nio.channels.ClosedChannelException
            r2.<init>()
            boolean r0 = r6.outboundClosed
            r3 = r0 ^ 1
            boolean r4 = r6.handshakeStarted
            r5 = 0
            r0 = r6
            r1 = r7
            r0.setHandshakeFailure(r1, r2, r3, r4, r5)
            r6.notifyClosePromise(r2)
            super.channelInactive(r1)
            return
    }

    @Override // io.netty.handler.codec.ByteToMessageDecoder, io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelReadComplete(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            r0.channelReadComplete0(r1)
            return
    }

    @java.lang.Deprecated
    public io.netty.channel.ChannelFuture close() {
            r1 = this;
            io.netty.channel.ChannelFuture r0 = r1.closeOutbound()
            return r0
    }

    @java.lang.Deprecated
    public io.netty.channel.ChannelFuture close(io.netty.channel.ChannelPromise r1) {
            r0 = this;
            io.netty.channel.ChannelFuture r1 = r0.closeOutbound(r1)
            return r1
    }

    @Override // io.netty.channel.ChannelOutboundHandler
    public void close(io.netty.channel.ChannelHandlerContext r2, io.netty.channel.ChannelPromise r3) throws java.lang.Exception {
            r1 = this;
            r0 = 0
            r1.closeOutboundAndChannel(r2, r3, r0)
            return
    }

    public io.netty.channel.ChannelFuture closeOutbound() {
            r1 = this;
            io.netty.channel.ChannelHandlerContext r0 = r1.ctx
            io.netty.channel.ChannelPromise r0 = r0.newPromise()
            io.netty.channel.ChannelFuture r0 = r1.closeOutbound(r0)
            return r0
    }

    public io.netty.channel.ChannelFuture closeOutbound(io.netty.channel.ChannelPromise r3) {
            r2 = this;
            io.netty.channel.ChannelHandlerContext r0 = r2.ctx
            io.netty.util.concurrent.EventExecutor r1 = r0.executor()
            boolean r1 = r1.inEventLoop()
            if (r1 == 0) goto L10
            r2.closeOutbound0(r3)
            return r3
        L10:
            io.netty.util.concurrent.EventExecutor r0 = r0.executor()
            io.netty.handler.ssl.SslHandler$1 r1 = new io.netty.handler.ssl.SslHandler$1
            r1.<init>(r2, r3)
            r0.execute(r1)
            return r3
    }

    @Override // io.netty.channel.ChannelOutboundHandler
    public void connect(io.netty.channel.ChannelHandlerContext r1, java.net.SocketAddress r2, java.net.SocketAddress r3, io.netty.channel.ChannelPromise r4) throws java.lang.Exception {
            r0 = this;
            r1.connect(r2, r3, r4)
            return
    }

    @Override // io.netty.handler.codec.ByteToMessageDecoder
    protected void decode(io.netty.channel.ChannelHandlerContext r1, io.netty.buffer.ByteBuf r2, java.util.List<java.lang.Object> r3) throws javax.net.ssl.SSLException {
            r0 = this;
            boolean r3 = r0.processTask
            if (r3 == 0) goto L5
            return
        L5:
            boolean r3 = r0.jdkCompatibilityMode
            if (r3 == 0) goto Ld
            r0.decodeJdkCompatible(r1, r2)
            return
        Ld:
            r0.decodeNonJdkCompatible(r1, r2)
            return
    }

    @Override // io.netty.channel.ChannelOutboundHandler
    public void deregister(io.netty.channel.ChannelHandlerContext r1, io.netty.channel.ChannelPromise r2) throws java.lang.Exception {
            r0 = this;
            r1.deregister(r2)
            return
    }

    @Override // io.netty.channel.ChannelOutboundHandler
    public void disconnect(io.netty.channel.ChannelHandlerContext r2, io.netty.channel.ChannelPromise r3) throws java.lang.Exception {
            r1 = this;
            r0 = 1
            r1.closeOutboundAndChannel(r2, r3, r0)
            return
    }

    public javax.net.ssl.SSLEngine engine() {
            r1 = this;
            javax.net.ssl.SSLEngine r0 = r1.engine
            return r0
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler, io.netty.channel.ChannelInboundHandler
    public void exceptionCaught(io.netty.channel.ChannelHandlerContext r4, java.lang.Throwable r5) throws java.lang.Exception {
            r3 = this;
            boolean r0 = r3.ignoreException(r5)
            if (r0 == 0) goto L25
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.handler.ssl.SslHandler.logger
            boolean r1 = r0.isDebugEnabled()
            if (r1 == 0) goto L17
            java.lang.String r1 = "{} Swallowing a harmless 'connection reset by peer / broken pipe' error that occurred while writing close_notify in response to the peer's close_notify"
            io.netty.channel.Channel r2 = r4.channel()
            r0.debug(r1, r2, r5)
        L17:
            io.netty.channel.Channel r5 = r4.channel()
            boolean r5 = r5.isActive()
            if (r5 == 0) goto L24
            r4.close()
        L24:
            return
        L25:
            r4.fireExceptionCaught(r5)
            return
    }

    @Override // io.netty.channel.ChannelOutboundHandler
    public void flush(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            boolean r0 = r1.startTls
            if (r0 == 0) goto L17
            boolean r0 = r1.sentFirstMessage
            if (r0 != 0) goto L17
            r0 = 1
            r1.sentFirstMessage = r0
            io.netty.handler.ssl.SslHandler$SslHandlerCoalescingBufferQueue r0 = r1.pendingUnencryptedWrites
            r0.writeAndRemoveAll(r2)
            r1.forceFlush(r2)
            r1.startHandshakeProcessing()
            return
        L17:
            boolean r0 = r1.processTask
            if (r0 == 0) goto L1c
            return
        L1c:
            r1.wrapAndFlush(r2)     // Catch: java.lang.Throwable -> L20
            return
        L20:
            r0 = move-exception
            r1.setHandshakeFailure(r2, r0)
            io.netty.util.internal.PlatformDependent.throwException(r0)
            return
    }

    public final long getCloseNotifyFlushTimeoutMillis() {
            r2 = this;
            long r0 = r2.closeNotifyFlushTimeoutMillis
            return r0
    }

    public final long getCloseNotifyReadTimeoutMillis() {
            r2 = this;
            long r0 = r2.closeNotifyReadTimeoutMillis
            return r0
    }

    @java.lang.Deprecated
    public long getCloseNotifyTimeoutMillis() {
            r2 = this;
            long r0 = r2.getCloseNotifyFlushTimeoutMillis()
            return r0
    }

    public long getHandshakeTimeoutMillis() {
            r2 = this;
            long r0 = r2.handshakeTimeoutMillis
            return r0
    }

    @Override // io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler
    public void handlerAdded(io.netty.channel.ChannelHandlerContext r4) throws java.lang.Exception {
            r3 = this;
            r3.ctx = r4
            io.netty.handler.ssl.SslHandler$SslHandlerCoalescingBufferQueue r0 = new io.netty.handler.ssl.SslHandler$SslHandlerCoalescingBufferQueue
            io.netty.channel.Channel r1 = r4.channel()
            r2 = 16
            r0.<init>(r3, r1, r2)
            r3.pendingUnencryptedWrites = r0
            io.netty.channel.Channel r4 = r4.channel()
            boolean r4 = r4.isActive()
            if (r4 == 0) goto L1c
            r3.startHandshakeProcessing()
        L1c:
            return
    }

    @Override // io.netty.handler.codec.ByteToMessageDecoder
    public void handlerRemoved0(io.netty.channel.ChannelHandlerContext r4) throws java.lang.Exception {
            r3 = this;
            io.netty.handler.ssl.SslHandler$SslHandlerCoalescingBufferQueue r0 = r3.pendingUnencryptedWrites
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L14
            io.netty.handler.ssl.SslHandler$SslHandlerCoalescingBufferQueue r0 = r3.pendingUnencryptedWrites
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            java.lang.String r2 = "Pending write on removal of SslHandler"
            r1.<init>(r2)
            r0.releaseAndFailAll(r4, r1)
        L14:
            r4 = 0
            r3.pendingUnencryptedWrites = r4
            javax.net.ssl.SSLEngine r4 = r3.engine
            boolean r0 = r4 instanceof io.netty.util.ReferenceCounted
            if (r0 == 0) goto L22
            io.netty.util.ReferenceCounted r4 = (io.netty.util.ReferenceCounted) r4
            r4.release()
        L22:
            return
    }

    public io.netty.util.concurrent.Future<io.netty.channel.Channel> handshakeFuture() {
            r1 = this;
            io.netty.util.concurrent.Promise<io.netty.channel.Channel> r0 = r1.handshakePromise
            return r0
    }

    @Override // io.netty.channel.ChannelOutboundHandler
    public void read(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            io.netty.util.concurrent.Promise<io.netty.channel.Channel> r0 = r1.handshakePromise
            boolean r0 = r0.isDone()
            if (r0 != 0) goto Lb
            r0 = 1
            r1.readDuringHandshake = r0
        Lb:
            r2.read()
            return
    }

    public io.netty.util.concurrent.Future<io.netty.channel.Channel> renegotiate() {
            r1 = this;
            io.netty.channel.ChannelHandlerContext r0 = r1.ctx
            if (r0 == 0) goto L11
            io.netty.util.concurrent.EventExecutor r0 = r0.executor()
            io.netty.util.concurrent.Promise r0 = r0.newPromise()
            io.netty.util.concurrent.Future r0 = r1.renegotiate(r0)
            return r0
        L11:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    public io.netty.util.concurrent.Future<io.netty.channel.Channel> renegotiate(io.netty.util.concurrent.Promise<io.netty.channel.Channel> r3) {
            r2 = this;
            if (r3 == 0) goto L23
            io.netty.channel.ChannelHandlerContext r0 = r2.ctx
            if (r0 == 0) goto L1d
            io.netty.util.concurrent.EventExecutor r0 = r0.executor()
            boolean r1 = r0.inEventLoop()
            if (r1 != 0) goto L19
            io.netty.handler.ssl.SslHandler$4 r1 = new io.netty.handler.ssl.SslHandler$4
            r1.<init>(r2, r3)
            r0.execute(r1)
            return r3
        L19:
            r2.renegotiateOnEventLoop(r3)
            return r3
        L1d:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
        L23:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "promise"
            r3.<init>(r0)
            throw r3
    }

    public final void setCloseNotifyFlushTimeout(long r1, java.util.concurrent.TimeUnit r3) {
            r0 = this;
            long r1 = r3.toMillis(r1)
            r0.setCloseNotifyFlushTimeoutMillis(r1)
            return
    }

    public final void setCloseNotifyFlushTimeoutMillis(long r4) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L9
            r3.closeNotifyFlushTimeoutMillis = r4
            return
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "closeNotifyFlushTimeoutMillis: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " (expected: >= 0)"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public final void setCloseNotifyReadTimeout(long r1, java.util.concurrent.TimeUnit r3) {
            r0 = this;
            long r1 = r3.toMillis(r1)
            r0.setCloseNotifyReadTimeoutMillis(r1)
            return
    }

    public final void setCloseNotifyReadTimeoutMillis(long r4) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L9
            r3.closeNotifyReadTimeoutMillis = r4
            return
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "closeNotifyReadTimeoutMillis: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " (expected: >= 0)"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    @java.lang.Deprecated
    public void setCloseNotifyTimeout(long r1, java.util.concurrent.TimeUnit r3) {
            r0 = this;
            r0.setCloseNotifyFlushTimeout(r1, r3)
            return
    }

    @java.lang.Deprecated
    public void setCloseNotifyTimeoutMillis(long r1) {
            r0 = this;
            r0.setCloseNotifyFlushTimeoutMillis(r1)
            return
    }

    public void setHandshakeTimeout(long r1, java.util.concurrent.TimeUnit r3) {
            r0 = this;
            if (r3 == 0) goto La
            long r1 = r3.toMillis(r1)
            r0.setHandshakeTimeoutMillis(r1)
            return
        La:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "unit"
            r1.<init>(r2)
            throw r1
    }

    public void setHandshakeTimeoutMillis(long r4) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L9
            r3.handshakeTimeoutMillis = r4
            return
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "handshakeTimeoutMillis: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " (expected: >= 0)"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public final void setWrapDataSize(int r1) {
            r0 = this;
            r0.wrapDataSize = r1
            return
    }

    public io.netty.util.concurrent.Future<io.netty.channel.Channel> sslCloseFuture() {
            r1 = this;
            io.netty.handler.ssl.SslHandler$LazyChannelPromise r0 = r1.sslClosePromise
            return r0
    }

    @Override // io.netty.channel.ChannelOutboundHandler
    public void write(io.netty.channel.ChannelHandlerContext r4, java.lang.Object r5, io.netty.channel.ChannelPromise r6) throws java.lang.Exception {
            r3 = this;
            boolean r4 = r5 instanceof io.netty.buffer.ByteBuf
            if (r4 != 0) goto L18
            io.netty.handler.codec.UnsupportedMessageTypeException r4 = new io.netty.handler.codec.UnsupportedMessageTypeException
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Class<io.netty.buffer.ByteBuf> r1 = io.netty.buffer.ByteBuf.class
            r2 = 0
            r0[r2] = r1
            r4.<init>(r5, r0)
            io.netty.util.ReferenceCountUtil.safeRelease(r5)
            r6.setFailure(r4)
            return
        L18:
            io.netty.handler.ssl.SslHandler$SslHandlerCoalescingBufferQueue r4 = r3.pendingUnencryptedWrites
            if (r4 != 0) goto L27
            io.netty.util.ReferenceCountUtil.safeRelease(r5)
            java.lang.IllegalStateException r4 = newPendingWritesNullException()
            r6.setFailure(r4)
            return
        L27:
            io.netty.buffer.ByteBuf r5 = (io.netty.buffer.ByteBuf) r5
            r4.add(r5, r6)
            return
    }
}
