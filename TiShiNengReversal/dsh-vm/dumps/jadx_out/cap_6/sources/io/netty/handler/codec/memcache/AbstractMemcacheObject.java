package io.netty.handler.codec.memcache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class AbstractMemcacheObject extends io.netty.util.AbstractReferenceCounted implements io.netty.handler.codec.memcache.MemcacheObject {
    private io.netty.handler.codec.DecoderResult decoderResult;

    protected AbstractMemcacheObject() {
            r1 = this;
            r1.<init>()
            io.netty.handler.codec.DecoderResult r0 = io.netty.handler.codec.DecoderResult.SUCCESS
            r1.decoderResult = r0
            return
    }

    @Override // io.netty.handler.codec.DecoderResultProvider
    public io.netty.handler.codec.DecoderResult decoderResult() {
            r1 = this;
            io.netty.handler.codec.DecoderResult r0 = r1.decoderResult
            return r0
    }

    @Override // io.netty.handler.codec.DecoderResultProvider
    public void setDecoderResult(io.netty.handler.codec.DecoderResult r2) {
            r1 = this;
            if (r2 == 0) goto L5
            r1.decoderResult = r2
            return
        L5:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "DecoderResult should not be null."
            r2.<init>(r0)
            throw r2
    }
}
