package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class f {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a<T> extends rx.l<rx.Notification<? extends T>> implements java.util.Iterator<T> {
        static final int d = 0;
        private final java.util.concurrent.BlockingQueue<rx.Notification<? extends T>> a;
        private rx.Notification<? extends T> b;
        private int c;

        static {
                int r0 = rx.internal.util.j.d
                int r0 = r0 * 3
                int r0 = r0 / 4
                rx.internal.operators.f.a.d = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
                r0.<init>()
                r1.a = r0
                return
        }

        private rx.Notification<? extends T> j() {
                r1 = this;
                java.util.concurrent.BlockingQueue<rx.Notification<? extends T>> r0 = r1.a     // Catch: java.lang.InterruptedException -> L14
                java.lang.Object r0 = r0.poll()     // Catch: java.lang.InterruptedException -> L14
                rx.Notification r0 = (rx.Notification) r0     // Catch: java.lang.InterruptedException -> L14
                if (r0 == 0) goto Lb
                return r0
            Lb:
                java.util.concurrent.BlockingQueue<rx.Notification<? extends T>> r0 = r1.a     // Catch: java.lang.InterruptedException -> L14
                java.lang.Object r0 = r0.take()     // Catch: java.lang.InterruptedException -> L14
                rx.Notification r0 = (rx.Notification) r0     // Catch: java.lang.InterruptedException -> L14
                return r0
            L14:
                r0 = move-exception
                r1.unsubscribe()
                java.lang.RuntimeException r0 = rx.exceptions.a.c(r0)
                throw r0
        }

        public void g(rx.Notification<? extends T> r2) {
                r1 = this;
                java.util.concurrent.BlockingQueue<rx.Notification<? extends T>> r0 = r1.a
                r0.offer(r2)
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                rx.Notification<? extends T> r0 = r2.b
                if (r0 != 0) goto L1b
                rx.Notification r0 = r2.j()
                r2.b = r0
                int r0 = r2.c
                int r0 = r0 + 1
                r2.c = r0
                int r1 = rx.internal.operators.f.a.d
                if (r0 < r1) goto L1b
                long r0 = (long) r0
                r2.request(r0)
                r0 = 0
                r2.c = r0
            L1b:
                rx.Notification<? extends T> r0 = r2.b
                boolean r0 = r0.l()
                if (r0 != 0) goto L2c
                rx.Notification<? extends T> r0 = r2.b
                boolean r0 = r0.k()
                r0 = r0 ^ 1
                return r0
            L2c:
                rx.Notification<? extends T> r0 = r2.b
                java.lang.Throwable r0 = r0.g()
                java.lang.RuntimeException r0 = rx.exceptions.a.c(r0)
                throw r0
        }

        @Override // java.util.Iterator
        public T next() {
                r2 = this;
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L10
                rx.Notification<? extends T> r0 = r2.b
                java.lang.Object r0 = r0.h()
                r1 = 0
                r2.b = r1
                return r0
            L10:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        public void onCompleted() {
                r0 = this;
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                java.util.concurrent.BlockingQueue<rx.Notification<? extends T>> r0 = r1.a
                rx.Notification r2 = rx.Notification.d(r2)
                r0.offer(r2)
                return
        }

        public /* bridge */ /* synthetic */ void onNext(java.lang.Object r1) {
                r0 = this;
                rx.Notification r1 = (rx.Notification) r1
                r0.g(r1)
                return
        }

        public void onStart() {
                r2 = this;
                int r0 = rx.internal.util.j.d
                long r0 = (long) r0
                r2.request(r0)
                return
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Read-only iterator"
                r0.<init>(r1)
                throw r0
        }
    }

    private f() {
            r2 = this;
            r2.<init>()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No instances!"
            r0.<init>(r1)
            throw r0
    }

    public static <T> java.util.Iterator<T> a(rx.e<? extends T> r1) {
            rx.internal.operators.f$a r0 = new rx.internal.operators.f$a
            r0.<init>()
            rx.e r1 = r1.e3()
            r1.r5(r0)
            return r0
    }
}
