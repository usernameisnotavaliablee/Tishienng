package com.bumptech.glide.load.resource.bitmap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class d implements com.bumptech.glide.load.i<android.graphics.drawable.BitmapDrawable> {
    private final com.bumptech.glide.load.i<android.graphics.drawable.Drawable> c;

    public d(com.bumptech.glide.load.i<android.graphics.Bitmap> r3) {
            r2 = this;
            r2.<init>()
            com.bumptech.glide.load.resource.bitmap.w r0 = new com.bumptech.glide.load.resource.bitmap.w
            r1 = 0
            r0.<init>(r3, r1)
            java.lang.Object r3 = com.bumptech.glide.util.k.d(r0)
            com.bumptech.glide.load.i r3 = (com.bumptech.glide.load.i) r3
            r2.c = r3
            return
    }

    private static com.bumptech.glide.load.engine.u<android.graphics.drawable.BitmapDrawable> c(com.bumptech.glide.load.engine.u<android.graphics.drawable.Drawable> r3) {
            java.lang.Object r0 = r3.get()
            boolean r0 = r0 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto L9
            return r3
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Wrapped transformation unexpectedly returned a non BitmapDrawable resource: "
            r1.append(r2)
            java.lang.Object r3 = r3.get()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    private static com.bumptech.glide.load.engine.u<android.graphics.drawable.Drawable> d(com.bumptech.glide.load.engine.u<android.graphics.drawable.BitmapDrawable> r0) {
            return r0
    }

    @Override // com.bumptech.glide.load.i
    @androidx.annotation.NonNull
    public com.bumptech.glide.load.engine.u<android.graphics.drawable.BitmapDrawable> a(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull com.bumptech.glide.load.engine.u<android.graphics.drawable.BitmapDrawable> r3, int r4, int r5) {
            r1 = this;
            com.bumptech.glide.load.engine.u r3 = d(r3)
            com.bumptech.glide.load.i<android.graphics.drawable.Drawable> r0 = r1.c
            com.bumptech.glide.load.engine.u r2 = r0.a(r2, r3, r4, r5)
            com.bumptech.glide.load.engine.u r2 = c(r2)
            return r2
    }

    @Override // com.bumptech.glide.load.c
    public void b(@androidx.annotation.NonNull java.security.MessageDigest r2) {
            r1 = this;
            com.bumptech.glide.load.i<android.graphics.drawable.Drawable> r0 = r1.c
            r0.b(r2)
            return
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.bumptech.glide.load.resource.bitmap.d
            if (r0 == 0) goto Lf
            com.bumptech.glide.load.resource.bitmap.d r2 = (com.bumptech.glide.load.resource.bitmap.d) r2
            com.bumptech.glide.load.i<android.graphics.drawable.Drawable> r0 = r1.c
            com.bumptech.glide.load.i<android.graphics.drawable.Drawable> r2 = r2.c
            boolean r2 = r0.equals(r2)
            return r2
        Lf:
            r2 = 0
            return r2
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
            r1 = this;
            com.bumptech.glide.load.i<android.graphics.drawable.Drawable> r0 = r1.c
            int r0 = r0.hashCode()
            return r0
    }
}
