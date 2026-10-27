package io.netty.handler.codec.socks;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class SocksAuthRequestDecoder extends io.netty.handler.codec.ReplayingDecoder<io.netty.handler.codec.socks.SocksAuthRequestDecoder.State> {
    private java.lang.String username;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.socks.SocksAuthRequestDecoder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$socks$SocksAuthRequestDecoder$State = null;

        static {
                io.netty.handler.codec.socks.SocksAuthRequestDecoder$State[] r0 = io.netty.handler.codec.socks.SocksAuthRequestDecoder.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.handler.codec.socks.SocksAuthRequestDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$socks$SocksAuthRequestDecoder$State = r0
                io.netty.handler.codec.socks.SocksAuthRequestDecoder$State r1 = io.netty.handler.codec.socks.SocksAuthRequestDecoder.State.CHECK_PROTOCOL_VERSION     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.handler.codec.socks.SocksAuthRequestDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$socks$SocksAuthRequestDecoder$State     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.handler.codec.socks.SocksAuthRequestDecoder$State r1 = io.netty.handler.codec.socks.SocksAuthRequestDecoder.State.READ_USERNAME     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.netty.handler.codec.socks.SocksAuthRequestDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$socks$SocksAuthRequestDecoder$State     // Catch: java.lang.NoSuchFieldError -> L28
                io.netty.handler.codec.socks.SocksAuthRequestDecoder$State r1 = io.netty.handler.codec.socks.SocksAuthRequestDecoder.State.READ_PASSWORD     // Catch: java.lang.NoSuchFieldError -> L28
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
    enum State extends java.lang.Enum<io.netty.handler.codec.socks.SocksAuthRequestDecoder.State> {
        private static final /* synthetic */ io.netty.handler.codec.socks.SocksAuthRequestDecoder.State[] $VALUES = null;
        public static final io.netty.handler.codec.socks.SocksAuthRequestDecoder.State CHECK_PROTOCOL_VERSION = null;
        public static final io.netty.handler.codec.socks.SocksAuthRequestDecoder.State READ_PASSWORD = null;
        public static final io.netty.handler.codec.socks.SocksAuthRequestDecoder.State READ_USERNAME = null;

        static {
                io.netty.handler.codec.socks.SocksAuthRequestDecoder$State r0 = new io.netty.handler.codec.socks.SocksAuthRequestDecoder$State
                java.lang.String r1 = "CHECK_PROTOCOL_VERSION"
                r2 = 0
                r0.<init>(r1, r2)
                io.netty.handler.codec.socks.SocksAuthRequestDecoder.State.CHECK_PROTOCOL_VERSION = r0
                io.netty.handler.codec.socks.SocksAuthRequestDecoder$State r1 = new io.netty.handler.codec.socks.SocksAuthRequestDecoder$State
                java.lang.String r3 = "READ_USERNAME"
                r4 = 1
                r1.<init>(r3, r4)
                io.netty.handler.codec.socks.SocksAuthRequestDecoder.State.READ_USERNAME = r1
                io.netty.handler.codec.socks.SocksAuthRequestDecoder$State r3 = new io.netty.handler.codec.socks.SocksAuthRequestDecoder$State
                java.lang.String r5 = "READ_PASSWORD"
                r6 = 2
                r3.<init>(r5, r6)
                io.netty.handler.codec.socks.SocksAuthRequestDecoder.State.READ_PASSWORD = r3
                r5 = 3
                io.netty.handler.codec.socks.SocksAuthRequestDecoder$State[] r5 = new io.netty.handler.codec.socks.SocksAuthRequestDecoder.State[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                io.netty.handler.codec.socks.SocksAuthRequestDecoder.State.$VALUES = r5
                return
        }

        State(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.netty.handler.codec.socks.SocksAuthRequestDecoder.State valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.handler.codec.socks.SocksAuthRequestDecoder$State> r0 = io.netty.handler.codec.socks.SocksAuthRequestDecoder.State.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.handler.codec.socks.SocksAuthRequestDecoder$State r1 = (io.netty.handler.codec.socks.SocksAuthRequestDecoder.State) r1
                return r1
        }

        public static io.netty.handler.codec.socks.SocksAuthRequestDecoder.State[] values() {
                io.netty.handler.codec.socks.SocksAuthRequestDecoder$State[] r0 = io.netty.handler.codec.socks.SocksAuthRequestDecoder.State.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.handler.codec.socks.SocksAuthRequestDecoder$State[] r0 = (io.netty.handler.codec.socks.SocksAuthRequestDecoder.State[]) r0
                return r0
        }
    }

    public SocksAuthRequestDecoder() {
            r1 = this;
            io.netty.handler.codec.socks.SocksAuthRequestDecoder$State r0 = io.netty.handler.codec.socks.SocksAuthRequestDecoder.State.CHECK_PROTOCOL_VERSION
            r1.<init>(r0)
            return
    }

    @Override // io.netty.handler.codec.ByteToMessageDecoder
    protected void decode(io.netty.channel.ChannelHandlerContext r3, io.netty.buffer.ByteBuf r4, java.util.List<java.lang.Object> r5) throws java.lang.Exception {
            r2 = this;
            int[] r0 = io.netty.handler.codec.socks.SocksAuthRequestDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$socks$SocksAuthRequestDecoder$State
            java.lang.Object r1 = r2.state()
            io.netty.handler.codec.socks.SocksAuthRequestDecoder$State r1 = (io.netty.handler.codec.socks.SocksAuthRequestDecoder.State) r1
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L1e
            r1 = 2
            if (r0 == r1) goto L35
            r1 = 3
            if (r0 != r1) goto L18
            goto L44
        L18:
            java.lang.Error r3 = new java.lang.Error
            r3.<init>()
            throw r3
        L1e:
            byte r0 = r4.readByte()
            io.netty.handler.codec.socks.SocksSubnegotiationVersion r1 = io.netty.handler.codec.socks.SocksSubnegotiationVersion.AUTH_PASSWORD
            byte r1 = r1.byteValue()
            if (r0 == r1) goto L30
            io.netty.handler.codec.socks.SocksRequest r4 = io.netty.handler.codec.socks.SocksCommonUtils.UNKNOWN_SOCKS_REQUEST
            r5.add(r4)
            goto L56
        L30:
            io.netty.handler.codec.socks.SocksAuthRequestDecoder$State r0 = io.netty.handler.codec.socks.SocksAuthRequestDecoder.State.READ_USERNAME
            r2.checkpoint(r0)
        L35:
            byte r0 = r4.readByte()
            java.lang.String r0 = io.netty.handler.codec.socks.SocksCommonUtils.readUsAscii(r4, r0)
            r2.username = r0
            io.netty.handler.codec.socks.SocksAuthRequestDecoder$State r0 = io.netty.handler.codec.socks.SocksAuthRequestDecoder.State.READ_PASSWORD
            r2.checkpoint(r0)
        L44:
            byte r0 = r4.readByte()
            java.lang.String r4 = io.netty.handler.codec.socks.SocksCommonUtils.readUsAscii(r4, r0)
            io.netty.handler.codec.socks.SocksAuthRequest r0 = new io.netty.handler.codec.socks.SocksAuthRequest
            java.lang.String r1 = r2.username
            r0.<init>(r1, r4)
            r5.add(r0)
        L56:
            io.netty.channel.ChannelPipeline r3 = r3.pipeline()
            r3.remove(r2)
            return
    }
}
