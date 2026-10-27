package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a0 extends androidx.appcompat.app.AppCompatActivity {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f2056d = "BaseActivity";
    public android.widget.Toast a;

    /* renamed from: b, reason: collision with root package name */
    public long f2057b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.appcompat.app.AppCompatActivity f2058c;

    public a0() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f2057b = r0
            return
    }

    public static boolean a(android.app.Activity r4) {
            r0 = 0
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            java.lang.String r2 = "mActivityInfo"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.Exception -> L1a
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.Exception -> L1a
            java.lang.Object r4 = r1.get(r4)     // Catch: java.lang.Exception -> L1a
            android.content.pm.ActivityInfo r4 = (android.content.pm.ActivityInfo) r4     // Catch: java.lang.Exception -> L1a
            r3 = -1
            r4.screenOrientation = r3     // Catch: java.lang.Exception -> L1a
            r1.setAccessible(r0)     // Catch: java.lang.Exception -> L1a
            return r2
        L1a:
            return r0
    }

    public static boolean b(android.app.Activity r7) {
            r0 = 0
            java.lang.String r1 = "com.android.internal.R$styleable"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L3d
            java.lang.String r2 = "Window"
            java.lang.reflect.Field r1 = r1.getField(r2)     // Catch: java.lang.Exception -> L3d
            r2 = 0
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Exception -> L3d
            int[] r1 = (int[]) r1     // Catch: java.lang.Exception -> L3d
            android.content.res.TypedArray r7 = r7.obtainStyledAttributes(r1)     // Catch: java.lang.Exception -> L3d
            java.lang.Class<android.content.pm.ActivityInfo> r1 = android.content.pm.ActivityInfo.class
            java.lang.String r3 = "isTranslucentOrFloating"
            r4 = 1
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L3d
            java.lang.Class<android.content.res.TypedArray> r6 = android.content.res.TypedArray.class
            r5[r0] = r6     // Catch: java.lang.Exception -> L3d
            java.lang.reflect.Method r1 = r1.getMethod(r3, r5)     // Catch: java.lang.Exception -> L3d
            r1.setAccessible(r4)     // Catch: java.lang.Exception -> L3d
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L3d
            r3[r0] = r7     // Catch: java.lang.Exception -> L3d
            java.lang.Object r7 = r1.invoke(r2, r3)     // Catch: java.lang.Exception -> L3d
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Exception -> L3d
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Exception -> L3d
            r1.setAccessible(r0)     // Catch: java.lang.Exception -> L3c
            return r7
        L3c:
            r0 = r7
        L3d:
            return r0
    }

    public void a() {
            r2 = this;
            r2.finish()
            int r0 = com.acse.ottn.R.anim.slide_in_from_left
            int r1 = com.acse.ottn.R.anim.slide_out_from_right
            r2.overridePendingTransition(r0, r1)
            com.acse.ottn.q.c(r2)
            return
    }

    public void a(int r3) {
            r2 = this;
            android.view.Window r0 = r2.getWindow()
            r1 = 0
            r2.a(r2, r3, r1)
            r3 = 2048(0x800, float:2.87E-42)
            r0.addFlags(r3)
            r3 = 1024(0x400, float:1.435E-42)
            r0.clearFlags(r3)
            android.view.View r3 = r0.getDecorView()
            r0 = 1280(0x500, float:1.794E-42)
            r3.setSystemUiVisibility(r0)
            return
    }

    public void a(android.app.Activity r1, @androidx.annotation.ColorInt int r2, @androidx.annotation.IntRange(from = 0, to = 255) int r3) {
            r0 = this;
            com.acse.ottn.m4.b(r1, r2, r3)
            return
    }

    public void a(android.content.Intent r2) {
            r1 = this;
            r1.finish()
            com.acse.ottn.q.c(r1)
            r1.c(r2)
            int r2 = com.acse.ottn.R.anim.slide_in_from_left
            int r0 = com.acse.ottn.R.anim.slide_out_from_right
            r1.overridePendingTransition(r2, r0)
            return
    }

    public void a(android.content.Intent r1, int r2) {
            r0 = this;
            com.acse.ottn.q.c(r0)
            r0.startActivityForResult(r1, r2)
            int r1 = com.acse.ottn.R.anim.slide_in_from_right
            int r2 = com.acse.ottn.R.anim.slide_out_from_left
            r0.overridePendingTransition(r1, r2)
            return
    }

    public void a(androidx.appcompat.app.AppCompatActivity r1) {
            r0 = this;
            r0.f2058c = r1
            return
    }

    public void a(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L10
            android.view.Window r2 = r1.getWindow()
            android.view.View r2 = r2.getDecorView()
            r0 = 1024(0x400, float:1.435E-42)
            r2.setSystemUiVisibility(r0)
            return
        L10:
            android.view.Window r2 = r1.getWindow()
            android.view.View r2 = r2.getDecorView()
            r0 = 9216(0x2400, float:1.2914E-41)
            r2.setSystemUiVisibility(r0)
            return
    }

    public void b() {
            r2 = this;
            r2.finish()
            int r0 = com.acse.ottn.R.anim.slide_in_from_bottom
            int r1 = com.acse.ottn.R.anim.slide_out_from_top
            r2.overridePendingTransition(r0, r1)
            com.acse.ottn.q.c(r2)
            return
    }

    public void b(android.content.Intent r2) {
            r1 = this;
            com.acse.ottn.q.c(r1)
            r1.startActivity(r2)
            int r2 = com.acse.ottn.R.anim.slide_in_from_bottom
            int r0 = com.acse.ottn.R.anim.slide_out_from_top
            r1.overridePendingTransition(r2, r0)
            return
    }

    public void c(android.content.Intent r2) {
            r1 = this;
            com.acse.ottn.q.c(r1)
            r1.startActivity(r2)
            int r2 = com.acse.ottn.R.anim.slide_in_from_right
            int r0 = com.acse.ottn.R.anim.slide_out_from_left
            r1.overridePendingTransition(r2, r0)
            return
    }

    public void onBackPressed() {
            r2 = this;
            androidx.appcompat.app.AppCompatActivity r0 = r2.f2058c
            if (r0 == 0) goto L19
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.MAIN"
            r0.<init>(r1)
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r0.setFlags(r1)
            java.lang.String r1 = "android.intent.category.HOME"
            r0.addCategory(r1)
            r2.startActivity(r0)
            return
        L19:
            r2.a()
            return
    }

    public void onCreate(android.os.Bundle r2) {
            r1 = this;
            boolean r0 = b(r1)
            if (r0 == 0) goto L9
            a(r1)
        L9:
            super/*androidx.fragment.app.FragmentActivity*/.onCreate(r2)
            r2 = 1
            r1.setRequestedOrientation(r2)
            return
    }

    public void onDestroy() {
            r1 = this;
            android.widget.Toast r0 = r1.a
            if (r0 == 0) goto La
            r0.cancel()
            r0 = 0
            r1.a = r0
        La:
            super.onDestroy()
            return
    }

    public void onPause() {
            r1 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onPause()
            android.widget.Toast r0 = r1.a
            if (r0 == 0) goto Ld
            r0.cancel()
            r0 = 0
            r1.a = r0
        Ld:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            com.acse.ottn.p.l = r0
            return
    }

    public void onResume() {
            r1 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onResume()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            com.acse.ottn.p.l = r0
            return
    }

    public void onStart() {
            r5 = this;
            super.onStart()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "max:"
            r0.append(r1)
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()
            long r1 = r1.maxMemory()
            r3 = 1024(0x400, double:5.06E-321)
            long r1 = r1 / r3
            long r1 = r1 / r3
            r0.append(r1)
            java.lang.String r1 = " total:"
            r0.append(r1)
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()
            long r1 = r1.totalMemory()
            long r1 = r1 / r3
            long r1 = r1 / r3
            r0.append(r1)
            java.lang.String r1 = " free:"
            r0.append(r1)
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()
            long r1 = r1.freeMemory()
            long r1 = r1 / r3
            long r1 = r1 / r3
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Memory"
            com.acse.ottn.h2.b(r1, r0)
            return
    }

    public void setRequestedOrientation(int r2) {
            r1 = this;
            boolean r0 = b(r1)
            if (r0 == 0) goto L7
            return
        L7:
            super/*android.app.Activity*/.setRequestedOrientation(r2)
            return
    }
}
