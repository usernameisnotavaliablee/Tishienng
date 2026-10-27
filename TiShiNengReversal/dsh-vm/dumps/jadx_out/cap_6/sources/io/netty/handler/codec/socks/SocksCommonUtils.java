package io.netty.handler.codec.socks;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class SocksCommonUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final io.netty.handler.codec.socks.SocksRequest UNKNOWN_SOCKS_REQUEST = null;
    public static final io.netty.handler.codec.socks.SocksResponse UNKNOWN_SOCKS_RESPONSE = null;
    private static final char ipv6hextetSeparator = ':';

    static {
            io.netty.handler.codec.socks.UnknownSocksRequest r0 = new io.netty.handler.codec.socks.UnknownSocksRequest
            r0.<init>()
            io.netty.handler.codec.socks.SocksCommonUtils.UNKNOWN_SOCKS_REQUEST = r0
            io.netty.handler.codec.socks.UnknownSocksResponse r0 = new io.netty.handler.codec.socks.UnknownSocksResponse
            r0.<init>()
            io.netty.handler.codec.socks.SocksCommonUtils.UNKNOWN_SOCKS_RESPONSE = r0
            return
    }

    private SocksCommonUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void appendHextet(java.lang.StringBuilder r1, byte[] r2, int r3) {
            int r3 = r3 << 1
            r0 = 2
            io.netty.util.internal.StringUtil.toHexString(r1, r2, r3, r0)
            return
    }

    public static java.lang.String ipv6toStr(byte[] r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 39
            r0.<init>(r1)
            r1 = 0
            r2 = 8
            ipv6toStr(r0, r3, r1, r2)
            java.lang.String r3 = r0.toString()
            return r3
    }

    private static void ipv6toStr(java.lang.StringBuilder r1, byte[] r2, int r3, int r4) {
            int r4 = r4 + (-1)
        L2:
            if (r3 >= r4) goto Lf
            appendHextet(r1, r2, r3)
            r0 = 58
            r1.append(r0)
            int r3 = r3 + 1
            goto L2
        Lf:
            appendHextet(r1, r2, r3)
            return
    }

    static java.lang.String readUsAscii(io.netty.buffer.ByteBuf r2, int r3) {
            int r0 = r2.readerIndex()
            java.nio.charset.Charset r1 = io.netty.util.CharsetUtil.US_ASCII
            java.lang.String r0 = r2.toString(r0, r3, r1)
            r2.skipBytes(r3)
            return r0
    }
}
