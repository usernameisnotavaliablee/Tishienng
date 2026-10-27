package com.bumptech.glide.load.resource.drawable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class d extends com.bumptech.glide.load.resource.drawable.b<android.graphics.drawable.Drawable> {
    private d(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @androidx.annotation.Nullable
    static com.bumptech.glide.load.engine.u<android.graphics.drawable.Drawable> c(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            if (r1 == 0) goto L8
            com.bumptech.glide.load.resource.drawable.d r0 = new com.bumptech.glide.load.resource.drawable.d
            r0.<init>(r1)
            return r0
        L8:
            r1 = 0
            return r1
    }

    @Override // com.bumptech.glide.load.engine.u
    @androidx.annotation.NonNull
    public java.lang.Class<android.graphics.drawable.Drawable> a() {
            r1 = this;
            T extends android.graphics.drawable.Drawable r0 = r1.a
            java.lang.Class r0 = r0.getClass()
            return r0
    }

    @Override // com.bumptech.glide.load.engine.u
    public int getSize() {
            r2 = this;
            T extends android.graphics.drawable.Drawable r0 = r2.a
            int r0 = r0.getIntrinsicWidth()
            T extends android.graphics.drawable.Drawable r1 = r2.a
            int r1 = r1.getIntrinsicHeight()
            int r0 = r0 * r1
            int r0 = r0 * 4
            r1 = 1
            int r0 = java.lang.Math.max(r1, r0)
            return r0
    }

    @Override // com.bumptech.glide.load.engine.u
    public void recycle() {
            r0 = this;
            return
    }
}
