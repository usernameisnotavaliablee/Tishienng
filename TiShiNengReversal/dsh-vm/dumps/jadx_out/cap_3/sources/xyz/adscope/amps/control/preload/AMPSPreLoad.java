package xyz.adscope.amps.control.preload;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSPreLoad {
    private static xyz.adscope.amps.control.preload.AMPSPreLoad instance;
    private static java.util.Map<java.lang.String, xyz.adscope.amps.model.preload.AMPSPreloadManagerInfo> mPreloadAdData;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            xyz.adscope.amps.control.preload.AMPSPreLoad.mPreloadAdData = r0
            return
    }

    public AMPSPreLoad() {
            r0 = this;
            r0.<init>()
            return
    }

    public static synchronized xyz.adscope.amps.control.preload.AMPSPreLoad getInstance() {
            java.lang.Class<xyz.adscope.amps.control.preload.AMPSPreLoad> r0 = xyz.adscope.amps.control.preload.AMPSPreLoad.class
            monitor-enter(r0)
            xyz.adscope.amps.control.preload.AMPSPreLoad r1 = xyz.adscope.amps.control.preload.AMPSPreLoad.instance     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L18
            java.lang.Class<xyz.adscope.amps.control.preload.AMPSPreLoad> r1 = xyz.adscope.amps.control.preload.AMPSPreLoad.class
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L16
            xyz.adscope.amps.control.preload.AMPSPreLoad r2 = new xyz.adscope.amps.control.preload.AMPSPreLoad     // Catch: java.lang.Throwable -> L13
            r2.<init>()     // Catch: java.lang.Throwable -> L13
            xyz.adscope.amps.control.preload.AMPSPreLoad.instance = r2     // Catch: java.lang.Throwable -> L13
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
            xyz.adscope.amps.control.preload.AMPSPreLoad r1 = xyz.adscope.amps.control.preload.AMPSPreLoad.instance     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)
            return r1
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r1
    }

    public void addPreLoadAdInfo(java.lang.String r7, xyz.adscope.amps.manager.AMPSBaseOpenApiManager r8) {
            r6 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L4c
            if (r8 != 0) goto L9
            goto L4c
        L9:
            java.util.Map<java.lang.String, xyz.adscope.amps.model.preload.AMPSPreloadManagerInfo> r0 = xyz.adscope.amps.control.preload.AMPSPreLoad.mPreloadAdData
            boolean r0 = r0.containsKey(r7)
            if (r0 == 0) goto L16
            java.util.Map<java.lang.String, xyz.adscope.amps.model.preload.AMPSPreloadManagerInfo> r0 = xyz.adscope.amps.control.preload.AMPSPreLoad.mPreloadAdData
            r0.remove(r7)
        L16:
            xyz.adscope.amps.model.preload.AMPSPreloadManagerInfo r0 = new xyz.adscope.amps.model.preload.AMPSPreloadManagerInfo
            r0.<init>()
            r0.setSpaceId(r7)
            r0.setBaseOpenApiManager(r8)
            long r1 = java.lang.System.currentTimeMillis()
            r0.setCachedTime(r1)
            xyz.adscope.amps.model.config.response.AdSourceModel r1 = r8.getWinAdSourceModel()
            r2 = 0
            if (r1 == 0) goto L36
            int r1 = r1.getCachedOffersTimeout()
            long r4 = (long) r1
            goto L37
        L36:
            r4 = r2
        L37:
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 != 0) goto L3f
            long r4 = r8.getSpaceCachedOffersTimeout()
        L3f:
            int r8 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r8 != 0) goto L44
            goto L4c
        L44:
            r0.setCachedOffersTimeout(r4)
            java.util.Map<java.lang.String, xyz.adscope.amps.model.preload.AMPSPreloadManagerInfo> r8 = xyz.adscope.amps.control.preload.AMPSPreLoad.mPreloadAdData
            r8.put(r7, r0)
        L4c:
            return
    }

    public xyz.adscope.amps.model.preload.AMPSPreloadManagerInfo getAMPSPreloadManagerInfo(java.lang.String r9) {
            r8 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.Map<java.lang.String, xyz.adscope.amps.model.preload.AMPSPreloadManagerInfo> r0 = xyz.adscope.amps.control.preload.AMPSPreLoad.mPreloadAdData
            boolean r0 = r0.containsKey(r9)
            if (r0 != 0) goto L11
            return r1
        L11:
            java.util.Map<java.lang.String, xyz.adscope.amps.model.preload.AMPSPreloadManagerInfo> r0 = xyz.adscope.amps.control.preload.AMPSPreLoad.mPreloadAdData
            java.lang.Object r0 = r0.get(r9)
            xyz.adscope.amps.model.preload.AMPSPreloadManagerInfo r0 = (xyz.adscope.amps.model.preload.AMPSPreloadManagerInfo) r0
            if (r0 != 0) goto L1c
            return r1
        L1c:
            long r2 = r0.getCachedTime()
            long r4 = r0.getCachedOffersTimeout()
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r2
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 <= 0) goto L31
            r8.removePreLoadAdInfo(r9)
            return r1
        L31:
            xyz.adscope.amps.manager.AMPSBaseOpenApiManager r2 = r0.getBaseOpenApiManager()
            if (r2 != 0) goto L3b
            r8.removePreLoadAdInfo(r9)
            return r1
        L3b:
            xyz.adscope.amps.base.AMPSBaseAdapter r2 = r2.getWinAdSourceAdapter()
            if (r2 != 0) goto L45
            r8.removePreLoadAdInfo(r9)
            return r1
        L45:
            boolean r2 = r2.isValid()
            if (r2 != 0) goto L4f
            r8.removePreLoadAdInfo(r9)
            return r1
        L4f:
            r8.removePreLoadAdInfo(r9)
            return r0
    }

    public void removePreLoadAdInfo(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L7
            goto L14
        L7:
            java.util.Map<java.lang.String, xyz.adscope.amps.model.preload.AMPSPreloadManagerInfo> r0 = xyz.adscope.amps.control.preload.AMPSPreLoad.mPreloadAdData
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L14
            java.util.Map<java.lang.String, xyz.adscope.amps.model.preload.AMPSPreloadManagerInfo> r0 = xyz.adscope.amps.control.preload.AMPSPreLoad.mPreloadAdData
            r0.remove(r2)
        L14:
            return
    }
}
