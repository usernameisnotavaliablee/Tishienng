package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class l2 {

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f2442g = "MyAccessibilityService";
    public boolean a;

    /* renamed from: b, reason: collision with root package name */
    public android.os.Handler f2443b;

    /* renamed from: c, reason: collision with root package name */
    public android.accessibilityservice.AccessibilityService f2444c;

    /* renamed from: d, reason: collision with root package name */
    public android.accessibilityservice.AccessibilityServiceInfo f2445d;

    /* renamed from: e, reason: collision with root package name */
    public android.app.admin.DevicePolicyManager f2446e;

    /* renamed from: f, reason: collision with root package name */
    public com.acse.ottn.b4 f2447f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements android.os.Handler.Callback {
        public final /* synthetic */ com.acse.ottn.l2 a;

        public a(com.acse.ottn.l2 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message r3) {
                r2 = this;
                int r3 = r3.what
                r0 = 1
                if (r3 == r0) goto L6
                goto L17
            L6:
                int r3 = android.os.Build.VERSION.SDK_INT
                r1 = 28
                if (r3 < r1) goto L17
                com.acse.ottn.l2 r3 = r2.a
                android.accessibilityservice.AccessibilityService r3 = com.acse.ottn.l2.a(r3)
                r1 = 8
                r3.performGlobalAction(r1)
            L17:
                return r0
        }
    }

    public l2(android.accessibilityservice.AccessibilityService r1) {
            r0 = this;
            r0.<init>()
            r0.f2444c = r1
            return
    }

    public static /* synthetic */ android.accessibilityservice.AccessibilityService a(com.acse.ottn.l2 r0) {
            android.accessibilityservice.AccessibilityService r0 = r0.f2444c
            return r0
    }

    public void a() {
            r4 = this;
            android.accessibilityservice.AccessibilityService r0 = r4.f2444c     // Catch: java.lang.Throwable -> L62
            java.lang.String r1 = "device_policy"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> L62
            android.app.admin.DevicePolicyManager r0 = (android.app.admin.DevicePolicyManager) r0     // Catch: java.lang.Throwable -> L62
            r4.f2446e = r0     // Catch: java.lang.Throwable -> L62
            android.accessibilityservice.AccessibilityService r0 = r4.f2444c     // Catch: java.lang.Throwable -> L62
            android.accessibilityservice.AccessibilityServiceInfo r0 = r0.getServiceInfo()     // Catch: java.lang.Throwable -> L62
            r4.f2445d = r0     // Catch: java.lang.Throwable -> L62
            com.acse.ottn.b4 r0 = new com.acse.ottn.b4     // Catch: java.lang.Throwable -> L62
            android.accessibilityservice.AccessibilityService r1 = r4.f2444c     // Catch: java.lang.Throwable -> L62
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L62
            r4.f2447f = r0     // Catch: java.lang.Throwable -> L62
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L62
            r1 = 28
            if (r0 >= r1) goto L37
            android.app.admin.DevicePolicyManager r0 = r4.f2446e     // Catch: java.lang.Throwable -> L62
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L62
            android.accessibilityservice.AccessibilityService r2 = r4.f2444c     // Catch: java.lang.Throwable -> L62
            java.lang.Class<com.acse.ottn.receiver.MyDeviceAdminReceiver> r3 = com.acse.ottn.receiver.MyDeviceAdminReceiver.class
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L62
            boolean r0 = r0.isAdminActive(r1)     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L35
            goto L37
        L35:
            r0 = 0
            goto L38
        L37:
            r0 = 1
        L38:
            r4.a = r0     // Catch: java.lang.Throwable -> L62
            android.accessibilityservice.AccessibilityServiceInfo r1 = r4.f2445d     // Catch: java.lang.Throwable -> L62
            int r2 = r1.eventTypes     // Catch: java.lang.Throwable -> L62
            r2 = r2 | 32
            r1.eventTypes = r2     // Catch: java.lang.Throwable -> L62
            int r2 = r1.flags     // Catch: java.lang.Throwable -> L62
            r2 = r2 | 32
            r1.flags = r2     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L4f
            com.acse.ottn.b4 r0 = r4.f2447f     // Catch: java.lang.Throwable -> L62
            r0.a()     // Catch: java.lang.Throwable -> L62
        L4f:
            android.accessibilityservice.AccessibilityService r0 = r4.f2444c     // Catch: java.lang.Throwable -> L62
            android.accessibilityservice.AccessibilityServiceInfo r1 = r4.f2445d     // Catch: java.lang.Throwable -> L62
            r0.setServiceInfo(r1)     // Catch: java.lang.Throwable -> L62
            android.os.Handler r0 = new android.os.Handler     // Catch: java.lang.Throwable -> L62
            com.acse.ottn.l2$a r1 = new com.acse.ottn.l2$a     // Catch: java.lang.Throwable -> L62
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L62
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L62
            r4.f2443b = r0     // Catch: java.lang.Throwable -> L62
        L62:
            return
    }
}
