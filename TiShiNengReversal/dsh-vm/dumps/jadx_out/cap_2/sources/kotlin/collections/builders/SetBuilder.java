package kotlin.collections.builders;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class SetBuilder<E> extends kotlin.collections.j<E> implements java.util.Set<E>, java.io.Serializable, l3.h {

    @org.jetbrains.annotations.NotNull
    private static final kotlin.collections.builders.SetBuilder.a Companion = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.collections.builders.SetBuilder Empty = null;

    @org.jetbrains.annotations.NotNull
    private final kotlin.collections.builders.MapBuilder<E, ?> backing;

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

    static {
            kotlin.collections.builders.SetBuilder$a r0 = new kotlin.collections.builders.SetBuilder$a
            r1 = 0
            r0.<init>(r1)
            kotlin.collections.builders.SetBuilder.Companion = r0
            kotlin.collections.builders.SetBuilder r0 = new kotlin.collections.builders.SetBuilder
            kotlin.collections.builders.MapBuilder$a r1 = kotlin.collections.builders.MapBuilder.Companion
            kotlin.collections.builders.MapBuilder r1 = r1.e()
            r0.<init>(r1)
            kotlin.collections.builders.SetBuilder.Empty = r0
            return
    }

    public SetBuilder() {
            r1 = this;
            kotlin.collections.builders.MapBuilder r0 = new kotlin.collections.builders.MapBuilder
            r0.<init>()
            r1.<init>(r0)
            return
    }

    public SetBuilder(int r2) {
            r1 = this;
            kotlin.collections.builders.MapBuilder r0 = new kotlin.collections.builders.MapBuilder
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    public SetBuilder(@org.jetbrains.annotations.NotNull kotlin.collections.builders.MapBuilder<E, ?> r2) {
            r1 = this;
            java.lang.String r0 = "backing"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.backing = r2
            return
    }

    private final void readObject(java.io.ObjectInputStream r2) {
            r1 = this;
            java.io.InvalidObjectException r2 = new java.io.InvalidObjectException
            java.lang.String r0 = "Deserialization is supported via proxy only"
            r2.<init>(r0)
            throw r2
    }

    private final java.lang.Object writeReplace() {
            r2 = this;
            kotlin.collections.builders.MapBuilder<E, ?> r0 = r2.backing
            boolean r0 = r0.isReadOnly$kotlin_stdlib()
            if (r0 == 0) goto Lf
            kotlin.collections.builders.SerializedCollection r0 = new kotlin.collections.builders.SerializedCollection
            r1 = 1
            r0.<init>(r2, r1)
            return r0
        Lf:
            java.io.NotSerializableException r0 = new java.io.NotSerializableException
            java.lang.String r1 = "The set cannot be serialized while it is being built."
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlin.collections.j, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E r2) {
            r1 = this;
            kotlin.collections.builders.MapBuilder<E, ?> r0 = r1.backing
            int r2 = r0.addKey$kotlin_stdlib(r2)
            if (r2 < 0) goto La
            r2 = 1
            return r2
        La:
            r2 = 0
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(@org.jetbrains.annotations.NotNull java.util.Collection<? extends E> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.collections.builders.MapBuilder<E, ?> r0 = r1.backing
            r0.checkIsMutable$kotlin_stdlib()
            boolean r2 = super.addAll(r2)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Set<E> build() {
            r1 = this;
            kotlin.collections.builders.MapBuilder<E, ?> r0 = r1.backing
            r0.build()
            int r0 = r1.size()
            if (r0 <= 0) goto Lc
            return r1
        Lc:
            kotlin.collections.builders.SetBuilder r0 = kotlin.collections.builders.SetBuilder.Empty
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
            r1 = this;
            kotlin.collections.builders.MapBuilder<E, ?> r0 = r1.backing
            r0.clear()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object r2) {
            r1 = this;
            kotlin.collections.builders.MapBuilder<E, ?> r0 = r1.backing
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @Override // kotlin.collections.j
    public int getSize() {
            r1 = this;
            kotlin.collections.builders.MapBuilder<E, ?> r0 = r1.backing
            int r0 = r0.size()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
            r1 = this;
            kotlin.collections.builders.MapBuilder<E, ?> r0 = r1.backing
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<E> iterator() {
            r1 = this;
            kotlin.collections.builders.MapBuilder<E, ?> r0 = r1.backing
            kotlin.collections.builders.MapBuilder$e r0 = r0.keysIterator$kotlin_stdlib()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(java.lang.Object r2) {
            r1 = this;
            kotlin.collections.builders.MapBuilder<E, ?> r0 = r1.backing
            boolean r2 = r0.removeKey$kotlin_stdlib(r2)
            return r2
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(@org.jetbrains.annotations.NotNull java.util.Collection<?> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.collections.builders.MapBuilder<E, ?> r0 = r1.backing
            r0.checkIsMutable$kotlin_stdlib()
            boolean r2 = super.removeAll(r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(@org.jetbrains.annotations.NotNull java.util.Collection<?> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.collections.builders.MapBuilder<E, ?> r0 = r1.backing
            r0.checkIsMutable$kotlin_stdlib()
            boolean r2 = super.retainAll(r2)
            return r2
    }
}
