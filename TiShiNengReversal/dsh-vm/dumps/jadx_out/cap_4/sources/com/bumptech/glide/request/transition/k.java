package com.bumptech.glide.request.transition;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class k<R> implements com.bumptech.glide.request.transition.f<R> {
    private final com.bumptech.glide.request.transition.k.a a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface a {
        android.view.animation.Animation a(android.content.Context r1);
    }

    k(com.bumptech.glide.request.transition.k.a r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // com.bumptech.glide.request.transition.f
    public boolean a(R r2, com.bumptech.glide.request.transition.f.a r3) {
            r1 = this;
            android.view.View r2 = r3.getView()
            if (r2 == 0) goto L16
            r2.clearAnimation()
            com.bumptech.glide.request.transition.k$a r3 = r1.a
            android.content.Context r0 = r2.getContext()
            android.view.animation.Animation r3 = r3.a(r0)
            r2.startAnimation(r3)
        L16:
            r2 = 0
            return r2
    }
}
