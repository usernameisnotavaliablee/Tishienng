package com.bumptech.glide.load.engine;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class c implements com.bumptech.glide.load.engine.f, com.bumptech.glide.load.data.d.a<java.lang.Object> {
    private final java.util.List<com.bumptech.glide.load.c> a;
    private final com.bumptech.glide.load.engine.g<?> b;
    private final com.bumptech.glide.load.engine.f.a c;
    private int d;
    private com.bumptech.glide.load.c e;
    private java.util.List<com.bumptech.glide.load.model.n<java.io.File, ?>> f;
    private int g;
    private volatile com.bumptech.glide.load.model.n.a<?> h;
    private java.io.File i;

    c(com.bumptech.glide.load.engine.g<?> r2, com.bumptech.glide.load.engine.f.a r3) {
            r1 = this;
            java.util.List r0 = r2.c()
            r1.<init>(r0, r2, r3)
            return
    }

    c(java.util.List<com.bumptech.glide.load.c> r2, com.bumptech.glide.load.engine.g<?> r3, com.bumptech.glide.load.engine.f.a r4) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.d = r0
            r1.a = r2
            r1.b = r3
            r1.c = r4
            return
    }

    private boolean b() {
            r2 = this;
            int r0 = r2.g
            java.util.List<com.bumptech.glide.load.model.n<java.io.File, ?>> r1 = r2.f
            int r1 = r1.size()
            if (r0 >= r1) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @Override // com.bumptech.glide.load.engine.f
    public boolean a() {
            r7 = this;
        L0:
            java.util.List<com.bumptech.glide.load.model.n<java.io.File, ?>> r0 = r7.f
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L64
            boolean r0 = r7.b()
            if (r0 != 0) goto Ld
            goto L64
        Ld:
            r0 = 0
            r7.h = r0
        L10:
            if (r2 != 0) goto L63
            boolean r0 = r7.b()
            if (r0 == 0) goto L63
            java.util.List<com.bumptech.glide.load.model.n<java.io.File, ?>> r0 = r7.f
            int r3 = r7.g
            int r4 = r3 + 1
            r7.g = r4
            java.lang.Object r0 = r0.get(r3)
            com.bumptech.glide.load.model.n r0 = (com.bumptech.glide.load.model.n) r0
            java.io.File r3 = r7.i
            com.bumptech.glide.load.engine.g<?> r4 = r7.b
            int r4 = r4.s()
            com.bumptech.glide.load.engine.g<?> r5 = r7.b
            int r5 = r5.f()
            com.bumptech.glide.load.engine.g<?> r6 = r7.b
            com.bumptech.glide.load.f r6 = r6.k()
            com.bumptech.glide.load.model.n$a r0 = r0.a(r3, r4, r5, r6)
            r7.h = r0
            com.bumptech.glide.load.model.n$a<?> r0 = r7.h
            if (r0 == 0) goto L10
            com.bumptech.glide.load.engine.g<?> r0 = r7.b
            com.bumptech.glide.load.model.n$a<?> r3 = r7.h
            com.bumptech.glide.load.data.d<Data> r3 = r3.c
            java.lang.Class r3 = r3.a()
            boolean r0 = r0.t(r3)
            if (r0 == 0) goto L10
            com.bumptech.glide.load.model.n$a<?> r0 = r7.h
            com.bumptech.glide.load.data.d<Data> r0 = r0.c
            com.bumptech.glide.load.engine.g<?> r2 = r7.b
            com.bumptech.glide.Priority r2 = r2.l()
            r0.c(r2, r7)
            r2 = 1
            goto L10
        L63:
            return r2
        L64:
            int r0 = r7.d
            int r0 = r0 + r1
            r7.d = r0
            java.util.List<com.bumptech.glide.load.c> r1 = r7.a
            int r1 = r1.size()
            if (r0 < r1) goto L72
            return r2
        L72:
            java.util.List<com.bumptech.glide.load.c> r0 = r7.a
            int r1 = r7.d
            java.lang.Object r0 = r0.get(r1)
            com.bumptech.glide.load.c r0 = (com.bumptech.glide.load.c) r0
            com.bumptech.glide.load.engine.d r1 = new com.bumptech.glide.load.engine.d
            com.bumptech.glide.load.engine.g<?> r3 = r7.b
            com.bumptech.glide.load.c r3 = r3.o()
            r1.<init>(r0, r3)
            com.bumptech.glide.load.engine.g<?> r3 = r7.b
            com.bumptech.glide.load.engine.cache.a r3 = r3.d()
            java.io.File r1 = r3.b(r1)
            r7.i = r1
            if (r1 == 0) goto L0
            r7.e = r0
            com.bumptech.glide.load.engine.g<?> r0 = r7.b
            java.util.List r0 = r0.j(r1)
            r7.f = r0
            r7.g = r2
            goto L0
    }

    @Override // com.bumptech.glide.load.engine.f
    public void cancel() {
            r1 = this;
            com.bumptech.glide.load.model.n$a<?> r0 = r1.h
            if (r0 == 0) goto L9
            com.bumptech.glide.load.data.d<Data> r0 = r0.c
            r0.cancel()
        L9:
            return
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void d(java.lang.Object r7) {
            r6 = this;
            com.bumptech.glide.load.engine.f$a r0 = r6.c
            com.bumptech.glide.load.c r1 = r6.e
            com.bumptech.glide.load.model.n$a<?> r2 = r6.h
            com.bumptech.glide.load.data.d<Data> r3 = r2.c
            com.bumptech.glide.load.DataSource r4 = com.bumptech.glide.load.DataSource.DATA_DISK_CACHE
            com.bumptech.glide.load.c r5 = r6.e
            r2 = r7
            r0.d(r1, r2, r3, r4, r5)
            return
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void e(@androidx.annotation.NonNull java.lang.Exception r5) {
            r4 = this;
            com.bumptech.glide.load.engine.f$a r0 = r4.c
            com.bumptech.glide.load.c r1 = r4.e
            com.bumptech.glide.load.model.n$a<?> r2 = r4.h
            com.bumptech.glide.load.data.d<Data> r2 = r2.c
            com.bumptech.glide.load.DataSource r3 = com.bumptech.glide.load.DataSource.DATA_DISK_CACHE
            r0.b(r1, r5, r2, r3)
            return
    }
}
