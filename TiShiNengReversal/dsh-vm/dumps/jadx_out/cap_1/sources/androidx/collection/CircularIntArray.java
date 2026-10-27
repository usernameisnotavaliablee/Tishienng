package androidx.collection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCircularIntArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CircularIntArray.kt\nandroidx/collection/CircularIntArray\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CollectionPlatformUtils.jvm.kt\nandroidx/collection/CollectionPlatformUtils\n*L\n1#1,213:1\n1#2:214\n26#3:215\n26#3:216\n26#3:217\n26#3:218\n26#3:219\n26#3:220\n26#3:221\n*S KotlinDebug\n*F\n+ 1 CircularIntArray.kt\nandroidx/collection/CircularIntArray\n*L\n100#1:215\n113#1:216\n139#1:217\n156#1:218\n169#1:219\n181#1:220\n193#1:221\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class CircularIntArray {
    private int capacityBitmask;

    @org.jetbrains.annotations.NotNull
    private int[] elements;
    private int head;
    private int tail;

    @kotlin.jvm.JvmOverloads
    public CircularIntArray() {
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            r3.<init>(r2, r0, r1)
            return
    }

    @kotlin.jvm.JvmOverloads
    public CircularIntArray(int r3) {
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
            int[] r3 = new int[r3]
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

    public /* synthetic */ CircularIntArray(int r1, int r2, kotlin.jvm.internal.v r3) {
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
            int[] r0 = r7.elements
            int r1 = r0.length
            int r2 = r7.head
            int r3 = r1 - r2
            int r4 = r1 << 1
            if (r4 < 0) goto L23
            int[] r5 = new int[r4]
            r6 = 0
            kotlin.collections.n.z0(r0, r5, r6, r2, r1)
            int[] r0 = r7.elements
            int r2 = r7.head
            kotlin.collections.n.z0(r0, r5, r3, r6, r2)
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

    public final void addFirst(int r3) {
            r2 = this;
            int r0 = r2.head
            int r0 = r0 + (-1)
            int r1 = r2.capacityBitmask
            r0 = r0 & r1
            r2.head = r0
            int[] r1 = r2.elements
            r1[r0] = r3
            int r3 = r2.tail
            if (r0 != r3) goto L14
            r2.doubleCapacity()
        L14:
            return
    }

    public final void addLast(int r3) {
            r2 = this;
            int[] r0 = r2.elements
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
            int r0 = r1.head
            r1.tail = r0
            return
    }

    public final int get(int r3) {
            r2 = this;
            if (r3 < 0) goto L13
            int r0 = r2.size()
            if (r3 >= r0) goto L13
            int[] r0 = r2.elements
            int r1 = r2.head
            int r1 = r1 + r3
            int r3 = r2.capacityBitmask
            r3 = r3 & r1
            r3 = r0[r3]
            return r3
        L13:
            androidx.collection.CollectionPlatformUtils r3 = androidx.collection.CollectionPlatformUtils.INSTANCE
            java.lang.ArrayIndexOutOfBoundsException r3 = new java.lang.ArrayIndexOutOfBoundsException
            r3.<init>()
            throw r3
    }

    public final int getFirst() {
            r2 = this;
            int r0 = r2.head
            int r1 = r2.tail
            if (r0 == r1) goto Lb
            int[] r1 = r2.elements
            r0 = r1[r0]
            return r0
        Lb:
            androidx.collection.CollectionPlatformUtils r0 = androidx.collection.CollectionPlatformUtils.INSTANCE
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    public final int getLast() {
            r3 = this;
            int r0 = r3.head
            int r1 = r3.tail
            if (r0 == r1) goto L10
            int[] r0 = r3.elements
            int r1 = r1 + (-1)
            int r2 = r3.capacityBitmask
            r1 = r1 & r2
            r0 = r0[r1]
            return r0
        L10:
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

    public final int popFirst() {
            r3 = this;
            int r0 = r3.head
            int r1 = r3.tail
            if (r0 == r1) goto L12
            int[] r1 = r3.elements
            r1 = r1[r0]
            int r0 = r0 + 1
            int r2 = r3.capacityBitmask
            r0 = r0 & r2
            r3.head = r0
            return r1
        L12:
            androidx.collection.CollectionPlatformUtils r0 = androidx.collection.CollectionPlatformUtils.INSTANCE
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    public final int popLast() {
            r2 = this;
            int r0 = r2.head
            int r1 = r2.tail
            if (r0 == r1) goto L12
            int r1 = r1 + (-1)
            int r0 = r2.capacityBitmask
            r0 = r0 & r1
            int[] r1 = r2.elements
            r1 = r1[r0]
            r2.tail = r0
            return r1
        L12:
            androidx.collection.CollectionPlatformUtils r0 = androidx.collection.CollectionPlatformUtils.INSTANCE
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    public final void removeFromEnd(int r2) {
            r1 = this;
            if (r2 > 0) goto L3
            return
        L3:
            int r0 = r1.size()
            if (r2 > r0) goto L12
            int r0 = r1.tail
            int r0 = r0 - r2
            int r2 = r1.capacityBitmask
            r2 = r2 & r0
            r1.tail = r2
            return
        L12:
            androidx.collection.CollectionPlatformUtils r2 = androidx.collection.CollectionPlatformUtils.INSTANCE
            java.lang.ArrayIndexOutOfBoundsException r2 = new java.lang.ArrayIndexOutOfBoundsException
            r2.<init>()
            throw r2
    }

    public final void removeFromStart(int r2) {
            r1 = this;
            if (r2 > 0) goto L3
            return
        L3:
            int r0 = r1.size()
            if (r2 > r0) goto L12
            int r0 = r1.head
            int r0 = r0 + r2
            int r2 = r1.capacityBitmask
            r2 = r2 & r0
            r1.head = r2
            return
        L12:
            androidx.collection.CollectionPlatformUtils r2 = androidx.collection.CollectionPlatformUtils.INSTANCE
            java.lang.ArrayIndexOutOfBoundsException r2 = new java.lang.ArrayIndexOutOfBoundsException
            r2.<init>()
            throw r2
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
