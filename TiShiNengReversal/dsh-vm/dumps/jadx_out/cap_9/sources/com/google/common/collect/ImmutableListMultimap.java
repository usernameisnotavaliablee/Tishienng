package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(emulated = true, serializable = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class ImmutableListMultimap<K, V> extends com.google.common.collect.ImmutableMultimap<K, V> implements com.google.common.collect.ListMultimap<K, V> {

    @com.google.common.annotations.GwtIncompatible
    private static final long serialVersionUID = 0;

    @com.google.j2objc.annotations.RetainedWith
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.collect.ImmutableListMultimap<V, K> inverse;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Builder<K, V> extends com.google.common.collect.ImmutableMultimap.Builder<K, V> {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public com.google.common.collect.ImmutableListMultimap<K, V> build() {
                r1 = this;
                com.google.common.collect.ImmutableMultimap r0 = super.build()
                com.google.common.collect.ImmutableListMultimap r0 = (com.google.common.collect.ImmutableListMultimap) r0
                return r0
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultimap build() {
                r1 = this;
                com.google.common.collect.ImmutableListMultimap r0 = r1.build()
                return r0
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableListMultimap.Builder<K, V> orderKeysBy(java.util.Comparator<? super K> r1) {
                r0 = this;
                super.orderKeysBy(r1)
                return r0
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultimap.Builder orderKeysBy(java.util.Comparator r1) {
                r0 = this;
                com.google.common.collect.ImmutableListMultimap$Builder r1 = r0.orderKeysBy(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableListMultimap.Builder<K, V> orderValuesBy(java.util.Comparator<? super V> r1) {
                r0 = this;
                super.orderValuesBy(r1)
                return r0
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultimap.Builder orderValuesBy(java.util.Comparator r1) {
                r0 = this;
                com.google.common.collect.ImmutableListMultimap$Builder r1 = r0.orderValuesBy(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableListMultimap.Builder<K, V> put(K r1, V r2) {
                r0 = this;
                super.put(r1, r2)
                return r0
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableListMultimap.Builder<K, V> put(java.util.Map.Entry<? extends K, ? extends V> r1) {
                r0 = this;
                super.put(r1)
                return r0
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultimap.Builder put(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                com.google.common.collect.ImmutableListMultimap$Builder r1 = r0.put(r1, r2)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultimap.Builder put(java.util.Map.Entry r1) {
                r0 = this;
                com.google.common.collect.ImmutableListMultimap$Builder r1 = r0.put(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableListMultimap.Builder<K, V> putAll(com.google.common.collect.Multimap<? extends K, ? extends V> r1) {
                r0 = this;
                super.putAll(r1)
                return r0
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @com.google.common.annotations.Beta
        public com.google.common.collect.ImmutableListMultimap.Builder<K, V> putAll(java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> r1) {
                r0 = this;
                super.putAll(r1)
                return r0
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableListMultimap.Builder<K, V> putAll(K r1, java.lang.Iterable<? extends V> r2) {
                r0 = this;
                super.putAll(r1, r2)
                return r0
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableListMultimap.Builder<K, V> putAll(K r1, V... r2) {
                r0 = this;
                super.putAll(r1, r2)
                return r0
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultimap.Builder putAll(com.google.common.collect.Multimap r1) {
                r0 = this;
                com.google.common.collect.ImmutableListMultimap$Builder r1 = r0.putAll(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @com.google.common.annotations.Beta
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultimap.Builder putAll(java.lang.Iterable r1) {
                r0 = this;
                com.google.common.collect.ImmutableListMultimap$Builder r1 = r0.putAll(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultimap.Builder putAll(java.lang.Object r1, java.lang.Iterable r2) {
                r0 = this;
                com.google.common.collect.ImmutableListMultimap$Builder r1 = r0.putAll(r1, r2)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultimap.Builder putAll(java.lang.Object r1, java.lang.Object[] r2) {
                r0 = this;
                com.google.common.collect.ImmutableListMultimap$Builder r1 = r0.putAll(r1, r2)
                return r1
        }
    }

    ImmutableListMultimap(com.google.common.collect.ImmutableMap<K, com.google.common.collect.ImmutableList<V>> r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static <K, V> com.google.common.collect.ImmutableListMultimap.Builder<K, V> builder() {
            com.google.common.collect.ImmutableListMultimap$Builder r0 = new com.google.common.collect.ImmutableListMultimap$Builder
            r0.<init>()
            return r0
    }

    public static <K, V> com.google.common.collect.ImmutableListMultimap<K, V> copyOf(com.google.common.collect.Multimap<? extends K, ? extends V> r2) {
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Lb
            com.google.common.collect.ImmutableListMultimap r2 = of()
            return r2
        Lb:
            boolean r0 = r2 instanceof com.google.common.collect.ImmutableListMultimap
            if (r0 == 0) goto L19
            r0 = r2
            com.google.common.collect.ImmutableListMultimap r0 = (com.google.common.collect.ImmutableListMultimap) r0
            boolean r1 = r0.isPartialView()
            if (r1 != 0) goto L19
            return r0
        L19:
            java.util.Map r2 = r2.asMap()
            java.util.Set r2 = r2.entrySet()
            r0 = 0
            com.google.common.collect.ImmutableListMultimap r2 = fromMapEntries(r2, r0)
            return r2
    }

    @com.google.common.annotations.Beta
    public static <K, V> com.google.common.collect.ImmutableListMultimap<K, V> copyOf(java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> r1) {
            com.google.common.collect.ImmutableListMultimap$Builder r0 = new com.google.common.collect.ImmutableListMultimap$Builder
            r0.<init>()
            com.google.common.collect.ImmutableListMultimap$Builder r1 = r0.putAll(r1)
            com.google.common.collect.ImmutableListMultimap r1 = r1.build()
            return r1
    }

    static <K, V> com.google.common.collect.ImmutableListMultimap<K, V> fromMapEntries(java.util.Collection<? extends java.util.Map.Entry<? extends K, ? extends java.util.Collection<? extends V>>> r5, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.util.Comparator<? super V> r6) {
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto Lb
            com.google.common.collect.ImmutableListMultimap r5 = of()
            return r5
        Lb:
            com.google.common.collect.ImmutableMap$Builder r0 = new com.google.common.collect.ImmutableMap$Builder
            int r1 = r5.size()
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
            r1 = 0
        L19:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L49
            java.lang.Object r2 = r5.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            java.util.Collection r2 = (java.util.Collection) r2
            if (r6 != 0) goto L36
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.copyOf(r2)
            goto L3a
        L36:
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.sortedCopyOf(r6, r2)
        L3a:
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto L19
            r0.put(r3, r2)
            int r2 = r2.size()
            int r1 = r1 + r2
            goto L19
        L49:
            com.google.common.collect.ImmutableListMultimap r5 = new com.google.common.collect.ImmutableListMultimap
            com.google.common.collect.ImmutableMap r6 = r0.build()
            r5.<init>(r6, r1)
            return r5
    }

    private com.google.common.collect.ImmutableListMultimap<V, K> invert() {
            r4 = this;
            com.google.common.collect.ImmutableListMultimap$Builder r0 = builder()
            com.google.common.collect.ImmutableCollection r1 = r4.entries()
            com.google.common.collect.UnmodifiableIterator r1 = r1.iterator()
        Lc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L24
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            java.lang.Object r2 = r2.getKey()
            r0.put(r3, r2)
            goto Lc
        L24:
            com.google.common.collect.ImmutableListMultimap r0 = r0.build()
            r0.inverse = r4
            return r0
    }

    public static <K, V> com.google.common.collect.ImmutableListMultimap<K, V> of() {
            com.google.common.collect.EmptyImmutableListMultimap r0 = com.google.common.collect.EmptyImmutableListMultimap.INSTANCE
            return r0
    }

    public static <K, V> com.google.common.collect.ImmutableListMultimap<K, V> of(K r1, V r2) {
            com.google.common.collect.ImmutableListMultimap$Builder r0 = builder()
            r0.put(r1, r2)
            com.google.common.collect.ImmutableListMultimap r1 = r0.build()
            return r1
    }

    public static <K, V> com.google.common.collect.ImmutableListMultimap<K, V> of(K r1, V r2, K r3, V r4) {
            com.google.common.collect.ImmutableListMultimap$Builder r0 = builder()
            r0.put(r1, r2)
            r0.put(r3, r4)
            com.google.common.collect.ImmutableListMultimap r1 = r0.build()
            return r1
    }

    public static <K, V> com.google.common.collect.ImmutableListMultimap<K, V> of(K r1, V r2, K r3, V r4, K r5, V r6) {
            com.google.common.collect.ImmutableListMultimap$Builder r0 = builder()
            r0.put(r1, r2)
            r0.put(r3, r4)
            r0.put(r5, r6)
            com.google.common.collect.ImmutableListMultimap r1 = r0.build()
            return r1
    }

    public static <K, V> com.google.common.collect.ImmutableListMultimap<K, V> of(K r1, V r2, K r3, V r4, K r5, V r6, K r7, V r8) {
            com.google.common.collect.ImmutableListMultimap$Builder r0 = builder()
            r0.put(r1, r2)
            r0.put(r3, r4)
            r0.put(r5, r6)
            r0.put(r7, r8)
            com.google.common.collect.ImmutableListMultimap r1 = r0.build()
            return r1
    }

    public static <K, V> com.google.common.collect.ImmutableListMultimap<K, V> of(K r1, V r2, K r3, V r4, K r5, V r6, K r7, V r8, K r9, V r10) {
            com.google.common.collect.ImmutableListMultimap$Builder r0 = builder()
            r0.put(r1, r2)
            r0.put(r3, r4)
            r0.put(r5, r6)
            r0.put(r7, r8)
            r0.put(r9, r10)
            com.google.common.collect.ImmutableListMultimap r1 = r0.build()
            return r1
    }

    @com.google.common.annotations.GwtIncompatible
    private void readObject(java.io.ObjectInputStream r11) throws java.io.IOException, java.lang.ClassNotFoundException {
            r10 = this;
            r11.defaultReadObject()
            int r0 = r11.readInt()
            if (r0 < 0) goto L6f
            com.google.common.collect.ImmutableMap$Builder r1 = com.google.common.collect.ImmutableMap.builder()
            r2 = 0
            r3 = 0
            r4 = 0
        L10:
            if (r3 >= r0) goto L4f
            java.lang.Object r5 = r11.readObject()
            int r6 = r11.readInt()
            if (r6 <= 0) goto L38
            com.google.common.collect.ImmutableList$Builder r7 = com.google.common.collect.ImmutableList.builder()
            r8 = 0
        L21:
            if (r8 >= r6) goto L2d
            java.lang.Object r9 = r11.readObject()
            r7.add(r9)
            int r8 = r8 + 1
            goto L21
        L2d:
            com.google.common.collect.ImmutableList r7 = r7.build()
            r1.put(r5, r7)
            int r4 = r4 + r6
            int r3 = r3 + 1
            goto L10
        L38:
            java.io.InvalidObjectException r11 = new java.io.InvalidObjectException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid value count "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r11.<init>(r0)
            throw r11
        L4f:
            com.google.common.collect.ImmutableMap r11 = r1.build()     // Catch: java.lang.IllegalArgumentException -> L5e
            com.google.common.collect.Serialization$FieldSetter<com.google.common.collect.ImmutableMultimap> r0 = com.google.common.collect.ImmutableMultimap.FieldSettersHolder.MAP_FIELD_SETTER
            r0.set(r10, r11)
            com.google.common.collect.Serialization$FieldSetter<com.google.common.collect.ImmutableMultimap> r11 = com.google.common.collect.ImmutableMultimap.FieldSettersHolder.SIZE_FIELD_SETTER
            r11.set(r10, r4)
            return
        L5e:
            r11 = move-exception
            java.io.InvalidObjectException r0 = new java.io.InvalidObjectException
            java.lang.String r1 = r11.getMessage()
            r0.<init>(r1)
            java.lang.Throwable r11 = r0.initCause(r11)
            java.io.InvalidObjectException r11 = (java.io.InvalidObjectException) r11
            throw r11
        L6f:
            java.io.InvalidObjectException r11 = new java.io.InvalidObjectException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid key count "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r11.<init>(r0)
            throw r11
    }

    @com.google.common.annotations.GwtIncompatible
    private void writeObject(java.io.ObjectOutputStream r1) throws java.io.IOException {
            r0 = this;
            r1.defaultWriteObject()
            com.google.common.collect.Serialization.writeMultimap(r0, r1)
            return
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection get(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1) {
            r0 = this;
            com.google.common.collect.ImmutableList r1 = r0.get(r1)
            return r1
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap
    public com.google.common.collect.ImmutableList<V> get(@org.checkerframework.checker.nullness.compatqual.NullableDecl K r2) {
            r1 = this;
            com.google.common.collect.ImmutableMap<K, ? extends com.google.common.collect.ImmutableCollection<V>> r0 = r1.map
            java.lang.Object r2 = r0.get(r2)
            com.google.common.collect.ImmutableList r2 = (com.google.common.collect.ImmutableList) r2
            if (r2 != 0) goto Le
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.of()
        Le:
            return r2
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ java.util.Collection get(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1) {
            r0 = this;
            com.google.common.collect.ImmutableList r1 = r0.get(r1)
            return r1
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ java.util.List get(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1) {
            r0 = this;
            com.google.common.collect.ImmutableList r1 = r0.get(r1)
            return r1
    }

    @Override // com.google.common.collect.ImmutableMultimap
    public com.google.common.collect.ImmutableListMultimap<V, K> inverse() {
            r1 = this;
            com.google.common.collect.ImmutableListMultimap<V, K> r0 = r1.inverse
            if (r0 != 0) goto La
            com.google.common.collect.ImmutableListMultimap r0 = r1.invert()
            r1.inverse = r0
        La:
            return r0
    }

    @Override // com.google.common.collect.ImmutableMultimap
    public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultimap inverse() {
            r1 = this;
            com.google.common.collect.ImmutableListMultimap r0 = r1.inverse()
            return r0
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection removeAll(java.lang.Object r1) {
            r0 = this;
            com.google.common.collect.ImmutableList r1 = r0.removeAll(r1)
            return r1
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @java.lang.Deprecated
    public com.google.common.collect.ImmutableList<V> removeAll(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ java.util.Collection removeAll(java.lang.Object r1) {
            r0 = this;
            com.google.common.collect.ImmutableList r1 = r0.removeAll(r1)
            return r1
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ java.util.List removeAll(java.lang.Object r1) {
            r0 = this;
            com.google.common.collect.ImmutableList r1 = r0.removeAll(r1)
            return r1
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection replaceValues(java.lang.Object r1, java.lang.Iterable r2) {
            r0 = this;
            com.google.common.collect.ImmutableList r1 = r0.replaceValues(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @java.lang.Deprecated
    public com.google.common.collect.ImmutableList<V> replaceValues(K r1, java.lang.Iterable<? extends V> r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ java.util.Collection replaceValues(java.lang.Object r1, java.lang.Iterable r2) {
            r0 = this;
            com.google.common.collect.ImmutableList r1 = r0.replaceValues(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ java.util.List replaceValues(java.lang.Object r1, java.lang.Iterable r2) {
            r0 = this;
            com.google.common.collect.ImmutableList r1 = r0.replaceValues(r1, r2)
            return r1
    }
}
