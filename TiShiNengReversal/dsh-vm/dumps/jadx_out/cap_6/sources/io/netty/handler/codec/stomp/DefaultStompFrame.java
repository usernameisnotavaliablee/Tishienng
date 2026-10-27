package io.netty.handler.codec.stomp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultStompFrame extends io.netty.handler.codec.stomp.DefaultStompHeadersSubframe implements io.netty.handler.codec.stomp.StompFrame {
    private final io.netty.buffer.ByteBuf content;

    public DefaultStompFrame(io.netty.handler.codec.stomp.StompCommand r2) {
            r1 = this;
            r0 = 0
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.buffer(r0)
            r1.<init>(r2, r0)
            return
    }

    public DefaultStompFrame(io.netty.handler.codec.stomp.StompCommand r2, io.netty.buffer.ByteBuf r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    DefaultStompFrame(io.netty.handler.codec.stomp.StompCommand r1, io.netty.buffer.ByteBuf r2, io.netty.handler.codec.stomp.DefaultStompHeaders r3) {
            r0 = this;
            r0.<init>(r1, r3)
            if (r2 == 0) goto L8
            r0.content = r2
            return
        L8:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "content"
            r1.<init>(r2)
            throw r1
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
            io.netty.handler.codec.stomp.StompFrame r0 = r1.copy()
            return r0
    }

    @Override // io.netty.handler.codec.stomp.LastStompContentSubframe, io.netty.handler.codec.stomp.StompContentSubframe, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.stomp.LastStompContentSubframe copy() {
            r1 = this;
            io.netty.handler.codec.stomp.StompFrame r0 = r1.copy()
            return r0
    }

    @Override // io.netty.handler.codec.stomp.StompContentSubframe, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.stomp.StompContentSubframe copy() {
            r1 = this;
            io.netty.handler.codec.stomp.StompFrame r0 = r1.copy()
            return r0
    }

    @Override // io.netty.handler.codec.stomp.StompFrame, io.netty.handler.codec.stomp.LastStompContentSubframe, io.netty.handler.codec.stomp.StompContentSubframe, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.stomp.StompFrame copy() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content
            io.netty.buffer.ByteBuf r0 = r0.copy()
            io.netty.handler.codec.stomp.StompFrame r0 = r1.replace(r0)
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder duplicate() {
            r1 = this;
            io.netty.handler.codec.stomp.StompFrame r0 = r1.duplicate()
            return r0
    }

    @Override // io.netty.handler.codec.stomp.LastStompContentSubframe, io.netty.handler.codec.stomp.StompContentSubframe, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.stomp.LastStompContentSubframe duplicate() {
            r1 = this;
            io.netty.handler.codec.stomp.StompFrame r0 = r1.duplicate()
            return r0
    }

    @Override // io.netty.handler.codec.stomp.StompContentSubframe, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.stomp.StompContentSubframe duplicate() {
            r1 = this;
            io.netty.handler.codec.stomp.StompFrame r0 = r1.duplicate()
            return r0
    }

    @Override // io.netty.handler.codec.stomp.StompFrame, io.netty.handler.codec.stomp.LastStompContentSubframe, io.netty.handler.codec.stomp.StompContentSubframe, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.stomp.StompFrame duplicate() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content
            io.netty.buffer.ByteBuf r0 = r0.duplicate()
            io.netty.handler.codec.stomp.StompFrame r0 = r1.replace(r0)
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
            io.netty.handler.codec.stomp.StompFrame r1 = r0.replace(r1)
            return r1
    }

    @Override // io.netty.handler.codec.stomp.LastStompContentSubframe, io.netty.handler.codec.stomp.StompContentSubframe, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.stomp.LastStompContentSubframe replace(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            io.netty.handler.codec.stomp.StompFrame r1 = r0.replace(r1)
            return r1
    }

    @Override // io.netty.handler.codec.stomp.StompContentSubframe, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.stomp.StompContentSubframe replace(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            io.netty.handler.codec.stomp.StompFrame r1 = r0.replace(r1)
            return r1
    }

    @Override // io.netty.handler.codec.stomp.StompFrame, io.netty.handler.codec.stomp.LastStompContentSubframe, io.netty.handler.codec.stomp.StompContentSubframe, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.stomp.StompFrame replace(io.netty.buffer.ByteBuf r4) {
            r3 = this;
            io.netty.handler.codec.stomp.DefaultStompFrame r0 = new io.netty.handler.codec.stomp.DefaultStompFrame
            io.netty.handler.codec.stomp.StompCommand r1 = r3.command
            io.netty.handler.codec.stomp.DefaultStompHeaders r2 = r3.headers
            io.netty.handler.codec.stomp.DefaultStompHeaders r2 = r2.copy2()
            r0.<init>(r1, r4, r2)
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo39retain() {
            r1 = this;
            io.netty.handler.codec.stomp.StompFrame r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo40retain(int r1) {
            r0 = this;
            io.netty.handler.codec.stomp.StompFrame r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.handler.codec.stomp.LastStompContentSubframe, io.netty.handler.codec.stomp.StompContentSubframe, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.stomp.LastStompContentSubframe mo39retain() {
            r1 = this;
            io.netty.handler.codec.stomp.StompFrame r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.handler.codec.stomp.LastStompContentSubframe, io.netty.handler.codec.stomp.StompContentSubframe, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.stomp.LastStompContentSubframe mo40retain(int r1) {
            r0 = this;
            io.netty.handler.codec.stomp.StompFrame r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.handler.codec.stomp.StompContentSubframe, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.stomp.StompContentSubframe mo39retain() {
            r1 = this;
            io.netty.handler.codec.stomp.StompFrame r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.handler.codec.stomp.StompContentSubframe, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.stomp.StompContentSubframe mo40retain(int r1) {
            r0 = this;
            io.netty.handler.codec.stomp.StompFrame r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.handler.codec.stomp.StompFrame, io.netty.handler.codec.stomp.LastStompContentSubframe, io.netty.handler.codec.stomp.StompContentSubframe, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.codec.stomp.StompFrame mo39retain() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content
            r0.retain()
            return r1
    }

    @Override // io.netty.handler.codec.stomp.StompFrame, io.netty.handler.codec.stomp.LastStompContentSubframe, io.netty.handler.codec.stomp.StompContentSubframe, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.codec.stomp.StompFrame mo40retain(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content
            r0.retain(r2)
            return r1
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted retain() {
            r1 = this;
            io.netty.handler.codec.stomp.StompFrame r0 = r1.mo39retain()
            return r0
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted retain(int r1) {
            r0 = this;
            io.netty.handler.codec.stomp.StompFrame r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder retainedDuplicate() {
            r1 = this;
            io.netty.handler.codec.stomp.StompFrame r0 = r1.retainedDuplicate()
            return r0
    }

    @Override // io.netty.handler.codec.stomp.LastStompContentSubframe, io.netty.handler.codec.stomp.StompContentSubframe, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.stomp.LastStompContentSubframe retainedDuplicate() {
            r1 = this;
            io.netty.handler.codec.stomp.StompFrame r0 = r1.retainedDuplicate()
            return r0
    }

    @Override // io.netty.handler.codec.stomp.StompContentSubframe, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.stomp.StompContentSubframe retainedDuplicate() {
            r1 = this;
            io.netty.handler.codec.stomp.StompFrame r0 = r1.retainedDuplicate()
            return r0
    }

    @Override // io.netty.handler.codec.stomp.StompFrame, io.netty.handler.codec.stomp.LastStompContentSubframe, io.netty.handler.codec.stomp.StompContentSubframe, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.stomp.StompFrame retainedDuplicate() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content
            io.netty.buffer.ByteBuf r0 = r0.retainedDuplicate()
            io.netty.handler.codec.stomp.StompFrame r0 = r1.replace(r0)
            return r0
    }

    @Override // io.netty.handler.codec.stomp.DefaultStompHeadersSubframe
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "DefaultStompFrame{command="
            r0.append(r1)
            io.netty.handler.codec.stomp.StompCommand r1 = r3.command
            r0.append(r1)
            java.lang.String r1 = ", headers="
            r0.append(r1)
            io.netty.handler.codec.stomp.DefaultStompHeaders r1 = r3.headers
            r0.append(r1)
            java.lang.String r1 = ", content="
            r0.append(r1)
            io.netty.buffer.ByteBuf r1 = r3.content
            java.nio.charset.Charset r2 = io.netty.util.CharsetUtil.UTF_8
            java.lang.String r1 = r1.toString(r2)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo41touch() {
            r1 = this;
            io.netty.handler.codec.stomp.StompFrame r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.stomp.StompFrame r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.handler.codec.stomp.LastStompContentSubframe, io.netty.handler.codec.stomp.StompContentSubframe, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.stomp.LastStompContentSubframe mo41touch() {
            r1 = this;
            io.netty.handler.codec.stomp.StompFrame r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.handler.codec.stomp.LastStompContentSubframe, io.netty.handler.codec.stomp.StompContentSubframe, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.stomp.LastStompContentSubframe mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.stomp.StompFrame r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.handler.codec.stomp.StompContentSubframe, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.stomp.StompContentSubframe mo41touch() {
            r1 = this;
            io.netty.handler.codec.stomp.StompFrame r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.handler.codec.stomp.StompContentSubframe, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.stomp.StompContentSubframe mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.stomp.StompFrame r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.handler.codec.stomp.StompFrame, io.netty.handler.codec.stomp.LastStompContentSubframe, io.netty.handler.codec.stomp.StompContentSubframe, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.codec.stomp.StompFrame mo41touch() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content
            r0.touch()
            return r1
    }

    @Override // io.netty.handler.codec.stomp.StompFrame, io.netty.handler.codec.stomp.LastStompContentSubframe, io.netty.handler.codec.stomp.StompContentSubframe, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.codec.stomp.StompFrame mo42touch(java.lang.Object r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content
            r0.touch(r2)
            return r1
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted touch() {
            r1 = this;
            io.netty.handler.codec.stomp.StompFrame r0 = r1.mo41touch()
            return r0
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.stomp.StompFrame r1 = r0.mo42touch(r1)
            return r1
    }
}
