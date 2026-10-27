package androidx.collection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nObjectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectList.kt\nandroidx/collection/ObjectList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1618:1\n305#1,6:1619\n331#1,6:1625\n305#1,6:1633\n305#1,6:1639\n305#1,6:1645\n305#1,6:1651\n305#1,6:1657\n318#1,6:1663\n331#1,6:1669\n345#1,6:1675\n75#1:1681\n75#1:1682\n318#1,6:1683\n318#1,6:1689\n318#1,6:1695\n345#1,6:1701\n75#1:1707\n331#1,6:1708\n75#1:1714\n331#1,6:1715\n345#1,6:1721\n345#1,6:1727\n318#1,6:1733\n305#1,6:1739\n80#1:1745\n1855#2,2:1631\n*S KotlinDebug\n*F\n+ 1 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n101#1:1619,6\n115#1:1625,6\n168#1:1633,6\n186#1:1639,6\n209#1:1645,6\n227#1:1651,6\n244#1:1657,6\n260#1:1663,6\n277#1:1669,6\n293#1:1675,6\n358#1:1681\n369#1:1682\n399#1:1683,6\n405#1:1689,6\n421#1:1695,6\n435#1:1701,6\n461#1:1707\n472#1:1708,6\n483#1:1714\n492#1:1715,6\n509#1:1721,6\n515#1:1727,6\n545#1:1733,6\n576#1:1739,6\n592#1:1745\n157#1:1631,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class ObjectList<E> {

    @kotlin.jvm.JvmField
    public int _size;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public java.lang.Object[] content;

    private ObjectList(int r1) {
            r0 = this;
            r0.<init>()
            if (r1 != 0) goto La
            java.lang.Object[] r1 = androidx.collection.ObjectListKt.access$getEmptyArray$p()
            goto Lc
        La:
            java.lang.Object[] r1 = new java.lang.Object[r1]
        Lc:
            r0.content = r1
            return
    }

    public /* synthetic */ ObjectList(int r1, kotlin.jvm.internal.v r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @kotlin.PublishedApi
    public static /* synthetic */ void getContent$annotations() {
            return
    }

    @kotlin.PublishedApi
    public static /* synthetic */ void get_size$annotations() {
            return
    }

    public static /* synthetic */ java.lang.String joinToString$default(androidx.collection.ObjectList r1, java.lang.CharSequence r2, java.lang.CharSequence r3, java.lang.CharSequence r4, int r5, java.lang.CharSequence r6, kotlin.jvm.functions.Function1 r7, int r8, java.lang.Object r9) {
            if (r9 != 0) goto L30
            r9 = r8 & 1
            if (r9 == 0) goto L8
            java.lang.String r2 = ", "
        L8:
            r9 = r8 & 2
            java.lang.String r0 = ""
            if (r9 == 0) goto Lf
            r3 = r0
        Lf:
            r9 = r8 & 4
            if (r9 == 0) goto L14
            r4 = r0
        L14:
            r9 = r8 & 8
            if (r9 == 0) goto L19
            r5 = -1
        L19:
            r9 = r8 & 16
            if (r9 == 0) goto L1f
            java.lang.String r6 = "..."
        L1f:
            r8 = r8 & 32
            if (r8 == 0) goto L24
            r7 = 0
        L24:
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            java.lang.String r1 = r3.joinToString(r4, r5, r6, r7, r8, r9)
            return r1
        L30:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Super calls with default arguments not supported in this target, function: joinToString"
            r1.<init>(r2)
            throw r1
    }

    public final boolean any() {
            r1 = this;
            boolean r0 = r1.isNotEmpty()
            return r0
    }

    public final boolean any(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> r6) {
            r5 = this;
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.Object[] r0 = r5.content
            int r1 = r5._size
            r2 = 0
            r3 = 0
        Lb:
            if (r3 >= r1) goto L20
            r4 = r0[r3]
            java.lang.Object r4 = r6.invoke(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L1d
            r6 = 1
            return r6
        L1d:
            int r3 = r3 + 1
            goto Lb
        L20:
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<E> asList();

    public final boolean contains(E r1) {
            r0 = this;
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    public final boolean containsAll(@org.jetbrains.annotations.NotNull androidx.collection.ObjectList<E> r5) {
            r4 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.Object[] r0 = r5.content
            int r5 = r5._size
            r1 = 0
            r2 = 0
        Lb:
            if (r2 >= r5) goto L19
            r3 = r0[r2]
            boolean r3 = r4.contains(r3)
            if (r3 != 0) goto L16
            return r1
        L16:
            int r2 = r2 + 1
            goto Lb
        L19:
            r5 = 1
            return r5
    }

    public final boolean containsAll(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends E> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Iterator r2 = r2.iterator()
        L9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1b
            java.lang.Object r0 = r2.next()
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L9
            r2 = 0
            return r2
        L1b:
            r2 = 1
            return r2
    }

    public final boolean containsAll(@org.jetbrains.annotations.NotNull java.util.List<? extends E> r5) {
            r4 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r5, r0)
            int r0 = r5.size()
            r1 = 0
            r2 = 0
        Lb:
            if (r2 >= r0) goto L1b
            java.lang.Object r3 = r5.get(r2)
            boolean r3 = r4.contains(r3)
            if (r3 != 0) goto L18
            return r1
        L18:
            int r2 = r2 + 1
            goto Lb
        L1b:
            r5 = 1
            return r5
    }

    public final boolean containsAll(@org.jetbrains.annotations.NotNull E[] r5) {
            r4 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r5, r0)
            int r0 = r5.length
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L16
            r3 = r5[r2]
            boolean r3 = r4.contains(r3)
            if (r3 != 0) goto L13
            return r1
        L13:
            int r2 = r2 + 1
            goto L8
        L16:
            r5 = 1
            return r5
    }

    public final int count() {
            r1 = this;
            int r0 = r1._size
            return r0
    }

    public final int count(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> r6) {
            r5 = this;
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.Object[] r0 = r5.content
            int r1 = r5._size
            r2 = 0
            r3 = 0
        Lb:
            if (r2 >= r1) goto L20
            r4 = r0[r2]
            java.lang.Object r4 = r6.invoke(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L1d
            int r3 = r3 + 1
        L1d:
            int r2 = r2 + 1
            goto Lb
        L20:
            return r3
    }

    public final E elementAt(@androidx.annotation.IntRange(from = 0) int r4) {
            r3 = this;
            if (r4 < 0) goto Lb
            int r0 = r3._size
            if (r4 >= r0) goto Lb
            java.lang.Object[] r0 = r3.content
            r4 = r0[r4]
            return r4
        Lb:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Index "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " must be in 0.."
            r1.append(r4)
            int r4 = r3._size
            int r4 = r4 + (-1)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public final E elementAtOrElse(@androidx.annotation.IntRange(from = 0) int r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends E> r3) {
            r1 = this;
            java.lang.String r0 = "defaultValue"
            kotlin.jvm.internal.g0.p(r3, r0)
            if (r2 < 0) goto L10
            int r0 = r1._size
            if (r2 >= r0) goto L10
            java.lang.Object[] r3 = r1.content
            r2 = r3[r2]
            return r2
        L10:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r3.invoke(r2)
            return r2
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r7) {
            r6 = this;
            boolean r0 = r7 instanceof androidx.collection.ObjectList
            r1 = 0
            if (r0 == 0) goto L32
            androidx.collection.ObjectList r7 = (androidx.collection.ObjectList) r7
            int r0 = r7._size
            int r2 = r6._size
            if (r0 == r2) goto Le
            goto L32
        Le:
            java.lang.Object[] r0 = r6.content
            java.lang.Object[] r7 = r7.content
            kotlin.ranges.m r2 = kotlin.ranges.t.W1(r1, r2)
            int r3 = r2.e()
            int r2 = r2.f()
            if (r3 > r2) goto L30
        L20:
            r4 = r0[r3]
            r5 = r7[r3]
            boolean r4 = kotlin.jvm.internal.g0.g(r4, r5)
            if (r4 != 0) goto L2b
            return r1
        L2b:
            if (r3 == r2) goto L30
            int r3 = r3 + 1
            goto L20
        L30:
            r7 = 1
            return r7
        L32:
            return r1
    }

    public final E first() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lc
            java.lang.Object[] r0 = r2.content
            r1 = 0
            r0 = r0[r1]
            return r0
        Lc:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "ObjectList is empty."
            r0.<init>(r1)
            throw r0
    }

    public final E first(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> r6) {
            r5 = this;
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.Object[] r0 = r5.content
            int r1 = r5._size
            r2 = 0
        La:
            if (r2 >= r1) goto L1e
            r3 = r0[r2]
            java.lang.Object r4 = r6.invoke(r3)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L1b
            return r3
        L1b:
            int r2 = r2 + 1
            goto La
        L1e:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException
            java.lang.String r0 = "ObjectList contains no element matching the predicate."
            r6.<init>(r0)
            throw r6
    }

    @org.jetbrains.annotations.Nullable
    public final E firstOrNull() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L8
            r0 = 0
            return r0
        L8:
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final E firstOrNull(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> r6) {
            r5 = this;
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.Object[] r0 = r5.content
            int r1 = r5._size
            r2 = 0
        La:
            if (r2 >= r1) goto L1e
            r3 = r0[r2]
            java.lang.Object r4 = r6.invoke(r3)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L1b
            return r3
        L1b:
            int r2 = r2 + 1
            goto La
        L1e:
            r6 = 0
            return r6
    }

    public final <R> R fold(R r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super R, ? super E, ? extends R> r6) {
            r4 = this;
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.Object[] r0 = r4.content
            int r1 = r4._size
            r2 = 0
        La:
            if (r2 >= r1) goto L15
            r3 = r0[r2]
            java.lang.Object r5 = r6.invoke(r5, r3)
            int r2 = r2 + 1
            goto La
        L15:
            return r5
    }

    public final <R> R foldIndexed(R r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super R, ? super E, ? extends R> r7) {
            r5 = this;
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.Object[] r0 = r5.content
            int r1 = r5._size
            r2 = 0
        La:
            if (r2 >= r1) goto L19
            r3 = r0[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            java.lang.Object r6 = r7.invoke(r4, r6, r3)
            int r2 = r2 + 1
            goto La
        L19:
            return r6
    }

    public final <R> R foldRight(R r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super E, ? super R, ? extends R> r5) {
            r3 = this;
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.Object[] r0 = r3.content
            int r1 = r3._size
            int r1 = r1 + (-1)
        Lb:
            r2 = -1
            if (r2 >= r1) goto L17
            r2 = r0[r1]
            java.lang.Object r4 = r5.invoke(r2, r4)
            int r1 = r1 + (-1)
            goto Lb
        L17:
            return r4
    }

    public final <R> R foldRightIndexed(R r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super E, ? super R, ? extends R> r6) {
            r4 = this;
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.Object[] r0 = r4.content
            int r1 = r4._size
            int r1 = r1 + (-1)
        Lb:
            r2 = -1
            if (r2 >= r1) goto L1b
            r2 = r0[r1]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            java.lang.Object r5 = r6.invoke(r3, r2, r5)
            int r1 = r1 + (-1)
            goto Lb
        L1b:
            return r5
    }

    public final void forEach(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super E, kotlin.n1> r5) {
            r4 = this;
            java.lang.String r0 = "block"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.Object[] r0 = r4.content
            int r1 = r4._size
            r2 = 0
        La:
            if (r2 >= r1) goto L14
            r3 = r0[r2]
            r5.invoke(r3)
            int r2 = r2 + 1
            goto La
        L14:
            return
    }

    public final void forEachIndexed(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super E, kotlin.n1> r6) {
            r5 = this;
            java.lang.String r0 = "block"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.Object[] r0 = r5.content
            int r1 = r5._size
            r2 = 0
        La:
            if (r2 >= r1) goto L18
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r4 = r0[r2]
            r6.invoke(r3, r4)
            int r2 = r2 + 1
            goto La
        L18:
            return
    }

    public final void forEachReversed(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super E, kotlin.n1> r4) {
            r3 = this;
            java.lang.String r0 = "block"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.Object[] r0 = r3.content
            int r1 = r3._size
            int r1 = r1 + (-1)
        Lb:
            r2 = -1
            if (r2 >= r1) goto L16
            r2 = r0[r1]
            r4.invoke(r2)
            int r1 = r1 + (-1)
            goto Lb
        L16:
            return
    }

    public final void forEachReversedIndexed(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super E, kotlin.n1> r5) {
            r4 = this;
            java.lang.String r0 = "block"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.Object[] r0 = r4.content
            int r1 = r4._size
            int r1 = r1 + (-1)
        Lb:
            r2 = -1
            if (r2 >= r1) goto L1a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r3 = r0[r1]
            r5.invoke(r2, r3)
            int r1 = r1 + (-1)
            goto Lb
        L1a:
            return
    }

    public final E get(@androidx.annotation.IntRange(from = 0) int r4) {
            r3 = this;
            if (r4 < 0) goto Lb
            int r0 = r3._size
            if (r4 >= r0) goto Lb
            java.lang.Object[] r0 = r3.content
            r4 = r0[r4]
            return r4
        Lb:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Index "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " must be in 0.."
            r1.append(r4)
            int r4 = r3._size
            int r4 = r4 + (-1)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.ranges.m getIndices() {
            r2 = this;
            r0 = 0
            int r1 = r2._size
            kotlin.ranges.m r0 = kotlin.ranges.t.W1(r0, r1)
            return r0
    }

    @androidx.annotation.IntRange(from = -1)
    public final int getLastIndex() {
            r1 = this;
            int r0 = r1._size
            int r0 = r0 + (-1)
            return r0
    }

    @androidx.annotation.IntRange(from = 0)
    public final int getSize() {
            r1 = this;
            int r0 = r1._size
            return r0
    }

    public int hashCode() {
            r6 = this;
            java.lang.Object[] r0 = r6.content
            int r1 = r6._size
            r2 = 0
            r3 = 0
            r4 = 0
        L7:
            if (r3 >= r1) goto L19
            r5 = r0[r3]
            if (r5 == 0) goto L12
            int r5 = r5.hashCode()
            goto L13
        L12:
            r5 = 0
        L13:
            int r5 = r5 * 31
            int r4 = r4 + r5
            int r3 = r3 + 1
            goto L7
        L19:
            return r4
    }

    public final int indexOf(E r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L11
            java.lang.Object[] r5 = r4.content
            int r1 = r4._size
        L7:
            if (r0 >= r1) goto L23
            r2 = r5[r0]
            if (r2 != 0) goto Le
            return r0
        Le:
            int r0 = r0 + 1
            goto L7
        L11:
            java.lang.Object[] r1 = r4.content
            int r2 = r4._size
        L15:
            if (r0 >= r2) goto L23
            r3 = r1[r0]
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L20
            return r0
        L20:
            int r0 = r0 + 1
            goto L15
        L23:
            r5 = -1
            return r5
    }

    public final int indexOfFirst(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> r5) {
            r4 = this;
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.Object[] r0 = r4.content
            int r1 = r4._size
            r2 = 0
        La:
            if (r2 >= r1) goto L1e
            r3 = r0[r2]
            java.lang.Object r3 = r5.invoke(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L1b
            return r2
        L1b:
            int r2 = r2 + 1
            goto La
        L1e:
            r5 = -1
            return r5
    }

    public final int indexOfLast(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> r4) {
            r3 = this;
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.Object[] r0 = r3.content
            int r1 = r3._size
            int r1 = r1 + (-1)
        Lb:
            r2 = -1
            if (r2 >= r1) goto L20
            r2 = r0[r1]
            java.lang.Object r2 = r4.invoke(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L1d
            return r1
        L1d:
            int r1 = r1 + (-1)
            goto Lb
        L20:
            return r2
    }

    public final boolean isEmpty() {
            r1 = this;
            int r0 = r1._size
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final boolean isNotEmpty() {
            r1 = this;
            int r0 = r1._size
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public final java.lang.String joinToString() {
            r9 = this;
            r7 = 63
            r8 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r0 = r9
            java.lang.String r1 = joinToString$default(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r1
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public final java.lang.String joinToString(@org.jetbrains.annotations.NotNull java.lang.CharSequence r11) {
            r10 = this;
            java.lang.String r0 = "separator"
            kotlin.jvm.internal.g0.p(r11, r0)
            r8 = 62
            r9 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r1 = r10
            r2 = r11
            java.lang.String r11 = joinToString$default(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public final java.lang.String joinToString(@org.jetbrains.annotations.NotNull java.lang.CharSequence r11, @org.jetbrains.annotations.NotNull java.lang.CharSequence r12) {
            r10 = this;
            java.lang.String r0 = "separator"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.g0.p(r12, r0)
            r8 = 60
            r9 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r1 = r10
            r2 = r11
            r3 = r12
            java.lang.String r11 = joinToString$default(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public final java.lang.String joinToString(@org.jetbrains.annotations.NotNull java.lang.CharSequence r11, @org.jetbrains.annotations.NotNull java.lang.CharSequence r12, @org.jetbrains.annotations.NotNull java.lang.CharSequence r13) {
            r10 = this;
            java.lang.String r0 = "separator"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "postfix"
            kotlin.jvm.internal.g0.p(r13, r0)
            r8 = 56
            r9 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            java.lang.String r11 = joinToString$default(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public final java.lang.String joinToString(@org.jetbrains.annotations.NotNull java.lang.CharSequence r11, @org.jetbrains.annotations.NotNull java.lang.CharSequence r12, @org.jetbrains.annotations.NotNull java.lang.CharSequence r13, int r14) {
            r10 = this;
            java.lang.String r0 = "separator"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "postfix"
            kotlin.jvm.internal.g0.p(r13, r0)
            r8 = 48
            r9 = 0
            r6 = 0
            r7 = 0
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            java.lang.String r11 = joinToString$default(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public final java.lang.String joinToString(@org.jetbrains.annotations.NotNull java.lang.CharSequence r11, @org.jetbrains.annotations.NotNull java.lang.CharSequence r12, @org.jetbrains.annotations.NotNull java.lang.CharSequence r13, int r14, @org.jetbrains.annotations.NotNull java.lang.CharSequence r15) {
            r10 = this;
            java.lang.String r0 = "separator"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "postfix"
            kotlin.jvm.internal.g0.p(r13, r0)
            java.lang.String r0 = "truncated"
            kotlin.jvm.internal.g0.p(r15, r0)
            r8 = 32
            r9 = 0
            r7 = 0
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            java.lang.String r11 = joinToString$default(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public final java.lang.String joinToString(@org.jetbrains.annotations.NotNull java.lang.CharSequence r5, @org.jetbrains.annotations.NotNull java.lang.CharSequence r6, @org.jetbrains.annotations.NotNull java.lang.CharSequence r7, int r8, @org.jetbrains.annotations.NotNull java.lang.CharSequence r9, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super E, ? extends java.lang.CharSequence> r10) {
            r4 = this;
            java.lang.String r0 = "separator"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "postfix"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "truncated"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.Object[] r6 = r4.content
            int r1 = r4._size
            r2 = 0
        L21:
            if (r2 >= r1) goto L42
            r3 = r6[r2]
            if (r2 != r8) goto L2b
            r0.append(r9)
            goto L45
        L2b:
            if (r2 == 0) goto L30
            r0.append(r5)
        L30:
            if (r10 != 0) goto L36
            r0.append(r3)
            goto L3f
        L36:
            java.lang.Object r3 = r10.invoke(r3)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r0.append(r3)
        L3f:
            int r2 = r2 + 1
            goto L21
        L42:
            r0.append(r7)
        L45:
            java.lang.String r5 = r0.toString()
            java.lang.String r6 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.g0.o(r5, r6)
            return r5
    }

    public final E last() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lf
            java.lang.Object[] r0 = r2.content
            int r1 = r2._size
            int r1 = r1 + (-1)
            r0 = r0[r1]
            return r0
        Lf:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "ObjectList is empty."
            r0.<init>(r1)
            throw r0
    }

    public final E last(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> r5) {
            r4 = this;
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.Object[] r0 = r4.content
            int r1 = r4._size
            int r1 = r1 + (-1)
        Lb:
            r2 = -1
            if (r2 >= r1) goto L20
            r2 = r0[r1]
            java.lang.Object r3 = r5.invoke(r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L1d
            return r2
        L1d:
            int r1 = r1 + (-1)
            goto Lb
        L20:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.String r0 = "ObjectList contains no element matching the predicate."
            r5.<init>(r0)
            throw r5
    }

    public final int lastIndexOf(E r5) {
            r4 = this;
            r0 = -1
            if (r5 != 0) goto L13
            java.lang.Object[] r5 = r4.content
            int r1 = r4._size
            int r1 = r1 + (-1)
        L9:
            if (r0 >= r1) goto L27
            r2 = r5[r1]
            if (r2 != 0) goto L10
            return r1
        L10:
            int r1 = r1 + (-1)
            goto L9
        L13:
            java.lang.Object[] r1 = r4.content
            int r2 = r4._size
            int r2 = r2 + (-1)
        L19:
            if (r0 >= r2) goto L27
            r3 = r1[r2]
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L24
            return r2
        L24:
            int r2 = r2 + (-1)
            goto L19
        L27:
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final E lastOrNull() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L8
            r0 = 0
            return r0
        L8:
            java.lang.Object[] r0 = r2.content
            int r1 = r2._size
            int r1 = r1 + (-1)
            r0 = r0[r1]
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final E lastOrNull(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> r5) {
            r4 = this;
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.Object[] r0 = r4.content
            int r1 = r4._size
            int r1 = r1 + (-1)
        Lb:
            r2 = -1
            if (r2 >= r1) goto L20
            r2 = r0[r1]
            java.lang.Object r3 = r5.invoke(r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L1d
            return r2
        L1d:
            int r1 = r1 + (-1)
            goto Lb
        L20:
            r5 = 0
            return r5
    }

    public final boolean none() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            return r0
    }

    public final boolean reversedAny(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> r5) {
            r4 = this;
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.Object[] r0 = r4.content
            int r1 = r4._size
            r2 = 1
            int r1 = r1 - r2
        Lb:
            r3 = -1
            if (r3 >= r1) goto L20
            r3 = r0[r1]
            java.lang.Object r3 = r5.invoke(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L1d
            return r2
        L1d:
            int r1 = r1 + (-1)
            goto Lb
        L20:
            r5 = 0
            return r5
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r9 = this;
            androidx.collection.ObjectList$toString$1 r6 = new androidx.collection.ObjectList$toString$1
            r6.<init>(r9)
            r7 = 25
            r8 = 0
            r1 = 0
            java.lang.String r2 = "["
            java.lang.String r3 = "]"
            r4 = 0
            r5 = 0
            r0 = r9
            java.lang.String r1 = joinToString$default(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r1
    }
}
