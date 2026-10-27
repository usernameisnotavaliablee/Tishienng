package io.netty.handler.codec.socksx.v5;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class Socks5InitialResponseDecoder extends io.netty.handler.codec.ReplayingDecoder<io.netty.handler.codec.socksx.v5.Socks5InitialResponseDecoder.State> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.socksx.v5.Socks5InitialResponseDecoder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$socksx$v5$Socks5InitialResponseDecoder$State = null;

        static {
                io.netty.handler.codec.socksx.v5.Socks5InitialResponseDecoder$State[] r0 = io.netty.handler.codec.socksx.v5.Socks5InitialResponseDecoder.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.handler.codec.socksx.v5.Socks5InitialResponseDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$socksx$v5$Socks5InitialResponseDecoder$State = r0
                io.netty.handler.codec.socksx.v5.Socks5InitialResponseDecoder$State r1 = io.netty.handler.codec.socksx.v5.Socks5InitialResponseDecoder.State.INIT     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.handler.codec.socksx.v5.Socks5InitialResponseDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$socksx$v5$Socks5InitialResponseDecoder$State     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.handler.codec.socksx.v5.Socks5InitialResponseDecoder$State r1 = io.netty.handler.codec.socksx.v5.Socks5InitialResponseDecoder.State.SUCCESS     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.netty.handler.codec.socksx.v5.Socks5InitialResponseDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$socksx$v5$Socks5InitialResponseDecoder$State     // Catch: java.lang.NoSuchFieldError -> L28
                io.netty.handler.codec.socksx.v5.Socks5InitialResponseDecoder$State r1 = io.netty.handler.codec.socksx.v5.Socks5InitialResponseDecoder.State.FAILURE     // Catch: java.lang.NoSuchFieldError -> L28
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
    enum State extends java.lang.Enum<io.netty.handler.codec.socksx.v5.Socks5InitialResponseDecoder.State> {
        private static final /* synthetic */ io.netty.handler.codec.socksx.v5.Socks5InitialResponseDecoder.State[] $VALUES = null;
        public static final io.netty.handler.codec.socksx.v5.Socks5InitialResponseDecoder.State FAILURE = null;
        public static final io.netty.handler.codec.socksx.v5.Socks5InitialResponseDecoder.State INIT = null;
        public static final io.netty.handler.codec.socksx.v5.Socks5InitialResponseDecoder.State SUCCESS = null;

        static {
                io.netty.handler.codec.socksx.v5.Socks5InitialResponseDecoder$State r0 = new io.netty.handler.codec.socksx.v5.Socks5InitialResponseDecoder$State
                java.lang.String r1 = "INIT"
                r2 = 0
                r0.<init>(r1, r2)
                io.netty.handler.codec.socksx.v5.Socks5InitialResponseDecoder.State.INIT = r0
                io.netty.handler.codec.socksx.v5.Socks5InitialResponseDecoder$State r1 = new io.netty.handler.codec.socksx.v5.Socks5InitialResponseDecoder$State
                java.lang.String r3 = "SUCCESS"
                r4 = 1
                r1.<init>(r3, r4)
                io.netty.handler.codec.socksx.v5.Socks5InitialResponseDecoder.State.SUCCESS = r1
                io.netty.handler.codec.socksx.v5.Socks5InitialResponseDecoder$State r3 = new io.netty.handler.codec.socksx.v5.Socks5InitialResponseDecoder$State
                java.lang.String r5 = "FAILURE"
                r6 = 2
                r3.<init>(r5, r6)
                io.netty.handler.codec.socksx.v5.Socks5InitialResponseDecoder.State.FAILURE = r3
                r5 = 3
                io.netty.handler.codec.socksx.v5.Socks5InitialResponseDecoder$State[] r5 = new io.netty.handler.codec.socksx.v5.Socks5InitialResponseDecoder.State[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                io.netty.handler.codec.socksx.v5.Socks5InitialResponseDecoder.State.$VALUES = r5
                return
        }

        State(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.netty.handler.codec.socksx.v5.Socks5InitialResponseDecoder.State valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.handler.codec.socksx.v5.Socks5InitialResponseDecoder$State> r0 = io.netty.handler.codec.socksx.v5.Socks5InitialResponseDecoder.State.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.handler.codec.socksx.v5.Socks5InitialResponseDecoder$State r1 = (io.netty.handler.codec.socksx.v5.Socks5InitialResponseDecoder.State) r1
                return r1
        }

        public static io.netty.handler.codec.socksx.v5.Socks5InitialResponseDecoder.State[] values() {
                io.netty.handler.codec.socksx.v5.Socks5InitialResponseDecoder$State[] r0 = io.netty.handler.codec.socksx.v5.Socks5InitialResponseDecoder.State.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.handler.codec.socksx.v5.Socks5InitialResponseDecoder$State[] r0 = (io.netty.handler.codec.socksx.v5.Socks5InitialResponseDecoder.State[]) r0
                return r0
        }
    }

    public Socks5InitialResponseDecoder() {
            r1 = this;
            io.netty.handler.codec.socksx.v5.Socks5InitialResponseDecoder$State r0 = io.netty.handler.codec.socksx.v5.Socks5InitialResponseDecoder.State.INIT
            r1.<init>(r0)
            return
    }

    private void fail(java.util.List<java.lang.Object> r3, java.lang.Exception r4) {
            r2 = this;
            boolean r0 = r4 instanceof io.netty.handler.codec.DecoderException
            if (r0 != 0) goto La
            io.netty.handler.codec.DecoderException r0 = new io.netty.handler.codec.DecoderException
            r0.<init>(r4)
            r4 = r0
        La:
            io.netty.handler.codec.socksx.v5.Socks5InitialResponseDecoder$State r0 = io.netty.handler.codec.socksx.v5.Socks5InitialResponseDecoder.State.FAILURE
            r2.checkpoint(r0)
            io.netty.handler.codec.socksx.v5.DefaultSocks5InitialResponse r0 = new io.netty.handler.codec.socksx.v5.DefaultSocks5InitialResponse
            io.netty.handler.codec.socksx.v5.Socks5AuthMethod r1 = io.netty.handler.codec.socksx.v5.Socks5AuthMethod.UNACCEPTED
            r0.<init>(r1)
            io.netty.handler.codec.DecoderResult r4 = io.netty.handler.codec.DecoderResult.failure(r4)
            r0.setDecoderResult(r4)
            r3.add(r0)
            return
    }

    @Override // io.netty.handler.codec.ByteToMessageDecoder
    protected void decode(io.netty.channel.ChannelHandlerContext r4, io.netty.buffer.ByteBuf r5, java.util.List<java.lang.Object> r6) throws java.lang.Exception {
            r3 = this;
            int[] r4 = io.netty.handler.codec.socksx.v5.Socks5InitialResponseDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$socksx$v5$Socks5InitialResponseDecoder$State     // Catch: java.lang.Exception -> L20
            java.lang.Object r0 = r3.state()     // Catch: java.lang.Exception -> L20
            io.netty.handler.codec.socksx.v5.Socks5InitialResponseDecoder$State r0 = (io.netty.handler.codec.socksx.v5.Socks5InitialResponseDecoder.State) r0     // Catch: java.lang.Exception -> L20
            int r0 = r0.ordinal()     // Catch: java.lang.Exception -> L20
            r4 = r4[r0]     // Catch: java.lang.Exception -> L20
            r0 = 1
            if (r4 == r0) goto L22
            r0 = 2
            if (r4 == r0) goto L43
            r0 = 3
            if (r4 == r0) goto L18
            goto L50
        L18:
            int r4 = r3.actualReadableBytes()     // Catch: java.lang.Exception -> L20
            r5.skipBytes(r4)     // Catch: java.lang.Exception -> L20
            return
        L20:
            r4 = move-exception
            goto L79
        L22:
            byte r4 = r5.readByte()     // Catch: java.lang.Exception -> L20
            io.netty.handler.codec.socksx.SocksVersion r0 = io.netty.handler.codec.socksx.SocksVersion.SOCKS5     // Catch: java.lang.Exception -> L20
            byte r1 = r0.byteValue()     // Catch: java.lang.Exception -> L20
            if (r4 != r1) goto L51
            byte r4 = r5.readByte()     // Catch: java.lang.Exception -> L20
            io.netty.handler.codec.socksx.v5.Socks5AuthMethod r4 = io.netty.handler.codec.socksx.v5.Socks5AuthMethod.valueOf(r4)     // Catch: java.lang.Exception -> L20
            io.netty.handler.codec.socksx.v5.DefaultSocks5InitialResponse r0 = new io.netty.handler.codec.socksx.v5.DefaultSocks5InitialResponse     // Catch: java.lang.Exception -> L20
            r0.<init>(r4)     // Catch: java.lang.Exception -> L20
            r6.add(r0)     // Catch: java.lang.Exception -> L20
            io.netty.handler.codec.socksx.v5.Socks5InitialResponseDecoder$State r4 = io.netty.handler.codec.socksx.v5.Socks5InitialResponseDecoder.State.SUCCESS     // Catch: java.lang.Exception -> L20
            r3.checkpoint(r4)     // Catch: java.lang.Exception -> L20
        L43:
            int r4 = r3.actualReadableBytes()     // Catch: java.lang.Exception -> L20
            if (r4 <= 0) goto L50
            io.netty.buffer.ByteBuf r4 = r5.readRetainedSlice(r4)     // Catch: java.lang.Exception -> L20
            r6.add(r4)     // Catch: java.lang.Exception -> L20
        L50:
            return
        L51:
            io.netty.handler.codec.DecoderException r5 = new io.netty.handler.codec.DecoderException     // Catch: java.lang.Exception -> L20
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L20
            r1.<init>()     // Catch: java.lang.Exception -> L20
            java.lang.String r2 = "unsupported version: "
            r1.append(r2)     // Catch: java.lang.Exception -> L20
            r1.append(r4)     // Catch: java.lang.Exception -> L20
            java.lang.String r4 = " (expected: "
            r1.append(r4)     // Catch: java.lang.Exception -> L20
            byte r4 = r0.byteValue()     // Catch: java.lang.Exception -> L20
            r1.append(r4)     // Catch: java.lang.Exception -> L20
            r4 = 41
            r1.append(r4)     // Catch: java.lang.Exception -> L20
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Exception -> L20
            r5.<init>(r4)     // Catch: java.lang.Exception -> L20
            throw r5     // Catch: java.lang.Exception -> L20
        L79:
            r3.fail(r6, r4)
            return
    }
}
