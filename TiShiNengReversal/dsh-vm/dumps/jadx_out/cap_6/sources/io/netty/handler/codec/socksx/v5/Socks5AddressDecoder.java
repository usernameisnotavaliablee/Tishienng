package io.netty.handler.codec.socksx.v5;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface Socks5AddressDecoder {
    public static final io.netty.handler.codec.socksx.v5.Socks5AddressDecoder DEFAULT = null;


    static {
            io.netty.handler.codec.socksx.v5.Socks5AddressDecoder$1 r0 = new io.netty.handler.codec.socksx.v5.Socks5AddressDecoder$1
            r0.<init>()
            io.netty.handler.codec.socksx.v5.Socks5AddressDecoder.DEFAULT = r0
            return
    }

    java.lang.String decodeAddress(io.netty.handler.codec.socksx.v5.Socks5AddressType r1, io.netty.buffer.ByteBuf r2) throws java.lang.Exception;
}
