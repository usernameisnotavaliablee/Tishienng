package androidx.collection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nObjectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectList.kt\nandroidx/collection/ObjectListKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ObjectList.kt\nandroidx/collection/MutableObjectList\n*L\n1#1,1618:1\n1#2:1619\n948#3,2:1620\n948#3,2:1622\n948#3,2:1624\n948#3,2:1626\n948#3,2:1628\n948#3,2:1630\n*S KotlinDebug\n*F\n+ 1 ObjectList.kt\nandroidx/collection/ObjectListKt\n*L\n1587#1:1620,2\n1596#1:1622,2\n1597#1:1624,2\n1607#1:1626,2\n1608#1:1628,2\n1609#1:1630,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ObjectListKt {

    @org.jetbrains.annotations.NotNull
    private static final java.lang.Object[] EmptyArray = null;

    @org.jetbrains.annotations.NotNull
    private static final androidx.collection.ObjectList<java.lang.Object> EmptyObjectList = null;

    static {
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            androidx.collection.ObjectListKt.EmptyArray = r1
            androidx.collection.MutableObjectList r1 = new androidx.collection.MutableObjectList
            r1.<init>(r0)
            androidx.collection.ObjectListKt.EmptyObjectList = r1
            return
    }

    public static final /* synthetic */ void access$checkIndex(java.util.List r0, int r1) {
            checkIndex(r0, r1)
            return
    }

    public static final /* synthetic */ void access$checkSubIndex(java.util.List r0, int r1, int r2) {
            checkSubIndex(r0, r1, r2)
            return
    }

    public static final /* synthetic */ java.lang.Object[] access$getEmptyArray$p() {
            java.lang.Object[] r0 = androidx.collection.ObjectListKt.EmptyArray
            return r0
    }

    private static final void checkIndex(java.util.List<?> r3, int r4) {
            int r3 = r3.size()
            if (r4 < 0) goto L9
            if (r4 >= r3) goto L9
            return
        L9:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Index "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " is out of bounds. The list has "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r3 = " elements."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    private static final void checkSubIndex(java.util.List<?> r2, int r3, int r4) {
            int r2 = r2.size()
            if (r3 > r4) goto L4b
            if (r3 < 0) goto L2f
            if (r4 > r2) goto Lb
            return
        Lb:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "toIndex ("
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = ") is more than than the list size ("
            r0.append(r4)
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
        L2f:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "fromIndex ("
            r4.append(r0)
            r4.append(r3)
            java.lang.String r3 = ") is less than 0."
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3)
            throw r2
        L4b:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Indices are out of order. fromIndex ("
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = ") is greater than toIndex ("
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = ")."
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    @org.jetbrains.annotations.NotNull
    public static final <E> androidx.collection.ObjectList<E> emptyObjectList() {
            androidx.collection.ObjectList<java.lang.Object> r0 = androidx.collection.ObjectListKt.EmptyObjectList
            java.lang.String r1 = "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>"
            kotlin.jvm.internal.g0.n(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <E> androidx.collection.MutableObjectList<E> mutableObjectListOf() {
            androidx.collection.MutableObjectList r0 = new androidx.collection.MutableObjectList
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <E> androidx.collection.MutableObjectList<E> mutableObjectListOf(E r2) {
            androidx.collection.MutableObjectList r0 = new androidx.collection.MutableObjectList
            r1 = 1
            r0.<init>(r1)
            r0.add(r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <E> androidx.collection.MutableObjectList<E> mutableObjectListOf(E r2, E r3) {
            androidx.collection.MutableObjectList r0 = new androidx.collection.MutableObjectList
            r1 = 2
            r0.<init>(r1)
            r0.add(r2)
            r0.add(r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <E> androidx.collection.MutableObjectList<E> mutableObjectListOf(E r2, E r3, E r4) {
            androidx.collection.MutableObjectList r0 = new androidx.collection.MutableObjectList
            r1 = 3
            r0.<init>(r1)
            r0.add(r2)
            r0.add(r3)
            r0.add(r4)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <E> androidx.collection.MutableObjectList<E> mutableObjectListOf(@org.jetbrains.annotations.NotNull E... r2) {
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            androidx.collection.MutableObjectList r0 = new androidx.collection.MutableObjectList
            int r1 = r2.length
            r0.<init>(r1)
            r0.plusAssign(r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <E> androidx.collection.ObjectList<E> objectListOf() {
            androidx.collection.ObjectList<java.lang.Object> r0 = androidx.collection.ObjectListKt.EmptyObjectList
            java.lang.String r1 = "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.objectListOf>"
            kotlin.jvm.internal.g0.n(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <E> androidx.collection.ObjectList<E> objectListOf(E r0) {
            androidx.collection.MutableObjectList r0 = mutableObjectListOf(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <E> androidx.collection.ObjectList<E> objectListOf(E r0, E r1) {
            androidx.collection.MutableObjectList r0 = mutableObjectListOf(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <E> androidx.collection.ObjectList<E> objectListOf(E r0, E r1, E r2) {
            androidx.collection.MutableObjectList r0 = mutableObjectListOf(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <E> androidx.collection.ObjectList<E> objectListOf(@org.jetbrains.annotations.NotNull E... r2) {
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            androidx.collection.MutableObjectList r0 = new androidx.collection.MutableObjectList
            int r1 = r2.length
            r0.<init>(r1)
            r0.plusAssign(r2)
            return r0
    }
}
