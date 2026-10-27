package io.netty.util.internal.shaded.org.jctools.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class UnsafeAccess {
    public static final boolean SUPPORTS_GET_AND_SET = false;
    public static final sun.misc.Unsafe UNSAFE = null;

    static {
            r0 = 0
            r1 = 0
            r2 = 1
            java.lang.Class<sun.misc.Unsafe> r3 = sun.misc.Unsafe.class
            java.lang.String r4 = "theUnsafe"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch: java.lang.Exception -> L15
            r3.setAccessible(r2)     // Catch: java.lang.Exception -> L15
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Exception -> L15
            sun.misc.Unsafe r3 = (sun.misc.Unsafe) r3     // Catch: java.lang.Exception -> L15
            goto L25
        L15:
            java.lang.Class<sun.misc.Unsafe> r3 = sun.misc.Unsafe.class
            java.lang.reflect.Constructor r3 = r3.getDeclaredConstructor(r1)     // Catch: java.lang.Exception -> L40
            r3.setAccessible(r2)     // Catch: java.lang.Exception -> L40
            java.lang.Object r1 = r3.newInstance(r1)     // Catch: java.lang.Exception -> L40
            r3 = r1
            sun.misc.Unsafe r3 = (sun.misc.Unsafe) r3     // Catch: java.lang.Exception -> L40
        L25:
            java.lang.Class<sun.misc.Unsafe> r1 = sun.misc.Unsafe.class
            java.lang.String r4 = "getAndSetObject"
            r5 = 3
            java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> L3b
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            r5[r0] = r6     // Catch: java.lang.Exception -> L3b
            java.lang.Class r7 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L3b
            r5[r2] = r7     // Catch: java.lang.Exception -> L3b
            r7 = 2
            r5[r7] = r6     // Catch: java.lang.Exception -> L3b
            r1.getMethod(r4, r5)     // Catch: java.lang.Exception -> L3b
            r0 = 1
        L3b:
            io.netty.util.internal.shaded.org.jctools.util.UnsafeAccess.UNSAFE = r3
            io.netty.util.internal.shaded.org.jctools.util.UnsafeAccess.SUPPORTS_GET_AND_SET = r0
            return
        L40:
            r1 = move-exception
            io.netty.util.internal.shaded.org.jctools.util.UnsafeAccess.SUPPORTS_GET_AND_SET = r0
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
    }

    public UnsafeAccess() {
            r0 = this;
            r0.<init>()
            return
    }
}
