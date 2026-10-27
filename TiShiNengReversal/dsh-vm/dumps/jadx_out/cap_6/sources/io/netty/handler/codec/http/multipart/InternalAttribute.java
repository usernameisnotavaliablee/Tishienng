package io.netty.handler.codec.http.multipart;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class InternalAttribute extends io.netty.util.AbstractReferenceCounted implements io.netty.handler.codec.http.multipart.InterfaceHttpData {
    private final java.nio.charset.Charset charset;
    private int size;
    private final java.util.List<io.netty.buffer.ByteBuf> value;

    InternalAttribute(java.nio.charset.Charset r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.value = r0
            r1.charset = r2
            return
    }

    public void addValue(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto L17
            java.nio.charset.Charset r0 = r1.charset
            io.netty.buffer.ByteBuf r2 = io.netty.buffer.Unpooled.copiedBuffer(r2, r0)
            java.util.List<io.netty.buffer.ByteBuf> r0 = r1.value
            r0.add(r2)
            int r0 = r1.size
            int r2 = r2.readableBytes()
            int r0 = r0 + r2
            r1.size = r0
            return
        L17:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "value"
            r2.<init>(r0)
            throw r2
    }

    public void addValue(java.lang.String r2, int r3) {
            r1 = this;
            if (r2 == 0) goto L17
            java.nio.charset.Charset r0 = r1.charset
            io.netty.buffer.ByteBuf r2 = io.netty.buffer.Unpooled.copiedBuffer(r2, r0)
            java.util.List<io.netty.buffer.ByteBuf> r0 = r1.value
            r0.add(r3, r2)
            int r3 = r1.size
            int r2 = r2.readableBytes()
            int r3 = r3 + r2
            r1.size = r3
            return
        L17:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "value"
            r2.<init>(r3)
            throw r2
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(io.netty.handler.codec.http.multipart.InterfaceHttpData r4) {
            r3 = this;
            boolean r0 = r4 instanceof io.netty.handler.codec.http.multipart.InternalAttribute
            if (r0 == 0) goto Lb
            io.netty.handler.codec.http.multipart.InternalAttribute r4 = (io.netty.handler.codec.http.multipart.InternalAttribute) r4
            int r4 = r3.compareTo(r4)
            return r4
        Lb:
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot compare "
            r1.append(r2)
            io.netty.handler.codec.http.multipart.InterfaceHttpData$HttpDataType r2 = r3.getHttpDataType()
            r1.append(r2)
            java.lang.String r2 = " with "
            r1.append(r2)
            io.netty.handler.codec.http.multipart.InterfaceHttpData$HttpDataType r4 = r4.getHttpDataType()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public int compareTo(io.netty.handler.codec.http.multipart.InternalAttribute r2) {
            r1 = this;
            java.lang.String r0 = r1.getName()
            java.lang.String r2 = r2.getName()
            int r2 = r0.compareToIgnoreCase(r2)
            return r2
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(io.netty.handler.codec.http.multipart.InterfaceHttpData r1) {
            r0 = this;
            io.netty.handler.codec.http.multipart.InterfaceHttpData r1 = (io.netty.handler.codec.http.multipart.InterfaceHttpData) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    protected void deallocate() {
            r0 = this;
            return
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof io.netty.handler.codec.http.multipart.InternalAttribute
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            io.netty.handler.codec.http.multipart.InternalAttribute r2 = (io.netty.handler.codec.http.multipart.InternalAttribute) r2
            java.lang.String r0 = r1.getName()
            java.lang.String r2 = r2.getName()
            boolean r2 = r0.equalsIgnoreCase(r2)
            return r2
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpData
    public io.netty.handler.codec.http.multipart.InterfaceHttpData.HttpDataType getHttpDataType() {
            r1 = this;
            io.netty.handler.codec.http.multipart.InterfaceHttpData$HttpDataType r0 = io.netty.handler.codec.http.multipart.InterfaceHttpData.HttpDataType.InternalAttribute
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpData
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = "InternalAttribute"
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.getName()
            int r0 = r0.hashCode()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.codec.http.multipart.InterfaceHttpData mo39retain() {
            r2 = this;
            java.util.List<io.netty.buffer.ByteBuf> r0 = r2.value
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            io.netty.buffer.ByteBuf r1 = (io.netty.buffer.ByteBuf) r1
            r1.retain()
            goto L6
        L16:
            return r2
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.codec.http.multipart.InterfaceHttpData mo40retain(int r3) {
            r2 = this;
            java.util.List<io.netty.buffer.ByteBuf> r0 = r2.value
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            io.netty.buffer.ByteBuf r1 = (io.netty.buffer.ByteBuf) r1
            r1.retain(r3)
            goto L6
        L16:
            return r2
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted retain() {
            r1 = this;
            io.netty.handler.codec.http.multipart.InterfaceHttpData r0 = r1.mo39retain()
            return r0
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted retain(int r1) {
            r0 = this;
            io.netty.handler.codec.http.multipart.InterfaceHttpData r1 = r0.mo40retain(r1)
            return r1
    }

    public void setValue(java.lang.String r3, int r4) {
            r2 = this;
            if (r3 == 0) goto L28
            java.nio.charset.Charset r0 = r2.charset
            io.netty.buffer.ByteBuf r3 = io.netty.buffer.Unpooled.copiedBuffer(r3, r0)
            java.util.List<io.netty.buffer.ByteBuf> r0 = r2.value
            java.lang.Object r4 = r0.set(r4, r3)
            io.netty.buffer.ByteBuf r4 = (io.netty.buffer.ByteBuf) r4
            if (r4 == 0) goto L1e
            int r0 = r2.size
            int r1 = r4.readableBytes()
            int r0 = r0 - r1
            r2.size = r0
            r4.release()
        L1e:
            int r4 = r2.size
            int r3 = r3.readableBytes()
            int r4 = r4 + r3
            r2.size = r4
            return
        L28:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "value"
            r3.<init>(r4)
            throw r3
    }

    public int size() {
            r1 = this;
            int r0 = r1.size
            return r0
    }

    public io.netty.buffer.ByteBuf toByteBuf() {
            r2 = this;
            io.netty.buffer.CompositeByteBuf r0 = io.netty.buffer.Unpooled.compositeBuffer()
            java.util.List<io.netty.buffer.ByteBuf> r1 = r2.value
            io.netty.buffer.CompositeByteBuf r0 = r0.addComponents(r1)
            int r1 = r2.size()
            io.netty.buffer.CompositeByteBuf r0 = r0.writerIndex(r1)
            r1 = 0
            io.netty.buffer.CompositeByteBuf r0 = r0.readerIndex(r1)
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.List<io.netty.buffer.ByteBuf> r1 = r4.value
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L21
            java.lang.Object r2 = r1.next()
            io.netty.buffer.ByteBuf r2 = (io.netty.buffer.ByteBuf) r2
            java.nio.charset.Charset r3 = r4.charset
            java.lang.String r2 = r2.toString(r3)
            r0.append(r2)
            goto Lb
        L21:
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.codec.http.multipart.InterfaceHttpData mo41touch() {
            r2 = this;
            java.util.List<io.netty.buffer.ByteBuf> r0 = r2.value
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            io.netty.buffer.ByteBuf r1 = (io.netty.buffer.ByteBuf) r1
            r1.touch()
            goto L6
        L16:
            return r2
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.codec.http.multipart.InterfaceHttpData mo42touch(java.lang.Object r3) {
            r2 = this;
            java.util.List<io.netty.buffer.ByteBuf> r0 = r2.value
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            io.netty.buffer.ByteBuf r1 = (io.netty.buffer.ByteBuf) r1
            r1.touch(r3)
            goto L6
        L16:
            return r2
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted touch() {
            r1 = this;
            io.netty.handler.codec.http.multipart.InterfaceHttpData r0 = r1.mo41touch()
            return r0
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.http.multipart.InterfaceHttpData r1 = r0.mo42touch(r1)
            return r1
    }
}
