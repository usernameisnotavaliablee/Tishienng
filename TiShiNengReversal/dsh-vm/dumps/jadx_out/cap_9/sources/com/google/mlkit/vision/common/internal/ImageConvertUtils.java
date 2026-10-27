package com.google.mlkit.vision.common.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class ImageConvertUtils {
    private static final com.google.mlkit.vision.common.internal.ImageConvertUtils zza = null;

    static {
            com.google.mlkit.vision.common.internal.ImageConvertUtils r0 = new com.google.mlkit.vision.common.internal.ImageConvertUtils
            r0.<init>()
            com.google.mlkit.vision.common.internal.ImageConvertUtils.zza = r0
            return
    }

    private ImageConvertUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static java.nio.ByteBuffer bufferWithBackingArray(@androidx.annotation.NonNull java.nio.ByteBuffer r1) {
            boolean r0 = r1.hasArray()
            if (r0 == 0) goto L7
            return r1
        L7:
            r1.rewind()
            int r0 = r1.limit()
            byte[] r0 = new byte[r0]
            r1.get(r0)
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r0)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.mlkit.vision.common.internal.ImageConvertUtils getInstance() {
            com.google.mlkit.vision.common.internal.ImageConvertUtils r0 = com.google.mlkit.vision.common.internal.ImageConvertUtils.zza
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static android.graphics.Bitmap yv12ToBitmap(@androidx.annotation.NonNull java.nio.ByteBuffer r1, int r2, int r3, int r4) throws com.google.mlkit.common.MlKitException {
            r0 = 1
            java.nio.ByteBuffer r1 = yv12ToNv21Buffer(r1, r0)
            byte[] r1 = r1.array()
            byte[] r1 = zzb(r1, r2, r3)
            int r2 = r1.length
            r3 = 0
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeByteArray(r1, r3, r2)
            int r2 = r1.getWidth()
            int r3 = r1.getHeight()
            android.graphics.Bitmap r1 = zza(r1, r4, r2, r3)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static java.nio.ByteBuffer yv12ToNv21Buffer(@androidx.annotation.NonNull java.nio.ByteBuffer r6, boolean r7) {
            r6.rewind()
            int r0 = r6.limit()
            int r1 = r0 / 6
            if (r7 == 0) goto L10
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocate(r0)
            goto L14
        L10:
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocateDirect(r0)
        L14:
            r0 = 0
            r2 = 0
        L16:
            int r3 = r1 * 4
            if (r2 >= r3) goto L24
            byte r3 = r6.get(r2)
            r7.put(r2, r3)
            int r2 = r2 + 1
            goto L16
        L24:
            int r2 = r1 + r1
            if (r0 >= r2) goto L3c
            int r2 = r3 + r0
            int r4 = r0 % 2
            int r4 = r4 * r1
            int r4 = r4 + r3
            int r5 = r0 / 2
            int r4 = r4 + r5
            byte r4 = r6.get(r4)
            r7.put(r2, r4)
            int r0 = r0 + 1
            goto L24
        L3c:
            return r7
    }

    @androidx.annotation.NonNull
    public static android.graphics.Bitmap zza(@androidx.annotation.NonNull android.graphics.Bitmap r7, int r8, int r9, int r10) {
            if (r8 != 0) goto L8
            r8 = 0
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r7, r8, r8, r9, r10)
            return r7
        L8:
            android.graphics.Matrix r5 = new android.graphics.Matrix
            r5.<init>()
            float r8 = (float) r8
            r5.postRotate(r8)
            r6 = 1
            r1 = 0
            r2 = 0
            r0 = r7
            r3 = r9
            r4 = r10
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    private static byte[] zzb(@androidx.annotation.NonNull byte[] r8, int r9, int r10) throws com.google.mlkit.common.MlKitException {
            java.lang.Class<java.lang.Throwable> r1 = java.lang.Throwable.class
            android.graphics.YuvImage r2 = new android.graphics.YuvImage
            r4 = 17
            r7 = 0
            r3 = r8
            r5 = r9
            r6 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            java.io.ByteArrayOutputStream r8 = new java.io.ByteArrayOutputStream     // Catch: java.io.IOException -> L40
            r8.<init>()     // Catch: java.io.IOException -> L40
            r9 = 0
            android.graphics.Rect r10 = new android.graphics.Rect     // Catch: java.lang.Throwable -> L25
            r10.<init>(r9, r9, r5, r6)     // Catch: java.lang.Throwable -> L25
            r0 = 100
            r2.compressToJpeg(r10, r0, r8)     // Catch: java.lang.Throwable -> L25
            byte[] r9 = r8.toByteArray()     // Catch: java.lang.Throwable -> L25
            r8.close()     // Catch: java.io.IOException -> L40
            return r9
        L25:
            r0 = move-exception
            r10 = r0
            r8.close()     // Catch: java.lang.Throwable -> L2b
            goto L3f
        L2b:
            r0 = move-exception
            r8 = r0
            java.lang.String r0 = "addSuppressed"
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L3f
            r3[r9] = r1     // Catch: java.lang.Exception -> L3f
            java.lang.reflect.Method r0 = r1.getDeclaredMethod(r0, r3)     // Catch: java.lang.Exception -> L3f
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L3f
            r1[r9] = r8     // Catch: java.lang.Exception -> L3f
            r0.invoke(r10, r1)     // Catch: java.lang.Exception -> L3f
        L3f:
            throw r10     // Catch: java.io.IOException -> L40
        L40:
            r0 = move-exception
            r8 = r0
            com.google.mlkit.common.MlKitException r9 = new com.google.mlkit.common.MlKitException
            java.lang.String r10 = "Image conversion error from NV21 format"
            r0 = 13
            r9.<init>(r10, r0, r8)
            throw r9
    }

    private static final void zzc(android.media.Image.Plane r7, int r8, int r9, byte[] r10, int r11, int r12) {
            java.nio.ByteBuffer r0 = r7.getBuffer()
            r0.rewind()
            int r1 = r0.limit()
            int r2 = r7.getRowStride()
            int r1 = r1 + r2
            int r1 = r1 + (-1)
            int r2 = r7.getRowStride()
            int r1 = r1 / r2
            if (r1 != 0) goto L1a
            goto L3c
        L1a:
            int r9 = r9 / r1
            int r8 = r8 / r9
            r9 = 0
            r2 = 0
            r3 = 0
        L1f:
            if (r2 >= r1) goto L3c
            r5 = r3
            r4 = 0
        L23:
            if (r4 >= r8) goto L34
            byte r6 = r0.get(r5)
            r10[r11] = r6
            int r11 = r11 + r12
            int r6 = r7.getPixelStride()
            int r5 = r5 + r6
            int r4 = r4 + 1
            goto L23
        L34:
            int r4 = r7.getRowStride()
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L1f
        L3c:
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public byte[] byteBufferToByteArray(@androidx.annotation.NonNull java.nio.ByteBuffer r4) {
            r3 = this;
            boolean r0 = r4.hasArray()
            if (r0 == 0) goto L11
            int r0 = r4.arrayOffset()
            if (r0 != 0) goto L11
            byte[] r4 = r4.array()
            return r4
        L11:
            r4.rewind()
            int r0 = r4.limit()
            byte[] r1 = new byte[r0]
            r2 = 0
            r4.get(r1, r2, r0)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public java.nio.ByteBuffer cloneByteBuffer(@androidx.annotation.NonNull java.nio.ByteBuffer r4) {
            r3 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            int r0 = r4.capacity()
            int r1 = r4.position()
            boolean r2 = r4.isDirect()
            if (r2 == 0) goto L16
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)
            goto L1a
        L16:
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
        L1a:
            int r2 = r4.limit()
            r0.limit(r2)
            java.nio.Buffer r2 = r4.rewind()
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            r0.put(r2)
            r0.position(r1)
            r4.position(r1)
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public android.graphics.Bitmap convertJpegToUpRightBitmap(@androidx.annotation.NonNull android.media.Image r5, int r6) {
            r4 = this;
            int r0 = r5.getFormat()
            r1 = 256(0x100, float:3.59E-43)
            r2 = 1
            r3 = 0
            if (r0 != r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            java.lang.String r1 = "Only JPEG is supported now"
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
            android.media.Image$Plane[] r5 = r5.getPlanes()
            if (r5 == 0) goto L3e
            int r0 = r5.length
            if (r0 != r2) goto L3e
            r5 = r5[r3]
            java.nio.ByteBuffer r5 = r5.getBuffer()
            r5.rewind()
            int r0 = r5.remaining()
            byte[] r1 = new byte[r0]
            r5.get(r1)
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeByteArray(r1, r3, r0)
            int r0 = r5.getWidth()
            int r1 = r5.getHeight()
            android.graphics.Bitmap r5 = zza(r5, r6, r0, r1)
            return r5
        L3e:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Unexpected image format, JPEG should have exactly 1 image plane"
            r5.<init>(r6)
            throw r5
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public java.nio.ByteBuffer convertToNv21Buffer(@androidx.annotation.NonNull com.google.mlkit.vision.common.InputImage r18, boolean r19) throws com.google.mlkit.common.MlKitException {
            r17 = this;
            r0 = r19
            int r1 = r18.getFormat()
            r2 = -1
            if (r1 == r2) goto L66
            r2 = 17
            if (r1 == r2) goto L48
            r2 = 35
            if (r1 == r2) goto L2f
            r2 = 842094169(0x32315659, float:1.0322389E-8)
            if (r1 != r2) goto L25
            java.nio.ByteBuffer r1 = r18.getByteBuffer()
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            java.nio.ByteBuffer r0 = yv12ToNv21Buffer(r1, r0)
            return r0
        L25:
            com.google.mlkit.common.MlKitException r0 = new com.google.mlkit.common.MlKitException
            java.lang.String r1 = "Unsupported image format"
            r2 = 13
            r0.<init>(r1, r2)
            throw r0
        L2f:
            android.media.Image$Plane[] r0 = r18.getPlanes()
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            android.media.Image$Plane[] r0 = (android.media.Image.Plane[]) r0
            int r1 = r18.getWidth()
            int r2 = r18.getHeight()
            r3 = r17
            java.nio.ByteBuffer r0 = r3.yuv420ThreePlanesToNV21(r0, r1, r2)
            return r0
        L48:
            r3 = r17
            if (r0 == 0) goto L5b
            java.nio.ByteBuffer r0 = r18.getByteBuffer()
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            java.nio.ByteBuffer r0 = bufferWithBackingArray(r0)
            return r0
        L5b:
            java.nio.ByteBuffer r0 = r18.getByteBuffer()
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            return r0
        L66:
            r3 = r17
            android.graphics.Bitmap r1 = r18.getBitmapInternal()
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r2 < r4) goto L8c
            android.graphics.Bitmap$Config r2 = r1.getConfig()
            android.graphics.Bitmap$Config r4 = com.bumptech.glide.load.engine.bitmap_recycle.k.a()
            if (r2 != r4) goto L8c
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            boolean r4 = r1.isMutable()
            android.graphics.Bitmap r1 = r1.copy(r2, r4)
        L8c:
            r4 = r1
            int r7 = r4.getWidth()
            int r11 = r4.getHeight()
            int r1 = r7 * r11
            int[] r5 = new int[r1]
            r8 = 0
            r9 = 0
            r6 = 0
            r10 = r7
            r4.getPixels(r5, r6, r7, r8, r9, r10, r11)
            double r8 = (double) r11
            r12 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r8 = r8 / r12
            double r8 = java.lang.Math.ceil(r8)
            int r2 = (int) r8
            double r8 = (double) r7
            double r8 = r8 / r12
            double r8 = java.lang.Math.ceil(r8)
            int r4 = (int) r8
            int r2 = r2 + r2
            int r2 = r2 * r4
            int r2 = r2 + r1
            if (r0 == 0) goto Lbb
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r2)
            goto Lbf
        Lbb:
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r2)
        Lbf:
            r4 = 0
            r6 = 0
            r8 = 0
        Lc2:
            if (r4 >= r11) goto L12d
            r9 = 0
        Lc5:
            if (r9 >= r7) goto L12a
            r10 = r5[r8]
            int r12 = r10 >> 16
            int r13 = r10 >> 8
            r14 = 255(0xff, float:3.57E-43)
            r10 = r10 & r14
            int r15 = r6 + 1
            r12 = r12 & r14
            r13 = r13 & r14
            int r16 = r12 * 66
            int r2 = r13 * 129
            int r16 = r16 + r2
            int r2 = r10 * 25
            int r2 = r16 + r2
            int r2 = r2 + 128
            int r2 = r2 >> 8
            int r2 = r2 + 16
            int r2 = java.lang.Math.min(r14, r2)
            byte r2 = (byte) r2
            r0.put(r6, r2)
            int r2 = r4 % 2
            if (r2 != 0) goto L124
            int r2 = r8 % 2
            if (r2 != 0) goto L124
            int r2 = r13 * 94
            int r6 = r12 * 112
            int r13 = r13 * 74
            int r12 = r12 * (-38)
            int r6 = r6 - r2
            int r2 = r10 * 18
            int r12 = r12 - r13
            int r10 = r10 * 112
            int r6 = r6 - r2
            int r6 = r6 + 128
            int r12 = r12 + r10
            int r12 = r12 + 128
            int r2 = r6 >> 8
            int r6 = r12 >> 8
            int r2 = r2 + 128
            int r6 = r6 + 128
            int r10 = r1 + 1
            int r2 = java.lang.Math.min(r14, r2)
            byte r2 = (byte) r2
            r0.put(r1, r2)
            int r1 = r1 + 2
            int r2 = java.lang.Math.min(r14, r6)
            byte r2 = (byte) r2
            r0.put(r10, r2)
        L124:
            int r8 = r8 + 1
            int r9 = r9 + 1
            r6 = r15
            goto Lc5
        L12a:
            int r4 = r4 + 1
            goto Lc2
        L12d:
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public android.graphics.Bitmap convertToUpRightBitmap(@androidx.annotation.NonNull com.google.mlkit.vision.common.InputImage r4) throws com.google.mlkit.common.MlKitException {
            r3 = this;
            int r0 = r4.getFormat()
            r1 = -1
            if (r0 == r1) goto L7b
            r1 = 17
            if (r0 == r1) goto L60
            r1 = 35
            if (r0 == r1) goto L39
            r1 = 842094169(0x32315659, float:1.0322389E-8)
            if (r0 != r1) goto L2f
            java.nio.ByteBuffer r0 = r4.getByteBuffer()
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            int r1 = r4.getWidth()
            int r2 = r4.getHeight()
            int r4 = r4.getRotationDegrees()
            android.graphics.Bitmap r4 = yv12ToBitmap(r0, r1, r2, r4)
            return r4
        L2f:
            com.google.mlkit.common.MlKitException r4 = new com.google.mlkit.common.MlKitException
            java.lang.String r0 = "Unsupported image format"
            r1 = 13
            r4.<init>(r0, r1)
            throw r4
        L39:
            android.media.Image$Plane[] r0 = r4.getPlanes()
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            android.media.Image$Plane[] r0 = (android.media.Image.Plane[]) r0
            int r1 = r4.getWidth()
            int r2 = r4.getHeight()
            java.nio.ByteBuffer r0 = r3.yuv420ThreePlanesToNV21(r0, r1, r2)
            int r1 = r4.getWidth()
            int r2 = r4.getHeight()
            int r4 = r4.getRotationDegrees()
            android.graphics.Bitmap r4 = r3.nv21ToBitmap(r0, r1, r2, r4)
            return r4
        L60:
            java.nio.ByteBuffer r0 = r4.getByteBuffer()
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            int r1 = r4.getWidth()
            int r2 = r4.getHeight()
            int r4 = r4.getRotationDegrees()
            android.graphics.Bitmap r4 = r3.nv21ToBitmap(r0, r1, r2, r4)
            return r4
        L7b:
            android.graphics.Bitmap r0 = r4.getBitmapInternal()
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            int r1 = r4.getRotationDegrees()
            int r2 = r4.getWidth()
            int r4 = r4.getHeight()
            android.graphics.Bitmap r4 = zza(r0, r1, r2, r4)
            return r4
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public android.graphics.Bitmap getUpRightBitmap(@androidx.annotation.NonNull com.google.mlkit.vision.common.InputImage r4) throws com.google.mlkit.common.MlKitException {
            r3 = this;
            android.graphics.Bitmap r0 = r4.getBitmapInternal()
            if (r0 == 0) goto L17
            int r1 = r4.getRotationDegrees()
            int r2 = r4.getWidth()
            int r4 = r4.getHeight()
            android.graphics.Bitmap r4 = zza(r0, r1, r2, r4)
            return r4
        L17:
            android.graphics.Bitmap r4 = r3.convertToUpRightBitmap(r4)
            return r4
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public android.graphics.Bitmap nv21ToBitmap(@androidx.annotation.NonNull java.nio.ByteBuffer r1, int r2, int r3, int r4) throws com.google.mlkit.common.MlKitException {
            r0 = this;
            byte[] r1 = r0.byteBufferToByteArray(r1)
            byte[] r1 = zzb(r1, r2, r3)
            int r2 = r1.length
            r3 = 0
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeByteArray(r1, r3, r2)
            int r2 = r1.getWidth()
            int r3 = r1.getHeight()
            android.graphics.Bitmap r1 = zza(r1, r4, r2, r3)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public java.nio.ByteBuffer yuv420ThreePlanesToNV21(@androidx.annotation.NonNull android.media.Image.Plane[] r13, int r14, int r15) {
            r12 = this;
            int r4 = r14 * r15
            int r0 = r4 / 4
            int r0 = r0 + r0
            int r0 = r0 + r4
            byte[] r8 = new byte[r0]
            r0 = 1
            r1 = r13[r0]
            java.nio.ByteBuffer r1 = r1.getBuffer()
            r2 = 2
            r3 = r13[r2]
            java.nio.ByteBuffer r3 = r3.getBuffer()
            int r5 = r3.position()
            int r6 = r1.limit()
            int r7 = r5 + 1
            r3.position(r7)
            int r7 = r6 + (-1)
            r1.limit(r7)
            int r7 = r3.remaining()
            int r9 = r4 + r4
            int r9 = r9 / 4
            int r10 = r9 + (-2)
            r11 = 0
            if (r7 != r10) goto L3d
            int r7 = r3.compareTo(r1)
            if (r7 != 0) goto L3d
            r7 = 1
            goto L3e
        L3d:
            r7 = 0
        L3e:
            r3.position(r5)
            r1.limit(r6)
            if (r7 == 0) goto L65
            r14 = r13[r11]
            java.nio.ByteBuffer r14 = r14.getBuffer()
            r14.get(r8, r11, r4)
            r14 = r13[r0]
            java.nio.ByteBuffer r14 = r14.getBuffer()
            r13 = r13[r2]
            java.nio.ByteBuffer r13 = r13.getBuffer()
            r13.get(r8, r4, r0)
            int r4 = r4 + r0
            int r9 = r9 + (-1)
            r14.get(r8, r4, r9)
            goto L7f
        L65:
            r5 = r13[r11]
            r9 = 0
            r10 = 1
            r6 = r14
            r7 = r15
            zzc(r5, r6, r7, r8, r9, r10)
            r5 = r13[r0]
            int r9 = r4 + 1
            r10 = 2
            zzc(r5, r6, r7, r8, r9, r10)
            r0 = r13[r2]
            r5 = 2
            r1 = r6
            r2 = r7
            r3 = r8
            zzc(r0, r1, r2, r3, r4, r5)
        L7f:
            java.nio.ByteBuffer r13 = java.nio.ByteBuffer.wrap(r8)
            return r13
    }
}
