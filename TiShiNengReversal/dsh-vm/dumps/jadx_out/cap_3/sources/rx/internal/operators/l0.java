package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class l0<T> implements rx.e.a<T> {
    final T[] a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a<T> extends java.util.concurrent.atomic.AtomicLong implements rx.g {
        private static final long serialVersionUID = 3534218984725836979L;
        final rx.l<? super T> a;
        final T[] b;
        int c;

        public a(rx.l<? super T> r1, T[] r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        void a() {
                r6 = this;
                rx.l<? super T> r0 = r6.a
                T[] r1 = r6.b
                int r2 = r1.length
                r3 = 0
            L6:
                if (r3 >= r2) goto L17
                r4 = r1[r3]
                boolean r5 = r0.isUnsubscribed()
                if (r5 == 0) goto L11
                goto L1d
            L11:
                r0.onNext(r4)
                int r3 = r3 + 1
                goto L6
            L17:
                boolean r1 = r0.isUnsubscribed()
                if (r1 == 0) goto L1e
            L1d:
                return
            L1e:
                r0.onCompleted()
                return
        }

        void b(long r11) {
                r10 = this;
                rx.l<? super T> r0 = r10.a
                T[] r1 = r10.b
                int r2 = r1.length
                int r3 = r10.c
                r4 = 0
            L9:
                r6 = r4
            La:
                int r8 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r8 == 0) goto L2f
                if (r3 == r2) goto L2f
                boolean r8 = r0.isUnsubscribed()
                if (r8 == 0) goto L17
                goto L42
            L17:
                r8 = r1[r3]
                r0.onNext(r8)
                int r3 = r3 + 1
                if (r3 != r2) goto L2a
                boolean r11 = r0.isUnsubscribed()
                if (r11 != 0) goto L42
                r0.onCompleted()
                return
            L2a:
                r8 = 1
                long r11 = r11 - r8
                long r6 = r6 - r8
                goto La
            L2f:
                long r11 = r10.get()
                long r11 = r11 + r6
                int r8 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r8 != 0) goto La
                r10.c = r3
                long r11 = r10.addAndGet(r6)
                int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r6 != 0) goto L9
            L42:
                return
        }

        public void request(long r7) {
                r6 = this;
                r0 = 0
                int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r2 < 0) goto L29
                r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                if (r5 != 0) goto L1b
                long r7 = rx.internal.operators.a.b(r6, r7)
                int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r2 != 0) goto L28
                r6.a()
                return
            L1b:
                if (r2 == 0) goto L28
                long r2 = rx.internal.operators.a.b(r6, r7)
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 != 0) goto L28
                r6.b(r7)
            L28:
                return
            L29:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "n >= 0 required but it was "
                r1.append(r2)
                r1.append(r7)
                java.lang.String r7 = r1.toString()
                r0.<init>(r7)
                throw r0
        }
    }

    public l0(T[] r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            r0.call(r1)
            return
    }

    public void call(rx.l<? super T> r3) {
            r2 = this;
            rx.internal.operators.l0$a r0 = new rx.internal.operators.l0$a
            T[] r1 = r2.a
            r0.<init>(r3, r1)
            r3.setProducer(r0)
            return
    }
}
