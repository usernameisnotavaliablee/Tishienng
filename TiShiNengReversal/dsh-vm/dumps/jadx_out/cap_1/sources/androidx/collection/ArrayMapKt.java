package androidx.collection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ArrayMapKt {
    @org.jetbrains.annotations.NotNull
    public static final <K, V> androidx.collection.ArrayMap<K, V> arrayMapOf() {
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <K, V> androidx.collection.ArrayMap<K, V> arrayMapOf(@org.jetbrains.annotations.NotNull kotlin.Pair<? extends K, ? extends V>... r5) {
            java.lang.String r0 = "pairs"
            kotlin.jvm.internal.g0.p(r5, r0)
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            int r1 = r5.length
            r0.<init>(r1)
            int r1 = r5.length
            r2 = 0
        Ld:
            if (r2 >= r1) goto L1f
            r3 = r5[r2]
            java.lang.Object r4 = r3.getFirst()
            java.lang.Object r3 = r3.getSecond()
            r0.put(r4, r3)
            int r2 = r2 + 1
            goto Ld
        L1f:
            return r0
    }
}
