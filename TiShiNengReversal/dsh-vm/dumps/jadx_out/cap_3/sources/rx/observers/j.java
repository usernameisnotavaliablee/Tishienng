package rx.observers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class j<T> extends rx.l<T> {
    private static final rx.f<java.lang.Object> h = null;
    private final rx.f<T> a;
    private final java.util.List<T> b;
    private final java.util.List<java.lang.Throwable> c;
    private int d;
    private final java.util.concurrent.CountDownLatch e;
    private volatile int f;
    private volatile java.lang.Thread g;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements rx.f<java.lang.Object> {
        a() {
                r0 = this;
                r0.<init>()
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

        public void onNext(java.lang.Object r1) {
                r0 = this;
                return
        }
    }

    static {
            rx.observers.j$a r0 = new rx.observers.j$a
            r0.<init>()
            rx.observers.j.h = r0
            return
    }

    public j() {
            r2 = this;
            r0 = -1
            r2.<init>(r0)
            return
    }

    public j(long r2) {
            r1 = this;
            rx.f<java.lang.Object> r0 = rx.observers.j.h
            r1.<init>(r0, r2)
            return
    }

    public j(rx.f<T> r3) {
            r2 = this;
            r0 = -1
            r2.<init>(r3, r0)
            return
    }

    public j(rx.f<T> r3, long r4) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r1 = 1
            r0.<init>(r1)
            r2.e = r0
            r3.getClass()
            r2.a = r3
            r0 = 0
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 < 0) goto L19
            r2.request(r4)
        L19:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.b = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.c = r3
            return
    }

    public j(rx.l<T> r3) {
            r2 = this;
            r0 = -1
            r2.<init>(r3, r0)
            return
    }

    private void A(T r4, int r5) {
            r3 = this;
            java.util.List<T> r0 = r3.b
            java.lang.Object r0 = r0.get(r5)
            java.lang.String r1 = "Value at index: "
            if (r4 != 0) goto L2c
            if (r0 == 0) goto L7c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            r4.append(r5)
            java.lang.String r5 = " expected: [null] but was: ["
            r4.append(r5)
            r4.append(r0)
            java.lang.String r5 = "]\n"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.W(r4)
            return
        L2c:
            boolean r2 = r4.equals(r0)
            if (r2 != 0) goto L7c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r5)
            java.lang.String r5 = " expected: ["
            r2.append(r5)
            r2.append(r4)
            java.lang.String r5 = "] ("
            r2.append(r5)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r2.append(r4)
            java.lang.String r4 = ") but was: ["
            r2.append(r4)
            r2.append(r0)
            r2.append(r5)
            if (r0 == 0) goto L6b
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getSimpleName()
            goto L6d
        L6b:
            java.lang.String r4 = "null"
        L6d:
            r2.append(r4)
            java.lang.String r4 = ")\n"
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r3.W(r4)
        L7c:
            return
    }

    public static <T> rx.observers.j<T> b0() {
            rx.observers.j r0 = new rx.observers.j
            r0.<init>()
            return r0
    }

    public static <T> rx.observers.j<T> c0(long r1) {
            rx.observers.j r0 = new rx.observers.j
            r0.<init>(r1)
            return r0
    }

    public static <T> rx.observers.j<T> d0(rx.f<T> r1) {
            rx.observers.j r0 = new rx.observers.j
            r0.<init>(r1)
            return r0
    }

    public static <T> rx.observers.j<T> e0(rx.f<T> r1, long r2) {
            rx.observers.j r0 = new rx.observers.j
            r0.<init>(r1, r2)
            return r0
    }

    public static <T> rx.observers.j<T> f0(rx.l<T> r1) {
            rx.observers.j r0 = new rx.observers.j
            r0.<init>(r1)
            return r0
    }

    public void B() {
            r1 = this;
            java.util.List r0 = r1.m()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lf
            java.lang.String r0 = "Unexpected onError events"
            r1.W(r0)
        Lf:
            return
    }

    public final int E() {
            r1 = this;
            int r0 = r1.f
            return r0
    }

    public void G() {
            r7 = this;
            java.util.List<java.lang.Throwable> r0 = r7.c
            int r1 = r7.d
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto Le
            if (r1 <= 0) goto Ld
            goto Le
        Ld:
            return
        Le:
            boolean r2 = r0.isEmpty()
            java.lang.String r3 = " completion events instead of none"
            java.lang.String r4 = " errors and "
            java.lang.String r5 = "Found "
            if (r2 == 0) goto L3a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            int r0 = r0.size()
            r2.append(r0)
            r2.append(r4)
            r2.append(r1)
            r2.append(r3)
            java.lang.String r0 = r2.toString()
            r7.W(r0)
            return
        L3a:
            int r2 = r0.size()
            r6 = 1
            if (r2 != r6) goto L61
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            int r0 = r0.size()
            r2.append(r0)
            r2.append(r4)
            r2.append(r1)
            r2.append(r3)
            java.lang.String r0 = r2.toString()
            r7.W(r0)
            return
        L61:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            int r0 = r0.size()
            r2.append(r0)
            r2.append(r4)
            r2.append(r1)
            r2.append(r3)
            java.lang.String r0 = r2.toString()
            r7.W(r0)
            return
    }

    public void H() {
            r3 = this;
            java.util.List<T> r0 = r3.b
            int r0 = r0.size()
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No onNext events expected yet some received: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r3.W(r0)
        L1c:
            return
    }

    public java.util.List<T> J() {
            r1 = this;
            java.util.List<T> r0 = r1.b
            return r0
    }

    public void N() {
            r3 = this;
            int r0 = r3.d
            r1 = 1
            if (r0 != r1) goto Lb
            java.lang.String r0 = "Completed!"
            r3.W(r0)
            return
        Lb:
            if (r0 <= r1) goto L21
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Completed multiple times: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r3.W(r0)
        L21:
            return
    }

    public void P(java.util.List<T> r3) {
            r2 = this;
            java.util.List<T> r0 = r2.b
            int r0 = r0.size()
            int r1 = r3.size()
            if (r0 == r1) goto L49
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Number of items does not match. Provided: "
            r0.append(r1)
            int r1 = r3.size()
            r0.append(r1)
            java.lang.String r1 = "  Actual: "
            r0.append(r1)
            java.util.List<T> r1 = r2.b
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r1 = ".\nProvided values: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = "\nActual values: "
            r0.append(r1)
            java.util.List<T> r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = "\n"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.W(r0)
        L49:
            r0 = 0
        L4a:
            int r1 = r3.size()
            if (r0 >= r1) goto L5a
            java.lang.Object r1 = r3.get(r0)
            r2.A(r1, r0)
            int r0 = r0 + 1
            goto L4a
        L5a:
            return
    }

    public void Q() {
            r3 = this;
            java.util.List<java.lang.Throwable> r0 = r3.c
            int r0 = r0.size()
            r1 = 1
            if (r0 <= r1) goto L23
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Too many onError events: "
            r0.append(r2)
            java.util.List<java.lang.Throwable> r2 = r3.c
            int r2 = r2.size()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.W(r0)
        L23:
            int r0 = r3.d
            if (r0 <= r1) goto L3d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Too many onCompleted events: "
            r0.append(r2)
            int r2 = r3.d
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.W(r0)
        L3d:
            int r0 = r3.d
            if (r0 != r1) goto L4e
            java.util.List<java.lang.Throwable> r0 = r3.c
            int r0 = r0.size()
            if (r0 != r1) goto L4e
            java.lang.String r0 = "Received both an onError and onCompleted. Should be one or the other."
            r3.W(r0)
        L4e:
            int r0 = r3.d
            if (r0 != 0) goto L5f
            java.util.List<java.lang.Throwable> r0 = r3.c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5f
            java.lang.String r0 = "No terminal events received."
            r3.W(r0)
        L5f:
            return
    }

    public void R() {
            r1 = this;
            boolean r0 = r1.isUnsubscribed()
            if (r0 != 0) goto Lb
            java.lang.String r0 = "Not unsubscribed."
            r1.W(r0)
        Lb:
            return
    }

    public void S(T r1) {
            r0 = this;
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r0.P(r1)
            return
    }

    public void T(int r4) {
            r3 = this;
            java.util.List<T> r0 = r3.b
            int r0 = r0.size()
            if (r0 == r4) goto L24
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Number of onNext events differ; expected: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ", actual: "
            r1.append(r4)
            r1.append(r0)
            java.lang.String r4 = r1.toString()
            r3.W(r4)
        L24:
            return
    }

    public void U(T... r1) {
            r0 = this;
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.P(r1)
            return
    }

    public final void V(T r3, T... r4) {
            r2 = this;
            int r0 = r4.length
            int r0 = r0 + 1
            r2.T(r0)
            r0 = 0
            r2.A(r3, r0)
            r3 = 0
        Lb:
            int r1 = r4.length
            if (r3 >= r1) goto L16
            r1 = r4[r3]
            int r3 = r3 + 1
            r2.A(r1, r3)
            goto Lb
        L16:
            java.util.List<T> r3 = r2.b
            r3.clear()
            r2.f = r0
            return
    }

    final void W(java.lang.String r6) {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r6.length()
            int r1 = r1 + 32
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = " ("
            r0.append(r6)
            int r6 = r5.d
            r0.append(r6)
            java.lang.String r1 = " completion"
            r0.append(r1)
            r1 = 115(0x73, float:1.61E-43)
            r2 = 1
            if (r6 == r2) goto L25
            r0.append(r1)
        L25:
            r6 = 41
            r0.append(r6)
            java.util.List<java.lang.Throwable> r3 = r5.c
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L4d
            java.util.List<java.lang.Throwable> r3 = r5.c
            int r3 = r3.size()
            java.lang.String r4 = " (+"
            r0.append(r4)
            r0.append(r3)
            java.lang.String r4 = " error"
            r0.append(r4)
            if (r3 == r2) goto L4a
            r0.append(r1)
        L4a:
            r0.append(r6)
        L4d:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            java.util.List<java.lang.Throwable> r0 = r5.c
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L7d
            java.util.List<java.lang.Throwable> r0 = r5.c
            int r0 = r0.size()
            if (r0 != r2) goto L73
            java.util.List<java.lang.Throwable> r0 = r5.c
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r6.initCause(r0)
            goto L7d
        L73:
            rx.exceptions.CompositeException r0 = new rx.exceptions.CompositeException
            java.util.List<java.lang.Throwable> r1 = r5.c
            r0.<init>(r1)
            r6.initCause(r0)
        L7d:
            throw r6
    }

    public void X() {
            r3 = this;
            java.util.concurrent.CountDownLatch r0 = r3.e     // Catch: java.lang.InterruptedException -> L6
            r0.await()     // Catch: java.lang.InterruptedException -> L6
            return
        L6:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Interrupted"
            r1.<init>(r2, r0)
            throw r1
    }

    public void Y(long r2, java.util.concurrent.TimeUnit r4) {
            r1 = this;
            java.util.concurrent.CountDownLatch r0 = r1.e     // Catch: java.lang.InterruptedException -> L6
            r0.await(r2, r4)     // Catch: java.lang.InterruptedException -> L6
            return
        L6:
            r2 = move-exception
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Interrupted"
            r3.<init>(r4, r2)
            throw r3
    }

    public void Z(long r2, java.util.concurrent.TimeUnit r4) {
            r1 = this;
            java.util.concurrent.CountDownLatch r0 = r1.e     // Catch: java.lang.InterruptedException -> Lc
            boolean r2 = r0.await(r2, r4)     // Catch: java.lang.InterruptedException -> Lc
            if (r2 != 0) goto Lb
            r1.unsubscribe()     // Catch: java.lang.InterruptedException -> Lc
        Lb:
            return
        Lc:
            r1.unsubscribe()
            return
    }

    public final boolean a0(int r4, long r5, java.util.concurrent.TimeUnit r7) {
            r3 = this;
        L0:
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 == 0) goto L1a
            int r0 = r3.f
            if (r0 >= r4) goto L1a
            r0 = 1
            r7.sleep(r0)     // Catch: java.lang.InterruptedException -> L11
            long r5 = r5 - r0
            goto L0
        L11:
            r4 = move-exception
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Interrupted"
            r5.<init>(r6, r4)
            throw r5
        L1a:
            int r5 = r3.f
            if (r5 < r4) goto L20
            r4 = 1
            return r4
        L20:
            r4 = 0
            return r4
    }

    public void g() {
            r3 = this;
            int r0 = r3.d
            if (r0 != 0) goto La
            java.lang.String r0 = "Not completed!"
            r3.W(r0)
            return
        La:
            r1 = 1
            if (r0 <= r1) goto L21
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Completed multiple times: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r3.W(r0)
        L21:
            return
    }

    @java.lang.Deprecated
    public java.util.List<rx.Notification<T>> g0() {
            r4 = this;
            int r0 = r4.d
            java.util.ArrayList r1 = new java.util.ArrayList
            if (r0 == 0) goto L8
            r2 = r0
            goto L9
        L8:
            r2 = 1
        L9:
            r1.<init>(r2)
            r2 = 0
        Ld:
            if (r2 >= r0) goto L19
            rx.Notification r3 = rx.Notification.b()
            r1.add(r3)
            int r2 = r2 + 1
            goto Ld
        L19:
            return r1
    }

    public void h0(long r1) {
            r0 = this;
            r0.request(r1)
            return
    }

    public void j(java.lang.Class<? extends java.lang.Throwable> r6) {
            r5 = this;
            java.util.List<java.lang.Throwable> r0 = r5.c
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Le
            java.lang.String r6 = "No errors"
            r5.W(r6)
            return
        Le:
            int r1 = r0.size()
            r2 = 1
            if (r1 > r2) goto L4d
            r1 = 0
            java.lang.Object r2 = r0.get(r1)
            boolean r2 = r6.isInstance(r2)
            if (r2 == 0) goto L21
            return
        L21:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Exceptions differ; expected: "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r6 = ", actual: "
            r3.append(r6)
            java.lang.Object r6 = r0.get(r1)
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            r2.<init>(r6)
            java.lang.Object r6 = r0.get(r1)
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            r2.initCause(r6)
            throw r2
        L4d:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Multiple errors: "
            r1.append(r2)
            int r2 = r0.size()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r6.<init>(r1)
            rx.exceptions.CompositeException r1 = new rx.exceptions.CompositeException
            r1.<init>(r0)
            r6.initCause(r1)
            throw r6
    }

    public java.util.List<java.lang.Throwable> m() {
            r1 = this;
            java.util.List<java.lang.Throwable> r0 = r1.c
            return r0
    }

    public void onCompleted() {
            r2 = this;
            int r0 = r2.d     // Catch: java.lang.Throwable -> L17
            int r0 = r0 + 1
            r2.d = r0     // Catch: java.lang.Throwable -> L17
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L17
            r2.g = r0     // Catch: java.lang.Throwable -> L17
            rx.f<T> r0 = r2.a     // Catch: java.lang.Throwable -> L17
            r0.onCompleted()     // Catch: java.lang.Throwable -> L17
            java.util.concurrent.CountDownLatch r0 = r2.e
            r0.countDown()
            return
        L17:
            r0 = move-exception
            java.util.concurrent.CountDownLatch r1 = r2.e
            r1.countDown()
            throw r0
    }

    public void onError(java.lang.Throwable r2) {
            r1 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L16
            r1.g = r0     // Catch: java.lang.Throwable -> L16
            java.util.List<java.lang.Throwable> r0 = r1.c     // Catch: java.lang.Throwable -> L16
            r0.add(r2)     // Catch: java.lang.Throwable -> L16
            rx.f<T> r0 = r1.a     // Catch: java.lang.Throwable -> L16
            r0.onError(r2)     // Catch: java.lang.Throwable -> L16
            java.util.concurrent.CountDownLatch r2 = r1.e
            r2.countDown()
            return
        L16:
            r2 = move-exception
            java.util.concurrent.CountDownLatch r0 = r1.e
            r0.countDown()
            throw r2
    }

    public void onNext(T r2) {
            r1 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r1.g = r0
            java.util.List<T> r0 = r1.b
            r0.add(r2)
            java.util.List<T> r0 = r1.b
            int r0 = r0.size()
            r1.f = r0
            rx.f<T> r0 = r1.a
            r0.onNext(r2)
            return
    }

    public void s(java.lang.Throwable r5) {
            r4 = this;
            java.util.List<java.lang.Throwable> r0 = r4.c
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Le
            java.lang.String r5 = "No errors"
            r4.W(r5)
            return
        Le:
            int r1 = r0.size()
            r2 = 1
            if (r1 <= r2) goto L1b
            java.lang.String r5 = "Multiple errors"
            r4.W(r5)
            return
        L1b:
            r1 = 0
            java.lang.Object r2 = r0.get(r1)
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L46
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Exceptions differ; expected: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = ", actual: "
            r2.append(r5)
            java.lang.Object r5 = r0.get(r1)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r4.W(r5)
        L46:
            return
    }

    public final int w() {
            r1 = this;
            int r0 = r1.d
            return r0
    }

    public java.lang.Thread z() {
            r1 = this;
            java.lang.Thread r0 = r1.g
            return r0
    }
}
