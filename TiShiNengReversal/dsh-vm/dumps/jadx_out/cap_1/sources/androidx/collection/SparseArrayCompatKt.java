package androidx.collection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSparseArrayCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseArrayCompat.kt\nandroidx/collection/SparseArrayCompatKt\n*L\n1#1,535:1\n244#1,6:536\n244#1,6:542\n353#1,40:548\n353#1,40:588\n459#1,9:628\n*S KotlinDebug\n*F\n+ 1 SparseArrayCompat.kt\nandroidx/collection/SparseArrayCompatKt\n*L\n255#1:536,6\n260#1:542,6\n397#1:548,40\n405#1:588,40\n477#1:628,9\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class SparseArrayCompatKt {

    @org.jetbrains.annotations.NotNull
    private static final java.lang.Object DELETED = null;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.collection.SparseArrayCompatKt.DELETED = r0
            return
    }

    public static final /* synthetic */ void access$gc(androidx.collection.SparseArrayCompat r0) {
            gc(r0)
            return
    }

    public static final /* synthetic */ java.lang.Object access$getDELETED$p() {
            java.lang.Object r0 = androidx.collection.SparseArrayCompatKt.DELETED
            return r0
    }

    public static final <E> void commonAppend(@org.jetbrains.annotations.NotNull androidx.collection.SparseArrayCompat<E> r4, int r5, E r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r4.size
            if (r0 == 0) goto L15
            int[] r1 = r4.keys
            int r2 = r0 + (-1)
            r1 = r1[r2]
            if (r5 > r1) goto L15
            r4.put(r5, r6)
            return
        L15:
            boolean r1 = r4.garbage
            if (r1 == 0) goto L21
            int[] r1 = r4.keys
            int r1 = r1.length
            if (r0 < r1) goto L21
            access$gc(r4)
        L21:
            int r0 = r4.size
            int[] r1 = r4.keys
            int r1 = r1.length
            if (r0 < r1) goto L46
            int r1 = r0 + 1
            int r1 = androidx.collection.internal.ContainerHelpersKt.idealIntArraySize(r1)
            int[] r2 = r4.keys
            int[] r2 = java.util.Arrays.copyOf(r2, r1)
            java.lang.String r3 = "copyOf(this, newSize)"
            kotlin.jvm.internal.g0.o(r2, r3)
            r4.keys = r2
            java.lang.Object[] r2 = r4.values
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r2, r1)
            kotlin.jvm.internal.g0.o(r1, r3)
            r4.values = r1
        L46:
            int[] r1 = r4.keys
            r1[r0] = r5
            java.lang.Object[] r5 = r4.values
            r5[r0] = r6
            int r0 = r0 + 1
            r4.size = r0
            return
    }

    public static final <E> void commonClear(@org.jetbrains.annotations.NotNull androidx.collection.SparseArrayCompat<E> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            int r0 = r5.size
            java.lang.Object[] r1 = r5.values
            r2 = 0
            r3 = 0
        Lb:
            if (r3 >= r0) goto L13
            r4 = 0
            r1[r3] = r4
            int r3 = r3 + 1
            goto Lb
        L13:
            r5.size = r2
            r5.garbage = r2
            return
    }

    public static final <E> boolean commonContainsKey(@org.jetbrains.annotations.NotNull androidx.collection.SparseArrayCompat<E> r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r1 = r1.indexOfKey(r2)
            if (r1 < 0) goto Ld
            r1 = 1
            return r1
        Ld:
            r1 = 0
            return r1
    }

    public static final <E> boolean commonContainsValue(@org.jetbrains.annotations.NotNull androidx.collection.SparseArrayCompat<E> r4, E r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            boolean r0 = r4.garbage
            if (r0 == 0) goto Lc
            access$gc(r4)
        Lc:
            int r0 = r4.size
            r1 = 0
            r2 = 0
        L10:
            if (r2 >= r0) goto L1c
            java.lang.Object[] r3 = r4.values
            r3 = r3[r2]
            if (r3 != r5) goto L19
            goto L1d
        L19:
            int r2 = r2 + 1
            goto L10
        L1c:
            r2 = -1
        L1d:
            if (r2 < 0) goto L21
            r4 = 1
            return r4
        L21:
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final <E> E commonGet(@org.jetbrains.annotations.NotNull androidx.collection.SparseArrayCompat<E> r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            int[] r0 = r2.keys
            int r1 = r2.size
            int r3 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r0, r1, r3)
            if (r3 < 0) goto L19
            java.lang.Object[] r2 = r2.values
            r2 = r2[r3]
            java.lang.Object r3 = androidx.collection.SparseArrayCompatKt.DELETED
            if (r2 != r3) goto L18
            goto L19
        L18:
            return r2
        L19:
            r2 = 0
            return r2
    }

    public static final <E> E commonGet(@org.jetbrains.annotations.NotNull androidx.collection.SparseArrayCompat<E> r2, int r3, E r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            int[] r0 = r2.keys
            int r1 = r2.size
            int r3 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r0, r1, r3)
            if (r3 < 0) goto L19
            java.lang.Object[] r2 = r2.values
            r2 = r2[r3]
            java.lang.Object r3 = androidx.collection.SparseArrayCompatKt.DELETED
            if (r2 != r3) goto L18
            goto L19
        L18:
            return r2
        L19:
            return r4
    }

    public static final <E> int commonIndexOfKey(@org.jetbrains.annotations.NotNull androidx.collection.SparseArrayCompat<E> r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1.garbage
            if (r0 == 0) goto Lc
            access$gc(r1)
        Lc:
            int[] r0 = r1.keys
            int r1 = r1.size
            int r1 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r0, r1, r2)
            return r1
    }

    public static final <E> int commonIndexOfValue(@org.jetbrains.annotations.NotNull androidx.collection.SparseArrayCompat<E> r3, E r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = r3.garbage
            if (r0 == 0) goto Lc
            access$gc(r3)
        Lc:
            int r0 = r3.size
            r1 = 0
        Lf:
            if (r1 >= r0) goto L1b
            java.lang.Object[] r2 = r3.values
            r2 = r2[r1]
            if (r2 != r4) goto L18
            return r1
        L18:
            int r1 = r1 + 1
            goto Lf
        L1b:
            r3 = -1
            return r3
    }

    public static final <E> boolean commonIsEmpty(@org.jetbrains.annotations.NotNull androidx.collection.SparseArrayCompat<E> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r1 = r1.size()
            if (r1 != 0) goto Ld
            r1 = 1
            return r1
        Ld:
            r1 = 0
            return r1
    }

    public static final <E> int commonKeyAt(@org.jetbrains.annotations.NotNull androidx.collection.SparseArrayCompat<E> r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1.garbage
            if (r0 == 0) goto Lc
            access$gc(r1)
        Lc:
            int[] r1 = r1.keys
            r1 = r1[r2]
            return r1
    }

    public static final <E> void commonPut(@org.jetbrains.annotations.NotNull androidx.collection.SparseArrayCompat<E> r4, int r5, E r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            int[] r0 = r4.keys
            int r1 = r4.size
            int r0 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r0, r1, r5)
            if (r0 < 0) goto L14
            java.lang.Object[] r4 = r4.values
            r4[r0] = r6
            return
        L14:
            int r0 = ~r0
            int r1 = r4.size
            if (r0 >= r1) goto L2c
            java.lang.Object[] r1 = r4.values
            r1 = r1[r0]
            java.lang.Object r2 = access$getDELETED$p()
            if (r1 != r2) goto L2c
            int[] r1 = r4.keys
            r1[r0] = r5
            java.lang.Object[] r4 = r4.values
            r4[r0] = r6
            return
        L2c:
            boolean r1 = r4.garbage
            if (r1 == 0) goto L43
            int r1 = r4.size
            int[] r2 = r4.keys
            int r2 = r2.length
            if (r1 < r2) goto L43
            access$gc(r4)
            int[] r0 = r4.keys
            int r1 = r4.size
            int r0 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r0, r1, r5)
            int r0 = ~r0
        L43:
            int r1 = r4.size
            int[] r2 = r4.keys
            int r2 = r2.length
            if (r1 < r2) goto L68
            int r1 = r1 + 1
            int r1 = androidx.collection.internal.ContainerHelpersKt.idealIntArraySize(r1)
            int[] r2 = r4.keys
            int[] r2 = java.util.Arrays.copyOf(r2, r1)
            java.lang.String r3 = "copyOf(this, newSize)"
            kotlin.jvm.internal.g0.o(r2, r3)
            r4.keys = r2
            java.lang.Object[] r2 = r4.values
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r2, r1)
            kotlin.jvm.internal.g0.o(r1, r3)
            r4.values = r1
        L68:
            int r1 = r4.size
            int r2 = r1 - r0
            if (r2 == 0) goto L7c
            int[] r2 = r4.keys
            int r3 = r0 + 1
            kotlin.collections.n.z0(r2, r2, r3, r0, r1)
            java.lang.Object[] r1 = r4.values
            int r2 = r4.size
            kotlin.collections.n.B0(r1, r1, r3, r0, r2)
        L7c:
            int[] r1 = r4.keys
            r1[r0] = r5
            java.lang.Object[] r5 = r4.values
            r5[r0] = r6
            int r5 = r4.size
            int r5 = r5 + 1
            r4.size = r5
            return
    }

    public static final <E> void commonPutAll(@org.jetbrains.annotations.NotNull androidx.collection.SparseArrayCompat<E> r8, @org.jetbrains.annotations.NotNull androidx.collection.SparseArrayCompat<? extends E> r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r9, r0)
            int r0 = r9.size()
            r1 = 0
        Lf:
            if (r1 >= r0) goto La3
            int r2 = r9.keyAt(r1)
            java.lang.Object r3 = r9.valueAt(r1)
            int[] r4 = r8.keys
            int r5 = r8.size
            int r4 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r4, r5, r2)
            if (r4 < 0) goto L29
            java.lang.Object[] r2 = r8.values
            r2[r4] = r3
            goto L9f
        L29:
            int r4 = ~r4
            int r5 = r8.size
            if (r4 >= r5) goto L41
            java.lang.Object[] r5 = r8.values
            r5 = r5[r4]
            java.lang.Object r6 = access$getDELETED$p()
            if (r5 != r6) goto L41
            int[] r5 = r8.keys
            r5[r4] = r2
            java.lang.Object[] r2 = r8.values
            r2[r4] = r3
            goto L9f
        L41:
            boolean r5 = r8.garbage
            if (r5 == 0) goto L58
            int r5 = r8.size
            int[] r6 = r8.keys
            int r6 = r6.length
            if (r5 < r6) goto L58
            access$gc(r8)
            int[] r4 = r8.keys
            int r5 = r8.size
            int r4 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r4, r5, r2)
            int r4 = ~r4
        L58:
            int r5 = r8.size
            int[] r6 = r8.keys
            int r6 = r6.length
            if (r5 < r6) goto L7d
            int r5 = r5 + 1
            int r5 = androidx.collection.internal.ContainerHelpersKt.idealIntArraySize(r5)
            int[] r6 = r8.keys
            int[] r6 = java.util.Arrays.copyOf(r6, r5)
            java.lang.String r7 = "copyOf(this, newSize)"
            kotlin.jvm.internal.g0.o(r6, r7)
            r8.keys = r6
            java.lang.Object[] r6 = r8.values
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r6, r5)
            kotlin.jvm.internal.g0.o(r5, r7)
            r8.values = r5
        L7d:
            int r5 = r8.size
            int r6 = r5 - r4
            if (r6 == 0) goto L91
            int[] r6 = r8.keys
            int r7 = r4 + 1
            kotlin.collections.n.z0(r6, r6, r7, r4, r5)
            java.lang.Object[] r5 = r8.values
            int r6 = r8.size
            kotlin.collections.n.B0(r5, r5, r7, r4, r6)
        L91:
            int[] r5 = r8.keys
            r5[r4] = r2
            java.lang.Object[] r2 = r8.values
            r2[r4] = r3
            int r2 = r8.size
            int r2 = r2 + 1
            r8.size = r2
        L9f:
            int r1 = r1 + 1
            goto Lf
        La3:
            return
    }

    @org.jetbrains.annotations.Nullable
    public static final <E> E commonPutIfAbsent(@org.jetbrains.annotations.NotNull androidx.collection.SparseArrayCompat<E> r5, int r6, E r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.Object r0 = commonGet(r5, r6)
            if (r0 != 0) goto L90
            int[] r1 = r5.keys
            int r2 = r5.size
            int r1 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r1, r2, r6)
            if (r1 < 0) goto L1a
            java.lang.Object[] r5 = r5.values
            r5[r1] = r7
            return r0
        L1a:
            int r1 = ~r1
            int r2 = r5.size
            if (r1 >= r2) goto L32
            java.lang.Object[] r2 = r5.values
            r2 = r2[r1]
            java.lang.Object r3 = access$getDELETED$p()
            if (r2 != r3) goto L32
            int[] r2 = r5.keys
            r2[r1] = r6
            java.lang.Object[] r5 = r5.values
            r5[r1] = r7
            return r0
        L32:
            boolean r2 = r5.garbage
            if (r2 == 0) goto L49
            int r2 = r5.size
            int[] r3 = r5.keys
            int r3 = r3.length
            if (r2 < r3) goto L49
            access$gc(r5)
            int[] r1 = r5.keys
            int r2 = r5.size
            int r1 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r1, r2, r6)
            int r1 = ~r1
        L49:
            int r2 = r5.size
            int[] r3 = r5.keys
            int r3 = r3.length
            if (r2 < r3) goto L6e
            int r2 = r2 + 1
            int r2 = androidx.collection.internal.ContainerHelpersKt.idealIntArraySize(r2)
            int[] r3 = r5.keys
            int[] r3 = java.util.Arrays.copyOf(r3, r2)
            java.lang.String r4 = "copyOf(this, newSize)"
            kotlin.jvm.internal.g0.o(r3, r4)
            r5.keys = r3
            java.lang.Object[] r3 = r5.values
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r3, r2)
            kotlin.jvm.internal.g0.o(r2, r4)
            r5.values = r2
        L6e:
            int r2 = r5.size
            int r3 = r2 - r1
            if (r3 == 0) goto L82
            int[] r3 = r5.keys
            int r4 = r1 + 1
            kotlin.collections.n.z0(r3, r3, r4, r1, r2)
            java.lang.Object[] r2 = r5.values
            int r3 = r5.size
            kotlin.collections.n.B0(r2, r2, r4, r1, r3)
        L82:
            int[] r2 = r5.keys
            r2[r1] = r6
            java.lang.Object[] r6 = r5.values
            r6[r1] = r7
            int r6 = r5.size
            int r6 = r6 + 1
            r5.size = r6
        L90:
            return r0
    }

    public static final <E> void commonRemove(@org.jetbrains.annotations.NotNull androidx.collection.SparseArrayCompat<E> r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            int[] r0 = r3.keys
            int r1 = r3.size
            int r4 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r0, r1, r4)
            if (r4 < 0) goto L1c
            java.lang.Object[] r0 = r3.values
            r1 = r0[r4]
            java.lang.Object r2 = androidx.collection.SparseArrayCompatKt.DELETED
            if (r1 == r2) goto L1c
            r0[r4] = r2
            r4 = 1
            r3.garbage = r4
        L1c:
            return
    }

    public static final <E> boolean commonRemove(@org.jetbrains.annotations.NotNull androidx.collection.SparseArrayCompat<E> r1, int r2, @org.jetbrains.annotations.Nullable java.lang.Object r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r2 = r1.indexOfKey(r2)
            if (r2 < 0) goto L1a
            java.lang.Object r0 = r1.valueAt(r2)
            boolean r3 = kotlin.jvm.internal.g0.g(r3, r0)
            if (r3 == 0) goto L1a
            r1.removeAt(r2)
            r1 = 1
            return r1
        L1a:
            r1 = 0
            return r1
    }

    public static final <E> void commonRemoveAt(@org.jetbrains.annotations.NotNull androidx.collection.SparseArrayCompat<E> r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Object[] r0 = r2.values
            r0 = r0[r3]
            java.lang.Object r1 = access$getDELETED$p()
            if (r0 == r1) goto L1a
            java.lang.Object[] r0 = r2.values
            java.lang.Object r1 = access$getDELETED$p()
            r0[r3] = r1
            r3 = 1
            r2.garbage = r3
        L1a:
            return
    }

    public static final <E> void commonRemoveAtRange(@org.jetbrains.annotations.NotNull androidx.collection.SparseArrayCompat<E> r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r0 = r2 + r3
            int r3 = java.lang.Math.min(r3, r0)
        Lb:
            if (r2 >= r3) goto L13
            r1.removeAt(r2)
            int r2 = r2 + 1
            goto Lb
        L13:
            return
    }

    @org.jetbrains.annotations.Nullable
    public static final <E> E commonReplace(@org.jetbrains.annotations.NotNull androidx.collection.SparseArrayCompat<E> r1, int r2, E r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r2 = r1.indexOfKey(r2)
            if (r2 < 0) goto L12
            java.lang.Object[] r1 = r1.values
            r0 = r1[r2]
            r1[r2] = r3
            return r0
        L12:
            r1 = 0
            return r1
    }

    public static final <E> boolean commonReplace(@org.jetbrains.annotations.NotNull androidx.collection.SparseArrayCompat<E> r1, int r2, E r3, E r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r2 = r1.indexOfKey(r2)
            if (r2 < 0) goto L1b
            java.lang.Object[] r0 = r1.values
            r0 = r0[r2]
            boolean r3 = kotlin.jvm.internal.g0.g(r0, r3)
            if (r3 == 0) goto L1b
            java.lang.Object[] r1 = r1.values
            r1[r2] = r4
            r1 = 1
            return r1
        L1b:
            r1 = 0
            return r1
    }

    public static final <E> void commonSetValueAt(@org.jetbrains.annotations.NotNull androidx.collection.SparseArrayCompat<E> r1, int r2, E r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1.garbage
            if (r0 == 0) goto Lc
            access$gc(r1)
        Lc:
            java.lang.Object[] r1 = r1.values
            r1[r2] = r3
            return
    }

    public static final <E> int commonSize(@org.jetbrains.annotations.NotNull androidx.collection.SparseArrayCompat<E> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1.garbage
            if (r0 == 0) goto Lc
            access$gc(r1)
        Lc:
            int r1 = r1.size
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <E> java.lang.String commonToString(@org.jetbrains.annotations.NotNull androidx.collection.SparseArrayCompat<E> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r4.size()
            if (r0 > 0) goto Lf
            java.lang.String r4 = "{}"
            return r4
        Lf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r4.size
            int r1 = r1 * 28
            r0.<init>(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            int r1 = r4.size
            r2 = 0
        L20:
            if (r2 >= r1) goto L47
            if (r2 <= 0) goto L29
            java.lang.String r3 = ", "
            r0.append(r3)
        L29:
            int r3 = r4.keyAt(r2)
            r0.append(r3)
            r3 = 61
            r0.append(r3)
            java.lang.Object r3 = r4.valueAt(r2)
            if (r3 == r4) goto L3f
            r0.append(r3)
            goto L44
        L3f:
            java.lang.String r3 = "(this Map)"
            r0.append(r3)
        L44:
            int r2 = r2 + 1
            goto L20
        L47:
            r4 = 125(0x7d, float:1.75E-43)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "buffer.toString()"
            kotlin.jvm.internal.g0.o(r4, r0)
            return r4
    }

    public static final <E> E commonValueAt(@org.jetbrains.annotations.NotNull androidx.collection.SparseArrayCompat<E> r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1.garbage
            if (r0 == 0) goto Lc
            access$gc(r1)
        Lc:
            java.lang.Object[] r1 = r1.values
            r1 = r1[r2]
            return r1
    }

    private static final <E> void gc(androidx.collection.SparseArrayCompat<E> r8) {
            int r0 = r8.size
            int[] r1 = r8.keys
            java.lang.Object[] r2 = r8.values
            r3 = 0
            r4 = 0
            r5 = 0
        L9:
            if (r4 >= r0) goto L21
            r6 = r2[r4]
            java.lang.Object r7 = androidx.collection.SparseArrayCompatKt.DELETED
            if (r6 == r7) goto L1e
            if (r4 == r5) goto L1c
            r7 = r1[r4]
            r1[r5] = r7
            r2[r5] = r6
            r6 = 0
            r2[r4] = r6
        L1c:
            int r5 = r5 + 1
        L1e:
            int r4 = r4 + 1
            goto L9
        L21:
            r8.garbage = r3
            r8.size = r5
            return
    }

    private static final <E, T extends E> T internalGet(androidx.collection.SparseArrayCompat<E> r2, int r3, T r4) {
            int[] r0 = r2.keys
            int r1 = r2.size
            int r3 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r0, r1, r3)
            if (r3 < 0) goto L14
            java.lang.Object[] r2 = r2.values
            r2 = r2[r3]
            java.lang.Object r3 = androidx.collection.SparseArrayCompatKt.DELETED
            if (r2 != r3) goto L13
            goto L14
        L13:
            return r2
        L14:
            return r4
    }
}
