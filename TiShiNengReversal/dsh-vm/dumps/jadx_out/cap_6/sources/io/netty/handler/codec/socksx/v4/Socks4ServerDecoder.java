package io.netty.handler.codec.socksx.v4;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class Socks4ServerDecoder extends io.netty.handler.codec.ReplayingDecoder<io.netty.handler.codec.socksx.v4.Socks4ServerDecoder.State> {
    private static final int MAX_FIELD_LENGTH = 255;
    private java.lang.String dstAddr;
    private int dstPort;
    private io.netty.handler.codec.socksx.v4.Socks4CommandType type;
    private java.lang.String userId;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.socksx.v4.Socks4ServerDecoder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$socksx$v4$Socks4ServerDecoder$State = null;

        static {
                io.netty.handler.codec.socksx.v4.Socks4ServerDecoder$State[] r0 = io.netty.handler.codec.socksx.v4.Socks4ServerDecoder.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.handler.codec.socksx.v4.Socks4ServerDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$socksx$v4$Socks4ServerDecoder$State = r0
                io.netty.handler.codec.socksx.v4.Socks4ServerDecoder$State r1 = io.netty.handler.codec.socksx.v4.Socks4ServerDecoder.State.START     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.handler.codec.socksx.v4.Socks4ServerDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$socksx$v4$Socks4ServerDecoder$State     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.handler.codec.socksx.v4.Socks4ServerDecoder$State r1 = io.netty.handler.codec.socksx.v4.Socks4ServerDecoder.State.READ_USERID     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.netty.handler.codec.socksx.v4.Socks4ServerDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$socksx$v4$Socks4ServerDecoder$State     // Catch: java.lang.NoSuchFieldError -> L28
                io.netty.handler.codec.socksx.v4.Socks4ServerDecoder$State r1 = io.netty.handler.codec.socksx.v4.Socks4ServerDecoder.State.READ_DOMAIN     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = io.netty.handler.codec.socksx.v4.Socks4ServerDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$socksx$v4$Socks4ServerDecoder$State     // Catch: java.lang.NoSuchFieldError -> L33
                io.netty.handler.codec.socksx.v4.Socks4ServerDecoder$State r1 = io.netty.handler.codec.socksx.v4.Socks4ServerDecoder.State.SUCCESS     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = io.netty.handler.codec.socksx.v4.Socks4ServerDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$socksx$v4$Socks4ServerDecoder$State     // Catch: java.lang.NoSuchFieldError -> L3e
                io.netty.handler.codec.socksx.v4.Socks4ServerDecoder$State r1 = io.netty.handler.codec.socksx.v4.Socks4ServerDecoder.State.FAILURE     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    enum State extends java.lang.Enum<io.netty.handler.codec.socksx.v4.Socks4ServerDecoder.State> {
        private static final /* synthetic */ io.netty.handler.codec.socksx.v4.Socks4ServerDecoder.State[] $VALUES = null;
        public static final io.netty.handler.codec.socksx.v4.Socks4ServerDecoder.State FAILURE = null;
        public static final io.netty.handler.codec.socksx.v4.Socks4ServerDecoder.State READ_DOMAIN = null;
        public static final io.netty.handler.codec.socksx.v4.Socks4ServerDecoder.State READ_USERID = null;
        public static final io.netty.handler.codec.socksx.v4.Socks4ServerDecoder.State START = null;
        public static final io.netty.handler.codec.socksx.v4.Socks4ServerDecoder.State SUCCESS = null;

        static {
                io.netty.handler.codec.socksx.v4.Socks4ServerDecoder$State r0 = new io.netty.handler.codec.socksx.v4.Socks4ServerDecoder$State
                java.lang.String r1 = "START"
                r2 = 0
                r0.<init>(r1, r2)
                io.netty.handler.codec.socksx.v4.Socks4ServerDecoder.State.START = r0
                io.netty.handler.codec.socksx.v4.Socks4ServerDecoder$State r1 = new io.netty.handler.codec.socksx.v4.Socks4ServerDecoder$State
                java.lang.String r3 = "READ_USERID"
                r4 = 1
                r1.<init>(r3, r4)
                io.netty.handler.codec.socksx.v4.Socks4ServerDecoder.State.READ_USERID = r1
                io.netty.handler.codec.socksx.v4.Socks4ServerDecoder$State r3 = new io.netty.handler.codec.socksx.v4.Socks4ServerDecoder$State
                java.lang.String r5 = "READ_DOMAIN"
                r6 = 2
                r3.<init>(r5, r6)
                io.netty.handler.codec.socksx.v4.Socks4ServerDecoder.State.READ_DOMAIN = r3
                io.netty.handler.codec.socksx.v4.Socks4ServerDecoder$State r5 = new io.netty.handler.codec.socksx.v4.Socks4ServerDecoder$State
                java.lang.String r7 = "SUCCESS"
                r8 = 3
                r5.<init>(r7, r8)
                io.netty.handler.codec.socksx.v4.Socks4ServerDecoder.State.SUCCESS = r5
                io.netty.handler.codec.socksx.v4.Socks4ServerDecoder$State r7 = new io.netty.handler.codec.socksx.v4.Socks4ServerDecoder$State
                java.lang.String r9 = "FAILURE"
                r10 = 4
                r7.<init>(r9, r10)
                io.netty.handler.codec.socksx.v4.Socks4ServerDecoder.State.FAILURE = r7
                r9 = 5
                io.netty.handler.codec.socksx.v4.Socks4ServerDecoder$State[] r9 = new io.netty.handler.codec.socksx.v4.Socks4ServerDecoder.State[r9]
                r9[r2] = r0
                r9[r4] = r1
                r9[r6] = r3
                r9[r8] = r5
                r9[r10] = r7
                io.netty.handler.codec.socksx.v4.Socks4ServerDecoder.State.$VALUES = r9
                return
        }

        State(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.netty.handler.codec.socksx.v4.Socks4ServerDecoder.State valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.handler.codec.socksx.v4.Socks4ServerDecoder$State> r0 = io.netty.handler.codec.socksx.v4.Socks4ServerDecoder.State.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.handler.codec.socksx.v4.Socks4ServerDecoder$State r1 = (io.netty.handler.codec.socksx.v4.Socks4ServerDecoder.State) r1
                return r1
        }

        public static io.netty.handler.codec.socksx.v4.Socks4ServerDecoder.State[] values() {
                io.netty.handler.codec.socksx.v4.Socks4ServerDecoder$State[] r0 = io.netty.handler.codec.socksx.v4.Socks4ServerDecoder.State.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.handler.codec.socksx.v4.Socks4ServerDecoder$State[] r0 = (io.netty.handler.codec.socksx.v4.Socks4ServerDecoder.State[]) r0
                return r0
        }
    }

    public Socks4ServerDecoder() {
            r1 = this;
            io.netty.handler.codec.socksx.v4.Socks4ServerDecoder$State r0 = io.netty.handler.codec.socksx.v4.Socks4ServerDecoder.State.START
            r1.<init>(r0)
            r0 = 1
            r1.setSingleDecode(r0)
            return
    }

    private void fail(java.util.List<java.lang.Object> r7, java.lang.Exception r8) {
            r6 = this;
            boolean r0 = r8 instanceof io.netty.handler.codec.DecoderException
            if (r0 != 0) goto La
            io.netty.handler.codec.DecoderException r0 = new io.netty.handler.codec.DecoderException
            r0.<init>(r8)
            r8 = r0
        La:
            io.netty.handler.codec.socksx.v4.DefaultSocks4CommandRequest r0 = new io.netty.handler.codec.socksx.v4.DefaultSocks4CommandRequest
            io.netty.handler.codec.socksx.v4.Socks4CommandType r1 = r6.type
            if (r1 == 0) goto L11
            goto L13
        L11:
            io.netty.handler.codec.socksx.v4.Socks4CommandType r1 = io.netty.handler.codec.socksx.v4.Socks4CommandType.CONNECT
        L13:
            java.lang.String r2 = r6.dstAddr
            java.lang.String r3 = ""
            if (r2 == 0) goto L1a
            goto L1b
        L1a:
            r2 = r3
        L1b:
            int r4 = r6.dstPort
            if (r4 == 0) goto L20
            goto L23
        L20:
            r4 = 65535(0xffff, float:9.1834E-41)
        L23:
            java.lang.String r5 = r6.userId
            if (r5 == 0) goto L28
            r3 = r5
        L28:
            r0.<init>(r1, r2, r4, r3)
            io.netty.handler.codec.DecoderResult r8 = io.netty.handler.codec.DecoderResult.failure(r8)
            r0.setDecoderResult(r8)
            r7.add(r0)
            io.netty.handler.codec.socksx.v4.Socks4ServerDecoder$State r7 = io.netty.handler.codec.socksx.v4.Socks4ServerDecoder.State.FAILURE
            r6.checkpoint(r7)
            return
    }

    private static java.lang.String readString(java.lang.String r2, io.netty.buffer.ByteBuf r3) {
            r0 = 256(0x100, float:3.59E-43)
            r1 = 0
            int r0 = r3.bytesBefore(r0, r1)
            if (r0 < 0) goto L18
            io.netty.buffer.ByteBuf r2 = r3.readSlice(r0)
            java.nio.charset.Charset r0 = io.netty.util.CharsetUtil.US_ASCII
            java.lang.String r2 = r2.toString(r0)
            r0 = 1
            r3.skipBytes(r0)
            return r2
        L18:
            io.netty.handler.codec.DecoderException r3 = new io.netty.handler.codec.DecoderException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "field '"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = "' longer than "
            r0.append(r2)
            r2 = 255(0xff, float:3.57E-43)
            r0.append(r2)
            java.lang.String r2 = " chars"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
    }

    @Override // io.netty.handler.codec.ByteToMessageDecoder
    protected void decode(io.netty.channel.ChannelHandlerContext r5, io.netty.buffer.ByteBuf r6, java.util.List<java.lang.Object> r7) throws java.lang.Exception {
            r4 = this;
            int[] r5 = io.netty.handler.codec.socksx.v4.Socks4ServerDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$socksx$v4$Socks4ServerDecoder$State     // Catch: java.lang.Exception -> L27
            java.lang.Object r0 = r4.state()     // Catch: java.lang.Exception -> L27
            io.netty.handler.codec.socksx.v4.Socks4ServerDecoder$State r0 = (io.netty.handler.codec.socksx.v4.Socks4ServerDecoder.State) r0     // Catch: java.lang.Exception -> L27
            int r0 = r0.ordinal()     // Catch: java.lang.Exception -> L27
            r5 = r5[r0]     // Catch: java.lang.Exception -> L27
            r0 = 1
            if (r5 == r0) goto L2a
            r0 = 2
            if (r5 == r0) goto L55
            r0 = 3
            if (r5 == r0) goto L62
            r0 = 4
            if (r5 == r0) goto L93
            r0 = 5
            if (r5 == r0) goto L1f
            goto La0
        L1f:
            int r5 = r4.actualReadableBytes()     // Catch: java.lang.Exception -> L27
            r6.skipBytes(r5)     // Catch: java.lang.Exception -> L27
            return
        L27:
            r5 = move-exception
            goto Lb8
        L2a:
            short r5 = r6.readUnsignedByte()     // Catch: java.lang.Exception -> L27
            io.netty.handler.codec.socksx.SocksVersion r0 = io.netty.handler.codec.socksx.SocksVersion.SOCKS4a     // Catch: java.lang.Exception -> L27
            byte r0 = r0.byteValue()     // Catch: java.lang.Exception -> L27
            if (r5 != r0) goto La1
            byte r5 = r6.readByte()     // Catch: java.lang.Exception -> L27
            io.netty.handler.codec.socksx.v4.Socks4CommandType r5 = io.netty.handler.codec.socksx.v4.Socks4CommandType.valueOf(r5)     // Catch: java.lang.Exception -> L27
            r4.type = r5     // Catch: java.lang.Exception -> L27
            int r5 = r6.readUnsignedShort()     // Catch: java.lang.Exception -> L27
            r4.dstPort = r5     // Catch: java.lang.Exception -> L27
            int r5 = r6.readInt()     // Catch: java.lang.Exception -> L27
            java.lang.String r5 = io.netty.util.NetUtil.intToIpAddress(r5)     // Catch: java.lang.Exception -> L27
            r4.dstAddr = r5     // Catch: java.lang.Exception -> L27
            io.netty.handler.codec.socksx.v4.Socks4ServerDecoder$State r5 = io.netty.handler.codec.socksx.v4.Socks4ServerDecoder.State.READ_USERID     // Catch: java.lang.Exception -> L27
            r4.checkpoint(r5)     // Catch: java.lang.Exception -> L27
        L55:
            java.lang.String r5 = "userid"
            java.lang.String r5 = readString(r5, r6)     // Catch: java.lang.Exception -> L27
            r4.userId = r5     // Catch: java.lang.Exception -> L27
            io.netty.handler.codec.socksx.v4.Socks4ServerDecoder$State r5 = io.netty.handler.codec.socksx.v4.Socks4ServerDecoder.State.READ_DOMAIN     // Catch: java.lang.Exception -> L27
            r4.checkpoint(r5)     // Catch: java.lang.Exception -> L27
        L62:
            java.lang.String r5 = "0.0.0.0"
            java.lang.String r0 = r4.dstAddr     // Catch: java.lang.Exception -> L27
            boolean r5 = r5.equals(r0)     // Catch: java.lang.Exception -> L27
            if (r5 != 0) goto L7e
            java.lang.String r5 = r4.dstAddr     // Catch: java.lang.Exception -> L27
            java.lang.String r0 = "0.0.0."
            boolean r5 = r5.startsWith(r0)     // Catch: java.lang.Exception -> L27
            if (r5 == 0) goto L7e
            java.lang.String r5 = "dstAddr"
            java.lang.String r5 = readString(r5, r6)     // Catch: java.lang.Exception -> L27
            r4.dstAddr = r5     // Catch: java.lang.Exception -> L27
        L7e:
            io.netty.handler.codec.socksx.v4.DefaultSocks4CommandRequest r5 = new io.netty.handler.codec.socksx.v4.DefaultSocks4CommandRequest     // Catch: java.lang.Exception -> L27
            io.netty.handler.codec.socksx.v4.Socks4CommandType r0 = r4.type     // Catch: java.lang.Exception -> L27
            java.lang.String r1 = r4.dstAddr     // Catch: java.lang.Exception -> L27
            int r2 = r4.dstPort     // Catch: java.lang.Exception -> L27
            java.lang.String r3 = r4.userId     // Catch: java.lang.Exception -> L27
            r5.<init>(r0, r1, r2, r3)     // Catch: java.lang.Exception -> L27
            r7.add(r5)     // Catch: java.lang.Exception -> L27
            io.netty.handler.codec.socksx.v4.Socks4ServerDecoder$State r5 = io.netty.handler.codec.socksx.v4.Socks4ServerDecoder.State.SUCCESS     // Catch: java.lang.Exception -> L27
            r4.checkpoint(r5)     // Catch: java.lang.Exception -> L27
        L93:
            int r5 = r4.actualReadableBytes()     // Catch: java.lang.Exception -> L27
            if (r5 <= 0) goto La0
            io.netty.buffer.ByteBuf r5 = r6.readRetainedSlice(r5)     // Catch: java.lang.Exception -> L27
            r7.add(r5)     // Catch: java.lang.Exception -> L27
        La0:
            return
        La1:
            io.netty.handler.codec.DecoderException r6 = new io.netty.handler.codec.DecoderException     // Catch: java.lang.Exception -> L27
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L27
            r0.<init>()     // Catch: java.lang.Exception -> L27
            java.lang.String r1 = "unsupported protocol version: "
            r0.append(r1)     // Catch: java.lang.Exception -> L27
            r0.append(r5)     // Catch: java.lang.Exception -> L27
            java.lang.String r5 = r0.toString()     // Catch: java.lang.Exception -> L27
            r6.<init>(r5)     // Catch: java.lang.Exception -> L27
            throw r6     // Catch: java.lang.Exception -> L27
        Lb8:
            r4.fail(r7, r5)
            return
    }
}
