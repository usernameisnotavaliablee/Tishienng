package com.bumptech.glide.load.resource.bitmap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class h implements com.bumptech.glide.load.i<android.graphics.Bitmap> {
    public h() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bumptech.glide.load.i
    @androidx.annotation.NonNull
    public final com.bumptech.glide.load.engine.u<android.graphics.Bitmap> a(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.NonNull com.bumptech.glide.load.engine.u<android.graphics.Bitmap> r4, int r5, int r6) {
            r2 = this;
            boolean r0 = com.bumptech.glide.util.l.w(r5, r6)
            if (r0 == 0) goto L32
            com.bumptech.glide.b r3 = com.bumptech.glide.b.e(r3)
            com.bumptech.glide.load.engine.bitmap_recycle.e r3 = r3.h()
            java.lang.Object r0 = r4.get()
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 != r1) goto L1c
            int r5 = r0.getWidth()
        L1c:
            if (r6 != r1) goto L22
            int r6 = r0.getHeight()
        L22:
            android.graphics.Bitmap r5 = r2.c(r3, r0, r5, r6)
            boolean r6 = r0.equals(r5)
            if (r6 == 0) goto L2d
            return r4
        L2d:
            com.bumptech.glide.load.resource.bitmap.g r3 = com.bumptech.glide.load.resource.bitmap.g.c(r5, r3)
            return r3
        L32:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Cannot apply transformation on width: "
            r4.append(r0)
            r4.append(r5)
            java.lang.String r5 = " or height: "
            r4.append(r5)
            r4.append(r6)
            java.lang.String r5 = " less than or equal to zero and not Target.SIZE_ORIGINAL"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    protected abstract android.graphics.Bitmap c(@androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.e r1, @androidx.annotation.NonNull android.graphics.Bitmap r2, int r3, int r4);
}
