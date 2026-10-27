package io.netty.handler.codec.redis;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ArrayRedisMessage extends io.netty.util.AbstractReferenceCounted implements io.netty.handler.codec.redis.RedisMessage {
    public static final io.netty.handler.codec.redis.ArrayRedisMessage EMPTY_INSTANCE = null;
    public static final io.netty.handler.codec.redis.ArrayRedisMessage NULL_INSTANCE = null;
    private final java.util.List<io.netty.handler.codec.redis.RedisMessage> children;



    static {
            io.netty.handler.codec.redis.ArrayRedisMessage$1 r0 = new io.netty.handler.codec.redis.ArrayRedisMessage$1
            r0.<init>()
            io.netty.handler.codec.redis.ArrayRedisMessage.NULL_INSTANCE = r0
            io.netty.handler.codec.redis.ArrayRedisMessage$2 r0 = new io.netty.handler.codec.redis.ArrayRedisMessage$2
            r0.<init>()
            io.netty.handler.codec.redis.ArrayRedisMessage.EMPTY_INSTANCE = r0
            return
    }

    private ArrayRedisMessage() {
            r1 = this;
            r1.<init>()
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            r1.children = r0
            return
    }

    /* synthetic */ ArrayRedisMessage(io.netty.handler.codec.redis.ArrayRedisMessage.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public ArrayRedisMessage(java.util.List<io.netty.handler.codec.redis.RedisMessage> r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "children"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            java.util.List r2 = (java.util.List) r2
            r1.children = r2
            return
    }

    public final java.util.List<io.netty.handler.codec.redis.RedisMessage> children() {
            r1 = this;
            java.util.List<io.netty.handler.codec.redis.RedisMessage> r0 = r1.children
            return r0
    }

    protected void deallocate() {
            r2 = this;
            java.util.List<io.netty.handler.codec.redis.RedisMessage> r0 = r2.children
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            io.netty.handler.codec.redis.RedisMessage r1 = (io.netty.handler.codec.redis.RedisMessage) r1
            io.netty.util.ReferenceCountUtil.release(r1)
            goto L6
        L16:
            return
    }

    public boolean isNull() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r2)
            r0.<init>(r1)
            r1 = 91
            r0.append(r1)
            java.lang.String r1 = "children="
            r0.append(r1)
            java.util.List<io.netty.handler.codec.redis.RedisMessage> r1 = r2.children
            int r1 = r1.size()
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public io.netty.handler.codec.redis.ArrayRedisMessage touch(java.lang.Object r2) {
            r1 = this;
            java.util.List<io.netty.handler.codec.redis.RedisMessage> r2 = r1.children
            java.util.Iterator r2 = r2.iterator()
        L6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L16
            java.lang.Object r0 = r2.next()
            io.netty.handler.codec.redis.RedisMessage r0 = (io.netty.handler.codec.redis.RedisMessage) r0
            io.netty.util.ReferenceCountUtil.touch(r0)
            goto L6
        L16:
            return r1
    }

    /* renamed from: touch, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo194touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.redis.ArrayRedisMessage r1 = r0.touch(r1)
            return r1
    }
}
