package com.bxkj.base.v2.common.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class h0 {

    @org.jetbrains.annotations.NotNull
    private final android.app.Activity a;

    public h0(@org.jetbrains.annotations.NotNull android.app.Activity r2) {
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            return
    }

    private final void a(long r6, long r8) {
            r5 = this;
            android.app.Activity r0 = r5.a
            java.lang.String r1 = "vibrator"
            java.lang.Object r0 = r0.getSystemService(r1)
            java.lang.String r1 = "null cannot be cast to non-null type android.os.Vibrator"
            kotlin.jvm.internal.g0.n(r0, r1)
            android.os.Vibrator r0 = (android.os.Vibrator) r0
            boolean r1 = r0.hasVibrator()
            r2 = 0
            if (r1 == 0) goto L49
            r1 = 3
            long[] r1 = new long[r1]
            r3 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r6
            r6 = 2
            r1[r6] = r8
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 26
            if (r6 < r7) goto L44
            android.os.VibrationEffect r6 = com.bxkj.base.v2.common.utils.f0.a(r1, r2)
            android.media.AudioAttributes$Builder r7 = new android.media.AudioAttributes$Builder
            r7.<init>()
            r8 = 4
            android.media.AudioAttributes$Builder r7 = r7.setContentType(r8)
            r8 = 5
            android.media.AudioAttributes$Builder r7 = r7.setUsage(r8)
            android.media.AudioAttributes r7 = r7.build()
            com.bxkj.base.v2.common.utils.g0.a(r0, r6, r7)
            return
        L44:
            r6 = -1
            r0.vibrate(r1, r6)
            return
        L49:
            java.lang.String r6 = "手机不支持震动功能->VibrateManager->Device does not support vibration."
            java.lang.Object[] r7 = new java.lang.Object[r2]
            com.orhanobut.logger.j.m(r6, r7)
            return
    }

    public final void b() {
            r4 = this;
            r0 = 1000(0x3e8, double:4.94E-321)
            r2 = 2000(0x7d0, double:9.88E-321)
            r4.a(r0, r2)
            return
    }

    public final void c() {
            r2 = this;
            android.app.Activity r0 = r2.a
            java.lang.String r1 = "vibrator"
            java.lang.Object r0 = r0.getSystemService(r1)
            java.lang.String r1 = "null cannot be cast to non-null type android.os.Vibrator"
            kotlin.jvm.internal.g0.n(r0, r1)
            android.os.Vibrator r0 = (android.os.Vibrator) r0
            r0.cancel()
            return
    }
}
