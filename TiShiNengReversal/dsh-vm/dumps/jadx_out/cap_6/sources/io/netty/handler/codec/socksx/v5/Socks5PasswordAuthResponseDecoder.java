package io.netty.handler.codec.socksx.v5;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class Socks5PasswordAuthResponseDecoder extends io.netty.handler.codec.ReplayingDecoder<io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponseDecoder.State> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponseDecoder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$socksx$v5$Socks5PasswordAuthResponseDecoder$State = null;

        static {
                io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponseDecoder$State[] r0 = io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponseDecoder.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponseDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$socksx$v5$Socks5PasswordAuthResponseDecoder$State = r0
                io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponseDecoder$State r1 = io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponseDecoder.State.INIT     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponseDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$socksx$v5$Socks5PasswordAuthResponseDecoder$State     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponseDecoder$State r1 = io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponseDecoder.State.SUCCESS     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponseDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$socksx$v5$Socks5PasswordAuthResponseDecoder$State     // Catch: java.lang.NoSuchFieldError -> L28
                io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponseDecoder$State r1 = io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponseDecoder.State.FAILURE     // Catch: java.lang.NoSuchFieldError -> L28
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
    enum State extends java.lang.Enum<io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponseDecoder.State> {
        private static final /* synthetic */ io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponseDecoder.State[] $VALUES = null;
        public static final io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponseDecoder.State FAILURE = null;
        public static final io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponseDecoder.State INIT = null;
        public static final io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponseDecoder.State SUCCESS = null;

        static {
                io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponseDecoder$State r0 = new io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponseDecoder$State
                java.lang.String r1 = "INIT"
                r2 = 0
                r0.<init>(r1, r2)
                io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponseDecoder.State.INIT = r0
                io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponseDecoder$State r1 = new io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponseDecoder$State
                java.lang.String r3 = "SUCCESS"
                r4 = 1
                r1.<init>(r3, r4)
                io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponseDecoder.State.SUCCESS = r1
                io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponseDecoder$State r3 = new io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponseDecoder$State
                java.lang.String r5 = "FAILURE"
                r6 = 2
                r3.<init>(r5, r6)
                io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponseDecoder.State.FAILURE = r3
                r5 = 3
                io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponseDecoder$State[] r5 = new io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponseDecoder.State[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponseDecoder.State.$VALUES = r5
                return
        }

        State(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponseDecoder.State valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponseDecoder$State> r0 = io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponseDecoder.State.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponseDecoder$State r1 = (io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponseDecoder.State) r1
                return r1
        }

        public static io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponseDecoder.State[] values() {
                io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponseDecoder$State[] r0 = io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponseDecoder.State.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponseDecoder$State[] r0 = (io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponseDecoder.State[]) r0
                return r0
        }
    }

    public Socks5PasswordAuthResponseDecoder() {
            r1 = this;
            io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponseDecoder$State r0 = io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponseDecoder.State.INIT
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
            io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponseDecoder$State r0 = io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponseDecoder.State.FAILURE
            r2.checkpoint(r0)
            io.netty.handler.codec.socksx.v5.DefaultSocks5PasswordAuthResponse r0 = new io.netty.handler.codec.socksx.v5.DefaultSocks5PasswordAuthResponse
            io.netty.handler.codec.socksx.v5.Socks5PasswordAuthStatus r1 = io.netty.handler.codec.socksx.v5.Socks5PasswordAuthStatus.FAILURE
            r0.<init>(r1)
            io.netty.handler.codec.DecoderResult r4 = io.netty.handler.codec.DecoderResult.failure(r4)
            r0.setDecoderResult(r4)
            r3.add(r0)
            return
    }

    @Override // io.netty.handler.codec.ByteToMessageDecoder
    protected void decode(io.netty.channel.ChannelHandlerContext r3, io.netty.buffer.ByteBuf r4, java.util.List<java.lang.Object> r5) throws java.lang.Exception {
            r2 = this;
            int[] r3 = io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponseDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$socksx$v5$Socks5PasswordAuthResponseDecoder$State     // Catch: java.lang.Exception -> L20
            java.lang.Object r0 = r2.state()     // Catch: java.lang.Exception -> L20
            io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponseDecoder$State r0 = (io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponseDecoder.State) r0     // Catch: java.lang.Exception -> L20
            int r0 = r0.ordinal()     // Catch: java.lang.Exception -> L20
            r3 = r3[r0]     // Catch: java.lang.Exception -> L20
            r0 = 1
            if (r3 == r0) goto L22
            r0 = 2
            if (r3 == r0) goto L3d
            r0 = 3
            if (r3 == r0) goto L18
            goto L4a
        L18:
            int r3 = r2.actualReadableBytes()     // Catch: java.lang.Exception -> L20
            r4.skipBytes(r3)     // Catch: java.lang.Exception -> L20
            return
        L20:
            r3 = move-exception
            goto L67
        L22:
            byte r3 = r4.readByte()     // Catch: java.lang.Exception -> L20
            if (r3 != r0) goto L4b
            io.netty.handler.codec.socksx.v5.DefaultSocks5PasswordAuthResponse r3 = new io.netty.handler.codec.socksx.v5.DefaultSocks5PasswordAuthResponse     // Catch: java.lang.Exception -> L20
            byte r0 = r4.readByte()     // Catch: java.lang.Exception -> L20
            io.netty.handler.codec.socksx.v5.Socks5PasswordAuthStatus r0 = io.netty.handler.codec.socksx.v5.Socks5PasswordAuthStatus.valueOf(r0)     // Catch: java.lang.Exception -> L20
            r3.<init>(r0)     // Catch: java.lang.Exception -> L20
            r5.add(r3)     // Catch: java.lang.Exception -> L20
            io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponseDecoder$State r3 = io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponseDecoder.State.SUCCESS     // Catch: java.lang.Exception -> L20
            r2.checkpoint(r3)     // Catch: java.lang.Exception -> L20
        L3d:
            int r3 = r2.actualReadableBytes()     // Catch: java.lang.Exception -> L20
            if (r3 <= 0) goto L4a
            io.netty.buffer.ByteBuf r3 = r4.readRetainedSlice(r3)     // Catch: java.lang.Exception -> L20
            r5.add(r3)     // Catch: java.lang.Exception -> L20
        L4a:
            return
        L4b:
            io.netty.handler.codec.DecoderException r4 = new io.netty.handler.codec.DecoderException     // Catch: java.lang.Exception -> L20
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L20
            r0.<init>()     // Catch: java.lang.Exception -> L20
            java.lang.String r1 = "unsupported subnegotiation version: "
            r0.append(r1)     // Catch: java.lang.Exception -> L20
            r0.append(r3)     // Catch: java.lang.Exception -> L20
            java.lang.String r3 = " (expected: 1)"
            r0.append(r3)     // Catch: java.lang.Exception -> L20
            java.lang.String r3 = r0.toString()     // Catch: java.lang.Exception -> L20
            r4.<init>(r3)     // Catch: java.lang.Exception -> L20
            throw r4     // Catch: java.lang.Exception -> L20
        L67:
            r2.fail(r5, r3)
            return
    }
}
