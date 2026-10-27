package com.bumptech.glide.load.engine;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class v implements com.bumptech.glide.load.engine.f, com.bumptech.glide.load.data.d.a<java.lang.Object> {
    private final com.bumptech.glide.load.engine.f.a a;
    private final com.bumptech.glide.load.engine.g<?> b;
    private int c;
    private int d;
    private com.bumptech.glide.load.c e;
    private java.util.List<com.bumptech.glide.load.model.n<java.io.File, ?>> f;
    private int g;
    private volatile com.bumptech.glide.load.model.n.a<?> h;
    private java.io.File i;
    private com.bumptech.glide.load.engine.w j;

    v(com.bumptech.glide.load.engine.g<?> r2, com.bumptech.glide.load.engine.f.a r3) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.d = r0
            r1.b = r2
            r1.a = r3
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
            r13 = this;
            com.bumptech.glide.load.engine.g<?> r0 = r13.b
            java.util.List r0 = r0.c()
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto Le
            return r2
        Le:
            com.bumptech.glide.load.engine.g<?> r1 = r13.b
            java.util.List r1 = r1.m()
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L54
            com.bumptech.glide.load.engine.g<?> r0 = r13.b
            java.lang.Class r0 = r0.q()
            java.lang.Class<java.io.File> r1 = java.io.File.class
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L29
            return r2
        L29:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to find any load path from "
            r1.append(r2)
            com.bumptech.glide.load.engine.g<?> r2 = r13.b
            java.lang.Class r2 = r2.i()
            r1.append(r2)
            java.lang.String r2 = " to "
            r1.append(r2)
            com.bumptech.glide.load.engine.g<?> r2 = r13.b
            java.lang.Class r2 = r2.q()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L54:
            java.util.List<com.bumptech.glide.load.model.n<java.io.File, ?>> r3 = r13.f
            r4 = 1
            if (r3 == 0) goto Lb7
            boolean r3 = r13.b()
            if (r3 != 0) goto L60
            goto Lb7
        L60:
            r0 = 0
            r13.h = r0
        L63:
            if (r2 != 0) goto Lb6
            boolean r0 = r13.b()
            if (r0 == 0) goto Lb6
            java.util.List<com.bumptech.glide.load.model.n<java.io.File, ?>> r0 = r13.f
            int r1 = r13.g
            int r3 = r1 + 1
            r13.g = r3
            java.lang.Object r0 = r0.get(r1)
            com.bumptech.glide.load.model.n r0 = (com.bumptech.glide.load.model.n) r0
            java.io.File r1 = r13.i
            com.bumptech.glide.load.engine.g<?> r3 = r13.b
            int r3 = r3.s()
            com.bumptech.glide.load.engine.g<?> r5 = r13.b
            int r5 = r5.f()
            com.bumptech.glide.load.engine.g<?> r6 = r13.b
            com.bumptech.glide.load.f r6 = r6.k()
            com.bumptech.glide.load.model.n$a r0 = r0.a(r1, r3, r5, r6)
            r13.h = r0
            com.bumptech.glide.load.model.n$a<?> r0 = r13.h
            if (r0 == 0) goto L63
            com.bumptech.glide.load.engine.g<?> r0 = r13.b
            com.bumptech.glide.load.model.n$a<?> r1 = r13.h
            com.bumptech.glide.load.data.d<Data> r1 = r1.c
            java.lang.Class r1 = r1.a()
            boolean r0 = r0.t(r1)
            if (r0 == 0) goto L63
            com.bumptech.glide.load.model.n$a<?> r0 = r13.h
            com.bumptech.glide.load.data.d<Data> r0 = r0.c
            com.bumptech.glide.load.engine.g<?> r1 = r13.b
            com.bumptech.glide.Priority r1 = r1.l()
            r0.c(r1, r13)
            r2 = 1
            goto L63
        Lb6:
            return r2
        Lb7:
            int r3 = r13.d
            int r3 = r3 + r4
            r13.d = r3
            int r5 = r1.size()
            if (r3 < r5) goto Ld0
            int r3 = r13.c
            int r3 = r3 + r4
            r13.c = r3
            int r4 = r0.size()
            if (r3 < r4) goto Lce
            return r2
        Lce:
            r13.d = r2
        Ld0:
            int r3 = r13.c
            java.lang.Object r3 = r0.get(r3)
            r6 = r3
            com.bumptech.glide.load.c r6 = (com.bumptech.glide.load.c) r6
            int r3 = r13.d
            java.lang.Object r3 = r1.get(r3)
            r11 = r3
            java.lang.Class r11 = (java.lang.Class) r11
            com.bumptech.glide.load.engine.g<?> r3 = r13.b
            com.bumptech.glide.load.i r10 = r3.r(r11)
            com.bumptech.glide.load.engine.w r4 = new com.bumptech.glide.load.engine.w
            com.bumptech.glide.load.engine.g<?> r3 = r13.b
            com.bumptech.glide.load.engine.bitmap_recycle.b r5 = r3.b()
            com.bumptech.glide.load.engine.g<?> r3 = r13.b
            com.bumptech.glide.load.c r7 = r3.o()
            com.bumptech.glide.load.engine.g<?> r3 = r13.b
            int r8 = r3.s()
            com.bumptech.glide.load.engine.g<?> r3 = r13.b
            int r9 = r3.f()
            com.bumptech.glide.load.engine.g<?> r3 = r13.b
            com.bumptech.glide.load.f r12 = r3.k()
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r13.j = r4
            com.bumptech.glide.load.engine.g<?> r3 = r13.b
            com.bumptech.glide.load.engine.cache.a r3 = r3.d()
            com.bumptech.glide.load.engine.w r4 = r13.j
            java.io.File r3 = r3.b(r4)
            r13.i = r3
            if (r3 == 0) goto L54
            r13.e = r6
            com.bumptech.glide.load.engine.g<?> r4 = r13.b
            java.util.List r3 = r4.j(r3)
            r13.f = r3
            r13.g = r2
            goto L54
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
            com.bumptech.glide.load.engine.f$a r0 = r6.a
            com.bumptech.glide.load.c r1 = r6.e
            com.bumptech.glide.load.model.n$a<?> r2 = r6.h
            com.bumptech.glide.load.data.d<Data> r3 = r2.c
            com.bumptech.glide.load.DataSource r4 = com.bumptech.glide.load.DataSource.RESOURCE_DISK_CACHE
            com.bumptech.glide.load.engine.w r5 = r6.j
            r2 = r7
            r0.d(r1, r2, r3, r4, r5)
            return
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void e(@androidx.annotation.NonNull java.lang.Exception r5) {
            r4 = this;
            com.bumptech.glide.load.engine.f$a r0 = r4.a
            com.bumptech.glide.load.engine.w r1 = r4.j
            com.bumptech.glide.load.model.n$a<?> r2 = r4.h
            com.bumptech.glide.load.data.d<Data> r2 = r2.c
            com.bumptech.glide.load.DataSource r3 = com.bumptech.glide.load.DataSource.RESOURCE_DISK_CACHE
            r0.b(r1, r5, r2, r3)
            return
    }
}
