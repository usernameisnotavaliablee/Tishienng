package io.netty.handler.codec.redis;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class AbstractStringRedisMessage implements io.netty.handler.codec.redis.RedisMessage {
    private final java.lang.String content;

    AbstractStringRedisMessage(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "content"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            java.lang.String r2 = (java.lang.String) r2
            r1.content = r2
            return
    }

    public final java.lang.String content() {
            r1 = this;
            java.lang.String r0 = r1.content
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r2)
            r0.<init>(r1)
            r1 = 91
            r0.append(r1)
            java.lang.String r1 = "content="
            r0.append(r1)
            java.lang.String r1 = r2.content
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
