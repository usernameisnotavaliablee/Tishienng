package io.netty.handler.codec.http.multipart;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DiskAttribute extends io.netty.handler.codec.http.multipart.AbstractDiskHttpData implements io.netty.handler.codec.http.multipart.Attribute {
    public static java.lang.String baseDirectory = null;
    public static boolean deleteOnExitTemporaryFile = true;
    public static final java.lang.String postfix = ".att";
    public static final java.lang.String prefix = "Attr_";

    static {
            return
    }

    public DiskAttribute(java.lang.String r2) {
            r1 = this;
            java.nio.charset.Charset r0 = io.netty.handler.codec.http.HttpConstants.DEFAULT_CHARSET
            r1.<init>(r2, r0)
            return
    }

    public DiskAttribute(java.lang.String r2, long r3) {
            r1 = this;
            java.nio.charset.Charset r0 = io.netty.handler.codec.http.HttpConstants.DEFAULT_CHARSET
            r1.<init>(r2, r3, r0)
            return
    }

    public DiskAttribute(java.lang.String r1, long r2, java.nio.charset.Charset r4) {
            r0 = this;
            r0.<init>(r1, r4, r2)
            return
    }

    public DiskAttribute(java.lang.String r2, java.lang.String r3) throws java.io.IOException {
            r1 = this;
            java.nio.charset.Charset r0 = io.netty.handler.codec.http.HttpConstants.DEFAULT_CHARSET
            r1.<init>(r2, r3, r0)
            return
    }

    public DiskAttribute(java.lang.String r3, java.lang.String r4, java.nio.charset.Charset r5) throws java.io.IOException {
            r2 = this;
            r0 = 0
            r2.<init>(r3, r5, r0)
            r2.setValue(r4)
            return
    }

    public DiskAttribute(java.lang.String r3, java.nio.charset.Charset r4) {
            r2 = this;
            r0 = 0
            r2.<init>(r3, r4, r0)
            return
    }

    @Override // io.netty.handler.codec.http.multipart.AbstractDiskHttpData, io.netty.handler.codec.http.multipart.HttpData
    public void addContent(io.netty.buffer.ByteBuf r8, boolean r9) throws java.io.IOException {
            r7 = this;
            long r0 = r7.size
            int r2 = r8.readableBytes()
            long r2 = (long) r2
            long r0 = r0 + r2
            r7.checkSize(r0)
            long r2 = r7.definedSize
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L19
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L19
            r7.definedSize = r0
        L19:
            super.addContent(r8, r9)
            return
    }

    public int compareTo(io.netty.handler.codec.http.multipart.Attribute r2) {
            r1 = this;
            java.lang.String r0 = r1.getName()
            java.lang.String r2 = r2.getName()
            int r2 = r0.compareToIgnoreCase(r2)
            return r2
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(io.netty.handler.codec.http.multipart.InterfaceHttpData r4) {
            r3 = this;
            boolean r0 = r4 instanceof io.netty.handler.codec.http.multipart.Attribute
            if (r0 == 0) goto Lb
            io.netty.handler.codec.http.multipart.Attribute r4 = (io.netty.handler.codec.http.multipart.Attribute) r4
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
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.copy()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.http.multipart.Attribute copy() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content()
            if (r0 == 0) goto Lb
            io.netty.buffer.ByteBuf r0 = r0.copy()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.replace(r0)
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.multipart.HttpData copy() {
            r1 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.copy()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.AbstractDiskHttpData
    protected boolean deleteOnExit() {
            r1 = this;
            boolean r0 = io.netty.handler.codec.http.multipart.DiskAttribute.deleteOnExitTemporaryFile
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder duplicate() {
            r1 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.duplicate()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.http.multipart.Attribute duplicate() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content()
            if (r0 == 0) goto Lb
            io.netty.buffer.ByteBuf r0 = r0.duplicate()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.replace(r0)
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
            boolean r0 = r2 instanceof io.netty.handler.codec.http.multipart.Attribute
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            io.netty.handler.codec.http.multipart.Attribute r2 = (io.netty.handler.codec.http.multipart.Attribute) r2
            java.lang.String r0 = r1.getName()
            java.lang.String r2 = r2.getName()
            boolean r2 = r0.equalsIgnoreCase(r2)
            return r2
    }

    @Override // io.netty.handler.codec.http.multipart.AbstractDiskHttpData
    protected java.lang.String getBaseDirectory() {
            r1 = this;
            java.lang.String r0 = io.netty.handler.codec.http.multipart.DiskAttribute.baseDirectory
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.AbstractDiskHttpData
    protected java.lang.String getDiskFilename() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.getName()
            r0.append(r1)
            java.lang.String r1 = ".att"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.InterfaceHttpData
    public io.netty.handler.codec.http.multipart.InterfaceHttpData.HttpDataType getHttpDataType() {
            r1 = this;
            io.netty.handler.codec.http.multipart.InterfaceHttpData$HttpDataType r0 = io.netty.handler.codec.http.multipart.InterfaceHttpData.HttpDataType.Attribute
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.AbstractDiskHttpData
    protected java.lang.String getPostfix() {
            r1 = this;
            java.lang.String r0 = ".att"
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.AbstractDiskHttpData
    protected java.lang.String getPrefix() {
            r1 = this;
            java.lang.String r0 = "Attr_"
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.Attribute
    public java.lang.String getValue() throws java.io.IOException {
            r3 = this;
            byte[] r0 = r3.get()
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r2 = r3.getCharset()
            r1.<init>(r0, r2)
            return r1
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.getName()
            int r0 = r0.hashCode()
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder replace(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            io.netty.handler.codec.http.multipart.Attribute r1 = r0.replace(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.http.multipart.Attribute replace(io.netty.buffer.ByteBuf r3) {
            r2 = this;
            io.netty.handler.codec.http.multipart.DiskAttribute r0 = new io.netty.handler.codec.http.multipart.DiskAttribute
            java.lang.String r1 = r2.getName()
            r0.<init>(r1)
            java.nio.charset.Charset r1 = r2.getCharset()
            r0.setCharset(r1)
            if (r3 == 0) goto L1d
            r0.setContent(r3)     // Catch: java.io.IOException -> L16
            return r0
        L16:
            r3 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r3)
            throw r0
        L1d:
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.multipart.HttpData replace(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            io.netty.handler.codec.http.multipart.Attribute r1 = r0.replace(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.multipart.AbstractHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo39retain() {
            r1 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.AbstractHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo40retain(int r1) {
            r0 = this;
            io.netty.handler.codec.http.multipart.Attribute r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.multipart.AbstractHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.codec.http.multipart.Attribute mo39retain() {
            r0 = this;
            super.mo39retain()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.AbstractHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.codec.http.multipart.Attribute mo40retain(int r1) {
            r0 = this;
            super.mo40retain(r1)
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.AbstractHttpData, io.netty.handler.codec.http.multipart.HttpData, io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.multipart.HttpData mo39retain() {
            r1 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.AbstractHttpData, io.netty.handler.codec.http.multipart.HttpData, io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.multipart.HttpData mo40retain(int r1) {
            r0 = this;
            io.netty.handler.codec.http.multipart.Attribute r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.multipart.AbstractHttpData, io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.multipart.InterfaceHttpData mo39retain() {
            r1 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.AbstractHttpData, io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.multipart.InterfaceHttpData mo40retain(int r1) {
            r0 = this;
            io.netty.handler.codec.http.multipart.Attribute r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.multipart.AbstractHttpData
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted retain() {
            r1 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.AbstractHttpData
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

    @Override // io.netty.handler.codec.http.multipart.HttpData, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.http.multipart.Attribute retainedDuplicate() {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r2.content()
            if (r0 == 0) goto L14
            io.netty.buffer.ByteBuf r0 = r0.retainedDuplicate()
            io.netty.handler.codec.http.multipart.Attribute r0 = r2.replace(r0)     // Catch: java.lang.Throwable -> Lf
            return r0
        Lf:
            r1 = move-exception
            r0.release()
            throw r1
        L14:
            r0 = 0
            io.netty.handler.codec.http.multipart.Attribute r0 = r2.replace(r0)
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.multipart.HttpData retainedDuplicate() {
            r1 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.retainedDuplicate()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.Attribute
    public void setValue(java.lang.String r6) throws java.io.IOException {
            r5 = this;
            if (r6 == 0) goto L26
            java.nio.charset.Charset r0 = r5.getCharset()
            byte[] r6 = r6.getBytes(r0)
            int r0 = r6.length
            long r0 = (long) r0
            r5.checkSize(r0)
            io.netty.buffer.ByteBuf r6 = io.netty.buffer.Unpooled.wrappedBuffer(r6)
            long r0 = r5.definedSize
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L22
            int r0 = r6.readableBytes()
            long r0 = (long) r0
            r5.definedSize = r0
        L22:
            r5.setContent(r6)
            return
        L26:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r0 = "value"
            r6.<init>(r0)
            throw r6
    }

    public java.lang.String toString() {
            r4 = this;
            r0 = 61
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L1d
            r1.<init>()     // Catch: java.io.IOException -> L1d
            java.lang.String r2 = r4.getName()     // Catch: java.io.IOException -> L1d
            r1.append(r2)     // Catch: java.io.IOException -> L1d
            r1.append(r0)     // Catch: java.io.IOException -> L1d
            java.lang.String r2 = r4.getValue()     // Catch: java.io.IOException -> L1d
            r1.append(r2)     // Catch: java.io.IOException -> L1d
            java.lang.String r0 = r1.toString()     // Catch: java.io.IOException -> L1d
            return r0
        L1d:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r4.getName()
            r2.append(r3)
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.AbstractDiskHttpData, io.netty.handler.codec.http.multipart.AbstractHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo41touch() {
            r1 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.AbstractDiskHttpData, io.netty.handler.codec.http.multipart.AbstractHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.http.multipart.Attribute r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.multipart.AbstractDiskHttpData, io.netty.handler.codec.http.multipart.AbstractHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.codec.http.multipart.Attribute mo41touch() {
            r0 = this;
            super.mo41touch()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.AbstractDiskHttpData, io.netty.handler.codec.http.multipart.AbstractHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.codec.http.multipart.Attribute mo42touch(java.lang.Object r1) {
            r0 = this;
            super.mo42touch(r1)
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.AbstractDiskHttpData, io.netty.handler.codec.http.multipart.AbstractHttpData, io.netty.handler.codec.http.multipart.HttpData, io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.multipart.HttpData mo41touch() {
            r1 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.AbstractDiskHttpData, io.netty.handler.codec.http.multipart.AbstractHttpData, io.netty.handler.codec.http.multipart.HttpData, io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.multipart.HttpData mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.http.multipart.Attribute r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.multipart.AbstractDiskHttpData, io.netty.handler.codec.http.multipart.AbstractHttpData, io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.multipart.InterfaceHttpData mo41touch() {
            r1 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.AbstractDiskHttpData, io.netty.handler.codec.http.multipart.AbstractHttpData, io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.multipart.InterfaceHttpData mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.http.multipart.Attribute r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.multipart.AbstractDiskHttpData, io.netty.handler.codec.http.multipart.AbstractHttpData
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted touch() {
            r1 = this;
            io.netty.handler.codec.http.multipart.Attribute r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.AbstractDiskHttpData, io.netty.handler.codec.http.multipart.AbstractHttpData
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.http.multipart.Attribute r1 = r0.mo42touch(r1)
            return r1
    }
}
