package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class SniHandler extends io.netty.handler.ssl.AbstractSniHandler<io.netty.handler.ssl.SslContext> {
    private static final io.netty.handler.ssl.SniHandler.Selection EMPTY_SELECTION = null;
    protected final io.netty.util.AsyncMapping<java.lang.String, io.netty.handler.ssl.SslContext> mapping;
    private volatile io.netty.handler.ssl.SniHandler.Selection selection;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.ssl.SniHandler$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class AsyncMappingAdapter implements io.netty.util.AsyncMapping<java.lang.String, io.netty.handler.ssl.SslContext> {
        private final io.netty.util.Mapping<? super java.lang.String, ? extends io.netty.handler.ssl.SslContext> mapping;

        private AsyncMappingAdapter(io.netty.util.Mapping<? super java.lang.String, ? extends io.netty.handler.ssl.SslContext> r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "mapping"
                java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
                io.netty.util.Mapping r2 = (io.netty.util.Mapping) r2
                r1.mapping = r2
                return
        }

        /* synthetic */ AsyncMappingAdapter(io.netty.util.Mapping r1, io.netty.handler.ssl.SniHandler.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future map(java.lang.Object r1, io.netty.util.concurrent.Promise r2) {
                r0 = this;
                java.lang.String r1 = (java.lang.String) r1
                io.netty.util.concurrent.Future r1 = r0.map(r1, r2)
                return r1
        }

        public io.netty.util.concurrent.Future<io.netty.handler.ssl.SslContext> map(java.lang.String r2, io.netty.util.concurrent.Promise<io.netty.handler.ssl.SslContext> r3) {
                r1 = this;
                io.netty.util.Mapping<? super java.lang.String, ? extends io.netty.handler.ssl.SslContext> r0 = r1.mapping     // Catch: java.lang.Throwable -> Ld
                java.lang.Object r2 = r0.map(r2)     // Catch: java.lang.Throwable -> Ld
                io.netty.handler.ssl.SslContext r2 = (io.netty.handler.ssl.SslContext) r2     // Catch: java.lang.Throwable -> Ld
                io.netty.util.concurrent.Promise r2 = r3.setSuccess(r2)
                return r2
            Ld:
                r2 = move-exception
                io.netty.util.concurrent.Promise r2 = r3.setFailure(r2)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class Selection {
        final io.netty.handler.ssl.SslContext context;
        final java.lang.String hostname;

        Selection(io.netty.handler.ssl.SslContext r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.context = r1
                r0.hostname = r2
                return
        }
    }

    static {
            io.netty.handler.ssl.SniHandler$Selection r0 = new io.netty.handler.ssl.SniHandler$Selection
            r1 = 0
            r0.<init>(r1, r1)
            io.netty.handler.ssl.SniHandler.EMPTY_SELECTION = r0
            return
    }

    public SniHandler(io.netty.util.AsyncMapping<? super java.lang.String, ? extends io.netty.handler.ssl.SslContext> r2) {
            r1 = this;
            r1.<init>()
            io.netty.handler.ssl.SniHandler$Selection r0 = io.netty.handler.ssl.SniHandler.EMPTY_SELECTION
            r1.selection = r0
            java.lang.String r0 = "mapping"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.util.AsyncMapping r2 = (io.netty.util.AsyncMapping) r2
            r1.mapping = r2
            return
    }

    public SniHandler(io.netty.util.DomainNameMapping<? extends io.netty.handler.ssl.SslContext> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public SniHandler(io.netty.util.Mapping<? super java.lang.String, ? extends io.netty.handler.ssl.SslContext> r3) {
            r2 = this;
            io.netty.handler.ssl.SniHandler$AsyncMappingAdapter r0 = new io.netty.handler.ssl.SniHandler$AsyncMappingAdapter
            r1 = 0
            r0.<init>(r3, r1)
            r2.<init>(r0)
            return
    }

    public java.lang.String hostname() {
            r1 = this;
            io.netty.handler.ssl.SniHandler$Selection r0 = r1.selection
            java.lang.String r0 = r0.hostname
            return r0
    }

    @Override // io.netty.handler.ssl.AbstractSniHandler
    protected io.netty.util.concurrent.Future<io.netty.handler.ssl.SslContext> lookup(io.netty.channel.ChannelHandlerContext r2, java.lang.String r3) throws java.lang.Exception {
            r1 = this;
            io.netty.util.AsyncMapping<java.lang.String, io.netty.handler.ssl.SslContext> r0 = r1.mapping
            io.netty.util.concurrent.EventExecutor r2 = r2.executor()
            io.netty.util.concurrent.Promise r2 = r2.newPromise()
            io.netty.util.concurrent.Future r2 = r0.map(r3, r2)
            return r2
    }

    protected io.netty.handler.ssl.SslHandler newSslHandler(io.netty.handler.ssl.SslContext r1, io.netty.buffer.ByteBufAllocator r2) {
            r0 = this;
            io.netty.handler.ssl.SslHandler r1 = r1.newHandler(r2)
            return r1
    }

    @Override // io.netty.handler.ssl.AbstractSniHandler
    protected final void onLookupComplete(io.netty.channel.ChannelHandlerContext r3, java.lang.String r4, io.netty.util.concurrent.Future<io.netty.handler.ssl.SslContext> r5) throws java.lang.Exception {
            r2 = this;
            boolean r0 = r5.isSuccess()
            if (r0 != 0) goto L28
            java.lang.Throwable r3 = r5.cause()
            boolean r5 = r3 instanceof java.lang.Error
            if (r5 == 0) goto L11
            java.lang.Error r3 = (java.lang.Error) r3
            throw r3
        L11:
            io.netty.handler.codec.DecoderException r5 = new io.netty.handler.codec.DecoderException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "failed to get the SslContext for "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4, r3)
            throw r5
        L28:
            java.lang.Object r5 = r5.getNow()
            io.netty.handler.ssl.SslContext r5 = (io.netty.handler.ssl.SslContext) r5
            io.netty.handler.ssl.SniHandler$Selection r0 = new io.netty.handler.ssl.SniHandler$Selection
            r0.<init>(r5, r4)
            r2.selection = r0
            r2.replaceHandler(r3, r4, r5)     // Catch: java.lang.Throwable -> L39
            return
        L39:
            r3 = move-exception
            io.netty.handler.ssl.SniHandler$Selection r4 = io.netty.handler.ssl.SniHandler.EMPTY_SELECTION
            r2.selection = r4
            io.netty.util.internal.PlatformDependent.throwException(r3)
            return
    }

    protected void replaceHandler(io.netty.channel.ChannelHandlerContext r2, java.lang.String r3, io.netty.handler.ssl.SslContext r4) throws java.lang.Exception {
            r1 = this;
            r3 = 0
            io.netty.buffer.ByteBufAllocator r0 = r2.alloc()     // Catch: java.lang.Throwable -> L17
            io.netty.handler.ssl.SslHandler r3 = r1.newSslHandler(r4, r0)     // Catch: java.lang.Throwable -> L17
            io.netty.channel.ChannelPipeline r2 = r2.pipeline()     // Catch: java.lang.Throwable -> L17
            java.lang.Class<io.netty.handler.ssl.SslHandler> r4 = io.netty.handler.ssl.SslHandler.class
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L17
            r2.replace(r1, r4, r3)     // Catch: java.lang.Throwable -> L17
            return
        L17:
            r2 = move-exception
            if (r3 == 0) goto L21
            javax.net.ssl.SSLEngine r3 = r3.engine()
            io.netty.util.ReferenceCountUtil.safeRelease(r3)
        L21:
            throw r2
    }

    public io.netty.handler.ssl.SslContext sslContext() {
            r1 = this;
            io.netty.handler.ssl.SniHandler$Selection r0 = r1.selection
            io.netty.handler.ssl.SslContext r0 = r0.context
            return r0
    }
}
