package com.huawei.hms.framework.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class ExecutorsEnhance {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class DelegatedExecutorService extends java.util.concurrent.AbstractExecutorService {
        private final java.util.concurrent.ExecutorService a;

        DelegatedExecutorService(java.util.concurrent.ExecutorService r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean awaitTermination(long r2, java.util.concurrent.TimeUnit r4) throws java.lang.InterruptedException {
                r1 = this;
                java.util.concurrent.ExecutorService r0 = r1.a
                boolean r2 = r0.awaitTermination(r2, r4)
                return r2
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable r2) {
                r1 = this;
                java.util.concurrent.ExecutorService r0 = r1.a
                r0.execute(r2)
                return
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> r2) throws java.lang.InterruptedException {
                r1 = this;
                java.util.concurrent.ExecutorService r0 = r1.a
                java.util.List r2 = r0.invokeAll(r2)
                return r2
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> r2, long r3, java.util.concurrent.TimeUnit r5) throws java.lang.InterruptedException {
                r1 = this;
                java.util.concurrent.ExecutorService r0 = r1.a
                java.util.List r2 = r0.invokeAll(r2, r3, r5)
                return r2
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> T invokeAny(java.util.Collection<? extends java.util.concurrent.Callable<T>> r2) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
                r1 = this;
                java.util.concurrent.ExecutorService r0 = r1.a
                java.lang.Object r2 = r0.invokeAny(r2)
                return r2
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> T invokeAny(java.util.Collection<? extends java.util.concurrent.Callable<T>> r2, long r3, java.util.concurrent.TimeUnit r5) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
                r1 = this;
                java.util.concurrent.ExecutorService r0 = r1.a
                java.lang.Object r2 = r0.invokeAny(r2, r3, r5)
                return r2
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isShutdown() {
                r1 = this;
                java.util.concurrent.ExecutorService r0 = r1.a
                boolean r0 = r0.isShutdown()
                return r0
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isTerminated() {
                r1 = this;
                java.util.concurrent.ExecutorService r0 = r1.a
                boolean r0 = r0.isTerminated()
                return r0
        }

        @Override // java.util.concurrent.ExecutorService
        public void shutdown() {
                r1 = this;
                java.util.concurrent.ExecutorService r0 = r1.a
                r0.shutdown()
                return
        }

        @Override // java.util.concurrent.ExecutorService
        public java.util.List<java.lang.Runnable> shutdownNow() {
                r1 = this;
                java.util.concurrent.ExecutorService r0 = r1.a
                java.util.List r0 = r0.shutdownNow()
                return r0
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public java.util.concurrent.Future<?> submit(java.lang.Runnable r2) {
                r1 = this;
                java.util.concurrent.ExecutorService r0 = r1.a
                java.util.concurrent.Future r2 = r0.submit(r2)
                return r2
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> java.util.concurrent.Future<T> submit(java.lang.Runnable r2, T r3) {
                r1 = this;
                java.util.concurrent.ExecutorService r0 = r1.a
                java.util.concurrent.Future r2 = r0.submit(r2, r3)
                return r2
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> java.util.concurrent.Future<T> submit(java.util.concurrent.Callable<T> r2) {
                r1 = this;
                java.util.concurrent.ExecutorService r0 = r1.a
                java.util.concurrent.Future r2 = r0.submit(r2)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class FinalizableDelegatedExecutorService extends com.huawei.hms.framework.common.ExecutorsEnhance.DelegatedExecutorService {
        FinalizableDelegatedExecutorService(java.util.concurrent.ExecutorService r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        protected void finalize() {
                r0 = this;
                super.shutdown()
                return
        }
    }

    public ExecutorsEnhance() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.concurrent.ExecutorService newSingleThreadExecutor(java.util.concurrent.ThreadFactory r8) {
            com.huawei.hms.framework.common.ThreadPoolExcutorEnhance r0 = new com.huawei.hms.framework.common.ThreadPoolExcutorEnhance
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r6 = new java.util.concurrent.LinkedBlockingQueue
            r6.<init>()
            r1 = 1
            r2 = 1
            r3 = 60
            r7 = r8
            r0.<init>(r1, r2, r3, r5, r6, r7)
            r8 = 1
            r0.allowCoreThreadTimeOut(r8)
            com.huawei.hms.framework.common.ExecutorsEnhance$FinalizableDelegatedExecutorService r8 = new com.huawei.hms.framework.common.ExecutorsEnhance$FinalizableDelegatedExecutorService
            r8.<init>(r0)
            return r8
    }
}
