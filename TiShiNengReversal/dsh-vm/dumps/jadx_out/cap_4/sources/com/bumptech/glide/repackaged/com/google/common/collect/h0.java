package com.bumptech.glide.repackaged.com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class h0<K, V> extends com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap<K, V> {
    private final transient java.util.Map.Entry<K, V>[] a;
    private final transient com.bumptech.glide.repackaged.com.google.common.collect.o<K, V>[] b;
    private final transient int c;

    static void a(java.lang.Object r2, java.util.Map.Entry<?, ?> r3, com.bumptech.glide.repackaged.com.google.common.collect.o<?, ?> r4) {
        L0:
            if (r4 == 0) goto L16
            java.lang.Object r0 = r4.getKey()
            boolean r0 = r2.equals(r0)
            r0 = r0 ^ 1
            java.lang.String r1 = "key"
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap.checkNoConflict(r0, r1, r3, r4)
            com.bumptech.glide.repackaged.com.google.common.collect.o r4 = r4.b()
            goto L0
        L16:
            return
    }

    static <V> V b(java.lang.Object r2, com.bumptech.glide.repackaged.com.google.common.collect.o<?, V>[] r3, int r4) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            int r1 = r2.hashCode()
            int r1 = com.bumptech.glide.repackaged.com.google.common.collect.k.b(r1)
            r4 = r4 & r1
            r3 = r3[r4]
        Lf:
            if (r3 == 0) goto L25
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L20
            java.lang.Object r2 = r3.getValue()
            return r2
        L20:
            com.bumptech.glide.repackaged.com.google.common.collect.o r3 = r3.b()
            goto Lf
        L25:
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap
    com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> createEntrySet() {
            r2 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.p$a r0 = new com.bumptech.glide.repackaged.com.google.common.collect.p$a
            java.util.Map$Entry<K, V>[] r1 = r2.a
            r0.<init>(r2, r1)
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap, java.util.Map
    public V get(java.lang.Object r3) {
            r2 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.o<K, V>[] r0 = r2.b
            int r1 = r2.c
            java.lang.Object r3 = b(r3, r0, r1)
            return r3
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap
    boolean isPartialView() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.Map
    public int size() {
            r1 = this;
            java.util.Map$Entry<K, V>[] r0 = r1.a
            int r0 = r0.length
            return r0
    }
}
