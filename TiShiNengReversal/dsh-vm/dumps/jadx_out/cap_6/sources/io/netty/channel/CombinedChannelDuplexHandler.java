package io.netty.channel;

import io.netty.channel.ChannelInboundHandler;
import io.netty.channel.ChannelOutboundHandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class CombinedChannelDuplexHandler<I extends io.netty.channel.ChannelInboundHandler, O extends io.netty.channel.ChannelOutboundHandler> extends io.netty.channel.ChannelDuplexHandler {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private volatile boolean handlerAdded;
    private io.netty.channel.CombinedChannelDuplexHandler.DelegatingChannelHandlerContext inboundCtx;
    private I inboundHandler;
    private io.netty.channel.CombinedChannelDuplexHandler.DelegatingChannelHandlerContext outboundCtx;
    private O outboundHandler;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class DelegatingChannelHandlerContext implements io.netty.channel.ChannelHandlerContext {
        private final io.netty.channel.ChannelHandlerContext ctx;
        private final io.netty.channel.ChannelHandler handler;
        boolean removed;


        DelegatingChannelHandlerContext(io.netty.channel.ChannelHandlerContext r1, io.netty.channel.ChannelHandler r2) {
                r0 = this;
                r0.<init>()
                r0.ctx = r1
                r0.handler = r2
                return
        }

        static /* synthetic */ io.netty.channel.ChannelHandlerContext access$300(io.netty.channel.CombinedChannelDuplexHandler.DelegatingChannelHandlerContext r0) {
                io.netty.channel.ChannelHandlerContext r0 = r0.ctx
                return r0
        }

        static /* synthetic */ void access$400(io.netty.channel.CombinedChannelDuplexHandler.DelegatingChannelHandlerContext r0) {
                r0.remove0()
                return
        }

        private void remove0() {
                r4 = this;
                boolean r0 = r4.removed
                if (r0 != 0) goto L31
                r0 = 1
                r4.removed = r0
                io.netty.channel.ChannelHandler r0 = r4.handler     // Catch: java.lang.Throwable -> Ld
                r0.handlerRemoved(r4)     // Catch: java.lang.Throwable -> Ld
                return
            Ld:
                r0 = move-exception
                io.netty.channel.ChannelPipelineException r1 = new io.netty.channel.ChannelPipelineException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                io.netty.channel.ChannelHandler r3 = r4.handler
                java.lang.Class r3 = r3.getClass()
                java.lang.String r3 = r3.getName()
                r2.append(r3)
                java.lang.String r3 = ".handlerRemoved() has thrown an exception."
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2, r0)
                r4.fireExceptionCaught(r1)
            L31:
                return
        }

        @Override // io.netty.channel.ChannelHandlerContext
        public io.netty.buffer.ByteBufAllocator alloc() {
                r1 = this;
                io.netty.channel.ChannelHandlerContext r0 = r1.ctx
                io.netty.buffer.ByteBufAllocator r0 = r0.alloc()
                return r0
        }

        @Override // io.netty.channel.ChannelHandlerContext
        public <T> io.netty.util.Attribute<T> attr(io.netty.util.AttributeKey<T> r2) {
                r1 = this;
                io.netty.channel.ChannelHandlerContext r0 = r1.ctx
                io.netty.channel.Channel r0 = r0.channel()
                io.netty.util.Attribute r2 = r0.attr(r2)
                return r2
        }

        @Override // io.netty.channel.ChannelOutboundInvoker
        public io.netty.channel.ChannelFuture bind(java.net.SocketAddress r2) {
                r1 = this;
                io.netty.channel.ChannelHandlerContext r0 = r1.ctx
                io.netty.channel.ChannelFuture r2 = r0.bind(r2)
                return r2
        }

        @Override // io.netty.channel.ChannelOutboundInvoker
        public io.netty.channel.ChannelFuture bind(java.net.SocketAddress r2, io.netty.channel.ChannelPromise r3) {
                r1 = this;
                io.netty.channel.ChannelHandlerContext r0 = r1.ctx
                io.netty.channel.ChannelFuture r2 = r0.bind(r2, r3)
                return r2
        }

        @Override // io.netty.channel.ChannelHandlerContext
        public io.netty.channel.Channel channel() {
                r1 = this;
                io.netty.channel.ChannelHandlerContext r0 = r1.ctx
                io.netty.channel.Channel r0 = r0.channel()
                return r0
        }

        @Override // io.netty.channel.ChannelOutboundInvoker
        public io.netty.channel.ChannelFuture close() {
                r1 = this;
                io.netty.channel.ChannelHandlerContext r0 = r1.ctx
                io.netty.channel.ChannelFuture r0 = r0.close()
                return r0
        }

        @Override // io.netty.channel.ChannelOutboundInvoker
        public io.netty.channel.ChannelFuture close(io.netty.channel.ChannelPromise r2) {
                r1 = this;
                io.netty.channel.ChannelHandlerContext r0 = r1.ctx
                io.netty.channel.ChannelFuture r2 = r0.close(r2)
                return r2
        }

        @Override // io.netty.channel.ChannelOutboundInvoker
        public io.netty.channel.ChannelFuture connect(java.net.SocketAddress r2) {
                r1 = this;
                io.netty.channel.ChannelHandlerContext r0 = r1.ctx
                io.netty.channel.ChannelFuture r2 = r0.connect(r2)
                return r2
        }

        @Override // io.netty.channel.ChannelOutboundInvoker
        public io.netty.channel.ChannelFuture connect(java.net.SocketAddress r2, io.netty.channel.ChannelPromise r3) {
                r1 = this;
                io.netty.channel.ChannelHandlerContext r0 = r1.ctx
                io.netty.channel.ChannelFuture r2 = r0.connect(r2, r3)
                return r2
        }

        @Override // io.netty.channel.ChannelOutboundInvoker
        public io.netty.channel.ChannelFuture connect(java.net.SocketAddress r2, java.net.SocketAddress r3) {
                r1 = this;
                io.netty.channel.ChannelHandlerContext r0 = r1.ctx
                io.netty.channel.ChannelFuture r2 = r0.connect(r2, r3)
                return r2
        }

        @Override // io.netty.channel.ChannelOutboundInvoker
        public io.netty.channel.ChannelFuture connect(java.net.SocketAddress r2, java.net.SocketAddress r3, io.netty.channel.ChannelPromise r4) {
                r1 = this;
                io.netty.channel.ChannelHandlerContext r0 = r1.ctx
                io.netty.channel.ChannelFuture r2 = r0.connect(r2, r3, r4)
                return r2
        }

        @Override // io.netty.channel.ChannelOutboundInvoker
        public io.netty.channel.ChannelFuture deregister() {
                r1 = this;
                io.netty.channel.ChannelHandlerContext r0 = r1.ctx
                io.netty.channel.ChannelFuture r0 = r0.deregister()
                return r0
        }

        @Override // io.netty.channel.ChannelOutboundInvoker
        public io.netty.channel.ChannelFuture deregister(io.netty.channel.ChannelPromise r2) {
                r1 = this;
                io.netty.channel.ChannelHandlerContext r0 = r1.ctx
                io.netty.channel.ChannelFuture r2 = r0.deregister(r2)
                return r2
        }

        @Override // io.netty.channel.ChannelOutboundInvoker
        public io.netty.channel.ChannelFuture disconnect() {
                r1 = this;
                io.netty.channel.ChannelHandlerContext r0 = r1.ctx
                io.netty.channel.ChannelFuture r0 = r0.disconnect()
                return r0
        }

        @Override // io.netty.channel.ChannelOutboundInvoker
        public io.netty.channel.ChannelFuture disconnect(io.netty.channel.ChannelPromise r2) {
                r1 = this;
                io.netty.channel.ChannelHandlerContext r0 = r1.ctx
                io.netty.channel.ChannelFuture r2 = r0.disconnect(r2)
                return r2
        }

        @Override // io.netty.channel.ChannelHandlerContext
        public io.netty.util.concurrent.EventExecutor executor() {
                r1 = this;
                io.netty.channel.ChannelHandlerContext r0 = r1.ctx
                io.netty.util.concurrent.EventExecutor r0 = r0.executor()
                return r0
        }

        @Override // io.netty.channel.ChannelHandlerContext, io.netty.channel.ChannelInboundInvoker
        public io.netty.channel.ChannelHandlerContext fireChannelActive() {
                r1 = this;
                io.netty.channel.ChannelHandlerContext r0 = r1.ctx
                r0.fireChannelActive()
                return r1
        }

        @Override // io.netty.channel.ChannelInboundInvoker
        public /* bridge */ /* synthetic */ io.netty.channel.ChannelInboundInvoker fireChannelActive() {
                r1 = this;
                io.netty.channel.ChannelHandlerContext r0 = r1.fireChannelActive()
                return r0
        }

        @Override // io.netty.channel.ChannelHandlerContext, io.netty.channel.ChannelInboundInvoker
        public io.netty.channel.ChannelHandlerContext fireChannelInactive() {
                r1 = this;
                io.netty.channel.ChannelHandlerContext r0 = r1.ctx
                r0.fireChannelInactive()
                return r1
        }

        @Override // io.netty.channel.ChannelInboundInvoker
        public /* bridge */ /* synthetic */ io.netty.channel.ChannelInboundInvoker fireChannelInactive() {
                r1 = this;
                io.netty.channel.ChannelHandlerContext r0 = r1.fireChannelInactive()
                return r0
        }

        @Override // io.netty.channel.ChannelHandlerContext, io.netty.channel.ChannelInboundInvoker
        public io.netty.channel.ChannelHandlerContext fireChannelRead(java.lang.Object r2) {
                r1 = this;
                io.netty.channel.ChannelHandlerContext r0 = r1.ctx
                r0.fireChannelRead(r2)
                return r1
        }

        @Override // io.netty.channel.ChannelInboundInvoker
        public /* bridge */ /* synthetic */ io.netty.channel.ChannelInboundInvoker fireChannelRead(java.lang.Object r1) {
                r0 = this;
                io.netty.channel.ChannelHandlerContext r1 = r0.fireChannelRead(r1)
                return r1
        }

        @Override // io.netty.channel.ChannelHandlerContext, io.netty.channel.ChannelInboundInvoker
        public io.netty.channel.ChannelHandlerContext fireChannelReadComplete() {
                r1 = this;
                io.netty.channel.ChannelHandlerContext r0 = r1.ctx
                r0.fireChannelReadComplete()
                return r1
        }

        @Override // io.netty.channel.ChannelInboundInvoker
        public /* bridge */ /* synthetic */ io.netty.channel.ChannelInboundInvoker fireChannelReadComplete() {
                r1 = this;
                io.netty.channel.ChannelHandlerContext r0 = r1.fireChannelReadComplete()
                return r0
        }

        @Override // io.netty.channel.ChannelHandlerContext, io.netty.channel.ChannelInboundInvoker
        public io.netty.channel.ChannelHandlerContext fireChannelRegistered() {
                r1 = this;
                io.netty.channel.ChannelHandlerContext r0 = r1.ctx
                r0.fireChannelRegistered()
                return r1
        }

        @Override // io.netty.channel.ChannelInboundInvoker
        public /* bridge */ /* synthetic */ io.netty.channel.ChannelInboundInvoker fireChannelRegistered() {
                r1 = this;
                io.netty.channel.ChannelHandlerContext r0 = r1.fireChannelRegistered()
                return r0
        }

        @Override // io.netty.channel.ChannelHandlerContext, io.netty.channel.ChannelInboundInvoker
        public io.netty.channel.ChannelHandlerContext fireChannelUnregistered() {
                r1 = this;
                io.netty.channel.ChannelHandlerContext r0 = r1.ctx
                r0.fireChannelUnregistered()
                return r1
        }

        @Override // io.netty.channel.ChannelInboundInvoker
        public /* bridge */ /* synthetic */ io.netty.channel.ChannelInboundInvoker fireChannelUnregistered() {
                r1 = this;
                io.netty.channel.ChannelHandlerContext r0 = r1.fireChannelUnregistered()
                return r0
        }

        @Override // io.netty.channel.ChannelHandlerContext, io.netty.channel.ChannelInboundInvoker
        public io.netty.channel.ChannelHandlerContext fireChannelWritabilityChanged() {
                r1 = this;
                io.netty.channel.ChannelHandlerContext r0 = r1.ctx
                r0.fireChannelWritabilityChanged()
                return r1
        }

        @Override // io.netty.channel.ChannelInboundInvoker
        public /* bridge */ /* synthetic */ io.netty.channel.ChannelInboundInvoker fireChannelWritabilityChanged() {
                r1 = this;
                io.netty.channel.ChannelHandlerContext r0 = r1.fireChannelWritabilityChanged()
                return r0
        }

        @Override // io.netty.channel.ChannelHandlerContext, io.netty.channel.ChannelInboundInvoker
        public io.netty.channel.ChannelHandlerContext fireExceptionCaught(java.lang.Throwable r2) {
                r1 = this;
                io.netty.channel.ChannelHandlerContext r0 = r1.ctx
                r0.fireExceptionCaught(r2)
                return r1
        }

        public /* bridge */ /* synthetic */ io.netty.channel.ChannelInboundInvoker fireExceptionCaught(java.lang.Throwable r1) {
                r0 = this;
                io.netty.channel.ChannelHandlerContext r1 = r0.fireExceptionCaught(r1)
                return r1
        }

        @Override // io.netty.channel.ChannelHandlerContext, io.netty.channel.ChannelInboundInvoker
        public io.netty.channel.ChannelHandlerContext fireUserEventTriggered(java.lang.Object r2) {
                r1 = this;
                io.netty.channel.ChannelHandlerContext r0 = r1.ctx
                r0.fireUserEventTriggered(r2)
                return r1
        }

        @Override // io.netty.channel.ChannelInboundInvoker
        public /* bridge */ /* synthetic */ io.netty.channel.ChannelInboundInvoker fireUserEventTriggered(java.lang.Object r1) {
                r0 = this;
                io.netty.channel.ChannelHandlerContext r1 = r0.fireUserEventTriggered(r1)
                return r1
        }

        @Override // io.netty.channel.ChannelHandlerContext, io.netty.channel.ChannelOutboundInvoker
        public io.netty.channel.ChannelHandlerContext flush() {
                r1 = this;
                io.netty.channel.ChannelHandlerContext r0 = r1.ctx
                r0.flush()
                return r1
        }

        @Override // io.netty.channel.ChannelOutboundInvoker
        public /* bridge */ /* synthetic */ io.netty.channel.ChannelOutboundInvoker flush() {
                r1 = this;
                io.netty.channel.ChannelHandlerContext r0 = r1.flush()
                return r0
        }

        @Override // io.netty.channel.ChannelHandlerContext
        public io.netty.channel.ChannelHandler handler() {
                r1 = this;
                io.netty.channel.ChannelHandlerContext r0 = r1.ctx
                io.netty.channel.ChannelHandler r0 = r0.handler()
                return r0
        }

        @Override // io.netty.channel.ChannelHandlerContext
        public <T> boolean hasAttr(io.netty.util.AttributeKey<T> r2) {
                r1 = this;
                io.netty.channel.ChannelHandlerContext r0 = r1.ctx
                io.netty.channel.Channel r0 = r0.channel()
                boolean r2 = r0.hasAttr(r2)
                return r2
        }

        @Override // io.netty.channel.ChannelHandlerContext
        public boolean isRemoved() {
                r1 = this;
                boolean r0 = r1.removed
                if (r0 != 0) goto Lf
                io.netty.channel.ChannelHandlerContext r0 = r1.ctx
                boolean r0 = r0.isRemoved()
                if (r0 == 0) goto Ld
                goto Lf
            Ld:
                r0 = 0
                return r0
            Lf:
                r0 = 1
                return r0
        }

        @Override // io.netty.channel.ChannelHandlerContext
        public java.lang.String name() {
                r1 = this;
                io.netty.channel.ChannelHandlerContext r0 = r1.ctx
                java.lang.String r0 = r0.name()
                return r0
        }

        @Override // io.netty.channel.ChannelOutboundInvoker
        public io.netty.channel.ChannelFuture newFailedFuture(java.lang.Throwable r2) {
                r1 = this;
                io.netty.channel.ChannelHandlerContext r0 = r1.ctx
                io.netty.channel.ChannelFuture r2 = r0.newFailedFuture(r2)
                return r2
        }

        @Override // io.netty.channel.ChannelOutboundInvoker
        public io.netty.channel.ChannelProgressivePromise newProgressivePromise() {
                r1 = this;
                io.netty.channel.ChannelHandlerContext r0 = r1.ctx
                io.netty.channel.ChannelProgressivePromise r0 = r0.newProgressivePromise()
                return r0
        }

        @Override // io.netty.channel.ChannelOutboundInvoker
        public io.netty.channel.ChannelPromise newPromise() {
                r1 = this;
                io.netty.channel.ChannelHandlerContext r0 = r1.ctx
                io.netty.channel.ChannelPromise r0 = r0.newPromise()
                return r0
        }

        @Override // io.netty.channel.ChannelOutboundInvoker
        public io.netty.channel.ChannelFuture newSucceededFuture() {
                r1 = this;
                io.netty.channel.ChannelHandlerContext r0 = r1.ctx
                io.netty.channel.ChannelFuture r0 = r0.newSucceededFuture()
                return r0
        }

        @Override // io.netty.channel.ChannelHandlerContext
        public io.netty.channel.ChannelPipeline pipeline() {
                r1 = this;
                io.netty.channel.ChannelHandlerContext r0 = r1.ctx
                io.netty.channel.ChannelPipeline r0 = r0.pipeline()
                return r0
        }

        @Override // io.netty.channel.ChannelHandlerContext, io.netty.channel.ChannelOutboundInvoker
        public io.netty.channel.ChannelHandlerContext read() {
                r1 = this;
                io.netty.channel.ChannelHandlerContext r0 = r1.ctx
                r0.read()
                return r1
        }

        @Override // io.netty.channel.ChannelOutboundInvoker
        public /* bridge */ /* synthetic */ io.netty.channel.ChannelOutboundInvoker read() {
                r1 = this;
                io.netty.channel.ChannelHandlerContext r0 = r1.read()
                return r0
        }

        final void remove() {
                r2 = this;
                io.netty.util.concurrent.EventExecutor r0 = r2.executor()
                boolean r1 = r0.inEventLoop()
                if (r1 == 0) goto Le
                r2.remove0()
                return
            Le:
                io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext$1 r1 = new io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext$1
                r1.<init>(r2)
                r0.execute(r1)
                return
        }

        @Override // io.netty.channel.ChannelOutboundInvoker
        public io.netty.channel.ChannelPromise voidPromise() {
                r1 = this;
                io.netty.channel.ChannelHandlerContext r0 = r1.ctx
                io.netty.channel.ChannelPromise r0 = r0.voidPromise()
                return r0
        }

        @Override // io.netty.channel.ChannelOutboundInvoker
        public io.netty.channel.ChannelFuture write(java.lang.Object r2) {
                r1 = this;
                io.netty.channel.ChannelHandlerContext r0 = r1.ctx
                io.netty.channel.ChannelFuture r2 = r0.write(r2)
                return r2
        }

        @Override // io.netty.channel.ChannelOutboundInvoker
        public io.netty.channel.ChannelFuture write(java.lang.Object r2, io.netty.channel.ChannelPromise r3) {
                r1 = this;
                io.netty.channel.ChannelHandlerContext r0 = r1.ctx
                io.netty.channel.ChannelFuture r2 = r0.write(r2, r3)
                return r2
        }

        @Override // io.netty.channel.ChannelOutboundInvoker
        public io.netty.channel.ChannelFuture writeAndFlush(java.lang.Object r2) {
                r1 = this;
                io.netty.channel.ChannelHandlerContext r0 = r1.ctx
                io.netty.channel.ChannelFuture r2 = r0.writeAndFlush(r2)
                return r2
        }

        @Override // io.netty.channel.ChannelOutboundInvoker
        public io.netty.channel.ChannelFuture writeAndFlush(java.lang.Object r2, io.netty.channel.ChannelPromise r3) {
                r1 = this;
                io.netty.channel.ChannelHandlerContext r0 = r1.ctx
                io.netty.channel.ChannelFuture r2 = r0.writeAndFlush(r2, r3)
                return r2
        }
    }

    static {
            java.lang.Class<io.netty.channel.CombinedChannelDuplexHandler> r0 = io.netty.channel.CombinedChannelDuplexHandler.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.channel.CombinedChannelDuplexHandler.logger = r0
            return
    }

    protected CombinedChannelDuplexHandler() {
            r0 = this;
            r0.<init>()
            r0.ensureNotSharable()
            return
    }

    public CombinedChannelDuplexHandler(I r1, O r2) {
            r0 = this;
            r0.<init>()
            r0.ensureNotSharable()
            r0.init(r1, r2)
            return
    }

    static /* synthetic */ io.netty.channel.CombinedChannelDuplexHandler.DelegatingChannelHandlerContext access$000(io.netty.channel.CombinedChannelDuplexHandler r0) {
            io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext r0 = r0.outboundCtx
            return r0
    }

    static /* synthetic */ io.netty.channel.ChannelOutboundHandler access$100(io.netty.channel.CombinedChannelDuplexHandler r0) {
            O extends io.netty.channel.ChannelOutboundHandler r0 = r0.outboundHandler
            return r0
    }

    static /* synthetic */ io.netty.util.internal.logging.InternalLogger access$200() {
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.channel.CombinedChannelDuplexHandler.logger
            return r0
    }

    private void checkAdded() {
            r2 = this;
            boolean r0 = r2.handlerAdded
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "handler not added to pipeline yet"
            r0.<init>(r1)
            throw r0
    }

    private void validate(I r3, O r4) {
            r2 = this;
            I extends io.netty.channel.ChannelInboundHandler r0 = r2.inboundHandler
            if (r0 != 0) goto L63
            if (r3 == 0) goto L5b
            if (r4 == 0) goto L53
            boolean r3 = r3 instanceof io.netty.channel.ChannelOutboundHandler
            java.lang.String r0 = " to get combined."
            if (r3 != 0) goto L33
            boolean r3 = r4 instanceof io.netty.channel.ChannelInboundHandler
            if (r3 != 0) goto L13
            return
        L13:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "outboundHandler must not implement "
            r4.append(r1)
            java.lang.Class<io.netty.channel.ChannelInboundHandler> r1 = io.netty.channel.ChannelInboundHandler.class
            java.lang.String r1 = r1.getSimpleName()
            r4.append(r1)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L33:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "inboundHandler must not implement "
            r4.append(r1)
            java.lang.Class<io.netty.channel.ChannelOutboundHandler> r1 = io.netty.channel.ChannelOutboundHandler.class
            java.lang.String r1 = r1.getSimpleName()
            r4.append(r1)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L53:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "outboundHandler"
            r3.<init>(r4)
            throw r3
        L5b:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "inboundHandler"
            r3.<init>(r4)
            throw r3
        L63:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "init() can not be invoked if "
            r4.append(r0)
            java.lang.Class<io.netty.channel.CombinedChannelDuplexHandler> r0 = io.netty.channel.CombinedChannelDuplexHandler.class
            java.lang.String r0 = r0.getSimpleName()
            r4.append(r0)
            java.lang.String r0 = " was constructed with non-default constructor."
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    @Override // io.netty.channel.ChannelDuplexHandler, io.netty.channel.ChannelOutboundHandler
    public void bind(io.netty.channel.ChannelHandlerContext r2, java.net.SocketAddress r3, io.netty.channel.ChannelPromise r4) throws java.lang.Exception {
            r1 = this;
            io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext r2 = r1.outboundCtx
            boolean r0 = r2.removed
            if (r0 != 0) goto Lc
            O extends io.netty.channel.ChannelOutboundHandler r0 = r1.outboundHandler
            r0.bind(r2, r3, r4)
            return
        Lc:
            r2.bind(r3, r4)
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelActive(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext r2 = r1.inboundCtx
            boolean r0 = r2.removed
            if (r0 != 0) goto Lc
            I extends io.netty.channel.ChannelInboundHandler r0 = r1.inboundHandler
            r0.channelActive(r2)
            return
        Lc:
            r2.fireChannelActive()
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelInactive(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext r2 = r1.inboundCtx
            boolean r0 = r2.removed
            if (r0 != 0) goto Lc
            I extends io.netty.channel.ChannelInboundHandler r0 = r1.inboundHandler
            r0.channelInactive(r2)
            return
        Lc:
            r2.fireChannelInactive()
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelRead(io.netty.channel.ChannelHandlerContext r2, java.lang.Object r3) throws java.lang.Exception {
            r1 = this;
            io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext r2 = r1.inboundCtx
            boolean r0 = r2.removed
            if (r0 != 0) goto Lc
            I extends io.netty.channel.ChannelInboundHandler r0 = r1.inboundHandler
            r0.channelRead(r2, r3)
            return
        Lc:
            r2.fireChannelRead(r3)
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelReadComplete(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext r2 = r1.inboundCtx
            boolean r0 = r2.removed
            if (r0 != 0) goto Lc
            I extends io.netty.channel.ChannelInboundHandler r0 = r1.inboundHandler
            r0.channelReadComplete(r2)
            return
        Lc:
            r2.fireChannelReadComplete()
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelRegistered(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext r2 = r1.inboundCtx
            boolean r0 = r2.removed
            if (r0 != 0) goto Lc
            I extends io.netty.channel.ChannelInboundHandler r0 = r1.inboundHandler
            r0.channelRegistered(r2)
            return
        Lc:
            r2.fireChannelRegistered()
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelUnregistered(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext r2 = r1.inboundCtx
            boolean r0 = r2.removed
            if (r0 != 0) goto Lc
            I extends io.netty.channel.ChannelInboundHandler r0 = r1.inboundHandler
            r0.channelUnregistered(r2)
            return
        Lc:
            r2.fireChannelUnregistered()
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelWritabilityChanged(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext r2 = r1.inboundCtx
            boolean r0 = r2.removed
            if (r0 != 0) goto Lc
            I extends io.netty.channel.ChannelInboundHandler r0 = r1.inboundHandler
            r0.channelWritabilityChanged(r2)
            return
        Lc:
            r2.fireChannelWritabilityChanged()
            return
    }

    @Override // io.netty.channel.ChannelDuplexHandler, io.netty.channel.ChannelOutboundHandler
    public void close(io.netty.channel.ChannelHandlerContext r2, io.netty.channel.ChannelPromise r3) throws java.lang.Exception {
            r1 = this;
            io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext r2 = r1.outboundCtx
            boolean r0 = r2.removed
            if (r0 != 0) goto Lc
            O extends io.netty.channel.ChannelOutboundHandler r0 = r1.outboundHandler
            r0.close(r2, r3)
            return
        Lc:
            r2.close(r3)
            return
    }

    @Override // io.netty.channel.ChannelDuplexHandler, io.netty.channel.ChannelOutboundHandler
    public void connect(io.netty.channel.ChannelHandlerContext r2, java.net.SocketAddress r3, java.net.SocketAddress r4, io.netty.channel.ChannelPromise r5) throws java.lang.Exception {
            r1 = this;
            io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext r2 = r1.outboundCtx
            boolean r0 = r2.removed
            if (r0 != 0) goto Lc
            O extends io.netty.channel.ChannelOutboundHandler r0 = r1.outboundHandler
            r0.connect(r2, r3, r4, r5)
            return
        Lc:
            r2.connect(r4, r5)
            return
    }

    @Override // io.netty.channel.ChannelDuplexHandler, io.netty.channel.ChannelOutboundHandler
    public void deregister(io.netty.channel.ChannelHandlerContext r2, io.netty.channel.ChannelPromise r3) throws java.lang.Exception {
            r1 = this;
            io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext r2 = r1.outboundCtx
            boolean r0 = r2.removed
            if (r0 != 0) goto Lc
            O extends io.netty.channel.ChannelOutboundHandler r0 = r1.outboundHandler
            r0.deregister(r2, r3)
            return
        Lc:
            r2.deregister(r3)
            return
    }

    @Override // io.netty.channel.ChannelDuplexHandler, io.netty.channel.ChannelOutboundHandler
    public void disconnect(io.netty.channel.ChannelHandlerContext r2, io.netty.channel.ChannelPromise r3) throws java.lang.Exception {
            r1 = this;
            io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext r2 = r1.outboundCtx
            boolean r0 = r2.removed
            if (r0 != 0) goto Lc
            O extends io.netty.channel.ChannelOutboundHandler r0 = r1.outboundHandler
            r0.disconnect(r2, r3)
            return
        Lc:
            r2.disconnect(r3)
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler, io.netty.channel.ChannelInboundHandler
    public void exceptionCaught(io.netty.channel.ChannelHandlerContext r2, java.lang.Throwable r3) throws java.lang.Exception {
            r1 = this;
            io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext r2 = r1.inboundCtx
            boolean r0 = r2.removed
            if (r0 != 0) goto Lc
            I extends io.netty.channel.ChannelInboundHandler r0 = r1.inboundHandler
            r0.exceptionCaught(r2, r3)
            return
        Lc:
            r2.fireExceptionCaught(r3)
            return
    }

    @Override // io.netty.channel.ChannelDuplexHandler, io.netty.channel.ChannelOutboundHandler
    public void flush(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext r2 = r1.outboundCtx
            boolean r0 = r2.removed
            if (r0 != 0) goto Lc
            O extends io.netty.channel.ChannelOutboundHandler r0 = r1.outboundHandler
            r0.flush(r2)
            return
        Lc:
            r2.flush()
            return
    }

    @Override // io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler
    public void handlerAdded(io.netty.channel.ChannelHandlerContext r3) throws java.lang.Exception {
            r2 = this;
            I extends io.netty.channel.ChannelInboundHandler r0 = r2.inboundHandler
            if (r0 == 0) goto L31
            io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext r0 = new io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext
            O extends io.netty.channel.ChannelOutboundHandler r1 = r2.outboundHandler
            r0.<init>(r3, r1)
            r2.outboundCtx = r0
            io.netty.channel.CombinedChannelDuplexHandler$1 r0 = new io.netty.channel.CombinedChannelDuplexHandler$1
            I extends io.netty.channel.ChannelInboundHandler r1 = r2.inboundHandler
            r0.<init>(r2, r3, r1)
            r2.inboundCtx = r0
            r3 = 1
            r2.handlerAdded = r3
            I extends io.netty.channel.ChannelInboundHandler r3 = r2.inboundHandler     // Catch: java.lang.Throwable -> L28
            io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext r0 = r2.inboundCtx     // Catch: java.lang.Throwable -> L28
            r3.handlerAdded(r0)     // Catch: java.lang.Throwable -> L28
            O extends io.netty.channel.ChannelOutboundHandler r3 = r2.outboundHandler
            io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext r0 = r2.outboundCtx
            r3.handlerAdded(r0)
            return
        L28:
            r3 = move-exception
            O extends io.netty.channel.ChannelOutboundHandler r0 = r2.outboundHandler
            io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext r1 = r2.outboundCtx
            r0.handlerAdded(r1)
            throw r3
        L31:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "init() must be invoked before being added to a "
            r0.append(r1)
            java.lang.Class<io.netty.channel.ChannelPipeline> r1 = io.netty.channel.ChannelPipeline.class
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = " if "
            r0.append(r1)
            java.lang.Class<io.netty.channel.CombinedChannelDuplexHandler> r1 = io.netty.channel.CombinedChannelDuplexHandler.class
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = " was constructed with the default constructor."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    @Override // io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler
    public void handlerRemoved(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext r2 = r1.inboundCtx     // Catch: java.lang.Throwable -> Lb
            r2.remove()     // Catch: java.lang.Throwable -> Lb
            io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext r2 = r1.outboundCtx
            r2.remove()
            return
        Lb:
            r2 = move-exception
            io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext r0 = r1.outboundCtx
            r0.remove()
            throw r2
    }

    protected final I inboundHandler() {
            r1 = this;
            I extends io.netty.channel.ChannelInboundHandler r0 = r1.inboundHandler
            return r0
    }

    protected final void init(I r1, O r2) {
            r0 = this;
            r0.validate(r1, r2)
            r0.inboundHandler = r1
            r0.outboundHandler = r2
            return
    }

    protected final O outboundHandler() {
            r1 = this;
            O extends io.netty.channel.ChannelOutboundHandler r0 = r1.outboundHandler
            return r0
    }

    @Override // io.netty.channel.ChannelDuplexHandler, io.netty.channel.ChannelOutboundHandler
    public void read(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext r2 = r1.outboundCtx
            boolean r0 = r2.removed
            if (r0 != 0) goto Lc
            O extends io.netty.channel.ChannelOutboundHandler r0 = r1.outboundHandler
            r0.read(r2)
            return
        Lc:
            r2.read()
            return
    }

    public final void removeInboundHandler() {
            r1 = this;
            r1.checkAdded()
            io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext r0 = r1.inboundCtx
            r0.remove()
            return
    }

    public final void removeOutboundHandler() {
            r1 = this;
            r1.checkAdded()
            io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext r0 = r1.outboundCtx
            r0.remove()
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void userEventTriggered(io.netty.channel.ChannelHandlerContext r2, java.lang.Object r3) throws java.lang.Exception {
            r1 = this;
            io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext r2 = r1.inboundCtx
            boolean r0 = r2.removed
            if (r0 != 0) goto Lc
            I extends io.netty.channel.ChannelInboundHandler r0 = r1.inboundHandler
            r0.userEventTriggered(r2, r3)
            return
        Lc:
            r2.fireUserEventTriggered(r3)
            return
    }

    @Override // io.netty.channel.ChannelDuplexHandler, io.netty.channel.ChannelOutboundHandler
    public void write(io.netty.channel.ChannelHandlerContext r2, java.lang.Object r3, io.netty.channel.ChannelPromise r4) throws java.lang.Exception {
            r1 = this;
            io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext r2 = r1.outboundCtx
            boolean r0 = r2.removed
            if (r0 != 0) goto Lc
            O extends io.netty.channel.ChannelOutboundHandler r0 = r1.outboundHandler
            r0.write(r2, r3, r4)
            return
        Lc:
            r2.write(r3, r4)
            return
    }
}
