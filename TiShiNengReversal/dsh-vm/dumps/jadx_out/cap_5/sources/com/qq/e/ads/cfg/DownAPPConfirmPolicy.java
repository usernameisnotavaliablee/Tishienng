package com.qq.e.ads.cfg;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public enum DownAPPConfirmPolicy extends java.lang.Enum<com.qq.e.ads.cfg.DownAPPConfirmPolicy> {
    public static final com.qq.e.ads.cfg.DownAPPConfirmPolicy Default = null;
    public static final com.qq.e.ads.cfg.DownAPPConfirmPolicy NOConfirm = null;
    private static final /* synthetic */ com.qq.e.ads.cfg.DownAPPConfirmPolicy[] b = null;
    private final int a;

    static {
            com.qq.e.ads.cfg.DownAPPConfirmPolicy r0 = new com.qq.e.ads.cfg.DownAPPConfirmPolicy
            java.lang.String r1 = "Default"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.qq.e.ads.cfg.DownAPPConfirmPolicy.Default = r0
            com.qq.e.ads.cfg.DownAPPConfirmPolicy r0 = new com.qq.e.ads.cfg.DownAPPConfirmPolicy
            r1 = 1
            r2 = 2
            java.lang.String r3 = "NOConfirm"
            r0.<init>(r3, r1, r2)
            com.qq.e.ads.cfg.DownAPPConfirmPolicy.NOConfirm = r0
            com.qq.e.ads.cfg.DownAPPConfirmPolicy[] r0 = a()
            com.qq.e.ads.cfg.DownAPPConfirmPolicy.b = r0
            return
    }

    DownAPPConfirmPolicy(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.a = r3
            return
    }

    private static /* synthetic */ com.qq.e.ads.cfg.DownAPPConfirmPolicy[] a() {
            r0 = 2
            com.qq.e.ads.cfg.DownAPPConfirmPolicy[] r0 = new com.qq.e.ads.cfg.DownAPPConfirmPolicy[r0]
            com.qq.e.ads.cfg.DownAPPConfirmPolicy r1 = com.qq.e.ads.cfg.DownAPPConfirmPolicy.Default
            r2 = 0
            r0[r2] = r1
            com.qq.e.ads.cfg.DownAPPConfirmPolicy r1 = com.qq.e.ads.cfg.DownAPPConfirmPolicy.NOConfirm
            r2 = 1
            r0[r2] = r1
            return r0
    }

    public static com.qq.e.ads.cfg.DownAPPConfirmPolicy valueOf(java.lang.String r1) {
            java.lang.Class<com.qq.e.ads.cfg.DownAPPConfirmPolicy> r0 = com.qq.e.ads.cfg.DownAPPConfirmPolicy.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.qq.e.ads.cfg.DownAPPConfirmPolicy r1 = (com.qq.e.ads.cfg.DownAPPConfirmPolicy) r1
            return r1
    }

    public static com.qq.e.ads.cfg.DownAPPConfirmPolicy[] values() {
            com.qq.e.ads.cfg.DownAPPConfirmPolicy[] r0 = com.qq.e.ads.cfg.DownAPPConfirmPolicy.b
            java.lang.Object r0 = r0.clone()
            com.qq.e.ads.cfg.DownAPPConfirmPolicy[] r0 = (com.qq.e.ads.cfg.DownAPPConfirmPolicy[]) r0
            return r0
    }

    public int value() {
            r1 = this;
            int r0 = r1.a
            return r0
    }
}
