package com.bumptech.glide.load.engine.cache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class i extends com.bumptech.glide.util.h<com.bumptech.glide.load.c, com.bumptech.glide.load.engine.u<?>> implements com.bumptech.glide.load.engine.cache.j {
    private com.bumptech.glide.load.engine.cache.j.a e;

    public i(long r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.bumptech.glide.load.engine.cache.j
    @android.annotation.SuppressLint({"InlinedApi"})
    public void a(int r5) {
            r4 = this;
            r0 = 40
            if (r5 < r0) goto L8
            r4.b()
            return
        L8:
            r0 = 20
            if (r5 >= r0) goto L12
            r0 = 15
            if (r5 != r0) goto L11
            goto L12
        L11:
            return
        L12:
            long r0 = r4.getMaxSize()
            r2 = 2
            long r0 = r0 / r2
            r4.o(r0)
            return
    }

    @Override // com.bumptech.glide.load.engine.cache.j
    @androidx.annotation.Nullable
    public /* bridge */ /* synthetic */ com.bumptech.glide.load.engine.u d(@androidx.annotation.NonNull com.bumptech.glide.load.c r1, @androidx.annotation.Nullable com.bumptech.glide.load.engine.u r2) {
            r0 = this;
            java.lang.Object r1 = super.m(r1, r2)
            com.bumptech.glide.load.engine.u r1 = (com.bumptech.glide.load.engine.u) r1
            return r1
    }

    @Override // com.bumptech.glide.load.engine.cache.j
    @androidx.annotation.Nullable
    public /* bridge */ /* synthetic */ com.bumptech.glide.load.engine.u e(@androidx.annotation.NonNull com.bumptech.glide.load.c r1) {
            r0 = this;
            java.lang.Object r1 = super.n(r1)
            com.bumptech.glide.load.engine.u r1 = (com.bumptech.glide.load.engine.u) r1
            return r1
    }

    @Override // com.bumptech.glide.load.engine.cache.j
    public void f(@androidx.annotation.NonNull com.bumptech.glide.load.engine.cache.j.a r1) {
            r0 = this;
            r0.e = r1
            return
    }

    @Override // com.bumptech.glide.util.h
    protected /* bridge */ /* synthetic */ int k(@androidx.annotation.Nullable com.bumptech.glide.load.engine.u<?> r1) {
            r0 = this;
            com.bumptech.glide.load.engine.u r1 = (com.bumptech.glide.load.engine.u) r1
            int r1 = r0.p(r1)
            return r1
    }

    @Override // com.bumptech.glide.util.h
    protected /* bridge */ /* synthetic */ void l(@androidx.annotation.NonNull com.bumptech.glide.load.c r1, @androidx.annotation.Nullable com.bumptech.glide.load.engine.u<?> r2) {
            r0 = this;
            com.bumptech.glide.load.c r1 = (com.bumptech.glide.load.c) r1
            com.bumptech.glide.load.engine.u r2 = (com.bumptech.glide.load.engine.u) r2
            r0.q(r1, r2)
            return
    }

    protected int p(@androidx.annotation.Nullable com.bumptech.glide.load.engine.u<?> r1) {
            r0 = this;
            if (r1 != 0) goto L8
            r1 = 0
            int r1 = super.k(r1)
            return r1
        L8:
            int r1 = r1.getSize()
            return r1
    }

    protected void q(@androidx.annotation.NonNull com.bumptech.glide.load.c r1, @androidx.annotation.Nullable com.bumptech.glide.load.engine.u<?> r2) {
            r0 = this;
            com.bumptech.glide.load.engine.cache.j$a r1 = r0.e
            if (r1 == 0) goto L9
            if (r2 == 0) goto L9
            r1.d(r2)
        L9:
            return
    }
}
