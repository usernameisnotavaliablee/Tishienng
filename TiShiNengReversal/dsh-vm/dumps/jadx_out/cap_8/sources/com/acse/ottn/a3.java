package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a3 {

    /* renamed from: c, reason: collision with root package name */
    public static com.acse.ottn.a3 f2059c;
    public android.accessibilityservice.AccessibilityService a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2060b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements java.lang.Runnable {
        public final /* synthetic */ int a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f2061b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.a3 f2062c;

        public a(com.acse.ottn.a3 r1, int r2, int r3) {
                r0 = this;
                r0.f2062c = r1
                r0.a = r2
                r0.f2061b = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 24
                if (r0 < r1) goto L3d
                com.acse.ottn.a3 r0 = r4.f2062c
                android.accessibilityservice.AccessibilityService r0 = com.acse.ottn.a3.a(r0)
                if (r0 == 0) goto L36
                boolean r0 = com.acse.ottn.l0.f2434e
                if (r0 == 0) goto L3d
                com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()     // Catch: java.lang.Throwable -> L3d
                java.lang.String r1 = "ocr_screen_scroll"
                java.lang.String r0 = r0.e(r1)     // Catch: java.lang.Throwable -> L3d
                java.lang.String r1 = "1"
                boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L3d
                if (r0 == 0) goto L3d
                com.acse.ottn.b r0 = com.acse.ottn.b.c()     // Catch: java.lang.Throwable -> L3d
                com.acse.ottn.a3 r1 = r4.f2062c     // Catch: java.lang.Throwable -> L3d
                android.accessibilityservice.AccessibilityService r1 = com.acse.ottn.a3.a(r1)     // Catch: java.lang.Throwable -> L3d
                int r2 = r4.a     // Catch: java.lang.Throwable -> L3d
                int r3 = r4.f2061b     // Catch: java.lang.Throwable -> L3d
                r0.a(r1, r2, r3)     // Catch: java.lang.Throwable -> L3d
                return
            L36:
                java.lang.String r0 = "samon-->"
                java.lang.String r1 = "mService is null"
                com.acse.ottn.h2.c(r0, r1)
            L3d:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class b implements java.lang.Runnable {
        public final /* synthetic */ com.acse.ottn.a3 a;

        public b(com.acse.ottn.a3 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r8 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 24
                if (r0 < r1) goto L33
                boolean r0 = com.acse.ottn.l0.f2434e
                if (r0 == 0) goto L33
                com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
                java.lang.String r1 = "ocr_screen_scroll"
                java.lang.String r0 = r0.e(r1)
                java.lang.String r1 = "1"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L33
                com.acse.ottn.b r1 = com.acse.ottn.b.c()
                com.acse.ottn.a3 r0 = r8.a
                android.accessibilityservice.AccessibilityService r2 = com.acse.ottn.a3.a(r0)
                r6 = 420(0x1a4, float:5.89E-43)
                r7 = 250(0xfa, float:3.5E-43)
                r3 = 520(0x208, float:7.29E-43)
                r4 = 520(0x208, float:7.29E-43)
                r5 = 520(0x208, float:7.29E-43)
                r1.a(r2, r3, r4, r5, r6, r7)
            L33:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class c implements android.accessibilityservice.AccessibilityService.TakeScreenshotCallback {
        public final /* synthetic */ android.view.accessibility.AccessibilityNodeInfo a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f2063b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f2064c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.a3 f2065d;

        public c(com.acse.ottn.a3 r1, android.view.accessibility.AccessibilityNodeInfo r2, java.lang.String r3, java.lang.String r4) {
                r0 = this;
                r0.f2065d = r1
                r0.a = r2
                r0.f2063b = r3
                r0.f2064c = r4
                r0.<init>()
                return
        }

        @Override // android.accessibilityservice.AccessibilityService.TakeScreenshotCallback
        public void onFailure(int r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "onFailure code is "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                java.lang.String r0 = "samon ScreenShotResult"
                com.acse.ottn.h2.c(r0, r3)
                return
        }

        @Override // android.accessibilityservice.AccessibilityService.TakeScreenshotCallback
        @androidx.annotation.RequiresApi(api = 30)
        public void onSuccess(@androidx.annotation.NonNull android.accessibilityservice.AccessibilityService.ScreenshotResult r6) {
                r5 = this;
                android.hardware.HardwareBuffer r0 = l.k.a(r6)
                android.graphics.ColorSpace r6 = l.l.a(r6)
                android.graphics.Bitmap r6 = l.m.a(r0, r6)
                android.graphics.Rect r0 = new android.graphics.Rect     // Catch: java.lang.Throwable -> L32
                r0.<init>()     // Catch: java.lang.Throwable -> L32
                android.view.accessibility.AccessibilityNodeInfo r1 = r5.a     // Catch: java.lang.Throwable -> L32
                r1.getBoundsInScreen(r0)     // Catch: java.lang.Throwable -> L32
                java.lang.String r1 = "1"
                java.lang.String r2 = r5.f2063b     // Catch: java.lang.Throwable -> L32
                boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L32
                r2 = 0
                if (r1 == 0) goto L35
                int r0 = r0.top     // Catch: java.lang.Throwable -> L32
                int r0 = r0 + (-90)
                com.acse.ottn.a3 r1 = r5.f2065d     // Catch: java.lang.Throwable -> L32
                android.accessibilityservice.AccessibilityService r1 = com.acse.ottn.a3.a(r1)     // Catch: java.lang.Throwable -> L32
                int r1 = com.acse.ottn.n4.c(r1)     // Catch: java.lang.Throwable -> L32
                r3 = 155(0x9b, float:2.17E-43)
                goto L9d
            L32:
                r6 = move-exception
                goto Lc1
            L35:
                java.lang.String r1 = "2"
                java.lang.String r3 = r5.f2063b     // Catch: java.lang.Throwable -> L32
                boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> L32
                r3 = 150(0x96, float:2.1E-43)
                if (r1 == 0) goto L50
                int r0 = r0.bottom     // Catch: java.lang.Throwable -> L32
                int r0 = r0 + 10
                com.acse.ottn.a3 r1 = r5.f2065d     // Catch: java.lang.Throwable -> L32
                android.accessibilityservice.AccessibilityService r1 = com.acse.ottn.a3.a(r1)     // Catch: java.lang.Throwable -> L32
                int r1 = com.acse.ottn.n4.c(r1)     // Catch: java.lang.Throwable -> L32
                goto L9d
            L50:
                java.lang.String r1 = "3"
                java.lang.String r4 = r5.f2063b     // Catch: java.lang.Throwable -> L32
                boolean r1 = r1.equals(r4)     // Catch: java.lang.Throwable -> L32
                if (r1 == 0) goto L69
                int r0 = r0.bottom     // Catch: java.lang.Throwable -> L32
                int r0 = r0 + 10
                com.acse.ottn.a3 r1 = r5.f2065d     // Catch: java.lang.Throwable -> L32
                android.accessibilityservice.AccessibilityService r1 = com.acse.ottn.a3.a(r1)     // Catch: java.lang.Throwable -> L32
                int r1 = com.acse.ottn.n4.c(r1)     // Catch: java.lang.Throwable -> L32
                goto L9d
            L69:
                java.lang.String r1 = "4"
                java.lang.String r4 = r5.f2063b     // Catch: java.lang.Throwable -> L32
                boolean r1 = r1.equals(r4)     // Catch: java.lang.Throwable -> L32
                if (r1 == 0) goto L82
                int r0 = r0.bottom     // Catch: java.lang.Throwable -> L32
                int r0 = r0 + 20
                com.acse.ottn.a3 r1 = r5.f2065d     // Catch: java.lang.Throwable -> L32
                android.accessibilityservice.AccessibilityService r1 = com.acse.ottn.a3.a(r1)     // Catch: java.lang.Throwable -> L32
                int r1 = com.acse.ottn.n4.c(r1)     // Catch: java.lang.Throwable -> L32
                goto L9d
            L82:
                java.lang.String r1 = "5"
                java.lang.String r4 = r5.f2063b     // Catch: java.lang.Throwable -> L32
                boolean r1 = r1.equals(r4)     // Catch: java.lang.Throwable -> L32
                if (r1 == 0) goto L9a
                int r0 = r0.top     // Catch: java.lang.Throwable -> L32
                int r0 = r0 - r3
                com.acse.ottn.a3 r1 = r5.f2065d     // Catch: java.lang.Throwable -> L32
                android.accessibilityservice.AccessibilityService r1 = com.acse.ottn.a3.a(r1)     // Catch: java.lang.Throwable -> L32
                int r1 = com.acse.ottn.n4.c(r1)     // Catch: java.lang.Throwable -> L32
                goto L9d
            L9a:
                r0 = 0
                r1 = 0
                r3 = 0
            L9d:
                com.acse.ottn.a3 r4 = r5.f2065d     // Catch: java.lang.Throwable -> L32
                android.accessibilityservice.AccessibilityService r4 = com.acse.ottn.a3.a(r4)     // Catch: java.lang.Throwable -> L32
                int r4 = com.acse.ottn.n4.b(r4)     // Catch: java.lang.Throwable -> L32
                if (r0 > r4) goto Lc0
                if (r1 == 0) goto Lc0
                if (r3 != 0) goto Lae
                goto Lc0
            Lae:
                android.graphics.Bitmap r6 = android.graphics.Bitmap.createBitmap(r6, r2, r0, r1, r3)     // Catch: java.lang.Throwable -> L32
                com.acse.ottn.a3 r0 = r5.f2065d     // Catch: java.lang.Throwable -> L32
                java.lang.String r1 = r5.f2064c     // Catch: java.lang.Throwable -> L32
                r0.a(r6, r1)     // Catch: java.lang.Throwable -> L32
                com.acse.ottn.a3 r0 = r5.f2065d     // Catch: java.lang.Throwable -> L32
                java.lang.String r1 = r5.f2064c     // Catch: java.lang.Throwable -> L32
                com.acse.ottn.a3.a(r0, r6, r1)     // Catch: java.lang.Throwable -> L32
            Lc0:
                return
            Lc1:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Throwable e =  "
                r0.append(r1)
                java.lang.String r6 = r6.getMessage()
                r0.append(r6)
                java.lang.String r6 = r0.toString()
                java.lang.String r0 = "samon croppedImage"
                com.acse.ottn.h2.c(r0, r6)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class d implements android.accessibilityservice.AccessibilityService.TakeScreenshotCallback {
        public final /* synthetic */ android.view.accessibility.AccessibilityNodeInfo a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f2066b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.a3 f2067c;

        public d(com.acse.ottn.a3 r1, android.view.accessibility.AccessibilityNodeInfo r2, int r3) {
                r0 = this;
                r0.f2067c = r1
                r0.a = r2
                r0.f2066b = r3
                r0.<init>()
                return
        }

        @Override // android.accessibilityservice.AccessibilityService.TakeScreenshotCallback
        public void onFailure(int r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "onFailure code is "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                java.lang.String r0 = "samon startCroppedTitle"
                com.acse.ottn.h2.c(r0, r3)
                return
        }

        @Override // android.accessibilityservice.AccessibilityService.TakeScreenshotCallback
        @androidx.annotation.RequiresApi(api = 30)
        public void onSuccess(@androidx.annotation.NonNull android.accessibilityservice.AccessibilityService.ScreenshotResult r5) {
                r4 = this;
                java.lang.String r0 = "3"
                android.hardware.HardwareBuffer r1 = l.k.a(r5)
                android.graphics.ColorSpace r5 = l.l.a(r5)
                android.graphics.Bitmap r5 = l.m.a(r1, r5)
                android.graphics.Rect r1 = new android.graphics.Rect     // Catch: java.lang.Throwable -> L2f
                r1.<init>()     // Catch: java.lang.Throwable -> L2f
                android.view.accessibility.AccessibilityNodeInfo r2 = r4.a     // Catch: java.lang.Throwable -> L2f
                r2.getBoundsInScreen(r1)     // Catch: java.lang.Throwable -> L2f
                int r2 = r1.right     // Catch: java.lang.Throwable -> L2f
                int r1 = r1.left     // Catch: java.lang.Throwable -> L2f
                int r2 = r2 - r1
                int r1 = r4.f2066b     // Catch: java.lang.Throwable -> L2f
                r3 = 0
                android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r5, r3, r3, r2, r1)     // Catch: java.lang.Throwable -> L2f
                com.acse.ottn.a3 r1 = r4.f2067c     // Catch: java.lang.Throwable -> L2f
                r1.a(r5, r0)     // Catch: java.lang.Throwable -> L2f
                com.acse.ottn.a3 r1 = r4.f2067c     // Catch: java.lang.Throwable -> L2f
                com.acse.ottn.a3.a(r1, r5, r0)     // Catch: java.lang.Throwable -> L2f
                return
            L2f:
                r5 = move-exception
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Throwable e =  "
                r0.append(r1)
                java.lang.String r5 = r5.getMessage()
                r0.append(r5)
                java.lang.String r5 = r0.toString()
                java.lang.String r0 = "samon startCroppedTitle"
                com.acse.ottn.h2.c(r0, r5)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class e implements android.accessibilityservice.AccessibilityService.TakeScreenshotCallback {
        public final /* synthetic */ com.acse.ottn.a3 a;

        public e(com.acse.ottn.a3 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.accessibilityservice.AccessibilityService.TakeScreenshotCallback
        public void onFailure(int r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "onFailure code is "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                java.lang.String r0 = "samon startCroppedTitle"
                com.acse.ottn.h2.c(r0, r3)
                return
        }

        @Override // android.accessibilityservice.AccessibilityService.TakeScreenshotCallback
        @androidx.annotation.RequiresApi(api = 30)
        public void onSuccess(@androidx.annotation.NonNull android.accessibilityservice.AccessibilityService.ScreenshotResult r3) {
                r2 = this;
                java.lang.String r0 = "3"
                android.hardware.HardwareBuffer r1 = l.k.a(r3)
                android.graphics.ColorSpace r3 = l.l.a(r3)
                android.graphics.Bitmap r3 = l.m.a(r1, r3)
                com.acse.ottn.a3 r1 = r2.a     // Catch: java.lang.Throwable -> L19
                r1.a(r3, r0)     // Catch: java.lang.Throwable -> L19
                com.acse.ottn.a3 r1 = r2.a     // Catch: java.lang.Throwable -> L19
                com.acse.ottn.a3.a(r1, r3, r0)     // Catch: java.lang.Throwable -> L19
                return
            L19:
                r3 = move-exception
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Throwable e =  "
                r0.append(r1)
                java.lang.String r3 = r3.getMessage()
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                java.lang.String r0 = "samon startCroppedTitle"
                com.acse.ottn.h2.c(r0, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class f implements android.accessibilityservice.AccessibilityService.TakeScreenshotCallback {
        public final /* synthetic */ android.view.accessibility.AccessibilityNodeInfo a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f2068b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.a3 f2069c;

        public f(com.acse.ottn.a3 r1, android.view.accessibility.AccessibilityNodeInfo r2, int r3) {
                r0 = this;
                r0.f2069c = r1
                r0.a = r2
                r0.f2068b = r3
                r0.<init>()
                return
        }

        @Override // android.accessibilityservice.AccessibilityService.TakeScreenshotCallback
        public void onFailure(int r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "onFailure code is "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                java.lang.String r0 = "samon startCroppedTitle"
                com.acse.ottn.h2.c(r0, r3)
                return
        }

        @Override // android.accessibilityservice.AccessibilityService.TakeScreenshotCallback
        @androidx.annotation.RequiresApi(api = 30)
        public void onSuccess(@androidx.annotation.NonNull android.accessibilityservice.AccessibilityService.ScreenshotResult r7) {
                r6 = this;
                java.lang.String r0 = "3"
                android.hardware.HardwareBuffer r1 = l.k.a(r7)
                android.graphics.ColorSpace r7 = l.l.a(r7)
                android.graphics.Bitmap r7 = l.m.a(r1, r7)
                android.graphics.Rect r1 = new android.graphics.Rect     // Catch: java.lang.Throwable -> L3d
                r1.<init>()     // Catch: java.lang.Throwable -> L3d
                android.view.accessibility.AccessibilityNodeInfo r2 = r6.a     // Catch: java.lang.Throwable -> L3d
                r2.getBoundsInScreen(r1)     // Catch: java.lang.Throwable -> L3d
                com.acse.ottn.a3 r2 = r6.f2069c     // Catch: java.lang.Throwable -> L3d
                android.accessibilityservice.AccessibilityService r2 = com.acse.ottn.a3.a(r2)     // Catch: java.lang.Throwable -> L3d
                int r2 = com.acse.ottn.n4.c(r2)     // Catch: java.lang.Throwable -> L3d
                com.acse.ottn.a3 r3 = r6.f2069c     // Catch: java.lang.Throwable -> L3d
                android.accessibilityservice.AccessibilityService r3 = com.acse.ottn.a3.a(r3)     // Catch: java.lang.Throwable -> L3d
                int r3 = com.acse.ottn.n4.b(r3)     // Catch: java.lang.Throwable -> L3d
                int r4 = r6.f2068b     // Catch: java.lang.Throwable -> L3d
                r5 = 0
                if (r4 != 0) goto L3f
                int r1 = r1.bottom     // Catch: java.lang.Throwable -> L3d
                int r4 = r1 + 50
                int r3 = r3 - r1
                int r3 = r3 / 2
                android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r7, r5, r4, r2, r3)     // Catch: java.lang.Throwable -> L3d
                goto L47
            L3d:
                r7 = move-exception
                goto L52
            L3f:
                int r1 = r1.bottom     // Catch: java.lang.Throwable -> L3d
                int r1 = r1 + 50
                android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r7, r5, r1, r2, r4)     // Catch: java.lang.Throwable -> L3d
            L47:
                com.acse.ottn.a3 r1 = r6.f2069c     // Catch: java.lang.Throwable -> L3d
                r1.a(r7, r0)     // Catch: java.lang.Throwable -> L3d
                com.acse.ottn.a3 r1 = r6.f2069c     // Catch: java.lang.Throwable -> L3d
                com.acse.ottn.a3.a(r1, r7, r0)     // Catch: java.lang.Throwable -> L3d
                return
            L52:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Throwable e =  "
                r0.append(r1)
                java.lang.String r7 = r7.getMessage()
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                java.lang.String r0 = "samon startCroppedTitle"
                com.acse.ottn.h2.c(r0, r7)
                return
        }
    }

    public a3() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f2060b = r0
            return
    }

    public static /* synthetic */ android.accessibilityservice.AccessibilityService a(com.acse.ottn.a3 r0) {
            android.accessibilityservice.AccessibilityService r0 = r0.a
            return r0
    }

    public static /* synthetic */ void a(com.acse.ottn.a3 r0, android.graphics.Bitmap r1, java.lang.String r2) {
            r0.b(r1, r2)
            return
    }

    public static com.acse.ottn.a3 d() {
            com.acse.ottn.a3 r0 = com.acse.ottn.a3.f2059c
            if (r0 != 0) goto L19
            java.lang.Class<com.acse.ottn.a3> r0 = com.acse.ottn.a3.class
            monitor-enter(r0)
            com.acse.ottn.a3 r1 = com.acse.ottn.a3.f2059c     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.acse.ottn.a3 r1 = new com.acse.ottn.a3     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.acse.ottn.a3.f2059c = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.acse.ottn.a3 r0 = com.acse.ottn.a3.f2059c
            return r0
    }

    public int a(android.graphics.Bitmap r10) {
            r9 = this;
            int r3 = r10.getWidth()
            int r7 = r10.getHeight()
            int r8 = r3 * r7
            int[] r1 = new int[r8]
            r4 = 0
            r5 = 0
            r2 = 0
            r6 = r3
            r0 = r10
            r0.getPixels(r1, r2, r3, r4, r5, r6, r7)
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            r0 = 0
            r2 = 0
        L1b:
            if (r2 >= r8) goto L39
            r3 = r1[r2]
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 24
            if (r4 < r5) goto L36
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            l.j r5 = new l.j
            r5.<init>()
            l.i.a(r10, r3, r4, r5)
        L36:
            int r2 = r2 + 1
            goto L1b
        L39:
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
            r1 = 0
        L42:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L6f
            java.lang.Object r2 = r10.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r3 <= r1) goto L42
            java.lang.Object r0 = r2.getValue()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r1 = r0.intValue()
            java.lang.Object r0 = r2.getKey()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L42
        L6f:
            return r0
    }

    public void a() {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L1c
            android.accessibilityservice.AccessibilityService r0 = r4.a
            if (r0 != 0) goto Lb
            goto L1c
        Lb:
            android.content.Context r1 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            java.util.concurrent.Executor r1 = l.g.a(r1)
            com.acse.ottn.a3$e r2 = new com.acse.ottn.a3$e
            r2.<init>(r4)
            r3 = 0
            l.h.a(r0, r3, r1, r2)
        L1c:
            return
    }

    public void a(android.accessibilityservice.AccessibilityService r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void a(android.graphics.Bitmap r4, java.io.File r5) {
            r3 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG
            r2 = 20
            r4.compress(r1, r2, r0)
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> L1e
            r4.<init>(r5)     // Catch: java.lang.Exception -> L1e
            byte[] r5 = r0.toByteArray()     // Catch: java.lang.Exception -> L1e
            r4.write(r5)     // Catch: java.lang.Exception -> L1e
            r4.flush()     // Catch: java.lang.Exception -> L1e
            r4.close()     // Catch: java.lang.Exception -> L1e
        L1e:
            return
    }

    public void a(android.graphics.Bitmap r4, java.lang.String r5) {
            r3 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L50
            r0.<init>()     // Catch: java.lang.Throwable -> L50
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> L50
            r2 = 20
            r4.compress(r1, r2, r0)     // Catch: java.lang.Throwable -> L50
            byte[] r4 = r0.toByteArray()     // Catch: java.lang.Throwable -> L50
            java.lang.String r0 = "1"
            boolean r0 = r0.equals(r5)     // Catch: java.lang.Throwable -> L50
            r1 = 0
            if (r0 == 0) goto L24
            com.acse.ottn.d r5 = com.acse.ottn.d.d()     // Catch: java.lang.Throwable -> L50
            java.lang.String r4 = android.util.Base64.encodeToString(r4, r1)     // Catch: java.lang.Throwable -> L50
            r5.n = r4     // Catch: java.lang.Throwable -> L50
            return
        L24:
            java.lang.String r0 = "2"
            boolean r0 = r0.equals(r5)     // Catch: java.lang.Throwable -> L50
            if (r0 == 0) goto L3e
            java.lang.String r5 = "samon-->"
            java.lang.String r0 = "imageBase64"
            com.acse.ottn.h2.a(r5, r0)     // Catch: java.lang.Throwable -> L50
            com.acse.ottn.d r5 = com.acse.ottn.d.d()     // Catch: java.lang.Throwable -> L50
            java.lang.String r4 = android.util.Base64.encodeToString(r4, r1)     // Catch: java.lang.Throwable -> L50
            r5.m = r4     // Catch: java.lang.Throwable -> L50
            return
        L3e:
            java.lang.String r0 = "3"
            boolean r5 = r0.equals(r5)     // Catch: java.lang.Throwable -> L50
            if (r5 == 0) goto L50
            com.acse.ottn.d r5 = com.acse.ottn.d.d()     // Catch: java.lang.Throwable -> L50
            java.lang.String r4 = android.util.Base64.encodeToString(r4, r1)     // Catch: java.lang.Throwable -> L50
            r5.m = r4     // Catch: java.lang.Throwable -> L50
        L50:
            return
    }

    public void a(android.view.accessibility.AccessibilityNodeInfo r4, int r5) {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L1c
            android.accessibilityservice.AccessibilityService r0 = r3.a
            if (r0 != 0) goto Lb
            goto L1c
        Lb:
            android.content.Context r1 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            java.util.concurrent.Executor r1 = l.g.a(r1)
            com.acse.ottn.a3$d r2 = new com.acse.ottn.a3$d
            r2.<init>(r3, r4, r5)
            r4 = 0
            l.h.a(r0, r4, r1, r2)
        L1c:
            return
    }

    public void a(android.view.accessibility.AccessibilityNodeInfo r7, java.lang.String r8) {
            r6 = this;
            boolean r0 = r6.f2060b
            if (r0 == 0) goto L5
            goto L61
        L5:
            android.accessibilityservice.AccessibilityService r0 = r6.a
            if (r0 != 0) goto La
            goto L61
        La:
            r0 = 1
            r6.f2060b = r0
            java.lang.String r0 = "samon"
            java.lang.String r1 = "找到截图目标"
            com.acse.ottn.h2.a(r0, r1)
            java.lang.String r0 = "1"
            r6.a(r7, r0, r8)
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            r7.getBoundsInScreen(r8)
            int r7 = r8.top
            int r0 = r8.left
            r1 = 200(0xc8, float:2.8E-43)
            int r0 = r0 + r1
            int r2 = r8.bottom     // Catch: java.lang.Throwable -> L61
            int r2 = r2 - r7
            int r2 = r2 / 2
            int r7 = r7 + r2
            android.os.Handler r2 = new android.os.Handler     // Catch: java.lang.Throwable -> L61
            android.os.Looper r3 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L61
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L61
            com.acse.ottn.a3$a r3 = new com.acse.ottn.a3$a     // Catch: java.lang.Throwable -> L61
            r3.<init>(r6, r0, r7)     // Catch: java.lang.Throwable -> L61
            r4 = 0
            r2.postDelayed(r3, r4)     // Catch: java.lang.Throwable -> L61
            android.content.Context r7 = com.acse.ottn.util.HelpShopAppUtil.getContext()     // Catch: java.lang.Throwable -> L61
            int r7 = com.acse.ottn.n4.b(r7)     // Catch: java.lang.Throwable -> L61
            int r8 = r8.bottom     // Catch: java.lang.Throwable -> L61
            int r7 = r7 - r8
            if (r7 >= r1) goto L61
            android.os.Handler r7 = new android.os.Handler     // Catch: java.lang.Throwable -> L61
            android.os.Looper r8 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L61
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L61
            com.acse.ottn.a3$b r8 = new com.acse.ottn.a3$b     // Catch: java.lang.Throwable -> L61
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L61
            r0 = 500(0x1f4, double:2.47E-321)
            r7.postDelayed(r8, r0)     // Catch: java.lang.Throwable -> L61
        L61:
            return
    }

    public final void a(android.view.accessibility.AccessibilityNodeInfo r4, java.lang.String r5, java.lang.String r6) {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L1c
            android.accessibilityservice.AccessibilityService r0 = r3.a
            if (r0 != 0) goto Lb
            goto L1c
        Lb:
            android.content.Context r1 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            java.util.concurrent.Executor r1 = l.g.a(r1)
            com.acse.ottn.a3$c r2 = new com.acse.ottn.a3$c
            r2.<init>(r3, r4, r6, r5)
            r4 = 0
            l.h.a(r0, r4, r1, r2)
        L1c:
            return
    }

    public void b() {
            r2 = this;
            com.acse.ottn.d r0 = com.acse.ottn.d.d()
            java.lang.String r1 = ""
            r0.m = r1
            com.acse.ottn.d r0 = com.acse.ottn.d.d()
            r0.n = r1
            return
    }

    public final void b(android.graphics.Bitmap r5, java.lang.String r6) {
            r4 = this;
            boolean r0 = com.acse.ottn.activity.AcseHelpManager.mIsDebug
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r0 = "1"
            boolean r6 = r0.equals(r6)
            r0 = 10000(0x2710, float:1.4013E-41)
            java.lang.String r1 = "/"
            if (r6 == 0) goto L3e
            java.io.File r6 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.io.File r3 = r4.c()
            r2.append(r3)
            r2.append(r1)
            java.util.Random r1 = new java.util.Random
            r1.<init>()
            int r0 = r1.nextInt(r0)
            r2.append(r0)
            java.lang.String r0 = "shot1.png"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r6.<init>(r0)
            r4.a(r5, r6)
            return
        L3e:
            java.io.File r6 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.io.File r3 = r4.c()
            r2.append(r3)
            r2.append(r1)
            java.util.Random r1 = new java.util.Random
            r1.<init>()
            int r0 = r1.nextInt(r0)
            r2.append(r0)
            java.lang.String r0 = "shot2.png"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r6.<init>(r0)
            r4.a(r5, r6)
            return
    }

    public void b(android.view.accessibility.AccessibilityNodeInfo r4, int r5) {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L1c
            android.accessibilityservice.AccessibilityService r0 = r3.a
            if (r0 != 0) goto Lb
            goto L1c
        Lb:
            android.content.Context r1 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            java.util.concurrent.Executor r1 = l.g.a(r1)
            com.acse.ottn.a3$f r2 = new com.acse.ottn.a3$f
            r2.<init>(r3, r4, r5)
            r4 = 0
            l.h.a(r0, r4, r1, r2)
        L1c:
            return
    }

    public final java.io.File c() {
            r2 = this;
            android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            java.lang.String r1 = "crash"
            java.io.File r0 = r0.getExternalFilesDir(r1)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L13
            r0.mkdirs()
        L13:
            return r0
    }

    public final java.lang.Object e() throws java.io.ObjectStreamException {
            r1 = this;
            com.acse.ottn.a3 r0 = com.acse.ottn.a3.f2059c
            return r0
    }

    public java.lang.String f() {
            r3 = this;
            java.io.File r0 = r3.c()
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "/Screenshot.png"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L32
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L32
            long r1 = r1.length()     // Catch: java.lang.Throwable -> L32
            int r2 = (int) r1     // Catch: java.lang.Throwable -> L32
            byte[] r1 = new byte[r2]     // Catch: java.lang.Throwable -> L32
            r0.read(r1)     // Catch: java.lang.Throwable -> L32
            r0.close()     // Catch: java.lang.Throwable -> L32
            r0 = 0
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r0)     // Catch: java.lang.Throwable -> L32
            return r0
        L32:
            java.lang.String r0 = ""
            return r0
    }
}
