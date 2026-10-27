package com.google.common.base;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class Present<T> extends com.google.common.base.Optional<T> {
    private static final long serialVersionUID = 0;
    private final T reference;

    Present(T r1) {
            r0 = this;
            r0.<init>()
            r0.reference = r1
            return
    }

    @Override // com.google.common.base.Optional
    public java.util.Set<T> asSet() {
            r1 = this;
            T r0 = r1.reference
            java.util.Set r0 = java.util.Collections.singleton(r0)
            return r0
    }

    @Override // com.google.common.base.Optional
    public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.common.base.Present
            if (r0 == 0) goto Lf
            com.google.common.base.Present r2 = (com.google.common.base.Present) r2
            T r0 = r1.reference
            T r2 = r2.reference
            boolean r2 = r0.equals(r2)
            return r2
        Lf:
            r2 = 0
            return r2
    }

    @Override // com.google.common.base.Optional
    public T get() {
            r1 = this;
            T r0 = r1.reference
            return r0
    }

    @Override // com.google.common.base.Optional
    public int hashCode() {
            r2 = this;
            T r0 = r2.reference
            int r0 = r0.hashCode()
            r1 = 1502476572(0x598df91c, float:4.995234E15)
            int r0 = r0 + r1
            return r0
    }

    @Override // com.google.common.base.Optional
    public boolean isPresent() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.google.common.base.Optional
    public com.google.common.base.Optional<T> or(com.google.common.base.Optional<? extends T> r1) {
            r0 = this;
            com.google.common.base.Preconditions.checkNotNull(r1)
            return r0
    }

    @Override // com.google.common.base.Optional
    public T or(com.google.common.base.Supplier<? extends T> r1) {
            r0 = this;
            com.google.common.base.Preconditions.checkNotNull(r1)
            T r1 = r0.reference
            return r1
    }

    @Override // com.google.common.base.Optional
    public T or(T r2) {
            r1 = this;
            java.lang.String r0 = "use Optional.orNull() instead of Optional.or(null)"
            com.google.common.base.Preconditions.checkNotNull(r2, r0)
            T r2 = r1.reference
            return r2
    }

    @Override // com.google.common.base.Optional
    public T orNull() {
            r1 = this;
            T r0 = r1.reference
            return r0
    }

    @Override // com.google.common.base.Optional
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Optional.of("
            r0.append(r1)
            T r1 = r2.reference
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.google.common.base.Optional
    public <V> com.google.common.base.Optional<V> transform(com.google.common.base.Function<? super T, V> r3) {
            r2 = this;
            com.google.common.base.Present r0 = new com.google.common.base.Present
            T r1 = r2.reference
            java.lang.Object r3 = r3.apply(r1)
            java.lang.String r1 = "the Function passed to Optional.transform() must not return null."
            java.lang.Object r3 = com.google.common.base.Preconditions.checkNotNull(r3, r1)
            r0.<init>(r3)
            return r0
    }
}
