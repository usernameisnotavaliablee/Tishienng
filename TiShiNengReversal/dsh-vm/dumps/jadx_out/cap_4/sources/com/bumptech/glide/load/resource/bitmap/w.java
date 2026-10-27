package com.bumptech.glide.load.resource.bitmap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class w implements com.bumptech.glide.load.i<android.graphics.drawable.Drawable> {
    private final com.bumptech.glide.load.i<android.graphics.Bitmap> c;
    private final boolean d;

    public w(com.bumptech.glide.load.i<android.graphics.Bitmap> r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.c = r1
            r0.d = r2
            return
    }

    private com.bumptech.glide.load.engine.u<android.graphics.drawable.Drawable> d(android.content.Context r1, com.bumptech.glide.load.engine.u<android.graphics.Bitmap> r2) {
            r0 = this;
            android.content.res.Resources r1 = r1.getResources()
            com.bumptech.glide.load.engine.u r1 = com.bumptech.glide.load.resource.bitmap.d0.c(r1, r2)
            return r1
    }

    @Override // com.bumptech.glide.load.i
    @androidx.annotation.NonNull
    public com.bumptech.glide.load.engine.u<android.graphics.drawable.Drawable> a(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.NonNull com.bumptech.glide.load.engine.u<android.graphics.drawable.Drawable> r4, int r5, int r6) {
            r2 = this;
            com.bumptech.glide.b r0 = com.bumptech.glide.b.e(r3)
            com.bumptech.glide.load.engine.bitmap_recycle.e r0 = r0.h()
            java.lang.Object r1 = r4.get()
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            com.bumptech.glide.load.engine.u r0 = com.bumptech.glide.load.resource.bitmap.v.a(r0, r1, r5, r6)
            if (r0 != 0) goto L35
            boolean r3 = r2.d
            if (r3 != 0) goto L19
            return r4
        L19:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Unable to convert "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r5 = " to a Bitmap"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L35:
            com.bumptech.glide.load.i<android.graphics.Bitmap> r1 = r2.c
            com.bumptech.glide.load.engine.u r5 = r1.a(r3, r0, r5, r6)
            boolean r6 = r5.equals(r0)
            if (r6 == 0) goto L45
            r5.recycle()
            return r4
        L45:
            com.bumptech.glide.load.engine.u r3 = r2.d(r3, r5)
            return r3
    }

    @Override // com.bumptech.glide.load.c
    public void b(@androidx.annotation.NonNull java.security.MessageDigest r2) {
            r1 = this;
            com.bumptech.glide.load.i<android.graphics.Bitmap> r0 = r1.c
            r0.b(r2)
            return
    }

    public com.bumptech.glide.load.i<android.graphics.drawable.BitmapDrawable> c() {
            r0 = this;
            return r0
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.bumptech.glide.load.resource.bitmap.w
            if (r0 == 0) goto Lf
            com.bumptech.glide.load.resource.bitmap.w r2 = (com.bumptech.glide.load.resource.bitmap.w) r2
            com.bumptech.glide.load.i<android.graphics.Bitmap> r0 = r1.c
            com.bumptech.glide.load.i<android.graphics.Bitmap> r2 = r2.c
            boolean r2 = r0.equals(r2)
            return r2
        Lf:
            r2 = 0
            return r2
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
            r1 = this;
            com.bumptech.glide.load.i<android.graphics.Bitmap> r0 = r1.c
            int r0 = r0.hashCode()
            return r0
    }
}
