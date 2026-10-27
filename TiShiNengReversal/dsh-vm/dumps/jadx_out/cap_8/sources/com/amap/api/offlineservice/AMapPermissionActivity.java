package com.amap.api.offlineservice;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class AMapPermissionActivity extends android.app.Activity {
    private boolean a;
    protected java.lang.String[] needPermissions;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a implements android.content.DialogInterface.OnClickListener {
        final /* synthetic */ com.amap.api.offlineservice.AMapPermissionActivity a;

        a(com.amap.api.offlineservice.AMapPermissionActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(android.content.DialogInterface r1, int r2) {
                r0 = this;
                com.amap.api.offlineservice.AMapPermissionActivity r1 = r0.a     // Catch: java.lang.Throwable -> L5
                r1.finish()     // Catch: java.lang.Throwable -> L5
            L5:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class b implements android.content.DialogInterface.OnClickListener {
        final /* synthetic */ com.amap.api.offlineservice.AMapPermissionActivity a;

        b(com.amap.api.offlineservice.AMapPermissionActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(android.content.DialogInterface r1, int r2) {
                r0 = this;
                com.amap.api.offlineservice.AMapPermissionActivity r1 = r0.a     // Catch: java.lang.Throwable -> L5
                com.amap.api.offlineservice.AMapPermissionActivity.a(r1)     // Catch: java.lang.Throwable -> L5
            L5:
                return
        }
    }

    public AMapPermissionActivity() {
            r1 = this;
            r1.<init>()
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            r1.needPermissions = r0
            r0 = 1
            r1.a = r0
            return
    }

    private int a(java.lang.String r7) {
            r6 = this;
            java.lang.Class r0 = r6.getClass()     // Catch: java.lang.Throwable -> L21
            java.lang.String r1 = "checkSelfPermission"
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L21
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L21
            java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch: java.lang.Throwable -> L21
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L21
            r1[r5] = r7     // Catch: java.lang.Throwable -> L21
            java.lang.Object r7 = r0.invoke(r6, r1)     // Catch: java.lang.Throwable -> L21
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch: java.lang.Throwable -> L21
            int r7 = r7.intValue()     // Catch: java.lang.Throwable -> L21
            return r7
        L21:
            r7 = -1
            return r7
    }

    static /* synthetic */ void a(com.amap.api.offlineservice.AMapPermissionActivity r0) {
            r0.f()
            return
    }

    private void b() {
            r3 = this;
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder     // Catch: java.lang.Throwable -> L2a
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r1 = "提示"
            r0.setTitle(r1)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r1 = "当前应用缺少必要权限。\n\n请点击\"设置\"-\"权限\"-打开所需权限"
            r0.setMessage(r1)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r1 = "取消"
            com.amap.api.offlineservice.AMapPermissionActivity$a r2 = new com.amap.api.offlineservice.AMapPermissionActivity$a     // Catch: java.lang.Throwable -> L2a
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L2a
            r0.setNegativeButton(r1, r2)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r1 = "设置"
            com.amap.api.offlineservice.AMapPermissionActivity$b r2 = new com.amap.api.offlineservice.AMapPermissionActivity$b     // Catch: java.lang.Throwable -> L2a
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L2a
            r0.setPositiveButton(r1, r2)     // Catch: java.lang.Throwable -> L2a
            r1 = 0
            r0.setCancelable(r1)     // Catch: java.lang.Throwable -> L2a
            r0.show()     // Catch: java.lang.Throwable -> L2a
        L2a:
            return
    }

    @android.annotation.TargetApi(23)
    private void c(java.lang.String... r8) {
            r7 = this;
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L4a
            r1 = 23
            if (r0 < r1) goto L4a
            android.content.pm.ApplicationInfo r0 = r7.getApplicationInfo()     // Catch: java.lang.Throwable -> L4a
            int r0 = r0.targetSdkVersion     // Catch: java.lang.Throwable -> L4a
            if (r0 < r1) goto L4a
            java.util.List r8 = r7.e(r8)     // Catch: java.lang.Throwable -> L4a
            if (r8 == 0) goto L4a
            int r0 = r8.size()     // Catch: java.lang.Throwable -> L4a
            if (r0 <= 0) goto L4a
            int r0 = r8.size()     // Catch: java.lang.Throwable -> L4a
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L4a
            java.lang.Object[] r8 = r8.toArray(r0)     // Catch: java.lang.Throwable -> L4a
            java.lang.String[] r8 = (java.lang.String[]) r8     // Catch: java.lang.Throwable -> L4a
            java.lang.Class r0 = r7.getClass()     // Catch: java.lang.Throwable -> L4a
            java.lang.String r1 = "requestPermissions"
            r2 = 2
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L4a
            java.lang.Class<java.lang.String[]> r4 = java.lang.String[].class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L4a
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L4a
            r6 = 1
            r3[r6] = r4     // Catch: java.lang.Throwable -> L4a
            java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch: java.lang.Throwable -> L4a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L4a
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L4a
            r2[r5] = r8     // Catch: java.lang.Throwable -> L4a
            r2[r6] = r1     // Catch: java.lang.Throwable -> L4a
            r0.invoke(r7, r2)     // Catch: java.lang.Throwable -> L4a
        L4a:
            return
    }

    private static boolean d(int[] r4) {
            int r0 = r4.length     // Catch: java.lang.Throwable -> Ld
            r1 = 0
            r2 = 0
        L3:
            if (r2 >= r0) goto Ld
            r3 = r4[r2]     // Catch: java.lang.Throwable -> Ld
            if (r3 == 0) goto La
            return r1
        La:
            int r2 = r2 + 1
            goto L3
        Ld:
            r4 = 1
            return r4
    }

    @android.annotation.TargetApi(23)
    private java.util.List<java.lang.String> e(java.lang.String[] r6) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2c
            r0.<init>()     // Catch: java.lang.Throwable -> L2c
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L2c
            r2 = 23
            if (r1 < r2) goto L2b
            android.content.pm.ApplicationInfo r1 = r5.getApplicationInfo()     // Catch: java.lang.Throwable -> L2c
            int r1 = r1.targetSdkVersion     // Catch: java.lang.Throwable -> L2c
            if (r1 < r2) goto L2b
            int r1 = r6.length     // Catch: java.lang.Throwable -> L2c
            r2 = 0
        L15:
            if (r2 >= r1) goto L2b
            r3 = r6[r2]     // Catch: java.lang.Throwable -> L2c
            int r4 = r5.a(r3)     // Catch: java.lang.Throwable -> L2c
            if (r4 != 0) goto L25
            boolean r4 = r5.g(r3)     // Catch: java.lang.Throwable -> L2c
            if (r4 == 0) goto L28
        L25:
            r0.add(r3)     // Catch: java.lang.Throwable -> L2c
        L28:
            int r2 = r2 + 1
            goto L15
        L2b:
            return r0
        L2c:
            r6 = 0
            return r6
    }

    private void f() {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = "android.settings.APPLICATION_DETAILS_SETTINGS"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L23
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = "package:"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = r3.getPackageName()     // Catch: java.lang.Throwable -> L23
            r1.append(r2)     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L23
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch: java.lang.Throwable -> L23
            r0.setData(r1)     // Catch: java.lang.Throwable -> L23
            r3.startActivity(r0)     // Catch: java.lang.Throwable -> L23
        L23:
            return
    }

    private boolean g(java.lang.String r7) {
            r6 = this;
            r0 = 0
            java.lang.Class r1 = r6.getClass()     // Catch: java.lang.Throwable -> L21
            java.lang.String r2 = "shouldShowRequestPermissionRationale"
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L21
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r0] = r5     // Catch: java.lang.Throwable -> L21
            java.lang.reflect.Method r1 = r1.getMethod(r2, r4)     // Catch: java.lang.Throwable -> L21
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L21
            r2[r0] = r7     // Catch: java.lang.Throwable -> L21
            java.lang.Object r7 = r1.invoke(r6, r2)     // Catch: java.lang.Throwable -> L21
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L21
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L21
            return r7
        L21:
            return r0
    }

    @Override // android.app.Activity
    @android.annotation.TargetApi(23)
    public void onRequestPermissionsResult(int r2, java.lang.String[] r3, int[] r4) {
            r1 = this;
            com.stub.StubApp.interface22(r2, r3, r4)     // Catch: java.lang.Throwable -> L17
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L17
            r0 = 23
            if (r3 < r0) goto L17
            if (r2 != 0) goto L17
            boolean r2 = d(r4)     // Catch: java.lang.Throwable -> L17
            if (r2 != 0) goto L17
            r1.b()     // Catch: java.lang.Throwable -> L17
            r2 = 0
            r1.a = r2     // Catch: java.lang.Throwable -> L17
        L17:
            return
    }

    @Override // android.app.Activity
    protected void onResume() {
            r2 = this;
            super.onResume()     // Catch: java.lang.Throwable -> L12
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L12
            r1 = 23
            if (r0 < r1) goto L12
            boolean r0 = r2.a     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L12
            java.lang.String[] r0 = r2.needPermissions     // Catch: java.lang.Throwable -> L12
            r2.c(r0)     // Catch: java.lang.Throwable -> L12
        L12:
            return
    }
}
