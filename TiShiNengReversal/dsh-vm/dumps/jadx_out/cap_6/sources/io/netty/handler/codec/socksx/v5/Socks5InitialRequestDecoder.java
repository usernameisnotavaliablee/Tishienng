package io.netty.handler.codec.socksx.v5;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class Socks5InitialRequestDecoder extends io.netty.handler.codec.ReplayingDecoder<io.netty.handler.codec.socksx.v5.Socks5InitialRequestDecoder.State> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.socksx.v5.Socks5InitialRequestDecoder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$socksx$v5$Socks5InitialRequestDecoder$State = null;

        static {
                io.netty.handler.codec.socksx.v5.Socks5InitialRequestDecoder$State[] r0 = io.netty.handler.codec.socksx.v5.Socks5InitialRequestDecoder.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.handler.codec.socksx.v5.Socks5InitialRequestDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$socksx$v5$Socks5InitialRequestDecoder$State = r0
                io.netty.handler.codec.socksx.v5.Socks5InitialRequestDecoder$State r1 = io.netty.handler.codec.socksx.v5.Socks5InitialRequestDecoder.State.INIT     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.handler.codec.socksx.v5.Socks5InitialRequestDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$socksx$v5$Socks5InitialRequestDecoder$State     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.handler.codec.socksx.v5.Socks5InitialRequestDecoder$State r1 = io.netty.handler.codec.socksx.v5.Socks5InitialRequestDecoder.State.SUCCESS     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.netty.handler.codec.socksx.v5.Socks5InitialRequestDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$socksx$v5$Socks5InitialRequestDecoder$State     // Catch: java.lang.NoSuchFieldError -> L28
                io.netty.handler.codec.socksx.v5.Socks5InitialRequestDecoder$State r1 = io.netty.handler.codec.socksx.v5.Socks5InitialRequestDecoder.State.FAILURE     // Catch: java.lang.NoSuchFieldError -> L28
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
    enum State extends java.lang.Enum<io.netty.handler.codec.socksx.v5.Socks5InitialRequestDecoder.State> {
        private static final /* synthetic */ io.netty.handler.codec.socksx.v5.Socks5InitialRequestDecoder.State[] $VALUES = null;
        public static final io.netty.handler.codec.socksx.v5.Socks5InitialRequestDecoder.State FAILURE = null;
        public static final io.netty.handler.codec.socksx.v5.Socks5InitialRequestDecoder.State INIT = null;
        public static final io.netty.handler.codec.socksx.v5.Socks5InitialRequestDecoder.State SUCCESS = null;

        static {
                io.netty.handler.codec.socksx.v5.Socks5InitialRequestDecoder$State r0 = new io.netty.handler.codec.socksx.v5.Socks5InitialRequestDecoder$State
                java.lang.String r1 = "INIT"
                r2 = 0
                r0.<init>(r1, r2)
                io.netty.handler.codec.socksx.v5.Socks5InitialRequestDecoder.State.INIT = r0
                io.netty.handler.codec.socksx.v5.Socks5InitialRequestDecoder$State r1 = new io.netty.handler.codec.socksx.v5.Socks5InitialRequestDecoder$State
                java.lang.String r3 = "SUCCESS"
                r4 = 1
                r1.<init>(r3, r4)
                io.netty.handler.codec.socksx.v5.Socks5InitialRequestDecoder.State.SUCCESS = r1
                io.netty.handler.codec.socksx.v5.Socks5InitialRequestDecoder$State r3 = new io.netty.handler.codec.socksx.v5.Socks5InitialRequestDecoder$State
                java.lang.String r5 = "FAILURE"
                r6 = 2
                r3.<init>(r5, r6)
                io.netty.handler.codec.socksx.v5.Socks5InitialRequestDecoder.State.FAILURE = r3
                r5 = 3
                io.netty.handler.codec.socksx.v5.Socks5InitialRequestDecoder$State[] r5 = new io.netty.handler.codec.socksx.v5.Socks5InitialRequestDecoder.State[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                io.netty.handler.codec.socksx.v5.Socks5InitialRequestDecoder.State.$VALUES = r5
                return
        }

        State(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.netty.handler.codec.socksx.v5.Socks5InitialRequestDecoder.State valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.handler.codec.socksx.v5.Socks5InitialRequestDecoder$State> r0 = io.netty.handler.codec.socksx.v5.Socks5InitialRequestDecoder.State.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.handler.codec.socksx.v5.Socks5InitialRequestDecoder$State r1 = (io.netty.handler.codec.socksx.v5.Socks5InitialRequestDecoder.State) r1
                return r1
        }

        public static io.netty.handler.codec.socksx.v5.Socks5InitialRequestDecoder.State[] values() {
                io.netty.handler.codec.socksx.v5.Socks5InitialRequestDecoder$State[] r0 = io.netty.handler.codec.socksx.v5.Socks5InitialRequestDecoder.State.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.handler.codec.socksx.v5.Socks5InitialRequestDecoder$State[] r0 = (io.netty.handler.codec.socksx.v5.Socks5InitialRequestDecoder.State[]) r0
                return r0
        }
    }

    public Socks5InitialRequestDecoder() {
            r1 = this;
            io.netty.handler.codec.socksx.v5.Socks5InitialRequestDecoder$State r0 = io.netty.handler.codec.socksx.v5.Socks5InitialRequestDecoder.State.INIT
            r1.<init>(r0)
            return
    }

    private void fail(java.util.List<java.lang.Object> r5, java.lang.Exception r6) {
            r4 = this;
            boolean r0 = r6 instanceof io.netty.handler.codec.DecoderException
            if (r0 != 0) goto La
            io.netty.handler.codec.DecoderException r0 = new io.netty.handler.codec.DecoderException
            r0.<init>(r6)
            r6 = r0
        La:
            io.netty.handler.codec.socksx.v5.Socks5InitialRequestDecoder$State r0 = io.netty.handler.codec.socksx.v5.Socks5InitialRequestDecoder.State.FAILURE
            r4.checkpoint(r0)
            io.netty.handler.codec.socksx.v5.DefaultSocks5InitialRequest r0 = new io.netty.handler.codec.socksx.v5.DefaultSocks5InitialRequest
            r1 = 1
            io.netty.handler.codec.socksx.v5.Socks5AuthMethod[] r1 = new io.netty.handler.codec.socksx.v5.Socks5AuthMethod[r1]
            io.netty.handler.codec.socksx.v5.Socks5AuthMethod r2 = io.netty.handler.codec.socksx.v5.Socks5AuthMethod.NO_AUTH
            r3 = 0
            r1[r3] = r2
            r0.<init>(r1)
            io.netty.handler.codec.DecoderResult r6 = io.netty.handler.codec.DecoderResult.failure(r6)
            r0.setDecoderResult(r6)
            r5.add(r0)
            return
    }

    @Override // io.netty.handler.codec.ByteToMessageDecoder
    protected void decode(io.netty.channel.ChannelHandlerContext r4, io.netty.buffer.ByteBuf r5, java.util.List<java.lang.Object> r6) throws java.lang.Exception {
            r3 = this;
            int[] r4 = io.netty.handler.codec.socksx.v5.Socks5InitialRequestDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$socksx$v5$Socks5InitialRequestDecoder$State     // Catch: java.lang.Exception -> L20
            java.lang.Object r0 = r3.state()     // Catch: java.lang.Exception -> L20
            io.netty.handler.codec.socksx.v5.Socks5InitialRequestDecoder$State r0 = (io.netty.handler.codec.socksx.v5.Socks5InitialRequestDecoder.State) r0     // Catch: java.lang.Exception -> L20
            int r0 = r0.ordinal()     // Catch: java.lang.Exception -> L20
            r4 = r4[r0]     // Catch: java.lang.Exception -> L20
            r0 = 1
            if (r4 == r0) goto L22
            r0 = 2
            if (r4 == r0) goto L58
            r0 = 3
            if (r4 == r0) goto L18
            goto L65
        L18:
            int r4 = r3.actualReadableBytes()     // Catch: java.lang.Exception -> L20
            r5.skipBytes(r4)     // Catch: java.lang.Exception -> L20
            return
        L20:
            r4 = move-exception
            goto L8e
        L22:
            byte r4 = r5.readByte()     // Catch: java.lang.Exception -> L20
            io.netty.handler.codec.socksx.SocksVersion r0 = io.netty.handler.codec.socksx.SocksVersion.SOCKS5     // Catch: java.lang.Exception -> L20
            byte r1 = r0.byteValue()     // Catch: java.lang.Exception -> L20
            if (r4 != r1) goto L66
            short r4 = r5.readUnsignedByte()     // Catch: java.lang.Exception -> L20
            int r0 = r3.actualReadableBytes()     // Catch: java.lang.Exception -> L20
            if (r0 >= r4) goto L39
            goto L65
        L39:
            io.netty.handler.codec.socksx.v5.Socks5AuthMethod[] r0 = new io.netty.handler.codec.socksx.v5.Socks5AuthMethod[r4]     // Catch: java.lang.Exception -> L20
            r1 = 0
        L3c:
            if (r1 >= r4) goto L4b
            byte r2 = r5.readByte()     // Catch: java.lang.Exception -> L20
            io.netty.handler.codec.socksx.v5.Socks5AuthMethod r2 = io.netty.handler.codec.socksx.v5.Socks5AuthMethod.valueOf(r2)     // Catch: java.lang.Exception -> L20
            r0[r1] = r2     // Catch: java.lang.Exception -> L20
            int r1 = r1 + 1
            goto L3c
        L4b:
            io.netty.handler.codec.socksx.v5.DefaultSocks5InitialRequest r4 = new io.netty.handler.codec.socksx.v5.DefaultSocks5InitialRequest     // Catch: java.lang.Exception -> L20
            r4.<init>(r0)     // Catch: java.lang.Exception -> L20
            r6.add(r4)     // Catch: java.lang.Exception -> L20
            io.netty.handler.codec.socksx.v5.Socks5InitialRequestDecoder$State r4 = io.netty.handler.codec.socksx.v5.Socks5InitialRequestDecoder.State.SUCCESS     // Catch: java.lang.Exception -> L20
            r3.checkpoint(r4)     // Catch: java.lang.Exception -> L20
        L58:
            int r4 = r3.actualReadableBytes()     // Catch: java.lang.Exception -> L20
            if (r4 <= 0) goto L65
            io.netty.buffer.ByteBuf r4 = r5.readRetainedSlice(r4)     // Catch: java.lang.Exception -> L20
            r6.add(r4)     // Catch: java.lang.Exception -> L20
        L65:
            return
        L66:
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
        L8e:
            r3.fail(r6, r4)
            return
    }
}
