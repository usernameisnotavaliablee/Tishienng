package com.bumptech.glide.request.transition;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j<R> implements com.bumptech.glide.request.transition.f<R> {
    private final com.bumptech.glide.request.transition.j.a a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void a(android.view.View r1);
    }

    public j(com.bumptech.glide.request.transition.j.a r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // com.bumptech.glide.request.transition.f
    public boolean a(R r1, com.bumptech.glide.request.transition.f.a r2) {
            r0 = this;
            android.view.View r1 = r2.getView()
            if (r1 == 0) goto Lf
            com.bumptech.glide.request.transition.j$a r1 = r0.a
            android.view.View r2 = r2.getView()
            r1.a(r2)
        Lf:
            r1 = 0
            return r1
    }
}
