package com.amap.api.maps.offlinemap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class OfflineMapActivity extends com.amap.api.offlineservice.AMapPermissionActivity implements android.view.View.OnClickListener {
    private static int a;

    /* renamed from: b, reason: collision with root package name */
    private com.amap.api.offlineservice.a f5029b;

    /* renamed from: c, reason: collision with root package name */
    private com.amap.api.col.p0003l.t3 f5030c;

    /* renamed from: d, reason: collision with root package name */
    private com.amap.api.col.p0003l.t3[] f5031d;

    /* renamed from: e, reason: collision with root package name */
    private int f5032e;

    /* renamed from: f, reason: collision with root package name */
    private com.amap.api.col.p0003l.u3 f5033f;

    static {
            return
    }

    public OfflineMapActivity() {
            r1 = this;
            r1.<init>()
            r0 = 32
            com.amap.api.col.3l.t3[] r0 = new com.amap.api.col.p0003l.t3[r0]
            r1.f5031d = r0
            r0 = -1
            r1.f5032e = r0
            return
    }

    private void a(com.amap.api.col.p0003l.t3 r2) {
            r1 = this;
            com.amap.api.offlineservice.a r0 = r1.f5029b     // Catch: java.lang.Throwable -> L21
            if (r0 == 0) goto La
            r0.h()     // Catch: java.lang.Throwable -> L21
            r0 = 0
            r1.f5029b = r0     // Catch: java.lang.Throwable -> L21
        La:
            com.amap.api.offlineservice.a r0 = r1.c(r2)     // Catch: java.lang.Throwable -> L21
            r1.f5029b = r0     // Catch: java.lang.Throwable -> L21
            if (r0 == 0) goto L21
            r1.f5030c = r2     // Catch: java.lang.Throwable -> L21
            r0.d(r1)     // Catch: java.lang.Throwable -> L21
            com.amap.api.offlineservice.a r2 = r1.f5029b     // Catch: java.lang.Throwable -> L21
            r2.b()     // Catch: java.lang.Throwable -> L21
            com.amap.api.offlineservice.a r2 = r1.f5029b     // Catch: java.lang.Throwable -> L21
            r2.e()     // Catch: java.lang.Throwable -> L21
        L21:
            return
    }

    private boolean a(android.os.Bundle r5) {
            r4 = this;
            r0 = 0
            int r1 = com.amap.api.maps.offlinemap.OfflineMapActivity.a     // Catch: java.lang.Throwable -> L22
            r2 = 1
            if (r1 != r2) goto Lb
            com.amap.api.offlineservice.a r3 = r4.f5029b     // Catch: java.lang.Throwable -> L22
            if (r3 == 0) goto Lb
            return r0
        Lb:
            if (r1 <= r2) goto L22
            int r1 = r1 - r2
            com.amap.api.maps.offlinemap.OfflineMapActivity.a = r1     // Catch: java.lang.Throwable -> L22
            int r1 = r4.f5032e     // Catch: java.lang.Throwable -> L22
            int r1 = r1 + 31
            int r1 = r1 % 32
            r4.f5032e = r1     // Catch: java.lang.Throwable -> L22
            com.amap.api.col.3l.t3[] r3 = r4.f5031d     // Catch: java.lang.Throwable -> L22
            r1 = r3[r1]     // Catch: java.lang.Throwable -> L22
            r1.f3983b = r5     // Catch: java.lang.Throwable -> L22
            r4.a(r1)     // Catch: java.lang.Throwable -> L22
            return r2
        L22:
            return r0
    }

    private void b(com.amap.api.col.p0003l.t3 r3) {
            r2 = this;
            int r0 = com.amap.api.maps.offlinemap.OfflineMapActivity.a     // Catch: java.lang.Throwable -> L15
            int r0 = r0 + 1
            com.amap.api.maps.offlinemap.OfflineMapActivity.a = r0     // Catch: java.lang.Throwable -> L15
            r2.a(r3)     // Catch: java.lang.Throwable -> L15
            int r0 = r2.f5032e     // Catch: java.lang.Throwable -> L15
            int r0 = r0 + 1
            int r0 = r0 % 32
            r2.f5032e = r0     // Catch: java.lang.Throwable -> L15
            com.amap.api.col.3l.t3[] r1 = r2.f5031d     // Catch: java.lang.Throwable -> L15
            r1[r0] = r3     // Catch: java.lang.Throwable -> L15
        L15:
            return
    }

    private com.amap.api.offlineservice.a c(com.amap.api.col.p0003l.t3 r2) {
            r1 = this;
            int r2 = r2.a     // Catch: java.lang.Throwable -> L14
            r0 = 1
            if (r2 == r0) goto L6
            goto L14
        L6:
            com.amap.api.col.3l.u3 r2 = r1.f5033f     // Catch: java.lang.Throwable -> L14
            if (r2 != 0) goto L11
            com.amap.api.col.3l.u3 r2 = new com.amap.api.col.3l.u3     // Catch: java.lang.Throwable -> L14
            r2.<init>()     // Catch: java.lang.Throwable -> L14
            r1.f5033f = r2     // Catch: java.lang.Throwable -> L14
        L11:
            com.amap.api.col.3l.u3 r2 = r1.f5033f     // Catch: java.lang.Throwable -> L14
            return r2
        L14:
            r2 = 0
            return r2
    }

    public void closeScr() {
            r1 = this;
            r0 = 0
            boolean r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L11
            if (r0 != 0) goto L11
            com.amap.api.offlineservice.a r0 = r1.f5029b     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto Le
            r0.h()     // Catch: java.lang.Throwable -> L11
        Le:
            r1.finish()     // Catch: java.lang.Throwable -> L11
        L11:
            return
    }

    public void closeScr(android.os.Bundle r1) {
            r0 = this;
            boolean r1 = r0.a(r1)     // Catch: java.lang.Throwable -> L10
            if (r1 != 0) goto L10
            com.amap.api.offlineservice.a r1 = r0.f5029b     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto Ld
            r1.h()     // Catch: java.lang.Throwable -> L10
        Ld:
            r0.finish()     // Catch: java.lang.Throwable -> L10
        L10:
            return
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r2) {
            r1 = this;
            com.amap.api.offlineservice.a r0 = r1.f5029b     // Catch: java.lang.Throwable -> L7
            if (r0 == 0) goto L7
            r0.c(r2)     // Catch: java.lang.Throwable -> L7
        L7:
            return
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            super.onConfigurationChanged(r1)     // Catch: java.lang.Throwable -> L3
        L3:
            return
    }

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle r2) {
            r1 = this;
            super.onCreate(r2)     // Catch: java.lang.Throwable -> L31
            android.view.Window r2 = r1.getWindow()     // Catch: java.lang.Throwable -> L31
            r0 = 32
            r2.setSoftInputMode(r0)     // Catch: java.lang.Throwable -> L31
            android.view.Window r2 = r1.getWindow()     // Catch: java.lang.Throwable -> L31
            r0 = -3
            r2.setFormat(r0)     // Catch: java.lang.Throwable -> L31
            r2 = 1
            r1.requestWindowFeature(r2)     // Catch: java.lang.Throwable -> L31
            android.content.Context r2 = r1.getApplicationContext()     // Catch: java.lang.Throwable -> L31
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)     // Catch: java.lang.Throwable -> L31
            com.amap.api.col.p0003l.x3.f(r2)     // Catch: java.lang.Throwable -> L31
            r2 = -1
            r1.f5032e = r2     // Catch: java.lang.Throwable -> L31
            r2 = 0
            com.amap.api.maps.offlinemap.OfflineMapActivity.a = r2     // Catch: java.lang.Throwable -> L31
            com.amap.api.col.3l.t3 r2 = new com.amap.api.col.3l.t3     // Catch: java.lang.Throwable -> L31
            r2.<init>()     // Catch: java.lang.Throwable -> L31
            r1.b(r2)     // Catch: java.lang.Throwable -> L31
        L31:
            return
    }

    @Override // android.app.Activity
    protected void onDestroy() {
            r2 = this;
            super.onDestroy()     // Catch: java.lang.Throwable -> L1a
            com.amap.api.offlineservice.a r0 = r2.f5029b     // Catch: java.lang.Throwable -> L1a
            r1 = 0
            if (r0 == 0) goto Ld
            r0.h()     // Catch: java.lang.Throwable -> L1a
            r2.f5029b = r1     // Catch: java.lang.Throwable -> L1a
        Ld:
            r2.f5030c = r1     // Catch: java.lang.Throwable -> L1a
            r2.f5031d = r1     // Catch: java.lang.Throwable -> L1a
            com.amap.api.col.3l.u3 r0 = r2.f5033f     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L1a
            r0.h()     // Catch: java.lang.Throwable -> L1a
            r2.f5033f = r1     // Catch: java.lang.Throwable -> L1a
        L1a:
            return
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int r4, android.view.KeyEvent r5) {
            r3 = this;
            r0 = 4
            if (r4 != r0) goto L27
            com.amap.api.offlineservice.a r0 = r3.f5029b     // Catch: java.lang.Throwable -> L27
            r1 = 1
            if (r0 == 0) goto Lf
            boolean r0 = r0.f()     // Catch: java.lang.Throwable -> L27
            if (r0 != 0) goto Lf
            return r1
        Lf:
            r0 = 0
            boolean r0 = r3.a(r0)     // Catch: java.lang.Throwable -> L27
            r2 = 0
            if (r0 == 0) goto L18
            return r2
        L18:
            if (r5 != 0) goto L22
            int r0 = com.amap.api.maps.offlinemap.OfflineMapActivity.a     // Catch: java.lang.Throwable -> L27
            if (r0 != r1) goto L21
            r3.finish()     // Catch: java.lang.Throwable -> L27
        L21:
            return r2
        L22:
            r0 = -1
            r3.f5032e = r0     // Catch: java.lang.Throwable -> L27
            com.amap.api.maps.offlinemap.OfflineMapActivity.a = r2     // Catch: java.lang.Throwable -> L27
        L27:
            boolean r4 = super.onKeyDown(r4, r5)
            return r4
    }

    @Override // android.app.Activity
    protected void onPause() {
            r0 = this;
            super.onPause()     // Catch: java.lang.Throwable -> L3
        L3:
            return
    }

    @Override // com.amap.api.offlineservice.AMapPermissionActivity, android.app.Activity
    protected void onResume() {
            r0 = this;
            super.onResume()     // Catch: java.lang.Throwable -> L3
        L3:
            return
    }

    @Override // android.app.Activity
    protected void onStart() {
            r0 = this;
            super.onStart()     // Catch: java.lang.Throwable -> L3
        L3:
            return
    }

    @Override // android.app.Activity
    protected void onStop() {
            r0 = this;
            super.onStop()     // Catch: java.lang.Throwable -> L3
        L3:
            return
    }

    public void showScr() {
            r1 = this;
            com.amap.api.offlineservice.a r0 = r1.f5029b     // Catch: java.lang.Throwable -> L9
            android.widget.RelativeLayout r0 = r0.g()     // Catch: java.lang.Throwable -> L9
            r1.setContentView(r0)     // Catch: java.lang.Throwable -> L9
        L9:
            return
    }
}
