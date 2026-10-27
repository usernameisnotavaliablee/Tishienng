package io.reactivex.internal.operators.maybe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class MaybeDelay<T> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, T> {
    final long delay;
    final io.reactivex.Scheduler scheduler;
    final java.util.concurrent.TimeUnit unit;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class DelayMaybeObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable, java.lang.Runnable {
        private static final long serialVersionUID = 5566860102500855068L;
        final io.reactivex.MaybeObserver<? super T> actual;
        final long delay;
        java.lang.Throwable error;
        final io.reactivex.Scheduler scheduler;
        final java.util.concurrent.TimeUnit unit;
        T value;

        DelayMaybeObserver(io.reactivex.MaybeObserver<? super T> r1, long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler r5) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.delay = r2
                r0.unit = r4
                r0.scheduler = r5
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                java.lang.Object r0 = r1.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.isDisposed(r0)
                return r0
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
                r0 = this;
                r0.schedule()
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(java.lang.Throwable r1) {
                r0 = this;
                r0.error = r1
                r0.schedule()
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                boolean r1 = io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                if (r1 == 0) goto Lb
                io.reactivex.MaybeObserver<? super T> r1 = r0.actual
                r1.onSubscribe(r0)
            Lb:
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T r1) {
                r0 = this;
                r0.value = r1
                r0.schedule()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                java.lang.Throwable r0 = r2.error
                if (r0 == 0) goto La
                io.reactivex.MaybeObserver<? super T> r1 = r2.actual
                r1.onError(r0)
                return
            La:
                T r0 = r2.value
                if (r0 == 0) goto L14
                io.reactivex.MaybeObserver<? super T> r1 = r2.actual
                r1.onSuccess(r0)
                return
            L14:
                io.reactivex.MaybeObserver<? super T> r0 = r2.actual
                r0.onComplete()
                return
        }

        void schedule() {
                r4 = this;
                io.reactivex.Scheduler r0 = r4.scheduler
                long r1 = r4.delay
                java.util.concurrent.TimeUnit r3 = r4.unit
                io.reactivex.disposables.Disposable r0 = r0.scheduleDirect(r4, r1, r3)
                io.reactivex.internal.disposables.DisposableHelper.replace(r4, r0)
                return
        }
    }

    public MaybeDelay(io.reactivex.MaybeSource<T> r1, long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler r5) {
            r0 = this;
            r0.<init>(r1)
            r0.delay = r2
            r0.unit = r4
            r0.scheduler = r5
            return
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> r8) {
            r7 = this;
            io.reactivex.MaybeSource<T> r0 = r7.source
            io.reactivex.internal.operators.maybe.MaybeDelay$DelayMaybeObserver r1 = new io.reactivex.internal.operators.maybe.MaybeDelay$DelayMaybeObserver
            long r3 = r7.delay
            java.util.concurrent.TimeUnit r5 = r7.unit
            io.reactivex.Scheduler r6 = r7.scheduler
            r2 = r8
            r1.<init>(r2, r3, r5, r6)
            r0.subscribe(r1)
            return
    }
}
