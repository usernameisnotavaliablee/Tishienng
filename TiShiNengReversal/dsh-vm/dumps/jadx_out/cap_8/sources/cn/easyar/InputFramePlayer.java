package cn.easyar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@cn.easyar.TypeId("C163805D9")
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class InputFramePlayer extends cn.easyar.RefBase {
    protected InputFramePlayer(long r1, cn.easyar.RefBase r3) {
            r0 = this;
            r0.<init>(r1, r3)
            return
    }

    @cn.easyar.MethodId("CFA8847B0")
    public static native cn.easyar.InputFramePlayer create();

    @cn.easyar.MethodId("CCCE1F55E")
    public native double currentTime();

    @cn.easyar.MethodId("C6BEDFE53")
    public native int initalScreenRotation();

    @cn.easyar.MethodId("C3B43E764")
    public native boolean isCompleted();

    @cn.easyar.MethodId("CE0EE8BB5")
    public native cn.easyar.InputFrameSource output();

    @cn.easyar.MethodId("C6210C0BF")
    public native void pause();

    @cn.easyar.MethodId("CA83A3132")
    public native boolean resume();

    @cn.easyar.MethodId("CCCED28C6")
    public native boolean start(java.lang.String r1);

    @cn.easyar.MethodId("C6C45CB72")
    public native void stop();

    @cn.easyar.MethodId("C0697B6B5")
    public native double totalTime();
}
