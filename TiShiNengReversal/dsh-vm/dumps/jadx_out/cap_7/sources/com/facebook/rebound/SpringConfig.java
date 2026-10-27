package com.facebook.rebound;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class SpringConfig {
    public static com.facebook.rebound.SpringConfig c;
    public double a;
    public double b;

    static {
            r0 = 4630826316843712512(0x4044000000000000, double:40.0)
            r2 = 4619567317775286272(0x401c000000000000, double:7.0)
            com.facebook.rebound.SpringConfig r0 = b(r0, r2)
            com.facebook.rebound.SpringConfig.c = r0
            return
    }

    public SpringConfig(double r1, double r3) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.a = r3
            return
    }

    public static com.facebook.rebound.SpringConfig a(double r1, double r3) {
            com.facebook.rebound.BouncyConversion r0 = new com.facebook.rebound.BouncyConversion
            r0.<init>(r3, r1)
            double r1 = r0.g()
            double r3 = r0.f()
            com.facebook.rebound.SpringConfig r1 = b(r1, r3)
            return r1
    }

    public static com.facebook.rebound.SpringConfig b(double r1, double r3) {
            com.facebook.rebound.SpringConfig r0 = new com.facebook.rebound.SpringConfig
            double r1 = com.facebook.rebound.OrigamiValueConverter.d(r1)
            double r3 = com.facebook.rebound.OrigamiValueConverter.a(r3)
            r0.<init>(r1, r3)
            return r0
    }
}
