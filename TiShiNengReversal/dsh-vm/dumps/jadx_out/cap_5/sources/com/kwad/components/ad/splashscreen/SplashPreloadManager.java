package com.kwad.components.ad.splashscreen;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class SplashPreloadManager {
    private java.util.HashMap<java.lang.String, com.kwad.components.ad.splashscreen.SplashPreloadManager.PreLoadItem> Fm;
    private java.util.List<java.lang.String> Fn;
    private volatile android.content.SharedPreferences Fo;
    private final java.lang.Object mLock;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.ksad.json.annotation.KsJson
    public static class PreLoadItem extends com.kwad.sdk.core.response.a.a implements java.io.Serializable {
        public long cacheTime;
        public long expiredTime;
        public int materialType;
        public java.lang.String preloadId;

        public PreLoadItem() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a {
        private static final com.kwad.components.ad.splashscreen.SplashPreloadManager Fp = null;

        static {
                com.kwad.components.ad.splashscreen.SplashPreloadManager r0 = new com.kwad.components.ad.splashscreen.SplashPreloadManager
                r1 = 0
                r0.<init>(r1)
                com.kwad.components.ad.splashscreen.SplashPreloadManager.a.Fp = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.kwad.components.ad.splashscreen.SplashPreloadManager lF() {
                com.kwad.components.ad.splashscreen.SplashPreloadManager r0 = com.kwad.components.ad.splashscreen.SplashPreloadManager.a.Fp
                return r0
        }
    }

    private SplashPreloadManager() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.mLock = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.Fm = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.Fn = r0
            r1.init()
            return
    }

    /* synthetic */ SplashPreloadManager(byte r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.io.File aa(java.lang.String r2) {
            if (r2 == 0) goto L2e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getVideoFile preloadId "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = "  url "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "PreloadManager"
            com.kwad.sdk.core.d.c.d(r1, r0)
            com.kwad.sdk.core.diskcache.b.a r0 = com.kwad.sdk.core.diskcache.b.a.GP()
            java.io.File r2 = r0.cf(r2)
            if (r2 == 0) goto L2e
            boolean r0 = r2.exists()
            if (r0 == 0) goto L2e
            return r2
        L2e:
            r2 = 0
            return r2
    }

    @androidx.annotation.AnyThread
    public static boolean i(com.kwad.sdk.core.response.model.AdResultData r2) {
            java.util.List r0 = r2.getAdTemplateList()
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 != 0) goto L2a
            java.util.List r2 = r2.getAdTemplateList()
            java.lang.Object r2 = r2.get(r1)
            com.kwad.sdk.core.response.model.AdTemplate r2 = (com.kwad.sdk.core.response.model.AdTemplate) r2
            java.util.List<com.kwad.sdk.core.response.model.AdInfo> r0 = r2.adInfoList
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2a
            java.util.List<com.kwad.sdk.core.response.model.AdInfo> r2 = r2.adInfoList
            java.lang.Object r2 = r2.get(r1)
            com.kwad.sdk.core.response.model.AdInfo r2 = (com.kwad.sdk.core.response.model.AdInfo) r2
            boolean r2 = com.kwad.sdk.core.response.b.a.bd(r2)
            return r2
        L2a:
            return r1
    }

    private void init() {
            r3 = this;
            android.content.Context r0 = com.kwad.sdk.service.ServiceProvider.getContext()
            if (r0 == 0) goto L12
            java.lang.String r1 = "ksadsdk_splash_preload_id_list"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            r3.Fo = r0
            r3.initData()
        L12:
            return
    }

    private void initData() {
            r7 = this;
            android.content.SharedPreferences r0 = r7.Fo
            java.util.Map r0 = r0.getAll()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Set r2 = r0.keySet()
            java.util.Iterator r2 = r2.iterator()
        L13:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L93
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            com.kwad.components.ad.splashscreen.SplashPreloadManager$PreLoadItem r4 = new com.kwad.components.ad.splashscreen.SplashPreloadManager$PreLoadItem
            r4.<init>()
            java.lang.Object r5 = r0.get(r3)     // Catch: java.lang.Exception -> L72
            boolean r6 = r5 instanceof java.lang.String     // Catch: java.lang.Exception -> L72
            if (r6 == 0) goto L13
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> L72
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L72
            if (r6 != 0) goto L13
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Exception -> L72
            r6.<init>(r5)     // Catch: java.lang.Exception -> L72
            r4.parseJson(r6)     // Catch: java.lang.Exception -> L72
            java.lang.String r5 = r4.preloadId     // Catch: java.lang.Exception -> L72
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L72
            if (r5 != 0) goto L13
            com.kwad.sdk.core.diskcache.b.a r5 = com.kwad.sdk.core.diskcache.b.a.GP()     // Catch: java.lang.Exception -> L72
            java.lang.String r6 = r4.preloadId     // Catch: java.lang.Exception -> L72
            java.io.File r5 = r5.cf(r6)     // Catch: java.lang.Exception -> L72
            if (r5 == 0) goto L74
            boolean r5 = r5.exists()     // Catch: java.lang.Exception -> L72
            if (r5 == 0) goto L74
            java.lang.Object r5 = r7.mLock     // Catch: java.lang.Exception -> L72
            monitor-enter(r5)     // Catch: java.lang.Exception -> L72
            java.util.HashMap<java.lang.String, com.kwad.components.ad.splashscreen.SplashPreloadManager$PreLoadItem> r6 = r7.Fm     // Catch: java.lang.Throwable -> L6c
            r6.put(r3, r4)     // Catch: java.lang.Throwable -> L6c
            java.util.List<java.lang.String> r4 = r7.Fn     // Catch: java.lang.Throwable -> L6c
            boolean r4 = r4.contains(r3)     // Catch: java.lang.Throwable -> L6c
            if (r4 != 0) goto L6e
            java.util.List<java.lang.String> r4 = r7.Fn     // Catch: java.lang.Throwable -> L6c
            r4.add(r3)     // Catch: java.lang.Throwable -> L6c
            goto L6e
        L6c:
            r3 = move-exception
            goto L70
        L6e:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L6c
            goto L13
        L70:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L6c
            throw r3     // Catch: java.lang.Exception -> L72
        L72:
            r3 = move-exception
            goto L8f
        L74:
            java.lang.String r3 = r4.preloadId     // Catch: java.lang.Exception -> L72
            r1.add(r3)     // Catch: java.lang.Exception -> L72
            java.lang.String r3 = "PreloadManager"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L72
            java.lang.String r6 = "Remove null file list "
            r5.<init>(r6)     // Catch: java.lang.Exception -> L72
            java.lang.String r4 = r4.preloadId     // Catch: java.lang.Exception -> L72
            r5.append(r4)     // Catch: java.lang.Exception -> L72
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Exception -> L72
            com.kwad.sdk.core.d.c.d(r3, r4)     // Catch: java.lang.Exception -> L72
            goto L13
        L8f:
            com.kwad.sdk.core.d.c.printStackTrace(r3)
            goto L13
        L93:
            android.content.SharedPreferences r0 = r7.Fo
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.util.Iterator r1 = r1.iterator()
        L9d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lad
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            r0.remove(r2)
            goto L9d
        Lad:
            r0.apply()
            return
    }

    @androidx.annotation.AnyThread
    public static boolean j(com.kwad.sdk.core.response.model.AdResultData r2) {
            java.util.List r0 = r2.getAdTemplateList()
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 != 0) goto L2a
            java.util.List r2 = r2.getAdTemplateList()
            java.lang.Object r2 = r2.get(r1)
            com.kwad.sdk.core.response.model.AdTemplate r2 = (com.kwad.sdk.core.response.model.AdTemplate) r2
            java.util.List<com.kwad.sdk.core.response.model.AdInfo> r0 = r2.adInfoList
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2a
            java.util.List<com.kwad.sdk.core.response.model.AdInfo> r2 = r2.adInfoList
            java.lang.Object r2 = r2.get(r1)
            com.kwad.sdk.core.response.model.AdInfo r2 = (com.kwad.sdk.core.response.model.AdInfo) r2
            boolean r2 = com.kwad.sdk.core.response.b.a.bc(r2)
            return r2
        L2a:
            return r1
    }

    @androidx.annotation.AnyThread
    public static com.kwad.components.ad.splashscreen.SplashPreloadManager lD() {
            com.kwad.components.ad.splashscreen.SplashPreloadManager r0 = com.kwad.components.ad.splashscreen.SplashPreloadManager.a.lF()
            android.content.SharedPreferences r1 = r0.Fo
            if (r1 != 0) goto Lb
            r0.init()
        Lb:
            return r0
    }

    @androidx.annotation.AnyThread
    private void o(com.kwad.sdk.core.response.model.AdInfo r8) {
            r7 = this;
            com.kwad.components.ad.splashscreen.SplashPreloadManager$PreLoadItem r0 = new com.kwad.components.ad.splashscreen.SplashPreloadManager$PreLoadItem
            r0.<init>()
            long r1 = java.lang.System.currentTimeMillis()
            r0.cacheTime = r1
            long r1 = java.lang.System.currentTimeMillis()
            com.kwad.sdk.core.response.model.AdInfo$AdPreloadInfo r3 = r8.adPreloadInfo
            int r3 = r3.validityPeriod
            long r3 = (long) r3
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r5
            long r1 = r1 + r3
            r0.expiredTime = r1
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.aZ(r8)
            r0.preloadId = r1
            boolean r1 = com.kwad.sdk.core.response.b.a.bc(r8)
            if (r1 == 0) goto L29
            r1 = 2
            goto L2a
        L29:
            r1 = 1
        L2a:
            r0.materialType = r1
            java.lang.Object r1 = r7.mLock
            monitor-enter(r1)
            java.util.HashMap<java.lang.String, com.kwad.components.ad.splashscreen.SplashPreloadManager$PreLoadItem> r2 = r7.Fm     // Catch: java.lang.Throwable -> L4e
            com.kwad.sdk.core.response.model.AdInfo$AdPreloadInfo r3 = r8.adPreloadInfo     // Catch: java.lang.Throwable -> L4e
            java.lang.String r3 = r3.preloadId     // Catch: java.lang.Throwable -> L4e
            r2.put(r3, r0)     // Catch: java.lang.Throwable -> L4e
            java.util.List<java.lang.String> r2 = r7.Fn     // Catch: java.lang.Throwable -> L4e
            com.kwad.sdk.core.response.model.AdInfo$AdPreloadInfo r3 = r8.adPreloadInfo     // Catch: java.lang.Throwable -> L4e
            java.lang.String r3 = r3.preloadId     // Catch: java.lang.Throwable -> L4e
            boolean r2 = r2.contains(r3)     // Catch: java.lang.Throwable -> L4e
            if (r2 != 0) goto L50
            java.util.List<java.lang.String> r2 = r7.Fn     // Catch: java.lang.Throwable -> L4e
            com.kwad.sdk.core.response.model.AdInfo$AdPreloadInfo r3 = r8.adPreloadInfo     // Catch: java.lang.Throwable -> L4e
            java.lang.String r3 = r3.preloadId     // Catch: java.lang.Throwable -> L4e
            r2.add(r3)     // Catch: java.lang.Throwable -> L4e
            goto L50
        L4e:
            r8 = move-exception
            goto L6e
        L50:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4e
            android.content.SharedPreferences r1 = r7.Fo
            if (r1 == 0) goto L6d
            android.content.SharedPreferences r1 = r7.Fo
            android.content.SharedPreferences$Editor r1 = r1.edit()
            com.kwad.sdk.core.response.model.AdInfo$AdPreloadInfo r8 = r8.adPreloadInfo
            java.lang.String r8 = r8.preloadId
            org.json.JSONObject r0 = r0.toJson()
            java.lang.String r0 = r0.toString()
            r1.putString(r8, r0)
            r1.apply()
        L6d:
            return
        L6e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4e
            throw r8
    }

    private static boolean p(com.kwad.sdk.core.response.model.AdInfo r1) {
            com.kwad.sdk.core.config.item.d r0 = com.kwad.components.ad.splashscreen.b.a.FQ
            boolean r0 = com.kwad.sdk.core.config.e.a(r0)
            if (r0 == 0) goto L10
            boolean r1 = com.kwad.sdk.core.response.b.a.bd(r1)
            if (r1 == 0) goto L10
            r1 = 1
            return r1
        L10:
            r1 = 0
            return r1
    }

    @androidx.annotation.AnyThread
    private boolean q(com.kwad.sdk.core.response.model.AdInfo r5) {
            r4 = this;
            boolean r0 = p(r5)
            if (r0 == 0) goto L11
            com.kwad.sdk.core.response.model.AdInfo$AdMaterialInfo$MaterialFeature r5 = com.kwad.sdk.core.response.b.a.aU(r5)
            java.lang.String r5 = r5.materialUrl
            boolean r5 = com.kwad.sdk.core.imageloader.KSImageLoader.isImageExist(r5)
            return r5
        L11:
            com.kwad.sdk.core.response.model.AdInfo$AdPreloadInfo r5 = r5.adPreloadInfo
            java.lang.String r5 = r5.preloadId
            r0 = 0
            if (r5 == 0) goto L52
            com.kwad.sdk.core.diskcache.b.a r1 = com.kwad.sdk.core.diskcache.b.a.GP()
            java.io.File r1 = r1.cf(r5)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "check preloadId "
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r5 = " file exists "
            r2.append(r5)
            if (r1 != 0) goto L34
            java.lang.String r5 = "null"
            goto L3c
        L34:
            boolean r5 = r1.exists()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
        L3c:
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            java.lang.String r2 = "PreloadManager"
            com.kwad.sdk.core.d.c.d(r2, r5)
            if (r1 == 0) goto L52
            boolean r5 = r1.exists()
            if (r5 == 0) goto L52
            r5 = 1
            return r5
        L52:
            return r0
    }

    public final java.util.List<java.lang.String> S() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Object r1 = r5.mLock
            monitor-enter(r1)
            java.lang.String r2 = "PreloadManager"
            java.lang.String r3 = "getPreloadIdList start "
            com.kwad.sdk.core.d.c.d(r2, r3)     // Catch: java.lang.Throwable -> L34
            r2 = 0
        L10:
            java.util.List<java.lang.String> r3 = r5.Fn     // Catch: java.lang.Throwable -> L34
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L34
            if (r2 >= r3) goto L39
            java.util.List<java.lang.String> r3 = r5.Fn     // Catch: java.lang.Throwable -> L34
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> L34
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L34
            com.kwad.sdk.core.diskcache.b.a r4 = com.kwad.sdk.core.diskcache.b.a.GP()     // Catch: java.lang.Throwable -> L34
            java.io.File r4 = r4.cf(r3)     // Catch: java.lang.Throwable -> L34
            if (r4 == 0) goto L36
            boolean r4 = r4.exists()     // Catch: java.lang.Throwable -> L34
            if (r4 == 0) goto L36
            r0.add(r3)     // Catch: java.lang.Throwable -> L34
            goto L36
        L34:
            r0 = move-exception
            goto L5b
        L36:
            int r2 = r2 + 1
            goto L10
        L39:
            java.lang.String r2 = "PreloadManager"
            java.lang.String r3 = "getPreloadIdList end "
            com.kwad.sdk.core.d.c.d(r2, r3)     // Catch: java.lang.Throwable -> L34
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = "PreloadManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "getPreloadIdList "
            r2.<init>(r3)
            java.util.List<java.lang.String> r3 = r5.Fn
            int r3 = r3.size()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.kwad.sdk.core.d.c.d(r1, r2)
            return r0
        L5b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L34
            throw r0
    }

    @androidx.annotation.AnyThread
    public final int a(com.kwad.sdk.core.response.model.AdResultData r17, boolean r18, int r19) {
            r16 = this;
            r0 = r16
            r1 = r19
            java.util.List r2 = r17.getAdTemplateList()
            java.util.Iterator r2 = r2.iterator()
            com.kwad.components.ad.splashscreen.monitor.b.lZ()
            com.kwad.components.ad.splashscreen.monitor.b.k(r17)
            r3 = 0
            r4 = 0
        L14:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L114
            java.lang.Object r5 = r2.next()
            com.kwad.sdk.core.response.model.AdTemplate r5 = (com.kwad.sdk.core.response.model.AdTemplate) r5
            if (r5 == 0) goto L14
            java.util.List<com.kwad.sdk.core.response.model.AdInfo> r7 = r5.adInfoList
            java.util.Iterator r7 = r7.iterator()
        L28:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L14
            java.lang.Object r8 = r7.next()
            com.kwad.sdk.core.response.model.AdInfo r8 = (com.kwad.sdk.core.response.model.AdInfo) r8
            com.kwad.sdk.core.response.model.AdInfo$AdPreloadInfo r9 = r8.adPreloadInfo
            if (r9 == 0) goto L109
            android.content.SharedPreferences r9 = r0.Fo
            if (r9 == 0) goto L109
            long r9 = android.os.SystemClock.elapsedRealtime()
            boolean r11 = r0.q(r8)
            r12 = 2
            if (r11 != 0) goto Lf5
            boolean r11 = com.kwad.sdk.core.response.b.a.bc(r8)
            if (r11 == 0) goto L52
            java.lang.String r11 = com.kwad.sdk.core.response.b.a.K(r8)
            goto L60
        L52:
            boolean r11 = com.kwad.sdk.core.response.b.a.bd(r8)
            if (r11 == 0) goto L5f
            com.kwad.sdk.core.response.model.AdInfo$AdMaterialInfo$MaterialFeature r11 = com.kwad.sdk.core.response.b.a.aU(r8)
            java.lang.String r11 = r11.materialUrl
            goto L60
        L5f:
            r11 = 0
        L60:
            boolean r13 = android.text.TextUtils.isEmpty(r11)
            if (r13 != 0) goto Leb
            java.lang.String r12 = com.kwad.sdk.core.response.b.a.aZ(r8)
            com.kwad.sdk.core.response.model.AdInfo$AdPreloadInfo r13 = r8.adPreloadInfo
            int r13 = r13.preloadType
            r14 = 1
            if (r13 != r14) goto L89
            android.content.Context r13 = com.kwad.sdk.service.ServiceProvider.getContext()
            boolean r13 = com.kwad.sdk.utils.ao.isWifiConnected(r13)
            if (r13 != 0) goto L89
            if (r18 == 0) goto L7e
            goto L89
        L7e:
            com.kwad.components.ad.splashscreen.monitor.b.lZ()
            java.lang.String r8 = "networkError"
            com.kwad.components.ad.splashscreen.monitor.b.d(r5, r14, r8)
            r15 = r7
            goto L106
        L89:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r15 = "start Download preloadId "
            r13.<init>(r15)
            r13.append(r12)
            java.lang.String r15 = " true url "
            r13.append(r15)
            r13.append(r11)
            java.lang.String r13 = r13.toString()
            java.lang.String r15 = "PreloadManager"
            com.kwad.sdk.core.d.c.d(r15, r13)
            r15 = r7
            long r6 = r17.getPosId()
            r0.a(r6, r14)
            com.kwad.sdk.core.network.a.a$a r6 = new com.kwad.sdk.core.network.a.a$a
            r6.<init>()
            boolean r7 = p(r8)
            if (r7 == 0) goto Lc1
            android.graphics.Bitmap r7 = com.kwad.sdk.core.imageloader.KSImageLoader.loadImageSync(r11)
            if (r7 == 0) goto Lbf
            r7 = 1
            goto Lc5
        Lbf:
            r7 = 0
            goto Lc5
        Lc1:
            boolean r7 = com.kwad.components.core.video.k.a(r11, r12, r6)
        Lc5:
            if (r7 == 0) goto Ld8
            r0.o(r8)
            int r4 = r4 + 1
            com.kwad.components.ad.splashscreen.monitor.b.lZ()
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r6 = r6 - r9
            com.kwad.components.ad.splashscreen.monitor.b.a(r5, r6, r14, r1)
            goto L106
        Ld8:
            com.kwad.components.ad.splashscreen.monitor.b.lZ()
            r7 = 4
            java.lang.String r8 = r6.msg
            com.kwad.components.ad.splashscreen.monitor.b.d(r5, r7, r8)
            com.kwad.components.core.p.a r7 = com.kwad.components.core.p.a.se()
            java.lang.String r6 = r6.msg
            r7.f(r5, r14, r6)
            goto L106
        Leb:
            r15 = r7
            com.kwad.components.ad.splashscreen.monitor.b.lZ()
            java.lang.String r6 = "urlError"
            com.kwad.components.ad.splashscreen.monitor.b.d(r5, r12, r6)
            goto L106
        Lf5:
            r15 = r7
            com.kwad.components.ad.splashscreen.monitor.b.lZ()
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r6 = r6 - r9
            com.kwad.components.ad.splashscreen.monitor.b.a(r5, r6, r12, r1)
            r0.o(r8)
            int r4 = r4 + 1
        L106:
            r7 = r15
            goto L28
        L109:
            r15 = r7
            com.kwad.components.ad.splashscreen.monitor.b.lZ()
            r6 = 3
            java.lang.String r7 = "preloadIdError"
            com.kwad.components.ad.splashscreen.monitor.b.d(r5, r6, r7)
            goto L106
        L114:
            java.util.List r1 = r17.getAdTemplateList()
            int r1 = r1.size()
            if (r1 <= 0) goto L12a
            java.util.List r1 = r17.getAdTemplateList()
            java.lang.Object r1 = r1.get(r3)
            r6 = r1
            com.kwad.sdk.core.response.model.AdTemplate r6 = (com.kwad.sdk.core.response.model.AdTemplate) r6
            goto L12b
        L12a:
            r6 = 0
        L12b:
            java.lang.String r1 = "splashAd_"
            if (r4 <= 0) goto L13c
            java.lang.String r2 = "onSplashVideoAdCacheSuccess"
            com.kwad.sdk.utils.k.aq(r1, r2)
            com.kwad.components.core.p.a r1 = com.kwad.components.core.p.a.se()
            r1.e(r6, r4)
            return r4
        L13c:
            java.lang.String r2 = "onSplashVideoAdCacheFailed"
            com.kwad.sdk.utils.k.aq(r1, r2)
            return r4
    }

    public final void a(long r18, int r20) {
            r17 = this;
            r1 = r17
            long r2 = java.lang.System.currentTimeMillis()
            java.util.List<java.lang.String> r0 = r1.Fn
            int r0 = r0.size()
            java.lang.Object r4 = r1.mLock
            monitor-enter(r4)
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4e
            r5.<init>()     // Catch: java.lang.Throwable -> L4e
            java.util.HashMap<java.lang.String, com.kwad.components.ad.splashscreen.SplashPreloadManager$PreLoadItem> r6 = r1.Fm     // Catch: java.lang.Throwable -> L4e
            java.util.Set r6 = r6.keySet()     // Catch: java.lang.Throwable -> L4e
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L4e
            r7 = 0
            r8 = 0
            r9 = 0
        L21:
            boolean r10 = r6.hasNext()     // Catch: java.lang.Throwable -> L4e
            r11 = 2
            r12 = 1
            if (r10 == 0) goto L51
            java.lang.Object r10 = r6.next()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L4e
            java.util.HashMap<java.lang.String, com.kwad.components.ad.splashscreen.SplashPreloadManager$PreLoadItem> r13 = r1.Fm     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r13 = r13.get(r10)     // Catch: java.lang.Throwable -> L4e
            com.kwad.components.ad.splashscreen.SplashPreloadManager$PreLoadItem r13 = (com.kwad.components.ad.splashscreen.SplashPreloadManager.PreLoadItem) r13     // Catch: java.lang.Throwable -> L4e
            if (r13 == 0) goto L21
            long r14 = r13.expiredTime     // Catch: java.lang.Throwable -> L4e
            int r16 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r16 >= 0) goto L21
            r5.add(r10)     // Catch: java.lang.Throwable -> L4e
            int r10 = r13.materialType     // Catch: java.lang.Throwable -> L4e
            if (r10 != r11) goto L49
            int r8 = r8 + 1
            goto L21
        L49:
            if (r10 != r12) goto L21
            int r9 = r9 + 1
            goto L21
        L4e:
            r0 = move-exception
            goto L148
        L51:
            android.content.SharedPreferences r2 = r1.Fo     // Catch: java.lang.Throwable -> L4e
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch: java.lang.Throwable -> L4e
            java.util.Iterator r3 = r5.iterator()     // Catch: java.lang.Throwable -> L4e
        L5b:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> L4e
            if (r5 == 0) goto L7c
            java.lang.Object r5 = r3.next()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L4e
            java.util.List<java.lang.String> r6 = r1.Fn     // Catch: java.lang.Throwable -> L4e
            r6.remove(r5)     // Catch: java.lang.Throwable -> L4e
            java.util.HashMap<java.lang.String, com.kwad.components.ad.splashscreen.SplashPreloadManager$PreLoadItem> r6 = r1.Fm     // Catch: java.lang.Throwable -> L4e
            r6.remove(r5)     // Catch: java.lang.Throwable -> L4e
            r2.remove(r5)     // Catch: java.lang.Throwable -> L4e
            com.kwad.sdk.core.diskcache.b.a r6 = com.kwad.sdk.core.diskcache.b.a.GP()     // Catch: java.lang.Throwable -> L4e
            r6.remove(r5)     // Catch: java.lang.Throwable -> L4e
            goto L5b
        L7c:
            r2.apply()     // Catch: java.lang.Throwable -> L4e
            java.util.List<java.lang.String> r2 = r1.Fn     // Catch: java.lang.Throwable -> L4e
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L4e
            r3 = 30
            if (r2 <= r3) goto L12d
            java.lang.String r3 = "PreloadManager"
            java.lang.String r4 = "大于 30 按失效日期远近顺序移除"
            com.kwad.sdk.core.d.c.d(r3, r4)
            int r2 = r2 + (-15)
        L93:
            if (r7 >= r2) goto L12d
            java.lang.String r3 = ""
            java.lang.Object r4 = r1.mLock
            monitor-enter(r4)
            java.util.HashMap<java.lang.String, com.kwad.components.ad.splashscreen.SplashPreloadManager$PreLoadItem> r5 = r1.Fm     // Catch: java.lang.Throwable -> Lc0
            java.util.Collection r5 = r5.values()     // Catch: java.lang.Throwable -> Lc0
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> Lc0
            r13 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        La9:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> Lc0
            if (r6 == 0) goto Lc5
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> Lc0
            com.kwad.components.ad.splashscreen.SplashPreloadManager$PreLoadItem r6 = (com.kwad.components.ad.splashscreen.SplashPreloadManager.PreLoadItem) r6     // Catch: java.lang.Throwable -> Lc0
            r15 = r13
            long r12 = r6.expiredTime     // Catch: java.lang.Throwable -> Lc0
            int r14 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r14 >= 0) goto Lc2
            java.lang.String r3 = r6.preloadId     // Catch: java.lang.Throwable -> Lc0
            r13 = r12
            goto Lc3
        Lc0:
            r0 = move-exception
            goto L12b
        Lc2:
            r13 = r15
        Lc3:
            r12 = 1
            goto La9
        Lc5:
            r15 = r13
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> Lc0
            if (r5 != 0) goto L117
            java.util.HashMap<java.lang.String, com.kwad.components.ad.splashscreen.SplashPreloadManager$PreLoadItem> r5 = r1.Fm     // Catch: java.lang.Throwable -> Lc0
            java.lang.Object r5 = r5.get(r3)     // Catch: java.lang.Throwable -> Lc0
            com.kwad.components.ad.splashscreen.SplashPreloadManager$PreLoadItem r5 = (com.kwad.components.ad.splashscreen.SplashPreloadManager.PreLoadItem) r5     // Catch: java.lang.Throwable -> Lc0
            if (r5 == 0) goto Ldc
            int r5 = r5.materialType     // Catch: java.lang.Throwable -> Lc0
            if (r5 != r11) goto Lde
            int r8 = r8 + 1
        Ldc:
            r10 = 1
            goto Le3
        Lde:
            r10 = 1
            if (r5 != r10) goto Le3
            int r9 = r9 + 1
        Le3:
            java.util.List<java.lang.String> r5 = r1.Fn     // Catch: java.lang.Throwable -> Lc0
            r5.remove(r3)     // Catch: java.lang.Throwable -> Lc0
            java.util.HashMap<java.lang.String, com.kwad.components.ad.splashscreen.SplashPreloadManager$PreLoadItem> r5 = r1.Fm     // Catch: java.lang.Throwable -> Lc0
            r5.remove(r3)     // Catch: java.lang.Throwable -> Lc0
            android.content.SharedPreferences r5 = r1.Fo     // Catch: java.lang.Throwable -> Lc0
            android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch: java.lang.Throwable -> Lc0
            android.content.SharedPreferences$Editor r5 = r5.remove(r3)     // Catch: java.lang.Throwable -> Lc0
            r5.apply()     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r5 = "PreloadManager"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r12 = "移除 preloadId = "
            r6.<init>(r12)     // Catch: java.lang.Throwable -> Lc0
            r6.append(r3)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r12 = " expiredTime =  "
            r6.append(r12)     // Catch: java.lang.Throwable -> Lc0
            r13 = r15
            r6.append(r13)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Lc0
            com.kwad.sdk.core.d.c.d(r5, r6)     // Catch: java.lang.Throwable -> Lc0
            goto L118
        L117:
            r10 = 1
        L118:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lc0
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L126
            com.kwad.sdk.core.diskcache.b.a r4 = com.kwad.sdk.core.diskcache.b.a.GP()
            r4.remove(r3)
        L126:
            int r7 = r7 + 1
            r12 = 1
            goto L93
        L12b:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lc0
            throw r0
        L12d:
            r12 = r8
            r11 = r9
            java.util.List r7 = r1.lE()
            int r2 = r7.size()
            int r10 = r0 - r2
            java.util.List r8 = r1.i(r7)
            com.kwad.components.ad.splashscreen.monitor.b.lZ()
            r5 = r18
            r9 = r20
            com.kwad.components.ad.splashscreen.monitor.b.a(r5, r7, r8, r9, r10, r11, r12)
            return
        L148:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L4e
            throw r0
    }

    @androidx.annotation.AnyThread
    public final boolean h(com.kwad.sdk.core.response.model.AdResultData r3) {
            r2 = this;
            java.util.List r0 = r3.getAdTemplateList()
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 != 0) goto L3f
            java.util.List r3 = r3.getAdTemplateList()
            java.lang.Object r3 = r3.get(r1)
            com.kwad.sdk.core.response.model.AdTemplate r3 = (com.kwad.sdk.core.response.model.AdTemplate) r3
            java.util.List<com.kwad.sdk.core.response.model.AdInfo> r0 = r3.adInfoList
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L3f
            java.util.List<com.kwad.sdk.core.response.model.AdInfo> r3 = r3.adInfoList
            java.lang.Object r3 = r3.get(r1)
            com.kwad.sdk.core.response.model.AdInfo r3 = (com.kwad.sdk.core.response.model.AdInfo) r3
            com.kwad.sdk.core.response.model.AdInfo$AdPreloadInfo r0 = r3.adPreloadInfo
            if (r0 == 0) goto L3f
            boolean r0 = p(r3)
            if (r0 == 0) goto L3a
            com.kwad.sdk.core.response.model.AdInfo$AdMaterialInfo$MaterialFeature r3 = com.kwad.sdk.core.response.b.a.aU(r3)
            java.lang.String r3 = r3.materialUrl
            boolean r3 = com.kwad.sdk.core.imageloader.KSImageLoader.isImageExist(r3)
            return r3
        L3a:
            boolean r3 = r2.q(r3)
            return r3
        L3f:
            return r1
    }

    public final java.util.List<java.lang.Integer> i(java.util.List<java.lang.String> r6) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r6 == 0) goto L68
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto Le
            goto L68
        Le:
            java.lang.Object r1 = r5.mLock
            monitor-enter(r1)
            java.lang.String r2 = "PreloadManager"
            java.lang.String r3 = "getMaterialTypeList start "
            com.kwad.sdk.core.d.c.d(r2, r3)     // Catch: java.lang.Throwable -> L41
            r2 = 0
        L19:
            int r3 = r6.size()     // Catch: java.lang.Throwable -> L41
            if (r2 >= r3) goto L46
            java.lang.Object r3 = r6.get(r2)     // Catch: java.lang.Throwable -> L41
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L41
            java.util.HashMap<java.lang.String, com.kwad.components.ad.splashscreen.SplashPreloadManager$PreLoadItem> r4 = r5.Fm     // Catch: java.lang.Throwable -> L41
            boolean r4 = r4.containsKey(r3)     // Catch: java.lang.Throwable -> L41
            if (r4 == 0) goto L43
            java.util.HashMap<java.lang.String, com.kwad.components.ad.splashscreen.SplashPreloadManager$PreLoadItem> r4 = r5.Fm     // Catch: java.lang.Throwable -> L41
            java.lang.Object r3 = r4.get(r3)     // Catch: java.lang.Throwable -> L41
            com.kwad.components.ad.splashscreen.SplashPreloadManager$PreLoadItem r3 = (com.kwad.components.ad.splashscreen.SplashPreloadManager.PreLoadItem) r3     // Catch: java.lang.Throwable -> L41
            if (r3 == 0) goto L43
            int r3 = r3.materialType     // Catch: java.lang.Throwable -> L41
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L41
            r0.add(r3)     // Catch: java.lang.Throwable -> L41
            goto L43
        L41:
            r6 = move-exception
            goto L66
        L43:
            int r2 = r2 + 1
            goto L19
        L46:
            java.lang.String r6 = "PreloadManager"
            java.lang.String r2 = "getMaterialTypeList end "
            com.kwad.sdk.core.d.c.d(r6, r2)     // Catch: java.lang.Throwable -> L41
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L41
            java.lang.String r6 = "PreloadManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "getMaterialTypeList "
            r1.<init>(r2)
            int r2 = r0.size()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.kwad.sdk.core.d.c.d(r6, r1)
            return r0
        L66:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L41
            throw r6
        L68:
            return r0
    }

    public final java.util.List<java.lang.String> lE() {
            r4 = this;
            java.lang.Object r0 = r4.mLock
            monitor-enter(r0)
            java.lang.String r1 = "PreloadManager"
            java.lang.String r2 = "getPreloadIdListWithoutClean start "
            com.kwad.sdk.core.d.c.d(r1, r2)     // Catch: java.lang.Throwable -> L33
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L33
            java.util.List<java.lang.String> r2 = r4.Fn     // Catch: java.lang.Throwable -> L33
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L33
            java.lang.String r2 = "PreloadManager"
            java.lang.String r3 = "getPreloadIdListWithoutClean end "
            com.kwad.sdk.core.d.c.d(r2, r3)     // Catch: java.lang.Throwable -> L33
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            java.lang.String r0 = "PreloadManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "getPreloadIdListWithoutClean "
            r2.<init>(r3)
            java.util.List<java.lang.String> r3 = r4.Fn
            int r3 = r3.size()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.kwad.sdk.core.d.c.d(r0, r2)
            return r1
        L33:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            throw r1
    }
}
