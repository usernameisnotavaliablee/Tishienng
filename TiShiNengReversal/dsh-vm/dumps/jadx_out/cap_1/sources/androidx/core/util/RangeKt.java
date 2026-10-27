package androidx.core.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"ClassVerificationFailure"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class RangeKt {
    @androidx.annotation.RequiresApi(21)
    @org.jetbrains.annotations.NotNull
    public static final <T extends java.lang.Comparable<? super T>> android.util.Range<T> and(@org.jetbrains.annotations.NotNull android.util.Range<T> r0, @org.jetbrains.annotations.NotNull android.util.Range<T> r1) {
            android.util.Range r0 = r0.intersect(r1)
            return r0
    }

    @androidx.annotation.RequiresApi(21)
    @org.jetbrains.annotations.NotNull
    public static final <T extends java.lang.Comparable<? super T>> android.util.Range<T> plus(@org.jetbrains.annotations.NotNull android.util.Range<T> r0, @org.jetbrains.annotations.NotNull android.util.Range<T> r1) {
            android.util.Range r0 = r0.extend(r1)
            return r0
    }

    @androidx.annotation.RequiresApi(21)
    @org.jetbrains.annotations.NotNull
    public static final <T extends java.lang.Comparable<? super T>> android.util.Range<T> plus(@org.jetbrains.annotations.NotNull android.util.Range<T> r0, @org.jetbrains.annotations.NotNull T r1) {
            android.util.Range r0 = r0.extend(r1)
            return r0
    }

    @androidx.annotation.RequiresApi(21)
    @org.jetbrains.annotations.NotNull
    public static final <T extends java.lang.Comparable<? super T>> android.util.Range<T> rangeTo(@org.jetbrains.annotations.NotNull T r1, @org.jetbrains.annotations.NotNull T r2) {
            android.util.Range r0 = new android.util.Range
            r0.<init>(r1, r2)
            return r0
    }

    @androidx.annotation.RequiresApi(21)
    @org.jetbrains.annotations.NotNull
    public static final <T extends java.lang.Comparable<? super T>> kotlin.ranges.h<T> toClosedRange(@org.jetbrains.annotations.NotNull android.util.Range<T> r1) {
            androidx.core.util.RangeKt$toClosedRange$1 r0 = new androidx.core.util.RangeKt$toClosedRange$1
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.RequiresApi(21)
    @org.jetbrains.annotations.NotNull
    public static final <T extends java.lang.Comparable<? super T>> android.util.Range<T> toRange(@org.jetbrains.annotations.NotNull kotlin.ranges.h<T> r2) {
            android.util.Range r0 = new android.util.Range
            java.lang.Comparable r1 = r2.getStart()
            java.lang.Comparable r2 = r2.getEndInclusive()
            r0.<init>(r1, r2)
            return r0
    }
}
