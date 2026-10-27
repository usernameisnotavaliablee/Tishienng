package com.amap.api.services.weather;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class LocalWeatherLive implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.weather.LocalWeatherLive> CREATOR = null;
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f5638b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f5639c;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f5640d;

    /* renamed from: e, reason: collision with root package name */
    private java.lang.String f5641e;

    /* renamed from: f, reason: collision with root package name */
    private java.lang.String f5642f;

    /* renamed from: g, reason: collision with root package name */
    private java.lang.String f5643g;

    /* renamed from: h, reason: collision with root package name */
    private java.lang.String f5644h;

    /* renamed from: i, reason: collision with root package name */
    private java.lang.String f5645i;


    static {
            com.amap.api.services.weather.LocalWeatherLive$1 r0 = new com.amap.api.services.weather.LocalWeatherLive$1
            r0.<init>()
            com.amap.api.services.weather.LocalWeatherLive.CREATOR = r0
            return
    }

    public LocalWeatherLive() {
            r0 = this;
            r0.<init>()
            return
    }

    public LocalWeatherLive(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = r2.readString()
            r1.a = r0
            java.lang.String r0 = r2.readString()
            r1.f5638b = r0
            java.lang.String r0 = r2.readString()
            r1.f5639c = r0
            java.lang.String r0 = r2.readString()
            r1.f5640d = r0
            java.lang.String r0 = r2.readString()
            r1.f5641e = r0
            java.lang.String r0 = r2.readString()
            r1.f5642f = r0
            java.lang.String r0 = r2.readString()
            r1.f5643g = r0
            java.lang.String r0 = r2.readString()
            r1.f5644h = r0
            java.lang.String r2 = r2.readString()
            r1.f5645i = r2
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
            java.lang.String r0 = r1.f5639c
            return r0
    }

    public java.lang.String getCity() {
            r1 = this;
            java.lang.String r0 = r1.f5638b
            return r0
    }

    public java.lang.String getHumidity() {
            r1 = this;
            java.lang.String r0 = r1.f5644h
            return r0
    }

    public java.lang.String getProvince() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public java.lang.String getReportTime() {
            r1 = this;
            java.lang.String r0 = r1.f5645i
            return r0
    }

    public java.lang.String getTemperature() {
            r1 = this;
            java.lang.String r0 = r1.f5641e
            return r0
    }

    public java.lang.String getWeather() {
            r1 = this;
            java.lang.String r0 = r1.f5640d
            return r0
    }

    public java.lang.String getWindDirection() {
            r1 = this;
            java.lang.String r0 = r1.f5642f
            return r0
    }

    public java.lang.String getWindPower() {
            r1 = this;
            java.lang.String r0 = r1.f5643g
            return r0
    }

    public void setAdCode(java.lang.String r1) {
            r0 = this;
            r0.f5639c = r1
            return
    }

    public void setCity(java.lang.String r1) {
            r0 = this;
            r0.f5638b = r1
            return
    }

    public void setHumidity(java.lang.String r1) {
            r0 = this;
            r0.f5644h = r1
            return
    }

    public void setProvince(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void setReportTime(java.lang.String r1) {
            r0 = this;
            r0.f5645i = r1
            return
    }

    public void setTemperature(java.lang.String r1) {
            r0 = this;
            r0.f5641e = r1
            return
    }

    public void setWeather(java.lang.String r1) {
            r0 = this;
            r0.f5640d = r1
            return
    }

    public void setWindDirection(java.lang.String r1) {
            r0 = this;
            r0.f5642f = r1
            return
    }

    public void setWindPower(java.lang.String r1) {
            r0 = this;
            r0.f5643g = r1
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.a
            r1.writeString(r2)
            java.lang.String r2 = r0.f5638b
            r1.writeString(r2)
            java.lang.String r2 = r0.f5639c
            r1.writeString(r2)
            java.lang.String r2 = r0.f5640d
            r1.writeString(r2)
            java.lang.String r2 = r0.f5641e
            r1.writeString(r2)
            java.lang.String r2 = r0.f5642f
            r1.writeString(r2)
            java.lang.String r2 = r0.f5643g
            r1.writeString(r2)
            java.lang.String r2 = r0.f5644h
            r1.writeString(r2)
            java.lang.String r2 = r0.f5645i
            r1.writeString(r2)
            return
    }
}
