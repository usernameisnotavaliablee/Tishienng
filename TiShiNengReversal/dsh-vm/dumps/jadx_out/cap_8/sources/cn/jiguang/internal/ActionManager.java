package cn.jiguang.internal;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ActionManager {
    private static final java.lang.String SDK_TYPE = "sdk_type";
    private static final java.lang.String SDK_VERSION = "version";
    private static final java.lang.String TAG = "ActionManager";
    private static java.util.HashMap<java.lang.String, cn.jiguang.api.JDispatchAction> actionMap;
    private static java.util.HashMap<java.lang.String, java.lang.String> actionStringMap;

    private static final class a {
        private static final cn.jiguang.internal.ActionManager a = null;

        static {
                cn.jiguang.internal.ActionManager r0 = new cn.jiguang.internal.ActionManager
                r0.<init>()
                cn.jiguang.internal.ActionManager.a.a = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.internal.ActionManager a() {
                cn.jiguang.internal.ActionManager r0 = cn.jiguang.internal.ActionManager.a.a
                return r0
        }
    }

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            cn.jiguang.internal.ActionManager.actionMap = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            cn.jiguang.internal.ActionManager.actionStringMap = r0
            return
    }

    public ActionManager() {
            r0 = this;
            r0.<init>()
            cn.jiguang.v.c.a()
            return
    }

    public static void addAction(java.lang.String r3, java.lang.String r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L53
            java.util.HashMap<java.lang.String, cn.jiguang.api.JDispatchAction> r0 = cn.jiguang.internal.ActionManager.actionMap
            boolean r0 = r0.containsKey(r3)
            java.lang.String r1 = "ActionManager"
            if (r0 != 0) goto L4e
            java.lang.Class r0 = java.lang.Class.forName(r4)     // Catch: java.lang.Throwable -> L29
            java.lang.Object r0 = r0.newInstance()     // Catch: java.lang.Throwable -> L29
            boolean r2 = r0 instanceof cn.jiguang.api.JDispatchAction     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto L2b
            java.util.HashMap<java.lang.String, java.lang.String> r2 = cn.jiguang.internal.ActionManager.actionStringMap     // Catch: java.lang.Throwable -> L29
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L29
            java.util.HashMap<java.lang.String, cn.jiguang.api.JDispatchAction> r2 = cn.jiguang.internal.ActionManager.actionMap     // Catch: java.lang.Throwable -> L29
            cn.jiguang.api.JDispatchAction r0 = (cn.jiguang.api.JDispatchAction) r0     // Catch: java.lang.Throwable -> L29
            r2.put(r3, r0)     // Catch: java.lang.Throwable -> L29
            return
        L29:
            r3 = move-exception
            goto L31
        L2b:
            java.lang.String r3 = "this action is not a JDispatchAction,please check and extends JDispatchAction"
            cn.jiguang.w.f.i(r1, r3)     // Catch: java.lang.Throwable -> L29
            return
        L31:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "#unexcepted - instance "
            r0.append(r2)
            r0.append(r4)
            java.lang.String r4 = " class failed:"
            r0.append(r4)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            cn.jiguang.w.f.j(r1, r3)
            return
        L4e:
            java.lang.String r3 = "has same type action"
            cn.jiguang.w.f.c(r1, r3)
        L53:
            return
    }

    public static java.util.HashMap<java.lang.String, java.lang.String> getActionMap() {
            java.util.HashMap<java.lang.String, java.lang.String> r0 = cn.jiguang.internal.ActionManager.actionStringMap
            return r0
    }

    public static java.util.HashMap<java.lang.String, cn.jiguang.api.JDispatchAction> getDispatchActionMap() {
            java.util.HashMap<java.lang.String, cn.jiguang.api.JDispatchAction> r0 = cn.jiguang.internal.ActionManager.actionMap
            return r0
    }

    public static cn.jiguang.internal.ActionManager getInstance() {
            cn.jiguang.internal.ActionManager r0 = cn.jiguang.internal.ActionManager.a.a()
            return r0
    }

    public static cn.jiguang.api.JDispatchAction getJDispatchAction(java.lang.String r1) {
            java.util.HashMap<java.lang.String, cn.jiguang.api.JDispatchAction> r0 = cn.jiguang.internal.ActionManager.actionMap
            java.lang.Object r1 = r0.get(r1)
            cn.jiguang.api.JDispatchAction r1 = (cn.jiguang.api.JDispatchAction) r1
            return r1
    }

    public static boolean wrapSdkTypeVersionInfo(org.json.JSONObject r9) {
            r0 = 0
            if (r9 != 0) goto Lc
            java.lang.String r9 = "ActionManager"
            java.lang.String r1 = "wrapSdkTypeVersionInfo failed ,container is null"
            cn.jiguang.w.f.i(r9, r1)
            return r0
        Lc:
            int r1 = cn.jiguang.v.i.b()     // Catch: org.json.JSONException -> L84
            boolean r1 = cn.jiguang.v.i.a(r1)     // Catch: org.json.JSONException -> L84
            r2 = 1
            java.lang.String r3 = "sdk_type"
            java.lang.String r4 = "version"
            if (r1 == 0) goto L36
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L84
            r1.<init>()     // Catch: org.json.JSONException -> L84
            java.lang.String r5 = cn.jiguang.a.a.f236c     // Catch: org.json.JSONException -> L84
            r1.put(r4, r5)     // Catch: org.json.JSONException -> L84
            int r5 = cn.jiguang.v.i.b()     // Catch: org.json.JSONException -> L84
            r1.put(r3, r5)     // Catch: org.json.JSONException -> L84
            java.lang.String r0 = "core_sdk_ver"
            r9.put(r0, r1)     // Catch: org.json.JSONException -> L34
            r0 = 1
            goto L36
        L34:
            r0 = 1
            goto L84
        L36:
            java.util.HashMap<java.lang.String, cn.jiguang.api.JDispatchAction> r1 = cn.jiguang.internal.ActionManager.actionMap     // Catch: org.json.JSONException -> L84
            java.util.Set r1 = r1.entrySet()     // Catch: org.json.JSONException -> L84
            java.util.Iterator r1 = r1.iterator()     // Catch: org.json.JSONException -> L84
        L40:
            boolean r5 = r1.hasNext()     // Catch: org.json.JSONException -> L84
            if (r5 == 0) goto L84
            java.lang.Object r5 = r1.next()     // Catch: org.json.JSONException -> L84
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: org.json.JSONException -> L84
            java.lang.Object r6 = r5.getValue()     // Catch: org.json.JSONException -> L84
            cn.jiguang.api.JDispatchAction r6 = (cn.jiguang.api.JDispatchAction) r6     // Catch: org.json.JSONException -> L84
            int r7 = r6.getSdkType()     // Catch: org.json.JSONException -> L84
            boolean r7 = cn.jiguang.v.i.a(r7)     // Catch: org.json.JSONException -> L84
            if (r7 == 0) goto L40
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: org.json.JSONException -> L84
            r7.<init>()     // Catch: org.json.JSONException -> L84
            java.lang.Object r8 = r5.getKey()     // Catch: org.json.JSONException -> L84
            java.lang.String r8 = (java.lang.String) r8     // Catch: org.json.JSONException -> L84
            java.lang.String r8 = r6.getSdkVersion(r8)     // Catch: org.json.JSONException -> L84
            r7.put(r4, r8)     // Catch: org.json.JSONException -> L84
            int r8 = r6.getSdkType()     // Catch: org.json.JSONException -> L84
            r7.put(r3, r8)     // Catch: org.json.JSONException -> L84
            java.lang.Object r0 = r5.getKey()     // Catch: org.json.JSONException -> L34
            java.lang.String r0 = (java.lang.String) r0     // Catch: org.json.JSONException -> L34
            java.lang.String r0 = r6.getReportVersionKey(r0)     // Catch: org.json.JSONException -> L34
            r9.put(r0, r7)     // Catch: org.json.JSONException -> L34
            r0 = 1
            goto L40
        L84:
            return r0
    }

    public void handleMessage(android.content.Context r3, java.lang.String r4, java.lang.Object r5) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onSended type:"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = ",actionMap size:"
            r0.append(r1)
            java.util.HashMap<java.lang.String, cn.jiguang.api.JDispatchAction> r1 = cn.jiguang.internal.ActionManager.actionMap
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ActionManager"
            cn.jiguang.w.f.a(r1, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L50
            java.util.HashMap<java.lang.String, cn.jiguang.api.JDispatchAction> r4 = cn.jiguang.internal.ActionManager.actionMap
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L34:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L5d
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getValue()
            cn.jiguang.api.JDispatchAction r1 = (cn.jiguang.api.JDispatchAction) r1
            java.lang.Object r0 = r0.getKey()
            java.lang.String r0 = (java.lang.String) r0
            r1.handleMessage(r3, r0, r5)
            goto L34
        L50:
            java.util.HashMap<java.lang.String, cn.jiguang.api.JDispatchAction> r0 = cn.jiguang.internal.ActionManager.actionMap
            java.lang.Object r0 = r0.get(r4)
            cn.jiguang.api.JDispatchAction r0 = (cn.jiguang.api.JDispatchAction) r0
            if (r0 == 0) goto L5d
            r0.handleMessage(r3, r4, r5)
        L5d:
            return
    }

    public java.util.Map<java.lang.Integer, android.os.Bundle> loadPInfo() {
            r5 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.HashMap<java.lang.String, cn.jiguang.api.JDispatchAction> r1 = cn.jiguang.internal.ActionManager.actionMap
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            cn.jiguang.api.JDispatchAction r3 = (cn.jiguang.api.JDispatchAction) r3
            java.lang.Object r2 = r2.getKey()
            java.lang.String r2 = (java.lang.String) r2
            android.os.Bundle r2 = r3.getPInfo(r2)
            if (r2 == 0) goto Lf
            java.lang.String r3 = "pid"
            r4 = 0
            int r3 = r2.getInt(r3, r4)
            if (r3 <= 0) goto Lf
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.put(r3, r2)
            goto Lf
        L3e:
            return r0
    }

    public boolean wrapSdkVersionInfo(org.json.JSONObject r6) {
            r5 = this;
            if (r6 != 0) goto Lc
            java.lang.String r6 = "ActionManager"
            java.lang.String r0 = "wrapSdkVersionInfo failed ,container is null"
            cn.jiguang.w.f.i(r6, r0)
            r6 = 0
            return r6
        Lc:
            java.lang.String r0 = "core_sdk_ver"
            java.lang.String r1 = cn.jiguang.a.a.f236c     // Catch: org.json.JSONException -> L67
            r6.put(r0, r1)     // Catch: org.json.JSONException -> L67
            java.util.HashMap<java.lang.String, cn.jiguang.api.JDispatchAction> r0 = cn.jiguang.internal.ActionManager.actionMap     // Catch: org.json.JSONException -> L67
            java.util.Set r0 = r0.entrySet()     // Catch: org.json.JSONException -> L67
            java.util.Iterator r0 = r0.iterator()     // Catch: org.json.JSONException -> L67
        L1d:
            boolean r1 = r0.hasNext()     // Catch: org.json.JSONException -> L67
            if (r1 == 0) goto L67
            java.lang.Object r1 = r0.next()     // Catch: org.json.JSONException -> L67
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: org.json.JSONException -> L67
            java.lang.Object r2 = r1.getValue()     // Catch: org.json.JSONException -> L67
            cn.jiguang.api.JDispatchAction r2 = (cn.jiguang.api.JDispatchAction) r2     // Catch: org.json.JSONException -> L67
            java.lang.Object r3 = r1.getKey()     // Catch: org.json.JSONException -> L67
            java.lang.String r3 = (java.lang.String) r3     // Catch: org.json.JSONException -> L67
            java.lang.String r3 = r2.getReportVersionKey(r3)     // Catch: org.json.JSONException -> L67
            java.lang.Object r1 = r1.getKey()     // Catch: org.json.JSONException -> L67
            java.lang.String r1 = (java.lang.String) r1     // Catch: org.json.JSONException -> L67
            java.lang.String r1 = r2.getSdkVersion(r1)     // Catch: org.json.JSONException -> L67
            r6.put(r3, r1)     // Catch: org.json.JSONException -> L67
            r1 = 30001(0x7531, float:4.204E-41)
            r3 = 0
            java.lang.Object r1 = r2.getDataByCmd(r3, r1)     // Catch: org.json.JSONException -> L67
            if (r1 == 0) goto L1d
            boolean r4 = r1 instanceof java.lang.String     // Catch: org.json.JSONException -> L67
            if (r4 == 0) goto L1d
            r4 = 30002(0x7532, float:4.2042E-41)
            java.lang.Object r2 = r2.getDataByCmd(r3, r4)     // Catch: org.json.JSONException -> L67
            if (r2 == 0) goto L1d
            boolean r3 = r2 instanceof java.lang.String     // Catch: org.json.JSONException -> L67
            if (r3 == 0) goto L1d
            java.lang.String r1 = (java.lang.String) r1     // Catch: org.json.JSONException -> L67
            java.lang.String r2 = (java.lang.String) r2     // Catch: org.json.JSONException -> L67
            r6.put(r1, r2)     // Catch: org.json.JSONException -> L67
            goto L1d
        L67:
            r6 = 1
            return r6
    }
}
