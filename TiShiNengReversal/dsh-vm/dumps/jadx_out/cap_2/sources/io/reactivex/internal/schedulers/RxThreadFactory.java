package io.reactivex.internal.schedulers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class RxThreadFactory extends java.util.concurrent.atomic.AtomicLong implements java.util.concurrent.ThreadFactory {
    private static final long serialVersionUID = -7789753024099756196L;
    final java.lang.String prefix;
    final int priority;

    public RxThreadFactory(java.lang.String r2) {
            r1 = this;
            r0 = 5
            r1.<init>(r2, r0)
            return
    }

    public RxThreadFactory(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.prefix = r1
            r0.priority = r2
            return
    }

    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(java.lang.Runnable r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = r3.prefix
            r0.<init>(r1)
            r1 = 45
            r0.append(r1)
            long r1 = r3.incrementAndGet()
            r0.append(r1)
            java.lang.Thread r1 = new java.lang.Thread
            java.lang.String r0 = r0.toString()
            r1.<init>(r4, r0)
            int r4 = r3.priority
            r1.setPriority(r4)
            r4 = 1
            r1.setDaemon(r4)
            return r1
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "RxThreadFactory["
            r0.append(r1)
            java.lang.String r1 = r2.prefix
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
