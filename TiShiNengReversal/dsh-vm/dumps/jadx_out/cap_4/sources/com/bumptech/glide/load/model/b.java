package com.bumptech.glide.load.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class b<Data> implements com.bumptech.glide.load.model.n<byte[], Data> {
    private final com.bumptech.glide.load.model.b.InterfaceC0029b<Data> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a implements com.bumptech.glide.load.model.o<byte[], java.nio.ByteBuffer> {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bumptech.glide.load.model.b$a$a, reason: collision with other inner class name */
        class C0028a implements com.bumptech.glide.load.model.b.InterfaceC0029b<java.nio.ByteBuffer> {
            final /* synthetic */ com.bumptech.glide.load.model.b.a a;

            C0028a(com.bumptech.glide.load.model.b.a r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // com.bumptech.glide.load.model.b.InterfaceC0029b
            public java.lang.Class<java.nio.ByteBuffer> a() {
                    r1 = this;
                    java.lang.Class<java.nio.ByteBuffer> r0 = java.nio.ByteBuffer.class
                    return r0
            }

            @Override // com.bumptech.glide.load.model.b.InterfaceC0029b
            public /* bridge */ /* synthetic */ java.nio.ByteBuffer b(byte[] r1) {
                    r0 = this;
                    java.nio.ByteBuffer r1 = r0.c(r1)
                    return r1
            }

            public java.nio.ByteBuffer c(byte[] r1) {
                    r0 = this;
                    java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1)
                    return r1
            }
        }

        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.model.o
        public void b() {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.load.model.o
        @androidx.annotation.NonNull
        public com.bumptech.glide.load.model.n<byte[], java.nio.ByteBuffer> c(@androidx.annotation.NonNull com.bumptech.glide.load.model.r r2) {
                r1 = this;
                com.bumptech.glide.load.model.b r2 = new com.bumptech.glide.load.model.b
                com.bumptech.glide.load.model.b$a$a r0 = new com.bumptech.glide.load.model.b$a$a
                r0.<init>(r1)
                r2.<init>(r0)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.bumptech.glide.load.model.b$b, reason: collision with other inner class name */
    public interface InterfaceC0029b<Data> {
        java.lang.Class<Data> a();

        Data b(byte[] r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class c<Data> implements com.bumptech.glide.load.data.d<Data> {
        private final byte[] a;
        private final com.bumptech.glide.load.model.b.InterfaceC0029b<Data> b;

        c(byte[] r1, com.bumptech.glide.load.model.b.InterfaceC0029b<Data> r2) {
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
                com.bumptech.glide.load.model.b$b<Data> r0 = r1.b
                java.lang.Class r0 = r0.a()
                return r0
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.load.data.d
        public void c(@androidx.annotation.NonNull com.bumptech.glide.Priority r2, @androidx.annotation.NonNull com.bumptech.glide.load.data.d.a<? super Data> r3) {
                r1 = this;
                com.bumptech.glide.load.model.b$b<Data> r2 = r1.b
                byte[] r0 = r1.a
                java.lang.Object r2 = r2.b(r0)
                r3.d(r2)
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
    public static class d implements com.bumptech.glide.load.model.o<byte[], java.io.InputStream> {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements com.bumptech.glide.load.model.b.InterfaceC0029b<java.io.InputStream> {
            final /* synthetic */ com.bumptech.glide.load.model.b.d a;

            a(com.bumptech.glide.load.model.b.d r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // com.bumptech.glide.load.model.b.InterfaceC0029b
            public java.lang.Class<java.io.InputStream> a() {
                    r1 = this;
                    java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
                    return r0
            }

            @Override // com.bumptech.glide.load.model.b.InterfaceC0029b
            public /* bridge */ /* synthetic */ java.io.InputStream b(byte[] r1) {
                    r0 = this;
                    java.io.InputStream r1 = r0.c(r1)
                    return r1
            }

            public java.io.InputStream c(byte[] r2) {
                    r1 = this;
                    java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
                    r0.<init>(r2)
                    return r0
            }
        }

        public d() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.model.o
        public void b() {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.load.model.o
        @androidx.annotation.NonNull
        public com.bumptech.glide.load.model.n<byte[], java.io.InputStream> c(@androidx.annotation.NonNull com.bumptech.glide.load.model.r r2) {
                r1 = this;
                com.bumptech.glide.load.model.b r2 = new com.bumptech.glide.load.model.b
                com.bumptech.glide.load.model.b$d$a r0 = new com.bumptech.glide.load.model.b$d$a
                r0.<init>(r1)
                r2.<init>(r0)
                return r2
        }
    }

    public b(com.bumptech.glide.load.model.b.InterfaceC0029b<Data> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // com.bumptech.glide.load.model.n
    public /* bridge */ /* synthetic */ com.bumptech.glide.load.model.n.a a(@androidx.annotation.NonNull byte[] r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.f r4) {
            r0 = this;
            byte[] r1 = (byte[]) r1
            com.bumptech.glide.load.model.n$a r1 = r0.c(r1, r2, r3, r4)
            return r1
    }

    @Override // com.bumptech.glide.load.model.n
    public /* bridge */ /* synthetic */ boolean b(@androidx.annotation.NonNull byte[] r1) {
            r0 = this;
            byte[] r1 = (byte[]) r1
            boolean r1 = r0.d(r1)
            return r1
    }

    public com.bumptech.glide.load.model.n.a<Data> c(@androidx.annotation.NonNull byte[] r2, int r3, int r4, @androidx.annotation.NonNull com.bumptech.glide.load.f r5) {
            r1 = this;
            com.bumptech.glide.load.model.n$a r3 = new com.bumptech.glide.load.model.n$a
            com.bumptech.glide.signature.e r4 = new com.bumptech.glide.signature.e
            r4.<init>(r2)
            com.bumptech.glide.load.model.b$c r5 = new com.bumptech.glide.load.model.b$c
            com.bumptech.glide.load.model.b$b<Data> r0 = r1.a
            r5.<init>(r2, r0)
            r3.<init>(r4, r5)
            return r3
    }

    public boolean d(@androidx.annotation.NonNull byte[] r1) {
            r0 = this;
            r1 = 1
            return r1
    }
}
