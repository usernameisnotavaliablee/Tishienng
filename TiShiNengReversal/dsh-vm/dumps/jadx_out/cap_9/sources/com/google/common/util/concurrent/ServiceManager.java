package com.google.common.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class ServiceManager {
    private static final com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.ServiceManager.Listener> HEALTHY_EVENT = null;
    private static final com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.ServiceManager.Listener> STOPPED_EVENT = null;
    private static final java.util.logging.Logger logger = null;
    private final com.google.common.collect.ImmutableList<com.google.common.util.concurrent.Service> services;
    private final com.google.common.util.concurrent.ServiceManager.ServiceManagerState state;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class EmptyServiceManagerWarning extends java.lang.Throwable {
        private EmptyServiceManagerWarning() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ EmptyServiceManagerWarning(com.google.common.util.concurrent.ServiceManager.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.common.annotations.Beta
    public static abstract class Listener {
        public Listener() {
                r0 = this;
                r0.<init>()
                return
        }

        public void failure(com.google.common.util.concurrent.Service r1) {
                r0 = this;
                return
        }

        public void healthy() {
                r0 = this;
                return
        }

        public void stopped() {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class NoOpService extends com.google.common.util.concurrent.AbstractService {
        private NoOpService() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ NoOpService(com.google.common.util.concurrent.ServiceManager.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.util.concurrent.AbstractService
        protected void doStart() {
                r0 = this;
                r0.notifyStarted()
                return
        }

        @Override // com.google.common.util.concurrent.AbstractService
        protected void doStop() {
                r0 = this;
                r0.notifyStopped()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class ServiceListener extends com.google.common.util.concurrent.Service.Listener {
        final com.google.common.util.concurrent.Service service;
        final java.lang.ref.WeakReference<com.google.common.util.concurrent.ServiceManager.ServiceManagerState> state;

        ServiceListener(com.google.common.util.concurrent.Service r1, java.lang.ref.WeakReference<com.google.common.util.concurrent.ServiceManager.ServiceManagerState> r2) {
                r0 = this;
                r0.<init>()
                r0.service = r1
                r0.state = r2
                return
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void failed(com.google.common.util.concurrent.Service.State r6, java.lang.Throwable r7) {
                r5 = this;
                java.lang.ref.WeakReference<com.google.common.util.concurrent.ServiceManager$ServiceManagerState> r0 = r5.state
                java.lang.Object r0 = r0.get()
                com.google.common.util.concurrent.ServiceManager$ServiceManagerState r0 = (com.google.common.util.concurrent.ServiceManager.ServiceManagerState) r0
                if (r0 == 0) goto L40
                com.google.common.util.concurrent.Service r1 = r5.service
                boolean r1 = r1 instanceof com.google.common.util.concurrent.ServiceManager.NoOpService
                if (r1 != 0) goto L39
                java.util.logging.Logger r1 = com.google.common.util.concurrent.ServiceManager.access$200()
                java.util.logging.Level r2 = java.util.logging.Level.SEVERE
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Service "
                r3.append(r4)
                com.google.common.util.concurrent.Service r4 = r5.service
                r3.append(r4)
                java.lang.String r4 = " has failed in the "
                r3.append(r4)
                r3.append(r6)
                java.lang.String r4 = " state."
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                r1.log(r2, r3, r7)
            L39:
                com.google.common.util.concurrent.Service r7 = r5.service
                com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.FAILED
                r0.transitionService(r7, r6, r1)
            L40:
                return
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void running() {
                r4 = this;
                java.lang.ref.WeakReference<com.google.common.util.concurrent.ServiceManager$ServiceManagerState> r0 = r4.state
                java.lang.Object r0 = r0.get()
                com.google.common.util.concurrent.ServiceManager$ServiceManagerState r0 = (com.google.common.util.concurrent.ServiceManager.ServiceManagerState) r0
                if (r0 == 0) goto L13
                com.google.common.util.concurrent.Service r1 = r4.service
                com.google.common.util.concurrent.Service$State r2 = com.google.common.util.concurrent.Service.State.STARTING
                com.google.common.util.concurrent.Service$State r3 = com.google.common.util.concurrent.Service.State.RUNNING
                r0.transitionService(r1, r2, r3)
            L13:
                return
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void starting() {
                r4 = this;
                java.lang.ref.WeakReference<com.google.common.util.concurrent.ServiceManager$ServiceManagerState> r0 = r4.state
                java.lang.Object r0 = r0.get()
                com.google.common.util.concurrent.ServiceManager$ServiceManagerState r0 = (com.google.common.util.concurrent.ServiceManager.ServiceManagerState) r0
                if (r0 == 0) goto L26
                com.google.common.util.concurrent.Service r1 = r4.service
                com.google.common.util.concurrent.Service$State r2 = com.google.common.util.concurrent.Service.State.NEW
                com.google.common.util.concurrent.Service$State r3 = com.google.common.util.concurrent.Service.State.STARTING
                r0.transitionService(r1, r2, r3)
                com.google.common.util.concurrent.Service r0 = r4.service
                boolean r0 = r0 instanceof com.google.common.util.concurrent.ServiceManager.NoOpService
                if (r0 != 0) goto L26
                java.util.logging.Logger r0 = com.google.common.util.concurrent.ServiceManager.access$200()
                java.util.logging.Level r1 = java.util.logging.Level.FINE
                java.lang.String r2 = "Starting {0}."
                com.google.common.util.concurrent.Service r3 = r4.service
                r0.log(r1, r2, r3)
            L26:
                return
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void stopping(com.google.common.util.concurrent.Service.State r4) {
                r3 = this;
                java.lang.ref.WeakReference<com.google.common.util.concurrent.ServiceManager$ServiceManagerState> r0 = r3.state
                java.lang.Object r0 = r0.get()
                com.google.common.util.concurrent.ServiceManager$ServiceManagerState r0 = (com.google.common.util.concurrent.ServiceManager.ServiceManagerState) r0
                if (r0 == 0) goto L11
                com.google.common.util.concurrent.Service r1 = r3.service
                com.google.common.util.concurrent.Service$State r2 = com.google.common.util.concurrent.Service.State.STOPPING
                r0.transitionService(r1, r4, r2)
            L11:
                return
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void terminated(com.google.common.util.concurrent.Service.State r7) {
                r6 = this;
                java.lang.ref.WeakReference<com.google.common.util.concurrent.ServiceManager$ServiceManagerState> r0 = r6.state
                java.lang.Object r0 = r0.get()
                com.google.common.util.concurrent.ServiceManager$ServiceManagerState r0 = (com.google.common.util.concurrent.ServiceManager.ServiceManagerState) r0
                if (r0 == 0) goto L2d
                com.google.common.util.concurrent.Service r1 = r6.service
                boolean r1 = r1 instanceof com.google.common.util.concurrent.ServiceManager.NoOpService
                if (r1 != 0) goto L26
                java.util.logging.Logger r1 = com.google.common.util.concurrent.ServiceManager.access$200()
                java.util.logging.Level r2 = java.util.logging.Level.FINE
                com.google.common.util.concurrent.Service r3 = r6.service
                r4 = 2
                java.lang.Object[] r4 = new java.lang.Object[r4]
                r5 = 0
                r4[r5] = r3
                r3 = 1
                r4[r3] = r7
                java.lang.String r3 = "Service {0} has terminated. Previous state was: {1}"
                r1.log(r2, r3, r4)
            L26:
                com.google.common.util.concurrent.Service r1 = r6.service
                com.google.common.util.concurrent.Service$State r2 = com.google.common.util.concurrent.Service.State.TERMINATED
                r0.transitionService(r1, r7, r2)
            L2d:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class ServiceManagerState {
        final com.google.common.util.concurrent.Monitor.Guard awaitHealthGuard;
        final com.google.common.util.concurrent.ListenerCallQueue<com.google.common.util.concurrent.ServiceManager.Listener> listeners;
        final com.google.common.util.concurrent.Monitor monitor;
        final int numberOfServices;

        @com.google.errorprone.annotations.concurrent.GuardedBy("monitor")
        boolean ready;

        @com.google.errorprone.annotations.concurrent.GuardedBy("monitor")
        final com.google.common.collect.SetMultimap<com.google.common.util.concurrent.Service.State, com.google.common.util.concurrent.Service> servicesByState;

        @com.google.errorprone.annotations.concurrent.GuardedBy("monitor")
        final java.util.Map<com.google.common.util.concurrent.Service, com.google.common.base.Stopwatch> startupTimers;

        @com.google.errorprone.annotations.concurrent.GuardedBy("monitor")
        final com.google.common.collect.Multiset<com.google.common.util.concurrent.Service.State> states;
        final com.google.common.util.concurrent.Monitor.Guard stoppedGuard;

        @com.google.errorprone.annotations.concurrent.GuardedBy("monitor")
        boolean transitioned;



        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        final class AwaitHealthGuard extends com.google.common.util.concurrent.Monitor.Guard {
            final /* synthetic */ com.google.common.util.concurrent.ServiceManager.ServiceManagerState this$0;

            AwaitHealthGuard(com.google.common.util.concurrent.ServiceManager.ServiceManagerState r1) {
                    r0 = this;
                    r0.this$0 = r1
                    com.google.common.util.concurrent.Monitor r1 = r1.monitor
                    r0.<init>(r1)
                    return
            }

            @Override // com.google.common.util.concurrent.Monitor.Guard
            @com.google.errorprone.annotations.concurrent.GuardedBy("ServiceManagerState.this.monitor")
            public boolean isSatisfied() {
                    r3 = this;
                    com.google.common.util.concurrent.ServiceManager$ServiceManagerState r0 = r3.this$0
                    com.google.common.collect.Multiset<com.google.common.util.concurrent.Service$State> r0 = r0.states
                    com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.RUNNING
                    int r0 = r0.count(r1)
                    com.google.common.util.concurrent.ServiceManager$ServiceManagerState r1 = r3.this$0
                    int r2 = r1.numberOfServices
                    if (r0 == r2) goto L35
                    com.google.common.collect.Multiset<com.google.common.util.concurrent.Service$State> r0 = r1.states
                    com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.STOPPING
                    boolean r0 = r0.contains(r1)
                    if (r0 != 0) goto L35
                    com.google.common.util.concurrent.ServiceManager$ServiceManagerState r0 = r3.this$0
                    com.google.common.collect.Multiset<com.google.common.util.concurrent.Service$State> r0 = r0.states
                    com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.TERMINATED
                    boolean r0 = r0.contains(r1)
                    if (r0 != 0) goto L35
                    com.google.common.util.concurrent.ServiceManager$ServiceManagerState r0 = r3.this$0
                    com.google.common.collect.Multiset<com.google.common.util.concurrent.Service$State> r0 = r0.states
                    com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.FAILED
                    boolean r0 = r0.contains(r1)
                    if (r0 == 0) goto L33
                    goto L35
                L33:
                    r0 = 0
                    return r0
                L35:
                    r0 = 1
                    return r0
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        final class StoppedGuard extends com.google.common.util.concurrent.Monitor.Guard {
            final /* synthetic */ com.google.common.util.concurrent.ServiceManager.ServiceManagerState this$0;

            StoppedGuard(com.google.common.util.concurrent.ServiceManager.ServiceManagerState r1) {
                    r0 = this;
                    r0.this$0 = r1
                    com.google.common.util.concurrent.Monitor r1 = r1.monitor
                    r0.<init>(r1)
                    return
            }

            @Override // com.google.common.util.concurrent.Monitor.Guard
            @com.google.errorprone.annotations.concurrent.GuardedBy("ServiceManagerState.this.monitor")
            public boolean isSatisfied() {
                    r3 = this;
                    com.google.common.util.concurrent.ServiceManager$ServiceManagerState r0 = r3.this$0
                    com.google.common.collect.Multiset<com.google.common.util.concurrent.Service$State> r0 = r0.states
                    com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.TERMINATED
                    int r0 = r0.count(r1)
                    com.google.common.util.concurrent.ServiceManager$ServiceManagerState r1 = r3.this$0
                    com.google.common.collect.Multiset<com.google.common.util.concurrent.Service$State> r1 = r1.states
                    com.google.common.util.concurrent.Service$State r2 = com.google.common.util.concurrent.Service.State.FAILED
                    int r1 = r1.count(r2)
                    int r0 = r0 + r1
                    com.google.common.util.concurrent.ServiceManager$ServiceManagerState r1 = r3.this$0
                    int r1 = r1.numberOfServices
                    if (r0 != r1) goto L1d
                    r0 = 1
                    return r0
                L1d:
                    r0 = 0
                    return r0
            }
        }

        ServiceManagerState(com.google.common.collect.ImmutableCollection<com.google.common.util.concurrent.Service> r3) {
                r2 = this;
                r2.<init>()
                com.google.common.util.concurrent.Monitor r0 = new com.google.common.util.concurrent.Monitor
                r0.<init>()
                r2.monitor = r0
                java.lang.Class<com.google.common.util.concurrent.Service$State> r0 = com.google.common.util.concurrent.Service.State.class
                com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys r0 = com.google.common.collect.MultimapBuilder.enumKeys(r0)
                com.google.common.collect.MultimapBuilder$SetMultimapBuilder r0 = r0.linkedHashSetValues()
                com.google.common.collect.SetMultimap r0 = r0.build()
                r2.servicesByState = r0
                com.google.common.collect.Multiset r1 = r0.keys()
                r2.states = r1
                java.util.IdentityHashMap r1 = com.google.common.collect.Maps.newIdentityHashMap()
                r2.startupTimers = r1
                com.google.common.util.concurrent.ServiceManager$ServiceManagerState$AwaitHealthGuard r1 = new com.google.common.util.concurrent.ServiceManager$ServiceManagerState$AwaitHealthGuard
                r1.<init>(r2)
                r2.awaitHealthGuard = r1
                com.google.common.util.concurrent.ServiceManager$ServiceManagerState$StoppedGuard r1 = new com.google.common.util.concurrent.ServiceManager$ServiceManagerState$StoppedGuard
                r1.<init>(r2)
                r2.stoppedGuard = r1
                com.google.common.util.concurrent.ListenerCallQueue r1 = new com.google.common.util.concurrent.ListenerCallQueue
                r1.<init>()
                r2.listeners = r1
                int r1 = r3.size()
                r2.numberOfServices = r1
                com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.NEW
                r0.putAll(r1, r3)
                return
        }

        void addListener(com.google.common.util.concurrent.ServiceManager.Listener r2, java.util.concurrent.Executor r3) {
                r1 = this;
                com.google.common.util.concurrent.ListenerCallQueue<com.google.common.util.concurrent.ServiceManager$Listener> r0 = r1.listeners
                r0.addListener(r2, r3)
                return
        }

        void awaitHealthy() {
                r2 = this;
                com.google.common.util.concurrent.Monitor r0 = r2.monitor
                com.google.common.util.concurrent.Monitor$Guard r1 = r2.awaitHealthGuard
                r0.enterWhenUninterruptibly(r1)
                r2.checkHealthy()     // Catch: java.lang.Throwable -> L10
                com.google.common.util.concurrent.Monitor r0 = r2.monitor
                r0.leave()
                return
            L10:
                r0 = move-exception
                com.google.common.util.concurrent.Monitor r1 = r2.monitor
                r1.leave()
                throw r0
        }

        void awaitHealthy(long r3, java.util.concurrent.TimeUnit r5) throws java.util.concurrent.TimeoutException {
                r2 = this;
                com.google.common.util.concurrent.Monitor r0 = r2.monitor
                r0.enter()
                com.google.common.util.concurrent.Monitor r0 = r2.monitor     // Catch: java.lang.Throwable -> L18
                com.google.common.util.concurrent.Monitor$Guard r1 = r2.awaitHealthGuard     // Catch: java.lang.Throwable -> L18
                boolean r3 = r0.waitForUninterruptibly(r1, r3, r5)     // Catch: java.lang.Throwable -> L18
                if (r3 == 0) goto L1a
                r2.checkHealthy()     // Catch: java.lang.Throwable -> L18
                com.google.common.util.concurrent.Monitor r3 = r2.monitor
                r3.leave()
                return
            L18:
                r3 = move-exception
                goto L43
            L1a:
                java.util.concurrent.TimeoutException r3 = new java.util.concurrent.TimeoutException     // Catch: java.lang.Throwable -> L18
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L18
                r4.<init>()     // Catch: java.lang.Throwable -> L18
                java.lang.String r5 = "Timeout waiting for the services to become healthy. The following services have not started: "
                r4.append(r5)     // Catch: java.lang.Throwable -> L18
                com.google.common.collect.SetMultimap<com.google.common.util.concurrent.Service$State, com.google.common.util.concurrent.Service> r5 = r2.servicesByState     // Catch: java.lang.Throwable -> L18
                com.google.common.util.concurrent.Service$State r0 = com.google.common.util.concurrent.Service.State.NEW     // Catch: java.lang.Throwable -> L18
                com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.STARTING     // Catch: java.lang.Throwable -> L18
                com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.of(r0, r1)     // Catch: java.lang.Throwable -> L18
                com.google.common.base.Predicate r0 = com.google.common.base.Predicates.in(r0)     // Catch: java.lang.Throwable -> L18
                com.google.common.collect.SetMultimap r5 = com.google.common.collect.Multimaps.filterKeys(r5, r0)     // Catch: java.lang.Throwable -> L18
                r4.append(r5)     // Catch: java.lang.Throwable -> L18
                java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L18
                r3.<init>(r4)     // Catch: java.lang.Throwable -> L18
                throw r3     // Catch: java.lang.Throwable -> L18
            L43:
                com.google.common.util.concurrent.Monitor r4 = r2.monitor
                r4.leave()
                throw r3
        }

        void awaitStopped() {
                r2 = this;
                com.google.common.util.concurrent.Monitor r0 = r2.monitor
                com.google.common.util.concurrent.Monitor$Guard r1 = r2.stoppedGuard
                r0.enterWhenUninterruptibly(r1)
                com.google.common.util.concurrent.Monitor r0 = r2.monitor
                r0.leave()
                return
        }

        void awaitStopped(long r3, java.util.concurrent.TimeUnit r5) throws java.util.concurrent.TimeoutException {
                r2 = this;
                com.google.common.util.concurrent.Monitor r0 = r2.monitor
                r0.enter()
                com.google.common.util.concurrent.Monitor r0 = r2.monitor     // Catch: java.lang.Throwable -> L42
                com.google.common.util.concurrent.Monitor$Guard r1 = r2.stoppedGuard     // Catch: java.lang.Throwable -> L42
                boolean r3 = r0.waitForUninterruptibly(r1, r3, r5)     // Catch: java.lang.Throwable -> L42
                if (r3 == 0) goto L15
                com.google.common.util.concurrent.Monitor r3 = r2.monitor
                r3.leave()
                return
            L15:
                java.util.concurrent.TimeoutException r3 = new java.util.concurrent.TimeoutException     // Catch: java.lang.Throwable -> L42
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L42
                r4.<init>()     // Catch: java.lang.Throwable -> L42
                java.lang.String r5 = "Timeout waiting for the services to stop. The following services have not stopped: "
                r4.append(r5)     // Catch: java.lang.Throwable -> L42
                com.google.common.collect.SetMultimap<com.google.common.util.concurrent.Service$State, com.google.common.util.concurrent.Service> r5 = r2.servicesByState     // Catch: java.lang.Throwable -> L42
                com.google.common.util.concurrent.Service$State r0 = com.google.common.util.concurrent.Service.State.TERMINATED     // Catch: java.lang.Throwable -> L42
                com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.FAILED     // Catch: java.lang.Throwable -> L42
                java.util.EnumSet r0 = java.util.EnumSet.of(r0, r1)     // Catch: java.lang.Throwable -> L42
                com.google.common.base.Predicate r0 = com.google.common.base.Predicates.in(r0)     // Catch: java.lang.Throwable -> L42
                com.google.common.base.Predicate r0 = com.google.common.base.Predicates.not(r0)     // Catch: java.lang.Throwable -> L42
                com.google.common.collect.SetMultimap r5 = com.google.common.collect.Multimaps.filterKeys(r5, r0)     // Catch: java.lang.Throwable -> L42
                r4.append(r5)     // Catch: java.lang.Throwable -> L42
                java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L42
                r3.<init>(r4)     // Catch: java.lang.Throwable -> L42
                throw r3     // Catch: java.lang.Throwable -> L42
            L42:
                r3 = move-exception
                com.google.common.util.concurrent.Monitor r4 = r2.monitor
                r4.leave()
                throw r3
        }

        @com.google.errorprone.annotations.concurrent.GuardedBy("monitor")
        void checkHealthy() {
                r4 = this;
                com.google.common.collect.Multiset<com.google.common.util.concurrent.Service$State> r0 = r4.states
                com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.RUNNING
                int r0 = r0.count(r1)
                int r2 = r4.numberOfServices
                if (r0 != r2) goto Ld
                return
            Ld:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Expected to be healthy after starting. The following services are not running: "
                r2.append(r3)
                com.google.common.collect.SetMultimap<com.google.common.util.concurrent.Service$State, com.google.common.util.concurrent.Service> r3 = r4.servicesByState
                com.google.common.base.Predicate r1 = com.google.common.base.Predicates.equalTo(r1)
                com.google.common.base.Predicate r1 = com.google.common.base.Predicates.not(r1)
                com.google.common.collect.SetMultimap r1 = com.google.common.collect.Multimaps.filterKeys(r3, r1)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                r0.<init>(r1)
                throw r0
        }

        void dispatchListenerEvents() {
                r2 = this;
                com.google.common.util.concurrent.Monitor r0 = r2.monitor
                boolean r0 = r0.isOccupiedByCurrentThread()
                r0 = r0 ^ 1
                java.lang.String r1 = "It is incorrect to execute listeners with the monitor held."
                com.google.common.base.Preconditions.checkState(r0, r1)
                com.google.common.util.concurrent.ListenerCallQueue<com.google.common.util.concurrent.ServiceManager$Listener> r0 = r2.listeners
                r0.dispatch()
                return
        }

        void enqueueFailedEvent(com.google.common.util.concurrent.Service r3) {
                r2 = this;
                com.google.common.util.concurrent.ListenerCallQueue<com.google.common.util.concurrent.ServiceManager$Listener> r0 = r2.listeners
                com.google.common.util.concurrent.ServiceManager$ServiceManagerState$2 r1 = new com.google.common.util.concurrent.ServiceManager$ServiceManagerState$2
                r1.<init>(r2, r3)
                r0.enqueue(r1)
                return
        }

        void enqueueHealthyEvent() {
                r2 = this;
                com.google.common.util.concurrent.ListenerCallQueue<com.google.common.util.concurrent.ServiceManager$Listener> r0 = r2.listeners
                com.google.common.util.concurrent.ListenerCallQueue$Event r1 = com.google.common.util.concurrent.ServiceManager.access$400()
                r0.enqueue(r1)
                return
        }

        void enqueueStoppedEvent() {
                r2 = this;
                com.google.common.util.concurrent.ListenerCallQueue<com.google.common.util.concurrent.ServiceManager$Listener> r0 = r2.listeners
                com.google.common.util.concurrent.ListenerCallQueue$Event r1 = com.google.common.util.concurrent.ServiceManager.access$300()
                r0.enqueue(r1)
                return
        }

        void markReady() {
                r5 = this;
                com.google.common.util.concurrent.Monitor r0 = r5.monitor
                r0.enter()
                boolean r0 = r5.transitioned     // Catch: java.lang.Throwable -> L12
                if (r0 != 0) goto L14
                r0 = 1
                r5.ready = r0     // Catch: java.lang.Throwable -> L12
                com.google.common.util.concurrent.Monitor r0 = r5.monitor
                r0.leave()
                return
            L12:
                r0 = move-exception
                goto L53
            L14:
                java.util.ArrayList r0 = com.google.common.collect.Lists.newArrayList()     // Catch: java.lang.Throwable -> L12
                com.google.common.collect.ImmutableMultimap r1 = r5.servicesByState()     // Catch: java.lang.Throwable -> L12
                com.google.common.collect.ImmutableCollection r1 = r1.values()     // Catch: java.lang.Throwable -> L12
                com.google.common.collect.UnmodifiableIterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L12
            L24:
                boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L12
                if (r2 == 0) goto L3c
                java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L12
                com.google.common.util.concurrent.Service r2 = (com.google.common.util.concurrent.Service) r2     // Catch: java.lang.Throwable -> L12
                com.google.common.util.concurrent.Service$State r3 = r2.state()     // Catch: java.lang.Throwable -> L12
                com.google.common.util.concurrent.Service$State r4 = com.google.common.util.concurrent.Service.State.NEW     // Catch: java.lang.Throwable -> L12
                if (r3 == r4) goto L24
                r0.add(r2)     // Catch: java.lang.Throwable -> L12
                goto L24
            L3c:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L12
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
                r2.<init>()     // Catch: java.lang.Throwable -> L12
                java.lang.String r3 = "Services started transitioning asynchronously before the ServiceManager was constructed: "
                r2.append(r3)     // Catch: java.lang.Throwable -> L12
                r2.append(r0)     // Catch: java.lang.Throwable -> L12
                java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L12
                r1.<init>(r0)     // Catch: java.lang.Throwable -> L12
                throw r1     // Catch: java.lang.Throwable -> L12
            L53:
                com.google.common.util.concurrent.Monitor r1 = r5.monitor
                r1.leave()
                throw r0
        }

        com.google.common.collect.ImmutableMultimap<com.google.common.util.concurrent.Service.State, com.google.common.util.concurrent.Service> servicesByState() {
                r4 = this;
                com.google.common.collect.ImmutableSetMultimap$Builder r0 = com.google.common.collect.ImmutableSetMultimap.builder()
                com.google.common.util.concurrent.Monitor r1 = r4.monitor
                r1.enter()
                com.google.common.collect.SetMultimap<com.google.common.util.concurrent.Service$State, com.google.common.util.concurrent.Service> r1 = r4.servicesByState     // Catch: java.lang.Throwable -> L2b
                java.util.Set r1 = r1.entries()     // Catch: java.lang.Throwable -> L2b
                java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L2b
            L13:
                boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L2b
                if (r2 == 0) goto L2d
                java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L2b
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L2b
                java.lang.Object r3 = r2.getValue()     // Catch: java.lang.Throwable -> L2b
                boolean r3 = r3 instanceof com.google.common.util.concurrent.ServiceManager.NoOpService     // Catch: java.lang.Throwable -> L2b
                if (r3 != 0) goto L13
                r0.put(r2)     // Catch: java.lang.Throwable -> L2b
                goto L13
            L2b:
                r0 = move-exception
                goto L37
            L2d:
                com.google.common.util.concurrent.Monitor r1 = r4.monitor
                r1.leave()
                com.google.common.collect.ImmutableSetMultimap r0 = r0.build()
                return r0
            L37:
                com.google.common.util.concurrent.Monitor r1 = r4.monitor
                r1.leave()
                throw r0
        }

        com.google.common.collect.ImmutableMap<com.google.common.util.concurrent.Service, java.lang.Long> startupTimes() {
                r6 = this;
                com.google.common.util.concurrent.Monitor r0 = r6.monitor
                r0.enter()
                java.util.Map<com.google.common.util.concurrent.Service, com.google.common.base.Stopwatch> r0 = r6.startupTimers     // Catch: java.lang.Throwable -> L4d
                int r0 = r0.size()     // Catch: java.lang.Throwable -> L4d
                java.util.ArrayList r0 = com.google.common.collect.Lists.newArrayListWithCapacity(r0)     // Catch: java.lang.Throwable -> L4d
                java.util.Map<com.google.common.util.concurrent.Service, com.google.common.base.Stopwatch> r1 = r6.startupTimers     // Catch: java.lang.Throwable -> L4d
                java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L4d
                java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L4d
            L19:
                boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L4d
                if (r2 == 0) goto L4f
                java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L4d
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L4d
                java.lang.Object r3 = r2.getKey()     // Catch: java.lang.Throwable -> L4d
                com.google.common.util.concurrent.Service r3 = (com.google.common.util.concurrent.Service) r3     // Catch: java.lang.Throwable -> L4d
                java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L4d
                com.google.common.base.Stopwatch r2 = (com.google.common.base.Stopwatch) r2     // Catch: java.lang.Throwable -> L4d
                boolean r4 = r2.isRunning()     // Catch: java.lang.Throwable -> L4d
                if (r4 != 0) goto L19
                boolean r4 = r3 instanceof com.google.common.util.concurrent.ServiceManager.NoOpService     // Catch: java.lang.Throwable -> L4d
                if (r4 != 0) goto L19
                java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L4d
                long r4 = r2.elapsed(r4)     // Catch: java.lang.Throwable -> L4d
                java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L4d
                java.util.Map$Entry r2 = com.google.common.collect.Maps.immutableEntry(r3, r2)     // Catch: java.lang.Throwable -> L4d
                r0.add(r2)     // Catch: java.lang.Throwable -> L4d
                goto L19
            L4d:
                r0 = move-exception
                goto L69
            L4f:
                com.google.common.util.concurrent.Monitor r1 = r6.monitor
                r1.leave()
                com.google.common.collect.Ordering r1 = com.google.common.collect.Ordering.natural()
                com.google.common.util.concurrent.ServiceManager$ServiceManagerState$1 r2 = new com.google.common.util.concurrent.ServiceManager$ServiceManagerState$1
                r2.<init>(r6)
                com.google.common.collect.Ordering r1 = r1.onResultOf(r2)
                java.util.Collections.sort(r0, r1)
                com.google.common.collect.ImmutableMap r0 = com.google.common.collect.ImmutableMap.copyOf(r0)
                return r0
            L69:
                com.google.common.util.concurrent.Monitor r1 = r6.monitor
                r1.leave()
                throw r0
        }

        void transitionService(com.google.common.util.concurrent.Service r8, com.google.common.util.concurrent.Service.State r9, com.google.common.util.concurrent.Service.State r10) {
                r7 = this;
                com.google.common.base.Preconditions.checkNotNull(r8)
                r0 = 0
                r1 = 1
                if (r9 == r10) goto L9
                r2 = 1
                goto La
            L9:
                r2 = 0
            La:
                com.google.common.base.Preconditions.checkArgument(r2)
                com.google.common.util.concurrent.Monitor r2 = r7.monitor
                r2.enter()
                r7.transitioned = r1     // Catch: java.lang.Throwable -> L4b
                boolean r2 = r7.ready     // Catch: java.lang.Throwable -> L4b
                if (r2 != 0) goto L21
            L18:
                com.google.common.util.concurrent.Monitor r8 = r7.monitor
                r8.leave()
                r7.dispatchListenerEvents()
                return
            L21:
                com.google.common.collect.SetMultimap<com.google.common.util.concurrent.Service$State, com.google.common.util.concurrent.Service> r2 = r7.servicesByState     // Catch: java.lang.Throwable -> L4b
                boolean r2 = r2.remove(r9, r8)     // Catch: java.lang.Throwable -> L4b
                java.lang.String r3 = "Service %s not at the expected location in the state map %s"
                com.google.common.base.Preconditions.checkState(r2, r3, r8, r9)     // Catch: java.lang.Throwable -> L4b
                com.google.common.collect.SetMultimap<com.google.common.util.concurrent.Service$State, com.google.common.util.concurrent.Service> r9 = r7.servicesByState     // Catch: java.lang.Throwable -> L4b
                boolean r9 = r9.put(r10, r8)     // Catch: java.lang.Throwable -> L4b
                java.lang.String r2 = "Service %s in the state map unexpectedly at %s"
                com.google.common.base.Preconditions.checkState(r9, r2, r8, r10)     // Catch: java.lang.Throwable -> L4b
                java.util.Map<com.google.common.util.concurrent.Service, com.google.common.base.Stopwatch> r9 = r7.startupTimers     // Catch: java.lang.Throwable -> L4b
                java.lang.Object r9 = r9.get(r8)     // Catch: java.lang.Throwable -> L4b
                com.google.common.base.Stopwatch r9 = (com.google.common.base.Stopwatch) r9     // Catch: java.lang.Throwable -> L4b
                if (r9 != 0) goto L4d
                com.google.common.base.Stopwatch r9 = com.google.common.base.Stopwatch.createStarted()     // Catch: java.lang.Throwable -> L4b
                java.util.Map<com.google.common.util.concurrent.Service, com.google.common.base.Stopwatch> r2 = r7.startupTimers     // Catch: java.lang.Throwable -> L4b
                r2.put(r8, r9)     // Catch: java.lang.Throwable -> L4b
                goto L4d
            L4b:
                r8 = move-exception
                goto La1
            L4d:
                com.google.common.util.concurrent.Service$State r2 = com.google.common.util.concurrent.Service.State.RUNNING     // Catch: java.lang.Throwable -> L4b
                int r3 = r10.compareTo(r2)     // Catch: java.lang.Throwable -> L4b
                if (r3 < 0) goto L74
                boolean r3 = r9.isRunning()     // Catch: java.lang.Throwable -> L4b
                if (r3 == 0) goto L74
                r9.stop()     // Catch: java.lang.Throwable -> L4b
                boolean r3 = r8 instanceof com.google.common.util.concurrent.ServiceManager.NoOpService     // Catch: java.lang.Throwable -> L4b
                if (r3 != 0) goto L74
                java.util.logging.Logger r3 = com.google.common.util.concurrent.ServiceManager.access$200()     // Catch: java.lang.Throwable -> L4b
                java.util.logging.Level r4 = java.util.logging.Level.FINE     // Catch: java.lang.Throwable -> L4b
                java.lang.String r5 = "Started {0} in {1}."
                r6 = 2
                java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L4b
                r6[r0] = r8     // Catch: java.lang.Throwable -> L4b
                r6[r1] = r9     // Catch: java.lang.Throwable -> L4b
                r3.log(r4, r5, r6)     // Catch: java.lang.Throwable -> L4b
            L74:
                com.google.common.util.concurrent.Service$State r9 = com.google.common.util.concurrent.Service.State.FAILED     // Catch: java.lang.Throwable -> L4b
                if (r10 != r9) goto L7b
                r7.enqueueFailedEvent(r8)     // Catch: java.lang.Throwable -> L4b
            L7b:
                com.google.common.collect.Multiset<com.google.common.util.concurrent.Service$State> r8 = r7.states     // Catch: java.lang.Throwable -> L4b
                int r8 = r8.count(r2)     // Catch: java.lang.Throwable -> L4b
                int r10 = r7.numberOfServices     // Catch: java.lang.Throwable -> L4b
                if (r8 != r10) goto L89
                r7.enqueueHealthyEvent()     // Catch: java.lang.Throwable -> L4b
                goto L18
            L89:
                com.google.common.collect.Multiset<com.google.common.util.concurrent.Service$State> r8 = r7.states     // Catch: java.lang.Throwable -> L4b
                com.google.common.util.concurrent.Service$State r10 = com.google.common.util.concurrent.Service.State.TERMINATED     // Catch: java.lang.Throwable -> L4b
                int r8 = r8.count(r10)     // Catch: java.lang.Throwable -> L4b
                com.google.common.collect.Multiset<com.google.common.util.concurrent.Service$State> r10 = r7.states     // Catch: java.lang.Throwable -> L4b
                int r9 = r10.count(r9)     // Catch: java.lang.Throwable -> L4b
                int r8 = r8 + r9
                int r9 = r7.numberOfServices     // Catch: java.lang.Throwable -> L4b
                if (r8 != r9) goto L18
                r7.enqueueStoppedEvent()     // Catch: java.lang.Throwable -> L4b
                goto L18
            La1:
                com.google.common.util.concurrent.Monitor r9 = r7.monitor
                r9.leave()
                r7.dispatchListenerEvents()
                throw r8
        }

        void tryStartTiming(com.google.common.util.concurrent.Service r3) {
                r2 = this;
                com.google.common.util.concurrent.Monitor r0 = r2.monitor
                r0.enter()
                java.util.Map<com.google.common.util.concurrent.Service, com.google.common.base.Stopwatch> r0 = r2.startupTimers     // Catch: java.lang.Throwable -> L19
                java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L19
                com.google.common.base.Stopwatch r0 = (com.google.common.base.Stopwatch) r0     // Catch: java.lang.Throwable -> L19
                if (r0 != 0) goto L1b
                java.util.Map<com.google.common.util.concurrent.Service, com.google.common.base.Stopwatch> r0 = r2.startupTimers     // Catch: java.lang.Throwable -> L19
                com.google.common.base.Stopwatch r1 = com.google.common.base.Stopwatch.createStarted()     // Catch: java.lang.Throwable -> L19
                r0.put(r3, r1)     // Catch: java.lang.Throwable -> L19
                goto L1b
            L19:
                r3 = move-exception
                goto L21
            L1b:
                com.google.common.util.concurrent.Monitor r3 = r2.monitor
                r3.leave()
                return
            L21:
                com.google.common.util.concurrent.Monitor r0 = r2.monitor
                r0.leave()
                throw r3
        }
    }

    static {
            java.lang.Class<com.google.common.util.concurrent.ServiceManager> r0 = com.google.common.util.concurrent.ServiceManager.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.common.util.concurrent.ServiceManager.logger = r0
            com.google.common.util.concurrent.ServiceManager$1 r0 = new com.google.common.util.concurrent.ServiceManager$1
            r0.<init>()
            com.google.common.util.concurrent.ServiceManager.HEALTHY_EVENT = r0
            com.google.common.util.concurrent.ServiceManager$2 r0 = new com.google.common.util.concurrent.ServiceManager$2
            r0.<init>()
            com.google.common.util.concurrent.ServiceManager.STOPPED_EVENT = r0
            return
    }

    public ServiceManager(java.lang.Iterable<? extends com.google.common.util.concurrent.Service> r5) {
            r4 = this;
            r4.<init>()
            com.google.common.collect.ImmutableList r5 = com.google.common.collect.ImmutableList.copyOf(r5)
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L25
            java.util.logging.Logger r5 = com.google.common.util.concurrent.ServiceManager.logger
            java.util.logging.Level r0 = java.util.logging.Level.WARNING
            com.google.common.util.concurrent.ServiceManager$EmptyServiceManagerWarning r1 = new com.google.common.util.concurrent.ServiceManager$EmptyServiceManagerWarning
            r2 = 0
            r1.<init>(r2)
            java.lang.String r3 = "ServiceManager configured with no services.  Is your application configured properly?"
            r5.log(r0, r3, r1)
            com.google.common.util.concurrent.ServiceManager$NoOpService r5 = new com.google.common.util.concurrent.ServiceManager$NoOpService
            r5.<init>(r2)
            com.google.common.collect.ImmutableList r5 = com.google.common.collect.ImmutableList.of(r5)
        L25:
            com.google.common.util.concurrent.ServiceManager$ServiceManagerState r0 = new com.google.common.util.concurrent.ServiceManager$ServiceManagerState
            r0.<init>(r5)
            r4.state = r0
            r4.services = r5
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r0)
            com.google.common.collect.UnmodifiableIterator r5 = r5.iterator()
        L37:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L60
            java.lang.Object r0 = r5.next()
            com.google.common.util.concurrent.Service r0 = (com.google.common.util.concurrent.Service) r0
            com.google.common.util.concurrent.ServiceManager$ServiceListener r2 = new com.google.common.util.concurrent.ServiceManager$ServiceListener
            r2.<init>(r0, r1)
            java.util.concurrent.Executor r3 = com.google.common.util.concurrent.MoreExecutors.directExecutor()
            r0.addListener(r2, r3)
            com.google.common.util.concurrent.Service$State r2 = r0.state()
            com.google.common.util.concurrent.Service$State r3 = com.google.common.util.concurrent.Service.State.NEW
            if (r2 != r3) goto L59
            r2 = 1
            goto L5a
        L59:
            r2 = 0
        L5a:
            java.lang.String r3 = "Can only manage NEW services, %s"
            com.google.common.base.Preconditions.checkArgument(r2, r3, r0)
            goto L37
        L60:
            com.google.common.util.concurrent.ServiceManager$ServiceManagerState r5 = r4.state
            r5.markReady()
            return
    }

    static /* synthetic */ java.util.logging.Logger access$200() {
            java.util.logging.Logger r0 = com.google.common.util.concurrent.ServiceManager.logger
            return r0
    }

    static /* synthetic */ com.google.common.util.concurrent.ListenerCallQueue.Event access$300() {
            com.google.common.util.concurrent.ListenerCallQueue$Event<com.google.common.util.concurrent.ServiceManager$Listener> r0 = com.google.common.util.concurrent.ServiceManager.STOPPED_EVENT
            return r0
    }

    static /* synthetic */ com.google.common.util.concurrent.ListenerCallQueue.Event access$400() {
            com.google.common.util.concurrent.ListenerCallQueue$Event<com.google.common.util.concurrent.ServiceManager$Listener> r0 = com.google.common.util.concurrent.ServiceManager.HEALTHY_EVENT
            return r0
    }

    public void addListener(com.google.common.util.concurrent.ServiceManager.Listener r3) {
            r2 = this;
            com.google.common.util.concurrent.ServiceManager$ServiceManagerState r0 = r2.state
            java.util.concurrent.Executor r1 = com.google.common.util.concurrent.MoreExecutors.directExecutor()
            r0.addListener(r3, r1)
            return
    }

    public void addListener(com.google.common.util.concurrent.ServiceManager.Listener r2, java.util.concurrent.Executor r3) {
            r1 = this;
            com.google.common.util.concurrent.ServiceManager$ServiceManagerState r0 = r1.state
            r0.addListener(r2, r3)
            return
    }

    public void awaitHealthy() {
            r1 = this;
            com.google.common.util.concurrent.ServiceManager$ServiceManagerState r0 = r1.state
            r0.awaitHealthy()
            return
    }

    public void awaitHealthy(long r2, java.util.concurrent.TimeUnit r4) throws java.util.concurrent.TimeoutException {
            r1 = this;
            com.google.common.util.concurrent.ServiceManager$ServiceManagerState r0 = r1.state
            r0.awaitHealthy(r2, r4)
            return
    }

    public void awaitStopped() {
            r1 = this;
            com.google.common.util.concurrent.ServiceManager$ServiceManagerState r0 = r1.state
            r0.awaitStopped()
            return
    }

    public void awaitStopped(long r2, java.util.concurrent.TimeUnit r4) throws java.util.concurrent.TimeoutException {
            r1 = this;
            com.google.common.util.concurrent.ServiceManager$ServiceManagerState r0 = r1.state
            r0.awaitStopped(r2, r4)
            return
    }

    public boolean isHealthy() {
            r2 = this;
            com.google.common.collect.ImmutableList<com.google.common.util.concurrent.Service> r0 = r2.services
            com.google.common.collect.UnmodifiableIterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            com.google.common.util.concurrent.Service r1 = (com.google.common.util.concurrent.Service) r1
            boolean r1 = r1.isRunning()
            if (r1 != 0) goto L6
            r0 = 0
            return r0
        L1a:
            r0 = 1
            return r0
    }

    public com.google.common.collect.ImmutableMultimap<com.google.common.util.concurrent.Service.State, com.google.common.util.concurrent.Service> servicesByState() {
            r1 = this;
            com.google.common.util.concurrent.ServiceManager$ServiceManagerState r0 = r1.state
            com.google.common.collect.ImmutableMultimap r0 = r0.servicesByState()
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.common.util.concurrent.ServiceManager startAsync() {
            r7 = this;
            com.google.common.collect.ImmutableList<com.google.common.util.concurrent.Service> r0 = r7.services
            com.google.common.collect.UnmodifiableIterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()
            com.google.common.util.concurrent.Service r1 = (com.google.common.util.concurrent.Service) r1
            com.google.common.util.concurrent.Service$State r2 = r1.state()
            com.google.common.util.concurrent.Service$State r3 = com.google.common.util.concurrent.Service.State.NEW
            if (r2 != r3) goto L1c
            r3 = 1
            goto L1d
        L1c:
            r3 = 0
        L1d:
            java.lang.String r4 = "Service %s is %s, cannot start it."
            com.google.common.base.Preconditions.checkState(r3, r4, r1, r2)
            goto L6
        L23:
            com.google.common.collect.ImmutableList<com.google.common.util.concurrent.Service> r0 = r7.services
            com.google.common.collect.UnmodifiableIterator r0 = r0.iterator()
        L29:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L58
            java.lang.Object r1 = r0.next()
            com.google.common.util.concurrent.Service r1 = (com.google.common.util.concurrent.Service) r1
            com.google.common.util.concurrent.ServiceManager$ServiceManagerState r2 = r7.state     // Catch: java.lang.IllegalStateException -> L3e
            r2.tryStartTiming(r1)     // Catch: java.lang.IllegalStateException -> L3e
            r1.startAsync()     // Catch: java.lang.IllegalStateException -> L3e
            goto L29
        L3e:
            r2 = move-exception
            java.util.logging.Logger r3 = com.google.common.util.concurrent.ServiceManager.logger
            java.util.logging.Level r4 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Unable to start Service "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            r3.log(r4, r1, r2)
            goto L29
        L58:
            return r7
    }

    public com.google.common.collect.ImmutableMap<com.google.common.util.concurrent.Service, java.lang.Long> startupTimes() {
            r1 = this;
            com.google.common.util.concurrent.ServiceManager$ServiceManagerState r0 = r1.state
            com.google.common.collect.ImmutableMap r0 = r0.startupTimes()
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.common.util.concurrent.ServiceManager stopAsync() {
            r2 = this;
            com.google.common.collect.ImmutableList<com.google.common.util.concurrent.Service> r0 = r2.services
            com.google.common.collect.UnmodifiableIterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.google.common.util.concurrent.Service r1 = (com.google.common.util.concurrent.Service) r1
            r1.stopAsync()
            goto L6
        L16:
            return r2
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.Class<com.google.common.util.concurrent.ServiceManager> r0 = com.google.common.util.concurrent.ServiceManager.class
            com.google.common.base.MoreObjects$ToStringHelper r0 = com.google.common.base.MoreObjects.toStringHelper(r0)
            com.google.common.collect.ImmutableList<com.google.common.util.concurrent.Service> r1 = r3.services
            java.lang.Class<com.google.common.util.concurrent.ServiceManager$NoOpService> r2 = com.google.common.util.concurrent.ServiceManager.NoOpService.class
            com.google.common.base.Predicate r2 = com.google.common.base.Predicates.instanceOf(r2)
            com.google.common.base.Predicate r2 = com.google.common.base.Predicates.not(r2)
            java.util.Collection r1 = com.google.common.collect.Collections2.filter(r1, r2)
            java.lang.String r2 = "services"
            com.google.common.base.MoreObjects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
