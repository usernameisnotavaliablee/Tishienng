package com.acse.ottn.receiver;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class HomeKeyReceiver extends android.content.BroadcastReceiver {
    public final java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f2629b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f2630c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2631d;

    /* renamed from: e, reason: collision with root package name */
    public android.os.Handler f2632e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Runnable f2633f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements java.lang.Runnable {
        public final /* synthetic */ com.acse.ottn.receiver.HomeKeyReceiver a;

        public a(com.acse.ottn.receiver.HomeKeyReceiver r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                com.acse.ottn.receiver.HomeKeyReceiver r0 = r2.a
                r1 = 0
                com.acse.ottn.receiver.HomeKeyReceiver.a(r0, r1)
                return
        }
    }

    public HomeKeyReceiver() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "reason"
            r1.a = r0
            java.lang.String r0 = "recentapps"
            r1.f2629b = r0
            java.lang.String r0 = "homekey"
            r1.f2630c = r0
            r0 = 0
            r1.f2631d = r0
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r1.f2632e = r0
            com.acse.ottn.receiver.HomeKeyReceiver$a r0 = new com.acse.ottn.receiver.HomeKeyReceiver$a
            r0.<init>(r1)
            r1.f2633f = r0
            return
    }

    public static /* synthetic */ boolean a(com.acse.ottn.receiver.HomeKeyReceiver r0, boolean r1) {
            r0.f2631d = r1
            return r1
    }

    public final void a(android.content.Context r8) {
            r7 = this;
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            if (r0 != 0) goto L13
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r1 = "setting_day"
            boolean r0 = r0.a(r1)
            if (r0 == 0) goto L13
            goto L6b
        L13:
            boolean r0 = r7.f2631d
            if (r0 == 0) goto L18
            goto L6b
        L18:
            r0 = 1
            r7.f2631d = r0
            android.os.Handler r0 = r7.f2632e
            java.lang.Runnable r1 = r7.f2633f
            r2 = 3000(0xbb8, double:1.482E-320)
            r0.postDelayed(r1, r2)
            com.acse.ottn.s0 r0 = com.acse.ottn.s0.d()
            java.lang.String r0 = r0.a()
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            java.lang.String r2 = "am_show_seed_dialog"
            java.lang.String r1 = r1.e(r2)
            com.acse.ottn.n3 r3 = com.acse.ottn.n3.a()
            java.lang.String r4 = "pm_show_seed_dialog"
            java.lang.String r3 = r3.e(r4)
            com.acse.ottn.s0 r5 = com.acse.ottn.s0.d()
            int r5 = r5.b()
            r6 = 1400(0x578, float:1.962E-42)
            if (r5 < r6) goto L5c
            boolean r1 = r0.equals(r3)
            if (r1 != 0) goto L6b
            if (r5 < r6) goto L6b
            r1 = 2100(0x834, float:2.943E-42)
            if (r5 >= r1) goto L6b
            r7.a(r8, r4, r0)
            return
        L5c:
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L6b
            r1 = 800(0x320, float:1.121E-42)
            if (r5 < r1) goto L6b
            if (r5 >= r6) goto L6b
            r7.a(r8, r2, r0)
        L6b:
            return
    }

    public final void a(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            return
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context r3, android.content.Intent r4) {
            r2 = this;
            java.lang.String r0 = r4.getAction()
            java.lang.String r1 = "android.intent.action.CLOSE_SYSTEM_DIALOGS"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L2c
            java.lang.String r0 = "reason"
            java.lang.String r4 = r4.getStringExtra(r0)
            if (r4 == 0) goto L2c
            java.lang.String r0 = "homekey"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L20
            r2.a(r3)
            return
        L20:
            java.lang.String r0 = "recentapps"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L29
            goto L2c
        L29:
            r2.a(r3)
        L2c:
            return
    }
}
