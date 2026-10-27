package com.google.common.eventbus;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class SubscriberRegistry {
    private static final com.google.common.cache.LoadingCache<java.lang.Class<?>, com.google.common.collect.ImmutableSet<java.lang.Class<?>>> flattenHierarchyCache = null;
    private static final com.google.common.cache.LoadingCache<java.lang.Class<?>, com.google.common.collect.ImmutableList<java.lang.reflect.Method>> subscriberMethodsCache = null;

    @com.google.j2objc.annotations.Weak
    private final com.google.common.eventbus.EventBus bus;
    private final java.util.concurrent.ConcurrentMap<java.lang.Class<?>, java.util.concurrent.CopyOnWriteArraySet<com.google.common.eventbus.Subscriber>> subscribers;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class MethodIdentifier {
        private final java.lang.String name;
        private final java.util.List<java.lang.Class<?>> parameterTypes;

        MethodIdentifier(java.lang.reflect.Method r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = r2.getName()
                r1.name = r0
                java.lang.Class[] r2 = r2.getParameterTypes()
                java.util.List r2 = java.util.Arrays.asList(r2)
                r1.parameterTypes = r2
                return
        }

        public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof com.google.common.eventbus.SubscriberRegistry.MethodIdentifier
                r1 = 0
                if (r0 == 0) goto L1d
                com.google.common.eventbus.SubscriberRegistry$MethodIdentifier r4 = (com.google.common.eventbus.SubscriberRegistry.MethodIdentifier) r4
                java.lang.String r0 = r3.name
                java.lang.String r2 = r4.name
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L1d
                java.util.List<java.lang.Class<?>> r0 = r3.parameterTypes
                java.util.List<java.lang.Class<?>> r4 = r4.parameterTypes
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L1d
                r4 = 1
                return r4
            L1d:
                return r1
        }

        public int hashCode() {
                r4 = this;
                java.lang.String r0 = r4.name
                java.util.List<java.lang.Class<?>> r1 = r4.parameterTypes
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                r2[r3] = r0
                r0 = 1
                r2[r0] = r1
                int r0 = com.google.common.base.Objects.hashCode(r2)
                return r0
        }
    }

    static {
            com.google.common.cache.CacheBuilder r0 = com.google.common.cache.CacheBuilder.newBuilder()
            com.google.common.cache.CacheBuilder r0 = r0.weakKeys()
            com.google.common.eventbus.SubscriberRegistry$1 r1 = new com.google.common.eventbus.SubscriberRegistry$1
            r1.<init>()
            com.google.common.cache.LoadingCache r0 = r0.build(r1)
            com.google.common.eventbus.SubscriberRegistry.subscriberMethodsCache = r0
            com.google.common.cache.CacheBuilder r0 = com.google.common.cache.CacheBuilder.newBuilder()
            com.google.common.cache.CacheBuilder r0 = r0.weakKeys()
            com.google.common.eventbus.SubscriberRegistry$2 r1 = new com.google.common.eventbus.SubscriberRegistry$2
            r1.<init>()
            com.google.common.cache.LoadingCache r0 = r0.build(r1)
            com.google.common.eventbus.SubscriberRegistry.flattenHierarchyCache = r0
            return
    }

    SubscriberRegistry(com.google.common.eventbus.EventBus r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentMap r0 = com.google.common.collect.Maps.newConcurrentMap()
            r1.subscribers = r0
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.eventbus.EventBus r2 = (com.google.common.eventbus.EventBus) r2
            r1.bus = r2
            return
    }

    static /* synthetic */ com.google.common.collect.ImmutableList access$000(java.lang.Class r0) {
            com.google.common.collect.ImmutableList r0 = getAnnotatedMethodsNotCached(r0)
            return r0
    }

    private com.google.common.collect.Multimap<java.lang.Class<?>, com.google.common.eventbus.Subscriber> findAllSubscribers(java.lang.Object r6) {
            r5 = this;
            com.google.common.collect.HashMultimap r0 = com.google.common.collect.HashMultimap.create()
            java.lang.Class r1 = r6.getClass()
            com.google.common.collect.ImmutableList r1 = getAnnotatedMethods(r1)
            com.google.common.collect.UnmodifiableIterator r1 = r1.iterator()
        L10:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            java.lang.Class[] r3 = r2.getParameterTypes()
            r4 = 0
            r3 = r3[r4]
            com.google.common.eventbus.EventBus r4 = r5.bus
            com.google.common.eventbus.Subscriber r2 = com.google.common.eventbus.Subscriber.create(r4, r6, r2)
            r0.put(r3, r2)
            goto L10
        L2d:
            return r0
    }

    @com.google.common.annotations.VisibleForTesting
    static com.google.common.collect.ImmutableSet<java.lang.Class<?>> flattenHierarchy(java.lang.Class<?> r1) {
            com.google.common.cache.LoadingCache<java.lang.Class<?>, com.google.common.collect.ImmutableSet<java.lang.Class<?>>> r0 = com.google.common.eventbus.SubscriberRegistry.flattenHierarchyCache     // Catch: com.google.common.util.concurrent.UncheckedExecutionException -> L9
            java.lang.Object r1 = r0.getUnchecked(r1)     // Catch: com.google.common.util.concurrent.UncheckedExecutionException -> L9
            com.google.common.collect.ImmutableSet r1 = (com.google.common.collect.ImmutableSet) r1     // Catch: com.google.common.util.concurrent.UncheckedExecutionException -> L9
            return r1
        L9:
            r1 = move-exception
            java.lang.Throwable r1 = r1.getCause()
            java.lang.RuntimeException r1 = com.google.common.base.Throwables.propagate(r1)
            throw r1
    }

    private static com.google.common.collect.ImmutableList<java.lang.reflect.Method> getAnnotatedMethods(java.lang.Class<?> r1) {
            com.google.common.cache.LoadingCache<java.lang.Class<?>, com.google.common.collect.ImmutableList<java.lang.reflect.Method>> r0 = com.google.common.eventbus.SubscriberRegistry.subscriberMethodsCache
            java.lang.Object r1 = r0.getUnchecked(r1)
            com.google.common.collect.ImmutableList r1 = (com.google.common.collect.ImmutableList) r1
            return r1
    }

    private static com.google.common.collect.ImmutableList<java.lang.reflect.Method> getAnnotatedMethodsNotCached(java.lang.Class<?> r9) {
            com.google.common.reflect.TypeToken r9 = com.google.common.reflect.TypeToken.of(r9)
            com.google.common.reflect.TypeToken$TypeSet r9 = r9.getTypes()
            java.util.Set r9 = r9.rawTypes()
            java.util.HashMap r0 = com.google.common.collect.Maps.newHashMap()
            java.util.Iterator r9 = r9.iterator()
        L14:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L5a
            java.lang.Object r1 = r9.next()
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.reflect.Method[] r1 = r1.getDeclaredMethods()
            int r2 = r1.length
            r3 = 0
            r4 = 0
        L27:
            if (r4 >= r2) goto L14
            r5 = r1[r4]
            java.lang.Class<com.google.common.eventbus.Subscribe> r6 = com.google.common.eventbus.Subscribe.class
            boolean r6 = r5.isAnnotationPresent(r6)
            if (r6 == 0) goto L57
            boolean r6 = r5.isSynthetic()
            if (r6 != 0) goto L57
            java.lang.Class[] r6 = r5.getParameterTypes()
            int r7 = r6.length
            r8 = 1
            if (r7 != r8) goto L42
            goto L43
        L42:
            r8 = 0
        L43:
            java.lang.String r7 = "Method %s has @Subscribe annotation but has %s parameters.Subscriber methods must have exactly 1 parameter."
            int r6 = r6.length
            com.google.common.base.Preconditions.checkArgument(r8, r7, r5, r6)
            com.google.common.eventbus.SubscriberRegistry$MethodIdentifier r6 = new com.google.common.eventbus.SubscriberRegistry$MethodIdentifier
            r6.<init>(r5)
            boolean r7 = r0.containsKey(r6)
            if (r7 != 0) goto L57
            r0.put(r6, r5)
        L57:
            int r4 = r4 + 1
            goto L27
        L5a:
            java.util.Collection r9 = r0.values()
            com.google.common.collect.ImmutableList r9 = com.google.common.collect.ImmutableList.copyOf(r9)
            return r9
    }

    java.util.Iterator<com.google.common.eventbus.Subscriber> getSubscribers(java.lang.Object r4) {
            r3 = this;
            java.lang.Class r4 = r4.getClass()
            com.google.common.collect.ImmutableSet r4 = flattenHierarchy(r4)
            int r0 = r4.size()
            java.util.ArrayList r0 = com.google.common.collect.Lists.newArrayListWithCapacity(r0)
            com.google.common.collect.UnmodifiableIterator r4 = r4.iterator()
        L14:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L32
            java.lang.Object r1 = r4.next()
            java.lang.Class r1 = (java.lang.Class) r1
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, java.util.concurrent.CopyOnWriteArraySet<com.google.common.eventbus.Subscriber>> r2 = r3.subscribers
            java.lang.Object r1 = r2.get(r1)
            java.util.concurrent.CopyOnWriteArraySet r1 = (java.util.concurrent.CopyOnWriteArraySet) r1
            if (r1 == 0) goto L14
            java.util.Iterator r1 = r1.iterator()
            r0.add(r1)
            goto L14
        L32:
            java.util.Iterator r4 = r0.iterator()
            java.util.Iterator r4 = com.google.common.collect.Iterators.concat(r4)
            return r4
    }

    @com.google.common.annotations.VisibleForTesting
    java.util.Set<com.google.common.eventbus.Subscriber> getSubscribersForTesting(java.lang.Class<?> r2) {
            r1 = this;
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, java.util.concurrent.CopyOnWriteArraySet<com.google.common.eventbus.Subscriber>> r0 = r1.subscribers
            java.lang.Object r2 = r0.get(r2)
            com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.of()
            java.lang.Object r2 = com.google.common.base.MoreObjects.firstNonNull(r2, r0)
            java.util.Set r2 = (java.util.Set) r2
            return r2
    }

    void register(java.lang.Object r5) {
            r4 = this;
            com.google.common.collect.Multimap r5 = r4.findAllSubscribers(r5)
            java.util.Map r5 = r5.asMap()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L10:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L48
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.Object r0 = r0.getValue()
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, java.util.concurrent.CopyOnWriteArraySet<com.google.common.eventbus.Subscriber>> r2 = r4.subscribers
            java.lang.Object r2 = r2.get(r1)
            java.util.concurrent.CopyOnWriteArraySet r2 = (java.util.concurrent.CopyOnWriteArraySet) r2
            if (r2 != 0) goto L44
            java.util.concurrent.CopyOnWriteArraySet r2 = new java.util.concurrent.CopyOnWriteArraySet
            r2.<init>()
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, java.util.concurrent.CopyOnWriteArraySet<com.google.common.eventbus.Subscriber>> r3 = r4.subscribers
            java.lang.Object r1 = r3.putIfAbsent(r1, r2)
            java.lang.Object r1 = com.google.common.base.MoreObjects.firstNonNull(r1, r2)
            r2 = r1
            java.util.concurrent.CopyOnWriteArraySet r2 = (java.util.concurrent.CopyOnWriteArraySet) r2
        L44:
            r2.addAll(r0)
            goto L10
        L48:
            return
    }

    void unregister(java.lang.Object r5) {
            r4 = this;
            com.google.common.collect.Multimap r0 = r4.findAllSubscribers(r5)
            java.util.Map r0 = r0.asMap()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L55
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.Object r1 = r1.getValue()
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, java.util.concurrent.CopyOnWriteArraySet<com.google.common.eventbus.Subscriber>> r3 = r4.subscribers
            java.lang.Object r2 = r3.get(r2)
            java.util.concurrent.CopyOnWriteArraySet r2 = (java.util.concurrent.CopyOnWriteArraySet) r2
            if (r2 == 0) goto L39
            boolean r1 = r2.removeAll(r1)
            if (r1 == 0) goto L39
            goto L10
        L39:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "missing event subscriber for an annotated method. Is "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = " registered?"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L55:
            return
    }
}
