package io.netty.util.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ReflectionUtil {
    private ReflectionUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.RuntimeException handleInaccessibleObjectException(java.lang.RuntimeException r2) {
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "java.lang.reflect.InaccessibleObjectException"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L11
            return r2
        L11:
            throw r2
    }

    public static java.lang.Throwable trySetAccessible(java.lang.reflect.AccessibleObject r0, boolean r1) {
            if (r1 == 0) goto L10
            boolean r1 = io.netty.util.internal.PlatformDependent0.isExplicitTryReflectionSetAccessible()
            if (r1 != 0) goto L10
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Reflective setAccessible(true) disabled"
            r0.<init>(r1)
            return r0
        L10:
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.RuntimeException -> L16 java.lang.SecurityException -> L1c
            r0 = 0
            return r0
        L16:
            r0 = move-exception
            java.lang.RuntimeException r0 = handleInaccessibleObjectException(r0)
            return r0
        L1c:
            r0 = move-exception
            return r0
    }
}
