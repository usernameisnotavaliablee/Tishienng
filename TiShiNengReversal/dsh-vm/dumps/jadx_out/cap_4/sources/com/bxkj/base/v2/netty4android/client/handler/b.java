package com.bxkj.base.v2.netty4android.client.handler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class b extends io.netty.handler.codec.MessageToMessageDecoder<io.netty.buffer.ByteBuf> {

    @org.jetbrains.annotations.NotNull
    private final java.nio.charset.Charset a;

    @org.jetbrains.annotations.NotNull
    private java.lang.String b;

    @org.jetbrains.annotations.Nullable
    private io.netty.buffer.ByteBuf c;
    private int d;

    public b() {
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r0, r1, r0)
            return
    }

    public b(@org.jetbrains.annotations.Nullable java.nio.charset.Charset r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.b = r0
            if (r2 == 0) goto Lc
            r1.a = r2
            return
        Lc:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "charset"
            r2.<init>(r0)
            throw r2
    }

    public /* synthetic */ b(java.nio.charset.Charset r1, int r2, kotlin.jvm.internal.v r3) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L8
            java.nio.charset.Charset r1 = java.nio.charset.Charset.defaultCharset()
        L8:
            r0.<init>(r1)
            return
    }

    private final void a(io.netty.buffer.ByteBuf r6, int r7, io.netty.channel.ChannelHandlerContext r8, java.util.List<java.lang.Object> r9) {
            r5 = this;
            io.netty.buffer.ByteBuf r0 = r6.copy()
            r6.readShort()
            byte r1 = r6.readByte()
            short r2 = r6.readShort()
            r5.d = r2
            int r3 = r2 + 7
            r4 = 0
            if (r7 >= r3) goto L3c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "断包allLength="
            r6.append(r8)
            r6.append(r7)
            java.lang.String r7 = " length="
            r6.append(r7)
            r6.append(r2)
            java.lang.String r7 = " 长度不够等待下次数据到来"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.Object[] r7 = new java.lang.Object[r4]
            com.orhanobut.logger.j.d(r6, r7)
            r5.c = r0
            return
        L3c:
            byte[] r7 = new byte[r2]
            r6.readBytes(r7)
            short r6 = r6.readShort()
            r0 = 2
            byte[] r0 = new byte[r0]
            r0 = {x0088: FILL_ARRAY_DATA , data: [-52, -52} // fill-array
            a0.a r2 = a0.a.a
            byte[] r3 = r2.e(r1)
            byte[] r0 = kotlin.collections.n.g3(r0, r3)
            int r3 = r5.d
            short r3 = (short) r3
            byte[] r2 = r2.f(r3)
            byte[] r0 = kotlin.collections.n.g3(r0, r2)
            byte[] r0 = kotlin.collections.n.g3(r0, r7)
            com.bxkj.base.v2.netty4android.client.handler.a$a r2 = com.bxkj.base.v2.netty4android.client.handler.a.a
            int r0 = r2.a(r0)
            if (r6 == r0) goto L76
            java.lang.String r6 = "校验位异常"
            java.lang.Object[] r0 = new java.lang.Object[r4]
            com.orhanobut.logger.j.e(r6, r0)
            r8.close()
        L76:
            java.lang.String r6 = new java.lang.String
            java.nio.charset.Charset r8 = kotlin.text.e.b
            r6.<init>(r7, r8)
            com.bxkj.base.v2.netty4android.client.command.a r7 = new com.bxkj.base.v2.netty4android.client.command.a
            int r8 = r5.d
            r7.<init>(r1, r8, r6)
            r9.add(r7)
            return
    }

    protected void decode(@org.jetbrains.annotations.NotNull io.netty.channel.ChannelHandlerContext r7, @org.jetbrains.annotations.NotNull io.netty.buffer.ByteBuf r8, @org.jetbrains.annotations.NotNull java.util.List<java.lang.Object> r9) throws java.lang.Exception {
            r6 = this;
            java.lang.String r0 = "ctx"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "msg"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "out"
            kotlin.jvm.internal.g0.p(r9, r0)
            int r0 = r8.readableBytes()
            r1 = 0
            io.netty.buffer.ByteBuf r2 = r6.c     // Catch: java.lang.Exception -> L6d
            if (r2 == 0) goto L69
            kotlin.jvm.internal.g0.m(r2)     // Catch: java.lang.Exception -> L6d
            int r2 = r2.readableBytes()     // Catch: java.lang.Exception -> L6d
            int r3 = r6.d     // Catch: java.lang.Exception -> L6d
            int r3 = r3 + 7
            int r2 = r3 - r2
            int r2 = java.lang.Math.min(r0, r2)     // Catch: java.lang.Exception -> L6d
            io.netty.buffer.ByteBuf r2 = r8.readBytes(r2)     // Catch: java.lang.Exception -> L6d
            io.netty.buffer.ByteBuf r4 = r6.c     // Catch: java.lang.Exception -> L6d
            r5 = 2
            io.netty.buffer.ByteBuf[] r5 = new io.netty.buffer.ByteBuf[r5]     // Catch: java.lang.Exception -> L6d
            r5[r1] = r4     // Catch: java.lang.Exception -> L6d
            r4 = 1
            r5[r4] = r2     // Catch: java.lang.Exception -> L6d
            io.netty.buffer.ByteBuf r2 = io.netty.buffer.Unpooled.wrappedBuffer(r5)     // Catch: java.lang.Exception -> L6d
            r6.c = r2     // Catch: java.lang.Exception -> L6d
            kotlin.jvm.internal.g0.m(r2)     // Catch: java.lang.Exception -> L6d
            int r2 = r2.readableBytes()     // Catch: java.lang.Exception -> L6d
            if (r2 != r3) goto L68
            a0.a r2 = a0.a.a     // Catch: java.lang.Exception -> L6d
            io.netty.buffer.ByteBuf r4 = r6.c     // Catch: java.lang.Exception -> L6d
            kotlin.jvm.internal.g0.m(r4)     // Catch: java.lang.Exception -> L6d
            io.netty.buffer.ByteBuf r4 = r4.copy()     // Catch: java.lang.Exception -> L6d
            java.lang.String r5 = "copy(...)"
            kotlin.jvm.internal.g0.o(r4, r5)     // Catch: java.lang.Exception -> L6d
            java.lang.String r5 = "断包合并后的数据："
            r2.c(r4, r5)     // Catch: java.lang.Exception -> L6d
            io.netty.buffer.ByteBuf r2 = r6.c     // Catch: java.lang.Exception -> L6d
            kotlin.jvm.internal.g0.m(r2)     // Catch: java.lang.Exception -> L6d
            r6.a(r2, r3, r7, r9)     // Catch: java.lang.Exception -> L6d
            r7 = 0
            r6.c = r7     // Catch: java.lang.Exception -> L6d
            r6.d = r1     // Catch: java.lang.Exception -> L6d
        L68:
            return
        L69:
            r6.a(r8, r0, r7, r9)     // Catch: java.lang.Exception -> L6d
            return
        L6d:
            r8.resetReaderIndex()
            byte[] r7 = new byte[r0]
            r8.readBytes(r7)
            a0.a r8 = a0.a.a
            java.lang.String r7 = r8.b(r7)
            java.lang.Object[] r8 = new java.lang.Object[r1]
            com.orhanobut.logger.j.e(r7, r8)
            return
    }

    public /* bridge */ /* synthetic */ void decode(io.netty.channel.ChannelHandlerContext r1, java.lang.Object r2, java.util.List r3) {
            r0 = this;
            io.netty.buffer.ByteBuf r2 = (io.netty.buffer.ByteBuf) r2
            r0.decode(r1, r2, r3)
            return
    }
}
