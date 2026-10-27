package io.netty.util.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class CleanerJava9 implements io.netty.util.internal.Cleaner {
    private static final java.lang.reflect.Method INVOKE_CLEANER = null;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;



    static {
            java.lang.Class<io.netty.util.internal.CleanerJava9> r0 = io.netty.util.internal.CleanerJava9.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.util.internal.CleanerJava9.logger = r0
            boolean r1 = io.netty.util.internal.PlatformDependent0.hasUnsafe()
            r2 = 0
            if (r1 == 0) goto L27
            r1 = 1
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocateDirect(r1)
            io.netty.util.internal.CleanerJava9$1 r3 = new io.netty.util.internal.CleanerJava9$1
            r3.<init>(r1)
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r3)
            boolean r3 = r1 instanceof java.lang.Throwable
            if (r3 == 0) goto L24
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            goto L2e
        L24:
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            goto L31
        L27:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r3 = "sun.misc.Unsafe unavailable"
            r1.<init>(r3)
        L2e:
            r4 = r2
            r2 = r1
            r1 = r4
        L31:
            if (r2 != 0) goto L39
            java.lang.String r2 = "java.nio.ByteBuffer.cleaner(): available"
            r0.debug(r2)
            goto L3e
        L39:
            java.lang.String r3 = "java.nio.ByteBuffer.cleaner(): unavailable"
            r0.debug(r3, r2)
        L3e:
            io.netty.util.internal.CleanerJava9.INVOKE_CLEANER = r1
            return
    }

    CleanerJava9() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ java.lang.reflect.Method access$000() {
            java.lang.reflect.Method r0 = io.netty.util.internal.CleanerJava9.INVOKE_CLEANER
            return r0
    }

    private static void freeDirectBufferPrivileged(java.nio.ByteBuffer r1) {
            io.netty.util.internal.CleanerJava9$2 r0 = new io.netty.util.internal.CleanerJava9$2
            r0.<init>(r1)
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r0)
            java.lang.Exception r1 = (java.lang.Exception) r1
            if (r1 == 0) goto L10
            io.netty.util.internal.PlatformDependent0.throwException(r1)
        L10:
            return
    }

    static boolean isSupported() {
            java.lang.reflect.Method r0 = io.netty.util.internal.CleanerJava9.INVOKE_CLEANER
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // io.netty.util.internal.Cleaner
    public void freeDirectBuffer(java.nio.ByteBuffer r5) {
            r4 = this;
            java.lang.SecurityManager r0 = java.lang.System.getSecurityManager()
            if (r0 != 0) goto L19
            java.lang.reflect.Method r0 = io.netty.util.internal.CleanerJava9.INVOKE_CLEANER     // Catch: java.lang.Throwable -> L14
            sun.misc.Unsafe r1 = io.netty.util.internal.PlatformDependent0.UNSAFE     // Catch: java.lang.Throwable -> L14
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L14
            r3 = 0
            r2[r3] = r5     // Catch: java.lang.Throwable -> L14
            r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r5 = move-exception
            io.netty.util.internal.PlatformDependent0.throwException(r5)
            return
        L19:
            freeDirectBufferPrivileged(r5)
            return
    }
}
