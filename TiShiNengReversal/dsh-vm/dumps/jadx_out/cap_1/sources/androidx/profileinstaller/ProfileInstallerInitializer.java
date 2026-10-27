package androidx.profileinstaller;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ProfileInstallerInitializer implements androidx.startup.Initializer<androidx.profileinstaller.ProfileInstallerInitializer.Result> {
    private static final int DELAY_MS = 5000;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(16)
    private static class Choreographer16Impl {
        private Choreographer16Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public static /* synthetic */ void a(java.lang.Runnable r0, long r1) {
                r0.run()
                return
        }

        @androidx.annotation.DoNotInline
        public static void postFrameCallback(java.lang.Runnable r2) {
                android.view.Choreographer r0 = android.view.Choreographer.getInstance()
                androidx.profileinstaller.i r1 = new androidx.profileinstaller.i
                r1.<init>(r2)
                r0.postFrameCallback(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(28)
    private static class Handler28Impl {
        private Handler28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.os.Handler createAsync(android.os.Looper r0) {
                android.os.Handler r0 = androidx.emoji2.text.c.a(r0)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Result {
        public Result() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public ProfileInstallerInitializer() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void a(androidx.profileinstaller.ProfileInstallerInitializer r0, android.content.Context r1) {
            r0.installAfterDelay(r1)
            return
    }

    public static /* synthetic */ void b(android.content.Context r0) {
            androidx.profileinstaller.ProfileInstaller.writeProfile(r0)
            return
    }

    public static /* synthetic */ void c(android.content.Context r0) {
            writeInBackground(r0)
            return
    }

    private static void writeInBackground(@androidx.annotation.NonNull android.content.Context r7) {
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.LinkedBlockingQueue r6 = new java.util.concurrent.LinkedBlockingQueue
            r6.<init>()
            r1 = 0
            r2 = 1
            r3 = 0
            r0.<init>(r1, r2, r3, r5, r6)
            androidx.profileinstaller.h r1 = new androidx.profileinstaller.h
            r1.<init>(r7)
            r0.execute(r1)
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.startup.Initializer
    @androidx.annotation.NonNull
    public androidx.profileinstaller.ProfileInstallerInitializer.Result create(@androidx.annotation.NonNull android.content.Context r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 >= r1) goto Lc
            androidx.profileinstaller.ProfileInstallerInitializer$Result r3 = new androidx.profileinstaller.ProfileInstallerInitializer$Result
            r3.<init>()
            return r3
        Lc:
            android.content.Context r3 = r3.getApplicationContext()
            r2.delayAfterFirstFrame(r3)
            androidx.profileinstaller.ProfileInstallerInitializer$Result r3 = new androidx.profileinstaller.ProfileInstallerInitializer$Result
            r3.<init>()
            return r3
    }

    @Override // androidx.startup.Initializer
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ androidx.profileinstaller.ProfileInstallerInitializer.Result create(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            androidx.profileinstaller.ProfileInstallerInitializer$Result r1 = r0.create(r1)
            return r1
    }

    @androidx.annotation.RequiresApi(16)
    void delayAfterFirstFrame(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            androidx.profileinstaller.g r0 = new androidx.profileinstaller.g
            r0.<init>(r1, r2)
            androidx.profileinstaller.ProfileInstallerInitializer.Choreographer16Impl.postFrameCallback(r0)
            return
    }

    @Override // androidx.startup.Initializer
    @androidx.annotation.NonNull
    public java.util.List<java.lang.Class<? extends androidx.startup.Initializer<?>>> dependencies() {
            r1 = this;
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
    }

    void installAfterDelay(@androidx.annotation.NonNull android.content.Context r6) {
            r5 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lf
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Handler r0 = androidx.profileinstaller.ProfileInstallerInitializer.Handler28Impl.createAsync(r0)
            goto L18
        Lf:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
        L18:
            java.util.Random r1 = new java.util.Random
            r1.<init>()
            r2 = 1000(0x3e8, float:1.401E-42)
            r3 = 1
            int r2 = java.lang.Math.max(r2, r3)
            int r1 = r1.nextInt(r2)
            androidx.profileinstaller.f r2 = new androidx.profileinstaller.f
            r2.<init>(r6)
            int r1 = r1 + 5000
            long r3 = (long) r1
            r0.postDelayed(r2, r3)
            return
    }
}
