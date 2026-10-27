package com.scwang.smartrefresh.header.waveswipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a {
    private a() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean a(android.content.Context r1) {
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r0 = r1.widthPixels
            float r0 = (float) r0
            float r1 = r1.density
            float r0 = r0 / r1
            r1 = 1142292480(0x44160000, float:600.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 < 0) goto L16
            r1 = 1
            return r1
        L16:
            r1 = 0
            return r1
    }
}
