package com.bytedance.pangle;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class oq {
    private static volatile com.bytedance.pangle.oq j;
    private java.util.Map<java.lang.String, org.json.JSONObject> ae;
    private final java.util.List<com.bytedance.pangle.ZeusPluginStateListener> cw;
    private com.bytedance.pangle.ZeusPluginDecodeCallback m;
    private final java.util.List<com.bytedance.pangle.ZeusPluginEventCallback> r;
    private final android.os.Handler up;
    private boolean xt;





    public oq() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r2.cw = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.r = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.up = r0
            r0 = 0
            r2.m = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r2.ae = r0
            return
    }

    private void ae() {
            r4 = this;
            java.lang.String r0 = "Zeus/init_pangle"
            com.bytedance.pangle.GlobalParam r1 = com.bytedance.pangle.GlobalParam.getInstance()     // Catch: java.lang.Exception -> L22
            com.bytedance.pangle.log.IZeusReporter r1 = r1.getReporter()     // Catch: java.lang.Exception -> L22
            java.lang.String r2 = "zeus_stage_common"
            java.lang.String r3 = "invoke disableApiWarning"
            r1.saveRecord(r2, r3)     // Catch: java.lang.Exception -> L22
            java.lang.Object r1 = com.bytedance.pangle.up.j.j()     // Catch: java.lang.Exception -> L22
            java.lang.String r2 = "mHiddenApiWarningShown"
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L22
            com.bytedance.pangle.util.FieldUtils.writeField(r1, r2, r3)     // Catch: java.lang.Exception -> L22
            java.lang.String r1 = "ZeusManager disableApiWarningShownForAndroidP, true"
            com.bytedance.pangle.log.ZeusLogger.w(r0, r1)     // Catch: java.lang.Exception -> L22
            return
        L22:
            r1 = move-exception
            java.lang.String r2 = "disableApiWarningShownForAndroidP failed"
            com.bytedance.pangle.log.ZeusLogger.errReport(r0, r2, r1)
            return
    }

    public static com.bytedance.pangle.oq j() {
            com.bytedance.pangle.oq r0 = com.bytedance.pangle.oq.j
            if (r0 != 0) goto L19
            java.lang.Class<com.bytedance.pangle.oq> r0 = com.bytedance.pangle.oq.class
            monitor-enter(r0)
            com.bytedance.pangle.oq r1 = com.bytedance.pangle.oq.j     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.bytedance.pangle.oq r1 = new com.bytedance.pangle.oq     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.bytedance.pangle.oq.j = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.bytedance.pangle.oq r0 = com.bytedance.pangle.oq.j
            return r0
    }

    private void m() {
            r9 = this;
            java.lang.String r0 = ":"
            com.bytedance.pangle.GlobalParam r1 = com.bytedance.pangle.GlobalParam.getInstance()
            com.bytedance.pangle.log.IZeusReporter r1 = r1.getReporter()
            java.lang.String r2 = "start"
            java.lang.String r3 = "zeus_stage_plugin"
            r1.saveRecord(r3, r2)
            android.app.Application r1 = com.bytedance.pangle.Zeus.getAppApplication()     // Catch: java.lang.Exception -> L7b
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Exception -> L7b
            android.app.Application r2 = com.bytedance.pangle.Zeus.getAppApplication()     // Catch: java.lang.Exception -> L7b
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Exception -> L7b
            r4 = 8
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r4)     // Catch: java.lang.Exception -> L7b
            if (r1 == 0) goto Lb6
            android.content.pm.ProviderInfo[] r2 = r1.providers     // Catch: java.lang.Exception -> L7b
            if (r2 != 0) goto L2f
            goto Lb6
        L2f:
            int r1 = r2.length     // Catch: java.lang.Exception -> L7b
            r4 = 0
        L31:
            if (r4 >= r1) goto La8
            r5 = r2[r4]     // Catch: java.lang.Exception -> L7b
            java.lang.String r6 = r5.authority     // Catch: java.lang.Exception -> L7b
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Exception -> L7b
            if (r6 != 0) goto La5
            java.lang.String r6 = r5.authority     // Catch: java.lang.Exception -> L7b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L7b
            r7.<init>()     // Catch: java.lang.Exception -> L7b
            android.app.Application r8 = com.bytedance.pangle.Zeus.getAppApplication()     // Catch: java.lang.Exception -> L7b
            java.lang.String r8 = r8.getPackageName()     // Catch: java.lang.Exception -> L7b
            r7.append(r8)     // Catch: java.lang.Exception -> L7b
            java.lang.String r8 = ".pangle.servermanager."
            r7.append(r8)     // Catch: java.lang.Exception -> L7b
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L7b
            boolean r6 = r6.contains(r7)     // Catch: java.lang.Exception -> L7b
            if (r6 == 0) goto La5
            java.lang.String r6 = r5.processName     // Catch: java.lang.Exception -> L7b
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Exception -> L7b
            java.lang.String r7 = "main"
            if (r6 != 0) goto L7d
            java.lang.String r6 = r5.processName     // Catch: java.lang.Exception -> L7b
            boolean r6 = r6.contains(r0)     // Catch: java.lang.Exception -> L7b
            if (r6 != 0) goto L71
            goto L7d
        L71:
            java.lang.String r6 = r5.processName     // Catch: java.lang.Exception -> L7b
            java.lang.String[] r6 = r6.split(r0)     // Catch: java.lang.Exception -> L7b
            r8 = 1
            r6 = r6[r8]     // Catch: java.lang.Exception -> L7b
            goto L7e
        L7b:
            r0 = move-exception
            goto Lc6
        L7d:
            r6 = r7
        L7e:
            java.util.HashMap r8 = com.bytedance.pangle.Zeus.getServerManagerHashMap()     // Catch: java.lang.Exception -> L7b
            java.lang.Object r8 = r8.get(r6)     // Catch: java.lang.Exception -> L7b
            android.content.pm.ProviderInfo r8 = (android.content.pm.ProviderInfo) r8     // Catch: java.lang.Exception -> L7b
            if (r8 == 0) goto L9e
            boolean r7 = android.text.TextUtils.equals(r6, r7)     // Catch: java.lang.Exception -> L7b
            if (r7 == 0) goto L9e
            java.lang.String r7 = r5.name     // Catch: java.lang.Exception -> L7b
            java.lang.Class<com.bytedance.pangle.servermanager.MainServerManager> r8 = com.bytedance.pangle.servermanager.MainServerManager.class
            java.lang.String r8 = r8.getName()     // Catch: java.lang.Exception -> L7b
            boolean r7 = android.text.TextUtils.equals(r7, r8)     // Catch: java.lang.Exception -> L7b
            if (r7 != 0) goto La5
        L9e:
            java.util.HashMap r7 = com.bytedance.pangle.Zeus.getServerManagerHashMap()     // Catch: java.lang.Exception -> L7b
            r7.put(r6, r5)     // Catch: java.lang.Exception -> L7b
        La5:
            int r4 = r4 + 1
            goto L31
        La8:
            com.bytedance.pangle.GlobalParam r0 = com.bytedance.pangle.GlobalParam.getInstance()
            com.bytedance.pangle.log.IZeusReporter r0 = r0.getReporter()
            java.lang.String r1 = "finish"
            r0.saveRecord(r3, r1)
            return
        Lb6:
            java.lang.String r0 = "Zeus/init_pangle"
            java.lang.String r2 = "initServerManager failed. packageInfo:"
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Exception -> L7b
            java.lang.String r1 = r2.concat(r1)     // Catch: java.lang.Exception -> L7b
            com.bytedance.pangle.log.ZeusLogger.errReport(r0, r1)     // Catch: java.lang.Exception -> L7b
            return
        Lc6:
            com.bytedance.pangle.GlobalParam r1 = com.bytedance.pangle.GlobalParam.getInstance()
            com.bytedance.pangle.log.IZeusReporter r1 = r1.getReporter()
            java.lang.String r2 = "error:"
            java.lang.String r4 = java.lang.String.valueOf(r0)
            java.lang.String r2 = r2.concat(r4)
            r1.saveRecord(r3, r2)
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    private java.lang.Object[] tl() {
            r2 = this;
            java.util.List<com.bytedance.pangle.ZeusPluginEventCallback> r0 = r2.r
            monitor-enter(r0)
            java.util.List<com.bytedance.pangle.ZeusPluginEventCallback> r1 = r2.r     // Catch: java.lang.Throwable -> L12
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L14
            java.util.List<com.bytedance.pangle.ZeusPluginEventCallback> r1 = r2.r     // Catch: java.lang.Throwable -> L12
            java.lang.Object[] r1 = r1.toArray()     // Catch: java.lang.Throwable -> L12
            goto L15
        L12:
            r1 = move-exception
            goto L1d
        L14:
            r1 = 0
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L1c
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            return r0
        L1c:
            return r1
        L1d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r1
    }

    public java.util.List<com.bytedance.pangle.ZeusPluginStateListener> cw() {
            r1 = this;
            java.util.List<com.bytedance.pangle.ZeusPluginStateListener> r0 = r1.cw
            return r0
    }

    public void j(int r13, int r14, @androidx.annotation.Nullable java.lang.String r15, int r16, @androidx.annotation.Nullable java.lang.Throwable r17) {
            r12 = this;
            java.lang.Object[] r0 = r12.tl()
            int r1 = r0.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L1f
            r5 = r0[r2]
            android.os.Handler r11 = r12.up
            com.bytedance.pangle.oq$4 r3 = new com.bytedance.pangle.oq$4
            r4 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r9 = r16
            r10 = r17
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r11.post(r3)
            int r2 = r2 + 1
            goto L6
        L1f:
            return
    }

    synchronized void j(android.app.Application r14) {
            r13 = this;
            monitor-enter(r13)
            boolean r0 = r13.xt     // Catch: java.lang.Throwable -> Lcc
            if (r0 == 0) goto L13
            java.lang.String r14 = "Zeus/init_pangle"
            java.lang.String r0 = "ZeusManager zeus has been inited!"
            com.bytedance.pangle.log.ZeusLogger.w(r14, r0)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r13)
            return
        Le:
            r0 = move-exception
            r14 = r0
            r1 = r13
            goto Lcf
        L13:
            r5 = -1
            r6 = 0
            r2 = 3000(0xbb8, float:4.204E-42)
            r3 = 0
            r4 = 0
            r1 = r13
            r1.j(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L61
            com.bytedance.pangle.Zeus.setAppContext(r14)     // Catch: java.lang.Throwable -> L61
            com.bytedance.pangle.GlobalParam r0 = com.bytedance.pangle.GlobalParam.getInstance()     // Catch: java.lang.Throwable -> L61
            r0.init()     // Catch: java.lang.Throwable -> L61
            if (r14 == 0) goto Lb5
            boolean r2 = r0.isDebug()     // Catch: java.lang.Throwable -> L61
            com.bytedance.pangle.log.ZeusLogger.setDebug(r2)     // Catch: java.lang.Throwable -> L61
            java.lang.String r2 = "Zeus/init_pangle"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L61
            java.lang.String r4 = "ZeusManager init, context = "
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L61
            r3.append(r14)     // Catch: java.lang.Throwable -> L61
            java.lang.String r4 = ", hParam = "
            r3.append(r4)     // Catch: java.lang.Throwable -> L61
            r3.append(r0)     // Catch: java.lang.Throwable -> L61
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L61
            com.bytedance.pangle.log.ZeusLogger.i(r2, r3)     // Catch: java.lang.Throwable -> L61
            com.bytedance.pangle.oq$1 r2 = new com.bytedance.pangle.oq$1     // Catch: java.lang.Throwable -> L61
            r2.<init>(r13)     // Catch: java.lang.Throwable -> L61
            com.bytedance.pangle.up.up.xt(r2)     // Catch: java.lang.Throwable -> L61
            com.bytedance.pangle.GlobalParam r2 = com.bytedance.pangle.GlobalParam.getInstance()     // Catch: java.lang.Throwable -> L61
            boolean r2 = r2.isPostBgDexOptByInit()     // Catch: java.lang.Throwable -> L61
            if (r2 == 0) goto L64
            com.bytedance.pangle.m.m.j()     // Catch: java.lang.Throwable -> L61
            goto L64
        L61:
            r0 = move-exception
        L62:
            r14 = r0
            goto Lcf
        L64:
            com.bytedance.pangle.r.xt r2 = com.bytedance.pangle.r.xt.j()     // Catch: java.lang.Throwable -> L61
            com.bytedance.pangle.oq$2 r3 = new com.bytedance.pangle.oq$2     // Catch: java.lang.Throwable -> L61
            r3.<init>(r13)     // Catch: java.lang.Throwable -> L61
            r2.j(r3)     // Catch: java.lang.Throwable -> L61
            boolean r2 = r0.isCloseFlipped()     // Catch: java.lang.Throwable -> L61
            if (r2 != 0) goto L79
            com.bytedance.pangle.xt.j()     // Catch: java.lang.Throwable -> L61
        L79:
            boolean r2 = com.bytedance.pangle.util.g.i()     // Catch: java.lang.Throwable -> L61
            if (r2 == 0) goto L87
            com.bytedance.pangle.oq$3 r2 = new com.bytedance.pangle.oq$3     // Catch: java.lang.Throwable -> L61
            r2.<init>(r13)     // Catch: java.lang.Throwable -> L61
            com.bytedance.pangle.up.up.j(r2)     // Catch: java.lang.Throwable -> L61
        L87:
            boolean r2 = com.bytedance.pangle.util.g.az()     // Catch: java.lang.Throwable -> L61
            if (r2 == 0) goto L90
            r13.ae()     // Catch: java.lang.Throwable -> L61
        L90:
            r13.m()     // Catch: java.lang.Throwable -> L61
            com.bytedance.pangle.provider.ContentProviderManager r2 = com.bytedance.pangle.provider.ContentProviderManager.getInstance()     // Catch: java.lang.Throwable -> L61
            r2.initSystemContentProviderInfo()     // Catch: java.lang.Throwable -> L61
            boolean r0 = r0.closeHookHuaweiOnInit()     // Catch: java.lang.Throwable -> L61
            if (r0 != 0) goto La3
            com.bytedance.pangle.Zeus.hookHuaWeiVerifier(r14)     // Catch: java.lang.Throwable -> L61
        La3:
            r14 = 1
            r1.xt = r14     // Catch: java.lang.Throwable -> L61
            r11 = -1
            r12 = 0
            r8 = 3100(0xc1c, float:4.344E-42)
            r9 = 0
            r10 = 0
            r7 = r1
            r7.j(r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> Lb2
            monitor-exit(r13)
            return
        Lb2:
            r0 = move-exception
            r1 = r7
            goto L62
        Lb5:
            com.bytedance.pangle.GlobalParam r14 = com.bytedance.pangle.GlobalParam.getInstance()     // Catch: java.lang.Throwable -> L61
            com.bytedance.pangle.log.IZeusReporter r14 = r14.getReporter()     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = "zeus_stage_error"
            java.lang.String r2 = "context is null"
            r14.saveRecord(r0, r2)     // Catch: java.lang.Throwable -> L61
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = "context must be not null !!!"
            r14.<init>(r0)     // Catch: java.lang.Throwable -> L61
            throw r14     // Catch: java.lang.Throwable -> L61
        Lcc:
            r0 = move-exception
            r1 = r13
            goto L62
        Lcf:
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L61
            throw r14
    }

    public void j(com.bytedance.pangle.ZeusPluginDecodeCallback r1) {
            r0 = this;
            r0.m = r1
            return
    }

    public void j(com.bytedance.pangle.ZeusPluginEventCallback r3) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            java.util.List<com.bytedance.pangle.ZeusPluginEventCallback> r0 = r2.r
            monitor-enter(r0)
            java.util.List<com.bytedance.pangle.ZeusPluginEventCallback> r1 = r2.r     // Catch: java.lang.Throwable -> Ld
            r1.add(r3)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r3
    }

    public void j(com.bytedance.pangle.ZeusPluginStateListener r2) {
            r1 = this;
            java.util.List<com.bytedance.pangle.ZeusPluginStateListener> r0 = r1.cw
            r0.add(r2)
            return
    }

    public com.bytedance.pangle.ZeusPluginDecodeCallback r() {
            r1 = this;
            com.bytedance.pangle.ZeusPluginDecodeCallback r0 = r1.m
            return r0
    }

    public java.util.Map<java.lang.String, org.json.JSONObject> up() {
            r1 = this;
            java.util.Map<java.lang.String, org.json.JSONObject> r0 = r1.ae
            return r0
    }

    public void xt(com.bytedance.pangle.ZeusPluginEventCallback r3) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            java.util.List<com.bytedance.pangle.ZeusPluginEventCallback> r0 = r2.r
            monitor-enter(r0)
            java.util.List<com.bytedance.pangle.ZeusPluginEventCallback> r1 = r2.r     // Catch: java.lang.Throwable -> Ld
            r1.remove(r3)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r3
    }

    public void xt(com.bytedance.pangle.ZeusPluginStateListener r2) {
            r1 = this;
            java.util.List<com.bytedance.pangle.ZeusPluginStateListener> r0 = r1.cw
            if (r0 == 0) goto L7
            r0.remove(r2)
        L7:
            return
    }

    public boolean xt() {
            r1 = this;
            boolean r0 = r1.xt
            return r0
    }
}
