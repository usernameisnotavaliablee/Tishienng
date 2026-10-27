package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class DefaultHttp2GoAwayFrame extends io.netty.buffer.DefaultByteBufHolder implements io.netty.handler.codec.http2.Http2GoAwayFrame {
    private final long errorCode;
    private int extraStreamIds;
    private final int lastStreamId;

    DefaultHttp2GoAwayFrame(int r1, long r2, io.netty.buffer.ByteBuf r4) {
            r0 = this;
            r0.<init>(r4)
            r0.errorCode = r2
            r0.lastStreamId = r1
            return
    }

    public DefaultHttp2GoAwayFrame(long r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            r1.<init>(r2, r0)
            return
    }

    public DefaultHttp2GoAwayFrame(long r2, io.netty.buffer.ByteBuf r4) {
            r1 = this;
            r0 = -1
            r1.<init>(r0, r2, r4)
            return
    }

    public DefaultHttp2GoAwayFrame(io.netty.handler.codec.http2.Http2Error r3) {
            r2 = this;
            long r0 = r3.code()
            r2.<init>(r0)
            return
    }

    public DefaultHttp2GoAwayFrame(io.netty.handler.codec.http2.Http2Error r3, io.netty.buffer.ByteBuf r4) {
            r2 = this;
            long r0 = r3.code()
            r2.<init>(r0, r4)
            return
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder copy() {
            r1 = this;
            io.netty.handler.codec.http2.Http2GoAwayFrame r0 = r1.copy()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.http2.Http2GoAwayFrame copy() {
            r5 = this;
            io.netty.handler.codec.http2.DefaultHttp2GoAwayFrame r0 = new io.netty.handler.codec.http2.DefaultHttp2GoAwayFrame
            int r1 = r5.lastStreamId
            long r2 = r5.errorCode
            io.netty.buffer.ByteBuf r4 = r5.content()
            io.netty.buffer.ByteBuf r4 = r4.copy()
            r0.<init>(r1, r2, r4)
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder duplicate() {
            r1 = this;
            io.netty.handler.codec.http2.Http2GoAwayFrame r0 = r1.duplicate()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.http2.Http2GoAwayFrame duplicate() {
            r1 = this;
            io.netty.buffer.ByteBufHolder r0 = super.duplicate()
            io.netty.handler.codec.http2.Http2GoAwayFrame r0 = (io.netty.handler.codec.http2.Http2GoAwayFrame) r0
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder
    public boolean equals(java.lang.Object r7) {
            r6 = this;
            boolean r0 = r7 instanceof io.netty.handler.codec.http2.DefaultHttp2GoAwayFrame
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            io.netty.handler.codec.http2.DefaultHttp2GoAwayFrame r7 = (io.netty.handler.codec.http2.DefaultHttp2GoAwayFrame) r7
            long r2 = r6.errorCode
            long r4 = r7.errorCode
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L1e
            int r0 = r6.extraStreamIds
            int r2 = r7.extraStreamIds
            if (r0 != r2) goto L1e
            boolean r7 = super.equals(r7)
            if (r7 == 0) goto L1e
            r7 = 1
            return r7
        L1e:
            return r1
    }

    @Override // io.netty.handler.codec.http2.Http2GoAwayFrame
    public long errorCode() {
            r2 = this;
            long r0 = r2.errorCode
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2GoAwayFrame
    public int extraStreamIds() {
            r1 = this;
            int r0 = r1.extraStreamIds
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder
    public int hashCode() {
            r5 = this;
            int r0 = super.hashCode()
            int r0 = r0 * 31
            long r1 = r5.errorCode
            r3 = 32
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r1 = r5.extraStreamIds
            int r0 = r0 + r1
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2GoAwayFrame
    public int lastStreamId() {
            r1 = this;
            int r0 = r1.lastStreamId
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2Frame
    public java.lang.String name() {
            r1 = this;
            java.lang.String r0 = "GOAWAY"
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder replace(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            io.netty.handler.codec.http2.Http2GoAwayFrame r1 = r0.replace(r1)
            return r1
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.http2.Http2GoAwayFrame replace(io.netty.buffer.ByteBuf r4) {
            r3 = this;
            io.netty.handler.codec.http2.DefaultHttp2GoAwayFrame r0 = new io.netty.handler.codec.http2.DefaultHttp2GoAwayFrame
            long r1 = r3.errorCode
            r0.<init>(r1, r4)
            int r4 = r3.extraStreamIds
            io.netty.handler.codec.http2.Http2GoAwayFrame r4 = r0.setExtraStreamIds(r4)
            return r4
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo39retain() {
            r1 = this;
            io.netty.handler.codec.http2.Http2GoAwayFrame r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo40retain(int r1) {
            r0 = this;
            io.netty.handler.codec.http2.Http2GoAwayFrame r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.codec.http2.Http2GoAwayFrame mo39retain() {
            r0 = this;
            super.mo39retain()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.codec.http2.Http2GoAwayFrame mo40retain(int r1) {
            r0 = this;
            super.mo40retain(r1)
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo8retain() {
            r1 = this;
            io.netty.handler.codec.http2.Http2GoAwayFrame r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo9retain(int r1) {
            r0 = this;
            io.netty.handler.codec.http2.Http2GoAwayFrame r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder retainedDuplicate() {
            r1 = this;
            io.netty.handler.codec.http2.Http2GoAwayFrame r0 = r1.retainedDuplicate()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.http2.Http2GoAwayFrame retainedDuplicate() {
            r1 = this;
            io.netty.buffer.ByteBufHolder r0 = super.retainedDuplicate()
            io.netty.handler.codec.http2.Http2GoAwayFrame r0 = (io.netty.handler.codec.http2.Http2GoAwayFrame) r0
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2GoAwayFrame
    public io.netty.handler.codec.http2.Http2GoAwayFrame setExtraStreamIds(int r2) {
            r1 = this;
            java.lang.String r0 = "extraStreamIds"
            io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r2, r0)
            r1.extraStreamIds = r2
            return r1
    }

    @Override // io.netty.buffer.DefaultByteBufHolder
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r3)
            r0.append(r1)
            java.lang.String r1 = "(errorCode="
            r0.append(r1)
            long r1 = r3.errorCode
            r0.append(r1)
            java.lang.String r1 = ", content="
            r0.append(r1)
            io.netty.buffer.ByteBuf r1 = r3.content()
            r0.append(r1)
            java.lang.String r1 = ", extraStreamIds="
            r0.append(r1)
            int r1 = r3.extraStreamIds
            r0.append(r1)
            java.lang.String r1 = ", lastStreamId="
            r0.append(r1)
            int r1 = r3.lastStreamId
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
            io.netty.handler.codec.http2.Http2GoAwayFrame r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.http2.Http2GoAwayFrame r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.codec.http2.Http2GoAwayFrame mo41touch() {
            r0 = this;
            super.mo41touch()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.codec.http2.Http2GoAwayFrame mo42touch(java.lang.Object r1) {
            r0 = this;
            super.mo42touch(r1)
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo10touch() {
            r1 = this;
            io.netty.handler.codec.http2.Http2GoAwayFrame r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo11touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.http2.Http2GoAwayFrame r1 = r0.mo42touch(r1)
            return r1
    }
}
