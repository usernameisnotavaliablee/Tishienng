package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class d0 extends com.amap.api.col.s.f0<com.amap.api.services.weather.WeatherSearchQuery, com.amap.api.services.weather.LocalWeatherForecast> {
    private com.amap.api.services.weather.LocalWeatherForecast t;

    public d0(android.content.Context r1, com.amap.api.services.weather.WeatherSearchQuery r2) {
            r0 = this;
            r0.<init>(r1, r2)
            com.amap.api.services.weather.LocalWeatherForecast r1 = new com.amap.api.services.weather.LocalWeatherForecast
            r1.<init>()
            r0.t = r1
            return
    }

    private com.amap.api.services.weather.LocalWeatherForecast V(java.lang.String r1) throws com.amap.api.services.core.AMapException {
            r0 = this;
            com.amap.api.services.weather.LocalWeatherForecast r1 = com.amap.api.col.s.r4.o0(r1)
            r0.t = r1
            return r1
    }

    @Override // com.amap.api.col.s.b4, com.amap.api.col.s.a3
    protected final /* synthetic */ java.lang.Object I(java.lang.String r1) throws com.amap.api.services.core.AMapException {
            r0 = this;
            com.amap.api.services.weather.LocalWeatherForecast r1 = r0.V(r1)
            return r1
    }

    @Override // com.amap.api.col.s.b4, com.amap.api.col.s.a3
    protected final java.lang.String M() {
            r3 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = "output=json"
            r0.append(r1)
            T r1 = r3.n
            com.amap.api.services.weather.WeatherSearchQuery r1 = (com.amap.api.services.weather.WeatherSearchQuery) r1
            java.lang.String r1 = r1.getCity()
            boolean r2 = com.amap.api.col.s.r4.s0(r1)
            if (r2 != 0) goto L24
            java.lang.String r1 = com.amap.api.col.s.b4.i(r1)
            java.lang.String r2 = "&city="
            r0.append(r2)
            r0.append(r1)
        L24:
            java.lang.String r1 = "&extensions=all"
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "&key="
            r1.<init>(r2)
            android.content.Context r2 = r3.q
            java.lang.String r2 = com.amap.api.col.s.x0.i(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.amap.api.col.s.f0
    public final /* bridge */ /* synthetic */ com.amap.api.services.weather.WeatherSearchQuery U() {
            r1 = this;
            java.lang.Object r0 = super.U()
            return r0
    }

    @Override // com.amap.api.col.s.f0, com.amap.api.col.s.dz
    public final /* bridge */ /* synthetic */ java.lang.String h() {
            r1 = this;
            java.lang.String r0 = super.h()
            return r0
    }
}
