package com.bykv.vk.component.ttvideo;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class DataLoaderHelper implements com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderListener, com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLStartCompleteListener {
    public static final int DATALOADER_KEY_ENABLE_ALOG = 512;
    public static final int DATALOADER_KEY_INT_MAXCACHESIZE = 1;
    public static final int DATALOADER_KEY_INT_OPENTIMEOUT = 3;
    public static final int DATALOADER_KEY_INT_PARALLEL_NUM = 11;
    public static final int DATALOADER_KEY_INT_RWTIMEOUT = 2;
    public static final int DATALOADER_KEY_INT_TRYCOUNT = 4;
    public static final int DATALOADER_KEY_SET_MDL_PROTOCOL_ENABLE = 1005;
    public static final int DATALOADER_KEY_STRING_CACHEDIR = 0;
    public static final int IsClose = 1;
    public static final int IsPlayTask = 1;
    public static final int IsPreloadTask = 2;
    public static final int IsStart = 0;
    public static final int IsUnknown = 0;
    public static final java.lang.String MDL_PREFIX = "mdl://";

    /* renamed from: p, reason: collision with root package name */
    private static final com.bykv.vk.component.ttvideo.DataLoaderHelper f1632p = null;

    /* renamed from: q, reason: collision with root package name */
    private static int f1633q;

    /* renamed from: r, reason: collision with root package name */
    private static int f1634r;

    /* renamed from: s, reason: collision with root package name */
    private static int f1635s;
    private volatile int a;
    private final com.bykv.vk.component.ttvideo.DataLoaderHelper.d b;
    private final com.bykv.vk.component.ttvideo.DataLoaderHelper.d c;
    private final com.bykv.vk.component.ttvideo.DataLoaderHelper.d d;
    private final com.bykv.vk.component.ttvideo.DataLoaderHelper.d e;
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bykv.vk.component.ttvideo.DataLoaderHelper.c> f;
    private final java.util.HashMap<java.lang.String, java.util.ArrayList<com.bykv.vk.component.ttvideo.TTVideoEngine>> g;
    private final java.util.concurrent.locks.ReentrantLock h;
    private com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader i;
    private com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure j;
    private com.bykv.vk.component.ttvideo.log.VideoEventEngineUploader k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f1636l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f1637m;

    /* renamed from: n, reason: collision with root package name */
    private int f1638n;

    /* renamed from: o, reason: collision with root package name */
    private final java.util.concurrent.locks.ReentrantLock f1639o;

    public class DataLoaderCacheInfo {
        public long mCacheSizeFromZero;
        public java.lang.String mLocalFilePath;
        public long mMediaSize;

        public DataLoaderCacheInfo(com.bykv.vk.component.ttvideo.DataLoaderHelper r3) {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.mMediaSize = r0
                r2.mCacheSizeFromZero = r0
                r3 = 0
                r2.mLocalFilePath = r3
                return
        }
    }

    public static class DataLoaderTaskProgressInfo {
        public long mCacheSizeFromZero;
        public java.lang.String mKey;
        public java.lang.String mLocalFilePath;
        public long mMediaSize;
        public int mTaskType;
        public java.lang.String mVideoId;

        public DataLoaderTaskProgressInfo() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.mKey = r0
                r2.mVideoId = r0
                r2.mLocalFilePath = r0
                r0 = 0
                r2.mMediaSize = r0
                r2.mCacheSizeFromZero = r0
                r0 = 0
                r2.mTaskType = r0
                return
        }
    }

    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    public class b {
        public java.lang.String a;
        public long b;
        public com.bykv.vk.component.ttvideo.PreloaderURLItem c;
        public boolean d;
        public java.util.List<com.bykv.vk.component.ttvideo.DataLoaderHelper.b.a> e;

        public class a {
            public java.lang.String a;
            public java.lang.String b;
            public java.lang.String[] c;
            public java.lang.String d;
            public long e;
            public long f;
            public long g;
            public long h;
            public long i;

            public a(com.bykv.vk.component.ttvideo.DataLoaderHelper.b r3) {
                    r2 = this;
                    r2.<init>()
                    r3 = 0
                    r2.a = r3
                    r2.b = r3
                    r2.c = r3
                    r2.d = r3
                    r0 = 0
                    r2.e = r0
                    r2.f = r0
                    r2.g = r0
                    r2.h = r0
                    r2.i = r0
                    return
            }
        }

        public b(com.bykv.vk.component.ttvideo.DataLoaderHelper r3) {
                r2 = this;
                r2.<init>()
                r3 = 0
                r2.a = r3
                r0 = 0
                r2.b = r0
                r2.c = r3
                r3 = 0
                r2.d = r3
                java.util.concurrent.CopyOnWriteArrayList r3 = new java.util.concurrent.CopyOnWriteArrayList
                r3.<init>()
                r2.e = r3
                return
        }

        public com.bykv.vk.component.ttvideo.DataLoaderHelper.b.a a(java.lang.String r2) {
                r1 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r2)
                if (r0 == 0) goto L8
                r2 = 0
                return r2
            L8:
                com.bykv.vk.component.ttvideo.DataLoaderHelper$b$a r0 = r1.b(r2)
                if (r0 != 0) goto L1a
                com.bykv.vk.component.ttvideo.DataLoaderHelper$b$a r0 = new com.bykv.vk.component.ttvideo.DataLoaderHelper$b$a
                r0.<init>(r1)
                r0.a = r2
                java.util.List<com.bykv.vk.component.ttvideo.DataLoaderHelper$b$a> r2 = r1.e
                r2.add(r0)
            L1a:
                return r0
        }

        public com.bykv.vk.component.ttvideo.IPreLoaderItemCallBackListener a() {
                r1 = this;
                com.bykv.vk.component.ttvideo.PreloaderURLItem r0 = r1.c
                if (r0 == 0) goto L11
                com.bykv.vk.component.ttvideo.IPreLoaderItemCallBackListener r0 = r0.getCallBackListener()
                if (r0 == 0) goto L11
                com.bykv.vk.component.ttvideo.PreloaderURLItem r0 = r1.c
                com.bykv.vk.component.ttvideo.IPreLoaderItemCallBackListener r0 = r0.getCallBackListener()
                return r0
            L11:
                r0 = 0
                return r0
        }

        public void a(int r4) {
                r3 = this;
                com.bykv.vk.component.ttvideo.IPreLoaderItemCallBackListener r0 = r3.a()
                if (r0 == 0) goto L22
                com.bykv.vk.component.ttvideo.DataLoaderHelper.c()
                com.bykv.vk.component.ttvideo.DataLoaderHelper.b()
                com.bykv.vk.component.ttvideo.PreLoaderItemCallBackInfo r0 = new com.bykv.vk.component.ttvideo.PreLoaderItemCallBackInfo
                r1 = 3
                r0.<init>(r1)
                com.bykv.vk.component.ttvideo.utils.Error r1 = new com.bykv.vk.component.ttvideo.utils.Error
                java.lang.String r2 = "kTTVideoErrorDomainDataLoaderPreload"
                r1.<init>(r2, r4)
                r0.preloadError = r1
                com.bykv.vk.component.ttvideo.IPreLoaderItemCallBackListener r4 = r3.a()
                r4.preloadItemInfo(r0)
            L22:
                return
        }

        public void a(java.lang.String r2, long r3) {
                r1 = this;
                java.util.List<com.bykv.vk.component.ttvideo.DataLoaderHelper$b$a> r0 = r1.e
                int r0 = r0.size()
                if (r0 != 0) goto L17
                com.bykv.vk.component.ttvideo.DataLoaderHelper$b$a r0 = new com.bykv.vk.component.ttvideo.DataLoaderHelper$b$a
                r0.<init>(r1)
                r0.a = r2
                r0.g = r3
                java.util.List<com.bykv.vk.component.ttvideo.DataLoaderHelper$b$a> r2 = r1.e
                r2.add(r0)
                goto L1e
            L17:
                java.lang.String r2 = "DataLoaderHelper"
                java.lang.String r0 = "[preload] DataLoaderTaskItem setup fail"
                com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.e(r2, r0)
            L1e:
                r1.b = r3
                return
        }

        public com.bykv.vk.component.ttvideo.DataLoaderHelper.b.a b(java.lang.String r4) {
                r3 = this;
                java.util.List<com.bykv.vk.component.ttvideo.DataLoaderHelper$b$a> r0 = r3.e
                int r0 = r0.size()
                if (r0 <= 0) goto L25
                r0 = 0
            L9:
                java.util.List<com.bykv.vk.component.ttvideo.DataLoaderHelper$b$a> r1 = r3.e
                int r1 = r1.size()
                if (r0 >= r1) goto L25
                java.util.List<com.bykv.vk.component.ttvideo.DataLoaderHelper$b$a> r1 = r3.e
                java.lang.Object r1 = r1.get(r0)
                com.bykv.vk.component.ttvideo.DataLoaderHelper$b$a r1 = (com.bykv.vk.component.ttvideo.DataLoaderHelper.b.a) r1
                java.lang.String r2 = r1.a
                boolean r2 = r2.equals(r4)
                if (r2 != 0) goto L24
                int r0 = r0 + 1
                goto L9
            L24:
                return r1
            L25:
                r4 = 0
                return r4
        }
    }

    public class c {
        public java.lang.String a;
        public int b;
        public java.util.List<com.bykv.vk.component.ttvideo.DataLoaderHelper.c.a> c;

        public class a {
            public java.lang.String a;
            public long b;
            public long c;
            public java.util.List<com.bykv.vk.component.ttvideo.DataLoaderHelper.c.a.C0170a> d;
            public java.lang.String e;
            public com.bykv.vk.component.ttvideo.utils.Error f;

            /* renamed from: com.bykv.vk.component.ttvideo.DataLoaderHelper$c$a$a, reason: collision with other inner class name */
            public class C0170a {
                public long a;
                public long b;

                public C0170a(com.bykv.vk.component.ttvideo.DataLoaderHelper.c.a r3) {
                        r2 = this;
                        r2.<init>()
                        r0 = 0
                        r2.a = r0
                        r2.b = r0
                        return
                }
            }

            public a(com.bykv.vk.component.ttvideo.DataLoaderHelper.c r3) {
                    r2 = this;
                    r2.<init>()
                    r3 = 0
                    r2.a = r3
                    r0 = 0
                    r2.b = r0
                    r2.c = r0
                    r2.d = r3
                    r2.f = r3
                    return
            }

            void a(long r5) {
                    r4 = this;
                    java.util.List<com.bykv.vk.component.ttvideo.DataLoaderHelper$c$a$a> r0 = r4.d
                    if (r0 != 0) goto Lb
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    r4.d = r0
                Lb:
                    java.util.List<com.bykv.vk.component.ttvideo.DataLoaderHelper$c$a$a> r0 = r4.d
                    int r0 = r0.size()
                    if (r0 != 0) goto L1d
                    java.util.List<com.bykv.vk.component.ttvideo.DataLoaderHelper$c$a$a> r0 = r4.d
                    com.bykv.vk.component.ttvideo.DataLoaderHelper$c$a$a r1 = new com.bykv.vk.component.ttvideo.DataLoaderHelper$c$a$a
                    r1.<init>(r4)
                    r0.add(r1)
                L1d:
                    java.util.List<com.bykv.vk.component.ttvideo.DataLoaderHelper$c$a$a> r0 = r4.d
                    r1 = 0
                    java.lang.Object r0 = r0.get(r1)
                    com.bykv.vk.component.ttvideo.DataLoaderHelper$c$a$a r0 = (com.bykv.vk.component.ttvideo.DataLoaderHelper.c.a.C0170a) r0
                    r2 = 0
                    r0.a = r2
                    java.util.List<com.bykv.vk.component.ttvideo.DataLoaderHelper$c$a$a> r0 = r4.d
                    java.lang.Object r0 = r0.get(r1)
                    com.bykv.vk.component.ttvideo.DataLoaderHelper$c$a$a r0 = (com.bykv.vk.component.ttvideo.DataLoaderHelper.c.a.C0170a) r0
                    r0.b = r5
                    return
            }

            public boolean a() {
                    r9 = this;
                    long r0 = r9.c
                    r2 = 0
                    int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r4 <= 0) goto Lf
                    long r4 = r9.b
                    long r0 = java.lang.Math.min(r0, r4)
                    goto L11
                Lf:
                    long r0 = r9.b
                L11:
                    java.util.List<com.bykv.vk.component.ttvideo.DataLoaderHelper$c$a$a> r4 = r9.d
                    r5 = 1
                    if (r4 == 0) goto L22
                    int r6 = r4.size()
                    int r6 = r6 - r5
                    java.lang.Object r4 = r4.get(r6)
                    com.bykv.vk.component.ttvideo.DataLoaderHelper$c$a$a r4 = (com.bykv.vk.component.ttvideo.DataLoaderHelper.c.a.C0170a) r4
                    goto L23
                L22:
                    r4 = 0
                L23:
                    com.bykv.vk.component.ttvideo.utils.Error r6 = r9.f
                    if (r6 != 0) goto L3a
                    if (r4 == 0) goto L38
                    long r6 = r9.b
                    int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                    if (r8 <= 0) goto L38
                    long r2 = r4.a
                    long r6 = r4.b
                    long r2 = r2 + r6
                    int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                    if (r4 >= 0) goto L3a
                L38:
                    r0 = 0
                    return r0
                L3a:
                    return r5
            }

            public long b() {
                    r2 = this;
                    java.util.List<com.bykv.vk.component.ttvideo.DataLoaderHelper$c$a$a> r0 = r2.d
                    if (r0 == 0) goto L1b
                    int r0 = r0.size()
                    if (r0 <= 0) goto L1b
                    java.util.List<com.bykv.vk.component.ttvideo.DataLoaderHelper$c$a$a> r0 = r2.d
                    int r1 = r0.size()
                    int r1 = r1 + (-1)
                    java.lang.Object r0 = r0.get(r1)
                    com.bykv.vk.component.ttvideo.DataLoaderHelper$c$a$a r0 = (com.bykv.vk.component.ttvideo.DataLoaderHelper.c.a.C0170a) r0
                    long r0 = r0.b
                    return r0
                L1b:
                    r0 = 0
                    return r0
            }
        }

        public c(com.bykv.vk.component.ttvideo.DataLoaderHelper r1) {
                r0 = this;
                r0.<init>()
                r1 = 0
                r0.b = r1
                r1 = 0
                r0.c = r1
                return
        }

        private com.bykv.vk.component.ttvideo.DataLoaderHelper.c.a a(java.lang.String r4) {
                r3 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r4)
                if (r0 != 0) goto L23
                java.util.List<com.bykv.vk.component.ttvideo.DataLoaderHelper$c$a> r0 = r3.c
                if (r0 == 0) goto L23
                java.util.Iterator r0 = r0.iterator()
            Le:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L23
                java.lang.Object r1 = r0.next()
                com.bykv.vk.component.ttvideo.DataLoaderHelper$c$a r1 = (com.bykv.vk.component.ttvideo.DataLoaderHelper.c.a) r1
                java.lang.String r2 = r1.a
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto Le
                return r1
            L23:
                r4 = 0
                return r4
        }

        public long a() {
                r5 = this;
                java.util.List<com.bykv.vk.component.ttvideo.DataLoaderHelper$c$a> r0 = r5.c
                r1 = 0
                if (r0 == 0) goto L1f
                r0 = 0
            L7:
                java.util.List<com.bykv.vk.component.ttvideo.DataLoaderHelper$c$a> r3 = r5.c
                int r3 = r3.size()
                if (r0 >= r3) goto L1f
                java.util.List<com.bykv.vk.component.ttvideo.DataLoaderHelper$c$a> r3 = r5.c
                java.lang.Object r3 = r3.get(r0)
                com.bykv.vk.component.ttvideo.DataLoaderHelper$c$a r3 = (com.bykv.vk.component.ttvideo.DataLoaderHelper.c.a) r3
                long r3 = r3.b()
                long r1 = r1 + r3
                int r0 = r0 + 1
                goto L7
            L1f:
                return r1
        }

        public void a(com.bykv.vk.component.ttvideo.DataLoaderHelper.b r6) {
                r5 = this;
                java.util.List<com.bykv.vk.component.ttvideo.DataLoaderHelper$c$a> r0 = r5.c
                if (r0 != 0) goto Lb
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r5.c = r0
            Lb:
                java.util.List<com.bykv.vk.component.ttvideo.DataLoaderHelper$b$a> r6 = r6.e
                java.util.Iterator r6 = r6.iterator()
            L11:
                boolean r0 = r6.hasNext()
                if (r0 == 0) goto L4a
                java.lang.Object r0 = r6.next()
                com.bykv.vk.component.ttvideo.DataLoaderHelper$b$a r0 = (com.bykv.vk.component.ttvideo.DataLoaderHelper.b.a) r0
                java.lang.String r1 = r0.a
                com.bykv.vk.component.ttvideo.DataLoaderHelper$c$a r1 = r5.a(r1)
                if (r1 != 0) goto L2c
                com.bykv.vk.component.ttvideo.DataLoaderHelper$c$a r1 = new com.bykv.vk.component.ttvideo.DataLoaderHelper$c$a
                r1.<init>(r5)
                r2 = 0
                goto L2d
            L2c:
                r2 = 1
            L2d:
                java.lang.String r3 = r0.a
                r1.a = r3
                long r3 = r0.h
                r1.b = r3
                long r3 = r0.i
                r1.a(r3)
                long r3 = r0.g
                r1.c = r3
                java.lang.String r0 = r0.d
                r1.e = r0
                if (r2 != 0) goto L11
                java.util.List<com.bykv.vk.component.ttvideo.DataLoaderHelper$c$a> r0 = r5.c
                r0.add(r1)
                goto L11
            L4a:
                return
        }

        public void a(java.lang.String r1, com.bykv.vk.component.ttvideo.utils.Error r2) {
                r0 = this;
                com.bykv.vk.component.ttvideo.DataLoaderHelper$c$a r1 = r0.a(r1)
                if (r1 == 0) goto L8
                r1.f = r2
            L8:
                return
        }

        public boolean b() {
                r6 = this;
                java.util.List<com.bykv.vk.component.ttvideo.DataLoaderHelper$c$a> r0 = r6.c
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L28
                r0 = 0
                r3 = 1
                r4 = 0
            L9:
                java.util.List<com.bykv.vk.component.ttvideo.DataLoaderHelper$c$a> r5 = r6.c
                int r5 = r5.size()
                if (r0 >= r5) goto L2a
                java.util.List<com.bykv.vk.component.ttvideo.DataLoaderHelper$c$a> r5 = r6.c
                java.lang.Object r5 = r5.get(r0)
                com.bykv.vk.component.ttvideo.DataLoaderHelper$c$a r5 = (com.bykv.vk.component.ttvideo.DataLoaderHelper.c.a) r5
                if (r5 == 0) goto L23
                boolean r5 = r5.a()
                if (r5 != 0) goto L23
                r3 = 0
                goto L25
            L23:
                int r4 = r4 + 1
            L25:
                int r0 = r0 + 1
                goto L9
            L28:
                r3 = 1
                r4 = 0
            L2a:
                if (r3 != 0) goto L34
                r0 = 2
                if (r4 < r0) goto L33
                int r0 = r6.b
                if (r0 == r1) goto L34
            L33:
                return r2
            L34:
                return r1
        }

        public boolean c() {
                r3 = this;
                int r0 = r3.b
                r1 = 2
                r2 = 0
                if (r0 == r1) goto L7
                return r2
            L7:
                java.util.List<com.bykv.vk.component.ttvideo.DataLoaderHelper$c$a> r0 = r3.c
                if (r0 == 0) goto L28
                r0 = 0
            Lc:
                java.util.List<com.bykv.vk.component.ttvideo.DataLoaderHelper$c$a> r1 = r3.c
                int r1 = r1.size()
                if (r0 >= r1) goto L28
                java.util.List<com.bykv.vk.component.ttvideo.DataLoaderHelper$c$a> r1 = r3.c
                java.lang.Object r1 = r1.get(r0)
                com.bykv.vk.component.ttvideo.DataLoaderHelper$c$a r1 = (com.bykv.vk.component.ttvideo.DataLoaderHelper.c.a) r1
                if (r1 == 0) goto L25
                boolean r1 = r1.a()
                if (r1 != 0) goto L25
                return r2
            L25:
                int r0 = r0 + 1
                goto Lc
            L28:
                r0 = 1
                return r0
        }
    }

    private class d {
        private final java.util.concurrent.locks.ReentrantLock a;
        private final java.util.ArrayList<com.bykv.vk.component.ttvideo.DataLoaderHelper.b> b;
        private long c;

        private d(com.bykv.vk.component.ttvideo.DataLoaderHelper r3) {
                r2 = this;
                r2.<init>()
                java.util.concurrent.locks.ReentrantLock r3 = new java.util.concurrent.locks.ReentrantLock
                r3.<init>()
                r2.a = r3
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r2.b = r3
                r0 = 0
                r2.c = r0
                return
        }

        /* synthetic */ d(com.bykv.vk.component.ttvideo.DataLoaderHelper r1, com.bykv.vk.component.ttvideo.DataLoaderHelper.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private java.lang.Boolean e() {
                r5 = this;
                long r0 = r5.c
                r2 = 1
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 < 0) goto L1d
                java.util.ArrayList<com.bykv.vk.component.ttvideo.DataLoaderHelper$b> r0 = r5.b
                int r0 = r0.size()
                long r0 = (long) r0
                long r2 = r5.c
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 < 0) goto L17
                r0 = 1
                goto L18
            L17:
                r0 = 0
            L18:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            L1d:
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                return r0
        }

        public com.bykv.vk.component.ttvideo.DataLoaderHelper.b a() {
                r2 = this;
                java.util.concurrent.locks.ReentrantLock r0 = r2.a
                r0.lock()
                java.util.ArrayList<com.bykv.vk.component.ttvideo.DataLoaderHelper$b> r0 = r2.b
                int r0 = r0.size()
                if (r0 != 0) goto L14
                java.util.concurrent.locks.ReentrantLock r0 = r2.a
                r0.unlock()
                r0 = 0
                return r0
            L14:
                java.util.ArrayList<com.bykv.vk.component.ttvideo.DataLoaderHelper$b> r0 = r2.b
                int r1 = r0.size()
                int r1 = r1 + (-1)
                java.lang.Object r0 = r0.get(r1)
                com.bykv.vk.component.ttvideo.DataLoaderHelper$b r0 = (com.bykv.vk.component.ttvideo.DataLoaderHelper.b) r0
                java.util.concurrent.locks.ReentrantLock r1 = r2.a
                r1.unlock()
                return r0
        }

        public void a(long r1) {
                r0 = this;
                r0.c = r1
                return
        }

        boolean a(com.bykv.vk.component.ttvideo.DataLoaderHelper.b r3) {
                r2 = this;
                r0 = 0
                if (r3 != 0) goto L4
                return r0
            L4:
                java.util.List<com.bykv.vk.component.ttvideo.DataLoaderHelper$b$a> r1 = r3.e
                int r1 = r1.size()
                if (r1 != 0) goto Ld
                return r0
            Ld:
                java.util.concurrent.locks.ReentrantLock r0 = r2.a
                r0.lock()
                java.lang.Boolean r0 = r2.e()
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L1f
                java.lang.Boolean r3 = java.lang.Boolean.FALSE
                goto L26
            L1f:
                java.util.ArrayList<com.bykv.vk.component.ttvideo.DataLoaderHelper$b> r0 = r2.b
                r0.add(r3)
                java.lang.Boolean r3 = java.lang.Boolean.TRUE
            L26:
                java.util.concurrent.locks.ReentrantLock r0 = r2.a
                r0.unlock()
                boolean r3 = r3.booleanValue()
                return r3
        }

        public boolean a(java.lang.String r4) {
                r3 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r4)
                r1 = 0
                if (r0 == 0) goto L8
                return r1
            L8:
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                java.util.concurrent.locks.ReentrantLock r2 = r3.a
                r2.lock()
            Lf:
                java.util.ArrayList<com.bykv.vk.component.ttvideo.DataLoaderHelper$b> r2 = r3.b
                int r2 = r2.size()
                if (r1 >= r2) goto L2b
                java.util.ArrayList<com.bykv.vk.component.ttvideo.DataLoaderHelper$b> r2 = r3.b
                java.lang.Object r2 = r2.get(r1)
                com.bykv.vk.component.ttvideo.DataLoaderHelper$b r2 = (com.bykv.vk.component.ttvideo.DataLoaderHelper.b) r2
                com.bykv.vk.component.ttvideo.DataLoaderHelper$b$a r2 = r2.b(r4)
                if (r2 == 0) goto L28
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                goto L2b
            L28:
                int r1 = r1 + 1
                goto Lf
            L2b:
                java.util.concurrent.locks.ReentrantLock r4 = r3.a
                r4.unlock()
                boolean r4 = r0.booleanValue()
                return r4
        }

        public long b() {
                r3 = this;
                java.util.concurrent.locks.ReentrantLock r0 = r3.a
                r0.lock()
                java.util.ArrayList<com.bykv.vk.component.ttvideo.DataLoaderHelper$b> r0 = r3.b
                int r0 = r0.size()
                long r0 = (long) r0
                java.util.concurrent.locks.ReentrantLock r2 = r3.a
                r2.unlock()
                return r0
        }

        public com.bykv.vk.component.ttvideo.DataLoaderHelper.b b(com.bykv.vk.component.ttvideo.DataLoaderHelper.b r3) {
                r2 = this;
                java.lang.String r0 = r3.a
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L11
                java.lang.String r0 = r3.a
                com.bykv.vk.component.ttvideo.DataLoaderHelper$b r0 = r2.d(r0)
                if (r0 == 0) goto L12
                return r0
            L11:
                r0 = 0
            L12:
                java.util.List<com.bykv.vk.component.ttvideo.DataLoaderHelper$b$a> r3 = r3.e
                java.util.Iterator r3 = r3.iterator()
            L18:
                boolean r1 = r3.hasNext()
                if (r1 == 0) goto L2c
                java.lang.Object r0 = r3.next()
                com.bykv.vk.component.ttvideo.DataLoaderHelper$b$a r0 = (com.bykv.vk.component.ttvideo.DataLoaderHelper.b.a) r0
                java.lang.String r0 = r0.a
                com.bykv.vk.component.ttvideo.DataLoaderHelper$b r0 = r2.c(r0)
                if (r0 == 0) goto L18
            L2c:
                return r0
        }

        public com.bykv.vk.component.ttvideo.DataLoaderHelper.b b(java.lang.String r5) {
                r4 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r5)
                r1 = 0
                if (r0 == 0) goto L8
                return r1
            L8:
                java.util.concurrent.locks.ReentrantLock r0 = r4.a
                r0.lock()
                r0 = 0
            Le:
                java.util.ArrayList<com.bykv.vk.component.ttvideo.DataLoaderHelper$b> r2 = r4.b
                int r2 = r2.size()
                if (r0 >= r2) goto L28
                java.util.ArrayList<com.bykv.vk.component.ttvideo.DataLoaderHelper$b> r2 = r4.b
                java.lang.Object r2 = r2.get(r0)
                com.bykv.vk.component.ttvideo.DataLoaderHelper$b r2 = (com.bykv.vk.component.ttvideo.DataLoaderHelper.b) r2
                com.bykv.vk.component.ttvideo.DataLoaderHelper$b$a r3 = r2.b(r5)
                if (r3 != 0) goto L27
                int r0 = r0 + 1
                goto Le
            L27:
                r1 = r2
            L28:
                java.util.concurrent.locks.ReentrantLock r5 = r4.a
                r5.unlock()
                return r1
        }

        public com.bykv.vk.component.ttvideo.DataLoaderHelper.b c() {
                r2 = this;
                java.util.concurrent.locks.ReentrantLock r0 = r2.a
                r0.lock()
                java.util.ArrayList<com.bykv.vk.component.ttvideo.DataLoaderHelper$b> r0 = r2.b
                int r0 = r0.size()
                if (r0 != 0) goto L14
                java.util.concurrent.locks.ReentrantLock r0 = r2.a
                r0.unlock()
                r0 = 0
                return r0
            L14:
                java.util.ArrayList<com.bykv.vk.component.ttvideo.DataLoaderHelper$b> r0 = r2.b
                int r1 = r0.size()
                int r1 = r1 + (-1)
                java.lang.Object r0 = r0.get(r1)
                com.bykv.vk.component.ttvideo.DataLoaderHelper$b r0 = (com.bykv.vk.component.ttvideo.DataLoaderHelper.b) r0
                java.util.ArrayList<com.bykv.vk.component.ttvideo.DataLoaderHelper$b> r1 = r2.b
                r1.remove(r0)
                java.util.concurrent.locks.ReentrantLock r1 = r2.a
                r1.unlock()
                return r0
        }

        public com.bykv.vk.component.ttvideo.DataLoaderHelper.b c(java.lang.String r5) {
                r4 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r5)
                r1 = 0
                if (r0 == 0) goto L8
                return r1
            L8:
                java.util.concurrent.locks.ReentrantLock r0 = r4.a
                r0.lock()
                r0 = 0
            Le:
                java.util.ArrayList<com.bykv.vk.component.ttvideo.DataLoaderHelper$b> r2 = r4.b
                int r2 = r2.size()
                if (r0 >= r2) goto L28
                java.util.ArrayList<com.bykv.vk.component.ttvideo.DataLoaderHelper$b> r2 = r4.b
                java.lang.Object r2 = r2.get(r0)
                com.bykv.vk.component.ttvideo.DataLoaderHelper$b r2 = (com.bykv.vk.component.ttvideo.DataLoaderHelper.b) r2
                com.bykv.vk.component.ttvideo.DataLoaderHelper$b$a r3 = r2.b(r5)
                if (r3 != 0) goto L27
                int r0 = r0 + 1
                goto Le
            L27:
                r1 = r2
            L28:
                if (r1 == 0) goto L2f
                java.util.ArrayList<com.bykv.vk.component.ttvideo.DataLoaderHelper$b> r5 = r4.b
                r5.remove(r1)
            L2f:
                java.util.concurrent.locks.ReentrantLock r5 = r4.a
                r5.unlock()
                return r1
        }

        public com.bykv.vk.component.ttvideo.DataLoaderHelper.b d(java.lang.String r5) {
                r4 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r5)
                r1 = 0
                if (r0 == 0) goto L8
                return r1
            L8:
                java.util.concurrent.locks.ReentrantLock r0 = r4.a
                r0.lock()
                r0 = 0
            Le:
                java.util.ArrayList<com.bykv.vk.component.ttvideo.DataLoaderHelper$b> r2 = r4.b
                int r2 = r2.size()
                if (r0 >= r2) goto L34
                java.util.ArrayList<com.bykv.vk.component.ttvideo.DataLoaderHelper$b> r2 = r4.b
                java.lang.Object r2 = r2.get(r0)
                com.bykv.vk.component.ttvideo.DataLoaderHelper$b r2 = (com.bykv.vk.component.ttvideo.DataLoaderHelper.b) r2
                java.lang.String r3 = r2.a
                boolean r3 = android.text.TextUtils.isEmpty(r3)
                if (r3 != 0) goto L31
                java.lang.String r3 = r2.a
                boolean r3 = r3.equals(r5)
                if (r3 != 0) goto L2f
                goto L31
            L2f:
                r1 = r2
                goto L34
            L31:
                int r0 = r0 + 1
                goto Le
            L34:
                if (r1 == 0) goto L3b
                java.util.ArrayList<com.bykv.vk.component.ttvideo.DataLoaderHelper$b> r5 = r4.b
                r5.remove(r1)
            L3b:
                java.util.concurrent.locks.ReentrantLock r5 = r4.a
                r5.unlock()
                return r1
        }

        public java.util.ArrayList<com.bykv.vk.component.ttvideo.DataLoaderHelper.b> d() {
                r2 = this;
                java.util.concurrent.locks.ReentrantLock r0 = r2.a     // Catch: java.lang.Throwable -> L12
                r0.lock()     // Catch: java.lang.Throwable -> L12
                java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L12
                java.util.ArrayList<com.bykv.vk.component.ttvideo.DataLoaderHelper$b> r1 = r2.b     // Catch: java.lang.Throwable -> L12
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L12
                java.util.concurrent.locks.ReentrantLock r1 = r2.a
                r1.unlock()
                return r0
            L12:
                r0 = move-exception
                java.util.concurrent.locks.ReentrantLock r1 = r2.a
                r1.unlock()
                throw r0
        }
    }

    static {
            com.bykv.vk.component.ttvideo.DataLoaderHelper r0 = new com.bykv.vk.component.ttvideo.DataLoaderHelper
            r0.<init>()
            com.bykv.vk.component.ttvideo.DataLoaderHelper.f1632p = r0
            r0 = 0
            com.bykv.vk.component.ttvideo.DataLoaderHelper.f1633q = r0
            com.bykv.vk.component.ttvideo.DataLoaderHelper.f1634r = r0
            com.bykv.vk.component.ttvideo.DataLoaderHelper.f1635s = r0
            return
    }

    private DataLoaderHelper() {
            r2 = this;
            r2.<init>()
            com.bykv.vk.component.ttvideo.DataLoaderHelper$d r0 = new com.bykv.vk.component.ttvideo.DataLoaderHelper$d
            r1 = 0
            r0.<init>(r2, r1)
            r2.b = r0
            com.bykv.vk.component.ttvideo.DataLoaderHelper$d r0 = new com.bykv.vk.component.ttvideo.DataLoaderHelper$d
            r0.<init>(r2, r1)
            r2.c = r0
            com.bykv.vk.component.ttvideo.DataLoaderHelper$d r0 = new com.bykv.vk.component.ttvideo.DataLoaderHelper$d
            r0.<init>(r2, r1)
            r2.d = r0
            com.bykv.vk.component.ttvideo.DataLoaderHelper$d r0 = new com.bykv.vk.component.ttvideo.DataLoaderHelper$d
            r0.<init>(r2, r1)
            r2.e = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r2.f = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.g = r0
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            r2.h = r0
            r0 = 1
            r2.f1636l = r0
            r1 = 0
            r2.f1638n = r1
            java.util.concurrent.locks.ReentrantLock r1 = new java.util.concurrent.locks.ReentrantLock
            r1.<init>()
            r2.f1639o = r1
            r2.a = r0
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure r0 = com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure.getDefaultonfigure()
            r2.j = r0
            return
    }

    private java.lang.String a(java.lang.String r8, java.lang.String r9, long r10, long r12, java.lang.String[] r14, java.lang.String r15) {
            r7 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            r1 = 0
            if (r0 != 0) goto Lf9
            if (r14 == 0) goto Lf9
            int r0 = r14.length
            if (r0 <= 0) goto Lf9
            java.lang.Object r14 = r14.clone()
            java.lang.String[] r14 = (java.lang.String[]) r14
            r2 = 0
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 > 0) goto L19
            r12 = r2
        L19:
            r0 = 0
            r4 = 0
        L1b:
            int r5 = r14.length
            if (r4 >= r5) goto L2a
            r5 = r14[r4]
            boolean r5 = r7.c(r5)
            if (r5 != 0) goto L27
            return r1
        L27:
            int r4 = r4 + 1
            goto L1b
        L2a:
            java.lang.String[] r14 = r7.a(r14)
            java.lang.String r4 = encodeUrl(r8)
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto L39
            return r1
        L39:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "preloadProxyQuery: key = "
            r5.<init>(r6)
            r5.append(r8)
            java.lang.String r6 = ", rawKey = "
            r5.append(r6)
            r5.append(r9)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "DataLoaderHelper"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r6, r5)
            boolean r5 = android.text.TextUtils.isEmpty(r9)
            if (r5 == 0) goto L5b
            goto L5c
        L5b:
            r8 = r9
        L5c:
            java.lang.String r8 = encodeUrl(r8)
            boolean r9 = android.text.TextUtils.isEmpty(r8)
            if (r9 == 0) goto L68
            java.lang.String r8 = "videoId"
        L68:
            java.lang.StringBuffer r9 = new java.lang.StringBuffer
            java.lang.String r5 = "?rk="
            r9.<init>(r5)
            r9.append(r8)
            java.lang.String r8 = "&k="
            r9.append(r8)
            r9.append(r4)
            int r8 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r8 <= 0) goto L87
            java.lang.String r8 = "&s="
            r9.append(r8)
            long r10 = r10 + r12
            r9.append(r10)
        L87:
            boolean r8 = android.text.TextUtils.isEmpty(r15)
            if (r8 != 0) goto La7
            java.lang.String r8 = "UTF-8"
            java.lang.String r8 = java.net.URLEncoder.encode(r15, r8)     // Catch: java.io.UnsupportedEncodingException -> L94
            goto L99
        L94:
            r8 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r8)
            r8 = r1
        L99:
            boolean r10 = android.text.TextUtils.isEmpty(r8)
            if (r10 != 0) goto La7
            java.lang.String r10 = "&p="
            r9.append(r10)
            r9.append(r8)
        La7:
            java.lang.StringBuffer r8 = new java.lang.StringBuffer
            r8.<init>()
        Lac:
            int r10 = r14.length
            if (r0 >= r10) goto Lea
            r10 = r14[r0]
            java.lang.String r10 = encodeUrlByQuery(r10)
            java.lang.StringBuffer r11 = new java.lang.StringBuffer
            r11.<init>()
            boolean r12 = android.text.TextUtils.isEmpty(r10)
            if (r12 != 0) goto Ld0
            java.lang.String r12 = "&u"
            r11.append(r12)
            r11.append(r0)
            java.lang.String r12 = "="
            r11.append(r12)
            r11.append(r10)
        Ld0:
            int r10 = r9.length()
            int r12 = r8.length()
            int r10 = r10 + r12
            int r12 = r11.length()
            int r10 = r10 + r12
            int r10 = r10 + 32
            r12 = 3096(0xc18, float:4.338E-42)
            if (r10 > r12) goto Lea
            r8.append(r11)
            int r0 = r0 + 1
            goto Lac
        Lea:
            int r10 = r8.length()
            if (r10 > 0) goto Lf1
            return r1
        Lf1:
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            return r8
        Lf9:
            return r1
    }

    private java.util.ArrayList<com.bykv.vk.component.ttvideo.TTVideoEngine> a(java.lang.String r5) {
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.concurrent.locks.ReentrantLock r0 = r4.h     // Catch: java.lang.Throwable -> L41
            r0.lock()     // Catch: java.lang.Throwable -> L41
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.bykv.vk.component.ttvideo.TTVideoEngine>> r0 = r4.g     // Catch: java.lang.Throwable -> L41
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Throwable -> L41
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L3b
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L41
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L41
            java.lang.String r0 = "DataLoaderHelper"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L41
            java.lang.String r3 = "get engine ref,rawKey = "
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L41
            r2.append(r5)     // Catch: java.lang.Throwable -> L41
            java.lang.String r5 = " engine ref count: "
            r2.append(r5)     // Catch: java.lang.Throwable -> L41
            int r5 = r1.size()     // Catch: java.lang.Throwable -> L41
            r2.append(r5)     // Catch: java.lang.Throwable -> L41
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> L41
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r0, r5)     // Catch: java.lang.Throwable -> L41
        L3b:
            java.util.concurrent.locks.ReentrantLock r5 = r4.h
            r5.unlock()
            return r1
        L41:
            r5 = move-exception
            java.util.concurrent.locks.ReentrantLock r0 = r4.h
            r0.unlock()
            throw r5
    }

    private void a() {
            r2 = this;
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader r0 = r2.i
            if (r0 != 0) goto Lc
            java.lang.String r0 = "DataLoaderHelper"
            java.lang.String r1 = "[preload] need load mdl first."
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.e(r0, r1)
            return
        Lc:
            com.bykv.vk.component.ttvideo.DataLoaderHelper$d r0 = r2.b
            com.bykv.vk.component.ttvideo.DataLoaderHelper$b r0 = r0.a()
            if (r0 != 0) goto L15
            goto L29
        L15:
            com.bykv.vk.component.ttvideo.DataLoaderHelper$d r1 = r2.c
            boolean r1 = r1.a(r0)
            if (r1 == 0) goto L29
            com.bykv.vk.component.ttvideo.DataLoaderHelper$d r1 = r2.b
            r1.c()
            com.bykv.vk.component.ttvideo.PreloaderURLItem r1 = r0.c
            if (r1 == 0) goto L29
            r2.b(r0)
        L29:
            return
    }

    private void a(com.bykv.vk.component.ttvideo.DataLoaderHelper.b r6) {
            r5 = this;
            com.bykv.vk.component.ttvideo.DataLoaderHelper$d r0 = r5.e
            java.util.ArrayList r0 = r0.d()
            r1 = 0
            r2 = 0
        L8:
            int r3 = r0.size()
            if (r2 >= r3) goto L32
            java.lang.Object r3 = r0.get(r2)
            com.bykv.vk.component.ttvideo.DataLoaderHelper$b r3 = (com.bykv.vk.component.ttvideo.DataLoaderHelper.b) r3
            java.lang.String r4 = r3.a
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L2f
            java.lang.String r4 = r6.a
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L2f
            java.lang.String r3 = r3.a
            java.lang.String r4 = r6.a
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L2f
            return
        L2f:
            int r2 = r2 + 1
            goto L8
        L32:
            java.lang.String r6 = r6.a
            java.util.ArrayList r6 = r5.a(r6)
            if (r6 == 0) goto L52
            int r0 = r6.size()
            if (r0 == 0) goto L52
        L40:
            int r0 = r6.size()
            if (r1 >= r0) goto L52
            java.lang.Object r0 = r6.get(r1)
            com.bykv.vk.component.ttvideo.TTVideoEngine r0 = (com.bykv.vk.component.ttvideo.TTVideoEngine) r0
            r0.a()
            int r1 = r1 + 1
            goto L40
        L52:
            return
    }

    private void a(com.bykv.vk.component.ttvideo.DataLoaderHelper.b r12, com.bykv.vk.component.ttvideo.DataLoaderHelper.b.a r13) {
            r11 = this;
            java.lang.String r0 = "DataLoaderHelper"
            if (r12 != 0) goto La
            java.lang.String r12 = "[preload] start mdl preload task fail. item is null"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.e(r0, r12)
            return
        La:
            if (r13 != 0) goto L1a
            java.lang.String r13 = "[preload] start mdl preload task fail. track is null"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.e(r0, r13)
            com.bykv.vk.component.ttvideo.PreloaderURLItem r12 = r12.c
            r13 = -100004(0xfffffffffffe795c, float:NaN)
            r11.notifyPreloadError(r12, r13)
            return
        L1a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[preload] start mdl preload task.  key = "
            r1.<init>(r2)
            java.lang.String r2 = r13.a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r0, r1)
            java.lang.String r3 = r13.a
            java.lang.String[] r9 = r13.c
            if (r9 == 0) goto L92
            java.lang.String r4 = r12.a
            long r5 = r13.f
            java.lang.String r10 = r13.d
            r7 = 0
            r2 = r11
            java.lang.String r1 = r2.a(r3, r4, r5, r7, r9, r10)
            r13.b = r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L93
            com.bykv.vk.component.ttvideo.DataLoaderHelper$d r1 = r2.d
            r1.a(r12)
            long r3 = r13.f
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L71
            long r3 = r13.e
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L63
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader r1 = r2.i
            java.lang.String r5 = r13.b
            int r4 = (int) r3
            r1.preloadResource(r5, r4)
        L63:
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader r1 = r2.i
            java.lang.String r3 = r13.b
            long r4 = r13.f
            int r5 = (int) r4
            long r6 = r13.g
            int r4 = (int) r6
            r1.preloadResource(r3, r5, r4)
            goto L7b
        L71:
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader r1 = r2.i
            java.lang.String r3 = r13.b
            long r4 = r13.g
            int r5 = (int) r4
            r1.preloadResource(r3, r5)
        L7b:
            java.lang.String r13 = r13.a
            java.lang.String r12 = r12.a
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            r1[r3] = r13
            r13 = 1
            r1[r13] = r12
            java.lang.String r12 = "[preload] exect preload task ,key is %s; videoId = %s"
            java.lang.String r12 = java.lang.String.format(r12, r1)
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r0, r12)
            return
        L92:
            r2 = r11
        L93:
            r13 = -100001(0xfffffffffffe795f, float:NaN)
            r12.a(r13)
            return
    }

    private void a(com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderNotifyInfo r17, boolean r18, boolean r19) {
            r16 = this;
            r0 = r16
            r1 = r17
            if (r1 == 0) goto L11c
            java.lang.String r2 = r1.logInfo
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L11c
            java.lang.String r2 = r1.logInfo
            java.lang.String r3 = ","
            java.lang.String[] r2 = r2.split(r3)
            int r3 = r2.length
            r4 = 4
            if (r3 >= r4) goto L1c
            goto L11c
        L1c:
            r3 = 0
            r4 = r2[r3]     // Catch: java.lang.Exception -> L11c
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Exception -> L11c
            long r4 = r4.longValue()     // Catch: java.lang.Exception -> L11c
            r6 = 1
            r7 = r2[r6]     // Catch: java.lang.Exception -> L11c
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Exception -> L11c
            long r7 = r7.longValue()     // Catch: java.lang.Exception -> L11c
            r9 = 0
            java.lang.String r11 = "DataLoaderHelper"
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r12 > 0) goto L50
            if (r19 != 0) goto L50
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L11c
            java.lang.String r3 = "[preload] mediaSize <= 0 return "
            r2.<init>(r3)     // Catch: java.lang.Exception -> L11c
            java.lang.String r1 = r1.logInfo     // Catch: java.lang.Exception -> L11c
            r2.append(r1)     // Catch: java.lang.Exception -> L11c
        L48:
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Exception -> L11c
        L4c:
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r11, r1)     // Catch: java.lang.Exception -> L11c
            return
        L50:
            r9 = 2
            r10 = r2[r9]     // Catch: java.lang.Exception -> L11c
            r12 = 3
            r2 = r2[r12]     // Catch: java.lang.Exception -> L11c
            if (r18 != 0) goto L72
            if (r19 != 0) goto L72
            com.bykv.vk.component.ttvideo.DataLoaderHelper$d r12 = r0.e     // Catch: java.lang.Exception -> L11c
            com.bykv.vk.component.ttvideo.DataLoaderHelper$b r12 = r12.b(r10)     // Catch: java.lang.Exception -> L11c
            if (r12 != 0) goto L6f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L11c
            java.lang.String r3 = "[preload] play temItem == null return "
            r2.<init>(r3)     // Catch: java.lang.Exception -> L11c
            java.lang.String r1 = r1.logInfo     // Catch: java.lang.Exception -> L11c
            r2.append(r1)     // Catch: java.lang.Exception -> L11c
            goto L48
        L6f:
            com.bykv.vk.component.ttvideo.DataLoaderHelper$d r1 = r0.e     // Catch: java.lang.Exception -> L11c
            goto L8a
        L72:
            com.bykv.vk.component.ttvideo.DataLoaderHelper$d r3 = r0.d     // Catch: java.lang.Exception -> L11c
            com.bykv.vk.component.ttvideo.DataLoaderHelper$b r12 = r3.b(r10)     // Catch: java.lang.Exception -> L11c
            if (r12 != 0) goto L87
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L11c
            java.lang.String r3 = "[preload] preload temItem == null return "
            r2.<init>(r3)     // Catch: java.lang.Exception -> L11c
            java.lang.String r1 = r1.logInfo     // Catch: java.lang.Exception -> L11c
            r2.append(r1)     // Catch: java.lang.Exception -> L11c
            goto L48
        L87:
            com.bykv.vk.component.ttvideo.DataLoaderHelper$d r1 = r0.d     // Catch: java.lang.Exception -> L11c
            r3 = 1
        L8a:
            com.bykv.vk.component.ttvideo.DataLoaderHelper$b$a r13 = r12.b(r10)     // Catch: java.lang.Exception -> L11c
            if (r13 == 0) goto L96
            r13.h = r7     // Catch: java.lang.Exception -> L11c
            r13.i = r4     // Catch: java.lang.Exception -> L11c
            r13.d = r2     // Catch: java.lang.Exception -> L11c
        L96:
            java.lang.String r13 = r12.a     // Catch: java.lang.Exception -> L11c
            boolean r13 = android.text.TextUtils.isEmpty(r13)     // Catch: java.lang.Exception -> L11c
            if (r13 == 0) goto La0
            r13 = r10
            goto La2
        La0:
            java.lang.String r13 = r12.a     // Catch: java.lang.Exception -> L11c
        La2:
            com.bykv.vk.component.ttvideo.DataLoaderHelper$c r14 = r0.getLoadProgressByRawKey(r13)     // Catch: java.lang.Exception -> L11c
            if (r14 != 0) goto Lad
            com.bykv.vk.component.ttvideo.DataLoaderHelper$c r14 = new com.bykv.vk.component.ttvideo.DataLoaderHelper$c     // Catch: java.lang.Exception -> L11c
            r14.<init>(r0)     // Catch: java.lang.Exception -> L11c
        Lad:
            java.lang.String r15 = r12.a     // Catch: java.lang.Exception -> L11c
            r14.a = r15     // Catch: java.lang.Exception -> L11c
            if (r18 == 0) goto Lb5
            r15 = 2
            goto Lb6
        Lb5:
            r15 = 1
        Lb6:
            r14.b = r15     // Catch: java.lang.Exception -> L11c
            r14.a(r12)     // Catch: java.lang.Exception -> L11c
            r0.putByRawKey(r13, r14)     // Catch: java.lang.Exception -> L11c
            boolean r15 = r14.b()     // Catch: java.lang.Exception -> L11c
            if (r15 != 0) goto Lc6
            if (r19 == 0) goto L11c
        Lc6:
            if (r3 != 0) goto Lcb
            r1.c(r10)     // Catch: java.lang.Exception -> L11c
        Lcb:
            r0.removeLoadProgressByRawKey(r13)     // Catch: java.lang.Exception -> L11c
            if (r18 != 0) goto Ld3
            r0.a(r12)     // Catch: java.lang.Exception -> L11c
        Ld3:
            com.bykv.vk.component.ttvideo.IPreLoaderItemCallBackListener r3 = r12.a()     // Catch: java.lang.Exception -> L11c
            if (r3 == 0) goto L11c
            if (r19 == 0) goto L11c
            int r3 = com.bykv.vk.component.ttvideo.DataLoaderHelper.f1635s     // Catch: java.lang.Exception -> L11c
            int r3 = r3 + r6
            com.bykv.vk.component.ttvideo.DataLoaderHelper.f1635s = r3     // Catch: java.lang.Exception -> L11c
            r1.c(r10)     // Catch: java.lang.Exception -> L11c
            com.bykv.vk.component.ttvideo.DataLoaderHelper$DataLoaderTaskProgressInfo r1 = new com.bykv.vk.component.ttvideo.DataLoaderHelper$DataLoaderTaskProgressInfo     // Catch: java.lang.Exception -> L11c
            r1.<init>()     // Catch: java.lang.Exception -> L11c
            r1.mCacheSizeFromZero = r4     // Catch: java.lang.Exception -> L11c
            r1.mMediaSize = r7     // Catch: java.lang.Exception -> L11c
            r1.mKey = r10     // Catch: java.lang.Exception -> L11c
            r1.mLocalFilePath = r2     // Catch: java.lang.Exception -> L11c
            java.lang.String r2 = r12.a     // Catch: java.lang.Exception -> L11c
            r1.mVideoId = r2     // Catch: java.lang.Exception -> L11c
            int r2 = r14.b     // Catch: java.lang.Exception -> L11c
            r1.mTaskType = r2     // Catch: java.lang.Exception -> L11c
            com.bykv.vk.component.ttvideo.PreLoaderItemCallBackInfo r2 = new com.bykv.vk.component.ttvideo.PreLoaderItemCallBackInfo     // Catch: java.lang.Exception -> L11c
            r2.<init>(r9)     // Catch: java.lang.Exception -> L11c
            r2.preloadDataInfo = r1     // Catch: java.lang.Exception -> L11c
            r2.loadProgress = r14     // Catch: java.lang.Exception -> L11c
            com.bykv.vk.component.ttvideo.IPreLoaderItemCallBackListener r1 = r12.a()     // Catch: java.lang.Exception -> L11c
            r1.preloadItemInfo(r2)     // Catch: java.lang.Exception -> L11c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L11c
            java.lang.String r2 = "[preload] notify end cache size = "
            r1.<init>(r2)     // Catch: java.lang.Exception -> L11c
            long r2 = r14.a()     // Catch: java.lang.Exception -> L11c
            r1.append(r2)     // Catch: java.lang.Exception -> L11c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L11c
            goto L4c
        L11c:
            return
    }

    private void a(java.lang.String r3, java.lang.String r4, long r5, com.bykv.vk.component.ttvideo.PreloaderURLItem r7) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r1 = "DataLoaderHelper"
            if (r0 == 0) goto L14
            java.lang.String r3 = "[preload] key invalid."
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.e(r1, r3)
            r3 = -100001(0xfffffffffffe795f, float:NaN)
            r2.notifyPreloadError(r7, r3)
            return
        L14:
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader r0 = r2.i
            if (r0 == 0) goto L48
            int r0 = r2.a
            if (r0 != 0) goto L48
            com.bykv.vk.component.ttvideo.DataLoaderHelper$d r0 = r2.c
            boolean r0 = r0.a(r3)
            if (r0 != 0) goto L41
            com.bykv.vk.component.ttvideo.DataLoaderHelper$d r0 = r2.b
            boolean r0 = r0.a(r3)
            if (r0 != 0) goto L41
            com.bykv.vk.component.ttvideo.DataLoaderHelper$b r0 = new com.bykv.vk.component.ttvideo.DataLoaderHelper$b
            r0.<init>(r2)
            r0.a(r3, r5)
            r0.a = r4
            r0.c = r7
            com.bykv.vk.component.ttvideo.DataLoaderHelper$d r3 = r2.b
            r3.a(r0)
            r2.a()
            return
        L41:
            r3 = -100003(0xfffffffffffe795d, float:NaN)
            r2.notifyPreloadError(r7, r3)
            return
        L48:
            java.lang.String r3 = "[preload] need load mdl first."
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.e(r1, r3)
            r3 = -100002(0xfffffffffffe795e, float:NaN)
            r2.notifyPreloadError(r7, r3)
            return
    }

    private boolean a(com.bykv.vk.component.ttvideo.DataLoaderHelper.d r7) {
            r6 = this;
            long r0 = r7.b()
            r2 = 0
            r4 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L16
        Lb:
            com.bykv.vk.component.ttvideo.DataLoaderHelper$b r0 = r7.c()
            if (r0 == 0) goto L16
            r6.c(r0)
            r4 = 1
            goto Lb
        L16:
            return r4
    }

    private java.lang.String[] a(java.lang.String[] r8) {
            r7 = this;
            if (r8 == 0) goto L47
            int r0 = r8.length
            r1 = 1
            if (r0 <= r1) goto L47
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2 = 0
            r2 = r8[r2]
            r0.add(r2)
            r2 = 1
        L12:
            int r3 = r8.length
            if (r2 >= r3) goto L3e
            r3 = r8[r2]
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            int r5 = r0.size()
            int r5 = r5 - r1
        L1e:
            if (r5 < 0) goto L32
            java.lang.Object r6 = r0.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = r6.equals(r3)
            if (r6 == 0) goto L2f
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            goto L32
        L2f:
            int r5 = r5 + (-1)
            goto L1e
        L32:
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L3b
            r0.add(r3)
        L3b:
            int r2 = r2 + 1
            goto L12
        L3e:
            int r8 = r0.size()
            java.lang.String[] r8 = new java.lang.String[r8]
            r0.toArray(r8)
        L47:
            return r8
    }

    static /* synthetic */ int b() {
            int r0 = com.bykv.vk.component.ttvideo.DataLoaderHelper.f1635s
            return r0
    }

    private com.bykv.vk.component.ttvideo.DataLoaderHelper.DataLoaderCacheInfo b(java.lang.String r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = ","
            java.lang.String[] r4 = r4.split(r1)
            int r1 = r4.length
            r2 = 4
            if (r1 < r2) goto L3a
            com.bykv.vk.component.ttvideo.DataLoaderHelper$DataLoaderCacheInfo r0 = new com.bykv.vk.component.ttvideo.DataLoaderHelper$DataLoaderCacheInfo
            r0.<init>(r3)
            r1 = 3
            r1 = r4[r1]
            r0.mLocalFilePath = r1
            r1 = 0
            r2 = r4[r1]
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L29
            r1 = r4[r1]
            long r1 = java.lang.Long.parseLong(r1)
            r0.mCacheSizeFromZero = r1
        L29:
            r1 = 1
            r2 = r4[r1]
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L3a
            r4 = r4[r1]
            long r1 = java.lang.Long.parseLong(r4)
            r0.mMediaSize = r1
        L3a:
            return r0
    }

    private void b(com.bykv.vk.component.ttvideo.DataLoaderHelper.b r8) {
            r7 = this;
            if (r8 != 0) goto L6
            r7.a()
            return
        L6:
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader r0 = r7.i
            java.lang.String r1 = "DataLoaderHelper"
            if (r0 != 0) goto L12
            java.lang.String r8 = "[preload] need load mdl first."
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.e(r1, r8)
            return
        L12:
            com.bykv.vk.component.ttvideo.DataLoaderHelper$d r0 = r7.c
            r0.b(r8)
            long r2 = r8.b
            com.bykv.vk.component.ttvideo.PreloaderURLItem r0 = r8.c
            r4 = 0
            if (r0 == 0) goto L4c
            java.lang.String[] r0 = r0.getUrls()
            if (r0 == 0) goto L4c
            com.bykv.vk.component.ttvideo.PreloaderURLItem r0 = r8.c
            java.lang.String[] r0 = r0.getUrls()
            int r0 = r0.length
            if (r0 <= 0) goto L4c
            java.util.List<com.bykv.vk.component.ttvideo.DataLoaderHelper$b$a> r0 = r8.e
            java.lang.Object r0 = r0.get(r4)
            com.bykv.vk.component.ttvideo.DataLoaderHelper$b$a r0 = (com.bykv.vk.component.ttvideo.DataLoaderHelper.b.a) r0
            com.bykv.vk.component.ttvideo.PreloaderURLItem r5 = r8.c
            java.lang.String[] r5 = r5.getUrls()
            r0.c = r5
            long r5 = r8.b
            r0.g = r5
            com.bykv.vk.component.ttvideo.PreloaderURLItem r5 = r8.c
            java.lang.String r5 = r5.getFilePath()
            r0.d = r5
            r7.a(r8, r0)
        L4c:
            com.bykv.vk.component.ttvideo.IPreLoaderItemCallBackListener r0 = r8.a()
            if (r0 == 0) goto L6c
            com.bykv.vk.component.ttvideo.PreLoaderItemCallBackInfo r0 = new com.bykv.vk.component.ttvideo.PreLoaderItemCallBackInfo
            r5 = 6
            r0.<init>(r5)
            r0.preloadType = r4
            r0.videoPreloadSize = r2
            r2 = 0
            r0.audioPreloadSize = r2
            com.bykv.vk.component.ttvideo.IPreLoaderItemCallBackListener r8 = r8.a()
            r8.preloadItemInfo(r0)
            java.lang.String r8 = "[preload] notify info. type = 0"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r1, r8)
        L6c:
            r7.a()
            return
    }

    static /* synthetic */ int c() {
            int r0 = com.bykv.vk.component.ttvideo.DataLoaderHelper.f1635s
            int r1 = r0 + 1
            com.bykv.vk.component.ttvideo.DataLoaderHelper.f1635s = r1
            return r0
    }

    private void c(com.bykv.vk.component.ttvideo.DataLoaderHelper.b r3) {
            r2 = this;
            if (r3 != 0) goto L3
            goto L23
        L3:
            boolean r0 = r3.d
            if (r0 == 0) goto L8
            goto L23
        L8:
            r0 = 1
            r3.d = r0
            com.bykv.vk.component.ttvideo.IPreLoaderItemCallBackListener r1 = r3.a()
            if (r1 == 0) goto L23
            int r1 = com.bykv.vk.component.ttvideo.DataLoaderHelper.f1635s
            int r1 = r1 + r0
            com.bykv.vk.component.ttvideo.DataLoaderHelper.f1635s = r1
            com.bykv.vk.component.ttvideo.PreLoaderItemCallBackInfo r0 = new com.bykv.vk.component.ttvideo.PreLoaderItemCallBackInfo
            r1 = 5
            r0.<init>(r1)
            com.bykv.vk.component.ttvideo.IPreLoaderItemCallBackListener r3 = r3.a()
            r3.preloadItemInfo(r0)
        L23:
            return
    }

    private boolean c(java.lang.String r3) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.String r3 = r3.toLowerCase()
            java.lang.String r0 = "http://127.0.0.1"
            boolean r0 = r3.startsWith(r0)
            if (r0 != 0) goto L46
            java.lang.String r0 = "http://localhost"
            boolean r0 = r3.startsWith(r0)
            if (r0 != 0) goto L46
            java.lang.String r0 = "mdl://"
            boolean r0 = r3.startsWith(r0)
            if (r0 != 0) goto L46
            java.lang.String r0 = "file://"
            boolean r0 = r3.startsWith(r0)
            if (r0 != 0) goto L46
            java.lang.String r0 = "/"
            boolean r0 = r3.startsWith(r0)
            if (r0 != 0) goto L46
            java.lang.String r0 = ".mpd"
            boolean r0 = r3.endsWith(r0)
            if (r0 != 0) goto L46
            java.lang.String r0 = ".mpd?"
            boolean r3 = r3.contains(r0)
            if (r3 != 0) goto L46
            r3 = 1
            return r3
        L46:
            return r1
    }

    private boolean d() {
            r4 = this;
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader r0 = r4.i
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            r0 = 0
            int r2 = com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader.init(r0, r0)
            if (r2 == 0) goto L15
            java.lang.String r1 = "DataLoaderHelper"
            java.lang.String r2 = "library has not been loaded"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.e(r1, r2)
            return r0
        L15:
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader r2 = com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader.getInstance()     // Catch: java.lang.Exception -> L2b
            r4.i = r2     // Catch: java.lang.Exception -> L2b
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure r3 = r4.j     // Catch: java.lang.Exception -> L2b
            r2.setConfigure(r3)     // Catch: java.lang.Exception -> L2b
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader r2 = r4.i     // Catch: java.lang.Exception -> L2b
            r2.setListener(r4)     // Catch: java.lang.Exception -> L2b
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader r2 = r4.i     // Catch: java.lang.Exception -> L2b
            r2.setStartCompleteListener(r4)     // Catch: java.lang.Exception -> L2b
            return r1
        L2b:
            return r0
    }

    public static java.lang.String encodeUrl(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L7
            return r1
        L7:
            java.lang.String r0 = "UTF-8"
            java.lang.String r1 = java.net.URLEncoder.encode(r1, r0)     // Catch: java.io.UnsupportedEncodingException -> Le
            return r1
        Le:
            r1 = 0
            return r1
    }

    public static java.lang.String encodeUrlByQuery(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L7
            return r2
        L7:
            java.lang.String r0 = com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader.queryComponentEncode(r2)     // Catch: java.io.UnsupportedEncodingException -> L19
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.io.UnsupportedEncodingException -> L19
            if (r1 == 0) goto L18
            java.lang.String r0 = "UTF-8"
            java.lang.String r2 = java.net.URLEncoder.encode(r2, r0)     // Catch: java.io.UnsupportedEncodingException -> L19
            return r2
        L18:
            return r0
        L19:
            r2 = 0
            return r2
    }

    public static com.bykv.vk.component.ttvideo.DataLoaderHelper getDataLoader() {
            com.bykv.vk.component.ttvideo.DataLoaderHelper r0 = com.bykv.vk.component.ttvideo.DataLoaderHelper.f1632p
            return r0
    }

    public void _addEngine(com.bykv.vk.component.ttvideo.TTVideoEngine r4, java.lang.String r5) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L7
            return
        L7:
            java.util.concurrent.locks.ReentrantLock r0 = r3.h     // Catch: java.lang.Throwable -> L21
            r0.lock()     // Catch: java.lang.Throwable -> L21
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.bykv.vk.component.ttvideo.TTVideoEngine>> r0 = r3.g     // Catch: java.lang.Throwable -> L21
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Throwable -> L21
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> L21
            if (r0 != 0) goto L23
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L21
            r0.<init>()     // Catch: java.lang.Throwable -> L21
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.bykv.vk.component.ttvideo.TTVideoEngine>> r1 = r3.g     // Catch: java.lang.Throwable -> L21
            r1.put(r5, r0)     // Catch: java.lang.Throwable -> L21
            goto L23
        L21:
            r4 = move-exception
            goto L51
        L23:
            boolean r1 = r0.contains(r4)     // Catch: java.lang.Throwable -> L21
            if (r1 != 0) goto L4b
            r0.add(r4)     // Catch: java.lang.Throwable -> L21
            java.lang.String r4 = "DataLoaderHelper"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L21
            java.lang.String r2 = "add engine ref,rawKey = "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L21
            r1.append(r5)     // Catch: java.lang.Throwable -> L21
            java.lang.String r5 = " engine ref count: "
            r1.append(r5)     // Catch: java.lang.Throwable -> L21
            int r5 = r0.size()     // Catch: java.lang.Throwable -> L21
            r1.append(r5)     // Catch: java.lang.Throwable -> L21
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L21
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r4, r5)     // Catch: java.lang.Throwable -> L21
        L4b:
            java.util.concurrent.locks.ReentrantLock r4 = r3.h
            r4.unlock()
            return
        L51:
            java.util.concurrent.locks.ReentrantLock r5 = r3.h
            r5.unlock()
            throw r4
    }

    public java.lang.String _proxyUrl(java.lang.String r14, java.lang.String r15, long r16, java.lang.String[] r18, java.lang.String r19) {
            r13 = this;
            r0 = r18
            java.lang.String r1 = "&ah="
            int r2 = r13.a
            r3 = 0
            if (r2 == 0) goto La
            return r3
        La:
            boolean r2 = android.text.TextUtils.isEmpty(r14)
            if (r2 != 0) goto L117
            if (r0 == 0) goto L117
            int r2 = r0.length
            if (r2 <= 0) goto L117
            java.lang.Object r0 = r0.clone()
            r11 = r0
            java.lang.String[] r11 = (java.lang.String[]) r11
            int r0 = r11.length
            r2 = 0
        L1e:
            if (r2 >= r0) goto L2c
            r4 = r11[r2]
            boolean r5 = r13.c(r4)
            if (r5 != 0) goto L29
            return r4
        L29:
            int r2 = r2 + 1
            goto L1e
        L2c:
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader r0 = r13.i
            java.lang.String r2 = "DataLoaderHelper"
            if (r0 != 0) goto L38
            java.lang.String r14 = "start mdl first"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.e(r2, r14)
            return r3
        L38:
            java.util.concurrent.locks.ReentrantLock r0 = r13.f1639o
            r0.lock()
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader r0 = r13.i     // Catch: java.lang.Throwable -> L54
            java.lang.String r0 = r0.getLocalAddr()     // Catch: java.lang.Throwable -> L54
            boolean r4 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L54
            if (r4 == 0) goto L58
            java.lang.String r14 = "local host error"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.e(r2, r14)     // Catch: java.lang.Throwable -> L54
            java.util.concurrent.locks.ReentrantLock r14 = r13.f1639o
            r14.unlock()
            return r3
        L54:
            r0 = move-exception
            r14 = r0
            goto L111
        L58:
            r7 = 0
            r4 = r13
            r5 = r14
            r6 = r15
            r9 = r16
            r12 = r19
            java.lang.String r7 = r4.a(r5, r6, r7, r9, r11, r12)     // Catch: java.lang.Throwable -> L54
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L54
            if (r8 == 0) goto L71
            java.util.concurrent.locks.ReentrantLock r14 = r13.f1639o
            r14.unlock()
            return r3
        L71:
            java.lang.StringBuffer r3 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L54
            r3.<init>()     // Catch: java.lang.Throwable -> L54
            int r8 = r13.f1638n     // Catch: java.lang.Throwable -> L54
            int r9 = r8 + 1
            r13.f1638n = r9     // Catch: java.lang.Throwable -> L54
            java.lang.StringBuffer r9 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L54
            r9.<init>()     // Catch: java.lang.Throwable -> L54
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L54
            java.lang.String r12 = "proxy url, mInvalidMdlProcotol: "
            r10.<init>(r12)     // Catch: java.lang.Throwable -> L54
            boolean r12 = r13.f1636l     // Catch: java.lang.Throwable -> L54
            r10.append(r12)     // Catch: java.lang.Throwable -> L54
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L54
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r2, r10)     // Catch: java.lang.Throwable -> L54
            boolean r10 = r13.f1636l     // Catch: java.lang.Throwable -> L54
            java.lang.String r12 = "/"
            if (r10 != 0) goto Laa
            boolean r10 = r13.f1637m     // Catch: java.lang.Throwable -> L54
            if (r10 == 0) goto Laa
            java.lang.String r0 = "mdl://id"
            r3.append(r0)     // Catch: java.lang.Throwable -> L54
            r3.append(r8)     // Catch: java.lang.Throwable -> L54
            r3.append(r12)     // Catch: java.lang.Throwable -> L54
            goto Lb8
        Laa:
            java.lang.String r10 = "http://"
            r3.append(r10)     // Catch: java.lang.Throwable -> L54
            r3.append(r0)     // Catch: java.lang.Throwable -> L54
            r3.append(r12)     // Catch: java.lang.Throwable -> L54
            r3.append(r8)     // Catch: java.lang.Throwable -> L54
        Lb8:
            r3.append(r7)     // Catch: java.lang.Throwable -> L54
            r9.append(r7)     // Catch: java.lang.Throwable -> L54
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader r0 = r13.i     // Catch: java.lang.Throwable -> L54
            java.lang.String r0 = r0.getAuth(r7)     // Catch: java.lang.Throwable -> L54
            boolean r7 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L54
            if (r7 != 0) goto Ld6
            r3.append(r1)     // Catch: java.lang.Throwable -> L54
            r3.append(r0)     // Catch: java.lang.Throwable -> L54
            r3.append(r1)     // Catch: java.lang.Throwable -> L54
            r3.append(r0)     // Catch: java.lang.Throwable -> L54
        Ld6:
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L54
            java.lang.String r1 = "_proxyUrl: "
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L54
            java.lang.String r1 = r1.concat(r3)     // Catch: java.lang.Throwable -> L54
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r2, r1)     // Catch: java.lang.Throwable -> L54
            java.util.concurrent.locks.ReentrantLock r1 = r13.f1639o
            r1.unlock()
            com.bykv.vk.component.ttvideo.DataLoaderHelper$d r1 = r13.e
            com.bykv.vk.component.ttvideo.DataLoaderHelper$b r1 = r1.d(r15)
            if (r1 != 0) goto Lf9
            com.bykv.vk.component.ttvideo.DataLoaderHelper$b r1 = new com.bykv.vk.component.ttvideo.DataLoaderHelper$b
            r1.<init>(r13)
        Lf9:
            com.bykv.vk.component.ttvideo.DataLoaderHelper$b$a r2 = r1.a(r14)
            if (r2 == 0) goto L110
            r2.a = r14
            r1.a = r15
            r2.b = r0
            r2.c = r11
            r12 = r19
            r2.d = r12
            com.bykv.vk.component.ttvideo.DataLoaderHelper$d r14 = r13.e
            r14.a(r1)
        L110:
            return r0
        L111:
            java.util.concurrent.locks.ReentrantLock r15 = r13.f1639o
            r15.unlock()
            throw r14
        L117:
            return r3
    }

    public void _removeEngine(com.bykv.vk.component.ttvideo.TTVideoEngine r4, java.lang.String r5) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L7
            return
        L7:
            java.util.concurrent.locks.ReentrantLock r0 = r3.h     // Catch: java.lang.Throwable -> L44
            r0.lock()     // Catch: java.lang.Throwable -> L44
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.bykv.vk.component.ttvideo.TTVideoEngine>> r0 = r3.g     // Catch: java.lang.Throwable -> L44
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Throwable -> L44
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L46
            r0.remove(r4)     // Catch: java.lang.Throwable -> L44
            java.lang.String r4 = "DataLoaderHelper"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L44
            java.lang.String r2 = "remove engine ref,rawKey = "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L44
            r1.append(r5)     // Catch: java.lang.Throwable -> L44
            java.lang.String r2 = " engine ref count: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L44
            int r2 = r0.size()     // Catch: java.lang.Throwable -> L44
            r1.append(r2)     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L44
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r4, r1)     // Catch: java.lang.Throwable -> L44
            int r4 = r0.size()     // Catch: java.lang.Throwable -> L44
            if (r4 != 0) goto L46
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.bykv.vk.component.ttvideo.TTVideoEngine>> r4 = r3.g     // Catch: java.lang.Throwable -> L44
            r4.remove(r5)     // Catch: java.lang.Throwable -> L44
            goto L46
        L44:
            r4 = move-exception
            goto L4c
        L46:
            java.util.concurrent.locks.ReentrantLock r4 = r3.h
            r4.unlock()
            return
        L4c:
            java.util.concurrent.locks.ReentrantLock r5 = r3.h
            r5.unlock()
            throw r4
    }

    public void _removePlayTask(java.lang.String r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.DataLoaderHelper$d r0 = r1.e
            r0.c(r2)
            return
    }

    public void addTask(com.bykv.vk.component.ttvideo.PreloaderURLItem r8) {
            r7 = this;
            int r0 = com.bykv.vk.component.ttvideo.DataLoaderHelper.f1633q
            int r0 = r0 + 1
            com.bykv.vk.component.ttvideo.DataLoaderHelper.f1633q = r0
            if (r8 != 0) goto L10
            java.lang.String r8 = "DataLoaderHelper"
            java.lang.String r0 = "[preload] url item invalid"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.e(r8, r0)
            return
        L10:
            java.util.concurrent.locks.ReentrantLock r0 = r7.f1639o
            r0.lock()
            java.lang.String r2 = r8.getKey()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r3 = r8.getVideoId()     // Catch: java.lang.Throwable -> L2f
            long r4 = r8.getPreloadSize()     // Catch: java.lang.Throwable -> L2f
            r1 = r7
            r6 = r8
            r1.a(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L2c
            java.util.concurrent.locks.ReentrantLock r8 = r1.f1639o
            r8.unlock()
            return
        L2c:
            r0 = move-exception
        L2d:
            r8 = r0
            goto L32
        L2f:
            r0 = move-exception
            r1 = r7
            goto L2d
        L32:
            java.util.concurrent.locks.ReentrantLock r0 = r1.f1639o
            r0.unlock()
            throw r8
    }

    public void cancelAllTasks() {
            r2 = this;
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader r0 = r2.i
            if (r0 == 0) goto L1c
            int r0 = r2.a
            if (r0 != 0) goto L1c
            java.util.concurrent.locks.ReentrantLock r0 = r2.f1639o
            r0.lock()
            r2.cancelAllTasksInternal()     // Catch: java.lang.Throwable -> L16
            java.util.concurrent.locks.ReentrantLock r0 = r2.f1639o
            r0.unlock()
            return
        L16:
            java.util.concurrent.locks.ReentrantLock r0 = r2.f1639o
            r0.unlock()
            return
        L1c:
            java.lang.String r0 = "DataLoaderHelper"
            java.lang.String r1 = "need start mdl first"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.e(r0, r1)
            return
    }

    public void cancelAllTasksInternal() {
            r1 = this;
            com.bykv.vk.component.ttvideo.DataLoaderHelper$d r0 = r1.c
            r1.a(r0)
            com.bykv.vk.component.ttvideo.DataLoaderHelper$d r0 = r1.b
            r1.a(r0)
            com.bykv.vk.component.ttvideo.DataLoaderHelper$d r0 = r1.d
            boolean r0 = r1.a(r0)
            if (r0 == 0) goto L17
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader r0 = r1.i
            r0.cancelAll()
        L17:
            return
    }

    public void cancelTask(java.lang.String r4) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L7
            return
        L7:
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader r0 = r3.i
            java.lang.String r1 = "DataLoaderHelper"
            if (r0 == 0) goto L50
            int r0 = r3.a
            if (r0 != 0) goto L50
            java.util.concurrent.locks.ReentrantLock r0 = r3.f1639o
            r0.lock()
            com.bykv.vk.component.ttvideo.DataLoaderHelper$d r0 = r3.b     // Catch: java.lang.Throwable -> L4a
            com.bykv.vk.component.ttvideo.DataLoaderHelper$b r0 = r0.c(r4)     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L1f
            goto L34
        L1f:
            com.bykv.vk.component.ttvideo.DataLoaderHelper$d r0 = r3.c     // Catch: java.lang.Throwable -> L4a
            com.bykv.vk.component.ttvideo.DataLoaderHelper$b r0 = r0.c(r4)     // Catch: java.lang.Throwable -> L4a
            if (r0 != 0) goto L34
            com.bykv.vk.component.ttvideo.DataLoaderHelper$d r0 = r3.d     // Catch: java.lang.Throwable -> L4a
            com.bykv.vk.component.ttvideo.DataLoaderHelper$b r0 = r0.c(r4)     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L37
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader r2 = r3.i     // Catch: java.lang.Throwable -> L4a
            r2.cancel(r4)     // Catch: java.lang.Throwable -> L4a
        L34:
            r3.c(r0)     // Catch: java.lang.Throwable -> L4a
        L37:
            java.lang.String r0 = "[preload] cancel preload task. key = "
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r4 = r0.concat(r4)     // Catch: java.lang.Throwable -> L4a
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r1, r4)     // Catch: java.lang.Throwable -> L4a
            java.util.concurrent.locks.ReentrantLock r4 = r3.f1639o
            r4.unlock()
            return
        L4a:
            java.util.concurrent.locks.ReentrantLock r4 = r3.f1639o
            r4.unlock()
            return
        L50:
            java.lang.String r4 = "need start mdl first"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.e(r1, r4)
            return
    }

    public void clearAllCaches() {
            r2 = this;
            int r0 = r2.a
            if (r0 == 0) goto L5
            return
        L5:
            java.util.concurrent.locks.ReentrantLock r0 = r2.f1639o
            r0.lock()
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader r0 = r2.i     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L1d
            java.lang.String r0 = "DataLoaderHelper"
            java.lang.String r1 = "mInnerDataLoader == null"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.e(r0, r1)     // Catch: java.lang.Throwable -> L1b
        L15:
            java.util.concurrent.locks.ReentrantLock r0 = r2.f1639o
            r0.unlock()
            return
        L1b:
            r0 = move-exception
            goto L21
        L1d:
            r0.clearAllCaches()     // Catch: java.lang.Throwable -> L1b
            goto L15
        L21:
            com.bytedance.sdk.component.utils.vl.j(r0)     // Catch: java.lang.Throwable -> L25
            goto L15
        L25:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantLock r1 = r2.f1639o
            r1.unlock()
            throw r0
    }

    public void close() {
            r2 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r2.f1639o
            r0.lock()
            int r0 = r2.a     // Catch: java.lang.Throwable -> L17
            r1 = 1
            if (r0 != r1) goto L19
            java.lang.String r0 = "DataLoaderHelper"
            java.lang.String r1 = "DataLoader not started, not need close"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.e(r0, r1)     // Catch: java.lang.Throwable -> L17
        L11:
            java.util.concurrent.locks.ReentrantLock r0 = r2.f1639o
            r0.unlock()
            return
        L17:
            r0 = move-exception
            goto L24
        L19:
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader r0 = r2.i     // Catch: java.lang.Throwable -> L17
            r0.close()     // Catch: java.lang.Throwable -> L17
            r2.cancelAllTasksInternal()     // Catch: java.lang.Throwable -> L17
            r2.a = r1     // Catch: java.lang.Throwable -> L17
            goto L11
        L24:
            java.util.concurrent.locks.ReentrantLock r1 = r2.f1639o
            r1.unlock()
            throw r0
    }

    public com.bykv.vk.component.ttvideo.DataLoaderHelper.DataLoaderCacheInfo getCacheInfoByFilePath(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r2.f1639o
            r0.lock()
            r0 = 0
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader r1 = r2.i     // Catch: java.lang.Throwable -> La
            if (r1 != 0) goto L10
        La:
            java.util.concurrent.locks.ReentrantLock r3 = r2.f1639o
            r3.unlock()
            return r0
        L10:
            java.lang.String r3 = r1.getStringCacheInfo(r3, r4)     // Catch: java.lang.Throwable -> La
            com.bykv.vk.component.ttvideo.DataLoaderHelper$DataLoaderCacheInfo r3 = r2.b(r3)     // Catch: java.lang.Throwable -> La
            java.util.concurrent.locks.ReentrantLock r4 = r2.f1639o
            r4.unlock()
            return r3
    }

    public long getCacheSize(java.lang.String r6) {
            r5 = this;
            int r0 = r5.a
            r1 = 0
            if (r0 == 0) goto L7
            return r1
        L7:
            java.util.concurrent.locks.ReentrantLock r0 = r5.f1639o
            r0.lock()
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader r0 = r5.i     // Catch: java.lang.Throwable -> L21
            if (r0 != 0) goto L16
        L10:
            java.util.concurrent.locks.ReentrantLock r6 = r5.f1639o
            r6.unlock()
            return r1
        L16:
            long r3 = r0.getCacheSize(r6)     // Catch: java.lang.Throwable -> L21
            int r6 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r6 > 0) goto L1f
            goto L10
        L1f:
            r1 = r3
            goto L10
        L21:
            r6 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r6)     // Catch: java.lang.Throwable -> L26
            goto L10
        L26:
            r6 = move-exception
            java.util.concurrent.locks.ReentrantLock r0 = r5.f1639o
            r0.unlock()
            throw r6
    }

    public long getCacheSizeByFilePath(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r2.f1639o
            r0.lock()
            r0 = 0
            com.bykv.vk.component.ttvideo.DataLoaderHelper$DataLoaderCacheInfo r3 = r2.getCacheInfoByFilePath(r3, r4)     // Catch: java.lang.Throwable -> Lf
            if (r3 == 0) goto Lf
            long r0 = r3.mCacheSizeFromZero     // Catch: java.lang.Throwable -> Lf
        Lf:
            java.util.concurrent.locks.ReentrantLock r3 = r2.f1639o
            r3.unlock()
            return r0
    }

    @Override // com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderListener
    public java.lang.String getCheckSumInfo(java.lang.String r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderListener
    public long getInt64Value(int r1, long r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    public com.bykv.vk.component.ttvideo.DataLoaderHelper.c getLoadProgressByRawKey(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto Lf
            java.lang.String r2 = "DataLoaderHelper"
            java.lang.String r0 = "[preload] get, param is invalid key is null"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.e(r2, r0)
            r2 = 0
            return r2
        Lf:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bykv.vk.component.ttvideo.DataLoaderHelper$c> r0 = r1.f
            java.lang.Object r2 = r0.get(r2)
            com.bykv.vk.component.ttvideo.DataLoaderHelper$c r2 = (com.bykv.vk.component.ttvideo.DataLoaderHelper.c) r2
            return r2
    }

    @Override // com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderListener
    public java.lang.String getStringValue(int r1, long r2, java.lang.String r4) {
            r0 = this;
            r1 = 0
            return r1
    }

    public void notifyPreloadError(com.bykv.vk.component.ttvideo.PreloaderURLItem r4, int r5) {
            r3 = this;
            com.bykv.vk.component.ttvideo.IPreLoaderItemCallBackListener r4 = r4.getCallBackListener()
            if (r4 == 0) goto L1e
            int r0 = com.bykv.vk.component.ttvideo.DataLoaderHelper.f1635s
            int r0 = r0 + 1
            com.bykv.vk.component.ttvideo.DataLoaderHelper.f1635s = r0
            com.bykv.vk.component.ttvideo.PreLoaderItemCallBackInfo r0 = new com.bykv.vk.component.ttvideo.PreLoaderItemCallBackInfo
            r1 = 3
            r0.<init>(r1)
            com.bykv.vk.component.ttvideo.utils.Error r1 = new com.bykv.vk.component.ttvideo.utils.Error
            java.lang.String r2 = "kTTVideoErrorDomainDataLoaderPreload"
            r1.<init>(r2, r5)
            r0.preloadError = r1
            r4.preloadItemInfo(r0)
        L1e:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderListener
    public void onNotify(com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderNotifyInfo r14) {
            r13 = this;
            if (r14 != 0) goto L4
            goto L16a
        L4:
            int r0 = r14.what
            if (r0 == 0) goto L15f
            r1 = 15
            if (r0 == r1) goto L15f
            r1 = 20
            r2 = 2
            r4 = 3
            java.lang.String r6 = ","
            r7 = 8
            r8 = 3
            r9 = 0
            r10 = 1
            if (r0 == r1) goto L7a
            r1 = 4
            if (r0 == r8) goto L5b
            if (r0 == r1) goto L5b
            r11 = 7
            if (r0 == r11) goto L2f
            if (r0 == r7) goto L7a
            r1 = 10
            if (r0 == r1) goto L15f
            r1 = 11
            if (r0 == r1) goto L15f
            goto L16a
        L2f:
            int r0 = com.bykv.vk.component.ttvideo.DataLoaderHelper.f1634r
            int r0 = r0 + r10
            com.bykv.vk.component.ttvideo.DataLoaderHelper.f1634r = r0
            java.lang.String r0 = r14.logInfo
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L3e
            goto L16a
        L3e:
            java.lang.String r14 = r14.logInfo
            java.lang.String[] r14 = r14.split(r6)
            int r0 = r14.length
            if (r0 >= r1) goto L49
            goto L16a
        L49:
            r0 = 2
            r14 = r14[r0]
            com.bykv.vk.component.ttvideo.DataLoaderHelper$d r0 = r13.d
            com.bykv.vk.component.ttvideo.DataLoaderHelper$b r0 = r0.b(r14)
            com.bykv.vk.component.ttvideo.DataLoaderHelper$d r1 = r13.d
            r1.c(r14)
            r13.c(r0)
            return
        L5b:
            if (r0 != r1) goto L62
            int r6 = com.bykv.vk.component.ttvideo.DataLoaderHelper.f1634r
            int r6 = r6 + r10
            com.bykv.vk.component.ttvideo.DataLoaderHelper.f1634r = r6
        L62:
            java.lang.String r6 = r14.logInfo
            if (r6 == 0) goto L16a
            long r6 = r14.parameter
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 == 0) goto L16a
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 != 0) goto L72
            r2 = 1
            goto L73
        L72:
            r2 = 0
        L73:
            if (r0 != r1) goto L76
            r9 = 1
        L76:
            r13.a(r14, r2, r9)
            return
        L7a:
            if (r0 != r7) goto L81
            int r0 = com.bykv.vk.component.ttvideo.DataLoaderHelper.f1634r
            int r0 = r0 + r10
            com.bykv.vk.component.ttvideo.DataLoaderHelper.f1634r = r0
        L81:
            java.lang.String r0 = r14.logInfo
            if (r0 == 0) goto L8d
            long r11 = r14.parameter
            int r1 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r1 != 0) goto L8d
            goto L16a
        L8d:
            if (r0 == 0) goto L16a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = " task fail log = "
            r0.<init>(r1)
            java.lang.String r1 = r14.logInfo
            r0.append(r1)
            java.lang.String r1 = ", code = "
            r0.append(r1)
            long r4 = r14.code
            r0.append(r4)
            java.lang.String r1 = ", task type = "
            r0.append(r1)
            long r4 = r14.parameter
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "DataLoaderHelper"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r1, r0)
            java.lang.String r0 = r14.logInfo
            java.lang.String[] r0 = r0.split(r6)
            int r4 = r0.length
            if (r4 > 0) goto Lc3
            goto L16a
        Lc3:
            r0 = r0[r9]
            com.bykv.vk.component.ttvideo.DataLoaderHelper$d r4 = r13.d
            com.bykv.vk.component.ttvideo.DataLoaderHelper$b r4 = r4.b(r0)
            if (r4 != 0) goto Lcf
            goto L16a
        Lcf:
            com.bykv.vk.component.ttvideo.DataLoaderHelper$d r5 = r13.d
            com.bykv.vk.component.ttvideo.utils.Error r6 = new com.bykv.vk.component.ttvideo.utils.Error
            long r11 = r14.code
            int r7 = (int) r11
            java.lang.String r9 = r14.logInfo
            java.lang.String r11 = "kTTVideoErrorDomainDataLoaderPreload"
            r6.<init>(r11, r7, r9)
            java.lang.String r7 = r4.a
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto Le7
            r7 = r0
            goto Le9
        Le7:
            java.lang.String r7 = r4.a
        Le9:
            com.bykv.vk.component.ttvideo.DataLoaderHelper$c r9 = r13.getLoadProgressByRawKey(r7)
            if (r9 != 0) goto Lf4
            com.bykv.vk.component.ttvideo.DataLoaderHelper$c r9 = new com.bykv.vk.component.ttvideo.DataLoaderHelper$c
            r9.<init>(r13)
        Lf4:
            java.lang.String r11 = r4.a
            r9.a = r11
            long r11 = r14.parameter
            int r12 = (int) r11
            r9.b = r12
            r9.a(r4)
            r9.a(r0, r6)
            r13.putByRawKey(r7, r9)
            boolean r11 = r9.b()
            if (r11 != 0) goto L119
            boolean r11 = r9.c()
            if (r11 != 0) goto L119
            r9.b()
            r9.c()
            return
        L119:
            r5.c(r0)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r11 = "pop all task item. videoId = "
            r5.<init>(r11)
            java.lang.String r11 = r4.a
            r5.append(r11)
            java.lang.String r11 = " key = "
            r5.append(r11)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r1, r0)
            r13.removeLoadProgressByRawKey(r7)
            com.bykv.vk.component.ttvideo.IPreLoaderItemCallBackListener r0 = r4.a()
            if (r0 == 0) goto L16a
            long r0 = r14.parameter
            int r14 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r14 != 0) goto L16a
            com.bykv.vk.component.ttvideo.PreLoaderItemCallBackInfo r14 = new com.bykv.vk.component.ttvideo.PreLoaderItemCallBackInfo
            r14.<init>(r8)
            r14.preloadError = r6
            r14.loadProgress = r9
            r0 = 0
            r14.preloadDataInfo = r0
            int r0 = com.bykv.vk.component.ttvideo.DataLoaderHelper.f1635s
            int r0 = r0 + r10
            com.bykv.vk.component.ttvideo.DataLoaderHelper.f1635s = r0
            com.bykv.vk.component.ttvideo.IPreLoaderItemCallBackListener r0 = r4.a()
            r0.preloadItemInfo(r14)
            return
        L15f:
            com.bykv.vk.component.ttvideo.log.VideoEventEngineUploader r0 = r13.k
            if (r0 == 0) goto L16a
            java.lang.String r1 = r14.logType
            org.json.JSONObject r14 = r14.jsonLog
            r0.onEvent(r1, r14)
        L16a:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLStartCompleteListener
    public void onStartComplete() {
            r0 = this;
            return
    }

    public void putByRawKey(java.lang.String r2, com.bykv.vk.component.ttvideo.DataLoaderHelper.c r3) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto Le
            if (r3 == 0) goto Le
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bykv.vk.component.ttvideo.DataLoaderHelper$c> r0 = r1.f
            r0.put(r2, r3)
            return
        Le:
            java.lang.String r2 = "DataLoaderHelper"
            java.lang.String r3 = "[preload] param is invalid"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.e(r2, r3)
            return
    }

    public void removeCacheFile(java.lang.String r4, boolean r5) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L7
            return
        L7:
            java.util.concurrent.locks.ReentrantLock r0 = r3.f1639o
            r0.lock()
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader r0 = r3.i     // Catch: java.lang.Throwable -> L17
            java.lang.String r1 = "DataLoaderHelper"
            if (r0 != 0) goto L1d
            java.lang.String r4 = "mInnerDataLoader == null"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.e(r1, r4)     // Catch: java.lang.Throwable -> L17
        L17:
            java.util.concurrent.locks.ReentrantLock r4 = r3.f1639o
            r4.unlock()
            return
        L1d:
            java.lang.String r0 = "remove mdl file. key "
            java.lang.String r2 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L17
            java.lang.String r0 = r0.concat(r2)     // Catch: java.lang.Throwable -> L17
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r1, r0)     // Catch: java.lang.Throwable -> L17
            if (r5 == 0) goto L32
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader r5 = r3.i     // Catch: java.lang.Throwable -> L17
            r5.forceRemoveFileCache(r4)     // Catch: java.lang.Throwable -> L17
            goto L17
        L32:
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader r5 = r3.i     // Catch: java.lang.Throwable -> L17
            r5.removeFileCache(r4)     // Catch: java.lang.Throwable -> L17
            goto L17
    }

    public void removeLoadProgressByRawKey(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto Le
            java.lang.String r2 = "DataLoaderHelper"
            java.lang.String r0 = "[preload] remove, param is invalid key is null"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.e(r2, r0)
            return
        Le:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bykv.vk.component.ttvideo.DataLoaderHelper$c> r0 = r1.f
            r0.remove(r2)
            return
    }

    public void setCacheInfoLists(java.lang.String[] r2, long[] r3) {
            r1 = this;
            java.util.Arrays.toString(r2)
            java.util.Arrays.toString(r3)
            java.util.concurrent.locks.ReentrantLock r0 = r1.f1639o
            r0.lock()
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure r0 = r1.j     // Catch: java.lang.Throwable -> L16
            r0.setCacheInfoList(r2, r3)     // Catch: java.lang.Throwable -> L16
            java.util.concurrent.locks.ReentrantLock r2 = r1.f1639o
            r2.unlock()
            return
        L16:
            r2 = move-exception
            java.util.concurrent.locks.ReentrantLock r3 = r1.f1639o
            r3.unlock()
            throw r2
    }

    public void setContext(android.content.Context r1) {
            r0 = this;
            java.util.concurrent.locks.ReentrantLock r1 = r0.f1639o
            r1.lock()
            java.util.concurrent.locks.ReentrantLock r1 = r0.f1639o
            r1.unlock()
            return
    }

    public synchronized void setEngineUploader(com.bykv.vk.component.ttvideo.log.VideoEventEngineUploader r1) {
            r0 = this;
            monitor-enter(r0)
            r0.k = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
            throw r1
    }

    public void setIntValue(int r3, int r4) {
            r2 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r2.f1639o
            r0.lock()
            r0 = 11
            if (r3 == r0) goto L60
            r0 = 512(0x200, float:7.17E-43)
            if (r3 == r0) goto L52
            r0 = 1005(0x3ed, float:1.408E-42)
            r1 = 1
            if (r3 == r0) goto L36
            if (r3 == r1) goto L31
            r0 = 2
            if (r3 == r0) goto L2c
            r0 = 3
            if (r3 == r0) goto L27
            r0 = 4
            if (r3 == r0) goto L1e
            goto L71
        L1e:
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure r3 = r2.j     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            r3.mTryCount = r4     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            goto L71
        L23:
            r3 = move-exception
            goto L77
        L25:
            r3 = move-exception
            goto L6e
        L27:
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure r3 = r2.j     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            r3.mOpenTimeOut = r4     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            goto L71
        L2c:
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure r3 = r2.j     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            r3.mRWTimeOut = r4     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            goto L71
        L31:
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure r3 = r2.j     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            r3.mMaxCacheSize = r4     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            goto L71
        L36:
            if (r4 != r1) goto L39
            goto L3a
        L39:
            r1 = 0
        L3a:
            r2.f1637m = r1     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            java.lang.String r3 = "DataLoaderHelper"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            java.lang.String r0 = "config DATALOADER_KEY_SET_MDL_PROTOCOL_ENABLE: "
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            boolean r0 = r2.f1637m     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            r4.append(r0)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r3, r4)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            goto L71
        L52:
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure r3 = r2.j     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            r3.mAlogEnable = r4     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader r3 = r2.i     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            if (r3 == 0) goto L71
            r0 = 7225(0x1c39, float:1.0124E-41)
            r3.setIntValue(r0, r4)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            goto L71
        L60:
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure r3 = r2.j     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            r3.mPreloadParallelNum = r4     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader r3 = r2.i     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            if (r3 == 0) goto L71
            r0 = 102(0x66, float:1.43E-43)
            r3.setIntValue(r0, r4)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            goto L71
        L6e:
            com.bytedance.sdk.component.utils.vl.j(r3)     // Catch: java.lang.Throwable -> L23
        L71:
            java.util.concurrent.locks.ReentrantLock r3 = r2.f1639o
            r3.unlock()
            return
        L77:
            java.util.concurrent.locks.ReentrantLock r4 = r2.f1639o
            r4.unlock()
            throw r3
    }

    public void setStringValue(int r2, java.lang.String r3) {
            r1 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r1.f1639o
            r0.lock()
            if (r2 != 0) goto L13
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure r2 = r1.j     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> L13
            r2.mCacheDir = r3     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> L13
            goto L13
        Lc:
            r2 = move-exception
            java.util.concurrent.locks.ReentrantLock r3 = r1.f1639o
            r3.unlock()
            throw r2
        L13:
            java.util.concurrent.locks.ReentrantLock r2 = r1.f1639o
            r2.unlock()
            return
    }

    public void start() {
            r6 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r6.f1639o
            r0.lock()
            int r0 = r6.a     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L18
            java.lang.String r0 = "DataLoaderHelper"
            java.lang.String r1 = "DataLoader has started not need start"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.e(r0, r1)     // Catch: java.lang.Throwable -> L16
        L10:
            java.util.concurrent.locks.ReentrantLock r0 = r6.f1639o
            r0.unlock()
            return
        L16:
            r0 = move-exception
            goto L6b
        L18:
            boolean r0 = r6.d()     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L63
            com.bykv.vk.component.ttvideo.DataLoaderHelper$d r0 = r6.c     // Catch: java.lang.Throwable -> L16
            r1 = 4
            r0.a(r1)     // Catch: java.lang.Throwable -> L16
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure r0 = r6.j     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L2f
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure r0 = com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure.getDefaultonfigure()     // Catch: java.lang.Throwable -> L16
            r6.j = r0     // Catch: java.lang.Throwable -> L16
        L2f:
            com.bykv.vk.component.ttvideo.log.VideoEventEngineUploader r0 = r6.k     // Catch: java.lang.Throwable -> L16
            r1 = 1
            if (r0 == 0) goto L38
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure r0 = r6.j     // Catch: java.lang.Throwable -> L16
            r0.mEnableReportTaskLog = r1     // Catch: java.lang.Throwable -> L16
        L38:
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader r0 = r6.i     // Catch: java.lang.Throwable -> L16
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoaderConfigure r2 = r6.j     // Catch: java.lang.Throwable -> L16
            r0.setConfigure(r2)     // Catch: java.lang.Throwable -> L16
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader r0 = r6.i     // Catch: java.lang.Throwable -> L16
            int r0 = r0.start()     // Catch: java.lang.Throwable -> L16
            if (r0 < 0) goto L5b
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader r0 = r6.i     // Catch: java.lang.Throwable -> L16
            r2 = 7218(0x1c32, float:1.0115E-41)
            long r2 = r0.getLongValue(r2)     // Catch: java.lang.Throwable -> L16
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L57
            r6.f1636l = r1     // Catch: java.lang.Throwable -> L16
        L57:
            r0 = 0
            r6.a = r0     // Catch: java.lang.Throwable -> L16
            goto L10
        L5b:
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L16
            java.lang.String r1 = "start data loader fail"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L16
            throw r0     // Catch: java.lang.Throwable -> L16
        L63:
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L16
            java.lang.String r1 = "init data loader fail"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L16
            throw r0     // Catch: java.lang.Throwable -> L16
        L6b:
            java.util.concurrent.locks.ReentrantLock r1 = r6.f1639o
            r1.unlock()
            throw r0
    }
}
