package androidx.collection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCircularArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CircularArray.kt\nandroidx/collection/CircularArray\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CollectionPlatformUtils.jvm.kt\nandroidx/collection/CollectionPlatformUtils\n*L\n1#1,270:1\n1#2:271\n26#3:272\n26#3:273\n26#3:274\n26#3:275\n26#3:276\n26#3:277\n26#3:278\n*S KotlinDebug\n*F\n+ 1 CircularArray.kt\nandroidx/collection/CircularArray\n*L\n104#1:272\n122#1:273\n152#1:274\n187#1:275\n221#1:276\n235#1:277\n249#1:278\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class CircularArray<E> {
    private int capacityBitmask;

    @org.jetbrains.annotations.NotNull
    private E[] elements;
    private int head;
    private int tail;

    @kotlin.jvm.JvmOverloads
    public CircularArray() {
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            r3.<init>(r2, r0, r1)
            return
    }

    @kotlin.jvm.JvmOverloads
    public CircularArray(int r3) {
            r2 = this;
            r2.<init>()
            r0 = 1
            if (r3 < r0) goto L28
            r1 = 1073741824(0x40000000, float:2.0)
            if (r3 > r1) goto L20
            int r1 = java.lang.Integer.bitCount(r3)
            if (r1 == r0) goto L17
            int r3 = r3 + (-1)
            int r3 = java.lang.Integer.highestOneBit(r3)
            int r3 = r3 << r0
        L17:
            int r0 = r3 + (-1)
            r2.capacityBitmask = r0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r2.elements = r3
            return
        L20:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "capacity must be <= 2^30"
            r3.<init>(r0)
            throw r3
        L28:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "capacity must be >= 1"
            r3.<init>(r0)
            throw r3
    }

    public /* synthetic */ CircularArray(int r1, int r2, kotlin.jvm.internal.v r3) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L6
            r1 = 8
        L6:
            r0.<init>(r1)
            return
    }

    private final void doubleCapacity() {
            r7 = this;
            E[] r0 = r7.elements
            int r1 = r0.length
            int r2 = r7.head
            int r3 = r1 - r2
            int r4 = r1 << 1
            if (r4 < 0) goto L23
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r6 = 0
            kotlin.collections.n.B0(r0, r5, r6, r2, r1)
            E[] r0 = r7.elements
            int r2 = r7.head
            kotlin.collections.n.B0(r0, r5, r3, r6, r2)
            r7.elements = r5
            r7.head = r6
            r7.tail = r1
            int r4 = r4 + (-1)
            r7.capacityBitmask = r4
            return
        L23:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Max array capacity exceeded"
            r0.<init>(r1)
            throw r0
    }

    public final void addFirst(E r3) {
            r2 = this;
            int r0 = r2.head
            int r0 = r0 + (-1)
            int r1 = r2.capacityBitmask
            r0 = r0 & r1
            r2.head = r0
            E[] r1 = r2.elements
            r1[r0] = r3
            int r3 = r2.tail
            if (r0 != r3) goto L14
            r2.doubleCapacity()
        L14:
            return
    }

    public final void addLast(E r3) {
            r2 = this;
            E[] r0 = r2.elements
            int r1 = r2.tail
            r0[r1] = r3
            int r1 = r1 + 1
            int r3 = r2.capacityBitmask
            r3 = r3 & r1
            r2.tail = r3
            int r0 = r2.head
            if (r3 != r0) goto L14
            r2.doubleCapacity()
        L14:
            return
    }

    public final void clear() {
            r1 = this;
            int r0 = r1.size()
            r1.removeFromStart(r0)
            return
    }

    public final E get(int r3) {
            r2 = this;
            if (r3 < 0) goto L16
            int r0 = r2.size()
            if (r3 >= r0) goto L16
            E[] r0 = r2.elements
            int r1 = r2.head
            int r1 = r1 + r3
            int r3 = r2.capacityBitmask
            r3 = r3 & r1
            r3 = r0[r3]
            kotlin.jvm.internal.g0.m(r3)
            return r3
        L16:
            androidx.collection.CollectionPlatformUtils r3 = androidx.collection.CollectionPlatformUtils.INSTANCE
            java.lang.ArrayIndexOutOfBoundsException r3 = new java.lang.ArrayIndexOutOfBoundsException
            r3.<init>()
            throw r3
    }

    public final E getFirst() {
            r2 = this;
            int r0 = r2.head
            int r1 = r2.tail
            if (r0 == r1) goto Le
            E[] r1 = r2.elements
            r0 = r1[r0]
            kotlin.jvm.internal.g0.m(r0)
            return r0
        Le:
            androidx.collection.CollectionPlatformUtils r0 = androidx.collection.CollectionPlatformUtils.INSTANCE
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    public final E getLast() {
            r3 = this;
            int r0 = r3.head
            int r1 = r3.tail
            if (r0 == r1) goto L13
            E[] r0 = r3.elements
            int r1 = r1 + (-1)
            int r2 = r3.capacityBitmask
            r1 = r1 & r2
            r0 = r0[r1]
            kotlin.jvm.internal.g0.m(r0)
            return r0
        L13:
            androidx.collection.CollectionPlatformUtils r0 = androidx.collection.CollectionPlatformUtils.INSTANCE
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    public final boolean isEmpty() {
            r2 = this;
            int r0 = r2.head
            int r1 = r2.tail
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public final E popFirst() {
            r4 = this;
            int r0 = r4.head
            int r1 = r4.tail
            if (r0 == r1) goto L15
            E[] r1 = r4.elements
            r2 = r1[r0]
            r3 = 0
            r1[r0] = r3
            int r0 = r0 + 1
            int r1 = r4.capacityBitmask
            r0 = r0 & r1
            r4.head = r0
            return r2
        L15:
            androidx.collection.CollectionPlatformUtils r0 = androidx.collection.CollectionPlatformUtils.INSTANCE
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    public final E popLast() {
            r4 = this;
            int r0 = r4.head
            int r1 = r4.tail
            if (r0 == r1) goto L15
            int r1 = r1 + (-1)
            int r0 = r4.capacityBitmask
            r0 = r0 & r1
            E[] r1 = r4.elements
            r2 = r1[r0]
            r3 = 0
            r1[r0] = r3
            r4.tail = r0
            return r2
        L15:
            androidx.collection.CollectionPlatformUtils r0 = androidx.collection.CollectionPlatformUtils.INSTANCE
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    public final void removeFromEnd(int r6) {
            r5 = this;
            if (r6 > 0) goto L3
            goto L39
        L3:
            int r0 = r5.size()
            if (r6 > r0) goto L3a
            int r0 = r5.tail
            if (r6 >= r0) goto L10
            int r1 = r0 - r6
            goto L11
        L10:
            r1 = 0
        L11:
            r2 = r1
        L12:
            r3 = 0
            if (r2 >= r0) goto L1c
            E[] r4 = r5.elements
            r4[r2] = r3
            int r2 = r2 + 1
            goto L12
        L1c:
            int r0 = r5.tail
            int r1 = r0 - r1
            int r6 = r6 - r1
            int r0 = r0 - r1
            r5.tail = r0
            if (r6 <= 0) goto L39
            E[] r0 = r5.elements
            int r0 = r0.length
            r5.tail = r0
            int r6 = r0 - r6
            r1 = r6
        L2e:
            if (r1 >= r0) goto L37
            E[] r2 = r5.elements
            r2[r1] = r3
            int r1 = r1 + 1
            goto L2e
        L37:
            r5.tail = r6
        L39:
            return
        L3a:
            androidx.collection.CollectionPlatformUtils r6 = androidx.collection.CollectionPlatformUtils.INSTANCE
            java.lang.ArrayIndexOutOfBoundsException r6 = new java.lang.ArrayIndexOutOfBoundsException
            r6.<init>()
            throw r6
    }

    public final void removeFromStart(int r5) {
            r4 = this;
            if (r5 > 0) goto L3
            goto L36
        L3:
            int r0 = r4.size()
            if (r5 > r0) goto L37
            E[] r0 = r4.elements
            int r0 = r0.length
            int r1 = r4.head
            int r2 = r0 - r1
            if (r5 >= r2) goto L14
            int r0 = r1 + r5
        L14:
            r2 = 0
            if (r1 >= r0) goto L1e
            E[] r3 = r4.elements
            r3[r1] = r2
            int r1 = r1 + 1
            goto L14
        L1e:
            int r1 = r4.head
            int r0 = r0 - r1
            int r5 = r5 - r0
            int r1 = r1 + r0
            int r0 = r4.capacityBitmask
            r0 = r0 & r1
            r4.head = r0
            if (r5 <= 0) goto L36
            r0 = 0
        L2b:
            if (r0 >= r5) goto L34
            E[] r1 = r4.elements
            r1[r0] = r2
            int r0 = r0 + 1
            goto L2b
        L34:
            r4.head = r5
        L36:
            return
        L37:
            androidx.collection.CollectionPlatformUtils r5 = androidx.collection.CollectionPlatformUtils.INSTANCE
            java.lang.ArrayIndexOutOfBoundsException r5 = new java.lang.ArrayIndexOutOfBoundsException
            r5.<init>()
            throw r5
    }

    public final int size() {
            r2 = this;
            int r0 = r2.tail
            int r1 = r2.head
            int r0 = r0 - r1
            int r1 = r2.capacityBitmask
            r0 = r0 & r1
            return r0
    }
}
