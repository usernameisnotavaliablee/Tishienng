package cn.easyar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@cn.easyar.TypeId("C3A2A6FB8")
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class PlaneData extends cn.easyar.RefBase {
    public PlaneData() {
            r3 = this;
            long r0 = _ctor()
            r2 = 0
            r3.<init>(r0, r2)
            return
    }

    protected PlaneData(long r1, cn.easyar.RefBase r3) {
            r0 = this;
            r0.<init>(r1, r3)
            return
    }

    @cn.easyar.MethodId("CD33483F0")
    private static native long _ctor();

    @cn.easyar.MethodId("C4C67A9C8")
    public native float getExtentX();

    @cn.easyar.MethodId("C55EC0927")
    public native float getExtentZ();

    @cn.easyar.MethodId("C0D696EDA")
    public native cn.easyar.Matrix44F getPose();

    @cn.easyar.MethodId("C394D4C59")
    public native int getType();
}
