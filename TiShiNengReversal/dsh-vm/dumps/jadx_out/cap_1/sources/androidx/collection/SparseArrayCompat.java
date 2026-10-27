package androidx.collection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSparseArrayCompat.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseArrayCompat.jvm.kt\nandroidx/collection/SparseArrayCompat\n+ 2 SparseArrayCompat.kt\nandroidx/collection/SparseArrayCompatKt\n*L\n1#1,273:1\n275#2,9:274\n288#2,5:283\n296#2,5:288\n304#2,8:293\n320#2,9:301\n353#2,40:310\n396#2,2:350\n353#2,47:352\n403#2,3:399\n353#2,40:402\n407#2:442\n412#2,4:443\n419#2:447\n423#2,4:448\n431#2,8:452\n443#2,5:460\n451#2,4:465\n459#2,9:469\n472#2:478\n477#2:479\n459#2,9:480\n482#2,8:489\n493#2,17:497\n513#2,21:514\n*S KotlinDebug\n*F\n+ 1 SparseArrayCompat.jvm.kt\nandroidx/collection/SparseArrayCompat\n*L\n130#1:274,9\n135#1:283,5\n144#1:288,5\n152#1:293,8\n163#1:301,9\n169#1:310,40\n176#1:350,2\n176#1:352,47\n186#1:399,3\n186#1:402,40\n186#1:442\n191#1:443,4\n205#1:447\n212#1:448,4\n218#1:452,8\n224#1:460,5\n234#1:465,4\n246#1:469,9\n249#1:478\n252#1:479\n252#1:480,9\n257#1:489,8\n263#1:497,17\n271#1:514,21\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class SparseArrayCompat<E> implements java.lang.Cloneable {

    @kotlin.jvm.JvmField
    public /* synthetic */ boolean garbage;

    @kotlin.jvm.JvmField
    public /* synthetic */ int[] keys;

    @kotlin.jvm.JvmField
    public /* synthetic */ int size;

    @kotlin.jvm.JvmField
    public /* synthetic */ java.lang.Object[] values;

    @kotlin.jvm.JvmOverloads
    public SparseArrayCompat() {
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            r3.<init>(r2, r0, r1)
            return
    }

    @kotlin.jvm.JvmOverloads
    public SparseArrayCompat(int r2) {
            r1 = this;
            r1.<init>()
            if (r2 != 0) goto Le
            int[] r2 = androidx.collection.internal.ContainerHelpersKt.EMPTY_INTS
            r1.keys = r2
            java.lang.Object[] r2 = androidx.collection.internal.ContainerHelpersKt.EMPTY_OBJECTS
            r1.values = r2
            return
        Le:
            int r2 = androidx.collection.internal.ContainerHelpersKt.idealIntArraySize(r2)
            int[] r0 = new int[r2]
            r1.keys = r0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r1.values = r2
            return
    }

    public /* synthetic */ SparseArrayCompat(int r1, int r2, kotlin.jvm.internal.v r3) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L6
            r1 = 10
        L6:
            r0.<init>(r1)
            return
    }

    public void append(int r5, E r6) {
            r4 = this;
            int r0 = r4.size
            if (r0 == 0) goto L10
            int[] r1 = r4.keys
            int r2 = r0 + (-1)
            r1 = r1[r2]
            if (r5 > r1) goto L10
            r4.put(r5, r6)
            return
        L10:
            boolean r1 = r4.garbage
            if (r1 == 0) goto L1c
            int[] r1 = r4.keys
            int r1 = r1.length
            if (r0 < r1) goto L1c
            androidx.collection.SparseArrayCompatKt.access$gc(r4)
        L1c:
            int r0 = r4.size
            int[] r1 = r4.keys
            int r1 = r1.length
            if (r0 < r1) goto L41
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
        L41:
            int[] r1 = r4.keys
            r1[r0] = r5
            java.lang.Object[] r5 = r4.values
            r5[r0] = r6
            int r0 = r0 + 1
            r4.size = r0
            return
    }

    public void clear() {
            r5 = this;
            int r0 = r5.size
            java.lang.Object[] r1 = r5.values
            r2 = 0
            r3 = 0
        L6:
            if (r3 >= r0) goto Le
            r4 = 0
            r1[r3] = r4
            int r3 = r3 + 1
            goto L6
        Le:
            r5.size = r2
            r5.garbage = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    public androidx.collection.SparseArrayCompat<E> clone() {
            r2 = this;
            java.lang.Object r0 = super.clone()
            java.lang.String r1 = "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>"
            kotlin.jvm.internal.g0.n(r0, r1)
            androidx.collection.SparseArrayCompat r0 = (androidx.collection.SparseArrayCompat) r0
            int[] r1 = r2.keys
            java.lang.Object r1 = r1.clone()
            int[] r1 = (int[]) r1
            r0.keys = r1
            java.lang.Object[] r1 = r2.values
            java.lang.Object r1 = r1.clone()
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r0.values = r1
            return r0
    }

    /* renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object m44clone() {
            r1 = this;
            androidx.collection.SparseArrayCompat r0 = r1.clone()
            return r0
    }

    public boolean containsKey(int r1) {
            r0 = this;
            int r1 = r0.indexOfKey(r1)
            if (r1 < 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    public boolean containsValue(E r5) {
            r4 = this;
            boolean r0 = r4.garbage
            if (r0 == 0) goto L7
            androidx.collection.SparseArrayCompatKt.access$gc(r4)
        L7:
            int r0 = r4.size
            r1 = 0
            r2 = 0
        Lb:
            if (r2 >= r0) goto L17
            java.lang.Object[] r3 = r4.values
            r3 = r3[r2]
            if (r3 != r5) goto L14
            goto L18
        L14:
            int r2 = r2 + 1
            goto Lb
        L17:
            r2 = -1
        L18:
            if (r2 < 0) goto L1c
            r5 = 1
            return r5
        L1c:
            return r1
    }

    @kotlin.Deprecated(message = "Alias for remove(int).", replaceWith = @kotlin.ReplaceWith(expression = "remove(key)", imports = {}))
    public void delete(int r1) {
            r0 = this;
            r0.remove(r1)
            return
    }

    @org.jetbrains.annotations.Nullable
    public E get(int r1) {
            r0 = this;
            java.lang.Object r1 = androidx.collection.SparseArrayCompatKt.commonGet(r0, r1)
            return r1
    }

    public E get(int r1, E r2) {
            r0 = this;
            java.lang.Object r1 = androidx.collection.SparseArrayCompatKt.commonGet(r0, r1, r2)
            return r1
    }

    @kotlin.jvm.JvmName(name = "getIsEmpty")
    public final boolean getIsEmpty() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            return r0
    }

    public int indexOfKey(int r3) {
            r2 = this;
            boolean r0 = r2.garbage
            if (r0 == 0) goto L7
            androidx.collection.SparseArrayCompatKt.access$gc(r2)
        L7:
            int[] r0 = r2.keys
            int r1 = r2.size
            int r3 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r0, r1, r3)
            return r3
    }

    public int indexOfValue(E r4) {
            r3 = this;
            boolean r0 = r3.garbage
            if (r0 == 0) goto L7
            androidx.collection.SparseArrayCompatKt.access$gc(r3)
        L7:
            int r0 = r3.size
            r1 = 0
        La:
            if (r1 >= r0) goto L16
            java.lang.Object[] r2 = r3.values
            r2 = r2[r1]
            if (r2 != r4) goto L13
            return r1
        L13:
            int r1 = r1 + 1
            goto La
        L16:
            r4 = -1
            return r4
    }

    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.size()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public int keyAt(int r2) {
            r1 = this;
            boolean r0 = r1.garbage
            if (r0 == 0) goto L7
            androidx.collection.SparseArrayCompatKt.access$gc(r1)
        L7:
            int[] r0 = r1.keys
            r2 = r0[r2]
            return r2
    }

    public void put(int r5, E r6) {
            r4 = this;
            int[] r0 = r4.keys
            int r1 = r4.size
            int r0 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r0, r1, r5)
            if (r0 < 0) goto Lf
            java.lang.Object[] r5 = r4.values
            r5[r0] = r6
            return
        Lf:
            int r0 = ~r0
            int r1 = r4.size
            if (r0 >= r1) goto L27
            java.lang.Object[] r1 = r4.values
            r1 = r1[r0]
            java.lang.Object r2 = androidx.collection.SparseArrayCompatKt.access$getDELETED$p()
            if (r1 != r2) goto L27
            int[] r1 = r4.keys
            r1[r0] = r5
            java.lang.Object[] r5 = r4.values
            r5[r0] = r6
            return
        L27:
            boolean r1 = r4.garbage
            if (r1 == 0) goto L3e
            int r1 = r4.size
            int[] r2 = r4.keys
            int r2 = r2.length
            if (r1 < r2) goto L3e
            androidx.collection.SparseArrayCompatKt.access$gc(r4)
            int[] r0 = r4.keys
            int r1 = r4.size
            int r0 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r0, r1, r5)
            int r0 = ~r0
        L3e:
            int r1 = r4.size
            int[] r2 = r4.keys
            int r2 = r2.length
            if (r1 < r2) goto L63
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
        L63:
            int r1 = r4.size
            int r2 = r1 - r0
            if (r2 == 0) goto L77
            int[] r2 = r4.keys
            int r3 = r0 + 1
            kotlin.collections.n.z0(r2, r2, r3, r0, r1)
            java.lang.Object[] r1 = r4.values
            int r2 = r4.size
            kotlin.collections.n.B0(r1, r1, r3, r0, r2)
        L77:
            int[] r1 = r4.keys
            r1[r0] = r5
            java.lang.Object[] r5 = r4.values
            r5[r0] = r6
            int r5 = r4.size
            int r5 = r5 + 1
            r4.size = r5
            return
    }

    public void putAll(@org.jetbrains.annotations.NotNull androidx.collection.SparseArrayCompat<? extends E> r9) {
            r8 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r9, r0)
            int r0 = r9.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L9e
            int r2 = r9.keyAt(r1)
            java.lang.Object r3 = r9.valueAt(r1)
            int[] r4 = r8.keys
            int r5 = r8.size
            int r4 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r4, r5, r2)
            if (r4 < 0) goto L24
            java.lang.Object[] r2 = r8.values
            r2[r4] = r3
            goto L9a
        L24:
            int r4 = ~r4
            int r5 = r8.size
            if (r4 >= r5) goto L3c
            java.lang.Object[] r5 = r8.values
            r5 = r5[r4]
            java.lang.Object r6 = androidx.collection.SparseArrayCompatKt.access$getDELETED$p()
            if (r5 != r6) goto L3c
            int[] r5 = r8.keys
            r5[r4] = r2
            java.lang.Object[] r2 = r8.values
            r2[r4] = r3
            goto L9a
        L3c:
            boolean r5 = r8.garbage
            if (r5 == 0) goto L53
            int r5 = r8.size
            int[] r6 = r8.keys
            int r6 = r6.length
            if (r5 < r6) goto L53
            androidx.collection.SparseArrayCompatKt.access$gc(r8)
            int[] r4 = r8.keys
            int r5 = r8.size
            int r4 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r4, r5, r2)
            int r4 = ~r4
        L53:
            int r5 = r8.size
            int[] r6 = r8.keys
            int r6 = r6.length
            if (r5 < r6) goto L78
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
        L78:
            int r5 = r8.size
            int r6 = r5 - r4
            if (r6 == 0) goto L8c
            int[] r6 = r8.keys
            int r7 = r4 + 1
            kotlin.collections.n.z0(r6, r6, r7, r4, r5)
            java.lang.Object[] r5 = r8.values
            int r6 = r8.size
            kotlin.collections.n.B0(r5, r5, r7, r4, r6)
        L8c:
            int[] r5 = r8.keys
            r5[r4] = r2
            java.lang.Object[] r2 = r8.values
            r2[r4] = r3
            int r2 = r8.size
            int r2 = r2 + 1
            r8.size = r2
        L9a:
            int r1 = r1 + 1
            goto La
        L9e:
            return
    }

    @org.jetbrains.annotations.Nullable
    public E putIfAbsent(int r6, E r7) {
            r5 = this;
            java.lang.Object r0 = androidx.collection.SparseArrayCompatKt.commonGet(r5, r6)
            if (r0 != 0) goto L8b
            int[] r1 = r5.keys
            int r2 = r5.size
            int r1 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r1, r2, r6)
            if (r1 < 0) goto L15
            java.lang.Object[] r6 = r5.values
            r6[r1] = r7
            return r0
        L15:
            int r1 = ~r1
            int r2 = r5.size
            if (r1 >= r2) goto L2d
            java.lang.Object[] r2 = r5.values
            r2 = r2[r1]
            java.lang.Object r3 = androidx.collection.SparseArrayCompatKt.access$getDELETED$p()
            if (r2 != r3) goto L2d
            int[] r2 = r5.keys
            r2[r1] = r6
            java.lang.Object[] r6 = r5.values
            r6[r1] = r7
            return r0
        L2d:
            boolean r2 = r5.garbage
            if (r2 == 0) goto L44
            int r2 = r5.size
            int[] r3 = r5.keys
            int r3 = r3.length
            if (r2 < r3) goto L44
            androidx.collection.SparseArrayCompatKt.access$gc(r5)
            int[] r1 = r5.keys
            int r2 = r5.size
            int r1 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r1, r2, r6)
            int r1 = ~r1
        L44:
            int r2 = r5.size
            int[] r3 = r5.keys
            int r3 = r3.length
            if (r2 < r3) goto L69
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
        L69:
            int r2 = r5.size
            int r3 = r2 - r1
            if (r3 == 0) goto L7d
            int[] r3 = r5.keys
            int r4 = r1 + 1
            kotlin.collections.n.z0(r3, r3, r4, r1, r2)
            java.lang.Object[] r2 = r5.values
            int r3 = r5.size
            kotlin.collections.n.B0(r2, r2, r4, r1, r3)
        L7d:
            int[] r2 = r5.keys
            r2[r1] = r6
            java.lang.Object[] r6 = r5.values
            r6[r1] = r7
            int r6 = r5.size
            int r6 = r6 + 1
            r5.size = r6
        L8b:
            return r0
    }

    public void remove(int r1) {
            r0 = this;
            androidx.collection.SparseArrayCompatKt.commonRemove(r0, r1)
            return
    }

    public boolean remove(int r2, @org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r1 = this;
            int r2 = r1.indexOfKey(r2)
            if (r2 < 0) goto L15
            java.lang.Object r0 = r1.valueAt(r2)
            boolean r3 = kotlin.jvm.internal.g0.g(r3, r0)
            if (r3 == 0) goto L15
            r1.removeAt(r2)
            r2 = 1
            return r2
        L15:
            r2 = 0
            return r2
    }

    public void removeAt(int r3) {
            r2 = this;
            java.lang.Object[] r0 = r2.values
            r0 = r0[r3]
            java.lang.Object r1 = androidx.collection.SparseArrayCompatKt.access$getDELETED$p()
            if (r0 == r1) goto L15
            java.lang.Object[] r0 = r2.values
            java.lang.Object r1 = androidx.collection.SparseArrayCompatKt.access$getDELETED$p()
            r0[r3] = r1
            r3 = 1
            r2.garbage = r3
        L15:
            return
    }

    public void removeAtRange(int r2, int r3) {
            r1 = this;
            int r0 = r2 + r3
            int r3 = java.lang.Math.min(r3, r0)
        L6:
            if (r2 >= r3) goto Le
            r1.removeAt(r2)
            int r2 = r2 + 1
            goto L6
        Le:
            return
    }

    @org.jetbrains.annotations.Nullable
    public E replace(int r3, E r4) {
            r2 = this;
            int r3 = r2.indexOfKey(r3)
            if (r3 < 0) goto Ld
            java.lang.Object[] r0 = r2.values
            r1 = r0[r3]
            r0[r3] = r4
            return r1
        Ld:
            r3 = 0
            return r3
    }

    public boolean replace(int r2, E r3, E r4) {
            r1 = this;
            int r2 = r1.indexOfKey(r2)
            if (r2 < 0) goto L16
            java.lang.Object[] r0 = r1.values
            r0 = r0[r2]
            boolean r3 = kotlin.jvm.internal.g0.g(r0, r3)
            if (r3 == 0) goto L16
            java.lang.Object[] r3 = r1.values
            r3[r2] = r4
            r2 = 1
            return r2
        L16:
            r2 = 0
            return r2
    }

    public void setValueAt(int r2, E r3) {
            r1 = this;
            boolean r0 = r1.garbage
            if (r0 == 0) goto L7
            androidx.collection.SparseArrayCompatKt.access$gc(r1)
        L7:
            java.lang.Object[] r0 = r1.values
            r0[r2] = r3
            return
    }

    public int size() {
            r1 = this;
            boolean r0 = r1.garbage
            if (r0 == 0) goto L7
            androidx.collection.SparseArrayCompatKt.access$gc(r1)
        L7:
            int r0 = r1.size
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r4 = this;
            int r0 = r4.size()
            if (r0 > 0) goto La
            java.lang.String r0 = "{}"
            return r0
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r4.size
            int r1 = r1 * 28
            r0.<init>(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            int r1 = r4.size
            r2 = 0
        L1b:
            if (r2 >= r1) goto L42
            if (r2 <= 0) goto L24
            java.lang.String r3 = ", "
            r0.append(r3)
        L24:
            int r3 = r4.keyAt(r2)
            r0.append(r3)
            r3 = 61
            r0.append(r3)
            java.lang.Object r3 = r4.valueAt(r2)
            if (r3 == r4) goto L3a
            r0.append(r3)
            goto L3f
        L3a:
            java.lang.String r3 = "(this Map)"
            r0.append(r3)
        L3f:
            int r2 = r2 + 1
            goto L1b
        L42:
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "buffer.toString()"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    public E valueAt(int r2) {
            r1 = this;
            boolean r0 = r1.garbage
            if (r0 == 0) goto L7
            androidx.collection.SparseArrayCompatKt.access$gc(r1)
        L7:
            java.lang.Object[] r0 = r1.values
            r2 = r0[r2]
            return r2
    }
}
