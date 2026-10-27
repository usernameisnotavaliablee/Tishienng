package kotlin.sequences;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class a<T> implements kotlin.sequences.m<T> {

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.atomic.AtomicReference<kotlin.sequences.m<T>> a;

    public a(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r2) {
            r1 = this;
            java.lang.String r0 = "sequence"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>(r2)
            r1.a = r0
            return
    }

    @Override // kotlin.sequences.m
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<T> iterator() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<kotlin.sequences.m<T>> r0 = r2.a
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r1)
            kotlin.sequences.m r0 = (kotlin.sequences.m) r0
            if (r0 == 0) goto L10
            java.util.Iterator r0 = r0.iterator()
            return r0
        L10:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This sequence can be consumed only once."
            r0.<init>(r1)
            throw r0
    }
}
