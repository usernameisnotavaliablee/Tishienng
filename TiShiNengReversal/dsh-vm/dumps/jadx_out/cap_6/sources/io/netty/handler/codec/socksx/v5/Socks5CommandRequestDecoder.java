package io.netty.handler.codec.socksx.v5;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class Socks5CommandRequestDecoder extends io.netty.handler.codec.ReplayingDecoder<io.netty.handler.codec.socksx.v5.Socks5CommandRequestDecoder.State> {
    private final io.netty.handler.codec.socksx.v5.Socks5AddressDecoder addressDecoder;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.socksx.v5.Socks5CommandRequestDecoder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$socksx$v5$Socks5CommandRequestDecoder$State = null;

        static {
                io.netty.handler.codec.socksx.v5.Socks5CommandRequestDecoder$State[] r0 = io.netty.handler.codec.socksx.v5.Socks5CommandRequestDecoder.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.handler.codec.socksx.v5.Socks5CommandRequestDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$socksx$v5$Socks5CommandRequestDecoder$State = r0
                io.netty.handler.codec.socksx.v5.Socks5CommandRequestDecoder$State r1 = io.netty.handler.codec.socksx.v5.Socks5CommandRequestDecoder.State.INIT     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.handler.codec.socksx.v5.Socks5CommandRequestDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$socksx$v5$Socks5CommandRequestDecoder$State     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.handler.codec.socksx.v5.Socks5CommandRequestDecoder$State r1 = io.netty.handler.codec.socksx.v5.Socks5CommandRequestDecoder.State.SUCCESS     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.netty.handler.codec.socksx.v5.Socks5CommandRequestDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$socksx$v5$Socks5CommandRequestDecoder$State     // Catch: java.lang.NoSuchFieldError -> L28
                io.netty.handler.codec.socksx.v5.Socks5CommandRequestDecoder$State r1 = io.netty.handler.codec.socksx.v5.Socks5CommandRequestDecoder.State.FAILURE     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    enum State extends java.lang.Enum<io.netty.handler.codec.socksx.v5.Socks5CommandRequestDecoder.State> {
        private static final /* synthetic */ io.netty.handler.codec.socksx.v5.Socks5CommandRequestDecoder.State[] $VALUES = null;
        public static final io.netty.handler.codec.socksx.v5.Socks5CommandRequestDecoder.State FAILURE = null;
        public static final io.netty.handler.codec.socksx.v5.Socks5CommandRequestDecoder.State INIT = null;
        public static final io.netty.handler.codec.socksx.v5.Socks5CommandRequestDecoder.State SUCCESS = null;

        static {
                io.netty.handler.codec.socksx.v5.Socks5CommandRequestDecoder$State r0 = new io.netty.handler.codec.socksx.v5.Socks5CommandRequestDecoder$State
                java.lang.String r1 = "INIT"
                r2 = 0
                r0.<init>(r1, r2)
                io.netty.handler.codec.socksx.v5.Socks5CommandRequestDecoder.State.INIT = r0
                io.netty.handler.codec.socksx.v5.Socks5CommandRequestDecoder$State r1 = new io.netty.handler.codec.socksx.v5.Socks5CommandRequestDecoder$State
                java.lang.String r3 = "SUCCESS"
                r4 = 1
                r1.<init>(r3, r4)
                io.netty.handler.codec.socksx.v5.Socks5CommandRequestDecoder.State.SUCCESS = r1
                io.netty.handler.codec.socksx.v5.Socks5CommandRequestDecoder$State r3 = new io.netty.handler.codec.socksx.v5.Socks5CommandRequestDecoder$State
                java.lang.String r5 = "FAILURE"
                r6 = 2
                r3.<init>(r5, r6)
                io.netty.handler.codec.socksx.v5.Socks5CommandRequestDecoder.State.FAILURE = r3
                r5 = 3
                io.netty.handler.codec.socksx.v5.Socks5CommandRequestDecoder$State[] r5 = new io.netty.handler.codec.socksx.v5.Socks5CommandRequestDecoder.State[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                io.netty.handler.codec.socksx.v5.Socks5CommandRequestDecoder.State.$VALUES = r5
                return
        }

        State(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.netty.handler.codec.socksx.v5.Socks5CommandRequestDecoder.State valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.handler.codec.socksx.v5.Socks5CommandRequestDecoder$State> r0 = io.netty.handler.codec.socksx.v5.Socks5CommandRequestDecoder.State.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.handler.codec.socksx.v5.Socks5CommandRequestDecoder$State r1 = (io.netty.handler.codec.socksx.v5.Socks5CommandRequestDecoder.State) r1
                return r1
        }

        public static io.netty.handler.codec.socksx.v5.Socks5CommandRequestDecoder.State[] values() {
                io.netty.handler.codec.socksx.v5.Socks5CommandRequestDecoder$State[] r0 = io.netty.handler.codec.socksx.v5.Socks5CommandRequestDecoder.State.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.handler.codec.socksx.v5.Socks5CommandRequestDecoder$State[] r0 = (io.netty.handler.codec.socksx.v5.Socks5CommandRequestDecoder.State[]) r0
                return r0
        }
    }

    public Socks5CommandRequestDecoder() {
            r1 = this;
            io.netty.handler.codec.socksx.v5.Socks5AddressDecoder r0 = io.netty.handler.codec.socksx.v5.Socks5AddressDecoder.DEFAULT
            r1.<init>(r0)
            return
    }

    public Socks5CommandRequestDecoder(io.netty.handler.codec.socksx.v5.Socks5AddressDecoder r2) {
            r1 = this;
            io.netty.handler.codec.socksx.v5.Socks5CommandRequestDecoder$State r0 = io.netty.handler.codec.socksx.v5.Socks5CommandRequestDecoder.State.INIT
            r1.<init>(r0)
            if (r2 == 0) goto La
            r1.addressDecoder = r2
            return
        La:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "addressDecoder"
            r2.<init>(r0)
            throw r2
    }

    private void fail(java.util.List<java.lang.Object> r6, java.lang.Exception r7) {
            r5 = this;
            boolean r0 = r7 instanceof io.netty.handler.codec.DecoderException
            if (r0 != 0) goto La
            io.netty.handler.codec.DecoderException r0 = new io.netty.handler.codec.DecoderException
            r0.<init>(r7)
            r7 = r0
        La:
            io.netty.handler.codec.socksx.v5.Socks5CommandRequestDecoder$State r0 = io.netty.handler.codec.socksx.v5.Socks5CommandRequestDecoder.State.FAILURE
            r5.checkpoint(r0)
            io.netty.handler.codec.socksx.v5.DefaultSocks5CommandRequest r0 = new io.netty.handler.codec.socksx.v5.DefaultSocks5CommandRequest
            io.netty.handler.codec.socksx.v5.Socks5CommandType r1 = io.netty.handler.codec.socksx.v5.Socks5CommandType.CONNECT
            io.netty.handler.codec.socksx.v5.Socks5AddressType r2 = io.netty.handler.codec.socksx.v5.Socks5AddressType.IPv4
            java.lang.String r3 = "0.0.0.0"
            r4 = 1
            r0.<init>(r1, r2, r3, r4)
            io.netty.handler.codec.DecoderResult r7 = io.netty.handler.codec.DecoderResult.failure(r7)
            r0.setDecoderResult(r7)
            r6.add(r0)
            return
    }

    @Override // io.netty.handler.codec.ByteToMessageDecoder
    protected void decode(io.netty.channel.ChannelHandlerContext r5, io.netty.buffer.ByteBuf r6, java.util.List<java.lang.Object> r7) throws java.lang.Exception {
            r4 = this;
            int[] r5 = io.netty.handler.codec.socksx.v5.Socks5CommandRequestDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$socksx$v5$Socks5CommandRequestDecoder$State     // Catch: java.lang.Exception -> L20
            java.lang.Object r0 = r4.state()     // Catch: java.lang.Exception -> L20
            io.netty.handler.codec.socksx.v5.Socks5CommandRequestDecoder$State r0 = (io.netty.handler.codec.socksx.v5.Socks5CommandRequestDecoder.State) r0     // Catch: java.lang.Exception -> L20
            int r0 = r0.ordinal()     // Catch: java.lang.Exception -> L20
            r5 = r5[r0]     // Catch: java.lang.Exception -> L20
            r0 = 1
            if (r5 == r0) goto L22
            r0 = 2
            if (r5 == r0) goto L58
            r0 = 3
            if (r5 == r0) goto L18
            goto L65
        L18:
            int r5 = r4.actualReadableBytes()     // Catch: java.lang.Exception -> L20
            r6.skipBytes(r5)     // Catch: java.lang.Exception -> L20
            return
        L20:
            r5 = move-exception
            goto L8e
        L22:
            byte r5 = r6.readByte()     // Catch: java.lang.Exception -> L20
            io.netty.handler.codec.socksx.SocksVersion r1 = io.netty.handler.codec.socksx.SocksVersion.SOCKS5     // Catch: java.lang.Exception -> L20
            byte r2 = r1.byteValue()     // Catch: java.lang.Exception -> L20
            if (r5 != r2) goto L66
            byte r5 = r6.readByte()     // Catch: java.lang.Exception -> L20
            io.netty.handler.codec.socksx.v5.Socks5CommandType r5 = io.netty.handler.codec.socksx.v5.Socks5CommandType.valueOf(r5)     // Catch: java.lang.Exception -> L20
            r6.skipBytes(r0)     // Catch: java.lang.Exception -> L20
            byte r0 = r6.readByte()     // Catch: java.lang.Exception -> L20
            io.netty.handler.codec.socksx.v5.Socks5AddressType r0 = io.netty.handler.codec.socksx.v5.Socks5AddressType.valueOf(r0)     // Catch: java.lang.Exception -> L20
            io.netty.handler.codec.socksx.v5.Socks5AddressDecoder r1 = r4.addressDecoder     // Catch: java.lang.Exception -> L20
            java.lang.String r1 = r1.decodeAddress(r0, r6)     // Catch: java.lang.Exception -> L20
            int r2 = r6.readUnsignedShort()     // Catch: java.lang.Exception -> L20
            io.netty.handler.codec.socksx.v5.DefaultSocks5CommandRequest r3 = new io.netty.handler.codec.socksx.v5.DefaultSocks5CommandRequest     // Catch: java.lang.Exception -> L20
            r3.<init>(r5, r0, r1, r2)     // Catch: java.lang.Exception -> L20
            r7.add(r3)     // Catch: java.lang.Exception -> L20
            io.netty.handler.codec.socksx.v5.Socks5CommandRequestDecoder$State r5 = io.netty.handler.codec.socksx.v5.Socks5CommandRequestDecoder.State.SUCCESS     // Catch: java.lang.Exception -> L20
            r4.checkpoint(r5)     // Catch: java.lang.Exception -> L20
        L58:
            int r5 = r4.actualReadableBytes()     // Catch: java.lang.Exception -> L20
            if (r5 <= 0) goto L65
            io.netty.buffer.ByteBuf r5 = r6.readRetainedSlice(r5)     // Catch: java.lang.Exception -> L20
            r7.add(r5)     // Catch: java.lang.Exception -> L20
        L65:
            return
        L66:
            io.netty.handler.codec.DecoderException r6 = new io.netty.handler.codec.DecoderException     // Catch: java.lang.Exception -> L20
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L20
            r0.<init>()     // Catch: java.lang.Exception -> L20
            java.lang.String r2 = "unsupported version: "
            r0.append(r2)     // Catch: java.lang.Exception -> L20
            r0.append(r5)     // Catch: java.lang.Exception -> L20
            java.lang.String r5 = " (expected: "
            r0.append(r5)     // Catch: java.lang.Exception -> L20
            byte r5 = r1.byteValue()     // Catch: java.lang.Exception -> L20
            r0.append(r5)     // Catch: java.lang.Exception -> L20
            r5 = 41
            r0.append(r5)     // Catch: java.lang.Exception -> L20
            java.lang.String r5 = r0.toString()     // Catch: java.lang.Exception -> L20
            r6.<init>(r5)     // Catch: java.lang.Exception -> L20
            throw r6     // Catch: java.lang.Exception -> L20
        L8e:
            r4.fail(r7, r5)
            return
    }
}
