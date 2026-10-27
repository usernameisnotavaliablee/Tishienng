package com.google.firebase.components;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class Component<T> {
    private final java.util.Set<com.google.firebase.components.Dependency> dependencies;
    private final com.google.firebase.components.ComponentFactory<T> factory;
    private final int instantiation;
    private final java.util.Set<java.lang.Class<? super T>> providedInterfaces;
    private final java.util.Set<java.lang.Class<?>> publishedEvents;
    private final int type;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.google.firebase.components.Component$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Builder<T> {
        private final java.util.Set<com.google.firebase.components.Dependency> dependencies;
        private com.google.firebase.components.ComponentFactory<T> factory;
        private int instantiation;
        private final java.util.Set<java.lang.Class<? super T>> providedInterfaces;
        private java.util.Set<java.lang.Class<?>> publishedEvents;
        private int type;

        @java.lang.SafeVarargs
        private Builder(java.lang.Class<T> r4, java.lang.Class<? super T>... r5) {
                r3 = this;
                r3.<init>()
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r3.providedInterfaces = r0
                java.util.HashSet r1 = new java.util.HashSet
                r1.<init>()
                r3.dependencies = r1
                r1 = 0
                r3.instantiation = r1
                r3.type = r1
                java.util.HashSet r2 = new java.util.HashSet
                r2.<init>()
                r3.publishedEvents = r2
                java.lang.String r2 = "Null interface"
                com.google.firebase.components.Preconditions.checkNotNull(r4, r2)
                r0.add(r4)
                int r4 = r5.length
            L26:
                if (r1 >= r4) goto L30
                r0 = r5[r1]
                com.google.firebase.components.Preconditions.checkNotNull(r0, r2)
                int r1 = r1 + 1
                goto L26
            L30:
                java.util.Set<java.lang.Class<? super T>> r4 = r3.providedInterfaces
                java.util.Collections.addAll(r4, r5)
                return
        }

        /* synthetic */ Builder(java.lang.Class r1, java.lang.Class[] r2, com.google.firebase.components.Component.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        static /* synthetic */ com.google.firebase.components.Component.Builder access$100(com.google.firebase.components.Component.Builder r0) {
                com.google.firebase.components.Component$Builder r0 = r0.intoSet()
                return r0
        }

        private com.google.firebase.components.Component.Builder<T> intoSet() {
                r1 = this;
                r0 = 1
                r1.type = r0
                return r1
        }

        private com.google.firebase.components.Component.Builder<T> setInstantiation(int r3) {
                r2 = this;
                int r0 = r2.instantiation
                if (r0 != 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                java.lang.String r1 = "Instantiation type has already been set."
                com.google.firebase.components.Preconditions.checkState(r0, r1)
                r2.instantiation = r3
                return r2
        }

        private void validateInterface(java.lang.Class<?> r2) {
                r1 = this;
                java.util.Set<java.lang.Class<? super T>> r0 = r1.providedInterfaces
                boolean r2 = r0.contains(r2)
                r2 = r2 ^ 1
                java.lang.String r0 = "Components are not allowed to depend on interfaces they themselves provide."
                com.google.firebase.components.Preconditions.checkArgument(r2, r0)
                return
        }

        public com.google.firebase.components.Component.Builder<T> add(com.google.firebase.components.Dependency r2) {
                r1 = this;
                java.lang.String r0 = "Null dependency"
                com.google.firebase.components.Preconditions.checkNotNull(r2, r0)
                java.lang.Class r0 = r2.getInterface()
                r1.validateInterface(r0)
                java.util.Set<com.google.firebase.components.Dependency> r0 = r1.dependencies
                r0.add(r2)
                return r1
        }

        public com.google.firebase.components.Component.Builder<T> alwaysEager() {
                r1 = this;
                r0 = 1
                com.google.firebase.components.Component$Builder r0 = r1.setInstantiation(r0)
                return r0
        }

        public com.google.firebase.components.Component<T> build() {
                r10 = this;
                com.google.firebase.components.ComponentFactory<T> r0 = r10.factory
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                java.lang.String r1 = "Missing required property: factory."
                com.google.firebase.components.Preconditions.checkState(r0, r1)
                com.google.firebase.components.Component r2 = new com.google.firebase.components.Component
                java.util.HashSet r3 = new java.util.HashSet
                java.util.Set<java.lang.Class<? super T>> r0 = r10.providedInterfaces
                r3.<init>(r0)
                java.util.HashSet r4 = new java.util.HashSet
                java.util.Set<com.google.firebase.components.Dependency> r0 = r10.dependencies
                r4.<init>(r0)
                int r5 = r10.instantiation
                int r6 = r10.type
                com.google.firebase.components.ComponentFactory<T> r7 = r10.factory
                java.util.Set<java.lang.Class<?>> r8 = r10.publishedEvents
                r9 = 0
                r2.<init>(r3, r4, r5, r6, r7, r8, r9)
                return r2
        }

        public com.google.firebase.components.Component.Builder<T> eagerInDefaultApp() {
                r1 = this;
                r0 = 2
                com.google.firebase.components.Component$Builder r0 = r1.setInstantiation(r0)
                return r0
        }

        public com.google.firebase.components.Component.Builder<T> factory(com.google.firebase.components.ComponentFactory<T> r2) {
                r1 = this;
                java.lang.String r0 = "Null factory"
                java.lang.Object r2 = com.google.firebase.components.Preconditions.checkNotNull(r2, r0)
                com.google.firebase.components.ComponentFactory r2 = (com.google.firebase.components.ComponentFactory) r2
                r1.factory = r2
                return r1
        }

        public com.google.firebase.components.Component.Builder<T> publishes(java.lang.Class<?> r2) {
                r1 = this;
                java.util.Set<java.lang.Class<?>> r0 = r1.publishedEvents
                r0.add(r2)
                return r1
        }
    }

    private Component(java.util.Set<java.lang.Class<? super T>> r1, java.util.Set<com.google.firebase.components.Dependency> r2, int r3, int r4, com.google.firebase.components.ComponentFactory<T> r5, java.util.Set<java.lang.Class<?>> r6) {
            r0 = this;
            r0.<init>()
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r1)
            r0.providedInterfaces = r1
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r2)
            r0.dependencies = r1
            r0.instantiation = r3
            r0.type = r4
            r0.factory = r5
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r6)
            r0.publishedEvents = r1
            return
    }

    /* synthetic */ Component(java.util.Set r1, java.util.Set r2, int r3, int r4, com.google.firebase.components.ComponentFactory r5, java.util.Set r6, com.google.firebase.components.Component.AnonymousClass1 r7) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public static <T> com.google.firebase.components.Component.Builder<T> builder(java.lang.Class<T> r3) {
            com.google.firebase.components.Component$Builder r0 = new com.google.firebase.components.Component$Builder
            r1 = 0
            java.lang.Class[] r1 = new java.lang.Class[r1]
            r2 = 0
            r0.<init>(r3, r1, r2)
            return r0
    }

    @java.lang.SafeVarargs
    public static <T> com.google.firebase.components.Component.Builder<T> builder(java.lang.Class<T> r2, java.lang.Class<? super T>... r3) {
            com.google.firebase.components.Component$Builder r0 = new com.google.firebase.components.Component$Builder
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static <T> com.google.firebase.components.Component<T> intoSet(T r0, java.lang.Class<T> r1) {
            com.google.firebase.components.Component$Builder r1 = intoSetBuilder(r1)
            com.google.firebase.components.ComponentFactory r0 = com.google.firebase.components.Component$$Lambda$3.lambdaFactory$(r0)
            com.google.firebase.components.Component$Builder r0 = r1.factory(r0)
            com.google.firebase.components.Component r0 = r0.build()
            return r0
    }

    public static <T> com.google.firebase.components.Component.Builder<T> intoSetBuilder(java.lang.Class<T> r0) {
            com.google.firebase.components.Component$Builder r0 = builder(r0)
            com.google.firebase.components.Component$Builder r0 = com.google.firebase.components.Component.Builder.access$100(r0)
            return r0
    }

    static /* synthetic */ java.lang.Object lambda$intoSet$2(java.lang.Object r0, com.google.firebase.components.ComponentContainer r1) {
            return r0
    }

    static /* synthetic */ java.lang.Object lambda$of$0(java.lang.Object r0, com.google.firebase.components.ComponentContainer r1) {
            return r0
    }

    static /* synthetic */ java.lang.Object lambda$of$1(java.lang.Object r0, com.google.firebase.components.ComponentContainer r1) {
            return r0
    }

    @java.lang.Deprecated
    public static <T> com.google.firebase.components.Component<T> of(java.lang.Class<T> r0, T r1) {
            com.google.firebase.components.Component$Builder r0 = builder(r0)
            com.google.firebase.components.ComponentFactory r1 = com.google.firebase.components.Component$$Lambda$1.lambdaFactory$(r1)
            com.google.firebase.components.Component$Builder r0 = r0.factory(r1)
            com.google.firebase.components.Component r0 = r0.build()
            return r0
    }

    @java.lang.SafeVarargs
    public static <T> com.google.firebase.components.Component<T> of(T r0, java.lang.Class<T> r1, java.lang.Class<? super T>... r2) {
            com.google.firebase.components.Component$Builder r1 = builder(r1, r2)
            com.google.firebase.components.ComponentFactory r0 = com.google.firebase.components.Component$$Lambda$2.lambdaFactory$(r0)
            com.google.firebase.components.Component$Builder r0 = r1.factory(r0)
            com.google.firebase.components.Component r0 = r0.build()
            return r0
    }

    public java.util.Set<com.google.firebase.components.Dependency> getDependencies() {
            r1 = this;
            java.util.Set<com.google.firebase.components.Dependency> r0 = r1.dependencies
            return r0
    }

    public com.google.firebase.components.ComponentFactory<T> getFactory() {
            r1 = this;
            com.google.firebase.components.ComponentFactory<T> r0 = r1.factory
            return r0
    }

    public java.util.Set<java.lang.Class<? super T>> getProvidedInterfaces() {
            r1 = this;
            java.util.Set<java.lang.Class<? super T>> r0 = r1.providedInterfaces
            return r0
    }

    public java.util.Set<java.lang.Class<?>> getPublishedEvents() {
            r1 = this;
            java.util.Set<java.lang.Class<?>> r0 = r1.publishedEvents
            return r0
    }

    public boolean isAlwaysEager() {
            r2 = this;
            int r0 = r2.instantiation
            r1 = 1
            if (r0 != r1) goto L6
            return r1
        L6:
            r0 = 0
            return r0
    }

    public boolean isEagerInDefaultApp() {
            r2 = this;
            int r0 = r2.instantiation
            r1 = 2
            if (r0 != r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    public boolean isLazy() {
            r1 = this;
            int r0 = r1.instantiation
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public boolean isValue() {
            r1 = this;
            int r0 = r1.type
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Component<"
            r0.<init>(r1)
            java.util.Set<java.lang.Class<? super T>> r1 = r2.providedInterfaces
            java.lang.Object[] r1 = r1.toArray()
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r1 = ">{"
            r0.append(r1)
            int r1 = r2.instantiation
            r0.append(r1)
            java.lang.String r1 = ", type="
            r0.append(r1)
            int r1 = r2.type
            r0.append(r1)
            java.lang.String r1 = ", deps="
            r0.append(r1)
            java.util.Set<com.google.firebase.components.Dependency> r1 = r2.dependencies
            java.lang.Object[] r1 = r1.toArray()
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
