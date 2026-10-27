package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class w3<T> implements rx.e.b<java.util.List<T>, T> {
    private static final java.util.Comparator c = null;
    final java.util.Comparator<? super T> a;
    final int b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements java.util.Comparator<T> {
        final /* synthetic */ rx.functions.q a;
        final /* synthetic */ rx.internal.operators.w3 b;

        a(rx.internal.operators.w3 r1, rx.functions.q r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public int compare(T r2, T r3) {
                r1 = this;
                rx.functions.q r0 = r1.a
                java.lang.Object r2 = r0.call(r2, r3)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends rx.l<T> {
        java.util.List<T> a;
        boolean b;
        final /* synthetic */ rx.internal.producers.SingleDelayedProducer c;
        final /* synthetic */ rx.l d;
        final /* synthetic */ rx.internal.operators.w3 e;

        b(rx.internal.operators.w3 r1, rx.internal.producers.SingleDelayedProducer r2, rx.l r3) {
                r0 = this;
                r0.e = r1
                r0.c = r2
                r0.d = r3
                r0.<init>()
                java.util.ArrayList r2 = new java.util.ArrayList
                int r1 = r1.b
                r2.<init>(r1)
                r0.a = r2
                return
        }

        public void onCompleted() {
                r2 = this;
                boolean r0 = r2.b
                if (r0 != 0) goto L1d
                r0 = 1
                r2.b = r0
                java.util.List<T> r0 = r2.a
                r1 = 0
                r2.a = r1
                rx.internal.operators.w3 r1 = r2.e     // Catch: java.lang.Throwable -> L19
                java.util.Comparator<? super T> r1 = r1.a     // Catch: java.lang.Throwable -> L19
                java.util.Collections.sort(r0, r1)     // Catch: java.lang.Throwable -> L19
                rx.internal.producers.SingleDelayedProducer r1 = r2.c
                r1.setValue(r0)
                return
            L19:
                r0 = move-exception
                rx.exceptions.a.f(r0, r2)
            L1d:
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
                boolean r0 = r1.b
                if (r0 != 0) goto L9
                java.util.List<T> r0 = r1.a
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
    static final class c implements java.util.Comparator<java.lang.Object> {
        c() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public int compare(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                java.lang.Comparable r1 = (java.lang.Comparable) r1
                java.lang.Comparable r2 = (java.lang.Comparable) r2
                int r1 = r1.compareTo(r2)
                return r1
        }
    }

    static {
            rx.internal.operators.w3$c r0 = new rx.internal.operators.w3$c
            r0.<init>()
            rx.internal.operators.w3.c = r0
            return
    }

    public w3(int r2) {
            r1 = this;
            r1.<init>()
            java.util.Comparator r0 = rx.internal.operators.w3.c
            r1.a = r0
            r1.b = r2
            return
    }

    public w3(rx.functions.q<? super T, ? super T, java.lang.Integer> r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.b = r2
            rx.internal.operators.w3$a r2 = new rx.internal.operators.w3$a
            r2.<init>(r0, r1)
            r0.a = r2
            return
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
            rx.internal.operators.w3$b r1 = new rx.internal.operators.w3$b
            r1.<init>(r2, r0, r3)
            r3.add(r1)
            r3.setProducer(r0)
            return r1
    }
}
