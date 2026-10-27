package rx.schedulers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class d extends rx.h {
    static long c;
    final java.util.Queue<rx.schedulers.d.c> a;
    long b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a implements java.util.Comparator<rx.schedulers.d.c> {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        public int a(rx.schedulers.d.c r9, rx.schedulers.d.c r10) {
                r8 = this;
                long r0 = r9.a
                long r2 = r10.a
                r4 = 0
                r5 = 1
                r6 = -1
                int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r7 != 0) goto L26
                long r0 = rx.schedulers.d.c.a(r9)
                long r2 = rx.schedulers.d.c.a(r10)
                int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r7 >= 0) goto L18
                return r6
            L18:
                long r0 = rx.schedulers.d.c.a(r9)
                long r9 = rx.schedulers.d.c.a(r10)
                int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
                if (r2 <= 0) goto L25
                return r5
            L25:
                return r4
            L26:
                int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r9 >= 0) goto L2b
                return r6
            L2b:
                int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r9 <= 0) goto L30
                return r5
            L30:
                return r4
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(rx.schedulers.d.c r1, rx.schedulers.d.c r2) {
                r0 = this;
                rx.schedulers.d$c r1 = (rx.schedulers.d.c) r1
                rx.schedulers.d$c r2 = (rx.schedulers.d.c) r2
                int r1 = r0.a(r1, r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class b extends rx.h.a implements rx.internal.schedulers.i.b {
        private final rx.subscriptions.a a;
        final /* synthetic */ rx.schedulers.d b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements rx.functions.a {
            final /* synthetic */ rx.schedulers.d.c a;
            final /* synthetic */ rx.schedulers.d.b b;

            a(rx.schedulers.d.b r1, rx.schedulers.d.c r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            public void call() {
                    r2 = this;
                    rx.schedulers.d$b r0 = r2.b
                    rx.schedulers.d r0 = r0.b
                    java.util.Queue<rx.schedulers.d$c> r0 = r0.a
                    rx.schedulers.d$c r1 = r2.a
                    r0.remove(r1)
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: rx.schedulers.d$b$b, reason: collision with other inner class name */
        class C0052b implements rx.functions.a {
            final /* synthetic */ rx.schedulers.d.c a;
            final /* synthetic */ rx.schedulers.d.b b;

            C0052b(rx.schedulers.d.b r1, rx.schedulers.d.c r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            public void call() {
                    r2 = this;
                    rx.schedulers.d$b r0 = r2.b
                    rx.schedulers.d r0 = r0.b
                    java.util.Queue<rx.schedulers.d$c> r0 = r0.a
                    rx.schedulers.d$c r1 = r2.a
                    r0.remove(r1)
                    return
            }
        }

        b(rx.schedulers.d r1) {
                r0 = this;
                r0.b = r1
                r0.<init>()
                rx.subscriptions.a r1 = new rx.subscriptions.a
                r1.<init>()
                r0.a = r1
                return
        }

        @Override // rx.internal.schedulers.i.b
        public long a() {
                r2 = this;
                rx.schedulers.d r0 = r2.b
                long r0 = r0.b
                return r0
        }

        public long b() {
                r2 = this;
                rx.schedulers.d r0 = r2.b
                long r0 = r0.b()
                return r0
        }

        public rx.m d(rx.functions.a r4) {
                r3 = this;
                rx.schedulers.d$c r0 = new rx.schedulers.d$c
                r1 = 0
                r0.<init>(r3, r1, r4)
                rx.schedulers.d r4 = r3.b
                java.util.Queue<rx.schedulers.d$c> r4 = r4.a
                r4.add(r0)
                rx.schedulers.d$b$b r4 = new rx.schedulers.d$b$b
                r4.<init>(r3, r0)
                rx.m r4 = rx.subscriptions.f.a(r4)
                return r4
        }

        public rx.m e(rx.functions.a r4, long r5, java.util.concurrent.TimeUnit r7) {
                r3 = this;
                rx.schedulers.d$c r0 = new rx.schedulers.d$c
                rx.schedulers.d r1 = r3.b
                long r1 = r1.b
                long r5 = r7.toNanos(r5)
                long r1 = r1 + r5
                r0.<init>(r3, r1, r4)
                rx.schedulers.d r4 = r3.b
                java.util.Queue<rx.schedulers.d$c> r4 = r4.a
                r4.add(r0)
                rx.schedulers.d$b$a r4 = new rx.schedulers.d$b$a
                r4.<init>(r3, r0)
                rx.m r4 = rx.subscriptions.f.a(r4)
                return r4
        }

        public rx.m f(rx.functions.a r9, long r10, long r12, java.util.concurrent.TimeUnit r14) {
                r8 = this;
                r7 = r8
                r0 = r8
                r1 = r9
                r2 = r10
                r4 = r12
                r6 = r14
                rx.m r9 = rx.internal.schedulers.i.a(r0, r1, r2, r4, r6, r7)
                return r9
        }

        public boolean isUnsubscribed() {
                r1 = this;
                rx.subscriptions.a r0 = r1.a
                boolean r0 = r0.isUnsubscribed()
                return r0
        }

        public void unsubscribe() {
                r1 = this;
                rx.subscriptions.a r0 = r1.a
                r0.unsubscribe()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class c {
        final long a;
        final rx.functions.a b;
        final rx.h.a c;
        private final long d;

        c(rx.h.a r5, long r6, rx.functions.a r8) {
                r4 = this;
                r4.<init>()
                long r0 = rx.schedulers.d.c
                r2 = 1
                long r2 = r2 + r0
                rx.schedulers.d.c = r2
                r4.d = r0
                r4.a = r6
                r4.b = r8
                r4.c = r5
                return
        }

        static /* synthetic */ long a(rx.schedulers.d.c r2) {
                long r0 = r2.d
                return r0
        }

        public java.lang.String toString() {
                r4 = this;
                long r0 = r4.a
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                rx.functions.a r1 = r4.b
                java.lang.String r1 = r1.toString()
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                r2[r3] = r0
                r0 = 1
                r2[r0] = r1
                java.lang.String r0 = "TimedAction(time = %d, action = %s)"
                java.lang.String r0 = java.lang.String.format(r0, r2)
                return r0
        }
    }

    public d() {
            r3 = this;
            r3.<init>()
            java.util.PriorityQueue r0 = new java.util.PriorityQueue
            rx.schedulers.d$a r1 = new rx.schedulers.d$a
            r1.<init>()
            r2 = 11
            r0.<init>(r2, r1)
            r3.a = r0
            return
    }

    private void j(long r7) {
            r6 = this;
        L0:
            java.util.Queue<rx.schedulers.d$c> r0 = r6.a
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L34
            java.util.Queue<rx.schedulers.d$c> r0 = r6.a
            java.lang.Object r0 = r0.peek()
            rx.schedulers.d$c r0 = (rx.schedulers.d.c) r0
            long r1 = r0.a
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 <= 0) goto L17
            goto L34
        L17:
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L1f
            long r1 = r6.b
        L1f:
            r6.b = r1
            java.util.Queue<rx.schedulers.d$c> r1 = r6.a
            r1.remove()
            rx.h$a r1 = r0.c
            boolean r1 = r1.isUnsubscribed()
            if (r1 != 0) goto L0
            rx.functions.a r0 = r0.b
            r0.call()
            goto L0
        L34:
            r6.b = r7
            return
    }

    public rx.h.a a() {
            r1 = this;
            rx.schedulers.d$b r0 = new rx.schedulers.d$b
            r0.<init>(r1)
            return r0
    }

    public long b() {
            r3 = this;
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r1 = r3.b
            long r0 = r0.toMillis(r1)
            return r0
    }

    public void e(long r3, java.util.concurrent.TimeUnit r5) {
            r2 = this;
            long r0 = r2.b
            long r3 = r5.toNanos(r3)
            long r0 = r0 + r3
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.NANOSECONDS
            r2.f(r0, r3)
            return
    }

    public void f(long r1, java.util.concurrent.TimeUnit r3) {
            r0 = this;
            long r1 = r3.toNanos(r1)
            r0.j(r1)
            return
    }

    public void g() {
            r2 = this;
            long r0 = r2.b
            r2.j(r0)
            return
    }
}
