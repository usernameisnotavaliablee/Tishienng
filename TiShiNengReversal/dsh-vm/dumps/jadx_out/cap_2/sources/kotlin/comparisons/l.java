package kotlin.comparisons;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class l<T> implements java.util.Comparator<T> {

    @org.jetbrains.annotations.NotNull
    private final java.util.Comparator<T> a;

    public l(@org.jetbrains.annotations.NotNull java.util.Comparator<T> r2) {
            r1 = this;
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Comparator<T> a() {
            r1 = this;
            java.util.Comparator<T> r0 = r1.a
            return r0
    }

    @Override // java.util.Comparator
    public int compare(T r2, T r3) {
            r1 = this;
            java.util.Comparator<T> r0 = r1.a
            int r2 = r0.compare(r3, r2)
            return r2
    }

    @Override // java.util.Comparator
    @org.jetbrains.annotations.NotNull
    public final java.util.Comparator<T> reversed() {
            r1 = this;
            java.util.Comparator<T> r0 = r1.a
            return r0
    }
}
