package io.netty.handler.codec.socks;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class SocksCmdResponse extends io.netty.handler.codec.socks.SocksResponse {
    private static final byte[] DOMAIN_ZEROED = null;
    private static final byte[] IPv4_HOSTNAME_ZEROED = null;
    private static final byte[] IPv6_HOSTNAME_ZEROED = null;
    private final io.netty.handler.codec.socks.SocksAddressType addressType;
    private final io.netty.handler.codec.socks.SocksCmdStatus cmdStatus;
    private final java.lang.String host;
    private final int port;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.socks.SocksCmdResponse$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$socks$SocksAddressType = null;

        static {
                io.netty.handler.codec.socks.SocksAddressType[] r0 = io.netty.handler.codec.socks.SocksAddressType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.handler.codec.socks.SocksCmdResponse.AnonymousClass1.$SwitchMap$io$netty$handler$codec$socks$SocksAddressType = r0
                io.netty.handler.codec.socks.SocksAddressType r1 = io.netty.handler.codec.socks.SocksAddressType.IPv4     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.handler.codec.socks.SocksCmdResponse.AnonymousClass1.$SwitchMap$io$netty$handler$codec$socks$SocksAddressType     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.handler.codec.socks.SocksAddressType r1 = io.netty.handler.codec.socks.SocksAddressType.DOMAIN     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.netty.handler.codec.socks.SocksCmdResponse.AnonymousClass1.$SwitchMap$io$netty$handler$codec$socks$SocksAddressType     // Catch: java.lang.NoSuchFieldError -> L28
                io.netty.handler.codec.socks.SocksAddressType r1 = io.netty.handler.codec.socks.SocksAddressType.IPv6     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = io.netty.handler.codec.socks.SocksCmdResponse.AnonymousClass1.$SwitchMap$io$netty$handler$codec$socks$SocksAddressType     // Catch: java.lang.NoSuchFieldError -> L33
                io.netty.handler.codec.socks.SocksAddressType r1 = io.netty.handler.codec.socks.SocksAddressType.UNKNOWN     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    static {
            r0 = 1
            byte[] r0 = new byte[r0]
            r1 = 0
            r0[r1] = r1
            io.netty.handler.codec.socks.SocksCmdResponse.DOMAIN_ZEROED = r0
            r0 = 4
            byte[] r0 = new byte[r0]
            r0 = {x001a: FILL_ARRAY_DATA , data: [0, 0, 0, 0} // fill-array
            io.netty.handler.codec.socks.SocksCmdResponse.IPv4_HOSTNAME_ZEROED = r0
            r0 = 16
            byte[] r0 = new byte[r0]
            r0 = {x0020: FILL_ARRAY_DATA , data: [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0} // fill-array
            io.netty.handler.codec.socks.SocksCmdResponse.IPv6_HOSTNAME_ZEROED = r0
            return
    }

    public SocksCmdResponse(io.netty.handler.codec.socks.SocksCmdStatus r3, io.netty.handler.codec.socks.SocksAddressType r4) {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.<init>(r3, r4, r0, r1)
            return
    }

    public SocksCmdResponse(io.netty.handler.codec.socks.SocksCmdStatus r4, io.netty.handler.codec.socks.SocksAddressType r5, java.lang.String r6, int r7) {
            r3 = this;
            io.netty.handler.codec.socks.SocksResponseType r0 = io.netty.handler.codec.socks.SocksResponseType.CMD
            r3.<init>(r0)
            if (r4 == 0) goto Lb5
            if (r5 == 0) goto Lad
            if (r6 == 0) goto L86
            int[] r0 = io.netty.handler.codec.socks.SocksCmdResponse.AnonymousClass1.$SwitchMap$io$netty$handler$codec$socks$SocksAddressType
            int r1 = r5.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L68
            r1 = 2
            if (r0 == r1) goto L3b
            r1 = 3
            if (r0 == r1) goto L1d
            goto L86
        L1d:
            boolean r0 = io.netty.util.NetUtil.isValidIpV6Address(r6)
            if (r0 == 0) goto L24
            goto L86
        L24:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r6)
            java.lang.String r6 = " is not a valid IPv6 address"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L3b:
            java.lang.String r0 = java.net.IDN.toASCII(r6)
            int r1 = r0.length()
            r2 = 255(0xff, float:3.57E-43)
            if (r1 > r2) goto L49
            r6 = r0
            goto L86
        L49:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r6)
            java.lang.String r6 = " IDN: "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r6 = " exceeds 255 char limit"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L68:
            boolean r0 = io.netty.util.NetUtil.isValidIpV4Address(r6)
            if (r0 == 0) goto L6f
            goto L86
        L6f:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r6)
            java.lang.String r6 = " is not a valid IPv4 address"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L86:
            if (r7 < 0) goto L96
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r7 > r0) goto L96
            r3.cmdStatus = r4
            r3.addressType = r5
            r3.host = r6
            r3.port = r7
            return
        L96:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r7)
            java.lang.String r6 = " is not in bounds 0 <= x <= 65535"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        Lad:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "addressType"
            r4.<init>(r5)
            throw r4
        Lb5:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "cmdStatus"
            r4.<init>(r5)
            throw r4
    }

    public io.netty.handler.codec.socks.SocksAddressType addressType() {
            r1 = this;
            io.netty.handler.codec.socks.SocksAddressType r0 = r1.addressType
            return r0
    }

    public io.netty.handler.codec.socks.SocksCmdStatus cmdStatus() {
            r1 = this;
            io.netty.handler.codec.socks.SocksCmdStatus r0 = r1.cmdStatus
            return r0
    }

    @Override // io.netty.handler.codec.socks.SocksMessage
    public void encodeAsByteBuf(io.netty.buffer.ByteBuf r3) {
            r2 = this;
            io.netty.handler.codec.socks.SocksProtocolVersion r0 = r2.protocolVersion()
            byte r0 = r0.byteValue()
            r3.writeByte(r0)
            io.netty.handler.codec.socks.SocksCmdStatus r0 = r2.cmdStatus
            byte r0 = r0.byteValue()
            r3.writeByte(r0)
            r0 = 0
            r3.writeByte(r0)
            io.netty.handler.codec.socks.SocksAddressType r0 = r2.addressType
            byte r0 = r0.byteValue()
            r3.writeByte(r0)
            int[] r0 = io.netty.handler.codec.socks.SocksCmdResponse.AnonymousClass1.$SwitchMap$io$netty$handler$codec$socks$SocksAddressType
            io.netty.handler.codec.socks.SocksAddressType r1 = r2.addressType
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L6b
            r1 = 2
            if (r0 == r1) goto L49
            r1 = 3
            if (r0 == r1) goto L35
            return
        L35:
            java.lang.String r0 = r2.host
            if (r0 != 0) goto L3c
            byte[] r0 = io.netty.handler.codec.socks.SocksCmdResponse.IPv6_HOSTNAME_ZEROED
            goto L40
        L3c:
            byte[] r0 = io.netty.util.NetUtil.createByteArrayFromIpAddressString(r0)
        L40:
            r3.writeBytes(r0)
            int r0 = r2.port
            r3.writeShort(r0)
            return
        L49:
            java.lang.String r0 = r2.host
            if (r0 == 0) goto L5c
            int r0 = r0.length()
            r3.writeByte(r0)
            java.lang.String r0 = r2.host
            java.nio.charset.Charset r1 = io.netty.util.CharsetUtil.US_ASCII
            r3.writeCharSequence(r0, r1)
            goto L65
        L5c:
            byte[] r0 = io.netty.handler.codec.socks.SocksCmdResponse.DOMAIN_ZEROED
            int r1 = r0.length
            r3.writeByte(r1)
            r3.writeBytes(r0)
        L65:
            int r0 = r2.port
            r3.writeShort(r0)
            return
        L6b:
            java.lang.String r0 = r2.host
            if (r0 != 0) goto L72
            byte[] r0 = io.netty.handler.codec.socks.SocksCmdResponse.IPv4_HOSTNAME_ZEROED
            goto L76
        L72:
            byte[] r0 = io.netty.util.NetUtil.createByteArrayFromIpAddressString(r0)
        L76:
            r3.writeBytes(r0)
            int r0 = r2.port
            r3.writeShort(r0)
            return
    }

    public java.lang.String host() {
            r3 = this;
            java.lang.String r0 = r3.host
            if (r0 == 0) goto Le
            io.netty.handler.codec.socks.SocksAddressType r1 = r3.addressType
            io.netty.handler.codec.socks.SocksAddressType r2 = io.netty.handler.codec.socks.SocksAddressType.DOMAIN
            if (r1 != r2) goto Le
            java.lang.String r0 = java.net.IDN.toUnicode(r0)
        Le:
            return r0
    }

    public int port() {
            r1 = this;
            int r0 = r1.port
            return r0
    }
}
