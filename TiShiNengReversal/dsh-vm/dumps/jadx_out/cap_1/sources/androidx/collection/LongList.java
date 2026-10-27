package androidx.collection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nLongList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongList.kt\nandroidx/collection/LongList\n*L\n1#1,969:1\n253#1,6:970\n279#1,6:976\n253#1,6:982\n75#1:988\n253#1,6:989\n253#1,6:995\n253#1,6:1001\n266#1,6:1007\n279#1,6:1013\n293#1,6:1019\n70#1:1025\n70#1:1026\n266#1,6:1027\n266#1,6:1033\n293#1,6:1039\n70#1:1045\n279#1,6:1046\n293#1,6:1052\n266#1,6:1058\n266#1,6:1064\n253#1,6:1070\n75#1:1076\n467#1,10:1077\n266#1,4:1087\n477#1,9:1091\n271#1:1100\n486#1,2:1101\n467#1,10:1103\n266#1,4:1113\n477#1,9:1117\n271#1:1126\n486#1,2:1127\n467#1,10:1129\n266#1,4:1139\n477#1,9:1143\n271#1:1152\n486#1,2:1153\n467#1,10:1155\n266#1,4:1165\n477#1,9:1169\n271#1:1178\n486#1,2:1179\n467#1,10:1181\n266#1,4:1191\n477#1,9:1195\n271#1:1204\n486#1,2:1205\n*S KotlinDebug\n*F\n+ 1 LongList.kt\nandroidx/collection/LongList\n*L\n96#1:970,6\n110#1:976,6\n122#1:982,6\n135#1:988\n153#1:989,6\n175#1:995,6\n192#1:1001,6\n208#1:1007,6\n225#1:1013,6\n241#1:1019,6\n306#1:1025\n317#1:1026\n343#1:1027,6\n357#1:1033,6\n371#1:1039,6\n397#1:1045\n407#1:1046,6\n420#1:1052,6\n445#1:1058,6\n476#1:1064,6\n494#1:1070,6\n510#1:1076\n-1#1:1077,10\n-1#1:1087,4\n-1#1:1091,9\n-1#1:1100\n-1#1:1101,2\n-1#1:1103,10\n-1#1:1113,4\n-1#1:1117,9\n-1#1:1126\n-1#1:1127,2\n-1#1:1129,10\n-1#1:1139,4\n-1#1:1143,9\n-1#1:1152\n-1#1:1153,2\n-1#1:1155,10\n-1#1:1165,4\n-1#1:1169,9\n-1#1:1178\n-1#1:1179,2\n-1#1:1181,10\n-1#1:1191,4\n-1#1:1195,9\n-1#1:1204\n-1#1:1205,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class LongList {

    @kotlin.jvm.JvmField
    public int _size;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public long[] content;

    private LongList(int r1) {
            r0 = this;
            r0.<init>()
            if (r1 != 0) goto La
            long[] r1 = androidx.collection.LongSetKt.getEmptyLongArray()
            goto Lc
        La:
            long[] r1 = new long[r1]
        Lc:
            r0.content = r1
            return
    }

    public /* synthetic */ LongList(int r1, kotlin.jvm.internal.v r2) {
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

    public static /* synthetic */ java.lang.String joinToString$default(androidx.collection.LongList r1, java.lang.CharSequence r2, java.lang.CharSequence r3, java.lang.CharSequence r4, int r5, java.lang.CharSequence r6, int r7, java.lang.Object r8) {
            if (r8 != 0) goto L2a
            r8 = r7 & 1
            if (r8 == 0) goto L8
            java.lang.String r2 = ", "
        L8:
            r8 = r7 & 2
            java.lang.String r0 = ""
            if (r8 == 0) goto Lf
            r3 = r0
        Lf:
            r8 = r7 & 4
            if (r8 == 0) goto L14
            r4 = r0
        L14:
            r8 = r7 & 8
            if (r8 == 0) goto L19
            r5 = -1
        L19:
            r7 = r7 & 16
            if (r7 == 0) goto L1f
            java.lang.String r6 = "..."
        L1f:
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            java.lang.String r1 = r3.joinToString(r4, r5, r6, r7, r8)
            return r1
        L2a:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Super calls with default arguments not supported in this target, function: joinToString"
            r1.<init>(r2)
            throw r1
    }

    public static /* synthetic */ java.lang.String joinToString$default(androidx.collection.LongList r2, java.lang.CharSequence r3, java.lang.CharSequence r4, java.lang.CharSequence r5, int r6, java.lang.CharSequence r7, kotlin.jvm.functions.Function1 r8, int r9, java.lang.Object r10) {
            if (r10 != 0) goto L71
            r10 = r9 & 1
            if (r10 == 0) goto L8
            java.lang.String r3 = ", "
        L8:
            r10 = r9 & 2
            java.lang.String r0 = ""
            if (r10 == 0) goto Lf
            r4 = r0
        Lf:
            r10 = r9 & 4
            if (r10 == 0) goto L14
            r5 = r0
        L14:
            r10 = r9 & 8
            if (r10 == 0) goto L19
            r6 = -1
        L19:
            r9 = r9 & 16
            if (r9 == 0) goto L1f
            java.lang.String r7 = "..."
        L1f:
            java.lang.String r9 = "separator"
            kotlin.jvm.internal.g0.p(r3, r9)
            java.lang.String r9 = "prefix"
            kotlin.jvm.internal.g0.p(r4, r9)
            java.lang.String r9 = "postfix"
            kotlin.jvm.internal.g0.p(r5, r9)
            java.lang.String r9 = "truncated"
            kotlin.jvm.internal.g0.p(r7, r9)
            java.lang.String r9 = "transform"
            kotlin.jvm.internal.g0.p(r8, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r4)
            long[] r4 = r2.content
            int r2 = r2._size
            r10 = 0
        L45:
            if (r10 >= r2) goto L64
            r0 = r4[r10]
            if (r10 != r6) goto L4f
            r9.append(r7)
            goto L67
        L4f:
            if (r10 == 0) goto L54
            r9.append(r3)
        L54:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = r8.invoke(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9.append(r0)
            int r10 = r10 + 1
            goto L45
        L64:
            r9.append(r5)
        L67:
            java.lang.String r2 = r9.toString()
            java.lang.String r3 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.g0.o(r2, r3)
            return r2
        L71:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r3 = "Super calls with default arguments not supported in this target, function: joinToString"
            r2.<init>(r3)
            throw r2
    }

    public final boolean any() {
            r1 = this;
            boolean r0 = r1.isNotEmpty()
            return r0
    }

    public final boolean any(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Long, java.lang.Boolean> r7) {
            r6 = this;
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r7, r0)
            long[] r0 = r6.content
            int r1 = r6._size
            r2 = 0
            r3 = 0
        Lb:
            if (r3 >= r1) goto L24
            r4 = r0[r3]
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.Object r4 = r7.invoke(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L21
            r7 = 1
            return r7
        L21:
            int r3 = r3 + 1
            goto Lb
        L24:
            return r2
    }

    public final boolean contains(long r8) {
            r7 = this;
            long[] r0 = r7.content
            int r1 = r7._size
            r2 = 0
            r3 = 0
        L6:
            if (r3 >= r1) goto L13
            r4 = r0[r3]
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 != 0) goto L10
            r8 = 1
            return r8
        L10:
            int r3 = r3 + 1
            goto L6
        L13:
            return r2
    }

    public final boolean containsAll(@org.jetbrains.annotations.NotNull androidx.collection.LongList r6) {
            r5 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r6, r0)
            int r0 = r6._size
            r1 = 0
            kotlin.ranges.m r0 = kotlin.ranges.t.W1(r1, r0)
            int r2 = r0.e()
            int r0 = r0.f()
            if (r2 > r0) goto L26
        L16:
            long r3 = r6.get(r2)
            boolean r3 = r5.contains(r3)
            if (r3 != 0) goto L21
            return r1
        L21:
            if (r2 == r0) goto L26
            int r2 = r2 + 1
            goto L16
        L26:
            r6 = 1
            return r6
    }

    public final int count() {
            r1 = this;
            int r0 = r1._size
            return r0
    }

    public final int count(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Long, java.lang.Boolean> r7) {
            r6 = this;
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r7, r0)
            long[] r0 = r6.content
            int r1 = r6._size
            r2 = 0
            r3 = 0
        Lb:
            if (r2 >= r1) goto L24
            r4 = r0[r2]
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.Object r4 = r7.invoke(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L21
            int r3 = r3 + 1
        L21:
            int r2 = r2 + 1
            goto Lb
        L24:
            return r3
    }

    public final long elementAt(@androidx.annotation.IntRange(from = 0) int r4) {
            r3 = this;
            if (r4 < 0) goto Lb
            int r0 = r3._size
            if (r4 >= r0) goto Lb
            long[] r0 = r3.content
            r1 = r0[r4]
            return r1
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

    public final long elementAtOrElse(@androidx.annotation.IntRange(from = 0) int r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Long> r3) {
            r1 = this;
            java.lang.String r0 = "defaultValue"
            kotlin.jvm.internal.g0.p(r3, r0)
            if (r2 < 0) goto L10
            int r0 = r1._size
            if (r2 >= r0) goto L10
            long[] r3 = r1.content
            r2 = r3[r2]
            return r2
        L10:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r3.invoke(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            return r2
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r10) {
            r9 = this;
            boolean r0 = r10 instanceof androidx.collection.LongList
            r1 = 0
            if (r0 == 0) goto L30
            androidx.collection.LongList r10 = (androidx.collection.LongList) r10
            int r0 = r10._size
            int r2 = r9._size
            if (r0 == r2) goto Le
            goto L30
        Le:
            long[] r0 = r9.content
            long[] r10 = r10.content
            kotlin.ranges.m r2 = kotlin.ranges.t.W1(r1, r2)
            int r3 = r2.e()
            int r2 = r2.f()
            if (r3 > r2) goto L2e
        L20:
            r4 = r0[r3]
            r6 = r10[r3]
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L29
            return r1
        L29:
            if (r3 == r2) goto L2e
            int r3 = r3 + 1
            goto L20
        L2e:
            r10 = 1
            return r10
        L30:
            return r1
    }

    public final long first() {
            r3 = this;
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto Lc
            long[] r0 = r3.content
            r1 = 0
            r1 = r0[r1]
            return r1
        Lc:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "LongList is empty."
            r0.<init>(r1)
            throw r0
    }

    public final long first(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Long, java.lang.Boolean> r7) {
            r6 = this;
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r7, r0)
            long[] r0 = r6.content
            int r1 = r6._size
            r2 = 0
        La:
            if (r2 >= r1) goto L22
            r3 = r0[r2]
            java.lang.Long r5 = java.lang.Long.valueOf(r3)
            java.lang.Object r5 = r7.invoke(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L1f
            return r3
        L1f:
            int r2 = r2 + 1
            goto La
        L22:
            java.util.NoSuchElementException r7 = new java.util.NoSuchElementException
            java.lang.String r0 = "LongList contains no element matching the predicate."
            r7.<init>(r0)
            throw r7
    }

    public final <R> R fold(R r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super R, ? super java.lang.Long, ? extends R> r7) {
            r5 = this;
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.g0.p(r7, r0)
            long[] r0 = r5.content
            int r1 = r5._size
            r2 = 0
        La:
            if (r2 >= r1) goto L19
            r3 = r0[r2]
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object r6 = r7.invoke(r6, r3)
            int r2 = r2 + 1
            goto La
        L19:
            return r6
    }

    public final <R> R foldIndexed(R r7, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super R, ? super java.lang.Long, ? extends R> r8) {
            r6 = this;
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.g0.p(r8, r0)
            long[] r0 = r6.content
            int r1 = r6._size
            r2 = 0
        La:
            if (r2 >= r1) goto L1d
            r3 = r0[r2]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object r7 = r8.invoke(r5, r7, r3)
            int r2 = r2 + 1
            goto La
        L1d:
            return r7
    }

    public final <R> R foldRight(R r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Long, ? super R, ? extends R> r6) {
            r4 = this;
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.g0.p(r6, r0)
            long[] r0 = r4.content
            int r1 = r4._size
            int r1 = r1 + (-1)
        Lb:
            r2 = -1
            if (r2 >= r1) goto L1b
            r2 = r0[r1]
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object r5 = r6.invoke(r2, r5)
            int r1 = r1 + (-1)
            goto Lb
        L1b:
            return r5
    }

    public final <R> R foldRightIndexed(R r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super java.lang.Long, ? super R, ? extends R> r7) {
            r5 = this;
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.g0.p(r7, r0)
            long[] r0 = r5.content
            int r1 = r5._size
            int r1 = r1 + (-1)
        Lb:
            r2 = -1
            if (r2 >= r1) goto L1f
            r2 = r0[r1]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object r6 = r7.invoke(r4, r2, r6)
            int r1 = r1 + (-1)
            goto Lb
        L1f:
            return r6
    }

    public final void forEach(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.n1> r6) {
            r5 = this;
            java.lang.String r0 = "block"
            kotlin.jvm.internal.g0.p(r6, r0)
            long[] r0 = r5.content
            int r1 = r5._size
            r2 = 0
        La:
            if (r2 >= r1) goto L18
            r3 = r0[r2]
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r6.invoke(r3)
            int r2 = r2 + 1
            goto La
        L18:
            return
    }

    public final void forEachIndexed(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Long, kotlin.n1> r7) {
            r6 = this;
            java.lang.String r0 = "block"
            kotlin.jvm.internal.g0.p(r7, r0)
            long[] r0 = r6.content
            int r1 = r6._size
            r2 = 0
        La:
            if (r2 >= r1) goto L1c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r4 = r0[r2]
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r7.invoke(r3, r4)
            int r2 = r2 + 1
            goto La
        L1c:
            return
    }

    public final void forEachReversed(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.n1> r5) {
            r4 = this;
            java.lang.String r0 = "block"
            kotlin.jvm.internal.g0.p(r5, r0)
            long[] r0 = r4.content
            int r1 = r4._size
            int r1 = r1 + (-1)
        Lb:
            r2 = -1
            if (r2 >= r1) goto L1a
            r2 = r0[r1]
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r5.invoke(r2)
            int r1 = r1 + (-1)
            goto Lb
        L1a:
            return
    }

    public final void forEachReversedIndexed(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Long, kotlin.n1> r6) {
            r5 = this;
            java.lang.String r0 = "block"
            kotlin.jvm.internal.g0.p(r6, r0)
            long[] r0 = r5.content
            int r1 = r5._size
            int r1 = r1 + (-1)
        Lb:
            r2 = -1
            if (r2 >= r1) goto L1e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r3 = r0[r1]
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r6.invoke(r2, r3)
            int r1 = r1 + (-1)
            goto Lb
        L1e:
            return
    }

    public final long get(@androidx.annotation.IntRange(from = 0) int r4) {
            r3 = this;
            if (r4 < 0) goto Lb
            int r0 = r3._size
            if (r4 >= r0) goto Lb
            long[] r0 = r3.content
            r1 = r0[r4]
            return r1
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
            long[] r0 = r6.content
            int r1 = r6._size
            r2 = 0
            r3 = 0
        L6:
            if (r2 >= r1) goto L14
            r4 = r0[r2]
            int r4 = androidx.camera.camera2.internal.compat.params.e.a(r4)
            int r4 = r4 * 31
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L6
        L14:
            return r3
    }

    public final int indexOf(long r7) {
            r6 = this;
            long[] r0 = r6.content
            int r1 = r6._size
            r2 = 0
        L5:
            if (r2 >= r1) goto L11
            r3 = r0[r2]
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 != 0) goto Le
            return r2
        Le:
            int r2 = r2 + 1
            goto L5
        L11:
            r7 = -1
            return r7
    }

    public final int indexOfFirst(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Long, java.lang.Boolean> r6) {
            r5 = this;
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r6, r0)
            long[] r0 = r5.content
            int r1 = r5._size
            r2 = 0
        La:
            if (r2 >= r1) goto L22
            r3 = r0[r2]
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object r3 = r6.invoke(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L1f
            return r2
        L1f:
            int r2 = r2 + 1
            goto La
        L22:
            r6 = -1
            return r6
    }

    public final int indexOfLast(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Long, java.lang.Boolean> r5) {
            r4 = this;
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r5, r0)
            long[] r0 = r4.content
            int r1 = r4._size
            int r1 = r1 + (-1)
        Lb:
            r2 = -1
            if (r2 >= r1) goto L24
            r2 = r0[r1]
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object r2 = r5.invoke(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L21
            return r1
        L21:
            int r1 = r1 + (-1)
            goto Lb
        L24:
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
            r8 = this;
            r6 = 31
            r7 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r8
            java.lang.String r1 = joinToString$default(r0, r1, r2, r3, r4, r5, r6, r7)
            return r1
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public final java.lang.String joinToString(@org.jetbrains.annotations.NotNull java.lang.CharSequence r10) {
            r9 = this;
            java.lang.String r0 = "separator"
            kotlin.jvm.internal.g0.p(r10, r0)
            r7 = 30
            r8 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r9
            r2 = r10
            java.lang.String r10 = joinToString$default(r1, r2, r3, r4, r5, r6, r7, r8)
            return r10
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public final java.lang.String joinToString(@org.jetbrains.annotations.NotNull java.lang.CharSequence r10, @org.jetbrains.annotations.NotNull java.lang.CharSequence r11) {
            r9 = this;
            java.lang.String r0 = "separator"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.g0.p(r11, r0)
            r7 = 28
            r8 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r9
            r2 = r10
            r3 = r11
            java.lang.String r10 = joinToString$default(r1, r2, r3, r4, r5, r6, r7, r8)
            return r10
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public final java.lang.String joinToString(@org.jetbrains.annotations.NotNull java.lang.CharSequence r10, @org.jetbrains.annotations.NotNull java.lang.CharSequence r11, @org.jetbrains.annotations.NotNull java.lang.CharSequence r12) {
            r9 = this;
            java.lang.String r0 = "separator"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = "postfix"
            kotlin.jvm.internal.g0.p(r12, r0)
            r7 = 24
            r8 = 0
            r5 = 0
            r6 = 0
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            java.lang.String r10 = joinToString$default(r1, r2, r3, r4, r5, r6, r7, r8)
            return r10
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public final java.lang.String joinToString(@org.jetbrains.annotations.NotNull java.lang.CharSequence r10, @org.jetbrains.annotations.NotNull java.lang.CharSequence r11, @org.jetbrains.annotations.NotNull java.lang.CharSequence r12, int r13) {
            r9 = this;
            java.lang.String r0 = "separator"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = "postfix"
            kotlin.jvm.internal.g0.p(r12, r0)
            r7 = 16
            r8 = 0
            r6 = 0
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            java.lang.String r10 = joinToString$default(r1, r2, r3, r4, r5, r6, r7, r8)
            return r10
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public final java.lang.String joinToString(@org.jetbrains.annotations.NotNull java.lang.CharSequence r6, @org.jetbrains.annotations.NotNull java.lang.CharSequence r7, @org.jetbrains.annotations.NotNull java.lang.CharSequence r8, int r9, @org.jetbrains.annotations.NotNull java.lang.CharSequence r10) {
            r5 = this;
            java.lang.String r0 = "separator"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "postfix"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "truncated"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            long[] r7 = r5.content
            int r1 = r5._size
            r2 = 0
        L21:
            if (r2 >= r1) goto L36
            r3 = r7[r2]
            if (r2 != r9) goto L2b
            r0.append(r10)
            goto L39
        L2b:
            if (r2 == 0) goto L30
            r0.append(r6)
        L30:
            r0.append(r3)
            int r2 = r2 + 1
            goto L21
        L36:
            r0.append(r8)
        L39:
            java.lang.String r6 = r0.toString()
            java.lang.String r7 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.g0.o(r6, r7)
            return r6
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public final java.lang.String joinToString(@org.jetbrains.annotations.NotNull java.lang.CharSequence r6, @org.jetbrains.annotations.NotNull java.lang.CharSequence r7, @org.jetbrains.annotations.NotNull java.lang.CharSequence r8, int r9, @org.jetbrains.annotations.NotNull java.lang.CharSequence r10, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Long, ? extends java.lang.CharSequence> r11) {
            r5 = this;
            java.lang.String r0 = "separator"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "postfix"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "truncated"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            long[] r7 = r5.content
            int r1 = r5._size
            r2 = 0
        L26:
            if (r2 >= r1) goto L45
            r3 = r7[r2]
            if (r2 != r9) goto L30
            r0.append(r10)
            goto L48
        L30:
            if (r2 == 0) goto L35
            r0.append(r6)
        L35:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object r3 = r11.invoke(r3)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r0.append(r3)
            int r2 = r2 + 1
            goto L26
        L45:
            r0.append(r8)
        L48:
            java.lang.String r6 = r0.toString()
            java.lang.String r7 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.g0.o(r6, r7)
            return r6
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public final java.lang.String joinToString(@org.jetbrains.annotations.NotNull java.lang.CharSequence r6, @org.jetbrains.annotations.NotNull java.lang.CharSequence r7, @org.jetbrains.annotations.NotNull java.lang.CharSequence r8, int r9, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Long, ? extends java.lang.CharSequence> r10) {
            r5 = this;
            java.lang.String r0 = "separator"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "postfix"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            long[] r7 = r5.content
            int r1 = r5._size
            r2 = 0
        L21:
            if (r2 >= r1) goto L42
            r3 = r7[r2]
            if (r2 != r9) goto L2d
            java.lang.String r6 = "..."
            r0.append(r6)
            goto L45
        L2d:
            if (r2 == 0) goto L32
            r0.append(r6)
        L32:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object r3 = r10.invoke(r3)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r0.append(r3)
            int r2 = r2 + 1
            goto L21
        L42:
            r0.append(r8)
        L45:
            java.lang.String r6 = r0.toString()
            java.lang.String r7 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.g0.o(r6, r7)
            return r6
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public final java.lang.String joinToString(@org.jetbrains.annotations.NotNull java.lang.CharSequence r7, @org.jetbrains.annotations.NotNull java.lang.CharSequence r8, @org.jetbrains.annotations.NotNull java.lang.CharSequence r9, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Long, ? extends java.lang.CharSequence> r10) {
            r6 = this;
            java.lang.String r0 = "separator"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "postfix"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            long[] r8 = r6.content
            int r1 = r6._size
            r2 = 0
        L21:
            if (r2 >= r1) goto L43
            r3 = r8[r2]
            r5 = -1
            if (r2 != r5) goto L2e
            java.lang.String r7 = "..."
            r0.append(r7)
            goto L46
        L2e:
            if (r2 == 0) goto L33
            r0.append(r7)
        L33:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object r3 = r10.invoke(r3)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r0.append(r3)
            int r2 = r2 + 1
            goto L21
        L43:
            r0.append(r9)
        L46:
            java.lang.String r7 = r0.toString()
            java.lang.String r8 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.g0.o(r7, r8)
            return r7
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public final java.lang.String joinToString(@org.jetbrains.annotations.NotNull java.lang.CharSequence r7, @org.jetbrains.annotations.NotNull java.lang.CharSequence r8, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Long, ? extends java.lang.CharSequence> r9) {
            r6 = this;
            java.lang.String r0 = "separator"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            long[] r8 = r6.content
            int r1 = r6._size
            r2 = 0
        L1c:
            if (r2 >= r1) goto L3e
            r3 = r8[r2]
            r5 = -1
            if (r2 != r5) goto L29
            java.lang.String r7 = "..."
            r0.append(r7)
            goto L43
        L29:
            if (r2 == 0) goto L2e
            r0.append(r7)
        L2e:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object r3 = r9.invoke(r3)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r0.append(r3)
            int r2 = r2 + 1
            goto L1c
        L3e:
            java.lang.String r7 = ""
            r0.append(r7)
        L43:
            java.lang.String r7 = r0.toString()
            java.lang.String r8 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.g0.o(r7, r8)
            return r7
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public final java.lang.String joinToString(@org.jetbrains.annotations.NotNull java.lang.CharSequence r9, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Long, ? extends java.lang.CharSequence> r10) {
            r8 = this;
            java.lang.String r0 = "separator"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            r0.append(r1)
            long[] r2 = r8.content
            int r3 = r8._size
            r4 = 0
        L19:
            if (r4 >= r3) goto L3b
            r5 = r2[r4]
            r7 = -1
            if (r4 != r7) goto L26
            java.lang.String r9 = "..."
            r0.append(r9)
            goto L3e
        L26:
            if (r4 == 0) goto L2b
            r0.append(r9)
        L2b:
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.Object r5 = r10.invoke(r5)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r0.append(r5)
            int r4 = r4 + 1
            goto L19
        L3b:
            r0.append(r1)
        L3e:
            java.lang.String r9 = r0.toString()
            java.lang.String r10 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.g0.o(r9, r10)
            return r9
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public final java.lang.String joinToString(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Long, ? extends java.lang.CharSequence> r9) {
            r8 = this;
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            r0.append(r1)
            long[] r2 = r8.content
            int r3 = r8._size
            r4 = 0
        L14:
            if (r4 >= r3) goto L38
            r5 = r2[r4]
            r7 = -1
            if (r4 != r7) goto L21
            java.lang.String r9 = "..."
            r0.append(r9)
            goto L3b
        L21:
            if (r4 == 0) goto L28
            java.lang.String r7 = ", "
            r0.append(r7)
        L28:
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.Object r5 = r9.invoke(r5)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r0.append(r5)
            int r4 = r4 + 1
            goto L14
        L38:
            r0.append(r1)
        L3b:
            java.lang.String r9 = r0.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.g0.o(r9, r0)
            return r9
    }

    public final long last() {
            r3 = this;
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto Lf
            long[] r0 = r3.content
            int r1 = r3._size
            int r1 = r1 + (-1)
            r1 = r0[r1]
            return r1
        Lf:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "LongList is empty."
            r0.<init>(r1)
            throw r0
    }

    public final long last(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Long, java.lang.Boolean> r6) {
            r5 = this;
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r6, r0)
            long[] r0 = r5.content
            int r1 = r5._size
            int r1 = r1 + (-1)
        Lb:
            r2 = -1
            if (r2 >= r1) goto L24
            r2 = r0[r1]
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
            java.lang.Object r4 = r6.invoke(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L21
            return r2
        L21:
            int r1 = r1 + (-1)
            goto Lb
        L24:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException
            java.lang.String r0 = "LongList contains no element matching the predicate."
            r6.<init>(r0)
            throw r6
    }

    public final int lastIndexOf(long r6) {
            r5 = this;
            long[] r0 = r5.content
            int r1 = r5._size
            int r1 = r1 + (-1)
        L6:
            r2 = -1
            if (r2 >= r1) goto L13
            r2 = r0[r1]
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 != 0) goto L10
            return r1
        L10:
            int r1 = r1 + (-1)
            goto L6
        L13:
            return r2
    }

    public final boolean none() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            return r0
    }

    public final boolean reversedAny(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Long, java.lang.Boolean> r6) {
            r5 = this;
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r6, r0)
            long[] r0 = r5.content
            int r1 = r5._size
            r2 = 1
            int r1 = r1 - r2
        Lb:
            r3 = -1
            if (r3 >= r1) goto L24
            r3 = r0[r1]
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object r3 = r6.invoke(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L21
            return r2
        L21:
            int r1 = r1 + (-1)
            goto Lb
        L24:
            r6 = 0
            return r6
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r8 = this;
            r6 = 25
            r7 = 0
            r1 = 0
            java.lang.String r2 = "["
            java.lang.String r3 = "]"
            r4 = 0
            r5 = 0
            r0 = r8
            java.lang.String r1 = joinToString$default(r0, r1, r2, r3, r4, r5, r6, r7)
            return r1
    }
}
