package com.google.firebase.components;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class EventBus implements com.google.firebase.events.Subscriber, com.google.firebase.events.Publisher {
    private final java.util.concurrent.Executor defaultExecutor;

    @androidx.annotation.GuardedBy("this")
    private final java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<com.google.firebase.events.EventHandler<java.lang.Object>, java.util.concurrent.Executor>> handlerMap;

    @androidx.annotation.GuardedBy("this")
    private java.util.Queue<com.google.firebase.events.Event<?>> pendingEvents;

    EventBus(java.util.concurrent.Executor r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.handlerMap = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1.pendingEvents = r0
            r1.defaultExecutor = r2
            return
    }

    private synchronized java.util.Set<java.util.Map.Entry<com.google.firebase.events.EventHandler<java.lang.Object>, java.util.concurrent.Executor>> getHandlers(com.google.firebase.events.Event<?> r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<com.google.firebase.events.EventHandler<java.lang.Object>, java.util.concurrent.Executor>> r0 = r1.handlerMap     // Catch: java.lang.Throwable -> L12
            java.lang.Class r2 = r2.getType()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L12
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Throwable -> L12
            if (r2 != 0) goto L14
            java.util.Set r2 = java.util.Collections.EMPTY_SET     // Catch: java.lang.Throwable -> L12
            goto L18
        L12:
            r2 = move-exception
            goto L1a
        L14:
            java.util.Set r2 = r2.entrySet()     // Catch: java.lang.Throwable -> L12
        L18:
            monitor-exit(r1)
            return r2
        L1a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            throw r2
    }

    static /* synthetic */ void lambda$publish$0(java.util.Map.Entry r0, com.google.firebase.events.Event r1) {
            java.lang.Object r0 = r0.getKey()
            com.google.firebase.events.EventHandler r0 = (com.google.firebase.events.EventHandler) r0
            r0.handle(r1)
            return
    }

    void enablePublishingAndFlushPending() {
            r2 = this;
            monitor-enter(r2)
            java.util.Queue<com.google.firebase.events.Event<?>> r0 = r2.pendingEvents     // Catch: java.lang.Throwable -> L9
            r1 = 0
            if (r0 == 0) goto Lb
            r2.pendingEvents = r1     // Catch: java.lang.Throwable -> L9
            goto Lc
        L9:
            r0 = move-exception
            goto L24
        Lb:
            r0 = r1
        Lc:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto L23
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()
            com.google.firebase.events.Event r1 = (com.google.firebase.events.Event) r1
            r2.publish(r1)
            goto L13
        L23:
            return
        L24:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    @Override // com.google.firebase.events.Publisher
    public void publish(com.google.firebase.events.Event<?> r4) {
            r3 = this;
            com.google.firebase.components.Preconditions.checkNotNull(r4)
            monitor-enter(r3)
            java.util.Queue<com.google.firebase.events.Event<?>> r0 = r3.pendingEvents     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto Lf
            r0.add(r4)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r4 = move-exception
            goto L33
        Lf:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Ld
            java.util.Set r0 = r3.getHandlers(r4)
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L32
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            java.lang.Runnable r1 = com.google.firebase.components.EventBus$$Lambda$1.lambdaFactory$(r1, r4)
            r2.execute(r1)
            goto L18
        L32:
            return
        L33:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Ld
            throw r4
    }

    @Override // com.google.firebase.events.Subscriber
    public <T> void subscribe(java.lang.Class<T> r2, com.google.firebase.events.EventHandler<? super T> r3) {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.defaultExecutor
            r1.subscribe(r2, r0, r3)
            return
    }

    @Override // com.google.firebase.events.Subscriber
    public synchronized <T> void subscribe(java.lang.Class<T> r3, java.util.concurrent.Executor r4, com.google.firebase.events.EventHandler<? super T> r5) {
            r2 = this;
            monitor-enter(r2)
            com.google.firebase.components.Preconditions.checkNotNull(r3)     // Catch: java.lang.Throwable -> L1d
            com.google.firebase.components.Preconditions.checkNotNull(r5)     // Catch: java.lang.Throwable -> L1d
            com.google.firebase.components.Preconditions.checkNotNull(r4)     // Catch: java.lang.Throwable -> L1d
            java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<com.google.firebase.events.EventHandler<java.lang.Object>, java.util.concurrent.Executor>> r0 = r2.handlerMap     // Catch: java.lang.Throwable -> L1d
            boolean r0 = r0.containsKey(r3)     // Catch: java.lang.Throwable -> L1d
            if (r0 != 0) goto L1f
            java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<com.google.firebase.events.EventHandler<java.lang.Object>, java.util.concurrent.Executor>> r0 = r2.handlerMap     // Catch: java.lang.Throwable -> L1d
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap     // Catch: java.lang.Throwable -> L1d
            r1.<init>()     // Catch: java.lang.Throwable -> L1d
            r0.put(r3, r1)     // Catch: java.lang.Throwable -> L1d
            goto L1f
        L1d:
            r3 = move-exception
            goto L2c
        L1f:
            java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<com.google.firebase.events.EventHandler<java.lang.Object>, java.util.concurrent.Executor>> r0 = r2.handlerMap     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L1d
            java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3     // Catch: java.lang.Throwable -> L1d
            r3.put(r5, r4)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r2)
            return
        L2c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
            throw r3
    }

    @Override // com.google.firebase.events.Subscriber
    public synchronized <T> void unsubscribe(java.lang.Class<T> r2, com.google.firebase.events.EventHandler<? super T> r3) {
            r1 = this;
            monitor-enter(r1)
            com.google.firebase.components.Preconditions.checkNotNull(r2)     // Catch: java.lang.Throwable -> L28
            com.google.firebase.components.Preconditions.checkNotNull(r3)     // Catch: java.lang.Throwable -> L28
            java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<com.google.firebase.events.EventHandler<java.lang.Object>, java.util.concurrent.Executor>> r0 = r1.handlerMap     // Catch: java.lang.Throwable -> L28
            boolean r0 = r0.containsKey(r2)     // Catch: java.lang.Throwable -> L28
            if (r0 != 0) goto L11
            monitor-exit(r1)
            return
        L11:
            java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<com.google.firebase.events.EventHandler<java.lang.Object>, java.util.concurrent.Executor>> r0 = r1.handlerMap     // Catch: java.lang.Throwable -> L28
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L28
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0     // Catch: java.lang.Throwable -> L28
            r0.remove(r3)     // Catch: java.lang.Throwable -> L28
            boolean r3 = r0.isEmpty()     // Catch: java.lang.Throwable -> L28
            if (r3 == 0) goto L2a
            java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<com.google.firebase.events.EventHandler<java.lang.Object>, java.util.concurrent.Executor>> r3 = r1.handlerMap     // Catch: java.lang.Throwable -> L28
            r3.remove(r2)     // Catch: java.lang.Throwable -> L28
            goto L2a
        L28:
            r2 = move-exception
            goto L2c
        L2a:
            monitor-exit(r1)
            return
        L2c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L28
            throw r2
    }
}
