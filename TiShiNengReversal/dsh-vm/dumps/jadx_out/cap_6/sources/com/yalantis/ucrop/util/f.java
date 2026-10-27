package com.yalantis.ucrop.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class f {
    private static final java.lang.String b = "ImageHeaderParser";
    public static final int c = -1;
    private static final int d = 65496;
    private static final int e = 19789;
    private static final int f = 18761;
    private static final java.lang.String g = "Exif\u0000\u0000";
    private static final byte[] h = null;
    private static final int i = 218;
    private static final int j = 217;
    private static final int k = 255;
    private static final int l = 225;
    private static final int m = 274;
    private static final int[] n = null;
    private final com.yalantis.ucrop.util.f.b a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a {
        private final java.nio.ByteBuffer a;

        public a(byte[] r2, int r3) {
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

        public short a(int r2) {
                r1 = this;
                java.nio.ByteBuffer r0 = r1.a
                short r2 = r0.getShort(r2)
                return r2
        }

        public int b(int r2) {
                r1 = this;
                java.nio.ByteBuffer r0 = r1.a
                int r2 = r0.getInt(r2)
                return r2
        }

        public int c() {
                r1 = this;
                java.nio.ByteBuffer r0 = r1.a
                int r0 = r0.remaining()
                return r0
        }

        public void d(java.nio.ByteOrder r2) {
                r1 = this;
                java.nio.ByteBuffer r0 = r1.a
                r0.order(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private interface b {
        int a() throws java.io.IOException;

        short b() throws java.io.IOException;

        int read(byte[] r1, int r2) throws java.io.IOException;

        long skip(long r1) throws java.io.IOException;
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class c implements com.yalantis.ucrop.util.f.b {
        private final java.io.InputStream a;

        public c(java.io.InputStream r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        @Override // com.yalantis.ucrop.util.f.b
        public int a() throws java.io.IOException {
                r2 = this;
                java.io.InputStream r0 = r2.a
                int r0 = r0.read()
                int r0 = r0 << 8
                r1 = 65280(0xff00, float:9.1477E-41)
                r0 = r0 & r1
                java.io.InputStream r1 = r2.a
                int r1 = r1.read()
                r1 = r1 & 255(0xff, float:3.57E-43)
                r0 = r0 | r1
                return r0
        }

        @Override // com.yalantis.ucrop.util.f.b
        public short b() throws java.io.IOException {
                r1 = this;
                java.io.InputStream r0 = r1.a
                int r0 = r0.read()
                r0 = r0 & 255(0xff, float:3.57E-43)
                short r0 = (short) r0
                return r0
        }

        @Override // com.yalantis.ucrop.util.f.b
        public int read(byte[] r4, int r5) throws java.io.IOException {
                r3 = this;
                r0 = r5
            L1:
                if (r0 <= 0) goto L10
                java.io.InputStream r1 = r3.a
                int r2 = r5 - r0
                int r1 = r1.read(r4, r2, r0)
                r2 = -1
                if (r1 == r2) goto L10
                int r0 = r0 - r1
                goto L1
            L10:
                int r5 = r5 - r0
                return r5
        }

        @Override // com.yalantis.ucrop.util.f.b
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
            com.yalantis.ucrop.util.f.h = r0
            r0 = 13
            int[] r0 = new int[r0]
            r0 = {x0018: FILL_ARRAY_DATA , data: [0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8} // fill-array
            com.yalantis.ucrop.util.f.n = r0
            return
    }

    public f(java.io.InputStream r2) {
            r1 = this;
            r1.<init>()
            com.yalantis.ucrop.util.f$c r0 = new com.yalantis.ucrop.util.f$c
            r0.<init>(r2)
            r1.a = r0
            return
    }

    private static int a(int r0, int r1) {
            int r0 = r0 + 2
            int r1 = r1 * 12
            int r0 = r0 + r1
            return r0
    }

    public static void b(androidx.exifinterface.media.ExifInterface r24, int r25, int r26, java.lang.String r27) {
            java.lang.String r22 = "SubSecTimeOriginal"
            java.lang.String r23 = "WhiteBalance"
            java.lang.String r2 = "FNumber"
            java.lang.String r3 = "DateTime"
            java.lang.String r4 = "DateTimeDigitized"
            java.lang.String r5 = "ExposureTime"
            java.lang.String r6 = "Flash"
            java.lang.String r7 = "FocalLength"
            java.lang.String r8 = "GPSAltitude"
            java.lang.String r9 = "GPSAltitudeRef"
            java.lang.String r10 = "GPSDateStamp"
            java.lang.String r11 = "GPSLatitude"
            java.lang.String r12 = "GPSLatitudeRef"
            java.lang.String r13 = "GPSLongitude"
            java.lang.String r14 = "GPSLongitudeRef"
            java.lang.String r15 = "GPSProcessingMethod"
            java.lang.String r16 = "GPSTimeStamp"
            java.lang.String r17 = "PhotographicSensitivity"
            java.lang.String r18 = "Make"
            java.lang.String r19 = "Model"
            java.lang.String r20 = "SubSecTime"
            java.lang.String r21 = "SubSecTimeDigitized"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23}
            androidx.exifinterface.media.ExifInterface r1 = new androidx.exifinterface.media.ExifInterface     // Catch: java.io.IOException -> L6d
            r2 = r27
            r1.<init>(r2)     // Catch: java.io.IOException -> L6d
            r2 = 0
        L38:
            r3 = 22
            if (r2 >= r3) goto L50
            r3 = r0[r2]     // Catch: java.io.IOException -> L6d
            r4 = r24
            java.lang.String r5 = r4.getAttribute(r3)     // Catch: java.io.IOException -> L6d
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.io.IOException -> L6d
            if (r6 != 0) goto L4d
            r1.setAttribute(r3, r5)     // Catch: java.io.IOException -> L6d
        L4d:
            int r2 = r2 + 1
            goto L38
        L50:
            java.lang.String r0 = "ImageWidth"
            java.lang.String r2 = java.lang.String.valueOf(r25)     // Catch: java.io.IOException -> L6d
            r1.setAttribute(r0, r2)     // Catch: java.io.IOException -> L6d
            java.lang.String r0 = "ImageLength"
            java.lang.String r2 = java.lang.String.valueOf(r26)     // Catch: java.io.IOException -> L6d
            r1.setAttribute(r0, r2)     // Catch: java.io.IOException -> L6d
            java.lang.String r0 = "Orientation"
            java.lang.String r2 = "0"
            r1.setAttribute(r0, r2)     // Catch: java.io.IOException -> L6d
            r1.saveAttributes()     // Catch: java.io.IOException -> L6d
            return
        L6d:
            r0 = move-exception
            r0.getMessage()
            return
    }

    private static boolean d(int r2) {
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

    private boolean e(byte[] r5, int r6) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto La
            byte[] r1 = com.yalantis.ucrop.util.f.h
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
            byte[] r2 = com.yalantis.ucrop.util.f.h
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

    private int f() throws java.io.IOException {
            r8 = this;
        L0:
            com.yalantis.ucrop.util.f$b r0 = r8.a
            short r0 = r0.b()
            r1 = 255(0xff, float:3.57E-43)
            r2 = 3
            java.lang.String r3 = "ImageHeaderParser"
            r4 = -1
            if (r0 == r1) goto L12
            android.util.Log.isLoggable(r3, r2)
            return r4
        L12:
            com.yalantis.ucrop.util.f$b r0 = r8.a
            short r0 = r0.b()
            r1 = 218(0xda, float:3.05E-43)
            if (r0 != r1) goto L1d
            return r4
        L1d:
            r1 = 217(0xd9, float:3.04E-43)
            if (r0 != r1) goto L25
            android.util.Log.isLoggable(r3, r2)
            return r4
        L25:
            com.yalantis.ucrop.util.f$b r1 = r8.a
            int r1 = r1.a()
            int r1 = r1 + (-2)
            r5 = 225(0xe1, float:3.15E-43)
            if (r0 == r5) goto L40
            com.yalantis.ucrop.util.f$b r0 = r8.a
            long r5 = (long) r1
            long r0 = r0.skip(r5)
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 == 0) goto L0
            android.util.Log.isLoggable(r3, r2)
            return r4
        L40:
            return r1
    }

    private static int g(com.yalantis.ucrop.util.f.a r9) {
            r0 = 6
            short r1 = r9.a(r0)
            r2 = 19789(0x4d4d, float:2.773E-41)
            r3 = 3
            java.lang.String r4 = "ImageHeaderParser"
            if (r1 != r2) goto Lf
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            goto L1b
        Lf:
            r2 = 18761(0x4949, float:2.629E-41)
            if (r1 != r2) goto L16
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            goto L1b
        L16:
            android.util.Log.isLoggable(r4, r3)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
        L1b:
            r9.d(r1)
            r1 = 10
            int r1 = r9.b(r1)
            int r1 = r1 + r0
            short r0 = r9.a(r1)
            r2 = 0
        L2a:
            if (r2 >= r0) goto L8a
            int r5 = a(r1, r2)
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
            int[] r8 = com.yalantis.ucrop.util.f.n
            r6 = r8[r6]
            int r7 = r7 + r6
            r6 = 4
            if (r7 <= r6) goto L62
            android.util.Log.isLoggable(r4, r3)
            goto L87
        L62:
            int r5 = r5 + 8
            if (r5 < 0) goto L80
            int r6 = r9.c()
            if (r5 <= r6) goto L6d
            goto L80
        L6d:
            if (r7 < 0) goto L7c
            int r7 = r7 + r5
            int r6 = r9.c()
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

    private int h(byte[] r5, int r6) throws java.io.IOException {
            r4 = this;
            com.yalantis.ucrop.util.f$b r0 = r4.a
            int r0 = r0.read(r5, r6)
            r1 = -1
            r2 = 3
            java.lang.String r3 = "ImageHeaderParser"
            if (r0 == r6) goto L10
            android.util.Log.isLoggable(r3, r2)
            return r1
        L10:
            boolean r0 = r4.e(r5, r6)
            if (r0 == 0) goto L20
            com.yalantis.ucrop.util.f$a r0 = new com.yalantis.ucrop.util.f$a
            r0.<init>(r5, r6)
            int r5 = g(r0)
            return r5
        L20:
            android.util.Log.isLoggable(r3, r2)
            return r1
    }

    public int c() throws java.io.IOException {
            r4 = this;
            com.yalantis.ucrop.util.f$b r0 = r4.a
            int r0 = r0.a()
            boolean r0 = d(r0)
            r1 = 3
            java.lang.String r2 = "ImageHeaderParser"
            r3 = -1
            if (r0 != 0) goto L14
            android.util.Log.isLoggable(r2, r1)
            return r3
        L14:
            int r0 = r4.f()
            if (r0 != r3) goto L1e
            android.util.Log.isLoggable(r2, r1)
            return r3
        L1e:
            byte[] r1 = new byte[r0]
            int r0 = r4.h(r1, r0)
            return r0
    }
}
