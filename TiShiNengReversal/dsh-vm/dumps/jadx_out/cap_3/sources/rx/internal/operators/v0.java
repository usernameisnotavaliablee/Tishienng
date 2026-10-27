package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class v0 implements rx.e.a<java.lang.Integer> {
    private final int a;
    private final int b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a extends java.util.concurrent.atomic.AtomicLong implements rx.g {
        private static final long serialVersionUID = 4114392207069098388L;
        private final rx.l<? super java.lang.Integer> a;
        private final int b;
        private long c;

        a(rx.l<? super java.lang.Integer> r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                long r1 = (long) r2
                r0.c = r1
                r0.b = r3
                return
        }

        void a() {
                r8 = this;
                int r0 = r8.b
                long r0 = (long) r0
                r2 = 1
                long r0 = r0 + r2
                rx.l<? super java.lang.Integer> r4 = r8.a
                long r5 = r8.c
            La:
                int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r7 == 0) goto L1f
                boolean r7 = r4.isUnsubscribed()
                if (r7 == 0) goto L15
                goto L28
            L15:
                int r7 = (int) r5
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r4.onNext(r7)
                long r5 = r5 + r2
                goto La
            L1f:
                boolean r0 = r4.isUnsubscribed()
                if (r0 != 0) goto L28
                r4.onCompleted()
            L28:
                return
        }

        void b(long r13) {
                r12 = this;
                int r0 = r12.b
                long r0 = (long) r0
                r2 = 1
                long r0 = r0 + r2
                long r4 = r12.c
                rx.l<? super java.lang.Integer> r6 = r12.a
                r7 = 0
            Lc:
                r9 = r7
            Ld:
                int r11 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
                if (r11 == 0) goto L27
                int r11 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r11 == 0) goto L27
                boolean r11 = r6.isUnsubscribed()
                if (r11 == 0) goto L1c
                goto L49
            L1c:
                int r11 = (int) r4
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
                r6.onNext(r11)
                long r4 = r4 + r2
                long r9 = r9 + r2
                goto Ld
            L27:
                boolean r13 = r6.isUnsubscribed()
                if (r13 == 0) goto L2e
                goto L49
            L2e:
                int r13 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r13 != 0) goto L36
                r6.onCompleted()
                return
            L36:
                long r13 = r12.get()
                int r11 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
                if (r11 != 0) goto Ld
                r12.c = r4
                long r13 = -r9
                long r13 = r12.addAndGet(r13)
                int r9 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
                if (r9 != 0) goto Lc
            L49:
                return
        }

        public void request(long r6) {
                r5 = this;
                long r0 = r5.get()
                r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto Le
                goto L2d
            Le:
                r0 = 0
                int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r4 != 0) goto L1e
                boolean r2 = r5.compareAndSet(r0, r2)
                if (r2 == 0) goto L1e
                r5.a()
                return
            L1e:
                int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r2 <= 0) goto L2d
                long r2 = rx.internal.operators.a.b(r5, r6)
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 != 0) goto L2d
                r5.b(r6)
            L2d:
                return
        }
    }

    public v0(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            r0.call(r1)
            return
    }

    public void call(rx.l<? super java.lang.Integer> r4) {
            r3 = this;
            rx.internal.operators.v0$a r0 = new rx.internal.operators.v0$a
            int r1 = r3.a
            int r2 = r3.b
            r0.<init>(r4, r1, r2)
            r4.setProducer(r0)
            return
    }
}
