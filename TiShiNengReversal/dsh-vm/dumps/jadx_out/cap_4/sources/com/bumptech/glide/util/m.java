package com.bumptech.glide.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class m<T> implements com.bumptech.glide.f.b<T>, com.bumptech.glide.request.target.o {
    private int[] a;
    private com.bumptech.glide.util.m.a b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a extends com.bumptech.glide.request.target.f<android.view.View, java.lang.Object> {
        a(@androidx.annotation.NonNull android.view.View r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.bumptech.glide.request.target.p
        public void h(@androidx.annotation.NonNull java.lang.Object r1, @androidx.annotation.Nullable com.bumptech.glide.request.transition.f<? super java.lang.Object> r2) {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.request.target.f
        protected void k(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.request.target.p
        public void o(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
                r0 = this;
                return
        }
    }

    public m() {
            r0 = this;
            r0.<init>()
            return
    }

    public m(@androidx.annotation.NonNull android.view.View r2) {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.util.m$a r0 = new com.bumptech.glide.util.m$a
            r0.<init>(r2)
            r1.b = r0
            r0.q(r1)
            return
    }

    @Override // com.bumptech.glide.f.b
    @androidx.annotation.Nullable
    public int[] a(@androidx.annotation.NonNull T r1, int r2, int r3) {
            r0 = this;
            int[] r1 = r0.a
            if (r1 != 0) goto L6
            r1 = 0
            return r1
        L6:
            int r2 = r1.length
            int[] r1 = java.util.Arrays.copyOf(r1, r2)
            return r1
    }

    public void b(@androidx.annotation.NonNull android.view.View r2) {
            r1 = this;
            int[] r0 = r1.a
            if (r0 != 0) goto L13
            com.bumptech.glide.util.m$a r0 = r1.b
            if (r0 == 0) goto L9
            goto L13
        L9:
            com.bumptech.glide.util.m$a r0 = new com.bumptech.glide.util.m$a
            r0.<init>(r2)
            r1.b = r0
            r0.q(r1)
        L13:
            return
    }

    @Override // com.bumptech.glide.request.target.o
    public void d(int r1, int r2) {
            r0 = this;
            int[] r1 = new int[]{r1, r2}
            r0.a = r1
            r1 = 0
            r0.b = r1
            return
    }
}
