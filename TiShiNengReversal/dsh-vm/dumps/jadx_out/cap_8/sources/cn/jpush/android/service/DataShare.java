package cn.jpush.android.service;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class DataShare extends cn.jiguang.android.IDataShare.Stub {
    private static final java.lang.String TAG = "DataShare";
    private static final java.util.Map<java.lang.String, cn.jiguang.android.IDataShare> aidlMap = null;
    private static boolean isBinding;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            cn.jpush.android.service.DataShare.aidlMap = r0
            return
    }

    public DataShare() {
            r0 = this;
            r0.<init>()
            return
    }

    public static cn.jiguang.android.IDataShare getInstance(java.lang.String r1) {
            java.util.Map<java.lang.String, cn.jiguang.android.IDataShare> r0 = cn.jpush.android.service.DataShare.aidlMap
            java.lang.Object r1 = r0.get(r1)
            cn.jiguang.android.IDataShare r1 = (cn.jiguang.android.IDataShare) r1
            return r1
    }

    public static void init(cn.jiguang.android.IDataShare r2, java.lang.String r3) {
            cn.jiguang.android.IDataShare r0 = getInstance(r3)
            if (r2 == r0) goto L54
            java.util.Map<java.lang.String, cn.jiguang.android.IDataShare> r0 = cn.jpush.android.service.DataShare.aidlMap
            r0.put(r3, r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = "'s aidl created"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "DataShare"
            cn.jiguang.w.f.c(r0, r3)
            r3 = 0
            android.content.Context r3 = cn.jiguang.internal.JConstants.getAppContext(r3)     // Catch: android.os.RemoteException -> L3f
            if (r3 == 0) goto L54
            java.lang.String r1 = cn.jiguang.av.a.a(r3)     // Catch: android.os.RemoteException -> L3f
            java.lang.String r3 = r3.getPackageName()     // Catch: android.os.RemoteException -> L3f
            boolean r3 = r3.equals(r1)     // Catch: android.os.RemoteException -> L3f
            if (r3 == 0) goto L54
            cn.jpush.android.service.DataShare r3 = new cn.jpush.android.service.DataShare     // Catch: android.os.RemoteException -> L3f
            r3.<init>()     // Catch: android.os.RemoteException -> L3f
            r2.bind(r3, r1)     // Catch: android.os.RemoteException -> L3f
            goto L54
        L3f:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = "bind failed="
            r3.append(r1)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jiguang.w.f.l(r0, r2)
        L54:
            r2 = 0
            cn.jpush.android.service.DataShare.isBinding = r2
            return
    }

    public static boolean isBinding() {
            boolean r0 = cn.jpush.android.service.DataShare.isBinding
            return r0
    }

    public static void setBinding() {
            r0 = 1
            cn.jpush.android.service.DataShare.isBinding = r0
            return
    }

    @Override // cn.jiguang.android.IDataShare
    public java.lang.String bind(cn.jiguang.android.IDataShare r2, java.lang.String r3) {
            r1 = this;
            java.util.Map<java.lang.String, cn.jiguang.android.IDataShare> r0 = cn.jpush.android.service.DataShare.aidlMap
            r0.put(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            java.lang.String r3 = "'s aidl bound"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "DataShare"
            cn.jiguang.w.f.c(r3, r2)
            r2 = 0
            java.lang.String r2 = cn.jiguang.av.a.a(r2)
            return r2
    }

    @Override // cn.jiguang.android.IDataShare
    public android.os.Bundle execute(java.lang.String r4, java.lang.String r5, android.os.Bundle r6) {
            r3 = this;
            r0 = 0
            cn.jiguang.internal.JCoreInternalHelper r1 = cn.jiguang.internal.JCoreInternalHelper.getInstance()     // Catch: java.lang.Throwable -> Le
            android.content.Context r2 = cn.jiguang.internal.JConstants.getAppContext(r0)     // Catch: java.lang.Throwable -> Le
            android.os.Bundle r4 = r1.directHandle(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> Le
            return r4
        Le:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "onAction error:"
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "DataShare"
            cn.jiguang.w.f.j(r5, r4)
            return r0
    }

    @Override // cn.jiguang.android.IDataShare
    public android.os.IBinder getBinderByType(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // cn.jiguang.android.IDataShare
    public void onAction(java.lang.String r3, java.lang.String r4, android.os.Bundle r5) {
            r2 = this;
            cn.jiguang.internal.JCoreInternalHelper r0 = cn.jiguang.internal.JCoreInternalHelper.getInstance()     // Catch: java.lang.Throwable -> Ld
            r1 = 0
            android.content.Context r1 = cn.jiguang.internal.JConstants.getAppContext(r1)     // Catch: java.lang.Throwable -> Ld
            r0.directHandle(r1, r3, r4, r5)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "onAction error:"
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "DataShare"
            cn.jiguang.w.f.j(r4, r3)
            return
    }
}
