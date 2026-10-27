package com.bumptech.glide.request.transition;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class i<R> implements com.bumptech.glide.request.transition.g<R> {
    private final com.bumptech.glide.request.transition.j.a a;
    private com.bumptech.glide.request.transition.j<R> b;

    public i(com.bumptech.glide.request.transition.j.a r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // com.bumptech.glide.request.transition.g
    public com.bumptech.glide.request.transition.f<R> a(com.bumptech.glide.load.DataSource r2, boolean r3) {
            r1 = this;
            com.bumptech.glide.load.DataSource r0 = com.bumptech.glide.load.DataSource.MEMORY_CACHE
            if (r2 == r0) goto L17
            if (r3 != 0) goto L7
            goto L17
        L7:
            com.bumptech.glide.request.transition.j<R> r2 = r1.b
            if (r2 != 0) goto L14
            com.bumptech.glide.request.transition.j r2 = new com.bumptech.glide.request.transition.j
            com.bumptech.glide.request.transition.j$a r3 = r1.a
            r2.<init>(r3)
            r1.b = r2
        L14:
            com.bumptech.glide.request.transition.j<R> r2 = r1.b
            return r2
        L17:
            com.bumptech.glide.request.transition.f r2 = com.bumptech.glide.request.transition.e.b()
            return r2
    }
}
