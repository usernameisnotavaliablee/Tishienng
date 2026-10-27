package androidx.collection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nLongSparseArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSparseArray.kt\nandroidx/collection/LongSparseArrayKt\n*L\n1#1,606:1\n256#1,6:607\n256#1,6:613\n328#1,18:619\n328#1,18:637\n328#1,18:655\n328#1,18:673\n328#1,18:691\n328#1,18:709\n328#1,18:727\n328#1,18:745\n*S KotlinDebug\n*F\n+ 1 LongSparseArray.kt\nandroidx/collection/LongSparseArrayKt\n*L\n243#1:607,6\n248#1:613,6\n360#1:619,18\n410#1:637,18\n425#1:655,18\n437#1:673,18\n451#1:691,18\n459#1:709,18\n467#1:727,18\n505#1:745,18\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class LongSparseArrayKt {

    @org.jetbrains.annotations.NotNull
    private static final java.lang.Object DELETED = null;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.collection.LongSparseArrayKt.DELETED = r0
            return
    }

    public static final /* synthetic */ java.lang.Object access$getDELETED$p() {
            java.lang.Object r0 = androidx.collection.LongSparseArrayKt.DELETED
            return r0
    }

    public static final <E> void commonAppend(@org.jetbrains.annotations.NotNull androidx.collection.LongSparseArray<E> r9, long r10, E r12) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r9, r0)
            int r0 = r9.size
            if (r0 == 0) goto L17
            long[] r1 = r9.keys
            int r2 = r0 + (-1)
            r2 = r1[r2]
            int r1 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r1 > 0) goto L17
            r9.put(r10, r12)
            return
        L17:
            boolean r1 = r9.garbage
            if (r1 == 0) goto L43
            long[] r1 = r9.keys
            int r2 = r1.length
            if (r0 < r2) goto L43
            java.lang.Object[] r2 = r9.values
            r3 = 0
            r4 = 0
            r5 = 0
        L25:
            if (r4 >= r0) goto L3f
            r6 = r2[r4]
            java.lang.Object r7 = access$getDELETED$p()
            if (r6 == r7) goto L3c
            if (r4 == r5) goto L3a
            r7 = r1[r4]
            r1[r5] = r7
            r2[r5] = r6
            r6 = 0
            r2[r4] = r6
        L3a:
            int r5 = r5 + 1
        L3c:
            int r4 = r4 + 1
            goto L25
        L3f:
            r9.garbage = r3
            r9.size = r5
        L43:
            int r0 = r9.size
            long[] r1 = r9.keys
            int r1 = r1.length
            if (r0 < r1) goto L68
            int r1 = r0 + 1
            int r1 = androidx.collection.internal.ContainerHelpersKt.idealLongArraySize(r1)
            long[] r2 = r9.keys
            long[] r2 = java.util.Arrays.copyOf(r2, r1)
            java.lang.String r3 = "copyOf(this, newSize)"
            kotlin.jvm.internal.g0.o(r2, r3)
            r9.keys = r2
            java.lang.Object[] r2 = r9.values
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r2, r1)
            kotlin.jvm.internal.g0.o(r1, r3)
            r9.values = r1
        L68:
            long[] r1 = r9.keys
            r1[r0] = r10
            java.lang.Object[] r10 = r9.values
            r10[r0] = r12
            int r0 = r0 + 1
            r9.size = r0
            return
    }

    public static final <E> void commonClear(@org.jetbrains.annotations.NotNull androidx.collection.LongSparseArray<E> r5) {
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

    public static final <E> boolean commonContainsKey(@org.jetbrains.annotations.NotNull androidx.collection.LongSparseArray<E> r1, long r2) {
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

    public static final <E> boolean commonContainsValue(@org.jetbrains.annotations.NotNull androidx.collection.LongSparseArray<E> r1, E r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r1 = r1.indexOfValue(r2)
            if (r1 < 0) goto Ld
            r1 = 1
            return r1
        Ld:
            r1 = 0
            return r1
    }

    public static final <E> void commonGc(@org.jetbrains.annotations.NotNull androidx.collection.LongSparseArray<E> r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r9, r0)
            int r0 = r9.size
            long[] r1 = r9.keys
            java.lang.Object[] r2 = r9.values
            r3 = 0
            r4 = 0
            r5 = 0
        Le:
            if (r4 >= r0) goto L28
            r6 = r2[r4]
            java.lang.Object r7 = access$getDELETED$p()
            if (r6 == r7) goto L25
            if (r4 == r5) goto L23
            r7 = r1[r4]
            r1[r5] = r7
            r2[r5] = r6
            r6 = 0
            r2[r4] = r6
        L23:
            int r5 = r5 + 1
        L25:
            int r4 = r4 + 1
            goto Le
        L28:
            r9.garbage = r3
            r9.size = r5
            return
    }

    @org.jetbrains.annotations.Nullable
    public static final <E> E commonGet(@org.jetbrains.annotations.NotNull androidx.collection.LongSparseArray<E> r2, long r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            long[] r0 = r2.keys
            int r1 = r2.size
            int r3 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r0, r1, r3)
            if (r3 < 0) goto L1f
            java.lang.Object[] r4 = r2.values
            r4 = r4[r3]
            java.lang.Object r0 = access$getDELETED$p()
            if (r4 != r0) goto L1a
            goto L1f
        L1a:
            java.lang.Object[] r2 = r2.values
            r2 = r2[r3]
            return r2
        L1f:
            r2 = 0
            return r2
    }

    public static final <E> E commonGet(@org.jetbrains.annotations.NotNull androidx.collection.LongSparseArray<E> r2, long r3, E r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            long[] r0 = r2.keys
            int r1 = r2.size
            int r3 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r0, r1, r3)
            if (r3 < 0) goto L1f
            java.lang.Object[] r4 = r2.values
            r4 = r4[r3]
            java.lang.Object r0 = access$getDELETED$p()
            if (r4 != r0) goto L1a
            goto L1f
        L1a:
            java.lang.Object[] r2 = r2.values
            r2 = r2[r3]
            return r2
        L1f:
            return r5
    }

    public static final <T extends E, E> T commonGetInternal(@org.jetbrains.annotations.NotNull androidx.collection.LongSparseArray<E> r2, long r3, T r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            long[] r0 = r2.keys
            int r1 = r2.size
            int r3 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r0, r1, r3)
            if (r3 < 0) goto L1f
            java.lang.Object[] r4 = r2.values
            r4 = r4[r3]
            java.lang.Object r0 = access$getDELETED$p()
            if (r4 != r0) goto L1a
            goto L1f
        L1a:
            java.lang.Object[] r2 = r2.values
            r2 = r2[r3]
            return r2
        L1f:
            return r5
    }

    public static final <E> int commonIndexOfKey(@org.jetbrains.annotations.NotNull androidx.collection.LongSparseArray<E> r9, long r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r9, r0)
            boolean r0 = r9.garbage
            if (r0 == 0) goto L30
            int r0 = r9.size
            long[] r1 = r9.keys
            java.lang.Object[] r2 = r9.values
            r3 = 0
            r4 = 0
            r5 = 0
        L12:
            if (r4 >= r0) goto L2c
            r6 = r2[r4]
            java.lang.Object r7 = access$getDELETED$p()
            if (r6 == r7) goto L29
            if (r4 == r5) goto L27
            r7 = r1[r4]
            r1[r5] = r7
            r2[r5] = r6
            r6 = 0
            r2[r4] = r6
        L27:
            int r5 = r5 + 1
        L29:
            int r4 = r4 + 1
            goto L12
        L2c:
            r9.garbage = r3
            r9.size = r5
        L30:
            long[] r0 = r9.keys
            int r9 = r9.size
            int r9 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r0, r9, r10)
            return r9
    }

    public static final <E> int commonIndexOfValue(@org.jetbrains.annotations.NotNull androidx.collection.LongSparseArray<E> r9, E r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r9, r0)
            boolean r0 = r9.garbage
            r1 = 0
            if (r0 == 0) goto L30
            int r0 = r9.size
            long[] r2 = r9.keys
            java.lang.Object[] r3 = r9.values
            r4 = 0
            r5 = 0
        L12:
            if (r4 >= r0) goto L2c
            r6 = r3[r4]
            java.lang.Object r7 = access$getDELETED$p()
            if (r6 == r7) goto L29
            if (r4 == r5) goto L27
            r7 = r2[r4]
            r2[r5] = r7
            r3[r5] = r6
            r6 = 0
            r3[r4] = r6
        L27:
            int r5 = r5 + 1
        L29:
            int r4 = r4 + 1
            goto L12
        L2c:
            r9.garbage = r1
            r9.size = r5
        L30:
            int r0 = r9.size
        L32:
            if (r1 >= r0) goto L3e
            java.lang.Object[] r2 = r9.values
            r2 = r2[r1]
            if (r2 != r10) goto L3b
            return r1
        L3b:
            int r1 = r1 + 1
            goto L32
        L3e:
            r9 = -1
            return r9
    }

    public static final <E> boolean commonIsEmpty(@org.jetbrains.annotations.NotNull androidx.collection.LongSparseArray<E> r1) {
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

    public static final <E> long commonKeyAt(@org.jetbrains.annotations.NotNull androidx.collection.LongSparseArray<E> r9, int r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r9, r0)
            if (r10 < 0) goto L39
            int r0 = r9.size
            if (r10 >= r0) goto L39
            boolean r1 = r9.garbage
            if (r1 == 0) goto L34
            long[] r1 = r9.keys
            java.lang.Object[] r2 = r9.values
            r3 = 0
            r4 = 0
            r5 = 0
        L16:
            if (r4 >= r0) goto L30
            r6 = r2[r4]
            java.lang.Object r7 = access$getDELETED$p()
            if (r6 == r7) goto L2d
            if (r4 == r5) goto L2b
            r7 = r1[r4]
            r1[r5] = r7
            r2[r5] = r6
            r6 = 0
            r2[r4] = r6
        L2b:
            int r5 = r5 + 1
        L2d:
            int r4 = r4 + 1
            goto L16
        L30:
            r9.garbage = r3
            r9.size = r5
        L34:
            long[] r9 = r9.keys
            r0 = r9[r10]
            return r0
        L39:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Expected index to be within 0..size()-1, but was "
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
    }

    public static final <E> void commonPut(@org.jetbrains.annotations.NotNull androidx.collection.LongSparseArray<E> r9, long r10, E r12) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r9, r0)
            long[] r0 = r9.keys
            int r1 = r9.size
            int r0 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r0, r1, r10)
            if (r0 < 0) goto L14
            java.lang.Object[] r9 = r9.values
            r9[r0] = r12
            return
        L14:
            int r0 = ~r0
            int r1 = r9.size
            if (r0 >= r1) goto L2c
            java.lang.Object[] r1 = r9.values
            r1 = r1[r0]
            java.lang.Object r2 = access$getDELETED$p()
            if (r1 != r2) goto L2c
            long[] r1 = r9.keys
            r1[r0] = r10
            java.lang.Object[] r9 = r9.values
            r9[r0] = r12
            return
        L2c:
            boolean r1 = r9.garbage
            if (r1 == 0) goto L61
            int r1 = r9.size
            long[] r2 = r9.keys
            int r3 = r2.length
            if (r1 < r3) goto L61
            java.lang.Object[] r0 = r9.values
            r3 = 0
            r4 = 0
            r5 = 0
        L3c:
            if (r4 >= r1) goto L56
            r6 = r0[r4]
            java.lang.Object r7 = access$getDELETED$p()
            if (r6 == r7) goto L53
            if (r4 == r5) goto L51
            r7 = r2[r4]
            r2[r5] = r7
            r0[r5] = r6
            r6 = 0
            r0[r4] = r6
        L51:
            int r5 = r5 + 1
        L53:
            int r4 = r4 + 1
            goto L3c
        L56:
            r9.garbage = r3
            r9.size = r5
            long[] r0 = r9.keys
            int r0 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r0, r5, r10)
            int r0 = ~r0
        L61:
            int r1 = r9.size
            long[] r2 = r9.keys
            int r2 = r2.length
            if (r1 < r2) goto L86
            int r1 = r1 + 1
            int r1 = androidx.collection.internal.ContainerHelpersKt.idealLongArraySize(r1)
            long[] r2 = r9.keys
            long[] r2 = java.util.Arrays.copyOf(r2, r1)
            java.lang.String r3 = "copyOf(this, newSize)"
            kotlin.jvm.internal.g0.o(r2, r3)
            r9.keys = r2
            java.lang.Object[] r2 = r9.values
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r2, r1)
            kotlin.jvm.internal.g0.o(r1, r3)
            r9.values = r1
        L86:
            int r1 = r9.size
            int r2 = r1 - r0
            if (r2 == 0) goto L9a
            long[] r2 = r9.keys
            int r3 = r0 + 1
            kotlin.collections.n.A0(r2, r2, r3, r0, r1)
            java.lang.Object[] r1 = r9.values
            int r2 = r9.size
            kotlin.collections.n.B0(r1, r1, r3, r0, r2)
        L9a:
            long[] r1 = r9.keys
            r1[r0] = r10
            java.lang.Object[] r10 = r9.values
            r10[r0] = r12
            int r10 = r9.size
            int r10 = r10 + 1
            r9.size = r10
            return
    }

    public static final <E> void commonPutAll(@org.jetbrains.annotations.NotNull androidx.collection.LongSparseArray<E> r5, @org.jetbrains.annotations.NotNull androidx.collection.LongSparseArray<? extends E> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r6, r0)
            int r0 = r6.size()
            r1 = 0
        Lf:
            if (r1 >= r0) goto L1f
            long r2 = r6.keyAt(r1)
            java.lang.Object r4 = r6.valueAt(r1)
            r5.put(r2, r4)
            int r1 = r1 + 1
            goto Lf
        L1f:
            return
    }

    @org.jetbrains.annotations.Nullable
    public static final <E> E commonPutIfAbsent(@org.jetbrains.annotations.NotNull androidx.collection.LongSparseArray<E> r1, long r2, E r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Object r0 = r1.get(r2)
            if (r0 != 0) goto Le
            r1.put(r2, r4)
        Le:
            return r0
    }

    public static final <E> void commonRemove(@org.jetbrains.annotations.NotNull androidx.collection.LongSparseArray<E> r2, long r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            long[] r0 = r2.keys
            int r1 = r2.size
            int r3 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r0, r1, r3)
            if (r3 < 0) goto L24
            java.lang.Object[] r4 = r2.values
            r4 = r4[r3]
            java.lang.Object r0 = access$getDELETED$p()
            if (r4 == r0) goto L24
            java.lang.Object[] r4 = r2.values
            java.lang.Object r0 = access$getDELETED$p()
            r4[r3] = r0
            r3 = 1
            r2.garbage = r3
        L24:
            return
    }

    public static final <E> boolean commonRemove(@org.jetbrains.annotations.NotNull androidx.collection.LongSparseArray<E> r1, long r2, E r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r2 = r1.indexOfKey(r2)
            if (r2 < 0) goto L1a
            java.lang.Object r3 = r1.valueAt(r2)
            boolean r3 = kotlin.jvm.internal.g0.g(r4, r3)
            if (r3 == 0) goto L1a
            r1.removeAt(r2)
            r1 = 1
            return r1
        L1a:
            r1 = 0
            return r1
    }

    public static final <E> void commonRemoveAt(@org.jetbrains.annotations.NotNull androidx.collection.LongSparseArray<E> r2, int r3) {
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

    @org.jetbrains.annotations.Nullable
    public static final <E> E commonReplace(@org.jetbrains.annotations.NotNull androidx.collection.LongSparseArray<E> r1, long r2, E r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r2 = r1.indexOfKey(r2)
            if (r2 < 0) goto L12
            java.lang.Object[] r1 = r1.values
            r3 = r1[r2]
            r1[r2] = r4
            return r3
        L12:
            r1 = 0
            return r1
    }

    public static final <E> boolean commonReplace(@org.jetbrains.annotations.NotNull androidx.collection.LongSparseArray<E> r1, long r2, E r4, E r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r2 = r1.indexOfKey(r2)
            if (r2 < 0) goto L1b
            java.lang.Object[] r3 = r1.values
            r3 = r3[r2]
            boolean r3 = kotlin.jvm.internal.g0.g(r3, r4)
            if (r3 == 0) goto L1b
            java.lang.Object[] r1 = r1.values
            r1[r2] = r5
            r1 = 1
            return r1
        L1b:
            r1 = 0
            return r1
    }

    public static final <E> void commonSetValueAt(@org.jetbrains.annotations.NotNull androidx.collection.LongSparseArray<E> r9, int r10, E r11) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r9, r0)
            if (r10 < 0) goto L39
            int r0 = r9.size
            if (r10 >= r0) goto L39
            boolean r1 = r9.garbage
            if (r1 == 0) goto L34
            long[] r1 = r9.keys
            java.lang.Object[] r2 = r9.values
            r3 = 0
            r4 = 0
            r5 = 0
        L16:
            if (r4 >= r0) goto L30
            r6 = r2[r4]
            java.lang.Object r7 = access$getDELETED$p()
            if (r6 == r7) goto L2d
            if (r4 == r5) goto L2b
            r7 = r1[r4]
            r1[r5] = r7
            r2[r5] = r6
            r6 = 0
            r2[r4] = r6
        L2b:
            int r5 = r5 + 1
        L2d:
            int r4 = r4 + 1
            goto L16
        L30:
            r9.garbage = r3
            r9.size = r5
        L34:
            java.lang.Object[] r9 = r9.values
            r9[r10] = r11
            return
        L39:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "Expected index to be within 0..size()-1, but was "
            r9.append(r11)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
    }

    public static final <E> int commonSize(@org.jetbrains.annotations.NotNull androidx.collection.LongSparseArray<E> r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r9, r0)
            boolean r0 = r9.garbage
            if (r0 == 0) goto L30
            int r0 = r9.size
            long[] r1 = r9.keys
            java.lang.Object[] r2 = r9.values
            r3 = 0
            r4 = 0
            r5 = 0
        L12:
            if (r4 >= r0) goto L2c
            r6 = r2[r4]
            java.lang.Object r7 = access$getDELETED$p()
            if (r6 == r7) goto L29
            if (r4 == r5) goto L27
            r7 = r1[r4]
            r1[r5] = r7
            r2[r5] = r6
            r6 = 0
            r2[r4] = r6
        L27:
            int r5 = r5 + 1
        L29:
            int r4 = r4 + 1
            goto L12
        L2c:
            r9.garbage = r3
            r9.size = r5
        L30:
            int r9 = r9.size
            return r9
    }

    @org.jetbrains.annotations.NotNull
    public static final <E> java.lang.String commonToString(@org.jetbrains.annotations.NotNull androidx.collection.LongSparseArray<E> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            int r0 = r5.size()
            if (r0 > 0) goto Lf
            java.lang.String r5 = "{}"
            return r5
        Lf:
            int r0 = r5.size
            int r0 = r0 * 28
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r0 = 123(0x7b, float:1.72E-43)
            r1.append(r0)
            int r0 = r5.size
            r2 = 0
        L20:
            if (r2 >= r0) goto L47
            if (r2 <= 0) goto L29
            java.lang.String r3 = ", "
            r1.append(r3)
        L29:
            long r3 = r5.keyAt(r2)
            r1.append(r3)
            r3 = 61
            r1.append(r3)
            java.lang.Object r3 = r5.valueAt(r2)
            if (r3 == r1) goto L3f
            r1.append(r3)
            goto L44
        L3f:
            java.lang.String r3 = "(this Map)"
            r1.append(r3)
        L44:
            int r2 = r2 + 1
            goto L20
        L47:
            r5 = 125(0x7d, float:1.75E-43)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r0 = "StringBuilder(capacity).…builderAction).toString()"
            kotlin.jvm.internal.g0.o(r5, r0)
            return r5
    }

    public static final <E> E commonValueAt(@org.jetbrains.annotations.NotNull androidx.collection.LongSparseArray<E> r9, int r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r9, r0)
            if (r10 < 0) goto L39
            int r0 = r9.size
            if (r10 >= r0) goto L39
            boolean r1 = r9.garbage
            if (r1 == 0) goto L34
            long[] r1 = r9.keys
            java.lang.Object[] r2 = r9.values
            r3 = 0
            r4 = 0
            r5 = 0
        L16:
            if (r4 >= r0) goto L30
            r6 = r2[r4]
            java.lang.Object r7 = access$getDELETED$p()
            if (r6 == r7) goto L2d
            if (r4 == r5) goto L2b
            r7 = r1[r4]
            r1[r5] = r7
            r2[r5] = r6
            r6 = 0
            r2[r4] = r6
        L2b:
            int r5 = r5 + 1
        L2d:
            int r4 = r4 + 1
            goto L16
        L30:
            r9.garbage = r3
            r9.size = r5
        L34:
            java.lang.Object[] r9 = r9.values
            r9 = r9[r10]
            return r9
        L39:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Expected index to be within 0..size()-1, but was "
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
    }

    public static final <T> boolean contains(@org.jetbrains.annotations.NotNull androidx.collection.LongSparseArray<T> r1, long r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r1 = r1.containsKey(r2)
            return r1
    }

    public static final <T> void forEach(@org.jetbrains.annotations.NotNull androidx.collection.LongSparseArray<T> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Long, ? super T, kotlin.n1> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.g0.p(r5, r0)
            int r0 = r4.size()
            r1 = 0
        Lf:
            if (r1 >= r0) goto L23
            long r2 = r4.keyAt(r1)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object r3 = r4.valueAt(r1)
            r5.invoke(r2, r3)
            int r1 = r1 + 1
            goto Lf
        L23:
            return
    }

    public static final <T> T getOrDefault(@org.jetbrains.annotations.NotNull androidx.collection.LongSparseArray<T> r1, long r2, T r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Object r1 = r1.get(r2, r4)
            return r1
    }

    public static final <T> T getOrElse(@org.jetbrains.annotations.NotNull androidx.collection.LongSparseArray<T> r1, long r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "defaultValue"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.Object r1 = r1.get(r2)
            if (r1 != 0) goto L14
            java.lang.Object r1 = r4.invoke()
        L14:
            return r1
    }

    public static final <T> int getSize(@org.jetbrains.annotations.NotNull androidx.collection.LongSparseArray<T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r1 = r1.size()
            return r1
    }

    public static /* synthetic */ void getSize$annotations(androidx.collection.LongSparseArray r0) {
            return
    }

    public static final <T> boolean isNotEmpty(@org.jetbrains.annotations.NotNull androidx.collection.LongSparseArray<T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlin.collections.e1 keyIterator(@org.jetbrains.annotations.NotNull androidx.collection.LongSparseArray<T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            androidx.collection.LongSparseArrayKt$keyIterator$1 r0 = new androidx.collection.LongSparseArrayKt$keyIterator$1
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> androidx.collection.LongSparseArray<T> plus(@org.jetbrains.annotations.NotNull androidx.collection.LongSparseArray<T> r3, @org.jetbrains.annotations.NotNull androidx.collection.LongSparseArray<T> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r4, r0)
            androidx.collection.LongSparseArray r0 = new androidx.collection.LongSparseArray
            int r1 = r3.size()
            int r2 = r4.size()
            int r1 = r1 + r2
            r0.<init>(r1)
            r0.putAll(r3)
            r0.putAll(r4)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Replaced with member function. Remove extension import!")
    public static final /* synthetic */ boolean remove(androidx.collection.LongSparseArray r1, long r2, java.lang.Object r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r1 = r1.remove(r2, r4)
            return r1
    }

    public static final <T> void set(@org.jetbrains.annotations.NotNull androidx.collection.LongSparseArray<T> r1, long r2, T r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r1.put(r2, r4)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.Iterator<T> valueIterator(@org.jetbrains.annotations.NotNull androidx.collection.LongSparseArray<T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            androidx.collection.LongSparseArrayKt$valueIterator$1 r0 = new androidx.collection.LongSparseArrayKt$valueIterator$1
            r0.<init>(r1)
            return r0
    }
}
