package com.bumptech.glide.load.resource.bitmap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class e implements com.bumptech.glide.load.h<android.graphics.Bitmap> {
    public static final com.bumptech.glide.load.e<java.lang.Integer> b = null;
    public static final com.bumptech.glide.load.e<android.graphics.Bitmap.CompressFormat> c = null;
    private static final java.lang.String d = "BitmapEncoder";

    @androidx.annotation.Nullable
    private final com.bumptech.glide.load.engine.bitmap_recycle.b a;

    static {
            r0 = 90
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality"
            com.bumptech.glide.load.e r0 = com.bumptech.glide.load.e.g(r1, r0)
            com.bumptech.glide.load.resource.bitmap.e.b = r0
            java.lang.String r0 = "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat"
            com.bumptech.glide.load.e r0 = com.bumptech.glide.load.e.f(r0)
            com.bumptech.glide.load.resource.bitmap.e.c = r0
            return
    }

    @java.lang.Deprecated
    public e() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            return
    }

    public e(@androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.b r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    private android.graphics.Bitmap.CompressFormat d(android.graphics.Bitmap r2, com.bumptech.glide.load.f r3) {
            r1 = this;
            com.bumptech.glide.load.e<android.graphics.Bitmap$CompressFormat> r0 = com.bumptech.glide.load.resource.bitmap.e.c
            java.lang.Object r3 = r3.c(r0)
            android.graphics.Bitmap$CompressFormat r3 = (android.graphics.Bitmap.CompressFormat) r3
            if (r3 == 0) goto Lb
            return r3
        Lb:
            boolean r2 = r2.hasAlpha()
            if (r2 == 0) goto L14
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG
            return r2
        L14:
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG
            return r2
    }

    @Override // com.bumptech.glide.load.a
    public /* bridge */ /* synthetic */ boolean a(@androidx.annotation.NonNull java.lang.Object r1, @androidx.annotation.NonNull java.io.File r2, @androidx.annotation.NonNull com.bumptech.glide.load.f r3) {
            r0 = this;
            com.bumptech.glide.load.engine.u r1 = (com.bumptech.glide.load.engine.u) r1
            boolean r1 = r0.c(r1, r2, r3)
            return r1
    }

    @Override // com.bumptech.glide.load.h
    @androidx.annotation.NonNull
    public com.bumptech.glide.load.EncodeStrategy b(@androidx.annotation.NonNull com.bumptech.glide.load.f r1) {
            r0 = this;
            com.bumptech.glide.load.EncodeStrategy r1 = com.bumptech.glide.load.EncodeStrategy.TRANSFORMED
            return r1
    }

    public boolean c(@androidx.annotation.NonNull com.bumptech.glide.load.engine.u<android.graphics.Bitmap> r8, @androidx.annotation.NonNull java.io.File r9, @androidx.annotation.NonNull com.bumptech.glide.load.f r10) {
            r7 = this;
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r8 = r8.get()
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            android.graphics.Bitmap$CompressFormat r1 = r7.d(r8, r10)
            int r2 = r8.getWidth()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r8.getHeight()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "encode: [%dx%d] %s"
            com.bumptech.glide.util.pool.b.d(r4, r2, r3, r1)
            long r2 = com.bumptech.glide.util.g.b()     // Catch: java.lang.Throwable -> L54
            com.bumptech.glide.load.e<java.lang.Integer> r4 = com.bumptech.glide.load.resource.bitmap.e.b     // Catch: java.lang.Throwable -> L54
            java.lang.Object r4 = r10.c(r4)     // Catch: java.lang.Throwable -> L54
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L54
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L54
            r5 = 0
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            r6.<init>(r9)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            com.bumptech.glide.load.engine.bitmap_recycle.b r9 = r7.a     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L47
            if (r9 == 0) goto L49
            com.bumptech.glide.load.data.c r9 = new com.bumptech.glide.load.data.c     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L47
            com.bumptech.glide.load.engine.bitmap_recycle.b r5 = r7.a     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L47
            r9.<init>(r6, r5)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L47
            r5 = r9
            goto L4a
        L44:
            r8 = move-exception
            r5 = r6
            goto L84
        L47:
            r5 = r6
            goto L5a
        L49:
            r5 = r6
        L4a:
            r8.compress(r1, r4, r5)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            r5.close()     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            r5.close()     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            goto L56
        L54:
            r8 = move-exception
            goto L8a
        L56:
            r9 = 1
            goto L64
        L58:
            r8 = move-exception
            goto L84
        L5a:
            r9 = 3
            android.util.Log.isLoggable(r0, r9)     // Catch: java.lang.Throwable -> L58
            if (r5 == 0) goto L63
            r5.close()     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L63
        L63:
            r9 = 0
        L64:
            r4 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r4)     // Catch: java.lang.Throwable -> L54
            if (r0 == 0) goto L80
            java.util.Objects.toString(r1)     // Catch: java.lang.Throwable -> L54
            com.bumptech.glide.util.l.h(r8)     // Catch: java.lang.Throwable -> L54
            com.bumptech.glide.util.g.a(r2)     // Catch: java.lang.Throwable -> L54
            com.bumptech.glide.load.e<android.graphics.Bitmap$CompressFormat> r0 = com.bumptech.glide.load.resource.bitmap.e.c     // Catch: java.lang.Throwable -> L54
            java.lang.Object r10 = r10.c(r0)     // Catch: java.lang.Throwable -> L54
            java.util.Objects.toString(r10)     // Catch: java.lang.Throwable -> L54
            r8.hasAlpha()     // Catch: java.lang.Throwable -> L54
        L80:
            com.bumptech.glide.util.pool.b.e()
            return r9
        L84:
            if (r5 == 0) goto L89
            r5.close()     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L89
        L89:
            throw r8     // Catch: java.lang.Throwable -> L54
        L8a:
            com.bumptech.glide.util.pool.b.e()
            throw r8
    }
}
