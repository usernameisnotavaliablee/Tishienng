package com.bumptech.glide.load.resource.bitmap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class u {
    static final java.lang.String f = "Downsampler";
    public static final com.bumptech.glide.load.e<com.bumptech.glide.load.DecodeFormat> g = null;
    public static final com.bumptech.glide.load.e<com.bumptech.glide.load.PreferredColorSpace> h = null;

    @java.lang.Deprecated
    public static final com.bumptech.glide.load.e<com.bumptech.glide.load.resource.bitmap.DownsampleStrategy> i = null;
    public static final com.bumptech.glide.load.e<java.lang.Boolean> j = null;
    public static final com.bumptech.glide.load.e<java.lang.Boolean> k = null;

    /* renamed from: l, reason: collision with root package name */
    private static final java.lang.String f456l = "image/vnd.wap.wbmp";

    /* renamed from: m, reason: collision with root package name */
    private static final java.lang.String f457m = "image/x-ico";

    /* renamed from: n, reason: collision with root package name */
    private static final java.util.Set<java.lang.String> f458n = null;

    /* renamed from: o, reason: collision with root package name */
    private static final com.bumptech.glide.load.resource.bitmap.u.b f459o = null;

    /* renamed from: p, reason: collision with root package name */
    private static final java.util.Set<com.bumptech.glide.load.ImageHeaderParser.ImageType> f460p = null;

    /* renamed from: q, reason: collision with root package name */
    private static final java.util.Queue<android.graphics.BitmapFactory.Options> f461q = null;
    private final com.bumptech.glide.load.engine.bitmap_recycle.e a;
    private final android.util.DisplayMetrics b;
    private final com.bumptech.glide.load.engine.bitmap_recycle.b c;
    private final java.util.List<com.bumptech.glide.load.ImageHeaderParser> d;
    private final com.bumptech.glide.load.resource.bitmap.a0 e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements com.bumptech.glide.load.resource.bitmap.u.b {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.resource.bitmap.u.b
        public void a() {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.load.resource.bitmap.u.b
        public void b(com.bumptech.glide.load.engine.bitmap_recycle.e r1, android.graphics.Bitmap r2) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        void a();

        void b(com.bumptech.glide.load.engine.bitmap_recycle.e r1, android.graphics.Bitmap r2) throws java.io.IOException;
    }

    static {
            java.lang.String r0 = "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat"
            com.bumptech.glide.load.DecodeFormat r1 = com.bumptech.glide.load.DecodeFormat.DEFAULT
            com.bumptech.glide.load.e r0 = com.bumptech.glide.load.e.g(r0, r1)
            com.bumptech.glide.load.resource.bitmap.u.g = r0
            java.lang.String r0 = "com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace"
            com.bumptech.glide.load.PreferredColorSpace r1 = com.bumptech.glide.load.PreferredColorSpace.SRGB
            com.bumptech.glide.load.e r0 = com.bumptech.glide.load.e.g(r0, r1)
            com.bumptech.glide.load.resource.bitmap.u.h = r0
            com.bumptech.glide.load.e<com.bumptech.glide.load.resource.bitmap.DownsampleStrategy> r0 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.h
            com.bumptech.glide.load.resource.bitmap.u.i = r0
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.String r1 = "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize"
            com.bumptech.glide.load.e r1 = com.bumptech.glide.load.e.g(r1, r0)
            com.bumptech.glide.load.resource.bitmap.u.j = r1
            java.lang.String r1 = "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode"
            com.bumptech.glide.load.e r0 = com.bumptech.glide.load.e.g(r1, r0)
            com.bumptech.glide.load.resource.bitmap.u.k = r0
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r1 = "image/vnd.wap.wbmp"
            java.lang.String r2 = "image/x-ico"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            com.bumptech.glide.load.resource.bitmap.u.f458n = r0
            com.bumptech.glide.load.resource.bitmap.u$a r0 = new com.bumptech.glide.load.resource.bitmap.u$a
            r0.<init>()
            com.bumptech.glide.load.resource.bitmap.u.f459o = r0
            com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG
            com.bumptech.glide.load.ImageHeaderParser$ImageType r1 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A
            com.bumptech.glide.load.ImageHeaderParser$ImageType r2 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG
            java.util.EnumSet r0 = java.util.EnumSet.of(r0, r1, r2)
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            com.bumptech.glide.load.resource.bitmap.u.f460p = r0
            r0 = 0
            java.util.Queue r0 = com.bumptech.glide.util.l.f(r0)
            com.bumptech.glide.load.resource.bitmap.u.f461q = r0
            return
    }

    public u(java.util.List<com.bumptech.glide.load.ImageHeaderParser> r2, android.util.DisplayMetrics r3, com.bumptech.glide.load.engine.bitmap_recycle.e r4, com.bumptech.glide.load.engine.bitmap_recycle.b r5) {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.load.resource.bitmap.a0 r0 = com.bumptech.glide.load.resource.bitmap.a0.d()
            r1.e = r0
            r1.d = r2
            java.lang.Object r2 = com.bumptech.glide.util.k.d(r3)
            android.util.DisplayMetrics r2 = (android.util.DisplayMetrics) r2
            r1.b = r2
            java.lang.Object r2 = com.bumptech.glide.util.k.d(r4)
            com.bumptech.glide.load.engine.bitmap_recycle.e r2 = (com.bumptech.glide.load.engine.bitmap_recycle.e) r2
            r1.a = r2
            java.lang.Object r2 = com.bumptech.glide.util.k.d(r5)
            com.bumptech.glide.load.engine.bitmap_recycle.b r2 = (com.bumptech.glide.load.engine.bitmap_recycle.b) r2
            r1.c = r2
            return
    }

    private static int a(double r4) {
            int r0 = l(r4)
            double r1 = (double) r0
            double r1 = r1 * r4
            int r1 = x(r1)
            float r2 = (float) r1
            float r0 = (float) r0
            float r2 = r2 / r0
            double r2 = (double) r2
            double r4 = r4 / r2
            double r0 = (double) r1
            double r4 = r4 * r0
            int r4 = x(r4)
            return r4
    }

    private void b(com.bumptech.glide.load.resource.bitmap.b0 r7, com.bumptech.glide.load.DecodeFormat r8, boolean r9, boolean r10, android.graphics.BitmapFactory.Options r11, int r12, int r13) {
            r6 = this;
            com.bumptech.glide.load.resource.bitmap.a0 r0 = r6.e
            r4 = r9
            r5 = r10
            r3 = r11
            r1 = r12
            r2 = r13
            boolean r9 = r0.k(r1, r2, r3, r4, r5)
            if (r9 == 0) goto Le
            goto L39
        Le:
            com.bumptech.glide.load.DecodeFormat r9 = com.bumptech.glide.load.DecodeFormat.PREFER_ARGB_8888
            if (r8 == r9) goto L3a
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = r7.d()     // Catch: java.io.IOException -> L1b
            boolean r7 = r7.hasAlpha()     // Catch: java.io.IOException -> L1b
            goto L29
        L1b:
            java.lang.String r7 = "Downsampler"
            r9 = 3
            boolean r7 = android.util.Log.isLoggable(r7, r9)
            if (r7 == 0) goto L28
            java.util.Objects.toString(r8)
        L28:
            r7 = 0
        L29:
            if (r7 == 0) goto L2e
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
            goto L30
        L2e:
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.RGB_565
        L30:
            r3.inPreferredConfig = r7
            android.graphics.Bitmap$Config r8 = android.graphics.Bitmap.Config.RGB_565
            if (r7 != r8) goto L39
            r7 = 1
            r3.inDither = r7
        L39:
            return
        L3a:
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
            r3.inPreferredConfig = r7
            return
    }

    private static void c(com.bumptech.glide.load.ImageHeaderParser.ImageType r16, com.bumptech.glide.load.resource.bitmap.b0 r17, com.bumptech.glide.load.resource.bitmap.u.b r18, com.bumptech.glide.load.engine.bitmap_recycle.e r19, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r20, int r21, int r22, int r23, int r24, int r25, android.graphics.BitmapFactory.Options r26) throws java.io.IOException {
            r0 = r16
            r1 = r20
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            java.lang.String r7 = "Downsampler"
            if (r2 <= 0) goto L16f
            if (r3 > 0) goto L16
            goto L16f
        L16:
            boolean r8 = r(r21)
            if (r8 == 0) goto L1f
            r9 = r2
            r8 = r3
            goto L21
        L1f:
            r8 = r2
            r9 = r3
        L21:
            float r10 = r1.b(r8, r9, r4, r5)
            r11 = 0
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 <= 0) goto L12d
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$SampleSizeRounding r2 = r1.a(r8, r9, r4, r5)
            if (r2 == 0) goto L125
            float r3 = (float) r8
            float r11 = r10 * r3
            double r11 = (double) r11
            int r11 = x(r11)
            float r12 = (float) r9
            float r13 = r10 * r12
            double r13 = (double) r13
            int r13 = x(r13)
            int r11 = r8 / r11
            int r13 = r9 / r13
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$SampleSizeRounding r14 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding.MEMORY
            if (r2 != r14) goto L4d
            int r11 = java.lang.Math.max(r11, r13)
            goto L51
        L4d:
            int r11 = java.lang.Math.min(r11, r13)
        L51:
            int r13 = android.os.Build.VERSION.SDK_INT
            r15 = 23
            r21 = r3
            if (r13 > r15) goto L65
            java.util.Set<java.lang.String> r15 = com.bumptech.glide.load.resource.bitmap.u.f458n
            java.lang.String r3 = r6.outMimeType
            boolean r3 = r15.contains(r3)
            if (r3 == 0) goto L65
            r11 = 1
            goto L7d
        L65:
            int r3 = java.lang.Integer.highestOneBit(r11)
            r11 = 1
            int r3 = java.lang.Math.max(r11, r3)
            if (r2 != r14) goto L7c
            float r2 = (float) r3
            r11 = 1065353216(0x3f800000, float:1.0)
            float r11 = r11 / r10
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r2 >= 0) goto L7c
            int r2 = r3 << 1
            r11 = r2
            goto L7d
        L7c:
            r11 = r3
        L7d:
            r6.inSampleSize = r11
            com.bumptech.glide.load.ImageHeaderParser$ImageType r2 = com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG
            r3 = 0
            if (r0 != r2) goto La0
            r0 = 8
            int r2 = java.lang.Math.min(r11, r0)
            float r2 = (float) r2
            float r8 = r21 / r2
            double r8 = (double) r8
            double r8 = java.lang.Math.ceil(r8)
            int r8 = (int) r8
            float r12 = r12 / r2
            double r9 = (double) r12
            double r9 = java.lang.Math.ceil(r9)
            int r2 = (int) r9
            int r11 = r11 / r0
            if (r11 <= 0) goto L101
            int r8 = r8 / r11
            int r2 = r2 / r11
            goto L101
        La0:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r2 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG
            if (r0 == r2) goto Lf1
            com.bumptech.glide.load.ImageHeaderParser$ImageType r2 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A
            if (r0 != r2) goto La9
            goto Lf1
        La9:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r2 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP
            if (r0 == r2) goto Lcf
            com.bumptech.glide.load.ImageHeaderParser$ImageType r2 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A
            if (r0 != r2) goto Lb2
            goto Lcf
        Lb2:
            int r0 = r8 % r11
            if (r0 != 0) goto Lba
            int r0 = r9 % r11
            if (r0 == 0) goto Lc1
        Lba:
            r0 = r17
            r2 = r18
            r8 = r19
            goto Lc5
        Lc1:
            int r8 = r8 / r11
            int r2 = r9 / r11
            goto L101
        Lc5:
            int[] r0 = m(r0, r6, r2, r8)
            r8 = r0[r3]
            r11 = 1
            r2 = r0[r11]
            goto L101
        Lcf:
            r0 = 24
            if (r13 < r0) goto Le0
            float r0 = (float) r11
            float r2 = r21 / r0
            int r8 = java.lang.Math.round(r2)
            float r12 = r12 / r0
            int r2 = java.lang.Math.round(r12)
            goto L101
        Le0:
            float r0 = (float) r11
            float r2 = r21 / r0
            double r8 = (double) r2
            double r8 = java.lang.Math.floor(r8)
            int r8 = (int) r8
            float r12 = r12 / r0
            double r9 = (double) r12
            double r9 = java.lang.Math.floor(r9)
        Lef:
            int r2 = (int) r9
            goto L101
        Lf1:
            float r0 = (float) r11
            float r2 = r21 / r0
            double r8 = (double) r2
            double r8 = java.lang.Math.floor(r8)
            int r8 = (int) r8
            float r12 = r12 / r0
            double r9 = (double) r12
            double r9 = java.lang.Math.floor(r9)
            goto Lef
        L101:
            float r0 = r1.b(r8, r2, r4, r5)
            double r0 = (double) r0
            int r2 = a(r0)
            r6.inTargetDensity = r2
            int r0 = l(r0)
            r6.inDensity = r0
            boolean r0 = s(r6)
            if (r0 == 0) goto L11c
            r11 = 1
            r6.inScaled = r11
            goto L120
        L11c:
            r6.inTargetDensity = r3
            r6.inDensity = r3
        L120:
            r0 = 2
            android.util.Log.isLoggable(r7, r0)
            return
        L125:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot round with null rounding"
            r0.<init>(r1)
            throw r0
        L12d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Cannot scale with factor: "
            r6.append(r7)
            r6.append(r10)
            java.lang.String r7 = " from: "
            r6.append(r7)
            r6.append(r1)
            java.lang.String r1 = ", source: ["
            r6.append(r1)
            r6.append(r2)
            java.lang.String r1 = "x"
            r6.append(r1)
            r6.append(r3)
            java.lang.String r2 = "], target: ["
            r6.append(r2)
            r6.append(r4)
            r6.append(r1)
            r6.append(r5)
            java.lang.String r1 = "]"
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            r0.<init>(r1)
            throw r0
        L16f:
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r7, r1)
            if (r1 == 0) goto L179
            java.util.Objects.toString(r0)
        L179:
            return
    }

    private com.bumptech.glide.load.engine.u<android.graphics.Bitmap> e(com.bumptech.glide.load.resource.bitmap.b0 r14, int r15, int r16, com.bumptech.glide.load.f r17, com.bumptech.glide.load.resource.bitmap.u.b r18) throws java.io.IOException {
            r13 = this;
            r0 = r17
            com.bumptech.glide.load.engine.bitmap_recycle.b r1 = r13.c
            r2 = 65536(0x10000, float:9.1835E-41)
            java.lang.Class<byte[]> r3 = byte[].class
            java.lang.Object r1 = r1.c(r2, r3)
            byte[] r1 = (byte[]) r1
            android.graphics.BitmapFactory$Options r4 = k()
            r4.inTempStorage = r1
            com.bumptech.glide.load.e<com.bumptech.glide.load.DecodeFormat> r2 = com.bumptech.glide.load.resource.bitmap.u.g
            java.lang.Object r2 = r0.c(r2)
            r6 = r2
            com.bumptech.glide.load.DecodeFormat r6 = (com.bumptech.glide.load.DecodeFormat) r6
            com.bumptech.glide.load.e<com.bumptech.glide.load.PreferredColorSpace> r2 = com.bumptech.glide.load.resource.bitmap.u.h
            java.lang.Object r2 = r0.c(r2)
            r7 = r2
            com.bumptech.glide.load.PreferredColorSpace r7 = (com.bumptech.glide.load.PreferredColorSpace) r7
            com.bumptech.glide.load.e<com.bumptech.glide.load.resource.bitmap.DownsampleStrategy> r2 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.h
            java.lang.Object r2 = r0.c(r2)
            r5 = r2
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r5 = (com.bumptech.glide.load.resource.bitmap.DownsampleStrategy) r5
            com.bumptech.glide.load.e<java.lang.Boolean> r2 = com.bumptech.glide.load.resource.bitmap.u.j
            java.lang.Object r2 = r0.c(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r11 = r2.booleanValue()
            com.bumptech.glide.load.e<java.lang.Boolean> r2 = com.bumptech.glide.load.resource.bitmap.u.k
            java.lang.Object r3 = r0.c(r2)
            if (r3 == 0) goto L59
            java.lang.Object r0 = r0.c(r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L59
            r0 = 1
            r8 = 1
        L51:
            r2 = r13
            r3 = r14
            r9 = r15
            r10 = r16
            r12 = r18
            goto L5c
        L59:
            r0 = 0
            r8 = 0
            goto L51
        L5c:
            android.graphics.Bitmap r14 = r2.h(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L6f
            com.bumptech.glide.load.engine.bitmap_recycle.e r15 = r13.a     // Catch: java.lang.Throwable -> L6f
            com.bumptech.glide.load.resource.bitmap.g r14 = com.bumptech.glide.load.resource.bitmap.g.c(r14, r15)     // Catch: java.lang.Throwable -> L6f
            v(r4)
            com.bumptech.glide.load.engine.bitmap_recycle.b r15 = r13.c
            r15.put(r1)
            return r14
        L6f:
            r0 = move-exception
            r14 = r0
            v(r4)
            com.bumptech.glide.load.engine.bitmap_recycle.b r15 = r13.c
            r15.put(r1)
            throw r14
    }

    private android.graphics.Bitmap h(com.bumptech.glide.load.resource.bitmap.b0 r20, android.graphics.BitmapFactory.Options r21, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r22, com.bumptech.glide.load.DecodeFormat r23, com.bumptech.glide.load.PreferredColorSpace r24, boolean r25, int r26, int r27, boolean r28, com.bumptech.glide.load.resource.bitmap.u.b r29) throws java.io.IOException {
            r19 = this;
            r0 = r19
            r1 = r20
            r5 = r21
            r3 = r29
            long r12 = com.bumptech.glide.util.g.b()
            com.bumptech.glide.load.engine.bitmap_recycle.e r2 = r0.a
            int[] r2 = m(r1, r5, r3, r2)
            r4 = 0
            r7 = r2[r4]
            r6 = 1
            r8 = r2[r6]
            java.lang.String r14 = r5.outMimeType
            r2 = -1
            if (r7 == r2) goto L23
            if (r8 != r2) goto L20
            goto L23
        L20:
            r15 = r25
            goto L24
        L23:
            r15 = 0
        L24:
            int r2 = r1.b()
            int r6 = com.bumptech.glide.load.resource.bitmap.k0.j(r2)
            boolean r16 = com.bumptech.glide.load.resource.bitmap.k0.m(r2)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r26
            if (r9 != r4) goto L44
            boolean r10 = r(r6)
            if (r10 == 0) goto L40
            r10 = r27
            r9 = r8
            goto L46
        L40:
            r10 = r27
            r9 = r7
            goto L46
        L44:
            r10 = r27
        L46:
            if (r10 != r4) goto L51
            boolean r4 = r(r6)
            if (r4 == 0) goto L50
            r10 = r7
            goto L51
        L50:
            r10 = r8
        L51:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r1 = r20.d()
            com.bumptech.glide.load.engine.bitmap_recycle.e r4 = r0.a
            r11 = r5
            r17 = r12
            r5 = r22
            r12 = r2
            r2 = r20
            c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r6 = r9
            r5 = r11
            r4 = r16
            r11 = r1
            r1 = r2
            r9 = r7
            r7 = r10
            r2 = r23
            r10 = r8
            r8 = r3
            r3 = r15
            r0.b(r1, r2, r3, r4, r5, r6, r7)
            r13 = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            boolean r2 = r13.z(r11)
            java.lang.String r4 = "Downsampler"
            if (r2 == 0) goto Lca
            if (r9 < 0) goto L86
            if (r10 < 0) goto L86
            if (r28 == 0) goto L86
            r3 = r6
            r6 = r4
            goto Lc0
        L86:
            boolean r2 = s(r5)
            if (r2 == 0) goto L94
            int r2 = r5.inTargetDensity
            float r2 = (float) r2
            int r6 = r5.inDensity
            float r6 = (float) r6
            float r2 = r2 / r6
            goto L96
        L94:
            r2 = 1065353216(0x3f800000, float:1.0)
        L96:
            int r6 = r5.inSampleSize
            float r7 = (float) r9
            float r6 = (float) r6
            float r7 = r7 / r6
            r23 = r4
            double r3 = (double) r7
            double r3 = java.lang.Math.ceil(r3)
            int r3 = (int) r3
            float r4 = (float) r10
            float r4 = r4 / r6
            double r6 = (double) r4
            double r6 = java.lang.Math.ceil(r6)
            int r4 = (int) r6
            float r3 = (float) r3
            float r3 = r3 * r2
            int r3 = java.lang.Math.round(r3)
            float r4 = (float) r4
            float r4 = r4 * r2
            int r2 = java.lang.Math.round(r4)
            r6 = r23
            r4 = 2
            android.util.Log.isLoggable(r6, r4)
            r7 = r2
        Lc0:
            if (r3 <= 0) goto Lcb
            if (r7 <= 0) goto Lcb
            com.bumptech.glide.load.engine.bitmap_recycle.e r2 = r13.a
            y(r5, r2, r3, r7)
            goto Lcb
        Lca:
            r6 = r4
        Lcb:
            r2 = 28
            if (r0 < r2) goto Lf6
            com.bumptech.glide.load.PreferredColorSpace r0 = com.bumptech.glide.load.PreferredColorSpace.DISPLAY_P3
            r2 = r24
            if (r2 != r0) goto Lea
            android.graphics.ColorSpace r0 = com.bumptech.glide.load.resource.bitmap.s.a(r5)
            if (r0 == 0) goto Lea
            android.graphics.ColorSpace r0 = com.bumptech.glide.load.resource.bitmap.s.a(r5)
            boolean r0 = com.bumptech.glide.load.resource.i.a(r0)
            if (r0 == 0) goto Lea
            android.graphics.ColorSpace$Named r0 = com.bumptech.glide.load.resource.j.a()
            goto Lee
        Lea:
            android.graphics.ColorSpace$Named r0 = androidx.core.graphics.b.a()
        Lee:
            android.graphics.ColorSpace r0 = androidx.core.graphics.c.a(r0)
            com.bumptech.glide.load.resource.bitmap.p.a(r5, r0)
            goto L105
        Lf6:
            r2 = 26
            if (r0 < r2) goto L105
            android.graphics.ColorSpace$Named r0 = androidx.core.graphics.b.a()
            android.graphics.ColorSpace r0 = androidx.core.graphics.c.a(r0)
            com.bumptech.glide.load.resource.bitmap.p.a(r5, r0)
        L105:
            com.bumptech.glide.load.engine.bitmap_recycle.e r0 = r13.a
            android.graphics.Bitmap r4 = i(r1, r5, r8, r0)
            com.bumptech.glide.load.engine.bitmap_recycle.e r0 = r13.a
            r8.b(r0, r4)
            r0 = 2
            boolean r0 = android.util.Log.isLoggable(r6, r0)
            if (r0 == 0) goto L124
            r6 = r27
            r3 = r5
            r0 = r9
            r1 = r10
            r2 = r14
            r7 = r17
            r5 = r26
            t(r0, r1, r2, r3, r4, r5, r6, r7)
        L124:
            if (r4 == 0) goto L13f
            android.util.DisplayMetrics r0 = r13.b
            int r0 = r0.densityDpi
            r4.setDensity(r0)
            com.bumptech.glide.load.engine.bitmap_recycle.e r0 = r13.a
            android.graphics.Bitmap r0 = com.bumptech.glide.load.resource.bitmap.k0.o(r0, r4, r12)
            boolean r1 = r4.equals(r0)
            if (r1 != 0) goto L13e
            com.bumptech.glide.load.engine.bitmap_recycle.e r1 = r13.a
            r1.d(r4)
        L13e:
            return r0
        L13f:
            r0 = 0
            return r0
    }

    private static android.graphics.Bitmap i(com.bumptech.glide.load.resource.bitmap.b0 r4, android.graphics.BitmapFactory.Options r5, com.bumptech.glide.load.resource.bitmap.u.b r6, com.bumptech.glide.load.engine.bitmap_recycle.e r7) throws java.io.IOException {
            boolean r0 = r5.inJustDecodeBounds
            if (r0 != 0) goto La
            r6.a()
            r4.a()
        La:
            int r0 = r5.outWidth
            int r1 = r5.outHeight
            java.lang.String r2 = r5.outMimeType
            java.util.concurrent.locks.Lock r3 = com.bumptech.glide.load.resource.bitmap.k0.i()
            r3.lock()
            android.graphics.Bitmap r4 = r4.c(r5)     // Catch: java.lang.IllegalArgumentException -> L23 java.lang.Throwable -> L3f
        L1b:
            java.util.concurrent.locks.Lock r5 = com.bumptech.glide.load.resource.bitmap.k0.i()
            r5.unlock()
            return r4
        L23:
            r3 = move-exception
            java.io.IOException r0 = u(r3, r0, r1, r2, r5)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = "Downsampler"
            r2 = 3
            android.util.Log.isLoggable(r1, r2)     // Catch: java.lang.Throwable -> L3f
            android.graphics.Bitmap r1 = r5.inBitmap     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L3e
            r7.d(r1)     // Catch: java.io.IOException -> L3d java.lang.Throwable -> L3f
            r1 = 0
            r5.inBitmap = r1     // Catch: java.io.IOException -> L3d java.lang.Throwable -> L3f
            android.graphics.Bitmap r4 = i(r4, r5, r6, r7)     // Catch: java.io.IOException -> L3d java.lang.Throwable -> L3f
            goto L1b
        L3d:
            throw r0     // Catch: java.lang.Throwable -> L3f
        L3e:
            throw r0     // Catch: java.lang.Throwable -> L3f
        L3f:
            r4 = move-exception
            java.util.concurrent.locks.Lock r5 = com.bumptech.glide.load.resource.bitmap.k0.i()
            r5.unlock()
            throw r4
    }

    @androidx.annotation.Nullable
    @android.annotation.TargetApi(19)
    private static java.lang.String j(android.graphics.Bitmap r3) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = " ("
            r0.append(r1)
            int r1 = r3.getAllocationByteCount()
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "["
            r1.append(r2)
            int r2 = r3.getWidth()
            r1.append(r2)
            java.lang.String r2 = "x"
            r1.append(r2)
            int r2 = r3.getHeight()
            r1.append(r2)
            java.lang.String r2 = "] "
            r1.append(r2)
            android.graphics.Bitmap$Config r3 = r3.getConfig()
            r1.append(r3)
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            return r3
    }

    private static synchronized android.graphics.BitmapFactory.Options k() {
            java.lang.Class<com.bumptech.glide.load.resource.bitmap.u> r0 = com.bumptech.glide.load.resource.bitmap.u.class
            monitor-enter(r0)
            java.util.Queue<android.graphics.BitmapFactory$Options> r1 = com.bumptech.glide.load.resource.bitmap.u.f461q     // Catch: java.lang.Throwable -> L18
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L18
            java.lang.Object r2 = r1.poll()     // Catch: java.lang.Throwable -> L1c
            android.graphics.BitmapFactory$Options r2 = (android.graphics.BitmapFactory.Options) r2     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1c
            if (r2 != 0) goto L1a
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> L18
            r2.<init>()     // Catch: java.lang.Throwable -> L18
            w(r2)     // Catch: java.lang.Throwable -> L18
            goto L1a
        L18:
            r1 = move-exception
            goto L1f
        L1a:
            monitor-exit(r0)
            return r2
        L1c:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1c
            throw r2     // Catch: java.lang.Throwable -> L18
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r1
    }

    private static int l(double r3) {
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 > 0) goto L7
            goto L9
        L7:
            double r3 = r0 / r3
        L9:
            r0 = 4746794007244308480(0x41dfffffffc00000, double:2.147483647E9)
            double r3 = r3 * r0
            long r3 = java.lang.Math.round(r3)
            int r4 = (int) r3
            return r4
    }

    private static int[] m(com.bumptech.glide.load.resource.bitmap.b0 r1, android.graphics.BitmapFactory.Options r2, com.bumptech.glide.load.resource.bitmap.u.b r3, com.bumptech.glide.load.engine.bitmap_recycle.e r4) throws java.io.IOException {
            r0 = 1
            r2.inJustDecodeBounds = r0
            i(r1, r2, r3, r4)
            r1 = 0
            r2.inJustDecodeBounds = r1
            int r1 = r2.outWidth
            int r2 = r2.outHeight
            int[] r1 = new int[]{r1, r2}
            return r1
    }

    private static java.lang.String n(android.graphics.BitmapFactory.Options r0) {
            android.graphics.Bitmap r0 = r0.inBitmap
            java.lang.String r0 = j(r0)
            return r0
    }

    private static boolean r(int r1) {
            r0 = 90
            if (r1 == r0) goto Lb
            r0 = 270(0x10e, float:3.78E-43)
            if (r1 != r0) goto L9
            goto Lb
        L9:
            r1 = 0
            return r1
        Lb:
            r1 = 1
            return r1
    }

    private static boolean s(android.graphics.BitmapFactory.Options r1) {
            int r0 = r1.inTargetDensity
            if (r0 <= 0) goto Lc
            int r1 = r1.inDensity
            if (r1 <= 0) goto Lc
            if (r0 == r1) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    private static void t(int r0, int r1, java.lang.String r2, android.graphics.BitmapFactory.Options r3, android.graphics.Bitmap r4, int r5, int r6, long r7) {
            j(r4)
            n(r3)
            int r0 = r3.inSampleSize
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.getName()
            com.bumptech.glide.util.g.a(r7)
            return
    }

    private static java.io.IOException u(java.lang.IllegalArgumentException r3, int r4, int r5, java.lang.String r6, android.graphics.BitmapFactory.Options r7) {
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Exception decoding bitmap, outWidth: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ", outHeight: "
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = ", outMimeType: "
            r1.append(r4)
            r1.append(r6)
            java.lang.String r4 = ", inBitmap: "
            r1.append(r4)
            java.lang.String r4 = n(r7)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4, r3)
            return r0
    }

    private static void v(android.graphics.BitmapFactory.Options r1) {
            w(r1)
            java.util.Queue<android.graphics.BitmapFactory$Options> r0 = com.bumptech.glide.load.resource.bitmap.u.f461q
            monitor-enter(r0)
            r0.offer(r1)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    private static void w(android.graphics.BitmapFactory.Options r5) {
            r0 = 0
            r5.inTempStorage = r0
            r1 = 0
            r5.inDither = r1
            r5.inScaled = r1
            r2 = 1
            r5.inSampleSize = r2
            r5.inPreferredConfig = r0
            r5.inJustDecodeBounds = r1
            r5.inDensity = r1
            r5.inTargetDensity = r1
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r3 < r4) goto L22
            com.bumptech.glide.load.resource.bitmap.p.a(r5, r0)
            com.bumptech.glide.load.resource.bitmap.q.a(r5, r0)
            com.bumptech.glide.load.resource.bitmap.r.a(r5, r0)
        L22:
            r5.outWidth = r1
            r5.outHeight = r1
            r5.outMimeType = r0
            r5.inBitmap = r0
            r5.inMutable = r2
            return
    }

    private static int x(double r2) {
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r2 = r2 + r0
            int r2 = (int) r2
            return r2
    }

    @android.annotation.TargetApi(26)
    private static void y(android.graphics.BitmapFactory.Options r2, com.bumptech.glide.load.engine.bitmap_recycle.e r3, int r4, int r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L14
            android.graphics.Bitmap$Config r0 = r2.inPreferredConfig
            android.graphics.Bitmap$Config r1 = com.bumptech.glide.load.engine.bitmap_recycle.k.a()
            if (r0 != r1) goto Lf
            return
        Lf:
            android.graphics.Bitmap$Config r0 = com.bumptech.glide.load.resource.bitmap.t.a(r2)
            goto L15
        L14:
            r0 = 0
        L15:
            if (r0 != 0) goto L19
            android.graphics.Bitmap$Config r0 = r2.inPreferredConfig
        L19:
            android.graphics.Bitmap r3 = r3.f(r4, r5, r0)
            r2.inBitmap = r3
            return
    }

    private boolean z(com.bumptech.glide.load.ImageHeaderParser.ImageType r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    @androidx.annotation.RequiresApi(21)
    public com.bumptech.glide.load.engine.u<android.graphics.Bitmap> d(android.os.ParcelFileDescriptor r7, int r8, int r9, com.bumptech.glide.load.f r10) throws java.io.IOException {
            r6 = this;
            com.bumptech.glide.load.resource.bitmap.b0$b r1 = new com.bumptech.glide.load.resource.bitmap.b0$b
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r6.d
            com.bumptech.glide.load.engine.bitmap_recycle.b r2 = r6.c
            r1.<init>(r7, r0, r2)
            com.bumptech.glide.load.resource.bitmap.u$b r5 = com.bumptech.glide.load.resource.bitmap.u.f459o
            r0 = r6
            r2 = r8
            r3 = r9
            r4 = r10
            com.bumptech.glide.load.engine.u r7 = r0.e(r1, r2, r3, r4, r5)
            return r7
    }

    public com.bumptech.glide.load.engine.u<android.graphics.Bitmap> f(java.io.InputStream r7, int r8, int r9, com.bumptech.glide.load.f r10) throws java.io.IOException {
            r6 = this;
            com.bumptech.glide.load.resource.bitmap.u$b r5 = com.bumptech.glide.load.resource.bitmap.u.f459o
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            com.bumptech.glide.load.engine.u r7 = r0.g(r1, r2, r3, r4, r5)
            return r7
    }

    public com.bumptech.glide.load.engine.u<android.graphics.Bitmap> g(java.io.InputStream r7, int r8, int r9, com.bumptech.glide.load.f r10, com.bumptech.glide.load.resource.bitmap.u.b r11) throws java.io.IOException {
            r6 = this;
            com.bumptech.glide.load.resource.bitmap.b0$a r1 = new com.bumptech.glide.load.resource.bitmap.b0$a
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r6.d
            com.bumptech.glide.load.engine.bitmap_recycle.b r2 = r6.c
            r1.<init>(r7, r0, r2)
            r0 = r6
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            com.bumptech.glide.load.engine.u r7 = r0.e(r1, r2, r3, r4, r5)
            return r7
    }

    public boolean o(android.os.ParcelFileDescriptor r1) {
            r0 = this;
            boolean r1 = com.bumptech.glide.load.data.ParcelFileDescriptorRewinder.c()
            return r1
    }

    public boolean p(java.io.InputStream r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    public boolean q(java.nio.ByteBuffer r1) {
            r0 = this;
            r1 = 1
            return r1
    }
}
