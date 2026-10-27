package org.junit.internal.runners;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class h extends org.junit.internal.runners.d {
    public h(java.lang.Class<?> r1) throws java.lang.Throwable {
            r0 = this;
            junit.framework.f r1 = k(r1)
            r0.<init>(r1)
            return
    }

    public static junit.framework.f k(java.lang.Class<?> r3) throws java.lang.Throwable {
            java.lang.String r0 = "suite"
            r1 = 0
            java.lang.reflect.Method r0 = r3.getMethod(r0, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L33
            int r2 = r0.getModifiers()     // Catch: java.lang.reflect.InvocationTargetException -> L33
            boolean r2 = java.lang.reflect.Modifier.isStatic(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L33
            if (r2 == 0) goto L18
            java.lang.Object r3 = r0.invoke(r1, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L33
            junit.framework.f r3 = (junit.framework.f) r3     // Catch: java.lang.reflect.InvocationTargetException -> L33
            return r3
        L18:
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.reflect.InvocationTargetException -> L33
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.reflect.InvocationTargetException -> L33
            r1.<init>()     // Catch: java.lang.reflect.InvocationTargetException -> L33
            java.lang.String r3 = r3.getName()     // Catch: java.lang.reflect.InvocationTargetException -> L33
            r1.append(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L33
            java.lang.String r3 = ".suite() must be static"
            r1.append(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L33
            java.lang.String r3 = r1.toString()     // Catch: java.lang.reflect.InvocationTargetException -> L33
            r0.<init>(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L33
            throw r0     // Catch: java.lang.reflect.InvocationTargetException -> L33
        L33:
            r3 = move-exception
            java.lang.Throwable r3 = r3.getCause()
            throw r3
    }
}
