package com.bytedance.pangle.servermanager;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class xt {
    private static final java.lang.Object cw = null;
    private static final java.lang.Object j = null;
    private static com.bytedance.pangle.cw m;
    private static final java.util.Map<java.lang.String, java.lang.Boolean> r = null;
    private static final java.util.Map<java.lang.String, com.bytedance.pangle.up> up = null;
    private static final java.lang.Object xt = null;


    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.bytedance.pangle.servermanager.xt.j = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.bytedance.pangle.servermanager.xt.xt = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.bytedance.pangle.servermanager.xt.cw = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.bytedance.pangle.servermanager.xt.r = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.bytedance.pangle.servermanager.xt.up = r0
            return
    }

    public xt() {
            r1 = this;
            r1.<init>()
            return
    }

    private static android.os.IBinder j(android.net.Uri r3, java.lang.String r4) {
            android.app.Application r0 = com.bytedance.pangle.Zeus.getAppApplication()
            android.content.ContentResolver r0 = r0.getContentResolver()
            java.lang.String r1 = "query_binder"
            r2 = 0
            android.os.Bundle r3 = r0.call(r3, r1, r4, r2)
            if (r3 == 0) goto L29
            java.lang.Class<com.bytedance.pangle.servermanager.AbsServerManager> r4 = com.bytedance.pangle.servermanager.AbsServerManager.class
            java.lang.ClassLoader r4 = r4.getClassLoader()
            r3.setClassLoader(r4)
            java.lang.String r4 = "binder"
            android.os.Parcelable r3 = r3.getParcelable(r4)
            com.bytedance.pangle.servermanager.j r3 = (com.bytedance.pangle.servermanager.j) r3
            if (r3 == 0) goto L29
            android.os.IBinder r3 = r3.j()
            return r3
        L29:
            return r2
    }

    private static android.os.IInterface j(java.lang.String r3, java.lang.String r4) {
            boolean r0 = com.bytedance.pangle.Zeus.hasInit()
            if (r0 == 0) goto L85
            java.util.HashMap r0 = com.bytedance.pangle.Zeus.getServerManagerHashMap()
            java.lang.Object r0 = r0.get(r4)
            android.content.pm.ProviderInfo r0 = (android.content.pm.ProviderInfo) r0
            if (r0 == 0) goto L75
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "content://"
            r1.<init>(r2)
            java.lang.String r0 = r0.authority
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.os.IBinder r0 = j(r0, r3)
            if (r0 == 0) goto L73
            boolean r1 = r0.isBinderAlive()
            if (r1 == 0) goto L73
            com.bytedance.pangle.servermanager.xt$1 r1 = new com.bytedance.pangle.servermanager.xt$1     // Catch: android.os.RemoteException -> L6b
            r1.<init>(r4, r0)     // Catch: android.os.RemoteException -> L6b
            r2 = 0
            r0.linkToDeath(r1, r2)     // Catch: android.os.RemoteException -> L6b
            java.util.Map<java.lang.String, java.lang.Boolean> r1 = com.bytedance.pangle.servermanager.xt.r     // Catch: android.os.RemoteException -> L6b
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: android.os.RemoteException -> L6b
            r1.put(r4, r2)     // Catch: android.os.RemoteException -> L6b
            int r4 = r3.hashCode()     // Catch: android.os.RemoteException -> L6b
            r1 = -807062458(0xffffffffcfe53446, float:-7.6908165E9)
            if (r4 == r1) goto L5e
            r1 = 1984153269(0x7643c6b5, float:9.927033E32)
            if (r4 == r1) goto L51
            goto L73
        L51:
            java.lang.String r4 = "service"
            boolean r3 = r3.equals(r4)     // Catch: android.os.RemoteException -> L6b
            if (r3 == 0) goto L73
            com.bytedance.pangle.up r3 = com.bytedance.pangle.up.j.j(r0)     // Catch: android.os.RemoteException -> L6b
            return r3
        L5e:
            java.lang.String r4 = "package"
            boolean r3 = r3.equals(r4)     // Catch: android.os.RemoteException -> L6b
            if (r3 == 0) goto L73
            com.bytedance.pangle.cw r3 = com.bytedance.pangle.cw.j.j(r0)     // Catch: android.os.RemoteException -> L6b
            return r3
        L6b:
            r3 = move-exception
            java.lang.String r4 = "Zeus/server_pangle"
            java.lang.String r0 = "generateServerManager failed."
            com.bytedance.pangle.log.ZeusLogger.errReport(r4, r0, r3)
        L73:
            r3 = 0
            return r3
        L75:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r0 = "宿主中没有找对对应进程的serverManager "
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r4 = r0.concat(r4)
            r3.<init>(r4)
            throw r3
        L85:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r0 = "generateServerManager 请先初始化Zeus, processName:"
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r4 = r0.concat(r4)
            r3.<init>(r4)
            throw r3
    }

    public static com.bytedance.pangle.cw j() {
            java.util.Map<java.lang.String, java.lang.Boolean> r0 = com.bytedance.pangle.servermanager.xt.r
            java.lang.String r1 = "main"
            java.lang.Object r0 = r0.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r1 = 0
            if (r0 == 0) goto L13
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L15
        L13:
            com.bytedance.pangle.servermanager.xt.m = r1
        L15:
            com.bytedance.pangle.cw r0 = com.bytedance.pangle.servermanager.xt.m
            if (r0 != 0) goto L39
            java.lang.Object r0 = com.bytedance.pangle.servermanager.xt.cw
            monitor-enter(r0)
            java.lang.String r2 = "package"
            java.lang.String r3 = "main"
            android.os.IInterface r2 = j(r2, r3)     // Catch: java.lang.Throwable -> L31
            com.bytedance.pangle.cw r2 = (com.bytedance.pangle.cw) r2     // Catch: java.lang.Throwable -> L31
            if (r2 != 0) goto L33
            java.lang.String r2 = "Zeus/server_pangle"
            java.lang.String r3 = "getPackageManager failed!!!"
            com.bytedance.pangle.log.ZeusLogger.errReport(r2, r3)     // Catch: java.lang.Throwable -> L31
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            return r1
        L31:
            r1 = move-exception
            goto L37
        L33:
            com.bytedance.pangle.servermanager.xt.m = r2     // Catch: java.lang.Throwable -> L31
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            goto L39
        L37:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            throw r1
        L39:
            com.bytedance.pangle.cw r0 = com.bytedance.pangle.servermanager.xt.m
            return r0
    }

    public static com.bytedance.pangle.up j(java.lang.String r3) {
            java.util.Map<java.lang.String, java.lang.Boolean> r0 = com.bytedance.pangle.servermanager.xt.r
            java.lang.Object r0 = r0.get(r3)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L10
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L15
        L10:
            java.util.Map<java.lang.String, com.bytedance.pangle.up> r0 = com.bytedance.pangle.servermanager.xt.up
            r0.remove(r3)
        L15:
            java.util.Map<java.lang.String, com.bytedance.pangle.up> r0 = com.bytedance.pangle.servermanager.xt.up
            java.lang.Object r1 = r0.get(r3)
            if (r1 != 0) goto L3d
            java.lang.Object r1 = com.bytedance.pangle.servermanager.xt.xt
            monitor-enter(r1)
            java.lang.String r2 = "service"
            android.os.IInterface r2 = j(r2, r3)     // Catch: java.lang.Throwable -> L34
            com.bytedance.pangle.up r2 = (com.bytedance.pangle.up) r2     // Catch: java.lang.Throwable -> L34
            if (r2 != 0) goto L36
            java.lang.String r3 = "Zeus/server_pangle"
            java.lang.String r0 = "getServiceManager failed!!!"
            com.bytedance.pangle.log.ZeusLogger.errReport(r3, r0)     // Catch: java.lang.Throwable -> L34
            r3 = 0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L34
            return r3
        L34:
            r3 = move-exception
            goto L3b
        L36:
            r0.put(r3, r2)     // Catch: java.lang.Throwable -> L34
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L34
            goto L3d
        L3b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L34
            throw r3
        L3d:
            java.lang.Object r3 = r0.get(r3)
            com.bytedance.pangle.up r3 = (com.bytedance.pangle.up) r3
            return r3
    }

    static /* synthetic */ java.util.Map xt() {
            java.util.Map<java.lang.String, java.lang.Boolean> r0 = com.bytedance.pangle.servermanager.xt.r
            return r0
    }
}
