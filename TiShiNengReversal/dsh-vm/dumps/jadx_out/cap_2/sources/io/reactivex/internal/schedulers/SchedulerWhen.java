package io.reactivex.internal.schedulers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@io.reactivex.annotations.Experimental
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class SchedulerWhen extends io.reactivex.Scheduler implements io.reactivex.disposables.Disposable {
    static final io.reactivex.disposables.Disposable DISPOSED = null;
    static final io.reactivex.disposables.Disposable SUBSCRIBED = null;
    private final io.reactivex.Scheduler actualScheduler;
    private io.reactivex.disposables.Disposable disposable;
    private final io.reactivex.processors.FlowableProcessor<io.reactivex.Flowable<io.reactivex.Completable>> workerProcessor;




    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class DelayedAction extends io.reactivex.internal.schedulers.SchedulerWhen.ScheduledAction {
        private final java.lang.Runnable action;
        private final long delayTime;
        private final java.util.concurrent.TimeUnit unit;

        DelayedAction(java.lang.Runnable r1, long r2, java.util.concurrent.TimeUnit r4) {
                r0 = this;
                r0.<init>()
                r0.action = r1
                r0.delayTime = r2
                r0.unit = r4
                return
        }

        @Override // io.reactivex.internal.schedulers.SchedulerWhen.ScheduledAction
        protected io.reactivex.disposables.Disposable callActual(io.reactivex.Scheduler.Worker r4, io.reactivex.CompletableObserver r5) {
                r3 = this;
                io.reactivex.internal.schedulers.SchedulerWhen$OnCompletedAction r0 = new io.reactivex.internal.schedulers.SchedulerWhen$OnCompletedAction
                java.lang.Runnable r1 = r3.action
                r0.<init>(r1, r5)
                long r1 = r3.delayTime
                java.util.concurrent.TimeUnit r5 = r3.unit
                io.reactivex.disposables.Disposable r4 = r4.schedule(r0, r1, r5)
                return r4
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class ImmediateAction extends io.reactivex.internal.schedulers.SchedulerWhen.ScheduledAction {
        private final java.lang.Runnable action;

        ImmediateAction(java.lang.Runnable r1) {
                r0 = this;
                r0.<init>()
                r0.action = r1
                return
        }

        @Override // io.reactivex.internal.schedulers.SchedulerWhen.ScheduledAction
        protected io.reactivex.disposables.Disposable callActual(io.reactivex.Scheduler.Worker r3, io.reactivex.CompletableObserver r4) {
                r2 = this;
                io.reactivex.internal.schedulers.SchedulerWhen$OnCompletedAction r0 = new io.reactivex.internal.schedulers.SchedulerWhen$OnCompletedAction
                java.lang.Runnable r1 = r2.action
                r0.<init>(r1, r4)
                io.reactivex.disposables.Disposable r3 = r3.schedule(r0)
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class OnCompletedAction implements java.lang.Runnable {
        private java.lang.Runnable action;
        private io.reactivex.CompletableObserver actionCompletable;

        OnCompletedAction(java.lang.Runnable r1, io.reactivex.CompletableObserver r2) {
                r0 = this;
                r0.<init>()
                r0.action = r1
                r0.actionCompletable = r2
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                java.lang.Runnable r0 = r2.action     // Catch: java.lang.Throwable -> Lb
                r0.run()     // Catch: java.lang.Throwable -> Lb
                io.reactivex.CompletableObserver r0 = r2.actionCompletable
                r0.onComplete()
                return
            Lb:
                r0 = move-exception
                io.reactivex.CompletableObserver r1 = r2.actionCompletable
                r1.onComplete()
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static abstract class ScheduledAction extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.disposables.Disposable {
        ScheduledAction() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = io.reactivex.internal.schedulers.SchedulerWhen.SUBSCRIBED
                r1.<init>(r0)
                return
        }

        void call(io.reactivex.Scheduler.Worker r3, io.reactivex.CompletableObserver r4) {
                r2 = this;
                java.lang.Object r0 = r2.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                io.reactivex.disposables.Disposable r1 = io.reactivex.internal.schedulers.SchedulerWhen.DISPOSED
                if (r0 != r1) goto Lb
                goto L1d
            Lb:
                io.reactivex.disposables.Disposable r1 = io.reactivex.internal.schedulers.SchedulerWhen.SUBSCRIBED
                if (r0 == r1) goto L10
                goto L1d
            L10:
                io.reactivex.disposables.Disposable r3 = r2.callActual(r3, r4)
                boolean r4 = r2.compareAndSet(r1, r3)
                if (r4 != 0) goto L1d
                r3.dispose()
            L1d:
                return
        }

        protected abstract io.reactivex.disposables.Disposable callActual(io.reactivex.Scheduler.Worker r1, io.reactivex.CompletableObserver r2);

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r3 = this;
                io.reactivex.disposables.Disposable r0 = io.reactivex.internal.schedulers.SchedulerWhen.DISPOSED
            L2:
                java.lang.Object r1 = r3.get()
                io.reactivex.disposables.Disposable r1 = (io.reactivex.disposables.Disposable) r1
                io.reactivex.disposables.Disposable r2 = io.reactivex.internal.schedulers.SchedulerWhen.DISPOSED
                if (r1 != r2) goto Ld
                goto L1a
            Ld:
                boolean r2 = r3.compareAndSet(r1, r0)
                if (r2 == 0) goto L2
                io.reactivex.disposables.Disposable r0 = io.reactivex.internal.schedulers.SchedulerWhen.SUBSCRIBED
                if (r1 == r0) goto L1a
                r1.dispose()
            L1a:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                java.lang.Object r0 = r1.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                boolean r0 = r0.isDisposed()
                return r0
        }
    }

    static {
            io.reactivex.internal.schedulers.SchedulerWhen$3 r0 = new io.reactivex.internal.schedulers.SchedulerWhen$3
            r0.<init>()
            io.reactivex.internal.schedulers.SchedulerWhen.SUBSCRIBED = r0
            io.reactivex.disposables.Disposable r0 = io.reactivex.disposables.Disposables.disposed()
            io.reactivex.internal.schedulers.SchedulerWhen.DISPOSED = r0
            return
    }

    public SchedulerWhen(io.reactivex.functions.Function<io.reactivex.Flowable<io.reactivex.Flowable<io.reactivex.Completable>>, io.reactivex.Completable> r1, io.reactivex.Scheduler r2) {
            r0 = this;
            r0.<init>()
            r0.actualScheduler = r2
            io.reactivex.processors.UnicastProcessor r2 = io.reactivex.processors.UnicastProcessor.create()
            io.reactivex.processors.FlowableProcessor r2 = r2.toSerialized()
            r0.workerProcessor = r2
            java.lang.Object r1 = r1.apply(r2)     // Catch: java.lang.Throwable -> L1c
            io.reactivex.Completable r1 = (io.reactivex.Completable) r1     // Catch: java.lang.Throwable -> L1c
            io.reactivex.disposables.Disposable r1 = r1.subscribe()     // Catch: java.lang.Throwable -> L1c
            r0.disposable = r1     // Catch: java.lang.Throwable -> L1c
            return
        L1c:
            r1 = move-exception
            io.reactivex.exceptions.Exceptions.propagate(r1)
            return
    }

    @Override // io.reactivex.Scheduler
    public io.reactivex.Scheduler.Worker createWorker() {
            r4 = this;
            io.reactivex.Scheduler r0 = r4.actualScheduler
            io.reactivex.Scheduler$Worker r0 = r0.createWorker()
            io.reactivex.processors.UnicastProcessor r1 = io.reactivex.processors.UnicastProcessor.create()
            io.reactivex.processors.FlowableProcessor r1 = r1.toSerialized()
            io.reactivex.internal.schedulers.SchedulerWhen$1 r2 = new io.reactivex.internal.schedulers.SchedulerWhen$1
            r2.<init>(r4, r0)
            io.reactivex.Flowable r2 = r1.map(r2)
            io.reactivex.internal.schedulers.SchedulerWhen$2 r3 = new io.reactivex.internal.schedulers.SchedulerWhen$2
            r3.<init>(r4, r0, r1)
            io.reactivex.processors.FlowableProcessor<io.reactivex.Flowable<io.reactivex.Completable>> r0 = r4.workerProcessor
            r0.onNext(r2)
            return r3
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
            r1 = this;
            io.reactivex.disposables.Disposable r0 = r1.disposable
            r0.dispose()
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
            r1 = this;
            io.reactivex.disposables.Disposable r0 = r1.disposable
            boolean r0 = r0.isDisposed()
            return r0
    }
}
