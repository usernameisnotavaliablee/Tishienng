package rx.internal.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class e<E> implements rx.m {
    static final int e = 0;
    private final rx.internal.util.e.a<E> a;
    private final rx.internal.util.e.b b;
    final java.util.concurrent.atomic.AtomicInteger c;
    final java.util.concurrent.atomic.AtomicInteger d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a<E> {
        final java.util.concurrent.atomic.AtomicReferenceArray<E> a;
        final java.util.concurrent.atomic.AtomicReference<rx.internal.util.e.a<E>> b;

        a() {
                r2 = this;
                r2.<init>()
                java.util.concurrent.atomic.AtomicReferenceArray r0 = new java.util.concurrent.atomic.AtomicReferenceArray
                int r1 = rx.internal.util.e.e
                r0.<init>(r1)
                r2.a = r0
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                r0.<init>()
                r2.b = r0
                return
        }

        rx.internal.util.e.a<E> a() {
                r3 = this;
                java.util.concurrent.atomic.AtomicReference<rx.internal.util.e$a<E>> r0 = r3.b
                java.lang.Object r0 = r0.get()
                if (r0 == 0) goto L11
                java.util.concurrent.atomic.AtomicReference<rx.internal.util.e$a<E>> r0 = r3.b
                java.lang.Object r0 = r0.get()
                rx.internal.util.e$a r0 = (rx.internal.util.e.a) r0
                return r0
            L11:
                rx.internal.util.e$a r0 = new rx.internal.util.e$a
                r0.<init>()
                java.util.concurrent.atomic.AtomicReference<rx.internal.util.e$a<E>> r1 = r3.b
                r2 = 0
                boolean r1 = androidx.camera.view.p.a(r1, r2, r0)
                if (r1 == 0) goto L20
                return r0
            L20:
                java.util.concurrent.atomic.AtomicReference<rx.internal.util.e$a<E>> r0 = r3.b
                java.lang.Object r0 = r0.get()
                rx.internal.util.e$a r0 = (rx.internal.util.e.a) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class b {
        private final java.util.concurrent.atomic.AtomicIntegerArray a;
        private final java.util.concurrent.atomic.AtomicReference<rx.internal.util.e.b> b;

        b() {
                r2 = this;
                r2.<init>()
                java.util.concurrent.atomic.AtomicIntegerArray r0 = new java.util.concurrent.atomic.AtomicIntegerArray
                int r1 = rx.internal.util.e.e
                r0.<init>(r1)
                r2.a = r0
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                r0.<init>()
                r2.b = r0
                return
        }

        public int a(int r2, int r3) {
                r1 = this;
                java.util.concurrent.atomic.AtomicIntegerArray r0 = r1.a
                int r2 = r0.getAndSet(r2, r3)
                return r2
        }

        rx.internal.util.e.b b() {
                r3 = this;
                java.util.concurrent.atomic.AtomicReference<rx.internal.util.e$b> r0 = r3.b
                java.lang.Object r0 = r0.get()
                if (r0 == 0) goto L11
                java.util.concurrent.atomic.AtomicReference<rx.internal.util.e$b> r0 = r3.b
                java.lang.Object r0 = r0.get()
                rx.internal.util.e$b r0 = (rx.internal.util.e.b) r0
                return r0
            L11:
                rx.internal.util.e$b r0 = new rx.internal.util.e$b
                r0.<init>()
                java.util.concurrent.atomic.AtomicReference<rx.internal.util.e$b> r1 = r3.b
                r2 = 0
                boolean r1 = androidx.camera.view.p.a(r1, r2, r0)
                if (r1 == 0) goto L20
                return r0
            L20:
                java.util.concurrent.atomic.AtomicReference<rx.internal.util.e$b> r0 = r3.b
                java.lang.Object r0 = r0.get()
                rx.internal.util.e$b r0 = (rx.internal.util.e.b) r0
                return r0
        }

        public void c(int r2, int r3) {
                r1 = this;
                java.util.concurrent.atomic.AtomicIntegerArray r0 = r1.a
                r0.set(r2, r3)
                return
        }
    }

    static {
            boolean r0 = rx.internal.util.i.b()
            if (r0 == 0) goto L9
            r0 = 8
            goto Lb
        L9:
            r0 = 128(0x80, float:1.8E-43)
        Lb:
            java.lang.String r1 = "rx.indexed-ring-buffer.size"
            java.lang.String r1 = java.lang.System.getProperty(r1)
            if (r1 == 0) goto L21
            int r0 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L18
            goto L21
        L18:
            r1 = move-exception
            java.io.PrintStream r2 = java.lang.System.err
            r1.getMessage()
            r2.getClass()
        L21:
            rx.internal.util.e.e = r0
            return
    }

    e() {
            r1 = this;
            r1.<init>()
            rx.internal.util.e$a r0 = new rx.internal.util.e$a
            r0.<init>()
            r1.a = r0
            rx.internal.util.e$b r0 = new rx.internal.util.e$b
            r0.<init>()
            r1.b = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            r1.c = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            r1.d = r0
            return
    }

    public static <T> rx.internal.util.e<T> A() {
            rx.internal.util.e r0 = new rx.internal.util.e
            r0.<init>()
            return r0
    }

    private synchronized void B(int r3) {
            r2 = this;
            monitor-enter(r2)
            java.util.concurrent.atomic.AtomicInteger r0 = r2.d     // Catch: java.lang.Throwable -> L11
            int r0 = r0.getAndIncrement()     // Catch: java.lang.Throwable -> L11
            int r1 = rx.internal.util.e.e     // Catch: java.lang.Throwable -> L11
            if (r0 >= r1) goto L13
            rx.internal.util.e$b r1 = r2.b     // Catch: java.lang.Throwable -> L11
            r1.c(r0, r3)     // Catch: java.lang.Throwable -> L11
            goto L1c
        L11:
            r3 = move-exception
            goto L1e
        L13:
            int r1 = r0 % r1
            rx.internal.util.e$b r0 = r2.s(r0)     // Catch: java.lang.Throwable -> L11
            r0.c(r1, r3)     // Catch: java.lang.Throwable -> L11
        L1c:
            monitor-exit(r2)
            return
        L1e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L11
            throw r3
    }

    private int e(rx.functions.p<? super E, java.lang.Boolean> r6, int r7, int r8) {
            r5 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r5.c
            int r0 = r0.get()
            rx.internal.util.e$a<E> r1 = r5.a
            int r2 = rx.internal.util.e.e
            if (r7 < r2) goto L17
            rx.internal.util.e$a r1 = r5.f(r7)
            int r2 = r7 % r2
            r4 = r1
            r1 = r7
            r7 = r2
            r2 = r4
            goto L19
        L17:
            r2 = r1
            r1 = r7
        L19:
            if (r2 == 0) goto L4b
        L1b:
            int r3 = rx.internal.util.e.e
            if (r7 >= r3) goto L40
            if (r1 >= r0) goto L3f
            if (r1 < r8) goto L24
            goto L3f
        L24:
            java.util.concurrent.atomic.AtomicReferenceArray<E> r3 = r2.a
            java.lang.Object r3 = r3.get(r7)
            if (r3 != 0) goto L2d
            goto L3a
        L2d:
            java.lang.Object r3 = r6.call(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L3a
            goto L3f
        L3a:
            int r7 = r7 + 1
            int r1 = r1 + 1
            goto L1b
        L3f:
            return r1
        L40:
            java.util.concurrent.atomic.AtomicReference<rx.internal.util.e$a<E>> r7 = r2.b
            java.lang.Object r7 = r7.get()
            r2 = r7
            rx.internal.util.e$a r2 = (rx.internal.util.e.a) r2
            r7 = 0
            goto L19
        L4b:
            return r1
    }

    private rx.internal.util.e.a<E> f(int r3) {
            r2 = this;
            int r0 = rx.internal.util.e.e
            if (r3 >= r0) goto L7
            rx.internal.util.e$a<E> r3 = r2.a
            return r3
        L7:
            int r3 = r3 / r0
            rx.internal.util.e$a<E> r0 = r2.a
            r1 = 0
        Lb:
            if (r1 >= r3) goto L14
            rx.internal.util.e$a r0 = r0.a()
            int r1 = r1 + 1
            goto Lb
        L14:
            return r0
    }

    private synchronized int g() {
            r3 = this;
            monitor-enter(r3)
            int r0 = r3.j()     // Catch: java.lang.Throwable -> L13
            if (r0 < 0) goto L2d
            int r1 = rx.internal.util.e.e     // Catch: java.lang.Throwable -> L13
            r2 = -1
            if (r0 >= r1) goto L15
            rx.internal.util.e$b r1 = r3.b     // Catch: java.lang.Throwable -> L13
            int r0 = r1.a(r0, r2)     // Catch: java.lang.Throwable -> L13
            goto L1f
        L13:
            r0 = move-exception
            goto L35
        L15:
            int r1 = r0 % r1
            rx.internal.util.e$b r0 = r3.s(r0)     // Catch: java.lang.Throwable -> L13
            int r0 = r0.a(r1, r2)     // Catch: java.lang.Throwable -> L13
        L1f:
            java.util.concurrent.atomic.AtomicInteger r1 = r3.c     // Catch: java.lang.Throwable -> L13
            int r1 = r1.get()     // Catch: java.lang.Throwable -> L13
            if (r0 != r1) goto L33
            java.util.concurrent.atomic.AtomicInteger r1 = r3.c     // Catch: java.lang.Throwable -> L13
            r1.getAndIncrement()     // Catch: java.lang.Throwable -> L13
            goto L33
        L2d:
            java.util.concurrent.atomic.AtomicInteger r0 = r3.c     // Catch: java.lang.Throwable -> L13
            int r0 = r0.getAndIncrement()     // Catch: java.lang.Throwable -> L13
        L33:
            monitor-exit(r3)
            return r0
        L35:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L13
            throw r0
    }

    private synchronized int j() {
            r3 = this;
            monitor-enter(r3)
        L1:
            java.util.concurrent.atomic.AtomicInteger r0 = r3.d     // Catch: java.lang.Throwable -> L15
            int r0 = r0.get()     // Catch: java.lang.Throwable -> L15
            if (r0 <= 0) goto L17
            java.util.concurrent.atomic.AtomicInteger r1 = r3.d     // Catch: java.lang.Throwable -> L15
            int r2 = r0 + (-1)
            boolean r0 = r1.compareAndSet(r0, r2)     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L1
            monitor-exit(r3)
            return r2
        L15:
            r0 = move-exception
            goto L1a
        L17:
            monitor-exit(r3)
            r0 = -1
            return r0
        L1a:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L15
            throw r0
    }

    private rx.internal.util.e.b s(int r3) {
            r2 = this;
            int r0 = rx.internal.util.e.e
            if (r3 >= r0) goto L7
            rx.internal.util.e$b r3 = r2.b
            return r3
        L7:
            int r3 = r3 / r0
            rx.internal.util.e$b r0 = r2.b
            r1 = 0
        Lb:
            if (r1 >= r3) goto L14
            rx.internal.util.e$b r0 = r0.b()
            int r1 = r1 + 1
            goto Lb
        L14:
            return r0
    }

    public void G() {
            r7 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r7.c
            int r0 = r0.get()
            rx.internal.util.e$a<E> r1 = r7.a
            r2 = 0
            r3 = 0
        La:
            if (r1 == 0) goto L28
            r4 = 0
        Ld:
            int r5 = rx.internal.util.e.e
            if (r4 >= r5) goto L1f
            if (r3 < r0) goto L14
            goto L28
        L14:
            java.util.concurrent.atomic.AtomicReferenceArray<E> r5 = r1.a
            r6 = 0
            r5.set(r4, r6)
            int r4 = r4 + 1
            int r3 = r3 + 1
            goto Ld
        L1f:
            java.util.concurrent.atomic.AtomicReference<rx.internal.util.e$a<E>> r1 = r1.b
            java.lang.Object r1 = r1.get()
            rx.internal.util.e$a r1 = (rx.internal.util.e.a) r1
            goto La
        L28:
            java.util.concurrent.atomic.AtomicInteger r0 = r7.c
            r0.set(r2)
            java.util.concurrent.atomic.AtomicInteger r0 = r7.d
            r0.set(r2)
            return
    }

    public E H(int r4) {
            r3 = this;
            int r0 = rx.internal.util.e.e
            r1 = 0
            if (r4 >= r0) goto Le
            rx.internal.util.e$a<E> r0 = r3.a
            java.util.concurrent.atomic.AtomicReferenceArray<E> r0 = r0.a
            java.lang.Object r0 = r0.getAndSet(r4, r1)
            goto L1a
        Le:
            int r0 = r4 % r0
            rx.internal.util.e$a r2 = r3.f(r4)
            java.util.concurrent.atomic.AtomicReferenceArray<E> r2 = r2.a
            java.lang.Object r0 = r2.getAndSet(r0, r1)
        L1a:
            r3.B(r4)
            return r0
    }

    public int a(E r4) {
            r3 = this;
            int r0 = r3.g()
            int r1 = rx.internal.util.e.e
            if (r0 >= r1) goto L10
            rx.internal.util.e$a<E> r1 = r3.a
            java.util.concurrent.atomic.AtomicReferenceArray<E> r1 = r1.a
            r1.set(r0, r4)
            return r0
        L10:
            int r1 = r0 % r1
            rx.internal.util.e$a r2 = r3.f(r0)
            java.util.concurrent.atomic.AtomicReferenceArray<E> r2 = r2.a
            r2.set(r1, r4)
            return r0
    }

    public int b(rx.functions.p<? super E, java.lang.Boolean> r2) {
            r1 = this;
            r0 = 0
            int r2 = r1.d(r2, r0)
            return r2
    }

    public int d(rx.functions.p<? super E, java.lang.Boolean> r4, int r5) {
            r3 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r3.c
            int r0 = r0.get()
            int r0 = r3.e(r4, r5, r0)
            r1 = 0
            if (r5 <= 0) goto L1a
            java.util.concurrent.atomic.AtomicInteger r2 = r3.c
            int r2 = r2.get()
            if (r0 != r2) goto L1a
            int r4 = r3.e(r4, r1, r5)
            return r4
        L1a:
            java.util.concurrent.atomic.AtomicInteger r4 = r3.c
            int r4 = r4.get()
            if (r0 != r4) goto L23
            return r1
        L23:
            return r0
    }

    public boolean isUnsubscribed() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void unsubscribe() {
            r0 = this;
            r0.G()
            return
    }
}
