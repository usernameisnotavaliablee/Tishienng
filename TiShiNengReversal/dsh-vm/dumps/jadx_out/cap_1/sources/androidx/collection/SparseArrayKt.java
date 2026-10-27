package androidx.collection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class SparseArrayKt {
    public static final <T> boolean contains(@org.jetbrains.annotations.NotNull androidx.collection.SparseArrayCompat<T> r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r1 = r1.containsKey(r2)
            return r1
    }

    public static final <T> void forEach(@org.jetbrains.annotations.NotNull androidx.collection.SparseArrayCompat<T> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, kotlin.n1> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.g0.p(r5, r0)
            int r0 = r4.size()
            r1 = 0
        Lf:
            if (r1 >= r0) goto L23
            int r2 = r4.keyAt(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r3 = r4.valueAt(r1)
            r5.invoke(r2, r3)
            int r1 = r1 + 1
            goto Lf
        L23:
            return
    }

    public static final <T> T getOrDefault(@org.jetbrains.annotations.NotNull androidx.collection.SparseArrayCompat<T> r1, int r2, T r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Object r1 = r1.get(r2, r3)
            return r1
    }

    public static final <T> T getOrElse(@org.jetbrains.annotations.NotNull androidx.collection.SparseArrayCompat<T> r1, int r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "defaultValue"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.Object r1 = r1.get(r2)
            if (r1 != 0) goto L14
            java.lang.Object r1 = r3.invoke()
        L14:
            return r1
    }

    public static final <T> int getSize(@org.jetbrains.annotations.NotNull androidx.collection.SparseArrayCompat<T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r1 = r1.size()
            return r1
    }

    public static final <T> boolean isNotEmpty(@org.jetbrains.annotations.NotNull androidx.collection.SparseArrayCompat<T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlin.collections.d1 keyIterator(@org.jetbrains.annotations.NotNull androidx.collection.SparseArrayCompat<T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            androidx.collection.SparseArrayKt$keyIterator$1 r0 = new androidx.collection.SparseArrayKt$keyIterator$1
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> androidx.collection.SparseArrayCompat<T> plus(@org.jetbrains.annotations.NotNull androidx.collection.SparseArrayCompat<T> r3, @org.jetbrains.annotations.NotNull androidx.collection.SparseArrayCompat<T> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r4, r0)
            androidx.collection.SparseArrayCompat r0 = new androidx.collection.SparseArrayCompat
            int r1 = r3.size()
            int r2 = r4.size()
            int r1 = r1 + r2
            r0.<init>(r1)
            r0.putAll(r3)
            r0.putAll(r4)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Replaced with member function. Remove extension import!")
    public static final /* synthetic */ boolean remove(androidx.collection.SparseArrayCompat r1, int r2, java.lang.Object r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r1 = r1.remove(r2, r3)
            return r1
    }

    public static final <T> void set(@org.jetbrains.annotations.NotNull androidx.collection.SparseArrayCompat<T> r1, int r2, T r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r1.put(r2, r3)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.Iterator<T> valueIterator(@org.jetbrains.annotations.NotNull androidx.collection.SparseArrayCompat<T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            androidx.collection.SparseArrayKt$valueIterator$1 r0 = new androidx.collection.SparseArrayKt$valueIterator$1
            r0.<init>(r1)
            return r0
    }
}
