package rx.subjects;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class e<T, R> extends rx.subjects.f<T, R> {
    private final rx.observers.f<T> b;
    private final rx.subjects.f<T, R> c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements rx.e.a<R> {
        final /* synthetic */ rx.subjects.f a;

        a(rx.subjects.f r1) {
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

        public void call(rx.l<? super R> r2) {
                r1 = this;
                rx.subjects.f r0 = r1.a
                r0.J6(r2)
                return
        }
    }

    public e(rx.subjects.f<T, R> r2) {
            r1 = this;
            rx.subjects.e$a r0 = new rx.subjects.e$a
            r0.<init>(r2)
            r1.<init>(r0)
            r1.c = r2
            rx.observers.f r0 = new rx.observers.f
            r0.<init>(r2)
            r1.b = r0
            return
    }

    public void onCompleted() {
            r1 = this;
            rx.observers.f<T> r0 = r1.b
            r0.onCompleted()
            return
    }

    public void onError(java.lang.Throwable r2) {
            r1 = this;
            rx.observers.f<T> r0 = r1.b
            r0.onError(r2)
            return
    }

    public void onNext(T r2) {
            r1 = this;
            rx.observers.f<T> r0 = r1.b
            r0.onNext(r2)
            return
    }

    @Override // rx.subjects.f
    public boolean w7() {
            r1 = this;
            rx.subjects.f<T, R> r0 = r1.c
            boolean r0 = r0.w7()
            return r0
    }
}
