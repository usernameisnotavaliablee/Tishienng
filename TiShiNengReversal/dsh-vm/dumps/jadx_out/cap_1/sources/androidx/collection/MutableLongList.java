package androidx.collection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nLongList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongList.kt\nandroidx/collection/MutableLongList\n+ 2 LongList.kt\nandroidx/collection/LongList\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,969:1\n549#1:970\n70#2:971\n253#2,6:974\n70#2:980\n70#2:981\n70#2:982\n70#2:989\n70#2:990\n13607#3,2:972\n1675#3,6:983\n*S KotlinDebug\n*F\n+ 1 LongList.kt\nandroidx/collection/MutableLongList\n*L\n692#1:970\n753#1:971\n772#1:974,6\n783#1:980\n787#1:981\n834#1:982\n850#1:989\n869#1:990\n763#1:972,2\n836#1:983,6\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class MutableLongList extends androidx.collection.LongList {
    public MutableLongList() {
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            r3.<init>(r2, r0, r1)
            return
    }

    public MutableLongList(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public /* synthetic */ MutableLongList(int r1, int r2, kotlin.jvm.internal.v r3) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L6
            r1 = 16
        L6:
            r0.<init>(r1)
            return
    }

    public static /* synthetic */ void trim$default(androidx.collection.MutableLongList r0, int r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            int r1 = r0._size
        L6:
            r0.trim(r1)
            return
    }

    public final void add(@androidx.annotation.IntRange(from = 0) int r4, long r5) {
            r3 = this;
            if (r4 < 0) goto L1f
            int r0 = r3._size
            if (r4 > r0) goto L1f
            int r0 = r0 + 1
            r3.ensureCapacity(r0)
            long[] r0 = r3.content
            int r1 = r3._size
            if (r4 == r1) goto L16
            int r2 = r4 + 1
            kotlin.collections.n.A0(r0, r0, r2, r4, r1)
        L16:
            r0[r4] = r5
            int r4 = r3._size
            int r4 = r4 + 1
            r3._size = r4
            return
        L1f:
            java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Index "
            r6.append(r0)
            r6.append(r4)
            java.lang.String r4 = " must be in 0.."
            r6.append(r4)
            int r4 = r3._size
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5.<init>(r4)
            throw r5
    }

    public final boolean add(long r4) {
            r3 = this;
            int r0 = r3._size
            r1 = 1
            int r0 = r0 + r1
            r3.ensureCapacity(r0)
            long[] r0 = r3.content
            int r2 = r3._size
            r0[r2] = r4
            int r2 = r2 + r1
            r3._size = r2
            return r1
    }

    public final boolean addAll(@androidx.annotation.IntRange(from = 0) int r5, @org.jetbrains.annotations.NotNull androidx.collection.LongList r6) {
            r4 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r6, r0)
            if (r5 < 0) goto L37
            int r0 = r4._size
            if (r5 > r0) goto L37
            boolean r0 = r6.isEmpty()
            r1 = 0
            if (r0 == 0) goto L13
            return r1
        L13:
            int r0 = r4._size
            int r2 = r6._size
            int r0 = r0 + r2
            r4.ensureCapacity(r0)
            long[] r0 = r4.content
            int r2 = r4._size
            if (r5 == r2) goto L27
            int r3 = r6._size
            int r3 = r3 + r5
            kotlin.collections.n.A0(r0, r0, r3, r5, r2)
        L27:
            long[] r2 = r6.content
            int r3 = r6._size
            kotlin.collections.n.A0(r2, r0, r5, r1, r3)
            int r5 = r4._size
            int r6 = r6._size
            int r5 = r5 + r6
            r4._size = r5
            r5 = 1
            return r5
        L37:
            java.lang.IndexOutOfBoundsException r6 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Index "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = " must be in 0.."
            r0.append(r5)
            int r5 = r4._size
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
    }

    public final boolean addAll(@androidx.annotation.IntRange(from = 0) int r9, @org.jetbrains.annotations.NotNull long[] r10) {
            r8 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r10, r0)
            if (r9 < 0) goto L32
            int r0 = r8._size
            if (r9 > r0) goto L32
            int r1 = r10.length
            if (r1 != 0) goto L10
            r9 = 0
            return r9
        L10:
            int r1 = r10.length
            int r0 = r0 + r1
            r8.ensureCapacity(r0)
            long[] r2 = r8.content
            int r0 = r8._size
            if (r9 == r0) goto L20
            int r1 = r10.length
            int r1 = r1 + r9
            kotlin.collections.n.A0(r2, r2, r1, r9, r0)
        L20:
            r6 = 12
            r7 = 0
            r4 = 0
            r5 = 0
            r3 = r9
            r1 = r10
            kotlin.collections.n.J0(r1, r2, r3, r4, r5, r6, r7)
            int r9 = r8._size
            int r10 = r1.length
            int r9 = r9 + r10
            r8._size = r9
            r9 = 1
            return r9
        L32:
            r3 = r9
            java.lang.IndexOutOfBoundsException r9 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "Index "
            r10.append(r0)
            r10.append(r3)
            java.lang.String r0 = " must be in 0.."
            r10.append(r0)
            int r0 = r8._size
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
    }

    public final boolean addAll(@org.jetbrains.annotations.NotNull androidx.collection.LongList r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r1._size
            boolean r2 = r1.addAll(r0, r2)
            return r2
    }

    public final boolean addAll(@org.jetbrains.annotations.NotNull long[] r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r1._size
            boolean r2 = r1.addAll(r0, r2)
            return r2
    }

    public final void clear() {
            r1 = this;
            r0 = 0
            r1._size = r0
            return
    }

    public final void ensureCapacity(int r3) {
            r2 = this;
            long[] r0 = r2.content
            int r1 = r0.length
            if (r1 >= r3) goto L19
            int r1 = r0.length
            int r1 = r1 * 3
            int r1 = r1 / 2
            int r3 = java.lang.Math.max(r3, r1)
            long[] r3 = java.util.Arrays.copyOf(r0, r3)
            java.lang.String r0 = "copyOf(this, newSize)"
            kotlin.jvm.internal.g0.o(r3, r0)
            r2.content = r3
        L19:
            return
    }

    public final int getCapacity() {
            r1 = this;
            long[] r0 = r1.content
            int r0 = r0.length
            return r0
    }

    public final void minusAssign(long r1) {
            r0 = this;
            r0.remove(r1)
            return
    }

    public final void minusAssign(@org.jetbrains.annotations.NotNull androidx.collection.LongList r5) {
            r4 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r5, r0)
            long[] r0 = r5.content
            int r5 = r5._size
            r1 = 0
        La:
            if (r1 >= r5) goto L14
            r2 = r0[r1]
            r4.remove(r2)
            int r1 = r1 + 1
            goto La
        L14:
            return
    }

    public final void minusAssign(@org.jetbrains.annotations.NotNull long[] r5) {
            r4 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r5, r0)
            int r0 = r5.length
            r1 = 0
        L7:
            if (r1 >= r0) goto L11
            r2 = r5[r1]
            r4.remove(r2)
            int r1 = r1 + 1
            goto L7
        L11:
            return
    }

    public final void plusAssign(long r1) {
            r0 = this;
            r0.add(r1)
            return
    }

    public final void plusAssign(@org.jetbrains.annotations.NotNull androidx.collection.LongList r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r1._size
            r1.addAll(r0, r2)
            return
    }

    public final void plusAssign(@org.jetbrains.annotations.NotNull long[] r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r1._size
            r1.addAll(r0, r2)
            return
    }

    public final boolean remove(long r1) {
            r0 = this;
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto Lb
            r0.removeAt(r1)
            r1 = 1
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public final boolean removeAll(@org.jetbrains.annotations.NotNull androidx.collection.LongList r8) {
            r7 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r8, r0)
            int r0 = r7._size
            int r1 = r8._size
            r2 = 1
            int r1 = r1 - r2
            r3 = 0
            if (r1 < 0) goto L1b
            r4 = 0
        Lf:
            long r5 = r8.get(r4)
            r7.remove(r5)
            if (r4 == r1) goto L1b
            int r4 = r4 + 1
            goto Lf
        L1b:
            int r8 = r7._size
            if (r0 == r8) goto L20
            return r2
        L20:
            return r3
    }

    public final boolean removeAll(@org.jetbrains.annotations.NotNull long[] r7) {
            r6 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r7, r0)
            int r0 = r6._size
            int r1 = r7.length
            r2 = 0
            r3 = 0
        La:
            if (r3 >= r1) goto L14
            r4 = r7[r3]
            r6.remove(r4)
            int r3 = r3 + 1
            goto La
        L14:
            int r7 = r6._size
            if (r0 == r7) goto L1a
            r7 = 1
            return r7
        L1a:
            return r2
    }

    public final long removeAt(@androidx.annotation.IntRange(from = 0) int r6) {
            r5 = this;
            if (r6 < 0) goto L1a
            int r0 = r5._size
            if (r6 >= r0) goto L1a
            long[] r1 = r5.content
            r2 = r1[r6]
            int r4 = r0 + (-1)
            if (r6 == r4) goto L13
            int r4 = r6 + 1
            kotlin.collections.n.A0(r1, r1, r6, r4, r0)
        L13:
            int r6 = r5._size
            int r6 = r6 + (-1)
            r5._size = r6
            return r2
        L1a:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Index "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = " must be in 0.."
            r1.append(r6)
            int r6 = r5._size
            int r6 = r6 + (-1)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
    }

    public final void removeRange(@androidx.annotation.IntRange(from = 0) int r4, @androidx.annotation.IntRange(from = 0) int r5) {
            r3 = this;
            java.lang.String r0 = "Start ("
            if (r4 < 0) goto L40
            int r1 = r3._size
            if (r4 > r1) goto L40
            if (r5 < 0) goto L40
            if (r5 > r1) goto L40
            if (r5 < r4) goto L1e
            if (r5 == r4) goto L1d
            if (r5 >= r1) goto L17
            long[] r0 = r3.content
            kotlin.collections.n.A0(r0, r0, r4, r5, r1)
        L17:
            int r0 = r3._size
            int r5 = r5 - r4
            int r0 = r0 - r5
            r3._size = r0
        L1d:
            return
        L1e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r4)
            java.lang.String r4 = ") is more than end ("
            r2.append(r4)
            r2.append(r5)
            r4 = 41
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4)
            throw r1
        L40:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r4)
            java.lang.String r4 = ") and end ("
            r2.append(r4)
            r2.append(r5)
            java.lang.String r4 = ") must be in 0.."
            r2.append(r4)
            int r4 = r3._size
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4)
            throw r1
    }

    public final boolean retainAll(@org.jetbrains.annotations.NotNull androidx.collection.LongList r6) {
            r5 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r6, r0)
            int r0 = r5._size
            long[] r1 = r5.content
            int r2 = r0 + (-1)
        Lb:
            r3 = -1
            if (r3 >= r2) goto L1c
            r3 = r1[r2]
            boolean r3 = r6.contains(r3)
            if (r3 != 0) goto L19
            r5.removeAt(r2)
        L19:
            int r2 = r2 + (-1)
            goto Lb
        L1c:
            int r6 = r5._size
            if (r0 == r6) goto L22
            r6 = 1
            return r6
        L22:
            r6 = 0
            return r6
    }

    public final boolean retainAll(@org.jetbrains.annotations.NotNull long[] r12) {
            r11 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r12, r0)
            int r0 = r11._size
            long[] r1 = r11.content
            int r2 = r0 + (-1)
        Lb:
            r3 = 0
            r4 = -1
            if (r4 >= r2) goto L27
            r5 = r1[r2]
            int r7 = r12.length
        L12:
            if (r3 >= r7) goto L1f
            r8 = r12[r3]
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 != 0) goto L1c
            r4 = r3
            goto L1f
        L1c:
            int r3 = r3 + 1
            goto L12
        L1f:
            if (r4 >= 0) goto L24
            r11.removeAt(r2)
        L24:
            int r2 = r2 + (-1)
            goto Lb
        L27:
            int r12 = r11._size
            if (r0 == r12) goto L2d
            r12 = 1
            return r12
        L2d:
            return r3
    }

    public final long set(@androidx.annotation.IntRange(from = 0) int r4, long r5) {
            r3 = this;
            if (r4 < 0) goto Ld
            int r0 = r3._size
            if (r4 >= r0) goto Ld
            long[] r0 = r3.content
            r1 = r0[r4]
            r0[r4] = r5
            return r1
        Ld:
            java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "set index "
            r6.append(r0)
            r6.append(r4)
            java.lang.String r4 = " must be between 0 .. "
            r6.append(r4)
            int r4 = r3._size
            int r4 = r4 + (-1)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5.<init>(r4)
            throw r5
    }

    public final void sort() {
            r3 = this;
            long[] r0 = r3.content
            r1 = 0
            int r2 = r3._size
            kotlin.collections.n.R3(r0, r1, r2)
            return
    }

    public final void sortDescending() {
            r3 = this;
            long[] r0 = r3.content
            r1 = 0
            int r2 = r3._size
            kotlin.collections.n.Vu(r0, r1, r2)
            return
    }

    public final void trim(int r3) {
            r2 = this;
            int r0 = r2._size
            int r3 = java.lang.Math.max(r3, r0)
            long[] r0 = r2.content
            int r1 = r0.length
            if (r1 <= r3) goto L16
            long[] r3 = java.util.Arrays.copyOf(r0, r3)
            java.lang.String r0 = "copyOf(this, newSize)"
            kotlin.jvm.internal.g0.o(r3, r0)
            r2.content = r3
        L16:
            return
    }
}
