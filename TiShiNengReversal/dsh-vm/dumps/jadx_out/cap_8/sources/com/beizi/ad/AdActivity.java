package com.beizi.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class AdActivity extends android.app.Activity {
    public static boolean a;

    /* renamed from: b, reason: collision with root package name */
    static java.lang.Class f6422b;

    /* renamed from: c, reason: collision with root package name */
    private com.beizi.ad.AdActivity.a f6423c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.beizi.ad.AdActivity$1, reason: invalid class name */
    class AnonymousClass1 implements java.lang.Runnable {
        final /* synthetic */ com.beizi.ad.AdActivity a;

        AnonymousClass1(com.beizi.ad.AdActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r5 = this;
                r0 = 0
                r1 = 0
            L2:
                r2 = 3
                if (r1 == r2) goto L1a
                int r1 = r1 + 1
                boolean r3 = com.beizi.ad.AdActivity.a
                r4 = 1
                if (r3 != r4) goto L14
                com.beizi.ad.AdActivity.a = r0
                com.beizi.ad.AdActivity r1 = r5.a
                r1.finish()
                r1 = 3
            L14:
                r2 = 500(0x1f4, double:2.47E-321)
                android.os.SystemClock.sleep(r2)
                goto L2
            L1a:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.beizi.ad.AdActivity$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a = null;

        static {
                com.beizi.ad.AdActivity$b[] r0 = com.beizi.ad.AdActivity.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.beizi.ad.AdActivity.AnonymousClass2.a = r0
                com.beizi.ad.AdActivity$b r1 = com.beizi.ad.AdActivity.b.f6425c     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.beizi.ad.AdActivity.AnonymousClass2.a     // Catch: java.lang.NoSuchFieldError -> L1d
                com.beizi.ad.AdActivity$b r1 = com.beizi.ad.AdActivity.b.f6424b     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.beizi.ad.AdActivity.AnonymousClass2.a     // Catch: java.lang.NoSuchFieldError -> L28
                com.beizi.ad.AdActivity$b r1 = com.beizi.ad.AdActivity.b.a     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }

        public AnonymousClass2() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void a();

        void b();

        void c();

        void d();

        void e();

        android.webkit.WebView f();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum b extends java.lang.Enum<com.beizi.ad.AdActivity.b> {
        public static final com.beizi.ad.AdActivity.b a = null;

        /* renamed from: b, reason: collision with root package name */
        public static final com.beizi.ad.AdActivity.b f6424b = null;

        /* renamed from: c, reason: collision with root package name */
        public static final com.beizi.ad.AdActivity.b f6425c = null;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ com.beizi.ad.AdActivity.b[] f6426d = null;

        static {
                com.beizi.ad.AdActivity$b r0 = new com.beizi.ad.AdActivity$b
                java.lang.String r1 = "portrait"
                r2 = 0
                r0.<init>(r1, r2)
                com.beizi.ad.AdActivity.b.a = r0
                com.beizi.ad.AdActivity$b r1 = new com.beizi.ad.AdActivity$b
                java.lang.String r3 = "landscape"
                r4 = 1
                r1.<init>(r3, r4)
                com.beizi.ad.AdActivity.b.f6424b = r1
                com.beizi.ad.AdActivity$b r3 = new com.beizi.ad.AdActivity$b
                java.lang.String r5 = "none"
                r6 = 2
                r3.<init>(r5, r6)
                com.beizi.ad.AdActivity.b.f6425c = r3
                r5 = 3
                com.beizi.ad.AdActivity$b[] r5 = new com.beizi.ad.AdActivity.b[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                com.beizi.ad.AdActivity.b.f6426d = r5
                return
        }

        b(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.beizi.ad.AdActivity.b valueOf(java.lang.String r1) {
                java.lang.Class<com.beizi.ad.AdActivity$b> r0 = com.beizi.ad.AdActivity.b.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.beizi.ad.AdActivity$b r1 = (com.beizi.ad.AdActivity.b) r1
                return r1
        }

        public static com.beizi.ad.AdActivity.b[] values() {
                com.beizi.ad.AdActivity$b[] r0 = com.beizi.ad.AdActivity.b.f6426d
                java.lang.Object r0 = r0.clone()
                com.beizi.ad.AdActivity$b[] r0 = (com.beizi.ad.AdActivity.b[]) r0
                return r0
        }
    }

    static {
            r0 = 12951(0x3297, float:1.8148E-41)
            com.stub.StubApp.interface11(r0)
            java.lang.Class<com.beizi.ad.AdActivity> r0 = com.beizi.ad.AdActivity.class
            com.beizi.ad.AdActivity.f6422b = r0
            return
    }

    public AdActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.Class a() {
            java.lang.Class r0 = com.beizi.ad.AdActivity.f6422b
            return r0
    }

    public static void a(android.app.Activity r1) {
            android.content.res.Resources r0 = r1.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.orientation
            b(r1, r0)
            return
    }

    public static void a(android.app.Activity r0, int r1) {
            b(r0, r1)
            return
    }

    public static void a(android.app.Activity r3, com.beizi.ad.AdActivity.b r4) {
            android.content.res.Resources r0 = r3.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.orientation
            int[] r1 = com.beizi.ad.AdActivity.AnonymousClass2.a
            int r4 = r4.ordinal()
            r4 = r1[r4]
            r1 = 1
            if (r4 == r1) goto L23
            r2 = 2
            if (r4 == r2) goto L1e
            r2 = 3
            if (r4 == r2) goto L1c
            goto L1f
        L1c:
            r0 = 1
            goto L1f
        L1e:
            r0 = 2
        L1f:
            b(r3, r0)
            return
        L23:
            r4 = -1
            r3.setRequestedOrientation(r4)
            return
    }

    public static void b(android.app.Activity r1) {
            r0 = -1
            r1.setRequestedOrientation(r0)
            return
    }

    @android.annotation.TargetApi(9)
    private static void b(android.app.Activity r5, int r6) {
            com.beizi.ad.internal.h.a r0 = com.beizi.ad.internal.h.a.a()     // Catch: java.lang.Exception -> L84
            java.lang.String r0 = r0.t()     // Catch: java.lang.Exception -> L84
            java.util.Locale r1 = java.util.Locale.US     // Catch: java.lang.Exception -> L84
            java.lang.String r0 = r0.toUpperCase(r1)     // Catch: java.lang.Exception -> L84
            com.beizi.ad.internal.h.a r2 = com.beizi.ad.internal.h.a.a()     // Catch: java.lang.Exception -> L84
            java.lang.String r2 = r2.s()     // Catch: java.lang.Exception -> L84
            java.lang.String r1 = r2.toUpperCase(r1)     // Catch: java.lang.Exception -> L84
            java.lang.String r2 = "AMAZON"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Exception -> L84
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L3e
            java.lang.String r1 = "KFTT"
            boolean r1 = r0.equals(r1)     // Catch: java.lang.Exception -> L84
            if (r1 != 0) goto L3c
            java.lang.String r1 = "KFJWI"
            boolean r1 = r0.equals(r1)     // Catch: java.lang.Exception -> L84
            if (r1 != 0) goto L3c
            java.lang.String r1 = "KFJWA"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L84
            if (r0 == 0) goto L3e
        L3c:
            r0 = 1
            goto L3f
        L3e:
            r0 = 0
        L3f:
            java.lang.String r1 = "window"
            java.lang.Object r1 = r5.getSystemService(r1)     // Catch: java.lang.Exception -> L84
            android.view.WindowManager r1 = (android.view.WindowManager) r1     // Catch: java.lang.Exception -> L84
            android.view.Display r1 = r1.getDefaultDisplay()     // Catch: java.lang.Exception -> L84
            r4 = 2
            if (r6 != r3) goto L61
            int r6 = r1.getRotation()     // Catch: java.lang.Exception -> L84
            if (r6 == r3) goto L5b
            if (r6 != r4) goto L57
            goto L5b
        L57:
            r5.setRequestedOrientation(r3)     // Catch: java.lang.Exception -> L84
            return
        L5b:
            r6 = 9
            r5.setRequestedOrientation(r6)     // Catch: java.lang.Exception -> L84
            return
        L61:
            if (r6 != r4) goto L84
            int r6 = r1.getRotation()     // Catch: java.lang.Exception -> L84
            r1 = 8
            if (r0 != 0) goto L78
            if (r6 == 0) goto L74
            if (r6 != r3) goto L70
            goto L74
        L70:
            r5.setRequestedOrientation(r1)     // Catch: java.lang.Exception -> L84
            return
        L74:
            r5.setRequestedOrientation(r2)     // Catch: java.lang.Exception -> L84
            return
        L78:
            if (r6 == 0) goto L81
            if (r6 != r3) goto L7d
            goto L81
        L7d:
            r5.setRequestedOrientation(r2)     // Catch: java.lang.Exception -> L84
            return
        L81:
            r5.setRequestedOrientation(r1)     // Catch: java.lang.Exception -> L84
        L84:
            return
    }

    @Override // android.app.Activity
    public void onBackPressed() {
            r1 = this;
            com.beizi.ad.AdActivity$a r0 = r1.f6423c
            if (r0 == 0) goto L7
            r0.b()
        L7:
            return
    }

    @Override // android.app.Activity
    protected native void onCreate(android.os.Bundle r1);

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.app.Activity
    protected void onDestroy() {
            r1 = this;
            com.beizi.ad.AdActivity$a r0 = r1.f6423c
            if (r0 == 0) goto L7
            r0.c()
        L7:
            super.onDestroy()
            return
    }

    @Override // android.app.Activity
    protected void onPause() {
            r1 = this;
            com.beizi.ad.AdActivity$a r0 = r1.f6423c
            if (r0 == 0) goto Lb
            android.webkit.WebView r0 = r0.f()
            com.beizi.ad.internal.h.x.c(r0)
        Lb:
            android.webkit.CookieSyncManager r0 = android.webkit.CookieSyncManager.getInstance()
            if (r0 == 0) goto L14
            r0.stopSync()
        L14:
            super.onPause()
            return
    }

    @Override // android.app.Activity
    protected void onResume() {
            r1 = this;
            com.beizi.ad.AdActivity$a r0 = r1.f6423c
            if (r0 == 0) goto Lb
            android.webkit.WebView r0 = r0.f()
            com.beizi.ad.internal.h.x.b(r0)
        Lb:
            android.webkit.CookieSyncManager r0 = android.webkit.CookieSyncManager.getInstance()
            if (r0 == 0) goto L14
            r0.startSync()
        L14:
            super.onResume()
            return
    }
}
