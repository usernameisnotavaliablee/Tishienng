package xyz.adscope.common.v2.cache2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class IBaseLruCache2 implements xyz.adscope.common.v2.cache2.IResourceLruCache2 {
    private final long M2BYTE;
    private final java.util.Map<java.lang.String, xyz.adscope.common.v2.cache2.IBaseLruCache2.ResourceCacheTask<?>> cacheTaskHolder;
    private final java.util.Map<java.lang.String, java.util.List<xyz.adscope.common.v2.cache2.IResourceCacheCallback>> callbackHolder;
    protected final java.lang.Object lock;
    private final long mMaxCacheSizeByte;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: xyz.adscope.common.v2.cache2.IBaseLruCache2$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class CacheResDelTask implements java.lang.Runnable {
        private final java.io.File mCacheDir;
        private final int mExpireDays;
        private final long mMaxCacheSizeByte;

        private CacheResDelTask(java.io.File r2, long r3) {
                r1 = this;
                r1.<init>()
                r0 = 7
                r1.mExpireDays = r0
                r1.mCacheDir = r2
                r1.mMaxCacheSizeByte = r3
                return
        }

        /* synthetic */ CacheResDelTask(java.io.File r1, long r2, xyz.adscope.common.v2.cache2.IBaseLruCache2.AnonymousClass1 r4) {
                r0 = this;
                r0.<init>(r1, r2)
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

        private void deleteExpire() {
                r3 = this;
                r0 = 7
                long r0 = xyz.adscope.common.v2.tool.date.DateUtil.getTimeMillisBeforeDay(r0)
                java.io.File r2 = r3.mCacheDir
                java.io.File[] r0 = xyz.adscope.common.v2.persistent.file.FileUtils.filterFileByExpire(r2, r0)
                if (r0 == 0) goto L13
                int r1 = r0.length
                if (r1 <= 0) goto L13
                r3.deleteFiles(r0)
            L13:
                return
        }

        private void deleteFiles(java.io.File[] r4) {
                r3 = this;
                if (r4 == 0) goto Le
                int r0 = r4.length
                r1 = 0
            L4:
                if (r1 >= r0) goto Le
                r2 = r4[r1]
                r2.delete()
                int r1 = r1 + 1
                goto L4
            Le:
                return
        }

        private void deleteOverMemory() {
                r5 = this;
                java.io.File r0 = r5.mCacheDir
                long r0 = xyz.adscope.common.v2.persistent.file.FileUtils.getFolderSizeByte(r0)
                long r2 = r5.mMaxCacheSizeByte
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 <= 0) goto L3f
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.io.File r1 = r5.mCacheDir
                java.io.File[] r1 = r1.listFiles()
                if (r1 == 0) goto L3f
                java.util.Collections.addAll(r0, r1)
                xyz.adscope.common.v2.cache2.a r1 = new xyz.adscope.common.v2.cache2.a
                r1.<init>()
                java.util.Collections.sort(r0, r1)
                int r1 = r0.size()
                int r1 = r1 / 2
                if (r1 <= 0) goto L3f
                java.io.File[] r2 = new java.io.File[r1]
                r3 = 0
            L2f:
                if (r3 >= r1) goto L3c
                java.lang.Object r4 = r0.get(r3)
                java.io.File r4 = (java.io.File) r4
                r2[r3] = r4
                int r3 = r3 + 1
                goto L2f
            L3c:
                r5.deleteFiles(r2)
            L3f:
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                java.io.File r0 = r1.mCacheDir
                if (r0 == 0) goto L18
                boolean r0 = r0.exists()
                if (r0 == 0) goto L18
                java.io.File r0 = r1.mCacheDir
                boolean r0 = r0.isDirectory()
                if (r0 == 0) goto L18
                r1.deleteExpire()
                r1.deleteOverMemory()
            L18:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    protected interface LruCacheHttpRespCallback<T> {
        void onCacheException(java.lang.String r1);

        void onCacheReady(java.lang.String r1, T r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    protected static abstract class ResourceCacheTask<T> implements java.lang.Runnable {
        protected final java.io.File mCacheFile;
        protected xyz.adscope.common.v2.cache2.IBaseLruCache2.LruCacheHttpRespCallback<T> mHttpRespCallback;
        protected final java.lang.String mTaskKey;
        protected final java.lang.String mURL;

        protected ResourceCacheTask(java.lang.String r1, java.io.File r2, java.lang.String r3) {
                r0 = this;
                r0.<init>()
                r0.mURL = r1
                r0.mCacheFile = r2
                r0.mTaskKey = r3
                return
        }

        protected void setHttpResponseCallback(xyz.adscope.common.v2.cache2.IBaseLruCache2.LruCacheHttpRespCallback<T> r1) {
                r0 = this;
                r0.mHttpRespCallback = r1
                return
        }
    }

    IBaseLruCache2() {
            r4 = this;
            r4.<init>()
            r0 = 1048576(0x100000, double:5.180654E-318)
            r4.M2BYTE = r0
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r4.lock = r2
            int r2 = r4.maxCacheSizeM()
            long r2 = (long) r2
            long r2 = r2 * r0
            r4.mMaxCacheSizeByte = r2
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4.cacheTaskHolder = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4.callbackHolder = r0
            return
    }

    private void clearResource(android.content.Context r5, java.io.File r6) {
            r4 = this;
            xyz.adscope.common.v2.cache2.IBaseLruCache2$CacheResDelTask r0 = new xyz.adscope.common.v2.cache2.IBaseLruCache2$CacheResDelTask
            long r1 = r4.mMaxCacheSizeByte
            r3 = 0
            r0.<init>(r6, r1, r3)
            xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager r6 = xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager.getInstance()
            android.content.Context r5 = r5.getApplicationContext()
            android.content.Context r5 = com.stub.StubApp.getOrigApplicationContext(r5)
            java.lang.Object r5 = r6.getOrCreateImplement(r5)
            xyz.adscope.common.v2.thread.pool.IBaseThreadPool r5 = (xyz.adscope.common.v2.thread.pool.IBaseThreadPool) r5
            r5.executeResourceCacheTask(r0)
            return
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

    private boolean isCaching(java.lang.String r3) {
            r2 = this;
            java.util.Map<java.lang.String, xyz.adscope.common.v2.cache2.IBaseLruCache2$ResourceCacheTask<?>> r0 = r2.cacheTaskHolder
            monitor-enter(r0)
            java.util.Map<java.lang.String, xyz.adscope.common.v2.cache2.IBaseLruCache2$ResourceCacheTask<?>> r1 = r2.cacheTaskHolder     // Catch: java.lang.Throwable -> Lf
            java.lang.String r3 = r2.getCacheTaskKey(r3)     // Catch: java.lang.Throwable -> Lf
            boolean r3 = r1.containsKey(r3)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r3
        Lf:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r3
    }

    private void putCacheTask(java.lang.String r3, xyz.adscope.common.v2.cache2.IBaseLruCache2.ResourceCacheTask<?> r4) {
            r2 = this;
            java.util.Map<java.lang.String, xyz.adscope.common.v2.cache2.IBaseLruCache2$ResourceCacheTask<?>> r0 = r2.cacheTaskHolder
            monitor-enter(r0)
            java.util.Map<java.lang.String, xyz.adscope.common.v2.cache2.IBaseLruCache2$ResourceCacheTask<?>> r1 = r2.cacheTaskHolder     // Catch: java.lang.Throwable -> La
            r1.put(r3, r4)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r3
    }

    private void saveResCallback(java.lang.String r3, xyz.adscope.common.v2.cache2.IResourceCacheCallback r4) {
            r2 = this;
            java.util.Map<java.lang.String, java.util.List<xyz.adscope.common.v2.cache2.IResourceCacheCallback>> r0 = r2.callbackHolder
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.util.List<xyz.adscope.common.v2.cache2.IResourceCacheCallback>> r1 = r2.callbackHolder     // Catch: java.lang.Throwable -> L13
            java.lang.Object r1 = r1.get(r3)     // Catch: java.lang.Throwable -> L13
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r3 = move-exception
            goto L1f
        L15:
            r1.add(r4)     // Catch: java.lang.Throwable -> L13
            java.util.Map<java.lang.String, java.util.List<xyz.adscope.common.v2.cache2.IResourceCacheCallback>> r4 = r2.callbackHolder     // Catch: java.lang.Throwable -> L13
            r4.put(r3, r1)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r3
    }

    @Override // xyz.adscope.common.v2.cache2.IResourceLruCache2
    public void cacheResource(android.content.Context r4, java.lang.String r5, xyz.adscope.common.v2.cache.LruCacheModel r6) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L41
            boolean r0 = r3.hasCache(r4, r5, r6)
            if (r0 != 0) goto L41
            boolean r0 = r3.isCaching(r5)
            if (r0 != 0) goto L41
            java.lang.String r0 = r3.getCacheFileName(r5)
            java.io.File r6 = r3.getCacheDir(r4, r6)
            if (r6 == 0) goto L41
            java.lang.String r1 = r3.getCacheTaskKey(r5)
            java.io.File r2 = new java.io.File
            r2.<init>(r6, r0)
            xyz.adscope.common.v2.cache2.IBaseLruCache2$ResourceCacheTask r5 = r3.getResourceCacheTask(r5, r2, r1)
            r3.putCacheTask(r1, r5)
            xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager r6 = xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager.getInstance()
            android.content.Context r4 = r4.getApplicationContext()
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)
            java.lang.Object r4 = r6.getOrCreateImplement(r4)
            xyz.adscope.common.v2.thread.pool.IBaseThreadPool r4 = (xyz.adscope.common.v2.thread.pool.IBaseThreadPool) r4
            r4.executeResourceCacheTask(r5)
        L41:
            return
    }

    protected void callbackResource(java.lang.String r4, java.io.File r5) {
            r3 = this;
            java.util.Map<java.lang.String, java.util.List<xyz.adscope.common.v2.cache2.IResourceCacheCallback>> r0 = r3.callbackHolder
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.util.List<xyz.adscope.common.v2.cache2.IResourceCacheCallback>> r1 = r3.callbackHolder     // Catch: java.lang.Throwable -> L16
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L16
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L18
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L16
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L16
            r1.clear()     // Catch: java.lang.Throwable -> L16
            goto L19
        L16:
            r4 = move-exception
            goto L3f
        L18:
            r2 = 0
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto L3e
            java.util.Iterator r0 = r2.iterator()
        L20:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r0.next()
            xyz.adscope.common.v2.cache2.IResourceCacheCallback r1 = (xyz.adscope.common.v2.cache2.IResourceCacheCallback) r1
            if (r1 == 0) goto L20
            if (r5 == 0) goto L3a
            boolean r2 = r5.exists()
            if (r2 == 0) goto L3a
            r1.onCacheFile(r4, r5)
            goto L20
        L3a:
            r1.onCacheException(r4)
            goto L20
        L3e:
            return
        L3f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r4
    }

    protected void callbackResourceInputStream(java.lang.String r4, java.io.InputStream r5, java.io.File r6) {
            r3 = this;
            java.util.Map<java.lang.String, java.util.List<xyz.adscope.common.v2.cache2.IResourceCacheCallback>> r0 = r3.callbackHolder
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.util.List<xyz.adscope.common.v2.cache2.IResourceCacheCallback>> r1 = r3.callbackHolder     // Catch: java.lang.Throwable -> L16
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L16
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L18
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L16
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L16
            r1.clear()     // Catch: java.lang.Throwable -> L16
            goto L19
        L16:
            r4 = move-exception
            goto L39
        L18:
            r2 = 0
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto L38
            java.util.Iterator r0 = r2.iterator()
        L20:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L38
            java.lang.Object r1 = r0.next()
            xyz.adscope.common.v2.cache2.IResourceCacheCallback r1 = (xyz.adscope.common.v2.cache2.IResourceCacheCallback) r1
            if (r1 == 0) goto L20
            if (r5 == 0) goto L34
            r1.onCacheInputStream(r4, r5, r6)
            goto L20
        L34:
            r1.onCacheException(r4)
            goto L20
        L38:
            return
        L39:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r4
    }

    protected abstract java.io.File getCacheDir(android.content.Context r1, xyz.adscope.common.v2.cache.LruCacheModel r2);

    protected java.lang.String getCacheFileName(java.lang.String r3) {
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

    @Override // xyz.adscope.common.v2.cache2.IResourceLruCache2
    public void getCacheResource(android.content.Context r6, java.lang.String r7, xyz.adscope.common.v2.cache.LruCacheModel r8, xyz.adscope.common.v2.cache2.IResourceCacheCallback r9) {
            r5 = this;
            java.lang.String r0 = r5.getCacheTaskKey(r7)
            java.lang.Object r1 = r5.lock
            monitor-enter(r1)
            boolean r2 = r5.isCaching(r7)     // Catch: java.lang.Throwable -> L11
            if (r2 == 0) goto L13
            r5.saveResCallback(r0, r9)     // Catch: java.lang.Throwable -> L11
            goto L34
        L11:
            r6 = move-exception
            goto L36
        L13:
            java.io.File r2 = r5.getCacheDir(r6, r8)     // Catch: java.lang.Throwable -> L11
            if (r2 == 0) goto L34
            java.lang.String r3 = r5.getCacheFileName(r7)     // Catch: java.lang.Throwable -> L11
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L11
            r4.<init>(r2, r3)     // Catch: java.lang.Throwable -> L11
            boolean r2 = r4.exists()     // Catch: java.lang.Throwable -> L11
            if (r2 == 0) goto L2e
            if (r9 == 0) goto L34
            r9.onCacheFile(r0, r4)     // Catch: java.lang.Throwable -> L11
            goto L34
        L2e:
            r5.saveResCallback(r0, r9)     // Catch: java.lang.Throwable -> L11
            r5.cacheResource(r6, r7, r8)     // Catch: java.lang.Throwable -> L11
        L34:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11
            return
        L36:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11
            throw r6
    }

    protected java.lang.String getCacheTaskKey(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = xyz.adscope.common.v2.encrypt.impl.MD5Util.md5(r1)
            return r1
    }

    protected abstract xyz.adscope.common.v2.cache2.IBaseLruCache2.ResourceCacheTask<?> getResourceCacheTask(java.lang.String r1, java.io.File r2, java.lang.String r3);

    protected abstract int maxCacheSizeM();

    @Override // xyz.adscope.common.v2.cache2.IResourceLruCache2
    public void releaseCacheDirMemory(android.content.Context r2) {
            r1 = this;
            xyz.adscope.common.v2.cache.LruCacheModel r0 = xyz.adscope.common.v2.cache.LruCacheModel.TEMPORARY
            java.io.File r0 = r1.getCacheDir(r2, r0)
            if (r0 == 0) goto Lb
            r1.clearResource(r2, r0)
        Lb:
            return
    }

    protected void removeCacheTask(java.lang.String r3) {
            r2 = this;
            java.util.Map<java.lang.String, xyz.adscope.common.v2.cache2.IBaseLruCache2$ResourceCacheTask<?>> r0 = r2.cacheTaskHolder
            monitor-enter(r0)
            java.util.Map<java.lang.String, xyz.adscope.common.v2.cache2.IBaseLruCache2$ResourceCacheTask<?>> r1 = r2.cacheTaskHolder     // Catch: java.lang.Throwable -> La
            r1.remove(r3)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r3
    }
}
