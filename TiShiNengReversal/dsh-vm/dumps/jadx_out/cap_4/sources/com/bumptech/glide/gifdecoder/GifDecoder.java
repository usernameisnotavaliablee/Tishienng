package com.bumptech.glide.gifdecoder;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface GifDecoder {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface GifDecodeStatus {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        @androidx.annotation.NonNull
        byte[] a(int r1);

        @androidx.annotation.NonNull
        android.graphics.Bitmap b(int r1, int r2, @androidx.annotation.NonNull android.graphics.Bitmap.Config r3);

        void c(@androidx.annotation.NonNull android.graphics.Bitmap r1);

        @androidx.annotation.NonNull
        int[] d(int r1);

        void e(@androidx.annotation.NonNull byte[] r1);

        void f(@androidx.annotation.NonNull int[] r1);
    }

    void a(@androidx.annotation.NonNull android.graphics.Bitmap.Config r1);

    @java.lang.Deprecated
    int b();

    void c(@androidx.annotation.NonNull com.bumptech.glide.gifdecoder.b r1, @androidx.annotation.NonNull byte[] r2);

    void clear();

    void d();

    int e();

    int f(@androidx.annotation.Nullable java.io.InputStream r1, int r2);

    int g();

    @androidx.annotation.NonNull
    java.nio.ByteBuffer getData();

    int getHeight();

    int getStatus();

    int getWidth();

    @androidx.annotation.Nullable
    android.graphics.Bitmap h();

    void i();

    int j();

    int k(int r1);

    int l();

    int m();

    void n(@androidx.annotation.NonNull com.bumptech.glide.gifdecoder.b r1, @androidx.annotation.NonNull java.nio.ByteBuffer r2);

    void o(@androidx.annotation.NonNull com.bumptech.glide.gifdecoder.b r1, @androidx.annotation.NonNull java.nio.ByteBuffer r2, int r3);

    int p();

    int read(@androidx.annotation.Nullable byte[] r1);
}
