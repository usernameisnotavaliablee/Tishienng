package io.netty.handler.codec.socksx;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class SocksPortUnificationServerHandler extends io.netty.handler.codec.ByteToMessageDecoder {
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final io.netty.handler.codec.socksx.v5.Socks5ServerEncoder socks5encoder;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.socksx.SocksPortUnificationServerHandler$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$socksx$SocksVersion = null;

        static {
                io.netty.handler.codec.socksx.SocksVersion[] r0 = io.netty.handler.codec.socksx.SocksVersion.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.handler.codec.socksx.SocksPortUnificationServerHandler.AnonymousClass1.$SwitchMap$io$netty$handler$codec$socksx$SocksVersion = r0
                io.netty.handler.codec.socksx.SocksVersion r1 = io.netty.handler.codec.socksx.SocksVersion.SOCKS4a     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.handler.codec.socksx.SocksPortUnificationServerHandler.AnonymousClass1.$SwitchMap$io$netty$handler$codec$socksx$SocksVersion     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.handler.codec.socksx.SocksVersion r1 = io.netty.handler.codec.socksx.SocksVersion.SOCKS5     // Catch: java.lang.NoSuchFieldError -> L1d
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

    static {
            java.lang.Class<io.netty.handler.codec.socksx.SocksPortUnificationServerHandler> r0 = io.netty.handler.codec.socksx.SocksPortUnificationServerHandler.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.handler.codec.socksx.SocksPortUnificationServerHandler.logger = r0
            return
    }

    public SocksPortUnificationServerHandler() {
            r1 = this;
            io.netty.handler.codec.socksx.v5.Socks5ServerEncoder r0 = io.netty.handler.codec.socksx.v5.Socks5ServerEncoder.DEFAULT
            r1.<init>(r0)
            return
    }

    public SocksPortUnificationServerHandler(io.netty.handler.codec.socksx.v5.Socks5ServerEncoder r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L8
            r1.socks5encoder = r2
            return
        L8:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "socks5encoder"
            r2.<init>(r0)
            throw r2
    }

    private static void logKnownVersion(io.netty.channel.ChannelHandlerContext r2, io.netty.handler.codec.socksx.SocksVersion r3) {
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.handler.codec.socksx.SocksPortUnificationServerHandler.logger
            java.lang.String r1 = "{} Protocol version: {}({})"
            io.netty.channel.Channel r2 = r2.channel()
            r0.debug(r1, r2, r3)
            return
    }

    private static void logUnknownVersion(io.netty.channel.ChannelHandlerContext r2, byte r3) {
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.handler.codec.socksx.SocksPortUnificationServerHandler.logger
            boolean r1 = r0.isDebugEnabled()
            if (r1 == 0) goto L17
            io.netty.channel.Channel r2 = r2.channel()
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r1 = "{} Unknown protocol version: {}"
            r0.debug(r1, r2, r3)
        L17:
            return
    }

    @Override // io.netty.handler.codec.ByteToMessageDecoder
    protected void decode(io.netty.channel.ChannelHandlerContext r6, io.netty.buffer.ByteBuf r7, java.util.List<java.lang.Object> r8) throws java.lang.Exception {
            r5 = this;
            int r8 = r7.readerIndex()
            int r0 = r7.writerIndex()
            if (r0 != r8) goto Lb
            return
        Lb:
            io.netty.channel.ChannelPipeline r0 = r6.pipeline()
            byte r8 = r7.getByte(r8)
            io.netty.handler.codec.socksx.SocksVersion r1 = io.netty.handler.codec.socksx.SocksVersion.valueOf(r8)
            int[] r2 = io.netty.handler.codec.socksx.SocksPortUnificationServerHandler.AnonymousClass1.$SwitchMap$io$netty$handler$codec$socksx$SocksVersion
            int r3 = r1.ordinal()
            r2 = r2[r3]
            r3 = 1
            r4 = 0
            if (r2 == r3) goto L4d
            r3 = 2
            if (r2 == r3) goto L34
            logUnknownVersion(r6, r8)
            int r8 = r7.readableBytes()
            r7.skipBytes(r8)
            r6.close()
            return
        L34:
            logKnownVersion(r6, r1)
            java.lang.String r7 = r6.name()
            io.netty.handler.codec.socksx.v5.Socks5ServerEncoder r8 = r5.socks5encoder
            r0.addAfter(r7, r4, r8)
            java.lang.String r6 = r6.name()
            io.netty.handler.codec.socksx.v5.Socks5InitialRequestDecoder r7 = new io.netty.handler.codec.socksx.v5.Socks5InitialRequestDecoder
            r7.<init>()
            r0.addAfter(r6, r4, r7)
            goto L65
        L4d:
            logKnownVersion(r6, r1)
            java.lang.String r7 = r6.name()
            io.netty.handler.codec.socksx.v4.Socks4ServerEncoder r8 = io.netty.handler.codec.socksx.v4.Socks4ServerEncoder.INSTANCE
            r0.addAfter(r7, r4, r8)
            java.lang.String r6 = r6.name()
            io.netty.handler.codec.socksx.v4.Socks4ServerDecoder r7 = new io.netty.handler.codec.socksx.v4.Socks4ServerDecoder
            r7.<init>()
            r0.addAfter(r6, r4, r7)
        L65:
            r0.remove(r5)
            return
    }
}
