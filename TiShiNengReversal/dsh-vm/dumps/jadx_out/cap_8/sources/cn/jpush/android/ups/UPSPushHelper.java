package cn.jpush.android.ups;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class UPSPushHelper {
    public static final java.lang.String ACTION_UPS = ".ups.receiver";
    public static final java.lang.String KEY_ACTION = "ups.action";
    public static final java.lang.String KEY_CODE = "ups.code";
    public static final java.lang.String KEY_RID = "ups.rid";
    public static final java.lang.String KEY_TOKEN = "ups.token";
    private static final java.lang.String TAG = "UPSPushHelper";
    private static java.util.Map<java.lang.Long, java.lang.Object> cacheMap;
    private static java.util.concurrent.atomic.AtomicInteger rid;
    private static cn.jpush.android.ups.UPSPushHelper.a upsReceiver;

    static class a extends android.content.BroadcastReceiver {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r8, android.content.Intent r9) {
                r7 = this;
                java.lang.String r0 = "ups.register"
                java.lang.String r1 = r9.getAction()     // Catch: java.lang.Throwable -> Ld5
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld5
                r2.<init>()     // Catch: java.lang.Throwable -> Ld5
                java.lang.String r8 = r8.getPackageName()     // Catch: java.lang.Throwable -> Ld5
                r2.append(r8)     // Catch: java.lang.Throwable -> Ld5
                java.lang.String r8 = ".ups.receiver"
                r2.append(r8)     // Catch: java.lang.Throwable -> Ld5
                java.lang.String r8 = r2.toString()     // Catch: java.lang.Throwable -> Ld5
                boolean r8 = r1.equals(r8)     // Catch: java.lang.Throwable -> Ld5
                if (r8 == 0) goto Ld5
                java.lang.String r8 = "ups.rid"
                r1 = 0
                int r8 = r9.getIntExtra(r8, r1)     // Catch: java.lang.Throwable -> Ld5
                java.lang.String r1 = "ups.code"
                r2 = -1
                int r1 = r9.getIntExtra(r1, r2)     // Catch: java.lang.Throwable -> Ld5
                java.lang.String r2 = "ups.token"
                java.lang.String r2 = r9.getStringExtra(r2)     // Catch: java.lang.Throwable -> Ld5
                java.lang.String r3 = "ups.action"
                java.lang.String r9 = r9.getStringExtra(r3)     // Catch: java.lang.Throwable -> Ld5
                java.lang.String r3 = "UPSPushHelper"
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld5
                r4.<init>()     // Catch: java.lang.Throwable -> Ld5
                java.lang.String r5 = "intenalAction:"
                r4.append(r5)     // Catch: java.lang.Throwable -> Ld5
                r4.append(r9)     // Catch: java.lang.Throwable -> Ld5
                java.lang.String r5 = ",rid:"
                r4.append(r5)     // Catch: java.lang.Throwable -> Ld5
                r4.append(r8)     // Catch: java.lang.Throwable -> Ld5
                java.lang.String r5 = ",code:"
                r4.append(r5)     // Catch: java.lang.Throwable -> Ld5
                r4.append(r1)     // Catch: java.lang.Throwable -> Ld5
                java.lang.String r5 = ",token:"
                r4.append(r5)     // Catch: java.lang.Throwable -> Ld5
                r4.append(r2)     // Catch: java.lang.Throwable -> Ld5
                java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Ld5
                cn.jpush.android.helper.Logger.dd(r3, r4)     // Catch: java.lang.Throwable -> Ld5
                if (r8 <= 0) goto L7b
                long r3 = (long) r8     // Catch: java.lang.Throwable -> Ld5
                cn.jpush.android.ups.ICallbackResult r8 = cn.jpush.android.ups.UPSPushHelper.removeMapping(r3)     // Catch: java.lang.Throwable -> Ld5
                if (r8 == 0) goto Ld5
                cn.jpush.android.ups.TokenResult r0 = new cn.jpush.android.ups.TokenResult     // Catch: java.lang.Throwable -> Ld5
                r0.<init>(r2, r1, r9)     // Catch: java.lang.Throwable -> Ld5
                r8.onResult(r0)     // Catch: java.lang.Throwable -> Ld5
                return
            L7b:
                boolean r8 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> Ld5
                if (r8 != 0) goto Ld5
                boolean r8 = r9.equals(r0)     // Catch: java.lang.Throwable -> Ld5
                java.lang.String r3 = "ups.unregister"
                if (r8 != 0) goto L8f
                boolean r8 = r9.equals(r3)     // Catch: java.lang.Throwable -> Ld5
                if (r8 == 0) goto Ld5
            L8f:
                java.util.Map r8 = cn.jpush.android.ups.UPSPushHelper.access$000()     // Catch: java.lang.Throwable -> Ld5
                java.util.Collection r8 = r8.values()     // Catch: java.lang.Throwable -> Ld5
                java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> Ld5
            L9b:
                boolean r4 = r8.hasNext()     // Catch: java.lang.Throwable -> Ld5
                if (r4 == 0) goto Ld5
                java.lang.Object r4 = r8.next()     // Catch: java.lang.Throwable -> Ld5
                cn.jpush.android.ups.ICallbackResult r5 = cn.jpush.android.ups.UPSPushHelper.access$100(r4)     // Catch: java.lang.Throwable -> Ld5
                if (r5 != 0) goto Lac
                goto L9b
            Lac:
                boolean r6 = r4 instanceof cn.jpush.android.ups.UPSRegisterCallBack     // Catch: java.lang.Throwable -> Ld5
                if (r6 == 0) goto Lc2
                boolean r6 = r9.equals(r0)     // Catch: java.lang.Throwable -> Ld5
                if (r6 == 0) goto Lc2
                r8.remove()     // Catch: java.lang.Throwable -> Ld5
                cn.jpush.android.ups.TokenResult r4 = new cn.jpush.android.ups.TokenResult     // Catch: java.lang.Throwable -> Ld5
                r4.<init>(r2, r1, r9)     // Catch: java.lang.Throwable -> Ld5
            Lbe:
                r5.onResult(r4)     // Catch: java.lang.Throwable -> Ld5
                goto L9b
            Lc2:
                boolean r4 = r4 instanceof cn.jpush.android.ups.UPSUnRegisterCallBack     // Catch: java.lang.Throwable -> Ld5
                if (r4 == 0) goto L9b
                boolean r4 = r9.equals(r3)     // Catch: java.lang.Throwable -> Ld5
                if (r4 == 0) goto L9b
                r8.remove()     // Catch: java.lang.Throwable -> Ld5
                cn.jpush.android.ups.TokenResult r4 = new cn.jpush.android.ups.TokenResult     // Catch: java.lang.Throwable -> Ld5
                r4.<init>(r2, r1, r9)     // Catch: java.lang.Throwable -> Ld5
                goto Lbe
            Ld5:
                return
        }
    }

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            cn.jpush.android.ups.UPSPushHelper.cacheMap = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 0
            r0.<init>(r1)
            cn.jpush.android.ups.UPSPushHelper.rid = r0
            return
    }

    public UPSPushHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ java.util.Map access$000() {
            java.util.Map<java.lang.Long, java.lang.Object> r0 = cn.jpush.android.ups.UPSPushHelper.cacheMap
            return r0
    }

    static /* synthetic */ cn.jpush.android.ups.ICallbackResult access$100(java.lang.Object r0) {
            cn.jpush.android.ups.ICallbackResult r0 = objectToCallBack(r0)
            return r0
    }

    public static void callResult(android.content.Context r3, java.lang.String r4, android.os.Bundle r5, cn.jpush.android.ups.ICallbackResult r6) {
            int r0 = getNextRid()
            long r1 = (long) r0
            createMapping(r3, r1, r6)
            if (r5 != 0) goto Lf
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
        Lf:
            java.lang.String r6 = "ups.rid"
            r5.putInt(r6, r0)
            java.lang.String r6 = "JPUSH"
            cn.jpush.android.helper.JCoreHelper.runActionWithService(r3, r6, r4, r5)
            return
    }

    public static void createMapping(android.content.Context r2, long r3, cn.jpush.android.ups.ICallbackResult r5) {
            init(r2)
            java.lang.String r2 = "UPSPushHelper"
            if (r5 != 0) goto Ld
            java.lang.String r3 = "requestParams is null"
            cn.jpush.android.helper.Logger.e(r2, r3)
            return
        Ld:
            java.util.Map<java.lang.Long, java.lang.Object> r0 = cn.jpush.android.ups.UPSPushHelper.cacheMap
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L33
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "rid "
            r5.append(r0)
            r5.append(r3)
            java.lang.String r3 = " has exist."
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            cn.jpush.android.helper.Logger.v(r2, r3)
            return
        L33:
            boolean r2 = r5 instanceof android.app.Activity
            if (r2 == 0) goto L46
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r5)
            java.util.Map<java.lang.Long, java.lang.Object> r5 = cn.jpush.android.ups.UPSPushHelper.cacheMap
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r5.put(r3, r2)
            return
        L46:
            java.util.Map<java.lang.Long, java.lang.Object> r2 = cn.jpush.android.ups.UPSPushHelper.cacheMap
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2.put(r3, r5)
            return
    }

    public static int getNextRid() {
            java.util.concurrent.atomic.AtomicInteger r0 = cn.jpush.android.ups.UPSPushHelper.rid
            int r0 = r0.incrementAndGet()
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 != r1) goto L11
            java.util.concurrent.atomic.AtomicInteger r1 = cn.jpush.android.ups.UPSPushHelper.rid
            r2 = 0
            r1.set(r2)
        L11:
            return r0
    }

    public static java.lang.String getReceiverPermission(android.content.Context r1) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r1.getPackageName()
            r0.append(r1)
            java.lang.String r1 = ".permission.JPUSH_MESSAGE"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static void init(android.content.Context r4) {
            cn.jpush.android.ups.UPSPushHelper$a r0 = cn.jpush.android.ups.UPSPushHelper.upsReceiver
            if (r0 != 0) goto L32
            cn.jpush.android.ups.UPSPushHelper$a r0 = new cn.jpush.android.ups.UPSPushHelper$a
            r0.<init>()
            cn.jpush.android.ups.UPSPushHelper.upsReceiver = r0
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r4.getPackageName()
            r1.append(r2)
            java.lang.String r2 = ".ups.receiver"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addAction(r1)
            cn.jpush.android.ups.UPSPushHelper$a r1 = cn.jpush.android.ups.UPSPushHelper.upsReceiver
            java.lang.String r2 = getReceiverPermission(r4)
            r3 = 0
            cn.jpush.android.ad.j.a(r4, r1, r0, r2, r3)
        L32:
            return
    }

    private static cn.jpush.android.ups.ICallbackResult objectToCallBack(java.lang.Object r1) {
            if (r1 == 0) goto L16
            boolean r0 = r1 instanceof java.lang.ref.WeakReference
            if (r0 == 0) goto Lf
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r1 = r1.get()
            cn.jpush.android.ups.ICallbackResult r1 = (cn.jpush.android.ups.ICallbackResult) r1
            return r1
        Lf:
            boolean r0 = r1 instanceof cn.jpush.android.ups.ICallbackResult
            if (r0 == 0) goto L16
            cn.jpush.android.ups.ICallbackResult r1 = (cn.jpush.android.ups.ICallbackResult) r1
            return r1
        L16:
            r1 = 0
            return r1
    }

    public static cn.jpush.android.ups.ICallbackResult removeMapping(long r1) {
            java.util.Map<java.lang.Long, java.lang.Object> r0 = cn.jpush.android.ups.UPSPushHelper.cacheMap
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Object r1 = r0.remove(r1)
            cn.jpush.android.ups.ICallbackResult r1 = objectToCallBack(r1)
            return r1
    }

    public static void upsCallBack(android.content.Context r3, int r4, java.lang.String r5, int r6, java.lang.String r7) {
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L40
            r0.<init>()     // Catch: java.lang.Throwable -> L40
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40
            r1.<init>()     // Catch: java.lang.Throwable -> L40
            java.lang.String r2 = r3.getPackageName()     // Catch: java.lang.Throwable -> L40
            r1.append(r2)     // Catch: java.lang.Throwable -> L40
            java.lang.String r2 = ".ups.receiver"
            r1.append(r2)     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L40
            r0.setAction(r1)     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = r3.getPackageName()     // Catch: java.lang.Throwable -> L40
            r0.setPackage(r1)     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = "ups.rid"
            r0.putExtra(r1, r4)     // Catch: java.lang.Throwable -> L40
            java.lang.String r4 = "ups.code"
            r0.putExtra(r4, r6)     // Catch: java.lang.Throwable -> L40
            java.lang.String r4 = "ups.token"
            r0.putExtra(r4, r7)     // Catch: java.lang.Throwable -> L40
            java.lang.String r4 = "ups.action"
            r0.putExtra(r4, r5)     // Catch: java.lang.Throwable -> L40
            java.lang.String r4 = getReceiverPermission(r3)     // Catch: java.lang.Throwable -> L40
            r3.sendBroadcast(r0, r4)     // Catch: java.lang.Throwable -> L40
            return
        L40:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "[upsCallBack] failed:"
            r4.append(r5)
            java.lang.String r3 = r3.getMessage()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "UPSPushHelper"
            cn.jpush.android.helper.Logger.ee(r4, r3)
            return
    }
}
