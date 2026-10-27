package com.bumptech.glide.load.resource.bitmap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class o0<T> implements com.bumptech.glide.load.g<T, android.graphics.Bitmap> {
    private static final java.lang.String d = "VideoDecoder";
    public static final long e = -1;

    @androidx.annotation.VisibleForTesting
    static final int f = 2;
    public static final com.bumptech.glide.load.e<java.lang.Long> g = null;
    public static final com.bumptech.glide.load.e<java.lang.Integer> h = null;
    private static final com.bumptech.glide.load.resource.bitmap.o0.e i = null;
    private final com.bumptech.glide.load.resource.bitmap.o0.f<T> a;
    private final com.bumptech.glide.load.engine.bitmap_recycle.e b;
    private final com.bumptech.glide.load.resource.bitmap.o0.e c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements com.bumptech.glide.load.e.b<java.lang.Long> {
        private final java.nio.ByteBuffer a;

        a() {
                r1 = this;
                r1.<init>()
                r0 = 8
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
                r1.a = r0
                return
        }

        /* renamed from: update, reason: avoid collision after fix types in other method */
        public void update2(@androidx.annotation.NonNull byte[] r4, @androidx.annotation.NonNull java.lang.Long r5, @androidx.annotation.NonNull java.security.MessageDigest r6) {
                r3 = this;
                r6.update(r4)
                java.nio.ByteBuffer r4 = r3.a
                monitor-enter(r4)
                java.nio.ByteBuffer r0 = r3.a     // Catch: java.lang.Throwable -> L1f
                r1 = 0
                r0.position(r1)     // Catch: java.lang.Throwable -> L1f
                java.nio.ByteBuffer r0 = r3.a     // Catch: java.lang.Throwable -> L1f
                long r1 = r5.longValue()     // Catch: java.lang.Throwable -> L1f
                java.nio.ByteBuffer r5 = r0.putLong(r1)     // Catch: java.lang.Throwable -> L1f
                byte[] r5 = r5.array()     // Catch: java.lang.Throwable -> L1f
                r6.update(r5)     // Catch: java.lang.Throwable -> L1f
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L1f
                return
            L1f:
                r5 = move-exception
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L1f
                throw r5
        }

        @Override // com.bumptech.glide.load.e.b
        public /* bridge */ /* synthetic */ void update(@androidx.annotation.NonNull byte[] r1, @androidx.annotation.NonNull java.lang.Long r2, @androidx.annotation.NonNull java.security.MessageDigest r3) {
                r0 = this;
                java.lang.Long r2 = (java.lang.Long) r2
                r0.update2(r1, r2, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements com.bumptech.glide.load.e.b<java.lang.Integer> {
        private final java.nio.ByteBuffer a;

        b() {
                r1 = this;
                r1.<init>()
                r0 = 4
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
                r1.a = r0
                return
        }

        /* renamed from: update, reason: avoid collision after fix types in other method */
        public void update2(@androidx.annotation.NonNull byte[] r3, @androidx.annotation.NonNull java.lang.Integer r4, @androidx.annotation.NonNull java.security.MessageDigest r5) {
                r2 = this;
                if (r4 != 0) goto L3
                return
            L3:
                r5.update(r3)
                java.nio.ByteBuffer r3 = r2.a
                monitor-enter(r3)
                java.nio.ByteBuffer r0 = r2.a     // Catch: java.lang.Throwable -> L22
                r1 = 0
                r0.position(r1)     // Catch: java.lang.Throwable -> L22
                java.nio.ByteBuffer r0 = r2.a     // Catch: java.lang.Throwable -> L22
                int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L22
                java.nio.ByteBuffer r4 = r0.putInt(r4)     // Catch: java.lang.Throwable -> L22
                byte[] r4 = r4.array()     // Catch: java.lang.Throwable -> L22
                r5.update(r4)     // Catch: java.lang.Throwable -> L22
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L22
                return
            L22:
                r4 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L22
                throw r4
        }

        @Override // com.bumptech.glide.load.e.b
        public /* bridge */ /* synthetic */ void update(@androidx.annotation.NonNull byte[] r1, @androidx.annotation.NonNull java.lang.Integer r2, @androidx.annotation.NonNull java.security.MessageDigest r3) {
                r0 = this;
                java.lang.Integer r2 = (java.lang.Integer) r2
                r0.update2(r1, r2, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class c implements com.bumptech.glide.load.resource.bitmap.o0.f<android.content.res.AssetFileDescriptor> {
        private c() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ c(com.bumptech.glide.load.resource.bitmap.o0.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.resource.bitmap.o0.f
        public /* bridge */ /* synthetic */ void a(android.media.MediaMetadataRetriever r1, android.content.res.AssetFileDescriptor r2) {
                r0 = this;
                android.content.res.AssetFileDescriptor r2 = (android.content.res.AssetFileDescriptor) r2
                r0.b(r1, r2)
                return
        }

        public void b(android.media.MediaMetadataRetriever r7, android.content.res.AssetFileDescriptor r8) {
                r6 = this;
                java.io.FileDescriptor r1 = r8.getFileDescriptor()
                long r2 = r8.getStartOffset()
                long r4 = r8.getLength()
                r0 = r7
                r0.setDataSource(r1, r2, r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(23)
    static final class d implements com.bumptech.glide.load.resource.bitmap.o0.f<java.nio.ByteBuffer> {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a extends android.media.MediaDataSource {
            final /* synthetic */ java.nio.ByteBuffer a;
            final /* synthetic */ com.bumptech.glide.load.resource.bitmap.o0.d b;

            a(com.bumptech.glide.load.resource.bitmap.o0.d r1, java.nio.ByteBuffer r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                    r0 = this;
                    return
            }

            @Override // android.media.MediaDataSource
            public long getSize() {
                    r2 = this;
                    java.nio.ByteBuffer r0 = r2.a
                    int r0 = r0.limit()
                    long r0 = (long) r0
                    return r0
            }

            @Override // android.media.MediaDataSource
            public int readAt(long r4, byte[] r6, int r7, int r8) {
                    r3 = this;
                    java.nio.ByteBuffer r0 = r3.a
                    int r0 = r0.limit()
                    long r0 = (long) r0
                    int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                    if (r2 < 0) goto Ld
                    r4 = -1
                    return r4
                Ld:
                    java.nio.ByteBuffer r0 = r3.a
                    int r5 = (int) r4
                    r0.position(r5)
                    java.nio.ByteBuffer r4 = r3.a
                    int r4 = r4.remaining()
                    int r4 = java.lang.Math.min(r8, r4)
                    java.nio.ByteBuffer r5 = r3.a
                    r5.get(r6, r7, r4)
                    return r4
            }
        }

        d() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.resource.bitmap.o0.f
        public /* bridge */ /* synthetic */ void a(android.media.MediaMetadataRetriever r1, java.nio.ByteBuffer r2) {
                r0 = this;
                java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
                r0.b(r1, r2)
                return
        }

        public void b(android.media.MediaMetadataRetriever r2, java.nio.ByteBuffer r3) {
                r1 = this;
                com.bumptech.glide.load.resource.bitmap.o0$d$a r0 = new com.bumptech.glide.load.resource.bitmap.o0$d$a
                r0.<init>(r1, r3)
                androidx.exifinterface.media.a.a(r2, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.VisibleForTesting
    static class e {
        e() {
                r0 = this;
                r0.<init>()
                return
        }

        public android.media.MediaMetadataRetriever a() {
                r1 = this;
                android.media.MediaMetadataRetriever r0 = new android.media.MediaMetadataRetriever
                r0.<init>()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.VisibleForTesting
    interface f<T> {
        void a(android.media.MediaMetadataRetriever r1, T r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class g implements com.bumptech.glide.load.resource.bitmap.o0.f<android.os.ParcelFileDescriptor> {
        g() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.resource.bitmap.o0.f
        public /* bridge */ /* synthetic */ void a(android.media.MediaMetadataRetriever r1, android.os.ParcelFileDescriptor r2) {
                r0 = this;
                android.os.ParcelFileDescriptor r2 = (android.os.ParcelFileDescriptor) r2
                r0.b(r1, r2)
                return
        }

        public void b(android.media.MediaMetadataRetriever r1, android.os.ParcelFileDescriptor r2) {
                r0 = this;
                java.io.FileDescriptor r2 = r2.getFileDescriptor()
                r1.setDataSource(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class h extends java.lang.RuntimeException {
        private static final long serialVersionUID = -2556382523004027815L;

        h() {
                r1 = this;
                java.lang.String r0 = "MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details"
                r1.<init>(r0)
                return
        }
    }

    static {
            r0 = -1
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            com.bumptech.glide.load.resource.bitmap.o0$a r1 = new com.bumptech.glide.load.resource.bitmap.o0$a
            r1.<init>()
            java.lang.String r2 = "com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame"
            com.bumptech.glide.load.e r0 = com.bumptech.glide.load.e.b(r2, r0, r1)
            com.bumptech.glide.load.resource.bitmap.o0.g = r0
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.bumptech.glide.load.resource.bitmap.o0$b r1 = new com.bumptech.glide.load.resource.bitmap.o0$b
            r1.<init>()
            java.lang.String r2 = "com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption"
            com.bumptech.glide.load.e r0 = com.bumptech.glide.load.e.b(r2, r0, r1)
            com.bumptech.glide.load.resource.bitmap.o0.h = r0
            com.bumptech.glide.load.resource.bitmap.o0$e r0 = new com.bumptech.glide.load.resource.bitmap.o0$e
            r0.<init>()
            com.bumptech.glide.load.resource.bitmap.o0.i = r0
            return
    }

    o0(com.bumptech.glide.load.engine.bitmap_recycle.e r2, com.bumptech.glide.load.resource.bitmap.o0.f<T> r3) {
            r1 = this;
            com.bumptech.glide.load.resource.bitmap.o0$e r0 = com.bumptech.glide.load.resource.bitmap.o0.i
            r1.<init>(r2, r3, r0)
            return
    }

    @androidx.annotation.VisibleForTesting
    o0(com.bumptech.glide.load.engine.bitmap_recycle.e r1, com.bumptech.glide.load.resource.bitmap.o0.f<T> r2, com.bumptech.glide.load.resource.bitmap.o0.e r3) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.a = r2
            r0.c = r3
            return
    }

    public static com.bumptech.glide.load.g<android.content.res.AssetFileDescriptor, android.graphics.Bitmap> c(com.bumptech.glide.load.engine.bitmap_recycle.e r3) {
            com.bumptech.glide.load.resource.bitmap.o0 r0 = new com.bumptech.glide.load.resource.bitmap.o0
            com.bumptech.glide.load.resource.bitmap.o0$c r1 = new com.bumptech.glide.load.resource.bitmap.o0$c
            r2 = 0
            r1.<init>(r2)
            r0.<init>(r3, r1)
            return r0
    }

    @androidx.annotation.RequiresApi(api = 23)
    public static com.bumptech.glide.load.g<java.nio.ByteBuffer, android.graphics.Bitmap> d(com.bumptech.glide.load.engine.bitmap_recycle.e r2) {
            com.bumptech.glide.load.resource.bitmap.o0 r0 = new com.bumptech.glide.load.resource.bitmap.o0
            com.bumptech.glide.load.resource.bitmap.o0$d r1 = new com.bumptech.glide.load.resource.bitmap.o0$d
            r1.<init>()
            r0.<init>(r2, r1)
            return r0
    }

    @androidx.annotation.Nullable
    private static android.graphics.Bitmap e(android.media.MediaMetadataRetriever r2, long r3, int r5, int r6, int r7, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r8) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto L15
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 == r0) goto L15
            if (r7 == r0) goto L15
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r0 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.f
            if (r8 == r0) goto L15
            android.graphics.Bitmap r6 = g(r2, r3, r5, r6, r7, r8)
            goto L16
        L15:
            r6 = 0
        L16:
            if (r6 != 0) goto L1c
            android.graphics.Bitmap r6 = f(r2, r3, r5)
        L1c:
            if (r6 == 0) goto L1f
            return r6
        L1f:
            com.bumptech.glide.load.resource.bitmap.o0$h r2 = new com.bumptech.glide.load.resource.bitmap.o0$h
            r2.<init>()
            throw r2
    }

    private static android.graphics.Bitmap f(android.media.MediaMetadataRetriever r0, long r1, int r3) {
            android.graphics.Bitmap r0 = r0.getFrameAtTime(r1, r3)
            return r0
    }

    @androidx.annotation.Nullable
    @android.annotation.TargetApi(27)
    private static android.graphics.Bitmap g(android.media.MediaMetadataRetriever r9, long r10, int r12, int r13, int r14, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r15) {
            r0 = 18
            java.lang.String r0 = r9.extractMetadata(r0)     // Catch: java.lang.Throwable -> L43
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L43
            r1 = 19
            java.lang.String r1 = r9.extractMetadata(r1)     // Catch: java.lang.Throwable -> L43
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L43
            r2 = 24
            java.lang.String r2 = r9.extractMetadata(r2)     // Catch: java.lang.Throwable -> L43
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Throwable -> L43
            r3 = 90
            if (r2 == r3) goto L26
            r3 = 270(0x10e, float:3.78E-43)
            if (r2 != r3) goto L29
        L26:
            r8 = r1
            r1 = r0
            r0 = r8
        L29:
            float r13 = r15.b(r0, r1, r13, r14)     // Catch: java.lang.Throwable -> L43
            float r14 = (float) r0     // Catch: java.lang.Throwable -> L43
            float r14 = r14 * r13
            int r6 = java.lang.Math.round(r14)     // Catch: java.lang.Throwable -> L43
            float r14 = (float) r1     // Catch: java.lang.Throwable -> L43
            float r13 = r13 * r14
            int r7 = java.lang.Math.round(r13)     // Catch: java.lang.Throwable -> L43
            r2 = r9
            r3 = r10
            r5 = r12
            android.graphics.Bitmap r9 = com.bumptech.glide.load.resource.bitmap.n0.a(r2, r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L43
            return r9
        L43:
            java.lang.String r9 = "VideoDecoder"
            r10 = 3
            android.util.Log.isLoggable(r9, r10)
            r9 = 0
            return r9
    }

    public static com.bumptech.glide.load.g<android.os.ParcelFileDescriptor, android.graphics.Bitmap> h(com.bumptech.glide.load.engine.bitmap_recycle.e r2) {
            com.bumptech.glide.load.resource.bitmap.o0 r0 = new com.bumptech.glide.load.resource.bitmap.o0
            com.bumptech.glide.load.resource.bitmap.o0$g r1 = new com.bumptech.glide.load.resource.bitmap.o0$g
            r1.<init>()
            r0.<init>(r2, r1)
            return r0
    }

    @Override // com.bumptech.glide.load.g
    public boolean a(@androidx.annotation.NonNull T r1, @androidx.annotation.NonNull com.bumptech.glide.load.f r2) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // com.bumptech.glide.load.g
    public com.bumptech.glide.load.engine.u<android.graphics.Bitmap> b(@androidx.annotation.NonNull T r9, int r10, int r11, @androidx.annotation.NonNull com.bumptech.glide.load.f r12) throws java.io.IOException {
            r8 = this;
            com.bumptech.glide.load.e<java.lang.Long> r0 = com.bumptech.glide.load.resource.bitmap.o0.g
            java.lang.Object r0 = r12.c(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            r0 = 0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L30
            r0 = -1
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L19
            goto L30
        L19:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Requested frame must be non-negative, or DEFAULT_FRAME, given: "
            r10.append(r11)
            r10.append(r2)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L30:
            com.bumptech.glide.load.e<java.lang.Integer> r0 = com.bumptech.glide.load.resource.bitmap.o0.h
            java.lang.Object r0 = r12.c(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L3f
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L3f:
            com.bumptech.glide.load.e<com.bumptech.glide.load.resource.bitmap.DownsampleStrategy> r1 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.h
            java.lang.Object r12 = r12.c(r1)
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r12 = (com.bumptech.glide.load.resource.bitmap.DownsampleStrategy) r12
            if (r12 != 0) goto L4b
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r12 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.g
        L4b:
            r7 = r12
            com.bumptech.glide.load.resource.bitmap.o0$e r12 = r8.c
            android.media.MediaMetadataRetriever r1 = r12.a()
            com.bumptech.glide.load.resource.bitmap.o0$f<T> r12 = r8.a     // Catch: java.lang.Throwable -> L6b
            r12.a(r1, r9)     // Catch: java.lang.Throwable -> L6b
            int r4 = r0.intValue()     // Catch: java.lang.Throwable -> L6b
            r5 = r10
            r6 = r11
            android.graphics.Bitmap r9 = e(r1, r2, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L6b
            r1.release()
            com.bumptech.glide.load.engine.bitmap_recycle.e r10 = r8.b
            com.bumptech.glide.load.resource.bitmap.g r9 = com.bumptech.glide.load.resource.bitmap.g.c(r9, r10)
            return r9
        L6b:
            r0 = move-exception
            r9 = r0
            r1.release()
            throw r9
    }
}
