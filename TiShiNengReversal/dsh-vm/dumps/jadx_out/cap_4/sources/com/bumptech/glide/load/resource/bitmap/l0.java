package com.bumptech.glide.load.resource.bitmap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class l0 implements com.bumptech.glide.load.g<android.graphics.Bitmap, android.graphics.Bitmap> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class a implements com.bumptech.glide.load.engine.u<android.graphics.Bitmap> {
        private final android.graphics.Bitmap a;

        a(@androidx.annotation.NonNull android.graphics.Bitmap r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        @Override // com.bumptech.glide.load.engine.u
        @androidx.annotation.NonNull
        public java.lang.Class<android.graphics.Bitmap> a() {
                r1 = this;
                java.lang.Class<android.graphics.Bitmap> r0 = android.graphics.Bitmap.class
                return r0
        }

        @androidx.annotation.NonNull
        public android.graphics.Bitmap b() {
                r1 = this;
                android.graphics.Bitmap r0 = r1.a
                return r0
        }

        @Override // com.bumptech.glide.load.engine.u
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ android.graphics.Bitmap get() {
                r1 = this;
                android.graphics.Bitmap r0 = r1.b()
                return r0
        }

        @Override // com.bumptech.glide.load.engine.u
        public int getSize() {
                r1 = this;
                android.graphics.Bitmap r0 = r1.a
                int r0 = com.bumptech.glide.util.l.h(r0)
                return r0
        }

        @Override // com.bumptech.glide.load.engine.u
        public void recycle() {
                r0 = this;
                return
        }
    }

    public l0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bumptech.glide.load.g
    public /* bridge */ /* synthetic */ boolean a(@androidx.annotation.NonNull android.graphics.Bitmap r1, @androidx.annotation.NonNull com.bumptech.glide.load.f r2) throws java.io.IOException {
            r0 = this;
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            boolean r1 = r0.d(r1, r2)
            return r1
    }

    @Override // com.bumptech.glide.load.g
    public /* bridge */ /* synthetic */ com.bumptech.glide.load.engine.u<android.graphics.Bitmap> b(@androidx.annotation.NonNull android.graphics.Bitmap r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.f r4) throws java.io.IOException {
            r0 = this;
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            com.bumptech.glide.load.engine.u r1 = r0.c(r1, r2, r3, r4)
            return r1
    }

    public com.bumptech.glide.load.engine.u<android.graphics.Bitmap> c(@androidx.annotation.NonNull android.graphics.Bitmap r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.f r4) {
            r0 = this;
            com.bumptech.glide.load.resource.bitmap.l0$a r2 = new com.bumptech.glide.load.resource.bitmap.l0$a
            r2.<init>(r1)
            return r2
    }

    public boolean d(@androidx.annotation.NonNull android.graphics.Bitmap r1, @androidx.annotation.NonNull com.bumptech.glide.load.f r2) {
            r0 = this;
            r1 = 1
            return r1
    }
}
