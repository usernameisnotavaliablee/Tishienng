package tv.danmaku.ijk.media.player;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class IjkMediaCodecInfo {
    public static final int RANK_ACCEPTABLE = 700;
    public static final int RANK_LAST_CHANCE = 600;
    public static final int RANK_MAX = 1000;
    public static final int RANK_NON_STANDARD = 100;
    public static final int RANK_NO_SENSE = 0;
    public static final int RANK_SECURE = 300;
    public static final int RANK_SOFTWARE = 200;
    public static final int RANK_TESTED = 800;
    private static final java.lang.String TAG = "IjkMediaCodecInfo";
    private static java.util.Map<java.lang.String, java.lang.Integer> sKnownCodecList;
    public android.media.MediaCodecInfo mCodecInfo;
    public java.lang.String mMimeType;
    public int mRank;

    public IjkMediaCodecInfo() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mRank = r0
            return
    }

    private static synchronized java.util.Map<java.lang.String, java.lang.Integer> getKnownCodecList() {
            r0 = 799(0x31f, float:1.12E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 200(0xc8, float:2.8E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 800(0x320, float:1.121E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Class<tv.danmaku.ijk.media.player.IjkMediaCodecInfo> r3 = tv.danmaku.ijk.media.player.IjkMediaCodecInfo.class
            monitor-enter(r3)
            java.util.Map<java.lang.String, java.lang.Integer> r4 = tv.danmaku.ijk.media.player.IjkMediaCodecInfo.sKnownCodecList     // Catch: java.lang.Throwable -> L16a
            if (r4 == 0) goto L1b
            monitor-exit(r3)
            return r4
        L1b:
            java.util.TreeMap r4 = new java.util.TreeMap     // Catch: java.lang.Throwable -> L16a
            java.util.Comparator r5 = java.lang.String.CASE_INSENSITIVE_ORDER     // Catch: java.lang.Throwable -> L16a
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L16a
            tv.danmaku.ijk.media.player.IjkMediaCodecInfo.sKnownCodecList = r4     // Catch: java.lang.Throwable -> L16a
            java.lang.String r5 = "OMX.Nvidia.h264.decode"
            r4.put(r5, r2)     // Catch: java.lang.Throwable -> L16a
            java.util.Map<java.lang.String, java.lang.Integer> r4 = tv.danmaku.ijk.media.player.IjkMediaCodecInfo.sKnownCodecList     // Catch: java.lang.Throwable -> L16a
            java.lang.String r5 = "OMX.Nvidia.h264.decode.secure"
            r6 = 300(0x12c, float:4.2E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L16a
            r4.put(r5, r6)     // Catch: java.lang.Throwable -> L16a
            java.util.Map<java.lang.String, java.lang.Integer> r4 = tv.danmaku.ijk.media.player.IjkMediaCodecInfo.sKnownCodecList     // Catch: java.lang.Throwable -> L16a
            java.lang.String r5 = "OMX.Intel.hw_vd.h264"
            r6 = 801(0x321, float:1.122E-42)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L16a
            r4.put(r5, r6)     // Catch: java.lang.Throwable -> L16a
            java.util.Map<java.lang.String, java.lang.Integer> r4 = tv.danmaku.ijk.media.player.IjkMediaCodecInfo.sKnownCodecList     // Catch: java.lang.Throwable -> L16a
            java.lang.String r5 = "OMX.Intel.VideoDecoder.AVC"
            r4.put(r5, r2)     // Catch: java.lang.Throwable -> L16a
            java.util.Map<java.lang.String, java.lang.Integer> r4 = tv.danmaku.ijk.media.player.IjkMediaCodecInfo.sKnownCodecList     // Catch: java.lang.Throwable -> L16a
            java.lang.String r5 = "OMX.qcom.video.decoder.avc"
            r4.put(r5, r2)     // Catch: java.lang.Throwable -> L16a
            java.util.Map<java.lang.String, java.lang.Integer> r4 = tv.danmaku.ijk.media.player.IjkMediaCodecInfo.sKnownCodecList     // Catch: java.lang.Throwable -> L16a
            java.lang.String r5 = "OMX.ittiam.video.decoder.avc"
            r6 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L16a
            r4.put(r5, r6)     // Catch: java.lang.Throwable -> L16a
            java.util.Map<java.lang.String, java.lang.Integer> r4 = tv.danmaku.ijk.media.player.IjkMediaCodecInfo.sKnownCodecList     // Catch: java.lang.Throwable -> L16a
            java.lang.String r5 = "OMX.SEC.avc.dec"
            r4.put(r5, r2)     // Catch: java.lang.Throwable -> L16a
            java.util.Map<java.lang.String, java.lang.Integer> r4 = tv.danmaku.ijk.media.player.IjkMediaCodecInfo.sKnownCodecList     // Catch: java.lang.Throwable -> L16a
            java.lang.String r5 = "OMX.SEC.AVC.Decoder"
            r4.put(r5, r0)     // Catch: java.lang.Throwable -> L16a
            java.util.Map<java.lang.String, java.lang.Integer> r4 = tv.danmaku.ijk.media.player.IjkMediaCodecInfo.sKnownCodecList     // Catch: java.lang.Throwable -> L16a
            java.lang.String r5 = "OMX.SEC.avcdec"
            r6 = 798(0x31e, float:1.118E-42)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L16a
            r4.put(r5, r6)     // Catch: java.lang.Throwable -> L16a
            java.util.Map<java.lang.String, java.lang.Integer> r4 = tv.danmaku.ijk.media.player.IjkMediaCodecInfo.sKnownCodecList     // Catch: java.lang.Throwable -> L16a
            java.lang.String r5 = "OMX.SEC.avc.sw.dec"
            r4.put(r5, r1)     // Catch: java.lang.Throwable -> L16a
            java.util.Map<java.lang.String, java.lang.Integer> r4 = tv.danmaku.ijk.media.player.IjkMediaCodecInfo.sKnownCodecList     // Catch: java.lang.Throwable -> L16a
            java.lang.String r5 = "OMX.Exynos.avc.dec"
            r4.put(r5, r2)     // Catch: java.lang.Throwable -> L16a
            java.util.Map<java.lang.String, java.lang.Integer> r4 = tv.danmaku.ijk.media.player.IjkMediaCodecInfo.sKnownCodecList     // Catch: java.lang.Throwable -> L16a
            java.lang.String r5 = "OMX.Exynos.AVC.Decoder"
            r4.put(r5, r0)     // Catch: java.lang.Throwable -> L16a
            java.util.Map<java.lang.String, java.lang.Integer> r0 = tv.danmaku.ijk.media.player.IjkMediaCodecInfo.sKnownCodecList     // Catch: java.lang.Throwable -> L16a
            java.lang.String r4 = "OMX.k3.video.decoder.avc"
            r0.put(r4, r2)     // Catch: java.lang.Throwable -> L16a
            java.util.Map<java.lang.String, java.lang.Integer> r0 = tv.danmaku.ijk.media.player.IjkMediaCodecInfo.sKnownCodecList     // Catch: java.lang.Throwable -> L16a
            java.lang.String r4 = "OMX.IMG.MSVDX.Decoder.AVC"
            r0.put(r4, r2)     // Catch: java.lang.Throwable -> L16a
            java.util.Map<java.lang.String, java.lang.Integer> r0 = tv.danmaku.ijk.media.player.IjkMediaCodecInfo.sKnownCodecList     // Catch: java.lang.Throwable -> L16a
            java.lang.String r4 = "OMX.TI.DUCATI1.VIDEO.DECODER"
            r0.put(r4, r2)     // Catch: java.lang.Throwable -> L16a
            java.util.Map<java.lang.String, java.lang.Integer> r0 = tv.danmaku.ijk.media.player.IjkMediaCodecInfo.sKnownCodecList     // Catch: java.lang.Throwable -> L16a
            java.lang.String r4 = "OMX.rk.video_decoder.avc"
            r0.put(r4, r2)     // Catch: java.lang.Throwable -> L16a
            java.util.Map<java.lang.String, java.lang.Integer> r0 = tv.danmaku.ijk.media.player.IjkMediaCodecInfo.sKnownCodecList     // Catch: java.lang.Throwable -> L16a
            java.lang.String r4 = "OMX.amlogic.avc.decoder.awesome"
            r0.put(r4, r2)     // Catch: java.lang.Throwable -> L16a
            java.util.Map<java.lang.String, java.lang.Integer> r0 = tv.danmaku.ijk.media.player.IjkMediaCodecInfo.sKnownCodecList     // Catch: java.lang.Throwable -> L16a
            java.lang.String r4 = "OMX.MARVELL.VIDEO.HW.CODA7542DECODER"
            r0.put(r4, r2)     // Catch: java.lang.Throwable -> L16a
            java.util.Map<java.lang.String, java.lang.Integer> r0 = tv.danmaku.ijk.media.player.IjkMediaCodecInfo.sKnownCodecList     // Catch: java.lang.Throwable -> L16a
            java.lang.String r2 = "OMX.MARVELL.VIDEO.H264DECODER"
            r0.put(r2, r1)     // Catch: java.lang.Throwable -> L16a
            java.util.Map<java.lang.String, java.lang.Integer> r0 = tv.danmaku.ijk.media.player.IjkMediaCodecInfo.sKnownCodecList     // Catch: java.lang.Throwable -> L16a
            java.lang.String r2 = "OMX.Action.Video.Decoder"
            r0.remove(r2)     // Catch: java.lang.Throwable -> L16a
            java.util.Map<java.lang.String, java.lang.Integer> r0 = tv.danmaku.ijk.media.player.IjkMediaCodecInfo.sKnownCodecList     // Catch: java.lang.Throwable -> L16a
            java.lang.String r2 = "OMX.allwinner.video.decoder.avc"
            r0.remove(r2)     // Catch: java.lang.Throwable -> L16a
            java.util.Map<java.lang.String, java.lang.Integer> r0 = tv.danmaku.ijk.media.player.IjkMediaCodecInfo.sKnownCodecList     // Catch: java.lang.Throwable -> L16a
            java.lang.String r2 = "OMX.BRCM.vc4.decoder.avc"
            r0.remove(r2)     // Catch: java.lang.Throwable -> L16a
            java.util.Map<java.lang.String, java.lang.Integer> r0 = tv.danmaku.ijk.media.player.IjkMediaCodecInfo.sKnownCodecList     // Catch: java.lang.Throwable -> L16a
            java.lang.String r2 = "OMX.brcm.video.h264.hw.decoder"
            r0.remove(r2)     // Catch: java.lang.Throwable -> L16a
            java.util.Map<java.lang.String, java.lang.Integer> r0 = tv.danmaku.ijk.media.player.IjkMediaCodecInfo.sKnownCodecList     // Catch: java.lang.Throwable -> L16a
            java.lang.String r2 = "OMX.brcm.video.h264.decoder"
            r0.remove(r2)     // Catch: java.lang.Throwable -> L16a
            java.util.Map<java.lang.String, java.lang.Integer> r0 = tv.danmaku.ijk.media.player.IjkMediaCodecInfo.sKnownCodecList     // Catch: java.lang.Throwable -> L16a
            java.lang.String r2 = "OMX.cosmo.video.decoder.avc"
            r0.remove(r2)     // Catch: java.lang.Throwable -> L16a
            java.util.Map<java.lang.String, java.lang.Integer> r0 = tv.danmaku.ijk.media.player.IjkMediaCodecInfo.sKnownCodecList     // Catch: java.lang.Throwable -> L16a
            java.lang.String r2 = "OMX.duos.h264.decoder"
            r0.remove(r2)     // Catch: java.lang.Throwable -> L16a
            java.util.Map<java.lang.String, java.lang.Integer> r0 = tv.danmaku.ijk.media.player.IjkMediaCodecInfo.sKnownCodecList     // Catch: java.lang.Throwable -> L16a
            java.lang.String r2 = "OMX.hantro.81x0.video.decoder"
            r0.remove(r2)     // Catch: java.lang.Throwable -> L16a
            java.util.Map<java.lang.String, java.lang.Integer> r0 = tv.danmaku.ijk.media.player.IjkMediaCodecInfo.sKnownCodecList     // Catch: java.lang.Throwable -> L16a
            java.lang.String r2 = "OMX.hantro.G1.video.decoder"
            r0.remove(r2)     // Catch: java.lang.Throwable -> L16a
            java.util.Map<java.lang.String, java.lang.Integer> r0 = tv.danmaku.ijk.media.player.IjkMediaCodecInfo.sKnownCodecList     // Catch: java.lang.Throwable -> L16a
            java.lang.String r2 = "OMX.hisi.video.decoder"
            r0.remove(r2)     // Catch: java.lang.Throwable -> L16a
            java.util.Map<java.lang.String, java.lang.Integer> r0 = tv.danmaku.ijk.media.player.IjkMediaCodecInfo.sKnownCodecList     // Catch: java.lang.Throwable -> L16a
            java.lang.String r2 = "OMX.LG.decoder.video.avc"
            r0.remove(r2)     // Catch: java.lang.Throwable -> L16a
            java.util.Map<java.lang.String, java.lang.Integer> r0 = tv.danmaku.ijk.media.player.IjkMediaCodecInfo.sKnownCodecList     // Catch: java.lang.Throwable -> L16a
            java.lang.String r2 = "OMX.MS.AVC.Decoder"
            r0.remove(r2)     // Catch: java.lang.Throwable -> L16a
            java.util.Map<java.lang.String, java.lang.Integer> r0 = tv.danmaku.ijk.media.player.IjkMediaCodecInfo.sKnownCodecList     // Catch: java.lang.Throwable -> L16a
            java.lang.String r2 = "OMX.RENESAS.VIDEO.DECODER.H264"
            r0.remove(r2)     // Catch: java.lang.Throwable -> L16a
            java.util.Map<java.lang.String, java.lang.Integer> r0 = tv.danmaku.ijk.media.player.IjkMediaCodecInfo.sKnownCodecList     // Catch: java.lang.Throwable -> L16a
            java.lang.String r2 = "OMX.RTK.video.decoder"
            r0.remove(r2)     // Catch: java.lang.Throwable -> L16a
            java.util.Map<java.lang.String, java.lang.Integer> r0 = tv.danmaku.ijk.media.player.IjkMediaCodecInfo.sKnownCodecList     // Catch: java.lang.Throwable -> L16a
            java.lang.String r2 = "OMX.sprd.h264.decoder"
            r0.remove(r2)     // Catch: java.lang.Throwable -> L16a
            java.util.Map<java.lang.String, java.lang.Integer> r0 = tv.danmaku.ijk.media.player.IjkMediaCodecInfo.sKnownCodecList     // Catch: java.lang.Throwable -> L16a
            java.lang.String r2 = "OMX.ST.VFM.H264Dec"
            r0.remove(r2)     // Catch: java.lang.Throwable -> L16a
            java.util.Map<java.lang.String, java.lang.Integer> r0 = tv.danmaku.ijk.media.player.IjkMediaCodecInfo.sKnownCodecList     // Catch: java.lang.Throwable -> L16a
            java.lang.String r2 = "OMX.vpu.video_decoder.avc"
            r0.remove(r2)     // Catch: java.lang.Throwable -> L16a
            java.util.Map<java.lang.String, java.lang.Integer> r0 = tv.danmaku.ijk.media.player.IjkMediaCodecInfo.sKnownCodecList     // Catch: java.lang.Throwable -> L16a
            java.lang.String r2 = "OMX.WMT.decoder.avc"
            r0.remove(r2)     // Catch: java.lang.Throwable -> L16a
            java.util.Map<java.lang.String, java.lang.Integer> r0 = tv.danmaku.ijk.media.player.IjkMediaCodecInfo.sKnownCodecList     // Catch: java.lang.Throwable -> L16a
            java.lang.String r2 = "OMX.bluestacks.hw.decoder"
            r0.remove(r2)     // Catch: java.lang.Throwable -> L16a
            java.util.Map<java.lang.String, java.lang.Integer> r0 = tv.danmaku.ijk.media.player.IjkMediaCodecInfo.sKnownCodecList     // Catch: java.lang.Throwable -> L16a
            java.lang.String r2 = "OMX.google.h264.decoder"
            r0.put(r2, r1)     // Catch: java.lang.Throwable -> L16a
            java.util.Map<java.lang.String, java.lang.Integer> r0 = tv.danmaku.ijk.media.player.IjkMediaCodecInfo.sKnownCodecList     // Catch: java.lang.Throwable -> L16a
            java.lang.String r2 = "OMX.google.h264.lc.decoder"
            r0.put(r2, r1)     // Catch: java.lang.Throwable -> L16a
            java.util.Map<java.lang.String, java.lang.Integer> r0 = tv.danmaku.ijk.media.player.IjkMediaCodecInfo.sKnownCodecList     // Catch: java.lang.Throwable -> L16a
            java.lang.String r2 = "OMX.k3.ffmpeg.decoder"
            r0.put(r2, r1)     // Catch: java.lang.Throwable -> L16a
            java.util.Map<java.lang.String, java.lang.Integer> r0 = tv.danmaku.ijk.media.player.IjkMediaCodecInfo.sKnownCodecList     // Catch: java.lang.Throwable -> L16a
            java.lang.String r2 = "OMX.ffmpeg.video.decoder"
            r0.put(r2, r1)     // Catch: java.lang.Throwable -> L16a
            java.util.Map<java.lang.String, java.lang.Integer> r0 = tv.danmaku.ijk.media.player.IjkMediaCodecInfo.sKnownCodecList     // Catch: java.lang.Throwable -> L16a
            java.lang.String r2 = "OMX.sprd.soft.h264.decoder"
            r0.put(r2, r1)     // Catch: java.lang.Throwable -> L16a
            java.util.Map<java.lang.String, java.lang.Integer> r0 = tv.danmaku.ijk.media.player.IjkMediaCodecInfo.sKnownCodecList     // Catch: java.lang.Throwable -> L16a
            monitor-exit(r3)
            return r0
        L16a:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L16a
            throw r0
    }

    public static java.lang.String getLevelName(int r1) {
            r0 = 1
            if (r1 == r0) goto L3c
            r0 = 2
            if (r1 == r0) goto L39
            switch(r1) {
                case 4: goto L36;
                case 8: goto L33;
                case 16: goto L30;
                case 32: goto L2d;
                case 64: goto L2a;
                case 128: goto L27;
                case 256: goto L24;
                case 512: goto L21;
                case 1024: goto L1e;
                case 2048: goto L1b;
                case 4096: goto L18;
                case 8192: goto L15;
                case 16384: goto L12;
                case 32768: goto Lf;
                case 65536: goto Lc;
                default: goto L9;
            }
        L9:
            java.lang.String r1 = "0"
            return r1
        Lc:
            java.lang.String r1 = "52"
            return r1
        Lf:
            java.lang.String r1 = "51"
            return r1
        L12:
            java.lang.String r1 = "5"
            return r1
        L15:
            java.lang.String r1 = "42"
            return r1
        L18:
            java.lang.String r1 = "41"
            return r1
        L1b:
            java.lang.String r1 = "4"
            return r1
        L1e:
            java.lang.String r1 = "32"
            return r1
        L21:
            java.lang.String r1 = "31"
            return r1
        L24:
            java.lang.String r1 = "3"
            return r1
        L27:
            java.lang.String r1 = "22"
            return r1
        L2a:
            java.lang.String r1 = "21"
            return r1
        L2d:
            java.lang.String r1 = "2"
            return r1
        L30:
            java.lang.String r1 = "13"
            return r1
        L33:
            java.lang.String r1 = "12"
            return r1
        L36:
            java.lang.String r1 = "11"
            return r1
        L39:
            java.lang.String r1 = "1b"
            return r1
        L3c:
            java.lang.String r1 = "1"
            return r1
    }

    public static java.lang.String getProfileLevelName(int r5, int r6) {
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = getProfileName(r5)
            java.lang.String r2 = getLevelName(r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r1
            r1 = 1
            r3[r1] = r2
            r1 = 2
            r3[r1] = r5
            r5 = 3
            r3[r5] = r6
            java.lang.String r5 = " %s Profile Level %s (%d,%d)"
            java.lang.String r5 = java.lang.String.format(r0, r5, r3)
            return r5
    }

    public static java.lang.String getProfileName(int r1) {
            r0 = 1
            if (r1 == r0) goto L2e
            r0 = 2
            if (r1 == r0) goto L2b
            r0 = 4
            if (r1 == r0) goto L28
            r0 = 8
            if (r1 == r0) goto L25
            r0 = 16
            if (r1 == r0) goto L22
            r0 = 32
            if (r1 == r0) goto L1f
            r0 = 64
            if (r1 == r0) goto L1c
            java.lang.String r1 = "Unknown"
            return r1
        L1c:
            java.lang.String r1 = "High444"
            return r1
        L1f:
            java.lang.String r1 = "High422"
            return r1
        L22:
            java.lang.String r1 = "High10"
            return r1
        L25:
            java.lang.String r1 = "High"
            return r1
        L28:
            java.lang.String r1 = "Extends"
            return r1
        L2b:
            java.lang.String r1 = "Main"
            return r1
        L2e:
            java.lang.String r1 = "Baseline"
            return r1
    }

    @android.annotation.TargetApi(16)
    public static tv.danmaku.ijk.media.player.IjkMediaCodecInfo setupCandidate(android.media.MediaCodecInfo r3, java.lang.String r4) {
            r0 = 0
            if (r3 == 0) goto L8c
            java.lang.String r1 = r3.getName()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto Le
            return r0
        Le:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r1.toLowerCase(r0)
            java.lang.String r1 = "omx."
            boolean r1 = r0.startsWith(r1)
            if (r1 != 0) goto L1f
            r0 = 100
            goto L80
        L1f:
            java.lang.String r1 = "omx.pv"
            boolean r1 = r0.startsWith(r1)
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 == 0) goto L2c
        L29:
            r0 = 200(0xc8, float:2.8E-43)
            goto L80
        L2c:
            java.lang.String r1 = "omx.google."
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L35
            goto L29
        L35:
            java.lang.String r1 = "omx.ffmpeg."
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L3e
            goto L29
        L3e:
            java.lang.String r1 = "omx.k3.ffmpeg."
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L47
            goto L29
        L47:
            java.lang.String r1 = "omx.avcodec."
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L50
            goto L29
        L50:
            java.lang.String r1 = "omx.ittiam."
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L5a
            r0 = 0
            goto L80
        L5a:
            java.lang.String r1 = "omx.mtk."
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L65
            r0 = 800(0x320, float:1.121E-42)
            goto L80
        L65:
            java.util.Map r1 = getKnownCodecList()
            java.lang.Object r0 = r1.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L76
            int r0 = r0.intValue()
            goto L80
        L76:
            r0 = 600(0x258, float:8.41E-43)
            android.media.MediaCodecInfo$CodecCapabilities r1 = r3.getCapabilitiesForType(r4)     // Catch: java.lang.Throwable -> L80
            if (r1 == 0) goto L80
            r0 = 700(0x2bc, float:9.81E-43)
        L80:
            tv.danmaku.ijk.media.player.IjkMediaCodecInfo r1 = new tv.danmaku.ijk.media.player.IjkMediaCodecInfo
            r1.<init>()
            r1.mCodecInfo = r3
            r1.mRank = r0
            r1.mMimeType = r4
            return r1
        L8c:
            return r0
    }

    @android.annotation.TargetApi(16)
    public void dumpProfileLevels(java.lang.String r8) {
            r7 = this;
            android.media.MediaCodecInfo r0 = r7.mCodecInfo     // Catch: java.lang.Throwable -> L39
            android.media.MediaCodecInfo$CodecCapabilities r8 = r0.getCapabilitiesForType(r8)     // Catch: java.lang.Throwable -> L39
            r0 = 0
            if (r8 == 0) goto L27
            android.media.MediaCodecInfo$CodecProfileLevel[] r8 = r8.profileLevels     // Catch: java.lang.Throwable -> L39
            if (r8 == 0) goto L27
            int r1 = r8.length     // Catch: java.lang.Throwable -> L39
            r2 = 0
            r3 = 0
            r4 = 0
        L11:
            if (r2 >= r1) goto L29
            r5 = r8[r2]     // Catch: java.lang.Throwable -> L39
            if (r5 != 0) goto L18
            goto L24
        L18:
            int r6 = r5.profile     // Catch: java.lang.Throwable -> L39
            int r3 = java.lang.Math.max(r3, r6)     // Catch: java.lang.Throwable -> L39
            int r5 = r5.level     // Catch: java.lang.Throwable -> L39
            int r4 = java.lang.Math.max(r4, r5)     // Catch: java.lang.Throwable -> L39
        L24:
            int r2 = r2 + 1
            goto L11
        L27:
            r3 = 0
            r4 = 0
        L29:
            java.util.Locale r8 = java.util.Locale.US     // Catch: java.lang.Throwable -> L39
            java.lang.String r1 = "%s"
            java.lang.String r2 = getProfileLevelName(r3, r4)     // Catch: java.lang.Throwable -> L39
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L39
            r3[r0] = r2     // Catch: java.lang.Throwable -> L39
            java.lang.String.format(r8, r1, r3)     // Catch: java.lang.Throwable -> L39
        L39:
            return
    }
}
