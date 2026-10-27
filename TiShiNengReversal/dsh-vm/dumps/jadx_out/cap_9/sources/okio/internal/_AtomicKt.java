package okio.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class _AtomicKt {
    public _AtomicKt() {
            r1 = this;
            r1.<init>()
            return
    }

    public static final int setBitsOrZero(@org.jetbrains.annotations.NotNull java.util.concurrent.atomic.AtomicInteger r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
        L5:
            int r0 = r2.get()
            r1 = r0 & r3
            if (r1 == 0) goto Lf
            r2 = 0
            return r2
        Lf:
            r1 = r0 | r3
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 == 0) goto L5
            return r1
    }
}
