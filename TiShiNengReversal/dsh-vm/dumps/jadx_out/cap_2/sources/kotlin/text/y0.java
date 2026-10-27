package kotlin.text;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class y0 {
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String a(char r5) {
            java.lang.String r0 = java.lang.String.valueOf(r5)
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.g0.n(r0, r1)
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toUpperCase(r2)
            java.lang.String r3 = "toUpperCase(...)"
            kotlin.jvm.internal.g0.o(r0, r3)
            int r3 = r0.length()
            r4 = 1
            if (r3 <= r4) goto L4d
            r3 = 329(0x149, float:4.61E-43)
            if (r5 != r3) goto L20
            return r0
        L20:
            r5 = 0
            char r5 = r0.charAt(r5)
            kotlin.jvm.internal.g0.n(r0, r1)
            java.lang.String r0 = r0.substring(r4)
            java.lang.String r3 = "substring(...)"
            kotlin.jvm.internal.g0.o(r0, r3)
            kotlin.jvm.internal.g0.n(r0, r1)
            java.lang.String r0 = r0.toLowerCase(r2)
            java.lang.String r1 = "toLowerCase(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            r1.append(r0)
            java.lang.String r5 = r1.toString()
            return r5
        L4d:
            char r5 = java.lang.Character.toTitleCase(r5)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            return r5
    }
}
