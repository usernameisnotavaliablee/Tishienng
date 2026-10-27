package rx.internal.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class c<T> extends rx.l<T> {
    final rx.functions.b<? super T> a;
    final rx.functions.b<java.lang.Throwable> b;
    final rx.functions.a c;

    public c(rx.functions.b<? super T> r1, rx.functions.b<java.lang.Throwable> r2, rx.functions.a r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public void onCompleted() {
            r1 = this;
            rx.functions.a r0 = r1.c
            r0.call()
            return
    }

    public void onError(java.lang.Throwable r2) {
            r1 = this;
            rx.functions.b<java.lang.Throwable> r0 = r1.b
            r0.call(r2)
            return
    }

    public void onNext(T r2) {
            r1 = this;
            rx.functions.b<? super T> r0 = r1.a
            r0.call(r2)
            return
    }
}
