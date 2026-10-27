package com.google.common.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class AbstractIdleService implements com.google.common.util.concurrent.Service {
    private final com.google.common.util.concurrent.Service delegate;
    private final com.google.common.base.Supplier<java.lang.String> threadNameSupplier;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class DelegateService extends com.google.common.util.concurrent.AbstractService {
        final /* synthetic */ com.google.common.util.concurrent.AbstractIdleService this$0;



        private DelegateService(com.google.common.util.concurrent.AbstractIdleService r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ DelegateService(com.google.common.util.concurrent.AbstractIdleService r1, com.google.common.util.concurrent.AbstractIdleService.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.util.concurrent.AbstractService
        protected final void doStart() {
                r2 = this;
                com.google.common.util.concurrent.AbstractIdleService r0 = r2.this$0
                java.util.concurrent.Executor r0 = r0.executor()
                com.google.common.util.concurrent.AbstractIdleService r1 = r2.this$0
                com.google.common.base.Supplier r1 = com.google.common.util.concurrent.AbstractIdleService.access$200(r1)
                java.util.concurrent.Executor r0 = com.google.common.util.concurrent.MoreExecutors.renamingDecorator(r0, r1)
                com.google.common.util.concurrent.AbstractIdleService$DelegateService$1 r1 = new com.google.common.util.concurrent.AbstractIdleService$DelegateService$1
                r1.<init>(r2)
                r0.execute(r1)
                return
        }

        @Override // com.google.common.util.concurrent.AbstractService
        protected final void doStop() {
                r2 = this;
                com.google.common.util.concurrent.AbstractIdleService r0 = r2.this$0
                java.util.concurrent.Executor r0 = r0.executor()
                com.google.common.util.concurrent.AbstractIdleService r1 = r2.this$0
                com.google.common.base.Supplier r1 = com.google.common.util.concurrent.AbstractIdleService.access$200(r1)
                java.util.concurrent.Executor r0 = com.google.common.util.concurrent.MoreExecutors.renamingDecorator(r0, r1)
                com.google.common.util.concurrent.AbstractIdleService$DelegateService$2 r1 = new com.google.common.util.concurrent.AbstractIdleService$DelegateService$2
                r1.<init>(r2)
                r0.execute(r1)
                return
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public java.lang.String toString() {
                r1 = this;
                com.google.common.util.concurrent.AbstractIdleService r0 = r1.this$0
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class ThreadNameSupplier implements com.google.common.base.Supplier<java.lang.String> {
        final /* synthetic */ com.google.common.util.concurrent.AbstractIdleService this$0;

        private ThreadNameSupplier(com.google.common.util.concurrent.AbstractIdleService r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ ThreadNameSupplier(com.google.common.util.concurrent.AbstractIdleService r1, com.google.common.util.concurrent.AbstractIdleService.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.base.Supplier
        public /* bridge */ /* synthetic */ java.lang.String get() {
                r1 = this;
                java.lang.String r0 = r1.get2()
                return r0
        }

        @Override // com.google.common.base.Supplier
        /* renamed from: get, reason: avoid collision after fix types in other method */
        public java.lang.String get2() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                com.google.common.util.concurrent.AbstractIdleService r1 = r2.this$0
                java.lang.String r1 = r1.serviceName()
                r0.append(r1)
                java.lang.String r1 = " "
                r0.append(r1)
                com.google.common.util.concurrent.AbstractIdleService r1 = r2.this$0
                com.google.common.util.concurrent.Service$State r1 = r1.state()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    protected AbstractIdleService() {
            r2 = this;
            r2.<init>()
            com.google.common.util.concurrent.AbstractIdleService$ThreadNameSupplier r0 = new com.google.common.util.concurrent.AbstractIdleService$ThreadNameSupplier
            r1 = 0
            r0.<init>(r2, r1)
            r2.threadNameSupplier = r0
            com.google.common.util.concurrent.AbstractIdleService$DelegateService r0 = new com.google.common.util.concurrent.AbstractIdleService$DelegateService
            r0.<init>(r2, r1)
            r2.delegate = r0
            return
    }

    static /* synthetic */ com.google.common.base.Supplier access$200(com.google.common.util.concurrent.AbstractIdleService r0) {
            com.google.common.base.Supplier<java.lang.String> r0 = r0.threadNameSupplier
            return r0
    }

    @Override // com.google.common.util.concurrent.Service
    public final void addListener(com.google.common.util.concurrent.Service.Listener r2, java.util.concurrent.Executor r3) {
            r1 = this;
            com.google.common.util.concurrent.Service r0 = r1.delegate
            r0.addListener(r2, r3)
            return
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning() {
            r1 = this;
            com.google.common.util.concurrent.Service r0 = r1.delegate
            r0.awaitRunning()
            return
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning(long r2, java.util.concurrent.TimeUnit r4) throws java.util.concurrent.TimeoutException {
            r1 = this;
            com.google.common.util.concurrent.Service r0 = r1.delegate
            r0.awaitRunning(r2, r4)
            return
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated() {
            r1 = this;
            com.google.common.util.concurrent.Service r0 = r1.delegate
            r0.awaitTerminated()
            return
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated(long r2, java.util.concurrent.TimeUnit r4) throws java.util.concurrent.TimeoutException {
            r1 = this;
            com.google.common.util.concurrent.Service r0 = r1.delegate
            r0.awaitTerminated(r2, r4)
            return
    }

    protected java.util.concurrent.Executor executor() {
            r1 = this;
            com.google.common.util.concurrent.AbstractIdleService$1 r0 = new com.google.common.util.concurrent.AbstractIdleService$1
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.util.concurrent.Service
    public final java.lang.Throwable failureCause() {
            r1 = this;
            com.google.common.util.concurrent.Service r0 = r1.delegate
            java.lang.Throwable r0 = r0.failureCause()
            return r0
    }

    @Override // com.google.common.util.concurrent.Service
    public final boolean isRunning() {
            r1 = this;
            com.google.common.util.concurrent.Service r0 = r1.delegate
            boolean r0 = r0.isRunning()
            return r0
    }

    protected java.lang.String serviceName() {
            r1 = this;
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getSimpleName()
            return r0
    }

    protected abstract void shutDown() throws java.lang.Exception;

    @Override // com.google.common.util.concurrent.Service
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public final com.google.common.util.concurrent.Service startAsync() {
            r1 = this;
            com.google.common.util.concurrent.Service r0 = r1.delegate
            r0.startAsync()
            return r1
    }

    protected abstract void startUp() throws java.lang.Exception;

    @Override // com.google.common.util.concurrent.Service
    public final com.google.common.util.concurrent.Service.State state() {
            r1 = this;
            com.google.common.util.concurrent.Service r0 = r1.delegate
            com.google.common.util.concurrent.Service$State r0 = r0.state()
            return r0
    }

    @Override // com.google.common.util.concurrent.Service
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public final com.google.common.util.concurrent.Service stopAsync() {
            r1 = this;
            com.google.common.util.concurrent.Service r0 = r1.delegate
            r0.stopAsync()
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.serviceName()
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
