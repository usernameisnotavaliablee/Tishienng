package com.bumptech.glide;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class d extends android.content.ContextWrapper {

    @androidx.annotation.VisibleForTesting
    static final com.bumptech.glide.j<?, ?> k = null;
    private final com.bumptech.glide.load.engine.bitmap_recycle.b a;
    private final com.bumptech.glide.Registry b;
    private final com.bumptech.glide.request.target.k c;
    private final com.bumptech.glide.b.a d;
    private final java.util.List<com.bumptech.glide.request.g<java.lang.Object>> e;
    private final java.util.Map<java.lang.Class<?>, com.bumptech.glide.j<?, ?>> f;
    private final com.bumptech.glide.load.engine.k g;
    private final com.bumptech.glide.e h;
    private final int i;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("this")
    private com.bumptech.glide.request.h j;

    static {
            com.bumptech.glide.a r0 = new com.bumptech.glide.a
            r0.<init>()
            com.bumptech.glide.d.k = r0
            return
    }

    public d(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.b r2, @androidx.annotation.NonNull com.bumptech.glide.Registry r3, @androidx.annotation.NonNull com.bumptech.glide.request.target.k r4, @androidx.annotation.NonNull com.bumptech.glide.b.a r5, @androidx.annotation.NonNull java.util.Map<java.lang.Class<?>, com.bumptech.glide.j<?, ?>> r6, @androidx.annotation.NonNull java.util.List<com.bumptech.glide.request.g<java.lang.Object>> r7, @androidx.annotation.NonNull com.bumptech.glide.load.engine.k r8, @androidx.annotation.NonNull com.bumptech.glide.e r9, int r10) {
            r0 = this;
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            r0.<init>(r1)
            r0.a = r2
            r0.b = r3
            r0.c = r4
            r0.d = r5
            r0.e = r7
            r0.f = r6
            r0.g = r8
            r0.h = r9
            r0.i = r10
            return
    }

    @androidx.annotation.NonNull
    public <X> com.bumptech.glide.request.target.r<android.widget.ImageView, X> a(@androidx.annotation.NonNull android.widget.ImageView r2, @androidx.annotation.NonNull java.lang.Class<X> r3) {
            r1 = this;
            com.bumptech.glide.request.target.k r0 = r1.c
            com.bumptech.glide.request.target.r r2 = r0.a(r2, r3)
            return r2
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.load.engine.bitmap_recycle.b b() {
            r1 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.b r0 = r1.a
            return r0
    }

    public java.util.List<com.bumptech.glide.request.g<java.lang.Object>> c() {
            r1 = this;
            java.util.List<com.bumptech.glide.request.g<java.lang.Object>> r0 = r1.e
            return r0
    }

    public synchronized com.bumptech.glide.request.h d() {
            r1 = this;
            monitor-enter(r1)
            com.bumptech.glide.request.h r0 = r1.j     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L16
            com.bumptech.glide.b$a r0 = r1.d     // Catch: java.lang.Throwable -> L14
            com.bumptech.glide.request.h r0 = r0.build()     // Catch: java.lang.Throwable -> L14
            com.bumptech.glide.request.a r0 = r0.m0()     // Catch: java.lang.Throwable -> L14
            com.bumptech.glide.request.h r0 = (com.bumptech.glide.request.h) r0     // Catch: java.lang.Throwable -> L14
            r1.j = r0     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r0 = move-exception
            goto L1a
        L16:
            com.bumptech.glide.request.h r0 = r1.j     // Catch: java.lang.Throwable -> L14
            monitor-exit(r1)
            return r0
        L1a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            throw r0
    }

    @androidx.annotation.NonNull
    public <T> com.bumptech.glide.j<?, T> e(@androidx.annotation.NonNull java.lang.Class<T> r5) {
            r4 = this;
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.j<?, ?>> r0 = r4.f
            java.lang.Object r0 = r0.get(r5)
            com.bumptech.glide.j r0 = (com.bumptech.glide.j) r0
            if (r0 != 0) goto L33
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.j<?, ?>> r1 = r4.f
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L14:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L33
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Class r3 = (java.lang.Class) r3
            boolean r3 = r3.isAssignableFrom(r5)
            if (r3 == 0) goto L14
            java.lang.Object r0 = r2.getValue()
            com.bumptech.glide.j r0 = (com.bumptech.glide.j) r0
            goto L14
        L33:
            if (r0 != 0) goto L38
            com.bumptech.glide.j<?, ?> r5 = com.bumptech.glide.d.k
            return r5
        L38:
            return r0
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.load.engine.k f() {
            r1 = this;
            com.bumptech.glide.load.engine.k r0 = r1.g
            return r0
    }

    public com.bumptech.glide.e g() {
            r1 = this;
            com.bumptech.glide.e r0 = r1.h
            return r0
    }

    public int h() {
            r1 = this;
            int r0 = r1.i
            return r0
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.Registry i() {
            r1 = this;
            com.bumptech.glide.Registry r0 = r1.b
            return r0
    }
}
