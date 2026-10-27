package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class v3<T> implements rx.e.b<java.util.List<T>, T> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends rx.l<T> {
        boolean a;
        java.util.List<T> b;
        final /* synthetic */ rx.internal.producers.SingleDelayedProducer c;
        final /* synthetic */ rx.l d;
        final /* synthetic */ rx.internal.operators.v3 e;

        a(rx.internal.operators.v3 r1, rx.internal.producers.SingleDelayedProducer r2, rx.l r3) {
                r0 = this;
                r0.e = r1
                r0.c = r2
                r0.d = r3
                r0.<init>()
                java.util.LinkedList r1 = new java.util.LinkedList
                r1.<init>()
                r0.b = r1
                return
        }

        public void onCompleted() {
                r2 = this;
                boolean r0 = r2.a
                if (r0 != 0) goto L1b
                r0 = 1
                r2.a = r0
                java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L17
                java.util.List<T> r1 = r2.b     // Catch: java.lang.Throwable -> L17
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L17
                r1 = 0
                r2.b = r1
                rx.internal.producers.SingleDelayedProducer r1 = r2.c
                r1.setValue(r0)
                return
            L17:
                r0 = move-exception
                rx.exceptions.a.f(r0, r2)
            L1b:
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.l r0 = r1.d
                r0.onError(r2)
                return
        }

        public void onNext(T r2) {
                r1 = this;
                boolean r0 = r1.a
                if (r0 != 0) goto L9
                java.util.List<T> r0 = r1.b
                r0.add(r2)
            L9:
                return
        }

        public void onStart() {
                r2 = this;
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r2.request(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b {
        static final rx.internal.operators.v3<java.lang.Object> a = null;

        static {
                rx.internal.operators.v3 r0 = new rx.internal.operators.v3
                r0.<init>()
                rx.internal.operators.v3.b.a = r0
                return
        }

        b() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    v3() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T> rx.internal.operators.v3<T> a() {
            rx.internal.operators.v3<java.lang.Object> r0 = rx.internal.operators.v3.b.a
            return r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            rx.l r1 = r0.call(r1)
            return r1
    }

    public rx.l<? super T> call(rx.l<? super java.util.List<T>> r3) {
            r2 = this;
            rx.internal.producers.SingleDelayedProducer r0 = new rx.internal.producers.SingleDelayedProducer
            r0.<init>(r3)
            rx.internal.operators.v3$a r1 = new rx.internal.operators.v3$a
            r1.<init>(r2, r0, r3)
            r3.add(r1)
            r3.setProducer(r0)
            return r1
    }
}
