package cn.easyar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@cn.easyar.TypeId("CE9799336")
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class RealTimeCoordinateTransform extends cn.easyar.RefBase {
    public RealTimeCoordinateTransform() {
            r3 = this;
            long r0 = _ctor()
            r2 = 0
            r3.<init>(r0, r2)
            return
    }

    protected RealTimeCoordinateTransform(long r1, cn.easyar.RefBase r3) {
            r0 = this;
            r0.<init>(r1, r3)
            return
    }

    @cn.easyar.MethodId("CD33483F0")
    private static native long _ctor();

    @cn.easyar.MethodId("C6F79935C")
    public native int getBufferSize();

    @cn.easyar.MethodId("C949A799F")
    public native cn.easyar.Matrix44F getPoseInMap(double r1, int r3, cn.easyar.Matrix44F r4);

    @cn.easyar.MethodId("C7D763536")
    public native boolean insertData(double r1, cn.easyar.Matrix44F r3, cn.easyar.Matrix44F r4);

    @cn.easyar.MethodId("CB748CE17")
    public native void setBufferSize(int r1);
}
