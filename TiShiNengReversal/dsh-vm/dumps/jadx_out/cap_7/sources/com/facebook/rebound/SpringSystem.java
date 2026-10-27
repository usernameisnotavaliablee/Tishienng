package com.facebook.rebound;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class SpringSystem extends com.facebook.rebound.BaseSpringSystem {
    private SpringSystem(com.facebook.rebound.SpringLooper r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static com.facebook.rebound.SpringSystem m() {
            com.facebook.rebound.SpringSystem r0 = new com.facebook.rebound.SpringSystem
            com.facebook.rebound.SpringLooper r1 = com.facebook.rebound.AndroidSpringLooperFactory.a()
            r0.<init>(r1)
            return r0
    }
}
