package rx.internal.util.unsafe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@rx.internal.util.SuppressAnimalSniffer
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class n0 {
    public static final sun.misc.Unsafe a = null;
    private static final boolean b = false;

    static {
            java.lang.String r0 = "rx.unsafe-disable"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r1 = 1
            if (r0 == 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            rx.internal.util.unsafe.n0.b = r0
            r0 = 0
            java.lang.Class<sun.misc.Unsafe> r2 = sun.misc.Unsafe.class
            java.lang.String r3 = "theUnsafe"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L21
            r2.setAccessible(r1)     // Catch: java.lang.Throwable -> L21
            java.lang.Object r1 = r2.get(r0)     // Catch: java.lang.Throwable -> L21
            sun.misc.Unsafe r1 = (sun.misc.Unsafe) r1     // Catch: java.lang.Throwable -> L21
            r0 = r1
        L21:
            rx.internal.util.unsafe.n0.a = r0
            return
    }

    private n0() {
            r2 = this;
            r2.<init>()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No instances!"
            r0.<init>(r1)
            throw r0
    }

    public static long a(java.lang.Class<?> r0, java.lang.String r1) {
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.NoSuchFieldException -> Lb
            sun.misc.Unsafe r1 = rx.internal.util.unsafe.n0.a     // Catch: java.lang.NoSuchFieldException -> Lb
            long r0 = r1.objectFieldOffset(r0)     // Catch: java.lang.NoSuchFieldException -> Lb
            return r0
        Lb:
            r0 = move-exception
            java.lang.InternalError r1 = new java.lang.InternalError
            r1.<init>()
            r1.initCause(r0)
            throw r1
    }

    public static boolean b(java.lang.Object r6, long r7, int r9, int r10) {
            sun.misc.Unsafe r0 = rx.internal.util.unsafe.n0.a
            r1 = r6
            r2 = r7
            r4 = r9
            r5 = r10
            boolean r6 = r0.compareAndSwapInt(r1, r2, r4, r5)
            return r6
    }

    public static int c(java.lang.Object r6, long r7, int r9) {
        L0:
            sun.misc.Unsafe r0 = rx.internal.util.unsafe.n0.a
            int r4 = r0.getIntVolatile(r6, r7)
            int r5 = r4 + r9
            r1 = r6
            r2 = r7
            boolean r6 = r0.compareAndSwapInt(r1, r2, r4, r5)
            if (r6 == 0) goto L11
            return r4
        L11:
            r6 = r1
            r7 = r2
            goto L0
    }

    public static int d(java.lang.Object r6, long r7) {
        L0:
            sun.misc.Unsafe r0 = rx.internal.util.unsafe.n0.a
            int r4 = r0.getIntVolatile(r6, r7)
            int r5 = r4 + 1
            r1 = r6
            r2 = r7
            boolean r6 = r0.compareAndSwapInt(r1, r2, r4, r5)
            if (r6 == 0) goto L11
            return r4
        L11:
            r6 = r1
            r7 = r2
            goto L0
    }

    public static int e(java.lang.Object r6, long r7, int r9) {
        L0:
            sun.misc.Unsafe r0 = rx.internal.util.unsafe.n0.a
            int r4 = r0.getIntVolatile(r6, r7)
            r1 = r6
            r2 = r7
            r5 = r9
            boolean r6 = r0.compareAndSwapInt(r1, r2, r4, r5)
            if (r6 == 0) goto L10
            return r4
        L10:
            r6 = r1
            r7 = r2
            r9 = r5
            goto L0
    }

    public static boolean f() {
            sun.misc.Unsafe r0 = rx.internal.util.unsafe.n0.a
            if (r0 == 0) goto La
            boolean r0 = rx.internal.util.unsafe.n0.b
            if (r0 != 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }
}
