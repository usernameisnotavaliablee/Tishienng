package androidx.collection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nLongSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSet.kt\nandroidx/collection/LongSetKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,853:1\n1#2:854\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class LongSetKt {

    @org.jetbrains.annotations.NotNull
    private static final long[] EmptyLongArray = null;

    @org.jetbrains.annotations.NotNull
    private static final androidx.collection.MutableLongSet EmptyLongSet = null;

    static {
            androidx.collection.MutableLongSet r0 = new androidx.collection.MutableLongSet
            r1 = 0
            r0.<init>(r1)
            androidx.collection.LongSetKt.EmptyLongSet = r0
            long[] r0 = new long[r1]
            androidx.collection.LongSetKt.EmptyLongArray = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.collection.LongSet emptyLongSet() {
            androidx.collection.MutableLongSet r0 = androidx.collection.LongSetKt.EmptyLongSet
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final long[] getEmptyLongArray() {
            long[] r0 = androidx.collection.LongSetKt.EmptyLongArray
            return r0
    }

    public static final int hash(long r0) {
            int r0 = androidx.camera.camera2.internal.compat.params.e.a(r0)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.collection.LongSet longSetOf() {
            androidx.collection.MutableLongSet r0 = androidx.collection.LongSetKt.EmptyLongSet
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.collection.LongSet longSetOf(long r0) {
            androidx.collection.MutableLongSet r0 = mutableLongSetOf(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.collection.LongSet longSetOf(long r0, long r2) {
            androidx.collection.MutableLongSet r0 = mutableLongSetOf(r0, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.collection.LongSet longSetOf(long r0, long r2, long r4) {
            androidx.collection.MutableLongSet r0 = mutableLongSetOf(r0, r2, r4)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.collection.LongSet longSetOf(@org.jetbrains.annotations.NotNull long... r2) {
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            androidx.collection.MutableLongSet r0 = new androidx.collection.MutableLongSet
            int r1 = r2.length
            r0.<init>(r1)
            r0.plusAssign(r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.collection.MutableLongSet mutableLongSetOf() {
            androidx.collection.MutableLongSet r0 = new androidx.collection.MutableLongSet
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.collection.MutableLongSet mutableLongSetOf(long r2) {
            androidx.collection.MutableLongSet r0 = new androidx.collection.MutableLongSet
            r1 = 1
            r0.<init>(r1)
            r0.plusAssign(r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.collection.MutableLongSet mutableLongSetOf(long r2, long r4) {
            androidx.collection.MutableLongSet r0 = new androidx.collection.MutableLongSet
            r1 = 2
            r0.<init>(r1)
            r0.plusAssign(r2)
            r0.plusAssign(r4)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.collection.MutableLongSet mutableLongSetOf(long r2, long r4, long r6) {
            androidx.collection.MutableLongSet r0 = new androidx.collection.MutableLongSet
            r1 = 3
            r0.<init>(r1)
            r0.plusAssign(r2)
            r0.plusAssign(r4)
            r0.plusAssign(r6)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.collection.MutableLongSet mutableLongSetOf(@org.jetbrains.annotations.NotNull long... r2) {
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            androidx.collection.MutableLongSet r0 = new androidx.collection.MutableLongSet
            int r1 = r2.length
            r0.<init>(r1)
            r0.plusAssign(r2)
            return r0
    }
}
