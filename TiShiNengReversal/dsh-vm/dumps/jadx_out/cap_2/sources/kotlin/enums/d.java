package kotlin.enums;

import java.lang.Enum;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "1.8")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class d<T extends java.lang.Enum<T>> extends kotlin.collections.d<T> implements kotlin.enums.a<T>, java.io.Serializable {

    @org.jetbrains.annotations.NotNull
    private final T[] a;

    public d(@org.jetbrains.annotations.NotNull T[] r2) {
            r1 = this;
            java.lang.String r0 = "entries"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
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
            kotlin.enums.EnumEntriesSerializationProxy r0 = new kotlin.enums.EnumEntriesSerializationProxy
            T extends java.lang.Enum<T>[] r1 = r2.a
            r0.<init>(r1)
            return r0
    }

    @Override // kotlin.collections.b, java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.Enum
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            java.lang.Enum r2 = (java.lang.Enum) r2
            boolean r2 = r1.e(r2)
            return r2
    }

    public boolean e(@org.jetbrains.annotations.NotNull T r3) {
            r2 = this;
            java.lang.String r0 = "element"
            kotlin.jvm.internal.g0.p(r3, r0)
            T extends java.lang.Enum<T>[] r0 = r2.a
            int r1 = r3.ordinal()
            java.lang.Object r0 = kotlin.collections.n.hf(r0, r1)
            java.lang.Enum r0 = (java.lang.Enum) r0
            if (r0 != r3) goto L15
            r3 = 1
            return r3
        L15:
            r3 = 0
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public T f(int r3) {
            r2 = this;
            kotlin.collections.d$a r0 = kotlin.collections.d.Companion
            T extends java.lang.Enum<T>[] r1 = r2.a
            int r1 = r1.length
            r0.b(r3, r1)
            T extends java.lang.Enum<T>[] r0 = r2.a
            r3 = r0[r3]
            return r3
    }

    public int g(@org.jetbrains.annotations.NotNull T r3) {
            r2 = this;
            java.lang.String r0 = "element"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r0 = r3.ordinal()
            T extends java.lang.Enum<T>[] r1 = r2.a
            java.lang.Object r1 = kotlin.collections.n.hf(r1, r0)
            java.lang.Enum r1 = (java.lang.Enum) r1
            if (r1 != r3) goto L14
            return r0
        L14:
            r3 = -1
            return r3
    }

    @Override // kotlin.collections.d, java.util.List
    public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
            r0 = this;
            java.lang.Enum r1 = r0.f(r1)
            return r1
    }

    @Override // kotlin.collections.d, kotlin.collections.b
    public int getSize() {
            r1 = this;
            T extends java.lang.Enum<T>[] r0 = r1.a
            int r0 = r0.length
            return r0
    }

    @Override // kotlin.collections.d, java.util.List
    public final /* bridge */ int indexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.Enum
            if (r0 != 0) goto L6
            r2 = -1
            return r2
        L6:
            java.lang.Enum r2 = (java.lang.Enum) r2
            int r2 = r1.g(r2)
            return r2
    }

    public int j(@org.jetbrains.annotations.NotNull T r2) {
            r1 = this;
            java.lang.String r0 = "element"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r2 = r1.g(r2)
            return r2
    }

    @Override // kotlin.collections.d, java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.Enum
            if (r0 != 0) goto L6
            r2 = -1
            return r2
        L6:
            java.lang.Enum r2 = (java.lang.Enum) r2
            int r2 = r1.j(r2)
            return r2
    }
}
