package io.netty.handler.codec.socksx.v5;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@io.netty.channel.ChannelHandler.Sharable
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class Socks5ClientEncoder extends io.netty.handler.codec.MessageToByteEncoder<io.netty.handler.codec.socksx.v5.Socks5Message> {
    public static final io.netty.handler.codec.socksx.v5.Socks5ClientEncoder DEFAULT = null;
    private final io.netty.handler.codec.socksx.v5.Socks5AddressEncoder addressEncoder;

    static {
            io.netty.handler.codec.socksx.v5.Socks5ClientEncoder r0 = new io.netty.handler.codec.socksx.v5.Socks5ClientEncoder
            r0.<init>()
            io.netty.handler.codec.socksx.v5.Socks5ClientEncoder.DEFAULT = r0
            return
    }

    protected Socks5ClientEncoder() {
            r1 = this;
            io.netty.handler.codec.socksx.v5.Socks5AddressEncoder r0 = io.netty.handler.codec.socksx.v5.Socks5AddressEncoder.DEFAULT
            r1.<init>(r0)
            return
    }

    public Socks5ClientEncoder(io.netty.handler.codec.socksx.v5.Socks5AddressEncoder r2) {
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

    private static void encodeAuthMethodRequest(io.netty.handler.codec.socksx.v5.Socks5InitialRequest r3, io.netty.buffer.ByteBuf r4) {
            io.netty.handler.codec.socksx.SocksVersion r0 = r3.version()
            byte r0 = r0.byteValue()
            r4.writeByte(r0)
            java.util.List r3 = r3.authMethods()
            int r0 = r3.size()
            r4.writeByte(r0)
            boolean r1 = r3 instanceof java.util.RandomAccess
            if (r1 == 0) goto L2d
            r1 = 0
        L1b:
            if (r1 >= r0) goto L45
            java.lang.Object r2 = r3.get(r1)
            io.netty.handler.codec.socksx.v5.Socks5AuthMethod r2 = (io.netty.handler.codec.socksx.v5.Socks5AuthMethod) r2
            byte r2 = r2.byteValue()
            r4.writeByte(r2)
            int r1 = r1 + 1
            goto L1b
        L2d:
            java.util.Iterator r3 = r3.iterator()
        L31:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L45
            java.lang.Object r0 = r3.next()
            io.netty.handler.codec.socksx.v5.Socks5AuthMethod r0 = (io.netty.handler.codec.socksx.v5.Socks5AuthMethod) r0
            byte r0 = r0.byteValue()
            r4.writeByte(r0)
            goto L31
        L45:
            return
    }

    private void encodeCommandRequest(io.netty.handler.codec.socksx.v5.Socks5CommandRequest r4, io.netty.buffer.ByteBuf r5) throws java.lang.Exception {
            r3 = this;
            io.netty.handler.codec.socksx.SocksVersion r0 = r4.version()
            byte r0 = r0.byteValue()
            r5.writeByte(r0)
            io.netty.handler.codec.socksx.v5.Socks5CommandType r0 = r4.type()
            byte r0 = r0.byteValue()
            r5.writeByte(r0)
            r0 = 0
            r5.writeByte(r0)
            io.netty.handler.codec.socksx.v5.Socks5AddressType r0 = r4.dstAddrType()
            byte r1 = r0.byteValue()
            r5.writeByte(r1)
            io.netty.handler.codec.socksx.v5.Socks5AddressEncoder r1 = r3.addressEncoder
            java.lang.String r2 = r4.dstAddr()
            r1.encodeAddress(r0, r2, r5)
            int r4 = r4.dstPort()
            r5.writeShort(r4)
            return
    }

    private static void encodePasswordAuthRequest(io.netty.handler.codec.socksx.v5.Socks5PasswordAuthRequest r2, io.netty.buffer.ByteBuf r3) {
            r0 = 1
            r3.writeByte(r0)
            java.lang.String r0 = r2.username()
            int r1 = r0.length()
            r3.writeByte(r1)
            io.netty.buffer.ByteBufUtil.writeAscii(r3, r0)
            java.lang.String r2 = r2.password()
            int r0 = r2.length()
            r3.writeByte(r0)
            io.netty.buffer.ByteBufUtil.writeAscii(r3, r2)
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
            boolean r2 = r3 instanceof io.netty.handler.codec.socksx.v5.Socks5InitialRequest
            if (r2 == 0) goto La
            io.netty.handler.codec.socksx.v5.Socks5InitialRequest r3 = (io.netty.handler.codec.socksx.v5.Socks5InitialRequest) r3
            encodeAuthMethodRequest(r3, r4)
            return
        La:
            boolean r2 = r3 instanceof io.netty.handler.codec.socksx.v5.Socks5PasswordAuthRequest
            if (r2 == 0) goto L14
            io.netty.handler.codec.socksx.v5.Socks5PasswordAuthRequest r3 = (io.netty.handler.codec.socksx.v5.Socks5PasswordAuthRequest) r3
            encodePasswordAuthRequest(r3, r4)
            return
        L14:
            boolean r2 = r3 instanceof io.netty.handler.codec.socksx.v5.Socks5CommandRequest
            if (r2 == 0) goto L1e
            io.netty.handler.codec.socksx.v5.Socks5CommandRequest r3 = (io.netty.handler.codec.socksx.v5.Socks5CommandRequest) r3
            r1.encodeCommandRequest(r3, r4)
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
