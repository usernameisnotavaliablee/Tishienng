package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface Table<R, C, V> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Cell<R, C, V> {
        boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1);

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        C getColumnKey();

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        R getRowKey();

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        V getValue();

        int hashCode();
    }

    java.util.Set<com.google.common.collect.Table.Cell<R, C, V>> cellSet();

    void clear();

    java.util.Map<R, V> column(C r1);

    java.util.Set<C> columnKeySet();

    java.util.Map<C, java.util.Map<R, V>> columnMap();

    boolean contains(@org.checkerframework.checker.nullness.compatqual.NullableDecl @com.google.errorprone.annotations.CompatibleWith("R") java.lang.Object r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl @com.google.errorprone.annotations.CompatibleWith("C") java.lang.Object r2);

    boolean containsColumn(@org.checkerframework.checker.nullness.compatqual.NullableDecl @com.google.errorprone.annotations.CompatibleWith("C") java.lang.Object r1);

    boolean containsRow(@org.checkerframework.checker.nullness.compatqual.NullableDecl @com.google.errorprone.annotations.CompatibleWith("R") java.lang.Object r1);

    boolean containsValue(@org.checkerframework.checker.nullness.compatqual.NullableDecl @com.google.errorprone.annotations.CompatibleWith("V") java.lang.Object r1);

    boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1);

    V get(@org.checkerframework.checker.nullness.compatqual.NullableDecl @com.google.errorprone.annotations.CompatibleWith("R") java.lang.Object r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl @com.google.errorprone.annotations.CompatibleWith("C") java.lang.Object r2);

    int hashCode();

    boolean isEmpty();

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    V put(R r1, C r2, V r3);

    void putAll(com.google.common.collect.Table<? extends R, ? extends C, ? extends V> r1);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    V remove(@org.checkerframework.checker.nullness.compatqual.NullableDecl @com.google.errorprone.annotations.CompatibleWith("R") java.lang.Object r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl @com.google.errorprone.annotations.CompatibleWith("C") java.lang.Object r2);

    java.util.Map<C, V> row(R r1);

    java.util.Set<R> rowKeySet();

    java.util.Map<R, java.util.Map<C, V>> rowMap();

    int size();

    java.util.Collection<V> values();
}
