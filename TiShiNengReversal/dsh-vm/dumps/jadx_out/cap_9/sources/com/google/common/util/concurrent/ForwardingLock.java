package com.google.common.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
abstract class ForwardingLock implements java.util.concurrent.locks.Lock {
    ForwardingLock() {
            r0 = this;
            r0.<init>()
            return
    }

    abstract java.util.concurrent.locks.Lock delegate();

    @Override // java.util.concurrent.locks.Lock
    public void lock() {
            r1 = this;
            java.util.concurrent.locks.Lock r0 = r1.delegate()
            r0.lock()
            return
    }

    @Override // java.util.concurrent.locks.Lock
    public void lockInterruptibly() throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.locks.Lock r0 = r1.delegate()
            r0.lockInterruptibly()
            return
    }

    @Override // java.util.concurrent.locks.Lock
    public java.util.concurrent.locks.Condition newCondition() {
            r1 = this;
            java.util.concurrent.locks.Lock r0 = r1.delegate()
            java.util.concurrent.locks.Condition r0 = r0.newCondition()
            return r0
    }

    @Override // java.util.concurrent.locks.Lock
    public boolean tryLock() {
            r1 = this;
            java.util.concurrent.locks.Lock r0 = r1.delegate()
            boolean r0 = r0.tryLock()
            return r0
    }

    @Override // java.util.concurrent.locks.Lock
    public boolean tryLock(long r2, java.util.concurrent.TimeUnit r4) throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.locks.Lock r0 = r1.delegate()
            boolean r2 = r0.tryLock(r2, r4)
            return r2
    }

    @Override // java.util.concurrent.locks.Lock
    public void unlock() {
            r1 = this;
            java.util.concurrent.locks.Lock r0 = r1.delegate()
            r0.unlock()
            return
    }
}
