package com.bumptech.glide.load.engine.bitmap_recycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface e {
    void a(int r1);

    void b();

    void c(float r1);

    void d(android.graphics.Bitmap r1);

    @androidx.annotation.NonNull
    android.graphics.Bitmap e(int r1, int r2, android.graphics.Bitmap.Config r3);

    @androidx.annotation.NonNull
    android.graphics.Bitmap f(int r1, int r2, android.graphics.Bitmap.Config r3);

    long getMaxSize();
}
