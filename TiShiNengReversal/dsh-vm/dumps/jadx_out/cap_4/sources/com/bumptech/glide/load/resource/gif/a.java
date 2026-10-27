package com.bumptech.glide.load.resource.gif;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class a implements com.bumptech.glide.load.g<java.nio.ByteBuffer, com.bumptech.glide.load.resource.gif.GifDrawable> {
    private static final java.lang.String f = "BufferGifDecoder";
    private static final com.bumptech.glide.load.resource.gif.a.C0031a g = null;
    private static final com.bumptech.glide.load.resource.gif.a.b h = null;
    private final android.content.Context a;
    private final java.util.List<com.bumptech.glide.load.ImageHeaderParser> b;
    private final com.bumptech.glide.load.resource.gif.a.b c;
    private final com.bumptech.glide.load.resource.gif.a.C0031a d;
    private final com.bumptech.glide.load.resource.gif.b e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.VisibleForTesting
    /* renamed from: com.bumptech.glide.load.resource.gif.a$a, reason: collision with other inner class name */
    static class C0031a {
        C0031a() {
                r0 = this;
                r0.<init>()
                return
        }

        com.bumptech.glide.gifdecoder.GifDecoder a(com.bumptech.glide.gifdecoder.GifDecoder.a r2, com.bumptech.glide.gifdecoder.b r3, java.nio.ByteBuffer r4, int r5) {
                r1 = this;
                com.bumptech.glide.gifdecoder.d r0 = new com.bumptech.glide.gifdecoder.d
                r0.<init>(r2, r3, r4, r5)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.VisibleForTesting
    static class b {
        private final java.util.Queue<com.bumptech.glide.gifdecoder.c> a;

        b() {
                r1 = this;
                r1.<init>()
                r0 = 0
                java.util.Queue r0 = com.bumptech.glide.util.l.f(r0)
                r1.a = r0
                return
        }

        synchronized com.bumptech.glide.gifdecoder.c a(java.nio.ByteBuffer r2) {
                r1 = this;
                monitor-enter(r1)
                java.util.Queue<com.bumptech.glide.gifdecoder.c> r0 = r1.a     // Catch: java.lang.Throwable -> L11
                java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L11
                com.bumptech.glide.gifdecoder.c r0 = (com.bumptech.glide.gifdecoder.c) r0     // Catch: java.lang.Throwable -> L11
                if (r0 != 0) goto L13
                com.bumptech.glide.gifdecoder.c r0 = new com.bumptech.glide.gifdecoder.c     // Catch: java.lang.Throwable -> L11
                r0.<init>()     // Catch: java.lang.Throwable -> L11
                goto L13
            L11:
                r2 = move-exception
                goto L19
            L13:
                com.bumptech.glide.gifdecoder.c r2 = r0.q(r2)     // Catch: java.lang.Throwable -> L11
                monitor-exit(r1)
                return r2
            L19:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L11
                throw r2
        }

        synchronized void b(com.bumptech.glide.gifdecoder.c r2) {
                r1 = this;
                monitor-enter(r1)
                r2.a()     // Catch: java.lang.Throwable -> Lb
                java.util.Queue<com.bumptech.glide.gifdecoder.c> r0 = r1.a     // Catch: java.lang.Throwable -> Lb
                r0.offer(r2)     // Catch: java.lang.Throwable -> Lb
                monitor-exit(r1)
                return
            Lb:
                r2 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
                throw r2
        }
    }

    static {
            com.bumptech.glide.load.resource.gif.a$a r0 = new com.bumptech.glide.load.resource.gif.a$a
            r0.<init>()
            com.bumptech.glide.load.resource.gif.a.g = r0
            com.bumptech.glide.load.resource.gif.a$b r0 = new com.bumptech.glide.load.resource.gif.a$b
            r0.<init>()
            com.bumptech.glide.load.resource.gif.a.h = r0
            return
    }

    public a(android.content.Context r4) {
            r3 = this;
            com.bumptech.glide.b r0 = com.bumptech.glide.b.e(r4)
            com.bumptech.glide.Registry r0 = r0.m()
            java.util.List r0 = r0.g()
            com.bumptech.glide.b r1 = com.bumptech.glide.b.e(r4)
            com.bumptech.glide.load.engine.bitmap_recycle.e r1 = r1.h()
            com.bumptech.glide.b r2 = com.bumptech.glide.b.e(r4)
            com.bumptech.glide.load.engine.bitmap_recycle.b r2 = r2.g()
            r3.<init>(r4, r0, r1, r2)
            return
    }

    public a(android.content.Context r8, java.util.List<com.bumptech.glide.load.ImageHeaderParser> r9, com.bumptech.glide.load.engine.bitmap_recycle.e r10, com.bumptech.glide.load.engine.bitmap_recycle.b r11) {
            r7 = this;
            com.bumptech.glide.load.resource.gif.a$b r5 = com.bumptech.glide.load.resource.gif.a.h
            com.bumptech.glide.load.resource.gif.a$a r6 = com.bumptech.glide.load.resource.gif.a.g
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    @androidx.annotation.VisibleForTesting
    a(android.content.Context r1, java.util.List<com.bumptech.glide.load.ImageHeaderParser> r2, com.bumptech.glide.load.engine.bitmap_recycle.e r3, com.bumptech.glide.load.engine.bitmap_recycle.b r4, com.bumptech.glide.load.resource.gif.a.b r5, com.bumptech.glide.load.resource.gif.a.C0031a r6) {
            r0 = this;
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            r0.a = r1
            r0.b = r2
            r0.d = r6
            com.bumptech.glide.load.resource.gif.b r1 = new com.bumptech.glide.load.resource.gif.b
            r1.<init>(r3, r4)
            r0.e = r1
            r0.c = r5
            return
    }

    @androidx.annotation.Nullable
    private com.bumptech.glide.load.resource.gif.d c(java.nio.ByteBuffer r15, int r16, int r17, com.bumptech.glide.gifdecoder.c r18, com.bumptech.glide.load.f r19) {
            r14 = this;
            java.lang.String r1 = "BufferGifDecoder"
            long r2 = com.bumptech.glide.util.g.b()
            r4 = 2
            com.bumptech.glide.gifdecoder.b r0 = r18.d()     // Catch: java.lang.Throwable -> L2c
            int r5 = r0.b()     // Catch: java.lang.Throwable -> L2c
            r6 = 0
            if (r5 <= 0) goto L6e
            int r5 = r0.c()     // Catch: java.lang.Throwable -> L2c
            if (r5 == 0) goto L19
            goto L6e
        L19:
            com.bumptech.glide.load.e<com.bumptech.glide.load.DecodeFormat> r5 = com.bumptech.glide.load.resource.gif.h.a     // Catch: java.lang.Throwable -> L2c
            r7 = r19
            java.lang.Object r5 = r7.c(r5)     // Catch: java.lang.Throwable -> L2c
            com.bumptech.glide.load.DecodeFormat r7 = com.bumptech.glide.load.DecodeFormat.PREFER_RGB_565     // Catch: java.lang.Throwable -> L2c
            if (r5 != r7) goto L2f
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.Throwable -> L2c
        L27:
            r11 = r16
            r12 = r17
            goto L32
        L2c:
            r0 = move-exception
            r15 = r0
            goto L78
        L2f:
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> L2c
            goto L27
        L32:
            int r7 = e(r0, r11, r12)     // Catch: java.lang.Throwable -> L2c
            com.bumptech.glide.load.resource.gif.a$a r8 = r14.d     // Catch: java.lang.Throwable -> L2c
            com.bumptech.glide.load.resource.gif.b r9 = r14.e     // Catch: java.lang.Throwable -> L2c
            com.bumptech.glide.gifdecoder.GifDecoder r9 = r8.a(r9, r0, r15, r7)     // Catch: java.lang.Throwable -> L2c
            r9.a(r5)     // Catch: java.lang.Throwable -> L2c
            r9.i()     // Catch: java.lang.Throwable -> L2c
            android.graphics.Bitmap r13 = r9.h()     // Catch: java.lang.Throwable -> L2c
            if (r13 != 0) goto L54
            boolean r15 = android.util.Log.isLoggable(r1, r4)
            if (r15 == 0) goto L53
            com.bumptech.glide.util.g.a(r2)
        L53:
            return r6
        L54:
            com.bumptech.glide.load.resource.m r10 = com.bumptech.glide.load.resource.m.c()     // Catch: java.lang.Throwable -> L2c
            com.bumptech.glide.load.resource.gif.GifDrawable r7 = new com.bumptech.glide.load.resource.gif.GifDrawable     // Catch: java.lang.Throwable -> L2c
            android.content.Context r8 = r14.a     // Catch: java.lang.Throwable -> L2c
            r7.<init>(r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L2c
            com.bumptech.glide.load.resource.gif.d r15 = new com.bumptech.glide.load.resource.gif.d     // Catch: java.lang.Throwable -> L2c
            r15.<init>(r7)     // Catch: java.lang.Throwable -> L2c
            boolean r0 = android.util.Log.isLoggable(r1, r4)
            if (r0 == 0) goto L6d
            com.bumptech.glide.util.g.a(r2)
        L6d:
            return r15
        L6e:
            boolean r15 = android.util.Log.isLoggable(r1, r4)
            if (r15 == 0) goto L77
            com.bumptech.glide.util.g.a(r2)
        L77:
            return r6
        L78:
            boolean r0 = android.util.Log.isLoggable(r1, r4)
            if (r0 == 0) goto L81
            com.bumptech.glide.util.g.a(r2)
        L81:
            throw r15
    }

    private static int e(com.bumptech.glide.gifdecoder.b r2, int r3, int r4) {
            int r0 = r2.a()
            int r0 = r0 / r4
            int r4 = r2.d()
            int r4 = r4 / r3
            int r3 = java.lang.Math.min(r0, r4)
            if (r3 != 0) goto L12
            r3 = 0
            goto L16
        L12:
            int r3 = java.lang.Integer.highestOneBit(r3)
        L16:
            r4 = 1
            int r3 = java.lang.Math.max(r4, r3)
            java.lang.String r0 = "BufferGifDecoder"
            r1 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 == 0) goto L2c
            if (r3 <= r4) goto L2c
            r2.d()
            r2.a()
        L2c:
            return r3
    }

    @Override // com.bumptech.glide.load.g
    public /* bridge */ /* synthetic */ boolean a(@androidx.annotation.NonNull java.nio.ByteBuffer r1, @androidx.annotation.NonNull com.bumptech.glide.load.f r2) throws java.io.IOException {
            r0 = this;
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            boolean r1 = r0.f(r1, r2)
            return r1
    }

    @Override // com.bumptech.glide.load.g
    public /* bridge */ /* synthetic */ com.bumptech.glide.load.engine.u<com.bumptech.glide.load.resource.gif.GifDrawable> b(@androidx.annotation.NonNull java.nio.ByteBuffer r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.f r4) throws java.io.IOException {
            r0 = this;
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            com.bumptech.glide.load.resource.gif.d r1 = r0.d(r1, r2, r3, r4)
            return r1
    }

    public com.bumptech.glide.load.resource.gif.d d(@androidx.annotation.NonNull java.nio.ByteBuffer r8, int r9, int r10, @androidx.annotation.NonNull com.bumptech.glide.load.f r11) {
            r7 = this;
            com.bumptech.glide.load.resource.gif.a$b r0 = r7.c
            com.bumptech.glide.gifdecoder.c r5 = r0.a(r8)
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r11
            com.bumptech.glide.load.resource.gif.d r8 = r1.c(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L15
            com.bumptech.glide.load.resource.gif.a$b r9 = r1.c
            r9.b(r5)
            return r8
        L15:
            r0 = move-exception
            r8 = r0
            com.bumptech.glide.load.resource.gif.a$b r9 = r1.c
            r9.b(r5)
            throw r8
    }

    public boolean f(@androidx.annotation.NonNull java.nio.ByteBuffer r2, @androidx.annotation.NonNull com.bumptech.glide.load.f r3) throws java.io.IOException {
            r1 = this;
            com.bumptech.glide.load.e<java.lang.Boolean> r0 = com.bumptech.glide.load.resource.gif.h.b
            java.lang.Object r3 = r3.c(r0)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L1a
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r3 = r1.b
            com.bumptech.glide.load.ImageHeaderParser$ImageType r2 = com.bumptech.glide.load.b.getType(r3, r2)
            com.bumptech.glide.load.ImageHeaderParser$ImageType r3 = com.bumptech.glide.load.ImageHeaderParser.ImageType.GIF
            if (r2 != r3) goto L1a
            r2 = 1
            return r2
        L1a:
            r2 = 0
            return r2
    }
}
