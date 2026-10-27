package com.kwai.adclient.kscommerciallogger.snapshot;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public enum SegmentManager extends java.lang.Enum<com.kwai.adclient.kscommerciallogger.snapshot.SegmentManager> {
    private static final /* synthetic */ com.kwai.adclient.kscommerciallogger.snapshot.SegmentManager[] $VALUES = null;
    public static final com.kwai.adclient.kscommerciallogger.snapshot.SegmentManager Instance = null;
    private static final int expiredThresholds = 900000;
    private boolean hasInit;
    private boolean isDebug;
    private long lastAutoClearTime;
    private android.util.LruCache<java.lang.String, java.util.Set<com.kwai.adclient.kscommerciallogger.snapshot.c>> mSnapshots;



    static {
            com.kwai.adclient.kscommerciallogger.snapshot.SegmentManager r0 = new com.kwai.adclient.kscommerciallogger.snapshot.SegmentManager
            java.lang.String r1 = "Instance"
            r2 = 0
            r0.<init>(r1, r2)
            com.kwai.adclient.kscommerciallogger.snapshot.SegmentManager.Instance = r0
            r1 = 1
            com.kwai.adclient.kscommerciallogger.snapshot.SegmentManager[] r1 = new com.kwai.adclient.kscommerciallogger.snapshot.SegmentManager[r1]
            r1[r2] = r0
            com.kwai.adclient.kscommerciallogger.snapshot.SegmentManager.$VALUES = r1
            return
    }

    SegmentManager(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.isDebug = r1
            r0.hasInit = r1
            return
    }

    private void autoClear() {
            r11 = this;
            android.util.LruCache<java.lang.String, java.util.Set<com.kwai.adclient.kscommerciallogger.snapshot.c>> r0 = r11.mSnapshots
            if (r0 == 0) goto L77
            int r0 = r0.size()
            if (r0 == 0) goto L77
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r11.lastAutoClearTime
            long r0 = r0 - r2
            r2 = 900000(0xdbba0, double:4.44659E-318)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L19
            goto L77
        L19:
            long r0 = java.lang.System.currentTimeMillis()
            r11.lastAutoClearTime = r0
            android.util.LruCache<java.lang.String, java.util.Set<com.kwai.adclient.kscommerciallogger.snapshot.c>> r0 = r11.mSnapshots
            java.util.Map r0 = r0.snapshot()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L2d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L77
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r4 = r1.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r1 = r1.getValue()
            java.util.Set r1 = (java.util.Set) r1
            if (r1 == 0) goto L2d
            java.util.Iterator r5 = r1.iterator()
            android.util.LruCache<java.lang.String, java.util.Set<com.kwai.adclient.kscommerciallogger.snapshot.c>> r6 = r11.mSnapshots
            r6.remove(r4)
        L50:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L6b
            java.lang.Object r6 = r5.next()
            com.kwai.adclient.kscommerciallogger.snapshot.c r6 = (com.kwai.adclient.kscommerciallogger.snapshot.c) r6
            long r7 = r11.lastAutoClearTime
            long r9 = r6.Tr()
            long r7 = r7 - r9
            int r6 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r6 < 0) goto L50
            r5.remove()
            goto L50
        L6b:
            int r5 = r1.size()
            if (r5 <= 0) goto L2d
            android.util.LruCache<java.lang.String, java.util.Set<com.kwai.adclient.kscommerciallogger.snapshot.c>> r5 = r11.mSnapshots
            r5.put(r4, r1)
            goto L2d
        L77:
            return
    }

    public static com.kwai.adclient.kscommerciallogger.snapshot.SegmentManager valueOf(java.lang.String r1) {
            java.lang.Class<com.kwai.adclient.kscommerciallogger.snapshot.SegmentManager> r0 = com.kwai.adclient.kscommerciallogger.snapshot.SegmentManager.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.kwai.adclient.kscommerciallogger.snapshot.SegmentManager r1 = (com.kwai.adclient.kscommerciallogger.snapshot.SegmentManager) r1
            return r1
    }

    public static com.kwai.adclient.kscommerciallogger.snapshot.SegmentManager[] values() {
            com.kwai.adclient.kscommerciallogger.snapshot.SegmentManager[] r0 = com.kwai.adclient.kscommerciallogger.snapshot.SegmentManager.$VALUES
            java.lang.Object r0 = r0.clone()
            com.kwai.adclient.kscommerciallogger.snapshot.SegmentManager[] r0 = (com.kwai.adclient.kscommerciallogger.snapshot.SegmentManager[]) r0
            return r0
    }

    public final int cacheLimit() {
            r1 = this;
            android.util.LruCache<java.lang.String, java.util.Set<com.kwai.adclient.kscommerciallogger.snapshot.c>> r0 = r1.mSnapshots
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.maxSize()
            return r0
    }

    @java.lang.Deprecated
    public final void clearBySegment(java.lang.String r3) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L36
            android.util.LruCache<java.lang.String, java.util.Set<com.kwai.adclient.kscommerciallogger.snapshot.c>> r0 = r2.mSnapshots
            if (r0 != 0) goto Lb
            goto L36
        Lb:
            monitor-enter(r2)
            android.util.LruCache<java.lang.String, java.util.Set<com.kwai.adclient.kscommerciallogger.snapshot.c>> r0 = r2.mSnapshots     // Catch: java.lang.Throwable -> L30
            java.util.Map r0 = r0.snapshot()     // Catch: java.lang.Throwable -> L30
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L30
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L30
        L1a:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L32
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L30
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L30
            java.lang.Object r1 = r1.getKey()     // Catch: java.lang.Throwable -> L30
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L30
            r2.clearBySegment(r1, r3)     // Catch: java.lang.Throwable -> L30
            goto L1a
        L30:
            r3 = move-exception
            goto L34
        L32:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L30
            return
        L34:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L30
            throw r3
        L36:
            return
    }

    public final void clearBySegment(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L44
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L44
            android.util.LruCache<java.lang.String, java.util.Set<com.kwai.adclient.kscommerciallogger.snapshot.c>> r0 = r2.mSnapshots
            if (r0 != 0) goto L11
            goto L44
        L11:
            monitor-enter(r2)
            android.util.LruCache<java.lang.String, java.util.Set<com.kwai.adclient.kscommerciallogger.snapshot.c>> r0 = r2.mSnapshots     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L3b
            java.util.Set r0 = (java.util.Set) r0     // Catch: java.lang.Throwable -> L3b
            com.kwai.adclient.kscommerciallogger.snapshot.c r1 = new com.kwai.adclient.kscommerciallogger.snapshot.c     // Catch: java.lang.Throwable -> L3b
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L3b
            if (r0 == 0) goto L3d
            boolean r4 = r0.contains(r1)     // Catch: java.lang.Throwable -> L3b
            if (r4 == 0) goto L3d
            android.util.LruCache<java.lang.String, java.util.Set<com.kwai.adclient.kscommerciallogger.snapshot.c>> r4 = r2.mSnapshots     // Catch: java.lang.Throwable -> L3b
            r4.remove(r3)     // Catch: java.lang.Throwable -> L3b
            r0.remove(r1)     // Catch: java.lang.Throwable -> L3b
            int r4 = r0.size()     // Catch: java.lang.Throwable -> L3b
            if (r4 <= 0) goto L3d
            android.util.LruCache<java.lang.String, java.util.Set<com.kwai.adclient.kscommerciallogger.snapshot.c>> r4 = r2.mSnapshots     // Catch: java.lang.Throwable -> L3b
            r4.put(r3, r0)     // Catch: java.lang.Throwable -> L3b
            goto L3d
        L3b:
            r3 = move-exception
            goto L42
        L3d:
            r2.autoClear()     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3b
            return
        L42:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3b
            throw r3
        L44:
            return
    }

    public final void clearBySessionId(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L19
            android.util.LruCache<java.lang.String, java.util.Set<com.kwai.adclient.kscommerciallogger.snapshot.c>> r0 = r1.mSnapshots
            if (r0 != 0) goto Lb
            goto L19
        Lb:
            monitor-enter(r1)
            android.util.LruCache<java.lang.String, java.util.Set<com.kwai.adclient.kscommerciallogger.snapshot.c>> r0 = r1.mSnapshots     // Catch: java.lang.Throwable -> L16
            r0.remove(r2)     // Catch: java.lang.Throwable -> L16
            r1.autoClear()     // Catch: java.lang.Throwable -> L16
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            return
        L16:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            throw r2
        L19:
            return
    }

    public final synchronized void init(int r2, boolean r3) {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.hasInit     // Catch: java.lang.Throwable -> L11
            if (r0 != 0) goto L16
            r1.isDebug = r3     // Catch: java.lang.Throwable -> L11
            if (r2 <= 0) goto L13
            com.kwai.adclient.kscommerciallogger.snapshot.SegmentManager$1 r3 = new com.kwai.adclient.kscommerciallogger.snapshot.SegmentManager$1     // Catch: java.lang.Throwable -> L11
            r3.<init>(r1, r2)     // Catch: java.lang.Throwable -> L11
            r1.mSnapshots = r3     // Catch: java.lang.Throwable -> L11
            goto L13
        L11:
            r2 = move-exception
            goto L18
        L13:
            r2 = 1
            r1.hasInit = r2     // Catch: java.lang.Throwable -> L11
        L16:
            monitor-exit(r1)
            return
        L18:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11
            throw r2
    }

    public final synchronized boolean isOverThreshold() {
            r6 = this;
            monitor-enter(r6)
            int r0 = r6.cacheLimit()     // Catch: java.lang.Throwable -> L37
            r1 = 0
            if (r0 <= 0) goto L39
            int r0 = r6.segmentSize()     // Catch: java.lang.Throwable -> L37
            if (r0 != 0) goto Lf
            goto L39
        Lf:
            int r0 = r6.segmentSize()     // Catch: java.lang.Throwable -> L37
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L37
            int r2 = r6.cacheLimit()     // Catch: java.lang.Throwable -> L37
            float r2 = (float) r2     // Catch: java.lang.Throwable -> L37
            float r0 = r0 / r2
            double r2 = (double) r0     // Catch: java.lang.Throwable -> L37
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r2)     // Catch: java.lang.Throwable -> L37
            java.math.RoundingMode r2 = java.math.RoundingMode.HALF_UP     // Catch: java.lang.Throwable -> L37
            r3 = 2
            java.math.BigDecimal r0 = r0.setScale(r3, r2)     // Catch: java.lang.Throwable -> L37
            double r2 = r0.doubleValue()     // Catch: java.lang.Throwable -> L37
            r4 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            monitor-exit(r6)
            if (r0 < 0) goto L36
            r0 = 1
            return r0
        L36:
            return r1
        L37:
            r0 = move-exception
            goto L3b
        L39:
            monitor-exit(r6)
            return r1
        L3b:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L37
            throw r0
    }

    public final org.json.JSONArray justLoadInfoBySessionId(java.lang.String r4) {
            r3 = this;
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            android.util.LruCache<java.lang.String, java.util.Set<com.kwai.adclient.kscommerciallogger.snapshot.c>> r1 = r3.mSnapshots
            if (r1 == 0) goto L39
            int r1 = r1.size()
            if (r1 != 0) goto L10
            goto L39
        L10:
            monitor-enter(r3)
            android.util.LruCache<java.lang.String, java.util.Set<com.kwai.adclient.kscommerciallogger.snapshot.c>> r1 = r3.mSnapshots     // Catch: java.lang.Throwable -> L33
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L33
            java.util.Set r1 = (java.util.Set) r1     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L35
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L33
        L1f:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L35
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L33
            com.kwai.adclient.kscommerciallogger.snapshot.c r2 = (com.kwai.adclient.kscommerciallogger.snapshot.c) r2     // Catch: java.lang.Throwable -> L33
            org.json.JSONObject r2 = r2.hQ(r4)     // Catch: java.lang.Throwable -> L33
            r0.put(r2)     // Catch: java.lang.Throwable -> L33
            goto L1f
        L33:
            r4 = move-exception
            goto L37
        L35:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L33
            return r0
        L37:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L33
            throw r4
        L39:
            return r0
    }

    public final org.json.JSONArray loadInfoBySessionId(java.lang.String r4) {
            r3 = this;
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            android.util.LruCache<java.lang.String, java.util.Set<com.kwai.adclient.kscommerciallogger.snapshot.c>> r1 = r3.mSnapshots
            if (r1 == 0) goto L3e
            int r1 = r1.size()
            if (r1 != 0) goto L10
            goto L3e
        L10:
            monitor-enter(r3)
            android.util.LruCache<java.lang.String, java.util.Set<com.kwai.adclient.kscommerciallogger.snapshot.c>> r1 = r3.mSnapshots     // Catch: java.lang.Throwable -> L33
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L33
            java.util.Set r1 = (java.util.Set) r1     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L3a
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L33
        L1f:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L35
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L33
            com.kwai.adclient.kscommerciallogger.snapshot.c r2 = (com.kwai.adclient.kscommerciallogger.snapshot.c) r2     // Catch: java.lang.Throwable -> L33
            org.json.JSONObject r2 = r2.hQ(r4)     // Catch: java.lang.Throwable -> L33
            r0.put(r2)     // Catch: java.lang.Throwable -> L33
            goto L1f
        L33:
            r4 = move-exception
            goto L3c
        L35:
            android.util.LruCache<java.lang.String, java.util.Set<com.kwai.adclient.kscommerciallogger.snapshot.c>> r1 = r3.mSnapshots     // Catch: java.lang.Throwable -> L33
            r1.remove(r4)     // Catch: java.lang.Throwable -> L33
        L3a:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L33
            return r0
        L3c:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L33
            throw r4
        L3e:
            return r0
    }

    public final com.kwai.adclient.kscommerciallogger.snapshot.c loadSegment(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.String r3) {
            r1 = this;
            r0 = 10
            com.kwai.adclient.kscommerciallogger.snapshot.c r2 = r1.loadSegment(r2, r3, r0)
            return r2
    }

    public final com.kwai.adclient.kscommerciallogger.snapshot.c loadSegment(@androidx.annotation.NonNull java.lang.String r5, @androidx.annotation.NonNull java.lang.String r6, int r7) {
            r4 = this;
            android.util.LruCache<java.lang.String, java.util.Set<com.kwai.adclient.kscommerciallogger.snapshot.c>> r0 = r4.mSnapshots
            if (r0 != 0) goto L1d
            boolean r5 = r4.hasInit
            if (r5 != 0) goto L15
            boolean r5 = r4.isDebug
            if (r5 != 0) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "you need init first"
            r5.<init>(r6)
            throw r5
        L15:
            com.kwai.adclient.kscommerciallogger.snapshot.a r5 = new com.kwai.adclient.kscommerciallogger.snapshot.a
            java.lang.String r6 = "empty"
            r5.<init>(r6)
            return r5
        L1d:
            monitor-enter(r4)
            android.util.LruCache<java.lang.String, java.util.Set<com.kwai.adclient.kscommerciallogger.snapshot.c>> r0 = r4.mSnapshots     // Catch: java.lang.Throwable -> L44
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Throwable -> L44
            java.util.Set r0 = (java.util.Set) r0     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L46
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L44
        L2c:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L44
            if (r2 == 0) goto L46
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L44
            com.kwai.adclient.kscommerciallogger.snapshot.c r2 = (com.kwai.adclient.kscommerciallogger.snapshot.c) r2     // Catch: java.lang.Throwable -> L44
            java.lang.String r3 = r2.getName()     // Catch: java.lang.Throwable -> L44
            boolean r3 = r3.equals(r6)     // Catch: java.lang.Throwable -> L44
            if (r3 == 0) goto L2c
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L44
            return r2
        L44:
            r5 = move-exception
            goto L6d
        L46:
            com.kwai.adclient.kscommerciallogger.snapshot.c r1 = new com.kwai.adclient.kscommerciallogger.snapshot.c     // Catch: java.lang.Throwable -> L44
            r1.<init>(r6, r7)     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L5b
            android.util.LruCache<java.lang.String, java.util.Set<com.kwai.adclient.kscommerciallogger.snapshot.c>> r6 = r4.mSnapshots     // Catch: java.lang.Throwable -> L44
            r6.remove(r5)     // Catch: java.lang.Throwable -> L44
            r0.add(r1)     // Catch: java.lang.Throwable -> L44
            android.util.LruCache<java.lang.String, java.util.Set<com.kwai.adclient.kscommerciallogger.snapshot.c>> r6 = r4.mSnapshots     // Catch: java.lang.Throwable -> L44
            r6.put(r5, r0)     // Catch: java.lang.Throwable -> L44
            goto L68
        L5b:
            java.util.LinkedHashSet r6 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L44
            r6.<init>()     // Catch: java.lang.Throwable -> L44
            r6.add(r1)     // Catch: java.lang.Throwable -> L44
            android.util.LruCache<java.lang.String, java.util.Set<com.kwai.adclient.kscommerciallogger.snapshot.c>> r7 = r4.mSnapshots     // Catch: java.lang.Throwable -> L44
            r7.put(r5, r6)     // Catch: java.lang.Throwable -> L44
        L68:
            r4.autoClear()     // Catch: java.lang.Throwable -> L44
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L44
            return r1
        L6d:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L44
            throw r5
    }

    public final java.lang.String loadSessionId() {
            r1 = this;
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final com.kwai.adclient.kscommerciallogger.snapshot.d loadSpan(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "span"
            com.kwai.adclient.kscommerciallogger.snapshot.d r2 = r1.loadSpan(r2, r3, r0)
            return r2
    }

    public final com.kwai.adclient.kscommerciallogger.snapshot.d loadSpan(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.String r3) {
            r0 = this;
            com.kwai.adclient.kscommerciallogger.snapshot.c r1 = r0.loadSegment(r1, r2)
            com.kwai.adclient.kscommerciallogger.snapshot.d r1 = r1.hP(r3)
            return r1
    }

    public final synchronized java.util.Map.Entry<java.lang.String, java.lang.Integer> mostUsedSegmentInfo() {
            r6 = this;
            monitor-enter(r6)
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L4f
            r0.<init>()     // Catch: java.lang.Throwable -> L4f
            android.util.LruCache<java.lang.String, java.util.Set<com.kwai.adclient.kscommerciallogger.snapshot.c>> r1 = r6.mSnapshots     // Catch: java.lang.Throwable -> L4f
            java.util.Map r1 = r1.snapshot()     // Catch: java.lang.Throwable -> L4f
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L4f
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L4f
        L14:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L4f
            if (r2 == 0) goto L62
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L4f
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L4f
            java.util.Set r2 = (java.util.Set) r2     // Catch: java.lang.Throwable -> L4f
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L4f
        L2a:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L4f
            if (r3 == 0) goto L14
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L4f
            com.kwai.adclient.kscommerciallogger.snapshot.c r3 = (com.kwai.adclient.kscommerciallogger.snapshot.c) r3     // Catch: java.lang.Throwable -> L4f
            java.lang.String r4 = r3.getName()     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r4 = r0.get(r4)     // Catch: java.lang.Throwable -> L4f
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L4f
            r5 = 1
            if (r4 != 0) goto L51
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L4f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L4f
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> L4f
            goto L2a
        L4f:
            r0 = move-exception
            goto L78
        L51:
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L4f
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L4f
            int r4 = r4 + r5
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L4f
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> L4f
            goto L2a
        L62:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4f
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L4f
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L4f
            com.kwai.adclient.kscommerciallogger.snapshot.SegmentManager$2 r0 = new com.kwai.adclient.kscommerciallogger.snapshot.SegmentManager$2     // Catch: java.lang.Throwable -> L4f
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r0 = java.util.Collections.max(r1, r0)     // Catch: java.lang.Throwable -> L4f
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r6)
            return r0
        L78:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L4f
            throw r0
    }

    public final synchronized int segmentSize() {
            r1 = this;
            monitor-enter(r1)
            android.util.LruCache<java.lang.String, java.util.Set<com.kwai.adclient.kscommerciallogger.snapshot.c>> r0 = r1.mSnapshots     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L8
            monitor-exit(r1)
            r0 = 0
            return r0
        L8:
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Le
            monitor-exit(r1)
            return r0
        Le:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            throw r0
    }

    public final synchronized int size() {
            r1 = this;
            monitor-enter(r1)
            android.util.LruCache<java.lang.String, java.util.Set<com.kwai.adclient.kscommerciallogger.snapshot.c>> r0 = r1.mSnapshots     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L8
            monitor-exit(r1)
            r0 = 0
            return r0
        L8:
            java.util.Map r0 = r0.snapshot()     // Catch: java.lang.Throwable -> L12
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L12
            monitor-exit(r1)
            return r0
        L12:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            throw r0
    }
}
