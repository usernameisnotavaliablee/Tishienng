package com.bumptech.glide.load.engine.bitmap_recycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class f implements com.bumptech.glide.load.engine.bitmap_recycle.e {
    public f() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public void a(int r1) {
            r0 = this;
            return
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public void b() {
            r0 = this;
            return
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public void c(float r1) {
            r0 = this;
            return
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public void d(android.graphics.Bitmap r1) {
            r0 = this;
            r1.recycle()
            return
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    @androidx.annotation.NonNull
    public android.graphics.Bitmap e(int r1, int r2, android.graphics.Bitmap.Config r3) {
            r0 = this;
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r1, r2, r3)
            return r1
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    @androidx.annotation.NonNull
    public android.graphics.Bitmap f(int r1, int r2, android.graphics.Bitmap.Config r3) {
            r0 = this;
            android.graphics.Bitmap r1 = r0.e(r1, r2, r3)
            return r1
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public long getMaxSize() {
            r2 = this;
            r0 = 0
            return r0
    }
}
