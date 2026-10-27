package com.amap.api.services.weather;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class LocalDayWeatherForecast implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.weather.LocalDayWeatherForecast> CREATOR = null;
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f5624b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f5625c;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f5626d;

    /* renamed from: e, reason: collision with root package name */
    private java.lang.String f5627e;

    /* renamed from: f, reason: collision with root package name */
    private java.lang.String f5628f;

    /* renamed from: g, reason: collision with root package name */
    private java.lang.String f5629g;

    /* renamed from: h, reason: collision with root package name */
    private java.lang.String f5630h;

    /* renamed from: i, reason: collision with root package name */
    private java.lang.String f5631i;

    /* renamed from: j, reason: collision with root package name */
    private java.lang.String f5632j;


    static {
            com.amap.api.services.weather.LocalDayWeatherForecast$1 r0 = new com.amap.api.services.weather.LocalDayWeatherForecast$1
            r0.<init>()
            com.amap.api.services.weather.LocalDayWeatherForecast.CREATOR = r0
            return
    }

    public LocalDayWeatherForecast() {
            r0 = this;
            r0.<init>()
            return
    }

    public LocalDayWeatherForecast(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = r2.readString()
            r1.a = r0
            java.lang.String r0 = r2.readString()
            r1.f5624b = r0
            java.lang.String r0 = r2.readString()
            r1.f5625c = r0
            java.lang.String r0 = r2.readString()
            r1.f5626d = r0
            java.lang.String r0 = r2.readString()
            r1.f5627e = r0
            java.lang.String r0 = r2.readString()
            r1.f5628f = r0
            java.lang.String r0 = r2.readString()
            r1.f5629g = r0
            java.lang.String r0 = r2.readString()
            r1.f5630h = r0
            java.lang.String r0 = r2.readString()
            r1.f5631i = r0
            java.lang.String r2 = r2.readString()
            r1.f5632j = r2
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.String getDate() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public java.lang.String getDayTemp() {
            r1 = this;
            java.lang.String r0 = r1.f5627e
            return r0
    }

    public java.lang.String getDayWeather() {
            r1 = this;
            java.lang.String r0 = r1.f5625c
            return r0
    }

    public java.lang.String getDayWindDirection() {
            r1 = this;
            java.lang.String r0 = r1.f5629g
            return r0
    }

    public java.lang.String getDayWindPower() {
            r1 = this;
            java.lang.String r0 = r1.f5631i
            return r0
    }

    public java.lang.String getNightTemp() {
            r1 = this;
            java.lang.String r0 = r1.f5628f
            return r0
    }

    public java.lang.String getNightWeather() {
            r1 = this;
            java.lang.String r0 = r1.f5626d
            return r0
    }

    public java.lang.String getNightWindDirection() {
            r1 = this;
            java.lang.String r0 = r1.f5630h
            return r0
    }

    public java.lang.String getNightWindPower() {
            r1 = this;
            java.lang.String r0 = r1.f5632j
            return r0
    }

    public java.lang.String getWeek() {
            r1 = this;
            java.lang.String r0 = r1.f5624b
            return r0
    }

    public void setDate(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void setDayTemp(java.lang.String r1) {
            r0 = this;
            r0.f5627e = r1
            return
    }

    public void setDayWeather(java.lang.String r1) {
            r0 = this;
            r0.f5625c = r1
            return
    }

    public void setDayWindDirection(java.lang.String r1) {
            r0 = this;
            r0.f5629g = r1
            return
    }

    public void setDayWindPower(java.lang.String r1) {
            r0 = this;
            r0.f5631i = r1
            return
    }

    public void setNightTemp(java.lang.String r1) {
            r0 = this;
            r0.f5628f = r1
            return
    }

    public void setNightWeather(java.lang.String r1) {
            r0 = this;
            r0.f5626d = r1
            return
    }

    public void setNightWindDirection(java.lang.String r1) {
            r0 = this;
            r0.f5630h = r1
            return
    }

    public void setNightWindPower(java.lang.String r1) {
            r0 = this;
            r0.f5632j = r1
            return
    }

    public void setWeek(java.lang.String r1) {
            r0 = this;
            r0.f5624b = r1
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.a
            r1.writeString(r2)
            java.lang.String r2 = r0.f5624b
            r1.writeString(r2)
            java.lang.String r2 = r0.f5625c
            r1.writeString(r2)
            java.lang.String r2 = r0.f5626d
            r1.writeString(r2)
            java.lang.String r2 = r0.f5627e
            r1.writeString(r2)
            java.lang.String r2 = r0.f5628f
            r1.writeString(r2)
            java.lang.String r2 = r0.f5629g
            r1.writeString(r2)
            java.lang.String r2 = r0.f5630h
            r1.writeString(r2)
            java.lang.String r2 = r0.f5631i
            r1.writeString(r2)
            java.lang.String r2 = r0.f5632j
            r1.writeString(r2)
            return
    }
}
