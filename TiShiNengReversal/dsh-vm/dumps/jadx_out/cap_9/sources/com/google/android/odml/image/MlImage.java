package com.google.android.odml.image;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class MlImage implements java.io.Closeable {
    public static final int IMAGE_FORMAT_ALPHA = 8;
    public static final int IMAGE_FORMAT_JPEG = 9;
    public static final int IMAGE_FORMAT_NV12 = 3;
    public static final int IMAGE_FORMAT_NV21 = 4;
    public static final int IMAGE_FORMAT_RGB = 2;
    public static final int IMAGE_FORMAT_RGBA = 1;
    public static final int IMAGE_FORMAT_UNKNOWN = 0;
    public static final int IMAGE_FORMAT_YUV_420_888 = 7;
    public static final int IMAGE_FORMAT_YV12 = 5;
    public static final int IMAGE_FORMAT_YV21 = 6;
    public static final int STORAGE_TYPE_BITMAP = 1;
    public static final int STORAGE_TYPE_BYTEBUFFER = 2;
    public static final int STORAGE_TYPE_MEDIA_IMAGE = 3;
    private final com.google.android.odml.image.zzg zza;
    private final int zzb;
    private final android.graphics.Rect zzc;
    private final int zzd;
    private final int zze;
    private int zzf;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ImageFormat {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Internal {
        private final com.google.android.odml.image.MlImage zza;

        /* synthetic */ Internal(com.google.android.odml.image.MlImage r1, com.google.android.odml.image.zzj r2) {
                r0 = this;
                r0.<init>()
                r0.zza = r1
                return
        }

        public void acquire() {
                r1 = this;
                com.google.android.odml.image.MlImage r0 = r1.zza
                com.google.android.odml.image.MlImage.zzb(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface StorageType {
    }

    MlImage(com.google.android.odml.image.zzg r1, int r2, android.graphics.Rect r3, long r4, int r6, int r7) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.zzc = r1
            r1.set(r3)
            r0.zzd = r6
            r0.zze = r7
            r1 = 1
            r0.zzf = r1
            return
    }

    static /* synthetic */ void zzb(com.google.android.odml.image.MlImage r0) {
            r0.zzd()
            return
    }

    static void zzc(int r3) {
            if (r3 == 0) goto L2d
            r0 = 90
            if (r3 == r0) goto L2d
            r0 = 180(0xb4, float:2.52E-43)
            if (r3 == r0) goto L2d
            r0 = 270(0x10e, float:3.78E-43)
            if (r3 != r0) goto Lf
            goto L2d
        Lf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 68
            r1.<init>(r2)
            java.lang.String r2 = "Rotation value "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " is not valid. Use only 0, 90, 180 or 270."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L2d:
            return
    }

    private final synchronized void zzd() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.zzf     // Catch: java.lang.Throwable -> L9
            int r0 = r0 + 1
            r1.zzf = r0     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return
        L9:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.zzf     // Catch: java.lang.Throwable -> L10
            int r0 = r0 + (-1)
            r1.zzf = r0     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto L12
            com.google.android.odml.image.zzg r0 = r1.zza     // Catch: java.lang.Throwable -> L10
            r0.zzc()     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)
            return
        L10:
            r0 = move-exception
            goto L14
        L12:
            monitor-exit(r1)
            return
        L14:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r0
    }

    @androidx.annotation.NonNull
    public java.util.List<com.google.android.odml.image.ImageProperties> getContainedImageProperties() {
            r1 = this;
            com.google.android.odml.image.zzg r0 = r1.zza
            com.google.android.odml.image.ImageProperties r0 = r0.zzb()
            java.util.List r0 = java.util.Collections.singletonList(r0)
            return r0
    }

    public int getHeight() {
            r1 = this;
            int r0 = r1.zze
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.odml.image.MlImage.Internal getInternal() {
            r2 = this;
            com.google.android.odml.image.MlImage$Internal r0 = new com.google.android.odml.image.MlImage$Internal
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public int getRotation() {
            r1 = this;
            int r0 = r1.zzb
            return r0
    }

    public int getWidth() {
            r1 = this;
            int r0 = r1.zzd
            return r0
    }

    final com.google.android.odml.image.zzg zza() {
            r1 = this;
            com.google.android.odml.image.zzg r0 = r1.zza
            return r0
    }
}
