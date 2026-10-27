package kotlin.collections;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class o1<E> extends kotlin.collections.d<E> implements java.util.RandomAccess {

    @org.jetbrains.annotations.NotNull
    private final java.util.List<E> a;
    private int b;
    private int c;

    public o1(@org.jetbrains.annotations.NotNull java.util.List<? extends E> r2) {
            r1 = this;
            java.lang.String r0 = "list"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            return
    }

    public final void e(int r3, int r4) {
            r2 = this;
            kotlin.collections.d$a r0 = kotlin.collections.d.Companion
            java.util.List<E> r1 = r2.a
            int r1 = r1.size()
            r0.d(r3, r4, r1)
            r2.b = r3
            int r4 = r4 - r3
            r2.c = r4
            return
    }

    @Override // kotlin.collections.d, java.util.List
    public E get(int r3) {
            r2 = this;
            kotlin.collections.d$a r0 = kotlin.collections.d.Companion
            int r1 = r2.c
            r0.b(r3, r1)
            java.util.List<E> r0 = r2.a
            int r1 = r2.b
            int r1 = r1 + r3
            java.lang.Object r3 = r0.get(r1)
            return r3
    }

    @Override // kotlin.collections.d, kotlin.collections.b
    public int getSize() {
            r1 = this;
            int r0 = r1.c
            return r0
    }
}
