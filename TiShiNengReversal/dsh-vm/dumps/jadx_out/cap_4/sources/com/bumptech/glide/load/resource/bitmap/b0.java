package com.bumptech.glide.load.resource.bitmap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
interface b0 {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a implements com.bumptech.glide.load.resource.bitmap.b0 {
        private final com.bumptech.glide.load.data.k a;
        private final com.bumptech.glide.load.engine.bitmap_recycle.b b;
        private final java.util.List<com.bumptech.glide.load.ImageHeaderParser> c;

        a(java.io.InputStream r2, java.util.List<com.bumptech.glide.load.ImageHeaderParser> r3, com.bumptech.glide.load.engine.bitmap_recycle.b r4) {
                r1 = this;
                r1.<init>()
                java.lang.Object r0 = com.bumptech.glide.util.k.d(r4)
                com.bumptech.glide.load.engine.bitmap_recycle.b r0 = (com.bumptech.glide.load.engine.bitmap_recycle.b) r0
                r1.b = r0
                java.lang.Object r3 = com.bumptech.glide.util.k.d(r3)
                java.util.List r3 = (java.util.List) r3
                r1.c = r3
                com.bumptech.glide.load.data.k r3 = new com.bumptech.glide.load.data.k
                r3.<init>(r2, r4)
                r1.a = r3
                return
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b0
        public void a() {
                r1 = this;
                com.bumptech.glide.load.data.k r0 = r1.a
                r0.c()
                return
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b0
        public int b() throws java.io.IOException {
                r3 = this;
                java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r3.c
                com.bumptech.glide.load.data.k r1 = r3.a
                java.io.InputStream r1 = r1.d()
                com.bumptech.glide.load.engine.bitmap_recycle.b r2 = r3.b
                int r0 = com.bumptech.glide.load.b.b(r0, r1, r2)
                return r0
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b0
        @androidx.annotation.Nullable
        public android.graphics.Bitmap c(android.graphics.BitmapFactory.Options r3) throws java.io.IOException {
                r2 = this;
                com.bumptech.glide.load.data.k r0 = r2.a
                java.io.InputStream r0 = r0.d()
                r1 = 0
                android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeStream(r0, r1, r3)
                return r3
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b0
        public com.bumptech.glide.load.ImageHeaderParser.ImageType d() throws java.io.IOException {
                r3 = this;
                java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r3.c
                com.bumptech.glide.load.data.k r1 = r3.a
                java.io.InputStream r1 = r1.d()
                com.bumptech.glide.load.engine.bitmap_recycle.b r2 = r3.b
                com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = com.bumptech.glide.load.b.getType(r0, r1, r2)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    public static final class b implements com.bumptech.glide.load.resource.bitmap.b0 {
        private final com.bumptech.glide.load.engine.bitmap_recycle.b a;
        private final java.util.List<com.bumptech.glide.load.ImageHeaderParser> b;
        private final com.bumptech.glide.load.data.ParcelFileDescriptorRewinder c;

        b(android.os.ParcelFileDescriptor r1, java.util.List<com.bumptech.glide.load.ImageHeaderParser> r2, com.bumptech.glide.load.engine.bitmap_recycle.b r3) {
                r0 = this;
                r0.<init>()
                java.lang.Object r3 = com.bumptech.glide.util.k.d(r3)
                com.bumptech.glide.load.engine.bitmap_recycle.b r3 = (com.bumptech.glide.load.engine.bitmap_recycle.b) r3
                r0.a = r3
                java.lang.Object r2 = com.bumptech.glide.util.k.d(r2)
                java.util.List r2 = (java.util.List) r2
                r0.b = r2
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r2 = new com.bumptech.glide.load.data.ParcelFileDescriptorRewinder
                r2.<init>(r1)
                r0.c = r2
                return
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b0
        public void a() {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b0
        public int b() throws java.io.IOException {
                r3 = this;
                java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r3.b
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r1 = r3.c
                com.bumptech.glide.load.engine.bitmap_recycle.b r2 = r3.a
                int r0 = com.bumptech.glide.load.b.a(r0, r1, r2)
                return r0
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b0
        @androidx.annotation.Nullable
        public android.graphics.Bitmap c(android.graphics.BitmapFactory.Options r3) throws java.io.IOException {
                r2 = this;
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = r2.c
                android.os.ParcelFileDescriptor r0 = r0.d()
                java.io.FileDescriptor r0 = r0.getFileDescriptor()
                r1 = 0
                android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeFileDescriptor(r0, r1, r3)
                return r3
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b0
        public com.bumptech.glide.load.ImageHeaderParser.ImageType d() throws java.io.IOException {
                r3 = this;
                java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r3.b
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r1 = r3.c
                com.bumptech.glide.load.engine.bitmap_recycle.b r2 = r3.a
                com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = com.bumptech.glide.load.b.getType(r0, r1, r2)
                return r0
        }
    }

    void a();

    int b() throws java.io.IOException;

    @androidx.annotation.Nullable
    android.graphics.Bitmap c(android.graphics.BitmapFactory.Options r1) throws java.io.IOException;

    com.bumptech.glide.load.ImageHeaderParser.ImageType d() throws java.io.IOException;
}
