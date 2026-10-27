package rx.internal.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class j implements rx.m {
    public static final int d = 0;
    private java.util.Queue<java.lang.Object> a;
    private final int b;
    public volatile java.lang.Object c;

    static {
            boolean r0 = rx.internal.util.i.b()
            if (r0 == 0) goto L9
            r0 = 16
            goto Lb
        L9:
            r0 = 128(0x80, float:1.8E-43)
        Lb:
            java.lang.String r1 = "rx.ring-buffer.size"
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
            rx.internal.util.j.d = r0
            return
    }

    j() {
            r2 = this;
            rx.internal.util.atomic.d r0 = new rx.internal.util.atomic.d
            int r1 = rx.internal.util.j.d
            r0.<init>(r1)
            r2.<init>(r0, r1)
            return
    }

    private j(java.util.Queue<java.lang.Object> r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    private j(boolean r1, int r2) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto Lb
            rx.internal.util.unsafe.r r1 = new rx.internal.util.unsafe.r
            r1.<init>(r2)
            goto L10
        Lb:
            rx.internal.util.unsafe.z r1 = new rx.internal.util.unsafe.z
            r1.<init>(r2)
        L10:
            r0.a = r1
            r0.b = r2
            return
    }

    public static rx.internal.util.j g() {
            boolean r0 = rx.internal.util.unsafe.n0.f()
            if (r0 == 0) goto Lf
            rx.internal.util.j r0 = new rx.internal.util.j
            r1 = 1
            int r2 = rx.internal.util.j.d
            r0.<init>(r1, r2)
            return r0
        Lf:
            rx.internal.util.j r0 = new rx.internal.util.j
            r0.<init>()
            return r0
    }

    public static rx.internal.util.j j() {
            boolean r0 = rx.internal.util.unsafe.n0.f()
            if (r0 == 0) goto Lf
            rx.internal.util.j r0 = new rx.internal.util.j
            r1 = 0
            int r2 = rx.internal.util.j.d
            r0.<init>(r1, r2)
            return r0
        Lf:
            rx.internal.util.j r0 = new rx.internal.util.j
            r0.<init>()
            return r0
    }

    public boolean A(java.lang.Object r1) {
            r0 = this;
            boolean r1 = rx.internal.operators.v.f(r1)
            return r1
    }

    public boolean B() {
            r1 = this;
            java.util.Queue<java.lang.Object> r0 = r1.a
            if (r0 == 0) goto Ld
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            return r0
        Ld:
            r0 = 1
            return r0
    }

    public boolean G(java.lang.Object r1) {
            r0 = this;
            boolean r1 = rx.internal.operators.v.g(r1)
            return r1
    }

    public void H() {
            r1 = this;
            java.lang.Object r0 = r1.c
            if (r0 != 0) goto La
            java.lang.Object r0 = rx.internal.operators.v.b()
            r1.c = r0
        La:
            return
    }

    public void N(java.lang.Throwable r2) {
            r1 = this;
            java.lang.Object r0 = r1.c
            if (r0 != 0) goto La
            java.lang.Object r2 = rx.internal.operators.v.c(r2)
            r1.c = r2
        La:
            return
    }

    public void P(java.lang.Object r4) throws rx.exceptions.MissingBackpressureException {
            r3 = this;
            monitor-enter(r3)
            java.util.Queue<java.lang.Object> r0 = r3.a     // Catch: java.lang.Throwable -> L13
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L15
            java.lang.Object r4 = rx.internal.operators.v.j(r4)     // Catch: java.lang.Throwable -> L13
            boolean r4 = r0.offer(r4)     // Catch: java.lang.Throwable -> L13
            r4 = r4 ^ r1
            r2 = r4
            r1 = 0
            goto L15
        L13:
            r4 = move-exception
            goto L29
        L15:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L21
            if (r2 != 0) goto L1b
            return
        L1b:
            rx.exceptions.MissingBackpressureException r4 = new rx.exceptions.MissingBackpressureException
            r4.<init>()
            throw r4
        L21:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "This instance has been unsubscribed and the queue is no longer usable."
            r4.<init>(r0)
            throw r4
        L29:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L13
            throw r4
    }

    public java.lang.Object Q() {
            r3 = this;
            monitor-enter(r3)
            java.util.Queue<java.lang.Object> r0 = r3.a     // Catch: java.lang.Throwable -> L8
            if (r0 != 0) goto La
            r0 = 0
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L8
            return r0
        L8:
            r0 = move-exception
            goto L1d
        La:
            java.lang.Object r1 = r0.peek()     // Catch: java.lang.Throwable -> L8
            java.lang.Object r2 = r3.c     // Catch: java.lang.Throwable -> L8
            if (r1 != 0) goto L1b
            if (r2 == 0) goto L1b
            java.lang.Object r0 = r0.peek()     // Catch: java.lang.Throwable -> L8
            if (r0 != 0) goto L1b
            r1 = r2
        L1b:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L8
            return r1
        L1d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L8
            throw r0
    }

    public java.lang.Object R() {
            r4 = this;
            monitor-enter(r4)
            java.util.Queue<java.lang.Object> r0 = r4.a     // Catch: java.lang.Throwable -> L8
            r1 = 0
            if (r0 != 0) goto La
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L8
            return r1
        L8:
            r0 = move-exception
            goto L1f
        La:
            java.lang.Object r2 = r0.poll()     // Catch: java.lang.Throwable -> L8
            java.lang.Object r3 = r4.c     // Catch: java.lang.Throwable -> L8
            if (r2 != 0) goto L1d
            if (r3 == 0) goto L1d
            java.lang.Object r0 = r0.peek()     // Catch: java.lang.Throwable -> L8
            if (r0 != 0) goto L1d
            r4.c = r1     // Catch: java.lang.Throwable -> L8
            r2 = r3
        L1d:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L8
            return r2
        L1f:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L8
            throw r0
    }

    public synchronized void S() {
            r0 = this;
            monitor-enter(r0)
            monitor-exit(r0)
            return
    }

    public boolean a(java.lang.Object r1, rx.f r2) {
            r0 = this;
            boolean r1 = rx.internal.operators.v.a(r2, r1)
            return r1
    }

    public java.lang.Throwable b(java.lang.Object r1) {
            r0 = this;
            java.lang.Throwable r1 = rx.internal.operators.v.d(r1)
            return r1
    }

    public int d() {
            r2 = this;
            int r0 = r2.b
            int r1 = r2.f()
            int r0 = r0 - r1
            return r0
    }

    public int e() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    public int f() {
            r1 = this;
            java.util.Queue<java.lang.Object> r0 = r1.a
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.size()
            return r0
    }

    public boolean isUnsubscribed() {
            r1 = this;
            java.util.Queue<java.lang.Object> r0 = r1.a
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public java.lang.Object s(java.lang.Object r1) {
            r0 = this;
            java.lang.Object r1 = rx.internal.operators.v.e(r1)
            return r1
    }

    public void unsubscribe() {
            r0 = this;
            r0.S()
            return
    }
}
