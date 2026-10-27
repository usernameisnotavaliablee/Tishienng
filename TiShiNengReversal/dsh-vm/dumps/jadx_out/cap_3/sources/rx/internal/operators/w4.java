package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class w4<T, R> implements rx.functions.p<T, R> {
    final java.lang.Class<R> a;

    public w4(java.lang.Class<R> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public R call(T r2) {
            r1 = this;
            java.lang.Class<R> r0 = r1.a
            java.lang.Object r2 = r0.cast(r2)
            return r2
    }
}
