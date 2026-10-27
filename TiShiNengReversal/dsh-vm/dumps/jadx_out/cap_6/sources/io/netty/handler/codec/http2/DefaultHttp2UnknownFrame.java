package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class DefaultHttp2UnknownFrame extends io.netty.buffer.DefaultByteBufHolder implements io.netty.handler.codec.http2.Http2UnknownFrame {
    private final io.netty.handler.codec.http2.Http2Flags flags;
    private final byte frameType;
    private io.netty.handler.codec.http2.Http2FrameStream stream;

    public DefaultHttp2UnknownFrame(byte r2, io.netty.handler.codec.http2.Http2Flags r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            r1.<init>(r2, r3, r0)
            return
    }

    public DefaultHttp2UnknownFrame(byte r1, io.netty.handler.codec.http2.Http2Flags r2, io.netty.buffer.ByteBuf r3) {
            r0 = this;
            r0.<init>(r3)
            r0.frameType = r1
            r0.flags = r2
            return
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder copy() {
            r1 = this;
            io.netty.handler.codec.http2.DefaultHttp2UnknownFrame r0 = r1.copy()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.http2.DefaultHttp2UnknownFrame copy() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content()
            io.netty.buffer.ByteBuf r0 = r0.copy()
            io.netty.handler.codec.http2.DefaultHttp2UnknownFrame r0 = r1.replace(r0)
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2UnknownFrame copy() {
            r1 = this;
            io.netty.handler.codec.http2.DefaultHttp2UnknownFrame r0 = r1.copy()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder duplicate() {
            r1 = this;
            io.netty.handler.codec.http2.DefaultHttp2UnknownFrame r0 = r1.duplicate()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.http2.DefaultHttp2UnknownFrame duplicate() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content()
            io.netty.buffer.ByteBuf r0 = r0.duplicate()
            io.netty.handler.codec.http2.DefaultHttp2UnknownFrame r0 = r1.replace(r0)
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2UnknownFrame duplicate() {
            r1 = this;
            io.netty.handler.codec.http2.DefaultHttp2UnknownFrame r0 = r1.duplicate()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder
    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof io.netty.handler.codec.http2.DefaultHttp2UnknownFrame
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            io.netty.handler.codec.http2.DefaultHttp2UnknownFrame r4 = (io.netty.handler.codec.http2.DefaultHttp2UnknownFrame) r4
            boolean r0 = super.equals(r4)
            if (r0 == 0) goto L32
            io.netty.handler.codec.http2.Http2Flags r0 = r3.flags()
            io.netty.handler.codec.http2.Http2Flags r2 = r4.flags()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L32
            byte r0 = r3.frameType()
            byte r2 = r4.frameType()
            if (r0 != r2) goto L32
            io.netty.handler.codec.http2.Http2FrameStream r0 = r3.stream()
            if (r0 != 0) goto L32
            io.netty.handler.codec.http2.Http2FrameStream r0 = r4.stream()
            if (r0 == 0) goto L40
        L32:
            io.netty.handler.codec.http2.Http2FrameStream r0 = r3.stream()
            io.netty.handler.codec.http2.Http2FrameStream r4 = r4.stream()
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L42
        L40:
            r4 = 1
            return r4
        L42:
            return r1
    }

    @Override // io.netty.handler.codec.http2.Http2UnknownFrame
    public io.netty.handler.codec.http2.Http2Flags flags() {
            r1 = this;
            io.netty.handler.codec.http2.Http2Flags r0 = r1.flags
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2UnknownFrame
    public byte frameType() {
            r1 = this;
            byte r0 = r1.frameType
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder
    public int hashCode() {
            r2 = this;
            int r0 = super.hashCode()
            int r0 = r0 * 31
            byte r1 = r2.frameType()
            int r0 = r0 + r1
            int r0 = r0 * 31
            io.netty.handler.codec.http2.Http2Flags r1 = r2.flags()
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            io.netty.handler.codec.http2.Http2FrameStream r1 = r2.stream()
            if (r1 == 0) goto L27
            int r0 = r0 * 31
            io.netty.handler.codec.http2.Http2FrameStream r1 = r2.stream()
            int r1 = r1.hashCode()
            int r0 = r0 + r1
        L27:
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2Frame
    public java.lang.String name() {
            r1 = this;
            java.lang.String r0 = "UNKNOWN"
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder replace(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            io.netty.handler.codec.http2.DefaultHttp2UnknownFrame r1 = r0.replace(r1)
            return r1
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.http2.DefaultHttp2UnknownFrame replace(io.netty.buffer.ByteBuf r4) {
            r3 = this;
            io.netty.handler.codec.http2.DefaultHttp2UnknownFrame r0 = new io.netty.handler.codec.http2.DefaultHttp2UnknownFrame
            byte r1 = r3.frameType
            io.netty.handler.codec.http2.Http2Flags r2 = r3.flags
            r0.<init>(r1, r2, r4)
            io.netty.handler.codec.http2.Http2FrameStream r4 = r3.stream()
            io.netty.handler.codec.http2.DefaultHttp2UnknownFrame r4 = r0.stream(r4)
            return r4
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2UnknownFrame replace(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            io.netty.handler.codec.http2.DefaultHttp2UnknownFrame r1 = r0.replace(r1)
            return r1
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo39retain() {
            r1 = this;
            io.netty.handler.codec.http2.DefaultHttp2UnknownFrame r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo40retain(int r1) {
            r0 = this;
            io.netty.handler.codec.http2.DefaultHttp2UnknownFrame r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.codec.http2.DefaultHttp2UnknownFrame mo39retain() {
            r0 = this;
            super.mo39retain()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.codec.http2.DefaultHttp2UnknownFrame mo40retain(int r1) {
            r0 = this;
            super.mo40retain(r1)
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2UnknownFrame mo39retain() {
            r1 = this;
            io.netty.handler.codec.http2.DefaultHttp2UnknownFrame r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2UnknownFrame mo40retain(int r1) {
            r0 = this;
            io.netty.handler.codec.http2.DefaultHttp2UnknownFrame r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.buffer.DefaultByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo8retain() {
            r1 = this;
            io.netty.handler.codec.http2.DefaultHttp2UnknownFrame r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo9retain(int r1) {
            r0 = this;
            io.netty.handler.codec.http2.DefaultHttp2UnknownFrame r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder retainedDuplicate() {
            r1 = this;
            io.netty.handler.codec.http2.DefaultHttp2UnknownFrame r0 = r1.retainedDuplicate()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.http2.DefaultHttp2UnknownFrame retainedDuplicate() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content()
            io.netty.buffer.ByteBuf r0 = r0.retainedDuplicate()
            io.netty.handler.codec.http2.DefaultHttp2UnknownFrame r0 = r1.replace(r0)
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2UnknownFrame retainedDuplicate() {
            r1 = this;
            io.netty.handler.codec.http2.DefaultHttp2UnknownFrame r0 = r1.retainedDuplicate()
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2UnknownFrame, io.netty.handler.codec.http2.Http2StreamFrame
    public io.netty.handler.codec.http2.DefaultHttp2UnknownFrame stream(io.netty.handler.codec.http2.Http2FrameStream r1) {
            r0 = this;
            r0.stream = r1
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2UnknownFrame, io.netty.handler.codec.http2.Http2StreamFrame
    public io.netty.handler.codec.http2.Http2FrameStream stream() {
            r1 = this;
            io.netty.handler.codec.http2.Http2FrameStream r0 = r1.stream
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2StreamFrame
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2StreamFrame stream(io.netty.handler.codec.http2.Http2FrameStream r1) {
            r0 = this;
            io.netty.handler.codec.http2.DefaultHttp2UnknownFrame r1 = r0.stream(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http2.Http2UnknownFrame, io.netty.handler.codec.http2.Http2StreamFrame
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2UnknownFrame stream(io.netty.handler.codec.http2.Http2FrameStream r1) {
            r0 = this;
            io.netty.handler.codec.http2.DefaultHttp2UnknownFrame r1 = r0.stream(r1)
            return r1
    }

    @Override // io.netty.buffer.DefaultByteBufHolder
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r2)
            r0.append(r1)
            java.lang.String r1 = "(frameType="
            r0.append(r1)
            byte r1 = r2.frameType()
            r0.append(r1)
            java.lang.String r1 = ", stream="
            r0.append(r1)
            io.netty.handler.codec.http2.Http2FrameStream r1 = r2.stream()
            r0.append(r1)
            java.lang.String r1 = ", flags="
            r0.append(r1)
            io.netty.handler.codec.http2.Http2Flags r1 = r2.flags()
            r0.append(r1)
            java.lang.String r1 = ", content="
            r0.append(r1)
            java.lang.String r1 = r2.contentToString()
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo41touch() {
            r1 = this;
            io.netty.handler.codec.http2.DefaultHttp2UnknownFrame r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.http2.DefaultHttp2UnknownFrame r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.codec.http2.DefaultHttp2UnknownFrame mo41touch() {
            r0 = this;
            super.mo41touch()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.codec.http2.DefaultHttp2UnknownFrame mo42touch(java.lang.Object r1) {
            r0 = this;
            super.mo42touch(r1)
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2UnknownFrame mo41touch() {
            r1 = this;
            io.netty.handler.codec.http2.DefaultHttp2UnknownFrame r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2UnknownFrame mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.http2.DefaultHttp2UnknownFrame r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.buffer.DefaultByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo10touch() {
            r1 = this;
            io.netty.handler.codec.http2.DefaultHttp2UnknownFrame r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo11touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.http2.DefaultHttp2UnknownFrame r1 = r0.mo42touch(r1)
            return r1
    }
}
