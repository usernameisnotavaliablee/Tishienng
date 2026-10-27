package com.baidu.liantian.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class l {

    /* renamed from: c, reason: collision with root package name */
    private static final com.baidu.liantian.b.l f5925c = null;
    private android.os.HandlerThread a;

    /* renamed from: b, reason: collision with root package name */
    private android.os.Handler f5926b;

    static {
            com.baidu.liantian.b.l r0 = new com.baidu.liantian.b.l
            r0.<init>()
            com.baidu.liantian.b.l.f5925c = r0
            return
    }

    private l() {
            r3 = this;
            r3.<init>()
            android.os.HandlerThread r0 = new android.os.HandlerThread
            java.lang.String r1 = "rp_th"
            r2 = 10
            r0.<init>(r1, r2)
            r3.a = r0
            r0.start()
            android.os.Handler r0 = new android.os.Handler
            android.os.HandlerThread r1 = r3.a
            android.os.Looper r1 = r1.getLooper()
            r0.<init>(r1)
            r3.f5926b = r0
            return
    }

    public static android.os.Looper a() {
            com.baidu.liantian.b.l r0 = com.baidu.liantian.b.l.f5925c
            android.os.Handler r0 = r0.f5926b
            android.os.Looper r0 = r0.getLooper()
            return r0
    }
}
