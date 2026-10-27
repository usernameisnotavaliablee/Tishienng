package com.bumptech.glide.load.engine.bitmap_recycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
interface m {
    java.lang.String a(int r1, int r2, android.graphics.Bitmap.Config r3);

    int b(android.graphics.Bitmap r1);

    java.lang.String c(android.graphics.Bitmap r1);

    void d(android.graphics.Bitmap r1);

    @androidx.annotation.Nullable
    android.graphics.Bitmap e(int r1, int r2, android.graphics.Bitmap.Config r3);

    @androidx.annotation.Nullable
    android.graphics.Bitmap removeLast();
}
