package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class BlockingFlowableIterable<T> implements java.lang.Iterable<T> {
    final int bufferSize;
    final org.reactivestreams.Publisher<? extends T> source;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class BlockingFlowableIterator<T> extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements org.reactivestreams.Subscriber<T>, java.util.Iterator<T>, java.lang.Runnable, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 6695226475494099826L;
        final long batchSize;
        final java.util.concurrent.locks.Condition condition;
        volatile boolean done;
        java.lang.Throwable error;
        final long limit;
        final java.util.concurrent.locks.Lock lock;
        long produced;
        final io.reactivex.internal.queue.SpscArrayQueue<T> queue;

        BlockingFlowableIterator(int r3) {
                r2 = this;
                r2.<init>()
                io.reactivex.internal.queue.SpscArrayQueue r0 = new io.reactivex.internal.queue.SpscArrayQueue
                r0.<init>(r3)
                r2.queue = r0
                long r0 = (long) r3
                r2.batchSize = r0
                int r0 = r3 >> 2
                int r3 = r3 - r0
                long r0 = (long) r3
                r2.limit = r0
                java.util.concurrent.locks.ReentrantLock r3 = new java.util.concurrent.locks.ReentrantLock
                r3.<init>()
                r2.lock = r3
                java.util.concurrent.locks.Condition r3 = r3.newCondition()
                r2.condition = r3
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r0 = this;
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
            L0:
                boolean r0 = r2.done
                io.reactivex.internal.queue.SpscArrayQueue<T> r1 = r2.queue
                boolean r1 = r1.isEmpty()
                if (r0 == 0) goto L17
                java.lang.Throwable r0 = r2.error
                if (r0 != 0) goto L12
                if (r1 == 0) goto L17
                r0 = 0
                return r0
            L12:
                java.lang.RuntimeException r0 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r0)
                throw r0
            L17:
                if (r1 == 0) goto L48
                java.util.concurrent.locks.Lock r0 = r2.lock
                r0.lock()
            L1e:
                boolean r0 = r2.done     // Catch: java.lang.Throwable -> L30 java.lang.InterruptedException -> L32
                if (r0 != 0) goto L34
                io.reactivex.internal.queue.SpscArrayQueue<T> r0 = r2.queue     // Catch: java.lang.Throwable -> L30 java.lang.InterruptedException -> L32
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L30 java.lang.InterruptedException -> L32
                if (r0 == 0) goto L34
                java.util.concurrent.locks.Condition r0 = r2.condition     // Catch: java.lang.Throwable -> L30 java.lang.InterruptedException -> L32
                r0.await()     // Catch: java.lang.Throwable -> L30 java.lang.InterruptedException -> L32
                goto L1e
            L30:
                r0 = move-exception
                goto L42
            L32:
                r0 = move-exception
                goto L3a
            L34:
                java.util.concurrent.locks.Lock r0 = r2.lock
                r0.unlock()
                goto L0
            L3a:
                r2.run()     // Catch: java.lang.Throwable -> L30
                java.lang.RuntimeException r0 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r0)     // Catch: java.lang.Throwable -> L30
                throw r0     // Catch: java.lang.Throwable -> L30
            L42:
                java.util.concurrent.locks.Lock r1 = r2.lock
                r1.unlock()
                throw r0
            L48:
                r0 = 1
                return r0
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                java.lang.Object r0 = r1.get()
                org.reactivestreams.Subscription r0 = (org.reactivestreams.Subscription) r0
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.isCancelled(r0)
                return r0
        }

        @Override // java.util.Iterator
        public T next() {
                r6 = this;
                boolean r0 = r6.hasNext()
                if (r0 == 0) goto L28
                io.reactivex.internal.queue.SpscArrayQueue<T> r0 = r6.queue
                java.lang.Object r0 = r0.poll()
                long r1 = r6.produced
                r3 = 1
                long r1 = r1 + r3
                long r3 = r6.limit
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 != 0) goto L25
                r3 = 0
                r6.produced = r3
                java.lang.Object r3 = r6.get()
                org.reactivestreams.Subscription r3 = (org.reactivestreams.Subscription) r3
                r3.request(r1)
                return r0
            L25:
                r6.produced = r1
                return r0
            L28:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        public void onComplete() {
                r1 = this;
                r0 = 1
                r1.done = r0
                r1.signalConsumer()
                return
        }

        public void onError(java.lang.Throwable r1) {
                r0 = this;
                r0.error = r1
                r1 = 1
                r0.done = r1
                r0.signalConsumer()
                return
        }

        public void onNext(T r2) {
                r1 = this;
                io.reactivex.internal.queue.SpscArrayQueue<T> r0 = r1.queue
                boolean r2 = r0.offer(r2)
                if (r2 != 0) goto L16
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r1)
                io.reactivex.exceptions.MissingBackpressureException r2 = new io.reactivex.exceptions.MissingBackpressureException
                java.lang.String r0 = "Queue full?!"
                r2.<init>(r0)
                r1.onError(r2)
                return
            L16:
                r1.signalConsumer()
                return
        }

        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(r2, r3)
                if (r0 == 0) goto Lb
                long r0 = r2.batchSize
                r3.request(r0)
            Lb:
                return
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "remove"
                r0.<init>(r1)
                throw r0
        }

        @Override // java.lang.Runnable
        public void run() {
                r0 = this;
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                r0.signalConsumer()
                return
        }

        void signalConsumer() {
                r2 = this;
                java.util.concurrent.locks.Lock r0 = r2.lock
                r0.lock()
                java.util.concurrent.locks.Condition r0 = r2.condition     // Catch: java.lang.Throwable -> L10
                r0.signalAll()     // Catch: java.lang.Throwable -> L10
                java.util.concurrent.locks.Lock r0 = r2.lock
                r0.unlock()
                return
            L10:
                r0 = move-exception
                java.util.concurrent.locks.Lock r1 = r2.lock
                r1.unlock()
                throw r0
        }
    }

    public BlockingFlowableIterable(org.reactivestreams.Publisher<? extends T> r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.bufferSize = r2
            return
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<T> iterator() {
            r2 = this;
            io.reactivex.internal.operators.flowable.BlockingFlowableIterable$BlockingFlowableIterator r0 = new io.reactivex.internal.operators.flowable.BlockingFlowableIterable$BlockingFlowableIterator
            int r1 = r2.bufferSize
            r0.<init>(r1)
            org.reactivestreams.Publisher<? extends T> r1 = r2.source
            r1.subscribe(r0)
            return r0
    }
}
