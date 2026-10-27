package com.bumptech.glide.load.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class d implements com.bumptech.glide.load.model.n<java.io.File, java.nio.ByteBuffer> {
    private static final java.lang.String a = "ByteBufferFileLoader";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class a implements com.bumptech.glide.load.data.d<java.nio.ByteBuffer> {
        private final java.io.File a;

        a(java.io.File r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        @Override // com.bumptech.glide.load.data.d
        @androidx.annotation.NonNull
        public java.lang.Class<java.nio.ByteBuffer> a() {
                r1 = this;
                java.lang.Class<java.nio.ByteBuffer> r0 = java.nio.ByteBuffer.class
                return r0
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.load.data.d
        public void c(@androidx.annotation.NonNull com.bumptech.glide.Priority r3, @androidx.annotation.NonNull com.bumptech.glide.load.data.d.a<? super java.nio.ByteBuffer> r4) {
                r2 = this;
                java.io.File r3 = r2.a     // Catch: java.io.IOException -> La
                java.nio.ByteBuffer r3 = com.bumptech.glide.util.a.a(r3)     // Catch: java.io.IOException -> La
                r4.d(r3)     // Catch: java.io.IOException -> La
                return
            La:
                r3 = move-exception
                java.lang.String r0 = "ByteBufferFileLoader"
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
    public static class b implements com.bumptech.glide.load.model.o<java.io.File, java.nio.ByteBuffer> {
        public b() {
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
        public com.bumptech.glide.load.model.n<java.io.File, java.nio.ByteBuffer> c(@androidx.annotation.NonNull com.bumptech.glide.load.model.r r1) {
                r0 = this;
                com.bumptech.glide.load.model.d r1 = new com.bumptech.glide.load.model.d
                r1.<init>()
                return r1
        }
    }

    public d() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bumptech.glide.load.model.n
    public /* bridge */ /* synthetic */ com.bumptech.glide.load.model.n.a<java.nio.ByteBuffer> a(@androidx.annotation.NonNull java.io.File r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.f r4) {
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

    public com.bumptech.glide.load.model.n.a<java.nio.ByteBuffer> c(@androidx.annotation.NonNull java.io.File r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.f r4) {
            r0 = this;
            com.bumptech.glide.load.model.n$a r2 = new com.bumptech.glide.load.model.n$a
            com.bumptech.glide.signature.e r3 = new com.bumptech.glide.signature.e
            r3.<init>(r1)
            com.bumptech.glide.load.model.d$a r4 = new com.bumptech.glide.load.model.d$a
            r4.<init>(r1)
            r2.<init>(r3, r4)
            return r2
    }

    public boolean d(@androidx.annotation.NonNull java.io.File r1) {
            r0 = this;
            r1 = 1
            return r1
    }
}
