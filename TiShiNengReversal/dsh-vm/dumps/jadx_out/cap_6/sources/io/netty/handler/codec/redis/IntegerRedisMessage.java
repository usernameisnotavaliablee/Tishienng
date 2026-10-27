package io.netty.handler.codec.redis;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class IntegerRedisMessage implements io.netty.handler.codec.redis.RedisMessage {
    private final long value;

    public IntegerRedisMessage(long r1) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r3)
            r0.<init>(r1)
            r1 = 91
            r0.append(r1)
            java.lang.String r1 = "value="
            r0.append(r1)
            long r1 = r3.value
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public long value() {
            r2 = this;
            long r0 = r2.value
            return r0
    }
}
