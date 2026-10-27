package io.netty.handler.codec.redis;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface RedisMessagePool {
    byte[] getByteBufOfInteger(long r1);

    io.netty.handler.codec.redis.ErrorRedisMessage getError(io.netty.buffer.ByteBuf r1);

    io.netty.handler.codec.redis.ErrorRedisMessage getError(java.lang.String r1);

    io.netty.handler.codec.redis.IntegerRedisMessage getInteger(long r1);

    io.netty.handler.codec.redis.IntegerRedisMessage getInteger(io.netty.buffer.ByteBuf r1);

    io.netty.handler.codec.redis.SimpleStringRedisMessage getSimpleString(io.netty.buffer.ByteBuf r1);

    io.netty.handler.codec.redis.SimpleStringRedisMessage getSimpleString(java.lang.String r1);
}
