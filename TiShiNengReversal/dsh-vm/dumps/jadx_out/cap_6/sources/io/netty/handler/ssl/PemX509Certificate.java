package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class PemX509Certificate extends java.security.cert.X509Certificate implements io.netty.handler.ssl.PemEncoded {
    private static final byte[] BEGIN_CERT = null;
    private static final byte[] END_CERT = null;
    private final io.netty.buffer.ByteBuf content;

    static {
            java.nio.charset.Charset r0 = io.netty.util.CharsetUtil.US_ASCII
            java.lang.String r1 = "-----BEGIN CERTIFICATE-----\n"
            byte[] r1 = r1.getBytes(r0)
            io.netty.handler.ssl.PemX509Certificate.BEGIN_CERT = r1
            java.lang.String r1 = "\n-----END CERTIFICATE-----\n"
            byte[] r0 = r1.getBytes(r0)
            io.netty.handler.ssl.PemX509Certificate.END_CERT = r0
            return
    }

    private PemX509Certificate(io.netty.buffer.ByteBuf r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "content"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.buffer.ByteBuf r2 = (io.netty.buffer.ByteBuf) r2
            r1.content = r2
            return
    }

    private static io.netty.buffer.ByteBuf append(io.netty.buffer.ByteBufAllocator r0, boolean r1, io.netty.handler.ssl.PemEncoded r2, int r3, io.netty.buffer.ByteBuf r4) {
            io.netty.buffer.ByteBuf r2 = r2.content()
            if (r4 != 0) goto L10
            int r4 = r2.readableBytes()
            int r4 = r4 * r3
            io.netty.buffer.ByteBuf r4 = newBuffer(r0, r1, r4)
        L10:
            io.netty.buffer.ByteBuf r0 = r2.slice()
            r4.writeBytes(r0)
            return r4
    }

    private static io.netty.buffer.ByteBuf append(io.netty.buffer.ByteBufAllocator r2, boolean r3, java.security.cert.X509Certificate r4, int r5, io.netty.buffer.ByteBuf r6) throws java.security.cert.CertificateEncodingException {
            byte[] r4 = r4.getEncoded()
            io.netty.buffer.ByteBuf r4 = io.netty.buffer.Unpooled.wrappedBuffer(r4)
            io.netty.buffer.ByteBuf r0 = io.netty.handler.ssl.SslUtils.toBase64(r2, r4)     // Catch: java.lang.Throwable -> L37
            if (r6 != 0) goto L23
            byte[] r6 = io.netty.handler.ssl.PemX509Certificate.BEGIN_CERT     // Catch: java.lang.Throwable -> L21
            int r6 = r6.length     // Catch: java.lang.Throwable -> L21
            int r1 = r0.readableBytes()     // Catch: java.lang.Throwable -> L21
            int r6 = r6 + r1
            byte[] r1 = io.netty.handler.ssl.PemX509Certificate.END_CERT     // Catch: java.lang.Throwable -> L21
            int r1 = r1.length     // Catch: java.lang.Throwable -> L21
            int r6 = r6 + r1
            int r6 = r6 * r5
            io.netty.buffer.ByteBuf r6 = newBuffer(r2, r3, r6)     // Catch: java.lang.Throwable -> L21
            goto L23
        L21:
            r2 = move-exception
            goto L39
        L23:
            byte[] r2 = io.netty.handler.ssl.PemX509Certificate.BEGIN_CERT     // Catch: java.lang.Throwable -> L21
            r6.writeBytes(r2)     // Catch: java.lang.Throwable -> L21
            r6.writeBytes(r0)     // Catch: java.lang.Throwable -> L21
            byte[] r2 = io.netty.handler.ssl.PemX509Certificate.END_CERT     // Catch: java.lang.Throwable -> L21
            r6.writeBytes(r2)     // Catch: java.lang.Throwable -> L21
            r0.release()     // Catch: java.lang.Throwable -> L37
            r4.release()
            return r6
        L37:
            r2 = move-exception
            goto L3d
        L39:
            r0.release()     // Catch: java.lang.Throwable -> L37
            throw r2     // Catch: java.lang.Throwable -> L37
        L3d:
            r4.release()
            throw r2
    }

    private static io.netty.buffer.ByteBuf newBuffer(io.netty.buffer.ByteBufAllocator r0, boolean r1, int r2) {
            if (r1 == 0) goto L7
            io.netty.buffer.ByteBuf r0 = r0.directBuffer(r2)
            return r0
        L7:
            io.netty.buffer.ByteBuf r0 = r0.buffer(r2)
            return r0
    }

    static io.netty.handler.ssl.PemEncoded toPEM(io.netty.buffer.ByteBufAllocator r6, boolean r7, java.security.cert.X509Certificate... r8) throws java.security.cert.CertificateEncodingException {
            if (r8 == 0) goto L5d
            int r0 = r8.length
            if (r0 == 0) goto L5d
            int r0 = r8.length
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L17
            r0 = r8[r2]
            boolean r1 = r0 instanceof io.netty.handler.ssl.PemEncoded
            if (r1 == 0) goto L17
            io.netty.handler.ssl.PemEncoded r0 = (io.netty.handler.ssl.PemEncoded) r0
            io.netty.handler.ssl.PemEncoded r6 = r0.mo39retain()
            return r6
        L17:
            r0 = 0
            int r1 = r8.length     // Catch: java.lang.Throwable -> L2c
            r3 = 0
        L1a:
            if (r3 >= r1) goto L51
            r4 = r8[r3]     // Catch: java.lang.Throwable -> L2c
            if (r4 == 0) goto L36
            boolean r5 = r4 instanceof io.netty.handler.ssl.PemEncoded     // Catch: java.lang.Throwable -> L2c
            if (r5 == 0) goto L2e
            io.netty.handler.ssl.PemEncoded r4 = (io.netty.handler.ssl.PemEncoded) r4     // Catch: java.lang.Throwable -> L2c
            int r5 = r8.length     // Catch: java.lang.Throwable -> L2c
            io.netty.buffer.ByteBuf r0 = append(r6, r7, r4, r5, r0)     // Catch: java.lang.Throwable -> L2c
            goto L33
        L2c:
            r6 = move-exception
            goto L57
        L2e:
            int r5 = r8.length     // Catch: java.lang.Throwable -> L2c
            io.netty.buffer.ByteBuf r0 = append(r6, r7, r4, r5, r0)     // Catch: java.lang.Throwable -> L2c
        L33:
            int r3 = r3 + 1
            goto L1a
        L36:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L2c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2c
            r7.<init>()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = "Null element in chain: "
            r7.append(r1)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r8 = java.util.Arrays.toString(r8)     // Catch: java.lang.Throwable -> L2c
            r7.append(r8)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L2c
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L2c
            throw r6     // Catch: java.lang.Throwable -> L2c
        L51:
            io.netty.handler.ssl.PemValue r6 = new io.netty.handler.ssl.PemValue     // Catch: java.lang.Throwable -> L2c
            r6.<init>(r0, r2)     // Catch: java.lang.Throwable -> L2c
            return r6
        L57:
            if (r0 == 0) goto L5c
            r0.release()
        L5c:
            throw r6
        L5d:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "X.509 certificate chain can't be null or empty"
            r6.<init>(r7)
            throw r6
    }

    public static io.netty.handler.ssl.PemX509Certificate valueOf(io.netty.buffer.ByteBuf r1) {
            io.netty.handler.ssl.PemX509Certificate r0 = new io.netty.handler.ssl.PemX509Certificate
            r0.<init>(r1)
            return r0
    }

    public static io.netty.handler.ssl.PemX509Certificate valueOf(byte[] r0) {
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.wrappedBuffer(r0)
            io.netty.handler.ssl.PemX509Certificate r0 = valueOf(r0)
            return r0
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity(java.util.Date r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBufHolder
    public io.netty.buffer.ByteBuf content() {
            r2 = this;
            int r0 = r2.refCnt()
            if (r0 <= 0) goto L9
            io.netty.buffer.ByteBuf r0 = r2.content
            return r0
        L9:
            io.netty.util.IllegalReferenceCountException r1 = new io.netty.util.IllegalReferenceCountException
            r1.<init>(r0)
            throw r1
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder copy() {
            r1 = this;
            io.netty.handler.ssl.PemX509Certificate r0 = r1.copy()
            return r0
    }

    @Override // io.netty.handler.ssl.PemEncoded, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.ssl.PemEncoded copy() {
            r1 = this;
            io.netty.handler.ssl.PemX509Certificate r0 = r1.copy()
            return r0
    }

    @Override // io.netty.handler.ssl.PemEncoded, io.netty.buffer.ByteBufHolder
    public io.netty.handler.ssl.PemX509Certificate copy() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content
            io.netty.buffer.ByteBuf r0 = r0.copy()
            io.netty.handler.ssl.PemX509Certificate r0 = r1.replace(r0)
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder duplicate() {
            r1 = this;
            io.netty.handler.ssl.PemX509Certificate r0 = r1.duplicate()
            return r0
    }

    @Override // io.netty.handler.ssl.PemEncoded, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.ssl.PemEncoded duplicate() {
            r1 = this;
            io.netty.handler.ssl.PemX509Certificate r0 = r1.duplicate()
            return r0
    }

    @Override // io.netty.handler.ssl.PemEncoded, io.netty.buffer.ByteBufHolder
    public io.netty.handler.ssl.PemX509Certificate duplicate() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content
            io.netty.buffer.ByteBuf r0 = r0.duplicate()
            io.netty.handler.ssl.PemX509Certificate r0 = r1.replace(r0)
            return r0
    }

    @Override // java.security.cert.Certificate
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof io.netty.handler.ssl.PemX509Certificate
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            io.netty.handler.ssl.PemX509Certificate r2 = (io.netty.handler.ssl.PemX509Certificate) r2
            io.netty.buffer.ByteBuf r0 = r1.content
            io.netty.buffer.ByteBuf r2 = r2.content
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // java.security.cert.X509Certificate
    public int getBasicConstraints() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.security.cert.X509Extension
    public java.util.Set<java.lang.String> getCriticalExtensionOIDs() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.security.cert.Certificate
    public byte[] getEncoded() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(java.lang.String r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.security.cert.X509Certificate
    public java.security.Principal getIssuerDN() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getIssuerUniqueID() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getKeyUsage() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.security.cert.X509Extension
    public java.util.Set<java.lang.String> getNonCriticalExtensionOIDs() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.security.cert.X509Certificate
    public java.util.Date getNotAfter() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.security.cert.X509Certificate
    public java.util.Date getNotBefore() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.security.cert.Certificate
    public java.security.PublicKey getPublicKey() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.security.cert.X509Certificate
    public java.math.BigInteger getSerialNumber() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.security.cert.X509Certificate
    public java.lang.String getSigAlgName() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.security.cert.X509Certificate
    public java.lang.String getSigAlgOID() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSigAlgParams() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSignature() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.security.cert.X509Certificate
    public java.security.Principal getSubjectDN() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getSubjectUniqueID() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getTBSCertificate() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.security.cert.X509Certificate
    public int getVersion() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.security.cert.Certificate
    public int hashCode() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content
            int r0 = r0.hashCode()
            return r0
    }

    @Override // io.netty.handler.ssl.PemEncoded
    public boolean isSensitive() {
            r1 = this;
            r0 = 0
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
            io.netty.handler.ssl.PemX509Certificate r1 = r0.replace(r1)
            return r1
    }

    @Override // io.netty.handler.ssl.PemEncoded, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.ssl.PemEncoded replace(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            io.netty.handler.ssl.PemX509Certificate r1 = r0.replace(r1)
            return r1
    }

    @Override // io.netty.handler.ssl.PemEncoded, io.netty.buffer.ByteBufHolder
    public io.netty.handler.ssl.PemX509Certificate replace(io.netty.buffer.ByteBuf r2) {
            r1 = this;
            io.netty.handler.ssl.PemX509Certificate r0 = new io.netty.handler.ssl.PemX509Certificate
            r0.<init>(r2)
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo39retain() {
            r1 = this;
            io.netty.handler.ssl.PemX509Certificate r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo40retain(int r1) {
            r0 = this;
            io.netty.handler.ssl.PemX509Certificate r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.handler.ssl.PemEncoded, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.ssl.PemEncoded mo39retain() {
            r1 = this;
            io.netty.handler.ssl.PemX509Certificate r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.handler.ssl.PemEncoded, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.ssl.PemEncoded mo40retain(int r1) {
            r0 = this;
            io.netty.handler.ssl.PemX509Certificate r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.handler.ssl.PemEncoded, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.ssl.PemX509Certificate mo39retain() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content
            r0.retain()
            return r1
    }

    @Override // io.netty.handler.ssl.PemEncoded, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.ssl.PemX509Certificate mo40retain(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content
            r0.retain(r2)
            return r1
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted retain() {
            r1 = this;
            io.netty.handler.ssl.PemX509Certificate r0 = r1.mo39retain()
            return r0
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted retain(int r1) {
            r0 = this;
            io.netty.handler.ssl.PemX509Certificate r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder retainedDuplicate() {
            r1 = this;
            io.netty.handler.ssl.PemX509Certificate r0 = r1.retainedDuplicate()
            return r0
    }

    @Override // io.netty.handler.ssl.PemEncoded, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.ssl.PemEncoded retainedDuplicate() {
            r1 = this;
            io.netty.handler.ssl.PemX509Certificate r0 = r1.retainedDuplicate()
            return r0
    }

    @Override // io.netty.handler.ssl.PemEncoded, io.netty.buffer.ByteBufHolder
    public io.netty.handler.ssl.PemX509Certificate retainedDuplicate() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content
            io.netty.buffer.ByteBuf r0 = r0.retainedDuplicate()
            io.netty.handler.ssl.PemX509Certificate r0 = r1.replace(r0)
            return r0
    }

    @Override // java.security.cert.Certificate
    public java.lang.String toString() {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r2.content
            java.nio.charset.Charset r1 = io.netty.util.CharsetUtil.UTF_8
            java.lang.String r0 = r0.toString(r1)
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo41touch() {
            r1 = this;
            io.netty.handler.ssl.PemX509Certificate r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.ssl.PemX509Certificate r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.handler.ssl.PemEncoded, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.ssl.PemEncoded mo41touch() {
            r1 = this;
            io.netty.handler.ssl.PemX509Certificate r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.handler.ssl.PemEncoded, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.ssl.PemEncoded mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.ssl.PemX509Certificate r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.handler.ssl.PemEncoded, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.ssl.PemX509Certificate mo41touch() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content
            r0.touch()
            return r1
    }

    @Override // io.netty.handler.ssl.PemEncoded, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.ssl.PemX509Certificate mo42touch(java.lang.Object r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content
            r0.touch(r2)
            return r1
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted touch() {
            r1 = this;
            io.netty.handler.ssl.PemX509Certificate r0 = r1.mo41touch()
            return r0
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.ssl.PemX509Certificate r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // java.security.cert.Certificate
    public void verify(java.security.PublicKey r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.security.cert.Certificate
    public void verify(java.security.PublicKey r1, java.lang.String r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }
}
