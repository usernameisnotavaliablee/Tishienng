package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class BlockingFlowableNext<T> implements java.lang.Iterable<T> {
    final org.reactivestreams.Publisher<? extends T> source;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class NextIterator<T> implements java.util.Iterator<T> {
        private java.lang.Throwable error;
        private boolean hasNext;
        private boolean isNextConsumed;
        private final org.reactivestreams.Publisher<? extends T> items;
        private T next;
        private final io.reactivex.internal.operators.flowable.BlockingFlowableNext.NextSubscriber<T> observer;
        private boolean started;

        NextIterator(org.reactivestreams.Publisher<? extends T> r2, io.reactivex.internal.operators.flowable.BlockingFlowableNext.NextSubscriber<T> r3) {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.hasNext = r0
                r1.isNextConsumed = r0
                r1.items = r2
                r1.observer = r3
                return
        }

        private boolean moveToNext() {
                r4 = this;
                boolean r0 = r4.started     // Catch: java.lang.InterruptedException -> L1c
                r1 = 1
                if (r0 != 0) goto L1e
                r4.started = r1     // Catch: java.lang.InterruptedException -> L1c
                io.reactivex.internal.operators.flowable.BlockingFlowableNext$NextSubscriber<T> r0 = r4.observer     // Catch: java.lang.InterruptedException -> L1c
                r0.setWaiting()     // Catch: java.lang.InterruptedException -> L1c
                org.reactivestreams.Publisher<? extends T> r0 = r4.items     // Catch: java.lang.InterruptedException -> L1c
                io.reactivex.Flowable r0 = io.reactivex.Flowable.fromPublisher(r0)     // Catch: java.lang.InterruptedException -> L1c
                io.reactivex.Flowable r0 = r0.materialize()     // Catch: java.lang.InterruptedException -> L1c
                io.reactivex.internal.operators.flowable.BlockingFlowableNext$NextSubscriber<T> r2 = r4.observer     // Catch: java.lang.InterruptedException -> L1c
                r0.subscribe(r2)     // Catch: java.lang.InterruptedException -> L1c
                goto L1e
            L1c:
                r0 = move-exception
                goto L56
            L1e:
                io.reactivex.internal.operators.flowable.BlockingFlowableNext$NextSubscriber<T> r0 = r4.observer     // Catch: java.lang.InterruptedException -> L1c
                io.reactivex.Notification r0 = r0.takeNext()     // Catch: java.lang.InterruptedException -> L1c
                boolean r2 = r0.isOnNext()     // Catch: java.lang.InterruptedException -> L1c
                r3 = 0
                if (r2 == 0) goto L34
                r4.isNextConsumed = r3     // Catch: java.lang.InterruptedException -> L1c
                java.lang.Object r0 = r0.getValue()     // Catch: java.lang.InterruptedException -> L1c
                r4.next = r0     // Catch: java.lang.InterruptedException -> L1c
                return r1
            L34:
                r4.hasNext = r3     // Catch: java.lang.InterruptedException -> L1c
                boolean r1 = r0.isOnComplete()     // Catch: java.lang.InterruptedException -> L1c
                if (r1 == 0) goto L3d
                return r3
            L3d:
                boolean r1 = r0.isOnError()     // Catch: java.lang.InterruptedException -> L1c
                if (r1 == 0) goto L4e
                java.lang.Throwable r0 = r0.getError()     // Catch: java.lang.InterruptedException -> L1c
                r4.error = r0     // Catch: java.lang.InterruptedException -> L1c
                java.lang.RuntimeException r0 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r0)     // Catch: java.lang.InterruptedException -> L1c
                throw r0     // Catch: java.lang.InterruptedException -> L1c
            L4e:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.InterruptedException -> L1c
                java.lang.String r1 = "Should not reach here"
                r0.<init>(r1)     // Catch: java.lang.InterruptedException -> L1c
                throw r0     // Catch: java.lang.InterruptedException -> L1c
            L56:
                io.reactivex.internal.operators.flowable.BlockingFlowableNext$NextSubscriber<T> r1 = r4.observer
                r1.dispose()
                r4.error = r0
                java.lang.RuntimeException r0 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r0)
                throw r0
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                java.lang.Throwable r0 = r2.error
                if (r0 != 0) goto L18
                boolean r0 = r2.hasNext
                r1 = 0
                if (r0 != 0) goto La
                return r1
            La:
                boolean r0 = r2.isNextConsumed
                if (r0 == 0) goto L16
                boolean r0 = r2.moveToNext()
                if (r0 == 0) goto L15
                goto L16
            L15:
                return r1
            L16:
                r0 = 1
                return r0
            L18:
                java.lang.RuntimeException r0 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r0)
                throw r0
        }

        @Override // java.util.Iterator
        public T next() {
                r2 = this;
                java.lang.Throwable r0 = r2.error
                if (r0 != 0) goto L18
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L10
                r0 = 1
                r2.isNextConsumed = r0
                T r0 = r2.next
                return r0
            L10:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                java.lang.String r1 = "No more elements"
                r0.<init>(r1)
                throw r0
            L18:
                java.lang.RuntimeException r0 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r0)
                throw r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Read only iterator"
                r0.<init>(r1)
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class NextSubscriber<T> extends io.reactivex.subscribers.DisposableSubscriber<io.reactivex.Notification<T>> {
        private final java.util.concurrent.BlockingQueue<io.reactivex.Notification<T>> buf;
        final java.util.concurrent.atomic.AtomicInteger waiting;

        NextSubscriber() {
                r2 = this;
                r2.<init>()
                java.util.concurrent.ArrayBlockingQueue r0 = new java.util.concurrent.ArrayBlockingQueue
                r1 = 1
                r0.<init>(r1)
                r2.buf = r0
                java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
                r0.<init>()
                r2.waiting = r0
                return
        }

        public void onComplete() {
                r0 = this;
                return
        }

        public void onError(java.lang.Throwable r1) {
                r0 = this;
                io.reactivex.plugins.RxJavaPlugins.onError(r1)
                return
        }

        public void onNext(io.reactivex.Notification<T> r3) {
                r2 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r2.waiting
                r1 = 0
                int r0 = r0.getAndSet(r1)
                r1 = 1
                if (r0 == r1) goto L10
                boolean r0 = r3.isOnNext()
                if (r0 != 0) goto L2a
            L10:
                java.util.concurrent.BlockingQueue<io.reactivex.Notification<T>> r0 = r2.buf
                boolean r0 = r0.offer(r3)
                if (r0 != 0) goto L2a
                java.util.concurrent.BlockingQueue<io.reactivex.Notification<T>> r0 = r2.buf
                java.lang.Object r0 = r0.poll()
                io.reactivex.Notification r0 = (io.reactivex.Notification) r0
                if (r0 == 0) goto L10
                boolean r1 = r0.isOnNext()
                if (r1 != 0) goto L10
                r3 = r0
                goto L10
            L2a:
                return
        }

        public /* bridge */ /* synthetic */ void onNext(java.lang.Object r1) {
                r0 = this;
                io.reactivex.Notification r1 = (io.reactivex.Notification) r1
                r0.onNext(r1)
                return
        }

        void setWaiting() {
                r2 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r2.waiting
                r1 = 1
                r0.set(r1)
                return
        }

        public io.reactivex.Notification<T> takeNext() throws java.lang.InterruptedException {
                r1 = this;
                r1.setWaiting()
                java.util.concurrent.BlockingQueue<io.reactivex.Notification<T>> r0 = r1.buf
                java.lang.Object r0 = r0.take()
                io.reactivex.Notification r0 = (io.reactivex.Notification) r0
                return r0
        }
    }

    public BlockingFlowableNext(org.reactivestreams.Publisher<? extends T> r1) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            return
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<T> iterator() {
            r3 = this;
            io.reactivex.internal.operators.flowable.BlockingFlowableNext$NextSubscriber r0 = new io.reactivex.internal.operators.flowable.BlockingFlowableNext$NextSubscriber
            r0.<init>()
            io.reactivex.internal.operators.flowable.BlockingFlowableNext$NextIterator r1 = new io.reactivex.internal.operators.flowable.BlockingFlowableNext$NextIterator
            org.reactivestreams.Publisher<? extends T> r2 = r3.source
            r1.<init>(r2, r0)
            return r1
    }
}
