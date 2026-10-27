package com.huawei.hms.framework.common.grs;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class GrsUtils {
    private static final int a = 3;
    private static final int b = 0;
    private static final int c = 1;
    private static final int d = 2;
    private static final java.lang.String e = "/";
    private static final java.lang.String f = "grs://";

    public GrsUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String fixResult(java.lang.String[] r3, java.lang.String r4) {
            int r0 = r3.length
            r1 = 2
            if (r0 <= r1) goto L33
            java.lang.String r0 = "/"
            boolean r2 = r4.endsWith(r0)
            if (r2 == 0) goto L1e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r3 = r3[r1]
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
        L1e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            r2.append(r0)
            r3 = r3[r1]
            r2.append(r3)
            java.lang.String r3 = r2.toString()
            return r3
        L33:
            return r4
    }

    public static boolean isGRSSchema(java.lang.String r1) {
            if (r1 == 0) goto Lc
            java.lang.String r0 = "grs://"
            boolean r1 = r1.startsWith(r0)
            if (r1 == 0) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    public static java.lang.String[] parseGRSSchema(java.lang.String r2) {
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r0 = r2.toLowerCase(r0)
            java.lang.String r1 = "grs://"
            int r0 = r0.indexOf(r1)
            int r0 = r0 + 6
            java.lang.String r2 = com.huawei.hms.framework.common.StringUtils.substring(r2, r0)
            java.lang.String r0 = "/"
            r1 = 3
            java.lang.String[] r2 = r2.split(r0, r1)
            int r0 = r2.length
            r1 = 1
            if (r0 != r1) goto L26
            r0 = 0
            r2 = r2[r0]
            java.lang.String r0 = "ROOT"
            java.lang.String[] r2 = new java.lang.String[]{r2, r0}
        L26:
            return r2
    }

    public static java.lang.String[] parseParams(java.lang.String r2) {
            java.lang.String r0 = "/"
            boolean r0 = r2.endsWith(r0)
            if (r0 == 0) goto L18
            java.lang.String r0 = "grs://"
            int r0 = r2.indexOf(r0)
            int r1 = r2.length()
            int r1 = r1 + (-1)
            java.lang.String r2 = com.huawei.hms.framework.common.StringUtils.substring(r2, r0, r1)
        L18:
            java.lang.String[] r2 = parseGRSSchema(r2)
            return r2
    }
}
