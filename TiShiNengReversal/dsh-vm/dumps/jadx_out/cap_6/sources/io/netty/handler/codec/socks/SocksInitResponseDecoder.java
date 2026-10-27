package io.netty.handler.codec.socks;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class SocksInitResponseDecoder extends io.netty.handler.codec.ReplayingDecoder<io.netty.handler.codec.socks.SocksInitResponseDecoder.State> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.socks.SocksInitResponseDecoder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$socks$SocksInitResponseDecoder$State = null;

        static {
                io.netty.handler.codec.socks.SocksInitResponseDecoder$State[] r0 = io.netty.handler.codec.socks.SocksInitResponseDecoder.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.handler.codec.socks.SocksInitResponseDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$socks$SocksInitResponseDecoder$State = r0
                io.netty.handler.codec.socks.SocksInitResponseDecoder$State r1 = io.netty.handler.codec.socks.SocksInitResponseDecoder.State.CHECK_PROTOCOL_VERSION     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.handler.codec.socks.SocksInitResponseDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$socks$SocksInitResponseDecoder$State     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.handler.codec.socks.SocksInitResponseDecoder$State r1 = io.netty.handler.codec.socks.SocksInitResponseDecoder.State.READ_PREFERRED_AUTH_TYPE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    enum State extends java.lang.Enum<io.netty.handler.codec.socks.SocksInitResponseDecoder.State> {
        private static final /* synthetic */ io.netty.handler.codec.socks.SocksInitResponseDecoder.State[] $VALUES = null;
        public static final io.netty.handler.codec.socks.SocksInitResponseDecoder.State CHECK_PROTOCOL_VERSION = null;
        public static final io.netty.handler.codec.socks.SocksInitResponseDecoder.State READ_PREFERRED_AUTH_TYPE = null;

        static {
                io.netty.handler.codec.socks.SocksInitResponseDecoder$State r0 = new io.netty.handler.codec.socks.SocksInitResponseDecoder$State
                java.lang.String r1 = "CHECK_PROTOCOL_VERSION"
                r2 = 0
                r0.<init>(r1, r2)
                io.netty.handler.codec.socks.SocksInitResponseDecoder.State.CHECK_PROTOCOL_VERSION = r0
                io.netty.handler.codec.socks.SocksInitResponseDecoder$State r1 = new io.netty.handler.codec.socks.SocksInitResponseDecoder$State
                java.lang.String r3 = "READ_PREFERRED_AUTH_TYPE"
                r4 = 1
                r1.<init>(r3, r4)
                io.netty.handler.codec.socks.SocksInitResponseDecoder.State.READ_PREFERRED_AUTH_TYPE = r1
                r3 = 2
                io.netty.handler.codec.socks.SocksInitResponseDecoder$State[] r3 = new io.netty.handler.codec.socks.SocksInitResponseDecoder.State[r3]
                r3[r2] = r0
                r3[r4] = r1
                io.netty.handler.codec.socks.SocksInitResponseDecoder.State.$VALUES = r3
                return
        }

        State(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.netty.handler.codec.socks.SocksInitResponseDecoder.State valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.handler.codec.socks.SocksInitResponseDecoder$State> r0 = io.netty.handler.codec.socks.SocksInitResponseDecoder.State.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.handler.codec.socks.SocksInitResponseDecoder$State r1 = (io.netty.handler.codec.socks.SocksInitResponseDecoder.State) r1
                return r1
        }

        public static io.netty.handler.codec.socks.SocksInitResponseDecoder.State[] values() {
                io.netty.handler.codec.socks.SocksInitResponseDecoder$State[] r0 = io.netty.handler.codec.socks.SocksInitResponseDecoder.State.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.handler.codec.socks.SocksInitResponseDecoder$State[] r0 = (io.netty.handler.codec.socks.SocksInitResponseDecoder.State[]) r0
                return r0
        }
    }

    public SocksInitResponseDecoder() {
            r1 = this;
            io.netty.handler.codec.socks.SocksInitResponseDecoder$State r0 = io.netty.handler.codec.socks.SocksInitResponseDecoder.State.CHECK_PROTOCOL_VERSION
            r1.<init>(r0)
            return
    }

    @Override // io.netty.handler.codec.ByteToMessageDecoder
    protected void decode(io.netty.channel.ChannelHandlerContext r3, io.netty.buffer.ByteBuf r4, java.util.List<java.lang.Object> r5) throws java.lang.Exception {
            r2 = this;
            int[] r0 = io.netty.handler.codec.socks.SocksInitResponseDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$socks$SocksInitResponseDecoder$State
            java.lang.Object r1 = r2.state()
            io.netty.handler.codec.socks.SocksInitResponseDecoder$State r1 = (io.netty.handler.codec.socks.SocksInitResponseDecoder.State) r1
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L1b
            r1 = 2
            if (r0 != r1) goto L15
            goto L32
        L15:
            java.lang.Error r3 = new java.lang.Error
            r3.<init>()
            throw r3
        L1b:
            byte r0 = r4.readByte()
            io.netty.handler.codec.socks.SocksProtocolVersion r1 = io.netty.handler.codec.socks.SocksProtocolVersion.SOCKS5
            byte r1 = r1.byteValue()
            if (r0 == r1) goto L2d
            io.netty.handler.codec.socks.SocksResponse r4 = io.netty.handler.codec.socks.SocksCommonUtils.UNKNOWN_SOCKS_RESPONSE
            r5.add(r4)
            goto L42
        L2d:
            io.netty.handler.codec.socks.SocksInitResponseDecoder$State r0 = io.netty.handler.codec.socks.SocksInitResponseDecoder.State.READ_PREFERRED_AUTH_TYPE
            r2.checkpoint(r0)
        L32:
            byte r4 = r4.readByte()
            io.netty.handler.codec.socks.SocksAuthScheme r4 = io.netty.handler.codec.socks.SocksAuthScheme.valueOf(r4)
            io.netty.handler.codec.socks.SocksInitResponse r0 = new io.netty.handler.codec.socks.SocksInitResponse
            r0.<init>(r4)
            r5.add(r0)
        L42:
            io.netty.channel.ChannelPipeline r3 = r3.pipeline()
            r3.remove(r2)
            return
    }
}
