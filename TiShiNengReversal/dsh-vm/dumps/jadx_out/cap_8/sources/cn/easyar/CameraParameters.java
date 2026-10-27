package cn.easyar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@cn.easyar.TypeId("C29D6C102")
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class CameraParameters extends cn.easyar.RefBase {
    protected CameraParameters(long r1, cn.easyar.RefBase r3) {
            r0 = this;
            r0.<init>(r1, r3)
            return
    }

    public CameraParameters(cn.easyar.Vec2I r1, cn.easyar.Vec2F r2, cn.easyar.Vec2F r3, int r4, int r5) {
            r0 = this;
            long r1 = _ctor(r1, r2, r3, r4, r5)
            r3 = 0
            r0.<init>(r1, r3)
            return
    }

    @cn.easyar.MethodId("CD33483F0")
    private static native long _ctor(cn.easyar.Vec2I r0, cn.easyar.Vec2F r1, cn.easyar.Vec2F r2, int r3, int r4);

    @cn.easyar.MethodId("C82C54725")
    public static native cn.easyar.CameraParameters createWithDefaultIntrinsics(cn.easyar.Vec2I r0, int r1, int r2);

    @cn.easyar.MethodId("C8A4C8A83")
    public native int cameraDeviceType();

    @cn.easyar.MethodId("C33D67BC7")
    public native int cameraOrientation();

    @cn.easyar.MethodId("C02A861D9")
    public native boolean equalsTo(cn.easyar.CameraParameters r1);

    @cn.easyar.MethodId("C13E9FB87")
    public native cn.easyar.Vec2F focalLength();

    @cn.easyar.MethodId("CF3D37286")
    public native cn.easyar.CameraParameters getResized(cn.easyar.Vec2I r1);

    @cn.easyar.MethodId("C70B4F176")
    public native cn.easyar.Vec2F imageCoordinatesFromScreenCoordinates(float r1, int r2, boolean r3, boolean r4, cn.easyar.Vec2F r5);

    @cn.easyar.MethodId("C2A1C0E46")
    public native boolean imageHorizontalFlip(boolean r1);

    @cn.easyar.MethodId("C2F345246")
    public native int imageOrientation(int r1);

    @cn.easyar.MethodId("C57D35EE0")
    public native cn.easyar.Matrix44F imageProjection(float r1, int r2, boolean r3, boolean r4);

    @cn.easyar.MethodId("CD0A0CE6F")
    public native cn.easyar.Vec2F principalPoint();

    @cn.easyar.MethodId("C1B250EA1")
    public native cn.easyar.Matrix44F projection(float r1, float r2, float r3, int r4, boolean r5, boolean r6);

    @cn.easyar.MethodId("C47468C1E")
    public native cn.easyar.Vec2F screenCoordinatesFromImageCoordinates(float r1, int r2, boolean r3, boolean r4, cn.easyar.Vec2F r5);

    @cn.easyar.MethodId("CCCDCBE84")
    public native cn.easyar.Vec2I size();
}
