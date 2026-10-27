package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class r implements rx.b.j0 {
    final java.lang.Iterable<? extends rx.b> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements rx.d {
        final /* synthetic */ rx.subscriptions.b a;
        final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean b;
        final /* synthetic */ rx.d c;
        final /* synthetic */ java.util.concurrent.atomic.AtomicInteger d;
        final /* synthetic */ rx.internal.operators.r e;

        a(rx.internal.operators.r r1, rx.subscriptions.b r2, java.util.concurrent.atomic.AtomicBoolean r3, rx.d r4, java.util.concurrent.atomic.AtomicInteger r5) {
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

        public void onCompleted() {
                r3 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r3.d
                int r0 = r0.decrementAndGet()
                if (r0 != 0) goto L17
                java.util.concurrent.atomic.AtomicBoolean r0 = r3.b
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L17
                rx.d r0 = r3.c
                r0.onCompleted()
            L17:
                return
        }

        public void onError(java.lang.Throwable r4) {
                r3 = this;
                rx.subscriptions.b r0 = r3.a
                r0.unsubscribe()
                java.util.concurrent.atomic.AtomicBoolean r0 = r3.b
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L15
                rx.d r0 = r3.c
                r0.onError(r4)
                return
            L15:
                rx.plugins.c.I(r4)
                return
        }
    }

    public r(java.lang.Iterable<? extends rx.b> r1) {
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

    public void call(rx.d r10) {
            r9 = this;
            rx.subscriptions.b r2 = new rx.subscriptions.b
            r2.<init>()
            r10.a(r2)
            java.lang.Iterable<? extends rx.b> r0 = r9.a     // Catch: java.lang.Throwable -> Laa
            java.util.Iterator r6 = r0.iterator()     // Catch: java.lang.Throwable -> Laa
            if (r6 != 0) goto L1b
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "The source iterator returned is null"
            r0.<init>(r1)
            r10.onError(r0)
            return
        L1b:
            java.util.concurrent.atomic.AtomicInteger r5 = new java.util.concurrent.atomic.AtomicInteger
            r7 = 1
            r5.<init>(r7)
            java.util.concurrent.atomic.AtomicBoolean r3 = new java.util.concurrent.atomic.AtomicBoolean
            r3.<init>()
        L26:
            boolean r0 = r2.isUnsubscribed()
            if (r0 == 0) goto L2e
            goto La9
        L2e:
            r1 = 0
            boolean r0 = r6.hasNext()     // Catch: java.lang.Throwable -> L96
            if (r0 != 0) goto L45
            int r0 = r5.decrementAndGet()
            if (r0 != 0) goto La9
            boolean r0 = r3.compareAndSet(r1, r7)
            if (r0 == 0) goto La9
            r10.onCompleted()
            return
        L45:
            boolean r0 = r2.isUnsubscribed()
            if (r0 == 0) goto L4c
            goto La9
        L4c:
            java.lang.Object r0 = r6.next()     // Catch: java.lang.Throwable -> L82
            r8 = r0
            rx.b r8 = (rx.b) r8     // Catch: java.lang.Throwable -> L82
            boolean r0 = r2.isUnsubscribed()
            if (r0 == 0) goto L5a
            goto La9
        L5a:
            if (r8 != 0) goto L74
            r2.unsubscribe()
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r2 = "A completable source is null"
            r0.<init>(r2)
            boolean r1 = r3.compareAndSet(r1, r7)
            if (r1 == 0) goto L70
            r10.onError(r0)
            return
        L70:
            rx.plugins.c.I(r0)
            return
        L74:
            r5.getAndIncrement()
            rx.internal.operators.r$a r0 = new rx.internal.operators.r$a
            r1 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r8.G0(r0)
            goto L26
        L82:
            r0 = move-exception
            r4 = r10
            r10 = r0
            r2.unsubscribe()
            boolean r0 = r3.compareAndSet(r1, r7)
            if (r0 == 0) goto L92
            r4.onError(r10)
            goto La9
        L92:
            rx.plugins.c.I(r10)
            goto La9
        L96:
            r0 = move-exception
            r4 = r10
            r10 = r0
            r2.unsubscribe()
            boolean r0 = r3.compareAndSet(r1, r7)
            if (r0 == 0) goto La6
            r4.onError(r10)
            goto La9
        La6:
            rx.plugins.c.I(r10)
        La9:
            return
        Laa:
            r0 = move-exception
            r4 = r10
            r10 = r0
            r4.onError(r10)
            return
    }
}
