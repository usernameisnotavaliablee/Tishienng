package cn.easyar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@cn.easyar.TypeId("CC45BE915")
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ARCoreCameraDevice extends cn.easyar.RefBase {
    public ARCoreCameraDevice() {
            r3 = this;
            long r0 = _ctor()
            r2 = 0
            r3.<init>(r0, r2)
            return
    }

    protected ARCoreCameraDevice(long r1, cn.easyar.RefBase r3) {
            r0 = this;
            r0.<init>(r1, r3)
            return
    }

    @cn.easyar.MethodId("CD33483F0")
    private static native long _ctor();

    @cn.easyar.MethodId("CE93DF2A9")
    public static native boolean isAvailable();

    @cn.easyar.MethodId("C9729BACB")
    public static native boolean isDeviceSupported();

    @cn.easyar.MethodId("C0D416B9B")
    public native int bufferCapacity();

    @cn.easyar.MethodId("C310FF200")
    public native void close();

    @cn.easyar.MethodId("CDB9FF390")
    public native cn.easyar.InputFrameSource inputFrameSource();

    @cn.easyar.MethodId("C01B65F19")
    public native int inputFrameSourceType();

    @cn.easyar.MethodId("C657F58C2")
    public native void setBufferCapacity(int r1);

    @cn.easyar.MethodId("CA6771E58")
    public native void setFocusMode(int r1);

    @cn.easyar.MethodId("CCCED28C6")
    public native boolean start();

    @cn.easyar.MethodId("C6C45CB72")
    public native void stop();
}
