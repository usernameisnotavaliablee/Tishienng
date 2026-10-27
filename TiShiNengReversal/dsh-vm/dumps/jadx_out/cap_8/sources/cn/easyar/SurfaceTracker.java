package cn.easyar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@cn.easyar.TypeId("C37C077C9")
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class SurfaceTracker extends cn.easyar.RefBase {
    protected SurfaceTracker(long r1, cn.easyar.RefBase r3) {
            r0 = this;
            r0.<init>(r1, r3)
            return
    }

    @cn.easyar.MethodId("CFA8847B0")
    public static native cn.easyar.SurfaceTracker create();

    @cn.easyar.MethodId("CE93DF2A9")
    public static native boolean isAvailable();

    @cn.easyar.MethodId("CCF4C4887")
    public native void alignTargetToCameraImagePoint(cn.easyar.Vec2F r1);

    @cn.easyar.MethodId("C5DE59913")
    public native int bufferRequirement();

    @cn.easyar.MethodId("C310FF200")
    public native void close();

    @cn.easyar.MethodId("CB6A3E444")
    public native cn.easyar.InputFrameSink inputFrameSink();

    @cn.easyar.MethodId("C5868A777")
    public native cn.easyar.OutputFrameSource outputFrameSource();

    @cn.easyar.MethodId("CCCED28C6")
    public native boolean start();

    @cn.easyar.MethodId("C6C45CB72")
    public native void stop();
}
