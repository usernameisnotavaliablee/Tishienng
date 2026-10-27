package io.netty.handler.codec.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultHttpContent extends io.netty.handler.codec.http.DefaultHttpObject implements io.netty.handler.codec.http.HttpContent {
    private final io.netty.buffer.ByteBuf content;

    public DefaultHttpContent(io.netty.buffer.ByteBuf r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L8
            r1.content = r2
            return
        L8:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "content"
            r2.<init>(r0)
            throw r2
    }

    @Override // io.netty.buffer.ByteBufHolder
    public io.netty.buffer.ByteBuf content() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder copy() {
            r1 = this;
            io.netty.handler.codec.http.HttpContent r0 = r1.copy()
            return r0
    }

    @Override // io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.http.HttpContent copy() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content
            io.netty.buffer.ByteBuf r0 = r0.copy()
            io.netty.handler.codec.http.HttpContent r0 = r1.replace(r0)
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder duplicate() {
            r1 = this;
            io.netty.handler.codec.http.HttpContent r0 = r1.duplicate()
            return r0
    }

    @Override // io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.http.HttpContent duplicate() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content
            io.netty.buffer.ByteBuf r0 = r0.duplicate()
            io.netty.handler.codec.http.HttpContent r0 = r1.replace(r0)
            return r0
    }

    public int refCnt() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content
            int r0 = r0.refCnt()
            return r0
    }

    public boolean release() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content
            boolean r0 = r0.release()
            return r0
    }

    public boolean release(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content
            boolean r2 = r0.release(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder replace(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            io.netty.handler.codec.http.HttpContent r1 = r0.replace(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.http.HttpContent replace(io.netty.buffer.ByteBuf r2) {
            r1 = this;
            io.netty.handler.codec.http.DefaultHttpContent r0 = new io.netty.handler.codec.http.DefaultHttpContent
            r0.<init>(r2)
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo39retain() {
            r1 = this;
            io.netty.handler.codec.http.HttpContent r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo40retain(int r1) {
            r0 = this;
            io.netty.handler.codec.http.HttpContent r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.codec.http.HttpContent mo39retain() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content
            r0.retain()
            return r1
    }

    @Override // io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.codec.http.HttpContent mo40retain(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content
            r0.retain(r2)
            return r1
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted retain() {
            r1 = this;
            io.netty.handler.codec.http.HttpContent r0 = r1.mo39retain()
            return r0
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted retain(int r1) {
            r0 = this;
            io.netty.handler.codec.http.HttpContent r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder retainedDuplicate() {
            r1 = this;
            io.netty.handler.codec.http.HttpContent r0 = r1.retainedDuplicate()
            return r0
    }

    @Override // io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.http.HttpContent retainedDuplicate() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content
            io.netty.buffer.ByteBuf r0 = r0.retainedDuplicate()
            io.netty.handler.codec.http.HttpContent r0 = r1.replace(r0)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r2)
            r0.append(r1)
            java.lang.String r1 = "(data: "
            r0.append(r1)
            io.netty.buffer.ByteBuf r1 = r2.content()
            r0.append(r1)
            java.lang.String r1 = ", decoderResult: "
            r0.append(r1)
            io.netty.handler.codec.DecoderResult r1 = r2.decoderResult()
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo41touch() {
            r1 = this;
            io.netty.handler.codec.http.HttpContent r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.http.HttpContent r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.codec.http.HttpContent mo41touch() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content
            r0.touch()
            return r1
    }

    @Override // io.netty.handler.codec.http.HttpContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.codec.http.HttpContent mo42touch(java.lang.Object r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content
            r0.touch(r2)
            return r1
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted touch() {
            r1 = this;
            io.netty.handler.codec.http.HttpContent r0 = r1.mo41touch()
            return r0
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.http.HttpContent r1 = r0.mo42touch(r1)
            return r1
    }
}
