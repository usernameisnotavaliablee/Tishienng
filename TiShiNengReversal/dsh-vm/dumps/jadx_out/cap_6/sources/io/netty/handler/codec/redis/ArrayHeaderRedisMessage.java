package io.netty.handler.codec.redis;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ArrayHeaderRedisMessage implements io.netty.handler.codec.redis.RedisMessage {
    private final long length;

    public ArrayHeaderRedisMessage(long r4) {
            r3 = this;
            r3.<init>()
            r0 = -1
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto Lc
            r3.length = r4
            return
        Lc:
            io.netty.handler.codec.redis.RedisCodecException r0 = new io.netty.handler.codec.redis.RedisCodecException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "length: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " (expected: >= "
            r1.append(r4)
            r4 = -1
            r1.append(r4)
            java.lang.String r4 = ")"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public boolean isNull() {
            r5 = this;
            long r0 = r5.length
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public final long length() {
            r2 = this;
            long r0 = r2.length
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r3)
            r0.<init>(r1)
            r1 = 91
            r0.append(r1)
            java.lang.String r1 = "length="
            r0.append(r1)
            long r1 = r3.length
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
