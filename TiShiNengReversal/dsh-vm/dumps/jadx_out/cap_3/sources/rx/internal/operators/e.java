package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class e {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a<T> extends rx.l<T> {
        final /* synthetic */ java.util.concurrent.CountDownLatch a;
        final /* synthetic */ java.util.concurrent.atomic.AtomicReference b;
        final /* synthetic */ java.util.concurrent.atomic.AtomicReference c;

        a(java.util.concurrent.CountDownLatch r1, java.util.concurrent.atomic.AtomicReference r2, java.util.concurrent.atomic.AtomicReference r3) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.<init>()
                return
        }

        public void onCompleted() {
                r1 = this;
                java.util.concurrent.CountDownLatch r0 = r1.a
                r0.countDown()
                return
        }

        public void onError(java.lang.Throwable r3) {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference r0 = r2.b
                r1 = 0
                androidx.camera.view.p.a(r0, r1, r3)
                java.util.concurrent.CountDownLatch r3 = r2.a
                r3.countDown()
                return
        }

        public void onNext(T r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference r0 = r1.c
                r0.set(r2)
                return
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class b<T> implements java.util.concurrent.Future<T> {
        private volatile boolean a;
        final /* synthetic */ java.util.concurrent.CountDownLatch b;
        final /* synthetic */ rx.m c;
        final /* synthetic */ java.util.concurrent.atomic.AtomicReference d;
        final /* synthetic */ java.util.concurrent.atomic.AtomicReference e;

        b(java.util.concurrent.CountDownLatch r1, rx.m r2, java.util.concurrent.atomic.AtomicReference r3, java.util.concurrent.atomic.AtomicReference r4) {
                r0 = this;
                r0.b = r1
                r0.c = r2
                r0.d = r3
                r0.e = r4
                r0.<init>()
                return
        }

        private T a() throws java.util.concurrent.ExecutionException {
                r3 = this;
                java.util.concurrent.atomic.AtomicReference r0 = r3.d
                java.lang.Object r0 = r0.get()
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                if (r0 != 0) goto L1d
                boolean r0 = r3.a
                if (r0 != 0) goto L15
                java.util.concurrent.atomic.AtomicReference r0 = r3.e
                java.lang.Object r0 = r0.get()
                return r0
            L15:
                java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
                java.lang.String r1 = "Subscription unsubscribed"
                r0.<init>(r1)
                throw r0
            L1d:
                java.util.concurrent.ExecutionException r1 = new java.util.concurrent.ExecutionException
                java.lang.String r2 = "Observable onError"
                r1.<init>(r2, r0)
                throw r1
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean r5) {
                r4 = this;
                java.util.concurrent.CountDownLatch r5 = r4.b
                long r0 = r5.getCount()
                r2 = 0
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 <= 0) goto L1a
                r5 = 1
                r4.a = r5
                rx.m r0 = r4.c
                r0.unsubscribe()
                java.util.concurrent.CountDownLatch r0 = r4.b
                r0.countDown()
                return r5
            L1a:
                r5 = 0
                return r5
        }

        @Override // java.util.concurrent.Future
        public T get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
                r1 = this;
                java.util.concurrent.CountDownLatch r0 = r1.b
                r0.await()
                java.lang.Object r0 = r1.a()
                return r0
        }

        @Override // java.util.concurrent.Future
        public T get(long r4, java.util.concurrent.TimeUnit r6) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
                r3 = this;
                java.util.concurrent.CountDownLatch r0 = r3.b
                boolean r0 = r0.await(r4, r6)
                if (r0 == 0) goto Ld
                java.lang.Object r4 = r3.a()
                return r4
            Ld:
                java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Timed out after "
                r1.append(r2)
                long r4 = r6.toMillis(r4)
                r1.append(r4)
                java.lang.String r4 = "ms waiting for underlying Observable."
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
                r1 = this;
                boolean r0 = r1.a
                return r0
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
                r5 = this;
                java.util.concurrent.CountDownLatch r0 = r5.b
                long r0 = r0.getCount()
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto Le
                r0 = 1
                return r0
            Le:
                r0 = 0
                return r0
        }
    }

    private e() {
            r2 = this;
            r2.<init>()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No instances!"
            r0.<init>(r1)
            throw r0
    }

    public static <T> java.util.concurrent.Future<T> a(rx.e<? extends T> r4) {
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r1 = 1
            r0.<init>(r1)
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r2.<init>()
            rx.e r4 = r4.Q4()
            rx.internal.operators.e$a r3 = new rx.internal.operators.e$a
            r3.<init>(r0, r2, r1)
            rx.m r4 = r4.r5(r3)
            rx.internal.operators.e$b r3 = new rx.internal.operators.e$b
            r3.<init>(r0, r4, r2, r1)
            return r3
    }
}
