package com.bumptech.glide.request.transition;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class a<R> implements com.bumptech.glide.request.transition.g<R> {
    private final com.bumptech.glide.request.transition.g<android.graphics.drawable.Drawable> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.bumptech.glide.request.transition.a$a, reason: collision with other inner class name */
    private final class C0041a implements com.bumptech.glide.request.transition.f<R> {
        private final com.bumptech.glide.request.transition.f<android.graphics.drawable.Drawable> a;
        final /* synthetic */ com.bumptech.glide.request.transition.a b;

        C0041a(com.bumptech.glide.request.transition.a r1, com.bumptech.glide.request.transition.f<android.graphics.drawable.Drawable> r2) {
                r0 = this;
                r0.b = r1
                r0.<init>()
                r0.a = r2
                return
        }

        @Override // com.bumptech.glide.request.transition.f
        public boolean a(R r4, com.bumptech.glide.request.transition.f.a r5) {
                r3 = this;
                android.view.View r0 = r5.getView()
                android.content.res.Resources r0 = r0.getResources()
                android.graphics.drawable.BitmapDrawable r1 = new android.graphics.drawable.BitmapDrawable
                com.bumptech.glide.request.transition.a r2 = r3.b
                android.graphics.Bitmap r4 = r2.b(r4)
                r1.<init>(r0, r4)
                com.bumptech.glide.request.transition.f<android.graphics.drawable.Drawable> r4 = r3.a
                boolean r4 = r4.a(r1, r5)
                return r4
        }
    }

    public a(com.bumptech.glide.request.transition.g<android.graphics.drawable.Drawable> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // com.bumptech.glide.request.transition.g
    public com.bumptech.glide.request.transition.f<R> a(com.bumptech.glide.load.DataSource r2, boolean r3) {
            r1 = this;
            com.bumptech.glide.request.transition.g<android.graphics.drawable.Drawable> r0 = r1.a
            com.bumptech.glide.request.transition.f r2 = r0.a(r2, r3)
            com.bumptech.glide.request.transition.a$a r3 = new com.bumptech.glide.request.transition.a$a
            r3.<init>(r1, r2)
            return r3
    }

    protected abstract android.graphics.Bitmap b(R r1);
}
