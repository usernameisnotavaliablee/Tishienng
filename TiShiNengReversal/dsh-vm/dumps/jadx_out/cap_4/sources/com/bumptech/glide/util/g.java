package com.bumptech.glide.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class g {
    private static final double a = 0.0d;

    static {
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
            r2 = 4618441417868443648(0x4018000000000000, double:6.0)
            double r0 = java.lang.Math.pow(r0, r2)
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = r2 / r0
            com.bumptech.glide.util.g.a = r2
            return
    }

    private g() {
            r0 = this;
            r0.<init>()
            return
    }

    public static double a(long r2) {
            long r0 = b()
            long r0 = r0 - r2
            double r2 = (double) r0
            double r0 = com.bumptech.glide.util.g.a
            double r2 = r2 * r0
            return r2
    }

    @android.annotation.TargetApi(17)
    public static long b() {
            long r0 = android.os.SystemClock.elapsedRealtimeNanos()
            return r0
    }
}
