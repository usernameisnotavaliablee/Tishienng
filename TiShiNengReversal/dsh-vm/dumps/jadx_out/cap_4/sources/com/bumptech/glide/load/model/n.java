package com.bumptech.glide.load.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface n<Model, Data> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a<Data> {
        public final com.bumptech.glide.load.c a;
        public final java.util.List<com.bumptech.glide.load.c> b;
        public final com.bumptech.glide.load.data.d<Data> c;

        public a(@androidx.annotation.NonNull com.bumptech.glide.load.c r2, @androidx.annotation.NonNull com.bumptech.glide.load.data.d<Data> r3) {
                r1 = this;
                java.util.List r0 = java.util.Collections.EMPTY_LIST
                r1.<init>(r2, r0, r3)
                return
        }

        public a(@androidx.annotation.NonNull com.bumptech.glide.load.c r1, @androidx.annotation.NonNull java.util.List<com.bumptech.glide.load.c> r2, @androidx.annotation.NonNull com.bumptech.glide.load.data.d<Data> r3) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.bumptech.glide.util.k.d(r1)
                com.bumptech.glide.load.c r1 = (com.bumptech.glide.load.c) r1
                r0.a = r1
                java.lang.Object r1 = com.bumptech.glide.util.k.d(r2)
                java.util.List r1 = (java.util.List) r1
                r0.b = r1
                java.lang.Object r1 = com.bumptech.glide.util.k.d(r3)
                com.bumptech.glide.load.data.d r1 = (com.bumptech.glide.load.data.d) r1
                r0.c = r1
                return
        }
    }

    @androidx.annotation.Nullable
    com.bumptech.glide.load.model.n.a<Data> a(@androidx.annotation.NonNull Model r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.f r4);

    boolean b(@androidx.annotation.NonNull Model r1);
}
