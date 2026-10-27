package com.bumptech.glide.load.resource.bitmap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class v {
    private static final java.lang.String a = "DrawableToBitmap";
    private static final com.bumptech.glide.load.engine.bitmap_recycle.e b = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends com.bumptech.glide.load.engine.bitmap_recycle.f {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.f, com.bumptech.glide.load.engine.bitmap_recycle.e
        public void d(android.graphics.Bitmap r1) {
                r0 = this;
                return
        }
    }

    static {
            com.bumptech.glide.load.resource.bitmap.v$a r0 = new com.bumptech.glide.load.resource.bitmap.v$a
            r0.<init>()
            com.bumptech.glide.load.resource.bitmap.v.b = r0
            return
    }

    private v() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    static com.bumptech.glide.load.engine.u<android.graphics.Bitmap> a(com.bumptech.glide.load.engine.bitmap_recycle.e r2, android.graphics.drawable.Drawable r3, int r4, int r5) {
            android.graphics.drawable.Drawable r3 = r3.getCurrent()
            boolean r0 = r3 instanceof android.graphics.drawable.BitmapDrawable
            r1 = 0
            if (r0 == 0) goto L10
            android.graphics.drawable.BitmapDrawable r3 = (android.graphics.drawable.BitmapDrawable) r3
            android.graphics.Bitmap r3 = r3.getBitmap()
            goto L1b
        L10:
            boolean r0 = r3 instanceof android.graphics.drawable.Animatable
            if (r0 != 0) goto L1a
            android.graphics.Bitmap r3 = b(r2, r3, r4, r5)
            r1 = 1
            goto L1b
        L1a:
            r3 = 0
        L1b:
            if (r1 == 0) goto L1e
            goto L20
        L1e:
            com.bumptech.glide.load.engine.bitmap_recycle.e r2 = com.bumptech.glide.load.resource.bitmap.v.b
        L20:
            com.bumptech.glide.load.resource.bitmap.g r2 = com.bumptech.glide.load.resource.bitmap.g.c(r3, r2)
            return r2
    }

    @androidx.annotation.Nullable
    private static android.graphics.Bitmap b(com.bumptech.glide.load.engine.bitmap_recycle.e r5, android.graphics.drawable.Drawable r6, int r7, int r8) {
            r0 = 5
            java.lang.String r1 = "DrawableToBitmap"
            r2 = 0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 != r3) goto L18
            int r4 = r6.getIntrinsicWidth()
            if (r4 > 0) goto L18
            boolean r5 = android.util.Log.isLoggable(r1, r0)
            if (r5 == 0) goto L17
            r6.toString()
        L17:
            return r2
        L18:
            if (r8 != r3) goto L2a
            int r3 = r6.getIntrinsicHeight()
            if (r3 > 0) goto L2a
            boolean r5 = android.util.Log.isLoggable(r1, r0)
            if (r5 == 0) goto L29
            r6.toString()
        L29:
            return r2
        L2a:
            int r0 = r6.getIntrinsicWidth()
            if (r0 <= 0) goto L34
            int r7 = r6.getIntrinsicWidth()
        L34:
            int r0 = r6.getIntrinsicHeight()
            if (r0 <= 0) goto L3e
            int r8 = r6.getIntrinsicHeight()
        L3e:
            java.util.concurrent.locks.Lock r0 = com.bumptech.glide.load.resource.bitmap.k0.i()
            r0.lock()
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r5 = r5.e(r7, r8, r1)
            android.graphics.Canvas r1 = new android.graphics.Canvas     // Catch: java.lang.Throwable -> L5e
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L5e
            r3 = 0
            r6.setBounds(r3, r3, r7, r8)     // Catch: java.lang.Throwable -> L5e
            r6.draw(r1)     // Catch: java.lang.Throwable -> L5e
            r1.setBitmap(r2)     // Catch: java.lang.Throwable -> L5e
            r0.unlock()
            return r5
        L5e:
            r5 = move-exception
            r0.unlock()
            throw r5
    }
}
