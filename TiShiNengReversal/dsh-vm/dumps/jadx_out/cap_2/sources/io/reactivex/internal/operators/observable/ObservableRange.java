package io.reactivex.internal.operators.observable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ObservableRange extends io.reactivex.Observable<java.lang.Integer> {
    private final long end;
    private final int start;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class RangeDisposable extends io.reactivex.internal.observers.BasicIntQueueDisposable<java.lang.Integer> {
        private static final long serialVersionUID = 396518478098735504L;
        final io.reactivex.Observer<? super java.lang.Integer> actual;
        final long end;
        boolean fused;
        long index;

        RangeDisposable(io.reactivex.Observer<? super java.lang.Integer> r1, long r2, long r4) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.index = r2
                r0.end = r4
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
                r2 = this;
                long r0 = r2.end
                r2.index = r0
                r0 = 1
                r2.lazySet(r0)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                r0 = 1
                r1.set(r0)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                int r0 = r1.get()
                if (r0 == 0) goto L8
                r0 = 1
                return r0
            L8:
                r0 = 0
                return r0
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
                r5 = this;
                long r0 = r5.index
                long r2 = r5.end
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto La
                r0 = 1
                return r0
            La:
                r0 = 0
                return r0
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public java.lang.Integer poll() throws java.lang.Exception {
                r5 = this;
                long r0 = r5.index
                long r2 = r5.end
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L13
                r2 = 1
                long r2 = r2 + r0
                r5.index = r2
                int r1 = (int) r0
                java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
                return r0
            L13:
                r0 = 1
                r5.lazySet(r0)
                r0 = 0
                return r0
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public /* bridge */ /* synthetic */ java.lang.Object poll() throws java.lang.Exception {
                r1 = this;
                java.lang.Integer r0 = r1.poll()
                return r0
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int r2) {
                r1 = this;
                r0 = 1
                r2 = r2 & r0
                if (r2 == 0) goto L7
                r1.fused = r0
                return r0
            L7:
                r2 = 0
                return r2
        }

        void run() {
                r7 = this;
                boolean r0 = r7.fused
                if (r0 == 0) goto L5
                goto L2e
            L5:
                io.reactivex.Observer<? super java.lang.Integer> r0 = r7.actual
                long r1 = r7.end
                long r3 = r7.index
            Lb:
                int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r5 == 0) goto L21
                int r5 = r7.get()
                if (r5 != 0) goto L21
                int r5 = (int) r3
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r0.onNext(r5)
                r5 = 1
                long r3 = r3 + r5
                goto Lb
            L21:
                int r1 = r7.get()
                if (r1 != 0) goto L2e
                r1 = 1
                r7.lazySet(r1)
                r0.onComplete()
            L2e:
                return
        }
    }

    public ObservableRange(int r3, int r4) {
            r2 = this;
            r2.<init>()
            r2.start = r3
            long r0 = (long) r3
            long r3 = (long) r4
            long r0 = r0 + r3
            r2.end = r0
            return
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super java.lang.Integer> r7) {
            r6 = this;
            io.reactivex.internal.operators.observable.ObservableRange$RangeDisposable r0 = new io.reactivex.internal.operators.observable.ObservableRange$RangeDisposable
            int r1 = r6.start
            long r2 = (long) r1
            long r4 = r6.end
            r1 = r7
            r0.<init>(r1, r2, r4)
            r1.onSubscribe(r0)
            r0.run()
            return
    }
}
