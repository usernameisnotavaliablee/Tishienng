package cn.easyar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@cn.easyar.TypeId("C3AAB0B73")
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class DeviceAuxiliaryInfo extends cn.easyar.RefBase {
    protected DeviceAuxiliaryInfo(long r1, cn.easyar.RefBase r3) {
            r0 = this;
            r0.<init>(r1, r3)
            return
    }

    @cn.easyar.MethodId("CFA8847B0")
    public static native cn.easyar.DeviceAuxiliaryInfo create();

    @cn.easyar.MethodId("C8CE39611")
    public native void setAcceleration(cn.easyar.AccelerometerResult r1);

    @cn.easyar.MethodId("CEBD284B9")
    public native void setECompass(double r1, double r3);

    @cn.easyar.MethodId("CADCA3743")
    public native void setGPSLocation(cn.easyar.LocationResult r1);

    @cn.easyar.MethodId("CE555D1D2")
    public native void setProximityLocation(cn.easyar.ProximityLocationResult r1);
}
