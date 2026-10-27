package io.netty.handler.codec.http.multipart;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class MemoryFileUpload extends io.netty.handler.codec.http.multipart.AbstractMemoryHttpData implements io.netty.handler.codec.http.multipart.FileUpload {
    private java.lang.String contentTransferEncoding;
    private java.lang.String contentType;
    private java.lang.String filename;

    public MemoryFileUpload(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.nio.charset.Charset r5, long r6) {
            r0 = this;
            r0.<init>(r1, r5, r6)
            r0.setFilename(r2)
            r0.setContentType(r3)
            r0.setContentTransferEncoding(r4)
            return
    }

    public int compareTo(io.netty.handler.codec.http.multipart.FileUpload r1) {
            r0 = this;
            int r1 = io.netty.handler.codec.http.multipart.FileUploadUtil.compareTo(r0, r1)
            return r1
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(io.netty.handler.codec.http.multipart.InterfaceHttpData r4) {
            r3 = this;
            boolean r0 = r4 instanceof io.netty.handler.codec.http.multipart.FileUpload
            if (r0 == 0) goto Lb
            io.netty.handler.codec.http.multipart.FileUpload r4 = (io.netty.handler.codec.http.multipart.FileUpload) r4
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

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(io.netty.handler.codec.http.multipart.InterfaceHttpData r1) {
            r0 = this;
            io.netty.handler.codec.http.multipart.InterfaceHttpData r1 = (io.netty.handler.codec.http.multipart.InterfaceHttpData) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder copy() {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.copy()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.http.multipart.FileUpload copy() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content()
            if (r0 == 0) goto La
            io.netty.buffer.ByteBuf r0 = r0.copy()
        La:
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.replace(r0)
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.multipart.HttpData copy() {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.copy()
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder duplicate() {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.duplicate()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.http.multipart.FileUpload duplicate() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content()
            if (r0 == 0) goto La
            io.netty.buffer.ByteBuf r0 = r0.duplicate()
        La:
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.replace(r0)
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.multipart.HttpData duplicate() {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.duplicate()
            return r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof io.netty.handler.codec.http.multipart.FileUpload
            if (r0 == 0) goto Le
            io.netty.handler.codec.http.multipart.FileUpload r2 = (io.netty.handler.codec.http.multipart.FileUpload) r2
            boolean r2 = io.netty.handler.codec.http.multipart.FileUploadUtil.equals(r1, r2)
            if (r2 == 0) goto Le
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }

    @Override // io.netty.handler.codec.http.multipart.FileUpload
    public java.lang.String getContentTransferEncoding() {
            r1 = this;
            java.lang.String r0 = r1.contentTransferEncoding
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.FileUpload
    public java.lang.String getContentType() {
            r1 = this;
            java.lang.String r0 = r1.contentType
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.FileUpload
    public java.lang.String getFilename() {
            r1 = this;
            java.lang.String r0 = r1.filename
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpData
    public io.netty.handler.codec.http.multipart.InterfaceHttpData.HttpDataType getHttpDataType() {
            r1 = this;
            io.netty.handler.codec.http.multipart.InterfaceHttpData$HttpDataType r0 = io.netty.handler.codec.http.multipart.InterfaceHttpData.HttpDataType.FileUpload
            return r0
    }

    public int hashCode() {
            r1 = this;
            int r0 = io.netty.handler.codec.http.multipart.FileUploadUtil.hashCode(r1)
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder replace(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            io.netty.handler.codec.http.multipart.FileUpload r1 = r0.replace(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.http.multipart.FileUpload replace(io.netty.buffer.ByteBuf r9) {
            r8 = this;
            io.netty.handler.codec.http.multipart.MemoryFileUpload r0 = new io.netty.handler.codec.http.multipart.MemoryFileUpload
            java.lang.String r1 = r8.getName()
            java.lang.String r2 = r8.getFilename()
            java.lang.String r3 = r8.getContentType()
            java.lang.String r4 = r8.getContentTransferEncoding()
            java.nio.charset.Charset r5 = r8.getCharset()
            long r6 = r8.size
            r0.<init>(r1, r2, r3, r4, r5, r6)
            if (r9 == 0) goto L29
            r0.setContent(r9)     // Catch: java.io.IOException -> L21
            return r0
        L21:
            r0 = move-exception
            r9 = r0
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r9)
            throw r0
        L29:
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.multipart.HttpData replace(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            io.netty.handler.codec.http.multipart.FileUpload r1 = r0.replace(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.multipart.AbstractHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo39retain() {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.AbstractHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo40retain(int r1) {
            r0 = this;
            io.netty.handler.codec.http.multipart.FileUpload r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.multipart.AbstractHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.codec.http.multipart.FileUpload mo39retain() {
            r0 = this;
            super.mo39retain()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.AbstractHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.codec.http.multipart.FileUpload mo40retain(int r1) {
            r0 = this;
            super.mo40retain(r1)
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.AbstractHttpData, io.netty.handler.codec.http.multipart.HttpData, io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.multipart.HttpData mo39retain() {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.AbstractHttpData, io.netty.handler.codec.http.multipart.HttpData, io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.multipart.HttpData mo40retain(int r1) {
            r0 = this;
            io.netty.handler.codec.http.multipart.FileUpload r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.multipart.AbstractHttpData, io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.multipart.InterfaceHttpData mo39retain() {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.AbstractHttpData, io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.multipart.InterfaceHttpData mo40retain(int r1) {
            r0 = this;
            io.netty.handler.codec.http.multipart.FileUpload r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.multipart.AbstractHttpData
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted retain() {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.AbstractHttpData
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted retain(int r1) {
            r0 = this;
            io.netty.handler.codec.http.multipart.FileUpload r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder retainedDuplicate() {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.retainedDuplicate()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.http.multipart.FileUpload retainedDuplicate() {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r2.content()
            if (r0 == 0) goto L14
            io.netty.buffer.ByteBuf r0 = r0.retainedDuplicate()
            io.netty.handler.codec.http.multipart.FileUpload r0 = r2.replace(r0)     // Catch: java.lang.Throwable -> Lf
            return r0
        Lf:
            r1 = move-exception
            r0.release()
            throw r1
        L14:
            r0 = 0
            io.netty.handler.codec.http.multipart.FileUpload r0 = r2.replace(r0)
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.multipart.HttpData retainedDuplicate() {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.retainedDuplicate()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.FileUpload
    public void setContentTransferEncoding(java.lang.String r1) {
            r0 = this;
            r0.contentTransferEncoding = r1
            return
    }

    @Override // io.netty.handler.codec.http.multipart.FileUpload
    public void setContentType(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto L5
            r1.contentType = r2
            return
        L5:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "contentType"
            r2.<init>(r0)
            throw r2
    }

    @Override // io.netty.handler.codec.http.multipart.FileUpload
    public void setFilename(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto L5
            r1.filename = r2
            return
        L5:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "filename"
            r2.<init>(r0)
            throw r2
    }

    public java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_DISPOSITION
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            io.netty.util.AsciiString r2 = io.netty.handler.codec.http.HttpHeaderValues.FORM_DATA
            r0.append(r2)
            java.lang.String r2 = "; "
            r0.append(r2)
            io.netty.util.AsciiString r3 = io.netty.handler.codec.http.HttpHeaderValues.NAME
            r0.append(r3)
            java.lang.String r3 = "=\""
            r0.append(r3)
            java.lang.String r4 = r5.getName()
            r0.append(r4)
            java.lang.String r4 = "\"; "
            r0.append(r4)
            io.netty.util.AsciiString r4 = io.netty.handler.codec.http.HttpHeaderValues.FILENAME
            r0.append(r4)
            r0.append(r3)
            java.lang.String r3 = r5.filename
            r0.append(r3)
            java.lang.String r3 = "\"\r\n"
            r0.append(r3)
            io.netty.util.AsciiString r3 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_TYPE
            r0.append(r3)
            r0.append(r1)
            java.lang.String r3 = r5.contentType
            r0.append(r3)
            java.nio.charset.Charset r3 = r5.getCharset()
            java.lang.String r4 = "\r\n"
            if (r3 == 0) goto L7a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            io.netty.util.AsciiString r2 = io.netty.handler.codec.http.HttpHeaderValues.CHARSET
            r3.append(r2)
            r2 = 61
            r3.append(r2)
            java.nio.charset.Charset r2 = r5.getCharset()
            java.lang.String r2 = r2.name()
            r3.append(r2)
            r3.append(r4)
            java.lang.String r4 = r3.toString()
        L7a:
            r0.append(r4)
            io.netty.util.AsciiString r2 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_LENGTH
            r0.append(r2)
            r0.append(r1)
            long r1 = r5.length()
            r0.append(r1)
            java.lang.String r1 = "\r\nCompleted: "
            r0.append(r1)
            boolean r1 = r5.isCompleted()
            r0.append(r1)
            java.lang.String r1 = "\r\nIsInMemory: "
            r0.append(r1)
            boolean r1 = r5.isInMemory()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.AbstractMemoryHttpData, io.netty.handler.codec.http.multipart.AbstractHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo41touch() {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.AbstractMemoryHttpData, io.netty.handler.codec.http.multipart.AbstractHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.http.multipart.FileUpload r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.multipart.AbstractMemoryHttpData, io.netty.handler.codec.http.multipart.AbstractHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.codec.http.multipart.FileUpload mo41touch() {
            r0 = this;
            super.mo41touch()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.AbstractMemoryHttpData, io.netty.handler.codec.http.multipart.AbstractHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.codec.http.multipart.FileUpload mo42touch(java.lang.Object r1) {
            r0 = this;
            super.mo42touch(r1)
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.AbstractMemoryHttpData, io.netty.handler.codec.http.multipart.AbstractHttpData, io.netty.handler.codec.http.multipart.HttpData, io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.multipart.HttpData mo41touch() {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.AbstractMemoryHttpData, io.netty.handler.codec.http.multipart.AbstractHttpData, io.netty.handler.codec.http.multipart.HttpData, io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.multipart.HttpData mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.http.multipart.FileUpload r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.multipart.AbstractMemoryHttpData, io.netty.handler.codec.http.multipart.AbstractHttpData, io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.multipart.InterfaceHttpData mo41touch() {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.AbstractMemoryHttpData, io.netty.handler.codec.http.multipart.AbstractHttpData, io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.multipart.InterfaceHttpData mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.http.multipart.FileUpload r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.multipart.AbstractMemoryHttpData, io.netty.handler.codec.http.multipart.AbstractHttpData
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted touch() {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.AbstractMemoryHttpData, io.netty.handler.codec.http.multipart.AbstractHttpData
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.http.multipart.FileUpload r1 = r0.mo42touch(r1)
            return r1
    }
}
