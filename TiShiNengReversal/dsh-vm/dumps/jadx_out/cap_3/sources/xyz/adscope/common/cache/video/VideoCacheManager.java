package xyz.adscope.common.cache.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class VideoCacheManager {
    private static xyz.adscope.common.cache.video.VideoCacheManager d;
    private java.util.concurrent.ExecutorService a;
    private android.util.LruCache<java.lang.String, java.lang.String> b;
    private android.os.Handler c;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface VideoLoadedListener {
        void onVideoLoadFailed();

        void onVideoLoaded(java.lang.String r1);
    }

    public VideoCacheManager() {
            r2 = this;
            r2.<init>()
            r0 = 4
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newFixedThreadPool(r0)
            r2.a = r0
            android.util.LruCache r0 = new android.util.LruCache
            r1 = 1048576(0x100000, float:1.469368E-39)
            r0.<init>(r1)
            r2.b = r0
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r2.c = r0
            return
    }

    static /* synthetic */ android.os.Handler a(xyz.adscope.common.cache.video.VideoCacheManager r0) {
            android.os.Handler r0 = r0.c
            return r0
    }

    private static xyz.adscope.common.cache.video.VideoCacheManager a() {
            xyz.adscope.common.cache.video.VideoCacheManager r0 = xyz.adscope.common.cache.video.VideoCacheManager.d
            if (r0 != 0) goto L19
            java.lang.Class<xyz.adscope.common.cache.video.VideoCacheManager> r0 = xyz.adscope.common.cache.video.VideoCacheManager.class
            monitor-enter(r0)
            xyz.adscope.common.cache.video.VideoCacheManager r1 = xyz.adscope.common.cache.video.VideoCacheManager.d     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            xyz.adscope.common.cache.video.VideoCacheManager r1 = new xyz.adscope.common.cache.video.VideoCacheManager     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            xyz.adscope.common.cache.video.VideoCacheManager.d = r1     // Catch: java.lang.Throwable -> L13
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
            xyz.adscope.common.cache.video.VideoCacheManager r0 = xyz.adscope.common.cache.video.VideoCacheManager.d
            return r0
    }

    static /* synthetic */ android.util.LruCache b(xyz.adscope.common.cache.video.VideoCacheManager r0) {
            android.util.LruCache<java.lang.String, java.lang.String> r0 = r0.b
            return r0
    }

    public static xyz.adscope.common.cache.video.VideoCacheManager with() {
            xyz.adscope.common.cache.video.VideoCacheManager r0 = a()
            return r0
    }

    public void getCacheVideo(android.content.Context r7, java.lang.String r8, xyz.adscope.common.cache.video.VideoCacheManager.VideoLoadedListener r9) {
            r6 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L7
            return
        L7:
            android.util.LruCache<java.lang.String, java.lang.String> r0 = r6.b
            java.lang.Object r0 = r0.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L19
            r9.onVideoLoaded(r0)
            return
        L19:
            java.lang.String r0 = "/"
            int r0 = r8.lastIndexOf(r0)
            int r0 = r0 + 1
            java.lang.String r0 = r8.substring(r0)
            java.io.File r1 = new java.io.File
            java.io.File r2 = xyz.adscope.common.tool.utils.FileUtils.getResourceCacheDirectory(r7)
            java.lang.String r0 = xyz.adscope.common.tool.security.MD5Util.md5(r0)
            r1.<init>(r2, r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L47
            long r2 = r1.length()
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L47
            java.lang.String r0 = r1.getAbsolutePath()
            goto L48
        L47:
            r0 = 0
        L48:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L57
            android.util.LruCache<java.lang.String, java.lang.String> r7 = r6.b
            r7.put(r8, r0)
            r9.onVideoLoaded(r0)
            return
        L57:
            java.util.concurrent.ExecutorService r0 = r6.a
            xyz.adscope.common.cache.video.VideoCacheManager$1 r1 = new xyz.adscope.common.cache.video.VideoCacheManager$1
            r1.<init>(r6, r8, r7, r9)
            r0.submit(r1)
            return
    }
}
