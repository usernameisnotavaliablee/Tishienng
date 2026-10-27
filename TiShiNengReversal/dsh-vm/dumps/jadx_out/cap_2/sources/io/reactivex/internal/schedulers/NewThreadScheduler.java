package io.reactivex.internal.schedulers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class NewThreadScheduler extends io.reactivex.Scheduler {
    private static final io.reactivex.internal.schedulers.NewThreadScheduler INSTANCE = null;
    private static final java.lang.String KEY_NEWTHREAD_PRIORITY = "rx2.newthread-priority";
    private static final io.reactivex.internal.schedulers.RxThreadFactory THREAD_FACTORY = null;
    private static final java.lang.String THREAD_NAME_PREFIX = "RxNewThreadScheduler";

    static {
            io.reactivex.internal.schedulers.NewThreadScheduler r0 = new io.reactivex.internal.schedulers.NewThreadScheduler
            r0.<init>()
            io.reactivex.internal.schedulers.NewThreadScheduler.INSTANCE = r0
            java.lang.String r0 = "rx2.newthread-priority"
            r1 = 5
            java.lang.Integer r0 = java.lang.Integer.getInteger(r0, r1)
            int r0 = r0.intValue()
            r1 = 10
            int r0 = java.lang.Math.min(r1, r0)
            r1 = 1
            int r0 = java.lang.Math.max(r1, r0)
            io.reactivex.internal.schedulers.RxThreadFactory r1 = new io.reactivex.internal.schedulers.RxThreadFactory
            java.lang.String r2 = "RxNewThreadScheduler"
            r1.<init>(r2, r0)
            io.reactivex.internal.schedulers.NewThreadScheduler.THREAD_FACTORY = r1
            return
    }

    private NewThreadScheduler() {
            r0 = this;
            r0.<init>()
            return
    }

    public static io.reactivex.internal.schedulers.NewThreadScheduler instance() {
            io.reactivex.internal.schedulers.NewThreadScheduler r0 = io.reactivex.internal.schedulers.NewThreadScheduler.INSTANCE
            return r0
    }

    @Override // io.reactivex.Scheduler
    public io.reactivex.Scheduler.Worker createWorker() {
            r2 = this;
            io.reactivex.internal.schedulers.NewThreadWorker r0 = new io.reactivex.internal.schedulers.NewThreadWorker
            io.reactivex.internal.schedulers.RxThreadFactory r1 = io.reactivex.internal.schedulers.NewThreadScheduler.THREAD_FACTORY
            r0.<init>(r1)
            return r0
    }
}
