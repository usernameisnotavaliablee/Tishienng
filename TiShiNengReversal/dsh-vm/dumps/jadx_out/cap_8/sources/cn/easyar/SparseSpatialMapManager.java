package cn.easyar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@cn.easyar.TypeId("C2A2A6989")
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class SparseSpatialMapManager extends cn.easyar.RefBase {
    protected SparseSpatialMapManager(long r1, cn.easyar.RefBase r3) {
            r0 = this;
            r0.<init>(r1, r3)
            return
    }

    @cn.easyar.MethodId("CFA8847B0")
    public static native cn.easyar.SparseSpatialMapManager create();

    @cn.easyar.MethodId("CE93DF2A9")
    public static native boolean isAvailable();

    @cn.easyar.MethodId("C913A4CB9")
    public native void clear();

    @cn.easyar.MethodId("C4740AE63")
    public native void host(cn.easyar.SparseSpatialMap r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, cn.easyar.Image r6, java.lang.Integer r7, cn.easyar.CallbackScheduler r8, cn.easyar.FunctorOfVoidFromBoolAndStringAndString r9);

    @cn.easyar.MethodId("C0CF67FC7")
    public native void load(cn.easyar.SparseSpatialMap r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.Integer r6, cn.easyar.CallbackScheduler r7, cn.easyar.FunctorOfVoidFromBoolAndString r8);
}
