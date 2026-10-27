package com.bytedance.msdk.tl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class mi {
    private static final java.util.HashSet j = null;

    static {
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r1 = "dalvik.system.VMStack.getThreadStackTrace"
            java.lang.String r2 = "java.lang.Thread.getStackTrace"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            com.bytedance.msdk.tl.mi.j = r0
            return
    }

    public mi() {
            r1 = this;
            r1.<init>()
            return
    }

    public static double cw() {
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            double r0 = r0.wq()
            return r0
    }

    public static java.lang.String j() {
            r0 = 0
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> La
            java.lang.StackTraceElement[] r1 = r1.getStackTrace()     // Catch: java.lang.Throwable -> La
            goto Lc
        La:
            r1 = r0
        Lc:
            if (r1 == 0) goto L66
            int r2 = r1.length
            if (r2 != 0) goto L12
            goto L66
        L12:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.OutOfMemoryError -> L60
            r0.<init>()     // Catch: java.lang.OutOfMemoryError -> L60
            int r2 = r1.length     // Catch: java.lang.OutOfMemoryError -> L60
            r3 = 0
        L19:
            if (r3 >= r2) goto L5b
            r4 = r1[r3]     // Catch: java.lang.OutOfMemoryError -> L60
            if (r4 == 0) goto L58
            java.util.HashSet r5 = com.bytedance.msdk.tl.mi.j     // Catch: java.lang.OutOfMemoryError -> L60
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.OutOfMemoryError -> L60
            r6.<init>()     // Catch: java.lang.OutOfMemoryError -> L60
            java.lang.String r7 = r4.getClassName()     // Catch: java.lang.OutOfMemoryError -> L60
            r6.append(r7)     // Catch: java.lang.OutOfMemoryError -> L60
            java.lang.String r7 = "."
            r6.append(r7)     // Catch: java.lang.OutOfMemoryError -> L60
            java.lang.String r7 = r4.getMethodName()     // Catch: java.lang.OutOfMemoryError -> L60
            r6.append(r7)     // Catch: java.lang.OutOfMemoryError -> L60
            java.lang.String r6 = r6.toString()     // Catch: java.lang.OutOfMemoryError -> L60
            boolean r5 = r5.contains(r6)     // Catch: java.lang.OutOfMemoryError -> L60
            if (r5 != 0) goto L58
            java.lang.String r5 = r4.getClassName()     // Catch: java.lang.OutOfMemoryError -> L60
            if (r5 == 0) goto L51
            java.lang.String r6 = "android.app"
            boolean r5 = r5.startsWith(r6)     // Catch: java.lang.OutOfMemoryError -> L60
            if (r5 != 0) goto L5b
        L51:
            java.lang.String r4 = r4.toString()     // Catch: java.lang.OutOfMemoryError -> L60
            r0.put(r4)     // Catch: java.lang.OutOfMemoryError -> L60
        L58:
            int r3 = r3 + 1
            goto L19
        L5b:
            java.lang.String r0 = r0.toString()     // Catch: java.lang.OutOfMemoryError -> L60
            return r0
        L60:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
            java.lang.String r0 = ""
        L66:
            return r0
    }

    public static java.lang.String j(java.util.Map<java.lang.String, java.lang.String> r5) {
            r0 = 0
            if (r5 == 0) goto L46
            int r1 = r5.size()
            if (r1 != 0) goto La
            goto L46
        La:
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            java.util.Set r2 = r5.keySet()
            java.util.Iterator r2 = r2.iterator()
        L17:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L33
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r5.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = j(r4)
            if (r4 == 0) goto L17
            r1.put(r3)
            goto L17
        L33:
            int r5 = r1.length()
            if (r5 != 0) goto L3a
            return r0
        L3a:
            java.lang.String r5 = r1.toString()     // Catch: java.lang.OutOfMemoryError -> L3f
            return r5
        L3f:
            r5 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r5)
            java.lang.String r5 = ""
            return r5
        L46:
            return r0
    }

    public static boolean j(double r4) {
            r0 = 0
            r2 = 0
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 > 0) goto L8
            return r2
        L8:
            double r0 = java.lang.Math.random()
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 <= 0) goto L11
            return r2
        L11:
            r4 = 1
            return r4
    }

    public static boolean j(com.bytedance.msdk.core.oq.oq r0) {
            if (r0 == 0) goto Le
            boolean r0 = r0.c()
            if (r0 != 0) goto L9
            goto Le
        L9:
            boolean r0 = r()
            return r0
        Le:
            r0 = 0
            return r0
    }

    public static boolean j(com.bytedance.msdk.xt.cw r0) {
            if (r0 == 0) goto Le
            boolean r0 = r0.dj()
            if (r0 != 0) goto L9
            goto Le
        L9:
            boolean r0 = r()
            return r0
        Le:
            r0 = 0
            return r0
    }

    private static boolean j(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.Class.forName(r2)     // Catch: java.lang.Exception -> Ld
            r2 = 1
            return r2
        Ld:
            return r1
    }

    private static boolean j(java.util.List<java.lang.String> r5, java.lang.StackTraceElement[] r6) {
            r0 = 0
            if (r5 == 0) goto L32
            r1 = 0
        L4:
            int r2 = r5.size()
            if (r1 >= r2) goto L32
            r2 = 0
        Lb:
            int r3 = r6.length
            if (r2 >= r3) goto L2f
            java.lang.Object r3 = r5.get(r1)
            if (r3 == 0) goto L2c
            r3 = r6[r2]     // Catch: java.lang.OutOfMemoryError -> L28
            java.lang.String r3 = r3.toString()     // Catch: java.lang.OutOfMemoryError -> L28
            java.lang.Object r4 = r5.get(r1)     // Catch: java.lang.OutOfMemoryError -> L28
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch: java.lang.OutOfMemoryError -> L28
            boolean r3 = r3.contains(r4)     // Catch: java.lang.OutOfMemoryError -> L28
            if (r3 == 0) goto L2c
            r5 = 1
            return r5
        L28:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
        L2c:
            int r2 = r2 + 1
            goto Lb
        L2f:
            int r1 = r1 + 1
            goto L4
        L32:
            return r0
    }

    private static boolean r() {
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            java.util.Map r0 = r0.rn()
            if (r0 == 0) goto L1e
            int r0 = r0.size()
            if (r0 != 0) goto L11
            goto L1e
        L11:
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            double r0 = r0.wq()
            boolean r0 = j(r0)
            return r0
        L1e:
            r0 = 0
            return r0
    }

    public static java.lang.String xt() {
            r0 = 0
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> La
            java.lang.StackTraceElement[] r1 = r1.getStackTrace()     // Catch: java.lang.Throwable -> La
            goto Lc
        La:
            r1 = r0
        Lc:
            if (r1 == 0) goto L43
            int r2 = r1.length
            if (r2 != 0) goto L12
            goto L43
        L12:
            com.bytedance.msdk.core.ws.cw r2 = com.bytedance.msdk.core.xt.xt()
            java.util.Map r2 = r2.rn()
            if (r2 == 0) goto L43
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L43
            java.util.Set r3 = r2.keySet()
            java.util.Iterator r3 = r3.iterator()
        L2a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L43
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r2.get(r4)
            java.util.List r5 = (java.util.List) r5
            boolean r5 = j(r5, r1)
            if (r5 == 0) goto L2a
            return r4
        L43:
            return r0
    }
}
