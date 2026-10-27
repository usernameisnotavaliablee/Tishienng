package com.amap.api.services.weather;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class LocalWeatherForecast implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.weather.LocalWeatherForecast> CREATOR = null;
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f5633b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f5634c;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f5635d;

    /* renamed from: e, reason: collision with root package name */
    private java.util.List<com.amap.api.services.weather.LocalDayWeatherForecast> f5636e;


    static {
            com.amap.api.services.weather.LocalWeatherForecast$1 r0 = new com.amap.api.services.weather.LocalWeatherForecast$1
            r0.<init>()
            com.amap.api.services.weather.LocalWeatherForecast.CREATOR = r0
            return
    }

    public LocalWeatherForecast() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5636e = r0
            return
    }

    public LocalWeatherForecast(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5636e = r0
            java.lang.String r0 = r2.readString()
            r1.a = r0
            java.lang.String r0 = r2.readString()
            r1.f5633b = r0
            java.lang.String r0 = r2.readString()
            r1.f5634c = r0
            java.lang.String r0 = r2.readString()
            r1.f5635d = r0
            java.lang.Class<com.amap.api.services.weather.LocalWeatherForecast> r0 = com.amap.api.services.weather.LocalWeatherForecast.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.util.ArrayList r2 = r2.readArrayList(r0)
            r1.f5636e = r2
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.String getAdCode() {
            r1 = this;
            java.lang.String r0 = r1.f5634c
            return r0
    }

    public java.lang.String getCity() {
            r1 = this;
            java.lang.String r0 = r1.f5633b
            return r0
    }

    public java.lang.String getProvince() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public java.lang.String getReportTime() {
            r1 = this;
            java.lang.String r0 = r1.f5635d
            return r0
    }

    public java.util.List<com.amap.api.services.weather.LocalDayWeatherForecast> getWeatherForecast() {
            r1 = this;
            java.util.List<com.amap.api.services.weather.LocalDayWeatherForecast> r0 = r1.f5636e
            return r0
    }

    public void setAdCode(java.lang.String r1) {
            r0 = this;
            r0.f5634c = r1
            return
    }

    public void setCity(java.lang.String r1) {
            r0 = this;
            r0.f5633b = r1
            return
    }

    public void setProvince(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void setReportTime(java.lang.String r1) {
            r0 = this;
            r0.f5635d = r1
            return
    }

    public void setWeatherForecast(java.util.List<com.amap.api.services.weather.LocalDayWeatherForecast> r1) {
            r0 = this;
            r0.f5636e = r1
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.a
            r1.writeString(r2)
            java.lang.String r2 = r0.f5633b
            r1.writeString(r2)
            java.lang.String r2 = r0.f5634c
            r1.writeString(r2)
            java.lang.String r2 = r0.f5635d
            r1.writeString(r2)
            java.util.List<com.amap.api.services.weather.LocalDayWeatherForecast> r2 = r0.f5636e
            r1.writeList(r2)
            return
    }
}
