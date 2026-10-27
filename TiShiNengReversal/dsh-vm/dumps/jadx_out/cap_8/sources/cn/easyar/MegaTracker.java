package cn.easyar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@cn.easyar.TypeId("C539B1D1D")
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class MegaTracker extends cn.easyar.RefBase {
    protected MegaTracker(long r1, cn.easyar.RefBase r3) {
            r0 = this;
            r0.<init>(r1, r3)
            return
    }

    @cn.easyar.MethodId("CFA8847B0")
    public static native cn.easyar.MegaTracker create(java.lang.String r0, java.lang.String r1, java.lang.String r2, java.lang.String r3);

    @cn.easyar.MethodId("CE93DF2A9")
    public static native boolean isAvailable();

    @cn.easyar.MethodId("C2FB61C05")
    public native cn.easyar.AccelerometerResultSink accelerometerResultSink();

    @cn.easyar.MethodId("C5DE59913")
    public native int bufferRequirement();

    @cn.easyar.MethodId("C310FF200")
    public native void close();

    @cn.easyar.MethodId("CB6A3E444")
    public native cn.easyar.InputFrameSink inputFrameSink();

    @cn.easyar.MethodId("CB25B2010")
    public native cn.easyar.LocationResultSink locationResultSink();

    @cn.easyar.MethodId("C5868A777")
    public native cn.easyar.OutputFrameSource outputFrameSource();

    @cn.easyar.MethodId("CAC35FF74")
    public native cn.easyar.ProximityLocationResultSink proximityLocationResultSink();

    @cn.easyar.MethodId("C01BE30BB")
    public native void reset();

    @cn.easyar.MethodId("C2F76A5F5")
    public native void setInputFrameSourceType(int r1);

    @cn.easyar.MethodId("C54585498")
    public native void setLocalizationCallback(cn.easyar.CallbackScheduler r1, cn.easyar.FunctorOfVoidFromMegaTrackerLocalizationResponse r2);

    @cn.easyar.MethodId("C50B01E06")
    public native void setRequestMessage(java.lang.String r1);

    @cn.easyar.MethodId("C8CB77031")
    public native void setRequestTimeParameters(java.lang.Integer r1, int r2);

    @cn.easyar.MethodId("C00AC221A")
    public native void setResultPoseType(boolean r1, boolean r2);

    @cn.easyar.MethodId("CCCED28C6")
    public native boolean start();

    @cn.easyar.MethodId("C6C45CB72")
    public native void stop();
}
