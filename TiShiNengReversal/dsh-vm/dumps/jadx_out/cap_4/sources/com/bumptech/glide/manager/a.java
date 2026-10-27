package com.bumptech.glide.manager;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class a implements com.bumptech.glide.manager.l {
    private final java.util.Set<com.bumptech.glide.manager.m> a;
    private boolean b;
    private boolean c;

    a() {
            r1 = this;
            r1.<init>()
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            r1.a = r0
            return
    }

    @Override // com.bumptech.glide.manager.l
    public void a(@androidx.annotation.NonNull com.bumptech.glide.manager.m r2) {
            r1 = this;
            java.util.Set<com.bumptech.glide.manager.m> r0 = r1.a
            r0.remove(r2)
            return
    }

    @Override // com.bumptech.glide.manager.l
    public void b(@androidx.annotation.NonNull com.bumptech.glide.manager.m r2) {
            r1 = this;
            java.util.Set<com.bumptech.glide.manager.m> r0 = r1.a
            r0.add(r2)
            boolean r0 = r1.c
            if (r0 == 0) goto Ld
            r2.onDestroy()
            return
        Ld:
            boolean r0 = r1.b
            if (r0 == 0) goto L15
            r2.onStart()
            return
        L15:
            r2.onStop()
            return
    }

    void c() {
            r2 = this;
            r0 = 1
            r2.c = r0
            java.util.Set<com.bumptech.glide.manager.m> r0 = r2.a
            java.util.List r0 = com.bumptech.glide.util.l.k(r0)
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.manager.m r1 = (com.bumptech.glide.manager.m) r1
            r1.onDestroy()
            goto Ld
        L1d:
            return
    }

    void d() {
            r2 = this;
            r0 = 1
            r2.b = r0
            java.util.Set<com.bumptech.glide.manager.m> r0 = r2.a
            java.util.List r0 = com.bumptech.glide.util.l.k(r0)
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.manager.m r1 = (com.bumptech.glide.manager.m) r1
            r1.onStart()
            goto Ld
        L1d:
            return
    }

    void e() {
            r2 = this;
            r0 = 0
            r2.b = r0
            java.util.Set<com.bumptech.glide.manager.m> r0 = r2.a
            java.util.List r0 = com.bumptech.glide.util.l.k(r0)
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.manager.m r1 = (com.bumptech.glide.manager.m) r1
            r1.onStop()
            goto Ld
        L1d:
            return
    }
}
