package cn.easyar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@cn.easyar.TypeId("C17C932C7")
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class CloudLocalizerResult extends cn.easyar.RefBase {
    protected CloudLocalizerResult(long r1, cn.easyar.RefBase r3) {
            r0 = this;
            r0.<init>(r1, r3)
            return
    }

    @cn.easyar.MethodId("C67F64BF4")
    public native java.util.ArrayList<cn.easyar.CloudLocalizerBlockInstance> blockInstances();

    @cn.easyar.MethodId("C7CA24AF6")
    public native java.lang.String exceptionInfo();

    @cn.easyar.MethodId("CEBDF7478")
    public native java.lang.String extraInfo();

    @cn.easyar.MethodId("C5C9CD880")
    public native int localizeStatus();

    @cn.easyar.MethodId("CA8F5DD1B")
    public native java.lang.Double serverCalculationDuration();

    @cn.easyar.MethodId("C0DB6757F")
    public native java.lang.Double serverResponseDuration();
}
