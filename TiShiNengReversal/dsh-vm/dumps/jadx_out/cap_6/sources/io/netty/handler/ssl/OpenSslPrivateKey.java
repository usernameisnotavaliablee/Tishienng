package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class OpenSslPrivateKey extends io.netty.util.AbstractReferenceCounted implements java.security.PrivateKey {
    private long privateKeyAddress;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class OpenSslPrivateKeyMaterial extends io.netty.util.AbstractReferenceCounted implements io.netty.handler.ssl.OpenSslKeyMaterial {
        long certificateChain;
        final /* synthetic */ io.netty.handler.ssl.OpenSslPrivateKey this$0;
        private final java.security.cert.X509Certificate[] x509CertificateChain;

        OpenSslPrivateKeyMaterial(io.netty.handler.ssl.OpenSslPrivateKey r1, long r2, java.security.cert.X509Certificate[] r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.certificateChain = r2
                if (r4 != 0) goto Lb
                java.security.cert.X509Certificate[] r4 = io.netty.util.internal.EmptyArrays.EMPTY_X509_CERTIFICATES
            Lb:
                r0.x509CertificateChain = r4
                r1.retain()
                return
        }

        private void releaseChain() {
                r2 = this;
                long r0 = r2.certificateChain
                io.netty.internal.tcnative.SSL.freeX509Chain(r0)
                r0 = 0
                r2.certificateChain = r0
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
                long r0 = r2.certificateChain
                return r0
            L9:
                io.netty.util.IllegalReferenceCountException r0 = new io.netty.util.IllegalReferenceCountException
                r0.<init>()
                throw r0
        }

        protected void deallocate() {
                r1 = this;
                r1.releaseChain()
                io.netty.handler.ssl.OpenSslPrivateKey r0 = r1.this$0
                r0.release()
                return
        }

        @Override // io.netty.handler.ssl.OpenSslKeyMaterial
        public long privateKeyAddress() {
                r2 = this;
                int r0 = r2.refCnt()
                if (r0 <= 0) goto Ld
                io.netty.handler.ssl.OpenSslPrivateKey r0 = r2.this$0
                long r0 = io.netty.handler.ssl.OpenSslPrivateKey.access$000(r0)
                return r0
            Ld:
                io.netty.util.IllegalReferenceCountException r0 = new io.netty.util.IllegalReferenceCountException
                r0.<init>()
                throw r0
        }

        @Override // io.netty.handler.ssl.OpenSslKeyMaterial
        public io.netty.handler.ssl.OpenSslKeyMaterial retain() {
                r0 = this;
                super.retain()
                return r0
        }

        @Override // io.netty.handler.ssl.OpenSslKeyMaterial
        public io.netty.handler.ssl.OpenSslKeyMaterial retain(int r1) {
                r0 = this;
                super.retain(r1)
                return r0
        }

        /* renamed from: retain, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted m210retain() {
                r1 = this;
                io.netty.handler.ssl.OpenSslKeyMaterial r0 = r1.retain()
                return r0
        }

        /* renamed from: retain, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted m211retain(int r1) {
                r0 = this;
                io.netty.handler.ssl.OpenSslKeyMaterial r1 = r0.retain(r1)
                return r1
        }

        @Override // io.netty.handler.ssl.OpenSslKeyMaterial
        public io.netty.handler.ssl.OpenSslKeyMaterial touch() {
                r1 = this;
                io.netty.handler.ssl.OpenSslPrivateKey r0 = r1.this$0
                r0.touch()
                return r1
        }

        @Override // io.netty.handler.ssl.OpenSslKeyMaterial
        public io.netty.handler.ssl.OpenSslKeyMaterial touch(java.lang.Object r2) {
                r1 = this;
                io.netty.handler.ssl.OpenSslPrivateKey r0 = r1.this$0
                r0.touch(r2)
                return r1
        }

        /* renamed from: touch, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted m212touch() {
                r1 = this;
                io.netty.handler.ssl.OpenSslKeyMaterial r0 = r1.touch()
                return r0
        }

        /* renamed from: touch, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted m213touch(java.lang.Object r1) {
                r0 = this;
                io.netty.handler.ssl.OpenSslKeyMaterial r1 = r0.touch(r1)
                return r1
        }
    }

    OpenSslPrivateKey(long r1) {
            r0 = this;
            r0.<init>()
            r0.privateKeyAddress = r1
            return
    }

    static /* synthetic */ long access$000(io.netty.handler.ssl.OpenSslPrivateKey r2) {
            long r0 = r2.privateKeyAddress()
            return r0
    }

    private long privateKeyAddress() {
            r2 = this;
            int r0 = r2.refCnt()
            if (r0 <= 0) goto L9
            long r0 = r2.privateKeyAddress
            return r0
        L9:
            io.netty.util.IllegalReferenceCountException r0 = new io.netty.util.IllegalReferenceCountException
            r0.<init>()
            throw r0
    }

    protected void deallocate() {
            r2 = this;
            long r0 = r2.privateKeyAddress
            io.netty.internal.tcnative.SSL.freePrivateKey(r0)
            r0 = 0
            r2.privateKeyAddress = r0
            return
    }

    @Override // javax.security.auth.Destroyable
    public void destroy() {
            r1 = this;
            int r0 = r1.refCnt()
            r1.release(r0)
            return
    }

    @Override // java.security.Key
    public java.lang.String getAlgorithm() {
            r1 = this;
            java.lang.String r0 = "unknown"
            return r0
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.security.Key
    public java.lang.String getFormat() {
            r1 = this;
            r0 = 0
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

    io.netty.handler.ssl.OpenSslKeyMaterial newKeyMaterial(long r2, java.security.cert.X509Certificate[] r4) {
            r1 = this;
            io.netty.handler.ssl.OpenSslPrivateKey$OpenSslPrivateKeyMaterial r0 = new io.netty.handler.ssl.OpenSslPrivateKey$OpenSslPrivateKeyMaterial
            r0.<init>(r1, r2, r4)
            return r0
    }

    public io.netty.handler.ssl.OpenSslPrivateKey retain() {
            r0 = this;
            super.retain()
            return r0
    }

    public io.netty.handler.ssl.OpenSslPrivateKey retain(int r1) {
            r0 = this;
            super.retain(r1)
            return r0
    }

    /* renamed from: retain, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted m206retain() {
            r1 = this;
            io.netty.handler.ssl.OpenSslPrivateKey r0 = r1.retain()
            return r0
    }

    /* renamed from: retain, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted m207retain(int r1) {
            r0 = this;
            io.netty.handler.ssl.OpenSslPrivateKey r1 = r0.retain(r1)
            return r1
    }

    public io.netty.handler.ssl.OpenSslPrivateKey touch() {
            r0 = this;
            super.touch()
            return r0
    }

    public io.netty.handler.ssl.OpenSslPrivateKey touch(java.lang.Object r1) {
            r0 = this;
            return r0
    }

    /* renamed from: touch, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted m208touch() {
            r1 = this;
            io.netty.handler.ssl.OpenSslPrivateKey r0 = r1.touch()
            return r0
    }

    /* renamed from: touch, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted m209touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.ssl.OpenSslPrivateKey r1 = r0.touch(r1)
            return r1
    }
}
