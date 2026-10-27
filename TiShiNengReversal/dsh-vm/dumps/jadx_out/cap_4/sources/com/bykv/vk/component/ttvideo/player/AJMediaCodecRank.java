package com.bykv.vk.component.ttvideo.player;

@android.annotation.TargetApi(16)
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class AJMediaCodecRank {
    public static final int RANK_ACCEPTABLE = 70;
    public static final int RANK_IMPL_AMBIGUOUS = 40;
    public static final int RANK_NO_CAPS = 60;
    public static final int RANK_SOFTWARE = 20;
    public static final int RANK_TESTED = 100;
    private static final java.lang.String TAG = "AJMediaCodecRank";
    private static java.util.Map<java.lang.String, java.lang.Integer> mTestHWCodecs;
    public java.lang.String mCodecType;
    public android.media.MediaCodecInfo mMediaCodecInfo;
    public int mRank;

    public AJMediaCodecRank() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mRank = r0
            return
    }

    private static java.util.Map<java.lang.String, java.lang.Integer> getTestHWcodecs() {
            r0 = 40
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 99
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 20
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 100
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.util.Map<java.lang.String, java.lang.Integer> r4 = com.bykv.vk.component.ttvideo.player.AJMediaCodecRank.mTestHWCodecs
            if (r4 == 0) goto L1d
            return r4
        L1d:
            java.util.TreeMap r4 = new java.util.TreeMap
            java.util.Comparator r5 = java.lang.String.CASE_INSENSITIVE_ORDER
            r4.<init>(r5)
            com.bykv.vk.component.ttvideo.player.AJMediaCodecRank.mTestHWCodecs = r4
            java.lang.String r5 = "OMX.qcom.video.decoder.avc"
            r4.put(r5, r3)
            java.util.Map<java.lang.String, java.lang.Integer> r4 = com.bykv.vk.component.ttvideo.player.AJMediaCodecRank.mTestHWCodecs
            java.lang.String r5 = "OMX.qcom.video.decoder.hevc"
            r4.put(r5, r3)
            java.util.Map<java.lang.String, java.lang.Integer> r4 = com.bykv.vk.component.ttvideo.player.AJMediaCodecRank.mTestHWCodecs
            java.lang.String r5 = "OMX.qcom.video.decoder.hevcswvdec"
            r4.put(r5, r2)
            java.util.Map<java.lang.String, java.lang.Integer> r4 = com.bykv.vk.component.ttvideo.player.AJMediaCodecRank.mTestHWCodecs
            java.lang.String r5 = "OMX.MTK.VIDEO.DECODER.HEVC"
            r4.put(r5, r3)
            java.util.Map<java.lang.String, java.lang.Integer> r4 = com.bykv.vk.component.ttvideo.player.AJMediaCodecRank.mTestHWCodecs
            java.lang.String r5 = "OMX.MTK.VIDEO.DECODER.AVC"
            r4.put(r5, r3)
            java.util.Map<java.lang.String, java.lang.Integer> r4 = com.bykv.vk.component.ttvideo.player.AJMediaCodecRank.mTestHWCodecs
            java.lang.String r5 = "OMX.Nvidia.h264.decode"
            r4.put(r5, r3)
            java.util.Map<java.lang.String, java.lang.Integer> r4 = com.bykv.vk.component.ttvideo.player.AJMediaCodecRank.mTestHWCodecs
            java.lang.String r5 = "OMX.Intel.hw_vd.h264"
            r4.put(r5, r3)
            java.util.Map<java.lang.String, java.lang.Integer> r4 = com.bykv.vk.component.ttvideo.player.AJMediaCodecRank.mTestHWCodecs
            java.lang.String r5 = "OMX.Intel.VideoDecoder.AVC"
            r4.put(r5, r1)
            java.util.Map<java.lang.String, java.lang.Integer> r4 = com.bykv.vk.component.ttvideo.player.AJMediaCodecRank.mTestHWCodecs
            java.lang.String r5 = "OMX.SEC.avc.dec"
            r4.put(r5, r3)
            java.util.Map<java.lang.String, java.lang.Integer> r4 = com.bykv.vk.component.ttvideo.player.AJMediaCodecRank.mTestHWCodecs
            java.lang.String r5 = "OMX.SEC.AVC.Decoder"
            r4.put(r5, r1)
            java.util.Map<java.lang.String, java.lang.Integer> r4 = com.bykv.vk.component.ttvideo.player.AJMediaCodecRank.mTestHWCodecs
            r5 = 98
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "OMX.SEC.avcdec"
            r4.put(r6, r5)
            java.util.Map<java.lang.String, java.lang.Integer> r4 = com.bykv.vk.component.ttvideo.player.AJMediaCodecRank.mTestHWCodecs
            java.lang.String r5 = "OMX.SEC.avc.sw.dec"
            r4.put(r5, r2)
            java.util.Map<java.lang.String, java.lang.Integer> r4 = com.bykv.vk.component.ttvideo.player.AJMediaCodecRank.mTestHWCodecs
            java.lang.String r5 = "OMX.SEC.hevc.sw.dec"
            r4.put(r5, r2)
            java.util.Map<java.lang.String, java.lang.Integer> r4 = com.bykv.vk.component.ttvideo.player.AJMediaCodecRank.mTestHWCodecs
            java.lang.String r5 = "OMX.Exynos.avc.dec"
            r4.put(r5, r3)
            java.util.Map<java.lang.String, java.lang.Integer> r4 = com.bykv.vk.component.ttvideo.player.AJMediaCodecRank.mTestHWCodecs
            java.lang.String r5 = "OMX.Exynos.AVC.Decoder"
            r4.put(r5, r1)
            java.util.Map<java.lang.String, java.lang.Integer> r1 = com.bykv.vk.component.ttvideo.player.AJMediaCodecRank.mTestHWCodecs
            java.lang.String r4 = "OMX.TI.DUCATI1.VIDEO.DECODER"
            r1.put(r4, r3)
            java.util.Map<java.lang.String, java.lang.Integer> r1 = com.bykv.vk.component.ttvideo.player.AJMediaCodecRank.mTestHWCodecs
            java.lang.String r4 = "OMX.rk.video_decoder.avc"
            r1.put(r4, r3)
            java.util.Map<java.lang.String, java.lang.Integer> r1 = com.bykv.vk.component.ttvideo.player.AJMediaCodecRank.mTestHWCodecs
            java.lang.String r4 = "OMX.amlogic.avc.decoder.awesome"
            r1.put(r4, r3)
            java.util.Map<java.lang.String, java.lang.Integer> r1 = com.bykv.vk.component.ttvideo.player.AJMediaCodecRank.mTestHWCodecs
            java.lang.String r4 = "OMX.MARVELL.VIDEO.HW.CODA7542DECODER"
            r1.put(r4, r3)
            java.util.Map<java.lang.String, java.lang.Integer> r1 = com.bykv.vk.component.ttvideo.player.AJMediaCodecRank.mTestHWCodecs
            java.lang.String r4 = "OMX.brcm.video.h264.hw.decoder"
            r1.put(r4, r0)
            java.util.Map<java.lang.String, java.lang.Integer> r1 = com.bykv.vk.component.ttvideo.player.AJMediaCodecRank.mTestHWCodecs
            java.lang.String r4 = "OMX.k3.video.decoder.avc"
            r1.put(r4, r0)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = com.bykv.vk.component.ttvideo.player.AJMediaCodecRank.mTestHWCodecs
            java.lang.String r1 = "OMX.IMG.MSVDX.Decoder.AVC"
            r0.put(r1, r3)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = com.bykv.vk.component.ttvideo.player.AJMediaCodecRank.mTestHWCodecs
            java.lang.String r1 = "OMX.hisi.video.decoder.avc"
            r0.put(r1, r3)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = com.bykv.vk.component.ttvideo.player.AJMediaCodecRank.mTestHWCodecs
            java.lang.String r1 = "OMX.hisi.video.decoder.hevc"
            r0.put(r1, r3)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = com.bykv.vk.component.ttvideo.player.AJMediaCodecRank.mTestHWCodecs
            java.lang.String r1 = "OMX.MARVELL.VIDEO.H264DECODER"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = com.bykv.vk.component.ttvideo.player.AJMediaCodecRank.mTestHWCodecs
            java.lang.String r1 = "OMX.sprd.soft.h264.decoder"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = com.bykv.vk.component.ttvideo.player.AJMediaCodecRank.mTestHWCodecs
            return r0
    }

    public static com.bykv.vk.component.ttvideo.player.AJMediaCodecRank setupRank(android.media.MediaCodecInfo r3, java.lang.String r4) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = r3.getName()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto Lf
            return r0
        Lf:
            java.util.Map r0 = getTestHWcodecs()
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L20
            int r0 = r0.intValue()
            goto L2a
        L20:
            r0 = 60
            android.media.MediaCodecInfo$CodecCapabilities r1 = r3.getCapabilitiesForType(r4)     // Catch: java.lang.Exception -> L2a
            if (r1 == 0) goto L2a
            r0 = 70
        L2a:
            com.bykv.vk.component.ttvideo.player.AJMediaCodecRank r1 = new com.bykv.vk.component.ttvideo.player.AJMediaCodecRank
            r1.<init>()
            r1.mMediaCodecInfo = r3
            r1.mCodecType = r4
            r1.mRank = r0
            return r1
    }
}
