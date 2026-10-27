package com.bumptech.glide.load.resource.bitmap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j0 implements com.bumptech.glide.load.g<java.io.InputStream, android.graphics.Bitmap> {
    private final com.bumptech.glide.load.resource.bitmap.u a;
    private final com.bumptech.glide.load.engine.bitmap_recycle.b b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements com.bumptech.glide.load.resource.bitmap.u.b {
        private final com.bumptech.glide.load.resource.bitmap.f0 a;
        private final com.bumptech.glide.util.d b;

        a(com.bumptech.glide.load.resource.bitmap.f0 r1, com.bumptech.glide.util.d r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        @Override // com.bumptech.glide.load.resource.bitmap.u.b
        public void a() {
                r1 = this;
                com.bumptech.glide.load.resource.bitmap.f0 r0 = r1.a
                r0.b()
                return
        }

        @Override // com.bumptech.glide.load.resource.bitmap.u.b
        public void b(com.bumptech.glide.load.engine.bitmap_recycle.e r2, android.graphics.Bitmap r3) throws java.io.IOException {
                r1 = this;
                com.bumptech.glide.util.d r0 = r1.b
                java.io.IOException r0 = r0.b()
                if (r0 == 0) goto Le
                if (r3 == 0) goto Ld
                r2.d(r3)
            Ld:
                throw r0
            Le:
                return
        }
    }

    public j0(com.bumptech.glide.load.resource.bitmap.u r1, com.bumptech.glide.load.engine.bitmap_recycle.b r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // com.bumptech.glide.load.g
    public /* bridge */ /* synthetic */ boolean a(@androidx.annotation.NonNull java.io.InputStream r1, @androidx.annotation.NonNull com.bumptech.glide.load.f r2) throws java.io.IOException {
            r0 = this;
            java.io.InputStream r1 = (java.io.InputStream) r1
            boolean r1 = r0.d(r1, r2)
            return r1
    }

    @Override // com.bumptech.glide.load.g
    public /* bridge */ /* synthetic */ com.bumptech.glide.load.engine.u<android.graphics.Bitmap> b(@androidx.annotation.NonNull java.io.InputStream r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.f r4) throws java.io.IOException {
            r0 = this;
            java.io.InputStream r1 = (java.io.InputStream) r1
            com.bumptech.glide.load.engine.u r1 = r0.c(r1, r2, r3, r4)
            return r1
    }

    public com.bumptech.glide.load.engine.u<android.graphics.Bitmap> c(@androidx.annotation.NonNull java.io.InputStream r10, int r11, int r12, @androidx.annotation.NonNull com.bumptech.glide.load.f r13) throws java.io.IOException {
            r9 = this;
            boolean r0 = r10 instanceof com.bumptech.glide.load.resource.bitmap.f0
            if (r0 == 0) goto L9
            com.bumptech.glide.load.resource.bitmap.f0 r10 = (com.bumptech.glide.load.resource.bitmap.f0) r10
            r0 = 0
            r1 = 0
            goto L13
        L9:
            com.bumptech.glide.load.resource.bitmap.f0 r0 = new com.bumptech.glide.load.resource.bitmap.f0
            com.bumptech.glide.load.engine.bitmap_recycle.b r1 = r9.b
            r0.<init>(r10, r1)
            r10 = 1
            r10 = r0
            r1 = 1
        L13:
            com.bumptech.glide.util.d r2 = com.bumptech.glide.util.d.c(r10)
            com.bumptech.glide.util.i r4 = new com.bumptech.glide.util.i
            r4.<init>(r2)
            com.bumptech.glide.load.resource.bitmap.j0$a r8 = new com.bumptech.glide.load.resource.bitmap.j0$a
            r8.<init>(r10, r2)
            com.bumptech.glide.load.resource.bitmap.u r3 = r9.a     // Catch: java.lang.Throwable -> L33
            r5 = r11
            r6 = r12
            r7 = r13
            com.bumptech.glide.load.engine.u r11 = r3.g(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L33
            r2.release()
            if (r1 == 0) goto L32
            r10.release()
        L32:
            return r11
        L33:
            r0 = move-exception
            r11 = r0
            r2.release()
            if (r1 == 0) goto L3d
            r10.release()
        L3d:
            throw r11
    }

    public boolean d(@androidx.annotation.NonNull java.io.InputStream r1, @androidx.annotation.NonNull com.bumptech.glide.load.f r2) {
            r0 = this;
            com.bumptech.glide.load.resource.bitmap.u r2 = r0.a
            boolean r1 = r2.p(r1)
            return r1
    }
}
