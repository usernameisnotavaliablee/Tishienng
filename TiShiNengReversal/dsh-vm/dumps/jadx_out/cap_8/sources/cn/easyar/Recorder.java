package cn.easyar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@cn.easyar.TypeId("CB984D066")
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class Recorder extends cn.easyar.RefBase {
    protected Recorder(long r1, cn.easyar.RefBase r3) {
            r0 = this;
            r0.<init>(r1, r3)
            return
    }

    @cn.easyar.MethodId("CFA8847B0")
    public static native cn.easyar.Recorder create(cn.easyar.RecorderConfiguration r0, cn.easyar.CallbackScheduler r1, cn.easyar.FunctorOfVoidFromRecordStatusAndString r2);

    @cn.easyar.MethodId("CE93DF2A9")
    public static native boolean isAvailable();

    @cn.easyar.MethodId("CBC9350A1")
    public static native void requestPermissions(cn.easyar.CallbackScheduler r0, cn.easyar.FunctorOfVoidFromPermissionStatusAndString r1);

    @cn.easyar.MethodId("CCCED28C6")
    public native void start();

    @cn.easyar.MethodId("C6C45CB72")
    public native boolean stop();

    @cn.easyar.MethodId("C14F3B6CB")
    public native void updateFrame(cn.easyar.TextureId r1, int r2, int r3);
}
