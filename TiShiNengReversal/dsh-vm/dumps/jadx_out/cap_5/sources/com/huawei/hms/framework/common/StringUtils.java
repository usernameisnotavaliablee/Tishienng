package com.huawei.hms.framework.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class StringUtils {
    private static final java.lang.String a = "com.huawei.secure.android.common.util.SafeString";
    private static boolean b = false;
    private static final java.lang.String c = "StringUtils";
    private static final int d = 1024;

    static {
            return
    }

    public StringUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean a(java.lang.String r2) {
            java.lang.Class<com.huawei.hms.framework.common.SecurityBase64Utils> r0 = com.huawei.hms.framework.common.SecurityBase64Utils.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            r0.loadClass(r2)     // Catch: java.lang.ClassNotFoundException -> L18
            java.lang.Class<com.huawei.hms.framework.common.StringUtils> r2 = com.huawei.hms.framework.common.StringUtils.class
            monitor-enter(r2)     // Catch: java.lang.ClassNotFoundException -> L18
            r0 = 1
            com.huawei.hms.framework.common.StringUtils.b = r0     // Catch: java.lang.Throwable -> L15
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
            return r0
        L15:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
            throw r0     // Catch: java.lang.ClassNotFoundException -> L18
        L18:
            return r1
    }

    public static java.lang.String anonymizeMessage(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L7
            return r2
        L7:
            char[] r2 = r2.toCharArray()
            r0 = 0
        Lc:
            int r1 = r2.length
            if (r0 >= r1) goto L1a
            int r1 = r0 % 2
            if (r1 == 0) goto L17
            r1 = 42
            r2[r0] = r1
        L17:
            int r0 = r0 + 1
            goto Lc
        L1a:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            return r0
    }

    public static java.lang.String byte2Str(byte[] r3) {
            java.lang.String r0 = ""
            if (r3 != 0) goto L5
            return r0
        L5:
            java.lang.String r1 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> Ld
            java.lang.String r2 = "UTF-8"
            r1.<init>(r3, r2)     // Catch: java.io.UnsupportedEncodingException -> Ld
            return r1
        Ld:
            r3 = move-exception
            java.lang.String r3 = r3.getMessage()
            java.lang.String r3 = anonymizeMessage(r3)
            java.lang.String r1 = "StringUtils.byte2str error: UnsupportedEncodingException"
            com.huawei.hms.framework.common.Logger.w(r1, r3)
            return r0
    }

    public static java.lang.String collection2String(java.util.Collection<java.lang.String> r2) {
            if (r2 == 0) goto L36
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        L11:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            java.lang.String r1 = ";"
            r0.append(r1)
            goto L11
        L26:
            java.lang.String r2 = r0.toString()
            int r0 = r0.length()
            int r0 = r0 + (-1)
            r1 = 0
            java.lang.String r2 = r2.substring(r1, r0)
            return r2
        L36:
            r2 = 0
            return r2
    }

    public static java.lang.String format(java.lang.String r1, java.lang.Object... r2) {
            if (r1 != 0) goto L5
            java.lang.String r1 = ""
            return r1
        L5:
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = java.lang.String.format(r0, r1, r2)
            return r1
    }

    public static byte[] getBytes(long r0) {
            java.lang.String r0 = java.lang.String.valueOf(r0)
            byte[] r0 = getBytes(r0)
            return r0
    }

    public static byte[] getBytes(java.lang.String r2) {
            r0 = 0
            byte[] r0 = new byte[r0]
            if (r2 != 0) goto L6
            return r0
        L6:
            java.lang.String r1 = "utf-8"
            byte[] r2 = r2.getBytes(r1)     // Catch: java.io.UnsupportedEncodingException -> Ld
            return r2
        Ld:
            java.lang.String r2 = "StringUtils"
            java.lang.String r1 = "the content has error while it is converted to bytes"
            com.huawei.hms.framework.common.Logger.w(r2, r1)
            return r0
    }

    public static java.lang.String getTraceInfo(java.lang.Throwable r5) {
            java.lang.StackTraceElement[] r5 = r5.getStackTrace()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 1024(0x400, float:1.435E-42)
            r0.<init>(r1)
            int r1 = r5.length
            r2 = 0
        Ld:
            if (r2 >= r1) goto L25
            r3 = r5[r2]
            java.lang.String r4 = "at "
            r0.append(r4)
            java.lang.String r3 = r3.toString()
            r0.append(r3)
            java.lang.String r3 = ";"
            r0.append(r3)
            int r2 = r2 + 1
            goto Ld
        L25:
            java.lang.String r5 = r0.toString()
            return r5
    }

    public static java.lang.String replace(java.lang.String r2, java.lang.CharSequence r3, java.lang.CharSequence r4) {
            boolean r0 = com.huawei.hms.framework.common.StringUtils.b
            if (r0 != 0) goto Lc
            java.lang.String r0 = "com.huawei.secure.android.common.util.SafeString"
            boolean r0 = a(r0)
            if (r0 == 0) goto L18
        Lc:
            java.lang.String r2 = com.huawei.secure.android.common.util.SafeString.replace(r2, r3, r4)     // Catch: java.lang.Throwable -> L11
            return r2
        L11:
            java.lang.String r0 = "StringUtils"
            java.lang.String r1 = "SafeString.substring error"
            com.huawei.hms.framework.common.Logger.w(r0, r1)
        L18:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L28
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L28
            java.lang.String r2 = r2.replace(r3, r4)     // Catch: java.lang.Exception -> L28
        L28:
            return r2
    }

    public static byte[] str2Byte(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r1 = 0
            if (r0 == 0) goto La
            byte[] r2 = new byte[r1]
            return r2
        La:
            java.lang.String r0 = "UTF-8"
            byte[] r2 = r2.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> L11
            return r2
        L11:
            r2 = move-exception
            java.lang.String r2 = r2.getMessage()
            java.lang.String r2 = anonymizeMessage(r2)
            java.lang.String r0 = "StringUtils.str2Byte error: UnsupportedEncodingException"
            com.huawei.hms.framework.common.Logger.w(r0, r2)
            byte[] r2 = new byte[r1]
            return r2
    }

    public static boolean strEquals(java.lang.String r0, java.lang.String r1) {
            if (r0 == r1) goto Ld
            if (r0 == 0) goto Lb
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            return r0
        Ld:
            r0 = 1
            return r0
    }

    public static boolean stringToBoolean(java.lang.String r2, boolean r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L7
            return r3
        L7:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.NumberFormatException -> L10
            boolean r2 = r2.booleanValue()     // Catch: java.lang.NumberFormatException -> L10
            return r2
        L10:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "String to Integer catch NumberFormatException."
            r0.append(r1)
            java.lang.String r2 = r2.getMessage()
            java.lang.String r2 = anonymizeMessage(r2)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "StringUtils"
            com.huawei.hms.framework.common.Logger.w(r0, r2)
            return r3
    }

    public static int stringToInteger(java.lang.String r2, int r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L7
            return r3
        L7:
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> Lc
            return r2
        Lc:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "String to Integer catch NumberFormatException."
            r0.append(r1)
            java.lang.String r2 = r2.getMessage()
            java.lang.String r2 = anonymizeMessage(r2)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "StringUtils"
            com.huawei.hms.framework.common.Logger.w(r0, r2)
            return r3
    }

    public static long stringToLong(java.lang.String r2, long r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L7
            return r3
        L7:
            long r2 = java.lang.Long.parseLong(r2)     // Catch: java.lang.NumberFormatException -> Lc
            return r2
        Lc:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "String to Long catch NumberFormatException."
            r0.append(r1)
            java.lang.String r2 = r2.getMessage()
            java.lang.String r2 = anonymizeMessage(r2)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "StringUtils"
            com.huawei.hms.framework.common.Logger.w(r0, r2)
            return r3
    }

    public static java.lang.String substring(java.lang.String r2, int r3) {
            java.lang.String r0 = "com.huawei.secure.android.common.util.SafeString"
            boolean r0 = a(r0)
            if (r0 == 0) goto L14
            java.lang.String r2 = com.huawei.secure.android.common.util.SafeString.substring(r2, r3)     // Catch: java.lang.Throwable -> Ld
            return r2
        Ld:
            java.lang.String r0 = "StringUtils"
            java.lang.String r1 = "SafeString.substring error"
            com.huawei.hms.framework.common.Logger.w(r0, r1)
        L14:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r1 = ""
            if (r0 != 0) goto L29
            int r0 = r2.length()
            if (r0 < r3) goto L29
            if (r3 < 0) goto L29
            java.lang.String r2 = r2.substring(r3)     // Catch: java.lang.Exception -> L29
            return r2
        L29:
            return r1
    }

    public static java.lang.String substring(java.lang.String r2, int r3, int r4) {
            boolean r0 = com.huawei.hms.framework.common.StringUtils.b
            if (r0 != 0) goto Lc
            java.lang.String r0 = "com.huawei.secure.android.common.util.SafeString"
            boolean r0 = a(r0)
            if (r0 == 0) goto L18
        Lc:
            java.lang.String r2 = com.huawei.secure.android.common.util.SafeString.substring(r2, r3, r4)     // Catch: java.lang.Throwable -> L11
            return r2
        L11:
            java.lang.String r0 = "StringUtils"
            java.lang.String r1 = "SafeString.substring error"
            com.huawei.hms.framework.common.Logger.w(r0, r1)
        L18:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r1 = ""
            if (r0 != 0) goto L2f
            if (r3 < 0) goto L2f
            int r0 = r2.length()
            if (r4 > r0) goto L2f
            if (r4 < r3) goto L2f
            java.lang.String r2 = r2.substring(r3, r4)     // Catch: java.lang.Exception -> L2f
            return r2
        L2f:
            return r1
    }

    public static java.lang.String toLowerCase(java.lang.String r1) {
            if (r1 != 0) goto L5
            java.lang.String r1 = ""
            return r1
        L5:
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r0)
            return r1
    }
}
