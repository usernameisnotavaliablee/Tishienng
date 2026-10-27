package com.google.common.base;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(serializable = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class Optional<T> implements java.io.Serializable {
    private static final long serialVersionUID = 0;


    Optional() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T> com.google.common.base.Optional<T> absent() {
            com.google.common.base.Optional r0 = com.google.common.base.Absent.withType()
            return r0
    }

    public static <T> com.google.common.base.Optional<T> fromNullable(@org.checkerframework.checker.nullness.compatqual.NullableDecl T r1) {
            if (r1 != 0) goto L7
            com.google.common.base.Optional r1 = absent()
            return r1
        L7:
            com.google.common.base.Present r0 = new com.google.common.base.Present
            r0.<init>(r1)
            return r0
    }

    public static <T> com.google.common.base.Optional<T> of(T r1) {
            com.google.common.base.Present r0 = new com.google.common.base.Present
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            r0.<init>(r1)
            return r0
    }

    @com.google.common.annotations.Beta
    public static <T> java.lang.Iterable<T> presentInstances(java.lang.Iterable<? extends com.google.common.base.Optional<? extends T>> r1) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.base.Optional$1 r0 = new com.google.common.base.Optional$1
            r0.<init>(r1)
            return r0
    }

    public abstract java.util.Set<T> asSet();

    public abstract boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1);

    public abstract T get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    public abstract com.google.common.base.Optional<T> or(com.google.common.base.Optional<? extends T> r1);

    @com.google.common.annotations.Beta
    public abstract T or(com.google.common.base.Supplier<? extends T> r1);

    public abstract T or(T r1);

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public abstract T orNull();

    public abstract java.lang.String toString();

    public abstract <V> com.google.common.base.Optional<V> transform(com.google.common.base.Function<? super T, V> r1);
}
