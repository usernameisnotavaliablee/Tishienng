package cn.easyar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@cn.easyar.TypeId("CEAB49599")
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class SparseSpatialMapResult extends cn.easyar.o {
    protected SparseSpatialMapResult(long r1, cn.easyar.RefBase r3) {
            r0 = this;
            r0.<init>(r1, r3)
            return
    }

    @cn.easyar.MethodId("C6A42CF45")
    public native java.lang.String getLocalizationMapID();

    @cn.easyar.MethodId("CD8CE3A28")
    public native boolean getLocalizationStatus();

    @cn.easyar.MethodId("CFC8BEB83")
    public native cn.easyar.Matrix44F getMapPose();

    @cn.easyar.MethodId("C8273C718")
    public native int getMotionTrackingStatus();

    @cn.easyar.MethodId("CD3939F15")
    public native cn.easyar.Matrix44F getVioPose();
}
