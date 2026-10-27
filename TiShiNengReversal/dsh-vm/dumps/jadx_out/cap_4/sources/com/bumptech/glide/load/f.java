package com.bumptech.glide.load;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class f implements com.bumptech.glide.load.c {
    private final androidx.collection.ArrayMap<com.bumptech.glide.load.e<?>, java.lang.Object> c;

    public f() {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.util.CachedHashCodeArrayMap r0 = new com.bumptech.glide.util.CachedHashCodeArrayMap
            r0.<init>()
            r1.c = r0
            return
    }

    private static <T> void f(@androidx.annotation.NonNull com.bumptech.glide.load.e<T> r0, @androidx.annotation.NonNull java.lang.Object r1, @androidx.annotation.NonNull java.security.MessageDigest r2) {
            r0.update(r1, r2)
            return
    }

    @Override // com.bumptech.glide.load.c
    public void b(@androidx.annotation.NonNull java.security.MessageDigest r4) {
            r3 = this;
            r0 = 0
        L1:
            androidx.collection.ArrayMap<com.bumptech.glide.load.e<?>, java.lang.Object> r1 = r3.c
            int r1 = r1.size()
            if (r0 >= r1) goto L1d
            androidx.collection.ArrayMap<com.bumptech.glide.load.e<?>, java.lang.Object> r1 = r3.c
            java.lang.Object r1 = r1.keyAt(r0)
            com.bumptech.glide.load.e r1 = (com.bumptech.glide.load.e) r1
            androidx.collection.ArrayMap<com.bumptech.glide.load.e<?>, java.lang.Object> r2 = r3.c
            java.lang.Object r2 = r2.valueAt(r0)
            f(r1, r2, r4)
            int r0 = r0 + 1
            goto L1
        L1d:
            return
    }

    @androidx.annotation.Nullable
    public <T> T c(@androidx.annotation.NonNull com.bumptech.glide.load.e<T> r2) {
            r1 = this;
            androidx.collection.ArrayMap<com.bumptech.glide.load.e<?>, java.lang.Object> r0 = r1.c
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto Lf
            androidx.collection.ArrayMap<com.bumptech.glide.load.e<?>, java.lang.Object> r0 = r1.c
            java.lang.Object r2 = r0.get(r2)
            return r2
        Lf:
            java.lang.Object r2 = r2.d()
            return r2
    }

    public void d(@androidx.annotation.NonNull com.bumptech.glide.load.f r2) {
            r1 = this;
            androidx.collection.ArrayMap<com.bumptech.glide.load.e<?>, java.lang.Object> r0 = r1.c
            androidx.collection.ArrayMap<com.bumptech.glide.load.e<?>, java.lang.Object> r2 = r2.c
            r0.putAll(r2)
            return
    }

    @androidx.annotation.NonNull
    public <T> com.bumptech.glide.load.f e(@androidx.annotation.NonNull com.bumptech.glide.load.e<T> r2, @androidx.annotation.NonNull T r3) {
            r1 = this;
            androidx.collection.ArrayMap<com.bumptech.glide.load.e<?>, java.lang.Object> r0 = r1.c
            r0.put(r2, r3)
            return r1
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.bumptech.glide.load.f
            if (r0 == 0) goto Lf
            com.bumptech.glide.load.f r2 = (com.bumptech.glide.load.f) r2
            androidx.collection.ArrayMap<com.bumptech.glide.load.e<?>, java.lang.Object> r0 = r1.c
            androidx.collection.ArrayMap<com.bumptech.glide.load.e<?>, java.lang.Object> r2 = r2.c
            boolean r2 = r0.equals(r2)
            return r2
        Lf:
            r2 = 0
            return r2
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
            r1 = this;
            androidx.collection.ArrayMap<com.bumptech.glide.load.e<?>, java.lang.Object> r0 = r1.c
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Options{values="
            r0.append(r1)
            androidx.collection.ArrayMap<com.bumptech.glide.load.e<?>, java.lang.Object> r1 = r2.c
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
