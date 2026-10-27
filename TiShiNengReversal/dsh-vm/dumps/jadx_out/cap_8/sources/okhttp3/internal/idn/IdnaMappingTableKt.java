package okhttp3.internal.idn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class IdnaMappingTableKt {
    public IdnaMappingTableKt() {
            r1 = this;
            r1.<init>()
            return
    }

    public static final int binarySearch(int r2, int r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> r4) {
            java.lang.String r0 = "compare"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r3 = r3 + (-1)
        L7:
            if (r2 > r3) goto L26
            int r0 = r2 + r3
            int r0 = r0 / 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r4.invoke(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            if (r1 >= 0) goto L20
            int r3 = r0 + (-1)
            goto L7
        L20:
            if (r1 <= 0) goto L25
            int r2 = r0 + 1
            goto L7
        L25:
            return r0
        L26:
            int r2 = -r2
            int r2 = r2 + (-1)
            return r2
    }

    public static final int read14BitInt(@org.jetbrains.annotations.NotNull java.lang.String r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            char r0 = r1.charAt(r2)
            int r2 = r2 + 1
            char r1 = r1.charAt(r2)
            int r2 = r0 << 7
            int r2 = r2 + r1
            return r2
    }
}
