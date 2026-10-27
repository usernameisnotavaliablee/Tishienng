package io.netty.handler.codec.socks;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class SocksCmdRequest extends io.netty.handler.codec.socks.SocksRequest {
    private final io.netty.handler.codec.socks.SocksAddressType addressType;
    private final io.netty.handler.codec.socks.SocksCmdType cmdType;
    private final java.lang.String host;
    private final int port;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.socks.SocksCmdRequest$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$socks$SocksAddressType = null;

        static {
                io.netty.handler.codec.socks.SocksAddressType[] r0 = io.netty.handler.codec.socks.SocksAddressType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.handler.codec.socks.SocksCmdRequest.AnonymousClass1.$SwitchMap$io$netty$handler$codec$socks$SocksAddressType = r0
                io.netty.handler.codec.socks.SocksAddressType r1 = io.netty.handler.codec.socks.SocksAddressType.IPv4     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.handler.codec.socks.SocksCmdRequest.AnonymousClass1.$SwitchMap$io$netty$handler$codec$socks$SocksAddressType     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.handler.codec.socks.SocksAddressType r1 = io.netty.handler.codec.socks.SocksAddressType.DOMAIN     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.netty.handler.codec.socks.SocksCmdRequest.AnonymousClass1.$SwitchMap$io$netty$handler$codec$socks$SocksAddressType     // Catch: java.lang.NoSuchFieldError -> L28
                io.netty.handler.codec.socks.SocksAddressType r1 = io.netty.handler.codec.socks.SocksAddressType.IPv6     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = io.netty.handler.codec.socks.SocksCmdRequest.AnonymousClass1.$SwitchMap$io$netty$handler$codec$socks$SocksAddressType     // Catch: java.lang.NoSuchFieldError -> L33
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

    public SocksCmdRequest(io.netty.handler.codec.socks.SocksCmdType r4, io.netty.handler.codec.socks.SocksAddressType r5, java.lang.String r6, int r7) {
            r3 = this;
            io.netty.handler.codec.socks.SocksRequestType r0 = io.netty.handler.codec.socks.SocksRequestType.CMD
            r3.<init>(r0)
            if (r4 == 0) goto Lbb
            if (r5 == 0) goto Lb3
            if (r6 == 0) goto Lab
            int[] r0 = io.netty.handler.codec.socks.SocksCmdRequest.AnonymousClass1.$SwitchMap$io$netty$handler$codec$socks$SocksAddressType
            int r1 = r5.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L68
            r1 = 2
            if (r0 == r1) goto L3b
            r1 = 3
            if (r0 == r1) goto L1d
            goto L6e
        L1d:
            boolean r0 = io.netty.util.NetUtil.isValidIpV6Address(r6)
            if (r0 == 0) goto L24
            goto L6e
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
            goto L6e
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
            if (r0 == 0) goto L94
        L6e:
            if (r7 <= 0) goto L7d
            r0 = 65536(0x10000, float:9.1835E-41)
            if (r7 >= r0) goto L7d
            r3.cmdType = r4
            r3.addressType = r5
            r3.host = r6
            r3.port = r7
            return
        L7d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r7)
            java.lang.String r6 = " is not in bounds 0 < x < 65536"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L94:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r6)
            java.lang.String r6 = " is not a valid IPv4 address"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        Lab:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "host"
            r4.<init>(r5)
            throw r4
        Lb3:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "addressType"
            r4.<init>(r5)
            throw r4
        Lbb:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "cmdType"
            r4.<init>(r5)
            throw r4
    }

    public io.netty.handler.codec.socks.SocksAddressType addressType() {
            r1 = this;
            io.netty.handler.codec.socks.SocksAddressType r0 = r1.addressType
            return r0
    }

    public io.netty.handler.codec.socks.SocksCmdType cmdType() {
            r1 = this;
            io.netty.handler.codec.socks.SocksCmdType r0 = r1.cmdType
            return r0
    }

    @Override // io.netty.handler.codec.socks.SocksMessage
    public void encodeAsByteBuf(io.netty.buffer.ByteBuf r3) {
            r2 = this;
            io.netty.handler.codec.socks.SocksProtocolVersion r0 = r2.protocolVersion()
            byte r0 = r0.byteValue()
            r3.writeByte(r0)
            io.netty.handler.codec.socks.SocksCmdType r0 = r2.cmdType
            byte r0 = r0.byteValue()
            r3.writeByte(r0)
            r0 = 0
            r3.writeByte(r0)
            io.netty.handler.codec.socks.SocksAddressType r0 = r2.addressType
            byte r0 = r0.byteValue()
            r3.writeByte(r0)
            int[] r0 = io.netty.handler.codec.socks.SocksCmdRequest.AnonymousClass1.$SwitchMap$io$netty$handler$codec$socks$SocksAddressType
            io.netty.handler.codec.socks.SocksAddressType r1 = r2.addressType
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L5a
            r1 = 2
            if (r0 == r1) goto L44
            r1 = 3
            if (r0 == r1) goto L35
            return
        L35:
            java.lang.String r0 = r2.host
            byte[] r0 = io.netty.util.NetUtil.createByteArrayFromIpAddressString(r0)
            r3.writeBytes(r0)
            int r0 = r2.port
            r3.writeShort(r0)
            return
        L44:
            java.lang.String r0 = r2.host
            int r0 = r0.length()
            r3.writeByte(r0)
            java.lang.String r0 = r2.host
            java.nio.charset.Charset r1 = io.netty.util.CharsetUtil.US_ASCII
            r3.writeCharSequence(r0, r1)
            int r0 = r2.port
            r3.writeShort(r0)
            return
        L5a:
            java.lang.String r0 = r2.host
            byte[] r0 = io.netty.util.NetUtil.createByteArrayFromIpAddressString(r0)
            r3.writeBytes(r0)
            int r0 = r2.port
            r3.writeShort(r0)
            return
    }

    public java.lang.String host() {
            r2 = this;
            io.netty.handler.codec.socks.SocksAddressType r0 = r2.addressType
            io.netty.handler.codec.socks.SocksAddressType r1 = io.netty.handler.codec.socks.SocksAddressType.DOMAIN
            if (r0 != r1) goto Ld
            java.lang.String r0 = r2.host
            java.lang.String r0 = java.net.IDN.toUnicode(r0)
            return r0
        Ld:
            java.lang.String r0 = r2.host
            return r0
    }

    public int port() {
            r1 = this;
            int r0 = r1.port
            return r0
    }
}
