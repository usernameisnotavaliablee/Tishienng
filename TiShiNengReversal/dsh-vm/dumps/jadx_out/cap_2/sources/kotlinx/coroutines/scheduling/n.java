package kotlinx.coroutines.scheduling;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class n {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String a = null;

    @kotlin.jvm.JvmField
    public static final long b = 0;

    @kotlin.jvm.JvmField
    public static final int c = 0;

    @kotlin.jvm.JvmField
    public static final int d = 0;

    @kotlin.jvm.JvmField
    public static final long e = 0;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static kotlinx.coroutines.scheduling.i f = null;
    public static final int g = 0;
    public static final int h = 1;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.scheduling.k i = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.scheduling.k j = null;

    static {
            java.lang.String r0 = "kotlinx.coroutines.scheduler.default.name"
            java.lang.String r1 = "DefaultDispatcher"
            java.lang.String r0 = kotlinx.coroutines.internal.v0.e(r0, r1)
            kotlinx.coroutines.scheduling.n.a = r0
            r8 = 12
            r9 = 0
            java.lang.String r1 = "kotlinx.coroutines.scheduler.resolution.ns"
            r2 = 100000(0x186a0, double:4.94066E-319)
            r4 = 0
            r6 = 0
            long r0 = kotlinx.coroutines.internal.v0.h(r1, r2, r4, r6, r8, r9)
            kotlinx.coroutines.scheduling.n.b = r0
            int r0 = kotlinx.coroutines.internal.v0.a()
            r1 = 2
            int r3 = kotlin.ranges.t.u(r0, r1)
            r6 = 8
            r7 = 0
            java.lang.String r2 = "kotlinx.coroutines.scheduler.core.pool.size"
            r4 = 1
            r5 = 0
            int r0 = kotlinx.coroutines.internal.v0.g(r2, r3, r4, r5, r6, r7)
            kotlinx.coroutines.scheduling.n.c = r0
            r5 = 4
            r6 = 0
            java.lang.String r1 = "kotlinx.coroutines.scheduler.max.pool.size"
            r2 = 2097150(0x1ffffe, float:2.938733E-39)
            r3 = 0
            r4 = 2097150(0x1ffffe, float:2.938733E-39)
            int r0 = kotlinx.coroutines.internal.v0.g(r1, r2, r3, r4, r5, r6)
            kotlinx.coroutines.scheduling.n.d = r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            java.lang.String r1 = "kotlinx.coroutines.scheduler.keep.alive.sec"
            r2 = 60
            r4 = 0
            r6 = 0
            long r1 = kotlinx.coroutines.internal.v0.h(r1, r2, r4, r6, r8, r9)
            long r0 = r0.toNanos(r1)
            kotlinx.coroutines.scheduling.n.e = r0
            kotlinx.coroutines.scheduling.g r0 = kotlinx.coroutines.scheduling.g.a
            kotlinx.coroutines.scheduling.n.f = r0
            kotlinx.coroutines.scheduling.l r0 = new kotlinx.coroutines.scheduling.l
            r1 = 0
            r0.<init>(r1)
            kotlinx.coroutines.scheduling.n.i = r0
            kotlinx.coroutines.scheduling.l r0 = new kotlinx.coroutines.scheduling.l
            r1 = 1
            r0.<init>(r1)
            kotlinx.coroutines.scheduling.n.j = r0
            return
    }

    public static final boolean a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.scheduling.j r1) {
            kotlinx.coroutines.scheduling.k r1 = r1.b
            int r1 = r1.q()
            r0 = 1
            if (r1 != r0) goto La
            return r0
        La:
            r1 = 0
            return r1
    }
}
