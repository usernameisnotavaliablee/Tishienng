package com.bumptech.glide.load.data;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class ParcelFileDescriptorRewinder implements com.bumptech.glide.load.data.e<android.os.ParcelFileDescriptor> {
    private final com.bumptech.glide.load.data.ParcelFileDescriptorRewinder.InternalRewinder a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    private static final class InternalRewinder {
        private final android.os.ParcelFileDescriptor a;

        InternalRewinder(android.os.ParcelFileDescriptor r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        android.os.ParcelFileDescriptor rewind() throws java.io.IOException {
                r4 = this;
                android.os.ParcelFileDescriptor r0 = r4.a     // Catch: android.system.ErrnoException -> L10
                java.io.FileDescriptor r0 = r0.getFileDescriptor()     // Catch: android.system.ErrnoException -> L10
                int r1 = android.system.OsConstants.SEEK_SET     // Catch: android.system.ErrnoException -> L10
                r2 = 0
                android.system.Os.lseek(r0, r2, r1)     // Catch: android.system.ErrnoException -> L10
                android.os.ParcelFileDescriptor r0 = r4.a
                return r0
            L10:
                r0 = move-exception
                java.io.IOException r1 = new java.io.IOException
                r1.<init>(r0)
                throw r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    public static final class a implements com.bumptech.glide.load.data.e.a<android.os.ParcelFileDescriptor> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.data.e.a
        @androidx.annotation.NonNull
        public java.lang.Class<android.os.ParcelFileDescriptor> a() {
                r1 = this;
                java.lang.Class<android.os.ParcelFileDescriptor> r0 = android.os.ParcelFileDescriptor.class
                return r0
        }

        @Override // com.bumptech.glide.load.data.e.a
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ com.bumptech.glide.load.data.e<android.os.ParcelFileDescriptor> b(@androidx.annotation.NonNull android.os.ParcelFileDescriptor r1) {
                r0 = this;
                android.os.ParcelFileDescriptor r1 = (android.os.ParcelFileDescriptor) r1
                com.bumptech.glide.load.data.e r1 = r0.c(r1)
                return r1
        }

        @androidx.annotation.NonNull
        public com.bumptech.glide.load.data.e<android.os.ParcelFileDescriptor> c(@androidx.annotation.NonNull android.os.ParcelFileDescriptor r2) {
                r1 = this;
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = new com.bumptech.glide.load.data.ParcelFileDescriptorRewinder
                r0.<init>(r2)
                return r0
        }
    }

    @androidx.annotation.RequiresApi(21)
    public ParcelFileDescriptorRewinder(android.os.ParcelFileDescriptor r2) {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$InternalRewinder r0 = new com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$InternalRewinder
            r0.<init>(r2)
            r1.a = r0
            return
    }

    public static boolean c() {
            r0 = 1
            return r0
    }

    @Override // com.bumptech.glide.load.data.e
    @androidx.annotation.NonNull
    @androidx.annotation.RequiresApi(21)
    public /* bridge */ /* synthetic */ android.os.ParcelFileDescriptor a() throws java.io.IOException {
            r1 = this;
            android.os.ParcelFileDescriptor r0 = r1.d()
            return r0
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
            r0 = this;
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RequiresApi(21)
    public android.os.ParcelFileDescriptor d() throws java.io.IOException {
            r1 = this;
            com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$InternalRewinder r0 = r1.a
            android.os.ParcelFileDescriptor r0 = r0.rewind()
            return r0
    }
}
