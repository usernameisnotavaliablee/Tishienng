package cn.jiguang.v;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class e {
    private static java.util.Map<java.lang.String, java.lang.String> a;

    /* renamed from: cn.jiguang.v.e$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private static final class a {
        private static final cn.jiguang.v.e a = null;

        static {
                cn.jiguang.v.e r0 = new cn.jiguang.v.e
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.v.e.a.a = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.v.e a() {
                cn.jiguang.v.e r0 = cn.jiguang.v.e.a.a
                return r0
        }
    }

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            cn.jiguang.v.e.a = r0
            return
    }

    private e() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ e(cn.jiguang.v.e.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    private android.os.Bundle a(java.lang.String r6, java.lang.String r7, android.os.Bundle r8, java.lang.String r9) {
            r5 = this;
            java.lang.String r0 = "sendByAidl, "
            java.lang.String r1 = "JMessenger"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            java.lang.String r3 = "."
            r2.append(r3)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            cn.jiguang.android.IDataShare r3 = cn.jpush.android.service.DataShare.getInstance(r9)     // Catch: java.lang.Throwable -> L3d
            if (r3 == 0) goto L5a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3d
            r4.<init>()     // Catch: java.lang.Throwable -> L3d
            r4.append(r0)     // Catch: java.lang.Throwable -> L3d
            r4.append(r2)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L3d
            cn.jiguang.w.f.c(r1, r4)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r4 = "INTERNAL_API"
            boolean r4 = r4.equals(r6)     // Catch: java.lang.Throwable -> L3d
            if (r4 == 0) goto L3f
            android.os.Bundle r6 = r3.execute(r6, r7, r8)     // Catch: java.lang.Throwable -> L3d
            return r6
        L3d:
            r6 = move-exception
            goto L72
        L3f:
            cn.jiguang.v.f$b r4 = cn.jiguang.v.f.b.a()     // Catch: java.lang.Throwable -> L3d
            boolean r4 = r4.a(r8, r9)     // Catch: java.lang.Throwable -> L3d
            if (r4 == 0) goto L51
            cn.jiguang.v.f$b r6 = cn.jiguang.v.f.b.a()     // Catch: java.lang.Throwable -> L3d
            r6.a(r3, r9)     // Catch: java.lang.Throwable -> L3d
            goto L54
        L51:
            r3.onAction(r6, r7, r8)     // Catch: java.lang.Throwable -> L3d
        L54:
            android.os.Bundle r6 = new android.os.Bundle     // Catch: java.lang.Throwable -> L3d
            r6.<init>()     // Catch: java.lang.Throwable -> L3d
            return r6
        L5a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3d
            r6.<init>()     // Catch: java.lang.Throwable -> L3d
            r6.append(r9)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r7 = "'s aidl not found, "
            r6.append(r7)     // Catch: java.lang.Throwable -> L3d
            r6.append(r2)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L3d
            cn.jiguang.w.f.c(r1, r6)     // Catch: java.lang.Throwable -> L3d
            goto L8c
        L72:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            r7.append(r2)
            java.lang.String r8 = ", e="
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            cn.jiguang.w.f.i(r1, r6)
        L8c:
            r6 = 0
            return r6
    }

    public static cn.jiguang.v.e a() {
            cn.jiguang.v.e r0 = cn.jiguang.v.e.a.a()
            return r0
    }

    private static java.lang.String a(android.content.Context r5, java.lang.String r6) {
            java.util.Map<java.lang.String, java.lang.String> r0 = cn.jiguang.v.e.a
            java.lang.Object r0 = r0.get(r6)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto Lf
            return r0
        Lf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r5.getPackageName()
            r0.append(r1)
            java.lang.String r1 = ".DataProvider"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r5.getPackageName()
            android.content.pm.ProviderInfo r1 = cn.jiguang.av.a.a(r5, r1, r0)
            r2 = 0
            if (r1 == 0) goto L32
            java.lang.String r1 = r1.processName
            goto L33
        L32:
            r1 = r2
        L33:
            boolean r1 = r6.equals(r1)
            java.lang.String r3 = "/"
            java.lang.String r4 = "content://"
            if (r1 == 0) goto L55
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
        L42:
            r5.append(r4)
            r5.append(r0)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            java.util.Map<java.lang.String, java.lang.String> r0 = cn.jiguang.v.e.a
            r0.put(r6, r5)
            return r5
        L55:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r5.getPackageName()
            r0.append(r1)
            java.lang.String r1 = ".DownloadProvider"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r5.getPackageName()
            android.content.pm.ProviderInfo r5 = cn.jiguang.av.a.a(r5, r1, r0)
            if (r5 == 0) goto L76
            java.lang.String r2 = r5.processName
        L76:
            boolean r5 = r6.equals(r2)
            if (r5 == 0) goto L82
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            goto L42
        L82:
            java.lang.String r5 = ""
            return r5
    }

    private boolean a(android.content.Context r5, java.lang.Class r6, java.lang.String r7, android.os.Bundle r8) {
            r4 = this;
            java.lang.String r0 = "JMessenger"
            r1 = 0
            if (r6 != 0) goto L6
            return r1
        L6:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r6.getName()
            r2.append(r3)
            java.lang.String r3 = "."
            r2.append(r3)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Throwable -> L36
            r3.<init>()     // Catch: java.lang.Throwable -> L36
            r3.setClass(r5, r6)     // Catch: java.lang.Throwable -> L36
            r3.setAction(r7)     // Catch: java.lang.Throwable -> L36
            java.lang.String r7 = r5.getPackageName()     // Catch: java.lang.Throwable -> L36
            r3.setPackage(r7)     // Catch: java.lang.Throwable -> L36
            if (r8 == 0) goto L38
            r3.putExtras(r8)     // Catch: java.lang.Throwable -> L36
            goto L38
        L36:
            r5 = move-exception
            goto L96
        L38:
            java.lang.Class<android.content.BroadcastReceiver> r7 = android.content.BroadcastReceiver.class
            boolean r7 = r7.isAssignableFrom(r6)     // Catch: java.lang.Throwable -> L36
            r8 = 1
            if (r7 == 0) goto L59
            r5.sendBroadcast(r3)     // Catch: java.lang.Throwable -> L36
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L36
            r5.<init>()     // Catch: java.lang.Throwable -> L36
            java.lang.String r6 = "sendByReceiver, "
            r5.append(r6)     // Catch: java.lang.Throwable -> L36
            r5.append(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L36
            cn.jiguang.w.f.c(r0, r5)     // Catch: java.lang.Throwable -> L36
            return r8
        L59:
            java.lang.Class<android.app.Service> r7 = android.app.Service.class
            boolean r6 = r7.isAssignableFrom(r6)     // Catch: java.lang.Throwable -> L36
            if (r6 == 0) goto Lb2
            android.content.ComponentName r5 = r5.startService(r3)     // Catch: java.lang.Throwable -> L36
            if (r5 == 0) goto L7c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L36
            r5.<init>()     // Catch: java.lang.Throwable -> L36
            java.lang.String r6 = "sendByService, "
            r5.append(r6)     // Catch: java.lang.Throwable -> L36
            r5.append(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L36
            cn.jiguang.w.f.c(r0, r5)     // Catch: java.lang.Throwable -> L36
            return r8
        L7c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L36
            r5.<init>()     // Catch: java.lang.Throwable -> L36
            java.lang.String r6 = "startService, "
            r5.append(r6)     // Catch: java.lang.Throwable -> L36
            r5.append(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.String r6 = ", can't find component"
            r5.append(r6)     // Catch: java.lang.Throwable -> L36
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L36
            cn.jiguang.w.f.i(r0, r5)     // Catch: java.lang.Throwable -> L36
            goto Lb2
        L96:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "sendByComponent, "
            r6.append(r7)
            r6.append(r2)
            java.lang.String r7 = " e="
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            cn.jiguang.w.f.i(r0, r5)
        Lb2:
            return r1
    }

    private android.os.Bundle b(android.content.Context r7, java.lang.String r8, java.lang.String r9, android.os.Bundle r10, java.lang.String r11) {
            r6 = this;
            java.lang.String r0 = "JMessenger"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            java.lang.String r2 = "."
            r1.append(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = a(r7, r11)     // Catch: java.lang.Throwable -> L53
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L53
            if (r3 != 0) goto L5e
            android.net.Uri r3 = android.net.Uri.parse(r2)     // Catch: java.lang.Throwable -> L53
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L53
            r4.<init>()     // Catch: java.lang.Throwable -> L53
            java.lang.String r5 = "sendByProvider, uri="
            r4.append(r5)     // Catch: java.lang.Throwable -> L53
            r4.append(r2)     // Catch: java.lang.Throwable -> L53
            java.lang.String r2 = ", "
            r4.append(r2)     // Catch: java.lang.Throwable -> L53
            r4.append(r1)     // Catch: java.lang.Throwable -> L53
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L53
            cn.jiguang.w.f.c(r0, r1)     // Catch: java.lang.Throwable -> L53
            cn.jiguang.v.f$b r1 = cn.jiguang.v.f.b.a()     // Catch: java.lang.Throwable -> L53
            boolean r1 = r1.a(r10, r11)     // Catch: java.lang.Throwable -> L53
            if (r1 == 0) goto L55
            cn.jiguang.v.f$b r8 = cn.jiguang.v.f.b.a()     // Catch: java.lang.Throwable -> L53
            android.os.Bundle r7 = r8.a(r7, r3, r11)     // Catch: java.lang.Throwable -> L53
            return r7
        L53:
            r7 = move-exception
            goto L64
        L55:
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch: java.lang.Throwable -> L53
            android.os.Bundle r7 = r7.call(r3, r8, r9, r10)     // Catch: java.lang.Throwable -> L53
            return r7
        L5e:
            java.lang.String r7 = "uri is null, check provider config"
            cn.jiguang.w.f.c(r0, r7)     // Catch: java.lang.Throwable -> L53
            goto L78
        L64:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "provider call:"
            r8.append(r9)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            cn.jiguang.w.f.i(r0, r7)
        L78:
            r7 = 0
            return r7
    }

    public android.os.Bundle a(android.content.Context r3, java.lang.String r4, java.lang.String r5, android.os.Bundle r6, java.lang.String r7) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L29
            java.lang.String r0 = cn.jiguang.av.a.a(r3)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L29
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L1b
            android.os.Bundle r3 = r2.b(r3, r4, r5, r6)
            return r3
        L1b:
            android.os.Bundle r0 = r2.a(r4, r5, r6, r7)
            if (r0 == 0) goto L22
            return r0
        L22:
            android.os.Bundle r3 = r2.b(r3, r4, r5, r6, r7)
            if (r3 == 0) goto L29
            return r3
        L29:
            r3 = 0
            return r3
    }

    public boolean a(android.content.Context r11, java.lang.String r12, java.lang.String r13, android.os.Bundle r14) {
            r10 = this;
            java.lang.String r7 = " meet e:"
            java.lang.String r8 = "JMessenger"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            java.lang.String r1 = "."
            r0.append(r1)
            r0.append(r13)
            java.lang.String r9 = r0.toString()
            r1 = 0
            java.lang.Class r6 = java.lang.Class.forName(r12)     // Catch: java.lang.Throwable -> L4f
            java.lang.Class<android.app.Service> r0 = android.app.Service.class
            boolean r0 = r0.isAssignableFrom(r6)     // Catch: java.lang.Throwable -> L39
            if (r0 == 0) goto L3b
            java.lang.String r5 = cn.jiguang.av.a.a(r11, r12)     // Catch: java.lang.Throwable -> L39
            cn.jiguang.v.f$b r0 = cn.jiguang.v.f.b.a()     // Catch: java.lang.Throwable -> L36
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r0.a(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L36
            r1 = r5
            goto L47
        L36:
            r0 = move-exception
            r1 = r5
            goto L51
        L39:
            r0 = move-exception
            goto L51
        L3b:
            java.lang.Class<android.content.BroadcastReceiver> r0 = android.content.BroadcastReceiver.class
            boolean r0 = r0.isAssignableFrom(r6)     // Catch: java.lang.Throwable -> L39
            if (r0 == 0) goto L47
            java.lang.String r1 = cn.jiguang.av.a.b(r11, r12)     // Catch: java.lang.Throwable -> L39
        L47:
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r0 = r6
            r6 = r1
            r1 = r10
            goto L67
        L4f:
            r0 = move-exception
            r6 = r1
        L51:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r9)
            r2.append(r7)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            cn.jiguang.w.f.c(r8, r0)
            goto L47
        L67:
            android.os.Bundle r3 = r1.a(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L76
            r1 = 1
            if (r3 == 0) goto L6f
            return r1
        L6f:
            boolean r0 = r10.a(r11, r0, r13, r14)     // Catch: java.lang.Throwable -> L76
            if (r0 == 0) goto L91
            return r1
        L76:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "send, "
            r1.append(r3)
            r1.append(r9)
            r1.append(r7)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            cn.jiguang.w.f.i(r8, r0)
        L91:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "send all failed, "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            cn.jiguang.w.f.l(r8, r0)
            r0 = 0
            return r0
    }

    public android.os.Bundle b(android.content.Context r8, java.lang.String r9, java.lang.String r10, android.os.Bundle r11) {
            r7 = this;
            java.lang.Class<android.content.BroadcastReceiver> r0 = android.content.BroadcastReceiver.class
            java.lang.String r1 = "."
            java.lang.String r2 = "JMessenger"
            r3 = 0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r4.<init>()     // Catch: java.lang.Throwable -> L35
            java.lang.String r5 = "directHandle, "
            r4.append(r5)     // Catch: java.lang.Throwable -> L35
            r4.append(r9)     // Catch: java.lang.Throwable -> L35
            r4.append(r1)     // Catch: java.lang.Throwable -> L35
            r4.append(r10)     // Catch: java.lang.Throwable -> L35
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L35
            cn.jiguang.w.f.c(r2, r4)     // Catch: java.lang.Throwable -> L35
            cn.jiguang.al.a.a(r8, r11)     // Catch: java.lang.Throwable -> L35
            java.lang.String r4 = "INTERNAL_API"
            boolean r4 = r4.equals(r9)     // Catch: java.lang.Throwable -> L35
            if (r4 == 0) goto L38
            cn.jiguang.v.g r8 = cn.jiguang.v.g.a()     // Catch: java.lang.Throwable -> L35
            android.os.Bundle r8 = r8.b(r10, r11)     // Catch: java.lang.Throwable -> L35
            return r8
        L35:
            r8 = move-exception
            goto L133
        L38:
            java.lang.Class r4 = java.lang.Class.forName(r9)     // Catch: java.lang.Throwable -> L35
            boolean r5 = r0.isAssignableFrom(r4)     // Catch: java.lang.Throwable -> L35
            if (r5 != 0) goto L65
            java.lang.Class<android.app.Service> r5 = android.app.Service.class
            boolean r5 = r5.isAssignableFrom(r4)     // Catch: java.lang.Throwable -> L35
            if (r5 != 0) goto L65
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r8.<init>()     // Catch: java.lang.Throwable -> L35
            java.lang.String r11 = "directHandle, not support "
            r8.append(r11)     // Catch: java.lang.Throwable -> L35
            r8.append(r9)     // Catch: java.lang.Throwable -> L35
            r8.append(r1)     // Catch: java.lang.Throwable -> L35
            r8.append(r10)     // Catch: java.lang.Throwable -> L35
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L35
            cn.jiguang.w.f.l(r2, r8)     // Catch: java.lang.Throwable -> L35
            return r3
        L65:
            java.lang.Class<cn.jpush.android.service.JCommonService> r5 = cn.jpush.android.service.JCommonService.class
            boolean r5 = r5.isAssignableFrom(r4)     // Catch: java.lang.Throwable -> L35
            if (r5 == 0) goto L90
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r0.<init>()     // Catch: java.lang.Throwable -> L35
            java.lang.String r4 = "JCommonService handle succeed,"
            r0.append(r4)     // Catch: java.lang.Throwable -> L35
            r0.append(r9)     // Catch: java.lang.Throwable -> L35
            r0.append(r1)     // Catch: java.lang.Throwable -> L35
            r0.append(r10)     // Catch: java.lang.Throwable -> L35
            java.lang.String r9 = r0.toString()     // Catch: java.lang.Throwable -> L35
            cn.jiguang.w.f.c(r2, r9)     // Catch: java.lang.Throwable -> L35
            cn.jiguang.a.a.b(r8, r10, r11)     // Catch: java.lang.Throwable -> L35
            android.os.Bundle r8 = new android.os.Bundle     // Catch: java.lang.Throwable -> L35
            r8.<init>()     // Catch: java.lang.Throwable -> L35
            return r8
        L90:
            android.content.Intent r5 = new android.content.Intent     // Catch: java.lang.Throwable -> L35
            r5.<init>(r10)     // Catch: java.lang.Throwable -> L35
            r5.setClass(r8, r4)     // Catch: java.lang.Throwable -> L35
            if (r11 == 0) goto L9d
            r5.putExtras(r11)     // Catch: java.lang.Throwable -> L35
        L9d:
            java.lang.String r6 = r8.getPackageName()     // Catch: java.lang.Throwable -> L35
            r5.setPackage(r6)     // Catch: java.lang.Throwable -> L35
            java.lang.String r6 = r8.getPackageName()     // Catch: java.lang.Throwable -> L35
            r5.addCategory(r6)     // Catch: java.lang.Throwable -> L35
            java.lang.Class<cn.jpush.android.service.PushReceiver> r6 = cn.jpush.android.service.PushReceiver.class
            boolean r6 = r6.isAssignableFrom(r4)     // Catch: java.lang.Throwable -> L35
            if (r6 == 0) goto Ldf
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r0.<init>()     // Catch: java.lang.Throwable -> L35
            java.lang.String r4 = "PushReceiver handle succeed,"
            r0.append(r4)     // Catch: java.lang.Throwable -> L35
            r0.append(r9)     // Catch: java.lang.Throwable -> L35
            r0.append(r1)     // Catch: java.lang.Throwable -> L35
            r0.append(r10)     // Catch: java.lang.Throwable -> L35
            java.lang.String r9 = r0.toString()     // Catch: java.lang.Throwable -> L35
            cn.jiguang.w.f.c(r2, r9)     // Catch: java.lang.Throwable -> L35
            if (r11 == 0) goto Ld6
            java.lang.String r9 = "sdktype"
            java.lang.String r9 = r11.getString(r9)     // Catch: java.lang.Throwable -> L35
            goto Ld7
        Ld6:
            r9 = r3
        Ld7:
            cn.jiguang.internal.ActionManager r10 = cn.jiguang.internal.ActionManager.getInstance()     // Catch: java.lang.Throwable -> L35
            r10.handleMessage(r8, r9, r5)     // Catch: java.lang.Throwable -> L35
            goto L12d
        Ldf:
            boolean r11 = r0.isAssignableFrom(r4)     // Catch: java.lang.Throwable -> L35
            if (r11 == 0) goto L109
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r11.<init>()     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = "Receiver onReceive,"
            r11.append(r0)     // Catch: java.lang.Throwable -> L35
            r11.append(r9)     // Catch: java.lang.Throwable -> L35
            r11.append(r1)     // Catch: java.lang.Throwable -> L35
            r11.append(r10)     // Catch: java.lang.Throwable -> L35
            java.lang.String r9 = r11.toString()     // Catch: java.lang.Throwable -> L35
            cn.jiguang.w.f.c(r2, r9)     // Catch: java.lang.Throwable -> L35
            java.lang.Object r9 = r4.newInstance()     // Catch: java.lang.Throwable -> L35
            android.content.BroadcastReceiver r9 = (android.content.BroadcastReceiver) r9     // Catch: java.lang.Throwable -> L35
            r9.onReceive(r8, r5)     // Catch: java.lang.Throwable -> L35
            goto L12d
        L109:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r8.<init>()     // Catch: java.lang.Throwable -> L35
            java.lang.String r11 = "Service onStartCommand,"
            r8.append(r11)     // Catch: java.lang.Throwable -> L35
            r8.append(r9)     // Catch: java.lang.Throwable -> L35
            r8.append(r1)     // Catch: java.lang.Throwable -> L35
            r8.append(r10)     // Catch: java.lang.Throwable -> L35
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L35
            cn.jiguang.w.f.c(r2, r8)     // Catch: java.lang.Throwable -> L35
            java.lang.Object r8 = r4.newInstance()     // Catch: java.lang.Throwable -> L35
            android.app.Service r8 = (android.app.Service) r8     // Catch: java.lang.Throwable -> L35
            r9 = 0
            r8.onStartCommand(r5, r9, r9)     // Catch: java.lang.Throwable -> L35
        L12d:
            android.os.Bundle r8 = new android.os.Bundle     // Catch: java.lang.Throwable -> L35
            r8.<init>()     // Catch: java.lang.Throwable -> L35
            return r8
        L133:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "directHandle e:"
            r9.append(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            cn.jiguang.w.f.l(r2, r8)
            return r3
    }
}
