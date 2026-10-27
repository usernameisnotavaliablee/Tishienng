package cn.easyar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@cn.easyar.TypeId("CA7961F06")
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class CameraDevice extends cn.easyar.RefBase {
    public CameraDevice() {
            r3 = this;
            long r0 = _ctor()
            r2 = 0
            r3.<init>(r0, r2)
            return
    }

    protected CameraDevice(long r1, cn.easyar.RefBase r3) {
            r0 = this;
            r0.<init>(r1, r3)
            return
    }

    @cn.easyar.MethodId("CD33483F0")
    private static native long _ctor();

    @cn.easyar.MethodId("CE9310E04")
    public static native int cameraCount();

    @cn.easyar.MethodId("CE93DF2A9")
    public static native boolean isAvailable();

    @cn.easyar.MethodId("CBC9350A1")
    public static native void requestPermissions(cn.easyar.CallbackScheduler r0, cn.easyar.FunctorOfVoidFromPermissionStatusAndString r1);

    @cn.easyar.MethodId("CEB864E2A")
    public native int androidCameraApiType();

    @cn.easyar.MethodId("C52AA90E6")
    public native boolean autoFocus();

    @cn.easyar.MethodId("C0D416B9B")
    public native int bufferCapacity();

    @cn.easyar.MethodId("C4DC3D319")
    public native cn.easyar.CameraParameters cameraParameters();

    @cn.easyar.MethodId("C310FF200")
    public native void close();

    @cn.easyar.MethodId("C13B416EC")
    public native int frameRateRange();

    @cn.easyar.MethodId("C1BC04B52")
    public native int index();

    @cn.easyar.MethodId("CDB9FF390")
    public native cn.easyar.InputFrameSource inputFrameSource();

    @cn.easyar.MethodId("C01B65F19")
    public native int inputFrameSourceType();

    @cn.easyar.MethodId("C187EBCC0")
    public native boolean openWithIndex(int r1);

    @cn.easyar.MethodId("CCC267338")
    public native boolean openWithPreferredType(int r1);

    @cn.easyar.MethodId("C002D72C8")
    public native boolean openWithSpecificType(int r1);

    @cn.easyar.MethodId("C1B5B4008")
    public native void setAndroidCameraApiType(int r1);

    @cn.easyar.MethodId("C657F58C2")
    public native void setBufferCapacity(int r1);

    @cn.easyar.MethodId("CDD2BA271")
    public native void setCameraParameters(cn.easyar.CameraParameters r1);

    @cn.easyar.MethodId("CC849C9FE")
    public native boolean setFlashTorchMode(boolean r1);

    @cn.easyar.MethodId("CA6771E58")
    public native boolean setFocusMode(int r1);

    @cn.easyar.MethodId("C360D21E6")
    public native boolean setFrameRateRange(int r1);

    @cn.easyar.MethodId("CCF2FAFCE")
    public native boolean setSize(cn.easyar.Vec2I r1);

    @cn.easyar.MethodId("C630C5DD1")
    public native void setStateChangedCallback(cn.easyar.CallbackScheduler r1, cn.easyar.FunctorOfVoidFromCameraState r2);

    @cn.easyar.MethodId("CCCDCBE84")
    public native cn.easyar.Vec2I size();

    @cn.easyar.MethodId("CCCED28C6")
    public native boolean start();

    @cn.easyar.MethodId("C6C45CB72")
    public native void stop();

    @cn.easyar.MethodId("CB1A33B20")
    public native int supportedFrameRateRangeCount();

    @cn.easyar.MethodId("CAC4E30F2")
    public native float supportedFrameRateRangeLower(int r1);

    @cn.easyar.MethodId("C1A35B3B6")
    public native float supportedFrameRateRangeUpper(int r1);

    @cn.easyar.MethodId("C1ADD38F9")
    public native cn.easyar.Vec2I supportedSize(int r1);

    @cn.easyar.MethodId("C1065E475")
    public native int supportedSizeCount();

    @cn.easyar.MethodId("C1303C06B")
    public native int type();
}
