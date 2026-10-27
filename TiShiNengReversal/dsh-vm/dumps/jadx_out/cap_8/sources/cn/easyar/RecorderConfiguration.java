package cn.easyar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@cn.easyar.TypeId("C7B4D5C9C")
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class RecorderConfiguration extends cn.easyar.RefBase {
    public RecorderConfiguration() {
            r3 = this;
            long r0 = _ctor()
            r2 = 0
            r3.<init>(r0, r2)
            return
    }

    protected RecorderConfiguration(long r1, cn.easyar.RefBase r3) {
            r0 = this;
            r0.<init>(r1, r3)
            return
    }

    @cn.easyar.MethodId("CD33483F0")
    private static native long _ctor();

    @cn.easyar.MethodId("CEA9D9CE0")
    public native void setAudioBitrate(int r1);

    @cn.easyar.MethodId("C12BD63E3")
    public native void setAudioSampleRate(int r1);

    @cn.easyar.MethodId("C1AE339B1")
    public native void setChannelCount(int r1);

    @cn.easyar.MethodId("C6DF14130")
    public native void setOutputFile(java.lang.String r1);

    @cn.easyar.MethodId("CC996899B")
    public native boolean setProfile(int r1);

    @cn.easyar.MethodId("C6B68105C")
    public native void setVideoBitrate(int r1);

    @cn.easyar.MethodId("CCFA93291")
    public native void setVideoOrientation(int r1);

    @cn.easyar.MethodId("C13427EFD")
    public native void setVideoSize(int r1);

    @cn.easyar.MethodId("C499ECB84")
    public native void setZoomMode(int r1);
}
