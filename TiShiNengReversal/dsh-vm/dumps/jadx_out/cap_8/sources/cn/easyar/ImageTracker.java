package cn.easyar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@cn.easyar.TypeId("CD37F5BCC")
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ImageTracker extends cn.easyar.RefBase {
    protected ImageTracker(long r1, cn.easyar.RefBase r3) {
            r0 = this;
            r0.<init>(r1, r3)
            return
    }

    @cn.easyar.MethodId("CFA8847B0")
    public static native cn.easyar.ImageTracker create();

    @cn.easyar.MethodId("C03FD303A")
    public static native cn.easyar.ImageTracker createWithMode(int r0);

    @cn.easyar.MethodId("CE93DF2A9")
    public static native boolean isAvailable();

    @cn.easyar.MethodId("C5DE59913")
    public native int bufferRequirement();

    @cn.easyar.MethodId("C310FF200")
    public native void close();

    @cn.easyar.MethodId("C2E26952A")
    public native cn.easyar.FeedbackFrameSink feedbackFrameSink();

    @cn.easyar.MethodId("C2ECEE0D4")
    public native void loadTarget(cn.easyar.Target r1, cn.easyar.CallbackScheduler r2, cn.easyar.FunctorOfVoidFromTargetAndBool r3);

    @cn.easyar.MethodId("C5868A777")
    public native cn.easyar.OutputFrameSource outputFrameSource();

    @cn.easyar.MethodId("C5DF178DB")
    public native void setResultPostProcessing(boolean r1, boolean r2);

    @cn.easyar.MethodId("C66ED6549")
    public native boolean setSimultaneousNum(int r1);

    @cn.easyar.MethodId("CAC18A1C4")
    public native int simultaneousNum();

    @cn.easyar.MethodId("CCCED28C6")
    public native boolean start();

    @cn.easyar.MethodId("C6C45CB72")
    public native void stop();

    @cn.easyar.MethodId("C26CAFB94")
    public native java.util.ArrayList<cn.easyar.Target> targets();

    @cn.easyar.MethodId("CC5040656")
    public native void unloadTarget(cn.easyar.Target r1, cn.easyar.CallbackScheduler r2, cn.easyar.FunctorOfVoidFromTargetAndBool r3);
}
