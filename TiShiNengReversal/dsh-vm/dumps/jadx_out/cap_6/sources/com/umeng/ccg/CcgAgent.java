package com.umeng.ccg;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class CcgAgent {
    private static java.lang.Object actionInfoLock;
    private static java.util.Map<java.lang.String, com.umeng.ccg.ActionInfo> actionInfoTable;
    private static java.util.ArrayList<com.umeng.ccg.ConfigListener> callbacks;
    private static java.util.Map<java.lang.String, java.util.ArrayList<java.lang.String>> forbidSdkTable;
    private static java.lang.Object lock;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.umeng.ccg.CcgAgent.lock = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.umeng.ccg.CcgAgent.callbacks = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.umeng.ccg.CcgAgent.actionInfoLock = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.umeng.ccg.CcgAgent.actionInfoTable = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.umeng.ccg.CcgAgent.forbidSdkTable = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = "col_apl"
            r0.put(r2, r1)
            java.util.Map<java.lang.String, java.util.ArrayList<java.lang.String>> r0 = com.umeng.ccg.CcgAgent.forbidSdkTable
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = "col_lbs"
            r0.put(r2, r1)
            java.util.Map<java.lang.String, java.util.ArrayList<java.lang.String>> r0 = com.umeng.ccg.CcgAgent.forbidSdkTable
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = "col_wifi"
            r0.put(r2, r1)
            java.util.Map<java.lang.String, java.util.ArrayList<java.lang.String>> r0 = com.umeng.ccg.CcgAgent.forbidSdkTable
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = "col_bs"
            r0.put(r2, r1)
            return
    }

    public CcgAgent() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.umeng.ccg.ActionInfo getActionInfo(java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 != 0) goto L22
            java.lang.Object r0 = com.umeng.ccg.CcgAgent.actionInfoLock
            monitor-enter(r0)
            java.util.Map<java.lang.String, com.umeng.ccg.ActionInfo> r2 = com.umeng.ccg.CcgAgent.actionInfoTable     // Catch: java.lang.Throwable -> L1c
            boolean r2 = r2.containsKey(r3)     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L1e
            java.util.Map<java.lang.String, com.umeng.ccg.ActionInfo> r1 = com.umeng.ccg.CcgAgent.actionInfoTable     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Throwable -> L1c
            r1 = r3
            com.umeng.ccg.ActionInfo r1 = (com.umeng.ccg.ActionInfo) r1     // Catch: java.lang.Throwable -> L1c
            goto L1e
        L1c:
            r3 = move-exception
            goto L20
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            return r1
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r3
        L22:
            return r1
    }

    public static java.lang.String[] getCollectItemList() {
            java.lang.String r0 = "col_wifi"
            java.lang.String r1 = "col_bs"
            java.lang.String r2 = "col_apl"
            java.lang.String r3 = "col_lbs"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0, r1}
            return r0
    }

    public static java.util.ArrayList<java.lang.String> getForbidSdkArray(java.lang.String r1) {
            java.util.Map<java.lang.String, java.util.ArrayList<java.lang.String>> r0 = com.umeng.ccg.CcgAgent.forbidSdkTable
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L11
            java.util.Map<java.lang.String, java.util.ArrayList<java.lang.String>> r0 = com.umeng.ccg.CcgAgent.forbidSdkTable
            java.lang.Object r1 = r0.get(r1)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            return r1
        L11:
            r1 = 0
            return r1
    }

    public static java.util.ArrayList<java.lang.String> getRegistedModuleList() {
            java.lang.Object r0 = com.umeng.ccg.CcgAgent.actionInfoLock
            monitor-enter(r0)
            java.util.Map<java.lang.String, com.umeng.ccg.ActionInfo> r1 = com.umeng.ccg.CcgAgent.actionInfoTable     // Catch: java.lang.Throwable -> L10
            java.util.Set r1 = r1.keySet()     // Catch: java.lang.Throwable -> L10
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L10
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return r2
        L10:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r1
    }

    public static boolean hasRegistedActionInfo() {
            java.lang.Object r0 = com.umeng.ccg.CcgAgent.actionInfoLock
            monitor-enter(r0)
            java.util.Map<java.lang.String, com.umeng.ccg.ActionInfo> r1 = com.umeng.ccg.CcgAgent.actionInfoTable     // Catch: java.lang.Throwable -> L10
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L10
            if (r1 <= 0) goto Ld
            r1 = 1
            goto Le
        Ld:
            r1 = 0
        Le:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return r1
        L10:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r1
    }

    public static void init(android.content.Context r1) {
            com.umeng.ccg.d r0 = com.umeng.ccg.d.a()
            r0.a(r1)
            return
    }

    public static void notifyConfigReady(org.json.JSONObject r4) {
            java.lang.Object r0 = com.umeng.ccg.CcgAgent.lock
            monitor-enter(r0)
            java.util.ArrayList<com.umeng.ccg.ConfigListener> r1 = com.umeng.ccg.CcgAgent.callbacks     // Catch: java.lang.Throwable -> L1c
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L1c
            if (r1 <= 0) goto L1e
            r2 = 0
        Lc:
            if (r2 >= r1) goto L1e
            java.util.ArrayList<com.umeng.ccg.ConfigListener> r3 = com.umeng.ccg.CcgAgent.callbacks     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> L1c
            com.umeng.ccg.ConfigListener r3 = (com.umeng.ccg.ConfigListener) r3     // Catch: java.lang.Throwable -> L1c
            r3.onConfigReady(r4)     // Catch: java.lang.Throwable -> L1c
            int r2 = r2 + 1
            goto Lc
        L1c:
            r4 = move-exception
            goto L20
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            return
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r4
    }

    public static void registerActionInfo(com.umeng.ccg.ActionInfo r8) {
            android.content.Context r0 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext()
            if (r8 == 0) goto L51
            java.lang.Object r1 = com.umeng.ccg.CcgAgent.actionInfoLock
            monitor-enter(r1)
            android.content.Context r2 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext()     // Catch: java.lang.Throwable -> L4c
            java.lang.String r2 = r8.getModule(r2)     // Catch: java.lang.Throwable -> L4c
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L4c
            if (r3 != 0) goto L4c
            java.util.Map<java.lang.String, com.umeng.ccg.ActionInfo> r3 = com.umeng.ccg.CcgAgent.actionInfoTable     // Catch: java.lang.Throwable -> L4c
            boolean r3 = r3.containsKey(r2)     // Catch: java.lang.Throwable -> L4c
            if (r3 != 0) goto L4c
            java.lang.String[] r3 = r8.getSupportAction(r0)     // Catch: java.lang.Throwable -> L4c
            if (r3 == 0) goto L47
            r4 = 0
        L26:
            int r5 = r3.length     // Catch: java.lang.Throwable -> L4c
            if (r4 >= r5) goto L47
            r5 = r3[r4]     // Catch: java.lang.Throwable -> L4c
            boolean r6 = r8.getSwitchState(r0, r5)     // Catch: java.lang.Throwable -> L4c
            java.util.Map<java.lang.String, java.util.ArrayList<java.lang.String>> r7 = com.umeng.ccg.CcgAgent.forbidSdkTable     // Catch: java.lang.Throwable -> L4c
            boolean r7 = r7.containsKey(r5)     // Catch: java.lang.Throwable -> L4c
            if (r7 == 0) goto L44
            java.util.Map<java.lang.String, java.util.ArrayList<java.lang.String>> r7 = com.umeng.ccg.CcgAgent.forbidSdkTable     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r5 = r7.get(r5)     // Catch: java.lang.Throwable -> L4c
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch: java.lang.Throwable -> L4c
            if (r6 != 0) goto L44
            r5.add(r2)     // Catch: java.lang.Throwable -> L4c
        L44:
            int r4 = r4 + 1
            goto L26
        L47:
            java.util.Map<java.lang.String, com.umeng.ccg.ActionInfo> r0 = com.umeng.ccg.CcgAgent.actionInfoTable     // Catch: java.lang.Throwable -> L4c
            r0.put(r2, r8)     // Catch: java.lang.Throwable -> L4c
        L4c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4e
            goto L51
        L4e:
            r8 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4e
            throw r8
        L51:
            return
    }

    public static void registerConfigListener(com.umeng.ccg.ConfigListener r2) {
            if (r2 == 0) goto Lf
            java.lang.Object r0 = com.umeng.ccg.CcgAgent.lock
            monitor-enter(r0)
            java.util.ArrayList<com.umeng.ccg.ConfigListener> r1 = com.umeng.ccg.CcgAgent.callbacks     // Catch: java.lang.Throwable -> Lc
            r1.add(r2)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r2
        Lf:
            return
    }
}
