package com.google.mlkit.vision.common.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class CommonConvertUtils {
    public CommonConvertUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.mlkit.vision.common.InputImage convertMlImagetoInputImage(@androidx.annotation.NonNull com.google.android.odml.image.MlImage r13) {
            java.util.List r0 = r13.getContainedImageProperties()
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.google.android.odml.image.ImageProperties r0 = (com.google.android.odml.image.ImageProperties) r0
            int r2 = r0.getStorageType()
            r3 = 1
            if (r2 == r3) goto Lbd
            r3 = 2
            r4 = 0
            if (r2 == r3) goto L6c
            r0 = 3
            if (r2 == r0) goto L1b
            goto Le2
        L1b:
            android.media.Image r2 = com.google.android.odml.image.MediaImageExtractor.extract(r13)
            int r4 = r2.getFormat()
            r5 = 256(0x100, float:3.59E-43)
            if (r4 != r5) goto L37
            android.media.Image$Plane[] r0 = r2.getPlanes()
            r0 = r0[r1]
            java.nio.ByteBuffer r0 = r0.getBuffer()
            int r0 = r0.limit()
        L35:
            r9 = r0
            goto L4a
        L37:
            android.media.Image$Plane[] r4 = r2.getPlanes()
            r1 = r4[r1]
            java.nio.ByteBuffer r1 = r1.getBuffer()
            int r1 = r1.limit()
            int r1 = r1 * 3
            int r0 = r1 / 2
            goto L35
        L4a:
            int r3 = r2.getFormat()
            long r5 = android.os.SystemClock.elapsedRealtime()
            int r7 = r13.getHeight()
            int r8 = r13.getWidth()
            int r10 = r13.getRotation()
            r4 = 5
            zza(r3, r4, r5, r7, r8, r9, r10)
            int r13 = r13.getRotation()
            com.google.mlkit.vision.common.InputImage r4 = com.google.mlkit.vision.common.InputImage.fromMediaImage(r2, r13)
            goto Le2
        L6c:
            java.nio.ByteBuffer r1 = com.google.android.odml.image.ByteBufferExtractor.extract(r13)
            int r0 = r0.getImageFormat()
            r2 = 4
            if (r0 == r2) goto L84
            r2 = 5
            if (r0 == r2) goto L7c
            r0 = r4
            goto L8a
        L7c:
            r0 = 842094169(0x32315659, float:1.0322389E-8)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L8a
        L84:
            r0 = 17
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L8a:
            if (r0 == 0) goto Le2
            int r5 = r0.intValue()
            long r7 = android.os.SystemClock.elapsedRealtime()
            int r9 = r13.getHeight()
            int r10 = r13.getWidth()
            int r11 = r1.limit()
            int r12 = r13.getRotation()
            r6 = 3
            zza(r5, r6, r7, r9, r10, r11, r12)
            int r2 = r13.getWidth()
            int r3 = r13.getHeight()
            int r13 = r13.getRotation()
            int r0 = r0.intValue()
            com.google.mlkit.vision.common.InputImage r4 = com.google.mlkit.vision.common.InputImage.fromByteBuffer(r1, r2, r3, r13, r0)
            goto Le2
        Lbd:
            android.graphics.Bitmap r0 = com.google.android.odml.image.BitmapExtractor.extract(r13)
            long r3 = android.os.SystemClock.elapsedRealtime()
            int r5 = r13.getHeight()
            int r6 = r13.getWidth()
            int r7 = r0.getAllocationByteCount()
            int r8 = r13.getRotation()
            r1 = -1
            r2 = 1
            zza(r1, r2, r3, r5, r6, r7, r8)
            int r13 = r13.getRotation()
            com.google.mlkit.vision.common.InputImage r4 = com.google.mlkit.vision.common.InputImage.fromBitmap(r0, r13)
        Le2:
            if (r4 == 0) goto Le7
            com.google.android.gms.internal.mlkit_vision_common.zzmw.zza()
        Le7:
            return r4
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static int convertToAndroidImageFormat(@com.google.mlkit.vision.common.InputImage.ImageFormat int r1) {
            r0 = 17
            if (r1 == r0) goto Lf
            r0 = 35
            if (r1 == r0) goto Lf
            r0 = 842094169(0x32315659, float:1.0322389E-8)
            if (r1 == r0) goto Lf
            r1 = 0
            return r1
        Lf:
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static int convertToMVRotation(int r3) {
            if (r3 == 0) goto L2b
            r0 = 90
            if (r3 == r0) goto L29
            r0 = 180(0xb4, float:2.52E-43)
            if (r3 == r0) goto L27
            r0 = 270(0x10e, float:3.78E-43)
            if (r3 != r0) goto L10
            r3 = 3
            return r3
        L10:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid rotation: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L27:
            r3 = 2
            return r3
        L29:
            r3 = 1
            return r3
        L2b:
            r3 = 0
            return r3
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void transformPointArray(@androidx.annotation.NonNull android.graphics.Point[] r6, @androidx.annotation.NonNull android.graphics.Matrix r7) {
            int r0 = r6.length
            int r0 = r0 + r0
            float[] r0 = new float[r0]
            r1 = 0
            r2 = 0
        L6:
            int r3 = r6.length
            if (r2 >= r3) goto L1c
            r3 = r6[r2]
            int r4 = r3.x
            float r4 = (float) r4
            int r5 = r2 + r2
            r0[r5] = r4
            int r5 = r5 + 1
            int r3 = r3.y
            float r3 = (float) r3
            r0[r5] = r3
            int r2 = r2 + 1
            goto L6
        L1c:
            r7.mapPoints(r0)
        L1f:
            int r7 = r6.length
            if (r1 >= r7) goto L34
            r7 = r6[r1]
            int r2 = r1 + r1
            r3 = r0[r2]
            int r3 = (int) r3
            int r2 = r2 + 1
            r2 = r0[r2]
            int r2 = (int) r2
            r7.set(r3, r2)
            int r1 = r1 + 1
            goto L1f
        L34:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void transformPointF(@androidx.annotation.NonNull android.graphics.PointF r4, @androidx.annotation.NonNull android.graphics.Matrix r5) {
            float r0 = r4.x
            float r1 = r4.y
            r2 = 2
            float[] r2 = new float[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            r5.mapPoints(r2)
            r5 = r2[r3]
            r0 = r2[r0]
            r4.set(r5, r0)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void transformPointList(@androidx.annotation.NonNull java.util.List<android.graphics.PointF> r5, @androidx.annotation.NonNull android.graphics.Matrix r6) {
            int r0 = r5.size()
            int r0 = r0 + r0
            float[] r0 = new float[r0]
            r1 = 0
            r2 = 0
        L9:
            int r3 = r5.size()
            if (r2 >= r3) goto L2a
            java.lang.Object r3 = r5.get(r2)
            android.graphics.PointF r3 = (android.graphics.PointF) r3
            float r3 = r3.x
            int r4 = r2 + r2
            r0[r4] = r3
            int r4 = r4 + 1
            java.lang.Object r3 = r5.get(r2)
            android.graphics.PointF r3 = (android.graphics.PointF) r3
            float r3 = r3.y
            r0[r4] = r3
            int r2 = r2 + 1
            goto L9
        L2a:
            r6.mapPoints(r0)
        L2d:
            int r6 = r5.size()
            if (r1 >= r6) goto L47
            java.lang.Object r6 = r5.get(r1)
            android.graphics.PointF r6 = (android.graphics.PointF) r6
            int r2 = r1 + r1
            r3 = r0[r2]
            int r2 = r2 + 1
            r2 = r0[r2]
            r6.set(r3, r2)
            int r1 = r1 + 1
            goto L2d
        L47:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void transformRect(@androidx.annotation.NonNull android.graphics.Rect r3, @androidx.annotation.NonNull android.graphics.Matrix r4) {
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r3)
            r4.mapRect(r0)
            float r4 = r0.left
            int r4 = (int) r4
            float r1 = r0.top
            int r1 = (int) r1
            float r2 = r0.right
            int r2 = (int) r2
            float r0 = r0.bottom
            int r0 = (int) r0
            r3.set(r4, r1, r2, r0)
            return
    }

    private static void zza(int r10, int r11, long r12, int r14, int r15, int r16, int r17) {
            java.lang.String r0 = "vision-common"
            com.google.android.gms.internal.mlkit_vision_common.zzmj r1 = com.google.android.gms.internal.mlkit_vision_common.zzms.zzb(r0)
            r2 = r10
            r3 = r11
            r4 = r12
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            com.google.android.gms.internal.mlkit_vision_common.zzmu.zzb(r1, r2, r3, r4, r6, r7, r8, r9)
            return
    }
}
