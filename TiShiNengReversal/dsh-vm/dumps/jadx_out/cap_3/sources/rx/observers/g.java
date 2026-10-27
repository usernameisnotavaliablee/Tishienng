package rx.observers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class g<T> extends rx.l<T> {
    private final rx.f<T> a;

    public g(rx.l<? super T> r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            return
    }

    public g(rx.l<? super T> r1, boolean r2) {
            r0 = this;
            r0.<init>(r1, r2)
            rx.observers.f r2 = new rx.observers.f
            r2.<init>(r1)
            r0.a = r2
            return
    }

    public void onCompleted() {
            r1 = this;
            rx.f<T> r0 = r1.a
            r0.onCompleted()
            return
    }

    public void onError(java.lang.Throwable r2) {
            r1 = this;
            rx.f<T> r0 = r1.a
            r0.onError(r2)
            return
    }

    public void onNext(T r2) {
            r1 = this;
            rx.f<T> r0 = r1.a
            r0.onNext(r2)
            return
    }
}
