package com.bumptech.glide.request.transition;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class d implements com.bumptech.glide.request.transition.f<android.graphics.drawable.Drawable> {
    private final int a;
    private final boolean b;

    public d(int r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // com.bumptech.glide.request.transition.f
    public /* bridge */ /* synthetic */ boolean a(android.graphics.drawable.Drawable r1, com.bumptech.glide.request.transition.f.a r2) {
            r0 = this;
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            boolean r1 = r0.b(r1, r2)
            return r1
    }

    public boolean b(android.graphics.drawable.Drawable r5, com.bumptech.glide.request.transition.f.a r6) {
            r4 = this;
            android.graphics.drawable.Drawable r0 = r6.a()
            r1 = 0
            if (r0 != 0) goto Lc
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
        Lc:
            android.graphics.drawable.TransitionDrawable r2 = new android.graphics.drawable.TransitionDrawable
            r3 = 2
            android.graphics.drawable.Drawable[] r3 = new android.graphics.drawable.Drawable[r3]
            r3[r1] = r0
            r0 = 1
            r3[r0] = r5
            r2.<init>(r3)
            boolean r5 = r4.b
            r2.setCrossFadeEnabled(r5)
            int r5 = r4.a
            r2.startTransition(r5)
            r6.c(r2)
            return r0
    }
}
