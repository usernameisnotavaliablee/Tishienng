package okio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class HashingSource extends okio.ForwardingSource implements okio.Source {

    @org.jetbrains.annotations.NotNull
    public static final okio.HashingSource.Companion Companion = null;

    @org.jetbrains.annotations.Nullable
    private final javax.crypto.Mac mac;

    @org.jetbrains.annotations.Nullable
    private final java.security.MessageDigest messageDigest;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okio.HashingSource hmacSha1(@org.jetbrains.annotations.NotNull okio.Source r3, @org.jetbrains.annotations.NotNull okio.ByteString r4) {
                r2 = this;
                java.lang.String r0 = "source"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = "key"
                kotlin.jvm.internal.g0.p(r4, r0)
                okio.HashingSource r0 = new okio.HashingSource
                java.lang.String r1 = "HmacSHA1"
                r0.<init>(r3, r4, r1)
                return r0
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okio.HashingSource hmacSha256(@org.jetbrains.annotations.NotNull okio.Source r3, @org.jetbrains.annotations.NotNull okio.ByteString r4) {
                r2 = this;
                java.lang.String r0 = "source"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = "key"
                kotlin.jvm.internal.g0.p(r4, r0)
                okio.HashingSource r0 = new okio.HashingSource
                java.lang.String r1 = "HmacSHA256"
                r0.<init>(r3, r4, r1)
                return r0
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okio.HashingSource hmacSha512(@org.jetbrains.annotations.NotNull okio.Source r3, @org.jetbrains.annotations.NotNull okio.ByteString r4) {
                r2 = this;
                java.lang.String r0 = "source"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = "key"
                kotlin.jvm.internal.g0.p(r4, r0)
                okio.HashingSource r0 = new okio.HashingSource
                java.lang.String r1 = "HmacSHA512"
                r0.<init>(r3, r4, r1)
                return r0
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okio.HashingSource md5(@org.jetbrains.annotations.NotNull okio.Source r3) {
                r2 = this;
                java.lang.String r0 = "source"
                kotlin.jvm.internal.g0.p(r3, r0)
                okio.HashingSource r0 = new okio.HashingSource
                java.lang.String r1 = "MD5"
                r0.<init>(r3, r1)
                return r0
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okio.HashingSource sha1(@org.jetbrains.annotations.NotNull okio.Source r3) {
                r2 = this;
                java.lang.String r0 = "source"
                kotlin.jvm.internal.g0.p(r3, r0)
                okio.HashingSource r0 = new okio.HashingSource
                java.lang.String r1 = "SHA-1"
                r0.<init>(r3, r1)
                return r0
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okio.HashingSource sha256(@org.jetbrains.annotations.NotNull okio.Source r3) {
                r2 = this;
                java.lang.String r0 = "source"
                kotlin.jvm.internal.g0.p(r3, r0)
                okio.HashingSource r0 = new okio.HashingSource
                java.lang.String r1 = "SHA-256"
                r0.<init>(r3, r1)
                return r0
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okio.HashingSource sha512(@org.jetbrains.annotations.NotNull okio.Source r3) {
                r2 = this;
                java.lang.String r0 = "source"
                kotlin.jvm.internal.g0.p(r3, r0)
                okio.HashingSource r0 = new okio.HashingSource
                java.lang.String r1 = "SHA-512"
                r0.<init>(r3, r1)
                return r0
        }
    }

    static {
            okio.HashingSource$Companion r0 = new okio.HashingSource$Companion
            r1 = 0
            r0.<init>(r1)
            okio.HashingSource.Companion = r0
            return
    }

    public HashingSource(@org.jetbrains.annotations.NotNull okio.Source r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "algorithm"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r3)
            java.lang.String r0 = "getInstance(...)"
            kotlin.jvm.internal.g0.o(r3, r0)
            r1.<init>(r2, r3)
            return
    }

    public HashingSource(@org.jetbrains.annotations.NotNull okio.Source r2, @org.jetbrains.annotations.NotNull java.security.MessageDigest r3) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "digest"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>(r2)
            r1.messageDigest = r3
            r2 = 0
            r1.mac = r2
            return
    }

    public HashingSource(@org.jetbrains.annotations.NotNull okio.Source r2, @org.jetbrains.annotations.NotNull javax.crypto.Mac r3) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "mac"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>(r2)
            r1.mac = r3
            r2 = 0
            r1.messageDigest = r2
            return
    }

    public HashingSource(@org.jetbrains.annotations.NotNull okio.Source r3, @org.jetbrains.annotations.NotNull okio.ByteString r4, @org.jetbrains.annotations.NotNull java.lang.String r5) {
            r2 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "algorithm"
            kotlin.jvm.internal.g0.p(r5, r0)
            javax.crypto.Mac r0 = javax.crypto.Mac.getInstance(r5)     // Catch: java.security.InvalidKeyException -> L28
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec     // Catch: java.security.InvalidKeyException -> L28
            byte[] r4 = r4.toByteArray()     // Catch: java.security.InvalidKeyException -> L28
            r1.<init>(r4, r5)     // Catch: java.security.InvalidKeyException -> L28
            r0.init(r1)     // Catch: java.security.InvalidKeyException -> L28
            kotlin.n1 r4 = kotlin.n1.a     // Catch: java.security.InvalidKeyException -> L28
            kotlin.jvm.internal.g0.m(r0)
            r2.<init>(r3, r0)
            return
        L28:
            r3 = move-exception
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>(r3)
            throw r4
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okio.HashingSource hmacSha1(@org.jetbrains.annotations.NotNull okio.Source r1, @org.jetbrains.annotations.NotNull okio.ByteString r2) {
            okio.HashingSource$Companion r0 = okio.HashingSource.Companion
            okio.HashingSource r1 = r0.hmacSha1(r1, r2)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okio.HashingSource hmacSha256(@org.jetbrains.annotations.NotNull okio.Source r1, @org.jetbrains.annotations.NotNull okio.ByteString r2) {
            okio.HashingSource$Companion r0 = okio.HashingSource.Companion
            okio.HashingSource r1 = r0.hmacSha256(r1, r2)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okio.HashingSource hmacSha512(@org.jetbrains.annotations.NotNull okio.Source r1, @org.jetbrains.annotations.NotNull okio.ByteString r2) {
            okio.HashingSource$Companion r0 = okio.HashingSource.Companion
            okio.HashingSource r1 = r0.hmacSha512(r1, r2)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okio.HashingSource md5(@org.jetbrains.annotations.NotNull okio.Source r1) {
            okio.HashingSource$Companion r0 = okio.HashingSource.Companion
            okio.HashingSource r1 = r0.md5(r1)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okio.HashingSource sha1(@org.jetbrains.annotations.NotNull okio.Source r1) {
            okio.HashingSource$Companion r0 = okio.HashingSource.Companion
            okio.HashingSource r1 = r0.sha1(r1)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okio.HashingSource sha256(@org.jetbrains.annotations.NotNull okio.Source r1) {
            okio.HashingSource$Companion r0 = okio.HashingSource.Companion
            okio.HashingSource r1 = r0.sha256(r1)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okio.HashingSource sha512(@org.jetbrains.annotations.NotNull okio.Source r1) {
            okio.HashingSource$Companion r0 = okio.HashingSource.Companion
            okio.HashingSource r1 = r0.sha512(r1)
            return r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "hash", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_hash")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_hash, reason: not valid java name */
    public final okio.ByteString m62deprecated_hash() {
            r1 = this;
            okio.ByteString r0 = r1.hash()
            return r0
    }

    @kotlin.jvm.JvmName(name = "hash")
    @org.jetbrains.annotations.NotNull
    public final okio.ByteString hash() {
            r2 = this;
            java.security.MessageDigest r0 = r2.messageDigest
            if (r0 == 0) goto L9
            byte[] r0 = r0.digest()
            goto L12
        L9:
            javax.crypto.Mac r0 = r2.mac
            kotlin.jvm.internal.g0.m(r0)
            byte[] r0 = r0.doFinal()
        L12:
            okio.ByteString r1 = new okio.ByteString
            kotlin.jvm.internal.g0.m(r0)
            r1.<init>(r0)
            return r1
    }

    @Override // okio.ForwardingSource, okio.Source
    public long read(@org.jetbrains.annotations.NotNull okio.Buffer r9, long r10) throws java.io.IOException {
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.g0.p(r9, r0)
            long r10 = super.read(r9, r10)
            r0 = -1
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 == 0) goto L64
            long r0 = r9.size()
            long r0 = r0 - r10
            long r2 = r9.size()
            okio.Segment r4 = r9.head
            kotlin.jvm.internal.g0.m(r4)
        L1d:
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 <= 0) goto L2e
            okio.Segment r4 = r4.prev
            kotlin.jvm.internal.g0.m(r4)
            int r5 = r4.limit
            int r6 = r4.pos
            int r5 = r5 - r6
            long r5 = (long) r5
            long r2 = r2 - r5
            goto L1d
        L2e:
            long r5 = r9.size()
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 >= 0) goto L64
            int r5 = r4.pos
            long r5 = (long) r5
            long r5 = r5 + r0
            long r5 = r5 - r2
            int r0 = (int) r5
            java.security.MessageDigest r1 = r8.messageDigest
            if (r1 == 0) goto L49
            byte[] r5 = r4.data
            int r6 = r4.limit
            int r6 = r6 - r0
            r1.update(r5, r0, r6)
            goto L56
        L49:
            javax.crypto.Mac r1 = r8.mac
            kotlin.jvm.internal.g0.m(r1)
            byte[] r5 = r4.data
            int r6 = r4.limit
            int r6 = r6 - r0
            r1.update(r5, r0, r6)
        L56:
            int r0 = r4.limit
            int r1 = r4.pos
            int r0 = r0 - r1
            long r0 = (long) r0
            long r2 = r2 + r0
            okio.Segment r4 = r4.next
            kotlin.jvm.internal.g0.m(r4)
            r0 = r2
            goto L2e
        L64:
            return r10
    }
}
