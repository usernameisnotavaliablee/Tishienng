package com.amap.api.services.weather;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class WeatherSearch {
    private com.amap.api.services.interfaces.IWeatherSearch a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnWeatherSearchListener {
        void onWeatherForecastSearched(com.amap.api.services.weather.LocalWeatherForecastResult r1, int r2);

        void onWeatherLiveSearched(com.amap.api.services.weather.LocalWeatherLiveResult r1, int r2);
    }

    public WeatherSearch(android.content.Context r2) throws com.amap.api.services.core.AMapException {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            com.amap.api.col.s.w0 r0 = new com.amap.api.col.s.w0     // Catch: java.lang.Exception -> Le
            r0.<init>(r2)     // Catch: java.lang.Exception -> Le
            r1.a = r0     // Catch: java.lang.Exception -> Le
            return
        Le:
            r2 = move-exception
            boolean r0 = r2 instanceof com.amap.api.services.core.AMapException
            if (r0 != 0) goto L14
            return
        L14:
            com.amap.api.services.core.AMapException r2 = (com.amap.api.services.core.AMapException) r2
            throw r2
    }

    public com.amap.api.services.weather.WeatherSearchQuery getQuery() {
            r1 = this;
            com.amap.api.services.interfaces.IWeatherSearch r0 = r1.a
            if (r0 == 0) goto L9
            com.amap.api.services.weather.WeatherSearchQuery r0 = r0.getQuery()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public void searchWeatherAsyn() {
            r1 = this;
            com.amap.api.services.interfaces.IWeatherSearch r0 = r1.a
            if (r0 == 0) goto L7
            r0.searchWeatherAsyn()
        L7:
            return
    }

    public void setOnWeatherSearchListener(com.amap.api.services.weather.WeatherSearch.OnWeatherSearchListener r2) {
            r1 = this;
            com.amap.api.services.interfaces.IWeatherSearch r0 = r1.a
            if (r0 == 0) goto L7
            r0.setOnWeatherSearchListener(r2)
        L7:
            return
    }

    public void setQuery(com.amap.api.services.weather.WeatherSearchQuery r2) {
            r1 = this;
            com.amap.api.services.interfaces.IWeatherSearch r0 = r1.a
            if (r0 == 0) goto L7
            r0.setQuery(r2)
        L7:
            return
    }
}
