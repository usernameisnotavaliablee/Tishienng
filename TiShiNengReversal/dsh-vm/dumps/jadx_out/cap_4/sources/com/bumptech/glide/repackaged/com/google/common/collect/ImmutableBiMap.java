package com.bumptech.glide.repackaged.com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class ImmutableBiMap<K, V> extends com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap<K, V> implements com.bumptech.glide.repackaged.com.google.common.collect.d {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a<K, V> extends com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap.b<K, V> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap.b
        public /* bridge */ /* synthetic */ com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap.b b(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                com.bumptech.glide.repackaged.com.google.common.collect.ImmutableBiMap$a r1 = r0.d(r1, r2)
                return r1
        }

        public com.bumptech.glide.repackaged.com.google.common.collect.ImmutableBiMap<K, V> c() {
                r6 = this;
                int r0 = r6.c
                if (r0 == 0) goto L54
                r1 = 1
                r2 = 0
                if (r0 == r1) goto L3f
                java.util.Comparator<? super V> r3 = r6.a
                if (r3 == 0) goto L2f
                boolean r3 = r6.d
                if (r3 == 0) goto L1a
                com.bumptech.glide.repackaged.com.google.common.collect.o<K, V>[] r3 = r6.b
                java.lang.Object[] r0 = com.bumptech.glide.repackaged.com.google.common.collect.a0.a(r3, r0)
                com.bumptech.glide.repackaged.com.google.common.collect.o[] r0 = (com.bumptech.glide.repackaged.com.google.common.collect.o[]) r0
                r6.b = r0
            L1a:
                com.bumptech.glide.repackaged.com.google.common.collect.o<K, V>[] r0 = r6.b
                int r3 = r6.c
                java.util.Comparator<? super V> r4 = r6.a
                com.bumptech.glide.repackaged.com.google.common.collect.b0 r4 = com.bumptech.glide.repackaged.com.google.common.collect.b0.a(r4)
                com.bumptech.glide.repackaged.com.google.common.base.a r5 = com.bumptech.glide.repackaged.com.google.common.collect.x.d()
                com.bumptech.glide.repackaged.com.google.common.collect.b0 r4 = r4.c(r5)
                java.util.Arrays.sort(r0, r2, r3, r4)
            L2f:
                int r0 = r6.c
                com.bumptech.glide.repackaged.com.google.common.collect.o<K, V>[] r3 = r6.b
                int r4 = r3.length
                if (r0 != r4) goto L37
                goto L38
            L37:
                r1 = 0
            L38:
                r6.d = r1
                com.bumptech.glide.repackaged.com.google.common.collect.f0 r0 = com.bumptech.glide.repackaged.com.google.common.collect.f0.f(r0, r3)
                return r0
            L3f:
                com.bumptech.glide.repackaged.com.google.common.collect.o<K, V>[] r0 = r6.b
                r0 = r0[r2]
                java.lang.Object r0 = r0.getKey()
                com.bumptech.glide.repackaged.com.google.common.collect.o<K, V>[] r1 = r6.b
                r1 = r1[r2]
                java.lang.Object r1 = r1.getValue()
                com.bumptech.glide.repackaged.com.google.common.collect.ImmutableBiMap r0 = com.bumptech.glide.repackaged.com.google.common.collect.ImmutableBiMap.of(r0, r1)
                return r0
            L54:
                com.bumptech.glide.repackaged.com.google.common.collect.ImmutableBiMap r0 = com.bumptech.glide.repackaged.com.google.common.collect.ImmutableBiMap.of()
                return r0
        }

        public com.bumptech.glide.repackaged.com.google.common.collect.ImmutableBiMap.a<K, V> d(K r1, V r2) {
                r0 = this;
                super.b(r1, r2)
                return r0
        }
    }

    ImmutableBiMap() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <K, V> com.bumptech.glide.repackaged.com.google.common.collect.ImmutableBiMap.a<K, V> builder() {
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableBiMap$a r0 = new com.bumptech.glide.repackaged.com.google.common.collect.ImmutableBiMap$a
            r0.<init>()
            return r0
    }

    public static <K, V> com.bumptech.glide.repackaged.com.google.common.collect.ImmutableBiMap<K, V> of() {
            com.bumptech.glide.repackaged.com.google.common.collect.f0<java.lang.Object, java.lang.Object> r0 = com.bumptech.glide.repackaged.com.google.common.collect.f0.g
            return r0
    }

    public static <K, V> com.bumptech.glide.repackaged.com.google.common.collect.ImmutableBiMap<K, V> of(K r1, V r2) {
            com.bumptech.glide.repackaged.com.google.common.collect.n0 r0 = new com.bumptech.glide.repackaged.com.google.common.collect.n0
            r0.<init>(r1, r2)
            return r0
    }

    public abstract com.bumptech.glide.repackaged.com.google.common.collect.ImmutableBiMap<V, K> inverse();

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap, java.util.Map
    public /* bridge */ /* synthetic */ com.bumptech.glide.repackaged.com.google.common.collect.ImmutableCollection values() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet r0 = r1.values()
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap, java.util.Map
    public com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet<V> values() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableBiMap r0 = r1.inverse()
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet r0 = r0.keySet()
            return r0
    }

    @Override // com.bumptech.glide.repackaged.com.google.common.collect.ImmutableMap, java.util.Map
    public /* bridge */ /* synthetic */ java.util.Collection values() {
            r1 = this;
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet r0 = r1.values()
            return r0
    }
}
