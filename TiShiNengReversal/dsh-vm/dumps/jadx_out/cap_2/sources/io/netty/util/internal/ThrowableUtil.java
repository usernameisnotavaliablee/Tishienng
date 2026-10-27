package io.netty.util.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ThrowableUtil {
    private ThrowableUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    @io.netty.util.internal.SuppressJava6Requirement(reason = "Throwable addSuppressed is only available for >= 7. Has check for < 7.")
    public static void addSuppressed(java.lang.Throwable r1, java.lang.Throwable r2) {
            boolean r0 = haveSuppressed()
            if (r0 != 0) goto L7
            return
        L7:
            r1.addSuppressed(r2)
            return
    }

    public static void addSuppressed(java.lang.Throwable r1, java.util.List<java.lang.Throwable> r2) {
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L14
            java.lang.Object r0 = r2.next()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            addSuppressed(r1, r0)
            goto L4
        L14:
            return
    }

    public static void addSuppressedAndClear(java.lang.Throwable r0, java.util.List<java.lang.Throwable> r1) {
            addSuppressed(r0, r1)
            r1.clear()
            return
    }

    public static boolean haveSuppressed() {
            int r0 = io.netty.util.internal.PlatformDependent.javaVersion()
            r1 = 7
            if (r0 < r1) goto L9
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    public static java.lang.String stackTraceToString(java.lang.Throwable r2) {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.io.PrintStream r1 = new java.io.PrintStream
            r1.<init>(r0)
            r2.getClass()
            r1.flush()
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L1d
            byte[] r1 = r0.toByteArray()     // Catch: java.lang.Throwable -> L1d
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L1d
            r0.close()     // Catch: java.io.IOException -> L1c
        L1c:
            return r2
        L1d:
            r2 = move-exception
            r0.close()     // Catch: java.io.IOException -> L21
        L21:
            throw r2
    }

    public static <T extends java.lang.Throwable> T unknownStackTrace(T r3, java.lang.Class<?> r4, java.lang.String r5) {
            java.lang.StackTraceElement r0 = new java.lang.StackTraceElement
            java.lang.String r4 = r4.getName()
            r1 = 0
            r2 = -1
            r0.<init>(r4, r5, r1, r2)
            r4 = 1
            java.lang.StackTraceElement[] r4 = new java.lang.StackTraceElement[r4]
            r5 = 0
            r4[r5] = r0
            r3.setStackTrace(r4)
            return r3
    }
}
