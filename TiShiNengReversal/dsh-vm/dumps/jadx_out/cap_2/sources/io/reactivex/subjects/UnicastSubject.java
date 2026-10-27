package io.reactivex.subjects;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class UnicastSubject<T> extends io.reactivex.subjects.Subject<T> {
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.Observer<? super T>> actual;
    volatile boolean disposed;
    volatile boolean done;
    boolean enableOperatorFusion;
    java.lang.Throwable error;
    final java.util.concurrent.atomic.AtomicReference<java.lang.Runnable> onTerminate;
    final java.util.concurrent.atomic.AtomicBoolean once;
    final io.reactivex.internal.queue.SpscLinkedArrayQueue<T> queue;
    final io.reactivex.internal.observers.BasicIntQueueDisposable<T> wip;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class UnicastQueueDisposable extends io.reactivex.internal.observers.BasicIntQueueDisposable<T> {
        private static final long serialVersionUID = 7926949470189395511L;
        final /* synthetic */ io.reactivex.subjects.UnicastSubject this$0;

        UnicastQueueDisposable(io.reactivex.subjects.UnicastSubject r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
                r1 = this;
                io.reactivex.subjects.UnicastSubject r0 = r1.this$0
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r0 = r0.queue
                r0.clear()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r2 = this;
                io.reactivex.subjects.UnicastSubject r0 = r2.this$0
                boolean r0 = r0.disposed
                if (r0 != 0) goto L30
                io.reactivex.subjects.UnicastSubject r0 = r2.this$0
                r1 = 1
                r0.disposed = r1
                io.reactivex.subjects.UnicastSubject r0 = r2.this$0
                r0.doTerminate()
                io.reactivex.subjects.UnicastSubject r0 = r2.this$0
                java.util.concurrent.atomic.AtomicReference<io.reactivex.Observer<? super T>> r0 = r0.actual
                r1 = 0
                r0.lazySet(r1)
                io.reactivex.subjects.UnicastSubject r0 = r2.this$0
                io.reactivex.internal.observers.BasicIntQueueDisposable<T> r0 = r0.wip
                int r0 = r0.getAndIncrement()
                if (r0 != 0) goto L30
                io.reactivex.subjects.UnicastSubject r0 = r2.this$0
                java.util.concurrent.atomic.AtomicReference<io.reactivex.Observer<? super T>> r0 = r0.actual
                r0.lazySet(r1)
                io.reactivex.subjects.UnicastSubject r0 = r2.this$0
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r0 = r0.queue
                r0.clear()
            L30:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.subjects.UnicastSubject r0 = r1.this$0
                boolean r0 = r0.disposed
                return r0
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
                r1 = this;
                io.reactivex.subjects.UnicastSubject r0 = r1.this$0
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r0 = r0.queue
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public T poll() throws java.lang.Exception {
                r1 = this;
                io.reactivex.subjects.UnicastSubject r0 = r1.this$0
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r0 = r0.queue
                java.lang.Object r0 = r0.poll()
                return r0
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int r3) {
                r2 = this;
                r0 = 2
                r3 = r3 & r0
                if (r3 == 0) goto La
                io.reactivex.subjects.UnicastSubject r3 = r2.this$0
                r1 = 1
                r3.enableOperatorFusion = r1
                return r0
            La:
                r3 = 0
                return r3
        }
    }

    UnicastSubject(int r3) {
            r2 = this;
            r2.<init>()
            io.reactivex.internal.queue.SpscLinkedArrayQueue r0 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
            java.lang.String r1 = "capacityHint"
            int r3 = io.reactivex.internal.functions.ObjectHelper.verifyPositive(r3, r1)
            r0.<init>(r3)
            r2.queue = r0
            java.util.concurrent.atomic.AtomicReference r3 = new java.util.concurrent.atomic.AtomicReference
            r3.<init>()
            r2.onTerminate = r3
            java.util.concurrent.atomic.AtomicReference r3 = new java.util.concurrent.atomic.AtomicReference
            r3.<init>()
            r2.actual = r3
            java.util.concurrent.atomic.AtomicBoolean r3 = new java.util.concurrent.atomic.AtomicBoolean
            r3.<init>()
            r2.once = r3
            io.reactivex.subjects.UnicastSubject$UnicastQueueDisposable r3 = new io.reactivex.subjects.UnicastSubject$UnicastQueueDisposable
            r3.<init>(r2)
            r2.wip = r3
            return
    }

    UnicastSubject(int r3, java.lang.Runnable r4) {
            r2 = this;
            r2.<init>()
            io.reactivex.internal.queue.SpscLinkedArrayQueue r0 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
            java.lang.String r1 = "capacityHint"
            int r3 = io.reactivex.internal.functions.ObjectHelper.verifyPositive(r3, r1)
            r0.<init>(r3)
            r2.queue = r0
            java.util.concurrent.atomic.AtomicReference r3 = new java.util.concurrent.atomic.AtomicReference
            java.lang.String r0 = "onTerminate"
            java.lang.Object r4 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            r3.<init>(r4)
            r2.onTerminate = r3
            java.util.concurrent.atomic.AtomicReference r3 = new java.util.concurrent.atomic.AtomicReference
            r3.<init>()
            r2.actual = r3
            java.util.concurrent.atomic.AtomicBoolean r3 = new java.util.concurrent.atomic.AtomicBoolean
            r3.<init>()
            r2.once = r3
            io.reactivex.subjects.UnicastSubject$UnicastQueueDisposable r3 = new io.reactivex.subjects.UnicastSubject$UnicastQueueDisposable
            r3.<init>(r2)
            r2.wip = r3
            return
    }

    public static <T> io.reactivex.subjects.UnicastSubject<T> create() {
            io.reactivex.subjects.UnicastSubject r0 = new io.reactivex.subjects.UnicastSubject
            int r1 = io.reactivex.Observable.bufferSize()
            r0.<init>(r1)
            return r0
    }

    public static <T> io.reactivex.subjects.UnicastSubject<T> create(int r1) {
            io.reactivex.subjects.UnicastSubject r0 = new io.reactivex.subjects.UnicastSubject
            r0.<init>(r1)
            return r0
    }

    public static <T> io.reactivex.subjects.UnicastSubject<T> create(int r1, java.lang.Runnable r2) {
            io.reactivex.subjects.UnicastSubject r0 = new io.reactivex.subjects.UnicastSubject
            r0.<init>(r1, r2)
            return r0
    }

    void doTerminate() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReference<java.lang.Runnable> r0 = r3.onTerminate
            java.lang.Object r0 = r0.get()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            if (r0 == 0) goto L16
            java.util.concurrent.atomic.AtomicReference<java.lang.Runnable> r1 = r3.onTerminate
            r2 = 0
            boolean r1 = androidx.camera.view.p.a(r1, r0, r2)
            if (r1 == 0) goto L16
            r0.run()
        L16:
            return
    }

    void drain() {
            r2 = this;
            io.reactivex.internal.observers.BasicIntQueueDisposable<T> r0 = r2.wip
            int r0 = r0.getAndIncrement()
            if (r0 == 0) goto L9
            goto L29
        L9:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.Observer<? super T>> r0 = r2.actual
            java.lang.Object r0 = r0.get()
            io.reactivex.Observer r0 = (io.reactivex.Observer) r0
            r1 = 1
        L12:
            if (r0 == 0) goto L20
            boolean r1 = r2.enableOperatorFusion
            if (r1 == 0) goto L1c
            r2.drainFused(r0)
            return
        L1c:
            r2.drainNormal(r0)
            return
        L20:
            io.reactivex.internal.observers.BasicIntQueueDisposable<T> r0 = r2.wip
            int r1 = -r1
            int r1 = r0.addAndGet(r1)
            if (r1 != 0) goto L2a
        L29:
            return
        L2a:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.Observer<? super T>> r0 = r2.actual
            java.lang.Object r0 = r0.get()
            io.reactivex.Observer r0 = (io.reactivex.Observer) r0
            goto L12
    }

    void drainFused(io.reactivex.Observer<? super T> r5) {
            r4 = this;
            io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r0 = r4.queue
            r1 = 1
        L3:
            boolean r2 = r4.disposed
            r3 = 0
            if (r2 == 0) goto L11
            java.util.concurrent.atomic.AtomicReference<io.reactivex.Observer<? super T>> r5 = r4.actual
            r5.lazySet(r3)
            r0.clear()
            return
        L11:
            boolean r2 = r4.done
            r5.onNext(r3)
            if (r2 == 0) goto L29
            java.util.concurrent.atomic.AtomicReference<io.reactivex.Observer<? super T>> r0 = r4.actual
            r0.lazySet(r3)
            java.lang.Throwable r0 = r4.error
            if (r0 == 0) goto L25
            r5.onError(r0)
            return
        L25:
            r5.onComplete()
            return
        L29:
            io.reactivex.internal.observers.BasicIntQueueDisposable<T> r2 = r4.wip
            int r1 = -r1
            int r1 = r2.addAndGet(r1)
            if (r1 != 0) goto L3
            return
    }

    void drainNormal(io.reactivex.Observer<? super T> r8) {
            r7 = this;
            io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r0 = r7.queue
            r1 = 1
            r2 = 1
        L4:
            boolean r3 = r7.disposed
            r4 = 0
            if (r3 == 0) goto L12
            java.util.concurrent.atomic.AtomicReference<io.reactivex.Observer<? super T>> r8 = r7.actual
            r8.lazySet(r4)
            r0.clear()
            return
        L12:
            boolean r3 = r7.done
            io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r5 = r7.queue
            java.lang.Object r5 = r5.poll()
            if (r5 != 0) goto L1e
            r6 = 1
            goto L1f
        L1e:
            r6 = 0
        L1f:
            if (r3 == 0) goto L34
            if (r6 == 0) goto L34
            java.util.concurrent.atomic.AtomicReference<io.reactivex.Observer<? super T>> r0 = r7.actual
            r0.lazySet(r4)
            java.lang.Throwable r0 = r7.error
            if (r0 == 0) goto L30
            r8.onError(r0)
            return
        L30:
            r8.onComplete()
            return
        L34:
            if (r6 == 0) goto L40
            io.reactivex.internal.observers.BasicIntQueueDisposable<T> r3 = r7.wip
            int r2 = -r2
            int r2 = r3.addAndGet(r2)
            if (r2 != 0) goto L4
            return
        L40:
            r8.onNext(r5)
            goto L4
    }

    @Override // io.reactivex.subjects.Subject
    public java.lang.Throwable getThrowable() {
            r1 = this;
            boolean r0 = r1.done
            if (r0 == 0) goto L7
            java.lang.Throwable r0 = r1.error
            return r0
        L7:
            r0 = 0
            return r0
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasComplete() {
            r1 = this;
            boolean r0 = r1.done
            if (r0 == 0) goto La
            java.lang.Throwable r0 = r1.error
            if (r0 != 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasObservers() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.Observer<? super T>> r0 = r1.actual
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasThrowable() {
            r1 = this;
            boolean r0 = r1.done
            if (r0 == 0) goto La
            java.lang.Throwable r0 = r1.error
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
            r1 = this;
            boolean r0 = r1.done
            if (r0 != 0) goto L12
            boolean r0 = r1.disposed
            if (r0 == 0) goto L9
            goto L12
        L9:
            r0 = 1
            r1.done = r0
            r1.doTerminate()
            r1.drain()
        L12:
            return
    }

    @Override // io.reactivex.Observer
    public void onError(java.lang.Throwable r2) {
            r1 = this;
            boolean r0 = r1.done
            if (r0 != 0) goto L1e
            boolean r0 = r1.disposed
            if (r0 == 0) goto L9
            goto L1e
        L9:
            if (r2 != 0) goto L12
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "onError called with null. Null values are generally not allowed in 2.x operators and sources."
            r2.<init>(r0)
        L12:
            r1.error = r2
            r2 = 1
            r1.done = r2
            r1.doTerminate()
            r1.drain()
            return
        L1e:
            io.reactivex.plugins.RxJavaPlugins.onError(r2)
            return
    }

    @Override // io.reactivex.Observer
    public void onNext(T r2) {
            r1 = this;
            boolean r0 = r1.done
            if (r0 != 0) goto L1e
            boolean r0 = r1.disposed
            if (r0 == 0) goto L9
            goto L1e
        L9:
            if (r2 != 0) goto L16
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "onNext called with null. Null values are generally not allowed in 2.x operators and sources."
            r2.<init>(r0)
            r1.onError(r2)
            return
        L16:
            io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r0 = r1.queue
            r0.offer(r2)
            r1.drain()
        L1e:
            return
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(io.reactivex.disposables.Disposable r2) {
            r1 = this;
            boolean r0 = r1.done
            if (r0 != 0) goto La
            boolean r0 = r1.disposed
            if (r0 == 0) goto L9
            goto La
        L9:
            return
        La:
            r2.dispose()
            return
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.once
            boolean r0 = r0.get()
            if (r0 != 0) goto L2b
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.once
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L2b
            io.reactivex.internal.observers.BasicIntQueueDisposable<T> r0 = r3.wip
            r4.onSubscribe(r0)
            java.util.concurrent.atomic.AtomicReference<io.reactivex.Observer<? super T>> r0 = r3.actual
            r0.lazySet(r4)
            boolean r4 = r3.disposed
            if (r4 == 0) goto L27
            java.util.concurrent.atomic.AtomicReference<io.reactivex.Observer<? super T>> r4 = r3.actual
            r0 = 0
            r4.lazySet(r0)
            return
        L27:
            r3.drain()
            return
        L2b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Only a single observer allowed."
            r0.<init>(r1)
            io.reactivex.internal.disposables.EmptyDisposable.error(r0, r4)
            return
    }
}
