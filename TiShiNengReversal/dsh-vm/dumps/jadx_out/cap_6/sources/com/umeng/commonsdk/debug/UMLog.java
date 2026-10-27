package com.umeng.commonsdk.debug;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class UMLog {
    private static final java.lang.String AQ = "├───────────────────解决方案─────────────────────────────────────────────────────────────────────────────";
    private static final java.lang.String BOTTOM_BORDER = "└────────────────────────────────────────────────────────────────────────────────────────────────────────────────";
    private static final char BOTTOM_LEFT_CORNER = 9492;
    private static final java.lang.String DOUBLE_DIVIDER = "────────────────────────────────────────────────────────";
    private static final java.lang.String DOUBLE_DIVIDER_AQ = "───────────────────问题─────────────────────";
    private static final char HORIZONTAL_LINE = 9474;
    private static final java.lang.String INDENT = "     ";
    private static final int JSON_INDENT = 2;
    private static final int KEYLENGTH = 10;
    private static final java.lang.String MIDDLE_BORDER = "├┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄";
    private static final char MIDDLE_CORNER = 9500;
    private static final java.lang.String SINGLE_DIVIDER = "┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄";
    private static final java.lang.String SINGLE_DIVIDER_AQ = "───────────────────解决方案─────────────────────";
    private static final java.lang.String TAG = "UMLog";
    private static final java.lang.String TOP_BORDER = "┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────";
    private static final java.lang.String TOP_BORDER_AQ = "┌───────────────────问题─────────────────────────────────────────────────────────────────────────────";
    private static final char TOP_LEFT_CORNER = 9484;

    public UMLog() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void aq(int r3, java.lang.String r4, java.lang.String r5) {
            java.lang.String r0 = "│     "
            java.lang.String r1 = "UMLog"
            boolean r2 = com.umeng.commonsdk.UMConfigure.isDebugLog()     // Catch: java.lang.Exception -> L42
            if (r2 != 0) goto Lb
            goto L42
        Lb:
            com.umeng.commonsdk.debug.UInterface r3 = getLogger(r3)     // Catch: java.lang.Exception -> L42
            java.lang.String r2 = "┌───────────────────问题─────────────────────────────────────────────────────────────────────────────"
            r3.log(r1, r2)     // Catch: java.lang.Exception -> L42
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L42
            r2.<init>()     // Catch: java.lang.Exception -> L42
            r2.append(r0)     // Catch: java.lang.Exception -> L42
            r2.append(r4)     // Catch: java.lang.Exception -> L42
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Exception -> L42
            r3.log(r1, r4)     // Catch: java.lang.Exception -> L42
            java.lang.String r4 = "├───────────────────解决方案─────────────────────────────────────────────────────────────────────────────"
            r3.log(r1, r4)     // Catch: java.lang.Exception -> L42
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L42
            r4.<init>()     // Catch: java.lang.Exception -> L42
            r4.append(r0)     // Catch: java.lang.Exception -> L42
            r4.append(r5)     // Catch: java.lang.Exception -> L42
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L42
            r3.log(r1, r4)     // Catch: java.lang.Exception -> L42
            java.lang.String r4 = "└────────────────────────────────────────────────────────────────────────────────────────────────────────────────"
            r3.log(r1, r4)     // Catch: java.lang.Exception -> L42
        L42:
            return
    }

    public static void aq(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = 0
            aq(r0, r1, r2, r3)
            return
    }

    public static void aq(java.lang.String r3, int r4, java.lang.String r5, java.lang.String r6) {
            java.lang.String r0 = "│     "
            boolean r1 = com.umeng.commonsdk.UMConfigure.isDebugLog()     // Catch: java.lang.Exception -> L51
            if (r1 != 0) goto L9
            goto L51
        L9:
            com.umeng.commonsdk.debug.UInterface r4 = getLogger(r4)     // Catch: java.lang.Exception -> L51
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L51
            r1.<init>()     // Catch: java.lang.Exception -> L51
            java.lang.String r2 = "UMLog_"
            r1.append(r2)     // Catch: java.lang.Exception -> L51
            r1.append(r3)     // Catch: java.lang.Exception -> L51
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Exception -> L51
            java.lang.String r1 = "┌───────────────────问题─────────────────────────────────────────────────────────────────────────────"
            r4.log(r3, r1)     // Catch: java.lang.Exception -> L51
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L51
            r1.<init>()     // Catch: java.lang.Exception -> L51
            r1.append(r0)     // Catch: java.lang.Exception -> L51
            r1.append(r5)     // Catch: java.lang.Exception -> L51
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Exception -> L51
            r4.log(r3, r5)     // Catch: java.lang.Exception -> L51
            java.lang.String r5 = "├───────────────────解决方案─────────────────────────────────────────────────────────────────────────────"
            r4.log(r3, r5)     // Catch: java.lang.Exception -> L51
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L51
            r5.<init>()     // Catch: java.lang.Exception -> L51
            r5.append(r0)     // Catch: java.lang.Exception -> L51
            r5.append(r6)     // Catch: java.lang.Exception -> L51
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L51
            r4.log(r3, r5)     // Catch: java.lang.Exception -> L51
            java.lang.String r5 = "└────────────────────────────────────────────────────────────────────────────────────────────────────────────────"
            r4.log(r3, r5)     // Catch: java.lang.Exception -> L51
        L51:
            return
    }

    public static void aq(java.lang.String r8, int r9, java.lang.String r10, java.lang.String[] r11, java.lang.String[] r12, java.lang.String[] r13, java.lang.String[] r14) {
            r0 = 0
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            aq(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void aq(java.lang.String r8, java.lang.String r9, int r10, java.lang.String r11) {
            r6 = 0
            r7 = 0
            r4 = 0
            r5 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            aq(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void aq(java.lang.String r5, java.lang.String r6, int r7, java.lang.String r8, java.lang.String[] r9, java.lang.String[] r10, java.lang.String[] r11, java.lang.String[] r12) {
            java.lang.String r0 = "│     "
            boolean r1 = com.umeng.commonsdk.UMConfigure.isDebugLog()     // Catch: java.lang.Exception -> Lb7
            if (r1 != 0) goto La
            goto Lb7
        La:
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> Lb7
            if (r1 == 0) goto L13
            java.lang.String r5 = "UMLog"
            goto L24
        L13:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lb7
            r1.<init>()     // Catch: java.lang.Exception -> Lb7
            java.lang.String r2 = "UMLog_"
            r1.append(r2)     // Catch: java.lang.Exception -> Lb7
            r1.append(r5)     // Catch: java.lang.Exception -> Lb7
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Exception -> Lb7
        L24:
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Exception -> Lb7
            if (r1 != 0) goto Lb7
            boolean r1 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Exception -> Lb7
            if (r1 != 0) goto Lb7
            java.lang.String[] r6 = r6.split(r8)     // Catch: java.lang.Exception -> Lb7
            if (r6 == 0) goto Lb7
            int r8 = r6.length     // Catch: java.lang.Exception -> Lb7
            r1 = 2
            if (r8 < r1) goto Lb7
            r8 = 0
            if (r9 == 0) goto L5b
            int r1 = r9.length     // Catch: java.lang.Exception -> Lb7
            if (r1 <= 0) goto L5b
            if (r10 == 0) goto L5b
            int r1 = r10.length     // Catch: java.lang.Exception -> Lb7
            if (r1 <= 0) goto L5b
            r1 = 0
        L46:
            int r2 = r9.length     // Catch: java.lang.Exception -> Lb7
            if (r1 >= r2) goto L5b
            int r2 = r10.length     // Catch: java.lang.Exception -> Lb7
            if (r1 >= r2) goto L5b
            r2 = r6[r8]     // Catch: java.lang.Exception -> Lb7
            r3 = r9[r1]     // Catch: java.lang.Exception -> Lb7
            r4 = r10[r1]     // Catch: java.lang.Exception -> Lb7
            java.lang.String r2 = r2.replace(r3, r4)     // Catch: java.lang.Exception -> Lb7
            r6[r8] = r2     // Catch: java.lang.Exception -> Lb7
            int r1 = r1 + 1
            goto L46
        L5b:
            r9 = 1
            if (r11 == 0) goto L7c
            int r10 = r11.length     // Catch: java.lang.Exception -> Lb7
            if (r10 <= 0) goto L7c
            if (r12 == 0) goto L7c
            int r10 = r12.length     // Catch: java.lang.Exception -> Lb7
            if (r10 <= 0) goto L7c
            r10 = 0
        L67:
            int r1 = r11.length     // Catch: java.lang.Exception -> Lb7
            if (r10 >= r1) goto L7c
            int r1 = r12.length     // Catch: java.lang.Exception -> Lb7
            if (r10 >= r1) goto L7c
            r1 = r6[r9]     // Catch: java.lang.Exception -> Lb7
            r2 = r11[r10]     // Catch: java.lang.Exception -> Lb7
            r3 = r12[r10]     // Catch: java.lang.Exception -> Lb7
            java.lang.String r1 = r1.replace(r2, r3)     // Catch: java.lang.Exception -> Lb7
            r6[r9] = r1     // Catch: java.lang.Exception -> Lb7
            int r10 = r10 + 1
            goto L67
        L7c:
            com.umeng.commonsdk.debug.UInterface r7 = getLogger(r7)     // Catch: java.lang.Exception -> Lb7
            java.lang.String r10 = "┌───────────────────问题─────────────────────────────────────────────────────────────────────────────"
            r7.log(r5, r10)     // Catch: java.lang.Exception -> Lb7
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lb7
            r10.<init>()     // Catch: java.lang.Exception -> Lb7
            r10.append(r0)     // Catch: java.lang.Exception -> Lb7
            r8 = r6[r8]     // Catch: java.lang.Exception -> Lb7
            r10.append(r8)     // Catch: java.lang.Exception -> Lb7
            java.lang.String r8 = r10.toString()     // Catch: java.lang.Exception -> Lb7
            r7.log(r5, r8)     // Catch: java.lang.Exception -> Lb7
            java.lang.String r8 = "├───────────────────解决方案─────────────────────────────────────────────────────────────────────────────"
            r7.log(r5, r8)     // Catch: java.lang.Exception -> Lb7
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lb7
            r8.<init>()     // Catch: java.lang.Exception -> Lb7
            r8.append(r0)     // Catch: java.lang.Exception -> Lb7
            r6 = r6[r9]     // Catch: java.lang.Exception -> Lb7
            r8.append(r6)     // Catch: java.lang.Exception -> Lb7
            java.lang.String r6 = r8.toString()     // Catch: java.lang.Exception -> Lb7
            r7.log(r5, r6)     // Catch: java.lang.Exception -> Lb7
            java.lang.String r6 = "└────────────────────────────────────────────────────────────────────────────────────────────────────────────────"
            r7.log(r5, r6)     // Catch: java.lang.Exception -> Lb7
        Lb7:
            return
    }

    public static void bundle(int r1, android.os.Bundle r2) {
            r0 = 0
            bundle(r0, r1, r2)
            return
    }

    public static void bundle(java.lang.String r5, int r6, android.os.Bundle r7) {
            java.lang.String r0 = "├┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄"
            boolean r1 = com.umeng.commonsdk.UMConfigure.isDebugLog()     // Catch: java.lang.Exception -> L82
            if (r1 != 0) goto La
            goto L82
        La:
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L82
            if (r1 == 0) goto L13
            java.lang.String r5 = "UMLog"
            goto L24
        L13:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L82
            r1.<init>()     // Catch: java.lang.Exception -> L82
            java.lang.String r2 = "UMLog_"
            r1.append(r2)     // Catch: java.lang.Exception -> L82
            r1.append(r5)     // Catch: java.lang.Exception -> L82
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Exception -> L82
        L24:
            if (r7 == 0) goto L82
            com.umeng.commonsdk.debug.UInterface r6 = getLogger(r6)     // Catch: java.lang.Exception -> L82
            java.lang.String r1 = "┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────"
            r6.log(r5, r1)     // Catch: java.lang.Exception -> L82
            java.lang.String r1 = "│key│value"
            r6.log(r5, r1)     // Catch: java.lang.Exception -> L82
            r6.log(r5, r0)     // Catch: java.lang.Exception -> L82
            java.util.Set r1 = r7.keySet()     // Catch: java.lang.Exception -> L82
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L82
        L3f:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Exception -> L82
            if (r2 == 0) goto L7d
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Exception -> L82
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L82
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L82
            if (r3 != 0) goto L3f
            java.lang.Object r3 = r7.get(r2)     // Catch: java.lang.Exception -> L82
            if (r3 == 0) goto L3f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L82
            r3.<init>()     // Catch: java.lang.Exception -> L82
            r4 = 9474(0x2502, float:1.3276E-41)
            r3.append(r4)     // Catch: java.lang.Exception -> L82
            r3.append(r2)     // Catch: java.lang.Exception -> L82
            r3.append(r4)     // Catch: java.lang.Exception -> L82
            java.lang.Object r2 = r7.get(r2)     // Catch: java.lang.Exception -> L82
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L82
            r3.append(r2)     // Catch: java.lang.Exception -> L82
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Exception -> L82
            r6.log(r5, r2)     // Catch: java.lang.Exception -> L82
            r6.log(r5, r0)     // Catch: java.lang.Exception -> L82
            goto L3f
        L7d:
            java.lang.String r7 = "└────────────────────────────────────────────────────────────────────────────────────────────────────────────────"
            r6.log(r5, r7)     // Catch: java.lang.Exception -> L82
        L82:
            return
    }

    public static com.umeng.commonsdk.debug.UInterface getLogger(int r1) {
            if (r1 == 0) goto L23
            r0 = 1
            if (r1 == r0) goto L1d
            r0 = 2
            if (r1 == r0) goto L17
            r0 = 3
            if (r1 == r0) goto L11
            com.umeng.commonsdk.debug.D r1 = new com.umeng.commonsdk.debug.D
            r1.<init>()
            return r1
        L11:
            com.umeng.commonsdk.debug.D r1 = new com.umeng.commonsdk.debug.D
            r1.<init>()
            return r1
        L17:
            com.umeng.commonsdk.debug.I r1 = new com.umeng.commonsdk.debug.I
            r1.<init>()
            return r1
        L1d:
            com.umeng.commonsdk.debug.W r1 = new com.umeng.commonsdk.debug.W
            r1.<init>()
            return r1
        L23:
            com.umeng.commonsdk.debug.E r1 = new com.umeng.commonsdk.debug.E
            r1.<init>()
            return r1
    }

    public static void jsonArry(java.lang.String r0, org.json.JSONArray r1) {
            boolean r0 = com.umeng.commonsdk.UMConfigure.isDebugLog()     // Catch: java.lang.Exception -> Lb
            if (r0 != 0) goto L7
            goto Lb
        L7:
            r0 = 2
            r1.toString(r0)     // Catch: java.lang.Exception -> Lb
        Lb:
            return
    }

    public static void jsonArry(org.json.JSONArray r1) {
            boolean r0 = com.umeng.commonsdk.UMConfigure.isDebugLog()     // Catch: java.lang.Exception -> Lb
            if (r0 != 0) goto L7
            goto Lb
        L7:
            r0 = 2
            r1.toString(r0)     // Catch: java.lang.Exception -> Lb
        Lb:
            return
    }

    public static void jsonObject(java.lang.String r0, org.json.JSONObject r1) {
            boolean r0 = com.umeng.commonsdk.UMConfigure.isDebugLog()     // Catch: java.lang.Exception -> Lb
            if (r0 != 0) goto L7
            goto Lb
        L7:
            r0 = 2
            r1.toString(r0)     // Catch: java.lang.Exception -> Lb
        Lb:
            return
    }

    public static void jsonObject(org.json.JSONObject r1) {
            boolean r0 = com.umeng.commonsdk.UMConfigure.isDebugLog()     // Catch: java.lang.Exception -> Lb
            if (r0 != 0) goto L7
            goto Lb
        L7:
            r0 = 2
            r1.toString(r0)     // Catch: java.lang.Exception -> Lb
        Lb:
            return
    }

    public static void mutlInfo(int r5, java.lang.String... r6) {
            boolean r0 = com.umeng.commonsdk.UMConfigure.isDebugLog()     // Catch: java.lang.Exception -> L49
            if (r0 != 0) goto L7
            goto L49
        L7:
            int r0 = r6.length     // Catch: java.lang.Exception -> L49
            com.umeng.commonsdk.debug.UInterface r5 = getLogger(r5)     // Catch: java.lang.Exception -> L49
            r1 = 0
            r2 = 1
            java.lang.String r3 = "UMLog"
            if (r0 != r2) goto L18
            r6 = r6[r1]     // Catch: java.lang.Exception -> L49
            r5.log(r3, r6)     // Catch: java.lang.Exception -> L49
            return
        L18:
            r2 = 2
            if (r0 < r2) goto L49
            java.lang.String r2 = "┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────"
            r5.log(r3, r2)     // Catch: java.lang.Exception -> L49
        L20:
            if (r1 >= r0) goto L44
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L49
            r2.<init>()     // Catch: java.lang.Exception -> L49
            java.lang.String r4 = "│     "
            r2.append(r4)     // Catch: java.lang.Exception -> L49
            r4 = r6[r1]     // Catch: java.lang.Exception -> L49
            r2.append(r4)     // Catch: java.lang.Exception -> L49
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L49
            r5.log(r3, r2)     // Catch: java.lang.Exception -> L49
            int r2 = r0 + (-1)
            if (r1 == r2) goto L41
            java.lang.String r2 = "├┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄"
            r5.log(r3, r2)     // Catch: java.lang.Exception -> L49
        L41:
            int r1 = r1 + 1
            goto L20
        L44:
            java.lang.String r6 = "└────────────────────────────────────────────────────────────────────────────────────────────────────────────────"
            r5.log(r3, r6)     // Catch: java.lang.Exception -> L49
        L49:
            return
    }

    public static void mutlInfo(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = 0
            mutlInfo(r0, r1, r2, r3)
            return
    }

    public static void mutlInfo(java.lang.String r6, int r7, java.lang.String r8, java.lang.String[] r9, java.lang.String[] r10) {
            r0 = 0
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            mutlInfo(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void mutlInfo(java.lang.String r4, int r5, java.lang.String... r6) {
            boolean r0 = com.umeng.commonsdk.UMConfigure.isDebugLog()     // Catch: java.lang.Exception -> L58
            if (r0 != 0) goto L7
            goto L58
        L7:
            int r0 = r6.length     // Catch: java.lang.Exception -> L58
            com.umeng.commonsdk.debug.UInterface r5 = getLogger(r5)     // Catch: java.lang.Exception -> L58
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L58
            r1.<init>()     // Catch: java.lang.Exception -> L58
            java.lang.String r2 = "UMLog_"
            r1.append(r2)     // Catch: java.lang.Exception -> L58
            r1.append(r4)     // Catch: java.lang.Exception -> L58
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Exception -> L58
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L27
            r6 = r6[r1]     // Catch: java.lang.Exception -> L58
            r5.log(r4, r6)     // Catch: java.lang.Exception -> L58
            return
        L27:
            r2 = 2
            if (r0 < r2) goto L58
            java.lang.String r2 = "┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────"
            r5.log(r4, r2)     // Catch: java.lang.Exception -> L58
        L2f:
            if (r1 >= r0) goto L53
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L58
            r2.<init>()     // Catch: java.lang.Exception -> L58
            java.lang.String r3 = "│     "
            r2.append(r3)     // Catch: java.lang.Exception -> L58
            r3 = r6[r1]     // Catch: java.lang.Exception -> L58
            r2.append(r3)     // Catch: java.lang.Exception -> L58
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L58
            r5.log(r4, r2)     // Catch: java.lang.Exception -> L58
            int r2 = r0 + (-1)
            if (r1 == r2) goto L50
            java.lang.String r2 = "├┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄"
            r5.log(r4, r2)     // Catch: java.lang.Exception -> L58
        L50:
            int r1 = r1 + 1
            goto L2f
        L53:
            java.lang.String r6 = "└────────────────────────────────────────────────────────────────────────────────────────────────────────────────"
            r5.log(r4, r6)     // Catch: java.lang.Exception -> L58
        L58:
            return
    }

    public static void mutlInfo(java.lang.String r6, java.lang.String r7, int r8, java.lang.String r9) {
            r4 = 0
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            mutlInfo(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void mutlInfo(java.lang.String r4, java.lang.String r5, int r6, java.lang.String r7, java.lang.String[] r8, java.lang.String[] r9) {
            boolean r0 = com.umeng.commonsdk.UMConfigure.isDebugLog()     // Catch: java.lang.Exception -> L89
            if (r0 != 0) goto L8
            goto L89
        L8:
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L89
            if (r0 == 0) goto L11
            java.lang.String r4 = "UMLog"
            goto L22
        L11:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L89
            r0.<init>()     // Catch: java.lang.Exception -> L89
            java.lang.String r1 = "UMLog_"
            r0.append(r1)     // Catch: java.lang.Exception -> L89
            r0.append(r4)     // Catch: java.lang.Exception -> L89
            java.lang.String r4 = r0.toString()     // Catch: java.lang.Exception -> L89
        L22:
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L89
            if (r0 != 0) goto L89
            r0 = 0
            if (r8 == 0) goto L45
            int r1 = r8.length     // Catch: java.lang.Exception -> L89
            if (r1 <= 0) goto L45
            if (r9 == 0) goto L45
            int r1 = r9.length     // Catch: java.lang.Exception -> L89
            if (r1 <= 0) goto L45
            r1 = 0
        L34:
            int r2 = r8.length     // Catch: java.lang.Exception -> L89
            if (r1 >= r2) goto L45
            int r2 = r9.length     // Catch: java.lang.Exception -> L89
            if (r1 >= r2) goto L45
            r2 = r8[r1]     // Catch: java.lang.Exception -> L89
            r3 = r9[r1]     // Catch: java.lang.Exception -> L89
            java.lang.String r5 = r5.replace(r2, r3)     // Catch: java.lang.Exception -> L89
            int r1 = r1 + 1
            goto L34
        L45:
            com.umeng.commonsdk.debug.UInterface r6 = getLogger(r6)     // Catch: java.lang.Exception -> L89
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Exception -> L89
            if (r8 == 0) goto L53
            r6.log(r4, r5)     // Catch: java.lang.Exception -> L89
            return
        L53:
            java.lang.String[] r5 = r5.split(r7)     // Catch: java.lang.Exception -> L89
            if (r5 == 0) goto L89
            java.lang.String r7 = "┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────"
            r6.log(r4, r7)     // Catch: java.lang.Exception -> L89
        L5e:
            int r7 = r5.length     // Catch: java.lang.Exception -> L89
            if (r0 >= r7) goto L84
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L89
            r7.<init>()     // Catch: java.lang.Exception -> L89
            java.lang.String r8 = "│     "
            r7.append(r8)     // Catch: java.lang.Exception -> L89
            r8 = r5[r0]     // Catch: java.lang.Exception -> L89
            r7.append(r8)     // Catch: java.lang.Exception -> L89
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L89
            r6.log(r4, r7)     // Catch: java.lang.Exception -> L89
            int r7 = r5.length     // Catch: java.lang.Exception -> L89
            int r7 = r7 + (-1)
            if (r0 == r7) goto L81
            java.lang.String r7 = "├┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄"
            r6.log(r4, r7)     // Catch: java.lang.Exception -> L89
        L81:
            int r0 = r0 + 1
            goto L5e
        L84:
            java.lang.String r5 = "└────────────────────────────────────────────────────────────────────────────────────────────────────────────────"
            r6.log(r4, r5)     // Catch: java.lang.Exception -> L89
        L89:
            return
    }
}
