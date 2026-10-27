package com.google.common.reflect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.Beta
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class TypeToken<T> extends com.google.common.reflect.TypeCapture<T> implements java.io.Serializable {
    private static final long serialVersionUID = 3637540370352322684L;

    @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
    private transient com.google.common.reflect.TypeResolver covariantTypeResolver;

    @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
    private transient com.google.common.reflect.TypeResolver invariantTypeResolver;
    private final java.lang.reflect.Type runtimeType;





    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class Bounds {
        private final java.lang.reflect.Type[] bounds;
        private final boolean target;

        Bounds(java.lang.reflect.Type[] r1, boolean r2) {
                r0 = this;
                r0.<init>()
                r0.bounds = r1
                r0.target = r2
                return
        }

        boolean isSubtypeOf(java.lang.reflect.Type r6) {
                r5 = this;
                java.lang.reflect.Type[] r0 = r5.bounds
                int r1 = r0.length
                r2 = 0
            L4:
                if (r2 >= r1) goto L18
                r3 = r0[r2]
                com.google.common.reflect.TypeToken r3 = com.google.common.reflect.TypeToken.of(r3)
                boolean r3 = r3.isSubtypeOf(r6)
                boolean r4 = r5.target
                if (r3 != r4) goto L15
                return r4
            L15:
                int r2 = r2 + 1
                goto L4
            L18:
                boolean r6 = r5.target
                r6 = r6 ^ 1
                return r6
        }

        boolean isSupertypeOf(java.lang.reflect.Type r6) {
                r5 = this;
                com.google.common.reflect.TypeToken r6 = com.google.common.reflect.TypeToken.of(r6)
                java.lang.reflect.Type[] r0 = r5.bounds
                int r1 = r0.length
                r2 = 0
            L8:
                if (r2 >= r1) goto L18
                r3 = r0[r2]
                boolean r3 = r6.isSubtypeOf(r3)
                boolean r4 = r5.target
                if (r3 != r4) goto L15
                return r4
            L15:
                int r2 = r2 + 1
                goto L8
            L18:
                boolean r6 = r5.target
                r6 = r6 ^ 1
                return r6
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class ClassSet extends com.google.common.reflect.TypeToken<T>.TypeSet {
        private static final long serialVersionUID = 0;

        @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
        private transient com.google.common.collect.ImmutableSet<com.google.common.reflect.TypeToken<? super T>> classes;
        final /* synthetic */ com.google.common.reflect.TypeToken this$0;

        private ClassSet(com.google.common.reflect.TypeToken r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }

        /* synthetic */ ClassSet(com.google.common.reflect.TypeToken r1, com.google.common.reflect.TypeToken.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private java.lang.Object readResolve() {
                r1 = this;
                com.google.common.reflect.TypeToken r0 = r1.this$0
                com.google.common.reflect.TypeToken$TypeSet r0 = r0.getTypes()
                com.google.common.reflect.TypeToken$TypeSet r0 = r0.classes()
                return r0
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public com.google.common.reflect.TypeToken<T>.TypeSet classes() {
                r0 = this;
                return r0
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ java.lang.Object delegate() {
                r1 = this;
                java.util.Set r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ java.util.Collection delegate() {
                r1 = this;
                java.util.Set r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        protected java.util.Set<com.google.common.reflect.TypeToken<? super T>> delegate() {
                r2 = this;
                com.google.common.collect.ImmutableSet<com.google.common.reflect.TypeToken<? super T>> r0 = r2.classes
                if (r0 != 0) goto L20
                com.google.common.reflect.TypeToken$TypeCollector<com.google.common.reflect.TypeToken<?>> r0 = com.google.common.reflect.TypeToken.TypeCollector.FOR_GENERIC_TYPE
                com.google.common.reflect.TypeToken$TypeCollector r0 = r0.classesOnly()
                com.google.common.reflect.TypeToken r1 = r2.this$0
                com.google.common.collect.ImmutableList r0 = r0.collectTypes(r1)
                com.google.common.collect.FluentIterable r0 = com.google.common.collect.FluentIterable.from(r0)
                com.google.common.reflect.TypeToken$TypeFilter r1 = com.google.common.reflect.TypeToken.TypeFilter.IGNORE_TYPE_VARIABLE_OR_WILDCARD
                com.google.common.collect.FluentIterable r0 = r0.filter(r1)
                com.google.common.collect.ImmutableSet r0 = r0.toSet()
                r2.classes = r0
            L20:
                return r0
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public com.google.common.reflect.TypeToken<T>.TypeSet interfaces() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "classes().interfaces() not supported."
                r0.<init>(r1)
                throw r0
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public java.util.Set<java.lang.Class<? super T>> rawTypes() {
                r2 = this;
                com.google.common.reflect.TypeToken$TypeCollector<java.lang.Class<?>> r0 = com.google.common.reflect.TypeToken.TypeCollector.FOR_RAW_TYPE
                com.google.common.reflect.TypeToken$TypeCollector r0 = r0.classesOnly()
                com.google.common.reflect.TypeToken r1 = r2.this$0
                com.google.common.collect.ImmutableSet r1 = com.google.common.reflect.TypeToken.access$300(r1)
                com.google.common.collect.ImmutableList r0 = r0.collectTypes(r1)
                com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.copyOf(r0)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class InterfaceSet extends com.google.common.reflect.TypeToken<T>.TypeSet {
        private static final long serialVersionUID = 0;
        private final transient com.google.common.reflect.TypeToken<T>.TypeSet allTypes;

        @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
        private transient com.google.common.collect.ImmutableSet<com.google.common.reflect.TypeToken<? super T>> interfaces;
        final /* synthetic */ com.google.common.reflect.TypeToken this$0;


        InterfaceSet(com.google.common.reflect.TypeToken r1, com.google.common.reflect.TypeToken<T>.TypeSet r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                r0.allTypes = r2
                return
        }

        private java.lang.Object readResolve() {
                r1 = this;
                com.google.common.reflect.TypeToken r0 = r1.this$0
                com.google.common.reflect.TypeToken$TypeSet r0 = r0.getTypes()
                com.google.common.reflect.TypeToken$TypeSet r0 = r0.interfaces()
                return r0
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public com.google.common.reflect.TypeToken<T>.TypeSet classes() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "interfaces().classes() not supported."
                r0.<init>(r1)
                throw r0
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ java.lang.Object delegate() {
                r1 = this;
                java.util.Set r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ java.util.Collection delegate() {
                r1 = this;
                java.util.Set r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        protected java.util.Set<com.google.common.reflect.TypeToken<? super T>> delegate() {
                r2 = this;
                com.google.common.collect.ImmutableSet<com.google.common.reflect.TypeToken<? super T>> r0 = r2.interfaces
                if (r0 != 0) goto L16
                com.google.common.reflect.TypeToken<T>$TypeSet r0 = r2.allTypes
                com.google.common.collect.FluentIterable r0 = com.google.common.collect.FluentIterable.from(r0)
                com.google.common.reflect.TypeToken$TypeFilter r1 = com.google.common.reflect.TypeToken.TypeFilter.INTERFACE_ONLY
                com.google.common.collect.FluentIterable r0 = r0.filter(r1)
                com.google.common.collect.ImmutableSet r0 = r0.toSet()
                r2.interfaces = r0
            L16:
                return r0
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public com.google.common.reflect.TypeToken<T>.TypeSet interfaces() {
                r0 = this;
                return r0
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public java.util.Set<java.lang.Class<? super T>> rawTypes() {
                r2 = this;
                com.google.common.reflect.TypeToken$TypeCollector<java.lang.Class<?>> r0 = com.google.common.reflect.TypeToken.TypeCollector.FOR_RAW_TYPE
                com.google.common.reflect.TypeToken r1 = r2.this$0
                com.google.common.collect.ImmutableSet r1 = com.google.common.reflect.TypeToken.access$300(r1)
                com.google.common.collect.ImmutableList r0 = r0.collectTypes(r1)
                com.google.common.collect.FluentIterable r0 = com.google.common.collect.FluentIterable.from(r0)
                com.google.common.reflect.TypeToken$InterfaceSet$1 r1 = new com.google.common.reflect.TypeToken$InterfaceSet$1
                r1.<init>(r2)
                com.google.common.collect.FluentIterable r0 = r0.filter(r1)
                com.google.common.collect.ImmutableSet r0 = r0.toSet()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class SimpleTypeToken<T> extends com.google.common.reflect.TypeToken<T> {
        private static final long serialVersionUID = 0;

        SimpleTypeToken(java.lang.reflect.Type r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static abstract class TypeCollector<K> {
        static final com.google.common.reflect.TypeToken.TypeCollector<com.google.common.reflect.TypeToken<?>> FOR_GENERIC_TYPE = null;
        static final com.google.common.reflect.TypeToken.TypeCollector<java.lang.Class<?>> FOR_RAW_TYPE = null;





        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private static class ForwardingTypeCollector<K> extends com.google.common.reflect.TypeToken.TypeCollector<K> {
            private final com.google.common.reflect.TypeToken.TypeCollector<K> delegate;

            ForwardingTypeCollector(com.google.common.reflect.TypeToken.TypeCollector<K> r2) {
                    r1 = this;
                    r0 = 0
                    r1.<init>(r0)
                    r1.delegate = r2
                    return
            }

            @Override // com.google.common.reflect.TypeToken.TypeCollector
            java.lang.Iterable<? extends K> getInterfaces(K r2) {
                    r1 = this;
                    com.google.common.reflect.TypeToken$TypeCollector<K> r0 = r1.delegate
                    java.lang.Iterable r2 = r0.getInterfaces(r2)
                    return r2
            }

            @Override // com.google.common.reflect.TypeToken.TypeCollector
            java.lang.Class<?> getRawType(K r2) {
                    r1 = this;
                    com.google.common.reflect.TypeToken$TypeCollector<K> r0 = r1.delegate
                    java.lang.Class r2 = r0.getRawType(r2)
                    return r2
            }

            @Override // com.google.common.reflect.TypeToken.TypeCollector
            K getSuperclass(K r2) {
                    r1 = this;
                    com.google.common.reflect.TypeToken$TypeCollector<K> r0 = r1.delegate
                    java.lang.Object r2 = r0.getSuperclass(r2)
                    return r2
            }
        }

        static {
                com.google.common.reflect.TypeToken$TypeCollector$1 r0 = new com.google.common.reflect.TypeToken$TypeCollector$1
                r0.<init>()
                com.google.common.reflect.TypeToken.TypeCollector.FOR_GENERIC_TYPE = r0
                com.google.common.reflect.TypeToken$TypeCollector$2 r0 = new com.google.common.reflect.TypeToken$TypeCollector$2
                r0.<init>()
                com.google.common.reflect.TypeToken.TypeCollector.FOR_RAW_TYPE = r0
                return
        }

        private TypeCollector() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ TypeCollector(com.google.common.reflect.TypeToken.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        private int collectTypes(K r4, java.util.Map<? super K, java.lang.Integer> r5) {
                r3 = this;
                java.lang.Object r0 = r5.get(r4)
                java.lang.Integer r0 = (java.lang.Integer) r0
                if (r0 == 0) goto Ld
                int r4 = r0.intValue()
                return r4
            Ld:
                java.lang.Class r0 = r3.getRawType(r4)
                boolean r0 = r0.isInterface()
                java.lang.Iterable r1 = r3.getInterfaces(r4)
                java.util.Iterator r1 = r1.iterator()
            L1d:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L30
                java.lang.Object r2 = r1.next()
                int r2 = r3.collectTypes(r2, r5)
                int r0 = java.lang.Math.max(r0, r2)
                goto L1d
            L30:
                java.lang.Object r1 = r3.getSuperclass(r4)
                if (r1 == 0) goto L3e
                int r1 = r3.collectTypes(r1, r5)
                int r0 = java.lang.Math.max(r0, r1)
            L3e:
                int r0 = r0 + 1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
                r5.put(r4, r1)
                return r0
        }

        private static <K, V> com.google.common.collect.ImmutableList<K> sortKeysByValue(java.util.Map<K, V> r1, java.util.Comparator<? super V> r2) {
                com.google.common.reflect.TypeToken$TypeCollector$4 r0 = new com.google.common.reflect.TypeToken$TypeCollector$4
                r0.<init>(r2, r1)
                java.util.Set r1 = r1.keySet()
                com.google.common.collect.ImmutableList r1 = r0.immutableSortedCopy(r1)
                return r1
        }

        final com.google.common.reflect.TypeToken.TypeCollector<K> classesOnly() {
                r1 = this;
                com.google.common.reflect.TypeToken$TypeCollector$3 r0 = new com.google.common.reflect.TypeToken$TypeCollector$3
                r0.<init>(r1, r1)
                return r0
        }

        com.google.common.collect.ImmutableList<K> collectTypes(java.lang.Iterable<? extends K> r3) {
                r2 = this;
                java.util.HashMap r0 = com.google.common.collect.Maps.newHashMap()
                java.util.Iterator r3 = r3.iterator()
            L8:
                boolean r1 = r3.hasNext()
                if (r1 == 0) goto L16
                java.lang.Object r1 = r3.next()
                r2.collectTypes(r1, r0)
                goto L8
            L16:
                com.google.common.collect.Ordering r3 = com.google.common.collect.Ordering.natural()
                com.google.common.collect.Ordering r3 = r3.reverse()
                com.google.common.collect.ImmutableList r3 = sortKeysByValue(r0, r3)
                return r3
        }

        final com.google.common.collect.ImmutableList<K> collectTypes(K r1) {
                r0 = this;
                com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of(r1)
                com.google.common.collect.ImmutableList r1 = r0.collectTypes(r1)
                return r1
        }

        abstract java.lang.Iterable<? extends K> getInterfaces(K r1);

        abstract java.lang.Class<?> getRawType(K r1);

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        abstract K getSuperclass(K r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private enum TypeFilter extends java.lang.Enum<com.google.common.reflect.TypeToken.TypeFilter> implements com.google.common.base.Predicate<com.google.common.reflect.TypeToken<?>> {
        private static final /* synthetic */ com.google.common.reflect.TypeToken.TypeFilter[] $VALUES = null;
        public static final com.google.common.reflect.TypeToken.TypeFilter IGNORE_TYPE_VARIABLE_OR_WILDCARD = null;
        public static final com.google.common.reflect.TypeToken.TypeFilter INTERFACE_ONLY = null;



        static {
                com.google.common.reflect.TypeToken$TypeFilter$1 r0 = new com.google.common.reflect.TypeToken$TypeFilter$1
                java.lang.String r1 = "IGNORE_TYPE_VARIABLE_OR_WILDCARD"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.common.reflect.TypeToken.TypeFilter.IGNORE_TYPE_VARIABLE_OR_WILDCARD = r0
                com.google.common.reflect.TypeToken$TypeFilter$2 r1 = new com.google.common.reflect.TypeToken$TypeFilter$2
                java.lang.String r3 = "INTERFACE_ONLY"
                r4 = 1
                r1.<init>(r3, r4)
                com.google.common.reflect.TypeToken.TypeFilter.INTERFACE_ONLY = r1
                r3 = 2
                com.google.common.reflect.TypeToken$TypeFilter[] r3 = new com.google.common.reflect.TypeToken.TypeFilter[r3]
                r3[r2] = r0
                r3[r4] = r1
                com.google.common.reflect.TypeToken.TypeFilter.$VALUES = r3
                return
        }

        TypeFilter(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* synthetic */ TypeFilter(java.lang.String r1, int r2, com.google.common.reflect.TypeToken.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.reflect.TypeToken.TypeFilter valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.reflect.TypeToken$TypeFilter> r0 = com.google.common.reflect.TypeToken.TypeFilter.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.reflect.TypeToken$TypeFilter r1 = (com.google.common.reflect.TypeToken.TypeFilter) r1
                return r1
        }

        public static com.google.common.reflect.TypeToken.TypeFilter[] values() {
                com.google.common.reflect.TypeToken$TypeFilter[] r0 = com.google.common.reflect.TypeToken.TypeFilter.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.reflect.TypeToken$TypeFilter[] r0 = (com.google.common.reflect.TypeToken.TypeFilter[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class TypeSet extends com.google.common.collect.ForwardingSet<com.google.common.reflect.TypeToken<? super T>> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        final /* synthetic */ com.google.common.reflect.TypeToken this$0;

        @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
        private transient com.google.common.collect.ImmutableSet<com.google.common.reflect.TypeToken<? super T>> types;

        TypeSet(com.google.common.reflect.TypeToken r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public com.google.common.reflect.TypeToken<T>.TypeSet classes() {
                r3 = this;
                com.google.common.reflect.TypeToken$ClassSet r0 = new com.google.common.reflect.TypeToken$ClassSet
                com.google.common.reflect.TypeToken r1 = r3.this$0
                r2 = 0
                r0.<init>(r1, r2)
                return r0
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ java.lang.Object delegate() {
                r1 = this;
                java.util.Set r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ java.util.Collection delegate() {
                r1 = this;
                java.util.Set r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        protected java.util.Set<com.google.common.reflect.TypeToken<? super T>> delegate() {
                r2 = this;
                com.google.common.collect.ImmutableSet<com.google.common.reflect.TypeToken<? super T>> r0 = r2.types
                if (r0 != 0) goto L1c
                com.google.common.reflect.TypeToken$TypeCollector<com.google.common.reflect.TypeToken<?>> r0 = com.google.common.reflect.TypeToken.TypeCollector.FOR_GENERIC_TYPE
                com.google.common.reflect.TypeToken r1 = r2.this$0
                com.google.common.collect.ImmutableList r0 = r0.collectTypes(r1)
                com.google.common.collect.FluentIterable r0 = com.google.common.collect.FluentIterable.from(r0)
                com.google.common.reflect.TypeToken$TypeFilter r1 = com.google.common.reflect.TypeToken.TypeFilter.IGNORE_TYPE_VARIABLE_OR_WILDCARD
                com.google.common.collect.FluentIterable r0 = r0.filter(r1)
                com.google.common.collect.ImmutableSet r0 = r0.toSet()
                r2.types = r0
            L1c:
                return r0
        }

        public com.google.common.reflect.TypeToken<T>.TypeSet interfaces() {
                r2 = this;
                com.google.common.reflect.TypeToken$InterfaceSet r0 = new com.google.common.reflect.TypeToken$InterfaceSet
                com.google.common.reflect.TypeToken r1 = r2.this$0
                r0.<init>(r1, r2)
                return r0
        }

        public java.util.Set<java.lang.Class<? super T>> rawTypes() {
                r2 = this;
                com.google.common.reflect.TypeToken$TypeCollector<java.lang.Class<?>> r0 = com.google.common.reflect.TypeToken.TypeCollector.FOR_RAW_TYPE
                com.google.common.reflect.TypeToken r1 = r2.this$0
                com.google.common.collect.ImmutableSet r1 = com.google.common.reflect.TypeToken.access$300(r1)
                com.google.common.collect.ImmutableList r0 = r0.collectTypes(r1)
                com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.copyOf(r0)
                return r0
        }
    }

    protected TypeToken() {
            r3 = this;
            r3.<init>()
            java.lang.reflect.Type r0 = r3.capture()
            r3.runtimeType = r0
            boolean r1 = r0 instanceof java.lang.reflect.TypeVariable
            r1 = r1 ^ 1
            java.lang.String r2 = "Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead."
            com.google.common.base.Preconditions.checkState(r1, r2, r0)
            return
    }

    protected TypeToken(java.lang.Class<?> r3) {
            r2 = this;
            r2.<init>()
            java.lang.reflect.Type r0 = super.capture()
            boolean r1 = r0 instanceof java.lang.Class
            if (r1 == 0) goto Le
            r2.runtimeType = r0
            return
        Le:
            com.google.common.reflect.TypeResolver r3 = com.google.common.reflect.TypeResolver.covariantly(r3)
            java.lang.reflect.Type r3 = r3.resolveType(r0)
            r2.runtimeType = r3
            return
    }

    private TypeToken(java.lang.reflect.Type r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.lang.reflect.Type r1 = (java.lang.reflect.Type) r1
            r0.runtimeType = r1
            return
    }

    /* synthetic */ TypeToken(java.lang.reflect.Type r1, com.google.common.reflect.TypeToken.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    static /* synthetic */ com.google.common.reflect.TypeResolver access$000(com.google.common.reflect.TypeToken r0) {
            com.google.common.reflect.TypeResolver r0 = r0.getCovariantTypeResolver()
            return r0
    }

    static /* synthetic */ com.google.common.reflect.TypeResolver access$100(com.google.common.reflect.TypeToken r0) {
            com.google.common.reflect.TypeResolver r0 = r0.getInvariantTypeResolver()
            return r0
    }

    static /* synthetic */ com.google.common.collect.ImmutableSet access$300(com.google.common.reflect.TypeToken r0) {
            com.google.common.collect.ImmutableSet r0 = r0.getRawTypes()
            return r0
    }

    static /* synthetic */ java.lang.reflect.Type access$500(com.google.common.reflect.TypeToken r0) {
            java.lang.reflect.Type r0 = r0.runtimeType
            return r0
    }

    private static com.google.common.reflect.TypeToken.Bounds any(java.lang.reflect.Type[] r2) {
            com.google.common.reflect.TypeToken$Bounds r0 = new com.google.common.reflect.TypeToken$Bounds
            r1 = 1
            r0.<init>(r2, r1)
            return r0
    }

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    private com.google.common.reflect.TypeToken<? super T> boundAsSuperclass(java.lang.reflect.Type r2) {
            r1 = this;
            com.google.common.reflect.TypeToken r2 = of(r2)
            java.lang.Class r0 = r2.getRawType()
            boolean r0 = r0.isInterface()
            if (r0 == 0) goto Lf
            r2 = 0
        Lf:
            return r2
    }

    private com.google.common.collect.ImmutableList<com.google.common.reflect.TypeToken<? super T>> boundsAsInterfaces(java.lang.reflect.Type[] r6) {
            r5 = this;
            com.google.common.collect.ImmutableList$Builder r0 = com.google.common.collect.ImmutableList.builder()
            int r1 = r6.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L1e
            r3 = r6[r2]
            com.google.common.reflect.TypeToken r3 = of(r3)
            java.lang.Class r4 = r3.getRawType()
            boolean r4 = r4.isInterface()
            if (r4 == 0) goto L1b
            r0.add(r3)
        L1b:
            int r2 = r2 + 1
            goto L6
        L1e:
            com.google.common.collect.ImmutableList r6 = r0.build()
            return r6
    }

    private static java.lang.reflect.Type canonicalizeTypeArg(java.lang.reflect.TypeVariable<?> r1, java.lang.reflect.Type r2) {
            boolean r0 = r2 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto Lb
            java.lang.reflect.WildcardType r2 = (java.lang.reflect.WildcardType) r2
            java.lang.reflect.WildcardType r1 = canonicalizeWildcardType(r1, r2)
            return r1
        Lb:
            java.lang.reflect.Type r1 = canonicalizeWildcardsInType(r2)
            return r1
    }

    private static java.lang.reflect.WildcardType canonicalizeWildcardType(java.lang.reflect.TypeVariable<?> r7, java.lang.reflect.WildcardType r8) {
            java.lang.reflect.Type[] r7 = r7.getBounds()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.reflect.Type[] r1 = r8.getUpperBounds()
            int r2 = r1.length
            r3 = 0
            r4 = 0
        L10:
            if (r4 >= r2) goto L28
            r5 = r1[r4]
            com.google.common.reflect.TypeToken$Bounds r6 = any(r7)
            boolean r6 = r6.isSubtypeOf(r5)
            if (r6 != 0) goto L25
            java.lang.reflect.Type r5 = canonicalizeWildcardsInType(r5)
            r0.add(r5)
        L25:
            int r4 = r4 + 1
            goto L10
        L28:
            com.google.common.reflect.Types$WildcardTypeImpl r7 = new com.google.common.reflect.Types$WildcardTypeImpl
            java.lang.reflect.Type[] r8 = r8.getLowerBounds()
            java.lang.reflect.Type[] r1 = new java.lang.reflect.Type[r3]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
            r7.<init>(r8, r0)
            return r7
    }

    private static java.lang.reflect.ParameterizedType canonicalizeWildcardsInParameterizedType(java.lang.reflect.ParameterizedType r6) {
            java.lang.reflect.Type r0 = r6.getRawType()
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.reflect.TypeVariable[] r1 = r0.getTypeParameters()
            java.lang.reflect.Type[] r2 = r6.getActualTypeArguments()
            r3 = 0
        Lf:
            int r4 = r2.length
            if (r3 >= r4) goto L1f
            r4 = r1[r3]
            r5 = r2[r3]
            java.lang.reflect.Type r4 = canonicalizeTypeArg(r4, r5)
            r2[r3] = r4
            int r3 = r3 + 1
            goto Lf
        L1f:
            java.lang.reflect.Type r6 = r6.getOwnerType()
            java.lang.reflect.ParameterizedType r6 = com.google.common.reflect.Types.newParameterizedTypeWithOwner(r6, r0, r2)
            return r6
    }

    private static java.lang.reflect.Type canonicalizeWildcardsInType(java.lang.reflect.Type r1) {
            boolean r0 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto Lb
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            java.lang.reflect.ParameterizedType r1 = canonicalizeWildcardsInParameterizedType(r1)
            return r1
        Lb:
            boolean r0 = r1 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L1d
            java.lang.reflect.GenericArrayType r1 = (java.lang.reflect.GenericArrayType) r1
            java.lang.reflect.Type r1 = r1.getGenericComponentType()
            java.lang.reflect.Type r1 = canonicalizeWildcardsInType(r1)
            java.lang.reflect.Type r1 = com.google.common.reflect.Types.newArrayType(r1)
        L1d:
            return r1
    }

    private static com.google.common.reflect.TypeToken.Bounds every(java.lang.reflect.Type[] r2) {
            com.google.common.reflect.TypeToken$Bounds r0 = new com.google.common.reflect.TypeToken$Bounds
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    private com.google.common.reflect.TypeToken<? extends T> getArraySubtype(java.lang.Class<?> r2) {
            r1 = this;
            com.google.common.reflect.TypeToken r0 = r1.getComponentType()
            java.lang.Class r2 = r2.getComponentType()
            com.google.common.reflect.TypeToken r2 = r0.getSubtype(r2)
            java.lang.reflect.Type r2 = r2.runtimeType
            java.lang.reflect.Type r2 = newArrayClassOrGenericArrayType(r2)
            com.google.common.reflect.TypeToken r2 = of(r2)
            return r2
    }

    private com.google.common.reflect.TypeToken<? super T> getArraySupertype(java.lang.Class<? super T> r3) {
            r2 = this;
            com.google.common.reflect.TypeToken r0 = r2.getComponentType()
            java.lang.String r1 = "%s isn't a super type of %s"
            java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r0, r1, r3, r2)
            com.google.common.reflect.TypeToken r0 = (com.google.common.reflect.TypeToken) r0
            java.lang.Class r3 = r3.getComponentType()
            com.google.common.reflect.TypeToken r3 = r0.getSupertype(r3)
            java.lang.reflect.Type r3 = r3.runtimeType
            java.lang.reflect.Type r3 = newArrayClassOrGenericArrayType(r3)
            com.google.common.reflect.TypeToken r3 = of(r3)
            return r3
    }

    private com.google.common.reflect.TypeResolver getCovariantTypeResolver() {
            r1 = this;
            com.google.common.reflect.TypeResolver r0 = r1.covariantTypeResolver
            if (r0 != 0) goto Lc
            java.lang.reflect.Type r0 = r1.runtimeType
            com.google.common.reflect.TypeResolver r0 = com.google.common.reflect.TypeResolver.covariantly(r0)
            r1.covariantTypeResolver = r0
        Lc:
            return r0
    }

    private com.google.common.reflect.TypeResolver getInvariantTypeResolver() {
            r1 = this;
            com.google.common.reflect.TypeResolver r0 = r1.invariantTypeResolver
            if (r0 != 0) goto Lc
            java.lang.reflect.Type r0 = r1.runtimeType
            com.google.common.reflect.TypeResolver r0 = com.google.common.reflect.TypeResolver.invariantly(r0)
            r1.invariantTypeResolver = r0
        Lc:
            return r0
    }

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    private java.lang.reflect.Type getOwnerTypeIfPresent() {
            r2 = this;
            java.lang.reflect.Type r0 = r2.runtimeType
            boolean r1 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r1 == 0) goto Ld
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type r0 = r0.getOwnerType()
            return r0
        Ld:
            boolean r1 = r0 instanceof java.lang.Class
            if (r1 == 0) goto L18
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.Class r0 = r0.getEnclosingClass()
            return r0
        L18:
            r0 = 0
            return r0
    }

    private com.google.common.collect.ImmutableSet<java.lang.Class<? super T>> getRawTypes() {
            r5 = this;
            com.google.common.collect.ImmutableSet$Builder r0 = com.google.common.collect.ImmutableSet.builder()
            com.google.common.reflect.TypeToken$4 r1 = new com.google.common.reflect.TypeToken$4
            r1.<init>(r5, r0)
            java.lang.reflect.Type r2 = r5.runtimeType
            r3 = 1
            java.lang.reflect.Type[] r3 = new java.lang.reflect.Type[r3]
            r4 = 0
            r3[r4] = r2
            r1.visit(r3)
            com.google.common.collect.ImmutableSet r0 = r0.build()
            return r0
    }

    private com.google.common.reflect.TypeToken<? extends T> getSubtypeFromLowerBounds(java.lang.Class<?> r2, java.lang.reflect.Type[] r3) {
            r1 = this;
            int r0 = r3.length
            if (r0 <= 0) goto Lf
            r0 = 0
            r3 = r3[r0]
            com.google.common.reflect.TypeToken r3 = of(r3)
            com.google.common.reflect.TypeToken r2 = r3.getSubtype(r2)
            return r2
        Lf:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = " isn't a subclass of "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
    }

    private com.google.common.reflect.TypeToken<? super T> getSupertypeFromUpperBounds(java.lang.Class<? super T> r5, java.lang.reflect.Type[] r6) {
            r4 = this;
            int r0 = r6.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L18
            r2 = r6[r1]
            com.google.common.reflect.TypeToken r2 = of(r2)
            boolean r3 = r2.isSubtypeOf(r5)
            if (r3 == 0) goto L15
            com.google.common.reflect.TypeToken r5 = r2.getSupertype(r5)
            return r5
        L15:
            int r1 = r1 + 1
            goto L2
        L18:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r5 = " isn't a super type of "
            r0.append(r5)
            r0.append(r4)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
    }

    private boolean is(java.lang.reflect.Type r3, java.lang.reflect.TypeVariable<?> r4) {
            r2 = this;
            java.lang.reflect.Type r0 = r2.runtimeType
            boolean r0 = r0.equals(r3)
            r1 = 1
            if (r0 == 0) goto La
            return r1
        La:
            boolean r0 = r3 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L37
            java.lang.reflect.WildcardType r3 = (java.lang.reflect.WildcardType) r3
            java.lang.reflect.WildcardType r3 = canonicalizeWildcardType(r4, r3)
            java.lang.reflect.Type[] r4 = r3.getUpperBounds()
            com.google.common.reflect.TypeToken$Bounds r4 = every(r4)
            java.lang.reflect.Type r0 = r2.runtimeType
            boolean r4 = r4.isSupertypeOf(r0)
            if (r4 == 0) goto L35
            java.lang.reflect.Type[] r3 = r3.getLowerBounds()
            com.google.common.reflect.TypeToken$Bounds r3 = every(r3)
            java.lang.reflect.Type r4 = r2.runtimeType
            boolean r3 = r3.isSubtypeOf(r4)
            if (r3 == 0) goto L35
            return r1
        L35:
            r3 = 0
            return r3
        L37:
            java.lang.reflect.Type r4 = r2.runtimeType
            java.lang.reflect.Type r4 = canonicalizeWildcardsInType(r4)
            java.lang.reflect.Type r3 = canonicalizeWildcardsInType(r3)
            boolean r3 = r4.equals(r3)
            return r3
    }

    private boolean isOwnedBySubtypeOf(java.lang.reflect.Type r3) {
            r2 = this;
            com.google.common.reflect.TypeToken$TypeSet r0 = r2.getTypes()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            com.google.common.reflect.TypeToken r1 = (com.google.common.reflect.TypeToken) r1
            java.lang.reflect.Type r1 = r1.getOwnerTypeIfPresent()
            if (r1 == 0) goto L8
            com.google.common.reflect.TypeToken r1 = of(r1)
            boolean r1 = r1.isSubtypeOf(r3)
            if (r1 == 0) goto L8
            r3 = 1
            return r3
        L26:
            r3 = 0
            return r3
    }

    private boolean isSubtypeOfArrayType(java.lang.reflect.GenericArrayType r4) {
            r3 = this;
            java.lang.reflect.Type r0 = r3.runtimeType
            boolean r1 = r0 instanceof java.lang.Class
            r2 = 0
            if (r1 == 0) goto L21
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r1 = r0.isArray()
            if (r1 != 0) goto L10
            return r2
        L10:
            java.lang.Class r0 = r0.getComponentType()
            com.google.common.reflect.TypeToken r0 = of(r0)
            java.lang.reflect.Type r4 = r4.getGenericComponentType()
            boolean r4 = r0.isSubtypeOf(r4)
            return r4
        L21:
            boolean r1 = r0 instanceof java.lang.reflect.GenericArrayType
            if (r1 == 0) goto L38
            java.lang.reflect.GenericArrayType r0 = (java.lang.reflect.GenericArrayType) r0
            java.lang.reflect.Type r0 = r0.getGenericComponentType()
            com.google.common.reflect.TypeToken r0 = of(r0)
            java.lang.reflect.Type r4 = r4.getGenericComponentType()
            boolean r4 = r0.isSubtypeOf(r4)
            return r4
        L38:
            return r2
    }

    private boolean isSubtypeOfParameterizedType(java.lang.reflect.ParameterizedType r8) {
            r7 = this;
            com.google.common.reflect.TypeToken r0 = of(r8)
            java.lang.Class r0 = r0.getRawType()
            boolean r1 = r7.someRawTypeIsSubclassOf(r0)
            r2 = 0
            if (r1 != 0) goto L10
            return r2
        L10:
            java.lang.reflect.TypeVariable[] r0 = r0.getTypeParameters()
            java.lang.reflect.Type[] r1 = r8.getActualTypeArguments()
            r3 = 0
        L19:
            int r4 = r0.length
            if (r3 >= r4) goto L38
            com.google.common.reflect.TypeResolver r4 = r7.getCovariantTypeResolver()
            r5 = r0[r3]
            java.lang.reflect.Type r4 = r4.resolveType(r5)
            com.google.common.reflect.TypeToken r4 = of(r4)
            r5 = r1[r3]
            r6 = r0[r3]
            boolean r4 = r4.is(r5, r6)
            if (r4 != 0) goto L35
            return r2
        L35:
            int r3 = r3 + 1
            goto L19
        L38:
            java.lang.reflect.Type r0 = r8.getRawType()
            java.lang.Class r0 = (java.lang.Class) r0
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto L5a
            java.lang.reflect.Type r0 = r8.getOwnerType()
            if (r0 == 0) goto L5a
            java.lang.reflect.Type r8 = r8.getOwnerType()
            boolean r8 = r7.isOwnedBySubtypeOf(r8)
            if (r8 == 0) goto L59
            goto L5a
        L59:
            return r2
        L5a:
            r8 = 1
            return r8
    }

    private boolean isSupertypeOfArray(java.lang.reflect.GenericArrayType r3) {
            r2 = this;
            java.lang.reflect.Type r0 = r2.runtimeType
            boolean r1 = r0 instanceof java.lang.Class
            if (r1 == 0) goto L26
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r1 = r0.isArray()
            if (r1 != 0) goto L15
            java.lang.Class<java.lang.Object[]> r3 = java.lang.Object[].class
            boolean r3 = r0.isAssignableFrom(r3)
            return r3
        L15:
            java.lang.reflect.Type r3 = r3.getGenericComponentType()
            com.google.common.reflect.TypeToken r3 = of(r3)
            java.lang.Class r0 = r0.getComponentType()
            boolean r3 = r3.isSubtypeOf(r0)
            return r3
        L26:
            boolean r0 = r0 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L3f
            java.lang.reflect.Type r3 = r3.getGenericComponentType()
            com.google.common.reflect.TypeToken r3 = of(r3)
            java.lang.reflect.Type r0 = r2.runtimeType
            java.lang.reflect.GenericArrayType r0 = (java.lang.reflect.GenericArrayType) r0
            java.lang.reflect.Type r0 = r0.getGenericComponentType()
            boolean r3 = r3.isSubtypeOf(r0)
            return r3
        L3f:
            r3 = 0
            return r3
    }

    private boolean isWrapper() {
            r2 = this;
            java.util.Set r0 = com.google.common.primitives.Primitives.allWrapperTypes()
            java.lang.reflect.Type r1 = r2.runtimeType
            boolean r0 = r0.contains(r1)
            return r0
    }

    private static java.lang.reflect.Type newArrayClassOrGenericArrayType(java.lang.reflect.Type r1) {
            com.google.common.reflect.Types$JavaVersion r0 = com.google.common.reflect.Types.JavaVersion.JAVA7
            java.lang.reflect.Type r1 = r0.newArrayType(r1)
            return r1
    }

    public static <T> com.google.common.reflect.TypeToken<T> of(java.lang.Class<T> r1) {
            com.google.common.reflect.TypeToken$SimpleTypeToken r0 = new com.google.common.reflect.TypeToken$SimpleTypeToken
            r0.<init>(r1)
            return r0
    }

    public static com.google.common.reflect.TypeToken<?> of(java.lang.reflect.Type r1) {
            com.google.common.reflect.TypeToken$SimpleTypeToken r0 = new com.google.common.reflect.TypeToken$SimpleTypeToken
            r0.<init>(r1)
            return r0
    }

    private com.google.common.reflect.TypeToken<?> resolveSupertype(java.lang.reflect.Type r2) {
            r1 = this;
            com.google.common.reflect.TypeResolver r0 = r1.getCovariantTypeResolver()
            java.lang.reflect.Type r2 = r0.resolveType(r2)
            com.google.common.reflect.TypeToken r2 = of(r2)
            com.google.common.reflect.TypeResolver r0 = r1.covariantTypeResolver
            r2.covariantTypeResolver = r0
            com.google.common.reflect.TypeResolver r0 = r1.invariantTypeResolver
            r2.invariantTypeResolver = r0
            return r2
    }

    private java.lang.reflect.Type resolveTypeArgsForSubclass(java.lang.Class<?> r4) {
            r3 = this;
            java.lang.reflect.Type r0 = r3.runtimeType
            boolean r0 = r0 instanceof java.lang.Class
            if (r0 == 0) goto L19
            java.lang.reflect.TypeVariable[] r0 = r4.getTypeParameters()
            int r0 = r0.length
            if (r0 == 0) goto L18
            java.lang.Class r0 = r3.getRawType()
            java.lang.reflect.TypeVariable[] r0 = r0.getTypeParameters()
            int r0 = r0.length
            if (r0 == 0) goto L19
        L18:
            return r4
        L19:
            com.google.common.reflect.TypeToken r4 = toGenericType(r4)
            java.lang.Class r0 = r3.getRawType()
            com.google.common.reflect.TypeToken r0 = r4.getSupertype(r0)
            java.lang.reflect.Type r0 = r0.runtimeType
            com.google.common.reflect.TypeResolver r1 = new com.google.common.reflect.TypeResolver
            r1.<init>()
            java.lang.reflect.Type r2 = r3.runtimeType
            com.google.common.reflect.TypeResolver r0 = r1.where(r0, r2)
            java.lang.reflect.Type r4 = r4.runtimeType
            java.lang.reflect.Type r4 = r0.resolveType(r4)
            return r4
    }

    private boolean someRawTypeIsSubclassOf(java.lang.Class<?> r3) {
            r2 = this;
            com.google.common.collect.ImmutableSet r0 = r2.getRawTypes()
            com.google.common.collect.UnmodifiableIterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r1 = r3.isAssignableFrom(r1)
            if (r1 == 0) goto L8
            r3 = 1
            return r3
        L1c:
            r3 = 0
            return r3
    }

    @com.google.common.annotations.VisibleForTesting
    static <T> com.google.common.reflect.TypeToken<? extends T> toGenericType(java.lang.Class<T> r3) {
            boolean r0 = r3.isArray()
            if (r0 == 0) goto L19
            java.lang.Class r3 = r3.getComponentType()
            com.google.common.reflect.TypeToken r3 = toGenericType(r3)
            java.lang.reflect.Type r3 = r3.runtimeType
            java.lang.reflect.Type r3 = com.google.common.reflect.Types.newArrayType(r3)
            com.google.common.reflect.TypeToken r3 = of(r3)
            return r3
        L19:
            java.lang.reflect.TypeVariable[] r0 = r3.getTypeParameters()
            boolean r1 = r3.isMemberClass()
            if (r1 == 0) goto L38
            int r1 = r3.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            if (r1 != 0) goto L38
            java.lang.Class r1 = r3.getEnclosingClass()
            com.google.common.reflect.TypeToken r1 = toGenericType(r1)
            java.lang.reflect.Type r1 = r1.runtimeType
            goto L39
        L38:
            r1 = 0
        L39:
            int r2 = r0.length
            if (r2 > 0) goto L4a
            if (r1 == 0) goto L45
            java.lang.Class r2 = r3.getEnclosingClass()
            if (r1 == r2) goto L45
            goto L4a
        L45:
            com.google.common.reflect.TypeToken r3 = of(r3)
            return r3
        L4a:
            java.lang.reflect.ParameterizedType r3 = com.google.common.reflect.Types.newParameterizedTypeWithOwner(r1, r3, r0)
            com.google.common.reflect.TypeToken r3 = of(r3)
            return r3
    }

    public final com.google.common.reflect.Invokable<T, T> constructor(java.lang.reflect.Constructor<?> r4) {
            r3 = this;
            java.lang.Class r0 = r4.getDeclaringClass()
            java.lang.Class r1 = r3.getRawType()
            if (r0 != r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            java.lang.String r1 = "%s not declared by %s"
            java.lang.Class r2 = r3.getRawType()
            com.google.common.base.Preconditions.checkArgument(r0, r1, r4, r2)
            com.google.common.reflect.TypeToken$2 r0 = new com.google.common.reflect.TypeToken$2
            r0.<init>(r3, r4)
            return r0
    }

    public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.common.reflect.TypeToken
            if (r0 == 0) goto Lf
            com.google.common.reflect.TypeToken r2 = (com.google.common.reflect.TypeToken) r2
            java.lang.reflect.Type r0 = r1.runtimeType
            java.lang.reflect.Type r2 = r2.runtimeType
            boolean r2 = r0.equals(r2)
            return r2
        Lf:
            r2 = 0
            return r2
    }

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public final com.google.common.reflect.TypeToken<?> getComponentType() {
            r1 = this;
            java.lang.reflect.Type r0 = r1.runtimeType
            java.lang.reflect.Type r0 = com.google.common.reflect.Types.getComponentType(r0)
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            com.google.common.reflect.TypeToken r0 = of(r0)
            return r0
    }

    final com.google.common.collect.ImmutableList<com.google.common.reflect.TypeToken<? super T>> getGenericInterfaces() {
            r5 = this;
            java.lang.reflect.Type r0 = r5.runtimeType
            boolean r1 = r0 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto L11
            java.lang.reflect.TypeVariable r0 = (java.lang.reflect.TypeVariable) r0
            java.lang.reflect.Type[] r0 = r0.getBounds()
            com.google.common.collect.ImmutableList r0 = r5.boundsAsInterfaces(r0)
            return r0
        L11:
            boolean r1 = r0 instanceof java.lang.reflect.WildcardType
            if (r1 == 0) goto L20
            java.lang.reflect.WildcardType r0 = (java.lang.reflect.WildcardType) r0
            java.lang.reflect.Type[] r0 = r0.getUpperBounds()
            com.google.common.collect.ImmutableList r0 = r5.boundsAsInterfaces(r0)
            return r0
        L20:
            com.google.common.collect.ImmutableList$Builder r0 = com.google.common.collect.ImmutableList.builder()
            java.lang.Class r1 = r5.getRawType()
            java.lang.reflect.Type[] r1 = r1.getGenericInterfaces()
            int r2 = r1.length
            r3 = 0
        L2e:
            if (r3 >= r2) goto L3c
            r4 = r1[r3]
            com.google.common.reflect.TypeToken r4 = r5.resolveSupertype(r4)
            r0.add(r4)
            int r3 = r3 + 1
            goto L2e
        L3c:
            com.google.common.collect.ImmutableList r0 = r0.build()
            return r0
    }

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    final com.google.common.reflect.TypeToken<? super T> getGenericSuperclass() {
            r3 = this;
            java.lang.reflect.Type r0 = r3.runtimeType
            boolean r1 = r0 instanceof java.lang.reflect.TypeVariable
            r2 = 0
            if (r1 == 0) goto L14
            java.lang.reflect.TypeVariable r0 = (java.lang.reflect.TypeVariable) r0
            java.lang.reflect.Type[] r0 = r0.getBounds()
            r0 = r0[r2]
            com.google.common.reflect.TypeToken r0 = r3.boundAsSuperclass(r0)
            return r0
        L14:
            boolean r1 = r0 instanceof java.lang.reflect.WildcardType
            if (r1 == 0) goto L25
            java.lang.reflect.WildcardType r0 = (java.lang.reflect.WildcardType) r0
            java.lang.reflect.Type[] r0 = r0.getUpperBounds()
            r0 = r0[r2]
            com.google.common.reflect.TypeToken r0 = r3.boundAsSuperclass(r0)
            return r0
        L25:
            java.lang.Class r0 = r3.getRawType()
            java.lang.reflect.Type r0 = r0.getGenericSuperclass()
            if (r0 != 0) goto L31
            r0 = 0
            return r0
        L31:
            com.google.common.reflect.TypeToken r0 = r3.resolveSupertype(r0)
            return r0
    }

    public final java.lang.Class<? super T> getRawType() {
            r1 = this;
            com.google.common.collect.ImmutableSet r0 = r1.getRawTypes()
            com.google.common.collect.UnmodifiableIterator r0 = r0.iterator()
            java.lang.Object r0 = r0.next()
            java.lang.Class r0 = (java.lang.Class) r0
            return r0
    }

    public final com.google.common.reflect.TypeToken<? extends T> getSubtype(java.lang.Class<?> r3) {
            r2 = this;
            java.lang.reflect.Type r0 = r2.runtimeType
            boolean r0 = r0 instanceof java.lang.reflect.TypeVariable
            r0 = r0 ^ 1
            java.lang.String r1 = "Cannot get subtype of type variable <%s>"
            com.google.common.base.Preconditions.checkArgument(r0, r1, r2)
            java.lang.reflect.Type r0 = r2.runtimeType
            boolean r1 = r0 instanceof java.lang.reflect.WildcardType
            if (r1 == 0) goto L1c
            java.lang.reflect.WildcardType r0 = (java.lang.reflect.WildcardType) r0
            java.lang.reflect.Type[] r0 = r0.getLowerBounds()
            com.google.common.reflect.TypeToken r3 = r2.getSubtypeFromLowerBounds(r3, r0)
            return r3
        L1c:
            boolean r0 = r2.isArray()
            if (r0 == 0) goto L27
            com.google.common.reflect.TypeToken r3 = r2.getArraySubtype(r3)
            return r3
        L27:
            java.lang.Class r0 = r2.getRawType()
            boolean r0 = r0.isAssignableFrom(r3)
            java.lang.String r1 = "%s isn't a subclass of %s"
            com.google.common.base.Preconditions.checkArgument(r0, r1, r3, r2)
            java.lang.reflect.Type r3 = r2.resolveTypeArgsForSubclass(r3)
            com.google.common.reflect.TypeToken r3 = of(r3)
            boolean r0 = r3.isSubtypeOf(r2)
            java.lang.String r1 = "%s does not appear to be a subtype of %s"
            com.google.common.base.Preconditions.checkArgument(r0, r1, r3, r2)
            return r3
    }

    public final com.google.common.reflect.TypeToken<? super T> getSupertype(java.lang.Class<? super T> r3) {
            r2 = this;
            boolean r0 = r2.someRawTypeIsSubclassOf(r3)
            java.lang.String r1 = "%s is not a super class of %s"
            com.google.common.base.Preconditions.checkArgument(r0, r1, r3, r2)
            java.lang.reflect.Type r0 = r2.runtimeType
            boolean r1 = r0 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto L1a
            java.lang.reflect.TypeVariable r0 = (java.lang.reflect.TypeVariable) r0
            java.lang.reflect.Type[] r0 = r0.getBounds()
            com.google.common.reflect.TypeToken r3 = r2.getSupertypeFromUpperBounds(r3, r0)
            return r3
        L1a:
            boolean r1 = r0 instanceof java.lang.reflect.WildcardType
            if (r1 == 0) goto L29
            java.lang.reflect.WildcardType r0 = (java.lang.reflect.WildcardType) r0
            java.lang.reflect.Type[] r0 = r0.getUpperBounds()
            com.google.common.reflect.TypeToken r3 = r2.getSupertypeFromUpperBounds(r3, r0)
            return r3
        L29:
            boolean r0 = r3.isArray()
            if (r0 == 0) goto L34
            com.google.common.reflect.TypeToken r3 = r2.getArraySupertype(r3)
            return r3
        L34:
            com.google.common.reflect.TypeToken r3 = toGenericType(r3)
            java.lang.reflect.Type r3 = r3.runtimeType
            com.google.common.reflect.TypeToken r3 = r2.resolveSupertype(r3)
            return r3
    }

    public final java.lang.reflect.Type getType() {
            r1 = this;
            java.lang.reflect.Type r0 = r1.runtimeType
            return r0
    }

    public final com.google.common.reflect.TypeToken<T>.TypeSet getTypes() {
            r1 = this;
            com.google.common.reflect.TypeToken$TypeSet r0 = new com.google.common.reflect.TypeToken$TypeSet
            r0.<init>(r1)
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.reflect.Type r0 = r1.runtimeType
            int r0 = r0.hashCode()
            return r0
    }

    public final boolean isArray() {
            r1 = this;
            com.google.common.reflect.TypeToken r0 = r1.getComponentType()
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public final boolean isPrimitive() {
            r2 = this;
            java.lang.reflect.Type r0 = r2.runtimeType
            boolean r1 = r0 instanceof java.lang.Class
            if (r1 == 0) goto L10
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r0 = r0.isPrimitive()
            if (r0 == 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    public final boolean isSubtypeOf(com.google.common.reflect.TypeToken<?> r1) {
            r0 = this;
            java.lang.reflect.Type r1 = r1.getType()
            boolean r1 = r0.isSubtypeOf(r1)
            return r1
    }

    public final boolean isSubtypeOf(java.lang.reflect.Type r4) {
            r3 = this;
            com.google.common.base.Preconditions.checkNotNull(r4)
            boolean r0 = r4 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L18
            java.lang.reflect.WildcardType r4 = (java.lang.reflect.WildcardType) r4
            java.lang.reflect.Type[] r4 = r4.getLowerBounds()
            com.google.common.reflect.TypeToken$Bounds r4 = any(r4)
            java.lang.reflect.Type r0 = r3.runtimeType
            boolean r4 = r4.isSupertypeOf(r0)
            return r4
        L18:
            java.lang.reflect.Type r0 = r3.runtimeType
            boolean r1 = r0 instanceof java.lang.reflect.WildcardType
            if (r1 == 0) goto L2d
            java.lang.reflect.WildcardType r0 = (java.lang.reflect.WildcardType) r0
            java.lang.reflect.Type[] r0 = r0.getUpperBounds()
            com.google.common.reflect.TypeToken$Bounds r0 = any(r0)
            boolean r4 = r0.isSubtypeOf(r4)
            return r4
        L2d:
            boolean r1 = r0 instanceof java.lang.reflect.TypeVariable
            r2 = 0
            if (r1 == 0) goto L4e
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L4c
            java.lang.reflect.Type r0 = r3.runtimeType
            java.lang.reflect.TypeVariable r0 = (java.lang.reflect.TypeVariable) r0
            java.lang.reflect.Type[] r0 = r0.getBounds()
            com.google.common.reflect.TypeToken$Bounds r0 = any(r0)
            boolean r4 = r0.isSubtypeOf(r4)
            if (r4 == 0) goto L4b
            goto L4c
        L4b:
            return r2
        L4c:
            r4 = 1
            return r4
        L4e:
            boolean r0 = r0 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L5f
            com.google.common.reflect.TypeToken r4 = of(r4)
            java.lang.reflect.Type r0 = r3.runtimeType
            java.lang.reflect.GenericArrayType r0 = (java.lang.reflect.GenericArrayType) r0
            boolean r4 = r4.isSupertypeOfArray(r0)
            return r4
        L5f:
            boolean r0 = r4 instanceof java.lang.Class
            if (r0 == 0) goto L6a
            java.lang.Class r4 = (java.lang.Class) r4
            boolean r4 = r3.someRawTypeIsSubclassOf(r4)
            return r4
        L6a:
            boolean r0 = r4 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L75
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            boolean r4 = r3.isSubtypeOfParameterizedType(r4)
            return r4
        L75:
            boolean r0 = r4 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L80
            java.lang.reflect.GenericArrayType r4 = (java.lang.reflect.GenericArrayType) r4
            boolean r4 = r3.isSubtypeOfArrayType(r4)
            return r4
        L80:
            return r2
    }

    public final boolean isSupertypeOf(com.google.common.reflect.TypeToken<?> r2) {
            r1 = this;
            java.lang.reflect.Type r0 = r1.getType()
            boolean r2 = r2.isSubtypeOf(r0)
            return r2
    }

    public final boolean isSupertypeOf(java.lang.reflect.Type r2) {
            r1 = this;
            com.google.common.reflect.TypeToken r2 = of(r2)
            java.lang.reflect.Type r0 = r1.getType()
            boolean r2 = r2.isSubtypeOf(r0)
            return r2
    }

    public final com.google.common.reflect.Invokable<T, java.lang.Object> method(java.lang.reflect.Method r3) {
            r2 = this;
            java.lang.Class r0 = r3.getDeclaringClass()
            boolean r0 = r2.someRawTypeIsSubclassOf(r0)
            java.lang.String r1 = "%s not declared by %s"
            com.google.common.base.Preconditions.checkArgument(r0, r1, r3, r2)
            com.google.common.reflect.TypeToken$1 r0 = new com.google.common.reflect.TypeToken$1
            r0.<init>(r2, r3)
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    final com.google.common.reflect.TypeToken<T> rejectTypeVariables() {
            r4 = this;
            com.google.common.reflect.TypeToken$3 r0 = new com.google.common.reflect.TypeToken$3
            r0.<init>(r4)
            java.lang.reflect.Type r1 = r4.runtimeType
            r2 = 1
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r2]
            r3 = 0
            r2[r3] = r1
            r0.visit(r2)
            return r4
    }

    public final com.google.common.reflect.TypeToken<?> resolveType(java.lang.reflect.Type r2) {
            r1 = this;
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.reflect.TypeResolver r0 = r1.getInvariantTypeResolver()
            java.lang.reflect.Type r2 = r0.resolveType(r2)
            com.google.common.reflect.TypeToken r2 = of(r2)
            return r2
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.reflect.Type r0 = r1.runtimeType
            java.lang.String r0 = com.google.common.reflect.Types.toString(r0)
            return r0
    }

    public final com.google.common.reflect.TypeToken<T> unwrap() {
            r1 = this;
            boolean r0 = r1.isWrapper()
            if (r0 == 0) goto L13
            java.lang.reflect.Type r0 = r1.runtimeType
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.Class r0 = com.google.common.primitives.Primitives.unwrap(r0)
            com.google.common.reflect.TypeToken r0 = of(r0)
            return r0
        L13:
            return r1
    }

    public final <X> com.google.common.reflect.TypeToken<T> where(com.google.common.reflect.TypeParameter<X> r3, com.google.common.reflect.TypeToken<X> r4) {
            r2 = this;
            com.google.common.reflect.TypeResolver r0 = new com.google.common.reflect.TypeResolver
            r0.<init>()
            com.google.common.reflect.TypeResolver$TypeVariableKey r1 = new com.google.common.reflect.TypeResolver$TypeVariableKey
            java.lang.reflect.TypeVariable<?> r3 = r3.typeVariable
            r1.<init>(r3)
            java.lang.reflect.Type r3 = r4.runtimeType
            com.google.common.collect.ImmutableMap r3 = com.google.common.collect.ImmutableMap.of(r1, r3)
            com.google.common.reflect.TypeResolver r3 = r0.where(r3)
            com.google.common.reflect.TypeToken$SimpleTypeToken r4 = new com.google.common.reflect.TypeToken$SimpleTypeToken
            java.lang.reflect.Type r0 = r2.runtimeType
            java.lang.reflect.Type r3 = r3.resolveType(r0)
            r4.<init>(r3)
            return r4
    }

    public final <X> com.google.common.reflect.TypeToken<T> where(com.google.common.reflect.TypeParameter<X> r1, java.lang.Class<X> r2) {
            r0 = this;
            com.google.common.reflect.TypeToken r2 = of(r2)
            com.google.common.reflect.TypeToken r1 = r0.where(r1, r2)
            return r1
    }

    public final com.google.common.reflect.TypeToken<T> wrap() {
            r1 = this;
            boolean r0 = r1.isPrimitive()
            if (r0 == 0) goto L13
            java.lang.reflect.Type r0 = r1.runtimeType
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.Class r0 = com.google.common.primitives.Primitives.wrap(r0)
            com.google.common.reflect.TypeToken r0 = of(r0)
            return r0
        L13:
            return r1
    }

    protected java.lang.Object writeReplace() {
            r2 = this;
            com.google.common.reflect.TypeResolver r0 = new com.google.common.reflect.TypeResolver
            r0.<init>()
            java.lang.reflect.Type r1 = r2.runtimeType
            java.lang.reflect.Type r0 = r0.resolveType(r1)
            com.google.common.reflect.TypeToken r0 = of(r0)
            return r0
    }
}
