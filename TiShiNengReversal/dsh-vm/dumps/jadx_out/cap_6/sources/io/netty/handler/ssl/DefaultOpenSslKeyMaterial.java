package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class DefaultOpenSslKeyMaterial extends io.netty.util.AbstractReferenceCounted implements io.netty.handler.ssl.OpenSslKeyMaterial {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final io.netty.util.ResourceLeakDetector<io.netty.handler.ssl.DefaultOpenSslKeyMaterial> leakDetector = null;
    private long chain;
    private final io.netty.util.ResourceLeakTracker<io.netty.handler.ssl.DefaultOpenSslKeyMaterial> leak;
    private long privateKey;
    private final java.security.cert.X509Certificate[] x509CertificateChain;

    static {
            io.netty.util.ResourceLeakDetectorFactory r0 = io.netty.util.ResourceLeakDetectorFactory.instance()
            java.lang.Class<io.netty.handler.ssl.DefaultOpenSslKeyMaterial> r1 = io.netty.handler.ssl.DefaultOpenSslKeyMaterial.class
            io.netty.util.ResourceLeakDetector r0 = r0.newResourceLeakDetector(r1)
            io.netty.handler.ssl.DefaultOpenSslKeyMaterial.leakDetector = r0
            return
    }

    DefaultOpenSslKeyMaterial(long r1, long r3, java.security.cert.X509Certificate[] r5) {
            r0 = this;
            r0.<init>()
            r0.chain = r1
            r0.privateKey = r3
            r0.x509CertificateChain = r5
            io.netty.util.ResourceLeakDetector<io.netty.handler.ssl.DefaultOpenSslKeyMaterial> r1 = io.netty.handler.ssl.DefaultOpenSslKeyMaterial.leakDetector
            io.netty.util.ResourceLeakTracker r1 = r1.track(r0)
            r0.leak = r1
            return
    }

    @Override // io.netty.handler.ssl.OpenSslKeyMaterial
    public java.security.cert.X509Certificate[] certificateChain() {
            r1 = this;
            java.security.cert.X509Certificate[] r0 = r1.x509CertificateChain
            java.lang.Object r0 = r0.clone()
            java.security.cert.X509Certificate[] r0 = (java.security.cert.X509Certificate[]) r0
            return r0
    }

    @Override // io.netty.handler.ssl.OpenSslKeyMaterial
    public long certificateChainAddress() {
            r2 = this;
            int r0 = r2.refCnt()
            if (r0 <= 0) goto L9
            long r0 = r2.chain
            return r0
        L9:
            io.netty.util.IllegalReferenceCountException r0 = new io.netty.util.IllegalReferenceCountException
            r0.<init>()
            throw r0
    }

    protected void deallocate() {
            r4 = this;
            long r0 = r4.chain
            io.netty.internal.tcnative.SSL.freeX509Chain(r0)
            r0 = 0
            r4.chain = r0
            long r2 = r4.privateKey
            io.netty.internal.tcnative.SSL.freePrivateKey(r2)
            r4.privateKey = r0
            io.netty.util.ResourceLeakTracker<io.netty.handler.ssl.DefaultOpenSslKeyMaterial> r0 = r4.leak
            if (r0 == 0) goto L17
            r0.close(r4)
        L17:
            return
    }

    @Override // io.netty.handler.ssl.OpenSslKeyMaterial
    public long privateKeyAddress() {
            r2 = this;
            int r0 = r2.refCnt()
            if (r0 <= 0) goto L9
            long r0 = r2.privateKey
            return r0
        L9:
            io.netty.util.IllegalReferenceCountException r0 = new io.netty.util.IllegalReferenceCountException
            r0.<init>()
            throw r0
    }

    @Override // io.netty.handler.ssl.OpenSslKeyMaterial
    public boolean release() {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.handler.ssl.DefaultOpenSslKeyMaterial> r0 = r1.leak
            if (r0 == 0) goto L7
            r0.record()
        L7:
            boolean r0 = super.release()
            return r0
    }

    @Override // io.netty.handler.ssl.OpenSslKeyMaterial
    public boolean release(int r2) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.handler.ssl.DefaultOpenSslKeyMaterial> r0 = r1.leak
            if (r0 == 0) goto L7
            r0.record()
        L7:
            boolean r2 = super.release(r2)
            return r2
    }

    @Override // io.netty.handler.ssl.OpenSslKeyMaterial
    public io.netty.handler.ssl.DefaultOpenSslKeyMaterial retain() {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.handler.ssl.DefaultOpenSslKeyMaterial> r0 = r1.leak
            if (r0 == 0) goto L7
            r0.record()
        L7:
            super.retain()
            return r1
    }

    @Override // io.netty.handler.ssl.OpenSslKeyMaterial
    public io.netty.handler.ssl.DefaultOpenSslKeyMaterial retain(int r2) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.handler.ssl.DefaultOpenSslKeyMaterial> r0 = r1.leak
            if (r0 == 0) goto L7
            r0.record()
        L7:
            super.retain(r2)
            return r1
    }

    @Override // io.netty.handler.ssl.OpenSslKeyMaterial
    public /* bridge */ /* synthetic */ io.netty.handler.ssl.OpenSslKeyMaterial retain() {
            r1 = this;
            io.netty.handler.ssl.DefaultOpenSslKeyMaterial r0 = r1.retain()
            return r0
    }

    @Override // io.netty.handler.ssl.OpenSslKeyMaterial
    public /* bridge */ /* synthetic */ io.netty.handler.ssl.OpenSslKeyMaterial retain(int r1) {
            r0 = this;
            io.netty.handler.ssl.DefaultOpenSslKeyMaterial r1 = r0.retain(r1)
            return r1
    }

    /* renamed from: retain, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted m202retain() {
            r1 = this;
            io.netty.handler.ssl.DefaultOpenSslKeyMaterial r0 = r1.retain()
            return r0
    }

    /* renamed from: retain, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted m203retain(int r1) {
            r0 = this;
            io.netty.handler.ssl.DefaultOpenSslKeyMaterial r1 = r0.retain(r1)
            return r1
    }

    @Override // io.netty.handler.ssl.OpenSslKeyMaterial
    public io.netty.handler.ssl.DefaultOpenSslKeyMaterial touch() {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.handler.ssl.DefaultOpenSslKeyMaterial> r0 = r1.leak
            if (r0 == 0) goto L7
            r0.record()
        L7:
            super.touch()
            return r1
    }

    @Override // io.netty.handler.ssl.OpenSslKeyMaterial
    public io.netty.handler.ssl.DefaultOpenSslKeyMaterial touch(java.lang.Object r2) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.handler.ssl.DefaultOpenSslKeyMaterial> r0 = r1.leak
            if (r0 == 0) goto L7
            r0.record(r2)
        L7:
            return r1
    }

    @Override // io.netty.handler.ssl.OpenSslKeyMaterial
    public /* bridge */ /* synthetic */ io.netty.handler.ssl.OpenSslKeyMaterial touch() {
            r1 = this;
            io.netty.handler.ssl.DefaultOpenSslKeyMaterial r0 = r1.touch()
            return r0
    }

    @Override // io.netty.handler.ssl.OpenSslKeyMaterial
    public /* bridge */ /* synthetic */ io.netty.handler.ssl.OpenSslKeyMaterial touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.ssl.DefaultOpenSslKeyMaterial r1 = r0.touch(r1)
            return r1
    }

    /* renamed from: touch, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted m204touch() {
            r1 = this;
            io.netty.handler.ssl.DefaultOpenSslKeyMaterial r0 = r1.touch()
            return r0
    }

    /* renamed from: touch, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted m205touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.ssl.DefaultOpenSslKeyMaterial r1 = r0.touch(r1)
            return r1
    }
}
