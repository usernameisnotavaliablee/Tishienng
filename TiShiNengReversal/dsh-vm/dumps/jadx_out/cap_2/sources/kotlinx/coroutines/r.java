package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class r {
    private static final int a = 0;
    private static final int b = 1;
    private static final int c = 2;
    private static final int d = 29;
    private static final int e = 536870911;
    private static final int f = 536870911;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.internal.s0 g = null;

    static {
            kotlinx.coroutines.internal.s0 r0 = new kotlinx.coroutines.internal.s0
            java.lang.String r1 = "RESUME_TOKEN"
            r0.<init>(r1)
            kotlinx.coroutines.r.g = r0
            return
    }

    private static final int a(int r0, int r1) {
            int r0 = r0 << 29
            int r0 = r0 + r1
            return r0
    }

    private static final int b(int r0) {
            int r0 = r0 >> 29
            return r0
    }

    private static final int c(int r1) {
            r0 = 536870911(0x1fffffff, float:1.0842021E-19)
            r1 = r1 & r0
            return r1
    }
}
