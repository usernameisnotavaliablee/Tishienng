package com.bxkj.base.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class InstallUtil {
    private android.content.Context a;
    private java.io.File b;
    private android.app.AlertDialog c;
    boolean d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class UpdateActivityObserver implements androidx.lifecycle.LifecycleObserver {
        final /* synthetic */ com.bxkj.base.util.InstallUtil a;

        private UpdateActivityObserver(com.bxkj.base.util.InstallUtil r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ UpdateActivityObserver(com.bxkj.base.util.InstallUtil r1, com.bxkj.base.util.r r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @androidx.lifecycle.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_RESUME)
        public void onResume() {
                r1 = this;
                java.lang.String r0 = "UpdateApk->UpdateActivityObserver->"
                com.orhanobut.logger.j.c(r0)
                com.bxkj.base.util.InstallUtil r0 = r1.a
                r0.c()
                return
        }
    }

    public InstallUtil(android.content.Context r2, java.io.File r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.d = r0
            r1.a = r2
            r1.b = r3
            return
    }

    public static /* synthetic */ void a(com.bxkj.base.util.InstallUtil r0, android.content.DialogInterface r1, int r2) {
            r0.e(r1, r2)
            return
    }

    public static /* synthetic */ void b(com.bxkj.base.util.InstallUtil r0, int r1, android.content.Intent r2) {
            r0.d(r1, r2)
            return
    }

    private /* synthetic */ void d(int r1, android.content.Intent r2) {
            r0 = this;
            java.lang.String r1 = "UpdateApk->onActivityResult->"
            com.orhanobut.logger.j.c(r1)
            r0.c()
            return
    }

    private /* synthetic */ void e(android.content.DialogInterface r2, int r3) {
            r1 = this;
            android.content.Context r2 = r1.a
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            boolean r2 = com.beizi.ad.n.a(r2)
            if (r2 == 0) goto L10
            r1.g()
            return
        L10:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "package:"
            r2.append(r3)
            android.content.Context r3 = r1.a
            java.lang.String r3 = r3.getPackageName()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.net.Uri r2 = android.net.Uri.parse(r2)
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r0 = "android.settings.MANAGE_UNKNOWN_APP_SOURCES"
            r3.<init>(r0, r2)
            r2 = 268435456(0x10000000, float:2.524355E-29)
            r3.setFlags(r2)
            android.content.Context r2 = r1.a
            boolean r0 = r2 instanceof androidx.fragment.app.FragmentActivity
            if (r0 == 0) goto L5d
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            t.b r0 = new t.b
            r0.<init>(r2)
            t.b r3 = r0.startActivityForResult(r3)
            com.bxkj.base.util.p r0 = new com.bxkj.base.util.p
            r0.<init>(r1)
            r3.c(r0)
            androidx.lifecycle.Lifecycle r2 = r2.getLifecycle()
            com.bxkj.base.util.InstallUtil$UpdateActivityObserver r3 = new com.bxkj.base.util.InstallUtil$UpdateActivityObserver
            r0 = 0
            r3.<init>(r1, r0)
            r2.addObserver(r3)
        L5d:
            return
    }

    private void f() {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.VIEW"
            r0.<init>(r1)
            java.io.File r1 = r3.b
            android.net.Uri r1 = android.net.Uri.fromFile(r1)
            java.lang.String r2 = "application/vnd.android.package-archive"
            r0.setDataAndType(r1, r2)
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r0.addFlags(r1)
            android.content.Context r1 = r3.a
            r1.startActivity(r0)
            return
    }

    private void g() {
            r4 = this;
            boolean r0 = r4.d
            if (r0 == 0) goto L5
            return
        L5:
            android.content.Context r0 = r4.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            android.content.Context r2 = r4.a
            java.lang.String r2 = r2.getPackageName()
            r1.append(r2)
            java.lang.String r2 = ".provider"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.io.File r2 = r4.b
            android.net.Uri r0 = androidx.core.content.FileProvider.getUriForFile(r0, r1, r2)
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.VIEW"
            r1.<init>(r2)
            r2 = 268435456(0x10000000, float:2.524355E-29)
            r1.setFlags(r2)
            r2 = 1
            r1.addFlags(r2)
            java.lang.String r3 = "application/vnd.android.package-archive"
            r1.setDataAndType(r0, r3)
            android.content.Context r0 = r4.a
            r0.startActivity(r1)
            r4.d = r2
            return
    }

    @androidx.annotation.RequiresApi(api = 26)
    private void h() {
            r3 = this;
            android.app.AlertDialog r0 = r3.c
            if (r0 == 0) goto Lf
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto Lf
            android.app.AlertDialog r0 = r3.c
            r0.dismiss()
        Lf:
            android.content.Context r0 = r3.a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            boolean r0 = com.beizi.ad.n.a(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "startInstallO->isGranted="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.orhanobut.logger.j.c(r1)
            r3.g()
            if (r0 == 0) goto L36
            r3.g()
            return
        L36:
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            android.content.Context r1 = r3.a
            r0.<init>(r1)
            r1 = 0
            android.app.AlertDialog$Builder r0 = r0.setCancelable(r1)
            java.lang.String r1 = "安装应用需要打开未知来源权限，请去设置中开启权限"
            android.app.AlertDialog$Builder r0 = r0.setTitle(r1)
            com.bxkj.base.util.q r1 = new com.bxkj.base.util.q
            r1.<init>(r3)
            java.lang.String r2 = "确定"
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r2, r1)
            android.app.AlertDialog r0 = r0.show()
            r3.c = r0
            r1 = -2
            android.widget.Button r0 = r0.getButton(r1)
            com.bxkj.base.BaseApp r1 = com.bxkj.base.BaseApp.c()
            int r2 = com.bxkj.base.R.color.cardBlue
            int r1 = com.bxkj.base.util.o.a(r1, r2)
            r0.setTextColor(r1)
            android.app.AlertDialog r0 = r3.c
            r1 = -1
            android.widget.Button r0 = r0.getButton(r1)
            com.bxkj.base.BaseApp r1 = com.bxkj.base.BaseApp.c()
            int r1 = com.bxkj.base.util.o.a(r1, r2)
            r0.setTextColor(r1)
            return
    }

    public void c() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto La
            r2.g()
            return
        La:
            r1 = 26
            if (r0 < r1) goto L12
            r2.h()
            return
        L12:
            r1 = 24
            if (r0 < r1) goto L1a
            r2.g()
            return
        L1a:
            r2.f()
            return
    }
}
