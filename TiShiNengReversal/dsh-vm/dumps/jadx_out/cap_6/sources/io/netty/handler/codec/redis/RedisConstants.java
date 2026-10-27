package io.netty.handler.codec.redis;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class RedisConstants {
    static final int EOL_LENGTH = 2;
    static final short EOL_SHORT = 0;
    static final int LONG_MAX_LENGTH = 20;
    static final int NULL_LENGTH = 2;
    static final short NULL_SHORT = 0;
    static final int NULL_VALUE = -1;
    static final int POSITIVE_LONG_MAX_LENGTH = 19;
    static final int REDIS_INLINE_MESSAGE_MAX_LENGTH = 65536;
    static final int REDIS_MESSAGE_MAX_LENGTH = 536870912;
    static final int TYPE_LENGTH = 1;

    static {
            r0 = 45
            r1 = 49
            short r0 = io.netty.handler.codec.redis.RedisCodecUtil.makeShort(r0, r1)
            io.netty.handler.codec.redis.RedisConstants.NULL_SHORT = r0
            r0 = 13
            r1 = 10
            short r0 = io.netty.handler.codec.redis.RedisCodecUtil.makeShort(r0, r1)
            io.netty.handler.codec.redis.RedisConstants.EOL_SHORT = r0
            return
    }

    private RedisConstants() {
            r0 = this;
            r0.<init>()
            return
    }
}
