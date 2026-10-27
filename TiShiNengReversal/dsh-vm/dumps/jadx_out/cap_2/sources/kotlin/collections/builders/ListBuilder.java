package kotlin.collections.builders;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,722:1\n1#2:723\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ListBuilder<E> extends kotlin.collections.h<E> implements java.util.List<E>, java.util.RandomAccess, java.io.Serializable, l3.e {

    @org.jetbrains.annotations.NotNull
    private static final kotlin.collections.builders.ListBuilder.a Companion = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.collections.builders.ListBuilder Empty = null;

    @org.jetbrains.annotations.NotNull
    private E[] backing;
    private boolean isReadOnly;
    private int length;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class BuilderSubList<E> extends kotlin.collections.h<E> implements java.util.List<E>, java.util.RandomAccess, java.io.Serializable, l3.e {

        @org.jetbrains.annotations.NotNull
        private E[] backing;
        private int length;
        private final int offset;

        @org.jetbrains.annotations.Nullable
        private final kotlin.collections.builders.ListBuilder.BuilderSubList<E> parent;

        @org.jetbrains.annotations.NotNull
        private final kotlin.collections.builders.ListBuilder<E> root;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilder$BuilderSubList$Itr\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,722:1\n1#2:723\n*E\n"})
        private static final class a<E> implements java.util.ListIterator<E>, l3.f {

            @org.jetbrains.annotations.NotNull
            private final kotlin.collections.builders.ListBuilder.BuilderSubList<E> a;
            private int b;
            private int c;
            private int d;

            public a(@org.jetbrains.annotations.NotNull kotlin.collections.builders.ListBuilder.BuilderSubList<E> r2, int r3) {
                    r1 = this;
                    java.lang.String r0 = "list"
                    kotlin.jvm.internal.g0.p(r2, r0)
                    r1.<init>()
                    r1.a = r2
                    r1.b = r3
                    r3 = -1
                    r1.c = r3
                    int r2 = kotlin.collections.builders.ListBuilder.BuilderSubList.access$getModCount$p$s1462993667(r2)
                    r1.d = r2
                    return
            }

            private final void a() {
                    r2 = this;
                    kotlin.collections.builders.ListBuilder$BuilderSubList<E> r0 = r2.a
                    kotlin.collections.builders.ListBuilder r0 = kotlin.collections.builders.ListBuilder.BuilderSubList.access$getRoot$p(r0)
                    int r0 = kotlin.collections.builders.ListBuilder.m21access$getModCount$p$s2084097795(r0)
                    int r1 = r2.d
                    if (r0 != r1) goto Lf
                    return
                Lf:
                    java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
                    r0.<init>()
                    throw r0
            }

            @Override // java.util.ListIterator
            public void add(E r4) {
                    r3 = this;
                    r3.a()
                    kotlin.collections.builders.ListBuilder$BuilderSubList<E> r0 = r3.a
                    int r1 = r3.b
                    int r2 = r1 + 1
                    r3.b = r2
                    r0.add(r1, r4)
                    r4 = -1
                    r3.c = r4
                    kotlin.collections.builders.ListBuilder$BuilderSubList<E> r4 = r3.a
                    int r4 = kotlin.collections.builders.ListBuilder.BuilderSubList.access$getModCount$p$s1462993667(r4)
                    r3.d = r4
                    return
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                    r2 = this;
                    int r0 = r2.b
                    kotlin.collections.builders.ListBuilder$BuilderSubList<E> r1 = r2.a
                    int r1 = kotlin.collections.builders.ListBuilder.BuilderSubList.access$getLength$p(r1)
                    if (r0 >= r1) goto Lc
                    r0 = 1
                    return r0
                Lc:
                    r0 = 0
                    return r0
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                    r1 = this;
                    int r0 = r1.b
                    if (r0 <= 0) goto L6
                    r0 = 1
                    return r0
                L6:
                    r0 = 0
                    return r0
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public E next() {
                    r3 = this;
                    r3.a()
                    int r0 = r3.b
                    kotlin.collections.builders.ListBuilder$BuilderSubList<E> r1 = r3.a
                    int r1 = kotlin.collections.builders.ListBuilder.BuilderSubList.access$getLength$p(r1)
                    if (r0 >= r1) goto L27
                    int r0 = r3.b
                    int r1 = r0 + 1
                    r3.b = r1
                    r3.c = r0
                    kotlin.collections.builders.ListBuilder$BuilderSubList<E> r0 = r3.a
                    java.lang.Object[] r0 = kotlin.collections.builders.ListBuilder.BuilderSubList.access$getBacking$p(r0)
                    kotlin.collections.builders.ListBuilder$BuilderSubList<E> r1 = r3.a
                    int r1 = kotlin.collections.builders.ListBuilder.BuilderSubList.access$getOffset$p(r1)
                    int r2 = r3.c
                    int r1 = r1 + r2
                    r0 = r0[r1]
                    return r0
                L27:
                    java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                    r0.<init>()
                    throw r0
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                    r1 = this;
                    int r0 = r1.b
                    return r0
            }

            @Override // java.util.ListIterator
            public E previous() {
                    r3 = this;
                    r3.a()
                    int r0 = r3.b
                    if (r0 <= 0) goto L1f
                    int r0 = r0 + (-1)
                    r3.b = r0
                    r3.c = r0
                    kotlin.collections.builders.ListBuilder$BuilderSubList<E> r0 = r3.a
                    java.lang.Object[] r0 = kotlin.collections.builders.ListBuilder.BuilderSubList.access$getBacking$p(r0)
                    kotlin.collections.builders.ListBuilder$BuilderSubList<E> r1 = r3.a
                    int r1 = kotlin.collections.builders.ListBuilder.BuilderSubList.access$getOffset$p(r1)
                    int r2 = r3.c
                    int r1 = r1 + r2
                    r0 = r0[r1]
                    return r0
                L1f:
                    java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                    r0.<init>()
                    throw r0
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                    r1 = this;
                    int r0 = r1.b
                    int r0 = r0 + (-1)
                    return r0
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                    r3 = this;
                    r3.a()
                    int r0 = r3.c
                    r1 = -1
                    if (r0 == r1) goto L1c
                    kotlin.collections.builders.ListBuilder$BuilderSubList<E> r2 = r3.a
                    r2.removeAt(r0)
                    int r0 = r3.c
                    r3.b = r0
                    r3.c = r1
                    kotlin.collections.builders.ListBuilder$BuilderSubList<E> r0 = r3.a
                    int r0 = kotlin.collections.builders.ListBuilder.BuilderSubList.access$getModCount$p$s1462993667(r0)
                    r3.d = r0
                    return
                L1c:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "Call next() or previous() before removing element from the iterator."
                    r0.<init>(r1)
                    throw r0
            }

            @Override // java.util.ListIterator
            public void set(E r3) {
                    r2 = this;
                    r2.a()
                    int r0 = r2.c
                    r1 = -1
                    if (r0 == r1) goto Le
                    kotlin.collections.builders.ListBuilder$BuilderSubList<E> r1 = r2.a
                    r1.set(r0, r3)
                    return
                Le:
                    java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                    java.lang.String r0 = "Call next() or previous() before replacing element from the iterator."
                    r3.<init>(r0)
                    throw r3
            }
        }

        public BuilderSubList(@org.jetbrains.annotations.NotNull E[] r2, int r3, int r4, @org.jetbrains.annotations.Nullable kotlin.collections.builders.ListBuilder.BuilderSubList<E> r5, @org.jetbrains.annotations.NotNull kotlin.collections.builders.ListBuilder<E> r6) {
                r1 = this;
                java.lang.String r0 = "backing"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "root"
                kotlin.jvm.internal.g0.p(r6, r0)
                r1.<init>()
                r1.backing = r2
                r1.offset = r3
                r1.length = r4
                r1.parent = r5
                r1.root = r6
                int r2 = kotlin.collections.builders.ListBuilder.m21access$getModCount$p$s2084097795(r6)
                r1.modCount = r2
                return
        }

        public static final /* synthetic */ java.lang.Object[] access$getBacking$p(kotlin.collections.builders.ListBuilder.BuilderSubList r0) {
                E[] r0 = r0.backing
                return r0
        }

        public static final /* synthetic */ int access$getLength$p(kotlin.collections.builders.ListBuilder.BuilderSubList r0) {
                int r0 = r0.length
                return r0
        }

        public static final /* synthetic */ int access$getModCount$p$s1462993667(kotlin.collections.builders.ListBuilder.BuilderSubList r0) {
                int r0 = r0.modCount
                return r0
        }

        public static final /* synthetic */ int access$getOffset$p(kotlin.collections.builders.ListBuilder.BuilderSubList r0) {
                int r0 = r0.offset
                return r0
        }

        public static final /* synthetic */ kotlin.collections.builders.ListBuilder access$getRoot$p(kotlin.collections.builders.ListBuilder.BuilderSubList r0) {
                kotlin.collections.builders.ListBuilder<E> r0 = r0.root
                return r0
        }

        private final void addAllInternal(int r2, java.util.Collection<? extends E> r3, int r4) {
                r1 = this;
                r1.registerModification()
                kotlin.collections.builders.ListBuilder$BuilderSubList<E> r0 = r1.parent
                if (r0 == 0) goto Lb
                r0.addAllInternal(r2, r3, r4)
                goto L10
            Lb:
                kotlin.collections.builders.ListBuilder<E> r0 = r1.root
                kotlin.collections.builders.ListBuilder.access$addAllInternal(r0, r2, r3, r4)
            L10:
                kotlin.collections.builders.ListBuilder<E> r2 = r1.root
                java.lang.Object[] r2 = kotlin.collections.builders.ListBuilder.access$getBacking$p(r2)
                r1.backing = r2
                int r2 = r1.length
                int r2 = r2 + r4
                r1.length = r2
                return
        }

        private final void addAtInternal(int r2, E r3) {
                r1 = this;
                r1.registerModification()
                kotlin.collections.builders.ListBuilder$BuilderSubList<E> r0 = r1.parent
                if (r0 == 0) goto Lb
                r0.addAtInternal(r2, r3)
                goto L10
            Lb:
                kotlin.collections.builders.ListBuilder<E> r0 = r1.root
                kotlin.collections.builders.ListBuilder.access$addAtInternal(r0, r2, r3)
            L10:
                kotlin.collections.builders.ListBuilder<E> r2 = r1.root
                java.lang.Object[] r2 = kotlin.collections.builders.ListBuilder.access$getBacking$p(r2)
                r1.backing = r2
                int r2 = r1.length
                int r2 = r2 + 1
                r1.length = r2
                return
        }

        private final void checkForComodification() {
                r2 = this;
                kotlin.collections.builders.ListBuilder<E> r0 = r2.root
                int r0 = kotlin.collections.builders.ListBuilder.m21access$getModCount$p$s2084097795(r0)
                int r1 = r2.modCount
                if (r0 != r1) goto Lb
                return
            Lb:
                java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
                r0.<init>()
                throw r0
        }

        private final void checkIsMutable() {
                r1 = this;
                boolean r0 = r1.isReadOnly()
                if (r0 != 0) goto L7
                return
            L7:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        private final boolean contentEquals(java.util.List<?> r4) {
                r3 = this;
                E[] r0 = r3.backing
                int r1 = r3.offset
                int r2 = r3.length
                boolean r4 = kotlin.collections.builders.b.a(r0, r1, r2, r4)
                return r4
        }

        private final boolean isReadOnly() {
                r1 = this;
                kotlin.collections.builders.ListBuilder<E> r0 = r1.root
                boolean r0 = kotlin.collections.builders.ListBuilder.access$isReadOnly$p(r0)
                return r0
        }

        private final void readObject(java.io.ObjectInputStream r2) {
                r1 = this;
                java.io.InvalidObjectException r2 = new java.io.InvalidObjectException
                java.lang.String r0 = "Deserialization is supported via proxy only"
                r2.<init>(r0)
                throw r2
        }

        private final void registerModification() {
                r1 = this;
                int r0 = r1.modCount
                int r0 = r0 + 1
                r1.modCount = r0
                return
        }

        private final E removeAtInternal(int r2) {
                r1 = this;
                r1.registerModification()
                kotlin.collections.builders.ListBuilder$BuilderSubList<E> r0 = r1.parent
                if (r0 == 0) goto Lc
                java.lang.Object r2 = r0.removeAtInternal(r2)
                goto L12
            Lc:
                kotlin.collections.builders.ListBuilder<E> r0 = r1.root
                java.lang.Object r2 = kotlin.collections.builders.ListBuilder.access$removeAtInternal(r0, r2)
            L12:
                int r0 = r1.length
                int r0 = r0 + (-1)
                r1.length = r0
                return r2
        }

        private final void removeRangeInternal(int r2, int r3) {
                r1 = this;
                if (r3 <= 0) goto L5
                r1.registerModification()
            L5:
                kotlin.collections.builders.ListBuilder$BuilderSubList<E> r0 = r1.parent
                if (r0 == 0) goto Ld
                r0.removeRangeInternal(r2, r3)
                goto L12
            Ld:
                kotlin.collections.builders.ListBuilder<E> r0 = r1.root
                kotlin.collections.builders.ListBuilder.access$removeRangeInternal(r0, r2, r3)
            L12:
                int r2 = r1.length
                int r2 = r2 - r3
                r1.length = r2
                return
        }

        private final int retainOrRemoveAllInternal(int r2, int r3, java.util.Collection<? extends E> r4, boolean r5) {
                r1 = this;
                kotlin.collections.builders.ListBuilder$BuilderSubList<E> r0 = r1.parent
                if (r0 == 0) goto L9
                int r2 = r0.retainOrRemoveAllInternal(r2, r3, r4, r5)
                goto Lf
            L9:
                kotlin.collections.builders.ListBuilder<E> r0 = r1.root
                int r2 = kotlin.collections.builders.ListBuilder.access$retainOrRemoveAllInternal(r0, r2, r3, r4, r5)
            Lf:
                if (r2 <= 0) goto L14
                r1.registerModification()
            L14:
                int r3 = r1.length
                int r3 = r3 - r2
                r1.length = r3
                return r2
        }

        private final java.lang.Object writeReplace() {
                r2 = this;
                boolean r0 = r2.isReadOnly()
                if (r0 == 0) goto Ld
                kotlin.collections.builders.SerializedCollection r0 = new kotlin.collections.builders.SerializedCollection
                r1 = 0
                r0.<init>(r2, r1)
                return r0
            Ld:
                java.io.NotSerializableException r0 = new java.io.NotSerializableException
                java.lang.String r1 = "The list cannot be serialized while it is being built."
                r0.<init>(r1)
                throw r0
        }

        @Override // kotlin.collections.h, java.util.AbstractList, java.util.List
        public void add(int r3, E r4) {
                r2 = this;
                r2.checkIsMutable()
                r2.checkForComodification()
                kotlin.collections.d$a r0 = kotlin.collections.d.Companion
                int r1 = r2.length
                r0.c(r3, r1)
                int r0 = r2.offset
                int r0 = r0 + r3
                r2.addAtInternal(r0, r4)
                return
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(E r3) {
                r2 = this;
                r2.checkIsMutable()
                r2.checkForComodification()
                int r0 = r2.offset
                int r1 = r2.length
                int r0 = r0 + r1
                r2.addAtInternal(r0, r3)
                r3 = 1
                return r3
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int r3, @org.jetbrains.annotations.NotNull java.util.Collection<? extends E> r4) {
                r2 = this;
                java.lang.String r0 = "elements"
                kotlin.jvm.internal.g0.p(r4, r0)
                r2.checkIsMutable()
                r2.checkForComodification()
                kotlin.collections.d$a r0 = kotlin.collections.d.Companion
                int r1 = r2.length
                r0.c(r3, r1)
                int r0 = r4.size()
                int r1 = r2.offset
                int r1 = r1 + r3
                r2.addAllInternal(r1, r4, r0)
                if (r0 <= 0) goto L20
                r3 = 1
                return r3
            L20:
                r3 = 0
                return r3
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(@org.jetbrains.annotations.NotNull java.util.Collection<? extends E> r4) {
                r3 = this;
                java.lang.String r0 = "elements"
                kotlin.jvm.internal.g0.p(r4, r0)
                r3.checkIsMutable()
                r3.checkForComodification()
                int r0 = r4.size()
                int r1 = r3.offset
                int r2 = r3.length
                int r1 = r1 + r2
                r3.addAllInternal(r1, r4, r0)
                if (r0 <= 0) goto L1b
                r4 = 1
                return r4
            L1b:
                r4 = 0
                return r4
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
                r2 = this;
                r2.checkIsMutable()
                r2.checkForComodification()
                int r0 = r2.offset
                int r1 = r2.length
                r2.removeRangeInternal(r0, r1)
                return
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
                r1 = this;
                r1.checkForComodification()
                if (r2 == r1) goto L14
                boolean r0 = r2 instanceof java.util.List
                if (r0 == 0) goto L12
                java.util.List r2 = (java.util.List) r2
                boolean r2 = r1.contentEquals(r2)
                if (r2 == 0) goto L12
                goto L14
            L12:
                r2 = 0
                return r2
            L14:
                r2 = 1
                return r2
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int r3) {
                r2 = this;
                r2.checkForComodification()
                kotlin.collections.d$a r0 = kotlin.collections.d.Companion
                int r1 = r2.length
                r0.b(r3, r1)
                E[] r0 = r2.backing
                int r1 = r2.offset
                int r1 = r1 + r3
                r3 = r0[r1]
                return r3
        }

        @Override // kotlin.collections.h
        public int getSize() {
                r1 = this;
                r1.checkForComodification()
                int r0 = r1.length
                return r0
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
                r3 = this;
                r3.checkForComodification()
                E[] r0 = r3.backing
                int r1 = r3.offset
                int r2 = r3.length
                int r0 = kotlin.collections.builders.b.b(r0, r1, r2)
                return r0
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(java.lang.Object r4) {
                r3 = this;
                r3.checkForComodification()
                r0 = 0
            L4:
                int r1 = r3.length
                if (r0 >= r1) goto L19
                E[] r1 = r3.backing
                int r2 = r3.offset
                int r2 = r2 + r0
                r1 = r1[r2]
                boolean r1 = kotlin.jvm.internal.g0.g(r1, r4)
                if (r1 == 0) goto L16
                return r0
            L16:
                int r0 = r0 + 1
                goto L4
            L19:
                r4 = -1
                return r4
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
                r1 = this;
                r1.checkForComodification()
                int r0 = r1.length
                if (r0 != 0) goto L9
                r0 = 1
                return r0
            L9:
                r0 = 0
                return r0
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        @org.jetbrains.annotations.NotNull
        public java.util.Iterator<E> iterator() {
                r1 = this;
                r0 = 0
                java.util.ListIterator r0 = r1.listIterator(r0)
                return r0
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(java.lang.Object r4) {
                r3 = this;
                r3.checkForComodification()
                int r0 = r3.length
                int r0 = r0 + (-1)
            L7:
                if (r0 < 0) goto L1a
                E[] r1 = r3.backing
                int r2 = r3.offset
                int r2 = r2 + r0
                r1 = r1[r2]
                boolean r1 = kotlin.jvm.internal.g0.g(r1, r4)
                if (r1 == 0) goto L17
                return r0
            L17:
                int r0 = r0 + (-1)
                goto L7
            L1a:
                r4 = -1
                return r4
        }

        @Override // java.util.AbstractList, java.util.List
        @org.jetbrains.annotations.NotNull
        public java.util.ListIterator<E> listIterator() {
                r1 = this;
                r0 = 0
                java.util.ListIterator r0 = r1.listIterator(r0)
                return r0
        }

        @Override // java.util.AbstractList, java.util.List
        @org.jetbrains.annotations.NotNull
        public java.util.ListIterator<E> listIterator(int r3) {
                r2 = this;
                r2.checkForComodification()
                kotlin.collections.d$a r0 = kotlin.collections.d.Companion
                int r1 = r2.length
                r0.c(r3, r1)
                kotlin.collections.builders.ListBuilder$BuilderSubList$a r0 = new kotlin.collections.builders.ListBuilder$BuilderSubList$a
                r0.<init>(r2, r3)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(java.lang.Object r1) {
                r0 = this;
                r0.checkIsMutable()
                r0.checkForComodification()
                int r1 = r0.indexOf(r1)
                if (r1 < 0) goto Lf
                r0.removeAt(r1)
            Lf:
                if (r1 < 0) goto L13
                r1 = 1
                return r1
            L13:
                r1 = 0
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(@org.jetbrains.annotations.NotNull java.util.Collection<?> r4) {
                r3 = this;
                java.lang.String r0 = "elements"
                kotlin.jvm.internal.g0.p(r4, r0)
                r3.checkIsMutable()
                r3.checkForComodification()
                int r0 = r3.offset
                int r1 = r3.length
                r2 = 0
                int r4 = r3.retainOrRemoveAllInternal(r0, r1, r4, r2)
                if (r4 <= 0) goto L18
                r4 = 1
                return r4
            L18:
                return r2
        }

        @Override // kotlin.collections.h
        public E removeAt(int r3) {
                r2 = this;
                r2.checkIsMutable()
                r2.checkForComodification()
                kotlin.collections.d$a r0 = kotlin.collections.d.Companion
                int r1 = r2.length
                r0.b(r3, r1)
                int r0 = r2.offset
                int r0 = r0 + r3
                java.lang.Object r3 = r2.removeAtInternal(r0)
                return r3
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(@org.jetbrains.annotations.NotNull java.util.Collection<?> r4) {
                r3 = this;
                java.lang.String r0 = "elements"
                kotlin.jvm.internal.g0.p(r4, r0)
                r3.checkIsMutable()
                r3.checkForComodification()
                int r0 = r3.offset
                int r1 = r3.length
                r2 = 1
                int r4 = r3.retainOrRemoveAllInternal(r0, r1, r4, r2)
                if (r4 <= 0) goto L17
                return r2
            L17:
                r4 = 0
                return r4
        }

        @Override // kotlin.collections.h, java.util.AbstractList, java.util.List
        public E set(int r4, E r5) {
                r3 = this;
                r3.checkIsMutable()
                r3.checkForComodification()
                kotlin.collections.d$a r0 = kotlin.collections.d.Companion
                int r1 = r3.length
                r0.b(r4, r1)
                E[] r0 = r3.backing
                int r1 = r3.offset
                int r2 = r1 + r4
                r2 = r0[r2]
                int r1 = r1 + r4
                r0[r1] = r5
                return r2
        }

        @Override // java.util.AbstractList, java.util.List
        @org.jetbrains.annotations.NotNull
        public java.util.List<E> subList(int r9, int r10) {
                r8 = this;
                kotlin.collections.d$a r0 = kotlin.collections.d.Companion
                int r1 = r8.length
                r0.d(r9, r10, r1)
                kotlin.collections.builders.ListBuilder$BuilderSubList r2 = new kotlin.collections.builders.ListBuilder$BuilderSubList
                E[] r3 = r8.backing
                int r0 = r8.offset
                int r4 = r0 + r9
                int r5 = r10 - r9
                kotlin.collections.builders.ListBuilder<E> r7 = r8.root
                r6 = r8
                r2.<init>(r3, r4, r5, r6, r7)
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        @org.jetbrains.annotations.NotNull
        public java.lang.Object[] toArray() {
                r3 = this;
                r3.checkForComodification()
                E[] r0 = r3.backing
                int r1 = r3.offset
                int r2 = r3.length
                int r2 = r2 + r1
                java.lang.Object[] r0 = kotlin.collections.n.l1(r0, r1, r2)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        @org.jetbrains.annotations.NotNull
        public <T> T[] toArray(@org.jetbrains.annotations.NotNull T[] r5) {
                r4 = this;
                java.lang.String r0 = "array"
                kotlin.jvm.internal.g0.p(r5, r0)
                r4.checkForComodification()
                int r0 = r5.length
                int r1 = r4.length
                if (r0 >= r1) goto L20
                E[] r0 = r4.backing
                int r2 = r4.offset
                int r1 = r1 + r2
                java.lang.Class r5 = r5.getClass()
                java.lang.Object[] r5 = java.util.Arrays.copyOfRange(r0, r2, r1, r5)
                java.lang.String r0 = "copyOfRange(...)"
                kotlin.jvm.internal.g0.o(r5, r0)
                return r5
            L20:
                E[] r0 = r4.backing
                int r2 = r4.offset
                int r1 = r1 + r2
                r3 = 0
                kotlin.collections.n.B0(r0, r5, r3, r2, r1)
                int r0 = r4.length
                java.lang.Object[] r5 = kotlin.collections.f0.o(r0, r5)
                return r5
        }

        @Override // java.util.AbstractCollection
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r3 = this;
                r3.checkForComodification()
                E[] r0 = r3.backing
                int r1 = r3.offset
                int r2 = r3.length
                java.lang.String r0 = kotlin.collections.builders.b.c(r0, r1, r2, r3)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class a {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ a(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilder$Itr\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,722:1\n1#2:723\n*E\n"})
    private static final class b<E> implements java.util.ListIterator<E>, l3.f {

        @org.jetbrains.annotations.NotNull
        private final kotlin.collections.builders.ListBuilder<E> a;
        private int b;
        private int c;
        private int d;

        public b(@org.jetbrains.annotations.NotNull kotlin.collections.builders.ListBuilder<E> r2, int r3) {
                r1 = this;
                java.lang.String r0 = "list"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>()
                r1.a = r2
                r1.b = r3
                r3 = -1
                r1.c = r3
                int r2 = kotlin.collections.builders.ListBuilder.m21access$getModCount$p$s2084097795(r2)
                r1.d = r2
                return
        }

        private final void a() {
                r2 = this;
                kotlin.collections.builders.ListBuilder<E> r0 = r2.a
                int r0 = kotlin.collections.builders.ListBuilder.m21access$getModCount$p$s2084097795(r0)
                int r1 = r2.d
                if (r0 != r1) goto Lb
                return
            Lb:
                java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
                r0.<init>()
                throw r0
        }

        @Override // java.util.ListIterator
        public void add(E r4) {
                r3 = this;
                r3.a()
                kotlin.collections.builders.ListBuilder<E> r0 = r3.a
                int r1 = r3.b
                int r2 = r1 + 1
                r3.b = r2
                r0.add(r1, r4)
                r4 = -1
                r3.c = r4
                kotlin.collections.builders.ListBuilder<E> r4 = r3.a
                int r4 = kotlin.collections.builders.ListBuilder.m21access$getModCount$p$s2084097795(r4)
                r3.d = r4
                return
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.b
                kotlin.collections.builders.ListBuilder<E> r1 = r2.a
                int r1 = kotlin.collections.builders.ListBuilder.access$getLength$p(r1)
                if (r0 >= r1) goto Lc
                r0 = 1
                return r0
            Lc:
                r0 = 0
                return r0
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
                r1 = this;
                int r0 = r1.b
                if (r0 <= 0) goto L6
                r0 = 1
                return r0
            L6:
                r0 = 0
                return r0
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
                r2 = this;
                r2.a()
                int r0 = r2.b
                kotlin.collections.builders.ListBuilder<E> r1 = r2.a
                int r1 = kotlin.collections.builders.ListBuilder.access$getLength$p(r1)
                if (r0 >= r1) goto L20
                int r0 = r2.b
                int r1 = r0 + 1
                r2.b = r1
                r2.c = r0
                kotlin.collections.builders.ListBuilder<E> r0 = r2.a
                java.lang.Object[] r0 = kotlin.collections.builders.ListBuilder.access$getBacking$p(r0)
                int r1 = r2.c
                r0 = r0[r1]
                return r0
            L20:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
                r1 = this;
                int r0 = r1.b
                return r0
        }

        @Override // java.util.ListIterator
        public E previous() {
                r2 = this;
                r2.a()
                int r0 = r2.b
                if (r0 <= 0) goto L18
                int r0 = r0 + (-1)
                r2.b = r0
                r2.c = r0
                kotlin.collections.builders.ListBuilder<E> r0 = r2.a
                java.lang.Object[] r0 = kotlin.collections.builders.ListBuilder.access$getBacking$p(r0)
                int r1 = r2.c
                r0 = r0[r1]
                return r0
            L18:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
                r1 = this;
                int r0 = r1.b
                int r0 = r0 + (-1)
                return r0
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
                r3 = this;
                r3.a()
                int r0 = r3.c
                r1 = -1
                if (r0 == r1) goto L1c
                kotlin.collections.builders.ListBuilder<E> r2 = r3.a
                r2.removeAt(r0)
                int r0 = r3.c
                r3.b = r0
                r3.c = r1
                kotlin.collections.builders.ListBuilder<E> r0 = r3.a
                int r0 = kotlin.collections.builders.ListBuilder.m21access$getModCount$p$s2084097795(r0)
                r3.d = r0
                return
            L1c:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Call next() or previous() before removing element from the iterator."
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.ListIterator
        public void set(E r3) {
                r2 = this;
                r2.a()
                int r0 = r2.c
                r1 = -1
                if (r0 == r1) goto Le
                kotlin.collections.builders.ListBuilder<E> r1 = r2.a
                r1.set(r0, r3)
                return
            Le:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "Call next() or previous() before replacing element from the iterator."
                r3.<init>(r0)
                throw r3
        }
    }

    static {
            kotlin.collections.builders.ListBuilder$a r0 = new kotlin.collections.builders.ListBuilder$a
            r1 = 0
            r0.<init>(r1)
            kotlin.collections.builders.ListBuilder.Companion = r0
            kotlin.collections.builders.ListBuilder r0 = new kotlin.collections.builders.ListBuilder
            r1 = 0
            r0.<init>(r1)
            r1 = 1
            r0.isReadOnly = r1
            kotlin.collections.builders.ListBuilder.Empty = r0
            return
    }

    public ListBuilder() {
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            r3.<init>(r2, r0, r1)
            return
    }

    public ListBuilder(int r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object[] r1 = kotlin.collections.builders.b.d(r1)
            r0.backing = r1
            return
    }

    public /* synthetic */ ListBuilder(int r1, int r2, kotlin.jvm.internal.v r3) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L6
            r1 = 10
        L6:
            r0.<init>(r1)
            return
    }

    public static final /* synthetic */ void access$addAllInternal(kotlin.collections.builders.ListBuilder r0, int r1, java.util.Collection r2, int r3) {
            r0.addAllInternal(r1, r2, r3)
            return
    }

    public static final /* synthetic */ void access$addAtInternal(kotlin.collections.builders.ListBuilder r0, int r1, java.lang.Object r2) {
            r0.addAtInternal(r1, r2)
            return
    }

    public static final /* synthetic */ java.lang.Object[] access$getBacking$p(kotlin.collections.builders.ListBuilder r0) {
            E[] r0 = r0.backing
            return r0
    }

    public static final /* synthetic */ int access$getLength$p(kotlin.collections.builders.ListBuilder r0) {
            int r0 = r0.length
            return r0
    }

    /* renamed from: access$getModCount$p$s-2084097795, reason: not valid java name */
    public static final /* synthetic */ int m21access$getModCount$p$s2084097795(kotlin.collections.builders.ListBuilder r0) {
            int r0 = r0.modCount
            return r0
    }

    public static final /* synthetic */ boolean access$isReadOnly$p(kotlin.collections.builders.ListBuilder r0) {
            boolean r0 = r0.isReadOnly
            return r0
    }

    public static final /* synthetic */ java.lang.Object access$removeAtInternal(kotlin.collections.builders.ListBuilder r0, int r1) {
            java.lang.Object r0 = r0.removeAtInternal(r1)
            return r0
    }

    public static final /* synthetic */ void access$removeRangeInternal(kotlin.collections.builders.ListBuilder r0, int r1, int r2) {
            r0.removeRangeInternal(r1, r2)
            return
    }

    public static final /* synthetic */ int access$retainOrRemoveAllInternal(kotlin.collections.builders.ListBuilder r0, int r1, int r2, java.util.Collection r3, boolean r4) {
            int r0 = r0.retainOrRemoveAllInternal(r1, r2, r3, r4)
            return r0
    }

    private final void addAllInternal(int r5, java.util.Collection<? extends E> r6, int r7) {
            r4 = this;
            r4.registerModification()
            r4.insertAtInternal(r5, r7)
            java.util.Iterator r6 = r6.iterator()
            r0 = 0
        Lb:
            if (r0 >= r7) goto L1a
            E[] r1 = r4.backing
            int r2 = r5 + r0
            java.lang.Object r3 = r6.next()
            r1[r2] = r3
            int r0 = r0 + 1
            goto Lb
        L1a:
            return
    }

    private final void addAtInternal(int r2, E r3) {
            r1 = this;
            r1.registerModification()
            r0 = 1
            r1.insertAtInternal(r2, r0)
            E[] r0 = r1.backing
            r0[r2] = r3
            return
    }

    private final void checkIsMutable() {
            r1 = this;
            boolean r0 = r1.isReadOnly
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    private final boolean contentEquals(java.util.List<?> r4) {
            r3 = this;
            E[] r0 = r3.backing
            r1 = 0
            int r2 = r3.length
            boolean r4 = kotlin.collections.builders.b.a(r0, r1, r2, r4)
            return r4
    }

    private final void ensureCapacityInternal(int r3) {
            r2 = this;
            if (r3 < 0) goto L17
            E[] r0 = r2.backing
            int r1 = r0.length
            if (r3 <= r1) goto L16
            kotlin.collections.d$a r1 = kotlin.collections.d.Companion
            int r0 = r0.length
            int r3 = r1.e(r0, r3)
            E[] r0 = r2.backing
            java.lang.Object[] r3 = kotlin.collections.builders.b.e(r0, r3)
            r2.backing = r3
        L16:
            return
        L17:
            java.lang.OutOfMemoryError r3 = new java.lang.OutOfMemoryError
            r3.<init>()
            throw r3
    }

    private final void ensureExtraCapacity(int r2) {
            r1 = this;
            int r0 = r1.length
            int r0 = r0 + r2
            r1.ensureCapacityInternal(r0)
            return
    }

    private final void insertAtInternal(int r4, int r5) {
            r3 = this;
            r3.ensureExtraCapacity(r5)
            E[] r0 = r3.backing
            int r1 = r3.length
            int r2 = r4 + r5
            kotlin.collections.n.B0(r0, r0, r2, r4, r1)
            int r4 = r3.length
            int r4 = r4 + r5
            r3.length = r4
            return
    }

    private final void registerModification() {
            r1 = this;
            int r0 = r1.modCount
            int r0 = r0 + 1
            r1.modCount = r0
            return
    }

    private final E removeAtInternal(int r5) {
            r4 = this;
            r4.registerModification()
            E[] r0 = r4.backing
            r1 = r0[r5]
            int r2 = r5 + 1
            int r3 = r4.length
            kotlin.collections.n.B0(r0, r0, r5, r2, r3)
            E[] r5 = r4.backing
            int r0 = r4.length
            int r0 = r0 + (-1)
            kotlin.collections.builders.b.f(r5, r0)
            int r5 = r4.length
            int r5 = r5 + (-1)
            r4.length = r5
            return r1
    }

    private final void removeRangeInternal(int r4, int r5) {
            r3 = this;
            if (r5 <= 0) goto L5
            r3.registerModification()
        L5:
            E[] r0 = r3.backing
            int r1 = r4 + r5
            int r2 = r3.length
            kotlin.collections.n.B0(r0, r0, r4, r1, r2)
            E[] r4 = r3.backing
            int r0 = r3.length
            int r1 = r0 - r5
            kotlin.collections.builders.b.g(r4, r1, r0)
            int r4 = r3.length
            int r4 = r4 - r5
            r3.length = r4
            return
    }

    private final int retainOrRemoveAllInternal(int r6, int r7, java.util.Collection<? extends E> r8, boolean r9) {
            r5 = this;
            r0 = 0
            r1 = 0
        L2:
            if (r0 >= r7) goto L20
            E[] r2 = r5.backing
            int r3 = r6 + r0
            r2 = r2[r3]
            boolean r2 = r8.contains(r2)
            if (r2 != r9) goto L1d
            E[] r2 = r5.backing
            int r4 = r1 + 1
            int r1 = r1 + r6
            int r0 = r0 + 1
            r3 = r2[r3]
            r2[r1] = r3
            r1 = r4
            goto L2
        L1d:
            int r0 = r0 + 1
            goto L2
        L20:
            int r8 = r7 - r1
            E[] r9 = r5.backing
            int r7 = r7 + r6
            int r0 = r5.length
            int r6 = r6 + r1
            kotlin.collections.n.B0(r9, r9, r6, r7, r0)
            E[] r6 = r5.backing
            int r7 = r5.length
            int r9 = r7 - r8
            kotlin.collections.builders.b.g(r6, r9, r7)
            if (r8 <= 0) goto L39
            r5.registerModification()
        L39:
            int r6 = r5.length
            int r6 = r6 - r8
            r5.length = r6
            return r8
    }

    private final java.lang.Object writeReplace() {
            r2 = this;
            boolean r0 = r2.isReadOnly
            if (r0 == 0) goto Lb
            kotlin.collections.builders.SerializedCollection r0 = new kotlin.collections.builders.SerializedCollection
            r1 = 0
            r0.<init>(r2, r1)
            return r0
        Lb:
            java.io.NotSerializableException r0 = new java.io.NotSerializableException
            java.lang.String r1 = "The list cannot be serialized while it is being built."
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlin.collections.h, java.util.AbstractList, java.util.List
    public void add(int r3, E r4) {
            r2 = this;
            r2.checkIsMutable()
            kotlin.collections.d$a r0 = kotlin.collections.d.Companion
            int r1 = r2.length
            r0.c(r3, r1)
            r2.addAtInternal(r3, r4)
            return
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E r2) {
            r1 = this;
            r1.checkIsMutable()
            int r0 = r1.length
            r1.addAtInternal(r0, r2)
            r2 = 1
            return r2
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int r3, @org.jetbrains.annotations.NotNull java.util.Collection<? extends E> r4) {
            r2 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r4, r0)
            r2.checkIsMutable()
            kotlin.collections.d$a r0 = kotlin.collections.d.Companion
            int r1 = r2.length
            r0.c(r3, r1)
            int r0 = r4.size()
            r2.addAllInternal(r3, r4, r0)
            if (r0 <= 0) goto L1a
            r3 = 1
            return r3
        L1a:
            r3 = 0
            return r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@org.jetbrains.annotations.NotNull java.util.Collection<? extends E> r3) {
            r2 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r3, r0)
            r2.checkIsMutable()
            int r0 = r3.size()
            int r1 = r2.length
            r2.addAllInternal(r1, r3, r0)
            if (r0 <= 0) goto L15
            r3 = 1
            return r3
        L15:
            r3 = 0
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<E> build() {
            r1 = this;
            r1.checkIsMutable()
            r0 = 1
            r1.isReadOnly = r0
            int r0 = r1.length
            if (r0 <= 0) goto Lb
            return r1
        Lb:
            kotlin.collections.builders.ListBuilder r0 = kotlin.collections.builders.ListBuilder.Empty
            return r0
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
            r2 = this;
            r2.checkIsMutable()
            r0 = 0
            int r1 = r2.length
            r2.removeRangeInternal(r0, r1)
            return
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r1 = this;
            if (r2 == r1) goto L11
            boolean r0 = r2 instanceof java.util.List
            if (r0 == 0) goto Lf
            java.util.List r2 = (java.util.List) r2
            boolean r2 = r1.contentEquals(r2)
            if (r2 == 0) goto Lf
            goto L11
        Lf:
            r2 = 0
            return r2
        L11:
            r2 = 1
            return r2
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int r3) {
            r2 = this;
            kotlin.collections.d$a r0 = kotlin.collections.d.Companion
            int r1 = r2.length
            r0.b(r3, r1)
            E[] r0 = r2.backing
            r3 = r0[r3]
            return r3
    }

    @Override // kotlin.collections.h
    public int getSize() {
            r1 = this;
            int r0 = r1.length
            return r0
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
            r3 = this;
            E[] r0 = r3.backing
            r1 = 0
            int r2 = r3.length
            int r0 = kotlin.collections.builders.b.b(r0, r1, r2)
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(java.lang.Object r3) {
            r2 = this;
            r0 = 0
        L1:
            int r1 = r2.length
            if (r0 >= r1) goto L13
            E[] r1 = r2.backing
            r1 = r1[r0]
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 == 0) goto L10
            return r0
        L10:
            int r0 = r0 + 1
            goto L1
        L13:
            r3 = -1
            return r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.length
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<E> iterator() {
            r1 = this;
            r0 = 0
            java.util.ListIterator r0 = r1.listIterator(r0)
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.length
            int r0 = r0 + (-1)
        L4:
            if (r0 < 0) goto L14
            E[] r1 = r2.backing
            r1 = r1[r0]
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 == 0) goto L11
            return r0
        L11:
            int r0 = r0 + (-1)
            goto L4
        L14:
            r3 = -1
            return r3
    }

    @Override // java.util.AbstractList, java.util.List
    @org.jetbrains.annotations.NotNull
    public java.util.ListIterator<E> listIterator() {
            r1 = this;
            r0 = 0
            java.util.ListIterator r0 = r1.listIterator(r0)
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    @org.jetbrains.annotations.NotNull
    public java.util.ListIterator<E> listIterator(int r3) {
            r2 = this;
            kotlin.collections.d$a r0 = kotlin.collections.d.Companion
            int r1 = r2.length
            r0.c(r3, r1)
            kotlin.collections.builders.ListBuilder$b r0 = new kotlin.collections.builders.ListBuilder$b
            r0.<init>(r2, r3)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(java.lang.Object r1) {
            r0 = this;
            r0.checkIsMutable()
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto Lc
            r0.removeAt(r1)
        Lc:
            if (r1 < 0) goto L10
            r1 = 1
            return r1
        L10:
            r1 = 0
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@org.jetbrains.annotations.NotNull java.util.Collection<?> r3) {
            r2 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r3, r0)
            r2.checkIsMutable()
            int r0 = r2.length
            r1 = 0
            int r3 = r2.retainOrRemoveAllInternal(r1, r0, r3, r1)
            if (r3 <= 0) goto L13
            r3 = 1
            return r3
        L13:
            return r1
    }

    @Override // kotlin.collections.h
    public E removeAt(int r3) {
            r2 = this;
            r2.checkIsMutable()
            kotlin.collections.d$a r0 = kotlin.collections.d.Companion
            int r1 = r2.length
            r0.b(r3, r1)
            java.lang.Object r3 = r2.removeAtInternal(r3)
            return r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@org.jetbrains.annotations.NotNull java.util.Collection<?> r4) {
            r3 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r4, r0)
            r3.checkIsMutable()
            int r0 = r3.length
            r1 = 0
            r2 = 1
            int r4 = r3.retainOrRemoveAllInternal(r1, r0, r4, r2)
            if (r4 <= 0) goto L13
            return r2
        L13:
            return r1
    }

    @Override // kotlin.collections.h, java.util.AbstractList, java.util.List
    public E set(int r3, E r4) {
            r2 = this;
            r2.checkIsMutable()
            kotlin.collections.d$a r0 = kotlin.collections.d.Companion
            int r1 = r2.length
            r0.b(r3, r1)
            E[] r0 = r2.backing
            r1 = r0[r3]
            r0[r3] = r4
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    @org.jetbrains.annotations.NotNull
    public java.util.List<E> subList(int r9, int r10) {
            r8 = this;
            kotlin.collections.d$a r0 = kotlin.collections.d.Companion
            int r1 = r8.length
            r0.d(r9, r10, r1)
            kotlin.collections.builders.ListBuilder$BuilderSubList r2 = new kotlin.collections.builders.ListBuilder$BuilderSubList
            E[] r3 = r8.backing
            int r5 = r10 - r9
            r6 = 0
            r7 = r8
            r4 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @org.jetbrains.annotations.NotNull
    public java.lang.Object[] toArray() {
            r3 = this;
            E[] r0 = r3.backing
            r1 = 0
            int r2 = r3.length
            java.lang.Object[] r0 = kotlin.collections.n.l1(r0, r1, r2)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @org.jetbrains.annotations.NotNull
    public <T> T[] toArray(@org.jetbrains.annotations.NotNull T[] r4) {
            r3 = this;
            java.lang.String r0 = "array"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r4.length
            int r1 = r3.length
            r2 = 0
            if (r0 >= r1) goto L1b
            E[] r0 = r3.backing
            java.lang.Class r4 = r4.getClass()
            java.lang.Object[] r4 = java.util.Arrays.copyOfRange(r0, r2, r1, r4)
            java.lang.String r0 = "copyOfRange(...)"
            kotlin.jvm.internal.g0.o(r4, r0)
            return r4
        L1b:
            E[] r0 = r3.backing
            kotlin.collections.n.B0(r0, r4, r2, r2, r1)
            int r0 = r3.length
            java.lang.Object[] r4 = kotlin.collections.f0.o(r0, r4)
            return r4
    }

    @Override // java.util.AbstractCollection
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r3 = this;
            E[] r0 = r3.backing
            r1 = 0
            int r2 = r3.length
            java.lang.String r0 = kotlin.collections.builders.b.c(r0, r1, r2, r3)
            return r0
    }
}
