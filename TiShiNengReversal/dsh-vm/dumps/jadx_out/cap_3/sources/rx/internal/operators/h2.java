package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class h2<T> implements rx.e.b<T, T> {
    final int a;
    final boolean b;
    final T c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends rx.l<T> {
        private int a;
        final /* synthetic */ rx.l b;
        final /* synthetic */ rx.internal.operators.h2 c;

        a(rx.internal.operators.h2 r1, rx.l r2) {
                r0 = this;
                r0.c = r1
                r0.b = r2
                r0.<init>()
                return
        }

        public void onCompleted() {
                r4 = this;
                int r0 = r4.a
                rx.internal.operators.h2 r1 = r4.c
                int r2 = r1.a
                if (r0 > r2) goto L38
                boolean r0 = r1.b
                if (r0 == 0) goto L19
                rx.l r0 = r4.b
                T r1 = r1.c
                r0.onNext(r1)
                rx.l r0 = r4.b
                r0.onCompleted()
                return
            L19:
                rx.l r0 = r4.b
                java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                rx.internal.operators.h2 r3 = r4.c
                int r3 = r3.a
                r2.append(r3)
                java.lang.String r3 = " is out of bounds"
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                r0.onError(r1)
            L38:
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.l r0 = r1.b
                r0.onError(r2)
                return
        }

        public void onNext(T r3) {
                r2 = this;
                int r0 = r2.a
                int r1 = r0 + 1
                r2.a = r1
                rx.internal.operators.h2 r1 = r2.c
                int r1 = r1.a
                if (r0 != r1) goto L19
                rx.l r0 = r2.b
                r0.onNext(r3)
                rx.l r3 = r2.b
                r3.onCompleted()
                r2.unsubscribe()
            L19:
                return
        }

        public void setProducer(rx.g r3) {
                r2 = this;
                rx.l r0 = r2.b
                rx.internal.operators.h2$b r1 = new rx.internal.operators.h2$b
                r1.<init>(r3)
                r0.setProducer(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class b extends java.util.concurrent.atomic.AtomicBoolean implements rx.g {
        private static final long serialVersionUID = 1;
        final rx.g a;

        public b(rx.g r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        public void request(long r4) {
                r3 = this;
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 < 0) goto L1b
                if (r2 <= 0) goto L1a
                r4 = 0
                r5 = 1
                boolean r4 = r3.compareAndSet(r4, r5)
                if (r4 == 0) goto L1a
                rx.g r4 = r3.a
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r4.request(r0)
            L1a:
                return
            L1b:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r5 = "n >= 0 required"
                r4.<init>(r5)
                throw r4
        }
    }

    public h2(int r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.<init>(r3, r0, r1)
            return
    }

    public h2(int r2, T r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r0)
            return
    }

    private h2(int r1, T r2, boolean r3) {
            r0 = this;
            r0.<init>()
            if (r1 < 0) goto Lc
            r0.a = r1
            r0.c = r2
            r0.b = r3
            return
        Lc:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = " is out of bounds"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
    }

    public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            rx.l r1 = r0.call(r1)
            return r1
    }

    public rx.l<? super T> call(rx.l<? super T> r2) {
            r1 = this;
            rx.internal.operators.h2$a r0 = new rx.internal.operators.h2$a
            r0.<init>(r1, r2)
            r2.add(r0)
            return r0
    }
}
