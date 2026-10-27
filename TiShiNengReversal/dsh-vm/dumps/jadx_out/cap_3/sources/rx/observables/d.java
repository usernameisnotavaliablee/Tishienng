package rx.observables;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class d<K, T> extends rx.e<T> {
    private final K b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements rx.e.a<T> {
        final /* synthetic */ rx.e a;

        a(rx.e r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
                r0 = this;
                rx.l r1 = (rx.l) r1
                r0.call(r1)
                return
        }

        public void call(rx.l<? super T> r2) {
                r1 = this;
                rx.e r0 = r1.a
                r0.J6(r2)
                return
        }
    }

    protected d(K r1, rx.e.a<T> r2) {
            r0 = this;
            r0.<init>(r2)
            r0.b = r1
            return
    }

    public static <K, T> rx.observables.d<K, T> w7(K r1, rx.e.a<T> r2) {
            rx.observables.d r0 = new rx.observables.d
            r0.<init>(r1, r2)
            return r0
    }

    public static <K, T> rx.observables.d<K, T> x7(K r2, rx.e<T> r3) {
            rx.observables.d r0 = new rx.observables.d
            rx.observables.d$a r1 = new rx.observables.d$a
            r1.<init>(r3)
            r0.<init>(r2, r1)
            return r0
    }

    public K y7() {
            r1 = this;
            K r0 = r1.b
            return r0
    }
}
