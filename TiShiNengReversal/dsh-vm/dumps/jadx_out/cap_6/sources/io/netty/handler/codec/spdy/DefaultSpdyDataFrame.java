package io.netty.handler.codec.spdy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultSpdyDataFrame extends io.netty.handler.codec.spdy.DefaultSpdyStreamFrame implements io.netty.handler.codec.spdy.SpdyDataFrame {
    private final io.netty.buffer.ByteBuf data;

    public DefaultSpdyDataFrame(int r2) {
            r1 = this;
            r0 = 0
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.buffer(r0)
            r1.<init>(r2, r0)
            return
    }

    public DefaultSpdyDataFrame(int r1, io.netty.buffer.ByteBuf r2) {
            r0 = this;
            r0.<init>(r1)
            if (r2 == 0) goto Lc
            io.netty.buffer.ByteBuf r1 = validate(r2)
            r0.data = r1
            return
        Lc:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "data"
            r1.<init>(r2)
            throw r1
    }

    private static io.netty.buffer.ByteBuf validate(io.netty.buffer.ByteBuf r2) {
            int r0 = r2.readableBytes()
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            if (r0 > r1) goto La
            return r2
        La:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "data payload cannot exceed 16777215 bytes"
            r2.<init>(r0)
            throw r2
    }

    @Override // io.netty.handler.codec.spdy.SpdyDataFrame, io.netty.buffer.ByteBufHolder
    public io.netty.buffer.ByteBuf content() {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r2.data
            int r0 = r0.refCnt()
            if (r0 <= 0) goto Lb
            io.netty.buffer.ByteBuf r0 = r2.data
            return r0
        Lb:
            io.netty.util.IllegalReferenceCountException r0 = new io.netty.util.IllegalReferenceCountException
            io.netty.buffer.ByteBuf r1 = r2.data
            int r1 = r1.refCnt()
            r0.<init>(r1)
            throw r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder copy() {
            r1 = this;
            io.netty.handler.codec.spdy.SpdyDataFrame r0 = r1.copy()
            return r0
    }

    @Override // io.netty.handler.codec.spdy.SpdyDataFrame, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.spdy.SpdyDataFrame copy() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content()
            io.netty.buffer.ByteBuf r0 = r0.copy()
            io.netty.handler.codec.spdy.SpdyDataFrame r0 = r1.replace(r0)
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder duplicate() {
            r1 = this;
            io.netty.handler.codec.spdy.SpdyDataFrame r0 = r1.duplicate()
            return r0
    }

    @Override // io.netty.handler.codec.spdy.SpdyDataFrame, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.spdy.SpdyDataFrame duplicate() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content()
            io.netty.buffer.ByteBuf r0 = r0.duplicate()
            io.netty.handler.codec.spdy.SpdyDataFrame r0 = r1.replace(r0)
            return r0
    }

    public int refCnt() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.data
            int r0 = r0.refCnt()
            return r0
    }

    public boolean release() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.data
            boolean r0 = r0.release()
            return r0
    }

    public boolean release(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.data
            boolean r2 = r0.release(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder replace(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            io.netty.handler.codec.spdy.SpdyDataFrame r1 = r0.replace(r1)
            return r1
    }

    @Override // io.netty.handler.codec.spdy.SpdyDataFrame, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.spdy.SpdyDataFrame replace(io.netty.buffer.ByteBuf r3) {
            r2 = this;
            io.netty.handler.codec.spdy.DefaultSpdyDataFrame r0 = new io.netty.handler.codec.spdy.DefaultSpdyDataFrame
            int r1 = r2.streamId()
            r0.<init>(r1, r3)
            boolean r3 = r2.isLast()
            r0.setLast(r3)
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo39retain() {
            r1 = this;
            io.netty.handler.codec.spdy.SpdyDataFrame r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo40retain(int r1) {
            r0 = this;
            io.netty.handler.codec.spdy.SpdyDataFrame r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.handler.codec.spdy.SpdyDataFrame, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.codec.spdy.SpdyDataFrame mo39retain() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.data
            r0.retain()
            return r1
    }

    @Override // io.netty.handler.codec.spdy.SpdyDataFrame, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.codec.spdy.SpdyDataFrame mo40retain(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.data
            r0.retain(r2)
            return r1
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted retain() {
            r1 = this;
            io.netty.handler.codec.spdy.SpdyDataFrame r0 = r1.mo39retain()
            return r0
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted retain(int r1) {
            r0 = this;
            io.netty.handler.codec.spdy.SpdyDataFrame r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder retainedDuplicate() {
            r1 = this;
            io.netty.handler.codec.spdy.SpdyDataFrame r0 = r1.retainedDuplicate()
            return r0
    }

    @Override // io.netty.handler.codec.spdy.SpdyDataFrame, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.spdy.SpdyDataFrame retainedDuplicate() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content()
            io.netty.buffer.ByteBuf r0 = r0.retainedDuplicate()
            io.netty.handler.codec.spdy.SpdyDataFrame r0 = r1.replace(r0)
            return r0
    }

    @Override // io.netty.handler.codec.spdy.DefaultSpdyStreamFrame, io.netty.handler.codec.spdy.SpdyStreamFrame, io.netty.handler.codec.spdy.SpdyDataFrame
    public io.netty.handler.codec.spdy.SpdyDataFrame setLast(boolean r1) {
            r0 = this;
            super.setLast(r1)
            return r0
    }

    @Override // io.netty.handler.codec.spdy.DefaultSpdyStreamFrame, io.netty.handler.codec.spdy.SpdyStreamFrame, io.netty.handler.codec.spdy.SpdyDataFrame
    public /* bridge */ /* synthetic */ io.netty.handler.codec.spdy.SpdyStreamFrame setLast(boolean r1) {
            r0 = this;
            io.netty.handler.codec.spdy.SpdyDataFrame r1 = r0.setLast(r1)
            return r1
    }

    @Override // io.netty.handler.codec.spdy.DefaultSpdyStreamFrame, io.netty.handler.codec.spdy.SpdyStreamFrame, io.netty.handler.codec.spdy.SpdyDataFrame
    public io.netty.handler.codec.spdy.SpdyDataFrame setStreamId(int r1) {
            r0 = this;
            super.setStreamId(r1)
            return r0
    }

    @Override // io.netty.handler.codec.spdy.DefaultSpdyStreamFrame, io.netty.handler.codec.spdy.SpdyStreamFrame, io.netty.handler.codec.spdy.SpdyDataFrame
    public /* bridge */ /* synthetic */ io.netty.handler.codec.spdy.SpdyStreamFrame setStreamId(int r1) {
            r0 = this;
            io.netty.handler.codec.spdy.SpdyDataFrame r1 = r0.setStreamId(r1)
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r3)
            r0.append(r1)
            java.lang.String r1 = "(last: "
            r0.append(r1)
            boolean r1 = r3.isLast()
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r1 = io.netty.util.internal.StringUtil.NEWLINE
            r0.append(r1)
            java.lang.String r2 = "--> Stream-ID = "
            r0.append(r2)
            int r2 = r3.streamId()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = "--> Size = "
            r0.append(r1)
            int r1 = r3.refCnt()
            if (r1 != 0) goto L42
            java.lang.String r1 = "(freed)"
            r0.append(r1)
            goto L4d
        L42:
            io.netty.buffer.ByteBuf r1 = r3.content()
            int r1 = r1.readableBytes()
            r0.append(r1)
        L4d:
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo41touch() {
            r1 = this;
            io.netty.handler.codec.spdy.SpdyDataFrame r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.spdy.SpdyDataFrame r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.handler.codec.spdy.SpdyDataFrame, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.codec.spdy.SpdyDataFrame mo41touch() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.data
            r0.touch()
            return r1
    }

    @Override // io.netty.handler.codec.spdy.SpdyDataFrame, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.codec.spdy.SpdyDataFrame mo42touch(java.lang.Object r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.data
            r0.touch(r2)
            return r1
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted touch() {
            r1 = this;
            io.netty.handler.codec.spdy.SpdyDataFrame r0 = r1.mo41touch()
            return r0
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.spdy.SpdyDataFrame r1 = r0.mo42touch(r1)
            return r1
    }
}
