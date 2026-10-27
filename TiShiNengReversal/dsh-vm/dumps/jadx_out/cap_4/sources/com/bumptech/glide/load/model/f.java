package com.bumptech.glide.load.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class f<Data> implements com.bumptech.glide.load.model.n<java.io.File, Data> {
    private static final java.lang.String b = "FileLoader";
    private final com.bumptech.glide.load.model.f.d<Data> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a<Data> implements com.bumptech.glide.load.model.o<java.io.File, Data> {
        private final com.bumptech.glide.load.model.f.d<Data> a;

        public a(com.bumptech.glide.load.model.f.d<Data> r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        @Override // com.bumptech.glide.load.model.o
        public final void b() {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.load.model.o
        @androidx.annotation.NonNull
        public final com.bumptech.glide.load.model.n<java.io.File, Data> c(@androidx.annotation.NonNull com.bumptech.glide.load.model.r r2) {
                r1 = this;
                com.bumptech.glide.load.model.f r2 = new com.bumptech.glide.load.model.f
                com.bumptech.glide.load.model.f$d<Data> r0 = r1.a
                r2.<init>(r0)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class b extends com.bumptech.glide.load.model.f.a<android.os.ParcelFileDescriptor> {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements com.bumptech.glide.load.model.f.d<android.os.ParcelFileDescriptor> {
            a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // com.bumptech.glide.load.model.f.d
            public java.lang.Class<android.os.ParcelFileDescriptor> a() {
                    r1 = this;
                    java.lang.Class<android.os.ParcelFileDescriptor> r0 = android.os.ParcelFileDescriptor.class
                    return r0
            }

            public void b(android.os.ParcelFileDescriptor r1) throws java.io.IOException {
                    r0 = this;
                    r1.close()
                    return
            }

            public android.os.ParcelFileDescriptor c(java.io.File r2) throws java.io.FileNotFoundException {
                    r1 = this;
                    r0 = 268435456(0x10000000, float:2.524355E-29)
                    android.os.ParcelFileDescriptor r2 = android.os.ParcelFileDescriptor.open(r2, r0)
                    return r2
            }

            @Override // com.bumptech.glide.load.model.f.d
            public /* bridge */ /* synthetic */ void close(android.os.ParcelFileDescriptor r1) throws java.io.IOException {
                    r0 = this;
                    android.os.ParcelFileDescriptor r1 = (android.os.ParcelFileDescriptor) r1
                    r0.b(r1)
                    return
            }

            @Override // com.bumptech.glide.load.model.f.d
            public /* bridge */ /* synthetic */ android.os.ParcelFileDescriptor open(java.io.File r1) throws java.io.FileNotFoundException {
                    r0 = this;
                    android.os.ParcelFileDescriptor r1 = r0.c(r1)
                    return r1
            }
        }

        public b() {
                r1 = this;
                com.bumptech.glide.load.model.f$b$a r0 = new com.bumptech.glide.load.model.f$b$a
                r0.<init>()
                r1.<init>(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class c<Data> implements com.bumptech.glide.load.data.d<Data> {
        private final java.io.File a;
        private final com.bumptech.glide.load.model.f.d<Data> b;
        private Data c;

        c(java.io.File r1, com.bumptech.glide.load.model.f.d<Data> r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        @Override // com.bumptech.glide.load.data.d
        @androidx.annotation.NonNull
        public java.lang.Class<Data> a() {
                r1 = this;
                com.bumptech.glide.load.model.f$d<Data> r0 = r1.b
                java.lang.Class r0 = r0.a()
                return r0
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
                r2 = this;
                Data r0 = r2.c
                if (r0 == 0) goto L9
                com.bumptech.glide.load.model.f$d<Data> r1 = r2.b     // Catch: java.io.IOException -> L9
                r1.close(r0)     // Catch: java.io.IOException -> L9
            L9:
                return
        }

        @Override // com.bumptech.glide.load.data.d
        public void c(@androidx.annotation.NonNull com.bumptech.glide.Priority r3, @androidx.annotation.NonNull com.bumptech.glide.load.data.d.a<? super Data> r4) {
                r2 = this;
                com.bumptech.glide.load.model.f$d<Data> r3 = r2.b     // Catch: java.io.FileNotFoundException -> Le
                java.io.File r0 = r2.a     // Catch: java.io.FileNotFoundException -> Le
                java.lang.Object r3 = r3.open(r0)     // Catch: java.io.FileNotFoundException -> Le
                r2.c = r3     // Catch: java.io.FileNotFoundException -> Le
                r4.d(r3)     // Catch: java.io.FileNotFoundException -> Le
                return
            Le:
                r3 = move-exception
                java.lang.String r0 = "FileLoader"
                r1 = 3
                android.util.Log.isLoggable(r0, r1)
                r4.e(r3)
                return
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.load.data.d
        @androidx.annotation.NonNull
        public com.bumptech.glide.load.DataSource getDataSource() {
                r1 = this;
                com.bumptech.glide.load.DataSource r0 = com.bumptech.glide.load.DataSource.LOCAL
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface d<Data> {
        java.lang.Class<Data> a();

        void close(Data r1) throws java.io.IOException;

        Data open(java.io.File r1) throws java.io.FileNotFoundException;
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class e extends com.bumptech.glide.load.model.f.a<java.io.InputStream> {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements com.bumptech.glide.load.model.f.d<java.io.InputStream> {
            a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // com.bumptech.glide.load.model.f.d
            public java.lang.Class<java.io.InputStream> a() {
                    r1 = this;
                    java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
                    return r0
            }

            public void b(java.io.InputStream r1) throws java.io.IOException {
                    r0 = this;
                    r1.close()
                    return
            }

            public java.io.InputStream c(java.io.File r2) throws java.io.FileNotFoundException {
                    r1 = this;
                    java.io.FileInputStream r0 = new java.io.FileInputStream
                    r0.<init>(r2)
                    return r0
            }

            @Override // com.bumptech.glide.load.model.f.d
            public /* bridge */ /* synthetic */ void close(java.io.InputStream r1) throws java.io.IOException {
                    r0 = this;
                    java.io.InputStream r1 = (java.io.InputStream) r1
                    r0.b(r1)
                    return
            }

            @Override // com.bumptech.glide.load.model.f.d
            public /* bridge */ /* synthetic */ java.io.InputStream open(java.io.File r1) throws java.io.FileNotFoundException {
                    r0 = this;
                    java.io.InputStream r1 = r0.c(r1)
                    return r1
            }
        }

        public e() {
                r1 = this;
                com.bumptech.glide.load.model.f$e$a r0 = new com.bumptech.glide.load.model.f$e$a
                r0.<init>()
                r1.<init>(r0)
                return
        }
    }

    public f(com.bumptech.glide.load.model.f.d<Data> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // com.bumptech.glide.load.model.n
    public /* bridge */ /* synthetic */ com.bumptech.glide.load.model.n.a a(@androidx.annotation.NonNull java.io.File r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.f r4) {
            r0 = this;
            java.io.File r1 = (java.io.File) r1
            com.bumptech.glide.load.model.n$a r1 = r0.c(r1, r2, r3, r4)
            return r1
    }

    @Override // com.bumptech.glide.load.model.n
    public /* bridge */ /* synthetic */ boolean b(@androidx.annotation.NonNull java.io.File r1) {
            r0 = this;
            java.io.File r1 = (java.io.File) r1
            boolean r1 = r0.d(r1)
            return r1
    }

    public com.bumptech.glide.load.model.n.a<Data> c(@androidx.annotation.NonNull java.io.File r2, int r3, int r4, @androidx.annotation.NonNull com.bumptech.glide.load.f r5) {
            r1 = this;
            com.bumptech.glide.load.model.n$a r3 = new com.bumptech.glide.load.model.n$a
            com.bumptech.glide.signature.e r4 = new com.bumptech.glide.signature.e
            r4.<init>(r2)
            com.bumptech.glide.load.model.f$c r5 = new com.bumptech.glide.load.model.f$c
            com.bumptech.glide.load.model.f$d<Data> r0 = r1.a
            r5.<init>(r2, r0)
            r3.<init>(r4, r5)
            return r3
    }

    public boolean d(@androidx.annotation.NonNull java.io.File r1) {
            r0 = this;
            r1 = 1
            return r1
    }
}
