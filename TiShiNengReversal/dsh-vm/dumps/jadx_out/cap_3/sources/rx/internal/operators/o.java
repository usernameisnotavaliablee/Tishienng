package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class o implements rx.b.j0 {
    final rx.b[] a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements rx.d {
        final /* synthetic */ rx.subscriptions.b a;
        final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean b;
        final /* synthetic */ rx.d c;
        final /* synthetic */ java.util.concurrent.atomic.AtomicInteger d;
        final /* synthetic */ rx.internal.operators.o e;

        a(rx.internal.operators.o r1, rx.subscriptions.b r2, java.util.concurrent.atomic.AtomicBoolean r3, rx.d r4, java.util.concurrent.atomic.AtomicInteger r5) {
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

    public o(rx.b[] r1) {
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

    public void call(rx.d r13) {
            r12 = this;
            rx.subscriptions.b r2 = new rx.subscriptions.b
            r2.<init>()
            java.util.concurrent.atomic.AtomicInteger r5 = new java.util.concurrent.atomic.AtomicInteger
            rx.b[] r0 = r12.a
            int r0 = r0.length
            r6 = 1
            int r0 = r0 + r6
            r5.<init>(r0)
            java.util.concurrent.atomic.AtomicBoolean r3 = new java.util.concurrent.atomic.AtomicBoolean
            r3.<init>()
            r13.a(r2)
            rx.b[] r7 = r12.a
            int r8 = r7.length
            r9 = 0
            r10 = 0
        L1c:
            if (r10 >= r8) goto L4d
            r11 = r7[r10]
            boolean r0 = r2.isUnsubscribed()
            if (r0 == 0) goto L27
            goto L5d
        L27:
            if (r11 != 0) goto L40
            r2.unsubscribe()
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "A completable source is null"
            r0.<init>(r1)
            boolean r1 = r3.compareAndSet(r9, r6)
            if (r1 == 0) goto L3d
            r13.onError(r0)
            return
        L3d:
            rx.plugins.c.I(r0)
        L40:
            rx.internal.operators.o$a r0 = new rx.internal.operators.o$a
            r1 = r12
            r4 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            r11.G0(r0)
            int r10 = r10 + 1
            goto L1c
        L4d:
            r4 = r13
            int r13 = r5.decrementAndGet()
            if (r13 != 0) goto L5d
            boolean r13 = r3.compareAndSet(r9, r6)
            if (r13 == 0) goto L5d
            r4.onCompleted()
        L5d:
            return
    }
}
