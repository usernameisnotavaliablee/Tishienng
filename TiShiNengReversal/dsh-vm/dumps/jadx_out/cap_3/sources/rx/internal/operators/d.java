package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class d {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a<T> implements java.lang.Iterable<T> {
        final /* synthetic */ rx.e a;

        a(rx.e r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Iterable
        public java.util.Iterator<T> iterator() {
                r3 = this;
                rx.internal.operators.d$c r0 = new rx.internal.operators.d$c
                r0.<init>()
                rx.internal.operators.d$b r1 = new rx.internal.operators.d$b
                rx.e r2 = r3.a
                r1.<init>(r2, r0)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b<T> implements java.util.Iterator<T> {
        private final rx.internal.operators.d.c<T> a;
        private final rx.e<? extends T> b;
        private T c;
        private boolean d;
        private boolean e;
        private java.lang.Throwable f;
        private boolean g;

        b(rx.e<? extends T> r2, rx.internal.operators.d.c<T> r3) {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.d = r0
                r1.e = r0
                r1.b = r2
                r1.a = r3
                return
        }

        private boolean a() {
                r4 = this;
                boolean r0 = r4.g     // Catch: java.lang.InterruptedException -> L18
                r1 = 1
                if (r0 != 0) goto L1a
                r4.g = r1     // Catch: java.lang.InterruptedException -> L18
                rx.internal.operators.d$c<T> r0 = r4.a     // Catch: java.lang.InterruptedException -> L18
                r0.j(r1)     // Catch: java.lang.InterruptedException -> L18
                rx.e<? extends T> r0 = r4.b     // Catch: java.lang.InterruptedException -> L18
                rx.e r0 = r0.e3()     // Catch: java.lang.InterruptedException -> L18
                rx.internal.operators.d$c<T> r2 = r4.a     // Catch: java.lang.InterruptedException -> L18
                r0.r5(r2)     // Catch: java.lang.InterruptedException -> L18
                goto L1a
            L18:
                r0 = move-exception
                goto L52
            L1a:
                rx.internal.operators.d$c<T> r0 = r4.a     // Catch: java.lang.InterruptedException -> L18
                rx.Notification r0 = r0.s()     // Catch: java.lang.InterruptedException -> L18
                boolean r2 = r0.m()     // Catch: java.lang.InterruptedException -> L18
                r3 = 0
                if (r2 == 0) goto L30
                r4.e = r3     // Catch: java.lang.InterruptedException -> L18
                java.lang.Object r0 = r0.h()     // Catch: java.lang.InterruptedException -> L18
                r4.c = r0     // Catch: java.lang.InterruptedException -> L18
                return r1
            L30:
                r4.d = r3     // Catch: java.lang.InterruptedException -> L18
                boolean r1 = r0.k()     // Catch: java.lang.InterruptedException -> L18
                if (r1 == 0) goto L39
                return r3
            L39:
                boolean r1 = r0.l()     // Catch: java.lang.InterruptedException -> L18
                if (r1 == 0) goto L4a
                java.lang.Throwable r0 = r0.g()     // Catch: java.lang.InterruptedException -> L18
                r4.f = r0     // Catch: java.lang.InterruptedException -> L18
                java.lang.RuntimeException r0 = rx.exceptions.a.c(r0)     // Catch: java.lang.InterruptedException -> L18
                throw r0     // Catch: java.lang.InterruptedException -> L18
            L4a:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.InterruptedException -> L18
                java.lang.String r1 = "Should not reach here"
                r0.<init>(r1)     // Catch: java.lang.InterruptedException -> L18
                throw r0     // Catch: java.lang.InterruptedException -> L18
            L52:
                rx.internal.operators.d$c<T> r1 = r4.a
                r1.unsubscribe()
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
                r4.f = r0
                java.lang.RuntimeException r0 = rx.exceptions.a.c(r0)
                throw r0
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                java.lang.Throwable r0 = r2.f
                if (r0 != 0) goto L18
                boolean r0 = r2.d
                r1 = 0
                if (r0 != 0) goto La
                return r1
            La:
                boolean r0 = r2.e
                if (r0 == 0) goto L16
                boolean r0 = r2.a()
                if (r0 == 0) goto L15
                goto L16
            L15:
                return r1
            L16:
                r0 = 1
                return r0
            L18:
                java.lang.RuntimeException r0 = rx.exceptions.a.c(r0)
                throw r0
        }

        @Override // java.util.Iterator
        public T next() {
                r2 = this;
                java.lang.Throwable r0 = r2.f
                if (r0 != 0) goto L18
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L10
                r0 = 1
                r2.e = r0
                T r0 = r2.c
                return r0
            L10:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                java.lang.String r1 = "No more elements"
                r0.<init>(r1)
                throw r0
            L18:
                java.lang.RuntimeException r0 = rx.exceptions.a.c(r0)
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
    static final class c<T> extends rx.l<rx.Notification<? extends T>> {
        private final java.util.concurrent.BlockingQueue<rx.Notification<? extends T>> a;
        final java.util.concurrent.atomic.AtomicInteger b;

        c() {
                r2 = this;
                r2.<init>()
                java.util.concurrent.ArrayBlockingQueue r0 = new java.util.concurrent.ArrayBlockingQueue
                r1 = 1
                r0.<init>(r1)
                r2.a = r0
                java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
                r0.<init>()
                r2.b = r0
                return
        }

        public void g(rx.Notification<? extends T> r3) {
                r2 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r2.b
                r1 = 0
                int r0 = r0.getAndSet(r1)
                r1 = 1
                if (r0 == r1) goto L10
                boolean r0 = r3.m()
                if (r0 != 0) goto L2a
            L10:
                java.util.concurrent.BlockingQueue<rx.Notification<? extends T>> r0 = r2.a
                boolean r0 = r0.offer(r3)
                if (r0 != 0) goto L2a
                java.util.concurrent.BlockingQueue<rx.Notification<? extends T>> r0 = r2.a
                java.lang.Object r0 = r0.poll()
                rx.Notification r0 = (rx.Notification) r0
                if (r0 == 0) goto L10
                boolean r1 = r0.m()
                if (r1 != 0) goto L10
                r3 = r0
                goto L10
            L2a:
                return
        }

        void j(int r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r1.b
                r0.set(r2)
                return
        }

        public void onCompleted() {
                r0 = this;
                return
        }

        public void onError(java.lang.Throwable r1) {
                r0 = this;
                return
        }

        public /* bridge */ /* synthetic */ void onNext(java.lang.Object r1) {
                r0 = this;
                rx.Notification r1 = (rx.Notification) r1
                r0.g(r1)
                return
        }

        public rx.Notification<? extends T> s() throws java.lang.InterruptedException {
                r1 = this;
                r0 = 1
                r1.j(r0)
                java.util.concurrent.BlockingQueue<rx.Notification<? extends T>> r0 = r1.a
                java.lang.Object r0 = r0.take()
                rx.Notification r0 = (rx.Notification) r0
                return r0
        }
    }

    private d() {
            r2 = this;
            r2.<init>()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No instances!"
            r0.<init>(r1)
            throw r0
    }

    public static <T> java.lang.Iterable<T> a(rx.e<? extends T> r1) {
            rx.internal.operators.d$a r0 = new rx.internal.operators.d$a
            r0.<init>(r1)
            return r0
    }
}
