package androidx.core.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSparseIntArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseIntArray.kt\nandroidx/core/util/SparseIntArrayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n75#1,4:95\n1#2:94\n*S KotlinDebug\n*F\n+ 1 SparseIntArray.kt\nandroidx/core/util/SparseIntArrayKt\n*L\n71#1:95,4\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class SparseIntArrayKt {
    public static final boolean contains(@org.jetbrains.annotations.NotNull android.util.SparseIntArray r0, int r1) {
            int r0 = r0.indexOfKey(r1)
            if (r0 < 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public static final boolean containsKey(@org.jetbrains.annotations.NotNull android.util.SparseIntArray r0, int r1) {
            int r0 = r0.indexOfKey(r1)
            if (r0 < 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public static final boolean containsValue(@org.jetbrains.annotations.NotNull android.util.SparseIntArray r0, int r1) {
            int r0 = r0.indexOfValue(r1)
            if (r0 < 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public static final void forEach(@org.jetbrains.annotations.NotNull android.util.SparseIntArray r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, kotlin.n1> r5) {
            int r0 = r4.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L1d
            int r2 = r4.keyAt(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r4.valueAt(r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5.invoke(r2, r3)
            int r1 = r1 + 1
            goto L5
        L1d:
            return
    }

    public static final int getOrDefault(@org.jetbrains.annotations.NotNull android.util.SparseIntArray r0, int r1, int r2) {
            int r0 = r0.get(r1, r2)
            return r0
    }

    public static final int getOrElse(@org.jetbrains.annotations.NotNull android.util.SparseIntArray r0, int r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<java.lang.Integer> r2) {
            int r1 = r0.indexOfKey(r1)
            if (r1 < 0) goto Lb
            int r0 = r0.valueAt(r1)
            return r0
        Lb:
            java.lang.Object r0 = r2.invoke()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            return r0
    }

    public static final int getSize(@org.jetbrains.annotations.NotNull android.util.SparseIntArray r0) {
            int r0 = r0.size()
            return r0
    }

    public static final boolean isEmpty(@org.jetbrains.annotations.NotNull android.util.SparseIntArray r0) {
            int r0 = r0.size()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public static final boolean isNotEmpty(@org.jetbrains.annotations.NotNull android.util.SparseIntArray r0) {
            int r0 = r0.size()
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.collections.d1 keyIterator(@org.jetbrains.annotations.NotNull android.util.SparseIntArray r1) {
            androidx.core.util.SparseIntArrayKt$keyIterator$1 r0 = new androidx.core.util.SparseIntArrayKt$keyIterator$1
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.util.SparseIntArray plus(@org.jetbrains.annotations.NotNull android.util.SparseIntArray r3, @org.jetbrains.annotations.NotNull android.util.SparseIntArray r4) {
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            int r1 = r3.size()
            int r2 = r4.size()
            int r1 = r1 + r2
            r0.<init>(r1)
            putAll(r0, r3)
            putAll(r0, r4)
            return r0
    }

    public static final void putAll(@org.jetbrains.annotations.NotNull android.util.SparseIntArray r4, @org.jetbrains.annotations.NotNull android.util.SparseIntArray r5) {
            int r0 = r5.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L15
            int r2 = r5.keyAt(r1)
            int r3 = r5.valueAt(r1)
            r4.put(r2, r3)
            int r1 = r1 + 1
            goto L5
        L15:
            return
    }

    public static final boolean remove(@org.jetbrains.annotations.NotNull android.util.SparseIntArray r1, int r2, int r3) {
            int r2 = r1.indexOfKey(r2)
            if (r2 < 0) goto L11
            int r0 = r1.valueAt(r2)
            if (r3 != r0) goto L11
            r1.removeAt(r2)
            r1 = 1
            return r1
        L11:
            r1 = 0
            return r1
    }

    public static final void set(@org.jetbrains.annotations.NotNull android.util.SparseIntArray r0, int r1, int r2) {
            r0.put(r1, r2)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.collections.d1 valueIterator(@org.jetbrains.annotations.NotNull android.util.SparseIntArray r1) {
            androidx.core.util.SparseIntArrayKt$valueIterator$1 r0 = new androidx.core.util.SparseIntArrayKt$valueIterator$1
            r0.<init>(r1)
            return r0
    }
}
