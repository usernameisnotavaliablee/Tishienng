package io.netty.handler.codec.redis;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class RedisBulkStringAggregator extends io.netty.handler.codec.MessageAggregator<io.netty.handler.codec.redis.RedisMessage, io.netty.handler.codec.redis.BulkStringHeaderRedisMessage, io.netty.handler.codec.redis.BulkStringRedisContent, io.netty.handler.codec.redis.FullBulkStringRedisMessage> {
    public RedisBulkStringAggregator() {
            r1 = this;
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r1.<init>(r0)
            return
    }

    @Override // io.netty.handler.codec.MessageAggregator
    protected /* bridge */ /* synthetic */ io.netty.handler.codec.redis.FullBulkStringRedisMessage beginAggregation(io.netty.handler.codec.redis.BulkStringHeaderRedisMessage r1, io.netty.buffer.ByteBuf r2) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.redis.BulkStringHeaderRedisMessage r1 = (io.netty.handler.codec.redis.BulkStringHeaderRedisMessage) r1
            io.netty.handler.codec.redis.FullBulkStringRedisMessage r1 = r0.beginAggregation2(r1, r2)
            return r1
    }

    /* renamed from: beginAggregation, reason: avoid collision after fix types in other method */
    protected io.netty.handler.codec.redis.FullBulkStringRedisMessage beginAggregation2(io.netty.handler.codec.redis.BulkStringHeaderRedisMessage r1, io.netty.buffer.ByteBuf r2) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.redis.FullBulkStringRedisMessage r1 = new io.netty.handler.codec.redis.FullBulkStringRedisMessage
            r1.<init>(r2)
            return r1
    }

    @Override // io.netty.handler.codec.MessageAggregator
    protected boolean closeAfterContinueResponse(java.lang.Object r1) throws java.lang.Exception {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.handler.codec.MessageAggregator
    protected boolean ignoreContentAfterContinueResponse(java.lang.Object r1) throws java.lang.Exception {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    /* renamed from: isAggregated, reason: avoid collision after fix types in other method */
    protected boolean isAggregated2(io.netty.handler.codec.redis.RedisMessage r1) throws java.lang.Exception {
            r0 = this;
            boolean r1 = r1 instanceof io.netty.handler.codec.redis.FullBulkStringRedisMessage
            return r1
    }

    @Override // io.netty.handler.codec.MessageAggregator
    protected /* bridge */ /* synthetic */ boolean isAggregated(io.netty.handler.codec.redis.RedisMessage r1) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.redis.RedisMessage r1 = (io.netty.handler.codec.redis.RedisMessage) r1
            boolean r1 = r0.isAggregated2(r1)
            return r1
    }

    /* renamed from: isContentLengthInvalid, reason: avoid collision after fix types in other method */
    protected boolean isContentLengthInvalid2(io.netty.handler.codec.redis.BulkStringHeaderRedisMessage r1, int r2) throws java.lang.Exception {
            r0 = this;
            int r1 = r1.bulkStringLength()
            if (r1 <= r2) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    @Override // io.netty.handler.codec.MessageAggregator
    protected /* bridge */ /* synthetic */ boolean isContentLengthInvalid(io.netty.handler.codec.redis.BulkStringHeaderRedisMessage r1, int r2) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.redis.BulkStringHeaderRedisMessage r1 = (io.netty.handler.codec.redis.BulkStringHeaderRedisMessage) r1
            boolean r1 = r0.isContentLengthInvalid2(r1, r2)
            return r1
    }

    /* renamed from: isContentMessage, reason: avoid collision after fix types in other method */
    protected boolean isContentMessage2(io.netty.handler.codec.redis.RedisMessage r1) throws java.lang.Exception {
            r0 = this;
            boolean r1 = r1 instanceof io.netty.handler.codec.redis.BulkStringRedisContent
            return r1
    }

    @Override // io.netty.handler.codec.MessageAggregator
    protected /* bridge */ /* synthetic */ boolean isContentMessage(io.netty.handler.codec.redis.RedisMessage r1) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.redis.RedisMessage r1 = (io.netty.handler.codec.redis.RedisMessage) r1
            boolean r1 = r0.isContentMessage2(r1)
            return r1
    }

    @Override // io.netty.handler.codec.MessageAggregator
    protected /* bridge */ /* synthetic */ boolean isLastContentMessage(io.netty.handler.codec.redis.BulkStringRedisContent r1) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.redis.BulkStringRedisContent r1 = (io.netty.handler.codec.redis.BulkStringRedisContent) r1
            boolean r1 = r0.isLastContentMessage2(r1)
            return r1
    }

    /* renamed from: isLastContentMessage, reason: avoid collision after fix types in other method */
    protected boolean isLastContentMessage2(io.netty.handler.codec.redis.BulkStringRedisContent r1) throws java.lang.Exception {
            r0 = this;
            boolean r1 = r1 instanceof io.netty.handler.codec.redis.LastBulkStringRedisContent
            return r1
    }

    /* renamed from: isStartMessage, reason: avoid collision after fix types in other method */
    protected boolean isStartMessage2(io.netty.handler.codec.redis.RedisMessage r2) throws java.lang.Exception {
            r1 = this;
            boolean r0 = r2 instanceof io.netty.handler.codec.redis.BulkStringHeaderRedisMessage
            if (r0 == 0) goto Lc
            boolean r2 = r1.isAggregated2(r2)
            if (r2 != 0) goto Lc
            r2 = 1
            return r2
        Lc:
            r2 = 0
            return r2
    }

    @Override // io.netty.handler.codec.MessageAggregator
    protected /* bridge */ /* synthetic */ boolean isStartMessage(io.netty.handler.codec.redis.RedisMessage r1) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.redis.RedisMessage r1 = (io.netty.handler.codec.redis.RedisMessage) r1
            boolean r1 = r0.isStartMessage2(r1)
            return r1
    }

    /* renamed from: newContinueResponse, reason: avoid collision after fix types in other method */
    protected java.lang.Object newContinueResponse2(io.netty.handler.codec.redis.BulkStringHeaderRedisMessage r1, int r2, io.netty.channel.ChannelPipeline r3) throws java.lang.Exception {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // io.netty.handler.codec.MessageAggregator
    protected /* bridge */ /* synthetic */ java.lang.Object newContinueResponse(io.netty.handler.codec.redis.BulkStringHeaderRedisMessage r1, int r2, io.netty.channel.ChannelPipeline r3) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.redis.BulkStringHeaderRedisMessage r1 = (io.netty.handler.codec.redis.BulkStringHeaderRedisMessage) r1
            java.lang.Object r1 = r0.newContinueResponse2(r1, r2, r3)
            return r1
    }
}
