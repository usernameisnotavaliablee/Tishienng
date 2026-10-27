package io.reactivex.internal.operators.observable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ObservableFromArray<T> extends io.reactivex.Observable<T> {
    final T[] array;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class FromArrayDisposable<T> extends io.reactivex.internal.observers.BasicQueueDisposable<T> {
        final io.reactivex.Observer<? super T> actual;
        final T[] array;
        volatile boolean disposed;
        boolean fusionMode;
        int index;

        FromArrayDisposable(io.reactivex.Observer<? super T> r1, T[] r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.array = r2
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
                r1 = this;
                T[] r0 = r1.array
                int r0 = r0.length
                r1.index = r0
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

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
                r2 = this;
                int r0 = r2.index
                T[] r1 = r2.array
                int r1 = r1.length
                if (r0 != r1) goto L9
                r0 = 1
                return r0
            L9:
                r0 = 0
                return r0
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public T poll() {
                r3 = this;
                int r0 = r3.index
                T[] r1 = r3.array
                int r2 = r1.length
                if (r0 == r2) goto L14
                int r2 = r0 + 1
                r3.index = r2
                r0 = r1[r0]
                java.lang.String r1 = "The array element is null"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)
                return r0
            L14:
                r0 = 0
                return r0
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int r2) {
                r1 = this;
                r0 = 1
                r2 = r2 & r0
                if (r2 == 0) goto L7
                r1.fusionMode = r0
                return r0
            L7:
                r2 = 0
                return r2
        }

        void run() {
                r5 = this;
                T[] r0 = r5.array
                int r1 = r0.length
                r2 = 0
            L4:
                if (r2 >= r1) goto L39
                boolean r3 = r5.isDisposed()
                if (r3 != 0) goto L39
                r3 = r0[r2]
                if (r3 != 0) goto L31
                io.reactivex.Observer<? super T> r0 = r5.actual
                java.lang.NullPointerException r1 = new java.lang.NullPointerException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "The "
                r3.append(r4)
                r3.append(r2)
                java.lang.String r2 = "th element is null"
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                r1.<init>(r2)
                r0.onError(r1)
                return
            L31:
                io.reactivex.Observer<? super T> r4 = r5.actual
                r4.onNext(r3)
                int r2 = r2 + 1
                goto L4
            L39:
                boolean r0 = r5.isDisposed()
                if (r0 != 0) goto L44
                io.reactivex.Observer<? super T> r0 = r5.actual
                r0.onComplete()
            L44:
                return
        }
    }

    public ObservableFromArray(T[] r1) {
            r0 = this;
            r0.<init>()
            r0.array = r1
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> r3) {
            r2 = this;
            io.reactivex.internal.operators.observable.ObservableFromArray$FromArrayDisposable r0 = new io.reactivex.internal.operators.observable.ObservableFromArray$FromArrayDisposable
            T[] r1 = r2.array
            r0.<init>(r3, r1)
            r3.onSubscribe(r0)
            boolean r3 = r0.fusionMode
            if (r3 == 0) goto Lf
            return
        Lf:
            r0.run()
            return
    }
}
