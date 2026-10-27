package io.netty.resolver.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class DnsAddressDecoder {
    private static final int INADDRSZ4 = 4;
    private static final int INADDRSZ6 = 16;

    private DnsAddressDecoder() {
            r0 = this;
            r0.<init>()
            return
    }

    static java.net.InetAddress decodeAddress(io.netty.handler.codec.dns.DnsRecord r3, java.lang.String r4, boolean r5) {
            boolean r0 = r3 instanceof io.netty.handler.codec.dns.DnsRawRecord
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            io.netty.buffer.ByteBufHolder r3 = (io.netty.buffer.ByteBufHolder) r3
            io.netty.buffer.ByteBuf r3 = r3.content()
            int r0 = r3.readableBytes()
            r2 = 4
            if (r0 == r2) goto L18
            r2 = 16
            if (r0 == r2) goto L18
            return r1
        L18:
            byte[] r0 = new byte[r0]
            int r1 = r3.readerIndex()
            r3.getBytes(r1, r0)
            if (r5 == 0) goto L27
            java.lang.String r4 = java.net.IDN.toUnicode(r4)     // Catch: java.net.UnknownHostException -> L2c
        L27:
            java.net.InetAddress r3 = java.net.InetAddress.getByAddress(r4, r0)     // Catch: java.net.UnknownHostException -> L2c
            return r3
        L2c:
            r3 = move-exception
            java.lang.Error r4 = new java.lang.Error
            r4.<init>(r3)
            throw r4
    }
}
