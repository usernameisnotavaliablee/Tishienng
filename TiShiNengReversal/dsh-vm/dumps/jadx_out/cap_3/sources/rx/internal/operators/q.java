package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class q implements rx.b.j0 {
    final java.lang.Iterable<? extends rx.b> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements rx.d {
        final /* synthetic */ rx.subscriptions.b a;
        final /* synthetic */ java.util.Queue b;
        final /* synthetic */ java.util.concurrent.atomic.AtomicInteger c;
        final /* synthetic */ rx.d d;
        final /* synthetic */ rx.internal.operators.q e;

        a(rx.internal.operators.q r1, rx.subscriptions.b r2, java.util.Queue r3, java.util.concurrent.atomic.AtomicInteger r4, rx.d r5) {
                r0 = this;
                r0.e = r1
                r0.a = r2
                r0.b = r3
                r0.c = r4
                r0.d = r5
                r0.<init>()
                return
        }

        public void a(rx.m r2) {
                r1 = this;
                rx.subscriptions.b r0 = r1.a
                r0.a(r2)
                return
        }

        void b() {
                r2 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r2.c
                int r0 = r0.decrementAndGet()
                if (r0 != 0) goto L21
                java.util.Queue r0 = r2.b
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L16
                rx.d r0 = r2.d
                r0.onCompleted()
                return
            L16:
                rx.d r0 = r2.d
                java.util.Queue r1 = r2.b
                java.lang.Throwable r1 = rx.internal.operators.n.a(r1)
                r0.onError(r1)
            L21:
                return
        }

        public void onCompleted() {
                r0 = this;
                r0.b()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                java.util.Queue r0 = r1.b
                r0.offer(r2)
                r1.b()
                return
        }
    }

    public q(java.lang.Iterable<? extends rx.b> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
            r0 = this;
            rx.d r1 = (rx.d) r1
            r0.call(r1)
            return
    }

    public void call(rx.d r9) {
            r8 = this;
            rx.subscriptions.b r2 = new rx.subscriptions.b
            r2.<init>()
            r9.a(r2)
            java.lang.Iterable<? extends rx.b> r0 = r8.a     // Catch: java.lang.Throwable -> Ldf
            java.util.Iterator r6 = r0.iterator()     // Catch: java.lang.Throwable -> Ldf
            if (r6 != 0) goto L1b
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "The source iterator returned is null"
            r0.<init>(r1)
            r9.onError(r0)
            return
        L1b:
            java.util.concurrent.atomic.AtomicInteger r4 = new java.util.concurrent.atomic.AtomicInteger
            r0 = 1
            r4.<init>(r0)
            boolean r0 = rx.internal.util.unsafe.n0.f()
            if (r0 == 0) goto L2e
            rx.internal.util.unsafe.o r0 = new rx.internal.util.unsafe.o
            r0.<init>()
        L2c:
            r3 = r0
            goto L34
        L2e:
            rx.internal.util.atomic.c r0 = new rx.internal.util.atomic.c
            r0.<init>()
            goto L2c
        L34:
            boolean r0 = r2.isUnsubscribed()
            if (r0 == 0) goto L3c
            goto Lde
        L3c:
            boolean r0 = r6.hasNext()     // Catch: java.lang.Throwable -> Lc1
            if (r0 != 0) goto L5a
            int r0 = r4.decrementAndGet()
            if (r0 != 0) goto Lde
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L52
            r9.onCompleted()
            return
        L52:
            java.lang.Throwable r0 = rx.internal.operators.n.a(r3)
            r9.onError(r0)
            return
        L5a:
            boolean r0 = r2.isUnsubscribed()
            if (r0 == 0) goto L62
            goto Lde
        L62:
            java.lang.Object r0 = r6.next()     // Catch: java.lang.Throwable -> La3
            r7 = r0
            rx.b r7 = (rx.b) r7     // Catch: java.lang.Throwable -> La3
            boolean r0 = r2.isUnsubscribed()
            if (r0 == 0) goto L71
            goto Lde
        L71:
            if (r7 != 0) goto L95
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "A completable source is null"
            r0.<init>(r1)
            r3.offer(r0)
            int r0 = r4.decrementAndGet()
            if (r0 != 0) goto Lde
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L8d
            r9.onCompleted()
            return
        L8d:
            java.lang.Throwable r0 = rx.internal.operators.n.a(r3)
            r9.onError(r0)
            return
        L95:
            r4.getAndIncrement()
            rx.internal.operators.q$a r0 = new rx.internal.operators.q$a
            r1 = r8
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r7.G0(r0)
            goto L34
        La3:
            r0 = move-exception
            r5 = r9
            r9 = r0
            r3.offer(r9)
            int r9 = r4.decrementAndGet()
            if (r9 != 0) goto Lde
            boolean r9 = r3.isEmpty()
            if (r9 == 0) goto Lb9
            r5.onCompleted()
            goto Lde
        Lb9:
            java.lang.Throwable r9 = rx.internal.operators.n.a(r3)
            r5.onError(r9)
            goto Lde
        Lc1:
            r0 = move-exception
            r5 = r9
            r9 = r0
            r3.offer(r9)
            int r9 = r4.decrementAndGet()
            if (r9 != 0) goto Lde
            boolean r9 = r3.isEmpty()
            if (r9 == 0) goto Ld7
            r5.onCompleted()
            goto Lde
        Ld7:
            java.lang.Throwable r9 = rx.internal.operators.n.a(r3)
            r5.onError(r9)
        Lde:
            return
        Ldf:
            r0 = move-exception
            r5 = r9
            r9 = r0
            r5.onError(r9)
            return
    }
}
