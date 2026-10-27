package io.netty.util.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class SystemPropertyUtil {
    private static final io.netty.util.internal.logging.InternalLogger logger = null;


    static {
            java.lang.Class<io.netty.util.internal.SystemPropertyUtil> r0 = io.netty.util.internal.SystemPropertyUtil.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.util.internal.SystemPropertyUtil.logger = r0
            return
    }

    private SystemPropertyUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean contains(java.lang.String r0) {
            java.lang.String r0 = get(r0)
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public static java.lang.String get(java.lang.String r1) {
            r0 = 0
            java.lang.String r1 = get(r1, r0)
            return r1
    }

    public static java.lang.String get(java.lang.String r3, java.lang.String r4) {
            if (r3 == 0) goto L36
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L2e
            java.lang.SecurityManager r0 = java.lang.System.getSecurityManager()     // Catch: java.lang.SecurityException -> L13
            if (r0 != 0) goto L15
            java.lang.String r3 = java.lang.System.getProperty(r3)     // Catch: java.lang.SecurityException -> L13
            goto L2a
        L13:
            r0 = move-exception
            goto L22
        L15:
            io.netty.util.internal.SystemPropertyUtil$1 r0 = new io.netty.util.internal.SystemPropertyUtil$1     // Catch: java.lang.SecurityException -> L13
            r0.<init>(r3)     // Catch: java.lang.SecurityException -> L13
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)     // Catch: java.lang.SecurityException -> L13
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.SecurityException -> L13
            r3 = r0
            goto L2a
        L22:
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.internal.SystemPropertyUtil.logger
            java.lang.String r2 = "Unable to retrieve a system property '{}'; default values will be used."
            r1.warn(r2, r3, r0)
            r3 = 0
        L2a:
            if (r3 != 0) goto L2d
            return r4
        L2d:
            return r3
        L2e:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "key must not be empty."
            r3.<init>(r4)
            throw r3
        L36:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "key"
            r3.<init>(r4)
            throw r3
    }

    public static boolean getBoolean(java.lang.String r6, boolean r7) {
            java.lang.String r0 = get(r6)
            if (r0 != 0) goto L7
            goto L15
        L7:
            java.lang.String r0 = r0.trim()
            java.lang.String r0 = r0.toLowerCase()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L16
        L15:
            return r7
        L16:
            java.lang.String r1 = "true"
            boolean r1 = r1.equals(r0)
            r2 = 1
            if (r1 != 0) goto L61
            java.lang.String r1 = "yes"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L61
            java.lang.String r1 = "1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L30
            goto L61
        L30:
            java.lang.String r1 = "false"
            boolean r1 = r1.equals(r0)
            r3 = 0
            if (r1 != 0) goto L60
            java.lang.String r1 = "no"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L60
            java.lang.String r1 = "0"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L4a
            goto L60
        L4a:
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.internal.SystemPropertyUtil.logger
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r7)
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r3] = r6
            r5[r2] = r0
            r6 = 2
            r5[r6] = r4
            java.lang.String r6 = "Unable to parse the boolean system property '{}':{} - using the default value: {}"
            r1.warn(r6, r5)
            return r7
        L60:
            return r3
        L61:
            return r2
    }

    public static int getInt(java.lang.String r5, int r6) {
            java.lang.String r0 = get(r5)
            if (r0 != 0) goto L7
            return r6
        L7:
            java.lang.String r0 = r0.trim()
            int r5 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L10
            return r5
        L10:
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.internal.SystemPropertyUtil.logger
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r5
            r5 = 1
            r3[r5] = r0
            r5 = 2
            r3[r5] = r2
            java.lang.String r5 = "Unable to parse the integer system property '{}':{} - using the default value: {}"
            r1.warn(r5, r3)
            return r6
    }

    public static long getLong(java.lang.String r5, long r6) {
            java.lang.String r0 = get(r5)
            if (r0 != 0) goto L7
            return r6
        L7:
            java.lang.String r0 = r0.trim()
            long r5 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Exception -> L10
            return r5
        L10:
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.internal.SystemPropertyUtil.logger
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r5
            r5 = 1
            r3[r5] = r0
            r5 = 2
            r3[r5] = r2
            java.lang.String r5 = "Unable to parse the long integer system property '{}':{} - using the default value: {}"
            r1.warn(r5, r3)
            return r6
    }
}
