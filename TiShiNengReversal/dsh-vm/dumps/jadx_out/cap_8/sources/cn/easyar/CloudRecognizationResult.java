package cn.easyar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@cn.easyar.TypeId("C339A566A")
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class CloudRecognizationResult extends cn.easyar.RefBase {
    protected CloudRecognizationResult(long r1, cn.easyar.RefBase r3) {
            r0 = this;
            r0.<init>(r1, r3)
            return
    }

    @cn.easyar.MethodId("C62197BF2")
    public native int getStatus();

    @cn.easyar.MethodId("CD6010142")
    public native cn.easyar.ImageTarget getTarget();

    @cn.easyar.MethodId("C3A667572")
    public native java.lang.String getUnknownErrorMessage();
}
