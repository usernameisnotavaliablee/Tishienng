package kotlin.random;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class e {
    @kotlin.SinceKotlin(version = "1.3")
    @org.jetbrains.annotations.NotNull
    public static final java.util.Random a(@org.jetbrains.annotations.NotNull kotlin.random.Random r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1 instanceof kotlin.random.a
            if (r0 == 0) goto Ld
            r0 = r1
            kotlin.random.a r0 = (kotlin.random.a) r0
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L18
            java.util.Random r0 = r0.a()
            if (r0 != 0) goto L17
            goto L18
        L17:
            return r0
        L18:
            kotlin.random.c r0 = new kotlin.random.c
            r0.<init>(r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @org.jetbrains.annotations.NotNull
    public static final kotlin.random.Random b(@org.jetbrains.annotations.NotNull java.util.Random r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1 instanceof kotlin.random.c
            if (r0 == 0) goto Ld
            r0 = r1
            kotlin.random.c r0 = (kotlin.random.c) r0
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L18
            kotlin.random.Random r0 = r0.a()
            if (r0 != 0) goto L17
            goto L18
        L17:
            return r0
        L18:
            kotlin.random.d r0 = new kotlin.random.d
            r0.<init>(r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final kotlin.random.Random c() {
            kotlin.internal.a r0 = kotlin.internal.b.a
            kotlin.random.Random r0 = r0.b()
            return r0
    }

    public static final double d(int r2, int r3) {
            long r0 = (long) r2
            r2 = 27
            long r0 = r0 << r2
            long r2 = (long) r3
            long r0 = r0 + r2
            double r2 = (double) r0
            r0 = 4845873199050653696(0x4340000000000000, double:9.007199254740992E15)
            double r2 = r2 / r0
            return r2
    }
}
