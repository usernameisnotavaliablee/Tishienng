package com.huawei.hms.framework.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class CheckParamUtils {
    private static final java.lang.String a = "CheckParamUtils";
    private static final java.lang.String b = "(^((([0-9A-Fa-f]{1,4}:){7}(([0-9A-Fa-f]{1,4}){1}|:))|(([0-9A-Fa-f]{1,4}:){6}((:[0-9A-Fa-f]{1,4}){1}|((22[0-3]|2[0-1][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})([.](25[0-5]|2[0-4][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})){3})|:))|(([0-9A-Fa-f]{1,4}:){5}((:[0-9A-Fa-f]{1,4}){1,2}|:((22[0-3]|2[0-1][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})([.](25[0-5]|2[0-4][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})){3})|:))|(([0-9A-Fa-f]{1,4}:){4}((:[0-9A-Fa-f]{1,4}){1,3}|:((22[0-3]|2[0-1][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})([.](25[0-5]|2[0-4][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})){3})|:))|(([0-9A-Fa-f]{1,4}:){3}((:[0-9A-Fa-f]{1,4}){1,4}|:((22[0-3]|2[0-1][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})([.](25[0-5]|2[0-4][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})){3})|:))|(([0-9A-Fa-f]{1,4}:){2}((:[0-9A-Fa-f]{1,4}){1,5}|:((22[0-3]|2[0-1][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})([.](25[0-5]|2[0-4][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})){3})|:))|(([0-9A-Fa-f]{1,4}:){1}((:[0-9A-Fa-f]{1,4}){1,6}|:((22[0-3]|2[0-1][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})([.](25[0-5]|2[0-4][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})){3})|:))|(:((:[0-9A-Fa-f]{1,4}){1,7}|(:[fF]{4}){0,1}:((22[0-3]|2[0-1][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})([.](25[0-5]|2[0-4][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})){3})|:)))$)";
    private static java.util.regex.Pattern c;

    static {
            java.lang.String r0 = "(^((([0-9A-Fa-f]{1,4}:){7}(([0-9A-Fa-f]{1,4}){1}|:))|(([0-9A-Fa-f]{1,4}:){6}((:[0-9A-Fa-f]{1,4}){1}|((22[0-3]|2[0-1][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})([.](25[0-5]|2[0-4][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})){3})|:))|(([0-9A-Fa-f]{1,4}:){5}((:[0-9A-Fa-f]{1,4}){1,2}|:((22[0-3]|2[0-1][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})([.](25[0-5]|2[0-4][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})){3})|:))|(([0-9A-Fa-f]{1,4}:){4}((:[0-9A-Fa-f]{1,4}){1,3}|:((22[0-3]|2[0-1][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})([.](25[0-5]|2[0-4][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})){3})|:))|(([0-9A-Fa-f]{1,4}:){3}((:[0-9A-Fa-f]{1,4}){1,4}|:((22[0-3]|2[0-1][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})([.](25[0-5]|2[0-4][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})){3})|:))|(([0-9A-Fa-f]{1,4}:){2}((:[0-9A-Fa-f]{1,4}){1,5}|:((22[0-3]|2[0-1][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})([.](25[0-5]|2[0-4][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})){3})|:))|(([0-9A-Fa-f]{1,4}:){1}((:[0-9A-Fa-f]{1,4}){1,6}|:((22[0-3]|2[0-1][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})([.](25[0-5]|2[0-4][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})){3})|:))|(:((:[0-9A-Fa-f]{1,4}){1,7}|(:[fF]{4}){0,1}:((22[0-3]|2[0-1][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})([.](25[0-5]|2[0-4][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})){3})|:)))$)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.huawei.hms.framework.common.CheckParamUtils.c = r0
            return
    }

    public CheckParamUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T> T checkNotNull(T r0, java.lang.String r1) {
            if (r0 == 0) goto L3
            return r0
        L3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
    }

    public static int checkNumParam(int r0, int r1, int r2, int r3, java.lang.String r4) {
            if (r0 > r2) goto Lb
            if (r0 >= r1) goto L5
            goto Lb
        L5:
            java.lang.String r1 = "CheckParamUtils"
            com.huawei.hms.framework.common.Logger.d(r1, r4)
            return r0
        Lb:
            return r3
    }

    public static long checkNumParam(long r1, long r3, long r5, long r7, java.lang.String r9) {
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 > 0) goto Lf
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L9
            goto Lf
        L9:
            java.lang.String r3 = "CheckParamUtils"
            com.huawei.hms.framework.common.Logger.d(r3, r9)
            return r1
        Lf:
            return r7
    }

    public static void checkOffsetAndCount(long r5, long r7, long r9) {
            long r0 = r7 | r9
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L12
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 > 0) goto L12
            long r5 = r5 - r7
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 < 0) goto L12
            return
        L12:
            java.lang.ArrayIndexOutOfBoundsException r5 = new java.lang.ArrayIndexOutOfBoundsException
            r5.<init>()
            throw r5
    }

    public static boolean isIpV4(java.lang.String r6) {
            r0 = 0
            if (r6 == 0) goto L49
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto L49
            int r1 = r6.length()
            r2 = 15
            if (r1 <= r2) goto L12
            goto L49
        L12:
            java.lang.String r1 = "."
            java.lang.String r2 = ""
            java.lang.String r1 = r6.replace(r1, r2)
            java.lang.String r2 = "[0-9]+"
            boolean r1 = r1.matches(r2)
            if (r1 != 0) goto L23
            return r0
        L23:
            java.lang.String r1 = "\\."
            java.lang.String[] r6 = r6.split(r1)
            int r1 = r6.length
            r2 = 4
            if (r1 == r2) goto L2e
            return r0
        L2e:
            int r1 = r6.length
            r3 = 0
        L30:
            if (r3 >= r1) goto L47
            r4 = r6[r3]
            int r5 = r4.length()
            if (r5 > r2) goto L46
            int r4 = java.lang.Integer.parseInt(r4)
            r5 = 255(0xff, float:3.57E-43)
            if (r4 <= r5) goto L43
            goto L46
        L43:
            int r3 = r3 + 1
            goto L30
        L46:
            return r0
        L47:
            r6 = 1
            return r6
        L49:
            return r0
    }

    public static boolean isIpV6(java.lang.String r2) {
            if (r2 == 0) goto L23
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L23
            int r0 = r2.length()
            r1 = 2
            if (r0 < r1) goto L23
            int r0 = r2.length()
            r1 = 39
            if (r0 <= r1) goto L18
            goto L23
        L18:
            java.util.regex.Pattern r0 = com.huawei.hms.framework.common.CheckParamUtils.c
            java.util.regex.Matcher r2 = r0.matcher(r2)
            boolean r2 = r2.matches()
            return r2
        L23:
            r2 = 0
            return r2
    }
}
