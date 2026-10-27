package androidx.collection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nObjectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectList.kt\nandroidx/collection/MutableObjectList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 6 ObjectList.kt\nandroidx/collection/ObjectList\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1618:1\n948#1,2:1641\n948#1,2:1652\n948#1,2:1656\n652#1:1659\n955#1,2:1662\n955#1,2:1669\n955#1,2:1691\n955#1,2:1701\n955#1,2:1704\n955#1,2:1708\n1864#2,3:1619\n1855#2:1651\n1856#2:1654\n1855#2:1703\n1856#2:1706\n267#3,4:1622\n237#3,7:1626\n248#3,3:1634\n251#3,2:1638\n272#3:1640\n273#3:1643\n254#3,6:1644\n274#3:1650\n267#3,4:1672\n237#3,7:1676\n248#3,3:1684\n251#3,2:1688\n272#3:1690\n273#3:1693\n254#3,6:1694\n274#3:1700\n1826#4:1633\n1688#4:1637\n1826#4:1683\n1688#4:1687\n1295#5:1655\n1296#5:1658\n1295#5:1707\n1296#5:1710\n80#6:1660\n305#6,4:1665\n310#6:1671\n75#6:1711\n75#6:1712\n75#6:1713\n75#6:1714\n75#6:1715\n75#6:1716\n75#6:1717\n75#6:1718\n13579#7:1661\n13580#7:1664\n*S KotlinDebug\n*F\n+ 1 ObjectList.kt\nandroidx/collection/MutableObjectList\n*L\n864#1:1641,2\n898#1:1652,2\n907#1:1656,2\n927#1:1659\n1050#1:1662,2\n1059#1:1669,2\n1068#1:1691,2\n1077#1:1701,2\n1086#1:1704,2\n1095#1:1708,2\n740#1:1619,3\n897#1:1651\n897#1:1654\n1085#1:1703\n1085#1:1706\n863#1:1622,4\n863#1:1626,7\n863#1:1634,3\n863#1:1638,2\n863#1:1640\n863#1:1643\n863#1:1644,6\n863#1:1650\n1067#1:1672,4\n1067#1:1676,7\n1067#1:1684,3\n1067#1:1688,2\n1067#1:1690\n1067#1:1693\n1067#1:1694,6\n1067#1:1700\n863#1:1633\n863#1:1637\n1067#1:1683\n1067#1:1687\n906#1:1655\n906#1:1658\n1094#1:1707\n1094#1:1710\n979#1:1660\n1058#1:1665,4\n1058#1:1671\n1105#1:1711\n1109#1:1712\n1159#1:1713\n1175#1:1714\n1191#1:1715\n1207#1:1716\n1223#1:1717\n1242#1:1718\n1049#1:1661\n1049#1:1664\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class MutableObjectList<E> extends androidx.collection.ObjectList<E> {

    @org.jetbrains.annotations.Nullable
    private androidx.collection.MutableObjectList.ObjectListMutableList<E> list;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class MutableObjectListIterator<T> implements java.util.ListIterator<T>, l3.f {

        @org.jetbrains.annotations.NotNull
        private final java.util.List<T> list;
        private int prevIndex;

        public MutableObjectListIterator(@org.jetbrains.annotations.NotNull java.util.List<T> r2, int r3) {
                r1 = this;
                java.lang.String r0 = "list"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>()
                r1.list = r2
                int r3 = r3 + (-1)
                r1.prevIndex = r3
                return
        }

        @Override // java.util.ListIterator
        public void add(T r3) {
                r2 = this;
                java.util.List<T> r0 = r2.list
                int r1 = r2.prevIndex
                int r1 = r1 + 1
                r2.prevIndex = r1
                r0.add(r1, r3)
                return
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
                r3 = this;
                int r0 = r3.prevIndex
                java.util.List<T> r1 = r3.list
                int r1 = r1.size()
                r2 = 1
                int r1 = r1 - r2
                if (r0 >= r1) goto Ld
                return r2
            Ld:
                r0 = 0
                return r0
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
                r1 = this;
                int r0 = r1.prevIndex
                if (r0 < 0) goto L6
                r0 = 1
                return r0
            L6:
                r0 = 0
                return r0
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
                r2 = this;
                java.util.List<T> r0 = r2.list
                int r1 = r2.prevIndex
                int r1 = r1 + 1
                r2.prevIndex = r1
                java.lang.Object r0 = r0.get(r1)
                return r0
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
                r1 = this;
                int r0 = r1.prevIndex
                int r0 = r0 + 1
                return r0
        }

        @Override // java.util.ListIterator
        public T previous() {
                r3 = this;
                java.util.List<T> r0 = r3.list
                int r1 = r3.prevIndex
                int r2 = r1 + (-1)
                r3.prevIndex = r2
                java.lang.Object r0 = r0.get(r1)
                return r0
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
                r1 = this;
                int r0 = r1.prevIndex
                return r0
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
                r2 = this;
                java.util.List<T> r0 = r2.list
                int r1 = r2.prevIndex
                r0.remove(r1)
                int r0 = r2.prevIndex
                int r0 = r0 + (-1)
                r2.prevIndex = r0
                return
        }

        @Override // java.util.ListIterator
        public void set(T r3) {
                r2 = this;
                java.util.List<T> r0 = r2.list
                int r1 = r2.prevIndex
                r0.set(r1, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class ObjectListMutableList<T> implements java.util.List<T>, l3.e {

        @org.jetbrains.annotations.NotNull
        private final androidx.collection.MutableObjectList<T> objectList;

        public ObjectListMutableList(@org.jetbrains.annotations.NotNull androidx.collection.MutableObjectList<T> r2) {
                r1 = this;
                java.lang.String r0 = "objectList"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>()
                r1.objectList = r2
                return
        }

        @Override // java.util.List
        public void add(int r2, T r3) {
                r1 = this;
                androidx.collection.MutableObjectList<T> r0 = r1.objectList
                r0.add(r2, r3)
                return
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T r2) {
                r1 = this;
                androidx.collection.MutableObjectList<T> r0 = r1.objectList
                boolean r2 = r0.add(r2)
                return r2
        }

        @Override // java.util.List
        public boolean addAll(int r2, @org.jetbrains.annotations.NotNull java.util.Collection<? extends T> r3) {
                r1 = this;
                java.lang.String r0 = "elements"
                kotlin.jvm.internal.g0.p(r3, r0)
                androidx.collection.MutableObjectList<T> r0 = r1.objectList
                boolean r2 = r0.addAll(r2, r3)
                return r2
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(@org.jetbrains.annotations.NotNull java.util.Collection<? extends T> r2) {
                r1 = this;
                java.lang.String r0 = "elements"
                kotlin.jvm.internal.g0.p(r2, r0)
                androidx.collection.MutableObjectList<T> r0 = r1.objectList
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                boolean r2 = r0.addAll(r2)
                return r2
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
                r1 = this;
                androidx.collection.MutableObjectList<T> r0 = r1.objectList
                r0.clear()
                return
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                androidx.collection.MutableObjectList<T> r0 = r1.objectList
                boolean r2 = r0.contains(r2)
                return r2
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(@org.jetbrains.annotations.NotNull java.util.Collection<? extends java.lang.Object> r2) {
                r1 = this;
                java.lang.String r0 = "elements"
                kotlin.jvm.internal.g0.p(r2, r0)
                androidx.collection.MutableObjectList<T> r0 = r1.objectList
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                boolean r2 = r0.containsAll(r2)
                return r2
        }

        @Override // java.util.List
        public T get(int r2) {
                r1 = this;
                androidx.collection.ObjectListKt.access$checkIndex(r1, r2)
                androidx.collection.MutableObjectList<T> r0 = r1.objectList
                java.lang.Object r2 = r0.get(r2)
                return r2
        }

        public int getSize() {
                r1 = this;
                androidx.collection.MutableObjectList<T> r0 = r1.objectList
                int r0 = r0.getSize()
                return r0
        }

        @Override // java.util.List
        public int indexOf(java.lang.Object r2) {
                r1 = this;
                androidx.collection.MutableObjectList<T> r0 = r1.objectList
                int r2 = r0.indexOf(r2)
                return r2
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
                r1 = this;
                androidx.collection.MutableObjectList<T> r0 = r1.objectList
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @org.jetbrains.annotations.NotNull
        public java.util.Iterator<T> iterator() {
                r2 = this;
                androidx.collection.MutableObjectList$MutableObjectListIterator r0 = new androidx.collection.MutableObjectList$MutableObjectListIterator
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        @Override // java.util.List
        public int lastIndexOf(java.lang.Object r2) {
                r1 = this;
                androidx.collection.MutableObjectList<T> r0 = r1.objectList
                int r2 = r0.lastIndexOf(r2)
                return r2
        }

        @Override // java.util.List
        @org.jetbrains.annotations.NotNull
        public java.util.ListIterator<T> listIterator() {
                r2 = this;
                androidx.collection.MutableObjectList$MutableObjectListIterator r0 = new androidx.collection.MutableObjectList$MutableObjectListIterator
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        @Override // java.util.List
        @org.jetbrains.annotations.NotNull
        public java.util.ListIterator<T> listIterator(int r2) {
                r1 = this;
                androidx.collection.MutableObjectList$MutableObjectListIterator r0 = new androidx.collection.MutableObjectList$MutableObjectListIterator
                r0.<init>(r1, r2)
                return r0
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int r1) {
                r0 = this;
                java.lang.Object r1 = r0.removeAt(r1)
                return r1
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(java.lang.Object r2) {
                r1 = this;
                androidx.collection.MutableObjectList<T> r0 = r1.objectList
                boolean r2 = r0.remove(r2)
                return r2
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(@org.jetbrains.annotations.NotNull java.util.Collection<? extends java.lang.Object> r2) {
                r1 = this;
                java.lang.String r0 = "elements"
                kotlin.jvm.internal.g0.p(r2, r0)
                androidx.collection.MutableObjectList<T> r0 = r1.objectList
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                boolean r2 = r0.removeAll(r2)
                return r2
        }

        public T removeAt(int r2) {
                r1 = this;
                androidx.collection.ObjectListKt.access$checkIndex(r1, r2)
                androidx.collection.MutableObjectList<T> r0 = r1.objectList
                java.lang.Object r2 = r0.removeAt(r2)
                return r2
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(@org.jetbrains.annotations.NotNull java.util.Collection<? extends java.lang.Object> r2) {
                r1 = this;
                java.lang.String r0 = "elements"
                kotlin.jvm.internal.g0.p(r2, r0)
                androidx.collection.MutableObjectList<T> r0 = r1.objectList
                boolean r2 = r0.retainAll(r2)
                return r2
        }

        @Override // java.util.List
        public T set(int r2, T r3) {
                r1 = this;
                androidx.collection.ObjectListKt.access$checkIndex(r1, r2)
                androidx.collection.MutableObjectList<T> r0 = r1.objectList
                java.lang.Object r2 = r0.set(r2, r3)
                return r2
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
                r1 = this;
                int r0 = r1.getSize()
                return r0
        }

        @Override // java.util.List
        @org.jetbrains.annotations.NotNull
        public java.util.List<T> subList(int r2, int r3) {
                r1 = this;
                androidx.collection.ObjectListKt.access$checkSubIndex(r1, r2, r3)
                androidx.collection.MutableObjectList$SubList r0 = new androidx.collection.MutableObjectList$SubList
                r0.<init>(r1, r2, r3)
                return r0
        }

        @Override // java.util.List, java.util.Collection
        public java.lang.Object[] toArray() {
                r1 = this;
                java.lang.Object[] r0 = kotlin.jvm.internal.u.a(r1)
                return r0
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] r2) {
                r1 = this;
                java.lang.String r0 = "array"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.Object[] r2 = kotlin.jvm.internal.u.b(r1, r2)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nObjectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectList.kt\nandroidx/collection/MutableObjectList$SubList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1618:1\n1855#2,2:1619\n1855#2,2:1621\n*S KotlinDebug\n*F\n+ 1 ObjectList.kt\nandroidx/collection/MutableObjectList$SubList\n*L\n1395#1:1619,2\n1477#1:1621,2\n*E\n"})
    private static final class SubList<T> implements java.util.List<T>, l3.e {
        private int end;

        @org.jetbrains.annotations.NotNull
        private final java.util.List<T> list;
        private final int start;

        public SubList(@org.jetbrains.annotations.NotNull java.util.List<T> r2, int r3, int r4) {
                r1 = this;
                java.lang.String r0 = "list"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>()
                r1.list = r2
                r1.start = r3
                r1.end = r4
                return
        }

        @Override // java.util.List
        public void add(int r3, T r4) {
                r2 = this;
                java.util.List<T> r0 = r2.list
                int r1 = r2.start
                int r3 = r3 + r1
                r0.add(r3, r4)
                int r3 = r2.end
                int r3 = r3 + 1
                r2.end = r3
                return
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T r4) {
                r3 = this;
                java.util.List<T> r0 = r3.list
                int r1 = r3.end
                int r2 = r1 + 1
                r3.end = r2
                r0.add(r1, r4)
                r4 = 1
                return r4
        }

        @Override // java.util.List
        public boolean addAll(int r3, @org.jetbrains.annotations.NotNull java.util.Collection<? extends T> r4) {
                r2 = this;
                java.lang.String r0 = "elements"
                kotlin.jvm.internal.g0.p(r4, r0)
                java.util.List<T> r0 = r2.list
                int r1 = r2.start
                int r3 = r3 + r1
                r0.addAll(r3, r4)
                int r3 = r2.end
                int r0 = r4.size()
                int r3 = r3 + r0
                r2.end = r3
                int r3 = r4.size()
                if (r3 <= 0) goto L1e
                r3 = 1
                return r3
            L1e:
                r3 = 0
                return r3
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(@org.jetbrains.annotations.NotNull java.util.Collection<? extends T> r3) {
                r2 = this;
                java.lang.String r0 = "elements"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.util.List<T> r0 = r2.list
                int r1 = r2.end
                r0.addAll(r1, r3)
                int r0 = r2.end
                int r1 = r3.size()
                int r0 = r0 + r1
                r2.end = r0
                int r3 = r3.size()
                if (r3 <= 0) goto L1d
                r3 = 1
                return r3
            L1d:
                r3 = 0
                return r3
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
                r3 = this;
                int r0 = r3.end
                int r0 = r0 + (-1)
                int r1 = r3.start
                if (r1 > r0) goto L12
            L8:
                java.util.List<T> r2 = r3.list
                r2.remove(r0)
                if (r0 == r1) goto L12
                int r0 = r0 + (-1)
                goto L8
            L12:
                int r0 = r3.start
                r3.end = r0
                return
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(java.lang.Object r4) {
                r3 = this;
                int r0 = r3.start
                int r1 = r3.end
            L4:
                if (r0 >= r1) goto L17
                java.util.List<T> r2 = r3.list
                java.lang.Object r2 = r2.get(r0)
                boolean r2 = kotlin.jvm.internal.g0.g(r2, r4)
                if (r2 == 0) goto L14
                r4 = 1
                return r4
            L14:
                int r0 = r0 + 1
                goto L4
            L17:
                r4 = 0
                return r4
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(@org.jetbrains.annotations.NotNull java.util.Collection<? extends java.lang.Object> r2) {
                r1 = this;
                java.lang.String r0 = "elements"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                java.util.Iterator r2 = r2.iterator()
            Lb:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L1d
                java.lang.Object r0 = r2.next()
                boolean r0 = r1.contains(r0)
                if (r0 != 0) goto Lb
                r2 = 0
                return r2
            L1d:
                r2 = 1
                return r2
        }

        @Override // java.util.List
        public T get(int r3) {
                r2 = this;
                androidx.collection.ObjectListKt.access$checkIndex(r2, r3)
                java.util.List<T> r0 = r2.list
                int r1 = r2.start
                int r3 = r3 + r1
                java.lang.Object r3 = r0.get(r3)
                return r3
        }

        public int getSize() {
                r2 = this;
                int r0 = r2.end
                int r1 = r2.start
                int r0 = r0 - r1
                return r0
        }

        @Override // java.util.List
        public int indexOf(java.lang.Object r4) {
                r3 = this;
                int r0 = r3.start
                int r1 = r3.end
            L4:
                if (r0 >= r1) goto L19
                java.util.List<T> r2 = r3.list
                java.lang.Object r2 = r2.get(r0)
                boolean r2 = kotlin.jvm.internal.g0.g(r2, r4)
                if (r2 == 0) goto L16
                int r4 = r3.start
                int r0 = r0 - r4
                return r0
            L16:
                int r0 = r0 + 1
                goto L4
            L19:
                r4 = -1
                return r4
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
                r2 = this;
                int r0 = r2.end
                int r1 = r2.start
                if (r0 != r1) goto L8
                r0 = 1
                return r0
            L8:
                r0 = 0
                return r0
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @org.jetbrains.annotations.NotNull
        public java.util.Iterator<T> iterator() {
                r2 = this;
                androidx.collection.MutableObjectList$MutableObjectListIterator r0 = new androidx.collection.MutableObjectList$MutableObjectListIterator
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        @Override // java.util.List
        public int lastIndexOf(java.lang.Object r4) {
                r3 = this;
                int r0 = r3.end
                int r0 = r0 + (-1)
                int r1 = r3.start
                if (r1 > r0) goto L1d
            L8:
                java.util.List<T> r2 = r3.list
                java.lang.Object r2 = r2.get(r0)
                boolean r2 = kotlin.jvm.internal.g0.g(r2, r4)
                if (r2 == 0) goto L18
                int r4 = r3.start
                int r0 = r0 - r4
                return r0
            L18:
                if (r0 == r1) goto L1d
                int r0 = r0 + (-1)
                goto L8
            L1d:
                r4 = -1
                return r4
        }

        @Override // java.util.List
        @org.jetbrains.annotations.NotNull
        public java.util.ListIterator<T> listIterator() {
                r2 = this;
                androidx.collection.MutableObjectList$MutableObjectListIterator r0 = new androidx.collection.MutableObjectList$MutableObjectListIterator
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        @Override // java.util.List
        @org.jetbrains.annotations.NotNull
        public java.util.ListIterator<T> listIterator(int r2) {
                r1 = this;
                androidx.collection.MutableObjectList$MutableObjectListIterator r0 = new androidx.collection.MutableObjectList$MutableObjectListIterator
                r0.<init>(r1, r2)
                return r0
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int r1) {
                r0 = this;
                java.lang.Object r1 = r0.removeAt(r1)
                return r1
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(java.lang.Object r4) {
                r3 = this;
                int r0 = r3.start
                int r1 = r3.end
            L4:
                if (r0 >= r1) goto L22
                java.util.List<T> r2 = r3.list
                java.lang.Object r2 = r2.get(r0)
                boolean r2 = kotlin.jvm.internal.g0.g(r2, r4)
                if (r2 == 0) goto L1f
                java.util.List<T> r4 = r3.list
                r4.remove(r0)
                int r4 = r3.end
                int r4 = r4 + (-1)
                r3.end = r4
                r4 = 1
                return r4
            L1f:
                int r0 = r0 + 1
                goto L4
            L22:
                r4 = 0
                return r4
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(@org.jetbrains.annotations.NotNull java.util.Collection<? extends java.lang.Object> r3) {
                r2 = this;
                java.lang.String r0 = "elements"
                kotlin.jvm.internal.g0.p(r3, r0)
                int r0 = r2.end
                java.lang.Iterable r3 = (java.lang.Iterable) r3
                java.util.Iterator r3 = r3.iterator()
            Ld:
                boolean r1 = r3.hasNext()
                if (r1 == 0) goto L1b
                java.lang.Object r1 = r3.next()
                r2.remove(r1)
                goto Ld
            L1b:
                int r3 = r2.end
                if (r0 == r3) goto L21
                r3 = 1
                return r3
            L21:
                r3 = 0
                return r3
        }

        public T removeAt(int r3) {
                r2 = this;
                androidx.collection.ObjectListKt.access$checkIndex(r2, r3)
                java.util.List<T> r0 = r2.list
                int r1 = r2.start
                int r3 = r3 + r1
                java.lang.Object r3 = r0.remove(r3)
                int r0 = r2.end
                int r0 = r0 + (-1)
                r2.end = r0
                return r3
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(@org.jetbrains.annotations.NotNull java.util.Collection<? extends java.lang.Object> r5) {
                r4 = this;
                java.lang.String r0 = "elements"
                kotlin.jvm.internal.g0.p(r5, r0)
                int r0 = r4.end
                int r1 = r0 + (-1)
                int r2 = r4.start
                if (r2 > r1) goto L29
            Ld:
                java.util.List<T> r3 = r4.list
                java.lang.Object r3 = r3.get(r1)
                boolean r3 = r5.contains(r3)
                if (r3 != 0) goto L24
                java.util.List<T> r3 = r4.list
                r3.remove(r1)
                int r3 = r4.end
                int r3 = r3 + (-1)
                r4.end = r3
            L24:
                if (r1 == r2) goto L29
                int r1 = r1 + (-1)
                goto Ld
            L29:
                int r5 = r4.end
                if (r0 == r5) goto L2f
                r5 = 1
                return r5
            L2f:
                r5 = 0
                return r5
        }

        @Override // java.util.List
        public T set(int r3, T r4) {
                r2 = this;
                androidx.collection.ObjectListKt.access$checkIndex(r2, r3)
                java.util.List<T> r0 = r2.list
                int r1 = r2.start
                int r3 = r3 + r1
                java.lang.Object r3 = r0.set(r3, r4)
                return r3
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
                r1 = this;
                int r0 = r1.getSize()
                return r0
        }

        @Override // java.util.List
        @org.jetbrains.annotations.NotNull
        public java.util.List<T> subList(int r2, int r3) {
                r1 = this;
                androidx.collection.ObjectListKt.access$checkSubIndex(r1, r2, r3)
                androidx.collection.MutableObjectList$SubList r0 = new androidx.collection.MutableObjectList$SubList
                r0.<init>(r1, r2, r3)
                return r0
        }

        @Override // java.util.List, java.util.Collection
        public java.lang.Object[] toArray() {
                r1 = this;
                java.lang.Object[] r0 = kotlin.jvm.internal.u.a(r1)
                return r0
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] r2) {
                r1 = this;
                java.lang.String r0 = "array"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.Object[] r2 = kotlin.jvm.internal.u.b(r1, r2)
                return r2
        }
    }

    public MutableObjectList() {
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            r3.<init>(r2, r0, r1)
            return
    }

    public MutableObjectList(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public /* synthetic */ MutableObjectList(int r1, int r2, kotlin.jvm.internal.v r3) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L6
            r1 = 16
        L6:
            r0.<init>(r1)
            return
    }

    public static /* synthetic */ void trim$default(androidx.collection.MutableObjectList r0, int r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            int r1 = r0._size
        L6:
            r0.trim(r1)
            return
    }

    public final void add(@androidx.annotation.IntRange(from = 0) int r4, E r5) {
            r3 = this;
            if (r4 < 0) goto L1f
            int r0 = r3._size
            if (r4 > r0) goto L1f
            int r0 = r0 + 1
            r3.ensureCapacity(r0)
            java.lang.Object[] r0 = r3.content
            int r1 = r3._size
            if (r4 == r1) goto L16
            int r2 = r4 + 1
            kotlin.collections.n.B0(r0, r0, r2, r4, r1)
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

    public final boolean add(E r4) {
            r3 = this;
            int r0 = r3._size
            r1 = 1
            int r0 = r0 + r1
            r3.ensureCapacity(r0)
            java.lang.Object[] r0 = r3.content
            int r2 = r3._size
            r0[r2] = r4
            int r2 = r2 + r1
            r3._size = r2
            return r1
    }

    public final boolean addAll(@androidx.annotation.IntRange(from = 0) int r5, @org.jetbrains.annotations.NotNull androidx.collection.ObjectList<E> r6) {
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
            java.lang.Object[] r0 = r4.content
            int r2 = r4._size
            if (r5 == r2) goto L27
            int r3 = r6._size
            int r3 = r3 + r5
            kotlin.collections.n.B0(r0, r0, r3, r5, r2)
        L27:
            java.lang.Object[] r2 = r6.content
            int r3 = r6._size
            kotlin.collections.n.B0(r2, r0, r5, r1, r3)
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

    public final boolean addAll(@androidx.annotation.IntRange(from = 0) int r6, @org.jetbrains.annotations.NotNull java.util.Collection<? extends E> r7) {
            r5 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r7, r0)
            if (r6 < 0) goto L55
            int r0 = r5._size
            if (r6 > r0) goto L55
            boolean r0 = r7.isEmpty()
            r1 = 0
            if (r0 == 0) goto L13
            return r1
        L13:
            int r0 = r5._size
            int r2 = r7.size()
            int r0 = r0 + r2
            r5.ensureCapacity(r0)
            java.lang.Object[] r0 = r5.content
            int r2 = r5._size
            if (r6 == r2) goto L2d
            int r2 = r7.size()
            int r2 = r2 + r6
            int r3 = r5._size
            kotlin.collections.n.B0(r0, r0, r2, r6, r3)
        L2d:
            r2 = r7
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L34:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L4a
            java.lang.Object r3 = r2.next()
            int r4 = r1 + 1
            if (r1 >= 0) goto L45
            kotlin.collections.f0.b0()
        L45:
            int r1 = r1 + r6
            r0[r1] = r3
            r1 = r4
            goto L34
        L4a:
            int r6 = r5._size
            int r7 = r7.size()
            int r6 = r6 + r7
            r5._size = r6
            r6 = 1
            return r6
        L55:
            java.lang.IndexOutOfBoundsException r7 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Index "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = " must be in 0.."
            r0.append(r6)
            int r6 = r5._size
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
    }

    public final boolean addAll(@androidx.annotation.IntRange(from = 0) int r9, @org.jetbrains.annotations.NotNull E[] r10) {
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
            java.lang.Object[] r2 = r8.content
            int r0 = r8._size
            if (r9 == r0) goto L20
            int r1 = r10.length
            int r1 = r1 + r9
            kotlin.collections.n.B0(r2, r2, r1, r9, r0)
        L20:
            r6 = 12
            r7 = 0
            r4 = 0
            r5 = 0
            r3 = r9
            r1 = r10
            kotlin.collections.n.K0(r1, r2, r3, r4, r5, r6, r7)
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

    public final boolean addAll(@org.jetbrains.annotations.NotNull androidx.collection.ObjectList<E> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r1._size
            r1.plusAssign(r2)
            int r2 = r1._size
            if (r0 == r2) goto L10
            r2 = 1
            return r2
        L10:
            r2 = 0
            return r2
    }

    public final boolean addAll(@org.jetbrains.annotations.NotNull androidx.collection.ScatterSet<E> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r1._size
            r1.plusAssign(r2)
            int r2 = r1._size
            if (r0 == r2) goto L10
            r2 = 1
            return r2
        L10:
            r2 = 0
            return r2
    }

    public final boolean addAll(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends E> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r1._size
            r1.plusAssign(r2)
            int r2 = r1._size
            if (r0 == r2) goto L10
            r2 = 1
            return r2
        L10:
            r2 = 0
            return r2
    }

    public final boolean addAll(@org.jetbrains.annotations.NotNull java.util.List<? extends E> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r1._size
            r1.plusAssign(r2)
            int r2 = r1._size
            if (r0 == r2) goto L10
            r2 = 1
            return r2
        L10:
            r2 = 0
            return r2
    }

    public final boolean addAll(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends E> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r1._size
            r1.plusAssign(r2)
            int r2 = r1._size
            if (r0 == r2) goto L10
            r2 = 1
            return r2
        L10:
            r2 = 0
            return r2
    }

    public final boolean addAll(@org.jetbrains.annotations.NotNull E[] r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r1._size
            r1.plusAssign(r2)
            int r2 = r1._size
            if (r0 == r2) goto L10
            r2 = 1
            return r2
        L10:
            r2 = 0
            return r2
    }

    @Override // androidx.collection.ObjectList
    @org.jetbrains.annotations.NotNull
    public java.util.List<E> asList() {
            r1 = this;
            java.util.List r0 = r1.asMutableList()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<E> asMutableList() {
            r1 = this;
            androidx.collection.MutableObjectList$ObjectListMutableList<E> r0 = r1.list
            if (r0 == 0) goto L5
            return r0
        L5:
            androidx.collection.MutableObjectList$ObjectListMutableList r0 = new androidx.collection.MutableObjectList$ObjectListMutableList
            r0.<init>(r1)
            r1.list = r0
            return r0
    }

    public final void clear() {
            r4 = this;
            java.lang.Object[] r0 = r4.content
            int r1 = r4._size
            r2 = 0
            r3 = 0
            kotlin.collections.n.M1(r0, r2, r3, r1)
            r4._size = r3
            return
    }

    public final void ensureCapacity(int r3) {
            r2 = this;
            java.lang.Object[] r0 = r2.content
            int r1 = r0.length
            if (r1 >= r3) goto L19
            int r1 = r0.length
            int r1 = r1 * 3
            int r1 = r1 / 2
            int r3 = java.lang.Math.max(r3, r1)
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r0, r3)
            java.lang.String r0 = "copyOf(this, newSize)"
            kotlin.jvm.internal.g0.o(r3, r0)
            r2.content = r3
        L19:
            return
    }

    public final int getCapacity() {
            r1 = this;
            java.lang.Object[] r0 = r1.content
            int r0 = r0.length
            return r0
    }

    public final void minusAssign(@org.jetbrains.annotations.NotNull androidx.collection.ObjectList<E> r4) {
            r3 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.Object[] r0 = r4.content
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

    public final void minusAssign(@org.jetbrains.annotations.NotNull androidx.collection.ScatterSet<E> r15) {
            r14 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r15, r0)
            java.lang.Object[] r0 = r15.elements
            long[] r15 = r15.metadata
            int r1 = r15.length
            int r1 = r1 + (-2)
            if (r1 < 0) goto L48
            r2 = 0
            r3 = 0
        L10:
            r4 = r15[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L43
            int r6 = r3 - r1
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = 0
        L2a:
            if (r8 >= r6) goto L41
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 128(0x80, double:6.3E-322)
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 >= 0) goto L3d
            int r9 = r3 << 3
            int r9 = r9 + r8
            r9 = r0[r9]
            r14.remove(r9)
        L3d:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L2a
        L41:
            if (r6 != r7) goto L48
        L43:
            if (r3 == r1) goto L48
            int r3 = r3 + 1
            goto L10
        L48:
            return
    }

    public final void minusAssign(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends E> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Iterator r2 = r2.iterator()
        L9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L17
            java.lang.Object r0 = r2.next()
            r1.remove(r0)
            goto L9
        L17:
            return
    }

    public final void minusAssign(E r1) {
            r0 = this;
            r0.remove(r1)
            return
    }

    public final void minusAssign(@org.jetbrains.annotations.NotNull java.util.List<? extends E> r4) {
            r3 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r4.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L16
            java.lang.Object r2 = r4.get(r1)
            r3.remove(r2)
            int r1 = r1 + 1
            goto La
        L16:
            return
    }

    public final void minusAssign(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends E> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Iterator r2 = r2.iterator()
        L9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L17
            java.lang.Object r0 = r2.next()
            r1.remove(r0)
            goto L9
        L17:
            return
    }

    public final void minusAssign(@org.jetbrains.annotations.NotNull E[] r4) {
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

    public final void plusAssign(@org.jetbrains.annotations.NotNull androidx.collection.ObjectList<E> r6) {
            r5 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r6, r0)
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto Lc
            return
        Lc:
            int r0 = r5._size
            int r1 = r6._size
            int r0 = r0 + r1
            r5.ensureCapacity(r0)
            java.lang.Object[] r0 = r5.content
            java.lang.Object[] r1 = r6.content
            int r2 = r5._size
            r3 = 0
            int r4 = r6._size
            kotlin.collections.n.B0(r1, r0, r2, r3, r4)
            int r0 = r5._size
            int r6 = r6._size
            int r0 = r0 + r6
            r5._size = r0
            return
    }

    public final void plusAssign(@org.jetbrains.annotations.NotNull androidx.collection.ScatterSet<E> r15) {
            r14 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r15, r0)
            boolean r0 = r15.isEmpty()
            if (r0 == 0) goto Lc
            goto L59
        Lc:
            int r0 = r14._size
            int r1 = r15.getSize()
            int r0 = r0 + r1
            r14.ensureCapacity(r0)
            java.lang.Object[] r0 = r15.elements
            long[] r15 = r15.metadata
            int r1 = r15.length
            int r1 = r1 + (-2)
            if (r1 < 0) goto L59
            r2 = 0
            r3 = 0
        L21:
            r4 = r15[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L54
            int r6 = r3 - r1
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = 0
        L3b:
            if (r8 >= r6) goto L52
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 128(0x80, double:6.3E-322)
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 >= 0) goto L4e
            int r9 = r3 << 3
            int r9 = r9 + r8
            r9 = r0[r9]
            r14.add(r9)
        L4e:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L3b
        L52:
            if (r6 != r7) goto L59
        L54:
            if (r3 == r1) goto L59
            int r3 = r3 + 1
            goto L21
        L59:
            return
    }

    public final void plusAssign(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends E> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Iterator r2 = r2.iterator()
        L9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L17
            java.lang.Object r0 = r2.next()
            r1.add(r0)
            goto L9
        L17:
            return
    }

    public final void plusAssign(E r1) {
            r0 = this;
            r0.add(r1)
            return
    }

    public final void plusAssign(@org.jetbrains.annotations.NotNull java.util.List<? extends E> r7) {
            r6 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r7, r0)
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto Lc
            return
        Lc:
            int r0 = r6._size
            int r1 = r7.size()
            int r1 = r1 + r0
            r6.ensureCapacity(r1)
            java.lang.Object[] r1 = r6.content
            int r2 = r7.size()
            r3 = 0
        L1d:
            if (r3 >= r2) goto L2a
            int r4 = r3 + r0
            java.lang.Object r5 = r7.get(r3)
            r1[r4] = r5
            int r3 = r3 + 1
            goto L1d
        L2a:
            int r0 = r6._size
            int r7 = r7.size()
            int r0 = r0 + r7
            r6._size = r0
            return
    }

    public final void plusAssign(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends E> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Iterator r2 = r2.iterator()
        L9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L17
            java.lang.Object r0 = r2.next()
            r1.add(r0)
            goto L9
        L17:
            return
    }

    public final void plusAssign(@org.jetbrains.annotations.NotNull E[] r9) {
            r8 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r9, r0)
            int r0 = r9.length
            if (r0 != 0) goto L9
            return
        L9:
            int r0 = r8._size
            int r1 = r9.length
            int r0 = r0 + r1
            r8.ensureCapacity(r0)
            java.lang.Object[] r2 = r8.content
            int r3 = r8._size
            r6 = 12
            r7 = 0
            r4 = 0
            r5 = 0
            r1 = r9
            kotlin.collections.n.K0(r1, r2, r3, r4, r5, r6, r7)
            int r9 = r8._size
            int r0 = r1.length
            int r9 = r9 + r0
            r8._size = r9
            return
    }

    public final boolean remove(E r1) {
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

    public final boolean removeAll(@org.jetbrains.annotations.NotNull androidx.collection.ObjectList<E> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r1._size
            r1.minusAssign(r2)
            int r2 = r1._size
            if (r0 == r2) goto L10
            r2 = 1
            return r2
        L10:
            r2 = 0
            return r2
    }

    public final boolean removeAll(@org.jetbrains.annotations.NotNull androidx.collection.ScatterSet<E> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r1._size
            r1.minusAssign(r2)
            int r2 = r1._size
            if (r0 == r2) goto L10
            r2 = 1
            return r2
        L10:
            r2 = 0
            return r2
    }

    public final boolean removeAll(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends E> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r1._size
            r1.minusAssign(r2)
            int r2 = r1._size
            if (r0 == r2) goto L10
            r2 = 1
            return r2
        L10:
            r2 = 0
            return r2
    }

    public final boolean removeAll(@org.jetbrains.annotations.NotNull java.util.List<? extends E> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r1._size
            r1.minusAssign(r2)
            int r2 = r1._size
            if (r0 == r2) goto L10
            r2 = 1
            return r2
        L10:
            r2 = 0
            return r2
    }

    public final boolean removeAll(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends E> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r1._size
            r1.minusAssign(r2)
            int r2 = r1._size
            if (r0 == r2) goto L10
            r2 = 1
            return r2
        L10:
            r2 = 0
            return r2
    }

    public final boolean removeAll(@org.jetbrains.annotations.NotNull E[] r6) {
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

    public final E removeAt(@androidx.annotation.IntRange(from = 0) int r5) {
            r4 = this;
            if (r5 < 0) goto L1d
            int r0 = r4._size
            if (r5 >= r0) goto L1d
            java.lang.Object[] r1 = r4.content
            r2 = r1[r5]
            int r3 = r0 + (-1)
            if (r5 == r3) goto L13
            int r3 = r5 + 1
            kotlin.collections.n.B0(r1, r1, r5, r3, r0)
        L13:
            int r5 = r4._size
            int r5 = r5 + (-1)
            r4._size = r5
            r0 = 0
            r1[r5] = r0
            return r2
        L1d:
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

    public final void removeIf(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> r8) {
            r7 = this;
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r8, r0)
            int r0 = r7._size
            java.lang.Object[] r1 = r7.content
            r2 = 0
            kotlin.ranges.m r3 = kotlin.ranges.t.W1(r2, r0)
            int r4 = r3.e()
            int r3 = r3.f()
            if (r4 > r3) goto L33
        L18:
            int r5 = r4 - r2
            r6 = r1[r4]
            r1[r5] = r6
            r5 = r1[r4]
            java.lang.Object r5 = r8.invoke(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L2e
            int r2 = r2 + 1
        L2e:
            if (r4 == r3) goto L33
            int r4 = r4 + 1
            goto L18
        L33:
            r8 = 0
            int r3 = r0 - r2
            kotlin.collections.n.M1(r1, r8, r3, r0)
            int r8 = r7._size
            int r8 = r8 - r2
            r7._size = r8
            return
    }

    public final void removeRange(@androidx.annotation.IntRange(from = 0) int r4, @androidx.annotation.IntRange(from = 0) int r5) {
            r3 = this;
            java.lang.String r0 = "Start ("
            if (r4 < 0) goto L47
            int r1 = r3._size
            if (r4 > r1) goto L47
            if (r5 < 0) goto L47
            if (r5 > r1) goto L47
            if (r5 < r4) goto L25
            if (r5 == r4) goto L24
            if (r5 >= r1) goto L17
            java.lang.Object[] r0 = r3.content
            kotlin.collections.n.B0(r0, r0, r4, r5, r1)
        L17:
            int r0 = r3._size
            int r5 = r5 - r4
            int r4 = r0 - r5
            java.lang.Object[] r5 = r3.content
            r1 = 0
            kotlin.collections.n.M1(r5, r1, r4, r0)
            r3._size = r4
        L24:
            return
        L25:
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
        L47:
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

    public final boolean retainAll(@org.jetbrains.annotations.NotNull androidx.collection.ObjectList<E> r5) {
            r4 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r5, r0)
            int r0 = r4._size
            java.lang.Object[] r1 = r4.content
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

    public final boolean retainAll(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends E> r5) {
            r4 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r5, r0)
            int r0 = r4._size
            java.lang.Object[] r1 = r4.content
            int r2 = r0 + (-1)
        Lb:
            r3 = -1
            if (r3 >= r2) goto L1c
            r3 = r1[r2]
            boolean r3 = kotlin.collections.f0.a2(r5, r3)
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

    public final boolean retainAll(@org.jetbrains.annotations.NotNull java.util.Collection<? extends E> r5) {
            r4 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r5, r0)
            int r0 = r4._size
            java.lang.Object[] r1 = r4.content
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

    public final boolean retainAll(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends E> r5) {
            r4 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r5, r0)
            int r0 = r4._size
            java.lang.Object[] r1 = r4.content
            int r2 = r0 + (-1)
        Lb:
            r3 = -1
            if (r3 >= r2) goto L1c
            r3 = r1[r2]
            boolean r3 = kotlin.sequences.p.D0(r5, r3)
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

    public final boolean retainAll(@org.jetbrains.annotations.NotNull E[] r5) {
            r4 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r5, r0)
            int r0 = r4._size
            java.lang.Object[] r1 = r4.content
            int r2 = r0 + (-1)
        Lb:
            r3 = -1
            if (r3 >= r2) goto L1c
            r3 = r1[r2]
            int r3 = kotlin.collections.n.bg(r5, r3)
            if (r3 >= 0) goto L19
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

    public final E set(@androidx.annotation.IntRange(from = 0) int r3, E r4) {
            r2 = this;
            if (r3 < 0) goto Ld
            int r0 = r2._size
            if (r3 >= r0) goto Ld
            java.lang.Object[] r0 = r2.content
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

    public final void trim(int r3) {
            r2 = this;
            int r0 = r2._size
            int r3 = java.lang.Math.max(r3, r0)
            java.lang.Object[] r0 = r2.content
            int r1 = r0.length
            if (r1 <= r3) goto L16
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r0, r3)
            java.lang.String r0 = "copyOf(this, newSize)"
            kotlin.jvm.internal.g0.o(r3, r0)
            r2.content = r3
        L16:
            return
    }
}
