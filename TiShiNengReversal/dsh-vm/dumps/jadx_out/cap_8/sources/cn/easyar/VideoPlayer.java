package cn.easyar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@cn.easyar.TypeId("CB14117C8")
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class VideoPlayer extends cn.easyar.RefBase {
    public VideoPlayer() {
            r3 = this;
            long r0 = _ctor()
            r2 = 0
            r3.<init>(r0, r2)
            return
    }

    protected VideoPlayer(long r1, cn.easyar.RefBase r3) {
            r0 = this;
            r0.<init>(r1, r3)
            return
    }

    @cn.easyar.MethodId("CD33483F0")
    private static native long _ctor();

    @cn.easyar.MethodId("CE93DF2A9")
    public static native boolean isAvailable();

    @cn.easyar.MethodId("C310FF200")
    public native void close();

    @cn.easyar.MethodId("CC48265F6")
    public native int currentPosition();

    @cn.easyar.MethodId("CCAA79AF4")
    public native int duration();

    @cn.easyar.MethodId("C8155C934")
    public native boolean isRenderTextureAvailable();

    @cn.easyar.MethodId("C2348F998")
    public native void open(java.lang.String r1, int r2, cn.easyar.CallbackScheduler r3, cn.easyar.FunctorOfVoidFromVideoStatus r4);

    @cn.easyar.MethodId("C6210C0BF")
    public native void pause();

    @cn.easyar.MethodId("CABA4CC9B")
    public native boolean play();

    @cn.easyar.MethodId("CCBD345D6")
    public native boolean seek(int r1);

    @cn.easyar.MethodId("C410CEEFD")
    public native void setRenderTexture(cn.easyar.TextureId r1);

    @cn.easyar.MethodId("CC213EC3E")
    public native void setVideoType(int r1);

    @cn.easyar.MethodId("CAA5D06BC")
    public native boolean setVolume(float r1);

    @cn.easyar.MethodId("CCCDCBE84")
    public native cn.easyar.Vec2I size();

    @cn.easyar.MethodId("C6C45CB72")
    public native void stop();

    @cn.easyar.MethodId("C14F3B6CB")
    public native void updateFrame();

    @cn.easyar.MethodId("C62D7A6B1")
    public native float volume();
}
