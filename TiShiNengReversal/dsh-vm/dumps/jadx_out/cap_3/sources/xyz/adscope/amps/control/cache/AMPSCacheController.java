package xyz.adscope.amps.control.cache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSCacheController {
    private static xyz.adscope.amps.control.cache.AMPSCacheController instance;
    private static java.util.Map<java.lang.String, java.util.List<xyz.adscope.amps.model.cache.AMPSAdSourceCacheInfo>> mAdSourceCacheData;
    private final java.lang.String TAG;


    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            xyz.adscope.amps.control.cache.AMPSCacheController.mAdSourceCacheData = r0
            return
    }

    public AMPSCacheController() {
            r1 = this;
            r1.<init>()
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.TAG = r0
            return
    }

    private void addCacheInfo(java.lang.String r2, java.lang.String r3, java.lang.String r4, int r5, xyz.adscope.amps.base.AMPSBaseAdapter r6, long r7, java.util.List<xyz.adscope.amps.model.cache.AMPSAdSourceCacheInfo> r9) {
            r1 = this;
            xyz.adscope.amps.model.cache.AMPSAdSourceCacheInfo r0 = new xyz.adscope.amps.model.cache.AMPSAdSourceCacheInfo
            r0.<init>()
            r0.setAppId(r3)
            r0.setSpaceId(r4)
            r0.setEcpm(r5)
            r0.setBaseAdapter(r6)
            long r3 = java.lang.System.currentTimeMillis()
            r0.setCachedTime(r3)
            r0.setCachedOffersTimeout(r7)
            r9.add(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r1.TAG
            r3.append(r4)
            java.lang.String r4 = " addCacheInfo cacheInfo:"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "amps_log_tag"
            xyz.adscope.amps.tool.AMPSLogUtil.d(r4, r3)
            xyz.adscope.amps.control.cache.AMPSCacheController$1 r3 = new xyz.adscope.amps.control.cache.AMPSCacheController$1
            r3.<init>(r1)
            java.util.Collections.sort(r9, r3)
            java.util.Map<java.lang.String, java.util.List<xyz.adscope.amps.model.cache.AMPSAdSourceCacheInfo>> r3 = xyz.adscope.amps.control.cache.AMPSCacheController.mAdSourceCacheData
            r3.put(r2, r9)
            java.util.Iterator r2 = r9.iterator()
        L4a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L70
            java.lang.Object r3 = r2.next()
            xyz.adscope.amps.model.cache.AMPSAdSourceCacheInfo r3 = (xyz.adscope.amps.model.cache.AMPSAdSourceCacheInfo) r3
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r1.TAG
            r5.append(r6)
            java.lang.String r6 = " addCacheInfo after cacheInfo:"
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            xyz.adscope.amps.tool.AMPSLogUtil.d(r4, r3)
            goto L4a
        L70:
            return
    }

    public static synchronized xyz.adscope.amps.control.cache.AMPSCacheController getInstance() {
            java.lang.Class<xyz.adscope.amps.control.cache.AMPSCacheController> r0 = xyz.adscope.amps.control.cache.AMPSCacheController.class
            monitor-enter(r0)
            xyz.adscope.amps.control.cache.AMPSCacheController r1 = xyz.adscope.amps.control.cache.AMPSCacheController.instance     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L18
            java.lang.Class<xyz.adscope.amps.control.cache.AMPSCacheController> r1 = xyz.adscope.amps.control.cache.AMPSCacheController.class
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L16
            xyz.adscope.amps.control.cache.AMPSCacheController r2 = new xyz.adscope.amps.control.cache.AMPSCacheController     // Catch: java.lang.Throwable -> L13
            r2.<init>()     // Catch: java.lang.Throwable -> L13
            xyz.adscope.amps.control.cache.AMPSCacheController.instance = r2     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            goto L18
        L13:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            throw r2     // Catch: java.lang.Throwable -> L16
        L16:
            r1 = move-exception
            goto L1c
        L18:
            xyz.adscope.amps.control.cache.AMPSCacheController r1 = xyz.adscope.amps.control.cache.AMPSCacheController.instance     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)
            return r1
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r1
    }

    public void addAdSourceCacheInfo(xyz.adscope.amps.model.config.response.SpaceModel r16, xyz.adscope.amps.model.config.response.AdSourceModel r17, xyz.adscope.amps.base.AMPSBaseAdapter r18) {
            r15 = this;
            if (r16 == 0) goto La8
            if (r17 == 0) goto La8
            if (r18 != 0) goto L8
            goto La8
        L8:
            java.lang.String r1 = r16.getSpaceId()
            int r0 = r16.getCachedOffersNum()
            int r2 = r16.getCachedOffersTimeout()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto La8
            if (r0 != 0) goto L1e
            goto La8
        L1e:
            r3 = r2
            java.lang.String r2 = r17.getAppId()
            r4 = r3
            java.lang.String r3 = r17.getSpaceId()
            int r5 = r17.getCachedOffersTimeout()
            int r6 = r17.getEcpm()
            boolean r7 = android.text.TextUtils.isEmpty(r2)
            if (r7 != 0) goto La8
            boolean r7 = android.text.TextUtils.isEmpty(r3)
            if (r7 == 0) goto L3e
            goto La8
        L3e:
            if (r5 != 0) goto L41
            goto L42
        L41:
            r4 = r5
        L42:
            if (r4 != 0) goto L45
            goto La8
        L45:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Map<java.lang.String, java.util.List<xyz.adscope.amps.model.cache.AMPSAdSourceCacheInfo>> r5 = xyz.adscope.amps.control.cache.AMPSCacheController.mAdSourceCacheData
            boolean r5 = r5.containsKey(r1)
            if (r5 == 0) goto L65
            java.util.Map<java.lang.String, java.util.List<xyz.adscope.amps.model.cache.AMPSAdSourceCacheInfo>> r5 = xyz.adscope.amps.control.cache.AMPSCacheController.mAdSourceCacheData
            java.lang.Object r5 = r5.get(r1)
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L65
            int r7 = r5.size()
            if (r7 <= 0) goto L65
            r8.addAll(r5)
        L65:
            int r5 = r8.size()
            if (r5 >= r0) goto L75
            r0 = r6
            long r6 = (long) r4
            r5 = r18
            r4 = r0
            r0 = r15
            r0.addCacheInfo(r1, r2, r3, r4, r5, r6, r8)
            return
        L75:
            r0 = r6
            java.util.Iterator r5 = r8.iterator()
        L7a:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto La8
            java.lang.Object r6 = r5.next()
            xyz.adscope.amps.model.cache.AMPSAdSourceCacheInfo r6 = (xyz.adscope.amps.model.cache.AMPSAdSourceCacheInfo) r6
            int r7 = r6.getEcpm()
            long r9 = r6.getCachedTime()
            long r11 = r6.getCachedOffersTimeout()
            long r13 = java.lang.System.currentTimeMillis()
            long r13 = r13 - r9
            int r6 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r6 > 0) goto L9d
            if (r7 >= r0) goto L7a
        L9d:
            r5.remove()
            long r6 = (long) r4
            r5 = r18
            r4 = r0
            r0 = r15
            r0.addCacheInfo(r1, r2, r3, r4, r5, r6, r8)
        La8:
            return
    }

    public xyz.adscope.amps.model.cache.AMPSAdSourceCacheInfo getAdSourceCacheInfo(java.lang.String r9, java.lang.String r10) {
            r8 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            r1 = 0
            if (r0 != 0) goto L60
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto Le
            goto L60
        Le:
            java.util.Map<java.lang.String, java.util.List<xyz.adscope.amps.model.cache.AMPSAdSourceCacheInfo>> r0 = xyz.adscope.amps.control.cache.AMPSCacheController.mAdSourceCacheData
            boolean r0 = r0.containsKey(r9)
            if (r0 != 0) goto L17
            return r1
        L17:
            java.util.Map<java.lang.String, java.util.List<xyz.adscope.amps.model.cache.AMPSAdSourceCacheInfo>> r0 = xyz.adscope.amps.control.cache.AMPSCacheController.mAdSourceCacheData
            java.lang.Object r9 = r0.get(r9)
            java.util.List r9 = (java.util.List) r9
            if (r9 == 0) goto L60
            int r0 = r9.size()
            if (r0 != 0) goto L28
            goto L60
        L28:
            java.util.Iterator r9 = r9.iterator()
        L2c:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L60
            java.lang.Object r0 = r9.next()
            xyz.adscope.amps.model.cache.AMPSAdSourceCacheInfo r0 = (xyz.adscope.amps.model.cache.AMPSAdSourceCacheInfo) r0
            java.lang.String r2 = r0.getSpaceId()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L43
            goto L2c
        L43:
            boolean r2 = r2.equalsIgnoreCase(r10)
            if (r2 != 0) goto L4a
            goto L2c
        L4a:
            long r2 = r0.getCachedTime()
            long r4 = r0.getCachedOffersTimeout()
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r2
            int r10 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r10 <= 0) goto L5f
            r9.remove()
            return r1
        L5f:
            return r0
        L60:
            return r1
    }

    public void removeAdSourceCacheInfo(java.lang.String r6, java.lang.String r7) {
            r5 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L97
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto Le
            goto L97
        Le:
            java.util.Map<java.lang.String, java.util.List<xyz.adscope.amps.model.cache.AMPSAdSourceCacheInfo>> r0 = xyz.adscope.amps.control.cache.AMPSCacheController.mAdSourceCacheData
            boolean r0 = r0.containsKey(r6)
            if (r0 != 0) goto L18
            goto L97
        L18:
            java.util.Map<java.lang.String, java.util.List<xyz.adscope.amps.model.cache.AMPSAdSourceCacheInfo>> r0 = xyz.adscope.amps.control.cache.AMPSCacheController.mAdSourceCacheData
            java.lang.Object r0 = r0.get(r6)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L97
            int r1 = r0.size()
            if (r1 != 0) goto L29
            goto L97
        L29:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r5.TAG
            r1.append(r2)
            java.lang.String r2 = " removeAdSourceCacheInfo  adSourceSpaceId:"
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "amps_log_tag"
            xyz.adscope.amps.tool.AMPSLogUtil.d(r2, r1)
            java.util.Iterator r1 = r0.iterator()
        L48:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L68
            java.lang.Object r3 = r1.next()
            xyz.adscope.amps.model.cache.AMPSAdSourceCacheInfo r3 = (xyz.adscope.amps.model.cache.AMPSAdSourceCacheInfo) r3
            java.lang.String r3 = r3.getSpaceId()
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L5f
            goto L48
        L5f:
            boolean r3 = r3.equalsIgnoreCase(r7)
            if (r3 == 0) goto L48
            r1.remove()
        L68:
            java.util.Map<java.lang.String, java.util.List<xyz.adscope.amps.model.cache.AMPSAdSourceCacheInfo>> r7 = xyz.adscope.amps.control.cache.AMPSCacheController.mAdSourceCacheData
            r7.put(r6, r0)
            java.util.Iterator r6 = r0.iterator()
        L71:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L97
            java.lang.Object r7 = r6.next()
            xyz.adscope.amps.model.cache.AMPSAdSourceCacheInfo r7 = (xyz.adscope.amps.model.cache.AMPSAdSourceCacheInfo) r7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r5.TAG
            r0.append(r1)
            java.lang.String r1 = " removeAdSourceCacheInfo after cacheInfo:"
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            xyz.adscope.amps.tool.AMPSLogUtil.d(r2, r7)
            goto L71
        L97:
            return
    }
}
