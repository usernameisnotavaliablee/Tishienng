package com.google.common.base;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class Suppliers {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.common.annotations.VisibleForTesting
    static class ExpiringMemoizingSupplier<T> implements com.google.common.base.Supplier<T>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        final com.google.common.base.Supplier<T> delegate;
        final long durationNanos;
        volatile transient long expirationNanos;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        volatile transient T value;

        ExpiringMemoizingSupplier(com.google.common.base.Supplier<T> r3, long r4, java.util.concurrent.TimeUnit r6) {
                r2 = this;
                r2.<init>()
                java.lang.Object r3 = com.google.common.base.Preconditions.checkNotNull(r3)
                com.google.common.base.Supplier r3 = (com.google.common.base.Supplier) r3
                r2.delegate = r3
                long r0 = r6.toNanos(r4)
                r2.durationNanos = r0
                r0 = 0
                int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r3 <= 0) goto L19
                r3 = 1
                goto L1a
            L19:
                r3 = 0
            L1a:
                java.lang.String r0 = "duration (%s %s) must be > 0"
                com.google.common.base.Preconditions.checkArgument(r3, r0, r4, r6)
                return
        }

        @Override // com.google.common.base.Supplier
        public T get() {
                r9 = this;
                long r0 = r9.expirationNanos
                long r2 = com.google.common.base.Platform.systemNanoTime()
                r4 = 0
                int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r6 == 0) goto L12
                long r6 = r2 - r0
                int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r8 < 0) goto L31
            L12:
                monitor-enter(r9)
                long r6 = r9.expirationNanos     // Catch: java.lang.Throwable -> L2e
                int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r8 != 0) goto L30
                com.google.common.base.Supplier<T> r0 = r9.delegate     // Catch: java.lang.Throwable -> L2e
                java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L2e
                r9.value = r0     // Catch: java.lang.Throwable -> L2e
                long r6 = r9.durationNanos     // Catch: java.lang.Throwable -> L2e
                long r2 = r2 + r6
                int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r1 != 0) goto L2a
                r2 = 1
            L2a:
                r9.expirationNanos = r2     // Catch: java.lang.Throwable -> L2e
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L2e
                return r0
            L2e:
                r0 = move-exception
                goto L34
            L30:
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L2e
            L31:
                T r0 = r9.value
                return r0
            L34:
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L2e
                throw r0
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Suppliers.memoizeWithExpiration("
                r0.append(r1)
                com.google.common.base.Supplier<T> r1 = r3.delegate
                r0.append(r1)
                java.lang.String r1 = ", "
                r0.append(r1)
                long r1 = r3.durationNanos
                r0.append(r1)
                java.lang.String r1 = ", NANOS)"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.common.annotations.VisibleForTesting
    static class MemoizingSupplier<T> implements com.google.common.base.Supplier<T>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        final com.google.common.base.Supplier<T> delegate;
        volatile transient boolean initialized;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        transient T value;

        MemoizingSupplier(com.google.common.base.Supplier<T> r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.base.Supplier r1 = (com.google.common.base.Supplier) r1
                r0.delegate = r1
                return
        }

        @Override // com.google.common.base.Supplier
        public T get() {
                r2 = this;
                boolean r0 = r2.initialized
                if (r0 != 0) goto L1c
                monitor-enter(r2)
                boolean r0 = r2.initialized     // Catch: java.lang.Throwable -> L16
                if (r0 != 0) goto L18
                com.google.common.base.Supplier<T> r0 = r2.delegate     // Catch: java.lang.Throwable -> L16
                java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L16
                r2.value = r0     // Catch: java.lang.Throwable -> L16
                r1 = 1
                r2.initialized = r1     // Catch: java.lang.Throwable -> L16
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
                return r0
            L16:
                r0 = move-exception
                goto L1a
            L18:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
                goto L1c
            L1a:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
                throw r0
            L1c:
                T r0 = r2.value
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Suppliers.memoize("
                r0.append(r1)
                boolean r1 = r3.initialized
                if (r1 == 0) goto L27
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "<supplier that returned "
                r1.append(r2)
                T r2 = r3.value
                r1.append(r2)
                java.lang.String r2 = ">"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                goto L29
            L27:
                com.google.common.base.Supplier<T> r1 = r3.delegate
            L29:
                r0.append(r1)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.common.annotations.VisibleForTesting
    static class NonSerializableMemoizingSupplier<T> implements com.google.common.base.Supplier<T> {
        volatile com.google.common.base.Supplier<T> delegate;
        volatile boolean initialized;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        T value;

        NonSerializableMemoizingSupplier(com.google.common.base.Supplier<T> r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.base.Supplier r1 = (com.google.common.base.Supplier) r1
                r0.delegate = r1
                return
        }

        @Override // com.google.common.base.Supplier
        public T get() {
                r2 = this;
                boolean r0 = r2.initialized
                if (r0 != 0) goto L1f
                monitor-enter(r2)
                boolean r0 = r2.initialized     // Catch: java.lang.Throwable -> L19
                if (r0 != 0) goto L1b
                com.google.common.base.Supplier<T> r0 = r2.delegate     // Catch: java.lang.Throwable -> L19
                java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L19
                r2.value = r0     // Catch: java.lang.Throwable -> L19
                r1 = 1
                r2.initialized = r1     // Catch: java.lang.Throwable -> L19
                r1 = 0
                r2.delegate = r1     // Catch: java.lang.Throwable -> L19
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
                return r0
            L19:
                r0 = move-exception
                goto L1d
            L1b:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
                goto L1f
            L1d:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
                throw r0
            L1f:
                T r0 = r2.value
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                com.google.common.base.Supplier<T> r0 = r3.delegate
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Suppliers.memoize("
                r1.append(r2)
                if (r0 != 0) goto L26
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "<supplier that returned "
                r0.append(r2)
                T r2 = r3.value
                r0.append(r2)
                java.lang.String r2 = ">"
                r0.append(r2)
                java.lang.String r0 = r0.toString()
            L26:
                r1.append(r0)
                java.lang.String r0 = ")"
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class SupplierComposition<F, T> implements com.google.common.base.Supplier<T>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        final com.google.common.base.Function<? super F, T> function;
        final com.google.common.base.Supplier<F> supplier;

        SupplierComposition(com.google.common.base.Function<? super F, T> r1, com.google.common.base.Supplier<F> r2) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.base.Function r1 = (com.google.common.base.Function) r1
                r0.function = r1
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                com.google.common.base.Supplier r1 = (com.google.common.base.Supplier) r1
                r0.supplier = r1
                return
        }

        public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof com.google.common.base.Suppliers.SupplierComposition
                r1 = 0
                if (r0 == 0) goto L1d
                com.google.common.base.Suppliers$SupplierComposition r4 = (com.google.common.base.Suppliers.SupplierComposition) r4
                com.google.common.base.Function<? super F, T> r0 = r3.function
                com.google.common.base.Function<? super F, T> r2 = r4.function
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L1d
                com.google.common.base.Supplier<F> r0 = r3.supplier
                com.google.common.base.Supplier<F> r4 = r4.supplier
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L1d
                r4 = 1
                return r4
            L1d:
                return r1
        }

        @Override // com.google.common.base.Supplier
        public T get() {
                r2 = this;
                com.google.common.base.Function<? super F, T> r0 = r2.function
                com.google.common.base.Supplier<F> r1 = r2.supplier
                java.lang.Object r1 = r1.get()
                java.lang.Object r0 = r0.apply(r1)
                return r0
        }

        public int hashCode() {
                r4 = this;
                com.google.common.base.Function<? super F, T> r0 = r4.function
                com.google.common.base.Supplier<F> r1 = r4.supplier
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
                java.lang.String r1 = "Suppliers.compose("
                r0.append(r1)
                com.google.common.base.Function<? super F, T> r1 = r2.function
                r0.append(r1)
                java.lang.String r1 = ", "
                r0.append(r1)
                com.google.common.base.Supplier<F> r1 = r2.supplier
                r0.append(r1)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private interface SupplierFunction<T> extends com.google.common.base.Function<com.google.common.base.Supplier<T>, T> {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private enum SupplierFunctionImpl extends java.lang.Enum<com.google.common.base.Suppliers.SupplierFunctionImpl> implements com.google.common.base.Suppliers.SupplierFunction<java.lang.Object> {
        private static final /* synthetic */ com.google.common.base.Suppliers.SupplierFunctionImpl[] $VALUES = null;
        public static final com.google.common.base.Suppliers.SupplierFunctionImpl INSTANCE = null;

        static {
                com.google.common.base.Suppliers$SupplierFunctionImpl r0 = new com.google.common.base.Suppliers$SupplierFunctionImpl
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.common.base.Suppliers.SupplierFunctionImpl.INSTANCE = r0
                r1 = 1
                com.google.common.base.Suppliers$SupplierFunctionImpl[] r1 = new com.google.common.base.Suppliers.SupplierFunctionImpl[r1]
                r1[r2] = r0
                com.google.common.base.Suppliers.SupplierFunctionImpl.$VALUES = r1
                return
        }

        SupplierFunctionImpl(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.base.Suppliers.SupplierFunctionImpl valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.base.Suppliers$SupplierFunctionImpl> r0 = com.google.common.base.Suppliers.SupplierFunctionImpl.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.base.Suppliers$SupplierFunctionImpl r1 = (com.google.common.base.Suppliers.SupplierFunctionImpl) r1
                return r1
        }

        public static com.google.common.base.Suppliers.SupplierFunctionImpl[] values() {
                com.google.common.base.Suppliers$SupplierFunctionImpl[] r0 = com.google.common.base.Suppliers.SupplierFunctionImpl.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.base.Suppliers$SupplierFunctionImpl[] r0 = (com.google.common.base.Suppliers.SupplierFunctionImpl[]) r0
                return r0
        }

        public java.lang.Object apply(com.google.common.base.Supplier<java.lang.Object> r1) {
                r0 = this;
                java.lang.Object r1 = r1.get()
                return r1
        }

        @Override // com.google.common.base.Function
        public /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object r1) {
                r0 = this;
                com.google.common.base.Supplier r1 = (com.google.common.base.Supplier) r1
                java.lang.Object r1 = r0.apply(r1)
                return r1
        }

        @Override // java.lang.Enum
        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "Suppliers.supplierFunction()"
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class SupplierOfInstance<T> implements com.google.common.base.Supplier<T>, java.io.Serializable {
        private static final long serialVersionUID = 0;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        final T instance;

        SupplierOfInstance(@org.checkerframework.checker.nullness.compatqual.NullableDecl T r1) {
                r0 = this;
                r0.<init>()
                r0.instance = r1
                return
        }

        public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof com.google.common.base.Suppliers.SupplierOfInstance
                if (r0 == 0) goto Lf
                com.google.common.base.Suppliers$SupplierOfInstance r2 = (com.google.common.base.Suppliers.SupplierOfInstance) r2
                T r0 = r1.instance
                T r2 = r2.instance
                boolean r2 = com.google.common.base.Objects.equal(r0, r2)
                return r2
            Lf:
                r2 = 0
                return r2
        }

        @Override // com.google.common.base.Supplier
        public T get() {
                r1 = this;
                T r0 = r1.instance
                return r0
        }

        public int hashCode() {
                r3 = this;
                T r0 = r3.instance
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                r1[r2] = r0
                int r0 = com.google.common.base.Objects.hashCode(r1)
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Suppliers.ofInstance("
                r0.append(r1)
                T r1 = r2.instance
                r0.append(r1)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class ThreadSafeSupplier<T> implements com.google.common.base.Supplier<T>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        final com.google.common.base.Supplier<T> delegate;

        ThreadSafeSupplier(com.google.common.base.Supplier<T> r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.base.Supplier r1 = (com.google.common.base.Supplier) r1
                r0.delegate = r1
                return
        }

        @Override // com.google.common.base.Supplier
        public T get() {
                r2 = this;
                com.google.common.base.Supplier<T> r0 = r2.delegate
                monitor-enter(r0)
                com.google.common.base.Supplier<T> r1 = r2.delegate     // Catch: java.lang.Throwable -> Lb
                java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> Lb
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                return r1
            Lb:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                throw r1
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Suppliers.synchronizedSupplier("
                r0.append(r1)
                com.google.common.base.Supplier<T> r1 = r2.delegate
                r0.append(r1)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    private Suppliers() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <F, T> com.google.common.base.Supplier<T> compose(com.google.common.base.Function<? super F, T> r1, com.google.common.base.Supplier<F> r2) {
            com.google.common.base.Suppliers$SupplierComposition r0 = new com.google.common.base.Suppliers$SupplierComposition
            r0.<init>(r1, r2)
            return r0
    }

    public static <T> com.google.common.base.Supplier<T> memoize(com.google.common.base.Supplier<T> r1) {
            boolean r0 = r1 instanceof com.google.common.base.Suppliers.NonSerializableMemoizingSupplier
            if (r0 != 0) goto L19
            boolean r0 = r1 instanceof com.google.common.base.Suppliers.MemoizingSupplier
            if (r0 == 0) goto L9
            return r1
        L9:
            boolean r0 = r1 instanceof java.io.Serializable
            if (r0 == 0) goto L13
            com.google.common.base.Suppliers$MemoizingSupplier r0 = new com.google.common.base.Suppliers$MemoizingSupplier
            r0.<init>(r1)
            return r0
        L13:
            com.google.common.base.Suppliers$NonSerializableMemoizingSupplier r0 = new com.google.common.base.Suppliers$NonSerializableMemoizingSupplier
            r0.<init>(r1)
            return r0
        L19:
            return r1
    }

    public static <T> com.google.common.base.Supplier<T> memoizeWithExpiration(com.google.common.base.Supplier<T> r1, long r2, java.util.concurrent.TimeUnit r4) {
            com.google.common.base.Suppliers$ExpiringMemoizingSupplier r0 = new com.google.common.base.Suppliers$ExpiringMemoizingSupplier
            r0.<init>(r1, r2, r4)
            return r0
    }

    public static <T> com.google.common.base.Supplier<T> ofInstance(@org.checkerframework.checker.nullness.compatqual.NullableDecl T r1) {
            com.google.common.base.Suppliers$SupplierOfInstance r0 = new com.google.common.base.Suppliers$SupplierOfInstance
            r0.<init>(r1)
            return r0
    }

    public static <T> com.google.common.base.Function<com.google.common.base.Supplier<T>, T> supplierFunction() {
            com.google.common.base.Suppliers$SupplierFunctionImpl r0 = com.google.common.base.Suppliers.SupplierFunctionImpl.INSTANCE
            return r0
    }

    public static <T> com.google.common.base.Supplier<T> synchronizedSupplier(com.google.common.base.Supplier<T> r1) {
            com.google.common.base.Suppliers$ThreadSafeSupplier r0 = new com.google.common.base.Suppliers$ThreadSafeSupplier
            r0.<init>(r1)
            return r0
    }
}
