package io.reactivex.schedulers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class TestScheduler extends io.reactivex.Scheduler {
    long counter;
    final java.util.Queue<io.reactivex.schedulers.TestScheduler.TimedRunnable> queue;
    volatile long time;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class TestWorker extends io.reactivex.Scheduler.Worker {
        volatile boolean disposed;
        final /* synthetic */ io.reactivex.schedulers.TestScheduler this$0;



        TestWorker(io.reactivex.schedulers.TestScheduler r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                r0 = 1
                r1.disposed = r0
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                boolean r0 = r1.disposed
                return r0
        }

        @Override // io.reactivex.Scheduler.Worker
        public long now(java.util.concurrent.TimeUnit r3) {
                r2 = this;
                io.reactivex.schedulers.TestScheduler r0 = r2.this$0
                long r0 = r0.now(r3)
                return r0
        }

        @Override // io.reactivex.Scheduler.Worker
        public io.reactivex.disposables.Disposable schedule(java.lang.Runnable r8) {
                r7 = this;
                boolean r0 = r7.disposed
                if (r0 == 0) goto L7
                io.reactivex.internal.disposables.EmptyDisposable r8 = io.reactivex.internal.disposables.EmptyDisposable.INSTANCE
                return r8
            L7:
                io.reactivex.schedulers.TestScheduler$TimedRunnable r0 = new io.reactivex.schedulers.TestScheduler$TimedRunnable
                io.reactivex.schedulers.TestScheduler r1 = r7.this$0
                long r5 = r1.counter
                r2 = 1
                long r2 = r2 + r5
                r1.counter = r2
                r2 = 0
                r1 = r7
                r4 = r8
                r0.<init>(r1, r2, r4, r5)
                io.reactivex.schedulers.TestScheduler r8 = r1.this$0
                java.util.Queue<io.reactivex.schedulers.TestScheduler$TimedRunnable> r8 = r8.queue
                r8.add(r0)
                io.reactivex.schedulers.TestScheduler$TestWorker$2 r8 = new io.reactivex.schedulers.TestScheduler$TestWorker$2
                r8.<init>(r7, r0)
                io.reactivex.disposables.Disposable r8 = io.reactivex.disposables.Disposables.fromRunnable(r8)
                return r8
        }

        @Override // io.reactivex.Scheduler.Worker
        public io.reactivex.disposables.Disposable schedule(java.lang.Runnable r8, long r9, java.util.concurrent.TimeUnit r11) {
                r7 = this;
                boolean r0 = r7.disposed
                if (r0 == 0) goto L7
                io.reactivex.internal.disposables.EmptyDisposable r8 = io.reactivex.internal.disposables.EmptyDisposable.INSTANCE
                return r8
            L7:
                io.reactivex.schedulers.TestScheduler$TimedRunnable r0 = new io.reactivex.schedulers.TestScheduler$TimedRunnable
                io.reactivex.schedulers.TestScheduler r1 = r7.this$0
                long r1 = r1.time
                long r9 = r11.toNanos(r9)
                long r1 = r1 + r9
                io.reactivex.schedulers.TestScheduler r9 = r7.this$0
                long r5 = r9.counter
                r10 = 1
                long r10 = r10 + r5
                r9.counter = r10
                r4 = r8
                r2 = r1
                r1 = r7
                r0.<init>(r1, r2, r4, r5)
                io.reactivex.schedulers.TestScheduler r8 = r1.this$0
                java.util.Queue<io.reactivex.schedulers.TestScheduler$TimedRunnable> r8 = r8.queue
                r8.add(r0)
                io.reactivex.schedulers.TestScheduler$TestWorker$1 r8 = new io.reactivex.schedulers.TestScheduler$TestWorker$1
                r8.<init>(r7, r0)
                io.reactivex.disposables.Disposable r8 = io.reactivex.disposables.Disposables.fromRunnable(r8)
                return r8
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class TimedRunnable implements java.lang.Comparable<io.reactivex.schedulers.TestScheduler.TimedRunnable> {
        final long count;
        final java.lang.Runnable run;
        final io.reactivex.schedulers.TestScheduler.TestWorker scheduler;
        final long time;

        TimedRunnable(io.reactivex.schedulers.TestScheduler.TestWorker r1, long r2, java.lang.Runnable r4, long r5) {
                r0 = this;
                r0.<init>()
                r0.time = r2
                r0.run = r4
                r0.scheduler = r1
                r0.count = r5
                return
        }

        /* renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(io.reactivex.schedulers.TestScheduler.TimedRunnable r6) {
                r5 = this;
                long r0 = r5.time
                long r2 = r6.time
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L11
                long r0 = r5.count
                long r2 = r6.count
                int r6 = io.reactivex.internal.functions.ObjectHelper.compare(r0, r2)
                return r6
            L11:
                int r6 = io.reactivex.internal.functions.ObjectHelper.compare(r0, r2)
                return r6
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(io.reactivex.schedulers.TestScheduler.TimedRunnable r1) {
                r0 = this;
                io.reactivex.schedulers.TestScheduler$TimedRunnable r1 = (io.reactivex.schedulers.TestScheduler.TimedRunnable) r1
                int r1 = r0.compareTo2(r1)
                return r1
        }

        public java.lang.String toString() {
                r4 = this;
                long r0 = r4.time
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                java.lang.Runnable r1 = r4.run
                java.lang.String r1 = r1.toString()
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                r2[r3] = r0
                r0 = 1
                r2[r0] = r1
                java.lang.String r0 = "TimedRunnable(time = %d, run = %s)"
                java.lang.String r0 = java.lang.String.format(r0, r2)
                return r0
        }
    }

    public TestScheduler() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.PriorityBlockingQueue r0 = new java.util.concurrent.PriorityBlockingQueue
            r1 = 11
            r0.<init>(r1)
            r2.queue = r0
            return
    }

    private void triggerActions(long r7) {
            r6 = this;
        L0:
            java.util.Queue<io.reactivex.schedulers.TestScheduler$TimedRunnable> r0 = r6.queue
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L32
            java.util.Queue<io.reactivex.schedulers.TestScheduler$TimedRunnable> r0 = r6.queue
            java.lang.Object r0 = r0.peek()
            io.reactivex.schedulers.TestScheduler$TimedRunnable r0 = (io.reactivex.schedulers.TestScheduler.TimedRunnable) r0
            long r1 = r0.time
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 <= 0) goto L17
            goto L32
        L17:
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L1f
            long r1 = r6.time
        L1f:
            r6.time = r1
            java.util.Queue<io.reactivex.schedulers.TestScheduler$TimedRunnable> r1 = r6.queue
            r1.remove()
            io.reactivex.schedulers.TestScheduler$TestWorker r1 = r0.scheduler
            boolean r1 = r1.disposed
            if (r1 != 0) goto L0
            java.lang.Runnable r0 = r0.run
            r0.run()
            goto L0
        L32:
            r6.time = r7
            return
    }

    public void advanceTimeBy(long r3, java.util.concurrent.TimeUnit r5) {
            r2 = this;
            long r0 = r2.time
            long r3 = r5.toNanos(r3)
            long r0 = r0 + r3
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.NANOSECONDS
            r2.advanceTimeTo(r0, r3)
            return
    }

    public void advanceTimeTo(long r1, java.util.concurrent.TimeUnit r3) {
            r0 = this;
            long r1 = r3.toNanos(r1)
            r0.triggerActions(r1)
            return
    }

    @Override // io.reactivex.Scheduler
    public io.reactivex.Scheduler.Worker createWorker() {
            r1 = this;
            io.reactivex.schedulers.TestScheduler$TestWorker r0 = new io.reactivex.schedulers.TestScheduler$TestWorker
            r0.<init>(r1)
            return r0
    }

    @Override // io.reactivex.Scheduler
    public long now(java.util.concurrent.TimeUnit r4) {
            r3 = this;
            long r0 = r3.time
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = r4.convert(r0, r2)
            return r0
    }

    public void triggerActions() {
            r2 = this;
            long r0 = r2.time
            r2.triggerActions(r0)
            return
    }
}
