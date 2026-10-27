package retrofit2.adapter.rxjava;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class c<T> implements rx.e.a<retrofit2.c0<T>> {
    private final retrofit2.b<T> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements retrofit2.d<T> {
        final /* synthetic */ retrofit2.adapter.rxjava.b a;
        final /* synthetic */ retrofit2.adapter.rxjava.c b;

        a(retrofit2.adapter.rxjava.c r1, retrofit2.adapter.rxjava.b r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // retrofit2.d
        public void a(retrofit2.b<T> r1, java.lang.Throwable r2) {
                r0 = this;
                rx.exceptions.a.e(r2)
                retrofit2.adapter.rxjava.b r1 = r0.a
                r1.b(r2)
                return
        }

        @Override // retrofit2.d
        public void b(retrofit2.b<T> r1, retrofit2.c0<T> r2) {
                r0 = this;
                retrofit2.adapter.rxjava.b r1 = r0.a
                r1.d(r2)
                return
        }
    }

    c(retrofit2.b<T> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // rx.functions.b
    public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            r0.call(r1)
            return
    }

    public void call(rx.l<? super retrofit2.c0<T>> r3) {
            r2 = this;
            retrofit2.b<T> r0 = r2.a
            retrofit2.b r0 = r0.mo216clone()
            retrofit2.adapter.rxjava.b r1 = new retrofit2.adapter.rxjava.b
            r1.<init>(r0, r3)
            r3.add(r1)
            r3.setProducer(r1)
            retrofit2.adapter.rxjava.c$a r3 = new retrofit2.adapter.rxjava.c$a
            r3.<init>(r2, r1)
            r0.j(r3)
            return
    }
}
