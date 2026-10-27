package io.netty.handler.codec.redis;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class BulkStringHeaderRedisMessage implements io.netty.handler.codec.redis.RedisMessage {
    private final int bulkStringLength;

    public BulkStringHeaderRedisMessage(int r4) {
            r3 = this;
            r3.<init>()
            if (r4 <= 0) goto L8
            r3.bulkStringLength = r4
            return
        L8:
            io.netty.handler.codec.redis.RedisCodecException r0 = new io.netty.handler.codec.redis.RedisCodecException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "bulkStringLength: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " (expected: > 0)"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public final int bulkStringLength() {
            r1 = this;
            int r0 = r1.bulkStringLength
            return r0
    }

    public boolean isNull() {
            r2 = this;
            int r0 = r2.bulkStringLength
            r1 = -1
            if (r0 != r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }
}
