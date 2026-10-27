package cn.easyar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@cn.easyar.TypeId("C91DC6AEC")
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class FeedbackFrameFork extends cn.easyar.RefBase {
    protected FeedbackFrameFork(long r1, cn.easyar.RefBase r3) {
            r0 = this;
            r0.<init>(r1, r3)
            return
    }

    @cn.easyar.MethodId("CFA8847B0")
    public static native cn.easyar.FeedbackFrameFork create(int r0);

    @cn.easyar.MethodId("CC96C6D5B")
    public native cn.easyar.FeedbackFrameSink input();

    @cn.easyar.MethodId("CE0EE8BB5")
    public native cn.easyar.FeedbackFrameSource output(int r1);

    @cn.easyar.MethodId("C1856628F")
    public native int outputCount();
}
