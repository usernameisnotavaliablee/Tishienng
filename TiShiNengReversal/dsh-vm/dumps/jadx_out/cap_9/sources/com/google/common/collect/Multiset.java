package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface Multiset<E> extends java.util.Collection<E> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Entry<E> {
        boolean equals(java.lang.Object r1);

        int getCount();

        E getElement();

        int hashCode();

        java.lang.String toString();
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    int add(@org.checkerframework.checker.nullness.compatqual.NullableDecl E r1, int r2);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    boolean add(E r1);

    boolean contains(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1);

    @Override // java.util.Collection
    boolean containsAll(java.util.Collection<?> r1);

    int count(@org.checkerframework.checker.nullness.compatqual.NullableDecl @com.google.errorprone.annotations.CompatibleWith("E") java.lang.Object r1);

    java.util.Set<E> elementSet();

    java.util.Set<com.google.common.collect.Multiset.Entry<E>> entrySet();

    boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1);

    int hashCode();

    java.util.Iterator<E> iterator();

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    int remove(@org.checkerframework.checker.nullness.compatqual.NullableDecl @com.google.errorprone.annotations.CompatibleWith("E") java.lang.Object r1, int r2);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    boolean remove(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    boolean removeAll(java.util.Collection<?> r1);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    boolean retainAll(java.util.Collection<?> r1);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    int setCount(E r1, int r2);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    boolean setCount(E r1, int r2, int r3);

    int size();

    java.lang.String toString();
}
