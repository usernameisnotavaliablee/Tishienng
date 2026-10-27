package rx.observers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public interface a<T> extends rx.f<T>, rx.m {
    rx.observers.a<T> C(java.lang.Class<? extends java.lang.Throwable> r1);

    rx.observers.a<T> D();

    int E();

    rx.observers.a<T> F();

    rx.observers.a<T> I();

    java.util.List<T> J();

    rx.observers.a<T> K(int r1);

    rx.observers.a<T> L(long r1, java.util.concurrent.TimeUnit r3);

    rx.observers.a<T> M(java.lang.Class<? extends java.lang.Throwable> r1, T... r2);

    rx.observers.a<T> O(rx.functions.a r1);

    rx.observers.a<T> c();

    rx.observers.a<T> h(T r1, T... r2);

    rx.observers.a<T> i(T... r1);

    boolean isUnsubscribed();

    rx.observers.a<T> k();

    rx.observers.a<T> l();

    java.util.List<java.lang.Throwable> m();

    rx.observers.a<T> n(long r1, java.util.concurrent.TimeUnit r3);

    rx.observers.a<T> o(int r1, long r2, java.util.concurrent.TimeUnit r4);

    void onStart();

    rx.observers.a<T> p();

    rx.observers.a<T> q(java.util.List<T> r1);

    rx.observers.a<T> r(java.lang.Throwable r1);

    void setProducer(rx.g r1);

    rx.observers.a<T> t(T r1);

    rx.observers.a<T> u();

    void unsubscribe();

    rx.observers.a<T> v(T... r1);

    int w();

    rx.observers.a<T> x(long r1);

    rx.observers.a<T> y(java.lang.Class<? extends java.lang.Throwable> r1, java.lang.String r2, T... r3);

    java.lang.Thread z();
}
