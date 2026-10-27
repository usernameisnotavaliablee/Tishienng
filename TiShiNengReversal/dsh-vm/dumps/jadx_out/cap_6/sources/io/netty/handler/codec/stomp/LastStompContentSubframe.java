package io.netty.handler.codec.stomp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface LastStompContentSubframe extends io.netty.handler.codec.stomp.StompContentSubframe {
    public static final io.netty.handler.codec.stomp.LastStompContentSubframe EMPTY_LAST_CONTENT = null;


    static {
            io.netty.handler.codec.stomp.LastStompContentSubframe$1 r0 = new io.netty.handler.codec.stomp.LastStompContentSubframe$1
            r0.<init>()
            io.netty.handler.codec.stomp.LastStompContentSubframe.EMPTY_LAST_CONTENT = r0
            return
    }

    @Override // io.netty.handler.codec.stomp.StompContentSubframe, io.netty.buffer.ByteBufHolder
    io.netty.handler.codec.stomp.LastStompContentSubframe copy();

    @Override // io.netty.handler.codec.stomp.StompContentSubframe, io.netty.buffer.ByteBufHolder
    io.netty.handler.codec.stomp.LastStompContentSubframe duplicate();

    @Override // io.netty.handler.codec.stomp.StompContentSubframe, io.netty.buffer.ByteBufHolder
    io.netty.handler.codec.stomp.LastStompContentSubframe replace(io.netty.buffer.ByteBuf r1);

    @Override // io.netty.handler.codec.stomp.StompContentSubframe, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    io.netty.handler.codec.stomp.LastStompContentSubframe mo39retain();

    @Override // io.netty.handler.codec.stomp.StompContentSubframe, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    io.netty.handler.codec.stomp.LastStompContentSubframe mo40retain(int r1);

    @Override // io.netty.handler.codec.stomp.StompContentSubframe, io.netty.buffer.ByteBufHolder
    io.netty.handler.codec.stomp.LastStompContentSubframe retainedDuplicate();

    @Override // io.netty.handler.codec.stomp.StompContentSubframe, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    io.netty.handler.codec.stomp.LastStompContentSubframe mo41touch();

    @Override // io.netty.handler.codec.stomp.StompContentSubframe, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    io.netty.handler.codec.stomp.LastStompContentSubframe mo42touch(java.lang.Object r1);
}
