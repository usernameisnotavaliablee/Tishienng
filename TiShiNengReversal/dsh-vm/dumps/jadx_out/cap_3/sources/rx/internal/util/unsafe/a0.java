package rx.internal.util.unsafe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
abstract class a0<E> extends rx.internal.util.unsafe.f<E> {
    private static final java.lang.Integer x = null;
    protected final int w;

    static {
            java.lang.String r0 = "jctools.spsc.max.lookahead.step"
            r1 = 4096(0x1000, float:5.74E-42)
            java.lang.Integer r0 = java.lang.Integer.getInteger(r0, r1)
            rx.internal.util.unsafe.a0.x = r0
            return
    }

    public a0(int r2) {
            r1 = this;
            r1.<init>(r2)
            int r2 = r2 / 4
            java.lang.Integer r0 = rx.internal.util.unsafe.a0.x
            int r0 = r0.intValue()
            int r2 = java.lang.Math.min(r2, r0)
            r1.w = r2
            return
    }
}
