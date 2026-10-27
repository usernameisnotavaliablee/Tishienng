package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class w2 extends android.content.BroadcastReceiver {
    public java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    public android.os.Handler f2847b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Runnable f2848c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements java.lang.Runnable {
        public final /* synthetic */ com.acse.ottn.w2 a;

        public a(com.acse.ottn.w2 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                com.acse.ottn.w2 r0 = r3.a     // Catch: java.lang.Exception -> L20
                java.lang.String r0 = r0.a     // Catch: java.lang.Exception -> L20
                android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch: java.lang.Exception -> L20
                android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Exception -> L20
                java.lang.String r2 = "android.intent.action.VIEW"
                r1.<init>(r2, r0)     // Catch: java.lang.Exception -> L20
                java.lang.String r0 = "android.intent.category.BROWSABLE"
                r1.addCategory(r0)     // Catch: java.lang.Exception -> L20
                r0 = 268435456(0x10000000, float:2.524355E-29)
                r1.addFlags(r0)     // Catch: java.lang.Exception -> L20
                android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()     // Catch: java.lang.Exception -> L20
                r0.startActivity(r1)     // Catch: java.lang.Exception -> L20
            L20:
                return
        }
    }

    public w2() {
            r1 = this;
            r1.<init>()
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r1.f2847b = r0
            com.acse.ottn.w2$a r0 = new com.acse.ottn.w2$a
            r0.<init>(r1)
            r1.f2848c = r0
            return
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context r3, android.content.Intent r4) {
            r2 = this;
            java.lang.String r3 = "url"
            java.lang.String r3 = r4.getStringExtra(r3)
            r2.a = r3
            android.os.Handler r3 = r2.f2847b
            java.lang.Runnable r4 = r2.f2848c
            r0 = 1000(0x3e8, double:4.94E-321)
            r3.postDelayed(r4, r0)
            return
    }
}
