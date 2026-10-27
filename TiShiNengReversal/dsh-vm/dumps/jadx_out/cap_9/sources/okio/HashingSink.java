package okio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nHashingSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HashingSink.kt\nokio/HashingSink\n+ 2 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,149:1\n85#2:150\n*S KotlinDebug\n*F\n+ 1 HashingSink.kt\nokio/HashingSink\n*L\n76#1:150\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class HashingSink extends okio.ForwardingSink implements okio.Sink {

    @org.jetbrains.annotations.NotNull
    public static final okio.HashingSink.Companion Companion = null;

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
        public final okio.HashingSink hmacSha1(@org.jetbrains.annotations.NotNull okio.Sink r3, @org.jetbrains.annotations.NotNull okio.ByteString r4) {
                r2 = this;
                java.lang.String r0 = "sink"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = "key"
                kotlin.jvm.internal.g0.p(r4, r0)
                okio.HashingSink r0 = new okio.HashingSink
                java.lang.String r1 = "HmacSHA1"
                r0.<init>(r3, r4, r1)
                return r0
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okio.HashingSink hmacSha256(@org.jetbrains.annotations.NotNull okio.Sink r3, @org.jetbrains.annotations.NotNull okio.ByteString r4) {
                r2 = this;
                java.lang.String r0 = "sink"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = "key"
                kotlin.jvm.internal.g0.p(r4, r0)
                okio.HashingSink r0 = new okio.HashingSink
                java.lang.String r1 = "HmacSHA256"
                r0.<init>(r3, r4, r1)
                return r0
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okio.HashingSink hmacSha512(@org.jetbrains.annotations.NotNull okio.Sink r3, @org.jetbrains.annotations.NotNull okio.ByteString r4) {
                r2 = this;
                java.lang.String r0 = "sink"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = "key"
                kotlin.jvm.internal.g0.p(r4, r0)
                okio.HashingSink r0 = new okio.HashingSink
                java.lang.String r1 = "HmacSHA512"
                r0.<init>(r3, r4, r1)
                return r0
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okio.HashingSink md5(@org.jetbrains.annotations.NotNull okio.Sink r3) {
                r2 = this;
                java.lang.String r0 = "sink"
                kotlin.jvm.internal.g0.p(r3, r0)
                okio.HashingSink r0 = new okio.HashingSink
                java.lang.String r1 = "MD5"
                r0.<init>(r3, r1)
                return r0
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okio.HashingSink sha1(@org.jetbrains.annotations.NotNull okio.Sink r3) {
                r2 = this;
                java.lang.String r0 = "sink"
                kotlin.jvm.internal.g0.p(r3, r0)
                okio.HashingSink r0 = new okio.HashingSink
                java.lang.String r1 = "SHA-1"
                r0.<init>(r3, r1)
                return r0
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okio.HashingSink sha256(@org.jetbrains.annotations.NotNull okio.Sink r3) {
                r2 = this;
                java.lang.String r0 = "sink"
                kotlin.jvm.internal.g0.p(r3, r0)
                okio.HashingSink r0 = new okio.HashingSink
                java.lang.String r1 = "SHA-256"
                r0.<init>(r3, r1)
                return r0
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okio.HashingSink sha512(@org.jetbrains.annotations.NotNull okio.Sink r3) {
                r2 = this;
                java.lang.String r0 = "sink"
                kotlin.jvm.internal.g0.p(r3, r0)
                okio.HashingSink r0 = new okio.HashingSink
                java.lang.String r1 = "SHA-512"
                r0.<init>(r3, r1)
                return r0
        }
    }

    static {
            okio.HashingSink$Companion r0 = new okio.HashingSink$Companion
            r1 = 0
            r0.<init>(r1)
            okio.HashingSink.Companion = r0
            return
    }

    public HashingSink(@org.jetbrains.annotations.NotNull okio.Sink r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "algorithm"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r3)
            java.lang.String r0 = "getInstance(...)"
            kotlin.jvm.internal.g0.o(r3, r0)
            r1.<init>(r2, r3)
            return
    }

    public HashingSink(@org.jetbrains.annotations.NotNull okio.Sink r2, @org.jetbrains.annotations.NotNull java.security.MessageDigest r3) {
            r1 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "digest"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>(r2)
            r1.messageDigest = r3
            r2 = 0
            r1.mac = r2
            return
    }

    public HashingSink(@org.jetbrains.annotations.NotNull okio.Sink r2, @org.jetbrains.annotations.NotNull javax.crypto.Mac r3) {
            r1 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "mac"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>(r2)
            r1.mac = r3
            r2 = 0
            r1.messageDigest = r2
            return
    }

    public HashingSink(@org.jetbrains.annotations.NotNull okio.Sink r3, @org.jetbrains.annotations.NotNull okio.ByteString r4, @org.jetbrains.annotations.NotNull java.lang.String r5) {
            r2 = this;
            java.lang.String r0 = "sink"
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
    public static final okio.HashingSink hmacSha1(@org.jetbrains.annotations.NotNull okio.Sink r1, @org.jetbrains.annotations.NotNull okio.ByteString r2) {
            okio.HashingSink$Companion r0 = okio.HashingSink.Companion
            okio.HashingSink r1 = r0.hmacSha1(r1, r2)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okio.HashingSink hmacSha256(@org.jetbrains.annotations.NotNull okio.Sink r1, @org.jetbrains.annotations.NotNull okio.ByteString r2) {
            okio.HashingSink$Companion r0 = okio.HashingSink.Companion
            okio.HashingSink r1 = r0.hmacSha256(r1, r2)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okio.HashingSink hmacSha512(@org.jetbrains.annotations.NotNull okio.Sink r1, @org.jetbrains.annotations.NotNull okio.ByteString r2) {
            okio.HashingSink$Companion r0 = okio.HashingSink.Companion
            okio.HashingSink r1 = r0.hmacSha512(r1, r2)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okio.HashingSink md5(@org.jetbrains.annotations.NotNull okio.Sink r1) {
            okio.HashingSink$Companion r0 = okio.HashingSink.Companion
            okio.HashingSink r1 = r0.md5(r1)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okio.HashingSink sha1(@org.jetbrains.annotations.NotNull okio.Sink r1) {
            okio.HashingSink$Companion r0 = okio.HashingSink.Companion
            okio.HashingSink r1 = r0.sha1(r1)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okio.HashingSink sha256(@org.jetbrains.annotations.NotNull okio.Sink r1) {
            okio.HashingSink$Companion r0 = okio.HashingSink.Companion
            okio.HashingSink r1 = r0.sha256(r1)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okio.HashingSink sha512(@org.jetbrains.annotations.NotNull okio.Sink r1) {
            okio.HashingSink$Companion r0 = okio.HashingSink.Companion
            okio.HashingSink r1 = r0.sha512(r1)
            return r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "hash", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_hash")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_hash, reason: not valid java name */
    public final okio.ByteString m61deprecated_hash() {
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

    @Override // okio.ForwardingSink, okio.Sink
    public void write(@org.jetbrains.annotations.NotNull okio.Buffer r10, long r11) throws java.io.IOException {
            r9 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r10, r0)
            long r1 = r10.size()
            r3 = 0
            r5 = r11
            okio.SegmentedByteString.checkOffsetAndCount(r1, r3, r5)
            okio.Segment r11 = r10.head
            kotlin.jvm.internal.g0.m(r11)
            r0 = 0
        L16:
            int r12 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r12 >= 0) goto L47
            long r2 = r5 - r0
            int r12 = r11.limit
            int r4 = r11.pos
            int r12 = r12 - r4
            long r7 = (long) r12
            long r2 = java.lang.Math.min(r2, r7)
            int r12 = (int) r2
            java.security.MessageDigest r2 = r9.messageDigest
            if (r2 == 0) goto L33
            byte[] r3 = r11.data
            int r4 = r11.pos
            r2.update(r3, r4, r12)
            goto L3f
        L33:
            javax.crypto.Mac r2 = r9.mac
            kotlin.jvm.internal.g0.m(r2)
            byte[] r3 = r11.data
            int r4 = r11.pos
            r2.update(r3, r4, r12)
        L3f:
            long r2 = (long) r12
            long r0 = r0 + r2
            okio.Segment r11 = r11.next
            kotlin.jvm.internal.g0.m(r11)
            goto L16
        L47:
            super.write(r10, r5)
            return
    }
}
