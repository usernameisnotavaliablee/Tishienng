package io.netty.handler.codec.memcache.binary;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class BinaryMemcacheServerCodec extends io.netty.channel.CombinedChannelDuplexHandler<io.netty.handler.codec.memcache.binary.BinaryMemcacheRequestDecoder, io.netty.handler.codec.memcache.binary.BinaryMemcacheResponseEncoder> {
    public BinaryMemcacheServerCodec() {
            r1 = this;
            r0 = 8192(0x2000, float:1.148E-41)
            r1.<init>(r0)
            return
    }

    public BinaryMemcacheServerCodec(int r2) {
            r1 = this;
            io.netty.handler.codec.memcache.binary.BinaryMemcacheRequestDecoder r0 = new io.netty.handler.codec.memcache.binary.BinaryMemcacheRequestDecoder
            r0.<init>(r2)
            io.netty.handler.codec.memcache.binary.BinaryMemcacheResponseEncoder r2 = new io.netty.handler.codec.memcache.binary.BinaryMemcacheResponseEncoder
            r2.<init>()
            r1.<init>(r0, r2)
            return
    }
}
