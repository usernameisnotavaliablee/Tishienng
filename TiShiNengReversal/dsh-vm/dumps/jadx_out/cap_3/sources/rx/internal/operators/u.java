package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class u<T, R> extends rx.internal.operators.t<T, R> {
    protected boolean i;

    public u(rx.l<? super R> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // rx.internal.operators.t
    public void onCompleted() {
            r1 = this;
            boolean r0 = r1.i
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r1.i = r0
            super.onCompleted()
            return
    }

    @Override // rx.internal.operators.t
    public void onError(java.lang.Throwable r2) {
            r1 = this;
            boolean r0 = r1.i
            if (r0 != 0) goto Lb
            r0 = 1
            r1.i = r0
            super.onError(r2)
            return
        Lb:
            rx.plugins.c.I(r2)
            return
    }
}
