package com.google.common.base;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class Functions {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.google.common.base.Functions$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class ConstantFunction<E> implements com.google.common.base.Function<java.lang.Object, E>, java.io.Serializable {
        private static final long serialVersionUID = 0;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        private final E value;

        public ConstantFunction(@org.checkerframework.checker.nullness.compatqual.NullableDecl E r1) {
                r0 = this;
                r0.<init>()
                r0.value = r1
                return
        }

        @Override // com.google.common.base.Function
        public E apply(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1) {
                r0 = this;
                E r1 = r0.value
                return r1
        }

        @Override // com.google.common.base.Function
        public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof com.google.common.base.Functions.ConstantFunction
                if (r0 == 0) goto Lf
                com.google.common.base.Functions$ConstantFunction r2 = (com.google.common.base.Functions.ConstantFunction) r2
                E r0 = r1.value
                E r2 = r2.value
                boolean r2 = com.google.common.base.Objects.equal(r0, r2)
                return r2
            Lf:
                r2 = 0
                return r2
        }

        public int hashCode() {
                r1 = this;
                E r0 = r1.value
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                int r0 = r0.hashCode()
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Functions.constant("
                r0.append(r1)
                E r1 = r2.value
                r0.append(r1)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class ForMapWithDefault<K, V> implements com.google.common.base.Function<K, V>, java.io.Serializable {
        private static final long serialVersionUID = 0;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        final V defaultValue;
        final java.util.Map<K, ? extends V> map;

        ForMapWithDefault(java.util.Map<K, ? extends V> r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl V r2) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                java.util.Map r1 = (java.util.Map) r1
                r0.map = r1
                r0.defaultValue = r2
                return
        }

        @Override // com.google.common.base.Function
        public V apply(@org.checkerframework.checker.nullness.compatqual.NullableDecl K r3) {
                r2 = this;
                java.util.Map<K, ? extends V> r0 = r2.map
                java.lang.Object r0 = r0.get(r3)
                if (r0 != 0) goto L14
                java.util.Map<K, ? extends V> r1 = r2.map
                boolean r3 = r1.containsKey(r3)
                if (r3 == 0) goto L11
                goto L14
            L11:
                V r3 = r2.defaultValue
                return r3
            L14:
                return r0
        }

        @Override // com.google.common.base.Function
        public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof com.google.common.base.Functions.ForMapWithDefault
                r1 = 0
                if (r0 == 0) goto L1d
                com.google.common.base.Functions$ForMapWithDefault r4 = (com.google.common.base.Functions.ForMapWithDefault) r4
                java.util.Map<K, ? extends V> r0 = r3.map
                java.util.Map<K, ? extends V> r2 = r4.map
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L1d
                V r0 = r3.defaultValue
                V r4 = r4.defaultValue
                boolean r4 = com.google.common.base.Objects.equal(r0, r4)
                if (r4 == 0) goto L1d
                r4 = 1
                return r4
            L1d:
                return r1
        }

        public int hashCode() {
                r4 = this;
                java.util.Map<K, ? extends V> r0 = r4.map
                V r1 = r4.defaultValue
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                r2[r3] = r0
                r0 = 1
                r2[r0] = r1
                int r0 = com.google.common.base.Objects.hashCode(r2)
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Functions.forMap("
                r0.append(r1)
                java.util.Map<K, ? extends V> r1 = r2.map
                r0.append(r1)
                java.lang.String r1 = ", defaultValue="
                r0.append(r1)
                V r1 = r2.defaultValue
                r0.append(r1)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class FunctionComposition<A, B, C> implements com.google.common.base.Function<A, C>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final com.google.common.base.Function<A, ? extends B> f;
        private final com.google.common.base.Function<B, C> g;

        public FunctionComposition(com.google.common.base.Function<B, C> r1, com.google.common.base.Function<A, ? extends B> r2) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.base.Function r1 = (com.google.common.base.Function) r1
                r0.g = r1
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                com.google.common.base.Function r1 = (com.google.common.base.Function) r1
                r0.f = r1
                return
        }

        @Override // com.google.common.base.Function
        public C apply(@org.checkerframework.checker.nullness.compatqual.NullableDecl A r3) {
                r2 = this;
                com.google.common.base.Function<B, C> r0 = r2.g
                com.google.common.base.Function<A, ? extends B> r1 = r2.f
                java.lang.Object r3 = r1.apply(r3)
                java.lang.Object r3 = r0.apply(r3)
                return r3
        }

        @Override // com.google.common.base.Function
        public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof com.google.common.base.Functions.FunctionComposition
                r1 = 0
                if (r0 == 0) goto L1d
                com.google.common.base.Functions$FunctionComposition r4 = (com.google.common.base.Functions.FunctionComposition) r4
                com.google.common.base.Function<A, ? extends B> r0 = r3.f
                com.google.common.base.Function<A, ? extends B> r2 = r4.f
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L1d
                com.google.common.base.Function<B, C> r0 = r3.g
                com.google.common.base.Function<B, C> r4 = r4.g
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L1d
                r4 = 1
                return r4
            L1d:
                return r1
        }

        public int hashCode() {
                r2 = this;
                com.google.common.base.Function<A, ? extends B> r0 = r2.f
                int r0 = r0.hashCode()
                com.google.common.base.Function<B, C> r1 = r2.g
                int r1 = r1.hashCode()
                r0 = r0 ^ r1
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                com.google.common.base.Function<B, C> r1 = r2.g
                r0.append(r1)
                java.lang.String r1 = "("
                r0.append(r1)
                com.google.common.base.Function<A, ? extends B> r1 = r2.f
                r0.append(r1)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class FunctionForMapNoDefault<K, V> implements com.google.common.base.Function<K, V>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        final java.util.Map<K, V> map;

        FunctionForMapNoDefault(java.util.Map<K, V> r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                java.util.Map r1 = (java.util.Map) r1
                r0.map = r1
                return
        }

        @Override // com.google.common.base.Function
        public V apply(@org.checkerframework.checker.nullness.compatqual.NullableDecl K r4) {
                r3 = this;
                java.util.Map<K, V> r0 = r3.map
                java.lang.Object r0 = r0.get(r4)
                if (r0 != 0) goto L13
                java.util.Map<K, V> r1 = r3.map
                boolean r1 = r1.containsKey(r4)
                if (r1 == 0) goto L11
                goto L13
            L11:
                r1 = 0
                goto L14
            L13:
                r1 = 1
            L14:
                java.lang.String r2 = "Key '%s' not present in map"
                com.google.common.base.Preconditions.checkArgument(r1, r2, r4)
                return r0
        }

        @Override // com.google.common.base.Function
        public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof com.google.common.base.Functions.FunctionForMapNoDefault
                if (r0 == 0) goto Lf
                com.google.common.base.Functions$FunctionForMapNoDefault r2 = (com.google.common.base.Functions.FunctionForMapNoDefault) r2
                java.util.Map<K, V> r0 = r1.map
                java.util.Map<K, V> r2 = r2.map
                boolean r2 = r0.equals(r2)
                return r2
            Lf:
                r2 = 0
                return r2
        }

        public int hashCode() {
                r1 = this;
                java.util.Map<K, V> r0 = r1.map
                int r0 = r0.hashCode()
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Functions.forMap("
                r0.append(r1)
                java.util.Map<K, V> r1 = r2.map
                r0.append(r1)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private enum IdentityFunction extends java.lang.Enum<com.google.common.base.Functions.IdentityFunction> implements com.google.common.base.Function<java.lang.Object, java.lang.Object> {
        private static final /* synthetic */ com.google.common.base.Functions.IdentityFunction[] $VALUES = null;
        public static final com.google.common.base.Functions.IdentityFunction INSTANCE = null;

        static {
                com.google.common.base.Functions$IdentityFunction r0 = new com.google.common.base.Functions$IdentityFunction
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.common.base.Functions.IdentityFunction.INSTANCE = r0
                r1 = 1
                com.google.common.base.Functions$IdentityFunction[] r1 = new com.google.common.base.Functions.IdentityFunction[r1]
                r1[r2] = r0
                com.google.common.base.Functions.IdentityFunction.$VALUES = r1
                return
        }

        IdentityFunction(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.base.Functions.IdentityFunction valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.base.Functions$IdentityFunction> r0 = com.google.common.base.Functions.IdentityFunction.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.base.Functions$IdentityFunction r1 = (com.google.common.base.Functions.IdentityFunction) r1
                return r1
        }

        public static com.google.common.base.Functions.IdentityFunction[] values() {
                com.google.common.base.Functions$IdentityFunction[] r0 = com.google.common.base.Functions.IdentityFunction.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.base.Functions$IdentityFunction[] r0 = (com.google.common.base.Functions.IdentityFunction[]) r0
                return r0
        }

        @Override // com.google.common.base.Function
        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        public java.lang.Object apply(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1) {
                r0 = this;
                return r1
        }

        @Override // java.lang.Enum
        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "Functions.identity()"
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class PredicateFunction<T> implements com.google.common.base.Function<T, java.lang.Boolean>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final com.google.common.base.Predicate<T> predicate;

        private PredicateFunction(com.google.common.base.Predicate<T> r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.base.Predicate r1 = (com.google.common.base.Predicate) r1
                r0.predicate = r1
                return
        }

        /* synthetic */ PredicateFunction(com.google.common.base.Predicate r1, com.google.common.base.Functions.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.common.base.Function
        public java.lang.Boolean apply(@org.checkerframework.checker.nullness.compatqual.NullableDecl T r2) {
                r1 = this;
                com.google.common.base.Predicate<T> r0 = r1.predicate
                boolean r2 = r0.apply(r2)
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                return r2
        }

        @Override // com.google.common.base.Function
        public /* bridge */ /* synthetic */ java.lang.Boolean apply(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1) {
                r0 = this;
                java.lang.Boolean r1 = r0.apply(r1)
                return r1
        }

        @Override // com.google.common.base.Function
        public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof com.google.common.base.Functions.PredicateFunction
                if (r0 == 0) goto Lf
                com.google.common.base.Functions$PredicateFunction r2 = (com.google.common.base.Functions.PredicateFunction) r2
                com.google.common.base.Predicate<T> r0 = r1.predicate
                com.google.common.base.Predicate<T> r2 = r2.predicate
                boolean r2 = r0.equals(r2)
                return r2
            Lf:
                r2 = 0
                return r2
        }

        public int hashCode() {
                r1 = this;
                com.google.common.base.Predicate<T> r0 = r1.predicate
                int r0 = r0.hashCode()
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Functions.forPredicate("
                r0.append(r1)
                com.google.common.base.Predicate<T> r1 = r2.predicate
                r0.append(r1)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class SupplierFunction<T> implements com.google.common.base.Function<java.lang.Object, T>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final com.google.common.base.Supplier<T> supplier;

        private SupplierFunction(com.google.common.base.Supplier<T> r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.base.Supplier r1 = (com.google.common.base.Supplier) r1
                r0.supplier = r1
                return
        }

        /* synthetic */ SupplierFunction(com.google.common.base.Supplier r1, com.google.common.base.Functions.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.base.Function
        public T apply(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1) {
                r0 = this;
                com.google.common.base.Supplier<T> r1 = r0.supplier
                java.lang.Object r1 = r1.get()
                return r1
        }

        @Override // com.google.common.base.Function
        public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof com.google.common.base.Functions.SupplierFunction
                if (r0 == 0) goto Lf
                com.google.common.base.Functions$SupplierFunction r2 = (com.google.common.base.Functions.SupplierFunction) r2
                com.google.common.base.Supplier<T> r0 = r1.supplier
                com.google.common.base.Supplier<T> r2 = r2.supplier
                boolean r2 = r0.equals(r2)
                return r2
            Lf:
                r2 = 0
                return r2
        }

        public int hashCode() {
                r1 = this;
                com.google.common.base.Supplier<T> r0 = r1.supplier
                int r0 = r0.hashCode()
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Functions.forSupplier("
                r0.append(r1)
                com.google.common.base.Supplier<T> r1 = r2.supplier
                r0.append(r1)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private enum ToStringFunction extends java.lang.Enum<com.google.common.base.Functions.ToStringFunction> implements com.google.common.base.Function<java.lang.Object, java.lang.String> {
        private static final /* synthetic */ com.google.common.base.Functions.ToStringFunction[] $VALUES = null;
        public static final com.google.common.base.Functions.ToStringFunction INSTANCE = null;

        static {
                com.google.common.base.Functions$ToStringFunction r0 = new com.google.common.base.Functions$ToStringFunction
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.common.base.Functions.ToStringFunction.INSTANCE = r0
                r1 = 1
                com.google.common.base.Functions$ToStringFunction[] r1 = new com.google.common.base.Functions.ToStringFunction[r1]
                r1[r2] = r0
                com.google.common.base.Functions.ToStringFunction.$VALUES = r1
                return
        }

        ToStringFunction(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.base.Functions.ToStringFunction valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.base.Functions$ToStringFunction> r0 = com.google.common.base.Functions.ToStringFunction.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.base.Functions$ToStringFunction r1 = (com.google.common.base.Functions.ToStringFunction) r1
                return r1
        }

        public static com.google.common.base.Functions.ToStringFunction[] values() {
                com.google.common.base.Functions$ToStringFunction[] r0 = com.google.common.base.Functions.ToStringFunction.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.base.Functions$ToStringFunction[] r0 = (com.google.common.base.Functions.ToStringFunction[]) r0
                return r0
        }

        @Override // com.google.common.base.Function
        public /* bridge */ /* synthetic */ java.lang.String apply(java.lang.Object r1) {
                r0 = this;
                java.lang.String r1 = r0.apply2(r1)
                return r1
        }

        @Override // com.google.common.base.Function
        /* renamed from: apply, reason: avoid collision after fix types in other method */
        public java.lang.String apply2(java.lang.Object r1) {
                r0 = this;
                com.google.common.base.Preconditions.checkNotNull(r1)
                java.lang.String r1 = r1.toString()
                return r1
        }

        @Override // java.lang.Enum
        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "Functions.toStringFunction()"
                return r0
        }
    }

    private Functions() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <A, B, C> com.google.common.base.Function<A, C> compose(com.google.common.base.Function<B, C> r1, com.google.common.base.Function<A, ? extends B> r2) {
            com.google.common.base.Functions$FunctionComposition r0 = new com.google.common.base.Functions$FunctionComposition
            r0.<init>(r1, r2)
            return r0
    }

    public static <E> com.google.common.base.Function<java.lang.Object, E> constant(@org.checkerframework.checker.nullness.compatqual.NullableDecl E r1) {
            com.google.common.base.Functions$ConstantFunction r0 = new com.google.common.base.Functions$ConstantFunction
            r0.<init>(r1)
            return r0
    }

    public static <K, V> com.google.common.base.Function<K, V> forMap(java.util.Map<K, V> r1) {
            com.google.common.base.Functions$FunctionForMapNoDefault r0 = new com.google.common.base.Functions$FunctionForMapNoDefault
            r0.<init>(r1)
            return r0
    }

    public static <K, V> com.google.common.base.Function<K, V> forMap(java.util.Map<K, ? extends V> r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl V r2) {
            com.google.common.base.Functions$ForMapWithDefault r0 = new com.google.common.base.Functions$ForMapWithDefault
            r0.<init>(r1, r2)
            return r0
    }

    public static <T> com.google.common.base.Function<T, java.lang.Boolean> forPredicate(com.google.common.base.Predicate<T> r2) {
            com.google.common.base.Functions$PredicateFunction r0 = new com.google.common.base.Functions$PredicateFunction
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public static <T> com.google.common.base.Function<java.lang.Object, T> forSupplier(com.google.common.base.Supplier<T> r2) {
            com.google.common.base.Functions$SupplierFunction r0 = new com.google.common.base.Functions$SupplierFunction
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public static <E> com.google.common.base.Function<E, E> identity() {
            com.google.common.base.Functions$IdentityFunction r0 = com.google.common.base.Functions.IdentityFunction.INSTANCE
            return r0
    }

    public static com.google.common.base.Function<java.lang.Object, java.lang.String> toStringFunction() {
            com.google.common.base.Functions$ToStringFunction r0 = com.google.common.base.Functions.ToStringFunction.INSTANCE
            return r0
    }
}
