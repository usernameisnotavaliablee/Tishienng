package io.netty.handler.codec.socks;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class SocksCmdResponseDecoder extends io.netty.handler.codec.ReplayingDecoder<io.netty.handler.codec.socks.SocksCmdResponseDecoder.State> {
    private io.netty.handler.codec.socks.SocksAddressType addressType;
    private io.netty.handler.codec.socks.SocksCmdStatus cmdStatus;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.socks.SocksCmdResponseDecoder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$socks$SocksAddressType = null;
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$socks$SocksCmdResponseDecoder$State = null;

        static {
                io.netty.handler.codec.socks.SocksCmdResponseDecoder$State[] r0 = io.netty.handler.codec.socks.SocksCmdResponseDecoder.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.handler.codec.socks.SocksCmdResponseDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$socks$SocksCmdResponseDecoder$State = r0
                r1 = 1
                io.netty.handler.codec.socks.SocksCmdResponseDecoder$State r2 = io.netty.handler.codec.socks.SocksCmdResponseDecoder.State.CHECK_PROTOCOL_VERSION     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = io.netty.handler.codec.socks.SocksCmdResponseDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$socks$SocksCmdResponseDecoder$State     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.handler.codec.socks.SocksCmdResponseDecoder$State r3 = io.netty.handler.codec.socks.SocksCmdResponseDecoder.State.READ_CMD_HEADER     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                r2 = 3
                int[] r3 = io.netty.handler.codec.socks.SocksCmdResponseDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$socks$SocksCmdResponseDecoder$State     // Catch: java.lang.NoSuchFieldError -> L28
                io.netty.handler.codec.socks.SocksCmdResponseDecoder$State r4 = io.netty.handler.codec.socks.SocksCmdResponseDecoder.State.READ_CMD_ADDRESS     // Catch: java.lang.NoSuchFieldError -> L28
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                io.netty.handler.codec.socks.SocksAddressType[] r3 = io.netty.handler.codec.socks.SocksAddressType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                io.netty.handler.codec.socks.SocksCmdResponseDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$socks$SocksAddressType = r3
                io.netty.handler.codec.socks.SocksAddressType r4 = io.netty.handler.codec.socks.SocksAddressType.IPv4     // Catch: java.lang.NoSuchFieldError -> L39
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L39
                r3[r4] = r1     // Catch: java.lang.NoSuchFieldError -> L39
            L39:
                int[] r1 = io.netty.handler.codec.socks.SocksCmdResponseDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$socks$SocksAddressType     // Catch: java.lang.NoSuchFieldError -> L43
                io.netty.handler.codec.socks.SocksAddressType r3 = io.netty.handler.codec.socks.SocksAddressType.DOMAIN     // Catch: java.lang.NoSuchFieldError -> L43
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L43
                r1[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L43
            L43:
                int[] r0 = io.netty.handler.codec.socks.SocksCmdResponseDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$socks$SocksAddressType     // Catch: java.lang.NoSuchFieldError -> L4d
                io.netty.handler.codec.socks.SocksAddressType r1 = io.netty.handler.codec.socks.SocksAddressType.IPv6     // Catch: java.lang.NoSuchFieldError -> L4d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4d
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L4d
            L4d:
                int[] r0 = io.netty.handler.codec.socks.SocksCmdResponseDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$socks$SocksAddressType     // Catch: java.lang.NoSuchFieldError -> L58
                io.netty.handler.codec.socks.SocksAddressType r1 = io.netty.handler.codec.socks.SocksAddressType.UNKNOWN     // Catch: java.lang.NoSuchFieldError -> L58
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L58
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L58
            L58:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    enum State extends java.lang.Enum<io.netty.handler.codec.socks.SocksCmdResponseDecoder.State> {
        private static final /* synthetic */ io.netty.handler.codec.socks.SocksCmdResponseDecoder.State[] $VALUES = null;
        public static final io.netty.handler.codec.socks.SocksCmdResponseDecoder.State CHECK_PROTOCOL_VERSION = null;
        public static final io.netty.handler.codec.socks.SocksCmdResponseDecoder.State READ_CMD_ADDRESS = null;
        public static final io.netty.handler.codec.socks.SocksCmdResponseDecoder.State READ_CMD_HEADER = null;

        static {
                io.netty.handler.codec.socks.SocksCmdResponseDecoder$State r0 = new io.netty.handler.codec.socks.SocksCmdResponseDecoder$State
                java.lang.String r1 = "CHECK_PROTOCOL_VERSION"
                r2 = 0
                r0.<init>(r1, r2)
                io.netty.handler.codec.socks.SocksCmdResponseDecoder.State.CHECK_PROTOCOL_VERSION = r0
                io.netty.handler.codec.socks.SocksCmdResponseDecoder$State r1 = new io.netty.handler.codec.socks.SocksCmdResponseDecoder$State
                java.lang.String r3 = "READ_CMD_HEADER"
                r4 = 1
                r1.<init>(r3, r4)
                io.netty.handler.codec.socks.SocksCmdResponseDecoder.State.READ_CMD_HEADER = r1
                io.netty.handler.codec.socks.SocksCmdResponseDecoder$State r3 = new io.netty.handler.codec.socks.SocksCmdResponseDecoder$State
                java.lang.String r5 = "READ_CMD_ADDRESS"
                r6 = 2
                r3.<init>(r5, r6)
                io.netty.handler.codec.socks.SocksCmdResponseDecoder.State.READ_CMD_ADDRESS = r3
                r5 = 3
                io.netty.handler.codec.socks.SocksCmdResponseDecoder$State[] r5 = new io.netty.handler.codec.socks.SocksCmdResponseDecoder.State[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                io.netty.handler.codec.socks.SocksCmdResponseDecoder.State.$VALUES = r5
                return
        }

        State(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.netty.handler.codec.socks.SocksCmdResponseDecoder.State valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.handler.codec.socks.SocksCmdResponseDecoder$State> r0 = io.netty.handler.codec.socks.SocksCmdResponseDecoder.State.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.handler.codec.socks.SocksCmdResponseDecoder$State r1 = (io.netty.handler.codec.socks.SocksCmdResponseDecoder.State) r1
                return r1
        }

        public static io.netty.handler.codec.socks.SocksCmdResponseDecoder.State[] values() {
                io.netty.handler.codec.socks.SocksCmdResponseDecoder$State[] r0 = io.netty.handler.codec.socks.SocksCmdResponseDecoder.State.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.handler.codec.socks.SocksCmdResponseDecoder$State[] r0 = (io.netty.handler.codec.socks.SocksCmdResponseDecoder.State[]) r0
                return r0
        }
    }

    public SocksCmdResponseDecoder() {
            r1 = this;
            io.netty.handler.codec.socks.SocksCmdResponseDecoder$State r0 = io.netty.handler.codec.socks.SocksCmdResponseDecoder.State.CHECK_PROTOCOL_VERSION
            r1.<init>(r0)
            return
    }

    @Override // io.netty.handler.codec.ByteToMessageDecoder
    protected void decode(io.netty.channel.ChannelHandlerContext r6, io.netty.buffer.ByteBuf r7, java.util.List<java.lang.Object> r8) throws java.lang.Exception {
            r5 = this;
            int[] r0 = io.netty.handler.codec.socks.SocksCmdResponseDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$socks$SocksCmdResponseDecoder$State
            java.lang.Object r1 = r5.state()
            io.netty.handler.codec.socks.SocksCmdResponseDecoder$State r1 = (io.netty.handler.codec.socks.SocksCmdResponseDecoder.State) r1
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 3
            r2 = 2
            r3 = 1
            if (r0 == r3) goto L1e
            if (r0 == r2) goto L36
            if (r0 != r1) goto L18
            goto L52
        L18:
            java.lang.Error r6 = new java.lang.Error
            r6.<init>()
            throw r6
        L1e:
            byte r0 = r7.readByte()
            io.netty.handler.codec.socks.SocksProtocolVersion r4 = io.netty.handler.codec.socks.SocksProtocolVersion.SOCKS5
            byte r4 = r4.byteValue()
            if (r0 == r4) goto L31
            io.netty.handler.codec.socks.SocksResponse r7 = io.netty.handler.codec.socks.SocksCommonUtils.UNKNOWN_SOCKS_RESPONSE
            r8.add(r7)
            goto Lbe
        L31:
            io.netty.handler.codec.socks.SocksCmdResponseDecoder$State r0 = io.netty.handler.codec.socks.SocksCmdResponseDecoder.State.READ_CMD_HEADER
            r5.checkpoint(r0)
        L36:
            byte r0 = r7.readByte()
            io.netty.handler.codec.socks.SocksCmdStatus r0 = io.netty.handler.codec.socks.SocksCmdStatus.valueOf(r0)
            r5.cmdStatus = r0
            r7.skipBytes(r3)
            byte r0 = r7.readByte()
            io.netty.handler.codec.socks.SocksAddressType r0 = io.netty.handler.codec.socks.SocksAddressType.valueOf(r0)
            r5.addressType = r0
            io.netty.handler.codec.socks.SocksCmdResponseDecoder$State r0 = io.netty.handler.codec.socks.SocksCmdResponseDecoder.State.READ_CMD_ADDRESS
            r5.checkpoint(r0)
        L52:
            int[] r0 = io.netty.handler.codec.socks.SocksCmdResponseDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$socks$SocksAddressType
            io.netty.handler.codec.socks.SocksAddressType r4 = r5.addressType
            int r4 = r4.ordinal()
            r0 = r0[r4]
            if (r0 == r3) goto La6
            if (r0 == r2) goto L8d
            if (r0 == r1) goto L71
            r7 = 4
            if (r0 != r7) goto L6b
            io.netty.handler.codec.socks.SocksResponse r7 = io.netty.handler.codec.socks.SocksCommonUtils.UNKNOWN_SOCKS_RESPONSE
            r8.add(r7)
            goto Lbe
        L6b:
            java.lang.Error r6 = new java.lang.Error
            r6.<init>()
            throw r6
        L71:
            r0 = 16
            byte[] r0 = new byte[r0]
            r7.readBytes(r0)
            java.lang.String r0 = io.netty.handler.codec.socks.SocksCommonUtils.ipv6toStr(r0)
            int r7 = r7.readUnsignedShort()
            io.netty.handler.codec.socks.SocksCmdResponse r1 = new io.netty.handler.codec.socks.SocksCmdResponse
            io.netty.handler.codec.socks.SocksCmdStatus r2 = r5.cmdStatus
            io.netty.handler.codec.socks.SocksAddressType r3 = r5.addressType
            r1.<init>(r2, r3, r0, r7)
            r8.add(r1)
            goto Lbe
        L8d:
            byte r0 = r7.readByte()
            java.lang.String r0 = io.netty.handler.codec.socks.SocksCommonUtils.readUsAscii(r7, r0)
            int r7 = r7.readUnsignedShort()
            io.netty.handler.codec.socks.SocksCmdResponse r1 = new io.netty.handler.codec.socks.SocksCmdResponse
            io.netty.handler.codec.socks.SocksCmdStatus r2 = r5.cmdStatus
            io.netty.handler.codec.socks.SocksAddressType r3 = r5.addressType
            r1.<init>(r2, r3, r0, r7)
            r8.add(r1)
            goto Lbe
        La6:
            int r0 = r7.readInt()
            java.lang.String r0 = io.netty.util.NetUtil.intToIpAddress(r0)
            int r7 = r7.readUnsignedShort()
            io.netty.handler.codec.socks.SocksCmdResponse r1 = new io.netty.handler.codec.socks.SocksCmdResponse
            io.netty.handler.codec.socks.SocksCmdStatus r2 = r5.cmdStatus
            io.netty.handler.codec.socks.SocksAddressType r3 = r5.addressType
            r1.<init>(r2, r3, r0, r7)
            r8.add(r1)
        Lbe:
            io.netty.channel.ChannelPipeline r6 = r6.pipeline()
            r6.remove(r5)
            return
    }
}
