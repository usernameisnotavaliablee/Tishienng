package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class a1<T> implements rx.i.t<T> {
    private final rx.e<T> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends rx.l<T> {
        private boolean a;
        private boolean b;
        private T c;
        final /* synthetic */ rx.k d;
        final /* synthetic */ rx.internal.operators.a1 e;

        a(rx.internal.operators.a1 r1, rx.k r2) {
                r0 = this;
                r0.e = r1
                r0.d = r2
                r0.<init>()
                return
        }

        public void onCompleted() {
                r3 = this;
                boolean r0 = r3.a
                if (r0 == 0) goto L5
                return
            L5:
                boolean r0 = r3.b
                if (r0 == 0) goto L11
                rx.k r0 = r3.d
                T r1 = r3.c
                r0.d(r1)
                return
            L11:
                rx.k r0 = r3.d
                java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
                java.lang.String r2 = "Observable emitted no items"
                r1.<init>(r2)
                r0.onError(r1)
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.k r0 = r1.d
                r0.onError(r2)
                r1.unsubscribe()
                return
        }

        public void onNext(T r3) {
                r2 = this;
                boolean r0 = r2.b
                r1 = 1
                if (r0 == 0) goto L17
                r2.a = r1
                rx.k r3 = r2.d
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Observable emitted too many elements"
                r0.<init>(r1)
                r3.onError(r0)
                r2.unsubscribe()
                return
            L17:
                r2.b = r1
                r2.c = r3
                return
        }

        public void onStart() {
                r2 = this;
                r0 = 2
                r2.request(r0)
                return
        }
    }

    public a1(rx.e<T> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static <T> rx.internal.operators.a1<T> a(rx.e<T> r1) {
            rx.internal.operators.a1 r0 = new rx.internal.operators.a1
            r0.<init>(r1)
            return r0
    }

    public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
            r0 = this;
            rx.k r1 = (rx.k) r1
            r0.call(r1)
            return
    }

    public void call(rx.k<? super T> r2) {
            r1 = this;
            rx.internal.operators.a1$a r0 = new rx.internal.operators.a1$a
            r0.<init>(r1, r2)
            r2.b(r0)
            rx.e<T> r2 = r1.a
            r2.J6(r0)
            return
    }
}
