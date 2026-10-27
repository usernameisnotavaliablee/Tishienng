package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public enum EmptyObservableHolder extends java.lang.Enum<rx.internal.operators.EmptyObservableHolder> implements rx.e.a<java.lang.Object> {
    private static final /* synthetic */ rx.internal.operators.EmptyObservableHolder[] $VALUES = null;
    static final rx.e<java.lang.Object> EMPTY = null;
    public static final rx.internal.operators.EmptyObservableHolder INSTANCE = null;

    static {
            rx.internal.operators.EmptyObservableHolder r0 = new rx.internal.operators.EmptyObservableHolder
            java.lang.String r1 = "INSTANCE"
            r2 = 0
            r0.<init>(r1, r2)
            rx.internal.operators.EmptyObservableHolder.INSTANCE = r0
            r1 = 1
            rx.internal.operators.EmptyObservableHolder[] r1 = new rx.internal.operators.EmptyObservableHolder[r1]
            r1[r2] = r0
            rx.internal.operators.EmptyObservableHolder.$VALUES = r1
            rx.e r0 = rx.e.I6(r0)
            rx.internal.operators.EmptyObservableHolder.EMPTY = r0
            return
    }

    EmptyObservableHolder(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static <T> rx.e<T> instance() {
            rx.e<java.lang.Object> r0 = rx.internal.operators.EmptyObservableHolder.EMPTY
            return r0
    }

    public static rx.internal.operators.EmptyObservableHolder valueOf(java.lang.String r1) {
            java.lang.Class<rx.internal.operators.EmptyObservableHolder> r0 = rx.internal.operators.EmptyObservableHolder.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            rx.internal.operators.EmptyObservableHolder r1 = (rx.internal.operators.EmptyObservableHolder) r1
            return r1
    }

    public static rx.internal.operators.EmptyObservableHolder[] values() {
            rx.internal.operators.EmptyObservableHolder[] r0 = rx.internal.operators.EmptyObservableHolder.$VALUES
            java.lang.Object r0 = r0.clone()
            rx.internal.operators.EmptyObservableHolder[] r0 = (rx.internal.operators.EmptyObservableHolder[]) r0
            return r0
    }

    public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            r0.call(r1)
            return
    }

    public void call(rx.l<? super java.lang.Object> r1) {
            r0 = this;
            r1.onCompleted()
            return
    }
}
