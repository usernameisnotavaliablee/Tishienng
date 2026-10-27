package com.bumptech.glide.load.engine.bitmap_recycle;

import com.bumptech.glide.load.engine.bitmap_recycle.n;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
abstract class d<T extends com.bumptech.glide.load.engine.bitmap_recycle.n> {
    private static final int b = 20;
    private final java.util.Queue<T> a;

    d() {
            r1 = this;
            r1.<init>()
            r0 = 20
            java.util.Queue r0 = com.bumptech.glide.util.l.f(r0)
            r1.a = r0
            return
    }

    abstract T a();

    T b() {
            r1 = this;
            java.util.Queue<T extends com.bumptech.glide.load.engine.bitmap_recycle.n> r0 = r1.a
            java.lang.Object r0 = r0.poll()
            com.bumptech.glide.load.engine.bitmap_recycle.n r0 = (com.bumptech.glide.load.engine.bitmap_recycle.n) r0
            if (r0 != 0) goto Le
            com.bumptech.glide.load.engine.bitmap_recycle.n r0 = r1.a()
        Le:
            return r0
    }

    public void c(T r3) {
            r2 = this;
            java.util.Queue<T extends com.bumptech.glide.load.engine.bitmap_recycle.n> r0 = r2.a
            int r0 = r0.size()
            r1 = 20
            if (r0 >= r1) goto Lf
            java.util.Queue<T extends com.bumptech.glide.load.engine.bitmap_recycle.n> r0 = r2.a
            r0.offer(r3)
        Lf:
            return
    }
}
