package io.netty.handler.codec.http.websocketx;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ContinuationWebSocketFrame extends io.netty.handler.codec.http.websocketx.WebSocketFrame {
    public ContinuationWebSocketFrame() {
            r1 = this;
            r0 = 0
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.buffer(r0)
            r1.<init>(r0)
            return
    }

    public ContinuationWebSocketFrame(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public ContinuationWebSocketFrame(boolean r1, int r2, io.netty.buffer.ByteBuf r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public ContinuationWebSocketFrame(boolean r1, int r2, java.lang.String r3) {
            r0 = this;
            io.netty.buffer.ByteBuf r3 = fromText(r3)
            r0.<init>(r1, r2, r3)
            return
    }

    private static io.netty.buffer.ByteBuf fromText(java.lang.String r1) {
            if (r1 == 0) goto L10
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L9
            goto L10
        L9:
            java.nio.charset.Charset r0 = io.netty.util.CharsetUtil.UTF_8
            io.netty.buffer.ByteBuf r1 = io.netty.buffer.Unpooled.copiedBuffer(r1, r0)
            return r1
        L10:
            io.netty.buffer.ByteBuf r1 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            return r1
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder copy() {
            r1 = this;
            io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame r0 = r1.copy()
            return r0
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame copy() {
            r1 = this;
            io.netty.handler.codec.http.websocketx.WebSocketFrame r0 = super.copy()
            io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame r0 = (io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame) r0
            return r0
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.websocketx.WebSocketFrame copy() {
            r1 = this;
            io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame r0 = r1.copy()
            return r0
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder duplicate() {
            r1 = this;
            io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame r0 = r1.duplicate()
            return r0
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame duplicate() {
            r1 = this;
            io.netty.handler.codec.http.websocketx.WebSocketFrame r0 = super.duplicate()
            io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame r0 = (io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame) r0
            return r0
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.websocketx.WebSocketFrame duplicate() {
            r1 = this;
            io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame r0 = r1.duplicate()
            return r0
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder replace(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame r1 = r0.replace(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame replace(io.netty.buffer.ByteBuf r4) {
            r3 = this;
            io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame r0 = new io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame
            boolean r1 = r3.isFinalFragment()
            int r2 = r3.rsv()
            r0.<init>(r1, r2, r4)
            return r0
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.websocketx.WebSocketFrame replace(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame r1 = r0.replace(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo39retain() {
            r1 = this;
            io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo40retain(int r1) {
            r0 = this;
            io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame mo39retain() {
            r0 = this;
            super.mo39retain()
            return r0
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame mo40retain(int r1) {
            r0 = this;
            super.mo40retain(r1)
            return r0
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.websocketx.WebSocketFrame mo39retain() {
            r1 = this;
            io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.websocketx.WebSocketFrame mo40retain(int r1) {
            r0 = this;
            io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.buffer.DefaultByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo8retain() {
            r1 = this;
            io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.buffer.DefaultByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo9retain(int r1) {
            r0 = this;
            io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder retainedDuplicate() {
            r1 = this;
            io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame r0 = r1.retainedDuplicate()
            return r0
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame retainedDuplicate() {
            r1 = this;
            io.netty.handler.codec.http.websocketx.WebSocketFrame r0 = super.retainedDuplicate()
            io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame r0 = (io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame) r0
            return r0
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.websocketx.WebSocketFrame retainedDuplicate() {
            r1 = this;
            io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame r0 = r1.retainedDuplicate()
            return r0
    }

    public java.lang.String text() {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r2.content()
            java.nio.charset.Charset r1 = io.netty.util.CharsetUtil.UTF_8
            java.lang.String r0 = r0.toString(r1)
            return r0
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo41touch() {
            r1 = this;
            io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame mo41touch() {
            r0 = this;
            super.mo41touch()
            return r0
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame mo42touch(java.lang.Object r1) {
            r0 = this;
            super.mo42touch(r1)
            return r0
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.websocketx.WebSocketFrame mo41touch() {
            r1 = this;
            io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.websocketx.WebSocketFrame mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.buffer.DefaultByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo10touch() {
            r1 = this;
            io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.buffer.DefaultByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo11touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame r1 = r0.mo42touch(r1)
            return r1
    }
}
