package com.google.firebase.components;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class ComponentRuntime extends com.google.firebase.components.AbstractComponentContainer implements com.google.firebase.dynamicloading.ComponentLoader {
    private static final com.google.firebase.inject.Provider<java.util.Set<java.lang.Object>> EMPTY_PROVIDER = null;
    private final java.util.Map<com.google.firebase.components.Component<?>, com.google.firebase.inject.Provider<?>> components;
    private final java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> eagerComponentsInitializedWith;
    private final com.google.firebase.components.EventBus eventBus;
    private final java.util.Map<java.lang.Class<?>, com.google.firebase.inject.Provider<?>> lazyInstanceMap;
    private final java.util.Map<java.lang.Class<?>, com.google.firebase.components.LazySet<?>> lazySetMap;
    private final java.util.List<com.google.firebase.inject.Provider<com.google.firebase.components.ComponentRegistrar>> unprocessedRegistrarProviders;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.google.firebase.components.ComponentRuntime$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Builder {
        private final java.util.List<com.google.firebase.components.Component<?>> additionalComponents;
        private final java.util.concurrent.Executor defaultExecutor;
        private final java.util.List<com.google.firebase.inject.Provider<com.google.firebase.components.ComponentRegistrar>> lazyRegistrars;

        Builder(java.util.concurrent.Executor r2) {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.lazyRegistrars = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.additionalComponents = r0
                r1.defaultExecutor = r2
                return
        }

        static /* synthetic */ com.google.firebase.components.ComponentRegistrar lambda$addComponentRegistrar$0(com.google.firebase.components.ComponentRegistrar r0) {
                return r0
        }

        public com.google.firebase.components.ComponentRuntime.Builder addComponent(com.google.firebase.components.Component<?> r2) {
                r1 = this;
                java.util.List<com.google.firebase.components.Component<?>> r0 = r1.additionalComponents
                r0.add(r2)
                return r1
        }

        public com.google.firebase.components.ComponentRuntime.Builder addComponentRegistrar(com.google.firebase.components.ComponentRegistrar r2) {
                r1 = this;
                java.util.List<com.google.firebase.inject.Provider<com.google.firebase.components.ComponentRegistrar>> r0 = r1.lazyRegistrars
                com.google.firebase.inject.Provider r2 = com.google.firebase.components.ComponentRuntime$Builder$$Lambda$1.lambdaFactory$(r2)
                r0.add(r2)
                return r1
        }

        public com.google.firebase.components.ComponentRuntime.Builder addLazyComponentRegistrars(java.util.Collection<com.google.firebase.inject.Provider<com.google.firebase.components.ComponentRegistrar>> r2) {
                r1 = this;
                java.util.List<com.google.firebase.inject.Provider<com.google.firebase.components.ComponentRegistrar>> r0 = r1.lazyRegistrars
                r0.addAll(r2)
                return r1
        }

        public com.google.firebase.components.ComponentRuntime build() {
                r5 = this;
                com.google.firebase.components.ComponentRuntime r0 = new com.google.firebase.components.ComponentRuntime
                java.util.concurrent.Executor r1 = r5.defaultExecutor
                java.util.List<com.google.firebase.inject.Provider<com.google.firebase.components.ComponentRegistrar>> r2 = r5.lazyRegistrars
                java.util.List<com.google.firebase.components.Component<?>> r3 = r5.additionalComponents
                r4 = 0
                r0.<init>(r1, r2, r3, r4)
                return r0
        }
    }

    static {
            com.google.firebase.inject.Provider r0 = com.google.firebase.components.ComponentRuntime$$Lambda$5.lambdaFactory$()
            com.google.firebase.components.ComponentRuntime.EMPTY_PROVIDER = r0
            return
    }

    private ComponentRuntime(java.util.concurrent.Executor r6, java.lang.Iterable<com.google.firebase.inject.Provider<com.google.firebase.components.ComponentRegistrar>> r7, java.util.Collection<com.google.firebase.components.Component<?>> r8) {
            r5 = this;
            r5.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r5.components = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r5.lazyInstanceMap = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r5.lazySetMap = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r5.eagerComponentsInitializedWith = r0
            com.google.firebase.components.EventBus r0 = new com.google.firebase.components.EventBus
            r0.<init>(r6)
            r5.eventBus = r0
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r1 = 2
            java.lang.Class[] r1 = new java.lang.Class[r1]
            r2 = 0
            java.lang.Class<com.google.firebase.events.Subscriber> r3 = com.google.firebase.events.Subscriber.class
            r1[r2] = r3
            java.lang.Class<com.google.firebase.events.Publisher> r3 = com.google.firebase.events.Publisher.class
            r4 = 1
            r1[r4] = r3
            java.lang.Class<com.google.firebase.components.EventBus> r3 = com.google.firebase.components.EventBus.class
            com.google.firebase.components.Component r0 = com.google.firebase.components.Component.of(r0, r3, r1)
            r6.add(r0)
            java.lang.Class<com.google.firebase.dynamicloading.ComponentLoader> r0 = com.google.firebase.dynamicloading.ComponentLoader.class
            java.lang.Class[] r1 = new java.lang.Class[r2]
            com.google.firebase.components.Component r0 = com.google.firebase.components.Component.of(r5, r0, r1)
            r6.add(r0)
            java.util.Iterator r8 = r8.iterator()
        L50:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L62
            java.lang.Object r0 = r8.next()
            com.google.firebase.components.Component r0 = (com.google.firebase.components.Component) r0
            if (r0 == 0) goto L50
            r6.add(r0)
            goto L50
        L62:
            java.util.List r7 = iterableToList(r7)
            r5.unprocessedRegistrarProviders = r7
            r5.discoverComponents(r6)
            return
    }

    /* synthetic */ ComponentRuntime(java.util.concurrent.Executor r1, java.lang.Iterable r2, java.util.Collection r3, com.google.firebase.components.ComponentRuntime.AnonymousClass1 r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @java.lang.Deprecated
    public ComponentRuntime(java.util.concurrent.Executor r1, java.lang.Iterable<com.google.firebase.components.ComponentRegistrar> r2, com.google.firebase.components.Component<?>... r3) {
            r0 = this;
            java.lang.Iterable r2 = toProviders(r2)
            java.util.List r3 = java.util.Arrays.asList(r3)
            r0.<init>(r1, r2, r3)
            return
    }

    public static com.google.firebase.components.ComponentRuntime.Builder builder(java.util.concurrent.Executor r1) {
            com.google.firebase.components.ComponentRuntime$Builder r0 = new com.google.firebase.components.ComponentRuntime$Builder
            r0.<init>(r1)
            return r0
    }

    private void discoverComponents(java.util.List<com.google.firebase.components.Component<?>> r6) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            monitor-enter(r5)
            java.util.List<com.google.firebase.inject.Provider<com.google.firebase.components.ComponentRegistrar>> r1 = r5.unprocessedRegistrarProviders     // Catch: java.lang.Throwable -> L2b
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L2b
        Lc:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L31
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L2b
            com.google.firebase.inject.Provider r2 = (com.google.firebase.inject.Provider) r2     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L2b com.google.firebase.components.InvalidRegistrarException -> L2d
            com.google.firebase.components.ComponentRegistrar r2 = (com.google.firebase.components.ComponentRegistrar) r2     // Catch: java.lang.Throwable -> L2b com.google.firebase.components.InvalidRegistrarException -> L2d
            if (r2 == 0) goto Lc
            java.util.List r2 = r2.getComponents()     // Catch: java.lang.Throwable -> L2b com.google.firebase.components.InvalidRegistrarException -> L2d
            r6.addAll(r2)     // Catch: java.lang.Throwable -> L2b com.google.firebase.components.InvalidRegistrarException -> L2d
            r1.remove()     // Catch: java.lang.Throwable -> L2b com.google.firebase.components.InvalidRegistrarException -> L2d
            goto Lc
        L2b:
            r6 = move-exception
            goto L97
        L2d:
            r1.remove()     // Catch: java.lang.Throwable -> L2b
            goto Lc
        L31:
            java.util.Map<com.google.firebase.components.Component<?>, com.google.firebase.inject.Provider<?>> r1 = r5.components     // Catch: java.lang.Throwable -> L2b
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L3d
            com.google.firebase.components.CycleDetector.detect(r6)     // Catch: java.lang.Throwable -> L2b
            goto L4e
        L3d:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2b
            java.util.Map<com.google.firebase.components.Component<?>, com.google.firebase.inject.Provider<?>> r2 = r5.components     // Catch: java.lang.Throwable -> L2b
            java.util.Set r2 = r2.keySet()     // Catch: java.lang.Throwable -> L2b
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L2b
            r1.addAll(r6)     // Catch: java.lang.Throwable -> L2b
            com.google.firebase.components.CycleDetector.detect(r1)     // Catch: java.lang.Throwable -> L2b
        L4e:
            java.util.Iterator r1 = r6.iterator()     // Catch: java.lang.Throwable -> L2b
        L52:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L6d
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L2b
            com.google.firebase.components.Component r2 = (com.google.firebase.components.Component) r2     // Catch: java.lang.Throwable -> L2b
            com.google.firebase.components.Lazy r3 = new com.google.firebase.components.Lazy     // Catch: java.lang.Throwable -> L2b
            com.google.firebase.inject.Provider r4 = com.google.firebase.components.ComponentRuntime$$Lambda$1.lambdaFactory$(r5, r2)     // Catch: java.lang.Throwable -> L2b
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L2b
            java.util.Map<com.google.firebase.components.Component<?>, com.google.firebase.inject.Provider<?>> r4 = r5.components     // Catch: java.lang.Throwable -> L2b
            r4.put(r2, r3)     // Catch: java.lang.Throwable -> L2b
            goto L52
        L6d:
            java.util.List r6 = r5.processInstanceComponents(r6)     // Catch: java.lang.Throwable -> L2b
            r0.addAll(r6)     // Catch: java.lang.Throwable -> L2b
            java.util.List r6 = r5.processSetComponents()     // Catch: java.lang.Throwable -> L2b
            r0.addAll(r6)     // Catch: java.lang.Throwable -> L2b
            r5.processDependencies()     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2b
            java.util.Iterator r6 = r0.iterator()
        L83:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L93
            java.lang.Object r0 = r6.next()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            goto L83
        L93:
            r5.maybeInitializeEagerComponents()
            return
        L97:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2b
            throw r6
    }

    private void doInitializeEagerComponents(java.util.Map<com.google.firebase.components.Component<?>, com.google.firebase.inject.Provider<?>> r4, boolean r5) {
            r3 = this;
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L8:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L32
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            com.google.firebase.components.Component r1 = (com.google.firebase.components.Component) r1
            java.lang.Object r0 = r0.getValue()
            com.google.firebase.inject.Provider r0 = (com.google.firebase.inject.Provider) r0
            boolean r2 = r1.isAlwaysEager()
            if (r2 != 0) goto L2e
            boolean r1 = r1.isEagerInDefaultApp()
            if (r1 == 0) goto L8
            if (r5 == 0) goto L8
        L2e:
            r0.get()
            goto L8
        L32:
            com.google.firebase.components.EventBus r4 = r3.eventBus
            r4.enablePublishingAndFlushPending()
            return
    }

    private static <T> java.util.List<T> iterableToList(java.lang.Iterable<T> r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        L9:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L17
            java.lang.Object r1 = r2.next()
            r0.add(r1)
            goto L9
        L17:
            return r0
    }

    static /* synthetic */ java.lang.Object lambda$discoverComponents$0(com.google.firebase.components.ComponentRuntime r2, com.google.firebase.components.Component r3) {
            com.google.firebase.components.ComponentFactory r0 = r3.getFactory()
            com.google.firebase.components.RestrictedComponentContainer r1 = new com.google.firebase.components.RestrictedComponentContainer
            r1.<init>(r3, r2)
            java.lang.Object r2 = r0.create(r1)
            return r2
    }

    static /* synthetic */ void lambda$processInstanceComponents$2(com.google.firebase.components.OptionalProvider r0, com.google.firebase.inject.Provider r1) {
            r0.set(r1)
            return
    }

    static /* synthetic */ void lambda$processSetComponents$3(com.google.firebase.components.LazySet r0, com.google.firebase.inject.Provider r1) {
            r0.add(r1)
            return
    }

    static /* synthetic */ com.google.firebase.components.ComponentRegistrar lambda$toProviders$1(com.google.firebase.components.ComponentRegistrar r0) {
            return r0
    }

    private void maybeInitializeEagerComponents() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> r0 = r2.eagerComponentsInitializedWith
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L13
            java.util.Map<com.google.firebase.components.Component<?>, com.google.firebase.inject.Provider<?>> r1 = r2.components
            boolean r0 = r0.booleanValue()
            r2.doInitializeEagerComponents(r1, r0)
        L13:
            return
    }

    private void processDependencies() {
            r6 = this;
            java.util.Map<com.google.firebase.components.Component<?>, com.google.firebase.inject.Provider<?>> r0 = r6.components
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L8b
            java.lang.Object r1 = r0.next()
            com.google.firebase.components.Component r1 = (com.google.firebase.components.Component) r1
            java.util.Set r2 = r1.getDependencies()
            java.util.Iterator r2 = r2.iterator()
        L1e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto La
            java.lang.Object r3 = r2.next()
            com.google.firebase.components.Dependency r3 = (com.google.firebase.components.Dependency) r3
            boolean r4 = r3.isSet()
            if (r4 == 0) goto L4c
            java.util.Map<java.lang.Class<?>, com.google.firebase.components.LazySet<?>> r4 = r6.lazySetMap
            java.lang.Class r5 = r3.getInterface()
            boolean r4 = r4.containsKey(r5)
            if (r4 != 0) goto L4c
            java.util.Map<java.lang.Class<?>, com.google.firebase.components.LazySet<?>> r4 = r6.lazySetMap
            java.lang.Class r3 = r3.getInterface()
            java.util.Set r5 = java.util.Collections.EMPTY_SET
            com.google.firebase.components.LazySet r5 = com.google.firebase.components.LazySet.fromCollection(r5)
            r4.put(r3, r5)
            goto L1e
        L4c:
            java.util.Map<java.lang.Class<?>, com.google.firebase.inject.Provider<?>> r4 = r6.lazyInstanceMap
            java.lang.Class r5 = r3.getInterface()
            boolean r4 = r4.containsKey(r5)
            if (r4 != 0) goto L1e
            boolean r4 = r3.isRequired()
            if (r4 != 0) goto L72
            boolean r4 = r3.isSet()
            if (r4 != 0) goto L1e
            java.util.Map<java.lang.Class<?>, com.google.firebase.inject.Provider<?>> r4 = r6.lazyInstanceMap
            java.lang.Class r3 = r3.getInterface()
            com.google.firebase.components.OptionalProvider r5 = com.google.firebase.components.OptionalProvider.empty()
            r4.put(r3, r5)
            goto L1e
        L72:
            com.google.firebase.components.MissingDependencyException r0 = new com.google.firebase.components.MissingDependencyException
            java.lang.Class r2 = r3.getInterface()
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r1
            r1 = 1
            r3[r1] = r2
            java.lang.String r1 = "Unsatisfied dependency for component %s: %s"
            java.lang.String r1 = java.lang.String.format(r1, r3)
            r0.<init>(r1)
            throw r0
        L8b:
            return
    }

    private java.util.List<java.lang.Runnable> processInstanceComponents(java.util.List<com.google.firebase.components.Component<?>> r6) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L9:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L58
            java.lang.Object r1 = r6.next()
            com.google.firebase.components.Component r1 = (com.google.firebase.components.Component) r1
            boolean r2 = r1.isValue()
            if (r2 != 0) goto L1c
            goto L9
        L1c:
            java.util.Map<com.google.firebase.components.Component<?>, com.google.firebase.inject.Provider<?>> r2 = r5.components
            java.lang.Object r2 = r2.get(r1)
            com.google.firebase.inject.Provider r2 = (com.google.firebase.inject.Provider) r2
            java.util.Set r1 = r1.getProvidedInterfaces()
            java.util.Iterator r1 = r1.iterator()
        L2c:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L9
            java.lang.Object r3 = r1.next()
            java.lang.Class r3 = (java.lang.Class) r3
            java.util.Map<java.lang.Class<?>, com.google.firebase.inject.Provider<?>> r4 = r5.lazyInstanceMap
            boolean r4 = r4.containsKey(r3)
            if (r4 != 0) goto L46
            java.util.Map<java.lang.Class<?>, com.google.firebase.inject.Provider<?>> r4 = r5.lazyInstanceMap
            r4.put(r3, r2)
            goto L2c
        L46:
            java.util.Map<java.lang.Class<?>, com.google.firebase.inject.Provider<?>> r4 = r5.lazyInstanceMap
            java.lang.Object r3 = r4.get(r3)
            com.google.firebase.inject.Provider r3 = (com.google.firebase.inject.Provider) r3
            com.google.firebase.components.OptionalProvider r3 = (com.google.firebase.components.OptionalProvider) r3
            java.lang.Runnable r3 = com.google.firebase.components.ComponentRuntime$$Lambda$3.lambdaFactory$(r3, r2)
            r0.add(r3)
            goto L2c
        L58:
            return r0
    }

    private java.util.List<java.lang.Runnable> processSetComponents() {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Map<com.google.firebase.components.Component<?>, com.google.firebase.inject.Provider<?>> r2 = r7.components
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L14:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L5f
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            com.google.firebase.components.Component r4 = (com.google.firebase.components.Component) r4
            boolean r5 = r4.isValue()
            if (r5 == 0) goto L2d
            goto L14
        L2d:
            java.lang.Object r3 = r3.getValue()
            com.google.firebase.inject.Provider r3 = (com.google.firebase.inject.Provider) r3
            java.util.Set r4 = r4.getProvidedInterfaces()
            java.util.Iterator r4 = r4.iterator()
        L3b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L14
            java.lang.Object r5 = r4.next()
            java.lang.Class r5 = (java.lang.Class) r5
            boolean r6 = r1.containsKey(r5)
            if (r6 != 0) goto L55
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            r1.put(r5, r6)
        L55:
            java.lang.Object r5 = r1.get(r5)
            java.util.Set r5 = (java.util.Set) r5
            r5.add(r3)
            goto L3b
        L5f:
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L67:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lbf
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.util.Map<java.lang.Class<?>, com.google.firebase.components.LazySet<?>> r3 = r7.lazySetMap
            java.lang.Object r4 = r2.getKey()
            boolean r3 = r3.containsKey(r4)
            if (r3 != 0) goto L95
            java.util.Map<java.lang.Class<?>, com.google.firebase.components.LazySet<?>> r3 = r7.lazySetMap
            java.lang.Object r4 = r2.getKey()
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.Object r2 = r2.getValue()
            java.util.Collection r2 = (java.util.Collection) r2
            com.google.firebase.components.LazySet r2 = com.google.firebase.components.LazySet.fromCollection(r2)
            r3.put(r4, r2)
            goto L67
        L95:
            java.util.Map<java.lang.Class<?>, com.google.firebase.components.LazySet<?>> r3 = r7.lazySetMap
            java.lang.Object r4 = r2.getKey()
            java.lang.Object r3 = r3.get(r4)
            com.google.firebase.components.LazySet r3 = (com.google.firebase.components.LazySet) r3
            java.lang.Object r2 = r2.getValue()
            java.util.Set r2 = (java.util.Set) r2
            java.util.Iterator r2 = r2.iterator()
        Lab:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L67
            java.lang.Object r4 = r2.next()
            com.google.firebase.inject.Provider r4 = (com.google.firebase.inject.Provider) r4
            java.lang.Runnable r4 = com.google.firebase.components.ComponentRuntime$$Lambda$4.lambdaFactory$(r3, r4)
            r0.add(r4)
            goto Lab
        Lbf:
            return r0
    }

    private static java.lang.Iterable<com.google.firebase.inject.Provider<com.google.firebase.components.ComponentRegistrar>> toProviders(java.lang.Iterable<com.google.firebase.components.ComponentRegistrar> r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        L9:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r2.next()
            com.google.firebase.components.ComponentRegistrar r1 = (com.google.firebase.components.ComponentRegistrar) r1
            com.google.firebase.inject.Provider r1 = com.google.firebase.components.ComponentRuntime$$Lambda$2.lambdaFactory$(r1)
            r0.add(r1)
            goto L9
        L1d:
            return r0
    }

    @Override // com.google.firebase.dynamicloading.ComponentLoader
    public void discoverComponents() {
            r1 = this;
            monitor-enter(r1)
            java.util.List<com.google.firebase.inject.Provider<com.google.firebase.components.ComponentRegistrar>> r0 = r1.unprocessedRegistrarProviders     // Catch: java.lang.Throwable -> Lb
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto Ld
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r0 = move-exception
            goto L17
        Ld:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.discoverComponents(r0)
            return
        L17:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r0
    }

    @Override // com.google.firebase.components.AbstractComponentContainer, com.google.firebase.components.ComponentContainer
    public /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Class r1) {
            r0 = this;
            java.lang.Object r1 = super.get(r1)
            return r1
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> com.google.firebase.inject.Deferred<T> getDeferred(java.lang.Class<T> r2) {
            r1 = this;
            com.google.firebase.inject.Provider r2 = r1.getProvider(r2)
            if (r2 != 0) goto Lb
            com.google.firebase.components.OptionalProvider r2 = com.google.firebase.components.OptionalProvider.empty()
            return r2
        Lb:
            boolean r0 = r2 instanceof com.google.firebase.components.OptionalProvider
            if (r0 == 0) goto L12
            com.google.firebase.components.OptionalProvider r2 = (com.google.firebase.components.OptionalProvider) r2
            return r2
        L12:
            com.google.firebase.components.OptionalProvider r2 = com.google.firebase.components.OptionalProvider.of(r2)
            return r2
    }

    @Override // com.google.firebase.components.ComponentContainer
    public synchronized <T> com.google.firebase.inject.Provider<T> getProvider(java.lang.Class<T> r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "Null interface requested."
            com.google.firebase.components.Preconditions.checkNotNull(r2, r0)     // Catch: java.lang.Throwable -> L10
            java.util.Map<java.lang.Class<?>, com.google.firebase.inject.Provider<?>> r0 = r1.lazyInstanceMap     // Catch: java.lang.Throwable -> L10
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L10
            com.google.firebase.inject.Provider r2 = (com.google.firebase.inject.Provider) r2     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)
            return r2
        L10:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r2
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.TESTS})
    @androidx.annotation.VisibleForTesting
    public void initializeAllComponentsForTests() {
            r2 = this;
            java.util.Map<com.google.firebase.components.Component<?>, com.google.firebase.inject.Provider<?>> r0 = r2.components
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            com.google.firebase.inject.Provider r1 = (com.google.firebase.inject.Provider) r1
            r1.get()
            goto La
        L1a:
            return
    }

    public void initializeEagerComponents(boolean r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> r0 = r3.eagerComponentsInitializedWith
            r1 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            boolean r0 = androidx.camera.view.p.a(r0, r1, r2)
            if (r0 != 0) goto Le
            return
        Le:
            monitor-enter(r3)
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L1b
            java.util.Map<com.google.firebase.components.Component<?>, com.google.firebase.inject.Provider<?>> r1 = r3.components     // Catch: java.lang.Throwable -> L1b
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1b
            r3.doInitializeEagerComponents(r0, r4)
            return
        L1b:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1b
            throw r4
    }

    @Override // com.google.firebase.components.AbstractComponentContainer, com.google.firebase.components.ComponentContainer
    public /* bridge */ /* synthetic */ java.util.Set setOf(java.lang.Class r1) {
            r0 = this;
            java.util.Set r1 = super.setOf(r1)
            return r1
    }

    @Override // com.google.firebase.components.ComponentContainer
    public synchronized <T> com.google.firebase.inject.Provider<java.util.Set<T>> setOfProvider(java.lang.Class<T> r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Map<java.lang.Class<?>, com.google.firebase.components.LazySet<?>> r0 = r1.lazySetMap     // Catch: java.lang.Throwable -> L11
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L11
            com.google.firebase.components.LazySet r2 = (com.google.firebase.components.LazySet) r2     // Catch: java.lang.Throwable -> L11
            if (r2 == 0) goto Ld
            monitor-exit(r1)
            return r2
        Ld:
            com.google.firebase.inject.Provider<java.util.Set<java.lang.Object>> r2 = com.google.firebase.components.ComponentRuntime.EMPTY_PROVIDER     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)
            return r2
        L11:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11
            throw r2
    }
}
