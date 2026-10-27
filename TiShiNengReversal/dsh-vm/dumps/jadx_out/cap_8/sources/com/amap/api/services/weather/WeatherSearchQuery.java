package com.amap.api.services.weather;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class WeatherSearchQuery implements java.lang.Cloneable {
    public static final int WEATHER_TYPE_FORECAST = 2;
    public static final int WEATHER_TYPE_LIVE = 1;
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private int f5647b;

    public WeatherSearchQuery() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f5647b = r0
            return
    }

    public WeatherSearchQuery(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.f5647b = r2
            return
    }

    public com.amap.api.services.weather.WeatherSearchQuery clone() {
            r3 = this;
            super.clone()     // Catch: java.lang.CloneNotSupportedException -> L4
            goto Lc
        L4:
            r0 = move-exception
            java.lang.String r1 = "WeatherSearchQuery"
            java.lang.String r2 = "clone"
            com.amap.api.col.s.j4.i(r0, r1, r2)
        Lc:
            com.amap.api.services.weather.WeatherSearchQuery r0 = new com.amap.api.services.weather.WeatherSearchQuery
            java.lang.String r1 = r3.a
            int r2 = r3.f5647b
            r0.<init>(r1, r2)
            return r0
    }

    /* renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object m42clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.amap.api.services.weather.WeatherSearchQuery r0 = r1.clone()
            return r0
    }

    public java.lang.String getCity() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public int getType() {
            r1 = this;
            int r0 = r1.f5647b
            return r0
    }
}
