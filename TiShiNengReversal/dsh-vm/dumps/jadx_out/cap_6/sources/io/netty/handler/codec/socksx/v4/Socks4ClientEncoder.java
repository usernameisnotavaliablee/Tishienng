package io.netty.handler.codec.socksx.v4;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@io.netty.channel.ChannelHandler.Sharable
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class Socks4ClientEncoder extends io.netty.handler.codec.MessageToByteEncoder<io.netty.handler.codec.socksx.v4.Socks4CommandRequest> {
    public static final io.netty.handler.codec.socksx.v4.Socks4ClientEncoder INSTANCE = null;
    private static final byte[] IPv4_DOMAIN_MARKER = null;

    static {
            io.netty.handler.codec.socksx.v4.Socks4ClientEncoder r0 = new io.netty.handler.codec.socksx.v4.Socks4ClientEncoder
            r0.<init>()
            io.netty.handler.codec.socksx.v4.Socks4ClientEncoder.INSTANCE = r0
            r0 = 4
            byte[] r0 = new byte[r0]
            r0 = {x0010: FILL_ARRAY_DATA , data: [0, 0, 0, 1} // fill-array
            io.netty.handler.codec.socksx.v4.Socks4ClientEncoder.IPv4_DOMAIN_MARKER = r0
            return
    }

    private Socks4ClientEncoder() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: encode, reason: avoid collision after fix types in other method */
    protected void encode2(io.netty.channel.ChannelHandlerContext r2, io.netty.handler.codec.socksx.v4.Socks4CommandRequest r3, io.netty.buffer.ByteBuf r4) throws java.lang.Exception {
            r1 = this;
            io.netty.handler.codec.socksx.SocksVersion r2 = r3.version()
            byte r2 = r2.byteValue()
            r4.writeByte(r2)
            io.netty.handler.codec.socksx.v4.Socks4CommandType r2 = r3.type()
            byte r2 = r2.byteValue()
            r4.writeByte(r2)
            int r2 = r3.dstPort()
            r4.writeShort(r2)
            java.lang.String r2 = r3.dstAddr()
            boolean r2 = io.netty.util.NetUtil.isValidIpV4Address(r2)
            r0 = 0
            if (r2 == 0) goto L3e
            java.lang.String r2 = r3.dstAddr()
            byte[] r2 = io.netty.util.NetUtil.createByteArrayFromIpAddressString(r2)
            r4.writeBytes(r2)
            java.lang.String r2 = r3.userId()
            io.netty.buffer.ByteBufUtil.writeAscii(r4, r2)
            r4.writeByte(r0)
            return
        L3e:
            byte[] r2 = io.netty.handler.codec.socksx.v4.Socks4ClientEncoder.IPv4_DOMAIN_MARKER
            r4.writeBytes(r2)
            java.lang.String r2 = r3.userId()
            io.netty.buffer.ByteBufUtil.writeAscii(r4, r2)
            r4.writeByte(r0)
            java.lang.String r2 = r3.dstAddr()
            io.netty.buffer.ByteBufUtil.writeAscii(r4, r2)
            r4.writeByte(r0)
            return
    }

    @Override // io.netty.handler.codec.MessageToByteEncoder
    protected /* bridge */ /* synthetic */ void encode(io.netty.channel.ChannelHandlerContext r1, io.netty.handler.codec.socksx.v4.Socks4CommandRequest r2, io.netty.buffer.ByteBuf r3) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.socksx.v4.Socks4CommandRequest r2 = (io.netty.handler.codec.socksx.v4.Socks4CommandRequest) r2
            r0.encode2(r1, r2, r3)
            return
    }
}
