package cn.easyar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@cn.easyar.TypeId("CEF755FEA")
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class LocationResult {
    public double altitude;
    public boolean hasAltitude;
    public boolean hasHorizontalAccuracy;
    public boolean hasVerticalAccuracy;
    public double horizontalAccuracy;
    public double latitude;
    public double longitude;
    public double verticalAccuracy;

    public LocationResult() {
            r0 = this;
            r0.<init>()
            return
    }

    public LocationResult(double r1, double r3, double r5, double r7, double r9, boolean r11, boolean r12, boolean r13) {
            r0 = this;
            r0.<init>()
            r0.latitude = r1
            r0.longitude = r3
            r0.altitude = r5
            r0.horizontalAccuracy = r7
            r0.verticalAccuracy = r9
            r0.hasAltitude = r11
            r0.hasHorizontalAccuracy = r12
            r0.hasVerticalAccuracy = r13
            return
    }
}
