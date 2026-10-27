package cn.easyar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@cn.easyar.TypeId("C97824B76")
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class CloudLocalizer extends cn.easyar.RefBase {
    protected CloudLocalizer(long r1, cn.easyar.RefBase r3) {
            r0 = this;
            r0.<init>(r1, r3)
            return
    }

    @cn.easyar.MethodId("CFA8847B0")
    public static native cn.easyar.CloudLocalizer create(java.lang.String r0, java.lang.String r1, java.lang.String r2, java.lang.String r3);

    @cn.easyar.MethodId("CE93DF2A9")
    public static native boolean isAvailable();

    @cn.easyar.MethodId("C310FF200")
    public native void close();

    @cn.easyar.MethodId("CFDF09CDF")
    public native void resolve(cn.easyar.InputFrame r1, java.lang.String r2, cn.easyar.DeviceAuxiliaryInfo r3, java.lang.Integer r4, cn.easyar.CallbackScheduler r5, cn.easyar.FunctorOfVoidFromCloudLocalizerResult r6);
}
