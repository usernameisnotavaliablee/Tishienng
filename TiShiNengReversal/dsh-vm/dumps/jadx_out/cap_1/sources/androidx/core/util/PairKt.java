package androidx.core.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class PairKt {
    @android.annotation.SuppressLint({"UnknownNullness"})
    public static final <F, S> F component1(@org.jetbrains.annotations.NotNull android.util.Pair<F, S> r0) {
            java.lang.Object r0 = r0.first
            return r0
    }

    @android.annotation.SuppressLint({"UnknownNullness"})
    public static final <F, S> F component1(@org.jetbrains.annotations.NotNull androidx.core.util.Pair<F, S> r0) {
            F r0 = r0.first
            return r0
    }

    @android.annotation.SuppressLint({"UnknownNullness"})
    public static final <F, S> S component2(@org.jetbrains.annotations.NotNull android.util.Pair<F, S> r0) {
            java.lang.Object r0 = r0.second
            return r0
    }

    @android.annotation.SuppressLint({"UnknownNullness"})
    public static final <F, S> S component2(@org.jetbrains.annotations.NotNull androidx.core.util.Pair<F, S> r0) {
            S r0 = r0.second
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <F, S> android.util.Pair<F, S> toAndroidPair(@org.jetbrains.annotations.NotNull kotlin.Pair<? extends F, ? extends S> r2) {
            android.util.Pair r0 = new android.util.Pair
            java.lang.Object r1 = r2.getFirst()
            java.lang.Object r2 = r2.getSecond()
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <F, S> androidx.core.util.Pair<F, S> toAndroidXPair(@org.jetbrains.annotations.NotNull kotlin.Pair<? extends F, ? extends S> r2) {
            androidx.core.util.Pair r0 = new androidx.core.util.Pair
            java.lang.Object r1 = r2.getFirst()
            java.lang.Object r2 = r2.getSecond()
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <F, S> kotlin.Pair<F, S> toKotlinPair(@org.jetbrains.annotations.NotNull android.util.Pair<F, S> r2) {
            kotlin.Pair r0 = new kotlin.Pair
            java.lang.Object r1 = r2.first
            java.lang.Object r2 = r2.second
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <F, S> kotlin.Pair<F, S> toKotlinPair(@org.jetbrains.annotations.NotNull androidx.core.util.Pair<F, S> r2) {
            kotlin.Pair r0 = new kotlin.Pair
            F r1 = r2.first
            S r2 = r2.second
            r0.<init>(r1, r2)
            return r0
    }
}
