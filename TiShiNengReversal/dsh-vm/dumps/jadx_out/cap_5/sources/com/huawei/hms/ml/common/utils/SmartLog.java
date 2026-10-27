package com.huawei.hms.ml.common.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class SmartLog {
    private static final int LEN_CONST = 2;
    private static final java.util.regex.Pattern M_PATTERN = null;
    private static final char STAR = '*';

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class ThrowableWrapper extends java.lang.Throwable {
        private static final long serialVersionUID = 7129050843360571879L;
        private java.lang.String message;
        private java.lang.Throwable ownerThrowable;
        private java.lang.Throwable thisCause;

        public ThrowableWrapper(java.lang.Throwable r1) {
                r0 = this;
                r0.<init>()
                r0.ownerThrowable = r1
                return
        }

        @Override // java.lang.Throwable
        public java.lang.Throwable getCause() {
                r1 = this;
                java.lang.Throwable r0 = r1.thisCause
                if (r0 != r1) goto L5
                r0 = 0
            L5:
                return r0
        }

        @Override // java.lang.Throwable
        public java.lang.String getMessage() {
                r1 = this;
                java.lang.String r0 = r1.message
                return r0
        }

        public void setCause(java.lang.Throwable r1) {
                r0 = this;
                r0.thisCause = r1
                return
        }

        public void setMessage(java.lang.String r1) {
                r0 = this;
                r0.message = r1
                return
        }

        @Override // java.lang.Throwable
        public java.lang.String toString() {
                r2 = this;
                java.lang.Throwable r0 = r2.ownerThrowable
                if (r0 != 0) goto L7
                java.lang.String r0 = ""
                return r0
            L7:
                java.lang.Class r0 = r0.getClass()
                java.lang.String r0 = r0.getName()
                java.lang.String r1 = r2.message
                if (r1 == 0) goto L40
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                java.lang.String r0 = ": "
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                java.lang.String r1 = r2.message
                boolean r1 = r1.startsWith(r0)
                if (r1 == 0) goto L2f
                java.lang.String r0 = r2.message
                return r0
            L2f:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                java.lang.String r0 = r2.message
                r1.append(r0)
                java.lang.String r0 = r1.toString()
            L40:
                return r0
        }
    }

    static {
            java.lang.String r0 = "[0-9]*[a-z|A-Z]*[一-龥]*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.huawei.hms.ml.common.utils.SmartLog.M_PATTERN = r0
            return
    }

    public SmartLog() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void d(java.lang.String r0, java.lang.String r1) {
            return
    }

    public static void d(java.lang.String r0, java.lang.String r1, java.lang.String r2) {
            return
    }

    public static void d(java.lang.String r0, java.lang.String r1, java.lang.String r2, java.lang.Throwable r3) {
            return
    }

    public static void d(java.lang.String r0, java.lang.String r1, java.lang.Throwable r2) {
            return
    }

    public static void d(java.lang.String r0, java.lang.String r1, java.lang.Throwable r2, boolean r3) {
            return
    }

    public static void d(java.lang.String r0, java.lang.String r1, boolean r2) {
            return
    }

    public static void e(java.lang.String r0, java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto La
            r0 = 0
            getLogMsg(r1, r0)
        La:
            return
    }

    public static void e(java.lang.String r0, java.lang.String r1, java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto Le
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto Ld
            goto Le
        Ld:
            return
        Le:
            getLogMsg(r1, r2)
            return
    }

    public static void e(java.lang.String r0, java.lang.String r1, java.lang.String r2, java.lang.Throwable r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto Le
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto Ld
            goto Le
        Ld:
            return
        Le:
            getLogMsg(r1, r2)
            getNewThrowable(r3)
            return
    }

    public static void e(java.lang.String r0, java.lang.String r1, java.lang.Throwable r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto La
            if (r2 == 0) goto L9
            goto La
        L9:
            return
        La:
            r0 = 0
            getLogMsg(r1, r0)
            getNewThrowable(r2)
            return
    }

    public static void e(java.lang.String r0, java.lang.String r1, java.lang.Throwable r2, boolean r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto La
            if (r2 == 0) goto L9
            goto La
        L9:
            return
        La:
            getLogMsg(r1, r3)
            getNewThrowable(r2)
            return
    }

    public static void e(java.lang.String r0, java.lang.String r1, boolean r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L9
            getLogMsg(r1, r2)
        L9:
            return
    }

    private static java.lang.String formatLogWithStar(java.lang.String r8) {
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L7
            return r8
        L7:
            int r0 = r8.length()
            r1 = 42
            r2 = 1
            if (r2 != r0) goto L15
            java.lang.String r8 = java.lang.String.valueOf(r1)
            return r8
        L15:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            r4 = 0
        L1b:
            if (r4 >= r0) goto L3f
            char r5 = r8.charAt(r4)
            java.util.regex.Pattern r6 = com.huawei.hms.ml.common.utils.SmartLog.M_PATTERN
            java.lang.String r7 = java.lang.String.valueOf(r5)
            java.util.regex.Matcher r6 = r6.matcher(r7)
            boolean r6 = r6.matches()
            if (r6 == 0) goto L39
            int r6 = r2 % 2
            if (r6 != 0) goto L37
            r5 = 42
        L37:
            int r2 = r2 + 1
        L39:
            r3.append(r5)
            int r4 = r4 + 1
            goto L1b
        L3f:
            java.lang.String r8 = r3.toString()
            return r8
    }

    private static java.lang.String getLogMsg(java.lang.String r2, java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 512(0x200, float:7.17E-43)
            r0.<init>(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L10
            r0.append(r2)
        L10:
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L1d
            java.lang.String r2 = formatLogWithStar(r3)
            r0.append(r2)
        L1d:
            java.lang.String r2 = r0.toString()
            return r2
    }

    private static java.lang.String getLogMsg(java.lang.String r2, boolean r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 512(0x200, float:7.17E-43)
            r0.<init>(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L1a
            if (r3 == 0) goto L17
            java.lang.String r2 = formatLogWithStar(r2)
            r0.append(r2)
            goto L1a
        L17:
            r0.append(r2)
        L1a:
            java.lang.String r2 = r0.toString()
            return r2
    }

    private static java.lang.Throwable getNewThrowable(java.lang.Throwable r4) {
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            com.huawei.hms.ml.common.utils.SmartLog$ThrowableWrapper r0 = new com.huawei.hms.ml.common.utils.SmartLog$ThrowableWrapper
            r0.<init>(r4)
            java.lang.StackTraceElement[] r1 = r4.getStackTrace()
            r0.setStackTrace(r1)
            java.lang.String r1 = r4.getMessage()
            java.lang.String r1 = modifyExceptionMessage(r1)
            r0.setMessage(r1)
            java.lang.Throwable r4 = r4.getCause()
            r1 = r0
        L20:
            if (r4 == 0) goto L42
            com.huawei.hms.ml.common.utils.SmartLog$ThrowableWrapper r2 = new com.huawei.hms.ml.common.utils.SmartLog$ThrowableWrapper
            r2.<init>(r4)
            java.lang.StackTraceElement[] r3 = r4.getStackTrace()
            r2.setStackTrace(r3)
            java.lang.String r3 = r4.getMessage()
            java.lang.String r3 = modifyExceptionMessage(r3)
            r2.setMessage(r3)
            r1.setCause(r2)
            java.lang.Throwable r4 = r4.getCause()
            r1 = r2
            goto L20
        L42:
            return r0
    }

    public static void i(java.lang.String r0, java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto La
            r0 = 0
            getLogMsg(r1, r0)
        La:
            return
    }

    public static void i(java.lang.String r0, java.lang.String r1, java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto Le
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto Ld
            goto Le
        Ld:
            return
        Le:
            getLogMsg(r1, r2)
            return
    }

    public static void i(java.lang.String r0, java.lang.String r1, java.lang.String r2, java.lang.Throwable r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto Le
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto Ld
            goto Le
        Ld:
            return
        Le:
            getLogMsg(r1, r2)
            getNewThrowable(r3)
            return
    }

    public static void i(java.lang.String r0, java.lang.String r1, java.lang.Throwable r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto La
            if (r2 == 0) goto L9
            goto La
        L9:
            return
        La:
            r0 = 0
            getLogMsg(r1, r0)
            getNewThrowable(r2)
            return
    }

    public static void i(java.lang.String r0, java.lang.String r1, java.lang.Throwable r2, boolean r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto La
            if (r2 == 0) goto L9
            goto La
        L9:
            return
        La:
            getLogMsg(r1, r3)
            getNewThrowable(r2)
            return
    }

    public static void i(java.lang.String r0, java.lang.String r1, boolean r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L9
            getLogMsg(r1, r2)
        L9:
            return
    }

    private static java.lang.String modifyExceptionMessage(java.lang.String r2) {
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
            if (r1 != 0) goto L17
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

    public static void w(java.lang.String r0, java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto La
            r0 = 0
            getLogMsg(r1, r0)
        La:
            return
    }

    public static void w(java.lang.String r0, java.lang.String r1, java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto Le
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto Ld
            goto Le
        Ld:
            return
        Le:
            getLogMsg(r1, r2)
            return
    }

    public static void w(java.lang.String r0, java.lang.String r1, java.lang.String r2, java.lang.Throwable r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto Le
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto Ld
            goto Le
        Ld:
            return
        Le:
            getLogMsg(r1, r2)
            getNewThrowable(r3)
            return
    }

    public static void w(java.lang.String r0, java.lang.String r1, java.lang.Throwable r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto La
            if (r2 == 0) goto L9
            goto La
        L9:
            return
        La:
            r0 = 0
            getLogMsg(r1, r0)
            getNewThrowable(r2)
            return
    }

    public static void w(java.lang.String r0, java.lang.String r1, java.lang.Throwable r2, boolean r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto La
            if (r2 == 0) goto L9
            goto La
        L9:
            return
        La:
            getLogMsg(r1, r3)
            getNewThrowable(r2)
            return
    }

    public static void w(java.lang.String r0, java.lang.String r1, boolean r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L9
            getLogMsg(r1, r2)
        L9:
            return
    }
}
