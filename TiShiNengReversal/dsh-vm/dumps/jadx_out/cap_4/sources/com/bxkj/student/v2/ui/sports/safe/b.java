package com.bxkj.student.v2.ui.sports.safe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class b {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.student.v2.ui.sports.safe.b a = null;

    @org.jetbrains.annotations.NotNull
    private static java.lang.String b;

    static {
            com.bxkj.student.v2.ui.sports.safe.b r0 = new com.bxkj.student.v2.ui.sports.safe.b
            r0.<init>()
            com.bxkj.student.v2.ui.sports.safe.b.a = r0
            java.lang.String r0 = "系统检查到疑似模拟定位，已被系统记录，请【卸载虚拟定位软件】并【关闭开发者选项】后再试"
            com.bxkj.student.v2.ui.sports.safe.b.b = r0
            return
    }

    private b() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = com.bxkj.student.v2.ui.sports.safe.b.b
            return r0
    }

    public final boolean b() {
            r3 = this;
            com.bxkj.student.App$a r0 = com.bxkj.student.App.d
            com.bxkj.student.App r0 = r0.a()
            android.content.ContentResolver r0 = r0.getContentResolver()
            java.lang.String r1 = "development_settings_enabled"
            r2 = 0
            int r0 = android.provider.Settings.Secure.getInt(r0, r1, r2)
            if (r0 <= 0) goto L15
            r0 = 1
            return r0
        L15:
            return r2
    }

    public final void c() {
            r2 = this;
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.settings.APPLICATION_DEVELOPMENT_SETTINGS"
            r0.<init>(r1)
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r0.setFlags(r1)
            com.bxkj.student.App$a r1 = com.bxkj.student.App.d
            com.bxkj.student.App r1 = r1.a()
            r1.startActivity(r0)
            return
    }

    public final void d(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            com.bxkj.student.v2.ui.sports.safe.b.b = r2
            return
    }
}
