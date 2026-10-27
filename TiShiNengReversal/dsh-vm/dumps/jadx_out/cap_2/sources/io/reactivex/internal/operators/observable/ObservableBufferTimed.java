package io.reactivex.internal.operators.observable;

import java.util.Collection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ObservableBufferTimed<T, U extends java.util.Collection<? super T>> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, U> {
    final java.util.concurrent.Callable<U> bufferSupplier;
    final int maxSize;
    final boolean restartTimerOnMaxSize;
    final io.reactivex.Scheduler scheduler;
    final long timeskip;
    final long timespan;
    final java.util.concurrent.TimeUnit unit;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class BufferExactBoundedObserver<T, U extends java.util.Collection<? super T>> extends io.reactivex.internal.observers.QueueDrainObserver<T, U, U> implements java.lang.Runnable, io.reactivex.disposables.Disposable {
        U buffer;
        final java.util.concurrent.Callable<U> bufferSupplier;
        long consumerIndex;
        final int maxSize;
        long producerIndex;
        final boolean restartTimerOnMaxSize;
        io.reactivex.disposables.Disposable s;
        io.reactivex.disposables.Disposable timer;
        final long timespan;
        final java.util.concurrent.TimeUnit unit;
        final io.reactivex.Scheduler.Worker w;

        BufferExactBoundedObserver(io.reactivex.Observer<? super U> r2, java.util.concurrent.Callable<U> r3, long r4, java.util.concurrent.TimeUnit r6, int r7, boolean r8, io.reactivex.Scheduler.Worker r9) {
                r1 = this;
                io.reactivex.internal.queue.MpscLinkedQueue r0 = new io.reactivex.internal.queue.MpscLinkedQueue
                r0.<init>()
                r1.<init>(r2, r0)
                r1.bufferSupplier = r3
                r1.timespan = r4
                r1.unit = r6
                r1.maxSize = r7
                r1.restartTimerOnMaxSize = r8
                r1.w = r9
                return
        }

        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        public /* bridge */ /* synthetic */ void accept(io.reactivex.Observer r1, java.lang.Object r2) {
                r0 = this;
                java.util.Collection r2 = (java.util.Collection) r2
                r0.accept(r1, r2)
                return
        }

        public void accept(io.reactivex.Observer<? super U> r1, U r2) {
                r0 = this;
                r1.onNext(r2)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                boolean r0 = r1.cancelled
                if (r0 != 0) goto L1a
                r0 = 1
                r1.cancelled = r0
                io.reactivex.Scheduler$Worker r0 = r1.w
                r0.dispose()
                monitor-enter(r1)
                r0 = 0
                r1.buffer = r0     // Catch: java.lang.Throwable -> L17
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
                io.reactivex.disposables.Disposable r0 = r1.s
                r0.dispose()
                return
            L17:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
                throw r0
            L1a:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                boolean r0 = r1.cancelled
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r3 = this;
                io.reactivex.Scheduler$Worker r0 = r3.w
                r0.dispose()
                monitor-enter(r3)
                U extends java.util.Collection<? super T> r0 = r3.buffer     // Catch: java.lang.Throwable -> L23
                r1 = 0
                r3.buffer = r1     // Catch: java.lang.Throwable -> L23
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L23
                io.reactivex.internal.fuseable.SimpleQueue<U> r1 = r3.queue
                r1.offer(r0)
                r0 = 1
                r3.done = r0
                boolean r0 = r3.enter()
                if (r0 == 0) goto L22
                io.reactivex.internal.fuseable.SimpleQueue<U> r0 = r3.queue
                io.reactivex.Observer<? super V> r1 = r3.actual
                r2 = 0
                io.reactivex.internal.util.QueueDrainHelper.drainLoop(r0, r1, r2, r3, r3)
            L22:
                return
            L23:
                r0 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L23
                throw r0
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.Scheduler$Worker r0 = r1.w
                r0.dispose()
                monitor-enter(r1)
                r0 = 0
                r1.buffer = r0     // Catch: java.lang.Throwable -> L10
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
                io.reactivex.Observer<? super V> r0 = r1.actual
                r0.onError(r2)
                return
            L10:
                r2 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
                throw r2
        }

        @Override // io.reactivex.Observer
        public void onNext(T r13) {
                r12 = this;
                monitor-enter(r12)
                U extends java.util.Collection<? super T> r0 = r12.buffer     // Catch: java.lang.Throwable -> L7b
                if (r0 != 0) goto Lc
                monitor-exit(r12)     // Catch: java.lang.Throwable -> L7
                return
            L7:
                r0 = move-exception
                r13 = r0
                r6 = r12
                goto L7e
            Lc:
                r0.add(r13)     // Catch: java.lang.Throwable -> L7b
                int r13 = r0.size()     // Catch: java.lang.Throwable -> L7b
                int r1 = r12.maxSize     // Catch: java.lang.Throwable -> L7b
                if (r13 >= r1) goto L19
                monitor-exit(r12)     // Catch: java.lang.Throwable -> L7
                return
            L19:
                monitor-exit(r12)     // Catch: java.lang.Throwable -> L7b
                boolean r13 = r12.restartTimerOnMaxSize
                r1 = 1
                if (r13 == 0) goto L2d
                r13 = 0
                r12.buffer = r13
                long r3 = r12.producerIndex
                long r3 = r3 + r1
                r12.producerIndex = r3
                io.reactivex.disposables.Disposable r13 = r12.timer
                r13.dispose()
            L2d:
                r13 = 0
                r12.fastPathOrderedEmit(r0, r13, r12)
                java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r13 = r12.bufferSupplier     // Catch: java.lang.Throwable -> L6c
                java.lang.Object r13 = r13.call()     // Catch: java.lang.Throwable -> L6c
                java.lang.String r0 = "The buffer supplied is null"
                java.lang.Object r13 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r13, r0)     // Catch: java.lang.Throwable -> L6c
                java.util.Collection r13 = (java.util.Collection) r13     // Catch: java.lang.Throwable -> L6c
                boolean r0 = r12.restartTimerOnMaxSize
                if (r0 == 0) goto L62
                monitor-enter(r12)
                r12.buffer = r13     // Catch: java.lang.Throwable -> L5b
                long r3 = r12.consumerIndex     // Catch: java.lang.Throwable -> L5b
                long r3 = r3 + r1
                r12.consumerIndex = r3     // Catch: java.lang.Throwable -> L5b
                monitor-exit(r12)     // Catch: java.lang.Throwable -> L5b
                io.reactivex.Scheduler$Worker r5 = r12.w
                long r7 = r12.timespan
                java.util.concurrent.TimeUnit r11 = r12.unit
                r9 = r7
                r6 = r12
                io.reactivex.disposables.Disposable r13 = r5.schedulePeriodically(r6, r7, r9, r11)
                r6.timer = r13
                return
            L5b:
                r0 = move-exception
                r6 = r12
            L5d:
                r13 = r0
                monitor-exit(r12)     // Catch: java.lang.Throwable -> L60
                throw r13
            L60:
                r0 = move-exception
                goto L5d
            L62:
                r6 = r12
                monitor-enter(r12)
                r6.buffer = r13     // Catch: java.lang.Throwable -> L68
                monitor-exit(r12)     // Catch: java.lang.Throwable -> L68
                return
            L68:
                r0 = move-exception
                r13 = r0
                monitor-exit(r12)     // Catch: java.lang.Throwable -> L68
                throw r13
            L6c:
                r0 = move-exception
                r6 = r12
                r13 = r0
                io.reactivex.exceptions.Exceptions.throwIfFatal(r13)
                r12.dispose()
                io.reactivex.Observer<? super V> r0 = r6.actual
                r0.onError(r13)
                return
            L7b:
                r0 = move-exception
                r6 = r12
            L7d:
                r13 = r0
            L7e:
                monitor-exit(r12)     // Catch: java.lang.Throwable -> L80
                throw r13
            L80:
                r0 = move-exception
                goto L7d
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r8) {
                r7 = this;
                io.reactivex.disposables.Disposable r0 = r7.s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r8)
                if (r0 == 0) goto L41
                r7.s = r8
                java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r0 = r7.bufferSupplier     // Catch: java.lang.Throwable -> L2e
                java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L2e
                java.lang.String r1 = "The buffer supplied is null"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L2e
                java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L2e
                r7.buffer = r0
                io.reactivex.Observer<? super V> r8 = r7.actual
                r8.onSubscribe(r7)
                io.reactivex.Scheduler$Worker r0 = r7.w
                long r2 = r7.timespan
                java.util.concurrent.TimeUnit r6 = r7.unit
                r4 = r2
                r1 = r7
                io.reactivex.disposables.Disposable r8 = r0.schedulePeriodically(r1, r2, r4, r6)
                r1.timer = r8
                return
            L2e:
                r0 = move-exception
                r1 = r7
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.Scheduler$Worker r2 = r1.w
                r2.dispose()
                r8.dispose()
                io.reactivex.Observer<? super V> r8 = r1.actual
                io.reactivex.internal.disposables.EmptyDisposable.error(r0, r8)
                return
            L41:
                r1 = r7
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r7 = this;
                java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r0 = r7.bufferSupplier     // Catch: java.lang.Throwable -> L2a
                java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L2a
                java.lang.String r1 = "The bufferSupplier returned a null buffer"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L2a
                java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L2a
                monitor-enter(r7)
                U extends java.util.Collection<? super T> r1 = r7.buffer     // Catch: java.lang.Throwable -> L24
                if (r1 == 0) goto L26
                long r2 = r7.producerIndex     // Catch: java.lang.Throwable -> L24
                long r4 = r7.consumerIndex     // Catch: java.lang.Throwable -> L24
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 == 0) goto L1c
                goto L26
            L1c:
                r7.buffer = r0     // Catch: java.lang.Throwable -> L24
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L24
                r0 = 0
                r7.fastPathOrderedEmit(r1, r0, r7)
                return
            L24:
                r0 = move-exception
                goto L28
            L26:
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L24
                return
            L28:
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L24
                throw r0
            L2a:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r7.dispose()
                io.reactivex.Observer<? super V> r1 = r7.actual
                r1.onError(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class BufferExactUnboundedObserver<T, U extends java.util.Collection<? super T>> extends io.reactivex.internal.observers.QueueDrainObserver<T, U, U> implements java.lang.Runnable, io.reactivex.disposables.Disposable {
        U buffer;
        final java.util.concurrent.Callable<U> bufferSupplier;
        io.reactivex.disposables.Disposable s;
        final io.reactivex.Scheduler scheduler;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> timer;
        final long timespan;
        final java.util.concurrent.TimeUnit unit;

        BufferExactUnboundedObserver(io.reactivex.Observer<? super U> r2, java.util.concurrent.Callable<U> r3, long r4, java.util.concurrent.TimeUnit r6, io.reactivex.Scheduler r7) {
                r1 = this;
                io.reactivex.internal.queue.MpscLinkedQueue r0 = new io.reactivex.internal.queue.MpscLinkedQueue
                r0.<init>()
                r1.<init>(r2, r0)
                java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
                r2.<init>()
                r1.timer = r2
                r1.bufferSupplier = r3
                r1.timespan = r4
                r1.unit = r6
                r1.scheduler = r7
                return
        }

        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        public /* bridge */ /* synthetic */ void accept(io.reactivex.Observer r1, java.lang.Object r2) {
                r0 = this;
                java.util.Collection r2 = (java.util.Collection) r2
                r0.accept(r1, r2)
                return
        }

        public void accept(io.reactivex.Observer<? super U> r1, U r2) {
                r0 = this;
                io.reactivex.Observer<? super V> r1 = r0.actual
                r1.onNext(r2)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.timer
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                io.reactivex.disposables.Disposable r0 = r1.s
                r0.dispose()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r2.timer
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 != r1) goto Lc
                r0 = 1
                return r0
            Lc:
                r0 = 0
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r3 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r3.timer
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                monitor-enter(r3)
                U extends java.util.Collection<? super T> r0 = r3.buffer     // Catch: java.lang.Throwable -> L25
                r1 = 0
                r3.buffer = r1     // Catch: java.lang.Throwable -> L25
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L25
                if (r0 == 0) goto L24
                io.reactivex.internal.fuseable.SimpleQueue<U> r1 = r3.queue
                r1.offer(r0)
                r0 = 1
                r3.done = r0
                boolean r0 = r3.enter()
                if (r0 == 0) goto L24
                io.reactivex.internal.fuseable.SimpleQueue<U> r0 = r3.queue
                io.reactivex.Observer<? super V> r1 = r3.actual
                r2 = 0
                io.reactivex.internal.util.QueueDrainHelper.drainLoop(r0, r1, r2, r3, r3)
            L24:
                return
            L25:
                r0 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L25
                throw r0
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.timer
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                monitor-enter(r1)
                r0 = 0
                r1.buffer = r0     // Catch: java.lang.Throwable -> L10
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
                io.reactivex.Observer<? super V> r0 = r1.actual
                r0.onError(r2)
                return
            L10:
                r2 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
                throw r2
        }

        @Override // io.reactivex.Observer
        public void onNext(T r2) {
                r1 = this;
                monitor-enter(r1)
                U extends java.util.Collection<? super T> r0 = r1.buffer     // Catch: java.lang.Throwable -> L7
                if (r0 != 0) goto L9
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
                return
            L7:
                r2 = move-exception
                goto Le
            L9:
                r0.add(r2)     // Catch: java.lang.Throwable -> L7
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
                return
            Le:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
                throw r2
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r8) {
                r7 = this;
                io.reactivex.disposables.Disposable r0 = r7.s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r8)
                if (r0 == 0) goto L3c
                r7.s = r8
                java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r8 = r7.bufferSupplier     // Catch: java.lang.Throwable -> L3e
                java.lang.Object r8 = r8.call()     // Catch: java.lang.Throwable -> L3e
                java.lang.String r0 = "The buffer supplied is null"
                java.lang.Object r8 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r8, r0)     // Catch: java.lang.Throwable -> L3e
                java.util.Collection r8 = (java.util.Collection) r8     // Catch: java.lang.Throwable -> L3e
                r7.buffer = r8
                io.reactivex.Observer<? super V> r8 = r7.actual
                r8.onSubscribe(r7)
                boolean r8 = r7.cancelled
                if (r8 != 0) goto L3c
                io.reactivex.Scheduler r0 = r7.scheduler
                long r2 = r7.timespan
                java.util.concurrent.TimeUnit r6 = r7.unit
                r4 = r2
                r1 = r7
                io.reactivex.disposables.Disposable r8 = r0.schedulePeriodicallyDirect(r1, r2, r4, r6)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.timer
                r2 = 0
                boolean r0 = androidx.camera.view.p.a(r0, r2, r8)
                if (r0 != 0) goto L4c
                r8.dispose()
                return
            L3c:
                r1 = r7
                goto L4c
            L3e:
                r0 = move-exception
                r1 = r7
                r8 = r0
                io.reactivex.exceptions.Exceptions.throwIfFatal(r8)
                r7.dispose()
                io.reactivex.Observer<? super V> r0 = r1.actual
                io.reactivex.internal.disposables.EmptyDisposable.error(r8, r0)
            L4c:
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r0 = r2.bufferSupplier     // Catch: java.lang.Throwable -> L28
                java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L28
                java.lang.String r1 = "The bufferSupplier returned a null buffer"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L28
                java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L28
                monitor-enter(r2)
                U extends java.util.Collection<? super T> r1 = r2.buffer     // Catch: java.lang.Throwable -> L16
                if (r1 == 0) goto L18
                r2.buffer = r0     // Catch: java.lang.Throwable -> L16
                goto L18
            L16:
                r0 = move-exception
                goto L26
            L18:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
                if (r1 != 0) goto L21
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r2.timer
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
            L21:
                r0 = 0
                r2.fastPathEmit(r1, r0, r2)
                return
            L26:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
                throw r0
            L28:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r2.dispose()
                io.reactivex.Observer<? super V> r1 = r2.actual
                r1.onError(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class BufferSkipBoundedObserver<T, U extends java.util.Collection<? super T>> extends io.reactivex.internal.observers.QueueDrainObserver<T, U, U> implements java.lang.Runnable, io.reactivex.disposables.Disposable {
        final java.util.concurrent.Callable<U> bufferSupplier;
        final java.util.List<U> buffers;
        io.reactivex.disposables.Disposable s;
        final long timeskip;
        final long timespan;
        final java.util.concurrent.TimeUnit unit;
        final io.reactivex.Scheduler.Worker w;



        BufferSkipBoundedObserver(io.reactivex.Observer<? super U> r2, java.util.concurrent.Callable<U> r3, long r4, long r6, java.util.concurrent.TimeUnit r8, io.reactivex.Scheduler.Worker r9) {
                r1 = this;
                io.reactivex.internal.queue.MpscLinkedQueue r0 = new io.reactivex.internal.queue.MpscLinkedQueue
                r0.<init>()
                r1.<init>(r2, r0)
                r1.bufferSupplier = r3
                r1.timespan = r4
                r1.timeskip = r6
                r1.unit = r8
                r1.w = r9
                java.util.LinkedList r2 = new java.util.LinkedList
                r2.<init>()
                r1.buffers = r2
                return
        }

        static /* synthetic */ void access$000(io.reactivex.internal.operators.observable.ObservableBufferTimed.BufferSkipBoundedObserver r0, java.lang.Object r1, boolean r2, io.reactivex.disposables.Disposable r3) {
                r0.fastPathOrderedEmit(r1, r2, r3)
                return
        }

        static /* synthetic */ void access$100(io.reactivex.internal.operators.observable.ObservableBufferTimed.BufferSkipBoundedObserver r0, java.lang.Object r1, boolean r2, io.reactivex.disposables.Disposable r3) {
                r0.fastPathOrderedEmit(r1, r2, r3)
                return
        }

        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        public /* bridge */ /* synthetic */ void accept(io.reactivex.Observer r1, java.lang.Object r2) {
                r0 = this;
                java.util.Collection r2 = (java.util.Collection) r2
                r0.accept(r1, r2)
                return
        }

        public void accept(io.reactivex.Observer<? super U> r1, U r2) {
                r0 = this;
                r1.onNext(r2)
                return
        }

        void clear() {
                r1 = this;
                monitor-enter(r1)
                java.util.List<U extends java.util.Collection<? super T>> r0 = r1.buffers     // Catch: java.lang.Throwable -> L8
                r0.clear()     // Catch: java.lang.Throwable -> L8
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
                return
            L8:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
                throw r0
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                boolean r0 = r1.cancelled
                if (r0 != 0) goto L14
                r0 = 1
                r1.cancelled = r0
                io.reactivex.Scheduler$Worker r0 = r1.w
                r0.dispose()
                r1.clear()
                io.reactivex.disposables.Disposable r0 = r1.s
                r0.dispose()
            L14:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                boolean r0 = r1.cancelled
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r4 = this;
                monitor-enter(r4)
                java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L38
                java.util.List<U extends java.util.Collection<? super T>> r1 = r4.buffers     // Catch: java.lang.Throwable -> L38
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L38
                java.util.List<U extends java.util.Collection<? super T>> r1 = r4.buffers     // Catch: java.lang.Throwable -> L38
                r1.clear()     // Catch: java.lang.Throwable -> L38
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L38
                java.util.Iterator r0 = r0.iterator()
            L12:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L24
                java.lang.Object r1 = r0.next()
                java.util.Collection r1 = (java.util.Collection) r1
                io.reactivex.internal.fuseable.SimpleQueue<U> r2 = r4.queue
                r2.offer(r1)
                goto L12
            L24:
                r0 = 1
                r4.done = r0
                boolean r0 = r4.enter()
                if (r0 == 0) goto L37
                io.reactivex.internal.fuseable.SimpleQueue<U> r0 = r4.queue
                io.reactivex.Observer<? super V> r1 = r4.actual
                r2 = 0
                io.reactivex.Scheduler$Worker r3 = r4.w
                io.reactivex.internal.util.QueueDrainHelper.drainLoop(r0, r1, r2, r3, r4)
            L37:
                return
            L38:
                r0 = move-exception
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L38
                throw r0
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                r0 = 1
                r1.done = r0
                io.reactivex.Scheduler$Worker r0 = r1.w
                r0.dispose()
                r1.clear()
                io.reactivex.Observer<? super V> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r3) {
                r2 = this;
                monitor-enter(r2)
                java.util.List<U extends java.util.Collection<? super T>> r0 = r2.buffers     // Catch: java.lang.Throwable -> L17
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L17
            L7:
                boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L17
                if (r1 == 0) goto L19
                java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L17
                java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L17
                r1.add(r3)     // Catch: java.lang.Throwable -> L17
                goto L7
            L17:
                r3 = move-exception
                goto L1b
            L19:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
                return
            L1b:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
                throw r3
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r9) {
                r8 = this;
                io.reactivex.disposables.Disposable r0 = r8.s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r9)
                if (r0 == 0) goto L4f
                r8.s = r9
                java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r0 = r8.bufferSupplier     // Catch: java.lang.Throwable -> L3c
                java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L3c
                java.lang.String r1 = "The buffer supplied is null"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L3c
                java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L3c
                java.util.List<U extends java.util.Collection<? super T>> r9 = r8.buffers
                r9.add(r0)
                io.reactivex.Observer<? super V> r9 = r8.actual
                r9.onSubscribe(r8)
                io.reactivex.Scheduler$Worker r1 = r8.w
                long r3 = r8.timeskip
                java.util.concurrent.TimeUnit r7 = r8.unit
                r5 = r3
                r2 = r8
                r1.schedulePeriodically(r2, r3, r5, r7)
                io.reactivex.Scheduler$Worker r9 = r2.w
                io.reactivex.internal.operators.observable.ObservableBufferTimed$BufferSkipBoundedObserver$1 r1 = new io.reactivex.internal.operators.observable.ObservableBufferTimed$BufferSkipBoundedObserver$1
                r1.<init>(r8, r0)
                long r3 = r2.timespan
                java.util.concurrent.TimeUnit r0 = r2.unit
                r9.schedule(r1, r3, r0)
                return
            L3c:
                r0 = move-exception
                r2 = r8
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.Scheduler$Worker r1 = r2.w
                r1.dispose()
                r9.dispose()
                io.reactivex.Observer<? super V> r9 = r2.actual
                io.reactivex.internal.disposables.EmptyDisposable.error(r0, r9)
                return
            L4f:
                r2 = r8
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r5 = this;
                boolean r0 = r5.cancelled
                if (r0 == 0) goto L5
                return
            L5:
                java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r0 = r5.bufferSupplier     // Catch: java.lang.Throwable -> L33
                java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L33
                java.lang.String r1 = "The bufferSupplier returned a null buffer"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L33
                java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L33
                monitor-enter(r5)
                boolean r1 = r5.cancelled     // Catch: java.lang.Throwable -> L1a
                if (r1 == 0) goto L1c
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L1a
                return
            L1a:
                r0 = move-exception
                goto L31
            L1c:
                java.util.List<U extends java.util.Collection<? super T>> r1 = r5.buffers     // Catch: java.lang.Throwable -> L1a
                r1.add(r0)     // Catch: java.lang.Throwable -> L1a
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L1a
                io.reactivex.Scheduler$Worker r1 = r5.w
                io.reactivex.internal.operators.observable.ObservableBufferTimed$BufferSkipBoundedObserver$2 r2 = new io.reactivex.internal.operators.observable.ObservableBufferTimed$BufferSkipBoundedObserver$2
                r2.<init>(r5, r0)
                long r3 = r5.timespan
                java.util.concurrent.TimeUnit r0 = r5.unit
                r1.schedule(r2, r3, r0)
                return
            L31:
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L1a
                throw r0
            L33:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r5.dispose()
                io.reactivex.Observer<? super V> r1 = r5.actual
                r1.onError(r0)
                return
        }
    }

    public ObservableBufferTimed(io.reactivex.ObservableSource<T> r1, long r2, long r4, java.util.concurrent.TimeUnit r6, io.reactivex.Scheduler r7, java.util.concurrent.Callable<U> r8, int r9, boolean r10) {
            r0 = this;
            r0.<init>(r1)
            r0.timespan = r2
            r0.timeskip = r4
            r0.unit = r6
            r0.scheduler = r7
            r0.bufferSupplier = r8
            r0.maxSize = r9
            r0.restartTimerOnMaxSize = r10
            return
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super U> r11) {
            r10 = this;
            long r0 = r10.timespan
            long r2 = r10.timeskip
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L27
            int r0 = r10.maxSize
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 != r1) goto L27
            io.reactivex.ObservableSource<T> r0 = r10.source
            io.reactivex.internal.operators.observable.ObservableBufferTimed$BufferExactUnboundedObserver r1 = new io.reactivex.internal.operators.observable.ObservableBufferTimed$BufferExactUnboundedObserver
            io.reactivex.observers.SerializedObserver r2 = new io.reactivex.observers.SerializedObserver
            r2.<init>(r11)
            java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r3 = r10.bufferSupplier
            long r4 = r10.timespan
            java.util.concurrent.TimeUnit r6 = r10.unit
            io.reactivex.Scheduler r7 = r10.scheduler
            r1.<init>(r2, r3, r4, r6, r7)
            r0.subscribe(r1)
            return
        L27:
            io.reactivex.Scheduler r0 = r10.scheduler
            io.reactivex.Scheduler$Worker r9 = r0.createWorker()
            long r0 = r10.timespan
            long r2 = r10.timeskip
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L4f
            io.reactivex.ObservableSource<T> r0 = r10.source
            io.reactivex.internal.operators.observable.ObservableBufferTimed$BufferExactBoundedObserver r1 = new io.reactivex.internal.operators.observable.ObservableBufferTimed$BufferExactBoundedObserver
            io.reactivex.observers.SerializedObserver r2 = new io.reactivex.observers.SerializedObserver
            r2.<init>(r11)
            java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r3 = r10.bufferSupplier
            long r4 = r10.timespan
            java.util.concurrent.TimeUnit r6 = r10.unit
            int r7 = r10.maxSize
            boolean r8 = r10.restartTimerOnMaxSize
            r1.<init>(r2, r3, r4, r6, r7, r8, r9)
            r0.subscribe(r1)
            return
        L4f:
            io.reactivex.ObservableSource<T> r0 = r10.source
            io.reactivex.internal.operators.observable.ObservableBufferTimed$BufferSkipBoundedObserver r1 = new io.reactivex.internal.operators.observable.ObservableBufferTimed$BufferSkipBoundedObserver
            io.reactivex.observers.SerializedObserver r2 = new io.reactivex.observers.SerializedObserver
            r2.<init>(r11)
            java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r3 = r10.bufferSupplier
            long r4 = r10.timespan
            long r6 = r10.timeskip
            java.util.concurrent.TimeUnit r8 = r10.unit
            r1.<init>(r2, r3, r4, r6, r8, r9)
            r0.subscribe(r1)
            return
    }
}
