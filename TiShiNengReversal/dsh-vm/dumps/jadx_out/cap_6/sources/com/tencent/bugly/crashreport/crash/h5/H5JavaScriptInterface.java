package com.tencent.bugly.crashreport.crash.h5;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class H5JavaScriptInterface {
    private static java.util.HashSet<java.lang.Integer> a;
    private java.lang.String b;
    private java.lang.Thread c;
    private java.lang.String d;
    private java.util.Map<java.lang.String, java.lang.String> e;

    static {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            com.tencent.bugly.crashreport.crash.h5.H5JavaScriptInterface.a = r0
            return
    }

    private H5JavaScriptInterface() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.b = r0
            r1.c = r0
            r1.d = r0
            r1.e = r0
            return
    }

    private static com.tencent.bugly.proguard.bb a(java.lang.String r8) {
            r0 = 0
            if (r8 == 0) goto L1b9
            int r1 = r8.length()
            if (r1 > 0) goto Lb
            goto L1b9
        Lb:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L7a
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L7a
            com.tencent.bugly.proguard.bb r8 = new com.tencent.bugly.proguard.bb     // Catch: java.lang.Throwable -> L7a
            r8.<init>()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r2 = "projectRoot"
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Throwable -> L7a
            r8.a = r2     // Catch: java.lang.Throwable -> L7a
            if (r2 != 0) goto L20
            return r0
        L20:
            java.lang.String r2 = "context"
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Throwable -> L7a
            r8.b = r2     // Catch: java.lang.Throwable -> L7a
            if (r2 != 0) goto L2b
            return r0
        L2b:
            java.lang.String r2 = "url"
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Throwable -> L7a
            r8.c = r2     // Catch: java.lang.Throwable -> L7a
            if (r2 != 0) goto L36
            return r0
        L36:
            java.lang.String r2 = "userAgent"
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Throwable -> L7a
            r8.d = r2     // Catch: java.lang.Throwable -> L7a
            if (r2 != 0) goto L41
            return r0
        L41:
            java.lang.String r2 = "language"
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Throwable -> L7a
            r8.e = r2     // Catch: java.lang.Throwable -> L7a
            if (r2 != 0) goto L4c
            return r0
        L4c:
            java.lang.String r2 = "name"
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Throwable -> L7a
            r8.f = r2     // Catch: java.lang.Throwable -> L7a
            if (r2 == 0) goto L1b5
            java.lang.String r3 = "null"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L7a
            if (r2 == 0) goto L60
            goto L1b5
        L60:
            java.lang.String r2 = "stacktrace"
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Throwable -> L7a
            if (r2 != 0) goto L69
            return r0
        L69:
            java.lang.String r3 = "\n"
            int r3 = r2.indexOf(r3)     // Catch: java.lang.Throwable -> L7a
            r4 = 0
            if (r3 >= 0) goto L7d
            java.lang.String r8 = "H5 crash stack's format is wrong!"
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L7a
            com.tencent.bugly.proguard.al.d(r8, r1)     // Catch: java.lang.Throwable -> L7a
            return r0
        L7a:
            r8 = move-exception
            goto L1b6
        L7d:
            int r5 = r3 + 1
            java.lang.String r5 = r2.substring(r5)     // Catch: java.lang.Throwable -> L7a
            r8.h = r5     // Catch: java.lang.Throwable -> L7a
            java.lang.String r2 = r2.substring(r4, r3)     // Catch: java.lang.Throwable -> L7a
            r8.g = r2     // Catch: java.lang.Throwable -> L7a
            java.lang.String r3 = ":"
            int r2 = r2.indexOf(r3)     // Catch: java.lang.Throwable -> L7a
            if (r2 <= 0) goto L9d
            java.lang.String r3 = r8.g     // Catch: java.lang.Throwable -> L7a
            int r2 = r2 + 1
            java.lang.String r2 = r3.substring(r2)     // Catch: java.lang.Throwable -> L7a
            r8.g = r2     // Catch: java.lang.Throwable -> L7a
        L9d:
            java.lang.String r2 = "file"
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Throwable -> L7a
            r8.i = r2     // Catch: java.lang.Throwable -> L7a
            java.lang.String r2 = r8.f     // Catch: java.lang.Throwable -> L7a
            if (r2 != 0) goto Laa
            return r0
        Laa:
            java.lang.String r2 = "lineNumber"
            long r2 = r1.getLong(r2)     // Catch: java.lang.Throwable -> L7a
            r8.j = r2     // Catch: java.lang.Throwable -> L7a
            r5 = 0
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 >= 0) goto Lb9
            return r0
        Lb9:
            java.lang.String r2 = "columnNumber"
            long r1 = r1.getLong(r2)     // Catch: java.lang.Throwable -> L7a
            r8.k = r1     // Catch: java.lang.Throwable -> L7a
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 >= 0) goto Lc6
            return r0
        Lc6:
            java.lang.String r1 = "H5 crash information is following: "
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L7a
            com.tencent.bugly.proguard.al.a(r1, r2)     // Catch: java.lang.Throwable -> L7a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7a
            java.lang.String r2 = "[projectRoot]: "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r2 = r8.a     // Catch: java.lang.Throwable -> L7a
            r1.append(r2)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L7a
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L7a
            com.tencent.bugly.proguard.al.a(r1, r2)     // Catch: java.lang.Throwable -> L7a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7a
            java.lang.String r2 = "[context]: "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r2 = r8.b     // Catch: java.lang.Throwable -> L7a
            r1.append(r2)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L7a
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L7a
            com.tencent.bugly.proguard.al.a(r1, r2)     // Catch: java.lang.Throwable -> L7a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7a
            java.lang.String r2 = "[url]: "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r2 = r8.c     // Catch: java.lang.Throwable -> L7a
            r1.append(r2)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L7a
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L7a
            com.tencent.bugly.proguard.al.a(r1, r2)     // Catch: java.lang.Throwable -> L7a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7a
            java.lang.String r2 = "[userAgent]: "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r2 = r8.d     // Catch: java.lang.Throwable -> L7a
            r1.append(r2)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L7a
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L7a
            com.tencent.bugly.proguard.al.a(r1, r2)     // Catch: java.lang.Throwable -> L7a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7a
            java.lang.String r2 = "[language]: "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r2 = r8.e     // Catch: java.lang.Throwable -> L7a
            r1.append(r2)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L7a
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L7a
            com.tencent.bugly.proguard.al.a(r1, r2)     // Catch: java.lang.Throwable -> L7a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7a
            java.lang.String r2 = "[name]: "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r2 = r8.f     // Catch: java.lang.Throwable -> L7a
            r1.append(r2)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L7a
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L7a
            com.tencent.bugly.proguard.al.a(r1, r2)     // Catch: java.lang.Throwable -> L7a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7a
            java.lang.String r2 = "[message]: "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r2 = r8.g     // Catch: java.lang.Throwable -> L7a
            r1.append(r2)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L7a
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L7a
            com.tencent.bugly.proguard.al.a(r1, r2)     // Catch: java.lang.Throwable -> L7a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7a
            java.lang.String r2 = "[stacktrace]: \n"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r2 = r8.h     // Catch: java.lang.Throwable -> L7a
            r1.append(r2)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L7a
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L7a
            com.tencent.bugly.proguard.al.a(r1, r2)     // Catch: java.lang.Throwable -> L7a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7a
            java.lang.String r2 = "[file]: "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r2 = r8.i     // Catch: java.lang.Throwable -> L7a
            r1.append(r2)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L7a
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L7a
            com.tencent.bugly.proguard.al.a(r1, r2)     // Catch: java.lang.Throwable -> L7a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7a
            java.lang.String r2 = "[lineNumber]: "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L7a
            long r2 = r8.j     // Catch: java.lang.Throwable -> L7a
            r1.append(r2)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L7a
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L7a
            com.tencent.bugly.proguard.al.a(r1, r2)     // Catch: java.lang.Throwable -> L7a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7a
            java.lang.String r2 = "[columnNumber]: "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L7a
            long r2 = r8.k     // Catch: java.lang.Throwable -> L7a
            r1.append(r2)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L7a
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L7a
            com.tencent.bugly.proguard.al.a(r1, r2)     // Catch: java.lang.Throwable -> L7a
            return r8
        L1b5:
            return r0
        L1b6:
            com.tencent.bugly.proguard.al.a(r8)
        L1b9:
            return r0
    }

    public static com.tencent.bugly.crashreport.crash.h5.H5JavaScriptInterface getInstance(com.tencent.bugly.crashreport.CrashReport.a r8) {
            r0 = 0
            if (r8 == 0) goto L83
            java.util.HashSet<java.lang.Integer> r1 = com.tencent.bugly.crashreport.crash.h5.H5JavaScriptInterface.a
            int r2 = r8.hashCode()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L14
            goto L83
        L14:
            com.tencent.bugly.crashreport.crash.h5.H5JavaScriptInterface r1 = new com.tencent.bugly.crashreport.crash.h5.H5JavaScriptInterface
            r1.<init>()
            java.util.HashSet<java.lang.Integer> r2 = com.tencent.bugly.crashreport.crash.h5.H5JavaScriptInterface.a
            int r3 = r8.hashCode()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.add(r3)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r1.c = r2
            if (r2 != 0) goto L2f
            goto L64
        L2f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "\n"
            r0.append(r3)
            r4 = 2
        L3a:
            java.lang.StackTraceElement[] r5 = r2.getStackTrace()
            int r5 = r5.length
            if (r4 >= r5) goto L60
            java.lang.StackTraceElement[] r5 = r2.getStackTrace()
            r5 = r5[r4]
            java.lang.String r6 = r5.toString()
            java.lang.String r7 = "crashreport"
            boolean r6 = r6.contains(r7)
            if (r6 != 0) goto L5d
            java.lang.String r5 = r5.toString()
            r0.append(r5)
            r0.append(r3)
        L5d:
            int r4 = r4 + 1
            goto L3a
        L60:
            java.lang.String r0 = r0.toString()
        L64:
            r1.d = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.CharSequence r8 = r8.c()
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            java.lang.String r2 = "[WebView] ContentDescription"
            r0.put(r2, r8)
            r1.e = r0
            return r1
        L83:
            return r0
    }

    @android.webkit.JavascriptInterface
    public void printLog(java.lang.String r3) {
            r2 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            java.lang.String r3 = "Log from js: %s"
            com.tencent.bugly.proguard.al.d(r3, r0)
            return
    }

    @android.webkit.JavascriptInterface
    public void reportJSException(java.lang.String r8) {
            r7 = this;
            r0 = 0
            if (r8 != 0) goto Lb
            java.lang.String r8 = "Payload from JS is null."
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.tencent.bugly.proguard.al.d(r8, r0)
            return
        Lb:
            byte[] r1 = r8.getBytes()
            java.lang.String r1 = com.tencent.bugly.proguard.ap.c(r1)
            java.lang.String r2 = r7.b
            if (r2 == 0) goto L25
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L25
            java.lang.String r8 = "Same payload from js. Please check whether you've injected bugly.js more than one times."
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.tencent.bugly.proguard.al.d(r8, r0)
            return
        L25:
            r7.b = r1
            java.lang.String r1 = "Handling JS exception ..."
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.tencent.bugly.proguard.al.d(r1, r2)
            com.tencent.bugly.proguard.bb r8 = a(r8)
            if (r8 != 0) goto L3c
            java.lang.String r8 = "Failed to parse payload."
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.tencent.bugly.proguard.al.d(r8, r0)
            return
        L3c:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.lang.String r2 = r8.a
            if (r2 == 0) goto L4f
            java.lang.String r3 = "[JS] projectRoot"
            r1.put(r3, r2)
        L4f:
            java.lang.String r2 = r8.b
            if (r2 == 0) goto L58
            java.lang.String r3 = "[JS] context"
            r1.put(r3, r2)
        L58:
            java.lang.String r2 = r8.c
            if (r2 == 0) goto L61
            java.lang.String r3 = "[JS] url"
            r1.put(r3, r2)
        L61:
            java.lang.String r2 = r8.d
            if (r2 == 0) goto L6a
            java.lang.String r3 = "[JS] userAgent"
            r1.put(r3, r2)
        L6a:
            java.lang.String r2 = r8.i
            if (r2 == 0) goto L73
            java.lang.String r3 = "[JS] file"
            r1.put(r3, r2)
        L73:
            long r2 = r8.j
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L84
            java.lang.String r4 = "[JS] lineNumber"
            java.lang.String r2 = java.lang.Long.toString(r2)
            r1.put(r4, r2)
        L84:
            r0.putAll(r1)
            java.util.Map<java.lang.String, java.lang.String> r1 = r7.e
            r0.putAll(r1)
            java.lang.String r1 = "Java Stack"
            java.lang.String r2 = r7.d
            r0.put(r1, r2)
            java.lang.Thread r1 = r7.c
            java.lang.String r2 = r8.f
            java.lang.String r3 = r8.g
            java.lang.String r8 = r8.h
            com.tencent.bugly.crashreport.inner.InnerApi.postH5CrashAsync(r1, r2, r3, r8, r0)
            return
    }
}
