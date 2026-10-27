package io.netty.handler.codec.socksx.v5;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class DefaultSocks5CommandRequest extends io.netty.handler.codec.socksx.v5.AbstractSocks5Message implements io.netty.handler.codec.socksx.v5.Socks5CommandRequest {
    private final java.lang.String dstAddr;
    private final io.netty.handler.codec.socksx.v5.Socks5AddressType dstAddrType;
    private final int dstPort;
    private final io.netty.handler.codec.socksx.v5.Socks5CommandType type;

    public DefaultSocks5CommandRequest(io.netty.handler.codec.socksx.v5.Socks5CommandType r4, io.netty.handler.codec.socksx.v5.Socks5AddressType r5, java.lang.String r6, int r7) {
            r3 = this;
            r3.<init>()
            if (r4 == 0) goto Lbc
            if (r5 == 0) goto Lb4
            if (r6 == 0) goto Lac
            io.netty.handler.codec.socksx.v5.Socks5AddressType r0 = io.netty.handler.codec.socksx.v5.Socks5AddressType.IPv4
            java.lang.String r1 = "dstAddr: "
            if (r5 != r0) goto L30
            boolean r0 = io.netty.util.NetUtil.isValidIpV4Address(r6)
            if (r0 == 0) goto L16
            goto L80
        L16:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            r5.append(r6)
            java.lang.String r6 = " (expected: a valid IPv4 address)"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L30:
            io.netty.handler.codec.socksx.v5.Socks5AddressType r0 = io.netty.handler.codec.socksx.v5.Socks5AddressType.DOMAIN
            if (r5 != r0) goto L5b
            java.lang.String r6 = java.net.IDN.toASCII(r6)
            int r0 = r6.length()
            r2 = 255(0xff, float:3.57E-43)
            if (r0 > r2) goto L41
            goto L80
        L41:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            r5.append(r6)
            java.lang.String r6 = " (expected: less than 256 chars)"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L5b:
            io.netty.handler.codec.socksx.v5.Socks5AddressType r0 = io.netty.handler.codec.socksx.v5.Socks5AddressType.IPv6
            if (r5 != r0) goto L80
            boolean r0 = io.netty.util.NetUtil.isValidIpV6Address(r6)
            if (r0 == 0) goto L66
            goto L80
        L66:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            r5.append(r6)
            java.lang.String r6 = " (expected: a valid IPv6 address"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L80:
            if (r7 < 0) goto L90
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r7 > r0) goto L90
            r3.type = r4
            r3.dstAddrType = r5
            r3.dstAddr = r6
            r3.dstPort = r7
            return
        L90:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "dstPort: "
            r5.append(r6)
            r5.append(r7)
            java.lang.String r6 = " (expected: 0~65535)"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        Lac:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "dstAddr"
            r4.<init>(r5)
            throw r4
        Lb4:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "dstAddrType"
            r4.<init>(r5)
            throw r4
        Lbc:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "type"
            r4.<init>(r5)
            throw r4
    }

    @Override // io.netty.handler.codec.socksx.v5.Socks5CommandRequest
    public java.lang.String dstAddr() {
            r1 = this;
            java.lang.String r0 = r1.dstAddr
            return r0
    }

    @Override // io.netty.handler.codec.socksx.v5.Socks5CommandRequest
    public io.netty.handler.codec.socksx.v5.Socks5AddressType dstAddrType() {
            r1 = this;
            io.netty.handler.codec.socksx.v5.Socks5AddressType r0 = r1.dstAddrType
            return r0
    }

    @Override // io.netty.handler.codec.socksx.v5.Socks5CommandRequest
    public int dstPort() {
            r1 = this;
            int r0 = r1.dstPort
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r3)
            r0.append(r1)
            io.netty.handler.codec.DecoderResult r1 = r3.decoderResult()
            boolean r2 = r1.isSuccess()
            if (r2 != 0) goto L26
            java.lang.String r2 = "(decoderResult: "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = ", type: "
            r0.append(r1)
            goto L2b
        L26:
            java.lang.String r1 = "(type: "
            r0.append(r1)
        L2b:
            io.netty.handler.codec.socksx.v5.Socks5CommandType r1 = r3.type()
            r0.append(r1)
            java.lang.String r1 = ", dstAddrType: "
            r0.append(r1)
            io.netty.handler.codec.socksx.v5.Socks5AddressType r1 = r3.dstAddrType()
            r0.append(r1)
            java.lang.String r1 = ", dstAddr: "
            r0.append(r1)
            java.lang.String r1 = r3.dstAddr()
            r0.append(r1)
            java.lang.String r1 = ", dstPort: "
            r0.append(r1)
            int r1 = r3.dstPort()
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // io.netty.handler.codec.socksx.v5.Socks5CommandRequest
    public io.netty.handler.codec.socksx.v5.Socks5CommandType type() {
            r1 = this;
            io.netty.handler.codec.socksx.v5.Socks5CommandType r0 = r1.type
            return r0
    }
}
