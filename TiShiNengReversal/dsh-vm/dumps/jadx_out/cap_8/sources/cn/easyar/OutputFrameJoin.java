package cn.easyar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@cn.easyar.TypeId("CE7D36DE6")
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class OutputFrameJoin extends cn.easyar.RefBase {
    protected OutputFrameJoin(long r1, cn.easyar.RefBase r3) {
            r0 = this;
            r0.<init>(r1, r3)
            return
    }

    @cn.easyar.MethodId("CFA8847B0")
    public static native cn.easyar.OutputFrameJoin create(int r0);

    @cn.easyar.MethodId("C599C2C88")
    public static native cn.easyar.OutputFrameJoin createWithJoiner(int r0, cn.easyar.FunctorOfOutputFrameFromListOfOutputFrame r1);

    @cn.easyar.MethodId("CC96C6D5B")
    public native cn.easyar.OutputFrameSink input(int r1);

    @cn.easyar.MethodId("CCE5F9BCF")
    public native int inputCount();

    @cn.easyar.MethodId("CE0EE8BB5")
    public native cn.easyar.OutputFrameSource output();
}
