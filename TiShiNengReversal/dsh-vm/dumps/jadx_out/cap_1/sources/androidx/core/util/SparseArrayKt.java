package androidx.core.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSparseArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseArray.kt\nandroidx/core/util/SparseArrayKt\n*L\n1#1,94:1\n76#1,4:95\n*S KotlinDebug\n*F\n+ 1 SparseArray.kt\nandroidx/core/util/SparseArrayKt\n*L\n72#1:95,4\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class SparseArrayKt {
    public static final <T> boolean contains(@org.jetbrains.annotations.NotNull android.util.SparseArray<T> r0, int r1) {
            int r0 = r0.indexOfKey(r1)
            if (r0 < 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public static final <T> boolean containsKey(@org.jetbrains.annotations.NotNull android.util.SparseArray<T> r0, int r1) {
            int r0 = r0.indexOfKey(r1)
            if (r0 < 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public static final <T> boolean containsValue(@org.jetbrains.annotations.NotNull android.util.SparseArray<T> r0, T r1) {
            int r0 = r0.indexOfValue(r1)
            if (r0 < 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public static final <T> void forEach(@org.jetbrains.annotations.NotNull android.util.SparseArray<T> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, kotlin.n1> r5) {
            int r0 = r4.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L19
            int r2 = r4.keyAt(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r3 = r4.valueAt(r1)
            r5.invoke(r2, r3)
            int r1 = r1 + 1
            goto L5
        L19:
            return
    }

    public static final <T> T getOrDefault(@org.jetbrains.annotations.NotNull android.util.SparseArray<T> r0, int r1, T r2) {
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto L7
            return r2
        L7:
            return r0
    }

    public static final <T> T getOrElse(@org.jetbrains.annotations.NotNull android.util.SparseArray<T> r0, int r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r2) {
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto La
            java.lang.Object r0 = r2.invoke()
        La:
            return r0
    }

    public static final <T> int getSize(@org.jetbrains.annotations.NotNull android.util.SparseArray<T> r0) {
            int r0 = r0.size()
            return r0
    }

    public static final <T> boolean isEmpty(@org.jetbrains.annotations.NotNull android.util.SparseArray<T> r0) {
            int r0 = r0.size()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public static final <T> boolean isNotEmpty(@org.jetbrains.annotations.NotNull android.util.SparseArray<T> r0) {
            int r0 = r0.size()
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlin.collections.d1 keyIterator(@org.jetbrains.annotations.NotNull android.util.SparseArray<T> r1) {
            androidx.core.util.SparseArrayKt$keyIterator$1 r0 = new androidx.core.util.SparseArrayKt$keyIterator$1
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> android.util.SparseArray<T> plus(@org.jetbrains.annotations.NotNull android.util.SparseArray<T> r3, @org.jetbrains.annotations.NotNull android.util.SparseArray<T> r4) {
            android.util.SparseArray r0 = new android.util.SparseArray
            int r1 = r3.size()
            int r2 = r4.size()
            int r1 = r1 + r2
            r0.<init>(r1)
            putAll(r0, r3)
            putAll(r0, r4)
            return r0
    }

    public static final <T> void putAll(@org.jetbrains.annotations.NotNull android.util.SparseArray<T> r4, @org.jetbrains.annotations.NotNull android.util.SparseArray<T> r5) {
            int r0 = r5.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L15
            int r2 = r5.keyAt(r1)
            java.lang.Object r3 = r5.valueAt(r1)
            r4.put(r2, r3)
            int r1 = r1 + 1
            goto L5
        L15:
            return
    }

    public static final <T> boolean remove(@org.jetbrains.annotations.NotNull android.util.SparseArray<T> r1, int r2, T r3) {
            int r2 = r1.indexOfKey(r2)
            if (r2 < 0) goto L15
            java.lang.Object r0 = r1.valueAt(r2)
            boolean r3 = kotlin.jvm.internal.g0.g(r3, r0)
            if (r3 == 0) goto L15
            r1.removeAt(r2)
            r1 = 1
            return r1
        L15:
            r1 = 0
            return r1
    }

    public static final <T> void set(@org.jetbrains.annotations.NotNull android.util.SparseArray<T> r0, int r1, T r2) {
            r0.put(r1, r2)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.Iterator<T> valueIterator(@org.jetbrains.annotations.NotNull android.util.SparseArray<T> r1) {
            androidx.core.util.SparseArrayKt$valueIterator$1 r0 = new androidx.core.util.SparseArrayKt$valueIterator$1
            r0.<init>(r1)
            return r0
    }
}
