package io.netty.util.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class CleanerJava6 implements io.netty.util.internal.Cleaner {
    private static final java.lang.reflect.Field CLEANER_FIELD = null;
    private static final long CLEANER_FIELD_OFFSET = 0;
    private static final java.lang.reflect.Method CLEAN_METHOD = null;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;



    static {
            java.lang.Class<io.netty.util.internal.CleanerJava6> r0 = io.netty.util.internal.CleanerJava6.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.util.internal.CleanerJava6.logger = r0
            r0 = 1
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)
            r1 = -1
            r3 = 0
            io.netty.util.internal.CleanerJava6$1 r4 = new io.netty.util.internal.CleanerJava6$1     // Catch: java.lang.Throwable -> L2e
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r4 = java.security.AccessController.doPrivileged(r4)     // Catch: java.lang.Throwable -> L2e
            boolean r5 = r4 instanceof java.lang.Throwable     // Catch: java.lang.Throwable -> L2e
            if (r5 != 0) goto L44
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4     // Catch: java.lang.Throwable -> L2e
            boolean r5 = io.netty.util.internal.PlatformDependent.hasUnsafe()     // Catch: java.lang.Throwable -> L2e
            if (r5 == 0) goto L30
            long r5 = io.netty.util.internal.PlatformDependent0.objectFieldOffset(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r0 = io.netty.util.internal.PlatformDependent0.getObject(r0, r5)     // Catch: java.lang.Throwable -> L2e
            goto L35
        L2e:
            r0 = move-exception
            goto L47
        L30:
            java.lang.Object r0 = r4.get(r0)     // Catch: java.lang.Throwable -> L2e
            r5 = r1
        L35:
            java.lang.Class r7 = r0.getClass()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = "clean"
            java.lang.reflect.Method r7 = r7.getDeclaredMethod(r8, r3)     // Catch: java.lang.Throwable -> L2e
            r7.invoke(r0, r3)     // Catch: java.lang.Throwable -> L2e
            r1 = r5
            goto L4a
        L44:
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch: java.lang.Throwable -> L2e
            throw r4     // Catch: java.lang.Throwable -> L2e
        L47:
            r4 = r3
            r7 = r4
            r3 = r0
        L4a:
            if (r3 != 0) goto L54
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.CleanerJava6.logger
            java.lang.String r3 = "java.nio.ByteBuffer.cleaner(): available"
            r0.debug(r3)
            goto L5b
        L54:
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.CleanerJava6.logger
            java.lang.String r5 = "java.nio.ByteBuffer.cleaner(): unavailable"
            r0.debug(r5, r3)
        L5b:
            io.netty.util.internal.CleanerJava6.CLEANER_FIELD = r4
            io.netty.util.internal.CleanerJava6.CLEANER_FIELD_OFFSET = r1
            io.netty.util.internal.CleanerJava6.CLEAN_METHOD = r7
            return
    }

    CleanerJava6() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ void access$000(java.nio.ByteBuffer r0) throws java.lang.Exception {
            freeDirectBuffer0(r0)
            return
    }

    private static void freeDirectBuffer0(java.nio.ByteBuffer r5) throws java.lang.Exception {
            long r0 = io.netty.util.internal.CleanerJava6.CLEANER_FIELD_OFFSET
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lf
            java.lang.reflect.Field r0 = io.netty.util.internal.CleanerJava6.CLEANER_FIELD
            java.lang.Object r5 = r0.get(r5)
            goto L13
        Lf:
            java.lang.Object r5 = io.netty.util.internal.PlatformDependent0.getObject(r5, r0)
        L13:
            if (r5 == 0) goto L1b
            java.lang.reflect.Method r0 = io.netty.util.internal.CleanerJava6.CLEAN_METHOD
            r1 = 0
            r0.invoke(r5, r1)
        L1b:
            return
    }

    private static void freeDirectBufferPrivileged(java.nio.ByteBuffer r1) {
            io.netty.util.internal.CleanerJava6$2 r0 = new io.netty.util.internal.CleanerJava6$2
            r0.<init>(r1)
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r0)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 == 0) goto L10
            io.netty.util.internal.PlatformDependent0.throwException(r1)
        L10:
            return
    }

    static boolean isSupported() {
            long r0 = io.netty.util.internal.CleanerJava6.CLEANER_FIELD_OFFSET
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lf
            java.lang.reflect.Field r0 = io.netty.util.internal.CleanerJava6.CLEANER_FIELD
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            return r0
        Lf:
            r0 = 1
            return r0
    }

    @Override // io.netty.util.internal.Cleaner
    public void freeDirectBuffer(java.nio.ByteBuffer r2) {
            r1 = this;
            boolean r0 = r2.isDirect()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.SecurityManager r0 = java.lang.System.getSecurityManager()
            if (r0 != 0) goto L16
            freeDirectBuffer0(r2)     // Catch: java.lang.Throwable -> L11
            return
        L11:
            r2 = move-exception
            io.netty.util.internal.PlatformDependent0.throwException(r2)
            return
        L16:
            freeDirectBufferPrivileged(r2)
            return
    }
}
