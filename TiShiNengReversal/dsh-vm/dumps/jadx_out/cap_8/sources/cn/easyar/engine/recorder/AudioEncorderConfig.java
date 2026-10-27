package cn.easyar.engine.recorder;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class AudioEncorderConfig {
    private int mBitRate;
    private int mChannel;
    private int mHz;

    public AudioEncorderConfig(int r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.mBitRate = r1
            r0.mChannel = r2
            r0.mHz = r3
            return
    }

    public int getBitRate() {
            r1 = this;
            int r0 = r1.mBitRate
            return r0
    }

    public int getChannel() {
            r1 = this;
            int r0 = r1.mChannel
            return r0
    }

    public int getSampleRate() {
            r1 = this;
            int r0 = r1.mHz
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "AudioEncorderConfig{mChannel="
            r0.append(r1)
            int r1 = r2.mChannel
            r0.append(r1)
            java.lang.String r1 = ", mHz="
            r0.append(r1)
            int r1 = r2.mHz
            r0.append(r1)
            java.lang.String r1 = ", mBitRate="
            r0.append(r1)
            int r1 = r2.mBitRate
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
