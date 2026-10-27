package xyz.adscope.common.v2.cache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class IBaseLruCache implements xyz.adscope.common.v2.cache.IResourceLruCache {
    private final long M2BYTE;
    private final java.lang.String TASK_HOLDER_KEY_FORMAT;
    private final java.util.Map<java.lang.String, xyz.adscope.common.v2.cache.IBaseLruCache.ResourceCacheTask> cacheTaskHolder;
    private final long mMaxCacheSizeByte;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static abstract class ResourceCacheTask implements java.lang.Runnable {
        private final java.io.File mCacheFile;
        private xyz.adscope.common.v2.cache.IResourceLruCache.IResourceCacheCallback mCallback;
        private final java.lang.String mTaskKey;
        private final java.lang.String mURL;


        private ResourceCacheTask(java.lang.String r1, java.io.File r2, java.lang.String r3) {
                r0 = this;
                r0.<init>()
                r0.mURL = r1
                r0.mCacheFile = r2
                r0.mTaskKey = r3
                return
        }

        /* synthetic */ ResourceCacheTask(java.lang.String r1, java.io.File r2, java.lang.String r3, xyz.adscope.common.v2.cache.IBaseLruCache.AnonymousClass1 r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        static /* synthetic */ void access$000(xyz.adscope.common.v2.cache.IBaseLruCache.ResourceCacheTask r0, xyz.adscope.common.v2.cache.IResourceLruCache.IResourceCacheCallback r1) {
                r0.injectCacheCallback(r1)
                return
        }

        static /* synthetic */ java.lang.String access$300(xyz.adscope.common.v2.cache.IBaseLruCache.ResourceCacheTask r0) {
                java.lang.String r0 = r0.mTaskKey
                return r0
        }

        static /* synthetic */ java.io.File access$400(xyz.adscope.common.v2.cache.IBaseLruCache.ResourceCacheTask r0) {
                java.io.File r0 = r0.mCacheFile
                return r0
        }

        private void injectCacheCallback(xyz.adscope.common.v2.cache.IResourceLruCache.IResourceCacheCallback r1) {
                r0 = this;
                r0.mCallback = r1
                return
        }

        void callbackCacheDone(java.io.File r2) {
                r1 = this;
                xyz.adscope.common.v2.cache.IResourceLruCache$IResourceCacheCallback r0 = r1.mCallback
                if (r0 == 0) goto L7
                r0.onCacheDone(r2)
            L7:
                return
        }

        void callbackCacheException() {
                r1 = this;
                xyz.adscope.common.v2.cache.IResourceLruCache$IResourceCacheCallback r0 = r1.mCallback
                if (r0 == 0) goto L7
                r0.onCacheException()
            L7:
                return
        }

        abstract void onCacheFinished(java.lang.String r1, java.io.File r2);

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                xyz.adscope.common.v2.conn.http.CommonRequestBuilder r0 = new xyz.adscope.common.v2.conn.http.CommonRequestBuilder
                r0.<init>()
                r1 = 1
                xyz.adscope.common.v2.conn.http.CommonRequestBuilder r0 = r0.autoRedirected(r1)
                xyz.adscope.common.v2.cache.IBaseLruCache$ResourceCacheTask$1 r1 = new xyz.adscope.common.v2.cache.IBaseLruCache$ResourceCacheTask$1
                r1.<init>(r3)
                xyz.adscope.common.v2.conn.http.CommonRequestBuilder r0 = r0.concern(r1)
                java.lang.String r1 = r3.mURL
                java.io.File r2 = r3.mCacheFile
                r0.download(r1, r2)
                xyz.adscope.common.v2.conn.http.exec.IBaseHttpExecutor r0 = r0.performLocalIO()
                r0.run()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class ResourceDeleteTask implements java.lang.Runnable {
        private final java.io.File[] mDeleteFiles;

        ResourceDeleteTask(java.io.File[] r1) {
                r0 = this;
                r0.<init>()
                r0.mDeleteFiles = r1
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                java.io.File[] r0 = r4.mDeleteFiles
                if (r0 == 0) goto L10
                int r1 = r0.length
                r2 = 0
            L6:
                if (r2 >= r1) goto L10
                r3 = r0[r2]
                r3.delete()
                int r2 = r2 + 1
                goto L6
            L10:
                return
        }
    }

    IBaseLruCache() {
            r4 = this;
            r4.<init>()
            java.lang.String r0 = "%s_%s"
            r4.TASK_HOLDER_KEY_FORMAT = r0
            r0 = 1048576(0x100000, double:5.180654E-318)
            r4.M2BYTE = r0
            int r2 = r4.maxCacheSizeM()
            long r2 = (long) r2
            long r2 = r2 * r0
            r4.mMaxCacheSizeByte = r2
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4.cacheTaskHolder = r0
            return
    }

    public static /* synthetic */ int a(java.io.File r3, java.io.File r4) {
            long r0 = r3.lastModified()
            long r3 = r4.lastModified()
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 >= 0) goto Le
            r3 = 1
            return r3
        Le:
            r3 = -1
            return r3
    }

    static /* synthetic */ java.util.Map access$200(xyz.adscope.common.v2.cache.IBaseLruCache r0) {
            java.util.Map<java.lang.String, xyz.adscope.common.v2.cache.IBaseLruCache$ResourceCacheTask> r0 = r0.cacheTaskHolder
            return r0
    }

    private void clearExpireResource(java.io.File r3, int r4) {
            r2 = this;
            long r0 = xyz.adscope.common.v2.tool.date.DateUtil.getTimeMillisBeforeDay(r4)
            java.io.File[] r3 = xyz.adscope.common.v2.persistent.file.FileUtils.filterFileByExpire(r3, r0)
            xyz.adscope.common.v2.cache.IBaseLruCache$ResourceDeleteTask r4 = new xyz.adscope.common.v2.cache.IBaseLruCache$ResourceDeleteTask
            r4.<init>(r3)
            xyz.adscope.common.v2.thread.pool.CommonThreadPool r3 = xyz.adscope.common.v2.thread.pool.CommonThreadPool.getInstance()
            r3.executeResourceCacheTask(r4)
            return
    }

    private void clearOutOfMemoryResource(java.io.File r6) {
            r5 = this;
            if (r6 == 0) goto L52
            boolean r0 = r6.exists()
            if (r0 == 0) goto L52
            boolean r0 = r6.isDirectory()
            if (r0 == 0) goto L52
            long r0 = xyz.adscope.common.v2.persistent.file.FileUtils.getFolderSizeByte(r6)
            long r2 = r5.mMaxCacheSizeByte
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L52
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.io.File[] r6 = r6.listFiles()
            if (r6 == 0) goto L52
            java.util.Collections.addAll(r0, r6)
            xyz.adscope.common.v2.cache.a r6 = new xyz.adscope.common.v2.cache.a
            r6.<init>()
            java.util.Collections.sort(r0, r6)
            int r6 = r0.size()
            int r6 = r6 / 2
            if (r6 <= 0) goto L52
            java.io.File[] r1 = new java.io.File[r6]
            r2 = 0
        L39:
            if (r2 >= r6) goto L46
            java.lang.Object r3 = r0.get(r2)
            java.io.File r3 = (java.io.File) r3
            r1[r2] = r3
            int r2 = r2 + 1
            goto L39
        L46:
            xyz.adscope.common.v2.cache.IBaseLruCache$ResourceDeleteTask r6 = new xyz.adscope.common.v2.cache.IBaseLruCache$ResourceDeleteTask
            r6.<init>(r1)
            xyz.adscope.common.v2.thread.pool.CommonThreadPool r0 = xyz.adscope.common.v2.thread.pool.CommonThreadPool.getInstance()
            r0.executeResourceCacheTask(r6)
        L52:
            return
    }

    private java.lang.String getCacheFileName(java.lang.String r3) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L29
            java.lang.String r0 = xyz.adscope.common.v2.tool.str.StringUtil.getFileSuffixFromURL(r3)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L29
            java.lang.String r3 = xyz.adscope.common.v2.encrypt.impl.MD5Util.md5(r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = "."
            r1.append(r3)
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            return r3
        L29:
            java.lang.String r3 = ""
            return r3
    }

    private xyz.adscope.common.v2.cache.IBaseLruCache.ResourceCacheTask getCacheTask(java.lang.String r2, xyz.adscope.common.v2.cache.LruCacheModel r3) {
            r1 = this;
            java.util.Map<java.lang.String, xyz.adscope.common.v2.cache.IBaseLruCache$ResourceCacheTask> r0 = r1.cacheTaskHolder
            if (r0 == 0) goto L11
            java.lang.String r2 = r1.getCacheTaskKey(r2, r3)
            java.util.Map<java.lang.String, xyz.adscope.common.v2.cache.IBaseLruCache$ResourceCacheTask> r3 = r1.cacheTaskHolder
            java.lang.Object r2 = r3.get(r2)
            xyz.adscope.common.v2.cache.IBaseLruCache$ResourceCacheTask r2 = (xyz.adscope.common.v2.cache.IBaseLruCache.ResourceCacheTask) r2
            return r2
        L11:
            r2 = 0
            return r2
    }

    private java.lang.String getCacheTaskKey(java.lang.String r3, xyz.adscope.common.v2.cache.LruCacheModel r4) {
            r2 = this;
            java.lang.String r3 = r2.getCacheFileName(r3)
            java.lang.String r4 = r4.name()
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            java.lang.String r3 = "%s_%s"
            java.lang.String r3 = java.lang.String.format(r3, r0)
            return r3
    }

    private boolean hasCache(android.content.Context r1, java.lang.String r2, xyz.adscope.common.v2.cache.LruCacheModel r3) {
            r0 = this;
            java.io.File r1 = r0.getCacheDir(r1, r3)
            if (r1 == 0) goto L15
            boolean r3 = r1.exists()
            if (r3 == 0) goto L15
            java.lang.String r2 = r0.getCacheFileName(r2)
            boolean r1 = xyz.adscope.common.v2.persistent.file.FileUtils.hasFile(r1, r2)
            return r1
        L15:
            r1 = 0
            return r1
    }

    private boolean isCaching(java.lang.String r2, xyz.adscope.common.v2.cache.LruCacheModel r3) {
            r1 = this;
            java.util.Map<java.lang.String, xyz.adscope.common.v2.cache.IBaseLruCache$ResourceCacheTask> r0 = r1.cacheTaskHolder
            if (r0 == 0) goto Ld
            java.lang.String r2 = r1.getCacheTaskKey(r2, r3)
            boolean r2 = r0.containsKey(r2)
            return r2
        Ld:
            r2 = 0
            return r2
    }

    @Override // xyz.adscope.common.v2.cache.IResourceLruCache
    public void cacheResource(android.content.Context r4, java.lang.String r5, xyz.adscope.common.v2.cache.LruCacheModel r6) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L36
            boolean r0 = r3.hasCache(r4, r5, r6)
            if (r0 != 0) goto L36
            boolean r0 = r3.isCaching(r5, r6)
            if (r0 != 0) goto L36
            java.lang.String r0 = r3.getCacheFileName(r5)
            java.io.File r4 = r3.getCacheDir(r4, r6)
            if (r4 == 0) goto L36
            java.lang.String r6 = r3.getCacheTaskKey(r5, r6)
            xyz.adscope.common.v2.cache.IBaseLruCache$1 r1 = new xyz.adscope.common.v2.cache.IBaseLruCache$1
            java.io.File r2 = new java.io.File
            r2.<init>(r4, r0)
            r1.<init>(r3, r5, r2, r6)
            java.util.Map<java.lang.String, xyz.adscope.common.v2.cache.IBaseLruCache$ResourceCacheTask> r4 = r3.cacheTaskHolder
            r4.put(r6, r1)
            xyz.adscope.common.v2.thread.pool.CommonThreadPool r4 = xyz.adscope.common.v2.thread.pool.CommonThreadPool.getInstance()
            r4.executeResourceCacheTask(r1)
        L36:
            return
    }

    protected abstract java.io.File getCacheDir(android.content.Context r1, xyz.adscope.common.v2.cache.LruCacheModel r2);

    @Override // xyz.adscope.common.v2.cache.IResourceLruCache
    public void getCacheResource(android.content.Context r4, java.lang.String r5, xyz.adscope.common.v2.cache.LruCacheModel r6, xyz.adscope.common.v2.cache.IResourceLruCache.IResourceCacheCallback r7) {
            r3 = this;
            boolean r0 = r3.isCaching(r5, r6)
            if (r0 == 0) goto L10
            xyz.adscope.common.v2.cache.IBaseLruCache$ResourceCacheTask r4 = r3.getCacheTask(r5, r6)
            if (r4 == 0) goto L31
            xyz.adscope.common.v2.cache.IBaseLruCache.ResourceCacheTask.access$000(r4, r7)
            return
        L10:
            java.io.File r0 = r3.getCacheDir(r4, r6)
            if (r0 == 0) goto L31
            java.lang.String r1 = r3.getCacheFileName(r5)
            java.io.File r2 = new java.io.File
            r2.<init>(r0, r1)
            boolean r0 = r2.exists()
            if (r0 == 0) goto L2b
            if (r7 == 0) goto L31
            r7.onCacheDone(r2)
            return
        L2b:
            r3.cacheResource(r4, r5, r6)
            r3.getCacheResource(r4, r5, r6, r7)
        L31:
            return
    }

    protected abstract int maxCacheSizeM();

    @Override // xyz.adscope.common.v2.cache.IResourceLruCache
    public void releaseCacheDirMemory(android.content.Context r2) {
            r1 = this;
            xyz.adscope.common.v2.cache.LruCacheModel r0 = xyz.adscope.common.v2.cache.LruCacheModel.TEMPORARY
            java.io.File r2 = r1.getCacheDir(r2, r0)
            if (r2 == 0) goto Lf
            r0 = 7
            r1.clearExpireResource(r2, r0)
            r1.clearOutOfMemoryResource(r2)
        Lf:
            return
    }
}
