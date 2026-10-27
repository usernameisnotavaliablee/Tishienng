package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class v {
    private static final int c = 5;
    private static org.json.JSONArray d;
    private static java.lang.Object e;
    java.util.Stack<java.lang.String> a;
    com.umeng.analytics.vshelper.a b;
    private final java.util.Map<java.lang.String, java.lang.Long> f;

    static {
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            com.umeng.analytics.pro.v.d = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.umeng.analytics.pro.v.e = r0
            return
    }

    public v() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f = r0
            java.util.Stack r0 = new java.util.Stack
            r0.<init>()
            r1.a = r0
            com.umeng.analytics.vshelper.PageNameMonitor r0 = com.umeng.analytics.vshelper.PageNameMonitor.getInstance()
            r1.b = r0
            return
    }

    public static void a(android.content.Context r4) {
            if (r4 == 0) goto L43
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L43
            r0.<init>()     // Catch: java.lang.Throwable -> L43
            java.lang.Object r1 = com.umeng.analytics.pro.v.e     // Catch: java.lang.Throwable -> L43
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L43
            org.json.JSONArray r2 = com.umeng.analytics.pro.v.d     // Catch: java.lang.Throwable -> L40
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L40
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L40
            r3.<init>()     // Catch: java.lang.Throwable -> L40
            com.umeng.analytics.pro.v.d = r3     // Catch: java.lang.Throwable -> L40
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L40
            int r1 = r2.length()     // Catch: java.lang.Throwable -> L43
            if (r1 <= 0) goto L43
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L43
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L43
            java.lang.String r2 = "__a"
            r0.put(r2, r1)     // Catch: java.lang.Throwable -> L43
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L43
            if (r1 <= 0) goto L43
            com.umeng.analytics.pro.i r4 = com.umeng.analytics.pro.i.a(r4)     // Catch: java.lang.Throwable -> L43
            com.umeng.analytics.pro.u r1 = com.umeng.analytics.pro.u.a()     // Catch: java.lang.Throwable -> L43
            java.lang.String r1 = r1.c()     // Catch: java.lang.Throwable -> L43
            com.umeng.analytics.pro.i$a r2 = com.umeng.analytics.pro.i.a.b     // Catch: java.lang.Throwable -> L43
            r4.a(r1, r0, r2)     // Catch: java.lang.Throwable -> L43
            return
        L40:
            r4 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L40
            throw r4     // Catch: java.lang.Throwable -> L43
        L43:
            return
    }

    protected int a() {
            r1 = this;
            r0 = 2
            return r0
    }

    public void a(java.lang.String r10) {
            r9 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L58
            boolean r0 = com.umeng.commonsdk.UMConfigure.isDebugLog()
            if (r0 == 0) goto L30
            java.util.Stack<java.lang.String> r0 = r9.a
            int r0 = r0.size()
            if (r0 == 0) goto L30
            java.util.Stack<java.lang.String> r0 = r9.a
            java.lang.Object r0 = r0.peek()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "@"
            java.lang.String[] r5 = new java.lang.String[]{r1}
            java.lang.String[] r6 = new java.lang.String[]{r0}
            java.lang.String r2 = com.umeng.analytics.pro.j.F
            java.lang.String r4 = "\\|"
            r7 = 0
            r8 = 0
            r3 = 0
            com.umeng.commonsdk.debug.UMLog.aq(r2, r3, r4, r5, r6, r7, r8)
        L30:
            com.umeng.analytics.vshelper.a r0 = r9.b
            r0.customPageBegin(r10)
            java.util.Map<java.lang.String, java.lang.Long> r1 = r9.f
            monitor-enter(r1)
            java.util.Map<java.lang.String, java.lang.Long> r0 = r9.f     // Catch: java.lang.Throwable -> L51
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L51
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L51
            r0.put(r10, r2)     // Catch: java.lang.Throwable -> L51
            boolean r0 = com.umeng.commonsdk.UMConfigure.isDebugLog()     // Catch: java.lang.Throwable -> L51
            if (r0 == 0) goto L54
            java.util.Stack<java.lang.String> r0 = r9.a     // Catch: java.lang.Throwable -> L51
            r0.push(r10)     // Catch: java.lang.Throwable -> L51
            goto L54
        L51:
            r0 = move-exception
            r10 = r0
            goto L56
        L54:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L51
            return
        L56:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L51
            throw r10
        L58:
            return
    }

    public void b() {
            r11 = this;
            java.util.Map<java.lang.String, java.lang.Long> r0 = r11.f
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.Long> r1 = r11.f     // Catch: java.lang.Throwable -> L3e
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L3e
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L3e
            r2 = 0
            r3 = 0
        L10:
            boolean r5 = r1.hasNext()     // Catch: java.lang.Throwable -> L3e
            if (r5 == 0) goto L40
            java.lang.Object r5 = r1.next()     // Catch: java.lang.Throwable -> L3e
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r6 = r5.getValue()     // Catch: java.lang.Throwable -> L3e
            java.lang.Long r6 = (java.lang.Long) r6     // Catch: java.lang.Throwable -> L3e
            long r6 = r6.longValue()     // Catch: java.lang.Throwable -> L3e
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 <= 0) goto L10
            java.lang.Object r2 = r5.getValue()     // Catch: java.lang.Throwable -> L3e
            java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.lang.Throwable -> L3e
            long r2 = r2.longValue()     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r4 = r5.getKey()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L3e
            r9 = r2
            r2 = r4
            r3 = r9
            goto L10
        L3e:
            r1 = move-exception
            goto L47
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L46
            r11.b(r2)
        L46:
            return
        L47:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            throw r1
    }

    public void b(java.lang.String r9) {
            r8 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto Ld7
            java.util.Map<java.lang.String, java.lang.Long> r0 = r8.f
            boolean r0 = r0.containsKey(r9)
            if (r0 == 0) goto Lb5
            java.util.Map<java.lang.String, java.lang.Long> r1 = r8.f
            monitor-enter(r1)
            java.util.Map<java.lang.String, java.lang.Long> r0 = r8.f     // Catch: java.lang.Throwable -> Lb1
            java.lang.Object r0 = r0.get(r9)     // Catch: java.lang.Throwable -> Lb1
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> Lb1
            java.util.Map<java.lang.String, java.lang.Long> r2 = r8.f     // Catch: java.lang.Throwable -> Lb1
            r2.remove(r9)     // Catch: java.lang.Throwable -> Lb1
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb1
            if (r0 != 0) goto L23
            goto Ld7
        L23:
            boolean r1 = com.umeng.commonsdk.UMConfigure.isDebugLog()
            if (r1 == 0) goto L42
            java.util.Stack<java.lang.String> r1 = r8.a
            int r1 = r1.size()
            if (r1 <= 0) goto L42
            java.util.Stack<java.lang.String> r1 = r8.a
            java.lang.Object r1 = r1.peek()
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L42
            java.util.Stack<java.lang.String> r1 = r8.a
            r1.pop()
        L42:
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = r0.longValue()
            long r1 = r1 - r3
            java.lang.Object r3 = com.umeng.analytics.pro.v.e
            monitor-enter(r3)
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L89
            r4.<init>()     // Catch: java.lang.Throwable -> L89
            java.lang.String r5 = "page_name"
            r4.put(r5, r9)     // Catch: java.lang.Throwable -> L89
            java.lang.String r5 = "duration"
            r4.put(r5, r1)     // Catch: java.lang.Throwable -> L89
            java.lang.String r1 = "page_start"
            r4.put(r1, r0)     // Catch: java.lang.Throwable -> L89
            java.lang.String r0 = "type"
            int r1 = r8.a()     // Catch: java.lang.Throwable -> L89
            r4.put(r0, r1)     // Catch: java.lang.Throwable -> L89
            org.json.JSONArray r0 = com.umeng.analytics.pro.v.d     // Catch: java.lang.Throwable -> L89
            r0.put(r4)     // Catch: java.lang.Throwable -> L89
            org.json.JSONArray r0 = com.umeng.analytics.pro.v.d     // Catch: java.lang.Throwable -> L89
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L89
            r1 = 5
            if (r0 < r1) goto L89
            r0 = 0
            android.content.Context r1 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext(r0)     // Catch: java.lang.Throwable -> L89
            if (r1 == 0) goto L89
            com.umeng.analytics.CoreProtocol r2 = com.umeng.analytics.CoreProtocol.getInstance(r1)     // Catch: java.lang.Throwable -> L89
            r4 = 4099(0x1003, float:5.744E-42)
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r1, r4, r2, r0)     // Catch: java.lang.Throwable -> L89
        L89:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lad
            boolean r0 = com.umeng.commonsdk.UMConfigure.isDebugLog()
            if (r0 == 0) goto Ld7
            java.util.Stack<java.lang.String> r0 = r8.a
            int r0 = r0.size()
            if (r0 == 0) goto Ld7
            java.lang.String r0 = "@"
            java.lang.String[] r4 = new java.lang.String[]{r0}
            java.lang.String[] r5 = new java.lang.String[]{r9}
            java.lang.String r1 = com.umeng.analytics.pro.j.E
            java.lang.String r3 = "\\|"
            r6 = 0
            r7 = 0
            r2 = 0
            com.umeng.commonsdk.debug.UMLog.aq(r1, r2, r3, r4, r5, r6, r7)
            goto Ld7
        Lad:
            r0 = move-exception
            r9 = r0
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lad
            throw r9
        Lb1:
            r0 = move-exception
            r9 = r0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb1
            throw r9
        Lb5:
            boolean r0 = com.umeng.commonsdk.UMConfigure.isDebugLog()
            if (r0 == 0) goto Ld7
            java.util.Stack<java.lang.String> r0 = r8.a
            int r0 = r0.size()
            if (r0 != 0) goto Ld7
            java.lang.String r0 = "@"
            java.lang.String[] r4 = new java.lang.String[]{r0}
            java.lang.String[] r5 = new java.lang.String[]{r9}
            java.lang.String r1 = com.umeng.analytics.pro.j.G
            java.lang.String r3 = "\\|"
            r6 = 0
            r7 = 0
            r2 = 0
            com.umeng.commonsdk.debug.UMLog.aq(r1, r2, r3, r4, r5, r6, r7)
        Ld7:
            return
    }
}
