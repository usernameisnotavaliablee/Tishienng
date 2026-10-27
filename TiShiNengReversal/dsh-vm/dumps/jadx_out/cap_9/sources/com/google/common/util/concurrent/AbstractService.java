package com.google.common.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class AbstractService implements com.google.common.util.concurrent.Service {
    private static final com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener> RUNNING_EVENT = null;
    private static final com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener> STARTING_EVENT = null;
    private static final com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener> STOPPING_FROM_RUNNING_EVENT = null;
    private static final com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener> STOPPING_FROM_STARTING_EVENT = null;
    private static final com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener> TERMINATED_FROM_NEW_EVENT = null;
    private static final com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener> TERMINATED_FROM_RUNNING_EVENT = null;
    private static final com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener> TERMINATED_FROM_STARTING_EVENT = null;
    private static final com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener> TERMINATED_FROM_STOPPING_EVENT = null;
    private final com.google.common.util.concurrent.Monitor.Guard hasReachedRunning;
    private final com.google.common.util.concurrent.Monitor.Guard isStartable;
    private final com.google.common.util.concurrent.Monitor.Guard isStoppable;
    private final com.google.common.util.concurrent.Monitor.Guard isStopped;
    private final com.google.common.util.concurrent.ListenerCallQueue<com.google.common.util.concurrent.Service.Listener> listeners;
    private final com.google.common.util.concurrent.Monitor monitor;
    private volatile com.google.common.util.concurrent.AbstractService.StateSnapshot snapshot;






    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.google.common.util.concurrent.AbstractService$6, reason: invalid class name */
    static /* synthetic */ class AnonymousClass6 {
        static final /* synthetic */ int[] $SwitchMap$com$google$common$util$concurrent$Service$State = null;

        static {
                com.google.common.util.concurrent.Service$State[] r0 = com.google.common.util.concurrent.Service.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.common.util.concurrent.AbstractService.AnonymousClass6.$SwitchMap$com$google$common$util$concurrent$Service$State = r0
                com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.NEW     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.common.util.concurrent.AbstractService.AnonymousClass6.$SwitchMap$com$google$common$util$concurrent$Service$State     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.STARTING     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.common.util.concurrent.AbstractService.AnonymousClass6.$SwitchMap$com$google$common$util$concurrent$Service$State     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.RUNNING     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.google.common.util.concurrent.AbstractService.AnonymousClass6.$SwitchMap$com$google$common$util$concurrent$Service$State     // Catch: java.lang.NoSuchFieldError -> L33
                com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.STOPPING     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.google.common.util.concurrent.AbstractService.AnonymousClass6.$SwitchMap$com$google$common$util$concurrent$Service$State     // Catch: java.lang.NoSuchFieldError -> L3e
                com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.TERMINATED     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.google.common.util.concurrent.AbstractService.AnonymousClass6.$SwitchMap$com$google$common$util$concurrent$Service$State     // Catch: java.lang.NoSuchFieldError -> L49
                com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.FAILED     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                return
        }

        public AnonymousClass6() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class HasReachedRunningGuard extends com.google.common.util.concurrent.Monitor.Guard {
        final /* synthetic */ com.google.common.util.concurrent.AbstractService this$0;

        HasReachedRunningGuard(com.google.common.util.concurrent.AbstractService r1) {
                r0 = this;
                r0.this$0 = r1
                com.google.common.util.concurrent.Monitor r1 = com.google.common.util.concurrent.AbstractService.access$000(r1)
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.util.concurrent.Monitor.Guard
        public boolean isSatisfied() {
                r2 = this;
                com.google.common.util.concurrent.AbstractService r0 = r2.this$0
                com.google.common.util.concurrent.Service$State r0 = r0.state()
                com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.RUNNING
                int r0 = r0.compareTo(r1)
                if (r0 < 0) goto L10
                r0 = 1
                return r0
            L10:
                r0 = 0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class IsStartableGuard extends com.google.common.util.concurrent.Monitor.Guard {
        final /* synthetic */ com.google.common.util.concurrent.AbstractService this$0;

        IsStartableGuard(com.google.common.util.concurrent.AbstractService r1) {
                r0 = this;
                r0.this$0 = r1
                com.google.common.util.concurrent.Monitor r1 = com.google.common.util.concurrent.AbstractService.access$000(r1)
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.util.concurrent.Monitor.Guard
        public boolean isSatisfied() {
                r2 = this;
                com.google.common.util.concurrent.AbstractService r0 = r2.this$0
                com.google.common.util.concurrent.Service$State r0 = r0.state()
                com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.NEW
                if (r0 != r1) goto Lc
                r0 = 1
                return r0
            Lc:
                r0 = 0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class IsStoppableGuard extends com.google.common.util.concurrent.Monitor.Guard {
        final /* synthetic */ com.google.common.util.concurrent.AbstractService this$0;

        IsStoppableGuard(com.google.common.util.concurrent.AbstractService r1) {
                r0 = this;
                r0.this$0 = r1
                com.google.common.util.concurrent.Monitor r1 = com.google.common.util.concurrent.AbstractService.access$000(r1)
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.util.concurrent.Monitor.Guard
        public boolean isSatisfied() {
                r2 = this;
                com.google.common.util.concurrent.AbstractService r0 = r2.this$0
                com.google.common.util.concurrent.Service$State r0 = r0.state()
                com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.RUNNING
                int r0 = r0.compareTo(r1)
                if (r0 > 0) goto L10
                r0 = 1
                return r0
            L10:
                r0 = 0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class IsStoppedGuard extends com.google.common.util.concurrent.Monitor.Guard {
        final /* synthetic */ com.google.common.util.concurrent.AbstractService this$0;

        IsStoppedGuard(com.google.common.util.concurrent.AbstractService r1) {
                r0 = this;
                r0.this$0 = r1
                com.google.common.util.concurrent.Monitor r1 = com.google.common.util.concurrent.AbstractService.access$000(r1)
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.util.concurrent.Monitor.Guard
        public boolean isSatisfied() {
                r1 = this;
                com.google.common.util.concurrent.AbstractService r0 = r1.this$0
                com.google.common.util.concurrent.Service$State r0 = r0.state()
                boolean r0 = r0.isTerminal()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class StateSnapshot {

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        final java.lang.Throwable failure;
        final boolean shutdownWhenStartupFinishes;
        final com.google.common.util.concurrent.Service.State state;

        StateSnapshot(com.google.common.util.concurrent.Service.State r3) {
                r2 = this;
                r0 = 0
                r1 = 0
                r2.<init>(r3, r0, r1)
                return
        }

        StateSnapshot(com.google.common.util.concurrent.Service.State r5, boolean r6, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Throwable r7) {
                r4 = this;
                r4.<init>()
                r0 = 0
                r1 = 1
                if (r6 == 0) goto Le
                com.google.common.util.concurrent.Service$State r2 = com.google.common.util.concurrent.Service.State.STARTING
                if (r5 != r2) goto Lc
                goto Le
            Lc:
                r2 = 0
                goto Lf
            Le:
                r2 = 1
            Lf:
                java.lang.String r3 = "shutdownWhenStartupFinishes can only be set if state is STARTING. Got %s instead."
                com.google.common.base.Preconditions.checkArgument(r2, r3, r5)
                if (r7 == 0) goto L18
                r2 = 1
                goto L19
            L18:
                r2 = 0
            L19:
                com.google.common.util.concurrent.Service$State r3 = com.google.common.util.concurrent.Service.State.FAILED
                if (r5 != r3) goto L1e
                r0 = 1
            L1e:
                r0 = r0 ^ r2
                r0 = r0 ^ r1
                java.lang.String r1 = "A failure cause should be set if and only if the state is failed.  Got %s and %s instead."
                com.google.common.base.Preconditions.checkArgument(r0, r1, r5, r7)
                r4.state = r5
                r4.shutdownWhenStartupFinishes = r6
                r4.failure = r7
                return
        }

        com.google.common.util.concurrent.Service.State externalState() {
                r2 = this;
                boolean r0 = r2.shutdownWhenStartupFinishes
                if (r0 == 0) goto Ld
                com.google.common.util.concurrent.Service$State r0 = r2.state
                com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.STARTING
                if (r0 != r1) goto Ld
                com.google.common.util.concurrent.Service$State r0 = com.google.common.util.concurrent.Service.State.STOPPING
                return r0
            Ld:
                com.google.common.util.concurrent.Service$State r0 = r2.state
                return r0
        }

        java.lang.Throwable failureCause() {
                r3 = this;
                com.google.common.util.concurrent.Service$State r0 = r3.state
                com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.FAILED
                if (r0 != r1) goto L8
                r1 = 1
                goto L9
            L8:
                r1 = 0
            L9:
                java.lang.String r2 = "failureCause() is only valid if the service has failed, service is %s"
                com.google.common.base.Preconditions.checkState(r1, r2, r0)
                java.lang.Throwable r0 = r3.failure
                return r0
        }
    }

    static {
            com.google.common.util.concurrent.AbstractService$1 r0 = new com.google.common.util.concurrent.AbstractService$1
            r0.<init>()
            com.google.common.util.concurrent.AbstractService.STARTING_EVENT = r0
            com.google.common.util.concurrent.AbstractService$2 r0 = new com.google.common.util.concurrent.AbstractService$2
            r0.<init>()
            com.google.common.util.concurrent.AbstractService.RUNNING_EVENT = r0
            com.google.common.util.concurrent.Service$State r0 = com.google.common.util.concurrent.Service.State.STARTING
            com.google.common.util.concurrent.ListenerCallQueue$Event r1 = stoppingEvent(r0)
            com.google.common.util.concurrent.AbstractService.STOPPING_FROM_STARTING_EVENT = r1
            com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.RUNNING
            com.google.common.util.concurrent.ListenerCallQueue$Event r2 = stoppingEvent(r1)
            com.google.common.util.concurrent.AbstractService.STOPPING_FROM_RUNNING_EVENT = r2
            com.google.common.util.concurrent.Service$State r2 = com.google.common.util.concurrent.Service.State.NEW
            com.google.common.util.concurrent.ListenerCallQueue$Event r2 = terminatedEvent(r2)
            com.google.common.util.concurrent.AbstractService.TERMINATED_FROM_NEW_EVENT = r2
            com.google.common.util.concurrent.ListenerCallQueue$Event r0 = terminatedEvent(r0)
            com.google.common.util.concurrent.AbstractService.TERMINATED_FROM_STARTING_EVENT = r0
            com.google.common.util.concurrent.ListenerCallQueue$Event r0 = terminatedEvent(r1)
            com.google.common.util.concurrent.AbstractService.TERMINATED_FROM_RUNNING_EVENT = r0
            com.google.common.util.concurrent.Service$State r0 = com.google.common.util.concurrent.Service.State.STOPPING
            com.google.common.util.concurrent.ListenerCallQueue$Event r0 = terminatedEvent(r0)
            com.google.common.util.concurrent.AbstractService.TERMINATED_FROM_STOPPING_EVENT = r0
            return
    }

    protected AbstractService() {
            r2 = this;
            r2.<init>()
            com.google.common.util.concurrent.Monitor r0 = new com.google.common.util.concurrent.Monitor
            r0.<init>()
            r2.monitor = r0
            com.google.common.util.concurrent.AbstractService$IsStartableGuard r0 = new com.google.common.util.concurrent.AbstractService$IsStartableGuard
            r0.<init>(r2)
            r2.isStartable = r0
            com.google.common.util.concurrent.AbstractService$IsStoppableGuard r0 = new com.google.common.util.concurrent.AbstractService$IsStoppableGuard
            r0.<init>(r2)
            r2.isStoppable = r0
            com.google.common.util.concurrent.AbstractService$HasReachedRunningGuard r0 = new com.google.common.util.concurrent.AbstractService$HasReachedRunningGuard
            r0.<init>(r2)
            r2.hasReachedRunning = r0
            com.google.common.util.concurrent.AbstractService$IsStoppedGuard r0 = new com.google.common.util.concurrent.AbstractService$IsStoppedGuard
            r0.<init>(r2)
            r2.isStopped = r0
            com.google.common.util.concurrent.ListenerCallQueue r0 = new com.google.common.util.concurrent.ListenerCallQueue
            r0.<init>()
            r2.listeners = r0
            com.google.common.util.concurrent.AbstractService$StateSnapshot r0 = new com.google.common.util.concurrent.AbstractService$StateSnapshot
            com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.NEW
            r0.<init>(r1)
            r2.snapshot = r0
            return
    }

    static /* synthetic */ com.google.common.util.concurrent.Monitor access$000(com.google.common.util.concurrent.AbstractService r0) {
            com.google.common.util.concurrent.Monitor r0 = r0.monitor
            return r0
    }

    @com.google.errorprone.annotations.concurrent.GuardedBy("monitor")
    private void checkCurrentState(com.google.common.util.concurrent.Service.State r6) {
            r5 = this;
            com.google.common.util.concurrent.Service$State r0 = r5.state()
            if (r0 == r6) goto L55
            com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.FAILED
            java.lang.String r2 = " to be "
            java.lang.String r3 = "Expected the service "
            if (r0 != r1) goto L32
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r5)
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = ", but the service has FAILED"
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            java.lang.Throwable r1 = r5.failureCause()
            r0.<init>(r6, r1)
            throw r0
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r4.append(r5)
            r4.append(r2)
            r4.append(r6)
            java.lang.String r6 = ", but was "
            r4.append(r6)
            r4.append(r0)
            java.lang.String r6 = r4.toString()
            r1.<init>(r6)
            throw r1
        L55:
            return
    }

    private void dispatchListenerEvents() {
            r1 = this;
            com.google.common.util.concurrent.Monitor r0 = r1.monitor
            boolean r0 = r0.isOccupiedByCurrentThread()
            if (r0 != 0) goto Ld
            com.google.common.util.concurrent.ListenerCallQueue<com.google.common.util.concurrent.Service$Listener> r0 = r1.listeners
            r0.dispatch()
        Ld:
            return
    }

    private void enqueueFailedEvent(com.google.common.util.concurrent.Service.State r3, java.lang.Throwable r4) {
            r2 = this;
            com.google.common.util.concurrent.ListenerCallQueue<com.google.common.util.concurrent.Service$Listener> r0 = r2.listeners
            com.google.common.util.concurrent.AbstractService$5 r1 = new com.google.common.util.concurrent.AbstractService$5
            r1.<init>(r2, r3, r4)
            r0.enqueue(r1)
            return
    }

    private void enqueueRunningEvent() {
            r2 = this;
            com.google.common.util.concurrent.ListenerCallQueue<com.google.common.util.concurrent.Service$Listener> r0 = r2.listeners
            com.google.common.util.concurrent.ListenerCallQueue$Event<com.google.common.util.concurrent.Service$Listener> r1 = com.google.common.util.concurrent.AbstractService.RUNNING_EVENT
            r0.enqueue(r1)
            return
    }

    private void enqueueStartingEvent() {
            r2 = this;
            com.google.common.util.concurrent.ListenerCallQueue<com.google.common.util.concurrent.Service$Listener> r0 = r2.listeners
            com.google.common.util.concurrent.ListenerCallQueue$Event<com.google.common.util.concurrent.Service$Listener> r1 = com.google.common.util.concurrent.AbstractService.STARTING_EVENT
            r0.enqueue(r1)
            return
    }

    private void enqueueStoppingEvent(com.google.common.util.concurrent.Service.State r2) {
            r1 = this;
            com.google.common.util.concurrent.Service$State r0 = com.google.common.util.concurrent.Service.State.STARTING
            if (r2 != r0) goto Lc
            com.google.common.util.concurrent.ListenerCallQueue<com.google.common.util.concurrent.Service$Listener> r2 = r1.listeners
            com.google.common.util.concurrent.ListenerCallQueue$Event<com.google.common.util.concurrent.Service$Listener> r0 = com.google.common.util.concurrent.AbstractService.STOPPING_FROM_STARTING_EVENT
            r2.enqueue(r0)
            return
        Lc:
            com.google.common.util.concurrent.Service$State r0 = com.google.common.util.concurrent.Service.State.RUNNING
            if (r2 != r0) goto L18
            com.google.common.util.concurrent.ListenerCallQueue<com.google.common.util.concurrent.Service$Listener> r2 = r1.listeners
            com.google.common.util.concurrent.ListenerCallQueue$Event<com.google.common.util.concurrent.Service$Listener> r0 = com.google.common.util.concurrent.AbstractService.STOPPING_FROM_RUNNING_EVENT
            r2.enqueue(r0)
            return
        L18:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
    }

    private void enqueueTerminatedEvent(com.google.common.util.concurrent.Service.State r2) {
            r1 = this;
            int[] r0 = com.google.common.util.concurrent.AbstractService.AnonymousClass6.$SwitchMap$com$google$common$util$concurrent$Service$State
            int r2 = r2.ordinal()
            r2 = r0[r2]
            switch(r2) {
                case 1: goto L2a;
                case 2: goto L22;
                case 3: goto L1a;
                case 4: goto L12;
                case 5: goto Lc;
                case 6: goto Lc;
                default: goto Lb;
            }
        Lb:
            return
        Lc:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
        L12:
            com.google.common.util.concurrent.ListenerCallQueue<com.google.common.util.concurrent.Service$Listener> r2 = r1.listeners
            com.google.common.util.concurrent.ListenerCallQueue$Event<com.google.common.util.concurrent.Service$Listener> r0 = com.google.common.util.concurrent.AbstractService.TERMINATED_FROM_STOPPING_EVENT
            r2.enqueue(r0)
            return
        L1a:
            com.google.common.util.concurrent.ListenerCallQueue<com.google.common.util.concurrent.Service$Listener> r2 = r1.listeners
            com.google.common.util.concurrent.ListenerCallQueue$Event<com.google.common.util.concurrent.Service$Listener> r0 = com.google.common.util.concurrent.AbstractService.TERMINATED_FROM_RUNNING_EVENT
            r2.enqueue(r0)
            return
        L22:
            com.google.common.util.concurrent.ListenerCallQueue<com.google.common.util.concurrent.Service$Listener> r2 = r1.listeners
            com.google.common.util.concurrent.ListenerCallQueue$Event<com.google.common.util.concurrent.Service$Listener> r0 = com.google.common.util.concurrent.AbstractService.TERMINATED_FROM_STARTING_EVENT
            r2.enqueue(r0)
            return
        L2a:
            com.google.common.util.concurrent.ListenerCallQueue<com.google.common.util.concurrent.Service$Listener> r2 = r1.listeners
            com.google.common.util.concurrent.ListenerCallQueue$Event<com.google.common.util.concurrent.Service$Listener> r0 = com.google.common.util.concurrent.AbstractService.TERMINATED_FROM_NEW_EVENT
            r2.enqueue(r0)
            return
    }

    private static com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener> stoppingEvent(com.google.common.util.concurrent.Service.State r1) {
            com.google.common.util.concurrent.AbstractService$4 r0 = new com.google.common.util.concurrent.AbstractService$4
            r0.<init>(r1)
            return r0
    }

    private static com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener> terminatedEvent(com.google.common.util.concurrent.Service.State r1) {
            com.google.common.util.concurrent.AbstractService$3 r0 = new com.google.common.util.concurrent.AbstractService$3
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.util.concurrent.Service
    public final void addListener(com.google.common.util.concurrent.Service.Listener r2, java.util.concurrent.Executor r3) {
            r1 = this;
            com.google.common.util.concurrent.ListenerCallQueue<com.google.common.util.concurrent.Service$Listener> r0 = r1.listeners
            r0.addListener(r2, r3)
            return
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning() {
            r2 = this;
            com.google.common.util.concurrent.Monitor r0 = r2.monitor
            com.google.common.util.concurrent.Monitor$Guard r1 = r2.hasReachedRunning
            r0.enterWhenUninterruptibly(r1)
            com.google.common.util.concurrent.Service$State r0 = com.google.common.util.concurrent.Service.State.RUNNING     // Catch: java.lang.Throwable -> L12
            r2.checkCurrentState(r0)     // Catch: java.lang.Throwable -> L12
            com.google.common.util.concurrent.Monitor r0 = r2.monitor
            r0.leave()
            return
        L12:
            r0 = move-exception
            com.google.common.util.concurrent.Monitor r1 = r2.monitor
            r1.leave()
            throw r0
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning(long r3, java.util.concurrent.TimeUnit r5) throws java.util.concurrent.TimeoutException {
            r2 = this;
            com.google.common.util.concurrent.Monitor r0 = r2.monitor
            com.google.common.util.concurrent.Monitor$Guard r1 = r2.hasReachedRunning
            boolean r3 = r0.enterWhenUninterruptibly(r1, r3, r5)
            if (r3 == 0) goto L1c
            com.google.common.util.concurrent.Service$State r3 = com.google.common.util.concurrent.Service.State.RUNNING     // Catch: java.lang.Throwable -> L15
            r2.checkCurrentState(r3)     // Catch: java.lang.Throwable -> L15
            com.google.common.util.concurrent.Monitor r3 = r2.monitor
            r3.leave()
            return
        L15:
            r3 = move-exception
            com.google.common.util.concurrent.Monitor r4 = r2.monitor
            r4.leave()
            throw r3
        L1c:
            java.util.concurrent.TimeoutException r3 = new java.util.concurrent.TimeoutException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Timed out waiting for "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r5 = " to reach the RUNNING state."
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated() {
            r2 = this;
            com.google.common.util.concurrent.Monitor r0 = r2.monitor
            com.google.common.util.concurrent.Monitor$Guard r1 = r2.isStopped
            r0.enterWhenUninterruptibly(r1)
            com.google.common.util.concurrent.Service$State r0 = com.google.common.util.concurrent.Service.State.TERMINATED     // Catch: java.lang.Throwable -> L12
            r2.checkCurrentState(r0)     // Catch: java.lang.Throwable -> L12
            com.google.common.util.concurrent.Monitor r0 = r2.monitor
            r0.leave()
            return
        L12:
            r0 = move-exception
            com.google.common.util.concurrent.Monitor r1 = r2.monitor
            r1.leave()
            throw r0
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated(long r3, java.util.concurrent.TimeUnit r5) throws java.util.concurrent.TimeoutException {
            r2 = this;
            com.google.common.util.concurrent.Monitor r0 = r2.monitor
            com.google.common.util.concurrent.Monitor$Guard r1 = r2.isStopped
            boolean r3 = r0.enterWhenUninterruptibly(r1, r3, r5)
            if (r3 == 0) goto L1c
            com.google.common.util.concurrent.Service$State r3 = com.google.common.util.concurrent.Service.State.TERMINATED     // Catch: java.lang.Throwable -> L15
            r2.checkCurrentState(r3)     // Catch: java.lang.Throwable -> L15
            com.google.common.util.concurrent.Monitor r3 = r2.monitor
            r3.leave()
            return
        L15:
            r3 = move-exception
            com.google.common.util.concurrent.Monitor r4 = r2.monitor
            r4.leave()
            throw r3
        L1c:
            java.util.concurrent.TimeoutException r3 = new java.util.concurrent.TimeoutException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Timed out waiting for "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r5 = " to reach a terminal state. Current state: "
            r4.append(r5)
            com.google.common.util.concurrent.Service$State r5 = r2.state()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    @com.google.errorprone.annotations.ForOverride
    protected void doCancelStart() {
            r0 = this;
            return
    }

    @com.google.errorprone.annotations.ForOverride
    protected abstract void doStart();

    @com.google.errorprone.annotations.ForOverride
    protected abstract void doStop();

    @Override // com.google.common.util.concurrent.Service
    public final java.lang.Throwable failureCause() {
            r1 = this;
            com.google.common.util.concurrent.AbstractService$StateSnapshot r0 = r1.snapshot
            java.lang.Throwable r0 = r0.failureCause()
            return r0
    }

    @Override // com.google.common.util.concurrent.Service
    public final boolean isRunning() {
            r2 = this;
            com.google.common.util.concurrent.Service$State r0 = r2.state()
            com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.RUNNING
            if (r0 != r1) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    protected final void notifyFailed(java.lang.Throwable r5) {
            r4 = this;
            com.google.common.base.Preconditions.checkNotNull(r5)
            com.google.common.util.concurrent.Monitor r0 = r4.monitor
            r0.enter()
            com.google.common.util.concurrent.Service$State r0 = r4.state()     // Catch: java.lang.Throwable -> L3a
            int[] r1 = com.google.common.util.concurrent.AbstractService.AnonymousClass6.$SwitchMap$com$google$common$util$concurrent$Service$State     // Catch: java.lang.Throwable -> L3a
            int r2 = r0.ordinal()     // Catch: java.lang.Throwable -> L3a
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L3a
            r2 = 1
            if (r1 == r2) goto L3c
            r2 = 2
            if (r1 == r2) goto L24
            r2 = 3
            if (r1 == r2) goto L24
            r2 = 4
            if (r1 == r2) goto L24
            r2 = 5
            if (r1 == r2) goto L3c
            goto L31
        L24:
            com.google.common.util.concurrent.AbstractService$StateSnapshot r1 = new com.google.common.util.concurrent.AbstractService$StateSnapshot     // Catch: java.lang.Throwable -> L3a
            com.google.common.util.concurrent.Service$State r2 = com.google.common.util.concurrent.Service.State.FAILED     // Catch: java.lang.Throwable -> L3a
            r3 = 0
            r1.<init>(r2, r3, r5)     // Catch: java.lang.Throwable -> L3a
            r4.snapshot = r1     // Catch: java.lang.Throwable -> L3a
            r4.enqueueFailedEvent(r0, r5)     // Catch: java.lang.Throwable -> L3a
        L31:
            com.google.common.util.concurrent.Monitor r5 = r4.monitor
            r5.leave()
            r4.dispatchListenerEvents()
            return
        L3a:
            r5 = move-exception
            goto L53
        L3c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3a
            r2.<init>()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r3 = "Failed while in state:"
            r2.append(r3)     // Catch: java.lang.Throwable -> L3a
            r2.append(r0)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L3a
            r1.<init>(r0, r5)     // Catch: java.lang.Throwable -> L3a
            throw r1     // Catch: java.lang.Throwable -> L3a
        L53:
            com.google.common.util.concurrent.Monitor r0 = r4.monitor
            r0.leave()
            r4.dispatchListenerEvents()
            throw r5
    }

    protected final void notifyStarted() {
            r3 = this;
            com.google.common.util.concurrent.Monitor r0 = r3.monitor
            r0.enter()
            com.google.common.util.concurrent.AbstractService$StateSnapshot r0 = r3.snapshot     // Catch: java.lang.Throwable -> L20
            com.google.common.util.concurrent.Service$State r0 = r0.state     // Catch: java.lang.Throwable -> L20
            com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.STARTING     // Catch: java.lang.Throwable -> L20
            if (r0 != r1) goto L37
            com.google.common.util.concurrent.AbstractService$StateSnapshot r0 = r3.snapshot     // Catch: java.lang.Throwable -> L20
            boolean r0 = r0.shutdownWhenStartupFinishes     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L22
            com.google.common.util.concurrent.AbstractService$StateSnapshot r0 = new com.google.common.util.concurrent.AbstractService$StateSnapshot     // Catch: java.lang.Throwable -> L20
            com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.STOPPING     // Catch: java.lang.Throwable -> L20
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L20
            r3.snapshot = r0     // Catch: java.lang.Throwable -> L20
            r3.doStop()     // Catch: java.lang.Throwable -> L20
            goto L2e
        L20:
            r0 = move-exception
            goto L55
        L22:
            com.google.common.util.concurrent.AbstractService$StateSnapshot r0 = new com.google.common.util.concurrent.AbstractService$StateSnapshot     // Catch: java.lang.Throwable -> L20
            com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.RUNNING     // Catch: java.lang.Throwable -> L20
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L20
            r3.snapshot = r0     // Catch: java.lang.Throwable -> L20
            r3.enqueueRunningEvent()     // Catch: java.lang.Throwable -> L20
        L2e:
            com.google.common.util.concurrent.Monitor r0 = r3.monitor
            r0.leave()
            r3.dispatchListenerEvents()
            return
        L37:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L20
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L20
            r1.<init>()     // Catch: java.lang.Throwable -> L20
            java.lang.String r2 = "Cannot notifyStarted() when the service is "
            r1.append(r2)     // Catch: java.lang.Throwable -> L20
            com.google.common.util.concurrent.AbstractService$StateSnapshot r2 = r3.snapshot     // Catch: java.lang.Throwable -> L20
            com.google.common.util.concurrent.Service$State r2 = r2.state     // Catch: java.lang.Throwable -> L20
            r1.append(r2)     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L20
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L20
            r3.notifyFailed(r0)     // Catch: java.lang.Throwable -> L20
            throw r0     // Catch: java.lang.Throwable -> L20
        L55:
            com.google.common.util.concurrent.Monitor r1 = r3.monitor
            r1.leave()
            r3.dispatchListenerEvents()
            throw r0
    }

    protected final void notifyStopped() {
            r4 = this;
            com.google.common.util.concurrent.Monitor r0 = r4.monitor
            r0.enter()
            com.google.common.util.concurrent.Service$State r0 = r4.state()     // Catch: java.lang.Throwable -> L2a
            int[] r1 = com.google.common.util.concurrent.AbstractService.AnonymousClass6.$SwitchMap$com$google$common$util$concurrent$Service$State     // Catch: java.lang.Throwable -> L2a
            int r2 = r0.ordinal()     // Catch: java.lang.Throwable -> L2a
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L2a
            switch(r1) {
                case 1: goto L2c;
                case 2: goto L15;
                case 3: goto L15;
                case 4: goto L15;
                case 5: goto L2c;
                case 6: goto L2c;
                default: goto L14;
            }     // Catch: java.lang.Throwable -> L2a
        L14:
            goto L21
        L15:
            com.google.common.util.concurrent.AbstractService$StateSnapshot r1 = new com.google.common.util.concurrent.AbstractService$StateSnapshot     // Catch: java.lang.Throwable -> L2a
            com.google.common.util.concurrent.Service$State r2 = com.google.common.util.concurrent.Service.State.TERMINATED     // Catch: java.lang.Throwable -> L2a
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L2a
            r4.snapshot = r1     // Catch: java.lang.Throwable -> L2a
            r4.enqueueTerminatedEvent(r0)     // Catch: java.lang.Throwable -> L2a
        L21:
            com.google.common.util.concurrent.Monitor r0 = r4.monitor
            r0.leave()
            r4.dispatchListenerEvents()
            return
        L2a:
            r0 = move-exception
            goto L43
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2a
            r2.<init>()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r3 = "Cannot notifyStopped() when the service is "
            r2.append(r3)     // Catch: java.lang.Throwable -> L2a
            r2.append(r0)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L2a
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L2a
            throw r1     // Catch: java.lang.Throwable -> L2a
        L43:
            com.google.common.util.concurrent.Monitor r1 = r4.monitor
            r1.leave()
            r4.dispatchListenerEvents()
            throw r0
    }

    @Override // com.google.common.util.concurrent.Service
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public final com.google.common.util.concurrent.Service startAsync() {
            r3 = this;
            com.google.common.util.concurrent.Monitor r0 = r3.monitor
            com.google.common.util.concurrent.Monitor$Guard r1 = r3.isStartable
            boolean r0 = r0.enterIf(r1)
            if (r0 == 0) goto L31
            com.google.common.util.concurrent.AbstractService$StateSnapshot r0 = new com.google.common.util.concurrent.AbstractService$StateSnapshot     // Catch: java.lang.Throwable -> L22
            com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.STARTING     // Catch: java.lang.Throwable -> L22
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L22
            r3.snapshot = r0     // Catch: java.lang.Throwable -> L22
            r3.enqueueStartingEvent()     // Catch: java.lang.Throwable -> L22
            r3.doStart()     // Catch: java.lang.Throwable -> L22
        L19:
            com.google.common.util.concurrent.Monitor r0 = r3.monitor
            r0.leave()
            r3.dispatchListenerEvents()
            return r3
        L22:
            r0 = move-exception
            r3.notifyFailed(r0)     // Catch: java.lang.Throwable -> L27
            goto L19
        L27:
            r0 = move-exception
            com.google.common.util.concurrent.Monitor r1 = r3.monitor
            r1.leave()
            r3.dispatchListenerEvents()
            throw r0
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Service "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = " has already been started"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.common.util.concurrent.Service
    public final com.google.common.util.concurrent.Service.State state() {
            r1 = this;
            com.google.common.util.concurrent.AbstractService$StateSnapshot r0 = r1.snapshot
            com.google.common.util.concurrent.Service$State r0 = r0.externalState()
            return r0
    }

    @Override // com.google.common.util.concurrent.Service
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public final com.google.common.util.concurrent.Service stopAsync() {
            r4 = this;
            com.google.common.util.concurrent.Monitor r0 = r4.monitor
            com.google.common.util.concurrent.Monitor$Guard r1 = r4.isStoppable
            boolean r0 = r0.enterIf(r1)
            if (r0 == 0) goto L7c
            com.google.common.util.concurrent.Service$State r0 = r4.state()     // Catch: java.lang.Throwable -> L31
            int[] r1 = com.google.common.util.concurrent.AbstractService.AnonymousClass6.$SwitchMap$com$google$common$util$concurrent$Service$State     // Catch: java.lang.Throwable -> L31
            int r2 = r0.ordinal()     // Catch: java.lang.Throwable -> L31
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L31
            switch(r1) {
                case 1: goto L57;
                case 2: goto L45;
                case 3: goto L33;
                case 4: goto L1a;
                case 5: goto L1a;
                case 6: goto L1a;
                default: goto L19;
            }     // Catch: java.lang.Throwable -> L31
        L19:
            goto L65
        L1a:
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L31
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            r2.<init>()     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = "isStoppable is incorrectly implemented, saw: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L31
            r2.append(r0)     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L31
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L31
            throw r1     // Catch: java.lang.Throwable -> L31
        L31:
            r0 = move-exception
            goto L6e
        L33:
            com.google.common.util.concurrent.AbstractService$StateSnapshot r0 = new com.google.common.util.concurrent.AbstractService$StateSnapshot     // Catch: java.lang.Throwable -> L31
            com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.STOPPING     // Catch: java.lang.Throwable -> L31
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L31
            r4.snapshot = r0     // Catch: java.lang.Throwable -> L31
            com.google.common.util.concurrent.Service$State r0 = com.google.common.util.concurrent.Service.State.RUNNING     // Catch: java.lang.Throwable -> L31
            r4.enqueueStoppingEvent(r0)     // Catch: java.lang.Throwable -> L31
            r4.doStop()     // Catch: java.lang.Throwable -> L31
            goto L65
        L45:
            com.google.common.util.concurrent.AbstractService$StateSnapshot r0 = new com.google.common.util.concurrent.AbstractService$StateSnapshot     // Catch: java.lang.Throwable -> L31
            com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.STARTING     // Catch: java.lang.Throwable -> L31
            r2 = 1
            r3 = 0
            r0.<init>(r1, r2, r3)     // Catch: java.lang.Throwable -> L31
            r4.snapshot = r0     // Catch: java.lang.Throwable -> L31
            r4.enqueueStoppingEvent(r1)     // Catch: java.lang.Throwable -> L31
            r4.doCancelStart()     // Catch: java.lang.Throwable -> L31
            goto L65
        L57:
            com.google.common.util.concurrent.AbstractService$StateSnapshot r0 = new com.google.common.util.concurrent.AbstractService$StateSnapshot     // Catch: java.lang.Throwable -> L31
            com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.TERMINATED     // Catch: java.lang.Throwable -> L31
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L31
            r4.snapshot = r0     // Catch: java.lang.Throwable -> L31
            com.google.common.util.concurrent.Service$State r0 = com.google.common.util.concurrent.Service.State.NEW     // Catch: java.lang.Throwable -> L31
            r4.enqueueTerminatedEvent(r0)     // Catch: java.lang.Throwable -> L31
        L65:
            com.google.common.util.concurrent.Monitor r0 = r4.monitor
            r0.leave()
            r4.dispatchListenerEvents()
            return r4
        L6e:
            r4.notifyFailed(r0)     // Catch: java.lang.Throwable -> L72
            goto L65
        L72:
            r0 = move-exception
            com.google.common.util.concurrent.Monitor r1 = r4.monitor
            r1.leave()
            r4.dispatchListenerEvents()
            throw r0
        L7c:
            return r4
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = " ["
            r0.append(r1)
            com.google.common.util.concurrent.Service$State r1 = r2.state()
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
