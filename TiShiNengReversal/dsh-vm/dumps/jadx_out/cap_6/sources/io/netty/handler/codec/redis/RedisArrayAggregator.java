package io.netty.handler.codec.redis;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class RedisArrayAggregator extends io.netty.handler.codec.MessageToMessageDecoder<io.netty.handler.codec.redis.RedisMessage> {
    private final java.util.Deque<io.netty.handler.codec.redis.RedisArrayAggregator.AggregateState> depths;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class AggregateState {
        private final java.util.List<io.netty.handler.codec.redis.RedisMessage> children;
        private final int length;

        AggregateState(int r2) {
                r1 = this;
                r1.<init>()
                r1.length = r2
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r2)
                r1.children = r0
                return
        }

        static /* synthetic */ java.util.List access$000(io.netty.handler.codec.redis.RedisArrayAggregator.AggregateState r0) {
                java.util.List<io.netty.handler.codec.redis.RedisMessage> r0 = r0.children
                return r0
        }

        static /* synthetic */ int access$100(io.netty.handler.codec.redis.RedisArrayAggregator.AggregateState r0) {
                int r0 = r0.length
                return r0
        }
    }

    public RedisArrayAggregator() {
            r2 = this;
            r2.<init>()
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r1 = 4
            r0.<init>(r1)
            r2.depths = r0
            return
    }

    private io.netty.handler.codec.redis.RedisMessage decodeRedisArrayHeader(io.netty.handler.codec.redis.ArrayHeaderRedisMessage r6) {
            r5 = this;
            boolean r0 = r6.isNull()
            if (r0 == 0) goto L9
            io.netty.handler.codec.redis.ArrayRedisMessage r6 = io.netty.handler.codec.redis.ArrayRedisMessage.NULL_INSTANCE
            return r6
        L9:
            long r0 = r6.length()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L16
            io.netty.handler.codec.redis.ArrayRedisMessage r6 = io.netty.handler.codec.redis.ArrayRedisMessage.EMPTY_INSTANCE
            return r6
        L16:
            long r0 = r6.length()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L42
            long r0 = r6.length()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L3a
            java.util.Deque<io.netty.handler.codec.redis.RedisArrayAggregator$AggregateState> r0 = r5.depths
            io.netty.handler.codec.redis.RedisArrayAggregator$AggregateState r1 = new io.netty.handler.codec.redis.RedisArrayAggregator$AggregateState
            long r2 = r6.length()
            int r6 = (int) r2
            r1.<init>(r6)
            r0.push(r1)
            r6 = 0
            return r6
        L3a:
            io.netty.handler.codec.CodecException r6 = new io.netty.handler.codec.CodecException
            java.lang.String r0 = "this codec doesn't support longer length than 2147483647"
            r6.<init>(r0)
            throw r6
        L42:
            io.netty.handler.codec.CodecException r0 = new io.netty.handler.codec.CodecException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "bad length: "
            r1.append(r2)
            long r2 = r6.length()
            r1.append(r2)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
    }

    /* renamed from: decode, reason: avoid collision after fix types in other method */
    protected void decode2(io.netty.channel.ChannelHandlerContext r2, io.netty.handler.codec.redis.RedisMessage r3, java.util.List<java.lang.Object> r4) throws java.lang.Exception {
            r1 = this;
            boolean r2 = r3 instanceof io.netty.handler.codec.redis.ArrayHeaderRedisMessage
            if (r2 == 0) goto Ld
            io.netty.handler.codec.redis.ArrayHeaderRedisMessage r3 = (io.netty.handler.codec.redis.ArrayHeaderRedisMessage) r3
            io.netty.handler.codec.redis.RedisMessage r3 = r1.decodeRedisArrayHeader(r3)
            if (r3 != 0) goto L10
            goto L44
        Ld:
            io.netty.util.ReferenceCountUtil.retain(r3)
        L10:
            java.util.Deque<io.netty.handler.codec.redis.RedisArrayAggregator$AggregateState> r2 = r1.depths
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L45
            java.util.Deque<io.netty.handler.codec.redis.RedisArrayAggregator$AggregateState> r2 = r1.depths
            java.lang.Object r2 = r2.peek()
            io.netty.handler.codec.redis.RedisArrayAggregator$AggregateState r2 = (io.netty.handler.codec.redis.RedisArrayAggregator.AggregateState) r2
            java.util.List r0 = io.netty.handler.codec.redis.RedisArrayAggregator.AggregateState.access$000(r2)
            r0.add(r3)
            java.util.List r3 = io.netty.handler.codec.redis.RedisArrayAggregator.AggregateState.access$000(r2)
            int r3 = r3.size()
            int r0 = io.netty.handler.codec.redis.RedisArrayAggregator.AggregateState.access$100(r2)
            if (r3 != r0) goto L44
            io.netty.handler.codec.redis.ArrayRedisMessage r3 = new io.netty.handler.codec.redis.ArrayRedisMessage
            java.util.List r2 = io.netty.handler.codec.redis.RedisArrayAggregator.AggregateState.access$000(r2)
            r3.<init>(r2)
            java.util.Deque<io.netty.handler.codec.redis.RedisArrayAggregator$AggregateState> r2 = r1.depths
            r2.pop()
            goto L10
        L44:
            return
        L45:
            r4.add(r3)
            return
    }

    @Override // io.netty.handler.codec.MessageToMessageDecoder
    protected /* bridge */ /* synthetic */ void decode(io.netty.channel.ChannelHandlerContext r1, io.netty.handler.codec.redis.RedisMessage r2, java.util.List r3) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.redis.RedisMessage r2 = (io.netty.handler.codec.redis.RedisMessage) r2
            r0.decode2(r1, r2, r3)
            return
    }
}
