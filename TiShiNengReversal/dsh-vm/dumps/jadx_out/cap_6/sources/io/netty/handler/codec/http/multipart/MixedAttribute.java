package io.netty.handler.codec.http.multipart;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class MixedAttribute implements io.netty.handler.codec.http.multipart.Attribute {
    private io.netty.handler.codec.http.multipart.Attribute attribute;
    private final long limitSize;
    private long maxSize;

    public MixedAttribute(java.lang.String r2, long r3) {
            r1 = this;
            java.nio.charset.Charset r0 = io.netty.handler.codec.http.HttpConstants.DEFAULT_CHARSET
            r1.<init>(r2, r3, r0)
            return
    }

    public MixedAttribute(java.lang.String r8, long r9, long r11) {
            r7 = this;
            java.nio.charset.Charset r6 = io.netty.handler.codec.http.HttpConstants.DEFAULT_CHARSET
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r11
            r0.<init>(r1, r2, r4, r6)
            return
    }

    public MixedAttribute(java.lang.String r3, long r4, long r6, java.nio.charset.Charset r8) {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.maxSize = r0
            r2.limitSize = r6
            io.netty.handler.codec.http.multipart.MemoryAttribute r6 = new io.netty.handler.codec.http.multipart.MemoryAttribute
            r6.<init>(r3, r4, r8)
            r2.attribute = r6
            return
    }

    public MixedAttribute(java.lang.String r3, long r4, java.nio.charset.Charset r6) {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.maxSize = r0
            r2.limitSize = r4
            io.netty.handler.codec.http.multipart.MemoryAttribute r4 = new io.netty.handler.codec.http.multipart.MemoryAttribute
            r4.<init>(r3, r6)
            r2.attribute = r4
            return
    }

    public MixedAttribute(java.lang.String r7, java.lang.String r8, long r9) {
            r6 = this;
            java.nio.charset.Charset r5 = io.netty.handler.codec.http.HttpConstants.DEFAULT_CHARSET
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r5)
            return
    }

    public MixedAttribute(java.lang.String r4, java.lang.String r5, long r6, java.nio.charset.Charset r8) {
            r3 = this;
            r3.<init>()
            r0 = -1
            r3.maxSize = r0
            r3.limitSize = r6
            int r0 = r5.length()
            long r0 = (long) r0
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 <= 0) goto L29
            io.netty.handler.codec.http.multipart.DiskAttribute r6 = new io.netty.handler.codec.http.multipart.DiskAttribute     // Catch: java.io.IOException -> L1a
            r6.<init>(r4, r5, r8)     // Catch: java.io.IOException -> L1a
            r3.attribute = r6     // Catch: java.io.IOException -> L1a
            return
        L1a:
            r6 = move-exception
            io.netty.handler.codec.http.multipart.MemoryAttribute r7 = new io.netty.handler.codec.http.multipart.MemoryAttribute     // Catch: java.io.IOException -> L23
            r7.<init>(r4, r5, r8)     // Catch: java.io.IOException -> L23
            r3.attribute = r7     // Catch: java.io.IOException -> L23
            return
        L23:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>(r6)
            throw r4
        L29:
            io.netty.handler.codec.http.multipart.MemoryAttribute r6 = new io.netty.handler.codec.http.multipart.MemoryAttribute     // Catch: java.io.IOException -> L31
            r6.<init>(r4, r5, r8)     // Catch: java.io.IOException -> L31
            r3.attribute = r6     // Catch: java.io.IOException -> L31
            return
        L31:
            r4 = move-exception
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>(r4)
            throw r5
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public void addContent(io.netty.buffer.ByteBuf r6, boolean r7) throws java.io.IOException {
            r5 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r5.attribute
            boolean r1 = r0 instanceof io.netty.handler.codec.http.multipart.MemoryAttribute
            if (r1 == 0) goto L53
            long r0 = r0.length()
            int r2 = r6.readableBytes()
            long r2 = (long) r2
            long r0 = r0 + r2
            r5.checkSize(r0)
            io.netty.handler.codec.http.multipart.Attribute r0 = r5.attribute
            long r0 = r0.length()
            int r2 = r6.readableBytes()
            long r2 = (long) r2
            long r0 = r0 + r2
            long r2 = r5.limitSize
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L53
            io.netty.handler.codec.http.multipart.DiskAttribute r0 = new io.netty.handler.codec.http.multipart.DiskAttribute
            io.netty.handler.codec.http.multipart.Attribute r1 = r5.attribute
            java.lang.String r1 = r1.getName()
            io.netty.handler.codec.http.multipart.Attribute r2 = r5.attribute
            long r2 = r2.definedLength()
            r0.<init>(r1, r2)
            long r1 = r5.maxSize
            r0.setMaxSize(r1)
            io.netty.handler.codec.http.multipart.Attribute r1 = r5.attribute
            io.netty.handler.codec.http.multipart.MemoryAttribute r1 = (io.netty.handler.codec.http.multipart.MemoryAttribute) r1
            io.netty.buffer.ByteBuf r1 = r1.getByteBuf()
            if (r1 == 0) goto L51
            io.netty.handler.codec.http.multipart.Attribute r1 = r5.attribute
            io.netty.handler.codec.http.multipart.MemoryAttribute r1 = (io.netty.handler.codec.http.multipart.MemoryAttribute) r1
            io.netty.buffer.ByteBuf r1 = r1.getByteBuf()
            r2 = 0
            r0.addContent(r1, r2)
        L51:
            r5.attribute = r0
        L53:
            io.netty.handler.codec.http.multipart.Attribute r0 = r5.attribute
            r0.addContent(r6, r7)
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
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.attribute
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
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.attribute
            io.netty.buffer.ByteBuf r0 = r0.content()
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder copy() {
            r1 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.copy()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.Attribute, io.netty.handler.codec.http.multipart.HttpData, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.http.multipart.Attribute copy() {
            r1 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.attribute
            io.netty.handler.codec.http.multipart.Attribute r0 = r0.copy()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.multipart.HttpData copy() {
            r1 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.copy()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public long definedLength() {
            r2 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r2.attribute
            long r0 = r0.definedLength()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public void delete() {
            r1 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.attribute
            r0.delete()
            return
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder duplicate() {
            r1 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.duplicate()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.Attribute, io.netty.handler.codec.http.multipart.HttpData, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.http.multipart.Attribute duplicate() {
            r1 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.attribute
            io.netty.handler.codec.http.multipart.Attribute r0 = r0.duplicate()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.multipart.HttpData duplicate() {
            r1 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.duplicate()
            return r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.attribute
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public byte[] get() throws java.io.IOException {
            r1 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.attribute
            byte[] r0 = r0.get()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public io.netty.buffer.ByteBuf getByteBuf() throws java.io.IOException {
            r1 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.attribute
            io.netty.buffer.ByteBuf r0 = r0.getByteBuf()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public java.nio.charset.Charset getCharset() {
            r1 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.attribute
            java.nio.charset.Charset r0 = r0.getCharset()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public io.netty.buffer.ByteBuf getChunk(int r2) throws java.io.IOException {
            r1 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.attribute
            io.netty.buffer.ByteBuf r2 = r0.getChunk(r2)
            return r2
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public java.io.File getFile() throws java.io.IOException {
            r1 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.attribute
            java.io.File r0 = r0.getFile()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpData
    public io.netty.handler.codec.http.multipart.InterfaceHttpData.HttpDataType getHttpDataType() {
            r1 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.attribute
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
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.attribute
            java.lang.String r0 = r0.getName()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public java.lang.String getString() throws java.io.IOException {
            r1 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.attribute
            java.lang.String r0 = r0.getString()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public java.lang.String getString(java.nio.charset.Charset r2) throws java.io.IOException {
            r1 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.attribute
            java.lang.String r2 = r0.getString(r2)
            return r2
    }

    @Override // io.netty.handler.codec.http.multipart.Attribute
    public java.lang.String getValue() throws java.io.IOException {
            r1 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.attribute
            java.lang.String r0 = r0.getValue()
            return r0
    }

    public int hashCode() {
            r1 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.attribute
            int r0 = r0.hashCode()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public boolean isCompleted() {
            r1 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.attribute
            boolean r0 = r0.isCompleted()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public boolean isInMemory() {
            r1 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.attribute
            boolean r0 = r0.isInMemory()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public long length() {
            r2 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r2.attribute
            long r0 = r0.length()
            return r0
    }

    public int refCnt() {
            r1 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.attribute
            int r0 = r0.refCnt()
            return r0
    }

    public boolean release() {
            r1 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.attribute
            boolean r0 = r0.release()
            return r0
    }

    public boolean release(int r2) {
            r1 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.attribute
            boolean r2 = r0.release(r2)
            return r2
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public boolean renameTo(java.io.File r2) throws java.io.IOException {
            r1 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.attribute
            boolean r2 = r0.renameTo(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder replace(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            io.netty.handler.codec.http.multipart.Attribute r1 = r0.replace(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.multipart.Attribute, io.netty.handler.codec.http.multipart.HttpData, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.http.multipart.Attribute replace(io.netty.buffer.ByteBuf r2) {
            r1 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.attribute
            io.netty.handler.codec.http.multipart.Attribute r2 = r0.replace(r2)
            return r2
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.multipart.HttpData replace(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            io.netty.handler.codec.http.multipart.Attribute r1 = r0.replace(r1)
            return r1
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo39retain() {
            r1 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo40retain(int r1) {
            r0 = this;
            io.netty.handler.codec.http.multipart.Attribute r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.multipart.Attribute, io.netty.handler.codec.http.multipart.HttpData, io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.codec.http.multipart.Attribute mo39retain() {
            r1 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.attribute
            r0.mo39retain()
            return r1
    }

    @Override // io.netty.handler.codec.http.multipart.Attribute, io.netty.handler.codec.http.multipart.HttpData, io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.codec.http.multipart.Attribute mo40retain(int r2) {
            r1 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.attribute
            r0.mo40retain(r2)
            return r1
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData, io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.multipart.HttpData mo39retain() {
            r1 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData, io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.multipart.HttpData mo40retain(int r1) {
            r0 = this;
            io.netty.handler.codec.http.multipart.Attribute r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.multipart.InterfaceHttpData mo39retain() {
            r1 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.multipart.InterfaceHttpData mo40retain(int r1) {
            r0 = this;
            io.netty.handler.codec.http.multipart.Attribute r1 = r0.mo40retain(r1)
            return r1
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted retain() {
            r1 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.mo39retain()
            return r0
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted retain(int r1) {
            r0 = this;
            io.netty.handler.codec.http.multipart.Attribute r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder retainedDuplicate() {
            r1 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.retainedDuplicate()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.Attribute, io.netty.handler.codec.http.multipart.HttpData, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.http.multipart.Attribute retainedDuplicate() {
            r1 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.attribute
            io.netty.handler.codec.http.multipart.Attribute r0 = r0.retainedDuplicate()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.multipart.HttpData retainedDuplicate() {
            r1 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.retainedDuplicate()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public void setCharset(java.nio.charset.Charset r2) {
            r1 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.attribute
            r0.setCharset(r2)
            return
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public void setContent(io.netty.buffer.ByteBuf r6) throws java.io.IOException {
            r5 = this;
            int r0 = r6.readableBytes()
            long r0 = (long) r0
            r5.checkSize(r0)
            int r0 = r6.readableBytes()
            long r0 = (long) r0
            long r2 = r5.limitSize
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L31
            io.netty.handler.codec.http.multipart.Attribute r0 = r5.attribute
            boolean r0 = r0 instanceof io.netty.handler.codec.http.multipart.MemoryAttribute
            if (r0 == 0) goto L31
            io.netty.handler.codec.http.multipart.DiskAttribute r0 = new io.netty.handler.codec.http.multipart.DiskAttribute
            io.netty.handler.codec.http.multipart.Attribute r1 = r5.attribute
            java.lang.String r1 = r1.getName()
            io.netty.handler.codec.http.multipart.Attribute r2 = r5.attribute
            long r2 = r2.definedLength()
            r0.<init>(r1, r2)
            r5.attribute = r0
            long r1 = r5.maxSize
            r0.setMaxSize(r1)
        L31:
            io.netty.handler.codec.http.multipart.Attribute r0 = r5.attribute
            r0.setContent(r6)
            return
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public void setContent(java.io.File r6) throws java.io.IOException {
            r5 = this;
            long r0 = r6.length()
            r5.checkSize(r0)
            long r0 = r6.length()
            long r2 = r5.limitSize
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L2f
            io.netty.handler.codec.http.multipart.Attribute r0 = r5.attribute
            boolean r0 = r0 instanceof io.netty.handler.codec.http.multipart.MemoryAttribute
            if (r0 == 0) goto L2f
            io.netty.handler.codec.http.multipart.DiskAttribute r0 = new io.netty.handler.codec.http.multipart.DiskAttribute
            io.netty.handler.codec.http.multipart.Attribute r1 = r5.attribute
            java.lang.String r1 = r1.getName()
            io.netty.handler.codec.http.multipart.Attribute r2 = r5.attribute
            long r2 = r2.definedLength()
            r0.<init>(r1, r2)
            r5.attribute = r0
            long r1 = r5.maxSize
            r0.setMaxSize(r1)
        L2f:
            io.netty.handler.codec.http.multipart.Attribute r0 = r5.attribute
            r0.setContent(r6)
            return
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public void setContent(java.io.InputStream r5) throws java.io.IOException {
            r4 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r4.attribute
            boolean r0 = r0 instanceof io.netty.handler.codec.http.multipart.MemoryAttribute
            if (r0 == 0) goto L1e
            io.netty.handler.codec.http.multipart.DiskAttribute r0 = new io.netty.handler.codec.http.multipart.DiskAttribute
            io.netty.handler.codec.http.multipart.Attribute r1 = r4.attribute
            java.lang.String r1 = r1.getName()
            io.netty.handler.codec.http.multipart.Attribute r2 = r4.attribute
            long r2 = r2.definedLength()
            r0.<init>(r1, r2)
            r4.attribute = r0
            long r1 = r4.maxSize
            r0.setMaxSize(r1)
        L1e:
            io.netty.handler.codec.http.multipart.Attribute r0 = r4.attribute
            r0.setContent(r5)
            return
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public void setMaxSize(long r2) {
            r1 = this;
            r1.maxSize = r2
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.attribute
            r0.setMaxSize(r2)
            return
    }

    @Override // io.netty.handler.codec.http.multipart.Attribute
    public void setValue(java.lang.String r3) throws java.io.IOException {
            r2 = this;
            if (r3 == 0) goto Lb
            byte[] r0 = r3.getBytes()
            int r0 = r0.length
            long r0 = (long) r0
            r2.checkSize(r0)
        Lb:
            io.netty.handler.codec.http.multipart.Attribute r0 = r2.attribute
            r0.setValue(r3)
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Mixed: "
            r0.append(r1)
            io.netty.handler.codec.http.multipart.Attribute r1 = r2.attribute
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo41touch() {
            r1 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.http.multipart.Attribute r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.multipart.Attribute, io.netty.handler.codec.http.multipart.HttpData, io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.codec.http.multipart.Attribute mo41touch() {
            r1 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.attribute
            r0.mo41touch()
            return r1
    }

    @Override // io.netty.handler.codec.http.multipart.Attribute, io.netty.handler.codec.http.multipart.HttpData, io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.codec.http.multipart.Attribute mo42touch(java.lang.Object r2) {
            r1 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.attribute
            r0.mo42touch(r2)
            return r1
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData, io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.multipart.HttpData mo41touch() {
            r1 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData, io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.multipart.HttpData mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.http.multipart.Attribute r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.multipart.InterfaceHttpData mo41touch() {
            r1 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.multipart.InterfaceHttpData mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.http.multipart.Attribute r1 = r0.mo42touch(r1)
            return r1
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted touch() {
            r1 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.mo41touch()
            return r0
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.http.multipart.Attribute r1 = r0.mo42touch(r1)
            return r1
    }
}
