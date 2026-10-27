package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class PemPrivateKey extends io.netty.util.AbstractReferenceCounted implements java.security.PrivateKey, io.netty.handler.ssl.PemEncoded {
    private static final byte[] BEGIN_PRIVATE_KEY = null;
    private static final byte[] END_PRIVATE_KEY = null;
    private static final java.lang.String PKCS8_FORMAT = "PKCS#8";
    private static final long serialVersionUID = 7978017465645018936L;
    private final io.netty.buffer.ByteBuf content;

    static {
            java.nio.charset.Charset r0 = io.netty.util.CharsetUtil.US_ASCII
            java.lang.String r1 = "-----BEGIN PRIVATE KEY-----\n"
            byte[] r1 = r1.getBytes(r0)
            io.netty.handler.ssl.PemPrivateKey.BEGIN_PRIVATE_KEY = r1
            java.lang.String r1 = "\n-----END PRIVATE KEY-----\n"
            byte[] r0 = r1.getBytes(r0)
            io.netty.handler.ssl.PemPrivateKey.END_PRIVATE_KEY = r0
            return
    }

    private PemPrivateKey(io.netty.buffer.ByteBuf r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "content"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.buffer.ByteBuf r2 = (io.netty.buffer.ByteBuf) r2
            r1.content = r2
            return
    }

    static io.netty.handler.ssl.PemEncoded toPEM(io.netty.buffer.ByteBufAllocator r1, boolean r2, java.security.PrivateKey r3) {
            boolean r0 = r3 instanceof io.netty.handler.ssl.PemEncoded
            if (r0 == 0) goto Lb
            io.netty.handler.ssl.PemEncoded r3 = (io.netty.handler.ssl.PemEncoded) r3
            io.netty.handler.ssl.PemEncoded r1 = r3.mo39retain()
            return r1
        Lb:
            byte[] r0 = r3.getEncoded()
            if (r0 == 0) goto L16
            io.netty.handler.ssl.PemEncoded r1 = toPEM(r1, r2, r0)
            return r1
        L16:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            r2.append(r3)
            java.lang.String r3 = " does not support encoding"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    static io.netty.handler.ssl.PemEncoded toPEM(io.netty.buffer.ByteBufAllocator r5, boolean r6, byte[] r7) {
            io.netty.buffer.ByteBuf r7 = io.netty.buffer.Unpooled.wrappedBuffer(r7)
            io.netty.buffer.ByteBuf r0 = io.netty.handler.ssl.SslUtils.toBase64(r5, r7)     // Catch: java.lang.Throwable -> L37
            byte[] r1 = io.netty.handler.ssl.PemPrivateKey.BEGIN_PRIVATE_KEY     // Catch: java.lang.Throwable -> L1b
            int r2 = r1.length     // Catch: java.lang.Throwable -> L1b
            int r3 = r0.readableBytes()     // Catch: java.lang.Throwable -> L1b
            int r2 = r2 + r3
            byte[] r3 = io.netty.handler.ssl.PemPrivateKey.END_PRIVATE_KEY     // Catch: java.lang.Throwable -> L1b
            int r4 = r3.length     // Catch: java.lang.Throwable -> L1b
            int r2 = r2 + r4
            if (r6 == 0) goto L1d
            io.netty.buffer.ByteBuf r5 = r5.directBuffer(r2)     // Catch: java.lang.Throwable -> L1b
            goto L21
        L1b:
            r5 = move-exception
            goto L3e
        L1d:
            io.netty.buffer.ByteBuf r5 = r5.buffer(r2)     // Catch: java.lang.Throwable -> L1b
        L21:
            r5.writeBytes(r1)     // Catch: java.lang.Throwable -> L39
            r5.writeBytes(r0)     // Catch: java.lang.Throwable -> L39
            r5.writeBytes(r3)     // Catch: java.lang.Throwable -> L39
            io.netty.handler.ssl.PemValue r6 = new io.netty.handler.ssl.PemValue     // Catch: java.lang.Throwable -> L39
            r1 = 1
            r6.<init>(r5, r1)     // Catch: java.lang.Throwable -> L39
            io.netty.handler.ssl.SslUtils.zerooutAndRelease(r0)     // Catch: java.lang.Throwable -> L37
            io.netty.handler.ssl.SslUtils.zerooutAndRelease(r7)
            return r6
        L37:
            r5 = move-exception
            goto L42
        L39:
            r6 = move-exception
            io.netty.handler.ssl.SslUtils.zerooutAndRelease(r5)     // Catch: java.lang.Throwable -> L1b
            throw r6     // Catch: java.lang.Throwable -> L1b
        L3e:
            io.netty.handler.ssl.SslUtils.zerooutAndRelease(r0)     // Catch: java.lang.Throwable -> L37
            throw r5     // Catch: java.lang.Throwable -> L37
        L42:
            io.netty.handler.ssl.SslUtils.zerooutAndRelease(r7)
            throw r5
    }

    public static io.netty.handler.ssl.PemPrivateKey valueOf(io.netty.buffer.ByteBuf r1) {
            io.netty.handler.ssl.PemPrivateKey r0 = new io.netty.handler.ssl.PemPrivateKey
            r0.<init>(r1)
            return r0
    }

    public static io.netty.handler.ssl.PemPrivateKey valueOf(byte[] r0) {
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.wrappedBuffer(r0)
            io.netty.handler.ssl.PemPrivateKey r0 = valueOf(r0)
            return r0
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
            io.netty.handler.ssl.PemPrivateKey r0 = r1.copy()
            return r0
    }

    @Override // io.netty.handler.ssl.PemEncoded, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.ssl.PemEncoded copy() {
            r1 = this;
            io.netty.handler.ssl.PemPrivateKey r0 = r1.copy()
            return r0
    }

    @Override // io.netty.handler.ssl.PemEncoded, io.netty.buffer.ByteBufHolder
    public io.netty.handler.ssl.PemPrivateKey copy() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content
            io.netty.buffer.ByteBuf r0 = r0.copy()
            io.netty.handler.ssl.PemPrivateKey r0 = r1.replace(r0)
            return r0
    }

    protected void deallocate() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content
            io.netty.handler.ssl.SslUtils.zerooutAndRelease(r0)
            return
    }

    @Override // javax.security.auth.Destroyable
    public void destroy() {
            r1 = this;
            int r0 = r1.refCnt()
            r1.release(r0)
            return
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder duplicate() {
            r1 = this;
            io.netty.handler.ssl.PemPrivateKey r0 = r1.duplicate()
            return r0
    }

    @Override // io.netty.handler.ssl.PemEncoded, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.ssl.PemEncoded duplicate() {
            r1 = this;
            io.netty.handler.ssl.PemPrivateKey r0 = r1.duplicate()
            return r0
    }

    @Override // io.netty.handler.ssl.PemEncoded, io.netty.buffer.ByteBufHolder
    public io.netty.handler.ssl.PemPrivateKey duplicate() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content
            io.netty.buffer.ByteBuf r0 = r0.duplicate()
            io.netty.handler.ssl.PemPrivateKey r0 = r1.replace(r0)
            return r0
    }

    @Override // java.security.Key
    public java.lang.String getAlgorithm() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.security.Key
    public java.lang.String getFormat() {
            r1 = this;
            java.lang.String r0 = "PKCS#8"
            return r0
    }

    @Override // javax.security.auth.Destroyable
    public boolean isDestroyed() {
            r1 = this;
            int r0 = r1.refCnt()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // io.netty.handler.ssl.PemEncoded
    public boolean isSensitive() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder replace(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            io.netty.handler.ssl.PemPrivateKey r1 = r0.replace(r1)
            return r1
    }

    @Override // io.netty.handler.ssl.PemEncoded, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.ssl.PemEncoded replace(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            io.netty.handler.ssl.PemPrivateKey r1 = r0.replace(r1)
            return r1
    }

    @Override // io.netty.handler.ssl.PemEncoded, io.netty.buffer.ByteBufHolder
    public io.netty.handler.ssl.PemPrivateKey replace(io.netty.buffer.ByteBuf r2) {
            r1 = this;
            io.netty.handler.ssl.PemPrivateKey r0 = new io.netty.handler.ssl.PemPrivateKey
            r0.<init>(r2)
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo39retain() {
            r1 = this;
            io.netty.handler.ssl.PemPrivateKey r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo40retain(int r1) {
            r0 = this;
            io.netty.handler.ssl.PemPrivateKey r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.handler.ssl.PemEncoded, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.ssl.PemEncoded mo39retain() {
            r1 = this;
            io.netty.handler.ssl.PemPrivateKey r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.handler.ssl.PemEncoded, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.ssl.PemEncoded mo40retain(int r1) {
            r0 = this;
            io.netty.handler.ssl.PemPrivateKey r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.handler.ssl.PemEncoded, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.ssl.PemPrivateKey mo39retain() {
            r1 = this;
            io.netty.util.ReferenceCounted r0 = super.retain()
            io.netty.handler.ssl.PemPrivateKey r0 = (io.netty.handler.ssl.PemPrivateKey) r0
            return r0
    }

    @Override // io.netty.handler.ssl.PemEncoded, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.ssl.PemPrivateKey mo40retain(int r1) {
            r0 = this;
            io.netty.util.ReferenceCounted r1 = super.retain(r1)
            io.netty.handler.ssl.PemPrivateKey r1 = (io.netty.handler.ssl.PemPrivateKey) r1
            return r1
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted retain() {
            r1 = this;
            io.netty.handler.ssl.PemPrivateKey r0 = r1.mo39retain()
            return r0
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted retain(int r1) {
            r0 = this;
            io.netty.handler.ssl.PemPrivateKey r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder retainedDuplicate() {
            r1 = this;
            io.netty.handler.ssl.PemPrivateKey r0 = r1.retainedDuplicate()
            return r0
    }

    @Override // io.netty.handler.ssl.PemEncoded, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.handler.ssl.PemEncoded retainedDuplicate() {
            r1 = this;
            io.netty.handler.ssl.PemPrivateKey r0 = r1.retainedDuplicate()
            return r0
    }

    @Override // io.netty.handler.ssl.PemEncoded, io.netty.buffer.ByteBufHolder
    public io.netty.handler.ssl.PemPrivateKey retainedDuplicate() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content
            io.netty.buffer.ByteBuf r0 = r0.retainedDuplicate()
            io.netty.handler.ssl.PemPrivateKey r0 = r1.replace(r0)
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo41touch() {
            r1 = this;
            io.netty.handler.ssl.PemPrivateKey r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.ssl.PemPrivateKey r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.handler.ssl.PemEncoded, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.ssl.PemEncoded mo41touch() {
            r1 = this;
            io.netty.handler.ssl.PemPrivateKey r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.handler.ssl.PemEncoded, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.ssl.PemEncoded mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.ssl.PemPrivateKey r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.handler.ssl.PemEncoded, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.ssl.PemPrivateKey mo41touch() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content
            r0.touch()
            return r1
    }

    @Override // io.netty.handler.ssl.PemEncoded, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.ssl.PemPrivateKey mo42touch(java.lang.Object r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content
            r0.touch(r2)
            return r1
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted touch() {
            r1 = this;
            io.netty.handler.ssl.PemPrivateKey r0 = r1.mo41touch()
            return r0
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.ssl.PemPrivateKey r1 = r0.mo42touch(r1)
            return r1
    }
}
