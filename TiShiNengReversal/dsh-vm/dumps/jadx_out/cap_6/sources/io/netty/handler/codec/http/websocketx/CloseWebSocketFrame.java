package io.netty.handler.codec.http.websocketx;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class CloseWebSocketFrame extends io.netty.handler.codec.http.websocketx.WebSocketFrame {
    public CloseWebSocketFrame() {
            r1 = this;
            r0 = 0
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.buffer(r0)
            r1.<init>(r0)
            return
    }

    public CloseWebSocketFrame(int r3, java.lang.String r4) {
            r2 = this;
            r0 = 1
            r1 = 0
            r2.<init>(r0, r1, r3, r4)
            return
    }

    public CloseWebSocketFrame(io.netty.handler.codec.http.websocketx.WebSocketCloseStatus r2) {
            r1 = this;
            int r0 = r2.code()
            java.lang.String r2 = r2.reasonText()
            r1.<init>(r0, r2)
            return
    }

    public CloseWebSocketFrame(io.netty.handler.codec.http.websocketx.WebSocketCloseStatus r1, java.lang.String r2) {
            r0 = this;
            int r1 = r1.code()
            r0.<init>(r1, r2)
            return
    }

    public CloseWebSocketFrame(boolean r2, int r3) {
            r1 = this;
            r0 = 0
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.buffer(r0)
            r1.<init>(r2, r3, r0)
            return
    }

    public CloseWebSocketFrame(boolean r1, int r2, int r3, java.lang.String r4) {
            r0 = this;
            io.netty.buffer.ByteBuf r3 = newBinaryData(r3, r4)
            r0.<init>(r1, r2, r3)
            return
    }

    public CloseWebSocketFrame(boolean r1, int r2, io.netty.buffer.ByteBuf r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    private static io.netty.buffer.ByteBuf newBinaryData(int r1, java.lang.String r2) {
            if (r2 != 0) goto L4
            java.lang.String r2 = ""
        L4:
            int r0 = r2.length()
            int r0 = r0 + 2
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.buffer(r0)
            r0.writeShort(r1)
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L1c
            java.nio.charset.Charset r1 = io.netty.util.CharsetUtil.UTF_8
            r0.writeCharSequence(r2, r1)
        L1c:
            r1 = 0
            r0.readerIndex(r1)
            return r0
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder copy() {
            r1 = this;
            io.netty.handler.codec.http.websocketx.CloseWebSocketFrame r0 = r1.copy()
            return r0
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.http.websocketx.CloseWebSocketFrame copy() {
            r1 = this;
            io.netty.handler.codec.http.websocketx.WebSocketFrame r0 = super.copy()
            io.netty.handler.codec.http.websocketx.CloseWebSocketFrame r0 = (io.netty.handler.codec.http.websocketx.CloseWebSocketFrame) r0
            return r0
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.websocketx.WebSocketFrame copy() {
            r1 = this;
            io.netty.handler.codec.http.websocketx.CloseWebSocketFrame r0 = r1.copy()
            return r0
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder duplicate() {
            r1 = this;
            io.netty.handler.codec.http.websocketx.CloseWebSocketFrame r0 = r1.duplicate()
            return r0
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.http.websocketx.CloseWebSocketFrame duplicate() {
            r1 = this;
            io.netty.handler.codec.http.websocketx.WebSocketFrame r0 = super.duplicate()
            io.netty.handler.codec.http.websocketx.CloseWebSocketFrame r0 = (io.netty.handler.codec.http.websocketx.CloseWebSocketFrame) r0
            return r0
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.websocketx.WebSocketFrame duplicate() {
            r1 = this;
            io.netty.handler.codec.http.websocketx.CloseWebSocketFrame r0 = r1.duplicate()
            return r0
    }

    public java.lang.String reasonText() {
            r3 = this;
            io.netty.buffer.ByteBuf r0 = r3.content()
            if (r0 == 0) goto L1c
            int r1 = r0.capacity()
            r2 = 2
            if (r1 > r2) goto Le
            goto L1c
        Le:
            r0.readerIndex(r2)
            java.nio.charset.Charset r1 = io.netty.util.CharsetUtil.UTF_8
            java.lang.String r1 = r0.toString(r1)
            r2 = 0
            r0.readerIndex(r2)
            return r1
        L1c:
            java.lang.String r0 = ""
            return r0
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder replace(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            io.netty.handler.codec.http.websocketx.CloseWebSocketFrame r1 = r0.replace(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.http.websocketx.CloseWebSocketFrame replace(io.netty.buffer.ByteBuf r4) {
            r3 = this;
            io.netty.handler.codec.http.websocketx.CloseWebSocketFrame r0 = new io.netty.handler.codec.http.websocketx.CloseWebSocketFrame
            boolean r1 = r3.isFinalFragment()
            int r2 = r3.rsv()
            r0.<init>(r1, r2, r4)
            return r0
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.websocketx.WebSocketFrame replace(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            io.netty.handler.codec.http.websocketx.CloseWebSocketFrame r1 = r0.replace(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo39retain() {
            r1 = this;
            io.netty.handler.codec.http.websocketx.CloseWebSocketFrame r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo40retain(int r1) {
            r0 = this;
            io.netty.handler.codec.http.websocketx.CloseWebSocketFrame r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.codec.http.websocketx.CloseWebSocketFrame mo39retain() {
            r0 = this;
            super.mo39retain()
            return r0
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.codec.http.websocketx.CloseWebSocketFrame mo40retain(int r1) {
            r0 = this;
            super.mo40retain(r1)
            return r0
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.websocketx.WebSocketFrame mo39retain() {
            r1 = this;
            io.netty.handler.codec.http.websocketx.CloseWebSocketFrame r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.websocketx.WebSocketFrame mo40retain(int r1) {
            r0 = this;
            io.netty.handler.codec.http.websocketx.CloseWebSocketFrame r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.buffer.DefaultByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo8retain() {
            r1 = this;
            io.netty.handler.codec.http.websocketx.CloseWebSocketFrame r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.buffer.DefaultByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo9retain(int r1) {
            r0 = this;
            io.netty.handler.codec.http.websocketx.CloseWebSocketFrame r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder retainedDuplicate() {
            r1 = this;
            io.netty.handler.codec.http.websocketx.CloseWebSocketFrame r0 = r1.retainedDuplicate()
            return r0
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.http.websocketx.CloseWebSocketFrame retainedDuplicate() {
            r1 = this;
            io.netty.handler.codec.http.websocketx.WebSocketFrame r0 = super.retainedDuplicate()
            io.netty.handler.codec.http.websocketx.CloseWebSocketFrame r0 = (io.netty.handler.codec.http.websocketx.CloseWebSocketFrame) r0
            return r0
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.websocketx.WebSocketFrame retainedDuplicate() {
            r1 = this;
            io.netty.handler.codec.http.websocketx.CloseWebSocketFrame r0 = r1.retainedDuplicate()
            return r0
    }

    public int statusCode() {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r2.content()
            if (r0 == 0) goto L16
            int r1 = r0.capacity()
            if (r1 != 0) goto Ld
            goto L16
        Ld:
            r1 = 0
            r0.readerIndex(r1)
            short r0 = r0.getShort(r1)
            return r0
        L16:
            r0 = -1
            return r0
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo41touch() {
            r1 = this;
            io.netty.handler.codec.http.websocketx.CloseWebSocketFrame r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.http.websocketx.CloseWebSocketFrame r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.codec.http.websocketx.CloseWebSocketFrame mo41touch() {
            r0 = this;
            super.mo41touch()
            return r0
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.codec.http.websocketx.CloseWebSocketFrame mo42touch(java.lang.Object r1) {
            r0 = this;
            super.mo42touch(r1)
            return r0
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.websocketx.WebSocketFrame mo41touch() {
            r1 = this;
            io.netty.handler.codec.http.websocketx.CloseWebSocketFrame r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.websocketx.WebSocketFrame mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.http.websocketx.CloseWebSocketFrame r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.buffer.DefaultByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo10touch() {
            r1 = this;
            io.netty.handler.codec.http.websocketx.CloseWebSocketFrame r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketFrame, io.netty.buffer.DefaultByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo11touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.http.websocketx.CloseWebSocketFrame r1 = r0.mo42touch(r1)
            return r1
    }
}
