package io.netty.handler.codec.socksx.v5;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@io.netty.channel.ChannelHandler.Sharable
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class Socks5ServerEncoder extends io.netty.handler.codec.MessageToByteEncoder<io.netty.handler.codec.socksx.v5.Socks5Message> {
    public static final io.netty.handler.codec.socksx.v5.Socks5ServerEncoder DEFAULT = null;
    private final io.netty.handler.codec.socksx.v5.Socks5AddressEncoder addressEncoder;

    static {
            io.netty.handler.codec.socksx.v5.Socks5ServerEncoder r0 = new io.netty.handler.codec.socksx.v5.Socks5ServerEncoder
            io.netty.handler.codec.socksx.v5.Socks5AddressEncoder r1 = io.netty.handler.codec.socksx.v5.Socks5AddressEncoder.DEFAULT
            r0.<init>(r1)
            io.netty.handler.codec.socksx.v5.Socks5ServerEncoder.DEFAULT = r0
            return
    }

    protected Socks5ServerEncoder() {
            r1 = this;
            io.netty.handler.codec.socksx.v5.Socks5AddressEncoder r0 = io.netty.handler.codec.socksx.v5.Socks5AddressEncoder.DEFAULT
            r1.<init>(r0)
            return
    }

    public Socks5ServerEncoder(io.netty.handler.codec.socksx.v5.Socks5AddressEncoder r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L8
            r1.addressEncoder = r2
            return
        L8:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "addressEncoder"
            r2.<init>(r0)
            throw r2
    }

    private static void encodeAuthMethodResponse(io.netty.handler.codec.socksx.v5.Socks5InitialResponse r1, io.netty.buffer.ByteBuf r2) {
            io.netty.handler.codec.socksx.SocksVersion r0 = r1.version()
            byte r0 = r0.byteValue()
            r2.writeByte(r0)
            io.netty.handler.codec.socksx.v5.Socks5AuthMethod r1 = r1.authMethod()
            byte r1 = r1.byteValue()
            r2.writeByte(r1)
            return
    }

    private void encodeCommandResponse(io.netty.handler.codec.socksx.v5.Socks5CommandResponse r4, io.netty.buffer.ByteBuf r5) throws java.lang.Exception {
            r3 = this;
            io.netty.handler.codec.socksx.SocksVersion r0 = r4.version()
            byte r0 = r0.byteValue()
            r5.writeByte(r0)
            io.netty.handler.codec.socksx.v5.Socks5CommandStatus r0 = r4.status()
            byte r0 = r0.byteValue()
            r5.writeByte(r0)
            r0 = 0
            r5.writeByte(r0)
            io.netty.handler.codec.socksx.v5.Socks5AddressType r0 = r4.bndAddrType()
            byte r1 = r0.byteValue()
            r5.writeByte(r1)
            io.netty.handler.codec.socksx.v5.Socks5AddressEncoder r1 = r3.addressEncoder
            java.lang.String r2 = r4.bndAddr()
            r1.encodeAddress(r0, r2, r5)
            int r4 = r4.bndPort()
            r5.writeShort(r4)
            return
    }

    private static void encodePasswordAuthResponse(io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponse r1, io.netty.buffer.ByteBuf r2) {
            r0 = 1
            r2.writeByte(r0)
            io.netty.handler.codec.socksx.v5.Socks5PasswordAuthStatus r1 = r1.status()
            byte r1 = r1.byteValue()
            r2.writeByte(r1)
            return
    }

    protected final io.netty.handler.codec.socksx.v5.Socks5AddressEncoder addressEncoder() {
            r1 = this;
            io.netty.handler.codec.socksx.v5.Socks5AddressEncoder r0 = r1.addressEncoder
            return r0
    }

    /* renamed from: encode, reason: avoid collision after fix types in other method */
    protected void encode2(io.netty.channel.ChannelHandlerContext r2, io.netty.handler.codec.socksx.v5.Socks5Message r3, io.netty.buffer.ByteBuf r4) throws java.lang.Exception {
            r1 = this;
            boolean r2 = r3 instanceof io.netty.handler.codec.socksx.v5.Socks5InitialResponse
            if (r2 == 0) goto La
            io.netty.handler.codec.socksx.v5.Socks5InitialResponse r3 = (io.netty.handler.codec.socksx.v5.Socks5InitialResponse) r3
            encodeAuthMethodResponse(r3, r4)
            return
        La:
            boolean r2 = r3 instanceof io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponse
            if (r2 == 0) goto L14
            io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponse r3 = (io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponse) r3
            encodePasswordAuthResponse(r3, r4)
            return
        L14:
            boolean r2 = r3 instanceof io.netty.handler.codec.socksx.v5.Socks5CommandResponse
            if (r2 == 0) goto L1e
            io.netty.handler.codec.socksx.v5.Socks5CommandResponse r3 = (io.netty.handler.codec.socksx.v5.Socks5CommandResponse) r3
            r1.encodeCommandResponse(r3, r4)
            return
        L1e:
            io.netty.handler.codec.EncoderException r2 = new io.netty.handler.codec.EncoderException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "unsupported message type: "
            r4.append(r0)
            java.lang.String r3 = io.netty.util.internal.StringUtil.simpleClassName(r3)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // io.netty.handler.codec.MessageToByteEncoder
    protected /* bridge */ /* synthetic */ void encode(io.netty.channel.ChannelHandlerContext r1, io.netty.handler.codec.socksx.v5.Socks5Message r2, io.netty.buffer.ByteBuf r3) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.socksx.v5.Socks5Message r2 = (io.netty.handler.codec.socksx.v5.Socks5Message) r2
            r0.encode2(r1, r2, r3)
            return
    }
}
