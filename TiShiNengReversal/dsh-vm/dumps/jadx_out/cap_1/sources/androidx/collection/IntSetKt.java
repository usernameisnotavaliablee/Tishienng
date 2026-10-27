package androidx.collection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nIntSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntSet.kt\nandroidx/collection/IntSetKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,853:1\n1#2:854\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class IntSetKt {

    @org.jetbrains.annotations.NotNull
    private static final int[] EmptyIntArray = null;

    @org.jetbrains.annotations.NotNull
    private static final androidx.collection.MutableIntSet EmptyIntSet = null;

    static {
            androidx.collection.MutableIntSet r0 = new androidx.collection.MutableIntSet
            r1 = 0
            r0.<init>(r1)
            androidx.collection.IntSetKt.EmptyIntSet = r0
            int[] r0 = new int[r1]
            androidx.collection.IntSetKt.EmptyIntArray = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.collection.IntSet emptyIntSet() {
            androidx.collection.MutableIntSet r0 = androidx.collection.IntSetKt.EmptyIntSet
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final int[] getEmptyIntArray() {
            int[] r0 = androidx.collection.IntSetKt.EmptyIntArray
            return r0
    }

    public static final int hash(int r1) {
            r0 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r0
            int r0 = r1 << 16
            r1 = r1 ^ r0
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.collection.IntSet intSetOf() {
            androidx.collection.MutableIntSet r0 = androidx.collection.IntSetKt.EmptyIntSet
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.collection.IntSet intSetOf(int r0) {
            androidx.collection.MutableIntSet r0 = mutableIntSetOf(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.collection.IntSet intSetOf(int r0, int r1) {
            androidx.collection.MutableIntSet r0 = mutableIntSetOf(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.collection.IntSet intSetOf(int r0, int r1, int r2) {
            androidx.collection.MutableIntSet r0 = mutableIntSetOf(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.collection.IntSet intSetOf(@org.jetbrains.annotations.NotNull int... r2) {
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            androidx.collection.MutableIntSet r0 = new androidx.collection.MutableIntSet
            int r1 = r2.length
            r0.<init>(r1)
            r0.plusAssign(r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.collection.MutableIntSet mutableIntSetOf() {
            androidx.collection.MutableIntSet r0 = new androidx.collection.MutableIntSet
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.collection.MutableIntSet mutableIntSetOf(int r2) {
            androidx.collection.MutableIntSet r0 = new androidx.collection.MutableIntSet
            r1 = 1
            r0.<init>(r1)
            r0.plusAssign(r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.collection.MutableIntSet mutableIntSetOf(int r2, int r3) {
            androidx.collection.MutableIntSet r0 = new androidx.collection.MutableIntSet
            r1 = 2
            r0.<init>(r1)
            r0.plusAssign(r2)
            r0.plusAssign(r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.collection.MutableIntSet mutableIntSetOf(int r2, int r3, int r4) {
            androidx.collection.MutableIntSet r0 = new androidx.collection.MutableIntSet
            r1 = 3
            r0.<init>(r1)
            r0.plusAssign(r2)
            r0.plusAssign(r3)
            r0.plusAssign(r4)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.collection.MutableIntSet mutableIntSetOf(@org.jetbrains.annotations.NotNull int... r2) {
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            androidx.collection.MutableIntSet r0 = new androidx.collection.MutableIntSet
            int r1 = r2.length
            r0.<init>(r1)
            r0.plusAssign(r2)
            return r0
    }
}
