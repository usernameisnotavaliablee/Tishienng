package com.bumptech.glide.load.resource.bitmap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class DefaultImageHeaderParser implements com.bumptech.glide.load.ImageHeaderParser {
    private static final java.lang.String b = "DfltImageHeaderParser";
    private static final int c = 4671814;
    private static final int d = -1991225785;
    static final int e = 65496;
    private static final int f = 19789;
    private static final int g = 18761;
    private static final java.lang.String h = "Exif\u0000\u0000";
    static final byte[] i = null;
    private static final int j = 218;
    private static final int k = 217;

    /* renamed from: l, reason: collision with root package name */
    static final int f436l = 255;

    /* renamed from: m, reason: collision with root package name */
    static final int f437m = 225;

    /* renamed from: n, reason: collision with root package name */
    private static final int f438n = 274;

    /* renamed from: o, reason: collision with root package name */
    private static final int[] f439o = null;

    /* renamed from: p, reason: collision with root package name */
    private static final int f440p = 1380533830;

    /* renamed from: q, reason: collision with root package name */
    private static final int f441q = 1464156752;

    /* renamed from: r, reason: collision with root package name */
    private static final int f442r = 1448097792;

    /* renamed from: s, reason: collision with root package name */
    private static final int f443s = -256;

    /* renamed from: t, reason: collision with root package name */
    private static final int f444t = 255;

    /* renamed from: u, reason: collision with root package name */
    private static final int f445u = 88;

    /* renamed from: v, reason: collision with root package name */
    private static final int f446v = 76;

    /* renamed from: w, reason: collision with root package name */
    private static final int f447w = 16;

    /* renamed from: x, reason: collision with root package name */
    private static final int f448x = 8;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private interface Reader {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static final class EndOfFileException extends java.io.IOException {
            private static final long serialVersionUID = 1;

            EndOfFileException() {
                    r1 = this;
                    java.lang.String r0 = "Unexpectedly reached end of a file"
                    r1.<init>(r0)
                    return
            }
        }

        int a() throws java.io.IOException;

        short b() throws java.io.IOException;

        int read(byte[] r1, int r2) throws java.io.IOException;

        long skip(long r1) throws java.io.IOException;
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class a implements com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader {
        private final java.nio.ByteBuffer a;

        a(java.nio.ByteBuffer r2) {
                r1 = this;
                r1.<init>()
                r1.a = r2
                java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
                r2.order(r0)
                return
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int a() throws com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException {
                r2 = this;
                short r0 = r2.b()
                int r0 = r0 << 8
                short r1 = r2.b()
                r0 = r0 | r1
                return r0
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public short b() throws com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException {
                r2 = this;
                java.nio.ByteBuffer r0 = r2.a
                int r0 = r0.remaining()
                r1 = 1
                if (r0 < r1) goto L13
                java.nio.ByteBuffer r0 = r2.a
                byte r0 = r0.get()
                r0 = r0 & 255(0xff, float:3.57E-43)
                short r0 = (short) r0
                return r0
            L13:
                com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader$EndOfFileException r0 = new com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader$EndOfFileException
                r0.<init>()
                throw r0
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int read(byte[] r3, int r4) {
                r2 = this;
                java.nio.ByteBuffer r0 = r2.a
                int r0 = r0.remaining()
                int r4 = java.lang.Math.min(r4, r0)
                if (r4 != 0) goto Le
                r3 = -1
                return r3
            Le:
                java.nio.ByteBuffer r0 = r2.a
                r1 = 0
                r0.get(r3, r1, r4)
                return r4
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long skip(long r3) {
                r2 = this;
                java.nio.ByteBuffer r0 = r2.a
                int r0 = r0.remaining()
                long r0 = (long) r0
                long r3 = java.lang.Math.min(r0, r3)
                int r4 = (int) r3
                java.nio.ByteBuffer r3 = r2.a
                int r0 = r3.position()
                int r0 = r0 + r4
                r3.position(r0)
                long r3 = (long) r4
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class b {
        private final java.nio.ByteBuffer a;

        b(byte[] r2, int r3) {
                r1 = this;
                r1.<init>()
                java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r2)
                java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
                java.nio.ByteBuffer r2 = r2.order(r0)
                java.nio.Buffer r2 = r2.limit(r3)
                java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
                r1.a = r2
                return
        }

        private boolean c(int r2, int r3) {
                r1 = this;
                java.nio.ByteBuffer r0 = r1.a
                int r0 = r0.remaining()
                int r0 = r0 - r2
                if (r0 < r3) goto Lb
                r2 = 1
                return r2
            Lb:
                r2 = 0
                return r2
        }

        short a(int r2) {
                r1 = this;
                r0 = 2
                boolean r0 = r1.c(r2, r0)
                if (r0 == 0) goto Le
                java.nio.ByteBuffer r0 = r1.a
                short r2 = r0.getShort(r2)
                return r2
            Le:
                r2 = -1
                return r2
        }

        int b(int r2) {
                r1 = this;
                r0 = 4
                boolean r0 = r1.c(r2, r0)
                if (r0 == 0) goto Le
                java.nio.ByteBuffer r0 = r1.a
                int r2 = r0.getInt(r2)
                return r2
            Le:
                r2 = -1
                return r2
        }

        int d() {
                r1 = this;
                java.nio.ByteBuffer r0 = r1.a
                int r0 = r0.remaining()
                return r0
        }

        void e(java.nio.ByteOrder r2) {
                r1 = this;
                java.nio.ByteBuffer r0 = r1.a
                r0.order(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class c implements com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader {
        private final java.io.InputStream a;

        c(java.io.InputStream r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int a() throws java.io.IOException {
                r2 = this;
                short r0 = r2.b()
                int r0 = r0 << 8
                short r1 = r2.b()
                r0 = r0 | r1
                return r0
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public short b() throws java.io.IOException {
                r2 = this;
                java.io.InputStream r0 = r2.a
                int r0 = r0.read()
                r1 = -1
                if (r0 == r1) goto Lb
                short r0 = (short) r0
                return r0
            Lb:
                com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader$EndOfFileException r0 = new com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader$EndOfFileException
                r0.<init>()
                throw r0
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int read(byte[] r5, int r6) throws java.io.IOException {
                r4 = this;
                r0 = 0
                r1 = 0
            L2:
                r2 = -1
                if (r0 >= r6) goto L11
                java.io.InputStream r1 = r4.a
                int r3 = r6 - r0
                int r1 = r1.read(r5, r0, r3)
                if (r1 == r2) goto L11
                int r0 = r0 + r1
                goto L2
            L11:
                if (r0 != 0) goto L1c
                if (r1 == r2) goto L16
                goto L1c
            L16:
                com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader$EndOfFileException r5 = new com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader$EndOfFileException
                r5.<init>()
                throw r5
            L1c:
                return r0
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long skip(long r8) throws java.io.IOException {
                r7 = this;
                r0 = 0
                int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r2 >= 0) goto L7
                return r0
            L7:
                r2 = r8
            L8:
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 <= 0) goto L25
                java.io.InputStream r4 = r7.a
                long r4 = r4.skip(r2)
                int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r6 <= 0) goto L18
            L16:
                long r2 = r2 - r4
                goto L8
            L18:
                java.io.InputStream r4 = r7.a
                int r4 = r4.read()
                r5 = -1
                if (r4 != r5) goto L22
                goto L25
            L22:
                r4 = 1
                goto L16
            L25:
                long r8 = r8 - r2
                return r8
        }
    }

    static {
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            java.lang.String r1 = "Exif\u0000\u0000"
            byte[] r0 = r1.getBytes(r0)
            com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.i = r0
            r0 = 13
            int[] r0 = new int[r0]
            r0 = {x0018: FILL_ARRAY_DATA , data: [0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8} // fill-array
            com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.f439o = r0
            return
    }

    public DefaultImageHeaderParser() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int c(int r0, int r1) {
            int r0 = r0 + 2
            int r1 = r1 * 12
            int r0 = r0 + r1
            return r0
    }

    private int d(com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader r5, com.bumptech.glide.load.engine.bitmap_recycle.b r6) throws java.io.IOException {
            r4 = this;
            r0 = -1
            int r1 = r5.a()     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> L31
            boolean r1 = e(r1)     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> L31
            r2 = 3
            java.lang.String r3 = "DfltImageHeaderParser"
            if (r1 != 0) goto L12
            android.util.Log.isLoggable(r3, r2)     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> L31
            return r0
        L12:
            int r1 = r4.g(r5)     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> L31
            if (r1 != r0) goto L1c
            android.util.Log.isLoggable(r3, r2)     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> L31
            return r0
        L1c:
            java.lang.Class<byte[]> r2 = byte[].class
            java.lang.Object r2 = r6.c(r1, r2)     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> L31
            byte[] r2 = (byte[]) r2     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> L31
            int r5 = r4.i(r5, r2, r1)     // Catch: java.lang.Throwable -> L2c
            r6.put(r2)     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> L31
            return r5
        L2c:
            r5 = move-exception
            r6.put(r2)     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> L31
            throw r5     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> L31
        L31:
            return r0
    }

    private static boolean e(int r2) {
            r0 = 65496(0xffd8, float:9.178E-41)
            r1 = r2 & r0
            if (r1 == r0) goto L12
            r0 = 19789(0x4d4d, float:2.773E-41)
            if (r2 == r0) goto L12
            r0 = 18761(0x4949, float:2.629E-41)
            if (r2 != r0) goto L10
            goto L12
        L10:
            r2 = 0
            return r2
        L12:
            r2 = 1
            return r2
    }

    private boolean f(byte[] r5, int r6) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto La
            byte[] r1 = com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.i
            int r1 = r1.length
            if (r6 <= r1) goto La
            r6 = 1
            goto Lb
        La:
            r6 = 0
        Lb:
            if (r6 == 0) goto L1d
            r1 = 0
        Le:
            byte[] r2 = com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.i
            int r3 = r2.length
            if (r1 >= r3) goto L1d
            r3 = r5[r1]
            r2 = r2[r1]
            if (r3 == r2) goto L1a
            return r0
        L1a:
            int r1 = r1 + 1
            goto Le
        L1d:
            return r6
    }

    private int g(com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader r9) throws java.io.IOException {
            r8 = this;
        L0:
            short r0 = r9.b()
            r1 = 255(0xff, float:3.57E-43)
            r2 = 3
            java.lang.String r3 = "DfltImageHeaderParser"
            r4 = -1
            if (r0 == r1) goto L10
            android.util.Log.isLoggable(r3, r2)
            return r4
        L10:
            short r0 = r9.b()
            r1 = 218(0xda, float:3.05E-43)
            if (r0 != r1) goto L19
            return r4
        L19:
            r1 = 217(0xd9, float:3.04E-43)
            if (r0 != r1) goto L21
            android.util.Log.isLoggable(r3, r2)
            return r4
        L21:
            int r1 = r9.a()
            int r1 = r1 + (-2)
            r5 = 225(0xe1, float:3.15E-43)
            if (r0 == r5) goto L38
            long r0 = (long) r1
            long r5 = r9.skip(r0)
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 == 0) goto L0
            android.util.Log.isLoggable(r3, r2)
            return r4
        L38:
            return r1
    }

    @androidx.annotation.NonNull
    private com.bumptech.glide.load.ImageHeaderParser.ImageType getType(com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader r6) throws java.io.IOException {
            r5 = this;
            int r0 = r6.a()     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> La0
            r1 = 65496(0xffd8, float:9.178E-41)
            if (r0 != r1) goto Lc
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> La0
            return r6
        Lc:
            int r0 = r0 << 8
            short r1 = r6.b()     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> La0
            r0 = r0 | r1
            r1 = 4671814(0x474946, float:6.546606E-39)
            if (r0 != r1) goto L1b
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.GIF     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> La0
            return r6
        L1b:
            int r0 = r0 << 8
            short r1 = r6.b()     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> La0
            r0 = r0 | r1
            r1 = -1991225785(0xffffffff89504e47, float:-2.5073895E-33)
            if (r0 != r1) goto L3c
            r0 = 21
            r6.skip(r0)     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> La0
            short r6 = r6.b()     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> L39
            r0 = 3
            if (r6 < r0) goto L36
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> L39
            return r6
        L36:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> L39
            return r6
        L39:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> La0
            return r6
        L3c:
            r1 = 1380533830(0x52494646, float:2.1611685E11)
            if (r0 == r1) goto L44
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> La0
            return r6
        L44:
            r0 = 4
            r6.skip(r0)     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> La0
            int r2 = r6.a()     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> La0
            int r2 = r2 << 16
            int r3 = r6.a()     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> La0
            r2 = r2 | r3
            r3 = 1464156752(0x57454250, float:2.168886E14)
            if (r2 == r3) goto L5c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> La0
            return r6
        L5c:
            int r2 = r6.a()     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> La0
            int r2 = r2 << 16
            int r3 = r6.a()     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> La0
            r2 = r2 | r3
            r3 = r2 & (-256(0xffffffffffffff00, float:NaN))
            r4 = 1448097792(0x56503800, float:5.7234734E13)
            if (r3 == r4) goto L71
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> La0
            return r6
        L71:
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 88
            if (r2 != r3) goto L88
            r6.skip(r0)     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> La0
            short r6 = r6.b()     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> La0
            r6 = r6 & 16
            if (r6 == 0) goto L85
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> La0
            return r6
        L85:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> La0
            return r6
        L88:
            r3 = 76
            if (r2 != r3) goto L9d
            r6.skip(r0)     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> La0
            short r6 = r6.b()     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> La0
            r6 = r6 & 8
            if (r6 == 0) goto L9a
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> La0
            return r6
        L9a:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> La0
            return r6
        L9d:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> La0
            return r6
        La0:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            return r6
    }

    private static int h(com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.b r9) {
            r0 = 6
            short r1 = r9.a(r0)
            r2 = 18761(0x4949, float:2.629E-41)
            r3 = 3
            java.lang.String r4 = "DfltImageHeaderParser"
            if (r1 == r2) goto L19
            r2 = 19789(0x4d4d, float:2.773E-41)
            if (r1 == r2) goto L16
            android.util.Log.isLoggable(r4, r3)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            goto L1b
        L16:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            goto L1b
        L19:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
        L1b:
            r9.e(r1)
            r1 = 10
            int r1 = r9.b(r1)
            int r1 = r1 + r0
            short r0 = r9.a(r1)
            r2 = 0
        L2a:
            if (r2 >= r0) goto L8a
            int r5 = c(r1, r2)
            short r6 = r9.a(r5)
            r7 = 274(0x112, float:3.84E-43)
            if (r6 == r7) goto L39
            goto L87
        L39:
            int r6 = r5 + 2
            short r6 = r9.a(r6)
            r7 = 1
            if (r6 < r7) goto L84
            r7 = 12
            if (r6 <= r7) goto L47
            goto L84
        L47:
            int r7 = r5 + 4
            int r7 = r9.b(r7)
            if (r7 >= 0) goto L53
            android.util.Log.isLoggable(r4, r3)
            goto L87
        L53:
            android.util.Log.isLoggable(r4, r3)
            int[] r8 = com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.f439o
            r6 = r8[r6]
            int r7 = r7 + r6
            r6 = 4
            if (r7 <= r6) goto L62
            android.util.Log.isLoggable(r4, r3)
            goto L87
        L62:
            int r5 = r5 + 8
            if (r5 < 0) goto L80
            int r6 = r9.d()
            if (r5 <= r6) goto L6d
            goto L80
        L6d:
            if (r7 < 0) goto L7c
            int r7 = r7 + r5
            int r6 = r9.d()
            if (r7 <= r6) goto L77
            goto L7c
        L77:
            short r9 = r9.a(r5)
            return r9
        L7c:
            android.util.Log.isLoggable(r4, r3)
            goto L87
        L80:
            android.util.Log.isLoggable(r4, r3)
            goto L87
        L84:
            android.util.Log.isLoggable(r4, r3)
        L87:
            int r2 = r2 + 1
            goto L2a
        L8a:
            r9 = -1
            return r9
    }

    private int i(com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader r4, byte[] r5, int r6) throws java.io.IOException {
            r3 = this;
            int r4 = r4.read(r5, r6)
            r0 = -1
            r1 = 3
            java.lang.String r2 = "DfltImageHeaderParser"
            if (r4 == r6) goto Le
            android.util.Log.isLoggable(r2, r1)
            return r0
        Le:
            boolean r4 = r3.f(r5, r6)
            if (r4 == 0) goto L1e
            com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$b r4 = new com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$b
            r4.<init>(r5, r6)
            int r4 = h(r4)
            return r4
        L1e:
            android.util.Log.isLoggable(r2, r1)
            return r0
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int a(@androidx.annotation.NonNull java.nio.ByteBuffer r2, @androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.b r3) throws java.io.IOException {
            r1 = this;
            com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$a r0 = new com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$a
            java.lang.Object r2 = com.bumptech.glide.util.k.d(r2)
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            r0.<init>(r2)
            java.lang.Object r2 = com.bumptech.glide.util.k.d(r3)
            com.bumptech.glide.load.engine.bitmap_recycle.b r2 = (com.bumptech.glide.load.engine.bitmap_recycle.b) r2
            int r2 = r1.d(r0, r2)
            return r2
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int b(@androidx.annotation.NonNull java.io.InputStream r2, @androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.b r3) throws java.io.IOException {
            r1 = this;
            com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$c r0 = new com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$c
            java.lang.Object r2 = com.bumptech.glide.util.k.d(r2)
            java.io.InputStream r2 = (java.io.InputStream) r2
            r0.<init>(r2)
            java.lang.Object r2 = com.bumptech.glide.util.k.d(r3)
            com.bumptech.glide.load.engine.bitmap_recycle.b r2 = (com.bumptech.glide.load.engine.bitmap_recycle.b) r2
            int r2 = r1.d(r0, r2)
            return r2
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @androidx.annotation.NonNull
    public com.bumptech.glide.load.ImageHeaderParser.ImageType getType(@androidx.annotation.NonNull java.io.InputStream r2) throws java.io.IOException {
            r1 = this;
            com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$c r0 = new com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$c
            java.lang.Object r2 = com.bumptech.glide.util.k.d(r2)
            java.io.InputStream r2 = (java.io.InputStream) r2
            r0.<init>(r2)
            com.bumptech.glide.load.ImageHeaderParser$ImageType r2 = r1.getType(r0)
            return r2
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @androidx.annotation.NonNull
    public com.bumptech.glide.load.ImageHeaderParser.ImageType getType(@androidx.annotation.NonNull java.nio.ByteBuffer r2) throws java.io.IOException {
            r1 = this;
            com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$a r0 = new com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$a
            java.lang.Object r2 = com.bumptech.glide.util.k.d(r2)
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            r0.<init>(r2)
            com.bumptech.glide.load.ImageHeaderParser$ImageType r2 = r1.getType(r0)
            return r2
    }
}
