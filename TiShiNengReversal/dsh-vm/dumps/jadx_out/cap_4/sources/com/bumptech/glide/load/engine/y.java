package com.bumptech.glide.load.engine;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class y implements com.bumptech.glide.load.engine.f, com.bumptech.glide.load.engine.f.a {
    private static final java.lang.String h = "SourceGenerator";
    private final com.bumptech.glide.load.engine.g<?> a;
    private final com.bumptech.glide.load.engine.f.a b;
    private int c;
    private com.bumptech.glide.load.engine.c d;
    private java.lang.Object e;
    private volatile com.bumptech.glide.load.model.n.a<?> f;
    private com.bumptech.glide.load.engine.d g;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements com.bumptech.glide.load.data.d.a<java.lang.Object> {
        final /* synthetic */ com.bumptech.glide.load.model.n.a a;
        final /* synthetic */ com.bumptech.glide.load.engine.y b;

        a(com.bumptech.glide.load.engine.y r1, com.bumptech.glide.load.model.n.a r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void d(@androidx.annotation.Nullable java.lang.Object r3) {
                r2 = this;
                com.bumptech.glide.load.engine.y r0 = r2.b
                com.bumptech.glide.load.model.n$a r1 = r2.a
                boolean r0 = r0.g(r1)
                if (r0 == 0) goto L11
                com.bumptech.glide.load.engine.y r0 = r2.b
                com.bumptech.glide.load.model.n$a r1 = r2.a
                r0.h(r1, r3)
            L11:
                return
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void e(@androidx.annotation.NonNull java.lang.Exception r3) {
                r2 = this;
                com.bumptech.glide.load.engine.y r0 = r2.b
                com.bumptech.glide.load.model.n$a r1 = r2.a
                boolean r0 = r0.g(r1)
                if (r0 == 0) goto L11
                com.bumptech.glide.load.engine.y r0 = r2.b
                com.bumptech.glide.load.model.n$a r1 = r2.a
                r0.i(r1, r3)
            L11:
                return
        }
    }

    y(com.bumptech.glide.load.engine.g<?> r1, com.bumptech.glide.load.engine.f.a r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    private void e(java.lang.Object r8) {
            r7 = this;
            long r0 = com.bumptech.glide.util.g.b()
            com.bumptech.glide.load.engine.g<?> r2 = r7.a     // Catch: java.lang.Throwable -> L49
            com.bumptech.glide.load.a r2 = r2.p(r8)     // Catch: java.lang.Throwable -> L49
            com.bumptech.glide.load.engine.e r3 = new com.bumptech.glide.load.engine.e     // Catch: java.lang.Throwable -> L49
            com.bumptech.glide.load.engine.g<?> r4 = r7.a     // Catch: java.lang.Throwable -> L49
            com.bumptech.glide.load.f r4 = r4.k()     // Catch: java.lang.Throwable -> L49
            r3.<init>(r2, r8, r4)     // Catch: java.lang.Throwable -> L49
            com.bumptech.glide.load.engine.d r4 = new com.bumptech.glide.load.engine.d     // Catch: java.lang.Throwable -> L49
            com.bumptech.glide.load.model.n$a<?> r5 = r7.f     // Catch: java.lang.Throwable -> L49
            com.bumptech.glide.load.c r5 = r5.a     // Catch: java.lang.Throwable -> L49
            com.bumptech.glide.load.engine.g<?> r6 = r7.a     // Catch: java.lang.Throwable -> L49
            com.bumptech.glide.load.c r6 = r6.o()     // Catch: java.lang.Throwable -> L49
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> L49
            r7.g = r4     // Catch: java.lang.Throwable -> L49
            com.bumptech.glide.load.engine.g<?> r4 = r7.a     // Catch: java.lang.Throwable -> L49
            com.bumptech.glide.load.engine.cache.a r4 = r4.d()     // Catch: java.lang.Throwable -> L49
            com.bumptech.glide.load.engine.d r5 = r7.g     // Catch: java.lang.Throwable -> L49
            r4.a(r5, r3)     // Catch: java.lang.Throwable -> L49
            java.lang.String r3 = "SourceGenerator"
            r4 = 2
            boolean r3 = android.util.Log.isLoggable(r3, r4)     // Catch: java.lang.Throwable -> L49
            if (r3 == 0) goto L4b
            com.bumptech.glide.load.engine.d r3 = r7.g     // Catch: java.lang.Throwable -> L49
            java.util.Objects.toString(r3)     // Catch: java.lang.Throwable -> L49
            java.util.Objects.toString(r8)     // Catch: java.lang.Throwable -> L49
            java.util.Objects.toString(r2)     // Catch: java.lang.Throwable -> L49
            com.bumptech.glide.util.g.a(r0)     // Catch: java.lang.Throwable -> L49
            goto L4b
        L49:
            r8 = move-exception
            goto L64
        L4b:
            com.bumptech.glide.load.model.n$a<?> r8 = r7.f
            com.bumptech.glide.load.data.d<Data> r8 = r8.c
            r8.b()
            com.bumptech.glide.load.engine.c r8 = new com.bumptech.glide.load.engine.c
            com.bumptech.glide.load.model.n$a<?> r0 = r7.f
            com.bumptech.glide.load.c r0 = r0.a
            java.util.List r0 = java.util.Collections.singletonList(r0)
            com.bumptech.glide.load.engine.g<?> r1 = r7.a
            r8.<init>(r0, r1, r7)
            r7.d = r8
            return
        L64:
            com.bumptech.glide.load.model.n$a<?> r0 = r7.f
            com.bumptech.glide.load.data.d<Data> r0 = r0.c
            r0.b()
            throw r8
    }

    private boolean f() {
            r2 = this;
            int r0 = r2.c
            com.bumptech.glide.load.engine.g<?> r1 = r2.a
            java.util.List r1 = r1.g()
            int r1 = r1.size()
            if (r0 >= r1) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    private void j(com.bumptech.glide.load.model.n.a<?> r4) {
            r3 = this;
            com.bumptech.glide.load.model.n$a<?> r0 = r3.f
            com.bumptech.glide.load.data.d<Data> r0 = r0.c
            com.bumptech.glide.load.engine.g<?> r1 = r3.a
            com.bumptech.glide.Priority r1 = r1.l()
            com.bumptech.glide.load.engine.y$a r2 = new com.bumptech.glide.load.engine.y$a
            r2.<init>(r3, r4)
            r0.c(r1, r2)
            return
    }

    @Override // com.bumptech.glide.load.engine.f
    public boolean a() {
            r5 = this;
            java.lang.Object r0 = r5.e
            r1 = 0
            if (r0 == 0) goto La
            r5.e = r1
            r5.e(r0)
        La:
            com.bumptech.glide.load.engine.c r0 = r5.d
            r2 = 1
            if (r0 == 0) goto L16
            boolean r0 = r0.a()
            if (r0 == 0) goto L16
            return r2
        L16:
            r5.d = r1
            r5.f = r1
            r0 = 0
        L1b:
            if (r0 != 0) goto L66
            boolean r1 = r5.f()
            if (r1 == 0) goto L66
            com.bumptech.glide.load.engine.g<?> r1 = r5.a
            java.util.List r1 = r1.g()
            int r3 = r5.c
            int r4 = r3 + 1
            r5.c = r4
            java.lang.Object r1 = r1.get(r3)
            com.bumptech.glide.load.model.n$a r1 = (com.bumptech.glide.load.model.n.a) r1
            r5.f = r1
            com.bumptech.glide.load.model.n$a<?> r1 = r5.f
            if (r1 == 0) goto L1b
            com.bumptech.glide.load.engine.g<?> r1 = r5.a
            com.bumptech.glide.load.engine.j r1 = r1.e()
            com.bumptech.glide.load.model.n$a<?> r3 = r5.f
            com.bumptech.glide.load.data.d<Data> r3 = r3.c
            com.bumptech.glide.load.DataSource r3 = r3.getDataSource()
            boolean r1 = r1.c(r3)
            if (r1 != 0) goto L5f
            com.bumptech.glide.load.engine.g<?> r1 = r5.a
            com.bumptech.glide.load.model.n$a<?> r3 = r5.f
            com.bumptech.glide.load.data.d<Data> r3 = r3.c
            java.lang.Class r3 = r3.a()
            boolean r1 = r1.t(r3)
            if (r1 == 0) goto L1b
        L5f:
            com.bumptech.glide.load.model.n$a<?> r0 = r5.f
            r5.j(r0)
            r0 = 1
            goto L1b
        L66:
            return r0
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void b(com.bumptech.glide.load.c r2, java.lang.Exception r3, com.bumptech.glide.load.data.d<?> r4, com.bumptech.glide.load.DataSource r5) {
            r1 = this;
            com.bumptech.glide.load.engine.f$a r5 = r1.b
            com.bumptech.glide.load.model.n$a<?> r0 = r1.f
            com.bumptech.glide.load.data.d<Data> r0 = r0.c
            com.bumptech.glide.load.DataSource r0 = r0.getDataSource()
            r5.b(r2, r3, r4, r0)
            return
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void c() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // com.bumptech.glide.load.engine.f
    public void cancel() {
            r1 = this;
            com.bumptech.glide.load.model.n$a<?> r0 = r1.f
            if (r0 == 0) goto L9
            com.bumptech.glide.load.data.d<Data> r0 = r0.c
            r0.cancel()
        L9:
            return
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void d(com.bumptech.glide.load.c r7, java.lang.Object r8, com.bumptech.glide.load.data.d<?> r9, com.bumptech.glide.load.DataSource r10, com.bumptech.glide.load.c r11) {
            r6 = this;
            com.bumptech.glide.load.engine.f$a r0 = r6.b
            com.bumptech.glide.load.model.n$a<?> r10 = r6.f
            com.bumptech.glide.load.data.d<Data> r10 = r10.c
            com.bumptech.glide.load.DataSource r4 = r10.getDataSource()
            r5 = r7
            r1 = r7
            r2 = r8
            r3 = r9
            r0.d(r1, r2, r3, r4, r5)
            return
    }

    boolean g(com.bumptech.glide.load.model.n.a<?> r2) {
            r1 = this;
            com.bumptech.glide.load.model.n$a<?> r0 = r1.f
            if (r0 == 0) goto L8
            if (r0 != r2) goto L8
            r2 = 1
            return r2
        L8:
            r2 = 0
            return r2
    }

    void h(com.bumptech.glide.load.model.n.a<?> r7, java.lang.Object r8) {
            r6 = this;
            com.bumptech.glide.load.engine.g<?> r0 = r6.a
            com.bumptech.glide.load.engine.j r0 = r0.e()
            if (r8 == 0) goto L1c
            com.bumptech.glide.load.data.d<Data> r1 = r7.c
            com.bumptech.glide.load.DataSource r1 = r1.getDataSource()
            boolean r0 = r0.c(r1)
            if (r0 == 0) goto L1c
            r6.e = r8
            com.bumptech.glide.load.engine.f$a r7 = r6.b
            r7.c()
            return
        L1c:
            com.bumptech.glide.load.engine.f$a r0 = r6.b
            com.bumptech.glide.load.c r1 = r7.a
            com.bumptech.glide.load.data.d<Data> r3 = r7.c
            com.bumptech.glide.load.DataSource r4 = r3.getDataSource()
            com.bumptech.glide.load.engine.d r5 = r6.g
            r2 = r8
            r0.d(r1, r2, r3, r4, r5)
            return
    }

    void i(com.bumptech.glide.load.model.n.a<?> r4, @androidx.annotation.NonNull java.lang.Exception r5) {
            r3 = this;
            com.bumptech.glide.load.engine.f$a r0 = r3.b
            com.bumptech.glide.load.engine.d r1 = r3.g
            com.bumptech.glide.load.data.d<Data> r4 = r4.c
            com.bumptech.glide.load.DataSource r2 = r4.getDataSource()
            r0.b(r1, r5, r4, r2)
            return
    }
}
