package io.netty.handler.codec.memcache.binary;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class BinaryMemcacheClientCodec extends io.netty.channel.CombinedChannelDuplexHandler<io.netty.handler.codec.memcache.binary.BinaryMemcacheResponseDecoder, io.netty.handler.codec.memcache.binary.BinaryMemcacheRequestEncoder> {
    private final boolean failOnMissingResponse;
    private final java.util.concurrent.atomic.AtomicLong requestResponseCounter;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.memcache.binary.BinaryMemcacheClientCodec$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class Decoder extends io.netty.handler.codec.memcache.binary.BinaryMemcacheResponseDecoder {
        final /* synthetic */ io.netty.handler.codec.memcache.binary.BinaryMemcacheClientCodec this$0;

        Decoder(io.netty.handler.codec.memcache.binary.BinaryMemcacheClientCodec r1, int r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        @Override // io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder, io.netty.handler.codec.ByteToMessageDecoder, io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
        public void channelInactive(io.netty.channel.ChannelHandlerContext r6) throws java.lang.Exception {
                r5 = this;
                super.channelInactive(r6)
                io.netty.handler.codec.memcache.binary.BinaryMemcacheClientCodec r0 = r5.this$0
                boolean r0 = io.netty.handler.codec.memcache.binary.BinaryMemcacheClientCodec.access$100(r0)
                if (r0 == 0) goto L39
                io.netty.handler.codec.memcache.binary.BinaryMemcacheClientCodec r0 = r5.this$0
                java.util.concurrent.atomic.AtomicLong r0 = io.netty.handler.codec.memcache.binary.BinaryMemcacheClientCodec.access$200(r0)
                long r0 = r0.get()
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 <= 0) goto L39
                io.netty.handler.codec.PrematureChannelClosureException r2 = new io.netty.handler.codec.PrematureChannelClosureException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "channel gone inactive with "
                r3.append(r4)
                r3.append(r0)
                java.lang.String r0 = " missing response(s)"
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                r2.<init>(r0)
                r6.fireExceptionCaught(r2)
            L39:
                return
        }

        @Override // io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder, io.netty.handler.codec.ByteToMessageDecoder
        protected void decode(io.netty.channel.ChannelHandlerContext r2, io.netty.buffer.ByteBuf r3, java.util.List<java.lang.Object> r4) throws java.lang.Exception {
                r1 = this;
                int r0 = r4.size()
                super.decode(r2, r3, r4)
                io.netty.handler.codec.memcache.binary.BinaryMemcacheClientCodec r2 = r1.this$0
                boolean r2 = io.netty.handler.codec.memcache.binary.BinaryMemcacheClientCodec.access$100(r2)
                if (r2 == 0) goto L29
                int r2 = r4.size()
            L13:
                if (r0 >= r2) goto L29
                java.lang.Object r3 = r4.get(r0)
                boolean r3 = r3 instanceof io.netty.handler.codec.memcache.LastMemcacheContent
                if (r3 == 0) goto L26
                io.netty.handler.codec.memcache.binary.BinaryMemcacheClientCodec r3 = r1.this$0
                java.util.concurrent.atomic.AtomicLong r3 = io.netty.handler.codec.memcache.binary.BinaryMemcacheClientCodec.access$200(r3)
                r3.decrementAndGet()
            L26:
                int r0 = r0 + 1
                goto L13
            L29:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class Encoder extends io.netty.handler.codec.memcache.binary.BinaryMemcacheRequestEncoder {
        final /* synthetic */ io.netty.handler.codec.memcache.binary.BinaryMemcacheClientCodec this$0;

        private Encoder(io.netty.handler.codec.memcache.binary.BinaryMemcacheClientCodec r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ Encoder(io.netty.handler.codec.memcache.binary.BinaryMemcacheClientCodec r1, io.netty.handler.codec.memcache.binary.BinaryMemcacheClientCodec.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // io.netty.handler.codec.memcache.AbstractMemcacheObjectEncoder, io.netty.handler.codec.MessageToMessageEncoder
        protected void encode(io.netty.channel.ChannelHandlerContext r1, java.lang.Object r2, java.util.List<java.lang.Object> r3) throws java.lang.Exception {
                r0 = this;
                super.encode(r1, r2, r3)
                io.netty.handler.codec.memcache.binary.BinaryMemcacheClientCodec r1 = r0.this$0
                boolean r1 = io.netty.handler.codec.memcache.binary.BinaryMemcacheClientCodec.access$100(r1)
                if (r1 == 0) goto L18
                boolean r1 = r2 instanceof io.netty.handler.codec.memcache.LastMemcacheContent
                if (r1 == 0) goto L18
                io.netty.handler.codec.memcache.binary.BinaryMemcacheClientCodec r1 = r0.this$0
                java.util.concurrent.atomic.AtomicLong r1 = io.netty.handler.codec.memcache.binary.BinaryMemcacheClientCodec.access$200(r1)
                r1.incrementAndGet()
            L18:
                return
        }
    }

    public BinaryMemcacheClientCodec() {
            r1 = this;
            r0 = 8192(0x2000, float:1.148E-41)
            r1.<init>(r0)
            return
    }

    public BinaryMemcacheClientCodec(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public BinaryMemcacheClientCodec(int r2, boolean r3) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            r1.requestResponseCounter = r0
            r1.failOnMissingResponse = r3
            io.netty.handler.codec.memcache.binary.BinaryMemcacheClientCodec$Decoder r3 = new io.netty.handler.codec.memcache.binary.BinaryMemcacheClientCodec$Decoder
            r3.<init>(r1, r2)
            io.netty.handler.codec.memcache.binary.BinaryMemcacheClientCodec$Encoder r2 = new io.netty.handler.codec.memcache.binary.BinaryMemcacheClientCodec$Encoder
            r0 = 0
            r2.<init>(r1, r0)
            r1.init(r3, r2)
            return
    }

    static /* synthetic */ boolean access$100(io.netty.handler.codec.memcache.binary.BinaryMemcacheClientCodec r0) {
            boolean r0 = r0.failOnMissingResponse
            return r0
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicLong access$200(io.netty.handler.codec.memcache.binary.BinaryMemcacheClientCodec r0) {
            java.util.concurrent.atomic.AtomicLong r0 = r0.requestResponseCounter
            return r0
    }
}
