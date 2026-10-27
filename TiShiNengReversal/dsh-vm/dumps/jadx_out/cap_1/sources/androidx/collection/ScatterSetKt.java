package androidx.collection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSetKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1100:1\n1#2:1101\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ScatterSetKt {

    @org.jetbrains.annotations.NotNull
    private static final androidx.collection.MutableScatterSet<java.lang.Object> EmptyScatterSet = null;

    static {
            androidx.collection.MutableScatterSet r0 = new androidx.collection.MutableScatterSet
            r1 = 0
            r0.<init>(r1)
            androidx.collection.ScatterSetKt.EmptyScatterSet = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final <E> androidx.collection.ScatterSet<E> emptyScatterSet() {
            androidx.collection.MutableScatterSet<java.lang.Object> r0 = androidx.collection.ScatterSetKt.EmptyScatterSet
            java.lang.String r1 = "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>"
            kotlin.jvm.internal.g0.n(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <E> androidx.collection.MutableScatterSet<E> mutableScatterSetOf() {
            androidx.collection.MutableScatterSet r0 = new androidx.collection.MutableScatterSet
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <E> androidx.collection.MutableScatterSet<E> mutableScatterSetOf(E r2) {
            androidx.collection.MutableScatterSet r0 = new androidx.collection.MutableScatterSet
            r1 = 1
            r0.<init>(r1)
            r0.plusAssign(r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <E> androidx.collection.MutableScatterSet<E> mutableScatterSetOf(E r2, E r3) {
            androidx.collection.MutableScatterSet r0 = new androidx.collection.MutableScatterSet
            r1 = 2
            r0.<init>(r1)
            r0.plusAssign(r2)
            r0.plusAssign(r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <E> androidx.collection.MutableScatterSet<E> mutableScatterSetOf(E r2, E r3, E r4) {
            androidx.collection.MutableScatterSet r0 = new androidx.collection.MutableScatterSet
            r1 = 3
            r0.<init>(r1)
            r0.plusAssign(r2)
            r0.plusAssign(r3)
            r0.plusAssign(r4)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <E> androidx.collection.MutableScatterSet<E> mutableScatterSetOf(@org.jetbrains.annotations.NotNull E... r2) {
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            androidx.collection.MutableScatterSet r0 = new androidx.collection.MutableScatterSet
            int r1 = r2.length
            r0.<init>(r1)
            r0.plusAssign(r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <E> androidx.collection.ScatterSet<E> scatterSetOf() {
            androidx.collection.MutableScatterSet<java.lang.Object> r0 = androidx.collection.ScatterSetKt.EmptyScatterSet
            java.lang.String r1 = "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.scatterSetOf>"
            kotlin.jvm.internal.g0.n(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <E> androidx.collection.ScatterSet<E> scatterSetOf(E r0) {
            androidx.collection.MutableScatterSet r0 = mutableScatterSetOf(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <E> androidx.collection.ScatterSet<E> scatterSetOf(E r0, E r1) {
            androidx.collection.MutableScatterSet r0 = mutableScatterSetOf(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <E> androidx.collection.ScatterSet<E> scatterSetOf(E r0, E r1, E r2) {
            androidx.collection.MutableScatterSet r0 = mutableScatterSetOf(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <E> androidx.collection.ScatterSet<E> scatterSetOf(@org.jetbrains.annotations.NotNull E... r2) {
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            androidx.collection.MutableScatterSet r0 = new androidx.collection.MutableScatterSet
            int r1 = r2.length
            r0.<init>(r1)
            r0.plusAssign(r2)
            return r0
    }
}
