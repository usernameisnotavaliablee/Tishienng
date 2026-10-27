package com.google.common.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class AbstractExecutionThreadService implements com.google.common.util.concurrent.Service {
    private static final java.util.logging.Logger logger = null;
    private final com.google.common.util.concurrent.Service delegate;



    static {
            java.lang.Class<com.google.common.util.concurrent.AbstractExecutionThreadService> r0 = com.google.common.util.concurrent.AbstractExecutionThreadService.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.common.util.concurrent.AbstractExecutionThreadService.logger = r0
            return
    }

    protected AbstractExecutionThreadService() {
            r1 = this;
            r1.<init>()
            com.google.common.util.concurrent.AbstractExecutionThreadService$1 r0 = new com.google.common.util.concurrent.AbstractExecutionThreadService$1
            r0.<init>(r1)
            r1.delegate = r0
            return
    }

    static /* synthetic */ java.util.logging.Logger access$000() {
            java.util.logging.Logger r0 = com.google.common.util.concurrent.AbstractExecutionThreadService.logger
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
            com.google.common.util.concurrent.AbstractExecutionThreadService$2 r0 = new com.google.common.util.concurrent.AbstractExecutionThreadService$2
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

    protected abstract void run() throws java.lang.Exception;

    protected java.lang.String serviceName() {
            r1 = this;
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getSimpleName()
            return r0
    }

    protected void shutDown() throws java.lang.Exception {
            r0 = this;
            return
    }

    @Override // com.google.common.util.concurrent.Service
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public final com.google.common.util.concurrent.Service startAsync() {
            r1 = this;
            com.google.common.util.concurrent.Service r0 = r1.delegate
            r0.startAsync()
            return r1
    }

    protected void startUp() throws java.lang.Exception {
            r0 = this;
            return
    }

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

    protected void triggerShutdown() {
            r0 = this;
            return
    }
}
