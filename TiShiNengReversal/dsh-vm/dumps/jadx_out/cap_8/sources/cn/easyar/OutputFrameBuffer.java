package cn.easyar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@cn.easyar.TypeId("CCBF9567D")
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class OutputFrameBuffer extends cn.easyar.RefBase {
    protected OutputFrameBuffer(long r1, cn.easyar.RefBase r3) {
            r0 = this;
            r0.<init>(r1, r3)
            return
    }

    @cn.easyar.MethodId("CFA8847B0")
    public static native cn.easyar.OutputFrameBuffer create();

    @cn.easyar.MethodId("C5DE59913")
    public native int bufferRequirement();

    @cn.easyar.MethodId("CC96C6D5B")
    public native cn.easyar.OutputFrameSink input();

    @cn.easyar.MethodId("C6210C0BF")
    public native void pause();

    @cn.easyar.MethodId("C1CE8980E")
    public native cn.easyar.OutputFrame peek();

    @cn.easyar.MethodId("CA83A3132")
    public native void resume();

    @cn.easyar.MethodId("CCE9B14BA")
    public native cn.easyar.SignalSource signalOutput();
}
