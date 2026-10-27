package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class DefaultHttp2DataFrame extends io.netty.handler.codec.http2.AbstractHttp2StreamFrame implements io.netty.handler.codec.http2.Http2DataFrame {
    private final io.netty.buffer.ByteBuf content;
    private final boolean endStream;
    private final int initialFlowControlledBytes;
    private final int padding;

    public DefaultHttp2DataFrame(io.netty.buffer.ByteBuf r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public DefaultHttp2DataFrame(io.netty.buffer.ByteBuf r2, boolean r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public DefaultHttp2DataFrame(io.netty.buffer.ByteBuf r4, boolean r5, int r6) {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = "content"
            java.lang.Object r4 = io.netty.util.internal.ObjectUtil.checkNotNull(r4, r0)
            io.netty.buffer.ByteBuf r4 = (io.netty.buffer.ByteBuf) r4
            r3.content = r4
            r3.endStream = r5
            io.netty.handler.codec.http2.Http2CodecUtil.verifyPadding(r6)
            r3.padding = r6
            io.netty.buffer.ByteBuf r4 = r3.content()
            int r4 = r4.readableBytes()
            long r4 = (long) r4
            long r0 = (long) r6
            long r4 = r4 + r0
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L32
            io.netty.buffer.ByteBuf r4 = r3.content()
            int r4 = r4.readableBytes()
            int r4 = r4 + r6
            r3.initialFlowControlledBytes = r4
            return
        L32:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "content + padding must be <= Integer.MAX_VALUE"
            r4.<init>(r5)
            throw r4
    }

    public DefaultHttp2DataFrame(boolean r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            r1.<init>(r0, r2)
            return
    }

    @Override // io.netty.handler.codec.http2.Http2DataFrame, io.netty.buffer.ByteBufHolder
    public io.netty.buffer.ByteBuf content() {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r2.content
            int r0 = r0.refCnt()
            if (r0 <= 0) goto Lb
            io.netty.buffer.ByteBuf r0 = r2.content
            return r0
        Lb:
            io.netty.util.IllegalReferenceCountException r0 = new io.netty.util.IllegalReferenceCountException
            io.netty.buffer.ByteBuf r1 = r2.content
            int r1 = r1.refCnt()
            r0.<init>(r1)
            throw r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder copy() {
            r1 = this;
            io.netty.handler.codec.http2.DefaultHttp2DataFrame r0 = r1.copy()
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2DataFrame, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.http2.DefaultHttp2DataFrame copy() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content()
            io.netty.buffer.ByteBuf r0 = r0.copy()
            io.netty.handler.codec.http2.DefaultHttp2DataFrame r0 = r1.replace(r0)
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2DataFrame, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2DataFrame copy() {
            r1 = this;
            io.netty.handler.codec.http2.DefaultHttp2DataFrame r0 = r1.copy()
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder duplicate() {
            r1 = this;
            io.netty.handler.codec.http2.DefaultHttp2DataFrame r0 = r1.duplicate()
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2DataFrame, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.http2.DefaultHttp2DataFrame duplicate() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content()
            io.netty.buffer.ByteBuf r0 = r0.duplicate()
            io.netty.handler.codec.http2.DefaultHttp2DataFrame r0 = r1.replace(r0)
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2DataFrame, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2DataFrame duplicate() {
            r1 = this;
            io.netty.handler.codec.http2.DefaultHttp2DataFrame r0 = r1.duplicate()
            return r0
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2StreamFrame
    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof io.netty.handler.codec.http2.DefaultHttp2DataFrame
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            io.netty.handler.codec.http2.DefaultHttp2DataFrame r4 = (io.netty.handler.codec.http2.DefaultHttp2DataFrame) r4
            boolean r0 = super.equals(r4)
            if (r0 == 0) goto L28
            io.netty.buffer.ByteBuf r0 = r3.content
            io.netty.buffer.ByteBuf r2 = r4.content()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L28
            boolean r0 = r3.endStream
            boolean r2 = r4.endStream
            if (r0 != r2) goto L28
            int r0 = r3.padding
            int r4 = r4.padding
            if (r0 != r4) goto L28
            r4 = 1
            return r4
        L28:
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2StreamFrame
    public int hashCode() {
            r2 = this;
            int r0 = super.hashCode()
            int r0 = r0 * 31
            io.netty.buffer.ByteBuf r1 = r2.content
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r2.endStream
            r1 = r1 ^ 1
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.padding
            int r0 = r0 + r1
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2DataFrame
    public int initialFlowControlledBytes() {
            r1 = this;
            int r0 = r1.initialFlowControlledBytes
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2DataFrame
    public boolean isEndStream() {
            r1 = this;
            boolean r0 = r1.endStream
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2Frame
    public java.lang.String name() {
            r1 = this;
            java.lang.String r0 = "DATA"
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2DataFrame
    public int padding() {
            r1 = this;
            int r0 = r1.padding
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
            io.netty.handler.codec.http2.DefaultHttp2DataFrame r1 = r0.replace(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http2.Http2DataFrame, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.http2.DefaultHttp2DataFrame replace(io.netty.buffer.ByteBuf r4) {
            r3 = this;
            io.netty.handler.codec.http2.DefaultHttp2DataFrame r0 = new io.netty.handler.codec.http2.DefaultHttp2DataFrame
            boolean r1 = r3.endStream
            int r2 = r3.padding
            r0.<init>(r4, r1, r2)
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2DataFrame, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2DataFrame replace(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            io.netty.handler.codec.http2.DefaultHttp2DataFrame r1 = r0.replace(r1)
            return r1
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo39retain() {
            r1 = this;
            io.netty.handler.codec.http2.DefaultHttp2DataFrame r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo40retain(int r1) {
            r0 = this;
            io.netty.handler.codec.http2.DefaultHttp2DataFrame r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http2.Http2DataFrame, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.codec.http2.DefaultHttp2DataFrame mo39retain() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content
            r0.retain()
            return r1
    }

    @Override // io.netty.handler.codec.http2.Http2DataFrame, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.codec.http2.DefaultHttp2DataFrame mo40retain(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content
            r0.retain(r2)
            return r1
    }

    @Override // io.netty.handler.codec.http2.Http2DataFrame, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2DataFrame mo39retain() {
            r1 = this;
            io.netty.handler.codec.http2.DefaultHttp2DataFrame r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2DataFrame, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2DataFrame mo40retain(int r1) {
            r0 = this;
            io.netty.handler.codec.http2.DefaultHttp2DataFrame r1 = r0.mo40retain(r1)
            return r1
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted retain() {
            r1 = this;
            io.netty.handler.codec.http2.DefaultHttp2DataFrame r0 = r1.mo39retain()
            return r0
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted retain(int r1) {
            r0 = this;
            io.netty.handler.codec.http2.DefaultHttp2DataFrame r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder retainedDuplicate() {
            r1 = this;
            io.netty.handler.codec.http2.DefaultHttp2DataFrame r0 = r1.retainedDuplicate()
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2DataFrame, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.http2.DefaultHttp2DataFrame retainedDuplicate() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content()
            io.netty.buffer.ByteBuf r0 = r0.retainedDuplicate()
            io.netty.handler.codec.http2.DefaultHttp2DataFrame r0 = r1.replace(r0)
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2DataFrame, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2DataFrame retainedDuplicate() {
            r1 = this;
            io.netty.handler.codec.http2.DefaultHttp2DataFrame r0 = r1.retainedDuplicate()
            return r0
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2StreamFrame, io.netty.handler.codec.http2.Http2StreamFrame
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.AbstractHttp2StreamFrame stream(io.netty.handler.codec.http2.Http2FrameStream r1) {
            r0 = this;
            io.netty.handler.codec.http2.DefaultHttp2DataFrame r1 = r0.stream(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2StreamFrame, io.netty.handler.codec.http2.Http2StreamFrame
    public io.netty.handler.codec.http2.DefaultHttp2DataFrame stream(io.netty.handler.codec.http2.Http2FrameStream r1) {
            r0 = this;
            super.stream(r1)
            return r0
    }

    @Override // io.netty.handler.codec.http2.AbstractHttp2StreamFrame, io.netty.handler.codec.http2.Http2StreamFrame
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2StreamFrame stream(io.netty.handler.codec.http2.Http2FrameStream r1) {
            r0 = this;
            io.netty.handler.codec.http2.DefaultHttp2DataFrame r1 = r0.stream(r1)
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r2)
            r0.append(r1)
            java.lang.String r1 = "(stream="
            r0.append(r1)
            io.netty.handler.codec.http2.Http2FrameStream r1 = r2.stream()
            r0.append(r1)
            java.lang.String r1 = ", content="
            r0.append(r1)
            io.netty.buffer.ByteBuf r1 = r2.content
            r0.append(r1)
            java.lang.String r1 = ", endStream="
            r0.append(r1)
            boolean r1 = r2.endStream
            r0.append(r1)
            java.lang.String r1 = ", padding="
            r0.append(r1)
            int r1 = r2.padding
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
            io.netty.handler.codec.http2.DefaultHttp2DataFrame r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.http2.DefaultHttp2DataFrame r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http2.Http2DataFrame, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.codec.http2.DefaultHttp2DataFrame mo41touch() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content
            r0.touch()
            return r1
    }

    @Override // io.netty.handler.codec.http2.Http2DataFrame, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.codec.http2.DefaultHttp2DataFrame mo42touch(java.lang.Object r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content
            r0.touch(r2)
            return r1
    }

    @Override // io.netty.handler.codec.http2.Http2DataFrame, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2DataFrame mo41touch() {
            r1 = this;
            io.netty.handler.codec.http2.DefaultHttp2DataFrame r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2DataFrame, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2DataFrame mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.http2.DefaultHttp2DataFrame r1 = r0.mo42touch(r1)
            return r1
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted touch() {
            r1 = this;
            io.netty.handler.codec.http2.DefaultHttp2DataFrame r0 = r1.mo41touch()
            return r0
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.http2.DefaultHttp2DataFrame r1 = r0.mo42touch(r1)
            return r1
    }
}
