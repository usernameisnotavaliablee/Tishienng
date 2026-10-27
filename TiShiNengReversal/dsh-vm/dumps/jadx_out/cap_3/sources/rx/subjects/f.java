package rx.subjects;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class f<T, R> extends rx.e<R> implements rx.f<T> {
    protected f(rx.e.a<R> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public abstract boolean w7();

    public final rx.subjects.e<T, R> x7() {
            r2 = this;
            java.lang.Class r0 = r2.getClass()
            java.lang.Class<rx.subjects.e> r1 = rx.subjects.e.class
            if (r0 != r1) goto Lc
            r0 = r2
            rx.subjects.e r0 = (rx.subjects.e) r0
            return r0
        Lc:
            rx.subjects.e r0 = new rx.subjects.e
            r0.<init>(r2)
            return r0
    }
}
