package com.bxkj.base.v2.netty4android.client.heart;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class a {

    @org.jetbrains.annotations.NotNull
    private final android.content.Context a;
    private final long b;

    @org.jetbrains.annotations.Nullable
    private final android.app.AlarmManager c;

    @org.jetbrains.annotations.Nullable
    private final android.app.PendingIntent d;

    public a(@org.jetbrains.annotations.NotNull android.content.Context r3) {
            r2 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r3, r0)
            r2.<init>()
            r2.a = r3
            r0 = 10000(0x2710, double:4.9407E-320)
            r2.b = r0
            java.lang.String r0 = "alarm"
            java.lang.Object r0 = r3.getSystemService(r0)
            java.lang.String r1 = "null cannot be cast to non-null type android.app.AlarmManager"
            kotlin.jvm.internal.g0.n(r0, r1)
            android.app.AlarmManager r0 = (android.app.AlarmManager) r0
            r2.c = r0
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.bxkj.base.v2.netty4android.client.heart.AlarmNettyService> r1 = com.bxkj.base.v2.netty4android.client.heart.AlarmNettyService.class
            r0.<init>(r3, r1)
            r1 = 0
            android.app.PendingIntent r3 = android.app.PendingIntent.getService(r3, r1, r0, r1)
            r2.d = r3
            return
    }

    public final void a() {
            r2 = this;
            android.app.AlarmManager r0 = r2.c
            if (r0 == 0) goto Lb
            android.app.PendingIntent r1 = r2.d
            if (r1 == 0) goto Lb
            r0.cancel(r1)
        Lb:
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    public final void b() {
            r7 = this;
            r7.a()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            r2 = 0
            if (r0 < r1) goto L1c
            android.app.AlarmManager r0 = r7.c
            kotlin.jvm.internal.g0.m(r0)
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r7.b
            long r3 = r3 + r5
            android.app.PendingIntent r1 = r7.d
            com.bxkj.base.chat.heart.a.a(r0, r2, r3, r1)
            return
        L1c:
            android.app.AlarmManager r0 = r7.c
            kotlin.jvm.internal.g0.m(r0)
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r7.b
            long r3 = r3 + r5
            android.app.PendingIntent r1 = r7.d
            r0.setExact(r2, r3, r1)
            return
    }
}
