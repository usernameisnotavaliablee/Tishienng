package com.google.mlkit.vision.common.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class ImageUtils {
    private static final com.google.android.gms.common.internal.GmsLogger zza = null;
    private static final com.google.mlkit.vision.common.internal.ImageUtils zzb = null;

    static {
            com.google.android.gms.common.internal.GmsLogger r0 = new com.google.android.gms.common.internal.GmsLogger
            java.lang.String r1 = "MLKitImageUtils"
            java.lang.String r2 = ""
            r0.<init>(r1, r2)
            com.google.mlkit.vision.common.internal.ImageUtils.zza = r0
            com.google.mlkit.vision.common.internal.ImageUtils r0 = new com.google.mlkit.vision.common.internal.ImageUtils
            r0.<init>()
            com.google.mlkit.vision.common.internal.ImageUtils.zzb = r0
            return
    }

    private ImageUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.mlkit.vision.common.internal.ImageUtils getInstance() {
            com.google.mlkit.vision.common.internal.ImageUtils r0 = com.google.mlkit.vision.common.internal.ImageUtils.zzb
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public com.google.android.gms.dynamic.IObjectWrapper getImageDataWrapper(@androidx.annotation.NonNull com.google.mlkit.vision.common.InputImage r4) throws com.google.mlkit.common.MlKitException {
            r3 = this;
            int r0 = r4.getFormat()
            r1 = -1
            if (r0 == r1) goto L49
            r1 = 17
            if (r0 == r1) goto L3a
            r1 = 35
            if (r0 == r1) goto L31
            r1 = 842094169(0x32315659, float:1.0322389E-8)
            if (r0 != r1) goto L15
            goto L3a
        L15:
            com.google.mlkit.common.MlKitException r0 = new com.google.mlkit.common.MlKitException
            int r4 = r4.getFormat()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unsupported image format: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r1 = 3
            r0.<init>(r4, r1)
            throw r0
        L31:
            android.media.Image r4 = r4.getMediaImage()
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r4)
            return r4
        L3a:
            java.nio.ByteBuffer r4 = r4.getByteBuffer()
            java.lang.Object r4 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r4)
            return r4
        L49:
            android.graphics.Bitmap r4 = r4.getBitmapInternal()
            java.lang.Object r4 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r4)
            return r4
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public int getMobileVisionImageFormat(@androidx.annotation.NonNull com.google.mlkit.vision.common.InputImage r1) {
            r0 = this;
            int r1 = r1.getFormat()
            return r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public int getMobileVisionImageSize(@androidx.annotation.NonNull com.google.mlkit.vision.common.InputImage r4) {
            r3 = this;
            int r0 = r4.getFormat()
            r1 = -1
            if (r0 != r1) goto L16
            android.graphics.Bitmap r4 = r4.getBitmapInternal()
            java.lang.Object r4 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            int r4 = r4.getAllocationByteCount()
            return r4
        L16:
            int r0 = r4.getFormat()
            r1 = 17
            if (r0 == r1) goto L4b
            int r0 = r4.getFormat()
            r1 = 842094169(0x32315659, float:1.0322389E-8)
            if (r0 != r1) goto L28
            goto L4b
        L28:
            int r0 = r4.getFormat()
            r1 = 35
            r2 = 0
            if (r0 == r1) goto L32
            return r2
        L32:
            android.media.Image$Plane[] r4 = r4.getPlanes()
            java.lang.Object r4 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            android.media.Image$Plane[] r4 = (android.media.Image.Plane[]) r4
            r4 = r4[r2]
            java.nio.ByteBuffer r4 = r4.getBuffer()
            int r4 = r4.limit()
            int r4 = r4 * 3
            int r4 = r4 / 2
            return r4
        L4b:
            java.nio.ByteBuffer r4 = r4.getByteBuffer()
            java.lang.Object r4 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            int r4 = r4.limit()
            return r4
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public android.graphics.Matrix getUprightRotationMatrix(int r5, int r6, int r7) {
            r4 = this;
            if (r7 != 0) goto L4
            r5 = 0
            return r5
        L4:
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            int r1 = -r5
            int r2 = -r6
            float r2 = (float) r2
            float r1 = (float) r1
            r3 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r3
            float r2 = r2 / r3
            r0.postTranslate(r1, r2)
            int r1 = r7 * 90
            float r1 = (float) r1
            r0.postRotate(r1)
            int r7 = r7 % 2
            if (r7 == 0) goto L20
            r1 = r6
            goto L21
        L20:
            r1 = r5
        L21:
            if (r7 != 0) goto L24
            r5 = r6
        L24:
            float r6 = (float) r1
            float r6 = r6 / r3
            float r5 = (float) r5
            float r5 = r5 / r3
            r0.postTranslate(r6, r5)
            return r0
    }

    @androidx.annotation.NonNull
    public final android.graphics.Bitmap zza(@androidx.annotation.NonNull android.content.ContentResolver r11, @androidx.annotation.NonNull android.net.Uri r12) throws java.io.IOException {
            r10 = this;
            java.lang.String r1 = "MLKitImageUtils"
            java.lang.Class<java.lang.Throwable> r2 = java.lang.Throwable.class
            android.graphics.Bitmap r3 = android.provider.MediaStore.Images.Media.getBitmap(r11, r12)     // Catch: java.io.FileNotFoundException -> L25
            if (r3 == 0) goto Lcb
            java.lang.String r0 = "content"
            java.lang.String r4 = r12.getScheme()     // Catch: java.io.FileNotFoundException -> L25
            boolean r0 = r0.equals(r4)     // Catch: java.io.FileNotFoundException -> L25
            r4 = 0
            r5 = 0
            if (r0 != 0) goto L29
            java.lang.String r0 = "file"
            java.lang.String r6 = r12.getScheme()     // Catch: java.io.FileNotFoundException -> L25
            boolean r0 = r0.equals(r6)     // Catch: java.io.FileNotFoundException -> L25
            if (r0 != 0) goto L29
            goto L77
        L25:
            r0 = move-exception
            r11 = r0
            goto Ld3
        L29:
            r6 = 1
            java.io.InputStream r11 = r11.openInputStream(r12)     // Catch: java.io.IOException -> L51
            if (r11 == 0) goto L54
            androidx.exifinterface.media.ExifInterface r0 = new androidx.exifinterface.media.ExifInterface     // Catch: java.lang.Throwable -> L37
            r0.<init>(r11)     // Catch: java.lang.Throwable -> L37
            r2 = r0
            goto L55
        L37:
            r0 = move-exception
            r7 = r0
            r11.close()     // Catch: java.lang.Throwable -> L3d
            goto L50
        L3d:
            r0 = move-exception
            r11 = r0
            java.lang.String r0 = "addSuppressed"
            java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch: java.lang.Exception -> L50
            r8[r4] = r2     // Catch: java.lang.Exception -> L50
            java.lang.reflect.Method r0 = r2.getDeclaredMethod(r0, r8)     // Catch: java.lang.Exception -> L50
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L50
            r2[r4] = r11     // Catch: java.lang.Exception -> L50
            r0.invoke(r7, r2)     // Catch: java.lang.Exception -> L50
        L50:
            throw r7     // Catch: java.io.IOException -> L51
        L51:
            r0 = move-exception
            r11 = r0
            goto L5e
        L54:
            r2 = r5
        L55:
            if (r11 == 0) goto L6e
            r11.close()     // Catch: java.io.IOException -> L5b
            goto L6e
        L5b:
            r0 = move-exception
            r11 = r0
            goto L5f
        L5e:
            r2 = r5
        L5f:
            com.google.android.gms.common.internal.GmsLogger r0 = com.google.mlkit.vision.common.internal.ImageUtils.zza     // Catch: java.io.FileNotFoundException -> L25
            java.lang.String r7 = java.lang.String.valueOf(r12)     // Catch: java.io.FileNotFoundException -> L25
            java.lang.String r8 = "failed to open file to read rotation meta data: "
            java.lang.String r7 = r8.concat(r7)     // Catch: java.io.FileNotFoundException -> L25
            r0.e(r1, r7, r11)     // Catch: java.io.FileNotFoundException -> L25
        L6e:
            if (r2 != 0) goto L71
            goto L77
        L71:
            java.lang.String r11 = "Orientation"
            int r4 = r2.getAttributeInt(r11, r6)     // Catch: java.io.FileNotFoundException -> L25
        L77:
            android.graphics.Matrix r11 = new android.graphics.Matrix     // Catch: java.io.FileNotFoundException -> L25
            r11.<init>()     // Catch: java.io.FileNotFoundException -> L25
            int r6 = r3.getWidth()     // Catch: java.io.FileNotFoundException -> L25
            int r7 = r3.getHeight()     // Catch: java.io.FileNotFoundException -> L25
            r0 = 1119092736(0x42b40000, float:90.0)
            r2 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            switch(r4) {
                case 2: goto Lb2;
                case 3: goto Lab;
                case 4: goto La7;
                case 5: goto La0;
                case 6: goto L9c;
                case 7: goto L95;
                case 8: goto L91;
                default: goto L8f;
            }     // Catch: java.io.FileNotFoundException -> L25
        L8f:
            r8 = r5
            goto Lbb
        L91:
            r11.postRotate(r2)     // Catch: java.io.FileNotFoundException -> L25
            goto Lb0
        L95:
            r11.postRotate(r2)     // Catch: java.io.FileNotFoundException -> L25
            r11.postScale(r9, r8)     // Catch: java.io.FileNotFoundException -> L25
            goto Lb0
        L9c:
            r11.postRotate(r0)     // Catch: java.io.FileNotFoundException -> L25
            goto Lb0
        La0:
            r11.postRotate(r0)     // Catch: java.io.FileNotFoundException -> L25
            r11.postScale(r9, r8)     // Catch: java.io.FileNotFoundException -> L25
            goto Lb0
        La7:
            r11.postScale(r8, r9)     // Catch: java.io.FileNotFoundException -> L25
            goto Lb0
        Lab:
            r0 = 1127481344(0x43340000, float:180.0)
            r11.postRotate(r0)     // Catch: java.io.FileNotFoundException -> L25
        Lb0:
            r8 = r11
            goto Lbb
        Lb2:
            android.graphics.Matrix r5 = new android.graphics.Matrix     // Catch: java.io.FileNotFoundException -> L25
            r5.<init>()     // Catch: java.io.FileNotFoundException -> L25
            r5.postScale(r9, r8)     // Catch: java.io.FileNotFoundException -> L25
            goto L8f
        Lbb:
            if (r8 == 0) goto Lca
            r5 = 0
            r9 = 1
            r4 = 0
            android.graphics.Bitmap r11 = android.graphics.Bitmap.createBitmap(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.io.FileNotFoundException -> L25
            if (r3 == r11) goto Lca
            r3.recycle()     // Catch: java.io.FileNotFoundException -> L25
            r3 = r11
        Lca:
            return r3
        Lcb:
            java.io.IOException r11 = new java.io.IOException     // Catch: java.io.FileNotFoundException -> L25
            java.lang.String r0 = "The image Uri could not be resolved."
            r11.<init>(r0)     // Catch: java.io.FileNotFoundException -> L25
            throw r11     // Catch: java.io.FileNotFoundException -> L25
        Ld3:
            com.google.android.gms.common.internal.GmsLogger r0 = com.google.mlkit.vision.common.internal.ImageUtils.zza
            java.lang.String r12 = java.lang.String.valueOf(r12)
            java.lang.String r2 = "Could not open file: "
            java.lang.String r12 = r2.concat(r12)
            r0.e(r1, r12, r11)
            throw r11
    }
}
