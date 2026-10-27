package io.netty.handler.codec.socksx.v4;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@io.netty.channel.ChannelHandler.Sharable
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class Socks4ServerEncoder extends io.netty.handler.codec.MessageToByteEncoder<io.netty.handler.codec.socksx.v4.Socks4CommandResponse> {
    public static final io.netty.handler.codec.socksx.v4.Socks4ServerEncoder INSTANCE = null;
    private static final byte[] IPv4_HOSTNAME_ZEROED = null;

    static {
            io.netty.handler.codec.socksx.v4.Socks4ServerEncoder r0 = new io.netty.handler.codec.socksx.v4.Socks4ServerEncoder
            r0.<init>()
            io.netty.handler.codec.socksx.v4.Socks4ServerEncoder.INSTANCE = r0
            r0 = 4
            byte[] r0 = new byte[r0]
            r0 = {x0010: FILL_ARRAY_DATA , data: [0, 0, 0, 0} // fill-array
            io.netty.handler.codec.socksx.v4.Socks4ServerEncoder.IPv4_HOSTNAME_ZEROED = r0
            return
    }

    private Socks4ServerEncoder() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: encode, reason: avoid collision after fix types in other method */
    protected void encode2(io.netty.channel.ChannelHandlerContext r1, io.netty.handler.codec.socksx.v4.Socks4CommandResponse r2, io.netty.buffer.ByteBuf r3) throws java.lang.Exception {
            r0 = this;
            r1 = 0
            r3.writeByte(r1)
            io.netty.handler.codec.socksx.v4.Socks4CommandStatus r1 = r2.status()
            byte r1 = r1.byteValue()
            r3.writeByte(r1)
            int r1 = r2.dstPort()
            r3.writeShort(r1)
            java.lang.String r1 = r2.dstAddr()
            if (r1 != 0) goto L1f
            byte[] r1 = io.netty.handler.codec.socksx.v4.Socks4ServerEncoder.IPv4_HOSTNAME_ZEROED
            goto L27
        L1f:
            java.lang.String r1 = r2.dstAddr()
            byte[] r1 = io.netty.util.NetUtil.createByteArrayFromIpAddressString(r1)
        L27:
            r3.writeBytes(r1)
            return
    }

    @Override // io.netty.handler.codec.MessageToByteEncoder
    protected /* bridge */ /* synthetic */ void encode(io.netty.channel.ChannelHandlerContext r1, io.netty.handler.codec.socksx.v4.Socks4CommandResponse r2, io.netty.buffer.ByteBuf r3) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.socksx.v4.Socks4CommandResponse r2 = (io.netty.handler.codec.socksx.v4.Socks4CommandResponse) r2
            r0.encode2(r1, r2, r3)
            return
    }
}
