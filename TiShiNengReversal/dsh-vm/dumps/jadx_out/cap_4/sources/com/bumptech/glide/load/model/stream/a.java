package com.bumptech.glide.load.model.stream;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class a<Model> implements com.bumptech.glide.load.model.n<Model, java.io.InputStream> {
    private final com.bumptech.glide.load.model.n<com.bumptech.glide.load.model.g, java.io.InputStream> a;

    @androidx.annotation.Nullable
    private final com.bumptech.glide.load.model.m<Model, com.bumptech.glide.load.model.g> b;

    protected a(com.bumptech.glide.load.model.n<com.bumptech.glide.load.model.g, java.io.InputStream> r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    protected a(com.bumptech.glide.load.model.n<com.bumptech.glide.load.model.g, java.io.InputStream> r1, @androidx.annotation.Nullable com.bumptech.glide.load.model.m<Model, com.bumptech.glide.load.model.g> r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    private static java.util.List<com.bumptech.glide.load.c> c(java.util.Collection<java.lang.String> r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r3.size()
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        Ld:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            com.bumptech.glide.load.model.g r2 = new com.bumptech.glide.load.model.g
            r2.<init>(r1)
            r0.add(r2)
            goto Ld
        L22:
            return r0
    }

    @Override // com.bumptech.glide.load.model.n
    @androidx.annotation.Nullable
    public com.bumptech.glide.load.model.n.a<java.io.InputStream> a(@androidx.annotation.NonNull Model r4, int r5, int r6, @androidx.annotation.NonNull com.bumptech.glide.load.f r7) {
            r3 = this;
            com.bumptech.glide.load.model.m<Model, com.bumptech.glide.load.model.g> r0 = r3.b
            r1 = 0
            if (r0 == 0) goto Lc
            java.lang.Object r0 = r0.b(r4, r5, r6)
            com.bumptech.glide.load.model.g r0 = (com.bumptech.glide.load.model.g) r0
            goto Ld
        Lc:
            r0 = r1
        Ld:
            if (r0 != 0) goto L2b
            java.lang.String r0 = r3.f(r4, r5, r6, r7)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L1a
            return r1
        L1a:
            com.bumptech.glide.load.model.g r1 = new com.bumptech.glide.load.model.g
            com.bumptech.glide.load.model.h r2 = r3.e(r4, r5, r6, r7)
            r1.<init>(r0, r2)
            com.bumptech.glide.load.model.m<Model, com.bumptech.glide.load.model.g> r0 = r3.b
            if (r0 == 0) goto L2a
            r0.c(r4, r5, r6, r1)
        L2a:
            r0 = r1
        L2b:
            java.util.List r4 = r3.d(r4, r5, r6, r7)
            com.bumptech.glide.load.model.n<com.bumptech.glide.load.model.g, java.io.InputStream> r1 = r3.a
            com.bumptech.glide.load.model.n$a r5 = r1.a(r0, r5, r6, r7)
            if (r5 == 0) goto L4c
            boolean r6 = r4.isEmpty()
            if (r6 == 0) goto L3e
            goto L4c
        L3e:
            com.bumptech.glide.load.model.n$a r6 = new com.bumptech.glide.load.model.n$a
            com.bumptech.glide.load.c r7 = r5.a
            java.util.List r4 = c(r4)
            com.bumptech.glide.load.data.d<Data> r5 = r5.c
            r6.<init>(r7, r4, r5)
            return r6
        L4c:
            return r5
    }

    protected java.util.List<java.lang.String> d(Model r1, int r2, int r3, com.bumptech.glide.load.f r4) {
            r0 = this;
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            return r1
    }

    @androidx.annotation.Nullable
    protected com.bumptech.glide.load.model.h e(Model r1, int r2, int r3, com.bumptech.glide.load.f r4) {
            r0 = this;
            com.bumptech.glide.load.model.h r1 = com.bumptech.glide.load.model.h.b
            return r1
    }

    protected abstract java.lang.String f(Model r1, int r2, int r3, com.bumptech.glide.load.f r4);
}
