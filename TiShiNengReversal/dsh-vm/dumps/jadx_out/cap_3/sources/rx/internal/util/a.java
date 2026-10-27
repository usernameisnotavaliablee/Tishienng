package rx.internal.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class a<T> implements rx.f<T> {
    final rx.functions.b<rx.Notification<? super T>> a;

    public a(rx.functions.b<rx.Notification<? super T>> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public void onCompleted() {
            r2 = this;
            rx.functions.b<rx.Notification<? super T>> r0 = r2.a
            rx.Notification r1 = rx.Notification.b()
            r0.call(r1)
            return
    }

    public void onError(java.lang.Throwable r2) {
            r1 = this;
            rx.functions.b<rx.Notification<? super T>> r0 = r1.a
            rx.Notification r2 = rx.Notification.d(r2)
            r0.call(r2)
            return
    }

    public void onNext(T r2) {
            r1 = this;
            rx.functions.b<rx.Notification<? super T>> r0 = r1.a
            rx.Notification r2 = rx.Notification.e(r2)
            r0.call(r2)
            return
    }
}
