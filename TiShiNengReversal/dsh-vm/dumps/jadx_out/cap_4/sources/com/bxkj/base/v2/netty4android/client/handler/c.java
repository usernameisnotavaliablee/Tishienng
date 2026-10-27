package com.bxkj.base.v2.netty4android.client.handler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class c extends io.netty.handler.codec.MessageToByteEncoder<com.bxkj.base.v2.netty4android.client.command.a> {

    @org.jetbrains.annotations.NotNull
    private final java.nio.charset.Charset a;

    public c() {
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r0, r1, r0)
            return
    }

    public c(@org.jetbrains.annotations.Nullable java.nio.charset.Charset r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L8
            r1.a = r2
            return
        L8:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "charset"
            r2.<init>(r0)
            throw r2
    }

    public /* synthetic */ c(java.nio.charset.Charset r1, int r2, kotlin.jvm.internal.v r3) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L8
            java.nio.charset.Charset r1 = java.nio.charset.Charset.defaultCharset()
        L8:
            r0.<init>(r1)
            return
    }

    protected void a(@org.jetbrains.annotations.NotNull io.netty.channel.ChannelHandlerContext r4, @org.jetbrains.annotations.NotNull com.bxkj.base.v2.netty4android.client.command.a r5, @org.jetbrains.annotations.NotNull io.netty.buffer.ByteBuf r6) throws java.lang.Exception {
            r3 = this;
            java.lang.String r0 = "ctx"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r4 = "msg"
            kotlin.jvm.internal.g0.p(r5, r4)
            java.lang.String r4 = "out"
            kotlin.jvm.internal.g0.p(r6, r4)
            java.lang.String r4 = "客户端发送数据："
            r5.d(r4)
            r4 = 2
            byte[] r0 = new byte[r4]
            r0 = {x006c: FILL_ARRAY_DATA , data: [-52, -52} // fill-array
            r6.writeBytes(r0)
            byte r0 = r5.a()
            r6.writeByte(r0)
            int r0 = r5.c()
            r6.writeShort(r0)
            java.lang.String r0 = r5.b()
            java.nio.charset.Charset r1 = kotlin.text.e.b
            byte[] r0 = r0.getBytes(r1)
            java.lang.String r1 = "getBytes(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            r6.writeBytes(r0)
            byte[] r4 = new byte[r4]
            r4 = {x0072: FILL_ARRAY_DATA , data: [-52, -52} // fill-array
            a0.a r1 = a0.a.a
            byte r2 = r5.a()
            byte[] r2 = r1.e(r2)
            byte[] r4 = kotlin.collections.n.g3(r4, r2)
            int r5 = r5.c()
            short r5 = (short) r5
            byte[] r5 = r1.f(r5)
            byte[] r4 = kotlin.collections.n.g3(r4, r5)
            byte[] r4 = kotlin.collections.n.g3(r4, r0)
            com.bxkj.base.v2.netty4android.client.handler.a$a r5 = com.bxkj.base.v2.netty4android.client.handler.a.a
            int r4 = r5.a(r4)
            r6.writeShort(r4)
            return
    }

    public /* bridge */ /* synthetic */ void encode(io.netty.channel.ChannelHandlerContext r1, java.lang.Object r2, io.netty.buffer.ByteBuf r3) {
            r0 = this;
            com.bxkj.base.v2.netty4android.client.command.a r2 = (com.bxkj.base.v2.netty4android.client.command.a) r2
            r0.a(r1, r2, r3)
            return
    }
}
