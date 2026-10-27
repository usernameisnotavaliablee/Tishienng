package com.bumptech.glide.load.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class v<Model> implements com.bumptech.glide.load.model.n<Model, Model> {
    private static final com.bumptech.glide.load.model.v<?> a = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a<Model> implements com.bumptech.glide.load.model.o<Model, Model> {
        private static final com.bumptech.glide.load.model.v.a<?> a = null;

        static {
                com.bumptech.glide.load.model.v$a r0 = new com.bumptech.glide.load.model.v$a
                r0.<init>()
                com.bumptech.glide.load.model.v.a.a = r0
                return
        }

        @java.lang.Deprecated
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        public static <T> com.bumptech.glide.load.model.v.a<T> a() {
                com.bumptech.glide.load.model.v$a<?> r0 = com.bumptech.glide.load.model.v.a.a
                return r0
        }

        @Override // com.bumptech.glide.load.model.o
        public void b() {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.load.model.o
        @androidx.annotation.NonNull
        public com.bumptech.glide.load.model.n<Model, Model> c(com.bumptech.glide.load.model.r r1) {
                r0 = this;
                com.bumptech.glide.load.model.v r1 = com.bumptech.glide.load.model.v.c()
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class b<Model> implements com.bumptech.glide.load.data.d<Model> {
        private final Model a;

        b(Model r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        @Override // com.bumptech.glide.load.data.d
        @androidx.annotation.NonNull
        public java.lang.Class<Model> a() {
                r1 = this;
                Model r0 = r1.a
                java.lang.Class r0 = r0.getClass()
                return r0
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.load.data.d
        public void c(@androidx.annotation.NonNull com.bumptech.glide.Priority r1, @androidx.annotation.NonNull com.bumptech.glide.load.data.d.a<? super Model> r2) {
                r0 = this;
                Model r1 = r0.a
                r2.d(r1)
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

    static {
            com.bumptech.glide.load.model.v r0 = new com.bumptech.glide.load.model.v
            r0.<init>()
            com.bumptech.glide.load.model.v.a = r0
            return
    }

    @java.lang.Deprecated
    public v() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T> com.bumptech.glide.load.model.v<T> c() {
            com.bumptech.glide.load.model.v<?> r0 = com.bumptech.glide.load.model.v.a
            return r0
    }

    @Override // com.bumptech.glide.load.model.n
    public com.bumptech.glide.load.model.n.a<Model> a(@androidx.annotation.NonNull Model r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.f r4) {
            r0 = this;
            com.bumptech.glide.load.model.n$a r2 = new com.bumptech.glide.load.model.n$a
            com.bumptech.glide.signature.e r3 = new com.bumptech.glide.signature.e
            r3.<init>(r1)
            com.bumptech.glide.load.model.v$b r4 = new com.bumptech.glide.load.model.v$b
            r4.<init>(r1)
            r2.<init>(r3, r4)
            return r2
    }

    @Override // com.bumptech.glide.load.model.n
    public boolean b(@androidx.annotation.NonNull Model r1) {
            r0 = this;
            r1 = 1
            return r1
    }
}
