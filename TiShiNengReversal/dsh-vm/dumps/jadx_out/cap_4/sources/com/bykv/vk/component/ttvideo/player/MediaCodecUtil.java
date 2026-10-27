package com.bykv.vk.component.ttvideo.player;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class MediaCodecUtil {
    private static final java.util.Map<java.lang.String, java.lang.Integer> DOLBY_VISION_STRING_TO_LEVEL = null;
    private static final java.util.Map<java.lang.String, java.lang.Integer> DOLBY_VISION_STRING_TO_PROFILE = null;
    private static final java.util.regex.Pattern PROFILE_PATTERN = null;
    private static final java.lang.String TAG = "MediaCodecUtil";

    static {
            java.lang.String r0 = "^\\D?(\\d+)$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.bykv.vk.component.ttvideo.player.MediaCodecUtil.PROFILE_PATTERN = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.bykv.vk.component.ttvideo.player.MediaCodecUtil.DOLBY_VISION_STRING_TO_LEVEL = r0
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "01"
            r0.put(r2, r1)
            r3 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "02"
            r0.put(r4, r3)
            r5 = 4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "03"
            r0.put(r6, r5)
            r7 = 8
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r8 = "04"
            r0.put(r8, r7)
            r9 = 16
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r10 = "05"
            r0.put(r10, r9)
            r11 = 32
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r12 = "06"
            r0.put(r12, r11)
            r13 = 64
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.String r14 = "07"
            r0.put(r14, r13)
            r15 = 128(0x80, float:1.8E-43)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r16 = r14
            java.lang.String r14 = "08"
            r0.put(r14, r15)
            r17 = 256(0x100, float:3.59E-43)
            r18 = r14
            java.lang.Integer r14 = java.lang.Integer.valueOf(r17)
            r17 = r15
            java.lang.String r15 = "09"
            r0.put(r15, r14)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.bykv.vk.component.ttvideo.player.MediaCodecUtil.DOLBY_VISION_STRING_TO_PROFILE = r0
            r19 = r15
            java.lang.String r15 = "00"
            r0.put(r15, r1)
            r0.put(r2, r3)
            r0.put(r4, r5)
            r0.put(r6, r7)
            r0.put(r8, r9)
            r0.put(r10, r11)
            r0.put(r12, r13)
            r2 = r16
            r1 = r17
            r0.put(r2, r1)
            r1 = r18
            r0.put(r1, r14)
            r1 = 512(0x200, float:7.17E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = r19
            r0.put(r2, r1)
            return
    }

    public MediaCodecUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String getDolbyCodecs(int r2, int r3) {
            r0 = 4
            if (r2 == r0) goto L1a
            r0 = 5
            if (r2 == r0) goto L1a
            r0 = 7
            if (r2 != r0) goto La
            goto L1a
        La:
            r0 = 8
            if (r2 != r0) goto L11
            java.lang.String r0 = "hev1"
            goto L1c
        L11:
            r0 = 9
            if (r2 != r0) goto L18
            java.lang.String r0 = "avc3"
            goto L1c
        L18:
            r2 = 0
            return r2
        L1a:
            java.lang.String r0 = "dvhe"
        L1c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = ".0"
            r1.append(r0)
            r1.append(r2)
            r1.append(r0)
            r1.append(r3)
            java.lang.String r2 = r1.toString()
            return r2
    }

    public static android.util.Pair<java.lang.Integer, java.lang.Integer> getDolbyVisionProfileAndLevel(java.lang.String r6, java.lang.String[] r7) {
            int r0 = r7.length
            r1 = 3
            java.lang.String r2 = "Ignoring malformed Dolby Vision codec string: "
            r3 = 0
            java.lang.String r4 = "MediaCodecUtil"
            if (r0 >= r1) goto L15
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r6 = r2.concat(r6)
            com.bytedance.sdk.component.utils.vl.xt(r4, r6)
            return r3
        L15:
            java.util.regex.Pattern r0 = com.bykv.vk.component.ttvideo.player.MediaCodecUtil.PROFILE_PATTERN
            r1 = 1
            r5 = r7[r1]
            java.util.regex.Matcher r0 = r0.matcher(r5)
            boolean r5 = r0.matches()
            if (r5 != 0) goto L30
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r6 = r2.concat(r6)
            com.bytedance.sdk.component.utils.vl.xt(r4, r6)
            return r3
        L30:
            java.lang.String r6 = r0.group(r1)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = com.bykv.vk.component.ttvideo.player.MediaCodecUtil.DOLBY_VISION_STRING_TO_PROFILE
            java.lang.Object r0 = r0.get(r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L4c
            java.lang.String r7 = "Unknown Dolby Vision profile string: "
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r6 = r7.concat(r6)
            com.bytedance.sdk.component.utils.vl.xt(r4, r6)
            return r3
        L4c:
            r6 = 2
            r6 = r7[r6]
            java.util.Map<java.lang.String, java.lang.Integer> r7 = com.bykv.vk.component.ttvideo.player.MediaCodecUtil.DOLBY_VISION_STRING_TO_LEVEL
            java.lang.Object r7 = r7.get(r6)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 != 0) goto L67
            java.lang.String r7 = "Unknown Dolby Vision level string: "
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r6 = r7.concat(r6)
            com.bytedance.sdk.component.utils.vl.xt(r4, r6)
            return r3
        L67:
            android.util.Pair r6 = new android.util.Pair
            r6.<init>(r0, r7)
            return r6
    }
}
