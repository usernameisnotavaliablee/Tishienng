package com.bumptech.glide.manager;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class t implements com.bumptech.glide.manager.m {
    private final java.util.Set<com.bumptech.glide.request.target.p<?>> a;

    public t() {
            r1 = this;
            r1.<init>()
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            r1.a = r0
            return
    }

    public void a() {
            r1 = this;
            java.util.Set<com.bumptech.glide.request.target.p<?>> r0 = r1.a
            r0.clear()
            return
    }

    @androidx.annotation.NonNull
    public java.util.List<com.bumptech.glide.request.target.p<?>> c() {
            r1 = this;
            java.util.Set<com.bumptech.glide.request.target.p<?>> r0 = r1.a
            java.util.List r0 = com.bumptech.glide.util.l.k(r0)
            return r0
    }

    public void e(@androidx.annotation.NonNull com.bumptech.glide.request.target.p<?> r2) {
            r1 = this;
            java.util.Set<com.bumptech.glide.request.target.p<?>> r0 = r1.a
            r0.add(r2)
            return
    }

    public void f(@androidx.annotation.NonNull com.bumptech.glide.request.target.p<?> r2) {
            r1 = this;
            java.util.Set<com.bumptech.glide.request.target.p<?>> r0 = r1.a
            r0.remove(r2)
            return
    }

    @Override // com.bumptech.glide.manager.m
    public void onDestroy() {
            r2 = this;
            java.util.Set<com.bumptech.glide.request.target.p<?>> r0 = r2.a
            java.util.List r0 = com.bumptech.glide.util.l.k(r0)
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.request.target.p r1 = (com.bumptech.glide.request.target.p) r1
            r1.onDestroy()
            goto La
        L1a:
            return
    }

    @Override // com.bumptech.glide.manager.m
    public void onStart() {
            r2 = this;
            java.util.Set<com.bumptech.glide.request.target.p<?>> r0 = r2.a
            java.util.List r0 = com.bumptech.glide.util.l.k(r0)
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.request.target.p r1 = (com.bumptech.glide.request.target.p) r1
            r1.onStart()
            goto La
        L1a:
            return
    }

    @Override // com.bumptech.glide.manager.m
    public void onStop() {
            r2 = this;
            java.util.Set<com.bumptech.glide.request.target.p<?>> r0 = r2.a
            java.util.List r0 = com.bumptech.glide.util.l.k(r0)
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.request.target.p r1 = (com.bumptech.glide.request.target.p) r1
            r1.onStop()
            goto La
        L1a:
            return
    }
}
