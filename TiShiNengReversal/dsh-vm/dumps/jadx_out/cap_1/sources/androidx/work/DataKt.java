package androidx.work;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class DataKt {
    public static final /* synthetic */ <T> boolean hasKeyWithValueOfType(androidx.work.Data r2, java.lang.String r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 4
            java.lang.String r1 = "T"
            kotlin.jvm.internal.g0.y(r0, r1)
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            boolean r2 = r2.hasKeyWithValueOfType(r3, r0)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final androidx.work.Data workDataOf(@org.jetbrains.annotations.NotNull kotlin.Pair<java.lang.String, ? extends java.lang.Object>... r5) {
            java.lang.String r0 = "pairs"
            kotlin.jvm.internal.g0.p(r5, r0)
            androidx.work.Data$Builder r0 = new androidx.work.Data$Builder
            r0.<init>()
            int r1 = r5.length
            r2 = 0
        Lc:
            if (r2 >= r1) goto L20
            r3 = r5[r2]
            int r2 = r2 + 1
            java.lang.Object r4 = r3.getFirst()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.getSecond()
            r0.put(r4, r3)
            goto Lc
        L20:
            androidx.work.Data r5 = r0.build()
            java.lang.String r0 = "dataBuilder.build()"
            kotlin.jvm.internal.g0.o(r5, r0)
            return r5
    }
}
