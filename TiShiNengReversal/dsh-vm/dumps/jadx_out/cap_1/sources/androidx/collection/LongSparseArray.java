package androidx.collection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nLongSparseArray.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSparseArray.jvm.kt\nandroidx/collection/LongSparseArray\n+ 2 LongSparseArray.kt\nandroidx/collection/LongSparseArrayKt\n*L\n1#1,255:1\n243#2:256\n256#2,6:257\n248#2,14:263\n267#2,8:277\n267#2,8:285\n278#2,9:293\n291#2,5:302\n299#2,8:307\n315#2,9:315\n349#2,12:324\n328#2,18:336\n363#2,26:354\n392#2,5:380\n400#2,5:385\n409#2,2:390\n328#2,18:392\n412#2:410\n416#2:411\n420#2,6:412\n328#2,18:418\n427#2:436\n432#2,6:437\n328#2,18:443\n441#2:461\n446#2,6:462\n328#2,18:468\n453#2,2:486\n458#2,2:488\n328#2,18:490\n461#2:508\n466#2,2:509\n328#2,18:511\n469#2,6:529\n479#2:535\n484#2:536\n489#2,8:537\n500#2,6:545\n328#2,18:551\n507#2,10:569\n520#2,21:579\n*S KotlinDebug\n*F\n+ 1 LongSparseArray.jvm.kt\nandroidx/collection/LongSparseArray\n*L\n93#1:256\n93#1:257,6\n100#1:263,14\n106#1:277,8\n111#1:285,8\n120#1:293,9\n125#1:302,5\n134#1:307,8\n145#1:315,9\n151#1:324,12\n151#1:336,18\n151#1:354,26\n157#1:380,5\n168#1:385,5\n173#1:390,2\n173#1:392,18\n173#1:410\n180#1:411\n192#1:412,6\n192#1:418,18\n192#1:436\n204#1:437,6\n204#1:443,18\n204#1:461\n212#1:462,6\n212#1:468,18\n212#1:486,2\n219#1:488,2\n219#1:490,18\n219#1:508\n228#1:509,2\n228#1:511,18\n228#1:529,6\n231#1:535\n234#1:536\n239#1:537,8\n245#1:545,6\n245#1:551,18\n245#1:569,10\n253#1:579,21\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class LongSparseArray<E> implements java.lang.Cloneable {

    @kotlin.jvm.JvmField
    public /* synthetic */ boolean garbage;

    @kotlin.jvm.JvmField
    public /* synthetic */ long[] keys;

    @kotlin.jvm.JvmField
    public /* synthetic */ int size;

    @kotlin.jvm.JvmField
    public /* synthetic */ java.lang.Object[] values;

    @kotlin.jvm.JvmOverloads
    public LongSparseArray() {
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            r3.<init>(r2, r0, r1)
            return
    }

    @kotlin.jvm.JvmOverloads
    public LongSparseArray(int r2) {
            r1 = this;
            r1.<init>()
            if (r2 != 0) goto Le
            long[] r2 = androidx.collection.internal.ContainerHelpersKt.EMPTY_LONGS
            r1.keys = r2
            java.lang.Object[] r2 = androidx.collection.internal.ContainerHelpersKt.EMPTY_OBJECTS
            r1.values = r2
            return
        Le:
            int r2 = androidx.collection.internal.ContainerHelpersKt.idealLongArraySize(r2)
            long[] r0 = new long[r2]
            r1.keys = r0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r1.values = r2
            return
    }

    public /* synthetic */ LongSparseArray(int r1, int r2, kotlin.jvm.internal.v r3) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L6
            r1 = 10
        L6:
            r0.<init>(r1)
            return
    }

    public void append(long r10, E r12) {
            r9 = this;
            int r0 = r9.size
            if (r0 == 0) goto L12
            long[] r1 = r9.keys
            int r2 = r0 + (-1)
            r2 = r1[r2]
            int r1 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r1 > 0) goto L12
            r9.put(r10, r12)
            return
        L12:
            boolean r1 = r9.garbage
            if (r1 == 0) goto L3e
            long[] r1 = r9.keys
            int r2 = r1.length
            if (r0 < r2) goto L3e
            java.lang.Object[] r2 = r9.values
            r3 = 0
            r4 = 0
            r5 = 0
        L20:
            if (r4 >= r0) goto L3a
            r6 = r2[r4]
            java.lang.Object r7 = androidx.collection.LongSparseArrayKt.access$getDELETED$p()
            if (r6 == r7) goto L37
            if (r4 == r5) goto L35
            r7 = r1[r4]
            r1[r5] = r7
            r2[r5] = r6
            r6 = 0
            r2[r4] = r6
        L35:
            int r5 = r5 + 1
        L37:
            int r4 = r4 + 1
            goto L20
        L3a:
            r9.garbage = r3
            r9.size = r5
        L3e:
            int r0 = r9.size
            long[] r1 = r9.keys
            int r1 = r1.length
            if (r0 < r1) goto L63
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
        L63:
            long[] r1 = r9.keys
            r1[r0] = r10
            java.lang.Object[] r10 = r9.values
            r10[r0] = r12
            int r0 = r0 + 1
            r9.size = r0
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
    public androidx.collection.LongSparseArray<E> clone() {
            r2 = this;
            java.lang.Object r0 = super.clone()
            java.lang.String r1 = "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>"
            kotlin.jvm.internal.g0.n(r0, r1)
            androidx.collection.LongSparseArray r0 = (androidx.collection.LongSparseArray) r0
            long[] r1 = r2.keys
            java.lang.Object r1 = r1.clone()
            long[] r1 = (long[]) r1
            r0.keys = r1
            java.lang.Object[] r1 = r2.values
            java.lang.Object r1 = r1.clone()
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r0.values = r1
            return r0
    }

    /* renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object m40clone() {
            r1 = this;
            androidx.collection.LongSparseArray r0 = r1.clone()
            return r0
    }

    public boolean containsKey(long r1) {
            r0 = this;
            int r1 = r0.indexOfKey(r1)
            if (r1 < 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    public boolean containsValue(E r1) {
            r0 = this;
            int r1 = r0.indexOfValue(r1)
            if (r1 < 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    @kotlin.Deprecated(message = "Alias for `remove(key)`.", replaceWith = @kotlin.ReplaceWith(expression = "remove(key)", imports = {}))
    public void delete(long r3) {
            r2 = this;
            long[] r0 = r2.keys
            int r1 = r2.size
            int r3 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r0, r1, r3)
            if (r3 < 0) goto L1f
            java.lang.Object[] r4 = r2.values
            r4 = r4[r3]
            java.lang.Object r0 = androidx.collection.LongSparseArrayKt.access$getDELETED$p()
            if (r4 == r0) goto L1f
            java.lang.Object[] r4 = r2.values
            java.lang.Object r0 = androidx.collection.LongSparseArrayKt.access$getDELETED$p()
            r4[r3] = r0
            r3 = 1
            r2.garbage = r3
        L1f:
            return
    }

    @org.jetbrains.annotations.Nullable
    public E get(long r3) {
            r2 = this;
            long[] r0 = r2.keys
            int r1 = r2.size
            int r3 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r0, r1, r3)
            if (r3 < 0) goto L1a
            java.lang.Object[] r4 = r2.values
            r4 = r4[r3]
            java.lang.Object r0 = androidx.collection.LongSparseArrayKt.access$getDELETED$p()
            if (r4 != r0) goto L15
            goto L1a
        L15:
            java.lang.Object[] r4 = r2.values
            r3 = r4[r3]
            return r3
        L1a:
            r3 = 0
            return r3
    }

    public E get(long r3, E r5) {
            r2 = this;
            long[] r0 = r2.keys
            int r1 = r2.size
            int r3 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r0, r1, r3)
            if (r3 < 0) goto L1a
            java.lang.Object[] r4 = r2.values
            r4 = r4[r3]
            java.lang.Object r0 = androidx.collection.LongSparseArrayKt.access$getDELETED$p()
            if (r4 != r0) goto L15
            goto L1a
        L15:
            java.lang.Object[] r4 = r2.values
            r3 = r4[r3]
            return r3
        L1a:
            return r5
    }

    public int indexOfKey(long r10) {
            r9 = this;
            boolean r0 = r9.garbage
            if (r0 == 0) goto L2b
            int r0 = r9.size
            long[] r1 = r9.keys
            java.lang.Object[] r2 = r9.values
            r3 = 0
            r4 = 0
            r5 = 0
        Ld:
            if (r4 >= r0) goto L27
            r6 = r2[r4]
            java.lang.Object r7 = androidx.collection.LongSparseArrayKt.access$getDELETED$p()
            if (r6 == r7) goto L24
            if (r4 == r5) goto L22
            r7 = r1[r4]
            r1[r5] = r7
            r2[r5] = r6
            r6 = 0
            r2[r4] = r6
        L22:
            int r5 = r5 + 1
        L24:
            int r4 = r4 + 1
            goto Ld
        L27:
            r9.garbage = r3
            r9.size = r5
        L2b:
            long[] r0 = r9.keys
            int r1 = r9.size
            int r10 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r0, r1, r10)
            return r10
    }

    public int indexOfValue(E r10) {
            r9 = this;
            boolean r0 = r9.garbage
            r1 = 0
            if (r0 == 0) goto L2b
            int r0 = r9.size
            long[] r2 = r9.keys
            java.lang.Object[] r3 = r9.values
            r4 = 0
            r5 = 0
        Ld:
            if (r4 >= r0) goto L27
            r6 = r3[r4]
            java.lang.Object r7 = androidx.collection.LongSparseArrayKt.access$getDELETED$p()
            if (r6 == r7) goto L24
            if (r4 == r5) goto L22
            r7 = r2[r4]
            r2[r5] = r7
            r3[r5] = r6
            r6 = 0
            r3[r4] = r6
        L22:
            int r5 = r5 + 1
        L24:
            int r4 = r4 + 1
            goto Ld
        L27:
            r9.garbage = r1
            r9.size = r5
        L2b:
            int r0 = r9.size
        L2d:
            if (r1 >= r0) goto L39
            java.lang.Object[] r2 = r9.values
            r2 = r2[r1]
            if (r2 != r10) goto L36
            return r1
        L36:
            int r1 = r1 + 1
            goto L2d
        L39:
            r10 = -1
            return r10
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

    public long keyAt(int r10) {
            r9 = this;
            if (r10 < 0) goto L34
            int r0 = r9.size
            if (r10 >= r0) goto L34
            boolean r1 = r9.garbage
            if (r1 == 0) goto L2f
            long[] r1 = r9.keys
            java.lang.Object[] r2 = r9.values
            r3 = 0
            r4 = 0
            r5 = 0
        L11:
            if (r4 >= r0) goto L2b
            r6 = r2[r4]
            java.lang.Object r7 = androidx.collection.LongSparseArrayKt.access$getDELETED$p()
            if (r6 == r7) goto L28
            if (r4 == r5) goto L26
            r7 = r1[r4]
            r1[r5] = r7
            r2[r5] = r6
            r6 = 0
            r2[r4] = r6
        L26:
            int r5 = r5 + 1
        L28:
            int r4 = r4 + 1
            goto L11
        L2b:
            r9.garbage = r3
            r9.size = r5
        L2f:
            long[] r0 = r9.keys
            r1 = r0[r10]
            return r1
        L34:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected index to be within 0..size()-1, but was "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r0.<init>(r10)
            throw r0
    }

    public void put(long r10, E r12) {
            r9 = this;
            long[] r0 = r9.keys
            int r1 = r9.size
            int r0 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r0, r1, r10)
            if (r0 < 0) goto Lf
            java.lang.Object[] r10 = r9.values
            r10[r0] = r12
            return
        Lf:
            int r0 = ~r0
            int r1 = r9.size
            if (r0 >= r1) goto L27
            java.lang.Object[] r1 = r9.values
            r1 = r1[r0]
            java.lang.Object r2 = androidx.collection.LongSparseArrayKt.access$getDELETED$p()
            if (r1 != r2) goto L27
            long[] r1 = r9.keys
            r1[r0] = r10
            java.lang.Object[] r10 = r9.values
            r10[r0] = r12
            return
        L27:
            boolean r1 = r9.garbage
            if (r1 == 0) goto L5c
            int r1 = r9.size
            long[] r2 = r9.keys
            int r3 = r2.length
            if (r1 < r3) goto L5c
            java.lang.Object[] r0 = r9.values
            r3 = 0
            r4 = 0
            r5 = 0
        L37:
            if (r4 >= r1) goto L51
            r6 = r0[r4]
            java.lang.Object r7 = androidx.collection.LongSparseArrayKt.access$getDELETED$p()
            if (r6 == r7) goto L4e
            if (r4 == r5) goto L4c
            r7 = r2[r4]
            r2[r5] = r7
            r0[r5] = r6
            r6 = 0
            r0[r4] = r6
        L4c:
            int r5 = r5 + 1
        L4e:
            int r4 = r4 + 1
            goto L37
        L51:
            r9.garbage = r3
            r9.size = r5
            long[] r0 = r9.keys
            int r0 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r0, r5, r10)
            int r0 = ~r0
        L5c:
            int r1 = r9.size
            long[] r2 = r9.keys
            int r2 = r2.length
            if (r1 < r2) goto L81
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
        L81:
            int r1 = r9.size
            int r2 = r1 - r0
            if (r2 == 0) goto L95
            long[] r2 = r9.keys
            int r3 = r0 + 1
            kotlin.collections.n.A0(r2, r2, r3, r0, r1)
            java.lang.Object[] r1 = r9.values
            int r2 = r9.size
            kotlin.collections.n.B0(r1, r1, r3, r0, r2)
        L95:
            long[] r1 = r9.keys
            r1[r0] = r10
            java.lang.Object[] r10 = r9.values
            r10[r0] = r12
            int r10 = r9.size
            int r10 = r10 + 1
            r9.size = r10
            return
    }

    public void putAll(@org.jetbrains.annotations.NotNull androidx.collection.LongSparseArray<? extends E> r6) {
            r5 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r6, r0)
            int r0 = r6.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L1a
            long r2 = r6.keyAt(r1)
            java.lang.Object r4 = r6.valueAt(r1)
            r5.put(r2, r4)
            int r1 = r1 + 1
            goto La
        L1a:
            return
    }

    @org.jetbrains.annotations.Nullable
    public E putIfAbsent(long r2, E r4) {
            r1 = this;
            java.lang.Object r0 = r1.get(r2)
            if (r0 != 0) goto L9
            r1.put(r2, r4)
        L9:
            return r0
    }

    public void remove(long r3) {
            r2 = this;
            long[] r0 = r2.keys
            int r1 = r2.size
            int r3 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r0, r1, r3)
            if (r3 < 0) goto L1f
            java.lang.Object[] r4 = r2.values
            r4 = r4[r3]
            java.lang.Object r0 = androidx.collection.LongSparseArrayKt.access$getDELETED$p()
            if (r4 == r0) goto L1f
            java.lang.Object[] r4 = r2.values
            java.lang.Object r0 = androidx.collection.LongSparseArrayKt.access$getDELETED$p()
            r4[r3] = r0
            r3 = 1
            r2.garbage = r3
        L1f:
            return
    }

    public boolean remove(long r1, E r3) {
            r0 = this;
            int r1 = r0.indexOfKey(r1)
            if (r1 < 0) goto L15
            java.lang.Object r2 = r0.valueAt(r1)
            boolean r2 = kotlin.jvm.internal.g0.g(r3, r2)
            if (r2 == 0) goto L15
            r0.removeAt(r1)
            r1 = 1
            return r1
        L15:
            r1 = 0
            return r1
    }

    public void removeAt(int r3) {
            r2 = this;
            java.lang.Object[] r0 = r2.values
            r0 = r0[r3]
            java.lang.Object r1 = androidx.collection.LongSparseArrayKt.access$getDELETED$p()
            if (r0 == r1) goto L15
            java.lang.Object[] r0 = r2.values
            java.lang.Object r1 = androidx.collection.LongSparseArrayKt.access$getDELETED$p()
            r0[r3] = r1
            r3 = 1
            r2.garbage = r3
        L15:
            return
    }

    @org.jetbrains.annotations.Nullable
    public E replace(long r2, E r4) {
            r1 = this;
            int r2 = r1.indexOfKey(r2)
            if (r2 < 0) goto Ld
            java.lang.Object[] r3 = r1.values
            r0 = r3[r2]
            r3[r2] = r4
            return r0
        Ld:
            r2 = 0
            return r2
    }

    public boolean replace(long r1, E r3, E r4) {
            r0 = this;
            int r1 = r0.indexOfKey(r1)
            if (r1 < 0) goto L16
            java.lang.Object[] r2 = r0.values
            r2 = r2[r1]
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r3)
            if (r2 == 0) goto L16
            java.lang.Object[] r2 = r0.values
            r2[r1] = r4
            r1 = 1
            return r1
        L16:
            r1 = 0
            return r1
    }

    public void setValueAt(int r10, E r11) {
            r9 = this;
            if (r10 < 0) goto L34
            int r0 = r9.size
            if (r10 >= r0) goto L34
            boolean r1 = r9.garbage
            if (r1 == 0) goto L2f
            long[] r1 = r9.keys
            java.lang.Object[] r2 = r9.values
            r3 = 0
            r4 = 0
            r5 = 0
        L11:
            if (r4 >= r0) goto L2b
            r6 = r2[r4]
            java.lang.Object r7 = androidx.collection.LongSparseArrayKt.access$getDELETED$p()
            if (r6 == r7) goto L28
            if (r4 == r5) goto L26
            r7 = r1[r4]
            r1[r5] = r7
            r2[r5] = r6
            r6 = 0
            r2[r4] = r6
        L26:
            int r5 = r5 + 1
        L28:
            int r4 = r4 + 1
            goto L11
        L2b:
            r9.garbage = r3
            r9.size = r5
        L2f:
            java.lang.Object[] r0 = r9.values
            r0[r10] = r11
            return
        L34:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "Expected index to be within 0..size()-1, but was "
            r11.append(r0)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
    }

    public int size() {
            r9 = this;
            boolean r0 = r9.garbage
            if (r0 == 0) goto L2b
            int r0 = r9.size
            long[] r1 = r9.keys
            java.lang.Object[] r2 = r9.values
            r3 = 0
            r4 = 0
            r5 = 0
        Ld:
            if (r4 >= r0) goto L27
            r6 = r2[r4]
            java.lang.Object r7 = androidx.collection.LongSparseArrayKt.access$getDELETED$p()
            if (r6 == r7) goto L24
            if (r4 == r5) goto L22
            r7 = r1[r4]
            r1[r5] = r7
            r2[r5] = r6
            r6 = 0
            r2[r4] = r6
        L22:
            int r5 = r5 + 1
        L24:
            int r4 = r4 + 1
            goto Ld
        L27:
            r9.garbage = r3
            r9.size = r5
        L2b:
            int r0 = r9.size
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r5 = this;
            int r0 = r5.size()
            if (r0 > 0) goto La
            java.lang.String r0 = "{}"
            return r0
        La:
            int r0 = r5.size
            int r0 = r0 * 28
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r0 = 123(0x7b, float:1.72E-43)
            r1.append(r0)
            int r0 = r5.size
            r2 = 0
        L1b:
            if (r2 >= r0) goto L42
            if (r2 <= 0) goto L24
            java.lang.String r3 = ", "
            r1.append(r3)
        L24:
            long r3 = r5.keyAt(r2)
            r1.append(r3)
            r3 = 61
            r1.append(r3)
            java.lang.Object r3 = r5.valueAt(r2)
            if (r3 == r1) goto L3a
            r1.append(r3)
            goto L3f
        L3a:
            java.lang.String r3 = "(this Map)"
            r1.append(r3)
        L3f:
            int r2 = r2 + 1
            goto L1b
        L42:
            r0 = 125(0x7d, float:1.75E-43)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "StringBuilder(capacity).…builderAction).toString()"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    public E valueAt(int r10) {
            r9 = this;
            if (r10 < 0) goto L34
            int r0 = r9.size
            if (r10 >= r0) goto L34
            boolean r1 = r9.garbage
            if (r1 == 0) goto L2f
            long[] r1 = r9.keys
            java.lang.Object[] r2 = r9.values
            r3 = 0
            r4 = 0
            r5 = 0
        L11:
            if (r4 >= r0) goto L2b
            r6 = r2[r4]
            java.lang.Object r7 = androidx.collection.LongSparseArrayKt.access$getDELETED$p()
            if (r6 == r7) goto L28
            if (r4 == r5) goto L26
            r7 = r1[r4]
            r1[r5] = r7
            r2[r5] = r6
            r6 = 0
            r2[r4] = r6
        L26:
            int r5 = r5 + 1
        L28:
            int r4 = r4 + 1
            goto L11
        L2b:
            r9.garbage = r3
            r9.size = r5
        L2f:
            java.lang.Object[] r0 = r9.values
            r10 = r0[r10]
            return r10
        L34:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected index to be within 0..size()-1, but was "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r0.<init>(r10)
            throw r0
    }
}
