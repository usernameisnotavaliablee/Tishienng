package androidx.collection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nIntList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntList.kt\nandroidx/collection/MutableIntList\n+ 2 IntList.kt\nandroidx/collection/IntList\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,969:1\n549#1:970\n70#2:971\n253#2,6:974\n70#2:980\n70#2:981\n70#2:982\n70#2:989\n70#2:990\n13600#3,2:972\n1663#3,6:983\n*S KotlinDebug\n*F\n+ 1 IntList.kt\nandroidx/collection/MutableIntList\n*L\n692#1:970\n753#1:971\n772#1:974,6\n783#1:980\n787#1:981\n834#1:982\n850#1:989\n869#1:990\n763#1:972,2\n836#1:983,6\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class MutableIntList extends androidx.collection.IntList {
    public MutableIntList() {
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            r3.<init>(r2, r0, r1)
            return
    }

    public MutableIntList(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public /* synthetic */ MutableIntList(int r1, int r2, kotlin.jvm.internal.v r3) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L6
            r1 = 16
        L6:
            r0.<init>(r1)
            return
    }

    public static /* synthetic */ void trim$default(androidx.collection.MutableIntList r0, int r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            int r1 = r0._size
        L6:
            r0.trim(r1)
            return
    }

    public final void add(@androidx.annotation.IntRange(from = 0) int r4, int r5) {
            r3 = this;
            if (r4 < 0) goto L1f
            int r0 = r3._size
            if (r4 > r0) goto L1f
            int r0 = r0 + 1
            r3.ensureCapacity(r0)
            int[] r0 = r3.content
            int r1 = r3._size
            if (r4 == r1) goto L16
            int r2 = r4 + 1
            kotlin.collections.n.z0(r0, r0, r2, r4, r1)
        L16:
            r0[r4] = r5
            int r4 = r3._size
            int r4 = r4 + 1
            r3._size = r4
            return
        L1f:
            java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Index "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = " must be in 0.."
            r0.append(r4)
            int r4 = r3._size
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            throw r5
    }

    public final boolean add(int r4) {
            r3 = this;
            int r0 = r3._size
            r1 = 1
            int r0 = r0 + r1
            r3.ensureCapacity(r0)
            int[] r0 = r3.content
            int r2 = r3._size
            r0[r2] = r4
            int r2 = r2 + r1
            r3._size = r2
            return r1
    }

    public final boolean addAll(@androidx.annotation.IntRange(from = 0) int r5, @org.jetbrains.annotations.NotNull androidx.collection.IntList r6) {
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
            int[] r0 = r4.content
            int r2 = r4._size
            if (r5 == r2) goto L27
            int r3 = r6._size
            int r3 = r3 + r5
            kotlin.collections.n.z0(r0, r0, r3, r5, r2)
        L27:
            int[] r2 = r6.content
            int r3 = r6._size
            kotlin.collections.n.z0(r2, r0, r5, r1, r3)
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

    public final boolean addAll(@androidx.annotation.IntRange(from = 0) int r9, @org.jetbrains.annotations.NotNull int[] r10) {
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
            int[] r2 = r8.content
            int r0 = r8._size
            if (r9 == r0) goto L20
            int r1 = r10.length
            int r1 = r1 + r9
            kotlin.collections.n.z0(r2, r2, r1, r9, r0)
        L20:
            r6 = 12
            r7 = 0
            r4 = 0
            r5 = 0
            r3 = r9
            r1 = r10
            kotlin.collections.n.I0(r1, r2, r3, r4, r5, r6, r7)
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

    public final boolean addAll(@org.jetbrains.annotations.NotNull androidx.collection.IntList r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r1._size
            boolean r2 = r1.addAll(r0, r2)
            return r2
    }

    public final boolean addAll(@org.jetbrains.annotations.NotNull int[] r2) {
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
            int[] r0 = r2.content
            int r1 = r0.length
            if (r1 >= r3) goto L19
            int r1 = r0.length
            int r1 = r1 * 3
            int r1 = r1 / 2
            int r3 = java.lang.Math.max(r3, r1)
            int[] r3 = java.util.Arrays.copyOf(r0, r3)
            java.lang.String r0 = "copyOf(this, newSize)"
            kotlin.jvm.internal.g0.o(r3, r0)
            r2.content = r3
        L19:
            return
    }

    public final int getCapacity() {
            r1 = this;
            int[] r0 = r1.content
            int r0 = r0.length
            return r0
    }

    public final void minusAssign(int r1) {
            r0 = this;
            r0.remove(r1)
            return
    }

    public final void minusAssign(@org.jetbrains.annotations.NotNull androidx.collection.IntList r4) {
            r3 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r4, r0)
            int[] r0 = r4.content
            int r4 = r4._size
            r1 = 0
        La:
            if (r1 >= r4) goto L14
            r2 = r0[r1]
            r3.remove(r2)
            int r1 = r1 + 1
            goto La
        L14:
            return
    }

    public final void minusAssign(@org.jetbrains.annotations.NotNull int[] r4) {
            r3 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r4.length
            r1 = 0
        L7:
            if (r1 >= r0) goto L11
            r2 = r4[r1]
            r3.remove(r2)
            int r1 = r1 + 1
            goto L7
        L11:
            return
    }

    public final void plusAssign(int r1) {
            r0 = this;
            r0.add(r1)
            return
    }

    public final void plusAssign(@org.jetbrains.annotations.NotNull androidx.collection.IntList r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r1._size
            r1.addAll(r0, r2)
            return
    }

    public final void plusAssign(@org.jetbrains.annotations.NotNull int[] r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r1._size
            r1.addAll(r0, r2)
            return
    }

    public final boolean remove(int r1) {
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

    public final boolean removeAll(@org.jetbrains.annotations.NotNull androidx.collection.IntList r7) {
            r6 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r7, r0)
            int r0 = r6._size
            int r1 = r7._size
            r2 = 1
            int r1 = r1 - r2
            r3 = 0
            if (r1 < 0) goto L1b
            r4 = 0
        Lf:
            int r5 = r7.get(r4)
            r6.remove(r5)
            if (r4 == r1) goto L1b
            int r4 = r4 + 1
            goto Lf
        L1b:
            int r7 = r6._size
            if (r0 == r7) goto L20
            return r2
        L20:
            return r3
    }

    public final boolean removeAll(@org.jetbrains.annotations.NotNull int[] r6) {
            r5 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r6, r0)
            int r0 = r5._size
            int r1 = r6.length
            r2 = 0
            r3 = 0
        La:
            if (r3 >= r1) goto L14
            r4 = r6[r3]
            r5.remove(r4)
            int r3 = r3 + 1
            goto La
        L14:
            int r6 = r5._size
            if (r0 == r6) goto L1a
            r6 = 1
            return r6
        L1a:
            return r2
    }

    public final int removeAt(@androidx.annotation.IntRange(from = 0) int r5) {
            r4 = this;
            if (r5 < 0) goto L1a
            int r0 = r4._size
            if (r5 >= r0) goto L1a
            int[] r1 = r4.content
            r2 = r1[r5]
            int r3 = r0 + (-1)
            if (r5 == r3) goto L13
            int r3 = r5 + 1
            kotlin.collections.n.z0(r1, r1, r5, r3, r0)
        L13:
            int r5 = r4._size
            int r5 = r5 + (-1)
            r4._size = r5
            return r2
        L1a:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Index "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = " must be in 0.."
            r1.append(r5)
            int r5 = r4._size
            int r5 = r5 + (-1)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
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
            int[] r0 = r3.content
            kotlin.collections.n.z0(r0, r0, r4, r5, r1)
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

    public final boolean retainAll(@org.jetbrains.annotations.NotNull androidx.collection.IntList r5) {
            r4 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r5, r0)
            int r0 = r4._size
            int[] r1 = r4.content
            int r2 = r0 + (-1)
        Lb:
            r3 = -1
            if (r3 >= r2) goto L1c
            r3 = r1[r2]
            boolean r3 = r5.contains(r3)
            if (r3 != 0) goto L19
            r4.removeAt(r2)
        L19:
            int r2 = r2 + (-1)
            goto Lb
        L1c:
            int r5 = r4._size
            if (r0 == r5) goto L22
            r5 = 1
            return r5
        L22:
            r5 = 0
            return r5
    }

    public final boolean retainAll(@org.jetbrains.annotations.NotNull int[] r9) {
            r8 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r9, r0)
            int r0 = r8._size
            int[] r1 = r8.content
            int r2 = r0 + (-1)
        Lb:
            r3 = 0
            r4 = -1
            if (r4 >= r2) goto L25
            r5 = r1[r2]
            int r6 = r9.length
        L12:
            if (r3 >= r6) goto L1d
            r7 = r9[r3]
            if (r7 != r5) goto L1a
            r4 = r3
            goto L1d
        L1a:
            int r3 = r3 + 1
            goto L12
        L1d:
            if (r4 >= 0) goto L22
            r8.removeAt(r2)
        L22:
            int r2 = r2 + (-1)
            goto Lb
        L25:
            int r9 = r8._size
            if (r0 == r9) goto L2b
            r9 = 1
            return r9
        L2b:
            return r3
    }

    public final int set(@androidx.annotation.IntRange(from = 0) int r3, int r4) {
            r2 = this;
            if (r3 < 0) goto Ld
            int r0 = r2._size
            if (r3 >= r0) goto Ld
            int[] r0 = r2.content
            r1 = r0[r3]
            r0[r3] = r4
            return r1
        Ld:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "set index "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " must be between 0 .. "
            r0.append(r3)
            int r3 = r2._size
            int r3 = r3 + (-1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }

    public final void sort() {
            r3 = this;
            int[] r0 = r3.content
            r1 = 0
            int r2 = r3._size
            kotlin.collections.n.P3(r0, r1, r2)
            return
    }

    public final void sortDescending() {
            r3 = this;
            int[] r0 = r3.content
            r1 = 0
            int r2 = r3._size
            kotlin.collections.n.Tu(r0, r1, r2)
            return
    }

    public final void trim(int r3) {
            r2 = this;
            int r0 = r2._size
            int r3 = java.lang.Math.max(r3, r0)
            int[] r0 = r2.content
            int r1 = r0.length
            if (r1 <= r3) goto L16
            int[] r3 = java.util.Arrays.copyOf(r0, r3)
            java.lang.String r0 = "copyOf(this, newSize)"
            kotlin.jvm.internal.g0.o(r3, r0)
            r2.content = r3
        L16:
            return
    }
}
