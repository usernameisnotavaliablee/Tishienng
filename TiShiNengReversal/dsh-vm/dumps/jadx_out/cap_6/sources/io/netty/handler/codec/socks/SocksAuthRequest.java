package io.netty.handler.codec.socks;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class SocksAuthRequest extends io.netty.handler.codec.socks.SocksRequest {
    private static final io.netty.handler.codec.socks.SocksSubnegotiationVersion SUBNEGOTIATION_VERSION = null;
    private static final java.nio.charset.CharsetEncoder asciiEncoder = null;
    private final java.lang.String password;
    private final java.lang.String username;

    static {
            java.nio.charset.Charset r0 = io.netty.util.CharsetUtil.US_ASCII
            java.nio.charset.CharsetEncoder r0 = io.netty.util.CharsetUtil.encoder(r0)
            io.netty.handler.codec.socks.SocksAuthRequest.asciiEncoder = r0
            io.netty.handler.codec.socks.SocksSubnegotiationVersion r0 = io.netty.handler.codec.socks.SocksSubnegotiationVersion.AUTH_PASSWORD
            io.netty.handler.codec.socks.SocksAuthRequest.SUBNEGOTIATION_VERSION = r0
            return
    }

    public SocksAuthRequest(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            io.netty.handler.codec.socks.SocksRequestType r0 = io.netty.handler.codec.socks.SocksRequestType.AUTH
            r3.<init>(r0)
            java.lang.String r0 = "username"
            if (r4 == 0) goto L70
            if (r5 == 0) goto L6a
            java.nio.charset.CharsetEncoder r0 = io.netty.handler.codec.socks.SocksAuthRequest.asciiEncoder
            boolean r1 = r0.canEncode(r4)
            java.lang.String r2 = "username: "
            if (r1 == 0) goto L50
            boolean r0 = r0.canEncode(r5)
            if (r0 == 0) goto L50
            int r0 = r4.length()
            r1 = 255(0xff, float:3.57E-43)
            if (r0 > r1) goto L36
            int r0 = r5.length()
            if (r0 > r1) goto L2e
            r3.username = r4
            r3.password = r5
            return
        L2e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "password: **** exceeds 255 char limit"
            r4.<init>(r5)
            throw r4
        L36:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r4)
            java.lang.String r4 = " exceeds 255 char limit"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            throw r5
        L50:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r4)
            java.lang.String r4 = " or password: **** values should be in pure ascii"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            throw r5
        L6a:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            r4.<init>(r0)
            throw r4
        L70:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            r4.<init>(r0)
            throw r4
    }

    @Override // io.netty.handler.codec.socks.SocksMessage
    public void encodeAsByteBuf(io.netty.buffer.ByteBuf r3) {
            r2 = this;
            io.netty.handler.codec.socks.SocksSubnegotiationVersion r0 = io.netty.handler.codec.socks.SocksAuthRequest.SUBNEGOTIATION_VERSION
            byte r0 = r0.byteValue()
            r3.writeByte(r0)
            java.lang.String r0 = r2.username
            int r0 = r0.length()
            r3.writeByte(r0)
            java.lang.String r0 = r2.username
            java.nio.charset.Charset r1 = io.netty.util.CharsetUtil.US_ASCII
            r3.writeCharSequence(r0, r1)
            java.lang.String r0 = r2.password
            int r0 = r0.length()
            r3.writeByte(r0)
            java.lang.String r0 = r2.password
            r3.writeCharSequence(r0, r1)
            return
    }

    public java.lang.String password() {
            r1 = this;
            java.lang.String r0 = r1.password
            return r0
    }

    public java.lang.String username() {
            r1 = this;
            java.lang.String r0 = r1.username
            return r0
    }
}
