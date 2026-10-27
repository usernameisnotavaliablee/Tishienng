package cn.easyar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@cn.easyar.TypeId("C66C032BA")
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ARCoreDeviceListDownloader extends cn.easyar.RefBase {
    public ARCoreDeviceListDownloader() {
            r3 = this;
            long r0 = _ctor()
            r2 = 0
            r3.<init>(r0, r2)
            return
    }

    protected ARCoreDeviceListDownloader(long r1, cn.easyar.RefBase r3) {
            r0 = this;
            r0.<init>(r1, r3)
            return
    }

    @cn.easyar.MethodId("CD33483F0")
    private static native long _ctor();

    @cn.easyar.MethodId("C68FF63FB")
    public native void download(java.lang.Integer r1, cn.easyar.CallbackScheduler r2, cn.easyar.FunctorOfVoidFromARCoreDeviceListDownloadStatusAndOptionalOfString r3);
}
