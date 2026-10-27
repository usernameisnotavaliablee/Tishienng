package xyz.adscope.common.cache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class CacheManager {
    private static final java.lang.String c = null;
    private static xyz.adscope.common.cache.CacheManager d;
    private xyz.adscope.common.db.DataBaseManager a;
    private android.content.Context b;

    static {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "image_cache"
            r0.append(r1)
            java.lang.String r1 = java.io.File.separator
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            xyz.adscope.common.cache.CacheManager.c = r0
            return
    }

    public CacheManager(android.content.Context r4) {
            r3 = this;
            r3.<init>()
            r3.b = r4
            xyz.adscope.common.db.DataBaseManager r0 = new xyz.adscope.common.db.DataBaseManager
            r0.<init>(r4)
            r3.a = r0
            java.lang.String r1 = "cache_image_video_table"
            java.lang.Class<xyz.adscope.common.cache.model.CacheModel> r2 = xyz.adscope.common.cache.model.CacheModel.class
            r0.setTableNameAndModel(r1, r2)
            java.lang.String r0 = xyz.adscope.common.cache.CacheManager.c
            java.io.File r4 = xyz.adscope.common.imageloader.StorageUtils.getFilesCacheDirectory(r4, r0)
            boolean r0 = r4.exists()
            if (r0 != 0) goto L22
            r4.mkdirs()
        L22:
            return
    }

    private long a(java.io.File r7) {
            r6 = this;
            boolean r0 = r7.exists()
            r1 = 0
            if (r0 == 0) goto L22
            boolean r0 = r7.isDirectory()
            if (r0 == 0) goto L22
            java.io.File[] r7 = r7.listFiles()
            if (r7 == 0) goto L22
            int r0 = r7.length
            r3 = 0
        L16:
            if (r3 >= r0) goto L22
            r4 = r7[r3]
            long r4 = r4.length()
            long r1 = r1 + r4
            int r3 = r3 + 1
            goto L16
        L22:
            return r1
    }

    private java.io.File a(boolean r2, java.lang.String r3) {
            r1 = this;
            if (r2 == 0) goto L7
            java.lang.String r2 = r1.a()
            goto Lb
        L7:
            java.lang.String r2 = r1.c()
        Lb:
            android.content.Context r0 = r1.b
            java.io.File r2 = xyz.adscope.common.imageloader.StorageUtils.getFilesCacheDirectory(r0, r2)
            boolean r0 = r2.exists()
            if (r0 != 0) goto L1a
            r2.mkdirs()
        L1a:
            java.io.File r0 = new java.io.File
            java.lang.String r2 = r2.getPath()
            r0.<init>(r2, r3)
            return r0
    }

    private java.lang.String a() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = xyz.adscope.common.cache.CacheManager.c
            r0.append(r1)
            java.lang.String r1 = "can_delete"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    private void a(java.lang.String r3) {
            r2 = this;
            r0 = 1
            java.io.File r0 = r2.a(r0, r3)
            boolean r1 = r0.exists()
            if (r1 == 0) goto Le
            r0.delete()
        Le:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "fileName"
            r0.put(r1, r3)
            xyz.adscope.common.db.DataBaseManager r3 = r2.a
            if (r3 == 0) goto L1f
            r3.delete(r0)
        L1f:
            return
    }

    private java.util.List<xyz.adscope.common.cache.model.CacheModel> b() {
            r4 = this;
            xyz.adscope.common.db.DataBaseManager r0 = r4.a
            r1 = 0
            if (r0 == 0) goto L3b
            java.util.List r0 = r0.query(r1)
            if (r0 == 0) goto L18
            int r2 = r0.size()
            if (r2 <= 0) goto L18
            int r0 = r0.size()
            int r0 = r0 / 2
            goto L19
        L18:
            r0 = 0
        L19:
            xyz.adscope.common.db.DataBaseManager r2 = r4.a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = ""
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r3 = "lastUsedTime"
            java.util.List r0 = r2.query(r3, r0)
            if (r0 == 0) goto L3b
            int r2 = r0.size()
            if (r2 <= 0) goto L3b
            return r0
        L3b:
            return r1
    }

    private java.lang.String c() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = xyz.adscope.common.cache.CacheManager.c
            r0.append(r1)
            java.lang.String r1 = "no_delete"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static xyz.adscope.common.cache.CacheManager getInstance(android.content.Context r2) {
            xyz.adscope.common.cache.CacheManager r0 = xyz.adscope.common.cache.CacheManager.d
            if (r0 != 0) goto L19
            java.lang.Class<xyz.adscope.common.cache.CacheManager> r0 = xyz.adscope.common.cache.CacheManager.class
            monitor-enter(r0)
            xyz.adscope.common.cache.CacheManager r1 = xyz.adscope.common.cache.CacheManager.d     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            xyz.adscope.common.cache.CacheManager r1 = new xyz.adscope.common.cache.CacheManager     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L13
            xyz.adscope.common.cache.CacheManager.d = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r2 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r2
        L19:
            xyz.adscope.common.cache.CacheManager r2 = xyz.adscope.common.cache.CacheManager.d
            return r2
    }

    public android.graphics.Bitmap getBitmapByFileName(java.lang.String r5, boolean r6) {
            r4 = this;
            if (r6 == 0) goto L2b
            xyz.adscope.common.db.DataBaseManager r0 = r4.a
            if (r0 == 0) goto L2b
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = xyz.adscope.common.tool.security.MD5Util.md5(r5)
            java.lang.String r2 = "fileName"
            r0.put(r2, r1)
            android.content.ContentValues r1 = new android.content.ContentValues
            r1.<init>()
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "lastUsedTime"
            r1.put(r3, r2)
            xyz.adscope.common.db.DataBaseManager r2 = r4.a
            r2.update(r0, r1)
        L2b:
            java.lang.String r5 = xyz.adscope.common.tool.security.MD5Util.md5(r5)
            java.io.File r5 = r4.a(r6, r5)
            boolean r6 = r5.exists()
            if (r6 == 0) goto L4c
            long r0 = r5.length()
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L4c
            java.lang.String r5 = r5.getAbsolutePath()
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeFile(r5)
            return r5
        L4c:
            r5 = 0
            return r5
    }

    public void performCacheCleanup() {
            r5 = this;
            java.lang.String r0 = r5.a()
            android.content.Context r1 = r5.b
            java.io.File r0 = xyz.adscope.common.imageloader.StorageUtils.getFilesCacheDirectory(r1, r0)
            long r0 = r5.a(r0)
            r2 = 209715200(0xc800000, double:1.036130757E-315)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L39
            java.util.List r0 = r5.b()
            if (r0 == 0) goto L39
            int r1 = r0.size()
            if (r1 <= 0) goto L39
            java.util.Iterator r0 = r0.iterator()
        L25:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L39
            java.lang.Object r1 = r0.next()
            xyz.adscope.common.cache.model.CacheModel r1 = (xyz.adscope.common.cache.model.CacheModel) r1
            java.lang.String r1 = r1.getFileName()
            r5.a(r1)
            goto L25
        L39:
            return
    }

    public void saveImage(java.lang.String r5, android.graphics.Bitmap r6, boolean r7) {
            r4 = this;
            java.lang.String r0 = xyz.adscope.common.tool.security.MD5Util.md5(r5)
            java.io.File r0 = r4.a(r7, r0)
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> L15
            r1.<init>(r0)     // Catch: java.lang.Exception -> L15
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Exception -> L15
            r3 = 100
            r6.compress(r2, r3, r1)     // Catch: java.lang.Exception -> L15
            goto L16
        L15:
        L16:
            if (r7 == 0) goto L3e
            xyz.adscope.common.cache.model.CacheModel r6 = new xyz.adscope.common.cache.model.CacheModel
            r6.<init>()
            long r0 = r0.length()
            r6.setFileSize(r0)
            java.lang.String r5 = xyz.adscope.common.tool.security.MD5Util.md5(r5)
            r6.setFileName(r5)
            r5 = r7 ^ 1
            r6.setCanDelete(r5)
            long r0 = java.lang.System.currentTimeMillis()
            r6.setLastUsedTime(r0)
            xyz.adscope.common.db.DataBaseManager r5 = r4.a
            if (r5 == 0) goto L3e
            r5.insert(r6)
        L3e:
            return
    }
}
