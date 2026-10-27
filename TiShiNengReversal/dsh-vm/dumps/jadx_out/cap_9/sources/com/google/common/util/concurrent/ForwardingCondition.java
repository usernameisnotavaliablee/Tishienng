package com.google.common.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
abstract class ForwardingCondition implements java.util.concurrent.locks.Condition {
    ForwardingCondition() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.locks.Condition
    public void await() throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.locks.Condition r0 = r1.delegate()
            r0.await()
            return
    }

    @Override // java.util.concurrent.locks.Condition
    public boolean await(long r2, java.util.concurrent.TimeUnit r4) throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.locks.Condition r0 = r1.delegate()
            boolean r2 = r0.await(r2, r4)
            return r2
    }

    @Override // java.util.concurrent.locks.Condition
    public long awaitNanos(long r2) throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.locks.Condition r0 = r1.delegate()
            long r2 = r0.awaitNanos(r2)
            return r2
    }

    @Override // java.util.concurrent.locks.Condition
    public void awaitUninterruptibly() {
            r1 = this;
            java.util.concurrent.locks.Condition r0 = r1.delegate()
            r0.awaitUninterruptibly()
            return
    }

    @Override // java.util.concurrent.locks.Condition
    public boolean awaitUntil(java.util.Date r2) throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.locks.Condition r0 = r1.delegate()
            boolean r2 = r0.awaitUntil(r2)
            return r2
    }

    abstract java.util.concurrent.locks.Condition delegate();

    @Override // java.util.concurrent.locks.Condition
    public void signal() {
            r1 = this;
            java.util.concurrent.locks.Condition r0 = r1.delegate()
            r0.signal()
            return
    }

    @Override // java.util.concurrent.locks.Condition
    public void signalAll() {
            r1 = this;
            java.util.concurrent.locks.Condition r0 = r1.delegate()
            r0.signalAll()
            return
    }
}
