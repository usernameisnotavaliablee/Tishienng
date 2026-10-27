package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class p implements rx.b.j0 {
    final rx.b[] a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements rx.d {
        final /* synthetic */ rx.subscriptions.b a;
        final /* synthetic */ java.util.Queue b;
        final /* synthetic */ java.util.concurrent.atomic.AtomicInteger c;
        final /* synthetic */ rx.d d;
        final /* synthetic */ rx.internal.operators.p e;

        a(rx.internal.operators.p r1, rx.subscriptions.b r2, java.util.Queue r3, java.util.concurrent.atomic.AtomicInteger r4, rx.d r5) {
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

    public p(rx.b[] r1) {
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

    public void call(rx.d r11) {
            r10 = this;
            rx.subscriptions.b r2 = new rx.subscriptions.b
            r2.<init>()
            java.util.concurrent.atomic.AtomicInteger r4 = new java.util.concurrent.atomic.AtomicInteger
            rx.b[] r0 = r10.a
            int r0 = r0.length
            int r0 = r0 + 1
            r4.<init>(r0)
            java.util.concurrent.ConcurrentLinkedQueue r3 = new java.util.concurrent.ConcurrentLinkedQueue
            r3.<init>()
            r11.a(r2)
            rx.b[] r6 = r10.a
            int r7 = r6.length
            r0 = 0
            r8 = 0
        L1c:
            if (r8 >= r7) goto L46
            r9 = r6[r8]
            boolean r0 = r2.isUnsubscribed()
            if (r0 == 0) goto L27
            goto L5e
        L27:
            if (r9 != 0) goto L38
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "A completable source is null"
            r0.<init>(r1)
            r3.offer(r0)
            r4.decrementAndGet()
            r5 = r11
            goto L42
        L38:
            rx.internal.operators.p$a r0 = new rx.internal.operators.p$a
            r1 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r9.G0(r0)
        L42:
            int r8 = r8 + 1
            r11 = r5
            goto L1c
        L46:
            r5 = r11
            int r11 = r4.decrementAndGet()
            if (r11 != 0) goto L5e
            boolean r11 = r3.isEmpty()
            if (r11 == 0) goto L57
            r5.onCompleted()
            return
        L57:
            java.lang.Throwable r11 = rx.internal.operators.n.a(r3)
            r5.onError(r11)
        L5e:
            return
    }
}
