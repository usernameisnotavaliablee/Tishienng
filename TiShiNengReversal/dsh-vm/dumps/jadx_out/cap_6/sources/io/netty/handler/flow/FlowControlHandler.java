package io.netty.handler.flow;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class FlowControlHandler extends io.netty.channel.ChannelDuplexHandler {
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private io.netty.channel.ChannelConfig config;
    private io.netty.handler.flow.FlowControlHandler.RecyclableArrayDeque queue;
    private final boolean releaseMessages;
    private boolean shouldConsume;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.flow.FlowControlHandler$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class RecyclableArrayDeque extends java.util.ArrayDeque<java.lang.Object> {
        private static final int DEFAULT_NUM_ELEMENTS = 2;
        private static final io.netty.util.Recycler<io.netty.handler.flow.FlowControlHandler.RecyclableArrayDeque> RECYCLER = null;
        private static final long serialVersionUID = 0;
        private final io.netty.util.Recycler.Handle<io.netty.handler.flow.FlowControlHandler.RecyclableArrayDeque> handle;


        static {
                io.netty.handler.flow.FlowControlHandler$RecyclableArrayDeque$1 r0 = new io.netty.handler.flow.FlowControlHandler$RecyclableArrayDeque$1
                r0.<init>()
                io.netty.handler.flow.FlowControlHandler.RecyclableArrayDeque.RECYCLER = r0
                return
        }

        private RecyclableArrayDeque(int r1, io.netty.util.Recycler.Handle<io.netty.handler.flow.FlowControlHandler.RecyclableArrayDeque> r2) {
                r0 = this;
                r0.<init>(r1)
                r0.handle = r2
                return
        }

        /* synthetic */ RecyclableArrayDeque(int r1, io.netty.util.Recycler.Handle r2, io.netty.handler.flow.FlowControlHandler.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.netty.handler.flow.FlowControlHandler.RecyclableArrayDeque newInstance() {
                io.netty.util.Recycler<io.netty.handler.flow.FlowControlHandler$RecyclableArrayDeque> r0 = io.netty.handler.flow.FlowControlHandler.RecyclableArrayDeque.RECYCLER
                java.lang.Object r0 = r0.get()
                io.netty.handler.flow.FlowControlHandler$RecyclableArrayDeque r0 = (io.netty.handler.flow.FlowControlHandler.RecyclableArrayDeque) r0
                return r0
        }

        public void recycle() {
                r1 = this;
                r1.clear()
                io.netty.util.Recycler$Handle<io.netty.handler.flow.FlowControlHandler$RecyclableArrayDeque> r0 = r1.handle
                r0.recycle(r1)
                return
        }
    }

    static {
            java.lang.Class<io.netty.handler.flow.FlowControlHandler> r0 = io.netty.handler.flow.FlowControlHandler.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.handler.flow.FlowControlHandler.logger = r0
            return
    }

    public FlowControlHandler() {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            return
    }

    public FlowControlHandler(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.releaseMessages = r1
            return
    }

    private int dequeue(io.netty.channel.ChannelHandlerContext r3, int r4) {
            r2 = this;
            r0 = 0
        L1:
            io.netty.handler.flow.FlowControlHandler$RecyclableArrayDeque r1 = r2.queue
            if (r1 == 0) goto L1e
            if (r0 < r4) goto Lf
            io.netty.channel.ChannelConfig r1 = r2.config
            boolean r1 = r1.isAutoRead()
            if (r1 == 0) goto L1e
        Lf:
            io.netty.handler.flow.FlowControlHandler$RecyclableArrayDeque r1 = r2.queue
            java.lang.Object r1 = r1.poll()
            if (r1 != 0) goto L18
            goto L1e
        L18:
            int r0 = r0 + 1
            r3.fireChannelRead(r1)
            goto L1
        L1e:
            io.netty.handler.flow.FlowControlHandler$RecyclableArrayDeque r4 = r2.queue
            if (r4 == 0) goto L35
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L35
            io.netty.handler.flow.FlowControlHandler$RecyclableArrayDeque r4 = r2.queue
            r4.recycle()
            r4 = 0
            r2.queue = r4
            if (r0 <= 0) goto L35
            r3.fireChannelReadComplete()
        L35:
            return r0
    }

    private void destroy() {
            r3 = this;
            io.netty.handler.flow.FlowControlHandler$RecyclableArrayDeque r0 = r3.queue
            if (r0 == 0) goto L2b
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L23
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.handler.flow.FlowControlHandler.logger
            java.lang.String r1 = "Non-empty queue: {}"
            io.netty.handler.flow.FlowControlHandler$RecyclableArrayDeque r2 = r3.queue
            r0.trace(r1, r2)
            boolean r0 = r3.releaseMessages
            if (r0 == 0) goto L23
        L17:
            io.netty.handler.flow.FlowControlHandler$RecyclableArrayDeque r0 = r3.queue
            java.lang.Object r0 = r0.poll()
            if (r0 == 0) goto L23
            io.netty.util.ReferenceCountUtil.safeRelease(r0)
            goto L17
        L23:
            io.netty.handler.flow.FlowControlHandler$RecyclableArrayDeque r0 = r3.queue
            r0.recycle()
            r0 = 0
            r3.queue = r0
        L2b:
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelInactive(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            r0.destroy()
            r1.fireChannelInactive()
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelRead(io.netty.channel.ChannelHandlerContext r2, java.lang.Object r3) throws java.lang.Exception {
            r1 = this;
            io.netty.handler.flow.FlowControlHandler$RecyclableArrayDeque r0 = r1.queue
            if (r0 != 0) goto La
            io.netty.handler.flow.FlowControlHandler$RecyclableArrayDeque r0 = io.netty.handler.flow.FlowControlHandler.RecyclableArrayDeque.newInstance()
            r1.queue = r0
        La:
            io.netty.handler.flow.FlowControlHandler$RecyclableArrayDeque r0 = r1.queue
            r0.offer(r3)
            boolean r3 = r1.shouldConsume
            r0 = 0
            r1.shouldConsume = r0
            r1.dequeue(r2, r3)
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelReadComplete(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            return
    }

    @Override // io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler
    public void handlerAdded(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            io.netty.channel.Channel r1 = r1.channel()
            io.netty.channel.ChannelConfig r1 = r1.config()
            r0.config = r1
            return
    }

    boolean isQueueEmpty() {
            r1 = this;
            io.netty.handler.flow.FlowControlHandler$RecyclableArrayDeque r0 = r1.queue
            if (r0 == 0) goto Ld
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            return r0
        Ld:
            r0 = 1
            return r0
    }

    @Override // io.netty.channel.ChannelDuplexHandler, io.netty.channel.ChannelOutboundHandler
    public void read(io.netty.channel.ChannelHandlerContext r3) throws java.lang.Exception {
            r2 = this;
            r0 = 1
            int r1 = r2.dequeue(r3, r0)
            if (r1 != 0) goto Lc
            r2.shouldConsume = r0
            r3.read()
        Lc:
            return
    }
}
