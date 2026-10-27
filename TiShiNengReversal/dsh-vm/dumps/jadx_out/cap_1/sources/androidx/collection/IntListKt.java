package androidx.collection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nIntList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntList.kt\nandroidx/collection/IntListKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntList.kt\nandroidx/collection/MutableIntList\n*L\n1#1,969:1\n1#2:970\n713#3,2:971\n713#3,2:973\n713#3,2:975\n713#3,2:977\n713#3,2:979\n713#3,2:981\n*S KotlinDebug\n*F\n+ 1 IntList.kt\nandroidx/collection/IntListKt\n*L\n938#1:971,2\n947#1:973,2\n948#1:975,2\n958#1:977,2\n959#1:979,2\n960#1:981,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class IntListKt {

    @org.jetbrains.annotations.NotNull
    private static final androidx.collection.IntList EmptyIntList = null;

    static {
            androidx.collection.MutableIntList r0 = new androidx.collection.MutableIntList
            r1 = 0
            r0.<init>(r1)
            androidx.collection.IntListKt.EmptyIntList = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.collection.IntList emptyIntList() {
            androidx.collection.IntList r0 = androidx.collection.IntListKt.EmptyIntList
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.collection.IntList intListOf() {
            androidx.collection.IntList r0 = androidx.collection.IntListKt.EmptyIntList
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.collection.IntList intListOf(int r0) {
            androidx.collection.MutableIntList r0 = mutableIntListOf(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.collection.IntList intListOf(int r0, int r1) {
            androidx.collection.MutableIntList r0 = mutableIntListOf(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.collection.IntList intListOf(int r0, int r1, int r2) {
            androidx.collection.MutableIntList r0 = mutableIntListOf(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.collection.IntList intListOf(@org.jetbrains.annotations.NotNull int... r2) {
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            androidx.collection.MutableIntList r0 = new androidx.collection.MutableIntList
            int r1 = r2.length
            r0.<init>(r1)
            r0.plusAssign(r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.collection.MutableIntList mutableIntListOf() {
            androidx.collection.MutableIntList r0 = new androidx.collection.MutableIntList
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.collection.MutableIntList mutableIntListOf(int r2) {
            androidx.collection.MutableIntList r0 = new androidx.collection.MutableIntList
            r1 = 1
            r0.<init>(r1)
            r0.add(r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.collection.MutableIntList mutableIntListOf(int r2, int r3) {
            androidx.collection.MutableIntList r0 = new androidx.collection.MutableIntList
            r1 = 2
            r0.<init>(r1)
            r0.add(r2)
            r0.add(r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.collection.MutableIntList mutableIntListOf(int r2, int r3, int r4) {
            androidx.collection.MutableIntList r0 = new androidx.collection.MutableIntList
            r1 = 3
            r0.<init>(r1)
            r0.add(r2)
            r0.add(r3)
            r0.add(r4)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.collection.MutableIntList mutableIntListOf(@org.jetbrains.annotations.NotNull int... r2) {
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            androidx.collection.MutableIntList r0 = new androidx.collection.MutableIntList
            int r1 = r2.length
            r0.<init>(r1)
            r0.plusAssign(r2)
            return r0
    }
}
