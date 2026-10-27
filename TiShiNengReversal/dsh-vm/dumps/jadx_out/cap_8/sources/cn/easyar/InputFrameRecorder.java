package cn.easyar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@cn.easyar.TypeId("C7D6F4831")
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class InputFrameRecorder extends cn.easyar.RefBase {
    protected InputFrameRecorder(long r1, cn.easyar.RefBase r3) {
            r0 = this;
            r0.<init>(r1, r3)
            return
    }

    @cn.easyar.MethodId("CFA8847B0")
    public static native cn.easyar.InputFrameRecorder create();

    @cn.easyar.MethodId("C5DE59913")
    public native int bufferRequirement();

    @cn.easyar.MethodId("CC96C6D5B")
    public native cn.easyar.InputFrameSink input();

    @cn.easyar.MethodId("CE0EE8BB5")
    public native cn.easyar.InputFrameSource output();

    @cn.easyar.MethodId("CCCED28C6")
    public native boolean start(java.lang.String r1, int r2);

    @cn.easyar.MethodId("C6C45CB72")
    public native void stop();
}
