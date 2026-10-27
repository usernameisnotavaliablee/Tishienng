package cn.easyar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@cn.easyar.TypeId("C4BC8185A")
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class InputFrame extends cn.easyar.RefBase {
    protected InputFrame(long r1, cn.easyar.RefBase r3) {
            r0 = this;
            r0.<init>(r1, r3)
            return
    }

    @cn.easyar.MethodId("CFA8847B0")
    public static native cn.easyar.InputFrame create(cn.easyar.Image r0, cn.easyar.CameraParameters r1, double r2, cn.easyar.Matrix44F r4, int r5);

    @cn.easyar.MethodId("C1DFA11DA")
    public static native cn.easyar.InputFrame createWithImage(cn.easyar.Image r0);

    @cn.easyar.MethodId("CFFCE90E5")
    public static native cn.easyar.InputFrame createWithImageAndCameraParameters(cn.easyar.Image r0, cn.easyar.CameraParameters r1);

    @cn.easyar.MethodId("C000FEBED")
    public static native cn.easyar.InputFrame createWithImageAndCameraParametersAndTemporal(cn.easyar.Image r0, cn.easyar.CameraParameters r1, double r2);

    @cn.easyar.MethodId("C4DC3D319")
    public native cn.easyar.CameraParameters cameraParameters();

    @cn.easyar.MethodId("C912CF8F5")
    public native cn.easyar.Matrix44F cameraTransform();

    @cn.easyar.MethodId("CB00D3B50")
    public native boolean hasCameraParameters();

    @cn.easyar.MethodId("C76C5CA3C")
    public native boolean hasSpatialInformation();

    @cn.easyar.MethodId("C7C67FA5E")
    public native boolean hasTemporalInformation();

    @cn.easyar.MethodId("C6105D6CC")
    public native cn.easyar.Image image();

    @cn.easyar.MethodId("C1BC04B52")
    public native int index();

    @cn.easyar.MethodId("C323748F8")
    public native double timestamp();

    @cn.easyar.MethodId("C4B3328F0")
    public native int trackingStatus();
}
