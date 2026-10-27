package org.apache.harmony.misc;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class SystemUtils {
    public static final int ARC_IA32 = 1;
    public static final int ARC_IA64 = 2;
    public static final int ARC_UNKNOWN = -1;
    public static final int OS_LINUX = 2;
    public static final int OS_UNKNOWN = -1;
    public static final int OS_WINDOWS = 1;
    private static int arc;
    private static int os;

    static {
            return
    }

    public SystemUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int getOS() {
            int r0 = org.apache.harmony.misc.SystemUtils.os
            if (r0 != 0) goto L2b
            java.lang.String r0 = "os.name"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r1 = 0
            r2 = 3
            java.lang.String r0 = r0.substring(r1, r2)
            java.lang.String r1 = "win"
            int r1 = r0.compareToIgnoreCase(r1)
            if (r1 != 0) goto L1c
            r0 = 1
            org.apache.harmony.misc.SystemUtils.os = r0
            goto L2b
        L1c:
            java.lang.String r1 = "lin"
            int r0 = r0.compareToIgnoreCase(r1)
            if (r0 != 0) goto L28
            r0 = 2
            org.apache.harmony.misc.SystemUtils.os = r0
            goto L2b
        L28:
            r0 = -1
            org.apache.harmony.misc.SystemUtils.os = r0
        L2b:
            int r0 = org.apache.harmony.misc.SystemUtils.os
            return r0
    }
}
