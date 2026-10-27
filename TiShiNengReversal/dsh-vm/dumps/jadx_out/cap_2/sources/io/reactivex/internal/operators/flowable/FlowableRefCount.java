package io.reactivex.internal.operators.flowable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowableRefCount<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    volatile io.reactivex.disposables.CompositeDisposable baseDisposable;
    final java.util.concurrent.locks.ReentrantLock lock;
    final io.reactivex.flowables.ConnectableFlowable<? extends T> source;
    final java.util.concurrent.atomic.AtomicInteger subscriptionCount;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class ConnectionSubscriber extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements org.reactivestreams.Subscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = 152064694420235350L;
        final io.reactivex.disposables.CompositeDisposable currentBase;
        final java.util.concurrent.atomic.AtomicLong requested;
        final io.reactivex.disposables.Disposable resource;
        final org.reactivestreams.Subscriber<? super T> subscriber;
        final /* synthetic */ io.reactivex.internal.operators.flowable.FlowableRefCount this$0;

        ConnectionSubscriber(io.reactivex.internal.operators.flowable.FlowableRefCount r1, org.reactivestreams.Subscriber<? super T> r2, io.reactivex.disposables.CompositeDisposable r3, io.reactivex.disposables.Disposable r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.subscriber = r2
                r0.currentBase = r3
                r0.resource = r4
                java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
                r1.<init>()
                r0.requested = r1
                return
        }

        public void cancel() {
                r1 = this;
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r1)
                io.reactivex.disposables.Disposable r0 = r1.resource
                r0.dispose()
                return
        }

        void cleanup() {
                r2 = this;
                io.reactivex.internal.operators.flowable.FlowableRefCount r0 = r2.this$0
                java.util.concurrent.locks.ReentrantLock r0 = r0.lock
                r0.lock()
                io.reactivex.internal.operators.flowable.FlowableRefCount r0 = r2.this$0     // Catch: java.lang.Throwable -> L28
                io.reactivex.disposables.CompositeDisposable r0 = r0.baseDisposable     // Catch: java.lang.Throwable -> L28
                io.reactivex.disposables.CompositeDisposable r1 = r2.currentBase     // Catch: java.lang.Throwable -> L28
                if (r0 != r1) goto L2a
                io.reactivex.internal.operators.flowable.FlowableRefCount r0 = r2.this$0     // Catch: java.lang.Throwable -> L28
                io.reactivex.disposables.CompositeDisposable r0 = r0.baseDisposable     // Catch: java.lang.Throwable -> L28
                r0.dispose()     // Catch: java.lang.Throwable -> L28
                io.reactivex.internal.operators.flowable.FlowableRefCount r0 = r2.this$0     // Catch: java.lang.Throwable -> L28
                io.reactivex.disposables.CompositeDisposable r1 = new io.reactivex.disposables.CompositeDisposable     // Catch: java.lang.Throwable -> L28
                r1.<init>()     // Catch: java.lang.Throwable -> L28
                r0.baseDisposable = r1     // Catch: java.lang.Throwable -> L28
                io.reactivex.internal.operators.flowable.FlowableRefCount r0 = r2.this$0     // Catch: java.lang.Throwable -> L28
                java.util.concurrent.atomic.AtomicInteger r0 = r0.subscriptionCount     // Catch: java.lang.Throwable -> L28
                r1 = 0
                r0.set(r1)     // Catch: java.lang.Throwable -> L28
                goto L2a
            L28:
                r0 = move-exception
                goto L32
            L2a:
                io.reactivex.internal.operators.flowable.FlowableRefCount r0 = r2.this$0
                java.util.concurrent.locks.ReentrantLock r0 = r0.lock
                r0.unlock()
                return
            L32:
                io.reactivex.internal.operators.flowable.FlowableRefCount r1 = r2.this$0
                java.util.concurrent.locks.ReentrantLock r1 = r1.lock
                r1.unlock()
                throw r0
        }

        public void onComplete() {
                r1 = this;
                r1.cleanup()
                org.reactivestreams.Subscriber<? super T> r0 = r1.subscriber
                r0.onComplete()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                r1.cleanup()
                org.reactivestreams.Subscriber<? super T> r0 = r1.subscriber
                r0.onError(r2)
                return
        }

        public void onNext(T r2) {
                r1 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r1.subscriber
                r0.onNext(r2)
                return
        }

        public void onSubscribe(org.reactivestreams.Subscription r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicLong r0 = r1.requested
                io.reactivex.internal.subscriptions.SubscriptionHelper.deferredSetOnce(r1, r0, r2)
                return
        }

        public void request(long r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicLong r0 = r1.requested
                io.reactivex.internal.subscriptions.SubscriptionHelper.deferredRequest(r1, r0, r2)
                return
        }
    }

    public FlowableRefCount(io.reactivex.flowables.ConnectableFlowable<T> r2) {
            r1 = this;
            r1.<init>(r2)
            io.reactivex.disposables.CompositeDisposable r0 = new io.reactivex.disposables.CompositeDisposable
            r0.<init>()
            r1.baseDisposable = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            r1.subscriptionCount = r0
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            r1.lock = r0
            r1.source = r2
            return
    }

    private io.reactivex.disposables.Disposable disconnect(io.reactivex.disposables.CompositeDisposable r2) {
            r1 = this;
            io.reactivex.internal.operators.flowable.FlowableRefCount$2 r0 = new io.reactivex.internal.operators.flowable.FlowableRefCount$2
            r0.<init>(r1, r2)
            io.reactivex.disposables.Disposable r2 = io.reactivex.disposables.Disposables.fromRunnable(r0)
            return r2
    }

    private io.reactivex.functions.Consumer<io.reactivex.disposables.Disposable> onSubscribe(org.reactivestreams.Subscriber<? super T> r2, java.util.concurrent.atomic.AtomicBoolean r3) {
            r1 = this;
            io.reactivex.internal.operators.flowable.FlowableRefCount$1 r0 = new io.reactivex.internal.operators.flowable.FlowableRefCount$1
            r0.<init>(r1, r2, r3)
            return r0
    }

    void doSubscribe(org.reactivestreams.Subscriber<? super T> r3, io.reactivex.disposables.CompositeDisposable r4) {
            r2 = this;
            io.reactivex.disposables.Disposable r0 = r2.disconnect(r4)
            io.reactivex.internal.operators.flowable.FlowableRefCount$ConnectionSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableRefCount$ConnectionSubscriber
            r1.<init>(r2, r3, r4, r0)
            r3.onSubscribe(r1)
            io.reactivex.flowables.ConnectableFlowable<? extends T> r3 = r2.source
            r3.subscribe(r1)
            return
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super T> r3) {
            r2 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r2.lock
            r0.lock()
            java.util.concurrent.atomic.AtomicInteger r0 = r2.subscriptionCount
            int r0 = r0.incrementAndGet()
            r1 = 1
            if (r0 != r1) goto L35
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            io.reactivex.flowables.ConnectableFlowable<? extends T> r1 = r2.source     // Catch: java.lang.Throwable -> L28
            io.reactivex.functions.Consumer r3 = r2.onSubscribe(r3, r0)     // Catch: java.lang.Throwable -> L28
            r1.connect(r3)     // Catch: java.lang.Throwable -> L28
            boolean r3 = r0.get()
            if (r3 == 0) goto L27
            java.util.concurrent.locks.ReentrantLock r3 = r2.lock
            r3.unlock()
        L27:
            return
        L28:
            r3 = move-exception
            boolean r0 = r0.get()
            if (r0 == 0) goto L34
            java.util.concurrent.locks.ReentrantLock r0 = r2.lock
            r0.unlock()
        L34:
            throw r3
        L35:
            io.reactivex.disposables.CompositeDisposable r0 = r2.baseDisposable     // Catch: java.lang.Throwable -> L40
            r2.doSubscribe(r3, r0)     // Catch: java.lang.Throwable -> L40
            java.util.concurrent.locks.ReentrantLock r3 = r2.lock
            r3.unlock()
            return
        L40:
            r3 = move-exception
            java.util.concurrent.locks.ReentrantLock r0 = r2.lock
            r0.unlock()
            throw r3
    }
}
