package com.amap.api.services.weather;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class LocalWeatherForecastResult {
    private com.amap.api.services.weather.WeatherSearchQuery a;

    /* renamed from: b, reason: collision with root package name */
    private com.amap.api.services.weather.LocalWeatherForecast f5637b;

    private LocalWeatherForecastResult(com.amap.api.services.weather.WeatherSearchQuery r1, com.amap.api.services.weather.LocalWeatherForecast r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.f5637b = r2
            return
    }

    public static com.amap.api.services.weather.LocalWeatherForecastResult createPagedResult(com.amap.api.services.weather.WeatherSearchQuery r1, com.amap.api.services.weather.LocalWeatherForecast r2) {
            com.amap.api.services.weather.LocalWeatherForecastResult r0 = new com.amap.api.services.weather.LocalWeatherForecastResult
            r0.<init>(r1, r2)
            return r0
    }

    public com.amap.api.services.weather.LocalWeatherForecast getForecastResult() {
            r1 = this;
            com.amap.api.services.weather.LocalWeatherForecast r0 = r1.f5637b
            return r0
    }

    public com.amap.api.services.weather.WeatherSearchQuery getWeatherForecastQuery() {
            r1 = this;
            com.amap.api.services.weather.WeatherSearchQuery r0 = r1.a
            return r0
    }
}
