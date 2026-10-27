package io.reactivex.internal.operators.observable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ObservableReplay<T> extends io.reactivex.observables.ConnectableObservable<T> implements io.reactivex.internal.fuseable.HasUpstreamObservableSource<T> {
    static final io.reactivex.internal.operators.observable.ObservableReplay.BufferSupplier DEFAULT_UNBOUNDED_FACTORY = null;
    final io.reactivex.internal.operators.observable.ObservableReplay.BufferSupplier<T> bufferFactory;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableReplay.ReplayObserver<T>> current;
    final io.reactivex.ObservableSource<T> onSubscribe;
    final io.reactivex.ObservableSource<T> source;







    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static abstract class BoundedReplayBuffer<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableReplay.Node> implements io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer<T> {
        private static final long serialVersionUID = 2346567790059478686L;
        int size;
        io.reactivex.internal.operators.observable.ObservableReplay.Node tail;

        BoundedReplayBuffer() {
                r2 = this;
                r2.<init>()
                io.reactivex.internal.operators.observable.ObservableReplay$Node r0 = new io.reactivex.internal.operators.observable.ObservableReplay$Node
                r1 = 0
                r0.<init>(r1)
                r2.tail = r0
                r2.set(r0)
                return
        }

        final void addLast(io.reactivex.internal.operators.observable.ObservableReplay.Node r2) {
                r1 = this;
                io.reactivex.internal.operators.observable.ObservableReplay$Node r0 = r1.tail
                r0.set(r2)
                r1.tail = r2
                int r2 = r1.size
                int r2 = r2 + 1
                r1.size = r2
                return
        }

        final void collect(java.util.Collection<? super T> r4) {
                r3 = this;
                java.lang.Object r0 = r3.get()
                io.reactivex.internal.operators.observable.ObservableReplay$Node r0 = (io.reactivex.internal.operators.observable.ObservableReplay.Node) r0
            L6:
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.observable.ObservableReplay$Node r0 = (io.reactivex.internal.operators.observable.ObservableReplay.Node) r0
                if (r0 == 0) goto L29
                java.lang.Object r1 = r0.value
                java.lang.Object r1 = r3.leaveTransform(r1)
                boolean r2 = io.reactivex.internal.util.NotificationLite.isComplete(r1)
                if (r2 != 0) goto L29
                boolean r2 = io.reactivex.internal.util.NotificationLite.isError(r1)
                if (r2 == 0) goto L21
                goto L29
            L21:
                java.lang.Object r1 = io.reactivex.internal.util.NotificationLite.getValue(r1)
                r4.add(r1)
                goto L6
            L29:
                return
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer
        public final void complete() {
                r2 = this;
                java.lang.Object r0 = io.reactivex.internal.util.NotificationLite.complete()
                java.lang.Object r0 = r2.enterTransform(r0)
                io.reactivex.internal.operators.observable.ObservableReplay$Node r1 = new io.reactivex.internal.operators.observable.ObservableReplay$Node
                r1.<init>(r0)
                r2.addLast(r1)
                r2.truncateFinal()
                return
        }

        java.lang.Object enterTransform(java.lang.Object r1) {
                r0 = this;
                return r1
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer
        public final void error(java.lang.Throwable r2) {
                r1 = this;
                java.lang.Object r2 = io.reactivex.internal.util.NotificationLite.error(r2)
                java.lang.Object r2 = r1.enterTransform(r2)
                io.reactivex.internal.operators.observable.ObservableReplay$Node r0 = new io.reactivex.internal.operators.observable.ObservableReplay$Node
                r0.<init>(r2)
                r1.addLast(r0)
                r1.truncateFinal()
                return
        }

        boolean hasCompleted() {
                r1 = this;
                io.reactivex.internal.operators.observable.ObservableReplay$Node r0 = r1.tail
                java.lang.Object r0 = r0.value
                if (r0 == 0) goto L12
                java.lang.Object r0 = r1.leaveTransform(r0)
                boolean r0 = io.reactivex.internal.util.NotificationLite.isComplete(r0)
                if (r0 == 0) goto L12
                r0 = 1
                return r0
            L12:
                r0 = 0
                return r0
        }

        boolean hasError() {
                r1 = this;
                io.reactivex.internal.operators.observable.ObservableReplay$Node r0 = r1.tail
                java.lang.Object r0 = r0.value
                if (r0 == 0) goto L12
                java.lang.Object r0 = r1.leaveTransform(r0)
                boolean r0 = io.reactivex.internal.util.NotificationLite.isError(r0)
                if (r0 == 0) goto L12
                r0 = 1
                return r0
            L12:
                r0 = 0
                return r0
        }

        java.lang.Object leaveTransform(java.lang.Object r1) {
                r0 = this;
                return r1
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer
        public final void next(T r2) {
                r1 = this;
                java.lang.Object r2 = io.reactivex.internal.util.NotificationLite.next(r2)
                java.lang.Object r2 = r1.enterTransform(r2)
                io.reactivex.internal.operators.observable.ObservableReplay$Node r0 = new io.reactivex.internal.operators.observable.ObservableReplay$Node
                r0.<init>(r2)
                r1.addLast(r0)
                r1.truncate()
                return
        }

        final void removeFirst() {
                r2 = this;
                java.lang.Object r0 = r2.get()
                io.reactivex.internal.operators.observable.ObservableReplay$Node r0 = (io.reactivex.internal.operators.observable.ObservableReplay.Node) r0
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.observable.ObservableReplay$Node r0 = (io.reactivex.internal.operators.observable.ObservableReplay.Node) r0
                int r1 = r2.size
                int r1 = r1 + (-1)
                r2.size = r1
                r2.setFirst(r0)
                return
        }

        final void removeSome(int r3) {
                r2 = this;
                java.lang.Object r0 = r2.get()
                io.reactivex.internal.operators.observable.ObservableReplay$Node r0 = (io.reactivex.internal.operators.observable.ObservableReplay.Node) r0
            L6:
                if (r3 <= 0) goto L17
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.observable.ObservableReplay$Node r0 = (io.reactivex.internal.operators.observable.ObservableReplay.Node) r0
                int r3 = r3 + (-1)
                int r1 = r2.size
                int r1 = r1 + (-1)
                r2.size = r1
                goto L6
            L17:
                r2.setFirst(r0)
                return
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer
        public final void replay(io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable<T> r5) {
                r4 = this;
                int r0 = r5.getAndIncrement()
                if (r0 == 0) goto L7
                goto L44
            L7:
                r0 = 1
            L8:
                java.lang.Object r1 = r5.index()
                io.reactivex.internal.operators.observable.ObservableReplay$Node r1 = (io.reactivex.internal.operators.observable.ObservableReplay.Node) r1
                if (r1 != 0) goto L18
                java.lang.Object r1 = r4.get()
                io.reactivex.internal.operators.observable.ObservableReplay$Node r1 = (io.reactivex.internal.operators.observable.ObservableReplay.Node) r1
                r5.index = r1
            L18:
                boolean r2 = r5.isDisposed()
                if (r2 == 0) goto L1f
                goto L44
            L1f:
                java.lang.Object r2 = r1.get()
                io.reactivex.internal.operators.observable.ObservableReplay$Node r2 = (io.reactivex.internal.operators.observable.ObservableReplay.Node) r2
                if (r2 == 0) goto L3b
                java.lang.Object r1 = r2.value
                java.lang.Object r1 = r4.leaveTransform(r1)
                io.reactivex.Observer<? super T> r3 = r5.child
                boolean r1 = io.reactivex.internal.util.NotificationLite.accept(r1, r3)
                if (r1 == 0) goto L39
                r0 = 0
                r5.index = r0
                return
            L39:
                r1 = r2
                goto L18
            L3b:
                r5.index = r1
                int r0 = -r0
                int r0 = r5.addAndGet(r0)
                if (r0 != 0) goto L8
            L44:
                return
        }

        final void setFirst(io.reactivex.internal.operators.observable.ObservableReplay.Node r1) {
                r0 = this;
                r0.set(r1)
                return
        }

        abstract void truncate();

        void truncateFinal() {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface BufferSupplier<T> {
        io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer<T> call();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class InnerDisposable<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 2728361546769921047L;
        volatile boolean cancelled;
        final io.reactivex.Observer<? super T> child;
        java.lang.Object index;
        final io.reactivex.internal.operators.observable.ObservableReplay.ReplayObserver<T> parent;

        InnerDisposable(io.reactivex.internal.operators.observable.ObservableReplay.ReplayObserver<T> r1, io.reactivex.Observer<? super T> r2) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                r0.child = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                boolean r0 = r1.cancelled
                if (r0 != 0) goto Lc
                r0 = 1
                r1.cancelled = r0
                io.reactivex.internal.operators.observable.ObservableReplay$ReplayObserver<T> r0 = r1.parent
                r0.remove(r1)
            Lc:
                return
        }

        <U> U index() {
                r1 = this;
                java.lang.Object r0 = r1.index
                return r0
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                boolean r0 = r1.cancelled
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class Node extends java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableReplay.Node> {
        private static final long serialVersionUID = 245354315435971818L;
        final java.lang.Object value;

        Node(java.lang.Object r1) {
                r0 = this;
                r0.<init>()
                r0.value = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface ReplayBuffer<T> {
        void complete();

        void error(java.lang.Throwable r1);

        void next(T r1);

        void replay(io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable<T> r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class ReplayObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        static final io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable[] EMPTY = null;
        static final io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable[] TERMINATED = null;
        final io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer<T> buffer;
        boolean done;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable[]> observers;
        final java.util.concurrent.atomic.AtomicBoolean shouldConnect;
        volatile io.reactivex.disposables.Disposable subscription;

        static {
                r0 = 0
                io.reactivex.internal.operators.observable.ObservableReplay$InnerDisposable[] r1 = new io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable[r0]
                io.reactivex.internal.operators.observable.ObservableReplay.ReplayObserver.EMPTY = r1
                io.reactivex.internal.operators.observable.ObservableReplay$InnerDisposable[] r0 = new io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable[r0]
                io.reactivex.internal.operators.observable.ObservableReplay.ReplayObserver.TERMINATED = r0
                return
        }

        ReplayObserver(io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer<T> r2) {
                r1 = this;
                r1.<init>()
                r1.buffer = r2
                java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
                io.reactivex.internal.operators.observable.ObservableReplay$InnerDisposable[] r0 = io.reactivex.internal.operators.observable.ObservableReplay.ReplayObserver.EMPTY
                r2.<init>(r0)
                r1.observers = r2
                java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
                r2.<init>()
                r1.shouldConnect = r2
                return
        }

        boolean add(io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable<T> r5) {
                r4 = this;
            L0:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableReplay$InnerDisposable[]> r0 = r4.observers
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.observable.ObservableReplay$InnerDisposable[] r0 = (io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable[]) r0
                io.reactivex.internal.operators.observable.ObservableReplay$InnerDisposable[] r1 = io.reactivex.internal.operators.observable.ObservableReplay.ReplayObserver.TERMINATED
                r2 = 0
                if (r0 != r1) goto Le
                return r2
            Le:
                int r1 = r0.length
                int r3 = r1 + 1
                io.reactivex.internal.operators.observable.ObservableReplay$InnerDisposable[] r3 = new io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable[r3]
                java.lang.System.arraycopy(r0, r2, r3, r2, r1)
                r3[r1] = r5
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableReplay$InnerDisposable[]> r1 = r4.observers
                boolean r0 = androidx.camera.view.p.a(r1, r0, r3)
                if (r0 == 0) goto L0
                r5 = 1
                return r5
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableReplay$InnerDisposable[]> r0 = r2.observers
                io.reactivex.internal.operators.observable.ObservableReplay$InnerDisposable[] r1 = io.reactivex.internal.operators.observable.ObservableReplay.ReplayObserver.TERMINATED
                r0.set(r1)
                io.reactivex.disposables.Disposable r0 = r2.subscription
                r0.dispose()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableReplay$InnerDisposable[]> r0 = r2.observers
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.observable.ObservableReplay$InnerDisposable[] r1 = io.reactivex.internal.operators.observable.ObservableReplay.ReplayObserver.TERMINATED
                if (r0 != r1) goto Lc
                r0 = 1
                return r0
            Lc:
                r0 = 0
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r1 = this;
                boolean r0 = r1.done
                if (r0 != 0) goto Lf
                r0 = 1
                r1.done = r0
                io.reactivex.internal.operators.observable.ObservableReplay$ReplayBuffer<T> r0 = r1.buffer
                r0.complete()
                r1.replayFinal()
            Lf:
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 != 0) goto L10
                r0 = 1
                r1.done = r0
                io.reactivex.internal.operators.observable.ObservableReplay$ReplayBuffer<T> r0 = r1.buffer
                r0.error(r2)
                r1.replayFinal()
                return
            L10:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 != 0) goto Lc
                io.reactivex.internal.operators.observable.ObservableReplay$ReplayBuffer<T> r0 = r1.buffer
                r0.next(r2)
                r1.replay()
            Lc:
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.subscription
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Ld
                r1.subscription = r2
                r1.replay()
            Ld:
                return
        }

        void remove(io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable<T> r7) {
                r6 = this;
            L0:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableReplay$InnerDisposable[]> r0 = r6.observers
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.observable.ObservableReplay$InnerDisposable[] r0 = (io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable[]) r0
                int r1 = r0.length
                if (r1 != 0) goto Lc
                goto L3d
            Lc:
                r2 = 0
                r3 = 0
            Le:
                if (r3 >= r1) goto L1c
                r4 = r0[r3]
                boolean r4 = r4.equals(r7)
                if (r4 == 0) goto L19
                goto L1d
            L19:
                int r3 = r3 + 1
                goto Le
            L1c:
                r3 = -1
            L1d:
                if (r3 >= 0) goto L20
                goto L3d
            L20:
                r4 = 1
                if (r1 != r4) goto L26
                io.reactivex.internal.operators.observable.ObservableReplay$InnerDisposable[] r1 = io.reactivex.internal.operators.observable.ObservableReplay.ReplayObserver.EMPTY
                goto L35
            L26:
                int r5 = r1 + (-1)
                io.reactivex.internal.operators.observable.ObservableReplay$InnerDisposable[] r5 = new io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable[r5]
                java.lang.System.arraycopy(r0, r2, r5, r2, r3)
                int r2 = r3 + 1
                int r1 = r1 - r3
                int r1 = r1 - r4
                java.lang.System.arraycopy(r0, r2, r5, r3, r1)
                r1 = r5
            L35:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableReplay$InnerDisposable[]> r2 = r6.observers
                boolean r0 = androidx.camera.view.p.a(r2, r0, r1)
                if (r0 == 0) goto L0
            L3d:
                return
        }

        void replay() {
                r5 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableReplay$InnerDisposable[]> r0 = r5.observers
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.observable.ObservableReplay$InnerDisposable[] r0 = (io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable[]) r0
                int r1 = r0.length
                r2 = 0
            La:
                if (r2 >= r1) goto L16
                r3 = r0[r2]
                io.reactivex.internal.operators.observable.ObservableReplay$ReplayBuffer<T> r4 = r5.buffer
                r4.replay(r3)
                int r2 = r2 + 1
                goto La
            L16:
                return
        }

        void replayFinal() {
                r5 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableReplay$InnerDisposable[]> r0 = r5.observers
                io.reactivex.internal.operators.observable.ObservableReplay$InnerDisposable[] r1 = io.reactivex.internal.operators.observable.ObservableReplay.ReplayObserver.TERMINATED
                java.lang.Object r0 = r0.getAndSet(r1)
                io.reactivex.internal.operators.observable.ObservableReplay$InnerDisposable[] r0 = (io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable[]) r0
                int r1 = r0.length
                r2 = 0
            Lc:
                if (r2 >= r1) goto L18
                r3 = r0[r2]
                io.reactivex.internal.operators.observable.ObservableReplay$ReplayBuffer<T> r4 = r5.buffer
                r4.replay(r3)
                int r2 = r2 + 1
                goto Lc
            L18:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class SizeAndTimeBoundReplayBuffer<T> extends io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer<T> {
        private static final long serialVersionUID = 3457957419649567404L;
        final int limit;
        final long maxAge;
        final io.reactivex.Scheduler scheduler;
        final java.util.concurrent.TimeUnit unit;

        SizeAndTimeBoundReplayBuffer(int r1, long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler r5) {
                r0 = this;
                r0.<init>()
                r0.scheduler = r5
                r0.limit = r1
                r0.maxAge = r2
                r0.unit = r4
                return
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        java.lang.Object enterTransform(java.lang.Object r5) {
                r4 = this;
                io.reactivex.schedulers.Timed r0 = new io.reactivex.schedulers.Timed
                io.reactivex.Scheduler r1 = r4.scheduler
                java.util.concurrent.TimeUnit r2 = r4.unit
                long r1 = r1.now(r2)
                java.util.concurrent.TimeUnit r3 = r4.unit
                r0.<init>(r5, r1, r3)
                return r0
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        java.lang.Object leaveTransform(java.lang.Object r1) {
                r0 = this;
                io.reactivex.schedulers.Timed r1 = (io.reactivex.schedulers.Timed) r1
                java.lang.Object r1 = r1.value()
                return r1
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        void truncate() {
                r9 = this;
                io.reactivex.Scheduler r0 = r9.scheduler
                java.util.concurrent.TimeUnit r1 = r9.unit
                long r0 = r0.now(r1)
                long r2 = r9.maxAge
                long r0 = r0 - r2
                java.lang.Object r2 = r9.get()
                io.reactivex.internal.operators.observable.ObservableReplay$Node r2 = (io.reactivex.internal.operators.observable.ObservableReplay.Node) r2
                java.lang.Object r3 = r2.get()
                io.reactivex.internal.operators.observable.ObservableReplay$Node r3 = (io.reactivex.internal.operators.observable.ObservableReplay.Node) r3
                r4 = 0
            L18:
                r8 = r3
                r3 = r2
                r2 = r8
                if (r2 == 0) goto L4b
                int r5 = r9.size
                int r6 = r9.limit
                if (r5 <= r6) goto L30
                int r4 = r4 + 1
                int r5 = r5 + (-1)
                r9.size = r5
                java.lang.Object r3 = r2.get()
                io.reactivex.internal.operators.observable.ObservableReplay$Node r3 = (io.reactivex.internal.operators.observable.ObservableReplay.Node) r3
                goto L18
            L30:
                java.lang.Object r5 = r2.value
                io.reactivex.schedulers.Timed r5 = (io.reactivex.schedulers.Timed) r5
                long r5 = r5.time()
                int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r7 > 0) goto L4b
                int r4 = r4 + 1
                int r3 = r9.size
                int r3 = r3 + (-1)
                r9.size = r3
                java.lang.Object r3 = r2.get()
                io.reactivex.internal.operators.observable.ObservableReplay$Node r3 = (io.reactivex.internal.operators.observable.ObservableReplay.Node) r3
                goto L18
            L4b:
                if (r4 == 0) goto L50
                r9.setFirst(r3)
            L50:
                return
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        void truncateFinal() {
                r10 = this;
                io.reactivex.Scheduler r0 = r10.scheduler
                java.util.concurrent.TimeUnit r1 = r10.unit
                long r0 = r0.now(r1)
                long r2 = r10.maxAge
                long r0 = r0 - r2
                java.lang.Object r2 = r10.get()
                io.reactivex.internal.operators.observable.ObservableReplay$Node r2 = (io.reactivex.internal.operators.observable.ObservableReplay.Node) r2
                java.lang.Object r3 = r2.get()
                io.reactivex.internal.operators.observable.ObservableReplay$Node r3 = (io.reactivex.internal.operators.observable.ObservableReplay.Node) r3
                r4 = 0
            L18:
                r9 = r3
                r3 = r2
                r2 = r9
                if (r2 == 0) goto L3c
                int r5 = r10.size
                r6 = 1
                if (r5 <= r6) goto L3c
                java.lang.Object r5 = r2.value
                io.reactivex.schedulers.Timed r5 = (io.reactivex.schedulers.Timed) r5
                long r7 = r5.time()
                int r5 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r5 > 0) goto L3c
                int r4 = r4 + 1
                int r3 = r10.size
                int r3 = r3 - r6
                r10.size = r3
                java.lang.Object r3 = r2.get()
                io.reactivex.internal.operators.observable.ObservableReplay$Node r3 = (io.reactivex.internal.operators.observable.ObservableReplay.Node) r3
                goto L18
            L3c:
                if (r4 == 0) goto L41
                r10.setFirst(r3)
            L41:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class SizeBoundReplayBuffer<T> extends io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer<T> {
        private static final long serialVersionUID = -5898283885385201806L;
        final int limit;

        SizeBoundReplayBuffer(int r1) {
                r0 = this;
                r0.<init>()
                r0.limit = r1
                return
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        void truncate() {
                r2 = this;
                int r0 = r2.size
                int r1 = r2.limit
                if (r0 <= r1) goto L9
                r2.removeFirst()
            L9:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class UnboundedReplayBuffer<T> extends java.util.ArrayList<java.lang.Object> implements io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer<T> {
        private static final long serialVersionUID = 7063189396499112664L;
        volatile int size;

        UnboundedReplayBuffer(int r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer
        public void complete() {
                r1 = this;
                java.lang.Object r0 = io.reactivex.internal.util.NotificationLite.complete()
                r1.add(r0)
                int r0 = r1.size
                int r0 = r0 + 1
                r1.size = r0
                return
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer
        public void error(java.lang.Throwable r1) {
                r0 = this;
                java.lang.Object r1 = io.reactivex.internal.util.NotificationLite.error(r1)
                r0.add(r1)
                int r1 = r0.size
                int r1 = r1 + 1
                r0.size = r1
                return
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer
        public void next(T r1) {
                r0 = this;
                java.lang.Object r1 = io.reactivex.internal.util.NotificationLite.next(r1)
                r0.add(r1)
                int r1 = r0.size
                int r1 = r1 + 1
                r0.size = r1
                return
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer
        public void replay(io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable<T> r6) {
                r5 = this;
                int r0 = r6.getAndIncrement()
                if (r0 == 0) goto L7
                goto L45
            L7:
                io.reactivex.Observer<? super T> r0 = r6.child
                r1 = 1
            La:
                boolean r2 = r6.isDisposed()
                if (r2 == 0) goto L11
                goto L45
            L11:
                int r2 = r5.size
                java.lang.Object r3 = r6.index()
                java.lang.Integer r3 = (java.lang.Integer) r3
                if (r3 == 0) goto L20
                int r3 = r3.intValue()
                goto L21
            L20:
                r3 = 0
            L21:
                if (r3 >= r2) goto L38
                java.lang.Object r4 = r5.get(r3)
                boolean r4 = io.reactivex.internal.util.NotificationLite.accept(r4, r0)
                if (r4 == 0) goto L2e
                goto L45
            L2e:
                boolean r4 = r6.isDisposed()
                if (r4 == 0) goto L35
                goto L45
            L35:
                int r3 = r3 + 1
                goto L21
            L38:
                java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
                r6.index = r2
                int r1 = -r1
                int r1 = r6.addAndGet(r1)
                if (r1 != 0) goto La
            L45:
                return
        }
    }

    static {
            io.reactivex.internal.operators.observable.ObservableReplay$1 r0 = new io.reactivex.internal.operators.observable.ObservableReplay$1
            r0.<init>()
            io.reactivex.internal.operators.observable.ObservableReplay.DEFAULT_UNBOUNDED_FACTORY = r0
            return
    }

    private ObservableReplay(io.reactivex.ObservableSource<T> r1, io.reactivex.ObservableSource<T> r2, java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableReplay.ReplayObserver<T>> r3, io.reactivex.internal.operators.observable.ObservableReplay.BufferSupplier<T> r4) {
            r0 = this;
            r0.<init>()
            r0.onSubscribe = r1
            r0.source = r2
            r0.current = r3
            r0.bufferFactory = r4
            return
    }

    public static <T> io.reactivex.observables.ConnectableObservable<T> create(io.reactivex.ObservableSource<T> r1, int r2) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r0) goto La
            io.reactivex.observables.ConnectableObservable r1 = createFrom(r1)
            return r1
        La:
            io.reactivex.internal.operators.observable.ObservableReplay$4 r0 = new io.reactivex.internal.operators.observable.ObservableReplay$4
            r0.<init>(r2)
            io.reactivex.observables.ConnectableObservable r1 = create(r1, r0)
            return r1
    }

    public static <T> io.reactivex.observables.ConnectableObservable<T> create(io.reactivex.ObservableSource<T> r6, long r7, java.util.concurrent.TimeUnit r9, io.reactivex.Scheduler r10) {
            r5 = 2147483647(0x7fffffff, float:NaN)
            r0 = r6
            r1 = r7
            r3 = r9
            r4 = r10
            io.reactivex.observables.ConnectableObservable r6 = create(r0, r1, r3, r4, r5)
            return r6
    }

    public static <T> io.reactivex.observables.ConnectableObservable<T> create(io.reactivex.ObservableSource<T> r6, long r7, java.util.concurrent.TimeUnit r9, io.reactivex.Scheduler r10, int r11) {
            io.reactivex.internal.operators.observable.ObservableReplay$5 r0 = new io.reactivex.internal.operators.observable.ObservableReplay$5
            r2 = r7
            r4 = r9
            r5 = r10
            r1 = r11
            r0.<init>(r1, r2, r4, r5)
            io.reactivex.observables.ConnectableObservable r6 = create(r6, r0)
            return r6
    }

    static <T> io.reactivex.observables.ConnectableObservable<T> create(io.reactivex.ObservableSource<T> r3, io.reactivex.internal.operators.observable.ObservableReplay.BufferSupplier<T> r4) {
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            io.reactivex.internal.operators.observable.ObservableReplay$6 r1 = new io.reactivex.internal.operators.observable.ObservableReplay$6
            r1.<init>(r0, r4)
            io.reactivex.internal.operators.observable.ObservableReplay r2 = new io.reactivex.internal.operators.observable.ObservableReplay
            r2.<init>(r1, r3, r0, r4)
            io.reactivex.observables.ConnectableObservable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r2)
            return r3
    }

    public static <T> io.reactivex.observables.ConnectableObservable<T> createFrom(io.reactivex.ObservableSource<? extends T> r1) {
            io.reactivex.internal.operators.observable.ObservableReplay$BufferSupplier r0 = io.reactivex.internal.operators.observable.ObservableReplay.DEFAULT_UNBOUNDED_FACTORY
            io.reactivex.observables.ConnectableObservable r1 = create(r1, r0)
            return r1
    }

    public static <U, R> io.reactivex.Observable<R> multicastSelector(java.util.concurrent.Callable<? extends io.reactivex.observables.ConnectableObservable<U>> r1, io.reactivex.functions.Function<? super io.reactivex.Observable<U>, ? extends io.reactivex.ObservableSource<R>> r2) {
            io.reactivex.internal.operators.observable.ObservableReplay$2 r0 = new io.reactivex.internal.operators.observable.ObservableReplay$2
            r0.<init>(r1, r2)
            io.reactivex.Observable r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    public static <T> io.reactivex.observables.ConnectableObservable<T> observeOn(io.reactivex.observables.ConnectableObservable<T> r1, io.reactivex.Scheduler r2) {
            io.reactivex.Observable r2 = r1.observeOn(r2)
            io.reactivex.internal.operators.observable.ObservableReplay$3 r0 = new io.reactivex.internal.operators.observable.ObservableReplay$3
            r0.<init>(r1, r2)
            io.reactivex.observables.ConnectableObservable r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @Override // io.reactivex.observables.ConnectableObservable
    public void connect(io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> r5) {
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableReplay$ReplayObserver<T>> r0 = r4.current
            java.lang.Object r0 = r0.get()
            io.reactivex.internal.operators.observable.ObservableReplay$ReplayObserver r0 = (io.reactivex.internal.operators.observable.ObservableReplay.ReplayObserver) r0
            if (r0 == 0) goto L10
            boolean r1 = r0.isDisposed()
            if (r1 == 0) goto L25
        L10:
            io.reactivex.internal.operators.observable.ObservableReplay$BufferSupplier<T> r1 = r4.bufferFactory
            io.reactivex.internal.operators.observable.ObservableReplay$ReplayBuffer r1 = r1.call()
            io.reactivex.internal.operators.observable.ObservableReplay$ReplayObserver r2 = new io.reactivex.internal.operators.observable.ObservableReplay$ReplayObserver
            r2.<init>(r1)
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableReplay$ReplayObserver<T>> r1 = r4.current
            boolean r0 = androidx.camera.view.p.a(r1, r0, r2)
            if (r0 != 0) goto L24
            goto L0
        L24:
            r0 = r2
        L25:
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.shouldConnect
            boolean r1 = r1.get()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L39
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.shouldConnect
            boolean r1 = r1.compareAndSet(r3, r2)
            if (r1 == 0) goto L39
            r1 = 1
            goto L3a
        L39:
            r1 = 0
        L3a:
            r5.accept(r0)     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L44
            io.reactivex.ObservableSource<T> r5 = r4.source
            r5.subscribe(r0)
        L44:
            return
        L45:
            r5 = move-exception
            if (r1 == 0) goto L4d
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.shouldConnect
            r0.compareAndSet(r2, r3)
        L4d:
            io.reactivex.exceptions.Exceptions.throwIfFatal(r5)
            java.lang.RuntimeException r5 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r5)
            throw r5
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamObservableSource
    public io.reactivex.ObservableSource<T> source() {
            r1 = this;
            io.reactivex.ObservableSource<T> r0 = r1.source
            return r0
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> r2) {
            r1 = this;
            io.reactivex.ObservableSource<T> r0 = r1.onSubscribe
            r0.subscribe(r2)
            return
    }
}
