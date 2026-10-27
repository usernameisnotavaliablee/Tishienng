package io.netty.handler.codec.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultHttpObject implements io.netty.handler.codec.http.HttpObject {
    private static final int HASH_CODE_PRIME = 31;
    private io.netty.handler.codec.DecoderResult decoderResult;

    protected DefaultHttpObject() {
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

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof io.netty.handler.codec.http.DefaultHttpObject
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            io.netty.handler.codec.http.DefaultHttpObject r2 = (io.netty.handler.codec.http.DefaultHttpObject) r2
            io.netty.handler.codec.DecoderResult r0 = r1.decoderResult()
            io.netty.handler.codec.DecoderResult r2 = r2.decoderResult()
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // io.netty.handler.codec.http.HttpObject
    @java.lang.Deprecated
    public io.netty.handler.codec.DecoderResult getDecoderResult() {
            r1 = this;
            io.netty.handler.codec.DecoderResult r0 = r1.decoderResult()
            return r0
    }

    public int hashCode() {
            r2 = this;
            io.netty.handler.codec.DecoderResult r0 = r2.decoderResult
            int r0 = r0.hashCode()
            r1 = 31
            int r1 = r1 + r0
            return r1
    }

    @Override // io.netty.handler.codec.DecoderResultProvider
    public void setDecoderResult(io.netty.handler.codec.DecoderResult r2) {
            r1 = this;
            if (r2 == 0) goto L5
            r1.decoderResult = r2
            return
        L5:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "decoderResult"
            r2.<init>(r0)
            throw r2
    }
}
