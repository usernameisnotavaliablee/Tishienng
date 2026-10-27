package com.qq.e.ads;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class ADActivity extends android.app.Activity {
    public static final java.lang.String NOTCH_CONTAINER_TAG = "NOTCH_CONTAINER";
    protected com.qq.e.comm.pi.ACTD a;
    private android.widget.FrameLayout b;

    static {
            r0 = 40842(0x9f8a, float:5.7232E-41)
            com.stub.StubApp.interface11(r0)
            return
    }

    public ADActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    private void a() {
            r5 = this;
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r5)
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r2 = -1
            r1.<init>(r2, r2)
            r0.setLayoutParams(r1)
            r1 = 1
            r0.setOrientation(r1)
            super.setContentView(r0)
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            r1.<init>(r5)
            java.lang.String r3 = "NOTCH_CONTAINER"
            r1.setTag(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r4 = -2
            r3.<init>(r2, r4)
            r1.setLayoutParams(r3)
            r0.addView(r1)
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            r1.<init>(r5)
            r5.b = r1
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r2, r2)
            android.widget.FrameLayout r2 = r5.b
            r2.setLayoutParams(r1)
            android.widget.FrameLayout r1 = r5.b
            r0.addView(r1)
            return
    }

    private void b() {
            r4 = this;
            r0 = 0
            com.qq.e.comm.managers.a r1 = com.qq.e.comm.managers.a.b()     // Catch: java.lang.Throwable -> L6b
            com.qq.e.comm.managers.plugin.PM r1 = r1.c()     // Catch: java.lang.Throwable -> L6b
            com.qq.e.comm.pi.POFactory r1 = r1.getPOFactory()     // Catch: java.lang.Throwable -> L6b
            if (r1 != 0) goto L10
            goto L6d
        L10:
            android.content.Intent r2 = r4.getIntent()     // Catch: java.lang.Throwable -> L6b
            java.lang.Class r3 = r1.getClass()     // Catch: java.lang.Throwable -> L6b
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.Throwable -> L6b
            r2.setExtrasClassLoader(r3)     // Catch: java.lang.Throwable -> L6b
            android.os.Bundle r2 = r2.getExtras()     // Catch: java.lang.Throwable -> L6b
            if (r2 != 0) goto L26
            goto L6d
        L26:
            java.lang.String r3 = "gdt_activity_delegate_name"
            java.lang.String r0 = r2.getString(r3)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r3 = "appid"
            java.lang.String r2 = r2.getString(r3)     // Catch: java.lang.Throwable -> L6b
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L6b
            if (r3 != 0) goto L6d
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L6b
            if (r2 == 0) goto L3f
            goto L6d
        L3f:
            com.qq.e.comm.managers.a r2 = com.qq.e.comm.managers.a.b()     // Catch: java.lang.Throwable -> L6b
            boolean r2 = r2.d()     // Catch: java.lang.Throwable -> L6b
            if (r2 == 0) goto L6d
            com.qq.e.comm.pi.ACTD r1 = r1.getActivityDelegate(r0, r4)     // Catch: java.lang.Throwable -> L6b
            r4.a = r1     // Catch: java.lang.Throwable -> L6b
            if (r1 != 0) goto L6d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6b
            r1.<init>()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r2 = "创建 ADActivity Delegate "
            r1.append(r2)     // Catch: java.lang.Throwable -> L6b
            r1.append(r0)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r2 = " 失败"
            r1.append(r2)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L6b
            com.qq.e.comm.util.GDTLogger.e(r1)     // Catch: java.lang.Throwable -> L6b
            return
        L6b:
            r1 = move-exception
            goto L6e
        L6d:
            return
        L6e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "创建ADActivity Delegate"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = "发生异常"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.qq.e.comm.util.GDTLogger.e(r0, r1)
            return
    }

    @Override // android.app.Activity
    protected void onActivityResult(int r2, int r3, android.content.Intent r4) {
            r1 = this;
            super.onActivityResult(r2, r3, r4)
            com.qq.e.comm.pi.ACTD r0 = r1.a
            if (r0 == 0) goto La
            r0.onActivityResult(r2, r3, r4)
        La:
            return
    }

    @Override // android.app.Activity
    public void onBackPressed() {
            r1 = this;
            com.qq.e.comm.pi.ACTD r0 = r1.a
            if (r0 == 0) goto L7
            r0.onBackPressed()
        L7:
            return
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration r2) {
            r1 = this;
            super.onConfigurationChanged(r2)
            com.qq.e.comm.pi.ACTD r0 = r1.a
            if (r0 == 0) goto La
            r0.onConfigurationChanged(r2)
        La:
            return
    }

    @Override // android.app.Activity
    protected native void onCreate(android.os.Bundle r1);

    @Override // android.app.Activity
    protected void onDestroy() {
            r1 = this;
            super.onDestroy()
            com.qq.e.comm.pi.ACTD r0 = r1.a
            if (r0 == 0) goto La
            r0.onDestroy()
        La:
            return
    }

    @Override // android.app.Activity
    public void onPause() {
            r1 = this;
            com.qq.e.comm.pi.ACTD r0 = r1.a
            if (r0 == 0) goto L7
            r0.onPause()
        L7:
            super.onPause()
            return
    }

    @Override // android.app.Activity
    protected void onResume() {
            r1 = this;
            super.onResume()
            com.qq.e.comm.pi.ACTD r0 = r1.a
            if (r0 == 0) goto La
            r0.onResume()
        La:
            return
    }

    @Override // android.app.Activity
    protected void onStop() {
            r1 = this;
            com.qq.e.comm.pi.ACTD r0 = r1.a
            if (r0 == 0) goto L7
            r0.onStop()
        L7:
            super.onStop()
            return
    }

    @Override // android.app.Activity
    public void setContentView(int r4) {
            r3 = this;
            r3.a()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r3)
            android.widget.FrameLayout r1 = r3.b
            r2 = 1
            r0.inflate(r4, r1, r2)
            return
    }

    @Override // android.app.Activity
    public void setContentView(android.view.View r2) {
            r1 = this;
            r1.a()
            android.widget.FrameLayout r0 = r1.b
            r0.addView(r2)
            return
    }

    @Override // android.app.Activity
    public void setContentView(android.view.View r2, android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            r1.a()
            android.widget.FrameLayout r0 = r1.b
            r0.addView(r2, r3)
            return
    }
}
