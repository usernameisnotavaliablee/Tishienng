package com.acse.ottn.activity;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class SeedingLoadingActivity extends com.acse.ottn.a0 {

    /* renamed from: e, reason: collision with root package name */
    public int f2107e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2108f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements com.acse.ottn.e4.h {
        public final /* synthetic */ com.acse.ottn.activity.SeedingLoadingActivity a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.acse.ottn.activity.SeedingLoadingActivity$a$a, reason: collision with other inner class name */
        public class RunnableC0060a implements java.lang.Runnable {
            public final /* synthetic */ com.acse.ottn.activity.SeedingLoadingActivity.a a;

            public RunnableC0060a(com.acse.ottn.activity.SeedingLoadingActivity.a r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r1 = this;
                    com.acse.ottn.activity.SeedingLoadingActivity$a r0 = r1.a
                    com.acse.ottn.activity.SeedingLoadingActivity r0 = r0.a
                    r0.finish()
                    return
            }
        }

        public a(com.acse.ottn.activity.SeedingLoadingActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.e4.h
        public void a(java.lang.String r4, java.lang.String r5) {
                r3 = this;
                java.lang.String r0 = ""
                com.acse.ottn.activity.SeedingLoadingActivity r1 = r3.a
                boolean r1 = com.acse.ottn.activity.SeedingLoadingActivity.a(r1)
                if (r1 == 0) goto L10
                com.acse.ottn.activity.SeedingLoadingActivity r4 = r3.a
                r4.finish()
                return
            L10:
                boolean r1 = android.text.TextUtils.isEmpty(r4)
                if (r1 != 0) goto L35
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "write code = "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "SeedingLoadingActivity"
                com.acse.ottn.h2.a(r2, r1)
                com.acse.ottn.o r1 = com.acse.ottn.o.c()
                com.acse.ottn.activity.SeedingLoadingActivity r2 = r3.a
                r1.a(r2, r4)
            L35:
                boolean r4 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L44
                if (r4 != 0) goto L44
                com.acse.ottn.l4 r4 = com.acse.ottn.l4.c()     // Catch: java.lang.Throwable -> L44
                com.acse.ottn.activity.SeedingLoadingActivity r1 = r3.a     // Catch: java.lang.Throwable -> L44
                r4.a(r1, r5, r0, r0)     // Catch: java.lang.Throwable -> L44
            L44:
                android.os.Handler r4 = new android.os.Handler
                r4.<init>()
                com.acse.ottn.activity.SeedingLoadingActivity$a$a r5 = new com.acse.ottn.activity.SeedingLoadingActivity$a$a
                r5.<init>(r3)
                com.acse.ottn.activity.SeedingLoadingActivity r0 = r3.a
                int r0 = com.acse.ottn.activity.SeedingLoadingActivity.b(r0)
                long r0 = (long) r0
                r4.postDelayed(r5, r0)
                return
        }
    }

    static {
            r0 = 9587(0x2573, float:1.3434E-41)
            com.stub.StubApp.interface11(r0)
            return
    }

    public SeedingLoadingActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ boolean a(com.acse.ottn.activity.SeedingLoadingActivity r0) {
            boolean r0 = r0.f2108f
            return r0
    }

    public static /* synthetic */ int b(com.acse.ottn.activity.SeedingLoadingActivity r0) {
            int r0 = r0.f2107e
            return r0
    }

    public final java.lang.String a(android.content.Context r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "activity"
            java.lang.Object r5 = r5.getSystemService(r1)
            android.app.ActivityManager r5 = (android.app.ActivityManager) r5
            java.util.List r5 = r5.getRunningAppProcesses()
            java.util.Iterator r5 = r5.iterator()
        L14:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r5.next()
            android.app.ActivityManager$RunningAppProcessInfo r1 = (android.app.ActivityManager.RunningAppProcessInfo) r1
            int r2 = r1.pid
            int r3 = android.os.Process.myPid()
            if (r2 != r3) goto L14
            java.lang.String r5 = r1.processName
            return r5
        L2b:
            return r0
    }

    @Override // com.acse.ottn.a0
    public void onBackPressed() {
            r1 = this;
            super.onBackPressed()
            r0 = 1
            r1.f2108f = r0
            com.acse.ottn.e4 r0 = com.acse.ottn.e4.a()
            r0.c()
            return
    }

    @Override // com.acse.ottn.a0
    public native void onCreate(android.os.Bundle r1);

    @Override // com.acse.ottn.a0
    @androidx.annotation.RequiresApi(api = 21)
    public void onPause() {
            r1 = this;
            super.onPause()
            r0 = 1
            r1.f2108f = r0
            r1.finish()
            return
    }
}
