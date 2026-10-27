package com.bumptech.glide.load.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class e<Model, Data> implements com.bumptech.glide.load.model.n<Model, Data> {
    private static final java.lang.String b = "data:image";
    private static final java.lang.String c = ";base64";
    private final com.bumptech.glide.load.model.e.a<Data> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a<Data> {
        java.lang.Class<Data> a();

        void close(Data r1) throws java.io.IOException;

        Data decode(java.lang.String r1) throws java.lang.IllegalArgumentException;
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class b<Data> implements com.bumptech.glide.load.data.d<Data> {
        private final java.lang.String a;
        private final com.bumptech.glide.load.model.e.a<Data> b;
        private Data c;

        b(java.lang.String r1, com.bumptech.glide.load.model.e.a<Data> r2) {
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
                com.bumptech.glide.load.model.e$a<Data> r0 = r1.b
                java.lang.Class r0 = r0.a()
                return r0
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
                r2 = this;
                com.bumptech.glide.load.model.e$a<Data> r0 = r2.b     // Catch: java.io.IOException -> L7
                Data r1 = r2.c     // Catch: java.io.IOException -> L7
                r0.close(r1)     // Catch: java.io.IOException -> L7
            L7:
                return
        }

        @Override // com.bumptech.glide.load.data.d
        public void c(@androidx.annotation.NonNull com.bumptech.glide.Priority r2, @androidx.annotation.NonNull com.bumptech.glide.load.data.d.a<? super Data> r3) {
                r1 = this;
                com.bumptech.glide.load.model.e$a<Data> r2 = r1.b     // Catch: java.lang.IllegalArgumentException -> Le
                java.lang.String r0 = r1.a     // Catch: java.lang.IllegalArgumentException -> Le
                java.lang.Object r2 = r2.decode(r0)     // Catch: java.lang.IllegalArgumentException -> Le
                r1.c = r2     // Catch: java.lang.IllegalArgumentException -> Le
                r3.d(r2)     // Catch: java.lang.IllegalArgumentException -> Le
                return
            Le:
                r2 = move-exception
                r3.e(r2)
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
    public static final class c<Model> implements com.bumptech.glide.load.model.o<Model, java.io.InputStream> {
        private final com.bumptech.glide.load.model.e.a<java.io.InputStream> a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements com.bumptech.glide.load.model.e.a<java.io.InputStream> {
            final /* synthetic */ com.bumptech.glide.load.model.e.c a;

            a(com.bumptech.glide.load.model.e.c r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // com.bumptech.glide.load.model.e.a
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

            public java.io.InputStream c(java.lang.String r5) {
                    r4 = this;
                    java.lang.String r0 = "data:image"
                    boolean r0 = r5.startsWith(r0)
                    if (r0 == 0) goto L3e
                    r0 = 44
                    int r0 = r5.indexOf(r0)
                    r1 = -1
                    if (r0 == r1) goto L36
                    r1 = 0
                    java.lang.String r2 = r5.substring(r1, r0)
                    java.lang.String r3 = ";base64"
                    boolean r2 = r2.endsWith(r3)
                    if (r2 == 0) goto L2e
                    int r0 = r0 + 1
                    java.lang.String r5 = r5.substring(r0)
                    byte[] r5 = android.util.Base64.decode(r5, r1)
                    java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
                    r0.<init>(r5)
                    return r0
                L2e:
                    java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                    java.lang.String r0 = "Not a base64 image data URL."
                    r5.<init>(r0)
                    throw r5
                L36:
                    java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                    java.lang.String r0 = "Missing comma in data URL."
                    r5.<init>(r0)
                    throw r5
                L3e:
                    java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                    java.lang.String r0 = "Not a valid image data URL."
                    r5.<init>(r0)
                    throw r5
            }

            @Override // com.bumptech.glide.load.model.e.a
            public /* bridge */ /* synthetic */ void close(java.io.InputStream r1) throws java.io.IOException {
                    r0 = this;
                    java.io.InputStream r1 = (java.io.InputStream) r1
                    r0.b(r1)
                    return
            }

            @Override // com.bumptech.glide.load.model.e.a
            public /* bridge */ /* synthetic */ java.io.InputStream decode(java.lang.String r1) throws java.lang.IllegalArgumentException {
                    r0 = this;
                    java.io.InputStream r1 = r0.c(r1)
                    return r1
            }
        }

        public c() {
                r1 = this;
                r1.<init>()
                com.bumptech.glide.load.model.e$c$a r0 = new com.bumptech.glide.load.model.e$c$a
                r0.<init>(r1)
                r1.a = r0
                return
        }

        @Override // com.bumptech.glide.load.model.o
        public void b() {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.load.model.o
        @androidx.annotation.NonNull
        public com.bumptech.glide.load.model.n<Model, java.io.InputStream> c(@androidx.annotation.NonNull com.bumptech.glide.load.model.r r2) {
                r1 = this;
                com.bumptech.glide.load.model.e r2 = new com.bumptech.glide.load.model.e
                com.bumptech.glide.load.model.e$a<java.io.InputStream> r0 = r1.a
                r2.<init>(r0)
                return r2
        }
    }

    public e(com.bumptech.glide.load.model.e.a<Data> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // com.bumptech.glide.load.model.n
    public com.bumptech.glide.load.model.n.a<Data> a(@androidx.annotation.NonNull Model r2, int r3, int r4, @androidx.annotation.NonNull com.bumptech.glide.load.f r5) {
            r1 = this;
            com.bumptech.glide.load.model.n$a r3 = new com.bumptech.glide.load.model.n$a
            com.bumptech.glide.signature.e r4 = new com.bumptech.glide.signature.e
            r4.<init>(r2)
            com.bumptech.glide.load.model.e$b r5 = new com.bumptech.glide.load.model.e$b
            java.lang.String r2 = r2.toString()
            com.bumptech.glide.load.model.e$a<Data> r0 = r1.a
            r5.<init>(r2, r0)
            r3.<init>(r4, r5)
            return r3
    }

    @Override // com.bumptech.glide.load.model.n
    public boolean b(@androidx.annotation.NonNull Model r2) {
            r1 = this;
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "data:image"
            boolean r2 = r2.startsWith(r0)
            return r2
    }
}
