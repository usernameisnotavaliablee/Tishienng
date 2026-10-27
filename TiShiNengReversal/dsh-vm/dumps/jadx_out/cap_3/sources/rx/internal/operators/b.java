package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class b {

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
                r2 = this;
                rx.internal.operators.b$b r0 = new rx.internal.operators.b$b
                r0.<init>()
                rx.e r1 = r2.a
                rx.e r1 = r1.e3()
                r1.r5(r0)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: rx.internal.operators.b$b, reason: collision with other inner class name */
    static final class C0004b<T> extends rx.l<rx.Notification<? extends T>> implements java.util.Iterator<T> {
        final java.util.concurrent.Semaphore a;
        final java.util.concurrent.atomic.AtomicReference<rx.Notification<? extends T>> b;
        rx.Notification<? extends T> c;

        C0004b() {
                r2 = this;
                r2.<init>()
                java.util.concurrent.Semaphore r0 = new java.util.concurrent.Semaphore
                r1 = 0
                r0.<init>(r1)
                r2.a = r0
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                r0.<init>()
                r2.b = r0
                return
        }

        public void g(rx.Notification<? extends T> r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<rx.Notification<? extends T>> r0 = r1.b
                java.lang.Object r2 = r0.getAndSet(r2)
                if (r2 != 0) goto Ld
                java.util.concurrent.Semaphore r2 = r1.a
                r2.release()
            Ld:
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                rx.Notification<? extends T> r0 = r2.c
                if (r0 == 0) goto L16
                boolean r0 = r0.l()
                if (r0 != 0) goto Lb
                goto L16
            Lb:
                rx.Notification<? extends T> r0 = r2.c
                java.lang.Throwable r0 = r0.g()
                java.lang.RuntimeException r0 = rx.exceptions.a.c(r0)
                throw r0
            L16:
                rx.Notification<? extends T> r0 = r2.c
                if (r0 == 0) goto L20
                boolean r0 = r0.k()
                if (r0 != 0) goto L5c
            L20:
                rx.Notification<? extends T> r0 = r2.c
                if (r0 != 0) goto L5c
                java.util.concurrent.Semaphore r0 = r2.a     // Catch: java.lang.InterruptedException -> L46
                r0.acquire()     // Catch: java.lang.InterruptedException -> L46
                java.util.concurrent.atomic.AtomicReference<rx.Notification<? extends T>> r0 = r2.b
                r1 = 0
                java.lang.Object r0 = r0.getAndSet(r1)
                rx.Notification r0 = (rx.Notification) r0
                r2.c = r0
                boolean r0 = r0.l()
                if (r0 != 0) goto L3b
                goto L5c
            L3b:
                rx.Notification<? extends T> r0 = r2.c
                java.lang.Throwable r0 = r0.g()
                java.lang.RuntimeException r0 = rx.exceptions.a.c(r0)
                throw r0
            L46:
                r0 = move-exception
                r2.unsubscribe()
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
                rx.Notification r1 = rx.Notification.d(r0)
                r2.c = r1
                java.lang.RuntimeException r0 = rx.exceptions.a.c(r0)
                throw r0
            L5c:
                rx.Notification<? extends T> r0 = r2.c
                boolean r0 = r0.k()
                r0 = r0 ^ 1
                return r0
        }

        @Override // java.util.Iterator
        public T next() {
                r2 = this;
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L18
                rx.Notification<? extends T> r0 = r2.c
                boolean r0 = r0.m()
                if (r0 == 0) goto L18
                rx.Notification<? extends T> r0 = r2.c
                java.lang.Object r0 = r0.h()
                r1 = 0
                r2.c = r1
                return r0
            L18:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
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

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Read-only iterator."
                r0.<init>(r1)
                throw r0
        }
    }

    private b() {
            r2 = this;
            r2.<init>()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No instances!"
            r0.<init>(r1)
            throw r0
    }

    public static <T> java.lang.Iterable<T> a(rx.e<? extends T> r1) {
            rx.internal.operators.b$a r0 = new rx.internal.operators.b$a
            r0.<init>(r1)
            return r0
    }
}
