package rx.internal.schedulers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class g extends rx.h {
    private final java.util.concurrent.ThreadFactory a;

    public g(java.util.concurrent.ThreadFactory r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public rx.h.a a() {
            r2 = this;
            rx.internal.schedulers.h r0 = new rx.internal.schedulers.h
            java.util.concurrent.ThreadFactory r1 = r2.a
            r0.<init>(r1)
            return r0
    }
}
