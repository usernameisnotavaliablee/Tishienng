package com.huawei.hms.framework.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class RunnableScheduledFutureEnhance<T> implements java.util.concurrent.RunnableScheduledFuture<T> {
    private java.util.concurrent.RunnableScheduledFuture<T> a;
    private java.lang.String b;

    public RunnableScheduledFutureEnhance(java.util.concurrent.RunnableScheduledFuture<T> r2) {
            r1 = this;
            r1.<init>()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            r1.b = r0
            r1.a = r2
            return
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean r2) {
            r1 = this;
            java.util.concurrent.RunnableScheduledFuture<T> r0 = r1.a
            boolean r2 = r0.cancel(r2)
            return r2
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(java.util.concurrent.Delayed r1) {
            r0 = this;
            java.util.concurrent.Delayed r1 = (java.util.concurrent.Delayed) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(java.util.concurrent.Delayed r2) {
            r1 = this;
            java.util.concurrent.RunnableScheduledFuture<T> r0 = r1.a
            int r2 = r0.compareTo(r2)
            return r2
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            java.util.concurrent.RunnableScheduledFuture<T> r0 = r1.a
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // java.util.concurrent.Future
    public T get() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.RunnableScheduledFuture<T> r0 = r1.a
            java.lang.Object r0 = r0.get()
            return r0
    }

    @Override // java.util.concurrent.Future
    public T get(long r2, java.util.concurrent.TimeUnit r4) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
            r1 = this;
            java.util.concurrent.RunnableScheduledFuture<T> r0 = r1.a
            java.lang.Object r2 = r0.get(r2, r4)
            return r2
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(java.util.concurrent.TimeUnit r3) {
            r2 = this;
            java.util.concurrent.RunnableScheduledFuture<T> r0 = r2.a
            long r0 = r0.getDelay(r3)
            return r0
    }

    public java.lang.String getParentName() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.util.concurrent.RunnableScheduledFuture<T> r0 = r1.a
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
            r1 = this;
            java.util.concurrent.RunnableScheduledFuture<T> r0 = r1.a
            boolean r0 = r0.isCancelled()
            return r0
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
            r1 = this;
            java.util.concurrent.RunnableScheduledFuture<T> r0 = r1.a
            boolean r0 = r0.isDone()
            return r0
    }

    @Override // java.util.concurrent.RunnableScheduledFuture
    public boolean isPeriodic() {
            r1 = this;
            java.util.concurrent.RunnableScheduledFuture<T> r0 = r1.a
            boolean r0 = r0.isPeriodic()
            return r0
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
            r1 = this;
            java.util.concurrent.RunnableScheduledFuture<T> r0 = r1.a
            r0.run()
            return
    }
}
