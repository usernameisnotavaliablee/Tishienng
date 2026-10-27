package io.netty.handler.codec.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class TcpDnsResponseDecoder extends io.netty.handler.codec.LengthFieldBasedFrameDecoder {
    private final io.netty.handler.codec.dns.DnsResponseDecoder<java.net.SocketAddress> responseDecoder;


    public TcpDnsResponseDecoder() {
            r2 = this;
            io.netty.handler.codec.dns.DnsRecordDecoder r0 = io.netty.handler.codec.dns.DnsRecordDecoder.DEFAULT
            r1 = 65536(0x10000, float:9.1835E-41)
            r2.<init>(r0, r1)
            return
    }

    public TcpDnsResponseDecoder(io.netty.handler.codec.dns.DnsRecordDecoder r7, int r8) {
            r6 = this;
            r4 = 0
            r5 = 2
            r2 = 0
            r3 = 2
            r0 = r6
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            io.netty.handler.codec.dns.TcpDnsResponseDecoder$1 r8 = new io.netty.handler.codec.dns.TcpDnsResponseDecoder$1
            r8.<init>(r6, r7)
            r0.responseDecoder = r8
            return
    }

    @Override // io.netty.handler.codec.LengthFieldBasedFrameDecoder
    protected java.lang.Object decode(io.netty.channel.ChannelHandlerContext r4, io.netty.buffer.ByteBuf r5) throws java.lang.Exception {
            r3 = this;
            java.lang.Object r5 = super.decode(r4, r5)
            io.netty.buffer.ByteBuf r5 = (io.netty.buffer.ByteBuf) r5
            if (r5 != 0) goto La
            r4 = 0
            return r4
        La:
            io.netty.handler.codec.dns.DnsResponseDecoder<java.net.SocketAddress> r0 = r3.responseDecoder     // Catch: java.lang.Throwable -> L28
            io.netty.channel.Channel r1 = r4.channel()     // Catch: java.lang.Throwable -> L28
            java.net.SocketAddress r1 = r1.remoteAddress()     // Catch: java.lang.Throwable -> L28
            io.netty.channel.Channel r4 = r4.channel()     // Catch: java.lang.Throwable -> L28
            java.net.SocketAddress r4 = r4.localAddress()     // Catch: java.lang.Throwable -> L28
            io.netty.buffer.ByteBuf r2 = r5.slice()     // Catch: java.lang.Throwable -> L28
            io.netty.handler.codec.dns.DnsResponse r4 = r0.decode(r1, r4, r2)     // Catch: java.lang.Throwable -> L28
            r5.release()
            return r4
        L28:
            r4 = move-exception
            r5.release()
            throw r4
    }

    @Override // io.netty.handler.codec.LengthFieldBasedFrameDecoder
    protected io.netty.buffer.ByteBuf extractFrame(io.netty.channel.ChannelHandlerContext r1, io.netty.buffer.ByteBuf r2, int r3, int r4) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = r2.copy(r3, r4)
            return r1
    }
}
