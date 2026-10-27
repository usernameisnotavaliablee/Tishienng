package androidx.core.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSparseLongArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseLongArray.kt\nandroidx/core/util/SparseLongArrayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n75#1,4:95\n1#2:94\n*S KotlinDebug\n*F\n+ 1 SparseLongArray.kt\nandroidx/core/util/SparseLongArrayKt\n*L\n71#1:95,4\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class SparseLongArrayKt {
    public static final boolean contains(@org.jetbrains.annotations.NotNull android.util.SparseLongArray r0, int r1) {
            int r0 = r0.indexOfKey(r1)
            if (r0 < 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public static final boolean containsKey(@org.jetbrains.annotations.NotNull android.util.SparseLongArray r0, int r1) {
            int r0 = r0.indexOfKey(r1)
            if (r0 < 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public static final boolean containsValue(@org.jetbrains.annotations.NotNull android.util.SparseLongArray r0, long r1) {
            int r0 = r0.indexOfValue(r1)
            if (r0 < 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public static final void forEach(@org.jetbrains.annotations.NotNull android.util.SparseLongArray r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Long, kotlin.n1> r6) {
            int r0 = r5.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L1d
            int r2 = r5.keyAt(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            long r3 = r5.valueAt(r1)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r6.invoke(r2, r3)
            int r1 = r1 + 1
            goto L5
        L1d:
            return
    }

    public static final long getOrDefault(@org.jetbrains.annotations.NotNull android.util.SparseLongArray r0, int r1, long r2) {
            long r0 = r0.get(r1, r2)
            return r0
    }

    public static final long getOrElse(@org.jetbrains.annotations.NotNull android.util.SparseLongArray r0, int r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<java.lang.Long> r2) {
            int r1 = r0.indexOfKey(r1)
            if (r1 < 0) goto Lb
            long r0 = r0.valueAt(r1)
            return r0
        Lb:
            java.lang.Object r0 = r2.invoke()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            return r0
    }

    public static final int getSize(@org.jetbrains.annotations.NotNull android.util.SparseLongArray r0) {
            int r0 = r0.size()
            return r0
    }

    public static final boolean isEmpty(@org.jetbrains.annotations.NotNull android.util.SparseLongArray r0) {
            int r0 = r0.size()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public static final boolean isNotEmpty(@org.jetbrains.annotations.NotNull android.util.SparseLongArray r0) {
            int r0 = r0.size()
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.collections.d1 keyIterator(@org.jetbrains.annotations.NotNull android.util.SparseLongArray r1) {
            androidx.core.util.SparseLongArrayKt$keyIterator$1 r0 = new androidx.core.util.SparseLongArrayKt$keyIterator$1
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.util.SparseLongArray plus(@org.jetbrains.annotations.NotNull android.util.SparseLongArray r3, @org.jetbrains.annotations.NotNull android.util.SparseLongArray r4) {
            android.util.SparseLongArray r0 = new android.util.SparseLongArray
            int r1 = r3.size()
            int r2 = r4.size()
            int r1 = r1 + r2
            r0.<init>(r1)
            putAll(r0, r3)
            putAll(r0, r4)
            return r0
    }

    public static final void putAll(@org.jetbrains.annotations.NotNull android.util.SparseLongArray r5, @org.jetbrains.annotations.NotNull android.util.SparseLongArray r6) {
            int r0 = r6.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L15
            int r2 = r6.keyAt(r1)
            long r3 = r6.valueAt(r1)
            r5.put(r2, r3)
            int r1 = r1 + 1
            goto L5
        L15:
            return
    }

    public static final boolean remove(@org.jetbrains.annotations.NotNull android.util.SparseLongArray r3, int r4, long r5) {
            int r4 = r3.indexOfKey(r4)
            if (r4 < 0) goto L13
            long r0 = r3.valueAt(r4)
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 != 0) goto L13
            r3.removeAt(r4)
            r3 = 1
            return r3
        L13:
            r3 = 0
            return r3
    }

    public static final void set(@org.jetbrains.annotations.NotNull android.util.SparseLongArray r0, int r1, long r2) {
            r0.put(r1, r2)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.collections.e1 valueIterator(@org.jetbrains.annotations.NotNull android.util.SparseLongArray r1) {
            androidx.core.util.SparseLongArrayKt$valueIterator$1 r0 = new androidx.core.util.SparseLongArrayKt$valueIterator$1
            r0.<init>(r1)
            return r0
    }
}
