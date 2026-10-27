package com.google.mlkit.vision.mediapipe.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class ImageConvertNativeUtils {
    private ImageConvertNativeUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.android.apps.common.proguard.UsedByNative("image_native_utils_jni.cc")
    private static native byte[] byteArrayToRgb(byte[] r0, int r1, int r2, int r3, @com.google.mlkit.vision.common.InputImage.ImageFormat int r4);

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public static byte[] getRgbBuffer(@androidx.annotation.NonNull com.google.mlkit.vision.common.InputImage r13) throws com.google.mlkit.common.MlKitException {
            java.lang.String r0 = "ImageConvertNativeUtils#getRgbBuffer"
            com.google.android.gms.internal.mlkit_vision_mediapipe.zziq r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zziq.zze(r0)
            r1.zzb()
            java.nio.ByteBuffer r0 = r13.getByteBuffer()     // Catch: java.lang.Throwable -> L21
            if (r0 == 0) goto L42
            int r2 = r13.getFormat()     // Catch: java.lang.Throwable -> L21
            r3 = 17
            if (r2 == r3) goto L25
            int r2 = r13.getFormat()     // Catch: java.lang.Throwable -> L21
            r3 = 842094169(0x32315659, float:1.0322389E-8)
            if (r2 != r3) goto L42
            goto L25
        L21:
            r0 = move-exception
            r13 = r0
            goto La6
        L25:
            com.google.mlkit.vision.common.internal.ImageConvertUtils r2 = com.google.mlkit.vision.common.internal.ImageConvertUtils.getInstance()     // Catch: java.lang.Throwable -> L21
            byte[] r0 = r2.byteBufferToByteArray(r0)     // Catch: java.lang.Throwable -> L21
            int r2 = r13.getWidth()     // Catch: java.lang.Throwable -> L21
            int r3 = r13.getHeight()     // Catch: java.lang.Throwable -> L21
            int r4 = r13.getRotationDegrees()     // Catch: java.lang.Throwable -> L21
            int r13 = r13.getFormat()     // Catch: java.lang.Throwable -> L21
            byte[] r13 = byteArrayToRgb(r0, r2, r3, r4, r13)     // Catch: java.lang.Throwable -> L21
            goto La2
        L42:
            int r0 = r13.getFormat()     // Catch: java.lang.Throwable -> L21
            r2 = 35
            r3 = 0
            if (r0 != r2) goto La1
            android.media.Image$Plane[] r0 = r13.getPlanes()     // Catch: java.lang.Throwable -> L21
            if (r0 == 0) goto La1
            android.media.Image$Plane[] r0 = r13.getPlanes()     // Catch: java.lang.Throwable -> L21
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch: java.lang.Throwable -> L21
            android.media.Image$Plane[] r0 = (android.media.Image.Plane[]) r0     // Catch: java.lang.Throwable -> L21
            int r0 = r0.length     // Catch: java.lang.Throwable -> L21
            r2 = 3
            if (r0 != r2) goto La1
            android.media.Image$Plane[] r0 = r13.getPlanes()     // Catch: java.lang.Throwable -> L21
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch: java.lang.Throwable -> L21
            android.media.Image$Plane[] r0 = (android.media.Image.Plane[]) r0     // Catch: java.lang.Throwable -> L21
            r2 = 0
            r3 = r0[r2]     // Catch: java.lang.Throwable -> L21
            java.nio.ByteBuffer r4 = r3.getBuffer()     // Catch: java.lang.Throwable -> L21
            r3 = 1
            r5 = r0[r3]     // Catch: java.lang.Throwable -> L21
            java.nio.ByteBuffer r5 = r5.getBuffer()     // Catch: java.lang.Throwable -> L21
            r6 = 2
            r6 = r0[r6]     // Catch: java.lang.Throwable -> L21
            java.nio.ByteBuffer r6 = r6.getBuffer()     // Catch: java.lang.Throwable -> L21
            int r7 = r13.getWidth()     // Catch: java.lang.Throwable -> L21
            int r8 = r13.getHeight()     // Catch: java.lang.Throwable -> L21
            r2 = r0[r2]     // Catch: java.lang.Throwable -> L21
            int r9 = r2.getRowStride()     // Catch: java.lang.Throwable -> L21
            r2 = r0[r3]     // Catch: java.lang.Throwable -> L21
            int r10 = r2.getRowStride()     // Catch: java.lang.Throwable -> L21
            r0 = r0[r3]     // Catch: java.lang.Throwable -> L21
            int r11 = r0.getPixelStride()     // Catch: java.lang.Throwable -> L21
            int r12 = r13.getRotationDegrees()     // Catch: java.lang.Throwable -> L21
            byte[] r13 = yuvPlanesToRgb(r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L21
            goto La2
        La1:
            r13 = r3
        La2:
            r1.close()
            return r13
        La6:
            r1.close()     // Catch: java.lang.Throwable -> Laa
            goto Lae
        Laa:
            r0 = move-exception
            r13.addSuppressed(r0)
        Lae:
            throw r13
    }

    @com.google.android.apps.common.proguard.UsedByNative("image_native_utils_jni.cc")
    private static native byte[] yuvPlanesToRgb(java.nio.ByteBuffer r0, java.nio.ByteBuffer r1, java.nio.ByteBuffer r2, int r3, int r4, int r5, int r6, int r7, int r8);
}
