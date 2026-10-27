package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class f3<T> implements rx.e.b<T, T> {
    final int a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends rx.l<T> {
        private final java.util.Deque<java.lang.Object> a;
        final /* synthetic */ rx.l b;
        final /* synthetic */ rx.internal.operators.f3 c;

        a(rx.internal.operators.f3 r1, rx.l r2, rx.l r3) {
                r0 = this;
                r0.c = r1
                r0.b = r3
                r0.<init>(r2)
                java.util.ArrayDeque r1 = new java.util.ArrayDeque
                r1.<init>()
                r0.a = r1
                return
        }

        public void onCompleted() {
                r1 = this;
                rx.l r0 = r1.b
                r0.onCompleted()
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
                rx.internal.operators.f3 r0 = r2.c
                int r0 = r0.a
                if (r0 != 0) goto Lc
                rx.l r0 = r2.b
                r0.onNext(r3)
                return
            Lc:
                java.util.Deque<java.lang.Object> r0 = r2.a
                int r0 = r0.size()
                rx.internal.operators.f3 r1 = r2.c
                int r1 = r1.a
                if (r0 != r1) goto L28
                rx.l r0 = r2.b
                java.util.Deque<java.lang.Object> r1 = r2.a
                java.lang.Object r1 = r1.removeFirst()
                java.lang.Object r1 = rx.internal.operators.v.e(r1)
                r0.onNext(r1)
                goto L2d
            L28:
                r0 = 1
                r2.request(r0)
            L2d:
                java.util.Deque<java.lang.Object> r0 = r2.a
                java.lang.Object r3 = rx.internal.operators.v.j(r3)
                r0.offerLast(r3)
                return
        }
    }

    public f3(int r2) {
            r1 = this;
            r1.<init>()
            if (r2 < 0) goto L8
            r1.a = r2
            return
        L8:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.String r0 = "count could not be negative"
            r2.<init>(r0)
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
            rx.internal.operators.f3$a r0 = new rx.internal.operators.f3$a
            r0.<init>(r1, r2, r2)
            return r0
    }
}
