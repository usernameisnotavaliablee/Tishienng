package com.bumptech.glide.request.transition;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class c implements com.bumptech.glide.request.transition.g<android.graphics.drawable.Drawable> {
    private final int a;
    private final boolean b;
    private com.bumptech.glide.request.transition.d c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a {
        private static final int c = 300;
        private final int a;
        private boolean b;

        public a() {
                r1 = this;
                r0 = 300(0x12c, float:4.2E-43)
                r1.<init>(r0)
                return
        }

        public a(int r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        public com.bumptech.glide.request.transition.c a() {
                r3 = this;
                com.bumptech.glide.request.transition.c r0 = new com.bumptech.glide.request.transition.c
                int r1 = r3.a
                boolean r2 = r3.b
                r0.<init>(r1, r2)
                return r0
        }

        public com.bumptech.glide.request.transition.c.a b(boolean r1) {
                r0 = this;
                r0.b = r1
                return r0
        }
    }

    protected c(int r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    private com.bumptech.glide.request.transition.f<android.graphics.drawable.Drawable> b() {
            r3 = this;
            com.bumptech.glide.request.transition.d r0 = r3.c
            if (r0 != 0) goto Lf
            com.bumptech.glide.request.transition.d r0 = new com.bumptech.glide.request.transition.d
            int r1 = r3.a
            boolean r2 = r3.b
            r0.<init>(r1, r2)
            r3.c = r0
        Lf:
            com.bumptech.glide.request.transition.d r0 = r3.c
            return r0
    }

    @Override // com.bumptech.glide.request.transition.g
    public com.bumptech.glide.request.transition.f<android.graphics.drawable.Drawable> a(com.bumptech.glide.load.DataSource r1, boolean r2) {
            r0 = this;
            com.bumptech.glide.load.DataSource r2 = com.bumptech.glide.load.DataSource.MEMORY_CACHE
            if (r1 != r2) goto L9
            com.bumptech.glide.request.transition.f r1 = com.bumptech.glide.request.transition.e.b()
            return r1
        L9:
            com.bumptech.glide.request.transition.f r1 = r0.b()
            return r1
    }
}
