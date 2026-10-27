package com.bumptech.glide.load;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class b {
    private static final int a = 5242880;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements com.bumptech.glide.load.b.g {
        final /* synthetic */ java.io.InputStream a;

        a(java.io.InputStream r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.b.g
        public com.bumptech.glide.load.ImageHeaderParser.ImageType getType(com.bumptech.glide.load.ImageHeaderParser r2) throws java.io.IOException {
                r1 = this;
                java.io.InputStream r0 = r1.a     // Catch: java.lang.Throwable -> Lc
                com.bumptech.glide.load.ImageHeaderParser$ImageType r2 = r2.getType(r0)     // Catch: java.lang.Throwable -> Lc
                java.io.InputStream r0 = r1.a
                r0.reset()
                return r2
            Lc:
                r2 = move-exception
                java.io.InputStream r0 = r1.a
                r0.reset()
                throw r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.bumptech.glide.load.b$b, reason: collision with other inner class name */
    class C0016b implements com.bumptech.glide.load.b.g {
        final /* synthetic */ java.nio.ByteBuffer a;

        C0016b(java.nio.ByteBuffer r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.b.g
        public com.bumptech.glide.load.ImageHeaderParser.ImageType getType(com.bumptech.glide.load.ImageHeaderParser r2) throws java.io.IOException {
                r1 = this;
                java.nio.ByteBuffer r0 = r1.a
                com.bumptech.glide.load.ImageHeaderParser$ImageType r2 = r2.getType(r0)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements com.bumptech.glide.load.b.g {
        final /* synthetic */ com.bumptech.glide.load.data.ParcelFileDescriptorRewinder a;
        final /* synthetic */ com.bumptech.glide.load.engine.bitmap_recycle.b b;

        c(com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r1, com.bumptech.glide.load.engine.bitmap_recycle.b r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.b.g
        public com.bumptech.glide.load.ImageHeaderParser.ImageType getType(com.bumptech.glide.load.ImageHeaderParser r5) throws java.io.IOException {
                r4 = this;
                r0 = 0
                com.bumptech.glide.load.resource.bitmap.f0 r1 = new com.bumptech.glide.load.resource.bitmap.f0     // Catch: java.lang.Throwable -> L27
                java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L27
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r3 = r4.a     // Catch: java.lang.Throwable -> L27
                android.os.ParcelFileDescriptor r3 = r3.d()     // Catch: java.lang.Throwable -> L27
                java.io.FileDescriptor r3 = r3.getFileDescriptor()     // Catch: java.lang.Throwable -> L27
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L27
                com.bumptech.glide.load.engine.bitmap_recycle.b r3 = r4.b     // Catch: java.lang.Throwable -> L27
                r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L27
                com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = r5.getType(r1)     // Catch: java.lang.Throwable -> L24
                r1.close()     // Catch: java.io.IOException -> L1e
            L1e:
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = r4.a
                r0.d()
                return r5
            L24:
                r5 = move-exception
                r0 = r1
                goto L28
            L27:
                r5 = move-exception
            L28:
                if (r0 == 0) goto L2d
                r0.close()     // Catch: java.io.IOException -> L2d
            L2d:
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = r4.a
                r0.d()
                throw r5
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d implements com.bumptech.glide.load.b.f {
        final /* synthetic */ java.io.InputStream a;
        final /* synthetic */ com.bumptech.glide.load.engine.bitmap_recycle.b b;

        d(java.io.InputStream r1, com.bumptech.glide.load.engine.bitmap_recycle.b r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.b.f
        public int a(com.bumptech.glide.load.ImageHeaderParser r3) throws java.io.IOException {
                r2 = this;
                java.io.InputStream r0 = r2.a     // Catch: java.lang.Throwable -> Le
                com.bumptech.glide.load.engine.bitmap_recycle.b r1 = r2.b     // Catch: java.lang.Throwable -> Le
                int r3 = r3.b(r0, r1)     // Catch: java.lang.Throwable -> Le
                java.io.InputStream r0 = r2.a
                r0.reset()
                return r3
            Le:
                r3 = move-exception
                java.io.InputStream r0 = r2.a
                r0.reset()
                throw r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e implements com.bumptech.glide.load.b.f {
        final /* synthetic */ com.bumptech.glide.load.data.ParcelFileDescriptorRewinder a;
        final /* synthetic */ com.bumptech.glide.load.engine.bitmap_recycle.b b;

        e(com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r1, com.bumptech.glide.load.engine.bitmap_recycle.b r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.b.f
        public int a(com.bumptech.glide.load.ImageHeaderParser r5) throws java.io.IOException {
                r4 = this;
                r0 = 0
                com.bumptech.glide.load.resource.bitmap.f0 r1 = new com.bumptech.glide.load.resource.bitmap.f0     // Catch: java.lang.Throwable -> L29
                java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L29
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r3 = r4.a     // Catch: java.lang.Throwable -> L29
                android.os.ParcelFileDescriptor r3 = r3.d()     // Catch: java.lang.Throwable -> L29
                java.io.FileDescriptor r3 = r3.getFileDescriptor()     // Catch: java.lang.Throwable -> L29
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L29
                com.bumptech.glide.load.engine.bitmap_recycle.b r3 = r4.b     // Catch: java.lang.Throwable -> L29
                r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L29
                com.bumptech.glide.load.engine.bitmap_recycle.b r0 = r4.b     // Catch: java.lang.Throwable -> L26
                int r5 = r5.b(r1, r0)     // Catch: java.lang.Throwable -> L26
                r1.close()     // Catch: java.io.IOException -> L20
            L20:
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = r4.a
                r0.d()
                return r5
            L26:
                r5 = move-exception
                r0 = r1
                goto L2a
            L29:
                r5 = move-exception
            L2a:
                if (r0 == 0) goto L2f
                r0.close()     // Catch: java.io.IOException -> L2f
            L2f:
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = r4.a
                r0.d()
                throw r5
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private interface f {
        int a(com.bumptech.glide.load.ImageHeaderParser r1) throws java.io.IOException;
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private interface g {
        com.bumptech.glide.load.ImageHeaderParser.ImageType getType(com.bumptech.glide.load.ImageHeaderParser r1) throws java.io.IOException;
    }

    private b() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.RequiresApi(21)
    public static int a(@androidx.annotation.NonNull java.util.List<com.bumptech.glide.load.ImageHeaderParser> r1, @androidx.annotation.NonNull com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r2, @androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.b r3) throws java.io.IOException {
            com.bumptech.glide.load.b$e r0 = new com.bumptech.glide.load.b$e
            r0.<init>(r2, r3)
            int r1 = c(r1, r0)
            return r1
    }

    public static int b(@androidx.annotation.NonNull java.util.List<com.bumptech.glide.load.ImageHeaderParser> r1, @androidx.annotation.Nullable java.io.InputStream r2, @androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.b r3) throws java.io.IOException {
            if (r2 != 0) goto L4
            r1 = -1
            return r1
        L4:
            boolean r0 = r2.markSupported()
            if (r0 != 0) goto L10
            com.bumptech.glide.load.resource.bitmap.f0 r0 = new com.bumptech.glide.load.resource.bitmap.f0
            r0.<init>(r2, r3)
            r2 = r0
        L10:
            r0 = 5242880(0x500000, float:7.34684E-39)
            r2.mark(r0)
            com.bumptech.glide.load.b$d r0 = new com.bumptech.glide.load.b$d
            r0.<init>(r2, r3)
            int r1 = c(r1, r0)
            return r1
    }

    private static int c(@androidx.annotation.NonNull java.util.List<com.bumptech.glide.load.ImageHeaderParser> r4, com.bumptech.glide.load.b.f r5) throws java.io.IOException {
            int r0 = r4.size()
            r1 = 0
        L5:
            r2 = -1
            if (r1 >= r0) goto L18
            java.lang.Object r3 = r4.get(r1)
            com.bumptech.glide.load.ImageHeaderParser r3 = (com.bumptech.glide.load.ImageHeaderParser) r3
            int r3 = r5.a(r3)
            if (r3 == r2) goto L15
            return r3
        L15:
            int r1 = r1 + 1
            goto L5
        L18:
            return r2
    }

    @androidx.annotation.NonNull
    private static com.bumptech.glide.load.ImageHeaderParser.ImageType d(@androidx.annotation.NonNull java.util.List<com.bumptech.glide.load.ImageHeaderParser> r4, com.bumptech.glide.load.b.g r5) throws java.io.IOException {
            int r0 = r4.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L19
            java.lang.Object r2 = r4.get(r1)
            com.bumptech.glide.load.ImageHeaderParser r2 = (com.bumptech.glide.load.ImageHeaderParser) r2
            com.bumptech.glide.load.ImageHeaderParser$ImageType r2 = r5.getType(r2)
            com.bumptech.glide.load.ImageHeaderParser$ImageType r3 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            if (r2 == r3) goto L16
            return r2
        L16:
            int r1 = r1 + 1
            goto L5
        L19:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r4 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            return r4
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RequiresApi(21)
    public static com.bumptech.glide.load.ImageHeaderParser.ImageType getType(@androidx.annotation.NonNull java.util.List<com.bumptech.glide.load.ImageHeaderParser> r1, @androidx.annotation.NonNull com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r2, @androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.b r3) throws java.io.IOException {
            com.bumptech.glide.load.b$c r0 = new com.bumptech.glide.load.b$c
            r0.<init>(r2, r3)
            com.bumptech.glide.load.ImageHeaderParser$ImageType r1 = d(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    public static com.bumptech.glide.load.ImageHeaderParser.ImageType getType(@androidx.annotation.NonNull java.util.List<com.bumptech.glide.load.ImageHeaderParser> r1, @androidx.annotation.Nullable java.io.InputStream r2, @androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.b r3) throws java.io.IOException {
            if (r2 != 0) goto L5
            com.bumptech.glide.load.ImageHeaderParser$ImageType r1 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            return r1
        L5:
            boolean r0 = r2.markSupported()
            if (r0 != 0) goto L11
            com.bumptech.glide.load.resource.bitmap.f0 r0 = new com.bumptech.glide.load.resource.bitmap.f0
            r0.<init>(r2, r3)
            r2 = r0
        L11:
            r3 = 5242880(0x500000, float:7.34684E-39)
            r2.mark(r3)
            com.bumptech.glide.load.b$a r3 = new com.bumptech.glide.load.b$a
            r3.<init>(r2)
            com.bumptech.glide.load.ImageHeaderParser$ImageType r1 = d(r1, r3)
            return r1
    }

    @androidx.annotation.NonNull
    public static com.bumptech.glide.load.ImageHeaderParser.ImageType getType(@androidx.annotation.NonNull java.util.List<com.bumptech.glide.load.ImageHeaderParser> r1, @androidx.annotation.Nullable java.nio.ByteBuffer r2) throws java.io.IOException {
            if (r2 != 0) goto L5
            com.bumptech.glide.load.ImageHeaderParser$ImageType r1 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            return r1
        L5:
            com.bumptech.glide.load.b$b r0 = new com.bumptech.glide.load.b$b
            r0.<init>(r2)
            com.bumptech.glide.load.ImageHeaderParser$ImageType r1 = d(r1, r0)
            return r1
    }
}
