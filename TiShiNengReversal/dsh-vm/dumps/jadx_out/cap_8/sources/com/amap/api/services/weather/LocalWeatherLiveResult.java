package com.amap.api.services.weather;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class LocalWeatherLiveResult {
    private com.amap.api.services.weather.WeatherSearchQuery a;

    /* renamed from: b, reason: collision with root package name */
    private com.amap.api.services.weather.LocalWeatherLive f5646b;

    private LocalWeatherLiveResult(com.amap.api.services.weather.WeatherSearchQuery r1, com.amap.api.services.weather.LocalWeatherLive r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.f5646b = r2
            return
    }

    public static com.amap.api.services.weather.LocalWeatherLiveResult createPagedResult(com.amap.api.services.weather.WeatherSearchQuery r1, com.amap.api.services.weather.LocalWeatherLive r2) {
            com.amap.api.services.weather.LocalWeatherLiveResult r0 = new com.amap.api.services.weather.LocalWeatherLiveResult
            r0.<init>(r1, r2)
            return r0
    }

    public com.amap.api.services.weather.LocalWeatherLive getLiveResult() {
            r1 = this;
            com.amap.api.services.weather.LocalWeatherLive r0 = r1.f5646b
            return r0
    }

    public com.amap.api.services.weather.WeatherSearchQuery getWeatherLiveQuery() {
            r1 = this;
            com.amap.api.services.weather.WeatherSearchQuery r0 = r1.a
            return r0
    }
}
