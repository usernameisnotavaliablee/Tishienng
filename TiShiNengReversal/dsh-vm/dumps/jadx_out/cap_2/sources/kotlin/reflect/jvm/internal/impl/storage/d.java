package kotlin.reflect.jvm.internal.impl.storage;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class d implements kotlin.reflect.jvm.internal.impl.storage.k {

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.locks.Lock b;

    public d() {
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r0, r1, r0)
            return
    }

    public d(@org.jetbrains.annotations.NotNull java.util.concurrent.locks.Lock r2) {
            r1 = this;
            java.lang.String r0 = "lock"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.b = r2
            return
    }

    public /* synthetic */ d(java.util.concurrent.locks.Lock r1, int r2, kotlin.jvm.internal.v r3) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L9
            java.util.concurrent.locks.ReentrantLock r1 = new java.util.concurrent.locks.ReentrantLock
            r1.<init>()
        L9:
            r0.<init>(r1)
            return
    }

    @org.jetbrains.annotations.NotNull
    protected final java.util.concurrent.locks.Lock a() {
            r1 = this;
            java.util.concurrent.locks.Lock r0 = r1.b
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.k
    public void lock() {
            r1 = this;
            java.util.concurrent.locks.Lock r0 = r1.b
            r0.lock()
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.k
    public void unlock() {
            r1 = this;
            java.util.concurrent.locks.Lock r0 = r1.b
            r0.unlock()
            return
    }
}
