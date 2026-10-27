package xyz.adscope.amps.control.filter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSFilter implements xyz.adscope.amps.control.filter.inter.IFilterInterface {
    private long mAdRequestTimeout;
    private long mAdSourceRequestTimeout;
    private xyz.adscope.amps.model.config.response.FilterModel mFilterModel;
    private java.lang.String mSpaceId;

    public AMPSFilter(xyz.adscope.amps.model.config.response.SpaceModel r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mFilterModel = r0
            r2.mSpaceId = r0
            r0 = 5000(0x1388, double:2.4703E-320)
            r2.mAdRequestTimeout = r0
            r2.mAdSourceRequestTimeout = r0
            if (r3 != 0) goto L11
            goto L32
        L11:
            java.lang.String r0 = r3.getSpaceId()     // Catch: java.lang.Exception -> L32
            r2.mSpaceId = r0     // Catch: java.lang.Exception -> L32
            xyz.adscope.amps.model.config.response.FilterModel r0 = r3.getFilter()     // Catch: java.lang.Exception -> L32
            r2.mFilterModel = r0     // Catch: java.lang.Exception -> L32
            long r0 = r3.getAdTimeout()     // Catch: java.lang.Exception -> L32
            r2.mAdRequestTimeout = r0     // Catch: java.lang.Exception -> L32
            long r0 = r3.getAdsTimeout()     // Catch: java.lang.Exception -> L32
            r2.mAdSourceRequestTimeout = r0     // Catch: java.lang.Exception -> L32
            xyz.adscope.amps.manager.AMPSFrequencyManager r3 = xyz.adscope.amps.manager.AMPSFrequencyManager.getInstance()     // Catch: java.lang.Exception -> L32
            java.lang.String r0 = r2.mSpaceId     // Catch: java.lang.Exception -> L32
            r3.initFrequencyData(r0)     // Catch: java.lang.Exception -> L32
        L32:
            return
    }

    @Override // xyz.adscope.amps.control.filter.inter.IFilterInterface
    public void addFilterEvent(xyz.adscope.amps.model.frequency.AMPSFrequencyEventModel r3) {
            r2 = this;
            java.lang.String r0 = r2.mSpaceId     // Catch: java.lang.Exception -> L17
            r3.setMediationSpaceId(r0)     // Catch: java.lang.Exception -> L17
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L17
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Exception -> L17
            r3.setEventTime(r0)     // Catch: java.lang.Exception -> L17
            xyz.adscope.amps.manager.AMPSFrequencyManager r0 = xyz.adscope.amps.manager.AMPSFrequencyManager.getInstance()     // Catch: java.lang.Exception -> L17
            r0.putFrequencyData(r3)     // Catch: java.lang.Exception -> L17
        L17:
            return
    }

    @Override // xyz.adscope.amps.control.filter.inter.IFilterInterface
    public boolean channelFilter(xyz.adscope.amps.model.config.response.AdSourceModel r11) {
            r10 = this;
            r0 = 0
            if (r11 != 0) goto L4
            return r0
        L4:
            r1 = 1
            java.lang.String r2 = r11.getSpaceId()     // Catch: java.lang.Exception -> L5c
            xyz.adscope.amps.model.config.response.FilterModel r3 = r11.getFilter()     // Catch: java.lang.Exception -> L5c
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L5c
            if (r4 == 0) goto L14
            return r0
        L14:
            if (r3 != 0) goto L17
            return r1
        L17:
            long r4 = r3.getMinLoadTime()     // Catch: java.lang.Exception -> L5c
            int r11 = r11.getAdsTimeout()     // Catch: java.lang.Exception -> L5c
            long r6 = (long) r11     // Catch: java.lang.Exception -> L5c
            r8 = 0
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 != 0) goto L28
            long r6 = r10.mAdSourceRequestTimeout     // Catch: java.lang.Exception -> L5c
        L28:
            int r11 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r11 >= 0) goto L2d
            return r0
        L2d:
            java.util.List r11 = r3.getFrequency()     // Catch: java.lang.Exception -> L5c
            if (r11 == 0) goto L5c
            int r3 = r11.size()     // Catch: java.lang.Exception -> L5c
            if (r3 != 0) goto L3a
            goto L5c
        L3a:
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Exception -> L5c
        L3e:
            boolean r3 = r11.hasNext()     // Catch: java.lang.Exception -> L5c
            if (r3 == 0) goto L5c
            java.lang.Object r3 = r11.next()     // Catch: java.lang.Exception -> L5c
            xyz.adscope.amps.model.config.response.FrequencyModel r3 = (xyz.adscope.amps.model.config.response.FrequencyModel) r3     // Catch: java.lang.Exception -> L5c
            int r4 = r3.getCount()     // Catch: java.lang.Exception -> L5c
            if (r4 != 0) goto L51
            goto L3e
        L51:
            xyz.adscope.amps.manager.AMPSFrequencyManager r4 = xyz.adscope.amps.manager.AMPSFrequencyManager.getInstance()     // Catch: java.lang.Exception -> L5c
            boolean r3 = r4.isPassAdSourceFrequencyLimit(r2, r3)     // Catch: java.lang.Exception -> L5c
            if (r3 != 0) goto L3e
            return r0
        L5c:
            return r1
    }

    @Override // xyz.adscope.amps.control.filter.inter.IFilterInterface
    public boolean platformFilter() {
            r7 = this;
            r0 = 1
            java.lang.String r1 = r7.mSpaceId     // Catch: java.lang.Exception -> L4e
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L4e
            r2 = 0
            if (r1 == 0) goto Lb
            return r2
        Lb:
            xyz.adscope.amps.model.config.response.FilterModel r1 = r7.mFilterModel     // Catch: java.lang.Exception -> L4e
            if (r1 != 0) goto L10
            return r0
        L10:
            long r3 = r1.getMinLoadTime()     // Catch: java.lang.Exception -> L4e
            long r5 = r7.mAdRequestTimeout     // Catch: java.lang.Exception -> L4e
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 >= 0) goto L1b
            return r2
        L1b:
            xyz.adscope.amps.model.config.response.FilterModel r1 = r7.mFilterModel     // Catch: java.lang.Exception -> L4e
            java.util.List r1 = r1.getFrequency()     // Catch: java.lang.Exception -> L4e
            if (r1 == 0) goto L4e
            int r3 = r1.size()     // Catch: java.lang.Exception -> L4e
            if (r3 != 0) goto L2a
            goto L4e
        L2a:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L4e
        L2e:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Exception -> L4e
            if (r3 == 0) goto L4e
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Exception -> L4e
            xyz.adscope.amps.model.config.response.FrequencyModel r3 = (xyz.adscope.amps.model.config.response.FrequencyModel) r3     // Catch: java.lang.Exception -> L4e
            int r4 = r3.getCount()     // Catch: java.lang.Exception -> L4e
            if (r4 != 0) goto L41
            goto L2e
        L41:
            xyz.adscope.amps.manager.AMPSFrequencyManager r4 = xyz.adscope.amps.manager.AMPSFrequencyManager.getInstance()     // Catch: java.lang.Exception -> L4e
            java.lang.String r5 = r7.mSpaceId     // Catch: java.lang.Exception -> L4e
            boolean r3 = r4.isPassMediationFrequencyLimit(r5, r3)     // Catch: java.lang.Exception -> L4e
            if (r3 != 0) goto L2e
            return r2
        L4e:
            return r0
    }
}
