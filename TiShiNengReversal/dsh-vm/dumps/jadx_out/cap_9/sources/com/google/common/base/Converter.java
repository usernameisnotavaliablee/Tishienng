package com.google.common.base;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class Converter<A, B> implements com.google.common.base.Function<A, B> {
    private final boolean handleNullAutomatically;

    @com.google.errorprone.annotations.concurrent.LazyInit
    @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
    private transient com.google.common.base.Converter<B, A> reverse;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class ConverterComposition<A, B, C> extends com.google.common.base.Converter<A, C> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        final com.google.common.base.Converter<A, B> first;
        final com.google.common.base.Converter<B, C> second;

        ConverterComposition(com.google.common.base.Converter<A, B> r1, com.google.common.base.Converter<B, C> r2) {
                r0 = this;
                r0.<init>()
                r0.first = r1
                r0.second = r2
                return
        }

        @Override // com.google.common.base.Converter
        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        A correctedDoBackward(@org.checkerframework.checker.nullness.compatqual.NullableDecl C r3) {
                r2 = this;
                com.google.common.base.Converter<A, B> r0 = r2.first
                com.google.common.base.Converter<B, C> r1 = r2.second
                java.lang.Object r3 = r1.correctedDoBackward(r3)
                java.lang.Object r3 = r0.correctedDoBackward(r3)
                return r3
        }

        @Override // com.google.common.base.Converter
        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        C correctedDoForward(@org.checkerframework.checker.nullness.compatqual.NullableDecl A r3) {
                r2 = this;
                com.google.common.base.Converter<B, C> r0 = r2.second
                com.google.common.base.Converter<A, B> r1 = r2.first
                java.lang.Object r3 = r1.correctedDoForward(r3)
                java.lang.Object r3 = r0.correctedDoForward(r3)
                return r3
        }

        @Override // com.google.common.base.Converter
        protected A doBackward(C r1) {
                r0 = this;
                java.lang.AssertionError r1 = new java.lang.AssertionError
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.base.Converter
        protected C doForward(A r1) {
                r0 = this;
                java.lang.AssertionError r1 = new java.lang.AssertionError
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof com.google.common.base.Converter.ConverterComposition
                r1 = 0
                if (r0 == 0) goto L1d
                com.google.common.base.Converter$ConverterComposition r4 = (com.google.common.base.Converter.ConverterComposition) r4
                com.google.common.base.Converter<A, B> r0 = r3.first
                com.google.common.base.Converter<A, B> r2 = r4.first
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L1d
                com.google.common.base.Converter<B, C> r0 = r3.second
                com.google.common.base.Converter<B, C> r4 = r4.second
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L1d
                r4 = 1
                return r4
            L1d:
                return r1
        }

        public int hashCode() {
                r2 = this;
                com.google.common.base.Converter<A, B> r0 = r2.first
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                com.google.common.base.Converter<B, C> r1 = r2.second
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                com.google.common.base.Converter<A, B> r1 = r2.first
                r0.append(r1)
                java.lang.String r1 = ".andThen("
                r0.append(r1)
                com.google.common.base.Converter<B, C> r1 = r2.second
                r0.append(r1)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class FunctionBasedConverter<A, B> extends com.google.common.base.Converter<A, B> implements java.io.Serializable {
        private final com.google.common.base.Function<? super B, ? extends A> backwardFunction;
        private final com.google.common.base.Function<? super A, ? extends B> forwardFunction;

        private FunctionBasedConverter(com.google.common.base.Function<? super A, ? extends B> r1, com.google.common.base.Function<? super B, ? extends A> r2) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.base.Function r1 = (com.google.common.base.Function) r1
                r0.forwardFunction = r1
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                com.google.common.base.Function r1 = (com.google.common.base.Function) r1
                r0.backwardFunction = r1
                return
        }

        /* synthetic */ FunctionBasedConverter(com.google.common.base.Function r1, com.google.common.base.Function r2, com.google.common.base.Converter.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // com.google.common.base.Converter
        protected A doBackward(B r2) {
                r1 = this;
                com.google.common.base.Function<? super B, ? extends A> r0 = r1.backwardFunction
                java.lang.Object r2 = r0.apply(r2)
                return r2
        }

        @Override // com.google.common.base.Converter
        protected B doForward(A r2) {
                r1 = this;
                com.google.common.base.Function<? super A, ? extends B> r0 = r1.forwardFunction
                java.lang.Object r2 = r0.apply(r2)
                return r2
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof com.google.common.base.Converter.FunctionBasedConverter
                r1 = 0
                if (r0 == 0) goto L1d
                com.google.common.base.Converter$FunctionBasedConverter r4 = (com.google.common.base.Converter.FunctionBasedConverter) r4
                com.google.common.base.Function<? super A, ? extends B> r0 = r3.forwardFunction
                com.google.common.base.Function<? super A, ? extends B> r2 = r4.forwardFunction
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L1d
                com.google.common.base.Function<? super B, ? extends A> r0 = r3.backwardFunction
                com.google.common.base.Function<? super B, ? extends A> r4 = r4.backwardFunction
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L1d
                r4 = 1
                return r4
            L1d:
                return r1
        }

        public int hashCode() {
                r2 = this;
                com.google.common.base.Function<? super A, ? extends B> r0 = r2.forwardFunction
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                com.google.common.base.Function<? super B, ? extends A> r1 = r2.backwardFunction
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Converter.from("
                r0.append(r1)
                com.google.common.base.Function<? super A, ? extends B> r1 = r2.forwardFunction
                r0.append(r1)
                java.lang.String r1 = ", "
                r0.append(r1)
                com.google.common.base.Function<? super B, ? extends A> r1 = r2.backwardFunction
                r0.append(r1)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class IdentityConverter<T> extends com.google.common.base.Converter<T, T> implements java.io.Serializable {
        static final com.google.common.base.Converter.IdentityConverter INSTANCE = null;
        private static final long serialVersionUID = 0;

        static {
                com.google.common.base.Converter$IdentityConverter r0 = new com.google.common.base.Converter$IdentityConverter
                r0.<init>()
                com.google.common.base.Converter.IdentityConverter.INSTANCE = r0
                return
        }

        private IdentityConverter() {
                r0 = this;
                r0.<init>()
                return
        }

        private java.lang.Object readResolve() {
                r1 = this;
                com.google.common.base.Converter$IdentityConverter r0 = com.google.common.base.Converter.IdentityConverter.INSTANCE
                return r0
        }

        @Override // com.google.common.base.Converter
        <S> com.google.common.base.Converter<T, S> doAndThen(com.google.common.base.Converter<T, S> r2) {
                r1 = this;
                java.lang.String r0 = "otherConverter"
                java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2, r0)
                com.google.common.base.Converter r2 = (com.google.common.base.Converter) r2
                return r2
        }

        @Override // com.google.common.base.Converter
        protected T doBackward(T r1) {
                r0 = this;
                return r1
        }

        @Override // com.google.common.base.Converter
        protected T doForward(T r1) {
                r0 = this;
                return r1
        }

        @Override // com.google.common.base.Converter
        public com.google.common.base.Converter.IdentityConverter<T> reverse() {
                r0 = this;
                return r0
        }

        @Override // com.google.common.base.Converter
        public /* bridge */ /* synthetic */ com.google.common.base.Converter reverse() {
                r1 = this;
                com.google.common.base.Converter$IdentityConverter r0 = r1.reverse()
                return r0
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "Converter.identity()"
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class ReverseConverter<A, B> extends com.google.common.base.Converter<B, A> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        final com.google.common.base.Converter<A, B> original;

        ReverseConverter(com.google.common.base.Converter<A, B> r1) {
                r0 = this;
                r0.<init>()
                r0.original = r1
                return
        }

        @Override // com.google.common.base.Converter
        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        B correctedDoBackward(@org.checkerframework.checker.nullness.compatqual.NullableDecl A r2) {
                r1 = this;
                com.google.common.base.Converter<A, B> r0 = r1.original
                java.lang.Object r2 = r0.correctedDoForward(r2)
                return r2
        }

        @Override // com.google.common.base.Converter
        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        A correctedDoForward(@org.checkerframework.checker.nullness.compatqual.NullableDecl B r2) {
                r1 = this;
                com.google.common.base.Converter<A, B> r0 = r1.original
                java.lang.Object r2 = r0.correctedDoBackward(r2)
                return r2
        }

        @Override // com.google.common.base.Converter
        protected B doBackward(A r1) {
                r0 = this;
                java.lang.AssertionError r1 = new java.lang.AssertionError
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.base.Converter
        protected A doForward(B r1) {
                r0 = this;
                java.lang.AssertionError r1 = new java.lang.AssertionError
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof com.google.common.base.Converter.ReverseConverter
                if (r0 == 0) goto Lf
                com.google.common.base.Converter$ReverseConverter r2 = (com.google.common.base.Converter.ReverseConverter) r2
                com.google.common.base.Converter<A, B> r0 = r1.original
                com.google.common.base.Converter<A, B> r2 = r2.original
                boolean r2 = r0.equals(r2)
                return r2
            Lf:
                r2 = 0
                return r2
        }

        public int hashCode() {
                r1 = this;
                com.google.common.base.Converter<A, B> r0 = r1.original
                int r0 = r0.hashCode()
                int r0 = ~r0
                return r0
        }

        @Override // com.google.common.base.Converter
        public com.google.common.base.Converter<A, B> reverse() {
                r1 = this;
                com.google.common.base.Converter<A, B> r0 = r1.original
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                com.google.common.base.Converter<A, B> r1 = r2.original
                r0.append(r1)
                java.lang.String r1 = ".reverse()"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    protected Converter() {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            return
    }

    Converter(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.handleNullAutomatically = r1
            return
    }

    public static <A, B> com.google.common.base.Converter<A, B> from(com.google.common.base.Function<? super A, ? extends B> r2, com.google.common.base.Function<? super B, ? extends A> r3) {
            com.google.common.base.Converter$FunctionBasedConverter r0 = new com.google.common.base.Converter$FunctionBasedConverter
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static <T> com.google.common.base.Converter<T, T> identity() {
            com.google.common.base.Converter$IdentityConverter r0 = com.google.common.base.Converter.IdentityConverter.INSTANCE
            return r0
    }

    public final <C> com.google.common.base.Converter<A, C> andThen(com.google.common.base.Converter<B, C> r1) {
            r0 = this;
            com.google.common.base.Converter r1 = r0.doAndThen(r1)
            return r1
    }

    @Override // com.google.common.base.Function
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    @java.lang.Deprecated
    public final B apply(@org.checkerframework.checker.nullness.compatqual.NullableDecl A r1) {
            r0 = this;
            java.lang.Object r1 = r0.convert(r1)
            return r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public final B convert(@org.checkerframework.checker.nullness.compatqual.NullableDecl A r1) {
            r0 = this;
            java.lang.Object r1 = r0.correctedDoForward(r1)
            return r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public java.lang.Iterable<B> convertAll(java.lang.Iterable<? extends A> r2) {
            r1 = this;
            java.lang.String r0 = "fromIterable"
            com.google.common.base.Preconditions.checkNotNull(r2, r0)
            com.google.common.base.Converter$1 r0 = new com.google.common.base.Converter$1
            r0.<init>(r1, r2)
            return r0
    }

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    A correctedDoBackward(@org.checkerframework.checker.nullness.compatqual.NullableDecl B r2) {
            r1 = this;
            boolean r0 = r1.handleNullAutomatically
            if (r0 == 0) goto L11
            if (r2 != 0) goto L8
            r2 = 0
            return r2
        L8:
            java.lang.Object r2 = r1.doBackward(r2)
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            return r2
        L11:
            java.lang.Object r2 = r1.doBackward(r2)
            return r2
    }

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    B correctedDoForward(@org.checkerframework.checker.nullness.compatqual.NullableDecl A r2) {
            r1 = this;
            boolean r0 = r1.handleNullAutomatically
            if (r0 == 0) goto L11
            if (r2 != 0) goto L8
            r2 = 0
            return r2
        L8:
            java.lang.Object r2 = r1.doForward(r2)
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            return r2
        L11:
            java.lang.Object r2 = r1.doForward(r2)
            return r2
    }

    <C> com.google.common.base.Converter<A, C> doAndThen(com.google.common.base.Converter<B, C> r2) {
            r1 = this;
            com.google.common.base.Converter$ConverterComposition r0 = new com.google.common.base.Converter$ConverterComposition
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.base.Converter r2 = (com.google.common.base.Converter) r2
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.errorprone.annotations.ForOverride
    protected abstract A doBackward(B r1);

    @com.google.errorprone.annotations.ForOverride
    protected abstract B doForward(A r1);

    @Override // com.google.common.base.Function
    public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.equals(r1)
            return r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.common.base.Converter<B, A> reverse() {
            r1 = this;
            com.google.common.base.Converter<B, A> r0 = r1.reverse
            if (r0 != 0) goto Lb
            com.google.common.base.Converter$ReverseConverter r0 = new com.google.common.base.Converter$ReverseConverter
            r0.<init>(r1)
            r1.reverse = r0
        Lb:
            return r0
    }
}
