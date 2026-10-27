package io.reactivex.internal.operators.observable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ObservableTakeLastTimed<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final int bufferSize;
    final long count;
    final boolean delayError;
    final io.reactivex.Scheduler scheduler;
    final long time;
    final java.util.concurrent.TimeUnit unit;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class TakeLastTimedObserver<T> extends java.util.concurrent.atomic.AtomicBoolean implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -5677354903406201275L;
        final io.reactivex.Observer<? super T> actual;
        volatile boolean cancelled;
        final long count;
        io.reactivex.disposables.Disposable d;
        final boolean delayError;
        volatile boolean done;
        java.lang.Throwable error;
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> queue;
        final io.reactivex.Scheduler scheduler;
        final long time;
        final java.util.concurrent.TimeUnit unit;

        TakeLastTimedObserver(io.reactivex.Observer<? super T> r1, long r2, long r4, java.util.concurrent.TimeUnit r6, io.reactivex.Scheduler r7, int r8, boolean r9) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.count = r2
                r0.time = r4
                r0.unit = r6
                r0.scheduler = r7
                io.reactivex.internal.queue.SpscLinkedArrayQueue r1 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
                r1.<init>(r8)
                r0.queue = r1
                r0.delayError = r9
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r2 = this;
                boolean r0 = r2.cancelled
                if (r0 != 0) goto L18
                r0 = 1
                r2.cancelled = r0
                io.reactivex.disposables.Disposable r1 = r2.d
                r1.dispose()
                r1 = 0
                boolean r0 = r2.compareAndSet(r1, r0)
                if (r0 == 0) goto L18
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r0 = r2.queue
                r0.clear()
            L18:
                return
        }

        void drain() {
                r11 = this;
                r0 = 0
                r1 = 1
                boolean r0 = r11.compareAndSet(r0, r1)
                if (r0 != 0) goto L9
                return
            L9:
                io.reactivex.Observer<? super T> r0 = r11.actual
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r1 = r11.queue
                boolean r2 = r11.delayError
            Lf:
                boolean r3 = r11.cancelled
                if (r3 == 0) goto L17
                r1.clear()
                return
            L17:
                if (r2 != 0) goto L24
                java.lang.Throwable r3 = r11.error
                if (r3 == 0) goto L24
                r1.clear()
                r0.onError(r3)
                return
            L24:
                java.lang.Object r3 = r1.poll()
                if (r3 != 0) goto L36
                java.lang.Throwable r1 = r11.error
                if (r1 == 0) goto L32
                r0.onError(r1)
                return
            L32:
                r0.onComplete()
                return
            L36:
                java.lang.Object r4 = r1.poll()
                java.lang.Long r3 = (java.lang.Long) r3
                long r5 = r3.longValue()
                io.reactivex.Scheduler r3 = r11.scheduler
                java.util.concurrent.TimeUnit r7 = r11.unit
                long r7 = r3.now(r7)
                long r9 = r11.time
                long r7 = r7 - r9
                int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r3 >= 0) goto L50
                goto Lf
            L50:
                r0.onNext(r4)
                goto Lf
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                boolean r0 = r1.cancelled
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r1 = this;
                r0 = 1
                r1.done = r0
                r1.drain()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r1) {
                r0 = this;
                r0.error = r1
                r1 = 1
                r0.done = r1
                r0.drain()
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r15) {
                r14 = this;
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r0 = r14.queue
                io.reactivex.Scheduler r1 = r14.scheduler
                java.util.concurrent.TimeUnit r2 = r14.unit
                long r1 = r1.now(r2)
                long r3 = r14.time
                long r5 = r14.count
                r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r9 = 1
                int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r10 != 0) goto L1a
                r7 = 1
                goto L1b
            L1a:
                r7 = 0
            L1b:
                java.lang.Long r8 = java.lang.Long.valueOf(r1)
                r0.offer(r8, r15)
            L22:
                boolean r15 = r0.isEmpty()
                if (r15 != 0) goto L4b
                java.lang.Object r15 = r0.peek()
                java.lang.Long r15 = (java.lang.Long) r15
                long r10 = r15.longValue()
                long r12 = r1 - r3
                int r15 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r15 <= 0) goto L44
                if (r7 != 0) goto L4b
                int r15 = r0.size()
                int r15 = r15 >> r9
                long r10 = (long) r15
                int r15 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
                if (r15 <= 0) goto L4b
            L44:
                r0.poll()
                r0.poll()
                goto L22
            L4b:
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.d
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.d = r2
                io.reactivex.Observer<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }
    }

    public ObservableTakeLastTimed(io.reactivex.ObservableSource<T> r1, long r2, long r4, java.util.concurrent.TimeUnit r6, io.reactivex.Scheduler r7, int r8, boolean r9) {
            r0 = this;
            r0.<init>(r1)
            r0.count = r2
            r0.time = r4
            r0.unit = r6
            r0.scheduler = r7
            r0.bufferSize = r8
            r0.delayError = r9
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> r12) {
            r11 = this;
            io.reactivex.ObservableSource<T> r0 = r11.source
            io.reactivex.internal.operators.observable.ObservableTakeLastTimed$TakeLastTimedObserver r1 = new io.reactivex.internal.operators.observable.ObservableTakeLastTimed$TakeLastTimedObserver
            long r3 = r11.count
            long r5 = r11.time
            java.util.concurrent.TimeUnit r7 = r11.unit
            io.reactivex.Scheduler r8 = r11.scheduler
            int r9 = r11.bufferSize
            boolean r10 = r11.delayError
            r2 = r12
            r1.<init>(r2, r3, r5, r7, r8, r9, r10)
            r0.subscribe(r1)
            return
    }
}
