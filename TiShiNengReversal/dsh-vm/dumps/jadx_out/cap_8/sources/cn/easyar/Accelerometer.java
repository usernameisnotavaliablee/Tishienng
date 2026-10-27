package cn.easyar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@cn.easyar.TypeId("C814FB55D")
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class Accelerometer extends cn.easyar.RefBase {
    public Accelerometer() {
            r3 = this;
            long r0 = _ctor()
            r2 = 0
            r3.<init>(r0, r2)
            return
    }

    protected Accelerometer(long r1, cn.easyar.RefBase r3) {
            r0 = this;
            r0.<init>(r1, r3)
            return
    }

    @cn.easyar.MethodId("CD33483F0")
    private static native long _ctor();

    @cn.easyar.MethodId("C310FF200")
    public native void close();

    @cn.easyar.MethodId("C06C2D301")
    public native cn.easyar.AccelerometerResult getCurrentResult();

    @cn.easyar.MethodId("CE93DF2A9")
    public native boolean isAvailable();

    @cn.easyar.MethodId("C2348F998")
    public native boolean open();

    @cn.easyar.MethodId("C835F60A9")
    public native boolean openWithSamplingPeriod(int r1);

    @cn.easyar.MethodId("CE0EE8BB5")
    public native cn.easyar.AccelerometerResultSource output();
}
