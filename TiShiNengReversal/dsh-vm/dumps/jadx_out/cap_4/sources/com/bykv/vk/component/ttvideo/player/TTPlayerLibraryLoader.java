package com.bykv.vk.component.ttvideo.player;

@java.lang.Deprecated
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class TTPlayerLibraryLoader {
    private static final int DEGRADED_VERSION = 2925;
    private static boolean IsErrored = false;
    private static final java.lang.String TAG = "TTPlayerLibraryLoader";
    private static com.bykv.vk.component.ttvideo.player.ILibraryLoader mDebugLibraryLoader;
    private static com.bykv.vk.component.ttvideo.player.ILibraryLoader mDefaultLibLoader;
    private static java.lang.String mErrorInfo;
    private static boolean mLibraryLoaded;
    private static com.bykv.vk.component.ttvideo.player.ILibraryLoader mLibraryLoader;
    private static com.bykv.vk.component.ttvideo.player.ILibraryLoader mPluginLibLoader;
    private static int mVersion;

    /* renamed from: com.bykv.vk.component.ttvideo.player.TTPlayerLibraryLoader$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private static class DefaultLibraryLoader implements com.bykv.vk.component.ttvideo.player.ILibraryLoader {
        private DefaultLibraryLoader() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ DefaultLibraryLoader(com.bykv.vk.component.ttvideo.player.TTPlayerLibraryLoader.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bykv.vk.component.ttvideo.player.ILibraryLoader
        public boolean onLoadNativeLibs(java.util.List<java.lang.String> r2) {
                r1 = this;
                java.util.Iterator r2 = r2.iterator()
            L4:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L24
                java.lang.Object r0 = r2.next()
                java.lang.String r0 = (java.lang.String) r0
                com.bytedance.sdk.openadsdk.l.m.j(r0)     // Catch: java.lang.Throwable -> L14
                goto L4
            L14:
                r2 = move-exception
                java.lang.String r2 = r2.getMessage()
                com.bykv.vk.component.ttvideo.player.TTPlayerLibraryLoader.access$102(r2)
                com.bykv.vk.component.ttvideo.player.TTPlayerLibraryLoader.access$200()
                com.bykv.vk.component.ttvideo.player.TTPlayerLibraryLoader.access$100()
                r2 = 0
                return r2
            L24:
                r2 = 1
                return r2
        }
    }

    static {
            com.bykv.vk.component.ttvideo.player.TTPlayerLibraryLoader$DefaultLibraryLoader r0 = new com.bykv.vk.component.ttvideo.player.TTPlayerLibraryLoader$DefaultLibraryLoader
            r1 = 0
            r0.<init>(r1)
            com.bykv.vk.component.ttvideo.player.TTPlayerLibraryLoader.mDefaultLibLoader = r0
            r0 = 0
            com.bykv.vk.component.ttvideo.player.TTPlayerLibraryLoader.mLibraryLoaded = r0
            com.bykv.vk.component.ttvideo.player.TTPlayerLibraryLoader.IsErrored = r0
            com.bykv.vk.component.ttvideo.player.TTPlayerLibraryLoader.mErrorInfo = r1
            com.bykv.vk.component.ttvideo.player.TTPlayerLibraryLoader.mVersion = r0
            return
    }

    public TTPlayerLibraryLoader() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ java.lang.String access$100() {
            java.lang.String r0 = com.bykv.vk.component.ttvideo.player.TTPlayerLibraryLoader.mErrorInfo
            return r0
    }

    static /* synthetic */ java.lang.String access$102(java.lang.String r0) {
            com.bykv.vk.component.ttvideo.player.TTPlayerLibraryLoader.mErrorInfo = r0
            return r0
    }

    static /* synthetic */ java.lang.String access$200() {
            java.lang.String r0 = com.bykv.vk.component.ttvideo.player.TTPlayerLibraryLoader.TAG
            return r0
    }

    public static java.lang.String getErrorInfo() {
            java.lang.String r0 = com.bykv.vk.component.ttvideo.player.TTPlayerLibraryLoader.mErrorInfo
            return r0
    }

    public static boolean isError() {
            boolean r0 = com.bykv.vk.component.ttvideo.player.TTPlayerLibraryLoader.IsErrored
            return r0
    }

    public static final synchronized void loadLibrary() {
            java.lang.Class<com.bykv.vk.component.ttvideo.player.TTPlayerLibraryLoader> r0 = com.bykv.vk.component.ttvideo.player.TTPlayerLibraryLoader.class
            monitor-enter(r0)
            r1 = 1
            int r2 = com.bykv.vk.component.ttvideo.player.TTPlayerLibraryLoader.mVersion     // Catch: java.lang.Throwable -> L14
            r3 = 0
            if (r2 != 0) goto L16
            r2 = 13
            int r2 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.getValue(r2, r3)     // Catch: java.lang.Throwable -> L14
            int r2 = r2 / 1000
            com.bykv.vk.component.ttvideo.player.TTPlayerLibraryLoader.mVersion = r2     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r2 = move-exception
            goto L5d
        L16:
            int r2 = com.bykv.vk.component.ttvideo.player.TTPlayerLibraryLoader.mVersion     // Catch: java.lang.Throwable -> L14
            r4 = 2925(0xb6d, float:4.099E-42)
            if (r2 != r4) goto L1e
            r2 = 1
            goto L1f
        L1e:
            r2 = 0
        L1f:
            r4 = 3
            boolean r4 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.getValue(r4, r3)     // Catch: java.lang.Throwable -> L14
            if (r4 == 0) goto L3e
            if (r2 != 0) goto L32
            java.lang.String r2 = "ttopenssl"
            loadPlayerlibrary(r2)     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = "mffmpeg"
            loadPlayerlibrary(r2)     // Catch: java.lang.Throwable -> L14
        L32:
            java.lang.String r2 = "ttmplayer"
            boolean r2 = loadPlayerlibrary(r2)     // Catch: java.lang.Throwable -> L14
            if (r2 != 0) goto L5b
            com.bykv.vk.component.ttvideo.player.TTPlayerLibraryLoader.IsErrored = r1     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)
            return
        L3e:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L14
            r4.<init>()     // Catch: java.lang.Throwable -> L14
            if (r2 != 0) goto L4f
            java.lang.String r2 = "ttopenssl"
            r4.add(r2)     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = "mffmpeg"
            r4.add(r2)     // Catch: java.lang.Throwable -> L14
        L4f:
            java.lang.String r2 = "ttmplayer"
            r4.add(r2)     // Catch: java.lang.Throwable -> L14
            boolean r2 = loadLibs(r4, r3)     // Catch: java.lang.Throwable -> L14
            r2 = r2 ^ r1
            com.bykv.vk.component.ttvideo.player.TTPlayerLibraryLoader.IsErrored = r2     // Catch: java.lang.Throwable -> L14
        L5b:
            monitor-exit(r0)
            return
        L5d:
            com.bykv.vk.component.ttvideo.player.TTPlayerLibraryLoader.IsErrored = r1     // Catch: java.lang.Throwable -> L78
            com.bytedance.sdk.component.utils.vl.j(r2)     // Catch: java.lang.Throwable -> L78
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L78
            java.lang.String r3 = "load default library error."
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L78
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L78
            r1.append(r2)     // Catch: java.lang.Throwable -> L78
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L78
            com.bykv.vk.component.ttvideo.player.TTPlayerLibraryLoader.mErrorInfo = r1     // Catch: java.lang.Throwable -> L78
            monitor-exit(r0)
            return
        L78:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L78
            throw r1
    }

    private static boolean loadLibs(java.util.List<java.lang.String> r1, boolean r2) {
            r2 = r2 ^ 1
            boolean r0 = com.bykv.vk.component.ttvideo.player.TTPlayerLibraryLoader.mLibraryLoaded
            r2 = r2 & r0
            if (r2 == 0) goto L8
            return r0
        L8:
            com.bykv.vk.component.ttvideo.player.ILibraryLoader r2 = com.bykv.vk.component.ttvideo.player.TTPlayerLibraryLoader.mLibraryLoader
            if (r2 == 0) goto L1b
            boolean r1 = r2.onLoadNativeLibs(r1)     // Catch: java.lang.Throwable -> L13
            com.bykv.vk.component.ttvideo.player.TTPlayerLibraryLoader.mLibraryLoaded = r1     // Catch: java.lang.Throwable -> L13
            goto L36
        L13:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            com.bykv.vk.component.ttvideo.player.TTPlayerLibraryLoader.mErrorInfo = r1
            goto L36
        L1b:
            com.bykv.vk.component.ttvideo.player.ILibraryLoader r2 = com.bykv.vk.component.ttvideo.player.TTPlayerLibraryLoader.mPluginLibLoader
            if (r2 == 0) goto L2e
            boolean r1 = r2.onLoadNativeLibs(r1)     // Catch: java.lang.Throwable -> L26
            com.bykv.vk.component.ttvideo.player.TTPlayerLibraryLoader.mLibraryLoaded = r1     // Catch: java.lang.Throwable -> L26
            goto L36
        L26:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            com.bykv.vk.component.ttvideo.player.TTPlayerLibraryLoader.mErrorInfo = r1
            goto L36
        L2e:
            com.bykv.vk.component.ttvideo.player.ILibraryLoader r2 = com.bykv.vk.component.ttvideo.player.TTPlayerLibraryLoader.mDefaultLibLoader
            boolean r1 = r2.onLoadNativeLibs(r1)
            com.bykv.vk.component.ttvideo.player.TTPlayerLibraryLoader.mLibraryLoaded = r1
        L36:
            boolean r1 = com.bykv.vk.component.ttvideo.player.TTPlayerLibraryLoader.mLibraryLoaded
            return r1
    }

    @android.annotation.SuppressLint({"UnsafeDynamicallyLoadedCode"})
    private static boolean loadPlayerlibrary(java.lang.String r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "lib"
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r1 = ".so"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.setLibraryName(r0)     // Catch: java.lang.Throwable -> L2d
            com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.checkDebugTTPlayerLib()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r0 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.getPlayerLibraryPath()     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L2f
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L2d
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L2d
            boolean r2 = r2.exists()     // Catch: java.lang.Throwable -> L2d
            if (r2 != 0) goto L2f
            r0 = r1
            goto L2f
        L2d:
            r0 = move-exception
            goto L47
        L2f:
            if (r0 == 0) goto L5f
            com.bykv.vk.component.ttvideo.player.ILibraryLoader r2 = com.bykv.vk.component.ttvideo.player.TTPlayerLibraryLoader.mDebugLibraryLoader     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto L43
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2d
            r2.<init>()     // Catch: java.lang.Throwable -> L2d
            r2.add(r0)     // Catch: java.lang.Throwable -> L2d
            com.bykv.vk.component.ttvideo.player.ILibraryLoader r3 = com.bykv.vk.component.ttvideo.player.TTPlayerLibraryLoader.mDebugLibraryLoader     // Catch: java.lang.Throwable -> L2d
            r3.onLoadNativeLibs(r2)     // Catch: java.lang.Throwable -> L2d
            goto L5f
        L43:
            java.lang.System.load(r0)     // Catch: java.lang.Throwable -> L2d
            goto L5f
        L47:
            com.bytedance.sdk.component.utils.vl.j(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "load path library error."
            r2.<init>(r3)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.bykv.vk.component.ttvideo.player.TTPlayerLibraryLoader.mErrorInfo = r0
            r0 = r1
        L5f:
            r2 = 1
            if (r0 != 0) goto L81
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L70
            r0.<init>()     // Catch: java.lang.Throwable -> L70
            r0.add(r4)     // Catch: java.lang.Throwable -> L70
            loadLibs(r0, r2)     // Catch: java.lang.Throwable -> L70
            com.bykv.vk.component.ttvideo.player.TTPlayerLibraryLoader.mErrorInfo = r1
            goto L81
        L70:
            java.lang.String r0 = com.bykv.vk.component.ttvideo.player.TTPlayerLibraryLoader.TAG
            java.lang.String r1 = "load lib failed name = "
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r4 = r1.concat(r4)
            com.bytedance.sdk.component.utils.vl.r(r0, r4)
            r4 = 0
            return r4
        L81:
            return r2
    }

    public static final void setDebugLibraryLoader(com.bykv.vk.component.ttvideo.player.ILibraryLoader r0) {
            com.bykv.vk.component.ttvideo.player.TTPlayerLibraryLoader.mDebugLibraryLoader = r0
            return
    }

    public static final void setLibraryLoader(com.bykv.vk.component.ttvideo.player.ILibraryLoader r0) {
            com.bykv.vk.component.ttvideo.player.TTPlayerLibraryLoader.mLibraryLoader = r0
            return
    }

    public static final void setPluginLibraryLoader(com.bykv.vk.component.ttvideo.player.ILibraryLoader r0) {
            com.bykv.vk.component.ttvideo.player.TTPlayerLibraryLoader.mPluginLibLoader = r0
            return
    }
}
