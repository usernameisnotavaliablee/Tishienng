package io.netty.handler.codec.http.multipart;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class MixedFileUpload implements io.netty.handler.codec.http.multipart.FileUpload {
    private final long definedSize;
    private io.netty.handler.codec.http.multipart.FileUpload fileUpload;
    private final long limitSize;
    private long maxSize;

    public MixedFileUpload(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.nio.charset.Charset r7, long r8, long r10) {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.maxSize = r0
            r2.limitSize = r10
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 <= 0) goto L1b
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            io.netty.handler.codec.http.multipart.DiskFileUpload r3 = new io.netty.handler.codec.http.multipart.DiskFileUpload
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r2.fileUpload = r3
            goto L30
        L1b:
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            io.netty.handler.codec.http.multipart.MemoryFileUpload r3 = new io.netty.handler.codec.http.multipart.MemoryFileUpload
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r9 = r10
            r2.fileUpload = r4
        L30:
            r2.definedSize = r9
            return
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public void addContent(io.netty.buffer.ByteBuf r14, boolean r15) throws java.io.IOException {
            r13 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r13.fileUpload
            boolean r1 = r0 instanceof io.netty.handler.codec.http.multipart.MemoryFileUpload
            if (r1 == 0) goto L6c
            long r0 = r0.length()
            int r2 = r14.readableBytes()
            long r2 = (long) r2
            long r0 = r0 + r2
            r13.checkSize(r0)
            io.netty.handler.codec.http.multipart.FileUpload r0 = r13.fileUpload
            long r0 = r0.length()
            int r2 = r14.readableBytes()
            long r2 = (long) r2
            long r0 = r0 + r2
            long r2 = r13.limitSize
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L6c
            io.netty.handler.codec.http.multipart.DiskFileUpload r5 = new io.netty.handler.codec.http.multipart.DiskFileUpload
            io.netty.handler.codec.http.multipart.FileUpload r0 = r13.fileUpload
            java.lang.String r6 = r0.getName()
            io.netty.handler.codec.http.multipart.FileUpload r0 = r13.fileUpload
            java.lang.String r7 = r0.getFilename()
            io.netty.handler.codec.http.multipart.FileUpload r0 = r13.fileUpload
            java.lang.String r8 = r0.getContentType()
            io.netty.handler.codec.http.multipart.FileUpload r0 = r13.fileUpload
            java.lang.String r9 = r0.getContentTransferEncoding()
            io.netty.handler.codec.http.multipart.FileUpload r0 = r13.fileUpload
            java.nio.charset.Charset r10 = r0.getCharset()
            long r11 = r13.definedSize
            r5.<init>(r6, r7, r8, r9, r10, r11)
            long r0 = r13.maxSize
            r5.setMaxSize(r0)
            io.netty.handler.codec.http.multipart.FileUpload r0 = r13.fileUpload
            io.netty.buffer.ByteBuf r0 = r0.getByteBuf()
            if (r0 == 0) goto L65
            boolean r1 = r0.isReadable()
            if (r1 == 0) goto L65
            io.netty.buffer.ByteBuf r0 = r0.retain()
            r1 = 0
            r5.addContent(r0, r1)
        L65:
            io.netty.handler.codec.http.multipart.FileUpload r0 = r13.fileUpload
            r0.release()
            r13.fileUpload = r5
        L6c:
            io.netty.handler.codec.http.multipart.FileUpload r0 = r13.fileUpload
            r0.addContent(r14, r15)
            return
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public void checkSize(long r6) throws java.io.IOException {
            r5 = this;
            long r0 = r5.maxSize
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L15
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 > 0) goto Ld
            goto L15
        Ld:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r7 = "Size exceed allowed maximum capacity"
            r6.<init>(r7)
            throw r6
        L15:
            return
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(io.netty.handler.codec.http.multipart.InterfaceHttpData r2) {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.fileUpload
            int r2 = r0.compareTo(r2)
            return r2
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(io.netty.handler.codec.http.multipart.InterfaceHttpData r1) {
            r0 = this;
            io.netty.handler.codec.http.multipart.InterfaceHttpData r1 = (io.netty.handler.codec.http.multipart.InterfaceHttpData) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    @Override // io.netty.buffer.ByteBufHolder
    public io.netty.buffer.ByteBuf content() {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.fileUpload
            io.netty.buffer.ByteBuf r0 = r0.content()
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder copy() {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.copy()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.FileUpload, io.netty.handler.codec.http.multipart.HttpData, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.http.multipart.FileUpload copy() {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.fileUpload
            io.netty.handler.codec.http.multipart.FileUpload r0 = r0.copy()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.multipart.HttpData copy() {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.copy()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public long definedLength() {
            r2 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r2.fileUpload
            long r0 = r0.definedLength()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public void delete() {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.fileUpload
            r0.delete()
            return
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder duplicate() {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.duplicate()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.FileUpload, io.netty.handler.codec.http.multipart.HttpData, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.http.multipart.FileUpload duplicate() {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.fileUpload
            io.netty.handler.codec.http.multipart.FileUpload r0 = r0.duplicate()
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
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.fileUpload
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public byte[] get() throws java.io.IOException {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.fileUpload
            byte[] r0 = r0.get()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public io.netty.buffer.ByteBuf getByteBuf() throws java.io.IOException {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.fileUpload
            io.netty.buffer.ByteBuf r0 = r0.getByteBuf()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public java.nio.charset.Charset getCharset() {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.fileUpload
            java.nio.charset.Charset r0 = r0.getCharset()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public io.netty.buffer.ByteBuf getChunk(int r2) throws java.io.IOException {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.fileUpload
            io.netty.buffer.ByteBuf r2 = r0.getChunk(r2)
            return r2
    }

    @Override // io.netty.handler.codec.http.multipart.FileUpload
    public java.lang.String getContentTransferEncoding() {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.fileUpload
            java.lang.String r0 = r0.getContentTransferEncoding()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.FileUpload
    public java.lang.String getContentType() {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.fileUpload
            java.lang.String r0 = r0.getContentType()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public java.io.File getFile() throws java.io.IOException {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.fileUpload
            java.io.File r0 = r0.getFile()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.FileUpload
    public java.lang.String getFilename() {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.fileUpload
            java.lang.String r0 = r0.getFilename()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpData
    public io.netty.handler.codec.http.multipart.InterfaceHttpData.HttpDataType getHttpDataType() {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.fileUpload
            io.netty.handler.codec.http.multipart.InterfaceHttpData$HttpDataType r0 = r0.getHttpDataType()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public long getMaxSize() {
            r2 = this;
            long r0 = r2.maxSize
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpData
    public java.lang.String getName() {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.fileUpload
            java.lang.String r0 = r0.getName()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public java.lang.String getString() throws java.io.IOException {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.fileUpload
            java.lang.String r0 = r0.getString()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public java.lang.String getString(java.nio.charset.Charset r2) throws java.io.IOException {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.fileUpload
            java.lang.String r2 = r0.getString(r2)
            return r2
    }

    public int hashCode() {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.fileUpload
            int r0 = r0.hashCode()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public boolean isCompleted() {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.fileUpload
            boolean r0 = r0.isCompleted()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public boolean isInMemory() {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.fileUpload
            boolean r0 = r0.isInMemory()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public long length() {
            r2 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r2.fileUpload
            long r0 = r0.length()
            return r0
    }

    public int refCnt() {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.fileUpload
            int r0 = r0.refCnt()
            return r0
    }

    public boolean release() {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.fileUpload
            boolean r0 = r0.release()
            return r0
    }

    public boolean release(int r2) {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.fileUpload
            boolean r2 = r0.release(r2)
            return r2
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public boolean renameTo(java.io.File r2) throws java.io.IOException {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.fileUpload
            boolean r2 = r0.renameTo(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder replace(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            io.netty.handler.codec.http.multipart.FileUpload r1 = r0.replace(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.multipart.FileUpload, io.netty.handler.codec.http.multipart.HttpData, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.http.multipart.FileUpload replace(io.netty.buffer.ByteBuf r2) {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.fileUpload
            io.netty.handler.codec.http.multipart.FileUpload r2 = r0.replace(r2)
            return r2
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.multipart.HttpData replace(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            io.netty.handler.codec.http.multipart.FileUpload r1 = r0.replace(r1)
            return r1
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo39retain() {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo40retain(int r1) {
            r0 = this;
            io.netty.handler.codec.http.multipart.FileUpload r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.multipart.FileUpload, io.netty.handler.codec.http.multipart.HttpData, io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.codec.http.multipart.FileUpload mo39retain() {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.fileUpload
            r0.mo39retain()
            return r1
    }

    @Override // io.netty.handler.codec.http.multipart.FileUpload, io.netty.handler.codec.http.multipart.HttpData, io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.codec.http.multipart.FileUpload mo40retain(int r2) {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.fileUpload
            r0.mo40retain(r2)
            return r1
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData, io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.multipart.HttpData mo39retain() {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData, io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.multipart.HttpData mo40retain(int r1) {
            r0 = this;
            io.netty.handler.codec.http.multipart.FileUpload r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.multipart.InterfaceHttpData mo39retain() {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.multipart.InterfaceHttpData mo40retain(int r1) {
            r0 = this;
            io.netty.handler.codec.http.multipart.FileUpload r1 = r0.mo40retain(r1)
            return r1
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted retain() {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.mo39retain()
            return r0
    }

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

    @Override // io.netty.handler.codec.http.multipart.FileUpload, io.netty.handler.codec.http.multipart.HttpData, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.http.multipart.FileUpload retainedDuplicate() {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.fileUpload
            io.netty.handler.codec.http.multipart.FileUpload r0 = r0.retainedDuplicate()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.multipart.HttpData retainedDuplicate() {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.retainedDuplicate()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public void setCharset(java.nio.charset.Charset r2) {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.fileUpload
            r0.setCharset(r2)
            return
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public void setContent(io.netty.buffer.ByteBuf r11) throws java.io.IOException {
            r10 = this;
            int r0 = r11.readableBytes()
            long r0 = (long) r0
            r10.checkSize(r0)
            int r0 = r11.readableBytes()
            long r0 = (long) r0
            long r2 = r10.limitSize
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L3e
            io.netty.handler.codec.http.multipart.FileUpload r0 = r10.fileUpload
            boolean r1 = r0 instanceof io.netty.handler.codec.http.multipart.MemoryFileUpload
            if (r1 == 0) goto L3e
            io.netty.handler.codec.http.multipart.DiskFileUpload r2 = new io.netty.handler.codec.http.multipart.DiskFileUpload
            java.lang.String r3 = r0.getName()
            java.lang.String r4 = r0.getFilename()
            java.lang.String r5 = r0.getContentType()
            java.lang.String r6 = r0.getContentTransferEncoding()
            java.nio.charset.Charset r7 = r0.getCharset()
            long r8 = r10.definedSize
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r10.fileUpload = r2
            long r3 = r10.maxSize
            r2.setMaxSize(r3)
            r0.release()
        L3e:
            io.netty.handler.codec.http.multipart.FileUpload r0 = r10.fileUpload
            r0.setContent(r11)
            return
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public void setContent(java.io.File r11) throws java.io.IOException {
            r10 = this;
            long r0 = r11.length()
            r10.checkSize(r0)
            long r0 = r11.length()
            long r2 = r10.limitSize
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L3c
            io.netty.handler.codec.http.multipart.FileUpload r0 = r10.fileUpload
            boolean r1 = r0 instanceof io.netty.handler.codec.http.multipart.MemoryFileUpload
            if (r1 == 0) goto L3c
            io.netty.handler.codec.http.multipart.DiskFileUpload r2 = new io.netty.handler.codec.http.multipart.DiskFileUpload
            java.lang.String r3 = r0.getName()
            java.lang.String r4 = r0.getFilename()
            java.lang.String r5 = r0.getContentType()
            java.lang.String r6 = r0.getContentTransferEncoding()
            java.nio.charset.Charset r7 = r0.getCharset()
            long r8 = r10.definedSize
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r10.fileUpload = r2
            long r3 = r10.maxSize
            r2.setMaxSize(r3)
            r0.release()
        L3c:
            io.netty.handler.codec.http.multipart.FileUpload r0 = r10.fileUpload
            r0.setContent(r11)
            return
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public void setContent(java.io.InputStream r11) throws java.io.IOException {
            r10 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r10.fileUpload
            boolean r1 = r0 instanceof io.netty.handler.codec.http.multipart.MemoryFileUpload
            if (r1 == 0) goto L35
            io.netty.handler.codec.http.multipart.DiskFileUpload r2 = new io.netty.handler.codec.http.multipart.DiskFileUpload
            io.netty.handler.codec.http.multipart.FileUpload r1 = r10.fileUpload
            java.lang.String r3 = r1.getName()
            io.netty.handler.codec.http.multipart.FileUpload r1 = r10.fileUpload
            java.lang.String r4 = r1.getFilename()
            io.netty.handler.codec.http.multipart.FileUpload r1 = r10.fileUpload
            java.lang.String r5 = r1.getContentType()
            io.netty.handler.codec.http.multipart.FileUpload r1 = r10.fileUpload
            java.lang.String r6 = r1.getContentTransferEncoding()
            io.netty.handler.codec.http.multipart.FileUpload r1 = r10.fileUpload
            java.nio.charset.Charset r7 = r1.getCharset()
            long r8 = r10.definedSize
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r10.fileUpload = r2
            long r3 = r10.maxSize
            r2.setMaxSize(r3)
            r0.release()
        L35:
            io.netty.handler.codec.http.multipart.FileUpload r0 = r10.fileUpload
            r0.setContent(r11)
            return
    }

    @Override // io.netty.handler.codec.http.multipart.FileUpload
    public void setContentTransferEncoding(java.lang.String r2) {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.fileUpload
            r0.setContentTransferEncoding(r2)
            return
    }

    @Override // io.netty.handler.codec.http.multipart.FileUpload
    public void setContentType(java.lang.String r2) {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.fileUpload
            r0.setContentType(r2)
            return
    }

    @Override // io.netty.handler.codec.http.multipart.FileUpload
    public void setFilename(java.lang.String r2) {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.fileUpload
            r0.setFilename(r2)
            return
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public void setMaxSize(long r2) {
            r1 = this;
            r1.maxSize = r2
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.fileUpload
            r0.setMaxSize(r2)
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Mixed: "
            r0.append(r1)
            io.netty.handler.codec.http.multipart.FileUpload r1 = r2.fileUpload
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo41touch() {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.http.multipart.FileUpload r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.multipart.FileUpload, io.netty.handler.codec.http.multipart.HttpData, io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.codec.http.multipart.FileUpload mo41touch() {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.fileUpload
            r0.mo41touch()
            return r1
    }

    @Override // io.netty.handler.codec.http.multipart.FileUpload, io.netty.handler.codec.http.multipart.HttpData, io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.codec.http.multipart.FileUpload mo42touch(java.lang.Object r2) {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.fileUpload
            r0.mo42touch(r2)
            return r1
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData, io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.multipart.HttpData mo41touch() {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData, io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.multipart.HttpData mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.http.multipart.FileUpload r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.multipart.InterfaceHttpData mo41touch() {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.multipart.InterfaceHttpData mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.http.multipart.FileUpload r1 = r0.mo42touch(r1)
            return r1
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted touch() {
            r1 = this;
            io.netty.handler.codec.http.multipart.FileUpload r0 = r1.mo41touch()
            return r0
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.http.multipart.FileUpload r1 = r0.mo42touch(r1)
            return r1
    }
}
